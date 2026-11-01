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
public final class hg0 extends View {
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public eg0 H;
    public eg0 I;
    public eg0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public eg0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList f26788a;
    public dg0 f26789a0;
    public final Paint f26790b;
    public final Paint f26791c;
    public float d;
    public boolean e;
    public float f26792f;
    public tg.b h;
    public final ArrayList f26793n;
    public int f26794r;
    public int f26795s;
    public final int f26796w;
    public float f26797x;
    public gg0 f26798y;

    public hg0(Context context, int i10) {
        super(context);
        this.f26788a = new ArrayList();
        Paint paint = new Paint();
        this.f26790b = paint;
        this.f26791c = new Paint();
        this.e = true;
        this.f26792f = -1.0f;
        this.f26793n = new ArrayList();
        this.f26795s = 0;
        this.f26797x = 0.0f;
        this.f26798y = null;
        this.D = new HashSet();
        this.E = 6;
        this.H = null;
        this.N = 0;
        this.Q = new Matrix();
        this.T = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.K = org.telegram.messenger.i0.N(14.0f);
        float N = org.telegram.messenger.i0.N(12.0f);
        this.L = N;
        float N2 = org.telegram.messenger.i0.N(8.0f);
        this.M = N2;
        this.f26796w = (int) ((i10 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.K;
        int i10 = this.f26795s;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static eg0 i(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            eg0 eg0Var = (eg0) list.get(i11);
            if (!eg0Var.f25823o && eg0Var.f25812a == i10) {
                return eg0Var;
            }
        }
        return null;
    }

    public final void a() {
        eg0 eg0Var = new eg0(this, fg0.SET_PHOTO);
        eg0Var.f25812a = 14;
        this.f26788a.add(eg0Var);
    }

    public final void b() {
        eg0 eg0Var = new eg0(this, fg0.EDIT_INFO);
        eg0Var.f25812a = 16;
        this.f26788a.add(eg0Var);
    }

    public final void c() {
        eg0 eg0Var = new eg0(this, fg0.SETTINGS);
        eg0Var.f25812a = 17;
        this.f26788a.add(eg0Var);
    }

    public final void d() {
        boolean z10;
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.f26795s = this.f26788a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.D;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z10 = true;
        } else {
            z10 = false;
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
        org.telegram.messenger.i0.g3(new at(27, this, arrayList));
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
        float f7;
        int i10 = this.N;
        if (i10 != 0) {
            if (!this.O) {
                this.f26790b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.K;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f26795s - 1))) - (f10 * 2.0f)) / Math.max(1, this.f26795s);
            float f11 = max / 2.0f;
            float f12 = this.f26796w / 2.0f;
            if (this.O) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.t6.r1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
            this.P = radialGradient;
            this.f26791c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f26789a0 == null) {
            this.f26789a0 = new dg0(this);
        }
        return this.f26789a0;
    }

    public float getRoundRadius() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f7) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.S);
        drawable.setAlpha((int) (f7 * 255.0f));
        drawable.draw(canvas);
    }

    public final eg0 j(int i10) {
        eg0 i11 = i(i10, this.f26788a);
        if (i11 != null) {
            if (i10 == 1) {
                p(i11, false);
            }
            return i11;
        }
        switch (i10) {
            case 0:
                i11 = new eg0(this, fg0.MESSAGE);
                break;
            case 1:
                i11 = new eg0(this);
                p(i11, false);
                break;
            case 2:
                i11 = new eg0(this, fg0.DISCUSS);
                break;
            case 3:
                i11 = new eg0(this, fg0.GIFT);
                i11.f25828t = true;
                i11.f25831x = 200;
                break;
            case 4:
                i11 = new eg0(this, fg0.SHARE);
                break;
            case 5:
                i11 = new eg0(this, fg0.CALL);
                this.H = i11;
                i11.f25828t = true;
                i11.f25831x = 500;
                break;
            case 6:
                i11 = new eg0(this, fg0.VIDEO);
                i11.f25828t = true;
                i11.f25831x = 500;
                break;
            case 7:
                i11 = new eg0(this, fg0.JOIN);
                i11.f25828t = true;
                i11.v = 300;
                break;
            case 8:
                i11 = new eg0(this, fg0.REPORT);
                i11.f25828t = true;
                i11.f25831x = 500;
                break;
            case 9:
                i11 = new eg0(this, fg0.LEAVE);
                i11.f25828t = true;
                i11.f25829u = 2131624161;
                i11.f25831x = 300;
                break;
            case 10:
                i11 = new eg0(this, fg0.VOICE_CHAT);
                i11.f25828t = true;
                i11.f25829u = 2131624164;
                i11.f25831x = 500;
                break;
            case 11:
                i11 = new eg0(this, fg0.STREAM);
                i11.f25828t = true;
                i11.f25829u = 2131624164;
                i11.f25831x = 500;
                break;
            case 12:
                i11 = new eg0(this, fg0.STORY);
                break;
            case 13:
                i11 = new eg0(this, fg0.STOP);
                i11.f25828t = true;
                i11.f25831x = 300;
                break;
        }
        if (i11 != null) {
            i11.f25812a = i10;
        }
        return i11;
    }

    public final boolean k() {
        if (this.D.contains(5) && this.H != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i10 = this.f26794r;
        while (true) {
            ArrayList arrayList = this.f26793n;
            if (i10 < arrayList.size()) {
                vg.f fVar = (vg.f) arrayList.get(i10);
                if (!fVar.getBounds().isEmpty()) {
                    fVar.setBounds(0, 0, 0, 0);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.D.contains(Integer.valueOf(i10))) {
            arrayList.add(j(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.D;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i11))) {
            arrayList.add(j(i10));
        }
    }

    public final void o(int i10, boolean z10) {
        boolean remove;
        HashSet hashSet = this.D;
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
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f26796w + this.M + this.L), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eg0 eg0Var;
        if (this.f26797x >= org.telegram.messenger.i0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.f26788a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    eg0 eg0Var2 = (eg0) arrayList.get(i10);
                    if (!eg0Var2.f25823o && eg0Var2.d.contains(x10, y3)) {
                        this.T = eg0Var2;
                        this.U = x10;
                        this.V = y3;
                        this.W = System.currentTimeMillis();
                        this.T.f25813b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y3 - this.V) > 20.0f)) {
                    this.T.f25813b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (eg0Var = this.T) != null) {
                eg0Var.f25813b.c(false);
                if (action == 1 && this.T.d.contains(x10, y3)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    eg0 eg0Var3 = this.T;
                    if (eg0Var3.f25828t && !eg0Var3.f25827s) {
                        eg0Var3.f25827s = true;
                        invalidate();
                    }
                    eg0 eg0Var4 = this.T;
                    int i11 = eg0Var4.f25829u;
                    if (i11 != 0) {
                        eg0Var4.d(i11, 0, 0);
                    }
                    this.T.f25830w = System.currentTimeMillis();
                    eg0 eg0Var5 = this.T;
                    gg0 gg0Var = this.f26798y;
                    if (gg0Var != null) {
                        int i12 = eg0Var5.v;
                        if (i12 == 0) {
                            int i13 = eg0Var5.f25812a;
                            RectF rectF = eg0Var5.d;
                            ProfileActivity.m0(((org.telegram.ui.av0) gg0Var).f35843b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new at(28, this, eg0Var5), i12);
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

    public final void p(eg0 eg0Var, boolean z10) {
        fg0 fg0Var;
        if (z10) {
            if (this.G) {
                eg0Var.c(org.telegram.messenger.dd.L0(2131746702, null));
                eg0Var.d(2131624163, 2131231155, 2131232494);
                return;
            }
            eg0Var.c(org.telegram.messenger.dd.L0(2131746701, null));
            eg0Var.d(2131624162, 2131231161, 2131232499);
            return;
        }
        if (this.G) {
            fg0Var = fg0.NOTIFICATION_MUTE;
        } else {
            fg0Var = fg0.NOTIFICATION_UNMUTE;
        }
        eg0Var.d(0, fg0Var.f26166b, fg0Var.f26167c);
        eg0Var.c(org.telegram.messenger.dd.L0(fg0Var.f26165a, null));
    }

    public void setGlassFactory(tg.b bVar) {
        this.h = bVar;
        this.f26793n.clear();
        this.f26794r = 0;
        invalidate();
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.G != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.G = z10;
        eg0 i10 = i(1, this.f26788a);
        if (i10 != null) {
            p(i10, z11);
            invalidate();
            return;
        }
        this.D.add(1);
        d();
    }

    public void setOnActionClickListener(gg0 gg0Var) {
        this.f26798y = gg0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof t80)) {
            return false;
        }
        return true;
    }
}
