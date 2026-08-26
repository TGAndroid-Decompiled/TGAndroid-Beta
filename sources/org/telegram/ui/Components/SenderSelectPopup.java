package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
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
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;

public abstract class SenderSelectPopup extends ActionBarPopupWindow {
    public AnonymousClass4 bulletinContainer;
    public ShareAlert$$ExternalSyntheticLambda29 bulletinHideCallback;
    public final ArrayList bulletins;
    public boolean clicked;
    public final TLRPC.Peer defPeer;
    public boolean dismissed;
    public final View headerShadow;
    public final TextView headerText;
    public boolean isDismissingByBulletin;
    public Boolean isHeaderShadowVisible;
    public final LinearLayoutManager layoutManager;
    public int popupX;
    public int popupY;
    public final AnonymousClass1 recyclerContainer;
    public final RecyclerListView recyclerView;
    public boolean runningCustomSprings;
    public final ChatActivity.AnonymousClass60 scrimPopupContainerLayout;
    public final TLRPC.TL_channels_sendAsPeers sendAsPeers;
    public final ArrayList springAnimations;

    public final class SenderView extends LinearLayout {
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
            addView(simpleAvatarView, LayoutHelper.createFrame(40.0f, 40));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(1.0f, 0, -1, 12, 0, 0));
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

    public SenderSelectPopup(final Context context, final ChatActivity chatActivity, final MessagesController messagesController, final boolean z, final TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.springAnimations = new ArrayList();
        this.bulletins = new ArrayList();
        this.defPeer = peer;
        this.sendAsPeers = tL_channels_sendAsPeers;
        final ChatActivityEnterView.AnonymousClass37 anonymousClass37 = (ChatActivityEnterView.AnonymousClass37) this;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(anonymousClass37, context, 24);
        this.scrimPopupContainerLayout = anonymousClass60;
        anonymousClass60.setLayoutParams(LayoutHelper.createFrame(-2.0f, -2));
        setContentView(anonymousClass60);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable drawableMutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        anonymousClass60.setBackground(drawableMutate);
        Rect rect = new Rect();
        drawableMutate.getPadding(rect);
        anonymousClass60.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        final int iDp = AndroidUtilities.dp(450.0f);
        final int width = (int) ((chatActivity == null ? AndroidUtilities.displaySize.x : chatActivity.contentView.getWidth()) * 0.75f);
        ?? r14 = new LinearLayout(context) {
            @Override
            public final int getSuggestedMinimumWidth() {
                return AndroidUtilities.dp(260.0f);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), iDp), View.MeasureSpec.getMode(i2)));
            }
        };
        this.recyclerContainer = r14;
        r14.setOrientation(1);
        TextView textView = new TextView(context);
        this.headerText = textView;
        OKLCH.m(Theme.key_dialogTextBlue, resourcesProvider, textView, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int iDp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(iDp2, AndroidUtilities.dp(12.0f), iDp2, AndroidUtilities.dp(12.0f));
        r14.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.recyclerView = recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return arrayList.size();
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
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
                MessagesController messagesController2 = messagesController;
                TLRPC.Peer peer3 = peer;
                boolean z2 = true;
                if (j2 >= 0) {
                    TLRPC.User user = messagesController2.getUser(Long.valueOf(j2));
                    if (user != null) {
                        senderView.title.setText(UserObject.getUserName(user));
                        senderView.subtitle.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                        senderView.avatar.setAvatar(user);
                    }
                    SimpleAvatarView simpleAvatarView = senderView.avatar;
                    if (peer3 == null ? i != 0 : peer3.user_id != peer2.user_id) {
                        z2 = false;
                    }
                    simpleAvatarView.setSelected(z2, false);
                    return;
                }
                TLRPC.Chat chat = messagesController2.getChat(Long.valueOf(-j2));
                if (chat != null) {
                    if (tL_sendAsPeer.premium_required) {
                        SpannableString spannableString = new SpannableString(((Object) TextUtils.ellipsize(chat.title, senderView.title.getPaint(), width - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)) + " d");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_premiumlock);
                        coloredImageSpan.setTopOffset(1);
                        coloredImageSpan.setSize(AndroidUtilities.dp(14.0f));
                        coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteGrayText5);
                        spannableString.setSpan(coloredImageSpan, spannableString.length() - 1, spannableString.length(), 33);
                        TextView textView2 = senderView.title;
                        textView2.setEllipsize(null);
                        textView2.setText(spannableString);
                    } else {
                        senderView.title.setEllipsize(TextUtils.TruncateAt.END);
                        senderView.title.setText(chat.title);
                    }
                    senderView.subtitle.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
                    senderView.avatar.setAvatar(chat);
                }
                SimpleAvatarView simpleAvatarView2 = senderView.avatar;
                if (peer3 == null ? i != 0 : peer3.channel_id != peer2.channel_id) {
                    z2 = false;
                }
                simpleAvatarView2.setSelected(z2, false);
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(new SenderView(viewGroup.getContext(), resourcesProvider));
            }
        });
        recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatActivityEnterView.AnonymousClass37 anonymousClass38 = anonymousClass37;
                boolean z2 = anonymousClass38.layoutManager.findFirstCompletelyVisibleItemPosition() != 0;
                Boolean bool = anonymousClass38.isHeaderShadowVisible;
                if (bool == null || z2 != bool.booleanValue()) {
                    anonymousClass38.headerShadow.animate().cancel();
                    OKLCH.m(anonymousClass38.headerShadow.animate(), z2 ? 1.0f : 0.0f, 150L);
                    anonymousClass38.isHeaderShadowVisible = Boolean.valueOf(z2);
                }
            }
        });
        final ChatActivityEnterView.AnonymousClass37 anonymousClass38 = (ChatActivityEnterView.AnonymousClass37) this;
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(arrayList, context, chatActivity, z, chatActivity$$ExternalSyntheticLambda248) {
            public final List f$1;
            public final Context f$2;
            public final ChatActivity f$3;
            public final ChatActivity$$ExternalSyntheticLambda248 f$5;

            {
                this.f$5 = chatActivity$$ExternalSyntheticLambda248;
            }

            @Override
            public final void onItemClick(int i, View view) {
                TLRPC.User user;
                final ChatActivityEnterView.AnonymousClass37 anonymousClass39 = this.f$0;
                TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.f$1.get(i);
                if (anonymousClass39.clicked) {
                    return;
                }
                if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    anonymousClass39.clicked = true;
                    RecyclerListView recyclerListView2 = anonymousClass39.recyclerView;
                    SenderSelectPopup.SenderView senderView = (SenderSelectPopup.SenderView) view;
                    TLRPC.Peer peer2 = tL_sendAsPeer.peer;
                    ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda249 = this.f$5;
                    ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) chatActivity$$ExternalSyntheticLambda249.f$0;
                    if (chatActivityEnterView.senderSelectPopupWindow == null) {
                        return;
                    }
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) chatActivity$$ExternalSyntheticLambda249.f$1;
                    if (chatFull != null) {
                        chatFull.default_send_as = peer2;
                    }
                    chatActivityEnterView.updateSendAsButton(true);
                    ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                    MessagesController messagesController2 = (MessagesController) chatActivity$$ExternalSyntheticLambda249.f$2;
                    if (chatActivityEnterViewDelegate == null || !chatActivityEnterViewDelegate.setDefaultSendAs(DialogObject.getPeerDialogId(peer2))) {
                        messagesController2.setDefaultSendAs(chatActivityEnterView.dialog_id, DialogObject.getPeerDialogId(peer2));
                    }
                    int[] iArr = new int[2];
                    boolean zIsSelected = senderView.avatar.isSelected();
                    SimpleAvatarView simpleAvatarView = senderView.avatar;
                    simpleAvatarView.getLocationInWindow(iArr);
                    simpleAvatarView.setSelected(true, true);
                    SimpleAvatarView simpleAvatarView2 = new SimpleAvatarView(chatActivityEnterView.getContext());
                    long j = peer2.channel_id;
                    if (j != 0) {
                        TLRPC.Chat chat = messagesController2.getChat(Long.valueOf(j));
                        if (chat != null) {
                            simpleAvatarView2.setAvatar(chat);
                        }
                    } else {
                        long j2 = peer2.user_id;
                        if (j2 != 0 && (user = messagesController2.getUser(Long.valueOf(j2))) != null) {
                            simpleAvatarView2.setAvatar(user);
                        }
                    }
                    for (int i2 = 0; i2 < recyclerListView2.getChildCount(); i2++) {
                        View childAt = recyclerListView2.getChildAt(i2);
                        if ((childAt instanceof SenderSelectPopup.SenderView) && childAt != senderView) {
                            ((SenderSelectPopup.SenderView) childAt).avatar.setSelected(false, true);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(chatActivityEnterView, simpleAvatarView2, iArr, senderView, 6), zIsSelected ? 0L : 200L);
                    return;
                }
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                Context context2 = this.f$2;
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (anonymousClass39.bulletinContainer == null) {
                    anonymousClass39.bulletinContainer = new FrameLayout(context2) {
                        @Override
                        public final boolean onTouchEvent(MotionEvent motionEvent) {
                            ChatActivityEnterView.AnonymousClass37 anonymousClass310 = anonymousClass39;
                            View contentView = anonymousClass310.getContentView();
                            int[] iArr2 = new int[2];
                            contentView.getLocationInWindow(iArr2);
                            iArr2[0] = iArr2[0] + anonymousClass310.popupX;
                            iArr2[1] = iArr2[1] + anonymousClass310.popupY;
                            int[] iArr3 = new int[2];
                            getLocationInWindow(iArr3);
                            if (motionEvent.getAction() != 0 || motionEvent.getX() > iArr2[0]) {
                                if (motionEvent.getX() < contentView.getWidth() + iArr2[0] && motionEvent.getY() > iArr2[1]) {
                                    if (motionEvent.getY() < contentView.getHeight() + iArr2[1]) {
                                        motionEvent.offsetLocation(iArr3[0] - iArr2[0], (AndroidUtilities.statusBarHeight + iArr3[1]) - iArr2[1]);
                                        return contentView.dispatchTouchEvent(motionEvent);
                                    }
                                }
                            }
                            if (!anonymousClass310.dismissed && !anonymousClass310.isDismissingByBulletin) {
                                anonymousClass310.isDismissingByBulletin = true;
                                anonymousClass310.startDismissAnimation(new SpringAnimation[0]);
                            }
                            return true;
                        }
                    };
                }
                ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = anonymousClass39.bulletinHideCallback;
                if (shareAlert$$ExternalSyntheticLambda29 != null) {
                    AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda29);
                }
                if (anonymousClass39.bulletinContainer.getParent() == null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.format = -3;
                    layoutParams.type = 99;
                    int i3 = Build.VERSION.SDK_INT;
                    layoutParams.flags |= Integer.MIN_VALUE;
                    if (i3 >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                    AndroidUtilities.setPreferredMaxRefreshRate(windowManager, anonymousClass39.bulletinContainer, layoutParams);
                    windowManager.addView(anonymousClass39.bulletinContainer, layoutParams);
                }
                ChatActivity chatActivity2 = this.f$3;
                if (chatActivity2 != null) {
                    SenderSelectPopup.AnonymousClass4 anonymousClass4 = anonymousClass39.bulletinContainer;
                    ChatActivity.ThemeDelegate themeDelegate = chatActivity2.themeDelegate;
                    ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = new ShareAlert$$ExternalSyntheticLambda29(15, anonymousClass39, chatActivity2);
                    SelectSendAsPremiumHintBulletinLayout selectSendAsPremiumHintBulletinLayout = new SelectSendAsPremiumHintBulletinLayout(context2, themeDelegate);
                    BackupImageView backupImageView = selectSendAsPremiumHintBulletinLayout.imageView;
                    backupImageView.setImageDrawable(context2.getDrawable(R.drawable.msg_premium_prolfilestar));
                    backupImageView.setColorFilter(new PorterDuffColorFilter(selectSendAsPremiumHintBulletinLayout.getThemedColor(Theme.key_undo_infoColor), PorterDuff.Mode.SRC_IN));
                    selectSendAsPremiumHintBulletinLayout.textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
                    Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context2, themeDelegate, true, false);
                    String string = LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen);
                    TextView textView2 = undoButton.undoTextView;
                    if (textView2 != null) {
                        textView2.setText(string);
                    }
                    undoButton.undoAction = shareAlert$$ExternalSyntheticLambda210;
                    selectSendAsPremiumHintBulletinLayout.setButton(undoButton);
                    final Bulletin bulletinMake = Bulletin.make(anonymousClass4, selectSendAsPremiumHintBulletinLayout, 1500);
                    bulletinMake.layout.addCallback(new Bulletin.Layout.Callback() {
                        @Override
                        public final void onAttach(Bulletin bulletin) {
                        }

                        @Override
                        public final void onDetach() {
                        }

                        @Override
                        public final void onHide() {
                            anonymousClass39.bulletins.remove(bulletinMake);
                        }

                        @Override
                        public final void onShow() {
                            anonymousClass39.bulletins.add(bulletinMake);
                        }
                    });
                    bulletinMake.show();
                }
                ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda211 = new ShareAlert$$ExternalSyntheticLambda29(16, anonymousClass39, windowManager);
                anonymousClass39.bulletinHideCallback = shareAlert$$ExternalSyntheticLambda211;
                AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda211, 2500L);
            }
        });
        recyclerListView.setOverScrollMode(2);
        frameLayout.addView(recyclerListView);
        View view = new View(context);
        this.headerShadow = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, LayoutHelper.createFrame(4.0f, -1));
        r14.addView(frameLayout, LayoutHelper.createFrame(-2.0f, -1));
        anonymousClass60.addView(r14);
    }

    @Override
    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        AnonymousClass4 anonymousClass4 = this.bulletinContainer;
        if (anonymousClass4 != null && anonymousClass4.getAlpha() == 1.0f) {
            animate().alpha(0.0f).setDuration(150L).setListener(new ChatActivity.AnonymousClass74(this, (WindowManager) getContext().getSystemService("window"), false, 29));
        }
        this.dismissed = true;
        dismiss(true);
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        this.popupX = i2;
        this.popupY = i3;
        super.showAtLocation(view, i, i2, i3);
    }

    public final void startDismissAnimation(SpringAnimation... springAnimationArr) {
        int i = 4;
        ArrayList arrayList = this.springAnimations;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((SpringAnimation) obj).cancel();
        }
        arrayList.clear();
        float fDp = AndroidUtilities.dp(8.0f);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.scrimPopupContainerLayout;
        anonymousClass60.setPivotX(fDp);
        anonymousClass60.setPivotY(anonymousClass60.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        AnonymousClass1 anonymousClass1 = this.recyclerContainer;
        anonymousClass1.setPivotX(0.0f);
        anonymousClass1.setPivotY(0.0f);
        anonymousClass60.setScaleX(1.0f);
        anonymousClass60.setScaleY(1.0f);
        anonymousClass1.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        SpringAnimation springAnimation = new SpringAnimation(anonymousClass60, DynamicAnimation.SCALE_X);
        zzlt.m(0.25f, 750.0f, 1.0f, springAnimation);
        springAnimation.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, 0));
        SpringAnimation springAnimation2 = new SpringAnimation(anonymousClass60, DynamicAnimation.SCALE_Y);
        zzlt.m(0.25f, 750.0f, 1.0f, springAnimation2);
        springAnimation2.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(this, 1));
        DynamicAnimation.AnonymousClass1 anonymousClass2 = DynamicAnimation.ALPHA;
        SpringAnimation springAnimation3 = new SpringAnimation(anonymousClass60, anonymousClass2);
        zzlt.m(0.0f, 750.0f, 1.0f, springAnimation3);
        SpringAnimation springAnimation4 = new SpringAnimation(anonymousClass1, anonymousClass2);
        zzlt.m(0.25f, 750.0f, 1.0f, springAnimation4);
        arrayList3.addAll(Arrays.asList(springAnimation, springAnimation2, springAnimation3, springAnimation4));
        for (SpringAnimation springAnimation5 : springAnimationArr) {
            if (springAnimation5 != null) {
                arrayList3.add(springAnimation5);
            }
        }
        this.runningCustomSprings = springAnimationArr.length > 0;
        ((SpringAnimation) arrayList3.get(0)).addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, i));
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            SpringAnimation springAnimation6 = (SpringAnimation) obj2;
            arrayList.add(springAnimation6);
            springAnimation6.addEndListener(new SenderSelectPopup$$ExternalSyntheticLambda3(this, springAnimation6, 0));
            springAnimation6.start();
        }
    }
}
