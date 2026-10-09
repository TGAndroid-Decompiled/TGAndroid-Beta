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
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hs;
public final class i8 extends FrameLayout {
    public static final hs R = hs.h;
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
    public final LinearLayout f35046a;
    public final e8 f35047b;
    public final c6 f35048c;
    public final FrameLayout d;
    public final TextView f35049e;
    public final org.telegram.ui.Cells.u3 f35050f;
    public ValueAnimator h;
    public o1.k f35051n;
    public o1.k f35052r;
    public boolean f35053s;
    public boolean v;
    public boolean f35054w;
    public int f35055x;
    public final org.telegram.ui.ActionBar.e6 f35056y;

    public i8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.f35056y = e6Var;
        this.E = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35046a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.x5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.x5.q(59, 60, 16));
        this.f35055x = AndroidUtilities.dp(59.0f);
        c6 c6Var = new c6(60, context, true);
        this.f35048c = c6Var;
        c6Var.i();
        frameLayout.addView(c6Var, w7.x5.a(60.0f, 0.0f, -5.0f, -2.0f, 0.0f, 60, 19));
        TextView textView = new TextView(context);
        this.f35049e = textView;
        int i10 = org.telegram.ui.ActionBar.i6.f21199z6;
        bi.o(i10, e6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.x5.e(-2, 60, 19));
        e8 e8Var = new e8(this, context);
        this.f35047b = e8Var;
        e8Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        e8Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        e8Var.setHint("0");
        e8Var.setTextSize(1, 44.0f);
        e8Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        e8Var.setIncludeFontPadding(false);
        e8Var.setSingleLine(true);
        e8Var.setGravity(21);
        e8Var.setBackground(null);
        e8Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        e8Var.setMinWidth(AndroidUtilities.dp(24.0f));
        e8Var.setHorizontallyScrolling(true);
        e8Var.setCursorWidth(3.0f);
        e8Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        e8Var.setCursorColor(w02);
        e8Var.setHandlesColor(w02);
        e8Var.setHighlightColor(org.telegram.ui.ActionBar.i6.m1(0.3f, w02));
        e8Var.setAllowDrawCursor(true);
        e8Var.setInputType(8194);
        e8Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        e8Var.setImeOptions(33554438);
        linearLayout.addView(e8Var, w7.x5.q(-2, 60, 16));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, false, true, false, true, true);
        this.f35050f = u3Var;
        u3Var.f30364c.m(0.35f, 420L, 3.5f, hs.h);
        u3Var.setScaleProperty(0.2f);
        u3Var.setAllowCancel(true);
        u3Var.getDrawable().f30066b0 = new m(u3Var, 13);
        u3Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        u3Var.setTextSize(AndroidUtilities.dp(28.0f));
        u3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        u3Var.setGravity(3);
        u3Var.getDrawable().S = false;
        u3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(u3Var, w7.x5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new j3(this, 5));
        e8Var.addTextChangedListener(new fi(this, 1));
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        o1.k kVar = this.f35051n;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.f35052r;
        if (kVar2 != null) {
            kVar2.c();
        }
        int i11 = 4;
        FrameLayout frameLayout = this.d;
        TextView textView = this.f35049e;
        float f13 = 1.0f;
        c6 c6Var = this.f35048c;
        if (!z10) {
            if (this.v) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            c6Var.setAlpha(f12);
            if (!this.f35054w) {
                f13 = 0.0f;
            }
            textView.setAlpha(f13);
            c6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            c6Var.setEnabled(!this.v);
            if (this.v) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            c6Var.setVisibility(i10);
            if (this.f35054w) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f35055x;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = c6Var.getAlpha();
        float f14 = 1.0f;
        float alpha2 = textView.getAlpha();
        if (this.v) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!this.f35054w) {
            f14 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            c6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f14 > 0.0f) {
            textView.setVisibility(0);
        }
        c6Var.setEnabled(!this.v);
        if (this.v) {
            f10 = 24.0f;
        } else {
            f10 = -24.0f;
        }
        if (c6Var.getAlpha() < 0.01f) {
            c6Var.setConversionWobble(f10);
        }
        o1.k kVar3 = new o1.k(new o1.j(c6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.f16938u = lVar;
        kVar3.e(0.1f);
        kVar3.f16927a = (-f10) * 10.0f;
        kVar3.b(new r2(this, 2));
        kVar3.h();
        this.f35052r = kVar3;
        if (this.v) {
            f11 = 18.0f;
        } else {
            f11 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f11);
        }
        o1.k kVar4 = new o1.k(textView, o1.h.f16923q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.f16938u = lVar2;
        kVar4.f16927a = (-f11) * 10.0f;
        kVar4.h();
        this.f35051n = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(320L);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.addUpdateListener(new d8(this, alpha, f7, alpha2, f14, i12, 0));
        this.h.addListener(new x4(this, 4));
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
        e8 e8Var = this.f35047b;
        Editable text = e8Var.getText();
        boolean z10 = this.E;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(e8Var.getHint(), charSequence)) {
                e8Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            f8 f8Var = (f8) arrayList.get(i10);
            f8Var.d = f7;
            f7 += f8Var.a();
            if (text.getSpanStart(f8Var) >= 0) {
                text.setSpan(f8Var, text.getSpanStart(f8Var), text.getSpanEnd(f8Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.H < 1.0f) {
            float measureText = e8Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            e8Var.setMinWidth(Math.max(dp2, e8Var.getPaddingRight() + e8Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                dp = AndroidUtilities.dp(3.0f) + e8Var.getPaddingRight() + e8Var.getPaddingLeft();
            } else {
                dp = AndroidUtilities.dp(24.0f);
            }
            e8Var.setMinWidth(dp);
        }
        e8Var.requestLayout();
        e8Var.invalidate();
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
        int dp;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i12;
        f fVar = k0Var.h;
        if (this.f35053s && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.E;
        e8 e8Var = this.f35047b;
        org.telegram.ui.Cells.u3 u3Var = this.f35050f;
        TextView textView = this.f35049e;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.i6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.i6.Oh;
            }
            int w02 = org.telegram.ui.ActionBar.i6.w0(i12, this.f35056y);
            textView.setTextColor(w02);
            u3Var.f30364c.v(w02, z11);
            u3Var.invalidate();
            e8Var.setCursorColor(w02);
            e8Var.setHandlesColor(w02);
            e8Var.setHighlightColor(org.telegram.ui.ActionBar.i6.m1(0.3f, w02));
        }
        TL_wallet.currencyRate j3 = fVar.j();
        String g10 = fVar.g();
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
        if (this.v == z10 && this.f35054w == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.v = z10;
        this.f35054w = z12;
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
        this.f35055x = i10;
        if (z14 || !this.f35053s) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f35053s = true;
        if (!z10) {
            g10 = LocaleController.getString(R.string.GramCurrency);
        } else if (!z12) {
            g10 = str;
        }
        u3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        layoutParams.leftMargin = dp;
        u3Var.setLayoutParams(layoutParams);
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
        f(e8Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f35046a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        c6 c6Var = this.f35048c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - c6Var.getLeft()) - (c6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(bi.y(c6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - c6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.u3 u3Var = this.f35050f;
        int visibility = u3Var.getVisibility();
        e8 e8Var = this.f35047b;
        if (visibility == 8) {
            right = e8Var.getRight();
        } else {
            right = u3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((e8Var.getLeft() + right) / 2.0f));
        e8Var.setTranslationX(left);
        u3Var.setTranslationX(left);
        e8Var.setAlpha(f10);
        u3Var.setAlpha(f10);
        if (z10 && !this.v) {
            z11 = true;
        } else {
            z11 = false;
        }
        c6Var.setEnabled(z11);
        c6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i8.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.r6 getCurrencyView() {
        return this.f35050f;
    }

    public c6 getDiamondView() {
        return this.f35048c;
    }

    public EditTextBoldCursor getEditText() {
        return this.f35047b;
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
        e8 e8Var = this.f35047b;
        int baseline = e8Var.getBaseline() + e8Var.getTop();
        TextView textView = this.f35049e;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.d.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.u3 u3Var = this.f35050f;
        u3Var.setTranslationY((baseline - u3Var.getTop()) - u3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f35046a;
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
            this.f35047b.setText(str);
        } finally {
            this.Q = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.N = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }
}
