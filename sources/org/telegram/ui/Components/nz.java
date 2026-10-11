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
public abstract class nz extends FrameLayout implements me.d {
    public nq E;
    public boolean F;
    public final b00 G;
    public final me.b f29179a;
    public final int f29180b;
    public final fo0 f29181c;
    public final yq d;
    public final View f29182e;
    public final View f29183f;
    public final ImageView h;
    public final FrameLayout f29184n;
    public final mz f29185r;
    public final ci.m6 f29186s;
    public final View v;
    public float f29187w;
    public boolean f29188x;
    public ValueAnimator f29189y;

    public nz(b00 b00Var, Context context, int i10) {
        super(context);
        int B;
        int B2;
        int B3;
        int B4;
        int i11;
        int i12;
        this.G = b00Var;
        this.f29179a = new me.b(0, this, is.f27452g, 200L, false);
        this.f29188x = false;
        this.f29180b = i10;
        View view = new View(context);
        this.f29182e = view;
        view.setVisibility(4);
        int B5 = b00Var.B(org.telegram.ui.ActionBar.h6.Ke);
        boolean z10 = b00Var.f24683i2;
        view.setBackgroundColor(B5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f29183f = view2;
        if (b00Var.f24718u0) {
            view2.setBackgroundColor(b00Var.B(org.telegram.ui.ActionBar.h6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, b00Var.f24658b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29184n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            B = b00Var.w(0.06f);
        } else {
            B = b00Var.B(org.telegram.ui.ActionBar.h6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, B));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52258a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.x5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ci.m6 m6Var = new ci.m6(this, context, 10);
        this.f29186s = m6Var;
        frameLayout.addView(m6Var, w7.x5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        fo0 fo0Var = new fo0();
        this.f29181c = fo0Var;
        fo0Var.c(0, false, false);
        if (z10) {
            B2 = b00Var.w(0.4f);
        } else {
            B2 = b00Var.B(org.telegram.ui.ActionBar.h6.Je);
        }
        fo0Var.a(B2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(fo0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final nz f28117b;

            {
                this.f28117b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        nz nzVar = this.f28117b;
                        mz mzVar = nzVar.f29185r;
                        yq yqVar = nzVar.d;
                        if (nzVar.f29181c.f26415k == 1) {
                            yqVar.setText("");
                            nzVar.c(null, false);
                            if (mzVar != null) {
                                mzVar.E1();
                                mzVar.G1(null);
                                mzVar.H1(true, true);
                            }
                            nzVar.f(false);
                            yqVar.clearAnimation();
                            yqVar.animate().translationX(0.0f).setInterpolator(is.h).start();
                            nzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        nz nzVar2 = this.f28117b;
                        yq yqVar2 = nzVar2.d;
                        yqVar2.setText("");
                        nzVar2.c(null, false);
                        mz mzVar2 = nzVar2.f29185r;
                        if (mzVar2 != null) {
                            mzVar2.E1();
                            mzVar2.G1(null);
                            mzVar2.H1(true, true);
                        }
                        nzVar2.f(false);
                        yqVar2.clearAnimation();
                        yqVar2.animate().translationX(0.0f).setInterpolator(is.h).start();
                        nzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        yq yqVar = new yq(this, context, i10, 2);
        this.d = yqVar;
        yqVar.setTextSize(1, 16.0f);
        if (z10) {
            B3 = b00Var.w(0.45f);
        } else {
            B3 = b00Var.B(org.telegram.ui.ActionBar.h6.Je);
        }
        yqVar.setHintTextColor(B3);
        if (z10) {
            B4 = b00Var.w(0.8f);
        } else {
            B4 = b00Var.B(org.telegram.ui.ActionBar.h6.G6);
        }
        yqVar.setTextColor(B4);
        yqVar.setBackgroundDrawable(null);
        yqVar.setPadding(0, 0, 0, 0);
        yqVar.setMaxLines(1);
        yqVar.setLines(1);
        yqVar.setSingleLine(true);
        yqVar.setImeOptions(268435459);
        yqVar.setHint(LocaleController.getString(R.string.Search));
        yqVar.setCursorColor(b00Var.B(org.telegram.ui.ActionBar.h6.Mh));
        yqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        yqVar.setCursorWidth(1.5f);
        yqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        m6Var.addView(yqVar, w7.x5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        yqVar.addTextChangedListener(new ci.h2(this, 8));
        if (b00Var.f24718u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v(b00Var.B(org.telegram.ui.ActionBar.h6.He), b00Var.B(org.telegram.ui.ActionBar.h6.Ie)), PorterDuff.Mode.MULTIPLY));
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
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, b00Var.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final nz f28117b;

            {
                this.f28117b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        nz nzVar = this.f28117b;
                        mz mzVar = nzVar.f29185r;
                        yq yqVar2 = nzVar.d;
                        if (nzVar.f29181c.f26415k == 1) {
                            yqVar2.setText("");
                            nzVar.c(null, false);
                            if (mzVar != null) {
                                mzVar.E1();
                                mzVar.G1(null);
                                mzVar.H1(true, true);
                            }
                            nzVar.f(false);
                            yqVar2.clearAnimation();
                            yqVar2.animate().translationX(0.0f).setInterpolator(is.h).start();
                            nzVar.d(false);
                            return;
                        }
                        return;
                    default:
                        nz nzVar2 = this.f28117b;
                        yq yqVar22 = nzVar2.d;
                        yqVar22.setText("");
                        nzVar2.c(null, false);
                        mz mzVar2 = nzVar2.f29185r;
                        if (mzVar2 != null) {
                            mzVar2.E1();
                            mzVar2.G1(null);
                            mzVar2.H1(true, true);
                        }
                        nzVar2.f(false);
                        yqVar22.clearAnimation();
                        yqVar22.animate().translationX(0.0f).setInterpolator(is.h).start();
                        nzVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (i10 == 1 && (!b00Var.f24663c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        mz mzVar = new mz(this, context, i12, b00Var.Z1, i10);
        this.f29185r = mzVar;
        mzVar.f24635u3 = z10;
        TextPaint paint = yqVar.getPaint();
        mzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) yqVar.getHint()) + "")));
        if (b00Var.f24718u0) {
            mzVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v(b00Var.B(org.telegram.ui.ActionBar.h6.He), b00Var.B(org.telegram.ui.ActionBar.h6.Ie)));
        }
        mzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final nz f28478b;

            {
                this.f28478b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        nz nzVar = this.f28478b;
                        nzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        nzVar.d(z11);
                        nzVar.g(false);
                        return;
                    default:
                        wx0 wx0Var = (wx0) obj;
                        nz nzVar2 = this.f28478b;
                        b00 b00Var2 = nzVar2.G;
                        mz mzVar2 = nzVar2.f29185r;
                        if (wx0Var == null) {
                            nzVar2.d(false);
                            mzVar2.G1(null);
                            b00Var2.f24698o0.d.setText("");
                            b00Var2.f24681i0.h1(0, 0);
                            return;
                        } else if (mzVar2.getSelectedCategory() == wx0Var) {
                            nzVar2.c(null, false);
                            mzVar2.G1(null);
                            return;
                        } else {
                            nzVar2.c(wx0Var.f32756a, false);
                            mzVar2.G1(wx0Var);
                            return;
                        }
                }
            }
        });
        mzVar.setOnTouchListener(new m.c2(this, 2));
        mzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final nz f28478b;

            {
                this.f28478b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        nz nzVar = this.f28478b;
                        nzVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        nzVar.d(z11);
                        nzVar.g(false);
                        return;
                    default:
                        wx0 wx0Var = (wx0) obj;
                        nz nzVar2 = this.f28478b;
                        b00 b00Var2 = nzVar2.G;
                        mz mzVar2 = nzVar2.f29185r;
                        if (wx0Var == null) {
                            nzVar2.d(false);
                            mzVar2.G1(null);
                            b00Var2.f24698o0.d.setText("");
                            b00Var2.f24681i0.h1(0, 0);
                            return;
                        } else if (mzVar2.getSelectedCategory() == wx0Var) {
                            nzVar2.c(null, false);
                            mzVar2.G1(null);
                            return;
                        } else {
                            nzVar2.c(wx0Var.f32756a, false);
                            mzVar2.G1(wx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(mzVar, w7.x5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public static void a(nz nzVar, boolean z10, boolean z11) {
        nzVar.f29179a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        b00 b00Var = this.G;
        int i10 = this.f29180b;
        if (i10 == 0) {
            wz wzVar = b00Var.f24736z0;
            uz uzVar = wzVar.O;
            b00 b00Var2 = wzVar.Q;
            mx mxVar = b00Var2.G0;
            jx jxVar = b00Var2.D0;
            if (wzVar.L != 0) {
                ConnectionsManager.getInstance(b00Var2.f24662c1).cancelRequest(wzVar.L, true);
                wzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                wzVar.N = null;
                wzVar.E.clear();
                wzVar.H.clear();
                wzVar.K = new ArrayList();
                s4.i0 adapter = jxVar.getAdapter();
                rz rzVar = b00Var2.f24733y0;
                if (adapter != rzVar) {
                    jxVar.setAdapter(rzVar);
                }
                wzVar.d = 0L;
                b00Var2.f24653a.a(false, true);
                wzVar.l();
                mxVar.e(false);
            } else {
                wzVar.N = str.toLowerCase();
                mxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(uzVar);
            AndroidUtilities.runOnUIThread(uzVar, 300L);
        } else if (i10 == 1) {
            b00Var.S.F(str, z10);
        } else if (i10 == 2) {
            b00Var.f24684j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f29188x) {
            return;
        }
        this.f29188x = z10;
        ValueAnimator valueAnimator = this.f29189y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f29187w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f29189y = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 23));
        this.f29189y.setDuration(120L);
        this.f29189y.setInterpolator(is.h);
        this.f29189y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f29181c.b(2);
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
        mz mzVar = this.f29185r;
        if (z11 && ((yqVar.length() != 0 || (mzVar != null && mzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (yqVar.length() <= 0 && (mzVar == null || mzVar.f24627m3 <= 0.5f || (!mzVar.f24623h3 && mzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f29181c.b(i10);
        this.F = false;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            View view = this.f29182e;
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
