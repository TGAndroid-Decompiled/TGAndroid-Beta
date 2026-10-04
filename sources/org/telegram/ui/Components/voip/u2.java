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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class u2 extends View {
    public StaticLayout f32216a;
    public final RectF f32217b;
    public final Paint f32218c;
    public final Paint d;
    public String f32219e;
    public final TextPaint f32220f;
    public int h;
    public boolean f32221n;
    public final Drawable f32222r;
    public final i2.h0 f32223s;

    public u2(Activity activity) {
        super(activity);
        this.f32217b = new RectF();
        Paint paint = new Paint(1);
        this.f32218c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f32220f = textPaint;
        this.h = 4;
        this.f32221n = false;
        this.f32223s = new i2.h0(this, 25);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.k(-1, 229));
        paint2.setColor(i0.a.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.f32222r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        i2.h0 h0Var = this.f32223s;
        removeCallbacks(h0Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.f32219e;
        if (str == null || !str.equals(formatLongDuration)) {
            this.f32219e = formatLongDuration;
            if (this.f32216a == null) {
                requestLayout();
            }
            String str2 = this.f32219e;
            TextPaint textPaint = this.f32220f;
            this.f32216a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(h0Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        Paint paint;
        StaticLayout staticLayout = this.f32216a;
        int i10 = 0;
        if (staticLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - dp) / 2.0f, 0.0f);
        canvas.save();
        if (this.f32221n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.f32222r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                if (i11 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f32218c;
                }
                float f7 = i10;
                float dpf2 = AndroidUtilities.dpf2(2.75f);
                RectF rectF = this.f32217b;
                rectF.set(AndroidUtilities.dpf2(4.16f) * f7, AndroidUtilities.dpf2(2.75f) * (3 - i10), dpf2 + (AndroidUtilities.dpf2(4.16f) * f7), AndroidUtilities.dp(11.0f));
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
        StaticLayout staticLayout = this.f32216a;
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
                this.f32219e = "00:00";
                String str = this.f32219e;
                TextPaint textPaint = this.f32220f;
                this.f32216a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f32219e = null;
                this.f32216a = null;
            }
        }
        super.setVisibility(i10);
    }
}
