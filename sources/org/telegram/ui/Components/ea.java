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
    public DispatchQueue f23891a;
    public final int f23892b;
    public final View f23893c;
    public final ci.s6 d;
    public Bitmap[] e;
    public Bitmap[] f23894f;
    public Bitmap[] f23895g;
    public Canvas[] h;
    public Canvas[] f23896i;
    public Canvas[] f23897j;
    public boolean f23898k;
    public float f23900m;
    public boolean f23901n;
    public boolean f23902o;
    public int f23904q;
    public int f23905r;
    public int f23906s;
    public boolean f23907t;
    public float f23908u;
    public final Paint f23910x;
    public final org.telegram.ui.ActionBar.f6 f23911y;
    public boolean f23899l = true;
    public boolean f23903p = true;
    public da v = new da(this);
    public final Paint f23909w = new Paint(2);

    public ea(View view, ci.s6 s6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f23910x = paint;
        this.f23892b = 1;
        this.f23893c = view;
        this.d = s6Var;
        this.f23911y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f23895g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f23895g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f23897j = new Canvas[2];
        }
        this.v.f23618a = true;
        this.v = new da(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.s6 s6Var = this.d;
            int measuredHeight = s6Var.getMeasuredHeight();
            int measuredWidth = s6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f23906s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f23891a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f23911y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var));
                }
                this.f23897j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f23906s;
                }
                this.f23895g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f23895g[i10]);
                this.h[i10].scale(this.f23895g[i10].getWidth() / this.e[i10].getWidth(), this.f23895g[i10].getHeight() / this.e[i10].getHeight());
                this.f23897j[i10].save();
                this.f23897j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f23893c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f23897j[i10].translate(0.0f, -this.f23908u);
                    view.draw(this.f23897j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f23897j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f23897j[i10]);
                }
                view.setTag(67108867, null);
                this.f23897j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f23909w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f23895g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
