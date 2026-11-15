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
public final class hf0 extends View {
    public final HashSet E;
    public int F;
    public boolean G;
    public boolean H;
    public ef0 I;
    public ef0 J;
    public ef0 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public ef0 U;
    public float V;
    public float W;
    public final ArrayList f35225a;
    public long f35226a0;
    public final Paint f35227b;
    public df0 f35228b0;
    public final Paint f35229c;
    public float d;
    public boolean f35230e;
    public float f35231f;
    public dh.c h;
    public final ArrayList f35232n;
    public int f35233r;
    public int f35234s;
    public final int f35235w;
    public float f35236x;
    public gf0 f35237y;

    public hf0(Context context, int i7) {
        super(context);
        this.f35225a = new ArrayList();
        Paint paint = new Paint();
        this.f35227b = paint;
        this.f35229c = new Paint();
        this.f35230e = true;
        this.f35231f = -1.0f;
        this.f35232n = new ArrayList();
        this.f35234s = 0;
        this.f35236x = 0.0f;
        this.f35237y = null;
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
        this.f35235w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.L;
        int i7 = this.f35234s;
        return ((measuredWidth - ((f10 / 2.0f) * (i7 - 1))) - (f10 * 2.0f)) / i7;
    }

    public static ef0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ef0 ef0Var = (ef0) list.get(i10);
            if (!ef0Var.f34297o && ef0Var.f34285a == i7) {
                return ef0Var;
            }
        }
        return null;
    }

    public final void a() {
        ef0 ef0Var = new ef0(this, ff0.SET_PHOTO);
        ef0Var.f34285a = 14;
        this.f35225a.add(ef0Var);
    }

    public final void b() {
        ef0 ef0Var = new ef0(this, ff0.EDIT_INFO);
        ef0Var.f34285a = 16;
        this.f35225a.add(ef0Var);
    }

    public final void c() {
        ef0 ef0Var = new ef0(this, ff0.SETTINGS);
        ef0Var.f34285a = 17;
        this.f35225a.add(ef0Var);
    }

    public final void d() {
        boolean z10;
        if (this.G) {
            return;
        }
        if (this.F == 6) {
            this.f35234s = this.f35225a.size();
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
        org.telegram.messenger.g0.h3(new vs(27, this, arrayList));
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
                this.f35227b.setColor(i7);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.L;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f35234s - 1))) - (f11 * 2.0f)) / Math.max(1, this.f35234s);
            float f12 = max / 2.0f;
            float f13 = this.f35235w / 2.0f;
            if (this.P) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.j6.r1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.f35229c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f35228b0 == null) {
            this.f35228b0 = new df0(this);
        }
        return this.f35228b0;
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

    public final ef0 j(int i7) {
        ef0 i10 = i(i7, this.f35225a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new ef0(this, ff0.MESSAGE);
                break;
            case 1:
                i10 = new ef0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new ef0(this, ff0.DISCUSS);
                break;
            case 3:
                i10 = new ef0(this, ff0.GIFT);
                i10.f34302t = true;
                i10.f34305x = 200;
                break;
            case 4:
                i10 = new ef0(this, ff0.SHARE);
                break;
            case 5:
                i10 = new ef0(this, ff0.CALL);
                this.I = i10;
                i10.f34302t = true;
                i10.f34305x = 500;
                break;
            case 6:
                i10 = new ef0(this, ff0.VIDEO);
                i10.f34302t = true;
                i10.f34305x = 500;
                break;
            case 7:
                i10 = new ef0(this, ff0.JOIN);
                i10.f34302t = true;
                i10.v = 300;
                break;
            case 8:
                i10 = new ef0(this, ff0.REPORT);
                i10.f34302t = true;
                i10.f34305x = 500;
                break;
            case 9:
                i10 = new ef0(this, ff0.LEAVE);
                i10.f34302t = true;
                i10.f34303u = 2131624164;
                i10.f34305x = 300;
                break;
            case 10:
                i10 = new ef0(this, ff0.VOICE_CHAT);
                i10.f34302t = true;
                i10.f34303u = 2131624167;
                i10.f34305x = 500;
                break;
            case 11:
                i10 = new ef0(this, ff0.STREAM);
                i10.f34302t = true;
                i10.f34303u = 2131624167;
                i10.f34305x = 500;
                break;
            case 12:
                i10 = new ef0(this, ff0.STORY);
                break;
            case 13:
                i10 = new ef0(this, ff0.STOP);
                i10.f34302t = true;
                i10.f34305x = 300;
                break;
        }
        if (i10 != null) {
            i10.f34285a = i7;
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
        int i7 = this.f35233r;
        while (true) {
            ArrayList arrayList = this.f35232n;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hf0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.f35235w + this.N + this.M), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ef0 ef0Var;
        if (this.f35236x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.f35225a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    ef0 ef0Var2 = (ef0) arrayList.get(i7);
                    if (!ef0Var2.f34297o && ef0Var2.d.contains(x10, y10)) {
                        this.U = ef0Var2;
                        this.V = x10;
                        this.W = y10;
                        this.f35226a0 = System.currentTimeMillis();
                        this.U.f34286b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x10 - this.V) > 20.0f || Math.abs(y10 - this.W) > 20.0f)) {
                    this.U.f34286b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (ef0Var = this.U) != null) {
                ef0Var.f34286b.c(false);
                if (action == 1 && this.U.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.f35226a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ef0 ef0Var3 = this.U;
                    if (ef0Var3.f34302t && !ef0Var3.f34301s) {
                        ef0Var3.f34301s = true;
                        invalidate();
                    }
                    ef0 ef0Var4 = this.U;
                    int i10 = ef0Var4.f34303u;
                    if (i10 != 0) {
                        ef0Var4.d(i10, 0, 0);
                    }
                    this.U.f34304w = System.currentTimeMillis();
                    ef0 ef0Var5 = this.U;
                    gf0 gf0Var = this.f35237y;
                    if (gf0Var != null) {
                        int i11 = ef0Var5.v;
                        if (i11 == 0) {
                            int i12 = ef0Var5.f34285a;
                            RectF rectF = ef0Var5.d;
                            ProfileActivity.l0(((org.telegram.ui.qt0) gf0Var).f50791b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new vs(28, this, ef0Var5), i11);
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

    public final void p(ef0 ef0Var, boolean z10) {
        ff0 ff0Var;
        if (z10) {
            if (this.H) {
                ef0Var.c(org.telegram.messenger.hd.M0(2131746687, null));
                ef0Var.d(2131624166, 2131231155, 2131232496);
                return;
            }
            ef0Var.c(org.telegram.messenger.hd.M0(2131746686, null));
            ef0Var.d(2131624165, 2131231161, 2131232501);
            return;
        }
        if (this.H) {
            ff0Var = ff0.NOTIFICATION_MUTE;
        } else {
            ff0Var = ff0.NOTIFICATION_UNMUTE;
        }
        ef0Var.d(0, ff0Var.f34600b, ff0Var.f34601c);
        ef0Var.c(org.telegram.messenger.hd.M0(ff0Var.f34599a, null));
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.f35232n.clear();
        this.f35233r = 0;
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
        ef0 i7 = i(1, this.f35225a);
        if (i7 != null) {
            p(i7, z11);
            invalidate();
            return;
        }
        this.E.add(1);
        d();
    }

    public void setOnActionClickListener(gf0 gf0Var) {
        this.f35237y = gf0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof d80)) {
            return false;
        }
        return true;
    }
}
