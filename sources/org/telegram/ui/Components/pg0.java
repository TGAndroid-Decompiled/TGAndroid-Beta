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
public final class pg0 extends View {
    public float A;
    public og0 B;
    public final HashSet C;
    public int D;
    public boolean E;
    public boolean F;
    public mg0 G;
    public mg0 H;
    public mg0 I;
    public final float J;
    public final float K;
    public final float L;
    public int M;
    public boolean N;
    public RadialGradient O;
    public final Matrix P;
    public int Q;
    public PorterDuffColorFilter R;
    public mg0 S;
    public float T;
    public float U;
    public long V;
    public lg0 W;
    public final ArrayList f31648a;
    public final Paint f31649b;
    public final Paint f31650c;
    public float d;
    public boolean f31651e;
    public float f31652f;
    public final Path h;
    public final Path f31653n;
    public org.telegram.ui.iz0 f31654r;
    public float f31655s;
    public float v;
    public RenderNode f31656w;
    public int f31657x;
    public final int f31658y;

    public pg0(Context context, int i9) {
        super(context);
        this.f31648a = new ArrayList();
        Paint paint = new Paint();
        this.f31649b = paint;
        this.f31650c = new Paint();
        this.f31651e = true;
        this.f31652f = -1.0f;
        this.h = new Path();
        this.f31653n = new Path();
        this.f31657x = 0;
        this.A = 0.0f;
        this.B = null;
        this.C = new HashSet();
        this.D = 6;
        this.G = null;
        this.M = 0;
        this.P = new Matrix();
        this.S = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.J = AndroidUtilities.dpf2(14.0f);
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        this.K = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.L = dpf22;
        AndroidUtilities.dpf2(4.0f);
        this.f31658y = (int) ((i9 - dpf2) - dpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.J;
        int i9 = this.f31657x;
        return ((measuredWidth - ((f10 / 2.0f) * (i9 - 1))) - (f10 * 2.0f)) / i9;
    }

    public static mg0 j(int i9, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mg0 mg0Var = (mg0) list.get(i10);
            if (!mg0Var.f30826o && mg0Var.f30814a == i9) {
                return mg0Var;
            }
        }
        return null;
    }

    public final void a() {
        mg0 mg0Var = new mg0(this, ng0.E);
        mg0Var.f30814a = 14;
        this.f31648a.add(mg0Var);
    }

    public final void b() {
        mg0 mg0Var = new mg0(this, ng0.F);
        mg0Var.f30814a = 16;
        this.f31648a.add(mg0Var);
    }

    public final void c() {
        mg0 mg0Var = new mg0(this, ng0.G);
        mg0Var.f30814a = 17;
        this.f31648a.add(mg0Var);
    }

    public final void d() {
        boolean z10;
        if (this.E) {
            return;
        }
        if (this.D == 6) {
            this.f31657x = this.f31648a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.C;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i9 = this.D;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3 && i9 != 4) {
                        if (i9 == 5) {
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
        AndroidUtilities.runOnUIThread(new jg0(1, this, arrayList));
    }

    public final void e() {
        this.E = true;
    }

    public final boolean f() {
        int i9 = this.D;
        if (i9 == 1 || i9 == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f10;
        int i9 = this.M;
        if (i9 != 0) {
            if (!this.N) {
                this.f31649b.setColor(i9);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f11 = this.J;
            float max = ((measuredWidth - ((f11 / 2.0f) * Math.max(0, this.f31657x - 1))) - (f11 * 2.0f)) / Math.max(1, this.f31657x);
            float f12 = max / 2.0f;
            float f13 = this.f31658y / 2.0f;
            if (this.N) {
                f10 = max * 0.65f;
            } else {
                f10 = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f12, f13, f10, org.telegram.ui.ActionBar.f6.l1(0.8f, this.M), this.M, Shader.TileMode.CLAMP);
            this.O = radialGradient;
            this.f31650c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.W == null) {
            this.W = new lg0(this);
        }
        return this.W;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.R);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.f31656w != null) {
            this.f31656w = null;
            this.f31654r = null;
            invalidate();
        }
    }

    public final mg0 k(int i9) {
        mg0 j10 = j(i9, this.f31648a);
        if (j10 != null) {
            if (i9 == 1) {
                p(j10, false);
            }
            return j10;
        }
        switch (i9) {
            case 0:
                j10 = new mg0(this, ng0.d);
                break;
            case 1:
                j10 = new mg0(this);
                p(j10, false);
                break;
            case 2:
                j10 = new mg0(this, ng0.h);
                break;
            case 3:
                j10 = new mg0(this, ng0.f31104n);
                j10.f30831t = true;
                j10.f30834x = 200;
                break;
            case 4:
                j10 = new mg0(this, ng0.f31105r);
                break;
            case 5:
                j10 = new mg0(this, ng0.f31106s);
                this.G = j10;
                j10.f30831t = true;
                j10.f30834x = 500;
                break;
            case 6:
                j10 = new mg0(this, ng0.v);
                j10.f30831t = true;
                j10.f30834x = 500;
                break;
            case 7:
                j10 = new mg0(this, ng0.f31107w);
                j10.f30831t = true;
                j10.v = 300;
                break;
            case 8:
                j10 = new mg0(this, ng0.f31108x);
                j10.f30831t = true;
                j10.f30834x = 500;
                break;
            case 9:
                j10 = new mg0(this, ng0.f31109y);
                j10.f30831t = true;
                j10.f30832u = R.raw.profile_leave;
                j10.f30834x = 300;
                break;
            case 10:
                j10 = new mg0(this, ng0.A);
                j10.f30831t = true;
                j10.f30832u = R.raw.profile_voicechat;
                j10.f30834x = 500;
                break;
            case 11:
                j10 = new mg0(this, ng0.B);
                j10.f30831t = true;
                j10.f30832u = R.raw.profile_voicechat;
                j10.f30834x = 500;
                break;
            case 12:
                j10 = new mg0(this, ng0.C);
                break;
            case 13:
                j10 = new mg0(this, ng0.D);
                j10.f30831t = true;
                j10.f30834x = 300;
                break;
        }
        if (j10 != null) {
            j10.f30814a = i9;
        }
        return j10;
    }

    public final boolean l() {
        if (this.C.contains(5) && this.G != null) {
            return true;
        }
        return false;
    }

    public final void m(int i9, ArrayList arrayList) {
        if (this.C.contains(Integer.valueOf(i9))) {
            arrayList.add(k(i9));
        }
    }

    public final void n(int i9, int i10, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i9));
        }
    }

    public final void o(int i9, boolean z10) {
        boolean remove;
        HashSet hashSet = this.C;
        if (z10) {
            remove = hashSet.add(Integer.valueOf(i9));
        } else {
            remove = hashSet.remove(Integer.valueOf(i9));
        }
        if (remove) {
            d();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.makeMeasureSpec((int) (this.f31658y + this.L + this.K), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mg0 mg0Var;
        if (this.A >= AndroidUtilities.dp(8.0f)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.S = null;
                ArrayList arrayList = this.f31648a;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    mg0 mg0Var2 = (mg0) arrayList.get(i9);
                    if (!mg0Var2.f30826o && mg0Var2.d.contains(x10, y10)) {
                        this.S = mg0Var2;
                        this.T = x10;
                        this.U = y10;
                        this.V = System.currentTimeMillis();
                        this.S.f30815b.c(true);
                        break;
                    }
                    i9++;
                }
            } else if (action == 2) {
                if (this.S != null && (Math.abs(x10 - this.T) > 20.0f || Math.abs(y10 - this.U) > 20.0f)) {
                    this.S.f30815b.c(false);
                    this.S = null;
                }
            } else if ((action == 1 || action == 3) && (mg0Var = this.S) != null) {
                mg0Var.f30815b.c(false);
                if (action == 1 && this.S.d.contains(x10, y10)) {
                    if (System.currentTimeMillis() - this.V > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    mg0 mg0Var3 = this.S;
                    if (mg0Var3.f30831t && !mg0Var3.f30830s) {
                        mg0Var3.f30830s = true;
                        invalidate();
                    }
                    mg0 mg0Var4 = this.S;
                    int i10 = mg0Var4.f30832u;
                    if (i10 != 0) {
                        mg0Var4.d(i10, 0, 0);
                    }
                    this.S.f30833w = System.currentTimeMillis();
                    mg0 mg0Var5 = this.S;
                    og0 og0Var = this.B;
                    if (og0Var != null) {
                        int i11 = mg0Var5.v;
                        if (i11 == 0) {
                            int i12 = mg0Var5.f30814a;
                            RectF rectF = mg0Var5.d;
                            ProfileActivity.X(((org.telegram.ui.fx0) og0Var).f38363b, i12, rectF.left, rectF.top);
                        } else {
                            postDelayed(new jg0(2, this, mg0Var5), i11);
                        }
                    }
                }
                this.S = null;
                return true;
            }
            if (this.S != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(mg0 mg0Var, boolean z10) {
        ng0 ng0Var;
        if (z10) {
            if (this.F) {
                ng0 ng0Var2 = ng0.f31102e;
                mg0Var.c(LocaleController.getString(ng0Var2.f31110a));
                mg0Var.d(R.raw.profile_unmuting, ng0Var2.f31111b, ng0Var2.f31112c);
                return;
            }
            ng0 ng0Var3 = ng0.f31103f;
            mg0Var.c(LocaleController.getString(ng0Var3.f31110a));
            mg0Var.d(R.raw.profile_muting, ng0Var3.f31111b, ng0Var3.f31112c);
            return;
        }
        if (this.F) {
            ng0Var = ng0.f31102e;
        } else {
            ng0Var = ng0.f31103f;
        }
        mg0Var.d(0, ng0Var.f31111b, ng0Var.f31112c);
        mg0Var.c(LocaleController.getString(ng0Var.f31110a));
    }

    public void setNotifications(boolean z10) {
        boolean z11;
        if (this.F != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.F = z10;
        mg0 j10 = j(1, this.f31648a);
        if (j10 != null) {
            p(j10, z11);
            invalidate();
            return;
        }
        this.C.add(1);
        d();
    }

    public void setOnActionClickListener(og0 og0Var) {
        this.B = og0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof p80)) {
            return false;
        }
        return true;
    }
}
