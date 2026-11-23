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
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.xh;
import org.telegram.ui.i71;
public final class da extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final kr T = kr.h;
    public int E;
    public final org.telegram.ui.ActionBar.i6 F;
    public final boolean G;
    public final ArrayList H;
    public ValueAnimator I;
    public float J;
    public float K;
    public String L;
    public final ArrayList M;
    public float N;
    public float O;
    public float P;
    public String Q;
    public String R;
    public boolean S;
    public int f44175a;
    public final LinearLayout f44176b;
    public final z9 f44177c;
    public final n7 d;
    public final FrameLayout f44178e;
    public final TextView f44179f;
    public final org.telegram.ui.Cells.x3 h;
    public ValueAnimator f44180n;
    public r1.g f44181r;
    public r1.g f44182s;
    public boolean f44183w;
    public boolean f44184x;
    public boolean f44185y;

    public da(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        this.f44175a = i7;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = i6Var;
        this.G = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44176b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, c8.na.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44178e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.na.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        n7 n7Var = new n7(60, context, true);
        this.d = n7Var;
        n7Var.i();
        frameLayout.addView(n7Var, c8.na.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44179f = textView;
        int i10 = org.telegram.ui.ActionBar.n6.f29862z6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.na.e(-2, 60, 19));
        z9 z9Var = new z9(this, context);
        this.f44177c = z9Var;
        org.telegram.ui.ActionBar.u6.U(z9Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.D(z9Var, i10, i6Var);
        z9Var.setHint("0");
        z9Var.setTextSize(1, 44.0f);
        z9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        z9Var.setIncludeFontPadding(false);
        z9Var.setSingleLine(true);
        z9Var.setGravity(21);
        z9Var.setBackground(null);
        z9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        z9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        z9Var.setHorizontallyScrolling(true);
        z9Var.setCursorWidth(3.0f);
        z9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(z9Var, 30, i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(z9Var, 36, i7, i6Var);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.3f, i7);
        org.telegram.ui.ActionBar.u6.n(z9Var, 3, K.f30010a, -1, 2, K.d, i6Var);
        z9Var.setAllowDrawCursor(true);
        z9Var.setInputType(8194);
        z9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        z9Var.setImeOptions(33554438);
        linearLayout.addView(z9Var, c8.na.r(-2, 60, 16));
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, false, true, false, true, true);
        this.h = x3Var;
        x3Var.f37682c.m(0.35f, 420L, 3.5f, kr.h);
        x3Var.setScaleProperty(0.2f);
        x3Var.setAllowCancel(true);
        x3Var.getDrawable().f37397c0 = new m(x3Var, 13);
        x3Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(this.f44175a, i6Var));
        x3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        x3Var.setGravity(3);
        x3Var.getDrawable().T = false;
        x3Var.c(gd.N0(2131749340, null), false, true);
        linearLayout.addView(x3Var, c8.na.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new p3(this, 7));
        z9Var.addTextChangedListener(new xh(this, 1));
    }

    public final void a(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        ValueAnimator valueAnimator = this.f44180n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44180n.cancel();
            this.f44180n = null;
        }
        r1.g gVar = this.f44181r;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = this.f44182s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.f44178e;
        int i10 = 0;
        TextView textView = this.f44179f;
        float f15 = 1.0f;
        n7 n7Var = this.d;
        if (!z10) {
            if (this.f44184x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            n7Var.setAlpha(f14);
            if (!this.f44185y) {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            n7Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            n7Var.setEnabled(!this.f44184x);
            if (this.f44184x) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            n7Var.setVisibility(i7);
            if (!this.f44185y) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i11 = frameLayout.getLayoutParams().width;
        float alpha = n7Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f44184x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (this.f44185y) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (alpha > 0.0f || f10 > 0.0f) {
            n7Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        n7Var.setEnabled(!this.f44184x);
        if (this.f44184x) {
            f12 = 24.0f;
        } else {
            f12 = -24.0f;
        }
        if (n7Var.getAlpha() < 0.01f) {
            n7Var.setConversionWobble(f12);
        }
        r1.g gVar3 = new r1.g(new r1.f(n7Var.getConversionWobble()));
        r1.h hVar = new r1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.f56446m = hVar;
        gVar3.f(0.1f);
        gVar3.f56436a = (-f12) * 10.0f;
        gVar3.b(new z3(this, 3));
        gVar3.h();
        this.f44182s = gVar3;
        if (this.f44184x) {
            f13 = 18.0f;
        } else {
            f13 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        r1.g gVar4 = new r1.g(textView, r1.g.f56433s);
        r1.h hVar2 = new r1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.f56446m = hVar2;
        gVar4.f56436a = (-f13) * 10.0f;
        gVar4.h();
        this.f44181r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44180n = ofFloat;
        ofFloat.setDuration(320L);
        this.f44180n.setInterpolator(new LinearInterpolator());
        this.f44180n.addUpdateListener(new y9(this, alpha, f10, alpha2, f11, i11, 0));
        this.f44180n.addListener(new i71(this, 12));
        this.f44180n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
            this.J = 1.0f;
            c();
        }
    }

    public final void c() {
        int L;
        CharSequence charSequence;
        z9 z9Var = this.f44177c;
        Editable text = z9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(z9Var.getHint(), charSequence)) {
                z9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                break;
            }
            aa aaVar = (aa) arrayList.get(i7);
            aaVar.d = f10;
            f10 += aaVar.a();
            if (text.getSpanStart(aaVar) >= 0) {
                text.setSpan(aaVar, text.getSpanStart(aaVar), text.getSpanEnd(aaVar), 33);
            }
            i7++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = z9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            z9Var.setMinWidth(Math.max(L2, z9Var.getPaddingRight() + z9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        } else {
            if (z10 && text.length() > 0) {
                L = org.telegram.messenger.g0.L(3.0f) + z9Var.getPaddingRight() + z9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.g0.L(24.0f);
            }
            z9Var.setMinWidth(L);
        }
        z9Var.requestLayout();
        z9Var.invalidate();
    }

    public final void d(v0 v0Var, boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        TL_wallet.currencyRate currencyrate;
        int i7;
        int i10;
        boolean z15;
        int L;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i11;
        int i12;
        int i13;
        g gVar = v0Var.h;
        if (this.f44183w && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.G;
        z9 z9Var = this.f44177c;
        org.telegram.ui.Cells.x3 x3Var = this.h;
        TextView textView = this.f44179f;
        if (z16) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.n6.cm;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Fi;
            }
            this.f44175a = i11;
            org.telegram.ui.ActionBar.i6 i6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            if (z10) {
                i12 = org.telegram.ui.ActionBar.n6.cm;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.Fi;
            }
            org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var);
            x3Var.f37682c.v(w02, z11);
            x3Var.invalidate();
            org.telegram.ui.ActionBar.u6.v(z9Var, this.f44175a, i6Var);
            org.telegram.ui.ActionBar.u6.l(z9Var, 36, this.f44175a, i6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.n6.cm;
            } else {
                i13 = org.telegram.ui.ActionBar.n6.Fi;
            }
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.3f, i13);
            org.telegram.ui.ActionBar.u6.n(z9Var, 3, K.f30010a, -1, 2, K.d, i6Var);
        }
        TL_wallet.currencyRate j3 = gVar.j();
        String g10 = gVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        if (j3 != null && !TextUtils.isEmpty(j3.symbol)) {
            str = j3.symbol;
        } else if (equals) {
            str = "$";
        } else {
            str = g10;
        }
        if (z10 && (j3 == null ? equals : j3.symbolLeft)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j3 != null && j3.spaceBetween) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f44184x == z10 && this.f44185y == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z12) {
            textView.setText(str);
            currencyrate = j3;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str));
            textView.requestLayout();
        } else {
            currencyrate = j3;
        }
        this.f44184x = z10;
        this.f44185y = z12;
        if (!z10) {
            i7 = org.telegram.messenger.g0.L(59.0f);
        } else if (z12) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z13) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i10 = 0;
            }
            i7 = ceil + i10;
        } else {
            i7 = 0;
        }
        this.E = i7;
        if (z14 || !this.f44183w) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f44183w = true;
        if (!z10) {
            g10 = gd.N0(2131749340, null);
        } else if (!z12) {
            g10 = str;
        }
        x3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) x3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        layoutParams.leftMargin = L;
        x3Var.setLayoutParams(layoutParams);
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
        if (TextUtils.equals(this.Q, str2) && TextUtils.equals(this.R, str3)) {
            return;
        }
        b();
        this.Q = str2;
        this.R = str3;
        f(z9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        int right;
        boolean z11;
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.f44176b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.f44178e;
        n7 n7Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - n7Var.getLeft()) - (n7Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(m10.y(n7Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - n7Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.x3 x3Var = this.h;
        int visibility = x3Var.getVisibility();
        z9 z9Var = this.f44177c;
        if (visibility == 8) {
            right = z9Var.getRight();
        } else {
            right = x3Var.getRight();
        }
        float left = (1.0f - f11) * (width - ((z9Var.getLeft() + right) / 2.0f));
        z9Var.setTranslationX(left);
        x3Var.setTranslationX(left);
        z9Var.setAlpha(f11);
        x3Var.setAlpha(f11);
        if (z10 && !this.f44184x) {
            z11 = true;
        } else {
            z11 = false;
        }
        n7Var.setEnabled(z11);
        n7Var.setIntroProgress(f10);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.da.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.n6 getCurrencyView() {
        return this.h;
    }

    public n7 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f44177c;
    }

    @Override
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        z9 z9Var = this.f44177c;
        int baseline = z9Var.getBaseline() + z9Var.getTop();
        TextView textView = this.f44179f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.f44178e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.x3 x3Var = this.h;
        x3Var.setTranslationY((baseline - x3Var.getTop()) - x3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f44176b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.S = true;
        try {
            this.f44177c.setText(str);
        } finally {
            this.S = false;
        }
    }

    public void setScaleProperty(float f10) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f10));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.x3 x3Var;
        z9 z9Var = this.f44177c;
        if (z9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.n6.w0(this.f44175a, this.F);
                z9Var.setCursorColor(w02);
                z9Var.setHandlesColor(w02);
                if (this.G && (x3Var = this.h) != null) {
                    x3Var.f37682c.v(w02, false);
                    x3Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
