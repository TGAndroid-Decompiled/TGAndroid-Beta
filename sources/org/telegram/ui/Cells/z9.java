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
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.uq;
public abstract class z9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public y9 C;
    public k7.y5 D;
    public sl0 E;
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
    public u9 W;
    public u9 X;
    public ActionMode Y;
    public boolean Z;
    public int f24502a;
    public final p9 f24503a0;
    public int f24504b;
    public int f24505b0;
    public int f24506c;
    public final OvershootInterpolator f24507c0;
    public int d;
    public boolean f24508d0;
    public boolean f24509e;
    public int f24510e0;
    public float f24511f;
    public final m2.b f24512f0;
    public float f24513g;
    public final g9 f24514g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.g6 f24515h0;
    public boolean f24516i;
    public boolean f24517i0;
    public boolean f24518j;
    public boolean f24519j0;
    public boolean f24520k;
    public boolean f24521k0;
    public final int f24522l;
    public org.telegram.ui.v f24523l0;
    public final int f24524m;
    public ValueAnimator m0;
    public final float f24525n;
    public org.telegram.ui.ActionBar.p1 f24526n0;
    public final Paint f24527o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f24528o0;
    public final Paint f24529p;
    public TextView f24530p0;
    public final uq f24531q;
    public Rect f24532q0;
    public final Path f24533r;
    public final g f24534r0;
    public int f24535s;
    public final h9 f24536s0;
    public int f24537t;
    public final t9 f24538t0;
    public int f24539u;
    public int v;
    public int f24540w;
    public int f24541x;
    public boolean f24542y;
    public boolean f24543z;

    public z9() {
        new Path().f23602a = 0.0f;
        Paint paint = new Paint(1);
        this.f24527o = paint;
        this.f24529p = new Paint(1);
        uq uqVar = new uq();
        this.f24531q = uqVar;
        this.f24533r = new Path();
        new Path().f23382a = uqVar;
        this.f24539u = -1;
        this.v = -1;
        j9 j9Var = new j9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new k9(this, j9Var) : j9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f24503a0 = new Object();
        this.f24507c0 = new OvershootInterpolator();
        this.f24508d0 = false;
        this.f24512f0 = new m2.b(this, 11);
        this.f24514g0 = new g9(this);
        this.f24517i0 = true;
        this.f24523l0 = null;
        this.f24534r0 = new g(this, 7);
        this.f24536s0 = new h9(this);
        ?? path = new Path();
        path.f24182a = 0.0f;
        path.f24183b = new ArrayList(1);
        path.f24184c = 0;
        this.f24538t0 = path;
        this.f24522l = ViewConfiguration.getLongPressTimeout();
        this.f24524m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f24525n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        uqVar.d = 1.0f;
    }

    public static void a(z9 z9Var, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        p9 p9Var = z9Var.f24503a0;
        if (Build.VERSION.SDK_INT >= 28 && z9Var.W != null && !z9Var.f24520k && z9Var.f24516i && z9Var.C != null) {
            if (z9Var.f24518j) {
                i11 = z9Var.f24539u;
            } else {
                i11 = z9Var.v;
            }
            z9Var.j(i11, p9Var, false);
            Layout layout = p9Var.f23341b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - p9Var.f23340a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m9 = z9Var.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + z9Var.f24504b) + m9[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + p9Var.f23342c);
                u9 u9Var = z9Var.W;
                if (u9Var instanceof org.telegram.ui.w2) {
                    lineLeft = m9[0];
                    lineRight = ((View) u9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = m9[0] + z9Var.f24502a + p9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m9[0] + z9Var.f24502a + p9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f11 = lineTop;
                if (z9Var.I != f11) {
                    z9Var.I = f11;
                    z9Var.J = (f11 - z9Var.H) / 200.0f;
                }
                float f12 = i10;
                if (z9Var.L != f12) {
                    z9Var.L = f12;
                    z9Var.M = (f12 - z9Var.K) / 100.0f;
                }
                if (z9Var.G == null) {
                    z9Var.G = new Magnifier(z9Var.C);
                    z9Var.H = z9Var.I;
                    z9Var.K = z9Var.L;
                }
                float f13 = z9Var.H;
                float f14 = z9Var.I;
                if (f13 != f14) {
                    z9Var.H = (z9Var.J * 16.0f) + f13;
                }
                float f15 = z9Var.J;
                if (f15 > 0.0f && z9Var.H > f14) {
                    z9Var.H = f14;
                } else if (f15 < 0.0f && z9Var.H < f14) {
                    z9Var.H = f14;
                }
                float f16 = z9Var.K;
                float f17 = z9Var.L;
                if (f16 != f17) {
                    z9Var.K = (z9Var.M * 16.0f) + f16;
                }
                float f18 = z9Var.M;
                if (f18 > 0.0f && z9Var.K > f17) {
                    z9Var.K = f17;
                } else if (f18 < 0.0f && z9Var.K < f17) {
                    z9Var.K = f17;
                }
                z9Var.G.show(z9Var.K, (lineBottom * 1.5f) + z9Var.H + AndroidUtilities.dp(8.0f));
                z9Var.G.update();
            }
        }
    }

    public static boolean z(char c3) {
        if (!Character.isLetter(c3) && !Character.isDigit(c3) && c3 != '_') {
            return false;
        }
        return true;
    }

    public boolean A(MessageObject messageObject) {
        if (messageObject == null || this.f24540w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z4, float f10, float f11, u9 u9Var) {
        int i12;
        int i13;
        if (this.f24518j) {
            this.f24539u = i11;
            if (!z4 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f24539u = i13;
                this.f24518j = false;
            }
            this.f24542y = true;
            return;
        }
        this.v = i11;
        if (!z4 && (i12 = this.f24539u) > i11) {
            this.v = i12;
            this.f24539u = i11;
            this.f24518j = true;
        }
        this.f24542y = true;
    }

    public final int[] C(int i10) {
        p9 p9Var = this.f24503a0;
        j(i10, p9Var, false);
        Layout layout = p9Var.f23341b;
        int i11 = i10 - p9Var.f23340a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + p9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + p9Var.f23342c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        y9 y9Var;
        if (y() && (y9Var = this.C) != null) {
            this.Q = true;
            y9Var.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(u9 u9Var, u9 u9Var2);

    public final boolean N(MotionEvent motionEvent) {
        z9 z9Var;
        int action = motionEvent.getAction();
        g9 g9Var = this.f24514g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f24537t - ((int) motionEvent.getY());
                    int x10 = this.f24535s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y10 * y10);
                    int i11 = this.f24524m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(g9Var);
                        this.f24543z = false;
                    }
                    return this.f24543z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(g9Var);
            this.f24543z = false;
            return false;
        }
        this.f24535s = (int) motionEvent.getX();
        this.f24537t = (int) motionEvent.getY();
        this.f24543z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f24535s, this.f24537t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f24535s;
            int i13 = this.f24537t;
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
            z9Var = this;
            int l10 = z9Var.l(i16, i13, this.f24506c, this.d, this.X, true);
            CharSequence t6 = t(z9Var.X, true);
            if (l10 >= t6.length()) {
                p9 p9Var = z9Var.f24503a0;
                j(l10, p9Var, true);
                Layout layout = p9Var.f23341b;
                if (layout == null) {
                    z9Var.f24543z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - z9Var.f24506c;
                if (f10 < p9Var.f23341b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > p9Var.f23341b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(g9Var);
                AndroidUtilities.runOnUIThread(g9Var, z9Var.f24522l);
                z9Var.f24543z = true;
            }
        } else {
            z9Var = this;
        }
        return z9Var.f24543z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(oh.i2 i2Var) {
        this.D = i2Var;
    }

    public final void S() {
        this.f24519j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof sl0) {
            this.E = (sl0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.U():void");
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
        g gVar = this.f24534r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f24539u && i10 != this.v) {
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

    public void f(boolean z4) {
        F(z4);
        this.f24539u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f24540w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f24514g0);
        this.f24543z = false;
        y9 y9Var = this.C;
        if (y9Var != null) {
            y9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        k7.y5 y5Var = this.D;
        if (y5Var != null) {
            y5Var.a(false);
        }
        this.f24535s = -1;
        this.f24537t = -1;
        this.f24506c = -1;
        this.d = -1;
        this.f24511f = 0.0f;
        this.f24513g = 0.0f;
        this.f24516i = false;
    }

    public final void g() {
        if (y()) {
            if (!D()) {
                CharSequence s6 = s();
                if (s6 != null) {
                    AndroidUtilities.addToClipboard(s6);
                } else {
                    return;
                }
            }
            v();
            f(true);
            k7.y5 y5Var = this.D;
            if (y5Var != null) {
                y5Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z4, boolean z10, float f10) {
        float f11;
        float f12;
        int i13;
        uq uqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        t9 t9Var = this.f24538t0;
        t9Var.reset();
        layout.getSelectionPath(i11, i12, t9Var);
        if (t9Var.f24182a < layout.getLineBottom(i10)) {
            f12 = layout.getLineTop(i10);
            f11 = (layout.getLineBottom(i10) - lineTop) / (t9Var.f24182a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = t9Var.f24184c;
            uqVar = this.f24531q;
            f13 = this.f24525n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) t9Var.f24183b.get(i14);
            float max = Math.max(f10, rectF.left);
            if (z4) {
                f14 = f13 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            float f16 = (int) (max - f14);
            float w10 = (int) e2.c.w(rectF.top, f12, f11, f12);
            float max2 = Math.max(f10, rectF.right);
            if (z10) {
                f15 = f13 / 2.0f;
            } else {
                f15 = 0.0f;
            }
            rectF.set(f16, w10, (int) (max2 + f15), (int) e2.c.w(rectF.bottom, f12, f11, f12));
            uqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z10) {
            try {
                uqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f13 / 2.0f), layout.getLineTop(i10), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, p9 p9Var, boolean z4);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, u9 u9Var, boolean z4);

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

    public final y9 o(Context context) {
        if (this.C == null) {
            this.C = new y9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.g6 r() {
        return this.f24515h0;
    }

    public CharSequence s() {
        CharSequence t6 = t(this.W, false);
        if (t6 != null) {
            return t6.subSequence(this.f24539u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(u9 u9Var, boolean z4);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.f24515h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f24536s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.p1 p1Var = this.f24526n0;
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
        u9 u9Var = this.W;
        if (u9Var != null) {
            u9Var.invalidate();
        }
        y9 y9Var = this.C;
        if (y9Var != null) {
            y9Var.invalidate();
        }
    }

    public final boolean y() {
        if (this.f24539u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public void E() {
    }

    public void F(boolean z4) {
    }

    public void G() {
    }

    public void I() {
    }

    public void O() {
    }

    public void P() {
    }

    public void L(float f10, float f11) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
