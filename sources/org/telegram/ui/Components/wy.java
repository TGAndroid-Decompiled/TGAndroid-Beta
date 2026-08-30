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
public abstract class wy extends FrameLayout implements xd.b {
    public vp B;
    public boolean C;
    public final kz D;
    public final xd.a f30436a;
    public final int f30437b;
    public final fn0 f30438c;
    public final gq d;
    public final View e;
    public final View f30439f;
    public final ImageView h;
    public final FrameLayout f30440n;
    public final vy f30441r;
    public final ah.d f30442s;
    public final View v;
    public float f30443w;
    public boolean f30444x;
    public ValueAnimator f30445y;

    public wy(kz kzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        this.D = kzVar;
        this.f30436a = new xd.a(0, this, nr.f27347g, 200L, false);
        this.f30444x = false;
        this.f30437b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A5 = kzVar.A(org.telegram.ui.ActionBar.j6.Ke);
        boolean z4 = kzVar.f26429f2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f30439f = view2;
        if (kzVar.f26463r0) {
            view2.setBackgroundColor(kzVar.A(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.Y0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30440n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z4) {
            A = kzVar.v(0.06f);
        } else {
            A = kzVar.A(org.telegram.ui.ActionBar.j6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, A));
        frameLayout.setClipToOutline(true);
        gg.j1 j1Var = lf.q0.f12053a;
        frameLayout.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.d dVar = new ah.d(this, context, 13);
        this.f30442s = dVar;
        frameLayout.addView(dVar, k7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fn0 fn0Var = new fn0();
        this.f30438c = fn0Var;
        fn0Var.c(0, false, false);
        if (z4) {
            A2 = kzVar.v(0.4f);
        } else {
            A2 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        fn0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(fn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final wy f29069b;

            {
                this.f29069b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f29069b;
                        vy vyVar = wyVar.f30441r;
                        gq gqVar = wyVar.d;
                        if (wyVar.f30438c.f24913k == 1) {
                            gqVar.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.D1();
                                vyVar.F1(null);
                                vyVar.G1(true, true);
                            }
                            wyVar.f(false);
                            gqVar.clearAnimation();
                            gqVar.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            wyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        wy wyVar2 = this.f29069b;
                        gq gqVar2 = wyVar2.d;
                        gqVar2.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.f30441r;
                        if (vyVar2 != null) {
                            vyVar2.D1();
                            vyVar2.F1(null);
                            vyVar2.G1(true, true);
                        }
                        wyVar2.f(false);
                        gqVar2.clearAnimation();
                        gqVar2.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        wyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        gq gqVar = new gq(this, context, i10, 2);
        this.d = gqVar;
        gqVar.setTextSize(1, 16.0f);
        if (z4) {
            A3 = kzVar.v(0.45f);
        } else {
            A3 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        gqVar.setHintTextColor(A3);
        if (z4) {
            A4 = kzVar.v(0.8f);
        } else {
            A4 = kzVar.A(org.telegram.ui.ActionBar.j6.G6);
        }
        gqVar.setTextColor(A4);
        gqVar.setBackgroundDrawable(null);
        gqVar.setPadding(0, 0, 0, 0);
        gqVar.setMaxLines(1);
        gqVar.setLines(1);
        gqVar.setSingleLine(true);
        gqVar.setImeOptions(268435459);
        gqVar.setHint(LocaleController.getString(R.string.Search));
        gqVar.setCursorColor(kzVar.A(org.telegram.ui.ActionBar.j6.Mh));
        gqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gqVar.setCursorWidth(1.5f);
        gqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        dVar.addView(gqVar, k7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gqVar.addTextChangedListener(new dh.c(this, 8));
        if (kzVar.f26463r0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            dVar.addView(view3, k7.b6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, kzVar.W1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final wy f29069b;

            {
                this.f29069b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f29069b;
                        vy vyVar = wyVar.f30441r;
                        gq gqVar2 = wyVar.d;
                        if (wyVar.f30438c.f24913k == 1) {
                            gqVar2.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.D1();
                                vyVar.F1(null);
                                vyVar.G1(true, true);
                            }
                            wyVar.f(false);
                            gqVar2.clearAnimation();
                            gqVar2.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            wyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        wy wyVar2 = this.f29069b;
                        gq gqVar22 = wyVar2.d;
                        gqVar22.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.f30441r;
                        if (vyVar2 != null) {
                            vyVar2.D1();
                            vyVar2.F1(null);
                            vyVar2.G1(true, true);
                        }
                        wyVar2.f(false);
                        gqVar22.clearAnimation();
                        gqVar22.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        wyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, k7.b6.e(36, 36, 53));
        if (i10 == 1 && (!kzVar.Z1 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        vy vyVar = new vy(this, context, i11, kzVar.W1, i10);
        this.f30441r = vyVar;
        vyVar.f30764t3 = z4;
        TextPaint paint = gqVar.getPaint();
        vyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) gqVar.getHint()) + "")));
        if (kzVar.f26463r0) {
            vyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)));
        }
        vyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final wy f29303b;

            {
                this.f29303b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        wy wyVar = this.f29303b;
                        wyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wyVar.d(z10);
                        wyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        wy wyVar2 = this.f29303b;
                        kz kzVar2 = wyVar2.D;
                        vy vyVar2 = wyVar2.f30441r;
                        if (tw0Var == null) {
                            wyVar2.d(false);
                            vyVar2.F1(null);
                            kzVar2.f26445l0.d.setText("");
                            kzVar2.f26427f0.h1(0, 0);
                            return;
                        } else if (vyVar2.getSelectedCategory() == tw0Var) {
                            wyVar2.c(null, false);
                            vyVar2.F1(null);
                            return;
                        } else {
                            wyVar2.c(tw0Var.f29058a, false);
                            vyVar2.F1(tw0Var);
                            return;
                        }
                }
            }
        });
        vyVar.setOnTouchListener(new m.d2(this, 2));
        vyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final wy f29303b;

            {
                this.f29303b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        wy wyVar = this.f29303b;
                        wyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wyVar.d(z10);
                        wyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        wy wyVar2 = this.f29303b;
                        kz kzVar2 = wyVar2.D;
                        vy vyVar2 = wyVar2.f30441r;
                        if (tw0Var == null) {
                            wyVar2.d(false);
                            vyVar2.F1(null);
                            kzVar2.f26445l0.d.setText("");
                            kzVar2.f26427f0.h1(0, 0);
                            return;
                        } else if (vyVar2.getSelectedCategory() == tw0Var) {
                            wyVar2.c(null, false);
                            vyVar2.F1(null);
                            return;
                        } else {
                            wyVar2.c(tw0Var.f29058a, false);
                            vyVar2.F1(tw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(vyVar, k7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(wy wyVar, boolean z4, boolean z10) {
        wyVar.f30436a.a(z4, z10);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            if (f10 > 0.0f) {
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

    public final void c(String str, boolean z4) {
        kz kzVar = this.D;
        int i10 = this.f30437b;
        if (i10 == 0) {
            fz fzVar = kzVar.f26480w0;
            dz dzVar = fzVar.L;
            kz kzVar2 = fzVar.N;
            sw swVar = kzVar2.D0;
            pw pwVar = kzVar2.A0;
            if (fzVar.I != 0) {
                ConnectionsManager.getInstance(kzVar2.Z0).cancelRequest(fzVar.I, true);
                fzVar.I = 0;
            }
            if (TextUtils.isEmpty(str)) {
                fzVar.K = null;
                fzVar.B.clear();
                fzVar.E.clear();
                fzVar.H = new ArrayList();
                f2.o0 adapter = pwVar.getAdapter();
                bz bzVar = kzVar2.f26476v0;
                if (adapter != bzVar) {
                    pwVar.setAdapter(bzVar);
                }
                fzVar.d = 0L;
                kzVar2.f26409a.a(false, true);
                fzVar.l();
                swVar.e(false);
            } else {
                fzVar.K = str.toLowerCase();
                swVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            AndroidUtilities.runOnUIThread(dzVar, 300L);
        } else if (i10 == 1) {
            kzVar.P.F(str, z4);
        } else if (i10 == 2) {
            kzVar.f26430g0.G(str, z4);
        }
    }

    public final void d(boolean z4) {
        float f10;
        if (z4 == this.f30444x) {
            return;
        }
        this.f30444x = z4;
        ValueAnimator valueAnimator = this.f30445y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f30443w;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f30445y = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 22));
        this.f30445y.setDuration(120L);
        this.f30445y.setInterpolator(nr.h);
        this.f30445y.start();
    }

    public final void e(boolean z4) {
        this.C = z4;
        if (z4) {
            this.f30438c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z4) {
        if (z4) {
            if (this.B == null) {
                vp vpVar = new vp(this, 15);
                this.B = vpVar;
                AndroidUtilities.runOnUIThread(vpVar, 340L);
                return;
            }
            return;
        }
        vp vpVar2 = this.B;
        if (vpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(vpVar2);
            this.B = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z4) {
        int i10;
        boolean z10 = this.C;
        gq gqVar = this.d;
        vy vyVar = this.f30441r;
        if (z10 && ((gqVar.length() != 0 || (vyVar != null && vyVar.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (gqVar.length() <= 0 && (vyVar == null || vyVar.f30756l3 <= 0.5f || (!vyVar.f30751g3 && vyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f30438c.b(i10);
        this.C = false;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
