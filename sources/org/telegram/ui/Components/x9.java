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
    public DispatchQueue f30545a;
    public final int f30546b;
    public final View f30547c;
    public final eg.i0 d;
    public Bitmap[] e;
    public Bitmap[] f30548f;
    public Bitmap[] f30549g;
    public Canvas[] h;
    public Canvas[] f30550i;
    public Canvas[] f30551j;
    public boolean f30552k;
    public float f30554m;
    public boolean f30555n;
    public boolean f30556o;
    public int f30558q;
    public int f30559r;
    public int f30560s;
    public boolean f30561t;
    public float f30562u;
    public final Paint f30564x;
    public final org.telegram.ui.ActionBar.f6 f30565y;
    public boolean f30553l = true;
    public boolean f30557p = true;
    public w9 v = new w9(this);
    public final Paint f30563w = new Paint(2);

    public x9(View view, eg.i0 i0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.f30564x = paint;
        this.f30546b = 1;
        this.f30547c = view;
        this.d = i0Var;
        this.f30565y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f30549g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f30549g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f30551j = new Canvas[2];
        }
        this.v.f30185a = true;
        this.v = new w9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            eg.i0 i0Var = this.d;
            int measuredHeight = i0Var.getMeasuredHeight();
            int measuredWidth = i0Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.f30560s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != i0Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.f30545a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.f30565y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                }
                this.f30551j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f30560s;
                }
                this.f30549g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f30549g[i10]);
                this.h[i10].scale(this.f30549g[i10].getWidth() / this.e[i10].getWidth(), this.f30549g[i10].getHeight() / this.e[i10].getHeight());
                this.f30551j[i10].save();
                this.f30551j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f30547c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (f6Var instanceof org.telegram.ui.xn) {
                        background = ((org.telegram.ui.xn) f6Var).d();
                    } else {
                        background = org.telegram.ui.ActionBar.j6.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f30551j[i10].translate(0.0f, -this.f30562u);
                    view.draw(this.f30551j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f30551j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f30551j[i10]);
                }
                view.setTag(67108867, null);
                this.f30551j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f30563w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f30549g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
