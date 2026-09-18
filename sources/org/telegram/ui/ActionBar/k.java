package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.zn;
import org.telegram.ui.g01;
public class k extends FrameLayout implements le.d, a6 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public a0 E;
    public boolean E0;
    public d F;
    public ai.x5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final f6 J0;
    public boolean K;
    public qv0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final com.google.firebase.messaging.m O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public bw0 S;
    public eo S0;
    public p00 T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public Runnable U0;
    public boolean V;
    public g01 V0;
    public Rect W;
    public AnimatorSet W0;
    public int X0;
    public int Y0;
    public boolean Z0;
    public ch.d f19276a;
    public int f19277a0;
    public boolean f19278a1;
    public ch.d f19279b;
    public boolean f19280b0;
    public float f19281b1;
    public ch.d f19282c;
    public CharSequence f19283c0;
    public final le.e f19284c1;
    public final a5 d;
    public Drawable f19285d0;
    public final le.b f19286d1;
    public ImageView e;
    public View.OnClickListener f19287e0;
    public final le.e f19288e1;
    public u9 f19289f;
    public String f19290f0;
    public final le.b f19291f1;
    public final Object[] f19292g0;
    public int f19293g1;
    public Drawable h;
    public Runnable f19294h0;
    public int f19295h1;
    public boolean f19296i0;
    public boolean f19297i1;
    public Runnable f19298j0;
    public boolean f19299j1;
    public boolean f19300k0;
    public boolean f19301k1;
    public int f19302l0;
    public boolean l1;
    public boolean m0;
    public ai.s f19303m1;
    public final k5[] f19304n;
    public boolean f19305n0;
    public boolean f19306n1;
    public float f19307o0;
    public boolean f19308o1;
    public int f19309p0;
    public int f19310p1;
    public int f19311q0;
    public int f19312q1;
    public k5 f19313r;
    public int f19314r0;
    public boolean f19315r1;
    public k5 f19316s;
    public int f19317s0;
    public float f19318s1;
    public o2 f19319t0;
    public ValueAnimator f19320t1;
    public j f19321u0;
    public View v;
    public int f19322v0;
    public int f19323w;
    public boolean f19324w0;
    public int f19325x;
    public boolean f19326x0;
    public boolean f19327y;
    public boolean f19328y0;
    public boolean f19329z0;

    public k(Context context, f6 f6Var) {
        super(context);
        this.d = a5.f18465a;
        this.f19304n = new k5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f19292g0 = new Object[3];
        this.f19300k0 = true;
        this.f19302l0 = 255;
        this.f19322v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new com.google.firebase.messaging.m(this);
        qr qrVar = qr.h;
        this.f19284c1 = new le.e(0, this, qrVar, 380L);
        this.f19286d1 = new le.b(0, this, qrVar, 380L, false);
        this.f19288e1 = new le.e(0, this, qrVar, 320L);
        this.f19291f1 = new le.b(0, this, qrVar, 320L, false);
        this.f19315r1 = true;
        this.f19318s1 = 1.0f;
        this.J0 = f6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View q(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f19311q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(j6.f0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f19309p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.f0(i10, 1, -1));
        }
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.s();
        }
    }

    public void B(int i10, boolean z10) {
        if (z10) {
            this.f19317s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f19314r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i10);
                } else if (drawable2 instanceof f5) {
                    ((f5) drawable2).f18643j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            a0 a0Var = this.E;
            if (a0Var != null) {
                a0Var.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.T0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f19314r0, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        invalidate();
    }

    public final void E(int i10, boolean z10) {
        a0 a0Var;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i10);
                }
                i11++;
            }
        } else if (!z10 && (a0Var = this.E) != null) {
            int childCount2 = a0Var.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = a0Var.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).B(i10);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z10, boolean z11) {
        a0 a0Var;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (a0Var = this.E) != null) {
            int childCount2 = a0Var.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = a0Var.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).G(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void G(int i10, boolean z10) {
        a0 a0Var;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (a0Var = this.E) != null) {
            a0Var.setPopupItemsSelectorColor(i10);
        }
    }

    public final void H(int i10, boolean z10) {
        a0 a0Var = this.E;
        if (a0Var != null) {
            int childCount = a0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = a0Var.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.G) {
                        if (z10) {
                            w0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            w0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void I(CharSequence charSequence, org.telegram.ui.Components.m5 m5Var) {
        int i10;
        k5[] k5VarArr = this.f19304n;
        if (charSequence != null && k5VarArr[0] == null) {
            p(0);
        }
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            if (charSequence != null && !this.f19305n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            k5Var.setVisibility(i10);
            k5 k5Var2 = k5VarArr[0];
            this.f19283c0 = charSequence;
            k5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f19285d0;
                if (drawable instanceof org.telegram.ui.Components.m5) {
                    ((org.telegram.ui.Components.m5) drawable).l(null);
                }
            }
            k5 k5Var3 = k5VarArr[0];
            this.f19285d0 = m5Var;
            k5Var3.i(m5Var);
            if (this.C0) {
                Drawable drawable2 = this.f19285d0;
                if (drawable2 instanceof org.telegram.ui.Components.m5) {
                    ((org.telegram.ui.Components.m5) drawable2).l(k5VarArr[0]);
                }
            }
            k5VarArr[0].setRightDrawableOnClick(this.f19287e0);
        }
        this.f19328y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        k5[] k5VarArr = this.f19304n;
        if (k5VarArr[0] != null && charSequence != null) {
            if (this.f19324w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f19313r.getVisibility() != 0) {
                    this.f19313r.setVisibility(0);
                    this.f19313r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f19313r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(220L).start();
            }
            k5 k5Var = k5VarArr[1];
            if (k5Var != null) {
                if (k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
            }
            k5VarArr[1] = k5VarArr[0];
            k5VarArr[0] = null;
            setTitle(charSequence);
            this.f19328y0 = z10;
            k5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                k5 k5Var2 = k5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                k5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f19326x0 = true;
            ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
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
            alpha.setDuration(j3).setListener(new g(this, z11, z10, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void K(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        k5 k5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f19280b0 && this.f19319t0.parentLayout != null) {
            Object[] objArr = this.f19292g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Z0) {
                String str3 = this.f19290f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f19290f0 = str;
                        Drawable drawable = null;
                        if (this.f19303m1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f19303m1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f19283c0;
                        }
                        if (str == null) {
                            drawable = this.f19285d0;
                        }
                        com.google.firebase.messaging.m mVar = this.O0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            mVar.x(valueOf, indexOf);
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
                        this.f19296i0 = z11;
                        k5[] k5VarArr = this.f19304n;
                        if ((spannableString == null || k5VarArr[0] != null) && getMeasuredWidth() != 0 && ((k5Var = k5VarArr[0]) == null || k5Var.getVisibility() == 0)) {
                            k5 k5Var2 = k5VarArr[0];
                            if (k5Var2 != null) {
                                k5Var2.animate().cancel();
                                k5 k5Var3 = k5VarArr[1];
                                if (k5Var3 != null) {
                                    k5Var3.animate().cancel();
                                }
                                if (k5VarArr[1] == null) {
                                    p(1);
                                }
                                k5VarArr[1].k(spannableString);
                                k5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                k5VarArr[1].i(drawable);
                                k5VarArr[1].setRightDrawableOnClick(this.f19287e0);
                                if (drawable instanceof org.telegram.ui.Components.m5) {
                                    ((org.telegram.ui.Components.m5) drawable).l(k5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(k5VarArr[1]);
                                }
                                this.Z0 = true;
                                k5 k5Var4 = k5VarArr[1];
                                k5VarArr[1] = k5VarArr[0];
                                k5VarArr[0] = k5Var4;
                                k5Var4.setAlpha(0.0f);
                                k5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = k5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f19308o1) {
                                    f7 = 1.0f - this.f19318s1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
                                if (this.f19313r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f19329z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.R) {
                                k5VarArr[0].invalidate();
                                invalidate();
                            }
                            k5VarArr[0].k(spannableString);
                            k5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            k5VarArr[0].i(drawable);
                            k5VarArr[0].setRightDrawableOnClick(this.f19287e0);
                            if (drawable instanceof org.telegram.ui.Components.m5) {
                                ((org.telegram.ui.Components.m5) drawable).l(k5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(k5VarArr[0]);
                            } else {
                                mVar.s(k5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f19294h0;
                        }
                        this.f19298j0 = runnable;
                    }
                }
            }
        }
    }

    public final void L() {
        this.G0 = true;
        if (this.F0 == null) {
            ai.x5 x5Var = new ai.x5(getContext(), 5);
            this.F0 = x5Var;
            addView(x5Var);
        }
    }

    public final void M(ah.c cVar, dh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        c10.p(AndroidUtilities.dp(6.0f));
        this.f19276a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f19279b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f19282c = c12;
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            k5[] k5VarArr = this.f19304n;
            if (view == k5VarArr[0] || view == k5VarArr[1] || view == this.f19313r || view == this.E || view == this.e || view == this.f19316s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.F != null && !this.J) {
            this.J = true;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.F, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.Q = viewArr;
            if (this.f19323w == 0) {
                if (!this.f19305n0) {
                    k5 k5Var = this.f19304n[0];
                    if (k5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f));
                    }
                    if (this.f19313r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f19313r, property, 0.0f));
                    }
                }
                a0 a0Var = this.E;
                if (a0Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 0.0f));
                }
            }
            int i10 = this.f19323w;
            if (i10 == 0) {
                i10 = this.f19325x;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.V0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 2));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ai.z(10, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.f19311q0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z10;
        if (this.C0 && this.D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != z10) {
            this.E0 = z10;
            com.google.firebase.messaging.m mVar = this.O0;
            if (z10) {
                mVar.f7333a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7335c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7333a = false;
            ((AnimatorSet) mVar.f7335c).cancel();
        }
    }

    public final boolean a(String str) {
        if (this.F != null) {
            String str2 = this.G;
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
        if (this.f19306n1) {
            if (this.f19308o1) {
                ai.x5 x5Var = this.F0;
                if (x5Var != null) {
                    x5Var.setAlpha(1.0f - this.f19318s1);
                } else {
                    k5 k5Var = this.f19304n[0];
                    if (k5Var != null) {
                        k5Var.setAlpha(1.0f - this.f19318s1);
                    }
                }
            }
            float f7 = this.f19318s1;
            int i10 = this.f19312q1;
            f6 f6Var = this.J0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = j6.v0(i10, f6Var);
            }
            int i11 = this.f19310p1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = j6.v0(i11, f6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f19318s1) * 255.0f));
            if (this.L0) {
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
            this.f19329z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) qr.f27383f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        eo eoVar = this.S0;
        if (eoVar == null) {
            return;
        }
        zn znVar = eoVar.e;
        if (znVar != null && znVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.S0.getVisualWidth());
        le.e eVar = this.f19284c1;
        if (z10) {
            if (eVar.f13993g) {
                f7 = eVar.f13992f;
            } else {
                f7 = eVar.e;
            }
            float f10 = min;
            if (f7 != f10) {
                eVar.a(f10);
            }
        } else {
            eVar.c(min);
        }
        this.f19286d1.a(z11, z10);
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View q6 = q(this, f7, f10, this.S0);
            if (q6 == null) {
                q6 = q(this, f7, f10, null);
            }
            ch.d dVar = this.f19276a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.S0) {
                ch.d dVar2 = this.f19279b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f19282c;
                z10 = z13 | ((dVar3 == null || !dVar3.getBounds().contains(x10, y3)) ? false : false);
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

    @Override
    public final void e() {
        b();
        ch.d dVar = this.f19276a;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f19282c;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f19279b;
        if (dVar3 != null) {
            dVar3.v();
        }
        ai.s sVar = this.f19303m1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof h2) && !(drawable instanceof f5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.e.getLayerType() != i10) {
                this.e.setLayerType(i10, null);
                this.e.invalidate();
            }
        }
    }

    public final void g() {
        int i10;
        int i11;
        float f7;
        a0 a0Var = this.E;
        boolean z10 = false;
        if (a0Var != null) {
            i10 = (a0Var.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        int max = Math.max(0, i10);
        d dVar = this.F;
        if (dVar != null) {
            i11 = (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i11 = 0;
        }
        int max2 = Math.max(0, i11);
        AndroidUtilities.dp(46.0f);
        if (this.J) {
            max = max2;
        }
        if (max > 0) {
            z10 = true;
        }
        this.f19291f1.a(z10, this.f19301k1);
        le.e eVar = this.f19288e1;
        if (eVar.f13993g) {
            f7 = eVar.f13992f;
        } else {
            f7 = eVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f19301k1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f19321u0;
    }

    public a0 getActionMode() {
        return this.F;
    }

    public float getActionModeFactor() {
        d dVar = this.F;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f19303m1;
    }

    public k5 getAdditionalSubtitleTextView() {
        return this.f19316s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public a5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f19325x;
    }

    public boolean getCastShadows() {
        return this.f19300k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public u9 getSearchAvatarImageView() {
        return this.f19289f;
    }

    public int getShadowAlpha() {
        return this.f19302l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f19313r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public k5 getSubtitleTextView() {
        return this.f19313r;
    }

    public String getTitle() {
        k5 k5Var = this.f19304n[0];
        if (k5Var == null) {
            return null;
        }
        return k5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        k5 k5Var = this.f19304n[0];
        if (k5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return k5Var.getPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return this.f19304n[0];
    }

    public k5 getTitleTextView2() {
        return this.f19304n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        a0 a0Var;
        if (this.f19305n0 && (a0Var = this.E) != null) {
            a0Var.j(z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final a0 i() {
        return j(null);
    }

    public final a0 j(String str) {
        float f7;
        int i10;
        if (a(str)) {
            return this.F;
        }
        d dVar = this.F;
        if (dVar != null) {
            removeView(dVar);
            this.F = null;
        }
        this.G = str;
        d dVar2 = new d(this, getContext(), this);
        this.F = dVar2;
        if (this.P0) {
            f7 = -AndroidUtilities.dp(10.0f);
        } else {
            f7 = 0.0f;
        }
        dVar2.setTranslationX(f7);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.f18453c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            this.F.setBackgroundColor(j6.v0(j6.f19213w8, this.J0));
        }
        addView(this.F, indexOfChild(this.e));
        d dVar4 = this.F;
        if (this.I) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        dVar4.setPadding(0, i10, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    public final void k() {
        if (this.f19303m1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.J0, this.O0);
            this.f19303m1 = sVar;
            sVar.setClipChildren(false);
            addView(this.f19303m1);
        }
    }

    public final void l() {
        if (this.f19316s != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f19316s = k5Var;
        k5Var.setGravity(3);
        this.f19316s.setVisibility(8);
        this.f19316s.setTextColor(j6.v0(j6.B8, this.J0));
        addView(this.f19316s, 0, w7.x5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.f0(this.f19309p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.x5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final a0 n() {
        a0 a0Var = this.E;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(getContext(), this);
        this.E = a0Var2;
        addView(a0Var2, 0, w7.x5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f19313r != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f19313r = k5Var;
        k5Var.setGravity(3);
        this.f19313r.setVisibility(8);
        this.f19313r.setTextColor(j6.v0(j6.B8, this.J0));
        addView(this.f19313r, 0, w7.x5.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f19323w;
            if (i10 == 0) {
                i10 = this.f19325x;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19285d0;
        if (drawable instanceof org.telegram.ui.Components.m5) {
            ((org.telegram.ui.Components.m5) drawable).l(this.f19304n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f19325x;
            if (i10 != 0 && this.f19323w != 0 && !this.P0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19285d0;
        if (drawable instanceof org.telegram.ui.Components.m5) {
            ((org.telegram.ui.Components.m5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f19296i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = j6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            bw0 bw0Var = this.S;
            k5[] k5VarArr = this.f19304n;
            if (bw0Var == null) {
                this.T = null;
                this.S = new bw0(0);
                k5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f26907c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f26905a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(j6.w0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new o00(obj));
                }
                this.T = obj;
                k5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.I0;
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
    public void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int dp;
        k5[] k5VarArr;
        k5 k5Var;
        int i13;
        int B;
        int i14;
        int i15;
        k5 k5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f10;
        int i18;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        kVar.H = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.F;
        if (dVar != null) {
            if (kVar.I) {
                i18 = AndroidUtilities.statusBarHeight;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.H = false;
        if (kVar.I) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i12 + kVar.O);
        ImageView imageView = kVar.e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
            if (AndroidUtilities.isTablet()) {
                f10 = 80.0f;
            } else {
                f10 = 72.0f;
            }
            dp = AndroidUtilities.dp(f10);
        } else {
            if (AndroidUtilities.isTablet()) {
                f7 = 26.0f;
            } else {
                f7 = 18.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        a0 a0Var = kVar.E;
        if (a0Var != null && a0Var.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f19305n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f19327y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f19305n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = wl.d(f11, size, 1073741824);
                if (!kVar.f19327y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f19327y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            k5VarArr = kVar.f19304n;
            if (i20 >= 2) {
                break;
            }
            k5 k5Var3 = k5VarArr[0];
            if ((k5Var3 != null && k5Var3.getVisibility() != 8) || ((k5Var = kVar.f19313r) != null && k5Var.getVisibility() != 8)) {
                a0 a0Var2 = kVar.E;
                if (a0Var2 != null) {
                    i13 = a0Var2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.H0) {
                    B = size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + i13) + kVar.f19277a0) * 2);
                } else {
                    B = org.telegram.messenger.w1.B(16.0f, size - i13, dp) - kVar.f19277a0;
                }
                int max = Math.max(B, 0);
                boolean z10 = kVar.f19328y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f19324w0 && kVar.f19326x0) {
                    k5 k5Var4 = k5VarArr[i20];
                    if (kVar.P0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    k5Var4.setTextSize(i21);
                } else {
                    k5 k5Var5 = k5VarArr[0];
                    if (k5Var5 != null && k5Var5.getVisibility() != 8 && (k5Var2 = kVar.f19313r) != null && k5Var2.getVisibility() != 8) {
                        k5 k5Var6 = k5VarArr[i20];
                        if (k5Var6 != null) {
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            k5Var6.setTextSize(i21);
                        }
                        k5 k5Var7 = kVar.f19313r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        k5Var7.setTextSize(i16);
                        k5 k5Var8 = kVar.f19316s;
                        if (k5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            k5Var8.setTextSize(i17);
                        }
                    } else {
                        k5 k5Var9 = k5VarArr[i20];
                        if (k5Var9 != null && k5Var9.getVisibility() != 8) {
                            k5 k5Var10 = k5VarArr[i20];
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            k5Var10.setTextSize(i21);
                        }
                        k5 k5Var11 = kVar.f19313r;
                        if (k5Var11 != null && k5Var11.getVisibility() != 8) {
                            k5 k5Var12 = kVar.f19313r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            k5Var12.setTextSize(i15);
                        }
                        k5 k5Var13 = kVar.f19316s;
                        if (k5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            k5Var13.setTextSize(i14);
                        }
                    }
                }
                k5 k5Var14 = k5VarArr[i20];
                if (k5Var14 != null && k5Var14.getVisibility() != 8) {
                    k5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k5VarArr[i20].getPaddingBottom() + k5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f19329z0) {
                        CharSequence text = k5VarArr[i20].getText();
                        k5 k5Var15 = k5VarArr[i20];
                        k5Var15.setPivotX(k5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        k5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        k5VarArr[i20].setPivotX(0.0f);
                        k5VarArr[i20].setPivotY(0.0f);
                    }
                }
                k5 k5Var16 = kVar.f19313r;
                if (k5Var16 != null && k5Var16.getVisibility() != 8) {
                    kVar.f19313r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = kVar.f19303m1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                k5 k5Var17 = kVar.f19316s;
                if (k5Var17 != null && k5Var17.getVisibility() != 8) {
                    kVar.f19316s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        u9 u9Var = kVar.f19289f;
        if (u9Var != null) {
            u9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != kVar.f19303m1 && childAt != kVar.f19313r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f19316s && childAt != kVar.f19289f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i22++;
            kVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.N) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.M) {
            return false;
        }
        return true;
    }

    public final void p(int i10) {
        int i11;
        View[] viewArr = this.f19304n;
        if (viewArr[i10] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        viewArr[i10] = k5Var;
        if (this.H0) {
            i11 = 17;
        } else {
            i11 = 19;
        }
        k5Var.setGravity(i11);
        int i12 = this.f19322v0;
        if (i12 != 0) {
            viewArr[i10].setTextColor(i12);
        } else {
            viewArr[i10].setTextColor(j6.v0(j6.A8, this.J0));
        }
        k5 k5Var2 = viewArr[i10];
        k5Var2.setEmojiColor(k5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, w7.x5.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, w7.x5.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.F;
        if (dVar != null && this.J) {
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).n();
                }
            }
            this.J = false;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.F, property, 0.0f));
            if (this.Q != null) {
                int i11 = 0;
                while (true) {
                    View[] viewArr = this.Q;
                    if (i11 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i11];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q[i11], property, 1.0f));
                    }
                    i11++;
                }
            }
            boolean z10 = this.f19305n0;
            k5[] k5VarArr = this.f19304n;
            if (!z10) {
                k5 k5Var = k5VarArr[0];
                if (k5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 1.0f));
                }
                if (this.f19313r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f19313r, property, 1.0f));
                }
            }
            a0 a0Var = this.E;
            if (a0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 1.0f));
            }
            int i12 = this.f19325x;
            if (i12 != 0 && !this.P0) {
                if (i0.a.f(i12) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.V0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f19305n0) {
                k5 k5Var2 = k5VarArr[0];
                if (k5Var2 != null) {
                    k5Var2.setVisibility(0);
                }
                if (this.f19313r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f19313r.setVisibility(0);
                }
            }
            a0 a0Var2 = this.E;
            if (a0Var2 != null) {
                a0Var2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.f19309p0, 1, -1));
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f19321u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f19323w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, j6.f18807a7, j6.f19140s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.X0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f19280b0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f7;
        if (this.e == null) {
            m();
        }
        ImageView imageView = this.e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof h2) {
            h2 h2Var = (h2) drawable;
            if (s()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h2Var.c(f7, false);
            h2Var.b(this.f19317s0);
            h2Var.a(this.f19314r0);
        } else if (drawable instanceof f5) {
            f5 f5Var = (f5) drawable;
            f5Var.f18644k = this.f19325x;
            f5Var.f18643j = this.f19314r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19314r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.T0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19314r0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.e == null) {
            m();
        }
        ImageView imageView = this.e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.f19314r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f19325x = i10;
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                ((f5) drawable).f18644k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f19300k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19300k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        k5[] k5VarArr;
        int i10;
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        for (k5 k5Var : this.f19304n) {
            if (k5Var != null) {
                if (z10) {
                    i10 = 17;
                } else {
                    i10 = 19;
                }
                k5Var.setGravity(i10);
            }
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(eo eoVar) {
        this.S0 = eoVar;
    }

    public void setClipContent(boolean z10) {
        this.L = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.B0 = z10;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(qv0 qv0Var) {
        this.L0 = true;
        this.K0 = qv0Var;
        qv0Var.T.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.setEnabled(z10);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        this.O = i10;
        d dVar = this.F;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.N = z10;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.f19299j1 = true;
        if (this.f19295h1 != i10) {
            this.f19295h1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f19297i1 = true;
        if (this.f19293g1 != i10) {
            this.f19293g1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        ch.d dVar = this.f19276a;
        if (dVar.f4290l != i10) {
            dVar.setAlpha(i10);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.I0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.f19327y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i10;
        this.I = z10;
        d dVar = this.F;
        if (dVar != null) {
            if (z10) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            dVar.setPadding(0, i10, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.U0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f19324w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f19287e0 = onClickListener;
        k5[] k5VarArr = this.f19304n;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setRightDrawableOnClick(onClickListener);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setRightDrawableOnClick(this.f19287e0);
        }
    }

    public void setSearchAvatarImageView(u9 u9Var) {
        u9 u9Var2 = this.f19289f;
        if (u9Var2 != u9Var) {
            if (u9Var2 != null) {
                removeView(u9Var2);
            }
            this.f19289f = u9Var;
            if (u9Var != null) {
                addView(u9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.f19281b1 != f7) {
            this.f19281b1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(gg.q0 q0Var) {
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.setFilter(q0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f19302l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19302l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f19278a1 != z10) {
            this.f19278a1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f19313r == null) {
            o();
        }
        if (this.f19313r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k5 k5Var = this.f19313r;
            if (!isEmpty && !this.f19305n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k5Var.setVisibility(i10);
            this.f19313r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f19313r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f19313r == null) {
            o();
        }
        this.f19313r.setTextColor(i10);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.R = z10;
        if (z10) {
            this.U = new Paint.FontMetricsInt();
            this.W = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        I(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f19298j0 = runnable;
        this.f19294h0 = runnable;
    }

    public void setTitleColor(int i10) {
        k5[] k5VarArr = this.f19304n;
        if (k5VarArr[0] == null) {
            p(0);
        }
        this.f19322v0 = i10;
        k5VarArr[0].setTextColor(i10);
        k5VarArr[0].setEmojiColor(i10);
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f19277a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f19304n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.F != null && this.J) {
            String str2 = this.G;
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
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f19305n0 = z10;
        g();
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.W0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            k5 k5Var = this.f19304n[0];
            if (k5Var != null) {
                arrayList.add(k5Var);
            }
            if (this.f19313r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f19313r);
                k5 k5Var2 = this.f19313r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                k5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f19307o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 1));
        this.W0.playTogether(ofFloat);
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i11 >= size) {
                break;
            }
            View view = (View) arrayList.get(i11);
            float f15 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.W0;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.W0;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.W0;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        u9 u9Var = this.f19289f;
        if (u9Var != null) {
            u9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.W0;
            u9 u9Var2 = this.f19289f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(u9Var2, property, f10));
        }
        this.f19329z0 = true;
        requestLayout();
        this.W0.addListener(new f(this, arrayList, z10, u10));
        this.W0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                f5 f5Var = (f5) drawable;
                f5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                f5Var.a(f14, true);
            }
        }
    }

    public final void w() {
        h5 h5Var;
        a0 a0Var = this.E;
        int childCount = a0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = a0Var.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.G && (h5Var = w0Var.H) != null) {
                    h5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        a0 a0Var = this.E;
        if (a0Var != null && str != null) {
            boolean z10 = this.f19305n0;
            boolean z11 = !z10;
            int childCount = a0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = a0Var.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.G) {
                        if (!z10) {
                            a0Var.f18452b.v(w0Var.L(z11));
                        }
                        w0Var.H(str, false);
                        w0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f19310p1 = i10;
        this.f19312q1 = i11;
        m4.g0 g0Var = new m4.g0(21, this, recyclerView);
        recyclerView.j(new ai.r(g0Var, 13));
        this.f19308o1 = z10;
        if (this.f19306n1) {
            g0Var.run();
            return;
        }
        this.f19306n1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f19315r1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f19318s1 = f7;
        b();
    }

    public final void z(ml0 ml0Var, boolean z10) {
        y(ml0Var, z10, j6.f18807a7, j6.f19140s8);
    }

    public void setAdaptiveBackground(ao0 ao0Var) {
        int i10 = j6.f18807a7;
        int i11 = j6.f19140s8;
        this.f19310p1 = i10;
        this.f19312q1 = i11;
        b();
        m4.g0 g0Var = new m4.g0(20, this, ao0Var);
        ao0Var.f22454f.add(g0Var);
        if (this.f19306n1) {
            g0Var.run();
            return;
        }
        this.f19306n1 = true;
        boolean canScrollVertically = ao0Var.canScrollVertically(-1);
        this.f19315r1 = !canScrollVertically;
        this.f19318s1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
