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
public final class x9 {
    public DispatchQueue f30615a;
    public final int f30616b;
    public final View f30617c;
    public final eg.i0 d;
    public Bitmap[] e;
    public Bitmap[] f30618f;
    public Bitmap[] f30619g;
    public Canvas[] h;
    public Canvas[] f30620i;
    public Canvas[] f30621j;
    public boolean f30622k;
    public float f30624m;
    public boolean f30625n;
    public boolean f30626o;
    public int f30628q;
    public int f30629r;
    public int f30630s;
    public boolean f30631t;
    public float f30632u;
    public final Paint f30634x;
    public final org.telegram.ui.ActionBar.f6 f30635y;
    public boolean f30623l = true;
    public boolean f30627p = true;
    public w9 v = new w9(this);
    public final Paint f30633w = new Paint(2);

    public x9(View view, eg.i0 i0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f30634x = paint;
        this.f30616b = 1;
        this.f30617c = view;
        this.d = i0Var;
        this.f30635y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f30619g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f30619g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f30621j = new Canvas[2];
        }
        this.v.f30277a = true;
        this.v = new w9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            eg.i0 i0Var = this.d;
            int measuredHeight = i0Var.getMeasuredHeight();
            int measuredWidth = i0Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f30630s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != i0Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f30615a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f30635y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                }
                this.f30621j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f30630s;
                }
                this.f30619g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f30619g[i10]);
                this.h[i10].scale(this.f30619g[i10].getWidth() / this.e[i10].getWidth(), this.f30619g[i10].getHeight() / this.e[i10].getHeight());
                this.f30621j[i10].save();
                this.f30621j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f30617c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.vn) {
                        background = ((org.telegram.ui.vn) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f30621j[i10].translate(0.0f, -this.f30632u);
                    view.draw(this.f30621j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f30621j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f30621j[i10]);
                }
                view.setTag(67108867, null);
                this.f30621j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f30633w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f30619g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
