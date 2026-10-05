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
public final class ga {
    public DispatchQueue f26795a;
    public final int f26796b;
    public final View f26797c;
    public final ci.r6 d;
    public Bitmap[] f26798e;
    public Bitmap[] f26799f;
    public Bitmap[] f26800g;
    public Canvas[] h;
    public Canvas[] f26801i;
    public Canvas[] f26802j;
    public boolean f26803k;
    public float f26805m;
    public boolean f26806n;
    public boolean f26807o;
    public int f26809q;
    public int f26810r;
    public int f26811s;
    public boolean f26812t;
    public float f26813u;
    public final Paint f26815x;
    public final org.telegram.ui.ActionBar.d6 f26816y;
    public boolean f26804l = true;
    public boolean f26808p = true;
    public fa v = new fa(this);
    public final Paint f26814w = new Paint(2);

    public ga(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26815x = paint;
        this.f26796b = 1;
        this.f26797c = view;
        this.d = r6Var;
        this.f26816y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26800g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26800g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26798e == null) {
            this.f26798e = new Bitmap[2];
            this.f26802j = new Canvas[2];
        }
        this.v.f26433a = true;
        this.v = new fa(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26811s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26795a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26798e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26816y;
                if (i10 == 1) {
                    this.f26798e[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
                }
                this.f26802j[i10] = new Canvas(this.f26798e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26811s;
                }
                this.f26800g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26800g[i10]);
                this.h[i10].scale(this.f26800g[i10].getWidth() / this.f26798e[i10].getWidth(), this.f26800g[i10].getHeight() / this.f26798e[i10].getHeight());
                this.f26802j[i10].save();
                this.f26802j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26797c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.wn) {
                        background = ((org.telegram.ui.wn) d6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.i6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26802j[i10].translate(0.0f, -this.f26813u);
                    view.draw(this.f26802j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26802j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26802j[i10]);
                }
                view.setTag(67108867, null);
                this.f26802j[i10].restore();
                Utilities.stackBlurBitmap(this.f26798e[i10], 15);
                Paint paint = this.f26814w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26800g[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
                }
                this.h[i10].drawBitmap(this.f26798e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
