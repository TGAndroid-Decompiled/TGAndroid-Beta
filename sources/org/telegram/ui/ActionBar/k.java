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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.zn;
import org.telegram.ui.vy0;
public class k extends FrameLayout implements xd.b, a6 {
    public boolean A0;
    public z B;
    public boolean B0;
    public d C;
    public dh.d C0;
    public String D;
    public boolean D0;
    public boolean E;
    public View.OnTouchListener E0;
    public boolean F;
    public final f6 F0;
    public boolean G;
    public qv0 G0;
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
    public zn O0;
    public bw0 P;
    public boolean P0;
    public p00 Q;
    public Runnable Q0;
    public Paint.FontMetricsInt R;
    public vy0 R0;
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
    public pg.b f20306a;
    public Drawable f20307a0;
    public final xd.c f20308a1;
    public pg.b f20309b;
    public View.OnClickListener f20310b0;
    public final xd.a f20311b1;
    public pg.b f20312c;
    public String f20313c0;
    public int f20314c1;
    public final a5 d;
    public final Object[] f20315d0;
    public int f20316d1;
    public ImageView e;
    public Runnable f20317e0;
    public boolean f20318e1;
    public p9 f20319f;
    public boolean f20320f0;
    public boolean f20321f1;
    public Runnable f20322g0;
    public boolean f20323g1;
    public Drawable h;
    public boolean f20324h0;
    public boolean f20325h1;
    public int f20326i0;
    public nh.j f20327i1;
    public boolean f20328j0;
    public boolean f20329j1;
    public boolean f20330k0;
    public boolean f20331k1;
    public float f20332l0;
    public int l1;
    public int m0;
    public int f20333m1;
    public final k5[] f20334n;
    public int f20335n0;
    public boolean f20336n1;
    public int f20337o0;
    public float f20338o1;
    public int f20339p0;
    public ValueAnimator f20340p1;
    public p2 f20341q0;
    public k5 f20342r;
    public j f20343r0;
    public k5 f20344s;
    public int f20345s0;
    public boolean f20346t0;
    public boolean f20347u0;
    public View v;
    public boolean f20348v0;
    public int f20349w;
    public boolean f20350w0;
    public int f20351x;
    public CharSequence f20352x0;
    public boolean f20353y;
    public boolean f20354y0;
    public boolean f20355z0;

    public k(Context context, f6 f6Var) {
        super(context);
        this.d = a5.f19515a;
        this.f20334n = new k5[2];
        this.F = true;
        this.H = true;
        this.J = true;
        this.f20315d0 = new Object[3];
        this.f20324h0 = true;
        this.f20326i0 = 255;
        this.f20345s0 = 0;
        this.I0 = new Paint();
        this.J0 = new Rect();
        this.K0 = new cb.m(this);
        nr nrVar = nr.h;
        this.Y0 = new xd.c(0, this, nrVar, 380L);
        this.Z0 = new xd.a(0, this, nrVar, 380L, false);
        this.f20308a1 = new xd.c(0, this, nrVar, 320L);
        this.f20311b1 = new xd.a(0, this, nrVar, 320L, false);
        this.f20336n1 = true;
        this.f20338o1 = 1.0f;
        this.F0 = f6Var;
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
        y(sl0Var, z4, j6.f19852a7, j6.f20176s8);
    }

    public final void B(int i10, boolean z4) {
        ImageView imageView;
        if (z4) {
            this.f20335n0 = i10;
            if (this.G && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(j6.f0(i10, 1, -1));
            }
            d dVar = this.C;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.m0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.f0(i10, 1, -1));
        }
        z zVar = this.B;
        if (zVar != null) {
            zVar.s();
        }
    }

    public void C(int i10, boolean z4) {
        if (z4) {
            this.f20339p0 = i10;
            d dVar = this.C;
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
            this.f20337o0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof i2) {
                    ((i2) drawable2).a(i10);
                } else if (drawable2 instanceof f5) {
                    ((f5) drawable2).f19690j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.P0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f20337o0, PorterDuff.Mode.SRC_IN));
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
        k5[] k5VarArr = this.f20334n;
        if (charSequence != null && k5VarArr[0] == null) {
            p(0);
        }
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            if (charSequence != null && !this.f20330k0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            k5Var.setVisibility(i10);
            k5 k5Var2 = k5VarArr[0];
            this.W = charSequence;
            k5Var2.k(charSequence);
            if (this.f20355z0) {
                Drawable drawable = this.f20307a0;
                if (drawable instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable).l(null);
                }
            }
            k5 k5Var3 = k5VarArr[0];
            this.f20307a0 = j5Var;
            k5Var3.i(j5Var);
            if (this.f20355z0) {
                Drawable drawable2 = this.f20307a0;
                if (drawable2 instanceof org.telegram.ui.Components.j5) {
                    ((org.telegram.ui.Components.j5) drawable2).l(k5VarArr[0]);
                }
            }
            k5VarArr[0].setRightDrawableOnClick(this.f20310b0);
        }
        this.f20348v0 = false;
    }

    public final void I(CharSequence charSequence, boolean z4, long j10, Interpolator interpolator) {
        boolean z10;
        float f10;
        k5[] k5VarArr = this.f20334n;
        if (k5VarArr[0] != null && charSequence != null) {
            if (this.f20346t0 && !TextUtils.isEmpty(this.f20352x0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f20342r.getVisibility() != 0) {
                    this.f20342r.setVisibility(0);
                    this.f20342r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f20342r.animate();
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(220L).start();
            }
            k5 k5Var = k5VarArr[1];
            if (k5Var != null) {
                if (k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
            }
            k5VarArr[1] = k5VarArr[0];
            k5VarArr[0] = null;
            setTitle(charSequence);
            this.f20348v0 = z4;
            k5VarArr[0].setAlpha(0.0f);
            if (!z10) {
                k5 k5Var2 = k5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z4) {
                    dp = -dp;
                }
                k5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f20347u0 = true;
            ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
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
        k5 k5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.V && this.f20341q0.parentLayout != null) {
            Object[] objArr = this.f20315d0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.V0) {
                String str3 = this.f20313c0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f20313c0 = str;
                        Drawable drawable = null;
                        if (this.f20327i1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f20327i1.b(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.W;
                        }
                        if (str == null) {
                            drawable = this.f20307a0;
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
                        this.f20320f0 = z10;
                        k5[] k5VarArr = this.f20334n;
                        if ((spannableString == null || k5VarArr[0] != null) && getMeasuredWidth() != 0 && ((k5Var = k5VarArr[0]) == null || k5Var.getVisibility() == 0)) {
                            k5 k5Var2 = k5VarArr[0];
                            if (k5Var2 != null) {
                                k5Var2.animate().cancel();
                                k5 k5Var3 = k5VarArr[1];
                                if (k5Var3 != null) {
                                    k5Var3.animate().cancel();
                                }
                                if (k5VarArr[1] == null) {
                                    p(1);
                                }
                                k5VarArr[1].k(spannableString);
                                k5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                k5VarArr[1].i(drawable);
                                k5VarArr[1].setRightDrawableOnClick(this.f20310b0);
                                if (drawable instanceof org.telegram.ui.Components.j5) {
                                    ((org.telegram.ui.Components.j5) drawable).l(k5VarArr[1]);
                                }
                                if (z4) {
                                    mVar.c(k5VarArr[1]);
                                }
                                this.V0 = true;
                                k5 k5Var4 = k5VarArr[1];
                                k5VarArr[1] = k5VarArr[0];
                                k5VarArr[0] = k5Var4;
                                k5Var4.setAlpha(0.0f);
                                k5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = k5VarArr[0].animate();
                                float f10 = 1.0f;
                                if (this.f20331k1) {
                                    f10 = 1.0f - this.f20338o1;
                                }
                                animate.alpha(f10).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
                                if (this.f20342r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f20350w0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.O) {
                                k5VarArr[0].invalidate();
                                invalidate();
                            }
                            k5VarArr[0].k(spannableString);
                            k5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            k5VarArr[0].i(drawable);
                            k5VarArr[0].setRightDrawableOnClick(this.f20310b0);
                            if (drawable instanceof org.telegram.ui.Components.j5) {
                                ((org.telegram.ui.Components.j5) drawable).l(k5VarArr[0]);
                            }
                            if (z4) {
                                mVar.c(k5VarArr[0]);
                            } else {
                                mVar.t(k5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f20317e0;
                        }
                        this.f20322g0 = runnable;
                    }
                }
            }
        }
    }

    public final void K() {
        this.D0 = true;
        if (this.C0 == null) {
            dh.d dVar = new dh.d(getContext(), 5);
            this.C0 = dVar;
            addView(dVar);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        invalidate();
    }

    public final void M(ng.a aVar, qg.d dVar, boolean z4) {
        setBackground(null);
        setClipChildren(false);
        this.L0 = true;
        this.N0 = z4;
        pg.b c3 = aVar.c(this, null, false);
        c3.n(dVar);
        c3.o(AndroidUtilities.dp(6.0f));
        this.f20306a = c3;
        if (z4) {
            c3.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c3.p(AndroidUtilities.dp(23.0f));
        }
        pg.b c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(23.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        this.f20309b = c10;
        pg.b c11 = aVar.c(this, null, false);
        c11.n(dVar);
        c11.p(AndroidUtilities.dp(23.0f));
        c11.o(AndroidUtilities.dp(6.0f));
        this.f20312c = c11;
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
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.I) {
            k5[] k5VarArr = this.f20334n;
            if (view == k5VarArr[0] || view == k5VarArr[1] || view == this.f20342r || view == this.B || view == this.e || view == this.f20344s || view == this.C0) {
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
            if (this.f20349w == 0) {
                if (!this.f20330k0) {
                    k5 k5Var = this.f20334n[0];
                    if (k5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f));
                    }
                    if (this.f20342r != null && !TextUtils.isEmpty(this.f20352x0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f20342r, property, 0.0f));
                    }
                }
                z zVar = this.B;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i10 = this.f20349w;
            if (i10 == 0) {
                i10 = this.f20351x;
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
            this.M.addListener(new dg.y2(7, this, zArr));
            this.M.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.f20335n0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z4;
        if (this.f20355z0 && this.A0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.B0 != z4) {
            this.B0 = z4;
            cb.m mVar = this.K0;
            if (z4) {
                mVar.f2232a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f2234c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f2232a = false;
            ((AnimatorSet) mVar.f2234c).cancel();
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
        if (this.f20329j1) {
            if (this.f20331k1) {
                dh.d dVar = this.C0;
                if (dVar != null) {
                    dVar.setAlpha(1.0f - this.f20338o1);
                } else {
                    k5 k5Var = this.f20334n[0];
                    if (k5Var != null) {
                        k5Var.setAlpha(1.0f - this.f20338o1);
                    }
                }
            }
            float f10 = this.f20338o1;
            int i10 = this.f20333m1;
            f6 f6Var = this.F0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = j6.v0(i10, f6Var);
            }
            int i11 = this.l1;
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
            setBackgroundColor(i0.a.d(f10, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f20338o1) * 255.0f));
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
            this.f20350w0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) nr.f27346f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z4) {
        boolean z10;
        float f10;
        zn znVar = this.O0;
        if (znVar == null) {
            return;
        }
        vn vnVar = znVar.e;
        if (vnVar != null && vnVar.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.O0.getVisualWidth());
        xd.c cVar = this.Y0;
        if (z4) {
            if (cVar.f46898g) {
                f10 = cVar.f46897f;
            } else {
                f10 = cVar.e;
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
        zn znVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f20318e1) {
            i10 = this.f20314c1;
        } else {
            i10 = (int) this.f20308a1.e;
        }
        if (this.f20321f1) {
            i10 = Math.max((int) ((1.0f - this.X0) * this.f20316d1), i10);
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i15 = dp * 2;
        int i16 = height + dp2 + i15;
        pg.b bVar = this.f20306a;
        xd.a aVar = this.f20311b1;
        if (bVar != null && !this.M0) {
            if (this.f20318e1 || this.f20321f1) {
                f10 = 1.0f;
                if (i10 > 0) {
                    i13 = dp;
                } else {
                    i13 = 0;
                }
            } else {
                f10 = 1.0f;
                i13 = (int) (dp * aVar.e);
            }
            int i17 = i13 + i10;
            int i18 = dp + dp2;
            int max = Math.max(i17, i18);
            zn znVar2 = this.O0;
            xd.a aVar2 = this.Z0;
            if (znVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = f10 - aVar2.e;
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
                f12 = f10 - aVar2.e;
            }
            int lerp2 = AndroidUtilities.lerp(i14, i18, f12);
            int width = getWidth() - lerp;
            int i19 = width - lerp2;
            if (this.O0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.Y0.e) + i15), i19, Math.max(this.X0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.O0.getLayoutParams()).leftMargin) - this.O0.getLeftPadding()) + dp;
                this.O0.setTranslationX(dp3);
                this.O0.setPivotX((znVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f20306a.setBounds(lerp2, height, width, i16);
            this.f20306a.draw(canvas);
        } else {
            f10 = 1.0f;
        }
        pg.b bVar2 = this.f20309b;
        if (bVar2 != null && z4) {
            bVar2.setBounds(0, height, dp2 + i15, i16);
            this.f20309b.draw(canvas);
        }
        pg.b bVar3 = this.f20312c;
        if (bVar3 != null && i10 > 0 && !this.M0 && !this.f20325h1) {
            bVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            pg.b bVar4 = this.f20312c;
            if (this.f20318e1) {
                i12 = 255;
            } else {
                i12 = (int) (aVar.e * 255.0f);
            }
            bVar4.setAlpha(i12);
            this.f20312c.draw(canvas);
        }
        if (this.H0 && this.f20351x != 0) {
            this.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f20351x;
            Paint paint = this.I0;
            paint.setColor(i20);
            if (this.f20329j1) {
                qv0 qv0Var = this.G0;
                float y10 = getY();
                float f13 = f10 - this.f20338o1;
                qv0Var.getClass();
                if (qv0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = j6.f20272xf;
                } else {
                    i11 = j6.f20290yf;
                }
                qv0Var.K(canvas, y10, this.J0, paint, true, AndroidUtilities.lerp(255, Color.alpha(j6.v0(i11, qv0Var.getResourceProvider())), f13));
            } else {
                this.G0.J(canvas, getY(), this.J0, paint, true);
            }
        }
        this.f20323g1 = true;
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
            pg.b bVar = this.f20306a;
            boolean z11 = true;
            if (bVar != null && bVar.getBounds().contains(x10, y10)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (q10 != null && q10 != this.O0) {
                pg.b bVar2 = this.f20309b;
                if (bVar2 != null && bVar2.getBounds().contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z4 | z10;
                pg.b bVar3 = this.f20312c;
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
        pg.b bVar = this.f20306a;
        if (bVar != null) {
            bVar.u();
        }
        pg.b bVar2 = this.f20312c;
        if (bVar2 != null) {
            bVar2.u();
        }
        pg.b bVar3 = this.f20309b;
        if (bVar3 != null) {
            bVar3.u();
        }
        nh.j jVar = this.f20327i1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof i2) && !(drawable instanceof f5)) {
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
        this.f20311b1.a(z4, this.f20323g1);
        xd.c cVar = this.f20308a1;
        if (cVar.f46898g) {
            f10 = cVar.f46897f;
        } else {
            f10 = cVar.e;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f20323g1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f20343r0;
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
        return this.f20327i1;
    }

    public k5 getAdditionalSubtitleTextView() {
        return this.f20344s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public a5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f20351x;
    }

    public boolean getCastShadows() {
        return this.f20324h0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.F;
    }

    public p9 getSearchAvatarImageView() {
        return this.f20319f;
    }

    public int getShadowAlpha() {
        return this.f20326i0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f20342r != null && (charSequence = this.f20352x0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public k5 getSubtitleTextView() {
        return this.f20342r;
    }

    public String getTitle() {
        k5 k5Var = this.f20334n[0];
        if (k5Var == null) {
            return null;
        }
        return k5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        k5 k5Var = this.f20334n[0];
        if (k5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f10));
            return textPaint.getFontMetricsInt();
        }
        return k5Var.getPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return this.f20334n[0];
    }

    public k5 getTitleTextView2() {
        return this.f20334n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.C0;
    }

    public void h(boolean z4) {
        z zVar;
        if (this.f20330k0 && (zVar = this.B) != null) {
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
        dVar3.f20774c = true;
        dVar3.setClickable(true);
        if (!this.L0) {
            this.C.setBackgroundColor(j6.v0(j6.f20246w8, this.F0));
        }
        addView(this.C, indexOfChild(this.e));
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
        if (this.f20327i1 == null) {
            nh.j jVar = new nh.j(this, getContext(), this.F0, this.K0);
            this.f20327i1 = jVar;
            jVar.setClipChildren(false);
            addView(this.f20327i1);
        }
    }

    public final void l() {
        if (this.f20344s != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f20344s = k5Var;
        k5Var.setGravity(3);
        this.f20344s.setVisibility(8);
        this.f20344s.setTextColor(j6.v0(j6.B8, this.F0));
        addView(this.f20344s, 0, k7.b6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(j6.f0(this.m0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, k7.b6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final z n() {
        z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.B = zVar2;
        addView(zVar2, 0, k7.b6.e(-2, -1, 5));
        return this.B;
    }

    public final void o() {
        if (this.f20342r != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f20342r = k5Var;
        k5Var.setGravity(3);
        this.f20342r.setVisibility(8);
        this.f20342r.setTextColor(j6.v0(j6.B8, this.F0));
        addView(this.f20342r, 0, k7.b6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20355z0 = true;
        P();
        if (this.G) {
            int i10 = this.f20349w;
            if (i10 == 0) {
                i10 = this.f20351x;
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
        Drawable drawable = this.f20307a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(this.f20334n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20355z0 = false;
        P();
        if (this.G) {
            int i10 = this.f20351x;
            if (i10 != 0 && this.f20349w != 0 && !this.L0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f20307a0;
        if (drawable instanceof org.telegram.ui.Components.j5) {
            ((org.telegram.ui.Components.j5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.O && !this.f20320f0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = j6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.S = true;
            bw0 bw0Var = this.P;
            k5[] k5VarArr = this.f20334n;
            if (bw0Var == null) {
                this.Q = null;
                this.P = new bw0(0);
                k5VarArr[0].invalidate();
                invalidate();
            } else {
                this.P = null;
                ?? obj = new Object();
                obj.f27705c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f27703a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(j6.w0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new o00(obj));
                }
                this.Q = obj;
                k5VarArr[0].invalidate();
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
        k5[] k5VarArr;
        k5 k5Var;
        int i13;
        int i14;
        int i15;
        k5 k5Var2;
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
        ImageView imageView = kVar.e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
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
            if (kVar.B.p() && !kVar.f20330k0) {
                kVar.B.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l10 = kVar.B.l();
                if (kVar.f20328j0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.B.l() + (size - AndroidUtilities.dp(f12)), 1073741824);
                if (!kVar.f20353y) {
                    kVar.B.r(-l10);
                }
            } else if (kVar.f20330k0) {
                if (kVar.f20328j0) {
                    f12 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = org.telegram.ui.b.d(f12, size, 1073741824);
                if (!kVar.f20353y) {
                    kVar.B.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f20353y) {
                    kVar.B.r(0.0f);
                }
            }
            kVar.B.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            k5VarArr = kVar.f20334n;
            if (i20 >= 2) {
                break;
            }
            k5 k5Var3 = k5VarArr[0];
            if ((k5Var3 != null && k5Var3.getVisibility() != 8) || ((k5Var = kVar.f20342r) != null && k5Var.getVisibility() != 8)) {
                z zVar2 = kVar.B;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.y3.B(16.0f, size - i13, dp) - kVar.U, 0);
                boolean z4 = kVar.f20348v0;
                int i21 = 20;
                if (((z4 && i20 == 0) || (!z4 && i20 == i19)) && kVar.f20346t0 && kVar.f20347u0) {
                    k5 k5Var4 = k5VarArr[i20];
                    if (kVar.L0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    k5Var4.setTextSize(i21);
                } else {
                    k5 k5Var5 = k5VarArr[0];
                    if (k5Var5 != null && k5Var5.getVisibility() != 8 && (k5Var2 = kVar.f20342r) != null && k5Var2.getVisibility() != 8) {
                        k5 k5Var6 = k5VarArr[i20];
                        if (k5Var6 != null) {
                            if (kVar.L0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            k5Var6.setTextSize(i21);
                        }
                        k5 k5Var7 = kVar.f20342r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        k5Var7.setTextSize(i16);
                        k5 k5Var8 = kVar.f20344s;
                        if (k5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            k5Var8.setTextSize(i17);
                        }
                    } else {
                        k5 k5Var9 = k5VarArr[i20];
                        if (k5Var9 != null && k5Var9.getVisibility() != 8) {
                            k5 k5Var10 = k5VarArr[i20];
                            if (kVar.L0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            k5Var10.setTextSize(i21);
                        }
                        k5 k5Var11 = kVar.f20342r;
                        if (k5Var11 != null && k5Var11.getVisibility() != 8) {
                            k5 k5Var12 = kVar.f20342r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            k5Var12.setTextSize(i15);
                        }
                        k5 k5Var13 = kVar.f20344s;
                        if (k5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            k5Var13.setTextSize(i14);
                        }
                    }
                }
                k5 k5Var14 = k5VarArr[i20];
                if (k5Var14 != null && k5Var14.getVisibility() != 8) {
                    k5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k5VarArr[i20].getPaddingBottom() + k5VarArr[i20].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f20350w0) {
                        CharSequence text = k5VarArr[i20].getText();
                        k5 k5Var15 = k5VarArr[i20];
                        k5Var15.setPivotX(k5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        k5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        k5VarArr[i20].setPivotX(0.0f);
                        k5VarArr[i20].setPivotY(0.0f);
                    }
                }
                k5 k5Var16 = kVar.f20342r;
                if (k5Var16 != null && k5Var16.getVisibility() != 8) {
                    kVar.f20342r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                nh.j jVar = kVar.f20327i1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                k5 k5Var17 = kVar.f20344s;
                if (k5Var17 != null && k5Var17.getVisibility() != 8) {
                    kVar.f20344s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        p9 p9Var = kVar.f20319f;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = kVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != kVar.f20327i1 && childAt != kVar.f20342r && childAt != kVar.B && childAt != kVar.e && childAt != kVar.f20344s && childAt != kVar.f20319f) {
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
        View[] viewArr = this.f20334n;
        if (viewArr[i10] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        viewArr[i10] = k5Var;
        k5Var.setGravity(19);
        int i11 = this.f20345s0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(j6.v0(j6.A8, this.F0));
        }
        k5 k5Var2 = viewArr[i10];
        k5Var2.setEmojiColor(k5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.D0) {
            this.C0.addView(viewArr[i10], 0, k7.b6.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, k7.b6.e(-2, -2, 51));
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
            boolean z4 = this.f20330k0;
            k5[] k5VarArr = this.f20334n;
            if (!z4) {
                k5 k5Var = k5VarArr[0];
                if (k5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 1.0f));
                }
                if (this.f20342r != null && !TextUtils.isEmpty(this.f20352x0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f20342r, property, 1.0f));
                }
            }
            z zVar = this.B;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i12 = this.f20351x;
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
            if (!this.f20330k0) {
                k5 k5Var2 = k5VarArr[0];
                if (k5Var2 != null) {
                    k5Var2.setVisibility(0);
                }
                if (this.f20342r != null && !TextUtils.isEmpty(this.f20352x0)) {
                    this.f20342r.setVisibility(0);
                }
            }
            z zVar2 = this.B;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof i2) {
                    ((i2) drawable).c(0.0f, true);
                }
                this.e.setBackgroundDrawable(j6.f0(this.m0, 1, -1));
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
        this.f20343r0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.C;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f20349w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, j6.f19852a7, j6.f20176s8);
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
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f10;
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
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i2Var.c(f10, false);
            i2Var.b(this.f20339p0);
            i2Var.a(this.f20337o0);
        } else if (drawable instanceof f5) {
            f5 f5Var = (f5) drawable;
            f5Var.f19691k = this.f20351x;
            f5Var.f19690j = this.f20337o0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20337o0, PorterDuff.Mode.SRC_IN));
        }
        if (this.P0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20337o0, PorterDuff.Mode.SRC_IN));
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
        this.e.setColorFilter(new PorterDuffColorFilter(this.f20337o0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f20351x = i10;
        if (!this.H0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                ((f5) drawable).f19691k = i10;
            }
        }
    }

    public void setCastShadows(boolean z4) {
        if (this.f20324h0 != z4 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20324h0 = z4;
    }

    public void setChatAvatarContainer(zn znVar) {
        this.O0 = znVar;
    }

    public void setClipContent(boolean z4) {
        this.I = z4;
    }

    public void setDrawBackButton(boolean z4) {
        this.f20354y0 = z4;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(qv0 qv0Var) {
        this.H0 = true;
        this.G0 = qv0Var;
        qv0Var.Q.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        ImageView imageView = this.e;
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
        this.f20321f1 = true;
        if (this.f20316d1 != i10) {
            this.f20316d1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f20318e1 = true;
        if (this.f20314c1 != i10) {
            this.f20314c1 = i10;
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
        this.f20353y = z4;
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
        this.f20346t0 = z4;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f20310b0 = onClickListener;
        k5[] k5VarArr = this.f20334n;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setRightDrawableOnClick(onClickListener);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setRightDrawableOnClick(this.f20310b0);
        }
    }

    public void setSearchAvatarImageView(p9 p9Var) {
        p9 p9Var2 = this.f20319f;
        if (p9Var2 != p9Var) {
            if (p9Var2 != null) {
                removeView(p9Var2);
            }
            this.f20319f = p9Var;
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

    public void setSearchFilter(tf.e0 e0Var) {
        z zVar = this.B;
        if (zVar != null) {
            zVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f20326i0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20326i0 = i10;
    }

    public void setSkipDrawChild(boolean z4) {
        if (this.W0 != z4) {
            this.W0 = z4;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f20342r == null) {
            o();
        }
        if (this.f20342r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k5 k5Var = this.f20342r;
            if (!isEmpty && !this.f20330k0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k5Var.setVisibility(i10);
            this.f20342r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f20342r.l(charSequence, false);
            }
            this.f20352x0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f20342r == null) {
            o();
        }
        this.f20342r.setTextColor(i10);
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
        this.f20322g0 = runnable;
        this.f20317e0 = runnable;
    }

    public void setTitleColor(int i10) {
        k5[] k5VarArr = this.f20334n;
        if (k5VarArr[0] == null) {
            p(0);
        }
        this.f20345s0 = i10;
        k5VarArr[0].setTextColor(i10);
        k5VarArr[0].setEmojiColor(i10);
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.U = i10;
    }

    public void setTitleScrollNonFitText(boolean z4) {
        this.f20334n[0].setScrollNonFitText(z4);
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
        this.f20330k0 = z4;
        g();
        AnimatorSet animatorSet = this.S0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.S0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            k5 k5Var = this.f20334n[0];
            if (k5Var != null) {
                arrayList.add(k5Var);
            }
            if (this.f20342r != null && !TextUtils.isEmpty(this.f20352x0)) {
                arrayList.add(this.f20342r);
                k5 k5Var2 = this.f20342r;
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                k5Var2.setVisibility(i10);
            }
        }
        float f14 = this.f20332l0;
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
        p9 p9Var = this.f20319f;
        if (p9Var != null) {
            p9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.S0;
            p9 p9Var2 = this.f20319f;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(p9Var2, property, f11));
        }
        this.f20350w0 = true;
        requestLayout();
        this.S0.addListener(new f(this, arrayList, z4, u10));
        this.S0.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof f5) {
                f5 f5Var = (f5) drawable;
                f5Var.h = true;
                if (z4) {
                    f15 = 1.0f;
                }
                f5Var.a(f15, true);
            }
        }
    }

    public final void w() {
        h5 h5Var;
        z zVar = this.B;
        int childCount = zVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zVar.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D && (h5Var = w0Var.E) != null) {
                    h5Var.p(w0Var.e);
                }
            }
        }
    }

    public final void x(String str) {
        z zVar = this.B;
        if (zVar != null && str != null) {
            boolean z4 = this.f20330k0;
            boolean z10 = !z4;
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.D) {
                        if (!z4) {
                            zVar.f20773b.v(w0Var.L(z10));
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
        this.f20333m1 = i11;
        org.telegram.messenger.voip.b bVar = new org.telegram.messenger.voip.b(9, this, recyclerView);
        recyclerView.j(new eg.f2(bVar, 13));
        this.f20331k1 = z4;
        if (this.f20329j1) {
            bVar.run();
            return;
        }
        this.f20329j1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f20336n1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f20338o1 = f10;
        b();
    }

    public void setAdaptiveBackground(eo0 eo0Var) {
        int i10 = j6.f19852a7;
        int i11 = j6.f20176s8;
        this.l1 = i10;
        this.f20333m1 = i11;
        b();
        org.telegram.messenger.voip.b bVar = new org.telegram.messenger.voip.b(8, this, eo0Var);
        eo0Var.f24623f.add(bVar);
        if (this.f20329j1) {
            bVar.run();
            return;
        }
        this.f20329j1 = true;
        boolean canScrollVertically = eo0Var.canScrollVertically(-1);
        this.f20336n1 = !canScrollVertically;
        this.f20338o1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
