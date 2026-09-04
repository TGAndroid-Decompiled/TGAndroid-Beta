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
    public final ArrayList f25385a;
    public float f25386a0;
    public final Paint f25387b;
    public float f25388b0;
    public final Paint f25389c;
    public long f25390c0;
    public float d;
    public zg0 f25391d0;
    public boolean f25392e;
    public float f25393f;
    public final Path h;
    public final Path f25394n;
    public org.telegram.ui.n01 f25395r;
    public float f25396s;
    public float v;
    public RenderNode f25397w;
    public int f25398x;
    public final int f25399y;

    public dh0(Context context, int i10) {
        super(context);
        this.f25385a = new ArrayList();
        Paint paint = new Paint();
        this.f25387b = paint;
        this.f25389c = new Paint();
        this.f25392e = true;
        this.f25393f = -1.0f;
        this.h = new Path();
        this.f25394n = new Path();
        this.f25398x = 0;
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
        this.f25399y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f25398x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static ah0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ah0 ah0Var = (ah0) list.get(i11);
            if (!ah0Var.f24386o && ah0Var.f24374a == i10) {
                return ah0Var;
            }
        }
        return null;
    }

    public final void a() {
        ah0 ah0Var = new ah0(this, bh0.I);
        ah0Var.f24374a = 14;
        this.f25385a.add(ah0Var);
    }

    public final void b() {
        ah0 ah0Var = new ah0(this, bh0.J);
        ah0Var.f24374a = 16;
        this.f25385a.add(ah0Var);
    }

    public final void c() {
        ah0 ah0Var = new ah0(this, bh0.K);
        ah0Var.f24374a = 17;
        this.f25385a.add(ah0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f25398x = this.f25385a.size();
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
                this.f25387b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f25398x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f25398x);
            float f11 = max / 2.0f;
            float f12 = this.f25399y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.j6.l1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f25389c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f25391d0 == null) {
            this.f25391d0 = new zg0(this);
        }
        return this.f25391d0;
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
        if (this.f25397w != null) {
            this.f25397w = null;
            this.f25395r = null;
            invalidate();
        }
    }

    public final ah0 k(int i10) {
        ah0 j3 = j(i10, this.f25385a);
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
                j3 = new ah0(this, bh0.f24702n);
                j3.f24391t = true;
                j3.f24394x = 200;
                break;
            case 4:
                j3 = new ah0(this, bh0.f24703r);
                break;
            case 5:
                j3 = new ah0(this, bh0.f24704s);
                this.K = j3;
                j3.f24391t = true;
                j3.f24394x = 500;
                break;
            case 6:
                j3 = new ah0(this, bh0.v);
                j3.f24391t = true;
                j3.f24394x = 500;
                break;
            case 7:
                j3 = new ah0(this, bh0.f24705w);
                j3.f24391t = true;
                j3.v = 300;
                break;
            case 8:
                j3 = new ah0(this, bh0.f24706x);
                j3.f24391t = true;
                j3.f24394x = 500;
                break;
            case 9:
                j3 = new ah0(this, bh0.f24707y);
                j3.f24391t = true;
                j3.f24392u = R.raw.profile_leave;
                j3.f24394x = 300;
                break;
            case 10:
                j3 = new ah0(this, bh0.E);
                j3.f24391t = true;
                j3.f24392u = R.raw.profile_voicechat;
                j3.f24394x = 500;
                break;
            case 11:
                j3 = new ah0(this, bh0.F);
                j3.f24391t = true;
                j3.f24392u = R.raw.profile_voicechat;
                j3.f24394x = 500;
                break;
            case 12:
                j3 = new ah0(this, bh0.G);
                break;
            case 13:
                j3 = new ah0(this, bh0.H);
                j3.f24391t = true;
                j3.f24394x = 300;
                break;
        }
        if (j3 != null) {
            j3.f24374a = i10;
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f25399y + this.P + this.O), 1073741824));
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
                ArrayList arrayList = this.f25385a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    ah0 ah0Var2 = (ah0) arrayList.get(i10);
                    if (!ah0Var2.f24386o && ah0Var2.d.contains(x10, y3)) {
                        this.W = ah0Var2;
                        this.f25386a0 = x10;
                        this.f25388b0 = y3;
                        this.f25390c0 = System.currentTimeMillis();
                        this.W.f24375b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.f25386a0) > 20.0f || Math.abs(y3 - this.f25388b0) > 20.0f)) {
                    this.W.f24375b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (ah0Var = this.W) != null) {
                ah0Var.f24375b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.f25390c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ah0 ah0Var3 = this.W;
                    if (ah0Var3.f24391t && !ah0Var3.f24390s) {
                        ah0Var3.f24390s = true;
                        invalidate();
                    }
                    ah0 ah0Var4 = this.W;
                    int i11 = ah0Var4.f24392u;
                    if (i11 != 0) {
                        ah0Var4.d(i11, 0, 0);
                    }
                    this.W.f24393w = System.currentTimeMillis();
                    ah0 ah0Var5 = this.W;
                    ch0 ch0Var = this.F;
                    if (ch0Var != null) {
                        int i12 = ah0Var5.v;
                        if (i12 == 0) {
                            int i13 = ah0Var5.f24374a;
                            RectF rectF = ah0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).f38152b, i13, rectF.left, rectF.top);
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
                bh0 bh0Var2 = bh0.f24700e;
                ah0Var.c(LocaleController.getString(bh0Var2.f24708a));
                ah0Var.d(R.raw.profile_unmuting, bh0Var2.f24709b, bh0Var2.f24710c);
                return;
            }
            bh0 bh0Var3 = bh0.f24701f;
            ah0Var.c(LocaleController.getString(bh0Var3.f24708a));
            ah0Var.d(R.raw.profile_muting, bh0Var3.f24709b, bh0Var3.f24710c);
            return;
        }
        if (this.J) {
            bh0Var = bh0.f24700e;
        } else {
            bh0Var = bh0.f24701f;
        }
        ah0Var.d(0, bh0Var.f24709b, bh0Var.f24710c);
        ah0Var.c(LocaleController.getString(bh0Var.f24708a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        ah0 j3 = j(1, this.f25385a);
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
