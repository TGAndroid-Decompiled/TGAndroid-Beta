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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.oq;
public abstract class x9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public w9 C;
    public i7.b6 D;
    public jl0 E;
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
    public s9 W;
    public s9 X;
    public ActionMode Y;
    public boolean Z;
    public int f25932a;
    public final n9 f25933a0;
    public int f25934b;
    public int f25935b0;
    public int f25936c;
    public final OvershootInterpolator f25937c0;
    public int d;
    public boolean f25938d0;
    public boolean f25939e;
    public int f25940e0;
    public float f25941f;
    public final lh.m7 f25942f0;
    public float f25943g;
    public final e9 f25944g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.c6 f25945h0;
    public boolean f25946i;
    public boolean f25947i0;
    public boolean f25948j;
    public boolean f25949j0;
    public boolean f25950k;
    public boolean f25951k0;
    public final int f25952l;
    public org.telegram.ui.v f25953l0;
    public final int f25954m;
    public ValueAnimator m0;
    public final float f25955n;
    public org.telegram.ui.ActionBar.o1 f25956n0;
    public final Paint f25957o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f25958o0;
    public final Paint f25959p;
    public TextView f25960p0;
    public final oq f25961q;
    public Rect f25962q0;
    public final Path f25963r;
    public final g f25964r0;
    public int f25965s;
    public final f9 f25966s0;
    public int f25967t;
    public final r9 f25968t0;
    public int f25969u;
    public int v;
    public int f25970w;
    public int f25971x;
    public boolean f25972y;
    public boolean f25973z;

    public x9() {
        new Path().f25017a = 0.0f;
        Paint paint = new Paint(1);
        this.f25957o = paint;
        this.f25959p = new Paint(1);
        oq oqVar = new oq();
        this.f25961q = oqVar;
        this.f25963r = new Path();
        new Path().f24818a = oqVar;
        this.f25969u = -1;
        this.v = -1;
        h9 h9Var = new h9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new i9(this, h9Var) : h9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f25933a0 = new Object();
        this.f25937c0 = new OvershootInterpolator();
        this.f25938d0 = false;
        this.f25942f0 = new lh.m7(this, 12);
        this.f25944g0 = new e9(this);
        this.f25947i0 = true;
        this.f25953l0 = null;
        this.f25964r0 = new g(this, 7);
        this.f25966s0 = new f9(this);
        ?? path = new Path();
        path.f25246a = 0.0f;
        path.f25247b = new ArrayList(1);
        path.f25248c = 0;
        this.f25968t0 = path;
        this.f25952l = ViewConfiguration.getLongPressTimeout();
        this.f25954m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f25955n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        oqVar.d = 1.0f;
    }

    public static void a(x9 x9Var, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        n9 n9Var = x9Var.f25933a0;
        if (Build.VERSION.SDK_INT >= 28 && x9Var.W != null && !x9Var.f25950k && x9Var.f25946i && x9Var.C != null) {
            if (x9Var.f25948j) {
                i11 = x9Var.f25969u;
            } else {
                i11 = x9Var.v;
            }
            x9Var.j(i11, n9Var, false);
            Layout layout = n9Var.f24754b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - n9Var.f24753a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = x9Var.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + x9Var.f25934b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + n9Var.f24755c);
                s9 s9Var = x9Var.W;
                if (s9Var instanceof org.telegram.ui.y2) {
                    lineLeft = m10[0];
                    lineRight = ((View) s9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f9 = m10[0] + x9Var.f25932a + n9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + x9Var.f25932a + n9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f9);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (x9Var.I != f10) {
                    x9Var.I = f10;
                    x9Var.J = (f10 - x9Var.H) / 200.0f;
                }
                float f11 = i10;
                if (x9Var.L != f11) {
                    x9Var.L = f11;
                    x9Var.M = (f11 - x9Var.K) / 100.0f;
                }
                if (x9Var.G == null) {
                    x9Var.G = new Magnifier(x9Var.C);
                    x9Var.H = x9Var.I;
                    x9Var.K = x9Var.L;
                }
                float f12 = x9Var.H;
                float f13 = x9Var.I;
                if (f12 != f13) {
                    x9Var.H = (x9Var.J * 16.0f) + f12;
                }
                float f14 = x9Var.J;
                if (f14 > 0.0f && x9Var.H > f13) {
                    x9Var.H = f13;
                } else if (f14 < 0.0f && x9Var.H < f13) {
                    x9Var.H = f13;
                }
                float f15 = x9Var.K;
                float f16 = x9Var.L;
                if (f15 != f16) {
                    x9Var.K = (x9Var.M * 16.0f) + f15;
                }
                float f17 = x9Var.M;
                if (f17 > 0.0f && x9Var.K > f16) {
                    x9Var.K = f16;
                } else if (f17 < 0.0f && x9Var.K < f16) {
                    x9Var.K = f16;
                }
                x9Var.G.show(x9Var.K, (lineBottom * 1.5f) + x9Var.H + AndroidUtilities.dp(8.0f));
                x9Var.G.update();
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
        if (messageObject == null || this.f25970w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i10, int i11, boolean z10, float f9, float f10, s9 s9Var) {
        int i12;
        int i13;
        if (this.f25948j) {
            this.f25969u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f25969u = i13;
                this.f25948j = false;
            }
            this.f25972y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f25969u) > i11) {
            this.v = i12;
            this.f25969u = i11;
            this.f25948j = true;
        }
        this.f25972y = true;
    }

    public final int[] C(int i10) {
        n9 n9Var = this.f25933a0;
        j(i10, n9Var, false);
        Layout layout = n9Var.f24754b;
        int i11 = i10 - n9Var.f24753a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + n9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + n9Var.f24755c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        w9 w9Var;
        if (y() && (w9Var = this.C) != null) {
            this.Q = true;
            w9Var.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(s9 s9Var, s9 s9Var2);

    public final boolean N(MotionEvent motionEvent) {
        x9 x9Var;
        int action = motionEvent.getAction();
        e9 e9Var = this.f25944g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y8 = this.f25967t - ((int) motionEvent.getY());
                    int x4 = this.f25965s - ((int) motionEvent.getX());
                    int i10 = (x4 * x4) + (y8 * y8);
                    int i11 = this.f25954m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(e9Var);
                        this.f25973z = false;
                    }
                    return this.f25973z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(e9Var);
            this.f25973z = false;
            return false;
        }
        this.f25965s = (int) motionEvent.getX();
        this.f25967t = (int) motionEvent.getY();
        this.f25973z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f25965s, this.f25967t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f25965s;
            int i13 = this.f25967t;
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
            x9Var = this;
            int l10 = x9Var.l(i16, i13, this.f25936c, this.d, this.X, true);
            CharSequence t10 = t(x9Var.X, true);
            if (l10 >= t10.length()) {
                n9 n9Var = x9Var.f25933a0;
                j(l10, n9Var, true);
                Layout layout = n9Var.f24754b;
                if (layout == null) {
                    x9Var.f25973z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f9 = i16 - x9Var.f25936c;
                if (f9 < n9Var.f24754b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f9 > n9Var.f24754b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(e9Var);
                AndroidUtilities.runOnUIThread(e9Var, x9Var.f25952l);
                x9Var.f25973z = true;
            }
        } else {
            x9Var = this;
        }
        return x9Var.f25973z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(lh.g2 g2Var) {
        this.D = g2Var;
    }

    public final void S() {
        this.f25949j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof jl0) {
            this.E = (jl0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x9.U():void");
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
        g gVar = this.f25964r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        if (i10 != this.f25969u && i10 != this.v) {
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
        this.f25969u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f25970w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f25944g0);
        this.f25973z = false;
        w9 w9Var = this.C;
        if (w9Var != null) {
            w9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        i7.b6 b6Var = this.D;
        if (b6Var != null) {
            b6Var.a(false);
        }
        this.f25965s = -1;
        this.f25967t = -1;
        this.f25936c = -1;
        this.d = -1;
        this.f25941f = 0.0f;
        this.f25943g = 0.0f;
        this.f25946i = false;
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
            i7.b6 b6Var = this.D;
            if (b6Var != null) {
                b6Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f9) {
        float f10;
        float f11;
        int i13;
        oq oqVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        r9 r9Var = this.f25968t0;
        r9Var.reset();
        layout.getSelectionPath(i11, i12, r9Var);
        if (r9Var.f25246a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (r9Var.f25246a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = r9Var.f25248c;
            oqVar = this.f25961q;
            f12 = this.f25955n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) r9Var.f25247b.get(i14);
            float max = Math.max(f9, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float z12 = (int) com.google.android.recaptcha.internal.a.z(rectF.top, f11, f10, f11);
            float max2 = Math.max(f9, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, z12, (int) (max2 + f14), (int) com.google.android.recaptcha.internal.a.z(rectF.bottom, f11, f10, f11));
            oqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                oqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x9.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i10, n9 n9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, s9 s9Var, boolean z10);

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

    public final w9 o(Context context) {
        if (this.C == null) {
            this.C = new w9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.c6 r() {
        return this.f25945h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f25969u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(s9 s9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.f25945h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f25966s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.f25956n0;
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
        s9 s9Var = this.W;
        if (s9Var != null) {
            s9Var.invalidate();
        }
        w9 w9Var = this.C;
        if (w9Var != null) {
            w9Var.invalidate();
        }
    }

    public final boolean y() {
        if (this.f25969u >= 0 && this.v >= 0) {
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

    public void L(float f9, float f10) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
