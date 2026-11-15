package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class s9 {
    public org.telegram.messenger.q5 f39239a;
    public final int f39240b;
    public final View f39241c;
    public final hi.n5 d;
    public Bitmap[] f39242e;
    public Bitmap[] f39243f;
    public Bitmap[] f39244g;
    public Canvas[] h;
    public Canvas[] f39245i;
    public Canvas[] f39246j;
    public boolean f39247k;
    public float f39249m;
    public boolean f39250n;
    public boolean f39251o;
    public int f39253q;
    public int f39254r;
    public int f39255s;
    public boolean f39256t;
    public float f39257u;
    public final Paint f39259x;
    public final org.telegram.ui.ActionBar.e6 f39260y;
    public boolean f39248l = true;
    public boolean f39252p = true;
    public r9 v = new r9(this);
    public final Paint f39258w = new Paint(2);

    public s9(View view, hi.n5 n5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f39259x = paint;
        this.f39240b = 1;
        this.f39241c = view;
        this.d = n5Var;
        this.f39260y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f39244g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f39244g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f39242e == null) {
            this.f39242e = new Bitmap[2];
            this.f39246j = new Canvas[2];
        }
        this.v.f38904a = true;
        this.v = new r9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.n5 n5Var = this.d;
            int measuredHeight = n5Var.getMeasuredHeight();
            int measuredWidth = n5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f23603m;
            this.f39255s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != n5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.f39239a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f39242e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f39260y;
                if (i7 == 1) {
                    this.f39242e[i7].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
                }
                this.f39246j[i7] = new Canvas(this.f39242e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f39255s;
                }
                this.f39244g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f39244g[i7]);
                this.h[i7].scale(this.f39244g[i7].getWidth() / this.f39242e[i7].getWidth(), this.f39244g[i7].getHeight() / this.f39242e[i7].getHeight());
                this.f39246j[i7].save();
                this.f39246j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f39241c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (e6Var instanceof org.telegram.ui.ym) {
                        background = ((org.telegram.ui.ym) e6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f39246j[i7].translate(0.0f, -this.f39257u);
                    view.draw(this.f39246j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f39246j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f39246j[i7]);
                }
                view.setTag(67108867, null);
                this.f39246j[i7].restore();
                Utilities.stackBlurBitmap(this.f39242e[i7], 15);
                Paint paint = this.f39258w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f39244g[i7].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
                }
                this.h[i7].drawBitmap(this.f39242e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
