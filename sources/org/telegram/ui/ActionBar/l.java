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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ky0;
public class l extends FrameLayout implements vd.b, x5 {
    public a0 A;
    public boolean A0;
    public e B;
    public bh.d B0;
    public String C;
    public boolean C0;
    public boolean D;
    public View.OnTouchListener D0;
    public boolean E;
    public final c6 E0;
    public boolean F;
    public hv0 F0;
    public boolean G;
    public boolean G0;
    public boolean H;
    public final Paint H0;
    public boolean I;
    public final Rect I0;
    public boolean J;
    public final ab.m J0;
    public int K;
    public boolean K0;
    public AnimatorSet L;
    public boolean L0;
    public View[] M;
    public boolean M0;
    public boolean N;
    public xn N0;
    public sv0 O;
    public boolean O0;
    public l00 P;
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
    public final vd.c X0;
    public final vd.a Y0;
    public final vd.c Z0;
    public ng.d f23589a;
    public View.OnClickListener f23590a0;
    public final vd.a f23591a1;
    public ng.d f23592b;
    public String f23593b0;
    public int f23594b1;
    public ng.d f23595c;
    public final Object[] f23596c0;
    public int f23597c1;
    public final x4 d;
    public Runnable f23598d0;
    public boolean f23599d1;
    public ImageView f23600e;
    public boolean f23601e0;
    public boolean f23602e1;
    public t9 f23603f;
    public Runnable f23604f0;
    public boolean f23605f1;
    public boolean f23606g0;
    public boolean f23607g1;
    public Drawable h;
    public int f23608h0;
    public lh.i f23609h1;
    public boolean f23610i0;
    public boolean f23611i1;
    public boolean f23612j0;
    public boolean f23613j1;
    public float f23614k0;
    public int f23615k1;
    public int f23616l0;
    public int l1;
    public int m0;
    public boolean f23617m1;
    public final h5[] f23618n;
    public int f23619n0;
    public float f23620n1;
    public int f23621o0;
    public ValueAnimator f23622o1;
    public o2 f23623p0;
    public k f23624q0;
    public h5 f23625r;
    public int f23626r0;
    public h5 f23627s;
    public boolean f23628s0;
    public boolean f23629t0;
    public boolean f23630u0;
    public View v;
    public boolean f23631v0;
    public int f23632w;
    public CharSequence f23633w0;
    public int f23634x;
    public boolean f23635x0;
    public boolean f23636y;
    public boolean f23637y0;
    public boolean f23638z0;

    public l(Context context, c6 c6Var) {
        super(context);
        this.d = x4.f23968a;
        this.f23618n = new h5[2];
        this.E = true;
        this.G = true;
        this.I = true;
        this.f23596c0 = new Object[3];
        this.f23606g0 = true;
        this.f23608h0 = 255;
        this.f23626r0 = 0;
        this.H0 = new Paint();
        this.I0 = new Rect();
        this.J0 = new ab.m(this);
        jr jrVar = jr.h;
        this.X0 = new vd.c(0, this, jrVar, 380L);
        this.Y0 = new vd.a(0, this, jrVar, 380L, false);
        this.Z0 = new vd.c(0, this, jrVar, 320L);
        this.f23591a1 = new vd.a(0, this, jrVar, 320L, false);
        this.f23617m1 = true;
        this.f23620n1 = 1.0f;
        this.E0 = c6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View q(l lVar, float f9, float f10, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f9 >= childAt.getX() && f9 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(jl0 jl0Var, boolean z10) {
        y(jl0Var, z10, g6.f23009a7, g6.f23329s8);
    }

    public final void B(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.m0 = i10;
            if (this.F && (imageView = this.f23600e) != null) {
                imageView.setBackgroundDrawable(g6.f0(i10, 1, -1));
            }
            e eVar = this.B;
            if (eVar != null) {
                eVar.s();
                return;
            }
            return;
        }
        this.f23616l0 = i10;
        ImageView imageView2 = this.f23600e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(g6.f0(i10, 1, -1));
        }
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.s();
        }
    }

    public void C(int i10, boolean z10) {
        if (z10) {
            this.f23621o0 = i10;
            e eVar = this.B;
            if (eVar != null) {
                eVar.t();
            }
            ImageView imageView = this.f23600e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f23600e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f23619n0 = i10;
            ImageView imageView2 = this.f23600e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof h2) {
                    ((h2) drawable2).a(i10);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).f22824j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f23600e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            a0 a0Var = this.A;
            if (a0Var != null) {
                a0Var.t();
            }
        }
        ImageView imageView3 = this.f23600e;
        if (imageView3 != null && this.O0) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f23619n0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void D(int i10, boolean z10) {
        a0 a0Var;
        e eVar;
        int i11 = 0;
        if (z10 && (eVar = this.B) != null) {
            int childCount = eVar.getChildCount();
            while (i11 < childCount) {
                View childAt = eVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).B(i10);
                }
                i11++;
            }
        } else if (!z10 && (a0Var = this.A) != null) {
            int childCount2 = a0Var.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = a0Var.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).B(i10);
                }
                i11++;
            }
        }
    }

    public final void E(int i10, boolean z10, boolean z11) {
        a0 a0Var;
        e eVar;
        int i11 = 0;
        if (z11 && (eVar = this.B) != null) {
            int childCount = eVar.getChildCount();
            while (i11 < childCount) {
                View childAt = eVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    ((w0) childAt).G(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (a0Var = this.A) != null) {
            int childCount2 = a0Var.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = a0Var.getChildAt(i11);
                if (childAt2 instanceof w0) {
                    ((w0) childAt2).G(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void F(int i10, boolean z10) {
        a0 a0Var;
        e eVar;
        if (z10 && (eVar = this.B) != null) {
            eVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (a0Var = this.A) != null) {
            a0Var.setPopupItemsSelectorColor(i10);
        }
    }

    public final void G(int i10, boolean z10) {
        a0 a0Var = this.A;
        if (a0Var != null) {
            int childCount = a0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = a0Var.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.C) {
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

    public final void H(CharSequence charSequence, org.telegram.ui.Components.n5 n5Var) {
        int i10;
        h5[] h5VarArr = this.f23618n;
        if (charSequence != null && h5VarArr[0] == null) {
            p(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            if (charSequence != null && !this.f23612j0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            h5Var.setVisibility(i10);
            h5 h5Var2 = h5VarArr[0];
            this.V = charSequence;
            h5Var2.k(charSequence);
            if (this.f23637y0) {
                Drawable drawable = this.W;
                if (drawable instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.W = n5Var;
            h5Var3.i(n5Var);
            if (this.f23637y0) {
                Drawable drawable2 = this.W;
                if (drawable2 instanceof org.telegram.ui.Components.n5) {
                    ((org.telegram.ui.Components.n5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.f23590a0);
        }
        this.f23630u0 = false;
    }

    public final void I(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f9;
        h5[] h5VarArr = this.f23618n;
        if (h5VarArr[0] != null && charSequence != null) {
            if (this.f23628s0 && !TextUtils.isEmpty(this.f23633w0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f23625r.getVisibility() != 0) {
                    this.f23625r.setVisibility(0);
                    this.f23625r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f23625r.animate();
                if (z10) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                animate.alpha(f9).setDuration(220L).start();
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
            this.f23630u0 = z10;
            h5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                h5 h5Var2 = h5VarArr[0];
                int dp = AndroidUtilities.dp(20.0f);
                if (!z10) {
                    dp = -dp;
                }
                h5Var2.setTranslationY(dp);
            }
            ViewPropertyAnimator duration = h5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f23629t0 = true;
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
            alpha.setDuration(j10).setListener(new h(this, z11, z10, 0)).start();
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
        h5 h5Var;
        int indexOf;
        CharSequence charSequence;
        if (this.U && this.f23623p0.parentLayout != null) {
            Object[] objArr = this.f23596c0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.U0) {
                String str3 = this.f23593b0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f23593b0 = str;
                        Drawable drawable = null;
                        if (this.f23609h1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f23609h1.c(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.V;
                        }
                        if (str == null) {
                            drawable = this.W;
                        }
                        ab.m mVar = this.J0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            mVar.u(valueOf, indexOf);
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
                        this.f23601e0 = z11;
                        h5[] h5VarArr = this.f23618n;
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
                                h5VarArr[1].setRightDrawableOnClick(this.f23590a0);
                                if (drawable instanceof org.telegram.ui.Components.n5) {
                                    ((org.telegram.ui.Components.n5) drawable).l(h5VarArr[1]);
                                }
                                if (z10) {
                                    mVar.c(h5VarArr[1]);
                                }
                                this.U0 = true;
                                h5 h5Var4 = h5VarArr[1];
                                h5VarArr[1] = h5VarArr[0];
                                h5VarArr[0] = h5Var4;
                                h5Var4.setAlpha(0.0f);
                                h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = h5VarArr[0].animate();
                                float f9 = 1.0f;
                                if (this.f23613j1) {
                                    f9 = 1.0f - this.f23620n1;
                                }
                                animate.alpha(f9).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
                                if (this.f23625r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f23631v0 = true;
                                alpha.setDuration(220L).setListener(new f(this, 1)).start();
                            }
                        } else {
                            p(0);
                            if (this.N) {
                                h5VarArr[0].invalidate();
                                invalidate();
                            }
                            h5VarArr[0].k(spannableString);
                            h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            h5VarArr[0].i(drawable);
                            h5VarArr[0].setRightDrawableOnClick(this.f23590a0);
                            if (drawable instanceof org.telegram.ui.Components.n5) {
                                ((org.telegram.ui.Components.n5) drawable).l(h5VarArr[0]);
                            }
                            if (z10) {
                                mVar.c(h5VarArr[0]);
                            } else {
                                mVar.q(h5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f23598d0;
                        }
                        this.f23604f0 = runnable;
                    }
                }
            }
        }
    }

    public final void K() {
        this.C0 = true;
        if (this.B0 == null) {
            bh.d dVar = new bh.d(getContext(), 6);
            this.B0 = dVar;
            addView(dVar);
        }
    }

    public final void L(lg.a aVar, og.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.K0 = true;
        this.M0 = z10;
        ng.d c3 = aVar.c(this, null, false);
        c3.n(dVar);
        c3.o(AndroidUtilities.dp(6.0f));
        this.f23589a = c3;
        if (z10) {
            c3.q(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c3.p(AndroidUtilities.dp(23.0f));
        }
        ng.d c6 = aVar.c(this, null, false);
        c6.n(dVar);
        c6.p(AndroidUtilities.dp(23.0f));
        c6.o(AndroidUtilities.dp(6.0f));
        this.f23592b = c6;
        ng.d c10 = aVar.c(this, null, false);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(23.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        this.f23595c = c10;
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.A.setGlassMode(true);
        }
        e eVar = this.B;
        if (eVar != null) {
            eVar.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.B.setGlassMode(true);
        }
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public boolean M(View view) {
        if (this.H) {
            h5[] h5VarArr = this.f23618n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.f23625r || view == this.A || view == this.f23600e || view == this.f23627s || view == this.B0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        invalidate();
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.B != null && !this.F) {
            this.F = true;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.B, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.M = viewArr;
            if (this.f23632w == 0) {
                if (!this.f23612j0) {
                    h5 h5Var = this.f23618n[0];
                    if (h5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f));
                    }
                    if (this.f23625r != null && !TextUtils.isEmpty(this.f23633w0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f23625r, property, 0.0f));
                    }
                }
                a0 a0Var = this.A;
                if (a0Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 0.0f));
                }
            }
            int i10 = this.f23632w;
            if (i10 == 0) {
                i10 = this.f23634x;
            }
            if (i10 != 0 && !this.K0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.Q0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 2));
                this.L.playTogether(ofFloat);
            }
            this.L.setDuration(200L);
            this.L.addListener(new bg.c3(11, this, zArr));
            this.L.start();
            ImageView imageView = this.f23600e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(1.0f, true);
                }
                this.f23600e.setBackgroundDrawable(g6.f0(this.m0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z10;
        if (this.f23637y0 && this.f23638z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A0 != z10) {
            this.A0 = z10;
            ab.m mVar = this.J0;
            if (z10) {
                mVar.f324a = true;
                AnimatorSet animatorSet = (AnimatorSet) mVar.f326c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            mVar.f324a = false;
            ((AnimatorSet) mVar.f326c).cancel();
        }
    }

    public final boolean a(String str) {
        if (this.B != null) {
            String str2 = this.C;
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
        if (this.f23611i1) {
            if (this.f23613j1) {
                bh.d dVar = this.B0;
                if (dVar != null) {
                    dVar.setAlpha(1.0f - this.f23620n1);
                } else {
                    h5 h5Var = this.f23618n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.f23620n1);
                    }
                }
            }
            float f9 = this.f23620n1;
            int i10 = this.l1;
            c6 c6Var = this.E0;
            if (i10 == -1) {
                v02 = 0;
            } else {
                v02 = g6.v0(i10, c6Var);
            }
            int i11 = this.f23615k1;
            if (i11 == -1) {
                v03 = 0;
            } else {
                v03 = g6.v0(i11, c6Var);
            }
            if (v03 == 0) {
                v03 = i0.a.k(v02, 0);
            }
            if (v02 == 0) {
                v02 = i0.a.k(v03, 0);
            }
            setBackgroundColor(i0.a.d(f9, v02, v03));
            setShadowAlpha((int) ((1.0f - this.f23620n1) * 255.0f));
            if (this.G0) {
                invalidate();
            }
        }
    }

    public final void c() {
        if (!LocaleController.isRTL) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new j(0));
            this.f23631v0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) jr.f29800f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        float f9;
        xn xnVar = this.N0;
        if (xnVar == null) {
            return;
        }
        tn tnVar = xnVar.f34790e;
        if (tnVar != null && tnVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.N0.getVisualWidth());
        vd.c cVar = this.X0;
        if (z10) {
            if (cVar.f49512g) {
                f9 = cVar.f49511f;
            } else {
                f9 = cVar.f49510e;
            }
            float f10 = min;
            if (f9 != f10) {
                cVar.a(f10);
            }
        } else {
            cVar.c(min);
        }
        this.Y0.a(z11, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f9;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        float f11;
        xn xnVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f23599d1) {
            i10 = this.f23594b1;
        } else {
            i10 = (int) this.Z0.f49510e;
        }
        if (this.f23602e1) {
            i10 = Math.max((int) ((1.0f - this.W0) * this.f23597c1), i10);
        }
        ImageView imageView = this.f23600e;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = (getHeight() - ((getCurrentActionBarHeight() + dp2) / 2)) - dp;
        int i15 = dp * 2;
        int i16 = height + dp2 + i15;
        ng.d dVar = this.f23589a;
        vd.a aVar = this.f23591a1;
        if (dVar != null && !this.L0) {
            if (this.f23599d1 || this.f23602e1) {
                f9 = 1.0f;
                if (i10 > 0) {
                    i13 = dp;
                } else {
                    i13 = 0;
                }
            } else {
                f9 = 1.0f;
                i13 = (int) (dp * aVar.f49505e);
            }
            int i17 = i13 + i10;
            int i18 = dp + dp2;
            int max = Math.max(i17, i18);
            xn xnVar2 = this.N0;
            vd.a aVar2 = this.Y0;
            if (xnVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = f9 - aVar2.f49505e;
            }
            int lerp = AndroidUtilities.lerp(i17, max, f10);
            if (z10) {
                i14 = i18;
            } else {
                i14 = 0;
            }
            if (this.N0 == null) {
                f11 = 0.0f;
            } else {
                f11 = f9 - aVar2.f49505e;
            }
            int lerp2 = AndroidUtilities.lerp(i14, i18, f11);
            int width = getWidth() - lerp;
            int i19 = width - lerp2;
            if (this.N0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i19, ((int) this.X0.f49510e) + i15), i19, Math.max(this.W0, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.N0.getLayoutParams()).leftMargin) - this.N0.getLeftPadding()) + dp;
                this.N0.setTranslationX(dp3);
                this.N0.setPivotX((xnVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f23589a.setBounds(lerp2, height, width, i16);
            this.f23589a.draw(canvas);
        } else {
            f9 = 1.0f;
        }
        ng.d dVar2 = this.f23592b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i15, i16);
            this.f23592b.draw(canvas);
        }
        ng.d dVar3 = this.f23595c;
        if (dVar3 != null && i10 > 0 && !this.L0 && !this.f23607g1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i15, height, getWidth(), i16);
            ng.d dVar4 = this.f23595c;
            if (this.f23599d1) {
                i12 = 255;
            } else {
                i12 = (int) (aVar.f49505e * 255.0f);
            }
            dVar4.setAlpha(i12);
            this.f23595c.draw(canvas);
        }
        if (this.G0 && this.f23634x != 0) {
            this.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i20 = this.f23634x;
            Paint paint = this.H0;
            paint.setColor(i20);
            if (this.f23611i1) {
                hv0 hv0Var = this.F0;
                float y8 = getY();
                float f12 = f9 - this.f23620n1;
                hv0Var.getClass();
                if (hv0.F() && SharedConfig.getDevicePerformanceClass() == 2) {
                    i11 = g6.f23424xf;
                } else {
                    i11 = g6.f23441yf;
                }
                hv0Var.K(canvas, y8, this.I0, paint, true, AndroidUtilities.lerp(255, Color.alpha(g6.v0(i11, hv0Var.getResourceProvider())), f12));
            } else {
                this.F0.J(canvas, getY(), this.I0, paint, true);
            }
        }
        this.f23605f1 = true;
        if (this.V0) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.N0 != null && this.K0 && motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            float f9 = x4;
            float f10 = y8;
            View q6 = q(this, f9, f10, this.N0);
            if (q6 == null) {
                q6 = q(this, f9, f10, null);
            }
            ng.d dVar = this.f23589a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x4, y8)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6 != null && q6 != this.N0) {
                ng.d dVar2 = this.f23592b;
                if (dVar2 != null && dVar2.getBounds().contains(x4, y8)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                ng.d dVar3 = this.f23595c;
                z10 = z13 | ((dVar3 == null || !dVar3.getBounds().contains(x4, y8)) ? false : false);
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
        ng.d dVar = this.f23589a;
        if (dVar != null) {
            dVar.u();
        }
        ng.d dVar2 = this.f23595c;
        if (dVar2 != null) {
            dVar2.u();
        }
        ng.d dVar3 = this.f23592b;
        if (dVar3 != null) {
            dVar3.u();
        }
        lh.i iVar = this.f23609h1;
        if (iVar != null) {
            iVar.d();
        }
    }

    public final void f() {
        int i10;
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof h2) && !(drawable instanceof c5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.f23600e.getLayerType() != i10) {
                this.f23600e.setLayerType(i10, null);
                this.f23600e.invalidate();
            }
        }
    }

    public final void g() {
        int i10;
        int i11;
        float f9;
        a0 a0Var = this.A;
        boolean z10 = false;
        if (a0Var != null) {
            i10 = (a0Var.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        int max = Math.max(0, i10);
        e eVar = this.B;
        if (eVar != null) {
            i11 = (eVar.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f);
        } else {
            i11 = 0;
        }
        int max2 = Math.max(0, i11);
        AndroidUtilities.dp(46.0f);
        if (this.F) {
            max = max2;
        }
        if (max > 0) {
            z10 = true;
        }
        this.f23591a1.a(z10, this.f23605f1);
        vd.c cVar = this.Z0;
        if (cVar.f49512g) {
            f9 = cVar.f49511f;
        } else {
            f9 = cVar.f49510e;
        }
        float f10 = max;
        if (f9 != f10) {
            if (this.f23605f1) {
                cVar.a(f10);
            } else {
                cVar.c(f10);
            }
        }
    }

    public k getActionBarMenuOnItemClick() {
        return this.f23624q0;
    }

    public a0 getActionMode() {
        return this.B;
    }

    public float getActionModeFactor() {
        e eVar = this.B;
        if (eVar != null) {
            return eVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f23609h1;
    }

    public h5 getAdditionalSubtitleTextView() {
        return this.f23627s;
    }

    public ImageView getBackButton() {
        return this.f23600e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public x4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f23634x;
    }

    public boolean getCastShadows() {
        return this.f23606g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.E;
    }

    public t9 getSearchAvatarImageView() {
        return this.f23603f;
    }

    public int getShadowAlpha() {
        return this.f23608h0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f23625r != null && (charSequence = this.f23633w0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public h5 getSubtitleTextView() {
        return this.f23625r;
    }

    public String getTitle() {
        h5 h5Var = this.f23618n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f9;
        h5 h5Var = this.f23618n[0];
        if (h5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                f9 = 18.0f;
            } else {
                f9 = 20.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f9));
            return textPaint.getFontMetricsInt();
        }
        return h5Var.getPaint().getFontMetricsInt();
    }

    public h5 getTitleTextView() {
        return this.f23618n[0];
    }

    public h5 getTitleTextView2() {
        return this.f23618n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.B0;
    }

    public void h(boolean z10) {
        a0 a0Var;
        if (this.f23612j0 && (a0Var = this.A) != null) {
            a0Var.j(z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final a0 i() {
        return j(null);
    }

    public final a0 j(String str) {
        float f9;
        int i10;
        if (a(str)) {
            return this.B;
        }
        e eVar = this.B;
        if (eVar != null) {
            removeView(eVar);
            this.B = null;
        }
        this.C = str;
        e eVar2 = new e(this, getContext(), this);
        this.B = eVar2;
        if (this.K0) {
            f9 = -AndroidUtilities.dp(10.0f);
        } else {
            f9 = 0.0f;
        }
        eVar2.setTranslationX(f9);
        this.B.setGlassMode(this.K0);
        e eVar3 = this.B;
        eVar3.f22720c = true;
        eVar3.setClickable(true);
        if (!this.K0) {
            this.B.setBackgroundColor(g6.v0(g6.f23403w8, this.E0));
        }
        addView(this.B, indexOfChild(this.f23600e));
        e eVar4 = this.B;
        if (this.E) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        eVar4.setPadding(0, i10, 0, 0);
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
        if (this.f23609h1 == null) {
            lh.i iVar = new lh.i(this, getContext(), this.E0, this.J0);
            this.f23609h1 = iVar;
            iVar.setClipChildren(false);
            addView(this.f23609h1);
        }
    }

    public final void l() {
        if (this.f23627s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23627s = h5Var;
        h5Var.setGravity(3);
        this.f23627s.setVisibility(8);
        this.f23627s.setTextColor(g6.v0(g6.B8, this.E0));
        addView(this.f23627s, 0, i7.f6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.f23600e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f23600e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23600e.setBackgroundDrawable(g6.f0(this.f23616l0, 1, -1));
        this.f23600e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.f23600e, i7.f6.e(54, 54, 51));
        this.f23600e.setOnClickListener(new b(this, 1));
        this.f23600e.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final a0 n() {
        a0 a0Var = this.A;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(getContext(), this);
        this.A = a0Var2;
        addView(a0Var2, 0, i7.f6.e(-2, -1, 5));
        return this.A;
    }

    public final void o() {
        if (this.f23625r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f23625r = h5Var;
        h5Var.setGravity(3);
        this.f23625r.setVisibility(8);
        this.f23625r.setTextColor(g6.v0(g6.B8, this.E0));
        addView(this.f23625r, 0, i7.f6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23637y0 = true;
        P();
        if (this.F) {
            int i10 = this.f23632w;
            if (i10 == 0) {
                i10 = this.f23634x;
            }
            if (i10 != 0 && !this.K0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(this.f23618n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23637y0 = false;
        P();
        if (this.F) {
            int i10 = this.f23634x;
            if (i10 != 0 && this.f23632w != 0 && !this.K0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.W;
        if (drawable instanceof org.telegram.ui.Components.n5) {
            ((org.telegram.ui.Components.n5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable y02;
        if (this.N && !this.f23601e0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (y02 = g6.y0()) != null && y02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.R = true;
            sv0 sv0Var = this.O;
            h5[] h5VarArr = this.f23618n;
            if (sv0Var == null) {
                this.P = null;
                this.O = new sv0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.O = null;
                ?? obj = new Object();
                obj.f30183c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f30181a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(g6.w0(null, g6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new k00(obj));
                }
                this.P = obj;
                h5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.D0;
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
        float f9;
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
        l lVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        lVar.D = true;
        View view = lVar.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        e eVar = lVar.B;
        if (eVar != null) {
            if (lVar.E) {
                i18 = AndroidUtilities.statusBarHeight;
            } else {
                i18 = 0;
            }
            eVar.setPadding(0, i18, 0, 0);
        }
        lVar.D = false;
        if (lVar.E) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        lVar.setMeasuredDimension(size, currentActionBarHeight + i12 + lVar.K);
        ImageView imageView = lVar.f23600e;
        if (imageView != null && imageView.getVisibility() != 8) {
            lVar.f23600e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
            if (AndroidUtilities.isTablet()) {
                f10 = 80.0f;
            } else {
                f10 = 72.0f;
            }
            dp = AndroidUtilities.dp(f10);
        } else {
            if (AndroidUtilities.isTablet()) {
                f9 = 26.0f;
            } else {
                f9 = 18.0f;
            }
            dp = AndroidUtilities.dp(f9);
        }
        a0 a0Var = lVar.A;
        if (a0Var != null && a0Var.getVisibility() != 8) {
            float f11 = 66.0f;
            if (lVar.A.p() && !lVar.f23612j0) {
                lVar.A.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l10 = lVar.A.l();
                if (lVar.f23610i0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.A.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!lVar.f23636y) {
                    lVar.A.r(-l10);
                }
            } else if (lVar.f23612j0) {
                if (lVar.f23610i0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = org.telegram.ui.b.d(f11, size, 1073741824);
                if (!lVar.f23636y) {
                    lVar.A.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!lVar.f23636y) {
                    lVar.A.r(0.0f);
                }
            }
            lVar.A.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            h5VarArr = lVar.f23618n;
            if (i20 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = lVar.f23625r) != null && h5Var.getVisibility() != 8)) {
                a0 a0Var2 = lVar.A;
                if (a0Var2 != null) {
                    i13 = a0Var2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                int max = Math.max(org.telegram.messenger.x3.B(16.0f, size - i13, dp) - lVar.T, 0);
                boolean z10 = lVar.f23630u0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && lVar.f23628s0 && lVar.f23629t0) {
                    h5 h5Var4 = h5VarArr[i20];
                    if (lVar.K0) {
                        i21 = 17;
                    } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    h5Var4.setTextSize(i21);
                } else {
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 != null && h5Var5.getVisibility() != 8 && (h5Var2 = lVar.f23625r) != null && h5Var2.getVisibility() != 8) {
                        h5 h5Var6 = h5VarArr[i20];
                        if (h5Var6 != null) {
                            if (lVar.K0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i21 = 18;
                            }
                            h5Var6.setTextSize(i21);
                        }
                        h5 h5Var7 = lVar.f23625r;
                        if (AndroidUtilities.isTablet()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        h5Var7.setTextSize(i16);
                        h5 h5Var8 = lVar.f23627s;
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
                            if (lVar.K0) {
                                i21 = 17;
                            } else if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            h5Var10.setTextSize(i21);
                        }
                        h5 h5Var11 = lVar.f23625r;
                        if (h5Var11 != null && h5Var11.getVisibility() != 8) {
                            h5 h5Var12 = lVar.f23625r;
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            h5Var12.setTextSize(i15);
                        }
                        h5 h5Var13 = lVar.f23627s;
                        if (h5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && lVar.getResources().getConfiguration().orientation == 2) {
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
                    if (lVar.f23631v0) {
                        CharSequence text = h5VarArr[i20].getText();
                        h5 h5Var15 = h5VarArr[i20];
                        h5Var15.setPivotX(h5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i20].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i20].setPivotX(0.0f);
                        h5VarArr[i20].setPivotY(0.0f);
                    }
                }
                h5 h5Var16 = lVar.f23625r;
                if (h5Var16 != null && h5Var16.getVisibility() != 8) {
                    lVar.f23625r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                lh.i iVar = lVar.f23609h1;
                if (iVar != null) {
                    iVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                h5 h5Var17 = lVar.f23627s;
                if (h5Var17 != null && h5Var17.getVisibility() != 8) {
                    lVar.f23627s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i20++;
            i19 = 1;
        }
        t9 t9Var = lVar.f23603f;
        if (t9Var != null) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = lVar.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = lVar.getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[1] && childAt != lVar.f23609h1 && childAt != lVar.f23625r && childAt != lVar.A && childAt != lVar.f23600e && childAt != lVar.f23627s && childAt != lVar.f23603f) {
                lVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), 1073741824), 0);
            }
            i22++;
            lVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.I) {
            return false;
        }
        return true;
    }

    public final void p(int i10) {
        View[] viewArr = this.f23618n;
        if (viewArr[i10] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        viewArr[i10] = h5Var;
        h5Var.setGravity(19);
        int i11 = this.f23626r0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(g6.v0(g6.A8, this.E0));
        }
        h5 h5Var2 = viewArr[i10];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
        viewArr[i10].setTypeface(AndroidUtilities.bold());
        viewArr[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
        viewArr[i10].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.C0) {
            this.B0.addView(viewArr[i10], 0, i7.f6.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, i7.f6.e(-2, -2, 51));
        }
    }

    public void r() {
        e eVar = this.B;
        if (eVar != null && this.F) {
            int childCount = eVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = eVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    ((w0) childAt).n();
                }
            }
            this.F = false;
            g();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.B, property, 0.0f));
            if (this.M != null) {
                int i11 = 0;
                while (true) {
                    View[] viewArr = this.M;
                    if (i11 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i11];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.M[i11], property, 1.0f));
                    }
                    i11++;
                }
            }
            boolean z10 = this.f23612j0;
            h5[] h5VarArr = this.f23618n;
            if (!z10) {
                h5 h5Var = h5VarArr[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 1.0f));
                }
                if (this.f23625r != null && !TextUtils.isEmpty(this.f23633w0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f23625r, property, 1.0f));
                }
            }
            a0 a0Var = this.A;
            if (a0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(a0Var, property, 1.0f));
            }
            int i12 = this.f23634x;
            if (i12 != 0 && !this.K0) {
                if (i0.a.f(i12) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.Q0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.L.playTogether(ofFloat);
            }
            this.L.setDuration(200L);
            this.L.addListener(new f(this, 0));
            this.L.start();
            if (!this.f23612j0) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.setVisibility(0);
                }
                if (this.f23625r != null && !TextUtils.isEmpty(this.f23633w0)) {
                    this.f23625r.setVisibility(0);
                }
            }
            a0 a0Var2 = this.A;
            if (a0Var2 != null) {
                a0Var2.setVisibility(0);
            }
            ImageView imageView = this.f23600e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof h2) {
                    ((h2) drawable).c(0.0f, true);
                }
                this.f23600e.setBackgroundDrawable(g6.f0(this.f23616l0, 1, -1));
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        if (this.B != null && this.F) {
            return true;
        }
        return false;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.f23624q0 = kVar;
    }

    public void setActionModeColor(int i10) {
        e eVar = this.B;
        if (eVar != null) {
            eVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f23632w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        y(recyclerView, false, g6.f23009a7, g6.f23329s8);
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
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f9;
        if (this.f23600e == null) {
            m();
        }
        ImageView imageView = this.f23600e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.f23600e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof h2) {
            h2 h2Var = (h2) drawable;
            if (s()) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            h2Var.c(f9, false);
            h2Var.b(this.f23621o0);
            h2Var.a(this.f23619n0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.f22825k = this.f23634x;
            c5Var.f22824j = this.f23619n0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f23600e.setColorFilter(new PorterDuffColorFilter(this.f23619n0, PorterDuff.Mode.SRC_IN));
        }
        if (this.O0) {
            this.f23600e.setColorFilter(new PorterDuffColorFilter(this.f23619n0, PorterDuff.Mode.SRC_IN));
        }
        f();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.f23600e == null) {
            m();
        }
        ImageView imageView = this.f23600e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.f23600e.setImageResource(i10);
        this.f23600e.setColorFilter(new PorterDuffColorFilter(this.f23619n0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f23634x = i10;
        if (!this.G0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).f22825k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f23606g0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23606g0 = z10;
    }

    public void setChatAvatarContainer(xn xnVar) {
        this.N0 = xnVar;
    }

    public void setClipContent(boolean z10) {
        this.H = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.f23635x0 = z10;
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(hv0 hv0Var) {
        this.G0 = true;
        this.F0 = hv0Var;
        hv0Var.P.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f23600e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.setEnabled(z10);
        }
        e eVar = this.B;
        if (eVar != null) {
            eVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        this.K = i10;
        e eVar = this.B;
        if (eVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.getLayoutParams();
            layoutParams.bottomMargin = this.K;
            this.B.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.J = z10;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.f23602e1 = true;
        if (this.f23597c1 != i10) {
            this.f23597c1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f23599d1 = true;
        if (this.f23594b1 != i10) {
            this.f23594b1 = i10;
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
        this.f23636y = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i10;
        this.E = z10;
        e eVar = this.B;
        if (eVar != null) {
            if (z10) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            eVar.setPadding(0, i10, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f23628s0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f23590a0 = onClickListener;
        h5[] h5VarArr = this.f23618n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.f23590a0);
        }
    }

    public void setSearchAvatarImageView(t9 t9Var) {
        t9 t9Var2 = this.f23603f;
        if (t9Var2 != t9Var) {
            if (t9Var2 != null) {
                removeView(t9Var2);
            }
            this.f23603f = t9Var;
            if (t9Var != null) {
                addView(t9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f9) {
        if (this.W0 != f9) {
            this.W0 = f9;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.A.setSearchFieldText(str);
    }

    public void setSearchFilter(rf.f0 f0Var) {
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.setFilter(f0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f23608h0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f23608h0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f23625r == null) {
            o();
        }
        if (this.f23625r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            h5 h5Var = this.f23625r;
            if (!isEmpty && !this.f23612j0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h5Var.setVisibility(i10);
            this.f23625r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f23625r.l(charSequence, false);
            }
            this.f23633w0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f23625r == null) {
            o();
        }
        this.f23625r.setTextColor(i10);
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
        H(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f23604f0 = runnable;
        this.f23598d0 = runnable;
    }

    public void setTitleColor(int i10) {
        h5[] h5VarArr = this.f23618n;
        if (h5VarArr[0] == null) {
            p(0);
        }
        this.f23626r0 = i10;
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
        this.f23618n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        if (this.H) {
            invalidate();
        }
    }

    public final boolean t(String str) {
        if (this.B != null && this.F) {
            String str2 = this.C;
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
        float f9;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f23612j0 = z10;
        g();
        AnimatorSet animatorSet = this.R0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.R0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean u10 = u();
        if (!u10) {
            h5 h5Var = this.f23618n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.f23625r != null && !TextUtils.isEmpty(this.f23633w0)) {
                arrayList.add(this.f23625r);
                h5 h5Var2 = this.f23625r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                h5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f23614k0;
        float f14 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f9);
        ofFloat.addUpdateListener(new a(this, 1));
        this.R0.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.R0;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.R0;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.R0;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        t9 t9Var = this.f23603f;
        if (t9Var != null) {
            t9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.R0;
            t9 t9Var2 = this.f23603f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(t9Var2, property, f10));
        }
        this.f23631v0 = true;
        requestLayout();
        this.R0.addListener(new g(this, arrayList, z10, u10));
        this.R0.setDuration(150L).start();
        ImageView imageView = this.f23600e;
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
        a0 a0Var = this.A;
        int childCount = a0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = a0Var.getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && (e5Var = w0Var.D) != null) {
                    e5Var.p(w0Var.f23920e);
                }
            }
        }
    }

    public final void x(String str) {
        a0 a0Var = this.A;
        if (a0Var != null && str != null) {
            boolean z10 = this.f23612j0;
            boolean z11 = !z10;
            int childCount = a0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = a0Var.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.C) {
                        if (!z10) {
                            a0Var.f22719b.v(w0Var.L(z11));
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
        float f9;
        this.f23615k1 = i10;
        this.l1 = i11;
        c cVar = new c(0, this, recyclerView);
        recyclerView.j(new cg.g2(cVar, 15));
        this.f23613j1 = z10;
        if (this.f23611i1) {
            cVar.run();
            return;
        }
        this.f23611i1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f23617m1 = !canScrollVertically;
        if (!canScrollVertically) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f23620n1 = f9;
        b();
    }

    public void setAdaptiveBackground(un0 un0Var) {
        int i10 = g6.f23009a7;
        int i11 = g6.f23329s8;
        this.f23615k1 = i10;
        this.l1 = i11;
        b();
        nh.b6 b6Var = new nh.b6(29, this, un0Var);
        un0Var.f33281f.add(b6Var);
        if (this.f23611i1) {
            b6Var.run();
            return;
        }
        this.f23611i1 = true;
        boolean canScrollVertically = un0Var.canScrollVertically(-1);
        this.f23617m1 = !canScrollVertically;
        this.f23620n1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
