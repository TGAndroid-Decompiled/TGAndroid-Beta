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
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.sz0;
public class k extends FrameLayout implements xd.b, b6 {
    public boolean A0;
    public z B;
    public boolean B0;
    public d C;
    public eh.d C0;
    public String D;
    public boolean D0;
    public boolean E;
    public View.OnTouchListener E0;
    public boolean F;
    public final g6 F0;
    public boolean G;
    public pv0 G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public final Paint I0;
    public boolean J;
    public final Rect J0;
    public boolean K;
    public final cb.m K0;
    public int L;
    public boolean L0;
    public AnimatorSet M;
    public boolean M0;
    public View[] N;
    public boolean N0;
    public boolean O;
    public ao O0;
    public bw0 P;
    public boolean P0;
    public q00 Q;
    public Runnable Q0;
    public Paint.FontMetricsInt R;
    public sz0 R0;
    public boolean S;
    public AnimatorSet S0;
    public Rect T;
    public int T0;
    public int U;
    public int U0;
    public boolean V;
    public boolean V0;
    public CharSequence W;
    public boolean W0;
    public float X0;
    public final xd.c Y0;
    public final xd.a Z0;
    public qg.b f21523a;
    public Drawable f21524a0;
    public final xd.c f21525a1;
    public qg.b f21526b;
    public View.OnClickListener f21527b0;
    public final xd.a f21528b1;
    public qg.b f21529c;
    public String f21530c0;
    public int f21531c1;
    public final b5 d;
    public final Object[] f21532d0;
    public int f21533d1;
    public ImageView f21534e;
    public Runnable f21535e0;
    public boolean f21536e1;
    public p9 f21537f;
    public boolean f21538f0;
    public boolean f21539f1;
    public Runnable f21540g0;
    public boolean f21541g1;
    public Drawable h;
    public boolean f21542h0;
    public boolean f21543h1;
    public int f21544i0;
    public oh.i f21545i1;
    public boolean f21546j0;
    public boolean f21547j1;
    public boolean f21548k0;
    public boolean f21549k1;
    public float f21550l0;
    public int l1;
    public int m0;
    public int f21551m1;
    public final l5[] f21552n;
    public int f21553n0;
    public boolean f21554n1;
    public int f21555o0;
    public float f21556o1;
    public int f21557p0;
    public ValueAnimator f21558p1;
    public p2 f21559q0;
    public l5 f21560r;
    public j f21561r0;
    public l5 f21562s;
    public int f21563s0;
    public boolean f21564t0;
    public boolean f21565u0;
    public View v;
    public boolean f21566v0;
    public int f21567w;
    public boolean f21568w0;
    public int f21569x;
    public CharSequence f21570x0;
    public boolean f21571y;
    public boolean f21572y0;
    public boolean f21573z0;

    public k(Context context, g6 g6Var) {
        super(context);
        this.d = b5.f21199a;
        this.f21552n = new l5[2];
        this.F = true;
        this.H = true;
        this.J = true;
        this.f21532d0 = new Object[3];
        this.f21542h0 = true;
        this.f21544i0 = 255;
        this.f21563s0 = 0;
        this.I0 = new Paint();
        this.J0 = new Rect();
        this.K0 = new cb.m(this);
        pr prVar = pr.h;
        this.Y0 = new xd.c(0, this, prVar, 380L);
        this.Z0 = new xd.a(0, this, prVar, 380L, false);
        this.f21525a1 = new xd.c(0, this, prVar, 320L);
        this.f21528b1 = new xd.a(0, this, prVar, 320L, false);
        this.f21554n1 = true;
        this.f21556o1 = 1.0f;
        this.F0 = g6Var;
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

    public final void A(sl0 sl0Var, boolean z4) {
        y(sl0Var, z4, k6.f21607a7, k6.f21932s8);
    }

    public final void B(int i10, boolean z4) {
        ImageView imageView;
        if (z4) {
            this.f21553n0 = i10;
            if (this.G && (imageView = this.f21534e) != null) {
                imageView.setBackgroundDrawable(k6.f0(i10, 1, -1));
            }
            d dVar = this.C;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.m0 = i10;
        ImageView imageView2 = this.f21534e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(k6.f0(i10, 1, -1));
        }
        z zVar = this.B;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i10, boolean z4) {
        if (z4) {
            this.f21557p0 = i10;
            d dVar = this.C;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f21534e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f21534e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f21555o0 = i10;
            ImageView imageView2 = this.f21534e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof i2) {
                    ((i2) drawable2).a(i10);
                } else if (drawable2 instanceof g5) {
                    ((g5) drawable2).f21397j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f21534e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f21534e;
        if (imageView3 != null && this.P0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f21555o0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void D(int i10, boolean z4) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z4 && (dVar = this.C) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i10);
                }
                i11++;
            }
        } else if (!z4 && (zVar = this.B) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).B(i10);
                }
                i11++;
            }
        }
    }

    public final void E(int i10, boolean z4, boolean z10) {
        z zVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.C) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i10, z4);
                }
                i11++;
            }
        } else if (!z10 && (zVar = this.B) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).G(i10, z4);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z4) {
        z zVar;
        d dVar;
        if (z4 && (dVar = this.C) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z4 && (zVar = this.B) != null) {
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void G(int i10, boolean z4) {
        z zVar = this.B;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.D) {
                        if (z4) {
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

    public final void H(CharSequence charSequence, org.telegram.ui.Components.j5 j5Var) {
        int i10;
        l5[] l5VarArr = this.f21552n;
        if (charSequence != null && l5VarArr[0] == null) {
            p(0);
        }
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            if (charSequence != null && !this.f21548k0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            l5Var.setVisibility(i10);
            l5 l5Var2 = l5VarArr[0];
            this.W = charSequence;
            l5Var2.k(charSequence);
            if (this.f21573z0) {
                Drawable drawable = this.f21524a0;
                if (drawable instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable).l(null);
                }
            }
            l5 l5Var3 = l5VarArr[0];
            this.f21524a0 = j5Var;
            l5Var3.i(j5Var);
            if (this.f21573z0) {
                Drawable drawable2 = this.f21524a0;
                if (drawable2 instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable2).l(l5VarArr[0]);
                }
            }
            l5VarArr[0].setRightDrawableOnClick(this.f21527b0);
        }
        this.f21566v0 = false;
    }

    public final void I(CharSequence charSequence, boolean z4, long j10, Interpolator interpolator) {
        boolean z10;
        float f10;
        l5[] l5VarArr = this.f21552n;
        if (l5VarArr[0] != null && charSequence != null) {
            if (this.f21564t0 && !TextUtils.isEmpty(this.f21570x0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f21560r.getVisibility() != 0) {
                    this.f21560r.setVisibility(0);
                    this.f21560r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f21560r.animate();
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(220L).start();
            }
            l5 l5Var = l5VarArr[1];
            if (l5Var != null) {
                if (l5Var.getParent() != null) {
                    ((ViewGroup) l5VarArr[1].getParent()).removeView(l5VarArr[1]);
                }
                l5VarArr[1] = null;
            }
            l5VarArr[1] = l5VarArr[0];
            l5VarArr[0] = null;
            setTitle(charSequence);
            this.f21566v0 = z4;
            l5VarArr[0].setAlpha(0.0f);
            if (!z10) {
                l5 l5Var2 = l5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z4) {
                    dp = -dp;
                }
                l5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = l5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f21565u0 = true;
            ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
            if (!z10) {
                int dp2 = AndroidUtilities.dp(20.0f);
                if (z4) {
                    dp2 = -dp2;
                }
                alpha.translationY(dp2);
            }
            if (interpolator != null) {
                alpha.setInterpolator(interpolator);
            }
            alpha.setDuration(j10).setListener(new g(this, z10, z4, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void J(String str, int i10, Runnable runnable) {
        String str2;
        boolean z4;
        SpannableString spannableString;
        boolean z10;
        l5 l5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.V && this.f21559q0.parentLayout != null) {
            Object[] objArr = this.f21532d0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.V0) {
                String str3 = this.f21530c0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f21530c0 = str;
                        Drawable drawable = null;
                        if (this.f21545i1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f21545i1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.W;
                        }
                        if (str == null) {
                            drawable = this.f21524a0;
                        }
                        cb.m mVar = this.K0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            mVar.x(valueOf, indexOf);
                            z4 = true;
                            spannableString = valueOf;
                        } else {
                            z4 = false;
                            spannableString = str2;
                        }
                        if (str != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f21538f0 = z10;
                        l5[] l5VarArr = this.f21552n;
                        if ((spannableString == null || l5VarArr[0] != null) && getMeasuredWidth() != 0 && ((l5Var = l5VarArr[0]) == null || l5Var.getVisibility() == 0)) {
                            l5 l5Var2 = l5VarArr[0];
                            if (l5Var2 != null) {
                                l5Var2.animate().cancel();
                                l5 l5Var3 = l5VarArr[1];
                                if (l5Var3 != null) {
                                    l5Var3.animate().cancel();
                                }
                                if (l5VarArr[1] == null) {
                                    p(1);
                                }
                                l5VarArr[1].k(spannableString);
                                l5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                l5VarArr[1].i(drawable);
                                l5VarArr[1].setRightDrawableOnClick(this.f21527b0);
                                if (drawable instanceof org.telegram.ui.Components.j5) {
                                    ((org.telegram.ui.Components.j5) drawable).l(l5VarArr[1]);
                                }
                                if (z4) {
                                    mVar.c(l5VarArr[1]);
                                }
                                this.V0 = true;
                                l5 l5Var4 = l5VarArr[1];
                                l5VarArr[1] = l5VarArr[0];
                                l5VarArr[0] = l5Var4;
                                l5Var4.setAlpha(0.0f);
                                l5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = l5VarArr[0].animate();
                                float f10 = 1.0f;
                                if (this.f21549k1) {
                                    f10 = 1.0f - this.f21556o1;
                                }
                                animate.alpha(f10).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
                                if (this.f21560r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f21568w0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.O) {
                                l5VarArr[0].invalidate();
                                invalidate();
                            }
                            l5VarArr[0].k(spannableString);
                            l5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            l5VarArr[0].i(drawable);
                            l5VarArr[0].setRightDrawableOnClick(this.f21527b0);
                            if (drawable instanceof org.telegram.ui.Components.j5) {
                                ((org.telegram.ui.Components.j5) drawable).l(l5VarArr[0]);
                            }
                            if (z4) {
                                mVar.c(l5VarArr[0]);
                            } else {
                                mVar.t(l5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f21535e0;
                        }
                        this.f21540g0 = runnable;
                    }
                }
            }
        }
    }

    public final void K() {
        this.D0 = true;
        if (this.C0 == null) {
            eh.d dVar = new eh.d(getContext(), 5);
            this.C0 = dVar;
            addView(dVar);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        invalidate();
    }

    public final void M(og.a aVar, rg.d dVar, boolean z4) {
        setBackground(null);
        setClipChildren(false);
        this.L0 = true;
        this.N0 = z4;
        qg.b c3 = aVar.c(this, null, false);
        c3.n(dVar);
        c3.o(AndroidUtilities.dp(6.0f));
        this.f21523a = c3;
        if (z4) {
            c3.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c3.p(AndroidUtilities.dp(23.0f));
        }
        qg.b c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(23.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        this.f21526b = c10;
        qg.b c11 = aVar.c(this, null, false);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.f21529c = c11;
        z zVar = this.B;
        if (zVar != null) {
            zVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.B.setGlassMode(true);
        }
        d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.C.setGlassMode(true);
        }
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.I) {
            l5[] l5VarArr = this.f21552n;
            if (view == l5VarArr[0] || view == l5VarArr[1] || view == this.f21560r || view == this.B || view == this.f21534e || view == this.f21562s || view == this.C0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.C != null && !this.G) {
            this.G = true;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.C, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.N = viewArr;
            if (this.f21567w == 0) {
                if (!this.f21548k0) {
                    l5 l5Var = this.f21552n[0];
                    if (l5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f));
                    }
                    if (this.f21560r != null && !TextUtils.isEmpty(this.f21570x0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f21560r, property, 0.0f));
                    }
                }
                z zVar = this.B;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f21567w;
            if (i10 == 0) {
                i10 = this.f21569x;
            }
            if (i10 != 0 && !this.L0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.M;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.M = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.R0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 2));
                this.M.playTogether(ofFloat);
            }
            this.M.setDuration(200L);
            this.M.addListener(new eg.w2(7, this, zArr));
            this.M.start();
            ImageView imageView = this.f21534e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(1.0f, true);
                }
                this.f21534e.setBackgroundDrawable(k6.f0(this.f21553n0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z4;
        if (this.f21573z0 && this.A0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.B0 != z4) {
            this.B0 = z4;
            cb.m mVar = this.K0;
            if (z4) {
                mVar.f2424a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f2426c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f2424a = false;
            ((AnimatorSet) mVar.f2426c).cancel();
        }
    }

    public final boolean a(String str) {
        if (this.C != null) {
            String str2 = this.D;
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
        if (this.f21547j1) {
            if (this.f21549k1) {
                eh.d dVar = this.C0;
                if (dVar != null) {
                    dVar.setAlpha(1.0f - this.f21556o1);
                } else {
                    l5 l5Var = this.f21552n[0];
                    if (l5Var != null) {
                        l5Var.setAlpha(1.0f - this.f21556o1);
                    }
                }
            }
            float f10 = this.f21556o1;
            int i10 = this.f21551m1;
            g6 g6Var = this.F0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = k6.v0(i10, g6Var);
            }
            int i11 = this.l1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = k6.v0(i11, g6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f10, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f21556o1) * 255.0f));
            if (this.H0) {
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
            this.f21568w0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) pr.f30168f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z4) {
        boolean z10;
        float f10;
        ao aoVar = this.O0;
        if (aoVar == null) {
            return;
        }
        wn wnVar = aoVar.f25309e;
        if (wnVar != null && wnVar.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.O0.getVisualWidth());
        xd.c cVar = this.Y0;
        if (z4) {
            if (cVar.f50548g) {
                f10 = cVar.f50547f;
            } else {
                f10 = cVar.f50546e;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.Z0.a(z10, z4);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z4;
        float f10;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        float f12;
        ao aoVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f21536e1) {
            i10 = this.f21531c1;
        } else {
            i10 = (int) this.f21525a1.f50546e;
        }
        if (this.f21539f1) {
            i10 = Math.max((int) ((1.0f - this.X0) * this.f21533d1), i10);
        }
        ImageView imageView = this.f21534e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i15 = dp * 2;
        int i16 = height + dp2 + i15;
        qg.b bVar = this.f21523a;
        xd.a aVar = this.f21528b1;
        if (bVar != null && !this.M0) {
            if (this.f21536e1 || this.f21539f1) {
                f10 = 1.0f;
                if (i10 > 0) {
                    i13 = dp;
                } else {
                    i13 = 0;
                }
            } else {
                f10 = 1.0f;
                i13 = (int) (dp * aVar.f50541e);
            }
            int i17 = i13 + i10;
            int i18 = dp + dp2;
            int max = Math.max(i17, i18);
            ao aoVar2 = this.O0;
            xd.a aVar2 = this.Z0;
            if (aoVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = f10 - aVar2.f50541e;
            }
            int lerp = AndroidUtilities.lerp(i17, max, f11);
            if (z4) {
                i14 = i18;
            } else {
                i14 = 0;
            }
            if (this.O0 == null) {
                f12 = 0.0f;
            } else {
                f12 = f10 - aVar2.f50541e;
            }
            int lerp2 = AndroidUtilities.lerp(i14, i18, f12);
            int width = getWidth() - lerp;
            int i19 = width - lerp2;
            if (this.O0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.Y0.f50546e) + i15), i19, Math.max(this.X0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.O0.getLayoutParams()).leftMargin) - this.O0.getLeftPadding()) + dp;
                this.O0.setTranslationX(dp3);
                this.O0.setPivotX((aoVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f21523a.setBounds(lerp2, height, width, i16);
            this.f21523a.draw(canvas);
        } else {
            f10 = 1.0f;
        }
        qg.b bVar2 = this.f21526b;
        if (bVar2 != null && z4) {
            bVar2.setBounds(0, height, dp2 + i15, i16);
            this.f21526b.draw(canvas);
        }
        qg.b bVar3 = this.f21529c;
        if (bVar3 != null && i10 > 0 && !this.M0 && !this.f21543h1) {
            bVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            qg.b bVar4 = this.f21529c;
            if (this.f21536e1) {
                i12 = 255;
            } else {
                i12 = (int) (aVar.f50541e * 255.0f);
            }
            bVar4.setAlpha(i12);
            this.f21529c.draw(canvas);
        }
        if (this.H0 && this.f21569x != 0) {
            this.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f21569x;
            Paint paint = this.I0;
            paint.setColor(i20);
            if (this.f21547j1) {
                pv0 pv0Var = this.G0;
                float y10 = getY();
                float f13 = f10 - this.f21556o1;
                pv0Var.getClass();
                if (pv0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = k6.f22028xf;
                } else {
                    i11 = k6.f22047yf;
                }
                pv0Var.K(canvas, y10, this.J0, paint, true, AndroidUtilities.lerp(255, Color.alpha(k6.v0(i11, pv0Var.getResourceProvider())), f13));
            } else {
                this.G0.J(canvas, getY(), this.J0, paint, true);
            }
        }
        this.f21541g1 = true;
        if (this.W0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        if (this.O0 != null && this.L0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View q10 = q(this, f10, f11, this.O0);
            if (q10 == null) {
                q10 = q(this, f10, f11, null);
            }
            qg.b bVar = this.f21523a;
            boolean z11 = true;
            if (bVar != null && bVar.getBounds().contains(x10, y10)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (q10 != null && q10 != this.O0) {
                qg.b bVar2 = this.f21526b;
                if (bVar2 != null && bVar2.getBounds().contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z4 | z10;
                qg.b bVar3 = this.f21529c;
                z4 = z12 | ((bVar3 == null || !bVar3.getBounds().contains(x10, y10)) ? false : false);
            }
            if (!z4) {
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
        qg.b bVar = this.f21523a;
        if (bVar != null) {
            bVar.u();
        }
        qg.b bVar2 = this.f21529c;
        if (bVar2 != null) {
            bVar2.u();
        }
        qg.b bVar3 = this.f21526b;
        if (bVar3 != null) {
            bVar3.u();
        }
        oh.i iVar = this.f21545i1;
        if (iVar != null) {
            iVar.c();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof i2) && !(drawable instanceof g5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.f21534e.getLayerType() != i10) {
                this.f21534e.setLayerType(i10, null);
                this.f21534e.invalidate();
            }
        }
    }

    public final void g() {
        int i10;
        int i11;
        float f10;
        z zVar = this.B;
        boolean z4 = false;
        if (zVar != null) {
            i10 = (zVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        int max = Math.max(0, i10);
        d dVar = this.C;
        if (dVar != null) {
            i11 = (dVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i11 = 0;
        }
        int max2 = Math.max(0, i11);
        AndroidUtilities.dp(46.0f);
        if (this.G) {
            max = max2;
        }
        if (max > 0) {
            z4 = true;
        }
        this.f21528b1.a(z4, this.f21541g1);
        xd.c cVar = this.f21525a1;
        if (cVar.f50548g) {
            f10 = cVar.f50547f;
        } else {
            f10 = cVar.f50546e;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f21541g1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f21561r0;
    }

    public z getActionMode() {
        return this.C;
    }

    public float getActionModeFactor() {
        d dVar = this.C;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f21545i1;
    }

    public l5 getAdditionalSubtitleTextView() {
        return this.f21562s;
    }

    public ImageView getBackButton() {
        return this.f21534e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public b5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f21569x;
    }

    public boolean getCastShadows() {
        return this.f21542h0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.F;
    }

    public p9 getSearchAvatarImageView() {
        return this.f21537f;
    }

    public int getShadowAlpha() {
        return this.f21544i0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f21560r != null && (charSequence = this.f21570x0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public l5 getSubtitleTextView() {
        return this.f21560r;
    }

    public String getTitle() {
        l5 l5Var = this.f21552n[0];
        if (l5Var == null) {
            return null;
        }
        return l5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        l5 l5Var = this.f21552n[0];
        if (l5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f10));
            return textPaint.getFontMetricsInt();
        }
        return l5Var.getPaint().getFontMetricsInt();
    }

    public l5 getTitleTextView() {
        return this.f21552n[0];
    }

    public l5 getTitleTextView2() {
        return this.f21552n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.C0;
    }

    public void h(boolean z4) {
        z zVar;
        if (this.f21548k0 && (zVar = this.B) != null) {
            zVar.j(z4);
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
        int i10;
        if (a(str)) {
            return this.C;
        }
        d dVar = this.C;
        if (dVar != null) {
            removeView(dVar);
            this.C = null;
        }
        this.D = str;
        d dVar2 = new d(this, getContext(), this);
        this.C = dVar2;
        if (this.L0) {
            f10 = -AndroidUtilities.dp(10.0f);
        } else {
            f10 = 0.0f;
        }
        dVar2.setTranslationX(f10);
        this.C.setGlassMode(this.L0);
        d dVar3 = this.C;
        dVar3.f22476c = true;
        dVar3.setClickable(true);
        if (!this.L0) {
            this.C.setBackgroundColor(k6.v0(k6.f22002w8, this.F0));
        }
        addView(this.C, indexOfChild(this.f21534e));
        d dVar4 = this.C;
        if (this.F) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        dVar4.setPadding(0, i10, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.L;
        layoutParams.gravity = 5;
        this.C.setLayoutParams(layoutParams);
        this.C.setVisibility(4);
        return this.C;
    }

    public final void k() {
        if (this.f21545i1 == null) {
            oh.i iVar = new oh.i(this, getContext(), this.F0, this.K0);
            this.f21545i1 = iVar;
            iVar.setClipChildren(false);
            addView(this.f21545i1);
        }
    }

    public final void l() {
        if (this.f21562s != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f21562s = l5Var;
        l5Var.setGravity(3);
        this.f21562s.setVisibility(8);
        this.f21562s.setTextColor(k6.v0(k6.B8, this.F0));
        addView(this.f21562s, 0, k7.c6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f21534e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f21534e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f21534e.setBackgroundDrawable(k6.f0(this.m0, 1, -1));
        this.f21534e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f21534e, k7.c6.e(54, 54, 51));
        this.f21534e.setOnClickListener(new b(this, 1));
        this.f21534e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.B = zVar2;
        addView(zVar2, 0, k7.c6.e(-2, -1, 5));
        return this.B;
    }

    public final void o() {
        if (this.f21560r != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f21560r = l5Var;
        l5Var.setGravity(3);
        this.f21560r.setVisibility(8);
        this.f21560r.setTextColor(k6.v0(k6.B8, this.F0));
        addView(this.f21560r, 0, k7.c6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21573z0 = true;
        P();
        if (this.G) {
            int i10 = this.f21567w;
            if (i10 == 0) {
                i10 = this.f21569x;
            }
            if (i10 != 0 && !this.L0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21524a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(this.f21552n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21573z0 = false;
        P();
        if (this.G) {
            int i10 = this.f21569x;
            if (i10 != 0 && this.f21567w != 0 && !this.L0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f21524a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.O && !this.f21538f0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = k6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.S = true;
            bw0 bw0Var = this.P;
            l5[] l5VarArr = this.f21552n;
            if (bw0Var == null) {
                this.Q = null;
                this.P = new bw0(0);
                l5VarArr[0].invalidate();
                invalidate();
            } else {
                this.P = null;
                ?? obj = new Object();
                obj.f30251c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f30249a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(k6.w0(null, k6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new p00(obj));
                }
                this.Q = obj;
                l5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.E0;
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
        float f10;
        int dp;
        l5[] l5VarArr;
        l5 l5Var;
        int i13;
        int i14;
        int i15;
        l5 l5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f11;
        int i18;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        kVar.E = true;
        View view = kVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        d dVar = kVar.C;
        if (dVar != null) {
            if (kVar.F) {
                i18 = AndroidUtilities.statusBarHeight;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.E = false;
        if (kVar.F) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i12 + kVar.L);
        ImageView imageView = kVar.f21534e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f21534e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
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
        z zVar = kVar.B;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.B.p() && !kVar.f21548k0) {
                kVar.B.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l10 = kVar.B.l();
                if (kVar.f21546j0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.B.l() + (size - AndroidUtilities.dp(f12)), 1073741824);
                if (!kVar.f21571y) {
                    kVar.B.r(-l10);
                }
            } else if (kVar.f21548k0) {
                if (kVar.f21546j0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = org.telegram.ui.b.d(f12, size, 1073741824);
                if (!kVar.f21571y) {
                    kVar.B.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f21571y) {
                    kVar.B.r(0.0f);
                }
            }
            kVar.B.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            l5VarArr = kVar.f21552n;
            if (i20 >= 2) {
                break;
            }
            l5 l5Var3 = l5VarArr[0];
            if ((l5Var3 != null && l5Var3.getVisibility() != 8) || ((l5Var = kVar.f21560r) != null && l5Var.getVisibility() != 8)) {
                z zVar2 = kVar.B;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.y3.B(16.0f, size - i13, dp) - kVar.U, 0);
                boolean z4 = kVar.f21566v0;
                int i21 = 20;
                if (((z4 && i20 == 0) || (!z4 && i20 == i19)) && kVar.f21564t0 && kVar.f21565u0) {
                    l5 l5Var4 = l5VarArr[i20];
                    if (kVar.L0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    l5Var4.setTextSize(i21);
                } else {
                    l5 l5Var5 = l5VarArr[0];
                    if (l5Var5 != null && l5Var5.getVisibility() != 8 && (l5Var2 = kVar.f21560r) != null && l5Var2.getVisibility() != 8) {
                        l5 l5Var6 = l5VarArr[i20];
                        if (l5Var6 != null) {
                            if (kVar.L0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            l5Var6.setTextSize(i21);
                        }
                        l5 l5Var7 = kVar.f21560r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        l5Var7.setTextSize(i16);
                        l5 l5Var8 = kVar.f21562s;
                        if (l5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            l5Var8.setTextSize(i17);
                        }
                    } else {
                        l5 l5Var9 = l5VarArr[i20];
                        if (l5Var9 != null && l5Var9.getVisibility() != 8) {
                            l5 l5Var10 = l5VarArr[i20];
                            if (kVar.L0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            l5Var10.setTextSize(i21);
                        }
                        l5 l5Var11 = kVar.f21560r;
                        if (l5Var11 != null && l5Var11.getVisibility() != 8) {
                            l5 l5Var12 = kVar.f21560r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            l5Var12.setTextSize(i15);
                        }
                        l5 l5Var13 = kVar.f21562s;
                        if (l5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            l5Var13.setTextSize(i14);
                        }
                    }
                }
                l5 l5Var14 = l5VarArr[i20];
                if (l5Var14 != null && l5Var14.getVisibility() != 8) {
                    l5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(l5VarArr[i20].getPaddingBottom() + l5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f21568w0) {
                        CharSequence text = l5VarArr[i20].getText();
                        l5 l5Var15 = l5VarArr[i20];
                        l5Var15.setPivotX(l5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        l5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        l5VarArr[i20].setPivotX(0.0f);
                        l5VarArr[i20].setPivotY(0.0f);
                    }
                }
                l5 l5Var16 = kVar.f21560r;
                if (l5Var16 != null && l5Var16.getVisibility() != 8) {
                    kVar.f21560r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                oh.i iVar = kVar.f21545i1;
                if (iVar != null) {
                    iVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                l5 l5Var17 = kVar.f21562s;
                if (l5Var17 != null && l5Var17.getVisibility() != 8) {
                    kVar.f21562s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        p9 p9Var = kVar.f21537f;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != l5VarArr[0] && childAt != l5VarArr[1] && childAt != kVar.f21545i1 && childAt != kVar.f21560r && childAt != kVar.B && childAt != kVar.f21534e && childAt != kVar.f21562s && childAt != kVar.f21537f) {
                kVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i22++;
            kVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.J) {
            return false;
        }
        return true;
    }

    public final void p(int i10) {
        View[] viewArr = this.f21552n;
        if (viewArr[i10] != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        viewArr[i10] = l5Var;
        l5Var.setGravity(19);
        int i11 = this.f21563s0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(k6.v0(k6.A8, this.F0));
        }
        l5 l5Var2 = viewArr[i10];
        l5Var2.setEmojiColor(l5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.D0) {
            this.C0.addView(viewArr[i10], 0, k7.c6.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, k7.c6.e(-2, -2, 51));
        }
    }

    public void r() {
        d dVar = this.C;
        if (dVar != null && this.G) {
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).n();
                }
            }
            this.G = false;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.C, property, 0.0f));
            if (this.N != null) {
                int i11 = 0;
                while (true) {
                    View[] viewArr = this.N;
                    if (i11 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i11];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.N[i11], property, 1.0f));
                    }
                    i11++;
                }
            }
            boolean z4 = this.f21548k0;
            l5[] l5VarArr = this.f21552n;
            if (!z4) {
                l5 l5Var = l5VarArr[0];
                if (l5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 1.0f));
                }
                if (this.f21560r != null && !TextUtils.isEmpty(this.f21570x0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f21560r, property, 1.0f));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f21569x;
            if (i12 != 0 && !this.L0) {
                if (i0.a.f(i12) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.M;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.M = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.R0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.M.playTogether(ofFloat);
            }
            this.M.setDuration(200L);
            this.M.addListener(new e(this, 0));
            this.M.start();
            if (!this.f21548k0) {
                l5 l5Var2 = l5VarArr[0];
                if (l5Var2 != null) {
                    l5Var2.setVisibility(0);
                }
                if (this.f21560r != null && !TextUtils.isEmpty(this.f21570x0)) {
                    this.f21560r.setVisibility(0);
                }
            }
            z zVar2 = this.B;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.f21534e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(0.0f, true);
                }
                this.f21534e.setBackgroundDrawable(k6.f0(this.m0, 1, -1));
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        if (this.C != null && this.G) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f21561r0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.C;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f21567w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, k6.f21607a7, k6.f21932s8);
    }

    public void setAddToContainer(boolean z4) {
        this.H = z4;
    }

    public void setAdditionalTextLeft(int i10) {
        this.T0 = i10;
    }

    public void setAllowOverlayTitle(boolean z4) {
        this.V = z4;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f10;
        if (this.f21534e == null) {
            m();
        }
        ImageView imageView = this.f21534e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f21534e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof i2) {
            i2 i2Var = (i2) drawable;
            if (s()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i2Var.c(f10, false);
            i2Var.b(this.f21557p0);
            i2Var.a(this.f21555o0);
        } else if (drawable instanceof g5) {
            g5 g5Var = (g5) drawable;
            g5Var.f21398k = this.f21569x;
            g5Var.f21397j = this.f21555o0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f21534e.setColorFilter(new PorterDuffColorFilter(this.f21555o0, PorterDuff.Mode.SRC_IN));
        }
        if (this.P0) {
            this.f21534e.setColorFilter(new PorterDuffColorFilter(this.f21555o0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.f21534e == null) {
            m();
        }
        ImageView imageView = this.f21534e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.f21534e.setImageResource(i10);
        this.f21534e.setColorFilter(new PorterDuffColorFilter(this.f21555o0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f21569x = i10;
        if (!this.H0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g5) {
                ((g5) drawable).f21398k = i10;
            }
        }
    }

    public void setCastShadows(boolean z4) {
        if (this.f21542h0 != z4 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21542h0 = z4;
    }

    public void setChatAvatarContainer(ao aoVar) {
        this.O0 = aoVar;
    }

    public void setClipContent(boolean z4) {
        this.I = z4;
    }

    public void setDrawBackButton(boolean z4) {
        this.f21572y0 = z4;
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(pv0 pv0Var) {
        this.H0 = true;
        this.G0 = pv0Var;
        pv0Var.Q.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            imageView.setEnabled(z4);
        }
        z zVar = this.B;
        if (zVar != null) {
            zVar.setEnabled(z4);
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.setEnabled(z4);
        }
    }

    public void setExtraHeight(int i10) {
        this.L = i10;
        d dVar = this.C;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.L;
            this.C.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z4) {
        this.K = z4;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.f21539f1 = true;
        if (this.f21533d1 != i10) {
            this.f21533d1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f21536e1 = true;
        if (this.f21531c1 != i10) {
            this.f21531c1 = i10;
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.E0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z4) {
        this.J = z4;
    }

    public void setMenuOffsetSuppressed(boolean z4) {
        this.f21571y = z4;
    }

    public void setOccupyStatusBar(boolean z4) {
        int i10;
        this.F = z4;
        d dVar = this.C;
        if (dVar != null) {
            if (z4) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            dVar.setPadding(0, i10, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z4) {
        this.f21564t0 = z4;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f21527b0 = onClickListener;
        l5[] l5VarArr = this.f21552n;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setRightDrawableOnClick(onClickListener);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setRightDrawableOnClick(this.f21527b0);
        }
    }

    public void setSearchAvatarImageView(p9 p9Var) {
        p9 p9Var2 = this.f21537f;
        if (p9Var2 != p9Var) {
            if (p9Var2 != null) {
                removeView(p9Var2);
            }
            this.f21537f = p9Var;
            if (p9Var != null) {
                addView(p9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        z zVar = this.B;
        if (zVar != null) {
            zVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.X0 != f10) {
            this.X0 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.B.setSearchFieldText(str);
    }

    public void setSearchFilter(uf.e0 e0Var) {
        z zVar = this.B;
        if (zVar != null) {
            zVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f21544i0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f21544i0 = i10;
    }

    public void setSkipDrawChild(boolean z4) {
        if (this.W0 != z4) {
            this.W0 = z4;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f21560r == null) {
            o();
        }
        if (this.f21560r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            l5 l5Var = this.f21560r;
            if (!isEmpty && !this.f21548k0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            l5Var.setVisibility(i10);
            this.f21560r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f21560r.l(charSequence, false);
            }
            this.f21570x0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f21560r == null) {
            o();
        }
        this.f21560r.setTextColor(i10);
    }

    public void setSupportsHolidayImage(boolean z4) {
        this.O = z4;
        if (z4) {
            this.R = new Paint.FontMetricsInt();
            this.T = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        H(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f21540g0 = runnable;
        this.f21535e0 = runnable;
    }

    public void setTitleColor(int i10) {
        l5[] l5VarArr = this.f21552n;
        if (l5VarArr[0] == null) {
            p(0);
        }
        this.f21563s0 = i10;
        l5VarArr[0].setTextColor(i10);
        l5VarArr[0].setEmojiColor(i10);
        l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            l5Var.setTextColor(i10);
            l5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.U = i10;
    }

    public void setTitleScrollNonFitText(boolean z4) {
        this.f21552n[0].setScrollNonFitText(z4);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.I) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.C != null && this.G) {
            String str2 = this.D;
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

    public void v(boolean z4) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i10;
        this.f21548k0 = z4;
        g();
        AnimatorSet animatorSet = this.S0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.S0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            l5 l5Var = this.f21552n[0];
            if (l5Var != null) {
                arrayList.add(l5Var);
            }
            if (this.f21560r != null && !TextUtils.isEmpty(this.f21570x0)) {
                arrayList.add(this.f21560r);
                l5 l5Var2 = this.f21560r;
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                l5Var2.setVisibility(i10);
            }
        }
        float f14 = this.f21550l0;
        float f15 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 1));
        this.S0.playTogether(ofFloat);
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i11 >= size) {
                break;
            }
            View view = (View) arrayList.get(i11);
            float f16 = 0.95f;
            if (!z4) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.S0;
            if (z4) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.S0;
            if (z4) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.S0;
            if (!z4) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i11++;
        }
        p9 p9Var = this.f21537f;
        if (p9Var != null) {
            p9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.S0;
            p9 p9Var2 = this.f21537f;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(p9Var2, property, f11));
        }
        this.f21568w0 = true;
        requestLayout();
        this.S0.addListener(new f(this, arrayList, z4, u10));
        this.S0.setDuration(150L).start();
        ImageView imageView = this.f21534e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g5) {
                g5 g5Var = (g5) drawable;
                g5Var.h = true;
                if (z4) {
                    f15 = 1.0f;
                }
                g5Var.a(f15, true);
            }
        }
    }

    public final void w() {
        i5 i5Var;
        z zVar = this.B;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D && (i5Var = w0Var.E) != null) {
                    i5Var.p(w0Var.f22351e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.B;
        if (zVar != null && str != null) {
            boolean z4 = this.f21548k0;
            boolean z10 = !z4;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.D) {
                        if (!z4) {
                            zVar.f22475b.v(w0Var.L(z10));
                        }
                        w0Var.H(str, false);
                        w0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void y(RecyclerView recyclerView, boolean z4, int i10, int i11) {
        float f10;
        this.l1 = i10;
        this.f21551m1 = i11;
        org.telegram.messenger.voip.h hVar = new org.telegram.messenger.voip.h(7, this, recyclerView);
        recyclerView.j(new fg.e2(hVar, 13));
        this.f21549k1 = z4;
        if (this.f21547j1) {
            hVar.run();
            return;
        }
        this.f21547j1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f21554n1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f21556o1 = f10;
        b();
    }

    public void setAdaptiveBackground(eo0 eo0Var) {
        int i10 = k6.f21607a7;
        int i11 = k6.f21932s8;
        this.l1 = i10;
        this.f21551m1 = i11;
        b();
        org.telegram.messenger.voip.h hVar = new org.telegram.messenger.voip.h(6, this, eo0Var);
        eo0Var.f26644f.add(hVar);
        if (this.f21547j1) {
            hVar.run();
            return;
        }
        this.f21547j1 = true;
        boolean canScrollVertically = eo0Var.canScrollVertically(-1);
        this.f21554n1 = !canScrollVertically;
        this.f21556o1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
