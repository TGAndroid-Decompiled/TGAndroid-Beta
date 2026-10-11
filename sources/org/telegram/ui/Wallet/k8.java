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
import org.telegram.messenger.ai;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.is;
public final class k8 extends FrameLayout {
    public static final is R = is.h;
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
    public final LinearLayout f35172a;
    public final g8 f35173b;
    public final e6 f35174c;
    public final FrameLayout d;
    public final TextView f35175e;
    public final org.telegram.ui.Cells.u3 f35176f;
    public ValueAnimator h;
    public o1.k f35177n;
    public o1.k f35178r;
    public boolean f35179s;
    public boolean v;
    public boolean f35180w;
    public int f35181x;
    public final org.telegram.ui.ActionBar.d6 f35182y;

    public k8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.f35182y = d6Var;
        this.E = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35172a = linearLayout;
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
        this.f35181x = AndroidUtilities.dp(59.0f);
        e6 e6Var = new e6(60, context, true);
        this.f35174c = e6Var;
        e6Var.i();
        frameLayout.addView(e6Var, w7.x5.a(60.0f, 0.0f, -5.0f, -2.0f, 0.0f, 60, 19));
        TextView textView = new TextView(context);
        this.f35175e = textView;
        int i10 = org.telegram.ui.ActionBar.h6.f21189z6;
        ai.o(i10, d6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.x5.e(-2, 60, 19));
        g8 g8Var = new g8(this, context);
        this.f35173b = g8Var;
        g8Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        g8Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        g8Var.setHint("0");
        g8Var.setTextSize(1, 44.0f);
        g8Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        g8Var.setIncludeFontPadding(false);
        g8Var.setSingleLine(true);
        g8Var.setGravity(21);
        g8Var.setBackground(null);
        g8Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        g8Var.setMinWidth(AndroidUtilities.dp(24.0f));
        g8Var.setHorizontallyScrolling(true);
        g8Var.setCursorWidth(3.0f);
        g8Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        g8Var.setCursorColor(w02);
        g8Var.setHandlesColor(w02);
        g8Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
        g8Var.setAllowDrawCursor(true);
        g8Var.setInputType(8194);
        g8Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        g8Var.setImeOptions(33554438);
        linearLayout.addView(g8Var, w7.x5.q(-2, 60, 16));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, false, true, false, true, true);
        this.f35176f = u3Var;
        u3Var.f30346c.m(0.35f, 420L, 3.5f, is.h);
        u3Var.setScaleProperty(0.2f);
        u3Var.setAllowCancel(true);
        u3Var.getDrawable().f30020b0 = new o(u3Var, 13);
        u3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        u3Var.setTextSize(AndroidUtilities.dp(28.0f));
        u3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        u3Var.setGravity(3);
        u3Var.getDrawable().S = false;
        u3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(u3Var, w7.x5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new l3(this, 5));
        g8Var.addTextChangedListener(new fi(this, 1));
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
        o1.k kVar = this.f35177n;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.f35178r;
        if (kVar2 != null) {
            kVar2.c();
        }
        int i11 = 4;
        FrameLayout frameLayout = this.d;
        TextView textView = this.f35175e;
        float f13 = 1.0f;
        e6 e6Var = this.f35174c;
        if (!z10) {
            if (this.v) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            e6Var.setAlpha(f12);
            if (!this.f35180w) {
                f13 = 0.0f;
            }
            textView.setAlpha(f13);
            e6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            e6Var.setEnabled(!this.v);
            if (this.v) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            e6Var.setVisibility(i10);
            if (this.f35180w) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f35181x;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = e6Var.getAlpha();
        float f14 = 1.0f;
        float alpha2 = textView.getAlpha();
        if (this.v) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!this.f35180w) {
            f14 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            e6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f14 > 0.0f) {
            textView.setVisibility(0);
        }
        e6Var.setEnabled(!this.v);
        if (this.v) {
            f10 = 24.0f;
        } else {
            f10 = -24.0f;
        }
        if (e6Var.getAlpha() < 0.01f) {
            e6Var.setConversionWobble(f10);
        }
        o1.k kVar3 = new o1.k(new o1.j(e6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.f16988u = lVar;
        kVar3.e(0.1f);
        kVar3.f16977a = (-f10) * 10.0f;
        kVar3.b(new t2(this, 2));
        kVar3.h();
        this.f35178r = kVar3;
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
        o1.k kVar4 = new o1.k(textView, o1.h.f16973q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.f16988u = lVar2;
        kVar4.f16977a = (-f11) * 10.0f;
        kVar4.h();
        this.f35177n = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(320L);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.addUpdateListener(new f8(this, alpha, f7, alpha2, f14, i12, 0));
        this.h.addListener(new z4(this, 4));
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
        g8 g8Var = this.f35173b;
        Editable text = g8Var.getText();
        boolean z10 = this.E;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(g8Var.getHint(), charSequence)) {
                g8Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            h8 h8Var = (h8) arrayList.get(i10);
            h8Var.d = f7;
            f7 += h8Var.a();
            if (text.getSpanStart(h8Var) >= 0) {
                text.setSpan(h8Var, text.getSpanStart(h8Var), text.getSpanEnd(h8Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.H < 1.0f) {
            float measureText = g8Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            g8Var.setMinWidth(Math.max(dp2, g8Var.getPaddingRight() + g8Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                dp = AndroidUtilities.dp(3.0f) + g8Var.getPaddingRight() + g8Var.getPaddingLeft();
            } else {
                dp = AndroidUtilities.dp(24.0f);
            }
            g8Var.setMinWidth(dp);
        }
        g8Var.requestLayout();
        g8Var.invalidate();
    }

    public final void d(l0 l0Var, boolean z10) {
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
        f fVar = l0Var.h;
        if (this.f35179s && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.E;
        g8 g8Var = this.f35173b;
        org.telegram.ui.Cells.u3 u3Var = this.f35176f;
        TextView textView = this.f35175e;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.h6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.Oh;
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, this.f35182y);
            textView.setTextColor(w02);
            u3Var.f30346c.v(w02, z11);
            u3Var.invalidate();
            g8Var.setCursorColor(w02);
            g8Var.setHandlesColor(w02);
            g8Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
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
        if (this.v == z10 && this.f35180w == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f35180w = z12;
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
        this.f35181x = i10;
        if (z14 || !this.f35179s) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f35179s = true;
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
        f(g8Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f35172a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        e6 e6Var = this.f35174c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - e6Var.getLeft()) - (e6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(ai.y(e6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - e6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.u3 u3Var = this.f35176f;
        int visibility = u3Var.getVisibility();
        g8 g8Var = this.f35173b;
        if (visibility == 8) {
            right = g8Var.getRight();
        } else {
            right = u3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((g8Var.getLeft() + right) / 2.0f));
        g8Var.setTranslationX(left);
        u3Var.setTranslationX(left);
        g8Var.setAlpha(f10);
        u3Var.setAlpha(f10);
        if (z10 && !this.v) {
            z11 = true;
        } else {
            z11 = false;
        }
        e6Var.setEnabled(z11);
        e6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k8.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.r6 getCurrencyView() {
        return this.f35176f;
    }

    public e6 getDiamondView() {
        return this.f35174c;
    }

    public EditTextBoldCursor getEditText() {
        return this.f35173b;
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
        g8 g8Var = this.f35173b;
        int baseline = g8Var.getBaseline() + g8Var.getTop();
        TextView textView = this.f35175e;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.d.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.u3 u3Var = this.f35176f;
        u3Var.setTranslationY((baseline - u3Var.getTop()) - u3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f35172a;
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
            this.f35173b.setText(str);
        } finally {
            this.Q = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.N = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }
}
