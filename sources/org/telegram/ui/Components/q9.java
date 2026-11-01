package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class q9 {
    public org.telegram.messenger.s5 f29681a;
    public final int f29682b;
    public final View f29683c;
    public final kg.f0 d;
    public Bitmap[] e;
    public Bitmap[] f29684f;
    public Bitmap[] f29685g;
    public Canvas[] h;
    public Canvas[] f29686i;
    public Canvas[] f29687j;
    public boolean f29688k;
    public float f29690m;
    public boolean f29691n;
    public boolean f29692o;
    public int f29694q;
    public int f29695r;
    public int f29696s;
    public boolean f29697t;
    public float f29698u;
    public final Paint f29700x;
    public final org.telegram.ui.ActionBar.p6 f29701y;
    public boolean f29689l = true;
    public boolean f29693p = true;
    public p9 v = new p9(this);
    public final Paint f29699w = new Paint(2);

    public q9(View view, kg.f0 f0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint();
        this.f29700x = paint;
        this.f29682b = 1;
        this.f29683c = view;
        this.d = f0Var;
        this.f29701y = p6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f29685g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f29685g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.f29687j = new Canvas[2];
        }
        this.v.f29385a = true;
        this.v = new p9(this);
        for (int i10 = 0; i10 < 2; i10++) {
            kg.f0 f0Var = this.d;
            int measuredHeight = f0Var.getMeasuredHeight();
            int measuredWidth = f0Var.getMeasuredWidth();
            int L = org.telegram.messenger.i0.L(200.0f) + org.telegram.messenger.i0.f16166m;
            this.f29696s = L;
            if (i10 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i10].getWidth() != f0Var.getMeasuredWidth()) {
                org.telegram.messenger.s5 s5Var = this.f29681a;
                if (s5Var != null) {
                    s5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.p6 p6Var = this.f29701y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var));
                }
                this.f29687j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.f29696s;
                }
                this.f29685g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.f29685g[i10]);
                this.h[i10].scale(this.f29685g[i10].getWidth() / this.e[i10].getWidth(), this.f29685g[i10].getHeight() / this.e[i10].getHeight());
                this.f29687j[i10].save();
                this.f29687j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f29683c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (p6Var instanceof org.telegram.ui.sn) {
                        background = ((org.telegram.ui.sn) p6Var).m();
                    } else {
                        background = org.telegram.ui.ActionBar.t6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.f29687j[i10].translate(0.0f, -this.f29698u);
                    view.draw(this.f29687j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f29687j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.f29687j[i10]);
                }
                view.setTag(67108867, null);
                this.f29687j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.f29699w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.f29685g[i10].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
