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
    public DispatchQueue f26009a;
    public final int f26010b;
    public final View f26011c;
    public final di.r6 d;
    public Bitmap[] f26012e;
    public Bitmap[] f26013f;
    public Bitmap[] f26014g;
    public Canvas[] h;
    public Canvas[] f26015i;
    public Canvas[] f26016j;
    public boolean f26017k;
    public float f26019m;
    public boolean f26020n;
    public boolean f26021o;
    public int f26023q;
    public int f26024r;
    public int f26025s;
    public boolean f26026t;
    public float f26027u;
    public final Paint f26029x;
    public final org.telegram.ui.ActionBar.f6 f26030y;
    public boolean f26018l = true;
    public boolean f26022p = true;
    public ea v = new ea(this);
    public final Paint f26028w = new Paint(2);

    public fa(View view, di.r6 r6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f26029x = paint;
        this.f26010b = 1;
        this.f26011c = view;
        this.d = r6Var;
        this.f26030y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26014g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26014g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f26012e == null) {
            this.f26012e = new Bitmap[2];
            this.f26016j = new Canvas[2];
        }
        this.v.f25661a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            di.r6 r6Var = this.d;
            int measuredHeight = r6Var.getMeasuredHeight();
            int measuredWidth = r6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26025s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != r6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26009a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f26012e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f26030y;
                if (i10 == 1) {
                    this.f26012e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20691d6, f6Var));
                }
                this.f26016j[i10] = new Canvas(this.f26012e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26025s;
                }
                this.f26014g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26014g[i10]);
                this.h[i10].scale(this.f26014g[i10].getWidth() / this.f26012e[i10].getWidth(), this.f26014g[i10].getHeight() / this.f26012e[i10].getHeight());
                this.f26016j[i10].save();
                this.f26016j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26011c;
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
                    this.f26016j[i10].translate(0.0f, -this.f26027u);
                    view.draw(this.f26016j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26016j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26016j[i10]);
                }
                view.setTag(67108867, null);
                this.f26016j[i10].restore();
                Utilities.stackBlurBitmap(this.f26012e[i10], 15);
                Paint paint = this.f26028w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26014g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20691d6, f6Var));
                }
                this.h[i10].drawBitmap(this.f26012e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
