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
public final class b01 extends Drawable {
    public final TextPaint f32028a;
    public final Paint f32029b;
    public StaticLayout f32030c;
    public float d;
    public int f32031e;
    public int f32032f;
    public Drawable f32033g;
    public int h;
    public final Context f32034i;
    public final org.telegram.ui.ActionBar.g6 f32035j;
    public boolean f32036k;
    public boolean f32037l;
    public boolean f32038m;
    public ColorFilter f32039n;

    public b01(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f32028a = textPaint;
        this.f32029b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f32031e = 0;
        this.f32032f = -1;
        this.f32034i = context;
        this.f32035j = g6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static b01 a(int i7) {
        b01 b01Var = new b01(org.telegram.messenger.t0.f25566b, null);
        b01Var.b(i7);
        b01Var.f32037l = true;
        return b01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f32032f != i7) {
            this.f32032f = i7;
            boolean z9 = this.f32038m;
            Context context = this.f32034i;
            if (z9) {
                this.f32033g = context.getDrawable(2131232065).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232230;
                } else {
                    i10 = 2131232231;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f32033g = mutate;
                mutate.setColorFilter(this.f32039n);
            }
            invalidateSelf();
            int i11 = this.f32032f;
            if (i11 >= 1 && i11 < 60) {
                str = jg.g.j(i7, "");
                if (str.length() < 2) {
                    str = jg.g.l(2131745688, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i7 / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745690, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i7 / 60) / 60);
                if (str.length() < 2) {
                    str = jg.g.l(2131745691, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i7 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = jg.g.l(2131745692, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i7 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = jg.g.l(2131745687, null, com.google.android.recaptcha.internal.a.m(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i7 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = jg.g.l(2131745689, null, com.google.android.recaptcha.internal.a.m(str));
                }
            } else {
                str = "" + ((((i7 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = jg.g.l(2131745686, null, com.google.android.recaptcha.internal.a.m(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f32028a;
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
                this.f32030c = staticLayout;
                this.f32031e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f32030c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z9 = this.f32038m;
        Paint paint = this.f32029b;
        int i7 = -1;
        TextPaint textPaint = this.f32028a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f32035j;
        if (z9) {
            textPaint.setColor(-1);
        } else if (!this.f32037l) {
            if (!this.f32036k) {
                paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, g6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, g6Var));
        }
        if (this.f32033g != null) {
            if (!this.f32037l && !this.f32038m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f32033g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f32038m) {
                this.f32033g.setBounds(getBounds().left, getBounds().top, this.f32033g.getIntrinsicWidth() + getBounds().left, this.f32033g.getIntrinsicHeight() + getBounds().top);
                this.f32033g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f32033g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f32033g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f32033g.setBounds(rect);
                this.f32033g.draw(canvas);
            }
        }
        if (this.f32032f != 0 && this.f32030c != null) {
            if (org.telegram.messenger.g0.f22562p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f32038m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f32031e) / 2.0f);
                this.f32030c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f32031e) / 2.0f);
                this.f32030c.draw(canvas);
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
        this.f32039n = colorFilter;
        if (this.f32037l) {
            this.f32033g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
