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
public abstract class az extends FrameLayout implements le.e {
    public aq E;
    public boolean F;
    public final nz G;
    public final le.c f22734a;
    public final int f22735b;
    public final nn0 f22736c;
    public final lq d;
    public final View e;
    public final View f22737f;
    public final ImageView h;
    public final FrameLayout f22738n;
    public final zy f22739r;
    public final ci.m6 f22740s;
    public final View v;
    public float f22741w;
    public boolean f22742x;
    public ValueAnimator f22743y;

    public az(nz nzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = nzVar;
        this.f22734a = new le.c(0, this, tr.f28637g, 200L, false);
        this.f22742x = false;
        this.f22735b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z14 = nzVar.z(org.telegram.ui.ActionBar.h6.Ke);
        boolean z15 = nzVar.f26838i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f22737f = view2;
        if (nzVar.f26873u0) {
            view2.setBackgroundColor(nzVar.z(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, nzVar.f26814b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22738n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = nzVar.v(0.06f);
        } else {
            z10 = nzVar.z(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f47219a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f22740s = m6Var;
        frameLayout.addView(m6Var, w7.y5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        nn0 nn0Var = new nn0();
        this.f22736c = nn0Var;
        nn0Var.c(0, false, false);
        if (z15) {
            z11 = nzVar.v(0.4f);
        } else {
            z11 = nzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        nn0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(nn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final az f30530b;

            {
                this.f30530b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        az azVar = this.f30530b;
                        zy zyVar = azVar.f22739r;
                        lq lqVar = azVar.d;
                        if (azVar.f22736c.f26748k == 1) {
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
                        az azVar2 = this.f30530b;
                        lq lqVar2 = azVar2.d;
                        lqVar2.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.f22739r;
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
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        lq lqVar = new lq(this, context, i10, 2);
        this.d = lqVar;
        lqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = nzVar.v(0.45f);
        } else {
            z12 = nzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        lqVar.setHintTextColor(z12);
        if (z15) {
            z13 = nzVar.v(0.8f);
        } else {
            z13 = nzVar.z(org.telegram.ui.ActionBar.h6.G6);
        }
        lqVar.setTextColor(z13);
        lqVar.setBackgroundDrawable(null);
        lqVar.setPadding(0, 0, 0, 0);
        lqVar.setMaxLines(1);
        lqVar.setLines(1);
        lqVar.setSingleLine(true);
        lqVar.setImeOptions(268435459);
        lqVar.setHint(LocaleController.getString(R.string.Search));
        lqVar.setCursorColor(nzVar.z(org.telegram.ui.ActionBar.h6.Mh));
        lqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        lqVar.setCursorWidth(1.5f);
        lqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(lqVar, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        lqVar.addTextChangedListener(new ci.i2(this, 8));
        if (nzVar.f26873u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(nzVar.z(org.telegram.ui.ActionBar.h6.He), nzVar.z(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.y5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, nzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final az f30530b;

            {
                this.f30530b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        az azVar = this.f30530b;
                        zy zyVar = azVar.f22739r;
                        lq lqVar2 = azVar.d;
                        if (azVar.f22736c.f26748k == 1) {
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
                        az azVar2 = this.f30530b;
                        lq lqVar22 = azVar2.d;
                        lqVar22.setText("");
                        azVar2.c(null, false);
                        zy zyVar2 = azVar2.f22739r;
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
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (i10 == 1 && (!nzVar.f26819c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        zy zyVar = new zy(this, context, i11, nzVar.Z1, i10);
        this.f22739r = zyVar;
        zyVar.D3 = z15;
        TextPaint paint = lqVar.getPaint();
        zyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) lqVar.getHint()) + "")));
        if (nzVar.f26873u0) {
            zyVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(nzVar.z(org.telegram.ui.ActionBar.h6.He), nzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
        }
        zyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final az f30831b;

            {
                this.f30831b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        az azVar = this.f30831b;
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
                        fx0 fx0Var = (fx0) obj;
                        az azVar2 = this.f30831b;
                        nz nzVar2 = azVar2.G;
                        zy zyVar2 = azVar2.f22739r;
                        if (fx0Var == null) {
                            azVar2.d(false);
                            zyVar2.H1(null);
                            nzVar2.f26853o0.d.setText("");
                            nzVar2.f26836i0.h1(0, 0);
                            return;
                        } else if (zyVar2.getSelectedCategory() == fx0Var) {
                            azVar2.c(null, false);
                            zyVar2.H1(null);
                            return;
                        } else {
                            azVar2.c(fx0Var.f24375a, false);
                            zyVar2.H1(fx0Var);
                            return;
                        }
                }
            }
        });
        zyVar.setOnTouchListener(new m.c2(this, 2));
        zyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final az f30831b;

            {
                this.f30831b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        az azVar = this.f30831b;
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
                        fx0 fx0Var = (fx0) obj;
                        az azVar2 = this.f30831b;
                        nz nzVar2 = azVar2.G;
                        zy zyVar2 = azVar2.f22739r;
                        if (fx0Var == null) {
                            azVar2.d(false);
                            zyVar2.H1(null);
                            nzVar2.f26853o0.d.setText("");
                            nzVar2.f26836i0.h1(0, 0);
                            return;
                        } else if (zyVar2.getSelectedCategory() == fx0Var) {
                            azVar2.c(null, false);
                            zyVar2.H1(null);
                            return;
                        } else {
                            azVar2.c(fx0Var.f24375a, false);
                            zyVar2.H1(fx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(zyVar, w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(az azVar, boolean z10, boolean z11) {
        azVar.f22734a.a(z10, z11);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
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
        nz nzVar = this.G;
        int i10 = this.f22735b;
        if (i10 == 0) {
            iz izVar = nzVar.f26891z0;
            gz gzVar = izVar.O;
            nz nzVar2 = izVar.Q;
            zw zwVar = nzVar2.G0;
            vw vwVar = nzVar2.D0;
            if (izVar.L != 0) {
                ConnectionsManager.getInstance(nzVar2.f26818c1).cancelRequest(izVar.L, true);
                izVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                izVar.N = null;
                izVar.E.clear();
                izVar.H.clear();
                izVar.K = new ArrayList();
                s4.h0 adapter = vwVar.getAdapter();
                ez ezVar = nzVar2.f26888y0;
                if (adapter != ezVar) {
                    vwVar.setAdapter(ezVar);
                }
                izVar.d = 0L;
                nzVar2.f26809a.a(false, true);
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
            nzVar.f26839j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f22742x) {
            return;
        }
        this.f22742x = z10;
        ValueAnimator valueAnimator = this.f22743y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f22741w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f22743y = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 22));
        this.f22743y.setDuration(120L);
        this.f22743y.setInterpolator(tr.h);
        this.f22743y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f22736c.b(2);
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
        zy zyVar = this.f22739r;
        if (z11 && ((lqVar.length() != 0 || (zyVar != null && zyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (lqVar.length() <= 0 && (zyVar == null || zyVar.f25580v3 <= 0.5f || (!zyVar.f25575q3 && zyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f22736c.b(i10);
        this.F = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
