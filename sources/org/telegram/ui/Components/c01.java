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
public final class c01 extends Drawable {
    public final TextPaint f33443a;
    public final Paint f33444b;
    public StaticLayout f33445c;
    public float d;
    public int f33446e;
    public int f33447f;
    public Drawable f33448g;
    public int h;
    public final Context f33449i;
    public final org.telegram.ui.ActionBar.e6 f33450j;
    public boolean f33451k;
    public boolean f33452l;
    public boolean f33453m;
    public ColorFilter f33454n;

    public c01(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f33443a = textPaint;
        this.f33444b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f33446e = 0;
        this.f33447f = -1;
        this.f33449i = context;
        this.f33450j = e6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static c01 a(int i7) {
        c01 c01Var = new c01(org.telegram.messenger.t0.f26600b, null);
        c01Var.b(i7);
        c01Var.f33452l = true;
        return c01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f33447f != i7) {
            this.f33447f = i7;
            boolean z10 = this.f33453m;
            Context context = this.f33449i;
            if (z10) {
                this.f33448g = context.getDrawable(2131232066).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232231;
                } else {
                    i10 = 2131232232;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f33448g = mutate;
                mutate.setColorFilter(this.f33454n);
            }
            invalidateSelf();
            int i11 = this.f33447f;
            if (i11 >= 1 && i11 < 60) {
                str = i5.c.i(i7, "");
                if (str.length() < 2) {
                    str = i5.c.k(2131745688, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 60 && i11 < 3600) {
                str = "" + (i7 / 60);
                if (str.length() < 2) {
                    str = i5.c.k(2131745690, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 3600 && i11 < 86400) {
                str = "" + ((i7 / 60) / 60);
                if (str.length() < 2) {
                    str = i5.c.k(2131745691, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 >= 86400 && i11 < 604800) {
                str = "" + (((i7 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = i5.c.k(2131745692, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else if (i11 < 2678400) {
                str = "" + ((((i7 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = i5.c.k(2131745687, null, com.google.android.gms.internal.vision.e2.m(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i11 < 31449600) {
                str = "" + ((((i7 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = i5.c.k(2131745689, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            } else {
                str = "" + ((((i7 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = i5.c.k(2131745686, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f33443a;
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
                this.f33445c = staticLayout;
                this.f33446e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f33445c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z10 = this.f33453m;
        Paint paint = this.f33444b;
        int i7 = -1;
        TextPaint textPaint = this.f33443a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33450j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f33452l) {
            if (!this.f33451k) {
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, e6Var));
        }
        if (this.f33448g != null) {
            if (!this.f33452l && !this.f33453m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f33448g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f33453m) {
                this.f33448g.setBounds(getBounds().left, getBounds().top, this.f33448g.getIntrinsicWidth() + getBounds().left, this.f33448g.getIntrinsicHeight() + getBounds().top);
                this.f33448g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f33448g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f33448g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f33448g.setBounds(rect);
                this.f33448g.draw(canvas);
            }
        }
        if (this.f33447f != 0 && this.f33445c != null) {
            if (org.telegram.messenger.g0.f23608p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f33453m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f33446e) / 2.0f);
                this.f33445c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f33446e) / 2.0f);
                this.f33445c.draw(canvas);
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
        this.f33454n = colorFilter;
        if (this.f33452l) {
            this.f33448g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
