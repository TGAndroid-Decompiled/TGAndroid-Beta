package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.BitmapShaderTools;

public final class VoIPBackgroundProvider {
    public final Paint darkPaint;
    public final BitmapShaderTools darkShaderTools;
    public final Paint darkVideoPaint;
    public int degree;
    public boolean hasVideo;
    public boolean isReveal;
    public final BitmapShaderTools lightShaderTools;
    public BitmapShaderTools revealDarkShaderTools;
    public BitmapShaderTools revealShaderTools;
    public int totalHeight;
    public int totalWidth;
    public final ArrayList views;
    public final Paint whiteVideoPaint;

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

    public final Paint getDarkPaint() {
        return this.hasVideo ? this.darkVideoPaint : this.darkShaderTools.paint;
    }

    public final void invalidateViews() {
        ArrayList arrayList = this.views;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).invalidate();
        }
    }

    public final void setDarkTranslation(float f, float f2) {
        float f3 = this.totalHeight * 1.12f;
        BitmapShaderTools bitmapShaderTools = this.darkShaderTools;
        float f4 = -f;
        float f5 = -f2;
        bitmapShaderTools.setMatrix(f4 - ((f3 - this.totalWidth) / 2.0f), f5 - ((f3 - this.totalHeight) / 2.0f), f3 / bitmapShaderTools.getBitmap().getHeight(), this.degree);
        this.revealDarkShaderTools.setBounds(f4, f5, this.totalWidth - f, this.totalHeight - f2);
    }

    public final void setHasVideo(boolean z) {
        if (!this.hasVideo || z) {
            this.hasVideo = z;
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i = 0;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final VoIPBackgroundProvider f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            VoIPBackgroundProvider voIPBackgroundProvider = this.f$0;
                            voIPBackgroundProvider.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i2 = (int) (35.0f * fFloatValue);
                            voIPBackgroundProvider.darkPaint.setAlpha(i2);
                            voIPBackgroundProvider.darkVideoPaint.setAlpha((int) (fFloatValue * 102.0f));
                            voIPBackgroundProvider.whiteVideoPaint.setAlpha(i2);
                            voIPBackgroundProvider.invalidateViews();
                            break;
                        default:
                            VoIPBackgroundProvider voIPBackgroundProvider2 = this.f$0;
                            voIPBackgroundProvider2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voIPBackgroundProvider2.darkShaderTools.paint.setAlpha((int) (180.0f * fFloatValue2));
                            voIPBackgroundProvider2.lightShaderTools.paint.setAlpha((int) (fFloatValue2 * 255.0f));
                            voIPBackgroundProvider2.invalidateViews();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(80L);
            valueAnimatorOfFloat.addListener(new VoIPWindowView.AnonymousClass1(this, 4));
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i2 = 1;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final VoIPBackgroundProvider f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            VoIPBackgroundProvider voIPBackgroundProvider = this.f$0;
                            voIPBackgroundProvider.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i3 = (int) (35.0f * fFloatValue);
                            voIPBackgroundProvider.darkPaint.setAlpha(i3);
                            voIPBackgroundProvider.darkVideoPaint.setAlpha((int) (fFloatValue * 102.0f));
                            voIPBackgroundProvider.whiteVideoPaint.setAlpha(i3);
                            voIPBackgroundProvider.invalidateViews();
                            break;
                        default:
                            VoIPBackgroundProvider voIPBackgroundProvider2 = this.f$0;
                            voIPBackgroundProvider2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voIPBackgroundProvider2.darkShaderTools.paint.setAlpha((int) (180.0f * fFloatValue2));
                            voIPBackgroundProvider2.lightShaderTools.paint.setAlpha((int) (fFloatValue2 * 255.0f));
                            voIPBackgroundProvider2.invalidateViews();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setStartDelay(80L);
            valueAnimatorOfFloat2.setDuration(80L);
            valueAnimatorOfFloat2.start();
        }
        invalidateViews();
    }
}
