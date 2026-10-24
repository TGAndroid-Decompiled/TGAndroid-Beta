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
    public DispatchQueue f25631a;
    public final int f25632b;
    public final View f25633c;
    public final ei.g6 d;
    public Bitmap[] e;
    public Bitmap[] f25634f;
    public Bitmap[] f25635g;
    public Canvas[] h;
    public Canvas[] f25636i;
    public Canvas[] f25637j;
    public boolean f25638k;
    public float f25640m;
    public boolean f25641n;
    public boolean f25642o;
    public int f25644q;
    public int f25645r;
    public int f25646s;
    public boolean f25647t;
    public float f25648u;
    public final Paint f25650x;
    public final org.telegram.ui.ActionBar.g6 f25651y;
    public boolean f25639l = true;
    public boolean f25643p = true;
    public ca v = new ca(this);
    public final Paint f25649w = new Paint(2);

    public da(View view, ei.g6 g6Var, org.telegram.ui.ActionBar.g6 g6Var2) {
        Paint paint = new Paint();
        this.f25650x = paint;
        this.f25632b = 1;
        this.f25633c = view;
        this.d = g6Var;
        this.f25651y = g6Var2;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f25635g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f25635g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f25637j = new Canvas[2];
        }
        this.v.f25274a = true;
        this.v = new ca(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ei.g6 g6Var = this.d;
            int measuredHeight = g6Var.getMeasuredHeight();
            int measuredWidth = g6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f25646s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != g6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f25631a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f25651y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var2));
                }
                this.f25637j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f25646s;
                }
                this.f25635g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f25635g[i10]);
                this.h[i10].scale(this.f25635g[i10].getWidth() / this.e[i10].getWidth(), this.f25635g[i10].getHeight() / this.e[i10].getHeight());
                this.f25637j[i10].save();
                this.f25637j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f25633c;
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
                    this.f25637j[i10].translate(0.0f, -this.f25648u);
                    view.draw(this.f25637j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f25637j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f25637j[i10]);
                }
                view.setTag(67108867, null);
                this.f25637j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f25649w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f25635g[i10].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var2));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
