package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.ui.Stories.recorder.HintView2;

public final class VoIpHintView extends HintView2 {
    public final VoIPBackgroundProvider backgroundProvider;
    public final Paint mainPaint;

    public VoIpHintView(Activity activity, int i, VoIPBackgroundProvider voIPBackgroundProvider, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.mainPaint = paint;
        this.backgroundProvider = voIPBackgroundProvider;
        voIPBackgroundProvider.views.add(this);
        paint.setPathEffect(new CornerPathEffect(this.rounding));
        if (z) {
            setCloseButton();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.backgroundProvider.setDarkTranslation(getX(), getY());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawBgPath(Canvas canvas, float f) {
        Paint paint = this.mainPaint;
        VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
        paint.setShader(voIPBackgroundProvider.getDarkPaint().getShader());
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.backgroundPaint.getAlpha(), voIPBackgroundProvider.getDarkPaint().getAlpha()) * f), 31);
        Path path = this.path;
        canvas.drawPath(path, paint);
        if (voIPBackgroundProvider.isReveal) {
            paint.setShader(((Paint) voIPBackgroundProvider.revealDarkShaderTools.app).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }
}
