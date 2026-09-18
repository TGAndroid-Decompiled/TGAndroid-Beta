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
public final class eh0 extends View {
    public float E;
    public dh0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public bh0 K;
    public bh0 L;
    public bh0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public bh0 W;
    public final ArrayList f23558a;
    public float f23559a0;
    public final Paint f23560b;
    public float f23561b0;
    public final Paint f23562c;
    public long f23563c0;
    public float d;
    public ah0 f23564d0;
    public boolean e;
    public float f23565f;
    public final Path h;
    public final Path f23566n;
    public org.telegram.ui.o01 f23567r;
    public float f23568s;
    public float v;
    public RenderNode f23569w;
    public int f23570x;
    public final int f23571y;

    public eh0(Context context, int i10) {
        super(context);
        this.f23558a = new ArrayList();
        Paint paint = new Paint();
        this.f23560b = paint;
        this.f23562c = new Paint();
        this.e = true;
        this.f23565f = -1.0f;
        this.h = new Path();
        this.f23566n = new Path();
        this.f23570x = 0;
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
        this.f23571y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f23570x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static bh0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            bh0 bh0Var = (bh0) list.get(i11);
            if (!bh0Var.f22742o && bh0Var.f22731a == i10) {
                return bh0Var;
            }
        }
        return null;
    }

    public final void a() {
        bh0 bh0Var = new bh0(this, ch0.I);
        bh0Var.f22731a = 14;
        this.f23558a.add(bh0Var);
    }

    public final void b() {
        bh0 bh0Var = new bh0(this, ch0.J);
        bh0Var.f22731a = 16;
        this.f23558a.add(bh0Var);
    }

    public final void c() {
        bh0 bh0Var = new bh0(this, ch0.K);
        bh0Var.f22731a = 17;
        this.f23558a.add(bh0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f23570x = this.f23558a.size();
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
        AndroidUtilities.runOnUIThread(new ny(19, this, arrayList));
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
                this.f23560b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f23570x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f23570x);
            float f11 = max / 2.0f;
            float f12 = this.f23571y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.j6.l1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f23562c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f23564d0 == null) {
            this.f23564d0 = new ah0(this);
        }
        return this.f23564d0;
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
        if (this.f23569w != null) {
            this.f23569w = null;
            this.f23567r = null;
            invalidate();
        }
    }

    public final bh0 k(int i10) {
        bh0 j3 = j(i10, this.f23558a);
        if (j3 != null) {
            if (i10 == 1) {
                p(j3, false);
            }
            return j3;
        }
        switch (i10) {
            case 0:
                j3 = new bh0(this, ch0.d);
                break;
            case 1:
                j3 = new bh0(this);
                p(j3, false);
                break;
            case 2:
                j3 = new bh0(this, ch0.h);
                break;
            case 3:
                j3 = new bh0(this, ch0.f23041n);
                j3.f22747t = true;
                j3.f22750x = 200;
                break;
            case 4:
                j3 = new bh0(this, ch0.f23042r);
                break;
            case 5:
                j3 = new bh0(this, ch0.f23043s);
                this.K = j3;
                j3.f22747t = true;
                j3.f22750x = 500;
                break;
            case 6:
                j3 = new bh0(this, ch0.v);
                j3.f22747t = true;
                j3.f22750x = 500;
                break;
            case 7:
                j3 = new bh0(this, ch0.f23044w);
                j3.f22747t = true;
                j3.v = 300;
                break;
            case 8:
                j3 = new bh0(this, ch0.f23045x);
                j3.f22747t = true;
                j3.f22750x = 500;
                break;
            case 9:
                j3 = new bh0(this, ch0.f23046y);
                j3.f22747t = true;
                j3.f22748u = R.raw.profile_leave;
                j3.f22750x = 300;
                break;
            case 10:
                j3 = new bh0(this, ch0.E);
                j3.f22747t = true;
                j3.f22748u = R.raw.profile_voicechat;
                j3.f22750x = 500;
                break;
            case 11:
                j3 = new bh0(this, ch0.F);
                j3.f22747t = true;
                j3.f22748u = R.raw.profile_voicechat;
                j3.f22750x = 500;
                break;
            case 12:
                j3 = new bh0(this, ch0.G);
                break;
            case 13:
                j3 = new bh0(this, ch0.H);
                j3.f22747t = true;
                j3.f22750x = 300;
                break;
        }
        if (j3 != null) {
            j3.f22731a = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f23571y + this.P + this.O), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bh0 bh0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.f23558a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    bh0 bh0Var2 = (bh0) arrayList.get(i10);
                    if (!bh0Var2.f22742o && bh0Var2.d.contains(x10, y3)) {
                        this.W = bh0Var2;
                        this.f23559a0 = x10;
                        this.f23561b0 = y3;
                        this.f23563c0 = System.currentTimeMillis();
                        this.W.f22732b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.f23559a0) > 20.0f || Math.abs(y3 - this.f23561b0) > 20.0f)) {
                    this.W.f22732b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (bh0Var = this.W) != null) {
                bh0Var.f22732b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.f23563c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    bh0 bh0Var3 = this.W;
                    if (bh0Var3.f22747t && !bh0Var3.f22746s) {
                        bh0Var3.f22746s = true;
                        invalidate();
                    }
                    bh0 bh0Var4 = this.W;
                    int i11 = bh0Var4.f22748u;
                    if (i11 != 0) {
                        bh0Var4.d(i11, 0, 0);
                    }
                    this.W.f22749w = System.currentTimeMillis();
                    bh0 bh0Var5 = this.W;
                    dh0 dh0Var = this.F;
                    if (dh0Var != null) {
                        int i12 = bh0Var5.v;
                        if (i12 == 0) {
                            int i13 = bh0Var5.f22731a;
                            RectF rectF = bh0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.my0) dh0Var).f35912b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new ny(20, this, bh0Var5), i12);
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

    public final void p(bh0 bh0Var, boolean z10) {
        ch0 ch0Var;
        if (z10) {
            if (this.J) {
                ch0 ch0Var2 = ch0.e;
                bh0Var.c(LocaleController.getString(ch0Var2.f23047a));
                bh0Var.d(R.raw.profile_unmuting, ch0Var2.f23048b, ch0Var2.f23049c);
                return;
            }
            ch0 ch0Var3 = ch0.f23040f;
            bh0Var.c(LocaleController.getString(ch0Var3.f23047a));
            bh0Var.d(R.raw.profile_muting, ch0Var3.f23048b, ch0Var3.f23049c);
            return;
        }
        if (this.J) {
            ch0Var = ch0.e;
        } else {
            ch0Var = ch0.f23040f;
        }
        bh0Var.d(0, ch0Var.f23048b, ch0Var.f23049c);
        bh0Var.c(LocaleController.getString(ch0Var.f23047a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        bh0 j3 = j(1, this.f23558a);
        if (j3 != null) {
            p(j3, z11);
            invalidate();
            return;
        }
        this.G.add(1);
        d();
    }

    public void setOnActionClickListener(dh0 dh0Var) {
        this.F = dh0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof g90)) {
            return false;
        }
        return true;
    }
}
