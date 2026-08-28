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
public abstract class jy extends FrameLayout implements td.b {
    public np A;
    public boolean B;
    public final wy C;
    public final td.a f29876a;
    public final int f29877b;
    public final im0 f29878c;
    public final yp d;
    public final View f29879e;
    public final View f29880f;
    public final ImageView h;
    public final FrameLayout f29881n;
    public final iy f29882r;
    public final fh.v f29883s;
    public final View v;
    public float f29884w;
    public boolean f29885x;
    public ValueAnimator f29886y;

    public jy(wy wyVar, Context context, int i9) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        int i10;
        this.C = wyVar;
        this.f29876a = new td.a(0, this, gr.f28845g, 200L, false);
        this.f29885x = false;
        this.f29877b = i9;
        View view = new View(context);
        this.f29879e = view;
        view.setVisibility(4);
        int z14 = wyVar.z(org.telegram.ui.ActionBar.f6.Ke);
        boolean z15 = wyVar.f34400e2;
        view.setBackgroundColor(z14);
        addView(view, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
        View view2 = new View(context);
        this.f29880f = view2;
        if (wyVar.f34434q0) {
            view2.setBackgroundColor(wyVar.z(org.telegram.ui.ActionBar.f6.He));
        }
        addView(view2, new FrameLayout.LayoutParams(-1, wyVar.X0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29881n = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        if (z15) {
            z10 = wyVar.v(0.06f);
        } else {
            z10 = wyVar.z(org.telegram.ui.ActionBar.f6.Ie);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, z10));
        frameLayout.setClipToOutline(true);
        bg.q1 q1Var = ff.r0.f6254a;
        frameLayout.setOutlineProvider(new ff.q0(0, AndroidUtilities.dp(18.0f)));
        if (i9 == 2) {
            addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        fh.v vVar = new fh.v(this, context, 12);
        this.f29883s = vVar;
        frameLayout.addView(vVar, g7.e6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        im0 im0Var = new im0();
        this.f29878c = im0Var;
        im0Var.c(0, false, false);
        if (z15) {
            z11 = wyVar.v(0.4f);
        } else {
            z11 = wyVar.z(org.telegram.ui.ActionBar.f6.Je);
        }
        im0Var.a(z11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final jy f28894b;

            {
                this.f28894b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        jy jyVar = this.f28894b;
                        iy iyVar = jyVar.f29882r;
                        yp ypVar = jyVar.d;
                        if (jyVar.f29878c.f29472k == 1) {
                            ypVar.setText("");
                            jyVar.c(null, false);
                            if (iyVar != null) {
                                iyVar.D1();
                                iyVar.F1(null);
                                iyVar.G1(true, true);
                            }
                            jyVar.f(false);
                            ypVar.clearAnimation();
                            ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            jyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        jy jyVar2 = this.f28894b;
                        yp ypVar2 = jyVar2.d;
                        ypVar2.setText("");
                        jyVar2.c(null, false);
                        iy iyVar2 = jyVar2.f29882r;
                        if (iyVar2 != null) {
                            iyVar2.D1();
                            iyVar2.F1(null);
                            iyVar2.G1(true, true);
                        }
                        jyVar2.f(false);
                        ypVar2.clearAnimation();
                        ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        jyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        yp ypVar = new yp(this, context, i9, 2);
        this.d = ypVar;
        ypVar.setTextSize(1, 16.0f);
        if (z15) {
            z12 = wyVar.v(0.45f);
        } else {
            z12 = wyVar.z(org.telegram.ui.ActionBar.f6.Je);
        }
        ypVar.setHintTextColor(z12);
        if (z15) {
            z13 = wyVar.v(0.8f);
        } else {
            z13 = wyVar.z(org.telegram.ui.ActionBar.f6.G6);
        }
        ypVar.setTextColor(z13);
        ypVar.setBackgroundDrawable(null);
        ypVar.setPadding(0, 0, 0, 0);
        ypVar.setMaxLines(1);
        ypVar.setLines(1);
        ypVar.setSingleLine(true);
        ypVar.setImeOptions(268435459);
        ypVar.setHint(LocaleController.getString(R.string.Search));
        ypVar.setCursorColor(wyVar.z(org.telegram.ui.ActionBar.f6.Mh));
        ypVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ypVar.setCursorWidth(1.5f);
        ypVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        vVar.addView(ypVar, g7.e6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        ypVar.addTextChangedListener(new bh.f(this, 9));
        if (wyVar.f34434q0) {
            View view3 = new View(context);
            this.v = view3;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v(wyVar.z(org.telegram.ui.ActionBar.f6.He), wyVar.z(org.telegram.ui.ActionBar.f6.Ie)), PorterDuff.Mode.MULTIPLY));
            view3.setBackground(mutate);
            view3.setAlpha(0.0f);
            vVar.addView(view3, g7.e6.e(18, -1, 3));
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new kh.e2(this));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, wyVar.V1), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final jy f28894b;

            {
                this.f28894b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        jy jyVar = this.f28894b;
                        iy iyVar = jyVar.f29882r;
                        yp ypVar2 = jyVar.d;
                        if (jyVar.f29878c.f29472k == 1) {
                            ypVar2.setText("");
                            jyVar.c(null, false);
                            if (iyVar != null) {
                                iyVar.D1();
                                iyVar.F1(null);
                                iyVar.G1(true, true);
                            }
                            jyVar.f(false);
                            ypVar2.clearAnimation();
                            ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            jyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        jy jyVar2 = this.f28894b;
                        yp ypVar22 = jyVar2.d;
                        ypVar22.setText("");
                        jyVar2.c(null, false);
                        iy iyVar2 = jyVar2.f29882r;
                        if (iyVar2 != null) {
                            iyVar2.D1();
                            iyVar2.F1(null);
                            iyVar2.G1(true, true);
                        }
                        jyVar2.f(false);
                        ypVar22.clearAnimation();
                        ypVar22.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        jyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        if (i9 == 1 && (!wyVar.Y1 || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return;
        }
        if (i9 == 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        iy iyVar = new iy(this, context, i10, wyVar.V1, i9);
        this.f29882r = iyVar;
        iyVar.f28210s3 = z15;
        TextPaint paint = ypVar.getPaint();
        iyVar.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) ypVar.getHint()) + "")));
        if (wyVar.f34434q0) {
            iyVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v(wyVar.z(org.telegram.ui.ActionBar.f6.He), wyVar.z(org.telegram.ui.ActionBar.f6.Ie)));
        }
        iyVar.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final jy f29212b;

            {
                this.f29212b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        jy jyVar = this.f29212b;
                        jyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        jyVar.d(z16);
                        jyVar.g(false);
                        return;
                    default:
                        aw0 aw0Var = (aw0) obj;
                        jy jyVar2 = this.f29212b;
                        wy wyVar2 = jyVar2.C;
                        iy iyVar2 = jyVar2.f29882r;
                        if (aw0Var == null) {
                            jyVar2.d(false);
                            iyVar2.F1(null);
                            wyVar2.f34417k0.d.setText("");
                            wyVar2.f34398e0.h1(0, 0);
                            return;
                        } else if (iyVar2.getSelectedCategory() == aw0Var) {
                            jyVar2.c(null, false);
                            iyVar2.F1(null);
                            return;
                        } else {
                            jyVar2.c(aw0Var.f26914a, false);
                            iyVar2.F1(aw0Var);
                            return;
                        }
                }
            }
        });
        iyVar.setOnTouchListener(new m.d2(this, 2));
        iyVar.setOnCategoryClick(new Utilities.Callback(this) {
            public final jy f29212b;

            {
                this.f29212b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z16;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        jy jyVar = this.f29212b;
                        jyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        jyVar.d(z16);
                        jyVar.g(false);
                        return;
                    default:
                        aw0 aw0Var = (aw0) obj;
                        jy jyVar2 = this.f29212b;
                        wy wyVar2 = jyVar2.C;
                        iy iyVar2 = jyVar2.f29882r;
                        if (aw0Var == null) {
                            jyVar2.d(false);
                            iyVar2.F1(null);
                            wyVar2.f34417k0.d.setText("");
                            wyVar2.f34398e0.h1(0, 0);
                            return;
                        } else if (iyVar2.getSelectedCategory() == aw0Var) {
                            jyVar2.c(null, false);
                            iyVar2.F1(null);
                            return;
                        } else {
                            jyVar2.c(aw0Var.f26914a, false);
                            iyVar2.F1(aw0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(iyVar, g7.e6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(jy jyVar, boolean z10, boolean z11) {
        jyVar.f29876a.a(z10, z11);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        if (i9 == 0) {
            View view = this.f29879e;
            view.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final void b() {
        AndroidUtilities.hideKeyboard(this.d);
    }

    public final void c(String str, boolean z10) {
        wy wyVar = this.C;
        int i9 = this.f29877b;
        if (i9 == 0) {
            ry ryVar = wyVar.f34451v0;
            py pyVar = ryVar.K;
            wy wyVar2 = ryVar.M;
            iw iwVar = wyVar2.C0;
            fw fwVar = wyVar2.f34466z0;
            if (ryVar.H != 0) {
                ConnectionsManager.getInstance(wyVar2.Y0).cancelRequest(ryVar.H, true);
                ryVar.H = 0;
            }
            if (TextUtils.isEmpty(str)) {
                ryVar.J = null;
                ryVar.A.clear();
                ryVar.D.clear();
                ryVar.G = new ArrayList();
                f2.r0 adapter = fwVar.getAdapter();
                ny nyVar = wyVar2.f34448u0;
                if (adapter != nyVar) {
                    fwVar.setAdapter(nyVar);
                }
                ryVar.d = 0L;
                wyVar2.f34383a.a(false, true);
                ryVar.l();
                iwVar.e(false);
            } else {
                ryVar.J = str.toLowerCase();
                iwVar.e(true);
            }
            AndroidUtilities.cancelRunOnUIThread(pyVar);
            AndroidUtilities.runOnUIThread(pyVar, 300L);
        } else if (i9 == 1) {
            wyVar.O.F(str, z10);
        } else if (i9 == 2) {
            wyVar.f34402f0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f29885x) {
            return;
        }
        this.f29885x = z10;
        ValueAnimator valueAnimator = this.f29886y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f29884w;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f29886y = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 22));
        this.f29886y.setDuration(120L);
        this.f29886y.setInterpolator(gr.h);
        this.f29886y.start();
    }

    public final void e(boolean z10) {
        this.B = z10;
        if (z10) {
            this.f29878c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.A == null) {
                np npVar = new np(this, 15);
                this.A = npVar;
                AndroidUtilities.runOnUIThread(npVar, 340L);
                return;
            }
            return;
        }
        np npVar2 = this.A;
        if (npVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(npVar2);
            this.A = null;
        }
        AndroidUtilities.updateViewShow(this.h, false);
    }

    public final void g(boolean z10) {
        int i9;
        boolean z11 = this.B;
        yp ypVar = this.d;
        iy iyVar = this.f29882r;
        if (z11 && ((ypVar.length() != 0 || (iyVar != null && iyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (ypVar.length() <= 0 && (iyVar == null || iyVar.f28202k3 <= 0.5f || (!iyVar.f28197f3 && iyVar.getSelectedCategory() == null))) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.f29878c.b(i9);
        this.B = false;
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
