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
    public final TextPaint f41195a;
    public final Paint f41196b;
    public StaticLayout f41197c;
    public float d;
    public int f41198e;
    public int f41199f;
    public Drawable f41200g;
    public int h;
    public final Context f41201i;
    public final org.telegram.ui.ActionBar.e6 f41202j;
    public boolean f41203k;
    public boolean f41204l;
    public boolean f41205m;
    public ColorFilter f41206n;

    public zz0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f41195a = textPaint;
        this.f41196b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f41198e = 0;
        this.f41199f = -1;
        this.f41201i = context;
        this.f41202j = e6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static zz0 a(int i3) {
        zz0 zz0Var = new zz0(org.telegram.messenger.t0.f25457b, null);
        zz0Var.b(i3);
        zz0Var.f41204l = true;
        return zz0Var;
    }

    public final void b(int i3) {
        int i10;
        String str;
        if (this.f41199f != i3) {
            this.f41199f = i3;
            boolean z10 = this.f41205m;
            Context context = this.f41201i;
            if (z10) {
                this.f41200g = context.getDrawable(2131232065).mutate();
            } else {
                if (i3 == 0) {
                    i10 = 2131232230;
                } else {
                    i10 = 2131232231;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f41200g = mutate;
                mutate.setColorFilter(this.f41206n);
            }
            invalidateSelf();
            int i11 = this.f41199f;
            if (i11 >= 1 && i11 < 60) {
                str = k2.p1.i(i3, "");
                if (str.length() < 2) {
                    str = k2.p1.k(2131745698, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i3 / 60);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745700, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i3 / 60) / 60);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745701, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i3 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745702, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i3 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745697, null, com.google.android.recaptcha.internal.a.l(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i3 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745699, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else {
                str = "" + ((((i3 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745696, null, com.google.android.recaptcha.internal.a.l(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f41195a;
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
                this.f41197c = staticLayout;
                this.f41198e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f41197c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z10 = this.f41205m;
        Paint paint = this.f41196b;
        int i3 = -1;
        TextPaint textPaint = this.f41195a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41202j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f41204l) {
            if (!this.f41203k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, e6Var));
        }
        if (this.f41200g != null) {
            if (!this.f41204l && !this.f41205m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f41200g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f41205m) {
                this.f41200g.setBounds(getBounds().left, getBounds().top, this.f41200g.getIntrinsicWidth() + getBounds().left, this.f41200g.getIntrinsicHeight() + getBounds().top);
                this.f41200g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f41200g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f41200g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f41200g.setBounds(rect);
                this.f41200g.draw(canvas);
            }
        }
        if (this.f41199f != 0 && this.f41197c != null) {
            if (org.telegram.messenger.g0.f22607p != 3.0f) {
                i3 = 0;
            }
            canvas.save();
            if (this.f41205m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i3), (getBounds().height() - this.f41198e) / 2.0f);
                this.f41197c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i3, (L2 - this.f41198e) / 2.0f);
                this.f41197c.draw(canvas);
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
        this.f41206n = colorFilter;
        if (this.f41204l) {
            this.f41200g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
