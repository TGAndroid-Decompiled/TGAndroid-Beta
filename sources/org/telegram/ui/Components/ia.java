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
public final class ia {
    public DispatchQueue f27298a;
    public final int f27299b;
    public final View f27300c;
    public final ci.r6 d;
    public Bitmap[] f27301e;
    public Bitmap[] f27302f;
    public Bitmap[] f27303g;
    public Canvas[] h;
    public Canvas[] f27304i;
    public Canvas[] f27305j;
    public boolean f27306k;
    public float f27308m;
    public boolean f27309n;
    public boolean f27310o;
    public int f27312q;
    public int f27313r;
    public int f27314s;
    public boolean f27315t;
    public float f27316u;
    public final Paint f27318x;
    public final org.telegram.ui.ActionBar.e6 f27319y;
    public boolean f27307l = true;
    public boolean f27311p = true;
    public ha v = new ha(this);
    public final Paint f27317w = new Paint(2);

    public ia(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f27318x = paint;
        this.f27299b = 1;
        this.f27300c = view;
        this.d = r6Var;
        this.f27319y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f27303g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f27303g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f27301e == null) {
            this.f27301e = new Bitmap[2];
            this.f27305j = new Canvas[2];
        }
        this.v.f26995a = true;
        this.v = new ha(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f27314s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f27298a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f27301e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f27319y;
                if (i10 == 1) {
                    this.f27301e[i10].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                }
                this.f27305j[i10] = new Canvas(this.f27301e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f27314s;
                }
                this.f27303g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f27303g[i10]);
                this.h[i10].scale(this.f27303g[i10].getWidth() / this.f27301e[i10].getWidth(), this.f27303g[i10].getHeight() / this.f27301e[i10].getHeight());
                this.f27305j[i10].save();
                this.f27305j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f27300c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (e6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) e6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.i6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f27305j[i10].translate(0.0f, -this.f27316u);
                    view.draw(this.f27305j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f27305j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f27305j[i10]);
                }
                view.setTag(67108867, null);
                this.f27305j[i10].restore();
                Utilities.stackBlurBitmap(this.f27301e[i10], 15);
                Paint paint = this.f27317w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f27303g[i10].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                }
                this.h[i10].drawBitmap(this.f27301e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
