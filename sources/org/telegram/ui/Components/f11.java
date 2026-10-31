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
public final class f11 extends Drawable {
    public final TextPaint f25937a;
    public final Paint f25938b;
    public StaticLayout f25939c;
    public float d;
    public int e;
    public int f25940f;
    public Drawable f25941g;
    public int h;
    public final Context f25942i;
    public final org.telegram.ui.ActionBar.p6 f25943j;
    public boolean f25944k;
    public boolean f25945l;
    public boolean f25946m;
    public ColorFilter f25947n;

    public f11(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f25937a = textPaint;
        this.f25938b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f25940f = -1;
        this.f25942i = context;
        this.f25943j = p6Var;
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static f11 a(int i10) {
        f11 f11Var = new f11(org.telegram.messenger.w0.f19025b, null);
        f11Var.b(i10);
        f11Var.f25945l = true;
        return f11Var;
    }

    public final void b(int i10) {
        int i11;
        String str;
        if (this.f25940f != i10) {
            this.f25940f = i10;
            boolean z10 = this.f25946m;
            Context context = this.f25942i;
            if (z10) {
                this.f25941g = context.getDrawable(2131232064).mutate();
            } else {
                if (i10 == 0) {
                    i11 = 2131232229;
                } else {
                    i11 = 2131232230;
                }
                Drawable mutate = context.getDrawable(i11).mutate();
                this.f25941g = mutate;
                mutate.setColorFilter(this.f25947n);
            }
            invalidateSelf();
            int i12 = this.f25940f;
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
            TextPaint textPaint = this.f25937a;
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
                this.f25939c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.f25939c = null;
                org.telegram.messenger.f8.g(e, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(23.0f);
        int L2 = org.telegram.messenger.i0.L(23.0f);
        boolean z10 = this.f25946m;
        Paint paint = this.f25938b;
        int i10 = -1;
        TextPaint textPaint = this.f25937a;
        org.telegram.ui.ActionBar.p6 p6Var = this.f25943j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f25945l) {
            if (!this.f25944k) {
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, p6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, p6Var));
        }
        if (this.f25941g != null) {
            if (!this.f25945l && !this.f25946m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f25941g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f25946m) {
                this.f25941g.setBounds(getBounds().left, getBounds().top, this.f25941g.getIntrinsicWidth() + getBounds().left, this.f25941g.getIntrinsicHeight() + getBounds().top);
                this.f25941g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.i0.L(10.5f), getBounds().centerY() - org.telegram.messenger.i0.L(10.5f), this.f25941g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.i0.L(10.5f)), this.f25941g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.i0.L(10.5f)));
                this.f25941g.setBounds(rect);
                this.f25941g.draw(canvas);
            }
        }
        if (this.f25940f != 0 && this.f25939c != null) {
            if (org.telegram.messenger.i0.f16025p != 3.0f) {
                i10 = 0;
            }
            canvas.save();
            if (this.f25946m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i10), (getBounds().height() - this.e) / 2.0f);
                this.f25939c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i10, (L2 - this.e) / 2.0f);
                this.f25939c.draw(canvas);
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
        this.f25947n = colorFilter;
        if (this.f25945l) {
            this.f25941g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
