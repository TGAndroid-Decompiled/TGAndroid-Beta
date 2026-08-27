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

    public StaticLayout f33863a;

    public final RectF f33864b;

    public final Paint f33865c;
    public final Paint d;

    public String f33866e;

    public final TextPaint f33867f;
    public int h;

    public boolean f33868n;

    public final Drawable f33869r;

    public final nh.f0 f33870s;

    public s2(Activity activity) {
        super(activity);
        this.f33864b = new RectF();
        Paint paint = new Paint(1);
        this.f33865c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f33867f = textPaint;
        this.h = 4;
        this.f33868n = false;
        this.f33870s = new nh.f0(this, 18);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.b.k(-1, 229));
        paint2.setColor(i0.b.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.f33869r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        nh.f0 f0Var = this.f33870s;
        removeCallbacks(f0Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String longDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.f33866e;
        if (str == null || !str.equals(longDuration)) {
            this.f33866e = longDuration;
            if (this.f33863a == null) {
                requestLayout();
            }
            String str2 = this.f33866e;
            TextPaint textPaint = this.f33867f;
            this.f33863a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(f0Var, 300L);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        StaticLayout staticLayout = this.f33863a;
        int i10 = 0;
        if (staticLayout == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        }
        canvas.save();
        canvas.translate((getMeasuredWidth() - iDp) / 2.0f, 0.0f);
        canvas.save();
        if (this.f33868n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.f33869r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                Paint paint = i11 > this.h ? this.d : this.f33865c;
                float f10 = i10;
                float fDpf2 = AndroidUtilities.dpf2(4.16f) * f10;
                float fDpf3 = AndroidUtilities.dpf2(2.75f) * (3 - i10);
                float fDpf4 = AndroidUtilities.dpf2(2.75f) + (AndroidUtilities.dpf2(4.16f) * f10);
                float fDp = AndroidUtilities.dp(11.0f);
                RectF rectF = this.f33864b;
                rectF.set(fDpf2, fDpf3, fDpf4, fDp);
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
        StaticLayout staticLayout = this.f33863a;
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
                this.f33866e = "00:00";
                String str = this.f33866e;
                TextPaint textPaint = this.f33867f;
                this.f33863a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.f33866e = null;
                this.f33863a = null;
            }
        }
        super.setVisibility(i10);
    }
}
