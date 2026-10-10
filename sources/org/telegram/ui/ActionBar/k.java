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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.y9;
import org.telegram.ui.nz0;
public class k extends FrameLayout implements me.d, z5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public ai.x5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final e6 I0;
    public boolean J;
    public tw0 J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public final Paint L0;
    public boolean M;
    public final Rect M0;
    public boolean N;
    public final com.google.firebase.messaging.m N0;
    public int O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public uo R0;
    public ex0 S;
    public boolean S0;
    public g10 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public nz0 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public ch.d f21259a;
    public int f21260a0;
    public float f21261a1;
    public ch.d f21262b;
    public boolean f21263b0;
    public final me.e f21264b1;
    public ch.d f21265c;
    public CharSequence f21266c0;
    public final me.b f21267c1;
    public final y4 d;
    public Drawable f21268d0;
    public final me.e f21269d1;
    public ImageView f21270e;
    public View.OnClickListener f21271e0;
    public final me.b f21272e1;
    public y9 f21273f;
    public String f21274f0;
    public int f21275f1;
    public final Object[] f21276g0;
    public int f21277g1;
    public Drawable h;
    public Runnable f21278h0;
    public boolean f21279h1;
    public boolean f21280i0;
    public boolean f21281i1;
    public Runnable f21282j0;
    public boolean f21283j1;
    public boolean f21284k0;
    public boolean f21285k1;
    public int f21286l0;
    public boolean l1;
    public boolean m0;
    public ai.s f21287m1;
    public final j5[] f21288n;
    public boolean f21289n0;
    public boolean f21290n1;
    public float f21291o0;
    public boolean f21292o1;
    public int f21293p0;
    public int f21294p1;
    public int f21295q0;
    public int f21296q1;
    public j5 f21297r;
    public int f21298r0;
    public boolean f21299r1;
    public j5 f21300s;
    public int f21301s0;
    public float f21302s1;
    public n2 f21303t0;
    public ValueAnimator f21304t1;
    public j f21305u0;
    public View v;
    public int f21306v0;
    public int f21307w;
    public boolean f21308w0;
    public int f21309x;
    public boolean f21310x0;
    public boolean f21311y;
    public boolean f21312y0;
    public boolean f21313z0;

    public k(Context context, e6 e6Var) {
        super(context);
        this.d = y4.f21732a;
        this.f21288n = new j5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f21276g0 = new Object[3];
        this.f21284k0 = true;
        this.f21286l0 = 255;
        this.f21306v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new com.google.firebase.messaging.m(this);
        is isVar = is.h;
        this.f21264b1 = new me.e(0, this, isVar, 380L);
        this.f21267c1 = new me.b(0, this, isVar, 380L, false);
        this.f21269d1 = new me.e(0, this, isVar, 320L);
        this.f21272e1 = new me.b(0, this, isVar, 320L, false);
        this.l1 = true;
        this.f21299r1 = true;
        this.f21302s1 = 1.0f;
        this.I0 = e6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View r(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void B(rm0 rm0Var, boolean z10) {
        z(rm0Var, z10, i6.f20745a7, i6.f21079s8);
    }

    public final void C(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f21295q0 = i10;
            if (this.J && (imageView = this.f21270e) != null) {
                imageView.setBackgroundDrawable(i6.g0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f21293p0 = i10;
        ImageView imageView2 = this.f21270e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(i6.g0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void D(int i10, boolean z10) {
        if (z10) {
            this.f21301s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f21270e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f21270e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f21298r0 = i10;
            ImageView imageView2 = this.f21270e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof g2) {
                    ((g2) drawable2).a(i10);
                } else if (drawable2 instanceof e5) {
                    ((e5) drawable2).f20568j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f21270e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f21270e;
        if (imageView3 != null && this.S0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f21298r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void E(int i10, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).B(i10);
                }
                i11++;
            }
        } else if (!z10 && (zVar = this.E) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof v0) {
                    ((v0) childAt2).B(i10);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).G(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (zVar = this.E) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof v0) {
                    ((v0) childAt2).G(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void G(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (zVar = this.E) != null) {
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void H(int i10, boolean z10) {
        z zVar = this.E;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.G) {
                        if (z10) {
                            v0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            v0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void I(CharSequence charSequence, org.telegram.ui.Components.q5 q5Var) {
        int i10;
        j5[] j5VarArr = this.f21288n;
        if (charSequence != null && j5VarArr[0] == null) {
            q(0);
        }
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            if (charSequence != null && !this.f21289n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            j5Var.setVisibility(i10);
            j5 j5Var2 = j5VarArr[0];
            this.f21266c0 = charSequence;
            j5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f21268d0;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).l(null);
                }
            }
            j5 j5Var3 = j5VarArr[0];
            this.f21268d0 = q5Var;
            j5Var3.i(q5Var);
            if (this.C0) {
                Drawable drawable2 = this.f21268d0;
                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable2).l(j5VarArr[0]);
                }
            }
            j5VarArr[0].setRightDrawableOnClick(this.f21271e0);
        }
        this.f21312y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        j5[] j5VarArr = this.f21288n;
        if (j5VarArr[0] != null && charSequence != null) {
            if (this.f21308w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f21297r.getVisibility() != 0) {
                    this.f21297r.setVisibility(0);
                    this.f21297r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f21297r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                bi.s(animate, f7, 220L);
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
            this.f21312y0 = z10;
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
            this.f21310x0 = true;
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

    public final void K(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        j5 j5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f21263b0 && this.f21303t0.parentLayout != null) {
            Object[] objArr = this.f21276g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f21274f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f21274f0 = str;
                        Drawable drawable = null;
                        if (this.f21287m1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f21287m1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f21266c0;
                        }
                        if (str == null) {
                            drawable = this.f21268d0;
                        }
                        com.google.firebase.messaging.m mVar = this.N0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            mVar.A(valueOf, indexOf);
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
                        this.f21280i0 = z11;
                        j5[] j5VarArr = this.f21288n;
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
                                j5VarArr[1].setRightDrawableOnClick(this.f21271e0);
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).l(j5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(j5VarArr[1]);
                                }
                                this.Y0 = true;
                                j5 j5Var4 = j5VarArr[1];
                                j5VarArr[1] = j5VarArr[0];
                                j5VarArr[0] = j5Var4;
                                j5Var4.setAlpha(0.0f);
                                j5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = j5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f21292o1) {
                                    f7 = 1.0f - this.f21302s1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
                                if (this.f21297r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f21313z0 = true;
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
                            j5VarArr[0].setRightDrawableOnClick(this.f21271e0);
                            if (drawable instanceof org.telegram.ui.Components.q5) {
                                ((org.telegram.ui.Components.q5) drawable).l(j5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(j5VarArr[0]);
                            } else {
                                mVar.v(j5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f21278h0;
                        }
                        this.f21282j0 = runnable;
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
        this.O0 = true;
        this.Q0 = z10;
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        c10.p(AndroidUtilities.dp(6.0f));
        this.f21259a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f21262b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f21265c = c12;
        z zVar = this.E;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            j5[] j5VarArr = this.f21288n;
            if (view == j5VarArr[0] || view == j5VarArr[1] || view == this.f21297r || view == this.E || view == this.f21270e || view == this.f21300s || view == this.F0) {
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
            if (this.f21307w == 0) {
                if (!this.f21289n0) {
                    j5 j5Var = this.f21288n[0];
                    if (j5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f));
                    }
                    if (this.f21297r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f21297r, property, 0.0f));
                    }
                }
                z zVar = this.E;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f21307w;
            if (i10 == 0) {
                i10 = this.f21309x;
            }
            if (i10 != 0 && !this.O0) {
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
            if (this.U0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 3));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ai.z(10, this, zArr));
            this.P.start();
            ImageView imageView = this.f21270e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(1.0f, true);
                }
                this.f21270e.setBackgroundDrawable(i6.g0(this.f21295q0, 1, -1));
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
            com.google.firebase.messaging.m mVar = this.N0;
            if (z10) {
                mVar.f7951a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7953c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7951a = false;
            ((AnimatorSet) mVar.f7953c).cancel();
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
        int w02;
        int w03;
        if (this.f21290n1) {
            if (this.f21292o1) {
                ai.x5 x5Var = this.F0;
                if (x5Var != null) {
                    x5Var.setAlpha(1.0f - this.f21302s1);
                } else {
                    j5 j5Var = this.f21288n[0];
                    if (j5Var != null) {
                        j5Var.setAlpha(1.0f - this.f21302s1);
                    }
                }
            }
            float f7 = this.f21302s1;
            int i10 = this.f21296q1;
            e6 e6Var = this.I0;
            if (i10 == -1) {
                w02 = 0;
            } else {
                w02 = i6.w0(i10, e6Var);
            }
            int i11 = this.f21294p1;
            if (i11 == -1) {
                w03 = 0;
            } else {
                w03 = i6.w0(i11, e6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.k(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.k(w03, 0);
            }
            setBackgroundColor(i0.a.d(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - this.f21302s1) * 255.0f));
            if (this.K0) {
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
            this.f21313z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) is.f27443f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        uo uoVar = this.R0;
        if (uoVar == null) {
            return;
        }
        qo qoVar = uoVar.f31593e;
        if (qoVar != null && qoVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        me.e eVar = this.f21264b1;
        if (z10) {
            if (eVar.f16351g) {
                f7 = eVar.f16350f;
            } else {
                f7 = eVar.f16349e;
            }
            float f10 = min;
            if (f7 != f10) {
                eVar.a(f10);
            }
        } else {
            eVar.c(min);
        }
        this.f21267c1.a(z11, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        uo uoVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f21279h1) {
            i10 = this.f21275f1;
        } else {
            i10 = (int) this.f21269d1.f16349e;
        }
        if (this.f21281i1) {
            i10 = Math.max((int) ((1.0f - this.f21261a1) * this.f21277g1), i10);
        }
        ImageView imageView = this.f21270e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i16 = dp * 2;
        int i17 = height + dp2 + i16;
        ch.d dVar = this.f21259a;
        me.b bVar = this.f21272e1;
        if (dVar != null && !this.P0 && this.l1) {
            if (this.f21279h1 || this.f21281i1) {
                f7 = 1.0f;
                if (i10 > 0) {
                    i14 = dp;
                } else {
                    i14 = 0;
                }
            } else {
                f7 = 1.0f;
                i14 = (int) (dp * bVar.f16341e);
            }
            int i18 = i14 + i10;
            int i19 = dp + dp2;
            int max = Math.max(i18, i19);
            i11 = 2;
            uo uoVar2 = this.R0;
            me.b bVar2 = this.f21267c1;
            float f11 = 0.0f;
            if (uoVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = f7 - bVar2.f16341e;
            }
            int lerp = AndroidUtilities.lerp(i18, max, f10);
            if (z10) {
                i15 = i19;
            } else {
                i15 = 0;
            }
            if (this.R0 != null) {
                f11 = f7 - bVar2.f16341e;
            }
            int lerp2 = AndroidUtilities.lerp(i15, i19, f11);
            int width = getWidth() - lerp;
            int i20 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i20, ((int) this.f21264b1.f16349e) + i16), i20, Math.max(this.f21261a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((uoVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f21259a.setBounds(lerp2, height, width, i17);
            this.f21259a.draw(canvas);
        } else {
            f7 = 1.0f;
            i11 = 2;
        }
        ch.d dVar2 = this.f21262b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i16, i17);
            this.f21262b.draw(canvas);
        }
        ch.d dVar3 = this.f21265c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f21285k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i16, height, getWidth(), i17);
            ch.d dVar4 = this.f21265c;
            if (this.f21279h1) {
                i13 = 255;
            } else {
                i13 = (int) (bVar.f16341e * 255.0f);
            }
            dVar4.setAlpha(i13);
            this.f21265c.draw(canvas);
        }
        if (this.K0 && this.f21309x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i21 = this.f21309x;
            Paint paint = this.L0;
            paint.setColor(i21);
            if (this.f21290n1) {
                tw0 tw0Var = this.J0;
                float y3 = getY();
                float f12 = f7 - this.f21302s1;
                tw0Var.getClass();
                if (tw0.F() && SharedConfig.getDevicePerformanceClass() == i11) {
                    i12 = i6.xf;
                } else {
                    i12 = i6.f21193yf;
                }
                tw0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(i6.w0(i12, tw0Var.getResourceProvider())), f12));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f21283j1 = true;
        if (this.Z0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.R0 != null && this.O0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View r10 = r(this, f7, f10, this.R0);
            if (r10 == null) {
                r10 = r(this, f7, f10, null);
            }
            ch.d dVar = this.f21259a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r10 != null && r10 != this.R0) {
                ch.d dVar2 = this.f21262b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f21265c;
                if (dVar3 == null || !dVar3.getBounds().contains(x10, y3)) {
                    z12 = false;
                }
                z10 = z13 | z12;
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
        ch.d dVar = this.f21259a;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f21265c;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f21262b;
        if (dVar3 != null) {
            dVar3.v();
        }
        ai.s sVar = this.f21287m1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof g2) && !(drawable instanceof e5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.f21270e.getLayerType() != i10) {
                this.f21270e.setLayerType(i10, null);
                this.f21270e.invalidate();
            }
        }
    }

    public final void g() {
        int i10;
        int i11;
        float f7;
        z zVar = this.E;
        boolean z10 = false;
        if (zVar != null) {
            i10 = (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
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
        this.f21272e1.a(z10, this.f21283j1);
        me.e eVar = this.f21269d1;
        if (eVar.f16351g) {
            f7 = eVar.f16350f;
        } else {
            f7 = eVar.f16349e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f21283j1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f21305u0;
    }

    public z getActionMode() {
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
        return this.f21287m1;
    }

    public j5 getAdditionalSubtitleTextView() {
        return this.f21300s;
    }

    public ImageView getBackButton() {
        return this.f21270e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public y4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f21309x;
    }

    public boolean getCastShadows() {
        return this.f21284k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public y9 getSearchAvatarImageView() {
        return this.f21273f;
    }

    public int getShadowAlpha() {
        return this.f21286l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f21297r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public j5 getSubtitleTextView() {
        return this.f21297r;
    }

    public String getTitle() {
        j5 j5Var = this.f21288n[0];
        if (j5Var == null) {
            return null;
        }
        return j5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        j5 j5Var = this.f21288n[0];
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
        return this.f21288n[0];
    }

    public j5 getTitleTextView2() {
        return this.f21288n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        z zVar;
        if (this.f21289n0 && (zVar = this.E) != null) {
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
        if (this.O0) {
            f7 = -AndroidUtilities.dp(10.0f);
        } else {
            f7 = 0.0f;
        }
        dVar2.setTranslationX(f7);
        this.F.setGlassMode(this.O0);
        d dVar3 = this.F;
        dVar3.f21739c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(i6.w0(i6.f21152w8, this.I0));
        }
        addView(this.F, indexOfChild(this.f21270e));
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
        if (this.f21287m1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.I0, this.N0);
            this.f21287m1 = sVar;
            sVar.setClipChildren(false);
            addView(this.f21287m1);
        }
    }

    public final void l() {
        if (this.f21300s != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f21300s = j5Var;
        j5Var.setGravity(3);
        this.f21300s.setVisibility(8);
        this.f21300s.setTextColor(i6.w0(i6.B8, this.I0));
        addView(this.f21300s, 0, w7.x5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f21270e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f21270e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f21270e.setBackgroundDrawable(i6.g0(this.f21293p0, 1, -1));
        this.f21270e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f21270e, w7.x5.e(54, 54, 51));
        this.f21270e.setOnClickListener(new b(this, 1));
        this.f21270e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        invalidate();
    }

    public final z o() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, w7.x5.e(-2, -1, 5));
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f21307w;
            if (i10 == 0) {
                i10 = this.f21309x;
            }
            if (i10 != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21268d0;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(this.f21288n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f21309x;
            if (i10 != 0 && this.f21307w != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21268d0;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z02;
        if (this.R && !this.f21280i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (z02 = i6.z0()) != null && z02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            ex0 ex0Var = this.S;
            j5[] j5VarArr = this.f21288n;
            if (ex0Var == null) {
                this.T = null;
                this.S = new ex0(0);
                j5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f26572c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f26570a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(i6.x0(null, i6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new f10(obj));
                }
                this.T = obj;
                j5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.H0;
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
        j5[] j5VarArr;
        j5 j5Var;
        int i13;
        int i14;
        int i15;
        int i16;
        j5 j5Var2;
        int i17;
        int i18;
        int makeMeasureSpec;
        float f10;
        int i19;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i20 = 1;
        kVar.H = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.F;
        if (dVar != null) {
            if (kVar.I) {
                i19 = AndroidUtilities.statusBarHeight;
            } else {
                i19 = 0;
            }
            dVar.setPadding(0, i19, 0, 0);
        }
        kVar.H = false;
        if (kVar.I) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i12 + kVar.O);
        ImageView imageView = kVar.f21270e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f21270e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
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
        z zVar = kVar.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f21289n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f21311y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f21289n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = bi.c(f11, size, 1073741824);
                if (!kVar.f21311y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f21311y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i21 = 0;
        while (true) {
            j5VarArr = kVar.f21288n;
            if (i21 >= 2) {
                break;
            }
            j5 j5Var3 = j5VarArr[0];
            if ((j5Var3 != null && j5Var3.getVisibility() != 8) || ((j5Var = kVar.f21297r) != null && j5Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                if (zVar2 != null) {
                    i14 = zVar2.getMeasuredWidth();
                } else {
                    i14 = 0;
                }
                int max = Math.max(org.telegram.messenger.q.B(16.0f, size - i14, dp) - kVar.f21260a0, 0);
                boolean z10 = kVar.f21312y0;
                int i22 = 20;
                if (((z10 && i21 == 0) || (!z10 && i21 == i20)) && kVar.f21308w0 && kVar.f21310x0) {
                    j5 j5Var4 = j5VarArr[i21];
                    i13 = i20;
                    if (kVar.O0) {
                        i22 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i22 = 18;
                    }
                    j5Var4.setTextSize(i22);
                } else {
                    i13 = i20;
                    j5 j5Var5 = j5VarArr[0];
                    if (j5Var5 != null && j5Var5.getVisibility() != 8 && (j5Var2 = kVar.f21297r) != null && j5Var2.getVisibility() != 8) {
                        j5 j5Var6 = j5VarArr[i21];
                        if (j5Var6 != null) {
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i22 = 18;
                            }
                            j5Var6.setTextSize(i22);
                        }
                        j5 j5Var7 = kVar.f21297r;
                        if (AndroidUtilities.isTablet()) {
                            i17 = 16;
                        } else {
                            i17 = 14;
                        }
                        j5Var7.setTextSize(i17);
                        j5 j5Var8 = kVar.f21300s;
                        if (j5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i18 = 16;
                            } else {
                                i18 = 14;
                            }
                            j5Var8.setTextSize(i18);
                        }
                    } else {
                        j5 j5Var9 = j5VarArr[i21];
                        if (j5Var9 != null && j5Var9.getVisibility() != 8) {
                            j5 j5Var10 = j5VarArr[i21];
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i22 = 18;
                            }
                            j5Var10.setTextSize(i22);
                        }
                        j5 j5Var11 = kVar.f21297r;
                        if (j5Var11 != null && j5Var11.getVisibility() != 8) {
                            j5 j5Var12 = kVar.f21297r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i16 = 14;
                            } else {
                                i16 = 16;
                            }
                            j5Var12.setTextSize(i16);
                        }
                        j5 j5Var13 = kVar.f21300s;
                        if (j5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            j5Var13.setTextSize(i15);
                        }
                    }
                }
                j5 j5Var14 = j5VarArr[i21];
                if (j5Var14 != null && j5Var14.getVisibility() != 8) {
                    j5VarArr[i21].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j5VarArr[i21].getPaddingBottom() + j5VarArr[i21].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f21313z0) {
                        CharSequence text = j5VarArr[i21].getText();
                        j5 j5Var15 = j5VarArr[i21];
                        j5Var15.setPivotX(j5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        j5VarArr[i21].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        j5VarArr[i21].setPivotX(0.0f);
                        j5VarArr[i21].setPivotY(0.0f);
                    }
                }
                j5 j5Var16 = kVar.f21297r;
                if (j5Var16 != null && j5Var16.getVisibility() != 8) {
                    kVar.f21297r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = kVar.f21287m1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                j5 j5Var17 = kVar.f21300s;
                if (j5Var17 != null && j5Var17.getVisibility() != 8) {
                    kVar.f21300s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i13 = i20;
            }
            i21++;
            i20 = i13;
        }
        int i23 = i20;
        y9 y9Var = kVar.f21273f;
        if (y9Var != null) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = kVar.getChildAt(i24);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[i23] && childAt != kVar.f21287m1 && childAt != kVar.f21297r && childAt != kVar.E && childAt != kVar.f21270e && childAt != kVar.f21300s && childAt != kVar.f21273f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i24++;
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

    public final void p() {
        if (this.f21297r != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f21297r = j5Var;
        j5Var.setGravity(3);
        this.f21297r.setVisibility(8);
        this.f21297r.setTextColor(i6.w0(i6.B8, this.I0));
        addView(this.f21297r, 0, w7.x5.e(-2, -2, 51));
    }

    public final void q(int i10) {
        View[] viewArr = this.f21288n;
        if (viewArr[i10] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        viewArr[i10] = j5Var;
        j5Var.setGravity(19);
        int i11 = this.f21306v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(i6.w0(i6.A8, this.I0));
        }
        j5 j5Var2 = viewArr[i10];
        j5Var2.setEmojiColor(j5Var2.getTextColor());
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
                if (childAt instanceof v0) {
                    ((v0) childAt).n();
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
            boolean z10 = this.f21289n0;
            j5[] j5VarArr = this.f21288n;
            if (!z10) {
                j5 j5Var = j5VarArr[0];
                if (j5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 1.0f));
                }
                if (this.f21297r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f21297r, property, 1.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f21309x;
            if (i12 != 0 && !this.O0) {
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
            if (this.U0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f21289n0) {
                j5 j5Var2 = j5VarArr[0];
                if (j5Var2 != null) {
                    j5Var2.setVisibility(0);
                }
                if (this.f21297r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f21297r.setVisibility(0);
                }
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.f21270e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(0.0f, true);
                }
                this.f21270e.setBackgroundDrawable(i6.g0(this.f21293p0, 1, -1));
            }
        }
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f21305u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f21307w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        z(recyclerView, false, i6.f20745a7, i6.f21079s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f21263b0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f7;
        if (this.f21270e == null) {
            m();
        }
        ImageView imageView = this.f21270e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f21270e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof g2) {
            g2 g2Var = (g2) drawable;
            if (t()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g2Var.c(f7, false);
            g2Var.b(this.f21301s0);
            g2Var.a(this.f21298r0);
        } else if (drawable instanceof e5) {
            e5 e5Var = (e5) drawable;
            e5Var.f20569k = this.f21309x;
            e5Var.f20568j = this.f21298r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f21270e.setColorFilter(new PorterDuffColorFilter(this.f21298r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.f21270e.setColorFilter(new PorterDuffColorFilter(this.f21298r0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.f21270e == null) {
            m();
        }
        ImageView imageView = this.f21270e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.f21270e.setImageResource(i10);
        this.f21270e.setColorFilter(new PorterDuffColorFilter(this.f21298r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f21309x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof e5) {
                ((e5) drawable).f20569k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f21284k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21284k0 = z10;
    }

    public void setChatAvatarContainer(uo uoVar) {
        this.R0 = uoVar;
    }

    public void setClipContent(boolean z10) {
        this.L = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.B0 = z10;
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(tw0 tw0Var) {
        this.K0 = true;
        this.J0 = tw0Var;
        tw0Var.T.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.l1 != z10) {
            this.l1 = z10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f21270e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.setEnabled(z10);
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
        this.f21281i1 = true;
        if (this.f21277g1 != i10) {
            this.f21277g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f21279h1 = true;
        if (this.f21275f1 != i10) {
            this.f21275f1 = i10;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.H0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.f21311y = z10;
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
        this.T0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f21308w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f21271e0 = onClickListener;
        j5[] j5VarArr = this.f21288n;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setRightDrawableOnClick(onClickListener);
        }
        j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setRightDrawableOnClick(this.f21271e0);
        }
    }

    public void setSearchAvatarImageView(y9 y9Var) {
        y9 y9Var2 = this.f21273f;
        if (y9Var2 != y9Var) {
            if (y9Var2 != null) {
                removeView(y9Var2);
            }
            this.f21273f = y9Var;
            if (y9Var != null) {
                addView(y9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.f21261a1 != f7) {
            this.f21261a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(gg.p0 p0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(p0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f21286l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21286l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f21297r == null) {
            p();
        }
        if (this.f21297r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            j5 j5Var = this.f21297r;
            if (!isEmpty && !this.f21289n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            j5Var.setVisibility(i10);
            this.f21297r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f21297r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f21297r == null) {
            p();
        }
        this.f21297r.setTextColor(i10);
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
        this.f21282j0 = runnable;
        this.f21278h0 = runnable;
    }

    public void setTitleColor(int i10) {
        j5[] j5VarArr = this.f21288n;
        if (j5VarArr[0] == null) {
            q(0);
        }
        this.f21306v0 = i10;
        j5VarArr[0].setTextColor(i10);
        j5VarArr[0].setEmojiColor(i10);
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f21260a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f21288n[0].setScrollNonFitText(z10);
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
        this.f21289n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean v = v();
        if (!v) {
            j5 j5Var = this.f21288n[0];
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (this.f21297r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f21297r);
                j5 j5Var2 = this.f21297r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                j5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f21291o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 2));
        this.V0.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.V0;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.V0;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.V0;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        y9 y9Var = this.f21273f;
        if (y9Var != null) {
            y9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            y9 y9Var2 = this.f21273f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(y9Var2, property, f10));
        }
        this.f21313z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, v));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.f21270e;
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
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.G && (g5Var = v0Var.H) != null) {
                    g5Var.p(v0Var.f21588e);
                }
            }
        }
    }

    public final void y(String str) {
        z zVar = this.E;
        if (zVar != null && str != null) {
            boolean z10 = this.f21289n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.G) {
                        if (!z10) {
                            zVar.f21738b.w(v0Var.L(z11));
                        }
                        v0Var.H(str, false);
                        v0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void z(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f21294p1 = i10;
        this.f21296q1 = i11;
        ki.i0 i0Var = new ki.i0(28, this, recyclerView);
        recyclerView.j(new ai.r(i0Var, 12));
        this.f21292o1 = z10;
        if (this.f21290n1) {
            i0Var.run();
            return;
        }
        this.f21290n1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f21299r1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f21302s1 = f7;
        b();
    }

    public void setAdaptiveBackground(fp0 fp0Var) {
        int i10 = i6.f20745a7;
        int i11 = i6.f21079s8;
        this.f21294p1 = i10;
        this.f21296q1 = i11;
        b();
        ki.i0 i0Var = new ki.i0(27, this, fp0Var);
        fp0Var.f26488f.add(i0Var);
        if (this.f21290n1) {
            i0Var.run();
            return;
        }
        this.f21290n1 = true;
        boolean canScrollVertically = fp0Var.canScrollVertically(-1);
        this.f21299r1 = !canScrollVertically;
        this.f21302s1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
