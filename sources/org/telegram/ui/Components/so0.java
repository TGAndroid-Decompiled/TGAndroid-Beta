package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class so0 extends ScrollView implements bh.a {
    public float[] E;
    public int F;
    public float[] G;
    public int H;
    public boolean I;
    public ArrayList J;
    public final lc0 K;
    public final ArrayList L;
    public final ArrayList M;
    public final org.telegram.ui.ActionBar.d6 f30906a;
    public final LinearLayout f30907b;
    public final float f30908c;
    public final Paint d;
    public final Paint f30909e;
    public final Paint f30910f;
    public final Rect h;
    public final RectF f30911n;
    public final RectF f30912r;
    public final Matrix f30913s;
    public Bitmap v;
    public int f30914w;
    public int f30915x;
    public boolean f30916y;

    public so0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        float f7;
        this.f30908c = AndroidUtilities.dp(16.0f);
        this.d = new Paint();
        this.f30909e = new Paint();
        this.f30910f = new Paint(3);
        this.h = new Rect();
        this.f30911n = new RectF();
        this.f30912r = new RectF();
        this.f30913s = new Matrix();
        this.E = new float[80];
        this.G = new float[32];
        this.K = new lc0(this, 26);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.f30906a = d6Var;
        this.f30907b = linearLayout;
        setWillNotDraw(false);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 4.0f;
        }
        linearLayout.setPadding(dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
    }

    public void setOverscrolling(boolean z10) {
        int i10;
        if (this.I != z10) {
            this.I = z10;
            invalidate();
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    li.k kVar = (li.k) this.J.get(size);
                    if (kVar.f15661a != z10) {
                        kVar.f15661a = z10;
                        li.p pVar = kVar.f15662b;
                        pVar.f15675f++;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        pVar.h += i10;
                    }
                }
            }
        }
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f450a = true;
    }

    public final void c(View view, View view2) {
        float f7;
        if (view != null && view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewParent parent = view.getParent();
            float f10 = 0.0f;
            LinearLayout linearLayout = this.f30907b;
            if (parent != linearLayout && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            } else {
                f7 = 0.0f;
            }
            if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            float j3 = j(view) + linearLayout.getX();
            float k10 = (k(view) + linearLayout.getY()) - f7;
            float width = view.getWidth() + j3;
            float k11 = k(view2) + linearLayout.getY() + view2.getHeight() + f10;
            if (width > j3 && k11 > k10) {
                int i10 = this.F;
                int i11 = i10 + 5;
                float[] fArr = this.E;
                if (i11 > fArr.length) {
                    float[] fArr2 = new float[fArr.length * 2];
                    System.arraycopy(fArr, 0, fArr2, 0, i10);
                    this.E = fArr2;
                }
                float[] fArr3 = this.E;
                int i12 = this.F;
                int i13 = i12 + 1;
                this.F = i13;
                fArr3[i12] = j3;
                int i14 = i12 + 2;
                this.F = i14;
                fArr3[i13] = k10;
                int i15 = i12 + 3;
                this.F = i15;
                fArr3[i14] = width;
                int i16 = i12 + 4;
                this.F = i16;
                fArr3[i15] = k11;
                this.F = i12 + 5;
                fArr3[i16] = view.getAlpha();
            }
        }
    }

    public final void d() {
        int i10 = 0;
        this.F = 0;
        ArrayList arrayList = this.M;
        arrayList.clear();
        i(this.f30907b, 0.0f, 0.0f);
        int size = arrayList.size();
        while (true) {
            View view = null;
            View view2 = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                View view3 = (View) obj;
                if (!Objects.equals(view3.getTag(), -33024) && !(view3 instanceof org.telegram.ui.Cells.e9) && !(view3 instanceof org.telegram.ui.Cells.b7) && !(view3 instanceof org.telegram.ui.a20)) {
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        c(view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                } else {
                    c(view, view2);
                }
            }
            c(view, view2);
            return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, this.f30906a), 255);
        Paint paint = this.d;
        paint.setColor(k10);
        if (this.f30915x != k10) {
            this.f30915x = k10;
            this.v = null;
        }
        d();
        if (this.f30916y) {
            float scrollX = getScrollX();
            float scrollY = getScrollY();
            float width = scrollX + getWidth();
            float height = getHeight() + scrollY;
            LinearLayout linearLayout = this.f30907b;
            float max = Math.max(scrollX, Math.min(width, linearLayout.getX() + linearLayout.getPaddingLeft()));
            float max2 = Math.max(max, Math.min(width, (linearLayout.getX() + linearLayout.getWidth()) - linearLayout.getPaddingRight()));
            this.H = 0;
            for (int i10 = 0; i10 < this.F; i10 += 5) {
                float max3 = Math.max(scrollY, this.E[i10 + 1]);
                float min = Math.min(height, this.E[i10 + 3]);
                if (min > max3) {
                    int i11 = this.H;
                    int i12 = i11 + 2;
                    float[] fArr = this.G;
                    if (i12 > fArr.length) {
                        float[] fArr2 = new float[fArr.length * 2];
                        System.arraycopy(fArr, 0, fArr2, 0, i11);
                        this.G = fArr2;
                    }
                    float[] fArr3 = this.G;
                    int i13 = this.H;
                    int i14 = i13 + 1;
                    this.H = i14;
                    fArr3[i13] = max3;
                    this.H = i13 + 2;
                    fArr3[i14] = min;
                }
            }
            for (int i15 = 2; i15 < this.H; i15 += 2) {
                float[] fArr4 = this.G;
                float f12 = fArr4[i15];
                float f13 = fArr4[i15 + 1];
                int i16 = i15 - 2;
                while (i16 >= 0) {
                    float[] fArr5 = this.G;
                    float f14 = fArr5[i16];
                    if (f14 > f12) {
                        fArr5[i16 + 2] = f14;
                        fArr5[i16 + 3] = fArr5[i16 + 1];
                        i16 -= 2;
                    }
                }
                float[] fArr6 = this.G;
                fArr6[i16 + 2] = f12;
                fArr6[i16 + 3] = f13;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < this.H; i18 += 2) {
                float[] fArr7 = this.G;
                float f15 = fArr7[i18];
                float f16 = fArr7[i18 + 1];
                if (i17 > 0) {
                    int i19 = i17 - 1;
                    float f17 = fArr7[i19];
                    if (f15 <= 1.0f + f17) {
                        fArr7[i19] = Math.max(f17, f16);
                    }
                }
                int i20 = i17 + 1;
                fArr7[i17] = f15;
                i17 += 2;
                fArr7[i20] = f16;
            }
            this.H = i17;
            if (i17 != 0 && max < max2) {
                float[] fArr8 = this.G;
                float f18 = fArr8[0];
                float f19 = fArr8[i17 - 1];
                if (f18 > scrollY) {
                    canvas.drawRect(scrollX, scrollY, width, Math.min(height, f18 + 1.0f), paint);
                }
                if (f19 < height) {
                    canvas.drawRect(scrollX, Math.max(scrollY, f19 - 1.0f), width, height, paint);
                    f7 = height;
                } else {
                    f7 = height;
                }
                float max4 = Math.max(scrollY, f18);
                float min2 = Math.min(f7, f19);
                if (min2 > max4) {
                    canvas.drawRect(scrollX, max4, Math.min(width, max + 1.0f), min2, paint);
                    canvas.drawRect(Math.max(scrollX, max2 - 1.0f), max4, width, min2, paint);
                }
                int i21 = 2;
                while (i21 < this.H) {
                    float[] fArr9 = this.G;
                    float f20 = fArr9[i21 - 1];
                    float f21 = fArr9[i21];
                    if (f21 > f20) {
                        f10 = max;
                        f11 = max2;
                        canvas.drawRect(f10, Math.max(scrollY, f20 - 1.0f), f11, Math.min(f7, f21 + 1.0f), paint);
                    } else {
                        f10 = max;
                        f11 = max2;
                    }
                    i21 += 2;
                    max = f10;
                    max2 = f11;
                }
            } else {
                canvas.drawRect(scrollX, scrollY, width, height, paint);
            }
            h(canvas);
        } else {
            h(canvas);
        }
        super.dispatchDraw(canvas);
        float width2 = getWidth() + getScrollX();
        float height2 = getHeight() + getScrollY();
        RectF rectF = this.f30912r;
        rectF.set(getScrollX(), getScrollY(), width2, height2);
        g(canvas, rectF);
    }

    public final void e(Canvas canvas, int i10, float f7, float f10, float f11, float f12, RectF rectF) {
        int i11;
        if (!rectF.intersects(f7, f10, f11, f12)) {
            return;
        }
        int i12 = 0;
        if ((i10 & 1) == 0) {
            i11 = 0;
        } else {
            i11 = this.f30914w;
        }
        if (i10 >= 2) {
            i12 = this.f30914w;
        }
        int i13 = this.f30914w;
        Rect rect = this.h;
        rect.set(i11, i12, i11 + i13, i13 + i12);
        RectF rectF2 = this.f30911n;
        rectF2.set(f7, f10, f11, f12);
        canvas.drawBitmap(this.v, rect, rectF2, this.f30910f);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        RectF rectF2 = this.f30911n;
        Paint paint = this.f30909e;
        Matrix matrix = this.f30913s;
        LinearLayout linearLayout = this.f30907b;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.I && getOverScrollMode() != 2) {
            canvas.save();
            try {
                canvas.clipRect(rectF);
                if (getMatrix().invert(matrix)) {
                    canvas.concat(matrix);
                }
                canvas.translate(-getX(), -getY());
                super.drawChild(canvas, this, uptimeMillis);
                canvas.restore();
                return;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = org.telegram.ui.ActionBar.i6.f20771a7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30906a;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), 255);
        this.d.setColor(k10);
        if (this.f30915x != k10) {
            this.f30915x = k10;
            this.v = null;
        }
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        RectF rectF3 = this.f30912r;
        rectF3.set(rectF);
        rectF3.offset(scrollX, scrollY);
        d();
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var);
        canvas.save();
        try {
            canvas.clipRect(rectF);
            canvas.translate(-scrollX, -scrollY);
            for (int i11 = 0; i11 < this.F; i11 += 5) {
                float[] fArr = this.E;
                int i12 = i11 + 1;
                int i13 = i11 + 2;
                int i14 = i11 + 3;
                if (rectF3.intersects(fArr[i11], fArr[i12], fArr[i13], fArr[i14])) {
                    paint.setColor(i0.a.k(v02, Math.round(Color.alpha(v02) * Math.max(0.0f, Math.min(1.0f, this.E[i11 + 4])))));
                    float[] fArr2 = this.E;
                    rectF2.set(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f7 = this.f30908c;
                    canvas.drawRoundRect(rectF2, f7, f7, paint);
                }
            }
            canvas.save();
            canvas.translate(linearLayout.getX(), linearLayout.getY());
            float x10 = linearLayout.getX();
            float y3 = linearLayout.getY();
            if (linearLayout instanceof ro0) {
                ro0 ro0Var = (ro0) linearLayout;
                for (int i15 = 0; i15 < ro0Var.getChildCount(); i15++) {
                    View childAt = ro0Var.getChildAt(i15);
                    if (childAt.getVisibility() == 0) {
                        float x11 = childAt.getX() + x10;
                        float y10 = childAt.getY() + y3;
                        if (rectF3.intersects(x11, y10, childAt.getWidth() + x11, childAt.getHeight() + y10)) {
                            ro0Var.drawChild(canvas, childAt, uptimeMillis);
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < linearLayout.getChildCount(); i16++) {
                    View childAt2 = linearLayout.getChildAt(i16);
                    if (childAt2.getVisibility() == 0) {
                        float x12 = childAt2.getX() + x10;
                        float y11 = childAt2.getY() + y3;
                        if (rectF3.intersects(x12, y11, childAt2.getWidth() + x12, childAt2.getHeight() + y11)) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            canvas.restore();
            g(canvas, rectF3);
            canvas.restore();
        } finally {
            canvas.restore();
        }
    }

    public final void g(Canvas canvas, RectF rectF) {
        if (this.F != 0) {
            float f7 = this.f30908c;
            if (f7 > 0.0f) {
                int max = Math.max(1, (int) Math.ceil(f7));
                if (this.v == null || this.f30914w != max) {
                    this.f30914w = max;
                    int i10 = max * 2;
                    this.v = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.v);
                    canvas2.drawColor(this.d.getColor());
                    Paint paint = new Paint(1);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f10 = max;
                    canvas2.drawCircle(f10, f10, f7, paint);
                }
                for (int i11 = 0; i11 < this.F; i11 += 5) {
                    float[] fArr = this.E;
                    float f11 = fArr[i11];
                    float f12 = fArr[i11 + 1];
                    float f13 = fArr[i11 + 2];
                    float f14 = fArr[i11 + 3];
                    float f15 = this.f30914w;
                    e(canvas, 0, f11, f12, f11 + f15, f12 + f15, rectF);
                    float f16 = this.f30914w;
                    e(canvas, 1, f13 - f16, f12, f13, f12 + f16, rectF);
                    float f17 = this.f30914w;
                    e(canvas, 2, f11, f14 - f17, f11 + f17, f14, rectF);
                    float f18 = this.f30914w;
                    e(canvas, 3, f13 - f18, f14 - f18, f13, f14, rectF);
                }
            }
        }
    }

    public final void h(Canvas canvas) {
        int h;
        float width = getWidth() + getScrollX();
        float height = getHeight() + getScrollY();
        RectF rectF = this.f30912r;
        rectF.set(getScrollX(), getScrollY(), width, height);
        for (int i10 = 0; i10 < this.F; i10 += 5) {
            float[] fArr = this.E;
            int i11 = i10 + 1;
            int i12 = i10 + 2;
            int i13 = i10 + 3;
            if (rectF.intersects(fArr[i10], fArr[i11], fArr[i12], fArr[i13])) {
                float f7 = this.E[i10 + 4];
                int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, this.f30906a);
                int round = Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(v02));
                if (!this.f30916y) {
                    h = i0.a.k(v02, round);
                } else {
                    h = i0.a.h(i0.a.k(v02, round), this.d.getColor());
                }
                Paint paint = this.f30909e;
                paint.setColor(h);
                float[] fArr2 = this.E;
                canvas.drawRect(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13], paint);
            }
        }
    }

    public final void i(ViewGroup viewGroup, float f7, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        LinearLayout linearLayout2 = this.f30907b;
                        if (childAt.getX() + f7 <= linearLayout2.getPaddingLeft() && childAt.getX() + f7 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            i(linearLayout, childAt.getX() + f7, childAt.getY() + f10);
                        }
                    }
                }
                this.M.add(childAt);
            }
        }
    }

    public final float j(View view) {
        if (view == this.f30907b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + j((View) view.getParent());
    }

    public final float k(View view) {
        if (view == this.f30907b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + k((View) view.getParent());
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.K);
        setOverscrolling(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.f30907b.invalidate();
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        long j3 = i13 + i11;
        if (getOverScrollMode() != 2 && (j3 < 0 || j3 > i15)) {
            setOverscrolling(true);
            lc0 lc0Var = this.K;
            removeCallbacks(lc0Var);
            postDelayed(lc0Var, 500L);
        }
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }

    public void setDrawBackground(boolean z10) {
        if (this.f30916y == z10) {
            return;
        }
        this.f30916y = z10;
        invalidate();
    }
}
