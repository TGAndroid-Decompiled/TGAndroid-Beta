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
public final class ca {
    public DispatchQueue f27403a;
    public final int f27404b;
    public final View f27405c;
    public final cg.i0 d;
    public Bitmap[] f27406e;
    public Bitmap[] f27407f;
    public Bitmap[] f27408g;
    public Canvas[] h;
    public Canvas[] f27409i;
    public Canvas[] f27410j;
    public boolean f27411k;
    public float f27413m;
    public boolean f27414n;
    public boolean f27415o;
    public int f27417q;
    public int f27418r;
    public int f27419s;
    public boolean f27420t;
    public float f27421u;
    public final Paint f27423x;
    public final org.telegram.ui.ActionBar.c6 f27424y;
    public boolean f27412l = true;
    public boolean f27416p = true;
    public ba v = new ba(this);
    public final Paint f27422w = new Paint(2);

    public ca(View view, cg.i0 i0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint();
        this.f27423x = paint;
        this.f27404b = 1;
        this.f27405c = view;
        this.d = i0Var;
        this.f27424y = c6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f27408g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f27408g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f27406e == null) {
            this.f27406e = new Bitmap[2];
            this.f27410j = new Canvas[2];
        }
        this.v.f27014a = true;
        this.v = new ba(this);
        for (int i10 = 0; i10 < 2; i10++) {
            cg.i0 i0Var = this.d;
            int measuredHeight = i0Var.getMeasuredHeight();
            int measuredWidth = i0Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f27419s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != i0Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f27403a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f27406e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.c6 c6Var = this.f27424y;
                if (i10 == 1) {
                    this.f27406e[i10].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                }
                this.f27410j[i10] = new Canvas(this.f27406e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f27419s;
                }
                this.f27408g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f27408g[i10]);
                this.h[i10].scale(this.f27408g[i10].getWidth() / this.f27406e[i10].getWidth(), this.f27408g[i10].getHeight() / this.f27406e[i10].getHeight());
                this.f27410j[i10].save();
                this.f27410j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f27405c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (c6Var instanceof org.telegram.ui.rn) {
                        background = ((org.telegram.ui.rn) c6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.g6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f27410j[i10].translate(0.0f, -this.f27421u);
                    view.draw(this.f27410j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f27410j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f27410j[i10]);
                }
                view.setTag(67108867, null);
                this.f27410j[i10].restore();
                Utilities.stackBlurBitmap(this.f27406e[i10], 15);
                Paint paint = this.f27422w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f27408g[i10].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                }
                this.h[i10].drawBitmap(this.f27406e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
