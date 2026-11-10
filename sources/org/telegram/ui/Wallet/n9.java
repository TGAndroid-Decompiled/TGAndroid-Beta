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
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.wq;
import org.telegram.ui.u81;
public final class n9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final wq S = wq.h;
    public int D;
    public final org.telegram.ui.ActionBar.h6 E;
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
    public int f42867a;
    public final LinearLayout f42868b;
    public final j9 f42869c;
    public final x6 d;
    public final FrameLayout f42870e;
    public final TextView f42871f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator f42872n;
    public r1.g f42873r;
    public r1.g f42874s;
    public boolean f42875w;
    public boolean f42876x;
    public boolean f42877y;

    public n9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        this.f42867a = i7;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = h6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42868b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, c8.ha.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42870e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ha.r(59, 60, 16));
        this.D = org.telegram.messenger.g0.L(59.0f);
        x6 x6Var = new x6(60, context, true);
        this.d = x6Var;
        x6Var.i();
        frameLayout.addView(x6Var, c8.ha.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42871f = textView;
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ha.e(-2, 60, 19));
        j9 j9Var = new j9(this, context);
        this.f42869c = j9Var;
        org.telegram.ui.ActionBar.t6.U(j9Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.D(j9Var, i10, h6Var);
        j9Var.setHint("0");
        j9Var.setTextSize(1, 44.0f);
        j9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        j9Var.setIncludeFontPadding(false);
        j9Var.setSingleLine(true);
        j9Var.setGravity(21);
        j9Var.setBackground(null);
        j9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        j9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        j9Var.setHorizontallyScrolling(true);
        j9Var.setCursorWidth(3.0f);
        j9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.t6.l(j9Var, 30, i7, h6Var);
        org.telegram.ui.ActionBar.t6.l(j9Var, 36, i7, h6Var);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.3f, i7);
        org.telegram.ui.ActionBar.t6.n(j9Var, 3, K.f28387a, -1, 2, K.d, h6Var);
        j9Var.setAllowDrawCursor(true);
        j9Var.setInputType(8194);
        j9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        j9Var.setImeOptions(33554438);
        linearLayout.addView(j9Var, c8.ha.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.f34543c.m(0.35f, 420L, 3.5f, wq.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().f34188b0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(this.f42867a, h6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().S = false;
        w3Var.c(id.M0(2131749516, null), false, true);
        linearLayout.addView(w3Var, c8.ha.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new h3(this, 7));
        j9Var.addTextChangedListener(new gh(this, 1));
    }

    public final void a(boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        ValueAnimator valueAnimator = this.f42872n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42872n.cancel();
            this.f42872n = null;
        }
        r1.g gVar = this.f42873r;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = this.f42874s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.f42870e;
        int i10 = 0;
        TextView textView = this.f42871f;
        float f15 = 1.0f;
        x6 x6Var = this.d;
        if (!z9) {
            if (this.f42876x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            x6Var.setAlpha(f14);
            if (!this.f42877y) {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            x6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            x6Var.setEnabled(!this.f42876x);
            if (this.f42876x) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            x6Var.setVisibility(i7);
            if (!this.f42877y) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            frameLayout.getLayoutParams().width = this.D;
            frameLayout.requestLayout();
            return;
        }
        int i11 = frameLayout.getLayoutParams().width;
        float alpha = x6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f42876x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (this.f42877y) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (alpha > 0.0f || f10 > 0.0f) {
            x6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        x6Var.setEnabled(!this.f42876x);
        if (this.f42876x) {
            f12 = 24.0f;
        } else {
            f12 = -24.0f;
        }
        if (x6Var.getAlpha() < 0.01f) {
            x6Var.setConversionWobble(f12);
        }
        r1.g gVar3 = new r1.g(new r1.f(x6Var.getConversionWobble()));
        r1.h hVar = new r1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.f54279m = hVar;
        gVar3.f(0.1f);
        gVar3.f54269a = (-f12) * 10.0f;
        gVar3.b(new q3(this, 3));
        gVar3.h();
        this.f42874s = gVar3;
        if (this.f42876x) {
            f13 = 18.0f;
        } else {
            f13 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        r1.g gVar4 = new r1.g(textView, r1.g.f54266s);
        r1.h hVar2 = new r1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.f54279m = hVar2;
        gVar4.f54269a = (-f13) * 10.0f;
        gVar4.h();
        this.f42873r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42872n = ofFloat;
        ofFloat.setDuration(320L);
        this.f42872n.setInterpolator(new LinearInterpolator());
        this.f42872n.addUpdateListener(new i9(this, alpha, f10, alpha2, f11, i11, 0));
        this.f42872n.addListener(new u81(this, 11));
        this.f42872n.start();
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
        j9 j9Var = this.f42869c;
        Editable text = j9Var.getText();
        boolean z9 = this.F;
        if (z9) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(j9Var.getHint(), charSequence)) {
                j9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                break;
            }
            k9 k9Var = (k9) arrayList.get(i7);
            k9Var.d = f10;
            f10 += k9Var.a();
            if (text.getSpanStart(k9Var) >= 0) {
                text.setSpan(k9Var, text.getSpanStart(k9Var), text.getSpanEnd(k9Var), 33);
            }
            i7++;
        }
        if (text.length() == 0 && this.I < 1.0f) {
            float measureText = j9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.M;
            j9Var.setMinWidth(Math.max(L2, j9Var.getPaddingRight() + j9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f11)) + f11)));
        } else {
            if (z9 && text.length() > 0) {
                L = org.telegram.messenger.g0.L(3.0f) + j9Var.getPaddingRight() + j9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.g0.L(24.0f);
            }
            j9Var.setMinWidth(L);
        }
        j9Var.requestLayout();
        j9Var.invalidate();
    }

    public final void d(l0 l0Var, boolean z9) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        TL_wallet.currencyRate currencyrate;
        int i7;
        int i10;
        boolean z14;
        int L;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i11;
        int i12;
        int i13;
        f fVar = l0Var.h;
        if (this.f42875w && isAttachedToWindow() && isShown()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z15 = this.F;
        j9 j9Var = this.f42869c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f42871f;
        if (z15) {
            if (z9) {
                i11 = org.telegram.ui.ActionBar.m6.Zl;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.Ci;
            }
            this.f42867a = i11;
            org.telegram.ui.ActionBar.h6 h6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            if (z9) {
                i12 = org.telegram.ui.ActionBar.m6.Zl;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.Ci;
            }
            org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
            w3Var.f34543c.v(w02, z10);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.t6.v(j9Var, this.f42867a, h6Var);
            org.telegram.ui.ActionBar.t6.l(j9Var, 36, this.f42867a, h6Var);
            if (z9) {
                i13 = org.telegram.ui.ActionBar.m6.Zl;
            } else {
                i13 = org.telegram.ui.ActionBar.m6.Ci;
            }
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.3f, i13);
            org.telegram.ui.ActionBar.t6.n(j9Var, 3, K.f28387a, -1, 2, K.d, h6Var);
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
        if (z9 && (j3 == null ? equals : j3.symbolLeft)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j3 != null && j3.spaceBetween) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f42876x == z9 && this.f42877y == z11 && (!z11 || TextUtils.equals(textView.getText(), str))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z11) {
            textView.setText(str);
            currencyrate = j3;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str));
            textView.requestLayout();
        } else {
            currencyrate = j3;
        }
        this.f42876x = z9;
        this.f42877y = z11;
        if (!z9) {
            i7 = org.telegram.messenger.g0.L(59.0f);
        } else if (z11) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z12) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i10 = 0;
            }
            i7 = ceil + i10;
        } else {
            i7 = 0;
        }
        this.D = i7;
        if (z13 || !this.f42875w) {
            if (z10 && z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            a(z14);
        }
        this.f42875w = true;
        if (!z9) {
            g10 = id.M0(2131749516, null);
        } else if (!z11) {
            g10 = str;
        }
        w3Var.c(g10, z10, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w3Var.getLayoutParams();
        if (z9 && !z11 && !z12) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        layoutParams.leftMargin = L;
        w3Var.setLayoutParams(layoutParams);
        if (z9 && currencyrate != null) {
            currencyrate2 = currencyrate;
            str2 = currencyrate2.thousandsSeparator;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            currencyrate2 = currencyrate;
            str2 = ",";
        }
        if (z9 && currencyrate2 != null && !TextUtils.isEmpty(currencyrate2.decimalSeparator)) {
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
        f(j9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z9) {
        int right;
        boolean z10;
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.f42868b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.f42870e;
        x6 x6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - x6Var.getLeft()) - (x6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(org.telegram.messenger.camera.q.x(x6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - x6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        j9 j9Var = this.f42869c;
        if (visibility == 8) {
            right = j9Var.getRight();
        } else {
            right = w3Var.getRight();
        }
        float left = (1.0f - f11) * (width - ((j9Var.getLeft() + right) / 2.0f));
        j9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        j9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        if (z9 && !this.f42876x) {
            z10 = true;
        } else {
            z10 = false;
        }
        x6Var.setEnabled(z10);
        x6Var.setIntroProgress(f10);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.i6 getCurrencyView() {
        return this.h;
    }

    public x6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f42869c;
    }

    @Override
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        j9 j9Var = this.f42869c;
        int baseline = j9Var.getBaseline() + j9Var.getTop();
        TextView textView = this.f42871f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.f42870e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.w3 w3Var = this.h;
        w3Var.setTranslationY((baseline - w3Var.getTop()) - w3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f42868b;
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
            this.f42869c.setText(str);
        } finally {
            this.R = false;
        }
    }

    public void setScaleProperty(float f10) {
        this.O = 1.0f - Math.max(0.0f, Math.min(1.0f, f10));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.w3 w3Var;
        j9 j9Var = this.f42869c;
        if (j9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(this.f42867a, this.E);
                j9Var.setCursorColor(w02);
                j9Var.setHandlesColor(w02);
                if (this.F && (w3Var = this.h) != null) {
                    w3Var.f34543c.v(w02, false);
                    w3Var.invalidate();
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
