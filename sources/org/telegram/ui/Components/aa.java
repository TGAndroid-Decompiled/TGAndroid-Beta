package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class aa {
    public org.telegram.messenger.r5 f33301a;
    public final int f33302b;
    public final View f33303c;
    public final hi.m5 d;
    public Bitmap[] f33304e;
    public Bitmap[] f33305f;
    public Bitmap[] f33306g;
    public Canvas[] h;
    public Canvas[] f33307i;
    public Canvas[] f33308j;
    public boolean f33309k;
    public float f33311m;
    public boolean f33312n;
    public boolean f33313o;
    public int f33315q;
    public int f33316r;
    public int f33317s;
    public boolean f33318t;
    public float f33319u;
    public final Paint f33321x;
    public final org.telegram.ui.ActionBar.i6 f33322y;
    public boolean f33310l = true;
    public boolean f33314p = true;
    public z9 v = new z9(this);
    public final Paint f33320w = new Paint(2);

    public aa(View view, hi.m5 m5Var, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint();
        this.f33321x = paint;
        this.f33302b = 1;
        this.f33303c = view;
        this.d = m5Var;
        this.f33322y = i6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f33306g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f33306g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f33304e == null) {
            this.f33304e = new Bitmap[2];
            this.f33308j = new Canvas[2];
        }
        this.v.f42825a = true;
        this.v = new z9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.m5 m5Var = this.d;
            int measuredHeight = m5Var.getMeasuredHeight();
            int measuredWidth = m5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24112m;
            this.f33317s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != m5Var.getMeasuredWidth()) {
                org.telegram.messenger.r5 r5Var = this.f33301a;
                if (r5Var != null) {
                    r5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f33304e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.i6 i6Var = this.f33322y;
                if (i7 == 1) {
                    this.f33304e[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, i6Var));
                }
                this.f33308j[i7] = new Canvas(this.f33304e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f33317s;
                }
                this.f33306g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f33306g[i7]);
                this.h[i7].scale(this.f33306g[i7].getWidth() / this.f33304e[i7].getWidth(), this.f33306g[i7].getHeight() / this.f33304e[i7].getHeight());
                this.f33308j[i7].save();
                this.f33308j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f33303c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (i6Var instanceof org.telegram.ui.zm) {
                        background = ((org.telegram.ui.zm) i6Var).c();
                    } else {
                        background = org.telegram.ui.ActionBar.n6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f33308j[i7].translate(0.0f, -this.f33319u);
                    view.draw(this.f33308j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f33308j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f33308j[i7]);
                }
                view.setTag(67108867, null);
                this.f33308j[i7].restore();
                Utilities.stackBlurBitmap(this.f33304e[i7], 15);
                Paint paint = this.f33320w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f33306g[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, i6Var));
                }
                this.h[i7].drawBitmap(this.f33304e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
