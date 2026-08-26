package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.GradientClip;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class TopicsTabsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public static final int $r8$clinit = 0;
    public boolean allTopicsHidden;
    public long animateFromSelectedTopicId;
    public ValueAnimator animator;
    public final BoolAnimator animatorCloseButtonVisibility;
    public final BoolAnimator animatorTopicsVisibility;
    public final boolean bot;
    public final VerticalTabView botCreateTopicButtonVertical;
    public final boolean canShowProgress;
    public final ImageView closeButtonSide;
    public final ImageView closeButtonTop;
    public final int currentAccount;
    public long currentTopicId;
    public final long dialogId;
    public final HashSet excludeTopics;
    public final ChatActivity fragment;
    public long lastSelectedTopicId;
    public final boolean mono;
    public boolean notificationsAttached;
    public Utilities.Callback2 onDialogSelected;
    public Runnable onTopicCreated;
    public Utilities.Callback2 onTopicSelected;
    public ChatActivity$$ExternalSyntheticLambda11 onUpdateSideMenuPosition;
    public Boolean pendingSidemenu;
    public final Theme.ResourcesProvider resourcesProvider;
    public BlurredBackgroundDrawable sideMenuBackgroundDrawable;
    public float sideMenuBackgroundMarginBottom;
    public float sideMenuBackgroundMarginTop;
    public final AnonymousClass3 sideTabs;
    public final FrameLayout sideTabsContainer;
    public boolean sidemenuAnimating;
    public boolean sidemenuEnabled;
    public float sidemenuT;
    public final ImageView toggleButtonSide;
    public final ImageView toggleButtonTop;
    public BlurredBackgroundDrawable topMenuBackgroundDrawable;
    public final AnonymousClass1 topTabs;
    public final FrameLayout topTabsContainer;
    public boolean topicBottom;

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final boolean val$side;

        public AnonymousClass5(boolean z) {
            this.val$side = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            TopicsTabsView topicsTabsView = TopicsTabsView.this;
            if (topicsTabsView.animator == animator) {
                boolean z = this.val$side;
                topicsTabsView.sidemenuT = z ? 1.0f : 0.0f;
                topicsTabsView.updateSidemenuPosition();
                topicsTabsView.sidemenuAnimating = false;
                topicsTabsView.toggleButtonSide.setImageResource(topicsTabsView.topicBottom ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                topicsTabsView.animator = null;
                SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(topicsTabsView.currentAccount);
                StringBuilder sb = new StringBuilder("topicssidetabs");
                long j = topicsTabsView.dialogId;
                sb.append(j);
                editorM.putBoolean(sb.toString(), topicsTabsView.sidemenuEnabled).putBoolean("topicssidetabsb" + j, topicsTabsView.topicBottom).apply();
                Boolean bool = topicsTabsView.pendingSidemenu;
                if (bool != null && z != bool.booleanValue()) {
                    boolean zBooleanValue = topicsTabsView.pendingSidemenu.booleanValue();
                    topicsTabsView.pendingSidemenu = null;
                    topicsTabsView.animateSidemenuTo(zBooleanValue);
                }
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 3));
            }
        }
    }

    public final class BotNewTopicDrawable extends Drawable {
        public final Drawable drawable;
        public final Paint paint = new Paint(1);
        public final RectF rectF = new RectF();

        public BotNewTopicDrawable(Context context) {
            this.drawable = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
            this.drawable.draw(canvas);
        }

        @Override
        public final int getOpacity() {
            return 0;
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.rectF.set(rect);
            int iCenterX = rect.centerX() - AndroidUtilities.dp(12.0f);
            int iCenterY = rect.centerY() - AndroidUtilities.dp(12.0f);
            this.drawable.setBounds(iCenterX, iCenterY, AndroidUtilities.dp(24.0f) + iCenterX, AndroidUtilities.dp(24.0f) + iCenterY);
        }

        @Override
        public final void setAlpha(int i) {
            this.paint.setAlpha(i);
            this.drawable.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final class HorizontalTabView extends FrameLayout {
        public int addW;
        public AvatarSpan avatarSpan;
        public ValueAnimator counterAnimator;
        public int counterBackgroundColorKey;
        public final AnimatedTextView.AnimatedTextDrawable counterText;
        public final CalendarActivity.AnonymousClass5 counterView;
        public int counterViewX;
        public final int currentAccount;
        public final ImageView imageView;
        public boolean isAdd;
        public int lastUnread;
        public boolean mono;
        public boolean pinned;
        public boolean reorder;
        public final Theme.ResourcesProvider resourcesProvider;
        public ValueAnimator selectAnimator;
        public float selectT;
        public boolean selected;
        public final AnimatedFloat shakeAlpha;
        public Shaker shaker;
        public final LinkSpanDrawable.LinksTextView textView;
        public long topicId;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                HorizontalTabView horizontalTabView = (HorizontalTabView) view;
                boolean z2 = false;
                if (uItem.red) {
                    horizontalTabView.setLoading();
                } else {
                    Object obj = uItem.object;
                    if (obj == null) {
                        if (uItem.id == -2) {
                            horizontalTabView.setAdd();
                        } else {
                            horizontalTabView.setAll((uItem.flags & 1) != 0, uItem.accent, uItem.checked);
                        }
                    } else if (obj instanceof TLRPC.TL_forumTopic) {
                        if (uItem.withUsername) {
                            horizontalTabView.set(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        } else {
                            horizontalTabView.setMf(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        }
                    }
                }
                horizontalTabView.addW = BitwiseUtils.hasFlag(uItem.flags, 8) ? AndroidUtilities.dp(10.0f) : 0;
                if (universalRecyclerView != null && universalRecyclerView.reorderingAllowed && horizontalTabView.pinned) {
                    z2 = true;
                }
                horizontalTabView.setReorder(z2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new HorizontalTabView(context, i, resourcesProvider);
            }
        }

        public HorizontalTabView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.shakeAlpha = new AnimatedFloat(360L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.pinned = false;
            this.isAdd = false;
            this.mono = false;
            this.counterBackgroundColorKey = Theme.key_chats_unreadCounter;
            this.addW = 0;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setClipChildren(false);
            setClipToPadding(false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
            ScaleStateListAnimator.apply(linksTextView, 0.1f, 1.5f);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            addView(imageView, LayoutHelper.createFrame(34, 34, 17));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
            this.counterText = animatedTextDrawable;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable.gravity = 17;
            CalendarActivity.AnonymousClass5 anonymousClass5 = new CalendarActivity.AnonymousClass5(this, context, resourcesProvider);
            this.counterView = anonymousClass5;
            addView(anonymousClass5, LayoutHelper.createFrame(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
            ScaleStateListAnimator.apply(anonymousClass5, 0.1f, 1.5f);
            updateTextColor();
        }

        private int getMeasuringWidth() {
            float fDp = AndroidUtilities.dp(16.66f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            return AndroidUtilities.dp(11.0f) + this.textView.getMeasuredWidth() + AndroidUtilities.dp(11.0f) + (animatedTextDrawable.currentWidth > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(fDp, animatedTextDrawable.currentWidth + AndroidUtilities.dp(10.0f))) : 0) + this.addW;
        }

        public int getTextColor() {
            int i = Theme.key_windowBackgroundWhiteGrayText2;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            return ColorUtils.blendARGB(this.isAdd ? 1.0f : this.selectT, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
        }

        private void setLayout(boolean z) {
            if (this.mono == z) {
                return;
            }
            this.mono = z;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view != this.textView) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float f = this.shakeAlpha.set(this.reorder);
            if (f > 0.0f) {
                if (this.shaker == null) {
                    this.shaker = new Shaker(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.shaker.concat(canvas, f);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        public long getTopicId() {
            return this.topicId;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            ImageView imageView = this.imageView;
            int measuredWidth = (i5 - imageView.getMeasuredWidth()) / 2;
            int measuredHeight = (i6 - imageView.getMeasuredHeight()) / 2;
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            int i7 = i6 / 2;
            linksTextView.layout(AndroidUtilities.dp(11.0f), i7 - (linksTextView.getMeasuredHeight() / 2), linksTextView.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (linksTextView.getMeasuredHeight() / 2) + i7);
            float f = this.counterText.currentWidth;
            CalendarActivity.AnonymousClass5 anonymousClass5 = this.counterView;
            if (f > 0.0f) {
                anonymousClass5.layout((i5 - AndroidUtilities.dp(11.0f)) - anonymousClass5.getMeasuredWidth(), i7 - (anonymousClass5.getMeasuredHeight() / 2), i5 - AndroidUtilities.dp(11.0f), (anonymousClass5.getMeasuredHeight() / 2) + i7);
            } else {
                anonymousClass5.layout(AndroidUtilities.dp(4.66f) + linksTextView.getMeasuredWidth() + AndroidUtilities.dp(11.0f), i7 - (anonymousClass5.getMeasuredHeight() / 2), anonymousClass5.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + linksTextView.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (anonymousClass5.getMeasuredHeight() / 2) + i7);
            }
            if (this.counterViewX != 0 && anonymousClass5.getLeft() != this.counterViewX) {
                anonymousClass5.setTranslationX((-anonymousClass5.getLeft()) + this.counterViewX);
                anonymousClass5.animate().translationX(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            this.counterViewX = anonymousClass5.getLeft();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            this.textView.measure(i, i2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
        }

        public final void set(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(false);
            long j2 = this.topicId;
            long j3 = tL_forumTopic.id;
            boolean z2 = j2 == j3;
            this.topicId = j3;
            this.imageView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_forumTopic.id == 1) {
                spannableStringBuilder.append((CharSequence) "#");
                spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_filled_general);
                coloredImageSpan.setScale(0.66f, 0.66f);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 18);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) "x ");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(tL_forumTopic.icon_emoji_id, 1.2f, linksTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
            }
            if (!tL_forumTopic.hidden) {
                spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
            }
            linksTextView.setText(spannableStringBuilder);
            setSelected(z);
            updateTextColor();
            setCounter(tL_forumTopic.unread_count, MessagesController.getInstance(this.currentAccount).isDialogMuted(j, this.topicId), z2);
            boolean z3 = tL_forumTopic.pinned;
            if (this.pinned != z3) {
                this.pinned = z3;
            }
        }

        public final void setAdd() {
            setLayout(false);
            this.topicId = 0L;
            this.isAdd = true;
            this.imageView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.menu_topic_add), 0, 1, 33);
            linksTextView.setText(spannableStringBuilder);
            setSelected(false);
            updateTextColor();
            setCounter(0, true, false);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public final void setAll(boolean z, boolean z2, boolean z3) {
            setLayout(z2);
            this.topicId = 0L;
            this.isAdd = false;
            ImageView imageView = this.imageView;
            imageView.setVisibility(z ? 0 : 8);
            if (z) {
                BotNewTopicDrawable botNewTopicDrawable = new BotNewTopicDrawable(getContext());
                botNewTopicDrawable.paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                imageView.setImageDrawable(botNewTopicDrawable);
            }
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setText(LocaleController.getString(z ? R.string.BotForumNewTopic : R.string.AllTopicsShort));
            linksTextView.setVisibility(z ? 8 : 0);
            setSelected(z3);
            updateTextColor();
            setCounter(0, true, false);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public final void setCounter(int i, boolean z, boolean z2) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            if (i > 0) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                animatedTextDrawable.setText(LocaleController.formatNumber(i, ','), z2, true);
            } else {
                this.counterBackgroundColorKey = Theme.key_chats_unreadCounterMuted;
                animatedTextDrawable.setText("", z2, true);
            }
            if (z2 && this.lastUnread < i) {
                ValueAnimator valueAnimator = this.counterAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.counterAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.counterAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new TopicsTabsView$HorizontalTabView$$ExternalSyntheticLambda0(this, 0));
                this.counterAnimator.addListener(new Tooltip.AnonymousClass1(this, 13));
                this.counterAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.counterAnimator.setDuration(200L);
                this.counterAnimator.start();
            }
            this.lastUnread = i;
            this.counterView.invalidate();
            if (getMeasuringWidth() != getMeasuredWidth()) {
                requestLayout();
            }
        }

        public final void setLoading() {
            setLayout(false);
            this.topicId = -1L;
            this.imageView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
            LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(42.0f), linksTextView);
            loadingSpan.scaleY = 0.95f;
            spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
            linksTextView.setText(spannableStringBuilder);
            setSelected(false);
            updateTextColor();
            setCounter(0, true, false);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public final void setMf(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(true);
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            boolean z2 = this.topicId == peerDialogId;
            this.topicId = peerDialogId;
            this.imageView.setVisibility(8);
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setVisibility(0);
            AvatarSpan avatarSpan = this.avatarSpan;
            int i = this.currentAccount;
            if (avatarSpan == null) {
                AvatarSpan avatarSpan2 = new AvatarSpan(linksTextView, 18.0f, i);
                this.avatarSpan = avatarSpan2;
                avatarSpan2.usePaintAlpha = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(peerDialogId);
            if (userOrChat != null) {
                spannableStringBuilder.append((CharSequence) "x  ");
                AvatarSpan avatarSpan3 = this.avatarSpan;
                avatarSpan3.avatarDrawable.setInfo(avatarSpan3.currentAccount, userOrChat);
                avatarSpan3.imageReceiver.setForUserOrChat(userOrChat, avatarSpan3.avatarDrawable);
                spannableStringBuilder.setSpan(this.avatarSpan, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
            linksTextView.setText(TextUtils.ellipsize(spannableStringBuilder, linksTextView.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
            setSelected(z);
            setCounter(tL_forumTopic.unread_count, MessagesController.getInstance(i).isDialogMuted(j, peerDialogId), z2);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public void setReorder(boolean z) {
            this.reorder = z;
            invalidate();
        }

        @Override
        public void setSelected(boolean z) {
            int i = 1;
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new TopicsTabsView$HorizontalTabView$$ExternalSyntheticLambda0(this, i));
            this.selectAnimator.addListener(new LoginActivity.AnonymousClass9(11, this, z));
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.setDuration(320L);
            this.selectAnimator.start();
        }

        public final void updateTextColor() {
            int textColor = getTextColor();
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setTextColor(textColor);
            linksTextView.setEmojiColor(textColor);
            this.counterView.invalidate();
        }
    }

    public final class Position {
        public static final Position[] $VALUES;
        public static final Position BOTTOM;
        public static final Position LEFT;
        public static final Position TOP;

        static {
            Position position = new Position("TOP", 0);
            TOP = position;
            Position position2 = new Position("LEFT", 1);
            LEFT = position2;
            Position position3 = new Position("BOTTOM", 2);
            BOTTOM = position3;
            $VALUES = new Position[]{position, position2, position3};
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public final class VerticalTabView extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public float countScale;
        public ValueAnimator counterAnimator;
        public int counterBackgroundColorKey;
        public final AnimatedTextView.AnimatedTextDrawable counterText;
        public final int currentAccount;
        public final GroupCreateActivity.AnonymousClass7 imageLayoutView;
        public final BackupImageView imageView;
        public final FrameLayout.LayoutParams imageViewParams;
        public boolean isAdd;
        public boolean lastMention;
        public boolean lastReactions;
        public int lastUnread;
        public final GroupCallActivity.AnonymousClass61 layout;
        public final ImageView lineView;
        public LoadingDrawable loadingDrawable;
        public SpannableStringBuilder mentionString;
        public boolean mono;
        public boolean pinned;
        public SpannableStringBuilder reactionString;
        public boolean reorder;
        public final Theme.ResourcesProvider resourcesProvider;
        public ValueAnimator selectAnimator;
        public float selectT;
        public boolean selected;
        public Shaker shaker;
        public boolean staticImage;
        public final TextView textView;
        public long topicId;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                VerticalTabView verticalTabView = (VerticalTabView) view;
                boolean z2 = false;
                if (uItem.red) {
                    verticalTabView.setLoading();
                } else {
                    Object obj = uItem.object;
                    if (obj == null) {
                        if (uItem.longValue == -2) {
                            verticalTabView.setAdd(uItem.accent, uItem.checked);
                        } else {
                            verticalTabView.setAll((uItem.flags & 1) != 0, uItem.accent, uItem.checked);
                        }
                    } else if (obj instanceof TLRPC.TL_forumTopic) {
                        if (uItem.withUsername) {
                            verticalTabView.set(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        } else {
                            verticalTabView.setMf((TLRPC.TL_forumTopic) obj, uItem.checked);
                        }
                    }
                }
                if (universalRecyclerView != null && universalRecyclerView.reorderingAllowed && verticalTabView.pinned) {
                    z2 = true;
                }
                verticalTabView.setReorder(z2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new VerticalTabView(context, i, resourcesProvider);
            }
        }

        public VerticalTabView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.mono = false;
            this.pinned = false;
            this.counterBackgroundColorKey = Theme.key_chats_unreadCounter;
            this.countScale = 1.0f;
            this.topicId = 0L;
            this.isAdd = false;
            this.staticImage = false;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            GroupCallActivity.AnonymousClass61 anonymousClass61 = new GroupCallActivity.AnonymousClass61(this, context);
            this.layout = anonymousClass61;
            anonymousClass61.setWillNotDraw(false);
            anonymousClass61.setOrientation(1);
            addView(anonymousClass61, LayoutHelper.createFrame(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
            ScaleStateListAnimator.apply(anonymousClass61, 0.1f, 1.5f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
            this.counterText = animatedTextDrawable;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setTypeface(typefaceBold);
            int color = Theme.getColor(Theme.key_chats_unreadCounterText, resourcesProvider);
            textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable.gravity = 17;
            GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, context, resourcesProvider);
            this.imageLayoutView = anonymousClass7;
            anonymousClass7.setWillNotDraw(false);
            anonymousClass7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            anonymousClass61.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(34, 34, 17);
            this.imageViewParams = layoutParamsCreateFrame;
            anonymousClass7.addView(backupImageView, layoutParamsCreateFrame);
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            TextView textView = new TextView(context);
            this.textView = textView;
            int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider);
            int i2 = Theme.key_featuredStickers_addButton;
            textView.setTextColor(ColorUtils.blendARGB(this.selectT, color2, Theme.getColor(i2, resourcesProvider)));
            textView.setTextSize(1, 10.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(3);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            anonymousClass61.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 4, 0, 4, 0));
            anonymousClass61.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            ImageView imageView = new ImageView(context);
            this.lineView = imageView;
            imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(2.33f), Theme.getColor(i2, resourcesProvider)));
            addView(imageView, LayoutHelper.createFrame(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
            imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
            imageView.setVisibility(8);
        }

        private void setLayout(boolean z) {
            if (this.mono == z) {
                return;
            }
            this.mono = z;
            this.imageView.setRoundRadius(AndroidUtilities.dp(z ? 36.0f : 3.0f));
            this.imageLayoutView.setPadding(0, AndroidUtilities.dp(z ? 7.0f : 4.0f), 0, 0);
            FrameLayout.LayoutParams layoutParams = this.imageViewParams;
            layoutParams.width = z ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
            layoutParams.height = z ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i2);
        }

        public final void set(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(false);
            long j2 = this.topicId;
            long j3 = tL_forumTopic.id;
            boolean z2 = j2 == j3;
            this.staticImage = false;
            this.topicId = j3;
            this.isAdd = false;
            TextView textView = this.textView;
            textView.setText(tL_forumTopic.title);
            textView.setVisibility(0);
            int i = tL_forumTopic.id;
            BackupImageView backupImageView = this.imageView;
            if (i == 1) {
                this.staticImage = true;
                backupImageView.imageReceiver.clearImage();
                backupImageView.setAnimatedEmojiDrawable(null);
                backupImageView.setImageResource(R.drawable.msg_filled_general);
                backupImageView.setScaleX(0.66f);
                backupImageView.setScaleY(0.66f);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                backupImageView.imageReceiver.clearImage();
                backupImageView.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
                backupImageView.setScaleX(1.0f);
                backupImageView.setScaleY(1.0f);
            } else {
                backupImageView.setAnimatedEmojiDrawable(null);
                backupImageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic));
                backupImageView.setScaleX(1.0f);
                backupImageView.setScaleY(1.0f);
            }
            setSelected(z);
            updateImageColor();
            setCounter(tL_forumTopic.unread_count, MessagesController.getInstance(this.currentAccount).isDialogMuted(j, tL_forumTopic.id), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z2);
            boolean z3 = tL_forumTopic.pinned;
            if (this.pinned != z3) {
                this.pinned = z3;
            }
            updateState();
        }

        public final void setAdd(boolean z, boolean z2) {
            setLayout(z);
            this.staticImage = true;
            this.isAdd = true;
            TextView textView = this.textView;
            textView.setText(LocaleController.getString(R.string.NewTopic));
            textView.setVisibility(0);
            BackupImageView backupImageView = this.imageView;
            backupImageView.imageReceiver.clearImage();
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageResource(R.drawable.emoji_tabs_new3);
            backupImageView.setScaleX(1.0f);
            backupImageView.setScaleY(1.0f);
            setSelected(z2);
            updateImageColor();
            updateState();
            setCounter(0, true, false, false, false);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public final void setAll(boolean z, boolean z2, boolean z3) {
            setLayout(z2);
            this.topicId = -1L;
            this.staticImage = true;
            this.isAdd = false;
            TextView textView = this.textView;
            textView.setText(LocaleController.getString(z ? R.string.BotForumNewTopic : R.string.AllTopicsSide));
            textView.setVisibility(z ? 8 : 0);
            BackupImageView backupImageView = this.imageView;
            backupImageView.imageReceiver.clearImage();
            backupImageView.setAnimatedEmojiDrawable(null);
            if (z) {
                BotNewTopicDrawable botNewTopicDrawable = new BotNewTopicDrawable(getContext());
                botNewTopicDrawable.paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                backupImageView.setImageDrawable(botNewTopicDrawable);
            } else {
                backupImageView.setImageResource(R.drawable.other_chats);
            }
            backupImageView.setScaleX(1.0f);
            backupImageView.setScaleY(1.0f);
            setSelected(z3);
            updateImageColor();
            updateState();
            setCounter(0, true, false, false, false);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public final void setCounter(int i, boolean z, boolean z2, boolean z3, boolean z4) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            int i2 = 1;
            if (z3) {
                this.counterBackgroundColorKey = Theme.key_dialogReactionMentionBackground;
                if (this.reactionString == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_like_filled);
                    coloredImageSpan.setScale(0.8f, 0.8f);
                    coloredImageSpan.spaceScaleX = 0.5f;
                    coloredImageSpan.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
                    this.reactionString = spannableStringBuilder;
                }
                animatedTextDrawable.setText(this.reactionString, z4, true);
            } else if (z2) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                if (this.mentionString == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_mention_filled_16);
                    coloredImageSpan2.setScale(0.8f, 0.8f);
                    coloredImageSpan2.spaceScaleX = 0.5f;
                    coloredImageSpan2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder2.setSpan(coloredImageSpan2, 0, 1, 33);
                    this.mentionString = spannableStringBuilder2;
                }
                animatedTextDrawable.setText(this.mentionString, z4, true);
            } else if (i > 0) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                animatedTextDrawable.setText(LocaleController.formatNumber(i, ','), z4, true);
            } else {
                this.counterBackgroundColorKey = Theme.key_chats_unreadCounterMuted;
                animatedTextDrawable.setText("", z4, true);
            }
            if (z4 && (this.lastUnread < i || ((!this.lastMention && z2) || (!this.lastReactions && z3)))) {
                ValueAnimator valueAnimator = this.counterAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.counterAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.counterAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new TopicsTabsView$VerticalTabView$$ExternalSyntheticLambda0(this, i2));
                this.counterAnimator.addListener(new Tooltip.AnonymousClass1(this, 14));
                this.counterAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.counterAnimator.setDuration(200L);
                this.counterAnimator.start();
            }
            this.lastUnread = i;
            this.lastMention = z2;
            this.lastReactions = z3;
            this.imageLayoutView.invalidate();
        }

        public final void setLoading() {
            setLayout(false);
            this.topicId = -1L;
            this.staticImage = true;
            this.isAdd = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
            TextView textView = this.textView;
            LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(38.0f), textView);
            loadingSpan.scaleY = 0.75f;
            spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            BackupImageView backupImageView = this.imageView;
            backupImageView.imageReceiver.clearImage();
            backupImageView.setAnimatedEmojiDrawable(null);
            if (this.loadingDrawable == null) {
                LoadingDrawable loadingDrawable = new LoadingDrawable();
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                loadingDrawable.resourcesProvider = resourcesProvider;
                this.loadingDrawable = loadingDrawable;
                loadingDrawable.setRadii(AndroidUtilities.dp(38.0f));
                this.loadingDrawable.setCallback(backupImageView);
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider);
                this.loadingDrawable.setColors(Theme.multAlpha(0.15f, color), Theme.multAlpha(0.5f, color), Theme.multAlpha(0.6f, color), Theme.multAlpha(0.15f, color));
                this.loadingDrawable.stroke = false;
            }
            backupImageView.setImageDrawable(this.loadingDrawable);
            backupImageView.setScaleX(1.0f);
            backupImageView.setScaleY(1.0f);
            setSelected(false);
            updateImageColor();
            setCounter(0, true, false, false, false);
            if (this.pinned) {
                this.pinned = false;
            }
            updateState();
        }

        public final void setMf(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(true);
            this.isAdd = false;
            this.staticImage = false;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            boolean z2 = peerDialogId == this.topicId;
            this.topicId = peerDialogId;
            TextView textView = this.textView;
            textView.setText(DialogObject.getName(peerDialogId));
            textView.setVisibility(0);
            BackupImageView backupImageView = this.imageView;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            int i = this.currentAccount;
            if (peerDialogId >= 0) {
                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            backupImageView.setScaleX(1.0f);
            backupImageView.setScaleY(1.0f);
            updateState();
            setSelected(z);
            setCounter(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z2);
            if (this.pinned) {
                this.pinned = false;
            }
        }

        public void setReorder(boolean z) {
            this.reorder = z;
            this.layout.invalidate();
        }

        @Override
        public void setSelected(boolean z) {
            int i = 0;
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new TopicsTabsView$VerticalTabView$$ExternalSyntheticLambda0(this, i));
            this.selectAnimator.addListener(new LoginActivity.AnonymousClass9(12, this, z));
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.setDuration(320L);
            this.selectAnimator.start();
        }

        public final void updateImageColor() {
            int i = Theme.key_windowBackgroundWhiteGrayText2;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int iBlendARGB = ColorUtils.blendARGB(this.isAdd ? 1.0f : this.selectT, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            boolean z = this.staticImage;
            BackupImageView backupImageView = this.imageView;
            if (z) {
                backupImageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
            } else {
                backupImageView.setColorFilter(null);
            }
            backupImageView.setEmojiColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
            backupImageView.invalidate();
        }

        public final void updateState() {
            ImageView imageView = this.lineView;
            imageView.setTranslationX((1.0f - this.selectT) * (-AndroidUtilities.dp(3.0f)));
            imageView.setVisibility(this.selectT <= 0.0f ? 8 : 0);
            TextView textView = this.textView;
            int i = Theme.key_windowBackgroundWhiteGrayText2;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            textView.setTextColor(ColorUtils.blendARGB(this.isAdd ? 1.0f : this.selectT, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        }
    }

    public TopicsTabsView(int i, long j, Activity activity, Theme.ResourcesProvider resourcesProvider, ChatActivity chatActivity) {
        ViewGroup viewGroup;
        super(activity);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTopicsVisibility = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, true);
        this.animatorCloseButtonVisibility = new BoolAnimator(0, new TopicsTabsView$$ExternalSyntheticLambda1(this), cubicBezierInterpolator, 320L, false);
        this.sidemenuT = 0.0f;
        this.excludeTopics = new HashSet();
        this.fragment = chatActivity;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        long j2 = -j;
        this.mono = ChatObject.isMonoForum(MessagesController.getInstance(i).getChat(Long.valueOf(j2)));
        boolean zIsBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        this.bot = zIsBotForumWithEditableTopics;
        this.canShowProgress = !NotificationsController$$ExternalSyntheticOutline0.m("topics_end_reached_", j2, UserConfig.getInstance(i).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.topTabsContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.sideTabsContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i2 = 0;
        ?? r0 = new UniversalRecyclerView(activity, i, new Utilities.Callback2(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z;
                TLRPC.User user;
                TopicsTabsView topicsTabsView;
                boolean z2;
                boolean z3;
                TopicsTabsView topicsTabsView2 = this.f$0;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        int i3 = topicsTabsView2.currentAccount;
                        MessagesController messagesController = MessagesController.getInstance(i3);
                        long j3 = topicsTabsView2.dialogId;
                        long j4 = -j3;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j4));
                        TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(j3));
                        TopicsController topicsController = MessagesController.getInstance(i3).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j4);
                        int i4 = TopicsTabsView.HorizontalTabView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                        uItemOfFactory.id = 0;
                        uItemOfFactory.longValue = 0L;
                        uItemOfFactory.object = null;
                        boolean z4 = topicsTabsView2.mono;
                        uItemOfFactory.accent = z4;
                        uItemOfFactory.setChecked(topicsTabsView2.currentTopicId == 0);
                        arrayList.add(uItemOfFactory);
                        boolean z5 = topicsTabsView2.bot;
                        if (topics != null) {
                            int size = topics.size();
                            int i5 = 0;
                            z = false;
                            while (i5 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i5);
                                universalAdapter = universalAdapter;
                                i5++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                chat = chat;
                                if (z5) {
                                    user = user2;
                                    if (tL_forumTopic2.id == 1) {
                                    }
                                    user2 = user;
                                } else {
                                    user = user2;
                                }
                                if (topicsTabsView2.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    user2 = user;
                                } else {
                                    boolean z6 = tL_forumTopic2.pinned;
                                    if (!z6 && z) {
                                        if (!arrayList.isEmpty()) {
                                            ((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).flags |= 8;
                                        }
                                        universalAdapter.reorderSectionEnd();
                                        z = false;
                                    } else if (z6 && !z) {
                                        universalAdapter.reorderSectionStart();
                                        z = true;
                                    }
                                    UItem uItemOfFactory2 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                    uItemOfFactory2.dialogId = j3;
                                    uItemOfFactory2.id = tL_forumTopic2.id;
                                    uItemOfFactory2.object = tL_forumTopic2;
                                    if (z4) {
                                        uItemOfFactory2.longValue = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        uItemOfFactory2.withUsername = false;
                                    }
                                    uItemOfFactory2.setChecked(topicsTabsView2.currentTopicId == (z4 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.id));
                                    arrayList.add(uItemOfFactory2);
                                    user2 = user;
                                    j3 = j3;
                                }
                            }
                        } else {
                            z = false;
                        }
                        UniversalAdapter universalAdapter2 = universalAdapter;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user3 = user2;
                        if (z) {
                            universalAdapter2.reorderSectionEnd();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j4) && topicsTabsView2.canShowProgress) {
                            UItem uItemOfFactory3 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory3.id = -2;
                            uItemOfFactory3.red = true;
                            arrayList.add(uItemOfFactory3);
                            UItem uItemOfFactory4 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory4.id = -3;
                            uItemOfFactory4.red = true;
                            arrayList.add(uItemOfFactory4);
                            UItem uItemOfFactory5 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory5.id = -4;
                            uItemOfFactory5.red = true;
                            arrayList.add(uItemOfFactory5);
                        }
                        if (!z5 && !z4) {
                            if ((chat2 != null && ChatObject.canCreateTopic(chat2)) || UserObject.isBotForumWithEditableTopics(user3)) {
                                UItem uItemOfFactory6 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                uItemOfFactory6.id = -2;
                                uItemOfFactory6.longValue = -2L;
                                uItemOfFactory6.object = null;
                                arrayList.add(uItemOfFactory6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        TopicsController topicsController2 = MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (int iM = 0; iM < arrayList2.size(); iM = LocationController$$ExternalSyntheticOutline0.m(((UItem) arrayList2.get(iM)).id, iM, 1, arrayList3)) {
                        }
                        long j5 = -topicsTabsView2.dialogId;
                        topicsController2.reorderPinnedTopics(j5, arrayList3);
                        topicsController2.sortTopics(j5, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                        int i6 = topicsTabsView2.currentAccount;
                        MessagesController messagesController2 = MessagesController.getInstance(i6);
                        long j6 = topicsTabsView2.dialogId;
                        long j7 = -j6;
                        TLRPC.Chat chat3 = messagesController2.getChat(Long.valueOf(j7));
                        TLRPC.User user4 = MessagesController.getInstance(i6).getUser(Long.valueOf(j6));
                        TopicsController topicsController3 = MessagesController.getInstance(i6).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j7);
                        boolean z7 = topicsTabsView2.mono;
                        boolean z8 = topicsTabsView2.bot;
                        if (z8) {
                            topicsTabsView = topicsTabsView2;
                        } else {
                            int i7 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory7 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory7.id = 0;
                            uItemOfFactory7.longValue = 0L;
                            uItemOfFactory7.object = null;
                            uItemOfFactory7.accent = z7;
                            uItemOfFactory7.flags = z8 ? 1 : 0;
                            topicsTabsView = topicsTabsView2;
                            uItemOfFactory7.setChecked(topicsTabsView.currentTopicId == 0);
                            arrayList4.add(uItemOfFactory7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            boolean z9 = false;
                            int i8 = 0;
                            while (i8 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i8);
                                i8++;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                size2 = size2;
                                if (z8) {
                                    z3 = z9;
                                    if (tL_forumTopic4.id == 1) {
                                        z9 = z3;
                                    }
                                } else {
                                    z3 = z9;
                                }
                                if (topicsTabsView.excludeTopics.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    z9 = z3;
                                } else {
                                    boolean z10 = tL_forumTopic4.pinned;
                                    if (!z10 && z3) {
                                        universalAdapter3.reorderSectionEnd();
                                        z9 = false;
                                    } else if (!z10 || z3) {
                                        z9 = z3;
                                    } else {
                                        universalAdapter3.reorderSectionStart();
                                        z9 = true;
                                    }
                                    int i9 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                    UItem uItemOfFactory8 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                    uItemOfFactory8.dialogId = j6;
                                    long j8 = j6;
                                    uItemOfFactory8.id = tL_forumTopic4.id;
                                    uItemOfFactory8.object = tL_forumTopic4;
                                    if (z7) {
                                        uItemOfFactory8.longValue = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        uItemOfFactory8.withUsername = false;
                                    }
                                    uItemOfFactory8.setChecked(topicsTabsView.currentTopicId == (z7 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.id));
                                    arrayList4.add(uItemOfFactory8);
                                    j6 = j8;
                                }
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            universalAdapter3.reorderSectionEnd();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController3.endIsReached(j7) && topicsTabsView.canShowProgress) {
                            int i10 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory9 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory9.id = -2;
                            uItemOfFactory9.red = true;
                            uItemOfFactory9.checked = false;
                            arrayList4.add(uItemOfFactory9);
                            UItem uItemOfFactory10 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory10.id = -3;
                            uItemOfFactory10.red = true;
                            uItemOfFactory10.checked = false;
                            arrayList4.add(uItemOfFactory10);
                            UItem uItemOfFactory11 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory11.id = -4;
                            uItemOfFactory11.red = true;
                            uItemOfFactory11.checked = false;
                            arrayList4.add(uItemOfFactory11);
                        }
                        if (z8 == 0 && !z7) {
                            if ((chat3 != 0 && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i11 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                UItem uItemOfFactory12 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                uItemOfFactory12.id = -2;
                                uItemOfFactory12.longValue = -2L;
                                uItemOfFactory12.object = null;
                                uItemOfFactory12.accent = false;
                                arrayList4.add(uItemOfFactory12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new TopicsTabsView$$ExternalSyntheticLambda1(this), new TopicsTabsView$$ExternalSyntheticLambda1(this), resourcesProvider) {
            public final AnimatedFloat animateTab;
            public final AnimatedFloat animatedClipL;
            public final AnimatedFloat animatedClipR;
            public final GradientClip clip = new GradientClip();
            public final Paint linePaint;
            public final RectF lineRect;
            public Drawable pinIcon;
            public int pinIconColor;
            public final Paint pinnedBackgroundPaint;

            {
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedClipL = new AnimatedFloat(320L, this, cubicBezierInterpolator2);
                this.animatedClipR = new AnimatedFloat(320L, this, cubicBezierInterpolator2);
                this.lineRect = new RectF();
                this.linePaint = new Paint(1);
                this.animateTab = new AnimatedFloat(420L, this, cubicBezierInterpolator2);
                this.pinnedBackgroundPaint = new Paint(1);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f;
                float f2;
                float f3;
                float f4;
                int i3;
                float f5 = this.animatedClipL.set(canScrollHorizontally(-1));
                float f6 = this.animatedClipR.set(canScrollHorizontally(1));
                int i4 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                boolean z = i4 > 0 || f6 > 0.0f;
                if (z) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    canvas2 = canvas;
                }
                float width = getWidth();
                float x = 0.0f;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView = (HorizontalTabView) childAt;
                        if (horizontalTabView.pinned) {
                            if (width > horizontalTabView.getX()) {
                                width = horizontalTabView.getX();
                                RecyclerView.getChildAdapterPosition(horizontalTabView);
                            }
                            if (x < horizontalTabView.getX() + horizontalTabView.getWidth()) {
                                x = horizontalTabView.getX() + horizontalTabView.getWidth();
                                RecyclerView.getChildAdapterPosition(horizontalTabView);
                            }
                        }
                    }
                }
                Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
                if (x > width) {
                    Paint paint = this.pinnedBackgroundPaint;
                    f = 14.0f;
                    paint.setColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2)));
                    RectF rectF = AndroidUtilities.rectTmp;
                    f2 = 1.0f;
                    rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, x - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                    if (this.pinIcon == null) {
                        this.pinIcon = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
                    }
                    int color = Theme.getColor(Theme.key_chats_pinnedIcon, resourcesProvider2);
                    if (this.pinIconColor != color) {
                        Drawable drawable = this.pinIcon;
                        this.pinIconColor = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    this.pinIcon.setBounds((int) (AndroidUtilities.dp(-17.0f) + x), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (x + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
                    this.pinIcon.draw(canvas2);
                } else {
                    f = 14.0f;
                    f2 = 1.0f;
                }
                super.dispatchDraw(canvas);
                TopicsTabsView topicsTabsView = TopicsTabsView.this;
                long j3 = topicsTabsView.lastSelectedTopicId;
                long j4 = topicsTabsView.currentTopicId;
                AnimatedFloat animatedFloat = this.animateTab;
                if (j3 != j4) {
                    topicsTabsView.animateFromSelectedTopicId = j3;
                    animatedFloat.set(0.0f, true);
                }
                topicsTabsView.lastSelectedTopicId = topicsTabsView.currentTopicId;
                HorizontalTabView horizontalTabView2 = null;
                HorizontalTabView horizontalTabView3 = null;
                int i6 = 0;
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    if (childAt2 instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView4 = (HorizontalTabView) childAt2;
                        if (horizontalTabView4.isAdd) {
                            f4 = f6;
                            i3 = i4;
                        } else {
                            i3 = i4;
                            if (horizontalTabView4.getTopicId() == topicsTabsView.currentTopicId) {
                                horizontalTabView2 = horizontalTabView4;
                            }
                            f4 = f6;
                            if (horizontalTabView4.getTopicId() == topicsTabsView.animateFromSelectedTopicId) {
                                horizontalTabView3 = horizontalTabView4;
                            }
                        }
                    } else {
                        f4 = f6;
                        i3 = i4;
                    }
                    i6++;
                    i4 = i3;
                    f6 = f4;
                }
                float f7 = f6;
                int i7 = i4;
                if (horizontalTabView2 != null) {
                    RectF rectF2 = this.lineRect;
                    rectF2.set(horizontalTabView2.getX() + AndroidUtilities.dp(f2), horizontalTabView2.getY() + AndroidUtilities.dp(4.0f), (horizontalTabView2.getX() + horizontalTabView2.getWidth()) - AndroidUtilities.dp(f2), (horizontalTabView2.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                    if (horizontalTabView3 != null) {
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(horizontalTabView3.getX() + AndroidUtilities.dp(f2), horizontalTabView3.getY() + AndroidUtilities.dp(4.0f), (horizontalTabView3.getX() + horizontalTabView3.getWidth()) - AndroidUtilities.dp(f2), (horizontalTabView3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                        AndroidUtilities.lerp(rectF3, rectF2, animatedFloat.set(1.0f, false), rectF2);
                    }
                    Paint paint2 = this.linePaint;
                    paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider2), 31));
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f), AndroidUtilities.dp(f), paint2);
                }
                if (z) {
                    canvas2.save();
                    GradientClip gradientClip = this.clip;
                    if (i7 > 0) {
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        f3 = 0.0f;
                        rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                        gradientClip.draw(canvas2, rectF4, 0, f5);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f7 > f3) {
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f3, getWidth(), getHeight());
                        gradientClip.draw(canvas2, rectF5, 2, f7);
                    }
                    canvas2.restore();
                    canvas2.restore();
                }
            }

            @Override
            public final Integer getSelectorColor(int i3) {
                return 0;
            }
        };
        this.topTabs = r0;
        final int i3 = 1;
        r0.listenReorder(new Utilities.Callback2(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z;
                TLRPC.User user;
                TopicsTabsView topicsTabsView;
                boolean z2;
                boolean z3;
                TopicsTabsView topicsTabsView2 = this.f$0;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        int i4 = topicsTabsView2.currentAccount;
                        MessagesController messagesController = MessagesController.getInstance(i4);
                        long j3 = topicsTabsView2.dialogId;
                        long j4 = -j3;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j4));
                        TLRPC.User user2 = MessagesController.getInstance(i4).getUser(Long.valueOf(j3));
                        TopicsController topicsController = MessagesController.getInstance(i4).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j4);
                        int i5 = TopicsTabsView.HorizontalTabView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                        uItemOfFactory.id = 0;
                        uItemOfFactory.longValue = 0L;
                        uItemOfFactory.object = null;
                        boolean z4 = topicsTabsView2.mono;
                        uItemOfFactory.accent = z4;
                        uItemOfFactory.setChecked(topicsTabsView2.currentTopicId == 0);
                        arrayList.add(uItemOfFactory);
                        boolean z5 = topicsTabsView2.bot;
                        if (topics != null) {
                            int size = topics.size();
                            int i6 = 0;
                            z = false;
                            while (i6 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i6);
                                universalAdapter = universalAdapter;
                                i6++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                chat = chat;
                                if (z5) {
                                    user = user2;
                                    if (tL_forumTopic2.id == 1) {
                                    }
                                    user2 = user;
                                } else {
                                    user = user2;
                                }
                                if (topicsTabsView2.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    user2 = user;
                                } else {
                                    boolean z6 = tL_forumTopic2.pinned;
                                    if (!z6 && z) {
                                        if (!arrayList.isEmpty()) {
                                            ((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).flags |= 8;
                                        }
                                        universalAdapter.reorderSectionEnd();
                                        z = false;
                                    } else if (z6 && !z) {
                                        universalAdapter.reorderSectionStart();
                                        z = true;
                                    }
                                    UItem uItemOfFactory2 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                    uItemOfFactory2.dialogId = j3;
                                    uItemOfFactory2.id = tL_forumTopic2.id;
                                    uItemOfFactory2.object = tL_forumTopic2;
                                    if (z4) {
                                        uItemOfFactory2.longValue = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        uItemOfFactory2.withUsername = false;
                                    }
                                    uItemOfFactory2.setChecked(topicsTabsView2.currentTopicId == (z4 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.id));
                                    arrayList.add(uItemOfFactory2);
                                    user2 = user;
                                    j3 = j3;
                                }
                            }
                        } else {
                            z = false;
                        }
                        UniversalAdapter universalAdapter2 = universalAdapter;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user3 = user2;
                        if (z) {
                            universalAdapter2.reorderSectionEnd();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j4) && topicsTabsView2.canShowProgress) {
                            UItem uItemOfFactory3 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory3.id = -2;
                            uItemOfFactory3.red = true;
                            arrayList.add(uItemOfFactory3);
                            UItem uItemOfFactory4 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory4.id = -3;
                            uItemOfFactory4.red = true;
                            arrayList.add(uItemOfFactory4);
                            UItem uItemOfFactory5 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory5.id = -4;
                            uItemOfFactory5.red = true;
                            arrayList.add(uItemOfFactory5);
                        }
                        if (!z5 && !z4) {
                            if ((chat2 != null && ChatObject.canCreateTopic(chat2)) || UserObject.isBotForumWithEditableTopics(user3)) {
                                UItem uItemOfFactory6 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                uItemOfFactory6.id = -2;
                                uItemOfFactory6.longValue = -2L;
                                uItemOfFactory6.object = null;
                                arrayList.add(uItemOfFactory6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        TopicsController topicsController2 = MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (int iM = 0; iM < arrayList2.size(); iM = LocationController$$ExternalSyntheticOutline0.m(((UItem) arrayList2.get(iM)).id, iM, 1, arrayList3)) {
                        }
                        long j5 = -topicsTabsView2.dialogId;
                        topicsController2.reorderPinnedTopics(j5, arrayList3);
                        topicsController2.sortTopics(j5, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                        int i7 = topicsTabsView2.currentAccount;
                        MessagesController messagesController2 = MessagesController.getInstance(i7);
                        long j6 = topicsTabsView2.dialogId;
                        long j7 = -j6;
                        TLRPC.Chat chat3 = messagesController2.getChat(Long.valueOf(j7));
                        TLRPC.User user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(j6));
                        TopicsController topicsController3 = MessagesController.getInstance(i7).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j7);
                        boolean z7 = topicsTabsView2.mono;
                        boolean z8 = topicsTabsView2.bot;
                        if (z8) {
                            topicsTabsView = topicsTabsView2;
                        } else {
                            int i8 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory7 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory7.id = 0;
                            uItemOfFactory7.longValue = 0L;
                            uItemOfFactory7.object = null;
                            uItemOfFactory7.accent = z7;
                            uItemOfFactory7.flags = z8 ? 1 : 0;
                            topicsTabsView = topicsTabsView2;
                            uItemOfFactory7.setChecked(topicsTabsView.currentTopicId == 0);
                            arrayList4.add(uItemOfFactory7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            boolean z9 = false;
                            int i9 = 0;
                            while (i9 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i9);
                                i9++;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                size2 = size2;
                                if (z8) {
                                    z3 = z9;
                                    if (tL_forumTopic4.id == 1) {
                                        z9 = z3;
                                    }
                                } else {
                                    z3 = z9;
                                }
                                if (topicsTabsView.excludeTopics.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    z9 = z3;
                                } else {
                                    boolean z10 = tL_forumTopic4.pinned;
                                    if (!z10 && z3) {
                                        universalAdapter3.reorderSectionEnd();
                                        z9 = false;
                                    } else if (!z10 || z3) {
                                        z9 = z3;
                                    } else {
                                        universalAdapter3.reorderSectionStart();
                                        z9 = true;
                                    }
                                    int i10 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                    UItem uItemOfFactory8 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                    uItemOfFactory8.dialogId = j6;
                                    long j8 = j6;
                                    uItemOfFactory8.id = tL_forumTopic4.id;
                                    uItemOfFactory8.object = tL_forumTopic4;
                                    if (z7) {
                                        uItemOfFactory8.longValue = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        uItemOfFactory8.withUsername = false;
                                    }
                                    uItemOfFactory8.setChecked(topicsTabsView.currentTopicId == (z7 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.id));
                                    arrayList4.add(uItemOfFactory8);
                                    j6 = j8;
                                }
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            universalAdapter3.reorderSectionEnd();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController3.endIsReached(j7) && topicsTabsView.canShowProgress) {
                            int i11 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory9 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory9.id = -2;
                            uItemOfFactory9.red = true;
                            uItemOfFactory9.checked = false;
                            arrayList4.add(uItemOfFactory9);
                            UItem uItemOfFactory10 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory10.id = -3;
                            uItemOfFactory10.red = true;
                            uItemOfFactory10.checked = false;
                            arrayList4.add(uItemOfFactory10);
                            UItem uItemOfFactory11 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory11.id = -4;
                            uItemOfFactory11.red = true;
                            uItemOfFactory11.checked = false;
                            arrayList4.add(uItemOfFactory11);
                        }
                        if (z8 == 0 && !z7) {
                            if ((chat3 != 0 && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i12 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                UItem uItemOfFactory12 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                uItemOfFactory12.id = -2;
                                uItemOfFactory12.longValue = -2L;
                                uItemOfFactory12.object = null;
                                uItemOfFactory12.accent = false;
                                arrayList4.add(uItemOfFactory12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        r0.setWillNotDraw(false);
        r0.adapter.applyBackground = false;
        r0.getContext();
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((ViewGroup) r0, 7);
        r0.layoutManager = anonymousClass2;
        r0.setLayoutManager(anonymousClass2);
        frameLayout.addView((View) r0, LayoutHelper.createFrame(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        final int i4 = 0;
        r0.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final TopicsTabsView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                switch (i4) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.this$0;
                        if (topicsTabsView.isLoadingVisible()) {
                            topicsTabsView.loadMore();
                        }
                        break;
                    default:
                        TopicsTabsView topicsTabsView2 = this.this$0;
                        if (topicsTabsView2.isLoadingVisible()) {
                            topicsTabsView2.loadMore();
                        }
                        break;
                }
            }
        });
        if (zIsBotForumWithEditableTopics) {
            VerticalTabView verticalTabView = new VerticalTabView(activity, i, resourcesProvider);
            this.botCreateTopicButtonVertical = verticalTabView;
            verticalTabView.setAll(true, false, this.currentTopicId == 0);
            final int i5 = 2;
            verticalTabView.setOnClickListener(new View.OnClickListener(this) {
                public final TopicsTabsView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            TopicsTabsView topicsTabsView = this.f$0;
                            Boolean bool = topicsTabsView.pendingSidemenu;
                            topicsTabsView.animateSidemenuTo(bool == null ? !topicsTabsView.sidemenuEnabled : !bool.booleanValue());
                            break;
                        case 1:
                            TopicsTabsView topicsTabsView2 = this.f$0;
                            TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                            anonymousClass3.allowReorder(false);
                            TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                            anonymousClass1.allowReorder(false);
                            topicsTabsView2.animatorCloseButtonVisibility.setValue(false, true);
                            AndroidUtilities.updateVisibleRows(anonymousClass3);
                            AndroidUtilities.updateVisibleRows(anonymousClass1);
                            break;
                        default:
                            this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(verticalTabView, LayoutHelper.createFrame(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.botCreateTopicButtonVertical = null;
        }
        final int i6 = 2;
        ViewGroup viewGroup2 = viewGroup;
        ?? r1 = new UniversalRecyclerView(activity, i, new Utilities.Callback2(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z;
                TLRPC.User user;
                TopicsTabsView topicsTabsView;
                boolean z2;
                boolean z3;
                TopicsTabsView topicsTabsView2 = this.f$0;
                switch (i6) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        int i7 = topicsTabsView2.currentAccount;
                        MessagesController messagesController = MessagesController.getInstance(i7);
                        long j3 = topicsTabsView2.dialogId;
                        long j4 = -j3;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j4));
                        TLRPC.User user2 = MessagesController.getInstance(i7).getUser(Long.valueOf(j3));
                        TopicsController topicsController = MessagesController.getInstance(i7).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j4);
                        int i8 = TopicsTabsView.HorizontalTabView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                        uItemOfFactory.id = 0;
                        uItemOfFactory.longValue = 0L;
                        uItemOfFactory.object = null;
                        boolean z4 = topicsTabsView2.mono;
                        uItemOfFactory.accent = z4;
                        uItemOfFactory.setChecked(topicsTabsView2.currentTopicId == 0);
                        arrayList.add(uItemOfFactory);
                        boolean z5 = topicsTabsView2.bot;
                        if (topics != null) {
                            int size = topics.size();
                            int i9 = 0;
                            z = false;
                            while (i9 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i9);
                                universalAdapter = universalAdapter;
                                i9++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                chat = chat;
                                if (z5) {
                                    user = user2;
                                    if (tL_forumTopic2.id == 1) {
                                    }
                                    user2 = user;
                                } else {
                                    user = user2;
                                }
                                if (topicsTabsView2.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    user2 = user;
                                } else {
                                    boolean z6 = tL_forumTopic2.pinned;
                                    if (!z6 && z) {
                                        if (!arrayList.isEmpty()) {
                                            ((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).flags |= 8;
                                        }
                                        universalAdapter.reorderSectionEnd();
                                        z = false;
                                    } else if (z6 && !z) {
                                        universalAdapter.reorderSectionStart();
                                        z = true;
                                    }
                                    UItem uItemOfFactory2 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                    uItemOfFactory2.dialogId = j3;
                                    uItemOfFactory2.id = tL_forumTopic2.id;
                                    uItemOfFactory2.object = tL_forumTopic2;
                                    if (z4) {
                                        uItemOfFactory2.longValue = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        uItemOfFactory2.withUsername = false;
                                    }
                                    uItemOfFactory2.setChecked(topicsTabsView2.currentTopicId == (z4 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.id));
                                    arrayList.add(uItemOfFactory2);
                                    user2 = user;
                                    j3 = j3;
                                }
                            }
                        } else {
                            z = false;
                        }
                        UniversalAdapter universalAdapter2 = universalAdapter;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user3 = user2;
                        if (z) {
                            universalAdapter2.reorderSectionEnd();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j4) && topicsTabsView2.canShowProgress) {
                            UItem uItemOfFactory3 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory3.id = -2;
                            uItemOfFactory3.red = true;
                            arrayList.add(uItemOfFactory3);
                            UItem uItemOfFactory4 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory4.id = -3;
                            uItemOfFactory4.red = true;
                            arrayList.add(uItemOfFactory4);
                            UItem uItemOfFactory5 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory5.id = -4;
                            uItemOfFactory5.red = true;
                            arrayList.add(uItemOfFactory5);
                        }
                        if (!z5 && !z4) {
                            if ((chat2 != null && ChatObject.canCreateTopic(chat2)) || UserObject.isBotForumWithEditableTopics(user3)) {
                                UItem uItemOfFactory6 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                uItemOfFactory6.id = -2;
                                uItemOfFactory6.longValue = -2L;
                                uItemOfFactory6.object = null;
                                arrayList.add(uItemOfFactory6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        TopicsController topicsController2 = MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (int iM = 0; iM < arrayList2.size(); iM = LocationController$$ExternalSyntheticOutline0.m(((UItem) arrayList2.get(iM)).id, iM, 1, arrayList3)) {
                        }
                        long j5 = -topicsTabsView2.dialogId;
                        topicsController2.reorderPinnedTopics(j5, arrayList3);
                        topicsController2.sortTopics(j5, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                        int i10 = topicsTabsView2.currentAccount;
                        MessagesController messagesController2 = MessagesController.getInstance(i10);
                        long j6 = topicsTabsView2.dialogId;
                        long j7 = -j6;
                        TLRPC.Chat chat3 = messagesController2.getChat(Long.valueOf(j7));
                        TLRPC.User user4 = MessagesController.getInstance(i10).getUser(Long.valueOf(j6));
                        TopicsController topicsController3 = MessagesController.getInstance(i10).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j7);
                        boolean z7 = topicsTabsView2.mono;
                        boolean z8 = topicsTabsView2.bot;
                        if (z8) {
                            topicsTabsView = topicsTabsView2;
                        } else {
                            int i11 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory7 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory7.id = 0;
                            uItemOfFactory7.longValue = 0L;
                            uItemOfFactory7.object = null;
                            uItemOfFactory7.accent = z7;
                            uItemOfFactory7.flags = z8 ? 1 : 0;
                            topicsTabsView = topicsTabsView2;
                            uItemOfFactory7.setChecked(topicsTabsView.currentTopicId == 0);
                            arrayList4.add(uItemOfFactory7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            boolean z9 = false;
                            int i12 = 0;
                            while (i12 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i12);
                                i12++;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                size2 = size2;
                                if (z8) {
                                    z3 = z9;
                                    if (tL_forumTopic4.id == 1) {
                                        z9 = z3;
                                    }
                                } else {
                                    z3 = z9;
                                }
                                if (topicsTabsView.excludeTopics.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    z9 = z3;
                                } else {
                                    boolean z10 = tL_forumTopic4.pinned;
                                    if (!z10 && z3) {
                                        universalAdapter3.reorderSectionEnd();
                                        z9 = false;
                                    } else if (!z10 || z3) {
                                        z9 = z3;
                                    } else {
                                        universalAdapter3.reorderSectionStart();
                                        z9 = true;
                                    }
                                    int i13 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                    UItem uItemOfFactory8 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                    uItemOfFactory8.dialogId = j6;
                                    long j8 = j6;
                                    uItemOfFactory8.id = tL_forumTopic4.id;
                                    uItemOfFactory8.object = tL_forumTopic4;
                                    if (z7) {
                                        uItemOfFactory8.longValue = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        uItemOfFactory8.withUsername = false;
                                    }
                                    uItemOfFactory8.setChecked(topicsTabsView.currentTopicId == (z7 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.id));
                                    arrayList4.add(uItemOfFactory8);
                                    j6 = j8;
                                }
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            universalAdapter3.reorderSectionEnd();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController3.endIsReached(j7) && topicsTabsView.canShowProgress) {
                            int i14 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory9 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory9.id = -2;
                            uItemOfFactory9.red = true;
                            uItemOfFactory9.checked = false;
                            arrayList4.add(uItemOfFactory9);
                            UItem uItemOfFactory10 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory10.id = -3;
                            uItemOfFactory10.red = true;
                            uItemOfFactory10.checked = false;
                            arrayList4.add(uItemOfFactory10);
                            UItem uItemOfFactory11 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory11.id = -4;
                            uItemOfFactory11.red = true;
                            uItemOfFactory11.checked = false;
                            arrayList4.add(uItemOfFactory11);
                        }
                        if (z8 == 0 && !z7) {
                            if ((chat3 != 0 && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i15 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                UItem uItemOfFactory12 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                uItemOfFactory12.id = -2;
                                uItemOfFactory12.longValue = -2L;
                                uItemOfFactory12.object = null;
                                uItemOfFactory12.accent = false;
                                arrayList4.add(uItemOfFactory12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new TopicsTabsView$$ExternalSyntheticLambda1(this), new TopicsTabsView$$ExternalSyntheticLambda1(this), resourcesProvider) {
            public Drawable pinIcon;
            public int pinIconColor;
            public final GradientClip clip = new GradientClip();
            public final AnimatedFloat animatedClip = new AnimatedFloat(320, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            public final Paint pinnedBackgroundPaint = new Paint(1);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f = this.animatedClip.set(canScrollVertically(-1));
                if (f > 0.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    canvas2 = canvas;
                }
                float height = getHeight();
                float y = 0.0f;
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt instanceof VerticalTabView) {
                        VerticalTabView verticalTabView2 = (VerticalTabView) childAt;
                        if (verticalTabView2.pinned) {
                            if (height > verticalTabView2.getY()) {
                                height = verticalTabView2.getY();
                                RecyclerView.getChildAdapterPosition(verticalTabView2);
                            }
                            if (y < verticalTabView2.getY() + verticalTabView2.getHeight()) {
                                y = verticalTabView2.getY() + verticalTabView2.getHeight();
                                RecyclerView.getChildAdapterPosition(verticalTabView2);
                            }
                        }
                    }
                }
                if (y > height) {
                    Paint paint = this.pinnedBackgroundPaint;
                    int i8 = Theme.key_chats_pinnedOverlay;
                    Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
                    paint.setColor(Theme.getColor(i8, resourcesProvider2));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (AndroidUtilities.dp(56.0f) + getWidth()) / 2.0f, y);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    if (this.pinIcon == null) {
                        this.pinIcon = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
                    }
                    int color = Theme.getColor(Theme.key_chats_pinnedIcon, resourcesProvider2);
                    if (this.pinIconColor != color) {
                        Drawable drawable = this.pinIcon;
                        this.pinIconColor = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    this.pinIcon.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
                    this.pinIcon.draw(canvas2);
                }
                super.dispatchDraw(canvas2);
                if (f > 0.0f) {
                    canvas2.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
                    this.clip.draw(canvas2, rectF2, 1, f);
                    canvas2.restore();
                    canvas2.restore();
                }
            }
        };
        this.sideTabs = r1;
        final int i7 = 1;
        r1.listenReorder(new Utilities.Callback2(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                boolean z;
                TLRPC.User user;
                TopicsTabsView topicsTabsView;
                boolean z2;
                boolean z3;
                TopicsTabsView topicsTabsView2 = this.f$0;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        int i8 = topicsTabsView2.currentAccount;
                        MessagesController messagesController = MessagesController.getInstance(i8);
                        long j3 = topicsTabsView2.dialogId;
                        long j4 = -j3;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j4));
                        TLRPC.User user2 = MessagesController.getInstance(i8).getUser(Long.valueOf(j3));
                        TopicsController topicsController = MessagesController.getInstance(i8).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j4);
                        int i9 = TopicsTabsView.HorizontalTabView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                        uItemOfFactory.id = 0;
                        uItemOfFactory.longValue = 0L;
                        uItemOfFactory.object = null;
                        boolean z4 = topicsTabsView2.mono;
                        uItemOfFactory.accent = z4;
                        uItemOfFactory.setChecked(topicsTabsView2.currentTopicId == 0);
                        arrayList.add(uItemOfFactory);
                        boolean z5 = topicsTabsView2.bot;
                        if (topics != null) {
                            int size = topics.size();
                            int i10 = 0;
                            z = false;
                            while (i10 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                                universalAdapter = universalAdapter;
                                i10++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                chat = chat;
                                if (z5) {
                                    user = user2;
                                    if (tL_forumTopic2.id == 1) {
                                    }
                                    user2 = user;
                                } else {
                                    user = user2;
                                }
                                if (topicsTabsView2.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    user2 = user;
                                } else {
                                    boolean z6 = tL_forumTopic2.pinned;
                                    if (!z6 && z) {
                                        if (!arrayList.isEmpty()) {
                                            ((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).flags |= 8;
                                        }
                                        universalAdapter.reorderSectionEnd();
                                        z = false;
                                    } else if (z6 && !z) {
                                        universalAdapter.reorderSectionStart();
                                        z = true;
                                    }
                                    UItem uItemOfFactory2 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                    uItemOfFactory2.dialogId = j3;
                                    uItemOfFactory2.id = tL_forumTopic2.id;
                                    uItemOfFactory2.object = tL_forumTopic2;
                                    if (z4) {
                                        uItemOfFactory2.longValue = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        uItemOfFactory2.withUsername = false;
                                    }
                                    uItemOfFactory2.setChecked(topicsTabsView2.currentTopicId == (z4 ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : (long) tL_forumTopic2.id));
                                    arrayList.add(uItemOfFactory2);
                                    user2 = user;
                                    j3 = j3;
                                }
                            }
                        } else {
                            z = false;
                        }
                        UniversalAdapter universalAdapter2 = universalAdapter;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user3 = user2;
                        if (z) {
                            universalAdapter2.reorderSectionEnd();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(j4) && topicsTabsView2.canShowProgress) {
                            UItem uItemOfFactory3 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory3.id = -2;
                            uItemOfFactory3.red = true;
                            arrayList.add(uItemOfFactory3);
                            UItem uItemOfFactory4 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory4.id = -3;
                            uItemOfFactory4.red = true;
                            arrayList.add(uItemOfFactory4);
                            UItem uItemOfFactory5 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                            uItemOfFactory5.id = -4;
                            uItemOfFactory5.red = true;
                            arrayList.add(uItemOfFactory5);
                        }
                        if (!z5 && !z4) {
                            if ((chat2 != null && ChatObject.canCreateTopic(chat2)) || UserObject.isBotForumWithEditableTopics(user3)) {
                                UItem uItemOfFactory6 = UItem.ofFactory(TopicsTabsView.HorizontalTabView.Factory.class);
                                uItemOfFactory6.id = -2;
                                uItemOfFactory6.longValue = -2L;
                                uItemOfFactory6.object = null;
                                arrayList.add(uItemOfFactory6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        TopicsController topicsController2 = MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (int iM = 0; iM < arrayList2.size(); iM = LocationController$$ExternalSyntheticOutline0.m(((UItem) arrayList2.get(iM)).id, iM, 1, arrayList3)) {
                        }
                        long j5 = -topicsTabsView2.dialogId;
                        topicsController2.reorderPinnedTopics(j5, arrayList3);
                        topicsController2.sortTopics(j5, false);
                        break;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        UniversalAdapter universalAdapter3 = (UniversalAdapter) obj2;
                        int i11 = topicsTabsView2.currentAccount;
                        MessagesController messagesController2 = MessagesController.getInstance(i11);
                        long j6 = topicsTabsView2.dialogId;
                        long j7 = -j6;
                        TLRPC.Chat chat3 = messagesController2.getChat(Long.valueOf(j7));
                        TLRPC.User user4 = MessagesController.getInstance(i11).getUser(Long.valueOf(j6));
                        TopicsController topicsController3 = MessagesController.getInstance(i11).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j7);
                        boolean z7 = topicsTabsView2.mono;
                        boolean z8 = topicsTabsView2.bot;
                        if (z8) {
                            topicsTabsView = topicsTabsView2;
                        } else {
                            int i12 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory7 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory7.id = 0;
                            uItemOfFactory7.longValue = 0L;
                            uItemOfFactory7.object = null;
                            uItemOfFactory7.accent = z7;
                            uItemOfFactory7.flags = z8 ? 1 : 0;
                            topicsTabsView = topicsTabsView2;
                            uItemOfFactory7.setChecked(topicsTabsView.currentTopicId == 0);
                            arrayList4.add(uItemOfFactory7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            boolean z9 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i13);
                                i13++;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                size2 = size2;
                                if (z8) {
                                    z3 = z9;
                                    if (tL_forumTopic4.id == 1) {
                                        z9 = z3;
                                    }
                                } else {
                                    z3 = z9;
                                }
                                if (topicsTabsView.excludeTopics.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    z9 = z3;
                                } else {
                                    boolean z10 = tL_forumTopic4.pinned;
                                    if (!z10 && z3) {
                                        universalAdapter3.reorderSectionEnd();
                                        z9 = false;
                                    } else if (!z10 || z3) {
                                        z9 = z3;
                                    } else {
                                        universalAdapter3.reorderSectionStart();
                                        z9 = true;
                                    }
                                    int i14 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                    UItem uItemOfFactory8 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                    uItemOfFactory8.dialogId = j6;
                                    long j8 = j6;
                                    uItemOfFactory8.id = tL_forumTopic4.id;
                                    uItemOfFactory8.object = tL_forumTopic4;
                                    if (z7) {
                                        uItemOfFactory8.longValue = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        uItemOfFactory8.withUsername = false;
                                    }
                                    uItemOfFactory8.setChecked(topicsTabsView.currentTopicId == (z7 ? DialogObject.getPeerDialogId(tL_forumTopic4.from_id) : (long) tL_forumTopic4.id));
                                    arrayList4.add(uItemOfFactory8);
                                    j6 = j8;
                                }
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            universalAdapter3.reorderSectionEnd();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController3.endIsReached(j7) && topicsTabsView.canShowProgress) {
                            int i15 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                            UItem uItemOfFactory9 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory9.id = -2;
                            uItemOfFactory9.red = true;
                            uItemOfFactory9.checked = false;
                            arrayList4.add(uItemOfFactory9);
                            UItem uItemOfFactory10 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory10.id = -3;
                            uItemOfFactory10.red = true;
                            uItemOfFactory10.checked = false;
                            arrayList4.add(uItemOfFactory10);
                            UItem uItemOfFactory11 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                            uItemOfFactory11.id = -4;
                            uItemOfFactory11.red = true;
                            uItemOfFactory11.checked = false;
                            arrayList4.add(uItemOfFactory11);
                        }
                        if (z8 == 0 && !z7) {
                            if ((chat3 != 0 && ChatObject.canCreateTopic(chat3)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i16 = TopicsTabsView.VerticalTabView.Factory.$r8$clinit;
                                UItem uItemOfFactory12 = UItem.ofFactory(TopicsTabsView.VerticalTabView.Factory.class);
                                uItemOfFactory12.id = -2;
                                uItemOfFactory12.longValue = -2L;
                                uItemOfFactory12.object = null;
                                uItemOfFactory12.accent = false;
                                arrayList4.add(uItemOfFactory12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        r1.adapter.applyBackground = false;
        r1.setClipToPadding(false);
        r1.setClipChildren(false);
        viewGroup2.addView((View) r1, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, zIsBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        final int i8 = 1;
        r1.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final TopicsTabsView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                switch (i8) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.this$0;
                        if (topicsTabsView.isLoadingVisible()) {
                            topicsTabsView.loadMore();
                        }
                        break;
                    default:
                        TopicsTabsView topicsTabsView2 = this.this$0;
                        if (topicsTabsView2.isLoadingVisible()) {
                            topicsTabsView2.loadMore();
                        }
                        break;
                }
            }
        });
        int i9 = R.drawable.menu_sidebar_left;
        final int i10 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.f$0;
                        Boolean bool = topicsTabsView.pendingSidemenu;
                        topicsTabsView.animateSidemenuTo(bool == null ? !topicsTabsView.sidemenuEnabled : !bool.booleanValue());
                        break;
                    case 1:
                        TopicsTabsView topicsTabsView2 = this.f$0;
                        TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                        anonymousClass3.allowReorder(false);
                        TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                        anonymousClass1.allowReorder(false);
                        topicsTabsView2.animatorCloseButtonVisibility.setValue(false, true);
                        AndroidUtilities.updateVisibleRows(anonymousClass3);
                        AndroidUtilities.updateVisibleRows(anonymousClass1);
                        break;
                    default:
                        this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                        break;
                }
            }
        };
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(i9);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(onClickListener);
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        this.toggleButtonTop = imageView;
        final int i11 = 0;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.f$0;
                        Boolean bool = topicsTabsView.pendingSidemenu;
                        topicsTabsView.animateSidemenuTo(bool == null ? !topicsTabsView.sidemenuEnabled : !bool.booleanValue());
                        break;
                    case 1:
                        TopicsTabsView topicsTabsView2 = this.f$0;
                        TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                        anonymousClass3.allowReorder(false);
                        TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                        anonymousClass1.allowReorder(false);
                        topicsTabsView2.animatorCloseButtonVisibility.setValue(false, true);
                        AndroidUtilities.updateVisibleRows(anonymousClass3);
                        AndroidUtilities.updateVisibleRows(anonymousClass1);
                        break;
                    default:
                        this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(i9);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(onClickListener2);
        ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
        this.toggleButtonSide = imageView2;
        frameLayout.addView(imageView, LayoutHelper.createFrame(44, 36, 51));
        viewGroup2.addView(imageView2, LayoutHelper.createFrame(64, 48, 51));
        int i12 = R.drawable.msg_select;
        final int i13 = 1;
        View.OnClickListener onClickListener3 = new View.OnClickListener(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.f$0;
                        Boolean bool = topicsTabsView.pendingSidemenu;
                        topicsTabsView.animateSidemenuTo(bool == null ? !topicsTabsView.sidemenuEnabled : !bool.booleanValue());
                        break;
                    case 1:
                        TopicsTabsView topicsTabsView2 = this.f$0;
                        TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                        anonymousClass3.allowReorder(false);
                        TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                        anonymousClass1.allowReorder(false);
                        topicsTabsView2.animatorCloseButtonVisibility.setValue(false, true);
                        AndroidUtilities.updateVisibleRows(anonymousClass3);
                        AndroidUtilities.updateVisibleRows(anonymousClass1);
                        break;
                    default:
                        this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                        break;
                }
            }
        };
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(i12);
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(onClickListener3);
        ScaleStateListAnimator.apply(imageView3, 0.1f, 1.5f);
        this.closeButtonTop = imageView3;
        final int i14 = 1;
        View.OnClickListener onClickListener4 = new View.OnClickListener(this) {
            public final TopicsTabsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        TopicsTabsView topicsTabsView = this.f$0;
                        Boolean bool = topicsTabsView.pendingSidemenu;
                        topicsTabsView.animateSidemenuTo(bool == null ? !topicsTabsView.sidemenuEnabled : !bool.booleanValue());
                        break;
                    case 1:
                        TopicsTabsView topicsTabsView2 = this.f$0;
                        TopicsTabsView.AnonymousClass3 anonymousClass3 = topicsTabsView2.sideTabs;
                        anonymousClass3.allowReorder(false);
                        TopicsTabsView.AnonymousClass1 anonymousClass1 = topicsTabsView2.topTabs;
                        anonymousClass1.allowReorder(false);
                        topicsTabsView2.animatorCloseButtonVisibility.setValue(false, true);
                        AndroidUtilities.updateVisibleRows(anonymousClass3);
                        AndroidUtilities.updateVisibleRows(anonymousClass1);
                        break;
                    default:
                        this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                        break;
                }
            }
        };
        ImageView imageView4 = new ImageView(activity);
        imageView4.setImageResource(i12);
        imageView4.setScaleType(scaleType);
        imageView4.setOnClickListener(onClickListener4);
        ScaleStateListAnimator.apply(imageView4, 0.1f, 1.5f);
        this.closeButtonSide = imageView4;
        frameLayout.addView(imageView3, LayoutHelper.createFrame(44, 36, 51));
        viewGroup2.addView(imageView4, LayoutHelper.createFrame(64, 48, 51));
        MessagesController.getInstance(i).getTopicsController().loadTopics(j2, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        if (NotificationsController$$ExternalSyntheticOutline0.m("topicssidetabs", j, mainSettings, false)) {
            this.sidemenuT = 1.0f;
            this.sidemenuEnabled = true;
        }
        boolean zM = NotificationsController$$ExternalSyntheticOutline0.m("topicssidetabsb", j, mainSettings, false);
        this.topicBottom = zM;
        imageView2.setImageResource(zM ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        checkTopicsVisibility(false);
        checkUi_closeButtonVisibility();
        updateSidemenuPosition();
        updateTabs$1();
    }

    private void setAttached(boolean z) {
        if (this.notificationsAttached == z) {
            return;
        }
        this.notificationsAttached = z;
        long j = this.dialogId;
        int i = this.currentAccount;
        if (z) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i).getTopicsController().onTopicFragmentResume(-j);
        } else {
            MessagesController.getInstance(i).getTopicsController().onTopicFragmentPause(-j);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    public final void animateSidemenuTo(boolean z) {
        if (this.sidemenuEnabled == z) {
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.sidemenuAnimating) {
                this.pendingSidemenu = Boolean.valueOf(z);
                return;
            }
        }
        if (!z) {
            this.topicBottom = !this.topicBottom;
        }
        this.sidemenuEnabled = z;
        this.sidemenuAnimating = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.sidemenuT, z ? 1.0f : 0.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 27));
        this.animator.addListener(new AnonymousClass5(z));
        this.animator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
        this.animator.setDuration(250L);
        this.animator.start();
    }

    public final void checkTopicsVisibility(boolean z) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.dialogId);
        this.animatorTopicsVisibility.setValue((topics == null || topics.isEmpty() || this.allTopicsHidden) ? false : true, z);
    }

    public final void checkUi_closeButtonVisibility() {
        BoolAnimator boolAnimator = this.animatorCloseButtonVisibility;
        float f = boolAnimator.floatValue;
        ImageView imageView = this.closeButtonTop;
        imageView.setAlpha(f);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
        imageView.setVisibility(f > 0.0f ? 0 : 8);
        ImageView imageView2 = this.closeButtonSide;
        imageView2.setAlpha(f);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
        imageView2.setVisibility(f > 0.0f ? 0 : 8);
        float f2 = 1.0f - boolAnimator.floatValue;
        ImageView imageView3 = this.toggleButtonTop;
        imageView3.setAlpha(f2);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f2));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f2));
        imageView3.setVisibility(f2 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.toggleButtonSide;
        imageView4.setAlpha(f2);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f2));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f2));
        imageView4.setVisibility(f2 > 0.0f ? 0 : 8);
    }

    public final void checkUi_topicsVerticalPosition() {
        float fLerp = AndroidUtilities.lerp(1.0f, 0.0f, this.sidemenuT);
        FrameLayout frameLayout = this.topTabsContainer;
        frameLayout.setAlpha(fLerp);
        frameLayout.setVisibility((1.0f - this.sidemenuT) * this.animatorTopicsVisibility.floatValue > 0.0f ? 0 : 8);
        if (this.topicBottom) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.sideMenuBackgroundMarginBottom) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, getTabsVisibility(Position.BOTTOM)));
        } else {
            frameLayout.setTranslationY(this.sideMenuBackgroundMarginTop + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, getTabsVisibility(Position.TOP)));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.topicsDidLoaded;
        long j = this.dialogId;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() != (-j)) {
                return;
            }
            updateTabs$1();
        } else {
            if (i != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).getTopicsController().sortTopics(-j, false);
            updateTabs$1();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.sideTabsContainer;
        if (frameLayout.getVisibility() == 0) {
            this.sideMenuBackgroundDrawable.setBounds((int) frameLayout.getTranslationX(), (int) this.sideMenuBackgroundMarginTop, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.sideMenuBackgroundMarginBottom));
            this.sideMenuBackgroundDrawable.draw(canvas);
        }
        FrameLayout frameLayout2 = this.topTabsContainer;
        if (frameLayout2.getVisibility() == 0) {
            this.topMenuBackgroundDrawable.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.topMenuBackgroundDrawable.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.topMenuBackgroundDrawable.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        if (view == this.sideTabsContainer) {
            canvas.clipPath(this.sideMenuBackgroundDrawable.boundProps.path);
        }
        if (view == this.topTabsContainer) {
            canvas.clipPath(this.topMenuBackgroundDrawable.boundProps.path);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public Position getCurrentTabsPosition() {
        if (this.sidemenuEnabled) {
            return Position.LEFT;
        }
        return this.topicBottom ? Position.BOTTOM : Position.TOP;
    }

    public float getSideMenuT() {
        return this.sidemenuT * this.animatorTopicsVisibility.floatValue;
    }

    public final float getTabsVisibility(Position position) {
        float f = this.animatorTopicsVisibility.floatValue;
        if (position == Position.LEFT) {
            return this.sidemenuT * f;
        }
        if ((position != Position.TOP || this.topicBottom) && !(position == Position.BOTTOM && this.topicBottom)) {
            return 0.0f;
        }
        return (1.0f - this.sidemenuT) * f;
    }

    public final boolean isLoadingVisible() {
        if (this.sidemenuT > 0.5f) {
            int i = 0;
            while (true) {
                AnonymousClass3 anonymousClass3 = this.sideTabs;
                if (i >= anonymousClass3.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass3.getChildAt(i);
                anonymousClass3.getClass();
                UItem item = anonymousClass3.adapter.getItem(RecyclerView.getChildAdapterPosition(childAt));
                if (item != null && item.red) {
                    return true;
                }
                i++;
            }
        } else {
            int i2 = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = this.topTabs;
                if (i2 < anonymousClass1.getChildCount()) {
                    View childAt2 = anonymousClass1.getChildAt(i2);
                    anonymousClass1.getClass();
                    UItem item2 = anonymousClass1.adapter.getItem(RecyclerView.getChildAdapterPosition(childAt2));
                    if (item2 != null && item2.red) {
                        return true;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final void loadMore() {
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        long j = this.dialogId;
        if (topicsController.endIsReached(-j)) {
            return;
        }
        topicsController.loadTopics(-j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateSidemenuPosition();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkUi_topicsVerticalPosition();
    }

    public final void selectTopic(long j, boolean z) {
        if (this.mono) {
            Utilities.Callback2 callback2 = this.onDialogSelected;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        Utilities.Callback2 callback3 = this.onTopicSelected;
        if (callback3 != null) {
            callback3.run(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public void setAllTopicsHidden(boolean z) {
        if (this.allTopicsHidden != z) {
            this.allTopicsHidden = z;
            checkTopicsVisibility(true);
        }
    }

    public void setCurrentTopic(long j) {
        this.currentTopicId = j;
        AnonymousClass1 anonymousClass1 = this.topTabs;
        anonymousClass1.adapter.update(true);
        anonymousClass1.invalidate();
        this.sideTabs.adapter.update(true);
        VerticalTabView verticalTabView = this.botCreateTopicButtonVertical;
        if (verticalTabView != null) {
            verticalTabView.setAll(true, false, j == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.onDialogSelected = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.onTopicCreated = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.onTopicSelected = callback2;
    }

    public void setSideMenuBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.sideMenuBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(16.0f));
        this.sideMenuBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f) {
        this.sideMenuBackgroundMarginBottom = f;
        checkUi_topicsVerticalPosition();
        FrameLayout frameLayout = this.sideTabsContainer;
        int paddingBottom = frameLayout.getPaddingBottom();
        int iRound = Math.round(this.sideMenuBackgroundMarginBottom + this.sideMenuBackgroundMarginTop);
        if (paddingBottom != iRound) {
            frameLayout.setPadding(0, 0, 0, iRound);
        }
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f) {
        this.sideMenuBackgroundMarginTop = f;
        FrameLayout frameLayout = this.sideTabsContainer;
        frameLayout.setTranslationY(f);
        checkUi_topicsVerticalPosition();
        int paddingBottom = frameLayout.getPaddingBottom();
        int iRound = Math.round(this.sideMenuBackgroundMarginBottom + this.sideMenuBackgroundMarginTop);
        if (paddingBottom != iRound) {
            frameLayout.setPadding(0, 0, 0, iRound);
        }
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.topMenuBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(18.0f));
        this.topMenuBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
    }

    public final void updateSidemenuPosition() {
        ChatActivity$$ExternalSyntheticLambda11 chatActivity$$ExternalSyntheticLambda11 = this.onUpdateSideMenuPosition;
        if (chatActivity$$ExternalSyntheticLambda11 != null) {
            chatActivity$$ExternalSyntheticLambda11.run();
        }
        checkUi_topicsVerticalPosition();
        float tabsVisibility = getTabsVisibility(Position.LEFT);
        float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, tabsVisibility);
        FrameLayout frameLayout = this.sideTabsContainer;
        frameLayout.setTranslationX(fLerp);
        frameLayout.setVisibility(tabsVisibility <= 0.0f ? 8 : 0);
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        int i2 = Theme.key_featuredStickers_addButton;
        int iBlendARGB = ColorUtils.blendARGB(1.0f - this.sidemenuT, color, Theme.getColor(i2, resourcesProvider));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.toggleButtonTop.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
        this.toggleButtonSide.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(this.sidemenuT, Theme.getColor(i, resourcesProvider), Theme.getColor(i2, resourcesProvider)), mode));
        this.closeButtonTop.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode));
        this.closeButtonSide.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode));
        invalidate();
    }

    public final void updateTabs$1() {
        checkTopicsVisibility(true);
        AnonymousClass1 anonymousClass1 = this.topTabs;
        boolean zCanScrollHorizontally = anonymousClass1.canScrollHorizontally(-1);
        anonymousClass1.adapter.update(true);
        if (!zCanScrollHorizontally) {
            anonymousClass1.scrollToPosition(0);
        }
        AnonymousClass3 anonymousClass3 = this.sideTabs;
        boolean zCanScrollVertically = anonymousClass3.canScrollVertically(-1);
        anonymousClass3.adapter.update(true);
        if (!zCanScrollVertically) {
            anonymousClass3.scrollToPosition(0);
        }
        AndroidUtilities.runOnUIThread(new TopicsTabsView$$ExternalSyntheticLambda0(this, 0));
    }
}
