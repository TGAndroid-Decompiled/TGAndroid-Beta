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
public abstract class q51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final b61 F;
    public final FrameLayout f40627a;
    public final ImageView f40628b;
    public final ImageView f40629c;
    public final org.telegram.ui.Components.hh0 d;
    public final View e;
    public final org.telegram.ui.Components.zn0 f40630f;
    public final org.telegram.ui.Cells.c6 h;
    public p51 f40631n;
    public float f40632r;
    public ValueAnimator f40633s;
    public my0 v;
    public boolean f40634w;
    public boolean f40635x;
    public ShapeDrawable f40636y;

    public q51(b61 b61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = b61Var.Z0;
        this.F = b61Var;
        this.f40634w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40627a = frameLayout;
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
        ci.n1 n1Var = zf.j0.f52047a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f40628b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0();
        this.f40630f = zn0Var;
        zn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        zn0Var.a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        imageView.setImageDrawable(zn0Var);
        final s41 s41Var = (s41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var = s41Var2.h;
                        if (s41Var2.f40630f.f33293k == 1) {
                            c6Var.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.f40631n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.f40631n.M1(true, true);
                                s41Var2.f40631n.J1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var4.h;
                        c6Var2.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.f40631n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.f40631n.M1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(s41Var, context, z10);
        this.d = hh0Var;
        frameLayout.addView(hh0Var, w7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(s41Var, context, g6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new n0(s41Var, 15));
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
        hh0Var.addView(c6Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.r6.z(this, mutate, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            hh0Var.addView(view, w7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var2.h;
                        if (s41Var2.f40630f.f33293k == 1) {
                            c6Var2.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.f40631n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.f40631n.M1(true, true);
                                s41Var2.f40631n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = s41Var4.h;
                        c6Var22.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.f40631n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.f40631n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f40629c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(s41Var));
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
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
                        s41 s41Var2 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var2 = s41Var2.h;
                        if (s41Var2.f40630f.f33293k == 1) {
                            c6Var2.setText("");
                            s41Var2.F.v(null, true, false);
                            p51 p51Var = s41Var2.f40631n;
                            if (p51Var != null) {
                                p51Var.L1(null);
                                s41Var2.f40631n.M1(true, true);
                                s41Var2.f40631n.J1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            s41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        s41 s41Var3 = s41Var;
                        b61 b61Var2 = s41Var3.F;
                        if (!b61Var2.u()) {
                            b61Var2.q();
                            s41Var3.h.requestFocus();
                            b61.a(b61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        s41 s41Var4 = s41Var;
                        org.telegram.ui.Cells.c6 c6Var22 = s41Var4.h;
                        c6Var22.setText("");
                        s41Var4.F.v(null, true, false);
                        p51 p51Var2 = s41Var4.f40631n;
                        if (p51Var2 != null) {
                            p51Var2.L1(null);
                            s41Var4.f40631n.M1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                        s41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (!ah.x0.d) {
            b();
        }
    }

    public static void a(s41 s41Var, boolean z10) {
        if (z10) {
            if (s41Var.v == null) {
                my0 my0Var = new my0(s41Var, 16);
                s41Var.v = my0Var;
                AndroidUtilities.runOnUIThread(my0Var, 340L);
                return;
            }
            return;
        }
        my0 my0Var2 = s41Var.v;
        if (my0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(my0Var2);
            s41Var.v = null;
        }
        AndroidUtilities.updateViewShow(s41Var.f40629c, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q51.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f40634w) {
            return;
        }
        this.f40634w = z10;
        ValueAnimator valueAnimator = this.f40633s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f40632r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40633s = ofFloat;
        ofFloat.addUpdateListener(new g11(this, 7));
        this.f40633s.setDuration(120L);
        this.f40633s.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f40633s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        p51 p51Var;
        p51 p51Var2;
        org.telegram.ui.Components.zn0 zn0Var = this.f40630f;
        int i10 = zn0Var.f33293k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((p51Var2 = this.f40631n) != null && p51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((p51Var = this.f40631n) == null || p51Var.f31246p3 <= 0.5f || (!p51Var.f31241k3 && p51Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        zn0Var.b(r62);
        ImageView imageView = this.f40628b;
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
            org.telegram.ui.Components.zn0 zn0Var = this.f40630f;
            if (zn0Var != null) {
                zn0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f40635x && (frameLayout = this.f40627a) != null) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
            if (this.f40636y != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.f40636y;
                if (background == shapeDrawable) {
                    if (o12 != this.E) {
                        org.telegram.ui.ActionBar.k6.z1(o12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = o12;
                }
            }
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), o12);
            this.f40636y = c02;
            frameLayout.setBackground(c02);
            this.E = o12;
        }
    }
}
