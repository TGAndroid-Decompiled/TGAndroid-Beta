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
    public DispatchQueue f23257a;
    public final int f23258b;
    public final View f23259c;
    public final ci.s6 d;
    public Bitmap[] e;
    public Bitmap[] f23260f;
    public Bitmap[] f23261g;
    public Canvas[] h;
    public Canvas[] f23262i;
    public Canvas[] f23263j;
    public boolean f23264k;
    public float f23266m;
    public boolean f23267n;
    public boolean f23268o;
    public int f23270q;
    public int f23271r;
    public int f23272s;
    public boolean f23273t;
    public float f23274u;
    public final Paint f23276x;
    public final org.telegram.ui.ActionBar.e6 f23277y;
    public boolean f23265l = true;
    public boolean f23269p = true;
    public ca v = new ca(this);
    public final Paint f23275w = new Paint(2);

    public da(View view, ci.s6 s6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f23276x = paint;
        this.f23258b = 1;
        this.f23259c = view;
        this.d = s6Var;
        this.f23277y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f23261g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f23261g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f23263j = new Canvas[2];
        }
        this.v.f23036a = true;
        this.v = new ca(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.s6 s6Var = this.d;
            int measuredHeight = s6Var.getMeasuredHeight();
            int measuredWidth = s6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f23272s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f23257a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f23277y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                }
                this.f23263j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f23272s;
                }
                this.f23261g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f23261g[i10]);
                this.h[i10].scale(this.f23261g[i10].getWidth() / this.e[i10].getWidth(), this.f23261g[i10].getHeight() / this.e[i10].getHeight());
                this.f23263j[i10].save();
                this.f23263j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f23259c;
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
                    this.f23263j[i10].translate(0.0f, -this.f23274u);
                    view.draw(this.f23263j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f23263j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f23263j[i10]);
                }
                view.setTag(67108867, null);
                this.f23263j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f23275w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f23261g[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
