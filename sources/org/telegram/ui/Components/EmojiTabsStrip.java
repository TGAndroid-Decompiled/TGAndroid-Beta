package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda79;

public abstract class EmojiTabsStrip extends ScrollableHorizontalScrollView {
    public final int accentColor;
    public boolean animateAppear;
    public int animatedEmojiCacheType;
    public final int currentType;
    public final EmojiTabsView emojiTabs;
    public boolean first;
    public final boolean forceTabsShow;
    public boolean giftsFirstChange;
    public boolean giftsIsShown;
    public final EmojiTabButton giftsTab;
    public final boolean includeAnimated;
    public final boolean isGlassDesign;
    public final Runnable onSettingsOpenRunnable;
    public final int packsIndexStart;
    public float paddingLeftDp;
    public final int recentDrawableId;
    public boolean recentFirstChange;
    public boolean recentIsShown;
    public final EmojiTabButton recentTab;
    public final HashMap removingViews;
    public final Theme.ResourcesProvider resourcesProvider;
    public float selectAnimationT;
    public ValueAnimator selectAnimator;
    public float selectT;
    public int selected;
    public final EmojiTabButton settingsTab;
    public boolean showSelected;
    public AnimatedFloat showSelectedAlpha;
    public final EmojiTabButton toggleEmojiStickersTab;
    public boolean updateButtonDrawables;
    public int wasIndex;
    public static final int[] emojiTabsDrawableIds = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] emojiTabsAnimatedDrawableIds = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};

    public class EmojiTabButton extends ViewGroup {
        public AnimatedEmojiDrawable animatedEmoji;
        public TLRPC.Document animatedEmojiDocument;
        public Long animatedEmojiDocumentId;
        public boolean attached;
        public final boolean forceSelector;
        public Long id;
        public final BackupImageView imageView;
        public final boolean isAnimatedEmoji;
        public boolean isVisible;
        public Boolean lastLock;
        public float lockT;
        public final PremiumLockIconView lockView;
        public final RLottieDrawable lottieDrawable;
        public boolean newly;
        public final boolean round;
        public ValueAnimator selectAnimator;
        public float selectT;
        public boolean selected;
        public EmojiView.EmojiPack setObject;

        public EmojiTabButton(Context context, int i, int i2) {
            super(context);
            setFocusable(true);
            this.round = true;
            this.forceSelector = false;
            setBackground(Theme.createCircleSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 0, 0));
            if (Build.VERSION.SDK_INT >= 23) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
                this.lottieDrawable = rLottieDrawable;
                rLottieDrawable.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
                rLottieDrawable.masterParent = this;
                rLottieDrawable.decodeSingleFrame = true;
                rLottieDrawable.scheduleNextGetFrame();
                rLottieDrawable.start();
            } else {
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.applyAttach = false;
                backupImageView.setImageDrawable(context.getResources().getDrawable(i).mutate());
                addView(backupImageView);
            }
            updateColor();
        }

        private void setColor(int i) {
            EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
            int i2 = emojiTabsStrip.currentType;
            if (i2 == 5 || i2 == 7) {
                i = emojiTabsStrip.accentColor;
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null && !this.isAnimatedEmoji) {
                backupImageView.setColorFilter(porterDuffColorFilter);
                backupImageView.invalidate();
            }
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setColorFilter(porterDuffColorFilter);
                if (HwEmojis.grab(this)) {
                    return;
                }
                super.invalidate();
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            if (rLottieDrawable == null || !this.isVisible) {
                return;
            }
            rLottieDrawable.draw(canvas);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (this.isVisible) {
                return super.drawChild(canvas, view, j);
            }
            return true;
        }

        public Drawable getDrawable() {
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null) {
                return backupImageView.getImageReceiver().getImageDrawable();
            }
            return null;
        }

        @Override
        public final void invalidate() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            updateAttachState();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            updateAttachState();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.isVisible) {
                super.onDraw(canvas);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            TLRPC.StickerSet stickerSet;
            CharSequence charSequence;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription == null) {
                EmojiView.EmojiPack emojiPack = this.setObject;
                if (emojiPack == null || (stickerSet = emojiPack.set) == null || (charSequence = stickerSet.title) == null) {
                    TLRPC.Document document = this.animatedEmojiDocument;
                    if (document != null) {
                        contentDescription = MessageObject.findAnimatedEmojiEmoticon(document, null);
                    } else {
                        Long l = this.animatedEmojiDocumentId;
                        if (l != null) {
                            HashMap map = AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).emojiDocumentsCache;
                            TLRPC.Document document2 = map == null ? null : (TLRPC.Document) map.get(l);
                            if (document2 != null) {
                                contentDescription = MessageObject.findAnimatedEmojiEmoticon(document2, null);
                            }
                        }
                    }
                } else {
                    contentDescription = charSequence;
                }
            }
            Boolean bool = this.lastLock;
            if (bool != null && !bool.booleanValue()) {
                String string = LocaleController.getString(R.string.FeaturedStickersShort);
                if (contentDescription == null) {
                    contentDescription = string;
                } else {
                    contentDescription = ((Object) contentDescription) + ", " + string;
                }
            }
            if (contentDescription != null) {
                accessibilityNodeInfo.setContentDescription(contentDescription);
            }
            accessibilityNodeInfo.setSelected(this.selected);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null) {
                int i5 = (i3 - i) / 2;
                int i6 = (i4 - i2) / 2;
                backupImageView.layout(i5 - (backupImageView.getMeasuredWidth() / 2), i6 - (backupImageView.getMeasuredHeight() / 2), (backupImageView.getMeasuredWidth() / 2) + i5, (backupImageView.getMeasuredHeight() / 2) + i6);
            }
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView != null) {
                int i7 = i3 - i;
                int i8 = i4 - i2;
                premiumLockIconView.layout(i7 - premiumLockIconView.getMeasuredWidth(), i8 - premiumLockIconView.getMeasuredHeight(), i7, i8);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null) {
                backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
            }
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView != null) {
                premiumLockIconView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
            }
        }

        @Override
        public final boolean performClick() {
            PhotoViewer.AnonymousClass11 anonymousClass11;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            if (animatedEmojiDrawable != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                if (anonymousClass11.getAnimation() != null) {
                    anonymousClass11.getAnimation().seekTo(0L, true, false);
                }
                anonymousClass11.startAnimation();
            }
            return super.performClick();
        }

        public void setAnimatedEmojiDocument(TLRPC.Document document) {
            TLRPC.Document document2 = this.animatedEmojiDocument;
            if ((document2 != null || this.animatedEmojiDocumentId != null) && document != null) {
                Long l = this.animatedEmojiDocumentId;
                if ((l != null ? l.longValue() : document2.id) == document.id) {
                    return;
                }
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            BackupImageView backupImageView = this.imageView;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(backupImageView);
                this.animatedEmoji = null;
            }
            backupImageView.imageReceiver.clearImage();
            this.animatedEmojiDocument = document;
            this.animatedEmojiDocumentId = null;
            updateAttachState();
        }

        public void setAnimatedEmojiDocumentId(long j) {
            TLRPC.Document document = this.animatedEmojiDocument;
            if ((document != null || this.animatedEmojiDocumentId != null) && j != 0) {
                Long l = this.animatedEmojiDocumentId;
                if ((l != null ? l.longValue() : document.id) == j) {
                    return;
                }
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            BackupImageView backupImageView = this.imageView;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(backupImageView);
                this.animatedEmoji = null;
            }
            backupImageView.imageReceiver.clearImage();
            this.animatedEmojiDocument = null;
            this.animatedEmojiDocumentId = j != 0 ? Long.valueOf(j) : null;
            updateAttachState();
        }

        public void setDrawable(Drawable drawable) {
            setAnimatedEmojiDocument(null);
            setStickerThumb(null);
            this.imageView.setImageDrawable(drawable);
        }

        public final void setLock(Boolean bool) {
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView == null) {
                return;
            }
            this.lastLock = bool;
            if (bool == null) {
                updateLock(false);
                return;
            }
            updateLock(true);
            if (bool.booleanValue()) {
                premiumLockIconView.setImageResource(R.drawable.msg_mini_lockedemoji);
                return;
            }
            Drawable drawableMutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            premiumLockIconView.setImageDrawable(drawableMutate);
        }

        public void setStickerThumb(EmojiView.EmojiPack emojiPack) {
            if (emojiPack != null && emojiPack.set == null) {
                emojiPack = null;
            }
            EmojiView.EmojiPack emojiPack2 = this.setObject;
            if (emojiPack2 == null || emojiPack == null || emojiPack2.set.id != emojiPack.set.id) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
                BackupImageView backupImageView = this.imageView;
                if (animatedEmojiDrawable != null && this.animatedEmojiDocument == null && this.animatedEmojiDocumentId == null) {
                    animatedEmojiDrawable.removeView(backupImageView);
                    this.animatedEmoji = null;
                }
                backupImageView.imageReceiver.clearImage();
                this.setObject = emojiPack;
                updateAttachState();
            }
        }

        public final void stopAnimation() {
            PhotoViewer.AnonymousClass11 anonymousClass11;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            if (animatedEmojiDrawable == null || (anonymousClass11 = animatedEmojiDrawable.imageReceiver) == null) {
                return;
            }
            if (anonymousClass11.getLottieAnimation() != null) {
                anonymousClass11.getLottieAnimation().setCurrentFrame(0, true, false);
                RLottieDrawable lottieAnimation = anonymousClass11.getLottieAnimation();
                lottieAnimation.isRunning = false;
                lottieAnimation.checkChoreographer$1();
                return;
            }
            if (anonymousClass11.getAnimation() != null) {
                AnimatedFileDrawable animation = anonymousClass11.getAnimation();
                animation.isRunning = false;
                animation.checkChoreographer();
            }
        }

        public final void updateAttachState() {
            BackupImageView backupImageView = this.imageView;
            if (backupImageView == null) {
                return;
            }
            if (this.attached && this.isVisible) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
                if (animatedEmojiDrawable != null || (this.animatedEmojiDocument == null && this.animatedEmojiDocumentId == null)) {
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.removeView(backupImageView);
                        this.animatedEmoji = null;
                    }
                    backupImageView.imageReceiver.clearImage();
                    EmojiView.EmojiPack emojiPack = this.setObject;
                    if (emojiPack != null) {
                        this.imageView.setImage(ImageLocation.getForStickerSet(emojiPack.set), "24_24", null, null, null, null, 0, this.setObject);
                        if (this.setObject.needLoadSet != null) {
                            MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.setObject.needLoadSet, false);
                            this.setObject.needLoadSet = null;
                        }
                    }
                } else {
                    backupImageView.imageReceiver.clearImage();
                    TLRPC.Document document = this.animatedEmojiDocument;
                    EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                    if (document != null) {
                        this.animatedEmoji = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, emojiTabsStrip.animatedEmojiCacheType, document);
                    } else {
                        this.animatedEmoji = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, this.animatedEmojiDocumentId.longValue(), null, emojiTabsStrip.animatedEmojiCacheType);
                    }
                    this.animatedEmoji.addView(backupImageView);
                    backupImageView.setImageDrawable(this.animatedEmoji);
                }
            } else {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmoji;
                if (animatedEmojiDrawable2 != null) {
                    animatedEmojiDrawable2.removeView(backupImageView);
                    this.animatedEmoji = null;
                }
                backupImageView.imageReceiver.clearImage();
            }
            if (this.attached && this.isVisible) {
                backupImageView.onAttachedToWindow();
            } else {
                backupImageView.onDetachedFromWindow();
            }
            updateLockImageReceiver();
        }

        public final void updateColor() {
            Drawable background = getBackground();
            EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
            Theme.setSelectorDrawableColor(background, emojiTabsStrip.selectorColor(), false);
            boolean z = emojiTabsStrip.isGlassDesign;
            Theme.ResourcesProvider resourcesProvider = emojiTabsStrip.resourcesProvider;
            if (z) {
                setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), (int) (AndroidUtilities.lerp(0.4f, 0.8f, this.selectT) * 255.0f)));
            } else {
                setColor(ColorUtils.blendARGB(this.selectT, Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider), Theme.getColor(Theme.key_chat_emojiPanelIconSelected, emojiTabsStrip.resourcesProvider)));
            }
        }

        public final void updateLock(boolean z) {
            if (Math.abs(this.lockT - (z ? 1.0f : 0.0f)) < 0.01f) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            this.lockT = f;
            PremiumLockIconView premiumLockIconView = this.lockView;
            premiumLockIconView.setScaleX(f);
            premiumLockIconView.setScaleY(this.lockT);
            premiumLockIconView.setAlpha(this.lockT);
            premiumLockIconView.setVisibility(z ? 0 : 8);
        }

        public final void updateLockImageReceiver() {
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView == null || premiumLockIconView.colorRetrieved || !(getDrawable() instanceof AnimatedEmojiDrawable)) {
                return;
            }
            if (((AnimatedEmojiDrawable) getDrawable()).canOverrideColor()) {
                premiumLockIconView.setImageReceiver(null);
                premiumLockIconView.setColor(EmojiTabsStrip.this.accentColor);
                return;
            }
            PhotoViewer.AnonymousClass11 anonymousClass11 = ((AnimatedEmojiDrawable) getDrawable()).imageReceiver;
            if (anonymousClass11 != null) {
                premiumLockIconView.setImageReceiver(anonymousClass11);
                premiumLockIconView.invalidate();
            }
        }

        public final void updateSelect(boolean z, boolean z2) {
            BackupImageView backupImageView = this.imageView;
            if ((backupImageView == null || backupImageView.getImageReceiver().getImageDrawable() != null || EmojiTabsStrip.this.isGlassDesign) && this.selected != z) {
                this.selected = z;
                ValueAnimator valueAnimator = this.selectAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.selectAnimator = null;
                }
                if (!z) {
                    stopAnimation();
                }
                if (!z2) {
                    this.selectT = z ? 1.0f : 0.0f;
                    updateColor();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
                this.selectAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 7));
                this.selectAnimator.addListener(new ChatActivity.AnonymousClass77(21, this, z));
                this.selectAnimator.setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 350L);
                this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectAnimator.start();
            }
        }

        public final void updateVisibilityInbounds(boolean z, boolean z2) {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            PhotoViewer.AnonymousClass11 anonymousClass11;
            RLottieDrawable rLottieDrawable;
            if (!this.isVisible && z && (rLottieDrawable = this.lottieDrawable) != null && !rLottieDrawable.isRunning && !z2) {
                this.lottieDrawable.setProgress(0.0f, true);
                this.lottieDrawable.start();
            }
            if (this.isVisible != z) {
                this.isVisible = z;
                if (z) {
                    if (!HwEmojis.grab(this)) {
                        super.invalidate();
                    }
                    PremiumLockIconView premiumLockIconView = this.lockView;
                    if (premiumLockIconView != null) {
                        premiumLockIconView.invalidate();
                    }
                    PremiumLockIconView premiumLockIconView2 = this.lockView;
                    if (premiumLockIconView2 != null && (animatedEmojiDrawable = this.animatedEmoji) != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                        premiumLockIconView2.setImageReceiver(anonymousClass11);
                    }
                    BackupImageView backupImageView = this.imageView;
                    if (backupImageView != null) {
                        backupImageView.invalidate();
                    }
                } else {
                    stopAnimation();
                }
                updateAttachState();
            }
        }

        public final class AnonymousClass2 extends PremiumLockIconView {
            @Override
            public final void invalidate() {
                if (HwEmojis.grab(this)) {
                    return;
                }
                super.invalidate();
            }

            @Override
            public final void invalidate(int i, int i2, int i3, int i4) {
                if (HwEmojis.grab(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
            }
        }

        public final class AnonymousClass4 extends PremiumLockIconView {
            @Override
            public final void invalidate() {
                if (HwEmojis.grab(this)) {
                    return;
                }
                super.invalidate();
            }

            @Override
            public final void invalidate(int i, int i2, int i3, int i4) {
                if (HwEmojis.grab(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
            }
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }

        public EmojiTabButton(Context context, int i, boolean z) {
            super(context);
            setFocusable(true);
            this.round = false;
            this.forceSelector = z;
            if (z) {
                setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
            }
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.applyAttach = false;
            backupImageView.setImageDrawable(context.getResources().getDrawable(i).mutate());
            updateColor();
            addView(backupImageView);
        }

        public EmojiTabButton(Context context, TLRPC.Document document) {
            super(context);
            setFocusable(true);
            this.newly = true;
            this.round = false;
            this.forceSelector = false;
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                public final void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                    EmojiTabButton.this.updateLockImageReceiver();
                }

                @Override
                public final void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.imageView = backupImageView;
            backupImageView.applyAttach = false;
            this.animatedEmojiDocument = document;
            this.isAnimatedEmoji = true;
            backupImageView.setColorFilter(EmojiTabsStrip.this.getEmojiColorFilter());
            addView(backupImageView);
            int i = PremiumLockIconView.$r8$clinit;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, 1, EmojiTabsStrip.this.resourcesProvider);
            this.lockView = anonymousClass2;
            anonymousClass2.setAlpha(0.0f);
            anonymousClass2.setScaleX(0.0f);
            anonymousClass2.setScaleY(0.0f);
            updateLockImageReceiver();
            addView(anonymousClass2);
            updateColor();
        }

        public EmojiTabButton(Context context, long j) {
            super(context);
            setFocusable(true);
            this.newly = true;
            this.round = false;
            this.forceSelector = false;
            UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, 7);
            this.imageView = anonymousClass2;
            anonymousClass2.applyAttach = false;
            this.animatedEmojiDocumentId = Long.valueOf(j);
            this.isAnimatedEmoji = true;
            anonymousClass2.setColorFilter(EmojiTabsStrip.this.getEmojiColorFilter());
            addView(anonymousClass2);
            int i = PremiumLockIconView.$r8$clinit;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, 1, EmojiTabsStrip.this.resourcesProvider);
            this.lockView = anonymousClass4;
            anonymousClass4.setAlpha(0.0f);
            anonymousClass4.setScaleX(0.0f);
            anonymousClass4.setScaleY(0.0f);
            updateLockImageReceiver();
            addView(anonymousClass4);
            updateColor();
        }
    }

    public final class EmojiTabsView extends ScrollableHorizontalScrollView {
        public long id;
        public float showT;
        public boolean shown;

        public EmojiTabsView(Context context) {
            String string;
            super(context);
            boolean z = EmojiTabsStrip.this.forceTabsShow;
            this.shown = z;
            this.showT = z ? 1.0f : 0.0f;
            setSmoothScrollingEnabled(true);
            int i = 0;
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            setNestedScrollingEnabled(true);
            PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 4);
            this.contentView = anonymousClass35;
            anonymousClass35.setOrientation(0);
            addView(this.contentView, new FrameLayout.LayoutParams(-2, -1));
            while (true) {
                int[] iArr = EmojiTabsStrip.emojiTabsDrawableIds;
                if (i >= 8) {
                    return;
                }
                EmojiTabButton emojiTabButton = new EmojiTabButton(context, iArr[i], EmojiTabsStrip.emojiTabsAnimatedDrawableIds[i]) {
                    {
                        EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                    }

                    @Override
                    public final boolean onTouchEvent(MotionEvent motionEvent) {
                        EmojiTabsView.this.intercept(motionEvent);
                        return super.onTouchEvent(motionEvent);
                    }
                };
                switch (i) {
                    case 0:
                        string = LocaleController.getString(R.string.Emoji1);
                        break;
                    case 1:
                        string = LocaleController.getString(R.string.Emoji2);
                        break;
                    case 2:
                        string = LocaleController.getString(R.string.Emoji3);
                        break;
                    case 3:
                        string = LocaleController.getString(R.string.Emoji4);
                        break;
                    case 4:
                        string = LocaleController.getString(R.string.Emoji5);
                        break;
                    case 5:
                        string = LocaleController.getString(R.string.Emoji6);
                        break;
                    case 6:
                        string = LocaleController.getString(R.string.Emoji7);
                        break;
                    case 7:
                        string = LocaleController.getString(R.string.Emoji8);
                        break;
                    default:
                        string = null;
                        break;
                }
                emojiTabButton.setContentDescription(string);
                this.contentView.addView(emojiTabButton);
                i++;
            }
        }

        public final void intercept(MotionEvent motionEvent) {
            if (!this.shown || this.scrollingAnimation) {
                return;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    this.touching = false;
                    return;
                } else if (action != 2) {
                    return;
                }
            }
            this.touching = true;
            if (!this.scrollingAnimation) {
                this.scrollingTo = -1;
            }
            EmojiTabsStrip.this.requestDisallowInterceptTouchEvent(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.contentView.getChildCount()) * 32.0f), this.showT), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            intercept(motionEvent);
            return super.onTouchEvent(motionEvent);
        }
    }

    public EmojiTabsStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, boolean z3, final boolean z4, int i, Runnable runnable, int i2, final boolean z5) {
        String string;
        super(context);
        this.recentDrawableId = R.drawable.msg_emoji_recent;
        int i3 = R.drawable.msg_emoji_gem;
        int i4 = R.drawable.smiles_tab_settings;
        this.forceTabsShow = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.showSelected = true;
        this.removingViews = new HashMap();
        this.selectT = 0.0f;
        this.selectAnimationT = 0.0f;
        this.selected = 0;
        this.wasIndex = 0;
        this.animateAppear = true;
        this.animatedEmojiCacheType = 6;
        this.updateButtonDrawables = true;
        this.recentFirstChange = true;
        this.recentIsShown = true;
        this.giftsFirstChange = true;
        this.giftsIsShown = false;
        this.first = true;
        this.paddingLeftDp = 11.0f;
        this.includeAnimated = z4;
        this.resourcesProvider = resourcesProvider;
        this.onSettingsOpenRunnable = runnable;
        this.currentType = i;
        this.accentColor = i2;
        this.isGlassDesign = z5;
        LinearLayout linearLayout = new LinearLayout(context) {
            public final LongSparseArray lastX = new LongSparseArray();
            public final Paint paint = new Paint(1);
            public final RectF from = new RectF();
            public final RectF to = new RectF();
            public final RectF rect = new RectF();
            public final Path path = new Path();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                for (Map.Entry entry : emojiTabsStrip.removingViews.entrySet()) {
                    View view = (View) entry.getKey();
                    if (view != null) {
                        Rect rect = (Rect) entry.getValue();
                        canvas.save();
                        canvas.translate(rect.left, rect.top);
                        canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                        view.draw(canvas);
                        canvas.restore();
                    }
                }
                if (emojiTabsStrip.showSelectedAlpha == null) {
                    emojiTabsStrip.showSelectedAlpha = new AnimatedFloat(350L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                float f = emojiTabsStrip.showSelectedAlpha.set(emojiTabsStrip.showSelected ? 1.0f : 0.0f, false);
                int iFloor = (int) Math.floor(emojiTabsStrip.selectT);
                int iCeil = (int) Math.ceil(emojiTabsStrip.selectT);
                RectF rectF = this.from;
                getChildBounds(rectF, iFloor);
                RectF rectF2 = this.to;
                getChildBounds(rectF2, iCeil);
                float f2 = emojiTabsStrip.selectT - iFloor;
                RectF rectF3 = this.rect;
                AndroidUtilities.lerp(rectF, rectF2, f2, rectF3);
                EmojiTabsView emojiTabsView = emojiTabsStrip.emojiTabs;
                float fClamp01 = emojiTabsView != null ? 1.0f - Utilities.clamp01(Math.abs(emojiTabsStrip.selectT - ((emojiTabsStrip.giftsTab != null ? 1 : 0) + 1))) : 0.0f;
                float f3 = emojiTabsStrip.selectAnimationT;
                float f4 = (1.0f - f3) * 4.0f * f3;
                float fM = AndroidUtilities$$ExternalSyntheticOutline0.m(f4, 0.3f, 1.0f, rectF3.width() / 2.0f);
                float fHeight = (1.0f - (f4 * 0.05f)) * (rectF3.height() / 2.0f);
                rectF3.set(rectF3.centerX() - fM, rectF3.centerY() - fHeight, rectF3.centerX() + fM, rectF3.centerY() + fHeight);
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, fClamp01));
                Paint paint = this.paint;
                paint.setColor(emojiTabsStrip.selectorColor());
                boolean z6 = emojiTabsStrip.forceTabsShow;
                if (z6) {
                    paint.setAlpha((int) ((1.0f - (fClamp01 * 0.5f)) * paint.getAlpha() * f));
                } else {
                    paint.setAlpha((int) (paint.getAlpha() * f));
                }
                Path path = this.path;
                path.rewind();
                boolean z7 = z5;
                float fHeight2 = z7 ? rectF3.height() / 2.0f : fDp;
                if (z7) {
                    fDp = rectF3.height() / 2.0f;
                }
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF3, fHeight2, fDp, direction);
                canvas.drawPath(path, paint);
                if (z6) {
                    path.rewind();
                    getChildBounds(rectF3, 1);
                    path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
                    paint.setColor(emojiTabsStrip.selectorColor());
                    paint.setAlpha((int) (paint.getAlpha() * 0.5f));
                    canvas.drawPath(path, paint);
                }
                if (emojiTabsView != null) {
                    path.addCircle(AndroidUtilities.dp(15.0f) + emojiTabsView.getLeft(), (emojiTabsView.getBottom() + emojiTabsView.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                if (view != EmojiTabsStrip.this.emojiTabs) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipPath(this.path);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            public final void getChildBounds(RectF rectF, int i5) {
                View childAt = getChildAt(MathUtils.clamp(i5, 0, getChildCount() - 1));
                if (childAt == null) {
                    return;
                }
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
            }

            @Override
            public final void onLayout(boolean z6, int i5, int i6, int i7, int i8) {
                EmojiTabButton emojiTabButton;
                LongSparseArray longSparseArray;
                Long lValueOf;
                TLRPC.StickerSet stickerSet;
                int i9 = (i8 - i6) / 2;
                EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                if (!z4) {
                    int childCount = (getChildCount() - (!emojiTabsStrip.recentIsShown ? 1 : 0)) - (!emojiTabsStrip.giftsIsShown ? 1 : 0);
                    int iM$3 = (int) (OKLCH.m$3(30.0f, childCount, ((i7 - i5) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
                    int paddingLeft = getPaddingLeft();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = getChildAt((!emojiTabsStrip.recentIsShown ? 1 : 0) + (!emojiTabsStrip.giftsIsShown ? 1 : 0) + i10);
                        if (childAt != null) {
                            childAt.layout(paddingLeft, i9 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i9);
                            paddingLeft = childAt.getMeasuredWidth() + iM$3 + paddingLeft;
                        }
                    }
                    return;
                }
                int paddingLeft2 = getPaddingLeft();
                int i11 = 0;
                while (true) {
                    int childCount2 = getChildCount();
                    emojiTabButton = emojiTabsStrip.settingsTab;
                    longSparseArray = this.lastX;
                    if (i11 >= childCount2) {
                        break;
                    }
                    View childAt2 = getChildAt(i11);
                    if (childAt2 != emojiTabButton && !emojiTabsStrip.removingViews.containsKey(childAt2) && childAt2 != null) {
                        childAt2.layout(paddingLeft2, i9 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i9);
                        boolean z7 = childAt2 instanceof EmojiTabButton;
                        if (z7) {
                            EmojiTabButton emojiTabButton2 = (EmojiTabButton) childAt2;
                            lValueOf = emojiTabButton2.id;
                            if (lValueOf == null) {
                                EmojiView.EmojiPack emojiPack = emojiTabButton2.setObject;
                                if (emojiPack == null || (stickerSet = emojiPack.set) == null) {
                                    lValueOf = emojiTabButton2.animatedEmojiDocumentId;
                                    if (lValueOf == null) {
                                        TLRPC.Document document = emojiTabButton2.animatedEmojiDocument;
                                        if (document != null) {
                                            lValueOf = Long.valueOf(document.id);
                                        } else {
                                            lValueOf = null;
                                        }
                                    }
                                } else {
                                    lValueOf = Long.valueOf(stickerSet.id);
                                }
                            }
                        } else if (childAt2 instanceof EmojiTabsView) {
                            lValueOf = Long.valueOf(((EmojiTabsView) childAt2).id);
                        } else {
                            lValueOf = null;
                        }
                        if (emojiTabsStrip.animateAppear && z7) {
                            EmojiTabButton emojiTabButton3 = (EmojiTabButton) childAt2;
                            if (emojiTabButton3.newly) {
                                emojiTabButton3.newly = false;
                                childAt2.setScaleX(0.0f);
                                childAt2.setScaleY(0.0f);
                                childAt2.setAlpha(0.0f);
                                childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            }
                        }
                        if (lValueOf != null) {
                            Integer num = (Integer) longSparseArray.get(lValueOf.longValue());
                            if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                                childAt2.setTranslationX(num.intValue() - paddingLeft2);
                                childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            }
                            longSparseArray.put(Integer.valueOf(paddingLeft2), lValueOf.longValue());
                        }
                        if ((childAt2 != emojiTabsStrip.recentTab || emojiTabsStrip.recentIsShown) && (childAt2 != emojiTabsStrip.giftsTab || emojiTabsStrip.giftsIsShown)) {
                            paddingLeft2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt2.getMeasuredWidth(), 3.0f, paddingLeft2);
                        }
                    }
                    i11++;
                }
                if (emojiTabButton != null) {
                    Long l = emojiTabButton.id;
                    if (getPaddingRight() + emojiTabButton.getMeasuredWidth() + paddingLeft2 <= emojiTabsStrip.getMeasuredWidth()) {
                        int i12 = i7 - i5;
                        paddingLeft2 = (i12 - getPaddingRight()) - emojiTabButton.getMeasuredWidth();
                        emojiTabButton.layout(paddingLeft2, i9 - (emojiTabButton.getMeasuredHeight() / 2), i12 - getPaddingRight(), (emojiTabButton.getMeasuredHeight() / 2) + i9);
                    } else {
                        emojiTabButton.layout(paddingLeft2, i9 - (emojiTabButton.getMeasuredHeight() / 2), emojiTabButton.getMeasuredWidth() + paddingLeft2, (emojiTabButton.getMeasuredHeight() / 2) + i9);
                    }
                    if (l != null) {
                        if (longSparseArray.get(l.longValue()) != null && ((Integer) longSparseArray.get(l.longValue())).intValue() != paddingLeft2) {
                            emojiTabButton.setTranslationX(((Integer) longSparseArray.get(l.longValue())).intValue() - paddingLeft2);
                            emojiTabButton.animate().translationX(0.0f).setDuration(350L).start();
                        }
                        longSparseArray.put(Integer.valueOf(paddingLeft2), l.longValue());
                    }
                }
            }

            @Override
            public final void onMeasure(int i5, int i6) {
                EmojiTabButton emojiTabButton;
                EmojiTabButton emojiTabButton2;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                float alpha = 0.0f;
                int alpha2 = paddingRight - ((int) ((emojiTabsStrip.recentIsShown || (emojiTabButton2 = emojiTabsStrip.recentTab) == null) ? 0.0f : emojiTabButton2.getAlpha() * AndroidUtilities.dp(33.0f)));
                if (!emojiTabsStrip.giftsIsShown && (emojiTabButton = emojiTabsStrip.giftsTab) != null) {
                    alpha = emojiTabButton.getAlpha() * AndroidUtilities.dp(33.0f);
                }
                int measuredWidth = alpha2 - ((int) alpha);
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != null) {
                        childAt.measure(iMakeMeasureSpec, i6);
                        measuredWidth = childAt.getMeasuredWidth() + (i7 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + measuredWidth;
                    }
                }
                if (z4) {
                    setMeasuredDimension(Math.max(measuredWidth, View.MeasureSpec.getSize(i5)), View.MeasureSpec.getSize(i6));
                } else {
                    setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
                }
            }
        };
        this.contentView = linearLayout;
        linearLayout.setClipToPadding(false);
        this.contentView.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.contentView);
        if (i == 4) {
            LinearLayout linearLayout2 = this.contentView;
            EmojiTabButton emojiTabButton = new EmojiTabButton(context, R.drawable.msg_emoji_stickers, false);
            this.toggleEmojiStickersTab = emojiTabButton;
            linearLayout2.addView(emojiTabButton);
            emojiTabButton.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i == 3) {
            this.recentDrawableId = R.drawable.msg_emoji_smiles;
        }
        if (i == 6) {
            this.recentDrawableId = R.drawable.emoji_love;
        }
        if (z) {
            LinearLayout linearLayout3 = this.contentView;
            EmojiTabButton emojiTabButton2 = new EmojiTabButton(context, this.recentDrawableId, false);
            this.recentTab = emojiTabButton2;
            linearLayout3.addView(emojiTabButton2);
            emojiTabButton2.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            emojiTabButton2.id = Long.valueOf(-934918565);
        }
        if (z2) {
            LinearLayout linearLayout4 = this.contentView;
            EmojiTabButton emojiTabButton3 = new EmojiTabButton(context, i3, false);
            this.giftsTab = emojiTabButton3;
            linearLayout4.addView(emojiTabButton3);
            emojiTabButton3.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            emojiTabButton3.setAlpha(0.0f);
            emojiTabButton3.id = Long.valueOf(98352451);
        }
        if (z4) {
            if (z3) {
                LinearLayout linearLayout5 = this.contentView;
                EmojiTabsView emojiTabsView = new EmojiTabsView(context);
                this.emojiTabs = emojiTabsView;
                linearLayout5.addView(emojiTabsView);
                emojiTabsView.id = 3552126;
            }
            this.packsIndexStart = this.contentView.getChildCount();
            if (runnable != null) {
                LinearLayout linearLayout6 = this.contentView;
                EmojiTabButton emojiTabButton4 = new EmojiTabButton(context, i4, true);
                this.settingsTab = emojiTabButton4;
                linearLayout6.addView(emojiTabButton4);
                emojiTabButton4.setContentDescription(LocaleController.getString(R.string.Settings));
                emojiTabButton4.id = Long.valueOf(1434631203);
                emojiTabButton4.setAlpha(0.0f);
            }
            updateClickListeners();
            return;
        }
        int i5 = 0;
        while (true) {
            int[] iArr = emojiTabsDrawableIds;
            if (i5 >= 8) {
                updateClickListeners();
                return;
            }
            EmojiTabButton emojiTabButton5 = new EmojiTabButton(context, iArr[i5], i5 == 0);
            switch (i5) {
                case 0:
                    string = LocaleController.getString(R.string.Emoji1);
                    break;
                case 1:
                    string = LocaleController.getString(R.string.Emoji2);
                    break;
                case 2:
                    string = LocaleController.getString(R.string.Emoji3);
                    break;
                case 3:
                    string = LocaleController.getString(R.string.Emoji4);
                    break;
                case 4:
                    string = LocaleController.getString(R.string.Emoji5);
                    break;
                case 5:
                    string = LocaleController.getString(R.string.Emoji6);
                    break;
                case 6:
                    string = LocaleController.getString(R.string.Emoji7);
                    break;
                case 7:
                    string = LocaleController.getString(R.string.Emoji8);
                    break;
                default:
                    string = null;
                    break;
            }
            emojiTabButton5.setContentDescription(string);
            this.contentView.addView(emojiTabButton5);
            i5++;
        }
    }

    public boolean allowEmojisForNonPremium() {
        return false;
    }

    public void doIncludeFeatured() {
    }

    public ColorFilter getEmojiColorFilter() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider == null) {
            return Theme.chat_animatedEmojiTextColorFilter;
        }
        int i = Theme.default_shadow_color;
        return resourcesProvider.getAnimatedEmojiColorFilter();
    }

    public boolean isInstalled(EmojiView.EmojiPack emojiPack) {
        return emojiPack.installed;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.contentView.setPadding(AndroidUtilities.dp(this.paddingLeftDp), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i, i2);
    }

    public abstract boolean onTabClick(int i);

    public void onTabCreate(EmojiTabButton emojiTabButton) {
    }

    public final void select(int i, boolean z) {
        int i2;
        int i3 = 2;
        boolean z2 = z && !this.first;
        EmojiTabButton emojiTabButton = this.toggleEmojiStickersTab;
        if (emojiTabButton != null) {
            i++;
        }
        if (!this.recentIsShown || emojiTabButton != null) {
            i = Math.max(1, i);
        }
        int i4 = this.selected;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.contentView.getChildCount()) {
            View childAt = this.contentView.getChildAt(i5);
            if (childAt instanceof EmojiTabsView) {
                EmojiTabsView emojiTabsView = (EmojiTabsView) childAt;
                int i7 = i6;
                int i8 = 0;
                while (i8 < emojiTabsView.contentView.getChildCount()) {
                    View childAt2 = emojiTabsView.contentView.getChildAt(i8);
                    if (childAt2 instanceof EmojiTabButton) {
                        ((EmojiTabButton) childAt2).updateSelect(i == i7, z2);
                    }
                    i8++;
                    i7++;
                }
                i2 = i7 - 1;
            } else {
                if (childAt instanceof EmojiTabButton) {
                    ((EmojiTabButton) childAt).updateSelect(i == i6, z2);
                }
                i2 = i6;
            }
            if (i >= i6 && i <= i2) {
                this.selected = i5;
            }
            i5++;
            i6 = i2 + 1;
        }
        int i9 = this.selected;
        EmojiTabsView emojiTabsView2 = this.emojiTabs;
        if (i4 != i9) {
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.selectT;
            float f2 = this.selected;
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.selectAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda79(this, f, f2, i3));
                this.selectAnimator.setDuration(350L);
                this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectAnimator.start();
            } else {
                this.selectAnimationT = 1.0f;
                this.selectT = AndroidUtilities.lerp(f, f2, 1.0f);
                this.contentView.invalidate();
            }
            if (emojiTabsView2 != null) {
                boolean z3 = this.selected == 1 || this.forceTabsShow;
                if (z3 != emojiTabsView2.shown) {
                    emojiTabsView2.shown = z3;
                    if (!z3) {
                        emojiTabsView2.scrollTo(0);
                    }
                    ValueAnimator valueAnimator2 = emojiTabsView2.showAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z2) {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(emojiTabsView2.showT, z3 ? 1.0f : 0.0f);
                        emojiTabsView2.showAnimator = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(emojiTabsView2, 8));
                        emojiTabsView2.showAnimator.setDuration(475L);
                        emojiTabsView2.showAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        emojiTabsView2.showAnimator.start();
                    } else {
                        emojiTabsView2.showT = z3 ? 1.0f : 0.0f;
                        emojiTabsView2.invalidate();
                        emojiTabsView2.requestLayout();
                        emojiTabsView2.updateButtonsVisibility();
                        EmojiTabsStrip.this.contentView.invalidate();
                    }
                }
            }
            View childAt3 = this.contentView.getChildAt(this.selected);
            if (this.selected >= 2) {
                scrollToVisible(childAt3.getLeft(), childAt3.getRight());
            } else {
                scrollTo(0);
            }
        }
        if (this.wasIndex != i) {
            if (emojiTabsView2 != null && this.selected == 1 && i >= 1 && i <= emojiTabsView2.contentView.getChildCount() + 1) {
                int i10 = (i - 1) * 36;
                emojiTabsView2.scrollToVisible(AndroidUtilities.dp(i10 - 6), AndroidUtilities.dp(i10 + 24));
            }
            this.wasIndex = i;
        }
    }

    public final int selectorColor() {
        boolean z = this.isGlassDesign;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z) {
            return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), (int) 12.75f);
        }
        int i = this.currentType;
        return (i == 5 || i == 7) ? Theme.multAlpha(0.09f, this.accentColor) : Theme.multAlpha(0.18f, Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider));
    }

    public void setAnimatedEmojiCacheType(int i) {
        this.animatedEmojiCacheType = i;
    }

    public void setPaddingLeft(float f) {
        this.paddingLeftDp = f;
    }

    public final void showGifts(boolean z) {
        EmojiTabButton emojiTabButton = this.giftsTab;
        if (emojiTabButton != null) {
            boolean z2 = this.giftsFirstChange;
            if (z2 || this.giftsIsShown != z) {
                this.giftsIsShown = z;
                if (z2) {
                    emojiTabButton.setVisibility(z ? 0 : 8);
                    emojiTabButton.setAlpha(z ? 1.0f : 0.0f);
                } else {
                    emojiTabButton.setVisibility(0);
                    emojiTabButton.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new FileLoader$$ExternalSyntheticLambda1(15, this, z)).start();
                }
                this.contentView.requestLayout();
                this.giftsFirstChange = false;
            }
        }
    }

    public final void showRecentTabStub(boolean z) {
        EmojiTabButton emojiTabButton = this.recentTab;
        if (emojiTabButton == null) {
            return;
        }
        if (z) {
            emojiTabButton.setBackground(new DialogsActivity.AnonymousClass11.AnonymousClass1(selectorColor()));
        } else {
            emojiTabButton.setBackground(null);
        }
    }

    public final void updateClickListeners() {
        int i = 0;
        final int i2 = 0;
        while (i < this.contentView.getChildCount()) {
            View childAt = this.contentView.getChildAt(i);
            if (childAt instanceof EmojiTabsView) {
                EmojiTabsView emojiTabsView = (EmojiTabsView) childAt;
                int i3 = 0;
                while (i3 < emojiTabsView.contentView.getChildCount()) {
                    final int i4 = 0;
                    emojiTabsView.contentView.getChildAt(i3).setOnClickListener(new View.OnClickListener(this) {
                        public final EmojiTabsStrip f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    this.f$0.onTabClick(i2);
                                    break;
                                default:
                                    this.f$0.onTabClick(i2);
                                    break;
                            }
                        }
                    });
                    i3++;
                    i2++;
                }
                i2--;
            } else if (childAt != null) {
                final int i5 = 1;
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final EmojiTabsStrip f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                this.f$0.onTabClick(i2);
                                break;
                            default:
                                this.f$0.onTabClick(i2);
                                break;
                        }
                    }
                });
            }
            i++;
            i2++;
        }
        EmojiTabButton emojiTabButton = this.settingsTab;
        if (emojiTabButton != null) {
            emojiTabButton.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 16));
        }
    }

    public final void updateEmojiPacks(ArrayList arrayList) {
        int i;
        EmojiTabButton emojiTabButton;
        boolean z;
        TLRPC.Document document;
        if (this.includeAnimated) {
            if (!this.first || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.first = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.contentView.getChildCount();
                int i2 = this.packsIndexStart;
                int i3 = childCount - i2;
                EmojiTabButton emojiTabButton2 = this.settingsTab;
                int i4 = i3 - (emojiTabButton2 != null ? 1 : 0);
                if (i4 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                doIncludeFeatured();
                boolean z2 = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || allowEmojisForNonPremium();
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                while (i5 < Math.max(arrayList.size(), i4)) {
                    EmojiTabButton emojiTabButton3 = i5 < i4 ? (EmojiTabButton) this.contentView.getChildAt(i5 + i2) : null;
                    EmojiView.EmojiPack emojiPack = i5 < arrayList.size() ? (EmojiView.EmojiPack) arrayList.get(i5) : null;
                    if (emojiPack != null) {
                        if (emojiPack.resId == 0) {
                            boolean z3 = emojiPack.free;
                            Long l = emojiPack.thumbDocumentId;
                            if (l != null) {
                                if (emojiTabButton3 == null) {
                                    emojiTabButton3 = new EmojiTabButton(getContext(), emojiPack.thumbDocumentId.longValue());
                                    onTabCreate(emojiTabButton3);
                                    this.contentView.addView(emojiTabButton3, i2 + i5);
                                } else {
                                    emojiTabButton3.setAnimatedEmojiDocumentId(l.longValue());
                                }
                                i = i2;
                                emojiTabButton = emojiTabButton2;
                                z = z2;
                            } else {
                                i4 = i4;
                                TLRPC.StickerSet stickerSet = emojiPack.set;
                                ArrayList arrayList3 = emojiPack.documents;
                                if (stickerSet == null) {
                                    i = i2;
                                    emojiTabButton = emojiTabButton2;
                                    z = z2;
                                } else {
                                    if (arrayList3 != null) {
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < arrayList3.size()) {
                                                document = (TLRPC.Document) arrayList3.get(i6);
                                                z = z2;
                                                i = i2;
                                                emojiTabButton = emojiTabButton2;
                                                if (document.id != stickerSet.thumb_document_id) {
                                                    i6++;
                                                    z2 = z;
                                                    i2 = i;
                                                    emojiTabButton2 = emojiTabButton;
                                                }
                                            } else {
                                                i = i2;
                                                emojiTabButton = emojiTabButton2;
                                                z = z2;
                                                if (arrayList3 != null) {
                                                    if (arrayList3.size() >= 1) {
                                                        document = (TLRPC.Document) arrayList3.get(0);
                                                    }
                                                }
                                                document = null;
                                            }
                                        }
                                    } else {
                                        i = i2;
                                        emojiTabButton = emojiTabButton2;
                                        z = z2;
                                        if (arrayList3 != null) {
                                            if (arrayList3.size() >= 1) {
                                                document = (TLRPC.Document) arrayList3.get(0);
                                            }
                                        }
                                        document = null;
                                    }
                                    if (emojiTabButton3 == null) {
                                        emojiTabButton3 = new EmojiTabButton(getContext(), document);
                                        onTabCreate(emojiTabButton3);
                                        this.contentView.addView(emojiTabButton3, i + i5);
                                    } else {
                                        emojiTabButton3.setAnimatedEmojiDocument(document);
                                    }
                                    if (document == null) {
                                        emojiTabButton3.setStickerThumb(emojiPack);
                                    }
                                }
                                document = null;
                                if (emojiTabButton3 == null) {
                                    emojiTabButton3 = new EmojiTabButton(getContext(), document);
                                    onTabCreate(emojiTabButton3);
                                    this.contentView.addView(emojiTabButton3, i + i5);
                                } else {
                                    emojiTabButton3.setAnimatedEmojiDocument(document);
                                }
                                if (document == null) {
                                    emojiTabButton3.setStickerThumb(emojiPack);
                                }
                            }
                            emojiTabButton3.id = emojiPack.forGroup ? Long.valueOf(439488310) : null;
                            emojiTabButton3.updateSelect(this.selected == i5, false);
                            int i7 = this.currentType;
                            if (i7 == 4) {
                                emojiTabButton3.setLock((z || z3) ? null : Boolean.TRUE);
                            } else if (i7 == 6 || i7 == 5 || i7 == 7) {
                                emojiTabButton3.setLock(null);
                            } else if (!z && !z3) {
                                emojiTabButton3.setLock(Boolean.TRUE);
                            } else if (isInstalled(emojiPack)) {
                                emojiTabButton3.setLock(null);
                            } else {
                                emojiTabButton3.setLock(Boolean.FALSE);
                            }
                        } else if (emojiTabButton3 == null) {
                            EmojiTabButton emojiTabButton4 = new EmojiTabButton(getContext(), emojiPack.resId, false);
                            onTabCreate(emojiTabButton4);
                            this.contentView.addView(emojiTabButton4, i2 + i5);
                        } else {
                            emojiTabButton3.setDrawable(getResources().getDrawable(emojiPack.resId).mutate());
                            emojiTabButton3.updateColor();
                            emojiTabButton3.setLock(null);
                        }
                        i5++;
                        i4 = i4;
                        z2 = z;
                        i2 = i;
                        emojiTabButton2 = emojiTabButton;
                    } else if (emojiTabButton3 != null) {
                        this.contentView.removeView(emojiTabButton3);
                    }
                    i4 = i4;
                    i = i2;
                    emojiTabButton = emojiTabButton2;
                    z = z2;
                    i5++;
                    i4 = i4;
                    z2 = z;
                    i2 = i;
                    emojiTabButton2 = emojiTabButton;
                }
                EmojiTabButton emojiTabButton5 = emojiTabButton2;
                if (emojiTabButton5 != null) {
                    emojiTabButton5.bringToFront();
                    if (emojiTabButton5.getAlpha() < 1.0f) {
                        emojiTabButton5.animate().alpha(1.0f).setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    ((EmojiTabButton) arrayList2.get(i8)).getClass();
                    ((EmojiTabButton) arrayList2.get(i8)).updateAttachState();
                }
                updateClickListeners();
            }
        }
    }
}
