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
    public DispatchQueue f26169a;
    public final int f26170b;
    public final View f26171c;
    public final ei.g6 d;
    public Bitmap[] e;
    public Bitmap[] f26172f;
    public Bitmap[] f26173g;
    public Canvas[] h;
    public Canvas[] f26174i;
    public Canvas[] f26175j;
    public boolean f26176k;
    public float f26178m;
    public boolean f26179n;
    public boolean f26180o;
    public int f26182q;
    public int f26183r;
    public int f26184s;
    public boolean f26185t;
    public float f26186u;
    public final Paint f26188x;
    public final org.telegram.ui.ActionBar.d6 f26189y;
    public boolean f26177l = true;
    public boolean f26181p = true;
    public ea v = new ea(this);
    public final Paint f26187w = new Paint(2);

    public fa(View view, ei.g6 g6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26188x = paint;
        this.f26170b = 1;
        this.f26171c = view;
        this.d = g6Var;
        this.f26189y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26173g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26173g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f26175j = new Canvas[2];
        }
        this.v.f25875a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ei.g6 g6Var = this.d;
            int measuredHeight = g6Var.getMeasuredHeight();
            int measuredWidth = g6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26184s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != g6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26169a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26189y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var));
                }
                this.f26175j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26184s;
                }
                this.f26173g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26173g[i10]);
                this.h[i10].scale(this.f26173g[i10].getWidth() / this.e[i10].getWidth(), this.f26173g[i10].getHeight() / this.e[i10].getHeight());
                this.f26175j[i10].save();
                this.f26175j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26171c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.on) {
                        background = ((org.telegram.ui.on) d6Var).e();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26175j[i10].translate(0.0f, -this.f26186u);
                    view.draw(this.f26175j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26175j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26175j[i10]);
                }
                view.setTag(67108867, null);
                this.f26175j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f26187w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26173g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
