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
public final class ff0 extends View {
    public final HashSet D;
    public int E;
    public boolean F;
    public boolean G;
    public cf0 H;
    public cf0 I;
    public cf0 J;
    public final float K;
    public final float L;
    public final float M;
    public int N;
    public boolean O;
    public RadialGradient P;
    public final Matrix Q;
    public int R;
    public PorterDuffColorFilter S;
    public cf0 T;
    public float U;
    public float V;
    public long W;
    public final ArrayList f33648a;
    public bf0 f33649a0;
    public final Paint f33650b;
    public final Paint f33651c;
    public float d;
    public boolean f33652e;
    public float f33653f;
    public dh.c h;
    public final ArrayList f33654n;
    public int f33655r;
    public int f33656s;
    public final int f33657w;
    public float f33658x;
    public ef0 f33659y;

    public ff0(Context context, int i7) {
        super(context);
        this.f33648a = new ArrayList();
        Paint paint = new Paint();
        this.f33650b = paint;
        this.f33651c = new Paint();
        this.f33652e = true;
        this.f33653f = -1.0f;
        this.f33654n = new ArrayList();
        this.f33656s = 0;
        this.f33658x = 0.0f;
        this.f33659y = null;
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
        this.f33657w = (int) ((i7 - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.K;
        int i7 = this.f33656s;
        return ((measuredWidth - ((f10 / 2.0f) * (i7 - 1))) - (f10 * 2.0f)) / i7;
    }

    public static cf0 i(int i7, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            cf0 cf0Var = (cf0) list.get(i10);
            if (!cf0Var.f32665o && cf0Var.f32653a == i7) {
                return cf0Var;
            }
        }
        return null;
    }

    public final void a() {
        cf0 cf0Var = new cf0(this, df0.SET_PHOTO);
        cf0Var.f32653a = 14;
        this.f33648a.add(cf0Var);
    }

    public final void b() {
        cf0 cf0Var = new cf0(this, df0.EDIT_INFO);
        cf0Var.f32653a = 16;
        this.f33648a.add(cf0Var);
    }

    public final void c() {
        cf0 cf0Var = new cf0(this, df0.SETTINGS);
        cf0Var.f32653a = 17;
        this.f33648a.add(cf0Var);
    }

    public final void d() {
        boolean z9;
        if (this.F) {
            return;
        }
        if (this.E == 6) {
            this.f33656s = this.f33648a.size();
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
        org.telegram.messenger.g0.h3(new w80(3, this, arrayList));
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
                this.f33650b.setColor(i7);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.K;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f33656s - 1))) - (f11 * 2.0f)) / Math.max(1, this.f33656s);
            float f12 = max / 2.0f;
            float f13 = this.f33657w / 2.0f;
            if (this.O) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.l6.r1(0.8f, this.N), this.N, Shader.TileMode.CLAMP);
            this.P = radialGradient;
            this.f33651c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f33649a0 == null) {
            this.f33649a0 = new bf0(this);
        }
        return this.f33649a0;
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

    public final cf0 j(int i7) {
        cf0 i10 = i(i7, this.f33648a);
        if (i10 != null) {
            if (i7 == 1) {
                p(i10, false);
            }
            return i10;
        }
        switch (i7) {
            case 0:
                i10 = new cf0(this, df0.MESSAGE);
                break;
            case 1:
                i10 = new cf0(this);
                p(i10, false);
                break;
            case 2:
                i10 = new cf0(this, df0.DISCUSS);
                break;
            case 3:
                i10 = new cf0(this, df0.GIFT);
                i10.f32670t = true;
                i10.f32673x = 200;
                break;
            case 4:
                i10 = new cf0(this, df0.SHARE);
                break;
            case 5:
                i10 = new cf0(this, df0.CALL);
                this.H = i10;
                i10.f32670t = true;
                i10.f32673x = 500;
                break;
            case 6:
                i10 = new cf0(this, df0.VIDEO);
                i10.f32670t = true;
                i10.f32673x = 500;
                break;
            case 7:
                i10 = new cf0(this, df0.JOIN);
                i10.f32670t = true;
                i10.v = 300;
                break;
            case 8:
                i10 = new cf0(this, df0.REPORT);
                i10.f32670t = true;
                i10.f32673x = 500;
                break;
            case 9:
                i10 = new cf0(this, df0.LEAVE);
                i10.f32670t = true;
                i10.f32671u = 2131624163;
                i10.f32673x = 300;
                break;
            case 10:
                i10 = new cf0(this, df0.VOICE_CHAT);
                i10.f32670t = true;
                i10.f32671u = 2131624166;
                i10.f32673x = 500;
                break;
            case 11:
                i10 = new cf0(this, df0.STREAM);
                i10.f32670t = true;
                i10.f32671u = 2131624166;
                i10.f32673x = 500;
                break;
            case 12:
                i10 = new cf0(this, df0.STORY);
                break;
            case 13:
                i10 = new cf0(this, df0.STOP);
                i10.f32670t = true;
                i10.f32673x = 300;
                break;
        }
        if (i10 != null) {
            i10.f32653a = i7;
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
        int i7 = this.f33655r;
        while (true) {
            ArrayList arrayList = this.f33654n;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ff0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec((int) (this.f33657w + this.M + this.L), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cf0 cf0Var;
        if (this.f33658x >= org.telegram.messenger.g0.L(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.T = null;
                ArrayList arrayList = this.f33648a;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    cf0 cf0Var2 = (cf0) arrayList.get(i7);
                    if (!cf0Var2.f32665o && cf0Var2.d.contains(x10, y10)) {
                        this.T = cf0Var2;
                        this.U = x10;
                        this.V = y10;
                        this.W = System.currentTimeMillis();
                        this.T.f32654b.c(true);
                        break;
                    }
                    i7++;
                }
            } else if (action == 2) {
                if (this.T != null && (Math.abs(x10 - this.U) > 20.0f || Math.abs(y10 - this.V) > 20.0f)) {
                    this.T.f32654b.c(false);
                    this.T = null;
                }
            } else if ((action == 1 || action == 3) && (cf0Var = this.T) != null) {
                cf0Var.f32654b.c(false);
                if (action == 1 && this.T.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.W > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    cf0 cf0Var3 = this.T;
                    if (cf0Var3.f32670t && !cf0Var3.f32669s) {
                        cf0Var3.f32669s = true;
                        invalidate();
                    }
                    cf0 cf0Var4 = this.T;
                    int i10 = cf0Var4.f32671u;
                    if (i10 != 0) {
                        cf0Var4.d(i10, 0, 0);
                    }
                    this.T.f32672w = System.currentTimeMillis();
                    cf0 cf0Var5 = this.T;
                    ef0 ef0Var = this.f33659y;
                    if (ef0Var != null) {
                        int i11 = cf0Var5.v;
                        if (i11 == 0) {
                            int i12 = cf0Var5.f32653a;
                            RectF rectF = cf0Var5.d;
                            ProfileActivity.l0(((org.telegram.ui.vt0) ef0Var).f50774b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new w80(4, this, cf0Var5), i11);
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

    public final void p(cf0 cf0Var, boolean z9) {
        df0 df0Var;
        if (z9) {
            if (this.G) {
                cf0Var.c(org.telegram.messenger.id.M0(2131746687, null));
                cf0Var.d(2131624165, 2131231155, 2131232495);
                return;
            }
            cf0Var.c(org.telegram.messenger.id.M0(2131746686, null));
            cf0Var.d(2131624164, 2131231161, 2131232500);
            return;
        }
        if (this.G) {
            df0Var = df0.NOTIFICATION_MUTE;
        } else {
            df0Var = df0.NOTIFICATION_UNMUTE;
        }
        cf0Var.d(0, df0Var.f32952b, df0Var.f32953c);
        cf0Var.c(org.telegram.messenger.id.M0(df0Var.f32951a, null));
    }

    public void setGlassFactory(dh.c cVar) {
        this.h = cVar;
        this.f33654n.clear();
        this.f33655r = 0;
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
        cf0 i7 = i(1, this.f33648a);
        if (i7 != null) {
            p(i7, z10);
            invalidate();
            return;
        }
        this.D.add(1);
        d();
    }

    public void setOnActionClickListener(ef0 ef0Var) {
        this.f33659y = ef0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof b80)) {
            return false;
        }
        return true;
    }
}
