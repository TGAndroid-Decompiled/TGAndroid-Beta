package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class aa {
    public org.telegram.messenger.r5 f33444a;
    public final int f33445b;
    public final View f33446c;
    public final hi.l5 d;
    public Bitmap[] f33447e;
    public Bitmap[] f33448f;
    public Bitmap[] f33449g;
    public Canvas[] h;
    public Canvas[] f33450i;
    public Canvas[] f33451j;
    public boolean f33452k;
    public float f33454m;
    public boolean f33455n;
    public boolean f33456o;
    public int f33458q;
    public int f33459r;
    public int f33460s;
    public boolean f33461t;
    public float f33462u;
    public final Paint f33464x;
    public final org.telegram.ui.ActionBar.h6 f33465y;
    public boolean f33453l = true;
    public boolean f33457p = true;
    public z9 v = new z9(this);
    public final Paint f33463w = new Paint(2);

    public aa(View view, hi.l5 l5Var, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint();
        this.f33464x = paint;
        this.f33445b = 1;
        this.f33446c = view;
        this.d = l5Var;
        this.f33465y = h6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.f33449g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.f33449g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.f33447e == null) {
            this.f33447e = new Bitmap[2];
            this.f33451j = new Canvas[2];
        }
        this.v.f42738a = true;
        this.v = new z9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.l5 l5Var = this.d;
            int measuredHeight = l5Var.getMeasuredHeight();
            int measuredWidth = l5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24040m;
            this.f33460s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != l5Var.getMeasuredWidth()) {
                org.telegram.messenger.r5 r5Var = this.f33444a;
                if (r5Var != null) {
                    r5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.f33447e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.h6 h6Var = this.f33465y;
                if (i7 == 1) {
                    this.f33447e[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var));
                }
                this.f33451j[i7] = new Canvas(this.f33447e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.f33460s;
                }
                this.f33449g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.f33449g[i7]);
                this.h[i7].scale(this.f33449g[i7].getWidth() / this.f33447e[i7].getWidth(), this.f33449g[i7].getHeight() / this.f33447e[i7].getHeight());
                this.f33451j[i7].save();
                this.f33451j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.f33446c;
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
                    this.f33451j[i7].translate(0.0f, -this.f33462u);
                    view.draw(this.f33451j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.f33451j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.f33451j[i7]);
                }
                view.setTag(67108867, null);
                this.f33451j[i7].restore();
                Utilities.stackBlurBitmap(this.f33447e[i7], 15);
                Paint paint = this.f33463w;
                paint.setAlpha(255);
                if (i7 == 1) {
                    this.f33449g[i7].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var));
                }
                this.h[i7].drawBitmap(this.f33447e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
