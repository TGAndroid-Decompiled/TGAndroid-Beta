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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ky0;

public class k extends FrameLayout implements ud.b, x5 {
    public z A;
    public boolean A0;
    public d B;
    public ag.d B0;
    public String C;
    public boolean C0;
    public boolean D;
    public View.OnTouchListener D0;
    public boolean E;
    public final c6 E0;
    public boolean F;
    public zu0 F0;
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
    public rn N0;
    public kv0 O;
    public boolean O0;
    public d00 P;
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
    public final ud.c X0;
    public final ud.a Y0;
    public final ud.c Z0;

    public lg.d f23555a;

    public View.OnClickListener f23556a0;

    public final ud.a f23557a1;

    public lg.d f23558b;

    public String f23559b0;

    public int f23560b1;

    public lg.d f23561c;

    public final Object[] f23562c0;

    public int f23563c1;
    public final x4 d;

    public Runnable f23564d0;

    public boolean f23565d1;

    public ImageView f23566e;

    public boolean f23567e0;

    public boolean f23568e1;

    public n9 f23569f;

    public Runnable f23570f0;

    public boolean f23571f1;

    public boolean f23572g0;

    public boolean f23573g1;
    public Drawable h;

    public int f23574h0;

    public jh.i f23575h1;

    public boolean f23576i0;

    public boolean f23577i1;

    public boolean f23578j0;

    public boolean f23579j1;

    public float f23580k0;

    public int f23581k1;

    public int f23582l0;
    public int l1;
    public int m0;

    public boolean f23583m1;

    public final h5[] f23584n;

    public int f23585n0;

    public float f23586n1;

    public int f23587o0;

    public ValueAnimator f23588o1;

    public n2 f23589p0;

    public j f23590q0;

    public h5 f23591r;

    public int f23592r0;

    public h5 f23593s;

    public boolean f23594s0;

    public boolean f23595t0;

    public boolean f23596u0;
    public View v;

    public boolean f23597v0;

    public int f23598w;

    public CharSequence f23599w0;

    public int f23600x;

    public boolean f23601x0;

    public boolean f23602y;

    public boolean f23603y0;

    public boolean f23604z0;

    public k(Context context, c6 c6Var) {
        super(context);
        this.d = x4.f23954a;
        this.f23584n = new h5[2];
        this.E = true;
        this.G = true;
        this.I = true;
        this.f23562c0 = new Object[3];
        this.f23572g0 = true;
        this.f23574h0 = 255;
        this.f23592r0 = 0;
        this.H0 = new Paint();
        this.I0 = new Rect();
        this.J0 = new com.google.firebase.messaging.l(this);
        er erVar = er.h;
        this.X0 = new ud.c(0, this, erVar, 380L);
        this.Y0 = new ud.a(0, this, erVar, 380L, false);
        this.Z0 = new ud.c(0, this, erVar, 320L);
        this.f23557a1 = new ud.a(0, this, erVar, 320L, false);
        this.f23583m1 = true;
        this.f23586n1 = 1.0f;
        this.E0 = c6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public static View r(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void B(zk0 zk0Var, boolean z10) {
        z(zk0Var, z10, g6.f22999a7, g6.f23322s8);
    }

    public final void C(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.m0 = i10;
            if (this.F && (imageView = this.f23566e) != null) {
                imageView.setBackgroundDrawable(g6.f0(i10, 1, -1));
            }
            d dVar = this.B;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f23582l0 = i10;
        ImageView imageView2 = this.f23566e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(g6.f0(i10, 1, -1));
        }
        z zVar = this.A;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void D(int i10, boolean z10) {
        if (z10) {
            this.f23587o0 = i10;
            d dVar = this.B;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f23566e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f23566e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f23585n0 = i10;
            ImageView imageView2 = this.f23566e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof g2) {
                    ((g2) drawable2).a(i10);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).f22826j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f23566e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f23566e;
        if (imageView3 == null || !this.O0) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.f23585n0, PorterDuff.Mode.SRC_IN));
    }

    public final void E(int i10, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).B(i10);
                }
                i11++;
            }
            return;
        }
        if (z10 || (zVar = this.A) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof v0) {
                ((v0) childAt2).B(i10);
            }
            i11++;
        }
    }

    public final void F(int i10, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.B) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    ((v0) childAt).G(i10, z10);
                }
                i11++;
            }
            return;
        }
        if (z11 || (zVar = this.A) == null) {
            return;
        }
        int childCount2 = zVar.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = zVar.getChildAt(i11);
            if (childAt2 instanceof v0) {
                ((v0) childAt2).G(i10, z10);
            }
            i11++;
        }
    }

    public final void G(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.B) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else {
            if (z10 || (zVar = this.A) == null) {
                return;
            }
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void H(int i10, boolean z10) {
        z zVar = this.A;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.C) {
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

    public final void I(CharSequence charSequence, org.telegram.ui.Components.i5 i5Var) {
        h5[] h5VarArr = this.f23584n;
        if (charSequence != null && h5VarArr[0] == null) {
            q(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setVisibility((charSequence == null || this.f23578j0) ? 4 : 0);
            h5 h5Var2 = h5VarArr[0];
            this.V = charSequence;
            h5Var2.k(charSequence);
            if (this.f23603y0) {
                Drawable drawable = this.W;
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.W = i5Var;
            h5Var3.i(i5Var);
            if (this.f23603y0) {
                Drawable drawable2 = this.W;
                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.f23556a0);
        }
        this.f23596u0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        h5[] h5VarArr = this.f23584n;
        if (h5VarArr[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z11 = this.f23594s0 && !TextUtils.isEmpty(this.f23599w0);
        if (z11) {
            if (this.f23591r.getVisibility() != 0) {
                this.f23591r.setVisibility(0);
                this.f23591r.setAlpha(0.0f);
            }
            this.f23591r.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(220L).start();
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
        this.f23596u0 = z10;
        h5VarArr[0].setAlpha(0.0f);
        if (!z11) {
            h5 h5Var2 = h5VarArr[0];
            int iDp = AndroidUtilities.dp(20.0f);
            if (!z10) {
                iDp = -iDp;
            }
            h5Var2.setTranslationY(iDp);
        }
        ViewPropertyAnimator duration = h5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.f23595t0 = true;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = h5VarArr[1].animate().alpha(0.0f);
        if (!z11) {
            int iDp2 = AndroidUtilities.dp(20.0f);
            if (z10) {
                iDp2 = -iDp2;
            }
            viewPropertyAnimatorAlpha.translationY(iDp2);
        }
        if (interpolator != null) {
            viewPropertyAnimatorAlpha.setInterpolator(interpolator);
        }
        viewPropertyAnimatorAlpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
        requestLayout();
    }

    public final void K(String str, int i10, Runnable runnable) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        CharSequence charSequence3;
        boolean z11;
        h5 h5Var;
        int iIndexOf;
        SpannableString spannableStringValueOf;
        String string;
        if (!this.U || this.f23589p0.parentLayout == null) {
            return;
        }
        Object[] objArr = this.f23562c0;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = runnable;
        if (this.U0) {
            return;
        }
        String str2 = this.f23559b0;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.f23559b0 = str;
            Drawable drawable = null;
            if (this.f23575h1 != null) {
                this.f23575h1.a(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            if (str != null) {
                string = LocaleController.getString(str, i10);
            } else {
                charSequence = this.V;
            }
            if (str == null) {
                charSequence2 = charSequence;
                charSequence2 = string;
                drawable = this.W;
            }
            charSequence2 = charSequence;
            charSequence2 = string;
            com.google.firebase.messaging.l lVar = this.J0;
            if (str == null || (iIndexOf = TextUtils.indexOf(charSequence2, "...")) < 0) {
                z10 = false;
                charSequence3 = charSequence2;
            } else {
                spannableStringValueOf = SpannableString.valueOf(charSequence2);
                lVar.u(spannableStringValueOf, iIndexOf);
                z10 = true;
            }
            if (str != null) {
                charSequence3 = spannableStringValueOf;
                z11 = true;
            } else {
                charSequence3 = spannableStringValueOf;
                z11 = false;
            }
            this.f23567e0 = z11;
            h5[] h5VarArr = this.f23584n;
            if ((charSequence3 == null || h5VarArr[0] != null) && getMeasuredWidth() != 0 && ((h5Var = h5VarArr[0]) == null || h5Var.getVisibility() == 0)) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.animate().cancel();
                    h5 h5Var3 = h5VarArr[1];
                    if (h5Var3 != null) {
                        h5Var3.animate().cancel();
                    }
                    if (h5VarArr[1] == null) {
                        q(1);
                    }
                    h5VarArr[1].k(charSequence3);
                    h5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    h5VarArr[1].i(drawable);
                    h5VarArr[1].setRightDrawableOnClick(this.f23556a0);
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
                    h5VarArr[0].animate().alpha(this.f23579j1 ? 1.0f - this.f23586n1 : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = h5VarArr[1].animate().alpha(0.0f);
                    if (this.f23591r == null) {
                        viewPropertyAnimatorAlpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.f23597v0 = true;
                    viewPropertyAnimatorAlpha.setDuration(220L).setListener(new e(this, 1)).start();
                }
            } else {
                q(0);
                if (this.N) {
                    h5VarArr[0].invalidate();
                    invalidate();
                }
                h5VarArr[0].k(charSequence3);
                h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                h5VarArr[0].i(drawable);
                h5VarArr[0].setRightDrawableOnClick(this.f23556a0);
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
                runnable = this.f23564d0;
            }
            this.f23570f0 = runnable;
        }
    }

    public final void L() {
        this.C0 = true;
        if (this.B0 == null) {
            ag.d dVar = new ag.d(getContext(), 4);
            this.B0 = dVar;
            addView(dVar);
        }
    }

    public final void M(jg.a aVar, mg.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.K0 = true;
        this.M0 = z10;
        lg.d dVarC = aVar.c(this, null, false);
        dVarC.n(dVar);
        dVarC.o(AndroidUtilities.dp(6.0f));
        this.f23555a = dVarC;
        if (z10) {
            dVarC.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            dVarC.p(AndroidUtilities.dp(23.0f));
        }
        lg.d dVarC2 = aVar.c(this, null, false);
        dVarC2.n(dVar);
        dVarC2.p(AndroidUtilities.dp(23.0f));
        dVarC2.o(AndroidUtilities.dp(6.0f));
        this.f23558b = dVarC2;
        lg.d dVarC3 = aVar.c(this, null, false);
        dVarC3.n(dVar);
        dVarC3.p(AndroidUtilities.dp(23.0f));
        dVarC3.o(AndroidUtilities.dp(6.0f));
        this.f23561c = dVarC3;
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
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.H) {
            h5[] h5VarArr = this.f23584n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.f23591r || view == this.A || view == this.f23566e || view == this.f23593s || view == this.B0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.B == null || this.F) {
            return;
        }
        this.F = true;
        g();
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<d, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.M = viewArr;
        if (this.f23598w == 0) {
            if (!this.f23578j0) {
                h5 h5Var = this.f23584n[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 0.0f));
                }
                if (this.f23591r != null && !TextUtils.isEmpty(this.f23599w0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f23591r, (Property<h5, Float>) property, 0.0f));
                }
            }
            z zVar = this.A;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 0.0f));
            }
        }
        int i11 = this.f23598w;
        if (i11 == 0) {
            i11 = this.f23600x;
        }
        if (i11 == 0 || this.K0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.b.f(i11) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.Q0 != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new a(this, i10));
            this.L.playTogether(valueAnimatorOfFloat);
        }
        this.L.setDuration(200L);
        this.L.addListener(new ag.x1(10, this, zArr));
        this.L.start();
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g2) {
                ((g2) drawable).c(1.0f, true);
            }
            this.f23566e.setBackgroundDrawable(g6.f0(this.m0, 1, -1));
        }
    }

    public final void P() {
        boolean z10 = this.f23603y0 && this.f23604z0;
        if (this.A0 != z10) {
            this.A0 = z10;
            com.google.firebase.messaging.l lVar = this.J0;
            if (!z10) {
                lVar.f4599a = false;
                ((AnimatorSet) lVar.f4601c).cancel();
                return;
            }
            lVar.f4599a = true;
            AnimatorSet animatorSet = (AnimatorSet) lVar.f4601c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    public final boolean a(String str) {
        if (this.B == null) {
            return false;
        }
        String str2 = this.C;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void b() {
        if (this.f23577i1) {
            if (this.f23579j1) {
                ag.d dVar = this.B0;
                if (dVar != null) {
                    dVar.setAlpha(1.0f - this.f23586n1);
                } else {
                    h5 h5Var = this.f23584n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.f23586n1);
                    }
                }
            }
            float f10 = this.f23586n1;
            int i10 = this.l1;
            c6 c6Var = this.E0;
            int iV0 = i10 == -1 ? 0 : g6.v0(i10, c6Var);
            int i11 = this.f23581k1;
            int iV1 = i11 == -1 ? 0 : g6.v0(i11, c6Var);
            if (iV1 == 0) {
                iV1 = i0.b.k(iV0, 0);
            }
            if (iV0 == 0) {
                iV0 = i0.b.k(iV1, 0);
            }
            setBackgroundColor(i0.b.d(f10, iV0, iV1));
            setShadowAlpha((int) ((1.0f - this.f23586n1) * 255.0f));
            if (this.G0) {
                invalidate();
            }
        }
    }

    public final void c() {
        if (LocaleController.isRTL) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new i(0));
        this.f23597v0 = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) er.f28122f);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    @Override
    public final void d() {
        b();
        lg.d dVar = this.f23555a;
        if (dVar != null) {
            dVar.u();
        }
        lg.d dVar2 = this.f23561c;
        if (dVar2 != null) {
            dVar2.u();
        }
        lg.d dVar3 = this.f23558b;
        if (dVar3 != null) {
            dVar3.u();
        }
        jh.i iVar = this.f23575h1;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int iDp = AndroidUtilities.dp(6.0f);
        int iDp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int iMax = this.f23565d1 ? this.f23560b1 : (int) this.Z0.f48502e;
        if (this.f23568e1) {
            iMax = Math.max((int) ((1.0f - this.W0) * this.f23563c1), iMax);
        }
        ImageView imageView = this.f23566e;
        boolean z10 = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + iDp2) / 2)) - iDp;
        int i11 = iDp * 2;
        int i12 = height + iDp2 + i11;
        lg.d dVar = this.f23555a;
        ud.a aVar = this.f23557a1;
        if (dVar == null || this.L0) {
            f10 = 1.0f;
        } else {
            if (this.f23565d1 || this.f23568e1) {
                f10 = 1.0f;
                i10 = iMax > 0 ? iDp : 0;
            } else {
                f10 = 1.0f;
                i10 = (int) (iDp * aVar.f48497e);
            }
            int i13 = i10 + iMax;
            int i14 = iDp + iDp2;
            int iMax2 = Math.max(i13, i14);
            rn rnVar = this.N0;
            ud.a aVar2 = this.Y0;
            int iLerp = AndroidUtilities.lerp(i13, iMax2, rnVar == null ? 0.0f : f10 - aVar2.f48497e);
            int iLerp2 = AndroidUtilities.lerp(z10 ? i14 : 0, i14, this.N0 == null ? 0.0f : f10 - aVar2.f48497e);
            int width = getWidth() - iLerp;
            int i15 = width - iLerp2;
            if (this.N0 != null) {
                int iLerp3 = AndroidUtilities.lerp(Math.min(i15, ((int) this.X0.f48502e) + i11), i15, Math.max(this.W0, actionModeFactor));
                iLerp2 = ((width + iLerp2) - iLerp3) / 2;
                width = iLerp2 + iLerp3;
                float fDp = AndroidUtilities.dp(3.0f) + ((iLerp2 - ((ViewGroup.MarginLayoutParams) this.N0.getLayoutParams()).leftMargin) - this.N0.getLeftPadding()) + iDp;
                this.N0.setTranslationX(fDp);
                rn rnVar2 = this.N0;
                rnVar2.setPivotX((rnVar2.getMeasuredWidth() / 2.0f) - fDp);
            }
            this.f23555a.setBounds(iLerp2, height, width, i12);
            this.f23555a.draw(canvas);
        }
        lg.d dVar2 = this.f23558b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, iDp2 + i11, i12);
            this.f23558b.draw(canvas);
        }
        lg.d dVar3 = this.f23561c;
        if (dVar3 != null && iMax > 0 && !this.L0 && !this.f23573g1) {
            dVar3.setBounds((getWidth() - Math.max(iDp2, iMax)) - i11, height, getWidth(), i12);
            this.f23561c.setAlpha(this.f23565d1 ? 255 : (int) (aVar.f48497e * 255.0f));
            this.f23561c.draw(canvas);
        }
        if (this.G0 && this.f23600x != 0) {
            this.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i16 = this.f23600x;
            Paint paint = this.H0;
            paint.setColor(i16);
            if (this.f23577i1) {
                zu0 zu0Var = this.F0;
                float y10 = getY();
                float f11 = f10 - this.f23586n1;
                zu0Var.getClass();
                zu0Var.K(canvas, y10, this.I0, paint, true, AndroidUtilities.lerp(255, Color.alpha(g6.v0((zu0.F() && SharedConfig.getDevicePerformanceClass() == 2) ? g6.f23414xf : g6.f23432yf, zu0Var.getResourceProvider())), f11));
            } else {
                this.F0.J(canvas, getY(), this.I0, paint, true);
            }
        }
        this.f23571f1 = true;
        if (this.V0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.N0 != null && this.K0 && motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x8;
            float f11 = y10;
            View viewR = r(this, f10, f11, this.N0);
            if (viewR == null) {
                viewR = r(this, f10, f11, null);
            }
            lg.d dVar = this.f23555a;
            boolean z10 = dVar != null && dVar.getBounds().contains(x8, y10);
            if (viewR != null && viewR != this.N0) {
                lg.d dVar2 = this.f23558b;
                boolean z11 = z10 | (dVar2 != null && dVar2.getBounds().contains(x8, y10));
                lg.d dVar3 = this.f23561c;
                z10 = z11 | (dVar3 != null && dVar3.getBounds().contains(x8, y10));
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        Drawable drawableY0;
        float f10;
        int i10;
        c00 c00Var;
        n2 n2Var = this.f23589p0;
        if (n2Var != null && n2Var.getParentLayout() != null) {
            this.f23589p0.getParentLayout().getClass();
        }
        if (this.f23601x0 && view == this.f23566e) {
            return true;
        }
        boolean zN = N(view);
        if (zN) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.E ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (!this.N || this.f23567e0 || LocaleController.isRTL) {
            z10 = zN;
        } else {
            h5[] h5VarArr = this.f23584n;
            if ((view == h5VarArr[0] || view == h5VarArr[1] || (view == this.B0 && this.C0)) && (drawableY0 = g6.y0()) != null) {
                h5 h5Var = view == this.B0 ? h5VarArr[0] : (h5) view;
                if (h5Var != null && h5Var.getVisibility() == 0 && (h5Var.getText() instanceof String)) {
                    TextPaint textPaint = h5Var.getTextPaint();
                    textPaint.getFontMetricsInt(this.Q);
                    textPaint.getTextBounds((String) h5Var.getText(), 0, 1, this.S);
                    int iWidth = ((this.S.width() - (drawableY0.getIntrinsicWidth() + g6.D1)) / 2) + h5Var.getTextStartX() + g6.D1;
                    f10 = 255.0f;
                    int textStartY = h5Var.getTextStartY() + g6.E1 + ((int) Math.ceil((h5Var.getTextHeight() - this.S.height()) / 2.0f)) + ((int) ((1.0f - this.B0.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    drawableY0.setBounds(iWidth, textStartY - drawableY0.getIntrinsicHeight(), drawableY0.getIntrinsicWidth() + iWidth, textStartY);
                    drawableY0.setAlpha((int) (h5Var.getAlpha() * this.B0.getAlpha() * 255.0f));
                    drawableY0.draw(canvas);
                    if (this.U0) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f10 = 255.0f;
                }
                if (g6.G1) {
                    if (this.O == null) {
                        this.O = new kv0(0);
                    }
                } else if (!this.R && this.O != null) {
                    this.O = null;
                }
                kv0 kv0Var = this.O;
                if (kv0Var != null) {
                    kv0Var.b(canvas, this);
                } else {
                    d00 d00Var = this.P;
                    if (d00Var != null) {
                        ArrayList arrayList = d00Var.d;
                        ArrayList arrayList2 = d00Var.f27592c;
                        if (canvas != null) {
                            int size = arrayList2.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                c00 c00Var2 = (c00) arrayList2.get(i11);
                                Paint paint = c00Var2.f27249k.f27590a;
                                paint.setColor(c00Var2.f27248j);
                                paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * c00Var2.f27247i);
                                paint.setAlpha((int) (c00Var2.f27245f * f10));
                                canvas.drawPoint(c00Var2.f27241a, c00Var2.f27242b, paint);
                            }
                            if (Utilities.random.nextBoolean()) {
                                if (arrayList2.size() + 8 < 150) {
                                    int i12 = AndroidUtilities.statusBarHeight;
                                    float fNextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                                    float fNextFloat2 = (Utilities.random.nextFloat() * org.telegram.messenger.y1.B(20.0f, getMeasuredHeight(), i12)) + i12;
                                    int iNextInt = Utilities.random.nextInt(4);
                                    if (iNextInt == 0) {
                                        i10 = -13357350;
                                    } else if (iNextInt == 1) {
                                        i10 = -843755;
                                    } else if (iNextInt != 2) {
                                        i10 = iNextInt != 3 ? -5752 : -15088582;
                                    } else {
                                        i10 = -207021;
                                    }
                                    int i13 = 0;
                                    for (int i14 = 8; i13 < i14; i14 = 8) {
                                        float f11 = fNextFloat;
                                        double dNextInt = ((double) (Utilities.random.nextInt(270) - 225)) * 0.017453292519943295d;
                                        float fCos = (float) Math.cos(dNextInt);
                                        float fSin = (float) Math.sin(dNextInt);
                                        if (arrayList.isEmpty()) {
                                            c00Var = new c00(d00Var);
                                        } else {
                                            c00Var = (c00) arrayList.get(0);
                                            arrayList.remove(0);
                                        }
                                        c00Var.f27241a = f11;
                                        c00Var.f27242b = fNextFloat2;
                                        c00Var.f27243c = fCos * 1.5f;
                                        c00Var.d = fSin;
                                        c00Var.f27248j = i10;
                                        c00Var.f27245f = 1.0f;
                                        c00Var.h = 0.0f;
                                        c00Var.f27247i = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                                        c00Var.f27246g = Utilities.random.nextInt(1000) + 1000;
                                        c00Var.f27244e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                                        arrayList2.add(c00Var);
                                        i13++;
                                        fNextFloat = f11;
                                    }
                                }
                            }
                            int i15 = 0;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long jMin = Math.min(17L, jCurrentTimeMillis - d00Var.f27591b);
                            int size2 = arrayList2.size();
                            while (i15 < size2) {
                                c00 c00Var3 = (c00) arrayList2.get(i15);
                                float f12 = c00Var3.h;
                                float f13 = c00Var3.f27246g;
                                if (f12 >= f13) {
                                    if (arrayList.size() < 40) {
                                        arrayList.add(c00Var3);
                                    }
                                    arrayList2.remove(i15);
                                    i15--;
                                    size2--;
                                } else {
                                    c00Var3.f27245f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                                    float f14 = c00Var3.f27241a;
                                    float f15 = c00Var3.f27243c;
                                    float f16 = c00Var3.f27244e;
                                    float f17 = jMin;
                                    c00Var3.f27241a = a9.p.d(f15 * f16, f17, 500.0f, f14);
                                    float f18 = c00Var3.f27242b;
                                    float f19 = c00Var3.d;
                                    c00Var3.f27242b = (((f16 * f19) * f17) / 500.0f) + f18;
                                    c00Var3.d = (f17 / 100.0f) + f19;
                                    c00Var3.h += f17;
                                }
                                i15++;
                                zN = zN;
                            }
                            z10 = zN;
                            d00Var.f27591b = jCurrentTimeMillis;
                            invalidate();
                        }
                    }
                }
                z10 = zN;
            } else {
                z10 = zN;
            }
        }
        if (z10) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public final void e(boolean z10) {
        rn rnVar = this.N0;
        if (rnVar == null) {
            return;
        }
        nn nnVar = rnVar.f32217e;
        boolean z11 = nnVar != null && nnVar.getVisibility() == 0;
        int iMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.N0.getVisualWidth());
        ud.c cVar = this.X0;
        if (z10) {
            float f10 = iMin;
            if ((cVar.f48504g ? cVar.f48503f : cVar.f48502e) != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(iMin);
        }
        this.Y0.a(z11, z10);
    }

    public final void f() {
        ImageView imageView = this.f23566e;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i10 = ((drawable instanceof g2) || (drawable instanceof c5)) ? 2 : 0;
        if (this.f23566e.getLayerType() != i10) {
            this.f23566e.setLayerType(i10, null);
            this.f23566e.invalidate();
        }
    }

    public final void g() {
        z zVar = this.A;
        int iMax = Math.max(0, zVar != null ? (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        d dVar = this.B;
        int iMax2 = Math.max(0, dVar != null ? (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.F) {
            iMax = iMax2;
        }
        this.f23557a1.a(iMax > 0, this.f23571f1);
        ud.c cVar = this.Z0;
        float f10 = iMax;
        if ((cVar.f48504g ? cVar.f48503f : cVar.f48502e) != f10) {
            if (this.f23571f1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f23590q0;
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
        return this.f23575h1;
    }

    public h5 getAdditionalSubtitleTextView() {
        return this.f23593s;
    }

    public ImageView getBackButton() {
        return this.f23566e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public x4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f23600x;
    }

    public boolean getCastShadows() {
        return this.f23572g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.E;
    }

    public n9 getSearchAvatarImageView() {
        return this.f23569f;
    }

    public int getShadowAlpha() {
        return this.f23574h0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f23591r == null || (charSequence = this.f23599w0) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public h5 getSubtitleTextView() {
        return this.f23591r;
    }

    public String getTitle() {
        h5 h5Var = this.f23584n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        h5 h5Var = this.f23584n[0];
        if (h5Var != null) {
            return h5Var.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public h5 getTitleTextView() {
        return this.f23584n[0];
    }

    public h5 getTitleTextView2() {
        return this.f23584n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.B0;
    }

    public void h(boolean z10) {
        z zVar;
        if (!this.f23578j0 || (zVar = this.A) == null) {
            return;
        }
        zVar.j(z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final z i() {
        return j(null);
    }

    public final z j(String str) {
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
        dVar2.setTranslationX(this.K0 ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.B.setGlassMode(this.K0);
        d dVar3 = this.B;
        dVar3.f23985c = true;
        dVar3.setClickable(true);
        if (!this.K0) {
            this.B.setBackgroundColor(g6.v0(g6.f23393w8, this.E0));
        }
        addView(this.B, indexOfChild(this.f23566e));
        this.B.setPadding(0, this.E ? AndroidUtilities.statusBarHeight : 0, 0, 0);
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
        if (this.f23575h1 == null) {
            jh.i iVar = new jh.i(this, getContext(), this.E0, this.J0);
            this.f23575h1 = iVar;
            iVar.setClipChildren(false);
            addView(this.f23575h1);
        }
    }

    public final void l() {
        if (this.f23593s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23593s = h5Var;
        h5Var.setGravity(3);
        this.f23593s.setVisibility(8);
        this.f23593s.setTextColor(g6.v0(g6.B8, this.E0));
        addView(this.f23593s, 0, h7.z5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f23566e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f23566e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23566e.setBackgroundDrawable(g6.f0(this.f23582l0, 1, -1));
        this.f23566e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f23566e, h7.z5.e(54, 54, 51));
        this.f23566e.setOnClickListener(new b(this, 1));
        this.f23566e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.A;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.A = zVar2;
        addView(zVar2, 0, h7.z5.e(-2, -1, 5));
        return this.A;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23603y0 = true;
        P();
        if (this.F) {
            int i10 = this.f23598w;
            if (i10 == 0) {
                i10 = this.f23600x;
            }
            if (i10 == 0 || this.K0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.b.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(this.f23584n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23603y0 = false;
        P();
        if (this.F) {
            int i10 = this.f23600x;
            if (i10 == 0 || this.f23598w == 0 || this.K0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (i0.b.f(i10) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable drawableY0;
        if (this.N && !this.f23567e0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (drawableY0 = g6.y0()) != null && drawableY0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.R = true;
            kv0 kv0Var = this.O;
            h5[] h5VarArr = this.f23584n;
            if (kv0Var == null) {
                this.P = null;
                this.O = new kv0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.O = null;
                d00 d00Var = new d00();
                d00Var.f27592c = new ArrayList();
                d00Var.d = new ArrayList();
                Paint paint = new Paint(1);
                d00Var.f27590a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(g6.w0(null, g6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    d00Var.d.add(new c00(d00Var));
                }
                this.P = d00Var;
                h5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.D0;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp;
        h5[] h5VarArr;
        int measuredWidth;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        h5 h5Var;
        int measuredWidth2;
        int i19 = this.E ? AndroidUtilities.statusBarHeight : 0;
        if (this.T0 != getMeasuredWidth()) {
            this.T0 = getMeasuredWidth();
            e(this.X0.f48504g);
        }
        ImageView imageView = this.f23566e;
        if (imageView == null || imageView.getVisibility() == 8) {
            iDp = AndroidUtilities.dp(this.K0 ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.f23566e;
            imageView2.layout(0, i19, imageView2.getMeasuredWidth(), this.f23566e.getMeasuredHeight() + i19);
            iDp = AndroidUtilities.dp(this.K0 ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i20 = iDp + this.S0;
        z zVar = this.A;
        if (zVar != null && zVar.getVisibility() != 8) {
            if (this.A.p()) {
                measuredWidth2 = AndroidUtilities.dp(this.f23576i0 ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - this.A.getMeasuredWidth();
            }
            z zVar2 = this.A;
            zVar2.layout(measuredWidth2, i19, zVar2.getMeasuredWidth() + measuredWidth2, this.A.getMeasuredHeight() + i19);
        }
        int i21 = 0;
        while (true) {
            h5VarArr = this.f23584n;
            if (i21 >= 2) {
                break;
            }
            h5 h5Var2 = h5VarArr[i21];
            if (h5Var2 != null && h5Var2.getVisibility() != 8) {
                boolean z11 = this.f23596u0;
                int currentActionBarHeight = ((((z11 && i21 == 0) || (!z11 && i21 == 1)) && this.f23594s0 && this.f23595t0) || (h5Var = this.f23591r) == null || h5Var.getVisibility() == 8) ? (getCurrentActionBarHeight() - h5VarArr[i21].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - h5VarArr[i21].getTextHeight()) / 2);
                h5 h5Var3 = h5VarArr[i21];
                int i22 = currentActionBarHeight + i19;
                h5Var3.layout(i20, i22 - h5Var3.getPaddingTop(), h5VarArr[i21].getMeasuredWidth() + i20, h5VarArr[i21].getPaddingBottom() + ((h5VarArr[i21].getTextHeight() + i22) - h5VarArr[i21].getPaddingTop()));
            }
            i21++;
        }
        if (this.f23575h1 != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.f23575h1.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            jh.i iVar = this.f23575h1;
            int i23 = currentActionBarHeight2 + i19;
            iVar.layout(i20, i23, iVar.getMeasuredWidth() + i20, this.f23575h1.getMeasuredHeight() + i23);
        }
        h5 h5Var4 = this.f23591r;
        if (h5Var4 != null && h5Var4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.f23591r.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            h5 h5Var5 = this.f23591r;
            int i24 = currentActionBarHeight3 + i19;
            h5Var5.layout(i20, i24, h5Var5.getMeasuredWidth() + i20, this.f23591r.getTextHeight() + i24);
        }
        h5 h5Var6 = this.f23593s;
        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.f23593s.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i25 = getResources().getConfiguration().orientation;
            }
            int iDp2 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            h5 h5Var7 = this.f23593s;
            int i26 = iDp2 + i19;
            h5Var7.layout(i20, i26, h5Var7.getMeasuredWidth() + i20, this.f23593s.getTextHeight() + i26);
        }
        n9 n9Var = this.f23569f;
        if (n9Var != null) {
            n9Var.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.f23569f.getMeasuredHeight()) / 2) + i19, this.f23569f.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.f23569f.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i19);
        }
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != this.f23575h1 && childAt != this.f23591r && childAt != this.A && childAt != this.f23566e && childAt != this.f23593s && childAt != this.f23569f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth3 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i28 = layoutParams.gravity;
                if (i28 == -1) {
                    i28 = 51;
                }
                int i29 = i28 & 112;
                int i30 = i28 & 7;
                if (i30 != 1) {
                    if (i30 != 5) {
                        i15 = layoutParams.leftMargin;
                    } else {
                        measuredWidth = getMeasuredWidth() - measuredWidth3;
                        i14 = layoutParams.rightMargin;
                    }
                    if (i29 != 16) {
                        if (i29 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i13 - i11) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        childAt.layout(i15, i18, measuredWidth3 + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth3 + i15, measuredHeight + i18);
                } else {
                    measuredWidth = ((getMeasuredWidth() - measuredWidth3) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                }
                i15 = measuredWidth - i14;
                if (i29 != 16) {
                    if (i29 != 80) {
                        i18 = layoutParams.topMargin;
                    } else {
                        i16 = (i13 - i11) - measuredHeight;
                        i17 = layoutParams.bottomMargin;
                    }
                    childAt.layout(i15, i18, measuredWidth3 + i15, measuredHeight + i18);
                } else {
                    i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                    i17 = layoutParams.bottomMargin;
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth3 + i15, measuredHeight + i18);
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int iDp;
        h5[] h5VarArr;
        h5 h5Var;
        h5 h5Var2;
        int iMakeMeasureSpec;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i12 = 1;
        kVar.D = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.B;
        if (dVar != null) {
            dVar.setPadding(0, kVar.E ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        kVar.D = false;
        kVar.setMeasuredDimension(size, currentActionBarHeight + (kVar.E ? AndroidUtilities.statusBarHeight : 0) + kVar.K);
        ImageView imageView = kVar.f23566e;
        if (imageView == null || imageView.getVisibility() == 8) {
            iDp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            kVar.f23566e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), iMakeMeasureSpec2);
            iDp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        z zVar = kVar.A;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f10 = 66.0f;
            if (kVar.A.p() && !kVar.f23578j0) {
                kVar.A.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec2);
                int iL = kVar.A.l();
                if (kVar.f23576i0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.A.l() + (size - AndroidUtilities.dp(f10)), 1073741824);
                if (!kVar.f23602y) {
                    kVar.A.r(-iL);
                }
            } else if (kVar.f23578j0) {
                if (kVar.f23576i0) {
                    f10 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f10 = 74.0f;
                }
                iMakeMeasureSpec = rl.d(f10, size, 1073741824);
                if (!kVar.f23602y) {
                    kVar.A.r(0.0f);
                }
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f23602y) {
                    kVar.A.r(0.0f);
                }
            }
            kVar.A.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        int i13 = 0;
        while (true) {
            h5VarArr = kVar.f23584n;
            if (i13 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = kVar.f23591r) != null && h5Var.getVisibility() != 8)) {
                z zVar2 = kVar.A;
                int iMax = Math.max(org.telegram.messenger.y1.B(16.0f, size - (zVar2 != null ? zVar2.getMeasuredWidth() : 0), iDp) - kVar.T, 0);
                boolean z10 = kVar.f23596u0;
                int i14 = 20;
                if (((z10 && i13 == 0) || (!z10 && i13 == i12)) && kVar.f23594s0 && kVar.f23595t0) {
                    h5 h5Var4 = h5VarArr[i13];
                    if (kVar.K0) {
                        i14 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i14 = 18;
                    }
                    h5Var4.setTextSize(i14);
                } else {
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 == null || h5Var5.getVisibility() == 8 || (h5Var2 = kVar.f23591r) == null || h5Var2.getVisibility() == 8) {
                        h5 h5Var6 = h5VarArr[i13];
                        if (h5Var6 != null && h5Var6.getVisibility() != 8) {
                            h5 h5Var7 = h5VarArr[i13];
                            if (kVar.K0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 18;
                            }
                            h5Var7.setTextSize(i14);
                        }
                        h5 h5Var8 = kVar.f23591r;
                        if (h5Var8 != null && h5Var8.getVisibility() != 8) {
                            kVar.f23591r.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        h5 h5Var9 = kVar.f23593s;
                        if (h5Var9 != null) {
                            h5Var9.setTextSize((AndroidUtilities.isTablet() || kVar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        h5 h5Var10 = h5VarArr[i13];
                        if (h5Var10 != null) {
                            if (kVar.K0) {
                                i14 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i14 = 18;
                            }
                            h5Var10.setTextSize(i14);
                        }
                        kVar.f23591r.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        h5 h5Var11 = kVar.f23593s;
                        if (h5Var11 != null) {
                            h5Var11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                h5 h5Var12 = h5VarArr[i13];
                if (h5Var12 != null && h5Var12.getVisibility() != 8) {
                    h5VarArr[i13].measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h5VarArr[i13].getPaddingBottom() + h5VarArr[i13].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f23597v0) {
                        CharSequence text = h5VarArr[i13].getText();
                        h5 h5Var13 = h5VarArr[i13];
                        h5Var13.setPivotX(h5Var13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i13].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i13].setPivotX(0.0f);
                        h5VarArr[i13].setPivotY(0.0f);
                    }
                }
                h5 h5Var14 = kVar.f23591r;
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    kVar.f23591r.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                jh.i iVar = kVar.f23575h1;
                if (iVar != null) {
                    iVar.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                h5 h5Var15 = kVar.f23593s;
                if (h5Var15 != null && h5Var15.getVisibility() != 8) {
                    kVar.f23593s.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i13++;
            i12 = 1;
        }
        n9 n9Var = kVar.f23569f;
        if (n9Var != null) {
            n9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = kVar.getChildAt(i15);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != kVar.f23575h1 && childAt != kVar.f23591r && childAt != kVar.A && childAt != kVar.f23566e && childAt != kVar.f23593s && childAt != kVar.f23569f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i15++;
            kVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.I;
    }

    public final void p() {
        if (this.f23591r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23591r = h5Var;
        h5Var.setGravity(3);
        this.f23591r.setVisibility(8);
        this.f23591r.setTextColor(g6.v0(g6.B8, this.E0));
        addView(this.f23591r, 0, h7.z5.e(-2, -2, 51));
    }

    public final void q(int i10) {
        h5[] h5VarArr = this.f23584n;
        if (h5VarArr[i10] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        h5VarArr[i10] = h5Var;
        h5Var.setGravity(19);
        int i11 = this.f23592r0;
        if (i11 != 0) {
            h5VarArr[i10].setTextColor(i11);
        } else {
            h5VarArr[i10].setTextColor(g6.v0(g6.A8, this.E0));
        }
        h5 h5Var2 = h5VarArr[i10];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
        h5VarArr[i10].setTypeface(AndroidUtilities.bold());
        h5VarArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        h5VarArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        h5VarArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.C0) {
            this.B0.addView(h5VarArr[i10], 0, h7.z5.e(-2, -2, 51));
        } else {
            addView(h5VarArr[i10], 0, h7.z5.e(-2, -2, 51));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void s() {
        d dVar = this.B;
        if (dVar == null || !this.F) {
            return;
        }
        int childCount = dVar.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = dVar.getChildAt(i11);
            if (childAt instanceof v0) {
                ((v0) childAt).n();
            }
        }
        this.F = false;
        g();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<d, Float>) property, 0.0f));
        if (this.M != null) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.M;
                if (i12 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i12];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.M[i12], (Property<View, Float>) property, 1.0f));
                }
                i12++;
            }
        }
        boolean z10 = this.f23578j0;
        h5[] h5VarArr = this.f23584n;
        if (!z10) {
            h5 h5Var = h5VarArr[0];
            if (h5Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<h5, Float>) property, 1.0f));
            }
            if (this.f23591r != null && !TextUtils.isEmpty(this.f23599w0)) {
                arrayList.add(ObjectAnimator.ofFloat(this.f23591r, (Property<h5, Float>) property, 1.0f));
            }
        }
        z zVar = this.A;
        if (zVar != null) {
            arrayList.add(ObjectAnimator.ofFloat(zVar, (Property<z, Float>) property, 1.0f));
        }
        int i13 = this.f23600x;
        if (i13 == 0 || this.K0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (i0.b.f(i13) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.Q0 != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new a(this, i10));
            this.L.playTogether(valueAnimatorOfFloat);
        }
        this.L.setDuration(200L);
        this.L.addListener(new e(this, i10));
        this.L.start();
        if (!this.f23578j0) {
            h5 h5Var2 = h5VarArr[0];
            if (h5Var2 != null) {
                h5Var2.setVisibility(0);
            }
            if (this.f23591r != null && !TextUtils.isEmpty(this.f23599w0)) {
                this.f23591r.setVisibility(0);
            }
        }
        z zVar2 = this.A;
        if (zVar2 != null) {
            zVar2.setVisibility(0);
        }
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g2) {
                ((g2) drawable).c(0.0f, true);
            }
            this.f23566e.setBackgroundDrawable(g6.f0(this.f23582l0, 1, -1));
        }
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f23590q0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.B;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f23598w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        z(recyclerView, false, g6.f22999a7, g6.f23322s8);
    }

    public void setAddToContainer(boolean z10) {
        this.G = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.S0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.U = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.f23566e == null) {
            m();
        }
        this.f23566e.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.f23566e;
        this.h = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof g2) {
            g2 g2Var = (g2) drawable;
            g2Var.c(t() ? 1.0f : 0.0f, false);
            g2Var.b(this.f23587o0);
            g2Var.a(this.f23585n0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.f22827k = this.f23600x;
            c5Var.f22826j = this.f23585n0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f23566e.setColorFilter(new PorterDuffColorFilter(this.f23585n0, PorterDuff.Mode.SRC_IN));
        }
        if (this.O0) {
            this.f23566e.setColorFilter(new PorterDuffColorFilter(this.f23585n0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        if (this.f23566e == null) {
            m();
        }
        this.f23566e.setVisibility(i10 == 0 ? 8 : 0);
        this.f23566e.setImageResource(i10);
        this.f23566e.setColorFilter(new PorterDuffColorFilter(this.f23585n0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f23600x = i10;
        if (!this.G0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).f22827k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f23572g0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23572g0 = z10;
    }

    public void setChatAvatarContainer(rn rnVar) {
        this.N0 = rnVar;
    }

    public void setClipContent(boolean z10) {
        this.H = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.f23601x0 = z10;
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(zu0 zu0Var) {
        this.G0 = true;
        this.F0 = zu0Var;
        zu0Var.P.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f23566e;
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

    public void setExtraHeight(int i10) {
        this.K = i10;
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

    public void setForcedMenuMinWidth(int i10) {
        this.f23568e1 = true;
        if (this.f23563c1 != i10) {
            this.f23563c1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f23565d1 = true;
        if (this.f23560b1 != i10) {
            this.f23560b1 = i10;
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
        this.f23602y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.E = z10;
        d dVar = this.B;
        if (dVar != null) {
            dVar.setPadding(0, z10 ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f23594s0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23556a0 = onClickListener;
        h5[] h5VarArr = this.f23584n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.f23556a0);
        }
    }

    public void setSearchAvatarImageView(n9 n9Var) {
        n9 n9Var2 = this.f23569f;
        if (n9Var2 == n9Var) {
            return;
        }
        if (n9Var2 != null) {
            removeView(n9Var2);
        }
        this.f23569f = n9Var;
        if (n9Var != null) {
            addView(n9Var);
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
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

    public void setSearchFilter(pf.e0 e0Var) {
        z zVar = this.A;
        if (zVar != null) {
            zVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f23574h0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23574h0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.f23591r == null) {
            p();
        }
        if (this.f23591r != null) {
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            this.f23591r.setVisibility((zIsEmpty || this.f23578j0) ? 8 : 0);
            this.f23591r.setAlpha(1.0f);
            if (!zIsEmpty) {
                this.f23591r.l(charSequence, false);
            }
            this.f23599w0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f23591r == null) {
            p();
        }
        this.f23591r.setTextColor(i10);
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
        I(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f23570f0 = runnable;
        this.f23564d0 = runnable;
    }

    public void setTitleColor(int i10) {
        h5[] h5VarArr = this.f23584n;
        if (h5VarArr[0] == null) {
            q(0);
        }
        this.f23592r0 = i10;
        h5VarArr[0].setTextColor(i10);
        h5VarArr[0].setEmojiColor(i10);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.T = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f23584n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.H) {
            invalidate();
        }
    }

    public final boolean t() {
        return this.B != null && this.F;
    }

    public final boolean u(String str) {
        if (this.B == null || !this.F) {
            return false;
        }
        String str2 = this.C;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public boolean v() {
        return false;
    }

    public void w(boolean z10) {
        Property property;
        this.f23578j0 = z10;
        g();
        AnimatorSet animatorSet = this.R0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.R0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean zV = v();
        if (!zV) {
            h5 h5Var = this.f23584n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.f23591r != null && !TextUtils.isEmpty(this.f23599w0)) {
                arrayList.add(this.f23591r);
                this.f23591r.setVisibility(z10 ? 4 : 0);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f23580k0, z10 ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 1));
        this.R0.playTogether(valueAnimatorOfFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f10 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.R0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 0.0f : 1.0f));
            this.R0.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.R0;
            if (!z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10));
            i10++;
        }
        n9 n9Var = this.f23569f;
        if (n9Var != null) {
            n9Var.setVisibility(0);
            this.R0.playTogether(ObjectAnimator.ofFloat(this.f23569f, (Property<n9, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.f23597v0 = true;
        requestLayout();
        this.R0.addListener(new f(this, arrayList, z10, zV));
        this.R0.setDuration(150L).start();
        ImageView imageView = this.f23566e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                c5 c5Var = (c5) drawable;
                c5Var.h = true;
                c5Var.a(z10 ? 1.0f : 0.0f, true);
            }
        }
    }

    public final void x() {
        e5 e5Var;
        z zVar = this.A;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C && (e5Var = v0Var.D) != null) {
                    e5Var.p(v0Var.f23859e);
                }
            }
        }
    }

    public final void y(String str) {
        z zVar = this.A;
        if (zVar == null || str == null) {
            return;
        }
        boolean z10 = this.f23578j0;
        boolean z11 = !z10;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    if (!z10) {
                        zVar.f23984b.w(v0Var.L(z11));
                    }
                    v0Var.H(str, false);
                    v0Var.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    public final void z(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        this.f23581k1 = i10;
        this.l1 = i11;
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(3, this, recyclerView);
        recyclerView.j(new ag.z2(l0Var, 20));
        this.f23579j1 = z10;
        if (this.f23577i1) {
            l0Var.run();
            return;
        }
        this.f23577i1 = true;
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        this.f23583m1 = !zCanScrollVertically;
        this.f23586n1 = !zCanScrollVertically ? 1.0f : 0.0f;
        b();
    }

    public void setAdaptiveBackground(kn0 kn0Var) {
        int i10 = g6.f22999a7;
        int i11 = g6.f23322s8;
        this.f23581k1 = i10;
        this.l1 = i11;
        b();
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(2, this, kn0Var);
        kn0Var.f30157f.add(l0Var);
        if (this.f23577i1) {
            l0Var.run();
            return;
        }
        this.f23577i1 = true;
        boolean zCanScrollVertically = kn0Var.canScrollVertically(-1);
        this.f23583m1 = !zCanScrollVertically;
        this.f23586n1 = !zCanScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
