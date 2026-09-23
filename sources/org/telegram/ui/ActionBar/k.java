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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.xz0;
public class k extends FrameLayout implements le.e, y5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public ai.w5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final d6 I0;
    public boolean J;
    public pv0 J0;
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
    public fo R0;
    public aw0 S;
    public boolean S0;
    public q00 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public xz0 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public ch.d f19267a;
    public int f19268a0;
    public float f19269a1;
    public ch.d f19270b;
    public boolean f19271b0;
    public final le.f f19272b1;
    public ch.d f19273c;
    public CharSequence f19274c0;
    public final le.c f19275c1;
    public final y4 d;
    public Drawable f19276d0;
    public final le.f f19277d1;
    public ImageView e;
    public View.OnClickListener f19278e0;
    public final le.c f19279e1;
    public w9 f19280f;
    public String f19281f0;
    public int f19282f1;
    public final Object[] f19283g0;
    public int f19284g1;
    public Drawable h;
    public Runnable f19285h0;
    public boolean f19286h1;
    public boolean f19287i0;
    public boolean f19288i1;
    public Runnable f19289j0;
    public boolean f19290j1;
    public boolean f19291k0;
    public boolean f19292k1;
    public int f19293l0;
    public ai.s l1;
    public boolean m0;
    public boolean f19294m1;
    public final i5[] f19295n;
    public boolean f19296n0;
    public boolean f19297n1;
    public float f19298o0;
    public int f19299o1;
    public int f19300p0;
    public int f19301p1;
    public int f19302q0;
    public boolean f19303q1;
    public i5 f19304r;
    public int f19305r0;
    public float f19306r1;
    public i5 f19307s;
    public int f19308s0;
    public ValueAnimator f19309s1;
    public n2 f19310t0;
    public j f19311u0;
    public View v;
    public int f19312v0;
    public int f19313w;
    public boolean f19314w0;
    public int f19315x;
    public boolean f19316x0;
    public boolean f19317y;
    public boolean f19318y0;
    public boolean f19319z0;

    public k(Context context, d6 d6Var) {
        super(context);
        this.d = y4.f19697a;
        this.f19295n = new i5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f19283g0 = new Object[3];
        this.f19291k0 = true;
        this.f19293l0 = 255;
        this.f19312v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new com.google.firebase.messaging.m(this);
        rr rrVar = rr.h;
        this.f19272b1 = new le.f(0, this, rrVar, 380L);
        this.f19275c1 = new le.c(0, this, rrVar, 380L, false);
        this.f19277d1 = new le.f(0, this, rrVar, 320L);
        this.f19279e1 = new le.c(0, this, rrVar, 320L, false);
        this.f19303q1 = true;
        this.f19306r1 = 1.0f;
        this.I0 = d6Var;
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
            this.f19302q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(h6.f0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f19300p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(h6.f0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void B(int i10, boolean z10) {
        if (z10) {
            this.f19308s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f19305r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof g2) {
                    ((g2) drawable2).a(i10);
                } else if (drawable2 instanceof d5) {
                    ((d5) drawable2).f18565j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.S0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f19305r0, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        invalidate();
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

    public final void I(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        int i10;
        i5[] i5VarArr = this.f19295n;
        if (charSequence != null && i5VarArr[0] == null) {
            p(0);
        }
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            if (charSequence != null && !this.f19296n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            i5Var.setVisibility(i10);
            i5 i5Var2 = i5VarArr[0];
            this.f19274c0 = charSequence;
            i5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f19276d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            i5 i5Var3 = i5VarArr[0];
            this.f19276d0 = o5Var;
            i5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.f19276d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(i5VarArr[0]);
                }
            }
            i5VarArr[0].setRightDrawableOnClick(this.f19278e0);
        }
        this.f19318y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        i5[] i5VarArr = this.f19295n;
        if (i5VarArr[0] != null && charSequence != null) {
            if (this.f19314w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f19304r.getVisibility() != 0) {
                    this.f19304r.setVisibility(0);
                    this.f19304r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f19304r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(220L).start();
            }
            i5 i5Var = i5VarArr[1];
            if (i5Var != null) {
                if (i5Var.getParent() != null) {
                    ((ViewGroup) i5VarArr[1].getParent()).removeView(i5VarArr[1]);
                }
                i5VarArr[1] = null;
            }
            i5VarArr[1] = i5VarArr[0];
            i5VarArr[0] = null;
            setTitle(charSequence);
            this.f19318y0 = z10;
            i5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                i5 i5Var2 = i5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                i5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = i5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f19316x0 = true;
            ViewPropertyAnimator alpha = i5VarArr[1].animate().alpha(0.0f);
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
        i5 i5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f19271b0 && this.f19310t0.parentLayout != null) {
            Object[] objArr = this.f19283g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f19281f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f19281f0 = str;
                        Drawable drawable = null;
                        if (this.l1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.l1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f19274c0;
                        }
                        if (str == null) {
                            drawable = this.f19276d0;
                        }
                        com.google.firebase.messaging.m mVar = this.N0;
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
                        this.f19287i0 = z11;
                        i5[] i5VarArr = this.f19295n;
                        if ((spannableString == null || i5VarArr[0] != null) && getMeasuredWidth() != 0 && ((i5Var = i5VarArr[0]) == null || i5Var.getVisibility() == 0)) {
                            i5 i5Var2 = i5VarArr[0];
                            if (i5Var2 != null) {
                                i5Var2.animate().cancel();
                                i5 i5Var3 = i5VarArr[1];
                                if (i5Var3 != null) {
                                    i5Var3.animate().cancel();
                                }
                                if (i5VarArr[1] == null) {
                                    p(1);
                                }
                                i5VarArr[1].k(spannableString);
                                i5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                i5VarArr[1].i(drawable);
                                i5VarArr[1].setRightDrawableOnClick(this.f19278e0);
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).l(i5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(i5VarArr[1]);
                                }
                                this.Y0 = true;
                                i5 i5Var4 = i5VarArr[1];
                                i5VarArr[1] = i5VarArr[0];
                                i5VarArr[0] = i5Var4;
                                i5Var4.setAlpha(0.0f);
                                i5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = i5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f19297n1) {
                                    f7 = 1.0f - this.f19306r1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = i5VarArr[1].animate().alpha(0.0f);
                                if (this.f19304r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f19319z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.R) {
                                i5VarArr[0].invalidate();
                                invalidate();
                            }
                            i5VarArr[0].k(spannableString);
                            i5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            i5VarArr[0].i(drawable);
                            i5VarArr[0].setRightDrawableOnClick(this.f19278e0);
                            if (drawable instanceof org.telegram.ui.Components.o5) {
                                ((org.telegram.ui.Components.o5) drawable).l(i5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(i5VarArr[0]);
                            } else {
                                mVar.s(i5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f19285h0;
                        }
                        this.f19289j0 = runnable;
                    }
                }
            }
        }
    }

    public final void L() {
        this.G0 = true;
        if (this.F0 == null) {
            ai.w5 w5Var = new ai.w5(getContext(), 5);
            this.F0 = w5Var;
            addView(w5Var);
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
        this.f19267a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f19270b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f19273c = c12;
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
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            i5[] i5VarArr = this.f19295n;
            if (view == i5VarArr[0] || view == i5VarArr[1] || view == this.f19304r || view == this.E || view == this.e || view == this.f19307s || view == this.F0) {
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
            if (this.f19313w == 0) {
                if (!this.f19296n0) {
                    i5 i5Var = this.f19295n[0];
                    if (i5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(i5Var, property, 0.0f));
                    }
                    if (this.f19304r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f19304r, property, 0.0f));
                    }
                }
                z zVar = this.E;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f19313w;
            if (i10 == 0) {
                i10 = this.f19315x;
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
                ofFloat.addUpdateListener(new a(this, 2));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ai.z(10, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(h6.f0(this.f19302q0, 1, -1));
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
                mVar.f7316a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7318c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7316a = false;
            ((AnimatorSet) mVar.f7318c).cancel();
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
        if (this.f19294m1) {
            if (this.f19297n1) {
                ai.w5 w5Var = this.F0;
                if (w5Var != null) {
                    w5Var.setAlpha(1.0f - this.f19306r1);
                } else {
                    i5 i5Var = this.f19295n[0];
                    if (i5Var != null) {
                        i5Var.setAlpha(1.0f - this.f19306r1);
                    }
                }
            }
            float f7 = this.f19306r1;
            int i10 = this.f19301p1;
            d6 d6Var = this.I0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = h6.v0(i10, d6Var);
            }
            int i11 = this.f19299o1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = h6.v0(i11, d6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f19306r1) * 255.0f));
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
            this.f19319z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) rr.f27701f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        fo foVar = this.R0;
        if (foVar == null) {
            return;
        }
        ao aoVar = foVar.e;
        if (aoVar != null && aoVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        le.f fVar = this.f19272b1;
        if (z10) {
            if (fVar.f13971g) {
                f7 = fVar.f13970f;
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
        this.f19275c1.a(z11, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        float f11;
        fo foVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f19286h1) {
            i10 = this.f19282f1;
        } else {
            i10 = (int) this.f19277d1.e;
        }
        if (this.f19288i1) {
            i10 = Math.max((int) ((1.0f - this.f19269a1) * this.f19284g1), i10);
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i15 = dp * 2;
        int i16 = height + dp2 + i15;
        ch.d dVar = this.f19267a;
        le.c cVar = this.f19279e1;
        if (dVar != null && !this.P0) {
            if (this.f19286h1 || this.f19288i1) {
                f7 = 1.0f;
                if (i10 > 0) {
                    i13 = dp;
                } else {
                    i13 = 0;
                }
            } else {
                f7 = 1.0f;
                i13 = (int) (dp * cVar.e);
            }
            int i17 = i13 + i10;
            int i18 = dp + dp2;
            int max = Math.max(i17, i18);
            fo foVar2 = this.R0;
            le.c cVar2 = this.f19275c1;
            if (foVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = f7 - cVar2.e;
            }
            int lerp = AndroidUtilities.lerp(i17, max, f10);
            if (z10) {
                i14 = i18;
            } else {
                i14 = 0;
            }
            if (this.R0 == null) {
                f11 = 0.0f;
            } else {
                f11 = f7 - cVar2.e;
            }
            int lerp2 = AndroidUtilities.lerp(i14, i18, f11);
            int width = getWidth() - lerp;
            int i19 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.f19272b1.e) + i15), i19, Math.max(this.f19269a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((foVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f19267a.setBounds(lerp2, height, width, i16);
            this.f19267a.draw(canvas);
        } else {
            f7 = 1.0f;
        }
        ch.d dVar2 = this.f19270b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i15, i16);
            this.f19270b.draw(canvas);
        }
        ch.d dVar3 = this.f19273c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f19292k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            ch.d dVar4 = this.f19273c;
            if (this.f19286h1) {
                i12 = 255;
            } else {
                i12 = (int) (cVar.e * 255.0f);
            }
            dVar4.setAlpha(i12);
            this.f19273c.draw(canvas);
        }
        if (this.K0 && this.f19315x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f19315x;
            Paint paint = this.L0;
            paint.setColor(i20);
            if (this.f19294m1) {
                pv0 pv0Var = this.J0;
                float y3 = getY();
                float f12 = f7 - this.f19306r1;
                pv0Var.getClass();
                if (pv0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = h6.f19161xf;
                } else {
                    i11 = h6.f19179yf;
                }
                pv0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(h6.v0(i11, pv0Var.getResourceProvider())), f12));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f19290j1 = true;
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
            View q6 = q(this, f7, f10, this.R0);
            if (q6 == null) {
                q6 = q(this, f7, f10, null);
            }
            ch.d dVar = this.f19267a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.R0) {
                ch.d dVar2 = this.f19270b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f19273c;
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
        ch.d dVar = this.f19267a;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f19273c;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f19270b;
        if (dVar3 != null) {
            dVar3.v();
        }
        ai.s sVar = this.l1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof g2) && !(drawable instanceof d5)) {
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
        this.f19279e1.a(z10, this.f19290j1);
        le.f fVar = this.f19277d1;
        if (fVar.f13971g) {
            f7 = fVar.f13970f;
        } else {
            f7 = fVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f19290j1) {
                fVar.a(f10);
            } else {
                fVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f19311u0;
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
        return this.l1;
    }

    public i5 getAdditionalSubtitleTextView() {
        return this.f19307s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public y4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f19315x;
    }

    public boolean getCastShadows() {
        return this.f19291k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
        return this.f19280f;
    }

    public int getShadowAlpha() {
        return this.f19293l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f19304r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public i5 getSubtitleTextView() {
        return this.f19304r;
    }

    public String getTitle() {
        i5 i5Var = this.f19295n[0];
        if (i5Var == null) {
            return null;
        }
        return i5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        i5 i5Var = this.f19295n[0];
        if (i5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return i5Var.getPaint().getFontMetricsInt();
    }

    public i5 getTitleTextView() {
        return this.f19295n[0];
    }

    public i5 getTitleTextView2() {
        return this.f19295n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        z zVar;
        if (this.f19296n0 && (zVar = this.E) != null) {
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
        dVar3.f19702c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(h6.v0(h6.f19138w8, this.I0));
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
        if (this.l1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.I0, this.N0);
            this.l1 = sVar;
            sVar.setClipChildren(false);
            addView(this.l1);
        }
    }

    public final void l() {
        if (this.f19307s != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.f19307s = i5Var;
        i5Var.setGravity(3);
        this.f19307s.setVisibility(8);
        this.f19307s.setTextColor(h6.v0(h6.B8, this.I0));
        addView(this.f19307s, 0, w7.x5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(h6.f0(this.f19300p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.x5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, w7.x5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f19304r != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.f19304r = i5Var;
        i5Var.setGravity(3);
        this.f19304r.setVisibility(8);
        this.f19304r.setTextColor(h6.v0(h6.B8, this.I0));
        addView(this.f19304r, 0, w7.x5.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f19313w;
            if (i10 == 0) {
                i10 = this.f19315x;
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
        Drawable drawable = this.f19276d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(this.f19295n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f19315x;
            if (i10 != 0 && this.f19313w != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19276d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f19287i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = h6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            aw0 aw0Var = this.S;
            i5[] i5VarArr = this.f19295n;
            if (aw0Var == null) {
                this.T = null;
                this.S = new aw0(0);
                i5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f27199c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f27197a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(h6.w0(null, h6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new p00(obj));
                }
                this.T = obj;
                i5VarArr[0].invalidate();
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
        i5[] i5VarArr;
        i5 i5Var;
        int i13;
        int i14;
        int i15;
        i5 i5Var2;
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
        z zVar = kVar.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f19296n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f19317y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f19296n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = ul.d(f11, size, 1073741824);
                if (!kVar.f19317y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f19317y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            i5VarArr = kVar.f19295n;
            if (i20 >= 2) {
                break;
            }
            i5 i5Var3 = i5VarArr[0];
            if ((i5Var3 != null && i5Var3.getVisibility() != 8) || ((i5Var = kVar.f19304r) != null && i5Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.z0.B(16.0f, size - i13, dp) - kVar.f19268a0, 0);
                boolean z10 = kVar.f19318y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f19314w0 && kVar.f19316x0) {
                    i5 i5Var4 = i5VarArr[i20];
                    if (kVar.O0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    i5Var4.setTextSize(i21);
                } else {
                    i5 i5Var5 = i5VarArr[0];
                    if (i5Var5 != null && i5Var5.getVisibility() != 8 && (i5Var2 = kVar.f19304r) != null && i5Var2.getVisibility() != 8) {
                        i5 i5Var6 = i5VarArr[i20];
                        if (i5Var6 != null) {
                            if (kVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            i5Var6.setTextSize(i21);
                        }
                        i5 i5Var7 = kVar.f19304r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        i5Var7.setTextSize(i16);
                        i5 i5Var8 = kVar.f19307s;
                        if (i5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            i5Var8.setTextSize(i17);
                        }
                    } else {
                        i5 i5Var9 = i5VarArr[i20];
                        if (i5Var9 != null && i5Var9.getVisibility() != 8) {
                            i5 i5Var10 = i5VarArr[i20];
                            if (kVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            i5Var10.setTextSize(i21);
                        }
                        i5 i5Var11 = kVar.f19304r;
                        if (i5Var11 != null && i5Var11.getVisibility() != 8) {
                            i5 i5Var12 = kVar.f19304r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            i5Var12.setTextSize(i15);
                        }
                        i5 i5Var13 = kVar.f19307s;
                        if (i5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            i5Var13.setTextSize(i14);
                        }
                    }
                }
                i5 i5Var14 = i5VarArr[i20];
                if (i5Var14 != null && i5Var14.getVisibility() != 8) {
                    i5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5VarArr[i20].getPaddingBottom() + i5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f19319z0) {
                        CharSequence text = i5VarArr[i20].getText();
                        i5 i5Var15 = i5VarArr[i20];
                        i5Var15.setPivotX(i5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        i5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        i5VarArr[i20].setPivotX(0.0f);
                        i5VarArr[i20].setPivotY(0.0f);
                    }
                }
                i5 i5Var16 = kVar.f19304r;
                if (i5Var16 != null && i5Var16.getVisibility() != 8) {
                    kVar.f19304r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = kVar.l1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                i5 i5Var17 = kVar.f19307s;
                if (i5Var17 != null && i5Var17.getVisibility() != 8) {
                    kVar.f19307s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        w9 w9Var = kVar.f19280f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != i5VarArr[0] && childAt != i5VarArr[1] && childAt != kVar.l1 && childAt != kVar.f19304r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f19307s && childAt != kVar.f19280f) {
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
        View[] viewArr = this.f19295n;
        if (viewArr[i10] != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        viewArr[i10] = i5Var;
        i5Var.setGravity(19);
        int i11 = this.f19312v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(h6.v0(h6.A8, this.I0));
        }
        i5 i5Var2 = viewArr[i10];
        i5Var2.setEmojiColor(i5Var2.getTextColor());
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
            boolean z10 = this.f19296n0;
            i5[] i5VarArr = this.f19295n;
            if (!z10) {
                i5 i5Var = i5VarArr[0];
                if (i5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(i5Var, property, 1.0f));
                }
                if (this.f19304r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f19304r, property, 1.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f19315x;
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
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f19296n0) {
                i5 i5Var2 = i5VarArr[0];
                if (i5Var2 != null) {
                    i5Var2.setVisibility(0);
                }
                if (this.f19304r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f19304r.setVisibility(0);
                }
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(h6.f0(this.f19300p0, 1, -1));
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
        this.f19311u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f19313w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, h6.f18733a7, h6.f19065s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f19271b0 = z10;
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
        if (drawable instanceof g2) {
            g2 g2Var = (g2) drawable;
            if (s()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g2Var.c(f7, false);
            g2Var.b(this.f19308s0);
            g2Var.a(this.f19305r0);
        } else if (drawable instanceof d5) {
            d5 d5Var = (d5) drawable;
            d5Var.f18566k = this.f19315x;
            d5Var.f18565j = this.f19305r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19305r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19305r0, PorterDuff.Mode.SRC_IN));
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
        this.e.setColorFilter(new PorterDuffColorFilter(this.f19305r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f19315x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof d5) {
                ((d5) drawable).f18566k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f19291k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19291k0 = z10;
    }

    public void setChatAvatarContainer(fo foVar) {
        this.R0 = foVar;
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

    public void setDrawBlurBackground(pv0 pv0Var) {
        this.K0 = true;
        this.J0 = pv0Var;
        pv0Var.T.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
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
        this.f19288i1 = true;
        if (this.f19284g1 != i10) {
            this.f19284g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f19286h1 = true;
        if (this.f19282f1 != i10) {
            this.f19282f1 = i10;
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
        this.f19317y = z10;
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
        this.f19314w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f19278e0 = onClickListener;
        i5[] i5VarArr = this.f19295n;
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setRightDrawableOnClick(onClickListener);
        }
        i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.setRightDrawableOnClick(this.f19278e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f19280f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f19280f = w9Var;
            if (w9Var != null) {
                addView(w9Var);
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
        if (this.f19269a1 != f7) {
            this.f19269a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(gg.q0 q0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(q0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f19293l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19293l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f19304r == null) {
            o();
        }
        if (this.f19304r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            i5 i5Var = this.f19304r;
            if (!isEmpty && !this.f19296n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i5Var.setVisibility(i10);
            this.f19304r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f19304r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f19304r == null) {
            o();
        }
        this.f19304r.setTextColor(i10);
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
        this.f19289j0 = runnable;
        this.f19285h0 = runnable;
    }

    public void setTitleColor(int i10) {
        i5[] i5VarArr = this.f19295n;
        if (i5VarArr[0] == null) {
            p(0);
        }
        this.f19312v0 = i10;
        i5VarArr[0].setTextColor(i10);
        i5VarArr[0].setEmojiColor(i10);
        i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            i5Var.setTextColor(i10);
            i5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f19268a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f19295n[0].setScrollNonFitText(z10);
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
        this.f19296n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            i5 i5Var = this.f19295n[0];
            if (i5Var != null) {
                arrayList.add(i5Var);
            }
            if (this.f19304r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f19304r);
                i5 i5Var2 = this.f19304r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                i5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f19298o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 1));
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
        w9 w9Var = this.f19280f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            w9 w9Var2 = this.f19280f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f19319z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, u10));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof d5) {
                d5 d5Var = (d5) drawable;
                d5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                d5Var.a(f14, true);
            }
        }
    }

    public final void w() {
        f5 f5Var;
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.G && (f5Var = v0Var.H) != null) {
                    f5Var.p(v0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.E;
        if (zVar != null && str != null) {
            boolean z10 = this.f19296n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.G) {
                        if (!z10) {
                            zVar.f19701b.v(v0Var.L(z11));
                        }
                        v0Var.H(str, false);
                        v0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f19299o1 = i10;
        this.f19301p1 = i11;
        m4.g0 g0Var = new m4.g0(21, this, recyclerView);
        recyclerView.j(new ai.r(g0Var, 12));
        this.f19297n1 = z10;
        if (this.f19294m1) {
            g0Var.run();
            return;
        }
        this.f19294m1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f19303q1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f19306r1 = f7;
        b();
    }

    public final void z(ml0 ml0Var, boolean z10) {
        y(ml0Var, z10, h6.f18733a7, h6.f19065s8);
    }

    public void setAdaptiveBackground(zn0 zn0Var) {
        int i10 = h6.f18733a7;
        int i11 = h6.f19065s8;
        this.f19299o1 = i10;
        this.f19301p1 = i11;
        b();
        m4.g0 g0Var = new m4.g0(20, this, zn0Var);
        zn0Var.f30629f.add(g0Var);
        if (this.f19294m1) {
            g0Var.run();
            return;
        }
        this.f19294m1 = true;
        boolean canScrollVertically = zn0Var.canScrollVertically(-1);
        this.f19303q1 = !canScrollVertically;
        this.f19306r1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
