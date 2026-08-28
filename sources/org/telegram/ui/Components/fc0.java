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
public class fc0 extends FrameLayout {
    public static final pu0 E;
    public static final pu0 F;
    public static final pu0 G;
    public boolean A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b6 C;
    public float D;
    public final RectF f28375a;
    public String f28376b;
    public final Paint f28377c;
    public final TextPaint d;
    public final o1.j f28378e;
    public float f28379f;
    public final o1.j h;
    public float f28380n;
    public final o1.j f28381r;
    public float f28382s;
    public final float v;
    public final float f28383w;
    public EditText f28384x;
    public boolean f28385y;

    static {
        pu0 pu0Var = new pu0(new g2(19), new g2(20));
        pu0Var.f31764c = 100.0f;
        E = pu0Var;
        pu0 pu0Var2 = new pu0(new g2(21), new g2(22));
        pu0Var2.f31764c = 100.0f;
        F = pu0Var2;
        pu0 pu0Var3 = new pu0(new g2(23), new g2(24));
        pu0Var3.f31764c = 100.0f;
        G = pu0Var3;
    }

    public fc0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f28375a = new RectF();
        this.f28376b = "";
        Paint paint = new Paint(1);
        this.f28377c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f28378e = new o1.j(this, E);
        this.h = new o1.j(this, F);
        this.f28381r = new o1.j(this, G);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f28383w = AndroidUtilities.dp(1.6667f);
        this.C = b6Var;
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
        o1.k kVar = jVar.f18800u;
        if (kVar != null && f11 == ((float) kVar.f18807i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f11);
        kVar2.b(500.0f);
        kVar2.a(1.0f);
        kVar2.f18807i = f11;
        jVar.f18800u = kVar2;
        jVar.f();
    }

    private void setColor(int i9) {
        this.f28377c.setColor(i9);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f28381r, f10);
    }

    public final void b(float f10, float f11, boolean z10) {
        if (!z10) {
            this.f28379f = f10;
            this.f28380n = f11;
            if (!this.f28385y) {
                float f12 = this.f28383w;
                float f13 = this.v;
                this.f28377c.setStrokeWidth(((f12 - f13) * f10) + f13);
            }
            f();
            return;
        }
        d(this.f28378e, f10);
        d(this.h, f11);
    }

    public final void c(boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            f11 = 1.0f;
        }
        b(f10, f11, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f28384x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f10;
        int i9 = org.telegram.ui.ActionBar.f6.H6;
        org.telegram.ui.ActionBar.b6 b6Var = this.C;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var);
        float f11 = 0.0f;
        if (this.f28385y && !this.B) {
            f10 = 0.0f;
        } else {
            f10 = this.f28380n;
        }
        int d = i0.a.d(f10, v02, v03);
        int i10 = org.telegram.ui.ActionBar.f6.f23230q7;
        this.d.setColor(i0.a.d(this.f28382s, d, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, b6Var);
        int v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, b6Var);
        if (!this.f28385y || this.B) {
            f11 = this.f28379f;
        }
        setColor(i0.a.d(this.f28382s, i0.a.d(f11, v04, v05), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f28384x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f28384x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f28384x.getHint())) && !this.f28385y && !this.A) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = e2.c.z(1.0f, this.f28380n, textSize - paddingTop, paddingTop);
        }
        float f14 = paddingTop;
        if (z10) {
            f10 = (1.0f - this.f28380n) * this.D;
        } else {
            f10 = 0.0f;
        }
        Paint paint = this.f28377c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f11 = e2.c.z(1.0f, this.f28380n, 0.25f, 0.75f);
        } else {
            f11 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f28376b) * f11;
        canvas.save();
        RectF rectF = this.f28375a;
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
        if (z10) {
            f12 = this.f28380n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine((dp2 * f12) + f15, paddingTop2, width, paddingTop2, paint);
        float dp3 = f15 + AndroidUtilities.dp(4.0f);
        float f16 = dp - dp3;
        if (z10) {
            f13 = this.f28380n;
        } else {
            f13 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f16 * f13) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f11, f11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f14);
        canvas.drawText(this.f28376b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f10, f14, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f28385y = z10;
        this.B = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f28385y = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.A = z10;
    }

    public void setLeftPadding(float f10) {
        this.D = f10;
        invalidate();
    }

    public void setText(String str) {
        this.f28376b = str;
        invalidate();
    }
}
