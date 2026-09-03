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
public abstract class yy extends FrameLayout implements xd.b {
    public xp B;
    public boolean C;
    public final mz D;
    public final xd.a f33683a;
    public final int f33684b;
    public final fn0 f33685c;
    public final iq d;
    public final View f33686e;
    public final View f33687f;
    public final ImageView h;
    public final FrameLayout f33688n;
    public final xy f33689r;
    public final ag.l f33690s;
    public final View v;
    public float f33691w;
    public boolean f33692x;
    public ValueAnimator f33693y;

    public yy(mz mzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        this.D = mzVar;
        this.f33683a = new xd.a(0, this, pr.f30169g, 200L, false);
        this.f33692x = false;
        this.f33684b = i10;
        View view = new View(context);
        this.f33686e = view;
        view.setVisibility(4);
        int A5 = mzVar.A(org.telegram.ui.ActionBar.k6.Ke);
        boolean z4 = mzVar.f29286f2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f33687f = view2;
        if (mzVar.f29320r0) {
            view2.setBackgroundColor(mzVar.A(org.telegram.ui.ActionBar.k6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, mzVar.Y0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33688n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z4) {
            A = mzVar.v(0.06f);
        } else {
            A = mzVar.A(org.telegram.ui.ActionBar.k6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, A));
        frameLayout.setClipToOutline(true);
        hg.j1 j1Var = lf.q0.f12504a;
        frameLayout.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, k7.c6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ag.l lVar = new ag.l(this, context, 14);
        this.f33690s = lVar;
        frameLayout.addView(lVar, k7.c6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fn0 fn0Var = new fn0();
        this.f33685c = fn0Var;
        fn0Var.c(0, false, false);
        if (z4) {
            A2 = mzVar.v(0.4f);
        } else {
            A2 = mzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        fn0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(fn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final yy f32570b;

            {
                this.f32570b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yy yyVar = this.f32570b;
                        xy xyVar = yyVar.f33689r;
                        iq iqVar = yyVar.d;
                        if (yyVar.f33685c.f26961k == 1) {
                            iqVar.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.C1();
                                xyVar.E1(null);
                                xyVar.F1(true, true);
                            }
                            yyVar.f(false);
                            iqVar.clearAnimation();
                            iqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            yyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yy yyVar2 = this.f32570b;
                        iq iqVar2 = yyVar2.d;
                        iqVar2.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.f33689r;
                        if (xyVar2 != null) {
                            xyVar2.C1();
                            xyVar2.E1(null);
                            xyVar2.F1(true, true);
                        }
                        yyVar2.f(false);
                        iqVar2.clearAnimation();
                        iqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        yyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, k7.c6.e(36, 36, 51));
        iq iqVar = new iq(this, context, i10, 2);
        this.d = iqVar;
        iqVar.setTextSize(1, 16.0f);
        if (z4) {
            A3 = mzVar.v(0.45f);
        } else {
            A3 = mzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        iqVar.setHintTextColor(A3);
        if (z4) {
            A4 = mzVar.v(0.8f);
        } else {
            A4 = mzVar.A(org.telegram.ui.ActionBar.k6.G6);
        }
        iqVar.setTextColor(A4);
        iqVar.setBackgroundDrawable(null);
        iqVar.setPadding(0, 0, 0, 0);
        iqVar.setMaxLines(1);
        iqVar.setLines(1);
        iqVar.setSingleLine(true);
        iqVar.setImeOptions(268435459);
        iqVar.setHint(LocaleController.getString(R.string.Search));
        iqVar.setCursorColor(mzVar.A(org.telegram.ui.ActionBar.k6.Mh));
        iqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        iqVar.setCursorWidth(1.5f);
        iqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        lVar.addView(iqVar, k7.c6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar.addTextChangedListener(new eh.c(this, 8));
        if (mzVar.f29320r0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v(mzVar.A(org.telegram.ui.ActionBar.k6.He), mzVar.A(org.telegram.ui.ActionBar.k6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            lVar.addView(view3, k7.c6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.m0(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, mzVar.W1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final yy f32570b;

            {
                this.f32570b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        yy yyVar = this.f32570b;
                        xy xyVar = yyVar.f33689r;
                        iq iqVar2 = yyVar.d;
                        if (yyVar.f33685c.f26961k == 1) {
                            iqVar2.setText("");
                            yyVar.c(null, false);
                            if (xyVar != null) {
                                xyVar.C1();
                                xyVar.E1(null);
                                xyVar.F1(true, true);
                            }
                            yyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(pr.h).start();
                            yyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yy yyVar2 = this.f32570b;
                        iq iqVar22 = yyVar2.d;
                        iqVar22.setText("");
                        yyVar2.c(null, false);
                        xy xyVar2 = yyVar2.f33689r;
                        if (xyVar2 != null) {
                            xyVar2.C1();
                            xyVar2.E1(null);
                            xyVar2.F1(true, true);
                        }
                        yyVar2.f(false);
                        iqVar22.clearAnimation();
                        iqVar22.animate().translationX(0.0f).setInterpolator(pr.h).start();
                        yyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, k7.c6.e(36, 36, 53));
        if (i10 == 1 && (!mzVar.Z1 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        xy xyVar = new xy(this, context, i11, mzVar.W1, i10);
        this.f33689r = xyVar;
        xyVar.f33210t3 = z4;
        TextPaint paint = iqVar.getPaint();
        xyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) iqVar.getHint()) + "")));
        if (mzVar.f29320r0) {
            xyVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v(mzVar.A(org.telegram.ui.ActionBar.k6.He), mzVar.A(org.telegram.ui.ActionBar.k6.Ie)));
        }
        xyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final yy f32847b;

            {
                this.f32847b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yy yyVar = this.f32847b;
                        yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        yyVar.d(z10);
                        yyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        yy yyVar2 = this.f32847b;
                        mz mzVar2 = yyVar2.D;
                        xy xyVar2 = yyVar2.f33689r;
                        if (tw0Var == null) {
                            yyVar2.d(false);
                            xyVar2.E1(null);
                            mzVar2.f29302l0.d.setText("");
                            mzVar2.f29284f0.h1(0, 0);
                            return;
                        } else if (xyVar2.getSelectedCategory() == tw0Var) {
                            yyVar2.c(null, false);
                            xyVar2.E1(null);
                            return;
                        } else {
                            yyVar2.c(tw0Var.f31422a, false);
                            xyVar2.E1(tw0Var);
                            return;
                        }
                }
            }
        });
        xyVar.setOnTouchListener(new m.c2(this, 2));
        xyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final yy f32847b;

            {
                this.f32847b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yy yyVar = this.f32847b;
                        yyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        yyVar.d(z10);
                        yyVar.g(false);
                        return;
                    default:
                        tw0 tw0Var = (tw0) obj;
                        yy yyVar2 = this.f32847b;
                        mz mzVar2 = yyVar2.D;
                        xy xyVar2 = yyVar2.f33689r;
                        if (tw0Var == null) {
                            yyVar2.d(false);
                            xyVar2.E1(null);
                            mzVar2.f29302l0.d.setText("");
                            mzVar2.f29284f0.h1(0, 0);
                            return;
                        } else if (xyVar2.getSelectedCategory() == tw0Var) {
                            yyVar2.c(null, false);
                            xyVar2.E1(null);
                            return;
                        } else {
                            yyVar2.c(tw0Var.f31422a, false);
                            xyVar2.E1(tw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(xyVar, k7.c6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(yy yyVar, boolean z4, boolean z10) {
        yyVar.f33683a.a(z4, z10);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f33686e;
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
        mz mzVar = this.D;
        int i10 = this.f33684b;
        if (i10 == 0) {
            hz hzVar = mzVar.f29337w0;
            fz fzVar = hzVar.L;
            mz mzVar2 = hzVar.N;
            uw uwVar = mzVar2.D0;
            rw rwVar = mzVar2.A0;
            if (hzVar.I != 0) {
                ConnectionsManager.getInstance(mzVar2.Z0).cancelRequest(hzVar.I, true);
                hzVar.I = 0;
            }
            if (TextUtils.isEmpty(str)) {
                hzVar.K = null;
                hzVar.B.clear();
                hzVar.E.clear();
                hzVar.H = new ArrayList();
                f2.p0 adapter = rwVar.getAdapter();
                dz dzVar = mzVar2.f29333v0;
                if (adapter != dzVar) {
                    rwVar.setAdapter(dzVar);
                }
                hzVar.d = 0L;
                mzVar2.f29265a.a(false, true);
                hzVar.l();
                uwVar.e(false);
            } else {
                hzVar.K = str.toLowerCase();
                uwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            AndroidUtilities.runOnUIThread(fzVar, 300L);
        } else if (i10 == 1) {
            mzVar.P.F(str, z4);
        } else if (i10 == 2) {
            mzVar.f29287g0.G(str, z4);
        }
    }

    public final void d(boolean z4) {
        float f10;
        if (z4 == this.f33692x) {
            return;
        }
        this.f33692x = z4;
        ValueAnimator valueAnimator = this.f33693y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f33691w;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f33693y = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 22));
        this.f33693y.setDuration(120L);
        this.f33693y.setInterpolator(pr.h);
        this.f33693y.start();
    }

    public final void e(boolean z4) {
        this.C = z4;
        if (z4) {
            this.f33685c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z4) {
        if (z4) {
            if (this.B == null) {
                xp xpVar = new xp(this, 15);
                this.B = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 340L);
                return;
            }
            return;
        }
        xp xpVar2 = this.B;
        if (xpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xpVar2);
            this.B = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z4) {
        int i10;
        boolean z10 = this.C;
        iq iqVar = this.d;
        xy xyVar = this.f33689r;
        if (z10 && ((iqVar.length() != 0 || (xyVar != null && xyVar.getSelectedCategory() != null)) && !z4)) {
            return;
        }
        if (iqVar.length() <= 0 && (xyVar == null || xyVar.f33202l3 <= 0.5f || (!xyVar.f33197g3 && xyVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f33685c.b(i10);
        this.C = false;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
