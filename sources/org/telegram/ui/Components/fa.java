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
    public DispatchQueue f26008a;
    public final int f26009b;
    public final View f26010c;
    public final di.r6 d;
    public Bitmap[] f26011e;
    public Bitmap[] f26012f;
    public Bitmap[] f26013g;
    public Canvas[] h;
    public Canvas[] f26014i;
    public Canvas[] f26015j;
    public boolean f26016k;
    public float f26018m;
    public boolean f26019n;
    public boolean f26020o;
    public int f26022q;
    public int f26023r;
    public int f26024s;
    public boolean f26025t;
    public float f26026u;
    public final Paint f26028x;
    public final org.telegram.ui.ActionBar.f6 f26029y;
    public boolean f26017l = true;
    public boolean f26021p = true;
    public ea v = new ea(this);
    public final Paint f26027w = new Paint(2);

    public fa(View view, di.r6 r6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f26028x = paint;
        this.f26009b = 1;
        this.f26010c = view;
        this.d = r6Var;
        this.f26029y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26013g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26013g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26011e == null) {
            this.f26011e = new Bitmap[2];
            this.f26015j = new Canvas[2];
        }
        this.v.f25660a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            di.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26024s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26008a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26011e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f26029y;
                if (i10 == 1) {
                    this.f26011e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20690d6, f6Var));
                }
                this.f26015j[i10] = new Canvas(this.f26011e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26024s;
                }
                this.f26013g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26013g[i10]);
                this.h[i10].scale(this.f26013g[i10].getWidth() / this.f26011e[i10].getWidth(), this.f26013g[i10].getHeight() / this.f26011e[i10].getHeight());
                this.f26015j[i10].save();
                this.f26015j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26010c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.ao) {
                        background = ((org.telegram.ui.ao) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26015j[i10].translate(0.0f, -this.f26026u);
                    view.draw(this.f26015j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26015j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26015j[i10]);
                }
                view.setTag(67108867, null);
                this.f26015j[i10].restore();
                Utilities.stackBlurBitmap(this.f26011e[i10], 15);
                Paint paint = this.f26027w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26013g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20690d6, f6Var));
                }
                this.h[i10].drawBitmap(this.f26011e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
