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

public final class v9 {

    public DispatchQueue f33314a;

    public final int f33315b;

    public final View f33316c;
    public final ag.t0 d;

    public Bitmap[] f33317e;

    public Bitmap[] f33318f;

    public Bitmap[] f33319g;
    public Canvas[] h;

    public Canvas[] f33320i;

    public Canvas[] f33321j;

    public boolean f33322k;

    public float f33324m;

    public boolean f33325n;

    public boolean f33326o;

    public int f33328q;

    public int f33329r;

    public int f33330s;

    public boolean f33331t;

    public float f33332u;

    public final Paint f33334x;

    public final org.telegram.ui.ActionBar.c6 f33335y;

    public boolean f33323l = true;

    public boolean f33327p = true;
    public u9 v = new u9(this);

    public final Paint f33333w = new Paint(2);

    public v9(View view, ag.t0 t0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint();
        this.f33334x = paint;
        this.f33315b = 1;
        this.f33316c = view;
        this.d = t0Var;
        this.f33335y = c6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f33319g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f33319g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f33317e == null) {
            this.f33317e = new Bitmap[2];
            this.f33321j = new Canvas[2];
        }
        this.v.f33019a = true;
        this.v = new u9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ag.t0 t0Var = this.d;
            int measuredHeight = t0Var.getMeasuredHeight();
            int measuredWidth = t0Var.getMeasuredWidth();
            int iDp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f33330s = iDp;
            if (i10 != 0) {
                iDp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != iDp || bitmapArr[i10].getWidth() != t0Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f33314a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f33317e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (iDp / 15.0f), config);
                org.telegram.ui.ActionBar.c6 c6Var = this.f33335y;
                if (i10 == 1) {
                    this.f33317e[i10].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                }
                this.f33321j[i10] = new Canvas(this.f33317e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f33330s;
                }
                this.f33319g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f33319g[i10]);
                this.h[i10].scale(this.f33319g[i10].getWidth() / this.f33317e[i10].getWidth(), this.f33319g[i10].getHeight() / this.f33317e[i10].getHeight());
                this.f33321j[i10].save();
                this.f33321j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f33316c;
                Drawable background = view.getBackground();
                if (background == null) {
                    background = c6Var instanceof org.telegram.ui.pn ? ((org.telegram.ui.pn) c6Var).d() : org.telegram.ui.ActionBar.g6.s0();
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f33321j[i10].translate(0.0f, -this.f33332u);
                    view.draw(this.f33321j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f33321j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f33321j[i10]);
                }
                view.setTag(67108867, null);
                this.f33321j[i10].restore();
                Utilities.stackBlurBitmap(this.f33317e[i10], 15);
                Paint paint = this.f33333w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f33319g[i10].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                }
                this.h[i10].drawBitmap(this.f33317e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
