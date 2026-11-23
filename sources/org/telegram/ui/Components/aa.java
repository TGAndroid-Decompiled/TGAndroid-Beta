package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class aa {
    public org.telegram.messenger.r5 f33410a;
    public final int f33411b;
    public final View f33412c;
    public final hi.m5 d;
    public Bitmap[] f33413e;
    public Bitmap[] f33414f;
    public Bitmap[] f33415g;
    public Canvas[] h;
    public Canvas[] f33416i;
    public Canvas[] f33417j;
    public boolean f33418k;
    public float f33420m;
    public boolean f33421n;
    public boolean f33422o;
    public int f33424q;
    public int f33425r;
    public int f33426s;
    public boolean f33427t;
    public float f33428u;
    public final Paint f33430x;
    public final org.telegram.ui.ActionBar.h6 f33431y;
    public boolean f33419l = true;
    public boolean f33423p = true;
    public z9 v = new z9(this);
    public final Paint f33429w = new Paint(2);

    public aa(View view, hi.m5 m5Var, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint();
        this.f33430x = paint;
        this.f33411b = 1;
        this.f33412c = view;
        this.d = m5Var;
        this.f33431y = h6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f33415g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f33415g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f33413e == null) {
            this.f33413e = new Bitmap[2];
            this.f33417j = new Canvas[2];
        }
        this.v.f42696a = true;
        this.v = new z9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.m5 m5Var = this.d;
            int measuredHeight = m5Var.getMeasuredHeight();
            int measuredWidth = m5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24004m;
            this.f33426s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != m5Var.getMeasuredWidth()) {
                org.telegram.messenger.r5 r5Var = this.f33410a;
                if (r5Var != null) {
                    r5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f33413e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.h6 h6Var = this.f33431y;
                if (i7 == 1) {
                    this.f33413e[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var));
                }
                this.f33417j[i7] = new Canvas(this.f33413e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f33426s;
                }
                this.f33415g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f33415g[i7]);
                this.h[i7].scale(this.f33415g[i7].getWidth() / this.f33413e[i7].getWidth(), this.f33415g[i7].getHeight() / this.f33413e[i7].getHeight());
                this.f33417j[i7].save();
                this.f33417j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f33412c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (h6Var instanceof org.telegram.ui.zm) {
                        background = ((org.telegram.ui.zm) h6Var).c();
                    } else {
                        background = org.telegram.ui.ActionBar.m6.t0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.f33417j[i7].translate(0.0f, -this.f33428u);
                    view.draw(this.f33417j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f33417j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f33417j[i7]);
                }
                view.setTag(67108867, null);
                this.f33417j[i7].restore();
                Utilities.stackBlurBitmap(this.f33413e[i7], 15);
                Paint paint = this.f33429w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f33415g[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var));
                }
                this.h[i7].drawBitmap(this.f33413e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
