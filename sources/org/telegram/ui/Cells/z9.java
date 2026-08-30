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
import org.telegram.ui.Components.sq;
public abstract class z9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public y9 C;
    public k7.x5 D;
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
    public int f22665a;
    public final p9 f22666a0;
    public int f22667b;
    public int f22668b0;
    public int f22669c;
    public final OvershootInterpolator f22670c0;
    public int d;
    public boolean f22671d0;
    public boolean e;
    public int f22672e0;
    public float f22673f;
    public final m2.b f22674f0;
    public float f22675g;
    public final g9 f22676g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f22677h0;
    public boolean f22678i;
    public boolean f22679i0;
    public boolean f22680j;
    public boolean f22681j0;
    public boolean f22682k;
    public boolean f22683k0;
    public final int f22684l;
    public org.telegram.ui.v f22685l0;
    public final int f22686m;
    public ValueAnimator m0;
    public final float f22687n;
    public org.telegram.ui.ActionBar.p1 f22688n0;
    public final Paint f22689o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f22690o0;
    public final Paint f22691p;
    public TextView f22692p0;
    public final sq f22693q;
    public Rect f22694q0;
    public final Path f22695r;
    public final g f22696r0;
    public int f22697s;
    public final h9 f22698s0;
    public int f22699t;
    public final t9 f22700t0;
    public int f22701u;
    public int v;
    public int f22702w;
    public int f22703x;
    public boolean f22704y;
    public boolean f22705z;

    public z9() {
        new Path().f21806a = 0.0f;
        Paint paint = new Paint(1);
        this.f22689o = paint;
        this.f22691p = new Paint(1);
        sq sqVar = new sq();
        this.f22693q = sqVar;
        this.f22695r = new Path();
        new Path().f21590a = sqVar;
        this.f22701u = -1;
        this.v = -1;
        j9 j9Var = new j9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new k9(this, j9Var) : j9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f22666a0 = new Object();
        this.f22670c0 = new OvershootInterpolator();
        this.f22671d0 = false;
        this.f22674f0 = new m2.b(this, 11);
        this.f22676g0 = new g9(this);
        this.f22679i0 = true;
        this.f22685l0 = null;
        this.f22696r0 = new g(this, 7);
        this.f22698s0 = new h9(this);
        ?? path = new Path();
        path.f22375a = 0.0f;
        path.f22376b = new ArrayList(1);
        path.f22377c = 0;
        this.f22700t0 = path;
        this.f22684l = ViewConfiguration.getLongPressTimeout();
        this.f22686m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f22687n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        sqVar.d = 1.0f;
    }

    public static void a(z9 z9Var, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        p9 p9Var = z9Var.f22666a0;
        if (Build.VERSION.SDK_INT >= 28 && z9Var.W != null && !z9Var.f22682k && z9Var.f22678i && z9Var.C != null) {
            if (z9Var.f22680j) {
                i11 = z9Var.f22701u;
            } else {
                i11 = z9Var.v;
            }
            z9Var.j(i11, p9Var, false);
            Layout layout = p9Var.f21554b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - p9Var.f21553a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m9 = z9Var.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + z9Var.f22667b) + m9[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + p9Var.f21555c);
                u9 u9Var = z9Var.W;
                if (u9Var instanceof org.telegram.ui.w2) {
                    lineLeft = m9[0];
                    lineRight = ((View) u9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = m9[0] + z9Var.f22665a + p9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m9[0] + z9Var.f22665a + p9Var.d);
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
        if (messageObject == null || this.f22702w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z4, float f10, float f11, u9 u9Var) {
        int i12;
        int i13;
        if (this.f22680j) {
            this.f22701u = i11;
            if (!z4 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f22701u = i13;
                this.f22680j = false;
            }
            this.f22704y = true;
            return;
        }
        this.v = i11;
        if (!z4 && (i12 = this.f22701u) > i11) {
            this.v = i12;
            this.f22701u = i11;
            this.f22680j = true;
        }
        this.f22704y = true;
    }

    public final int[] C(int i10) {
        p9 p9Var = this.f22666a0;
        j(i10, p9Var, false);
        Layout layout = p9Var.f21554b;
        int i11 = i10 - p9Var.f21553a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + p9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + p9Var.f21555c);
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
        g9 g9Var = this.f22676g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f22699t - ((int) motionEvent.getY());
                    int x10 = this.f22697s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y10 * y10);
                    int i11 = this.f22686m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(g9Var);
                        this.f22705z = false;
                    }
                    return this.f22705z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(g9Var);
            this.f22705z = false;
            return false;
        }
        this.f22697s = (int) motionEvent.getX();
        this.f22699t = (int) motionEvent.getY();
        this.f22705z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f22697s, this.f22699t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f22697s;
            int i13 = this.f22699t;
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
            int l10 = z9Var.l(i16, i13, this.f22669c, this.d, this.X, true);
            CharSequence t6 = t(z9Var.X, true);
            if (l10 >= t6.length()) {
                p9 p9Var = z9Var.f22666a0;
                j(l10, p9Var, true);
                Layout layout = p9Var.f21554b;
                if (layout == null) {
                    z9Var.f22705z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - z9Var.f22669c;
                if (f10 < p9Var.f21554b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > p9Var.f21554b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(g9Var);
                AndroidUtilities.runOnUIThread(g9Var, z9Var.f22684l);
                z9Var.f22705z = true;
            }
        } else {
            z9Var = this;
        }
        return z9Var.f22705z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(nh.h2 h2Var) {
        this.D = h2Var;
    }

    public final void S() {
        this.f22681j0 = true;
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
        g gVar = this.f22696r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f22701u && i10 != this.v) {
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
        this.f22701u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f22702w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f22676g0);
        this.f22705z = false;
        y9 y9Var = this.C;
        if (y9Var != null) {
            y9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        k7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(false);
        }
        this.f22697s = -1;
        this.f22699t = -1;
        this.f22669c = -1;
        this.d = -1;
        this.f22673f = 0.0f;
        this.f22675g = 0.0f;
        this.f22678i = false;
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
            k7.x5 x5Var = this.D;
            if (x5Var != null) {
                x5Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z4, boolean z10, float f10) {
        float f11;
        float f12;
        int i13;
        sq sqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        t9 t9Var = this.f22700t0;
        t9Var.reset();
        layout.getSelectionPath(i11, i12, t9Var);
        if (t9Var.f22375a < layout.getLineBottom(i10)) {
            f12 = layout.getLineTop(i10);
            f11 = (layout.getLineBottom(i10) - lineTop) / (t9Var.f22375a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = t9Var.f22377c;
            sqVar = this.f22693q;
            f13 = this.f22687n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) t9Var.f22376b.get(i14);
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
            sqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z10) {
            try {
                sqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f13 / 2.0f), layout.getLineTop(i10), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
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

    public org.telegram.ui.ActionBar.f6 r() {
        return this.f22677h0;
    }

    public CharSequence s() {
        CharSequence t6 = t(this.W, false);
        if (t6 != null) {
            return t6.subSequence(this.f22701u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(u9 u9Var, boolean z4);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f22677h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f22698s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.p1 p1Var = this.f22688n0;
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
        if (this.f22701u >= 0 && this.v >= 0) {
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
