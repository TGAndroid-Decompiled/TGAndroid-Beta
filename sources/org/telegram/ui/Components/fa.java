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
    public DispatchQueue f26242a;
    public final int f26243b;
    public final View f26244c;
    public final ei.g6 d;
    public Bitmap[] e;
    public Bitmap[] f26245f;
    public Bitmap[] f26246g;
    public Canvas[] h;
    public Canvas[] f26247i;
    public Canvas[] f26248j;
    public boolean f26249k;
    public float f26251m;
    public boolean f26252n;
    public boolean f26253o;
    public int f26255q;
    public int f26256r;
    public int f26257s;
    public boolean f26258t;
    public float f26259u;
    public final Paint f26261x;
    public final org.telegram.ui.ActionBar.g6 f26262y;
    public boolean f26250l = true;
    public boolean f26254p = true;
    public ea v = new ea(this);
    public final Paint f26260w = new Paint(2);

    public fa(View view, ei.g6 g6Var, org.telegram.ui.ActionBar.g6 g6Var2) {
        Paint paint = new Paint();
        this.f26261x = paint;
        this.f26243b = 1;
        this.f26244c = view;
        this.d = g6Var;
        this.f26262y = g6Var2;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26246g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26246g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f26248j = new Canvas[2];
        }
        this.v.f25941a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ei.g6 g6Var = this.d;
            int measuredHeight = g6Var.getMeasuredHeight();
            int measuredWidth = g6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26257s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != g6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26242a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f26262y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var2));
                }
                this.f26248j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26257s;
                }
                this.f26246g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26246g[i10]);
                this.h[i10].scale(this.f26246g[i10].getWidth() / this.e[i10].getWidth(), this.f26246g[i10].getHeight() / this.e[i10].getHeight());
                this.f26248j[i10].save();
                this.f26248j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26244c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (g6Var2 instanceof org.telegram.ui.qn) {
                        background = ((org.telegram.ui.qn) g6Var2).l();
                    } else {
                        background = org.telegram.ui.ActionBar.k6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26248j[i10].translate(0.0f, -this.f26259u);
                    view.draw(this.f26248j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26248j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26248j[i10]);
                }
                view.setTag(67108867, null);
                this.f26248j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f26260w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26246g[i10].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var2));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
