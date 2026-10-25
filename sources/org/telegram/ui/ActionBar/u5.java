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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
public final class u5 extends View implements oe.d {
    public int E;
    public int F;
    public final r5 f23129a;
    public final int f23130b;
    public final t5 f23131c;
    public final s5 d;
    public final Drawable e;
    public final gq f23132f;
    public final TextPaint h;
    public final Paint f23133n;
    public final RectF f23134r;
    public CharSequence f23135s;
    public float v;
    public final oe.b f23136w;
    public final oe.b f23137x;
    public int f23138y;

    public u5(Context context, r5 r5Var, CharSequence charSequence) {
        super(context);
        float f7;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f23133n = new Paint(1);
        this.f23134r = new RectF();
        ds dsVar = ds.h;
        this.f23136w = new oe.b(0, this, dsVar, 380L, true);
        this.f23137x = new oe.b(1, this, dsVar, 250L, false);
        this.f23129a = r5Var;
        this.f23130b = 1;
        this.f23131c = (t5) wi.e.f51280k.a();
        this.d = (s5) wi.e.f51281l.a();
        this.f23135s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        this.f23132f = gqVar;
        gqVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        c();
        CharSequence charSequence2 = this.f23135s;
        if (charSequence2 != null) {
            f7 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f7 = 0.0f;
        }
        this.v = f7;
        setContentDescription(charSequence);
        setOnClickListener(new x(this, 3));
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            this.f23129a.c();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        oe.e eVar;
        oe.b bVar = this.f23136w;
        if (bVar.f19327f == z10 && (z11 || (eVar = bVar.h) == null || !eVar.h)) {
            return;
        }
        r5 r5Var = this.f23129a;
        if (z11 && r5Var.p()) {
            z12 = true;
        } else {
            z12 = false;
        }
        bVar.a(z10, z12);
        E(0, bVar.e, 0.0f, null);
        r5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f23137x.a(z10, this.f23129a.p());
        invalidate();
    }

    public final void c() {
        int i10;
        r5 r5Var = this.f23129a;
        u6 u6Var = r5Var.f23026a;
        this.f23138y = y6.w0(y6.Oh, u6Var);
        this.E = i0.a.f(0.5f, y6.w0(y6.f23297a7, u6Var), this.f23138y);
        int w02 = y6.w0(y6.Sh, u6Var);
        this.F = w02;
        int i11 = r5Var.f23032d0;
        t5 t5Var = this.f23131c;
        t5 t5Var2 = t5.f23101b;
        if (t5Var != t5Var2) {
            w02 = i11;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f23132f.b(w02);
        this.h.setColor(w02);
        if (t5Var == t5Var2) {
            i10 = y6.o1(0.2f, this.F);
        } else {
            i10 = r5Var.f23035f0;
        }
        setBackground(y6.Z(i10, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f23130b;
    }

    public int getButtonWidth() {
        if (this.d != s5.f23083a && !TextUtils.isEmpty(this.f23135s)) {
            return org.telegram.messenger.t.z(32.0f, (int) Math.ceil(this.v), AndroidUtilities.dp(46.0f));
        }
        return AndroidUtilities.dp(46.0f);
    }

    public s5 getShape() {
        return this.d;
    }

    public t5 getStyle() {
        return this.f23131c;
    }

    public float getTargetVisibleFactor() {
        if (this.f23131c != t5.f23101b && !this.f23136w.f19327f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f23131c == t5.f23101b) {
            return 1.0f;
        }
        return this.f23136w.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float width = getWidth();
        float height = getHeight();
        if (this.f23131c == t5.f23101b) {
            int f10 = i0.a.f(this.f23136w.e, this.E, this.f23138y);
            Paint paint = this.f23133n;
            paint.setColor(f10);
            RectF rectF = this.f23134r;
            rectF.set(0.0f, 0.0f, width, height);
            float f11 = height / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        float f12 = this.f23137x.e;
        if (f12 < 1.0f) {
            float lerp = AndroidUtilities.lerp(1.0f, 0.6f, f12);
            canvas.save();
            canvas.scale(lerp, lerp, width / 2.0f, height / 2.0f);
            float f13 = 1.0f - f12;
            int i10 = (int) (f13 * 255.0f);
            if (this.d == s5.f23083a || TextUtils.isEmpty(this.f23135s)) {
                f7 = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f13));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.f23135s;
                f7 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.v) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f7 = 0.0f;
        }
        if (f12 > f7) {
            float lerp2 = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas.save();
            canvas.scale(lerp2, lerp2, width / 2.0f, height / 2.0f);
            gq gqVar = this.f23132f;
            gqVar.setBounds(0, 0, (int) width, (int) height);
            gqVar.setAlpha((int) (f12 * 255.0f));
            gqVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(getButtonWidth(), AndroidUtilities.dp(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f7;
        if (TextUtils.equals(this.f23135s, charSequence)) {
            return;
        }
        this.f23135s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f23135s;
        if (charSequence2 != null) {
            f7 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f7 = 0.0f;
        }
        this.v = f7;
        requestLayout();
        this.f23129a.requestLayout();
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.f23129a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23132f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
