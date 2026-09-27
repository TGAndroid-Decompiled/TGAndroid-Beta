package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
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
import org.telegram.messenger.qk;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.xz0;
public class l extends FrameLayout implements le.e, z5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public a0 E;
    public boolean E0;
    public d F;
    public ai.w5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final e6 K0;
    public boolean L;
    public cw0 L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public int O;
    public final Rect O0;
    public AnimatorSet P;
    public final com.google.firebase.messaging.m P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public nw0 S;
    public boolean S0;
    public r00 T;
    public go T0;
    public Paint.FontMetricsInt U;
    public boolean U0;
    public boolean V;
    public boolean V0;
    public Rect W;
    public Runnable W0;
    public xz0 X0;
    public AnimatorSet Y0;
    public int Z0;
    public ch.d f19541a;
    public int f19542a0;
    public int f19543a1;
    public ch.d f19544b;
    public boolean f19545b0;
    public boolean f19546b1;
    public ch.d f19547c;
    public CharSequence f19548c0;
    public boolean f19549c1;
    public final z4 d;
    public Drawable f19550d0;
    public float f19551d1;
    public ImageView e;
    public View.OnClickListener f19552e0;
    public final le.f f19553e1;
    public w9 f19554f;
    public String f19555f0;
    public final le.c f19556f1;
    public final Object[] f19557g0;
    public final le.f f19558g1;
    public Drawable h;
    public Runnable f19559h0;
    public final le.c f19560h1;
    public boolean f19561i0;
    public int f19562i1;
    public Runnable f19563j0;
    public int f19564j1;
    public boolean f19565k0;
    public boolean f19566k1;
    public int f19567l0;
    public boolean l1;
    public boolean m0;
    public boolean f19568m1;
    public final j5[] f19569n;
    public boolean f19570n0;
    public boolean f19571n1;
    public float f19572o0;
    public Path f19573o1;
    public int f19574p0;
    public int f19575p1;
    public int f19576q0;
    public ai.s f19577q1;
    public j5 f19578r;
    public int f19579r0;
    public boolean f19580r1;
    public j5 f19581s;
    public int f19582s0;
    public boolean f19583s1;
    public o2 f19584t0;
    public int f19585t1;
    public j f19586u0;
    public int f19587u1;
    public View v;
    public int f19588v0;
    public boolean f19589v1;
    public int f19590w;
    public boolean f19591w0;
    public float f19592w1;
    public int f19593x;
    public boolean f19594x0;
    public ValueAnimator f19595x1;
    public boolean f19596y;
    public boolean f19597y0;
    public boolean f19598z0;

    public l(Context context, e6 e6Var) {
        super(context);
        this.d = z4.f19974a;
        this.f19569n = new j5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f19557g0 = new Object[3];
        this.f19565k0 = true;
        this.f19567l0 = 255;
        this.f19588v0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new com.google.firebase.messaging.m(this);
        sr srVar = sr.h;
        this.f19553e1 = new le.f(0, this, srVar, 380L);
        this.f19556f1 = new le.c(0, this, srVar, 380L, false);
        this.f19558g1 = new le.f(0, this, srVar, 320L);
        this.f19560h1 = new le.c(0, this, srVar, 320L, false);
        this.f19575p1 = 255;
        this.f19589v1 = true;
        this.f19592w1 = 1.0f;
        this.K0 = e6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View r(l lVar, float f7, float f10, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(yl0 yl0Var, boolean z10) {
        z(yl0Var, z10, i6.f19001a7, i6.f19337s8);
    }

    public final void B(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f19576q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(i6.f0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f19574p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(i6.f0(i10, 1, -1));
        }
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.s();
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        invalidate();
    }

    public void E(int i10, boolean z10) {
        if (z10) {
            this.f19582s0 = i10;
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
            this.f19579r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i10);
                } else if (drawable2 instanceof e5) {
                    ((e5) drawable2).f18834j = i10;
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
        if (imageView3 != null && this.V0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f19579r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void F(int i10, boolean z10) {
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

    public final void G(int i10, boolean z10, boolean z11) {
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

    public final void H(int i10, boolean z10) {
        a0 a0Var;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (a0Var = this.E) != null) {
            a0Var.setPopupItemsSelectorColor(i10);
        }
    }

    public final void I(int i10, boolean z10) {
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

    public final void J(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        int i10;
        j5[] j5VarArr = this.f19569n;
        if (charSequence != null && j5VarArr[0] == null) {
            q(0);
        }
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            if (charSequence != null && !this.f19570n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            j5Var.setVisibility(i10);
            j5 j5Var2 = j5VarArr[0];
            this.f19548c0 = charSequence;
            j5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f19550d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            j5 j5Var3 = j5VarArr[0];
            this.f19550d0 = o5Var;
            j5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.f19550d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(j5VarArr[0]);
                }
            }
            j5VarArr[0].setRightDrawableOnClick(this.f19552e0);
        }
        this.f19597y0 = false;
    }

    public final void K(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        j5[] j5VarArr = this.f19569n;
        if (j5VarArr[0] != null && charSequence != null) {
            if (this.f19591w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f19578r.getVisibility() != 0) {
                    this.f19578r.setVisibility(0);
                    this.f19578r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f19578r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                qk.r(animate, f7, 220L);
            }
            j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                if (j5Var.getParent() != null) {
                    ((ViewGroup) j5VarArr[1].getParent()).removeView(j5VarArr[1]);
                }
                j5VarArr[1] = null;
            }
            j5VarArr[1] = j5VarArr[0];
            j5VarArr[0] = null;
            setTitle(charSequence);
            this.f19597y0 = z10;
            j5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                j5 j5Var2 = j5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                j5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = j5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f19594x0 = true;
            ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
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

    public final void L(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        j5 j5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f19545b0 && this.f19584t0.parentLayout != null) {
            Object[] objArr = this.f19557g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.f19546b1) {
                String str3 = this.f19555f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f19555f0 = str;
                        Drawable drawable = null;
                        if (this.f19577q1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f19577q1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f19548c0;
                        }
                        if (str == null) {
                            drawable = this.f19550d0;
                        }
                        com.google.firebase.messaging.m mVar = this.P0;
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
                        this.f19561i0 = z11;
                        j5[] j5VarArr = this.f19569n;
                        if ((spannableString == null || j5VarArr[0] != null) && getMeasuredWidth() != 0 && ((j5Var = j5VarArr[0]) == null || j5Var.getVisibility() == 0)) {
                            j5 j5Var2 = j5VarArr[0];
                            if (j5Var2 != null) {
                                j5Var2.animate().cancel();
                                j5 j5Var3 = j5VarArr[1];
                                if (j5Var3 != null) {
                                    j5Var3.animate().cancel();
                                }
                                if (j5VarArr[1] == null) {
                                    q(1);
                                }
                                j5VarArr[1].k(spannableString);
                                j5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                j5VarArr[1].i(drawable);
                                j5VarArr[1].setRightDrawableOnClick(this.f19552e0);
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).l(j5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(j5VarArr[1]);
                                }
                                this.f19546b1 = true;
                                j5 j5Var4 = j5VarArr[1];
                                j5VarArr[1] = j5VarArr[0];
                                j5VarArr[0] = j5Var4;
                                j5Var4.setAlpha(0.0f);
                                j5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = j5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f19583s1) {
                                    f7 = 1.0f - this.f19592w1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
                                if (this.f19578r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f19598z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            q(0);
                            if (this.R) {
                                j5VarArr[0].invalidate();
                                invalidate();
                            }
                            j5VarArr[0].k(spannableString);
                            j5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            j5VarArr[0].i(drawable);
                            j5VarArr[0].setRightDrawableOnClick(this.f19552e0);
                            if (drawable instanceof org.telegram.ui.Components.o5) {
                                ((org.telegram.ui.Components.o5) drawable).l(j5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(j5VarArr[0]);
                            } else {
                                mVar.s(j5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f19559h0;
                        }
                        this.f19563j0 = runnable;
                    }
                }
            }
        }
    }

    public final void M() {
        this.G0 = true;
        if (this.F0 == null) {
            ai.w5 w5Var = new ai.w5(getContext(), 5);
            this.F0 = w5Var;
            addView(w5Var);
        }
    }

    public final void N(ah.c cVar, dh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z10;
        ch.d c10 = cVar.c(this, null, false);
        c10.u(eVar);
        c10.v(AndroidUtilities.dp(6.0f));
        this.f19541a = c10;
        if (z10) {
            c10.x(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.w(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.u(eVar);
        c11.w(AndroidUtilities.dp(23.0f));
        c11.v(AndroidUtilities.dp(6.0f));
        this.f19544b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.u(eVar);
        c12.w(AndroidUtilities.dp(23.0f));
        c12.v(AndroidUtilities.dp(6.0f));
        this.f19547c = c12;
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

    public boolean O(View view) {
        if (this.L) {
            j5[] j5VarArr = this.f19569n;
            if (view == j5VarArr[0] || view == j5VarArr[1] || view == this.f19578r || view == this.E || view == this.e || view == this.f19581s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void P(View[] viewArr, boolean[] zArr) {
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
            if (this.f19590w == 0) {
                if (!this.f19570n0) {
                    j5 j5Var = this.f19569n[0];
                    if (j5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f));
                    }
                    if (this.f19578r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f19578r, property, 0.0f));
                    }
                }
                a0 a0Var = this.E;
                if (a0Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 0.0f));
                }
            }
            int i10 = this.f19590w;
            if (i10 == 0) {
                i10 = this.f19593x;
            }
            if (i10 != 0 && !this.Q0) {
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
            if (this.X0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 3));
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
                this.e.setBackgroundDrawable(i6.f0(this.f19576q0, 1, -1));
            }
        }
    }

    public final void Q() {
        boolean z10;
        if (this.C0 && this.D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != z10) {
            this.E0 = z10;
            com.google.firebase.messaging.m mVar = this.P0;
            if (z10) {
                mVar.f7317a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7319c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7317a = false;
            ((AnimatorSet) mVar.f7319c).cancel();
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
        if (this.f19580r1) {
            if (this.f19583s1) {
                ai.w5 w5Var = this.F0;
                if (w5Var != null) {
                    w5Var.setAlpha(1.0f - this.f19592w1);
                } else {
                    j5 j5Var = this.f19569n[0];
                    if (j5Var != null) {
                        j5Var.setAlpha(1.0f - this.f19592w1);
                    }
                }
            }
            float f7 = this.f19592w1;
            int i10 = this.f19587u1;
            e6 e6Var = this.K0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = i6.v0(i10, e6Var);
            }
            int i11 = this.f19585t1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = i6.v0(i11, e6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f19592w1) * 255.0f));
            if (this.M0) {
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
            this.f19598z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) sr.f28359f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        go goVar = this.T0;
        if (goVar == null) {
            return;
        }
        bo boVar = goVar.e;
        if (boVar != null && boVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.T0.getVisualWidth());
        le.f fVar = this.f19553e1;
        if (z10) {
            if (fVar.f14211g) {
                f7 = fVar.f14210f;
            } else {
                f7 = fVar.e;
            }
            float f10 = min;
            if (f7 != f10) {
                fVar.a(f10);
            }
        } else {
            fVar.c(min);
        }
        this.f19556f1.a(z11, z10);
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View r10 = r(this, f7, f10, this.T0);
            if (r10 == null) {
                r10 = r(this, f7, f10, null);
            }
            ch.d dVar = this.f19541a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r10 != null && r10 != this.T0) {
                ch.d dVar2 = this.f19544b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f19547c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        b();
        ch.d dVar = this.f19541a;
        if (dVar != null) {
            dVar.g();
        }
        ch.d dVar2 = this.f19547c;
        if (dVar2 != null) {
            dVar2.g();
        }
        ch.d dVar3 = this.f19544b;
        if (dVar3 != null) {
            dVar3.g();
        }
        ai.s sVar = this.f19577q1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof h2) && !(drawable instanceof e5)) {
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
        this.f19560h1.a(z10, this.f19568m1);
        le.f fVar = this.f19558g1;
        if (fVar.f14211g) {
            f7 = fVar.f14210f;
        } else {
            f7 = fVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f19568m1) {
                fVar.a(f10);
            } else {
                fVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f19586u0;
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
        return this.f19577q1;
    }

    public j5 getAdditionalSubtitleTextView() {
        return this.f19581s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public z4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f19593x;
    }

    public boolean getCastShadows() {
        return this.f19565k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
        return this.f19554f;
    }

    public int getShadowAlpha() {
        return this.f19567l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f19578r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public j5 getSubtitleTextView() {
        return this.f19578r;
    }

    public String getTitle() {
        j5 j5Var = this.f19569n[0];
        if (j5Var == null) {
            return null;
        }
        return j5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        j5 j5Var = this.f19569n[0];
        if (j5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return j5Var.getPaint().getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return this.f19569n[0];
    }

    public j5 getTitleTextView2() {
        return this.f19569n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h() {
        i(true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void i(boolean z10) {
        a0 a0Var;
        if (this.f19570n0 && (a0Var = this.E) != null) {
            a0Var.j(z10);
        }
    }

    public final a0 j() {
        return k(null);
    }

    public final a0 k(String str) {
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
        if (this.Q0) {
            f7 = -AndroidUtilities.dp(10.0f);
        } else {
            f7 = 0.0f;
        }
        dVar2.setTranslationX(f7);
        this.F.setGlassMode(this.Q0);
        d dVar3 = this.F;
        dVar3.f18661c = true;
        dVar3.setClickable(true);
        if (!this.Q0) {
            this.F.setBackgroundColor(i6.v0(i6.f19410w8, this.K0));
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

    public final void l() {
        if (this.f19577q1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.K0, this.P0);
            this.f19577q1 = sVar;
            sVar.setClipChildren(false);
            addView(this.f19577q1);
        }
    }

    public final void m() {
        if (this.f19581s != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f19581s = j5Var;
        j5Var.setGravity(3);
        this.f19581s.setVisibility(8);
        this.f19581s.setTextColor(i6.v0(i6.B8, this.K0));
        addView(this.f19581s, 0, w7.y5.e(-2, -2, 51));
    }

    public final void n() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(i6.f0(this.f19574p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.y5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final a0 o() {
        a0 a0Var = this.E;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(getContext(), this);
        this.E = a0Var2;
        addView(a0Var2, 0, w7.y5.e(-2, -1, 5));
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        Q();
        if (this.J) {
            int i10 = this.f19590w;
            if (i10 == 0) {
                i10 = this.f19593x;
            }
            if (i10 != 0 && !this.Q0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19550d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(this.f19569n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        Q();
        if (this.J) {
            int i10 = this.f19593x;
            if (i10 != 0 && this.f19590w != 0 && !this.Q0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19550d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f19561i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = i6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            nw0 nw0Var = this.S;
            j5[] j5VarArr = this.f19569n;
            if (nw0Var == null) {
                this.T = null;
                this.S = new nw0(0);
                j5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f27864c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f27862a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(i6.w0(null, i6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new q00(obj));
                }
                this.T = obj;
                j5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.J0;
        if ((onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int dp;
        j5[] j5VarArr;
        j5 j5Var;
        int i13;
        int B;
        int i14;
        int i15;
        j5 j5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f10;
        int i18;
        l lVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        lVar.H = true;
        View view = lVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = lVar.F;
        if (dVar != null) {
            if (lVar.I) {
                i18 = AndroidUtilities.statusBarHeight;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        lVar.H = false;
        if (lVar.I) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        lVar.setMeasuredDimension(size, currentActionBarHeight + i12 + lVar.O);
        ImageView imageView = lVar.e;
        if (imageView != null && imageView.getVisibility() != 8) {
            lVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
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
        a0 a0Var = lVar.E;
        if (a0Var != null && a0Var.getVisibility() != 8) {
            float f11 = 66.0f;
            if (lVar.E.p() && !lVar.f19570n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = lVar.E.l();
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!lVar.f19596y) {
                    lVar.E.r(-l4);
                }
            } else if (lVar.f19570n0) {
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = qk.c(f11, size, 1073741824);
                if (!lVar.f19596y) {
                    lVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!lVar.f19596y) {
                    lVar.E.r(0.0f);
                }
            }
            lVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            j5VarArr = lVar.f19569n;
            if (i20 >= 2) {
                break;
            }
            j5 j5Var3 = j5VarArr[0];
            if ((j5Var3 != null && j5Var3.getVisibility() != 8) || ((j5Var = lVar.f19578r) != null && j5Var.getVisibility() != 8)) {
                a0 a0Var2 = lVar.E;
                if (a0Var2 != null) {
                    i13 = a0Var2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (lVar.H0) {
                    B = size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + i13) + lVar.f19542a0) * 2);
                } else {
                    B = org.telegram.messenger.l0.B(16.0f, size - i13, dp) - lVar.f19542a0;
                }
                int max = Math.max(B, 0);
                boolean z10 = lVar.f19597y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && lVar.f19591w0 && lVar.f19594x0) {
                    j5 j5Var4 = j5VarArr[i20];
                    if (lVar.Q0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    j5Var4.setTextSize(i21);
                } else {
                    j5 j5Var5 = j5VarArr[0];
                    if (j5Var5 != null && j5Var5.getVisibility() != 8 && (j5Var2 = lVar.f19578r) != null && j5Var2.getVisibility() != 8) {
                        j5 j5Var6 = j5VarArr[i20];
                        if (j5Var6 != null) {
                            if (lVar.Q0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            j5Var6.setTextSize(i21);
                        }
                        j5 j5Var7 = lVar.f19578r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        j5Var7.setTextSize(i16);
                        j5 j5Var8 = lVar.f19581s;
                        if (j5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            j5Var8.setTextSize(i17);
                        }
                    } else {
                        j5 j5Var9 = j5VarArr[i20];
                        if (j5Var9 != null && j5Var9.getVisibility() != 8) {
                            j5 j5Var10 = j5VarArr[i20];
                            if (lVar.Q0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            j5Var10.setTextSize(i21);
                        }
                        j5 j5Var11 = lVar.f19578r;
                        if (j5Var11 != null && j5Var11.getVisibility() != 8) {
                            j5 j5Var12 = lVar.f19578r;
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            j5Var12.setTextSize(i15);
                        }
                        j5 j5Var13 = lVar.f19581s;
                        if (j5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            j5Var13.setTextSize(i14);
                        }
                    }
                }
                j5 j5Var14 = j5VarArr[i20];
                if (j5Var14 != null && j5Var14.getVisibility() != 8) {
                    j5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j5VarArr[i20].getPaddingBottom() + j5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (lVar.f19598z0) {
                        CharSequence text = j5VarArr[i20].getText();
                        j5 j5Var15 = j5VarArr[i20];
                        j5Var15.setPivotX(j5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        j5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        j5VarArr[i20].setPivotX(0.0f);
                        j5VarArr[i20].setPivotY(0.0f);
                    }
                }
                j5 j5Var16 = lVar.f19578r;
                if (j5Var16 != null && j5Var16.getVisibility() != 8) {
                    lVar.f19578r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = lVar.f19577q1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                j5 j5Var17 = lVar.f19581s;
                if (j5Var17 != null && j5Var17.getVisibility() != 8) {
                    lVar.f19581s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        w9 w9Var = lVar.f19554f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = lVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = lVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != lVar.f19577q1 && childAt != lVar.f19578r && childAt != lVar.E && childAt != lVar.e && childAt != lVar.f19581s && childAt != lVar.f19554f) {
                lVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), 1073741824), 0);
            }
            i22++;
            lVar = this;
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

    public final void p() {
        if (this.f19578r != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f19578r = j5Var;
        j5Var.setGravity(3);
        this.f19578r.setVisibility(8);
        this.f19578r.setTextColor(i6.v0(i6.B8, this.K0));
        addView(this.f19578r, 0, w7.y5.e(-2, -2, 51));
    }

    public final void q(int i10) {
        int i11;
        View[] viewArr = this.f19569n;
        if (viewArr[i10] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        viewArr[i10] = j5Var;
        if (this.H0) {
            i11 = 17;
        } else {
            i11 = 19;
        }
        j5Var.setGravity(i11);
        int i12 = this.f19588v0;
        if (i12 != 0) {
            viewArr[i10].setTextColor(i12);
        } else {
            viewArr[i10].setTextColor(i6.v0(i6.A8, this.K0));
        }
        j5 j5Var2 = viewArr[i10];
        j5Var2.setEmojiColor(j5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, w7.y5.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, w7.y5.e(-2, -2, 51));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void s() {
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
            boolean z10 = this.f19570n0;
            j5[] j5VarArr = this.f19569n;
            if (!z10) {
                j5 j5Var = j5VarArr[0];
                if (j5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 1.0f));
                }
                if (this.f19578r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f19578r, property, 1.0f));
                }
            }
            a0 a0Var = this.E;
            if (a0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 1.0f));
            }
            int i12 = this.f19593x;
            if (i12 != 0 && !this.Q0) {
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
            if (this.X0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f19570n0) {
                j5 j5Var2 = j5VarArr[0];
                if (j5Var2 != null) {
                    j5Var2.setVisibility(0);
                }
                if (this.f19578r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f19578r.setVisibility(0);
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
                this.e.setBackgroundDrawable(i6.f0(this.f19574p0, 1, -1));
            }
        }
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f19586u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f19590w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        z(recyclerView, false, i6.f19001a7, i6.f19337s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.Z0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f19545b0 = z10;
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
            n();
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
            if (t()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h2Var.c(f7, false);
            h2Var.b(this.f19582s0);
            h2Var.a(this.f19579r0);
        } else if (drawable instanceof e5) {
            e5 e5Var = (e5) drawable;
            e5Var.f18835k = this.f19593x;
            e5Var.f18834j = this.f19579r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19579r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.V0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19579r0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.e == null) {
            n();
        }
        ImageView imageView = this.e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.f19579r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f19593x = i10;
        if (!this.M0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof e5) {
                ((e5) drawable).f18835k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f19565k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19565k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        j5[] j5VarArr;
        int i10;
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        for (j5 j5Var : this.f19569n) {
            if (j5Var != null) {
                if (z10) {
                    i10 = 17;
                } else {
                    i10 = 19;
                }
                j5Var.setGravity(i10);
            }
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(go goVar) {
        this.T0 = goVar;
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

    public void setDrawBlurBackground(cw0 cw0Var) {
        this.M0 = true;
        this.L0 = cw0Var;
        cw0Var.T.add(this);
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
        this.l1 = true;
        if (this.f19564j1 != i10) {
            this.f19564j1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f19566k1 = true;
        if (this.f19562i1 != i10) {
            this.f19562i1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.f19575p1 != i10) {
            this.f19575p1 = i10;
            invalidate();
        }
        ch.d dVar = this.f19541a;
        if (dVar != null && dVar.f4284l != i10) {
            dVar.setAlpha(i10);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.f19596y = z10;
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
        this.W0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f19591w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f19552e0 = onClickListener;
        j5[] j5VarArr = this.f19569n;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setRightDrawableOnClick(onClickListener);
        }
        j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setRightDrawableOnClick(this.f19552e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f19554f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f19554f = w9Var;
            if (w9Var != null) {
                addView(w9Var);
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
        if (this.f19551d1 != f7) {
            this.f19551d1 = f7;
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
        if (this.f19567l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19567l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f19549c1 != z10) {
            this.f19549c1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f19578r == null) {
            p();
        }
        if (this.f19578r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            j5 j5Var = this.f19578r;
            if (!isEmpty && !this.f19570n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            j5Var.setVisibility(i10);
            this.f19578r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f19578r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f19578r == null) {
            p();
        }
        this.f19578r.setTextColor(i10);
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
        J(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f19563j0 = runnable;
        this.f19559h0 = runnable;
    }

    public void setTitleColor(int i10) {
        j5[] j5VarArr = this.f19569n;
        if (j5VarArr[0] == null) {
            q(0);
        }
        this.f19588v0 = i10;
        j5VarArr[0].setTextColor(i10);
        j5VarArr[0].setEmojiColor(i10);
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f19542a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f19569n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public final boolean t() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean u(String str) {
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

    public boolean v() {
        return false;
    }

    public void w(boolean z10) {
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f19570n0 = z10;
        g();
        AnimatorSet animatorSet = this.Y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Y0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean v = v();
        if (!v) {
            j5 j5Var = this.f19569n[0];
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (this.f19578r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f19578r);
                j5 j5Var2 = this.f19578r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                j5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f19572o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 2));
        this.Y0.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.Y0;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.Y0;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.Y0;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        w9 w9Var = this.f19554f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.Y0;
            w9 w9Var2 = this.f19554f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f19598z0 = true;
        requestLayout();
        this.Y0.addListener(new f(this, arrayList, z10, v));
        this.Y0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof e5) {
                e5 e5Var = (e5) drawable;
                e5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                e5Var.a(f14, true);
            }
        }
    }

    public final void x() {
        g5 g5Var;
        a0 a0Var = this.E;
        int childCount = a0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = a0Var.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.G && (g5Var = w0Var.H) != null) {
                    g5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void y(String str) {
        a0 a0Var = this.E;
        if (a0Var != null && str != null) {
            boolean z10 = this.f19570n0;
            boolean z11 = !z10;
            int childCount = a0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = a0Var.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.G) {
                        if (!z10) {
                            a0Var.f18660b.w(w0Var.L(z11));
                        }
                        w0Var.H(str, false);
                        w0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void z(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f19585t1 = i10;
        this.f19587u1 = i11;
        ki.h0 h0Var = new ki.h0(24, this, recyclerView);
        recyclerView.j(new ai.r(h0Var, 12));
        this.f19583s1 = z10;
        if (this.f19580r1) {
            h0Var.run();
            return;
        }
        this.f19580r1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f19589v1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f19592w1 = f7;
        b();
    }

    public void setAdaptiveBackground(no0 no0Var) {
        int i10 = i6.f19001a7;
        int i11 = i6.f19337s8;
        this.f19585t1 = i10;
        this.f19587u1 = i11;
        b();
        ki.h0 h0Var = new ki.h0(23, this, no0Var);
        no0Var.f26875f.add(h0Var);
        if (this.f19580r1) {
            h0Var.run();
            return;
        }
        this.f19580r1 = true;
        boolean canScrollVertically = no0Var.canScrollVertically(-1);
        this.f19589v1 = !canScrollVertically;
        this.f19592w1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
