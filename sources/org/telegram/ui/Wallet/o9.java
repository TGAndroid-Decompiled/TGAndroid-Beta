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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oh;
import org.telegram.ui.g71;
public final class o9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final er T = er.h;
    public int E;
    public final org.telegram.ui.ActionBar.e6 F;
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
    public int f44273a;
    public final LinearLayout f44274b;
    public final k9 f44275c;
    public final w6 d;
    public final FrameLayout f44276e;
    public final TextView f44277f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator f44278n;
    public r1.g f44279r;
    public r1.g f44280s;
    public boolean f44281w;
    public boolean f44282x;
    public boolean f44283y;

    public o9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        this.f44273a = i7;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = e6Var;
        this.G = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44274b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, c8.ja.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44276e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ja.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        w6 w6Var = new w6(60, context, true);
        this.d = w6Var;
        w6Var.i();
        frameLayout.addView(w6Var, c8.ja.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44277f = textView;
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ja.e(-2, 60, 19));
        k9 k9Var = new k9(this, context);
        this.f44275c = k9Var;
        org.telegram.ui.ActionBar.q6.U(k9Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.D(k9Var, i10, e6Var);
        k9Var.setHint("0");
        k9Var.setTextSize(1, 44.0f);
        k9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        k9Var.setIncludeFontPadding(false);
        k9Var.setSingleLine(true);
        k9Var.setGravity(21);
        k9Var.setBackground(null);
        k9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        k9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        k9Var.setHorizontallyScrolling(true);
        k9Var.setCursorWidth(3.0f);
        k9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.q6.l(k9Var, 30, i7, e6Var);
        org.telegram.ui.ActionBar.q6.l(k9Var, 36, i7, e6Var);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.3f, i7);
        org.telegram.ui.ActionBar.q6.n(k9Var, 3, K.f29392a, -1, 2, K.d, e6Var);
        k9Var.setAllowDrawCursor(true);
        k9Var.setInputType(8194);
        k9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        k9Var.setImeOptions(33554438);
        linearLayout.addView(k9Var, c8.ja.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.f35175c.m(0.35f, 420L, 3.5f, er.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().f34832c0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(this.f44273a, e6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().T = false;
        w3Var.c(hd.M0(2131749516, null), false, true);
        linearLayout.addView(w3Var, c8.ja.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new g3(this, 7));
        k9Var.addTextChangedListener(new oh(this, 1));
    }

    public final void a(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        ValueAnimator valueAnimator = this.f44278n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44278n.cancel();
            this.f44278n = null;
        }
        r1.g gVar = this.f44279r;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = this.f44280s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.f44276e;
        int i10 = 0;
        TextView textView = this.f44277f;
        float f15 = 1.0f;
        w6 w6Var = this.d;
        if (!z10) {
            if (this.f44282x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            w6Var.setAlpha(f14);
            if (!this.f44283y) {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            w6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            w6Var.setEnabled(!this.f44282x);
            if (this.f44282x) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            w6Var.setVisibility(i7);
            if (!this.f44283y) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i11 = frameLayout.getLayoutParams().width;
        float alpha = w6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f44282x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (this.f44283y) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (alpha > 0.0f || f10 > 0.0f) {
            w6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        w6Var.setEnabled(!this.f44282x);
        if (this.f44282x) {
            f12 = 24.0f;
        } else {
            f12 = -24.0f;
        }
        if (w6Var.getAlpha() < 0.01f) {
            w6Var.setConversionWobble(f12);
        }
        r1.g gVar3 = new r1.g(new r1.f(w6Var.getConversionWobble()));
        r1.h hVar = new r1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.f55748m = hVar;
        gVar3.f(0.1f);
        gVar3.f55738a = (-f12) * 10.0f;
        gVar3.b(new p3(this, 3));
        gVar3.h();
        this.f44280s = gVar3;
        if (this.f44282x) {
            f13 = 18.0f;
        } else {
            f13 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        r1.g gVar4 = new r1.g(textView, r1.g.f55735s);
        r1.h hVar2 = new r1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.f55748m = hVar2;
        gVar4.f55738a = (-f13) * 10.0f;
        gVar4.h();
        this.f44279r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44278n = ofFloat;
        ofFloat.setDuration(320L);
        this.f44278n.setInterpolator(new LinearInterpolator());
        this.f44278n.addUpdateListener(new j9(this, alpha, f10, alpha2, f11, i11, 0));
        this.f44278n.addListener(new g71(this, 12));
        this.f44278n.start();
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
        k9 k9Var = this.f44275c;
        Editable text = k9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(k9Var.getHint(), charSequence)) {
                k9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                break;
            }
            l9 l9Var = (l9) arrayList.get(i7);
            l9Var.d = f10;
            f10 += l9Var.a();
            if (text.getSpanStart(l9Var) >= 0) {
                text.setSpan(l9Var, text.getSpanStart(l9Var), text.getSpanEnd(l9Var), 33);
            }
            i7++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = k9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            k9Var.setMinWidth(Math.max(L2, k9Var.getPaddingRight() + k9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        } else {
            if (z10 && text.length() > 0) {
                L = org.telegram.messenger.g0.L(3.0f) + k9Var.getPaddingRight() + k9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.g0.L(24.0f);
            }
            k9Var.setMinWidth(L);
        }
        k9Var.requestLayout();
        k9Var.invalidate();
    }

    public final void d(l0 l0Var, boolean z10) {
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
        f fVar = l0Var.h;
        if (this.f44281w && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.G;
        k9 k9Var = this.f44275c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f44277f;
        if (z16) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.j6.cm;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Fi;
            }
            this.f44273a = i11;
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            if (z10) {
                i12 = org.telegram.ui.ActionBar.j6.cm;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Fi;
            }
            org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var);
            w3Var.f35175c.v(w02, z11);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.q6.v(k9Var, this.f44273a, e6Var);
            org.telegram.ui.ActionBar.q6.l(k9Var, 36, this.f44273a, e6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.j6.cm;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.Fi;
            }
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.3f, i13);
            org.telegram.ui.ActionBar.q6.n(k9Var, 3, K.f29392a, -1, 2, K.d, e6Var);
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
        if (this.f44282x == z10 && this.f44283y == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f44282x = z10;
        this.f44283y = z12;
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
        if (z14 || !this.f44281w) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f44281w = true;
        if (!z10) {
            g10 = hd.M0(2131749516, null);
        } else if (!z12) {
            g10 = str;
        }
        w3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w3Var.getLayoutParams();
        if (z10 && !z12 && !z13) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(4.0f);
        }
        layoutParams.leftMargin = L;
        w3Var.setLayoutParams(layoutParams);
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
        f(k9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        int right;
        boolean z11;
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.f44274b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.f44276e;
        w6 w6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - w6Var.getLeft()) - (w6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(i20.x(w6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - w6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        k9 k9Var = this.f44275c;
        if (visibility == 8) {
            right = k9Var.getRight();
        } else {
            right = w3Var.getRight();
        }
        float left = (1.0f - f11) * (width - ((k9Var.getLeft() + right) / 2.0f));
        k9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        k9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        if (z10 && !this.f44282x) {
            z11 = true;
        } else {
            z11 = false;
        }
        w6Var.setEnabled(z11);
        w6Var.setIntroProgress(f10);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.h6 getCurrencyView() {
        return this.h;
    }

    public w6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f44275c;
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
        k9 k9Var = this.f44275c;
        int baseline = k9Var.getBaseline() + k9Var.getTop();
        TextView textView = this.f44277f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.f44276e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.w3 w3Var = this.h;
        w3Var.setTranslationY((baseline - w3Var.getTop()) - w3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f44274b;
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
            this.f44275c.setText(str);
        } finally {
            this.S = false;
        }
    }

    public void setScaleProperty(float f10) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f10));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.w3 w3Var;
        k9 k9Var = this.f44275c;
        if (k9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.j6.w0(this.f44273a, this.F);
                k9Var.setCursorColor(w02);
                k9Var.setHandlesColor(w02);
                if (this.G && (w3Var = this.h) != null) {
                    w3Var.f35175c.v(w02, false);
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
