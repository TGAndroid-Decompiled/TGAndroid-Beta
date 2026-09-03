package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public class cd0 extends FrameLayout {
    public static final iv0 F;
    public static final iv0 G;
    public static final iv0 H;
    public boolean B;
    public boolean C;
    public final org.telegram.ui.ActionBar.g6 D;
    public float E;
    public final RectF f25901a;
    public String f25902b;
    public final Paint f25903c;
    public final TextPaint d;
    public final o1.j f25904e;
    public float f25905f;
    public final o1.j h;
    public float f25906n;
    public final o1.j f25907r;
    public float f25908s;
    public final float v;
    public final float f25909w;
    public EditText f25910x;
    public boolean f25911y;

    static {
        iv0 iv0Var = new iv0(new k2(18), new k2(19));
        iv0Var.f27906c = 100.0f;
        F = iv0Var;
        iv0 iv0Var2 = new iv0(new k2(20), new k2(21));
        iv0Var2.f27906c = 100.0f;
        G = iv0Var2;
        iv0 iv0Var3 = new iv0(new k2(22), new k2(23));
        iv0Var3.f27906c = 100.0f;
        H = iv0Var3;
    }

    public cd0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25901a = new RectF();
        this.f25902b = "";
        Paint paint = new Paint(1);
        this.f25903c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f25904e = new o1.j(this, F);
        this.h = new o1.j(this, G);
        this.f25907r = new o1.j(this, H);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f25909w = AndroidUtilities.dp(1.6667f);
        this.D = g6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f10) {
        float f11 = f10 * 100.0f;
        o1.k kVar = jVar.f16338u;
        if (kVar != null && f11 == ((float) kVar.f16345i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f11);
        kVar2.b(500.0f);
        kVar2.a(1.0f);
        kVar2.f16345i = f11;
        jVar.f16338u = kVar2;
        jVar.f();
    }

    private void setColor(int i10) {
        this.f25903c.setColor(i10);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f25907r, f10);
    }

    public final void b(float f10, float f11, boolean z4) {
        if (!z4) {
            this.f25905f = f10;
            this.f25906n = f11;
            if (!this.f25911y) {
                float f12 = this.f25909w;
                float f13 = this.v;
                this.f25903c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f25904e, f10);
        d(this.h, f11);
    }

    public final void c(boolean z4, boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        b(f10, f11, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f25910x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.D;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I6, g6Var);
        float f11 = 0.0f;
        if (this.f25911y && !this.C) {
            f10 = 0.0f;
        } else {
            f10 = this.f25906n;
        }
        int d = i0.a.d(f10, v02, v03);
        int i11 = org.telegram.ui.ActionBar.k6.f21897q7;
        this.d.setColor(i0.a.d(this.f25908s, d, org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21787k6, g6Var);
        int v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21805l6, g6Var);
        if (!this.f25911y || this.C) {
            f11 = this.f25905f;
        }
        setColor(i0.a.d(this.f25908s, i0.a.d(f11, v04, v05), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f25910x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f25910x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f25910x.getHint())) && !this.f25911y && !this.B) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            paddingTop = e2.c.w(1.0f, this.f25906n, textSize - paddingTop, paddingTop);
        }
        float f14 = paddingTop;
        if (z4) {
            f10 = (1.0f - this.f25906n) * this.E;
        } else {
            f10 = 0.0f;
        }
        Paint paint = this.f25903c;
        float strokeWidth = paint.getStrokeWidth();
        if (z4) {
            f11 = e2.c.w(1.0f, this.f25906n, 0.25f, 0.75f);
        } else {
            f11 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f25902b) * f11;
        canvas.save();
        RectF rectF = this.f25901a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f15 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f15;
        if (z4) {
            f12 = this.f25906n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f15, paddingTop2, width, paddingTop2, paint);
        float dp3 = f15 + AndroidUtilities.dp(4.0f);
        float f16 = dp - dp3;
        if (z4) {
            f13 = this.f25906n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f16 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f11, f11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f14);
        canvas.drawText(this.f25902b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f10, f14, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z4) {
        this.f25911y = z4;
        this.C = z4;
        invalidate();
    }

    public void setForceUseCenter(boolean z4) {
        this.f25911y = z4;
        invalidate();
    }

    public void setForceUseCenter2(boolean z4) {
        this.B = z4;
    }

    public void setLeftPadding(float f10) {
        this.E = f10;
        invalidate();
    }

    public void setText(String str) {
        this.f25902b = str;
        invalidate();
    }
}
