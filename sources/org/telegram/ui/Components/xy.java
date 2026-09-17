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
public abstract class xy extends FrameLayout implements le.d {
    public xp E;
    public boolean F;
    public final kz G;
    public final le.b f30024a;
    public final int f30025b;
    public final ym0 f30026c;
    public final iq d;
    public final View e;
    public final View f30027f;
    public final ImageView h;
    public final FrameLayout f30028n;
    public final wy f30029r;
    public final ci.n6 f30030s;
    public final View v;
    public float f30031w;
    public boolean f30032x;
    public ValueAnimator f30033y;

    public xy(kz kzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = kzVar;
        this.f30024a = new le.b(0, this, qr.f27381g, 200L, false);
        this.f30032x = false;
        this.f30025b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z14 = kzVar.z(org.telegram.ui.ActionBar.j6.Ke);
        boolean z15 = kzVar.f25733i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f30027f = view2;
        if (kzVar.f25768u0) {
            view2.setBackgroundColor(kzVar.z(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.f25709b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30028n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = kzVar.v(0.06f);
        } else {
            z10 = kzVar.z(org.telegram.ui.ActionBar.j6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f46861a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.n6 n6Var = new ci.n6(this, context, 10);
        this.f30030s = n6Var;
        frameLayout.addView(n6Var, w7.x5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ym0 ym0Var = new ym0();
        this.f30026c = ym0Var;
        ym0Var.c(0, false, false);
        if (z15) {
            z11 = kzVar.v(0.4f);
        } else {
            z11 = kzVar.z(org.telegram.ui.ActionBar.j6.Je);
        }
        ym0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(ym0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final xy f28511b;

            {
                this.f28511b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f28511b;
                        wy wyVar = xyVar.f30029r;
                        iq iqVar = xyVar.d;
                        if (xyVar.f30026c.f30281k == 1) {
                            iqVar.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.E1();
                                wyVar.G1(null);
                                wyVar.H1(true, true);
                            }
                            xyVar.f(false);
                            iqVar.clearAnimation();
                            iqVar.animate().translationX(0.0f).setInterpolator(qr.h).start();
                            xyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        xy xyVar2 = this.f28511b;
                        iq iqVar2 = xyVar2.d;
                        iqVar2.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.f30029r;
                        if (wyVar2 != null) {
                            wyVar2.E1();
                            wyVar2.G1(null);
                            wyVar2.H1(true, true);
                        }
                        xyVar2.f(false);
                        iqVar2.clearAnimation();
                        iqVar2.animate().translationX(0.0f).setInterpolator(qr.h).start();
                        xyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        iq iqVar = new iq(this, context, i10, 2);
        this.d = iqVar;
        iqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = kzVar.v(0.45f);
        } else {
            z12 = kzVar.z(org.telegram.ui.ActionBar.j6.Je);
        }
        iqVar.setHintTextColor(z12);
        if (z15) {
            z13 = kzVar.v(0.8f);
        } else {
            z13 = kzVar.z(org.telegram.ui.ActionBar.j6.G6);
        }
        iqVar.setTextColor(z13);
        iqVar.setBackgroundDrawable(null);
        iqVar.setPadding(0, 0, 0, 0);
        iqVar.setMaxLines(1);
        iqVar.setLines(1);
        iqVar.setSingleLine(true);
        iqVar.setImeOptions(268435459);
        iqVar.setHint(LocaleController.getString(R.string.Search));
        iqVar.setCursorColor(kzVar.z(org.telegram.ui.ActionBar.j6.Mh));
        iqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        iqVar.setCursorWidth(1.5f);
        iqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        n6Var.addView(iqVar, w7.x5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar.addTextChangedListener(new ci.i2(this, 8));
        if (kzVar.f25768u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.z(org.telegram.ui.ActionBar.j6.He), kzVar.z(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            n6Var.addView(view3, w7.x5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, kzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final xy f28511b;

            {
                this.f28511b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f28511b;
                        wy wyVar = xyVar.f30029r;
                        iq iqVar2 = xyVar.d;
                        if (xyVar.f30026c.f30281k == 1) {
                            iqVar2.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.E1();
                                wyVar.G1(null);
                                wyVar.H1(true, true);
                            }
                            xyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(qr.h).start();
                            xyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        xy xyVar2 = this.f28511b;
                        iq iqVar22 = xyVar2.d;
                        iqVar22.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.f30029r;
                        if (wyVar2 != null) {
                            wyVar2.E1();
                            wyVar2.G1(null);
                            wyVar2.H1(true, true);
                        }
                        xyVar2.f(false);
                        iqVar22.clearAnimation();
                        iqVar22.animate().translationX(0.0f).setInterpolator(qr.h).start();
                        xyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 == 1 && (!kzVar.f25714c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        wy wyVar = new wy(this, context, i11, kzVar.Z1, i10);
        this.f30029r = wyVar;
        wyVar.f30022w3 = z15;
        TextPaint paint = iqVar.getPaint();
        wyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) iqVar.getHint()) + "")));
        if (kzVar.f25768u0) {
            wyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.z(org.telegram.ui.ActionBar.j6.He), kzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
        }
        wyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final xy f29428b;

            {
                this.f29428b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        xy xyVar = this.f29428b;
                        xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        xyVar.d(z16);
                        xyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        xy xyVar2 = this.f29428b;
                        kz kzVar2 = xyVar2.G;
                        wy wyVar2 = xyVar2.f30029r;
                        if (tw0Var == null) {
                            xyVar2.d(false);
                            wyVar2.G1(null);
                            kzVar2.f25748o0.d.setText("");
                            kzVar2.f25731i0.h1(0, 0);
                            return;
                        } else if (wyVar2.getSelectedCategory() == tw0Var) {
                            xyVar2.c(null, false);
                            wyVar2.G1(null);
                            return;
                        } else {
                            xyVar2.c(tw0Var.f28212a, false);
                            wyVar2.G1(tw0Var);
                            return;
                        }
                }
            }
        });
        wyVar.setOnTouchListener(new m.c2(this, 2));
        wyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final xy f29428b;

            {
                this.f29428b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        xy xyVar = this.f29428b;
                        xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        xyVar.d(z16);
                        xyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        xy xyVar2 = this.f29428b;
                        kz kzVar2 = xyVar2.G;
                        wy wyVar2 = xyVar2.f30029r;
                        if (tw0Var == null) {
                            xyVar2.d(false);
                            wyVar2.G1(null);
                            kzVar2.f25748o0.d.setText("");
                            kzVar2.f25731i0.h1(0, 0);
                            return;
                        } else if (wyVar2.getSelectedCategory() == tw0Var) {
                            xyVar2.c(null, false);
                            wyVar2.G1(null);
                            return;
                        } else {
                            xyVar2.c(tw0Var.f28212a, false);
                            wyVar2.G1(tw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(wyVar, w7.x5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(xy xyVar, boolean z10, boolean z11) {
        xyVar.f30024a.a(z10, z11);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            if (f7 > 0.0f) {
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
        kz kzVar = this.G;
        int i10 = this.f30025b;
        if (i10 == 0) {
            fz fzVar = kzVar.f25786z0;
            dz dzVar = fzVar.O;
            kz kzVar2 = fzVar.Q;
            vw vwVar = kzVar2.G0;
            sw swVar = kzVar2.D0;
            if (fzVar.L != 0) {
                ConnectionsManager.getInstance(kzVar2.f25713c1).cancelRequest(fzVar.L, true);
                fzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                fzVar.N = null;
                fzVar.E.clear();
                fzVar.H.clear();
                fzVar.K = new ArrayList();
                s4.h0 adapter = swVar.getAdapter();
                bz bzVar = kzVar2.f25783y0;
                if (adapter != bzVar) {
                    swVar.setAdapter(bzVar);
                }
                fzVar.d = 0L;
                kzVar2.f25704a.a(false, true);
                fzVar.l();
                vwVar.e(false);
            } else {
                fzVar.N = str.toLowerCase();
                vwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            AndroidUtilities.runOnUIThread(dzVar, 300L);
        } else if (i10 == 1) {
            kzVar.S.F(str, z10);
        } else if (i10 == 2) {
            kzVar.f25734j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f30032x) {
            return;
        }
        this.f30032x = z10;
        ValueAnimator valueAnimator = this.f30033y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f30031w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f30033y = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 22));
        this.f30033y.setDuration(120L);
        this.f30033y.setInterpolator(qr.h);
        this.f30033y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f30026c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                xp xpVar = new xp(this, 15);
                this.E = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 340L);
                return;
            }
            return;
        }
        xp xpVar2 = this.E;
        if (xpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        iq iqVar = this.d;
        wy wyVar = this.f30029r;
        if (z11 && ((iqVar.length() != 0 || (wyVar != null && wyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iqVar.length() <= 0 && (wyVar == null || wyVar.f30014o3 <= 0.5f || (!wyVar.j3 && wyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f30026c.b(i10);
        this.F = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
