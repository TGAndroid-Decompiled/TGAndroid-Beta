package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.BitmapShaderTools;
public class VoIPBackgroundProvider {
    private final Paint darkPaint;
    private final BitmapShaderTools darkShaderTools;
    private final Paint darkVideoPaint;
    private int degree;
    private boolean hasVideo;
    private boolean isReveal;
    private final BitmapShaderTools lightShaderTools;
    private BitmapShaderTools revealDarkShaderTools;
    private BitmapShaderTools revealShaderTools;
    private int totalHeight;
    private int totalWidth;
    private final List<View> views;
    private final Paint whiteVideoPaint;

    public VoIPBackgroundProvider() {
        BitmapShaderTools bitmapShaderTools = new BitmapShaderTools(80, 80);
        this.lightShaderTools = bitmapShaderTools;
        BitmapShaderTools bitmapShaderTools2 = new BitmapShaderTools(80, 80);
        this.darkShaderTools = bitmapShaderTools2;
        this.totalWidth = 0;
        this.totalHeight = 0;
        Paint paint = new Paint(1);
        this.whiteVideoPaint = paint;
        Paint paint2 = new Paint(1);
        this.darkVideoPaint = paint2;
        Paint paint3 = new Paint(1);
        this.darkPaint = paint3;
        this.views = new ArrayList();
        bitmapShaderTools2.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
        bitmapShaderTools.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        bitmapShaderTools2.paint.setAlpha(180);
    }

    public void invalidateViews() {
        for (View view : this.views) {
            view.invalidate();
        }
    }

    public void attach(View view) {
        this.views.add(view);
    }

    public void detach(View view) {
        this.views.remove(view);
    }

    public void setHasVideo(boolean z) {
        if (this.hasVideo && !z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VoIPBackgroundProvider.this.lambda$setHasVideo$0(valueAnimator);
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPBackgroundProvider.this.hasVideo = false;
                    VoIPBackgroundProvider.this.darkPaint.setAlpha(35);
                    VoIPBackgroundProvider.this.darkVideoPaint.setAlpha(102);
                    VoIPBackgroundProvider.this.whiteVideoPaint.setAlpha(35);
                    VoIPBackgroundProvider.this.invalidateViews();
                }
            });
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VoIPBackgroundProvider.this.lambda$setHasVideo$1(valueAnimator);
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.hasVideo = z;
        }
        invalidateViews();
    }

    public void lambda$setHasVideo$0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = (int) (35.0f * floatValue);
        this.darkPaint.setAlpha(i);
        this.darkVideoPaint.setAlpha((int) (floatValue * 102.0f));
        this.whiteVideoPaint.setAlpha(i);
        invalidateViews();
    }

    public void lambda$setHasVideo$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.darkShaderTools.paint.setAlpha((int) (180.0f * floatValue));
        this.lightShaderTools.paint.setAlpha((int) (floatValue * 255.0f));
        invalidateViews();
    }

    public Canvas getLightCanvas() {
        return this.lightShaderTools.getCanvas();
    }

    public Canvas getRevealCanvas() {
        return this.revealShaderTools.getCanvas();
    }

    public Canvas getRevealDrakCanvas() {
        return this.revealDarkShaderTools.getCanvas();
    }

    public Canvas getDarkCanvas() {
        return this.darkShaderTools.getCanvas();
    }

    public void setTotalSize(int i, int i2) {
        this.totalWidth = i;
        this.totalHeight = i2;
        int i3 = i / 4;
        int i4 = i2 / 4;
        this.revealShaderTools = new BitmapShaderTools(i3, i4);
        BitmapShaderTools bitmapShaderTools = new BitmapShaderTools(i3, i4);
        this.revealDarkShaderTools = bitmapShaderTools;
        bitmapShaderTools.paint.setAlpha(180);
    }

    public int getDegree() {
        return this.degree;
    }

    public void setDegree(int i) {
        this.degree = i;
        invalidateViews();
    }

    public void setLightTranslation(float f, float f2) {
        float height = (this.totalHeight * 1.12f) / this.lightShaderTools.getBitmap().getHeight();
        int i = this.totalHeight;
        float f3 = -f;
        float f4 = -f2;
        this.lightShaderTools.setMatrix(f3 - (((i * 1.12f) - this.totalWidth) / 2.0f), f4 - (((i * 1.12f) - i) / 2.0f), height, this.degree);
        this.revealShaderTools.setBounds(f3, f4, this.totalWidth - f, this.totalHeight - f2);
    }

    public void setDarkTranslation(float f, float f2) {
        float f3 = this.totalHeight * 1.12f;
        float f4 = -f;
        float f5 = -f2;
        this.darkShaderTools.setMatrix(f4 - ((f3 - this.totalWidth) / 2.0f), f5 - ((f3 - this.totalHeight) / 2.0f), f3 / this.darkShaderTools.getBitmap().getHeight(), this.degree);
        this.revealDarkShaderTools.setBounds(f4, f5, this.totalWidth - f, this.totalHeight - f2);
    }

    public boolean isReveal() {
        return this.isReveal;
    }

    public void setReveal(boolean z) {
        this.isReveal = z;
    }

    public Paint getRevealPaint() {
        return this.revealShaderTools.paint;
    }

    public Paint getRevealDarkPaint() {
        return this.revealDarkShaderTools.paint;
    }

    public Paint getLightPaint() {
        if (this.hasVideo) {
            return this.whiteVideoPaint;
        }
        return this.lightShaderTools.paint;
    }

    public Paint getDarkPaint() {
        if (this.hasVideo) {
            return this.darkVideoPaint;
        }
        return this.darkShaderTools.paint;
    }

    public Paint getDarkPaint(boolean z) {
        if (z) {
            return this.darkPaint;
        }
        return getDarkPaint();
    }
}
