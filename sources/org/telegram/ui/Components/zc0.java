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
public class zc0 extends FrameLayout {
    public static final hv0 I;
    public static final hv0 J;
    public static final hv0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public float H;
    public final RectF f33125a;
    public String f33126b;
    public final Paint f33127c;
    public final TextPaint d;
    public final o1.k f33128e;
    public float f33129f;
    public final o1.k h;
    public float f33130n;
    public final o1.k f33131r;
    public float f33132s;
    public final float v;
    public final float f33133w;
    public EditText f33134x;
    public boolean f33135y;

    static {
        hv0 hv0Var = new hv0(new p2(14), new p2(15));
        hv0Var.f26879c = 100.0f;
        I = hv0Var;
        hv0 hv0Var2 = new hv0(new p2(16), new p2(17));
        hv0Var2.f26879c = 100.0f;
        J = hv0Var2;
        hv0 hv0Var3 = new hv0(new p2(18), new p2(19));
        hv0Var3.f26879c = 100.0f;
        K = hv0Var3;
    }

    public zc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33125a = new RectF();
        this.f33126b = "";
        Paint paint = new Paint(1);
        this.f33127c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f33128e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f33131r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f33133w = AndroidUtilities.dp(1.6667f);
        this.G = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.k kVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.l lVar = kVar.f16825u;
        if (lVar != null && f10 == ((float) lVar.f16832i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f16832i = f10;
        kVar.f16825u = lVar2;
        kVar.f();
    }

    private void setColor(int i10) {
        this.f33127c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f33131r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f33129f = f7;
            this.f33130n = f10;
            if (!this.f33135y) {
                float f11 = this.f33133w;
                float f12 = this.v;
                this.f33127c.setStrokeWidth(((f11 - f12) * f7) + f12);
            }
            f();
            return;
        }
        d(this.f33128e, f7);
        d(this.h, f10);
    }

    public final void c(boolean z10, boolean z11) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            f10 = 1.0f;
        }
        b(f7, f10, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.f33134x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var);
        float f10 = 0.0f;
        if (this.f33135y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f33130n;
        }
        int d = i0.a.d(f7, v02, v03);
        int i11 = org.telegram.ui.ActionBar.j6.f20898q7;
        this.d.setColor(i0.a.d(this.f33132s, d, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20791k6, f6Var);
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var);
        if (!this.f33135y || this.F) {
            f10 = this.f33129f;
        }
        setColor(i0.a.d(this.f33132s, i0.a.d(f10, v04, v05), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f33134x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f33134x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f33134x.getHint())) && !this.f33135y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f33130n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        if (z10) {
            f7 = (1.0f - this.f33130n) * this.H;
        } else {
            f7 = 0.0f;
        }
        Paint paint = this.f33127c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f33130n, 0.25f, 0.75f);
        } else {
            f10 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f33126b) * f10;
        canvas.save();
        RectF rectF = this.f33125a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f14 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f14;
        if (z10) {
            f11 = this.f33130n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine((dp2 * f11) + f14, paddingTop2, width, paddingTop2, paint);
        float dp3 = f14 + AndroidUtilities.dp(4.0f);
        float f15 = dp - dp3;
        if (z10) {
            f12 = this.f33130n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f15 * f12) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f10, f10, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.f33126b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f7, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f33135y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f33135y = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.E = z10;
    }

    public void setLeftPadding(float f7) {
        this.H = f7;
        invalidate();
    }

    public void setText(String str) {
        this.f33126b = str;
        invalidate();
    }
}
