package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.vg0;
import org.telegram.ui.xg0;
public abstract class zt implements vg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.mc K;
    public xg0 L;
    public fu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final ev f28351a;
    public final Rect f28352b;
    public final int f28353c;
    public StaticLayout d;
    public float f28354e;
    public int f28355f;
    public int h;
    public int f28356n;
    public CheckBoxBase f28357r;
    public float f28358s;
    public int f28359w;
    public boolean f28360x;
    public boolean f28361y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public zt(ev evVar, Rect rect, int i7) {
        this.f28351a = evVar;
        this.f28352b = new Rect(rect);
        this.f28353c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.o9[] o9VarArr = (org.telegram.ui.Cells.o9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.o9.class);
        if (o9VarArr != null && o9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(o9VarArr, new yt(spanned, 0));
            for (org.telegram.ui.Cells.o9 o9Var : o9VarArr) {
                int spanStart = spanned.getSpanStart(o9Var);
                int spanEnd = spanned.getSpanEnd(o9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = o9Var.f31212a;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                }
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, dv dvVar, dv[] dvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (dvVar != null && (staticLayout2 = dvVar.f23580b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (dvVarArr != null) {
            for (dv dvVar2 : dvVarArr) {
                if (dvVar2 != null && (staticLayout = dvVar2.f23580b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i7, Rect rect) {
        int i10 = this.f28352b.left;
        float f10 = this.N;
        rect.set(i10, (int) f10, this.f28353c + i10, (int) (f10 + I()));
    }

    public int B() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i7) {
        return null;
    }

    public final RectF F() {
        ev evVar = this.f28351a;
        float textY = evVar.E.getTextY() + this.N;
        Rect rect = this.f28352b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (evVar.E.getTextX() - evVar.S), f10, ((evVar.E.getTextX() + evVar.C) + evVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f28357r;
        if (checkBoxBase != null && checkBoxBase.f32838q) {
            return true;
        }
        return false;
    }

    public int H() {
        return 0;
    }

    public abstract int I();

    public int J() {
        return K();
    }

    public int K() {
        Rect rect = this.f28352b;
        return rect.left + this.f28353c + rect.right;
    }

    public org.telegram.ui.Cells.t9[] L() {
        return null;
    }

    public final boolean M(int i7) {
        if (this.f28357r != null && i7 == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i7) {
        if (this.f28357r != null && i7 == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i7) {
        if ((this.f28357r == null || i7 != 0) && (this instanceof fu)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        ev evVar = this.f28351a;
        if (evVar.h.isEmpty() || (indexOf = evVar.f23775g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < evVar.h.size(); i7++) {
            vt vtVar = (vt) evVar.h.get(i7);
            if (indexOf >= vtVar.f27597a && indexOf <= vtVar.f27598b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        fu fuVar = this.M;
        if (fuVar == null) {
            return true;
        }
        if (!fuVar.X.open) {
            return false;
        }
        return fuVar.S();
    }

    public boolean U(int i7, View view) {
        return false;
    }

    public void X(Canvas canvas, int i7, float f10) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        org.telegram.ui.Cells.t9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof dv) {
                    dv dvVar = (dv) t9Var;
                    dvVar.f23581c = i7 - dvVar.f23583f;
                    dvVar.d = i10;
                    dvVar.f23582e = i11;
                }
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(boolean z10) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z10);
            }
        }
    }

    public void b(boolean z10) {
        a0(z10);
    }

    public final void b0(TLObject tLObject, boolean z10) {
        this.H = tLObject;
        if (this.f28357r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f28351a.D);
            this.f28357r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.f29806z5, org.telegram.ui.ActionBar.n6.f29526k7);
            this.f28357r.d(10);
            this.f28357r.k(true);
            this.f28357r.i(g0.L(5.0f));
        }
        this.f28357r.f(-1, z10, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i7;
        Layout.Alignment alignment;
        ev evVar = this.f28351a;
        evVar.f23790x.setTextSize(g0.L(bz.W0));
        Layout a10 = a();
        if (a10 == null) {
            text = null;
        } else {
            text = a10.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (av avVar : (av[]) ((Spanned) text).getSpans(0, 1, av.class)) {
                if (TLObject.hasFlag(avVar.f22973b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.f28356n;
        if (i10 <= 0) {
            boolean I = evVar.I();
            Rect rect = this.f28352b;
            if (I) {
                i7 = rect.right;
            } else {
                i7 = rect.left;
            }
            i10 = Math.max(i7, g0.L(evVar.M + 4));
        }
        int i11 = i10;
        TextPaint textPaint = evVar.f23790x;
        if (evVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
        this.f28355f = g0.L(evVar.M + 4);
        this.h = 0;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f28355f = Math.min(this.f28355f, (int) this.d.getLineLeft(i12));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i12));
        }
        g0();
    }

    public void d0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    @Override
    public final View e() {
        return null;
    }

    public final void e0() {
        if (!n()) {
            return;
        }
        ev evVar = this.f28351a;
        if (!mp.u1(evVar.f23770a).B4()) {
            new ug.z0(43, evVar.E.getContext(), evVar.D).show();
            return;
        }
        boolean z10 = !G();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z10;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
        }
        View view = evVar.Q;
        if (view != null) {
            this.f28357r.f32824a = view;
        }
        this.f28357r.f(-1, z10, true);
        View view2 = evVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = evVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        evVar.F.a2(evVar.E, new i10(5, this, z10));
    }

    public final boolean f0(MotionEvent motionEvent) {
        boolean z10;
        View view;
        Rect rect = this.f28352b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f28357r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                ev evVar = this.f28351a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = evVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.mc(view);
                        }
                        org.telegram.ui.Components.mc mcVar = this.K;
                        if (mcVar != null) {
                            mcVar.c(true);
                        }
                        View view2 = evVar.Q;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        motionEvent.offsetLocation(rect.left, rect.top);
                        return true;
                    }
                } else if (this.J) {
                    if (actionMasked == 2) {
                        if (!contains) {
                            this.J = false;
                            org.telegram.ui.Components.mc mcVar2 = this.K;
                            if (mcVar2 != null) {
                                mcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (actionMasked == 1 && contains) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.J = false;
                        org.telegram.ui.Components.mc mcVar3 = this.K;
                        if (mcVar3 != null) {
                            mcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = evVar.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return true;
                }
            }
            boolean Y = Y(motionEvent);
            motionEvent.offsetLocation(rect.left, rect.top);
            return Y;
        } catch (Throwable th2) {
            motionEvent.offsetLocation(rect.left, rect.top);
            throw th2;
        }
    }

    public final void g0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.f28352b;
        ev evVar = this.f28351a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.f28354e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.f28354e = (Math.min(g0.L(evVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f28357r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f28358s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
                return;
            }
            this.f28358s = (Math.min(g0.L(evVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.f28357r;
            if (checkBoxBase != null) {
                checkBoxBase.f32833l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.f28357r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32824a = view;
            checkBoxBase2.f32833l = true;
        }
        T();
    }

    public final boolean n() {
        ev evVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.f28357r != null && this.H != null && (q1Var = (evVar = this.f28351a).E) != null && (l1Var = evVar.F) != null && l1Var.U(q1Var)) {
            return true;
        }
        return false;
    }

    public void p(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void q(Canvas canvas) {
        r(canvas, Integer.MIN_VALUE, 0.0f);
    }

    public final void r(Canvas canvas, int i7, float f10) {
        int i10;
        float f11;
        int i11;
        float N;
        float f12;
        canvas.save();
        Rect rect = this.f28352b;
        canvas.translate(rect.left, rect.top);
        ev evVar = this.f28351a;
        boolean I = evVar.I();
        TextPaint textPaint = evVar.f23790x;
        float L = (((evVar.C + evVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(bz.W0));
            if (evVar.E()) {
                i11 = org.telegram.ui.ActionBar.n6.Wc;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i11, evVar.D));
            canvas.save();
            int i12 = 0;
            if (!this.f28360x && !this.f28361y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.f28356n + L) - g0.N(0.5f);
                    f12 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f12 = this.f28356n;
                }
                canvas.drawCircle(N - f12, (this.f28354e + this.d.getLineBaseline(0)) - (g0.L(bz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (g0.L(0.0f) + L) - this.f28355f;
                if (this.f28357r != null) {
                    i12 = g0.L(26.0f);
                }
                canvas.translate(L2 + i12, this.f28354e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.f28356n) - this.f28355f, this.f28354e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f28357r != null) {
            if (I) {
                i10 = (int) (L + g0.L(6.0f));
            } else {
                i10 = -g0.L(26.0f);
            }
            this.I.set(i10 - g0.L(6.0f), this.f28358s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + i10, this.f28358s + g0.L(20.0f) + g0.L(6.0f));
            View view = evVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f28357r;
                if (checkBoxBase.f32824a == null) {
                    checkBoxBase.f32824a = view;
                }
            }
            org.telegram.ui.Components.mc mcVar = this.K;
            if (mcVar != null) {
                f11 = mcVar.a(0.1f);
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            canvas.scale(f11, f11, g0.L(10.0f) + i10, this.f28358s + g0.L(10.0f));
            this.f28357r.e(i10, (int) this.f28358s, g0.L(20.0f), g0.L(20.0f));
            this.f28357r.a(canvas);
            canvas.restore();
        }
        if (i7 == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i7, f10);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        dv dvVar;
        org.telegram.ui.Components.t5 t5Var;
        org.telegram.ui.Cells.t9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.t9 t9Var : L) {
            if ((t9Var instanceof dv) && (t5Var = (dvVar = (dv) t9Var).F) != null && !t5Var.f39906a.isEmpty()) {
                canvas.save();
                canvas.translate(dvVar.f23581c, dvVar.d - this.N);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23580b, dvVar.F, 0.0f, dvVar.f23588x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        int i7;
        xg0 xg0Var = this.L;
        if (xg0Var != null && xg0Var.h && xg0Var.d(this) >= 0) {
            if (xg0Var.i(this)) {
                float f10 = 0.0f;
                if (xg0Var.g(this)) {
                    if (xg0Var.g(this)) {
                        i7 = xg0Var.f53848e;
                    } else {
                        i7 = -1;
                    }
                    if (xg0Var.g(this)) {
                        f10 = xg0Var.f53849f;
                    }
                    r(canvas, i7, f10);
                    return;
                }
                float c10 = xg0Var.c(this);
                if (c10 <= 0.0f) {
                    return;
                }
                if (c10 < 1.0f) {
                    Rect rect = this.f28352b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f28353c + rect.right, I(), (int) (c10 * 255.0f));
                    q(canvas);
                    canvas.restoreToCount(saveLayerAlpha);
                    return;
                }
            } else {
                return;
            }
        }
        q(canvas);
    }

    public boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar;
        org.telegram.ui.Cells.t9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof dv) {
                    if (((dv) t9Var).o(characterStyle, qtVar)) {
                        Rect rect = this.f28352b;
                        qtVar.f26452e = rect.left - dvVar.f23583f;
                        qtVar.f26453f = i7 + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        if (J() >= K()) {
            return true;
        }
        return false;
    }

    public final void w(int i7, Rect rect) {
        int i10;
        CheckBoxBase checkBoxBase = this.f28357r;
        if (checkBoxBase != null && i7 == 0) {
            int i11 = this.f28352b.left;
            float f10 = this.N;
            rect.set(i11, (int) f10, this.f28353c + i11, (int) (f10 + I()));
        } else {
            if (checkBoxBase == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            A(i7 - i10, rect);
        }
        ev evVar = this.f28351a;
        int i12 = evVar.C + evVar.T;
        int min = Math.min(i12, Math.max(rect.left, -evVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i7) {
        int i10;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f28357r;
        if (checkBoxBase != null && i7 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f28360x && (staticLayout = this.d) != null) {
                charSequence = staticLayout.getText();
            } else {
                charSequence = null;
            }
            CharSequence y10 = y();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(y10)) {
                spannableStringBuilder.append(y10).append(", ");
            }
            k(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return gd.M0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return E(i7 - i10);
    }

    public CharSequence y() {
        String M0;
        int i7 = this.F;
        String str = null;
        if (i7 == 0) {
            M0 = null;
        } else {
            M0 = gd.M0(i7, null);
        }
        int i10 = this.G;
        if (i10 != 0) {
            str = gd.M0(i10, null);
        }
        if (TextUtils.isEmpty(M0)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return M0;
        }
        return TextUtils.concat(M0, ", ", str);
    }

    public float z() {
        return 1.0f;
    }

    public void T() {
    }

    public void V() {
    }

    public void W(Canvas canvas) {
    }

    public void k(SpannableStringBuilder spannableStringBuilder) {
    }
}
