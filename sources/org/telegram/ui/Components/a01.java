package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public final class a01 extends Drawable {
    public final TextPaint f31629a;
    public final Paint f31630b;
    public StaticLayout f31631c;
    public float d;
    public int f31632e;
    public int f31633f;
    public Drawable f31634g;
    public int h;
    public final Context f31635i;
    public final org.telegram.ui.ActionBar.f6 f31636j;
    public boolean f31637k;
    public boolean f31638l;
    public boolean f31639m;
    public ColorFilter f31640n;

    public a01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f31629a = textPaint;
        this.f31630b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f31632e = 0;
        this.f31633f = -1;
        this.f31635i = context;
        this.f31636j = f6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static a01 a(int i7) {
        a01 a01Var = new a01(org.telegram.messenger.t0.f25566b, null);
        a01Var.b(i7);
        a01Var.f31638l = true;
        return a01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f31633f != i7) {
            this.f31633f = i7;
            boolean z9 = this.f31639m;
            Context context = this.f31635i;
            if (z9) {
                this.f31634g = context.getDrawable(2131232065).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232230;
                } else {
                    i10 = 2131232231;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f31634g = mutate;
                mutate.setColorFilter(this.f31640n);
            }
            invalidateSelf();
            int i11 = this.f31633f;
            if (i11 >= 1 && i11 < 60) {
                str = jg.g.j(i7, "");
                if (str.length() < 2) {
                    str = jg.g.l(2131745691, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i7 / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745693, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i7 / 60) / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745694, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i7 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = jg.g.l(2131745695, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i7 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = jg.g.l(2131745690, null, com.google.android.recaptcha.internal.a.m(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i7 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = jg.g.l(2131745692, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else {
                str = "" + ((((i7 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = jg.g.l(2131745689, null, com.google.android.recaptcha.internal.a.m(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f31629a;
            textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
            float measureText = textPaint.measureText(str2);
            this.d = measureText;
            if (measureText > org.telegram.messenger.g0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(9.0f));
                this.d = textPaint.measureText(str2);
            }
            if (this.d > org.telegram.messenger.g0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(6.0f));
                this.d = textPaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f31631c = staticLayout;
                this.f31632e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f31631c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z9 = this.f31639m;
        Paint paint = this.f31630b;
        int i7 = -1;
        TextPaint textPaint = this.f31629a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31636j;
        if (z9) {
            textPaint.setColor(-1);
        } else if (!this.f31638l) {
            if (!this.f31637k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, f6Var));
        }
        if (this.f31634g != null) {
            if (!this.f31638l && !this.f31639m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f31634g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f31639m) {
                this.f31634g.setBounds(getBounds().left, getBounds().top, this.f31634g.getIntrinsicWidth() + getBounds().left, this.f31634g.getIntrinsicHeight() + getBounds().top);
                this.f31634g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f31634g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f31634g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f31634g.setBounds(rect);
                this.f31634g.draw(canvas);
            }
        }
        if (this.f31633f != 0 && this.f31631c != null) {
            if (org.telegram.messenger.g0.f22562p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f31639m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f31632e) / 2.0f);
                this.f31631c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f31632e) / 2.0f);
                this.f31631c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(23.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(23.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31640n = colorFilter;
        if (this.f31638l) {
            this.f31634g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
