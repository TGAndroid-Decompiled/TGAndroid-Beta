package org.telegram.ui.Cells;

import a8.ye;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.nm0;
public abstract class fa {
    public final q9 A;
    public final Rect B;
    public ea C;
    public ye D;
    public nm0 E;
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
    public org.telegram.ui.ActionBar.m4 Y;
    public boolean Z;
    public int f24089a;
    public final v9 f24090a0;
    public int f24091b;
    public int f24092b0;
    public int f24093c;
    public final OvershootInterpolator f24094c0;
    public int d;
    public int f24095d0;
    public boolean e;
    public final m9 f24096e0;
    public float f24097f;
    public final n9 f24098f0;
    public float f24099g;
    public org.telegram.ui.ActionBar.u6 f24100g0;
    public final int[] h = new int[2];
    public boolean f24101h0;
    public boolean f24102i;
    public boolean f24103i0;
    public boolean f24104j;
    public boolean f24105j0;
    public boolean f24106k;
    public org.telegram.ui.s f24107k0;
    public final int f24108l;
    public ValueAnimator f24109l0;
    public final int f24110m;
    public final g m0;
    public final float f24111n;
    public final m9 f24112n0;
    public final Paint f24113o;
    public final z9 f24114o0;
    public final Paint f24115p;
    public final fr f24116q;
    public final Path f24117r;
    public int f24118s;
    public int f24119t;
    public int f24120u;
    public int v;
    public int f24121w;
    public int f24122x;
    public boolean f24123y;
    public boolean f24124z;

    public fa() {
        new Path().f25729a = 0.0f;
        Paint paint = new Paint(1);
        this.f24113o = paint;
        this.f24115p = new Paint(1);
        fr frVar = new fr();
        this.f24116q = frVar;
        this.f24117r = new Path();
        new Path().f25674a = frVar;
        this.f24120u = -1;
        this.v = -1;
        this.A = new q9(this, new p9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f24090a0 = new Object();
        this.f24094c0 = new OvershootInterpolator();
        this.f24096e0 = new m9(this, 0);
        this.f24098f0 = new n9(this);
        this.f24101h0 = true;
        this.f24107k0 = null;
        new ArrayList();
        this.m0 = new g(this, 7);
        this.f24112n0 = new m9(this, 1);
        ?? path = new Path();
        path.f25817a = 0.0f;
        path.f25818b = new ArrayList(1);
        path.f25819c = 0;
        this.f24114o0 = path;
        this.f24108l = ViewConfiguration.getLongPressTimeout();
        this.f24110m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f24111n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        frVar.d = 1.0f;
    }

    public static void a(fa faVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        v9 v9Var = faVar.f24090a0;
        if (Build.VERSION.SDK_INT >= 28 && faVar.W != null && !faVar.f24106k && faVar.f24102i && faVar.C != null) {
            if (faVar.f24104j) {
                i11 = faVar.f24120u;
            } else {
                i11 = faVar.v;
            }
            faVar.i(i11, v9Var, false);
            Layout layout = v9Var.f25606b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - v9Var.f25605a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l4 = faVar.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + faVar.f24091b) + l4[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + v9Var.f25607c);
                aa aaVar = faVar.W;
                if (aaVar instanceof org.telegram.ui.t2) {
                    lineLeft = l4[0];
                    lineRight = ((View) aaVar).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = l4[0] + faVar.f24089a + v9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + faVar.f24089a + v9Var.d);
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

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i10, int i11, boolean z10, float f7, float f10, aa aaVar) {
        int i12;
        int i13;
        if (this.f24104j) {
            this.f24120u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f24120u = i13;
                this.f24104j = false;
            }
            this.f24123y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f24120u) > i11) {
            this.v = i12;
            this.f24120u = i11;
            this.f24104j = true;
        }
        this.f24123y = true;
    }

    public final int[] B(int i10) {
        v9 v9Var = this.f24090a0;
        i(i10, v9Var, false);
        Layout layout = v9Var.f25606b;
        int i11 = i10 - v9Var.f25605a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + v9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + v9Var.f25607c);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        ea eaVar;
        if (x() && (eaVar = this.C) != null) {
            this.Q = true;
            eaVar.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(aa aaVar, aa aaVar2);

    public final boolean M(MotionEvent motionEvent) {
        fa faVar;
        int action = motionEvent.getAction();
        n9 n9Var = this.f24098f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f24119t - ((int) motionEvent.getY());
                    int x9 = this.f24118s - ((int) motionEvent.getX());
                    int i10 = (x9 * x9) + (y3 * y3);
                    int i11 = this.f24110m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(n9Var);
                        this.f24124z = false;
                    }
                    return this.f24124z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(n9Var);
            this.f24124z = false;
            return false;
        }
        this.f24118s = (int) motionEvent.getX();
        this.f24119t = (int) motionEvent.getY();
        this.f24124z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f24118s, this.f24119t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f24118s;
            int i13 = this.f24119t;
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
            int k10 = faVar.k(i16, i13, this.f24093c, this.d, this.X, true);
            CharSequence s10 = s(faVar.X, true);
            if (k10 >= s10.length()) {
                v9 v9Var = faVar.f24090a0;
                i(k10, v9Var, true);
                Layout layout = v9Var.f25606b;
                if (layout == null) {
                    faVar.f24124z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - faVar.f24093c;
                if (f7 < v9Var.f25606b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.f25606b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(n9Var);
                AndroidUtilities.runOnUIThread(n9Var, faVar.f24108l);
                faVar.f24124z = true;
            }
        } else {
            faVar = this;
        }
        return faVar.f24124z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(di.n2 n2Var) {
        this.D = n2Var;
    }

    public final void R() {
        this.f24103i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof nm0) {
            this.E = (nm0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f24102i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.m4 m4Var = this.Y;
                q9 q9Var = this.A;
                if (m4Var == null) {
                    org.telegram.ui.ActionBar.m4 m4Var2 = new org.telegram.ui.ActionBar.m4(this.C.getContext(), q9Var, this.C, new org.telegram.ui.ActionBar.c5(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = m4Var2;
                    q9Var.onCreateActionMode(m4Var2, m4Var2.f22869c);
                }
                org.telegram.ui.ActionBar.m4 m4Var3 = this.Y;
                q9Var.onPrepareActionMode(m4Var3, m4Var3.f22869c);
                this.Y.hide(1L);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f24112n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f24109l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f24109l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 8));
            this.f24109l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f24109l0.start();
        }
    }

    public final void V() {
        this.Q = false;
        this.C.invalidate();
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f24120u && i10 != this.v) {
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
        E(z10);
        this.f24120u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f24121w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f24098f0);
        this.f24124z = false;
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        ye yeVar = this.D;
        if (yeVar != null) {
            yeVar.a(false);
        }
        this.f24118s = -1;
        this.f24119t = -1;
        this.f24093c = -1;
        this.d = -1;
        this.f24097f = 0.0f;
        this.f24099g = 0.0f;
        this.f24102i = false;
    }

    public final void g(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        fr frVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        z9 z9Var = this.f24114o0;
        z9Var.reset();
        layout.getSelectionPath(i11, i12, z9Var);
        if (z9Var.f25817a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (z9Var.f25817a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = z9Var.f25819c;
            frVar = this.f24116q;
            f12 = this.f24111n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) z9Var.f25818b.get(i14);
            float max = Math.max(f7, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float z12 = (int) c3.h0.z(rectF.top, f11, f10, f11);
            float max2 = Math.max(f7, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, z12, (int) (max2 + f14), (int) c3.h0.z(rectF.bottom, f11, f10, f11));
            frVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                frVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.fa.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i10, v9 v9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i10, int i11, int i12, int i13, aa aaVar, boolean z10);

    public final int[] l() {
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

    public abstract int m();

    public final ea n(Context context) {
        if (this.C == null) {
            this.C = new ea(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.u6 q() {
        return this.f24100g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.f24120u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(aa aaVar, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.f24100g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.m4 m4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f24112n0.run();
        }
        this.P = false;
        if (!x() && (m4Var = this.Y) != null) {
            m4Var.finish();
            this.Y = null;
        }
    }

    public final void v() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT >= 28 && (magnifier = this.G) != null) {
            magnifier.dismiss();
            this.G = null;
        }
    }

    public void w() {
        aa aaVar = this.W;
        if (aaVar != null) {
            aaVar.invalidate();
        }
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.invalidate();
        }
    }

    public final boolean x() {
        if (this.f24120u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(MessageObject messageObject) {
        if (messageObject == null || this.f24121w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void D() {
    }

    public void F() {
    }

    public void H() {
    }

    public void N() {
    }

    public void O() {
    }

    public void E(boolean z10) {
    }

    public void K(float f7, float f10) {
    }

    public void I(MessageObject messageObject, int i10, int i11) {
    }
}
