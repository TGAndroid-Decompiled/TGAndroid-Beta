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
public abstract class pz extends FrameLayout implements me.d {
    public pq E;
    public boolean F;
    public final d00 G;
    public final me.b f29616a;
    public final int f29617b;
    public final jo0 f29618c;
    public final ar d;
    public final View f29619e;
    public final View f29620f;
    public final ImageView h;
    public final FrameLayout f29621n;
    public final oz f29622r;
    public final ci.m6 f29623s;
    public final View v;
    public float f29624w;
    public boolean f29625x;
    public ValueAnimator f29626y;

    public pz(d00 d00Var, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        int i12;
        this.G = d00Var;
        this.f29616a = new me.b(0, this, js.f27628g, 200L, false);
        this.f29625x = false;
        this.f29617b = i10;
        View view = new View(context);
        this.f29619e = view;
        view.setVisibility(4);
        int A5 = d00Var.A(org.telegram.ui.ActionBar.h6.Ke);
        boolean z10 = d00Var.f25101i2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f29620f = view2;
        if (d00Var.f25136u0) {
            view2.setBackgroundColor(d00Var.A(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, d00Var.f25076b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29621n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = d00Var.w(0.06f);
        } else {
            A = d00Var.A(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52395a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.w5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.w5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f29623s = m6Var;
        frameLayout.addView(m6Var, w7.w5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        jo0 jo0Var = new jo0();
        this.f29618c = jo0Var;
        jo0Var.c(0, false, false);
        if (z10) {
            A2 = d00Var.w(0.4f);
        } else {
            A2 = d00Var.A(org.telegram.ui.ActionBar.h6.Je);
        }
        jo0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(jo0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final pz f28688b;

            {
                this.f28688b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        pz pzVar = this.f28688b;
                        oz ozVar = pzVar.f29622r;
                        ar arVar = pzVar.d;
                        if (pzVar.f29618c.f27581k == 1) {
                            arVar.setText("");
                            pzVar.c(null, false);
                            if (ozVar != null) {
                                ozVar.E1();
                                ozVar.G1(null);
                                ozVar.H1(true, true);
                            }
                            pzVar.f(false);
                            arVar.clearAnimation();
                            arVar.animate().translationX(0.0f).setInterpolator(js.h).start();
                            pzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        pz pzVar2 = this.f28688b;
                        ar arVar2 = pzVar2.d;
                        arVar2.setText("");
                        pzVar2.c(null, false);
                        oz ozVar2 = pzVar2.f29622r;
                        if (ozVar2 != null) {
                            ozVar2.E1();
                            ozVar2.G1(null);
                            ozVar2.H1(true, true);
                        }
                        pzVar2.f(false);
                        arVar2.clearAnimation();
                        arVar2.animate().translationX(0.0f).setInterpolator(js.h).start();
                        pzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.w5.e(36, 36, 51));
        ar arVar = new ar(this, context, i10, 2);
        this.d = arVar;
        arVar.setTextSize(1, 16.0f);
        if (z10) {
            A3 = d00Var.w(0.45f);
        } else {
            A3 = d00Var.A(org.telegram.ui.ActionBar.h6.Je);
        }
        arVar.setHintTextColor(A3);
        if (z10) {
            A4 = d00Var.w(0.8f);
        } else {
            A4 = d00Var.A(org.telegram.ui.ActionBar.h6.G6);
        }
        arVar.setTextColor(A4);
        arVar.setBackgroundDrawable(null);
        arVar.setPadding(0, 0, 0, 0);
        arVar.setMaxLines(1);
        arVar.setLines(1);
        arVar.setSingleLine(true);
        arVar.setImeOptions(268435459);
        arVar.setHint(LocaleController.getString(R.string.Search));
        arVar.setCursorColor(d00Var.A(org.telegram.ui.ActionBar.h6.Mh));
        arVar.setCursorSize(AndroidUtilities.dp(20.0f));
        arVar.setCursorWidth(1.5f);
        arVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(arVar, w7.w5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        arVar.addTextChangedListener(new ci.h2(this, 8));
        if (d00Var.f25136u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(d00Var.A(org.telegram.ui.ActionBar.h6.He), d00Var.A(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            m6Var.addView(view3, w7.w5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, d00Var.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final pz f28688b;

            {
                this.f28688b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        pz pzVar = this.f28688b;
                        oz ozVar = pzVar.f29622r;
                        ar arVar2 = pzVar.d;
                        if (pzVar.f29618c.f27581k == 1) {
                            arVar2.setText("");
                            pzVar.c(null, false);
                            if (ozVar != null) {
                                ozVar.E1();
                                ozVar.G1(null);
                                ozVar.H1(true, true);
                            }
                            pzVar.f(false);
                            arVar2.clearAnimation();
                            arVar2.animate().translationX(0.0f).setInterpolator(js.h).start();
                            pzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        pz pzVar2 = this.f28688b;
                        ar arVar22 = pzVar2.d;
                        arVar22.setText("");
                        pzVar2.c(null, false);
                        oz ozVar2 = pzVar2.f29622r;
                        if (ozVar2 != null) {
                            ozVar2.E1();
                            ozVar2.G1(null);
                            ozVar2.H1(true, true);
                        }
                        pzVar2.f(false);
                        arVar22.clearAnimation();
                        arVar22.animate().translationX(0.0f).setInterpolator(js.h).start();
                        pzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.w5.e(36, 36, 53));
        if (i10 == 1 && (!d00Var.f25081c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        oz ozVar = new oz(this, context, i12, d00Var.Z1, i10);
        this.f29622r = ozVar;
        ozVar.f25824u3 = z10;
        TextPaint paint = arVar.getPaint();
        ozVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) arVar.getHint()) + "")));
        if (d00Var.f25136u0) {
            ozVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(d00Var.A(org.telegram.ui.ActionBar.h6.He), d00Var.A(org.telegram.ui.ActionBar.h6.Ie)));
        }
        ozVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final pz f28983b;

            {
                this.f28983b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        pz pzVar = this.f28983b;
                        pzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        pzVar.d(z11);
                        pzVar.g(false);
                        return;
                    default:
                        ay0 ay0Var = (ay0) obj;
                        pz pzVar2 = this.f28983b;
                        d00 d00Var2 = pzVar2.G;
                        oz ozVar2 = pzVar2.f29622r;
                        if (ay0Var == null) {
                            pzVar2.d(false);
                            ozVar2.G1(null);
                            d00Var2.f25116o0.d.setText("");
                            d00Var2.f25099i0.h1(0, 0);
                            return;
                        } else if (ozVar2.getSelectedCategory() == ay0Var) {
                            pzVar2.c(null, false);
                            ozVar2.G1(null);
                            return;
                        } else {
                            pzVar2.c(ay0Var.f24507a, false);
                            ozVar2.G1(ay0Var);
                            return;
                        }
                }
            }
        });
        ozVar.setOnTouchListener(new m.d2(this, 2));
        ozVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final pz f28983b;

            {
                this.f28983b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        pz pzVar = this.f28983b;
                        pzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        pzVar.d(z11);
                        pzVar.g(false);
                        return;
                    default:
                        ay0 ay0Var = (ay0) obj;
                        pz pzVar2 = this.f28983b;
                        d00 d00Var2 = pzVar2.G;
                        oz ozVar2 = pzVar2.f29622r;
                        if (ay0Var == null) {
                            pzVar2.d(false);
                            ozVar2.G1(null);
                            d00Var2.f25116o0.d.setText("");
                            d00Var2.f25099i0.h1(0, 0);
                            return;
                        } else if (ozVar2.getSelectedCategory() == ay0Var) {
                            pzVar2.c(null, false);
                            ozVar2.G1(null);
                            return;
                        } else {
                            pzVar2.c(ay0Var.f24507a, false);
                            ozVar2.G1(ay0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(ozVar, w7.w5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public static void a(pz pzVar, boolean z10, boolean z11) {
        pzVar.f29616a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        d00 d00Var = this.G;
        int i10 = this.f29617b;
        if (i10 == 0) {
            yz yzVar = d00Var.f25154z0;
            wz wzVar = yzVar.O;
            d00 d00Var2 = yzVar.Q;
            ox oxVar = d00Var2.G0;
            lx lxVar = d00Var2.D0;
            if (yzVar.L != 0) {
                ConnectionsManager.getInstance(d00Var2.f25080c1).cancelRequest(yzVar.L, true);
                yzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                yzVar.N = null;
                yzVar.E.clear();
                yzVar.H.clear();
                yzVar.K = new ArrayList();
                s4.i0 adapter = lxVar.getAdapter();
                tz tzVar = d00Var2.f25151y0;
                if (adapter != tzVar) {
                    lxVar.setAdapter(tzVar);
                }
                yzVar.d = 0L;
                d00Var2.f25071a.a(false, true);
                yzVar.l();
                oxVar.e(false);
            } else {
                yzVar.N = str.toLowerCase();
                oxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(wzVar);
            AndroidUtilities.runOnUIThread(wzVar, 300L);
        } else if (i10 == 1) {
            d00Var.S.F(str, z10);
        } else if (i10 == 2) {
            d00Var.f25102j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f29625x) {
            return;
        }
        this.f29625x = z10;
        ValueAnimator valueAnimator = this.f29626y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f29624w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f29626y = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 23));
        this.f29626y.setDuration(120L);
        this.f29626y.setInterpolator(js.h);
        this.f29626y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f29618c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                pq pqVar = new pq(this, 15);
                this.E = pqVar;
                AndroidUtilities.runOnUIThread(pqVar, 340L);
                return;
            }
            return;
        }
        pq pqVar2 = this.E;
        if (pqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(pqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        ar arVar = this.d;
        oz ozVar = this.f29622r;
        if (z11 && ((arVar.length() != 0 || (ozVar != null && ozVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (arVar.length() <= 0 && (ozVar == null || ozVar.f25816m3 <= 0.5f || (!ozVar.f25812h3 && ozVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f29618c.b(i10);
        this.F = false;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f29619e;
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
    public final void C(float f7, int i10) {
    }
}
