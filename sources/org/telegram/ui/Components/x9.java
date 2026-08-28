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
    public DispatchQueue f34602a;
    public final int f34603b;
    public final View f34604c;
    public final kh.h6 d;
    public Bitmap[] f34605e;
    public Bitmap[] f34606f;
    public Bitmap[] f34607g;
    public Canvas[] h;
    public Canvas[] f34608i;
    public Canvas[] f34609j;
    public boolean f34610k;
    public float f34612m;
    public boolean f34613n;
    public boolean f34614o;
    public int f34616q;
    public int f34617r;
    public int f34618s;
    public boolean f34619t;
    public float f34620u;
    public final Paint f34622x;
    public final org.telegram.ui.ActionBar.b6 f34623y;
    public boolean f34611l = true;
    public boolean f34615p = true;
    public w9 v = new w9(this);
    public final Paint f34621w = new Paint(2);

    public x9(View view, kh.h6 h6Var, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint();
        this.f34622x = paint;
        this.f34603b = 1;
        this.f34604c = view;
        this.d = h6Var;
        this.f34623y = b6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f34607g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f34607g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f34605e == null) {
            this.f34605e = new Bitmap[2];
            this.f34609j = new Canvas[2];
        }
        this.v.f34152a = true;
        this.v = new w9(this);
        for (int i9 = 0; i9 < 2; i9++) {
            kh.h6 h6Var = this.d;
            int measuredHeight = h6Var.getMeasuredHeight();
            int measuredWidth = h6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f34618s = dp;
            if (i9 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i9];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i9].getWidth() != h6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f34602a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f34605e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i9] = Bitmap.createBitmap(i10, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.b6 b6Var = this.f34623y;
                if (i9 == 1) {
                    this.f34605e[i9].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                }
                this.f34609j[i9] = new Canvas(this.f34605e[i9]);
                if (i9 == 0) {
                    measuredHeight = this.f34618s;
                }
                this.f34607g[i9] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i9] = new Canvas(this.f34607g[i9]);
                this.h[i9].scale(this.f34607g[i9].getWidth() / this.f34605e[i9].getWidth(), this.f34607g[i9].getHeight() / this.f34605e[i9].getHeight());
                this.f34609j[i9].save();
                this.f34609j[i9].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f34604c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (b6Var instanceof org.telegram.ui.on) {
                        background = ((org.telegram.ui.on) b6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.f6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i9));
                if (i9 == 0) {
                    this.f34609j[i9].translate(0.0f, -this.f34620u);
                    view.draw(this.f34609j[i9]);
                }
                if (i9 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f34609j[i9]);
                    background.setBounds(bounds);
                    view.draw(this.f34609j[i9]);
                }
                view.setTag(67108867, null);
                this.f34609j[i9].restore();
                Utilities.stackBlurBitmap(this.f34605e[i9], 15);
                Paint paint = this.f34621w;
                paint.setAlpha(255);
                if (i9 == 1) {
                    this.f34607g[i9].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                }
                this.h[i9].drawBitmap(this.f34605e[i9], 0.0f, 0.0f, paint);
            }
        }
    }
}
