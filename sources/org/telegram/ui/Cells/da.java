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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.tq;
public abstract class da {
    public final ActionMode.Callback A;
    public final Rect B;
    public ca C;
    public w7.h0 D;
    public ll0 E;
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
    public y9 W;
    public y9 X;
    public ActionMode Y;
    public boolean Z;
    public int f21762a;
    public final t9 f21763a0;
    public int f21764b;
    public int f21765b0;
    public int f21766c;
    public final OvershootInterpolator f21767c0;
    public int d;
    public boolean f21768d0;
    public boolean f21769e;
    public int f21770e0;
    public float f21771f;
    public final l7 f21772f0;
    public float f21773g;
    public final k9 f21774g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f21775h0;
    public boolean f21776i;
    public boolean f21777i0;
    public boolean f21778j;
    public boolean f21779j0;
    public boolean f21780k;
    public boolean f21781k0;
    public final int f21782l;
    public org.telegram.ui.t f21783l0;
    public final int f21784m;
    public ValueAnimator m0;
    public final float f21785n;
    public org.telegram.ui.ActionBar.n1 f21786n0;
    public final Paint f21787o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f21788o0;
    public final Paint f21789p;
    public TextView f21790p0;
    public final tq f21791q;
    public Rect f21792q0;
    public final Path f21793r;
    public final g f21794r0;
    public int f21795s;
    public final l9 f21796s0;
    public int f21797t;
    public final x9 f21798t0;
    public int f21799u;
    public int v;
    public int f21800w;
    public int f21801x;
    public boolean f21802y;
    public boolean f21803z;

    public da() {
        new Path().f23385a = 0.0f;
        Paint paint = new Paint(1);
        this.f21787o = paint;
        this.f21789p = new Paint(1);
        tq tqVar = new tq();
        this.f21791q = tqVar;
        this.f21793r = new Path();
        new Path().f23348a = tqVar;
        this.f21799u = -1;
        this.v = -1;
        n9 n9Var = new n9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new o9(this, n9Var) : n9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f21763a0 = new Object();
        this.f21767c0 = new OvershootInterpolator();
        this.f21768d0 = false;
        this.f21772f0 = new l7(this, 2);
        this.f21774g0 = new k9(this);
        this.f21777i0 = true;
        this.f21783l0 = null;
        this.f21794r0 = new g(this, 7);
        this.f21796s0 = new l9(this);
        ?? path = new Path();
        path.f23546a = 0.0f;
        path.f23547b = new ArrayList(1);
        path.f23548c = 0;
        this.f21798t0 = path;
        this.f21782l = ViewConfiguration.getLongPressTimeout();
        this.f21784m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f21785n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        tqVar.d = 1.0f;
    }

    public static void a(da daVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        t9 t9Var = daVar.f21763a0;
        if (Build.VERSION.SDK_INT >= 28 && daVar.W != null && !daVar.f21780k && daVar.f21776i && daVar.C != null) {
            if (daVar.f21778j) {
                i11 = daVar.f21799u;
            } else {
                i11 = daVar.v;
            }
            daVar.j(i11, t9Var, false);
            Layout layout = t9Var.f23296b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - t9Var.f23295a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = daVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + daVar.f21764b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + t9Var.f23297c);
                y9 y9Var = daVar.W;
                if (y9Var instanceof org.telegram.ui.u2) {
                    lineLeft = m10[0];
                    lineRight = ((View) y9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = m10[0] + daVar.f21762a + t9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + daVar.f21762a + t9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (daVar.I != f10) {
                    daVar.I = f10;
                    daVar.J = (f10 - daVar.H) / 200.0f;
                }
                float f11 = i10;
                if (daVar.L != f11) {
                    daVar.L = f11;
                    daVar.M = (f11 - daVar.K) / 100.0f;
                }
                if (daVar.G == null) {
                    daVar.G = new Magnifier(daVar.C);
                    daVar.H = daVar.I;
                    daVar.K = daVar.L;
                }
                float f12 = daVar.H;
                float f13 = daVar.I;
                if (f12 != f13) {
                    daVar.H = (daVar.J * 16.0f) + f12;
                }
                float f14 = daVar.J;
                if (f14 > 0.0f && daVar.H > f13) {
                    daVar.H = f13;
                } else if (f14 < 0.0f && daVar.H < f13) {
                    daVar.H = f13;
                }
                float f15 = daVar.K;
                float f16 = daVar.L;
                if (f15 != f16) {
                    daVar.K = (daVar.M * 16.0f) + f15;
                }
                float f17 = daVar.M;
                if (f17 > 0.0f && daVar.K > f16) {
                    daVar.K = f16;
                } else if (f17 < 0.0f && daVar.K < f16) {
                    daVar.K = f16;
                }
                daVar.G.show(daVar.K, (lineBottom * 1.5f) + daVar.H + AndroidUtilities.dp(8.0f));
                daVar.G.update();
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
        if (messageObject == null || this.f21800w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, y9 y9Var) {
        int i12;
        int i13;
        if (this.f21778j) {
            this.f21799u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f21799u = i13;
                this.f21778j = false;
            }
            this.f21802y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f21799u) > i11) {
            this.v = i12;
            this.f21799u = i11;
            this.f21778j = true;
        }
        this.f21802y = true;
    }

    public final int[] C(int i10) {
        t9 t9Var = this.f21763a0;
        j(i10, t9Var, false);
        Layout layout = t9Var.f23296b;
        int i11 = i10 - t9Var.f23295a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + t9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + t9Var.f23297c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        ca caVar;
        if (y() && (caVar = this.C) != null) {
            this.Q = true;
            caVar.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(y9 y9Var, y9 y9Var2);

    public final boolean N(MotionEvent motionEvent) {
        da daVar;
        int action = motionEvent.getAction();
        k9 k9Var = this.f21774g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f21797t - ((int) motionEvent.getY());
                    int x10 = this.f21795s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f21784m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(k9Var);
                        this.f21803z = false;
                    }
                    return this.f21803z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(k9Var);
            this.f21803z = false;
            return false;
        }
        this.f21795s = (int) motionEvent.getX();
        this.f21797t = (int) motionEvent.getY();
        this.f21803z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f21795s, this.f21797t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f21795s;
            int i13 = this.f21797t;
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
            daVar = this;
            int l4 = daVar.l(i16, i13, this.f21766c, this.d, this.X, true);
            CharSequence t10 = t(daVar.X, true);
            if (l4 >= t10.length()) {
                t9 t9Var = daVar.f21763a0;
                j(l4, t9Var, true);
                Layout layout = t9Var.f23296b;
                if (layout == null) {
                    daVar.f21803z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - daVar.f21766c;
                if (f7 < t9Var.f23296b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > t9Var.f23296b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(k9Var);
                AndroidUtilities.runOnUIThread(k9Var, daVar.f21782l);
                daVar.f21803z = true;
            }
        } else {
            daVar = this;
        }
        return daVar.f21803z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(bi.f3 f3Var) {
        this.D = f3Var;
    }

    public final void S() {
        this.f21779j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof ll0) {
            this.E = (ll0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.da.U():void");
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
        g gVar = this.f21794r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f21799u && i10 != this.v) {
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
        this.f21799u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f21800w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f21774g0);
        this.f21803z = false;
        ca caVar = this.C;
        if (caVar != null) {
            caVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(false);
        }
        this.f21795s = -1;
        this.f21797t = -1;
        this.f21766c = -1;
        this.d = -1;
        this.f21771f = 0.0f;
        this.f21773g = 0.0f;
        this.f21776i = false;
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
        tq tqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        x9 x9Var = this.f21798t0;
        x9Var.reset();
        layout.getSelectionPath(i11, i12, x9Var);
        if (x9Var.f23546a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (x9Var.f23546a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = x9Var.f23548c;
            tqVar = this.f21791q;
            f12 = this.f21785n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) x9Var.f23547b.get(i14);
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
            tqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                tqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.da.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, t9 t9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, y9 y9Var, boolean z10);

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

    public final ca o(Context context) {
        if (this.C == null) {
            this.C = new ca(this, context);
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
        return this.f21775h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f21799u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(y9 y9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f21775h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f21796s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = this.f21786n0;
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
        y9 y9Var = this.W;
        if (y9Var != null) {
            y9Var.invalidate();
        }
        ca caVar = this.C;
        if (caVar != null) {
            caVar.invalidate();
        }
    }

    public final boolean y() {
        if (this.f21799u >= 0 && this.v >= 0) {
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
