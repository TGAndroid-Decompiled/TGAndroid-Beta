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
public final class gf0 extends View {
    public final HashSet E;
    public int F;
    public boolean G;
    public boolean H;
    public df0 I;
    public df0 J;
    public df0 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public df0 U;
    public float V;
    public float W;
    public final ArrayList f34074a;
    public long f34075a0;
    public final Paint f34076b;
    public cf0 f34077b0;
    public final Paint f34078c;
    public float d;
    public boolean f34079e;
    public float f34080f;
    public eh.c h;
    public final ArrayList f34081n;
    public int f34082r;
    public int f34083s;
    public final int f34084w;
    public float f34085x;
    public ff0 f34086y;

    public gf0(Context context, int i3) {
        super(context);
        this.f34074a = new ArrayList();
        Paint paint = new Paint();
        this.f34076b = paint;
        this.f34078c = new Paint();
        this.f34079e = true;
        this.f34080f = -1.0f;
        this.f34081n = new ArrayList();
        this.f34083s = 0;
        this.f34085x = 0.0f;
        this.f34086y = null;
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
        this.f34084w = (int) ((i3 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.L;
        int i3 = this.f34083s;
        return ((measuredWidth - ((f10 / 2.0f) * (i3 - 1))) - (f10 * 2.0f)) / i3;
    }

    public static df0 i(int i3, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            df0 df0Var = (df0) list.get(i10);
            if (!df0Var.f33076o && df0Var.f33064a == i3) {
                return df0Var;
            }
        }
        return null;
    }

    public final void a() {
        df0 df0Var = new df0(this, ef0.SET_PHOTO);
        df0Var.f33064a = 14;
        this.f34074a.add(df0Var);
    }

    public final void b() {
        df0 df0Var = new df0(this, ef0.EDIT_INFO);
        df0Var.f33064a = 16;
        this.f34074a.add(df0Var);
    }

    public final void c() {
        df0 df0Var = new df0(this, ef0.SETTINGS);
        df0Var.f33064a = 17;
        this.f34074a.add(df0Var);
    }

    public final void d() {
        boolean z10;
        if (this.G) {
            return;
        }
        if (this.F == 6) {
            this.f34083s = this.f34074a.size();
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
        int i3 = this.F;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        if (i3 == 5) {
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
        org.telegram.messenger.g0.h3(new j50(8, this, arrayList));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        int i3 = this.F;
        if (i3 == 1 || i3 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f10;
        int i3 = this.O;
        if (i3 != 0) {
            if (!this.P) {
                this.f34076b.setColor(i3);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.L;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f34083s - 1))) - (f11 * 2.0f)) / Math.max(1, this.f34083s);
            float f12 = max / 2.0f;
            float f13 = this.f34084w / 2.0f;
            if (this.P) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.k6.r1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.f34078c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f34077b0 == null) {
            this.f34077b0 = new cf0(this);
        }
        return this.f34077b0;
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

    public final df0 j(int i3) {
        df0 i10 = i(i3, this.f34074a);
        if (i10 != null) {
            if (i3 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i3) {
            case 0:
                i10 = new df0(this, ef0.MESSAGE);
                break;
            case 1:
                i10 = new df0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new df0(this, ef0.DISCUSS);
                break;
            case 3:
                i10 = new df0(this, ef0.GIFT);
                i10.f33081t = true;
                i10.f33084x = 200;
                break;
            case 4:
                i10 = new df0(this, ef0.SHARE);
                break;
            case 5:
                i10 = new df0(this, ef0.CALL);
                this.I = i10;
                i10.f33081t = true;
                i10.f33084x = 500;
                break;
            case 6:
                i10 = new df0(this, ef0.VIDEO);
                i10.f33081t = true;
                i10.f33084x = 500;
                break;
            case 7:
                i10 = new df0(this, ef0.JOIN);
                i10.f33081t = true;
                i10.v = 300;
                break;
            case 8:
                i10 = new df0(this, ef0.REPORT);
                i10.f33081t = true;
                i10.f33084x = 500;
                break;
            case 9:
                i10 = new df0(this, ef0.LEAVE);
                i10.f33081t = true;
                i10.f33082u = 2131624163;
                i10.f33084x = 300;
                break;
            case 10:
                i10 = new df0(this, ef0.VOICE_CHAT);
                i10.f33081t = true;
                i10.f33082u = 2131624166;
                i10.f33084x = 500;
                break;
            case 11:
                i10 = new df0(this, ef0.STREAM);
                i10.f33081t = true;
                i10.f33082u = 2131624166;
                i10.f33084x = 500;
                break;
            case 12:
                i10 = new df0(this, ef0.STORY);
                break;
            case 13:
                i10 = new df0(this, ef0.STOP);
                i10.f33081t = true;
                i10.f33084x = 300;
                break;
        }
        if (i10 != null) {
            i10.f33064a = i3;
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
        int i3 = this.f34082r;
        while (true) {
            ArrayList arrayList = this.f34081n;
            if (i3 < arrayList.size()) {
                gh.g gVar = (gh.g) arrayList.get(i3);
                if (!gVar.getBounds().isEmpty()) {
                    gVar.setBounds(0, 0, 0, 0);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void m(int i3, ArrayList arrayList) {
        if (this.E.contains(Integer.valueOf(i3))) {
            arrayList.add(j(i3));
        }
    }

    public final void n(int i3, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i3);
        HashSet hashSet = this.E;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i10))) {
            arrayList.add(j(i3));
        }
    }

    public final void o(int i3, boolean z10) {
        boolean remove;
        HashSet hashSet = this.E;
        if (z10) {
            remove = hashSet.add(Integer.valueOf(i3));
        } else {
            remove = hashSet.remove(Integer.valueOf(i3));
        }
        if (remove) {
            d();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gf0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.makeMeasureSpec((int) (this.f34084w + this.N + this.M), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        df0 df0Var;
        if (this.f34085x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.f34074a;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    df0 df0Var2 = (df0) arrayList.get(i3);
                    if (!df0Var2.f33076o && df0Var2.d.contains(x10, y9)) {
                        this.U = df0Var2;
                        this.V = x10;
                        this.W = y9;
                        this.f34075a0 = System.currentTimeMillis();
                        this.U.f33065b.c(true);
                        break;
                    }
                    i3++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x10 - this.V) > 20.0f || Math.abs(y9 - this.W) > 20.0f)) {
                    this.U.f33065b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (df0Var = this.U) != null) {
                df0Var.f33065b.c(false);
                if (action == 1 && this.U.d.contains(x10, y9)) {
                    if (System.currentTimeMillis() - this.f34075a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    df0 df0Var3 = this.U;
                    if (df0Var3.f33081t && !df0Var3.f33080s) {
                        df0Var3.f33080s = true;
                        invalidate();
                    }
                    df0 df0Var4 = this.U;
                    int i10 = df0Var4.f33082u;
                    if (i10 != 0) {
                        df0Var4.d(i10, 0, 0);
                    }
                    this.U.f33083w = System.currentTimeMillis();
                    df0 df0Var5 = this.U;
                    ff0 ff0Var = this.f34086y;
                    if (ff0Var != null) {
                        int i11 = df0Var5.v;
                        if (i11 == 0) {
                            int i12 = df0Var5.f33064a;
                            RectF rectF = df0Var5.d;
                            ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).f46687b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new j50(9, this, df0Var5), i11);
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

    public final void p(df0 df0Var, boolean z10) {
        ef0 ef0Var;
        if (z10) {
            if (this.H) {
                df0Var.c(org.telegram.messenger.bd.M0(2131746695, null));
                df0Var.d(2131624165, 2131231155, 2131232495);
                return;
            }
            df0Var.c(org.telegram.messenger.bd.M0(2131746694, null));
            df0Var.d(2131624164, 2131231161, 2131232500);
            return;
        }
        if (this.H) {
            ef0Var = ef0.NOTIFICATION_MUTE;
        } else {
            ef0Var = ef0.NOTIFICATION_UNMUTE;
        }
        df0Var.d(0, ef0Var.f33384b, ef0Var.f33385c);
        df0Var.c(org.telegram.messenger.bd.M0(ef0Var.f33383a, null));
    }

    public void setGlassFactory(eh.c cVar) {
        this.h = cVar;
        this.f34081n.clear();
        this.f34082r = 0;
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
        df0 i3 = i(1, this.f34074a);
        if (i3 != null) {
            p(i3, z11);
            invalidate();
            return;
        }
        this.E.add(1);
        d();
    }

    public void setOnActionClickListener(ff0 ff0Var) {
        this.f34086y = ff0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof w70)) {
            return false;
        }
        return true;
    }
}
