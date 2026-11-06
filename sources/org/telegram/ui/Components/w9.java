package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class w9 {
    public org.telegram.messenger.q5 f39915a;
    public final int f39916b;
    public final View f39917c;
    public final fi.p5 d;
    public Bitmap[] f39918e;
    public Bitmap[] f39919f;
    public Bitmap[] f39920g;
    public Canvas[] h;
    public Canvas[] f39921i;
    public Canvas[] f39922j;
    public boolean f39923k;
    public float f39925m;
    public boolean f39926n;
    public boolean f39927o;
    public int f39929q;
    public int f39930r;
    public int f39931s;
    public boolean f39932t;
    public float f39933u;
    public final Paint f39935x;
    public final org.telegram.ui.ActionBar.f6 f39936y;
    public boolean f39924l = true;
    public boolean f39928p = true;
    public v9 v = new v9(this);
    public final Paint f39934w = new Paint(2);

    public w9(View view, fi.p5 p5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f39935x = paint;
        this.f39916b = 1;
        this.f39917c = view;
        this.d = p5Var;
        this.f39936y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f39920g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f39920g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f39918e == null) {
            this.f39918e = new Bitmap[2];
            this.f39922j = new Canvas[2];
        }
        this.v.f38897a = true;
        this.v = new v9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            fi.p5 p5Var = this.d;
            int measuredHeight = p5Var.getMeasuredHeight();
            int measuredWidth = p5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22531m;
            this.f39931s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != p5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.f39915a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f39918e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f39936y;
                if (i7 == 1) {
                    this.f39918e[i7].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var));
                }
                this.f39922j[i7] = new Canvas(this.f39918e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f39931s;
                }
                this.f39920g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f39920g[i7]);
                this.h[i7].scale(this.f39920g[i7].getWidth() / this.f39918e[i7].getWidth(), this.f39920g[i7].getHeight() / this.f39918e[i7].getHeight());
                this.f39922j[i7].save();
                this.f39922j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f39917c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.ym) {
                        background = ((org.telegram.ui.ym) f6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.k6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f39922j[i7].translate(0.0f, -this.f39933u);
                    view.draw(this.f39922j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f39922j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f39922j[i7]);
                }
                view.setTag(67108867, null);
                this.f39922j[i7].restore();
                Utilities.stackBlurBitmap(this.f39918e[i7], 15);
                Paint paint = this.f39934w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f39920g[i7].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var));
                }
                this.h[i7].drawBitmap(this.f39918e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
