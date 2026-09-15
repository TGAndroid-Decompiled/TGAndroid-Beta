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
public final class da {
    public DispatchQueue f23258a;
    public final int f23259b;
    public final View f23260c;
    public final ci.s6 d;
    public Bitmap[] e;
    public Bitmap[] f23261f;
    public Bitmap[] f23262g;
    public Canvas[] h;
    public Canvas[] f23263i;
    public Canvas[] f23264j;
    public boolean f23265k;
    public float f23267m;
    public boolean f23268n;
    public boolean f23269o;
    public int f23271q;
    public int f23272r;
    public int f23273s;
    public boolean f23274t;
    public float f23275u;
    public final Paint f23277x;
    public final org.telegram.ui.ActionBar.e6 f23278y;
    public boolean f23266l = true;
    public boolean f23270p = true;
    public ca v = new ca(this);
    public final Paint f23276w = new Paint(2);

    public da(View view, ci.s6 s6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f23277x = paint;
        this.f23259b = 1;
        this.f23260c = view;
        this.d = s6Var;
        this.f23278y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f23262g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f23262g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f23264j = new Canvas[2];
        }
        this.v.f23038a = true;
        this.v = new ca(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.s6 s6Var = this.d;
            int measuredHeight = s6Var.getMeasuredHeight();
            int measuredWidth = s6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f23273s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f23258a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f23278y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var));
                }
                this.f23264j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f23273s;
                }
                this.f23262g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f23262g[i10]);
                this.h[i10].scale(this.f23262g[i10].getWidth() / this.e[i10].getWidth(), this.f23262g[i10].getHeight() / this.e[i10].getHeight());
                this.f23264j[i10].save();
                this.f23264j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f23260c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (e6Var instanceof org.telegram.ui.zn) {
                        background = ((org.telegram.ui.zn) e6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.i6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f23264j[i10].translate(0.0f, -this.f23275u);
                    view.draw(this.f23264j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f23264j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f23264j[i10]);
                }
                view.setTag(67108867, null);
                this.f23264j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f23276w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f23262g[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
