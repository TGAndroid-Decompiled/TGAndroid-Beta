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
    public DispatchQueue f24164a;
    public final int f24165b;
    public final View f24166c;
    public final ci.r6 d;
    public Bitmap[] e;
    public Bitmap[] f24167f;
    public Bitmap[] f24168g;
    public Canvas[] h;
    public Canvas[] f24169i;
    public Canvas[] f24170j;
    public boolean f24171k;
    public float f24173m;
    public boolean f24174n;
    public boolean f24175o;
    public int f24177q;
    public int f24178r;
    public int f24179s;
    public boolean f24180t;
    public float f24181u;
    public final Paint f24183x;
    public final org.telegram.ui.ActionBar.d6 f24184y;
    public boolean f24172l = true;
    public boolean f24176p = true;
    public ea v = new ea(this);
    public final Paint f24182w = new Paint(2);

    public fa(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f24183x = paint;
        this.f24165b = 1;
        this.f24166c = view;
        this.d = r6Var;
        this.f24184y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f24168g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f24168g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f24170j = new Canvas[2];
        }
        this.v.f23970a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f24179s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f24164a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f24184y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                }
                this.f24170j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f24179s;
                }
                this.f24168g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f24168g[i10]);
                this.h[i10].scale(this.f24168g[i10].getWidth() / this.e[i10].getWidth(), this.f24168g[i10].getHeight() / this.e[i10].getHeight());
                this.f24170j[i10].save();
                this.f24170j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f24166c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.un) {
                        background = ((org.telegram.ui.un) d6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f24170j[i10].translate(0.0f, -this.f24181u);
                    view.draw(this.f24170j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f24170j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f24170j[i10]);
                }
                view.setTag(67108867, null);
                this.f24170j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f24182w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f24168g[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
