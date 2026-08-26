package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public final class DraftSavedHint extends View {
    public final Paint backgroundPaint;
    public VoIPFragment$12$$ExternalSyntheticLambda0 hideRunnable;
    public final StaticLayout layout;
    public final float layoutLeft;
    public final float layoutWidth;
    public final Path path;
    public final AnimatedFloat showT;
    public boolean shown;
    public final TextPaint textPaint;

    public DraftSavedHint(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.path = new Path();
        AnimatedFloat animatedFloat = new AnimatedFloat(this);
        this.showT = animatedFloat;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.layout = staticLayout;
        this.layoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.layoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        animatedFloat.set(0.0f, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f = this.showT.set(this.shown);
        if (f <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.shown ? CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f) : 1.0f) * AndroidUtilities.dp(12.0f));
        float interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fDp = AndroidUtilities.dp(22.0f) + this.layoutWidth;
        float fMin = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float fMax = Math.max(AndroidUtilities.dp(8.0f), fMin - (fDp / 2.0f));
        Path path = this.path;
        path.rewind();
        path.moveTo(fMax, 0.0f);
        float f2 = fDp + fMax;
        path.lineTo(f2, 0.0f);
        path.lineTo(f2, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + fMin, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + fMin, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(fMin - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(fMin - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(fMax, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.backgroundPaint;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        float fDp2 = (fMax + AndroidUtilities.dp(11.0f)) - this.layoutLeft;
        float fDp3 = measuredHeight - AndroidUtilities.dp(18.0f);
        StaticLayout staticLayout = this.layout;
        canvas.translate(fDp2, (fDp3 - staticLayout.getHeight()) / 2.0f);
        this.textPaint.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f));
    }

    public final void show(boolean z) {
        VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0;
        if (!z && (voIPFragment$12$$ExternalSyntheticLambda0 = this.hideRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
            this.hideRunnable = null;
        }
        this.shown = z;
        invalidate();
    }
}
