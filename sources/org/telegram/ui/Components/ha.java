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
    public DispatchQueue f26710a;
    public final int f26711b;
    public final View f26712c;
    public final ci.r6 d;
    public Bitmap[] f26713e;
    public Bitmap[] f26714f;
    public Bitmap[] f26715g;
    public Canvas[] h;
    public Canvas[] f26716i;
    public Canvas[] f26717j;
    public boolean f26718k;
    public float f26720m;
    public boolean f26721n;
    public boolean f26722o;
    public int f26724q;
    public int f26725r;
    public int f26726s;
    public boolean f26727t;
    public float f26728u;
    public final Paint f26730x;
    public final org.telegram.ui.ActionBar.c6 f26731y;
    public boolean f26719l = true;
    public boolean f26723p = true;
    public ga v = new ga(this);
    public final Paint f26729w = new Paint(2);

    public ha(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint();
        this.f26730x = paint;
        this.f26711b = 1;
        this.f26712c = view;
        this.d = r6Var;
        this.f26731y = c6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26715g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26715g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26713e == null) {
            this.f26713e = new Bitmap[2];
            this.f26717j = new Canvas[2];
        }
        this.v.f26375a = true;
        this.v = new ga(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26726s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26710a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26713e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.c6 c6Var = this.f26731y;
                if (i10 == 1) {
                    this.f26713e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                }
                this.f26717j[i10] = new Canvas(this.f26713e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26726s;
                }
                this.f26715g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26715g[i10]);
                this.h[i10].scale(this.f26715g[i10].getWidth() / this.f26713e[i10].getWidth(), this.f26715g[i10].getHeight() / this.f26713e[i10].getHeight());
                this.f26717j[i10].save();
                this.f26717j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26712c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (c6Var instanceof org.telegram.ui.bo) {
                        background = ((org.telegram.ui.bo) c6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26717j[i10].translate(0.0f, -this.f26728u);
                    view.draw(this.f26717j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26717j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26717j[i10]);
                }
                view.setTag(67108867, null);
                this.f26717j[i10].restore();
                Utilities.stackBlurBitmap(this.f26713e[i10], 15);
                Paint paint = this.f26729w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26715g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                }
                this.h[i10].drawBitmap(this.f26713e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
