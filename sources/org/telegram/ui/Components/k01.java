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
public final class k01 extends Drawable {
    public final TextPaint f36585a;
    public final Paint f36586b;
    public StaticLayout f36587c;
    public float d;
    public int f36588e;
    public int f36589f;
    public Drawable f36590g;
    public int h;
    public final Context f36591i;
    public final org.telegram.ui.ActionBar.i6 f36592j;
    public boolean f36593k;
    public boolean f36594l;
    public boolean f36595m;
    public ColorFilter f36596n;

    public k01(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f36585a = textPaint;
        this.f36586b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.f36588e = 0;
        this.f36589f = -1;
        this.f36591i = context;
        this.f36592j = i6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static k01 a(int i7) {
        k01 k01Var = new k01(org.telegram.messenger.t0.f27013b, null);
        k01Var.b(i7);
        k01Var.f36594l = true;
        return k01Var;
    }

    public final void b(int i7) {
        int i10;
        String str;
        if (this.f36589f != i7) {
            this.f36589f = i7;
            boolean z10 = this.f36595m;
            Context context = this.f36591i;
            if (z10) {
                this.f36590g = context.getDrawable(2131232070).mutate();
            } else {
                if (i7 == 0) {
                    i10 = 2131232235;
                } else {
                    i10 = 2131232236;
                }
                Drawable mutate = context.getDrawable(i10).mutate();
                this.f36590g = mutate;
                mutate.setColorFilter(this.f36596n);
            }
            invalidateSelf();
            int i11 = this.f36589f;
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
            TextPaint textPaint = this.f36585a;
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
                this.f36587c = staticLayout;
                this.f36588e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.f36587c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z10 = this.f36595m;
        Paint paint = this.f36586b;
        int i7 = -1;
        TextPaint textPaint = this.f36585a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36592j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (!this.f36594l) {
            if (!this.f36593k) {
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, i6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, i6Var));
        }
        if (this.f36590g != null) {
            if (!this.f36594l && !this.f36595m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.f36590g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.f36595m) {
                this.f36590g.setBounds(getBounds().left, getBounds().top, this.f36590g.getIntrinsicWidth() + getBounds().left, this.f36590g.getIntrinsicHeight() + getBounds().top);
                this.f36590g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.f36590g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.f36590g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.f36590g.setBounds(rect);
                this.f36590g.draw(canvas);
            }
        }
        if (this.f36589f != 0 && this.f36587c != null) {
            if (org.telegram.messenger.g0.f24225p != 3.0f) {
                i7 = 0;
            }
            canvas.save();
            if (this.f36595m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i7), (getBounds().height() - this.f36588e) / 2.0f);
                this.f36587c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i7, (L2 - this.f36588e) / 2.0f);
                this.f36587c.draw(canvas);
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
        this.f36596n = colorFilter;
        if (this.f36594l) {
            this.f36590g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
