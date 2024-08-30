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

public class DraftSavedHint extends View {
    private final Paint backgroundPaint;
    private Runnable hideRunnable;
    private final StaticLayout layout;
    private final float layoutLeft;
    private final float layoutWidth;
    private final Path path;
    private final AnimatedFloat showT;
    private boolean shown;
    private final TextPaint textPaint;

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

    public void lambda$show$0() {
        hide(true);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f = this.showT.set(this.shown);
        if (f <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.shown ? CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f) : 1.0f) * AndroidUtilities.dp(12.0f));
        float interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.layoutWidth;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        this.path.rewind();
        this.path.moveTo(max, 0.0f);
        float f2 = dp + max;
        this.path.lineTo(f2, 0.0f);
        this.path.lineTo(f2, measuredHeight - AndroidUtilities.dp(18.0f));
        this.path.lineTo(AndroidUtilities.dp(7.0f) + min, measuredHeight - AndroidUtilities.dp(18.0f));
        this.path.lineTo(AndroidUtilities.dp(1.0f) + min, measuredHeight - AndroidUtilities.dp(12.0f));
        this.path.lineTo(min - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        this.path.lineTo(min - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        this.path.lineTo(max, measuredHeight - AndroidUtilities.dp(18.0f));
        this.path.close();
        this.backgroundPaint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(this.path, this.backgroundPaint);
        canvas.save();
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.layoutLeft, ((measuredHeight - AndroidUtilities.dp(18.0f)) - this.layout.getHeight()) / 2.0f);
        this.textPaint.setAlpha((int) (interpolation * 255.0f));
        this.layout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void hide(boolean z) {
        show(false, z);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f));
    }

    public void show() {
        this.showT.set(0.0f, true);
        show(true, true);
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                DraftSavedHint.this.lambda$show$0();
            }
        };
        this.hideRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 3500L);
    }

    public void show(boolean z, boolean z2) {
        Runnable runnable;
        if (!z && (runnable = this.hideRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        this.shown = z;
        if (!z2) {
            this.showT.set(z, true);
        }
        invalidate();
    }
}
