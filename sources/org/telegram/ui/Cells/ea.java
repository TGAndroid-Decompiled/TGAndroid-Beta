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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.vq;
public abstract class ea {
    public final ActionMode.Callback A;
    public final Rect B;
    public da C;
    public w7.h0 D;
    public ml0 E;
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
    public int f19977a;
    public final u9 f19978a0;
    public int f19979b;
    public int f19980b0;
    public int f19981c;
    public final OvershootInterpolator f19982c0;
    public int d;
    public boolean f19983d0;
    public boolean e;
    public int f19984e0;
    public float f19985f;
    public final l7 f19986f0;
    public float f19987g;
    public final l9 f19988g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.d6 f19989h0;
    public boolean f19990i;
    public boolean f19991i0;
    public boolean f19992j;
    public boolean f19993j0;
    public boolean f19994k;
    public boolean f19995k0;
    public final int f19996l;
    public org.telegram.ui.t f19997l0;
    public final int f19998m;
    public ValueAnimator m0;
    public final float f19999n;
    public org.telegram.ui.ActionBar.n1 f20000n0;
    public final Paint f20001o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f20002o0;
    public final Paint f20003p;
    public TextView f20004p0;
    public final vq f20005q;
    public Rect f20006q0;
    public final Path f20007r;
    public final g f20008r0;
    public int f20009s;
    public final m9 f20010s0;
    public int f20011t;
    public final y9 f20012t0;
    public int f20013u;
    public int v;
    public int f20014w;
    public int f20015x;
    public boolean f20016y;
    public boolean f20017z;

    public ea() {
        new Path().f21568a = 0.0f;
        Paint paint = new Paint(1);
        this.f20001o = paint;
        this.f20003p = new Paint(1);
        vq vqVar = new vq();
        this.f20005q = vqVar;
        this.f20007r = new Path();
        new Path().f21456a = vqVar;
        this.f20013u = -1;
        this.v = -1;
        o9 o9Var = new o9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new p9(this, o9Var) : o9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f19978a0 = new Object();
        this.f19982c0 = new OvershootInterpolator();
        this.f19983d0 = false;
        this.f19986f0 = new l7(this, 2);
        this.f19988g0 = new l9(this);
        this.f19991i0 = true;
        this.f19997l0 = null;
        this.f20008r0 = new g(this, 7);
        this.f20010s0 = new m9(this);
        ?? path = new Path();
        path.f21644a = 0.0f;
        path.f21645b = new ArrayList(1);
        path.f21646c = 0;
        this.f20012t0 = path;
        this.f19996l = ViewConfiguration.getLongPressTimeout();
        this.f19998m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f19999n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        vqVar.d = 1.0f;
    }

    public static void a(ea eaVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        u9 u9Var = eaVar.f19978a0;
        if (Build.VERSION.SDK_INT >= 28 && eaVar.W != null && !eaVar.f19994k && eaVar.f19990i && eaVar.C != null) {
            if (eaVar.f19992j) {
                i11 = eaVar.f20013u;
            } else {
                i11 = eaVar.v;
            }
            eaVar.j(i11, u9Var, false);
            Layout layout = u9Var.f21428b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - u9Var.f21427a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = eaVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + eaVar.f19979b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + u9Var.f21429c);
                z9 z9Var = eaVar.W;
                if (z9Var instanceof org.telegram.ui.u2) {
                    lineLeft = m10[0];
                    lineRight = ((View) z9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = m10[0] + eaVar.f19977a + u9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + eaVar.f19977a + u9Var.d);
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
        if (messageObject == null || this.f20014w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, z9 z9Var) {
        int i12;
        int i13;
        if (this.f19992j) {
            this.f20013u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f20013u = i13;
                this.f19992j = false;
            }
            this.f20016y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f20013u) > i11) {
            this.v = i12;
            this.f20013u = i11;
            this.f19992j = true;
        }
        this.f20016y = true;
    }

    public final int[] C(int i10) {
        u9 u9Var = this.f19978a0;
        j(i10, u9Var, false);
        Layout layout = u9Var.f21428b;
        int i11 = i10 - u9Var.f21427a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + u9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + u9Var.f21429c);
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
        l9 l9Var = this.f19988g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f20011t - ((int) motionEvent.getY());
                    int x10 = this.f20009s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f19998m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        this.f20017z = false;
                    }
                    return this.f20017z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            this.f20017z = false;
            return false;
        }
        this.f20009s = (int) motionEvent.getX();
        this.f20011t = (int) motionEvent.getY();
        this.f20017z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f20009s, this.f20011t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f20009s;
            int i13 = this.f20011t;
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
            int l4 = eaVar.l(i16, i13, this.f19981c, this.d, this.X, true);
            CharSequence t10 = t(eaVar.X, true);
            if (l4 >= t10.length()) {
                u9 u9Var = eaVar.f19978a0;
                j(l4, u9Var, true);
                Layout layout = u9Var.f21428b;
                if (layout == null) {
                    eaVar.f20017z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - eaVar.f19981c;
                if (f7 < u9Var.f21428b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > u9Var.f21428b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(l9Var);
                AndroidUtilities.runOnUIThread(l9Var, eaVar.f19996l);
                eaVar.f20017z = true;
            }
        } else {
            eaVar = this;
        }
        return eaVar.f20017z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(ai.s3 s3Var) {
        this.D = s3Var;
    }

    public final void S() {
        this.f19993j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof ml0) {
            this.E = (ml0) viewGroup;
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
        g gVar = this.f20008r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f20013u && i10 != this.v) {
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
        this.f20013u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f20014w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f19988g0);
        this.f20017z = false;
        da daVar = this.C;
        if (daVar != null) {
            daVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(false);
        }
        this.f20009s = -1;
        this.f20011t = -1;
        this.f19981c = -1;
        this.d = -1;
        this.f19985f = 0.0f;
        this.f19987g = 0.0f;
        this.f19990i = false;
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
            w7.h0 h0Var = this.D;
            if (h0Var != null) {
                h0Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        vq vqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        y9 y9Var = this.f20012t0;
        y9Var.reset();
        layout.getSelectionPath(i11, i12, y9Var);
        if (y9Var.f21644a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (y9Var.f21644a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = y9Var.f21646c;
            vqVar = this.f20005q;
            f12 = this.f19999n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) y9Var.f21645b.get(i14);
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
            vqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                vqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
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

    public org.telegram.ui.ActionBar.d6 r() {
        return this.f19989h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f20013u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(z9 z9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.f19989h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f20010s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = this.f20000n0;
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
        if (this.f20013u >= 0 && this.v >= 0) {
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
