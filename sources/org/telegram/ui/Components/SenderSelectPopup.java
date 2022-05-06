package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_channels_sendAsPeers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.RecyclerListView;

public class SenderSelectPopup extends ActionBarPopupWindow {
    private TLRPC$ChatFull chatFull;
    private boolean clicked;
    public View dimView;
    private boolean dismissed;
    private View headerShadow;
    public TextView headerText;
    private Boolean isHeaderShadowVisible;
    private LinearLayoutManager layoutManager;
    public LinearLayout recyclerContainer;
    private RecyclerListView recyclerView;
    protected boolean runningCustomSprings;
    private FrameLayout scrimPopupContainerLayout;
    private TLRPC$TL_channels_sendAsPeers sendAsPeers;
    protected List<SpringAnimation> springAnimations = new ArrayList();

    public interface OnSelectCallback {
        void onPeerSelected(RecyclerView recyclerView, SenderView senderView, TLRPC$Peer tLRPC$Peer);
    }

    public SenderSelectPopup(Context context, ChatActivity chatActivity, final MessagesController messagesController, final TLRPC$ChatFull tLRPC$ChatFull, TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers, final OnSelectCallback onSelectCallback) {
        super(context);
        this.chatFull = tLRPC$ChatFull;
        this.sendAsPeers = tLRPC$TL_channels_sendAsPeers;
        BackButtonFrameLayout backButtonFrameLayout = new BackButtonFrameLayout(context);
        this.scrimPopupContainerLayout = backButtonFrameLayout;
        backButtonFrameLayout.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f));
        setContentView(this.scrimPopupContainerLayout);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = ContextCompat.getDrawable(context, R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("actionBarDefaultSubmenuBackground"), PorterDuff.Mode.MULTIPLY));
        this.scrimPopupContainerLayout.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.scrimPopupContainerLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        View view = new View(context);
        this.dimView = view;
        view.setBackgroundColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
        final int dp = AndroidUtilities.dp(450.0f);
        final int width = (int) (chatActivity.contentView.getWidth() * 0.75f);
        LinearLayout linearLayout = new LinearLayout(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), dp), View.MeasureSpec.getMode(i2)));
            }

            @Override
            protected int getSuggestedMinimumWidth() {
                return AndroidUtilities.dp(260.0f);
            }
        };
        this.recyclerContainer = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.headerText = textView;
        textView.setTextColor(Theme.getColor("dialogTextBlue"));
        this.headerText.setTextSize(1, 16.0f);
        this.headerText.setText(LocaleController.getString("SendMessageAsTitle", R.string.SendMessageAsTitle));
        this.headerText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        this.headerText.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        this.recyclerContainer.addView(this.headerText);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC$Peer> arrayList = tLRPC$TL_channels_sendAsPeers.peers;
        this.recyclerView = new RecyclerListView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setAdapter(new RecyclerListView.SelectionAdapter(this) {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(new SenderView(viewGroup.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                SenderView senderView = (SenderView) viewHolder.itemView;
                TLRPC$Peer tLRPC$Peer = (TLRPC$Peer) arrayList.get(i);
                long j = tLRPC$Peer.channel_id;
                long j2 = j != 0 ? -j : 0L;
                if (j2 == 0) {
                    long j3 = tLRPC$Peer.user_id;
                    if (j3 != 0) {
                        j2 = j3;
                    }
                }
                boolean z = true;
                if (j2 < 0) {
                    TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-j2));
                    if (chat != null) {
                        senderView.title.setText(chat.title);
                        senderView.subtitle.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count));
                        senderView.avatar.setAvatar(chat);
                    }
                    SimpleAvatarView simpleAvatarView = senderView.avatar;
                    TLRPC$Peer tLRPC$Peer2 = tLRPC$ChatFull.default_send_as;
                    if (tLRPC$Peer2 == null || tLRPC$Peer2.channel_id != tLRPC$Peer.channel_id) {
                        z = false;
                    }
                    simpleAvatarView.setSelected(z, false);
                    return;
                }
                TLRPC$User user = messagesController.getUser(Long.valueOf(j2));
                if (user != null) {
                    senderView.title.setText(UserObject.getUserName(user));
                    senderView.subtitle.setText(LocaleController.getString("VoipGroupPersonalAccount", R.string.VoipGroupPersonalAccount));
                    senderView.avatar.setAvatar(user);
                }
                SimpleAvatarView simpleAvatarView2 = senderView.avatar;
                TLRPC$Peer tLRPC$Peer3 = tLRPC$ChatFull.default_send_as;
                if (tLRPC$Peer3 == null || tLRPC$Peer3.user_id != tLRPC$Peer.user_id) {
                    z = false;
                }
                simpleAvatarView2.setSelected(z, false);
            }

            @Override
            public int getItemCount() {
                return arrayList.size();
            }
        });
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z = SenderSelectPopup.this.layoutManager.findFirstCompletelyVisibleItemPosition() != 0;
                if (SenderSelectPopup.this.isHeaderShadowVisible == null || z != SenderSelectPopup.this.isHeaderShadowVisible.booleanValue()) {
                    SenderSelectPopup.this.headerShadow.animate().cancel();
                    SenderSelectPopup.this.headerShadow.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
                    SenderSelectPopup.this.isHeaderShadowVisible = Boolean.valueOf(z);
                }
            }
        });
        this.recyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                SenderSelectPopup.this.lambda$new$0(onSelectCallback, arrayList, view2, i);
            }
        });
        frameLayout.addView(this.recyclerView);
        this.headerShadow = new View(context);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.header_shadow);
        drawable.setAlpha(153);
        this.headerShadow.setBackground(drawable);
        this.headerShadow.setAlpha(0.0f);
        frameLayout.addView(this.headerShadow, LayoutHelper.createFrame(-1, 4.0f));
        this.recyclerContainer.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        this.scrimPopupContainerLayout.addView(this.recyclerContainer);
    }

    public void lambda$new$0(OnSelectCallback onSelectCallback, List list, View view, int i) {
        if (!this.clicked) {
            this.clicked = true;
            onSelectCallback.onPeerSelected(this.recyclerView, (SenderView) view, (TLRPC$Peer) list.get(i));
        }
    }

    @Override
    public void dismiss() {
        if (!this.dismissed) {
            this.dismissed = true;
            super.dismiss();
        }
    }

    public void startShowAnimation() {
        for (SpringAnimation springAnimation : this.springAnimations) {
            springAnimation.cancel();
        }
        this.springAnimations.clear();
        this.scrimPopupContainerLayout.setPivotX(AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = this.scrimPopupContainerLayout;
        frameLayout.setPivotY(frameLayout.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        this.recyclerContainer.setPivotX(0.0f);
        this.recyclerContainer.setPivotY(0.0f);
        ArrayList<TLRPC$Peer> arrayList = this.sendAsPeers.peers;
        TLRPC$Peer tLRPC$Peer = this.chatFull.default_send_as;
        if (tLRPC$Peer == null) {
            tLRPC$Peer = null;
        }
        if (tLRPC$Peer != null) {
            int dp = AndroidUtilities.dp(54.0f);
            int size = arrayList.size() * dp;
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC$Peer tLRPC$Peer2 = arrayList.get(i);
                long j = tLRPC$Peer2.channel_id;
                if (j == 0 || j != tLRPC$Peer.channel_id) {
                    long j2 = tLRPC$Peer2.user_id;
                    if (j2 == 0 || j2 != tLRPC$Peer.user_id) {
                        long j3 = tLRPC$Peer2.chat_id;
                        if (j3 == 0 || j3 != tLRPC$Peer.chat_id) {
                            i++;
                        }
                    }
                }
                this.layoutManager.scrollToPositionWithOffset(i, ((i == arrayList.size() - 1 || this.recyclerView.getMeasuredHeight() >= size) ? 0 : this.recyclerView.getMeasuredHeight() % dp) + AndroidUtilities.dp(7.0f) + (size - ((arrayList.size() - 2) * dp)));
                if (this.recyclerView.computeVerticalScrollOffset() > 0) {
                    this.headerShadow.animate().cancel();
                    this.headerShadow.animate().alpha(1.0f).setDuration(150L).start();
                }
            }
        }
        this.scrimPopupContainerLayout.setScaleX(0.25f);
        this.scrimPopupContainerLayout.setScaleY(0.25f);
        this.recyclerContainer.setAlpha(0.25f);
        this.dimView.setAlpha(0.0f);
        FrameLayout frameLayout2 = this.scrimPopupContainerLayout;
        DynamicAnimation.ViewProperty viewProperty = DynamicAnimation.ALPHA;
        for (final SpringAnimation springAnimation2 : Arrays.asList(new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_X).setSpring(new SpringForce(1.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                SenderSelectPopup.this.lambda$startShowAnimation$1(dynamicAnimation, f, f2);
            }
        }), new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_Y).setSpring(new SpringForce(1.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                SenderSelectPopup.this.lambda$startShowAnimation$2(dynamicAnimation, f, f2);
            }
        }), new SpringAnimation(frameLayout2, viewProperty).setSpring(new SpringForce(1.0f).setStiffness(750.0f).setDampingRatio(1.0f)), new SpringAnimation(this.recyclerContainer, viewProperty).setSpring(new SpringForce(1.0f).setStiffness(750.0f).setDampingRatio(1.0f)), new SpringAnimation(this.dimView, viewProperty).setSpring(new SpringForce(1.0f).setStiffness(750.0f).setDampingRatio(1.0f)))) {
            this.springAnimations.add(springAnimation2);
            springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    SenderSelectPopup.this.lambda$startShowAnimation$3(springAnimation2, dynamicAnimation, z, f, f2);
                }
            });
            springAnimation2.start();
        }
    }

    public void lambda$startShowAnimation$1(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleX(1.0f / f);
    }

    public void lambda$startShowAnimation$2(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleY(1.0f / f);
    }

    public void lambda$startShowAnimation$3(SpringAnimation springAnimation, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (!z) {
            this.springAnimations.remove(springAnimation);
            dynamicAnimation.cancel();
        }
    }

    public void startDismissAnimation(SpringAnimation... springAnimationArr) {
        for (SpringAnimation springAnimation : this.springAnimations) {
            springAnimation.cancel();
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
        this.dimView.setAlpha(1.0f);
        ArrayList<SpringAnimation> arrayList = new ArrayList();
        boolean z = true;
        FrameLayout frameLayout2 = this.scrimPopupContainerLayout;
        DynamicAnimation.ViewProperty viewProperty = DynamicAnimation.ALPHA;
        arrayList.addAll(Arrays.asList(new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_X).setSpring(new SpringForce(0.25f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                SenderSelectPopup.this.lambda$startDismissAnimation$4(dynamicAnimation, f, f2);
            }
        }), new SpringAnimation(this.scrimPopupContainerLayout, DynamicAnimation.SCALE_Y).setSpring(new SpringForce(0.25f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                SenderSelectPopup.this.lambda$startDismissAnimation$5(dynamicAnimation, f, f2);
            }
        }), new SpringAnimation(frameLayout2, viewProperty).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)), new SpringAnimation(this.recyclerContainer, viewProperty).setSpring(new SpringForce(0.25f).setStiffness(750.0f).setDampingRatio(1.0f)), new SpringAnimation(this.dimView, viewProperty).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                SenderSelectPopup.this.lambda$startDismissAnimation$6(dynamicAnimation, z2, f, f2);
            }
        })));
        arrayList.addAll(Arrays.asList(springAnimationArr));
        if (springAnimationArr.length <= 0) {
            z = false;
        }
        this.runningCustomSprings = z;
        ((SpringAnimation) arrayList.get(0)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                SenderSelectPopup.this.lambda$startDismissAnimation$7(dynamicAnimation, z2, f, f2);
            }
        });
        for (final SpringAnimation springAnimation2 : arrayList) {
            this.springAnimations.add(springAnimation2);
            springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    SenderSelectPopup.this.lambda$startDismissAnimation$8(springAnimation2, dynamicAnimation, z2, f, f2);
                }
            });
            springAnimation2.start();
        }
    }

    public void lambda$startDismissAnimation$4(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleX(1.0f / f);
    }

    public void lambda$startDismissAnimation$5(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.recyclerContainer.setScaleY(1.0f / f);
    }

    public void lambda$startDismissAnimation$6(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (this.dimView.getParent() != null) {
            ((ViewGroup) this.dimView.getParent()).removeView(this.dimView);
        }
        dismiss();
    }

    public void lambda$startDismissAnimation$7(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.runningCustomSprings = false;
    }

    public void lambda$startDismissAnimation$8(SpringAnimation springAnimation, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (!z) {
            this.springAnimations.remove(springAnimation);
            dynamicAnimation.cancel();
        }
    }

    public static final class SenderView extends LinearLayout {
        public final SimpleAvatarView avatar;
        public final TextView subtitle;
        public final TextView title;

        public SenderView(Context context) {
            super(context);
            setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            setOrientation(0);
            setGravity(16);
            int dp = AndroidUtilities.dp(14.0f);
            int i = dp / 2;
            setPadding(dp, i, dp, i);
            SimpleAvatarView simpleAvatarView = new SimpleAvatarView(context);
            this.avatar = simpleAvatarView;
            addView(simpleAvatarView, LayoutHelper.createFrame(40, 40.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(0, -1, 1.0f, 12, 0, 0, 0));
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            textView.setTextSize(1, 16.0f);
            textView.setTag(textView);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(context);
            this.subtitle = textView2;
            textView2.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor("actionBarDefaultSubmenuItem"), 102));
            textView2.setTextSize(1, 14.0f);
            textView2.setTag(textView2);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2);
        }
    }

    private class BackButtonFrameLayout extends FrameLayout {
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
}
