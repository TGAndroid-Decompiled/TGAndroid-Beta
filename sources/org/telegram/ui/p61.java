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
public abstract class p61 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final FrameLayout f39366a;
    public final ImageView f39367b;
    public final ImageView f39368c;
    public final org.telegram.ui.Components.vg0 d;
    public final View f39369e;
    public final org.telegram.ui.Components.qn0 f39370f;
    public final org.telegram.ui.Cells.c6 h;
    public o61 f39371n;
    public float f39372r;
    public ValueAnimator f39373s;
    public hz0 v;
    public boolean f39374w;
    public boolean f39375x;
    public final a71 f39376y;

    public p61(a71 a71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = a71Var.Z0;
        this.f39376y = a71Var;
        this.f39374w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39366a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.f0.f50993a;
        frameLayout.setOutlineProvider(new yf.d0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f39367b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0();
        this.f39370f = qn0Var;
        qn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.i6.Je;
        qn0Var.a(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        imageView.setImageDrawable(qn0Var);
        final r51 r51Var = (r51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r51 r51Var2 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var = r51Var2.h;
                        if (r51Var2.f39370f.f30135k == 1) {
                            c6Var.setText("");
                            r51Var2.f39376y.v(null, true, false);
                            o61 o61Var = r51Var2.f39371n;
                            if (o61Var != null) {
                                o61Var.G1(null);
                                r51Var2.f39371n.H1(true, true);
                                r51Var2.f39371n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                            r51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r51 r51Var3 = r51Var;
                        a71 a71Var2 = r51Var3.f39376y;
                        if (!a71Var2.u()) {
                            a71Var2.q();
                            r51Var3.h.requestFocus();
                            a71.a(a71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r51 r51Var4 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r51Var4.h;
                        c6Var2.setText("");
                        r51Var4.f39376y.v(null, true, false);
                        o61 o61Var2 = r51Var4.f39371n;
                        if (o61Var2 != null) {
                            o61Var2.G1(null);
                            r51Var4.f39371n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                        r51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.vg0 vg0Var = new org.telegram.ui.Components.vg0(r51Var, context, z10);
        this.d = vg0Var;
        frameLayout.addView(vg0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(r51Var, context, d6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new m0(r51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Mh, d6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        vg0Var.addView(c6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f39369e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            vg0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r51 r51Var2 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r51Var2.h;
                        if (r51Var2.f39370f.f30135k == 1) {
                            c6Var2.setText("");
                            r51Var2.f39376y.v(null, true, false);
                            o61 o61Var = r51Var2.f39371n;
                            if (o61Var != null) {
                                o61Var.G1(null);
                                r51Var2.f39371n.H1(true, true);
                                r51Var2.f39371n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                            r51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r51 r51Var3 = r51Var;
                        a71 a71Var2 = r51Var3.f39376y;
                        if (!a71Var2.u()) {
                            a71Var2.q();
                            r51Var3.h.requestFocus();
                            a71.a(a71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r51 r51Var4 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = r51Var4.h;
                        c6Var22.setText("");
                        r51Var4.f39376y.v(null, true, false);
                        o61 o61Var2 = r51Var4.f39371n;
                        if (o61Var2 != null) {
                            o61Var2.G1(null);
                            r51Var4.f39371n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                        r51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f39368c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(r51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20918i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r51 r51Var2 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r51Var2.h;
                        if (r51Var2.f39370f.f30135k == 1) {
                            c6Var2.setText("");
                            r51Var2.f39376y.v(null, true, false);
                            o61 o61Var = r51Var2.f39371n;
                            if (o61Var != null) {
                                o61Var.G1(null);
                                r51Var2.f39371n.H1(true, true);
                                r51Var2.f39371n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                            r51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r51 r51Var3 = r51Var;
                        a71 a71Var2 = r51Var3.f39376y;
                        if (!a71Var2.u()) {
                            a71Var2.q();
                            r51Var3.h.requestFocus();
                            a71.a(a71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r51 r51Var4 = r51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = r51Var4.h;
                        c6Var22.setText("");
                        r51Var4.f39376y.v(null, true, false);
                        o61 o61Var2 = r51Var4.f39371n;
                        if (o61Var2 != null) {
                            o61Var2.G1(null);
                            r51Var4.f39371n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                        r51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (!zg.c0.d) {
            b();
        }
    }

    public static void a(r51 r51Var, boolean z10) {
        if (z10) {
            if (r51Var.v == null) {
                hz0 hz0Var = new hz0(r51Var, 15);
                r51Var.v = hz0Var;
                AndroidUtilities.runOnUIThread(hz0Var, 340L);
                return;
            }
            return;
        }
        hz0 hz0Var2 = r51Var.v;
        if (hz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(hz0Var2);
            r51Var.v = null;
        }
        AndroidUtilities.updateViewShow(r51Var.f39368c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f39374w) {
            return;
        }
        this.f39374w = z10;
        ValueAnimator valueAnimator = this.f39373s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f39372r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39373s = ofFloat;
        ofFloat.addUpdateListener(new b21(this, 8));
        this.f39373s.setDuration(120L);
        this.f39373s.setInterpolator(org.telegram.ui.Components.tr.h);
        this.f39373s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        o61 o61Var;
        o61 o61Var2;
        org.telegram.ui.Components.qn0 qn0Var = this.f39370f;
        int i10 = qn0Var.f30135k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((o61Var2 = this.f39371n) != null && o61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((o61Var = this.f39371n) == null || o61Var.f30974v3 <= 0.5f || (!o61Var.f30969q3 && o61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        qn0Var.b(r62);
        ImageView imageView = this.f39367b;
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
        if (this.f39375x) {
            this.f39366a.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.f39376y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.c0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
