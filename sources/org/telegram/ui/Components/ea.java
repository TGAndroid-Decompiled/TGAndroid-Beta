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
    public DispatchQueue f23796a;
    public final int f23797b;
    public final View f23798c;
    public final ci.s6 d;
    public Bitmap[] e;
    public Bitmap[] f23799f;
    public Bitmap[] f23800g;
    public Canvas[] h;
    public Canvas[] f23801i;
    public Canvas[] f23802j;
    public boolean f23803k;
    public float f23805m;
    public boolean f23806n;
    public boolean f23807o;
    public int f23809q;
    public int f23810r;
    public int f23811s;
    public boolean f23812t;
    public float f23813u;
    public final Paint f23815x;
    public final org.telegram.ui.ActionBar.f6 f23816y;
    public boolean f23804l = true;
    public boolean f23808p = true;
    public da v = new da(this);
    public final Paint f23814w = new Paint(2);

    public ea(View view, ci.s6 s6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f23815x = paint;
        this.f23797b = 1;
        this.f23798c = view;
        this.d = s6Var;
        this.f23816y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f23800g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f23800g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f23802j = new Canvas[2];
        }
        this.v.f23542a = true;
        this.v = new da(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.s6 s6Var = this.d;
            int measuredHeight = s6Var.getMeasuredHeight();
            int measuredWidth = s6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f23811s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f23796a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f23816y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var));
                }
                this.f23802j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f23811s;
                }
                this.f23800g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f23800g[i10]);
                this.h[i10].scale(this.f23800g[i10].getWidth() / this.e[i10].getWidth(), this.f23800g[i10].getHeight() / this.e[i10].getHeight());
                this.f23802j[i10].save();
                this.f23802j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f23798c;
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
                    this.f23802j[i10].translate(0.0f, -this.f23813u);
                    view.draw(this.f23802j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f23802j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f23802j[i10]);
                }
                view.setTag(67108867, null);
                this.f23802j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f23814w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f23800g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
