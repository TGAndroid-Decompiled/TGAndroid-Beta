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
public abstract class g71 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout f36327a;
    public final ImageView f36328b;
    public final ImageView f36329c;
    public final org.telegram.ui.Components.jh0 d;
    public final View e;
    public final org.telegram.ui.Components.ao0 f36330f;
    public final org.telegram.ui.Cells.c6 h;
    public f71 f36331n;
    public float f36332r;
    public ValueAnimator f36333s;
    public uz0 v;
    public boolean f36334w;
    public boolean f36335x;
    public final r71 f36336y;

    public g71(r71 r71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = r71Var.Z0;
        this.f36336y = r71Var;
        this.f36334w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36327a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
        frameLayout.setClipToOutline(true);
        bi.a2 a2Var = zf.j0.f50191a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.a6.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f36328b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0();
        this.f36330f = ao0Var;
        ao0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.g6.Je;
        ao0Var.a(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        imageView.setImageDrawable(ao0Var);
        final i61 i61Var = (i61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = i61Var2.h;
                        if (i61Var2.f36330f.f23591k == 1) {
                            c6Var2.setText("");
                            i61Var2.f36336y.v(null, true, false);
                            f71 f71Var = i61Var2.f36331n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.f36331n.H1(true, true);
                                i61Var2.f36331n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.f36336y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.f36336y.v(null, true, false);
                        f71 f71Var2 = i61Var4.f36331n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.f36331n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(i61Var, context, z10);
        this.d = jh0Var;
        frameLayout.addView(jh0Var, w7.a6.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(i61Var, context, c6Var, 1);
        this.h = c6Var2;
        c6Var2.addTextChangedListener(new n0(i61Var, 15));
        c6Var2.setBackground(null);
        c6Var2.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var2.setTextSize(1, 16.0f);
        c6Var2.setHint(LocaleController.getString(R.string.Search));
        c6Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        c6Var2.setImeOptions(268435459);
        c6Var2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        c6Var2.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var2.setGravity(19);
        c6Var2.setCursorWidth(1.5f);
        c6Var2.setMaxLines(1);
        c6Var2.setSingleLine(true);
        c6Var2.setLines(1);
        c6Var2.setTranslationY(AndroidUtilities.dp(-1.0f));
        jh0Var.addView(c6Var2, w7.a6.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            jh0Var.addView(view, w7.a6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = i61Var2.h;
                        if (i61Var2.f36330f.f23591k == 1) {
                            c6Var22.setText("");
                            i61Var2.f36336y.v(null, true, false);
                            f71 f71Var = i61Var2.f36331n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.f36331n.H1(true, true);
                                i61Var2.f36331n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.f36336y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.f36336y.v(null, true, false);
                        f71 f71Var2 = i61Var4.f36331n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.f36331n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f36329c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.i2(i61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i61 i61Var2 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = i61Var2.h;
                        if (i61Var2.f36330f.f23591k == 1) {
                            c6Var22.setText("");
                            i61Var2.f36336y.v(null, true, false);
                            f71 f71Var = i61Var2.f36331n;
                            if (f71Var != null) {
                                f71Var.G1(null);
                                i61Var2.f36331n.H1(true, true);
                                i61Var2.f36331n.E1();
                            }
                            c6Var22.clearAnimation();
                            c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                            i61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i61 i61Var3 = i61Var;
                        r71 r71Var2 = i61Var3.f36336y;
                        if (!r71Var2.u()) {
                            r71Var2.q();
                            i61Var3.h.requestFocus();
                            r71.a(r71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i61 i61Var4 = i61Var;
                        org.telegram.ui.Cells.c6 c6Var3 = i61Var4.h;
                        c6Var3.setText("");
                        i61Var4.f36336y.v(null, true, false);
                        f71 f71Var2 = i61Var4.f36331n;
                        if (f71Var2 != null) {
                            f71Var2.G1(null);
                            i61Var4.f36331n.H1(true, true);
                        }
                        c6Var3.clearAnimation();
                        c6Var3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                        i61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (!ah.x0.d) {
            b();
        }
    }

    public static void a(i61 i61Var, boolean z10) {
        if (z10) {
            if (i61Var.v == null) {
                uz0 uz0Var = new uz0(i61Var, 15);
                i61Var.v = uz0Var;
                AndroidUtilities.runOnUIThread(uz0Var, 340L);
                return;
            }
            return;
        }
        uz0 uz0Var2 = i61Var.v;
        if (uz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(uz0Var2);
            i61Var.v = null;
        }
        AndroidUtilities.updateViewShow(i61Var.f36329c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g71.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f36334w) {
            return;
        }
        this.f36334w = z10;
        ValueAnimator valueAnimator = this.f36333s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f36332r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36333s = ofFloat;
        ofFloat.addUpdateListener(new f21(this, 9));
        this.f36333s.setDuration(120L);
        this.f36333s.setInterpolator(org.telegram.ui.Components.es.h);
        this.f36333s.start();
    }

    @Override
    public final void d() {
        if (this.f36335x) {
            this.f36327a.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.f36336y.Z0))));
        }
    }

    public final void e(boolean z10) {
        ?? r62;
        String str;
        f71 f71Var;
        f71 f71Var2;
        org.telegram.ui.Components.ao0 ao0Var = this.f36330f;
        int i10 = ao0Var.f23591k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((f71Var2 = this.f36331n) != null && f71Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((f71Var = this.f36331n) == null || f71Var.f29809m3 <= 0.5f || (!f71Var.f29804h3 && f71Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ao0Var.b(r62);
        ImageView imageView = this.f36328b;
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

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
