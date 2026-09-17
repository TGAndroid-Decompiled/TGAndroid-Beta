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
public final class fa {
    public DispatchQueue f25982a;
    public final int f25983b;
    public final View f25984c;
    public final di.r6 d;
    public Bitmap[] f25985e;
    public Bitmap[] f25986f;
    public Bitmap[] f25987g;
    public Canvas[] h;
    public Canvas[] f25988i;
    public Canvas[] f25989j;
    public boolean f25990k;
    public float f25992m;
    public boolean f25993n;
    public boolean f25994o;
    public int f25996q;
    public int f25997r;
    public int f25998s;
    public boolean f25999t;
    public float f26000u;
    public final Paint f26002x;
    public final org.telegram.ui.ActionBar.f6 f26003y;
    public boolean f25991l = true;
    public boolean f25995p = true;
    public ea v = new ea(this);
    public final Paint f26001w = new Paint(2);

    public fa(View view, di.r6 r6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f26002x = paint;
        this.f25983b = 1;
        this.f25984c = view;
        this.d = r6Var;
        this.f26003y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f25987g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f25987g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f25985e == null) {
            this.f25985e = new Bitmap[2];
            this.f25989j = new Canvas[2];
        }
        this.v.f25634a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            di.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f25998s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f25982a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f25985e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f26003y;
                if (i10 == 1) {
                    this.f25985e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, f6Var));
                }
                this.f25989j[i10] = new Canvas(this.f25985e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f25998s;
                }
                this.f25987g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f25987g[i10]);
                this.h[i10].scale(this.f25987g[i10].getWidth() / this.f25985e[i10].getWidth(), this.f25987g[i10].getHeight() / this.f25985e[i10].getHeight());
                this.f25989j[i10].save();
                this.f25989j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f25984c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.ao) {
                        background = ((org.telegram.ui.ao) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f25989j[i10].translate(0.0f, -this.f26000u);
                    view.draw(this.f25989j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f25989j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f25989j[i10]);
                }
                view.setTag(67108867, null);
                this.f25989j[i10].restore();
                Utilities.stackBlurBitmap(this.f25985e[i10], 15);
                Paint paint = this.f26001w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f25987g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, f6Var));
                }
                this.h[i10].drawBitmap(this.f25985e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
