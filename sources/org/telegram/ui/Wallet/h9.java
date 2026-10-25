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
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xh;
import org.telegram.ui.fc1;
public final class h9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final ds S = ds.h;
    public final org.telegram.ui.ActionBar.u6 E;
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
    public int f36638a;
    public final LinearLayout f36639b;
    public final d9 f36640c;
    public final l6 d;
    public final FrameLayout e;
    public final TextView f36641f;
    public final org.telegram.ui.Cells.y3 h;
    public ValueAnimator f36642n;
    public o1.j f36643r;
    public o1.j f36644s;
    public boolean v;
    public boolean f36645w;
    public boolean f36646x;
    public int f36647y;

    public h9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        this.f36638a = i10;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = u6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36639b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, gb1.i(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, gb1.u(59, 60, 16));
        this.f36647y = AndroidUtilities.dp(59.0f);
        l6 l6Var = new l6(60, context, true);
        this.d = l6Var;
        l6Var.i();
        frameLayout.addView(l6Var, gb1.h(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36641f = textView;
        int i11 = org.telegram.ui.ActionBar.y6.f23765z6;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, gb1.i(-2, 60, 19));
        d9 d9Var = new d9(this, context);
        this.f36640c = d9Var;
        org.telegram.ui.ActionBar.f7.V(d9Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.E(d9Var, i11, u6Var);
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
        org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.ActionBar.f7.m(d9Var, 30, i10, u6Var);
        org.telegram.ui.ActionBar.f7.m(d9Var, 36, i10, u6Var);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.3f, i10);
        org.telegram.ui.ActionBar.f7.o(d9Var, 3, L.f22483a, -1, 2, L.d, u6Var);
        d9Var.setAllowDrawCursor(true);
        d9Var.setInputType(8194);
        d9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        d9Var.setImeOptions(33554438);
        linearLayout.addView(d9Var, gb1.u(-2, 60, 16));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, false, true, false, true, true);
        this.h = y3Var;
        y3Var.f32440c.m(0.35f, 420L, 3.5f, ds.h);
        y3Var.setScaleProperty(0.2f);
        y3Var.setAllowCancel(true);
        y3Var.getDrawable().f32120b0 = new m(y3Var, 13);
        y3Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(this.f36638a, u6Var));
        y3Var.setTextSize(AndroidUtilities.dp(28.0f));
        y3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        y3Var.setGravity(3);
        y3Var.getDrawable().S = false;
        y3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(y3Var, gb1.x(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new s2(this, 7));
        d9Var.addTextChangedListener(new xh(this, 1));
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        ValueAnimator valueAnimator = this.f36642n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36642n.cancel();
            this.f36642n = null;
        }
        o1.j jVar = this.f36643r;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = this.f36644s;
        if (jVar2 != null) {
            jVar2.c();
        }
        FrameLayout frameLayout = this.e;
        int i11 = 0;
        TextView textView = this.f36641f;
        float f14 = 1.0f;
        l6 l6Var = this.d;
        if (!z10) {
            if (this.f36645w) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            l6Var.setAlpha(f13);
            if (!this.f36646x) {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            l6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            l6Var.setEnabled(!this.f36645w);
            if (this.f36645w) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            l6Var.setVisibility(i10);
            if (!this.f36646x) {
                i11 = 4;
            }
            textView.setVisibility(i11);
            frameLayout.getLayoutParams().width = this.f36647y;
            frameLayout.requestLayout();
            return;
        }
        int i12 = frameLayout.getLayoutParams().width;
        float alpha = l6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f36645w) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (this.f36646x) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (alpha > 0.0f || f7 > 0.0f) {
            l6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        l6Var.setEnabled(!this.f36645w);
        if (this.f36645w) {
            f11 = 24.0f;
        } else {
            f11 = -24.0f;
        }
        if (l6Var.getAlpha() < 0.01f) {
            l6Var.setConversionWobble(f11);
        }
        o1.j jVar3 = new o1.j(new ac.a(l6Var.getConversionWobble()));
        o1.k kVar = new o1.k(0.0f);
        kVar.a(0.3f);
        kVar.b(180.0f);
        jVar3.f18969u = kVar;
        jVar3.e(0.1f);
        jVar3.f18960a = (-f11) * 10.0f;
        jVar3.b(new z2(this, 3));
        jVar3.h();
        this.f36644s = jVar3;
        if (this.f36645w) {
            f12 = 18.0f;
        } else {
            f12 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.j jVar4 = new o1.j(textView, o1.h.f18956q);
        o1.k kVar2 = new o1.k(0.0f);
        kVar2.a(0.3f);
        kVar2.b(180.0f);
        jVar4.f18969u = kVar2;
        jVar4.f18960a = (-f12) * 10.0f;
        jVar4.h();
        this.f36643r = jVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36642n = ofFloat;
        ofFloat.setDuration(320L);
        this.f36642n.setInterpolator(new LinearInterpolator());
        this.f36642n.addUpdateListener(new c9(this, alpha, f7, alpha2, f10, i12, 0));
        this.f36642n.addListener(new fc1(this, 12));
        this.f36642n.start();
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
        d9 d9Var = this.f36640c;
        Editable text = d9Var.getText();
        boolean z10 = this.F;
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
            ArrayList arrayList = this.G;
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
        if (text.length() == 0 && this.I < 1.0f) {
            float measureText = d9Var.getPaint().measureText("0");
            int dp2 = AndroidUtilities.dp(24.0f);
            float f10 = this.M;
            d9Var.setMinWidth(Math.max(dp2, d9Var.getPaddingRight() + d9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f10)) + f10)));
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
        d9 d9Var = this.f36640c;
        org.telegram.ui.Cells.y3 y3Var = this.h;
        TextView textView = this.f36641f;
        if (z16) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.y6.ll;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.Oh;
            }
            this.f36638a = i12;
            org.telegram.ui.ActionBar.u6 u6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.y6.ll;
            } else {
                i13 = org.telegram.ui.ActionBar.y6.Oh;
            }
            org.telegram.ui.ActionBar.f7.V(textView, i13, u6Var);
            y3Var.f32440c.v(w02, z11);
            y3Var.invalidate();
            org.telegram.ui.ActionBar.f7.w(d9Var, this.f36638a, u6Var);
            org.telegram.ui.ActionBar.f7.m(d9Var, 36, this.f36638a, u6Var);
            if (z10) {
                i14 = org.telegram.ui.ActionBar.y6.ll;
            } else {
                i14 = org.telegram.ui.ActionBar.y6.Oh;
            }
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.3f, i14);
            org.telegram.ui.ActionBar.f7.o(d9Var, 3, L.f22483a, -1, 2, L.d, u6Var);
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g7 = fVar.g();
        boolean equals = TextUtils.equals(g7, "USD");
        if (j10 != null && !TextUtils.isEmpty(j10.symbol)) {
            str = j10.symbol;
        } else if (equals) {
            str = "$";
        } else {
            str = g7;
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
        if (this.f36645w == z10 && this.f36646x == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f36645w = z10;
        this.f36646x = z12;
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
        this.f36647y = i10;
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
            g7 = LocaleController.getString(R.string.GramCurrency);
        } else if (!z12) {
            g7 = str;
        }
        y3Var.c(g7, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(4.0f);
        }
        layoutParams.leftMargin = dp;
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
        f(d9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        int right;
        boolean z11;
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.f36639b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        l6 l6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - l6Var.getLeft()) - (l6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(vh.y(l6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - l6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.y3 y3Var = this.h;
        int visibility = y3Var.getVisibility();
        d9 d9Var = this.f36640c;
        if (visibility == 8) {
            right = d9Var.getRight();
        } else {
            right = y3Var.getRight();
        }
        float left = (1.0f - f10) * (width - ((d9Var.getLeft() + right) / 2.0f));
        d9Var.setTranslationX(left);
        y3Var.setTranslationX(left);
        d9Var.setAlpha(f10);
        y3Var.setAlpha(f10);
        if (z10 && !this.f36645w) {
            z11 = true;
        } else {
            z11 = false;
        }
        l6Var.setEnabled(z11);
        l6Var.setIntroProgress(f7);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.s6 getCurrencyView() {
        return this.h;
    }

    public l6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f36640c;
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
        d9 d9Var = this.f36640c;
        int baseline = d9Var.getBaseline() + d9Var.getTop();
        TextView textView = this.f36641f;
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
        LinearLayout linearLayout = this.f36639b;
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
            this.f36640c.setText(str);
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
        d9 d9Var = this.f36640c;
        if (d9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(this.f36638a, this.E);
                d9Var.setCursorColor(w02);
                d9Var.setHandlesColor(w02);
                if (this.F && (y3Var = this.h) != null) {
                    y3Var.f32440c.v(w02, false);
                    y3Var.invalidate();
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
