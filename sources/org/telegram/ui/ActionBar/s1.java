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
import b8.mf;
import b8.pf;
import ci.ba;
import ci.nb;
import ci.v6;
import gi.j8;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.i60;
public class s1 extends Dialog implements Drawable.Callback, cs {
    public static final int m1 = 0;
    public final int[] A0;
    public boolean B0;
    public final Drawable C0;
    public final Rect D0;
    public final BitmapDrawable[] E;
    public final float E0;
    public final boolean[] F;
    public Bitmap F0;
    public final AnimatorSet[] G;
    public Matrix G0;
    public int H;
    public BitmapShader H0;
    public boolean I;
    public Paint I0;
    public int J;
    public Paint J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public s1 L;
    public boolean L0;
    public int M;
    public boolean M0;
    public DialogInterface.OnClickListener N;
    public boolean N0;
    public DialogInterface.OnDismissListener O;
    public final ci.b4 O0;
    public u10 P;
    public final ci.b4 P0;
    public CharSequence[] Q;
    public final ArrayList Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public boolean S0;
    public String T;
    public float T0;
    public CharSequence U;
    public final e6 U0;
    public int V;
    public boolean V0;
    public View W;
    public boolean W0;
    public boolean X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public long Z0;
    public int f28523a;
    public Map f28524a0;
    public boolean f28525a1;
    public View f28526b;
    public int f28527b0;
    public FrameLayout f28528b1;
    public TextView f28529c;
    public Drawable f28530c0;
    public ci.c f28531c1;
    public kt d;
    public int f28532d0;
    public o1 f28533d1;
    public int f28534e;
    public int f28535e0;
    public int f28536e1;
    public yh.l f28537f;
    public e6 f28538f0;
    public int f28539f1;
    public final int f28540g0;
    public int f28541g1;
    public TextView h;
    public int f28542h0;
    public int f28543h1;
    public boolean f28544i0;
    public int f28545i1;
    public boolean f28546j0;
    public boolean f28547j1;
    public boolean f28548k0;
    public boolean k1;
    public boolean f28549l0;
    public final q1 f28550l1;
    public boolean m0;
    public kt f28551n;
    public fh0 f28552n0;
    public CharSequence f28553o0;
    public p1 f28554p0;
    public CharSequence f28555q0;
    public FrameLayout f28556r;
    public p1 f28557r0;
    public FrameLayout f28558s;
    public String f28559s0;
    public mi.c4 f28560t0;
    public CharSequence f28561u0;
    public p1 f28562v0;
    public k1 f28563w;
    public ViewGroup f28564w0;
    public LinearLayout f28565x;
    public d70 f28566x0;
    public n1 f28567y;
    public TextView f28568y0;
    public i60 f28569z0;

    public s1(Context context) {
        this(3, context, null);
    }

    public static void a(s1 s1Var, int i3, boolean z10) {
        int i10;
        boolean[] zArr = s1Var.F;
        AnimatorSet[] animatorSetArr = s1Var.G;
        if ((z10 && !zArr[i3]) || (!z10 && zArr[i3])) {
            zArr[i3] = z10;
            AnimatorSet animatorSet = animatorSetArr[i3];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i3] = animatorSet2;
            BitmapDrawable bitmapDrawable = s1Var.E[i3];
            if (bitmapDrawable != null) {
                if (z10) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i10));
            }
            animatorSetArr[i3].setDuration(150L);
            animatorSetArr[i3].addListener(new ii.m2(s1Var, i3, 4));
            try {
                animatorSetArr[i3].start();
            } catch (Exception e10) {
                a8.g(e10, true);
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
        long currentTimeMillis = System.currentTimeMillis() - this.Z0;
        if (currentTimeMillis < j10) {
            org.telegram.messenger.g0.i3(new ci.b4(this, 2), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i3) {
        ViewGroup viewGroup = this.f28564w0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i3));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        kt ktVar;
        if (i3 == hs.f23246i4 && (ktVar = this.f28551n) != null) {
            ktVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        u10 u10Var = this.P;
        if (u10Var != null) {
            this.P = null;
            u10Var.a(new ci.b4(this, 2));
        } else if (!this.k1) {
            this.k1 = true;
            hs.e().n(this, hs.f23246i4);
            DialogInterface.OnDismissListener onDismissListener = this.O;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            s1 s1Var = this.L;
            if (s1Var != null) {
                s1Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            org.telegram.messenger.g0.r(this.P0);
            if (this.H0 != null && (bitmap = this.F0) != null) {
                bitmap.recycle();
                this.H0 = null;
                this.I0 = null;
                this.F0 = null;
            }
        }
    }

    public final int e() {
        int L;
        int L2 = (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(48.0f)) - (this.Y0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            if (org.telegram.messenger.g0.P1()) {
                L = org.telegram.messenger.g0.L(446.0f);
            } else {
                L = org.telegram.messenger.g0.L(496.0f);
            }
        } else {
            L = org.telegram.messenger.g0.L(356.0f);
        }
        int min = Math.min(L, L2);
        Rect rect = this.D0;
        return min + rect.left + rect.right;
    }

    public int f(int i3) {
        return k6.w0(i3, this.U0);
    }

    public final ViewGroup g(boolean z10) {
        Object[] objArr;
        float f10;
        float f11;
        float f12;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        float f13;
        int i14;
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
        float f14;
        o1 o1Var = new o1(this, getContext());
        this.f28533d1 = o1Var;
        o1Var.setOrientation(1);
        boolean z11 = this.W0;
        int i26 = this.f28540g0;
        if ((z11 || i26 == 3) && i26 != 2) {
            this.f28533d1.setBackground(null);
            this.f28533d1.setPadding(0, 0, 0, 0);
            if (this.W0) {
                this.f28533d1.setWillNotDraw(false);
            }
            this.f28549l0 = false;
        } else {
            boolean z12 = this.m0;
            Drawable drawable = this.C0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f28533d1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f28549l0 = true;
            } else {
                this.f28533d1.setBackground(null);
                this.f28533d1.setPadding(0, 0, 0, 0);
                this.f28533d1.setBackground(drawable);
                o1 o1Var2 = this.f28533d1;
                cg.p0 p0Var = cg.t0.f4745a;
                o1Var2.setOutlineProvider(new cg.r0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f)));
                this.f28533d1.setClipToOutline(true);
                this.f28549l0 = false;
            }
        }
        ViewGroup viewGroup = this.f28533d1;
        boolean z13 = this.f28525a1;
        e6 e6Var = this.U0;
        if (z13) {
            if (this.f28528b1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.f28528b1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final s1 f27652b;

                    {
                        this.f27652b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f27652b.dismiss();
                                return;
                            case 1:
                                s1 s1Var = this.f27652b;
                                new nb(s1Var.getContext(), s1Var.U0).show();
                                return;
                            default:
                                s1 s1Var2 = this.f27652b;
                                DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(s1Var2, ((Integer) view.getTag()).intValue());
                                }
                                s1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.f28531c1 == null) {
                ci.c cVar = new ci.c(h10.f22829t0, getContext(), e6Var);
                this.f28531c1 = cVar;
                pf.a(cVar);
                this.f28531c1.setOnClickListener(new View.OnClickListener(this) {
                    public final s1 f27652b;

                    {
                        this.f27652b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f27652b.dismiss();
                                return;
                            case 1:
                                s1 s1Var = this.f27652b;
                                new nb(s1Var.getContext(), s1Var.U0).show();
                                return;
                            default:
                                s1 s1Var2 = this.f27652b;
                                DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(s1Var2, ((Integer) view.getTag()).intValue());
                                }
                                s1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.f28533d1);
            org.telegram.messenger.g0.E2(this.f28531c1);
            this.f28528b1.addView(this.f28533d1, mf.e(-2, -2, 17));
            this.f28528b1.addView(this.f28531c1, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.f28528b1;
        }
        if (z10) {
            if (this.f28525a1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f28523a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f28553o0 == null && this.f28555q0 == null && this.f28559s0 == null && this.f28561u0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.V != 0 || this.Y != 0 || this.f28530c0 != null) {
            f10 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.f28552n0 = imageView;
            Drawable drawable2 = this.f28530c0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f28530c0;
                if (drawable3 instanceof org.telegram.ui.Components.p6) {
                    org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) drawable3;
                    this.f28552n0.addOnAttachStateChangeListener(new ai.f2(p6Var, 9));
                    p6Var.a(this.f28552n0);
                }
            } else {
                int i27 = this.V;
                if (i27 != 0) {
                    imageView.setImageResource(i27);
                } else {
                    imageView.setAutoRepeat(this.V0);
                    fh0 fh0Var = this.f28552n0;
                    int i28 = this.Y;
                    int i29 = this.Z;
                    fh0Var.f(i28, i29, i29, null);
                    if (this.f28524a0 != null) {
                        ch0 animatedDrawable = this.f28552n0.getAnimatedDrawable();
                        for (Map.Entry entry : this.f28524a0.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f32742s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f28539f1 = this.f28532d0;
                    }
                    this.f28552n0.d();
                }
            }
            this.f28552n0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.f28552n0.setBackground(new r1(this.f28552n0, this.f28532d0, org.telegram.messenger.g0.L(52.0f) + this.Z, this.f28535e0, this.f28538f0));
                this.f28527b0 = 92;
            } else if (this.f28535e0 >= 0) {
                r6.C(this.f28552n0, k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f28532d0), r6.N(this.f28535e0), this.f28538f0);
            } else {
                this.f28552n0.setBackground(k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f28532d0));
            }
            if (this.X) {
                this.f28552n0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.f28552n0.setTranslationY(0.0f);
            }
            this.f28552n0.setPadding(0, 0, 0, 0);
            this.f28533d1.addView(this.f28552n0, mf.t(-1, this.f28527b0, 51, 0, 0, 0, 0));
        } else {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.f28533d1.addView(this.W, mf.t(-1, this.f28527b0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        }
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f28558s = frameLayout2;
            f11 = 4.0f;
            this.f28533d1.addView(frameLayout2, mf.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            yh.l lVar = new yh.l(getContext(), null, false);
            this.f28537f = lVar;
            hs.i(lVar);
            yh.l lVar2 = this.f28537f;
            lVar2.f59561s = 3;
            lVar2.setText(this.S);
            yh.l lVar3 = this.f28537f;
            int f15 = f(k6.f27988j5);
            this.f28543h1 = f15;
            lVar3.setTextColor(f15);
            this.f28537f.setTextSize(1, 20.0f);
            this.f28537f.setTypeface(org.telegram.messenger.g0.o());
            yh.l lVar4 = this.f28537f;
            if (this.X) {
                i23 = 1;
            } else if (bd.f21784a0) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            lVar4.setGravity(i23 | 48);
            FrameLayout frameLayout3 = this.f28558s;
            yh.l lVar5 = this.f28537f;
            boolean z14 = this.X;
            if (z14) {
                i24 = 1;
            } else if (bd.f21784a0) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i30 = i24 | 48;
            if (z14) {
                f14 = 4.0f;
            } else {
                if (this.T != null) {
                    i25 = 2;
                } else if (this.Q != null) {
                    i25 = 14;
                } else {
                    i25 = 10;
                }
                f14 = i25;
            }
            frameLayout3.addView(lVar5, mf.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f14));
        } else {
            f11 = 4.0f;
        }
        String str = this.T;
        q1 q1Var = this.f28550l1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            r6.V(this.h, k6.J5, q1Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (bd.f21784a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20 | 48);
            o1 o1Var3 = this.f28533d1;
            TextView textView3 = this.h;
            if (bd.f21784a0) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i31 = i21 | 48;
            f12 = 20.0f;
            if (this.Q != null) {
                i22 = 14;
            } else {
                i22 = 10;
            }
            o1Var3.addView(textView3, mf.t(-2, -2, i31, 24, 0, 24, i22));
        } else {
            f12 = 20.0f;
        }
        if (i26 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.E;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(2131231237).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(2131231238).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            k1 k1Var = new k1(this, getContext(), 0);
            this.f28563w = k1Var;
            k1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.z3(this.f28563w, f(k6.A5));
            this.f28533d1.addView(this.f28563w, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f28565x = linearLayout;
            linearLayout.setOrientation(1);
            this.f28563w.addView(this.f28565x, new FrameLayout.LayoutParams(-1, -2));
        }
        kt ktVar = new kt(getContext());
        this.f28551n = ktVar;
        hs.i(ktVar);
        kt ktVar2 = this.f28551n;
        if (this.X) {
            i3 = k6.f28273y6;
        } else {
            i3 = k6.f27988j5;
        }
        int f16 = f(i3);
        this.f28545i1 = f16;
        ktVar2.setTextColor(f16);
        this.f28551n.setTextSize(1, f10);
        this.f28551n.setMovementMethod(new org.telegram.messenger.c0(false));
        r6.H(this.f28551n, k6.f28006k5, q1Var);
        if (!this.f28544i0) {
            this.f28551n.setClickable(false);
            this.f28551n.setEnabled(false);
        }
        kt ktVar3 = this.f28551n;
        if (this.X) {
            i10 = 1;
        } else if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        ktVar3.setGravity(i10 | 48);
        if (i26 == 2) {
            o1 o1Var4 = this.f28533d1;
            kt ktVar4 = this.f28551n;
            if (bd.f21784a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i32 = i16 | 48;
            if (this.S == null) {
                i17 = 19;
            } else {
                i17 = 0;
            }
            o1Var4.addView(ktVar4, mf.t(-2, -2, i32, 24, i17, 24, 20));
            d70 d70Var = new d70(getContext());
            this.f28566x0 = d70Var;
            d70Var.a(false, this.f28542h0 / 100.0f);
            this.f28566x0.setProgressColor(f(k6.F5));
            this.f28566x0.setBackColor(f(k6.G5));
            this.f28533d1.addView(this.f28566x0, mf.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f28568y0 = textView4;
            textView4.setTypeface(org.telegram.messenger.g0.o());
            TextView textView5 = this.f28568y0;
            if (bd.f21784a0) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            r6.V(this.f28568y0, k6.f28120q5, q1Var);
            this.f28568y0.setTextSize(1, 14.0f);
            o1 o1Var5 = this.f28533d1;
            TextView textView6 = this.f28568y0;
            if (bd.f21784a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            o1Var5.addView(textView6, mf.t(-2, -2, i19 | 48, 23, 4, 23, 24));
            this.f28568y0.setText(String.format("%d%%", Integer.valueOf(this.f28542h0)));
        } else if (i26 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f28556r = new FrameLayout(getContext());
            int i33 = k6.M5;
            this.f28536e1 = i33;
            this.X0 = f(i33);
            if (!this.W0) {
                this.f28556r.setBackgroundDrawable(k6.d0(org.telegram.messenger.g0.L(18.0f), this.X0));
            }
            this.f28533d1.addView(this.f28556r, mf.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), e6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(k6.N5));
            this.f28556r.addView(radialProgressView, mf.e(86, 86, 17));
        } else {
            kt ktVar5 = this.d;
            if (ktVar5 != null) {
                this.f28565x.addView(ktVar5, mf.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f28565x;
            kt ktVar6 = this.f28551n;
            if (this.X) {
                i11 = 1;
            } else if (bd.f21784a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (this.f28526b == null && this.Q == null) {
                i12 = 0;
            } else {
                i12 = this.H;
            }
            linearLayout2.addView(ktVar6, mf.t(-2, -2, i34, 24, 0, 24, i12));
            TextView textView7 = this.f28529c;
            if (textView7 != null) {
                this.f28565x.addView(textView7, mf.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.U)) {
            this.f28551n.setText(this.U);
            this.f28551n.setVisibility(0);
        } else {
            this.f28551n.setVisibility(8);
        }
        if (this.Q != null) {
            int i35 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i35 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i35] != null) {
                    m1 m1Var = new m1(getContext(), e6Var);
                    CharSequence charSequence = this.Q[i35];
                    int[] iArr = this.R;
                    if (iArr != null) {
                        i15 = iArr[i35];
                    } else {
                        i15 = 0;
                    }
                    m1Var.a(i15, charSequence);
                    m1Var.setTag(Integer.valueOf(i35));
                    this.Q0.add(m1Var);
                    this.f28565x.addView(m1Var, mf.o(-1, 50));
                    m1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f27652b;

                        {
                            this.f27652b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f27652b.dismiss();
                                    return;
                                case 1:
                                    s1 s1Var = this.f27652b;
                                    new nb(s1Var.getContext(), s1Var.U0).show();
                                    return;
                                default:
                                    s1 s1Var2 = this.f27652b;
                                    DialogInterface.OnClickListener onClickListener = s1Var2.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(s1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    s1Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i35++;
            }
        }
        View view2 = this.f28526b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f28526b.getParent()).removeView(this.f28526b);
            }
            this.f28565x.addView(this.f28526b, mf.o(-1, this.f28534e));
        }
        if (objArr != null) {
            if (!this.L0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.f28553o0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f28555q0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.f28555q0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f28559s0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str2 = this.f28559s0;
                    i14 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f28561u0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.f28561u0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (i14 > org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (this.M0 && this.f28553o0 != null && this.f28555q0 != null && this.f28559s0 != null && this.f28561u0 != null) {
                        this.N0 = true;
                    } else {
                        this.L0 = true;
                    }
                }
            }
            if (this.L0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f28564w0 = linearLayout3;
            } else {
                this.f28564w0 = new ai.o2(10, getContext(), this);
            }
            if (this.f28529c != null) {
                this.f28564w0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f11));
                this.f28564w0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.f28564w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            o1 o1Var6 = this.f28533d1;
            ViewGroup viewGroup2 = this.f28564w0;
            if (this.N0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            o1Var6.addView(viewGroup2, mf.o(-1, i13));
            if (this.X) {
                this.f28564w0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.f28553o0 != null) {
                l1 l1Var = new l1(getContext(), 0);
                l1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                l1Var.setTag(-1);
                l1Var.setTextSize(1, 16.0f);
                r6.V(l1Var, this.J, q1Var);
                l1Var.setGravity(17);
                l1Var.setTypeface(org.telegram.messenger.g0.o());
                l1Var.setText(this.f28553o0);
                l1Var.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    f13 = 64.0f;
                    this.f28564w0.addView(l1Var, mf.r(-1, 40, 7));
                } else {
                    f13 = 64.0f;
                    this.f28564w0.addView(l1Var, mf.e(-2, 40, 53));
                }
                l1Var.setOnClickListener(new org.telegram.messenger.video.g(3, this, l1Var));
            } else {
                f13 = 64.0f;
            }
            if (this.f28555q0 != null) {
                l1 l1Var2 = new l1(getContext(), 1);
                l1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var2.setTag(-2);
                l1Var2.setTextSize(1, 16.0f);
                r6.V(l1Var2, this.J, q1Var);
                l1Var2.setGravity(17);
                l1Var2.setTypeface(org.telegram.messenger.g0.o());
                l1Var2.setEllipsize(TextUtils.TruncateAt.END);
                l1Var2.setSingleLine(true);
                l1Var2.setText(this.f28555q0.toString());
                l1Var2.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.f28564w0.addView(l1Var2, 0, mf.r(-1, 40, 7));
                } else {
                    this.f28564w0.addView(l1Var2, mf.e(-2, 40, 53));
                }
                l1Var2.setOnClickListener(new org.telegram.messenger.video.g(4, this, l1Var2));
            }
            if (this.f28561u0 != null) {
                l1 l1Var3 = new l1(getContext(), 2);
                l1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var3.setTag(-3);
                l1Var3.setTextSize(1, 16.0f);
                r6.V(l1Var3, this.J, q1Var);
                l1Var3.setGravity(17);
                l1Var3.setTypeface(org.telegram.messenger.g0.o());
                l1Var3.setEllipsize(TextUtils.TruncateAt.END);
                l1Var3.setSingleLine(true);
                l1Var3.setText(this.f28561u0.toString());
                l1Var3.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.f28564w0.addView(l1Var3, 1, mf.r(-1, 40, 7));
                } else {
                    this.f28564w0.addView(l1Var3, mf.e(-2, 40, 51));
                }
                l1Var3.setOnClickListener(new org.telegram.messenger.video.g(5, this, l1Var3));
            }
            if (this.f28559s0 != null) {
                l1 l1Var4 = new l1(getContext(), 3);
                l1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                l1Var4.setTag(-4);
                l1Var4.setTextSize(1, 16.0f);
                r6.V(l1Var4, this.J, q1Var);
                l1Var4.setGravity(17);
                l1Var4.setTypeface(org.telegram.messenger.g0.o());
                l1Var4.setEllipsize(TextUtils.TruncateAt.END);
                l1Var4.setSingleLine(true);
                l1Var4.setText(this.f28559s0.toString());
                l1Var4.setBackground(k6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                l1Var4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.L0) {
                    this.f28564w0.addView(l1Var4, 0, mf.r(-1, 40, 7));
                } else {
                    this.f28564w0.addView(l1Var4, mf.e(-2, 40, 53));
                }
                l1Var4.setOnClickListener(new org.telegram.messenger.video.g(6, this, l1Var4));
            }
            if (this.L0) {
                for (int i36 = 1; i36 < this.f28564w0.getChildCount(); i36++) {
                    ((ViewGroup.MarginLayoutParams) this.f28564w0.getChildAt(i36).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(6.0f);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.f28525a1) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = org.telegram.messenger.g0.f22608q.x;
            this.f28533d1.getLayoutParams().width = e();
            window.setWindowAnimations(2131755178);
        } else if (i26 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.S0) {
                layoutParams3.dimAmount = this.T0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.M = org.telegram.messenger.g0.f22608q.x;
            layoutParams3.width = e();
        }
        View view3 = this.f28526b;
        if (view3 != null && this.B0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.W0) {
            org.telegram.messenger.g0.l2(new j8(this, 17), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final sf.b h(int i3, boolean z10, boolean z11) {
        View d = d(i3);
        if (z11) {
            this.f28548k0 = false;
        }
        return new sf.b(new i1(0, d), new v6(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            r6.V(textView, k6.f28122q7, this.f28550l1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.f28563w.invalidate();
        this.f28565x.invalidate();
    }

    public final void j(int i3) {
        this.f28536e1 = -1;
        this.X0 = i3;
        Drawable drawable = this.C0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.X0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f28546j0 = false;
    }

    public final void l(boolean z10) {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.K0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i3, int i10, int i11) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Q0;
            if (i3 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i3);
                m1Var.f28330a.setTextColor(i10);
                m1Var.f28331b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.U = str;
        if (this.f28551n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f28551n.setText(this.U);
                this.f28551n.setVisibility(0);
                return;
            }
            this.f28551n.setVisibility(8);
        }
    }

    public final void o(int i3) {
        this.f28542h0 = i3;
        d70 d70Var = this.f28566x0;
        if (d70Var != null) {
            d70Var.a(true, i3 / 100.0f);
            this.f28568y0.setText(String.format("%d%%", Integer.valueOf(this.f28542h0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        i60 i60Var = this.f28569z0;
        if (i60Var != null) {
            i60Var.g(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        hs.e().c(this, hs.f23246i4);
    }

    public final void p(int i3) {
        this.f28547j1 = true;
        yh.l lVar = this.f28537f;
        if (lVar != null) {
            lVar.setTextColor(i3);
        }
        kt ktVar = this.f28551n;
        if (ktVar != null) {
            ktVar.setTextColor(i3);
        }
    }

    public final void q() {
        if (this.f28546j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.U0);
            String M0 = bd.M0(2131744842, null);
            s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131744843, null);
            alertDialog$Builder.k(bd.M0(2131743223, null), null);
            alertDialog$Builder.h(bd.M0(2131744851, null), new l5.b(this, 28));
            alertDialog$Builder.j(new ba(this, 9));
            try {
                this.L = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        ci.b4 b4Var = this.P0;
        org.telegram.messenger.g0.r(b4Var);
        org.telegram.messenger.g0.i3(b4Var, j10);
    }

    public final void s() {
        fh0 fh0Var;
        int w02;
        if (this.f28535e0 >= 0 && this.f28524a0 != null && (fh0Var = this.f28552n0) != null && fh0Var.getAnimatedDrawable() != null && (w02 = k6.w0(this.f28535e0, this.f28538f0)) != this.f28539f1) {
            ch0 animatedDrawable = this.f28552n0.getAnimatedDrawable();
            for (Map.Entry entry : this.f28524a0.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f28539f1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f28539f1 = w02;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        k1 k1Var = this.f28563w;
        if (k1Var != null) {
            k1Var.postDelayed(runnable, j10);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.K = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.S = charSequence;
        yh.l lVar = this.f28537f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        this.k1 = false;
        super.show();
        FrameLayout frameLayout = this.f28556r;
        if (frameLayout != null && this.f28540g0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f28556r.setScaleY(0.0f);
            this.f28556r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.Z0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        k1 k1Var = this.f28563w;
        if (k1Var != null) {
            k1Var.removeCallbacks(runnable);
        }
    }

    public s1(int i3, Context context, e6 e6Var) {
        super(context, 2131755352);
        this.f28523a = -1;
        this.f28534e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = 12;
        this.J = k6.H5;
        this.f28527b0 = 132;
        this.f28535e0 = -1;
        this.f28544i0 = true;
        this.f28546j0 = true;
        this.f28548k0 = true;
        this.A0 = new int[2];
        this.B0 = true;
        this.O0 = new ci.b4(this, 2);
        this.P0 = new ci.b4(this, 3);
        this.Q0 = new ArrayList();
        this.S0 = true;
        this.T0 = 0.5f;
        this.V0 = true;
        this.f28536e1 = -1;
        this.f28550l1 = new q1(this, 0);
        this.U0 = e6Var;
        this.f28540g0 = i3;
        int i10 = k6.f27954h5;
        this.f28536e1 = i10;
        int f10 = f(i10);
        this.X0 = f10;
        boolean z10 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.W0 = az.o() >= 2 && lc.e(256) && z10;
        Rect rect = new Rect();
        this.D0 = rect;
        if (i3 != 3 || this.W0) {
            Drawable g7 = k2.p1.g(context, 2131232565);
            this.C0 = g7;
            this.E0 = i3 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            g7.setColorFilter(new PorterDuffColorFilter(this.X0, PorterDuff.Mode.MULTIPLY));
            g7.getPadding(rect);
        }
        this.I = i3 == 3;
    }
}
