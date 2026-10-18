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
    public DispatchQueue f26190a;
    public final int f26191b;
    public final View f26192c;
    public final ei.g6 d;
    public Bitmap[] e;
    public Bitmap[] f26193f;
    public Bitmap[] f26194g;
    public Canvas[] h;
    public Canvas[] f26195i;
    public Canvas[] f26196j;
    public boolean f26197k;
    public float f26199m;
    public boolean f26200n;
    public boolean f26201o;
    public int f26203q;
    public int f26204r;
    public int f26205s;
    public boolean f26206t;
    public float f26207u;
    public final Paint f26209x;
    public final org.telegram.ui.ActionBar.d6 f26210y;
    public boolean f26198l = true;
    public boolean f26202p = true;
    public ea v = new ea(this);
    public final Paint f26208w = new Paint(2);

    public fa(View view, ei.g6 g6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint();
        this.f26209x = paint;
        this.f26191b = 1;
        this.f26192c = view;
        this.d = g6Var;
        this.f26210y = d6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f26194g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f26194g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f26196j = new Canvas[2];
        }
        this.v.f25900a = true;
        this.v = new ea(this);
        for (int i10 = 0; i10 < 2; i10++) {
            ei.g6 g6Var = this.d;
            int measuredHeight = g6Var.getMeasuredHeight();
            int measuredWidth = g6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f26205s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != g6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f26190a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26210y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
                }
                this.f26196j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f26205s;
                }
                this.f26194g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f26194g[i10]);
                this.h[i10].scale(this.f26194g[i10].getWidth() / this.e[i10].getWidth(), this.f26194g[i10].getHeight() / this.e[i10].getHeight());
                this.f26196j[i10].save();
                this.f26196j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f26192c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (d6Var instanceof org.telegram.ui.qn) {
                        background = ((org.telegram.ui.qn) d6Var).e();
                    } else {
                        background = org.telegram.ui.ActionBar.h6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f26196j[i10].translate(0.0f, -this.f26207u);
                    view.draw(this.f26196j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f26196j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f26196j[i10]);
                }
                view.setTag(67108867, null);
                this.f26196j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f26208w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f26194g[i10].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
