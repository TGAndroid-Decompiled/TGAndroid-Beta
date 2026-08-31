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
public abstract class g61 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final FrameLayout f37094a;
    public final ImageView f37095b;
    public final ImageView f37096c;
    public final fg.y d;
    public final View f37097e;
    public final org.telegram.ui.Components.gn0 f37098f;
    public final eh.b h;
    public f61 f37099n;
    public float f37100r;
    public ValueAnimator f37101s;
    public xy0 v;
    public boolean f37102w;
    public boolean f37103x;
    public final r61 f37104y;

    public g61(r61 r61Var, Context context, boolean z4) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = r61Var.W0;
        this.f37104y = r61Var;
        this.f37102w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37094a = frameLayout;
        if (z4) {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
        frameLayout.setClipToOutline(true);
        hg.j1 j1Var = lf.q0.f12504a;
        frameLayout.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, k7.c6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f37095b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.gn0 gn0Var = new org.telegram.ui.Components.gn0();
        this.f37098f = gn0Var;
        gn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        gn0Var.a(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        imageView.setImageDrawable(gn0Var);
        final i51 i51Var = (i51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar = i51Var2.h;
                        if (i51Var2.f37098f.f27235k == 1) {
                            bVar.setText("");
                            i51Var2.f37104y.v(null, true, false);
                            f61 f61Var = i51Var2.f37099n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.f37099n.G1(true, true);
                                i51Var2.f37099n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.f37104y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar2 = i51Var4.h;
                        bVar2.setText("");
                        i51Var4.f37104y.v(null, true, false);
                        f61 f61Var2 = i51Var4.f37099n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.f37099n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        fg.y yVar = new fg.y(i51Var, context, z4);
        this.d = yVar;
        frameLayout.addView(yVar, k7.c6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        eh.b bVar = new eh.b(i51Var, context, g6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(i51Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Mh, g6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z4) {
            View view = new View(context);
            this.f37097e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, k7.c6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar2 = i51Var2.h;
                        if (i51Var2.f37098f.f27235k == 1) {
                            bVar2.setText("");
                            i51Var2.f37104y.v(null, true, false);
                            f61 f61Var = i51Var2.f37099n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.f37099n.G1(true, true);
                                i51Var2.f37099n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.f37104y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar22 = i51Var4.h;
                        bVar22.setText("");
                        i51Var4.f37104y.v(null, true, false);
                        f61 f61Var2 = i51Var4.f37099n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.f37099n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f37096c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(i51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i51 i51Var2 = i51Var;
                        eh.b bVar2 = i51Var2.h;
                        if (i51Var2.f37098f.f27235k == 1) {
                            bVar2.setText("");
                            i51Var2.f37104y.v(null, true, false);
                            f61 f61Var = i51Var2.f37099n;
                            if (f61Var != null) {
                                f61Var.F1(null);
                                i51Var2.f37099n.G1(true, true);
                                i51Var2.f37099n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            i51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i51 i51Var3 = i51Var;
                        r61 r61Var2 = i51Var3.f37104y;
                        if (!r61Var2.u()) {
                            r61Var2.q();
                            i51Var3.h.requestFocus();
                            r61.a(r61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i51 i51Var4 = i51Var;
                        eh.b bVar22 = i51Var4.h;
                        bVar22.setText("");
                        i51Var4.f37104y.v(null, true, false);
                        f61 f61Var2 = i51Var4.f37099n;
                        if (f61Var2 != null) {
                            f61Var2.F1(null);
                            i51Var4.f37099n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        i51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        if (!ng.g0.d) {
            b();
        }
    }

    public static void a(i51 i51Var, boolean z4) {
        if (z4) {
            if (i51Var.v == null) {
                xy0 xy0Var = new xy0(i51Var, 15);
                i51Var.v = xy0Var;
                AndroidUtilities.runOnUIThread(xy0Var, 340L);
                return;
            }
            return;
        }
        xy0 xy0Var2 = i51Var.v;
        if (xy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xy0Var2);
            i51Var.v = null;
        }
        AndroidUtilities.updateViewShow(i51Var.f37096c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g61.b():void");
    }

    public final void c(boolean z4) {
        float f10;
        if (z4 == this.f37102w) {
            return;
        }
        this.f37102w = z4;
        ValueAnimator valueAnimator = this.f37101s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f37100r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f37101s = ofFloat;
        ofFloat.addUpdateListener(new j11(this, 9));
        this.f37101s.setDuration(120L);
        this.f37101s.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f37101s.start();
    }

    public final void d(boolean z4) {
        ?? r62;
        String str;
        f61 f61Var;
        f61 f61Var2;
        org.telegram.ui.Components.gn0 gn0Var = this.f37098f;
        int i10 = gn0Var.f27235k;
        eh.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((f61Var2 = this.f37099n) != null && f61Var2.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (bVar.length() <= 0 && ((f61Var = this.f37099n) == null || f61Var.f33604l3 <= 0.5f || (!f61Var.f33599g3 && f61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        gn0Var.b(r62);
        ImageView imageView = this.f37095b;
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
        if (this.f37103x) {
            this.f37094a.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.f37104y.W0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
