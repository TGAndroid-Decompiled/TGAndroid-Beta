package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ProfileActivity;
public final class zg0 extends View {
    public float A;
    public yg0 B;
    public final HashSet C;
    public int D;
    public boolean E;
    public boolean F;
    public wg0 G;
    public wg0 H;
    public wg0 I;
    public final float J;
    public final float K;
    public final float L;
    public int M;
    public boolean N;
    public RadialGradient O;
    public final Matrix P;
    public int Q;
    public PorterDuffColorFilter R;
    public wg0 S;
    public float T;
    public float U;
    public long V;
    public vg0 W;
    public final ArrayList f35338a;
    public final Paint f35339b;
    public final Paint f35340c;
    public float d;
    public boolean f35341e;
    public float f35342f;
    public final Path h;
    public final Path f35343n;
    public org.telegram.ui.iz0 f35344r;
    public float f35345s;
    public float v;
    public RenderNode f35346w;
    public int f35347x;
    public final int f35348y;

    public zg0(Context context, int i10) {
        super(context);
        this.f35338a = new ArrayList();
        Paint paint = new Paint();
        this.f35339b = paint;
        this.f35340c = new Paint();
        this.f35341e = true;
        this.f35342f = -1.0f;
        this.h = new Path();
        this.f35343n = new Path();
        this.f35347x = 0;
        this.A = 0.0f;
        this.B = null;
        this.C = new HashSet();
        this.D = 6;
        this.G = null;
        this.M = 0;
        this.P = new Matrix();
        this.S = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.J = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.K = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.L = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.f35348y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f9 = this.J;
        int i10 = this.f35347x;
        return ((measuredWidth - ((f9 / 2.0f) * (i10 - 1))) - (f9 * 2.0f)) / i10;
    }

    public static wg0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            wg0 wg0Var = (wg0) list.get(i11);
            if (!wg0Var.f34411o && wg0Var.f34399a == i10) {
                return wg0Var;
            }
        }
        return null;
    }

    public final void a() {
        wg0 wg0Var = new wg0(this, xg0.E);
        wg0Var.f34399a = 14;
        this.f35338a.add(wg0Var);
    }

    public final void b() {
        wg0 wg0Var = new wg0(this, xg0.F);
        wg0Var.f34399a = 16;
        this.f35338a.add(wg0Var);
    }

    public final void c() {
        wg0 wg0Var = new wg0(this, xg0.G);
        wg0Var.f34399a = 17;
        this.f35338a.add(wg0Var);
    }

    public final void d() {
        boolean z10;
        if (this.E) {
            return;
        }
        if (this.D == 6) {
            this.f35347x = this.f35338a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.C;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.D;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        if (i10 == 5) {
                            m(0, arrayList);
                            m(1, arrayList);
                        }
                    } else {
                        if (z10) {
                            m(7, arrayList);
                        } else {
                            m(0, arrayList);
                        }
                        m(1, arrayList);
                        if (z10) {
                            arrayList.add(k(8));
                        } else {
                            m(10, arrayList);
                            n(11, 10, arrayList);
                            m(12, arrayList);
                            m(9, arrayList);
                        }
                    }
                } else {
                    m(0, arrayList);
                    m(1, arrayList);
                    m(4, arrayList);
                    arrayList.add(k(13));
                }
            } else {
                if (z10) {
                    m(7, arrayList);
                } else {
                    m(10, arrayList);
                    n(11, 10, arrayList);
                }
                m(1, arrayList);
                if (!z10) {
                    m(2, arrayList);
                    if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                        arrayList.add(k(3));
                    }
                }
                n(4, 12, arrayList);
                if (z10) {
                    arrayList.add(k(8));
                } else {
                    m(12, arrayList);
                    n(9, 12, arrayList);
                }
            }
        } else {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        }
        AndroidUtilities.runOnUIThread(new gt(28, this, arrayList));
    }

    public final void e() {
        this.E = true;
    }

    public final boolean f() {
        int i10 = this.D;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f9;
        int i10 = this.M;
        if (i10 != 0) {
            if (!this.N) {
                this.f35339b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.J;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f35347x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f35347x);
            float f11 = max / 2.0f;
            float f12 = this.f35348y / 2.0f;
            if (this.N) {
                f9 = max * 0.65f;
            } else {
                f9 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f9, org.telegram.ui.ActionBar.g6.l1(0.8f, this.M), this.M, Shader.TileMode.CLAMP);
            this.O = radialGradient;
            this.f35340c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.W == null) {
            this.W = new vg0(this);
        }
        return this.W;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f9) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.R);
        drawable.setAlpha((int) (f9 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.f35346w != null) {
            this.f35346w = null;
            this.f35344r = null;
            invalidate();
        }
    }

    public final wg0 k(int i10) {
        wg0 j10 = j(i10, this.f35338a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new wg0(this, xg0.d);
                break;
            case 1:
                j10 = new wg0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new wg0(this, xg0.h);
                break;
            case 3:
                j10 = new wg0(this, xg0.f34713n);
                j10.f34416t = true;
                j10.f34419x = 200;
                break;
            case 4:
                j10 = new wg0(this, xg0.f34714r);
                break;
            case 5:
                j10 = new wg0(this, xg0.f34715s);
                this.G = j10;
                j10.f34416t = true;
                j10.f34419x = 500;
                break;
            case 6:
                j10 = new wg0(this, xg0.v);
                j10.f34416t = true;
                j10.f34419x = 500;
                break;
            case 7:
                j10 = new wg0(this, xg0.f34716w);
                j10.f34416t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new wg0(this, xg0.f34717x);
                j10.f34416t = true;
                j10.f34419x = 500;
                break;
            case 9:
                j10 = new wg0(this, xg0.f34718y);
                j10.f34416t = true;
                j10.f34417u = R.raw.profile_leave;
                j10.f34419x = 300;
                break;
            case 10:
                j10 = new wg0(this, xg0.A);
                j10.f34416t = true;
                j10.f34417u = R.raw.profile_voicechat;
                j10.f34419x = 500;
                break;
            case 11:
                j10 = new wg0(this, xg0.B);
                j10.f34416t = true;
                j10.f34417u = R.raw.profile_voicechat;
                j10.f34419x = 500;
                break;
            case 12:
                j10 = new wg0(this, xg0.C);
                break;
            case 13:
                j10 = new wg0(this, xg0.D);
                j10.f34416t = true;
                j10.f34419x = 300;
                break;
        }
        if (j10 != null) {
            j10.f34399a = i10;
        }
        return j10;
    }

    public final boolean l() {
        if (this.C.contains(5) && this.G != null) {
            return true;
        }
        return false;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.C.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i11))) {
            arrayList.add(k(i10));
        }
    }

    public final void o(int i10, boolean z10) {
        boolean remove;
        HashSet hashSet = this.C;
        if (z10) {
            remove = hashSet.add(Integer.valueOf(i10));
        } else {
            remove = hashSet.remove(Integer.valueOf(i10));
        }
        if (remove) {
            d();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f35348y + this.L + this.K), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wg0 wg0Var;
        if (this.A >= AndroidUtilities.dp(8.0f)) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.S = null;
                ArrayList arrayList = this.f35338a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    wg0 wg0Var2 = (wg0) arrayList.get(i10);
                    if (!wg0Var2.f34411o && wg0Var2.d.contains(x4, y8)) {
                        this.S = wg0Var2;
                        this.T = x4;
                        this.U = y8;
                        this.V = System.currentTimeMillis();
                        this.S.f34400b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.S != null && (Math.abs(x4 - this.T) > 20.0f || Math.abs(y8 - this.U) > 20.0f)) {
                    this.S.f34400b.c(false);
                    this.S = null;
                }
            } else if ((action == 1 || action == 3) && (wg0Var = this.S) != null) {
                wg0Var.f34400b.c(false);
                if (action == 1 && this.S.d.contains(x4, y8)) {
                    if (System.currentTimeMillis() - this.V > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    wg0 wg0Var3 = this.S;
                    if (wg0Var3.f34416t && !wg0Var3.f34415s) {
                        wg0Var3.f34415s = true;
                        invalidate();
                    }
                    wg0 wg0Var4 = this.S;
                    int i11 = wg0Var4.f34417u;
                    if (i11 != 0) {
                        wg0Var4.d(i11, 0, 0);
                    }
                    this.S.f34418w = System.currentTimeMillis();
                    wg0 wg0Var5 = this.S;
                    yg0 yg0Var = this.B;
                    if (yg0Var != null) {
                        int i12 = wg0Var5.v;
                        if (i12 == 0) {
                            int i13 = wg0Var5.f34399a;
                            RectF rectF = wg0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ex0) yg0Var).f37920b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new gt(29, this, wg0Var5), i12);
                        }
                    }
                }
                this.S = null;
                return true;
            }
            if (this.S != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(wg0 wg0Var, boolean z10) {
        xg0 xg0Var;
        if (z10) {
            if (this.F) {
                xg0 xg0Var2 = xg0.f34711e;
                wg0Var.c(LocaleController.getString(xg0Var2.f34719a));
                wg0Var.d(R.raw.profile_unmuting, xg0Var2.f34720b, xg0Var2.f34721c);
                return;
            }
            xg0 xg0Var3 = xg0.f34712f;
            wg0Var.c(LocaleController.getString(xg0Var3.f34719a));
            wg0Var.d(R.raw.profile_muting, xg0Var3.f34720b, xg0Var3.f34721c);
            return;
        }
        if (this.F) {
            xg0Var = xg0.f34711e;
        } else {
            xg0Var = xg0.f34712f;
        }
        wg0Var.d(0, xg0Var.f34720b, xg0Var.f34721c);
        wg0Var.c(LocaleController.getString(xg0Var.f34719a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.F != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.F = z10;
        wg0 j10 = j(1, this.f35338a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
            return;
        }
        this.C.add(1);
        d();
    }

    public void setOnActionClickListener(yg0 yg0Var) {
        this.B = yg0Var;
    }

    public void setParentExpanded(float f9) {
        if (this.d != f9) {
            this.d = f9;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof c90)) {
            return false;
        }
        return true;
    }
}
