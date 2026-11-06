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
public final class ef0 extends View {
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public bf0 H;
    public bf0 I;
    public bf0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public bf0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList f33221a;
    public af0 f33222a0;
    public final Paint f33223b;
    public final Paint f33224c;
    public float d;
    public boolean f33225e;
    public float f33226f;
    public dh.c h;
    public final ArrayList f33227n;
    public int f33228r;
    public int f33229s;
    public final int f33230w;
    public float f33231x;
    public df0 f33232y;

    public ef0(Context context, int i7) {
        super(context);
        this.f33221a = new ArrayList();
        Paint paint = new Paint();
        this.f33223b = paint;
        this.f33224c = new Paint();
        this.f33225e = true;
        this.f33226f = -1.0f;
        this.f33227n = new ArrayList();
        this.f33229s = 0;
        this.f33231x = 0.0f;
        this.f33232y = null;
        this.D = new HashSet();
        this.E = 6;
        this.H = null;
        this.N = 0;
        this.Q = new Matrix();
        this.T = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.K = org.telegram.messenger.g0.N(14.0f);
        float N = org.telegram.messenger.g0.N(12.0f);
        this.L = N;
        float N2 = org.telegram.messenger.g0.N(8.0f);
        this.M = N2;
        this.f33230w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.K;
        int i7 = this.f33229s;
        return ((measuredWidth - ((f10 / 2.0f) * (i7 - 1))) - (f10 * 2.0f)) / i7;
    }

    public static bf0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            bf0 bf0Var = (bf0) list.get(i10);
            if (!bf0Var.f32133o && bf0Var.f32121a == i7) {
                return bf0Var;
            }
        }
        return null;
    }

    public final void a() {
        bf0 bf0Var = new bf0(this, cf0.SET_PHOTO);
        bf0Var.f32121a = 14;
        this.f33221a.add(bf0Var);
    }

    public final void b() {
        bf0 bf0Var = new bf0(this, cf0.EDIT_INFO);
        bf0Var.f32121a = 16;
        this.f33221a.add(bf0Var);
    }

    public final void c() {
        bf0 bf0Var = new bf0(this, cf0.SETTINGS);
        bf0Var.f32121a = 17;
        this.f33221a.add(bf0Var);
    }

    public final void d() {
        boolean z9;
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.f33229s = this.f33221a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.D;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = this.E;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3 && i7 != 4) {
                        if (i7 == 5) {
                            m(0, arrayList);
                            m(1, arrayList);
                        }
                    } else {
                        if (z9) {
                            m(7, arrayList);
                        } else {
                            m(0, arrayList);
                        }
                        m(1, arrayList);
                        if (z9) {
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
                if (z9) {
                    m(7, arrayList);
                } else {
                    m(10, arrayList);
                    n(11, 10, arrayList);
                }
                m(1, arrayList);
                if (!z9) {
                    m(2, arrayList);
                    if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                        arrayList.add(j(3));
                    }
                }
                n(4, 12, arrayList);
                if (z9) {
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
        org.telegram.messenger.g0.h3(new v80(3, this, arrayList));
    }

    public final void e() {
        this.F = true;
    }

    public final boolean f() {
        int i7 = this.E;
        if (i7 == 1 || i7 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f10;
        int i7 = this.N;
        if (i7 != 0) {
            if (!this.O) {
                this.f33223b.setColor(i7);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.K;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f33229s - 1))) - (f11 * 2.0f)) / Math.max(1, this.f33229s);
            float f12 = max / 2.0f;
            float f13 = this.f33230w / 2.0f;
            if (this.O) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.k6.r1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
            this.P = radialGradient;
            this.f33224c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f33222a0 == null) {
            this.f33222a0 = new af0(this);
        }
        return this.f33222a0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final bf0 j(int i7) {
        bf0 i10 = i(i7, this.f33221a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new bf0(this, cf0.MESSAGE);
                break;
            case 1:
                i10 = new bf0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new bf0(this, cf0.DISCUSS);
                break;
            case 3:
                i10 = new bf0(this, cf0.GIFT);
                i10.f32138t = true;
                i10.f32141x = 200;
                break;
            case 4:
                i10 = new bf0(this, cf0.SHARE);
                break;
            case 5:
                i10 = new bf0(this, cf0.CALL);
                this.H = i10;
                i10.f32138t = true;
                i10.f32141x = 500;
                break;
            case 6:
                i10 = new bf0(this, cf0.VIDEO);
                i10.f32138t = true;
                i10.f32141x = 500;
                break;
            case 7:
                i10 = new bf0(this, cf0.JOIN);
                i10.f32138t = true;
                i10.v = 300;
                break;
            case 8:
                i10 = new bf0(this, cf0.REPORT);
                i10.f32138t = true;
                i10.f32141x = 500;
                break;
            case 9:
                i10 = new bf0(this, cf0.LEAVE);
                i10.f32138t = true;
                i10.f32139u = 2131624163;
                i10.f32141x = 300;
                break;
            case 10:
                i10 = new bf0(this, cf0.VOICE_CHAT);
                i10.f32138t = true;
                i10.f32139u = 2131624166;
                i10.f32141x = 500;
                break;
            case 11:
                i10 = new bf0(this, cf0.STREAM);
                i10.f32138t = true;
                i10.f32139u = 2131624166;
                i10.f32141x = 500;
                break;
            case 12:
                i10 = new bf0(this, cf0.STORY);
                break;
            case 13:
                i10 = new bf0(this, cf0.STOP);
                i10.f32138t = true;
                i10.f32141x = 300;
                break;
        }
        if (i10 != null) {
            i10.f32121a = i7;
        }
        return i10;
    }

    public final boolean k() {
        if (this.D.contains(5) && this.H != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i7 = this.f33228r;
        while (true) {
            ArrayList arrayList = this.f33227n;
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
        if (this.D.contains(Integer.valueOf(i7))) {
            arrayList.add(j(i7));
        }
    }

    public final void n(int i7, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.D;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i10))) {
            arrayList.add(j(i7));
        }
    }

    public final void o(int i7, boolean z9) {
        boolean remove;
        HashSet hashSet = this.D;
        if (z9) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ef0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.f33230w + this.M + this.L), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bf0 bf0Var;
        if (this.f33231x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.f33221a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    bf0 bf0Var2 = (bf0) arrayList.get(i7);
                    if (!bf0Var2.f32133o && bf0Var2.d.contains(x10, y10)) {
                        this.T = bf0Var2;
                        this.U = x10;
                        this.V = y10;
                        this.W = System.currentTimeMillis();
                        this.T.f32122b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y10 - this.V) > 20.0f)) {
                    this.T.f32122b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (bf0Var = this.T) != null) {
                bf0Var.f32122b.c(false);
                if (action == 1 && this.T.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    bf0 bf0Var3 = this.T;
                    if (bf0Var3.f32138t && !bf0Var3.f32137s) {
                        bf0Var3.f32137s = true;
                        invalidate();
                    }
                    bf0 bf0Var4 = this.T;
                    int i10 = bf0Var4.f32139u;
                    if (i10 != 0) {
                        bf0Var4.d(i10, 0, 0);
                    }
                    this.T.f32140w = System.currentTimeMillis();
                    bf0 bf0Var5 = this.T;
                    df0 df0Var = this.f33232y;
                    if (df0Var != null) {
                        int i11 = bf0Var5.v;
                        if (i11 == 0) {
                            int i12 = bf0Var5.f32121a;
                            RectF rectF = bf0Var5.d;
                            ProfileActivity.m0(((org.telegram.ui.st0) df0Var).f49807b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new v80(4, this, bf0Var5), i11);
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

    public final void p(bf0 bf0Var, boolean z9) {
        cf0 cf0Var;
        if (z9) {
            if (this.G) {
                bf0Var.c(org.telegram.messenger.hd.M0(2131746686, null));
                bf0Var.d(2131624165, 2131231155, 2131232495);
                return;
            }
            bf0Var.c(org.telegram.messenger.hd.M0(2131746685, null));
            bf0Var.d(2131624164, 2131231161, 2131232500);
            return;
        }
        if (this.G) {
            cf0Var = cf0.NOTIFICATION_MUTE;
        } else {
            cf0Var = cf0.NOTIFICATION_UNMUTE;
        }
        bf0Var.d(0, cf0Var.f32554b, cf0Var.f32555c);
        bf0Var.c(org.telegram.messenger.hd.M0(cf0Var.f32553a, null));
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.f33227n.clear();
        this.f33228r = 0;
        invalidate();
    }

    public void setNotifications(boolean z9) {
        boolean z10;
        if (this.G != z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z9;
        bf0 i7 = i(1, this.f33221a);
        if (i7 != null) {
            p(i7, z10);
            invalidate();
            return;
        }
        this.D.add(1);
        d();
    }

    public void setOnActionClickListener(df0 df0Var) {
        this.f33232y = df0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof a80)) {
            return false;
        }
        return true;
    }
}
