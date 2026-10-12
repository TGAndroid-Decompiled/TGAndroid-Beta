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
    public final ne.b f26125a;
    public final int f26126b;
    public final ao0 f26127c;
    public final vq d;
    public final View e;
    public final View f26128f;
    public final ImageView h;
    public final FrameLayout f26129n;
    public final hz f26130r;
    public final ah.v f26131s;
    public final View v;
    public float f26132w;
    public boolean f26133x;
    public ValueAnimator f26134y;

    public iz(wz wzVar, Context context, int i10) {
        super(context);
        int A;
        int A2;
        int A3;
        int A4;
        int i11;
        int i12;
        this.G = wzVar;
        this.f26125a = new ne.b(0, this, es.f24772g, 200L, false);
        this.f26133x = false;
        this.f26126b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int A5 = wzVar.A(org.telegram.ui.ActionBar.g6.Ke);
        boolean z10 = wzVar.f31034i2;
        view.setBackgroundColor(A5);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f26128f = view2;
        if (wzVar.f31069u0) {
            view2.setBackgroundColor(wzVar.A(org.telegram.ui.ActionBar.g6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, wzVar.f31010b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26129n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z10) {
            A = wzVar.w(0.06f);
        } else {
            A = wzVar.A(org.telegram.ui.ActionBar.g6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, A));
        frameLayout.setClipToOutline(true);
        bi.a2 a2Var = zf.j0.f50191a;
        frameLayout.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(18.0f)));
        if (i10 == 2) {
            addView(frameLayout, w7.a6.a(36.0f, 10.0f, 8.0f, 10.0f, 8.0f, -1, 119));
        } else {
            addView(frameLayout, w7.a6.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        }
        ah.v vVar = new ah.v(this, context, 12);
        this.f26131s = vVar;
        frameLayout.addView(vVar, w7.a6.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ao0 ao0Var = new ao0();
        this.f26127c = ao0Var;
        ao0Var.c(0, false, false);
        if (z10) {
            A2 = wzVar.w(0.4f);
        } else {
            A2 = wzVar.A(org.telegram.ui.ActionBar.g6.Je);
        }
        ao0Var.a(A2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(ao0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final iz f25146b;

            {
                this.f25146b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        iz izVar = this.f25146b;
                        hz hzVar = izVar.f26130r;
                        vq vqVar = izVar.d;
                        if (izVar.f26127c.f23591k == 1) {
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
                        iz izVar2 = this.f25146b;
                        vq vqVar2 = izVar2.d;
                        vqVar2.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.f26130r;
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
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        vq vqVar = new vq(this, context, i10, 2);
        this.d = vqVar;
        vqVar.setTextSize(1, 16.0f);
        if (z10) {
            A3 = wzVar.w(0.45f);
        } else {
            A3 = wzVar.A(org.telegram.ui.ActionBar.g6.Je);
        }
        vqVar.setHintTextColor(A3);
        if (z10) {
            A4 = wzVar.w(0.8f);
        } else {
            A4 = wzVar.A(org.telegram.ui.ActionBar.g6.G6);
        }
        vqVar.setTextColor(A4);
        vqVar.setBackgroundDrawable(null);
        vqVar.setPadding(0, 0, 0, 0);
        vqVar.setMaxLines(1);
        vqVar.setLines(1);
        vqVar.setSingleLine(true);
        vqVar.setImeOptions(268435459);
        vqVar.setHint(LocaleController.getString(R.string.Search));
        vqVar.setCursorColor(wzVar.A(org.telegram.ui.ActionBar.g6.Mh));
        vqVar.setCursorSize(AndroidUtilities.dp(20.0f));
        vqVar.setCursorWidth(1.5f);
        vqVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(vqVar, w7.a6.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        vqVar.addTextChangedListener(new di.h2(this, 8));
        if (wzVar.f31069u0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v(wzVar.A(org.telegram.ui.ActionBar.g6.He), wzVar.A(org.telegram.ui.ActionBar.g6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            i11 = 3;
            vVar.addView(view3, w7.a6.e(18, -1, 3));
        } else {
            i11 = 3;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.i2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, wzVar.Z1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final iz f25146b;

            {
                this.f25146b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        iz izVar = this.f25146b;
                        hz hzVar = izVar.f26130r;
                        vq vqVar2 = izVar.d;
                        if (izVar.f26127c.f23591k == 1) {
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
                        iz izVar2 = this.f25146b;
                        vq vqVar22 = izVar2.d;
                        vqVar22.setText("");
                        izVar2.c(null, false);
                        hz hzVar2 = izVar2.f26130r;
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
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        if (i10 == 1 && (!wzVar.f31015c2 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i10 == 0) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        hz hzVar = new hz(this, context, i12, wzVar.Z1, i10);
        this.f26130r = hzVar;
        hzVar.f29817u3 = z10;
        TextPaint paint = vqVar.getPaint();
        hzVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) vqVar.getHint()) + "")));
        if (wzVar.f31069u0) {
            hzVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v(wzVar.A(org.telegram.ui.ActionBar.g6.He), wzVar.A(org.telegram.ui.ActionBar.g6.Ie)));
        }
        hzVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final iz f25436b;

            {
                this.f25436b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iz izVar = this.f25436b;
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
                        iz izVar2 = this.f25436b;
                        wz wzVar2 = izVar2.G;
                        hz hzVar2 = izVar2.f26130r;
                        if (qx0Var == null) {
                            izVar2.d(false);
                            hzVar2.G1(null);
                            wzVar2.f31049o0.d.setText("");
                            wzVar2.f31032i0.h1(0, 0);
                            return;
                        } else if (hzVar2.getSelectedCategory() == qx0Var) {
                            izVar2.c(null, false);
                            hzVar2.G1(null);
                            return;
                        } else {
                            izVar2.c(qx0Var.f28689a, false);
                            hzVar2.G1(qx0Var);
                            return;
                        }
                }
            }
        });
        hzVar.setOnTouchListener(new m.c2(this, 2));
        hzVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final iz f25436b;

            {
                this.f25436b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z11;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        iz izVar = this.f25436b;
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
                        iz izVar2 = this.f25436b;
                        wz wzVar2 = izVar2.G;
                        hz hzVar2 = izVar2.f26130r;
                        if (qx0Var == null) {
                            izVar2.d(false);
                            hzVar2.G1(null);
                            wzVar2.f31049o0.d.setText("");
                            wzVar2.f31032i0.h1(0, 0);
                            return;
                        } else if (hzVar2.getSelectedCategory() == qx0Var) {
                            izVar2.c(null, false);
                            hzVar2.G1(null);
                            return;
                        } else {
                            izVar2.c(qx0Var.f28689a, false);
                            hzVar2.G1(qx0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(hzVar, w7.a6.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public static void a(iz izVar, boolean z10, boolean z11) {
        izVar.f26125a.a(z10, z11);
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        wz wzVar = this.G;
        int i10 = this.f26126b;
        if (i10 == 0) {
            rz rzVar = wzVar.f31087z0;
            pz pzVar = rzVar.O;
            wz wzVar2 = rzVar.Q;
            hx hxVar = wzVar2.G0;
            ex exVar = wzVar2.D0;
            if (rzVar.L != 0) {
                ConnectionsManager.getInstance(wzVar2.f31014c1).cancelRequest(rzVar.L, true);
                rzVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                rzVar.N = null;
                rzVar.E.clear();
                rzVar.H.clear();
                rzVar.K = new ArrayList();
                s4.g0 adapter = exVar.getAdapter();
                mz mzVar = wzVar2.f31084y0;
                if (adapter != mzVar) {
                    exVar.setAdapter(mzVar);
                }
                rzVar.d = 0L;
                wzVar2.f31005a.a(false, true);
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
            wzVar.f31035j0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f7;
        if (z10 == this.f26133x) {
            return;
        }
        this.f26133x = z10;
        ValueAnimator valueAnimator = this.f26134y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f26132w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f26134y = ofFloat;
        ofFloat.addUpdateListener(new n6(this, 23));
        this.f26134y.setDuration(120L);
        this.f26134y.setInterpolator(es.h);
        this.f26134y.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.f26127c.b(2);
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
        hz hzVar = this.f26130r;
        if (z11 && ((vqVar.length() != 0 || (hzVar != null && hzVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (vqVar.length() <= 0 && (hzVar == null || hzVar.f29809m3 <= 0.5f || (!hzVar.f29804h3 && hzVar.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f26127c.b(i10);
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
    public final void C(float f7, int i10) {
    }
}
