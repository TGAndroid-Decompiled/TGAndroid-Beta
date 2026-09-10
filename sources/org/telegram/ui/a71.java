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
public abstract class a71 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout f30812a;
    public final ImageView f30813b;
    public final ImageView f30814c;
    public final org.telegram.ui.Components.sg0 d;
    public final View e;
    public final org.telegram.ui.Components.hn0 f30815f;
    public final org.telegram.ui.Cells.d6 h;
    public z61 f30816n;
    public float f30817r;
    public ValueAnimator f30818s;
    public k01 v;
    public boolean f30819w;
    public boolean f30820x;
    public final l71 f30821y;

    public a71(l71 l71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = l71Var.Z0;
        this.f30821y = l71Var;
        this.f30819w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30812a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        bi.g gVar = xf.k0.f45156a;
        frameLayout.setOutlineProvider(new xf.j0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.a6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f30813b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0();
        this.f30815f = hn0Var;
        hn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        hn0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(hn0Var);
        final c61 c61Var = (c61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var = c61Var2.h;
                        if (c61Var2.f30815f.f23703k == 1) {
                            d6Var.setText("");
                            c61Var2.f30821y.v(null, true, false);
                            z61 z61Var = c61Var2.f30816n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.f30816n.F1(true, true);
                                c61Var2.f30816n.C1();
                            }
                            d6Var.clearAnimation();
                            d6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.f30821y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var4.h;
                        d6Var2.setText("");
                        c61Var4.f30821y.v(null, true, false);
                        z61 z61Var2 = c61Var4.f30816n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.f30816n.F1(true, true);
                        }
                        d6Var2.clearAnimation();
                        d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(c61Var, context, z10);
        this.d = sg0Var;
        frameLayout.addView(sg0Var, w7.a6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(c61Var, context, f6Var, 1);
        this.h = d6Var;
        d6Var.addTextChangedListener(new m0(c61Var, 15));
        d6Var.setBackground(null);
        d6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        d6Var.setTextSize(1, 16.0f);
        d6Var.setHint(LocaleController.getString(R.string.Search));
        d6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        d6Var.setImeOptions(268435459);
        d6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        d6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        d6Var.setGravity(19);
        d6Var.setCursorWidth(1.5f);
        d6Var.setMaxLines(1);
        d6Var.setSingleLine(true);
        d6Var.setLines(1);
        d6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        sg0Var.addView(d6Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            sg0Var.addView(view, w7.a6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var2.h;
                        if (c61Var2.f30815f.f23703k == 1) {
                            d6Var2.setText("");
                            c61Var2.f30821y.v(null, true, false);
                            z61 z61Var = c61Var2.f30816n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.f30816n.F1(true, true);
                                c61Var2.f30816n.C1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.f30821y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = c61Var4.h;
                        d6Var22.setText("");
                        c61Var4.f30821y.v(null, true, false);
                        z61 z61Var2 = c61Var4.f30816n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.f30816n.F1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f30814c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new bi.v2(c61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        c61 c61Var2 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var2 = c61Var2.h;
                        if (c61Var2.f30815f.f23703k == 1) {
                            d6Var2.setText("");
                            c61Var2.f30821y.v(null, true, false);
                            z61 z61Var = c61Var2.f30816n;
                            if (z61Var != null) {
                                z61Var.E1(null);
                                c61Var2.f30816n.F1(true, true);
                                c61Var2.f30816n.C1();
                            }
                            d6Var2.clearAnimation();
                            d6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                            c61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        c61 c61Var3 = c61Var;
                        l71 l71Var2 = c61Var3.f30821y;
                        if (!l71Var2.u()) {
                            l71Var2.q();
                            c61Var3.h.requestFocus();
                            l71.a(l71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        c61 c61Var4 = c61Var;
                        org.telegram.ui.Cells.d6 d6Var22 = c61Var4.h;
                        d6Var22.setText("");
                        c61Var4.f30821y.v(null, true, false);
                        z61 z61Var2 = c61Var4.f30816n;
                        if (z61Var2 != null) {
                            z61Var2.E1(null);
                            c61Var4.f30816n.F1(true, true);
                        }
                        d6Var22.clearAnimation();
                        d6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                        c61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (!yg.f0.d) {
            b();
        }
    }

    public static void a(c61 c61Var, boolean z10) {
        if (z10) {
            if (c61Var.v == null) {
                k01 k01Var = new k01(c61Var, 14);
                c61Var.v = k01Var;
                AndroidUtilities.runOnUIThread(k01Var, 340L);
                return;
            }
            return;
        }
        k01 k01Var2 = c61Var.v;
        if (k01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(k01Var2);
            c61Var.v = null;
        }
        AndroidUtilities.updateViewShow(c61Var.f30814c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a71.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f30819w) {
            return;
        }
        this.f30819w = z10;
        ValueAnimator valueAnimator = this.f30818s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f30817r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f30818s = ofFloat;
        ofFloat.addUpdateListener(new f21(this, 9));
        this.f30818s.setDuration(120L);
        this.f30818s.setInterpolator(org.telegram.ui.Components.wr.h);
        this.f30818s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        z61 z61Var;
        z61 z61Var2;
        org.telegram.ui.Components.hn0 hn0Var = this.f30815f;
        int i10 = hn0Var.f23703k;
        org.telegram.ui.Cells.d6 d6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((d6Var.length() != 0 || ((z61Var2 = this.f30816n) != null && z61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (d6Var.length() <= 0 && ((z61Var = this.f30816n) == null || z61Var.f23790o3 <= 0.5f || (!z61Var.j3 && z61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        hn0Var.b(r62);
        ImageView imageView = this.f30813b;
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
        if (this.f30820x) {
            this.f30812a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f30821y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
