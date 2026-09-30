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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.vz0;
public class k extends FrameLayout implements le.e, x5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public y E;
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
    public dw0 J0;
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
    public ho R0;
    public ow0 S;
    public boolean S0;
    public s00 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public vz0 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public ch.d f19543a;
    public int f19544a0;
    public float f19545a1;
    public ch.d f19546b;
    public boolean f19547b0;
    public final le.f f19548b1;
    public ch.d f19549c;
    public CharSequence f19550c0;
    public final le.c f19551c1;
    public final x4 d;
    public Drawable f19552d0;
    public final le.f f19553d1;
    public ImageView e;
    public View.OnClickListener f19554e0;
    public final le.c f19555e1;
    public w9 f19556f;
    public String f19557f0;
    public int f19558f1;
    public final Object[] f19559g0;
    public int f19560g1;
    public Drawable h;
    public Runnable f19561h0;
    public boolean f19562h1;
    public boolean f19563i0;
    public boolean f19564i1;
    public Runnable f19565j0;
    public boolean f19566j1;
    public boolean f19567k0;
    public boolean f19568k1;
    public int f19569l0;
    public ai.s l1;
    public boolean m0;
    public boolean f19570m1;
    public final h5[] f19571n;
    public boolean f19572n0;
    public boolean f19573n1;
    public float f19574o0;
    public int f19575o1;
    public int f19576p0;
    public int f19577p1;
    public int f19578q0;
    public boolean f19579q1;
    public h5 f19580r;
    public int f19581r0;
    public float f19582r1;
    public h5 f19583s;
    public int f19584s0;
    public ValueAnimator f19585s1;
    public m2 f19586t0;
    public j f19587u0;
    public View v;
    public int f19588v0;
    public int f19589w;
    public boolean f19590w0;
    public int f19591x;
    public boolean f19592x0;
    public boolean f19593y;
    public boolean f19594y0;
    public boolean f19595z0;

    public k(Context context, d6 d6Var) {
        super(context);
        this.d = x4.f19941a;
        this.f19571n = new h5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f19559g0 = new Object[3];
        this.f19567k0 = true;
        this.f19569l0 = 255;
        this.f19588v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new com.google.firebase.messaging.m(this);
        tr trVar = tr.h;
        this.f19548b1 = new le.f(0, this, trVar, 380L);
        this.f19551c1 = new le.c(0, this, trVar, 380L, false);
        this.f19553d1 = new le.f(0, this, trVar, 320L);
        this.f19555e1 = new le.c(0, this, trVar, 320L, false);
        this.f19579q1 = true;
        this.f19582r1 = 1.0f;
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
            this.f19578q0 = i10;
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
        this.f19576p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(h6.f0(i10, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void B(int i10, boolean z10) {
        if (z10) {
            this.f19584s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof f2) {
                    ((f2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f19581r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof f2) {
                    ((f2) drawable2).a(i10);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).f18807j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.S0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f19581r0, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        invalidate();
    }

    public final void E(int i10, boolean z10) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    ((u0) childAt).B(i10);
                }
                i11++;
            }
        } else if (!z10 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = yVar.getChildAt(i11);
                if (childAt2 instanceof u0) {
                    ((u0) childAt2).B(i10);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    ((u0) childAt).G(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = yVar.getChildAt(i11);
                if (childAt2 instanceof u0) {
                    ((u0) childAt2).G(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void G(int i10, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void H(int i10, boolean z10) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.G) {
                        if (z10) {
                            u0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            u0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void I(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        int i10;
        h5[] h5VarArr = this.f19571n;
        if (charSequence != null && h5VarArr[0] == null) {
            p(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            if (charSequence != null && !this.f19572n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            h5Var.setVisibility(i10);
            h5 h5Var2 = h5VarArr[0];
            this.f19550c0 = charSequence;
            h5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f19552d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.f19552d0 = o5Var;
            h5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.f19552d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.f19554e0);
        }
        this.f19594y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        h5[] h5VarArr = this.f19571n;
        if (h5VarArr[0] != null && charSequence != null) {
            if (this.f19590w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f19580r.getVisibility() != 0) {
                    this.f19580r.setVisibility(0);
                    this.f19580r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f19580r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ok.r(animate, f7, 220L);
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
            this.f19594y0 = z10;
            h5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                h5 h5Var2 = h5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                h5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = h5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f19592x0 = true;
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
        h5 h5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f19547b0 && this.f19586t0.parentLayout != null) {
            Object[] objArr = this.f19559g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f19557f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f19557f0 = str;
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
                            str2 = this.f19550c0;
                        }
                        if (str == null) {
                            drawable = this.f19552d0;
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
                        this.f19563i0 = z11;
                        h5[] h5VarArr = this.f19571n;
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
                                h5VarArr[1].setRightDrawableOnClick(this.f19554e0);
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).l(h5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(h5VarArr[1]);
                                }
                                this.Y0 = true;
                                h5 h5Var4 = h5VarArr[1];
                                h5VarArr[1] = h5VarArr[0];
                                h5VarArr[0] = h5Var4;
                                h5Var4.setAlpha(0.0f);
                                h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = h5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f19573n1) {
                                    f7 = 1.0f - this.f19582r1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
                                if (this.f19580r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f19595z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.R) {
                                h5VarArr[0].invalidate();
                                invalidate();
                            }
                            h5VarArr[0].k(spannableString);
                            h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            h5VarArr[0].i(drawable);
                            h5VarArr[0].setRightDrawableOnClick(this.f19554e0);
                            if (drawable instanceof org.telegram.ui.Components.o5) {
                                ((org.telegram.ui.Components.o5) drawable).l(h5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(h5VarArr[0]);
                            } else {
                                mVar.s(h5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f19561h0;
                        }
                        this.f19565j0 = runnable;
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
        this.f19543a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f19546b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f19549c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-AndroidUtilities.dp(10.0f));
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
            h5[] h5VarArr = this.f19571n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.f19580r || view == this.E || view == this.e || view == this.f19583s || view == this.F0) {
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
            if (this.f19589w == 0) {
                if (!this.f19572n0) {
                    h5 h5Var = this.f19571n[0];
                    if (h5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f));
                    }
                    if (this.f19580r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f19580r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i10 = this.f19589w;
            if (i10 == 0) {
                i10 = this.f19591x;
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
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof f2) {
                    ((f2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(h6.f0(this.f19578q0, 1, -1));
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
                mVar.f7321a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7323c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7321a = false;
            ((AnimatorSet) mVar.f7323c).cancel();
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
        if (this.f19570m1) {
            if (this.f19573n1) {
                ai.w5 w5Var = this.F0;
                if (w5Var != null) {
                    w5Var.setAlpha(1.0f - this.f19582r1);
                } else {
                    h5 h5Var = this.f19571n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.f19582r1);
                    }
                }
            }
            float f7 = this.f19582r1;
            int i10 = this.f19577p1;
            d6 d6Var = this.I0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = h6.v0(i10, d6Var);
            }
            int i11 = this.f19575o1;
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
            setShadowAlpha((int) ((1.0f - this.f19582r1) * 255.0f));
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
            this.f19595z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) tr.f28636f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        ho hoVar = this.R0;
        if (hoVar == null) {
            return;
        }
        co coVar = hoVar.e;
        if (coVar != null && coVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        le.f fVar = this.f19548b1;
        if (z10) {
            if (fVar.f14225g) {
                f7 = fVar.f14224f;
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
        this.f19551c1.a(z11, z10);
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
        ho hoVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f19562h1) {
            i10 = this.f19558f1;
        } else {
            i10 = (int) this.f19553d1.e;
        }
        if (this.f19564i1) {
            i10 = Math.max((int) ((1.0f - this.f19545a1) * this.f19560g1), i10);
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
        ch.d dVar = this.f19543a;
        le.c cVar = this.f19555e1;
        if (dVar != null && !this.P0) {
            if (this.f19562h1 || this.f19564i1) {
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
            ho hoVar2 = this.R0;
            le.c cVar2 = this.f19551c1;
            if (hoVar2 == null) {
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
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.f19548b1.e) + i15), i19, Math.max(this.f19545a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((hoVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f19543a.setBounds(lerp2, height, width, i16);
            this.f19543a.draw(canvas);
        } else {
            f7 = 1.0f;
        }
        ch.d dVar2 = this.f19546b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i15, i16);
            this.f19546b.draw(canvas);
        }
        ch.d dVar3 = this.f19549c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f19568k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            ch.d dVar4 = this.f19549c;
            if (this.f19562h1) {
                i12 = 255;
            } else {
                i12 = (int) (cVar.e * 255.0f);
            }
            dVar4.setAlpha(i12);
            this.f19549c.draw(canvas);
        }
        if (this.K0 && this.f19591x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f19591x;
            Paint paint = this.L0;
            paint.setColor(i20);
            if (this.f19570m1) {
                dw0 dw0Var = this.J0;
                float y3 = getY();
                float f12 = f7 - this.f19582r1;
                dw0Var.getClass();
                if (dw0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = h6.f19450xf;
                } else {
                    i11 = h6.f19468yf;
                }
                dw0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(h6.v0(i11, dw0Var.getResourceProvider())), f12));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f19566j1 = true;
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
            ch.d dVar = this.f19543a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.R0) {
                ch.d dVar2 = this.f19546b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f19549c;
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
        ch.d dVar = this.f19543a;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f19549c;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f19546b;
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
            if (!(drawable instanceof f2) && !(drawable instanceof c5)) {
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
        y yVar = this.E;
        boolean z10 = false;
        if (yVar != null) {
            i10 = (yVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
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
        this.f19555e1.a(z10, this.f19566j1);
        le.f fVar = this.f19553d1;
        if (fVar.f14225g) {
            f7 = fVar.f14224f;
        } else {
            f7 = fVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f19566j1) {
                fVar.a(f10);
            } else {
                fVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f19587u0;
    }

    public y getActionMode() {
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

    public h5 getAdditionalSubtitleTextView() {
        return this.f19583s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public x4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f19591x;
    }

    public boolean getCastShadows() {
        return this.f19567k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
        return this.f19556f;
    }

    public int getShadowAlpha() {
        return this.f19569l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f19580r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public h5 getSubtitleTextView() {
        return this.f19580r;
    }

    public String getTitle() {
        h5 h5Var = this.f19571n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        h5 h5Var = this.f19571n[0];
        if (h5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return h5Var.getPaint().getFontMetricsInt();
    }

    public h5 getTitleTextView() {
        return this.f19571n[0];
    }

    public h5 getTitleTextView2() {
        return this.f19571n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        y yVar;
        if (this.f19572n0 && (yVar = this.E) != null) {
            yVar.j(z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final y i() {
        return j(null);
    }

    public final y j(String str) {
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
        dVar3.f19946c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(h6.v0(h6.f19427w8, this.I0));
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
        if (this.f19583s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f19583s = h5Var;
        h5Var.setGravity(3);
        this.f19583s.setVisibility(8);
        this.f19583s.setTextColor(h6.v0(h6.B8, this.I0));
        addView(this.f19583s, 0, w7.y5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(h6.f0(this.f19576p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.y5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final y n() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, w7.y5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f19580r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f19580r = h5Var;
        h5Var.setGravity(3);
        this.f19580r.setVisibility(8);
        this.f19580r.setTextColor(h6.v0(h6.B8, this.I0));
        addView(this.f19580r, 0, w7.y5.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f19589w;
            if (i10 == 0) {
                i10 = this.f19591x;
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
        Drawable drawable = this.f19552d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(this.f19571n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f19591x;
            if (i10 != 0 && this.f19589w != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f19552d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f19563i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = h6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            ow0 ow0Var = this.S;
            h5[] h5VarArr = this.f19571n;
            if (ow0Var == null) {
                this.T = null;
                this.S = new ow0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f28158c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f28156a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(h6.w0(null, h6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new r00(obj));
                }
                this.T = obj;
                h5VarArr[0].invalidate();
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
        h5[] h5VarArr;
        h5 h5Var;
        int i13;
        int i14;
        int i15;
        h5 h5Var2;
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
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f19572n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f19593y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f19572n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = ok.c(f11, size, 1073741824);
                if (!kVar.f19593y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f19593y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            h5VarArr = kVar.f19571n;
            if (i20 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = kVar.f19580r) != null && h5Var.getVisibility() != 8)) {
                y yVar2 = kVar.E;
                if (yVar2 != null) {
                    i13 = yVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.f0.B(16.0f, size - i13, dp) - kVar.f19544a0, 0);
                boolean z10 = kVar.f19594y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f19590w0 && kVar.f19592x0) {
                    h5 h5Var4 = h5VarArr[i20];
                    if (kVar.O0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    h5Var4.setTextSize(i21);
                } else {
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 != null && h5Var5.getVisibility() != 8 && (h5Var2 = kVar.f19580r) != null && h5Var2.getVisibility() != 8) {
                        h5 h5Var6 = h5VarArr[i20];
                        if (h5Var6 != null) {
                            if (kVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            h5Var6.setTextSize(i21);
                        }
                        h5 h5Var7 = kVar.f19580r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        h5Var7.setTextSize(i16);
                        h5 h5Var8 = kVar.f19583s;
                        if (h5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            h5Var8.setTextSize(i17);
                        }
                    } else {
                        h5 h5Var9 = h5VarArr[i20];
                        if (h5Var9 != null && h5Var9.getVisibility() != 8) {
                            h5 h5Var10 = h5VarArr[i20];
                            if (kVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            h5Var10.setTextSize(i21);
                        }
                        h5 h5Var11 = kVar.f19580r;
                        if (h5Var11 != null && h5Var11.getVisibility() != 8) {
                            h5 h5Var12 = kVar.f19580r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            h5Var12.setTextSize(i15);
                        }
                        h5 h5Var13 = kVar.f19583s;
                        if (h5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            h5Var13.setTextSize(i14);
                        }
                    }
                }
                h5 h5Var14 = h5VarArr[i20];
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    h5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h5VarArr[i20].getPaddingBottom() + h5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f19595z0) {
                        CharSequence text = h5VarArr[i20].getText();
                        h5 h5Var15 = h5VarArr[i20];
                        h5Var15.setPivotX(h5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i20].setPivotX(0.0f);
                        h5VarArr[i20].setPivotY(0.0f);
                    }
                }
                h5 h5Var16 = kVar.f19580r;
                if (h5Var16 != null && h5Var16.getVisibility() != 8) {
                    kVar.f19580r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = kVar.l1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                h5 h5Var17 = kVar.f19583s;
                if (h5Var17 != null && h5Var17.getVisibility() != 8) {
                    kVar.f19583s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        w9 w9Var = kVar.f19556f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != kVar.l1 && childAt != kVar.f19580r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f19583s && childAt != kVar.f19556f) {
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
        View[] viewArr = this.f19571n;
        if (viewArr[i10] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        viewArr[i10] = h5Var;
        h5Var.setGravity(19);
        int i11 = this.f19588v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(h6.v0(h6.A8, this.I0));
        }
        h5 h5Var2 = viewArr[i10];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
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

    public void r() {
        d dVar = this.F;
        if (dVar != null && this.J) {
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof u0) {
                    ((u0) childAt).n();
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
            boolean z10 = this.f19572n0;
            h5[] h5VarArr = this.f19571n;
            if (!z10) {
                h5 h5Var = h5VarArr[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 1.0f));
                }
                if (this.f19580r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f19580r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i12 = this.f19591x;
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
            if (!this.f19572n0) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.setVisibility(0);
                }
                if (this.f19580r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f19580r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof f2) {
                    ((f2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(h6.f0(this.f19576p0, 1, -1));
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
        this.f19587u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f19589w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, h6.f19020a7, h6.f19354s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f19547b0 = z10;
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
        if (drawable instanceof f2) {
            f2 f2Var = (f2) drawable;
            if (s()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f2Var.c(f7, false);
            f2Var.b(this.f19584s0);
            f2Var.a(this.f19581r0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.f18808k = this.f19591x;
            c5Var.f18807j = this.f19581r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19581r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f19581r0, PorterDuff.Mode.SRC_IN));
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
        this.e.setColorFilter(new PorterDuffColorFilter(this.f19581r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f19591x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).f18808k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f19567k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19567k0 = z10;
    }

    public void setChatAvatarContainer(ho hoVar) {
        this.R0 = hoVar;
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

    public void setDrawBlurBackground(dw0 dw0Var) {
        this.K0 = true;
        this.J0 = dw0Var;
        dw0Var.T.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z10);
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
        this.f19564i1 = true;
        if (this.f19560g1 != i10) {
            this.f19560g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f19562h1 = true;
        if (this.f19558f1 != i10) {
            this.f19558f1 = i10;
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
        this.f19593y = z10;
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
        this.f19590w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f19554e0 = onClickListener;
        h5[] h5VarArr = this.f19571n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.f19554e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f19556f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f19556f = w9Var;
            if (w9Var != null) {
                addView(w9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.f19545a1 != f7) {
            this.f19545a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(gg.q0 q0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(q0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f19569l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f19569l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f19580r == null) {
            o();
        }
        if (this.f19580r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            h5 h5Var = this.f19580r;
            if (!isEmpty && !this.f19572n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h5Var.setVisibility(i10);
            this.f19580r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f19580r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f19580r == null) {
            o();
        }
        this.f19580r.setTextColor(i10);
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
        this.f19565j0 = runnable;
        this.f19561h0 = runnable;
    }

    public void setTitleColor(int i10) {
        h5[] h5VarArr = this.f19571n;
        if (h5VarArr[0] == null) {
            p(0);
        }
        this.f19588v0 = i10;
        h5VarArr[0].setTextColor(i10);
        h5VarArr[0].setEmojiColor(i10);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f19544a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f19571n[0].setScrollNonFitText(z10);
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
        this.f19572n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            h5 h5Var = this.f19571n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.f19580r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f19580r);
                h5 h5Var2 = this.f19580r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                h5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f19574o0;
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
        w9 w9Var = this.f19556f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            w9 w9Var2 = this.f19556f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f19595z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, u10));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                c5 c5Var = (c5) drawable;
                c5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                c5Var.a(f14, true);
            }
        }
    }

    public final void w() {
        e5 e5Var;
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G && (e5Var = u0Var.H) != null) {
                    e5Var.p(u0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        y yVar = this.E;
        if (yVar != null && str != null) {
            boolean z10 = this.f19572n0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.G) {
                        if (!z10) {
                            yVar.f19945b.v(u0Var.L(z11));
                        }
                        u0Var.H(str, false);
                        u0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f19575o1 = i10;
        this.f19577p1 = i11;
        ki.h0 h0Var = new ki.h0(26, this, recyclerView);
        recyclerView.j(new ai.r(h0Var, 12));
        this.f19573n1 = z10;
        if (this.f19570m1) {
            h0Var.run();
            return;
        }
        this.f19570m1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f19579q1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f19582r1 = f7;
        b();
    }

    public final void z(zl0 zl0Var, boolean z10) {
        y(zl0Var, z10, h6.f19020a7, h6.f19354s8);
    }

    public void setAdaptiveBackground(po0 po0Var) {
        int i10 = h6.f19020a7;
        int i11 = h6.f19354s8;
        this.f19575o1 = i10;
        this.f19577p1 = i11;
        b();
        ki.h0 h0Var = new ki.h0(25, this, po0Var);
        po0Var.f27420f.add(h0Var);
        if (this.f19570m1) {
            h0Var.run();
            return;
        }
        this.f19570m1 = true;
        boolean canScrollVertically = po0Var.canScrollVertically(-1);
        this.f19579q1 = !canScrollVertically;
        this.f19582r1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
