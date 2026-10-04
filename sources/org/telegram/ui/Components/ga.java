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
    public DispatchQueue f26746a;
    public final int f26747b;
    public final View f26748c;
    public final ci.r6 d;
    public Bitmap[] f26749e;
    public Bitmap[] f26750f;
    public Bitmap[] f26751g;
    public Canvas[] h;
    public Canvas[] f26752i;
    public Canvas[] f26753j;
    public boolean f26754k;
    public float f26756m;
    public boolean f26757n;
    public boolean f26758o;
    public int f26760q;
    public int f26761r;
    public int f26762s;
    public boolean f26763t;
    public float f26764u;
    public final Paint f26766x;
    public final org.telegram.ui.ActionBar.d6 f26767y;
    public boolean f26755l = true;
    public boolean f26759p = true;
    public fa v = new fa(this);
    public final Paint f26765w = new Paint(2);

    public ga(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26766x = paint;
        this.f26747b = 1;
        this.f26748c = view;
        this.d = r6Var;
        this.f26767y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26751g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26751g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26749e == null) {
            this.f26749e = new Bitmap[2];
            this.f26753j = new Canvas[2];
        }
        this.v.f26426a = true;
        this.v = new fa(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26762s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26746a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26749e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26767y;
                if (i10 == 1) {
                    this.f26749e[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, d6Var));
                }
                this.f26753j[i10] = new Canvas(this.f26749e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26762s;
                }
                this.f26751g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26751g[i10]);
                this.h[i10].scale(this.f26751g[i10].getWidth() / this.f26749e[i10].getWidth(), this.f26751g[i10].getHeight() / this.f26749e[i10].getHeight());
                this.f26753j[i10].save();
                this.f26753j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26748c;
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
                    this.f26753j[i10].translate(0.0f, -this.f26764u);
                    view.draw(this.f26753j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26753j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26753j[i10]);
                }
                view.setTag(67108867, null);
                this.f26753j[i10].restore();
                Utilities.stackBlurBitmap(this.f26749e[i10], 15);
                Paint paint = this.f26765w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26751g[i10].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, d6Var));
                }
                this.h[i10].drawBitmap(this.f26749e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
