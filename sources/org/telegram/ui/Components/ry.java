package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class ry extends FrameLayout implements vd.b {
    public rp A;
    public boolean B;
    public final fz C;
    public final vd.a f32409a;
    public final int f32410b;
    public final vm0 f32411c;
    public final cq d;
    public final View f32412e;
    public final View f32413f;
    public final ImageView h;
    public final FrameLayout f32414n;
    public final qy f32415r;
    public final bg.d1 f32416s;
    public final View v;
    public float f32417w;
    public boolean f32418x;
    public ValueAnimator f32419y;

    public ry(fz fzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        this.C = fzVar;
        this.f32409a = new vd.a(0, this, jr.f29801g, 200L, false);
        this.f32418x = false;
        this.f32410b = i10;
        View view = new View(context);
        this.f32412e = view;
        view.setVisibility(4);
        int A5 = fzVar.A(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = fzVar.f28591e2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f32413f = view2;
        if (fzVar.f28625q0) {
            view2.setBackgroundColor(fzVar.A(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, fzVar.X0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32414n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = fzVar.v(0.06f);
        } else {
            A = fzVar.A(org.telegram.ui.ActionBar.g6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, A));
        frameLayout.setClipToOutline(true);
        eg.k1 k1Var = jf.q0.f11668a;
        frameLayout.setOutlineProvider(new jf.p0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bg.d1 d1Var = new bg.d1(this, context, 13);
        this.f32416s = d1Var;
        frameLayout.addView(d1Var, i7.f6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        vm0 vm0Var = new vm0();
        this.f32411c = vm0Var;
        vm0Var.c(0, false, false);
        if (z10) {
            A2 = fzVar.v(0.4f);
        } else {
            A2 = fzVar.A(org.telegram.ui.ActionBar.g6.Je);
        }
        vm0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(vm0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ry f31510b;

            {
                this.f31510b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ry ryVar = this.f31510b;
                        qy qyVar = ryVar.f32415r;
                        cq cqVar = ryVar.d;
                        if (ryVar.f32411c.f33585k == 1) {
                            cqVar.setText("");
                            ryVar.c(null, false);
                            if (qyVar != null) {
                                qyVar.D1();
                                qyVar.F1(null);
                                qyVar.G1(true, true);
                            }
                            ryVar.f(false);
                            cqVar.clearAnimation();
                            cqVar.animate().translationX(0.0f).setInterpolator(jr.h).start();
                            ryVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ry ryVar2 = this.f31510b;
                        cq cqVar2 = ryVar2.d;
                        cqVar2.setText("");
                        ryVar2.c(null, false);
                        qy qyVar2 = ryVar2.f32415r;
                        if (qyVar2 != null) {
                            qyVar2.D1();
                            qyVar2.F1(null);
                            qyVar2.G1(true, true);
                        }
                        ryVar2.f(false);
                        cqVar2.clearAnimation();
                        cqVar2.animate().translationX(0.0f).setInterpolator(jr.h).start();
                        ryVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        cq cqVar = new cq(this, context, i10, 2);
        this.d = cqVar;
        cqVar.setTextSize(1, 16.0f);
        if (z10) {
            A3 = fzVar.v(0.45f);
        } else {
            A3 = fzVar.A(org.telegram.ui.ActionBar.g6.Je);
        }
        cqVar.setHintTextColor(A3);
        if (z10) {
            A4 = fzVar.v(0.8f);
        } else {
            A4 = fzVar.A(org.telegram.ui.ActionBar.g6.G6);
        }
        cqVar.setTextColor(A4);
        cqVar.setBackgroundDrawable(null);
        cqVar.setPadding(0, 0, 0, 0);
        cqVar.setMaxLines(1);
        cqVar.setLines(1);
        cqVar.setSingleLine(true);
        cqVar.setImeOptions(268435459);
        cqVar.setHint(LocaleController.getString(R.string.Search));
        cqVar.setCursorColor(fzVar.A(org.telegram.ui.ActionBar.g6.Mh));
        cqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        cqVar.setCursorWidth(1.5f);
        cqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        d1Var.addView(cqVar, i7.f6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        cqVar.addTextChangedListener(new bh.c(this, 9));
        if (fzVar.f28625q0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(fzVar.A(org.telegram.ui.ActionBar.g6.He), fzVar.A(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            d1Var.addView(view3, i7.f6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new nh.b2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, fzVar.V1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ry f31510b;

            {
                this.f31510b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        ry ryVar = this.f31510b;
                        qy qyVar = ryVar.f32415r;
                        cq cqVar2 = ryVar.d;
                        if (ryVar.f32411c.f33585k == 1) {
                            cqVar2.setText("");
                            ryVar.c(null, false);
                            if (qyVar != null) {
                                qyVar.D1();
                                qyVar.F1(null);
                                qyVar.G1(true, true);
                            }
                            ryVar.f(false);
                            cqVar2.clearAnimation();
                            cqVar2.animate().translationX(0.0f).setInterpolator(jr.h).start();
                            ryVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ry ryVar2 = this.f31510b;
                        cq cqVar22 = ryVar2.d;
                        cqVar22.setText("");
                        ryVar2.c(null, false);
                        qy qyVar2 = ryVar2.f32415r;
                        if (qyVar2 != null) {
                            qyVar2.D1();
                            qyVar2.F1(null);
                            qyVar2.G1(true, true);
                        }
                        ryVar2.f(false);
                        cqVar22.clearAnimation();
                        cqVar22.animate().translationX(0.0f).setInterpolator(jr.h).start();
                        ryVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        if (i10 == 1 && (!fzVar.Y1 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        qy qyVar = new qy(this, context, i11, fzVar.V1, i10);
        this.f32415r = qyVar;
        qyVar.f31507s3 = z10;
        TextPaint paint = cqVar.getPaint();
        qyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) cqVar.getHint()) + "")));
        if (fzVar.f28625q0) {
            qyVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(fzVar.A(org.telegram.ui.ActionBar.g6.He), fzVar.A(org.telegram.ui.ActionBar.g6.Ie)));
        }
        qyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final ry f31804b;

            {
                this.f31804b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ry ryVar = this.f31804b;
                        ryVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ryVar.d(z11);
                        ryVar.g(false);
                        return;
                    default:
                        kw0 kw0Var = (kw0) obj;
                        ry ryVar2 = this.f31804b;
                        fz fzVar2 = ryVar2.C;
                        qy qyVar2 = ryVar2.f32415r;
                        if (kw0Var == null) {
                            ryVar2.d(false);
                            qyVar2.F1(null);
                            fzVar2.f28608k0.d.setText("");
                            fzVar2.f28589e0.h1(0, 0);
                            return;
                        } else if (qyVar2.getSelectedCategory() == kw0Var) {
                            ryVar2.c(null, false);
                            qyVar2.F1(null);
                            return;
                        } else {
                            ryVar2.c(kw0Var.f30158a, false);
                            qyVar2.F1(kw0Var);
                            return;
                        }
                }
            }
        });
        qyVar.setOnTouchListener(new m.d2(this, 2));
        qyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final ry f31804b;

            {
                this.f31804b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ry ryVar = this.f31804b;
                        ryVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ryVar.d(z11);
                        ryVar.g(false);
                        return;
                    default:
                        kw0 kw0Var = (kw0) obj;
                        ry ryVar2 = this.f31804b;
                        fz fzVar2 = ryVar2.C;
                        qy qyVar2 = ryVar2.f32415r;
                        if (kw0Var == null) {
                            ryVar2.d(false);
                            qyVar2.F1(null);
                            fzVar2.f28608k0.d.setText("");
                            fzVar2.f28589e0.h1(0, 0);
                            return;
                        } else if (qyVar2.getSelectedCategory() == kw0Var) {
                            ryVar2.c(null, false);
                            qyVar2.F1(null);
                            return;
                        } else {
                            ryVar2.c(kw0Var.f30158a, false);
                            qyVar2.F1(kw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(qyVar, i7.f6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(ry ryVar, boolean z10, boolean z11) {
        ryVar.f32409a.a(z10, z11);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f32412e;
            view.setAlpha(f9);
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            view.setVisibility(i11);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        fz fzVar = this.C;
        int i10 = this.f32410b;
        if (i10 == 0) {
            az azVar = fzVar.f28642v0;
            yy yyVar = azVar.K;
            fz fzVar2 = azVar.M;
            ow owVar = fzVar2.C0;
            lw lwVar = fzVar2.f28657z0;
            if (azVar.H != 0) {
                ConnectionsManager.getInstance(fzVar2.Y0).cancelRequest(azVar.H, true);
                azVar.H = 0;
            }
            if (TextUtils.isEmpty(str)) {
                azVar.J = null;
                azVar.A.clear();
                azVar.D.clear();
                azVar.G = new ArrayList();
                f2.p0 adapter = lwVar.getAdapter();
                wy wyVar = fzVar2.f28639u0;
                if (adapter != wyVar) {
                    lwVar.setAdapter(wyVar);
                }
                azVar.d = 0L;
                fzVar2.f28574a.a(false, true);
                azVar.l();
                owVar.e(false);
            } else {
                azVar.J = str.toLowerCase();
                owVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(yyVar);
            AndroidUtilities.runOnUIThread(yyVar, 300L);
        } else if (i10 == 1) {
            fzVar.O.F(str, z10);
        } else if (i10 == 2) {
            fzVar.f28593f0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f9;
        if (z10 == this.f32418x) {
            return;
        }
        this.f32418x = z10;
        ValueAnimator valueAnimator = this.f32419y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f32417w;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f32419y = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 22));
        this.f32419y.setDuration(120L);
        this.f32419y.setInterpolator(jr.h);
        this.f32419y.start();
    }

    public final void e(boolean z10) {
        this.B = z10;
        if (z10) {
            this.f32411c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.A == null) {
                rp rpVar = new rp(this, 15);
                this.A = rpVar;
                AndroidUtilities.runOnUIThread(rpVar, 340L);
                return;
            }
            return;
        }
        rp rpVar2 = this.A;
        if (rpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rpVar2);
            this.A = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.B;
        cq cqVar = this.d;
        qy qyVar = this.f32415r;
        if (z11 && ((cqVar.length() != 0 || (qyVar != null && qyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (cqVar.length() <= 0 && (qyVar == null || qyVar.f31499k3 <= 0.5f || (!qyVar.f31494f3 && qyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f32411c.b(i10);
        this.B = false;
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
