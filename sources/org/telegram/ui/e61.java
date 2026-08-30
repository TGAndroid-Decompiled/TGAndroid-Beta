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
public abstract class e61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout f33902a;
    public final ImageView f33903b;
    public final ImageView f33904c;
    public final eg.y d;
    public final View e;
    public final org.telegram.ui.Components.fn0 f33905f;
    public final dh.b h;
    public d61 f33906n;
    public float f33907r;
    public ValueAnimator f33908s;
    public vy0 v;
    public boolean f33909w;
    public boolean f33910x;
    public final q61 f33911y;

    public e61(q61 q61Var, Context context, boolean z4) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = q61Var.W0;
        this.f33911y = q61Var;
        this.f33909w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33902a = frameLayout;
        if (z4) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        gg.j1 j1Var = lf.q0.f12053a;
        frameLayout.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, k7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f33903b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.fn0 fn0Var = new org.telegram.ui.Components.fn0();
        this.f33905f = fn0Var;
        fn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        fn0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(fn0Var);
        final g51 g51Var = (g51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g51 g51Var2 = g51Var;
                        dh.b bVar = g51Var2.h;
                        if (g51Var2.f33905f.f24913k == 1) {
                            bVar.setText("");
                            g51Var2.f33911y.v(null, true, false);
                            d61 d61Var = g51Var2.f33906n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.f33906n.G1(true, true);
                                g51Var2.f33906n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.f33911y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar2 = g51Var4.h;
                        bVar2.setText("");
                        g51Var4.f33911y.v(null, true, false);
                        d61 d61Var2 = g51Var4.f33906n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.f33906n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        eg.y yVar = new eg.y(g51Var, context, z4);
        this.d = yVar;
        frameLayout.addView(yVar, k7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        dh.b bVar = new dh.b(g51Var, context, f6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(g51Var, 15));
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
                        g51 g51Var2 = g51Var;
                        dh.b bVar2 = g51Var2.h;
                        if (g51Var2.f33905f.f24913k == 1) {
                            bVar2.setText("");
                            g51Var2.f33911y.v(null, true, false);
                            d61 d61Var = g51Var2.f33906n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.f33906n.G1(true, true);
                                g51Var2.f33906n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.f33911y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar22 = g51Var4.h;
                        bVar22.setText("");
                        g51Var4.f33911y.v(null, true, false);
                        d61 d61Var2 = g51Var4.f33906n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.f33906n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f33904c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(g51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g51 g51Var2 = g51Var;
                        dh.b bVar2 = g51Var2.h;
                        if (g51Var2.f33905f.f24913k == 1) {
                            bVar2.setText("");
                            g51Var2.f33911y.v(null, true, false);
                            d61 d61Var = g51Var2.f33906n;
                            if (d61Var != null) {
                                d61Var.F1(null);
                                g51Var2.f33906n.G1(true, true);
                                g51Var2.f33906n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            g51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        g51 g51Var3 = g51Var;
                        q61 q61Var2 = g51Var3.f33911y;
                        if (!q61Var2.u()) {
                            q61Var2.q();
                            g51Var3.h.requestFocus();
                            q61.a(q61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        g51 g51Var4 = g51Var;
                        dh.b bVar22 = g51Var4.h;
                        bVar22.setText("");
                        g51Var4.f33911y.v(null, true, false);
                        d61 d61Var2 = g51Var4.f33906n;
                        if (d61Var2 != null) {
                            d61Var2.F1(null);
                            g51Var4.f33906n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        g51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        if (!mg.g0.d) {
            b();
        }
    }

    public static void a(g51 g51Var, boolean z4) {
        if (z4) {
            if (g51Var.v == null) {
                vy0 vy0Var = new vy0(g51Var, 16);
                g51Var.v = vy0Var;
                AndroidUtilities.runOnUIThread(vy0Var, 340L);
                return;
            }
            return;
        }
        vy0 vy0Var2 = g51Var.v;
        if (vy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(vy0Var2);
            g51Var.v = null;
        }
        AndroidUtilities.updateViewShow(g51Var.f33904c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e61.b():void");
    }

    public final void c(boolean z4) {
        float f10;
        if (z4 == this.f33909w) {
            return;
        }
        this.f33909w = z4;
        ValueAnimator valueAnimator = this.f33908s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f33907r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f33908s = ofFloat;
        ofFloat.addUpdateListener(new h11(this, 9));
        this.f33908s.setDuration(120L);
        this.f33908s.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f33908s.start();
    }

    public final void d(boolean z4) {
        ?? r62;
        String str;
        d61 d61Var;
        d61 d61Var2;
        org.telegram.ui.Components.fn0 fn0Var = this.f33905f;
        int i10 = fn0Var.f24913k;
        dh.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((d61Var2 = this.f33906n) != null && d61Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (bVar.length() <= 0 && ((d61Var = this.f33906n) == null || d61Var.f30756l3 <= 0.5f || (!d61Var.f30751g3 && d61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        fn0Var.b(r62);
        ImageView imageView = this.f33903b;
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
        if (this.f33910x) {
            this.f33902a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f33911y.W0))));
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
