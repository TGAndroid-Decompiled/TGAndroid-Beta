package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import org.telegram.ui.Stories.recorder.HintView2;

public final class VoIpHintView extends HintView2 {
    public final VoIPBackgroundProvider backgroundProvider;
    public final Paint mainPaint;

    public VoIpHintView(Context context, int i, VoIPBackgroundProvider voIPBackgroundProvider, boolean z) {
        super(context, i);
        Paint paint = new Paint(1);
        this.mainPaint = paint;
        this.backgroundProvider = voIPBackgroundProvider;
        voIPBackgroundProvider.views.add(this);
        paint.setPathEffect(new CornerPathEffect(this.rounding));
        if (z) {
            setCloseButton(true);
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
        canvas.drawPath(this.path, paint);
        if (voIPBackgroundProvider.isReveal) {
            paint.setShader(voIPBackgroundProvider.revealDarkShaderTools.paint.getShader());
            canvas.drawPath(this.path, paint);
        }
        canvas.restore();
    }
}
