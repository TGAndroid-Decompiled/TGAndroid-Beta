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
    public final TextPaint f31622a;
    public final Paint f31623b;
    public StaticLayout f31624c;
    public float d;
    public int f31625e;
    public int f31626f;
    public Drawable f31627g;
    public int h;
    public final Context f31628i;
    public final org.telegram.ui.ActionBar.f6 f31629j;
    public boolean f31630k;
    public boolean f31631l;
    public boolean f31632m;
    public ColorFilter f31633n;

    public a01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f31622a = textPaint;
        this.f31623b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f31625e = 0;
        this.f31626f = -1;
        this.f31628i = context;
        this.f31629j = f6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static a01 a(int i7) {
        a01 a01Var = new a01(org.telegram.messenger.t0.f25563b, null);
        a01Var.b(i7);
        a01Var.f31631l = true;
        return a01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f31626f != i7) {
            this.f31626f = i7;
            boolean z9 = this.f31632m;
            Context context = this.f31628i;
            if (z9) {
                this.f31627g = context.getDrawable(2131232065).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232230;
                } else {
                    i10 = 2131232231;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f31627g = mutate;
                mutate.setColorFilter(this.f31633n);
            }
            invalidateSelf();
            int i11 = this.f31626f;
            if (i11 >= 1 && i11 < 60) {
                str = jg.g.j(i7, "");
                if (str.length() < 2) {
                    str = jg.g.l(2131745689, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i7 / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745691, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i7 / 60) / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745692, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i7 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = jg.g.l(2131745693, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i7 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = jg.g.l(2131745688, null, com.google.android.recaptcha.internal.a.m(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i7 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = jg.g.l(2131745690, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else {
                str = "" + ((((i7 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = jg.g.l(2131745687, null, com.google.android.recaptcha.internal.a.m(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f31622a;
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
                this.f31624c = staticLayout;
                this.f31625e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f31624c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z9 = this.f31632m;
        Paint paint = this.f31623b;
        int i7 = -1;
        TextPaint textPaint = this.f31622a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31629j;
        if (z9) {
            textPaint.setColor(-1);
        } else if (!this.f31631l) {
            if (!this.f31630k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28129s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, f6Var));
        }
        if (this.f31627g != null) {
            if (!this.f31631l && !this.f31632m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f31627g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f31632m) {
                this.f31627g.setBounds(getBounds().left, getBounds().top, this.f31627g.getIntrinsicWidth() + getBounds().left, this.f31627g.getIntrinsicHeight() + getBounds().top);
                this.f31627g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f31627g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f31627g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f31627g.setBounds(rect);
                this.f31627g.draw(canvas);
            }
        }
        if (this.f31626f != 0 && this.f31624c != null) {
            if (org.telegram.messenger.g0.f22543p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f31632m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f31625e) / 2.0f);
                this.f31624c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f31625e) / 2.0f);
                this.f31624c.draw(canvas);
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
        this.f31633n = colorFilter;
        if (this.f31631l) {
            this.f31627g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
