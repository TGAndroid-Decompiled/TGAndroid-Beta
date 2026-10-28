package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class ja {
    public DispatchQueue f29578a;
    public final int f29579b;
    public final View f29580c;
    public final fi.f6 d;
    public Bitmap[] e;
    public Bitmap[] f29581f;
    public Bitmap[] f29582g;
    public Canvas[] h;
    public Canvas[] f29583i;
    public Canvas[] f29584j;
    public boolean f29585k;
    public float f29587m;
    public boolean f29588n;
    public boolean f29589o;
    public int f29591q;
    public int f29592r;
    public int f29593s;
    public boolean f29594t;
    public float f29595u;
    public final Paint f29597x;
    public final org.telegram.ui.ActionBar.u6 f29598y;
    public boolean f29586l = true;
    public boolean f29590p = true;
    public ia v = new ia(this);
    public final Paint f29596w = new Paint(2);

    public ja(View view, fi.f6 f6Var, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint();
        this.f29597x = paint;
        this.f29579b = 1;
        this.f29580c = view;
        this.d = f6Var;
        this.f29598y = u6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f29582g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f29582g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f29584j = new Canvas[2];
        }
        this.v.f29275a = true;
        this.v = new ia(this);
        for (int i10 = 0; i10 < 2; i10++) {
            fi.f6 f6Var = this.d;
            int measuredHeight = f6Var.getMeasuredHeight();
            int measuredWidth = f6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f29593s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != f6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f29578a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.u6 u6Var = this.f29598y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var));
                }
                this.f29584j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f29593s;
                }
                this.f29582g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f29582g[i10]);
                this.h[i10].scale(this.f29582g[i10].getWidth() / this.e[i10].getWidth(), this.f29582g[i10].getHeight() / this.e[i10].getHeight());
                this.f29584j[i10].save();
                this.f29584j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f29580c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (u6Var instanceof org.telegram.ui.un) {
                        background = ((org.telegram.ui.un) u6Var).l();
                    } else {
                        background = org.telegram.ui.ActionBar.y6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f29584j[i10].translate(0.0f, -this.f29595u);
                    view.draw(this.f29584j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f29584j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f29584j[i10]);
                }
                view.setTag(67108867, null);
                this.f29584j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f29596w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f29582g[i10].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
