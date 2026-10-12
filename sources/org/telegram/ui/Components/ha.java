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
    public DispatchQueue f26706a;
    public final int f26707b;
    public final View f26708c;
    public final ci.r6 d;
    public Bitmap[] f26709e;
    public Bitmap[] f26710f;
    public Bitmap[] f26711g;
    public Canvas[] h;
    public Canvas[] f26712i;
    public Canvas[] f26713j;
    public boolean f26714k;
    public float f26716m;
    public boolean f26717n;
    public boolean f26718o;
    public int f26720q;
    public int f26721r;
    public int f26722s;
    public boolean f26723t;
    public float f26724u;
    public final Paint f26726x;
    public final org.telegram.ui.ActionBar.c6 f26727y;
    public boolean f26715l = true;
    public boolean f26719p = true;
    public ga v = new ga(this);
    public final Paint f26725w = new Paint(2);

    public ha(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint();
        this.f26726x = paint;
        this.f26707b = 1;
        this.f26708c = view;
        this.d = r6Var;
        this.f26727y = c6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26711g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26711g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26709e == null) {
            this.f26709e = new Bitmap[2];
            this.f26713j = new Canvas[2];
        }
        this.v.f26377a = true;
        this.v = new ga(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26722s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26706a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26709e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.c6 c6Var = this.f26727y;
                if (i10 == 1) {
                    this.f26709e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var));
                }
                this.f26713j[i10] = new Canvas(this.f26709e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26722s;
                }
                this.f26711g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26711g[i10]);
                this.h[i10].scale(this.f26711g[i10].getWidth() / this.f26709e[i10].getWidth(), this.f26711g[i10].getHeight() / this.f26709e[i10].getHeight());
                this.f26713j[i10].save();
                this.f26713j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26708c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (c6Var instanceof org.telegram.ui.bo) {
                        background = ((org.telegram.ui.bo) c6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26713j[i10].translate(0.0f, -this.f26724u);
                    view.draw(this.f26713j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26713j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26713j[i10]);
                }
                view.setTag(67108867, null);
                this.f26713j[i10].restore();
                Utilities.stackBlurBitmap(this.f26709e[i10], 15);
                Paint paint = this.f26725w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26711g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var));
                }
                this.h[i10].drawBitmap(this.f26709e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
