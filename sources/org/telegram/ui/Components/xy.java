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
    public wp E;
    public boolean F;
    public final kz G;
    public final le.b f32799a;
    public final int f32800b;
    public final xm0 f32801c;
    public final hq d;
    public final View f32802e;
    public final View f32803f;
    public final ImageView h;
    public final FrameLayout f32804n;
    public final wy f32805r;
    public final ah.w f32806s;
    public final View v;
    public float f32807w;
    public boolean f32808x;
    public ValueAnimator f32809y;

    public xy(kz kzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        this.G = kzVar;
        this.f32799a = new le.b(0, this, pr.f29494g, 200L, false);
        this.f32808x = false;
        this.f32800b = i10;
        View view = new View(context);
        this.f32802e = view;
        view.setVisibility(4);
        int A5 = kzVar.A(org.telegram.ui.ActionBar.j6.Ke);
        boolean z10 = kzVar.f27980i2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f32803f = view2;
        if (kzVar.f28015u0) {
            view2.setBackgroundColor(kzVar.A(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.f27955b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32804n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = kzVar.v(0.06f);
        } else {
            A = kzVar.A(org.telegram.ui.ActionBar.j6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, A));
        frameLayout.setClipToOutline(true);
        bi.z1 z1Var = yf.j0.f50141a;
        frameLayout.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.w wVar = new ah.w(this, context, 12);
        this.f32806s = wVar;
        frameLayout.addView(wVar, w7.x5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        xm0 xm0Var = new xm0();
        this.f32801c = xm0Var;
        xm0Var.c(0, false, false);
        if (z10) {
            A2 = kzVar.v(0.4f);
        } else {
            A2 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        xm0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(xm0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final xy f31048b;

            {
                this.f31048b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f31048b;
                        wy wyVar = xyVar.f32805r;
                        hq hqVar = xyVar.d;
                        if (xyVar.f32801c.f32648k == 1) {
                            hqVar.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.C1();
                                wyVar.E1(null);
                                wyVar.F1(true, true);
                            }
                            xyVar.f(false);
                            hqVar.clearAnimation();
                            hqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            xyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        xy xyVar2 = this.f31048b;
                        hq hqVar2 = xyVar2.d;
                        hqVar2.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.f32805r;
                        if (wyVar2 != null) {
                            wyVar2.C1();
                            wyVar2.E1(null);
                            wyVar2.F1(true, true);
                        }
                        xyVar2.f(false);
                        hqVar2.clearAnimation();
                        hqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        xyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        hq hqVar = new hq(this, context, i10, 2);
        this.d = hqVar;
        hqVar.setTextSize(1, 16.0f);
        if (z10) {
            A3 = kzVar.v(0.45f);
        } else {
            A3 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        hqVar.setHintTextColor(A3);
        if (z10) {
            A4 = kzVar.v(0.8f);
        } else {
            A4 = kzVar.A(org.telegram.ui.ActionBar.j6.G6);
        }
        hqVar.setTextColor(A4);
        hqVar.setBackgroundDrawable(null);
        hqVar.setPadding(0, 0, 0, 0);
        hqVar.setMaxLines(1);
        hqVar.setLines(1);
        hqVar.setSingleLine(true);
        hqVar.setImeOptions(268435459);
        hqVar.setHint(LocaleController.getString(R.string.Search));
        hqVar.setCursorColor(kzVar.A(org.telegram.ui.ActionBar.j6.Mh));
        hqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        hqVar.setCursorWidth(1.5f);
        hqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        wVar.addView(hqVar, w7.x5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        hqVar.addTextChangedListener(new di.i2(this, 8));
        if (kzVar.f28015u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            wVar.addView(view3, w7.x5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20780i6, kzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final xy f31048b;

            {
                this.f31048b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        xy xyVar = this.f31048b;
                        wy wyVar = xyVar.f32805r;
                        hq hqVar2 = xyVar.d;
                        if (xyVar.f32801c.f32648k == 1) {
                            hqVar2.setText("");
                            xyVar.c(null, false);
                            if (wyVar != null) {
                                wyVar.C1();
                                wyVar.E1(null);
                                wyVar.F1(true, true);
                            }
                            xyVar.f(false);
                            hqVar2.clearAnimation();
                            hqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            xyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        xy xyVar2 = this.f31048b;
                        hq hqVar22 = xyVar2.d;
                        hqVar22.setText("");
                        xyVar2.c(null, false);
                        wy wyVar2 = xyVar2.f32805r;
                        if (wyVar2 != null) {
                            wyVar2.C1();
                            wyVar2.E1(null);
                            wyVar2.F1(true, true);
                        }
                        xyVar2.f(false);
                        hqVar22.clearAnimation();
                        hqVar22.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        xyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 == 1 && (!kzVar.f27960c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        wy wyVar = new wy(this, context, i11, kzVar.Z1, i10);
        this.f32805r = wyVar;
        wyVar.f32042w3 = z10;
        TextPaint paint = hqVar.getPaint();
        wyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) hqVar.getHint()) + "")));
        if (kzVar.f28015u0) {
            wyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)));
        }
        wyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final xy f32048b;

            {
                this.f32048b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        xy xyVar = this.f32048b;
                        xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        xyVar.d(z11);
                        xyVar.g(false);
                        return;
                    default:
                        rw0 rw0Var = (rw0) obj;
                        xy xyVar2 = this.f32048b;
                        kz kzVar2 = xyVar2.G;
                        wy wyVar2 = xyVar2.f32805r;
                        if (rw0Var == null) {
                            xyVar2.d(false);
                            wyVar2.E1(null);
                            kzVar2.f27995o0.d.setText("");
                            kzVar2.f27978i0.h1(0, 0);
                            return;
                        } else if (wyVar2.getSelectedCategory() == rw0Var) {
                            xyVar2.c(null, false);
                            wyVar2.E1(null);
                            return;
                        } else {
                            xyVar2.c(rw0Var.f30132a, false);
                            wyVar2.E1(rw0Var);
                            return;
                        }
                }
            }
        });
        wyVar.setOnTouchListener(new m.c2(this, 2));
        wyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final xy f32048b;

            {
                this.f32048b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        xy xyVar = this.f32048b;
                        xyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        xyVar.d(z11);
                        xyVar.g(false);
                        return;
                    default:
                        rw0 rw0Var = (rw0) obj;
                        xy xyVar2 = this.f32048b;
                        kz kzVar2 = xyVar2.G;
                        wy wyVar2 = xyVar2.f32805r;
                        if (rw0Var == null) {
                            xyVar2.d(false);
                            wyVar2.E1(null);
                            kzVar2.f27995o0.d.setText("");
                            kzVar2.f27978i0.h1(0, 0);
                            return;
                        } else if (wyVar2.getSelectedCategory() == rw0Var) {
                            xyVar2.c(null, false);
                            wyVar2.E1(null);
                            return;
                        } else {
                            xyVar2.c(rw0Var.f30132a, false);
                            wyVar2.E1(rw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(wyVar, w7.x5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(xy xyVar, boolean z10, boolean z11) {
        xyVar.f32799a.a(z10, z11);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f32802e;
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
        int i10 = this.f32800b;
        if (i10 == 0) {
            fz fzVar = kzVar.f28033z0;
            dz dzVar = fzVar.O;
            kz kzVar2 = fzVar.Q;
            ww wwVar = kzVar2.G0;
            tw twVar = kzVar2.D0;
            if (fzVar.L != 0) {
                ConnectionsManager.getInstance(kzVar2.f27959c1).cancelRequest(fzVar.L, true);
                fzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                fzVar.N = null;
                fzVar.E.clear();
                fzVar.H.clear();
                fzVar.K = new ArrayList();
                s4.h0 adapter = twVar.getAdapter();
                bz bzVar = kzVar2.f28030y0;
                if (adapter != bzVar) {
                    twVar.setAdapter(bzVar);
                }
                fzVar.d = 0L;
                kzVar2.f27950a.a(false, true);
                fzVar.l();
                wwVar.e(false);
            } else {
                fzVar.N = str.toLowerCase();
                wwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            AndroidUtilities.runOnUIThread(dzVar, 300L);
        } else if (i10 == 1) {
            kzVar.S.F(str, z10);
        } else if (i10 == 2) {
            kzVar.f27981j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f32808x) {
            return;
        }
        this.f32808x = z10;
        ValueAnimator valueAnimator = this.f32809y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f32807w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32809y = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 22));
        this.f32809y.setDuration(120L);
        this.f32809y.setInterpolator(pr.h);
        this.f32809y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f32801c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                wp wpVar = new wp(this, 15);
                this.E = wpVar;
                AndroidUtilities.runOnUIThread(wpVar, 340L);
                return;
            }
            return;
        }
        wp wpVar2 = this.E;
        if (wpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(wpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        hq hqVar = this.d;
        wy wyVar = this.f32805r;
        if (z11 && ((hqVar.length() != 0 || (wyVar != null && wyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (hqVar.length() <= 0 && (wyVar == null || wyVar.f32034o3 <= 0.5f || (!wyVar.j3 && wyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f32801c.b(i10);
        this.F = false;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
