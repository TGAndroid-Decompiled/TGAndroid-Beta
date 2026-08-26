package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
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
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Reactions.HwEmojis;

public class EmojiTabsStrip extends ScrollableHorizontalScrollView {
    private final int accentColor;
    public boolean animateAppear;
    private int animatedEmojiCacheType;
    private ValueAnimator appearAnimation;
    private int appearCount;
    private int currentType;
    private EmojiTabsView emojiTabs;
    boolean first;
    private boolean forceTabsShow;
    private int giftsDrawableId;
    private boolean giftsFirstChange;
    private boolean giftsIsShown;
    public EmojiTabButton giftsTab;
    private boolean includeAnimated;
    private final boolean isGlassDesign;
    private Runnable onSettingsOpenRunnable;
    private int packsIndexStart;
    private float paddingLeftDp;
    private int recentDrawableId;
    private boolean recentFirstChange;
    private boolean recentIsShown;
    public EmojiTabButton recentTab;
    private HashMap<View, Rect> removingViews;
    private Theme.ResourcesProvider resourcesProvider;
    private float selectAnimationT;
    private ValueAnimator selectAnimator;
    private float selectT;
    private int selected;
    private int selectedFullIndex;
    private int settingsDrawableId;
    private EmojiTabButton settingsTab;
    private boolean showSelected;
    private AnimatedFloat showSelectedAlpha;
    public EmojiTabButton toggleEmojiStickersTab;
    public boolean updateButtonDrawables;
    private boolean wasDrawn;
    private int wasIndex;
    private static int[] emojiTabsDrawableIds = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    private static int[] emojiTabsAnimatedDrawableIds = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};

    public class EmojiTabsView extends ScrollableHorizontalScrollView {
        public long id;
        private float showT;
        private boolean shown;
        final EmojiTabsStrip this$0;

        public EmojiTabsView(Context context) {
            super(context);
            this.shown = emojiTabsStrip.forceTabsShow;
            this.showT = emojiTabsStrip.forceTabsShow ? 1.0f : 0.0f;
            setSmoothScrollingEnabled(true);
            int i = 0;
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            setNestedScrollingEnabled(true);
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    int paddingLeft = getPaddingLeft();
                    int i6 = (i5 - i3) / 2;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt != EmojiTabsView.this.this$0.settingsTab && childAt != null) {
                            childAt.layout(paddingLeft, i6 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i6);
                            paddingLeft = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                        }
                    }
                }

                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(Math.max(View.MeasureSpec.getSize(i2), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(EmojiTabsView.this.contentView.getChildCount() * 32), 1073741824)), i3);
                }
            };
            this.contentView = linearLayout;
            linearLayout.setOrientation(0);
            addView(this.contentView, new FrameLayout.LayoutParams(-2, -1));
            while (i < EmojiTabsStrip.emojiTabsDrawableIds.length) {
                final EmojiTabsStrip emojiTabsStrip = emojiTabsStrip;
                EmojiTabButton emojiTabButton = new EmojiTabButton(context, EmojiTabsStrip.emojiTabsDrawableIds[i], EmojiTabsStrip.emojiTabsAnimatedDrawableIds[i], true, false) {
                    {
                        EmojiTabsStrip emojiTabsStrip2 = EmojiTabsView.this.this$0;
                    }

                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        EmojiTabsView.this.intercept(motionEvent);
                        return super.onTouchEvent(motionEvent);
                    }
                };
                emojiTabButton.setContentDescription(EmojiTabsStrip.getEmojiCategoryName(i));
                this.contentView.addView(emojiTabButton);
                i++;
                emojiTabsStrip = emojiTabsStrip;
            }
        }

        public void intercept(MotionEvent motionEvent) {
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
                resetScrollTo();
            }
            this.this$0.requestDisallowInterceptTouchEvent(true);
        }

        public void lambda$show$0(ValueAnimator valueAnimator) {
            this.showT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
            requestLayout();
            updateButtonsVisibility();
            this.this$0.contentView.invalidate();
        }

        public int maxWidth() {
            return AndroidUtilities.dp(Math.min(5.7f, this.contentView.getChildCount()) * 32.0f);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), maxWidth(), this.showT), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            intercept(motionEvent);
            return super.onTouchEvent(motionEvent);
        }

        public void show(boolean z, boolean z2) {
            if (z == this.shown) {
                return;
            }
            this.shown = z;
            if (!z) {
                scrollTo(0);
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z2) {
                this.showT = z ? 1.0f : 0.0f;
                invalidate();
                requestLayout();
                updateButtonsVisibility();
                this.this$0.contentView.invalidate();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.showT, z ? 1.0f : 0.0f);
            this.showAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 5));
            this.showAnimator.setDuration(475L);
            this.showAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.showAnimator.start();
        }
    }

    public static class StabDrawable extends Drawable {
        private final Paint paint;
        private final RectF rectF;

        public StabDrawable(int i) {
            Paint paint = new Paint();
            this.paint = paint;
            this.rectF = new RectF();
            paint.setAlpha(45);
            paint.setColor(i);
        }

        @Override
        public void draw(Canvas canvas) {
            this.rectF.set(0.0f, 0.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f), this.paint);
        }

        @Override
        public int getOpacity() {
            return -3;
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    static {
    }

    public EmojiTabsStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable) {
        this(context, resourcesProvider, z, z2, z3, z4, i, runnable, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider), false);
    }

    public static String getEmojiCategoryName(int i) {
        switch (i) {
            case 0:
                return LocaleController.getString(R.string.Emoji1);
            case 1:
                return LocaleController.getString(R.string.Emoji2);
            case 2:
                return LocaleController.getString(R.string.Emoji3);
            case 3:
                return LocaleController.getString(R.string.Emoji4);
            case 4:
                return LocaleController.getString(R.string.Emoji5);
            case 5:
                return LocaleController.getString(R.string.Emoji6);
            case 6:
                return LocaleController.getString(R.string.Emoji7);
            case 7:
                return LocaleController.getString(R.string.Emoji8);
            default:
                return null;
        }
    }

    public int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    private TLRPC.Document getThumbDocument(TLRPC.StickerSet stickerSet, ArrayList<TLRPC.Document> arrayList) {
        if (stickerSet == null) {
            return null;
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Document document = arrayList.get(i);
                if (document.id == stickerSet.thumb_document_id) {
                    return document;
                }
            }
        }
        if (arrayList == null || arrayList.size() < 1) {
            return null;
        }
        return arrayList.get(0);
    }

    private boolean isFreeEmojiPack(TLRPC.StickerSet stickerSet, ArrayList<TLRPC.Document> arrayList) {
        if (stickerSet == null || arrayList == null) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!MessageObject.isFreeEmoji(arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void lambda$select$4(float f, float f2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.selectAnimationT = fFloatValue;
        this.selectT = AndroidUtilities.lerp(f, f2, fFloatValue);
        this.contentView.invalidate();
    }

    public void lambda$showGifts$0(boolean z) {
        if (z) {
            return;
        }
        this.giftsTab.setVisibility(8);
    }

    public void lambda$updateClickListeners$1(int i, View view) {
        onTabClick(i);
    }

    public void lambda$updateClickListeners$2(int i, View view) {
        onTabClick(i);
    }

    public void lambda$updateClickListeners$3(View view) {
        Runnable runnable = this.onSettingsOpenRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    public int selectorColor() {
        if (this.isGlassDesign) {
            return getGlassIconColor(0.05f);
        }
        int i = this.currentType;
        return (i == 5 || i == 7) ? Theme.multAlpha(0.09f, this.accentColor) : Theme.multAlpha(0.18f, Theme.getColor(Theme.key_chat_emojiPanelIcon, this.resourcesProvider));
    }

    public boolean allowEmojisForNonPremium() {
        return false;
    }

    public boolean doIncludeFeatured() {
        return true;
    }

    public ColorFilter getEmojiColorFilter() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider == null) {
            return Theme.chat_animatedEmojiTextColorFilter;
        }
        int i = Theme.default_shadow_color;
        return resourcesProvider.getAnimatedEmojiColorFilter();
    }

    public boolean isGiftsVisible() {
        return this.giftsTab != null && this.giftsIsShown;
    }

    public boolean isInstalled(EmojiView.EmojiPack emojiPack) {
        return emojiPack.installed;
    }

    @Override
    public boolean isScrolling() {
        return super.isScrolling();
    }

    @Override
    public boolean isTouch() {
        return super.isTouch();
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.contentView.setPadding(AndroidUtilities.dp(this.paddingLeftDp), 0, AndroidUtilities.dp(11.0f), 0);
        super.onMeasure(i, i2);
    }

    public boolean onTabClick(int i) {
        return true;
    }

    public void onTabCreate(EmojiTabButton emojiTabButton) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void resetScrollTo() {
        super.resetScrollTo();
    }

    @Override
    public void scrollTo(int i) {
        super.scrollTo(i);
    }

    @Override
    public boolean scrollToVisible(int i, int i2) {
        return super.scrollToVisible(i, i2);
    }

    public void select(int i) {
        select(i, true);
    }

    public void setAnimatedEmojiCacheType(int i) {
        this.animatedEmojiCacheType = i;
    }

    public void setPaddingLeft(float f) {
        this.paddingLeftDp = f;
    }

    public void showGifts(boolean z) {
        EmojiTabButton emojiTabButton = this.giftsTab;
        if (emojiTabButton != null) {
            boolean z2 = this.giftsFirstChange;
            if (z2 || this.giftsIsShown != z) {
                this.giftsIsShown = z;
                if (z2) {
                    emojiTabButton.setVisibility(z ? 0 : 8);
                    this.giftsTab.setAlpha(z ? 1.0f : 0.0f);
                } else {
                    emojiTabButton.setVisibility(0);
                    this.giftsTab.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new MediaActivity$$ExternalSyntheticLambda5(this, z, 6)).start();
                }
                this.contentView.requestLayout();
                this.giftsFirstChange = false;
            }
        }
    }

    public void showRecent(boolean z) {
        if (this.recentIsShown == z) {
            return;
        }
        this.recentIsShown = z;
        if (this.recentFirstChange) {
            this.recentTab.setAlpha(z ? 1.0f : 0.0f);
        } else {
            this.recentTab.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        }
        if ((!z && this.selected == 0) || (z && this.selected == 1)) {
            select(0, !this.recentFirstChange);
        }
        this.contentView.requestLayout();
        this.recentFirstChange = false;
    }

    public void showRecentTabStub(boolean z) {
        EmojiTabButton emojiTabButton = this.recentTab;
        if (emojiTabButton == null) {
            return;
        }
        if (z) {
            emojiTabButton.setBackground(new StabDrawable(selectorColor()));
        } else {
            emojiTabButton.setBackground(null);
        }
    }

    public void showSelected(boolean z) {
        this.showSelected = z;
        this.contentView.invalidate();
    }

    public void updateClickListeners() {
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
                                    this.f$0.lambda$updateClickListeners$1(i2, view);
                                    break;
                                default:
                                    this.f$0.lambda$updateClickListeners$2(i2, view);
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
                                this.f$0.lambda$updateClickListeners$1(i2, view);
                                break;
                            default:
                                this.f$0.lambda$updateClickListeners$2(i2, view);
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
            emojiTabButton.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 20));
        }
    }

    public void updateColors() {
        EmojiTabButton emojiTabButton = this.recentTab;
        if (emojiTabButton != null) {
            emojiTabButton.updateColor();
        }
    }

    public void updateEmojiPacks(ArrayList<EmojiView.EmojiPack> arrayList) {
        ?? r2;
        ?? r13;
        int i;
        EmojiTabButton emojiTabButton;
        Boolean bool;
        EmojiView.EmojiPack emojiPack;
        if (this.includeAnimated) {
            if (!this.first || MediaDataController.getInstance(UserConfig.selectedAccount).areStickersLoaded(5)) {
                this.first = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = (this.contentView.getChildCount() - this.packsIndexStart) - (this.settingsTab != null ? 1 : 0);
                if (childCount == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                Boolean bool2 = null;
                if (this.appearAnimation != null && this.appearCount != arrayList.size()) {
                    this.appearAnimation.cancel();
                    this.appearAnimation = null;
                }
                this.appearCount = arrayList.size();
                doIncludeFeatured();
                boolean z = UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || allowEmojisForNonPremium();
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (i2 < Math.max(arrayList.size(), childCount)) {
                    ?? emojiTabButton2 = i2 < childCount ? (EmojiTabButton) this.contentView.getChildAt(this.packsIndexStart + i2) : bool2;
                    if (i2 < arrayList.size()) {
                        emojiPack = arrayList.get(i2);
                    } else {
                        r2 = bool2;
                    }
                    if (r2 != 0) {
                        if (r2.resId == 0) {
                            boolean z2 = r2.free;
                            Long l = r2.thumbDocumentId;
                            if (l == null) {
                                r13 = r2;
                                i = i2;
                                TLRPC.Document thumbDocument = getThumbDocument(r13.set, r13.documents);
                                if (emojiTabButton2 == 0) {
                                    emojiTabButton = ((EmojiTabsStrip) this).new EmojiTabButton(getContext(), thumbDocument, z2, false, false);
                                    onTabCreate(emojiTabButton);
                                    this.contentView.addView(emojiTabButton, this.packsIndexStart + i);
                                } else {
                                    emojiTabButton2.setAnimatedEmojiDocument(thumbDocument);
                                }
                                if (thumbDocument == null) {
                                    r2 = emojiPack;
                                    emojiTabButton2 = emojiTabButton2;
                                    r2 = emojiPack;
                                    emojiTabButton2 = emojiTabButton;
                                    emojiTabButton2.setStickerThumb(r13);
                                }
                            } else if (emojiTabButton2 == 0) {
                                r13 = r2;
                                i = i2;
                                emojiTabButton2 = ((EmojiTabsStrip) this).new EmojiTabButton(getContext(), r2.thumbDocumentId.longValue(), z2, false, false);
                                z2 = z2;
                                onTabCreate(emojiTabButton2);
                                this.contentView.addView(emojiTabButton2, this.packsIndexStart + i);
                            } else {
                                r13 = r2;
                                i = i2;
                                emojiTabButton2.setAnimatedEmojiDocumentId(l.longValue());
                            }
                            r2 = emojiPack;
                            emojiTabButton2 = emojiTabButton2;
                            r2 = emojiPack;
                            emojiTabButton2 = emojiTabButton;
                            emojiTabButton2.id = r13.forGroup ? Long.valueOf(439488310) : null;
                            emojiTabButton2.updateSelect(this.selected == i, false);
                            int i3 = this.currentType;
                            if (i3 == 4) {
                                emojiTabButton2.setLock((z || z2) ? null : Boolean.TRUE, false);
                            } else if (i3 == 6 || i3 == 5 || i3 == 7) {
                                bool = null;
                                emojiTabButton2.setLock(null, false);
                            } else if (!z && !z2) {
                                emojiTabButton2.setLock(Boolean.TRUE, false);
                            } else if (isInstalled(r13)) {
                                bool = null;
                                emojiTabButton2.setLock(null, false);
                            } else {
                                emojiTabButton2.setLock(Boolean.FALSE, false);
                            }
                            bool = null;
                        } else if (emojiTabButton2 == 0) {
                            EmojiTabButton emojiTabButton3 = new EmojiTabButton(getContext(), r2.resId, false, false);
                            onTabCreate(emojiTabButton3);
                            this.contentView.addView(emojiTabButton3, this.packsIndexStart + i2);
                        } else {
                            emojiTabButton2.setDrawable(getResources().getDrawable(r2.resId).mutate());
                            emojiTabButton2.updateColor();
                            emojiTabButton2.setLock(bool2, false);
                        }
                        i2 = i + 1;
                        bool2 = bool;
                    } else if (emojiTabButton2 != 0) {
                        this.contentView.removeView(emojiTabButton2);
                    }
                    i = i2;
                    bool = bool2;
                    i2 = i + 1;
                    bool2 = bool;
                }
                EmojiTabButton emojiTabButton4 = this.settingsTab;
                if (emojiTabButton4 != null) {
                    emojiTabButton4.bringToFront();
                    if (this.settingsTab.getAlpha() < 1.0f) {
                        this.settingsTab.animate().alpha(1.0f).setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ((EmojiTabButton) arrayList2.get(i4)).keepAttached = false;
                    ((EmojiTabButton) arrayList2.get(i4)).updateAttachState();
                }
                updateClickListeners();
            }
        }
    }

    public class EmojiTabButton extends ViewGroup {
        AnimatedEmojiDrawable animatedEmoji;
        TLRPC.Document animatedEmojiDocument;
        Long animatedEmojiDocumentId;
        boolean attached;
        private boolean forceSelector;
        public Long id;
        private BackupImageView imageView;
        private boolean isAnimatedEmoji;
        private boolean isVisible;
        public boolean keepAttached;
        private Boolean lastLock;
        private ValueAnimator lockAnimator;
        private float lockT;
        private PremiumLockIconView lockView;
        private RLottieDrawable lottieDrawable;
        public boolean newly;
        private boolean round;
        private ValueAnimator selectAnimator;
        private float selectT;
        private boolean selected;
        EmojiView.EmojiPack setObject;
        public boolean shown;

        public EmojiTabButton(Context context, int i, int i2, boolean z, boolean z2) {
            super(context);
            this.shown = true;
            setFocusable(true);
            this.round = z;
            this.forceSelector = z2;
            if (z) {
                setBackground(Theme.createCircleSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 0, 0));
            } else if (z2) {
                setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), false, null);
                this.lottieDrawable = rLottieDrawable;
                rLottieDrawable.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
                this.lottieDrawable.setMasterParent(this);
                this.lottieDrawable.setAllowDecodeSingleFrame(true);
                this.lottieDrawable.start();
            } else {
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.applyAttach = false;
                backupImageView.setImageDrawable(context.getResources().getDrawable(i).mutate());
                addView(this.imageView);
            }
            updateColor();
        }

        private void initLock() {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            ImageReceiver imageReceiver;
            if (this.lockView == null || (animatedEmojiDrawable = this.animatedEmoji) == null || (imageReceiver = animatedEmojiDrawable.getImageReceiver()) == null) {
                return;
            }
            this.lockView.setImageReceiver(imageReceiver);
        }

        public void lambda$updateLock$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.lockT = fFloatValue;
            this.lockView.setScaleX(fFloatValue);
            this.lockView.setScaleY(this.lockT);
            this.lockView.setAlpha(this.lockT);
        }

        public void lambda$updateSelect$1(ValueAnimator valueAnimator) {
            this.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateColor();
        }

        private void playAnimation() {
            ImageReceiver imageReceiver;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            if (animatedEmojiDrawable == null || (imageReceiver = animatedEmojiDrawable.getImageReceiver()) == null) {
                return;
            }
            if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().seekTo(0L, true);
            }
            imageReceiver.startAnimation();
        }

        private void setColor(int i) {
            if (EmojiTabsStrip.this.currentType == 5 || EmojiTabsStrip.this.currentType == 7) {
                i = EmojiTabsStrip.this.accentColor;
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null && !this.isAnimatedEmoji) {
                backupImageView.setColorFilter(porterDuffColorFilter);
                this.imageView.invalidate();
            }
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setColorFilter(porterDuffColorFilter);
                invalidate();
            }
        }

        private void stopAnimation() {
            ImageReceiver imageReceiver;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
            if (animatedEmojiDrawable == null || (imageReceiver = animatedEmojiDrawable.getImageReceiver()) == null) {
                return;
            }
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().setCurrentFrame(0);
                imageReceiver.getLottieAnimation().stop();
            } else if (imageReceiver.getAnimation() != null) {
                imageReceiver.getAnimation().stop();
            }
        }

        public void updateAttachState() {
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
                    this.imageView.clearImage();
                    EmojiView.EmojiPack emojiPack = this.setObject;
                    if (emojiPack != null) {
                        this.imageView.setImage(ImageLocation.getForStickerSet(emojiPack.set), "24_24", (String) null, (Drawable) null, this.setObject);
                        if (this.setObject.needLoadSet != null) {
                            MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(this.setObject.needLoadSet, false);
                            this.setObject.needLoadSet = null;
                        }
                    }
                } else {
                    backupImageView.clearImage();
                    if (this.animatedEmojiDocument != null) {
                        this.animatedEmoji = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, EmojiTabsStrip.this.animatedEmojiCacheType, this.animatedEmojiDocument);
                    } else {
                        this.animatedEmoji = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, EmojiTabsStrip.this.animatedEmojiCacheType, this.animatedEmojiDocumentId.longValue());
                    }
                    this.animatedEmoji.addView(this.imageView);
                    this.imageView.setImageDrawable(this.animatedEmoji);
                }
            } else {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmoji;
                if (animatedEmojiDrawable2 != null) {
                    animatedEmojiDrawable2.removeView(backupImageView);
                    this.animatedEmoji = null;
                }
                this.imageView.clearImage();
            }
            if (this.attached && this.isVisible) {
                this.imageView.onAttachedToWindow();
            } else {
                this.imageView.onDetachedFromWindow();
            }
            updateLockImageReceiver();
        }

        private void updateLock(final boolean z, boolean z2) {
            int i = 1;
            ValueAnimator valueAnimator = this.lockAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (Math.abs(this.lockT - (z ? 1.0f : 0.0f)) < 0.01f) {
                return;
            }
            if (!z2) {
                float f = z ? 1.0f : 0.0f;
                this.lockT = f;
                this.lockView.setScaleX(f);
                this.lockView.setScaleY(this.lockT);
                this.lockView.setAlpha(this.lockT);
                this.lockView.setVisibility(z ? 0 : 8);
                return;
            }
            this.lockView.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.lockT, z ? 1.0f : 0.0f);
            this.lockAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new EmojiTabsStrip$EmojiTabButton$$ExternalSyntheticLambda0(this, i));
            this.lockAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    EmojiTabButton.this.lockView.setVisibility(8);
                }
            });
            this.lockAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.lockAnimator.setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 200L);
            this.lockAnimator.start();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            if (rLottieDrawable == null || !this.isVisible) {
                return;
            }
            rLottieDrawable.draw(canvas);
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
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

        public Long id() {
            TLRPC.StickerSet stickerSet;
            Long l = this.id;
            if (l != null) {
                return l;
            }
            EmojiView.EmojiPack emojiPack = this.setObject;
            if (emojiPack != null && (stickerSet = emojiPack.set) != null) {
                return Long.valueOf(stickerSet.id);
            }
            Long l2 = this.animatedEmojiDocumentId;
            if (l2 != null) {
                return l2;
            }
            TLRPC.Document document = this.animatedEmojiDocument;
            if (document != null) {
                return Long.valueOf(document.id);
            }
            return null;
        }

        @Override
        public void invalidate() {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            updateAttachState();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            updateAttachState();
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.isVisible) {
                super.onDraw(canvas);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            TLRPC.Document documentFindDocument;
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
                        if (l != null && (documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, l.longValue())) != null) {
                            contentDescription = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            BackupImageView backupImageView = this.imageView;
            if (backupImageView != null) {
                int i5 = (i3 - i) / 2;
                int i6 = (i4 - i2) / 2;
                backupImageView.layout(i5 - (backupImageView.getMeasuredWidth() / 2), i6 - (this.imageView.getMeasuredHeight() / 2), (this.imageView.getMeasuredWidth() / 2) + i5, (this.imageView.getMeasuredHeight() / 2) + i6);
            }
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView != null) {
                int i7 = i3 - i;
                int i8 = i4 - i2;
                premiumLockIconView.layout(i7 - premiumLockIconView.getMeasuredWidth(), i8 - this.lockView.getMeasuredHeight(), i7, i8);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
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
        public boolean performClick() {
            playAnimation();
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
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.imageView);
                this.animatedEmoji = null;
            }
            this.imageView.clearImage();
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
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.imageView);
                this.animatedEmoji = null;
            }
            this.imageView.clearImage();
            this.animatedEmojiDocument = null;
            this.animatedEmojiDocumentId = j != 0 ? Long.valueOf(j) : null;
            updateAttachState();
        }

        public void setDrawable(Drawable drawable) {
            setAnimatedEmojiDocument(null);
            setStickerThumb(null);
            this.imageView.setImageDrawable(drawable);
        }

        public void setLock(Boolean bool, boolean z) {
            if (this.lockView == null) {
                return;
            }
            this.lastLock = bool;
            if (bool == null) {
                updateLock(false, z);
                return;
            }
            updateLock(true, z);
            if (bool.booleanValue()) {
                this.lockView.setImageResource(R.drawable.msg_mini_lockedemoji);
                return;
            }
            Drawable drawableMutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.lockView.setImageDrawable(drawableMutate);
        }

        public void setStickerThumb(EmojiView.EmojiPack emojiPack) {
            if (emojiPack != null && emojiPack.set == null) {
                emojiPack = null;
            }
            EmojiView.EmojiPack emojiPack2 = this.setObject;
            if (emojiPack2 == null || emojiPack == null || emojiPack2.set.id != emojiPack.set.id) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmoji;
                if (animatedEmojiDrawable != null && this.animatedEmojiDocument == null && this.animatedEmojiDocumentId == null) {
                    animatedEmojiDrawable.removeView(this.imageView);
                    this.animatedEmoji = null;
                }
                this.imageView.clearImage();
                this.setObject = emojiPack;
                updateAttachState();
            }
        }

        public void updateColor() {
            Theme.setSelectorDrawableColor(getBackground(), EmojiTabsStrip.this.selectorColor(), false);
            if (EmojiTabsStrip.this.isGlassDesign) {
                setColor(EmojiTabsStrip.this.getGlassIconColor(AndroidUtilities.lerp(0.4f, 0.8f, this.selectT)));
                return;
            }
            setColor(ColorUtils.blendARGB(this.selectT, Theme.getColor(Theme.key_chat_emojiPanelIcon, EmojiTabsStrip.this.resourcesProvider), Theme.getColor(Theme.key_chat_emojiPanelIconSelected, EmojiTabsStrip.this.resourcesProvider)));
        }

        public void updateLockImageReceiver() {
            PremiumLockIconView premiumLockIconView = this.lockView;
            if (premiumLockIconView == null || premiumLockIconView.done() || !(getDrawable() instanceof AnimatedEmojiDrawable)) {
                return;
            }
            if (((AnimatedEmojiDrawable) getDrawable()).canOverrideColor()) {
                this.lockView.setImageReceiver(null);
                this.lockView.setColor(EmojiTabsStrip.this.accentColor);
                return;
            }
            ImageReceiver imageReceiver = ((AnimatedEmojiDrawable) getDrawable()).getImageReceiver();
            if (imageReceiver != null) {
                this.lockView.setImageReceiver(imageReceiver);
                this.lockView.invalidate();
            }
        }

        public void updateSelect(final boolean z, boolean z2) {
            int i = 0;
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
                valueAnimatorOfFloat.addUpdateListener(new EmojiTabsStrip$EmojiTabButton$$ExternalSyntheticLambda0(this, i));
                this.selectAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EmojiTabButton emojiTabButton = EmojiTabButton.this;
                        if (!EmojiTabsStrip.this.updateButtonDrawables || emojiTabButton.round) {
                            return;
                        }
                        if (!z && !EmojiTabButton.this.forceSelector) {
                            EmojiTabButton.this.setBackground(null);
                        } else if (EmojiTabButton.this.getBackground() == null) {
                            EmojiTabButton emojiTabButton2 = EmojiTabButton.this;
                            emojiTabButton2.setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
                        }
                    }
                });
                this.selectAnimator.setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 350L);
                this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectAnimator.start();
            }
        }

        public void updateVisibilityInbounds(boolean z, boolean z2) {
            RLottieDrawable rLottieDrawable;
            if (!this.isVisible && z && (rLottieDrawable = this.lottieDrawable) != null && !rLottieDrawable.isRunning() && !z2) {
                this.lottieDrawable.setProgress(0.0f);
                this.lottieDrawable.start();
            }
            if (this.isVisible != z) {
                this.isVisible = z;
                if (z) {
                    invalidate();
                    PremiumLockIconView premiumLockIconView = this.lockView;
                    if (premiumLockIconView != null) {
                        premiumLockIconView.invalidate();
                    }
                    initLock();
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

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            if (HwEmojis.grab(this)) {
                return;
            }
            super.invalidate(i, i2, i3, i4);
        }

        public EmojiTabButton(Context context, int i, boolean z, boolean z2) {
            super(context);
            this.shown = true;
            setFocusable(true);
            this.round = z;
            this.forceSelector = z2;
            if (z) {
                setBackground(Theme.createCircleSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 0, 0));
            } else if (z2) {
                setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
            }
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.applyAttach = false;
            backupImageView.setImageDrawable(context.getResources().getDrawable(i).mutate());
            updateColor();
            addView(this.imageView);
        }

        public EmojiTabButton(Context context, TLRPC.Document document, boolean z, boolean z2, boolean z3) {
            super(context);
            this.shown = true;
            setFocusable(true);
            this.newly = true;
            this.round = z2;
            this.forceSelector = z3;
            if (z2) {
                setBackground(Theme.createCircleSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 0, 0));
            } else if (z3) {
                setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
            }
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                public void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                    EmojiTabButton.this.updateLockImageReceiver();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
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
            addView(this.imageView);
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED, EmojiTabsStrip.this.resourcesProvider) {
                @Override
                public void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.lockView = premiumLockIconView;
            premiumLockIconView.setAlpha(0.0f);
            this.lockView.setScaleX(0.0f);
            this.lockView.setScaleY(0.0f);
            updateLockImageReceiver();
            addView(this.lockView);
            updateColor();
        }

        public EmojiTabButton(Context context, long j, boolean z, boolean z2, boolean z3) {
            super(context);
            this.shown = true;
            setFocusable(true);
            this.newly = true;
            this.round = z2;
            this.forceSelector = z3;
            if (z2) {
                setBackground(Theme.createCircleSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 0, 0));
            } else if (z3) {
                setBackground(Theme.createRadSelectorDrawable(EmojiTabsStrip.this.selectorColor(), 8, 8));
            }
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                public void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                    EmojiTabButton.this.updateLockImageReceiver();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.imageView = backupImageView;
            backupImageView.applyAttach = false;
            this.animatedEmojiDocumentId = Long.valueOf(j);
            this.isAnimatedEmoji = true;
            this.imageView.setColorFilter(EmojiTabsStrip.this.getEmojiColorFilter());
            addView(this.imageView);
            PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED, EmojiTabsStrip.this.resourcesProvider) {
                @Override
                public void invalidate() {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grab(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.lockView = premiumLockIconView;
            premiumLockIconView.setAlpha(0.0f);
            this.lockView.setScaleX(0.0f);
            this.lockView.setScaleY(0.0f);
            updateLockImageReceiver();
            addView(this.lockView);
            updateColor();
        }
    }

    public EmojiTabsStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, boolean z5) {
        this(context, resourcesProvider, z, z2, z3, z4, i, runnable, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider), z5);
    }

    public void select(int i, boolean z) {
        int i2;
        int i3 = 0;
        boolean z2 = z && !this.first;
        EmojiTabButton emojiTabButton = this.toggleEmojiStickersTab;
        if (emojiTabButton != null) {
            i++;
        }
        if (!this.recentIsShown || emojiTabButton != null) {
            i = Math.max(1, i);
        }
        this.selectedFullIndex = i;
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
        if (i4 != this.selected) {
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.selectT;
            float f2 = this.selected;
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.selectAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new EmojiTabsStrip$$ExternalSyntheticLambda0(this, f, f2, i3));
                this.selectAnimator.setDuration(350L);
                this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectAnimator.start();
            } else {
                this.selectAnimationT = 1.0f;
                this.selectT = AndroidUtilities.lerp(f, f2, 1.0f);
                this.contentView.invalidate();
            }
            EmojiTabsView emojiTabsView2 = this.emojiTabs;
            if (emojiTabsView2 != null) {
                emojiTabsView2.show(this.selected == 1 || this.forceTabsShow, z2);
            }
            View childAt3 = this.contentView.getChildAt(this.selected);
            if (this.selected >= 2) {
                scrollToVisible(childAt3.getLeft(), childAt3.getRight());
            } else {
                scrollTo(0);
            }
        }
        if (this.wasIndex != i) {
            EmojiTabsView emojiTabsView3 = this.emojiTabs;
            if (emojiTabsView3 != null && this.selected == 1 && i >= 1 && i <= emojiTabsView3.contentView.getChildCount() + 1) {
                int i9 = (i - 1) * 36;
                this.emojiTabs.scrollToVisible(AndroidUtilities.dp(i9 - 6), AndroidUtilities.dp(i9 + 24));
            }
            this.wasIndex = i;
        }
    }

    public EmojiTabsStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, int i2) {
        this(context, resourcesProvider, z, z2, z3, z4, i, runnable, i2, false);
    }

    public EmojiTabsStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2, boolean z3, final boolean z4, int i, Runnable runnable, int i2, final boolean z5) {
        super(context);
        this.recentDrawableId = R.drawable.msg_emoji_recent;
        this.giftsDrawableId = R.drawable.msg_emoji_gem;
        this.settingsDrawableId = R.drawable.smiles_tab_settings;
        this.forceTabsShow = !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        this.showSelected = true;
        this.removingViews = new HashMap<>();
        this.selectT = 0.0f;
        this.selectAnimationT = 0.0f;
        this.selected = 0;
        this.selectedFullIndex = 0;
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
            private final LongSparseArray lastX = new LongSparseArray();
            private final Paint paint = new Paint(1);
            private final RectF from = new RectF();
            private final RectF to = new RectF();
            private final RectF rect = new RectF();
            private final Path path = new Path();

            private void getChildBounds(int i3, RectF rectF) {
                View childAt = getChildAt(MathUtils.clamp(i3, 0, getChildCount() - 1));
                if (childAt == null) {
                    return;
                }
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                for (Map.Entry entry : EmojiTabsStrip.this.removingViews.entrySet()) {
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
                if (EmojiTabsStrip.this.showSelectedAlpha == null) {
                    EmojiTabsStrip.this.showSelectedAlpha = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                float f = EmojiTabsStrip.this.showSelectedAlpha.set(EmojiTabsStrip.this.showSelected ? 1.0f : 0.0f);
                int iFloor = (int) Math.floor(EmojiTabsStrip.this.selectT);
                int iCeil = (int) Math.ceil(EmojiTabsStrip.this.selectT);
                getChildBounds(iFloor, this.from);
                getChildBounds(iCeil, this.to);
                AndroidUtilities.lerp(this.from, this.to, EmojiTabsStrip.this.selectT - iFloor, this.rect);
                float fClamp01 = EmojiTabsStrip.this.emojiTabs != null ? 1.0f - Utilities.clamp01(Math.abs(EmojiTabsStrip.this.selectT - ((EmojiTabsStrip.this.giftsTab != null ? 1 : 0) + 1))) : 0.0f;
                float f2 = (1.0f - EmojiTabsStrip.this.selectAnimationT) * EmojiTabsStrip.this.selectAnimationT * 4.0f;
                float fM = AndroidUtilities$$ExternalSyntheticOutline0.m(f2, 0.3f, 1.0f, this.rect.width() / 2.0f);
                float fHeight = (1.0f - (f2 * 0.05f)) * (this.rect.height() / 2.0f);
                RectF rectF = this.rect;
                rectF.set(rectF.centerX() - fM, this.rect.centerY() - fHeight, this.rect.centerX() + fM, this.rect.centerY() + fHeight);
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, fClamp01));
                this.paint.setColor(EmojiTabsStrip.this.selectorColor());
                if (EmojiTabsStrip.this.forceTabsShow) {
                    Paint paint = this.paint;
                    paint.setAlpha((int) ((1.0f - (fClamp01 * 0.5f)) * paint.getAlpha() * f));
                } else {
                    Paint paint2 = this.paint;
                    paint2.setAlpha((int) (paint2.getAlpha() * f));
                }
                this.path.rewind();
                Path path = this.path;
                RectF rectF2 = this.rect;
                float fHeight2 = z5 ? rectF2.height() / 2.0f : fDp;
                if (z5) {
                    fDp = this.rect.height() / 2.0f;
                }
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, fHeight2, fDp, direction);
                canvas.drawPath(this.path, this.paint);
                if (EmojiTabsStrip.this.forceTabsShow) {
                    this.path.rewind();
                    getChildBounds(1, this.rect);
                    this.path.addRoundRect(this.rect, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
                    this.paint.setColor(EmojiTabsStrip.this.selectorColor());
                    Paint paint3 = this.paint;
                    paint3.setAlpha((int) (paint3.getAlpha() * 0.5f));
                    canvas.drawPath(this.path, this.paint);
                }
                if (EmojiTabsStrip.this.emojiTabs != null) {
                    this.path.addCircle(AndroidUtilities.dp(15.0f) + EmojiTabsStrip.this.emojiTabs.getLeft(), (EmojiTabsStrip.this.emojiTabs.getBottom() + EmojiTabsStrip.this.emojiTabs.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
                }
                super.dispatchDraw(canvas);
                EmojiTabsStrip.this.wasDrawn = true;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view != EmojiTabsStrip.this.emojiTabs) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipPath(this.path);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public void onLayout(boolean z6, int i3, int i4, int i5, int i6) {
                int i7 = (i6 - i4) / 2;
                if (!z4) {
                    int childCount = (getChildCount() - (!EmojiTabsStrip.this.recentIsShown ? 1 : 0)) - (!EmojiTabsStrip.this.giftsIsShown ? 1 : 0);
                    int iM$3 = (int) (OKLCH.m$3(30.0f, childCount, ((i5 - i3) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
                    int paddingLeft = getPaddingLeft();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = getChildAt((!EmojiTabsStrip.this.recentIsShown ? 1 : 0) + (!EmojiTabsStrip.this.giftsIsShown ? 1 : 0) + i8);
                        if (childAt != null) {
                            childAt.layout(paddingLeft, i7 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i7);
                            paddingLeft = childAt.getMeasuredWidth() + iM$3 + paddingLeft;
                        }
                    }
                    return;
                }
                int paddingLeft2 = getPaddingLeft();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt2 = getChildAt(i9);
                    if (childAt2 != EmojiTabsStrip.this.settingsTab && !EmojiTabsStrip.this.removingViews.containsKey(childAt2) && childAt2 != null) {
                        childAt2.layout(paddingLeft2, i7 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i7);
                        boolean z7 = childAt2 instanceof EmojiTabButton;
                        Long lId = z7 ? ((EmojiTabButton) childAt2).id() : childAt2 instanceof EmojiTabsView ? Long.valueOf(((EmojiTabsView) childAt2).id) : null;
                        if (EmojiTabsStrip.this.animateAppear && z7) {
                            EmojiTabButton emojiTabButton = (EmojiTabButton) childAt2;
                            if (emojiTabButton.newly) {
                                emojiTabButton.newly = false;
                                childAt2.setScaleX(0.0f);
                                childAt2.setScaleY(0.0f);
                                childAt2.setAlpha(0.0f);
                                childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(HwEmojis.isHwEnabledOrPreparing() ? 0L : 200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            }
                        }
                        if (lId != null) {
                            Integer num = (Integer) this.lastX.get(lId.longValue());
                            if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                                childAt2.setTranslationX(num.intValue() - paddingLeft2);
                                childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            }
                            this.lastX.put(Integer.valueOf(paddingLeft2), lId.longValue());
                        }
                        EmojiTabsStrip emojiTabsStrip = EmojiTabsStrip.this;
                        if (childAt2 != emojiTabsStrip.recentTab || emojiTabsStrip.recentIsShown) {
                            EmojiTabsStrip emojiTabsStrip2 = EmojiTabsStrip.this;
                            if (childAt2 != emojiTabsStrip2.giftsTab || emojiTabsStrip2.giftsIsShown) {
                                paddingLeft2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                            }
                        }
                    }
                }
                if (EmojiTabsStrip.this.settingsTab != null) {
                    Long l = EmojiTabsStrip.this.settingsTab.id;
                    if (getPaddingRight() + EmojiTabsStrip.this.settingsTab.getMeasuredWidth() + paddingLeft2 <= EmojiTabsStrip.this.getMeasuredWidth()) {
                        EmojiTabButton emojiTabButton2 = EmojiTabsStrip.this.settingsTab;
                        int i10 = i5 - i3;
                        int paddingRight = (i10 - getPaddingRight()) - EmojiTabsStrip.this.settingsTab.getMeasuredWidth();
                        emojiTabButton2.layout(paddingRight, i7 - (EmojiTabsStrip.this.settingsTab.getMeasuredHeight() / 2), i10 - getPaddingRight(), (EmojiTabsStrip.this.settingsTab.getMeasuredHeight() / 2) + i7);
                        paddingLeft2 = paddingRight;
                    } else {
                        EmojiTabsStrip.this.settingsTab.layout(paddingLeft2, i7 - (EmojiTabsStrip.this.settingsTab.getMeasuredHeight() / 2), EmojiTabsStrip.this.settingsTab.getMeasuredWidth() + paddingLeft2, (EmojiTabsStrip.this.settingsTab.getMeasuredHeight() / 2) + i7);
                    }
                    if (l != null) {
                        if (this.lastX.get(l.longValue()) != null && ((Integer) this.lastX.get(l.longValue())).intValue() != paddingLeft2) {
                            EmojiTabsStrip.this.settingsTab.setTranslationX(((Integer) this.lastX.get(l.longValue())).intValue() - paddingLeft2);
                            EmojiTabsStrip.this.settingsTab.animate().translationX(0.0f).setDuration(350L).start();
                        }
                        this.lastX.put(Integer.valueOf(paddingLeft2), l.longValue());
                    }
                }
            }

            @Override
            public void onMeasure(int i3, int i4) {
                EmojiTabButton emojiTabButton;
                EmojiTabButton emojiTabButton2;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
                float fDp = 0.0f;
                int paddingRight = (getPaddingRight() + getPaddingLeft()) - ((int) ((EmojiTabsStrip.this.recentIsShown || (emojiTabButton2 = EmojiTabsStrip.this.recentTab) == null) ? 0.0f : emojiTabButton2.getAlpha() * AndroidUtilities.dp(33.0f)));
                if (!EmojiTabsStrip.this.giftsIsShown && (emojiTabButton = EmojiTabsStrip.this.giftsTab) != null) {
                    fDp = AndroidUtilities.dp(33.0f) * emojiTabButton.getAlpha();
                }
                int measuredWidth = paddingRight - ((int) fDp);
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt != null) {
                        childAt.measure(iMakeMeasureSpec, i4);
                        measuredWidth = childAt.getMeasuredWidth() + (i5 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + measuredWidth;
                    }
                }
                if (z4) {
                    setMeasuredDimension(Math.max(measuredWidth, View.MeasureSpec.getSize(i3)), View.MeasureSpec.getSize(i4));
                } else {
                    setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
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
            EmojiTabButton emojiTabButton = new EmojiTabButton(context, R.drawable.msg_emoji_stickers, false, false);
            this.toggleEmojiStickersTab = emojiTabButton;
            linearLayout2.addView(emojiTabButton);
            this.toggleEmojiStickersTab.setContentDescription(LocaleController.getString(R.string.AccDescrStickers));
        }
        if (i == 3) {
            this.recentDrawableId = R.drawable.msg_emoji_smiles;
        }
        if (i == 6) {
            this.recentDrawableId = R.drawable.emoji_love;
        }
        if (z) {
            LinearLayout linearLayout3 = this.contentView;
            EmojiTabButton emojiTabButton2 = new EmojiTabButton(context, this.recentDrawableId, false, false);
            this.recentTab = emojiTabButton2;
            linearLayout3.addView(emojiTabButton2);
            this.recentTab.setContentDescription(LocaleController.getString(R.string.RecentlyUsed));
            this.recentTab.id = Long.valueOf(-934918565);
        }
        if (z2) {
            LinearLayout linearLayout4 = this.contentView;
            EmojiTabButton emojiTabButton3 = new EmojiTabButton(context, this.giftsDrawableId, false, false);
            this.giftsTab = emojiTabButton3;
            linearLayout4.addView(emojiTabButton3);
            this.giftsTab.setContentDescription(LocaleController.getString(R.string.EmojiPackCollectibles));
            this.giftsTab.setAlpha(0.0f);
            this.giftsTab.id = Long.valueOf(98352451);
        }
        if (z4) {
            if (z3) {
                LinearLayout linearLayout5 = this.contentView;
                EmojiTabsView emojiTabsView = new EmojiTabsView(context);
                this.emojiTabs = emojiTabsView;
                linearLayout5.addView(emojiTabsView);
                this.emojiTabs.id = 3552126;
            }
            this.packsIndexStart = this.contentView.getChildCount();
            if (runnable != null) {
                LinearLayout linearLayout6 = this.contentView;
                EmojiTabButton emojiTabButton4 = new EmojiTabButton(context, this.settingsDrawableId, false, true);
                this.settingsTab = emojiTabButton4;
                linearLayout6.addView(emojiTabButton4);
                this.settingsTab.setContentDescription(LocaleController.getString(R.string.Settings));
                this.settingsTab.id = Long.valueOf(1434631203);
                this.settingsTab.setAlpha(0.0f);
            }
            updateClickListeners();
            return;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = emojiTabsDrawableIds;
            if (i3 < iArr.length) {
                EmojiTabButton emojiTabButton5 = new EmojiTabButton(context, iArr[i3], false, i3 == 0);
                emojiTabButton5.setContentDescription(getEmojiCategoryName(i3));
                this.contentView.addView(emojiTabButton5);
                i3++;
            } else {
                updateClickListeners();
                return;
            }
        }
    }
}
