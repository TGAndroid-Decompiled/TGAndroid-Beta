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
public final class ea {
    public DispatchQueue f22633a;
    public final int f22634b;
    public final View f22635c;
    public final bi.s7 d;
    public Bitmap[] e;
    public Bitmap[] f22636f;
    public Bitmap[] f22637g;
    public Canvas[] h;
    public Canvas[] f22638i;
    public Canvas[] f22639j;
    public boolean f22640k;
    public float f22642m;
    public boolean f22643n;
    public boolean f22644o;
    public int f22646q;
    public int f22647r;
    public int f22648s;
    public boolean f22649t;
    public float f22650u;
    public final Paint f22652x;
    public final org.telegram.ui.ActionBar.f6 f22653y;
    public boolean f22641l = true;
    public boolean f22645p = true;
    public da v = new da(this);
    public final Paint f22651w = new Paint(2);

    public ea(View view, bi.s7 s7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f22652x = paint;
        this.f22634b = 1;
        this.f22635c = view;
        this.d = s7Var;
        this.f22653y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f22637g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f22637g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f22639j = new Canvas[2];
        }
        this.v.f22341a = true;
        this.v = new da(this);
        for (int i10 = 0; i10 < 2; i10++) {
            bi.s7 s7Var = this.d;
            int measuredHeight = s7Var.getMeasuredHeight();
            int measuredWidth = s7Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f22648s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s7Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f22633a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f22653y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                }
                this.f22639j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f22648s;
                }
                this.f22637g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f22637g[i10]);
                this.h[i10].scale(this.f22637g[i10].getWidth() / this.e[i10].getWidth(), this.f22637g[i10].getHeight() / this.e[i10].getHeight());
                this.f22639j[i10].save();
                this.f22639j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f22635c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.bo) {
                        background = ((org.telegram.ui.bo) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f22639j[i10].translate(0.0f, -this.f22650u);
                    view.draw(this.f22639j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f22639j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f22639j[i10]);
                }
                view.setTag(67108867, null);
                this.f22639j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f22651w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f22637g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
