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
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.wk0;
public abstract class aa {
    public final ActionMode.Callback A;
    public final Rect B;
    public z9 C;
    public g7.a6 D;
    public wk0 E;
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
    public ActionMode Y;
    public boolean Z;
    public int f24071a;
    public final q9 f24072a0;
    public int f24073b;
    public int f24074b0;
    public int f24075c;
    public final OvershootInterpolator f24076c0;
    public int d;
    public boolean f24077d0;
    public boolean f24078e;
    public int f24079e0;
    public float f24080f;
    public final m.i3 f24081f0;
    public float f24082g;
    public final h9 f24083g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.b6 f24084h0;
    public boolean f24085i;
    public boolean f24086i0;
    public boolean f24087j;
    public boolean f24088j0;
    public boolean f24089k;
    public boolean f24090k0;
    public final int f24091l;
    public org.telegram.ui.t f24092l0;
    public final int f24093m;
    public ValueAnimator m0;
    public final float f24094n;
    public org.telegram.ui.ActionBar.o1 f24095n0;
    public final Paint f24096o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f24097o0;
    public final Paint f24098p;
    public TextView f24099p0;
    public final kq f24100q;
    public Rect f24101q0;
    public final Path f24102r;
    public final g f24103r0;
    public int f24104s;
    public final i9 f24105s0;
    public int f24106t;
    public final u9 f24107t0;
    public int f24108u;
    public int v;
    public int f24109w;
    public int f24110x;
    public boolean f24111y;
    public boolean f24112z;

    public aa() {
        new Path().f25295a = 0.0f;
        Paint paint = new Paint(1);
        this.f24096o = paint;
        this.f24098p = new Paint(1);
        kq kqVar = new kq();
        this.f24100q = kqVar;
        this.f24102r = new Path();
        new Path().f25129a = kqVar;
        this.f24108u = -1;
        this.v = -1;
        k9 k9Var = new k9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new l9(this, k9Var) : k9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f24072a0 = new Object();
        this.f24076c0 = new OvershootInterpolator();
        this.f24077d0 = false;
        this.f24081f0 = new m.i3(this, 9);
        this.f24083g0 = new h9(this);
        this.f24086i0 = true;
        this.f24092l0 = null;
        this.f24103r0 = new g(this, 7);
        this.f24105s0 = new i9(this);
        ?? path = new Path();
        path.f25766a = 0.0f;
        path.f25767b = new ArrayList(1);
        path.f25768c = 0;
        this.f24107t0 = path;
        this.f24091l = ViewConfiguration.getLongPressTimeout();
        this.f24093m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f24094n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        kqVar.d = 1.0f;
    }

    public static void a(aa aaVar, int i9) {
        int i10;
        int lineRight;
        int lineLeft;
        q9 q9Var = aaVar.f24072a0;
        if (Build.VERSION.SDK_INT >= 28 && aaVar.W != null && !aaVar.f24089k && aaVar.f24085i && aaVar.C != null) {
            if (aaVar.f24087j) {
                i10 = aaVar.f24108u;
            } else {
                i10 = aaVar.v;
            }
            aaVar.j(i10, q9Var, false);
            Layout layout = q9Var.f24920b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i10 - q9Var.f24919a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] m10 = aaVar.m();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + aaVar.f24073b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + q9Var.f24921c);
                v9 v9Var = aaVar.W;
                if (v9Var instanceof org.telegram.ui.x2) {
                    lineLeft = m10[0];
                    lineRight = ((View) v9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f10 = m10[0] + aaVar.f24071a + q9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + aaVar.f24071a + q9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f10);
                }
                if (i9 < lineLeft) {
                    i9 = lineLeft;
                } else if (i9 > lineRight) {
                    i9 = lineRight;
                }
                float f11 = lineTop;
                if (aaVar.I != f11) {
                    aaVar.I = f11;
                    aaVar.J = (f11 - aaVar.H) / 200.0f;
                }
                float f12 = i9;
                if (aaVar.L != f12) {
                    aaVar.L = f12;
                    aaVar.M = (f12 - aaVar.K) / 100.0f;
                }
                if (aaVar.G == null) {
                    aaVar.G = new Magnifier(aaVar.C);
                    aaVar.H = aaVar.I;
                    aaVar.K = aaVar.L;
                }
                float f13 = aaVar.H;
                float f14 = aaVar.I;
                if (f13 != f14) {
                    aaVar.H = (aaVar.J * 16.0f) + f13;
                }
                float f15 = aaVar.J;
                if (f15 > 0.0f && aaVar.H > f14) {
                    aaVar.H = f14;
                } else if (f15 < 0.0f && aaVar.H < f14) {
                    aaVar.H = f14;
                }
                float f16 = aaVar.K;
                float f17 = aaVar.L;
                if (f16 != f17) {
                    aaVar.K = (aaVar.M * 16.0f) + f16;
                }
                float f18 = aaVar.M;
                if (f18 > 0.0f && aaVar.K > f17) {
                    aaVar.K = f17;
                } else if (f18 < 0.0f && aaVar.K < f17) {
                    aaVar.K = f17;
                }
                aaVar.G.show(aaVar.K, (lineBottom * 1.5f) + aaVar.H + AndroidUtilities.dp(8.0f));
                aaVar.G.update();
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
        if (messageObject == null || this.f24109w != messageObject.getId()) {
            return false;
        }
        return true;
    }

    public void B(int i9, int i10, boolean z10, float f10, float f11, v9 v9Var) {
        int i11;
        int i12;
        if (this.f24087j) {
            this.f24108u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.f24108u = i12;
                this.f24087j = false;
            }
            this.f24111y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.f24108u) > i10) {
            this.v = i11;
            this.f24108u = i10;
            this.f24087j = true;
        }
        this.f24111y = true;
    }

    public final int[] C(int i9) {
        q9 q9Var = this.f24072a0;
        j(i9, q9Var, false);
        Layout layout = q9Var.f24920b;
        int i10 = i9 - q9Var.f24919a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + q9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + q9Var.f24921c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        z9 z9Var;
        if (y() && (z9Var = this.C) != null) {
            this.Q = true;
            z9Var.invalidate();
            v();
        }
    }

    public boolean K() {
        return false;
    }

    public abstract void M(v9 v9Var, v9 v9Var2);

    public final boolean N(MotionEvent motionEvent) {
        aa aaVar;
        int action = motionEvent.getAction();
        h9 h9Var = this.f24083g0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y10 = this.f24106t - ((int) motionEvent.getY());
                    int x10 = this.f24104s - ((int) motionEvent.getX());
                    int i9 = (x10 * x10) + (y10 * y10);
                    int i10 = this.f24093m;
                    if (i9 > i10 * i10) {
                        AndroidUtilities.cancelRunOnUIThread(h9Var);
                        this.f24112z = false;
                    }
                    return this.f24112z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(h9Var);
            this.f24112z = false;
            return false;
        }
        this.f24104s = (int) motionEvent.getX();
        this.f24106t = (int) motionEvent.getY();
        this.f24112z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f24104s, this.f24106t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i11 = this.f24104s;
            int i12 = this.f24106t;
            int i13 = rect.right;
            if (i11 > i13) {
                i11 = i13 - 1;
            }
            int i14 = rect.left;
            if (i11 < i14) {
                i11 = i14 + 1;
            }
            int i15 = i11;
            int i16 = rect.top;
            if (i12 < i16) {
                i12 = i16 + 1;
            }
            int i17 = rect.bottom;
            if (i12 > i17) {
                i12 = i17 - 1;
            }
            aaVar = this;
            int l10 = aaVar.l(i15, i12, this.f24075c, this.d, this.X, true);
            CharSequence t10 = t(aaVar.X, true);
            if (l10 >= t10.length()) {
                q9 q9Var = aaVar.f24072a0;
                j(l10, q9Var, true);
                Layout layout = q9Var.f24920b;
                if (layout == null) {
                    aaVar.f24112z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - aaVar.f24075c;
                if (f10 < q9Var.f24920b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > q9Var.f24920b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(h9Var);
                AndroidUtilities.runOnUIThread(h9Var, aaVar.f24091l);
                aaVar.f24112z = true;
            }
        } else {
            aaVar = this;
        }
        return aaVar.f24112z;
    }

    public boolean Q(int i9, int i10) {
        return false;
    }

    public final void R(ih.i2 i2Var) {
        this.D = i2Var;
    }

    public final void S() {
        this.f24088j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof wk0) {
            this.E = (wk0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.aa.U():void");
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
        g gVar = this.f24103r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i9) {
        if (i9 != this.f24108u && i9 != this.v) {
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
        this.f24108u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.f24109w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f24083g0);
        this.f24112z = false;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(false);
        }
        this.f24104s = -1;
        this.f24106t = -1;
        this.f24075c = -1;
        this.d = -1;
        this.f24080f = 0.0f;
        this.f24082g = 0.0f;
        this.f24085i = false;
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
            g7.a6 a6Var = this.D;
            if (a6Var != null) {
                a6Var.b();
            }
        }
    }

    public final void h(Layout layout, int i9, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        kq kqVar;
        float f13;
        float f14;
        float f15;
        int lineTop;
        u9 u9Var = this.f24107t0;
        u9Var.reset();
        layout.getSelectionPath(i10, i11, u9Var);
        if (u9Var.f25766a < layout.getLineBottom(i9)) {
            f12 = layout.getLineTop(i9);
            f11 = (layout.getLineBottom(i9) - lineTop) / (u9Var.f25766a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = u9Var.f25768c;
            kqVar = this.f24100q;
            f13 = this.f24094n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) u9Var.f25767b.get(i13);
            float max = Math.max(f10, rectF.left);
            if (z10) {
                f14 = f13 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            float f16 = (int) (max - f14);
            float z12 = (int) e2.c.z(rectF.top, f12, f11, f12);
            float max2 = Math.max(f10, rectF.right);
            if (z11) {
                f15 = f13 / 2.0f;
            } else {
                f15 = 0.0f;
            }
            rectF.set(f16, z12, (int) (max2 + f15), (int) e2.c.z(rectF.bottom, f12, f11, f12));
            kqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 == 0 && !z11) {
            try {
                kqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i9), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i9), Path.Direction.CW);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void i(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.aa.i(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void j(int i9, q9 q9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i9, int i10, int i11, int i12, v9 v9Var, boolean z10);

    public final int[] m() {
        int i9;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i9 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i9 = (int) (view.getY() + i9);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i9 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i9};
        }
        i9 = 0;
        return new int[]{i10, i9};
    }

    public abstract int n();

    public final z9 o(Context context) {
        if (this.C == null) {
            this.C = new z9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.b6 r() {
        return this.f24084h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.f24108u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(v9 v9Var, boolean z10);

    public int u(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.f24084h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.f24105s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.f24095n0;
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
        v9 v9Var = this.W;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
        }
    }

    public final boolean y() {
        if (this.f24108u >= 0 && this.v >= 0) {
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

    public void L(float f10, float f11) {
    }

    public void J(int i9, int i10, MessageObject messageObject) {
    }
}
