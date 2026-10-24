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
public abstract class ez extends FrameLayout implements org.telegram.ui.ActionBar.b6, ne.d {
    public xp E;
    public boolean F;
    public final rz G;
    public final ne.b f26142a;
    public final int f26143b;
    public final yn0 f26144c;
    public final qq d;
    public final View e;
    public final View f26145f;
    public final ImageView h;
    public final FrameLayout f26146n;
    public final dz f26147r;
    public final ah.v f26148s;
    public final View v;
    public float f26149w;
    public boolean f26150x;
    public ValueAnimator f26151y;

    public ez(rz rzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        qq qqVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        int i12;
        this.G = rzVar;
        this.f26142a = new ne.b(0, this, zr.f33338g, 200L, false);
        this.f26150x = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21817a;
        this.f26143b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.k6.Ke;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        boolean z10 = rzVar.f30330i2;
        org.telegram.ui.ActionBar.r6.i(i13, view, g6Var);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f26145f = view2;
        if (rzVar.f30365u0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.He, view2, g6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, rzVar.f30306b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26146n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = rzVar.w(0.06f);
        } else {
            A = rzVar.A(org.telegram.ui.ActionBar.k6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f52046a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.v vVar = new ah.v(this, context, 13);
        this.f26148s = vVar;
        frameLayout.addView(vVar, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        yn0 yn0Var = new yn0();
        this.f26144c = yn0Var;
        yn0Var.c(0, false, false);
        if (z10) {
            A2 = rzVar.w(0.4f);
        } else {
            A2 = rzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        yn0Var.a(A2);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(yn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ez f25115b;

            {
                this.f25115b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ez ezVar = this.f25115b;
                        dz dzVar = ezVar.f26147r;
                        qq qqVar2 = ezVar.d;
                        if (ezVar.f26144c.f33003k == 1) {
                            qqVar2.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.J1();
                                dzVar.L1(null);
                                dzVar.M1(true, true);
                            }
                            ezVar.f(false);
                            qqVar2.clearAnimation();
                            qqVar2.animate().translationX(0.0f).setInterpolator(zr.h).start();
                            ezVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ez ezVar2 = this.f25115b;
                        qq qqVar3 = ezVar2.d;
                        qqVar3.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.f26147r;
                        if (dzVar2 != null) {
                            dzVar2.J1();
                            dzVar2.L1(null);
                            dzVar2.M1(true, true);
                        }
                        ezVar2.f(false);
                        qqVar3.clearAnimation();
                        qqVar3.animate().translationX(0.0f).setInterpolator(zr.h).start();
                        ezVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        qq qqVar2 = new qq(this, context, i10, 2);
        this.d = qqVar2;
        qqVar2.setTextSize(1, 16.0f);
        if (z10) {
            A3 = rzVar.w(0.45f);
        } else {
            A3 = rzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        qqVar2.setHintTextColor(A3);
        if (z10) {
            A4 = rzVar.w(0.8f);
        } else {
            A4 = rzVar.A(org.telegram.ui.ActionBar.k6.G6);
        }
        qqVar2.setTextColor(A4);
        qqVar2.setBackgroundDrawable(null);
        qqVar2.setPadding(0, 0, 0, 0);
        qqVar2.setMaxLines(1);
        qqVar2.setLines(1);
        qqVar2.setSingleLine(true);
        qqVar2.setImeOptions(268435459);
        qqVar2.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.r6.m(qqVar2, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        qqVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        qqVar2.setCursorWidth(1.5f);
        qqVar2.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(qqVar2, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        qqVar2.addTextChangedListener(new ai.u(this, 9));
        if (rzVar.f30365u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie);
            qqVar = qqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, mutate, q6.f21711a, q6.f21712b, 4, 0.0f, g6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            qqVar = qqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(this));
        int i14 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ez f25115b;

            {
                this.f25115b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        ez ezVar = this.f25115b;
                        dz dzVar = ezVar.f26147r;
                        qq qqVar22 = ezVar.d;
                        if (ezVar.f26144c.f33003k == 1) {
                            qqVar22.setText("");
                            ezVar.c(null, false);
                            if (dzVar != null) {
                                dzVar.J1();
                                dzVar.L1(null);
                                dzVar.M1(true, true);
                            }
                            ezVar.f(false);
                            qqVar22.clearAnimation();
                            qqVar22.animate().translationX(0.0f).setInterpolator(zr.h).start();
                            ezVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ez ezVar2 = this.f25115b;
                        qq qqVar3 = ezVar2.d;
                        qqVar3.setText("");
                        ezVar2.c(null, false);
                        dz dzVar2 = ezVar2.f26147r;
                        if (dzVar2 != null) {
                            dzVar2.J1();
                            dzVar2.L1(null);
                            dzVar2.M1(true, true);
                        }
                        ezVar2.f(false);
                        qqVar3.clearAnimation();
                        qqVar3.animate().translationX(0.0f).setInterpolator(zr.h).start();
                        ezVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 == 1 && (!rzVar.f30311c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        dz dzVar = new dz(this, context, i12, rzVar.Z1, i10);
        this.f26147r = dzVar;
        dzVar.f30934x3 = z10;
        TextPaint paint = qqVar.getPaint();
        dzVar.setDontOccupyWidth(AndroidUtilities.dp(f7) + ((int) paint.measureText(((Object) qqVar.getHint()) + "")));
        if (rzVar.f30365u0) {
            org.telegram.ui.ActionBar.r6.j(dzVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie), g6Var);
        }
        dzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final ez f25491b;

            {
                this.f25491b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ez ezVar = this.f25491b;
                        ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ezVar.d(z11);
                        ezVar.g(false);
                        return;
                    default:
                        px0 px0Var = (px0) obj;
                        ez ezVar2 = this.f25491b;
                        rz rzVar2 = ezVar2.G;
                        dz dzVar2 = ezVar2.f26147r;
                        if (px0Var == null) {
                            ezVar2.d(false);
                            dzVar2.L1(null);
                            rzVar2.f30345o0.d.setText("");
                            rzVar2.f30328i0.h1(0, 0);
                            return;
                        } else if (dzVar2.getSelectedCategory() == px0Var) {
                            ezVar2.c(null, false);
                            dzVar2.L1(null);
                            return;
                        } else {
                            ezVar2.c(px0Var.f29685a, false);
                            dzVar2.L1(px0Var);
                            return;
                        }
                }
            }
        });
        dzVar.setOnTouchListener(new m.d2(this, 2));
        dzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final ez f25491b;

            {
                this.f25491b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ez ezVar = this.f25491b;
                        ezVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ezVar.d(z11);
                        ezVar.g(false);
                        return;
                    default:
                        px0 px0Var = (px0) obj;
                        ez ezVar2 = this.f25491b;
                        rz rzVar2 = ezVar2.G;
                        dz dzVar2 = ezVar2.f26147r;
                        if (px0Var == null) {
                            ezVar2.d(false);
                            dzVar2.L1(null);
                            rzVar2.f30345o0.d.setText("");
                            rzVar2.f30328i0.h1(0, 0);
                            return;
                        } else if (dzVar2.getSelectedCategory() == px0Var) {
                            ezVar2.c(null, false);
                            dzVar2.L1(null);
                            return;
                        } else {
                            ezVar2.c(px0Var.f29685a, false);
                            dzVar2.L1(px0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(dzVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(ez ezVar, boolean z10, boolean z11) {
        ezVar.f26142a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        rz rzVar = this.G;
        int i10 = this.f26143b;
        if (i10 == 0) {
            mz mzVar = rzVar.f30383z0;
            kz kzVar = mzVar.O;
            rz rzVar2 = mzVar.Q;
            bx bxVar = rzVar2.G0;
            yw ywVar = rzVar2.D0;
            if (mzVar.L != 0) {
                ConnectionsManager.getInstance(rzVar2.f30310c1).cancelRequest(mzVar.L, true);
                mzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                mzVar.N = null;
                mzVar.E.clear();
                mzVar.H.clear();
                mzVar.K = new ArrayList();
                s4.g0 adapter = ywVar.getAdapter();
                iz izVar = rzVar2.f30380y0;
                if (adapter != izVar) {
                    ywVar.setAdapter(izVar);
                }
                mzVar.d = 0L;
                rzVar2.f30301a.a(false, true);
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
            rzVar.f30331j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f26150x) {
            return;
        }
        this.f26150x = z10;
        ValueAnimator valueAnimator = this.f26151y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f26149w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f26151y = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 23));
        this.f26151y.setDuration(120L);
        this.f26151y.setInterpolator(zr.h);
        this.f26151y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f26144c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                xp xpVar = new xp(this, 16);
                this.E = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 340L);
                return;
            }
            return;
        }
        xp xpVar2 = this.E;
        if (xpVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(xpVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        qq qqVar = this.d;
        dz dzVar = this.f26147r;
        if (z11 && ((qqVar.length() != 0 || (dzVar != null && dzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (qqVar.length() <= 0 && (dzVar == null || dzVar.f30926p3 <= 0.5f || (!dzVar.f30921k3 && dzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f26144c.b(i10);
        this.F = false;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
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
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.k6.Mh));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
