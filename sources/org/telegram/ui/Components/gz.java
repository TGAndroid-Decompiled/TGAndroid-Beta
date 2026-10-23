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
public abstract class gz extends FrameLayout implements org.telegram.ui.ActionBar.b6, ne.d {
    public zp E;
    public boolean F;
    public final tz G;
    public final ne.b f26740a;
    public final int f26741b;
    public final zn0 f26742c;
    public final sq d;
    public final View e;
    public final View f26743f;
    public final ImageView h;
    public final FrameLayout f26744n;
    public final fz f26745r;
    public final ah.v f26746s;
    public final View v;
    public float f26747w;
    public boolean f26748x;
    public ValueAnimator f26749y;

    public gz(tz tzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        sq sqVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        int i12;
        this.G = tzVar;
        this.f26740a = new ne.b(0, this, bs.f25134g, 200L, false);
        this.f26748x = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21816a;
        this.f26741b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.k6.Ke;
        org.telegram.ui.ActionBar.g6 g6Var = tzVar.Z1;
        boolean z10 = tzVar.f30986i2;
        org.telegram.ui.ActionBar.r6.i(i13, view, g6Var);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f26743f = view2;
        if (tzVar.f31021u0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.He, view2, g6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tzVar.f30962b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26744n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = tzVar.w(0.06f);
        } else {
            A = tzVar.A(org.telegram.ui.ActionBar.k6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        ci.n1 n1Var = zf.j0.f52047a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ah.v vVar = new ah.v(this, context, 13);
        this.f26746s = vVar;
        frameLayout.addView(vVar, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        zn0 zn0Var = new zn0();
        this.f26742c = zn0Var;
        zn0Var.c(0, false, false);
        if (z10) {
            A2 = tzVar.w(0.4f);
        } else {
            A2 = tzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        zn0Var.a(A2);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(zn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gz f25754b;

            {
                this.f25754b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        gz gzVar = this.f25754b;
                        fz fzVar = gzVar.f26745r;
                        sq sqVar2 = gzVar.d;
                        if (gzVar.f26742c.f33293k == 1) {
                            sqVar2.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.J1();
                                fzVar.L1(null);
                                fzVar.M1(true, true);
                            }
                            gzVar.f(false);
                            sqVar2.clearAnimation();
                            sqVar2.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gz gzVar2 = this.f25754b;
                        sq sqVar3 = gzVar2.d;
                        sqVar3.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.f26745r;
                        if (fzVar2 != null) {
                            fzVar2.J1();
                            fzVar2.L1(null);
                            fzVar2.M1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar3.clearAnimation();
                        sqVar3.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        sq sqVar2 = new sq(this, context, i10, 2);
        this.d = sqVar2;
        sqVar2.setTextSize(1, 16.0f);
        if (z10) {
            A3 = tzVar.w(0.45f);
        } else {
            A3 = tzVar.A(org.telegram.ui.ActionBar.k6.Je);
        }
        sqVar2.setHintTextColor(A3);
        if (z10) {
            A4 = tzVar.w(0.8f);
        } else {
            A4 = tzVar.A(org.telegram.ui.ActionBar.k6.G6);
        }
        sqVar2.setTextColor(A4);
        sqVar2.setBackgroundDrawable(null);
        sqVar2.setPadding(0, 0, 0, 0);
        sqVar2.setMaxLines(1);
        sqVar2.setLines(1);
        sqVar2.setSingleLine(true);
        sqVar2.setImeOptions(268435459);
        sqVar2.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.r6.m(sqVar2, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        sqVar2.setCursorSize(AndroidUtilities.dp(20.0f));
        sqVar2.setCursorWidth(1.5f);
        sqVar2.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(sqVar2, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        sqVar2.addTextChangedListener(new ai.u(this, 9));
        if (tzVar.f31021u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie);
            sqVar = sqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, mutate, q6.f21710a, q6.f21711b, 4, 0.0f, g6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            sqVar = sqVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ei.f2(this));
        int i14 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final gz f25754b;

            {
                this.f25754b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        gz gzVar = this.f25754b;
                        fz fzVar = gzVar.f26745r;
                        sq sqVar22 = gzVar.d;
                        if (gzVar.f26742c.f33293k == 1) {
                            sqVar22.setText("");
                            gzVar.c(null, false);
                            if (fzVar != null) {
                                fzVar.J1();
                                fzVar.L1(null);
                                fzVar.M1(true, true);
                            }
                            gzVar.f(false);
                            sqVar22.clearAnimation();
                            sqVar22.animate().translationX(0.0f).setInterpolator(bs.h).start();
                            gzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gz gzVar2 = this.f25754b;
                        sq sqVar3 = gzVar2.d;
                        sqVar3.setText("");
                        gzVar2.c(null, false);
                        fz fzVar2 = gzVar2.f26745r;
                        if (fzVar2 != null) {
                            fzVar2.J1();
                            fzVar2.L1(null);
                            fzVar2.M1(true, true);
                        }
                        gzVar2.f(false);
                        sqVar3.clearAnimation();
                        sqVar3.animate().translationX(0.0f).setInterpolator(bs.h).start();
                        gzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 == 1 && (!tzVar.f30967c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        fz fzVar = new fz(this, context, i12, tzVar.Z1, i10);
        this.f26745r = fzVar;
        fzVar.f31254x3 = z10;
        TextPaint paint = sqVar.getPaint();
        fzVar.setDontOccupyWidth(AndroidUtilities.dp(f7) + ((int) paint.measureText(((Object) sqVar.getHint()) + "")));
        if (tzVar.f31021u0) {
            org.telegram.ui.ActionBar.r6.j(fzVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.He, org.telegram.ui.ActionBar.k6.Ie), g6Var);
        }
        fzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final gz f26101b;

            {
                this.f26101b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gz gzVar = this.f26101b;
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
                        qx0 qx0Var = (qx0) obj;
                        gz gzVar2 = this.f26101b;
                        tz tzVar2 = gzVar2.G;
                        fz fzVar2 = gzVar2.f26745r;
                        if (qx0Var == null) {
                            gzVar2.d(false);
                            fzVar2.L1(null);
                            tzVar2.f31001o0.d.setText("");
                            tzVar2.f30984i0.h1(0, 0);
                            return;
                        } else if (fzVar2.getSelectedCategory() == qx0Var) {
                            gzVar2.c(null, false);
                            fzVar2.L1(null);
                            return;
                        } else {
                            gzVar2.c(qx0Var.f30024a, false);
                            fzVar2.L1(qx0Var);
                            return;
                        }
                }
            }
        });
        fzVar.setOnTouchListener(new m.d2(this, 2));
        fzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final gz f26101b;

            {
                this.f26101b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gz gzVar = this.f26101b;
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
                        qx0 qx0Var = (qx0) obj;
                        gz gzVar2 = this.f26101b;
                        tz tzVar2 = gzVar2.G;
                        fz fzVar2 = gzVar2.f26745r;
                        if (qx0Var == null) {
                            gzVar2.d(false);
                            fzVar2.L1(null);
                            tzVar2.f31001o0.d.setText("");
                            tzVar2.f30984i0.h1(0, 0);
                            return;
                        } else if (fzVar2.getSelectedCategory() == qx0Var) {
                            gzVar2.c(null, false);
                            fzVar2.L1(null);
                            return;
                        } else {
                            gzVar2.c(qx0Var.f30024a, false);
                            fzVar2.L1(qx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(fzVar, w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(gz gzVar, boolean z10, boolean z11) {
        gzVar.f26740a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        tz tzVar = this.G;
        int i10 = this.f26741b;
        if (i10 == 0) {
            oz ozVar = tzVar.f31039z0;
            mz mzVar = ozVar.O;
            tz tzVar2 = ozVar.Q;
            dx dxVar = tzVar2.G0;
            ax axVar = tzVar2.D0;
            if (ozVar.L != 0) {
                ConnectionsManager.getInstance(tzVar2.f30966c1).cancelRequest(ozVar.L, true);
                ozVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                ozVar.N = null;
                ozVar.E.clear();
                ozVar.H.clear();
                ozVar.K = new ArrayList();
                s4.g0 adapter = axVar.getAdapter();
                kz kzVar = tzVar2.f31036y0;
                if (adapter != kzVar) {
                    axVar.setAdapter(kzVar);
                }
                ozVar.d = 0L;
                tzVar2.f30957a.a(false, true);
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
            tzVar.f30987j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f26748x) {
            return;
        }
        this.f26748x = z10;
        ValueAnimator valueAnimator = this.f26749y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f26747w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f26749y = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 23));
        this.f26749y.setDuration(120L);
        this.f26749y.setInterpolator(bs.h);
        this.f26749y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f26742c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                zp zpVar = new zp(this, 16);
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
        sq sqVar = this.d;
        fz fzVar = this.f26745r;
        if (z11 && ((sqVar.length() != 0 || (fzVar != null && fzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (sqVar.length() <= 0 && (fzVar == null || fzVar.f31246p3 <= 0.5f || (!fzVar.f31241k3 && fzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f26742c.b(i10);
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
