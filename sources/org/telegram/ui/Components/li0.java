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
public final class li0 extends View {
    public float E;
    public ki0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public ii0 K;
    public ii0 L;
    public ii0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public ii0 W;
    public final ArrayList f28191a;
    public float f28192a0;
    public final Paint f28193b;
    public float f28194b0;
    public final Paint f28195c;
    public long f28196c0;
    public float d;
    public hi0 f28197d0;
    public boolean f28198e;
    public float f28199f;
    public final Path h;
    public final Path f28200n;
    public org.telegram.ui.n01 f28201r;
    public float f28202s;
    public float v;
    public RenderNode f28203w;
    public int f28204x;
    public final int f28205y;

    public li0(Context context, int i10) {
        super(context);
        this.f28191a = new ArrayList();
        Paint paint = new Paint();
        this.f28193b = paint;
        this.f28195c = new Paint();
        this.f28198e = true;
        this.f28199f = -1.0f;
        this.h = new Path();
        this.f28200n = new Path();
        this.f28204x = 0;
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
        this.f28205y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f28204x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static ii0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ii0 ii0Var = (ii0) list.get(i11);
            if (!ii0Var.f27162o && ii0Var.f27150a == i10) {
                return ii0Var;
            }
        }
        return null;
    }

    public final void a() {
        ii0 ii0Var = new ii0(this, ji0.I);
        ii0Var.f27150a = 14;
        this.f28191a.add(ii0Var);
    }

    public final void b() {
        ii0 ii0Var = new ii0(this, ji0.J);
        ii0Var.f27150a = 16;
        this.f28191a.add(ii0Var);
    }

    public final void c() {
        ii0 ii0Var = new ii0(this, ji0.K);
        ii0Var.f27150a = 17;
        this.f28191a.add(ii0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f28204x = this.f28191a.size();
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
        AndroidUtilities.runOnUIThread(new jt(29, this, arrayList));
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
                this.f28193b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f28204x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f28204x);
            float f11 = max / 2.0f;
            float f12 = this.f28205y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.h6.m1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f28195c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f28197d0 == null) {
            this.f28197d0 = new hi0(this);
        }
        return this.f28197d0;
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
        if (this.f28203w != null) {
            this.f28203w = null;
            this.f28201r = null;
            invalidate();
        }
    }

    public final ii0 k(int i10) {
        ii0 j3 = j(i10, this.f28191a);
        if (j3 != null) {
            if (i10 == 1) {
                p(j3, false);
            }
            return j3;
        }
        switch (i10) {
            case 0:
                j3 = new ii0(this, ji0.d);
                break;
            case 1:
                j3 = new ii0(this);
                p(j3, false);
                break;
            case 2:
                j3 = new ii0(this, ji0.h);
                break;
            case 3:
                j3 = new ii0(this, ji0.f27526n);
                j3.f27167t = true;
                j3.f27170x = 200;
                break;
            case 4:
                j3 = new ii0(this, ji0.f27527r);
                break;
            case 5:
                j3 = new ii0(this, ji0.f27528s);
                this.K = j3;
                j3.f27167t = true;
                j3.f27170x = 500;
                break;
            case 6:
                j3 = new ii0(this, ji0.v);
                j3.f27167t = true;
                j3.f27170x = 500;
                break;
            case 7:
                j3 = new ii0(this, ji0.f27529w);
                j3.f27167t = true;
                j3.v = 300;
                break;
            case 8:
                j3 = new ii0(this, ji0.f27530x);
                j3.f27167t = true;
                j3.f27170x = 500;
                break;
            case 9:
                j3 = new ii0(this, ji0.f27531y);
                j3.f27167t = true;
                j3.f27168u = R.raw.profile_leave;
                j3.f27170x = 300;
                break;
            case 10:
                j3 = new ii0(this, ji0.E);
                j3.f27167t = true;
                j3.f27168u = R.raw.profile_voicechat;
                j3.f27170x = 500;
                break;
            case 11:
                j3 = new ii0(this, ji0.F);
                j3.f27167t = true;
                j3.f27168u = R.raw.profile_voicechat;
                j3.f27170x = 500;
                break;
            case 12:
                j3 = new ii0(this, ji0.G);
                break;
            case 13:
                j3 = new ii0(this, ji0.H);
                j3.f27167t = true;
                j3.f27170x = 300;
                break;
        }
        if (j3 != null) {
            j3.f27150a = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f28205y + this.P + this.O), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ii0 ii0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.f28191a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    ii0 ii0Var2 = (ii0) arrayList.get(i10);
                    if (!ii0Var2.f27162o && ii0Var2.d.contains(x10, y3)) {
                        this.W = ii0Var2;
                        this.f28192a0 = x10;
                        this.f28194b0 = y3;
                        this.f28196c0 = System.currentTimeMillis();
                        this.W.f27151b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x10 - this.f28192a0) > 20.0f || Math.abs(y3 - this.f28194b0) > 20.0f)) {
                    this.W.f27151b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (ii0Var = this.W) != null) {
                ii0Var.f27151b.c(false);
                if (action == 1 && this.W.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.f28196c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ii0 ii0Var3 = this.W;
                    if (ii0Var3.f27167t && !ii0Var3.f27166s) {
                        ii0Var3.f27166s = true;
                        invalidate();
                    }
                    ii0 ii0Var4 = this.W;
                    int i11 = ii0Var4.f27168u;
                    if (i11 != 0) {
                        ii0Var4.d(i11, 0, 0);
                    }
                    this.W.f27169w = System.currentTimeMillis();
                    ii0 ii0Var5 = this.W;
                    ki0 ki0Var = this.F;
                    if (ki0Var != null) {
                        int i12 = ii0Var5.v;
                        if (i12 == 0) {
                            int i13 = ii0Var5.f27150a;
                            RectF rectF = ii0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.ly0) ki0Var).f39871b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new gi0(0, this, ii0Var5), i12);
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

    public final void p(ii0 ii0Var, boolean z10) {
        ji0 ji0Var;
        if (z10) {
            if (this.J) {
                ji0 ji0Var2 = ji0.f27524e;
                ii0Var.c(LocaleController.getString(ji0Var2.f27532a));
                ii0Var.d(R.raw.profile_unmuting, ji0Var2.f27533b, ji0Var2.f27534c);
                return;
            }
            ji0 ji0Var3 = ji0.f27525f;
            ii0Var.c(LocaleController.getString(ji0Var3.f27532a));
            ii0Var.d(R.raw.profile_muting, ji0Var3.f27533b, ji0Var3.f27534c);
            return;
        }
        if (this.J) {
            ji0Var = ji0.f27524e;
        } else {
            ji0Var = ji0.f27525f;
        }
        ii0Var.d(0, ji0Var.f27533b, ji0Var.f27534c);
        ii0Var.c(LocaleController.getString(ji0Var.f27532a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        ii0 j3 = j(1, this.f28191a);
        if (j3 != null) {
            p(j3, z11);
            invalidate();
            return;
        }
        this.G.add(1);
        d();
    }

    public void setOnActionClickListener(ki0 ki0Var) {
        this.F = ki0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof ma0)) {
            return false;
        }
        return true;
    }
}
