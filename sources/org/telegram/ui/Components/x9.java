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
public final class x9 {
    public DispatchQueue f32978a;
    public final int f32979b;
    public final View f32980c;
    public final fg.i0 d;
    public Bitmap[] f32981e;
    public Bitmap[] f32982f;
    public Bitmap[] f32983g;
    public Canvas[] h;
    public Canvas[] f32984i;
    public Canvas[] f32985j;
    public boolean f32986k;
    public float f32988m;
    public boolean f32989n;
    public boolean f32990o;
    public int f32992q;
    public int f32993r;
    public int f32994s;
    public boolean f32995t;
    public float f32996u;
    public final Paint f32998x;
    public final org.telegram.ui.ActionBar.g6 f32999y;
    public boolean f32987l = true;
    public boolean f32991p = true;
    public w9 v = new w9(this);
    public final Paint f32997w = new Paint(2);

    public x9(View view, fg.i0 i0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint();
        this.f32998x = paint;
        this.f32979b = 1;
        this.f32980c = view;
        this.d = i0Var;
        this.f32999y = g6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f32983g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f32983g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f32981e == null) {
            this.f32981e = new Bitmap[2];
            this.f32985j = new Canvas[2];
        }
        this.v.f32684a = true;
        this.v = new w9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            fg.i0 i0Var = this.d;
            int measuredHeight = i0Var.getMeasuredHeight();
            int measuredWidth = i0Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f32994s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != i0Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f32978a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f32981e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.g6 g6Var = this.f32999y;
                if (i10 == 1) {
                    this.f32981e[i10].eraseColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var));
                }
                this.f32985j[i10] = new Canvas(this.f32981e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f32994s;
                }
                this.f32983g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f32983g[i10]);
                this.h[i10].scale(this.f32983g[i10].getWidth() / this.f32981e[i10].getWidth(), this.f32983g[i10].getHeight() / this.f32981e[i10].getHeight());
                this.f32985j[i10].save();
                this.f32985j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f32980c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (g6Var instanceof org.telegram.ui.vn) {
                        background = ((org.telegram.ui.vn) g6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.k6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f32985j[i10].translate(0.0f, -this.f32996u);
                    view.draw(this.f32985j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f32985j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f32985j[i10]);
                }
                view.setTag(67108867, null);
                this.f32985j[i10].restore();
                Utilities.stackBlurBitmap(this.f32981e[i10], 15);
                Paint paint = this.f32997w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f32983g[i10].eraseColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var));
                }
                this.h[i10].drawBitmap(this.f32981e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
