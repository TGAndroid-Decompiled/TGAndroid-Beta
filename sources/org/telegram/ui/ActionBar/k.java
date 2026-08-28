package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ky0;
public class k extends FrameLayout implements td.b, w5 {
    public z A;
    public boolean A0;
    public d B;
    public dh.g B0;
    public String C;
    public boolean C0;
    public boolean D;
    public View.OnTouchListener D0;
    public boolean E;
    public final b6 E0;
    public boolean F;
    public xu0 F0;
    public boolean G;
    public boolean G0;
    public boolean H;
    public final Paint H0;
    public boolean I;
    public final Rect I0;
    public boolean J;
    public final com.google.firebase.messaging.l J0;
    public int K;
    public boolean K0;
    public AnimatorSet L;
    public boolean L0;
    public View[] M;
    public boolean M0;
    public boolean N;
    public tn N0;
    public iv0 O;
    public boolean O0;
    public a00 P;
    public Runnable P0;
    public Paint.FontMetricsInt Q;
    public ky0 Q0;
    public boolean R;
    public AnimatorSet R0;
    public Rect S;
    public int S0;
    public int T;
    public int T0;
    public boolean U;
    public boolean U0;
    public CharSequence V;
    public boolean V0;
    public Drawable W;
    public float W0;
    public final td.c X0;
    public final td.a Y0;
    public final td.c Z0;
    public kg.d f23554a;
    public View.OnClickListener f23555a0;
    public final td.a f23556a1;
    public kg.d f23557b;
    public String f23558b0;
    public int f23559b1;
    public kg.d f23560c;
    public final Object[] f23561c0;
    public int f23562c1;
    public final x4 d;
    public Runnable f23563d0;
    public boolean f23564d1;
    public ImageView f23565e;
    public boolean f23566e0;
    public boolean f23567e1;
    public o9 f23568f;
    public Runnable f23569f0;
    public boolean f23570f1;
    public boolean f23571g0;
    public boolean f23572g1;
    public Drawable h;
    public int f23573h0;
    public ih.k f23574h1;
    public boolean f23575i0;
    public boolean f23576i1;
    public boolean f23577j0;
    public boolean f23578j1;
    public float f23579k0;
    public int f23580k1;
    public int f23581l0;
    public int l1;
    public int m0;
    public boolean f23582m1;
    public final h5[] f23583n;
    public int f23584n0;
    public float f23585n1;
    public int f23586o0;
    public ValueAnimator f23587o1;
    public o2 f23588p0;
    public j f23589q0;
    public h5 f23590r;
    public int f23591r0;
    public h5 f23592s;
    public boolean f23593s0;
    public boolean f23594t0;
    public boolean f23595u0;
    public View v;
    public boolean f23596v0;
    public int f23597w;
    public CharSequence f23598w0;
    public int f23599x;
    public boolean f23600x0;
    public boolean f23601y;
    public boolean f23602y0;
    public boolean f23603z0;

    public k(Context context, b6 b6Var) {
        super(context);
        this.d = x4.f23943a;
        this.f23583n = new h5[2];
        this.E = true;
        this.G = true;
        this.I = true;
        this.f23561c0 = new Object[3];
        this.f23571g0 = true;
        this.f23573h0 = 255;
        this.f23591r0 = 0;
        this.H0 = new Paint();
        this.I0 = new Rect();
        this.J0 = new com.google.firebase.messaging.l(this);
        gr grVar = gr.h;
        this.X0 = new td.c(0, this, grVar, 380L);
        this.Y0 = new td.a(0, this, grVar, 380L, false);
        this.Z0 = new td.c(0, this, grVar, 320L);
        this.f23556a1 = new td.a(0, this, grVar, 320L, false);
        this.f23582m1 = true;
        this.f23585n1 = 1.0f;
        this.E0 = b6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View q(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i9, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.m0 = i9;
            if (this.F && (imageView = this.f23565e) != null) {
                imageView.setBackgroundDrawable(f6.f0(i9, 1, -1));
            }
            d dVar = this.B;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f23581l0 = i9;
        ImageView imageView2 = this.f23565e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(f6.f0(i9, 1, -1));
        }
        z zVar = this.A;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i9, boolean z10) {
        if (z10) {
            this.f23586o0 = i9;
            d dVar = this.B;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f23565e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).b(i9);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f23565e.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f23584n0 = i9;
            ImageView imageView2 = this.f23565e;
            if (imageView2 != null && i9 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i9);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).f22807j = i9;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f23565e.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f23565e;
        if (imageView3 != null && this.O0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f23584n0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void D(int i9, boolean z10) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i9);
                }
                i10++;
            }
        } else if (!z10 && (zVar = this.A) != null) {
            int childCount2 = zVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = zVar.getChildAt(i10);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).B(i9);
                }
                i10++;
            }
        }
    }

    public final void E(int i9, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i9, z10);
                }
                i10++;
            }
        } else if (!z11 && (zVar = this.A) != null) {
            int childCount2 = zVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = zVar.getChildAt(i10);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).G(i9, z10);
                }
                i10++;
            }
        }
    }

    public final void F(int i9, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.B) != null) {
            dVar.setPopupItemsSelectorColor(i9);
        } else if (!z10 && (zVar = this.A) != null) {
            zVar.setPopupItemsSelectorColor(i9);
        }
    }

    public final void G(int i9, boolean z10) {
        z zVar = this.A;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.C) {
                        if (z10) {
                            w0Var.getSearchField().setHintTextColor(i9);
                            return;
                        } else {
                            w0Var.getSearchField().setTextColor(i9);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void H(CharSequence charSequence, org.telegram.ui.Components.i5 i5Var) {
        int i9;
        h5[] h5VarArr = this.f23583n;
        if (charSequence != null && h5VarArr[0] == null) {
            p(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            if (charSequence != null && !this.f23577j0) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            h5Var.setVisibility(i9);
            h5 h5Var2 = h5VarArr[0];
            this.V = charSequence;
            h5Var2.k(charSequence);
            if (this.f23602y0) {
                Drawable drawable = this.W;
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.W = i5Var;
            h5Var3.i(i5Var);
            if (this.f23602y0) {
                Drawable drawable2 = this.W;
                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.f23555a0);
        }
        this.f23595u0 = false;
    }

    public final void I(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f10;
        h5[] h5VarArr = this.f23583n;
        if (h5VarArr[0] != null && charSequence != null) {
            if (this.f23593s0 && !TextUtils.isEmpty(this.f23598w0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f23590r.getVisibility() != 0) {
                    this.f23590r.setVisibility(0);
                    this.f23590r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f23590r.animate();
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(220L).start();
            }
            h5 h5Var = h5VarArr[1];
            if (h5Var != null) {
                if (h5Var.getParent() != null) {
                    ((ViewGroup) h5VarArr[1].getParent()).removeView(h5VarArr[1]);
                }
                h5VarArr[1] = null;
            }
            h5VarArr[1] = h5VarArr[0];
            h5VarArr[0] = null;
            setTitle(charSequence);
            this.f23595u0 = z10;
            h5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                h5 h5Var2 = h5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                h5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = h5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f23594t0 = true;
            ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
            if (!z11) {
                int dp2 = AndroidUtilities.dp(20.0f);
                if (z10) {
                    dp2 = -dp2;
                }
                alpha.translationY(dp2);
            }
            if (interpolator != null) {
                alpha.setInterpolator(interpolator);
            }
            alpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void J(String str, int i9, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        h5 h5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.U && this.f23588p0.parentLayout != null) {
            Object[] objArr = this.f23561c0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i9);
            objArr[2] = runnable;
            if (!this.U0) {
                String str3 = this.f23558b0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f23558b0 = str;
                        Drawable drawable = null;
                        if (this.f23574h1 != null) {
                            if (i9 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f23574h1.a(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i9);
                        } else {
                            str2 = this.V;
                        }
                        if (str == null) {
                            drawable = this.W;
                        }
                        com.google.firebase.messaging.l lVar = this.J0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            lVar.u(valueOf, indexOf);
                            z10 = true;
                            spannableString = valueOf;
                        } else {
                            z10 = false;
                            spannableString = str2;
                        }
                        if (str != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f23566e0 = z11;
                        h5[] h5VarArr = this.f23583n;
                        if ((spannableString == null || h5VarArr[0] != null) && getMeasuredWidth() != 0 && ((h5Var = h5VarArr[0]) == null || h5Var.getVisibility() == 0)) {
                            h5 h5Var2 = h5VarArr[0];
                            if (h5Var2 != null) {
                                h5Var2.animate().cancel();
                                h5 h5Var3 = h5VarArr[1];
                                if (h5Var3 != null) {
                                    h5Var3.animate().cancel();
                                }
                                if (h5VarArr[1] == null) {
                                    p(1);
                                }
                                h5VarArr[1].k(spannableString);
                                h5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                h5VarArr[1].i(drawable);
                                h5VarArr[1].setRightDrawableOnClick(this.f23555a0);
                                if (drawable instanceof org.telegram.ui.Components.i5) {
                                    ((org.telegram.ui.Components.i5) drawable).l(h5VarArr[1]);
                                }
                                if (z10) {
                                    lVar.c(h5VarArr[1]);
                                }
                                this.U0 = true;
                                h5 h5Var4 = h5VarArr[1];
                                h5VarArr[1] = h5VarArr[0];
                                h5VarArr[0] = h5Var4;
                                h5Var4.setAlpha(0.0f);
                                h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = h5VarArr[0].animate();
                                float f10 = 1.0f;
                                if (this.f23578j1) {
                                    f10 = 1.0f - this.f23585n1;
                                }
                                animate.alpha(f10).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
                                if (this.f23590r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f23596v0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.N) {
                                h5VarArr[0].invalidate();
                                invalidate();
                            }
                            h5VarArr[0].k(spannableString);
                            h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            h5VarArr[0].i(drawable);
                            h5VarArr[0].setRightDrawableOnClick(this.f23555a0);
                            if (drawable instanceof org.telegram.ui.Components.i5) {
                                ((org.telegram.ui.Components.i5) drawable).l(h5VarArr[0]);
                            }
                            if (z10) {
                                lVar.c(h5VarArr[0]);
                            } else {
                                lVar.q(h5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f23563d0;
                        }
                        this.f23569f0 = runnable;
                    }
                }
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        invalidate();
    }

    public final void K() {
        this.C0 = true;
        if (this.B0 == null) {
            dh.g gVar = new dh.g(getContext(), 4);
            this.B0 = gVar;
            addView(gVar);
        }
    }

    public final void L(ig.a aVar, lg.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.K0 = true;
        this.M0 = z10;
        kg.d c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.o(AndroidUtilities.dp(6.0f));
        this.f23554a = c10;
        if (z10) {
            c10.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.p(AndroidUtilities.dp(23.0f));
        }
        kg.d c11 = aVar.c(this, null, false);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.f23557b = c11;
        kg.d c12 = aVar.c(this, null, false);
        c12.n(dVar);
        c12.p(AndroidUtilities.dp(23.0f));
        c12.o(AndroidUtilities.dp(6.0f));
        this.f23560c = c12;
        z zVar = this.A;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.A.setGlassMode(true);
        }
        d dVar2 = this.B;
        if (dVar2 != null) {
            dVar2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.B.setGlassMode(true);
        }
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean M(View view) {
        if (this.H) {
            h5[] h5VarArr = this.f23583n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.f23590r || view == this.A || view == this.f23565e || view == this.f23592s || view == this.B0) {
                return true;
            }
        }
        return false;
    }

    public void N(View[] viewArr, boolean[] zArr) {
        if (this.B != null && !this.F) {
            this.F = true;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.B, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.M = viewArr;
            if (this.f23597w == 0) {
                if (!this.f23577j0) {
                    h5 h5Var = this.f23583n[0];
                    if (h5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f));
                    }
                    if (this.f23590r != null && !TextUtils.isEmpty(this.f23598w0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f23590r, property, 0.0f));
                    }
                }
                z zVar = this.A;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i9 = this.f23597w;
            if (i9 == 0) {
                i9 = this.f23599x;
            }
            if (i9 != 0 && !this.K0) {
                if (i0.a.f(i9) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.Q0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 2));
                this.L.playTogether(ofFloat);
            }
            this.L.setDuration(200L);
            this.L.addListener(new fg.j(8, this, zArr));
            this.L.start();
            ImageView imageView = this.f23565e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(1.0f, true);
                }
                this.f23565e.setBackgroundDrawable(f6.f0(this.m0, 1, -1));
            }
        }
    }

    public final void O() {
        boolean z10;
        if (this.f23602y0 && this.f23603z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A0 != z10) {
            this.A0 = z10;
            com.google.firebase.messaging.l lVar = this.J0;
            if (z10) {
                lVar.f4157a = true;
                AnimatorSet animatorSet = (AnimatorSet) lVar.f4159c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            lVar.f4157a = false;
            ((AnimatorSet) lVar.f4159c).cancel();
        }
    }

    public final boolean a(String str) {
        if (this.B != null) {
            String str2 = this.C;
            if (str2 != null || str != null) {
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b() {
        int v02;
        int v03;
        if (this.f23576i1) {
            if (this.f23578j1) {
                dh.g gVar = this.B0;
                if (gVar != null) {
                    gVar.setAlpha(1.0f - this.f23585n1);
                } else {
                    h5 h5Var = this.f23583n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.f23585n1);
                    }
                }
            }
            float f10 = this.f23585n1;
            int i9 = this.l1;
            b6 b6Var = this.E0;
            if (i9 == -1) {
                v02 = 0;
            } else {
                v02 = f6.v0(i9, b6Var);
            }
            int i10 = this.f23580k1;
            if (i10 == -1) {
                v03 = 0;
            } else {
                v03 = f6.v0(i10, b6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f10, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f23585n1) * 255.0f));
            if (this.G0) {
                invalidate();
            }
        }
    }

    public final void c() {
        if (!LocaleController.isRTL) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.f23596v0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) gr.f28844f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    @Override
    public final void d() {
        b();
        kg.d dVar = this.f23554a;
        if (dVar != null) {
            dVar.u();
        }
        kg.d dVar2 = this.f23560c;
        if (dVar2 != null) {
            dVar2.u();
        }
        kg.d dVar3 = this.f23557b;
        if (dVar3 != null) {
            dVar3.u();
        }
        ih.k kVar = this.f23574h1;
        if (kVar != null) {
            kVar.d();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i9;
        boolean z10;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        int i13;
        float f12;
        tn tnVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f23564d1) {
            i9 = this.f23559b1;
        } else {
            i9 = (int) this.Z0.f47780e;
        }
        if (this.f23567e1) {
            i9 = Math.max((int) ((1.0f - this.W0) * this.f23562c1), i9);
        }
        ImageView imageView = this.f23565e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i14 = dp * 2;
        int i15 = height + dp2 + i14;
        kg.d dVar = this.f23554a;
        td.a aVar = this.f23556a1;
        if (dVar != null && !this.L0) {
            if (this.f23564d1 || this.f23567e1) {
                f10 = 1.0f;
                if (i9 > 0) {
                    i12 = dp;
                } else {
                    i12 = 0;
                }
            } else {
                f10 = 1.0f;
                i12 = (int) (dp * aVar.f47775e);
            }
            int i16 = i12 + i9;
            int i17 = dp + dp2;
            int max = Math.max(i16, i17);
            tn tnVar2 = this.N0;
            td.a aVar2 = this.Y0;
            if (tnVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = f10 - aVar2.f47775e;
            }
            int lerp = AndroidUtilities.lerp(i16, max, f11);
            if (z10) {
                i13 = i17;
            } else {
                i13 = 0;
            }
            if (this.N0 == null) {
                f12 = 0.0f;
            } else {
                f12 = f10 - aVar2.f47775e;
            }
            int lerp2 = AndroidUtilities.lerp(i13, i17, f12);
            int width = getWidth() - lerp;
            int i18 = width - lerp2;
            if (this.N0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i18, ((int) this.X0.f47780e) + i14), i18, Math.max(this.W0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.N0.getLayoutParams()).leftMargin) - this.N0.getLeftPadding()) + dp;
                this.N0.setTranslationX(dp3);
                this.N0.setPivotX((tnVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f23554a.setBounds(lerp2, height, width, i15);
            this.f23554a.draw(canvas);
        } else {
            f10 = 1.0f;
        }
        kg.d dVar2 = this.f23557b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i14, i15);
            this.f23557b.draw(canvas);
        }
        kg.d dVar3 = this.f23560c;
        if (dVar3 != null && i9 > 0 && !this.L0 && !this.f23572g1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i9)) - i14, height, getWidth(), i15);
            kg.d dVar4 = this.f23560c;
            if (this.f23564d1) {
                i11 = 255;
            } else {
                i11 = (int) (aVar.f47775e * 255.0f);
            }
            dVar4.setAlpha(i11);
            this.f23560c.draw(canvas);
        }
        if (this.G0 && this.f23599x != 0) {
            this.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i19 = this.f23599x;
            Paint paint = this.H0;
            paint.setColor(i19);
            if (this.f23576i1) {
                xu0 xu0Var = this.F0;
                float y10 = getY();
                float f13 = f10 - this.f23585n1;
                xu0Var.getClass();
                if (xu0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i10 = f6.f23360xf;
                } else {
                    i10 = f6.f23377yf;
                }
                xu0Var.K(canvas, y10, this.I0, paint, true, AndroidUtilities.lerp(255, Color.alpha(f6.v0(i10, xu0Var.getResourceProvider())), f13));
            } else {
                this.F0.J(canvas, getY(), this.I0, paint, true);
            }
        }
        this.f23570f1 = true;
        if (this.V0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.N0 != null && this.K0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View q10 = q(this, f10, f11, this.N0);
            if (q10 == null) {
                q10 = q(this, f10, f11, null);
            }
            kg.d dVar = this.f23554a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q10 != null && q10 != this.N0) {
                kg.d dVar2 = this.f23557b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                kg.d dVar3 = this.f23560c;
                z10 = z13 | ((dVar3 == null || !dVar3.getBounds().contains(x10, y10)) ? false : false);
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(boolean z10) {
        boolean z11;
        float f10;
        tn tnVar = this.N0;
        if (tnVar == null) {
            return;
        }
        pn pnVar = tnVar.f32731e;
        if (pnVar != null && pnVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.N0.getVisualWidth());
        td.c cVar = this.X0;
        if (z10) {
            if (cVar.f47782g) {
                f10 = cVar.f47781f;
            } else {
                f10 = cVar.f47780e;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.Y0.a(z11, z10);
    }

    public final void f() {
        int i9;
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof h2) && !(drawable instanceof c5)) {
                i9 = 0;
            } else {
                i9 = 2;
            }
            if (this.f23565e.getLayerType() != i9) {
                this.f23565e.setLayerType(i9, null);
                this.f23565e.invalidate();
            }
        }
    }

    public final void g() {
        int i9;
        int i10;
        float f10;
        z zVar = this.A;
        boolean z10 = false;
        if (zVar != null) {
            i9 = (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i9 = 0;
        }
        int max = Math.max(0, i9);
        d dVar = this.B;
        if (dVar != null) {
            i10 = (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        int max2 = Math.max(0, i10);
        AndroidUtilities.dp(46.0f);
        if (this.F) {
            max = max2;
        }
        if (max > 0) {
            z10 = true;
        }
        this.f23556a1.a(z10, this.f23570f1);
        td.c cVar = this.Z0;
        if (cVar.f47782g) {
            f10 = cVar.f47781f;
        } else {
            f10 = cVar.f47780e;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f23570f1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f23589q0;
    }

    public z getActionMode() {
        return this.B;
    }

    public float getActionModeFactor() {
        d dVar = this.B;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f23574h1;
    }

    public h5 getAdditionalSubtitleTextView() {
        return this.f23592s;
    }

    public ImageView getBackButton() {
        return this.f23565e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public x4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f23599x;
    }

    public boolean getCastShadows() {
        return this.f23571g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.E;
    }

    public o9 getSearchAvatarImageView() {
        return this.f23568f;
    }

    public int getShadowAlpha() {
        return this.f23573h0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f23590r != null && (charSequence = this.f23598w0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public h5 getSubtitleTextView() {
        return this.f23590r;
    }

    public String getTitle() {
        h5 h5Var = this.f23583n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        h5 h5Var = this.f23583n[0];
        if (h5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f10));
            return textPaint.getFontMetricsInt();
        }
        return h5Var.getPaint().getFontMetricsInt();
    }

    public h5 getTitleTextView() {
        return this.f23583n[0];
    }

    public h5 getTitleTextView2() {
        return this.f23583n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.B0;
    }

    public void h(boolean z10) {
        z zVar;
        if (this.f23577j0 && (zVar = this.A) != null) {
            zVar.j(z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final z i() {
        return j(null);
    }

    public final z j(String str) {
        float f10;
        int i9;
        if (a(str)) {
            return this.B;
        }
        d dVar = this.B;
        if (dVar != null) {
            removeView(dVar);
            this.B = null;
        }
        this.C = str;
        d dVar2 = new d(this, getContext(), this);
        this.B = dVar2;
        if (this.K0) {
            f10 = -AndroidUtilities.dp(10.0f);
        } else {
            f10 = 0.0f;
        }
        dVar2.setTranslationX(f10);
        this.B.setGlassMode(this.K0);
        d dVar3 = this.B;
        dVar3.f24000c = true;
        dVar3.setClickable(true);
        if (!this.K0) {
            this.B.setBackgroundColor(f6.v0(f6.w8, this.E0));
        }
        addView(this.B, indexOfChild(this.f23565e));
        d dVar4 = this.B;
        if (this.E) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        dVar4.setPadding(0, i9, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.K;
        layoutParams.gravity = 5;
        this.B.setLayoutParams(layoutParams);
        this.B.setVisibility(4);
        return this.B;
    }

    public final void k() {
        if (this.f23574h1 == null) {
            ih.k kVar = new ih.k(this, getContext(), this.E0, this.J0);
            this.f23574h1 = kVar;
            kVar.setClipChildren(false);
            addView(this.f23574h1);
        }
    }

    public final void l() {
        if (this.f23592s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23592s = h5Var;
        h5Var.setGravity(3);
        this.f23592s.setVisibility(8);
        this.f23592s.setTextColor(f6.v0(f6.B8, this.E0));
        addView(this.f23592s, 0, g7.e6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f23565e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f23565e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23565e.setBackgroundDrawable(f6.f0(this.f23581l0, 1, -1));
        this.f23565e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f23565e, g7.e6.e(54, 54, 51));
        this.f23565e.setOnClickListener(new b(this, 1));
        this.f23565e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.A;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.A = zVar2;
        addView(zVar2, 0, g7.e6.e(-2, -1, 5));
        return this.A;
    }

    public final void o() {
        if (this.f23590r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23590r = h5Var;
        h5Var.setGravity(3);
        this.f23590r.setVisibility(8);
        this.f23590r.setTextColor(f6.v0(f6.B8, this.E0));
        addView(this.f23590r, 0, g7.e6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23602y0 = true;
        O();
        if (this.F) {
            int i9 = this.f23597w;
            if (i9 == 0) {
                i9 = this.f23599x;
            }
            if (i9 != 0 && !this.K0) {
                if (i0.a.f(i9) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(this.f23583n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23602y0 = false;
        O();
        if (this.F) {
            int i9 = this.f23599x;
            if (i9 != 0 && this.f23597w != 0 && !this.K0) {
                if (i0.a.f(i9) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.N && !this.f23566e0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = f6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.R = true;
            iv0 iv0Var = this.O;
            h5[] h5VarArr = this.f23583n;
            if (iv0Var == null) {
                this.P = null;
                this.O = new iv0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.O = null;
                ?? obj = new Object();
                obj.f26592c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f26590a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(f6.w0(null, f6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i9 = 0; i9 < 20; i9++) {
                    obj.d.add(new zz(obj));
                }
                this.P = obj;
                h5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.D0;
        if ((onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        int dp;
        h5[] h5VarArr;
        h5 h5Var;
        int i12;
        int i13;
        int i14;
        h5 h5Var2;
        int i15;
        int i16;
        int makeMeasureSpec;
        float f11;
        int i17;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i18 = 1;
        kVar.D = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.B;
        if (dVar != null) {
            if (kVar.E) {
                i17 = AndroidUtilities.statusBarHeight;
            } else {
                i17 = 0;
            }
            dVar.setPadding(0, i17, 0, 0);
        }
        kVar.D = false;
        if (kVar.E) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i11 + kVar.K);
        ImageView imageView = kVar.f23565e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f23565e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
            if (AndroidUtilities.isTablet()) {
                f11 = 80.0f;
            } else {
                f11 = 72.0f;
            }
            dp = AndroidUtilities.dp(f11);
        } else {
            if (AndroidUtilities.isTablet()) {
                f10 = 26.0f;
            } else {
                f10 = 18.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        z zVar = kVar.A;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.A.p() && !kVar.f23577j0) {
                kVar.A.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l10 = kVar.A.l();
                if (kVar.f23575i0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.A.l() + (size - AndroidUtilities.dp(f12)), 1073741824);
                if (!kVar.f23601y) {
                    kVar.A.r(-l10);
                }
            } else if (kVar.f23577j0) {
                if (kVar.f23575i0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = ll.d(f12, size, 1073741824);
                if (!kVar.f23601y) {
                    kVar.A.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f23601y) {
                    kVar.A.r(0.0f);
                }
            }
            kVar.A.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i19 = 0;
        while (true) {
            h5VarArr = kVar.f23583n;
            if (i19 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = kVar.f23590r) != null && h5Var.getVisibility() != 8)) {
                z zVar2 = kVar.A;
                if (zVar2 != null) {
                    i12 = zVar2.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int max = Math.max(org.telegram.messenger.l0.B(16.0f, size - i12, dp) - kVar.T, 0);
                boolean z10 = kVar.f23595u0;
                int i20 = 20;
                if (((z10 && i19 == 0) || (!z10 && i19 == i18)) && kVar.f23593s0 && kVar.f23594t0) {
                    h5 h5Var4 = h5VarArr[i19];
                    if (kVar.K0) {
                        i20 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i20 = 18;
                    }
                    h5Var4.setTextSize(i20);
                } else {
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 != null && h5Var5.getVisibility() != 8 && (h5Var2 = kVar.f23590r) != null && h5Var2.getVisibility() != 8) {
                        h5 h5Var6 = h5VarArr[i19];
                        if (h5Var6 != null) {
                            if (kVar.K0) {
                                i20 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i20 = 18;
                            }
                            h5Var6.setTextSize(i20);
                        }
                        h5 h5Var7 = kVar.f23590r;
                        if (AndroidUtilities.isTablet()) {
                            i15 = 16;
                        } else {
                            i15 = 14;
                        }
                        h5Var7.setTextSize(i15);
                        h5 h5Var8 = kVar.f23592s;
                        if (h5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i16 = 16;
                            } else {
                                i16 = 14;
                            }
                            h5Var8.setTextSize(i16);
                        }
                    } else {
                        h5 h5Var9 = h5VarArr[i19];
                        if (h5Var9 != null && h5Var9.getVisibility() != 8) {
                            h5 h5Var10 = h5VarArr[i19];
                            if (kVar.K0) {
                                i20 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i20 = 18;
                            }
                            h5Var10.setTextSize(i20);
                        }
                        h5 h5Var11 = kVar.f23590r;
                        if (h5Var11 != null && h5Var11.getVisibility() != 8) {
                            h5 h5Var12 = kVar.f23590r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            h5Var12.setTextSize(i14);
                        }
                        h5 h5Var13 = kVar.f23592s;
                        if (h5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i13 = 14;
                            } else {
                                i13 = 16;
                            }
                            h5Var13.setTextSize(i13);
                        }
                    }
                }
                h5 h5Var14 = h5VarArr[i19];
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    h5VarArr[i19].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h5VarArr[i19].getPaddingBottom() + h5VarArr[i19].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f23596v0) {
                        CharSequence text = h5VarArr[i19].getText();
                        h5 h5Var15 = h5VarArr[i19];
                        h5Var15.setPivotX(h5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i19].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i19].setPivotX(0.0f);
                        h5VarArr[i19].setPivotY(0.0f);
                    }
                }
                h5 h5Var16 = kVar.f23590r;
                if (h5Var16 != null && h5Var16.getVisibility() != 8) {
                    kVar.f23590r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ih.k kVar2 = kVar.f23574h1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                h5 h5Var17 = kVar.f23592s;
                if (h5Var17 != null && h5Var17.getVisibility() != 8) {
                    kVar.f23592s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i19++;
            i18 = 1;
        }
        o9 o9Var = kVar.f23568f;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = kVar.getChildAt(i21);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != kVar.f23574h1 && childAt != kVar.f23590r && childAt != kVar.A && childAt != kVar.f23565e && childAt != kVar.f23592s && childAt != kVar.f23568f) {
                kVar.measureChildWithMargins(childAt, i9, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i21++;
            kVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.I) {
            return false;
        }
        return true;
    }

    public final void p(int i9) {
        View[] viewArr = this.f23583n;
        if (viewArr[i9] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        viewArr[i9] = h5Var;
        h5Var.setGravity(19);
        int i10 = this.f23591r0;
        if (i10 != 0) {
            viewArr[i9].setTextColor(i10);
        } else {
            viewArr[i9].setTextColor(f6.v0(f6.A8, this.E0));
        }
        h5 h5Var2 = viewArr[i9];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
        viewArr[i9].setTypeface(AndroidUtilities.bold());
        viewArr[i9].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i9].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i9].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.C0) {
            this.B0.addView(viewArr[i9], 0, g7.e6.e(-2, -2, 51));
        } else {
            addView(viewArr[i9], 0, g7.e6.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.B;
        if (dVar != null && this.F) {
            int childCount = dVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = dVar.getChildAt(i9);
                if (childAt instanceof w0) {
                    ((w0) childAt).n();
                }
            }
            this.F = false;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.B, property, 0.0f));
            if (this.M != null) {
                int i10 = 0;
                while (true) {
                    View[] viewArr = this.M;
                    if (i10 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i10];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.M[i10], property, 1.0f));
                    }
                    i10++;
                }
            }
            boolean z10 = this.f23577j0;
            h5[] h5VarArr = this.f23583n;
            if (!z10) {
                h5 h5Var = h5VarArr[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 1.0f));
                }
                if (this.f23590r != null && !TextUtils.isEmpty(this.f23598w0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f23590r, property, 1.0f));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i11 = this.f23599x;
            if (i11 != 0 && !this.K0) {
                if (i0.a.f(i11) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.Q0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.L.playTogether(ofFloat);
            }
            this.L.setDuration(200L);
            this.L.addListener(new e(this, 0));
            this.L.start();
            if (!this.f23577j0) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.setVisibility(0);
                }
                if (this.f23590r != null && !TextUtils.isEmpty(this.f23598w0)) {
                    this.f23590r.setVisibility(0);
                }
            }
            z zVar2 = this.A;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.f23565e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(0.0f, true);
                }
                this.f23565e.setBackgroundDrawable(f6.f0(this.f23581l0, 1, -1));
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        if (this.B != null && this.F) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f23589q0 = jVar;
    }

    public void setActionModeColor(int i9) {
        d dVar = this.B;
        if (dVar != null) {
            dVar.setBackgroundColor(i9);
        }
    }

    public void setActionModeOverrideColor(int i9) {
        this.f23597w = i9;
    }

    public void setActionModeTopColor(int i9) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, f6.f22947a7, f6.f23269s8);
    }

    public void setAddToContainer(boolean z10) {
        this.G = z10;
    }

    public void setAdditionalTextLeft(int i9) {
        this.S0 = i9;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.U = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i9;
        float f10;
        if (this.f23565e == null) {
            m();
        }
        ImageView imageView = this.f23565e;
        if (drawable == null) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        imageView.setVisibility(i9);
        ImageView imageView2 = this.f23565e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof h2) {
            h2 h2Var = (h2) drawable;
            if (s()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h2Var.c(f10, false);
            h2Var.b(this.f23586o0);
            h2Var.a(this.f23584n0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.f22808k = this.f23599x;
            c5Var.f22807j = this.f23584n0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f23565e.setColorFilter(new PorterDuffColorFilter(this.f23584n0, PorterDuff.Mode.SRC_IN));
        }
        if (this.O0) {
            this.f23565e.setColorFilter(new PorterDuffColorFilter(this.f23584n0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i9) {
        int i10;
        if (this.f23565e == null) {
            m();
        }
        ImageView imageView = this.f23565e;
        if (i9 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f23565e.setImageResource(i9);
        this.f23565e.setColorFilter(new PorterDuffColorFilter(this.f23584n0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.f23599x = i9;
        if (!this.G0) {
            super.setBackgroundColor(i9);
        }
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).f22808k = i9;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f23571g0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23571g0 = z10;
    }

    public void setChatAvatarContainer(tn tnVar) {
        this.N0 = tnVar;
    }

    public void setClipContent(boolean z10) {
        this.H = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.f23600x0 = z10;
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(xu0 xu0Var) {
        this.G0 = true;
        this.F0 = xu0Var;
        xu0Var.P.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        z zVar = this.A;
        if (zVar != null) {
            zVar.setEnabled(z10);
        }
        d dVar = this.B;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i9) {
        this.K = i9;
        d dVar = this.B;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.K;
            this.B.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.J = z10;
    }

    public void setForcedMenuMinWidth(int i9) {
        this.f23567e1 = true;
        if (this.f23562c1 != i9) {
            this.f23562c1 = i9;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i9) {
        this.f23564d1 = true;
        if (this.f23559b1 != i9) {
            this.f23559b1 = i9;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.D0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.I = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.f23601y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i9;
        this.E = z10;
        d dVar = this.B;
        if (dVar != null) {
            if (z10) {
                i9 = AndroidUtilities.statusBarHeight;
            } else {
                i9 = 0;
            }
            dVar.setPadding(0, i9, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f23593s0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23555a0 = onClickListener;
        h5[] h5VarArr = this.f23583n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.f23555a0);
        }
    }

    public void setSearchAvatarImageView(o9 o9Var) {
        o9 o9Var2 = this.f23568f;
        if (o9Var2 != o9Var) {
            if (o9Var2 != null) {
                removeView(o9Var2);
            }
            this.f23568f = o9Var;
            if (o9Var != null) {
                addView(o9Var);
            }
        }
    }

    public void setSearchCursorColor(int i9) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setSearchCursorColor(i9);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.W0 != f10) {
            this.W0 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.A.setSearchFieldText(str);
    }

    public void setSearchFilter(of.m0 m0Var) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setFilter(m0Var);
        }
    }

    public void setShadowAlpha(int i9) {
        if (this.f23573h0 == i9) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23573h0 = i9;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i9;
        if (charSequence != null && this.f23590r == null) {
            o();
        }
        if (this.f23590r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            h5 h5Var = this.f23590r;
            if (!isEmpty && !this.f23577j0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            h5Var.setVisibility(i9);
            this.f23590r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f23590r.l(charSequence, false);
            }
            this.f23598w0 = charSequence;
        }
    }

    public void setSubtitleColor(int i9) {
        if (this.f23590r == null) {
            o();
        }
        this.f23590r.setTextColor(i9);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.N = z10;
        if (z10) {
            this.Q = new Paint.FontMetricsInt();
            this.S = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        H(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f23569f0 = runnable;
        this.f23563d0 = runnable;
    }

    public void setTitleColor(int i9) {
        h5[] h5VarArr = this.f23583n;
        if (h5VarArr[0] == null) {
            p(0);
        }
        this.f23591r0 = i9;
        h5VarArr[0].setTextColor(i9);
        h5VarArr[0].setEmojiColor(i9);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i9);
            h5VarArr[1].setEmojiColor(i9);
        }
    }

    public void setTitleRightMargin(int i9) {
        this.T = i9;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f23583n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.H) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.B != null && this.F) {
            String str2 = this.C;
            if (str2 != null || str != null) {
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean u() {
        return false;
    }

    public void v(boolean z10) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i9;
        this.f23577j0 = z10;
        g();
        AnimatorSet animatorSet = this.R0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.R0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            h5 h5Var = this.f23583n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.f23590r != null && !TextUtils.isEmpty(this.f23598w0)) {
                arrayList.add(this.f23590r);
                h5 h5Var2 = this.f23590r;
                if (z10) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
                h5Var2.setVisibility(i9);
            }
        }
        float f14 = this.f23579k0;
        float f15 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 1));
        this.R0.playTogether(ofFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f16 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.R0;
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.R0;
            if (z10) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.R0;
            if (!z10) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        o9 o9Var = this.f23568f;
        if (o9Var != null) {
            o9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.R0;
            o9 o9Var2 = this.f23568f;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(o9Var2, property, f11));
        }
        this.f23596v0 = true;
        requestLayout();
        this.R0.addListener(new f(this, arrayList, z10, u10));
        this.R0.setDuration(150L).start();
        ImageView imageView = this.f23565e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                c5 c5Var = (c5) drawable;
                c5Var.h = true;
                if (z10) {
                    f15 = 1.0f;
                }
                c5Var.a(f15, true);
            }
        }
    }

    public final void w() {
        e5 e5Var;
        z zVar = this.A;
        int childCount = zVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zVar.getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && (e5Var = w0Var.D) != null) {
                    e5Var.p(w0Var.f23906e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.A;
        if (zVar != null && str != null) {
            boolean z10 = this.f23577j0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = zVar.getChildAt(i9);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.C) {
                        if (!z10) {
                            zVar.f23999b.v(w0Var.L(z11));
                        }
                        w0Var.H(str, false);
                        w0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i9, int i10) {
        float f10;
        this.f23580k1 = i9;
        this.l1 = i10;
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(3, this, recyclerView);
        recyclerView.j(new bg.o2(l0Var, 19));
        this.f23578j1 = z10;
        if (this.f23576i1) {
            l0Var.run();
            return;
        }
        this.f23576i1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f23582m1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f23585n1 = f10;
        b();
    }

    public final void z(wk0 wk0Var, boolean z10) {
        y(wk0Var, z10, f6.f22947a7, f6.f23269s8);
    }

    public void setAdaptiveBackground(in0 in0Var) {
        int i9 = f6.f22947a7;
        int i10 = f6.f23269s8;
        this.f23580k1 = i9;
        this.l1 = i10;
        b();
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(2, this, in0Var);
        in0Var.f29484f.add(l0Var);
        if (this.f23576i1) {
            l0Var.run();
            return;
        }
        this.f23576i1 = true;
        boolean canScrollVertically = in0Var.canScrollVertically(-1);
        this.f23582m1 = !canScrollVertically;
        this.f23585n1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
