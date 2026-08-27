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

public class jc0 extends FrameLayout {
    public static final su0 E;
    public static final su0 F;
    public static final su0 G;
    public boolean A;
    public boolean B;
    public final org.telegram.ui.ActionBar.c6 C;
    public float D;

    public final RectF f29664a;

    public String f29665b;

    public final Paint f29666c;
    public final TextPaint d;

    public final o1.j f29667e;

    public float f29668f;
    public final o1.j h;

    public float f29669n;

    public final o1.j f29670r;

    public float f29671s;
    public final float v;

    public final float f29672w;

    public EditText f29673x;

    public boolean f29674y;

    static {
        su0 su0Var = new su0(new c2(24), new c2(25));
        su0Var.f32580c = 100.0f;
        E = su0Var;
        su0 su0Var2 = new su0(new c2(26), new c2(27));
        su0Var2.f32580c = 100.0f;
        F = su0Var2;
        su0 su0Var3 = new su0(new c2(28), new c2(29));
        su0Var3.f32580c = 100.0f;
        G = su0Var3;
    }

    public jc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29664a = new RectF();
        this.f29665b = "";
        Paint paint = new Paint(1);
        this.f29666c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f29667e = new o1.j(this, E);
        this.h = new o1.j(this, F);
        this.f29670r = new o1.j(this, G);
        float fMax = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = fMax;
        this.f29672w = AndroidUtilities.dp(1.6667f);
        this.C = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fMax);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f10) {
        float f11 = f10 * 100.0f;
        o1.k kVar = jVar.f19147u;
        if (kVar == null || f11 != ((float) kVar.f19154i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f11);
            kVar2.b(500.0f);
            kVar2.a(1.0f);
            kVar2.f19154i = f11;
            jVar.f19147u = kVar2;
            jVar.f();
        }
    }

    private void setColor(int i10) {
        this.f29666c.setColor(i10);
        invalidate();
    }

    public final void a(float f10) {
        d(this.f29670r, f10);
    }

    public final void b(float f10, float f11, boolean z10) {
        if (z10) {
            d(this.f29667e, f10);
            d(this.h, f11);
            return;
        }
        this.f29668f = f10;
        this.f29669n = f11;
        if (!this.f29674y) {
            float f12 = this.f29672w;
            float f13 = this.v;
            this.f29666c.setStrokeWidth(((f12 - f13) * f10) + f13);
        }
        f();
    }

    public final void c(boolean z10, boolean z11) {
        b(z10 ? 1.0f : 0.0f, z11 ? 1.0f : 0.0f, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f29673x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.g6.H6;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        int iD = i0.b.d((!this.f29674y || this.B) ? this.f29669n : 0.0f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.f23284q7;
        this.d.setColor(i0.b.d(this.f29671s, iD, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        setColor(i0.b.d(this.f29671s, i0.b.d((!this.f29674y || this.B) ? this.f29668f : 0.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, c6Var)), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f29673x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f29673x;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.f29673x.getHint())) || this.f29674y || this.A;
        if (z10) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.f29669n, textSize - paddingTop, paddingTop);
        }
        float f11 = paddingTop;
        if (z10) {
            f10 = (1.0f - this.f29669n) * this.D;
        } else {
            f10 = 0.0f;
        }
        Paint paint = this.f29666c;
        float strokeWidth = paint.getStrokeWidth();
        float fZ = z10 ? com.google.android.recaptcha.internal.a.z(1.0f, this.f29669n, 0.25f, 0.75f) : 0.75f;
        float fMeasureText = textPaint.measureText(this.f29665b) * fZ;
        canvas.save();
        float fDp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop();
        float width = (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight();
        float paddingTop3 = (strokeWidth * 2.0f) + getPaddingTop();
        RectF rectF = this.f29664a;
        rectF.set(fDp, paddingTop2, width, paddingTop3);
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float fDp2 = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop4 = getPaddingTop() + strokeWidth;
        float f12 = (fMeasureText / 2.0f) + fDp2;
        canvas.drawLine(((((fDp2 + fMeasureText) + AndroidUtilities.dp(10.0f)) - f12) * (z10 ? this.f29669n : 1.0f)) + f12, paddingTop4, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop4, paint);
        float fDp3 = f12 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(fDp2, paddingTop4, ((fDp2 - fDp3) * (z10 ? this.f29669n : 1.0f)) + fDp3, paddingTop4, paint);
        canvas.save();
        canvas.scale(fZ, fZ, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f11);
        canvas.drawText(this.f29665b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f10, f11, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f29674y = z10;
        this.B = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f29674y = z10;
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
        this.f29665b = str;
        invalidate();
    }
}
