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
public final class lh0 extends View {
    public float B;
    public kh0 C;
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public ih0 H;
    public ih0 I;
    public ih0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public ih0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList f28758a;
    public hh0 f28759a0;
    public final Paint f28760b;
    public final Paint f28761c;
    public float d;
    public boolean f28762e;
    public float f28763f;
    public final Path h;
    public final Path f28764n;
    public org.telegram.ui.a01 f28765r;
    public float f28766s;
    public float v;
    public RenderNode f28767w;
    public int f28768x;
    public final int f28769y;

    public lh0(Context context, int i10) {
        super(context);
        this.f28758a = new ArrayList();
        Paint paint = new Paint();
        this.f28760b = paint;
        this.f28761c = new Paint();
        this.f28762e = true;
        this.f28763f = -1.0f;
        this.h = new Path();
        this.f28764n = new Path();
        this.f28768x = 0;
        this.B = 0.0f;
        this.C = null;
        this.D = new HashSet();
        this.E = 6;
        this.H = null;
        this.N = 0;
        this.Q = new Matrix();
        this.T = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.K = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.L = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.M = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.f28769y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.K;
        int i10 = this.f28768x;
        return ((measuredWidth - ((f10 / 2.0f) * (i10 - 1))) - (f10 * 2.0f)) / i10;
    }

    public static ih0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ih0 ih0Var = (ih0) list.get(i11);
            if (!ih0Var.f27831o && ih0Var.f27819a == i10) {
                return ih0Var;
            }
        }
        return null;
    }

    public final void a() {
        ih0 ih0Var = new ih0(this, jh0.F);
        ih0Var.f27819a = 14;
        this.f28758a.add(ih0Var);
    }

    public final void b() {
        ih0 ih0Var = new ih0(this, jh0.G);
        ih0Var.f27819a = 16;
        this.f28758a.add(ih0Var);
    }

    public final void c() {
        ih0 ih0Var = new ih0(this, jh0.H);
        ih0Var.f27819a = 17;
        this.f28758a.add(ih0Var);
    }

    public final void d() {
        boolean z4;
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.f28768x = this.f28758a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.D;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i10 = this.E;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        if (i10 == 5) {
                            m(0, arrayList);
                            m(1, arrayList);
                        }
                    } else {
                        if (z4) {
                            m(7, arrayList);
                        } else {
                            m(0, arrayList);
                        }
                        m(1, arrayList);
                        if (z4) {
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
                if (z4) {
                    m(7, arrayList);
                } else {
                    m(10, arrayList);
                    n(11, 10, arrayList);
                }
                m(1, arrayList);
                if (!z4) {
                    m(2, arrayList);
                    if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                        arrayList.add(k(3));
                    }
                }
                n(4, 12, arrayList);
                if (z4) {
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
        AndroidUtilities.runOnUIThread(new b90(5, this, arrayList));
    }

    public final void e() {
        this.F = true;
    }

    public final boolean f() {
        int i10 = this.E;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f10;
        int i10 = this.N;
        if (i10 != 0) {
            if (!this.O) {
                this.f28760b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.K;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f28768x - 1))) - (f11 * 2.0f)) / Math.max(1, this.f28768x);
            float f12 = max / 2.0f;
            float f13 = this.f28769y / 2.0f;
            if (this.O) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.k6.l1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
            this.P = radialGradient;
            this.f28761c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f28759a0 == null) {
            this.f28759a0 = new hh0(this);
        }
        return this.f28759a0;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.f28767w != null) {
            this.f28767w = null;
            this.f28765r = null;
            invalidate();
        }
    }

    public final ih0 k(int i10) {
        ih0 j10 = j(i10, this.f28758a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new ih0(this, jh0.d);
                break;
            case 1:
                j10 = new ih0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new ih0(this, jh0.h);
                break;
            case 3:
                j10 = new ih0(this, jh0.f28104n);
                j10.f27836t = true;
                j10.f27839x = 200;
                break;
            case 4:
                j10 = new ih0(this, jh0.f28105r);
                break;
            case 5:
                j10 = new ih0(this, jh0.f28106s);
                this.H = j10;
                j10.f27836t = true;
                j10.f27839x = 500;
                break;
            case 6:
                j10 = new ih0(this, jh0.v);
                j10.f27836t = true;
                j10.f27839x = 500;
                break;
            case 7:
                j10 = new ih0(this, jh0.f28107w);
                j10.f27836t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new ih0(this, jh0.f28108x);
                j10.f27836t = true;
                j10.f27839x = 500;
                break;
            case 9:
                j10 = new ih0(this, jh0.f28109y);
                j10.f27836t = true;
                j10.f27837u = R.raw.profile_leave;
                j10.f27839x = 300;
                break;
            case 10:
                j10 = new ih0(this, jh0.B);
                j10.f27836t = true;
                j10.f27837u = R.raw.profile_voicechat;
                j10.f27839x = 500;
                break;
            case 11:
                j10 = new ih0(this, jh0.C);
                j10.f27836t = true;
                j10.f27837u = R.raw.profile_voicechat;
                j10.f27839x = 500;
                break;
            case 12:
                j10 = new ih0(this, jh0.D);
                break;
            case 13:
                j10 = new ih0(this, jh0.E);
                j10.f27836t = true;
                j10.f27839x = 300;
                break;
        }
        if (j10 != null) {
            j10.f27819a = i10;
        }
        return j10;
    }

    public final boolean l() {
        if (this.D.contains(5) && this.H != null) {
            return true;
        }
        return false;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.D.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.D;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i11))) {
            arrayList.add(k(i10));
        }
    }

    public final void o(int i10, boolean z4) {
        boolean remove;
        HashSet hashSet = this.D;
        if (z4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lh0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f28769y + this.M + this.L), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ih0 ih0Var;
        if (this.B >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.f28758a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    ih0 ih0Var2 = (ih0) arrayList.get(i10);
                    if (!ih0Var2.f27831o && ih0Var2.d.contains(x10, y10)) {
                        this.T = ih0Var2;
                        this.U = x10;
                        this.V = y10;
                        this.W = System.currentTimeMillis();
                        this.T.f27820b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y10 - this.V) > 20.0f)) {
                    this.T.f27820b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (ih0Var = this.T) != null) {
                ih0Var.f27820b.c(false);
                if (action == 1 && this.T.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ih0 ih0Var3 = this.T;
                    if (ih0Var3.f27836t && !ih0Var3.f27835s) {
                        ih0Var3.f27835s = true;
                        invalidate();
                    }
                    ih0 ih0Var4 = this.T;
                    int i11 = ih0Var4.f27837u;
                    if (i11 != 0) {
                        ih0Var4.d(i11, 0, 0);
                    }
                    this.T.f27838w = System.currentTimeMillis();
                    ih0 ih0Var5 = this.T;
                    kh0 kh0Var = this.C;
                    if (kh0Var != null) {
                        int i12 = ih0Var5.v;
                        if (i12 == 0) {
                            int i13 = ih0Var5.f27819a;
                            RectF rectF = ih0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.wx0) kh0Var).f42873b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new b90(6, this, ih0Var5), i12);
                        }
                    }
                }
                this.T = null;
                return true;
            }
            if (this.T != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(ih0 ih0Var, boolean z4) {
        jh0 jh0Var;
        if (z4) {
            if (this.G) {
                jh0 jh0Var2 = jh0.f28102e;
                ih0Var.c(LocaleController.getString(jh0Var2.f28110a));
                ih0Var.d(R.raw.profile_unmuting, jh0Var2.f28111b, jh0Var2.f28112c);
                return;
            }
            jh0 jh0Var3 = jh0.f28103f;
            ih0Var.c(LocaleController.getString(jh0Var3.f28110a));
            ih0Var.d(R.raw.profile_muting, jh0Var3.f28111b, jh0Var3.f28112c);
            return;
        }
        if (this.G) {
            jh0Var = jh0.f28102e;
        } else {
            jh0Var = jh0.f28103f;
        }
        ih0Var.d(0, jh0Var.f28111b, jh0Var.f28112c);
        ih0Var.c(LocaleController.getString(jh0Var.f28110a));
    }

    public void setNotifications(boolean z4) {
        boolean z10;
        if (this.G != z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z4;
        ih0 j10 = j(1, this.f28758a);
        if (j10 != null) {
            p(j10, z10);
            invalidate();
            return;
        }
        this.D.add(1);
        d();
    }

    public void setOnActionClickListener(kh0 kh0Var) {
        this.C = kh0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof k90)) {
            return false;
        }
        return true;
    }
}
