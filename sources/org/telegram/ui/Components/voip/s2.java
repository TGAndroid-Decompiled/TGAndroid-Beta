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
public final class s2 extends View {
    public StaticLayout f28402a;
    public final RectF f28403b;
    public final Paint f28404c;
    public final Paint d;
    public String e;
    public final TextPaint f28405f;
    public int h;
    public boolean f28406n;
    public final Drawable f28407r;
    public final x f28408s;

    public s2(Activity activity) {
        super(activity);
        this.f28403b = new RectF();
        Paint paint = new Paint(1);
        this.f28404c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f28405f = textPaint;
        this.h = 4;
        this.f28406n = false;
        this.f28408s = new x(this, 7);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.k(-1, 229));
        paint2.setColor(i0.a.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.f28407r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        x xVar = this.f28408s;
        removeCallbacks(xVar);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.e;
        if (str == null || !str.equals(formatLongDuration)) {
            this.e = formatLongDuration;
            if (this.f28402a == null) {
                requestLayout();
            }
            String str2 = this.e;
            TextPaint textPaint = this.f28405f;
            this.f28402a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(xVar, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        Paint paint;
        StaticLayout staticLayout = this.f28402a;
        int i10 = 0;
        if (staticLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - dp) / 2.0f, 0.0f);
        canvas.save();
        if (this.f28406n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.f28407r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                if (i11 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f28404c;
                }
                float f7 = i10;
                float dpf2 = AndroidUtilities.dpf2(2.75f);
                RectF rectF = this.f28403b;
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
        StaticLayout staticLayout = this.f28402a;
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
                this.e = "00:00";
                String str = this.e;
                TextPaint textPaint = this.f28405f;
                this.f28402a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.e = null;
                this.f28402a = null;
            }
        }
        super.setVisibility(i10);
    }
}
