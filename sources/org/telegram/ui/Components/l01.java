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
public final class l01 extends Drawable {
    public final TextPaint f37055a;
    public final Paint f37056b;
    public StaticLayout f37057c;
    public float d;
    public int f37058e;
    public int f37059f;
    public Drawable f37060g;
    public int h;
    public final Context f37061i;
    public final org.telegram.ui.ActionBar.h6 f37062j;
    public boolean f37063k;
    public boolean f37064l;
    public boolean f37065m;
    public ColorFilter f37066n;

    public l01(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f37055a = textPaint;
        this.f37056b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f37058e = 0;
        this.f37059f = -1;
        this.f37061i = context;
        this.f37062j = h6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static l01 a(int i7) {
        l01 l01Var = new l01(org.telegram.messenger.t0.f26931b, null);
        l01Var.b(i7);
        l01Var.f37064l = true;
        return l01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f37059f != i7) {
            this.f37059f = i7;
            boolean z10 = this.f37065m;
            Context context = this.f37061i;
            if (z10) {
                this.f37060g = context.getDrawable(2131232067).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232232;
                } else {
                    i10 = 2131232233;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f37060g = mutate;
                mutate.setColorFilter(this.f37066n);
            }
            invalidateSelf();
            int i11 = this.f37059f;
            if (i11 >= 1 && i11 < 60) {
                str = i5.c.i(i7, "");
                if (str.length() < 2) {
                    str = i5.c.k(2131745492, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i7 / 60);
                if (str.length() < 2) {
                    str = i5.c.k(2131745494, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i7 / 60) / 60);
                if (str.length() < 2) {
                    str = i5.c.k(2131745495, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i7 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = i5.c.k(2131745496, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i7 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = i5.c.k(2131745491, null, com.google.android.gms.internal.vision.e2.m(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i7 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = i5.c.k(2131745493, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else {
                str = "" + ((((i7 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = i5.c.k(2131745490, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f37055a;
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
                this.f37057c = staticLayout;
                this.f37058e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f37057c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z10 = this.f37065m;
        Paint paint = this.f37056b;
        int i7 = -1;
        TextPaint textPaint = this.f37055a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37062j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f37064l) {
            if (!this.f37063k) {
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29661s8, h6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, h6Var));
        }
        if (this.f37060g != null) {
            if (!this.f37064l && !this.f37065m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f37060g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f37065m) {
                this.f37060g.setBounds(getBounds().left, getBounds().top, this.f37060g.getIntrinsicWidth() + getBounds().left, this.f37060g.getIntrinsicHeight() + getBounds().top);
                this.f37060g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f37060g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f37060g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f37060g.setBounds(rect);
                this.f37060g.draw(canvas);
            }
        }
        if (this.f37059f != 0 && this.f37057c != null) {
            if (org.telegram.messenger.g0.f24045p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f37065m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f37058e) / 2.0f);
                this.f37057c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f37058e) / 2.0f);
                this.f37057c.draw(canvas);
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
        this.f37066n = colorFilter;
        if (this.f37064l) {
            this.f37060g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
