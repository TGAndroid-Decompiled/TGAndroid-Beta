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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public abstract class BottomPagerTabs extends View {
    private Utilities.Callback onTabClick;
    private float progress;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean scrolling;
    private AnimatedFloat scrollingT;
    private final Paint selectPaint;
    private final Tab[] tabs;
    private boolean touchDown;
    private int value;

    public abstract Tab[] createTabs();

    protected class Tab {
        private boolean active;
        final RectF clickRect;
        public int customEndFrameEnd;
        public int customEndFrameMid;
        public boolean customFrameInvert;
        final RLottieDrawable drawable;
        private int drawableColor;
        final int i;
        final StaticLayout layout;
        final float layoutLeft;
        final float layoutWidth;
        final AnimatedFloat nonscrollingT;
        final TextPaint paint;
        final Drawable ripple;

        public Tab(int i, int i2, int i3, int i4, CharSequence charSequence) {
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            this.clickRect = new RectF();
            this.nonscrollingT = new AnimatedFloat(BottomPagerTabs.this, 0L, 200L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.drawableColor = -1;
            this.i = i;
            this.customEndFrameMid = i3;
            this.customEndFrameEnd = i4;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
            this.drawable = rLottieDrawable;
            rLottieDrawable.setMasterParent(BottomPagerTabs.this);
            rLottieDrawable.setAllowDecodeSingleFrame(true);
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            rLottieDrawable.setAutoRepeat(0);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            textPaint.setColor(Theme.getColor(i5, BottomPagerTabs.this.resourcesProvider));
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layout = staticLayout;
            this.layoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
            this.layoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
            this.ripple = Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i5, BottomPagerTabs.this.resourcesProvider), 0.1f), 7, AndroidUtilities.dp(16.0f));
        }

        public void setActive(boolean z, boolean z2) {
            if (this.customFrameInvert) {
                z = !z;
            }
            if (this.active == z) {
                return;
            }
            if (BottomPagerTabs.this.tabs[this.i].customEndFrameMid != 0) {
                if (z) {
                    this.drawable.setCustomEndFrame(this.customEndFrameMid);
                    if (this.drawable.getCurrentFrame() >= this.customEndFrameEnd - 2) {
                        this.drawable.setCurrentFrame(0, false);
                    }
                    int currentFrame = this.drawable.getCurrentFrame();
                    int i = this.customEndFrameMid;
                    if (currentFrame <= i) {
                        this.drawable.start();
                    } else {
                        this.drawable.setCurrentFrame(i);
                    }
                } else if (this.drawable.getCurrentFrame() >= this.customEndFrameMid - 1) {
                    this.drawable.setCustomEndFrame(this.customEndFrameEnd - 1);
                    this.drawable.start();
                } else {
                    this.drawable.setCustomEndFrame(0);
                    this.drawable.setCurrentFrame(0);
                }
            } else if (z) {
                this.drawable.setCurrentFrame(0);
                if (z2) {
                    this.drawable.start();
                }
            }
            this.active = z;
        }

        public void setColor(int i) {
            this.paint.setColor(i);
            if (this.drawableColor != i) {
                RLottieDrawable rLottieDrawable = this.drawable;
                this.drawableColor = i;
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public BottomPagerTabs(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectPaint = new Paint(1);
        this.scrollingT = new AnimatedFloat(this, 0L, 210L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.resourcesProvider = resourcesProvider;
        this.tabs = createTabs();
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        setProgress(0.0f, false);
    }

    public void setScrolling(boolean z) {
        if (this.scrolling == z) {
            return;
        }
        this.scrolling = z;
        invalidate();
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    private void setProgress(float f, boolean z) {
        float fClamp = Utilities.clamp(f, this.tabs.length, 0.0f);
        this.progress = fClamp;
        this.value = Math.round(fClamp);
        int i = 0;
        while (true) {
            Tab[] tabArr = this.tabs;
            if (i < tabArr.length) {
                tabArr[i].setActive(((float) Math.abs(this.value - i)) < (this.tabs[i].active ? 0.25f : 0.35f), z);
                i++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.onTabClick = callback;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), Theme.dividerPaint);
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / this.tabs.length;
        int iMin = Math.min(AndroidUtilities.dp(64.0f), width);
        float f = this.scrollingT.set(this.scrolling);
        float f2 = 9.0f;
        float f3 = 2.0f;
        float f4 = 0.0f;
        if (f > 0.0f) {
            this.selectPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), (int) (((Math.abs((Math.floor(this.progress) + 0.5d) - ((double) this.progress)) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * ((double) f))));
            float paddingLeft = getPaddingLeft();
            float f5 = width;
            float f6 = f5 / 2.0f;
            float fFloor = (((float) Math.floor(this.progress)) * f5) + f6;
            float fCeil = (f5 * ((float) Math.ceil(this.progress))) + f6;
            float f7 = this.progress;
            float fLerp = paddingLeft + AndroidUtilities.lerp(fFloor, fCeil, f7 - ((int) f7));
            RectF rectF = AndroidUtilities.rectTmp;
            float f8 = iMin / 2.0f;
            rectF.set(fLerp - f8, AndroidUtilities.dp(9.0f), fLerp + f8, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.selectPaint);
        }
        int i = 0;
        while (true) {
            Tab[] tabArr = this.tabs;
            if (i >= tabArr.length) {
                return;
            }
            Tab tab = tabArr[i];
            int paddingLeft2 = getPaddingLeft() + (i * width);
            tab.clickRect.set(paddingLeft2, f4, paddingLeft2 + width, getHeight());
            float fMin = 1.0f - Math.min(1.0f, Math.abs(this.progress - i));
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6, this.resourcesProvider);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            tab.setColor(ColorUtils.blendARGB(color, Theme.getColor(i2, this.resourcesProvider), fMin));
            Rect rect = AndroidUtilities.rectTmp2;
            float f9 = iMin / f3;
            rect.set((int) (tab.clickRect.centerX() - f9), AndroidUtilities.dp(f2), (int) (tab.clickRect.centerX() + f9), AndroidUtilities.dp(41.0f));
            float f10 = tab.nonscrollingT.set(fMin > 0.6f);
            if (f < 1.0f) {
                this.selectPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i2, this.resourcesProvider), (int) (f10 * 18.0f * (1.0f - f))));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rect);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.selectPaint);
            }
            tab.ripple.setBounds(rect);
            tab.ripple.draw(canvas);
            float fDp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (tab.clickRect.centerX() - fDp), (int) (AndroidUtilities.dpf2(24.66f) - fDp), (int) (tab.clickRect.centerX() + fDp), (int) (AndroidUtilities.dpf2(24.66f) + fDp));
            tab.drawable.setBounds(rect);
            tab.drawable.draw(canvas);
            canvas.save();
            canvas.translate((tab.clickRect.centerX() - (tab.layoutWidth / 2.0f)) - tab.layoutLeft, AndroidUtilities.dp(50.0f) - (tab.layout.getHeight() / 2.0f));
            tab.layout.draw(canvas);
            canvas.restore();
            i++;
            f2 = 9.0f;
            f3 = 2.0f;
            f4 = 0.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            this.touchDown = true;
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 2) {
            float x = motionEvent.getX();
            int i = 0;
            while (true) {
                Tab[] tabArr = this.tabs;
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
                        this.tabs[i].ripple.setState(new int[0]);
                    }
                    this.tabs[i].ripple.setState(new int[]{16842919, 16842910});
                    break;
                }
                i++;
            }
            for (int i2 = 0; i2 < this.tabs.length; i2++) {
                if (i2 != i || motionEvent.getAction() == 1) {
                    this.tabs[i2].ripple.setState(new int[0]);
                }
            }
            if (i >= 0 && this.value != i && (callback = this.onTabClick) != null) {
                callback.run(Integer.valueOf(i));
            }
            this.touchDown = false;
        } else if (motionEvent.getAction() == 3) {
            int i3 = 0;
            while (true) {
                Tab[] tabArr2 = this.tabs;
                if (i3 < tabArr2.length) {
                    tabArr2[i3].ripple.setState(new int[0]);
                    i3++;
                } else {
                    this.touchDown = false;
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(64.0f) + AndroidUtilities.getShadowHeight());
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        int i = 0;
        while (true) {
            Tab[] tabArr = this.tabs;
            if (i < tabArr.length) {
                if (tabArr[i].ripple == drawable) {
                    return true;
                }
                i++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
