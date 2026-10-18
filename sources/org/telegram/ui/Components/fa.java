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
    public DispatchQueue f26183a;
    public final int f26184b;
    public final View f26185c;
    public final ei.g6 d;
    public Bitmap[] e;
    public Bitmap[] f26186f;
    public Bitmap[] f26187g;
    public Canvas[] h;
    public Canvas[] f26188i;
    public Canvas[] f26189j;
    public boolean f26190k;
    public float f26192m;
    public boolean f26193n;
    public boolean f26194o;
    public int f26196q;
    public int f26197r;
    public int f26198s;
    public boolean f26199t;
    public float f26200u;
    public final Paint f26202x;
    public final org.telegram.ui.ActionBar.d6 f26203y;
    public boolean f26191l = true;
    public boolean f26195p = true;
    public ea v = new ea(this);
    public final Paint f26201w = new Paint(2);

    public fa(View view, ei.g6 g6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26202x = paint;
        this.f26184b = 1;
        this.f26185c = view;
        this.d = g6Var;
        this.f26203y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26187g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26187g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f26189j = new Canvas[2];
        }
        this.v.f25893a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ei.g6 g6Var = this.d;
            int measuredHeight = g6Var.getMeasuredHeight();
            int measuredWidth = g6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26198s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != g6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26183a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26203y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
                }
                this.f26189j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26198s;
                }
                this.f26187g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26187g[i10]);
                this.h[i10].scale(this.f26187g[i10].getWidth() / this.e[i10].getWidth(), this.f26187g[i10].getHeight() / this.e[i10].getHeight());
                this.f26189j[i10].save();
                this.f26189j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26185c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.qn) {
                        background = ((org.telegram.ui.qn) d6Var).e();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26189j[i10].translate(0.0f, -this.f26200u);
                    view.draw(this.f26189j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26189j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26189j[i10]);
                }
                view.setTag(67108867, null);
                this.f26189j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f26201w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26187g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
