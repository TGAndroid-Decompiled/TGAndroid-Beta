package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_phone_getGroupCallJoinAs;
import org.telegram.tgnet.TLRPC$TL_phone_joinAsPeers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.RecyclerListView;

public class JoinCallAlert extends BottomSheet {
    private static ArrayList<TLRPC$Peer> cachedChats;
    private static long lastCacheDid;
    private static long lastCacheTime;
    private static int lastCachedAccount;
    private boolean animationInProgress;
    private ArrayList<TLRPC$Peer> chats;
    private TLRPC$Peer currentPeer;
    private int currentType;
    private JoinCallAlertDelegate delegate;
    private BottomSheetCell doneButton;
    private boolean ignoreLayout;
    private RecyclerListView listView;
    private TextView messageTextView;
    private boolean schedule;
    private int scrollOffsetY;
    private TLRPC$InputPeer selectAfterDismiss;
    private TLRPC$Peer selectedPeer;
    private Drawable shadowDrawable;
    private TextView textView;

    public interface JoinCallAlertDelegate {
        void didSelectChat(TLRPC$InputPeer tLRPC$InputPeer, boolean z, boolean z2);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public static void resetCache() {
        cachedChats = null;
    }

    public static void processDeletedChat(int i, long j) {
        ArrayList<TLRPC$Peer> arrayList;
        if (lastCachedAccount == i && (arrayList = cachedChats) != null && j <= 0) {
            int i2 = 0;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (MessageObject.getPeerId(cachedChats.get(i2)) == j) {
                    cachedChats.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (cachedChats.isEmpty()) {
                cachedChats = null;
            }
        }
    }

    public class BottomSheetCell extends FrameLayout {
        private View background;
        private boolean hasBackground;
        private TextView[] textView = new TextView[2];

        public BottomSheetCell(Context context, boolean z) {
            super(context);
            this.hasBackground = !z;
            setBackground(null);
            View view = new View(context);
            this.background = view;
            if (this.hasBackground) {
                view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.getColor("featuredStickers_addButton"), Theme.getColor("featuredStickers_addButtonPressed")));
            }
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
            for (int i = 0; i < 2; i++) {
                this.textView[i] = new TextView(context);
                this.textView[i].setLines(1);
                this.textView[i].setSingleLine(true);
                this.textView[i].setGravity(1);
                this.textView[i].setEllipsize(TextUtils.TruncateAt.END);
                this.textView[i].setGravity(17);
                if (this.hasBackground) {
                    this.textView[i].setTextColor(Theme.getColor("featuredStickers_buttonText"));
                    this.textView[i].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else {
                    this.textView[i].setTextColor(Theme.getColor("featuredStickers_addButton"));
                }
                this.textView[i].setTextSize(1, 14.0f);
                this.textView[i].setPadding(0, 0, 0, this.hasBackground ? 0 : AndroidUtilities.dp(13.0f));
                addView(this.textView[i], LayoutHelper.createFrame(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
                if (i == 1) {
                    this.textView[i].setAlpha(0.0f);
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.hasBackground ? 80.0f : 50.0f), 1073741824));
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (!z) {
                this.textView[0].setText(charSequence);
                return;
            }
            this.textView[1].setText(charSequence);
            JoinCallAlert.this.animationInProgress = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.textView[0], View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.textView[0], View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(this.textView[1], View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.textView[1], View.TRANSLATION_Y, AndroidUtilities.dp(10.0f), 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    JoinCallAlert.this.animationInProgress = false;
                    TextView textView = BottomSheetCell.this.textView[0];
                    BottomSheetCell.this.textView[0] = BottomSheetCell.this.textView[1];
                    BottomSheetCell.this.textView[1] = textView;
                }
            });
            animatorSet.start();
        }
    }

    public static void checkFewUsers(Context context, final long j, final AccountInstance accountInstance, final MessagesStorage.BooleanCallback booleanCallback) {
        if (lastCachedAccount != accountInstance.getCurrentAccount() || lastCacheDid != j || cachedChats == null || SystemClock.elapsedRealtime() - lastCacheTime >= 240000) {
            final AlertDialog alertDialog = new AlertDialog(context, 3);
            TLRPC$TL_phone_getGroupCallJoinAs tLRPC$TL_phone_getGroupCallJoinAs = new TLRPC$TL_phone_getGroupCallJoinAs();
            tLRPC$TL_phone_getGroupCallJoinAs.peer = accountInstance.getMessagesController().getInputPeer(j);
            final int sendRequest = accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_getGroupCallJoinAs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    JoinCallAlert.lambda$checkFewUsers$1(AlertDialog.this, j, accountInstance, booleanCallback, tLObject, tLRPC$TL_error);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    JoinCallAlert.lambda$checkFewUsers$2(AccountInstance.this, sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.showDelayed(500L);
            } catch (Exception unused) {
            }
        } else {
            boolean z = true;
            if (cachedChats.size() != 1) {
                z = false;
            }
            booleanCallback.run(z);
        }
    }

    public static void lambda$checkFewUsers$1(final AlertDialog alertDialog, final long j, final AccountInstance accountInstance, final MessagesStorage.BooleanCallback booleanCallback, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinCallAlert.lambda$checkFewUsers$0(AlertDialog.this, tLObject, j, accountInstance, booleanCallback);
            }
        });
    }

    public static void lambda$checkFewUsers$0(AlertDialog alertDialog, TLObject tLObject, long j, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            TLRPC$TL_phone_joinAsPeers tLRPC$TL_phone_joinAsPeers = (TLRPC$TL_phone_joinAsPeers) tLObject;
            cachedChats = tLRPC$TL_phone_joinAsPeers.peers;
            lastCacheDid = j;
            lastCacheTime = SystemClock.elapsedRealtime();
            lastCachedAccount = accountInstance.getCurrentAccount();
            boolean z = false;
            accountInstance.getMessagesController().putChats(tLRPC$TL_phone_joinAsPeers.chats, false);
            accountInstance.getMessagesController().putUsers(tLRPC$TL_phone_joinAsPeers.users, false);
            if (tLRPC$TL_phone_joinAsPeers.peers.size() == 1) {
                z = true;
            }
            booleanCallback.run(z);
        }
    }

    public static void lambda$checkFewUsers$2(AccountInstance accountInstance, int i, DialogInterface dialogInterface) {
        accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public static void open(final Context context, final long j, final AccountInstance accountInstance, final BaseFragment baseFragment, final int i, final TLRPC$Peer tLRPC$Peer, final JoinCallAlertDelegate joinCallAlertDelegate) {
        if (context != null && joinCallAlertDelegate != null) {
            if (lastCachedAccount != accountInstance.getCurrentAccount() || lastCacheDid != j || cachedChats == null || SystemClock.elapsedRealtime() - lastCacheTime >= 300000) {
                final AlertDialog alertDialog = new AlertDialog(context, 3);
                TLRPC$TL_phone_getGroupCallJoinAs tLRPC$TL_phone_getGroupCallJoinAs = new TLRPC$TL_phone_getGroupCallJoinAs();
                tLRPC$TL_phone_getGroupCallJoinAs.peer = accountInstance.getMessagesController().getInputPeer(j);
                final int sendRequest = accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_getGroupCallJoinAs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        JoinCallAlert.lambda$open$4(AlertDialog.this, accountInstance, joinCallAlertDelegate, j, context, baseFragment, i, tLRPC$Peer, tLObject, tLRPC$TL_error);
                    }
                });
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        JoinCallAlert.lambda$open$5(AccountInstance.this, sendRequest, dialogInterface);
                    }
                });
                try {
                    alertDialog.showDelayed(500L);
                } catch (Exception unused) {
                }
            } else if (cachedChats.size() != 1 || i == 0) {
                showAlert(context, j, cachedChats, baseFragment, i, tLRPC$Peer, joinCallAlertDelegate);
            } else {
                joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(cachedChats.get(0))), false, false);
            }
        }
    }

    public static void lambda$open$4(final AlertDialog alertDialog, final AccountInstance accountInstance, final JoinCallAlertDelegate joinCallAlertDelegate, final long j, final Context context, final BaseFragment baseFragment, final int i, final TLRPC$Peer tLRPC$Peer, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinCallAlert.lambda$open$3(AlertDialog.this, tLObject, accountInstance, joinCallAlertDelegate, j, context, baseFragment, i, tLRPC$Peer);
            }
        });
    }

    public static void lambda$open$3(AlertDialog alertDialog, TLObject tLObject, AccountInstance accountInstance, JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC$Peer tLRPC$Peer) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            TLRPC$TL_phone_joinAsPeers tLRPC$TL_phone_joinAsPeers = (TLRPC$TL_phone_joinAsPeers) tLObject;
            if (tLRPC$TL_phone_joinAsPeers.peers.size() == 1) {
                joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(tLRPC$TL_phone_joinAsPeers.peers.get(0))), false, false);
                return;
            }
            cachedChats = tLRPC$TL_phone_joinAsPeers.peers;
            lastCacheDid = j;
            lastCacheTime = SystemClock.elapsedRealtime();
            lastCachedAccount = accountInstance.getCurrentAccount();
            accountInstance.getMessagesController().putChats(tLRPC$TL_phone_joinAsPeers.chats, false);
            accountInstance.getMessagesController().putUsers(tLRPC$TL_phone_joinAsPeers.users, false);
            showAlert(context, j, tLRPC$TL_phone_joinAsPeers.peers, baseFragment, i, tLRPC$Peer, joinCallAlertDelegate);
        }
    }

    public static void lambda$open$5(AccountInstance accountInstance, int i, DialogInterface dialogInterface) {
        accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    private static void showAlert(Context context, long j, ArrayList<TLRPC$Peer> arrayList, BaseFragment baseFragment, int i, TLRPC$Peer tLRPC$Peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        JoinCallAlert joinCallAlert = new JoinCallAlert(context, j, arrayList, i, tLRPC$Peer, joinCallAlertDelegate);
        if (baseFragment == null) {
            joinCallAlert.show();
        } else if (baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(joinCallAlert);
        }
    }

    private JoinCallAlert(Context context, long j, ArrayList<TLRPC$Peer> arrayList, int i, TLRPC$Peer tLRPC$Peer, final JoinCallAlertDelegate joinCallAlertDelegate) {
        super(context, false);
        FrameLayout frameLayout;
        boolean z;
        setApplyBottomPadding(false);
        this.chats = new ArrayList<>(arrayList);
        this.delegate = joinCallAlertDelegate;
        this.currentType = i;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = this.chats.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    TLRPC$Peer tLRPC$Peer2 = this.chats.get(i2);
                    if (MessageObject.getPeerId(tLRPC$Peer2) == selfId) {
                        this.currentPeer = tLRPC$Peer2;
                        this.selectedPeer = tLRPC$Peer2;
                        break;
                    }
                    i2++;
                }
            } else if (tLRPC$Peer != null) {
                long peerId = MessageObject.getPeerId(tLRPC$Peer);
                int size2 = this.chats.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    TLRPC$Peer tLRPC$Peer3 = this.chats.get(i3);
                    if (MessageObject.getPeerId(tLRPC$Peer3) == peerId) {
                        this.currentPeer = tLRPC$Peer3;
                        this.selectedPeer = tLRPC$Peer3;
                        break;
                    }
                    i3++;
                }
            } else {
                this.selectedPeer = this.chats.get(0);
            }
            this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("voipgroup_inviteMembersBackground"), PorterDuff.Mode.MULTIPLY));
        } else {
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
            this.selectedPeer = this.chats.get(0);
        }
        if (this.currentType == 0) {
            LinearLayout linearLayout = new LinearLayout(context) {
                boolean sorted;

                @Override
                protected void onMeasure(int i4, int i5) {
                    if (JoinCallAlert.this.currentType == 0) {
                        int size3 = View.MeasureSpec.getSize(i4);
                        int size4 = JoinCallAlert.this.chats.size() * AndroidUtilities.dp(95.0f);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) JoinCallAlert.this.listView.getLayoutParams();
                        if (size4 > size3) {
                            layoutParams.width = -1;
                            layoutParams.gravity = 51;
                            if (!this.sorted) {
                                if (JoinCallAlert.this.selectedPeer != null) {
                                    JoinCallAlert.this.chats.remove(JoinCallAlert.this.selectedPeer);
                                    JoinCallAlert.this.chats.add(0, JoinCallAlert.this.selectedPeer);
                                }
                                this.sorted = true;
                            }
                        } else {
                            layoutParams.width = -2;
                            layoutParams.gravity = 49;
                            if (!this.sorted) {
                                if (JoinCallAlert.this.selectedPeer != null) {
                                    int max = JoinCallAlert.this.chats.size() % 2 == 0 ? Math.max(0, (JoinCallAlert.this.chats.size() / 2) - 1) : JoinCallAlert.this.chats.size() / 2;
                                    JoinCallAlert.this.chats.remove(JoinCallAlert.this.selectedPeer);
                                    JoinCallAlert.this.chats.add(max, JoinCallAlert.this.selectedPeer);
                                }
                                this.sorted = true;
                            }
                        }
                    }
                    super.onMeasure(i4, i5);
                }
            };
            linearLayout.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(linearLayout);
            setCustomView(nestedScrollView);
            frameLayout = linearLayout;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0 || JoinCallAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= JoinCallAlert.this.scrollOffsetY) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    JoinCallAlert.this.dismiss();
                    return true;
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return !JoinCallAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
                }

                @Override
                protected void onMeasure(int i4, int i5) {
                    int size3 = View.MeasureSpec.getSize(i5);
                    if (Build.VERSION.SDK_INT >= 21) {
                        size3 -= AndroidUtilities.statusBarHeight;
                    }
                    measureChildWithMargins(JoinCallAlert.this.messageTextView, i4, 0, i5, 0);
                    int measuredHeight = JoinCallAlert.this.messageTextView.getMeasuredHeight();
                    ((FrameLayout.LayoutParams) JoinCallAlert.this.listView.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
                    getMeasuredWidth();
                    int dp = AndroidUtilities.dp(80.0f) + (JoinCallAlert.this.chats.size() * AndroidUtilities.dp(58.0f)) + ((BottomSheet) JoinCallAlert.this).backgroundPaddingTop + AndroidUtilities.dp(55.0f) + measuredHeight;
                    int i6 = size3 / 5;
                    int i7 = dp < i6 * 3 ? size3 - dp : i6 * 2;
                    if (JoinCallAlert.this.listView.getPaddingTop() != i7) {
                        JoinCallAlert.this.ignoreLayout = true;
                        JoinCallAlert.this.listView.setPadding(0, i7, 0, 0);
                        JoinCallAlert.this.ignoreLayout = false;
                    }
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                }

                @Override
                protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                    super.onLayout(z2, i4, i5, i6, i7);
                    JoinCallAlert.this.updateLayout();
                }

                @Override
                public void requestLayout() {
                    if (!JoinCallAlert.this.ignoreLayout) {
                        super.requestLayout();
                    }
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    JoinCallAlert.this.shadowDrawable.setBounds(0, JoinCallAlert.this.scrollOffsetY - ((BottomSheet) JoinCallAlert.this).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                    JoinCallAlert.this.shadowDrawable.draw(canvas);
                }
            };
            this.containerView = frameLayout2;
            frameLayout2.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i4 = this.backgroundPaddingLeft;
            viewGroup.setPadding(i4, 0, i4, 0);
            frameLayout = frameLayout2;
        }
        final TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void requestLayout() {
                if (!JoinCallAlert.this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(getContext(), this.currentType == 0 ? 0 : 1, false));
        this.listView.setAdapter(new ListAdapter(context));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        this.listView.setEnabled(true);
        this.listView.setSelectorDrawableColor(0);
        this.listView.setGlowColor(Theme.getColor("dialogScrollGlow"));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                JoinCallAlert.this.updateLayout();
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                JoinCallAlert.this.lambda$new$6(chat, view, i5);
            }
        });
        if (i != 0) {
            frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            this.listView.setSelectorDrawableColor(0);
            this.listView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i == 0) {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_schedule, 120, 120);
            rLottieImageView.playAnimation();
            frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.textView.setTextSize(1, 20.0f);
        if (i == 2) {
            this.textView.setTextColor(Theme.getColor("voipgroup_nameText"));
        } else {
            this.textView.setTextColor(Theme.getColor("dialogTextBlack"));
        }
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                this.textView.setText(LocaleController.getString("StartVoipChannelTitle", R.string.StartVoipChannelTitle));
            } else {
                this.textView.setText(LocaleController.getString("StartVoipChatTitle", R.string.StartVoipChatTitle));
            }
            frameLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                this.textView.setText(LocaleController.getString("VoipGroupDisplayAs", R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                this.textView.setText(LocaleController.getString("VoipChannelJoinAs", R.string.VoipChannelJoinAs));
            } else {
                this.textView.setText(LocaleController.getString("VoipGroupJoinAs", R.string.VoipGroupJoinAs));
            }
            frameLayout.addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(getContext());
        this.messageTextView = textView2;
        if (i == 2) {
            textView2.setTextColor(Theme.getColor("voipgroup_lastSeenText"));
        } else {
            textView2.setTextColor(Theme.getColor("dialogTextGray3"));
        }
        this.messageTextView.setTextSize(1, 14.0f);
        int size3 = this.chats.size();
        for (int i5 = 0; i5 < size3; i5++) {
            long peerId2 = MessageObject.getPeerId(this.chats.get(i5));
            if (peerId2 < 0) {
                TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(Theme.getColor("dialogTextLink"));
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb.append(LocaleController.getString("VoipGroupStart2", R.string.VoipGroupStart2));
            } else {
                sb.append(LocaleController.getString("VoipChannelStart2", R.string.VoipChannelStart2));
            }
            if (this.chats.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString("VoipChatDisplayedAs", R.string.VoipChatDisplayedAs));
            } else {
                this.listView.setVisibility(8);
            }
            this.messageTextView.setText(sb);
            this.messageTextView.setGravity(49);
            frameLayout.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z) {
                this.messageTextView.setText(LocaleController.getString("VoipGroupStartAsInfoGroup", R.string.VoipGroupStartAsInfoGroup));
            } else {
                this.messageTextView.setText(LocaleController.getString("VoipGroupStartAsInfo", R.string.VoipGroupStartAsInfo));
            }
            this.messageTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            frameLayout.addView(this.messageTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            frameLayout.addView(this.listView, LayoutHelper.createLinear(this.chats.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context, false);
        this.doneButton = bottomSheetCell;
        bottomSheetCell.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinCallAlert.this.lambda$new$7(joinCallAlertDelegate, view);
            }
        });
        if (this.currentType == 0) {
            frameLayout.addView(this.doneButton, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
            BottomSheetCell bottomSheetCell2 = new BottomSheetCell(context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                bottomSheetCell2.setText(LocaleController.getString("VoipChannelScheduleVoiceChat", R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                bottomSheetCell2.setText(LocaleController.getString("VoipGroupScheduleVoiceChat", R.string.VoipGroupScheduleVoiceChat), false);
            }
            bottomSheetCell2.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    JoinCallAlert.this.lambda$new$8(view);
                }
            });
            frameLayout.addView(bottomSheetCell2, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
        } else {
            frameLayout.addView(this.doneButton, LayoutHelper.createFrame(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        updateDoneButton(false, chat);
    }

    public void lambda$new$6(TLRPC$Chat tLRPC$Chat, View view, int i) {
        if (!(this.animationInProgress || this.chats.get(i) == this.selectedPeer)) {
            this.selectedPeer = this.chats.get(i);
            boolean z = view instanceof GroupCreateUserCell;
            if (z) {
                ((GroupCreateUserCell) view).setChecked(true, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(true, true);
                view.invalidate();
            }
            int childCount = this.listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.listView.getChildAt(i2);
                if (childAt != view) {
                    if (z) {
                        ((GroupCreateUserCell) childAt).setChecked(false, true);
                    } else if (view instanceof ShareDialogCell) {
                        ((ShareDialogCell) childAt).setChecked(false, true);
                    }
                }
            }
            if (this.currentType != 0) {
                updateDoneButton(true, tLRPC$Chat);
            }
        }
    }

    public void lambda$new$7(JoinCallAlertDelegate joinCallAlertDelegate, View view) {
        TLRPC$InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        if (this.currentType != 2) {
            this.selectAfterDismiss = inputPeer;
        } else if (this.selectedPeer != this.currentPeer) {
            boolean z = true;
            if (this.chats.size() <= 1) {
                z = false;
            }
            joinCallAlertDelegate.didSelectChat(inputPeer, z, false);
        }
        dismiss();
    }

    public void lambda$new$8(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        this.schedule = true;
        dismiss();
    }

    private void updateDoneButton(boolean z, TLRPC$Chat tLRPC$Chat) {
        if (this.currentType != 0) {
            long peerId = MessageObject.getPeerId(this.selectedPeer);
            if (DialogObject.isUserDialog(peerId)) {
                this.doneButton.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z);
                return;
            }
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            BottomSheetCell bottomSheetCell = this.doneButton;
            Object[] objArr = new Object[1];
            objArr[0] = chat != null ? chat.title : "";
            bottomSheetCell.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, objArr), z);
        } else if (ChatObject.isChannelOrGiga(tLRPC$Chat)) {
            this.doneButton.setText(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z);
        } else {
            this.doneButton.setText(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z);
        }
    }

    public void updateLayout() {
        if (this.currentType != 0) {
            if (this.listView.getChildCount() <= 0) {
                RecyclerListView recyclerListView = this.listView;
                int paddingTop = recyclerListView.getPaddingTop();
                this.scrollOffsetY = paddingTop;
                recyclerListView.setTopGlowOffset(paddingTop);
                this.containerView.invalidate();
                return;
            }
            int i = 0;
            View childAt = this.listView.getChildAt(0);
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && holder != null && holder.getAdapterPosition() == 0) {
                i = top;
            }
            if (this.scrollOffsetY != i) {
                this.textView.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                this.messageTextView.setTranslationY(top + AndroidUtilities.dp(56.0f));
                RecyclerListView recyclerListView2 = this.listView;
                this.scrollOffsetY = i;
                recyclerListView2.setTopGlowOffset(i);
                this.containerView.invalidate();
            }
        }
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        TLRPC$InputPeer tLRPC$InputPeer = this.selectAfterDismiss;
        if (tLRPC$InputPeer != null) {
            JoinCallAlertDelegate joinCallAlertDelegate = this.delegate;
            boolean z = true;
            if (this.chats.size() <= 1) {
                z = false;
            }
            joinCallAlertDelegate.didSelectChat(tLRPC$InputPeer, z, this.schedule);
        }
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return JoinCallAlert.this.chats.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (JoinCallAlert.this.currentType == 0) {
                view = new ShareDialogCell(this.context, 2, null);
                view.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
            } else {
                view = new GroupCreateUserCell(this.context, 2, 0, false, JoinCallAlert.this.currentType == 2);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            viewHolder.getAdapterPosition();
            long peerId = MessageObject.getPeerId(JoinCallAlert.this.selectedPeer);
            View view = viewHolder.itemView;
            boolean z = true;
            if (view instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                long j = 0;
                if (object != null) {
                    if (object instanceof TLRPC$Chat) {
                        j = -((TLRPC$Chat) object).id;
                    } else {
                        j = ((TLRPC$User) object).id;
                    }
                }
                if (peerId != j) {
                    z = false;
                }
                groupCreateUserCell.setChecked(z, false);
                return;
            }
            ShareDialogCell shareDialogCell = (ShareDialogCell) view;
            if (peerId != shareDialogCell.getCurrentDialog()) {
                z = false;
            }
            shareDialogCell.setChecked(z, false);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            TLObject tLObject;
            long peerId = MessageObject.getPeerId((TLRPC$Peer) JoinCallAlert.this.chats.get(i));
            if (peerId > 0) {
                tLObject = MessagesController.getInstance(((BottomSheet) JoinCallAlert.this).currentAccount).getUser(Long.valueOf(peerId));
                str = LocaleController.getString("VoipGroupPersonalAccount", R.string.VoipGroupPersonalAccount);
            } else {
                tLObject = MessagesController.getInstance(((BottomSheet) JoinCallAlert.this).currentAccount).getChat(Long.valueOf(-peerId));
                str = null;
            }
            boolean z = false;
            if (JoinCallAlert.this.currentType == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                if (peerId == MessageObject.getPeerId(JoinCallAlert.this.selectedPeer)) {
                    z = true;
                }
                shareDialogCell.setDialog(peerId, z, null);
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            if (i != getItemCount() - 1) {
                z = true;
            }
            groupCreateUserCell.setObject(tLObject, null, str, z);
        }
    }
}
