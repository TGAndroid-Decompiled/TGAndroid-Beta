package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;

public abstract class BottomPagerTabs extends View {
    public Utilities.Callback onTabClick;
    public float progress;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scrolling;
    public final AnimatedFloat scrollingT;
    public final Paint selectPaint;
    public final Tab[] tabs;
    public boolean touchDown;
    public int value;

    public final class Tab {
        public boolean active;
        public final RectF clickRect;
        public final int customEndFrameEnd;
        public final int customEndFrameMid;
        public final RLottieDrawable drawable;
        public int drawableColor;
        public final int i;
        public final StaticLayout layout;
        public final float layoutLeft;
        public final float layoutWidth;
        public final AnimatedFloat nonscrollingT;
        public final TextPaint paint;
        public final BaseCell.RippleDrawableSafe ripple;
        public final MediaActivity.StoriesTabsView this$0;

        public Tab(MediaActivity.StoriesTabsView storiesTabsView, int i, int i2, int i3, int i4, String str) {
            this.this$0 = storiesTabsView;
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            this.clickRect = new RectF();
            this.nonscrollingT = new AnimatedFloat(storiesTabsView, 0L, 200L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.drawableColor = -1;
            this.i = i;
            this.customEndFrameMid = i3;
            this.customEndFrameEnd = i4;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), true, null);
            this.drawable = rLottieDrawable;
            rLottieDrawable.masterParent = storiesTabsView;
            rLottieDrawable.decodeSingleFrame = true;
            rLottieDrawable.scheduleNextGetFrame();
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            rLottieDrawable.setAutoRepeat(0);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = storiesTabsView.resourcesProvider;
            textPaint.setColor(Theme.getColor(i5, resourcesProvider));
            StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layout = staticLayout;
            this.layoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
            this.layoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
            this.ripple = Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i5, resourcesProvider)), 7, AndroidUtilities.dp(16.0f));
        }
    }

    public BottomPagerTabs(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectPaint = new Paint(1);
        this.scrollingT = new AnimatedFloat(this, 0L, 210L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.resourcesProvider = resourcesProvider;
        MediaActivity.StoriesTabsView storiesTabsView = (MediaActivity.StoriesTabsView) this;
        this.tabs = new Tab[]{new Tab(storiesTabsView, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new Tab(storiesTabsView, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        setProgress(0.0f, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        BottomPagerTabs bottomPagerTabs = this;
        int i = Theme.key_windowBackgroundWhite;
        Theme.ResourcesProvider resourcesProvider = bottomPagerTabs.resourcesProvider;
        canvas.drawColor(Theme.getColor(i, resourcesProvider));
        canvas.drawRect(0.0f, 0.0f, bottomPagerTabs.getWidth(), AndroidUtilities.getShadowHeight(), Theme.dividerPaint);
        int width = (bottomPagerTabs.getWidth() - bottomPagerTabs.getPaddingLeft()) - bottomPagerTabs.getPaddingRight();
        Tab[] tabArr = bottomPagerTabs.tabs;
        int length = width / tabArr.length;
        int iMin = Math.min(AndroidUtilities.dp(64.0f), length);
        float f5 = bottomPagerTabs.scrollingT.set(bottomPagerTabs.scrolling);
        Paint paint = bottomPagerTabs.selectPaint;
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f = 9.0f;
            f2 = 16.0f;
            paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), (int) (((Math.abs((Math.floor(bottomPagerTabs.progress) + 0.5d) - ((double) bottomPagerTabs.progress)) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * ((double) f5))));
            float paddingLeft = bottomPagerTabs.getPaddingLeft();
            float f7 = length;
            float f8 = f7 / 2.0f;
            float fFloor = (((float) Math.floor(bottomPagerTabs.progress)) * f7) + f8;
            f3 = 41.0f;
            float fCeil = (f7 * ((float) Math.ceil(bottomPagerTabs.progress))) + f8;
            float f9 = bottomPagerTabs.progress;
            float fLerp = AndroidUtilities.lerp(fFloor, fCeil, f9 - ((int) f9)) + paddingLeft;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = iMin / 2.0f;
            rectF.set(fLerp - f10, AndroidUtilities.dp(9.0f), fLerp + f10, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f = 9.0f;
            f2 = 16.0f;
            f3 = 41.0f;
        }
        int i2 = 0;
        while (i2 < tabArr.length) {
            Tab tab = tabArr[i2];
            int paddingLeft2 = (i2 * length) + bottomPagerTabs.getPaddingLeft();
            tab.clickRect.set(paddingLeft2, f6, paddingLeft2 + length, bottomPagerTabs.getHeight());
            float fMin = 1.0f - Math.min(1.0f, Math.abs(bottomPagerTabs.progress - i2));
            Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6, resourcesProvider2);
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            int iBlendARGB = ColorUtils.blendARGB(fMin, color, Theme.getColor(i3, resourcesProvider2));
            tab.paint.setColor(iBlendARGB);
            int i4 = tab.drawableColor;
            RLottieDrawable rLottieDrawable = tab.drawable;
            if (i4 != iBlendARGB) {
                tab.drawableColor = iBlendARGB;
                f4 = 1.0f;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
            } else {
                f4 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF2 = tab.clickRect;
            float f11 = iMin / 2.0f;
            int i5 = length;
            Tab[] tabArr2 = tabArr;
            rect.set((int) (rectF2.centerX() - f11), AndroidUtilities.dp(f), (int) (rectF2.centerX() + f11), AndroidUtilities.dp(f3));
            float f12 = tab.nonscrollingT.set(fMin > 0.6f);
            if (f5 < f4) {
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i3, resourcesProvider2), (int) ((f4 - f5) * f12 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), paint);
            }
            BaseCell.RippleDrawableSafe rippleDrawableSafe = tab.ripple;
            rippleDrawableSafe.setBounds(rect);
            rippleDrawableSafe.draw(canvas);
            float fDp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - fDp), (int) (AndroidUtilities.dpf2(24.66f) - fDp), (int) (rectF2.centerX() + fDp), (int) (AndroidUtilities.dpf2(24.66f) + fDp));
            rLottieDrawable.setBounds(rect);
            rLottieDrawable.draw(canvas);
            canvas.save();
            float fCenterX = (rectF2.centerX() - (tab.layoutWidth / 2.0f)) - tab.layoutLeft;
            float fDp2 = AndroidUtilities.dp(50.0f);
            StaticLayout staticLayout = tab.layout;
            canvas.translate(fCenterX, fDp2 - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i2++;
            bottomPagerTabs = this;
            resourcesProvider = resourcesProvider2;
            tabArr = tabArr2;
            length = i5;
            f6 = 0.0f;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.getShadowHeight() + AndroidUtilities.dp(64.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            this.touchDown = true;
            return true;
        }
        int action = motionEvent.getAction();
        Tab[] tabArr = this.tabs;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x = motionEvent.getX();
            int i = 0;
            while (true) {
                if (i >= tabArr.length) {
                    i = -1;
                    break;
                }
                RectF rectF = tabArr[i].clickRect;
                if (rectF.left < x && rectF.right > x) {
                    if (motionEvent.getAction() == 1) {
                        break;
                    }
                    if (this.touchDown) {
                        tabArr[i].ripple.setState(new int[0]);
                    }
                    tabArr[i].ripple.setState(new int[]{16842919, 16842910});
                    break;
                }
                i++;
            }
            for (int i2 = 0; i2 < tabArr.length; i2++) {
                if (i2 != i || motionEvent.getAction() == 1) {
                    tabArr[i2].ripple.setState(new int[0]);
                }
            }
            if (i >= 0 && this.value != i && (callback = this.onTabClick) != null) {
                callback.run(Integer.valueOf(i));
            }
            this.touchDown = false;
        } else if (motionEvent.getAction() == 3) {
            for (Tab tab : tabArr) {
                tab.ripple.setState(new int[0]);
            }
            this.touchDown = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.onTabClick = callback;
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setScrolling(boolean z) {
        if (this.scrolling == z) {
            return;
        }
        this.scrolling = z;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i = 0;
        while (true) {
            Tab[] tabArr = this.tabs;
            if (i >= tabArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (tabArr[i].ripple == drawable) {
                return true;
            }
            i++;
        }
    }

    public final void setProgress(float f, boolean z) {
        Tab[] tabArr = this.tabs;
        float fClamp = Utilities.clamp(f, tabArr.length, 0.0f);
        this.progress = fClamp;
        this.value = Math.round(fClamp);
        for (int i = 0; i < tabArr.length; i++) {
            Tab tab = tabArr[i];
            boolean z2 = ((float) Math.abs(this.value - i)) < (tabArr[i].active ? 0.25f : 0.35f);
            if (tab.active != z2) {
                int i2 = tab.this$0.tabs[tab.i].customEndFrameMid;
                RLottieDrawable rLottieDrawable = tab.drawable;
                if (i2 != 0) {
                    int i3 = tab.customEndFrameEnd;
                    int i4 = tab.customEndFrameMid;
                    if (z2) {
                        rLottieDrawable.setCustomEndFrame(i4);
                        if (rLottieDrawable.currentFrame >= i3 - 2) {
                            rLottieDrawable.setCurrentFrame(0, false, false);
                        }
                        if (rLottieDrawable.currentFrame <= i4) {
                            rLottieDrawable.start();
                        } else {
                            rLottieDrawable.setCurrentFrame(i4, true, false);
                        }
                    } else if (rLottieDrawable.currentFrame >= i4 - 1) {
                        rLottieDrawable.setCustomEndFrame(i3 - 1);
                        rLottieDrawable.start();
                    } else {
                        rLottieDrawable.setCustomEndFrame(0);
                        rLottieDrawable.setCurrentFrame(0, true, false);
                    }
                } else if (z2) {
                    rLottieDrawable.setCurrentFrame(0, true, false);
                    if (z) {
                        rLottieDrawable.start();
                    }
                }
                tab.active = z2;
            }
        }
        invalidate();
    }
}
