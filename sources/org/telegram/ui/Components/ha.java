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
public final class ha {
    public DispatchQueue f27002a;
    public final int f27003b;
    public final View f27004c;
    public final ci.r6 d;
    public Bitmap[] f27005e;
    public Bitmap[] f27006f;
    public Bitmap[] f27007g;
    public Canvas[] h;
    public Canvas[] f27008i;
    public Canvas[] f27009j;
    public boolean f27010k;
    public float f27012m;
    public boolean f27013n;
    public boolean f27014o;
    public int f27016q;
    public int f27017r;
    public int f27018s;
    public boolean f27019t;
    public float f27020u;
    public final Paint f27022x;
    public final org.telegram.ui.ActionBar.d6 f27023y;
    public boolean f27011l = true;
    public boolean f27015p = true;
    public ga v = new ga(this);
    public final Paint f27021w = new Paint(2);

    public ha(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f27022x = paint;
        this.f27003b = 1;
        this.f27004c = view;
        this.d = r6Var;
        this.f27023y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f27007g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f27007g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f27005e == null) {
            this.f27005e = new Bitmap[2];
            this.f27009j = new Canvas[2];
        }
        this.v.f26702a = true;
        this.v = new ga(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f27018s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f27002a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f27005e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f27023y;
                if (i10 == 1) {
                    this.f27005e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, d6Var));
                }
                this.f27009j[i10] = new Canvas(this.f27005e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f27018s;
                }
                this.f27007g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f27007g[i10]);
                this.h[i10].scale(this.f27007g[i10].getWidth() / this.f27005e[i10].getWidth(), this.f27007g[i10].getHeight() / this.f27005e[i10].getHeight());
                this.f27009j[i10].save();
                this.f27009j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f27004c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) d6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f27009j[i10].translate(0.0f, -this.f27020u);
                    view.draw(this.f27009j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f27009j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f27009j[i10]);
                }
                view.setTag(67108867, null);
                this.f27009j[i10].restore();
                Utilities.stackBlurBitmap(this.f27005e[i10], 15);
                Paint paint = this.f27021w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f27007g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, d6Var));
                }
                this.h[i10].drawBitmap(this.f27005e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
