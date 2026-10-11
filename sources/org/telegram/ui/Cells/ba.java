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
import org.telegram.ui.Components.sm0;
public abstract class ba {
    public final m9 A;
    public final Rect B;
    public aa C;
    public w7.h0 D;
    public sm0 E;
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
    public org.telegram.ui.ActionBar.g4 Y;
    public boolean Z;
    public int f21844a;
    public final r9 f21845a0;
    public int f21846b;
    public int f21847b0;
    public int f21848c;
    public final OvershootInterpolator f21849c0;
    public int d;
    public int f21850d0;
    public boolean f21851e;
    public final i9 f21852e0;
    public float f21853f;
    public final j9 f21854f0;
    public float f21855g;
    public org.telegram.ui.ActionBar.d6 f21856g0;
    public final int[] h = new int[2];
    public boolean f21857h0;
    public boolean f21858i;
    public boolean f21859i0;
    public boolean f21860j;
    public boolean f21861j0;
    public boolean f21862k;
    public org.telegram.ui.t f21863k0;
    public final int f21864l;
    public ValueAnimator f21865l0;
    public final int f21866m;
    public final g m0;
    public final float f21867n;
    public final i9 f21868n0;
    public final Paint f21869o;
    public final v9 f21870o0;
    public final Paint f21871p;
    public final kr f21872q;
    public final Path f21873r;
    public int f21874s;
    public int f21875t;
    public int f21876u;
    public int v;
    public int f21877w;
    public int f21878x;
    public boolean f21879y;
    public boolean f21880z;

    public ba() {
        new Path().f23090a = 0.0f;
        Paint paint = new Paint(1);
        this.f21869o = paint;
        this.f21871p = new Paint(1);
        kr krVar = new kr();
        this.f21872q = krVar;
        this.f21873r = new Path();
        new Path().f22912a = krVar;
        this.f21876u = -1;
        this.v = -1;
        this.A = new m9(this, new l9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.f21845a0 = new Object();
        this.f21849c0 = new OvershootInterpolator();
        this.f21852e0 = new i9(this, 0);
        this.f21854f0 = new j9(this);
        this.f21857h0 = true;
        this.f21863k0 = null;
        this.m0 = new g(this, 7);
        this.f21868n0 = new i9(this, 1);
        ?? path = new Path();
        path.f23559a = 0.0f;
        path.f23560b = new ArrayList(1);
        path.f23561c = 0;
        this.f21870o0 = path;
        this.f21864l = ViewConfiguration.getLongPressTimeout();
        this.f21866m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.f21867n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        krVar.d = 1.0f;
    }

    public static void a(ba baVar, int i10) {
        int i11;
        int lineRight;
        int lineLeft;
        r9 r9Var = baVar.f21845a0;
        if (Build.VERSION.SDK_INT >= 28 && baVar.W != null && !baVar.f21862k && baVar.f21858i && baVar.C != null) {
            if (baVar.f21860j) {
                i11 = baVar.f21876u;
            } else {
                i11 = baVar.v;
            }
            baVar.i(i11, r9Var, false);
            Layout layout = r9Var.f22721b;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - r9Var.f22720a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] l4 = baVar.l();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + baVar.f21846b) + l4[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + r9Var.f22722c);
                w9 w9Var = baVar.W;
                if (w9Var instanceof org.telegram.ui.t2) {
                    lineLeft = l4[0];
                    lineRight = ((View) w9Var).getMeasuredWidth() + lineLeft;
                } else {
                    float f7 = l4[0] + baVar.f21844a + r9Var.d;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + baVar.f21844a + r9Var.d);
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
        if (this.f21860j) {
            this.f21876u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.f21876u = i13;
                this.f21860j = false;
            }
            this.f21879y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.f21876u) > i11) {
            this.v = i12;
            this.f21876u = i11;
            this.f21860j = true;
        }
        this.f21879y = true;
    }

    public final int[] B(int i10) {
        r9 r9Var = this.f21845a0;
        i(i10, r9Var, false);
        Layout layout = r9Var.f22721b;
        int i11 = i10 - r9Var.f22720a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + r9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + r9Var.f22722c);
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
        j9 j9Var = this.f21854f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y3 = this.f21875t - ((int) motionEvent.getY());
                    int x10 = this.f21874s - ((int) motionEvent.getX());
                    int i10 = (x10 * x10) + (y3 * y3);
                    int i11 = this.f21866m;
                    if (i10 > i11 * i11) {
                        AndroidUtilities.cancelRunOnUIThread(j9Var);
                        this.f21880z = false;
                    }
                    return this.f21880z;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(j9Var);
            this.f21880z = false;
            return false;
        }
        this.f21874s = (int) motionEvent.getX();
        this.f21875t = (int) motionEvent.getY();
        this.f21880z = false;
        Rect rect = this.B;
        rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        if (rect.contains(this.f21874s, this.f21875t) && this.X != null) {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i12 = this.f21874s;
            int i13 = this.f21875t;
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
            int k10 = baVar.k(i16, i13, this.f21848c, this.d, this.X, true);
            CharSequence s10 = s(baVar.X, true);
            if (k10 >= s10.length()) {
                r9 r9Var = baVar.f21845a0;
                i(k10, r9Var, true);
                Layout layout = r9Var.f22721b;
                if (layout == null) {
                    baVar.f21880z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - baVar.f21848c;
                if (f7 < r9Var.f22721b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > r9Var.f22721b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(j9Var);
                AndroidUtilities.runOnUIThread(j9Var, baVar.f21864l);
                baVar.f21880z = true;
            }
        } else {
            baVar = this;
        }
        return baVar.f21880z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(ai.t3 t3Var) {
        this.D = t3Var;
    }

    public final void R() {
        this.f21859i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof sm0) {
            this.E = (sm0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.f21858i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.g4 g4Var = this.Y;
                m9 m9Var = this.A;
                if (g4Var == null) {
                    org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4(this.C.getContext(), m9Var, this.C, new org.telegram.ui.ActionBar.v4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = g4Var2;
                    m9Var.onCreateActionMode(g4Var2, g4Var2.f20640c);
                }
                org.telegram.ui.ActionBar.g4 g4Var3 = this.Y;
                m9Var.onPrepareActionMode(g4Var3, g4Var3.f20640c);
                this.Y.hide(1L);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f21868n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.f21865l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.f21865l0 = ofFloat;
            ofFloat.addUpdateListener(new r(this, 7));
            this.f21865l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.f21865l0.start();
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
        if (i10 != this.f21876u && i10 != this.v) {
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
        this.f21876u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.f21877w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.f21854f0);
        this.f21880z = false;
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
        this.f21874s = -1;
        this.f21875t = -1;
        this.f21848c = -1;
        this.d = -1;
        this.f21853f = 0.0f;
        this.f21855g = 0.0f;
        this.f21858i = false;
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
        v9 v9Var = this.f21870o0;
        v9Var.reset();
        layout.getSelectionPath(i11, i12, v9Var);
        if (v9Var.f23559a < layout.getLineBottom(i10)) {
            f11 = layout.getLineTop(i10);
            f10 = (layout.getLineBottom(i10) - lineTop) / (v9Var.f23559a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = v9Var.f23561c;
            krVar = this.f21872q;
            f12 = this.f21867n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) v9Var.f23560b.get(i14);
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

    public org.telegram.ui.ActionBar.d6 q() {
        return this.f21856g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.f21876u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(w9 w9Var, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.f21856g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.g4 g4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.f21868n0.run();
        }
        this.P = false;
        if (!x() && (g4Var = this.Y) != null) {
            g4Var.finish();
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
        if (this.f21876u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean z(MessageObject messageObject) {
        if (messageObject == null || this.f21877w != messageObject.getId()) {
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
