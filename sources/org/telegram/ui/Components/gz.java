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
public abstract class gz extends FrameLayout implements ne.d {
    public hq E;
    public boolean F;
    public final tz G;
    public final ne.b f26693a;
    public final int f26694b;
    public final vn0 f26695c;
    public final sq d;
    public final View e;
    public final View f26696f;
    public final ImageView h;
    public final FrameLayout f26697n;
    public final fz f26698r;
    public final ah.v f26699s;
    public final View v;
    public float f26700w;
    public boolean f26701x;
    public ValueAnimator f26702y;

    public gz(tz tzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        int i12;
        this.G = tzVar;
        this.f26693a = new ne.b(0, this, bs.f25031g, 200L, false);
        this.f26701x = false;
        this.f26694b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A5 = tzVar.A(org.telegram.ui.ActionBar.h6.Ke);
        boolean z10 = tzVar.f30767i2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f26696f = view2;
        if (tzVar.f30802u0) {
            view2.setBackgroundColor(tzVar.A(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tzVar.f30743b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26697n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = tzVar.w(0.06f);
        } else {
            A = tzVar.A(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f51574a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.v vVar = new ah.v(this, context, 13);
        this.f26699s = vVar;
        frameLayout.addView(vVar, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        vn0 vn0Var = new vn0();
        this.f26695c = vn0Var;
        vn0Var.c(0, false, false);
        if (z10) {
            A2 = tzVar.w(0.4f);
        } else {
            A2 = tzVar.A(org.telegram.ui.ActionBar.h6.Je);
        }
        vn0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(vn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gz f25729b;

            {
                this.f25729b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        gz gzVar = this.f25729b;
                        fz fzVar = gzVar.f26698r;
                        sq sqVar = gzVar.d;
                        if (gzVar.f26695c.f31328k == 1) {
                            sqVar.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.E1();
                                fzVar.G1(null);
                                fzVar.H1(true, true);
                            }
                            gzVar.f(false);
                            sqVar.clearAnimation();
                            sqVar.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gz gzVar2 = this.f25729b;
                        sq sqVar2 = gzVar2.d;
                        sqVar2.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.f26698r;
                        if (fzVar2 != null) {
                            fzVar2.E1();
                            fzVar2.G1(null);
                            fzVar2.H1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar2.clearAnimation();
                        sqVar2.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        sq sqVar = new sq(this, context, i10, 2);
        this.d = sqVar;
        sqVar.setTextSize(1, 16.0f);
        if (z10) {
            A3 = tzVar.w(0.45f);
        } else {
            A3 = tzVar.A(org.telegram.ui.ActionBar.h6.Je);
        }
        sqVar.setHintTextColor(A3);
        if (z10) {
            A4 = tzVar.w(0.8f);
        } else {
            A4 = tzVar.A(org.telegram.ui.ActionBar.h6.G6);
        }
        sqVar.setTextColor(A4);
        sqVar.setBackgroundDrawable(null);
        sqVar.setPadding(0, 0, 0, 0);
        sqVar.setMaxLines(1);
        sqVar.setLines(1);
        sqVar.setSingleLine(true);
        sqVar.setImeOptions(268435459);
        sqVar.setHint(LocaleController.getString(R.string.Search));
        sqVar.setCursorColor(tzVar.A(org.telegram.ui.ActionBar.h6.Mh));
        sqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        sqVar.setCursorWidth(1.5f);
        sqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(sqVar, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        sqVar.addTextChangedListener(new ai.u(this, 9));
        if (tzVar.f30802u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(tzVar.A(org.telegram.ui.ActionBar.h6.He), tzVar.A(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, tzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final gz f25729b;

            {
                this.f25729b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        gz gzVar = this.f25729b;
                        fz fzVar = gzVar.f26698r;
                        sq sqVar2 = gzVar.d;
                        if (gzVar.f26695c.f31328k == 1) {
                            sqVar2.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.E1();
                                fzVar.G1(null);
                                fzVar.H1(true, true);
                            }
                            gzVar.f(false);
                            sqVar2.clearAnimation();
                            sqVar2.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gz gzVar2 = this.f25729b;
                        sq sqVar22 = gzVar2.d;
                        sqVar22.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.f26698r;
                        if (fzVar2 != null) {
                            fzVar2.E1();
                            fzVar2.G1(null);
                            fzVar2.H1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar22.clearAnimation();
                        sqVar22.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 == 1 && (!tzVar.f30748c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        fz fzVar = new fz(this, context, i12, tzVar.Z1, i10);
        this.f26698r = fzVar;
        fzVar.f29465u3 = z10;
        TextPaint paint = sqVar.getPaint();
        fzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) sqVar.getHint()) + "")));
        if (tzVar.f30802u0) {
            fzVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(tzVar.A(org.telegram.ui.ActionBar.h6.He), tzVar.A(org.telegram.ui.ActionBar.h6.Ie)));
        }
        fzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final gz f26017b;

            {
                this.f26017b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gz gzVar = this.f26017b;
                        gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        gzVar.d(z11);
                        gzVar.g(false);
                        return;
                    default:
                        lx0 lx0Var = (lx0) obj;
                        gz gzVar2 = this.f26017b;
                        tz tzVar2 = gzVar2.G;
                        fz fzVar2 = gzVar2.f26698r;
                        if (lx0Var == null) {
                            gzVar2.d(false);
                            fzVar2.G1(null);
                            tzVar2.f30782o0.d.setText("");
                            tzVar2.f30765i0.h1(0, 0);
                            return;
                        } else if (fzVar2.getSelectedCategory() == lx0Var) {
                            gzVar2.c(null, false);
                            fzVar2.G1(null);
                            return;
                        } else {
                            gzVar2.c(lx0Var.f28340a, false);
                            fzVar2.G1(lx0Var);
                            return;
                        }
                }
            }
        });
        fzVar.setOnTouchListener(new m.d2(this, 2));
        fzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final gz f26017b;

            {
                this.f26017b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gz gzVar = this.f26017b;
                        gzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        gzVar.d(z11);
                        gzVar.g(false);
                        return;
                    default:
                        lx0 lx0Var = (lx0) obj;
                        gz gzVar2 = this.f26017b;
                        tz tzVar2 = gzVar2.G;
                        fz fzVar2 = gzVar2.f26698r;
                        if (lx0Var == null) {
                            gzVar2.d(false);
                            fzVar2.G1(null);
                            tzVar2.f30782o0.d.setText("");
                            tzVar2.f30765i0.h1(0, 0);
                            return;
                        } else if (fzVar2.getSelectedCategory() == lx0Var) {
                            gzVar2.c(null, false);
                            fzVar2.G1(null);
                            return;
                        } else {
                            gzVar2.c(lx0Var.f28340a, false);
                            fzVar2.G1(lx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(fzVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(gz gzVar, boolean z10, boolean z11) {
        gzVar.f26693a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        tz tzVar = this.G;
        int i10 = this.f26694b;
        if (i10 == 0) {
            oz ozVar = tzVar.f30820z0;
            mz mzVar = ozVar.O;
            tz tzVar2 = ozVar.Q;
            dx dxVar = tzVar2.G0;
            ax axVar = tzVar2.D0;
            if (ozVar.L != 0) {
                ConnectionsManager.getInstance(tzVar2.f30747c1).cancelRequest(ozVar.L, true);
                ozVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                ozVar.N = null;
                ozVar.E.clear();
                ozVar.H.clear();
                ozVar.K = new ArrayList();
                s4.g0 adapter = axVar.getAdapter();
                kz kzVar = tzVar2.f30817y0;
                if (adapter != kzVar) {
                    axVar.setAdapter(kzVar);
                }
                ozVar.d = 0L;
                tzVar2.f30738a.a(false, true);
                ozVar.l();
                dxVar.e(false);
            } else {
                ozVar.N = str.toLowerCase();
                dxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(mzVar);
            AndroidUtilities.runOnUIThread(mzVar, 300L);
        } else if (i10 == 1) {
            tzVar.S.F(str, z10);
        } else if (i10 == 2) {
            tzVar.f30768j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f26701x) {
            return;
        }
        this.f26701x = z10;
        ValueAnimator valueAnimator = this.f26702y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f26700w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f26702y = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 23));
        this.f26702y.setDuration(120L);
        this.f26702y.setInterpolator(bs.h);
        this.f26702y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f26695c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                hq hqVar = new hq(this, 15);
                this.E = hqVar;
                AndroidUtilities.runOnUIThread(hqVar, 340L);
                return;
            }
            return;
        }
        hq hqVar2 = this.E;
        if (hqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(hqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        sq sqVar = this.d;
        fz fzVar = this.f26698r;
        if (z11 && ((sqVar.length() != 0 || (fzVar != null && fzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (sqVar.length() <= 0 && (fzVar == null || fzVar.f29457m3 <= 0.5f || (!fzVar.f29452h3 && fzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f26695c.b(i10);
        this.F = false;
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
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

    @Override
    public final void E(float f7, int i10) {
    }
}
