package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class z9 {
    public org.telegram.messenger.r5 f42757a;
    public final int f42758b;
    public final View f42759c;
    public final hi.w5 d;
    public Bitmap[] f42760e;
    public Bitmap[] f42761f;
    public Bitmap[] f42762g;
    public Canvas[] h;
    public Canvas[] f42763i;
    public Canvas[] f42764j;
    public boolean f42765k;
    public float f42767m;
    public boolean f42768n;
    public boolean f42769o;
    public int f42771q;
    public int f42772r;
    public int f42773s;
    public boolean f42774t;
    public float f42775u;
    public final Paint f42777x;
    public final org.telegram.ui.ActionBar.i6 f42778y;
    public boolean f42766l = true;
    public boolean f42770p = true;
    public y9 v = new y9(this);
    public final Paint f42776w = new Paint(2);

    public z9(View view, hi.w5 w5Var, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint();
        this.f42777x = paint;
        this.f42758b = 1;
        this.f42759c = view;
        this.d = w5Var;
        this.f42778y = i6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f42762g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f42762g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f42760e == null) {
            this.f42760e = new Bitmap[2];
            this.f42764j = new Canvas[2];
        }
        this.v.f42380a = true;
        this.v = new y9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.w5 w5Var = this.d;
            int measuredHeight = w5Var.getMeasuredHeight();
            int measuredWidth = w5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24220m;
            this.f42773s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != w5Var.getMeasuredWidth()) {
                org.telegram.messenger.r5 r5Var = this.f42757a;
                if (r5Var != null) {
                    r5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f42760e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.i6 i6Var = this.f42778y;
                if (i7 == 1) {
                    this.f42760e[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var));
                }
                this.f42764j[i7] = new Canvas(this.f42760e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f42773s;
                }
                this.f42762g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f42762g[i7]);
                this.h[i7].scale(this.f42762g[i7].getWidth() / this.f42760e[i7].getWidth(), this.f42762g[i7].getHeight() / this.f42760e[i7].getHeight());
                this.f42764j[i7].save();
                this.f42764j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f42759c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (i6Var instanceof org.telegram.ui.zm) {
                        background = ((org.telegram.ui.zm) i6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.n6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f42764j[i7].translate(0.0f, -this.f42775u);
                    view.draw(this.f42764j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f42764j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f42764j[i7]);
                }
                view.setTag(67108867, null);
                this.f42764j[i7].restore();
                Utilities.stackBlurBitmap(this.f42760e[i7], 15);
                Paint paint = this.f42776w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f42762g[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var));
                }
                this.h[i7].drawBitmap(this.f42760e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
