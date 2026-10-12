package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class c71 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout f36353a;
    public final ImageView f36354b;
    public final ImageView f36355c;
    public final org.telegram.ui.Components.oh0 d;
    public final View f36356e;
    public final org.telegram.ui.Components.jo0 f36357f;
    public final org.telegram.ui.Cells.c6 h;
    public b71 f36358n;
    public float f36359r;
    public ValueAnimator f36360s;
    public pz0 v;
    public boolean f36361w;
    public boolean f36362x;
    public final n71 f36363y;

    public c71(n71 n71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = n71Var.Z0;
        this.f36363y = n71Var;
        this.f36361w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36353a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52395a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.w5.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f36354b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0();
        this.f36357f = jo0Var;
        jo0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.h6.Je;
        jo0Var.a(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        imageView.setImageDrawable(jo0Var);
        final e61 e61Var = (e61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e61 e61Var2 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = e61Var2.h;
                        if (e61Var2.f36357f.f27581k == 1) {
                            c6Var2.setText("");
                            e61Var2.f36363y.v(null, true, false);
                            b71 b71Var = e61Var2.f36358n;
                            if (b71Var != null) {
                                b71Var.G1(null);
                                e61Var2.f36358n.H1(true, true);
                                e61Var2.f36358n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                            e61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        e61 e61Var3 = e61Var;
                        n71 n71Var2 = e61Var3.f36363y;
                        if (!n71Var2.u()) {
                            n71Var2.q();
                            e61Var3.h.requestFocus();
                            n71.a(n71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        e61 e61Var4 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = e61Var4.h;
                        c6Var3.setText("");
                        e61Var4.f36363y.v(null, true, false);
                        b71 b71Var2 = e61Var4.f36358n;
                        if (b71Var2 != null) {
                            b71Var2.G1(null);
                            e61Var4.f36358n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                        e61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.w5.e(36, 36, 51));
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(e61Var, context, z10);
        this.d = oh0Var;
        frameLayout.addView(oh0Var, w7.w5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(e61Var, context, c6Var, 1);
        this.h = c6Var2;
        c6Var2.addTextChangedListener(new m0(e61Var, 15));
        c6Var2.setBackground(null);
        c6Var2.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var2.setTextSize(1, 16.0f);
        c6Var2.setHint(LocaleController.getString(R.string.Search));
        c6Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        c6Var2.setImeOptions(268435459);
        c6Var2.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, c6Var));
        c6Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var2.setGravity(19);
        c6Var2.setCursorWidth(1.5f);
        c6Var2.setMaxLines(1);
        c6Var2.setSingleLine(true);
        c6Var2.setLines(1);
        c6Var2.setTranslationY(AndroidUtilities.dp(-1.0f));
        oh0Var.addView(c6Var2, w7.w5.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.f36356e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            oh0Var.addView(view, w7.w5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e61 e61Var2 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = e61Var2.h;
                        if (e61Var2.f36357f.f27581k == 1) {
                            c6Var22.setText("");
                            e61Var2.f36363y.v(null, true, false);
                            b71 b71Var = e61Var2.f36358n;
                            if (b71Var != null) {
                                b71Var.G1(null);
                                e61Var2.f36358n.H1(true, true);
                                e61Var2.f36358n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                            e61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        e61 e61Var3 = e61Var;
                        n71 n71Var2 = e61Var3.f36363y;
                        if (!n71Var2.u()) {
                            n71Var2.q();
                            e61Var3.h.requestFocus();
                            n71.a(n71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        e61 e61Var4 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = e61Var4.h;
                        c6Var3.setText("");
                        e61Var4.f36363y.v(null, true, false);
                        b71 b71Var2 = e61Var4.f36358n;
                        if (b71Var2 != null) {
                            b71Var2.G1(null);
                            e61Var4.f36358n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                        e61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f36355c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(e61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e61 e61Var2 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = e61Var2.h;
                        if (e61Var2.f36357f.f27581k == 1) {
                            c6Var22.setText("");
                            e61Var2.f36363y.v(null, true, false);
                            b71 b71Var = e61Var2.f36358n;
                            if (b71Var != null) {
                                b71Var.G1(null);
                                e61Var2.f36358n.H1(true, true);
                                e61Var2.f36358n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                            e61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        e61 e61Var3 = e61Var;
                        n71 n71Var2 = e61Var3.f36363y;
                        if (!n71Var2.u()) {
                            n71Var2.q();
                            e61Var3.h.requestFocus();
                            n71.a(n71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        e61 e61Var4 = e61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = e61Var4.h;
                        c6Var3.setText("");
                        e61Var4.f36363y.v(null, true, false);
                        b71 b71Var2 = e61Var4.f36358n;
                        if (b71Var2 != null) {
                            b71Var2.G1(null);
                            e61Var4.f36358n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                        e61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.w5.e(36, 36, 53));
        if (!zg.d0.d) {
            b();
        }
    }

    public static void a(e61 e61Var, boolean z10) {
        if (z10) {
            if (e61Var.v == null) {
                pz0 pz0Var = new pz0(e61Var, 15);
                e61Var.v = pz0Var;
                AndroidUtilities.runOnUIThread(pz0Var, 340L);
                return;
            }
            return;
        }
        pz0 pz0Var2 = e61Var.v;
        if (pz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(pz0Var2);
            e61Var.v = null;
        }
        AndroidUtilities.updateViewShow(e61Var.f36355c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c71.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f36361w) {
            return;
        }
        this.f36361w = z10;
        ValueAnimator valueAnimator = this.f36360s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f36359r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36360s = ofFloat;
        ofFloat.addUpdateListener(new a21(this, 9));
        this.f36360s.setDuration(120L);
        this.f36360s.setInterpolator(org.telegram.ui.Components.js.h);
        this.f36360s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        b71 b71Var;
        b71 b71Var2;
        org.telegram.ui.Components.jo0 jo0Var = this.f36357f;
        int i10 = jo0Var.f27581k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((b71Var2 = this.f36358n) != null && b71Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((b71Var = this.f36358n) == null || b71Var.f25816m3 <= 0.5f || (!b71Var.f25812h3 && b71Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        jo0Var.b(r62);
        ImageView imageView = this.f36354b;
        imageView.setClickable(r62);
        if (r62 != 0) {
            str = LocaleController.getString(R.string.AccDescrGoBack);
        } else {
            str = null;
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void e() {
        if (this.f36362x) {
            this.f36353a.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f36363y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
