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
public final class dh0 extends View {
    public float E;
    public ch0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public ah0 K;
    public ah0 L;
    public ah0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public ah0 W;
    public final ArrayList f25386a;
    public float f25387a0;
    public final Paint f25388b;
    public float f25389b0;
    public final Paint f25390c;
    public long f25391c0;
    public float d;
    public zg0 f25392d0;
    public boolean f25393e;
    public float f25394f;
    public final Path h;
    public final Path f25395n;
    public org.telegram.ui.n01 f25396r;
    public float f25397s;
    public float v;
    public RenderNode f25398w;
    public int f25399x;
    public final int f25400y;

    public dh0(Context context, int i10) {
        super(context);
        this.f25386a = new ArrayList();
        Paint paint = new Paint();
        this.f25388b = paint;
        this.f25390c = new Paint();
        this.f25393e = true;
        this.f25394f = -1.0f;
        this.h = new Path();
        this.f25395n = new Path();
        this.f25399x = 0;
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
        this.f25400y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f25399x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static ah0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ah0 ah0Var = (ah0) list.get(i11);
            if (!ah0Var.f24387o && ah0Var.f24375a == i10) {
                return ah0Var;
            }
        }
        return null;
    }

    public final void a() {
        ah0 ah0Var = new ah0(this, bh0.I);
        ah0Var.f24375a = 14;
        this.f25386a.add(ah0Var);
    }

    public final void b() {
        ah0 ah0Var = new ah0(this, bh0.J);
        ah0Var.f24375a = 16;
        this.f25386a.add(ah0Var);
    }

    public final void c() {
        ah0 ah0Var = new ah0(this, bh0.K);
        ah0Var.f24375a = 17;
        this.f25386a.add(ah0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f25399x = this.f25386a.size();
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
        AndroidUtilities.runOnUIThread(new zu(25, this, arrayList));
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
                this.f25388b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f25399x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f25399x);
            float f11 = max / 2.0f;
            float f12 = this.f25400y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.j6.l1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f25390c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f25392d0 == null) {
            this.f25392d0 = new zg0(this);
        }
        return this.f25392d0;
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
        if (this.f25398w != null) {
            this.f25398w = null;
            this.f25396r = null;
            invalidate();
        }
    }

    public final ah0 k(int i10) {
        ah0 j3 = j(i10, this.f25386a);
        if (j3 != null) {
            if (i10 == 1) {
                p(j3, false);
            }
            return j3;
        }
        switch (i10) {
            case 0:
                j3 = new ah0(this, bh0.d);
                break;
            case 1:
                j3 = new ah0(this);
                p(j3, false);
                break;
            case 2:
                j3 = new ah0(this, bh0.h);
                break;
            case 3:
                j3 = new ah0(this, bh0.f24703n);
                j3.f24392t = true;
                j3.f24395x = 200;
                break;
            case 4:
                j3 = new ah0(this, bh0.f24704r);
                break;
            case 5:
                j3 = new ah0(this, bh0.f24705s);
                this.K = j3;
                j3.f24392t = true;
                j3.f24395x = 500;
                break;
            case 6:
                j3 = new ah0(this, bh0.v);
                j3.f24392t = true;
                j3.f24395x = 500;
                break;
            case 7:
                j3 = new ah0(this, bh0.f24706w);
                j3.f24392t = true;
                j3.v = 300;
                break;
            case 8:
                j3 = new ah0(this, bh0.f24707x);
                j3.f24392t = true;
                j3.f24395x = 500;
                break;
            case 9:
                j3 = new ah0(this, bh0.f24708y);
                j3.f24392t = true;
                j3.f24393u = R.raw.profile_leave;
                j3.f24395x = 300;
                break;
            case 10:
                j3 = new ah0(this, bh0.E);
                j3.f24392t = true;
                j3.f24393u = R.raw.profile_voicechat;
                j3.f24395x = 500;
                break;
            case 11:
                j3 = new ah0(this, bh0.F);
                j3.f24392t = true;
                j3.f24393u = R.raw.profile_voicechat;
                j3.f24395x = 500;
                break;
            case 12:
                j3 = new ah0(this, bh0.G);
                break;
            case 13:
                j3 = new ah0(this, bh0.H);
                j3.f24392t = true;
                j3.f24395x = 300;
                break;
        }
        if (j3 != null) {
            j3.f24375a = i10;
        }
        return j3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f25400y + this.P + this.O), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ah0 ah0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.f25386a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    ah0 ah0Var2 = (ah0) arrayList.get(i10);
                    if (!ah0Var2.f24387o && ah0Var2.d.contains(x10, y3)) {
                        this.W = ah0Var2;
                        this.f25387a0 = x10;
                        this.f25389b0 = y3;
                        this.f25391c0 = System.currentTimeMillis();
                        this.W.f24376b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.f25387a0) > 20.0f || Math.abs(y3 - this.f25389b0) > 20.0f)) {
                    this.W.f24376b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (ah0Var = this.W) != null) {
                ah0Var.f24376b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.f25391c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ah0 ah0Var3 = this.W;
                    if (ah0Var3.f24392t && !ah0Var3.f24391s) {
                        ah0Var3.f24391s = true;
                        invalidate();
                    }
                    ah0 ah0Var4 = this.W;
                    int i11 = ah0Var4.f24393u;
                    if (i11 != 0) {
                        ah0Var4.d(i11, 0, 0);
                    }
                    this.W.f24394w = System.currentTimeMillis();
                    ah0 ah0Var5 = this.W;
                    ch0 ch0Var = this.F;
                    if (ch0Var != null) {
                        int i12 = ah0Var5.v;
                        if (i12 == 0) {
                            int i13 = ah0Var5.f24375a;
                            RectF rectF = ah0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).f38153b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new zu(26, this, ah0Var5), i12);
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

    public final void p(ah0 ah0Var, boolean z10) {
        bh0 bh0Var;
        if (z10) {
            if (this.J) {
                bh0 bh0Var2 = bh0.f24701e;
                ah0Var.c(LocaleController.getString(bh0Var2.f24709a));
                ah0Var.d(R.raw.profile_unmuting, bh0Var2.f24710b, bh0Var2.f24711c);
                return;
            }
            bh0 bh0Var3 = bh0.f24702f;
            ah0Var.c(LocaleController.getString(bh0Var3.f24709a));
            ah0Var.d(R.raw.profile_muting, bh0Var3.f24710b, bh0Var3.f24711c);
            return;
        }
        if (this.J) {
            bh0Var = bh0.f24701e;
        } else {
            bh0Var = bh0.f24702f;
        }
        ah0Var.d(0, bh0Var.f24710b, bh0Var.f24711c);
        ah0Var.c(LocaleController.getString(bh0Var.f24709a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        ah0 j3 = j(1, this.f25386a);
        if (j3 != null) {
            p(j3, z11);
            invalidate();
            return;
        }
        this.G.add(1);
        d();
    }

    public void setOnActionClickListener(ch0 ch0Var) {
        this.F = ch0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof h90)) {
            return false;
        }
        return true;
    }
}
