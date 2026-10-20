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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.mk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;
public final class h9 extends FrameLayout {
    public static final bs R = bs.h;
    public final boolean E;
    public final ArrayList F;
    public ValueAnimator G;
    public float H;
    public float I;
    public String J;
    public final ArrayList K;
    public float L;
    public float M;
    public float N;
    public String O;
    public String P;
    public boolean Q;
    public final LinearLayout f34292a;
    public final d9 f34293b;
    public final m6 f34294c;
    public final FrameLayout d;
    public final TextView e;
    public final org.telegram.ui.Cells.t3 f34295f;
    public ValueAnimator h;
    public o1.k f34296n;
    public o1.k f34297r;
    public boolean f34298s;
    public boolean v;
    public boolean f34299w;
    public int f34300x;
    public final org.telegram.ui.ActionBar.d6 f34301y;

    public h9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.f34301y = d6Var;
        this.E = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34292a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.z5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.z5.q(59, 60, 16));
        this.f34300x = AndroidUtilities.dp(59.0f);
        m6 m6Var = new m6(60, context, true);
        this.f34294c = m6Var;
        m6Var.i();
        frameLayout.addView(m6Var, w7.z5.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.h6.f21395z6;
        mk.o(i10, d6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.z5.e(-2, 60, 19));
        d9 d9Var = new d9(this, context);
        this.f34293b = d9Var;
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        d9Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        d9Var.setHint("0");
        d9Var.setTextSize(1, 44.0f);
        d9Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        d9Var.setIncludeFontPadding(false);
        d9Var.setSingleLine(true);
        d9Var.setGravity(21);
        d9Var.setBackground(null);
        d9Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        d9Var.setMinWidth(AndroidUtilities.dp(24.0f));
        d9Var.setHorizontallyScrolling(true);
        d9Var.setCursorWidth(3.0f);
        d9Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        d9Var.setCursorColor(w02);
        d9Var.setHandlesColor(w02);
        d9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
        d9Var.setAllowDrawCursor(true);
        d9Var.setInputType(8194);
        d9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        d9Var.setImeOptions(33554438);
        linearLayout.addView(d9Var, w7.z5.q(-2, 60, 16));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, false, true, false, true, true);
        this.f34295f = t3Var;
        t3Var.f29479c.m(0.35f, 420L, 3.5f, bs.h);
        t3Var.setScaleProperty(0.2f);
        t3Var.setAllowCancel(true);
        t3Var.getDrawable().f29226b0 = new n(t3Var, 13);
        t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        t3Var.setTextSize(AndroidUtilities.dp(28.0f));
        t3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        t3Var.setGravity(3);
        t3Var.getDrawable().S = false;
        t3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(t3Var, w7.z5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new t2(this, 7));
        d9Var.addTextChangedListener(new bi(this, 1));
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        o1.k kVar = this.f34296n;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.f34297r;
        if (kVar2 != null) {
            kVar2.c();
        }
        FrameLayout frameLayout = this.d;
        int i11 = 0;
        TextView textView = this.e;
        float f14 = 1.0f;
        m6 m6Var = this.f34294c;
        if (!z10) {
            if (this.v) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            m6Var.setAlpha(f13);
            if (!this.f34299w) {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            m6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            m6Var.setEnabled(!this.v);
            if (this.v) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            m6Var.setVisibility(i10);
            if (!this.f34299w) {
                i11 = 4;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f34300x;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = m6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.v) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (this.f34299w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            m6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        m6Var.setEnabled(!this.v);
        if (this.v) {
            f11 = 24.0f;
        } else {
            f11 = -24.0f;
        }
        if (m6Var.getAlpha() < 0.01f) {
            m6Var.setConversionWobble(f11);
        }
        o1.k kVar3 = new o1.k(new o1.j(m6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.f17559u = lVar;
        kVar3.e(0.1f);
        kVar3.f17549a = (-f11) * 10.0f;
        kVar3.b(new a3(this, 3));
        kVar3.h();
        this.f34297r = kVar3;
        if (this.v) {
            f12 = 18.0f;
        } else {
            f12 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.k kVar4 = new o1.k(textView, o1.h.f17545q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.f17559u = lVar2;
        kVar4.f17549a = (-f12) * 10.0f;
        kVar4.h();
        this.f34296n = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(320L);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.addUpdateListener(new c9(this, alpha, f7, alpha2, f10, i12, 0));
        this.h.addListener(new tf1(this, 9));
        this.h.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
            this.H = 1.0f;
            c();
        }
    }

    public final void c() {
        int dp;
        CharSequence charSequence;
        d9 d9Var = this.f34293b;
        Editable text = d9Var.getText();
        boolean z10 = this.E;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(d9Var.getHint(), charSequence)) {
                d9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            e9 e9Var = (e9) arrayList.get(i10);
            e9Var.d = f7;
            f7 += e9Var.a();
            if (text.getSpanStart(e9Var) >= 0) {
                text.setSpan(e9Var, text.getSpanStart(e9Var), text.getSpanEnd(e9Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.H < 1.0f) {
            float measureText = d9Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            d9Var.setMinWidth(Math.max(dp2, d9Var.getPaddingRight() + d9Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                dp = AndroidUtilities.dp(3.0f) + d9Var.getPaddingRight() + d9Var.getPaddingLeft();
            } else {
                dp = AndroidUtilities.dp(24.0f);
            }
            d9Var.setMinWidth(dp);
        }
        d9Var.requestLayout();
        d9Var.invalidate();
    }

    public final void d(m0 m0Var, boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        TL_wallet.currencyRate currencyrate;
        int i10;
        int i11;
        boolean z15;
        int dp;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i12;
        f fVar = m0Var.h;
        if (this.f34298s && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.E;
        d9 d9Var = this.f34293b;
        org.telegram.ui.Cells.t3 t3Var = this.f34295f;
        TextView textView = this.e;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.h6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.Oh;
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, this.f34301y);
            textView.setTextColor(w02);
            t3Var.f29479c.v(w02, z11);
            t3Var.invalidate();
            d9Var.setCursorColor(w02);
            d9Var.setHandlesColor(w02);
            d9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
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
        if (this.v == z10 && this.f34299w == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.v = z10;
        this.f34299w = z12;
        if (!z10) {
            i10 = AndroidUtilities.dp(59.0f);
        } else if (z12) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z13) {
                i11 = AndroidUtilities.dp(8.0f);
            } else {
                i11 = 0;
            }
            i10 = ceil + i11;
        } else {
            i10 = 0;
        }
        this.f34300x = i10;
        if (z14 || !this.f34298s) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f34298s = true;
        if (!z10) {
            g10 = LocaleController.getString(R.string.GramCurrency);
        } else if (!z12) {
            g10 = str;
        }
        t3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        layoutParams.leftMargin = dp;
        t3Var.setLayoutParams(layoutParams);
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
        if (TextUtils.equals(this.O, str2) && TextUtils.equals(this.P, str3)) {
            return;
        }
        b();
        this.O = str2;
        this.P = str3;
        f(d9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f34292a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        m6 m6Var = this.f34294c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - m6Var.getLeft()) - (m6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(mk.z(m6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - m6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.t3 t3Var = this.f34295f;
        int visibility = t3Var.getVisibility();
        d9 d9Var = this.f34293b;
        if (visibility == 8) {
            right = d9Var.getRight();
        } else {
            right = t3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((d9Var.getLeft() + right) / 2.0f));
        d9Var.setTranslationX(left);
        t3Var.setTranslationX(left);
        d9Var.setAlpha(f10);
        t3Var.setAlpha(f10);
        if (z10 && !this.v) {
            z11 = true;
        } else {
            z11 = false;
        }
        m6Var.setEnabled(z11);
        m6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.q6 getCurrencyView() {
        return this.f34295f;
    }

    public m6 getDiamondView() {
        return this.f34294c;
    }

    public EditTextBoldCursor getEditText() {
        return this.f34293b;
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
        d9 d9Var = this.f34293b;
        int baseline = d9Var.getBaseline() + d9Var.getTop();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.d.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.t3 t3Var = this.f34295f;
        t3Var.setTranslationY((baseline - t3Var.getTop()) - t3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f34292a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.Q = true;
        try {
            this.f34293b.setText(str);
        } finally {
            this.Q = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.N = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }
}
