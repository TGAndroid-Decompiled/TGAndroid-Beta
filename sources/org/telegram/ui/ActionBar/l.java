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
import org.telegram.messenger.em;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.k01;
public class l extends FrameLayout implements le.d, a6 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public z E;
    public boolean E0;
    public d F;
    public bi.l4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final f6 I0;
    public boolean J;
    public aw0 J0;
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
    public jo R0;
    public lw0 S;
    public boolean S0;
    public w00 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public k01 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public bh.d f18360a;
    public int f18361a0;
    public float f18362a1;
    public bh.d f18363b;
    public boolean f18364b0;
    public final le.e f18365b1;
    public bh.d f18366c;
    public CharSequence f18367c0;
    public final le.b f18368c1;
    public final b5 d;
    public Drawable f18369d0;
    public final le.e f18370d1;
    public ImageView e;
    public View.OnClickListener f18371e0;
    public final le.b f18372e1;
    public w9 f18373f;
    public String f18374f0;
    public int f18375f1;
    public final Object[] f18376g0;
    public int f18377g1;
    public Drawable h;
    public Runnable f18378h0;
    public boolean f18379h1;
    public boolean f18380i0;
    public boolean f18381i1;
    public Runnable f18382j0;
    public boolean f18383j1;
    public boolean f18384k0;
    public boolean f18385k1;
    public int f18386l0;
    public j l1;
    public boolean m0;
    public boolean f18387m1;
    public final l5[] f18388n;
    public boolean f18389n0;
    public boolean f18390n1;
    public float f18391o0;
    public int f18392o1;
    public int f18393p0;
    public int f18394p1;
    public int f18395q0;
    public boolean f18396q1;
    public l5 f18397r;
    public int f18398r0;
    public float f18399r1;
    public l5 f18400s;
    public int f18401s0;
    public ValueAnimator f18402s1;
    public p2 f18403t0;
    public k f18404u0;
    public View v;
    public int f18405v0;
    public int f18406w;
    public boolean f18407w0;
    public int f18408x;
    public boolean f18409x0;
    public boolean f18410y;
    public boolean f18411y0;
    public boolean f18412z0;

    public l(Context context, f6 f6Var) {
        super(context);
        this.d = b5.f17553a;
        this.f18388n = new l5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f18376g0 = new Object[3];
        this.f18384k0 = true;
        this.f18386l0 = 255;
        this.f18405v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new com.google.firebase.messaging.m(this);
        wr wrVar = wr.h;
        this.f18365b1 = new le.e(0, this, wrVar, 380L);
        this.f18368c1 = new le.b(0, this, wrVar, 380L, false);
        this.f18370d1 = new le.e(0, this, wrVar, 320L);
        this.f18372e1 = new le.b(0, this, wrVar, 320L, false);
        this.f18396q1 = true;
        this.f18399r1 = 1.0f;
        this.I0 = f6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View q(l lVar, float f7, float f10, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f18395q0 = i10;
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
        this.f18393p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.f0(i10, 1, -1));
        }
        z zVar = this.E;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i10, boolean z10) {
        if (z10) {
            this.f18401s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f18398r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof i2) {
                    ((i2) drawable2).a(i10);
                } else if (drawable2 instanceof g5) {
                    ((g5) drawable2).f17743j = i10;
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
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f18398r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void D(int i10, boolean z10) {
        z zVar;
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
        } else if (!z10 && (zVar = this.E) != null) {
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

    public final void E(int i10, boolean z10, boolean z11) {
        z zVar;
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
        } else if (!z11 && (zVar = this.E) != null) {
            int childCount2 = zVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = zVar.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).G(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (zVar = this.E) != null) {
            zVar.setPopupItemsSelectorColor(i10);
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        invalidate();
    }

    public final void H(int i10, boolean z10) {
        z zVar = this.E;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
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

    public final void I(CharSequence charSequence, org.telegram.ui.Components.n5 n5Var) {
        int i10;
        l5[] l5VarArr = this.f18388n;
        if (charSequence != null && l5VarArr[0] == null) {
            p(0);
        }
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            if (charSequence != null && !this.f18389n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            l5Var.setVisibility(i10);
            l5 l5Var2 = l5VarArr[0];
            this.f18367c0 = charSequence;
            l5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f18369d0;
                if (drawable instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable).l(null);
                }
            }
            l5 l5Var3 = l5VarArr[0];
            this.f18369d0 = n5Var;
            l5Var3.i(n5Var);
            if (this.C0) {
                Drawable drawable2 = this.f18369d0;
                if (drawable2 instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable2).l(l5VarArr[0]);
                }
            }
            l5VarArr[0].setRightDrawableOnClick(this.f18371e0);
        }
        this.f18411y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f7;
        l5[] l5VarArr = this.f18388n;
        if (l5VarArr[0] != null && charSequence != null) {
            if (this.f18407w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f18397r.getVisibility() != 0) {
                    this.f18397r.setVisibility(0);
                    this.f18397r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f18397r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(220L).start();
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
            this.f18411y0 = z10;
            l5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                l5 l5Var2 = l5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                l5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = l5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f18409x0 = true;
            ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
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
        l5 l5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.f18364b0 && this.f18403t0.parentLayout != null) {
            Object[] objArr = this.f18376g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f18374f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f18374f0 = str;
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
                            str2 = this.f18367c0;
                        }
                        if (str == null) {
                            drawable = this.f18369d0;
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
                        this.f18380i0 = z11;
                        l5[] l5VarArr = this.f18388n;
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
                                l5VarArr[1].setRightDrawableOnClick(this.f18371e0);
                                if (drawable instanceof org.telegram.ui.Components.n5) {
                                    ((org.telegram.ui.Components.n5) drawable).l(l5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(l5VarArr[1]);
                                }
                                this.Y0 = true;
                                l5 l5Var4 = l5VarArr[1];
                                l5VarArr[1] = l5VarArr[0];
                                l5VarArr[0] = l5Var4;
                                l5Var4.setAlpha(0.0f);
                                l5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = l5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f18390n1) {
                                    f7 = 1.0f - this.f18399r1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
                                if (this.f18397r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f18412z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.R) {
                                l5VarArr[0].invalidate();
                                invalidate();
                            }
                            l5VarArr[0].k(spannableString);
                            l5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            l5VarArr[0].i(drawable);
                            l5VarArr[0].setRightDrawableOnClick(this.f18371e0);
                            if (drawable instanceof org.telegram.ui.Components.n5) {
                                ((org.telegram.ui.Components.n5) drawable).l(l5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(l5VarArr[0]);
                            } else {
                                mVar.s(l5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f18378h0;
                        }
                        this.f18382j0 = runnable;
                    }
                }
            }
        }
    }

    public final void L() {
        this.G0 = true;
        if (this.F0 == null) {
            bi.l4 l4Var = new bi.l4(getContext(), 4);
            this.F0 = l4Var;
            addView(l4Var);
        }
    }

    public final void M(zg.a aVar, ch.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.O0 = true;
        this.Q0 = z10;
        bh.d c10 = aVar.c(this, null, false);
        c10.n(eVar);
        c10.o(AndroidUtilities.dp(6.0f));
        this.f18360a = c10;
        if (z10) {
            c10.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.p(AndroidUtilities.dp(23.0f));
        }
        bh.d c11 = aVar.c(this, null, false);
        c11.n(eVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.f18363b = c11;
        bh.d c12 = aVar.c(this, null, false);
        c12.n(eVar);
        c12.p(AndroidUtilities.dp(23.0f));
        c12.o(AndroidUtilities.dp(6.0f));
        this.f18366c = c12;
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
            l5[] l5VarArr = this.f18388n;
            if (view == l5VarArr[0] || view == l5VarArr[1] || view == this.f18397r || view == this.E || view == this.e || view == this.f18400s || view == this.F0) {
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
            if (this.f18406w == 0) {
                if (!this.f18389n0) {
                    l5 l5Var = this.f18388n[0];
                    if (l5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f));
                    }
                    if (this.f18397r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f18397r, property, 0.0f));
                    }
                }
                z zVar = this.E;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f18406w;
            if (i10 == 0) {
                i10 = this.f18408x;
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
            this.P.addListener(new bi.u3(8, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.f18395q0, 1, -1));
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
                mVar.f6100a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f6102c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f6100a = false;
            ((AnimatorSet) mVar.f6102c).cancel();
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
        if (this.f18387m1) {
            if (this.f18390n1) {
                bi.l4 l4Var = this.F0;
                if (l4Var != null) {
                    l4Var.setAlpha(1.0f - this.f18399r1);
                } else {
                    l5 l5Var = this.f18388n[0];
                    if (l5Var != null) {
                        l5Var.setAlpha(1.0f - this.f18399r1);
                    }
                }
            }
            float f7 = this.f18399r1;
            int i10 = this.f18394p1;
            f6 f6Var = this.I0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = j6.v0(i10, f6Var);
            }
            int i11 = this.f18392o1;
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
            setShadowAlpha((int) ((1.0f - this.f18399r1) * 255.0f));
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
            this.f18412z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) wr.f28819f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f7;
        jo joVar = this.R0;
        if (joVar == null) {
            return;
        }
        fo foVar = joVar.e;
        if (foVar != null && foVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        le.e eVar = this.f18365b1;
        if (z10) {
            if (eVar.f12878g) {
                f7 = eVar.f12877f;
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
        this.f18368c1.a(z11, z10);
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
        jo joVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f18379h1) {
            i10 = this.f18375f1;
        } else {
            i10 = (int) this.f18370d1.e;
        }
        if (this.f18381i1) {
            i10 = Math.max((int) ((1.0f - this.f18362a1) * this.f18377g1), i10);
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
        bh.d dVar = this.f18360a;
        le.b bVar = this.f18372e1;
        if (dVar != null && !this.P0) {
            if (this.f18379h1 || this.f18381i1) {
                f7 = 1.0f;
                if (i10 > 0) {
                    i13 = dp;
                } else {
                    i13 = 0;
                }
            } else {
                f7 = 1.0f;
                i13 = (int) (dp * bVar.e);
            }
            int i17 = i13 + i10;
            int i18 = dp + dp2;
            int max = Math.max(i17, i18);
            jo joVar2 = this.R0;
            le.b bVar2 = this.f18368c1;
            if (joVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = f7 - bVar2.e;
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
                f11 = f7 - bVar2.e;
            }
            int lerp2 = AndroidUtilities.lerp(i14, i18, f11);
            int width = getWidth() - lerp;
            int i19 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.f18365b1.e) + i15), i19, Math.max(this.f18362a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((joVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f18360a.setBounds(lerp2, height, width, i16);
            this.f18360a.draw(canvas);
        } else {
            f7 = 1.0f;
        }
        bh.d dVar2 = this.f18363b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i15, i16);
            this.f18363b.draw(canvas);
        }
        bh.d dVar3 = this.f18366c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f18385k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            bh.d dVar4 = this.f18366c;
            if (this.f18379h1) {
                i12 = 255;
            } else {
                i12 = (int) (bVar.e * 255.0f);
            }
            dVar4.setAlpha(i12);
            this.f18366c.draw(canvas);
        }
        if (this.K0 && this.f18408x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f18408x;
            Paint paint = this.L0;
            paint.setColor(i20);
            if (this.f18387m1) {
                aw0 aw0Var = this.J0;
                float y3 = getY();
                float f12 = f7 - this.f18399r1;
                aw0Var.getClass();
                if (aw0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = j6.f18297xf;
                } else {
                    i11 = j6.f18315yf;
                }
                aw0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(j6.v0(i11, aw0Var.getResourceProvider())), f12));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f18383j1 = true;
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
            bh.d dVar = this.f18360a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.R0) {
                bh.d dVar2 = this.f18363b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                bh.d dVar3 = this.f18366c;
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
        bh.d dVar = this.f18360a;
        if (dVar != null) {
            dVar.u();
        }
        bh.d dVar2 = this.f18366c;
        if (dVar2 != null) {
            dVar2.u();
        }
        bh.d dVar3 = this.f18363b;
        if (dVar3 != null) {
            dVar3.u();
        }
        j jVar = this.l1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof i2) && !(drawable instanceof g5)) {
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
        this.f18372e1.a(z10, this.f18383j1);
        le.e eVar = this.f18370d1;
        if (eVar.f12878g) {
            f7 = eVar.f12877f;
        } else {
            f7 = eVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f18383j1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public k getActionBarMenuOnItemClick() {
        return this.f18404u0;
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

    public l5 getAdditionalSubtitleTextView() {
        return this.f18400s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public b5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f18408x;
    }

    public boolean getCastShadows() {
        return this.f18384k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public w9 getSearchAvatarImageView() {
        return this.f18373f;
    }

    public int getShadowAlpha() {
        return this.f18386l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f18397r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public l5 getSubtitleTextView() {
        return this.f18397r;
    }

    public String getTitle() {
        l5 l5Var = this.f18388n[0];
        if (l5Var == null) {
            return null;
        }
        return l5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        l5 l5Var = this.f18388n[0];
        if (l5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            return textPaint.getFontMetricsInt();
        }
        return l5Var.getPaint().getFontMetricsInt();
    }

    public l5 getTitleTextView() {
        return this.f18388n[0];
    }

    public l5 getTitleTextView2() {
        return this.f18388n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        z zVar;
        if (this.f18389n0 && (zVar = this.E) != null) {
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
        dVar3.f18794c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(j6.v0(j6.f18273w8, this.I0));
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
            j jVar = new j(this, getContext(), this.I0, this.N0);
            this.l1 = jVar;
            jVar.setClipChildren(false);
            addView(this.l1);
        }
    }

    public final void l() {
        if (this.f18400s != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f18400s = l5Var;
        l5Var.setGravity(3);
        this.f18400s.setVisibility(8);
        this.f18400s.setTextColor(j6.v0(j6.B8, this.I0));
        addView(this.f18400s, 0, w7.a6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.f0(this.f18393p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.a6.e(54, 54, 51));
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
        addView(zVar2, 0, w7.a6.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f18397r != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f18397r = l5Var;
        l5Var.setGravity(3);
        this.f18397r.setVisibility(8);
        this.f18397r.setTextColor(j6.v0(j6.B8, this.I0));
        addView(this.f18397r, 0, w7.a6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f18406w;
            if (i10 == 0) {
                i10 = this.f18408x;
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
        Drawable drawable = this.f18369d0;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(this.f18388n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f18408x;
            if (i10 != 0 && this.f18406w != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f18369d0;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.R && !this.f18380i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = j6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            lw0 lw0Var = this.S;
            l5[] l5VarArr = this.f18388n;
            if (lw0Var == null) {
                this.T = null;
                this.S = new lw0(0);
                l5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f28619c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f28617a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(j6.w0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new v00(obj));
                }
                this.T = obj;
                l5VarArr[0].invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        float f7;
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
        z zVar = lVar.E;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (lVar.E.p() && !lVar.f18389n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = lVar.E.l();
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!lVar.f18410y) {
                    lVar.E.r(-l4);
                }
            } else if (lVar.f18389n0) {
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = em.d(f11, size, 1073741824);
                if (!lVar.f18410y) {
                    lVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!lVar.f18410y) {
                    lVar.E.r(0.0f);
                }
            }
            lVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            l5VarArr = lVar.f18388n;
            if (i20 >= 2) {
                break;
            }
            l5 l5Var3 = l5VarArr[0];
            if ((l5Var3 != null && l5Var3.getVisibility() != 8) || ((l5Var = lVar.f18397r) != null && l5Var.getVisibility() != 8)) {
                z zVar2 = lVar.E;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.a2.B(16.0f, size - i13, dp) - lVar.f18361a0, 0);
                boolean z10 = lVar.f18411y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && lVar.f18407w0 && lVar.f18409x0) {
                    l5 l5Var4 = l5VarArr[i20];
                    if (lVar.O0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    l5Var4.setTextSize(i21);
                } else {
                    l5 l5Var5 = l5VarArr[0];
                    if (l5Var5 != null && l5Var5.getVisibility() != 8 && (l5Var2 = lVar.f18397r) != null && l5Var2.getVisibility() != 8) {
                        l5 l5Var6 = l5VarArr[i20];
                        if (l5Var6 != null) {
                            if (lVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            l5Var6.setTextSize(i21);
                        }
                        l5 l5Var7 = lVar.f18397r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        l5Var7.setTextSize(i16);
                        l5 l5Var8 = lVar.f18400s;
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
                            if (lVar.O0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            l5Var10.setTextSize(i21);
                        }
                        l5 l5Var11 = lVar.f18397r;
                        if (l5Var11 != null && l5Var11.getVisibility() != 8) {
                            l5 l5Var12 = lVar.f18397r;
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            l5Var12.setTextSize(i15);
                        }
                        l5 l5Var13 = lVar.f18400s;
                        if (l5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
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
                    if (lVar.f18412z0) {
                        CharSequence text = l5VarArr[i20].getText();
                        l5 l5Var15 = l5VarArr[i20];
                        l5Var15.setPivotX(l5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        l5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        l5VarArr[i20].setPivotX(0.0f);
                        l5VarArr[i20].setPivotY(0.0f);
                    }
                }
                l5 l5Var16 = lVar.f18397r;
                if (l5Var16 != null && l5Var16.getVisibility() != 8) {
                    lVar.f18397r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                j jVar = lVar.l1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                l5 l5Var17 = lVar.f18400s;
                if (l5Var17 != null && l5Var17.getVisibility() != 8) {
                    lVar.f18400s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        w9 w9Var = lVar.f18373f;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = lVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = lVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != l5VarArr[0] && childAt != l5VarArr[1] && childAt != lVar.l1 && childAt != lVar.f18397r && childAt != lVar.E && childAt != lVar.e && childAt != lVar.f18400s && childAt != lVar.f18373f) {
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

    public final void p(int i10) {
        View[] viewArr = this.f18388n;
        if (viewArr[i10] != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        viewArr[i10] = l5Var;
        l5Var.setGravity(19);
        int i11 = this.f18405v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(j6.v0(j6.A8, this.I0));
        }
        l5 l5Var2 = viewArr[i10];
        l5Var2.setEmojiColor(l5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, w7.a6.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, w7.a6.e(-2, -2, 51));
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
            boolean z10 = this.f18389n0;
            l5[] l5VarArr = this.f18388n;
            if (!z10) {
                l5 l5Var = l5VarArr[0];
                if (l5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 1.0f));
                }
                if (this.f18397r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f18397r, property, 1.0f));
                }
            }
            z zVar = this.E;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f18408x;
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
            if (!this.f18389n0) {
                l5 l5Var2 = l5VarArr[0];
                if (l5Var2 != null) {
                    l5Var2.setVisibility(0);
                }
                if (this.f18397r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f18397r.setVisibility(0);
                }
            }
            z zVar2 = this.E;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.f18393p0, 1, -1));
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

    public void setActionBarMenuOnItemClick(k kVar) {
        this.f18404u0 = kVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f18406w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, j6.f17872a7, j6.f18201s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f18364b0 = z10;
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
        if (drawable instanceof i2) {
            i2 i2Var = (i2) drawable;
            if (s()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i2Var.c(f7, false);
            i2Var.b(this.f18401s0);
            i2Var.a(this.f18398r0);
        } else if (drawable instanceof g5) {
            g5 g5Var = (g5) drawable;
            g5Var.f17744k = this.f18408x;
            g5Var.f17743j = this.f18398r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f18398r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f18398r0, PorterDuff.Mode.SRC_IN));
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
        this.e.setColorFilter(new PorterDuffColorFilter(this.f18398r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f18408x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g5) {
                ((g5) drawable).f17744k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f18384k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f18384k0 = z10;
    }

    public void setChatAvatarContainer(jo joVar) {
        this.R0 = joVar;
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

    public void setDrawBlurBackground(aw0 aw0Var) {
        this.K0 = true;
        this.J0 = aw0Var;
        aw0Var.T.add(this);
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
        this.f18381i1 = true;
        if (this.f18377g1 != i10) {
            this.f18377g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f18379h1 = true;
        if (this.f18375f1 != i10) {
            this.f18375f1 = i10;
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
        this.f18410y = z10;
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
        this.f18407w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f18371e0 = onClickListener;
        l5[] l5VarArr = this.f18388n;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setRightDrawableOnClick(onClickListener);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setRightDrawableOnClick(this.f18371e0);
        }
    }

    public void setSearchAvatarImageView(w9 w9Var) {
        w9 w9Var2 = this.f18373f;
        if (w9Var2 != w9Var) {
            if (w9Var2 != null) {
                removeView(w9Var2);
            }
            this.f18373f = w9Var;
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
        if (this.f18362a1 != f7) {
            this.f18362a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(fg.q0 q0Var) {
        z zVar = this.E;
        if (zVar != null) {
            zVar.setFilter(q0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f18386l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f18386l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f18397r == null) {
            o();
        }
        if (this.f18397r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            l5 l5Var = this.f18397r;
            if (!isEmpty && !this.f18389n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            l5Var.setVisibility(i10);
            this.f18397r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f18397r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f18397r == null) {
            o();
        }
        this.f18397r.setTextColor(i10);
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
        this.f18382j0 = runnable;
        this.f18378h0 = runnable;
    }

    public void setTitleColor(int i10) {
        l5[] l5VarArr = this.f18388n;
        if (l5VarArr[0] == null) {
            p(0);
        }
        this.f18405v0 = i10;
        l5VarArr[0].setTextColor(i10);
        l5VarArr[0].setEmojiColor(i10);
        l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            l5Var.setTextColor(i10);
            l5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f18361a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f18388n[0].setScrollNonFitText(z10);
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
        this.f18389n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            l5 l5Var = this.f18388n[0];
            if (l5Var != null) {
                arrayList.add(l5Var);
            }
            if (this.f18397r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f18397r);
                l5 l5Var2 = this.f18397r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                l5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f18391o0;
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
        w9 w9Var = this.f18373f;
        if (w9Var != null) {
            w9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            w9 w9Var2 = this.f18373f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(w9Var2, property, f10));
        }
        this.f18412z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, u10));
        this.V0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof g5) {
                g5 g5Var = (g5) drawable;
                g5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                g5Var.a(f14, true);
            }
        }
    }

    public final void w() {
        i5 i5Var;
        z zVar = this.E;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.G && (i5Var = w0Var.H) != null) {
                    i5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.E;
        if (zVar != null && str != null) {
            boolean z10 = this.f18389n0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.G) {
                        if (!z10) {
                            zVar.f18793b.v(w0Var.L(z11));
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
        this.f18392o1 = i10;
        this.f18394p1 = i11;
        m4.w wVar = new m4.w(24, this, recyclerView);
        recyclerView.j(new bi.a2(wVar, 10));
        this.f18390n1 = z10;
        if (this.f18387m1) {
            wVar.run();
            return;
        }
        this.f18387m1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f18396q1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f18399r1 = f7;
        b();
    }

    public final void z(vl0 vl0Var, boolean z10) {
        y(vl0Var, z10, j6.f17872a7, j6.f18201s8);
    }

    public void setAdaptiveBackground(io0 io0Var) {
        int i10 = j6.f17872a7;
        int i11 = j6.f18201s8;
        this.f18392o1 = i10;
        this.f18394p1 = i11;
        b();
        m4.w wVar = new m4.w(23, this, io0Var);
        io0Var.f24055f.add(wVar);
        if (this.f18387m1) {
            wVar.run();
            return;
        }
        this.f18387m1 = true;
        boolean canScrollVertically = io0Var.canScrollVertically(-1);
        this.f18396q1 = !canScrollVertically;
        this.f18399r1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
