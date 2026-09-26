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
public abstract class zy extends FrameLayout implements le.e {
    public zp E;
    public boolean F;
    public final mz G;
    public final le.c f30999a;
    public final int f31000b;
    public final ln0 f31001c;
    public final kq d;
    public final View e;
    public final View f31002f;
    public final ImageView h;
    public final FrameLayout f31003n;
    public final yy f31004r;
    public final ci.m6 f31005s;
    public final View v;
    public float f31006w;
    public boolean f31007x;
    public ValueAnimator f31008y;

    public zy(mz mzVar, Context context, int i10) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i11;
        this.G = mzVar;
        this.f30999a = new le.c(0, this, sr.f28340g, 200L, false);
        this.f31007x = false;
        this.f31000b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int z14 = mzVar.z(org.telegram.ui.ActionBar.h6.Ke);
        boolean z15 = mzVar.f26568i2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f31002f = view2;
        if (mzVar.f26603u0) {
            view2.setBackgroundColor(mzVar.z(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, mzVar.f26544b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31003n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = mzVar.v(0.06f);
        } else {
            z10 = mzVar.z(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f47110a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f31005s = m6Var;
        frameLayout.addView(m6Var, w7.y5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ln0 ln0Var = new ln0();
        this.f31001c = ln0Var;
        ln0Var.c(0, false, false);
        if (z15) {
            z11 = mzVar.v(0.4f);
        } else {
            z11 = mzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        ln0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(ln0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final zy f30221b;

            {
                this.f30221b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        zy zyVar = this.f30221b;
                        yy yyVar = zyVar.f31004r;
                        kq kqVar = zyVar.d;
                        if (zyVar.f31001c.f26120k == 1) {
                            kqVar.setText("");
                            zyVar.c(null, false);
                            if (yyVar != null) {
                                yyVar.D1();
                                yyVar.F1(null);
                                yyVar.G1(true, true);
                            }
                            zyVar.f(false);
                            kqVar.clearAnimation();
                            kqVar.animate().translationX(0.0f).setInterpolator(sr.h).start();
                            zyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        zy zyVar2 = this.f30221b;
                        kq kqVar2 = zyVar2.d;
                        kqVar2.setText("");
                        zyVar2.c(null, false);
                        yy yyVar2 = zyVar2.f31004r;
                        if (yyVar2 != null) {
                            yyVar2.D1();
                            yyVar2.F1(null);
                            yyVar2.G1(true, true);
                        }
                        zyVar2.f(false);
                        kqVar2.clearAnimation();
                        kqVar2.animate().translationX(0.0f).setInterpolator(sr.h).start();
                        zyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        kq kqVar = new kq(this, context, i10, 2);
        this.d = kqVar;
        kqVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = mzVar.v(0.45f);
        } else {
            z12 = mzVar.z(org.telegram.ui.ActionBar.h6.Je);
        }
        kqVar.setHintTextColor(z12);
        if (z15) {
            z13 = mzVar.v(0.8f);
        } else {
            z13 = mzVar.z(org.telegram.ui.ActionBar.h6.G6);
        }
        kqVar.setTextColor(z13);
        kqVar.setBackgroundDrawable(null);
        kqVar.setPadding(0, 0, 0, 0);
        kqVar.setMaxLines(1);
        kqVar.setLines(1);
        kqVar.setSingleLine(true);
        kqVar.setImeOptions(268435459);
        kqVar.setHint(LocaleController.getString(R.string.Search));
        kqVar.setCursorColor(mzVar.z(org.telegram.ui.ActionBar.h6.Mh));
        kqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        kqVar.setCursorWidth(1.5f);
        kqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(kqVar, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        kqVar.addTextChangedListener(new ci.i2(this, 8));
        if (mzVar.f26603u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(mzVar.z(org.telegram.ui.ActionBar.h6.He), mzVar.z(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            m6Var.addView(view3, w7.y5.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, mzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final zy f30221b;

            {
                this.f30221b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        zy zyVar = this.f30221b;
                        yy yyVar = zyVar.f31004r;
                        kq kqVar2 = zyVar.d;
                        if (zyVar.f31001c.f26120k == 1) {
                            kqVar2.setText("");
                            zyVar.c(null, false);
                            if (yyVar != null) {
                                yyVar.D1();
                                yyVar.F1(null);
                                yyVar.G1(true, true);
                            }
                            zyVar.f(false);
                            kqVar2.clearAnimation();
                            kqVar2.animate().translationX(0.0f).setInterpolator(sr.h).start();
                            zyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        zy zyVar2 = this.f30221b;
                        kq kqVar22 = zyVar2.d;
                        kqVar22.setText("");
                        zyVar2.c(null, false);
                        yy yyVar2 = zyVar2.f31004r;
                        if (yyVar2 != null) {
                            yyVar2.D1();
                            yyVar2.F1(null);
                            yyVar2.G1(true, true);
                        }
                        zyVar2.f(false);
                        kqVar22.clearAnimation();
                        kqVar22.animate().translationX(0.0f).setInterpolator(sr.h).start();
                        zyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (i10 == 1 && (!mzVar.f26549c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        yy yyVar = new yy(this, context, i11, mzVar.Z1, i10);
        this.f31004r = yyVar;
        yyVar.f24906w3 = z15;
        TextPaint paint = kqVar.getPaint();
        yyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) kqVar.getHint()) + "")));
        if (mzVar.f26603u0) {
            yyVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(mzVar.z(org.telegram.ui.ActionBar.h6.He), mzVar.z(org.telegram.ui.ActionBar.h6.Ie)));
        }
        yyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final zy f30487b;

            {
                this.f30487b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        zy zyVar = this.f30487b;
                        zyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zyVar.d(z16);
                        zyVar.g(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        zy zyVar2 = this.f30487b;
                        mz mzVar2 = zyVar2.G;
                        yy yyVar2 = zyVar2.f31004r;
                        if (dx0Var == null) {
                            zyVar2.d(false);
                            yyVar2.F1(null);
                            mzVar2.f26583o0.d.setText("");
                            mzVar2.f26566i0.h1(0, 0);
                            return;
                        } else if (yyVar2.getSelectedCategory() == dx0Var) {
                            zyVar2.c(null, false);
                            yyVar2.F1(null);
                            return;
                        } else {
                            zyVar2.c(dx0Var.f23766a, false);
                            yyVar2.F1(dx0Var);
                            return;
                        }
                }
            }
        });
        yyVar.setOnTouchListener(new m.c2(this, 2));
        yyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final zy f30487b;

            {
                this.f30487b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        zy zyVar = this.f30487b;
                        zyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zyVar.d(z16);
                        zyVar.g(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        zy zyVar2 = this.f30487b;
                        mz mzVar2 = zyVar2.G;
                        yy yyVar2 = zyVar2.f31004r;
                        if (dx0Var == null) {
                            zyVar2.d(false);
                            yyVar2.F1(null);
                            mzVar2.f26583o0.d.setText("");
                            mzVar2.f26566i0.h1(0, 0);
                            return;
                        } else if (yyVar2.getSelectedCategory() == dx0Var) {
                            zyVar2.c(null, false);
                            yyVar2.F1(null);
                            return;
                        } else {
                            zyVar2.c(dx0Var.f23766a, false);
                            yyVar2.F1(dx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(yyVar, w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(zy zyVar, boolean z10, boolean z11) {
        zyVar.f30999a.a(z10, z11);
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
        mz mzVar = this.G;
        int i10 = this.f31000b;
        if (i10 == 0) {
            hz hzVar = mzVar.f26621z0;
            fz fzVar = hzVar.O;
            mz mzVar2 = hzVar.Q;
            yw ywVar = mzVar2.G0;
            uw uwVar = mzVar2.D0;
            if (hzVar.L != 0) {
                ConnectionsManager.getInstance(mzVar2.f26548c1).cancelRequest(hzVar.L, true);
                hzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                hzVar.N = null;
                hzVar.E.clear();
                hzVar.H.clear();
                hzVar.K = new ArrayList();
                s4.h0 adapter = uwVar.getAdapter();
                dz dzVar = mzVar2.f26618y0;
                if (adapter != dzVar) {
                    uwVar.setAdapter(dzVar);
                }
                hzVar.d = 0L;
                mzVar2.f26539a.a(false, true);
                hzVar.l();
                ywVar.e(false);
            } else {
                hzVar.N = str.toLowerCase();
                ywVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            AndroidUtilities.runOnUIThread(fzVar, 300L);
        } else if (i10 == 1) {
            mzVar.S.F(str, z10);
        } else if (i10 == 2) {
            mzVar.f26569j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f31007x) {
            return;
        }
        this.f31007x = z10;
        ValueAnimator valueAnimator = this.f31008y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f31006w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f31008y = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 22));
        this.f31008y.setDuration(120L);
        this.f31008y.setInterpolator(sr.h);
        this.f31008y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f31001c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                zp zpVar = new zp(this, 15);
                this.E = zpVar;
                AndroidUtilities.runOnUIThread(zpVar, 340L);
                return;
            }
            return;
        }
        zp zpVar2 = this.E;
        if (zpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(zpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        kq kqVar = this.d;
        yy yyVar = this.f31004r;
        if (z11 && ((kqVar.length() != 0 || (yyVar != null && yyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (kqVar.length() <= 0 && (yyVar == null || yyVar.f24898o3 <= 0.5f || (!yyVar.j3 && yyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f31001c.b(i10);
        this.F = false;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
