package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.m70;
import rh.y7;
public class x1 extends Dialog implements Drawable.Callback, us {
    public static final int l1 = 0;
    public boolean A0;
    public final Drawable B0;
    public final Rect C0;
    public final BitmapDrawable[] D;
    public final float D0;
    public final boolean[] E;
    public Bitmap E0;
    public final AnimatorSet[] F;
    public Matrix F0;
    public int G;
    public BitmapShader G0;
    public boolean H;
    public Paint H0;
    public int I;
    public Paint I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public x1 K;
    public boolean K0;
    public int L;
    public boolean L0;
    public DialogInterface.OnClickListener M;
    public boolean M0;
    public DialogInterface.OnDismissListener N;
    public final n1 N0;
    public q20 O;
    public final n1 O0;
    public CharSequence[] P;
    public final ArrayList P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public boolean R0;
    public String S;
    public float S0;
    public CharSequence T;
    public final p6 T0;
    public int U;
    public boolean U0;
    public View V;
    public boolean V0;
    public boolean W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public long Y0;
    public Map Z;
    public boolean Z0;
    public int f21468a;
    public int f21469a0;
    public FrameLayout f21470a1;
    public View f21471b;
    public Drawable f21472b0;
    public rh.a f21473b1;
    public TextView f21474c;
    public int f21475c0;
    public t1 f21476c1;
    public xt d;
    public int f21477d0;
    public int f21478d1;
    public int e;
    public p6 f21479e0;
    public int f21480e1;
    public nh.p f21481f;
    public final int f21482f0;
    public int f21483f1;
    public int f21484g0;
    public int f21485g1;
    public TextView h;
    public boolean f21486h0;
    public int f21487h1;
    public boolean f21488i0;
    public boolean f21489i1;
    public boolean f21490j0;
    public boolean f21491j1;
    public boolean f21492k0;
    public final v1 f21493k1;
    public boolean f21494l0;
    public ei0 m0;
    public xt f21495n;
    public CharSequence f21496n0;
    public u1 f21497o0;
    public CharSequence f21498p0;
    public u1 f21499q0;
    public FrameLayout f21500r;
    public String f21501r0;
    public FrameLayout f21502s;
    public bi.m4 f21503s0;
    public CharSequence f21504t0;
    public u1 f21505u0;
    public ViewGroup f21506v0;
    public p1 f21507w;
    public a80 f21508w0;
    public LinearLayout f21509x;
    public TextView f21510x0;
    public s1 f21511y;
    public m70 f21512y0;
    public final int[] f21513z0;

    public x1(Context context) {
        this(3, context, null);
    }

    public static void a(x1 x1Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = x1Var.E;
        AnimatorSet[] animatorSetArr = x1Var.F;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = x1Var.D[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new bi.d5(x1Var, i10, 2));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public static boolean b(View view) {
        if (!view.onCheckIsTextEditor()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (childCount > 0) {
                    childCount--;
                    if (b(viewGroup.getChildAt(childCount))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void c(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - this.Y0;
        if (currentTimeMillis < j10) {
            org.telegram.messenger.i0.h3(new n1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f21506v0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xt xtVar;
        if (i10 == zs.f19630i4 && (xtVar = this.f21495n) != null) {
            xtVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        q20 q20Var = this.O;
        if (q20Var != null) {
            this.O = null;
            q20Var.a(new n1(this, 0));
        } else if (!this.f21491j1) {
            this.f21491j1 = true;
            zs.e().n(this, zs.f19630i4);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            x1 x1Var = this.K;
            if (x1Var != null) {
                x1Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            org.telegram.messenger.i0.r(this.O0);
            if (this.G0 != null && (bitmap = this.E0) != null) {
                bitmap.recycle();
                this.G0 = null;
                this.H0 = null;
                this.E0 = null;
            }
        }
    }

    public final int e() {
        int L;
        int L2 = (org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(48.0f)) - (this.X0 * 2);
        if (org.telegram.messenger.i0.Q1()) {
            if (org.telegram.messenger.i0.P1()) {
                L = org.telegram.messenger.i0.L(446.0f);
            } else {
                L = org.telegram.messenger.i0.L(496.0f);
            }
        } else {
            L = org.telegram.messenger.i0.L(356.0f);
        }
        int min = Math.min(L, L2);
        Rect rect = this.C0;
        return min + rect.left + rect.right;
    }

    public int f(int i10) {
        return t6.w0(i10, this.T0);
    }

    public final ViewGroup g(boolean z10) {
        Object[] objArr;
        float f7;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        float f12;
        int i14;
        float f13;
        float f14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f15;
        t1 t1Var = new t1(this, getContext());
        this.f21476c1 = t1Var;
        t1Var.setOrientation(1);
        boolean z11 = this.V0;
        int i27 = this.f21482f0;
        if ((z11 || i27 == 3) && i27 != 2) {
            this.f21476c1.setBackground(null);
            this.f21476c1.setPadding(0, 0, 0, 0);
            if (this.V0) {
                this.f21476c1.setWillNotDraw(false);
            }
            this.f21492k0 = false;
        } else {
            boolean z12 = this.f21494l0;
            Drawable drawable = this.B0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f21476c1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f21492k0 = true;
            } else {
                this.f21476c1.setBackground(null);
                this.f21476c1.setPadding(0, 0, 0, 0);
                this.f21476c1.setBackground(drawable);
                t1 t1Var2 = this.f21476c1;
                bi.d2 d2Var = rf.e0.f46526a;
                t1Var2.setOutlineProvider(new rf.c0(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(20.0f)));
                this.f21476c1.setClipToOutline(true);
                this.f21492k0 = false;
            }
        }
        ViewGroup viewGroup = this.f21476c1;
        boolean z13 = this.Z0;
        p6 p6Var = this.T0;
        if (z13) {
            if (this.f21470a1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.f21470a1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final x1 f20619b;

                    {
                        this.f20619b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f20619b.dismiss();
                                return;
                            case 1:
                                x1 x1Var = this.f20619b;
                                new y7(x1Var.getContext(), x1Var.T0).show();
                                return;
                            default:
                                x1 x1Var2 = this.f20619b;
                                DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(x1Var2, ((Integer) view.getTag()).intValue());
                                }
                                x1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.f21473b1 == null) {
                rh.a aVar = new rh.a(d20.f15147s0, getContext(), p6Var);
                this.f21473b1 = aVar;
                w7.e6.a(aVar);
                this.f21473b1.setOnClickListener(new View.OnClickListener(this) {
                    public final x1 f20619b;

                    {
                        this.f20619b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f20619b.dismiss();
                                return;
                            case 1:
                                x1 x1Var = this.f20619b;
                                new y7(x1Var.getContext(), x1Var.T0).show();
                                return;
                            default:
                                x1 x1Var2 = this.f20619b;
                                DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(x1Var2, ((Integer) view.getTag()).intValue());
                                }
                                x1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            org.telegram.messenger.i0.E2(this.f21476c1);
            org.telegram.messenger.i0.E2(this.f21473b1);
            this.f21470a1.addView(this.f21476c1, w7.b6.e(-2, -2, 17));
            this.f21470a1.addView(this.f21473b1, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.f21470a1;
        }
        if (z10) {
            if (this.Z0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f21468a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f21496n0 == null && this.f21498p0 == null && this.f21501r0 == null && this.f21504t0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.U != 0 || this.X != 0 || this.f21472b0 != null) {
            f7 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.m0 = imageView;
            Drawable drawable2 = this.f21472b0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f21472b0;
                if (drawable3 instanceof org.telegram.ui.Components.n6) {
                    org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) drawable3;
                    this.m0.addOnAttachStateChangeListener(new l.d(n6Var, 3));
                    n6Var.a(this.m0);
                }
            } else {
                int i28 = this.U;
                if (i28 != 0) {
                    imageView.setImageResource(i28);
                } else {
                    imageView.setAutoRepeat(this.U0);
                    ei0 ei0Var = this.m0;
                    int i29 = this.X;
                    int i30 = this.Y;
                    ei0Var.f(i29, i30, i30, null);
                    if (this.Z != null) {
                        bi0 animatedDrawable = this.m0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f24774s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f21480e1 = this.f21475c0;
                    }
                    this.m0.d();
                }
            }
            this.m0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.m0.setBackground(new w1(this.m0, this.f21475c0, org.telegram.messenger.i0.L(52.0f) + this.Y, this.f21477d0, this.f21479e0));
                this.f21469a0 = 92;
            } else if (this.f21477d0 >= 0) {
                a7.C(this.m0, t6.e0(org.telegram.messenger.i0.L(10.0f), 0, this.f21475c0), a7.N(this.f21477d0), this.f21479e0);
            } else {
                this.m0.setBackground(t6.e0(org.telegram.messenger.i0.L(10.0f), 0, this.f21475c0));
            }
            if (this.W) {
                this.m0.setTranslationY(org.telegram.messenger.i0.L(16.0f));
            } else {
                this.m0.setTranslationY(0.0f);
            }
            this.m0.setPadding(0, 0, 0, 0);
            this.f21476c1.addView(this.m0, w7.b6.t(-1, this.f21469a0, 51, 0, 0, 0, 0));
        } else {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.f21476c1.addView(this.V, w7.b6.t(-1, this.f21469a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f21502s = frameLayout2;
            this.f21476c1.addView(frameLayout2, w7.b6.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            nh.p pVar = new nh.p(getContext(), null, false);
            this.f21481f = pVar;
            zs.i(pVar);
            nh.p pVar2 = this.f21481f;
            pVar2.f13893s = 3;
            pVar2.setText(this.R);
            nh.p pVar3 = this.f21481f;
            int f16 = f(t6.f21037j5);
            this.f21485g1 = f16;
            pVar3.setTextColor(f16);
            this.f21481f.setTextSize(1, 20.0f);
            this.f21481f.setTypeface(org.telegram.messenger.i0.o());
            nh.p pVar4 = this.f21481f;
            if (this.W) {
                i24 = 1;
            } else if (cd.X) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            pVar4.setGravity(i24 | 48);
            FrameLayout frameLayout3 = this.f21502s;
            nh.p pVar5 = this.f21481f;
            boolean z14 = this.W;
            if (z14) {
                i25 = 1;
            } else if (cd.X) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i31 = i25 | 48;
            if (z14) {
                f15 = 4.0f;
            } else {
                if (this.S != null) {
                    i26 = 2;
                } else if (this.P != null) {
                    i26 = 14;
                } else {
                    i26 = 10;
                }
                f15 = i26;
            }
            frameLayout3.addView(pVar5, w7.b6.d(-2, -2.0f, i31, 0.0f, 19.0f, 0.0f, f15));
        }
        String str = this.S;
        v1 v1Var = this.f21493k1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            a7.V(this.h, t6.J5, v1Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (cd.X) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21 | 48);
            t1 t1Var3 = this.f21476c1;
            TextView textView3 = this.h;
            if (cd.X) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i32 = i22 | 48;
            f10 = 20.0f;
            if (this.P != null) {
                i23 = 14;
            } else {
                i23 = 10;
            }
            t1Var3.addView(textView3, w7.b6.t(-2, -2, i32, 24, 0, 24, i23));
        } else {
            f10 = 20.0f;
        }
        if (i27 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.D;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(2131231238).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(2131231239).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            p1 p1Var = new p1(this, getContext(), 0);
            this.f21507w = p1Var;
            p1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.i0.y3(this.f21507w, f(t6.A5));
            this.f21476c1.addView(this.f21507w, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f21509x = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 4.0f;
            this.f21507w.addView(this.f21509x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f11 = 4.0f;
        }
        xt xtVar = new xt(getContext());
        this.f21495n = xtVar;
        zs.i(xtVar);
        xt xtVar2 = this.f21495n;
        if (this.W) {
            i10 = t6.f21311y6;
        } else {
            i10 = t6.f21037j5;
        }
        int f17 = f(i10);
        this.f21487h1 = f17;
        xtVar2.setTextColor(f17);
        this.f21495n.setTextSize(1, f7);
        this.f21495n.setMovementMethod(new org.telegram.messenger.e0(false));
        a7.H(this.f21495n, t6.f21057k5, v1Var);
        if (!this.f21486h0) {
            this.f21495n.setClickable(false);
            this.f21495n.setEnabled(false);
        }
        xt xtVar3 = this.f21495n;
        if (this.W) {
            i11 = 1;
        } else if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        xtVar3.setGravity(i11 | 48);
        if (i27 == 2) {
            t1 t1Var4 = this.f21476c1;
            xt xtVar4 = this.f21495n;
            if (cd.X) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i33 = i17 | 48;
            if (this.R == null) {
                i18 = 19;
            } else {
                i18 = 0;
            }
            t1Var4.addView(xtVar4, w7.b6.t(-2, -2, i33, 24, i18, 24, 20));
            a80 a80Var = new a80(getContext());
            this.f21508w0 = a80Var;
            a80Var.a(false, this.f21484g0 / 100.0f);
            this.f21508w0.setProgressColor(f(t6.F5));
            this.f21508w0.setBackColor(f(t6.G5));
            this.f21476c1.addView(this.f21508w0, w7.b6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f21510x0 = textView4;
            textView4.setTypeface(org.telegram.messenger.i0.o());
            TextView textView5 = this.f21510x0;
            if (cd.X) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView5.setGravity(i19 | 48);
            a7.V(this.f21510x0, t6.f21169q5, v1Var);
            this.f21510x0.setTextSize(1, 14.0f);
            t1 t1Var5 = this.f21476c1;
            TextView textView6 = this.f21510x0;
            if (cd.X) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            t1Var5.addView(textView6, w7.b6.t(-2, -2, i20 | 48, 23, 4, 23, 24));
            this.f21510x0.setText(String.format("%d%%", Integer.valueOf(this.f21484g0)));
        } else if (i27 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f21500r = new FrameLayout(getContext());
            int i34 = t6.M5;
            this.f21478d1 = i34;
            this.W0 = f(i34);
            if (!this.V0) {
                this.f21500r.setBackgroundDrawable(t6.d0(org.telegram.messenger.i0.L(18.0f), this.W0));
            }
            this.f21476c1.addView(this.f21500r, w7.b6.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), p6Var);
            radialProgressView.setSize(org.telegram.messenger.i0.L(32.0f));
            radialProgressView.setProgressColor(f(t6.N5));
            this.f21500r.addView(radialProgressView, w7.b6.e(86, 86, 17));
        } else {
            xt xtVar5 = this.d;
            if (xtVar5 != null) {
                this.f21509x.addView(xtVar5, w7.b6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f21509x;
            xt xtVar6 = this.f21495n;
            if (this.W) {
                i12 = 1;
            } else if (cd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (this.f21471b == null && this.P == null) {
                i13 = 0;
            } else {
                i13 = this.G;
            }
            linearLayout2.addView(xtVar6, w7.b6.t(-2, -2, i35, 24, 0, 24, i13));
            TextView textView7 = this.f21474c;
            if (textView7 != null) {
                this.f21509x.addView(textView7, w7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f21495n.setText(this.T);
            this.f21495n.setVisibility(0);
        } else {
            this.f21495n.setVisibility(8);
        }
        if (this.P != null) {
            int i36 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i36 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i36] != null) {
                    r1 r1Var = new r1(getContext(), p6Var);
                    CharSequence charSequence = this.P[i36];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i16 = iArr[i36];
                    } else {
                        i16 = 0;
                    }
                    r1Var.a(i16, charSequence);
                    r1Var.setTag(Integer.valueOf(i36));
                    this.P0.add(r1Var);
                    this.f21509x.addView(r1Var, w7.b6.o(-1, 50));
                    r1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final x1 f20619b;

                        {
                            this.f20619b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f20619b.dismiss();
                                    return;
                                case 1:
                                    x1 x1Var = this.f20619b;
                                    new y7(x1Var.getContext(), x1Var.T0).show();
                                    return;
                                default:
                                    x1 x1Var2 = this.f20619b;
                                    DialogInterface.OnClickListener onClickListener = x1Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(x1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    x1Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i36++;
            }
        }
        View view2 = this.f21471b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f21471b.getParent()).removeView(this.f21471b);
            }
            this.f21509x.addView(this.f21471b, w7.b6.o(-1, this.e));
        }
        if (objArr != null) {
            if (!this.K0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                CharSequence charSequence2 = this.f21496n0;
                if (charSequence2 != null) {
                    i15 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.i0.L(24.0f) + 0);
                } else {
                    i15 = 0;
                }
                if (this.f21498p0 != null) {
                    if (i15 > 0) {
                        i15 += org.telegram.messenger.i0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.f21498p0;
                    i15 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.i0.L(24.0f) + i15);
                }
                if (this.f21501r0 != null) {
                    if (i15 > 0) {
                        i15 += org.telegram.messenger.i0.L(8.0f);
                    }
                    String str2 = this.f21501r0;
                    i15 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + org.telegram.messenger.i0.L(24.0f) + i15);
                }
                if (this.f21504t0 != null) {
                    if (i15 > 0) {
                        i15 += org.telegram.messenger.i0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.f21504t0;
                    i15 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.i0.L(24.0f) + i15);
                }
                if (i15 > org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(64.0f)) {
                    if (this.L0 && this.f21496n0 != null && this.f21498p0 != null && this.f21501r0 != null && this.f21504t0 != null) {
                        this.M0 = true;
                    } else {
                        this.K0 = true;
                    }
                }
            }
            if (this.K0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f21506v0 = linearLayout3;
            } else {
                this.f21506v0 = new jg.l0(this, getContext(), 7);
            }
            if (this.f21474c != null) {
                this.f21506v0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(f11));
                this.f21506v0.setTranslationY(-org.telegram.messenger.i0.L(6.0f));
                f12 = 64.0f;
            } else {
                f12 = 64.0f;
                this.f21506v0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            t1 t1Var6 = this.f21476c1;
            ViewGroup viewGroup2 = this.f21506v0;
            if (this.M0) {
                i14 = 96;
            } else {
                i14 = 52;
            }
            t1Var6.addView(viewGroup2, w7.b6.o(-1, i14));
            if (this.W) {
                this.f21506v0.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            }
            if (this.f21496n0 != null) {
                q1 q1Var = new q1(getContext(), 0);
                q1Var.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var.setTag(-1);
                q1Var.setTextSize(1, 16.0f);
                a7.V(q1Var, this.I, v1Var);
                q1Var.setGravity(17);
                q1Var.setTypeface(org.telegram.messenger.i0.o());
                q1Var.setText(this.f21496n0);
                f13 = 6.0f;
                q1Var.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                if (this.K0) {
                    f14 = 12.0f;
                    this.f21506v0.addView(q1Var, w7.b6.r(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.f21506v0.addView(q1Var, w7.b6.e(-2, 40, 53));
                }
                q1Var.setOnClickListener(new ag.t0(19, this, q1Var));
            } else {
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.f21498p0 != null) {
                q1 q1Var2 = new q1(getContext(), 1);
                q1Var2.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var2.setTag(-2);
                q1Var2.setTextSize(1, 16.0f);
                a7.V(q1Var2, this.I, v1Var);
                q1Var2.setGravity(17);
                q1Var2.setTypeface(org.telegram.messenger.i0.o());
                q1Var2.setEllipsize(TextUtils.TruncateAt.END);
                q1Var2.setSingleLine(true);
                q1Var2.setText(this.f21498p0.toString());
                q1Var2.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var2.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.f21506v0.addView(q1Var2, 0, w7.b6.r(-1, 40, 7));
                } else {
                    this.f21506v0.addView(q1Var2, w7.b6.e(-2, 40, 53));
                }
                q1Var2.setOnClickListener(new ag.t0(20, this, q1Var2));
            }
            if (this.f21504t0 != null) {
                q1 q1Var3 = new q1(getContext(), 2);
                q1Var3.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var3.setTag(-3);
                q1Var3.setTextSize(1, 16.0f);
                a7.V(q1Var3, this.I, v1Var);
                q1Var3.setGravity(17);
                q1Var3.setTypeface(org.telegram.messenger.i0.o());
                q1Var3.setEllipsize(TextUtils.TruncateAt.END);
                q1Var3.setSingleLine(true);
                q1Var3.setText(this.f21504t0.toString());
                q1Var3.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var3.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.f21506v0.addView(q1Var3, 1, w7.b6.r(-1, 40, 7));
                } else {
                    this.f21506v0.addView(q1Var3, w7.b6.e(-2, 40, 51));
                }
                q1Var3.setOnClickListener(new ag.t0(21, this, q1Var3));
            }
            if (this.f21501r0 != null) {
                q1 q1Var4 = new q1(getContext(), 3);
                q1Var4.setMinWidth(org.telegram.messenger.i0.L(f12));
                q1Var4.setTag(-4);
                q1Var4.setTextSize(1, 16.0f);
                a7.V(q1Var4, this.I, v1Var);
                q1Var4.setGravity(17);
                q1Var4.setTypeface(org.telegram.messenger.i0.o());
                q1Var4.setEllipsize(TextUtils.TruncateAt.END);
                q1Var4.setSingleLine(true);
                q1Var4.setText(this.f21501r0.toString());
                q1Var4.setBackground(t6.J0(org.telegram.messenger.i0.L(f10), f(this.I)));
                q1Var4.setPadding(org.telegram.messenger.i0.L(f14), 0, org.telegram.messenger.i0.L(f14), 0);
                if (this.K0) {
                    this.f21506v0.addView(q1Var4, 0, w7.b6.r(-1, 40, 7));
                } else {
                    this.f21506v0.addView(q1Var4, w7.b6.e(-2, 40, 53));
                }
                q1Var4.setOnClickListener(new ag.t0(22, this, q1Var4));
            }
            if (this.K0) {
                for (int i37 = 1; i37 < this.f21506v0.getChildCount(); i37++) {
                    ((ViewGroup.MarginLayoutParams) this.f21506v0.getChildAt(i37).getLayoutParams()).topMargin = org.telegram.messenger.i0.L(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Z0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.L = org.telegram.messenger.i0.f16026q.x;
            this.f21476c1.getLayoutParams().width = e();
            window.setWindowAnimations(2131755178);
        } else if (i27 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.R0) {
                layoutParams3.dimAmount = this.S0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.L = org.telegram.messenger.i0.f16026q.x;
            layoutParams3.width = e();
        }
        View view3 = this.f21471b;
        if (view3 != null && this.A0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.V0) {
            org.telegram.messenger.i0.l2(new ag.l(this, 25), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final gf.e h(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f21490j0 = false;
        }
        return new gf.e(new jg.u1(1, d), new ag.j0(this, d, z10, 9));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            a7.V(textView, t6.f21170q7, this.f21493k1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.f21507w.invalidate();
        this.f21509x.invalidate();
    }

    public final void j(int i10) {
        this.f21478d1 = -1;
        this.W0 = i10;
        Drawable drawable = this.B0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f21488i0 = false;
    }

    public final void l(boolean z10) {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.J0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P0;
            if (i10 < arrayList.size()) {
                r1 r1Var = (r1) arrayList.get(i10);
                r1Var.f20721a.setTextColor(i11);
                r1Var.f20722b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.T = str;
        if (this.f21495n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f21495n.setText(this.T);
                this.f21495n.setVisibility(0);
                return;
            }
            this.f21495n.setVisibility(8);
        }
    }

    public final void o(int i10) {
        this.f21484g0 = i10;
        a80 a80Var = this.f21508w0;
        if (a80Var != null) {
            a80Var.a(true, i10 / 100.0f);
            this.f21510x0.setText(String.format("%d%%", Integer.valueOf(this.f21484g0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        m70 m70Var = this.f21512y0;
        if (m70Var != null) {
            m70Var.h(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        zs.e().c(this, zs.f19630i4);
    }

    public final void p(int i10) {
        this.f21489i1 = true;
        nh.p pVar = this.f21481f;
        if (pVar != null) {
            pVar.setTextColor(i10);
        }
        xt xtVar = this.f21495n;
        if (xtVar != null) {
            xtVar.setTextColor(i10);
        }
    }

    public final void q() {
        if (this.f21488i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.T0);
            String L0 = cd.L0(2131744850, null);
            x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131744851, null);
            alertDialog$Builder.k(cd.L0(2131743239, null), null);
            alertDialog$Builder.h(cd.L0(2131744859, null), new mg.l(this, 10));
            alertDialog$Builder.j(new ag.x(this, 7));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        n1 n1Var = this.O0;
        org.telegram.messenger.i0.r(n1Var);
        org.telegram.messenger.i0.h3(n1Var, j10);
    }

    public final void s() {
        ei0 ei0Var;
        int w02;
        if (this.f21477d0 >= 0 && this.Z != null && (ei0Var = this.m0) != null && ei0Var.getAnimatedDrawable() != null && (w02 = t6.w0(this.f21477d0, this.f21479e0)) != this.f21480e1) {
            bi0 animatedDrawable = this.m0.getAnimatedDrawable();
            for (Map.Entry entry : this.Z.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f21480e1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f21480e1 = w02;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        p1 p1Var = this.f21507w;
        if (p1Var != null) {
            p1Var.postDelayed(runnable, j10);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        nh.p pVar = this.f21481f;
        if (pVar != null) {
            pVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        this.f21491j1 = false;
        super.show();
        FrameLayout frameLayout = this.f21500r;
        if (frameLayout != null && this.f21482f0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f21500r.setScaleY(0.0f);
            this.f21500r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.Y0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        p1 p1Var = this.f21507w;
        if (p1Var != null) {
            p1Var.removeCallbacks(runnable);
        }
    }

    public x1(int i10, Context context, p6 p6Var) {
        super(context, 2131755352);
        this.f21468a = -1;
        this.e = -2;
        this.D = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = t6.H5;
        this.f21469a0 = 132;
        this.f21477d0 = -1;
        this.f21486h0 = true;
        this.f21488i0 = true;
        this.f21490j0 = true;
        this.f21513z0 = new int[2];
        this.A0 = true;
        this.N0 = new n1(this, 0);
        this.O0 = new n1(this, 1);
        this.P0 = new ArrayList();
        this.R0 = true;
        this.S0 = 0.5f;
        this.U0 = true;
        this.f21478d1 = -1;
        this.f21493k1 = new v1(this, 0);
        this.T0 = p6Var;
        this.f21482f0 = i10;
        int i11 = t6.f21001h5;
        this.f21478d1 = i11;
        int f7 = f(i11);
        this.W0 = f7;
        boolean z10 = org.telegram.messenger.i0.B(f7) < 0.721f;
        this.V0 = tz.o() >= 2 && sc.e(256) && z10;
        Rect rect = new Rect();
        this.C0 = rect;
        if (i10 != 3 || this.V0) {
            Drawable f10 = i0.a.f(context, 2131232564);
            this.B0 = f10;
            this.D0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            f10.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
            f10.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
