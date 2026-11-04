package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class v9 {
    public org.telegram.messenger.q5 f39033a;
    public final int f39034b;
    public final View f39035c;
    public final gi.n5 d;
    public Bitmap[] f39036e;
    public Bitmap[] f39037f;
    public Bitmap[] f39038g;
    public Canvas[] h;
    public Canvas[] f39039i;
    public Canvas[] f39040j;
    public boolean f39041k;
    public float f39043m;
    public boolean f39044n;
    public boolean f39045o;
    public int f39047q;
    public int f39048r;
    public int f39049s;
    public boolean f39050t;
    public float f39051u;
    public final Paint f39053x;
    public final org.telegram.ui.ActionBar.e6 f39054y;
    public boolean f39042l = true;
    public boolean f39046p = true;
    public u9 v = new u9(this);
    public final Paint f39052w = new Paint(2);

    public v9(View view, gi.n5 n5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f39053x = paint;
        this.f39034b = 1;
        this.f39035c = view;
        this.d = n5Var;
        this.f39054y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f39038g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f39038g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f39036e == null) {
            this.f39036e = new Bitmap[2];
            this.f39040j = new Canvas[2];
        }
        this.v.f38701a = true;
        this.v = new u9(this);
        for (int i3 = 0; i3 < 2; i3++) {
            gi.n5 n5Var = this.d;
            int measuredHeight = n5Var.getMeasuredHeight();
            int measuredWidth = n5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22602m;
            this.f39049s = L;
            if (i3 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i3];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i3].getWidth() != n5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.f39033a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f39036e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i3] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f39054y;
                if (i3 == 1) {
                    this.f39036e[i3].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
                }
                this.f39040j[i3] = new Canvas(this.f39036e[i3]);
                if (i3 == 0) {
                    measuredHeight = this.f39049s;
                }
                this.f39038g[i3] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i3] = new Canvas(this.f39038g[i3]);
                this.h[i3].scale(this.f39038g[i3].getWidth() / this.f39036e[i3].getWidth(), this.f39038g[i3].getHeight() / this.f39036e[i3].getHeight());
                this.f39040j[i3].save();
                this.f39040j[i3].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f39035c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (e6Var instanceof org.telegram.ui.um) {
                        background = ((org.telegram.ui.um) e6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.k6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i3));
                if (i3 == 0) {
                    this.f39040j[i3].translate(0.0f, -this.f39051u);
                    view.draw(this.f39040j[i3]);
                }
                if (i3 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f39040j[i3]);
                    background.setBounds(bounds);
                    view.draw(this.f39040j[i3]);
                }
                view.setTag(67108867, null);
                this.f39040j[i3].restore();
                Utilities.stackBlurBitmap(this.f39036e[i3], 15);
                Paint paint = this.f39052w;
                paint.setAlpha(255);
                if (i3 == 1) {
                    this.f39038g[i3].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
                }
                this.h[i3].drawBitmap(this.f39036e[i3], 0.0f, 0.0f, paint);
            }
        }
    }
}
