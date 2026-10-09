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
public abstract class mz extends FrameLayout implements me.d {
    public nq E;
    public boolean F;
    public final a00 G;
    public final me.b f28972a;
    public final int f28973b;
    public final do0 f28974c;
    public final yq d;
    public final View f28975e;
    public final View f28976f;
    public final ImageView h;
    public final FrameLayout f28977n;
    public final lz f28978r;
    public final ci.m6 f28979s;
    public final View v;
    public float f28980w;
    public boolean f28981x;
    public ValueAnimator f28982y;

    public mz(a00 a00Var, Context context, int i10) {
        super(context);
        int B;
        int B2;
        int B3;
        int B4;
        int i11;
        int i12;
        this.G = a00Var;
        this.f28972a = new me.b(0, this, hs.f27119g, 200L, false);
        this.f28981x = false;
        this.f28973b = i10;
        View view = new View(context);
        this.f28975e = view;
        view.setVisibility(4);
        int B5 = a00Var.B(org.telegram.ui.ActionBar.i6.Ke);
        boolean z10 = a00Var.f24422i2;
        view.setBackgroundColor(B5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f28976f = view2;
        if (a00Var.f24457u0) {
            view2.setBackgroundColor(a00Var.B(org.telegram.ui.ActionBar.i6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, a00Var.f24397b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28977n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            B = a00Var.w(0.06f);
        } else {
            B = a00Var.B(org.telegram.ui.ActionBar.i6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, B));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52171a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f28979s = m6Var;
        frameLayout.addView(m6Var, w7.x5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        do0 do0Var = new do0();
        this.f28974c = do0Var;
        do0Var.c(0, false, false);
        if (z10) {
            B2 = a00Var.w(0.4f);
        } else {
            B2 = a00Var.B(org.telegram.ui.ActionBar.i6.Je);
        }
        do0Var.a(B2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(do0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final mz f27806b;

            {
                this.f27806b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        mz mzVar = this.f27806b;
                        lz lzVar = mzVar.f28978r;
                        yq yqVar = mzVar.d;
                        if (mzVar.f28974c.f25757k == 1) {
                            yqVar.setText("");
                            mzVar.c(null, false);
                            if (lzVar != null) {
                                lzVar.E1();
                                lzVar.G1(null);
                                lzVar.H1(true, true);
                            }
                            mzVar.f(false);
                            yqVar.clearAnimation();
                            yqVar.animate().translationX(0.0f).setInterpolator(hs.h).start();
                            mzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        mz mzVar2 = this.f27806b;
                        yq yqVar2 = mzVar2.d;
                        yqVar2.setText("");
                        mzVar2.c(null, false);
                        lz lzVar2 = mzVar2.f28978r;
                        if (lzVar2 != null) {
                            lzVar2.E1();
                            lzVar2.G1(null);
                            lzVar2.H1(true, true);
                        }
                        mzVar2.f(false);
                        yqVar2.clearAnimation();
                        yqVar2.animate().translationX(0.0f).setInterpolator(hs.h).start();
                        mzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        yq yqVar = new yq(this, context, i10, 2);
        this.d = yqVar;
        yqVar.setTextSize(1, 16.0f);
        if (z10) {
            B3 = a00Var.w(0.45f);
        } else {
            B3 = a00Var.B(org.telegram.ui.ActionBar.i6.Je);
        }
        yqVar.setHintTextColor(B3);
        if (z10) {
            B4 = a00Var.w(0.8f);
        } else {
            B4 = a00Var.B(org.telegram.ui.ActionBar.i6.G6);
        }
        yqVar.setTextColor(B4);
        yqVar.setBackgroundDrawable(null);
        yqVar.setPadding(0, 0, 0, 0);
        yqVar.setMaxLines(1);
        yqVar.setLines(1);
        yqVar.setSingleLine(true);
        yqVar.setImeOptions(268435459);
        yqVar.setHint(LocaleController.getString(R.string.Search));
        yqVar.setCursorColor(a00Var.B(org.telegram.ui.ActionBar.i6.Mh));
        yqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        yqVar.setCursorWidth(1.5f);
        yqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(yqVar, w7.x5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        yqVar.addTextChangedListener(new ci.h2(this, 8));
        if (a00Var.f24457u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v(a00Var.B(org.telegram.ui.ActionBar.i6.He), a00Var.B(org.telegram.ui.ActionBar.i6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            m6Var.addView(view3, w7.x5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, a00Var.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final mz f27806b;

            {
                this.f27806b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        mz mzVar = this.f27806b;
                        lz lzVar = mzVar.f28978r;
                        yq yqVar2 = mzVar.d;
                        if (mzVar.f28974c.f25757k == 1) {
                            yqVar2.setText("");
                            mzVar.c(null, false);
                            if (lzVar != null) {
                                lzVar.E1();
                                lzVar.G1(null);
                                lzVar.H1(true, true);
                            }
                            mzVar.f(false);
                            yqVar2.clearAnimation();
                            yqVar2.animate().translationX(0.0f).setInterpolator(hs.h).start();
                            mzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        mz mzVar2 = this.f27806b;
                        yq yqVar22 = mzVar2.d;
                        yqVar22.setText("");
                        mzVar2.c(null, false);
                        lz lzVar2 = mzVar2.f28978r;
                        if (lzVar2 != null) {
                            lzVar2.E1();
                            lzVar2.G1(null);
                            lzVar2.H1(true, true);
                        }
                        mzVar2.f(false);
                        yqVar22.clearAnimation();
                        yqVar22.animate().translationX(0.0f).setInterpolator(hs.h).start();
                        mzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 == 1 && (!a00Var.f24402c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        lz lzVar = new lz(this, context, i12, a00Var.Z1, i10);
        this.f28978r = lzVar;
        lzVar.f33402u3 = z10;
        TextPaint paint = yqVar.getPaint();
        lzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) yqVar.getHint()) + "")));
        if (a00Var.f24457u0) {
            lzVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v(a00Var.B(org.telegram.ui.ActionBar.i6.He), a00Var.B(org.telegram.ui.ActionBar.i6.Ie)));
        }
        lzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final mz f28183b;

            {
                this.f28183b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        mz mzVar = this.f28183b;
                        mzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        mzVar.d(z11);
                        mzVar.g(false);
                        return;
                    default:
                        ux0 ux0Var = (ux0) obj;
                        mz mzVar2 = this.f28183b;
                        a00 a00Var2 = mzVar2.G;
                        lz lzVar2 = mzVar2.f28978r;
                        if (ux0Var == null) {
                            mzVar2.d(false);
                            lzVar2.G1(null);
                            a00Var2.f24437o0.d.setText("");
                            a00Var2.f24420i0.h1(0, 0);
                            return;
                        } else if (lzVar2.getSelectedCategory() == ux0Var) {
                            mzVar2.c(null, false);
                            lzVar2.G1(null);
                            return;
                        } else {
                            mzVar2.c(ux0Var.f31634a, false);
                            lzVar2.G1(ux0Var);
                            return;
                        }
                }
            }
        });
        lzVar.setOnTouchListener(new m.c2(this, 2));
        lzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final mz f28183b;

            {
                this.f28183b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        mz mzVar = this.f28183b;
                        mzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        mzVar.d(z11);
                        mzVar.g(false);
                        return;
                    default:
                        ux0 ux0Var = (ux0) obj;
                        mz mzVar2 = this.f28183b;
                        a00 a00Var2 = mzVar2.G;
                        lz lzVar2 = mzVar2.f28978r;
                        if (ux0Var == null) {
                            mzVar2.d(false);
                            lzVar2.G1(null);
                            a00Var2.f24437o0.d.setText("");
                            a00Var2.f24420i0.h1(0, 0);
                            return;
                        } else if (lzVar2.getSelectedCategory() == ux0Var) {
                            mzVar2.c(null, false);
                            lzVar2.G1(null);
                            return;
                        } else {
                            mzVar2.c(ux0Var.f31634a, false);
                            lzVar2.G1(ux0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(lzVar, w7.x5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public static void a(mz mzVar, boolean z10, boolean z11) {
        mzVar.f28972a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        a00 a00Var = this.G;
        int i10 = this.f28973b;
        if (i10 == 0) {
            vz vzVar = a00Var.f24475z0;
            tz tzVar = vzVar.O;
            a00 a00Var2 = vzVar.Q;
            lx lxVar = a00Var2.G0;
            ix ixVar = a00Var2.D0;
            if (vzVar.L != 0) {
                ConnectionsManager.getInstance(a00Var2.f24401c1).cancelRequest(vzVar.L, true);
                vzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                vzVar.N = null;
                vzVar.E.clear();
                vzVar.H.clear();
                vzVar.K = new ArrayList();
                s4.i0 adapter = ixVar.getAdapter();
                qz qzVar = a00Var2.f24472y0;
                if (adapter != qzVar) {
                    ixVar.setAdapter(qzVar);
                }
                vzVar.d = 0L;
                a00Var2.f24392a.a(false, true);
                vzVar.l();
                lxVar.e(false);
            } else {
                vzVar.N = str.toLowerCase();
                lxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(tzVar);
            AndroidUtilities.runOnUIThread(tzVar, 300L);
        } else if (i10 == 1) {
            a00Var.S.F(str, z10);
        } else if (i10 == 2) {
            a00Var.f24423j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f28981x) {
            return;
        }
        this.f28981x = z10;
        ValueAnimator valueAnimator = this.f28982y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28980w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f28982y = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 23));
        this.f28982y.setDuration(120L);
        this.f28982y.setInterpolator(hs.h);
        this.f28982y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f28974c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                nq nqVar = new nq(this, 15);
                this.E = nqVar;
                AndroidUtilities.runOnUIThread(nqVar, 340L);
                return;
            }
            return;
        }
        nq nqVar2 = this.E;
        if (nqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        yq yqVar = this.d;
        lz lzVar = this.f28978r;
        if (z11 && ((yqVar.length() != 0 || (lzVar != null && lzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (yqVar.length() <= 0 && (lzVar == null || lzVar.f33394m3 <= 0.5f || (!lzVar.f33390h3 && lzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f28974c.b(i10);
        this.F = false;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f28975e;
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
    public final void A(float f7, int i10) {
    }
}
