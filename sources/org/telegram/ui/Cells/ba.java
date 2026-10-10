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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rm0;
public abstract class ba {
    public final m9 A;
    public final Rect B;
    public aa C;
    public w7.h0 D;
    public rm0 E;
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
    public w9 W;
    public w9 X;
    public org.telegram.ui.ActionBar.h4 Y;
    public boolean Z;
    public int f21856a;
    public final r9 f21857a0;
    public int f21858b;
    public int f21859b0;
    public int f21860c;
    public final OvershootInterpolator f21861c0;
    public int d;
    public int f21862d0;
    public boolean f21863e;
    public final i9 f21864e0;
    public float f21865f;
    public final j9 f21866f0;
    public float f21867g;
    public org.telegram.ui.ActionBar.e6 f21868g0;
    public final int[] h = new int[2];
    public boolean f21869h0;
    public boolean f21870i;
    public boolean f21871i0;
    public boolean f21872j;
    public boolean f21873j0;
    public boolean f21874k;
    public org.telegram.ui.u f21875k0;
    public final int f21876l;
    public ValueAnimator f21877l0;
    public final int f21878m;
    public final g m0;
    public final float f21879n;
    public final i9 f21880n0;
    public final Paint f21881o;
    public final v9 f21882o0;
    public final Paint f21883p;
    public final kr f21884q;
    public final Path f21885r;
    public int f21886s;
    public int f21887t;
    public int f21888u;
    public int v;
    public int f21889w;
    public int f21890x;
    public boolean f21891y;
    public boolean f21892z;

    public ba() {
        new Path().f23102a = 0.0f;
        Paint paint = new Paint(1);
        this.f21881o = paint;
        this.f21883p = new Paint(1);
        kr krVar = new kr();
        this.f21884q = krVar;
        this.f21885r = new Path();
        new Path().f22924a = krVar;
        this.f21888u = -1;
        this.v = -1;
        this.A = new m9(this, new l9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f21857a0 = new Object();
        this.f21861c0 = new OvershootInterpolator();
        this.f21864e0 = new i9(this, 0);
        this.f21866f0 = new j9(this);
        this.f21869h0 = true;
        this.f21875k0 = null;
        this.m0 = new g(this, 7);
        this.f21880n0 = new i9(this, 1);
        ?? path = new Path();
        path.f23571a = 0.0f;
        path.f23572b = new ArrayList(1);
        path.f23573c = 0;
        this.f21882o0 = path;
        this.f21876l = ViewConfiguration.getLongPressTimeout();
        this.f21878m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f21879n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        krVar.d = 1.0f;
    }

    public static void a(ba baVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        r9 r9Var = baVar.f21857a0;
        if (Build.VERSION.SDK_INT >= 28 && baVar.W != null && !baVar.f21874k && baVar.f21870i && baVar.C != null) {
            if (baVar.f21872j) {
                i11 = baVar.f21888u;
            } else {
                i11 = baVar.v;
            }
            baVar.i(i11, r9Var, false);
            Layout layout = r9Var.f22733b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - r9Var.f22732a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l4 = baVar.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + baVar.f21858b) + l4[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + r9Var.f22734c);
                w9 w9Var = baVar.W;
                if (w9Var instanceof org.telegram.ui.u2) {
                    lineLeft = l4[0];
                    lineRight = ((View) w9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = l4[0] + baVar.f21856a + r9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + baVar.f21856a + r9Var.d);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f7);
                }
                if (i10 < lineLeft) {
                    i10 = lineLeft;
                } else if (i10 > lineRight) {
                    i10 = lineRight;
                }
                float f10 = lineTop;
                if (baVar.I != f10) {
                    baVar.I = f10;
                    baVar.J = (f10 - baVar.H) / 200.0f;
                }
                float f11 = i10;
                if (baVar.L != f11) {
                    baVar.L = f11;
                    baVar.M = (f11 - baVar.K) / 100.0f;
                }
                if (baVar.G == null) {
                    baVar.G = new Magnifier(baVar.C);
                    baVar.H = baVar.I;
                    baVar.K = baVar.L;
                }
                float f12 = baVar.H;
                float f13 = baVar.I;
                if (f12 != f13) {
                    baVar.H = (baVar.J * 16.0f) + f12;
                }
                float f14 = baVar.J;
                if (f14 > 0.0f && baVar.H > f13) {
                    baVar.H = f13;
                } else if (f14 < 0.0f && baVar.H < f13) {
                    baVar.H = f13;
                }
                float f15 = baVar.K;
                float f16 = baVar.L;
                if (f15 != f16) {
                    baVar.K = (baVar.M * 16.0f) + f15;
                }
                float f17 = baVar.M;
                if (f17 > 0.0f && baVar.K > f16) {
                    baVar.K = f16;
                } else if (f17 < 0.0f && baVar.K < f16) {
                    baVar.K = f16;
                }
                baVar.G.show(baVar.K, (lineBottom * 1.5f) + baVar.H + AndroidUtilities.dp(8.0f));
                baVar.G.update();
            }
        }
    }

    public static boolean y(char c10) {
        if (!Character.isLetter(c10) && !Character.isDigit(c10) && c10 != '_') {
            return false;
        }
        return true;
    }

    public void A(int i10, int i11, boolean z10, float f7, float f10, w9 w9Var) {
        int i12;
        int i13;
        if (this.f21872j) {
            this.f21888u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f21888u = i13;
                this.f21872j = false;
            }
            this.f21891y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f21888u) > i11) {
            this.v = i12;
            this.f21888u = i11;
            this.f21872j = true;
        }
        this.f21891y = true;
    }

    public final int[] B(int i10) {
        r9 r9Var = this.f21857a0;
        i(i10, r9Var, false);
        Layout layout = r9Var.f22733b;
        int i11 = i10 - r9Var.f22732a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + r9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + r9Var.f22734c);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        aa aaVar;
        if (x() && (aaVar = this.C) != null) {
            this.Q = true;
            aaVar.invalidate();
            u();
        }
    }

    public boolean J() {
        return false;
    }

    public abstract void L(w9 w9Var, w9 w9Var2);

    public final boolean M(MotionEvent motionEvent) {
        ba baVar;
        int action = motionEvent.getAction();
        j9 j9Var = this.f21866f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f21887t - ((int) motionEvent.getY());
                    int x10 = this.f21886s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f21878m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(j9Var);
                        this.f21892z = false;
                    }
                    return this.f21892z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(j9Var);
            this.f21892z = false;
            return false;
        }
        this.f21886s = (int) motionEvent.getX();
        this.f21887t = (int) motionEvent.getY();
        this.f21892z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f21886s, this.f21887t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f21886s;
            int i13 = this.f21887t;
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
            baVar = this;
            int k10 = baVar.k(i16, i13, this.f21860c, this.d, this.X, true);
            CharSequence s10 = s(baVar.X, true);
            if (k10 >= s10.length()) {
                r9 r9Var = baVar.f21857a0;
                i(k10, r9Var, true);
                Layout layout = r9Var.f22733b;
                if (layout == null) {
                    baVar.f21892z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - baVar.f21860c;
                if (f7 < r9Var.f22733b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > r9Var.f22733b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(j9Var);
                AndroidUtilities.runOnUIThread(j9Var, baVar.f21876l);
                baVar.f21892z = true;
            }
        } else {
            baVar = this;
        }
        return baVar.f21892z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(ai.t3 t3Var) {
        this.D = t3Var;
    }

    public final void R() {
        this.f21871i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof rm0) {
            this.E = (rm0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f21870i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.h4 h4Var = this.Y;
                m9 m9Var = this.A;
                if (h4Var == null) {
                    org.telegram.ui.ActionBar.h4 h4Var2 = new org.telegram.ui.ActionBar.h4(this.C.getContext(), m9Var, this.C, new org.telegram.ui.ActionBar.w4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = h4Var2;
                    m9Var.onCreateActionMode(h4Var2, h4Var2.f20690c);
                }
                org.telegram.ui.ActionBar.h4 h4Var3 = this.Y;
                m9Var.onPrepareActionMode(h4Var3, h4Var3.f20690c);
                this.Y.hide(1L);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f21880n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f21877l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f21877l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f21877l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f21877l0.start();
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
        if (i10 != this.f21888u && i10 != this.v) {
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
        this.f21888u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f21889w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f21866f0);
        this.f21892z = false;
        aa aaVar = this.C;
        if (aaVar != null) {
            aaVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(false);
        }
        this.f21886s = -1;
        this.f21887t = -1;
        this.f21860c = -1;
        this.d = -1;
        this.f21865f = 0.0f;
        this.f21867g = 0.0f;
        this.f21870i = false;
    }

    public final void g(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        kr krVar;
        float f12;
        float f13;
        float f14;
        int lineTop;
        v9 v9Var = this.f21882o0;
        v9Var.reset();
        layout.getSelectionPath(i11, i12, v9Var);
        if (v9Var.f23571a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (v9Var.f23571a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = v9Var.f23573c;
            krVar = this.f21884q;
            f12 = this.f21879n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) v9Var.f23572b.get(i14);
            float max = Math.max(f7, rectF.left);
            if (z10) {
                f13 = f12 / 2.0f;
            } else {
                f13 = 0.0f;
            }
            float f15 = (int) (max - f13);
            float y3 = (int) com.google.android.gms.internal.vision.e2.y(rectF.top, f11, f10, f11);
            float max2 = Math.max(f7, rectF.right);
            if (z11) {
                f14 = f12 / 2.0f;
            } else {
                f14 = 0.0f;
            }
            rectF.set(f15, y3, (int) (max2 + f14), (int) com.google.android.gms.internal.vision.e2.y(rectF.bottom, f11, f10, f11));
            krVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 == 0 && !z11) {
            try {
                krVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void h(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ba.h(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void i(int i10, r9 r9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i10, int i11, int i12, int i13, w9 w9Var, boolean z10);

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

    public final aa n(Context context) {
        if (this.C == null) {
            this.C = new aa(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.e6 q() {
        return this.f21868g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.f21888u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(w9 w9Var, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, this.f21868g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.h4 h4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f21880n0.run();
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
        w9 w9Var = this.W;
        if (w9Var != null) {
            w9Var.invalidate();
        }
        aa aaVar = this.C;
        if (aaVar != null) {
            aaVar.invalidate();
        }
    }

    public final boolean x() {
        if (this.f21888u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(MessageObject messageObject) {
        if (messageObject == null || this.f21889w != messageObject.getId()) {
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

    public void I(int i10, int i11, MessageObject messageObject) {
    }
}
