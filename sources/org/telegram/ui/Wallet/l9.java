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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
public final class l9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final xq T = xq.h;
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
    public int f42793a;
    public final LinearLayout f42794b;
    public final h9 f42795c;
    public final u6 d;
    public final FrameLayout f42796e;
    public final TextView f42797f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator f42798n;
    public q1.g f42799r;
    public q1.g f42800s;
    public boolean f42801w;
    public boolean f42802x;
    public boolean f42803y;

    public l9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        this.f42793a = i3;
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
        this.f42794b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, mf.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42796e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, mf.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        u6 u6Var = new u6(60, context, true);
        this.d = u6Var;
        u6Var.i();
        frameLayout.addView(u6Var, mf.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42797f = textView;
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, mf.e(-2, 60, 19));
        h9 h9Var = new h9(this, context);
        this.f42795c = h9Var;
        org.telegram.ui.ActionBar.r6.V(h9Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.E(h9Var, i10, e6Var);
        h9Var.setHint("0");
        h9Var.setTextSize(1, 44.0f);
        h9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        h9Var.setIncludeFontPadding(false);
        h9Var.setSingleLine(true);
        h9Var.setGravity(21);
        h9Var.setBackground(null);
        h9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        h9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        h9Var.setHorizontallyScrolling(true);
        h9Var.setCursorWidth(3.0f);
        h9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(h9Var, 30, i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(h9Var, 36, i3, e6Var);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, i3);
        org.telegram.ui.ActionBar.r6.o(h9Var, 3, L.f28359a, -1, 2, L.d, e6Var);
        h9Var.setAllowDrawCursor(true);
        h9Var.setInputType(8194);
        h9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        h9Var.setImeOptions(33554438);
        linearLayout.addView(h9Var, mf.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.f34307c.m(0.35f, 420L, 3.5f, xq.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().f33984b0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.f42793a, e6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().S = false;
        w3Var.c(bd.M0(2131749524, null), false, true);
        linearLayout.addView(w3Var, mf.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new h3(this, 7));
        h9Var.addTextChangedListener(new eh(this, 1));
    }

    public final void a(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3;
        ValueAnimator valueAnimator = this.f42798n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42798n.cancel();
            this.f42798n = null;
        }
        q1.g gVar = this.f42799r;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = this.f42800s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.f42796e;
        int i10 = 0;
        TextView textView = this.f42797f;
        float f15 = 1.0f;
        u6 u6Var = this.d;
        if (!z10) {
            if (this.f42802x) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            u6Var.setAlpha(f14);
            if (!this.f42803y) {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            u6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            u6Var.setEnabled(!this.f42802x);
            if (this.f42802x) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            u6Var.setVisibility(i3);
            if (!this.f42803y) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i11 = frameLayout.getLayoutParams().width;
        float alpha = u6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.f42802x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (this.f42803y) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (alpha > 0.0f || f10 > 0.0f) {
            u6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        u6Var.setEnabled(!this.f42802x);
        if (this.f42802x) {
            f12 = 24.0f;
        } else {
            f12 = -24.0f;
        }
        if (u6Var.getAlpha() < 0.01f) {
            u6Var.setConversionWobble(f12);
        }
        q1.g gVar3 = new q1.g(new q1.f(u6Var.getConversionWobble()));
        q1.h hVar = new q1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.f53653m = hVar;
        gVar3.f(0.1f);
        gVar3.f53643a = (-f12) * 10.0f;
        gVar3.b(new o3(this, 3));
        gVar3.h();
        this.f42800s = gVar3;
        if (this.f42802x) {
            f13 = 18.0f;
        } else {
            f13 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        q1.g gVar4 = new q1.g(textView, q1.g.f53640s);
        q1.h hVar2 = new q1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.f53653m = hVar2;
        gVar4.f53643a = (-f13) * 10.0f;
        gVar4.h();
        this.f42799r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42798n = ofFloat;
        ofFloat.setDuration(320L);
        this.f42798n.setInterpolator(new LinearInterpolator());
        this.f42798n.addUpdateListener(new g9(this, alpha, f10, alpha2, f11, i11, 0));
        this.f42798n.addListener(new i81(this, 11));
        this.f42798n.start();
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
        h9 h9Var = this.f42795c;
        Editable text = h9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(h9Var.getHint(), charSequence)) {
                h9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                break;
            }
            i9 i9Var = (i9) arrayList.get(i3);
            i9Var.d = f10;
            f10 += i9Var.a();
            if (text.getSpanStart(i9Var) >= 0) {
                text.setSpan(i9Var, text.getSpanStart(i9Var), text.getSpanEnd(i9Var), 33);
            }
            i3++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = h9Var.getPaint().measureText("0");
            int L2 = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            h9Var.setMinWidth(Math.max(L2, h9Var.getPaddingRight() + h9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        } else {
            if (z10 && text.length() > 0) {
                L = org.telegram.messenger.g0.L(3.0f) + h9Var.getPaddingRight() + h9Var.getPaddingLeft();
            } else {
                L = org.telegram.messenger.g0.L(24.0f);
            }
            h9Var.setMinWidth(L);
        }
        h9Var.requestLayout();
        h9Var.invalidate();
    }

    public final void d(k0 k0Var, boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        TL_wallet.currencyRate currencyrate;
        int i3;
        int i10;
        boolean z15;
        int L;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i11;
        int i12;
        int i13;
        f fVar = k0Var.h;
        if (this.f42801w && isAttachedToWindow() && isShown()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = this.G;
        h9 h9Var = this.f42795c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f42797f;
        if (z16) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Ci;
            }
            this.f42793a = i11;
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            if (z10) {
                i12 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Ci;
            }
            org.telegram.ui.ActionBar.r6.V(textView, i12, e6Var);
            w3Var.f34307c.v(w02, z11);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.r6.w(h9Var, this.f42793a, e6Var);
            org.telegram.ui.ActionBar.r6.m(h9Var, 36, this.f42793a, e6Var);
            if (z10) {
                i13 = org.telegram.ui.ActionBar.k6.Zl;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.Ci;
            }
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.3f, i13);
            org.telegram.ui.ActionBar.r6.o(h9Var, 3, L2.f28359a, -1, 2, L2.d, e6Var);
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
        if (this.f42802x == z10 && this.f42803y == z12 && (!z12 || TextUtils.equals(textView.getText(), str))) {
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
        this.f42802x = z10;
        this.f42803y = z12;
        if (!z10) {
            i3 = org.telegram.messenger.g0.L(59.0f);
        } else if (z12) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z13) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i10 = 0;
            }
            i3 = ceil + i10;
        } else {
            i3 = 0;
        }
        this.E = i3;
        if (z14 || !this.f42801w) {
            if (z11 && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            a(z15);
        }
        this.f42801w = true;
        if (!z10) {
            g7 = bd.M0(2131749524, null);
        } else if (!z12) {
            g7 = str;
        }
        w3Var.c(g7, z11, true);
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
        f(h9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        int right;
        boolean z11;
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.f42794b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.f42796e;
        u6 u6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - u6Var.getLeft()) - (u6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(org.telegram.messenger.camera.q.x(u6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - u6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        h9 h9Var = this.f42795c;
        if (visibility == 8) {
            right = h9Var.getRight();
        } else {
            right = w3Var.getRight();
        }
        float left = (1.0f - f11) * (width - ((h9Var.getLeft() + right) / 2.0f));
        h9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        h9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        if (z10 && !this.f42802x) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6Var.setEnabled(z11);
        u6Var.setIntroProgress(f10);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l9.f(android.text.Editable):void");
    }

    public org.telegram.ui.Components.h6 getCurrencyView() {
        return this.h;
    }

    public u6 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.f42795c;
    }

    @Override
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        h9 h9Var = this.f42795c;
        int baseline = h9Var.getBaseline() + h9Var.getTop();
        TextView textView = this.f42797f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.f42796e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        org.telegram.ui.Cells.w3 w3Var = this.h;
        w3Var.setTranslationY((baseline - w3Var.getTop()) - w3Var.getBaseline());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.f42794b;
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
            this.f42795c.setText(str);
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
        h9 h9Var = this.f42795c;
        if (h9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.f42793a, this.F);
                h9Var.setCursorColor(w02);
                h9Var.setHandlesColor(w02);
                if (this.G && (w3Var = this.h) != null) {
                    w3Var.f34307c.v(w02, false);
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
