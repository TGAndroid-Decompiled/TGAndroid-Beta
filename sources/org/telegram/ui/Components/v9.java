package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class v9 {
    public org.telegram.messenger.q5 f38946a;
    public final int f38947b;
    public final View f38948c;
    public final fi.p5 d;
    public Bitmap[] f38949e;
    public Bitmap[] f38950f;
    public Bitmap[] f38951g;
    public Canvas[] h;
    public Canvas[] f38952i;
    public Canvas[] f38953j;
    public boolean f38954k;
    public float f38956m;
    public boolean f38957n;
    public boolean f38958o;
    public int f38960q;
    public int f38961r;
    public int f38962s;
    public boolean f38963t;
    public float f38964u;
    public final Paint f38966x;
    public final org.telegram.ui.ActionBar.h6 f38967y;
    public boolean f38955l = true;
    public boolean f38959p = true;
    public u9 v = new u9(this);
    public final Paint f38965w = new Paint(2);

    public v9(View view, fi.p5 p5Var, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint();
        this.f38966x = paint;
        this.f38947b = 1;
        this.f38948c = view;
        this.d = p5Var;
        this.f38967y = h6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f38951g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f38951g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f38949e == null) {
            this.f38949e = new Bitmap[2];
            this.f38953j = new Canvas[2];
        }
        this.v.f38599a = true;
        this.v = new u9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            fi.p5 p5Var = this.d;
            int measuredHeight = p5Var.getMeasuredHeight();
            int measuredWidth = p5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22561m;
            this.f38962s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != p5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.f38946a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f38949e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.h6 h6Var = this.f38967y;
                if (i7 == 1) {
                    this.f38949e[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var));
                }
                this.f38953j[i7] = new Canvas(this.f38949e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f38962s;
                }
                this.f38951g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f38951g[i7]);
                this.h[i7].scale(this.f38951g[i7].getWidth() / this.f38949e[i7].getWidth(), this.f38951g[i7].getHeight() / this.f38949e[i7].getHeight());
                this.f38953j[i7].save();
                this.f38953j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f38948c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (h6Var instanceof org.telegram.ui.an) {
                        background = ((org.telegram.ui.an) h6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.m6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f38953j[i7].translate(0.0f, -this.f38964u);
                    view.draw(this.f38953j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f38953j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f38953j[i7]);
                }
                view.setTag(67108867, null);
                this.f38953j[i7].restore();
                Utilities.stackBlurBitmap(this.f38949e[i7], 15);
                Paint paint = this.f38965w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f38951g[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var));
                }
                this.h[i7].drawBitmap(this.f38949e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
