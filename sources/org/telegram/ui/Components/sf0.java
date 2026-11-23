package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.ui.ProfileActivity;
public final class sf0 extends View {
    public final HashSet E;
    public int F;
    public boolean G;
    public boolean H;
    public pf0 I;
    public pf0 J;
    public pf0 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public pf0 U;
    public float V;
    public float W;
    public final ArrayList f39591a;
    public long f39592a0;
    public final Paint f39593b;
    public of0 f39594b0;
    public final Paint f39595c;
    public float d;
    public boolean f39596e;
    public float f39597f;
    public dh.c h;
    public final ArrayList f39598n;
    public int f39599r;
    public int f39600s;
    public final int f39601w;
    public float f39602x;
    public rf0 f39603y;

    public sf0(Context context, int i7) {
        super(context);
        this.f39591a = new ArrayList();
        Paint paint = new Paint();
        this.f39593b = paint;
        this.f39595c = new Paint();
        this.f39596e = true;
        this.f39597f = -1.0f;
        this.f39598n = new ArrayList();
        this.f39600s = 0;
        this.f39602x = 0.0f;
        this.f39603y = null;
        this.E = new HashSet();
        this.F = 6;
        this.I = null;
        this.O = 0;
        this.R = new Matrix();
        this.U = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.L = org.telegram.messenger.g0.N(14.0f);
        float N = org.telegram.messenger.g0.N(12.0f);
        this.M = N;
        float N2 = org.telegram.messenger.g0.N(8.0f);
        this.N = N2;
        this.f39601w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.L;
        int i7 = this.f39600s;
        return ((measuredWidth - ((f10 / 2.0f) * (i7 - 1))) - (f10 * 2.0f)) / i7;
    }

    public static pf0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            pf0 pf0Var = (pf0) list.get(i10);
            if (!pf0Var.f38473o && pf0Var.f38461a == i7) {
                return pf0Var;
            }
        }
        return null;
    }

    public final void a() {
        pf0 pf0Var = new pf0(this, qf0.SET_PHOTO);
        pf0Var.f38461a = 14;
        this.f39591a.add(pf0Var);
    }

    public final void b() {
        pf0 pf0Var = new pf0(this, qf0.EDIT_INFO);
        pf0Var.f38461a = 16;
        this.f39591a.add(pf0Var);
    }

    public final void c() {
        pf0 pf0Var = new pf0(this, qf0.SETTINGS);
        pf0Var.f38461a = 17;
        this.f39591a.add(pf0Var);
    }

    public final void d() {
        boolean z10;
        if (this.G) {
            return;
        }
        if (this.F == 6) {
            this.f39600s = this.f39591a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.E;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = this.F;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3 && i7 != 4) {
                        if (i7 == 5) {
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
                            arrayList.add(j(8));
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
                    arrayList.add(j(13));
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
                        arrayList.add(j(3));
                    }
                }
                n(4, 12, arrayList);
                if (z10) {
                    arrayList.add(j(8));
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
        org.telegram.messenger.g0.g3(new bt(27, this, arrayList));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        int i7 = this.F;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f10;
        int i7 = this.O;
        if (i7 != 0) {
            if (!this.P) {
                this.f39593b.setColor(i7);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.L;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f39600s - 1))) - (f11 * 2.0f)) / Math.max(1, this.f39600s);
            float f12 = max / 2.0f;
            float f13 = this.f39601w / 2.0f;
            if (this.P) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.n6.r1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.f39595c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f39594b0 == null) {
            this.f39594b0 = new of0(this);
        }
        return this.f39594b0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.T);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final pf0 j(int i7) {
        pf0 i10 = i(i7, this.f39591a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new pf0(this, qf0.MESSAGE);
                break;
            case 1:
                i10 = new pf0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new pf0(this, qf0.DISCUSS);
                break;
            case 3:
                i10 = new pf0(this, qf0.GIFT);
                i10.f38478t = true;
                i10.f38481x = 200;
                break;
            case 4:
                i10 = new pf0(this, qf0.SHARE);
                break;
            case 5:
                i10 = new pf0(this, qf0.CALL);
                this.I = i10;
                i10.f38478t = true;
                i10.f38481x = 500;
                break;
            case 6:
                i10 = new pf0(this, qf0.VIDEO);
                i10.f38478t = true;
                i10.f38481x = 500;
                break;
            case 7:
                i10 = new pf0(this, qf0.JOIN);
                i10.f38478t = true;
                i10.v = 300;
                break;
            case 8:
                i10 = new pf0(this, qf0.REPORT);
                i10.f38478t = true;
                i10.f38481x = 500;
                break;
            case 9:
                i10 = new pf0(this, qf0.LEAVE);
                i10.f38478t = true;
                i10.f38479u = 2131624164;
                i10.f38481x = 300;
                break;
            case 10:
                i10 = new pf0(this, qf0.VOICE_CHAT);
                i10.f38478t = true;
                i10.f38479u = 2131624167;
                i10.f38481x = 500;
                break;
            case 11:
                i10 = new pf0(this, qf0.STREAM);
                i10.f38478t = true;
                i10.f38479u = 2131624167;
                i10.f38481x = 500;
                break;
            case 12:
                i10 = new pf0(this, qf0.STORY);
                break;
            case 13:
                i10 = new pf0(this, qf0.STOP);
                i10.f38478t = true;
                i10.f38481x = 300;
                break;
        }
        if (i10 != null) {
            i10.f38461a = i7;
        }
        return i10;
    }

    public final boolean k() {
        if (this.E.contains(5) && this.I != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i7 = this.f39599r;
        while (true) {
            ArrayList arrayList = this.f39598n;
            if (i7 < arrayList.size()) {
                fh.g gVar = (fh.g) arrayList.get(i7);
                if (!gVar.getBounds().isEmpty()) {
                    gVar.setBounds(0, 0, 0, 0);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void m(int i7, ArrayList arrayList) {
        if (this.E.contains(Integer.valueOf(i7))) {
            arrayList.add(j(i7));
        }
    }

    public final void n(int i7, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.E;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i10))) {
            arrayList.add(j(i7));
        }
    }

    public final void o(int i7, boolean z10) {
        boolean remove;
        HashSet hashSet = this.E;
        if (z10) {
            remove = hashSet.add(Integer.valueOf(i7));
        } else {
            remove = hashSet.remove(Integer.valueOf(i7));
        }
        if (remove) {
            d();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sf0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.f39601w + this.N + this.M), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pf0 pf0Var;
        if (this.f39602x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.f39591a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    pf0 pf0Var2 = (pf0) arrayList.get(i7);
                    if (!pf0Var2.f38473o && pf0Var2.d.contains(x10, y10)) {
                        this.U = pf0Var2;
                        this.V = x10;
                        this.W = y10;
                        this.f39592a0 = System.currentTimeMillis();
                        this.U.f38462b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x10 - this.V) > 20.0f || Math.abs(y10 - this.W) > 20.0f)) {
                    this.U.f38462b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (pf0Var = this.U) != null) {
                pf0Var.f38462b.c(false);
                if (action == 1 && this.U.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.f39592a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    pf0 pf0Var3 = this.U;
                    if (pf0Var3.f38478t && !pf0Var3.f38477s) {
                        pf0Var3.f38477s = true;
                        invalidate();
                    }
                    pf0 pf0Var4 = this.U;
                    int i10 = pf0Var4.f38479u;
                    if (i10 != 0) {
                        pf0Var4.d(i10, 0, 0);
                    }
                    this.U.f38480w = System.currentTimeMillis();
                    pf0 pf0Var5 = this.U;
                    rf0 rf0Var = this.f39603y;
                    if (rf0Var != null) {
                        int i11 = pf0Var5.v;
                        if (i11 == 0) {
                            int i12 = pf0Var5.f38461a;
                            RectF rectF = pf0Var5.d;
                            ProfileActivity.l0(((org.telegram.ui.st0) rf0Var).f52152b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new bt(28, this, pf0Var5), i11);
                        }
                    }
                }
                this.U = null;
                return true;
            }
            if (this.U != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(pf0 pf0Var, boolean z10) {
        qf0 qf0Var;
        if (z10) {
            if (this.H) {
                pf0Var.c(org.telegram.messenger.gd.N0(2131746491, null));
                pf0Var.d(2131624166, 2131231157, 2131232500);
                return;
            }
            pf0Var.c(org.telegram.messenger.gd.N0(2131746490, null));
            pf0Var.d(2131624165, 2131231163, 2131232505);
            return;
        }
        if (this.H) {
            qf0Var = qf0.NOTIFICATION_MUTE;
        } else {
            qf0Var = qf0.NOTIFICATION_UNMUTE;
        }
        pf0Var.d(0, qf0Var.f38833b, qf0Var.f38834c);
        pf0Var.c(org.telegram.messenger.gd.N0(qf0Var.f38832a, null));
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.f39598n.clear();
        this.f39599r = 0;
        invalidate();
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.H != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.H = z10;
        pf0 i7 = i(1, this.f39591a);
        if (i7 != null) {
            p(i7, z11);
            invalidate();
            return;
        }
        this.E.add(1);
        d();
    }

    public void setOnActionClickListener(rf0 rf0Var) {
        this.f39603y = rf0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof n80)) {
            return false;
        }
        return true;
    }
}
