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
public final class bi0 extends View {
    public float E;
    public ai0 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public yh0 K;
    public yh0 L;
    public yh0 M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public boolean R;
    public RadialGradient S;
    public final Matrix T;
    public int U;
    public PorterDuffColorFilter V;
    public yh0 W;
    public final ArrayList f26855a;
    public float f26856a0;
    public final Paint f26857b;
    public float f26858b0;
    public final Paint f26859c;
    public long f26860c0;
    public float d;
    public xh0 f26861d0;
    public boolean e;
    public float f26862f;
    public final Path h;
    public final Path f26863n;
    public org.telegram.ui.wz0 f26864r;
    public float f26865s;
    public float v;
    public RenderNode f26866w;
    public int f26867x;
    public final int f26868y;

    public bi0(Context context, int i10) {
        super(context);
        this.f26855a = new ArrayList();
        Paint paint = new Paint();
        this.f26857b = paint;
        this.f26859c = new Paint();
        this.e = true;
        this.f26862f = -1.0f;
        this.h = new Path();
        this.f26863n = new Path();
        this.f26867x = 0;
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
        this.f26868y = (int) ((i10 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f7 = this.N;
        int i10 = this.f26867x;
        return ((measuredWidth - ((f7 / 2.0f) * (i10 - 1))) - (f7 * 2.0f)) / i10;
    }

    public static yh0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            yh0 yh0Var = (yh0) list.get(i11);
            if (!yh0Var.f35052o && yh0Var.f35041a == i10) {
                return yh0Var;
            }
        }
        return null;
    }

    public final void a() {
        yh0 yh0Var = new yh0(this, zh0.I);
        yh0Var.f35041a = 14;
        this.f26855a.add(yh0Var);
    }

    public final void b() {
        yh0 yh0Var = new yh0(this, zh0.J);
        yh0Var.f35041a = 16;
        this.f26855a.add(yh0Var);
    }

    public final void c() {
        yh0 yh0Var = new yh0(this, zh0.K);
        yh0Var.f35041a = 17;
        this.f26855a.add(yh0Var);
    }

    public final void d() {
        boolean z10;
        if (this.I) {
            return;
        }
        if (this.H == 6) {
            this.f26867x = this.f26855a.size();
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
        AndroidUtilities.runOnUIThread(new t90(6, this, arrayList));
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
                this.f26857b.setColor(i10);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f10 = this.N;
            float max = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f26867x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f26867x);
            float f11 = max / 2.0f;
            float f12 = this.f26868y / 2.0f;
            if (this.R) {
                f7 = max * 0.65f;
            } else {
                f7 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f11, f12, f7, org.telegram.ui.ActionBar.y6.o1(0.8f, this.Q), this.Q, Shader.TileMode.CLAMP);
            this.S = radialGradient;
            this.f26859c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f26861d0 == null) {
            this.f26861d0 = new xh0(this);
        }
        return this.f26861d0;
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
        if (this.f26866w != null) {
            this.f26866w = null;
            this.f26864r = null;
            invalidate();
        }
    }

    public final yh0 k(int i10) {
        yh0 j10 = j(i10, this.f26855a);
        if (j10 != null) {
            if (i10 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i10) {
            case 0:
                j10 = new yh0(this, zh0.d);
                break;
            case 1:
                j10 = new yh0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new yh0(this, zh0.h);
                break;
            case 3:
                j10 = new yh0(this, zh0.f35330n);
                j10.f35057t = true;
                j10.f35060x = 200;
                break;
            case 4:
                j10 = new yh0(this, zh0.f35331r);
                break;
            case 5:
                j10 = new yh0(this, zh0.f35332s);
                this.K = j10;
                j10.f35057t = true;
                j10.f35060x = 500;
                break;
            case 6:
                j10 = new yh0(this, zh0.v);
                j10.f35057t = true;
                j10.f35060x = 500;
                break;
            case 7:
                j10 = new yh0(this, zh0.f35333w);
                j10.f35057t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new yh0(this, zh0.f35334x);
                j10.f35057t = true;
                j10.f35060x = 500;
                break;
            case 9:
                j10 = new yh0(this, zh0.f35335y);
                j10.f35057t = true;
                j10.f35058u = R.raw.profile_leave;
                j10.f35060x = 300;
                break;
            case 10:
                j10 = new yh0(this, zh0.E);
                j10.f35057t = true;
                j10.f35058u = R.raw.profile_voicechat;
                j10.f35060x = 500;
                break;
            case 11:
                j10 = new yh0(this, zh0.F);
                j10.f35057t = true;
                j10.f35058u = R.raw.profile_voicechat;
                j10.f35060x = 500;
                break;
            case 12:
                j10 = new yh0(this, zh0.G);
                break;
            case 13:
                j10 = new yh0(this, zh0.H);
                j10.f35057t = true;
                j10.f35060x = 300;
                break;
        }
        if (j10 != null) {
            j10.f35041a = i10;
        }
        return j10;
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
    public final void onDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f26868y + this.P + this.O), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yh0 yh0Var;
        if (this.E >= AndroidUtilities.dp(8.0f)) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.W = null;
                ArrayList arrayList = this.f26855a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    yh0 yh0Var2 = (yh0) arrayList.get(i10);
                    if (!yh0Var2.f35052o && yh0Var2.d.contains(x9, y3)) {
                        this.W = yh0Var2;
                        this.f26856a0 = x9;
                        this.f26858b0 = y3;
                        this.f26860c0 = System.currentTimeMillis();
                        this.W.f35042b.c(true);
                        break;
                    }
                    i10++;
                }
            } else if (action == 2) {
                if (this.W != null && (Math.abs(x9 - this.f26856a0) > 20.0f || Math.abs(y3 - this.f26858b0) > 20.0f)) {
                    this.W.f35042b.c(false);
                    this.W = null;
                }
            } else if ((action == 1 || action == 3) && (yh0Var = this.W) != null) {
                yh0Var.f35042b.c(false);
                if (action == 1 && this.W.d.contains(x9, y3)) {
                    if (System.currentTimeMillis() - this.f26860c0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    yh0 yh0Var3 = this.W;
                    if (yh0Var3.f35057t && !yh0Var3.f35056s) {
                        yh0Var3.f35056s = true;
                        invalidate();
                    }
                    yh0 yh0Var4 = this.W;
                    int i11 = yh0Var4.f35058u;
                    if (i11 != 0) {
                        yh0Var4.d(i11, 0, 0);
                    }
                    this.W.f35059w = System.currentTimeMillis();
                    yh0 yh0Var5 = this.W;
                    ai0 ai0Var = this.F;
                    if (ai0Var != null) {
                        int i12 = yh0Var5.v;
                        if (i12 == 0) {
                            int i13 = yh0Var5.f35041a;
                            RectF rectF = yh0Var5.d;
                            ProfileActivity.e0(((org.telegram.ui.wx0) ai0Var).f45582b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new t90(7, this, yh0Var5), i12);
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

    public final void p(yh0 yh0Var, boolean z10) {
        zh0 zh0Var;
        if (z10) {
            if (this.J) {
                zh0 zh0Var2 = zh0.e;
                yh0Var.c(LocaleController.getString(zh0Var2.f35336a));
                yh0Var.d(R.raw.profile_unmuting, zh0Var2.f35337b, zh0Var2.f35338c);
                return;
            }
            zh0 zh0Var3 = zh0.f35329f;
            yh0Var.c(LocaleController.getString(zh0Var3.f35336a));
            yh0Var.d(R.raw.profile_muting, zh0Var3.f35337b, zh0Var3.f35338c);
            return;
        }
        if (this.J) {
            zh0Var = zh0.e;
        } else {
            zh0Var = zh0.f35329f;
        }
        yh0Var.d(0, zh0Var.f35337b, zh0Var.f35338c);
        yh0Var.c(LocaleController.getString(zh0Var.f35336a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.J != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z10;
        yh0 j10 = j(1, this.f26855a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
            return;
        }
        this.G.add(1);
        d();
    }

    public void setOnActionClickListener(ai0 ai0Var) {
        this.F = ai0Var;
    }

    public void setParentExpanded(float f7) {
        if (this.d != f7) {
            this.d = f7;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof da0)) {
            return false;
        }
        return true;
    }
}
