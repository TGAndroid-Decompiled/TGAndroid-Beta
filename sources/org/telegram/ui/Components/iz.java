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
public abstract class iz extends FrameLayout implements ne.d {
    public kq E;
    public boolean F;
    public final wz G;
    public final ne.b f25820a;
    public final int f25821b;
    public final zn0 f25822c;
    public final vq d;
    public final View e;
    public final View f25823f;
    public final ImageView h;
    public final FrameLayout f25824n;
    public final hz f25825r;
    public final ah.v f25826s;
    public final View v;
    public float f25827w;
    public boolean f25828x;
    public ValueAnimator f25829y;

    public iz(wz wzVar, Context context, int i10) {
        super(context);
        int B;
        int B2;
        int B3;
        int B4;
        int i11;
        int i12;
        this.G = wzVar;
        this.f25820a = new ne.b(0, this, es.f24466g, 200L, false);
        this.f25828x = false;
        this.f25821b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int B5 = wzVar.B(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = wzVar.f30727i2;
        view.setBackgroundColor(B5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f25823f = view2;
        if (wzVar.f30762u0) {
            view2.setBackgroundColor(wzVar.B(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, wzVar.f30703b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25824n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            B = wzVar.w(0.06f);
        } else {
            B = wzVar.B(org.telegram.ui.ActionBar.g6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, B));
        frameLayout.setClipToOutline(true);
        bi.a2 a2Var = zf.j0.f50192a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.z5.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.z5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ah.v vVar = new ah.v(this, context, 12);
        this.f25826s = vVar;
        frameLayout.addView(vVar, w7.z5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        zn0 zn0Var = new zn0();
        this.f25822c = zn0Var;
        zn0Var.c(0, false, false);
        if (z10) {
            B2 = wzVar.w(0.4f);
        } else {
            B2 = wzVar.B(org.telegram.ui.ActionBar.g6.Je);
        }
        zn0Var.a(B2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(zn0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final iz f24835b;

            {
                this.f24835b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        iz izVar = this.f24835b;
                        hz hzVar = izVar.f25825r;
                        vq vqVar = izVar.d;
                        if (izVar.f25822c.f31605k == 1) {
                            vqVar.setText("");
                            izVar.c(null, false);
                            if (hzVar != null) {
                                hzVar.E1();
                                hzVar.G1(null);
                                hzVar.H1(true, true);
                            }
                            izVar.f(false);
                            vqVar.clearAnimation();
                            vqVar.animate().translationX(0.0f).setInterpolator(es.h).start();
                            izVar.d(false);
                            return;
                        }
                        return;
                    default:
                        iz izVar2 = this.f24835b;
                        vq vqVar2 = izVar2.d;
                        vqVar2.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.f25825r;
                        if (hzVar2 != null) {
                            hzVar2.E1();
                            hzVar2.G1(null);
                            hzVar2.H1(true, true);
                        }
                        izVar2.f(false);
                        vqVar2.clearAnimation();
                        vqVar2.animate().translationX(0.0f).setInterpolator(es.h).start();
                        izVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        vq vqVar = new vq(this, context, i10, 2);
        this.d = vqVar;
        vqVar.setTextSize(1, 16.0f);
        if (z10) {
            B3 = wzVar.w(0.45f);
        } else {
            B3 = wzVar.B(org.telegram.ui.ActionBar.g6.Je);
        }
        vqVar.setHintTextColor(B3);
        if (z10) {
            B4 = wzVar.w(0.8f);
        } else {
            B4 = wzVar.B(org.telegram.ui.ActionBar.g6.G6);
        }
        vqVar.setTextColor(B4);
        vqVar.setBackgroundDrawable(null);
        vqVar.setPadding(0, 0, 0, 0);
        vqVar.setMaxLines(1);
        vqVar.setLines(1);
        vqVar.setSingleLine(true);
        vqVar.setImeOptions(268435459);
        vqVar.setHint(LocaleController.getString(R.string.Search));
        vqVar.setCursorColor(wzVar.B(org.telegram.ui.ActionBar.g6.Mh));
        vqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        vqVar.setCursorWidth(1.5f);
        vqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(vqVar, w7.z5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        vqVar.addTextChangedListener(new di.h2(this, 8));
        if (wzVar.f30762u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(wzVar.B(org.telegram.ui.ActionBar.g6.He), wzVar.B(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            vVar.addView(view3, w7.z5.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.i2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, wzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final iz f24835b;

            {
                this.f24835b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        iz izVar = this.f24835b;
                        hz hzVar = izVar.f25825r;
                        vq vqVar2 = izVar.d;
                        if (izVar.f25822c.f31605k == 1) {
                            vqVar2.setText("");
                            izVar.c(null, false);
                            if (hzVar != null) {
                                hzVar.E1();
                                hzVar.G1(null);
                                hzVar.H1(true, true);
                            }
                            izVar.f(false);
                            vqVar2.clearAnimation();
                            vqVar2.animate().translationX(0.0f).setInterpolator(es.h).start();
                            izVar.d(false);
                            return;
                        }
                        return;
                    default:
                        iz izVar2 = this.f24835b;
                        vq vqVar22 = izVar2.d;
                        vqVar22.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.f25825r;
                        if (hzVar2 != null) {
                            hzVar2.E1();
                            hzVar2.G1(null);
                            hzVar2.H1(true, true);
                        }
                        izVar2.f(false);
                        vqVar22.clearAnimation();
                        vqVar22.animate().translationX(0.0f).setInterpolator(es.h).start();
                        izVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        if (i10 == 1 && (!wzVar.f30708c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        hz hzVar = new hz(this, context, i12, wzVar.Z1, i10);
        this.f25825r = hzVar;
        hzVar.f29485u3 = z10;
        TextPaint paint = vqVar.getPaint();
        hzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) vqVar.getHint()) + "")));
        if (wzVar.f30762u0) {
            hzVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(wzVar.B(org.telegram.ui.ActionBar.g6.He), wzVar.B(org.telegram.ui.ActionBar.g6.Ie)));
        }
        hzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final iz f25126b;

            {
                this.f25126b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iz izVar = this.f25126b;
                        izVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        izVar.d(z11);
                        izVar.g(false);
                        return;
                    default:
                        qx0 qx0Var = (qx0) obj;
                        iz izVar2 = this.f25126b;
                        wz wzVar2 = izVar2.G;
                        hz hzVar2 = izVar2.f25825r;
                        if (qx0Var == null) {
                            izVar2.d(false);
                            hzVar2.G1(null);
                            wzVar2.f30742o0.d.setText("");
                            wzVar2.f30725i0.h1(0, 0);
                            return;
                        } else if (hzVar2.getSelectedCategory() == qx0Var) {
                            izVar2.c(null, false);
                            hzVar2.G1(null);
                            return;
                        } else {
                            izVar2.c(qx0Var.f28375a, false);
                            hzVar2.G1(qx0Var);
                            return;
                        }
                }
            }
        });
        hzVar.setOnTouchListener(new m.e2(this, 2));
        hzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final iz f25126b;

            {
                this.f25126b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iz izVar = this.f25126b;
                        izVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        izVar.d(z11);
                        izVar.g(false);
                        return;
                    default:
                        qx0 qx0Var = (qx0) obj;
                        iz izVar2 = this.f25126b;
                        wz wzVar2 = izVar2.G;
                        hz hzVar2 = izVar2.f25825r;
                        if (qx0Var == null) {
                            izVar2.d(false);
                            hzVar2.G1(null);
                            wzVar2.f30742o0.d.setText("");
                            wzVar2.f30725i0.h1(0, 0);
                            return;
                        } else if (hzVar2.getSelectedCategory() == qx0Var) {
                            izVar2.c(null, false);
                            hzVar2.G1(null);
                            return;
                        } else {
                            izVar2.c(qx0Var.f28375a, false);
                            hzVar2.G1(qx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(hzVar, w7.z5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public static void a(iz izVar, boolean z10, boolean z11) {
        izVar.f25820a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        wz wzVar = this.G;
        int i10 = this.f25821b;
        if (i10 == 0) {
            rz rzVar = wzVar.f30780z0;
            pz pzVar = rzVar.O;
            wz wzVar2 = rzVar.Q;
            hx hxVar = wzVar2.G0;
            ex exVar = wzVar2.D0;
            if (rzVar.L != 0) {
                ConnectionsManager.getInstance(wzVar2.f30707c1).cancelRequest(rzVar.L, true);
                rzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                rzVar.N = null;
                rzVar.E.clear();
                rzVar.H.clear();
                rzVar.K = new ArrayList();
                s4.g0 adapter = exVar.getAdapter();
                mz mzVar = wzVar2.f30777y0;
                if (adapter != mzVar) {
                    exVar.setAdapter(mzVar);
                }
                rzVar.d = 0L;
                wzVar2.f30698a.a(false, true);
                rzVar.l();
                hxVar.e(false);
            } else {
                rzVar.N = str.toLowerCase();
                hxVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(pzVar);
            AndroidUtilities.runOnUIThread(pzVar, 300L);
        } else if (i10 == 1) {
            wzVar.S.F(str, z10);
        } else if (i10 == 2) {
            wzVar.f30728j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f25828x) {
            return;
        }
        this.f25828x = z10;
        ValueAnimator valueAnimator = this.f25829y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f25827w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f25829y = ofFloat;
        ofFloat.addUpdateListener(new n6(this, 23));
        this.f25829y.setDuration(120L);
        this.f25829y.setInterpolator(es.h);
        this.f25829y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f25822c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                kq kqVar = new kq(this, 15);
                this.E = kqVar;
                AndroidUtilities.runOnUIThread(kqVar, 340L);
                return;
            }
            return;
        }
        kq kqVar2 = this.E;
        if (kqVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(kqVar2);
            this.E = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i10;
        boolean z11 = this.F;
        vq vqVar = this.d;
        hz hzVar = this.f25825r;
        if (z11 && ((vqVar.length() != 0 || (hzVar != null && hzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (vqVar.length() <= 0 && (hzVar == null || hzVar.f29477m3 <= 0.5f || (!hzVar.f29472h3 && hzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f25822c.b(i10);
        this.F = false;
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
    public final void A(float f7, int i10) {
    }
}
