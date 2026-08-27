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
import org.telegram.messenger.Utilities;

public abstract class p51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final FrameLayout f41272a;

    public final ImageView f41273b;

    public final ImageView f41274c;
    public final ag.d0 d;

    public final View f41275e;

    public final org.telegram.ui.Components.lm0 f41276f;
    public final gh.r h;

    public o51 f41277n;

    public float f41278r;

    public ValueAnimator f41279s;
    public ky0 v;

    public boolean f41280w;

    public boolean f41281x;

    public final a61 f41282y;

    public p51(a61 a61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = a61Var.V0;
        this.f41282y = a61Var;
        final int i10 = 0;
        this.f41280w = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41272a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int iDp = AndroidUtilities.dp(18.0f);
        int i12 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        frameLayout.setClipToOutline(true);
        float fDp = AndroidUtilities.dp(18.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        frameLayout.setOutlineProvider(new gf.q0(0, fDp));
        addView(frameLayout, h7.z5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f41273b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0();
        this.f41276f = lm0Var;
        lm0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.g6.Je;
        lm0Var.a(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        imageView.setImageDrawable(lm0Var);
        final r41 r41Var = (r41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar = r41Var2.h;
                        if (r41Var2.f41276f.f30421k == 1) {
                            rVar.setText("");
                            r41Var2.f41282y.v(null, true, false);
                            o51 o51Var = r41Var2.f41277n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.f41277n.G1(true, true);
                                r41Var2.f41277n.D1();
                            }
                            rVar.clearAnimation();
                            rVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.f41282y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar2 = r41Var4.h;
                        rVar2.setText("");
                        r41Var4.f41282y.v(null, true, false);
                        o51 o51Var2 = r41Var4.f41277n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.f41277n.G1(true, true);
                        }
                        rVar2.clearAnimation();
                        rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, h7.z5.e(36, 36, 51));
        ag.d0 d0Var = new ag.d0(r41Var, context, z10);
        this.d = d0Var;
        frameLayout.addView(d0Var, h7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        gh.r rVar = new gh.r(r41Var, context, c6Var, i14);
        this.h = rVar;
        rVar.addTextChangedListener(new p0(r41Var, 15));
        rVar.setBackground(null);
        rVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        rVar.setTextSize(1, 16.0f);
        rVar.setHint(LocaleController.getString(R.string.Search));
        rVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setImeOptions(268435459);
        rVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        rVar.setCursorSize(AndroidUtilities.dp(20.0f));
        rVar.setGravity(19);
        rVar.setCursorWidth(1.5f);
        rVar.setMaxLines(1);
        rVar.setSingleLine(true);
        rVar.setLines(1);
        rVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        d0Var.addView(rVar, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f41275e = view;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(drawableMutate);
            view.setAlpha(0.0f);
            d0Var.addView(view, h7.z5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar2 = r41Var2.h;
                        if (r41Var2.f41276f.f30421k == 1) {
                            rVar2.setText("");
                            r41Var2.f41282y.v(null, true, false);
                            o51 o51Var = r41Var2.f41277n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.f41277n.G1(true, true);
                                r41Var2.f41277n.D1();
                            }
                            rVar2.clearAnimation();
                            rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.f41282y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar3 = r41Var4.h;
                        rVar3.setText("");
                        r41Var4.f41282y.v(null, true, false);
                        o51 o51Var2 = r41Var4.f41277n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.f41277n.G1(true, true);
                        }
                        rVar3.clearAnimation();
                        rVar3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f41274c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new lh.c2(r41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        r41 r41Var2 = r41Var;
                        gh.r rVar2 = r41Var2.h;
                        if (r41Var2.f41276f.f30421k == 1) {
                            rVar2.setText("");
                            r41Var2.f41282y.v(null, true, false);
                            o51 o51Var = r41Var2.f41277n;
                            if (o51Var != null) {
                                o51Var.F1(null);
                                r41Var2.f41277n.G1(true, true);
                                r41Var2.f41277n.D1();
                            }
                            rVar2.clearAnimation();
                            rVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            r41Var2.c(false);
                        }
                        break;
                    case 1:
                        r41 r41Var3 = r41Var;
                        a61 a61Var2 = r41Var3.f41282y;
                        if (!a61Var2.u()) {
                            a61Var2.q();
                            r41Var3.h.requestFocus();
                            a61.a(a61Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        r41 r41Var4 = r41Var;
                        gh.r rVar3 = r41Var4.h;
                        rVar3.setText("");
                        r41Var4.f41282y.v(null, true, false);
                        o51 o51Var2 = r41Var4.f41277n;
                        if (o51Var2 != null) {
                            o51Var2.F1(null);
                            r41Var4.f41277n.G1(true, true);
                        }
                        rVar3.clearAnimation();
                        rVar3.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        r41Var4.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, h7.z5.e(36, 36, 53));
        if (ig.g0.d) {
            return;
        }
        b();
    }

    public static void a(r41 r41Var, boolean z10) {
        if (z10) {
            if (r41Var.v == null) {
                ky0 ky0Var = new ky0(r41Var, 16);
                r41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = r41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            r41Var.v = null;
        }
        AndroidUtilities.updateViewShow(r41Var.f41274c, false);
    }

    public final void b() {
        a61 a61Var = this.f41282y;
        int i10 = a61Var.S;
        if (this.f41277n != null || getContext() == null) {
            return;
        }
        int i11 = 2;
        if (i10 == 1 || i10 == 11 || i10 == 2 || i10 == 0 || i10 == 12 || i10 == 4 || i10 == 10 || i10 == 9 || i10 == 14) {
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 != 4) {
                if (i10 != 12) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            }
            o51 o51Var = new o51(this, getContext(), i11, a61Var.V0);
            this.f41277n = o51Var;
            o51Var.setShownButtonsAtStart(i10 == 4 ? 6.5f : 4.5f);
            o51 o51Var2 = this.f41277n;
            gh.r rVar = this.h;
            o51Var2.setDontOccupyWidth((int) rVar.getPaint().measureText(((Object) rVar.getHint()) + ""));
            final int i12 = 0;
            this.f41277n.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {

                public final p51 f40370b;

                {
                    this.f40370b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            Integer num = (Integer) obj;
                            p51 p51Var = this.f40370b;
                            p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            p51Var.c(num.intValue() > 0);
                            p51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                            p51 p51Var2 = this.f40370b;
                            a61 a61Var2 = p51Var2.f41282y;
                            if (p51Var2.f41277n.getSelectedCategory() != cw0Var) {
                                a61Var2.v(cw0Var.f27559a, false, false);
                                p51Var2.f41277n.F1(cw0Var);
                            } else {
                                a61Var2.v(null, false, false);
                                p51Var2.f41277n.F1(null);
                            }
                            break;
                    }
                }
            });
            final int i13 = 1;
            this.f41277n.setOnCategoryClick(new Utilities.Callback(this) {

                public final p51 f40370b;

                {
                    this.f40370b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i13) {
                        case 0:
                            Integer num = (Integer) obj;
                            p51 p51Var = this.f40370b;
                            p51Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            p51Var.c(num.intValue() > 0);
                            p51Var.e(false);
                            break;
                        default:
                            org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) obj;
                            p51 p51Var2 = this.f40370b;
                            a61 a61Var2 = p51Var2.f41282y;
                            if (p51Var2.f41277n.getSelectedCategory() != cw0Var) {
                                a61Var2.v(cw0Var.f27559a, false, false);
                                p51Var2.f41277n.F1(cw0Var);
                            } else {
                                a61Var2.v(null, false, false);
                                p51Var2.f41277n.F1(null);
                            }
                            break;
                    }
                }
            });
            this.f41272a.addView(this.f41277n, h7.z5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.f41280w) {
            return;
        }
        this.f41280w = z10;
        ValueAnimator valueAnimator = this.f41279s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f41278r, z10 ? 1.0f : 0.0f);
        this.f41279s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w01(this, 9));
        this.f41279s.setDuration(120L);
        this.f41279s.setInterpolator(org.telegram.ui.Components.er.h);
        this.f41279s.start();
    }

    @Override
    public final void d() {
        if (this.f41281x) {
            this.f41272a.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.f41282y.V0))));
        }
    }

    public final void e(boolean z10) {
        o51 o51Var;
        o51 o51Var2;
        org.telegram.ui.Components.lm0 lm0Var = this.f41276f;
        int i10 = lm0Var.f30421k;
        gh.r rVar = this.h;
        if (i10 != 2 || ((rVar.length() == 0 && ((o51Var2 = this.f41277n) == null || o51Var2.getSelectedCategory() == null)) || z10)) {
            ?? r10 = (rVar.length() > 0 || ((o51Var = this.f41277n) != null && o51Var.f28846k3 > 0.5f && (o51Var.f28841f3 || o51Var.getSelectedCategory() != null))) ? 1 : 0;
            lm0Var.b(r10);
            ImageView imageView = this.f41273b;
            imageView.setClickable(r10);
            imageView.setContentDescription(r10 != 0 ? LocaleController.getString(R.string.AccDescrGoBack) : null);
            imageView.setImportantForAccessibility(r10 != 0 ? 1 : 2);
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
