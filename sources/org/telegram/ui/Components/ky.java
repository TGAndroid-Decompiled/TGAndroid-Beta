package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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

public abstract class ky extends FrameLayout implements ud.b {
    public lp A;
    public boolean B;
    public final yy C;

    public final ud.a f30212a;

    public final int f30213b;

    public final lm0 f30214c;
    public final wp d;

    public final View f30215e;

    public final View f30216f;
    public final ImageView h;

    public final FrameLayout f30217n;

    public final jy f30218r;

    public final ag.y1 f30219s;
    public final View v;

    public float f30220w;

    public boolean f30221x;

    public ValueAnimator f30222y;

    public ky(yy yyVar, Context context, int i10) {
        super(context);
        this.C = yyVar;
        final int i11 = 0;
        this.f30212a = new ud.a(0, this, er.f28123g, 200L, false);
        this.f30221x = false;
        this.f30213b = i10;
        View view = new View(context);
        this.f30215e = view;
        view.setVisibility(4);
        int iB = yyVar.B(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = yyVar.f34993e2;
        view.setBackgroundColor(iB);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f30216f = view2;
        if (yyVar.f35027q0) {
            view2.setBackgroundColor(yyVar.B(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, yyVar.X0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30217n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), z10 ? yyVar.w(0.06f) : yyVar.B(org.telegram.ui.ActionBar.g6.Ie)));
        frameLayout.setClipToOutline(true);
        float fDp = AndroidUtilities.dp(18.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        frameLayout.setOutlineProvider(new gf.q0(0, fDp));
        int i12 = 2;
        if (i10 == 2) {
            addView(frameLayout, h7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, h7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ag.y1 y1Var = new ag.y1(this, context, 12);
        this.f30219s = y1Var;
        frameLayout.addView(y1Var, h7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        lm0 lm0Var = new lm0();
        this.f30214c = lm0Var;
        lm0Var.c(0, false, false);
        lm0Var.a(z10 ? yyVar.w(0.4f) : yyVar.B(org.telegram.ui.ActionBar.g6.Je));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(lm0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final ky f29178b;

            {
                this.f29178b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ky kyVar = this.f29178b;
                        jy jyVar = kyVar.f30218r;
                        wp wpVar = kyVar.d;
                        if (kyVar.f30214c.f30421k == 1) {
                            wpVar.setText("");
                            kyVar.c(null, false);
                            if (jyVar != null) {
                                jyVar.D1();
                                jyVar.F1(null);
                                jyVar.G1(true, true);
                            }
                            kyVar.f(false);
                            wpVar.clearAnimation();
                            wpVar.animate().translationX(0.0f).setInterpolator(er.h).start();
                            kyVar.d(false);
                        }
                        break;
                    default:
                        ky kyVar2 = this.f29178b;
                        wp wpVar2 = kyVar2.d;
                        wpVar2.setText("");
                        kyVar2.c(null, false);
                        jy jyVar2 = kyVar2.f30218r;
                        if (jyVar2 != null) {
                            jyVar2.D1();
                            jyVar2.F1(null);
                            jyVar2.G1(true, true);
                        }
                        kyVar2.f(false);
                        wpVar2.clearAnimation();
                        wpVar2.animate().translationX(0.0f).setInterpolator(er.h).start();
                        kyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, h7.z5.e(36, 36, 51));
        wp wpVar = new wp(this, context, i10, i12);
        this.d = wpVar;
        wpVar.setTextSize(1, 16.0f);
        wpVar.setHintTextColor(z10 ? yyVar.w(0.45f) : yyVar.B(org.telegram.ui.ActionBar.g6.Je));
        wpVar.setTextColor(z10 ? yyVar.w(0.8f) : yyVar.B(org.telegram.ui.ActionBar.g6.G6));
        wpVar.setBackgroundDrawable(null);
        wpVar.setPadding(0, 0, 0, 0);
        wpVar.setMaxLines(1);
        wpVar.setLines(1);
        wpVar.setSingleLine(true);
        wpVar.setImeOptions(268435459);
        wpVar.setHint(LocaleController.getString(R.string.Search));
        wpVar.setCursorColor(yyVar.B(org.telegram.ui.ActionBar.g6.Mh));
        wpVar.setCursorSize(AndroidUtilities.dp(20.0f));
        wpVar.setCursorWidth(1.5f);
        wpVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        y1Var.addView(wpVar, h7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        wpVar.addTextChangedListener(new ch.e(this, 9));
        if (yyVar.f35027q0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(yyVar.B(org.telegram.ui.ActionBar.g6.He), yyVar.B(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(drawableMutate);
            view3.setAlpha(0.0f);
            y1Var.addView(view3, h7.z5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new lh.c2(this));
        final int i13 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, yyVar.V1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final ky f29178b;

            {
                this.f29178b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i13) {
                    case 0:
                        ky kyVar = this.f29178b;
                        jy jyVar = kyVar.f30218r;
                        wp wpVar2 = kyVar.d;
                        if (kyVar.f30214c.f30421k == 1) {
                            wpVar2.setText("");
                            kyVar.c(null, false);
                            if (jyVar != null) {
                                jyVar.D1();
                                jyVar.F1(null);
                                jyVar.G1(true, true);
                            }
                            kyVar.f(false);
                            wpVar2.clearAnimation();
                            wpVar2.animate().translationX(0.0f).setInterpolator(er.h).start();
                            kyVar.d(false);
                        }
                        break;
                    default:
                        ky kyVar2 = this.f29178b;
                        wp wpVar3 = kyVar2.d;
                        wpVar3.setText("");
                        kyVar2.c(null, false);
                        jy jyVar2 = kyVar2.f30218r;
                        if (jyVar2 != null) {
                            jyVar2.D1();
                            jyVar2.F1(null);
                            jyVar2.G1(true, true);
                        }
                        kyVar2.f(false);
                        wpVar3.clearAnimation();
                        wpVar3.animate().translationX(0.0f).setInterpolator(er.h).start();
                        kyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, h7.z5.e(36, 36, 53));
        if (i10 != 1 || (yyVar.Y1 && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            jy jyVar = new jy(this, context, i10 == 0 ? 3 : 0, yyVar.V1, i10);
            this.f30218r = jyVar;
            jyVar.f28854s3 = z10;
            jyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) wpVar.getPaint().measureText(((Object) wpVar.getHint()) + "")));
            if (yyVar.f35027q0) {
                jyVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(yyVar.B(org.telegram.ui.ActionBar.g6.He), yyVar.B(org.telegram.ui.ActionBar.g6.Ie)));
            }
            final int i14 = 0;
            jyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {

                public final ky f29518b;

                {
                    this.f29518b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            Integer num = (Integer) obj;
                            ky kyVar = this.f29518b;
                            kyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            kyVar.d(num.intValue() > 0);
                            kyVar.g(false);
                            break;
                        default:
                            cw0 cw0Var = (cw0) obj;
                            ky kyVar2 = this.f29518b;
                            jy jyVar2 = kyVar2.f30218r;
                            yy yyVar2 = kyVar2.C;
                            if (cw0Var == null) {
                                kyVar2.d(false);
                                jyVar2.F1(null);
                                yyVar2.f35010k0.d.setText("");
                                yyVar2.f34991e0.h1(0, 0);
                            } else if (jyVar2.getSelectedCategory() != cw0Var) {
                                kyVar2.c(cw0Var.f27559a, false);
                                jyVar2.F1(cw0Var);
                            } else {
                                kyVar2.c(null, false);
                                jyVar2.F1(null);
                            }
                            break;
                    }
                }
            });
            jyVar.setOnTouchListener(new m.d2(this, 2));
            final int i15 = 1;
            jyVar.setOnCategoryClick(new Utilities.Callback(this) {

                public final ky f29518b;

                {
                    this.f29518b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            Integer num = (Integer) obj;
                            ky kyVar = this.f29518b;
                            kyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            kyVar.d(num.intValue() > 0);
                            kyVar.g(false);
                            break;
                        default:
                            cw0 cw0Var = (cw0) obj;
                            ky kyVar2 = this.f29518b;
                            jy jyVar2 = kyVar2.f30218r;
                            yy yyVar2 = kyVar2.C;
                            if (cw0Var == null) {
                                kyVar2.d(false);
                                jyVar2.F1(null);
                                yyVar2.f35010k0.d.setText("");
                                yyVar2.f34991e0.h1(0, 0);
                            } else if (jyVar2.getSelectedCategory() != cw0Var) {
                                kyVar2.c(cw0Var.f27559a, false);
                                jyVar2.F1(cw0Var);
                            } else {
                                kyVar2.c(null, false);
                                jyVar2.F1(null);
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(jyVar, h7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(ky kyVar, boolean z10, boolean z11) {
        kyVar.f30212a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        yy yyVar = this.C;
        int i10 = this.f30213b;
        if (i10 != 0) {
            if (i10 == 1) {
                yyVar.O.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    yyVar.f34995f0.G(str, z10);
                    return;
                }
                return;
            }
        }
        ty tyVar = yyVar.f35044v0;
        ry ryVar = tyVar.K;
        yy yyVar2 = tyVar.M;
        hw hwVar = yyVar2.C0;
        ew ewVar = yyVar2.f35059z0;
        if (tyVar.H != 0) {
            ConnectionsManager.getInstance(yyVar2.Y0).cancelRequest(tyVar.H, true);
            tyVar.H = 0;
        }
        if (TextUtils.isEmpty(str)) {
            tyVar.J = null;
            tyVar.A.clear();
            tyVar.D.clear();
            tyVar.G = new ArrayList();
            f2.q0 adapter = ewVar.getAdapter();
            py pyVar = yyVar2.f35041u0;
            if (adapter != pyVar) {
                ewVar.setAdapter(pyVar);
            }
            tyVar.d = 0L;
            yyVar2.f34976a.a(false, true);
            tyVar.l();
            hwVar.e(false);
        } else {
            tyVar.J = str.toLowerCase();
            hwVar.e(true);
        }
        AndroidUtilities.cancelRunOnUIThread(ryVar);
        AndroidUtilities.runOnUIThread(ryVar, 300L);
    }

    public final void d(boolean z10) {
        if (z10 == this.f30221x) {
            return;
        }
        this.f30221x = z10;
        ValueAnimator valueAnimator = this.f30222y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f30220w, z10 ? 1.0f : 0.0f);
        this.f30222y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new e6(this, 22));
        this.f30222y.setDuration(120L);
        this.f30222y.setInterpolator(er.h);
        this.f30222y.start();
    }

    public final void e(boolean z10) {
        this.B = z10;
        if (z10) {
            this.f30214c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.A == null) {
                lp lpVar = new lp(this, 15);
                this.A = lpVar;
                AndroidUtilities.runOnUIThread(lpVar, 340L);
                return;
            }
            return;
        }
        lp lpVar2 = this.A;
        if (lpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(lpVar2);
            this.A = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        boolean z11 = this.B;
        wp wpVar = this.d;
        jy jyVar = this.f30218r;
        if (!z11 || ((wpVar.length() == 0 && (jyVar == null || jyVar.getSelectedCategory() == null)) || z10)) {
            this.f30214c.b((wpVar.length() > 0 || (jyVar != null && jyVar.f28846k3 > 0.5f && (jyVar.f28841f3 || jyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.B = false;
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            View view = this.f30215e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
