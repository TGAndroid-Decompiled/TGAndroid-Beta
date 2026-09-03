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
public class bd0 extends FrameLayout {
    public static final iv0 F;
    public static final iv0 G;
    public static final iv0 H;
    public boolean B;
    public boolean C;
    public final org.telegram.ui.ActionBar.f6 D;
    public float E;
    public final RectF f23646a;
    public String f23647b;
    public final Paint f23648c;
    public final TextPaint d;
    public final o1.j e;
    public float f23649f;
    public final o1.j h;
    public float f23650n;
    public final o1.j f23651r;
    public float f23652s;
    public final float v;
    public final float f23653w;
    public EditText f23654x;
    public boolean f23655y;

    static {
        iv0 iv0Var = new iv0(new k2(18), new k2(19));
        iv0Var.f25780c = 100.0f;
        F = iv0Var;
        iv0 iv0Var2 = new iv0(new k2(20), new k2(21));
        iv0Var2.f25780c = 100.0f;
        G = iv0Var2;
        iv0 iv0Var3 = new iv0(new k2(22), new k2(23));
        iv0Var3.f25780c = 100.0f;
        H = iv0Var3;
    }

    public bd0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23646a = new RectF();
        this.f23647b = "";
        Paint paint = new Paint(1);
        this.f23648c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.j(this, F);
        this.h = new o1.j(this, G);
        this.f23651r = new o1.j(this, H);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f23653w = AndroidUtilities.dp(1.6667f);
        this.D = f6Var;
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
        o1.k kVar = jVar.f16178u;
        if (kVar != null && f11 == ((float) kVar.f16184i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f11);
        kVar2.b(500.0f);
        kVar2.a(1.0f);
        kVar2.f16184i = f11;
        jVar.f16178u = kVar2;
        jVar.f();
    }

    private void setColor(int i10) {
        this.f23648c.setColor(i10);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f23651r, f10);
    }

    public final void b(float f10, float f11, boolean z4) {
        if (!z4) {
            this.f23649f = f10;
            this.f23650n = f11;
            if (!this.f23655y) {
                float f12 = this.f23653w;
                float f13 = this.v;
                this.f23648c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.e, f10);
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
        this.f23654x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i10 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var);
        float f11 = 0.0f;
        if (this.f23655y && !this.C) {
            f10 = 0.0f;
        } else {
            f10 = this.f23650n;
        }
        int d = i0.a.d(f10, v02, v03);
        int i11 = org.telegram.ui.ActionBar.j6.f20116q7;
        this.d.setColor(i0.a.d(this.f23652s, d, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20006k6, f6Var);
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20024l6, f6Var);
        if (!this.f23655y || this.C) {
            f11 = this.f23649f;
        }
        setColor(i0.a.d(this.f23652s, i0.a.d(f11, v04, v05), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f23654x;
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
        EditText editText = this.f23654x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f23654x.getHint())) && !this.f23655y && !this.B) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            paddingTop = e2.c.w(1.0f, this.f23650n, textSize - paddingTop, paddingTop);
        }
        float f14 = paddingTop;
        if (z4) {
            f10 = (1.0f - this.f23650n) * this.E;
        } else {
            f10 = 0.0f;
        }
        Paint paint = this.f23648c;
        float strokeWidth = paint.getStrokeWidth();
        if (z4) {
            f11 = e2.c.w(1.0f, this.f23650n, 0.25f, 0.75f);
        } else {
            f11 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f23647b) * f11;
        canvas.save();
        RectF rectF = this.f23646a;
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
            f12 = this.f23650n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f15, paddingTop2, width, paddingTop2, paint);
        float dp3 = f15 + AndroidUtilities.dp(4.0f);
        float f16 = dp - dp3;
        if (z4) {
            f13 = this.f23650n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f16 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f11, f11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f14);
        canvas.drawText(this.f23647b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f10, f14, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z4) {
        this.f23655y = z4;
        this.C = z4;
        invalidate();
    }

    public void setForceUseCenter(boolean z4) {
        this.f23655y = z4;
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
        this.f23647b = str;
        invalidate();
    }
}
