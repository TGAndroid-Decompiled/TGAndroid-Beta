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
public abstract class az extends FrameLayout implements le.d {
    public aq E;
    public boolean F;
    public final nz G;
    public final le.b f24716a;
    public final int f24717b;
    public final qn0 f24718c;
    public final lq d;
    public final View f24719e;
    public final View f24720f;
    public final ImageView h;
    public final FrameLayout f24721n;
    public final zy f24722r;
    public final ci.m6 f24723s;
    public final View v;
    public float f24724w;
    public boolean f24725x;
    public ValueAnimator f24726y;

    public az(nz nzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = nzVar;
        this.f24716a = new le.b(0, this, tr.f31148g, 200L, false);
        this.f24725x = false;
        this.f24717b = i10;
        View view = new View(context);
        this.f24719e = view;
        view.setVisibility(4);
        int z14 = nzVar.z(org.telegram.ui.ActionBar.i6.Ke);
        boolean z15 = nzVar.f29118i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f24720f = view2;
        if (nzVar.f29153u0) {
            view2.setBackgroundColor(nzVar.z(org.telegram.ui.ActionBar.i6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, nzVar.f29093b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24721n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = nzVar.v(0.06f);
        } else {
            z10 = nzVar.z(org.telegram.ui.ActionBar.i6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.f0.f50986a;
        frameLayout.setOutlineProvider(new yf.d0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f24723s = m6Var;
        frameLayout.addView(m6Var, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        qn0 qn0Var = new qn0();
        this.f24718c = qn0Var;
        qn0Var.c(0, false, false);
        if (z15) {
            z11 = nzVar.v(0.4f);
        } else {
            z11 = nzVar.z(org.telegram.ui.ActionBar.i6.Je);
        }
        qn0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(qn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final az f33001b;

            {
                this.f33001b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        az azVar = this.f33001b;
                        zy zyVar = azVar.f24722r;
                        lq lqVar = azVar.d;
                        if (azVar.f24718c.f30113k == 1) {
                            lqVar.setText("");
                            azVar.c(null, false);
                            if (zyVar != null) {
                                zyVar.F1();
                                zyVar.H1(null);
                                zyVar.I1(true, true);
                            }
                            azVar.f(false);
                            lqVar.clearAnimation();
                            lqVar.animate().translationX(0.0f).setInterpolator(tr.h).start();
                            azVar.d(false);
                            return;
                        }
                        return;
                    default:
                        az azVar2 = this.f33001b;
                        lq lqVar2 = azVar2.d;
                        lqVar2.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.f24722r;
                        if (zyVar2 != null) {
                            zyVar2.F1();
                            zyVar2.H1(null);
                            zyVar2.I1(true, true);
                        }
                        azVar2.f(false);
                        lqVar2.clearAnimation();
                        lqVar2.animate().translationX(0.0f).setInterpolator(tr.h).start();
                        azVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        lq lqVar = new lq(this, context, i10, 2);
        this.d = lqVar;
        lqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = nzVar.v(0.45f);
        } else {
            z12 = nzVar.z(org.telegram.ui.ActionBar.i6.Je);
        }
        lqVar.setHintTextColor(z12);
        if (z15) {
            z13 = nzVar.v(0.8f);
        } else {
            z13 = nzVar.z(org.telegram.ui.ActionBar.i6.G6);
        }
        lqVar.setTextColor(z13);
        lqVar.setBackgroundDrawable(null);
        lqVar.setPadding(0, 0, 0, 0);
        lqVar.setMaxLines(1);
        lqVar.setLines(1);
        lqVar.setSingleLine(true);
        lqVar.setImeOptions(268435459);
        lqVar.setHint(LocaleController.getString(R.string.Search));
        lqVar.setCursorColor(nzVar.z(org.telegram.ui.ActionBar.i6.Mh));
        lqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        lqVar.setCursorWidth(1.5f);
        lqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(lqVar, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        lqVar.addTextChangedListener(new ci.i2(this, 8));
        if (nzVar.f29153u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v(nzVar.z(org.telegram.ui.ActionBar.i6.He), nzVar.z(org.telegram.ui.ActionBar.i6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.z5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, nzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final az f33001b;

            {
                this.f33001b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        az azVar = this.f33001b;
                        zy zyVar = azVar.f24722r;
                        lq lqVar2 = azVar.d;
                        if (azVar.f24718c.f30113k == 1) {
                            lqVar2.setText("");
                            azVar.c(null, false);
                            if (zyVar != null) {
                                zyVar.F1();
                                zyVar.H1(null);
                                zyVar.I1(true, true);
                            }
                            azVar.f(false);
                            lqVar2.clearAnimation();
                            lqVar2.animate().translationX(0.0f).setInterpolator(tr.h).start();
                            azVar.d(false);
                            return;
                        }
                        return;
                    default:
                        az azVar2 = this.f33001b;
                        lq lqVar22 = azVar2.d;
                        lqVar22.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.f24722r;
                        if (zyVar2 != null) {
                            zyVar2.F1();
                            zyVar2.H1(null);
                            zyVar2.I1(true, true);
                        }
                        azVar2.f(false);
                        lqVar22.clearAnimation();
                        lqVar22.animate().translationX(0.0f).setInterpolator(tr.h).start();
                        azVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 == 1 && (!nzVar.f29098c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        zy zyVar = new zy(this, context, i11, nzVar.Z1, i10);
        this.f24722r = zyVar;
        zyVar.D3 = z15;
        TextPaint paint = lqVar.getPaint();
        zyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) lqVar.getHint()) + "")));
        if (nzVar.f29153u0) {
            zyVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v(nzVar.z(org.telegram.ui.ActionBar.i6.He), nzVar.z(org.telegram.ui.ActionBar.i6.Ie)));
        }
        zyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final az f33285b;

            {
                this.f33285b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        az azVar = this.f33285b;
                        azVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        azVar.d(z16);
                        azVar.g(false);
                        return;
                    default:
                        nx0 nx0Var = (nx0) obj;
                        az azVar2 = this.f33285b;
                        nz nzVar2 = azVar2.G;
                        zy zyVar2 = azVar2.f24722r;
                        if (nx0Var == null) {
                            azVar2.d(false);
                            zyVar2.H1(null);
                            nzVar2.f29133o0.d.setText("");
                            nzVar2.f29116i0.h1(0, 0);
                            return;
                        } else if (zyVar2.getSelectedCategory() == nx0Var) {
                            azVar2.c(null, false);
                            zyVar2.H1(null);
                            return;
                        } else {
                            azVar2.c(nx0Var.f29076a, false);
                            zyVar2.H1(nx0Var);
                            return;
                        }
                }
            }
        });
        zyVar.setOnTouchListener(new m.c2(this, 2));
        zyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final az f33285b;

            {
                this.f33285b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        az azVar = this.f33285b;
                        azVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        azVar.d(z16);
                        azVar.g(false);
                        return;
                    default:
                        nx0 nx0Var = (nx0) obj;
                        az azVar2 = this.f33285b;
                        nz nzVar2 = azVar2.G;
                        zy zyVar2 = azVar2.f24722r;
                        if (nx0Var == null) {
                            azVar2.d(false);
                            zyVar2.H1(null);
                            nzVar2.f29133o0.d.setText("");
                            nzVar2.f29116i0.h1(0, 0);
                            return;
                        } else if (zyVar2.getSelectedCategory() == nx0Var) {
                            azVar2.c(null, false);
                            zyVar2.H1(null);
                            return;
                        } else {
                            azVar2.c(nx0Var.f29076a, false);
                            zyVar2.H1(nx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(zyVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(az azVar, boolean z10, boolean z11) {
        azVar.f24716a.a(z10, z11);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f24719e;
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
        nz nzVar = this.G;
        int i10 = this.f24717b;
        if (i10 == 0) {
            iz izVar = nzVar.f29171z0;
            gz gzVar = izVar.O;
            nz nzVar2 = izVar.Q;
            zw zwVar = nzVar2.G0;
            vw vwVar = nzVar2.D0;
            if (izVar.L != 0) {
                ConnectionsManager.getInstance(nzVar2.f29097c1).cancelRequest(izVar.L, true);
                izVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                izVar.N = null;
                izVar.E.clear();
                izVar.H.clear();
                izVar.K = new ArrayList();
                s4.h0 adapter = vwVar.getAdapter();
                ez ezVar = nzVar2.f29168y0;
                if (adapter != ezVar) {
                    vwVar.setAdapter(ezVar);
                }
                izVar.d = 0L;
                nzVar2.f29088a.a(false, true);
                izVar.l();
                zwVar.e(false);
            } else {
                izVar.N = str.toLowerCase();
                zwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(gzVar);
            AndroidUtilities.runOnUIThread(gzVar, 300L);
        } else if (i10 == 1) {
            nzVar.S.F(str, z10);
        } else if (i10 == 2) {
            nzVar.f29119j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f24725x) {
            return;
        }
        this.f24725x = z10;
        ValueAnimator valueAnimator = this.f24726y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f24724w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f24726y = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 22));
        this.f24726y.setDuration(120L);
        this.f24726y.setInterpolator(tr.h);
        this.f24726y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f24718c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                aq aqVar = new aq(this, 15);
                this.E = aqVar;
                AndroidUtilities.runOnUIThread(aqVar, 340L);
                return;
            }
            return;
        }
        aq aqVar2 = this.E;
        if (aqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(aqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        lq lqVar = this.d;
        zy zyVar = this.f24722r;
        if (z11 && ((lqVar.length() != 0 || (zyVar != null && zyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (lqVar.length() <= 0 && (zyVar == null || zyVar.f30543v3 <= 0.5f || (!zyVar.f30538q3 && zyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f24718c.b(i10);
        this.F = false;
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
