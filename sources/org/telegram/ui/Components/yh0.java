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
public final class yh0 extends View {
    public float E;
    public xh0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public vh0 K;
    public vh0 L;
    public vh0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public vh0 W;
    public final ArrayList f32623a;
    public float f32624a0;
    public final Paint f32625b;
    public float f32626b0;
    public final Paint f32627c;
    public long f32628c0;
    public float d;
    public uh0 f32629d0;
    public boolean e;
    public float f32630f;
    public final Path h;
    public final Path f32631n;
    public org.telegram.ui.oz0 f32632r;
    public float f32633s;
    public float v;
    public RenderNode f32634w;
    public int f32635x;
    public final int f32636y;

    public yh0(Context context, int i10) {
        super(context);
        this.f32623a = new ArrayList();
        Paint paint = new Paint();
        this.f32625b = paint;
        this.f32627c = new Paint();
        this.e = true;
        this.f32630f = -1.0f;
        this.h = new Path();
        this.f32631n = new Path();
        this.f32635x = 0;
        this.E = 0.0f;
        this.F = null;
        this.G = new HashSet();
        this.H = 6;
        this.K = null;
        this.Q = 0;
        this.T = new Matrix();
        this.W = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.N = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.O = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.P = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.f32636y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f32635x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static vh0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            vh0 vh0Var = (vh0) list.get(i11);
            if (!vh0Var.f31299o && vh0Var.f31288a == i10) {
                return vh0Var;
            }
        }
        return null;
    }

    public final void a() {
        vh0 vh0Var = new vh0(this, wh0.I);
        vh0Var.f31288a = 14;
        this.f32623a.add(vh0Var);
    }

    public final void b() {
        vh0 vh0Var = new vh0(this, wh0.J);
        vh0Var.f31288a = 16;
        this.f32623a.add(vh0Var);
    }

    public final void c() {
        vh0 vh0Var = new vh0(this, wh0.K);
        vh0Var.f31288a = 17;
        this.f32623a.add(vh0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f32635x = this.f32623a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.G;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.H;
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
        AndroidUtilities.runOnUIThread(new yt(26, this, arrayList));
    }

    public final void e() {
        this.I = true;
    }

    public final boolean f() {
        int i10 = this.H;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f7;
        int i10 = this.Q;
        if (i10 != 0) {
            if (!this.R) {
                this.f32625b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f32635x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f32635x);
            float f11 = max / 2.0f;
            float f12 = this.f32636y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.h6.m1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f32627c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f32629d0 == null) {
            this.f32629d0 = new uh0(this);
        }
        return this.f32629d0;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f7) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.V);
        drawable.setAlpha((int) (f7 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.f32634w != null) {
            this.f32634w = null;
            this.f32632r = null;
            invalidate();
        }
    }

    public final vh0 k(int i10) {
        vh0 j10 = j(i10, this.f32623a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new vh0(this, wh0.d);
                break;
            case 1:
                j10 = new vh0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new vh0(this, wh0.h);
                break;
            case 3:
                j10 = new vh0(this, wh0.f32116n);
                j10.f31304t = true;
                j10.f31307x = 200;
                break;
            case 4:
                j10 = new vh0(this, wh0.f32117r);
                break;
            case 5:
                j10 = new vh0(this, wh0.f32118s);
                this.K = j10;
                j10.f31304t = true;
                j10.f31307x = 500;
                break;
            case 6:
                j10 = new vh0(this, wh0.v);
                j10.f31304t = true;
                j10.f31307x = 500;
                break;
            case 7:
                j10 = new vh0(this, wh0.f32119w);
                j10.f31304t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new vh0(this, wh0.f32120x);
                j10.f31304t = true;
                j10.f31307x = 500;
                break;
            case 9:
                j10 = new vh0(this, wh0.f32121y);
                j10.f31304t = true;
                j10.f31305u = R.raw.profile_leave;
                j10.f31307x = 300;
                break;
            case 10:
                j10 = new vh0(this, wh0.E);
                j10.f31304t = true;
                j10.f31305u = R.raw.profile_voicechat;
                j10.f31307x = 500;
                break;
            case 11:
                j10 = new vh0(this, wh0.F);
                j10.f31304t = true;
                j10.f31305u = R.raw.profile_voicechat;
                j10.f31307x = 500;
                break;
            case 12:
                j10 = new vh0(this, wh0.G);
                break;
            case 13:
                j10 = new vh0(this, wh0.H);
                j10.f31304t = true;
                j10.f31307x = 300;
                break;
        }
        if (j10 != null) {
            j10.f31288a = i10;
        }
        return j10;
    }

    public final boolean l() {
        if (this.G.contains(5) && this.K != null) {
            return true;
        }
        return false;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.G.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i11))) {
            arrayList.add(k(i10));
        }
    }

    public final void o(int i10, boolean z10) {
        boolean remove;
        HashSet hashSet = this.G;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f32636y + this.P + this.O), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vh0 vh0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.f32623a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    vh0 vh0Var2 = (vh0) arrayList.get(i10);
                    if (!vh0Var2.f31299o && vh0Var2.d.contains(x10, y3)) {
                        this.W = vh0Var2;
                        this.f32624a0 = x10;
                        this.f32626b0 = y3;
                        this.f32628c0 = System.currentTimeMillis();
                        this.W.f31289b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.f32624a0) > 20.0f || Math.abs(y3 - this.f32626b0) > 20.0f)) {
                    this.W.f31289b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (vh0Var = this.W) != null) {
                vh0Var.f31289b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.f32628c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    vh0 vh0Var3 = this.W;
                    if (vh0Var3.f31304t && !vh0Var3.f31303s) {
                        vh0Var3.f31303s = true;
                        invalidate();
                    }
                    vh0 vh0Var4 = this.W;
                    int i11 = vh0Var4.f31305u;
                    if (i11 != 0) {
                        vh0Var4.d(i11, 0, 0);
                    }
                    this.W.f31306w = System.currentTimeMillis();
                    vh0 vh0Var5 = this.W;
                    xh0 xh0Var = this.F;
                    if (xh0Var != null) {
                        int i12 = vh0Var5.v;
                        if (i12 == 0) {
                            int i13 = vh0Var5.f31288a;
                            RectF rectF = vh0Var5.d;
                            ProfileActivity.e0(((org.telegram.ui.mx0) xh0Var).f39358b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new yt(27, this, vh0Var5), i12);
                        }
                    }
                }
                this.W = null;
                return true;
            }
            if (this.W != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(vh0 vh0Var, boolean z10) {
        wh0 wh0Var;
        if (z10) {
            if (this.J) {
                wh0 wh0Var2 = wh0.e;
                vh0Var.c(LocaleController.getString(wh0Var2.f32122a));
                vh0Var.d(R.raw.profile_unmuting, wh0Var2.f32123b, wh0Var2.f32124c);
                return;
            }
            wh0 wh0Var3 = wh0.f32115f;
            vh0Var.c(LocaleController.getString(wh0Var3.f32122a));
            vh0Var.d(R.raw.profile_muting, wh0Var3.f32123b, wh0Var3.f32124c);
            return;
        }
        if (this.J) {
            wh0Var = wh0.e;
        } else {
            wh0Var = wh0.f32115f;
        }
        vh0Var.d(0, wh0Var.f32123b, wh0Var.f32124c);
        vh0Var.c(LocaleController.getString(wh0Var.f32122a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        vh0 j10 = j(1, this.f32623a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
            return;
        }
        this.G.add(1);
        d();
    }

    public void setOnActionClickListener(xh0 xh0Var) {
        this.F = xh0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof ba0)) {
            return false;
        }
        return true;
    }
}
