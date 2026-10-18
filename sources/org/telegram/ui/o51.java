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
public abstract class o51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final FrameLayout f39671a;
    public final ImageView f39672b;
    public final ImageView f39673c;
    public final org.telegram.ui.Components.dh0 d;
    public final View e;
    public final org.telegram.ui.Components.vn0 f39674f;
    public final org.telegram.ui.Cells.b6 h;
    public n51 f39675n;
    public float f39676r;
    public ValueAnimator f39677s;
    public sy0 v;
    public boolean f39678w;
    public boolean f39679x;
    public final z51 f39680y;

    public o51(z51 z51Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = z51Var.Z0;
        this.f39680y = z51Var;
        this.f39678w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39671a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        frameLayout.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f51574a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f39672b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.vn0 vn0Var = new org.telegram.ui.Components.vn0();
        this.f39674f = vn0Var;
        vn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.h6.Je;
        vn0Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        imageView.setImageDrawable(vn0Var);
        final q41 q41Var = (q41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var = q41Var2.h;
                        if (q41Var2.f39674f.f31328k == 1) {
                            b6Var.setText("");
                            q41Var2.f39680y.v(null, true, false);
                            n51 n51Var = q41Var2.f39675n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.f39675n.H1(true, true);
                                q41Var2.f39675n.E1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.f39680y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var4.h;
                        b6Var2.setText("");
                        q41Var4.f39680y.v(null, true, false);
                        n51 n51Var2 = q41Var4.f39675n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.f39675n.H1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(q41Var, context, z10);
        this.d = dh0Var;
        frameLayout.addView(dh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(q41Var, context, d6Var, 1);
        this.h = b6Var;
        b6Var.addTextChangedListener(new o0(q41Var, 15));
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
        dh0Var.addView(b6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            dh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var2.h;
                        if (q41Var2.f39674f.f31328k == 1) {
                            b6Var2.setText("");
                            q41Var2.f39680y.v(null, true, false);
                            n51 n51Var = q41Var2.f39675n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.f39675n.H1(true, true);
                                q41Var2.f39675n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.f39680y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = q41Var4.h;
                        b6Var22.setText("");
                        q41Var4.f39680y.v(null, true, false);
                        n51 n51Var2 = q41Var4.f39675n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.f39675n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f39673c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(q41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        q41 q41Var2 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var2 = q41Var2.h;
                        if (q41Var2.f39674f.f31328k == 1) {
                            b6Var2.setText("");
                            q41Var2.f39680y.v(null, true, false);
                            n51 n51Var = q41Var2.f39675n;
                            if (n51Var != null) {
                                n51Var.G1(null);
                                q41Var2.f39675n.H1(true, true);
                                q41Var2.f39675n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            q41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        q41 q41Var3 = q41Var;
                        z51 z51Var2 = q41Var3.f39680y;
                        if (!z51Var2.u()) {
                            z51Var2.q();
                            q41Var3.h.requestFocus();
                            z51.a(z51Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        q41 q41Var4 = q41Var;
                        org.telegram.ui.Cells.b6 b6Var22 = q41Var4.h;
                        b6Var22.setText("");
                        q41Var4.f39680y.v(null, true, false);
                        n51 n51Var2 = q41Var4.f39675n;
                        if (n51Var2 != null) {
                            n51Var2.G1(null);
                            q41Var4.f39675n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        q41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (!ah.x0.d) {
            b();
        }
    }

    public static void a(q41 q41Var, boolean z10) {
        if (z10) {
            if (q41Var.v == null) {
                sy0 sy0Var = new sy0(q41Var, 15);
                q41Var.v = sy0Var;
                AndroidUtilities.runOnUIThread(sy0Var, 340L);
                return;
            }
            return;
        }
        sy0 sy0Var2 = q41Var.v;
        if (sy0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(sy0Var2);
            q41Var.v = null;
        }
        AndroidUtilities.updateViewShow(q41Var.f39673c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o51.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f39678w) {
            return;
        }
        this.f39678w = z10;
        ValueAnimator valueAnimator = this.f39677s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f39676r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39677s = ofFloat;
        ofFloat.addUpdateListener(new e11(this, 7));
        this.f39677s.setDuration(120L);
        this.f39677s.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f39677s.start();
    }

    @Override
    public final void d() {
        if (this.f39679x) {
            this.f39671a.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f39680y.Z0))));
        }
    }

    public final void e(boolean z10) {
        ?? r62;
        String str;
        n51 n51Var;
        n51 n51Var2;
        org.telegram.ui.Components.vn0 vn0Var = this.f39674f;
        int i10 = vn0Var.f31328k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((b6Var.length() != 0 || ((n51Var2 = this.f39675n) != null && n51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (b6Var.length() <= 0 && ((n51Var = this.f39675n) == null || n51Var.f29457m3 <= 0.5f || (!n51Var.f29452h3 && n51Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        vn0Var.b(r62);
        ImageView imageView = this.f39672b;
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
