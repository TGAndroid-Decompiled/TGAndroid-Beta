package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;
public final class c5 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final z4 f28910a;
    public final int f28911b;
    public final b5 f28912c;
    public final a5 d;
    public final Drawable f28913e;
    public final rp f28914f;
    public final TextPaint h;
    public final Paint f28915n;
    public final RectF f28916r;
    public CharSequence f28917s;
    public float f28918w;
    public final te.a f28919x;
    public final te.a f28920y;

    public c5(Context context, z4 z4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f28915n = new Paint(1);
        this.f28916r = new RectF();
        kr krVar = kr.h;
        this.f28919x = new te.a(0, this, krVar, 380L, true);
        this.f28920y = new te.a(1, this, krVar, 250L, false);
        this.f28910a = z4Var;
        this.f28911b = 1;
        this.f28912c = (b5) aj.e.f1628k.a();
        this.d = (a5) aj.e.f1629l.a();
        this.f28917s = charSequence;
        this.f28913e = context.getDrawable(2131231245).mutate();
        rp rpVar = new rp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f28914f = rpVar;
        rpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f28917s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28918w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new hi.z4(this, 23));
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f28910a.l();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        te.c cVar;
        te.a aVar = this.f28919x;
        if (aVar.f57780f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        z4 z4Var = this.f28910a;
        if (z11 && z4Var.y()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        K(0, aVar.f57779e, 0.0f, null);
        z4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f28920y.a(z10, this.f28910a.y());
        invalidate();
    }

    public final void c() {
        int i7;
        z4 z4Var = this.f28910a;
        i6 i6Var = z4Var.f30379a;
        this.E = n6.w0(n6.Fi, i6Var);
        this.F = i0.a.f(0.5f, n6.w0(n6.f29394a7, i6Var), this.E);
        int w02 = n6.w0(n6.Ji, i6Var);
        this.G = w02;
        int i10 = z4Var.f30390g0;
        b5 b5Var = this.f28912c;
        b5 b5Var2 = b5.f28872b;
        if (b5Var != b5Var2) {
            w02 = i10;
        }
        this.f28913e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f28914f.b(w02);
        this.h.setColor(w02);
        if (b5Var == b5Var2) {
            i7 = n6.r1(0.2f, this.G);
        } else {
            i7 = z4Var.f30392i0;
        }
        setBackground(n6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f28911b;
    }

    public int getButtonWidth() {
        if (this.d != a5.f28851a && !TextUtils.isEmpty(this.f28917s)) {
            return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.f28918w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public a5 getShape() {
        return this.d;
    }

    public b5 getStyle() {
        return this.f28912c;
    }

    public float getTargetVisibleFactor() {
        if (this.f28912c != b5.f28872b && !this.f28919x.f57780f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f28912c == b5.f28872b) {
            return 1.0f;
        }
        return this.f28919x.f57779e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f28912c == b5.f28872b) {
            int f11 = i0.a.f(this.f28919x.f57779e, this.F, this.E);
            Paint paint = this.f28915n;
            paint.setColor(f11);
            RectF rectF = this.f28916r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f28920y.f57779e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == a5.f28851a || TextUtils.isEmpty(this.f28917s)) {
                f10 = 0.0f;
                Drawable drawable = this.f28913e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i7);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f14));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.f28917s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f28918w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        if (f13 > f10) {
            float T12 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas.save();
            canvas.scale(T12, T12, width / 2.0f, height / 2.0f);
            rp rpVar = this.f28914f;
            rpVar.setBounds(0, 0, (int) width, (int) height);
            rpVar.setAlpha((int) (f13 * 255.0f));
            rpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f28917s, charSequence)) {
            return;
        }
        this.f28917s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f28917s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28918w = f10;
        requestLayout();
        this.f28910a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f28910a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28914f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
