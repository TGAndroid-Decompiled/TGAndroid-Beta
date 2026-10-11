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
public class ae0 extends FrameLayout {
    public static final mw0 I;
    public static final mw0 J;
    public static final mw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d6 G;
    public float H;
    public final RectF f24576a;
    public String f24577b;
    public final Paint f24578c;
    public final TextPaint d;
    public final o1.k f24579e;
    public float f24580f;
    public final o1.k h;
    public float f24581n;
    public final o1.k f24582r;
    public float f24583s;
    public final float v;
    public final float f24584w;
    public EditText f24585x;
    public boolean f24586y;

    static {
        mw0 mw0Var = new mw0(new e2(26), new e2(27));
        mw0Var.f28962c = 100.0f;
        I = mw0Var;
        mw0 mw0Var2 = new mw0(new e2(28), new e2(29));
        mw0Var2.f28962c = 100.0f;
        J = mw0Var2;
        mw0 mw0Var3 = new mw0(new zd0(0), new zd0(1));
        mw0Var3.f28962c = 100.0f;
        K = mw0Var3;
    }

    public ae0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24576a = new RectF();
        this.f24577b = "";
        Paint paint = new Paint(1);
        this.f24578c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f24579e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f24582r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f24584w = AndroidUtilities.dp(1.6667f);
        this.G = d6Var;
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
        o1.l lVar = kVar.f17024u;
        if (lVar != null && f10 == ((float) lVar.f17031i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f17031i = f10;
        kVar.f17024u = lVar2;
        kVar.h();
    }

    private void setColor(int i10) {
        this.f24578c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f24582r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f24580f = f7;
            this.f24581n = f10;
            if (!this.f24586y) {
                float f11 = this.f24584w;
                float f12 = this.v;
                this.f24578c.setStrokeWidth(((f11 - f12) * f7) + f12);
            }
            f();
            return;
        }
        d(this.f24579e, f7);
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
        this.f24585x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.H6;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I6, d6Var);
        float f10 = 0.0f;
        if (this.f24586y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f24581n;
        }
        int d = i0.a.d(f7, w02, w03);
        int i11 = org.telegram.ui.ActionBar.h6.f21062q7;
        this.d.setColor(i0.a.d(this.f24583s, d, org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20950k6, d6Var);
        int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20968l6, d6Var);
        if (!this.f24586y || this.F) {
            f10 = this.f24580f;
        }
        setColor(i0.a.d(this.f24583s, i0.a.d(f10, w04, w05), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f24585x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.f24585x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f24585x.getHint())) && !this.f24586y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if (z11) {
            paddingTop = com.google.android.gms.internal.vision.e2.y(1.0f, this.f24581n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        if (z11) {
            f7 = (1.0f - this.f24581n) * this.H;
        } else {
            f7 = 0.0f;
        }
        float f13 = f7;
        Paint paint = this.f24578c;
        float strokeWidth = paint.getStrokeWidth();
        float f14 = 0.75f;
        if (z11) {
            f14 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f24581n, 0.25f, 0.75f);
        }
        float f15 = f14;
        float measureText = textPaint.measureText(this.f24577b) * f15;
        canvas.save();
        RectF rectF = this.f24576a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f);
        float f16 = (measureText / 2.0f) + dp;
        float dp2 = ((dp + measureText) + AndroidUtilities.dp(10.0f)) - f16;
        if (z11) {
            f10 = this.f24581n;
        } else {
            f10 = 1.0f;
        }
        canvas.drawLine((dp2 * f10) + f16, paddingTop2, width, paddingTop2, paint);
        float dp3 = f16 + AndroidUtilities.dp(4.0f);
        float f17 = dp - dp3;
        if (z11) {
            f11 = this.f24581n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f17 * f11) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f15, f15, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f12);
        canvas.drawText(this.f24577b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f13, f12, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f24586y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f24586y = z10;
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
        this.f24577b = str;
        invalidate();
    }
}
