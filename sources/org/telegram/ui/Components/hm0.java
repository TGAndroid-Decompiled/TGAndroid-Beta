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
public class hm0 extends ScrollView implements eh.a {
    public boolean D;
    public float[] E;
    public int F;
    public float[] G;
    public int H;
    public boolean I;
    public ArrayList J;
    public final ob0 K;
    public final ArrayList L;
    public final ArrayList M;
    public final org.telegram.ui.ActionBar.f6 f34295a;
    public final LinearLayout f34296b;
    public final float f34297c;
    public final Paint d;
    public final Paint f34298e;
    public final Paint f34299f;
    public final Rect h;
    public final RectF f34300n;
    public final RectF f34301r;
    public final Matrix f34302s;
    public Bitmap f34303w;
    public int f34304x;
    public int f34305y;

    public hm0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        float f10;
        this.f34297c = org.telegram.messenger.g0.L(16.0f);
        this.d = new Paint();
        this.f34298e = new Paint();
        this.f34299f = new Paint(3);
        this.h = new Rect();
        this.f34300n = new RectF();
        this.f34301r = new RectF();
        this.f34302s = new Matrix();
        this.E = new float[80];
        this.G = new float[32];
        this.K = new ob0(this, 21);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.f34295a = f6Var;
        this.f34296b = linearLayout;
        setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(12.0f);
        if (z9) {
            f10 = 12.0f;
        } else {
            f10 = 4.0f;
        }
        linearLayout.setPadding(L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
    }

    public void setOverscrolling(boolean z9) {
        int i7;
        if (this.I != z9) {
            this.I = z9;
            invalidate();
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    oi.l lVar = (oi.l) this.J.get(size);
                    if (lVar.f21088a != z9) {
                        lVar.f21088a = z9;
                        oi.q qVar = lVar.f21089b;
                        qVar.h++;
                        if (z9) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        qVar.f21106j += i7;
                    }
                }
            }
        }
    }

    public final void b(View view, View view2) {
        float f10;
        float f11;
        if (view != null && view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewParent parent = view.getParent();
            float f12 = 0.0f;
            LinearLayout linearLayout = this.f34296b;
            if (parent != linearLayout && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            } else {
                f10 = 0.0f;
            }
            if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                f11 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            } else {
                f11 = 0.0f;
            }
            ViewGroup viewGroup = view2;
            while ((viewGroup.getParent() instanceof ViewGroup) && viewGroup.getParent() != linearLayout) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                int childCount = viewGroup2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = viewGroup2.getChildAt(childCount);
                        if (childAt.getVisibility() == 8) {
                            childCount--;
                        } else if (childAt != viewGroup) {
                            break;
                        }
                    }
                }
                f12 += viewGroup2.getPaddingBottom();
                viewGroup = viewGroup2;
            }
            float f13 = f11 + f12;
            float j3 = j(view) + linearLayout.getX();
            float k10 = (k(view) + linearLayout.getY()) - f10;
            float width = view.getWidth() + j3;
            float k11 = k(view2) + linearLayout.getY() + view2.getHeight() + f13;
            if (width > j3 && k11 > k10) {
                int i7 = this.F;
                int i10 = i7 + 5;
                float[] fArr = this.E;
                if (i10 > fArr.length) {
                    float[] fArr2 = new float[fArr.length * 2];
                    System.arraycopy(fArr, 0, fArr2, 0, i7);
                    this.E = fArr2;
                }
                float[] fArr3 = this.E;
                int i11 = this.F;
                int i12 = i11 + 1;
                this.F = i12;
                fArr3[i11] = j3;
                int i13 = i11 + 2;
                this.F = i13;
                fArr3[i12] = k10;
                int i14 = i11 + 3;
                this.F = i14;
                fArr3[i13] = width;
                int i15 = i11 + 4;
                this.F = i15;
                fArr3[i14] = k11;
                this.F = i11 + 5;
                fArr3[i15] = view.getAlpha();
            }
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8700a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        RectF rectF2 = this.f34300n;
        Paint paint = this.f34298e;
        Matrix matrix = this.f34302s;
        LinearLayout linearLayout = this.f34296b;
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
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34295a;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), 255);
        this.d.setColor(o4);
        if (this.f34305y != o4) {
            this.f34305y = o4;
            this.f34303w = null;
        }
        float scrollX = getScrollX();
        float scrollY = getScrollY();
        RectF rectF3 = this.f34301r;
        rectF3.set(rectF);
        rectF3.offset(scrollX, scrollY);
        e();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, f6Var);
        canvas.save();
        try {
            canvas.clipRect(rectF);
            canvas.translate(-scrollX, -scrollY);
            for (int i10 = 0; i10 < this.F; i10 += 5) {
                float[] fArr = this.E;
                int i11 = i10 + 1;
                int i12 = i10 + 2;
                int i13 = i10 + 3;
                if (rectF3.intersects(fArr[i10], fArr[i11], fArr[i12], fArr[i13])) {
                    paint.setColor(i0.a.o(w02, Math.round(Color.alpha(w02) * Math.max(0.0f, Math.min(1.0f, this.E[i10 + 4])))));
                    float[] fArr2 = this.E;
                    rectF2.set(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                    float f10 = this.f34297c;
                    canvas.drawRoundRect(rectF2, f10, f10, paint);
                }
            }
            canvas.save();
            canvas.translate(linearLayout.getX(), linearLayout.getY());
            float x10 = linearLayout.getX();
            float y10 = linearLayout.getY();
            if (linearLayout instanceof gm0) {
                gm0 gm0Var = (gm0) linearLayout;
                for (int i14 = 0; i14 < gm0Var.getChildCount(); i14++) {
                    View childAt = gm0Var.getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        float x11 = childAt.getX() + x10;
                        float y11 = childAt.getY() + y10;
                        if (rectF3.intersects(x11, y11, childAt.getWidth() + x11, childAt.getHeight() + y11)) {
                            gm0Var.drawChild(canvas, childAt, uptimeMillis);
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < linearLayout.getChildCount(); i15++) {
                    View childAt2 = linearLayout.getChildAt(i15);
                    if (childAt2.getVisibility() == 0) {
                        float x12 = childAt2.getX() + x10;
                        float y12 = childAt2.getY() + y10;
                        if (rectF3.intersects(x12, y12, childAt2.getWidth() + x12, childAt2.getHeight() + y12)) {
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

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        char c10;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, this.f34295a), 255);
        Paint paint = this.d;
        paint.setColor(o4);
        if (this.f34305y != o4) {
            this.f34305y = o4;
            this.f34303w = null;
        }
        e();
        if (this.D) {
            float scrollX = getScrollX();
            float scrollY = getScrollY();
            float width = scrollX + getWidth();
            float height = getHeight() + scrollY;
            LinearLayout linearLayout = this.f34296b;
            float z9 = org.telegram.messenger.camera.q.z(linearLayout.getX(), linearLayout.getPaddingLeft(), width, scrollX);
            float max = Math.max(z9, Math.min(width, (linearLayout.getX() + linearLayout.getWidth()) - linearLayout.getPaddingRight()));
            char c11 = 0;
            this.H = 0;
            for (int i7 = 0; i7 < this.F; i7 += 5) {
                float max2 = Math.max(scrollY, this.E[i7 + 1]);
                float min = Math.min(height, this.E[i7 + 3]);
                if (min > max2) {
                    int i10 = this.H;
                    int i11 = i10 + 2;
                    float[] fArr = this.G;
                    if (i11 > fArr.length) {
                        float[] fArr2 = new float[fArr.length * 2];
                        System.arraycopy(fArr, 0, fArr2, 0, i10);
                        this.G = fArr2;
                    }
                    float[] fArr3 = this.G;
                    int i12 = this.H;
                    int i13 = i12 + 1;
                    this.H = i13;
                    fArr3[i12] = max2;
                    this.H = i12 + 2;
                    fArr3[i13] = min;
                }
            }
            for (int i14 = 2; i14 < this.H; i14 += 2) {
                float[] fArr4 = this.G;
                float f13 = fArr4[i14];
                float f14 = fArr4[i14 + 1];
                int i15 = i14 - 2;
                while (i15 >= 0) {
                    float[] fArr5 = this.G;
                    float f15 = fArr5[i15];
                    if (f15 > f13) {
                        fArr5[i15 + 2] = f15;
                        fArr5[i15 + 3] = fArr5[i15 + 1];
                        i15 -= 2;
                    }
                }
                float[] fArr6 = this.G;
                fArr6[i15 + 2] = f13;
                fArr6[i15 + 3] = f14;
            }
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.H) {
                float[] fArr7 = this.G;
                float f16 = fArr7[i16];
                float f17 = fArr7[i16 + 1];
                if (i17 > 0) {
                    int i18 = i17 - 1;
                    c10 = c11;
                    float f18 = fArr7[i18];
                    if (f16 <= 1.0f + f18) {
                        fArr7[i18] = Math.max(f18, f17);
                        i16 += 2;
                        c11 = c10;
                    }
                } else {
                    c10 = c11;
                }
                int i19 = i17 + 1;
                fArr7[i17] = f16;
                i17 += 2;
                fArr7[i19] = f17;
                i16 += 2;
                c11 = c10;
            }
            char c12 = c11;
            this.H = i17;
            if (i17 != 0 && z9 < max) {
                float[] fArr8 = this.G;
                float f19 = fArr8[c12];
                float f20 = fArr8[i17 - 1];
                if (f19 > scrollY) {
                    canvas.drawRect(scrollX, scrollY, width, Math.min(height, f19 + 1.0f), paint);
                }
                if (f20 < height) {
                    canvas.drawRect(scrollX, Math.max(scrollY, f20 - 1.0f), width, height, paint);
                    f10 = height;
                } else {
                    f10 = height;
                }
                float max3 = Math.max(scrollY, f19);
                float min2 = Math.min(f10, f20);
                if (min2 > max3) {
                    canvas.drawRect(scrollX, max3, Math.min(width, z9 + 1.0f), min2, paint);
                    canvas.drawRect(Math.max(scrollX, max - 1.0f), max3, width, min2, paint);
                }
                int i20 = 2;
                while (i20 < this.H) {
                    float[] fArr9 = this.G;
                    float f21 = fArr9[i20 - 1];
                    float f22 = fArr9[i20];
                    if (f22 > f21) {
                        f11 = z9;
                        f12 = max;
                        canvas.drawRect(f11, Math.max(scrollY, f21 - 1.0f), f12, Math.min(f10, f22 + 1.0f), paint);
                    } else {
                        f11 = z9;
                        f12 = max;
                    }
                    i20 += 2;
                    z9 = f11;
                    max = f12;
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
        RectF rectF = this.f34301r;
        rectF.set(getScrollX(), getScrollY(), width2, height2);
        g(canvas, rectF);
    }

    public final void e() {
        int i7 = 0;
        this.F = 0;
        ArrayList arrayList = this.M;
        arrayList.clear();
        i(this.f34296b, 0.0f, 0.0f);
        int size = arrayList.size();
        while (true) {
            View view = null;
            View view2 = null;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                View view3 = (View) obj;
                if (!Objects.equals(view3.getTag(), -33024) && !(view3 instanceof org.telegram.ui.Cells.z8) && !(view3 instanceof org.telegram.ui.Cells.y6) && !(view3 instanceof org.telegram.ui.b00)) {
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        b(view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                } else {
                    b(view, view2);
                }
            }
            b(view, view2);
            return;
        }
    }

    public final void f(Canvas canvas, int i7, float f10, float f11, float f12, float f13, RectF rectF) {
        int i10;
        if (!rectF.intersects(f10, f11, f12, f13)) {
            return;
        }
        int i11 = 0;
        if ((i7 & 1) == 0) {
            i10 = 0;
        } else {
            i10 = this.f34304x;
        }
        if (i7 >= 2) {
            i11 = this.f34304x;
        }
        int i12 = this.f34304x;
        Rect rect = this.h;
        rect.set(i10, i11, i10 + i12, i12 + i11);
        RectF rectF2 = this.f34300n;
        rectF2.set(f10, f11, f12, f13);
        canvas.drawBitmap(this.f34303w, rect, rectF2, this.f34299f);
    }

    public final void g(Canvas canvas, RectF rectF) {
        if (this.F != 0) {
            float f10 = this.f34297c;
            if (f10 > 0.0f) {
                int max = Math.max(1, (int) Math.ceil(f10));
                if (this.f34303w == null || this.f34304x != max) {
                    this.f34304x = max;
                    int i7 = max * 2;
                    this.f34303w = Bitmap.createBitmap(i7, i7, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.f34303w);
                    canvas2.drawColor(this.d.getColor());
                    Paint paint = new Paint(1);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f11 = max;
                    canvas2.drawCircle(f11, f11, f10, paint);
                }
                for (int i10 = 0; i10 < this.F; i10 += 5) {
                    float[] fArr = this.E;
                    float f12 = fArr[i10];
                    float f13 = fArr[i10 + 1];
                    float f14 = fArr[i10 + 2];
                    float f15 = fArr[i10 + 3];
                    float f16 = this.f34304x;
                    f(canvas, 0, f12, f13, f12 + f16, f13 + f16, rectF);
                    float f17 = this.f34304x;
                    f(canvas, 1, f14 - f17, f13, f14, f13 + f17, rectF);
                    float f18 = this.f34304x;
                    f(canvas, 2, f12, f15 - f18, f12 + f18, f15, rectF);
                    float f19 = this.f34304x;
                    f(canvas, 3, f14 - f19, f15 - f19, f14, f15, rectF);
                }
            }
        }
    }

    public final void h(Canvas canvas) {
        int k10;
        float width = getWidth() + getScrollX();
        float height = getHeight() + getScrollY();
        RectF rectF = this.f34301r;
        rectF.set(getScrollX(), getScrollY(), width, height);
        for (int i7 = 0; i7 < this.F; i7 += 5) {
            float[] fArr = this.E;
            int i10 = i7 + 1;
            int i11 = i7 + 2;
            int i12 = i7 + 3;
            if (rectF.intersects(fArr[i7], fArr[i10], fArr[i11], fArr[i12])) {
                float f10 = this.E[i7 + 4];
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, this.f34295a);
                int round = Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(w02));
                if (!this.D) {
                    k10 = i0.a.o(w02, round);
                } else {
                    k10 = i0.a.k(i0.a.o(w02, round), this.d.getColor());
                }
                Paint paint = this.f34298e;
                paint.setColor(k10);
                float[] fArr2 = this.E;
                canvas.drawRect(fArr2[i7], fArr2[i10], fArr2[i11], fArr2[i12], paint);
            }
        }
    }

    public final void i(ViewGroup viewGroup, float f10, float f11) {
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        LinearLayout linearLayout2 = this.f34296b;
                        if (childAt.getX() + f10 <= linearLayout2.getPaddingLeft() && childAt.getX() + f10 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            i(linearLayout, childAt.getX() + f10, childAt.getY() + f11);
                        }
                    }
                }
                this.M.add(childAt);
            }
        }
    }

    public final float j(View view) {
        if (view == this.f34296b) {
            return 0.0f;
        }
        if (!(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + j((View) view.getParent());
    }

    public final float k(View view) {
        if (view == this.f34296b) {
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
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.f34296b.invalidate();
    }

    @Override
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        long j3 = i12 + i10;
        if (getOverScrollMode() != 2 && (j3 < 0 || j3 > i14)) {
            setOverscrolling(true);
            ob0 ob0Var = this.K;
            removeCallbacks(ob0Var);
            postDelayed(ob0Var, 500L);
        }
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z9);
    }

    public void setDrawBackground(boolean z9) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        invalidate();
    }
}
