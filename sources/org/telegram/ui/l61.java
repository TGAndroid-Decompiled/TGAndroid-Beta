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
public abstract class l61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout f35655a;
    public final ImageView f35656b;
    public final ImageView f35657c;
    public final eg.y d;
    public final View e;
    public final org.telegram.ui.Components.en0 f35658f;
    public final dh.b h;
    public k61 f35659n;
    public float f35660r;
    public ValueAnimator f35661s;
    public sz0 v;
    public boolean f35662w;
    public boolean f35663x;
    public final x61 f35664y;

    public l61(x61 x61Var, Context context, boolean z4) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = x61Var.W0;
        this.f35664y = x61Var;
        this.f35662w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35655a = frameLayout;
        if (z4) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        gg.j1 j1Var = kf.r0.f10496a;
        frameLayout.setOutlineProvider(new kf.q0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, k7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f35656b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.en0 en0Var = new org.telegram.ui.Components.en0();
        this.f35658f = en0Var;
        en0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        en0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(en0Var);
        final n51 n51Var = (n51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n51 n51Var2 = n51Var;
                        dh.b bVar = n51Var2.h;
                        if (n51Var2.f35658f.f24646k == 1) {
                            bVar.setText("");
                            n51Var2.f35664y.v(null, true, false);
                            k61 k61Var = n51Var2.f35659n;
                            if (k61Var != null) {
                                k61Var.E1(null);
                                n51Var2.f35659n.F1(true, true);
                                n51Var2.f35659n.C1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                            n51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        n51 n51Var3 = n51Var;
                        x61 x61Var2 = n51Var3.f35664y;
                        if (!x61Var2.u()) {
                            x61Var2.q();
                            n51Var3.h.requestFocus();
                            x61.a(x61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        n51 n51Var4 = n51Var;
                        dh.b bVar2 = n51Var4.h;
                        bVar2.setText("");
                        n51Var4.f35664y.v(null, true, false);
                        k61 k61Var2 = n51Var4.f35659n;
                        if (k61Var2 != null) {
                            k61Var2.E1(null);
                            n51Var4.f35659n.F1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                        n51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        eg.y yVar = new eg.y(n51Var, context, z4);
        this.d = yVar;
        frameLayout.addView(yVar, k7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        dh.b bVar = new dh.b(n51Var, context, f6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new p0(n51Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z4) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, k7.b6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        n51 n51Var2 = n51Var;
                        dh.b bVar2 = n51Var2.h;
                        if (n51Var2.f35658f.f24646k == 1) {
                            bVar2.setText("");
                            n51Var2.f35664y.v(null, true, false);
                            k61 k61Var = n51Var2.f35659n;
                            if (k61Var != null) {
                                k61Var.E1(null);
                                n51Var2.f35659n.F1(true, true);
                                n51Var2.f35659n.C1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                            n51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        n51 n51Var3 = n51Var;
                        x61 x61Var2 = n51Var3.f35664y;
                        if (!x61Var2.u()) {
                            x61Var2.q();
                            n51Var3.h.requestFocus();
                            x61.a(x61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        n51 n51Var4 = n51Var;
                        dh.b bVar22 = n51Var4.h;
                        bVar22.setText("");
                        n51Var4.f35664y.v(null, true, false);
                        k61 k61Var2 = n51Var4.f35659n;
                        if (k61Var2 != null) {
                            k61Var2.E1(null);
                            n51Var4.f35659n.F1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                        n51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f35657c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(n51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        n51 n51Var2 = n51Var;
                        dh.b bVar2 = n51Var2.h;
                        if (n51Var2.f35658f.f24646k == 1) {
                            bVar2.setText("");
                            n51Var2.f35664y.v(null, true, false);
                            k61 k61Var = n51Var2.f35659n;
                            if (k61Var != null) {
                                k61Var.E1(null);
                                n51Var2.f35659n.F1(true, true);
                                n51Var2.f35659n.C1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                            n51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        n51 n51Var3 = n51Var;
                        x61 x61Var2 = n51Var3.f35664y;
                        if (!x61Var2.u()) {
                            x61Var2.q();
                            n51Var3.h.requestFocus();
                            x61.a(x61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        n51 n51Var4 = n51Var;
                        dh.b bVar22 = n51Var4.h;
                        bVar22.setText("");
                        n51Var4.f35664y.v(null, true, false);
                        k61 k61Var2 = n51Var4.f35659n;
                        if (k61Var2 != null) {
                            k61Var2.E1(null);
                            n51Var4.f35659n.F1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                        n51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        if (!mg.g0.d) {
            b();
        }
    }

    public static void a(n51 n51Var, boolean z4) {
        if (z4) {
            if (n51Var.v == null) {
                sz0 sz0Var = new sz0(n51Var, 14);
                n51Var.v = sz0Var;
                AndroidUtilities.runOnUIThread(sz0Var, 340L);
                return;
            }
            return;
        }
        sz0 sz0Var2 = n51Var.v;
        if (sz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(sz0Var2);
            n51Var.v = null;
        }
        AndroidUtilities.updateViewShow(n51Var.f35657c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l61.b():void");
    }

    public final void c(boolean z4) {
        float f10;
        if (z4 == this.f35662w) {
            return;
        }
        this.f35662w = z4;
        ValueAnimator valueAnimator = this.f35661s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f35660r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f35661s = ofFloat;
        ofFloat.addUpdateListener(new o11(this, 9));
        this.f35661s.setDuration(120L);
        this.f35661s.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f35661s.start();
    }

    public final void d(boolean z4) {
        ?? r62;
        String str;
        k61 k61Var;
        k61 k61Var2;
        org.telegram.ui.Components.en0 en0Var = this.f35658f;
        int i10 = en0Var.f24646k;
        dh.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((k61Var2 = this.f35659n) != null && k61Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (bVar.length() <= 0 && ((k61Var = this.f35659n) == null || k61Var.f30738l3 <= 0.5f || (!k61Var.f30733g3 && k61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        en0Var.b(r62);
        ImageView imageView = this.f35656b;
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
        if (this.f35663x) {
            this.f35655a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f35664y.W0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
