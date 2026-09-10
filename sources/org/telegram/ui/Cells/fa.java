package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.vl0;
public abstract class fa {
    public final ActionMode.Callback A;
    public final Rect B;
    public ea C;
    public w7.w5 D;
    public vl0 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public aa W;
    public aa X;
    public ActionMode Y;
    public boolean Z;
    public int f19128a;
    public final v9 f19129a0;
    public int f19130b;
    public int f19131b0;
    public int f19132c;
    public final OvershootInterpolator f19133c0;
    public int d;
    public boolean f19134d0;
    public boolean e;
    public int f19135e0;
    public float f19136f;
    public final l9 f19137f0;
    public float f19138g;
    public final m9 f19139g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f19140h0;
    public boolean f19141i;
    public boolean f19142i0;
    public boolean f19143j;
    public boolean f19144j0;
    public boolean f19145k;
    public boolean f19146k0;
    public final int f19147l;
    public org.telegram.ui.u f19148l0;
    public final int f19149m;
    public ValueAnimator m0;
    public final float f19150n;
    public org.telegram.ui.ActionBar.p1 f19151n0;
    public final Paint f19152o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f19153o0;
    public final Paint f19154p;
    public TextView f19155p0;
    public final ar f19156q;
    public Rect f19157q0;
    public final Path f19158r;
    public final g f19159r0;
    public int f19160s;
    public final n9 f19161s0;
    public int f19162t;
    public final z9 f19163t0;
    public int f19164u;
    public int v;
    public int f19165w;
    public int f19166x;
    public boolean f19167y;
    public boolean f19168z;

    public fa() {
        new Path().f20732a = 0.0f;
        Paint paint = new Paint(1);
        this.f19152o = paint;
        this.f19154p = new Paint(1);
        ar arVar = new ar();
        this.f19156q = arVar;
        this.f19158r = new Path();
        new Path().f20683a = arVar;
        this.f19164u = -1;
        this.v = -1;
        p9 p9Var = new p9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new q9(this, p9Var) : p9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f19129a0 = new Object();
        this.f19133c0 = new OvershootInterpolator();
        this.f19134d0 = false;
        this.f19137f0 = new l9(this, 0);
        this.f19139g0 = new m9(this);
        this.f19142i0 = true;
        this.f19148l0 = null;
        this.f19159r0 = new g(this, 7);
        this.f19161s0 = new n9(this);
        ?? path = new Path();
        path.f20797a = 0.0f;
        path.f20798b = new ArrayList(1);
        path.f20799c = 0;
        this.f19163t0 = path;
        this.f19147l = ViewConfiguration.getLongPressTimeout();
        this.f19149m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f19150n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        arVar.d = 1.0f;
    }

    public static void a(fa faVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        v9 v9Var = faVar.f19129a0;
        if (Build.VERSION.SDK_INT >= 28 && faVar.W != null && !faVar.f19145k && faVar.f19141i && faVar.C != null) {
            if (faVar.f19143j) {
                i11 = faVar.f19164u;
            } else {
                i11 = faVar.v;
            }
            faVar.j(i11, v9Var, false);
            Layout layout = v9Var.f20570b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - v9Var.f20569a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = faVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + faVar.f19130b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + v9Var.f20571c);
                aa aaVar = faVar.W;
                if (aaVar instanceof org.telegram.ui.v2) {
                    lineLeft = m10[0];
                    lineRight = ((View) aaVar).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = m10[0] + faVar.f19128a + v9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + faVar.f19128a + v9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (faVar.I != f10) {
                    faVar.I = f10;
                    faVar.J = (f10 - faVar.H) / 200.0f;
                }
                float f11 = i10;
                if (faVar.L != f11) {
                    faVar.L = f11;
                    faVar.M = (f11 - faVar.K) / 100.0f;
                }
                if (faVar.G == null) {
                    faVar.G = new Magnifier(faVar.C);
                    faVar.H = faVar.I;
                    faVar.K = faVar.L;
                }
                float f12 = faVar.H;
                float f13 = faVar.I;
                if (f12 != f13) {
                    faVar.H = (faVar.J * 16.0f) + f12;
                }
                float f14 = faVar.J;
                if (f14 > 0.0f && faVar.H > f13) {
                    faVar.H = f13;
                } else if (f14 < 0.0f && faVar.H < f13) {
                    faVar.H = f13;
                }
                float f15 = faVar.K;
                float f16 = faVar.L;
                if (f15 != f16) {
                    faVar.K = (faVar.M * 16.0f) + f15;
                }
                float f17 = faVar.M;
                if (f17 > 0.0f && faVar.K > f16) {
                    faVar.K = f16;
                } else if (f17 < 0.0f && faVar.K < f16) {
                    faVar.K = f16;
                }
                faVar.G.show(faVar.K, (lineBottom * 1.5f) + faVar.H + AndroidUtilities.dp(8.0f));
                faVar.G.update();
            }
        }
    }

    public static boolean z(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public boolean A(MessageObject messageObject) {
        if (messageObject == null || this.f19165w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, aa aaVar) {
        int i12;
        int i13;
        if (this.f19143j) {
            this.f19164u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f19164u = i13;
                this.f19143j = false;
            }
            this.f19167y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f19164u) > i11) {
            this.v = i12;
            this.f19164u = i11;
            this.f19143j = true;
        }
        this.f19167y = true;
    }

    public final int[] C(int i10) {
        v9 v9Var = this.f19129a0;
        j(i10, v9Var, false);
        Layout layout = v9Var.f20570b;
        int i11 = i10 - v9Var.f20569a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + v9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + v9Var.f20571c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        ea eaVar;
        if (y() && (eaVar = this.C) != null) {
            this.Q = true;
            eaVar.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(aa aaVar, aa aaVar2);

    public final boolean N(MotionEvent motionEvent) {
        fa faVar;
        int action = motionEvent.getAction();
        m9 m9Var = this.f19139g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f19162t - ((int) motionEvent.getY());
                    int x10 = this.f19160s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f19149m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(m9Var);
                        this.f19168z = false;
                    }
                    return this.f19168z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(m9Var);
            this.f19168z = false;
            return false;
        }
        this.f19160s = (int) motionEvent.getX();
        this.f19162t = (int) motionEvent.getY();
        this.f19168z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f19160s, this.f19162t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f19160s;
            int i13 = this.f19162t;
            int i14 = rect.right;
            if (i12 > i14) {
                i12 = i14 - 1;
            }
            int i15 = rect.left;
            if (i12 < i15) {
                i12 = i15 + 1;
            }
            int i16 = i12;
            int i17 = rect.top;
            if (i13 < i17) {
                i13 = i17 + 1;
            }
            int i18 = rect.bottom;
            if (i13 > i18) {
                i13 = i18 - 1;
            }
            faVar = this;
            int l4 = faVar.l(i16, i13, this.f19132c, this.d, this.X, true);
            CharSequence t10 = t(faVar.X, true);
            if (l4 >= t10.length()) {
                v9 v9Var = faVar.f19129a0;
                j(l4, v9Var, true);
                Layout layout = v9Var.f20570b;
                if (layout == null) {
                    faVar.f19168z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - faVar.f19132c;
                if (f7 < v9Var.f20570b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.f20570b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(m9Var);
                AndroidUtilities.runOnUIThread(m9Var, faVar.f19147l);
                faVar.f19168z = true;
            }
        } else {
            faVar = this;
        }
        return faVar.f19168z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(org.telegram.ui.z0 z0Var) {
        this.D = z0Var;
    }

    public final void S() {
        this.f19144j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof vl0) {
            this.E = (vl0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.fa.U():void");
    }

    public final void V() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.m0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.m0.start();
        }
    }

    public final void W() {
        this.Q = false;
        this.C.invalidate();
        g gVar = this.f19159r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f19164u && i10 != this.v) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.W != null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z10) {
        F(z10);
        this.f19164u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f19165w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f19139g0);
        this.f19168z = false;
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.w5 w5Var = this.D;
        if (w5Var != null) {
            w5Var.a(false);
        }
        this.f19160s = -1;
        this.f19162t = -1;
        this.f19132c = -1;
        this.d = -1;
        this.f19136f = 0.0f;
        this.f19138g = 0.0f;
        this.f19141i = false;
    }

    public final void g() {
        if (y()) {
            if (!D()) {
                CharSequence s10 = s();
                if (s10 != null) {
                    AndroidUtilities.addToClipboard(s10);
                } else {
                    return;
                }
            }
            v();
            f(true);
            w7.w5 w5Var = this.D;
            if (w5Var != null) {
                w5Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        ar arVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        z9 z9Var = this.f19163t0;
        z9Var.reset();
        layout.getSelectionPath(i11, i12, z9Var);
        if (z9Var.f20797a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (z9Var.f20797a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = z9Var.f20799c;
            arVar = this.f19156q;
            f12 = this.f19150n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) z9Var.f20798b.get(i14);
            float max = Math.max(f7, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float z12 = (int) com.google.android.gms.internal.vision.e2.z(rectF.top, f11, f10, f11);
            float max2 = Math.max(f7, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, z12, (int) (max2 + f14), (int) com.google.android.gms.internal.vision.e2.z(rectF.bottom, f11, f10, f11));
            arVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                arVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.fa.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, v9 v9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, aa aaVar, boolean z10);

    public final int[] m() {
        int i10;
        View view = (View) this.W;
        int i11 = 0;
        if (view != null && this.F != null) {
            i10 = 0;
            int i12 = 0;
            while (view != this.F) {
                if (view != null) {
                    i10 = (int) (view.getY() + i10);
                    i12 = (int) (view.getX() + i12);
                    if (view instanceof NestedScrollView) {
                        i10 -= view.getScrollY();
                        i12 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i11 = i12;
            return new int[]{i11, i10};
        }
        i10 = 0;
        return new int[]{i11, i10};
    }

    public abstract int n();

    public final ea o(Context context) {
        if (this.C == null) {
            this.C = new ea(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.f6 r() {
        return this.f19140h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f19164u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(aa aaVar, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f19140h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f19161s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.p1 p1Var = this.f19151n0;
        if (p1Var != null) {
            p1Var.d(true);
        }
    }

    public final void w() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT >= 28 && (magnifier = this.G) != null) {
            magnifier.dismiss();
            this.G = null;
        }
    }

    public void x() {
        aa aaVar = this.W;
        if (aaVar != null) {
            aaVar.invalidate();
        }
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.invalidate();
        }
    }

    public final boolean y() {
        if (this.f19164u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public void E() {
    }

    public void F(boolean z10) {
    }

    public void G() {
    }

    public void I() {
    }

    public void O() {
    }

    public void P() {
    }

    public void L(float f7, float f10) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
