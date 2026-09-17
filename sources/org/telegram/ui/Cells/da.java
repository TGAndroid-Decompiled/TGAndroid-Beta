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
import org.telegram.ui.Components.uq;
public abstract class da {
    public final ActionMode.Callback A;
    public final Rect B;
    public ca C;
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
    public y9 W;
    public y9 X;
    public ActionMode Y;
    public boolean Z;
    public int f19949a;
    public final t9 f19950a0;
    public int f19951b;
    public int f19952b0;
    public int f19953c;
    public final OvershootInterpolator f19954c0;
    public int d;
    public boolean f19955d0;
    public boolean e;
    public int f19956e0;
    public float f19957f;
    public final l7 f19958f0;
    public float f19959g;
    public final k9 f19960g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 f19961h0;
    public boolean f19962i;
    public boolean f19963i0;
    public boolean f19964j;
    public boolean f19965j0;
    public boolean f19966k;
    public boolean f19967k0;
    public final int f19968l;
    public org.telegram.ui.t f19969l0;
    public final int f19970m;
    public ValueAnimator m0;
    public final float f19971n;
    public org.telegram.ui.ActionBar.o1 f19972n0;
    public final Paint f19973o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f19974o0;
    public final Paint f19975p;
    public TextView f19976p0;
    public final uq f19977q;
    public Rect f19978q0;
    public final Path f19979r;
    public final g f19980r0;
    public int f19981s;
    public final l9 f19982s0;
    public int f19983t;
    public final x9 f19984t0;
    public int f19985u;
    public int v;
    public int f19986w;
    public int f19987x;
    public boolean f19988y;
    public boolean f19989z;

    public da() {
        new Path().f21496a = 0.0f;
        Paint paint = new Paint(1);
        this.f19973o = paint;
        this.f19975p = new Paint(1);
        uq uqVar = new uq();
        this.f19977q = uqVar;
        this.f19979r = new Path();
        new Path().f21462a = uqVar;
        this.f19985u = -1;
        this.v = -1;
        n9 n9Var = new n9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new o9(this, n9Var) : n9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f19950a0 = new Object();
        this.f19954c0 = new OvershootInterpolator();
        this.f19955d0 = false;
        this.f19958f0 = new l7(this, 2);
        this.f19960g0 = new k9(this);
        this.f19963i0 = true;
        this.f19969l0 = null;
        this.f19980r0 = new g(this, 7);
        this.f19982s0 = new l9(this);
        ?? path = new Path();
        path.f21645a = 0.0f;
        path.f21646b = new ArrayList(1);
        path.f21647c = 0;
        this.f19984t0 = path;
        this.f19968l = ViewConfiguration.getLongPressTimeout();
        this.f19970m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f19971n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        uqVar.d = 1.0f;
    }

    public static void a(da daVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        t9 t9Var = daVar.f19950a0;
        if (Build.VERSION.SDK_INT >= 28 && daVar.W != null && !daVar.f19966k && daVar.f19962i && daVar.C != null) {
            if (daVar.f19964j) {
                i11 = daVar.f19985u;
            } else {
                i11 = daVar.v;
            }
            daVar.j(i11, t9Var, false);
            Layout layout = t9Var.f21418b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - t9Var.f21417a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = daVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + daVar.f19951b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + t9Var.f21419c);
                y9 y9Var = daVar.W;
                if (y9Var instanceof org.telegram.ui.t2) {
                    lineLeft = m10[0];
                    lineRight = ((View) y9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = m10[0] + daVar.f19949a + t9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + daVar.f19949a + t9Var.d);
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
        if (messageObject == null || this.f19986w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, y9 y9Var) {
        int i12;
        int i13;
        if (this.f19964j) {
            this.f19985u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f19985u = i13;
                this.f19964j = false;
            }
            this.f19988y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f19985u) > i11) {
            this.v = i12;
            this.f19985u = i11;
            this.f19964j = true;
        }
        this.f19988y = true;
    }

    public final int[] C(int i10) {
        t9 t9Var = this.f19950a0;
        j(i10, t9Var, false);
        Layout layout = t9Var.f21418b;
        int i11 = i10 - t9Var.f21417a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + t9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + t9Var.f21419c);
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
        k9 k9Var = this.f19960g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f19983t - ((int) motionEvent.getY());
                    int x10 = this.f19981s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f19970m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(k9Var);
                        this.f19989z = false;
                    }
                    return this.f19989z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(k9Var);
            this.f19989z = false;
            return false;
        }
        this.f19981s = (int) motionEvent.getX();
        this.f19983t = (int) motionEvent.getY();
        this.f19989z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f19981s, this.f19983t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f19981s;
            int i13 = this.f19983t;
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
            int l4 = daVar.l(i16, i13, this.f19953c, this.d, this.X, true);
            CharSequence t10 = t(daVar.X, true);
            if (l4 >= t10.length()) {
                t9 t9Var = daVar.f19950a0;
                j(l4, t9Var, true);
                Layout layout = t9Var.f21418b;
                if (layout == null) {
                    daVar.f19989z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - daVar.f19953c;
                if (f7 < t9Var.f21418b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > t9Var.f21418b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(k9Var);
                AndroidUtilities.runOnUIThread(k9Var, daVar.f19968l);
                daVar.f19989z = true;
            }
        } else {
            daVar = this;
        }
        return daVar.f19989z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(ai.s3 s3Var) {
        this.D = s3Var;
    }

    public final void S() {
        this.f19965j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof ml0) {
            this.E = (ml0) viewGroup;
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
        g gVar = this.f19980r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f19985u && i10 != this.v) {
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
        this.f19985u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f19986w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f19960g0);
        this.f19989z = false;
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
        this.f19981s = -1;
        this.f19983t = -1;
        this.f19953c = -1;
        this.d = -1;
        this.f19957f = 0.0f;
        this.f19959g = 0.0f;
        this.f19962i = false;
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
        uq uqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        x9 x9Var = this.f19984t0;
        x9Var.reset();
        layout.getSelectionPath(i11, i12, x9Var);
        if (x9Var.f21645a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (x9Var.f21645a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = x9Var.f21647c;
            uqVar = this.f19977q;
            f12 = this.f19971n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) x9Var.f21646b.get(i14);
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
        return this.f19961h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f19985u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(y9 y9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f19961h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f19982s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.f19972n0;
        if (o1Var != null) {
            o1Var.d(true);
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
        if (this.f19985u >= 0 && this.v >= 0) {
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
