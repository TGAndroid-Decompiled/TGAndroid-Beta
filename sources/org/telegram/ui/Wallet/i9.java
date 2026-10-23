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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bs;
import org.telegram.ui.ve1;
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final bs S = bs.h;
    public final org.telegram.ui.ActionBar.g6 E;
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
    public int f34609a;
    public final LinearLayout f34610b;
    public final e9 f34611c;
    public final m6 d;
    public final FrameLayout e;
    public final TextView f34612f;
    public final org.telegram.ui.Cells.t3 h;
    public ValueAnimator f34613n;
    public o1.k f34614r;
    public o1.k f34615s;
    public boolean v;
    public boolean f34616w;
    public boolean f34617x;
    public int f34618y;

    public i9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        this.f34609a = i10;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = g6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34610b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.z5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.z5.q(59, 60, 16));
        this.f34618y = AndroidUtilities.dp(59.0f);
        m6 m6Var = new m6(60, context, true);
        this.d = m6Var;
        m6Var.i();
        frameLayout.addView(m6Var, w7.z5.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34612f = textView;
        int i11 = org.telegram.ui.ActionBar.k6.f21588z6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.z5.e(-2, 60, 19));
        e9 e9Var = new e9(this, context);
        this.f34611c = e9Var;
        org.telegram.ui.ActionBar.r6.W(e9Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.F(e9Var, i11, g6Var);
        e9Var.setHint("0");
        e9Var.setTextSize(1, 44.0f);
        e9Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        e9Var.setIncludeFontPadding(false);
        e9Var.setSingleLine(true);
        e9Var.setGravity(21);
        e9Var.setBackground(null);
        e9Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        e9Var.setMinWidth(AndroidUtilities.dp(24.0f));
        e9Var.setHorizontallyScrolling(true);
        e9Var.setCursorWidth(3.0f);
        e9Var.setCursorSize(AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(e9Var, 30, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(e9Var, 36, i10, g6Var);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.3f, i10);
        org.telegram.ui.ActionBar.r6.o(e9Var, 3, M.f21710a, -1, 2, M.d, g6Var);
        e9Var.setAllowDrawCursor(true);
        e9Var.setInputType(8194);
        e9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        e9Var.setImeOptions(33554438);
        linearLayout.addView(e9Var, w7.z5.q(-2, 60, 16));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, false, true, false, true, true);
        this.h = t3Var;
        t3Var.f29774c.m(0.35f, 420L, 3.5f, bs.h);
        t3Var.setScaleProperty(0.2f);
        t3Var.setAllowCancel(true);
        t3Var.getDrawable().f29438b0 = new m(t3Var, 13);
        t3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.f34609a, g6Var));
        t3Var.setTextSize(AndroidUtilities.dp(28.0f));
        t3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        t3Var.setGravity(3);
        t3Var.getDrawable().S = false;
        t3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(t3Var, w7.z5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new s2(this, 7));
        e9Var.addTextChangedListener(new bi(this, 1));
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        ValueAnimator valueAnimator = this.f34613n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34613n.cancel();
            this.f34613n = null;
        }
        o1.k kVar = this.f34614r;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.f34615s;
        if (kVar2 != null) {
            kVar2.c();
        }
        FrameLayout frameLayout = this.e;
        int i11 = 0;
        TextView textView = this.f34612f;
        float f14 = 1.0f;
        m6 m6Var = this.d;
        if (!z10) {
            if (this.f34616w) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            m6Var.setAlpha(f13);
            if (!this.f34617x) {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            m6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            m6Var.setEnabled(!this.f34616w);
            if (this.f34616w) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            m6Var.setVisibility(i10);
            if (!this.f34617x) {
                i11 = 4;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f34618y;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = m6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f34616w) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (this.f34617x) {
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
        m6Var.setEnabled(!this.f34616w);
        if (this.f34616w) {
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
        kVar3.f17622u = lVar;
        kVar3.e(0.1f);
        kVar3.f17612a = (-f11) * 10.0f;
        kVar3.b(new z2(this, 3));
        kVar3.h();
        this.f34615s = kVar3;
        if (this.f34616w) {
            f12 = 18.0f;
        } else {
            f12 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.k kVar4 = new o1.k(textView, o1.h.f17608q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.f17622u = lVar2;
        kVar4.f17612a = (-f12) * 10.0f;
        kVar4.h();
        this.f34614r = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34613n = ofFloat;
        ofFloat.setDuration(320L);
        this.f34613n.setInterpolator(new LinearInterpolator());
        this.f34613n.addUpdateListener(new d9(this, alpha, f7, alpha2, f10, i12, 0));
        this.f34613n.addListener(new ve1(this, 10));
        this.f34613n.start();
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
        int dp;
        CharSequence charSequence;
        e9 e9Var = this.f34611c;
        Editable text = e9Var.getText();
        boolean z10 = this.F;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(e9Var.getHint(), charSequence)) {
                e9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                break;
            }
            f9 f9Var = (f9) arrayList.get(i10);
            f9Var.d = f7;
            f7 += f9Var.a();
            if (text.getSpanStart(f9Var) >= 0) {
                text.setSpan(f9Var, text.getSpanStart(f9Var), text.getSpanEnd(f9Var), 33);
            }
            i10++;
        }
        if (text.length() == 0 && this.I < 1.0f) {
            float measureText = e9Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.M;
            e9Var.setMinWidth(Math.max(dp2, e9Var.getPaddingRight() + e9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f10)) + f10)));
        } else {
            if (z10 && text.length() > 0) {
                dp = AndroidUtilities.dp(3.0f) + e9Var.getPaddingRight() + e9Var.getPaddingLeft();
            } else {
                dp = AndroidUtilities.dp(24.0f);
            }
            e9Var.setMinWidth(dp);
        }
        e9Var.requestLayout();
        e9Var.invalidate();
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
        int i13;
        int i14;
        f fVar = l0Var.h;
        if (this.v && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.F;
        e9 e9Var = this.f34611c;
        org.telegram.ui.Cells.t3 t3Var = this.h;
        TextView textView = this.f34612f;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.k6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Oh;
            }
            this.f34609a = i12;
            org.telegram.ui.ActionBar.g6 g6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.k6.ll;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.Oh;
            }
            org.telegram.ui.ActionBar.r6.W(textView, i13, g6Var);
            t3Var.f29774c.v(w02, z11);
            t3Var.invalidate();
            org.telegram.ui.ActionBar.r6.x(e9Var, this.f34609a, g6Var);
            org.telegram.ui.ActionBar.r6.m(e9Var, 36, this.f34609a, g6Var);
            if (z10) {
                i14 = org.telegram.ui.ActionBar.k6.ll;
            } else {
                i14 = org.telegram.ui.ActionBar.k6.Oh;
            }
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.3f, i14);
            org.telegram.ui.ActionBar.r6.o(e9Var, 3, M.f21710a, -1, 2, M.d, g6Var);
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
        if (this.f34616w == z10 && this.f34617x == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f34616w = z10;
        this.f34617x = z12;
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
        this.f34618y = i10;
        if (z14 || !this.v) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.v = true;
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
        if (TextUtils.equals(this.P, str2) && TextUtils.equals(this.Q, str3)) {
            return;
        }
        b();
        this.P = str2;
        this.Q = str3;
        f(e9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f34610b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        m6 m6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - m6Var.getLeft()) - (m6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(sl.z(m6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - m6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.t3 t3Var = this.h;
        int visibility = t3Var.getVisibility();
        e9 e9Var = this.f34611c;
        if (visibility == 8) {
            right = e9Var.getRight();
        } else {
            right = t3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((e9Var.getLeft() + right) / 2.0f));
        e9Var.setTranslationX(left);
        t3Var.setTranslationX(left);
        e9Var.setAlpha(f10);
        t3Var.setAlpha(f10);
        if (z10 && !this.f34616w) {
            z11 = true;
        } else {
            z11 = false;
        }
        m6Var.setEnabled(z11);
        m6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.q6 getCurrencyView() {
        return this.h;
    }

    public m6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f34611c;
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
        e9 e9Var = this.f34611c;
        int baseline = e9Var.getBaseline() + e9Var.getTop();
        TextView textView = this.f34612f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.t3 t3Var = this.h;
        t3Var.setTranslationY((baseline - t3Var.getTop()) - t3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f34610b;
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
            this.f34611c.setText(str);
        } finally {
            this.R = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.O = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.t3 t3Var;
        e9 e9Var = this.f34611c;
        if (e9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.f34609a, this.E);
                e9Var.setCursorColor(w02);
                e9Var.setHandlesColor(w02);
                if (this.F && (t3Var = this.h) != null) {
                    t3Var.f29774c.v(w02, false);
                    t3Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
