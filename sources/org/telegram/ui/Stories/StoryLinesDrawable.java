package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class StoryLinesDrawable {
    float bufferingProgress;
    boolean incrementBuffering;
    int lastPosition;
    private final PeerStoriesView.SharedResources sharedResources;
    private final View view;
    private final StaticLayout zoomHintLayout;
    private final float zoomHintLayoutLeft;
    private final float zoomHintLayoutWidth;
    private final TextPaint zoomHintPaint;
    private final AnimatedFloat zoomT;

    public StoryLinesDrawable(View view, PeerStoriesView.SharedResources sharedResources) {
        this.view = view;
        this.sharedResources = sharedResources;
        this.zoomT = new AnimatedFloat(view, 0L, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        TextPaint textPaint = new TextPaint(1);
        this.zoomHintPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.zoomHintLayout = staticLayout;
        this.zoomHintLayoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.zoomHintLayoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }

    public void draw(Canvas canvas, int i, int i2, float f, int i3, float f2, float f3, boolean z, boolean z2, float f4) {
        int iDp;
        float f5;
        Paint paint;
        float f6;
        Paint paint2;
        int i4;
        StoryLinesDrawable storyLinesDrawable = this;
        int i5 = i3;
        if (i5 <= 0) {
            return;
        }
        boolean z3 = z && !z2;
        if (storyLinesDrawable.lastPosition != i2) {
            storyLinesDrawable.bufferingProgress = 0.0f;
            storyLinesDrawable.incrementBuffering = true;
        }
        storyLinesDrawable.lastPosition = i2;
        PeerStoriesView.SharedResources sharedResources = storyLinesDrawable.sharedResources;
        Paint paint3 = sharedResources.barPaint;
        Paint paint4 = sharedResources.selectedBarPaint;
        if (i5 > 100) {
            iDp = 1;
        } else if (i5 >= 50) {
            iDp = AndroidUtilities.dp(1.0f);
        } else {
            iDp = AndroidUtilities.dp(2.0f);
        }
        float fDp = ((i - AndroidUtilities.dp(10.0f)) - ((i5 - 1) * iDp)) / i5;
        AndroidUtilities.dp(5.0f);
        float fMin = Math.min(fDp / 2.0f, AndroidUtilities.dp(1.0f));
        float f7 = storyLinesDrawable.zoomT.set(z2);
        float f8 = f;
        if (f7 > 0.0f) {
            float fLerp = AndroidUtilities.lerp(f8, f4, f7);
            canvas.save();
            storyLinesDrawable.zoomHintPaint.setAlpha((int) (f7 * 255.0f));
            storyLinesDrawable.zoomHintPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(805306368, f7));
            canvas.translate(((i - storyLinesDrawable.zoomHintLayoutWidth) / 2.0f) - storyLinesDrawable.zoomHintLayoutLeft, AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), f7));
            storyLinesDrawable.zoomHintLayout.draw(canvas);
            canvas.restore();
            f8 = fLerp;
        }
        int i6 = 0;
        while (i6 < i5) {
            float fDp2 = AndroidUtilities.dp(5.0f) + (-0.0f) + (iDp * i6) + (i6 * fDp);
            if (fDp2 <= i) {
                float f9 = fDp2 + fDp;
                if (f9 < 0.0f || f3 <= 0.0f) {
                    fMin = fMin;
                    iDp = iDp;
                    f5 = f8;
                    paint = paint4;
                } else {
                    float fLerp2 = AndroidUtilities.lerp(fMin, AndroidUtilities.dpf2(2.0f), f7);
                    if (i6 > i2 || i6 != i2) {
                        f5 = f8;
                        f6 = 1.0f;
                    } else {
                        RectF rectF = AndroidUtilities.rectTmp;
                        f5 = f8;
                        rectF.set(fDp2, 0.0f, f9, AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(5.0f), (i2 == i6 ? 1 : 0) * f7));
                        if (z3) {
                            if (storyLinesDrawable.incrementBuffering) {
                                float f10 = storyLinesDrawable.bufferingProgress + 0.026666667f;
                                storyLinesDrawable.bufferingProgress = f10;
                                if (f10 > 0.5f) {
                                    storyLinesDrawable.incrementBuffering = false;
                                }
                            } else {
                                float f11 = storyLinesDrawable.bufferingProgress - 0.026666667f;
                                storyLinesDrawable.bufferingProgress = f11;
                                if (f11 < -0.5f) {
                                    storyLinesDrawable.incrementBuffering = true;
                                }
                            }
                            i4 = (int) (51.0f * f3 * f2 * storyLinesDrawable.bufferingProgress);
                        } else {
                            i4 = 0;
                        }
                        paint3.setAlpha(((int) (85.0f * f3 * f2)) + i4);
                        if (f7 > 0.0f) {
                            int i7 = i6 - i2;
                            rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, (i7 * i) + AndroidUtilities.dp(5.0f), f7), i - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i7 + 1) * i) - AndroidUtilities.dp(5.0f), f7), i - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        canvas.drawRoundRect(rectF, fLerp2, fLerp2, paint3);
                        f6 = f5;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp2, 0.0f, f9, AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(5.0f), (i2 == i6 ? 1 : 0) * f7));
                    if (f7 > 0.0f) {
                        int i8 = i6 - i2;
                        rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, (i8 * i) + AndroidUtilities.dp(5.0f), f7), i - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i8 + 1) * i) - AndroidUtilities.dp(5.0f), f7), i - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                    }
                    rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f6);
                    if (i6 <= i2) {
                        paint = paint4;
                        paint.setAlpha((int) (f3 * 255.0f * f2));
                        paint2 = paint;
                    } else {
                        paint = paint4;
                        paint3.setAlpha((int) (85 * f3 * f2));
                        paint2 = paint3;
                    }
                    canvas.drawRoundRect(rectF2, fLerp2, fLerp2, paint2);
                }
            } else {
                fMin = fMin;
                iDp = iDp;
                f5 = f8;
                paint = paint4;
            }
            i6++;
            storyLinesDrawable = this;
            f8 = f5;
            i5 = i3;
            paint4 = paint;
            fMin = fMin;
            iDp = iDp;
        }
    }
}
