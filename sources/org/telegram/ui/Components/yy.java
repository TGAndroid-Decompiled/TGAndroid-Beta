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
public abstract class yy extends FrameLayout implements le.e {
    public yp E;
    public boolean F;
    public final lz G;
    public final le.c f30722a;
    public final int f30723b;
    public final kn0 f30724c;
    public final jq d;
    public final View e;
    public final View f30725f;
    public final ImageView h;
    public final FrameLayout f30726n;
    public final xy f30727r;
    public final ci.m6 f30728s;
    public final View v;
    public float f30729w;
    public boolean f30730x;
    public ValueAnimator f30731y;

    public yy(lz lzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = lzVar;
        this.f30722a = new le.c(0, this, rr.f28031g, 200L, false);
        this.f30730x = false;
        this.f30723b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z14 = lzVar.z(org.telegram.ui.ActionBar.h6.Ke);
        boolean z15 = lzVar.f26256i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f30725f = view2;
        if (lzVar.f26291u0) {
            view2.setBackgroundColor(lzVar.z(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, lzVar.f26232b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30726n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = lzVar.v(0.06f);
        } else {
            z10 = lzVar.z(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f47111a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f30728s = m6Var;
        frameLayout.addView(m6Var, w7.y5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        kn0 kn0Var = new kn0();
        this.f30724c = kn0Var;
        kn0Var.c(0, false, false);
        if (z15) {
            z11 = lzVar.v(0.4f);
        } else {
            z11 = lzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        kn0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(kn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final yy f29828b;

            {
                this.f29828b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yy yyVar = this.f29828b;
                        xy xyVar = yyVar.f30727r;
                        jq jqVar = yyVar.d;
                        if (yyVar.f30724c.f25828k == 1) {
                            jqVar.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.D1();
                                xyVar.F1(null);
                                xyVar.G1(true, true);
                            }
                            yyVar.f(false);
                            jqVar.clearAnimation();
                            jqVar.animate().translationX(0.0f).setInterpolator(rr.h).start();
                            yyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yy yyVar2 = this.f29828b;
                        jq jqVar2 = yyVar2.d;
                        jqVar2.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.f30727r;
                        if (xyVar2 != null) {
                            xyVar2.D1();
                            xyVar2.F1(null);
                            xyVar2.G1(true, true);
                        }
                        yyVar2.f(false);
                        jqVar2.clearAnimation();
                        jqVar2.animate().translationX(0.0f).setInterpolator(rr.h).start();
                        yyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        jq jqVar = new jq(this, context, i10, 2);
        this.d = jqVar;
        jqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = lzVar.v(0.45f);
        } else {
            z12 = lzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        jqVar.setHintTextColor(z12);
        if (z15) {
            z13 = lzVar.v(0.8f);
        } else {
            z13 = lzVar.z(org.telegram.ui.ActionBar.h6.G6);
        }
        jqVar.setTextColor(z13);
        jqVar.setBackgroundDrawable(null);
        jqVar.setPadding(0, 0, 0, 0);
        jqVar.setMaxLines(1);
        jqVar.setLines(1);
        jqVar.setSingleLine(true);
        jqVar.setImeOptions(268435459);
        jqVar.setHint(LocaleController.getString(R.string.Search));
        jqVar.setCursorColor(lzVar.z(org.telegram.ui.ActionBar.h6.Mh));
        jqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        jqVar.setCursorWidth(1.5f);
        jqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(jqVar, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        jqVar.addTextChangedListener(new ci.i2(this, 8));
        if (lzVar.f26291u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(lzVar.z(org.telegram.ui.ActionBar.h6.He), lzVar.z(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.y5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, lzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final yy f29828b;

            {
                this.f29828b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        yy yyVar = this.f29828b;
                        xy xyVar = yyVar.f30727r;
                        jq jqVar2 = yyVar.d;
                        if (yyVar.f30724c.f25828k == 1) {
                            jqVar2.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.D1();
                                xyVar.F1(null);
                                xyVar.G1(true, true);
                            }
                            yyVar.f(false);
                            jqVar2.clearAnimation();
                            jqVar2.animate().translationX(0.0f).setInterpolator(rr.h).start();
                            yyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yy yyVar2 = this.f29828b;
                        jq jqVar22 = yyVar2.d;
                        jqVar22.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.f30727r;
                        if (xyVar2 != null) {
                            xyVar2.D1();
                            xyVar2.F1(null);
                            xyVar2.G1(true, true);
                        }
                        yyVar2.f(false);
                        jqVar22.clearAnimation();
                        jqVar22.animate().translationX(0.0f).setInterpolator(rr.h).start();
                        yyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (i10 == 1 && (!lzVar.f26237c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        xy xyVar = new xy(this, context, i11, lzVar.Z1, i10);
        this.f30727r = xyVar;
        xyVar.f24567w3 = z15;
        TextPaint paint = jqVar.getPaint();
        xyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) jqVar.getHint()) + "")));
        if (lzVar.f26291u0) {
            xyVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(lzVar.z(org.telegram.ui.ActionBar.h6.He), lzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
        }
        xyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final yy f30202b;

            {
                this.f30202b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yy yyVar = this.f30202b;
                        yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        yyVar.d(z16);
                        yyVar.g(false);
                        return;
                    default:
                        cx0 cx0Var = (cx0) obj;
                        yy yyVar2 = this.f30202b;
                        lz lzVar2 = yyVar2.G;
                        xy xyVar2 = yyVar2.f30727r;
                        if (cx0Var == null) {
                            yyVar2.d(false);
                            xyVar2.F1(null);
                            lzVar2.f26271o0.d.setText("");
                            lzVar2.f26254i0.h1(0, 0);
                            return;
                        } else if (xyVar2.getSelectedCategory() == cx0Var) {
                            yyVar2.c(null, false);
                            xyVar2.F1(null);
                            return;
                        } else {
                            yyVar2.c(cx0Var.f23408a, false);
                            xyVar2.F1(cx0Var);
                            return;
                        }
                }
            }
        });
        xyVar.setOnTouchListener(new m.c2(this, 2));
        xyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final yy f30202b;

            {
                this.f30202b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yy yyVar = this.f30202b;
                        yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        yyVar.d(z16);
                        yyVar.g(false);
                        return;
                    default:
                        cx0 cx0Var = (cx0) obj;
                        yy yyVar2 = this.f30202b;
                        lz lzVar2 = yyVar2.G;
                        xy xyVar2 = yyVar2.f30727r;
                        if (cx0Var == null) {
                            yyVar2.d(false);
                            xyVar2.F1(null);
                            lzVar2.f26271o0.d.setText("");
                            lzVar2.f26254i0.h1(0, 0);
                            return;
                        } else if (xyVar2.getSelectedCategory() == cx0Var) {
                            yyVar2.c(null, false);
                            xyVar2.F1(null);
                            return;
                        } else {
                            yyVar2.c(cx0Var.f23408a, false);
                            xyVar2.F1(cx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(xyVar, w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(yy yyVar, boolean z10, boolean z11) {
        yyVar.f30722a.a(z10, z11);
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
        lz lzVar = this.G;
        int i10 = this.f30723b;
        if (i10 == 0) {
            gz gzVar = lzVar.f26309z0;
            ez ezVar = gzVar.O;
            lz lzVar2 = gzVar.Q;
            xw xwVar = lzVar2.G0;
            tw twVar = lzVar2.D0;
            if (gzVar.L != 0) {
                ConnectionsManager.getInstance(lzVar2.f26236c1).cancelRequest(gzVar.L, true);
                gzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                gzVar.N = null;
                gzVar.E.clear();
                gzVar.H.clear();
                gzVar.K = new ArrayList();
                s4.h0 adapter = twVar.getAdapter();
                cz czVar = lzVar2.f26306y0;
                if (adapter != czVar) {
                    twVar.setAdapter(czVar);
                }
                gzVar.d = 0L;
                lzVar2.f26227a.a(false, true);
                gzVar.l();
                xwVar.e(false);
            } else {
                gzVar.N = str.toLowerCase();
                xwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(ezVar);
            AndroidUtilities.runOnUIThread(ezVar, 300L);
        } else if (i10 == 1) {
            lzVar.S.F(str, z10);
        } else if (i10 == 2) {
            lzVar.f26257j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f30730x) {
            return;
        }
        this.f30730x = z10;
        ValueAnimator valueAnimator = this.f30731y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f30729w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f30731y = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 22));
        this.f30731y.setDuration(120L);
        this.f30731y.setInterpolator(rr.h);
        this.f30731y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f30724c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                yp ypVar = new yp(this, 15);
                this.E = ypVar;
                AndroidUtilities.runOnUIThread(ypVar, 340L);
                return;
            }
            return;
        }
        yp ypVar2 = this.E;
        if (ypVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ypVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        jq jqVar = this.d;
        xy xyVar = this.f30727r;
        if (z11 && ((jqVar.length() != 0 || (xyVar != null && xyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (jqVar.length() <= 0 && (xyVar == null || xyVar.f24559o3 <= 0.5f || (!xyVar.j3 && xyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f30724c.b(i10);
        this.F = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
