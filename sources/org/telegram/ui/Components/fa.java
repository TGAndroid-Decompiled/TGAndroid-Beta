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
    public DispatchQueue f24104a;
    public final int f24105b;
    public final View f24106c;
    public final ci.r6 d;
    public Bitmap[] e;
    public Bitmap[] f24107f;
    public Bitmap[] f24108g;
    public Canvas[] h;
    public Canvas[] f24109i;
    public Canvas[] f24110j;
    public boolean f24111k;
    public float f24113m;
    public boolean f24114n;
    public boolean f24115o;
    public int f24117q;
    public int f24118r;
    public int f24119s;
    public boolean f24120t;
    public float f24121u;
    public final Paint f24123x;
    public final org.telegram.ui.ActionBar.d6 f24124y;
    public boolean f24112l = true;
    public boolean f24116p = true;
    public ea v = new ea(this);
    public final Paint f24122w = new Paint(2);

    public fa(View view, ci.r6 r6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f24123x = paint;
        this.f24105b = 1;
        this.f24106c = view;
        this.d = r6Var;
        this.f24124y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f24108g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f24108g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f24110j = new Canvas[2];
        }
        this.v.f23895a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ci.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f24119s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f24104a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f24124y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                }
                this.f24110j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f24119s;
                }
                this.f24108g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f24108g[i10]);
                this.h[i10].scale(this.f24108g[i10].getWidth() / this.e[i10].getWidth(), this.f24108g[i10].getHeight() / this.e[i10].getHeight());
                this.f24110j[i10].save();
                this.f24110j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f24106c;
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
                    this.f24110j[i10].translate(0.0f, -this.f24121u);
                    view.draw(this.f24110j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f24110j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f24110j[i10]);
                }
                view.setTag(67108867, null);
                this.f24110j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f24122w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f24108g[i10].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
