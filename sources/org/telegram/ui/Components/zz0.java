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
public final class zz0 extends Drawable {
    public final TextPaint f41139a;
    public final Paint f41140b;
    public StaticLayout f41141c;
    public float d;
    public int f41142e;
    public int f41143f;
    public Drawable f41144g;
    public int h;
    public final Context f41145i;
    public final org.telegram.ui.ActionBar.f6 f41146j;
    public boolean f41147k;
    public boolean f41148l;
    public boolean f41149m;
    public ColorFilter f41150n;

    public zz0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f41139a = textPaint;
        this.f41140b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f41142e = 0;
        this.f41143f = -1;
        this.f41145i = context;
        this.f41146j = f6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static zz0 a(int i7) {
        zz0 zz0Var = new zz0(org.telegram.messenger.t0.f25555b, null);
        zz0Var.b(i7);
        zz0Var.f41148l = true;
        return zz0Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f41143f != i7) {
            this.f41143f = i7;
            boolean z9 = this.f41149m;
            Context context = this.f41145i;
            if (z9) {
                this.f41144g = context.getDrawable(2131232065).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232230;
                } else {
                    i10 = 2131232231;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f41144g = mutate;
                mutate.setColorFilter(this.f41150n);
            }
            invalidateSelf();
            int i11 = this.f41143f;
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
            TextPaint textPaint = this.f41139a;
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
                this.f41141c = staticLayout;
                this.f41142e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f41141c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z9 = this.f41149m;
        Paint paint = this.f41140b;
        int i7 = -1;
        TextPaint textPaint = this.f41139a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f41146j;
        if (z9) {
            textPaint.setColor(-1);
        } else if (!this.f41148l) {
            if (!this.f41147k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, f6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, f6Var));
        }
        if (this.f41144g != null) {
            if (!this.f41148l && !this.f41149m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f41144g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f41149m) {
                this.f41144g.setBounds(getBounds().left, getBounds().top, this.f41144g.getIntrinsicWidth() + getBounds().left, this.f41144g.getIntrinsicHeight() + getBounds().top);
                this.f41144g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f41144g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f41144g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f41144g.setBounds(rect);
                this.f41144g.draw(canvas);
            }
        }
        if (this.f41143f != 0 && this.f41141c != null) {
            if (org.telegram.messenger.g0.f22536p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f41149m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f41142e) / 2.0f);
                this.f41141c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f41142e) / 2.0f);
                this.f41141c.draw(canvas);
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
        this.f41150n = colorFilter;
        if (this.f41148l) {
            this.f41144g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
