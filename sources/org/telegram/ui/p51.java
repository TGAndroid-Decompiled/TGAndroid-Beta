package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class p51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final a61 F;
    public final FrameLayout f40335a;
    public final ImageView f40336b;
    public final ImageView f40337c;
    public final org.telegram.ui.Components.gh0 d;
    public final View e;
    public final org.telegram.ui.Components.yn0 f40338f;
    public final org.telegram.ui.Cells.c6 h;
    public o51 f40339n;
    public float f40340r;
    public ValueAnimator f40341s;
    public ly0 v;
    public boolean f40342w;
    public boolean f40343x;
    public ShapeDrawable f40344y;

    public p51(a61 a61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = a61Var.Z0;
        this.F = a61Var;
        this.f40342w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40335a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, g6Var);
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.He;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, g6Var);
        frameLayout.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f52046a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f40336b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.yn0 yn0Var = new org.telegram.ui.Components.yn0();
        this.f40338f = yn0Var;
        yn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        yn0Var.a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        imageView.setImageDrawable(yn0Var);
        final r41 r41Var = (r41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var = r41Var2.h;
                        if (r41Var2.f40338f.f33003k == 1) {
                            c6Var.setText("");
                            r41Var2.F.v(null, true, false);
                            o51 o51Var = r41Var2.f40339n;
                            if (o51Var != null) {
                                o51Var.L1(null);
                                r41Var2.f40339n.M1(true, true);
                                r41Var2.f40339n.J1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                            r41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.F;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r41 r41Var4 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r41Var4.h;
                        c6Var2.setText("");
                        r41Var4.F.v(null, true, false);
                        o51 o51Var2 = r41Var4.f40339n;
                        if (o51Var2 != null) {
                            o51Var2.L1(null);
                            r41Var4.f40339n.M1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                        r41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(r41Var, context, z10);
        this.d = gh0Var;
        frameLayout.addView(gh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(r41Var, context, g6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new n0(r41Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.r6.F(c6Var, i11, g6Var);
        org.telegram.ui.ActionBar.r6.W(c6Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        c6Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(c6Var, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        gh0Var.addView(c6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.r6.z(this, mutate, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            gh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r41Var2.h;
                        if (r41Var2.f40338f.f33003k == 1) {
                            c6Var2.setText("");
                            r41Var2.F.v(null, true, false);
                            o51 o51Var = r41Var2.f40339n;
                            if (o51Var != null) {
                                o51Var.L1(null);
                                r41Var2.f40339n.M1(true, true);
                                r41Var2.f40339n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                            r41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.F;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r41 r41Var4 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = r41Var4.h;
                        c6Var22.setText("");
                        r41Var4.F.v(null, true, false);
                        o51 o51Var2 = r41Var4.f40339n;
                        if (o51Var2 != null) {
                            o51Var2.L1(null);
                            r41Var4.f40339n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                        r41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f40337c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(r41Var));
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O2, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = r41Var2.h;
                        if (r41Var2.f40338f.f33003k == 1) {
                            c6Var2.setText("");
                            r41Var2.F.v(null, true, false);
                            o51 o51Var = r41Var2.f40339n;
                            if (o51Var != null) {
                                o51Var.L1(null);
                                r41Var2.f40339n.M1(true, true);
                                r41Var2.f40339n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                            r41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.F;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        r41 r41Var4 = r41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = r41Var4.h;
                        c6Var22.setText("");
                        r41Var4.F.v(null, true, false);
                        o51 o51Var2 = r41Var4.f40339n;
                        if (o51Var2 != null) {
                            o51Var2.L1(null);
                            r41Var4.f40339n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                        r41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (!ah.x0.d) {
            b();
        }
    }

    public static void a(r41 r41Var, boolean z10) {
        if (z10) {
            if (r41Var.v == null) {
                ly0 ly0Var = new ly0(r41Var, 16);
                r41Var.v = ly0Var;
                AndroidUtilities.runOnUIThread(ly0Var, 340L);
                return;
            }
            return;
        }
        ly0 ly0Var2 = r41Var.v;
        if (ly0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ly0Var2);
            r41Var.v = null;
        }
        AndroidUtilities.updateViewShow(r41Var.f40337c, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p51.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f40342w) {
            return;
        }
        this.f40342w = z10;
        ValueAnimator valueAnimator = this.f40341s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f40340r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40341s = ofFloat;
        ofFloat.addUpdateListener(new f11(this, 7));
        this.f40341s.setDuration(120L);
        this.f40341s.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f40341s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        o51 o51Var;
        o51 o51Var2;
        org.telegram.ui.Components.yn0 yn0Var = this.f40338f;
        int i10 = yn0Var.f33003k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((o51Var2 = this.f40339n) != null && o51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((o51Var = this.f40339n) == null || o51Var.f30926p3 <= 0.5f || (!o51Var.f30921k3 && o51Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        yn0Var.b(r62);
        ImageView imageView = this.f40336b;
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

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.g6 g6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.yn0 yn0Var = this.f40338f;
            if (yn0Var != null) {
                yn0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f40343x && (frameLayout = this.f40335a) != null) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
            if (this.f40344y != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.f40344y;
                if (background == shapeDrawable) {
                    if (o12 != this.E) {
                        org.telegram.ui.ActionBar.k6.z1(o12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = o12;
                }
            }
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), o12);
            this.f40344y = c02;
            frameLayout.setBackground(c02);
            this.E = o12;
        }
    }
}
