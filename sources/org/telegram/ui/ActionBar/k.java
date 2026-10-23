package org.telegram.ui.ActionBar;

import ai.ne;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.my0;
public class k extends FrameLayout implements ne.d, b6 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public y E;
    public boolean E0;
    public d F;
    public ci.h4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final g6 I0;
    public boolean J;
    public ow0 J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public final Paint L0;
    public boolean M;
    public final Rect M0;
    public boolean N;
    public final c2.b N0;
    public int O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public oo R0;
    public zw0 S;
    public boolean S0;
    public x00 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public my0 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public dh.d f21039a;
    public int f21040a0;
    public float f21041a1;
    public dh.d f21042b;
    public boolean f21043b0;
    public final ne.e f21044b1;
    public dh.d f21045c;
    public CharSequence f21046c0;
    public final ne.b f21047c1;
    public final c5 d;
    public Drawable f21048d0;
    public final ne.e f21049d1;
    public ImageView e;
    public View.OnClickListener f21050e0;
    public final ne.b f21051e1;
    public w9 f21052f;
    public String f21053f0;
    public int f21054f1;
    public final Object[] f21055g0;
    public int f21056g1;
    public Drawable h;
    public Runnable f21057h0;
    public boolean f21058h1;
    public boolean f21059i0;
    public boolean f21060i1;
    public Runnable f21061j0;
    public boolean f21062j1;
    public boolean f21063k0;
    public boolean f21064k1;
    public int f21065l0;
    public boolean l1;
    public boolean m0;
    public ci.k f21066m1;
    public final n5[] f21067n;
    public boolean f21068n0;
    public boolean f21069n1;
    public float f21070o0;
    public boolean f21071o1;
    public int f21072p0;
    public boolean f21073p1;
    public int f21074q0;
    public int f21075q1;
    public n5 f21076r;
    public int f21077r0;
    public int f21078r1;
    public n5 f21079s;
    public int f21080s0;
    public boolean f21081s1;
    public o2 f21082t0;
    public float f21083t1;
    public j f21084u0;
    public ValueAnimator f21085u1;
    public View v;
    public int f21086v0;
    public int f21087w;
    public boolean f21088w0;
    public int f21089x;
    public boolean f21090x0;
    public boolean f21091y;
    public boolean f21092y0;
    public boolean f21093z0;

    public k(Context context, g6 g6Var) {
        super(context);
        this.d = c5.f20793a;
        this.f21067n = new n5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f21055g0 = new Object[3];
        this.f21063k0 = true;
        this.f21065l0 = 255;
        this.f21086v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new c2.b(this);
        bs bsVar = bs.h;
        this.f21044b1 = new ne.e(0, this, bsVar, 380L);
        this.f21047c1 = new ne.b(0, this, bsVar, 380L, false);
        this.f21049d1 = new ne.e(0, this, bsVar, 320L);
        this.f21051e1 = new ne.b(0, this, bsVar, 320L, false);
        this.l1 = true;
        this.f21081s1 = true;
        this.f21083t1 = 1.0f;
        this.I0 = g6Var;
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
            this.f21074q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(k6.g0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f21072p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(k6.g0(i10, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void B(int i10, boolean z10) {
        if (z10) {
            this.f21080s0 = i10;
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
            this.f21077r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i10);
                } else if (drawable2 instanceof i5) {
                    ((i5) drawable2).f20958j = i10;
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
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f21077r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void C(int i10, boolean z10) {
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

    public final void D(int i10, boolean z10, boolean z11) {
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

    public final void E(int i10, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void F(int i10, boolean z10) {
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

    public final void G(CharSequence charSequence, org.telegram.ui.Components.p5 p5Var) {
        int i10;
        n5[] n5VarArr = this.f21067n;
        if (charSequence != null && n5VarArr[0] == null) {
            p(0);
        }
        n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            if (charSequence != null && !this.f21068n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            n5Var.setVisibility(i10);
            n5 n5Var2 = n5VarArr[0];
            this.f21046c0 = charSequence;
            n5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f21048d0;
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    ((org.telegram.ui.Components.p5) drawable).l(null);
                }
            }
            n5 n5Var3 = n5VarArr[0];
            this.f21048d0 = p5Var;
            n5Var3.i(p5Var);
            if (this.C0) {
                Drawable drawable2 = this.f21048d0;
                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                    ((org.telegram.ui.Components.p5) drawable2).l(n5VarArr[0]);
                }
            }
            n5VarArr[0].setRightDrawableOnClick(this.f21050e0);
        }
        this.f21092y0 = false;
    }

    public final void I(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f7;
        n5[] n5VarArr = this.f21067n;
        if (n5VarArr[0] != null && charSequence != null) {
            if (this.f21088w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f21076r.getVisibility() != 0) {
                    this.f21076r.setVisibility(0);
                    this.f21076r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f21076r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                sl.s(animate, f7, 220L);
            }
            n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                if (n5Var.getParent() != null) {
                    ((ViewGroup) n5VarArr[1].getParent()).removeView(n5VarArr[1]);
                }
                n5VarArr[1] = null;
            }
            n5VarArr[1] = n5VarArr[0];
            n5VarArr[0] = null;
            setTitle(charSequence);
            this.f21092y0 = z10;
            n5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                n5 n5Var2 = n5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                n5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = n5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f21090x0 = true;
            ViewPropertyAnimator alpha = n5VarArr[1].animate().alpha(0.0f);
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

    public final void J(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        n5 n5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f21043b0 && this.f21082t0.parentLayout != null) {
            Object[] objArr = this.f21055g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f21053f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f21053f0 = str;
                        Drawable drawable = null;
                        if (this.f21066m1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f21066m1.b(charSequence, true);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f21046c0;
                        }
                        if (str == null) {
                            drawable = this.f21048d0;
                        }
                        c2.b bVar = this.N0;
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
                        this.f21059i0 = z11;
                        n5[] n5VarArr = this.f21067n;
                        if ((spannableString == null || n5VarArr[0] != null) && getMeasuredWidth() != 0 && ((n5Var = n5VarArr[0]) == null || n5Var.getVisibility() == 0)) {
                            n5 n5Var2 = n5VarArr[0];
                            if (n5Var2 != null) {
                                n5Var2.animate().cancel();
                                n5 n5Var3 = n5VarArr[1];
                                if (n5Var3 != null) {
                                    n5Var3.animate().cancel();
                                }
                                if (n5VarArr[1] == null) {
                                    p(1);
                                }
                                n5VarArr[1].k(spannableString);
                                n5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                n5VarArr[1].i(drawable);
                                n5VarArr[1].setRightDrawableOnClick(this.f21050e0);
                                if (drawable instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable).l(n5VarArr[1]);
                                }
                                if (z10) {
                                    bVar.c(n5VarArr[1]);
                                }
                                this.Y0 = true;
                                n5 n5Var4 = n5VarArr[1];
                                n5VarArr[1] = n5VarArr[0];
                                n5VarArr[0] = n5Var4;
                                n5Var4.setAlpha(0.0f);
                                n5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = n5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f21071o1) {
                                    f7 = 1.0f - this.f21083t1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = n5VarArr[1].animate().alpha(0.0f);
                                if (this.f21076r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f21093z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.R) {
                                n5VarArr[0].invalidate();
                                invalidate();
                            }
                            n5VarArr[0].k(spannableString);
                            n5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            n5VarArr[0].i(drawable);
                            n5VarArr[0].setRightDrawableOnClick(this.f21050e0);
                            if (drawable instanceof org.telegram.ui.Components.p5) {
                                ((org.telegram.ui.Components.p5) drawable).l(n5VarArr[0]);
                            }
                            if (z10) {
                                bVar.c(n5VarArr[0]);
                            } else {
                                bVar.v(n5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f21057h0;
                        }
                        this.f21061j0 = runnable;
                    }
                }
            }
        }
    }

    public final void K() {
        this.G0 = true;
        if (this.F0 == null) {
            ci.h4 h4Var = new ci.h4(getContext(), 5);
            this.F0 = h4Var;
            addView(h4Var);
        }
    }

    public final void L(bh.b bVar, eh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.O0 = true;
        this.Q0 = z10;
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        c10.p(AndroidUtilities.dp(6.0f));
        this.f21039a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f21042b = c11;
        dh.d c12 = bVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f21045c = c12;
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

    public boolean M(View view) {
        if (this.L) {
            n5[] n5VarArr = this.f21067n;
            if (view == n5VarArr[0] || view == n5VarArr[1] || view == this.f21076r || view == this.E || view == this.e || view == this.f21079s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void N(View[] viewArr, boolean[] zArr) {
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
            if (this.f21087w == 0) {
                if (!this.f21068n0) {
                    n5 n5Var = this.f21067n[0];
                    if (n5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f));
                    }
                    if (this.f21076r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f21076r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i10 = this.f21087w;
            if (i10 == 0) {
                i10 = this.f21089x;
            }
            if (i10 != 0 && !this.O0) {
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
            if (this.U0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 3));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ne(11, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(k6.g0(this.f21074q0, 1, -1));
            }
        }
    }

    public final void O() {
        boolean z10;
        if (this.C0 && this.D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != z10) {
            this.E0 = z10;
            c2.b bVar = this.N0;
            if (z10) {
                bVar.f4493a = true;
                AnimatorSet animatorSet = (AnimatorSet) bVar.f4495c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            bVar.f4493a = false;
            ((AnimatorSet) bVar.f4495c).cancel();
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
        hashSet.add(Integer.valueOf(this.f21078r1));
        hashSet.add(Integer.valueOf(this.f21075q1));
    }

    public final void b() {
        float f7;
        int w02;
        int w03;
        if (this.f21069n1) {
            if (this.f21071o1) {
                ci.h4 h4Var = this.F0;
                if (h4Var != null) {
                    h4Var.setAlpha(1.0f - this.f21083t1);
                } else {
                    n5 n5Var = this.f21067n[0];
                    if (n5Var != null) {
                        n5Var.setAlpha(1.0f - this.f21083t1);
                    }
                }
            }
            if (this.f21073p1) {
                f7 = 1.0f;
            } else {
                f7 = this.f21083t1;
            }
            int i10 = this.f21078r1;
            g6 g6Var = this.I0;
            if (i10 == -1) {
                w02 = 0;
            } else {
                w02 = k6.w0(i10, g6Var);
            }
            int i11 = this.f21075q1;
            if (i11 == -1) {
                w03 = 0;
            } else {
                w03 = k6.w0(i11, g6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - f7) * 255.0f));
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
            this.f21093z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) bs.f25133f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        oo ooVar = this.R0;
        if (ooVar == null) {
            return;
        }
        ko koVar = ooVar.e;
        if (koVar != null && koVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        ne.e eVar = this.f21044b1;
        if (z10) {
            if (eVar.f17455g) {
                f7 = eVar.f17454f;
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
        this.f21047c1.a(z11, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        oo ooVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f21058h1) {
            i10 = this.f21054f1;
        } else {
            i10 = (int) this.f21049d1.e;
        }
        if (this.f21060i1) {
            i10 = Math.max((int) ((1.0f - this.f21041a1) * this.f21056g1), i10);
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i16 = dp * 2;
        int i17 = height + dp2 + i16;
        dh.d dVar = this.f21039a;
        ne.b bVar = this.f21051e1;
        if (dVar != null && !this.P0 && this.l1) {
            if (this.f21058h1 || this.f21060i1) {
                f7 = 1.0f;
                if (i10 > 0) {
                    i14 = dp;
                } else {
                    i14 = 0;
                }
            } else {
                f7 = 1.0f;
                i14 = (int) (dp * bVar.e);
            }
            int i18 = i14 + i10;
            int i19 = dp + dp2;
            int max = Math.max(i18, i19);
            i11 = 2;
            oo ooVar2 = this.R0;
            ne.b bVar2 = this.f21047c1;
            float f12 = 0.0f;
            if (ooVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = f7 - bVar2.e;
            }
            int lerp = AndroidUtilities.lerp(i18, max, f11);
            if (z10) {
                i15 = i19;
            } else {
                i15 = 0;
            }
            if (this.R0 != null) {
                f12 = f7 - bVar2.e;
            }
            int lerp2 = AndroidUtilities.lerp(i15, i19, f12);
            int width = getWidth() - lerp;
            int i20 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i20, ((int) this.f21044b1.e) + i16), i20, Math.max(this.f21041a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((ooVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f21039a.setBounds(lerp2, height, width, i17);
            this.f21039a.draw(canvas);
        } else {
            f7 = 1.0f;
            i11 = 2;
        }
        dh.d dVar2 = this.f21042b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i16, i17);
            this.f21042b.draw(canvas);
        }
        dh.d dVar3 = this.f21045c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f21064k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i16, height, getWidth(), i17);
            dh.d dVar4 = this.f21045c;
            if (this.f21058h1) {
                i13 = 255;
            } else {
                i13 = (int) (bVar.e * 255.0f);
            }
            dVar4.setAlpha(i13);
            this.f21045c.draw(canvas);
        }
        if (this.K0 && this.f21089x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i21 = this.f21089x;
            Paint paint = this.L0;
            paint.setColor(i21);
            if (this.f21069n1) {
                ow0 ow0Var = this.J0;
                float y3 = getY();
                if (this.f21073p1) {
                    f10 = f7;
                } else {
                    f10 = this.f21083t1;
                }
                float f13 = f7 - f10;
                ow0Var.getClass();
                if (ow0.E() && SharedConfig.getDevicePerformanceClass() == i11) {
                    i12 = k6.f21562xf;
                } else {
                    i12 = k6.yf;
                }
                ow0Var.J(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(k6.w0(i12, ow0Var.getResourceProvider())), f13));
            } else {
                this.J0.I(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f21062j1 = true;
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
            dh.d dVar = this.f21039a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.R0) {
                dh.d dVar2 = this.f21042b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                dh.d dVar3 = this.f21045c;
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

    public final void e() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof h2) && !(drawable instanceof i5)) {
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
        this.f21051e1.a(z10, this.f21062j1);
        ne.e eVar = this.f21049d1;
        if (eVar.f17455g) {
            f7 = eVar.f17454f;
        } else {
            f7 = eVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f21062j1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public void g(boolean z10) {
        y yVar;
        if (this.f21068n0 && (yVar = this.E) != null) {
            yVar.j(z10);
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f21084u0;
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
        return this.f21066m1;
    }

    public n5 getAdditionalSubtitleTextView() {
        return this.f21079s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public c5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f21089x;
    }

    public boolean getCastShadows() {
        return this.f21063k0;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
        return this.f21052f;
    }

    public int getShadowAlpha() {
        return this.f21065l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f21076r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        n5 n5Var = this.f21076r;
        if (n5Var != null) {
            return n5Var.getTextColor();
        }
        return 0;
    }

    public n5 getSubtitleTextView() {
        return this.f21076r;
    }

    public String getTitle() {
        n5 n5Var = this.f21067n[0];
        if (n5Var == null) {
            return null;
        }
        return n5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f21086v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        n5 n5Var = this.f21067n[0];
        if (n5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return n5Var.getPaint().getFontMetricsInt();
    }

    public n5 getTitleTextView() {
        return this.f21067n[0];
    }

    public n5 getTitleTextView2() {
        return this.f21067n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final y h() {
        return i(null);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final y i(String str) {
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
        dVar3.f21965c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            r6.i(k6.f21537w8, this.F, this.I0);
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
        if (this.f21066m1 == null) {
            ci.k kVar = new ci.k(this, getContext(), this.I0, this.N0);
            this.f21066m1 = kVar;
            kVar.setClipChildren(false);
            addView(this.f21066m1);
        }
    }

    public final void k() {
        if (this.f21079s != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        this.f21079s = n5Var;
        n5Var.setGravity(3);
        this.f21079s.setVisibility(8);
        r6.Z(this.f21079s, k6.B8, this.I0);
        addView(this.f21079s, 0, w7.z5.e(-2, -2, 51));
    }

    public final void l() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(k6.g0(this.f21072p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.z5.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final y m() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, w7.z5.e(-2, -1, 5));
        return this.E;
    }

    public final void n() {
        if (this.f21076r != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        this.f21076r = n5Var;
        n5Var.setGravity(3);
        this.f21076r.setVisibility(8);
        r6.Z(this.f21076r, k6.B8, this.I0);
        addView(this.f21076r, 0, w7.z5.e(-2, -2, 51));
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        O();
        if (this.J) {
            int i10 = this.f21087w;
            if (i10 == 0) {
                i10 = this.f21089x;
            }
            if (i10 != 0 && !this.O0) {
                if (i0.a.h(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21048d0;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).l(this.f21067n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        O();
        if (this.J) {
            int i10 = this.f21089x;
            if (i10 != 0 && this.f21087w != 0 && !this.O0) {
                if (i0.a.h(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21048d0;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable A0;
        if (this.R && !this.f21059i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (A0 = k6.A0()) != null && A0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            zw0 zw0Var = this.S;
            n5[] n5VarArr = this.f21067n;
            if (zw0Var == null) {
                this.T = null;
                this.S = new zw0(0);
                n5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f32391c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f32389a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(k6.x0(null, k6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new w00(obj));
                }
                this.T = obj;
                n5VarArr[0].invalidate();
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
        n5[] n5VarArr;
        n5 n5Var;
        int i13;
        int i14;
        int i15;
        int i16;
        n5 n5Var2;
        int i17;
        int i18;
        int closingSearchFieldWidth;
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
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f21068n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f21091y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f21068n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = sl.c(f11, size, 1073741824);
                if (!kVar.f21091y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f21091y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i21 = 0;
        while (true) {
            n5VarArr = kVar.f21067n;
            if (i21 >= 2) {
                break;
            }
            n5 n5Var3 = n5VarArr[0];
            if ((n5Var3 != null && n5Var3.getVisibility() != 8) || ((n5Var = kVar.f21076r) != null && n5Var.getVisibility() != 8)) {
                y yVar2 = kVar.E;
                if (yVar2 != null) {
                    int measuredWidth = yVar2.getMeasuredWidth();
                    if (kVar.f21068n0) {
                        closingSearchFieldWidth = 0;
                    } else {
                        closingSearchFieldWidth = kVar.E.getClosingSearchFieldWidth();
                    }
                    i14 = measuredWidth - closingSearchFieldWidth;
                } else {
                    i14 = 0;
                }
                int max = Math.max(org.telegram.messenger.v0.B(16.0f, size - i14, dp) - kVar.f21040a0, 0);
                boolean z10 = kVar.f21092y0;
                int i22 = 20;
                if (((z10 && i21 == 0) || (!z10 && i21 == i20)) && kVar.f21088w0 && kVar.f21090x0) {
                    n5 n5Var4 = n5VarArr[i21];
                    i13 = i20;
                    if (kVar.O0) {
                        i22 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i22 = 18;
                    }
                    n5Var4.setTextSize(i22);
                } else {
                    i13 = i20;
                    n5 n5Var5 = n5VarArr[0];
                    if (n5Var5 != null && n5Var5.getVisibility() != 8 && (n5Var2 = kVar.f21076r) != null && n5Var2.getVisibility() != 8) {
                        n5 n5Var6 = n5VarArr[i21];
                        if (n5Var6 != null) {
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i22 = 18;
                            }
                            n5Var6.setTextSize(i22);
                        }
                        n5 n5Var7 = kVar.f21076r;
                        if (AndroidUtilities.isTablet()) {
                            i17 = 16;
                        } else {
                            i17 = 14;
                        }
                        n5Var7.setTextSize(i17);
                        n5 n5Var8 = kVar.f21079s;
                        if (n5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i18 = 16;
                            } else {
                                i18 = 14;
                            }
                            n5Var8.setTextSize(i18);
                        }
                    } else {
                        n5 n5Var9 = n5VarArr[i21];
                        if (n5Var9 != null && n5Var9.getVisibility() != 8) {
                            n5 n5Var10 = n5VarArr[i21];
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i22 = 18;
                            }
                            n5Var10.setTextSize(i22);
                        }
                        n5 n5Var11 = kVar.f21076r;
                        if (n5Var11 != null && n5Var11.getVisibility() != 8) {
                            n5 n5Var12 = kVar.f21076r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i16 = 14;
                            } else {
                                i16 = 16;
                            }
                            n5Var12.setTextSize(i16);
                        }
                        n5 n5Var13 = kVar.f21079s;
                        if (n5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            n5Var13.setTextSize(i15);
                        }
                    }
                }
                n5 n5Var14 = n5VarArr[i21];
                if (n5Var14 != null && n5Var14.getVisibility() != 8) {
                    n5VarArr[i21].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n5VarArr[i21].getPaddingBottom() + n5VarArr[i21].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f21093z0) {
                        CharSequence text = n5VarArr[i21].getText();
                        n5 n5Var15 = n5VarArr[i21];
                        n5Var15.setPivotX(n5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        n5VarArr[i21].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        n5VarArr[i21].setPivotX(0.0f);
                        n5VarArr[i21].setPivotY(0.0f);
                    }
                }
                n5 n5Var16 = kVar.f21076r;
                if (n5Var16 != null && n5Var16.getVisibility() != 8) {
                    kVar.f21076r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ci.k kVar2 = kVar.f21066m1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                n5 n5Var17 = kVar.f21079s;
                if (n5Var17 != null && n5Var17.getVisibility() != 8) {
                    kVar.f21079s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i13 = i20;
            }
            i21++;
            i20 = i13;
        }
        int i23 = i20;
        w9 w9Var = kVar.f21052f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = kVar.getChildAt(i24);
            if (childAt.getVisibility() != 8 && childAt != n5VarArr[0] && childAt != n5VarArr[i23] && childAt != kVar.f21066m1 && childAt != kVar.f21076r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f21079s && childAt != kVar.f21052f) {
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

    public final void p(int i10) {
        View[] viewArr = this.f21067n;
        if (viewArr[i10] != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        viewArr[i10] = n5Var;
        n5Var.setGravity(19);
        int i11 = this.f21086v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            r6.Z(viewArr[i10], k6.A8, this.I0);
        }
        n5 n5Var2 = viewArr[i10];
        n5Var2.setEmojiColor(n5Var2.getTextColor());
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
                if (childAt instanceof u0) {
                    ((u0) childAt).n();
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
            boolean z10 = this.f21068n0;
            n5[] n5VarArr = this.f21067n;
            if (!z10) {
                n5 n5Var = n5VarArr[0];
                if (n5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(n5Var, property, 1.0f));
                }
                if (this.f21076r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f21076r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i12 = this.f21089x;
            if (i12 != 0 && !this.O0) {
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
            if (this.U0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f21068n0) {
                n5 n5Var2 = n5VarArr[0];
                if (n5Var2 != null) {
                    n5Var2.setVisibility(0);
                }
                if (this.f21076r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f21076r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(k6.g0(this.f21072p0, 1, -1));
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
        this.f21084u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            r6.r(dVar);
            this.F.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f21087w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            r6.r(view);
            this.v.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, k6.f21125a7, k6.f21462s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f21043b0 = z10;
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
            l();
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
            h2Var.b(this.f21080s0);
            h2Var.a(this.f21077r0);
        } else if (drawable instanceof i5) {
            i5 i5Var = (i5) drawable;
            i5Var.f20959k = this.f21089x;
            i5Var.f20958j = this.f21077r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f21077r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f21077r0, PorterDuff.Mode.SRC_IN));
        }
        e();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.e == null) {
            l();
        }
        ImageView imageView = this.e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.f21077r0, PorterDuff.Mode.SRC_IN));
        e();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f21089x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof i5) {
                ((i5) drawable).f20959k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f21063k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21063k0 = z10;
    }

    public void setChatAvatarContainer(oo ooVar) {
        this.R0 = ooVar;
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

    public void setDrawBlurBackground(ow0 ow0Var) {
        this.K0 = true;
        this.J0 = ow0Var;
        ow0Var.T.add(this);
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
        this.f21060i1 = true;
        if (this.f21056g1 != i10) {
            this.f21056g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f21058h1 = true;
        if (this.f21054f1 != i10) {
            this.f21054f1 = i10;
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
        this.f21091y = z10;
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
        this.f21088w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f21050e0 = onClickListener;
        n5[] n5VarArr = this.f21067n;
        n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            n5Var.setRightDrawableOnClick(onClickListener);
        }
        n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.setRightDrawableOnClick(this.f21050e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f21052f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f21052f = w9Var;
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
        if (this.f21041a1 != f7) {
            this.f21041a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(hg.o0 o0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(o0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f21065l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21065l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f21076r == null) {
            n();
        }
        if (this.f21076r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            n5 n5Var = this.f21076r;
            if (!isEmpty && !this.f21068n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n5Var.setVisibility(i10);
            this.f21076r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f21076r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f21076r == null) {
            n();
        }
        r6.r(this.f21076r);
        this.f21076r.setTextColor(i10);
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
        this.f21061j0 = runnable;
        this.f21057h0 = runnable;
    }

    public void setTitleColor(int i10) {
        n5[] n5VarArr = this.f21067n;
        if (n5VarArr[0] == null) {
            p(0);
        }
        this.f21086v0 = i10;
        r6.r(n5VarArr[0]);
        n5VarArr[0].setTextColor(i10);
        n5VarArr[0].setEmojiColor(i10);
        n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            r6.r(n5Var);
            n5VarArr[1].setTextColor(i10);
            n5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f21040a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f21067n[0].setScrollNonFitText(z10);
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

    @Override
    public final void updateColors() {
        b();
        dh.d dVar = this.f21039a;
        if (dVar != null) {
            dVar.updateColors();
        }
        dh.d dVar2 = this.f21045c;
        if (dVar2 != null) {
            dVar2.updateColors();
        }
        dh.d dVar3 = this.f21042b;
        if (dVar3 != null) {
            dVar3.updateColors();
        }
        ci.k kVar = this.f21066m1;
        if (kVar != null) {
            kVar.c();
        }
    }

    public void v(boolean z10) {
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f21068n0 = z10;
        f();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            n5 n5Var = this.f21067n[0];
            if (n5Var != null) {
                arrayList.add(n5Var);
            }
            if (this.f21076r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f21076r);
                n5 n5Var2 = this.f21076r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                n5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f21070o0;
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
        w9 w9Var = this.f21052f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            w9 w9Var2 = this.f21052f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f21093z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, u10));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof i5) {
                i5 i5Var = (i5) drawable;
                i5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                i5Var.a(f14, true);
            }
        }
    }

    public final void w() {
        k5 k5Var;
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G && (k5Var = u0Var.H) != null) {
                    k5Var.p(u0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        y yVar = this.E;
        if (yVar != null && str != null) {
            boolean z10 = this.f21068n0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.G) {
                        if (!z10) {
                            yVar.f21964b.v(u0Var.L(z11));
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
        this.f21075q1 = i10;
        this.f21078r1 = i11;
        this.f21073p1 = AndroidUtilities.isTablet();
        m4.z zVar = new m4.z(23, this, recyclerView);
        recyclerView.j(new ah.d0(zVar, 17));
        this.f21071o1 = z10;
        if (this.f21069n1) {
            zVar.run();
            return;
        }
        this.f21069n1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f21081s1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f21083t1 = f7;
        b();
    }

    public final void z(mm0 mm0Var, boolean z10) {
        y(mm0Var, z10, k6.f21125a7, k6.f21462s8);
    }

    public void setAdaptiveBackground(bp0 bp0Var) {
        int i10 = k6.f21125a7;
        int i11 = k6.f21462s8;
        this.f21075q1 = i10;
        this.f21078r1 = i11;
        this.f21073p1 = AndroidUtilities.isTablet();
        b();
        m4.z zVar = new m4.z(22, this, bp0Var);
        bp0Var.f25121f.add(zVar);
        if (this.f21069n1) {
            zVar.run();
            return;
        }
        this.f21069n1 = true;
        boolean canScrollVertically = bp0Var.canScrollVertically(-1);
        this.f21081s1 = !canScrollVertically;
        this.f21083t1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
