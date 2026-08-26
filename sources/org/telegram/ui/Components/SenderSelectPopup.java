package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$21$$ExternalSyntheticOutline0;
import org.telegram.ui.PremiumPreviewFragment;

public class SenderSelectPopup extends ActionBarPopupWindow {
    public static final int AVATAR_SIZE_DP = 40;
    private static final float SCALE_START = 0.25f;
    private static final int SHADOW_DURATION = 150;
    public static final float SPRING_STIFFNESS = 750.0f;
    private FrameLayout bulletinContainer;
    private Runnable bulletinHideCallback;
    private List<Bulletin> bulletins;
    private boolean clicked;
    private final int currentAccount;
    private TLRPC.Peer defPeer;
    private boolean dismissed;
    private View headerShadow;
    public TextView headerText;
    private boolean isDismissingByBulletin;
    private Boolean isHeaderShadowVisible;
    private LinearLayoutManager layoutManager;
    private int popupX;
    private int popupY;
    public LinearLayout recyclerContainer;
    private RecyclerListView recyclerView;
    protected boolean runningCustomSprings;
    private FrameLayout scrimPopupContainerLayout;
    private TLRPC.TL_channels_sendAsPeers sendAsPeers;
    protected List<SpringAnimation> springAnimations;

    public class BackButtonFrameLayout extends FrameLayout {
        public BackButtonFrameLayout(Context context) {
            super(context);
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && SenderSelectPopup.this.isShowing()) {
                SenderSelectPopup.this.dismiss();
            }
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public interface OnSelectCallback {
        void onPeerSelected(RecyclerView recyclerView, SenderView senderView, TLRPC.Peer peer);
    }

    public static final class SenderView extends LinearLayout {
        public final SimpleAvatarView avatar;
        public final TextView subtitle;
        public final TextView title;

        public SenderView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            setOrientation(0);
            setGravity(16);
            int iDp = AndroidUtilities.dp(14.0f);
            int i = iDp / 2;
            setPadding(iDp, i, iDp, i);
            SimpleAvatarView simpleAvatarView = new SimpleAvatarView(context);
            this.avatar = simpleAvatarView;
            addView(simpleAvatarView, LayoutHelper.createFrame(40, 40.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(0, -1, 1.0f, 12, 0, 0, 0));
            TextView textView = new TextView(context);
            this.title = textView;
            int i2 = Theme.key_actionBarDefaultSubmenuItem;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setTextSize(1, 16.0f);
            textView.setTag(textView);
            textView.setMaxLines(1);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(context);
            this.subtitle = textView2;
            textView2.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(i2, resourcesProvider), 102));
            textView2.setTextSize(1, 14.0f);
            textView2.setTag(textView2);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2);
        }
    }

    public SenderSelectPopup(final Context context, final ChatActivity chatActivity, final MessagesController messagesController, final boolean z, final TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final OnSelectCallback onSelectCallback, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.springAnimations = new ArrayList();
        this.bulletins = new ArrayList();
        this.defPeer = peer;
        this.sendAsPeers = tL_channels_sendAsPeers;
        this.currentAccount = chatActivity == null ? UserConfig.selectedAccount : chatActivity.getCurrentAccount();
        BackButtonFrameLayout backButtonFrameLayout = new BackButtonFrameLayout(context);
        this.scrimPopupContainerLayout = backButtonFrameLayout;
        backButtonFrameLayout.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f));
        setContentView(this.scrimPopupContainerLayout);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable drawableMutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.scrimPopupContainerLayout.setBackground(drawableMutate);
        Rect rect = new Rect();
        drawableMutate.getPadding(rect);
        this.scrimPopupContainerLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        final int iDp = AndroidUtilities.dp(450.0f);
        final int width = (int) ((chatActivity == null ? AndroidUtilities.displaySize.x : chatActivity.contentView.getWidth()) * 0.75f);
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public int getSuggestedMinimumWidth() {
                return AndroidUtilities.dp(260.0f);
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), iDp), View.MeasureSpec.getMode(i2)));
            }
        };
        this.recyclerContainer = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.headerText = textView;
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue, resourcesProvider));
        this.headerText.setTextSize(1, 16.0f);
        this.headerText.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        this.headerText.setTypeface(AndroidUtilities.bold(), 1);
        int iDp2 = AndroidUtilities.dp(18.0f);
        this.headerText.setPadding(iDp2, AndroidUtilities.dp(12.0f), iDp2, AndroidUtilities.dp(12.0f));
        this.recyclerContainer.addView(this.headerText);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        this.recyclerView = new RecyclerListView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemCount() {
                return arrayList.size();
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                SenderView senderView = (SenderView) viewHolder.itemView;
                TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) arrayList.get(i);
                TLRPC.Peer peer2 = tL_sendAsPeer.peer;
                long j = peer2.channel_id;
                long j2 = j != 0 ? -j : 0L;
                if (j2 == 0) {
                    long j3 = peer2.user_id;
                    if (j3 != 0) {
                        j2 = j3;
                    }
                }
                boolean z2 = true;
                if (j2 >= 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(j2));
                    if (user != null) {
                        senderView.title.setText(UserObject.getUserName(user));
                        senderView.subtitle.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                        senderView.avatar.setAvatar(user);
                    }
                    SimpleAvatarView simpleAvatarView = senderView.avatar;
                    TLRPC.Peer peer3 = peer;
                    if (peer3 == null ? i != 0 : peer3.user_id != peer2.user_id) {
                        z2 = false;
                    }
                    simpleAvatarView.setSelected(z2, false);
                    return;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j2));
                if (chat != null) {
                    if (tL_sendAsPeer.premium_required) {
                        SpannableString spannableString = new SpannableString(((Object) TextUtils.ellipsize(chat.title, senderView.title.getPaint(), width - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)) + " d");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_premiumlock);
                        coloredImageSpan.setTopOffset(1);
                        coloredImageSpan.setSize(AndroidUtilities.dp(14.0f));
                        coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteGrayText5);
                        spannableString.setSpan(coloredImageSpan, spannableString.length() - 1, spannableString.length(), 33);
                        senderView.title.setEllipsize(null);
                        senderView.title.setText(spannableString);
                    } else {
                        senderView.title.setEllipsize(TextUtils.TruncateAt.END);
                        senderView.title.setText(chat.title);
                    }
                    senderView.subtitle.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
                    senderView.avatar.setAvatar(chat);
                }
                SimpleAvatarView simpleAvatarView2 = senderView.avatar;
                TLRPC.Peer peer4 = peer;
                if (peer4 == null ? i != 0 : peer4.channel_id != peer2.channel_id) {
                    z2 = false;
                }
                simpleAvatarView2.setSelected(z2, false);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(new SenderView(viewGroup.getContext(), resourcesProvider));
            }
        });
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z2 = SenderSelectPopup.this.layoutManager.findFirstCompletelyVisibleItemPosition() != 0;
                if (SenderSelectPopup.this.isHeaderShadowVisible == null || z2 != SenderSelectPopup.this.isHeaderShadowVisible.booleanValue()) {
                    SenderSelectPopup.this.headerShadow.animate().cancel();
                    OKLCH.m(SenderSelectPopup.this.headerShadow.animate(), z2 ? 1.0f : 0.0f, 150L);
                    SenderSelectPopup.this.isHeaderShadowVisible = Boolean.valueOf(z2);
                }
            }
        });
        this.recyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                this.f$0.lambda$new$2(arrayList, context, chatActivity, z, onSelectCallback, view, i);
            }
        });
        this.recyclerView.setOverScrollMode(2);
        frameLayout.addView(this.recyclerView);
        this.headerShadow = new View(context);
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        this.headerShadow.setBackground(drawable);
        this.headerShadow.setAlpha(0.0f);
        frameLayout.addView(this.headerShadow, LayoutHelper.createFrame(-1, 4.0f));
        this.recyclerContainer.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        this.scrimPopupContainerLayout.addView(this.recyclerContainer);
    }

    public void lambda$new$0(ChatActivity chatActivity) {
        if (chatActivity != null) {
            chatActivity.presentFragment(new PremiumPreviewFragment("select_sender"));
            dismiss();
        }
    }

    public void lambda$new$1(WindowManager windowManager) {
        windowManager.removeView(this.bulletinContainer);
    }

    public void lambda$new$2(List list, Context context, ChatActivity chatActivity, boolean z, OnSelectCallback onSelectCallback, View view, int i) {
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i);
        if (this.clicked) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            this.clicked = true;
            onSelectCallback.onPeerSelected(this.recyclerView, (SenderView) view, tL_sendAsPeer.peer);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (this.bulletinContainer == null) {
            this.bulletinContainer = new FrameLayout(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    View contentView = SenderSelectPopup.this.getContentView();
                    int[] iArr = {SenderSelectPopup.this.popupX + i, SenderSelectPopup.this.popupY + i};
                    contentView.getLocationInWindow(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    getLocationInWindow(iArr2);
                    if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
                        motionEvent.offsetLocation(iArr2[0] - iArr[0], (AndroidUtilities.statusBarHeight + iArr2[1]) - iArr[1]);
                        return contentView.dispatchTouchEvent(motionEvent);
                    }
                    if (!SenderSelectPopup.this.dismissed && !SenderSelectPopup.this.isDismissingByBulletin) {
                        SenderSelectPopup.this.isDismissingByBulletin = true;
                        SenderSelectPopup.this.startDismissAnimation(new SpringAnimation[0]);
                    }
                    return true;
                }
            };
        }
        Runnable runnable = this.bulletinHideCallback;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if (this.bulletinContainer.getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.format = -3;
            layoutParams.type = 99;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.flags |= Integer.MIN_VALUE;
            if (i2 >= 28) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, this.bulletinContainer, layoutParams);
            windowManager.addView(this.bulletinContainer, layoutParams);
        }
        if (chatActivity != null) {
            final Bulletin bulletinMake = Bulletin.make(this.bulletinContainer, new SelectSendAsPremiumHintBulletinLayout(context, chatActivity.themeDelegate, z, new UndoView$$ExternalSyntheticLambda3(12, this, chatActivity)), 1500);
            bulletinMake.getLayout().addCallback(new Bulletin.Layout.Callback() {
                @Override
                public final void onAttach(Bulletin.Layout layout, Bulletin bulletin) {
                    Bulletin.Layout.Callback.CC.$default$onAttach(this, layout, bulletin);
                }

                @Override
                public final void onDetach(Bulletin.Layout layout) {
                    Bulletin.Layout.Callback.CC.$default$onDetach(this, layout);
                }

                @Override
                public final void onEnterTransitionEnd(Bulletin.Layout layout) {
                    Bulletin.Layout.Callback.CC.$default$onEnterTransitionEnd(this, layout);
                }

                @Override
                public final void onEnterTransitionStart(Bulletin.Layout layout) {
                    Bulletin.Layout.Callback.CC.$default$onEnterTransitionStart(this, layout);
                }

                @Override
                public final void onExitTransitionEnd(Bulletin.Layout layout) {
                    Bulletin.Layout.Callback.CC.$default$onExitTransitionEnd(this, layout);
                }

                @Override
                public final void onExitTransitionStart(Bulletin.Layout layout) {
                    Bulletin.Layout.Callback.CC.$default$onExitTransitionStart(this, layout);
                }

                @Override
                public void onHide(Bulletin.Layout layout) {
                    SenderSelectPopup.this.bulletins.remove(bulletinMake);
                }

                @Override
                public void onShow(Bulletin.Layout layout) {
                    SenderSelectPopup.this.bulletins.add(bulletinMake);
                }
            });
            bulletinMake.show();
        }
        UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(13, this, windowManager);
        this.bulletinHideCallback = undoView$$ExternalSyntheticLambda3;
        AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda3, 2500L);
    }

    public void lambda$startDismissAnimation$6(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleX(1.0f / f);
    }

    public void lambda$startDismissAnimation$7(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleY(1.0f / f);
    }

    public void lambda$startDismissAnimation$8(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.runningCustomSprings = false;
        dismiss();
    }

    public void lambda$startDismissAnimation$9(SpringAnimation springAnimation, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (z) {
            return;
        }
        this.springAnimations.remove(springAnimation);
        dynamicAnimation.cancel();
    }

    public void lambda$startShowAnimation$3(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleX(1.0f / f);
    }

    public void lambda$startShowAnimation$4(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleY(1.0f / f);
    }

    public void lambda$startShowAnimation$5(SpringAnimation springAnimation, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (z) {
            return;
        }
        this.springAnimations.remove(springAnimation);
        dynamicAnimation.cancel();
    }

    @Override
    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        FrameLayout frameLayout = this.bulletinContainer;
        if (frameLayout != null && frameLayout.getAlpha() == 1.0f) {
            final WindowManager windowManager = (WindowManager) this.bulletinContainer.getContext().getSystemService("window");
            this.bulletinContainer.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    try {
                        windowManager.removeViewImmediate(SenderSelectPopup.this.bulletinContainer);
                    } catch (Exception unused) {
                    }
                    if (SenderSelectPopup.this.bulletinHideCallback != null) {
                        AndroidUtilities.cancelRunOnUIThread(SenderSelectPopup.this.bulletinHideCallback);
                    }
                }
            });
        }
        this.dismissed = true;
        dismiss(true);
    }

    @Override
    public void showAtLocation(View view, int i, int i2, int i3) {
        this.popupX = i2;
        this.popupY = i3;
        super.showAtLocation(view, i, i2, i3);
    }

    public void startDismissAnimation(SpringAnimation... springAnimationArr) {
        int i = 3;
        int i2 = 1;
        ArrayList arrayList = new ArrayList(this.springAnimations);
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((SpringAnimation) obj).cancel();
        }
        this.springAnimations.clear();
        this.scrimPopupContainerLayout.setPivotX(AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = this.scrimPopupContainerLayout;
        frameLayout.setPivotY(frameLayout.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        this.recyclerContainer.setPivotX(0.0f);
        this.recyclerContainer.setPivotY(0.0f);
        this.scrimPopupContainerLayout.setScaleX(1.0f);
        this.scrimPopupContainerLayout.setScaleY(1.0f);
        this.recyclerContainer.setAlpha(1.0f);
        ArrayList arrayList2 = new ArrayList();
        SpringAnimation springAnimationM = ChatActivity$21$$ExternalSyntheticOutline0.m(0.25f, 750.0f, 1.0f, new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_X));
        springAnimationM.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, i3));
        SpringAnimation springAnimationM2 = ChatActivity$21$$ExternalSyntheticOutline0.m(0.25f, 750.0f, 1.0f, new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_Y));
        springAnimationM2.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, i2));
        FrameLayout frameLayout2 = this.scrimPopupContainerLayout;
        DynamicAnimation.AnonymousClass1 anonymousClass1 = DynamicAnimation.ALPHA;
        arrayList2.addAll(Arrays.asList(springAnimationM, springAnimationM2, ChatActivity$21$$ExternalSyntheticOutline0.m(0.0f, 750.0f, 1.0f, new SpringAnimation(frameLayout2, anonymousClass1)), ChatActivity$21$$ExternalSyntheticOutline0.m(0.25f, 750.0f, 1.0f, new SpringAnimation(this.recyclerContainer, anonymousClass1))));
        for (SpringAnimation springAnimation : springAnimationArr) {
            if (springAnimation != null) {
                arrayList2.add(springAnimation);
            }
        }
        this.runningCustomSprings = springAnimationArr.length > 0;
        ((SpringAnimation) arrayList2.get(0)).addEndListener(new Bulletin$$ExternalSyntheticLambda3(this, i));
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            SpringAnimation springAnimation2 = (SpringAnimation) obj2;
            this.springAnimations.add(springAnimation2);
            springAnimation2.addEndListener(new SenderSelectPopup$$ExternalSyntheticLambda3(this, springAnimation2, i3));
            springAnimation2.start();
        }
    }

    public void startShowAnimation() {
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        Iterator<SpringAnimation> it = this.springAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.springAnimations.clear();
        this.scrimPopupContainerLayout.setPivotX(AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = this.scrimPopupContainerLayout;
        frameLayout.setPivotY(frameLayout.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        this.recyclerContainer.setPivotX(0.0f);
        this.recyclerContainer.setPivotY(0.0f);
        ArrayList<TLRPC.TL_sendAsPeer> arrayList = this.sendAsPeers.peers;
        if (this.defPeer != null) {
            int iDp = AndroidUtilities.dp(54.0f);
            int size = arrayList.size() * iDp;
            int i4 = 0;
            while (true) {
                if (i4 < arrayList.size()) {
                    TLRPC.Peer peer = arrayList.get(i4).peer;
                    long j = peer.channel_id;
                    if (j == 0 || j != this.defPeer.channel_id) {
                        long j2 = peer.user_id;
                        if (j2 == r13 || j2 != this.defPeer.user_id) {
                            long j3 = peer.chat_id;
                            if (j3 == 0 || j3 != this.defPeer.chat_id) {
                                i4++;
                            }
                        }
                    }
                    this.layoutManager.scrollToPositionWithOffset(i4, (size - ((arrayList.size() - 2) * iDp)) + AndroidUtilities.dp(7.0f) + ((i4 == arrayList.size() - 1 || this.recyclerView.getMeasuredHeight() >= size) ? 0 : this.recyclerView.getMeasuredHeight() % iDp));
                    if (this.recyclerView.computeVerticalScrollOffset() > 0) {
                        this.headerShadow.animate().cancel();
                        this.headerShadow.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            }
        }
        this.scrimPopupContainerLayout.setScaleX(0.25f);
        this.scrimPopupContainerLayout.setScaleY(0.25f);
        this.recyclerContainer.setAlpha(0.25f);
        SpringAnimation springAnimationM = ChatActivity$21$$ExternalSyntheticOutline0.m(1.0f, 750.0f, 1.0f, new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_X));
        springAnimationM.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, i2));
        SpringAnimation springAnimationM2 = ChatActivity$21$$ExternalSyntheticOutline0.m(1.0f, 750.0f, 1.0f, new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_Y));
        springAnimationM2.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, i));
        FrameLayout frameLayout2 = this.scrimPopupContainerLayout;
        DynamicAnimation.AnonymousClass1 anonymousClass1 = DynamicAnimation.ALPHA;
        for (SpringAnimation springAnimation : Arrays.asList(springAnimationM, springAnimationM2, ChatActivity$21$$ExternalSyntheticOutline0.m(1.0f, 750.0f, 1.0f, new SpringAnimation(frameLayout2, anonymousClass1)), ChatActivity$21$$ExternalSyntheticOutline0.m(1.0f, 750.0f, 1.0f, new SpringAnimation(this.recyclerContainer, anonymousClass1)))) {
            this.springAnimations.add(springAnimation);
            springAnimation.addEndListener(new SenderSelectPopup$$ExternalSyntheticLambda3(this, springAnimation, i3));
            springAnimation.start();
        }
    }
}
