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
public final class fa {
    public DispatchQueue f24103a;
    public final int f24104b;
    public final View f24105c;
    public final ci.r6 d;
    public Bitmap[] e;
    public Bitmap[] f24106f;
    public Bitmap[] f24107g;
    public Canvas[] h;
    public Canvas[] f24108i;
    public Canvas[] f24109j;
    public boolean f24110k;
    public float f24112m;
    public boolean f24113n;
    public boolean f24114o;
    public int f24116q;
    public int f24117r;
    public int f24118s;
    public boolean f24119t;
    public float f24120u;
    public final Paint f24122x;
    public final org.telegram.ui.ActionBar.d6 f24123y;
    public boolean f24111l = true;
    public boolean f24115p = true;
    public ea v = new ea(this);
    public final Paint f24121w = new Paint(2);

    public fa(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f24122x = paint;
        this.f24104b = 1;
        this.f24105c = view;
        this.d = r6Var;
        this.f24123y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f24107g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f24107g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f24109j = new Canvas[2];
        }
        this.v.f23894a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f24118s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f24103a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f24123y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                }
                this.f24109j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f24118s;
                }
                this.f24107g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f24107g[i10]);
                this.h[i10].scale(this.f24107g[i10].getWidth() / this.e[i10].getWidth(), this.f24107g[i10].getHeight() / this.e[i10].getHeight());
                this.f24109j[i10].save();
                this.f24109j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f24105c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.un) {
                        background = ((org.telegram.ui.un) d6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f24109j[i10].translate(0.0f, -this.f24120u);
                    view.draw(this.f24109j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f24109j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f24109j[i10]);
                }
                view.setTag(67108867, null);
                this.f24109j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f24121w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f24107g[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
