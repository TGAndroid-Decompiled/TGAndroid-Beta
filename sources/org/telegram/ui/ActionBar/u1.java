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
import bi.eb;
import bi.u7;
import bi.uc;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.o60;
public class u1 extends Dialog implements Drawable.Callback, ls {
    public static final int f28546j1 = 0;
    public final Rect A0;
    public final float B0;
    public Bitmap C0;
    public final BitmapDrawable[] D;
    public Matrix D0;
    public final boolean[] E;
    public BitmapShader E0;
    public final AnimatorSet[] F;
    public Paint F0;
    public int G;
    public Paint G0;
    public boolean H;
    public boolean H0;
    public int I;
    public boolean I0;
    public DialogInterface.OnCancelListener J;
    public boolean J0;
    public u1 K;
    public boolean K0;
    public int L;
    public final bi.r4 L0;
    public DialogInterface.OnClickListener M;
    public final bi.r4 M0;
    public DialogInterface.OnDismissListener N;
    public final ArrayList N0;
    public c20 O;
    public float O0;
    public CharSequence[] P;
    public boolean P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public final f6 R0;
    public String S;
    public boolean S0;
    public CharSequence T;
    public boolean T0;
    public int U;
    public int U0;
    public View V;
    public int V0;
    public boolean W;
    public long W0;
    public int X;
    public boolean X0;
    public int Y;
    public FrameLayout Y0;
    public Map Z;
    public bi.c Z0;
    public int f28547a;
    public int f28548a0;
    public q1 f28549a1;
    public View f28550b;
    public Drawable f28551b0;
    public int f28552b1;
    public TextView f28553c;
    public int f28554c0;
    public int f28555c1;
    public lt d;
    public int f28556d0;
    public int f28557d1;
    public int f28558e;
    public f6 f28559e0;
    public int f28560e1;
    public xh.l f28561f;
    public final int f28562f0;
    public int f28563f1;
    public int f28564g0;
    public boolean f28565g1;
    public TextView h;
    public boolean f28566h0;
    public boolean f28567h1;
    public boolean f28568i0;
    public final s1 f28569i1;
    public boolean f28570j0;
    public ch0 f28571k0;
    public CharSequence f28572l0;
    public r1 m0;
    public lt f28573n;
    public CharSequence f28574n0;
    public r1 f28575o0;
    public String f28576p0;
    public li.c4 f28577q0;
    public FrameLayout f28578r;
    public CharSequence f28579r0;
    public FrameLayout f28580s;
    public r1 f28581s0;
    public ViewGroup f28582t0;
    public h70 f28583u0;
    public TextView f28584v0;
    public m1 f28585w;
    public o60 f28586w0;
    public LinearLayout f28587x;
    public final int[] f28588x0;
    public p1 f28589y;
    public boolean f28590y0;
    public final Drawable f28591z0;

    public u1(Context context) {
        this(3, context, null);
    }

    public static void a(u1 u1Var, int i7, boolean z9) {
        int i10;
        boolean[] zArr = u1Var.E;
        AnimatorSet[] animatorSetArr = u1Var.F;
        if ((z9 && !zArr[i7]) || (!z9 && zArr[i7])) {
            zArr[i7] = z9;
            AnimatorSet animatorSet = animatorSetArr[i7];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i7] = animatorSet2;
            BitmapDrawable bitmapDrawable = u1Var.D[i7];
            if (bitmapDrawable != null) {
                if (z9) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i10));
            }
            animatorSetArr[i7].setDuration(150L);
            animatorSetArr[i7].addListener(new hi.m2(u1Var, i7, 4));
            try {
                animatorSetArr[i7].start();
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

    public final void c(long j3) {
        long currentTimeMillis = System.currentTimeMillis() - this.W0;
        if (currentTimeMillis < j3) {
            org.telegram.messenger.g0.i3(new bi.r4(this, 2), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i7) {
        ViewGroup viewGroup = this.f28582t0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i7));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lt ltVar;
        if (i7 == qs.f25001i4 && (ltVar = this.f28573n) != null) {
            ltVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        c20 c20Var = this.O;
        if (c20Var != null) {
            this.O = null;
            c20Var.a(new bi.r4(this, 2));
        } else if (!this.f28567h1) {
            this.f28567h1 = true;
            qs.e().n(this, qs.f25001i4);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            u1 u1Var = this.K;
            if (u1Var != null) {
                u1Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            org.telegram.messenger.g0.r(this.M0);
            if (this.E0 != null && (bitmap = this.C0) != null) {
                bitmap.recycle();
                this.E0 = null;
                this.F0 = null;
                this.C0 = null;
            }
        }
    }

    public final int e() {
        int L;
        int L2 = (org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(48.0f)) - (this.V0 * 2);
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
        Rect rect = this.A0;
        return min + rect.left + rect.right;
    }

    public int f(int i7) {
        return k6.w0(i7, this.R0);
    }

    public final ViewGroup g(boolean z9) {
        Object[] objArr;
        float f10;
        float f11;
        float f12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        float f13;
        float f14;
        float f15;
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
        float f16;
        q1 q1Var = new q1(this, getContext());
        this.f28549a1 = q1Var;
        q1Var.setOrientation(1);
        boolean z10 = this.T0;
        int i26 = this.f28562f0;
        if ((z10 || i26 == 3) && i26 != 2) {
            this.f28549a1.setBackground(null);
            this.f28549a1.setPadding(0, 0, 0, 0);
            if (this.T0) {
                this.f28549a1.setWillNotDraw(false);
            }
        } else {
            this.f28549a1.setBackground(null);
            this.f28549a1.setPadding(0, 0, 0, 0);
            this.f28549a1.setBackground(this.f28591z0);
            q1 q1Var2 = this.f28549a1;
            bg.q0 q0Var = bg.u0.f3380a;
            q1Var2.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f)));
            this.f28549a1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.f28549a1;
        boolean z11 = this.X0;
        f6 f6Var = this.R0;
        if (z11) {
            if (this.Y0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Y0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final u1 f27709b;

                    {
                        this.f27709b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f27709b.dismiss();
                                return;
                            case 1:
                                u1 u1Var = this.f27709b;
                                new uc(u1Var.getContext(), u1Var.R0).show();
                                return;
                            default:
                                u1 u1Var2 = this.f27709b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.Z0 == null) {
                bi.c cVar = new bi.c(p10.f24459s0, getContext(), f6Var);
                this.Z0 = cVar;
                ka.a(cVar);
                this.Z0.setOnClickListener(new View.OnClickListener(this) {
                    public final u1 f27709b;

                    {
                        this.f27709b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f27709b.dismiss();
                                return;
                            case 1:
                                u1 u1Var = this.f27709b;
                                new uc(u1Var.getContext(), u1Var.R0).show();
                                return;
                            default:
                                u1 u1Var2 = this.f27709b;
                                DialogInterface.OnClickListener onClickListener = u1Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(u1Var2, ((Integer) view.getTag()).intValue());
                                }
                                u1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.f28549a1);
            org.telegram.messenger.g0.E2(this.Z0);
            this.Y0.addView(this.f28549a1, ha.e(-2, -2, 17));
            this.Y0.addView(this.Z0, ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Y0;
        }
        if (z9) {
            if (this.X0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f28547a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f28572l0 == null && this.f28574n0 == null && this.f28576p0 == null && this.f28579r0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.U != 0 || this.X != 0 || this.f28551b0 != null) {
            f10 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.f28571k0 = imageView;
            Drawable drawable = this.f28551b0;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                Drawable drawable2 = this.f28551b0;
                if (drawable2 instanceof org.telegram.ui.Components.r6) {
                    org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) drawable2;
                    this.f28571k0.addOnAttachStateChangeListener(new bi.m6(r6Var, 5));
                    r6Var.a(this.f28571k0);
                }
            } else {
                int i27 = this.U;
                if (i27 != 0) {
                    imageView.setImageResource(i27);
                } else {
                    imageView.setAutoRepeat(this.S0);
                    ch0 ch0Var = this.f28571k0;
                    int i28 = this.X;
                    int i29 = this.Y;
                    ch0Var.f(i28, i29, i29, null);
                    if (this.Z != null) {
                        zg0 animatedDrawable = this.f28571k0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f40973s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f28555c1 = this.f28554c0;
                    }
                    this.f28571k0.d();
                }
            }
            this.f28571k0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.f28571k0.setBackground(new t1(this.f28571k0, this.f28554c0, org.telegram.messenger.g0.L(52.0f) + this.Y, this.f28556d0, this.f28559e0));
                this.f28548a0 = 92;
            } else if (this.f28556d0 >= 0) {
                r6.C(this.f28571k0, k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f28554c0), r6.N(this.f28556d0), this.f28559e0);
            } else {
                this.f28571k0.setBackground(k6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f28554c0));
            }
            if (this.W) {
                this.f28571k0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.f28571k0.setTranslationY(0.0f);
            }
            this.f28571k0.setPadding(0, 0, 0, 0);
            this.f28549a1.addView(this.f28571k0, ha.t(-1, this.f28548a0, 51, 0, 0, 0, 0));
        } else {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.f28549a1.addView(this.V, ha.t(-1, this.f28548a0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f28580s = frameLayout2;
            this.f28549a1.addView(frameLayout2, ha.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            xh.l lVar = new xh.l(getContext(), null, false);
            this.f28561f = lVar;
            qs.i(lVar);
            xh.l lVar2 = this.f28561f;
            lVar2.f58749s = 3;
            lVar2.setText(this.R);
            xh.l lVar3 = this.f28561f;
            int f17 = f(k6.f27956j5);
            this.f28560e1 = f17;
            lVar3.setTextColor(f17);
            this.f28561f.setTextSize(1, 20.0f);
            this.f28561f.setTypeface(org.telegram.messenger.g0.o());
            xh.l lVar4 = this.f28561f;
            if (this.W) {
                i23 = 1;
            } else if (hd.f22871a0) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            lVar4.setGravity(i23 | 48);
            FrameLayout frameLayout3 = this.f28580s;
            xh.l lVar5 = this.f28561f;
            boolean z12 = this.W;
            if (z12) {
                i24 = 1;
            } else if (hd.f22871a0) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i30 = i24 | 48;
            if (z12) {
                f16 = 4.0f;
            } else {
                if (this.S != null) {
                    i25 = 2;
                } else if (this.P != null) {
                    i25 = 14;
                } else {
                    i25 = 10;
                }
                f16 = i25;
            }
            frameLayout3.addView(lVar5, ha.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f16));
        }
        String str = this.S;
        s1 s1Var = this.f28569i1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            r6.V(this.h, k6.J5, s1Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (hd.f22871a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20 | 48);
            q1 q1Var3 = this.f28549a1;
            TextView textView3 = this.h;
            if (hd.f22871a0) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i31 = i21 | 48;
            f11 = 20.0f;
            if (this.P != null) {
                i22 = 14;
            } else {
                i22 = 10;
            }
            q1Var3.addView(textView3, ha.t(-2, -2, i31, 24, 0, 24, i22));
        } else {
            f11 = 20.0f;
        }
        if (i26 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.D;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(2131231237).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(2131231238).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            m1 m1Var = new m1(this, getContext(), 0);
            this.f28585w = m1Var;
            m1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.z3(this.f28585w, f(k6.A5));
            this.f28549a1.addView(this.f28585w, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f28587x = linearLayout;
            linearLayout.setOrientation(1);
            f12 = 4.0f;
            this.f28585w.addView(this.f28587x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f12 = 4.0f;
        }
        lt ltVar = new lt(getContext());
        this.f28573n = ltVar;
        qs.i(ltVar);
        lt ltVar2 = this.f28573n;
        if (this.W) {
            i7 = k6.f28240y6;
        } else {
            i7 = k6.f27956j5;
        }
        int f18 = f(i7);
        this.f28563f1 = f18;
        ltVar2.setTextColor(f18);
        this.f28573n.setTextSize(1, f10);
        this.f28573n.setMovementMethod(new org.telegram.messenger.c0(false));
        r6.H(this.f28573n, k6.f27976k5, s1Var);
        if (!this.f28566h0) {
            this.f28573n.setClickable(false);
            this.f28573n.setEnabled(false);
        }
        lt ltVar3 = this.f28573n;
        if (this.W) {
            i10 = 1;
        } else if (hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        ltVar3.setGravity(i10 | 48);
        if (i26 == 2) {
            q1 q1Var4 = this.f28549a1;
            lt ltVar4 = this.f28573n;
            if (hd.f22871a0) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i32 = i16 | 48;
            if (this.R == null) {
                i17 = 19;
            } else {
                i17 = 0;
            }
            q1Var4.addView(ltVar4, ha.t(-2, -2, i32, 24, i17, 24, 20));
            h70 h70Var = new h70(getContext());
            this.f28583u0 = h70Var;
            h70Var.a(false, this.f28564g0 / 100.0f);
            this.f28583u0.setProgressColor(f(k6.F5));
            this.f28583u0.setBackColor(f(k6.G5));
            this.f28549a1.addView(this.f28583u0, ha.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f28584v0 = textView4;
            textView4.setTypeface(org.telegram.messenger.g0.o());
            TextView textView5 = this.f28584v0;
            if (hd.f22871a0) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            r6.V(this.f28584v0, k6.f28087q5, s1Var);
            this.f28584v0.setTextSize(1, 14.0f);
            q1 q1Var5 = this.f28549a1;
            TextView textView6 = this.f28584v0;
            if (hd.f22871a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            q1Var5.addView(textView6, ha.t(-2, -2, i19 | 48, 23, 4, 23, 24));
            this.f28584v0.setText(String.format("%d%%", Integer.valueOf(this.f28564g0)));
        } else if (i26 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f28578r = new FrameLayout(getContext());
            int i33 = k6.M5;
            this.f28552b1 = i33;
            this.U0 = f(i33);
            if (!this.T0) {
                this.f28578r.setBackgroundDrawable(k6.d0(org.telegram.messenger.g0.L(18.0f), this.U0));
            }
            this.f28549a1.addView(this.f28578r, ha.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(k6.N5));
            this.f28578r.addView(radialProgressView, ha.e(86, 86, 17));
        } else {
            lt ltVar5 = this.d;
            if (ltVar5 != null) {
                this.f28587x.addView(ltVar5, ha.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f28587x;
            lt ltVar6 = this.f28573n;
            if (this.W) {
                i11 = 1;
            } else if (hd.f22871a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (this.f28550b == null && this.P == null) {
                i12 = 0;
            } else {
                i12 = this.G;
            }
            linearLayout2.addView(ltVar6, ha.t(-2, -2, i34, 24, 0, 24, i12));
            TextView textView7 = this.f28553c;
            if (textView7 != null) {
                this.f28587x.addView(textView7, ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f28573n.setText(this.T);
            this.f28573n.setVisibility(0);
        } else {
            this.f28573n.setVisibility(8);
        }
        if (this.P != null) {
            int i35 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i35 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i35] != null) {
                    o1 o1Var = new o1(getContext(), f6Var);
                    CharSequence charSequence = this.P[i35];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i15 = iArr[i35];
                    } else {
                        i15 = 0;
                    }
                    o1Var.a(i15, charSequence);
                    o1Var.setTag(Integer.valueOf(i35));
                    this.N0.add(o1Var);
                    this.f28587x.addView(o1Var, ha.o(-1, 50));
                    o1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final u1 f27709b;

                        {
                            this.f27709b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f27709b.dismiss();
                                    return;
                                case 1:
                                    u1 u1Var = this.f27709b;
                                    new uc(u1Var.getContext(), u1Var.R0).show();
                                    return;
                                default:
                                    u1 u1Var2 = this.f27709b;
                                    DialogInterface.OnClickListener onClickListener = u1Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(u1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    u1Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i35++;
            }
        }
        View view2 = this.f28550b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f28550b.getParent()).removeView(this.f28550b);
            }
            this.f28587x.addView(this.f28550b, ha.o(-1, this.f28558e));
        }
        if (objArr != null) {
            if (!this.I0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.f28572l0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f28574n0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.f28574n0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f28576p0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str2 = this.f28576p0;
                    i14 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f28579r0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.f28579r0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (i14 > org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (this.J0 && this.f28572l0 != null && this.f28574n0 != null && this.f28576p0 != null && this.f28579r0 != null) {
                        this.K0 = true;
                    } else {
                        this.I0 = true;
                    }
                }
            }
            if (this.I0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f28582t0 = linearLayout3;
            } else {
                this.f28582t0 = new bi.e5(9, getContext(), this);
            }
            if (this.f28553c != null) {
                this.f28582t0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f12));
                this.f28582t0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.f28582t0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            q1 q1Var6 = this.f28549a1;
            ViewGroup viewGroup2 = this.f28582t0;
            if (this.K0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            q1Var6.addView(viewGroup2, ha.o(-1, i13));
            if (this.W) {
                this.f28582t0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.f28572l0 != null) {
                f13 = 64.0f;
                n1 n1Var = new n1(getContext(), 0);
                n1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                n1Var.setTag(-1);
                n1Var.setTextSize(1, 16.0f);
                r6.V(n1Var, this.I, s1Var);
                n1Var.setGravity(17);
                n1Var.setTypeface(org.telegram.messenger.g0.o());
                n1Var.setText(this.f28572l0);
                f14 = 6.0f;
                n1Var.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.I0) {
                    f15 = 12.0f;
                    this.f28582t0.addView(n1Var, ha.r(-1, 40, 7));
                } else {
                    f15 = 12.0f;
                    this.f28582t0.addView(n1Var, ha.e(-2, 40, 53));
                }
                n1Var.setOnClickListener(new bi.r(27, this, n1Var));
            } else {
                f13 = 64.0f;
                f14 = 6.0f;
                f15 = 12.0f;
            }
            if (this.f28574n0 != null) {
                n1 n1Var2 = new n1(getContext(), 1);
                n1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var2.setTag(-2);
                n1Var2.setTextSize(1, 16.0f);
                r6.V(n1Var2, this.I, s1Var);
                n1Var2.setGravity(17);
                n1Var2.setTypeface(org.telegram.messenger.g0.o());
                n1Var2.setEllipsize(TextUtils.TruncateAt.END);
                n1Var2.setSingleLine(true);
                n1Var2.setText(this.f28574n0.toString());
                n1Var2.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var2.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.f28582t0.addView(n1Var2, 0, ha.r(-1, 40, 7));
                } else {
                    this.f28582t0.addView(n1Var2, ha.e(-2, 40, 53));
                }
                n1Var2.setOnClickListener(new bi.r(28, this, n1Var2));
            }
            if (this.f28579r0 != null) {
                n1 n1Var3 = new n1(getContext(), 2);
                n1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var3.setTag(-3);
                n1Var3.setTextSize(1, 16.0f);
                r6.V(n1Var3, this.I, s1Var);
                n1Var3.setGravity(17);
                n1Var3.setTypeface(org.telegram.messenger.g0.o());
                n1Var3.setEllipsize(TextUtils.TruncateAt.END);
                n1Var3.setSingleLine(true);
                n1Var3.setText(this.f28579r0.toString());
                n1Var3.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var3.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.f28582t0.addView(n1Var3, 1, ha.r(-1, 40, 7));
                } else {
                    this.f28582t0.addView(n1Var3, ha.e(-2, 40, 51));
                }
                n1Var3.setOnClickListener(new bi.r(29, this, n1Var3));
            }
            if (this.f28576p0 != null) {
                n1 n1Var4 = new n1(getContext(), 3);
                n1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                n1Var4.setTag(-4);
                n1Var4.setTextSize(1, 16.0f);
                r6.V(n1Var4, this.I, s1Var);
                n1Var4.setGravity(17);
                n1Var4.setTypeface(org.telegram.messenger.g0.o());
                n1Var4.setEllipsize(TextUtils.TruncateAt.END);
                n1Var4.setSingleLine(true);
                n1Var4.setText(this.f28576p0.toString());
                n1Var4.setBackground(k6.J0(org.telegram.messenger.g0.L(f11), f(this.I)));
                n1Var4.setPadding(org.telegram.messenger.g0.L(f15), 0, org.telegram.messenger.g0.L(f15), 0);
                if (this.I0) {
                    this.f28582t0.addView(n1Var4, 0, ha.r(-1, 40, 7));
                } else {
                    this.f28582t0.addView(n1Var4, ha.e(-2, 40, 53));
                }
                n1Var4.setOnClickListener(new l1(0, this, n1Var4));
            }
            if (this.I0) {
                for (int i36 = 1; i36 < this.f28582t0.getChildCount(); i36++) {
                    ((ViewGroup.MarginLayoutParams) this.f28582t0.getChildAt(i36).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f14);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.X0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.L = org.telegram.messenger.g0.f22537q.x;
            this.f28549a1.getLayoutParams().width = e();
            window.setWindowAnimations(2131755178);
        } else if (i26 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.P0) {
                layoutParams3.dimAmount = this.Q0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.L = org.telegram.messenger.g0.f22537q.x;
            layoutParams3.width = e();
        }
        View view3 = this.f28550b;
        if (view3 != null && this.f28590y0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.T0) {
            org.telegram.messenger.g0.l2(new ii.c(this, 14), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final vf.b h(int i7, boolean z9, boolean z10) {
        View d = d(i7);
        if (z10) {
            this.f28570j0 = false;
        }
        return new vf.b(new j1(0, d), new u7(this, d, z9, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            r6.V(textView, k6.f28089q7, this.f28569i1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.f28585w.invalidate();
        this.f28587x.invalidate();
    }

    public final void j(int i7) {
        this.f28552b1 = -1;
        this.U0 = i7;
        Drawable drawable = this.f28591z0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f28568i0 = false;
    }

    public final void l(boolean z9) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.H0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void m(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.N0;
            if (i7 < arrayList.size()) {
                o1 o1Var = (o1) arrayList.get(i7);
                o1Var.f28328a.setTextColor(i10);
                o1Var.f28329b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.T = str;
        if (this.f28573n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f28573n.setText(this.T);
                this.f28573n.setVisibility(0);
                return;
            }
            this.f28573n.setVisibility(8);
        }
    }

    public final void o(int i7) {
        this.f28564g0 = i7;
        h70 h70Var = this.f28583u0;
        if (h70Var != null) {
            h70Var.a(true, i7 / 100.0f);
            this.f28584v0.setText(String.format("%d%%", Integer.valueOf(this.f28564g0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        o60 o60Var = this.f28586w0;
        if (o60Var != null) {
            o60Var.g(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        qs.e().c(this, qs.f25001i4);
    }

    public final void p(int i7) {
        this.f28565g1 = true;
        xh.l lVar = this.f28561f;
        if (lVar != null) {
            lVar.setTextColor(i7);
        }
        lt ltVar = this.f28573n;
        if (ltVar != null) {
            ltVar.setTextColor(i7);
        }
    }

    public final void q() {
        if (this.f28568i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.R0);
            String M0 = hd.M0(2131744833, null);
            u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131744834, null);
            alertDialog$Builder.k(hd.M0(2131743214, null), null);
            alertDialog$Builder.h(hd.M0(2131744842, null), new l2.y(this, 27));
            alertDialog$Builder.j(new eb(this, 9));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j3) {
        bi.r4 r4Var = this.M0;
        org.telegram.messenger.g0.r(r4Var);
        org.telegram.messenger.g0.i3(r4Var, j3);
    }

    public final void s() {
        ch0 ch0Var;
        int w02;
        if (this.f28556d0 >= 0 && this.Z != null && (ch0Var = this.f28571k0) != null && ch0Var.getAnimatedDrawable() != null && (w02 = k6.w0(this.f28556d0, this.f28559e0)) != this.f28555c1) {
            zg0 animatedDrawable = this.f28571k0.getAnimatedDrawable();
            for (Map.Entry entry : this.Z.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f28555c1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f28555c1 = w02;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        m1 m1Var = this.f28585w;
        if (m1Var != null) {
            m1Var.postDelayed(runnable, j3);
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
        xh.l lVar = this.f28561f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        this.f28567h1 = false;
        super.show();
        FrameLayout frameLayout = this.f28578r;
        if (frameLayout != null && this.f28562f0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f28578r.setScaleY(0.0f);
            this.f28578r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.W0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        m1 m1Var = this.f28585w;
        if (m1Var != null) {
            m1Var.removeCallbacks(runnable);
        }
    }

    public u1(int i7, Context context, f6 f6Var) {
        super(context, 2131755352);
        this.f28547a = -1;
        this.f28558e = -2;
        this.D = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = k6.H5;
        this.f28548a0 = 132;
        this.f28556d0 = -1;
        this.f28566h0 = true;
        this.f28568i0 = true;
        this.f28570j0 = true;
        this.f28588x0 = new int[2];
        this.f28590y0 = true;
        this.L0 = new bi.r4(this, 2);
        this.M0 = new bi.r4(this, 3);
        this.N0 = new ArrayList();
        this.P0 = true;
        this.Q0 = 0.5f;
        this.S0 = true;
        this.f28552b1 = -1;
        this.f28569i1 = new s1(this, 0);
        this.R0 = f6Var;
        this.f28562f0 = i7;
        int i10 = k6.f27921h5;
        this.f28552b1 = i10;
        int f10 = f(i10);
        this.U0 = f10;
        boolean z9 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.T0 = iz.o() >= 2 && rc.e(256) && z9;
        Rect rect = new Rect();
        this.A0 = rect;
        if (i7 != 3 || this.T0) {
            Drawable h = jg.g.h(context, 2131232567);
            this.f28591z0 = h;
            this.B0 = i7 == 3 ? 0.55f : z9 ? 0.8f : 0.985f;
            h.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
            h.getPadding(rect);
        }
        this.H = i7 == 3;
    }
}
