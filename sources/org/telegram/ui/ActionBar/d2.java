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
import android.graphics.drawable.GradientDrawable;
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
import mh.aa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s6;
import org.telegram.ui.r80;
public class d2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int Z0 = 0;
    public Matrix A0;
    public final boolean[] B;
    public BitmapShader B0;
    public final AnimatorSet[] C;
    public Paint C0;
    public int D;
    public Paint D0;
    public boolean E;
    public boolean E0;
    public int F;
    public boolean F0;
    public DialogInterface.OnCancelListener G;
    public boolean G0;
    public d2 H;
    public boolean H0;
    public int I;
    public final s1 I0;
    public DialogInterface.OnClickListener J;
    public final s1 J0;
    public DialogInterface.OnDismissListener K;
    public final ArrayList K0;
    public Utilities.Callback L;
    public float L0;
    public CharSequence[] M;
    public boolean M0;
    public int[] N;
    public float N0;
    public CharSequence O;
    public final g6 O0;
    public String P;
    public boolean P0;
    public CharSequence Q;
    public boolean Q0;
    public int R;
    public int R0;
    public View S;
    public int S0;
    public boolean T;
    public long T0;
    public int U;
    public boolean U0;
    public int V;
    public FrameLayout V0;
    public Map W;
    public mh.b W0;
    public int X;
    public b2 X0;
    public Drawable Y;
    public boolean Y0;
    public int Z;
    public int f21235a;
    public final int f21236a0;
    public View f21237b;
    public int f21238b0;
    public TextView f21239c;
    public boolean f21240c0;
    public gu d;
    public boolean f21241d0;
    public int f21242e;
    public boolean f21243e0;
    public jh.s f21244f;
    public boolean f21245f0;
    public boolean f21246g0;
    public TextView h;
    public lj0 f21247h0;
    public CharSequence f21248i0;
    public c2 f21249j0;
    public CharSequence f21250k0;
    public c2 f21251l0;
    public String m0;
    public gu f21252n;
    public wh.y3 f21253n0;
    public CharSequence f21254o0;
    public c2 f21255p0;
    public ViewGroup f21256q0;
    public FrameLayout f21257r;
    public p80 f21258r0;
    public FrameLayout f21259s;
    public TextView f21260s0;
    public r80 f21261t0;
    public final int[] f21262u0;
    public x1 v;
    public boolean f21263v0;
    public LinearLayout f21264w;
    public final Drawable f21265w0;
    public a2 f21266x;
    public final Rect f21267x0;
    public final BitmapDrawable[] f21268y;
    public final float f21269y0;
    public Bitmap f21270z0;

    public d2(Context context) {
        this(context, 3, null);
    }

    public static void a(d2 d2Var, int i10, boolean z4) {
        int i11;
        boolean[] zArr = d2Var.B;
        AnimatorSet[] animatorSetArr = d2Var.C;
        if ((z4 && !zArr[i10]) || (!z4 && zArr[i10])) {
            zArr[i10] = z4;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = d2Var.f21268y[i10];
            if (bitmapDrawable != null) {
                if (z4) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new z2(d2Var, i10, 1));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e6) {
                FileLog.e(e6);
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
        long currentTimeMillis = System.currentTimeMillis() - this.T0;
        if (currentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new s1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f21256q0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gu guVar;
        if (i10 == NotificationCenter.emojiLoaded && (guVar = this.f21252n) != null) {
            guVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.L;
        if (callback != null) {
            this.L = null;
            callback.run(new s1(this, 0));
        } else if (!this.Y0) {
            this.Y0 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.K;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            d2 d2Var = this.H;
            if (d2Var != null) {
                d2Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.J0);
            if (this.B0 != null && (bitmap = this.f21270z0) != null) {
                bitmap.recycle();
                this.B0 = null;
                this.C0 = null;
                this.f21270z0 = null;
            }
        }
    }

    public int e(int i10) {
        return k6.v0(i10, this.O0);
    }

    public final ViewGroup f(boolean z4) {
        boolean z10;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        float f12;
        float f13;
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
        float f14;
        b2 b2Var = new b2(getContext(), this);
        this.X0 = b2Var;
        b2Var.setOrientation(1);
        boolean z11 = this.Q0;
        int i27 = this.f21236a0;
        if ((z11 || i27 == 3) && i27 != 2) {
            this.X0.setBackground(null);
            this.X0.setPadding(0, 0, 0, 0);
            if (this.Q0) {
                this.X0.setWillNotDraw(false);
            }
            this.f21245f0 = false;
        } else {
            boolean z12 = this.f21246g0;
            Drawable drawable = this.f21265w0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.X0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f21245f0 = true;
            } else {
                this.X0.setBackground(null);
                this.X0.setPadding(0, 0, 0, 0);
                this.X0.setBackground(drawable);
                b2 b2Var2 = this.X0;
                hg.j1 j1Var = lf.q0.f12504a;
                b2Var2.setOutlineProvider(new lf.p0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.X0.setClipToOutline(true);
                this.f21245f0 = false;
            }
        }
        ViewGroup viewGroup = this.X0;
        boolean z13 = this.U0;
        g6 g6Var = this.O0;
        if (z13) {
            if (this.V0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.V0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final d2 f22309b;

                    {
                        this.f22309b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f22309b.dismiss();
                                return;
                            case 1:
                                d2 d2Var = this.f22309b;
                                new aa(d2Var.getContext(), d2Var.O0).show();
                                return;
                            default:
                                d2 d2Var2 = this.f22309b;
                                DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                if (onClickListener != null) {
                                    onClickListener.onClick(d2Var2, ((Integer) view.getTag()).intValue());
                                }
                                d2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.W0 == null) {
                mh.b bVar = new mh.b(getContext(), UserConfig.selectedAccount, g6Var);
                this.W0 = bVar;
                k7.e6.a(bVar);
                this.W0.setOnClickListener(new View.OnClickListener(this) {
                    public final d2 f22309b;

                    {
                        this.f22309b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f22309b.dismiss();
                                return;
                            case 1:
                                d2 d2Var = this.f22309b;
                                new aa(d2Var.getContext(), d2Var.O0).show();
                                return;
                            default:
                                d2 d2Var2 = this.f22309b;
                                DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                if (onClickListener != null) {
                                    onClickListener.onClick(d2Var2, ((Integer) view.getTag()).intValue());
                                }
                                d2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.X0);
            AndroidUtilities.removeFromParent(this.W0);
            this.V0.addView(this.X0, k7.c6.e(-2, -2, 17));
            this.V0.addView(this.W0, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.V0;
        }
        if (z4) {
            if (this.U0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f21235a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f21248i0 == null && this.f21250k0 == null && this.m0 == null && this.f21254o0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.R == 0 && this.U == 0 && this.Y == null) {
            View view = this.S;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.X0.addView(this.S, k7.c6.t(-1, this.X, 51, 0, 0, 0, 0));
            }
        } else {
            ?? imageView = new ImageView(getContext());
            this.f21247h0 = imageView;
            Drawable drawable2 = this.Y;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.Y;
                if (drawable3 instanceof s6) {
                    s6 s6Var = (s6) drawable3;
                    this.f21247h0.addOnAttachStateChangeListener(new v1(s6Var));
                    s6Var.a(this.f21247h0);
                }
            } else {
                int i28 = this.R;
                if (i28 != 0) {
                    imageView.setImageResource(i28);
                } else {
                    imageView.setAutoRepeat(this.P0);
                    lj0 lj0Var = this.f21247h0;
                    int i29 = this.U;
                    int i30 = this.V;
                    lj0Var.f(i29, i30, i30, null);
                    if (this.W != null) {
                        ij0 animatedDrawable = this.f21247h0.getAnimatedDrawable();
                        for (Map.Entry entry : this.W.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f27834s.put((String) entry.getKey(), num);
                            animatedDrawable.E();
                        }
                    }
                    this.f21247h0.d();
                }
            }
            this.f21247h0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.T) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Z);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f21247h0.setBackground(new w1(this, gradientDrawable));
                this.X = 92;
            } else {
                this.f21247h0.setBackground(k6.c0(AndroidUtilities.dp(10.0f), 0, this.Z));
            }
            if (this.T) {
                this.f21247h0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f21247h0.setTranslationY(0.0f);
            }
            this.f21247h0.setPadding(0, 0, 0, 0);
            this.X0.addView(this.f21247h0, k7.c6.t(-1, this.X, 51, 0, 0, 0, 0));
        }
        if (this.O != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f21259s = frameLayout2;
            this.X0.addView(frameLayout2, k7.c6.t(-2, -2, this.T ? 1 : 0, 24, 0, 24, 0));
            jh.s sVar = new jh.s(getContext(), null, false);
            this.f21244f = sVar;
            NotificationCenter.listenEmojiLoading(sVar);
            jh.s sVar2 = this.f21244f;
            sVar2.h = 3;
            sVar2.setText(this.O);
            this.f21244f.setTextColor(e(k6.f21766j5));
            this.f21244f.setTextSize(1, 20.0f);
            this.f21244f.setTypeface(AndroidUtilities.bold());
            jh.s sVar3 = this.f21244f;
            if (this.T) {
                i24 = 1;
            } else if (LocaleController.isRTL) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            sVar3.setGravity(i24 | 48);
            FrameLayout frameLayout3 = this.f21259s;
            jh.s sVar4 = this.f21244f;
            boolean z14 = this.T;
            if (z14) {
                i25 = 1;
            } else if (LocaleController.isRTL) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i31 = i25 | 48;
            if (z14) {
                f14 = 4.0f;
            } else {
                if (this.P != null) {
                    i26 = 2;
                } else if (this.M != null) {
                    i26 = 14;
                } else {
                    i26 = 10;
                }
                f14 = i26;
            }
            frameLayout3.addView(sVar4, k7.c6.d(-2, -2.0f, i31, 0.0f, 19.0f, 0.0f, f14));
        }
        if (this.P != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.P);
            this.h.setTextColor(e(k6.J5));
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21 | 48);
            b2 b2Var3 = this.X0;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i32 = i22 | 48;
            if (this.M != null) {
                i23 = 14;
            } else {
                i23 = 10;
            }
            b2Var3.addView(textView3, k7.c6.t(-2, -2, i32, 24, 0, 24, i23));
        }
        if (i27 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f21268y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            x1 x1Var = new x1(this, getContext(), 0);
            this.v = x1Var;
            x1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(k6.A5));
            this.X0.addView(this.v, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f21264w = linearLayout;
            linearLayout.setOrientation(1);
            f10 = 20.0f;
            f11 = 4.0f;
            this.v.addView(this.f21264w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f10 = 20.0f;
            f11 = 4.0f;
        }
        gu guVar = new gu(getContext());
        this.f21252n = guVar;
        NotificationCenter.listenEmojiLoading(guVar);
        gu guVar2 = this.f21252n;
        if (this.T) {
            i10 = k6.f22036y6;
        } else {
            i10 = k6.f21766j5;
        }
        guVar2.setTextColor(e(i10));
        this.f21252n.setTextSize(1, 16.0f);
        this.f21252n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f21252n.setLinkTextColor(e(k6.f21784k5));
        if (!this.f21240c0) {
            this.f21252n.setClickable(false);
            this.f21252n.setEnabled(false);
        }
        gu guVar3 = this.f21252n;
        if (this.T) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        guVar3.setGravity(i11 | 48);
        if (i27 == 2) {
            b2 b2Var4 = this.X0;
            gu guVar4 = this.f21252n;
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i33 = i17 | 48;
            if (this.O == null) {
                i18 = 19;
            } else {
                i18 = 0;
            }
            b2Var4.addView(guVar4, k7.c6.t(-2, -2, i33, 24, i18, 24, 20));
            p80 p80Var = new p80(getContext());
            this.f21258r0 = p80Var;
            p80Var.a(this.f21238b0 / 100.0f, false);
            this.f21258r0.setProgressColor(e(k6.F5));
            this.f21258r0.setBackColor(e(k6.G5));
            this.X0.addView(this.f21258r0, k7.c6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f21260s0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f21260s0;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView5.setGravity(i19 | 48);
            this.f21260s0.setTextColor(e(k6.f21893q5));
            this.f21260s0.setTextSize(1, 14.0f);
            b2 b2Var5 = this.X0;
            TextView textView6 = this.f21260s0;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            b2Var5.addView(textView6, k7.c6.t(-2, -2, i20 | 48, 23, 4, 23, 24));
            this.f21260s0.setText(String.format("%d%%", Integer.valueOf(this.f21238b0)));
        } else if (i27 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f21257r = new FrameLayout(getContext());
            this.R0 = e(k6.M5);
            if (!this.Q0) {
                this.f21257r.setBackgroundDrawable(k6.b0(AndroidUtilities.dp(18.0f), this.R0));
            }
            this.X0.addView(this.f21257r, k7.c6.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), g6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(k6.N5));
            this.f21257r.addView(radialProgressView, k7.c6.e(86, 86, 17));
        } else {
            gu guVar5 = this.d;
            if (guVar5 != null) {
                this.f21264w.addView(guVar5, k7.c6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f21264w;
            gu guVar6 = this.f21252n;
            if (this.T) {
                i12 = 1;
            } else if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i34 = i12 | 48;
            if (this.f21237b == null && this.M == null) {
                i13 = 0;
            } else {
                i13 = this.D;
            }
            linearLayout2.addView(guVar6, k7.c6.t(-2, -2, i34, 24, 0, 24, i13));
            TextView textView7 = this.f21239c;
            if (textView7 != null) {
                this.f21264w.addView(textView7, k7.c6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.Q)) {
            this.f21252n.setText(this.Q);
            this.f21252n.setVisibility(0);
        } else {
            this.f21252n.setVisibility(8);
        }
        if (this.M != null) {
            int i35 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i35 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i35] != null) {
                    z1 z1Var = new z1(getContext(), g6Var);
                    CharSequence charSequence = this.M[i35];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i16 = iArr[i35];
                    } else {
                        i16 = 0;
                    }
                    z1Var.a(i16, charSequence);
                    z1Var.setTag(Integer.valueOf(i35));
                    this.K0.add(z1Var);
                    this.f21264w.addView(z1Var, k7.c6.n(-1, 50));
                    z1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final d2 f22309b;

                        {
                            this.f22309b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f22309b.dismiss();
                                    return;
                                case 1:
                                    d2 d2Var = this.f22309b;
                                    new aa(d2Var.getContext(), d2Var.O0).show();
                                    return;
                                default:
                                    d2 d2Var2 = this.f22309b;
                                    DialogInterface.OnClickListener onClickListener = d2Var2.J;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(d2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    d2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i35++;
            }
        }
        View view2 = this.f21237b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f21237b.getParent()).removeView(this.f21237b);
            }
            this.f21264w.addView(this.f21237b, k7.c6.n(-1, this.f21242e));
        }
        if (z10) {
            if (!this.F0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f21248i0;
                if (charSequence2 != null) {
                    i15 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i15 = 0;
                }
                if (this.f21250k0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f21250k0;
                    i15 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.m0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    String str = this.m0;
                    i15 = (int) (textPaint.measureText((CharSequence) str, 0, str.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.f21254o0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f21254o0;
                    i15 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (i15 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.G0 && this.f21248i0 != null && this.f21250k0 != null && this.m0 != null && this.f21254o0 != null) {
                        this.H0 = true;
                    } else {
                        this.F0 = true;
                    }
                }
            }
            if (this.F0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f21256q0 = linearLayout3;
            } else {
                this.f21256q0 = new v2(this, getContext(), 1);
            }
            if (this.f21239c != null) {
                this.f21256q0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f21256q0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f21256q0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            b2 b2Var6 = this.X0;
            ViewGroup viewGroup2 = this.f21256q0;
            if (this.H0) {
                i14 = 96;
            } else {
                i14 = 52;
            }
            b2Var6.addView(viewGroup2, k7.c6.n(-1, i14));
            if (this.T) {
                this.f21256q0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f21248i0 != null) {
                y1 y1Var = new y1(getContext(), 0);
                y1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                y1Var.setTag(-1);
                y1Var.setTextSize(1, 16.0f);
                y1Var.setTextColor(e(this.F));
                y1Var.setGravity(17);
                y1Var.setTypeface(AndroidUtilities.bold());
                y1Var.setText(this.f21248i0);
                f12 = 64.0f;
                y1Var.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    f13 = 6.0f;
                    this.f21256q0.addView(y1Var, k7.c6.q(-1, 40, 7));
                } else {
                    f13 = 6.0f;
                    this.f21256q0.addView(y1Var, k7.c6.e(-2, 40, 53));
                }
                y1Var.setOnClickListener(new org.telegram.messenger.video.g(3, this, y1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
            }
            if (this.f21250k0 != null) {
                y1 y1Var2 = new y1(getContext(), 1);
                y1Var2.setMinWidth(AndroidUtilities.dp(f12));
                y1Var2.setTag(-2);
                y1Var2.setTextSize(1, 16.0f);
                y1Var2.setTextColor(e(this.F));
                y1Var2.setGravity(17);
                y1Var2.setTypeface(AndroidUtilities.bold());
                y1Var2.setEllipsize(TextUtils.TruncateAt.END);
                y1Var2.setSingleLine(true);
                y1Var2.setText(this.f21250k0.toString());
                y1Var2.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.f21256q0.addView(y1Var2, 0, k7.c6.q(-1, 40, 7));
                } else {
                    this.f21256q0.addView(y1Var2, k7.c6.e(-2, 40, 53));
                }
                y1Var2.setOnClickListener(new org.telegram.messenger.video.g(4, this, y1Var2));
            }
            if (this.f21254o0 != null) {
                y1 y1Var3 = new y1(getContext(), 2);
                y1Var3.setMinWidth(AndroidUtilities.dp(f12));
                y1Var3.setTag(-3);
                y1Var3.setTextSize(1, 16.0f);
                y1Var3.setTextColor(e(this.F));
                y1Var3.setGravity(17);
                y1Var3.setTypeface(AndroidUtilities.bold());
                y1Var3.setEllipsize(TextUtils.TruncateAt.END);
                y1Var3.setSingleLine(true);
                y1Var3.setText(this.f21254o0.toString());
                y1Var3.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.f21256q0.addView(y1Var3, 1, k7.c6.q(-1, 40, 7));
                } else {
                    this.f21256q0.addView(y1Var3, k7.c6.e(-2, 40, 51));
                }
                y1Var3.setOnClickListener(new org.telegram.messenger.video.g(5, this, y1Var3));
            }
            if (this.m0 != null) {
                y1 y1Var4 = new y1(getContext(), 3);
                y1Var4.setMinWidth(AndroidUtilities.dp(f12));
                y1Var4.setTag(-4);
                y1Var4.setTextSize(1, 16.0f);
                y1Var4.setTextColor(e(this.F));
                y1Var4.setGravity(17);
                y1Var4.setTypeface(AndroidUtilities.bold());
                y1Var4.setEllipsize(TextUtils.TruncateAt.END);
                y1Var4.setSingleLine(true);
                y1Var4.setText(this.m0.toString());
                y1Var4.setBackground(k6.G0(AndroidUtilities.dp(f10), e(this.F)));
                y1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.F0) {
                    this.f21256q0.addView(y1Var4, 0, k7.c6.q(-1, 40, 7));
                } else {
                    this.f21256q0.addView(y1Var4, k7.c6.e(-2, 40, 53));
                }
                y1Var4.setOnClickListener(new org.telegram.messenger.video.g(6, this, y1Var4));
            }
            if (this.F0) {
                for (int i36 = 1; i36 < this.f21256q0.getChildCount(); i36++) {
                    ((ViewGroup.MarginLayoutParams) this.f21256q0.getChildAt(i36).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.U0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i27 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.M0) {
                layoutParams3.dimAmount = this.N0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i37 = AndroidUtilities.displaySize.x;
            this.I = i37;
            int dp2 = (i37 - AndroidUtilities.dp(48.0f)) - (this.S0 * 2);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    dp = AndroidUtilities.dp(446.0f);
                } else {
                    dp = AndroidUtilities.dp(496.0f);
                }
            } else {
                dp = AndroidUtilities.dp(356.0f);
            }
            int min = Math.min(dp, dp2);
            Rect rect2 = this.f21267x0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.f21237b;
        if (view3 != null && this.f21263v0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.Q0) {
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final af.f g(int i10, boolean z4, boolean z10) {
        View d = d(i10);
        if (z10) {
            this.f21243e0 = false;
        }
        return new af.f(new p(d, 5), new mh.r5(this, d, z4, 5));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(k6.f21895q7));
        }
    }

    public final void i(int i10) {
        this.R0 = i10;
        Drawable drawable = this.f21265w0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.R0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f21264w.invalidate();
    }

    public final void j() {
        this.f21241d0 = false;
    }

    public final void k(boolean z4) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.E0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.K0;
            if (i10 < arrayList.size()) {
                z1 z1Var = (z1) arrayList.get(i10);
                z1Var.f22477a.setTextColor(i11);
                z1Var.f22478b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.Q = str;
        if (this.f21252n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f21252n.setText(this.Q);
                this.f21252n.setVisibility(0);
                return;
            }
            this.f21252n.setVisibility(8);
        }
    }

    public final void n(int i10) {
        this.f21238b0 = i10;
        p80 p80Var = this.f21258r0;
        if (p80Var != null) {
            p80Var.a(i10 / 100.0f, true);
            this.f21260s0.setText(String.format("%d%%", Integer.valueOf(this.f21238b0)));
        }
    }

    public final void o(int i10) {
        jh.s sVar = this.f21244f;
        if (sVar != null) {
            sVar.setTextColor(i10);
        }
        gu guVar = this.f21252n;
        if (guVar != null) {
            guVar.setTextColor(i10);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        r80 r80Var = this.f21261t0;
        if (r80Var != null) {
            r80Var.j(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f21241d0 && this.H == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.O0);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new t1(this, 0));
            try {
                this.H = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        s1 s1Var = this.J0;
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, j10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        x1 x1Var = this.v;
        if (x1Var != null) {
            x1Var.postDelayed(runnable, j10);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.G = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.O = charSequence;
        jh.s sVar = this.f21244f;
        if (sVar != null) {
            sVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.Y0 = false;
        super.show();
        FrameLayout frameLayout = this.f21257r;
        if (frameLayout != null && this.f21236a0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f21257r.setScaleY(0.0f);
            this.f21257r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.T0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        x1 x1Var = this.v;
        if (x1Var != null) {
            x1Var.removeCallbacks(runnable);
        }
    }

    public d2(Context context, int i10, g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.f21235a = -1;
        this.f21242e = -2;
        this.f21268y = new BitmapDrawable[2];
        this.B = new boolean[2];
        this.C = new AnimatorSet[2];
        this.D = 12;
        this.F = k6.H5;
        this.X = 132;
        this.f21240c0 = true;
        this.f21241d0 = true;
        this.f21243e0 = true;
        this.f21262u0 = new int[2];
        this.f21263v0 = true;
        this.I0 = new s1(this, 0);
        this.J0 = new s1(this, 1);
        this.K0 = new ArrayList();
        this.M0 = true;
        this.N0 = 0.5f;
        this.P0 = true;
        this.O0 = g6Var;
        this.f21236a0 = i10;
        int e6 = e(k6.f21731h5);
        this.R0 = e6;
        boolean z4 = AndroidUtilities.computePerceivedBrightness(e6) < 0.721f;
        this.Q0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z4;
        Rect rect = new Rect();
        this.f21267x0 = rect;
        if (i10 != 3 || this.Q0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f21265w0 = mutate;
            this.f21269y0 = i10 == 3 ? 0.55f : z4 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.R0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.E = i10 == 3;
    }
}
