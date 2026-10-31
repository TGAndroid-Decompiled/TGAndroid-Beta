package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class q9 {
    public org.telegram.messenger.s5 f29600a;
    public final int f29601b;
    public final View f29602c;
    public final kg.f0 d;
    public Bitmap[] e;
    public Bitmap[] f29603f;
    public Bitmap[] f29604g;
    public Canvas[] h;
    public Canvas[] f29605i;
    public Canvas[] f29606j;
    public boolean f29607k;
    public float f29609m;
    public boolean f29610n;
    public boolean f29611o;
    public int f29613q;
    public int f29614r;
    public int f29615s;
    public boolean f29616t;
    public float f29617u;
    public final Paint f29619x;
    public final org.telegram.ui.ActionBar.p6 f29620y;
    public boolean f29608l = true;
    public boolean f29612p = true;
    public p9 v = new p9(this);
    public final Paint f29618w = new Paint(2);

    public q9(View view, kg.f0 f0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint();
        this.f29619x = paint;
        this.f29601b = 1;
        this.f29602c = view;
        this.d = f0Var;
        this.f29620y = p6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f29604g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f29604g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f29606j = new Canvas[2];
        }
        this.v.f29320a = true;
        this.v = new p9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            kg.f0 f0Var = this.d;
            int measuredHeight = f0Var.getMeasuredHeight();
            int measuredWidth = f0Var.getMeasuredWidth();
            int L = org.telegram.messenger.i0.L(200.0f) + org.telegram.messenger.i0.f16020m;
            this.f29615s = L;
            if (i10 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i10].getWidth() != f0Var.getMeasuredWidth()) {
                org.telegram.messenger.s5 s5Var = this.f29600a;
                if (s5Var != null) {
                    s5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.p6 p6Var = this.f29620y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var));
                }
                this.f29606j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f29615s;
                }
                this.f29604g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f29604g[i10]);
                this.h[i10].scale(this.f29604g[i10].getWidth() / this.e[i10].getWidth(), this.f29604g[i10].getHeight() / this.e[i10].getHeight());
                this.f29606j[i10].save();
                this.f29606j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f29602c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (p6Var instanceof org.telegram.ui.sn) {
                        background = ((org.telegram.ui.sn) p6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.t6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f29606j[i10].translate(0.0f, -this.f29617u);
                    view.draw(this.f29606j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f29606j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f29606j[i10]);
                }
                view.setTag(67108867, null);
                this.f29606j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f29618w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f29604g[i10].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
