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
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.yl0;
public abstract class ea {
    public final ActionMode.Callback A;
    public final Rect B;
    public da C;
    public w7.i0 D;
    public yl0 E;
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
    public z9 W;
    public z9 X;
    public ActionMode Y;
    public boolean Z;
    public int f20218a;
    public final u9 f20219a0;
    public int f20220b;
    public int f20221b0;
    public int f20222c;
    public final OvershootInterpolator f20223c0;
    public int d;
    public boolean f20224d0;
    public boolean e;
    public int f20225e0;
    public float f20226f;
    public final u6 f20227f0;
    public float f20228g;
    public final l9 f20229g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f20230h0;
    public boolean f20231i;
    public boolean f20232i0;
    public boolean f20233j;
    public boolean f20234j0;
    public boolean f20235k;
    public boolean f20236k0;
    public final int f20237l;
    public org.telegram.ui.t f20238l0;
    public final int f20239m;
    public ValueAnimator m0;
    public final float f20240n;
    public org.telegram.ui.ActionBar.n1 f20241n0;
    public final Paint f20242o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f20243o0;
    public final Paint f20244p;
    public TextView f20245p0;
    public final uq f20246q;
    public Rect f20247q0;
    public final Path f20248r;
    public final g f20249r0;
    public int f20250s;
    public final m9 f20251s0;
    public int f20252t;
    public final y9 f20253t0;
    public int f20254u;
    public int v;
    public int f20255w;
    public int f20256x;
    public boolean f20257y;
    public boolean f20258z;

    public ea() {
        new Path().f21828a = 0.0f;
        Paint paint = new Paint(1);
        this.f20242o = paint;
        this.f20244p = new Paint(1);
        uq uqVar = new uq();
        this.f20246q = uqVar;
        this.f20248r = new Path();
        new Path().f21717a = uqVar;
        this.f20254u = -1;
        this.v = -1;
        o9 o9Var = new o9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new p9(this, o9Var) : o9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f20219a0 = new Object();
        this.f20223c0 = new OvershootInterpolator();
        this.f20224d0 = false;
        this.f20227f0 = new u6(this, 3);
        this.f20229g0 = new l9(this);
        this.f20232i0 = true;
        this.f20238l0 = null;
        this.f20249r0 = new g(this, 7);
        this.f20251s0 = new m9(this);
        ?? path = new Path();
        path.f21913a = 0.0f;
        path.f21914b = new ArrayList(1);
        path.f21915c = 0;
        this.f20253t0 = path;
        this.f20237l = ViewConfiguration.getLongPressTimeout();
        this.f20239m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f20240n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        uqVar.d = 1.0f;
    }

    public static void a(ea eaVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        u9 u9Var = eaVar.f20219a0;
        if (Build.VERSION.SDK_INT >= 28 && eaVar.W != null && !eaVar.f20235k && eaVar.f20231i && eaVar.C != null) {
            if (eaVar.f20233j) {
                i11 = eaVar.f20254u;
            } else {
                i11 = eaVar.v;
            }
            eaVar.j(i11, u9Var, false);
            Layout layout = u9Var.f21671b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - u9Var.f21670a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = eaVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + eaVar.f20220b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + u9Var.f21672c);
                z9 z9Var = eaVar.W;
                if (z9Var instanceof org.telegram.ui.t2) {
                    lineLeft = m10[0];
                    lineRight = ((View) z9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = m10[0] + eaVar.f20218a + u9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + eaVar.f20218a + u9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (eaVar.I != f10) {
                    eaVar.I = f10;
                    eaVar.J = (f10 - eaVar.H) / 200.0f;
                }
                float f11 = i10;
                if (eaVar.L != f11) {
                    eaVar.L = f11;
                    eaVar.M = (f11 - eaVar.K) / 100.0f;
                }
                if (eaVar.G == null) {
                    eaVar.G = new Magnifier(eaVar.C);
                    eaVar.H = eaVar.I;
                    eaVar.K = eaVar.L;
                }
                float f12 = eaVar.H;
                float f13 = eaVar.I;
                if (f12 != f13) {
                    eaVar.H = (eaVar.J * 16.0f) + f12;
                }
                float f14 = eaVar.J;
                if (f14 > 0.0f && eaVar.H > f13) {
                    eaVar.H = f13;
                } else if (f14 < 0.0f && eaVar.H < f13) {
                    eaVar.H = f13;
                }
                float f15 = eaVar.K;
                float f16 = eaVar.L;
                if (f15 != f16) {
                    eaVar.K = (eaVar.M * 16.0f) + f15;
                }
                float f17 = eaVar.M;
                if (f17 > 0.0f && eaVar.K > f16) {
                    eaVar.K = f16;
                } else if (f17 < 0.0f && eaVar.K < f16) {
                    eaVar.K = f16;
                }
                eaVar.G.show(eaVar.K, (lineBottom * 1.5f) + eaVar.H + AndroidUtilities.dp(8.0f));
                eaVar.G.update();
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
        if (messageObject == null || this.f20255w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, z9 z9Var) {
        int i12;
        int i13;
        if (this.f20233j) {
            this.f20254u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f20254u = i13;
                this.f20233j = false;
            }
            this.f20257y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f20254u) > i11) {
            this.v = i12;
            this.f20254u = i11;
            this.f20233j = true;
        }
        this.f20257y = true;
    }

    public final int[] C(int i10) {
        u9 u9Var = this.f20219a0;
        j(i10, u9Var, false);
        Layout layout = u9Var.f21671b;
        int i11 = i10 - u9Var.f21670a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + u9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + u9Var.f21672c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        da daVar;
        if (y() && (daVar = this.C) != null) {
            this.Q = true;
            daVar.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(z9 z9Var, z9 z9Var2);

    public final boolean N(MotionEvent motionEvent) {
        ea eaVar;
        int action = motionEvent.getAction();
        l9 l9Var = this.f20229g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f20252t - ((int) motionEvent.getY());
                    int x10 = this.f20250s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f20239m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        this.f20258z = false;
                    }
                    return this.f20258z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            this.f20258z = false;
            return false;
        }
        this.f20250s = (int) motionEvent.getX();
        this.f20252t = (int) motionEvent.getY();
        this.f20258z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f20250s, this.f20252t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f20250s;
            int i13 = this.f20252t;
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
            eaVar = this;
            int l4 = eaVar.l(i16, i13, this.f20222c, this.d, this.X, true);
            CharSequence t10 = t(eaVar.X, true);
            if (l4 >= t10.length()) {
                u9 u9Var = eaVar.f20219a0;
                j(l4, u9Var, true);
                Layout layout = u9Var.f21671b;
                if (layout == null) {
                    eaVar.f20258z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - eaVar.f20222c;
                if (f7 < u9Var.f21671b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > u9Var.f21671b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(l9Var);
                AndroidUtilities.runOnUIThread(l9Var, eaVar.f20237l);
                eaVar.f20258z = true;
            }
        } else {
            eaVar = this;
        }
        return eaVar.f20258z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(ai.s3 s3Var) {
        this.D = s3Var;
    }

    public final void S() {
        this.f20234j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof yl0) {
            this.E = (yl0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ea.U():void");
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
        g gVar = this.f20249r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f20254u && i10 != this.v) {
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
        this.f20254u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f20255w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f20229g0);
        this.f20258z = false;
        da daVar = this.C;
        if (daVar != null) {
            daVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.i0 i0Var = this.D;
        if (i0Var != null) {
            i0Var.a(false);
        }
        this.f20250s = -1;
        this.f20252t = -1;
        this.f20222c = -1;
        this.d = -1;
        this.f20226f = 0.0f;
        this.f20228g = 0.0f;
        this.f20231i = false;
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
            w7.i0 i0Var = this.D;
            if (i0Var != null) {
                i0Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        uq uqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        y9 y9Var = this.f20253t0;
        y9Var.reset();
        layout.getSelectionPath(i11, i12, y9Var);
        if (y9Var.f21913a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (y9Var.f21913a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = y9Var.f21915c;
            uqVar = this.f20246q;
            f12 = this.f20240n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) y9Var.f21914b.get(i14);
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
            uqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                uqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ea.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, u9 u9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, z9 z9Var, boolean z10);

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

    public final da o(Context context) {
        if (this.C == null) {
            this.C = new da(this, context);
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
        return this.f20230h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f20254u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(z9 z9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f20230h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f20251s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = this.f20241n0;
        if (n1Var != null) {
            n1Var.d(true);
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
        z9 z9Var = this.W;
        if (z9Var != null) {
            z9Var.invalidate();
        }
        da daVar = this.C;
        if (daVar != null) {
            daVar.invalidate();
        }
    }

    public final boolean y() {
        if (this.f20254u >= 0 && this.v >= 0) {
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
