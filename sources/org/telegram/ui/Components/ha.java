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
    public DispatchQueue f25226a;
    public final int f25227b;
    public final View f25228c;
    public final di.p6 d;
    public Bitmap[] e;
    public Bitmap[] f25229f;
    public Bitmap[] f25230g;
    public Canvas[] h;
    public Canvas[] f25231i;
    public Canvas[] f25232j;
    public boolean f25233k;
    public float f25235m;
    public boolean f25236n;
    public boolean f25237o;
    public int f25239q;
    public int f25240r;
    public int f25241s;
    public boolean f25242t;
    public float f25243u;
    public final Paint f25245x;
    public final org.telegram.ui.ActionBar.c6 f25246y;
    public boolean f25234l = true;
    public boolean f25238p = true;
    public ga v = new ga(this);
    public final Paint f25244w = new Paint(2);

    public ha(View view, di.p6 p6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint();
        this.f25245x = paint;
        this.f25227b = 1;
        this.f25228c = view;
        this.d = p6Var;
        this.f25246y = c6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f25230g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f25230g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f25232j = new Canvas[2];
        }
        this.v.f24933a = true;
        this.v = new ga(this);
        for (int i10 = 0; i10 < 2; i10++) {
            di.p6 p6Var = this.d;
            int measuredHeight = p6Var.getMeasuredHeight();
            int measuredWidth = p6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f25241s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != p6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f25226a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.c6 c6Var = this.f25246y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
                }
                this.f25232j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f25241s;
                }
                this.f25230g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f25230g[i10]);
                this.h[i10].scale(this.f25230g[i10].getWidth() / this.e[i10].getWidth(), this.f25230g[i10].getHeight() / this.e[i10].getHeight());
                this.f25232j[i10].save();
                this.f25232j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f25228c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (c6Var instanceof org.telegram.ui.co) {
                        background = ((org.telegram.ui.co) c6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.g6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f25232j[i10].translate(0.0f, -this.f25243u);
                    view.draw(this.f25232j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f25232j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f25232j[i10]);
                }
                view.setTag(67108867, null);
                this.f25232j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f25244w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f25230g[i10].eraseColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
