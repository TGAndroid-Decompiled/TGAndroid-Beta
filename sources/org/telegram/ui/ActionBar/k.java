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
import bi.ce;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y9;
import org.telegram.ui.my0;
public class k extends FrameLayout implements oe.d, p6 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public di.i4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final u6 J0;
    public boolean K;
    public vw0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final c2.b O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public gx0 S;
    public po S0;
    public x00 T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public boolean U0;
    public boolean V;
    public Runnable V0;
    public Rect W;
    public my0 W0;
    public AnimatorSet X0;
    public int Y0;
    public int Z0;
    public eh.d f22745a;
    public int f22746a0;
    public boolean f22747a1;
    public eh.d f22748b;
    public boolean f22749b0;
    public boolean f22750b1;
    public eh.d f22751c;
    public CharSequence f22752c0;
    public float f22753c1;
    public final e5 d;
    public Drawable f22754d0;
    public final oe.e f22755d1;
    public ImageView e;
    public View.OnClickListener f22756e0;
    public final oe.b f22757e1;
    public y9 f22758f;
    public String f22759f0;
    public final oe.e f22760f1;
    public final Object[] f22761g0;
    public final oe.b f22762g1;
    public Drawable h;
    public Runnable f22763h0;
    public int f22764h1;
    public boolean f22765i0;
    public int f22766i1;
    public Runnable f22767j0;
    public boolean f22768j1;
    public boolean f22769k0;
    public boolean f22770k1;
    public int f22771l0;
    public boolean l1;
    public boolean m0;
    public boolean f22772m1;
    public final b6[] f22773n;
    public boolean f22774n0;
    public boolean f22775n1;
    public float f22776o0;
    public int f22777o1;
    public int f22778p0;
    public di.k f22779p1;
    public int f22780q0;
    public boolean f22781q1;
    public b6 f22782r;
    public int f22783r0;
    public boolean f22784r1;
    public b6 f22785s;
    public int f22786s0;
    public int f22787s1;
    public r2 f22788t0;
    public int f22789t1;
    public j f22790u0;
    public boolean f22791u1;
    public View v;
    public int f22792v0;
    public float f22793v1;
    public int f22794w;
    public boolean f22795w0;
    public ValueAnimator f22796w1;
    public int f22797x;
    public boolean f22798x0;
    public boolean f22799y;
    public boolean f22800y0;
    public boolean f22801z0;

    public k(Context context, u6 u6Var) {
        super(context);
        this.d = e5.f22605a;
        this.f22773n = new b6[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f22761g0 = new Object[3];
        this.f22769k0 = true;
        this.f22771l0 = 255;
        this.f22792v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new c2.b(this);
        ds dsVar = ds.h;
        this.f22755d1 = new oe.e(0, this, dsVar, 380L);
        this.f22757e1 = new oe.b(0, this, dsVar, 380L, false);
        this.f22760f1 = new oe.e(0, this, dsVar, 320L);
        this.f22762g1 = new oe.b(0, this, dsVar, 320L, false);
        this.f22775n1 = true;
        this.f22777o1 = 255;
        this.f22791u1 = true;
        this.f22793v1 = 1.0f;
        this.J0 = u6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View o(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i10, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).H(i10);
                }
                i11++;
            }
        } else if (!z10 && (zVar = this.E) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).H(i10);
                }
                i11++;
            }
        }
    }

    public final void B(int i10, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).O(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (zVar = this.E) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).O(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void C(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (zVar = this.E) != null) {
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void D(int i10, boolean z10) {
        z zVar = this.E;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.u()) {
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

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public final void F(CharSequence charSequence, org.telegram.ui.Components.r5 r5Var) {
        int i10;
        b6[] b6VarArr = this.f22773n;
        if (charSequence != null && b6VarArr[0] == null) {
            n(0);
        }
        b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            if (charSequence != null && !this.f22774n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            b6Var.setVisibility(i10);
            b6 b6Var2 = b6VarArr[0];
            this.f22752c0 = charSequence;
            b6Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f22754d0;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable).l(null);
                }
            }
            b6 b6Var3 = b6VarArr[0];
            this.f22754d0 = r5Var;
            b6Var3.i(r5Var);
            if (this.C0) {
                Drawable drawable2 = this.f22754d0;
                if (drawable2 instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable2).l(b6VarArr[0]);
                }
            }
            b6VarArr[0].setRightDrawableOnClick(this.f22756e0);
        }
        this.f22800y0 = false;
    }

    public final void G(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f7;
        b6[] b6VarArr = this.f22773n;
        if (b6VarArr[0] != null && charSequence != null) {
            if (this.f22795w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f22782r.getVisibility() != 0) {
                    this.f22782r.setVisibility(0);
                    this.f22782r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f22782r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                vh.p(animate, f7, 220L);
            }
            b6 b6Var = b6VarArr[1];
            if (b6Var != null) {
                if (b6Var.getParent() != null) {
                    ((ViewGroup) b6VarArr[1].getParent()).removeView(b6VarArr[1]);
                }
                b6VarArr[1] = null;
            }
            b6VarArr[1] = b6VarArr[0];
            b6VarArr[0] = null;
            setTitle(charSequence);
            this.f22800y0 = z10;
            b6VarArr[0].setAlpha(0.0f);
            if (!z11) {
                b6 b6Var2 = b6VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                b6Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = b6VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f22798x0 = true;
            ViewPropertyAnimator alpha = b6VarArr[1].animate().alpha(0.0f);
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

    public final void H(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        b6 b6Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f22749b0 && this.f22788t0.parentLayout != null) {
            Object[] objArr = this.f22761g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.f22747a1) {
                String str3 = this.f22759f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f22759f0 = str;
                        Drawable drawable = null;
                        if (this.f22779p1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f22779p1.c(charSequence, true);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f22752c0;
                        }
                        if (str == null) {
                            drawable = this.f22754d0;
                        }
                        c2.b bVar = this.O0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            bVar.A(valueOf, indexOf);
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
                        this.f22765i0 = z11;
                        b6[] b6VarArr = this.f22773n;
                        if ((spannableString == null || b6VarArr[0] != null) && getMeasuredWidth() != 0 && ((b6Var = b6VarArr[0]) == null || b6Var.getVisibility() == 0)) {
                            b6 b6Var2 = b6VarArr[0];
                            if (b6Var2 != null) {
                                b6Var2.animate().cancel();
                                b6 b6Var3 = b6VarArr[1];
                                if (b6Var3 != null) {
                                    b6Var3.animate().cancel();
                                }
                                if (b6VarArr[1] == null) {
                                    n(1);
                                }
                                b6VarArr[1].k(spannableString);
                                b6VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                b6VarArr[1].i(drawable);
                                b6VarArr[1].setRightDrawableOnClick(this.f22756e0);
                                if (drawable instanceof org.telegram.ui.Components.r5) {
                                    ((org.telegram.ui.Components.r5) drawable).l(b6VarArr[1]);
                                }
                                if (z10) {
                                    bVar.c(b6VarArr[1]);
                                }
                                this.f22747a1 = true;
                                b6 b6Var4 = b6VarArr[1];
                                b6VarArr[1] = b6VarArr[0];
                                b6VarArr[0] = b6Var4;
                                b6Var4.setAlpha(0.0f);
                                b6VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                b6VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = b6VarArr[1].animate().alpha(0.0f);
                                if (this.f22782r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f22801z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            n(0);
                            if (this.R) {
                                b6VarArr[0].invalidate();
                                invalidate();
                            }
                            b6VarArr[0].k(spannableString);
                            b6VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            b6VarArr[0].i(drawable);
                            b6VarArr[0].setRightDrawableOnClick(this.f22756e0);
                            if (drawable instanceof org.telegram.ui.Components.r5) {
                                ((org.telegram.ui.Components.r5) drawable).l(b6VarArr[0]);
                            }
                            if (z10) {
                                bVar.c(b6VarArr[0]);
                            } else {
                                bVar.v(b6VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f22763h0;
                        }
                        this.f22767j0 = runnable;
                    }
                }
            }
        }
    }

    public final void I(ch.b bVar, fh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        eh.d c10 = bVar.c(this, null, false);
        c10.v(eVar);
        c10.w(AndroidUtilities.dp(6.0f));
        this.f22745a = c10;
        if (z10) {
            c10.y(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.x(AndroidUtilities.dp(23.0f));
        }
        eh.d c11 = bVar.c(this, null, false);
        c11.v(eVar);
        vh.s(c11, AndroidUtilities.dp(23.0f), 6.0f);
        this.f22748b = c11;
        eh.d c12 = bVar.c(this, null, false);
        c12.v(eVar);
        vh.s(c12, AndroidUtilities.dp(23.0f), 6.0f);
        this.f22751c = c12;
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

    public boolean J(View view) {
        if (this.L) {
            b6[] b6VarArr = this.f22773n;
            if (view == b6VarArr[0] || view == b6VarArr[1] || view == this.f22782r || view == this.E || view == this.e || view == this.f22785s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void K(View[] viewArr, boolean[] zArr) {
        if (this.F != null && !this.J) {
            this.J = true;
            f();
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
            if (this.f22794w == 0) {
                if (!this.f22774n0) {
                    b6 b6Var = this.f22773n[0];
                    if (b6Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(b6Var, property, 0.0f));
                    }
                    if (this.f22782r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f22782r, property, 0.0f));
                    }
                }
                z zVar = this.E;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f22794w;
            if (i10 == 0) {
                i10 = this.f22797x;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.a.h(i10) < 0.699999988079071d) {
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
            if (this.W0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ce(11, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof j2) {
                    ((j2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(y6.g0(this.f22780q0, 1, -1));
            }
        }
    }

    public final void L() {
        boolean z10;
        if (this.C0 && this.D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != z10) {
            this.E0 = z10;
            c2.b bVar = this.O0;
            if (z10) {
                bVar.f5929a = true;
                AnimatorSet animatorSet = (AnimatorSet) bVar.f5931c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            bVar.f5929a = false;
            ((AnimatorSet) bVar.f5931c).cancel();
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f22789t1));
        hashSet.add(Integer.valueOf(this.f22787s1));
    }

    public final void b() {
        float f7;
        int w02;
        int w03;
        if (this.f22781q1) {
            if (this.f22784r1) {
                f7 = 1.0f;
            } else {
                f7 = this.f22793v1;
            }
            int i10 = this.f22789t1;
            u6 u6Var = this.J0;
            if (i10 == -1) {
                w02 = 0;
            } else {
                w02 = y6.w0(i10, u6Var);
            }
            int i11 = this.f22787s1;
            if (i11 == -1) {
                w03 = 0;
            } else {
                w03 = y6.w0(i11, u6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - f7) * 255.0f));
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
            this.f22801z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) ds.f27586f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        po poVar = this.S0;
        if (poVar == null) {
            return;
        }
        lo loVar = poVar.e;
        if (loVar != null && loVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.S0.getVisualWidth());
        oe.e eVar = this.f22755d1;
        if (z10) {
            if (eVar.h) {
                f7 = eVar.f19335g;
            } else {
                f7 = eVar.f19334f;
            }
            float f10 = min;
            if (f7 != f10) {
                eVar.a(f10);
            }
        } else {
            eVar.c(min);
        }
        this.f22757e1.a(z11, z10);
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
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x9;
            float f10 = y3;
            View o10 = o(this, f7, f10, this.S0);
            if (o10 == null) {
                o10 = o(this, f7, f10, null);
            }
            eh.d dVar = this.f22745a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x9, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (o10 != null && o10 != this.S0) {
                eh.d dVar2 = this.f22748b;
                if (dVar2 != null && dVar2.getBounds().contains(x9, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                eh.d dVar3 = this.f22751c;
                if (dVar3 == null || !dVar3.getBounds().contains(x9, y3)) {
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

    public final void e() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof j2) && !(drawable instanceof k5)) {
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

    public final void f() {
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
        this.f22762g1.a(z10, this.l1);
        oe.e eVar = this.f22760f1;
        if (eVar.h) {
            f7 = eVar.f19335g;
        } else {
            f7 = eVar.f19334f;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.l1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public void g(boolean z10) {
        z zVar;
        if (this.f22774n0 && (zVar = this.E) != null) {
            zVar.i(z10);
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f22790u0;
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
        return this.f22779p1;
    }

    public b6 getAdditionalSubtitleTextView() {
        return this.f22785s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public e5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f22797x;
    }

    public boolean getCastShadows() {
        return this.f22769k0;
    }

    public int getExtraHeight() {
        return this.O;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.O;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public y9 getSearchAvatarImageView() {
        return this.f22758f;
    }

    public int getShadowAlpha() {
        return this.f22771l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f22782r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        b6 b6Var = this.f22782r;
        if (b6Var != null) {
            return b6Var.getTextColor();
        }
        return 0;
    }

    public b6 getSubtitleTextView() {
        return this.f22782r;
    }

    public String getTitle() {
        b6 b6Var = this.f22773n[0];
        if (b6Var == null) {
            return null;
        }
        return b6Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f22792v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        b6 b6Var = this.f22773n[0];
        if (b6Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return b6Var.getPaint().getFontMetricsInt();
    }

    public b6 getTitleTextView() {
        return this.f22773n[0];
    }

    public b6 getTitleTextView2() {
        return this.f22773n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final z h() {
        return i(null);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final z i(String str) {
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
        dVar3.f23779c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            f7.i(y6.f23713w8, this.F, this.J0);
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

    public final void j() {
        if (this.f22785s != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        this.f22785s = b6Var;
        b6Var.setGravity(3);
        this.f22785s.setVisibility(8);
        f7.Y(this.f22785s, y6.B8, this.J0);
        addView(this.f22785s, 0, gb1.i(-2, -2, 51));
    }

    public final void k() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(y6.g0(this.f22778p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, gb1.i(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z l() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, gb1.i(-2, -1, 5));
        return this.E;
    }

    public final void m() {
        if (this.f22782r != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        this.f22782r = b6Var;
        b6Var.setGravity(3);
        this.f22782r.setVisibility(8);
        f7.Y(this.f22782r, y6.B8, this.J0);
        addView(this.f22782r, 0, gb1.i(-2, -2, 51));
    }

    public final void n(int i10) {
        int i11;
        View[] viewArr = this.f22773n;
        if (viewArr[i10] != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        viewArr[i10] = b6Var;
        if (this.H0) {
            i11 = 17;
        } else {
            i11 = 19;
        }
        b6Var.setGravity(i11);
        int i12 = this.f22792v0;
        if (i12 != 0) {
            viewArr[i10].setTextColor(i12);
        } else {
            f7.Y(viewArr[i10], y6.A8, this.J0);
        }
        b6 b6Var2 = viewArr[i10];
        b6Var2.setEmojiColor(b6Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, gb1.i(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, gb1.i(-2, -2, 51));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        L();
        if (this.J) {
            int i10 = this.f22794w;
            if (i10 == 0) {
                i10 = this.f22797x;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.a.h(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f22754d0;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).l(this.f22773n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        L();
        if (this.J) {
            int i10 = this.f22797x;
            if (i10 != 0 && this.f22794w != 0 && !this.P0) {
                if (i0.a.h(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f22754d0;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable A0;
        if (this.R && !this.f22765i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (A0 = y6.A0()) != null && A0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            gx0 gx0Var = this.S;
            b6[] b6VarArr = this.f22773n;
            if (gx0Var == null) {
                this.T = null;
                this.S = new gx0(0);
                b6VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f34575c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f34573a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(y6.x0(null, y6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new w00(obj));
                }
                this.T = obj;
                b6VarArr[0].invalidate();
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
        b6[] b6VarArr;
        b6 b6Var;
        int i13;
        int i14;
        int C;
        int i15;
        int i16;
        b6 b6Var2;
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
            if (kVar.E.o() && !kVar.f22774n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = kVar.E.k();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.k() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f22799y) {
                    kVar.E.q(-k10);
                }
            } else if (kVar.f22774n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = vh.x(f11, size, 1073741824);
                if (!kVar.f22799y) {
                    kVar.E.q(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f22799y) {
                    kVar.E.q(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i21 = 0;
        while (true) {
            b6VarArr = kVar.f22773n;
            if (i21 >= 2) {
                break;
            }
            b6 b6Var3 = b6VarArr[0];
            if ((b6Var3 != null && b6Var3.getVisibility() != 8) || ((b6Var = kVar.f22782r) != null && b6Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                if (zVar2 != null) {
                    i14 = zVar2.getMeasuredWidth();
                } else {
                    i14 = 0;
                }
                if (kVar.H0) {
                    C = size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + i14) + kVar.f22746a0) * 2);
                } else {
                    C = org.telegram.messenger.t.C(16.0f, size - i14, dp) - kVar.f22746a0;
                }
                int max = Math.max(C, 0);
                boolean z10 = kVar.f22800y0;
                int i22 = 20;
                if (((z10 && i21 == 0) || (!z10 && i21 == i20)) && kVar.f22795w0 && kVar.f22798x0) {
                    b6 b6Var4 = b6VarArr[i21];
                    i13 = i20;
                    if (kVar.P0) {
                        i22 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i22 = 18;
                    }
                    b6Var4.setTextSize(i22);
                } else {
                    i13 = i20;
                    b6 b6Var5 = b6VarArr[0];
                    if (b6Var5 != null && b6Var5.getVisibility() != 8 && (b6Var2 = kVar.f22782r) != null && b6Var2.getVisibility() != 8) {
                        b6 b6Var6 = b6VarArr[i21];
                        if (b6Var6 != null) {
                            if (kVar.P0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i22 = 18;
                            }
                            b6Var6.setTextSize(i22);
                        }
                        b6 b6Var7 = kVar.f22782r;
                        if (AndroidUtilities.isTablet()) {
                            i17 = 16;
                        } else {
                            i17 = 14;
                        }
                        b6Var7.setTextSize(i17);
                        b6 b6Var8 = kVar.f22785s;
                        if (b6Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i18 = 16;
                            } else {
                                i18 = 14;
                            }
                            b6Var8.setTextSize(i18);
                        }
                    } else {
                        b6 b6Var9 = b6VarArr[i21];
                        if (b6Var9 != null && b6Var9.getVisibility() != 8) {
                            b6 b6Var10 = b6VarArr[i21];
                            if (kVar.P0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i22 = 18;
                            }
                            b6Var10.setTextSize(i22);
                        }
                        b6 b6Var11 = kVar.f22782r;
                        if (b6Var11 != null && b6Var11.getVisibility() != 8) {
                            b6 b6Var12 = kVar.f22782r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i16 = 14;
                            } else {
                                i16 = 16;
                            }
                            b6Var12.setTextSize(i16);
                        }
                        b6 b6Var13 = kVar.f22785s;
                        if (b6Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            b6Var13.setTextSize(i15);
                        }
                    }
                }
                b6 b6Var14 = b6VarArr[i21];
                if (b6Var14 != null && b6Var14.getVisibility() != 8) {
                    b6VarArr[i21].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(b6VarArr[i21].getPaddingBottom() + b6VarArr[i21].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f22801z0) {
                        CharSequence text = b6VarArr[i21].getText();
                        b6 b6Var15 = b6VarArr[i21];
                        b6Var15.setPivotX(b6Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        b6VarArr[i21].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        b6VarArr[i21].setPivotX(0.0f);
                        b6VarArr[i21].setPivotY(0.0f);
                    }
                }
                b6 b6Var16 = kVar.f22782r;
                if (b6Var16 != null && b6Var16.getVisibility() != 8) {
                    kVar.f22782r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                di.k kVar2 = kVar.f22779p1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                b6 b6Var17 = kVar.f22785s;
                if (b6Var17 != null && b6Var17.getVisibility() != 8) {
                    kVar.f22785s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i13 = i20;
            }
            i21++;
            i20 = i13;
        }
        int i23 = i20;
        y9 y9Var = kVar.f22758f;
        if (y9Var != null) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = kVar.getChildAt(i24);
            if (childAt.getVisibility() != 8 && childAt != b6VarArr[0] && childAt != b6VarArr[i23] && childAt != kVar.f22779p1 && childAt != kVar.f22782r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f22785s && childAt != kVar.f22758f) {
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

    public void p() {
        d dVar = this.F;
        if (dVar != null && this.J) {
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).o();
                }
            }
            this.J = false;
            f();
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
            boolean z10 = this.f22774n0;
            b6[] b6VarArr = this.f22773n;
            if (!z10) {
                b6 b6Var = b6VarArr[0];
                if (b6Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(b6Var, property, 1.0f));
                }
                if (this.f22782r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f22782r, property, 1.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f22797x;
            if (i12 != 0 && !this.P0) {
                if (i0.a.h(i12) < 0.699999988079071d) {
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
            if (this.W0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 2));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f22774n0) {
                b6 b6Var2 = b6VarArr[0];
                if (b6Var2 != null) {
                    b6Var2.setVisibility(0);
                }
                if (this.f22782r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f22782r.setVisibility(0);
                }
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof j2) {
                    ((j2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(y6.g0(this.f22778p0, 1, -1));
            }
        }
    }

    public final boolean q() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean r(String str) {
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

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public boolean s() {
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f22790u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            f7.r(dVar);
            this.F.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f22794w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            f7.r(view);
            this.v.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        w(recyclerView, y6.f23299a7, y6.f23636s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.Y0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f22749b0 = z10;
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
            k();
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
        if (drawable instanceof j2) {
            j2 j2Var = (j2) drawable;
            if (q()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j2Var.c(f7, false);
            j2Var.b(this.f22786s0);
            j2Var.a(this.f22783r0);
        } else if (drawable instanceof k5) {
            k5 k5Var = (k5) drawable;
            k5Var.f22816k = this.f22797x;
            k5Var.f22815j = this.f22783r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f22783r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.U0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f22783r0, PorterDuff.Mode.SRC_IN));
        }
        e();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.e == null) {
            k();
        }
        ImageView imageView = this.e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.f22783r0, PorterDuff.Mode.SRC_IN));
        e();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f22797x = i10;
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof k5) {
                ((k5) drawable).f22816k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f22769k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f22769k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        int i10;
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        b6[] b6VarArr = this.f22773n;
        int length = b6VarArr.length;
        int i11 = 0;
        while (true) {
            i10 = 19;
            if (i11 >= length) {
                break;
            }
            b6 b6Var = b6VarArr[i11];
            if (b6Var != null) {
                if (z10) {
                    i10 = 17;
                }
                b6Var.setGravity(i10);
            }
            i11++;
        }
        b6 b6Var2 = this.f22782r;
        if (b6Var2 != null) {
            if (z10) {
                i10 = 17;
            }
            b6Var2.setGravity(i10);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(po poVar) {
        this.S0 = poVar;
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

    public void setDrawBlurBackground(vw0 vw0Var) {
        this.L0 = true;
        this.K0 = vw0Var;
        vw0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.f22775n1 != z10) {
            this.f22775n1 = z10;
            invalidate();
        }
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
        this.f22770k1 = true;
        if (this.f22766i1 != i10) {
            this.f22766i1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f22768j1 = true;
        if (this.f22764h1 != i10) {
            this.f22764h1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.f22777o1 != i10) {
            this.f22777o1 = i10;
            invalidate();
        }
        eh.d dVar = this.f22745a;
        if (dVar != null && dVar.f19461b != i10) {
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
        this.f22799y = z10;
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
        this.V0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f22795w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f22756e0 = onClickListener;
        b6[] b6VarArr = this.f22773n;
        b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            b6Var.setRightDrawableOnClick(onClickListener);
        }
        b6 b6Var2 = b6VarArr[1];
        if (b6Var2 != null) {
            b6Var2.setRightDrawableOnClick(this.f22756e0);
        }
    }

    public void setSearchAvatarImageView(y9 y9Var) {
        y9 y9Var2 = this.f22758f;
        if (y9Var2 != y9Var) {
            if (y9Var2 != null) {
                removeView(y9Var2);
            }
            this.f22758f = y9Var;
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
        if (this.f22753c1 != f7) {
            this.f22753c1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(ig.p0 p0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(p0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f22771l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f22771l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f22750b1 != z10) {
            this.f22750b1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f22782r == null) {
            m();
        }
        if (this.f22782r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            b6 b6Var = this.f22782r;
            if (!isEmpty && !this.f22774n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b6Var.setVisibility(i10);
            this.f22782r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f22782r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f22782r == null) {
            m();
        }
        f7.r(this.f22782r);
        this.f22782r.setTextColor(i10);
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
        F(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f22767j0 = runnable;
        this.f22763h0 = runnable;
    }

    public void setTitleColor(int i10) {
        b6[] b6VarArr = this.f22773n;
        if (b6VarArr[0] == null) {
            n(0);
        }
        this.f22792v0 = i10;
        f7.r(b6VarArr[0]);
        b6VarArr[0].setTextColor(i10);
        b6VarArr[0].setEmojiColor(i10);
        b6 b6Var = b6VarArr[1];
        if (b6Var != null) {
            f7.r(b6Var);
            b6VarArr[1].setTextColor(i10);
            b6VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f22746a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f22773n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public void t(boolean z10) {
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f22774n0 = z10;
        f();
        AnimatorSet animatorSet = this.X0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean s10 = s();
        if (!s10) {
            b6 b6Var = this.f22773n[0];
            if (b6Var != null) {
                arrayList.add(b6Var);
            }
            if (this.f22782r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f22782r);
                b6 b6Var2 = this.f22782r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                b6Var2.setVisibility(i10);
            }
        }
        float f13 = this.f22776o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 3));
        this.X0.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.X0;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.X0;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.X0;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        y9 y9Var = this.f22758f;
        if (y9Var != null) {
            y9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.X0;
            y9 y9Var2 = this.f22758f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(y9Var2, property, f10));
        }
        this.f22801z0 = true;
        requestLayout();
        this.X0.addListener(new f(this, arrayList, z10, s10));
        this.X0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof k5) {
                k5 k5Var = (k5) drawable;
                k5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                k5Var.a(f14, true);
            }
        }
    }

    public final void u() {
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u()) {
                    w0Var.E();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        b();
        eh.d dVar = this.f22745a;
        if (dVar != null) {
            dVar.updateColors();
        }
        eh.d dVar2 = this.f22751c;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        eh.d dVar3 = this.f22748b;
        if (dVar3 != null) {
            dVar3.updateColors();
        }
        di.k kVar = this.f22779p1;
        if (kVar != null) {
            kVar.d();
        }
    }

    public final void v() {
        z zVar = this.E;
        if (zVar != null) {
            boolean z10 = this.f22774n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.u()) {
                        if (!z10) {
                            zVar.f23778b.t(w0Var.T(z11));
                        }
                        w0Var.P("", false);
                        w0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void w(RecyclerView recyclerView, int i10, int i11) {
        float f7;
        this.f22787s1 = i10;
        this.f22789t1 = i11;
        this.f22784r1 = AndroidUtilities.isTablet();
        org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(4, this, recyclerView);
        recyclerView.j(new ai.b(m0Var, 21));
        if (this.f22781q1) {
            m0Var.run();
            return;
        }
        this.f22781q1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f22791u1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f22793v1 = f7;
        b();
    }

    public final void x(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f22780q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(y6.g0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.r();
                return;
            }
            return;
        }
        this.f22778p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(y6.g0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.r();
        }
    }

    public void y(int i10, boolean z10) {
        if (z10) {
            this.f22786s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof j2) {
                    ((j2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f22783r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof j2) {
                    ((j2) drawable2).a(i10);
                } else if (drawable2 instanceof k5) {
                    ((k5) drawable2).f22815j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.s();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.U0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f22783r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setAdaptiveBackground(gp0 gp0Var) {
        int i10 = y6.f23299a7;
        int i11 = y6.f23636s8;
        this.f22787s1 = i10;
        this.f22789t1 = i11;
        this.f22784r1 = AndroidUtilities.isTablet();
        b();
        org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(3, this, gp0Var);
        gp0Var.L.add(m0Var);
        if (this.f22781q1) {
            m0Var.run();
            return;
        }
        this.f22781q1 = true;
        boolean canScrollVertically = gp0Var.canScrollVertically(-1);
        this.f22791u1 = !canScrollVertically;
        this.f22793v1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
