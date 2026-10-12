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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.uz0;
public class k extends FrameLayout implements ne.d, x5 {
    public CharSequence A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public y E;
    public boolean E0;
    public d F;
    public bi.i5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public View.OnTouchListener H0;
    public boolean I;
    public final c6 I0;
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
    public ro R0;
    public zw0 S;
    public boolean S0;
    public b10 T;
    public Runnable T0;
    public Paint.FontMetricsInt U;
    public uz0 U0;
    public boolean V;
    public AnimatorSet V0;
    public Rect W;
    public int W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public dh.d f20413a;
    public int f20414a0;
    public float f20415a1;
    public dh.d f20416b;
    public boolean f20417b0;
    public final ne.e f20418b1;
    public dh.d f20419c;
    public CharSequence f20420c0;
    public final ne.b f20421c1;
    public final x4 d;
    public Drawable f20422d0;
    public final ne.e f20423d1;
    public ImageView e;
    public View.OnClickListener f20424e0;
    public final ne.b f20425e1;
    public z9 f20426f;
    public String f20427f0;
    public int f20428f1;
    public final Object[] f20429g0;
    public int f20430g1;
    public Drawable h;
    public Runnable f20431h0;
    public boolean f20432h1;
    public boolean f20433i0;
    public boolean f20434i1;
    public Runnable f20435j0;
    public boolean f20436j1;
    public boolean f20437k0;
    public boolean f20438k1;
    public int f20439l0;
    public boolean l1;
    public boolean m0;
    public bi.n f20440m1;
    public final h5[] f20441n;
    public boolean f20442n0;
    public boolean f20443n1;
    public float f20444o0;
    public boolean f20445o1;
    public int f20446p0;
    public int f20447p1;
    public int f20448q0;
    public int f20449q1;
    public h5 f20450r;
    public int f20451r0;
    public boolean f20452r1;
    public h5 f20453s;
    public int f20454s0;
    public float f20455s1;
    public m2 f20456t0;
    public ValueAnimator f20457t1;
    public j f20458u0;
    public View v;
    public int f20459v0;
    public int f20460w;
    public boolean f20461w0;
    public int f20462x;
    public boolean f20463x0;
    public boolean f20464y;
    public boolean f20465y0;
    public boolean f20466z0;

    public k(Context context, c6 c6Var) {
        super(context);
        this.d = x4.f20813a;
        this.f20441n = new h5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f20429g0 = new Object[3];
        this.f20437k0 = true;
        this.f20439l0 = 255;
        this.f20459v0 = 0;
        this.L0 = new Paint();
        this.M0 = new Rect();
        this.N0 = new c2.b(this);
        es esVar = es.h;
        this.f20418b1 = new ne.e(0, this, esVar, 380L);
        this.f20421c1 = new ne.b(0, this, esVar, 380L, false);
        this.f20423d1 = new ne.e(0, this, esVar, 320L);
        this.f20425e1 = new ne.b(0, this, esVar, 320L, false);
        this.l1 = true;
        this.f20452r1 = true;
        this.f20455s1 = 1.0f;
        this.I0 = c6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public static View r(k kVar, float f7, float f10, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A(mm0 mm0Var, boolean z10) {
        z(mm0Var, z10, g6.f19843a7, g6.f20180s8);
    }

    public final void B(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f20448q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(g6.g0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f20446p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(g6.g0(i10, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void D(int i10, boolean z10) {
        if (z10) {
            this.f20454s0 = i10;
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
            this.f20451r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof f2) {
                    ((f2) drawable2).a(i10);
                } else if (drawable2 instanceof c5) {
                    ((c5) drawable2).f19677j = i10;
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
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f20451r0, PorterDuff.Mode.SRC_IN));
        }
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

    public final void I(CharSequence charSequence, org.telegram.ui.Components.q5 q5Var) {
        int i10;
        h5[] h5VarArr = this.f20441n;
        if (charSequence != null && h5VarArr[0] == null) {
            q(0);
        }
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            if (charSequence != null && !this.f20442n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            h5Var.setVisibility(i10);
            h5 h5Var2 = h5VarArr[0];
            this.f20420c0 = charSequence;
            h5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f20422d0;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).l(null);
                }
            }
            h5 h5Var3 = h5VarArr[0];
            this.f20422d0 = q5Var;
            h5Var3.i(q5Var);
            if (this.C0) {
                Drawable drawable2 = this.f20422d0;
                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable2).l(h5VarArr[0]);
                }
            }
            h5VarArr[0].setRightDrawableOnClick(this.f20424e0);
        }
        this.f20465y0 = false;
    }

    public final void J(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f7;
        h5[] h5VarArr = this.f20441n;
        if (h5VarArr[0] != null && charSequence != null) {
            if (this.f20461w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f20450r.getVisibility() != 0) {
                    this.f20450r.setVisibility(0);
                    this.f20450r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f20450r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                yh.r(animate, f7, 220L);
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
            this.f20465y0 = z10;
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
            this.f20463x0 = true;
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
            alpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
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
        if (this.f20417b0 && this.f20456t0.parentLayout != null) {
            Object[] objArr = this.f20429g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.Y0) {
                String str3 = this.f20427f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f20427f0 = str;
                        Drawable drawable = null;
                        if (this.f20440m1 != null) {
                            if (i10 == R.string.ConnectingToProxyWithDots) {
                                charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f));
                            } else {
                                charSequence = null;
                            }
                            this.f20440m1.a(charSequence);
                        }
                        if (str != null) {
                            str2 = LocaleController.getString(str, i10);
                        } else {
                            str2 = this.f20420c0;
                        }
                        if (str == null) {
                            drawable = this.f20422d0;
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
                        this.f20433i0 = z11;
                        h5[] h5VarArr = this.f20441n;
                        if ((spannableString == null || h5VarArr[0] != null) && getMeasuredWidth() != 0 && ((h5Var = h5VarArr[0]) == null || h5Var.getVisibility() == 0)) {
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
                                h5VarArr[1].k(spannableString);
                                h5VarArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                                h5VarArr[1].i(drawable);
                                h5VarArr[1].setRightDrawableOnClick(this.f20424e0);
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).l(h5VarArr[1]);
                                }
                                if (z10) {
                                    bVar.c(h5VarArr[1]);
                                }
                                this.Y0 = true;
                                h5 h5Var4 = h5VarArr[1];
                                h5VarArr[1] = h5VarArr[0];
                                h5VarArr[0] = h5Var4;
                                h5Var4.setAlpha(0.0f);
                                h5VarArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                                ViewPropertyAnimator animate = h5VarArr[0].animate();
                                float f7 = 1.0f;
                                if (this.f20445o1) {
                                    f7 = 1.0f - this.f20455s1;
                                }
                                animate.alpha(f7).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = h5VarArr[1].animate().alpha(0.0f);
                                if (this.f20450r == null) {
                                    alpha.translationY(AndroidUtilities.dp(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f20466z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            q(0);
                            if (this.R) {
                                h5VarArr[0].invalidate();
                                invalidate();
                            }
                            h5VarArr[0].k(spannableString);
                            h5VarArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                            h5VarArr[0].i(drawable);
                            h5VarArr[0].setRightDrawableOnClick(this.f20424e0);
                            if (drawable instanceof org.telegram.ui.Components.q5) {
                                ((org.telegram.ui.Components.q5) drawable).l(h5VarArr[0]);
                            }
                            if (z10) {
                                bVar.c(h5VarArr[0]);
                            } else {
                                bVar.v(h5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f20431h0;
                        }
                        this.f20435j0 = runnable;
                    }
                }
            }
        }
    }

    public final void L() {
        this.G0 = true;
        if (this.F0 == null) {
            bi.i5 i5Var = new bi.i5(getContext(), 5);
            this.F0 = i5Var;
            addView(i5Var);
        }
    }

    public final void M(bh.b bVar, eh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.O0 = true;
        this.Q0 = z10;
        dh.d c10 = bVar.c(this, null, false);
        c10.o(eVar);
        c10.p(AndroidUtilities.dp(6.0f));
        this.f20413a = c10;
        if (z10) {
            c10.r(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            c10.q(AndroidUtilities.dp(23.0f));
        }
        dh.d c11 = bVar.c(this, null, false);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(23.0f));
        c11.p(AndroidUtilities.dp(6.0f));
        this.f20416b = c11;
        dh.d c12 = bVar.c(this, null, false);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(23.0f));
        c12.p(AndroidUtilities.dp(6.0f));
        this.f20419c = c12;
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
            h5[] h5VarArr = this.f20441n;
            if (view == h5VarArr[0] || view == h5VarArr[1] || view == this.f20450r || view == this.E || view == this.e || view == this.f20453s || view == this.F0) {
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
            if (this.f20460w == 0) {
                if (!this.f20442n0) {
                    h5 h5Var = this.f20441n[0];
                    if (h5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f));
                    }
                    if (this.f20450r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f20450r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i10 = this.f20460w;
            if (i10 == 0) {
                i10 = this.f20462x;
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
            this.P.addListener(new bi.t(10, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof f2) {
                    ((f2) drawable).c(1.0f, true);
                }
                this.e.setBackgroundDrawable(g6.g0(this.f20448q0, 1, -1));
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
            c2.b bVar = this.N0;
            if (z10) {
                bVar.f4118a = true;
                AnimatorSet animatorSet = (AnimatorSet) bVar.f4120c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            bVar.f4118a = false;
            ((AnimatorSet) bVar.f4120c).cancel();
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
        int w02;
        int w03;
        if (this.f20443n1) {
            if (this.f20445o1) {
                bi.i5 i5Var = this.F0;
                if (i5Var != null) {
                    i5Var.setAlpha(1.0f - this.f20455s1);
                } else {
                    h5 h5Var = this.f20441n[0];
                    if (h5Var != null) {
                        h5Var.setAlpha(1.0f - this.f20455s1);
                    }
                }
            }
            float f7 = this.f20455s1;
            int i10 = this.f20449q1;
            c6 c6Var = this.I0;
            if (i10 == -1) {
                w02 = 0;
            } else {
                w02 = g6.w0(i10, c6Var);
            }
            int i11 = this.f20447p1;
            if (i11 == -1) {
                w03 = 0;
            } else {
                w03 = g6.w0(i11, c6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.k(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.k(w03, 0);
            }
            setBackgroundColor(i0.a.d(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - this.f20455s1) * 255.0f));
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
            this.f20466z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) es.f24771f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    @Override
    public final void d() {
        b();
        dh.d dVar = this.f20413a;
        if (dVar != null) {
            dVar.v();
        }
        dh.d dVar2 = this.f20419c;
        if (dVar2 != null) {
            dVar2.v();
        }
        dh.d dVar3 = this.f20416b;
        if (dVar3 != null) {
            dVar3.v();
        }
        bi.n nVar = this.f20440m1;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        ro roVar;
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        if (this.f20432h1) {
            i10 = this.f20428f1;
        } else {
            i10 = (int) this.f20423d1.e;
        }
        if (this.f20434i1) {
            i10 = Math.max((int) ((1.0f - this.f20415a1) * this.f20430g1), i10);
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
        dh.d dVar = this.f20413a;
        ne.b bVar = this.f20425e1;
        if (dVar != null && !this.P0 && this.l1) {
            if (this.f20432h1 || this.f20434i1) {
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
            ro roVar2 = this.R0;
            ne.b bVar2 = this.f20421c1;
            float f11 = 0.0f;
            if (roVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = f7 - bVar2.e;
            }
            int lerp = AndroidUtilities.lerp(i18, max, f10);
            if (z10) {
                i15 = i19;
            } else {
                i15 = 0;
            }
            if (this.R0 != null) {
                f11 = f7 - bVar2.e;
            }
            int lerp2 = AndroidUtilities.lerp(i15, i19, f11);
            int width = getWidth() - lerp;
            int i20 = width - lerp2;
            if (this.R0 != null) {
                int lerp3 = AndroidUtilities.lerp(Math.min(i20, ((int) this.f20418b1.e) + i16), i20, Math.max(this.f20415a1, actionModeFactor));
                lerp2 = ((width + lerp2) - lerp3) / 2;
                width = lerp2 + lerp3;
                float dp3 = AndroidUtilities.dp(3.0f) + ((lerp2 - ((ViewGroup.MarginLayoutParams) this.R0.getLayoutParams()).leftMargin) - this.R0.getLeftPadding()) + dp;
                this.R0.setTranslationX(dp3);
                this.R0.setPivotX((roVar.getMeasuredWidth() / 2.0f) - dp3);
            }
            this.f20413a.setBounds(lerp2, height, width, i17);
            this.f20413a.draw(canvas);
        } else {
            f7 = 1.0f;
            i11 = 2;
        }
        dh.d dVar2 = this.f20416b;
        if (dVar2 != null && z10) {
            dVar2.setBounds(0, height, dp2 + i16, i17);
            this.f20416b.draw(canvas);
        }
        dh.d dVar3 = this.f20419c;
        if (dVar3 != null && i10 > 0 && !this.P0 && !this.f20438k1) {
            dVar3.setBounds((getWidth() - Math.max(dp2, i10)) - i16, height, getWidth(), i17);
            dh.d dVar4 = this.f20419c;
            if (this.f20432h1) {
                i13 = 255;
            } else {
                i13 = (int) (bVar.e * 255.0f);
            }
            dVar4.setAlpha(i13);
            this.f20419c.draw(canvas);
        }
        if (this.K0 && this.f20462x != 0) {
            this.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int i21 = this.f20462x;
            Paint paint = this.L0;
            paint.setColor(i21);
            if (this.f20443n1) {
                ow0 ow0Var = this.J0;
                float y3 = getY();
                float f12 = f7 - this.f20455s1;
                ow0Var.getClass();
                if (ow0.F() && SharedConfig.getDevicePerformanceClass() == i11) {
                    i12 = g6.f20279xf;
                } else {
                    i12 = g6.yf;
                }
                ow0Var.K(canvas, y3, this.M0, paint, true, AndroidUtilities.lerp(255, Color.alpha(g6.w0(i12, ow0Var.getResourceProvider())), f12));
            } else {
                this.J0.J(canvas, getY(), this.M0, paint, true);
            }
        }
        this.f20436j1 = true;
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
            View r10 = r(this, f7, f10, this.R0);
            if (r10 == null) {
                r10 = r(this, f7, f10, null);
            }
            dh.d dVar = this.f20413a;
            boolean z12 = true;
            if (dVar != null && dVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r10 != null && r10 != this.R0) {
                dh.d dVar2 = this.f20416b;
                if (dVar2 != null && dVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                dh.d dVar3 = this.f20419c;
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

    public final void e(boolean z10) {
        boolean z11;
        float f7;
        ro roVar = this.R0;
        if (roVar == null) {
            return;
        }
        no noVar = roVar.e;
        if (noVar != null && noVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.R0.getVisualWidth());
        ne.e eVar = this.f20418b1;
        if (z10) {
            if (eVar.f16301g) {
                f7 = eVar.f16300f;
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
        this.f20421c1.a(z11, z10);
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
        this.f20425e1.a(z10, this.f20436j1);
        ne.e eVar = this.f20423d1;
        if (eVar.f16301g) {
            f7 = eVar.f16300f;
        } else {
            f7 = eVar.e;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f20436j1) {
                eVar.a(f10);
            } else {
                eVar.c(f10);
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f20458u0;
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
        return this.f20440m1;
    }

    public h5 getAdditionalSubtitleTextView() {
        return this.f20453s;
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
        return this.f20462x;
    }

    public boolean getCastShadows() {
        return this.f20437k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    public z9 getSearchAvatarImageView() {
        return this.f20426f;
    }

    public int getShadowAlpha() {
        return this.f20439l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f20450r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public h5 getSubtitleTextView() {
        return this.f20450r;
    }

    public String getTitle() {
        h5 h5Var = this.f20441n[0];
        if (h5Var == null) {
            return null;
        }
        return h5Var.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        h5 h5Var = this.f20441n[0];
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
        return this.f20441n[0];
    }

    public h5 getTitleTextView2() {
        return this.f20441n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public void h(boolean z10) {
        y yVar;
        if (this.f20442n0 && (yVar = this.E) != null) {
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
        dVar3.f20818c = true;
        dVar3.setClickable(true);
        if (!this.O0) {
            this.F.setBackgroundColor(g6.w0(g6.f20254w8, this.I0));
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
        if (this.f20440m1 == null) {
            bi.n nVar = new bi.n(this, getContext(), this.I0, this.N0);
            this.f20440m1 = nVar;
            nVar.setClipChildren(false);
            addView(this.f20440m1);
        }
    }

    public final void l() {
        if (this.f20453s != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f20453s = h5Var;
        h5Var.setGravity(3);
        this.f20453s.setVisibility(8);
        this.f20453s.setTextColor(g6.w0(g6.B8, this.I0));
        addView(this.f20453s, 0, w7.a6.e(-2, -2, 51));
    }

    public final void m() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(g6.g0(this.f20446p0, 1, -1));
        this.e.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.e, w7.a6.e(54, 54, 51));
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
        addView(yVar2, 0, w7.a6.e(-2, -1, 5));
        return this.E;
    }

    public final void o() {
        if (this.f20450r != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        this.f20450r = h5Var;
        h5Var.setGravity(3);
        this.f20450r.setVisibility(8);
        this.f20450r.setTextColor(g6.w0(g6.B8, this.I0));
        addView(this.f20450r, 0, w7.a6.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f20460w;
            if (i10 == 0) {
                i10 = this.f20462x;
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
        Drawable drawable = this.f20422d0;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(this.f20441n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f20462x;
            if (i10 != 0 && this.f20460w != 0 && !this.O0) {
                if (i0.a.f(i10) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
                } else {
                    AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        Drawable drawable = this.f20422d0;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z02;
        if (this.R && !this.f20433i0 && !LocaleController.isRTL && motionEvent.getAction() == 0 && (z02 = g6.z0()) != null && z02.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            zw0 zw0Var = this.S;
            h5[] h5VarArr = this.f20441n;
            if (zw0Var == null) {
                this.T = null;
                this.S = new zw0(0);
                h5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f23669c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f23667a = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                paint.setColor(g6.x0(null, g6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    obj.d.add(new a10(obj));
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
        int i16;
        h5 h5Var2;
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
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (kVar.E.p() && !kVar.f20442n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int l4 = kVar.E.l();
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.l() + (size - AndroidUtilities.dp(f11)), 1073741824);
                if (!kVar.f20464y) {
                    kVar.E.r(-l4);
                }
            } else if (kVar.f20442n0) {
                if (kVar.m0) {
                    f11 = 0.0f;
                } else if (AndroidUtilities.isTablet()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = yh.z(f11, size, 1073741824);
                if (!kVar.f20464y) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.f20464y) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i21 = 0;
        while (true) {
            h5VarArr = kVar.f20441n;
            if (i21 >= 2) {
                break;
            }
            h5 h5Var3 = h5VarArr[0];
            if ((h5Var3 != null && h5Var3.getVisibility() != 8) || ((h5Var = kVar.f20450r) != null && h5Var.getVisibility() != 8)) {
                y yVar2 = kVar.E;
                if (yVar2 != null) {
                    i14 = yVar2.getMeasuredWidth();
                } else {
                    i14 = 0;
                }
                int max = Math.max(org.telegram.messenger.q.D(16.0f, size - i14, dp) - kVar.f20414a0, 0);
                boolean z10 = kVar.f20465y0;
                int i22 = 20;
                if (((z10 && i21 == 0) || (!z10 && i21 == i20)) && kVar.f20461w0 && kVar.f20463x0) {
                    h5 h5Var4 = h5VarArr[i21];
                    i13 = i20;
                    if (kVar.O0) {
                        i22 = 17;
                    } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                        i22 = 18;
                    }
                    h5Var4.setTextSize(i22);
                } else {
                    i13 = i20;
                    h5 h5Var5 = h5VarArr[0];
                    if (h5Var5 != null && h5Var5.getVisibility() != 8 && (h5Var2 = kVar.f20450r) != null && h5Var2.getVisibility() != 8) {
                        h5 h5Var6 = h5VarArr[i21];
                        if (h5Var6 != null) {
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i22 = 18;
                            }
                            h5Var6.setTextSize(i22);
                        }
                        h5 h5Var7 = kVar.f20450r;
                        if (AndroidUtilities.isTablet()) {
                            i17 = 16;
                        } else {
                            i17 = 14;
                        }
                        h5Var7.setTextSize(i17);
                        h5 h5Var8 = kVar.f20453s;
                        if (h5Var8 != null) {
                            if (AndroidUtilities.isTablet()) {
                                i18 = 16;
                            } else {
                                i18 = 14;
                            }
                            h5Var8.setTextSize(i18);
                        }
                    } else {
                        h5 h5Var9 = h5VarArr[i21];
                        if (h5Var9 != null && h5Var9.getVisibility() != 8) {
                            h5 h5Var10 = h5VarArr[i21];
                            if (kVar.O0) {
                                i22 = 17;
                            } else if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i22 = 18;
                            }
                            h5Var10.setTextSize(i22);
                        }
                        h5 h5Var11 = kVar.f20450r;
                        if (h5Var11 != null && h5Var11.getVisibility() != 8) {
                            h5 h5Var12 = kVar.f20450r;
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i16 = 14;
                            } else {
                                i16 = 16;
                            }
                            h5Var12.setTextSize(i16);
                        }
                        h5 h5Var13 = kVar.f20453s;
                        if (h5Var13 != null) {
                            if (!AndroidUtilities.isTablet() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            h5Var13.setTextSize(i15);
                        }
                    }
                }
                h5 h5Var14 = h5VarArr[i21];
                if (h5Var14 != null && h5Var14.getVisibility() != 8) {
                    h5VarArr[i21].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h5VarArr[i21].getPaddingBottom() + h5VarArr[i21].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (kVar.f20466z0) {
                        CharSequence text = h5VarArr[i21].getText();
                        h5 h5Var15 = h5VarArr[i21];
                        h5Var15.setPivotX(h5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        h5VarArr[i21].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        h5VarArr[i21].setPivotX(0.0f);
                        h5VarArr[i21].setPivotY(0.0f);
                    }
                }
                h5 h5Var16 = kVar.f20450r;
                if (h5Var16 != null && h5Var16.getVisibility() != 8) {
                    kVar.f20450r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                bi.n nVar = kVar.f20440m1;
                if (nVar != null) {
                    nVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                h5 h5Var17 = kVar.f20453s;
                if (h5Var17 != null && h5Var17.getVisibility() != 8) {
                    kVar.f20453s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i13 = i20;
            }
            i21++;
            i20 = i13;
        }
        int i23 = i20;
        z9 z9Var = kVar.f20426f;
        if (z9Var != null) {
            z9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = kVar.getChildAt(i24);
            if (childAt.getVisibility() != 8 && childAt != h5VarArr[0] && childAt != h5VarArr[i23] && childAt != kVar.f20440m1 && childAt != kVar.f20450r && childAt != kVar.E && childAt != kVar.e && childAt != kVar.f20453s && childAt != kVar.f20426f) {
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

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        invalidate();
    }

    public final void q(int i10) {
        View[] viewArr = this.f20441n;
        if (viewArr[i10] != null) {
            return;
        }
        h5 h5Var = new h5(getContext());
        viewArr[i10] = h5Var;
        h5Var.setGravity(19);
        int i11 = this.f20459v0;
        if (i11 != 0) {
            viewArr[i10].setTextColor(i11);
        } else {
            viewArr[i10].setTextColor(g6.w0(g6.A8, this.I0));
        }
        h5 h5Var2 = viewArr[i10];
        h5Var2.setEmojiColor(h5Var2.getTextColor());
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

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void s() {
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
            boolean z10 = this.f20442n0;
            h5[] h5VarArr = this.f20441n;
            if (!z10) {
                h5 h5Var = h5VarArr[0];
                if (h5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, 1.0f));
                }
                if (this.f20450r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f20450r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i12 = this.f20462x;
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
            if (!this.f20442n0) {
                h5 h5Var2 = h5VarArr[0];
                if (h5Var2 != null) {
                    h5Var2.setVisibility(0);
                }
                if (this.f20450r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f20450r.setVisibility(0);
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
                this.e.setBackgroundDrawable(g6.g0(this.f20446p0, 1, -1));
            }
        }
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f20458u0 = jVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f20460w = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        z(recyclerView, false, g6.f19843a7, g6.f20180s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.W0 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f20417b0 = z10;
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
            if (t()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f2Var.c(f7, false);
            f2Var.b(this.f20454s0);
            f2Var.a(this.f20451r0);
        } else if (drawable instanceof c5) {
            c5 c5Var = (c5) drawable;
            c5Var.f19678k = this.f20462x;
            c5Var.f19677j = this.f20451r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20451r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.S0) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20451r0, PorterDuff.Mode.SRC_IN));
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
        this.e.setColorFilter(new PorterDuffColorFilter(this.f20451r0, PorterDuff.Mode.SRC_IN));
        f();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f20462x = i10;
        if (!this.K0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c5) {
                ((c5) drawable).f19678k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f20437k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20437k0 = z10;
    }

    public void setChatAvatarContainer(ro roVar) {
        this.R0 = roVar;
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
        this.f20434i1 = true;
        if (this.f20430g1 != i10) {
            this.f20430g1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f20432h1 = true;
        if (this.f20428f1 != i10) {
            this.f20428f1 = i10;
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
        this.f20464y = z10;
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
        this.f20461w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f20424e0 = onClickListener;
        h5[] h5VarArr = this.f20441n;
        h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setRightDrawableOnClick(onClickListener);
        }
        h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setRightDrawableOnClick(this.f20424e0);
        }
    }

    public void setSearchAvatarImageView(z9 z9Var) {
        z9 z9Var2 = this.f20426f;
        if (z9Var2 != z9Var) {
            if (z9Var2 != null) {
                removeView(z9Var2);
            }
            this.f20426f = z9Var;
            if (z9Var != null) {
                addView(z9Var);
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
        if (this.f20415a1 != f7) {
            this.f20415a1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(hg.p0 p0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(p0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f20439l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20439l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.Z0 != z10) {
            this.Z0 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f20450r == null) {
            o();
        }
        if (this.f20450r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            h5 h5Var = this.f20450r;
            if (!isEmpty && !this.f20442n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h5Var.setVisibility(i10);
            this.f20450r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f20450r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f20450r == null) {
            o();
        }
        this.f20450r.setTextColor(i10);
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
        this.f20435j0 = runnable;
        this.f20431h0 = runnable;
    }

    public void setTitleColor(int i10) {
        h5[] h5VarArr = this.f20441n;
        if (h5VarArr[0] == null) {
            q(0);
        }
        this.f20459v0 = i10;
        h5VarArr[0].setTextColor(i10);
        h5VarArr[0].setEmojiColor(i10);
        h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f20414a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f20441n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public final boolean t() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean u(String str) {
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

    public boolean v() {
        return false;
    }

    public void w(boolean z10) {
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f20442n0 = z10;
        g();
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean v = v();
        if (!v) {
            h5 h5Var = this.f20441n[0];
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (this.f20450r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f20450r);
                h5 h5Var2 = this.f20450r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                h5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f20444o0;
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
        z9 z9Var = this.f20426f;
        if (z9Var != null) {
            z9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.V0;
            z9 z9Var2 = this.f20426f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(z9Var2, property, f10));
        }
        this.f20466z0 = true;
        requestLayout();
        this.V0.addListener(new f(this, arrayList, z10, v));
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

    public final void x() {
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

    public final void y(String str) {
        y yVar = this.E;
        if (yVar != null && str != null) {
            boolean z10 = this.f20442n0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.G) {
                        if (!z10) {
                            yVar.f20817b.w(u0Var.L(z11));
                        }
                        u0Var.H(str, false);
                        u0Var.getSearchField().setSelection(str.length());
                        return;
                    }
                }
            }
        }
    }

    public final void z(RecyclerView recyclerView, boolean z10, int i10, int i11) {
        float f7;
        this.f20447p1 = i10;
        this.f20449q1 = i11;
        org.telegram.messenger.voip.j jVar = new org.telegram.messenger.voip.j(9, this, recyclerView);
        recyclerView.j(new ah.d0(jVar, 13));
        this.f20445o1 = z10;
        if (this.f20443n1) {
            jVar.run();
            return;
        }
        this.f20443n1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.f20452r1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f20455s1 = f7;
        b();
    }

    public void setAdaptiveBackground(ap0 ap0Var) {
        int i10 = g6.f19843a7;
        int i11 = g6.f20180s8;
        this.f20447p1 = i10;
        this.f20449q1 = i11;
        b();
        org.telegram.messenger.voip.j jVar = new org.telegram.messenger.voip.j(8, this, ap0Var);
        ap0Var.f23602f.add(jVar);
        if (this.f20443n1) {
            jVar.run();
            return;
        }
        this.f20443n1 = true;
        boolean canScrollVertically = ap0Var.canScrollVertically(-1);
        this.f20452r1 = !canScrollVertically;
        this.f20455s1 = !canScrollVertically ? 1.0f : 0.0f;
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
