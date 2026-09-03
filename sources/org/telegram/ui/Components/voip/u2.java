package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class u2 extends View {
    public StaticLayout f32403a;
    public final RectF f32404b;
    public final Paint f32405c;
    public final Paint d;
    public String f32406e;
    public final TextPaint f32407f;
    public int h;
    public boolean f32408n;
    public final Drawable f32409r;
    public final t3 f32410s;

    public u2(Activity activity) {
        super(activity);
        this.f32404b = new RectF();
        Paint paint = new Paint(1);
        this.f32405c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f32407f = textPaint;
        this.h = 4;
        this.f32408n = false;
        this.f32410s = new t3(this, 25);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.k(-1, 229));
        paint2.setColor(i0.a.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.f32409r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        t3 t3Var = this.f32410s;
        removeCallbacks(t3Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.f32406e;
        if (str == null || !str.equals(formatLongDuration)) {
            this.f32406e = formatLongDuration;
            if (this.f32403a == null) {
                requestLayout();
            }
            String str2 = this.f32406e;
            TextPaint textPaint = this.f32407f;
            this.f32403a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(t3Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        Paint paint;
        StaticLayout staticLayout = this.f32403a;
        int i10 = 0;
        if (staticLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - dp) / 2.0f, 0.0f);
        canvas.save();
        if (this.f32408n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.f32409r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                if (i11 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f32405c;
                }
                float f10 = i10;
                float dpf2 = AndroidUtilities.dpf2(2.75f);
                RectF rectF = this.f32404b;
                rectF.set(AndroidUtilities.dpf2(4.16f) * f10, AndroidUtilities.dpf2(2.75f) * (3 - i10), dpf2 + (AndroidUtilities.dpf2(4.16f) * f10), AndroidUtilities.dp(11.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.7f), AndroidUtilities.dpf2(0.7f), paint);
                i10 = i11;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(AndroidUtilities.dp(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        StaticLayout staticLayout = this.f32403a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(15.0f));
        }
    }

    public void setSignalBarCount(int i10) {
        this.h = i10;
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            if (i10 == 0) {
                this.f32406e = "00:00";
                String str = this.f32406e;
                TextPaint textPaint = this.f32407f;
                this.f32403a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f32406e = null;
                this.f32403a = null;
            }
        }
        super.setVisibility(i10);
    }
}
