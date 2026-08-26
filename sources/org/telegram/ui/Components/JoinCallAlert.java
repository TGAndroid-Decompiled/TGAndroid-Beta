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
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
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
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;
import org.telegram.ui.ReportBottomSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;

public class JoinCallAlert extends BottomSheet {
    public static final int TYPE_CREATE = 0;
    public static final int TYPE_DISPLAY = 2;
    public static final int TYPE_JOIN = 1;
    private static ArrayList<TLRPC.Peer> cachedChats;
    private static long lastCacheDid;
    private static long lastCacheTime;
    private static int lastCachedAccount;
    private boolean animationInProgress;
    private ArrayList<TLRPC.Peer> chats;
    private TLRPC.Peer currentPeer;
    private int currentType;
    private JoinCallAlertDelegate delegate;
    private BottomSheetCell doneButton;
    private boolean ignoreLayout;
    private RecyclerListView listView;
    private int[] location;
    private TextView messageTextView;
    private boolean schedule;
    private int scrollOffsetY;
    private TLRPC.InputPeer selectAfterDismiss;
    private TLRPC.Peer selectedPeer;
    private Drawable shadowDrawable;
    private TextView textView;

    public class BottomSheetCell extends FrameLayout {
        private View background;
        private boolean hasBackground;
        private CharSequence text;
        private TextView[] textView;

        public BottomSheetCell(Context context, boolean z) {
            super(context);
            this.textView = new TextView[2];
            this.hasBackground = !z;
            setBackground(null);
            View view = new View(context);
            this.background = view;
            if (this.hasBackground) {
                view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            }
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
            for (int i = 0; i < 2; i++) {
                this.textView[i] = new TextView(context);
                this.textView[i].setFocusable(false);
                this.textView[i].setLines(1);
                this.textView[i].setSingleLine(true);
                this.textView[i].setGravity(1);
                this.textView[i].setEllipsize(TextUtils.TruncateAt.END);
                this.textView[i].setGravity(17);
                if (this.hasBackground) {
                    this.textView[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    this.textView[i].setTypeface(AndroidUtilities.bold());
                } else {
                    this.textView[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                }
                this.textView[i].setImportantForAccessibility(2);
                this.textView[i].setTextSize(1, 14.0f);
                this.textView[i].setPadding(0, 0, 0, this.hasBackground ? 0 : AndroidUtilities.dp(13.0f));
                addView(this.textView[i], LayoutHelper.createFrame(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
                if (i == 1) {
                    this.textView[i].setAlpha(0.0f);
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            accessibilityNodeInfo.setClickable(true);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.hasBackground ? 80.0f : 50.0f), 1073741824));
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.text = charSequence;
            if (!z) {
                this.textView[0].setText(charSequence);
                return;
            }
            this.textView[1].setText(charSequence);
            JoinCallAlert.this.animationInProgress = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.textView[0], (Property<TextView, Float>) property, 1.0f, 0.0f);
            TextView textView = this.textView[0];
            float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr), ObjectAnimator.ofFloat(this.textView[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.textView[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    JoinCallAlert.this.animationInProgress = false;
                    TextView textView2 = BottomSheetCell.this.textView[0];
                    BottomSheetCell.this.textView[0] = BottomSheetCell.this.textView[1];
                    BottomSheetCell.this.textView[1] = textView2;
                }
            });
            animatorSet.start();
        }
    }

    public interface JoinCallAlertDelegate {
        void didSelectChat(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3);
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return JoinCallAlert.this.chats.size();
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object chat;
            String string;
            long peerId = MessageObject.getPeerId((TLRPC.Peer) JoinCallAlert.this.chats.get(i));
            if (peerId > 0) {
                chat = MessagesController.getInstance(((BottomSheet) JoinCallAlert.this).currentAccount).getUser(Long.valueOf(peerId));
                string = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                chat = MessagesController.getInstance(((BottomSheet) JoinCallAlert.this).currentAccount).getChat(Long.valueOf(-peerId));
                string = null;
            }
            if (JoinCallAlert.this.currentType == 0) {
                ((ShareDialogCell) viewHolder.itemView).setDialog(peerId, peerId == MessageObject.getPeerId(JoinCallAlert.this.selectedPeer), null);
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            boolean z = i != getItemCount() - 1;
            groupCreateUserCell.setObject(chat, null, string);
            groupCreateUserCell.drawDivider = z;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            if (JoinCallAlert.this.currentType == 0) {
                groupCreateUserCell = new ShareDialogCell(this.context, 2, null);
                groupCreateUserCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
            } else {
                groupCreateUserCell = new GroupCreateUserCell(2, 0, this.context, null, false, JoinCallAlert.this.currentType == 2);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            long j;
            viewHolder.getAdapterPosition();
            long peerId = MessageObject.getPeerId(JoinCallAlert.this.selectedPeer);
            View view = viewHolder.itemView;
            if (!(view instanceof GroupCreateUserCell)) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) view;
                shareDialogCell.setChecked(peerId == shareDialogCell.getCurrentDialog(), false);
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            Object object = groupCreateUserCell.getObject();
            if (object != null) {
                j = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id;
            } else {
                j = 0;
            }
            groupCreateUserCell.setChecked(peerId == j, false);
        }
    }

    private JoinCallAlert(Context context, long j, ArrayList<TLRPC.Peer> arrayList, int i, TLRPC.Peer peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        int color;
        ViewGroup viewGroup;
        boolean z;
        super(context, false, false, null);
        this.location = new int[2];
        setApplyBottomPadding(false);
        this.chats = new ArrayList<>(arrayList);
        this.delegate = joinCallAlertDelegate;
        this.currentType = i;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = this.chats.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Peer peer2 = this.chats.get(i2);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        this.currentPeer = peer2;
                        this.selectedPeer = peer2;
                        break;
                    }
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = this.chats.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.Peer peer3 = this.chats.get(i3);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        this.currentPeer = peer3;
                        this.selectedPeer = peer3;
                        break;
                    }
                }
            } else {
                this.selectedPeer = this.chats.get(0);
            }
            Drawable drawable = this.shadowDrawable;
            color = Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false);
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        } else {
            color = Theme.getColor(null, Theme.key_dialogBackground, false);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            this.selectedPeer = this.chats.get(0);
        }
        fixNavigationBar(color);
        if (this.currentType == 0) {
            LinearLayout linearLayout = new LinearLayout(context) {
                boolean sorted;

                @Override
                public void onMeasure(int i4, int i5) {
                    if (JoinCallAlert.this.currentType == 0) {
                        int size3 = View.MeasureSpec.getSize(i4);
                        int iDp = AndroidUtilities.dp(95.0f) * JoinCallAlert.this.chats.size();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) JoinCallAlert.this.listView.getLayoutParams();
                        if (iDp > size3) {
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
                                    int iMax = JoinCallAlert.this.chats.size() % 2 == 0 ? Math.max(0, (JoinCallAlert.this.chats.size() / 2) - 1) : JoinCallAlert.this.chats.size() / 2;
                                    JoinCallAlert.this.chats.remove(JoinCallAlert.this.selectedPeer);
                                    JoinCallAlert.this.chats.add(iMax, JoinCallAlert.this.selectedPeer);
                                }
                                this.sorted = true;
                            }
                        }
                    }
                    super.onMeasure(i4, i5);
                }
            };
            linearLayout.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context, null);
            nestedScrollView.addView(linearLayout);
            setCustomView(nestedScrollView);
            viewGroup = linearLayout;
        } else {
            FrameLayout frameLayout = new FrameLayout(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    JoinCallAlert.this.shadowDrawable.setBounds(0, JoinCallAlert.this.scrollOffsetY - ((BottomSheet) JoinCallAlert.this).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                    JoinCallAlert.this.shadowDrawable.draw(canvas);
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0 || JoinCallAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= JoinCallAlert.this.scrollOffsetY) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    JoinCallAlert.this.lambda$showGiftOfferSheet$15();
                    return true;
                }

                @Override
                public void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                    super.onLayout(z2, i4, i5, i6, i7);
                    JoinCallAlert.this.updateLayout();
                }

                @Override
                public void onMeasure(int i4, int i5) {
                    int size3 = View.MeasureSpec.getSize(i5) - AndroidUtilities.statusBarHeight;
                    measureChildWithMargins(JoinCallAlert.this.messageTextView, i4, 0, i5, 0);
                    int measuredHeight = JoinCallAlert.this.messageTextView.getMeasuredHeight();
                    ((FrameLayout.LayoutParams) JoinCallAlert.this.listView.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
                    getMeasuredWidth();
                    int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(55.0f, ((BottomSheet) JoinCallAlert.this).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(58.0f, JoinCallAlert.this.chats.size(), AndroidUtilities.dp(80.0f)), measuredHeight);
                    int i6 = size3 / 5;
                    int i7 = iM < i6 * 3 ? size3 - iM : i6 * 2;
                    if (JoinCallAlert.this.listView.getPaddingTop() != i7) {
                        JoinCallAlert.this.ignoreLayout = true;
                        JoinCallAlert.this.listView.setPadding(0, i7, 0, 0);
                        JoinCallAlert.this.ignoreLayout = false;
                    }
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return !JoinCallAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
                }

                @Override
                public void requestLayout() {
                    if (JoinCallAlert.this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.containerView = frameLayout;
            frameLayout.setWillNotDraw(false);
            ViewGroup viewGroup2 = this.containerView;
            int i4 = this.backgroundPaddingLeft;
            viewGroup2.setPadding(i4, 0, i4, 0);
            viewGroup = frameLayout;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void requestLayout() {
                if (JoinCallAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = recyclerListView;
        getContext();
        recyclerListView.setLayoutManager(new LinearLayoutManager(this.currentType == 0 ? 0 : 1, false));
        this.listView.setAdapter(new ListAdapter(context));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        this.listView.setEnabled(true);
        this.listView.setSelectorDrawableColor(0);
        this.listView.setGlowColor(Theme.getColor(null, Theme.key_dialogScrollGlow, false));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                JoinCallAlert.this.updateLayout();
            }
        });
        this.listView.setOnItemClickListener(new JoinCallAlert$$ExternalSyntheticLambda5(this, chat, 0));
        if (i != 0) {
            viewGroup.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            this.listView.setSelectorDrawableColor(0);
            this.listView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i == 0) {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_schedule, 120, 120);
            rLottieImageView.playAnimation();
            viewGroup.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.textView.setTextSize(1, 20.0f);
        if (i == 2) {
            this.textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        } else {
            this.textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        }
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                this.textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                this.textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(this.textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                this.textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                this.textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                this.textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(getContext());
        this.messageTextView = textView2;
        if (i == 2) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
        } else {
            textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        }
        this.messageTextView.setTextSize(1, 14.0f);
        int size3 = this.chats.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                z = false;
                break;
            }
            long peerId2 = MessageObject.getPeerId(this.chats.get(i5));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z = true;
                    break;
                }
            }
            i5++;
        }
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (this.chats.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                this.listView.setVisibility(8);
            }
            this.messageTextView.setText(sb);
            this.messageTextView.setGravity(49);
            viewGroup.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z) {
                this.messageTextView.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                this.messageTextView.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            this.messageTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(this.messageTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            viewGroup.addView(this.listView, LayoutHelper.createLinear(this.chats.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context, false);
        this.doneButton = bottomSheetCell;
        bottomSheetCell.background.setOnClickListener(new UndoView$$ExternalSyntheticLambda6(2, this, joinCallAlertDelegate));
        if (this.currentType == 0) {
            viewGroup.addView(this.doneButton, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
            BottomSheetCell bottomSheetCell2 = new BottomSheetCell(context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                bottomSheetCell2.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                bottomSheetCell2.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            bottomSheetCell2.background.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 1));
            viewGroup.addView(bottomSheetCell2, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(this.doneButton, LayoutHelper.createFrame(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        updateDoneButton(false, chat);
    }

    public static void checkFewUsers(Context context, final long j, final AccountInstance accountInstance, final MessagesStorage.BooleanCallback booleanCallback) {
        if (lastCachedAccount == accountInstance.getCurrentAccount() && lastCacheDid == j && cachedChats != null && SystemClock.elapsedRealtime() - lastCacheTime < 240000) {
            booleanCallback.run(cachedChats.size() == 1);
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(context, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j);
        alertDialog.setOnCancelListener(new JoinCallAlert$$ExternalSyntheticLambda1(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                JoinCallAlert.lambda$checkFewUsers$1(alertDialog, j, accountInstance, booleanCallback, tLObject, tL_error);
            }
        }), 1));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        try {
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        } catch (Exception unused) {
        }
    }

    public static void lambda$checkFewUsers$0(AlertDialog alertDialog, TLObject tLObject, long j, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
            cachedChats = joinaspeers.peers;
            lastCacheDid = j;
            lastCacheTime = SystemClock.elapsedRealtime();
            lastCachedAccount = accountInstance.getCurrentAccount();
            accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
            accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
            booleanCallback.run(joinaspeers.peers.size() == 1);
        }
    }

    public static void lambda$checkFewUsers$1(AlertDialog alertDialog, long j, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(alertDialog, tLObject, j, accountInstance, booleanCallback, 6));
    }

    public static void lambda$checkFewUsers$2(AccountInstance accountInstance, int i, DialogInterface dialogInterface) {
        accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$new$6(TLRPC.Chat chat, View view, int i) {
        if (this.animationInProgress || this.chats.get(i) == this.selectedPeer) {
            return;
        }
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
            updateDoneButton(true, chat);
        }
    }

    public void lambda$new$7(JoinCallAlertDelegate joinCallAlertDelegate, View view) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        if (this.currentType != 2) {
            this.selectAfterDismiss = inputPeer;
        } else if (this.selectedPeer != this.currentPeer) {
            joinCallAlertDelegate.didSelectChat(inputPeer, this.chats.size() > 1, false, false);
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$8(View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        this.schedule = true;
        lambda$showGiftOfferSheet$15();
    }

    public static void lambda$open$3(AlertDialog alertDialog, TLObject tLObject, AccountInstance accountInstance, JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
            if (joinaspeers.peers.size() == 1) {
                joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                return;
            }
            cachedChats = joinaspeers.peers;
            lastCacheDid = j;
            lastCacheTime = SystemClock.elapsedRealtime();
            lastCachedAccount = accountInstance.getCurrentAccount();
            accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
            accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
            showAlert(context, j, joinaspeers.peers, baseFragment, i, peer, joinCallAlertDelegate);
        }
    }

    public static void lambda$open$4(AlertDialog alertDialog, AccountInstance accountInstance, JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new BotShareSheet$$ExternalSyntheticLambda4(alertDialog, tLObject, accountInstance, joinCallAlertDelegate, j, context, baseFragment, i, peer));
    }

    public static void lambda$open$5(AccountInstance accountInstance, int i, DialogInterface dialogInterface) {
        accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public static void open(Context context, long j, AccountInstance accountInstance, BaseFragment baseFragment, int i, TLRPC.Peer peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        if (context == null || joinCallAlertDelegate == null) {
            return;
        }
        if (lastCachedAccount == accountInstance.getCurrentAccount() && lastCacheDid == j && cachedChats != null && SystemClock.elapsedRealtime() - lastCacheTime < 300000) {
            if (cachedChats.size() != 1 || i == 0) {
                showAlert(context, j, cachedChats, baseFragment, i, peer, joinCallAlertDelegate);
                return;
            } else {
                joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(cachedChats.get(0))), false, false, false);
                return;
            }
        }
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j);
        alertDialog.setOnCancelListener(new JoinCallAlert$$ExternalSyntheticLambda1(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ReportBottomSheet$$ExternalSyntheticLambda9(alertDialog, accountInstance, joinCallAlertDelegate, j, context, baseFragment, i, peer)), 0));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        try {
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        } catch (Exception unused) {
        }
    }

    public static void processDeletedChat(int i, long j) {
        ArrayList<TLRPC.Peer> arrayList;
        if (lastCachedAccount != i || (arrayList = cachedChats) == null || j > 0) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (MessageObject.getPeerId(cachedChats.get(i2)) == j) {
                cachedChats.remove(i2);
                break;
            }
        }
        if (cachedChats.isEmpty()) {
            cachedChats = null;
        }
    }

    public static void resetCache() {
        cachedChats = null;
    }

    private static void showAlert(Context context, long j, ArrayList<TLRPC.Peer> arrayList, BaseFragment baseFragment, int i, TLRPC.Peer peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        if (i == 0) {
            CreateGroupCallBottomSheet.show(arrayList, baseFragment, j, joinCallAlertDelegate);
            return;
        }
        JoinCallAlert joinCallAlert = new JoinCallAlert(context, j, arrayList, i, peer, joinCallAlertDelegate);
        if (baseFragment == null) {
            joinCallAlert.show();
        } else if (baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(joinCallAlert);
        }
    }

    private void updateDoneButton(boolean z, TLRPC.Chat chat) {
        if (this.currentType == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                this.doneButton.setText(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z);
                return;
            } else {
                this.doneButton.setText(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.selectedPeer);
        if (DialogObject.isUserDialog(peerId)) {
            this.doneButton.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            this.doneButton.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z);
        }
    }

    public void updateLayout() {
        if (this.currentType == 0) {
            return;
        }
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
            this.messageTextView.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            this.containerView.invalidate();
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.selectAfterDismiss;
        if (inputPeer != null) {
            this.delegate.didSelectChat(inputPeer, this.chats.size() > 1, this.schedule, false);
        }
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
