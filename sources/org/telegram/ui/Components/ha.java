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
    public DispatchQueue f26934a;
    public final int f26935b;
    public final View f26936c;
    public final ci.r6 d;
    public Bitmap[] f26937e;
    public Bitmap[] f26938f;
    public Bitmap[] f26939g;
    public Canvas[] h;
    public Canvas[] f26940i;
    public Canvas[] f26941j;
    public boolean f26942k;
    public float f26944m;
    public boolean f26945n;
    public boolean f26946o;
    public int f26948q;
    public int f26949r;
    public int f26950s;
    public boolean f26951t;
    public float f26952u;
    public final Paint f26954x;
    public final org.telegram.ui.ActionBar.d6 f26955y;
    public boolean f26943l = true;
    public boolean f26947p = true;
    public ga v = new ga(this);
    public final Paint f26953w = new Paint(2);

    public ha(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26954x = paint;
        this.f26935b = 1;
        this.f26936c = view;
        this.d = r6Var;
        this.f26955y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26939g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26939g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26937e == null) {
            this.f26937e = new Bitmap[2];
            this.f26941j = new Canvas[2];
        }
        this.v.f26652a = true;
        this.v = new ga(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26950s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26934a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26937e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26955y;
                if (i10 == 1) {
                    this.f26937e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var));
                }
                this.f26941j[i10] = new Canvas(this.f26937e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26950s;
                }
                this.f26939g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26939g[i10]);
                this.h[i10].scale(this.f26939g[i10].getWidth() / this.f26937e[i10].getWidth(), this.f26939g[i10].getHeight() / this.f26937e[i10].getHeight());
                this.f26941j[i10].save();
                this.f26941j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26936c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) d6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26941j[i10].translate(0.0f, -this.f26952u);
                    view.draw(this.f26941j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26941j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26941j[i10]);
                }
                view.setTag(67108867, null);
                this.f26941j[i10].restore();
                Utilities.stackBlurBitmap(this.f26937e[i10], 15);
                Paint paint = this.f26953w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26939g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var));
                }
                this.h[i10].drawBitmap(this.f26937e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
