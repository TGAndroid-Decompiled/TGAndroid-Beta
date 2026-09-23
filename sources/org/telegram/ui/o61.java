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
public abstract class o61 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final FrameLayout f35689a;
    public final ImageView f35690b;
    public final ImageView f35691c;
    public final org.telegram.ui.Components.ig0 d;
    public final View e;
    public final org.telegram.ui.Components.ym0 f35692f;
    public final org.telegram.ui.Cells.c6 h;
    public n61 f35693n;
    public float f35694r;
    public ValueAnimator f35695s;
    public xz0 v;
    public boolean f35696w;
    public boolean f35697x;
    public final z61 f35698y;

    public o61(z61 z61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = z61Var.Z0;
        this.f35698y = z61Var;
        this.f35696w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35689a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f46786a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f35690b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0();
        this.f35692f = ym0Var;
        ym0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.h6.Je;
        ym0Var.a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        imageView.setImageDrawable(ym0Var);
        final q51 q51Var = (q51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q51 q51Var2 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var = q51Var2.h;
                        if (q51Var2.f35692f.f30323k == 1) {
                            c6Var.setText("");
                            q51Var2.f35698y.v(null, true, false);
                            n61 n61Var = q51Var2.f35693n;
                            if (n61Var != null) {
                                n61Var.F1(null);
                                q51Var2.f35693n.G1(true, true);
                                q51Var2.f35693n.D1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                            q51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q51 q51Var3 = q51Var;
                        z61 z61Var2 = q51Var3.f35698y;
                        if (!z61Var2.u()) {
                            z61Var2.q();
                            q51Var3.h.requestFocus();
                            z61.a(z61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q51 q51Var4 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = q51Var4.h;
                        c6Var2.setText("");
                        q51Var4.f35698y.v(null, true, false);
                        n61 n61Var2 = q51Var4.f35693n;
                        if (n61Var2 != null) {
                            n61Var2.F1(null);
                            q51Var4.f35693n.G1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                        q51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(q51Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(q51Var, context, d6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new m0(q51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        ig0Var.addView(c6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            ig0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        q51 q51Var2 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = q51Var2.h;
                        if (q51Var2.f35692f.f30323k == 1) {
                            c6Var2.setText("");
                            q51Var2.f35698y.v(null, true, false);
                            n61 n61Var = q51Var2.f35693n;
                            if (n61Var != null) {
                                n61Var.F1(null);
                                q51Var2.f35693n.G1(true, true);
                                q51Var2.f35693n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                            q51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q51 q51Var3 = q51Var;
                        z61 z61Var2 = q51Var3.f35698y;
                        if (!z61Var2.u()) {
                            z61Var2.q();
                            q51Var3.h.requestFocus();
                            z61.a(z61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q51 q51Var4 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = q51Var4.h;
                        c6Var22.setText("");
                        q51Var4.f35698y.v(null, true, false);
                        n61 n61Var2 = q51Var4.f35693n;
                        if (n61Var2 != null) {
                            n61Var2.F1(null);
                            q51Var4.f35693n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                        q51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f35691c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(q51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        q51 q51Var2 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = q51Var2.h;
                        if (q51Var2.f35692f.f30323k == 1) {
                            c6Var2.setText("");
                            q51Var2.f35698y.v(null, true, false);
                            n61 n61Var = q51Var2.f35693n;
                            if (n61Var != null) {
                                n61Var.F1(null);
                                q51Var2.f35693n.G1(true, true);
                                q51Var2.f35693n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                            q51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q51 q51Var3 = q51Var;
                        z61 z61Var2 = q51Var3.f35698y;
                        if (!z61Var2.u()) {
                            z61Var2.q();
                            q51Var3.h.requestFocus();
                            z61.a(z61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q51 q51Var4 = q51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = q51Var4.h;
                        c6Var22.setText("");
                        q51Var4.f35698y.v(null, true, false);
                        n61 n61Var2 = q51Var4.f35693n;
                        if (n61Var2 != null) {
                            n61Var2.F1(null);
                            q51Var4.f35693n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                        q51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.f0.d) {
            b();
        }
    }

    public static void a(q51 q51Var, boolean z10) {
        if (z10) {
            if (q51Var.v == null) {
                xz0 xz0Var = new xz0(q51Var, 14);
                q51Var.v = xz0Var;
                AndroidUtilities.runOnUIThread(xz0Var, 340L);
                return;
            }
            return;
        }
        xz0 xz0Var2 = q51Var.v;
        if (xz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xz0Var2);
            q51Var.v = null;
        }
        AndroidUtilities.updateViewShow(q51Var.f35691c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f35696w) {
            return;
        }
        this.f35696w = z10;
        ValueAnimator valueAnimator = this.f35695s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f35694r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35695s = ofFloat;
        ofFloat.addUpdateListener(new s11(this, 9));
        this.f35695s.setDuration(120L);
        this.f35695s.setInterpolator(org.telegram.ui.Components.rr.h);
        this.f35695s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        n61 n61Var;
        n61 n61Var2;
        org.telegram.ui.Components.ym0 ym0Var = this.f35692f;
        int i10 = ym0Var.f30323k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((n61Var2 = this.f35693n) != null && n61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((n61Var = this.f35693n) == null || n61Var.f29421o3 <= 0.5f || (!n61Var.j3 && n61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ym0Var.b(r62);
        ImageView imageView = this.f35690b;
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
        if (this.f35697x) {
            this.f35689a.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, this.f35698y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
