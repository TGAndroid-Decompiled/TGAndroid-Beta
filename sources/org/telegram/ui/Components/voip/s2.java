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
    public StaticLayout f33813a;
    public final RectF f33814b;
    public final Paint f33815c;
    public final Paint d;
    public String f33816e;
    public final TextPaint f33817f;
    public int h;
    public boolean f33818n;
    public final Drawable f33819r;
    public final mh.m2 f33820s;

    public s2(Activity activity) {
        super(activity);
        this.f33814b = new RectF();
        Paint paint = new Paint(1);
        this.f33815c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f33817f = textPaint;
        this.h = 4;
        this.f33818n = false;
        this.f33820s = new mh.m2(this, 12);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.k(-1, 229));
        paint2.setColor(i0.a.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.f33819r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        mh.m2 m2Var = this.f33820s;
        removeCallbacks(m2Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.f33816e;
        if (str == null || !str.equals(formatLongDuration)) {
            this.f33816e = formatLongDuration;
            if (this.f33813a == null) {
                requestLayout();
            }
            String str2 = this.f33816e;
            TextPaint textPaint = this.f33817f;
            this.f33813a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(m2Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        Paint paint;
        StaticLayout staticLayout = this.f33813a;
        int i9 = 0;
        if (staticLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - dp) / 2.0f, 0.0f);
        canvas.save();
        if (this.f33818n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.f33819r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i9 < 4) {
                int i10 = i9 + 1;
                if (i10 > this.h) {
                    paint = this.d;
                } else {
                    paint = this.f33815c;
                }
                float f10 = i9;
                float dpf2 = AndroidUtilities.dpf2(2.75f);
                RectF rectF = this.f33814b;
                rectF.set(AndroidUtilities.dpf2(4.16f) * f10, AndroidUtilities.dpf2(2.75f) * (3 - i9), dpf2 + (AndroidUtilities.dpf2(4.16f) * f10), AndroidUtilities.dp(11.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.7f), AndroidUtilities.dpf2(0.7f), paint);
                i9 = i10;
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
    public final void onMeasure(int i9, int i10) {
        StaticLayout staticLayout = this.f33813a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(15.0f));
        }
    }

    public void setSignalBarCount(int i9) {
        this.h = i9;
        invalidate();
    }

    @Override
    public void setVisibility(int i9) {
        if (getVisibility() != i9) {
            if (i9 == 0) {
                this.f33816e = "00:00";
                String str = this.f33816e;
                TextPaint textPaint = this.f33817f;
                this.f33813a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f33816e = null;
                this.f33813a = null;
            }
        }
        super.setVisibility(i9);
    }
}
