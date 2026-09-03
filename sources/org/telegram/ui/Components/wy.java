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
    public up B;
    public boolean C;
    public final kz D;
    public final xd.a f30367a;
    public final int f30368b;
    public final en0 f30369c;
    public final fq d;
    public final View e;
    public final View f30370f;
    public final ImageView h;
    public final FrameLayout f30371n;
    public final vy f30372r;
    public final ah.e f30373s;
    public final View v;
    public float f30374w;
    public boolean f30375x;
    public ValueAnimator f30376y;

    public wy(kz kzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        this.D = kzVar;
        this.f30367a = new xd.a(0, this, mr.f27123g, 200L, false);
        this.f30375x = false;
        this.f30368b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A5 = kzVar.A(org.telegram.ui.ActionBar.j6.Ke);
        boolean z4 = kzVar.f26441f2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f30370f = view2;
        if (kzVar.f26475r0) {
            view2.setBackgroundColor(kzVar.A(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, kzVar.Y0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30371n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z4) {
            A = kzVar.v(0.06f);
        } else {
            A = kzVar.A(org.telegram.ui.ActionBar.j6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, A));
        frameLayout.setClipToOutline(true);
        gg.j1 j1Var = kf.r0.f10496a;
        frameLayout.setOutlineProvider(new kf.q0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, k7.b6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.e eVar = new ah.e(this, context, 13);
        this.f30373s = eVar;
        frameLayout.addView(eVar, k7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        en0 en0Var = new en0();
        this.f30369c = en0Var;
        en0Var.c(0, false, false);
        if (z4) {
            A2 = kzVar.v(0.4f);
        } else {
            A2 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        en0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(en0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final wy f29048b;

            {
                this.f29048b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f29048b;
                        vy vyVar = wyVar.f30372r;
                        fq fqVar = wyVar.d;
                        if (wyVar.f30369c.f24646k == 1) {
                            fqVar.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.C1();
                                vyVar.E1(null);
                                vyVar.F1(true, true);
                            }
                            wyVar.f(false);
                            fqVar.clearAnimation();
                            fqVar.animate().translationX(0.0f).setInterpolator(mr.h).start();
                            wyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        wy wyVar2 = this.f29048b;
                        fq fqVar2 = wyVar2.d;
                        fqVar2.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.f30372r;
                        if (vyVar2 != null) {
                            vyVar2.C1();
                            vyVar2.E1(null);
                            vyVar2.F1(true, true);
                        }
                        wyVar2.f(false);
                        fqVar2.clearAnimation();
                        fqVar2.animate().translationX(0.0f).setInterpolator(mr.h).start();
                        wyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, k7.b6.e(36, 36, 51));
        fq fqVar = new fq(this, context, i10, 2);
        this.d = fqVar;
        fqVar.setTextSize(1, 16.0f);
        if (z4) {
            A3 = kzVar.v(0.45f);
        } else {
            A3 = kzVar.A(org.telegram.ui.ActionBar.j6.Je);
        }
        fqVar.setHintTextColor(A3);
        if (z4) {
            A4 = kzVar.v(0.8f);
        } else {
            A4 = kzVar.A(org.telegram.ui.ActionBar.j6.G6);
        }
        fqVar.setTextColor(A4);
        fqVar.setBackgroundDrawable(null);
        fqVar.setPadding(0, 0, 0, 0);
        fqVar.setMaxLines(1);
        fqVar.setLines(1);
        fqVar.setSingleLine(true);
        fqVar.setImeOptions(268435459);
        fqVar.setHint(LocaleController.getString(R.string.Search));
        fqVar.setCursorColor(kzVar.A(org.telegram.ui.ActionBar.j6.Mh));
        fqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fqVar.setCursorWidth(1.5f);
        fqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        eVar.addView(fqVar, k7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fqVar.addTextChangedListener(new dh.c(this, 8));
        if (kzVar.f26475r0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            eVar.addView(view3, k7.b6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, kzVar.W1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final wy f29048b;

            {
                this.f29048b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        wy wyVar = this.f29048b;
                        vy vyVar = wyVar.f30372r;
                        fq fqVar2 = wyVar.d;
                        if (wyVar.f30369c.f24646k == 1) {
                            fqVar2.setText("");
                            wyVar.c(null, false);
                            if (vyVar != null) {
                                vyVar.C1();
                                vyVar.E1(null);
                                vyVar.F1(true, true);
                            }
                            wyVar.f(false);
                            fqVar2.clearAnimation();
                            fqVar2.animate().translationX(0.0f).setInterpolator(mr.h).start();
                            wyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        wy wyVar2 = this.f29048b;
                        fq fqVar22 = wyVar2.d;
                        fqVar22.setText("");
                        wyVar2.c(null, false);
                        vy vyVar2 = wyVar2.f30372r;
                        if (vyVar2 != null) {
                            vyVar2.C1();
                            vyVar2.E1(null);
                            vyVar2.F1(true, true);
                        }
                        wyVar2.f(false);
                        fqVar22.clearAnimation();
                        fqVar22.animate().translationX(0.0f).setInterpolator(mr.h).start();
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
        this.f30372r = vyVar;
        vyVar.f30746t3 = z4;
        TextPaint paint = fqVar.getPaint();
        vyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fqVar.getHint()) + "")));
        if (kzVar.f26475r0) {
            vyVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(kzVar.A(org.telegram.ui.ActionBar.j6.He), kzVar.A(org.telegram.ui.ActionBar.j6.Ie)));
        }
        vyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final wy f29318b;

            {
                this.f29318b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        wy wyVar = this.f29318b;
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
                        wy wyVar2 = this.f29318b;
                        kz kzVar2 = wyVar2.D;
                        vy vyVar2 = wyVar2.f30372r;
                        if (tw0Var == null) {
                            wyVar2.d(false);
                            vyVar2.E1(null);
                            kzVar2.f26457l0.d.setText("");
                            kzVar2.f26439f0.h1(0, 0);
                            return;
                        } else if (vyVar2.getSelectedCategory() == tw0Var) {
                            wyVar2.c(null, false);
                            vyVar2.E1(null);
                            return;
                        } else {
                            wyVar2.c(tw0Var.f29037a, false);
                            vyVar2.E1(tw0Var);
                            return;
                        }
                }
            }
        });
        vyVar.setOnTouchListener(new m.d2(this, 2));
        vyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final wy f29318b;

            {
                this.f29318b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        wy wyVar = this.f29318b;
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
                        wy wyVar2 = this.f29318b;
                        kz kzVar2 = wyVar2.D;
                        vy vyVar2 = wyVar2.f30372r;
                        if (tw0Var == null) {
                            wyVar2.d(false);
                            vyVar2.E1(null);
                            kzVar2.f26457l0.d.setText("");
                            kzVar2.f26439f0.h1(0, 0);
                            return;
                        } else if (vyVar2.getSelectedCategory() == tw0Var) {
                            wyVar2.c(null, false);
                            vyVar2.E1(null);
                            return;
                        } else {
                            wyVar2.c(tw0Var.f29037a, false);
                            vyVar2.E1(tw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(vyVar, k7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(wy wyVar, boolean z4, boolean z10) {
        wyVar.f30367a.a(z4, z10);
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
        int i10 = this.f30368b;
        if (i10 == 0) {
            fz fzVar = kzVar.f26492w0;
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
                bz bzVar = kzVar2.f26488v0;
                if (adapter != bzVar) {
                    pwVar.setAdapter(bzVar);
                }
                fzVar.d = 0L;
                kzVar2.f26421a.a(false, true);
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
            kzVar.f26442g0.G(str, z4);
        }
    }

    public final void d(boolean z4) {
        float f10;
        if (z4 == this.f30375x) {
            return;
        }
        this.f30375x = z4;
        ValueAnimator valueAnimator = this.f30376y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f30374w;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f30376y = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 22));
        this.f30376y.setDuration(120L);
        this.f30376y.setInterpolator(mr.h);
        this.f30376y.start();
    }

    public final void e(boolean z4) {
        this.C = z4;
        if (z4) {
            this.f30369c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z4) {
        if (z4) {
            if (this.B == null) {
                up upVar = new up(this, 15);
                this.B = upVar;
                AndroidUtilities.runOnUIThread(upVar, 340L);
                return;
            }
            return;
        }
        up upVar2 = this.B;
        if (upVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(upVar2);
            this.B = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z4) {
        int i10;
        boolean z10 = this.C;
        fq fqVar = this.d;
        vy vyVar = this.f30372r;
        if (z10 && ((fqVar.length() != 0 || (vyVar != null && vyVar.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (fqVar.length() <= 0 && (vyVar == null || vyVar.f30738l3 <= 0.5f || (!vyVar.f30733g3 && vyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f30369c.b(i10);
        this.C = false;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
