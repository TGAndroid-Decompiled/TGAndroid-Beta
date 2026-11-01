package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ms0;
public final class q9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final gr S = gr.h;
    public int D;
    public final org.telegram.ui.ActionBar.p6 E;
    public final boolean F;
    public final ArrayList G;
    public ValueAnimator H;
    public float I;
    public float J;
    public String K;
    public final ArrayList L;
    public float M;
    public float N;
    public float O;
    public String P;
    public String Q;
    public boolean R;
    public int f35092a;
    public final LinearLayout f35093b;
    public final m9 f35094c;
    public final a7 d;
    public final FrameLayout e;
    public final TextView f35095f;
    public final org.telegram.ui.Cells.y3 h;
    public ValueAnimator f35096n;
    public o1.j f35097r;
    public o1.j f35098s;
    public boolean f35099w;
    public boolean f35100x;
    public boolean f35101y;

    public q9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        this.f35092a = i10;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = p6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35093b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.b6.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.i0.L(1.0f));
        linearLayout.addView(frameLayout, w7.b6.r(59, 60, 16));
        this.D = org.telegram.messenger.i0.L(59.0f);
        a7 a7Var = new a7(60, context, true);
        this.d = a7Var;
        a7Var.i();
        frameLayout.addView(a7Var, w7.b6.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f35095f = textView;
        int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.b6.e(-2, 60, 19));
        m9 m9Var = new m9(this, context);
        this.f35094c = m9Var;
        org.telegram.ui.ActionBar.a7.V(m9Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.E(m9Var, i11, p6Var);
        m9Var.setHint("0");
        m9Var.setTextSize(1, 44.0f);
        m9Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        m9Var.setIncludeFontPadding(false);
        m9Var.setSingleLine(true);
        m9Var.setGravity(21);
        m9Var.setBackground(null);
        m9Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        m9Var.setMinWidth(org.telegram.messenger.i0.L(24.0f));
        m9Var.setHorizontallyScrolling(true);
        m9Var.setCursorWidth(3.0f);
        m9Var.setCursorSize(org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.m(m9Var, 30, i10, p6Var);
        org.telegram.ui.ActionBar.a7.m(m9Var, 36, i10, p6Var);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.3f, i10);
        org.telegram.ui.ActionBar.a7.o(m9Var, 3, L.f21453a, -1, 2, L.d, p6Var);
        m9Var.setAllowDrawCursor(true);
        m9Var.setInputType(8194);
        m9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        m9Var.setImeOptions(33554438);
        linearLayout.addView(m9Var, w7.b6.r(-2, 60, 16));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, false, true, false, true, true);
        this.h = y3Var;
        y3Var.f26082c.m(0.35f, 420L, 3.5f, gr.h);
        y3Var.setScaleProperty(0.2f);
        y3Var.setAllowCancel(true);
        y3Var.getDrawable().f25745b0 = new l(y3Var, 13);
        y3Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(this.f35092a, p6Var));
        y3Var.setTextSize(org.telegram.messenger.i0.L(28.0f));
        y3Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        y3Var.setGravity(3);
        y3Var.getDrawable().S = false;
        y3Var.c(dd.L0(2131749525, null), false, true);
        linearLayout.addView(y3Var, w7.b6.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new j3(this, 7));
        m9Var.addTextChangedListener(new eh(this, 1));
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        ValueAnimator valueAnimator = this.f35096n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35096n.cancel();
            this.f35096n = null;
        }
        o1.j jVar = this.f35097r;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = this.f35098s;
        if (jVar2 != null) {
            jVar2.d();
        }
        FrameLayout frameLayout = this.e;
        int i11 = 0;
        TextView textView = this.f35095f;
        float f14 = 1.0f;
        a7 a7Var = this.d;
        if (!z10) {
            if (this.f35100x) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            a7Var.setAlpha(f13);
            if (!this.f35101y) {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            a7Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            a7Var.setEnabled(!this.f35100x);
            if (this.f35100x) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            a7Var.setVisibility(i10);
            if (!this.f35101y) {
                i11 = 4;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.D;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = a7Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f35100x) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (this.f35101y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            a7Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        a7Var.setEnabled(!this.f35100x);
        if (this.f35100x) {
            f11 = 24.0f;
        } else {
            f11 = -24.0f;
        }
        if (a7Var.getAlpha() < 0.01f) {
            a7Var.setConversionWobble(f11);
        }
        o1.j jVar3 = new o1.j(new o1.i(a7Var.getConversionWobble()));
        o1.k kVar = new o1.k(0.0f);
        kVar.a(0.3f);
        kVar.b(180.0f);
        jVar3.f13958m = kVar;
        jVar3.f(0.1f);
        jVar3.f13949a = (-f11) * 10.0f;
        jVar3.b(new q3(this, 3));
        jVar3.h();
        this.f35098s = jVar3;
        if (this.f35100x) {
            f12 = 18.0f;
        } else {
            f12 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.j jVar4 = new o1.j(textView, o1.j.f13946s);
        o1.k kVar2 = new o1.k(0.0f);
        kVar2.a(0.3f);
        kVar2.b(180.0f);
        jVar4.f13958m = kVar2;
        jVar4.f13949a = (-f12) * 10.0f;
        jVar4.h();
        this.f35097r = jVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35096n = ofFloat;
        ofFloat.setDuration(320L);
        this.f35096n.setInterpolator(new LinearInterpolator());
        this.f35096n.addUpdateListener(new oh.k(this, alpha, f7, alpha2, f10, i12, 1));
        this.f35096n.addListener(new ms0(this, 22));
        this.f35096n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
            this.I = 1.0f;
            c();
        }
    }

    public final void c() {
        int L;
        CharSequence charSequence;
        m9 m9Var = this.f35094c;
        Editable text = m9Var.getText();
        boolean z10 = this.F;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(m9Var.getHint(), charSequence)) {
                m9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                break;
            }
            n9 n9Var = (n9) arrayList.get(i10);
            n9Var.d = f7;
            f7 += n9Var.a();
            if (text.getSpanStart(n9Var) >= 0) {
                text.setSpan(n9Var, text.getSpanStart(n9Var), text.getSpanEnd(n9Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.I < 1.0f) {
            float measureText = m9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.i0.L(24.0f);
            float f10 = this.M;
            m9Var.setMinWidth(Math.max(L2, m9Var.getPaddingRight() + m9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                L = org.telegram.messenger.i0.L(3.0f) + m9Var.getPaddingRight() + m9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.i0.L(24.0f);
            }
            m9Var.setMinWidth(L);
        }
        m9Var.requestLayout();
        m9Var.invalidate();
    }

    public final void d(k0 k0Var, boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        TL_wallet.currencyRate currencyrate;
        int i10;
        int i11;
        boolean z15;
        int L;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i12;
        int i13;
        int i14;
        f fVar = k0Var.h;
        if (this.f35099w && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.F;
        m9 m9Var = this.f35094c;
        org.telegram.ui.Cells.y3 y3Var = this.h;
        TextView textView = this.f35095f;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.t6.Zl;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Ci;
            }
            this.f35092a = i12;
            org.telegram.ui.ActionBar.p6 p6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.t6.Zl;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.Ci;
            }
            org.telegram.ui.ActionBar.a7.V(textView, i13, p6Var);
            y3Var.f26082c.v(w02, z11);
            y3Var.invalidate();
            org.telegram.ui.ActionBar.a7.w(m9Var, this.f35092a, p6Var);
            org.telegram.ui.ActionBar.a7.m(m9Var, 36, this.f35092a, p6Var);
            if (z10) {
                i14 = org.telegram.ui.ActionBar.t6.Zl;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.Ci;
            }
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.3f, i14);
            org.telegram.ui.ActionBar.a7.o(m9Var, 3, L2.f21453a, -1, 2, L2.d, p6Var);
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        if (j10 != null && !TextUtils.isEmpty(j10.symbol)) {
            str = j10.symbol;
        } else if (equals) {
            str = "$";
        } else {
            str = g10;
        }
        if (z10 && (j10 == null ? equals : j10.symbolLeft)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j10 != null && j10.spaceBetween) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f35100x == z10 && this.f35101y == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z12) {
            textView.setText(str);
            currencyrate = j10;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str));
            textView.requestLayout();
        } else {
            currencyrate = j10;
        }
        this.f35100x = z10;
        this.f35101y = z12;
        if (!z10) {
            i10 = org.telegram.messenger.i0.L(59.0f);
        } else if (z12) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z13) {
                i11 = org.telegram.messenger.i0.L(8.0f);
            } else {
                i11 = 0;
            }
            i10 = ceil + i11;
        } else {
            i10 = 0;
        }
        this.D = i10;
        if (z14 || !this.f35099w) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f35099w = true;
        if (!z10) {
            g10 = dd.L0(2131749525, null);
        } else if (!z12) {
            g10 = str;
        }
        y3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(4.0f);
        }
        layoutParams.leftMargin = L;
        y3Var.setLayoutParams(layoutParams);
        if (z10 && currencyrate != null) {
            currencyrate2 = currencyrate;
            str2 = currencyrate2.thousandsSeparator;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            currencyrate2 = currencyrate;
            str2 = ",";
        }
        if (z10 && currencyrate2 != null && !TextUtils.isEmpty(currencyrate2.decimalSeparator)) {
            str3 = currencyrate2.decimalSeparator;
        } else {
            str3 = ".";
        }
        if (TextUtils.equals(this.P, str2) && TextUtils.equals(this.Q, str3)) {
            return;
        }
        b();
        this.P = str2;
        this.Q = str3;
        f(m9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f35093b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        a7 a7Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - a7Var.getLeft()) - (a7Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(a30.x(a7Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - a7Var.getTop(), f11) - (org.telegram.messenger.i0.L(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.y3 y3Var = this.h;
        int visibility = y3Var.getVisibility();
        m9 m9Var = this.f35094c;
        if (visibility == 8) {
            right = m9Var.getRight();
        } else {
            right = y3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((m9Var.getLeft() + right) / 2.0f));
        m9Var.setTranslationX(left);
        y3Var.setTranslationX(left);
        m9Var.setAlpha(f10);
        y3Var.setAlpha(f10);
        if (z10 && !this.f35100x) {
            z11 = true;
        } else {
            z11 = false;
        }
        a7Var.setEnabled(z11);
        a7Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.f6 getCurrencyView() {
        return this.h;
    }

    public a7 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f35094c;
    }

    @Override
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m9 m9Var = this.f35094c;
        int baseline = m9Var.getBaseline() + m9Var.getTop();
        TextView textView = this.f35095f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.y3 y3Var = this.h;
        y3Var.setTranslationY((baseline - y3Var.getTop()) - y3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f35093b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.R = true;
        try {
            this.f35094c.setText(str);
        } finally {
            this.R = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.O = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y3 y3Var;
        m9 m9Var = this.f35094c;
        if (m9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(this.f35092a, this.E);
                m9Var.setCursorColor(w02);
                m9Var.setHandlesColor(w02);
                if (this.F && (y3Var = this.h) != null) {
                    y3Var.f26082c.v(w02, false);
                    y3Var.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
