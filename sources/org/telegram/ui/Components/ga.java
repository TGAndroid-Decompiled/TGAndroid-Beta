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
    public DispatchQueue f26740a;
    public final int f26741b;
    public final View f26742c;
    public final ci.r6 d;
    public Bitmap[] f26743e;
    public Bitmap[] f26744f;
    public Bitmap[] f26745g;
    public Canvas[] h;
    public Canvas[] f26746i;
    public Canvas[] f26747j;
    public boolean f26748k;
    public float f26750m;
    public boolean f26751n;
    public boolean f26752o;
    public int f26754q;
    public int f26755r;
    public int f26756s;
    public boolean f26757t;
    public float f26758u;
    public final Paint f26760x;
    public final org.telegram.ui.ActionBar.d6 f26761y;
    public boolean f26749l = true;
    public boolean f26753p = true;
    public fa v = new fa(this);
    public final Paint f26759w = new Paint(2);

    public ga(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26760x = paint;
        this.f26741b = 1;
        this.f26742c = view;
        this.d = r6Var;
        this.f26761y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26745g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26745g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26743e == null) {
            this.f26743e = new Bitmap[2];
            this.f26747j = new Canvas[2];
        }
        this.v.f26420a = true;
        this.v = new fa(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26756s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26740a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26743e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26761y;
                if (i10 == 1) {
                    this.f26743e[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var));
                }
                this.f26747j[i10] = new Canvas(this.f26743e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26756s;
                }
                this.f26745g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26745g[i10]);
                this.h[i10].scale(this.f26745g[i10].getWidth() / this.f26743e[i10].getWidth(), this.f26745g[i10].getHeight() / this.f26743e[i10].getHeight());
                this.f26747j[i10].save();
                this.f26747j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26742c;
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
                    this.f26747j[i10].translate(0.0f, -this.f26758u);
                    view.draw(this.f26747j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26747j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26747j[i10]);
                }
                view.setTag(67108867, null);
                this.f26747j[i10].restore();
                Utilities.stackBlurBitmap(this.f26743e[i10], 15);
                Paint paint = this.f26759w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26745g[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var));
                }
                this.h[i10].drawBitmap(this.f26743e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
