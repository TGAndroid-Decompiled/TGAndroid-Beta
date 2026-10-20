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
public abstract class m51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final FrameLayout f39113a;
    public final ImageView f39114b;
    public final ImageView f39115c;
    public final org.telegram.ui.Components.eh0 d;
    public final View e;
    public final org.telegram.ui.Components.wn0 f39116f;
    public final org.telegram.ui.Cells.b6 h;
    public l51 f39117n;
    public float f39118r;
    public ValueAnimator f39119s;
    public qy0 v;
    public boolean f39120w;
    public boolean f39121x;
    public final x51 f39122y;

    public m51(x51 x51Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = x51Var.Z0;
        this.f39122y = x51Var;
        this.f39120w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39113a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        frameLayout.setClipToOutline(true);
        ci.o1 o1Var = zf.j0.f51581a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f39114b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.wn0 wn0Var = new org.telegram.ui.Components.wn0();
        this.f39116f = wn0Var;
        wn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.h6.Je;
        wn0Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        imageView.setImageDrawable(wn0Var);
        final o41 o41Var = (o41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o41 o41Var2 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var = o41Var2.h;
                        if (o41Var2.f39116f.f32165k == 1) {
                            b6Var.setText("");
                            o41Var2.f39122y.v(null, true, false);
                            l51 l51Var = o41Var2.f39117n;
                            if (l51Var != null) {
                                l51Var.G1(null);
                                o41Var2.f39117n.H1(true, true);
                                o41Var2.f39117n.E1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            o41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        o41 o41Var3 = o41Var;
                        x51 x51Var2 = o41Var3.f39122y;
                        if (!x51Var2.u()) {
                            x51Var2.q();
                            o41Var3.h.requestFocus();
                            x51.a(x51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        o41 o41Var4 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = o41Var4.h;
                        b6Var2.setText("");
                        o41Var4.f39122y.v(null, true, false);
                        l51 l51Var2 = o41Var4.f39117n;
                        if (l51Var2 != null) {
                            l51Var2.G1(null);
                            o41Var4.f39117n.H1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        o41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(o41Var, context, z10);
        this.d = eh0Var;
        frameLayout.addView(eh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(o41Var, context, d6Var, 1);
        this.h = b6Var;
        b6Var.addTextChangedListener(new o0(o41Var, 15));
        b6Var.setBackground(null);
        b6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        b6Var.setTextSize(1, 16.0f);
        b6Var.setHint(LocaleController.getString(R.string.Search));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        b6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        b6Var.setImeOptions(268435459);
        b6Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        b6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b6Var.setGravity(19);
        b6Var.setCursorWidth(1.5f);
        b6Var.setMaxLines(1);
        b6Var.setSingleLine(true);
        b6Var.setLines(1);
        b6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        eh0Var.addView(b6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            eh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o41 o41Var2 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = o41Var2.h;
                        if (o41Var2.f39116f.f32165k == 1) {
                            b6Var2.setText("");
                            o41Var2.f39122y.v(null, true, false);
                            l51 l51Var = o41Var2.f39117n;
                            if (l51Var != null) {
                                l51Var.G1(null);
                                o41Var2.f39117n.H1(true, true);
                                o41Var2.f39117n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            o41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        o41 o41Var3 = o41Var;
                        x51 x51Var2 = o41Var3.f39122y;
                        if (!x51Var2.u()) {
                            x51Var2.q();
                            o41Var3.h.requestFocus();
                            x51.a(x51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        o41 o41Var4 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = o41Var4.h;
                        b6Var22.setText("");
                        o41Var4.f39122y.v(null, true, false);
                        l51 l51Var2 = o41Var4.f39117n;
                        if (l51Var2 != null) {
                            l51Var2.G1(null);
                            o41Var4.f39117n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        o41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f39115c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(o41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o41 o41Var2 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = o41Var2.h;
                        if (o41Var2.f39116f.f32165k == 1) {
                            b6Var2.setText("");
                            o41Var2.f39122y.v(null, true, false);
                            l51 l51Var = o41Var2.f39117n;
                            if (l51Var != null) {
                                l51Var.G1(null);
                                o41Var2.f39117n.H1(true, true);
                                o41Var2.f39117n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            o41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        o41 o41Var3 = o41Var;
                        x51 x51Var2 = o41Var3.f39122y;
                        if (!x51Var2.u()) {
                            x51Var2.q();
                            o41Var3.h.requestFocus();
                            x51.a(x51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        o41 o41Var4 = o41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = o41Var4.h;
                        b6Var22.setText("");
                        o41Var4.f39122y.v(null, true, false);
                        l51 l51Var2 = o41Var4.f39117n;
                        if (l51Var2 != null) {
                            l51Var2.G1(null);
                            o41Var4.f39117n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        o41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (!ah.x0.d) {
            b();
        }
    }

    public static void a(o41 o41Var, boolean z10) {
        if (z10) {
            if (o41Var.v == null) {
                qy0 qy0Var = new qy0(o41Var, 15);
                o41Var.v = qy0Var;
                AndroidUtilities.runOnUIThread(qy0Var, 340L);
                return;
            }
            return;
        }
        qy0 qy0Var2 = o41Var.v;
        if (qy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qy0Var2);
            o41Var.v = null;
        }
        AndroidUtilities.updateViewShow(o41Var.f39115c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m51.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f39120w) {
            return;
        }
        this.f39120w = z10;
        ValueAnimator valueAnimator = this.f39119s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f39118r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39119s = ofFloat;
        ofFloat.addUpdateListener(new c11(this, 7));
        this.f39119s.setDuration(120L);
        this.f39119s.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f39119s.start();
    }

    @Override
    public final void d() {
        if (this.f39121x) {
            this.f39113a.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f39122y.Z0))));
        }
    }

    public final void e(boolean z10) {
        ?? r62;
        String str;
        l51 l51Var;
        l51 l51Var2;
        org.telegram.ui.Components.wn0 wn0Var = this.f39116f;
        int i10 = wn0Var.f32165k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((b6Var.length() != 0 || ((l51Var2 = this.f39117n) != null && l51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (b6Var.length() <= 0 && ((l51Var = this.f39117n) == null || l51Var.f30045m3 <= 0.5f || (!l51Var.f30040h3 && l51Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        wn0Var.b(r62);
        ImageView imageView = this.f39114b;
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
