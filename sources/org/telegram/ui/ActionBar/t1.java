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
import c8.ma;
import c8.ra;
import di.gb;
import di.u9;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zt;
import org.telegram.ui.p60;
public class t1 extends Dialog implements Drawable.Callback, gs {
    public static final int f30009k1 = 0;
    public final Drawable A0;
    public final Rect B0;
    public final float C0;
    public Bitmap D0;
    public final BitmapDrawable[] E;
    public Matrix E0;
    public final boolean[] F;
    public BitmapShader F0;
    public final AnimatorSet[] G;
    public Paint G0;
    public int H;
    public Paint H0;
    public boolean I;
    public boolean I0;
    public int J;
    public boolean J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public t1 L;
    public boolean L0;
    public int M;
    public final di.u3 M0;
    public DialogInterface.OnClickListener N;
    public final di.u3 N0;
    public DialogInterface.OnDismissListener O;
    public final ArrayList O0;
    public y10 P;
    public float P0;
    public CharSequence[] Q;
    public boolean Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public final h6 S0;
    public String T;
    public boolean T0;
    public CharSequence U;
    public boolean U0;
    public int V;
    public int V0;
    public View W;
    public int W0;
    public boolean X;
    public long X0;
    public int Y;
    public boolean Y0;
    public int Z;
    public FrameLayout Z0;
    public int f30010a;
    public Map f30011a0;
    public di.b f30012a1;
    public View f30013b;
    public int f30014b0;
    public p1 f30015b1;
    public TextView f30016c;
    public Drawable f30017c0;
    public int f30018c1;
    public zt d;
    public int f30019d0;
    public int f30020d1;
    public int f30021e;
    public int f30022e0;
    public int f30023e1;
    public xh.l f30024f;
    public h6 f30025f0;
    public int f30026f1;
    public final int f30027g0;
    public int f30028g1;
    public TextView h;
    public int f30029h0;
    public boolean f30030h1;
    public boolean f30031i0;
    public boolean f30032i1;
    public boolean f30033j0;
    public final r1 f30034j1;
    public boolean f30035k0;
    public rh0 f30036l0;
    public CharSequence m0;
    public zt f30037n;
    public q1 f30038n0;
    public CharSequence f30039o0;
    public q1 f30040p0;
    public String f30041q0;
    public FrameLayout f30042r;
    public oi.c4 f30043r0;
    public FrameLayout f30044s;
    public CharSequence f30045s0;
    public q1 f30046t0;
    public ViewGroup f30047u0;
    public x70 f30048v0;
    public l1 f30049w;
    public TextView f30050w0;
    public LinearLayout f30051x;
    public p60 f30052x0;
    public o1 f30053y;
    public final int[] f30054y0;
    public boolean f30055z0;

    public t1(Context context) {
        this(3, context, null);
    }

    public static void a(t1 t1Var, int i7, boolean z10) {
        int i10;
        boolean[] zArr = t1Var.F;
        AnimatorSet[] animatorSetArr = t1Var.G;
        if ((z10 && !zArr[i7]) || (!z10 && zArr[i7])) {
            zArr[i7] = z10;
            AnimatorSet animatorSet = animatorSetArr[i7];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i7] = animatorSet2;
            BitmapDrawable bitmapDrawable = t1Var.E[i7];
            if (bitmapDrawable != null) {
                if (z10) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i10));
            }
            animatorSetArr[i7].setDuration(150L);
            animatorSetArr[i7].addListener(new ki.e2(t1Var, i7, 4));
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
        long currentTimeMillis = System.currentTimeMillis() - this.X0;
        if (currentTimeMillis < j3) {
            org.telegram.messenger.g0.h3(new di.u3(this, 2), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i7) {
        ViewGroup viewGroup = this.f30047u0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i7));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        zt ztVar;
        if (i7 == ls.f25342l4 && (ztVar = this.f30037n) != null) {
            ztVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        y10 y10Var = this.P;
        if (y10Var != null) {
            this.P = null;
            y10Var.a(new di.u3(this, 2));
        } else if (!this.f30032i1) {
            this.f30032i1 = true;
            ls.e().n(this, ls.f25342l4);
            DialogInterface.OnDismissListener onDismissListener = this.O;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            t1 t1Var = this.L;
            if (t1Var != null) {
                t1Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            org.telegram.messenger.g0.r(this.N0);
            if (this.F0 != null && (bitmap = this.D0) != null) {
                bitmap.recycle();
                this.F0 = null;
                this.G0 = null;
                this.D0 = null;
            }
        }
    }

    public final int e() {
        int L;
        int L2 = (org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(48.0f)) - (this.W0 * 2);
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
        Rect rect = this.B0;
        return min + rect.left + rect.right;
    }

    public int f(int i7) {
        return m6.w0(i7, this.S0);
    }

    public final ViewGroup g(boolean z10) {
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
        p1 p1Var = new p1(this, getContext());
        this.f30015b1 = p1Var;
        p1Var.setOrientation(1);
        boolean z11 = this.U0;
        int i26 = this.f30027g0;
        if ((z11 || i26 == 3) && i26 != 2) {
            this.f30015b1.setBackground(null);
            this.f30015b1.setPadding(0, 0, 0, 0);
            if (this.U0) {
                this.f30015b1.setWillNotDraw(false);
            }
        } else {
            this.f30015b1.setBackground(null);
            this.f30015b1.setPadding(0, 0, 0, 0);
            this.f30015b1.setBackground(this.A0);
            p1 p1Var2 = this.f30015b1;
            bg.q0 q0Var = bg.u0.f3362a;
            p1Var2.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(20.0f)));
            this.f30015b1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.f30015b1;
        boolean z12 = this.Y0;
        h6 h6Var = this.S0;
        if (z12) {
            if (this.Z0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Z0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final t1 f29182b;

                    {
                        this.f29182b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f29182b.dismiss();
                                return;
                            case 1:
                                t1 t1Var = this.f29182b;
                                new gb(t1Var.getContext(), t1Var.S0).show();
                                return;
                            default:
                                t1 t1Var2 = this.f29182b;
                                DialogInterface.OnClickListener onClickListener = t1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(t1Var2, ((Integer) view.getTag()).intValue());
                                }
                                t1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.f30012a1 == null) {
                di.b bVar = new di.b(k10.f24968t0, getContext(), h6Var);
                this.f30012a1 = bVar;
                ra.a(bVar);
                this.f30012a1.setOnClickListener(new View.OnClickListener(this) {
                    public final t1 f29182b;

                    {
                        this.f29182b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f29182b.dismiss();
                                return;
                            case 1:
                                t1 t1Var = this.f29182b;
                                new gb(t1Var.getContext(), t1Var.S0).show();
                                return;
                            default:
                                t1 t1Var2 = this.f29182b;
                                DialogInterface.OnClickListener onClickListener = t1Var2.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(t1Var2, ((Integer) view.getTag()).intValue());
                                }
                                t1Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            org.telegram.messenger.g0.E2(this.f30015b1);
            org.telegram.messenger.g0.E2(this.f30012a1);
            this.Z0.addView(this.f30015b1, ma.e(-2, -2, 17));
            this.Z0.addView(this.f30012a1, ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Z0;
        }
        if (z10) {
            if (this.Y0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f30010a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.m0 == null && this.f30039o0 == null && this.f30041q0 == null && this.f30045s0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.V != 0 || this.Y != 0 || this.f30017c0 != null) {
            f10 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.f30036l0 = imageView;
            Drawable drawable = this.f30017c0;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                Drawable drawable2 = this.f30017c0;
                if (drawable2 instanceof w6) {
                    w6 w6Var = (w6) drawable2;
                    this.f30036l0.addOnAttachStateChangeListener(new bi.v2(w6Var, 9));
                    w6Var.a(this.f30036l0);
                }
            } else {
                int i27 = this.V;
                if (i27 != 0) {
                    imageView.setImageResource(i27);
                } else {
                    imageView.setAutoRepeat(this.T0);
                    rh0 rh0Var = this.f30036l0;
                    int i28 = this.Y;
                    int i29 = this.Z;
                    rh0Var.f(i28, i29, i29, null);
                    if (this.f30011a0 != null) {
                        oh0 animatedDrawable = this.f30036l0.getAnimatedDrawable();
                        for (Map.Entry entry : this.f30011a0.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f38228s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f30020d1 = this.f30019d0;
                    }
                    this.f30036l0.d();
                }
            }
            this.f30036l0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.f30036l0.setBackground(new s1(this.f30036l0, this.f30019d0, org.telegram.messenger.g0.L(52.0f) + this.Z, this.f30022e0, this.f30025f0));
                this.f30014b0 = 92;
            } else if (this.f30022e0 >= 0) {
                t6.B(this.f30036l0, m6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f30019d0), t6.M(this.f30022e0), this.f30025f0);
            } else {
                this.f30036l0.setBackground(m6.e0(org.telegram.messenger.g0.L(10.0f), 0, this.f30019d0));
            }
            if (this.X) {
                this.f30036l0.setTranslationY(org.telegram.messenger.g0.L(16.0f));
            } else {
                this.f30036l0.setTranslationY(0.0f);
            }
            this.f30036l0.setPadding(0, 0, 0, 0);
            this.f30015b1.addView(this.f30036l0, ma.t(-1, this.f30014b0, 51, 0, 0, 0, 0));
        } else {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f10 = 16.0f;
                this.f30015b1.addView(this.W, ma.t(-1, this.f30014b0, 51, 0, 0, 0, 0));
            } else {
                f10 = 16.0f;
            }
        }
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f30044s = frameLayout2;
            f11 = 4.0f;
            this.f30015b1.addView(frameLayout2, ma.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            xh.l lVar = new xh.l(getContext(), null, false);
            this.f30024f = lVar;
            ls.i(lVar);
            xh.l lVar2 = this.f30024f;
            lVar2.f60646s = 3;
            lVar2.setText(this.S);
            xh.l lVar3 = this.f30024f;
            int f15 = f(m6.f29489j5);
            this.f30026f1 = f15;
            lVar3.setTextColor(f15);
            this.f30024f.setTextSize(1, 20.0f);
            this.f30024f.setTypeface(org.telegram.messenger.g0.o());
            xh.l lVar4 = this.f30024f;
            if (this.X) {
                i23 = 1;
            } else if (hd.f24444a0) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            lVar4.setGravity(i23 | 48);
            FrameLayout frameLayout3 = this.f30044s;
            xh.l lVar5 = this.f30024f;
            boolean z13 = this.X;
            if (z13) {
                i24 = 1;
            } else if (hd.f24444a0) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i30 = i24 | 48;
            if (z13) {
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
            frameLayout3.addView(lVar5, ma.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f14));
        } else {
            f11 = 4.0f;
        }
        String str = this.T;
        r1 r1Var = this.f30034j1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            t6.U(this.h, m6.J5, r1Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (hd.f24444a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20 | 48);
            p1 p1Var3 = this.f30015b1;
            TextView textView3 = this.h;
            if (hd.f24444a0) {
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
            p1Var3.addView(textView3, ma.t(-2, -2, i31, 24, 0, 24, i22));
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
            l1 l1Var = new l1(this, getContext(), 0);
            this.f30049w = l1Var;
            l1Var.setVerticalScrollBarEnabled(false);
            org.telegram.messenger.g0.x3(this.f30049w, f(m6.A5));
            this.f30015b1.addView(this.f30049w, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f30051x = linearLayout;
            linearLayout.setOrientation(1);
            this.f30049w.addView(this.f30051x, new FrameLayout.LayoutParams(-1, -2));
        }
        zt ztVar = new zt(getContext());
        this.f30037n = ztVar;
        ls.i(ztVar);
        zt ztVar2 = this.f30037n;
        if (this.X) {
            i7 = m6.f29773y6;
        } else {
            i7 = m6.f29489j5;
        }
        int f16 = f(i7);
        this.f30028g1 = f16;
        ztVar2.setTextColor(f16);
        this.f30037n.setTextSize(1, f10);
        this.f30037n.setMovementMethod(new org.telegram.messenger.c0(false));
        t6.G(this.f30037n, m6.f29509k5, r1Var);
        if (!this.f30031i0) {
            this.f30037n.setClickable(false);
            this.f30037n.setEnabled(false);
        }
        zt ztVar3 = this.f30037n;
        if (this.X) {
            i10 = 1;
        } else if (hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        ztVar3.setGravity(i10 | 48);
        if (i26 == 2) {
            p1 p1Var4 = this.f30015b1;
            zt ztVar4 = this.f30037n;
            if (hd.f24444a0) {
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
            p1Var4.addView(ztVar4, ma.t(-2, -2, i32, 24, i17, 24, 20));
            x70 x70Var = new x70(getContext());
            this.f30048v0 = x70Var;
            x70Var.a(false, this.f30029h0 / 100.0f);
            this.f30048v0.setProgressColor(f(m6.F5));
            this.f30048v0.setBackColor(f(m6.G5));
            this.f30015b1.addView(this.f30048v0, ma.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f30050w0 = textView4;
            textView4.setTypeface(org.telegram.messenger.g0.o());
            TextView textView5 = this.f30050w0;
            if (hd.f24444a0) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            t6.U(this.f30050w0, m6.f29620q5, r1Var);
            this.f30050w0.setTextSize(1, 14.0f);
            p1 p1Var5 = this.f30015b1;
            TextView textView6 = this.f30050w0;
            if (hd.f24444a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            p1Var5.addView(textView6, ma.t(-2, -2, i19 | 48, 23, 4, 23, 24));
            this.f30050w0.setText(String.format("%d%%", Integer.valueOf(this.f30029h0)));
        } else if (i26 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f30042r = new FrameLayout(getContext());
            int i33 = m6.M5;
            this.f30018c1 = i33;
            this.V0 = f(i33);
            if (!this.U0) {
                this.f30042r.setBackgroundDrawable(m6.d0(org.telegram.messenger.g0.L(18.0f), this.V0));
            }
            this.f30015b1.addView(this.f30042r, ma.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), h6Var);
            radialProgressView.setSize(org.telegram.messenger.g0.L(32.0f));
            radialProgressView.setProgressColor(f(m6.N5));
            this.f30042r.addView(radialProgressView, ma.e(86, 86, 17));
        } else {
            zt ztVar5 = this.d;
            if (ztVar5 != null) {
                this.f30051x.addView(ztVar5, ma.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f30051x;
            zt ztVar6 = this.f30037n;
            if (this.X) {
                i11 = 1;
            } else if (hd.f24444a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i34 = i11 | 48;
            if (this.f30013b == null && this.Q == null) {
                i12 = 0;
            } else {
                i12 = this.H;
            }
            linearLayout2.addView(ztVar6, ma.t(-2, -2, i34, 24, 0, 24, i12));
            TextView textView7 = this.f30016c;
            if (textView7 != null) {
                this.f30051x.addView(textView7, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.U)) {
            this.f30037n.setText(this.U);
            this.f30037n.setVisibility(0);
        } else {
            this.f30037n.setVisibility(8);
        }
        if (this.Q != null) {
            int i35 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i35 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i35] != null) {
                    n1 n1Var = new n1(getContext(), h6Var);
                    CharSequence charSequence = this.Q[i35];
                    int[] iArr = this.R;
                    if (iArr != null) {
                        i15 = iArr[i35];
                    } else {
                        i15 = 0;
                    }
                    n1Var.a(i15, charSequence);
                    n1Var.setTag(Integer.valueOf(i35));
                    this.O0.add(n1Var);
                    this.f30051x.addView(n1Var, ma.o(-1, 50));
                    n1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final t1 f29182b;

                        {
                            this.f29182b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f29182b.dismiss();
                                    return;
                                case 1:
                                    t1 t1Var = this.f29182b;
                                    new gb(t1Var.getContext(), t1Var.S0).show();
                                    return;
                                default:
                                    t1 t1Var2 = this.f29182b;
                                    DialogInterface.OnClickListener onClickListener = t1Var2.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(t1Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    t1Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i35++;
            }
        }
        View view2 = this.f30013b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f30013b.getParent()).removeView(this.f30013b);
            }
            this.f30051x.addView(this.f30013b, ma.o(-1, this.f30021e));
        }
        if (objArr != null) {
            if (!this.J0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                CharSequence charSequence2 = this.m0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + org.telegram.messenger.g0.L(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f30039o0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence3 = this.f30039o0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f30041q0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    String str2 = this.f30041q0;
                    i14 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (this.f30045s0 != null) {
                    if (i14 > 0) {
                        i14 += org.telegram.messenger.g0.L(8.0f);
                    }
                    CharSequence charSequence4 = this.f30045s0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + org.telegram.messenger.g0.L(24.0f) + i14);
                }
                if (i14 > org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(64.0f)) {
                    if (this.K0 && this.m0 != null && this.f30039o0 != null && this.f30041q0 != null && this.f30045s0 != null) {
                        this.L0 = true;
                    } else {
                        this.J0 = true;
                    }
                }
            }
            if (this.J0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f30047u0 = linearLayout3;
            } else {
                this.f30047u0 = new bi.e3(10, getContext(), this);
            }
            if (this.f30016c != null) {
                this.f30047u0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(f11));
                this.f30047u0.setTranslationY(-org.telegram.messenger.g0.L(6.0f));
            } else {
                this.f30047u0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            p1 p1Var6 = this.f30015b1;
            ViewGroup viewGroup2 = this.f30047u0;
            if (this.L0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            p1Var6.addView(viewGroup2, ma.o(-1, i13));
            if (this.X) {
                this.f30047u0.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            }
            if (this.m0 != null) {
                m1 m1Var = new m1(getContext(), 0);
                m1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
                m1Var.setTag(-1);
                m1Var.setTextSize(1, 16.0f);
                t6.U(m1Var, this.J, r1Var);
                m1Var.setGravity(17);
                m1Var.setTypeface(org.telegram.messenger.g0.o());
                m1Var.setText(this.m0);
                m1Var.setBackground(m6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                m1Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    f13 = 64.0f;
                    this.f30047u0.addView(m1Var, ma.r(-1, 40, 7));
                } else {
                    f13 = 64.0f;
                    this.f30047u0.addView(m1Var, ma.e(-2, 40, 53));
                }
                m1Var.setOnClickListener(new c0(this, m1Var, 2));
            } else {
                f13 = 64.0f;
            }
            if (this.f30039o0 != null) {
                m1 m1Var2 = new m1(getContext(), 1);
                m1Var2.setMinWidth(org.telegram.messenger.g0.L(f13));
                m1Var2.setTag(-2);
                m1Var2.setTextSize(1, 16.0f);
                t6.U(m1Var2, this.J, r1Var);
                m1Var2.setGravity(17);
                m1Var2.setTypeface(org.telegram.messenger.g0.o());
                m1Var2.setEllipsize(TextUtils.TruncateAt.END);
                m1Var2.setSingleLine(true);
                m1Var2.setText(this.f30039o0.toString());
                m1Var2.setBackground(m6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                m1Var2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.f30047u0.addView(m1Var2, 0, ma.r(-1, 40, 7));
                } else {
                    this.f30047u0.addView(m1Var2, ma.e(-2, 40, 53));
                }
                m1Var2.setOnClickListener(new c0(this, m1Var2, 3));
            }
            if (this.f30045s0 != null) {
                m1 m1Var3 = new m1(getContext(), 2);
                m1Var3.setMinWidth(org.telegram.messenger.g0.L(f13));
                m1Var3.setTag(-3);
                m1Var3.setTextSize(1, 16.0f);
                t6.U(m1Var3, this.J, r1Var);
                m1Var3.setGravity(17);
                m1Var3.setTypeface(org.telegram.messenger.g0.o());
                m1Var3.setEllipsize(TextUtils.TruncateAt.END);
                m1Var3.setSingleLine(true);
                m1Var3.setText(this.f30045s0.toString());
                m1Var3.setBackground(m6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                m1Var3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.f30047u0.addView(m1Var3, 1, ma.r(-1, 40, 7));
                } else {
                    this.f30047u0.addView(m1Var3, ma.e(-2, 40, 51));
                }
                m1Var3.setOnClickListener(new c0(this, m1Var3, 4));
            }
            if (this.f30041q0 != null) {
                m1 m1Var4 = new m1(getContext(), 3);
                m1Var4.setMinWidth(org.telegram.messenger.g0.L(f13));
                m1Var4.setTag(-4);
                m1Var4.setTextSize(1, 16.0f);
                t6.U(m1Var4, this.J, r1Var);
                m1Var4.setGravity(17);
                m1Var4.setTypeface(org.telegram.messenger.g0.o());
                m1Var4.setEllipsize(TextUtils.TruncateAt.END);
                m1Var4.setSingleLine(true);
                m1Var4.setText(this.f30041q0.toString());
                m1Var4.setBackground(m6.J0(org.telegram.messenger.g0.L(f12), f(this.J)));
                m1Var4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                if (this.J0) {
                    this.f30047u0.addView(m1Var4, 0, ma.r(-1, 40, 7));
                } else {
                    this.f30047u0.addView(m1Var4, ma.e(-2, 40, 53));
                }
                m1Var4.setOnClickListener(new c0(this, m1Var4, 5));
            }
            if (this.J0) {
                for (int i36 = 1; i36 < this.f30047u0.getChildCount(); i36++) {
                    ((ViewGroup.MarginLayoutParams) this.f30047u0.getChildAt(i36).getLayoutParams()).topMargin = org.telegram.messenger.g0.L(6.0f);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Y0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = org.telegram.messenger.g0.f24046q.x;
            this.f30015b1.getLayoutParams().width = e();
            window.setWindowAnimations(2131755178);
        } else if (i26 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.Q0) {
                layoutParams3.dimAmount = this.R0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            this.M = org.telegram.messenger.g0.f24046q.x;
            layoutParams3.width = e();
        }
        View view3 = this.f30013b;
        if (view3 != null && this.f30055z0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.U0) {
            org.telegram.messenger.g0.l2(new hi.s6(this, 20), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final vf.b h(int i7, boolean z10, boolean z11) {
        View d = d(i7);
        if (z11) {
            this.f30035k0 = false;
        }
        return new vf.b(new j1(0, d), new di.p6(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            t6.U(textView, m6.f29622q7, this.f30034j1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.f30049w.invalidate();
        this.f30051x.invalidate();
    }

    public final void j(int i7) {
        this.f30018c1 = -1;
        this.V0 = i7;
        Drawable drawable = this.A0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f30033j0 = false;
    }

    public final void l(boolean z10) {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.I0) {
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
            ArrayList arrayList = this.O0;
            if (i7 < arrayList.size()) {
                n1 n1Var = (n1) arrayList.get(i7);
                n1Var.f29806a.setTextColor(i10);
                n1Var.f29807b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.U = str;
        if (this.f30037n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f30037n.setText(this.U);
                this.f30037n.setVisibility(0);
                return;
            }
            this.f30037n.setVisibility(8);
        }
    }

    public final void o(int i7) {
        this.f30029h0 = i7;
        x70 x70Var = this.f30048v0;
        if (x70Var != null) {
            x70Var.a(true, i7 / 100.0f);
            this.f30050w0.setText(String.format("%d%%", Integer.valueOf(this.f30029h0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        p60 p60Var = this.f30052x0;
        if (p60Var != null) {
            p60Var.h(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        ls.e().c(this, ls.f25342l4);
    }

    public final void p(int i7) {
        this.f30030h1 = true;
        xh.l lVar = this.f30024f;
        if (lVar != null) {
            lVar.setTextColor(i7);
        }
        zt ztVar = this.f30037n;
        if (ztVar != null) {
            ztVar.setTextColor(i7);
        }
    }

    public final void q() {
        if (this.f30033j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.S0);
            String N0 = hd.N0(2131744589, null);
            t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131744590, null);
            alertDialog$Builder.k(hd.N0(2131742968, null), null);
            alertDialog$Builder.h(hd.N0(2131744598, null), new org.telegram.tgnet.u(this, 3));
            alertDialog$Builder.j(new u9(this, 9));
            try {
                this.L = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j3) {
        di.u3 u3Var = this.N0;
        org.telegram.messenger.g0.r(u3Var);
        org.telegram.messenger.g0.h3(u3Var, j3);
    }

    public final void s() {
        rh0 rh0Var;
        int w02;
        if (this.f30022e0 >= 0 && this.f30011a0 != null && (rh0Var = this.f30036l0) != null && rh0Var.getAnimatedDrawable() != null && (w02 = m6.w0(this.f30022e0, this.f30025f0)) != this.f30020d1) {
            oh0 animatedDrawable = this.f30036l0.getAnimatedDrawable();
            for (Map.Entry entry : this.f30011a0.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f30020d1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f30020d1 = w02;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        l1 l1Var = this.f30049w;
        if (l1Var != null) {
            l1Var.postDelayed(runnable, j3);
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
        xh.l lVar = this.f30024f;
        if (lVar != null) {
            lVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        this.f30032i1 = false;
        super.show();
        FrameLayout frameLayout = this.f30042r;
        if (frameLayout != null && this.f30027g0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f30042r.setScaleY(0.0f);
            this.f30042r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.X0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        l1 l1Var = this.f30049w;
        if (l1Var != null) {
            l1Var.removeCallbacks(runnable);
        }
    }

    public t1(int i7, Context context, h6 h6Var) {
        super(context, 2131755352);
        this.f30010a = -1;
        this.f30021e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = 12;
        this.J = m6.H5;
        this.f30014b0 = 132;
        this.f30022e0 = -1;
        this.f30031i0 = true;
        this.f30033j0 = true;
        this.f30035k0 = true;
        this.f30054y0 = new int[2];
        this.f30055z0 = true;
        this.M0 = new di.u3(this, 2);
        this.N0 = new di.u3(this, 3);
        this.O0 = new ArrayList();
        this.Q0 = true;
        this.R0 = 0.5f;
        this.T0 = true;
        this.f30018c1 = -1;
        this.f30034j1 = new r1(this, 0);
        this.S0 = h6Var;
        this.f30027g0 = i7;
        int i10 = m6.f29454h5;
        this.f30018c1 = i10;
        int f10 = f(i10);
        this.V0 = f10;
        boolean z10 = org.telegram.messenger.g0.B(f10) < 0.721f;
        this.U0 = cz.o() >= 2 && qc.e(256) && z10;
        Rect rect = new Rect();
        this.B0 = rect;
        if (i7 != 3 || this.U0) {
            Drawable g10 = i5.c.g(context, 2131232569);
            this.A0 = g10;
            this.C0 = i7 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            g10.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
            g10.getPadding(rect);
        }
        this.I = i7 == 3;
    }
}
