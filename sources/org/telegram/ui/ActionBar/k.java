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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.hz0;
public class k extends FrameLayout implements le.d, y5 {
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
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final d6 J0;
    public boolean K;
    public lw0 K0;
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
    public ww0 S;
    public ho S0;
    public s00 T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public boolean U0;
    public boolean V;
    public Runnable V0;
    public Rect W;
    public hz0 W0;
    public AnimatorSet X0;
    public int Y0;
    public int Z0;
    public ch.d f21246a;
    public int f21247a0;
    public boolean f21248a1;
    public ch.d f21249b;
    public boolean f21250b0;
    public boolean f21251b1;
    public ch.d f21252c;
    public CharSequence f21253c0;
    public float f21254c1;
    public final y4 d;
    public Drawable f21255d0;
    public final le.e f21256d1;
    public ImageView f21257e;
    public View.OnClickListener f21258e0;
    public final le.b f21259e1;
    public w9 f21260f;
    public String f21261f0;
    public final le.e f21262f1;
    public final Object[] f21263g0;
    public final le.b f21264g1;
    public Drawable h;
    public Runnable f21265h0;
    public int f21266h1;
    public boolean f21267i0;
    public int f21268i1;
    public Runnable f21269j0;
    public boolean f21270j1;
    public boolean f21271k0;
    public boolean f21272k1;
    public int f21273l0;
    public boolean l1;
    public boolean m0;
    public boolean f21274m1;
    public final i5[] f21275n;
    public boolean f21276n0;
    public int f21277n1;
    public float f21278o0;
    public ai.s f21279o1;
    public int f21280p0;
    public boolean f21281p1;
    public int f21282q0;
    public boolean f21283q1;
    public i5 f21284r;
    public int f21285r0;
    public int f21286r1;
    public i5 f21287s;
    public int f21288s0;
    public int f21289s1;
    public n2 f21290t0;
    public boolean f21291t1;
    public j f21292u0;
    public float f21293u1;
    public View v;
    public int f21294v0;
    public ValueAnimator f21295v1;
    public int f21296w;
    public boolean f21297w0;
    public int f21298x;
    public boolean f21299x0;
    public boolean f21300y;
    public boolean f21301y0;
    public boolean f21302z0;

    public k(Context context, d6 d6Var) {
        super(context);
        this.d = y4.f21715a;
        this.f21275n = new i5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f21263g0 = new Object[3];
        this.f21271k0 = true;
        this.f21273l0 = 255;
        this.f21294v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new com.google.firebase.messaging.m(this);
        tr trVar = tr.h;
        this.f21256d1 = new le.e(0, this, trVar, 380L);
        this.f21259e1 = new le.b(0, this, trVar, 380L, false);
        this.f21262f1 = new le.e(0, this, trVar, 320L);
        this.f21264g1 = new le.b(0, this, trVar, 320L, false);
        this.f21277n1 = 255;
        this.f21291t1 = true;
        this.f21293u1 = 1.0f;
        this.J0 = d6Var;
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
            this.f21282q0 = i10;
            if (this.J && (imageView = this.f21257e) != null) {
                imageView.setBackgroundDrawable(i6.f0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f21280p0 = i10;
        ImageView imageView2 = this.f21257e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(i6.f0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void B(int i10, boolean z10) {
        if (z10) {
            this.f21288s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f21257e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f21257e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f21285r0 = i10;
            ImageView imageView2 = this.f21257e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof g2) {
                    ((g2) drawable2).a(i10);
                } else if (drawable2 instanceof d5) {
                    ((d5) drawable2).f20534j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f21257e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f21257e;
        if (imageView3 != null && this.U0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f21285r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void C(int i10, boolean z10) {
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

    public final void D(int i10, boolean z10, boolean z11) {
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

    public final void E(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (zVar = this.E) != null) {
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void F(int i10, boolean z10) {
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

    public final void G(CharSequence charSequence, org.telegram.ui.Components.o5 o5Var) {
        int i10;
        i5[] i5VarArr = this.f21275n;
        if (charSequence != null && i5VarArr[0] == null) {
            p(0);
        }
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            if (charSequence != null && !this.f21276n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            i5Var.setVisibility(i10);
            i5 i5Var2 = i5VarArr[0];
            this.f21253c0 = charSequence;
            i5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f21255d0;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).l(null);
                }
            }
            i5 i5Var3 = i5VarArr[0];
            this.f21255d0 = o5Var;
            i5Var3.i(o5Var);
            if (this.C0) {
                Drawable drawable2 = this.f21255d0;
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable2).l(i5VarArr[0]);
                }
            }
            i5VarArr[0].setRightDrawableOnClick(this.f21258e0);
        }
        this.f21301y0 = false;
    }

    public final void H(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        i5[] i5VarArr = this.f21275n;
        if (i5VarArr[0] != null && charSequence != null) {
            if (this.f21297w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f21284r.getVisibility() != 0) {
                    this.f21284r.setVisibility(0);
                    this.f21284r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f21284r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ok.r(animate, f7, 220L);
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
            this.f21301y0 = z10;
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
            this.f21299x0 = true;
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

    public final void I(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        i5 i5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f21250b0 && this.f21290t0.parentLayout != null) {
            Object[] objArr = this.f21263g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.f21248a1) {
                String str3 = this.f21261f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f21261f0 = str;
                        Drawable drawable = null;
                        if (this.f21279o1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f21279o1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f21253c0;
                        }
                        if (str == null) {
                            drawable = this.f21255d0;
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
                        this.f21267i0 = z11;
                        i5[] i5VarArr = this.f21275n;
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
                                i5VarArr[1].setRightDrawableOnClick(this.f21258e0);
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).l(i5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(i5VarArr[1]);
                                }
                                this.f21248a1 = true;
                                i5 i5Var4 = i5VarArr[1];
                                i5VarArr[1] = i5VarArr[0];
                                i5VarArr[0] = i5Var4;
                                i5Var4.setAlpha(0.0f);
                                i5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = i5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f21283q1) {
                                    f7 = 1.0f - this.f21293u1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = i5VarArr[1].animate().alpha(0.0f);
                                if (this.f21284r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f21302z0 = true;
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
                            i5VarArr[0].setRightDrawableOnClick(this.f21258e0);
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
                            runnable = this.f21265h0;
                        }
                        this.f21269j0 = runnable;
                    }
                }
            }
        }
    }

    public final void J() {
        this.G0 = true;
        if (this.F0 == null) {
            ai.w5 w5Var = new ai.w5(getContext(), 5);
            this.F0 = w5Var;
            addView(w5Var);
        }
    }

    public final void K(ah.c cVar, dh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        ch.d c10 = cVar.c(this, null, false);
        c10.x(eVar);
        c10.y(AndroidUtilities.dp(6.0f));
        this.f21246a = c10;
        if (z10) {
            c10.A(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.z(AndroidUtilities.dp(23.0f));
        }
        ch.d c11 = cVar.c(this, null, false);
        c11.x(eVar);
        c11.z(AndroidUtilities.dp(23.0f));
        c11.y(AndroidUtilities.dp(6.0f));
        this.f21249b = c11;
        ch.d c12 = cVar.c(this, null, false);
        c12.x(eVar);
        c12.z(AndroidUtilities.dp(23.0f));
        c12.y(AndroidUtilities.dp(6.0f));
        this.f21252c = c12;
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
        ImageView imageView = this.f21257e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean L(View view) {
        if (this.L) {
            i5[] i5VarArr = this.f21275n;
            if (view == i5VarArr[0] || view == i5VarArr[1] || view == this.f21284r || view == this.E || view == this.f21257e || view == this.f21287s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void M(View[] viewArr, boolean[] zArr) {
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
            if (this.f21296w == 0) {
                if (!this.f21276n0) {
                    i5 i5Var = this.f21275n[0];
                    if (i5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(i5Var, property, 0.0f));
                    }
                    if (this.f21284r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f21284r, property, 0.0f));
                    }
                }
                z zVar = this.E;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f21296w;
            if (i10 == 0) {
                i10 = this.f21298x;
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
            if (this.W0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 3));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ai.z(10, this, zArr));
            this.P.start();
            ImageView imageView = this.f21257e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(1.0f, true);
                }
                this.f21257e.setBackgroundDrawable(i6.f0(this.f21282q0, 1, -1));
            }
        }
    }

    public final void N() {
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
                mVar.f7901a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f7903c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f7901a = false;
            ((AnimatorSet) mVar.f7903c).cancel();
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
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        invalidate();
    }

    public final void b() {
        int v02;
        int v03;
        if (this.f21281p1) {
            if (this.f21283q1) {
                ai.w5 w5Var = this.F0;
                if (w5Var != null) {
                    w5Var.setAlpha(1.0f - this.f21293u1);
                } else {
                    i5 i5Var = this.f21275n[0];
                    if (i5Var != null) {
                        i5Var.setAlpha(1.0f - this.f21293u1);
                    }
                }
            }
            float f7 = this.f21293u1;
            int i10 = this.f21289s1;
            d6 d6Var = this.J0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = i6.v0(i10, d6Var);
            }
            int i11 = this.f21286r1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = i6.v0(i11, d6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f7, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f21293u1) * 255.0f));
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
            this.f21302z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) tr.f31140f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        ho hoVar = this.S0;
        if (hoVar == null) {
            return;
        }
        co coVar = hoVar.f27180e;
        if (coVar != null && coVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.S0.getVisualWidth());
        le.e eVar = this.f21256d1;
        if (z10) {
            if (eVar.f15444g) {
                f7 = eVar.f15443f;
            } else {
                f7 = eVar.f15442e;
            }
            float f10 = min;
            if (f7 != f10) {
                eVar.a(f10);
            }
        } else {
            eVar.c(min);
        }
        this.f21259e1.a(z11, z10);
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
            ch.d dVar = this.f21246a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.S0) {
                ch.d dVar2 = this.f21249b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ch.d dVar3 = this.f21252c;
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
        ch.d dVar = this.f21246a;
        if (dVar != null) {
            dVar.k();
        }
        ch.d dVar2 = this.f21252c;
        if (dVar2 != null) {
            dVar2.k();
        }
        ch.d dVar3 = this.f21249b;
        if (dVar3 != null) {
            dVar3.k();
        }
        ai.s sVar = this.f21279o1;
        if (sVar != null) {
            sVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.f21257e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof g2) && !(drawable instanceof d5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.f21257e.getLayerType() != i10) {
                this.f21257e.setLayerType(i10, null);
                this.f21257e.invalidate();
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
        this.f21264g1.a(z10, this.l1);
        le.e eVar = this.f21262f1;
        if (eVar.f15444g) {
            f7 = eVar.f15443f;
        } else {
            f7 = eVar.f15442e;
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

    public j getActionBarMenuOnItemClick() {
        return this.f21292u0;
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
        return this.f21279o1;
    }

    public i5 getAdditionalSubtitleTextView() {
        return this.f21287s;
    }

    public ImageView getBackButton() {
        return this.f21257e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public y4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f21298x;
    }

    public boolean getCastShadows() {
        return this.f21271k0;
    }

    public int[] getColorKeys() {
        return null;
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

    public w9 getSearchAvatarImageView() {
        return this.f21260f;
    }

    public int getShadowAlpha() {
        return this.f21273l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f21284r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public i5 getSubtitleTextView() {
        return this.f21284r;
    }

    public String getTitle() {
        i5 i5Var = this.f21275n[0];
        if (i5Var == null) {
            return null;
        }
        return i5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        i5 i5Var = this.f21275n[0];
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
        return this.f21275n[0];
    }

    public i5 getTitleTextView2() {
        return this.f21275n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        z zVar;
        if (this.f21276n0 && (zVar = this.E) != null) {
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
        if (this.P0) {
            f7 = -AndroidUtilities.dp(10.0f);
        } else {
            f7 = 0.0f;
        }
        dVar2.setTranslationX(f7);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.f21720c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            this.F.setBackgroundColor(i6.v0(i6.f21172w8, this.J0));
        }
        addView(this.F, indexOfChild(this.f21257e));
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
        if (this.f21279o1 == null) {
            ai.s sVar = new ai.s(this, getContext(), this.J0, this.O0);
            this.f21279o1 = sVar;
            sVar.setClipChildren(false);
            addView(this.f21279o1);
        }
    }

    public final void l() {
        if (this.f21287s != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.f21287s = i5Var;
        i5Var.setGravity(3);
        this.f21287s.setVisibility(8);
        this.f21287s.setTextColor(i6.v0(i6.B8, this.J0));
        addView(this.f21287s, 0, w7.z5.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f21257e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f21257e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f21257e.setBackgroundDrawable(i6.f0(this.f21280p0, 1, -1));
        this.f21257e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f21257e, w7.z5.e(54, 54, 51));
        this.f21257e.setOnClickListener(new b(this, 1));
        this.f21257e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.E = zVar2;
        addView(zVar2, 0, w7.z5.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f21284r != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        this.f21284r = i5Var;
        i5Var.setGravity(3);
        this.f21284r.setVisibility(8);
        this.f21284r.setTextColor(i6.v0(i6.B8, this.J0));
        addView(this.f21284r, 0, w7.z5.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        N();
        if (this.J) {
            int i10 = this.f21296w;
            if (i10 == 0) {
                i10 = this.f21298x;
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
        Drawable drawable = this.f21255d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(this.f21275n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        N();
        if (this.J) {
            int i10 = this.f21298x;
            if (i10 != 0 && this.f21296w != 0 && !this.P0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21255d0;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f21267i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = i6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            ww0 ww0Var = this.S;
            i5[] i5VarArr = this.f21275n;
            if (ww0Var == null) {
                this.T = null;
                this.S = new ww0(0);
                i5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f30554c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f30552a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(i6.w0(null, i6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new r00(obj));
                }
                this.T = obj;
                i5VarArr[0].invalidate();
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
        i5[] i5VarArr;
        i5 i5Var;
        int i13;
        int B;
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
        ImageView imageView = kVar.f21257e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f21257e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
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
            if (kVar.E.p() && !kVar.f21276n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f21300y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f21276n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = ok.c(f11, size, 1073741824);
                if (!kVar.f21300y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f21300y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            i5VarArr = kVar.f21275n;
            if (i20 >= 2) {
                break;
            }
            i5 i5Var3 = i5VarArr[0];
            if ((i5Var3 != null && i5Var3.getVisibility() != 8) || ((i5Var = kVar.f21284r) != null && i5Var.getVisibility() != 8)) {
                z zVar2 = kVar.E;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.H0) {
                    B = size - (Math.max(dp, (AndroidUtilities.dp(16.0f) + i13) + kVar.f21247a0) * 2);
                } else {
                    B = org.telegram.messenger.f0.B(16.0f, size - i13, dp) - kVar.f21247a0;
                }
                int max = Math.max(B, 0);
                boolean z10 = kVar.f21301y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f21297w0 && kVar.f21299x0) {
                    i5 i5Var4 = i5VarArr[i20];
                    if (kVar.P0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    i5Var4.setTextSize(i21);
                } else {
                    i5 i5Var5 = i5VarArr[0];
                    if (i5Var5 != null && i5Var5.getVisibility() != 8 && (i5Var2 = kVar.f21284r) != null && i5Var2.getVisibility() != 8) {
                        i5 i5Var6 = i5VarArr[i20];
                        if (i5Var6 != null) {
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            i5Var6.setTextSize(i21);
                        }
                        i5 i5Var7 = kVar.f21284r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        i5Var7.setTextSize(i16);
                        i5 i5Var8 = kVar.f21287s;
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
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            i5Var10.setTextSize(i21);
                        }
                        i5 i5Var11 = kVar.f21284r;
                        if (i5Var11 != null && i5Var11.getVisibility() != 8) {
                            i5 i5Var12 = kVar.f21284r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            i5Var12.setTextSize(i15);
                        }
                        i5 i5Var13 = kVar.f21287s;
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
                    if (kVar.f21302z0) {
                        CharSequence text = i5VarArr[i20].getText();
                        i5 i5Var15 = i5VarArr[i20];
                        i5Var15.setPivotX(i5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        i5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        i5VarArr[i20].setPivotX(0.0f);
                        i5VarArr[i20].setPivotY(0.0f);
                    }
                }
                i5 i5Var16 = kVar.f21284r;
                if (i5Var16 != null && i5Var16.getVisibility() != 8) {
                    kVar.f21284r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ai.s sVar = kVar.f21279o1;
                if (sVar != null) {
                    sVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                i5 i5Var17 = kVar.f21287s;
                if (i5Var17 != null && i5Var17.getVisibility() != 8) {
                    kVar.f21287s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        w9 w9Var = kVar.f21260f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != i5VarArr[0] && childAt != i5VarArr[1] && childAt != kVar.f21279o1 && childAt != kVar.f21284r && childAt != kVar.E && childAt != kVar.f21257e && childAt != kVar.f21287s && childAt != kVar.f21260f) {
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
        View[] viewArr = this.f21275n;
        if (viewArr[i10] != null) {
            return;
        }
        i5 i5Var = new i5(getContext());
        viewArr[i10] = i5Var;
        if (this.H0) {
            i11 = 17;
        } else {
            i11 = 19;
        }
        i5Var.setGravity(i11);
        int i12 = this.f21294v0;
        if (i12 != 0) {
            viewArr[i10].setTextColor(i12);
        } else {
            viewArr[i10].setTextColor(i6.v0(i6.A8, this.J0));
        }
        i5 i5Var2 = viewArr[i10];
        i5Var2.setEmojiColor(i5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, w7.z5.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, w7.z5.e(-2, -2, 51));
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
            boolean z10 = this.f21276n0;
            i5[] i5VarArr = this.f21275n;
            if (!z10) {
                i5 i5Var = i5VarArr[0];
                if (i5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(i5Var, property, 1.0f));
                }
                if (this.f21284r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f21284r, property, 1.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f21298x;
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
            if (this.W0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f21276n0) {
                i5 i5Var2 = i5VarArr[0];
                if (i5Var2 != null) {
                    i5Var2.setVisibility(0);
                }
                if (this.f21284r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f21284r.setVisibility(0);
                }
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.f21257e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof g2) {
                    ((g2) drawable).c(0.0f, true);
                }
                this.f21257e.setBackgroundDrawable(i6.f0(this.f21280p0, 1, -1));
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
        this.f21292u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f21296w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, i6.f20761a7, i6.f21099s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.Y0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f21250b0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f21257e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f7;
        if (this.f21257e == null) {
            m();
        }
        ImageView imageView = this.f21257e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f21257e;
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
            g2Var.b(this.f21288s0);
            g2Var.a(this.f21285r0);
        } else if (drawable instanceof d5) {
            d5 d5Var = (d5) drawable;
            d5Var.f20535k = this.f21298x;
            d5Var.f20534j = this.f21285r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f21257e.setColorFilter(new PorterDuffColorFilter(this.f21285r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.U0) {
            this.f21257e.setColorFilter(new PorterDuffColorFilter(this.f21285r0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.f21257e == null) {
            m();
        }
        ImageView imageView = this.f21257e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.f21257e.setImageResource(i10);
        this.f21257e.setColorFilter(new PorterDuffColorFilter(this.f21285r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f21298x = i10;
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.f21257e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof d5) {
                ((d5) drawable).f20535k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f21271k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21271k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        i5[] i5VarArr;
        int i10;
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        for (i5 i5Var : this.f21275n) {
            if (i5Var != null) {
                if (z10) {
                    i10 = 17;
                } else {
                    i10 = 19;
                }
                i5Var.setGravity(i10);
            }
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(ho hoVar) {
        this.S0 = hoVar;
    }

    public void setClipContent(boolean z10) {
        this.L = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.B0 = z10;
        ImageView imageView = this.f21257e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(lw0 lw0Var) {
        this.L0 = true;
        this.K0 = lw0Var;
        lw0Var.T.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f21257e;
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
        this.f21272k1 = true;
        if (this.f21268i1 != i10) {
            this.f21268i1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f21270j1 = true;
        if (this.f21266h1 != i10) {
            this.f21266h1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.f21277n1 != i10) {
            this.f21277n1 = i10;
            invalidate();
        }
        ch.d dVar = this.f21246a;
        if (dVar != null && dVar.f15648b != i10) {
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
        this.f21300y = z10;
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
        this.f21297w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f21258e0 = onClickListener;
        i5[] i5VarArr = this.f21275n;
        i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setRightDrawableOnClick(onClickListener);
        }
        i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.setRightDrawableOnClick(this.f21258e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f21260f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f21260f = w9Var;
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
        if (this.f21254c1 != f7) {
            this.f21254c1 = f7;
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
        if (this.f21273l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21273l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f21251b1 != z10) {
            this.f21251b1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f21284r == null) {
            o();
        }
        if (this.f21284r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            i5 i5Var = this.f21284r;
            if (!isEmpty && !this.f21276n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i5Var.setVisibility(i10);
            this.f21284r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f21284r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f21284r == null) {
            o();
        }
        this.f21284r.setTextColor(i10);
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
        G(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f21269j0 = runnable;
        this.f21265h0 = runnable;
    }

    public void setTitleColor(int i10) {
        i5[] i5VarArr = this.f21275n;
        if (i5VarArr[0] == null) {
            p(0);
        }
        this.f21294v0 = i10;
        i5VarArr[0].setTextColor(i10);
        i5VarArr[0].setEmojiColor(i10);
        i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            i5Var.setTextColor(i10);
            i5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f21247a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f21275n[0].setScrollNonFitText(z10);
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
        this.f21276n0 = z10;
        g();
        AnimatorSet animatorSet = this.X0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            i5 i5Var = this.f21275n[0];
            if (i5Var != null) {
                arrayList.add(i5Var);
            }
            if (this.f21284r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f21284r);
                i5 i5Var2 = this.f21284r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                i5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f21278o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 2));
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
        w9 w9Var = this.f21260f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.X0;
            w9 w9Var2 = this.f21260f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f21302z0 = true;
        requestLayout();
        this.X0.addListener(new f(this, arrayList, z10, u10));
        this.X0.setDuration(150L).start();
        ImageView imageView = this.f21257e;
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
                    f5Var.p(v0Var.f21575e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.E;
        if (zVar != null && str != null) {
            boolean z10 = this.f21276n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.G) {
                        if (!z10) {
                            zVar.f21719b.v(v0Var.L(z11));
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
        this.f21286r1 = i10;
        this.f21289s1 = i11;
        ki.h0 h0Var = new ki.h0(25, this, recyclerView);
        recyclerView.j(new ai.r(h0Var, 13));
        this.f21283q1 = z10;
        if (this.f21281p1) {
            h0Var.run();
            return;
        }
        this.f21281p1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f21291t1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f21293u1 = f7;
        b();
    }

    public final void z(zl0 zl0Var, boolean z10) {
        y(zl0Var, z10, i6.f20761a7, i6.f21099s8);
    }

    public void setAdaptiveBackground(ro0 ro0Var) {
        int i10 = i6.f20761a7;
        int i11 = i6.f21099s8;
        this.f21286r1 = i10;
        this.f21289s1 = i11;
        b();
        ki.h0 h0Var = new ki.h0(24, this, ro0Var);
        ro0Var.f30483f.add(h0Var);
        if (this.f21281p1) {
            h0Var.run();
            return;
        }
        this.f21281p1 = true;
        boolean canScrollVertically = ro0Var.canScrollVertically(-1);
        this.f21291t1 = !canScrollVertically;
        this.f21293u1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
