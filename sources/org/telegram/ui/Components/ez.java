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
public abstract class ez extends FrameLayout implements le.d {
    public dq E;
    public boolean F;
    public final rz G;
    public final le.b f22779a;
    public final int f22780b;
    public final hn0 f22781c;
    public final oq d;
    public final View e;
    public final View f22782f;
    public final ImageView h;
    public final FrameLayout f22783n;
    public final dz f22784r;
    public final bi.n7 f22785s;
    public final View v;
    public float f22786w;
    public boolean f22787x;
    public ValueAnimator f22788y;

    public ez(rz rzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = rzVar;
        this.f22779a = new le.b(0, this, wr.f28820g, 200L, false);
        this.f22787x = false;
        this.f22780b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z14 = rzVar.z(org.telegram.ui.ActionBar.j6.Ke);
        boolean z15 = rzVar.f26825i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f22782f = view2;
        if (rzVar.f26860u0) {
            view2.setBackgroundColor(rzVar.z(org.telegram.ui.ActionBar.j6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, rzVar.f26801b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22783n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = rzVar.v(0.06f);
        } else {
            z10 = rzVar.z(org.telegram.ui.ActionBar.j6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        bi.g gVar = xf.k0.f45156a;
        frameLayout.setOutlineProvider(new xf.j0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.n7 n7Var = new bi.n7(this, context, 10);
        this.f22785s = n7Var;
        frameLayout.addView(n7Var, w7.a6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        hn0 hn0Var = new hn0();
        this.f22781c = hn0Var;
        hn0Var.c(0, false, false);
        if (z15) {
            z11 = rzVar.v(0.4f);
        } else {
            z11 = rzVar.z(org.telegram.ui.ActionBar.j6.Je);
        }
        hn0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(hn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ez f21920b;

            {
                this.f21920b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ez ezVar = this.f21920b;
                        dz dzVar = ezVar.f22784r;
                        oq oqVar = ezVar.d;
                        if (ezVar.f22781c.f23703k == 1) {
                            oqVar.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.C1();
                                dzVar.E1(null);
                                dzVar.F1(true, true);
                            }
                            ezVar.f(false);
                            oqVar.clearAnimation();
                            oqVar.animate().translationX(0.0f).setInterpolator(wr.h).start();
                            ezVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ez ezVar2 = this.f21920b;
                        oq oqVar2 = ezVar2.d;
                        oqVar2.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.f22784r;
                        if (dzVar2 != null) {
                            dzVar2.C1();
                            dzVar2.E1(null);
                            dzVar2.F1(true, true);
                        }
                        ezVar2.f(false);
                        oqVar2.clearAnimation();
                        oqVar2.animate().translationX(0.0f).setInterpolator(wr.h).start();
                        ezVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        oq oqVar = new oq(this, context, i10, 2);
        this.d = oqVar;
        oqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = rzVar.v(0.45f);
        } else {
            z12 = rzVar.z(org.telegram.ui.ActionBar.j6.Je);
        }
        oqVar.setHintTextColor(z12);
        if (z15) {
            z13 = rzVar.v(0.8f);
        } else {
            z13 = rzVar.z(org.telegram.ui.ActionBar.j6.G6);
        }
        oqVar.setTextColor(z13);
        oqVar.setBackgroundDrawable(null);
        oqVar.setPadding(0, 0, 0, 0);
        oqVar.setMaxLines(1);
        oqVar.setLines(1);
        oqVar.setSingleLine(true);
        oqVar.setImeOptions(268435459);
        oqVar.setHint(LocaleController.getString(R.string.Search));
        oqVar.setCursorColor(rzVar.z(org.telegram.ui.ActionBar.j6.Mh));
        oqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oqVar.setCursorWidth(1.5f);
        oqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        n7Var.addView(oqVar, w7.a6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        oqVar.addTextChangedListener(new bi.u2(this, 8));
        if (rzVar.f26860u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v(rzVar.z(org.telegram.ui.ActionBar.j6.He), rzVar.z(org.telegram.ui.ActionBar.j6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            n7Var.addView(view3, w7.a6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new bi.v2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, rzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ez f21920b;

            {
                this.f21920b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        ez ezVar = this.f21920b;
                        dz dzVar = ezVar.f22784r;
                        oq oqVar2 = ezVar.d;
                        if (ezVar.f22781c.f23703k == 1) {
                            oqVar2.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.C1();
                                dzVar.E1(null);
                                dzVar.F1(true, true);
                            }
                            ezVar.f(false);
                            oqVar2.clearAnimation();
                            oqVar2.animate().translationX(0.0f).setInterpolator(wr.h).start();
                            ezVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ez ezVar2 = this.f21920b;
                        oq oqVar22 = ezVar2.d;
                        oqVar22.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.f22784r;
                        if (dzVar2 != null) {
                            dzVar2.C1();
                            dzVar2.E1(null);
                            dzVar2.F1(true, true);
                        }
                        ezVar2.f(false);
                        oqVar22.clearAnimation();
                        oqVar22.animate().translationX(0.0f).setInterpolator(wr.h).start();
                        ezVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (i10 == 1 && (!rzVar.f26806c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        dz dzVar = new dz(this, context, i11, rzVar.Z1, i10);
        this.f22784r = dzVar;
        dzVar.f23798w3 = z15;
        TextPaint paint = oqVar.getPaint();
        dzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) oqVar.getHint()) + "")));
        if (rzVar.f26860u0) {
            dzVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v(rzVar.z(org.telegram.ui.ActionBar.j6.He), rzVar.z(org.telegram.ui.ActionBar.j6.Ie)));
        }
        dzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final ez f22254b;

            {
                this.f22254b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ez ezVar = this.f22254b;
                        ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ezVar.d(z16);
                        ezVar.g(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        ez ezVar2 = this.f22254b;
                        rz rzVar2 = ezVar2.G;
                        dz dzVar2 = ezVar2.f22784r;
                        if (dx0Var == null) {
                            ezVar2.d(false);
                            dzVar2.E1(null);
                            rzVar2.f26840o0.d.setText("");
                            rzVar2.f26823i0.h1(0, 0);
                            return;
                        } else if (dzVar2.getSelectedCategory() == dx0Var) {
                            ezVar2.c(null, false);
                            dzVar2.E1(null);
                            return;
                        } else {
                            ezVar2.c(dx0Var.f22495a, false);
                            dzVar2.E1(dx0Var);
                            return;
                        }
                }
            }
        });
        dzVar.setOnTouchListener(new m.c2(this, 2));
        dzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final ez f22254b;

            {
                this.f22254b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ez ezVar = this.f22254b;
                        ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ezVar.d(z16);
                        ezVar.g(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        ez ezVar2 = this.f22254b;
                        rz rzVar2 = ezVar2.G;
                        dz dzVar2 = ezVar2.f22784r;
                        if (dx0Var == null) {
                            ezVar2.d(false);
                            dzVar2.E1(null);
                            rzVar2.f26840o0.d.setText("");
                            rzVar2.f26823i0.h1(0, 0);
                            return;
                        } else if (dzVar2.getSelectedCategory() == dx0Var) {
                            ezVar2.c(null, false);
                            dzVar2.E1(null);
                            return;
                        } else {
                            ezVar2.c(dx0Var.f22495a, false);
                            dzVar2.E1(dx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(dzVar, w7.a6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(ez ezVar, boolean z10, boolean z11) {
        ezVar.f22779a.a(z10, z11);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
        rz rzVar = this.G;
        int i10 = this.f22780b;
        if (i10 == 0) {
            mz mzVar = rzVar.f26878z0;
            kz kzVar = mzVar.O;
            rz rzVar2 = mzVar.Q;
            bx bxVar = rzVar2.G0;
            yw ywVar = rzVar2.D0;
            if (mzVar.L != 0) {
                ConnectionsManager.getInstance(rzVar2.f26805c1).cancelRequest(mzVar.L, true);
                mzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                mzVar.N = null;
                mzVar.E.clear();
                mzVar.H.clear();
                mzVar.K = new ArrayList();
                s4.h0 adapter = ywVar.getAdapter();
                iz izVar = rzVar2.f26875y0;
                if (adapter != izVar) {
                    ywVar.setAdapter(izVar);
                }
                mzVar.d = 0L;
                rzVar2.f26796a.a(false, true);
                mzVar.l();
                bxVar.e(false);
            } else {
                mzVar.N = str.toLowerCase();
                bxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(kzVar);
            AndroidUtilities.runOnUIThread(kzVar, 300L);
        } else if (i10 == 1) {
            rzVar.S.F(str, z10);
        } else if (i10 == 2) {
            rzVar.f26826j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f22787x) {
            return;
        }
        this.f22787x = z10;
        ValueAnimator valueAnimator = this.f22788y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f22786w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f22788y = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 22));
        this.f22788y.setDuration(120L);
        this.f22788y.setInterpolator(wr.h);
        this.f22788y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f22781c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                dq dqVar = new dq(this, 15);
                this.E = dqVar;
                AndroidUtilities.runOnUIThread(dqVar, 340L);
                return;
            }
            return;
        }
        dq dqVar2 = this.E;
        if (dqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(dqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        oq oqVar = this.d;
        dz dzVar = this.f22784r;
        if (z11 && ((oqVar.length() != 0 || (dzVar != null && dzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (oqVar.length() <= 0 && (dzVar == null || dzVar.f23790o3 <= 0.5f || (!dzVar.j3 && dzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f22781c.b(i10);
        this.F = false;
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
