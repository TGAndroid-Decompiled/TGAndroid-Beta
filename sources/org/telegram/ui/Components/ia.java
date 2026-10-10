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
public final class ia {
    public DispatchQueue f27282a;
    public final int f27283b;
    public final View f27284c;
    public final ci.r6 d;
    public Bitmap[] f27285e;
    public Bitmap[] f27286f;
    public Bitmap[] f27287g;
    public Canvas[] h;
    public Canvas[] f27288i;
    public Canvas[] f27289j;
    public boolean f27290k;
    public float f27292m;
    public boolean f27293n;
    public boolean f27294o;
    public int f27296q;
    public int f27297r;
    public int f27298s;
    public boolean f27299t;
    public float f27300u;
    public final Paint f27302x;
    public final org.telegram.ui.ActionBar.e6 f27303y;
    public boolean f27291l = true;
    public boolean f27295p = true;
    public ha v = new ha(this);
    public final Paint f27301w = new Paint(2);

    public ia(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.f27302x = paint;
        this.f27283b = 1;
        this.f27284c = view;
        this.d = r6Var;
        this.f27303y = e6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f27287g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f27287g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f27285e == null) {
            this.f27285e = new Bitmap[2];
            this.f27289j = new Canvas[2];
        }
        this.v.f26972a = true;
        this.v = new ha(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f27298s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f27282a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f27285e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.f27303y;
                if (i10 == 1) {
                    this.f27285e[i10].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
                }
                this.f27289j[i10] = new Canvas(this.f27285e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f27298s;
                }
                this.f27287g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f27287g[i10]);
                this.h[i10].scale(this.f27287g[i10].getWidth() / this.f27285e[i10].getWidth(), this.f27287g[i10].getHeight() / this.f27285e[i10].getHeight());
                this.f27289j[i10].save();
                this.f27289j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f27284c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (e6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) e6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.i6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f27289j[i10].translate(0.0f, -this.f27300u);
                    view.draw(this.f27289j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f27289j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f27289j[i10]);
                }
                view.setTag(67108867, null);
                this.f27289j[i10].restore();
                Utilities.stackBlurBitmap(this.f27285e[i10], 15);
                Paint paint = this.f27301w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f27287g[i10].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
                }
                this.h[i10].drawBitmap(this.f27285e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
