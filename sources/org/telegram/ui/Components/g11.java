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
public final class g11 extends Drawable {
    public final TextPaint f26283a;
    public final Paint f26284b;
    public StaticLayout f26285c;
    public float d;
    public int e;
    public int f26286f;
    public Drawable f26287g;
    public int h;
    public final Context f26288i;
    public final org.telegram.ui.ActionBar.p6 f26289j;
    public boolean f26290k;
    public boolean f26291l;
    public boolean f26292m;
    public ColorFilter f26293n;

    public g11(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f26283a = textPaint;
        this.f26284b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f26286f = -1;
        this.f26288i = context;
        this.f26289j = p6Var;
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static g11 a(int i10) {
        g11 g11Var = new g11(org.telegram.messenger.w0.f18945b, null);
        g11Var.b(i10);
        g11Var.f26291l = true;
        return g11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f26286f != i10) {
            this.f26286f = i10;
            boolean z10 = this.f26292m;
            Context context = this.f26288i;
            if (z10) {
                this.f26287g = context.getDrawable(2131232064).mutate();
            } else {
                if (i10 == 0) {
                    i11 = 2131232229;
                } else {
                    i11 = 2131232230;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f26287g = mutate;
                mutate.setColorFilter(this.f26293n);
            }
            invalidateSelf();
            int i12 = this.f26286f;
            if (i12 >= 1 && i12 < 60) {
                str = i0.a.i(i10, "");
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745705, a1.g.t(str));
                }
            } else if (i12 >= 60 && i12 < 3600) {
                str = "" + (i10 / 60);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745707, a1.g.t(str));
                }
            } else if (i12 >= 3600 && i12 < 86400) {
                str = "" + ((i10 / 60) / 60);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745708, a1.g.t(str));
                }
            } else if (i12 >= 86400 && i12 < 604800) {
                str = "" + (((i10 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745709, a1.g.t(str));
                }
            } else if (i12 < 2678400) {
                str = "" + ((((i10 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745704, a1.g.t(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i12 < 31449600) {
                str = "" + ((((i10 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745706, a1.g.t(str));
                }
            } else {
                str = "" + ((((i10 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = a1.g.m(null, 2131745703, a1.g.t(str));
                }
            }
            String str2 = str;
            TextPaint textPaint = this.f26283a;
            textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
            float measureText = textPaint.measureText(str2);
            this.d = measureText;
            if (measureText > org.telegram.messenger.i0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.i0.L(9.0f));
                this.d = textPaint.measureText(str2);
            }
            if (this.d > org.telegram.messenger.i0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.i0.L(6.0f));
                this.d = textPaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f26285c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f26285c = null;
                org.telegram.messenger.f8.g(e, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(23.0f);
        int L2 = org.telegram.messenger.i0.L(23.0f);
        boolean z10 = this.f26292m;
        Paint paint = this.f26284b;
        int i10 = -1;
        TextPaint textPaint = this.f26283a;
        org.telegram.ui.ActionBar.p6 p6Var = this.f26289j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f26291l) {
            if (!this.f26290k) {
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, p6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, p6Var));
        }
        if (this.f26287g != null) {
            if (!this.f26291l && !this.f26292m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f26287g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f26292m) {
                this.f26287g.setBounds(getBounds().left, getBounds().top, this.f26287g.getIntrinsicWidth() + getBounds().left, this.f26287g.getIntrinsicHeight() + getBounds().top);
                this.f26287g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.i0.L(10.5f), getBounds().centerY() - org.telegram.messenger.i0.L(10.5f), this.f26287g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.i0.L(10.5f)), this.f26287g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.i0.L(10.5f)));
                this.f26287g.setBounds(rect);
                this.f26287g.draw(canvas);
            }
        }
        if (this.f26286f != 0 && this.f26285c != null) {
            if (org.telegram.messenger.i0.f16171p != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f26292m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f26285c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i10, (L2 - this.e) / 2.0f);
                this.f26285c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(23.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(23.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26293n = colorFilter;
        if (this.f26291l) {
            this.f26287g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
