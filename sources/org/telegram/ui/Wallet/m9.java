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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;
public final class m9 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final xq S = xq.h;
    public int D;
    public final org.telegram.ui.ActionBar.f6 E;
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
    public int f42777a;
    public final LinearLayout f42778b;
    public final i9 f42779c;
    public final w6 d;
    public final FrameLayout f42780e;
    public final TextView f42781f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator f42782n;
    public r1.g f42783r;
    public r1.g f42784s;
    public boolean f42785w;
    public boolean f42786x;
    public boolean f42787y;

    public m9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        this.f42777a = i7;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = f6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42778b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, c8.ha.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42780e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ha.r(59, 60, 16));
        this.D = org.telegram.messenger.g0.L(59.0f);
        w6 w6Var = new w6(60, context, true);
        this.d = w6Var;
        w6Var.i();
        frameLayout.addView(w6Var, c8.ha.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42781f = textView;
        int i10 = org.telegram.ui.ActionBar.k6.f28259z6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ha.e(-2, 60, 19));
        i9 i9Var = new i9(this, context);
        this.f42779c = i9Var;
        org.telegram.ui.ActionBar.r6.V(i9Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.E(i9Var, i10, f6Var);
        i9Var.setHint("0");
        i9Var.setTextSize(1, 44.0f);
        i9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        i9Var.setIncludeFontPadding(false);
        i9Var.setSingleLine(true);
        i9Var.setGravity(21);
        i9Var.setBackground(null);
        i9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        i9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        i9Var.setHorizontallyScrolling(true);
        i9Var.setCursorWidth(3.0f);
        i9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        org.telegram.ui.ActionBar.r6.m(i9Var, 30, i7, f6Var);
        org.telegram.ui.ActionBar.r6.m(i9Var, 36, i7, f6Var);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, i7);
        org.telegram.ui.ActionBar.r6.o(i9Var, 3, L.f28324a, -1, 2, L.d, f6Var);
        i9Var.setAllowDrawCursor(true);
        i9Var.setInputType(8194);
        i9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        i9Var.setImeOptions(33554438);
        linearLayout.addView(i9Var, c8.ha.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.f34898c.m(0.35f, 420L, 3.5f, xq.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().f34509b0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.f42777a, f6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().S = false;
        w3Var.c(hd.M0(2131749515, null), false, true);
        linearLayout.addView(w3Var, c8.ha.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new j3(this, 7));
        i9Var.addTextChangedListener(new hh(this, 1));
    }

    public final void a(boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        ValueAnimator valueAnimator = this.f42782n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42782n.cancel();
            this.f42782n = null;
        }
        r1.g gVar = this.f42783r;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = this.f42784s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.f42780e;
        int i10 = 0;
        TextView textView = this.f42781f;
        float f15 = 1.0f;
        w6 w6Var = this.d;
        if (!z9) {
            if (this.f42786x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            w6Var.setAlpha(f14);
            if (!this.f42787y) {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            w6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            w6Var.setEnabled(!this.f42786x);
            if (this.f42786x) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            w6Var.setVisibility(i7);
            if (!this.f42787y) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            frameLayout.getLayoutParams().width = this.D;
            frameLayout.requestLayout();
            return;
        }
        int i11 = frameLayout.getLayoutParams().width;
        float alpha = w6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f42786x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (this.f42787y) {
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
        w6Var.setEnabled(!this.f42786x);
        if (this.f42786x) {
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
        gVar3.f54174m = hVar;
        gVar3.f(0.1f);
        gVar3.f54164a = (-f12) * 10.0f;
        gVar3.b(new q3(this, 3));
        gVar3.h();
        this.f42784s = gVar3;
        if (this.f42786x) {
            f13 = 18.0f;
        } else {
            f13 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        r1.g gVar4 = new r1.g(textView, r1.g.f54161s);
        r1.h hVar2 = new r1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.f54174m = hVar2;
        gVar4.f54164a = (-f13) * 10.0f;
        gVar4.h();
        this.f42783r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42782n = ofFloat;
        ofFloat.setDuration(320L);
        this.f42782n.setInterpolator(new LinearInterpolator());
        this.f42782n.addUpdateListener(new h9(this, alpha, f10, alpha2, f11, i11, 0));
        this.f42782n.addListener(new r81(this, 11));
        this.f42782n.start();
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
        i9 i9Var = this.f42779c;
        Editable text = i9Var.getText();
        boolean z9 = this.F;
        if (z9) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(i9Var.getHint(), charSequence)) {
                i9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                break;
            }
            j9 j9Var = (j9) arrayList.get(i7);
            j9Var.d = f10;
            f10 += j9Var.a();
            if (text.getSpanStart(j9Var) >= 0) {
                text.setSpan(j9Var, text.getSpanStart(j9Var), text.getSpanEnd(j9Var), 33);
            }
            i7++;
        }
        if (text.length() == 0 && this.I < 1.0f) {
            float measureText = i9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.M;
            i9Var.setMinWidth(Math.max(L2, i9Var.getPaddingRight() + i9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f11)) + f11)));
        } else {
            if (z9 && text.length() > 0) {
                L = org.telegram.messenger.g0.L(3.0f) + i9Var.getPaddingRight() + i9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.g0.L(24.0f);
            }
            i9Var.setMinWidth(L);
        }
        i9Var.requestLayout();
        i9Var.invalidate();
    }

    public final void d(n0 n0Var, boolean z9) {
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
        f fVar = n0Var.h;
        if (this.f42785w && isAttachedToWindow() && isShown()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z15 = this.F;
        i9 i9Var = this.f42779c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f42781f;
        if (z15) {
            if (z9) {
                i11 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Ci;
            }
            this.f42777a = i11;
            org.telegram.ui.ActionBar.f6 f6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            if (z9) {
                i12 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Ci;
            }
            org.telegram.ui.ActionBar.r6.V(textView, i12, f6Var);
            w3Var.f34898c.v(w02, z10);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.r6.w(i9Var, this.f42777a, f6Var);
            org.telegram.ui.ActionBar.r6.m(i9Var, 36, this.f42777a, f6Var);
            if (z9) {
                i13 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.Ci;
            }
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.3f, i13);
            org.telegram.ui.ActionBar.r6.o(i9Var, 3, L2.f28324a, -1, 2, L2.d, f6Var);
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
        if (this.f42786x == z9 && this.f42787y == z11 && (!z11 || TextUtils.equals(textView.getText(), str))) {
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
        this.f42786x = z9;
        this.f42787y = z11;
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
        if (z13 || !this.f42785w) {
            if (z10 && z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            a(z14);
        }
        this.f42785w = true;
        if (!z9) {
            g10 = hd.M0(2131749515, null);
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
        f(i9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z9) {
        int right;
        boolean z10;
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.f42778b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.f42780e;
        w6 w6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - w6Var.getLeft()) - (w6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(org.telegram.messenger.camera.q.x(w6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - w6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        i9 i9Var = this.f42779c;
        if (visibility == 8) {
            right = i9Var.getRight();
        } else {
            right = w3Var.getRight();
        }
        float left = (1.0f - f11) * (width - ((i9Var.getLeft() + right) / 2.0f));
        i9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        i9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        if (z9 && !this.f42786x) {
            z10 = true;
        } else {
            z10 = false;
        }
        w6Var.setEnabled(z10);
        w6Var.setIntroProgress(f10);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.j6 getCurrencyView() {
        return this.h;
    }

    public w6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f42779c;
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
        i9 i9Var = this.f42779c;
        int baseline = i9Var.getBaseline() + i9Var.getTop();
        TextView textView = this.f42781f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.f42780e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.w3 w3Var = this.h;
        w3Var.setTranslationY((baseline - w3Var.getTop()) - w3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f42778b;
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
            this.f42779c.setText(str);
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
        i9 i9Var = this.f42779c;
        if (i9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.f42777a, this.E);
                i9Var.setCursorColor(w02);
                i9Var.setHandlesColor(w02);
                if (this.F && (w3Var = this.h) != null) {
                    w3Var.f34898c.v(w02, false);
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
