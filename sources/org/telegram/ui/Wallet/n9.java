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
import org.telegram.messenger.kk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bs;
import org.telegram.ui.vf1;
public final class n9 extends FrameLayout {
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
    public final LinearLayout f34646a;
    public final j9 f34647b;
    public final s6 f34648c;
    public final FrameLayout d;
    public final TextView e;
    public final org.telegram.ui.Cells.t3 f34649f;
    public ValueAnimator h;
    public o1.k f34650n;
    public o1.k f34651r;
    public boolean f34652s;
    public boolean v;
    public boolean f34653w;
    public int f34654x;
    public final org.telegram.ui.ActionBar.d6 f34655y;

    public n9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.f34655y = d6Var;
        this.E = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34646a = linearLayout;
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
        this.f34654x = AndroidUtilities.dp(59.0f);
        s6 s6Var = new s6(60, context, true);
        this.f34648c = s6Var;
        s6Var.i();
        frameLayout.addView(s6Var, w7.z5.a(60.0f, 0.0f, -5.0f, -2.0f, 0.0f, 60, 19));
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.h6.f21398z6;
        kk.o(i10, d6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.z5.e(-2, 60, 19));
        j9 j9Var = new j9(this, context);
        this.f34647b = j9Var;
        j9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        j9Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        j9Var.setHint("0");
        j9Var.setTextSize(1, 44.0f);
        j9Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        j9Var.setIncludeFontPadding(false);
        j9Var.setSingleLine(true);
        j9Var.setGravity(21);
        j9Var.setBackground(null);
        j9Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        j9Var.setMinWidth(AndroidUtilities.dp(24.0f));
        j9Var.setHorizontallyScrolling(true);
        j9Var.setCursorWidth(3.0f);
        j9Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        j9Var.setCursorColor(w02);
        j9Var.setHandlesColor(w02);
        j9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
        j9Var.setAllowDrawCursor(true);
        j9Var.setInputType(8194);
        j9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        j9Var.setImeOptions(33554438);
        linearLayout.addView(j9Var, w7.z5.q(-2, 60, 16));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, false, true, false, true, true);
        this.f34649f = t3Var;
        t3Var.f29584c.m(0.35f, 420L, 3.5f, bs.h);
        t3Var.setScaleProperty(0.2f);
        t3Var.setAllowCancel(true);
        t3Var.getDrawable().f29202c0 = new n(t3Var, 15);
        t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        t3Var.setTextSize(AndroidUtilities.dp(28.0f));
        t3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        t3Var.setGravity(3);
        t3Var.getDrawable().S = false;
        t3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(t3Var, w7.z5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new t2(this, 7));
        j9Var.addTextChangedListener(new bi(this, 1));
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
        o1.k kVar = this.f34650n;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.f34651r;
        if (kVar2 != null) {
            kVar2.c();
        }
        FrameLayout frameLayout = this.d;
        int i11 = 0;
        TextView textView = this.e;
        float f14 = 1.0f;
        s6 s6Var = this.f34648c;
        if (!z10) {
            if (this.v) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            s6Var.setAlpha(f13);
            if (!this.f34653w) {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            s6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            s6Var.setEnabled(!this.v);
            if (this.v) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            s6Var.setVisibility(i10);
            if (!this.f34653w) {
                i11 = 4;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f34654x;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = s6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.v) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (this.f34653w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            s6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        s6Var.setEnabled(!this.v);
        if (this.v) {
            f11 = 24.0f;
        } else {
            f11 = -24.0f;
        }
        if (s6Var.getAlpha() < 0.01f) {
            s6Var.setConversionWobble(f11);
        }
        o1.k kVar3 = new o1.k(new o1.j(s6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.f17562u = lVar;
        kVar3.e(0.1f);
        kVar3.f17552a = (-f11) * 10.0f;
        kVar3.b(new z2(this, 3));
        kVar3.h();
        this.f34651r = kVar3;
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
        o1.k kVar4 = new o1.k(textView, o1.h.f17548q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.f17562u = lVar2;
        kVar4.f17552a = (-f12) * 10.0f;
        kVar4.h();
        this.f34650n = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(320L);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.addUpdateListener(new i9(this, alpha, f7, alpha2, f10, i12, 0));
        this.h.addListener(new vf1(this, 10));
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
        j9 j9Var = this.f34647b;
        Editable text = j9Var.getText();
        boolean z10 = this.E;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(j9Var.getHint(), charSequence)) {
                j9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            k9 k9Var = (k9) arrayList.get(i10);
            k9Var.d = f7;
            f7 += k9Var.a();
            if (text.getSpanStart(k9Var) >= 0) {
                text.setSpan(k9Var, text.getSpanStart(k9Var), text.getSpanEnd(k9Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.H < 1.0f) {
            float measureText = j9Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            j9Var.setMinWidth(Math.max(dp2, j9Var.getPaddingRight() + j9Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                dp = AndroidUtilities.dp(3.0f) + j9Var.getPaddingRight() + j9Var.getPaddingLeft();
            } else {
                dp = AndroidUtilities.dp(24.0f);
            }
            j9Var.setMinWidth(dp);
        }
        j9Var.requestLayout();
        j9Var.invalidate();
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
        if (this.f34652s && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.E;
        j9 j9Var = this.f34647b;
        org.telegram.ui.Cells.t3 t3Var = this.f34649f;
        TextView textView = this.e;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.h6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.Oh;
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, this.f34655y);
            textView.setTextColor(w02);
            t3Var.f29584c.v(w02, z11);
            t3Var.invalidate();
            j9Var.setCursorColor(w02);
            j9Var.setHandlesColor(w02);
            j9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
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
        if (this.v == z10 && this.f34653w == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f34653w = z12;
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
        this.f34654x = i10;
        if (z14 || !this.f34652s) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f34652s = true;
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
        f(j9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f34646a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        s6 s6Var = this.f34648c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - s6Var.getLeft()) - (s6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(kk.z(s6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - s6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.t3 t3Var = this.f34649f;
        int visibility = t3Var.getVisibility();
        j9 j9Var = this.f34647b;
        if (visibility == 8) {
            right = j9Var.getRight();
        } else {
            right = t3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((j9Var.getLeft() + right) / 2.0f));
        j9Var.setTranslationX(left);
        t3Var.setTranslationX(left);
        j9Var.setAlpha(f10);
        t3Var.setAlpha(f10);
        if (z10 && !this.v) {
            z11 = true;
        } else {
            z11 = false;
        }
        s6Var.setEnabled(z11);
        s6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.q6 getCurrencyView() {
        return this.f34649f;
    }

    public s6 getDiamondView() {
        return this.f34648c;
    }

    public EditTextBoldCursor getEditText() {
        return this.f34647b;
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
        j9 j9Var = this.f34647b;
        int baseline = j9Var.getBaseline() + j9Var.getTop();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.d.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.t3 t3Var = this.f34649f;
        t3Var.setTranslationY((baseline - t3Var.getTop()) - t3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f34646a;
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
            this.f34647b.setText(str);
        } finally {
            this.Q = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.N = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }
}
