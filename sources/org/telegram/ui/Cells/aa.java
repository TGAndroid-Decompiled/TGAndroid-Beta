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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.im0;
public abstract class aa {
    public final l9 A;
    public final Rect B;
    public z9 C;
    public w7.j0 D;
    public im0 E;
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
    public v9 W;
    public v9 X;
    public org.telegram.ui.ActionBar.h4 Y;
    public boolean Z;
    public int f21985a;
    public final q9 f21986a0;
    public int f21987b;
    public int f21988b0;
    public int f21989c;
    public final OvershootInterpolator f21990c0;
    public int d;
    public int f21991d0;
    public boolean e;
    public final h9 f21992e0;
    public float f21993f;
    public final i9 f21994f0;
    public float f21995g;
    public org.telegram.ui.ActionBar.d6 f21996g0;
    public final int[] h = new int[2];
    public boolean f21997h0;
    public boolean f21998i;
    public boolean f21999i0;
    public boolean f22000j;
    public boolean f22001j0;
    public boolean f22002k;
    public org.telegram.ui.t f22003k0;
    public final int f22004l;
    public ValueAnimator f22005l0;
    public final int f22006m;
    public final g m0;
    public final float f22007n;
    public final h9 f22008n0;
    public final Paint f22009o;
    public final u9 f22010o0;
    public final Paint f22011p;
    public final er f22012q;
    public final Path f22013r;
    public int f22014s;
    public int f22015t;
    public int f22016u;
    public int v;
    public int f22017w;
    public int f22018x;
    public boolean f22019y;
    public boolean f22020z;

    public aa() {
        new Path().f23062a = 0.0f;
        Paint paint = new Paint(1);
        this.f22009o = paint;
        this.f22011p = new Paint(1);
        er erVar = new er();
        this.f22012q = erVar;
        this.f22013r = new Path();
        new Path().f22961a = erVar;
        this.f22016u = -1;
        this.v = -1;
        this.A = new l9(this, new k9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f21986a0 = new Object();
        this.f21990c0 = new OvershootInterpolator();
        this.f21992e0 = new h9(this, 0);
        this.f21994f0 = new i9(this);
        this.f21997h0 = true;
        this.f22003k0 = null;
        this.m0 = new g(this, 7);
        this.f22008n0 = new h9(this, 1);
        ?? path = new Path();
        path.f23611a = 0.0f;
        path.f23612b = new ArrayList(1);
        path.f23613c = 0;
        this.f22010o0 = path;
        this.f22004l = ViewConfiguration.getLongPressTimeout();
        this.f22006m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f22007n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        erVar.d = 1.0f;
    }

    public static void a(aa aaVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        q9 q9Var = aaVar.f21986a0;
        if (Build.VERSION.SDK_INT >= 28 && aaVar.W != null && !aaVar.f22002k && aaVar.f21998i && aaVar.C != null) {
            if (aaVar.f22000j) {
                i11 = aaVar.f22016u;
            } else {
                i11 = aaVar.v;
            }
            aaVar.i(i11, q9Var, false);
            Layout layout = q9Var.f22796b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - q9Var.f22795a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l4 = aaVar.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + aaVar.f21987b) + l4[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + q9Var.f22797c);
                v9 v9Var = aaVar.W;
                if (v9Var instanceof org.telegram.ui.w2) {
                    lineLeft = l4[0];
                    lineRight = ((View) v9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = l4[0] + aaVar.f21985a + q9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + aaVar.f21985a + q9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (aaVar.I != f10) {
                    aaVar.I = f10;
                    aaVar.J = (f10 - aaVar.H) / 200.0f;
                }
                float f11 = i10;
                if (aaVar.L != f11) {
                    aaVar.L = f11;
                    aaVar.M = (f11 - aaVar.K) / 100.0f;
                }
                if (aaVar.G == null) {
                    aaVar.G = new Magnifier(aaVar.C);
                    aaVar.H = aaVar.I;
                    aaVar.K = aaVar.L;
                }
                float f12 = aaVar.H;
                float f13 = aaVar.I;
                if (f12 != f13) {
                    aaVar.H = (aaVar.J * 16.0f) + f12;
                }
                float f14 = aaVar.J;
                if (f14 > 0.0f && aaVar.H > f13) {
                    aaVar.H = f13;
                } else if (f14 < 0.0f && aaVar.H < f13) {
                    aaVar.H = f13;
                }
                float f15 = aaVar.K;
                float f16 = aaVar.L;
                if (f15 != f16) {
                    aaVar.K = (aaVar.M * 16.0f) + f15;
                }
                float f17 = aaVar.M;
                if (f17 > 0.0f && aaVar.K > f16) {
                    aaVar.K = f16;
                } else if (f17 < 0.0f && aaVar.K < f16) {
                    aaVar.K = f16;
                }
                aaVar.G.show(aaVar.K, (lineBottom * 1.5f) + aaVar.H + AndroidUtilities.dp(8.0f));
                aaVar.G.update();
            }
        }
    }

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i10, int i11, boolean z10, float f7, float f10, v9 v9Var) {
        int i12;
        int i13;
        if (this.f22000j) {
            this.f22016u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f22016u = i13;
                this.f22000j = false;
            }
            this.f22019y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f22016u) > i11) {
            this.v = i12;
            this.f22016u = i11;
            this.f22000j = true;
        }
        this.f22019y = true;
    }

    public final int[] B(int i10) {
        q9 q9Var = this.f21986a0;
        i(i10, q9Var, false);
        Layout layout = q9Var.f22796b;
        int i11 = i10 - q9Var.f22795a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + q9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + q9Var.f22797c);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        z9 z9Var;
        if (x() && (z9Var = this.C) != null) {
            this.Q = true;
            z9Var.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(v9 v9Var, v9 v9Var2);

    public final boolean M(MotionEvent motionEvent) {
        aa aaVar;
        int action = motionEvent.getAction();
        i9 i9Var = this.f21994f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f22015t - ((int) motionEvent.getY());
                    int x10 = this.f22014s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f22006m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(i9Var);
                        this.f22020z = false;
                    }
                    return this.f22020z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(i9Var);
            this.f22020z = false;
            return false;
        }
        this.f22014s = (int) motionEvent.getX();
        this.f22015t = (int) motionEvent.getY();
        this.f22020z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f22014s, this.f22015t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f22014s;
            int i13 = this.f22015t;
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
            aaVar = this;
            int k10 = aaVar.k(i16, i13, this.f21989c, this.d, this.X, true);
            CharSequence s10 = s(aaVar.X, true);
            if (k10 >= s10.length()) {
                q9 q9Var = aaVar.f21986a0;
                i(k10, q9Var, true);
                Layout layout = q9Var.f22796b;
                if (layout == null) {
                    aaVar.f22020z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - aaVar.f21989c;
                if (f7 < q9Var.f22796b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > q9Var.f22796b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(i9Var);
                AndroidUtilities.runOnUIThread(i9Var, aaVar.f22004l);
                aaVar.f22020z = true;
            }
        } else {
            aaVar = this;
        }
        return aaVar.f22020z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(ci.o2 o2Var) {
        this.D = o2Var;
    }

    public final void R() {
        this.f21999i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof im0) {
            this.E = (im0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f21998i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.h4 h4Var = this.Y;
                l9 l9Var = this.A;
                if (h4Var == null) {
                    org.telegram.ui.ActionBar.h4 h4Var2 = new org.telegram.ui.ActionBar.h4(this.C.getContext(), l9Var, this.C, new org.telegram.ui.ActionBar.x4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = h4Var2;
                    l9Var.onCreateActionMode(h4Var2, h4Var2.f20912c);
                }
                org.telegram.ui.ActionBar.h4 h4Var3 = this.Y;
                l9Var.onPrepareActionMode(h4Var3, h4Var3.f20912c);
                this.Y.hide(1L);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f22008n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f22005l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f22005l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f22005l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f22005l0.start();
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
        if (i10 != this.f22016u && i10 != this.v) {
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
        this.f22016u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f22017w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f21994f0);
        this.f22020z = false;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(false);
        }
        this.f22014s = -1;
        this.f22015t = -1;
        this.f21989c = -1;
        this.d = -1;
        this.f21993f = 0.0f;
        this.f21995g = 0.0f;
        this.f21998i = false;
    }

    public final void g(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        er erVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        u9 u9Var = this.f22010o0;
        u9Var.reset();
        layout.getSelectionPath(i11, i12, u9Var);
        if (u9Var.f23611a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (u9Var.f23611a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = u9Var.f23613c;
            erVar = this.f22012q;
            f12 = this.f22007n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) u9Var.f23612b.get(i14);
            float max = Math.max(f7, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float y3 = (int) com.google.android.gms.internal.play_billing.k3.y(rectF.top, f11, f10, f11);
            float max2 = Math.max(f7, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, y3, (int) (max2 + f14), (int) com.google.android.gms.internal.play_billing.k3.y(rectF.bottom, f11, f10, f11));
            erVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                erVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.aa.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i10, q9 q9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i10, int i11, int i12, int i13, v9 v9Var, boolean z10);

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

    public final z9 n(Context context) {
        if (this.C == null) {
            this.C = new z9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.d6 q() {
        return this.f21996g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.f22016u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(v9 v9Var, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.f21996g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.h4 h4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f22008n0.run();
        }
        this.P = false;
        if (!x() && (h4Var = this.Y) != null) {
            h4Var.finish();
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
        v9 v9Var = this.W;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
        }
    }

    public final boolean x() {
        if (this.f22016u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(MessageObject messageObject) {
        if (messageObject == null || this.f22017w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void D() {
    }

    public void E(boolean z10) {
    }

    public void F() {
    }

    public void H() {
    }

    public void N() {
    }

    public void O() {
    }

    public void K(float f7, float f10) {
    }

    public void I(MessageObject messageObject, int i10, int i11) {
    }
}
