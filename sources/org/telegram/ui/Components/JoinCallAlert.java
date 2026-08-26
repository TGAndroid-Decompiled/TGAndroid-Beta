package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.KeepMediaPopupView;
import org.telegram.ui.ReportBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda162;

public final class JoinCallAlert extends BottomSheet {
    public static ArrayList cachedChats;
    public static long lastCacheDid;
    public static long lastCacheTime;
    public static int lastCachedAccount;
    public boolean animationInProgress;
    public final ArrayList chats;
    public final TLRPC.Peer currentPeer;
    public final int currentType;
    public final JoinCallAlertDelegate delegate;
    public final KeepMediaPopupView.ExceptionsView doneButton;
    public boolean ignoreLayout;
    public final AnonymousClass3 listView;
    public final TextView messageTextView;
    public boolean schedule;
    public int scrollOffsetY;
    public TLRPC.InputPeer selectAfterDismiss;
    public TLRPC.Peer selectedPeer;
    public final Drawable shadowDrawable;
    public final TextView textView;

    public interface JoinCallAlertDelegate {
        void didSelectChat(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3);
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return JoinCallAlert.this.chats.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object chat;
            String string;
            JoinCallAlert joinCallAlert = JoinCallAlert.this;
            long peerId = MessageObject.getPeerId((TLRPC.Peer) joinCallAlert.chats.get(i));
            if (peerId > 0) {
                chat = MessagesController.getInstance(((BottomSheet) joinCallAlert).currentAccount).getUser(Long.valueOf(peerId));
                string = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                chat = MessagesController.getInstance(((BottomSheet) joinCallAlert).currentAccount).getChat(Long.valueOf(-peerId));
                string = null;
            }
            View view = viewHolder.itemView;
            if (joinCallAlert.currentType == 0) {
                ((ShareDialogCell) view).setDialog(peerId, peerId == MessageObject.getPeerId(joinCallAlert.selectedPeer), null);
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            boolean z = i != getItemCount() - 1;
            groupCreateUserCell.setObject(chat, null, string);
            groupCreateUserCell.drawDivider = z;
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            JoinCallAlert joinCallAlert = JoinCallAlert.this;
            if (joinCallAlert.currentType == 0) {
                groupCreateUserCell = new ShareDialogCell(this.context, 2, null);
                groupCreateUserCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
            } else {
                groupCreateUserCell = new GroupCreateUserCell(2, 0, this.context, null, false, joinCallAlert.currentType == 2);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
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

    public JoinCallAlert(Context context, long j, ArrayList arrayList, int i, TLRPC.Peer peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        int color;
        ViewGroup viewGroup;
        boolean z;
        super(context, null, false, false);
        setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.chats = arrayList2;
        this.delegate = joinCallAlertDelegate;
        this.currentType = i;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Peer peer2 = (TLRPC.Peer) this.chats.get(i2);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        this.currentPeer = peer2;
                        this.selectedPeer = peer2;
                        break;
                    }
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.Peer peer3 = (TLRPC.Peer) this.chats.get(i3);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        this.currentPeer = peer3;
                        this.selectedPeer = peer3;
                        break;
                    }
                }
            } else {
                this.selectedPeer = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = this.shadowDrawable;
            color = Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false);
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        } else {
            int color2 = Theme.getColor(null, Theme.key_dialogBackground, false);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
            this.selectedPeer = (TLRPC.Peer) arrayList2.get(0);
            color = color2;
        }
        fixNavigationBar(color);
        if (this.currentType == 0) {
            LinearLayout linearLayout = new LinearLayout(context) {
                public boolean sorted;

                @Override
                public final void onMeasure(int i4, int i5) {
                    JoinCallAlert joinCallAlert = JoinCallAlert.this;
                    if (joinCallAlert.currentType == 0) {
                        int size3 = View.MeasureSpec.getSize(i4);
                        ArrayList arrayList3 = joinCallAlert.chats;
                        int iDp = AndroidUtilities.dp(95.0f) * arrayList3.size();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) joinCallAlert.listView.getLayoutParams();
                        if (iDp > size3) {
                            layoutParams.width = -1;
                            layoutParams.gravity = 51;
                            if (!this.sorted) {
                                TLRPC.Peer peer4 = joinCallAlert.selectedPeer;
                                if (peer4 != null) {
                                    arrayList3.remove(peer4);
                                    arrayList3.add(0, joinCallAlert.selectedPeer);
                                }
                                this.sorted = true;
                            }
                        } else {
                            layoutParams.width = -2;
                            layoutParams.gravity = 49;
                            if (!this.sorted) {
                                if (joinCallAlert.selectedPeer != null) {
                                    int iMax = arrayList3.size() % 2 == 0 ? Math.max(0, (arrayList3.size() / 2) - 1) : arrayList3.size() / 2;
                                    arrayList3.remove(joinCallAlert.selectedPeer);
                                    arrayList3.add(iMax, joinCallAlert.selectedPeer);
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
                public final void onDraw(Canvas canvas) {
                    JoinCallAlert joinCallAlert = JoinCallAlert.this;
                    joinCallAlert.shadowDrawable.setBounds(0, joinCallAlert.scrollOffsetY - ((BottomSheet) joinCallAlert).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                    joinCallAlert.shadowDrawable.draw(canvas);
                }

                @Override
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        JoinCallAlert joinCallAlert = JoinCallAlert.this;
                        if (joinCallAlert.scrollOffsetY != 0 && motionEvent.getY() < joinCallAlert.scrollOffsetY) {
                            joinCallAlert.lambda$showGiftOfferSheet$15();
                            return true;
                        }
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public final void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                    super.onLayout(z2, i4, i5, i6, i7);
                    JoinCallAlert.access$1000(JoinCallAlert.this);
                }

                @Override
                public final void onMeasure(int i4, int i5) {
                    int size3 = View.MeasureSpec.getSize(i5) - AndroidUtilities.statusBarHeight;
                    JoinCallAlert joinCallAlert = JoinCallAlert.this;
                    measureChildWithMargins(joinCallAlert.messageTextView, i4, 0, i5, 0);
                    int measuredHeight = joinCallAlert.messageTextView.getMeasuredHeight();
                    AnonymousClass3 anonymousClass3 = joinCallAlert.listView;
                    ((FrameLayout.LayoutParams) anonymousClass3.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
                    getMeasuredWidth();
                    int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(((BottomSheet) joinCallAlert).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(joinCallAlert.chats.size(), 58.0f, AndroidUtilities.dp(80.0f)), 55.0f, measuredHeight);
                    int i6 = size3 / 5;
                    int i7 = iM < i6 * 3 ? size3 - iM : i6 * 2;
                    if (anonymousClass3.getPaddingTop() != i7) {
                        joinCallAlert.ignoreLayout = true;
                        anonymousClass3.setPadding(0, i7, 0, 0);
                        joinCallAlert.ignoreLayout = false;
                    }
                    super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    return !JoinCallAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
                }

                @Override
                public final void requestLayout() {
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
        ?? r10 = new RecyclerListView(context) {
            @Override
            public final void requestLayout() {
                if (JoinCallAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = r10;
        getContext();
        r10.setLayoutManager(new LinearLayoutManager(this.currentType == 0 ? 0 : 1, false));
        r10.setAdapter(new ListAdapter(context));
        r10.setVerticalScrollBarEnabled(false);
        r10.setClipToPadding(false);
        r10.setEnabled(true);
        r10.setSelectorDrawableColor(0);
        r10.setGlowColor(Theme.getColor(null, Theme.key_dialogScrollGlow, false));
        r10.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                JoinCallAlert.access$1000(JoinCallAlert.this);
            }
        });
        r10.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(8, this, chat));
        if (i != 0) {
            viewGroup.addView((View) r10, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            r10.setSelectorDrawableColor(0);
            r10.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i == 0) {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_schedule, 120, 120, null);
            rLottieImageView.playAnimation();
            viewGroup.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        this.textView = textView;
        zzkh.m(20.0f, textView);
        if (i == 2) {
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        } else {
            textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(getContext());
        this.messageTextView = textView2;
        if (i == 2) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
        } else {
            textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = this.chats.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                z = false;
                break;
            }
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) this.chats.get(i5));
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
                setVisibility(8);
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
        KeepMediaPopupView.ExceptionsView exceptionsView = new KeepMediaPopupView.ExceptionsView(this, context, false);
        this.doneButton = exceptionsView;
        ((View) exceptionsView.titleView).setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(1, this, joinCallAlertDelegate));
        if (this.currentType == 0) {
            viewGroup.addView(exceptionsView, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
            KeepMediaPopupView.ExceptionsView exceptionsView2 = new KeepMediaPopupView.ExceptionsView(this, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                exceptionsView2.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                exceptionsView2.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) exceptionsView2.titleView).setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 2));
            viewGroup.addView(exceptionsView2, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(exceptionsView, LayoutHelper.createFrame(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        updateDoneButton(chat, false);
    }

    public static void access$1000(JoinCallAlert joinCallAlert) {
        if (joinCallAlert.currentType == 0) {
            return;
        }
        AnonymousClass3 anonymousClass3 = joinCallAlert.listView;
        if (anonymousClass3.getChildCount() <= 0) {
            int paddingTop = anonymousClass3.getPaddingTop();
            joinCallAlert.scrollOffsetY = paddingTop;
            anonymousClass3.setTopGlowOffset(paddingTop);
            joinCallAlert.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = anonymousClass3.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass3.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = top;
        }
        if (joinCallAlert.scrollOffsetY != i) {
            joinCallAlert.textView.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            joinCallAlert.messageTextView.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            joinCallAlert.scrollOffsetY = i;
            anonymousClass3.setTopGlowOffset(i);
            joinCallAlert.containerView.invalidate();
        }
    }

    public static void checkFewUsers(Activity activity, long j, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (lastCachedAccount == accountInstance.getCurrentAccount() && lastCacheDid == j && cachedChats != null && SystemClock.elapsedRealtime() - lastCacheTime < 240000) {
            booleanCallback.run(cachedChats.size() == 1);
            return;
        }
        AlertDialog alertDialog = new AlertDialog(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j);
        alertDialog.setOnCancelListener(new JoinCallAlert$$ExternalSyntheticLambda1(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new StarGiftSheet$$ExternalSyntheticLambda162(alertDialog, j, accountInstance, booleanCallback, 5)), 1));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        try {
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        } catch (Exception unused) {
        }
    }

    public static void open(Context context, long j, AccountInstance accountInstance, BaseFragment baseFragment, int i, TLRPC.Peer peer, JoinCallAlertDelegate joinCallAlertDelegate) {
        if (context != null) {
            if (lastCachedAccount != accountInstance.getCurrentAccount() || lastCacheDid != j || cachedChats == null || SystemClock.elapsedRealtime() - lastCacheTime >= 300000) {
                AlertDialog alertDialog = new AlertDialog(context, 3, null);
                TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
                getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j);
                alertDialog.setOnCancelListener(new JoinCallAlert$$ExternalSyntheticLambda1(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ReportBottomSheet$$ExternalSyntheticLambda0(alertDialog, accountInstance, joinCallAlertDelegate, j, context, baseFragment, i, peer)), 0));
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                try {
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (cachedChats.size() == 1 && i != 0) {
                joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) cachedChats.get(0))), false, false, false);
                return;
            }
            ArrayList arrayList = cachedChats;
            if (i == 0) {
                if (arrayList.isEmpty()) {
                    return;
                }
                CreateGroupCallBottomSheet createGroupCallBottomSheet = new CreateGroupCallBottomSheet(baseFragment, arrayList, j, joinCallAlertDelegate);
                if (baseFragment.getParentActivity() != null) {
                    baseFragment.showDialog(createGroupCallBottomSheet);
                    return;
                } else {
                    createGroupCallBottomSheet.show();
                    return;
                }
            }
            JoinCallAlert joinCallAlert = new JoinCallAlert(context, j, arrayList, i, peer, joinCallAlertDelegate);
            if (baseFragment == null) {
                joinCallAlert.show();
            } else if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(joinCallAlert);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.selectAfterDismiss;
        if (inputPeer != null) {
            this.delegate.didSelectChat(inputPeer, this.chats.size() > 1, this.schedule, false);
        }
    }

    public final void lambda$new$7(JoinCallAlertDelegate joinCallAlertDelegate) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        if (this.currentType != 2) {
            this.selectAfterDismiss = inputPeer;
        } else if (this.selectedPeer != this.currentPeer) {
            joinCallAlertDelegate.didSelectChat(inputPeer, this.chats.size() > 1, false, false);
        }
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$8$7() {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(this.selectedPeer));
        this.schedule = true;
        lambda$showGiftOfferSheet$15();
    }

    public final void updateDoneButton(TLRPC.Chat chat, boolean z) {
        int i = this.currentType;
        KeepMediaPopupView.ExceptionsView exceptionsView = this.doneButton;
        if (i == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                exceptionsView.setText(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z);
                return;
            } else {
                exceptionsView.setText(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.selectedPeer);
        if (DialogObject.isUserDialog(peerId)) {
            exceptionsView.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            exceptionsView.setText(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z);
        }
    }
}
