package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class fz extends FrameLayout implements org.telegram.ui.ActionBar.p6, oe.d {
    public bq E;
    public boolean F;
    public final sz G;
    public final oe.b f28336a;
    public final int f28337b;
    public final eo0 f28338c;
    public final uq d;
    public final View e;
    public final View f28339f;
    public final ImageView h;
    public final FrameLayout f28340n;
    public final ez f28341r;
    public final bh.p f28342s;
    public final View v;
    public float f28343w;
    public boolean f28344x;
    public ValueAnimator f28345y;

    public fz(sz szVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        uq uqVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        int i12;
        this.G = szVar;
        this.f28336a = new oe.b(0, this, ds.f27587g, 200L, false);
        this.f28344x = false;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22627a;
        this.f28337b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.y6.Ke;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        boolean z10 = szVar.f32739i2;
        org.telegram.ui.ActionBar.f7.i(i13, view, u6Var);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f28339f = view2;
        if (szVar.f32774u0) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.He, view2, u6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, szVar.f32715b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28340n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = szVar.v(0.06f);
        } else {
            A = szVar.A(org.telegram.ui.ActionBar.y6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        ag.v0 v0Var = ag.z0.f1400a;
        frameLayout.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, gb1.h(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, gb1.h(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bh.p pVar = new bh.p(this, context, 12);
        this.f28342s = pVar;
        frameLayout.addView(pVar, gb1.h(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        eo0 eo0Var = new eo0();
        this.f28338c = eo0Var;
        eo0Var.c(0, false, false);
        if (z10) {
            A2 = szVar.v(0.4f);
        } else {
            A2 = szVar.A(org.telegram.ui.ActionBar.y6.Je);
        }
        eo0Var.a(A2);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(eo0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final fz f27286b;

            {
                this.f27286b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        fz fzVar = this.f27286b;
                        ez ezVar = fzVar.f28341r;
                        uq uqVar2 = fzVar.d;
                        if (fzVar.f28338c.f27918k == 1) {
                            uqVar2.setText("");
                            fzVar.c(null, false);
                            if (ezVar != null) {
                                ezVar.J1();
                                ezVar.L1(null);
                                ezVar.M1(true, true);
                            }
                            fzVar.f(false);
                            uqVar2.clearAnimation();
                            uqVar2.animate().translationX(0.0f).setInterpolator(ds.h).start();
                            fzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        fz fzVar2 = this.f27286b;
                        uq uqVar3 = fzVar2.d;
                        uqVar3.setText("");
                        fzVar2.c(null, false);
                        ez ezVar2 = fzVar2.f28341r;
                        if (ezVar2 != null) {
                            ezVar2.J1();
                            ezVar2.L1(null);
                            ezVar2.M1(true, true);
                        }
                        fzVar2.f(false);
                        uqVar3.clearAnimation();
                        uqVar3.animate().translationX(0.0f).setInterpolator(ds.h).start();
                        fzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, gb1.i(36, 36, 51));
        uq uqVar2 = new uq(this, context, i10, 2);
        this.d = uqVar2;
        uqVar2.setTextSize(1, 16.0f);
        if (z10) {
            A3 = szVar.v(0.45f);
        } else {
            A3 = szVar.A(org.telegram.ui.ActionBar.y6.Je);
        }
        uqVar2.setHintTextColor(A3);
        if (z10) {
            A4 = szVar.v(0.8f);
        } else {
            A4 = szVar.A(org.telegram.ui.ActionBar.y6.G6);
        }
        uqVar2.setTextColor(A4);
        uqVar2.setBackgroundDrawable(null);
        uqVar2.setPadding(0, 0, 0, 0);
        uqVar2.setMaxLines(1);
        uqVar2.setLines(1);
        uqVar2.setSingleLine(true);
        uqVar2.setImeOptions(268435459);
        uqVar2.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.f7.m(uqVar2, 30, org.telegram.ui.ActionBar.y6.Mh, u6Var);
        uqVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        uqVar2.setCursorWidth(1.5f);
        uqVar2.setTranslationY(AndroidUtilities.dp(-2.0f));
        pVar.addView(uqVar2, gb1.h(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        uqVar2.addTextChangedListener(new bi.u(this, 9));
        if (szVar.f32774u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(org.telegram.ui.ActionBar.y6.He, org.telegram.ui.ActionBar.y6.Ie);
            uqVar = uqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.f7.l(this, mutate, q5.f22485a, q5.f22486b, 4, 0.0f, u6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            pVar.addView(view3, gb1.i(18, -1, 3));
        } else {
            uqVar = uqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.d2(this));
        int i14 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final fz f27286b;

            {
                this.f27286b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        fz fzVar = this.f27286b;
                        ez ezVar = fzVar.f28341r;
                        uq uqVar22 = fzVar.d;
                        if (fzVar.f28338c.f27918k == 1) {
                            uqVar22.setText("");
                            fzVar.c(null, false);
                            if (ezVar != null) {
                                ezVar.J1();
                                ezVar.L1(null);
                                ezVar.M1(true, true);
                            }
                            fzVar.f(false);
                            uqVar22.clearAnimation();
                            uqVar22.animate().translationX(0.0f).setInterpolator(ds.h).start();
                            fzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        fz fzVar2 = this.f27286b;
                        uq uqVar3 = fzVar2.d;
                        uqVar3.setText("");
                        fzVar2.c(null, false);
                        ez ezVar2 = fzVar2.f28341r;
                        if (ezVar2 != null) {
                            ezVar2.J1();
                            ezVar2.L1(null);
                            ezVar2.M1(true, true);
                        }
                        fzVar2.f(false);
                        uqVar3.clearAnimation();
                        uqVar3.animate().translationX(0.0f).setInterpolator(ds.h).start();
                        fzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, gb1.i(36, 36, 53));
        if (i10 == 1 && (!szVar.f32720c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        ez ezVar = new ez(this, context, i12, szVar.Z1, i10);
        this.f28341r = ezVar;
        ezVar.E3 = z10;
        TextPaint paint = uqVar.getPaint();
        ezVar.setDontOccupyWidth(AndroidUtilities.dp(f7) + ((int) paint.measureText(((Object) uqVar.getHint()) + "")));
        if (szVar.f32774u0) {
            org.telegram.ui.ActionBar.f7.j(ezVar, org.telegram.ui.ActionBar.f7.q(org.telegram.ui.ActionBar.y6.He, org.telegram.ui.ActionBar.y6.Ie), u6Var);
        }
        ezVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final fz f27638b;

            {
                this.f27638b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        fz fzVar = this.f27638b;
                        fzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fzVar.d(z11);
                        fzVar.g(false);
                        return;
                    default:
                        xx0 xx0Var = (xx0) obj;
                        fz fzVar2 = this.f27638b;
                        sz szVar2 = fzVar2.G;
                        ez ezVar2 = fzVar2.f28341r;
                        if (xx0Var == null) {
                            fzVar2.d(false);
                            ezVar2.L1(null);
                            szVar2.f32754o0.d.setText("");
                            szVar2.f32737i0.h1(0, 0);
                            return;
                        } else if (ezVar2.getSelectedCategory() == xx0Var) {
                            fzVar2.c(null, false);
                            ezVar2.L1(null);
                            return;
                        } else {
                            fzVar2.c(xx0Var.f34845a, false);
                            ezVar2.L1(xx0Var);
                            return;
                        }
                }
            }
        });
        ezVar.setOnTouchListener(new m.c2(this, 2));
        ezVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final fz f27638b;

            {
                this.f27638b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        fz fzVar = this.f27638b;
                        fzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fzVar.d(z11);
                        fzVar.g(false);
                        return;
                    default:
                        xx0 xx0Var = (xx0) obj;
                        fz fzVar2 = this.f27638b;
                        sz szVar2 = fzVar2.G;
                        ez ezVar2 = fzVar2.f28341r;
                        if (xx0Var == null) {
                            fzVar2.d(false);
                            ezVar2.L1(null);
                            szVar2.f32754o0.d.setText("");
                            szVar2.f32737i0.h1(0, 0);
                            return;
                        } else if (ezVar2.getSelectedCategory() == xx0Var) {
                            fzVar2.c(null, false);
                            ezVar2.L1(null);
                            return;
                        } else {
                            fzVar2.c(xx0Var.f34845a, false);
                            ezVar2.L1(xx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(ezVar, gb1.h(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(fz fzVar, boolean z10, boolean z11) {
        fzVar.f28336a.a(z10, z11);
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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
        sz szVar = this.G;
        int i10 = this.f28337b;
        if (i10 == 0) {
            nz nzVar = szVar.f32792z0;
            lz lzVar = nzVar.O;
            sz szVar2 = nzVar.Q;
            cx cxVar = szVar2.G0;
            zw zwVar = szVar2.D0;
            if (nzVar.L != 0) {
                ConnectionsManager.getInstance(szVar2.f32719c1).cancelRequest(nzVar.L, true);
                nzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                nzVar.N = null;
                nzVar.E.clear();
                nzVar.H.clear();
                nzVar.K = new ArrayList();
                s4.h0 adapter = zwVar.getAdapter();
                jz jzVar = szVar2.f32789y0;
                if (adapter != jzVar) {
                    zwVar.setAdapter(jzVar);
                }
                nzVar.d = 0L;
                szVar2.f32710a.a(false, true);
                nzVar.l();
                cxVar.e(false);
            } else {
                nzVar.N = str.toLowerCase();
                cxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(lzVar);
            AndroidUtilities.runOnUIThread(lzVar, 300L);
        } else if (i10 == 1) {
            szVar.S.F(str, z10);
        } else if (i10 == 2) {
            szVar.f32740j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f28344x) {
            return;
        }
        this.f28344x = z10;
        ValueAnimator valueAnimator = this.f28345y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28343w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f28345y = ofFloat;
        ofFloat.addUpdateListener(new n6(this, 23));
        this.f28345y.setDuration(120L);
        this.f28345y.setInterpolator(ds.h);
        this.f28345y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f28338c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                bq bqVar = new bq(this, 16);
                this.E = bqVar;
                AndroidUtilities.runOnUIThread(bqVar, 340L);
                return;
            }
            return;
        }
        bq bqVar2 = this.E;
        if (bqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        uq uqVar = this.d;
        ez ezVar = this.f28341r;
        if (z11 && ((uqVar.length() != 0 || (ezVar != null && ezVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (uqVar.length() <= 0 && (ezVar == null || ezVar.f26997w3 <= 0.5f || (!ezVar.f26992r3 && ezVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f28338c.b(i10);
        this.F = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.y6.Mh));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
