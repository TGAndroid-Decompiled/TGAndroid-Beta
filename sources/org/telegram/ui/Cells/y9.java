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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rq;
public abstract class y9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public x9 C;
    public k7.x5 D;
    public rl0 E;
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
    public t9 W;
    public t9 X;
    public ActionMode Y;
    public boolean Z;
    public int f22601a;
    public final o9 f22602a0;
    public int f22603b;
    public int f22604b0;
    public int f22605c;
    public final OvershootInterpolator f22606c0;
    public int d;
    public boolean f22607d0;
    public boolean e;
    public int f22608e0;
    public float f22609f;
    public final m2.b f22610f0;
    public float f22611g;
    public final f9 f22612g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f22613h0;
    public boolean f22614i;
    public boolean f22615i0;
    public boolean f22616j;
    public boolean f22617j0;
    public boolean f22618k;
    public boolean f22619k0;
    public final int f22620l;
    public org.telegram.ui.v f22621l0;
    public final int f22622m;
    public ValueAnimator m0;
    public final float f22623n;
    public org.telegram.ui.ActionBar.p1 f22624n0;
    public final Paint f22625o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f22626o0;
    public final Paint f22627p;
    public TextView f22628p0;
    public final rq f22629q;
    public Rect f22630q0;
    public final Path f22631r;
    public final g f22632r0;
    public int f22633s;
    public final g9 f22634s0;
    public int f22635t;
    public final s9 f22636t0;
    public int f22637u;
    public int v;
    public int f22638w;
    public int f22639x;
    public boolean f22640y;
    public boolean f22641z;

    public y9() {
        new Path().f21739a = 0.0f;
        Paint paint = new Paint(1);
        this.f22625o = paint;
        this.f22627p = new Paint(1);
        rq rqVar = new rq();
        this.f22629q = rqVar;
        this.f22631r = new Path();
        new Path().f21522a = rqVar;
        this.f22637u = -1;
        this.v = -1;
        i9 i9Var = new i9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new j9(this, i9Var) : i9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f22602a0 = new Object();
        this.f22606c0 = new OvershootInterpolator();
        this.f22607d0 = false;
        this.f22610f0 = new m2.b(this, 11);
        this.f22612g0 = new f9(this);
        this.f22615i0 = true;
        this.f22621l0 = null;
        this.f22632r0 = new g(this, 7);
        this.f22634s0 = new g9(this);
        ?? path = new Path();
        path.f22312a = 0.0f;
        path.f22313b = new ArrayList(1);
        path.f22314c = 0;
        this.f22636t0 = path;
        this.f22620l = ViewConfiguration.getLongPressTimeout();
        this.f22622m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f22623n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        rqVar.d = 1.0f;
    }

    public static void a(y9 y9Var, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        o9 o9Var = y9Var.f22602a0;
        if (Build.VERSION.SDK_INT >= 28 && y9Var.W != null && !y9Var.f22618k && y9Var.f22614i && y9Var.C != null) {
            if (y9Var.f22616j) {
                i11 = y9Var.f22637u;
            } else {
                i11 = y9Var.v;
            }
            y9Var.j(i11, o9Var, false);
            Layout layout = o9Var.f21488b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - o9Var.f21487a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m9 = y9Var.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + y9Var.f22603b) + m9[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + o9Var.f21489c);
                t9 t9Var = y9Var.W;
                if (t9Var instanceof org.telegram.ui.y2) {
                    lineLeft = m9[0];
                    lineRight = ((View) t9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = m9[0] + y9Var.f22601a + o9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m9[0] + y9Var.f22601a + o9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f11 = lineTop;
                if (y9Var.I != f11) {
                    y9Var.I = f11;
                    y9Var.J = (f11 - y9Var.H) / 200.0f;
                }
                float f12 = i10;
                if (y9Var.L != f12) {
                    y9Var.L = f12;
                    y9Var.M = (f12 - y9Var.K) / 100.0f;
                }
                if (y9Var.G == null) {
                    y9Var.G = new Magnifier(y9Var.C);
                    y9Var.H = y9Var.I;
                    y9Var.K = y9Var.L;
                }
                float f13 = y9Var.H;
                float f14 = y9Var.I;
                if (f13 != f14) {
                    y9Var.H = (y9Var.J * 16.0f) + f13;
                }
                float f15 = y9Var.J;
                if (f15 > 0.0f && y9Var.H > f14) {
                    y9Var.H = f14;
                } else if (f15 < 0.0f && y9Var.H < f14) {
                    y9Var.H = f14;
                }
                float f16 = y9Var.K;
                float f17 = y9Var.L;
                if (f16 != f17) {
                    y9Var.K = (y9Var.M * 16.0f) + f16;
                }
                float f18 = y9Var.M;
                if (f18 > 0.0f && y9Var.K > f17) {
                    y9Var.K = f17;
                } else if (f18 < 0.0f && y9Var.K < f17) {
                    y9Var.K = f17;
                }
                y9Var.G.show(y9Var.K, (lineBottom * 1.5f) + y9Var.H + AndroidUtilities.dp(8.0f));
                y9Var.G.update();
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
        if (messageObject == null || this.f22638w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z4, float f10, float f11, t9 t9Var) {
        int i12;
        int i13;
        if (this.f22616j) {
            this.f22637u = i11;
            if (!z4 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f22637u = i13;
                this.f22616j = false;
            }
            this.f22640y = true;
            return;
        }
        this.v = i11;
        if (!z4 && (i12 = this.f22637u) > i11) {
            this.v = i12;
            this.f22637u = i11;
            this.f22616j = true;
        }
        this.f22640y = true;
    }

    public final int[] C(int i10) {
        o9 o9Var = this.f22602a0;
        j(i10, o9Var, false);
        Layout layout = o9Var.f21488b;
        int i11 = i10 - o9Var.f21487a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + o9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + o9Var.f21489c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        x9 x9Var;
        if (y() && (x9Var = this.C) != null) {
            this.Q = true;
            x9Var.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(t9 t9Var, t9 t9Var2);

    public final boolean N(MotionEvent motionEvent) {
        y9 y9Var;
        int action = motionEvent.getAction();
        f9 f9Var = this.f22612g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f22635t - ((int) motionEvent.getY());
                    int x10 = this.f22633s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y10 * y10);
                    int i11 = this.f22622m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(f9Var);
                        this.f22641z = false;
                    }
                    return this.f22641z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(f9Var);
            this.f22641z = false;
            return false;
        }
        this.f22633s = (int) motionEvent.getX();
        this.f22635t = (int) motionEvent.getY();
        this.f22641z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f22633s, this.f22635t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f22633s;
            int i13 = this.f22635t;
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
            y9Var = this;
            int l10 = y9Var.l(i16, i13, this.f22605c, this.d, this.X, true);
            CharSequence t6 = t(y9Var.X, true);
            if (l10 >= t6.length()) {
                o9 o9Var = y9Var.f22602a0;
                j(l10, o9Var, true);
                Layout layout = o9Var.f21488b;
                if (layout == null) {
                    y9Var.f22641z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - y9Var.f22605c;
                if (f10 < o9Var.f21488b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > o9Var.f21488b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(f9Var);
                AndroidUtilities.runOnUIThread(f9Var, y9Var.f22620l);
                y9Var.f22641z = true;
            }
        } else {
            y9Var = this;
        }
        return y9Var.f22641z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(nh.h2 h2Var) {
        this.D = h2Var;
    }

    public final void S() {
        this.f22617j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof rl0) {
            this.E = (rl0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y9.U():void");
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
        g gVar = this.f22632r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f22637u && i10 != this.v) {
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
        this.f22637u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f22638w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f22612g0);
        this.f22641z = false;
        x9 x9Var = this.C;
        if (x9Var != null) {
            x9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        k7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(false);
        }
        this.f22633s = -1;
        this.f22635t = -1;
        this.f22605c = -1;
        this.d = -1;
        this.f22609f = 0.0f;
        this.f22611g = 0.0f;
        this.f22614i = false;
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
        rq rqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        s9 s9Var = this.f22636t0;
        s9Var.reset();
        layout.getSelectionPath(i11, i12, s9Var);
        if (s9Var.f22312a < layout.getLineBottom(i10)) {
            f12 = layout.getLineTop(i10);
            f11 = (layout.getLineBottom(i10) - lineTop) / (s9Var.f22312a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = s9Var.f22314c;
            rqVar = this.f22629q;
            f13 = this.f22623n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) s9Var.f22313b.get(i14);
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
            rqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z10) {
            try {
                rqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f13 / 2.0f), layout.getLineTop(i10), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y9.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, o9 o9Var, boolean z4);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, t9 t9Var, boolean z4);

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

    public final x9 o(Context context) {
        if (this.C == null) {
            this.C = new x9(this, context);
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
        return this.f22613h0;
    }

    public CharSequence s() {
        CharSequence t6 = t(this.W, false);
        if (t6 != null) {
            return t6.subSequence(this.f22637u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(t9 t9Var, boolean z4);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f22613h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f22634s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.p1 p1Var = this.f22624n0;
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
        t9 t9Var = this.W;
        if (t9Var != null) {
            t9Var.invalidate();
        }
        x9 x9Var = this.C;
        if (x9Var != null) {
            x9Var.invalidate();
        }
    }

    public final boolean y() {
        if (this.f22637u >= 0 && this.v >= 0) {
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
