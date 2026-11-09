package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class w9 {
    public org.telegram.messenger.q5 f39995a;
    public final int f39996b;
    public final View f39997c;
    public final fi.p5 d;
    public Bitmap[] f39998e;
    public Bitmap[] f39999f;
    public Bitmap[] f40000g;
    public Canvas[] h;
    public Canvas[] f40001i;
    public Canvas[] f40002j;
    public boolean f40003k;
    public float f40005m;
    public boolean f40006n;
    public boolean f40007o;
    public int f40009q;
    public int f40010r;
    public int f40011s;
    public boolean f40012t;
    public float f40013u;
    public final Paint f40015x;
    public final org.telegram.ui.ActionBar.g6 f40016y;
    public boolean f40004l = true;
    public boolean f40008p = true;
    public v9 v = new v9(this);
    public final Paint f40014w = new Paint(2);

    public w9(View view, fi.p5 p5Var, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint();
        this.f40015x = paint;
        this.f39996b = 1;
        this.f39997c = view;
        this.d = p5Var;
        this.f40016y = g6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f40000g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f40000g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f39998e == null) {
            this.f39998e = new Bitmap[2];
            this.f40002j = new Canvas[2];
        }
        this.v.f39014a = true;
        this.v = new v9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            fi.p5 p5Var = this.d;
            int measuredHeight = p5Var.getMeasuredHeight();
            int measuredWidth = p5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22557m;
            this.f40011s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != p5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.f39995a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f39998e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.g6 g6Var = this.f40016y;
                if (i7 == 1) {
                    this.f39998e[i7].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var));
                }
                this.f40002j[i7] = new Canvas(this.f39998e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f40011s;
                }
                this.f40000g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f40000g[i7]);
                this.h[i7].scale(this.f40000g[i7].getWidth() / this.f39998e[i7].getWidth(), this.f40000g[i7].getHeight() / this.f39998e[i7].getHeight());
                this.f40002j[i7].save();
                this.f40002j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f39997c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (g6Var instanceof org.telegram.ui.an) {
                        background = ((org.telegram.ui.an) g6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.l6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f40002j[i7].translate(0.0f, -this.f40013u);
                    view.draw(this.f40002j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f40002j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f40002j[i7]);
                }
                view.setTag(67108867, null);
                this.f40002j[i7].restore();
                Utilities.stackBlurBitmap(this.f39998e[i7], 15);
                Paint paint = this.f40014w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f40000g[i7].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var));
                }
                this.h[i7].drawBitmap(this.f39998e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
