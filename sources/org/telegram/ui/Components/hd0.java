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
public class hd0 extends FrameLayout {
    public static final sv0 I;
    public static final sv0 J;
    public static final sv0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public float H;
    public final RectF f23597a;
    public String f23598b;
    public final Paint f23599c;
    public final TextPaint d;
    public final o1.k e;
    public float f23600f;
    public final o1.k h;
    public float f23601n;
    public final o1.k f23602r;
    public float f23603s;
    public final float v;
    public final float f23604w;
    public EditText f23605x;
    public boolean f23606y;

    static {
        sv0 sv0Var = new sv0(new q2(15), new q2(16));
        sv0Var.f27224c = 100.0f;
        I = sv0Var;
        sv0 sv0Var2 = new sv0(new q2(17), new q2(18));
        sv0Var2.f27224c = 100.0f;
        J = sv0Var2;
        sv0 sv0Var3 = new sv0(new q2(19), new q2(20));
        sv0Var3.f27224c = 100.0f;
        K = sv0Var3;
    }

    public hd0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23597a = new RectF();
        this.f23598b = "";
        Paint paint = new Paint(1);
        this.f23599c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.f23602r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.f23604w = AndroidUtilities.dp(1.6667f);
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
        o1.l lVar = kVar.f14134u;
        if (lVar != null && f10 == ((float) lVar.f14140i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f10);
        lVar2.b(500.0f);
        lVar2.a(1.0f);
        lVar2.f14140i = f10;
        kVar.f14134u = lVar2;
        kVar.f();
    }

    private void setColor(int i10) {
        this.f23599c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.f23602r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (!z10) {
            this.f23600f = f7;
            this.f23601n = f10;
            if (!this.f23606y) {
                float f11 = this.f23604w;
                float f12 = this.v;
                this.f23599c.setStrokeWidth(((f11 - f12) * f7) + f12);
            }
            f();
            return;
        }
        d(this.e, f7);
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
        this.f23605x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var);
        float f10 = 0.0f;
        if (this.f23606y && !this.F) {
            f7 = 0.0f;
        } else {
            f7 = this.f23601n;
        }
        int d = i0.a.d(f7, v02, v03);
        int i11 = org.telegram.ui.ActionBar.j6.f18162q7;
        this.d.setColor(i0.a.d(this.f23603s, d, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, f6Var);
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var);
        if (!this.f23606y || this.F) {
            f10 = this.f23600f;
        }
        setColor(i0.a.d(this.f23603s, i0.a.d(f10, v04, v05), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
    }

    public EditText getAttachedEditText() {
        return this.f23605x;
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
        EditText editText = this.f23605x;
        if ((editText == null || editText.length() != 0 || !TextUtils.isEmpty(this.f23605x.getHint())) && !this.f23606y && !this.E) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.f23601n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        if (z10) {
            f7 = (1.0f - this.f23601n) * this.H;
        } else {
            f7 = 0.0f;
        }
        Paint paint = this.f23599c;
        float strokeWidth = paint.getStrokeWidth();
        if (z10) {
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f23601n, 0.25f, 0.75f);
        } else {
            f10 = 0.75f;
        }
        float measureText = textPaint.measureText(this.f23598b) * f10;
        canvas.save();
        RectF rectF = this.f23597a;
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
            f11 = this.f23601n;
        } else {
            f11 = 1.0f;
        }
        canvas.drawLine((dp2 * f11) + f14, paddingTop2, width, paddingTop2, paint);
        float dp3 = f14 + AndroidUtilities.dp(4.0f);
        float f15 = dp - dp3;
        if (z10) {
            f12 = this.f23601n;
        } else {
            f12 = 1.0f;
        }
        canvas.drawLine(dp, paddingTop2, (f15 * f12) + dp3, paddingTop2, paint);
        canvas.save();
        canvas.scale(f10, f10, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.f23598b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f7, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.f23606y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.f23606y = z10;
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
        this.f23598b = str;
        invalidate();
    }
}
