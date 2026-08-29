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
import jh.z9;
import nh.r7;
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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.h80;
public class c2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int Y0 = 0;
    public final boolean[] A;
    public BitmapShader A0;
    public final AnimatorSet[] B;
    public Paint B0;
    public int C;
    public Paint C0;
    public boolean D;
    public boolean D0;
    public int E;
    public boolean E0;
    public DialogInterface.OnCancelListener F;
    public boolean F0;
    public c2 G;
    public boolean G0;
    public int H;
    public final r1 H0;
    public DialogInterface.OnClickListener I;
    public final r1 I0;
    public DialogInterface.OnDismissListener J;
    public final ArrayList J0;
    public Utilities.Callback K;
    public float K0;
    public CharSequence[] L;
    public boolean L0;
    public int[] M;
    public float M0;
    public CharSequence N;
    public final c6 N0;
    public String O;
    public boolean O0;
    public CharSequence P;
    public boolean P0;
    public int Q;
    public int Q0;
    public View R;
    public int R0;
    public boolean S;
    public long S0;
    public int T;
    public boolean T0;
    public int U;
    public FrameLayout U0;
    public Map V;
    public jh.b V0;
    public int W;
    public a2 W0;
    public Drawable X;
    public boolean X0;
    public int Y;
    public final int Z;
    public int f22778a;
    public int f22779a0;
    public View f22780b;
    public boolean f22781b0;
    public TextView f22782c;
    public boolean f22783c0;
    public bu d;
    public boolean f22784d0;
    public int f22785e;
    public boolean f22786e0;
    public gh.s f22787f;
    public boolean f22788f0;
    public aj0 f22789g0;
    public TextView h;
    public CharSequence f22790h0;
    public b2 f22791i0;
    public CharSequence f22792j0;
    public b2 f22793k0;
    public String f22794l0;
    public th.w3 m0;
    public bu f22795n;
    public CharSequence f22796n0;
    public b2 f22797o0;
    public ViewGroup f22798p0;
    public i80 f22799q0;
    public FrameLayout f22800r;
    public TextView f22801r0;
    public FrameLayout f22802s;
    public h80 f22803s0;
    public final int[] f22804t0;
    public boolean f22805u0;
    public w1 v;
    public final Drawable f22806v0;
    public LinearLayout f22807w;
    public final Rect f22808w0;
    public z1 f22809x;
    public final float f22810x0;
    public final BitmapDrawable[] f22811y;
    public Bitmap f22812y0;
    public Matrix f22813z0;

    public c2(Context context) {
        this(context, 3, null);
    }

    public static void a(c2 c2Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = c2Var.A;
        AnimatorSet[] animatorSetArr = c2Var.B;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = c2Var.f22811y[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new x2(c2Var, i10, 1));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        long currentTimeMillis = System.currentTimeMillis() - this.S0;
        if (currentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new r1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f22798p0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bu buVar;
        if (i10 == NotificationCenter.emojiLoaded && (buVar = this.f22795n) != null) {
            buVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.K;
        if (callback != null) {
            this.K = null;
            callback.run(new r1(this, 0));
        } else if (!this.X0) {
            this.X0 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.J;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            c2 c2Var = this.G;
            if (c2Var != null) {
                c2Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.I0);
            if (this.A0 != null && (bitmap = this.f22812y0) != null) {
                bitmap.recycle();
                this.A0 = null;
                this.B0 = null;
                this.f22812y0 = null;
            }
        }
    }

    public int e(int i10) {
        return g6.v0(i10, this.N0);
    }

    public final ViewGroup f(boolean z10) {
        boolean z11;
        float f9;
        float f10;
        int i10;
        int i11;
        int i12;
        int dp;
        int i13;
        float f11;
        float f12;
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
        float f13;
        a2 a2Var = new a2(getContext(), this);
        this.W0 = a2Var;
        a2Var.setOrientation(1);
        boolean z12 = this.P0;
        int i25 = this.Z;
        if ((z12 || i25 == 3) && i25 != 2) {
            this.W0.setBackground(null);
            this.W0.setPadding(0, 0, 0, 0);
            if (this.P0) {
                this.W0.setWillNotDraw(false);
            }
            this.f22786e0 = false;
        } else {
            boolean z13 = this.f22788f0;
            Drawable drawable = this.f22806v0;
            if (z13) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.W0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f22786e0 = true;
            } else {
                this.W0.setBackground(null);
                this.W0.setPadding(0, 0, 0, 0);
                this.W0.setBackground(drawable);
                a2 a2Var2 = this.W0;
                eg.k1 k1Var = jf.q0.f11668a;
                a2Var2.setOutlineProvider(new jf.p0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.W0.setClipToOutline(true);
                this.f22786e0 = false;
            }
        }
        ViewGroup viewGroup = this.W0;
        boolean z14 = this.T0;
        c6 c6Var = this.N0;
        if (z14) {
            if (this.U0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.U0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f23789b;

                    {
                        this.f23789b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23789b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f23789b;
                                new z9(c2Var.getContext(), c2Var.N0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f23789b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.V0 == null) {
                jh.b bVar = new jh.b(getContext(), UserConfig.selectedAccount, c6Var);
                this.V0 = bVar;
                i7.h6.a(bVar);
                this.V0.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f23789b;

                    {
                        this.f23789b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23789b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f23789b;
                                new z9(c2Var.getContext(), c2Var.N0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f23789b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.W0);
            AndroidUtilities.removeFromParent(this.V0);
            this.U0.addView(this.W0, i7.f6.e(-2, -2, 17));
            this.U0.addView(this.V0, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.U0;
        }
        if (z10) {
            if (this.T0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f22778a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f22790h0 == null && this.f22792j0 == null && this.f22794l0 == null && this.f22796n0 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.Q == 0 && this.T == 0 && this.X == null) {
            View view = this.R;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.W0.addView(this.R, i7.f6.t(-1, this.W, 51, 0, 0, 0, 0));
            }
        } else {
            ?? imageView = new ImageView(getContext());
            this.f22789g0 = imageView;
            Drawable drawable2 = this.X;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.X;
                if (drawable3 instanceof w6) {
                    w6 w6Var = (w6) drawable3;
                    this.f22789g0.addOnAttachStateChangeListener(new u1(w6Var));
                    w6Var.a(this.f22789g0);
                }
            } else {
                int i26 = this.Q;
                if (i26 != 0) {
                    imageView.setImageResource(i26);
                } else {
                    imageView.setAutoRepeat(this.O0);
                    aj0 aj0Var = this.f22789g0;
                    int i27 = this.T;
                    int i28 = this.U;
                    aj0Var.f(i27, i28, i28, null);
                    if (this.V != null) {
                        xi0 animatedDrawable = this.f22789g0.getAnimatedDrawable();
                        for (Map.Entry entry : this.V.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f34754s.put((String) entry.getKey(), num);
                            animatedDrawable.E();
                        }
                    }
                    this.f22789g0.d();
                }
            }
            this.f22789g0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.S) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Y);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f22789g0.setBackground(new v1(this, gradientDrawable));
                this.W = 92;
            } else {
                this.f22789g0.setBackground(g6.c0(AndroidUtilities.dp(10.0f), 0, this.Y));
            }
            if (this.S) {
                this.f22789g0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f22789g0.setTranslationY(0.0f);
            }
            this.f22789g0.setPadding(0, 0, 0, 0);
            this.W0.addView(this.f22789g0, i7.f6.t(-1, this.W, 51, 0, 0, 0, 0));
        }
        int i29 = 5;
        if (this.N != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f22802s = frameLayout2;
            this.W0.addView(frameLayout2, i7.f6.t(-2, -2, this.S ? 1 : 0, 24, 0, 24, 0));
            gh.s sVar = new gh.s(getContext(), null, false);
            this.f22787f = sVar;
            NotificationCenter.listenEmojiLoading(sVar);
            gh.s sVar2 = this.f22787f;
            sVar2.h = 3;
            sVar2.setText(this.N);
            this.f22787f.setTextColor(e(g6.f23169j5));
            this.f22787f.setTextSize(1, 20.0f);
            this.f22787f.setTypeface(AndroidUtilities.bold());
            gh.s sVar3 = this.f22787f;
            if (this.S) {
                i22 = 1;
            } else if (LocaleController.isRTL) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            sVar3.setGravity(i22 | 48);
            FrameLayout frameLayout3 = this.f22802s;
            gh.s sVar4 = this.f22787f;
            boolean z15 = this.S;
            if (z15) {
                i23 = 1;
            } else if (LocaleController.isRTL) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i30 = i23 | 48;
            if (z15) {
                f13 = 4.0f;
            } else {
                if (this.O != null) {
                    i24 = 2;
                } else if (this.L != null) {
                    i24 = 14;
                } else {
                    i24 = 10;
                }
                f13 = i24;
            }
            frameLayout3.addView(sVar4, i7.f6.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f13));
        }
        if (this.O != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.O);
            this.h.setTextColor(e(g6.J5));
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19 | 48);
            a2 a2Var3 = this.W0;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i31 = i20 | 48;
            if (this.L != null) {
                i21 = 14;
            } else {
                i21 = 10;
            }
            a2Var3.addView(textView3, i7.f6.t(-2, -2, i31, 24, 0, 24, i21));
        }
        if (i25 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f22811y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            w1 w1Var = new w1(this, getContext(), 0);
            this.v = w1Var;
            w1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(g6.A5));
            this.W0.addView(this.v, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f22807w = linearLayout;
            linearLayout.setOrientation(1);
            f9 = 20.0f;
            f10 = 4.0f;
            this.v.addView(this.f22807w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f9 = 20.0f;
            f10 = 4.0f;
        }
        bu buVar = new bu(getContext());
        this.f22795n = buVar;
        NotificationCenter.listenEmojiLoading(buVar);
        bu buVar2 = this.f22795n;
        if (this.S) {
            i10 = g6.f23433y6;
        } else {
            i10 = g6.f23169j5;
        }
        buVar2.setTextColor(e(i10));
        this.f22795n.setTextSize(1, 16.0f);
        this.f22795n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f22795n.setLinkTextColor(e(g6.f23188k5));
        if (!this.f22781b0) {
            this.f22795n.setClickable(false);
            this.f22795n.setEnabled(false);
        }
        bu buVar3 = this.f22795n;
        if (this.S) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        buVar3.setGravity(i11 | 48);
        if (i25 == 2) {
            a2 a2Var4 = this.W0;
            bu buVar4 = this.f22795n;
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i32 = i16 | 48;
            if (this.N == null) {
                i17 = 19;
            } else {
                i17 = 0;
            }
            a2Var4.addView(buVar4, i7.f6.t(-2, -2, i32, 24, i17, 24, 20));
            i80 i80Var = new i80(getContext());
            this.f22799q0 = i80Var;
            i80Var.a(this.f22779a0 / 100.0f, false);
            this.f22799q0.setProgressColor(e(g6.F5));
            this.f22799q0.setBackColor(e(g6.G5));
            this.W0.addView(this.f22799q0, i7.f6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f22801r0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f22801r0;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            this.f22801r0.setTextColor(e(g6.f23294q5));
            this.f22801r0.setTextSize(1, 14.0f);
            a2 a2Var5 = this.W0;
            TextView textView6 = this.f22801r0;
            if (!LocaleController.isRTL) {
                i29 = 3;
            }
            a2Var5.addView(textView6, i7.f6.t(-2, -2, i29 | 48, 23, 4, 23, 24));
            this.f22801r0.setText(String.format("%d%%", Integer.valueOf(this.f22779a0)));
        } else if (i25 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f22800r = new FrameLayout(getContext());
            this.Q0 = e(g6.M5);
            if (!this.P0) {
                this.f22800r.setBackgroundDrawable(g6.b0(AndroidUtilities.dp(18.0f), this.Q0));
            }
            this.W0.addView(this.f22800r, i7.f6.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), c6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(g6.N5));
            this.f22800r.addView(radialProgressView, i7.f6.e(86, 86, 17));
        } else {
            bu buVar5 = this.d;
            if (buVar5 != null) {
                this.f22807w.addView(buVar5, i7.f6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f22807w;
            bu buVar6 = this.f22795n;
            if (this.S) {
                i29 = 1;
            } else if (!LocaleController.isRTL) {
                i29 = 3;
            }
            int i33 = i29 | 48;
            if (this.f22780b == null && this.L == null) {
                i12 = 0;
            } else {
                i12 = this.C;
            }
            linearLayout2.addView(buVar6, i7.f6.t(-2, -2, i33, 24, 0, 24, i12));
            TextView textView7 = this.f22782c;
            if (textView7 != null) {
                this.f22807w.addView(textView7, i7.f6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.P)) {
            this.f22795n.setText(this.P);
            this.f22795n.setVisibility(0);
        } else {
            this.f22795n.setVisibility(8);
        }
        if (this.L != null) {
            int i34 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i34 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i34] != null) {
                    y1 y1Var = new y1(getContext(), c6Var);
                    CharSequence charSequence = this.L[i34];
                    int[] iArr = this.M;
                    if (iArr != null) {
                        i15 = iArr[i34];
                    } else {
                        i15 = 0;
                    }
                    y1Var.a(i15, charSequence);
                    y1Var.setTag(Integer.valueOf(i34));
                    this.J0.add(y1Var);
                    this.f22807w.addView(y1Var, i7.f6.n(-1, 50));
                    y1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final c2 f23789b;

                        {
                            this.f23789b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f23789b.dismiss();
                                    return;
                                case 1:
                                    c2 c2Var = this.f23789b;
                                    new z9(c2Var.getContext(), c2Var.N0).show();
                                    return;
                                default:
                                    c2 c2Var2 = this.f23789b;
                                    DialogInterface.OnClickListener onClickListener = c2Var2.I;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(c2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    c2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i34++;
            }
        }
        View view2 = this.f22780b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f22780b.getParent()).removeView(this.f22780b);
            }
            this.f22807w.addView(this.f22780b, i7.f6.n(-1, this.f22785e));
        }
        if (z11) {
            if (!this.E0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f22790h0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f22792j0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f22792j0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f22794l0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    String str = this.f22794l0;
                    i14 = (int) (textPaint.measureText((CharSequence) str, 0, str.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f22796n0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f22796n0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (i14 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.F0 && this.f22790h0 != null && this.f22792j0 != null && this.f22794l0 != null && this.f22796n0 != null) {
                        this.G0 = true;
                    } else {
                        this.E0 = true;
                    }
                }
            }
            if (this.E0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f22798p0 = linearLayout3;
            } else {
                this.f22798p0 = new t2(this, getContext(), 1);
            }
            if (this.f22782c != null) {
                this.f22798p0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                this.f22798p0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f22798p0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            a2 a2Var6 = this.W0;
            ViewGroup viewGroup2 = this.f22798p0;
            if (this.G0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            a2Var6.addView(viewGroup2, i7.f6.n(-1, i13));
            if (this.S) {
                this.f22798p0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f22790h0 != null) {
                x1 x1Var = new x1(getContext(), 0);
                x1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                x1Var.setTag(-1);
                x1Var.setTextSize(1, 16.0f);
                x1Var.setTextColor(e(this.E));
                x1Var.setGravity(17);
                x1Var.setTypeface(AndroidUtilities.bold());
                x1Var.setText(this.f22790h0);
                f11 = 64.0f;
                x1Var.setBackground(g6.G0(AndroidUtilities.dp(f9), e(this.E)));
                x1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    f12 = 6.0f;
                    this.f22798p0.addView(x1Var, i7.f6.q(-1, 40, 7));
                } else {
                    f12 = 6.0f;
                    this.f22798p0.addView(x1Var, i7.f6.e(-2, 40, 53));
                }
                x1Var.setOnClickListener(new r7(6, this, x1Var));
            } else {
                f11 = 64.0f;
                f12 = 6.0f;
            }
            if (this.f22792j0 != null) {
                x1 x1Var2 = new x1(getContext(), 1);
                x1Var2.setMinWidth(AndroidUtilities.dp(f11));
                x1Var2.setTag(-2);
                x1Var2.setTextSize(1, 16.0f);
                x1Var2.setTextColor(e(this.E));
                x1Var2.setGravity(17);
                x1Var2.setTypeface(AndroidUtilities.bold());
                x1Var2.setEllipsize(TextUtils.TruncateAt.END);
                x1Var2.setSingleLine(true);
                x1Var2.setText(this.f22792j0.toString());
                x1Var2.setBackground(g6.G0(AndroidUtilities.dp(f9), e(this.E)));
                x1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22798p0.addView(x1Var2, 0, i7.f6.q(-1, 40, 7));
                } else {
                    this.f22798p0.addView(x1Var2, i7.f6.e(-2, 40, 53));
                }
                x1Var2.setOnClickListener(new r7(7, this, x1Var2));
            }
            if (this.f22796n0 != null) {
                x1 x1Var3 = new x1(getContext(), 2);
                x1Var3.setMinWidth(AndroidUtilities.dp(f11));
                x1Var3.setTag(-3);
                x1Var3.setTextSize(1, 16.0f);
                x1Var3.setTextColor(e(this.E));
                x1Var3.setGravity(17);
                x1Var3.setTypeface(AndroidUtilities.bold());
                x1Var3.setEllipsize(TextUtils.TruncateAt.END);
                x1Var3.setSingleLine(true);
                x1Var3.setText(this.f22796n0.toString());
                x1Var3.setBackground(g6.G0(AndroidUtilities.dp(f9), e(this.E)));
                x1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22798p0.addView(x1Var3, 1, i7.f6.q(-1, 40, 7));
                } else {
                    this.f22798p0.addView(x1Var3, i7.f6.e(-2, 40, 51));
                }
                x1Var3.setOnClickListener(new r7(8, this, x1Var3));
            }
            if (this.f22794l0 != null) {
                x1 x1Var4 = new x1(getContext(), 3);
                x1Var4.setMinWidth(AndroidUtilities.dp(f11));
                x1Var4.setTag(-4);
                x1Var4.setTextSize(1, 16.0f);
                x1Var4.setTextColor(e(this.E));
                x1Var4.setGravity(17);
                x1Var4.setTypeface(AndroidUtilities.bold());
                x1Var4.setEllipsize(TextUtils.TruncateAt.END);
                x1Var4.setSingleLine(true);
                x1Var4.setText(this.f22794l0.toString());
                x1Var4.setBackground(g6.G0(AndroidUtilities.dp(f9), e(this.E)));
                x1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22798p0.addView(x1Var4, 0, i7.f6.q(-1, 40, 7));
                } else {
                    this.f22798p0.addView(x1Var4, i7.f6.e(-2, 40, 53));
                }
                x1Var4.setOnClickListener(new r7(9, this, x1Var4));
            }
            if (this.E0) {
                for (int i35 = 1; i35 < this.f22798p0.getChildCount(); i35++) {
                    ((ViewGroup.MarginLayoutParams) this.f22798p0.getChildAt(i35).getLayoutParams()).topMargin = AndroidUtilities.dp(f12);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.T0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i25 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.L0) {
                layoutParams3.dimAmount = this.M0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i36 = AndroidUtilities.displaySize.x;
            this.H = i36;
            int dp2 = (i36 - AndroidUtilities.dp(48.0f)) - (this.R0 * 2);
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
            Rect rect2 = this.f22808w0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.f22780b;
        if (view3 != null && this.f22805u0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.P0) {
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final ye.c g(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f22784d0 = false;
        }
        return new ye.c(new q(d, 5), new jh.r5(this, d, z10, 7));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(g6.f23295q7));
        }
    }

    public final void i(int i10) {
        this.Q0 = i10;
        Drawable drawable = this.f22806v0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f22807w.invalidate();
    }

    public final void j() {
        this.f22783c0 = false;
    }

    public final void k(boolean z10) {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.D0) {
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
            ArrayList arrayList = this.J0;
            if (i10 < arrayList.size()) {
                y1 y1Var = (y1) arrayList.get(i10);
                y1Var.f23975a.setTextColor(i11);
                y1Var.f23976b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.P = str;
        if (this.f22795n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f22795n.setText(this.P);
                this.f22795n.setVisibility(0);
                return;
            }
            this.f22795n.setVisibility(8);
        }
    }

    public final void n(int i10) {
        this.f22779a0 = i10;
        i80 i80Var = this.f22799q0;
        if (i80Var != null) {
            i80Var.a(i10 / 100.0f, true);
            this.f22801r0.setText(String.format("%d%%", Integer.valueOf(this.f22779a0)));
        }
    }

    public final void o(int i10) {
        gh.s sVar = this.f22787f;
        if (sVar != null) {
            sVar.setTextColor(i10);
        }
        bu buVar = this.f22795n;
        if (buVar != null) {
            buVar.setTextColor(i10);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        h80 h80Var = this.f22803s0;
        if (h80Var != null) {
            h80Var.g(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f22783c0 && this.G == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.N0);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new o(this, 3));
            alertDialog$Builder.j(new s1(this, 0));
            try {
                this.G = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        r1 r1Var = this.I0;
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var, j10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.postDelayed(runnable, j10);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.F = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.N = charSequence;
        gh.s sVar = this.f22787f;
        if (sVar != null) {
            sVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.X0 = false;
        super.show();
        FrameLayout frameLayout = this.f22800r;
        if (frameLayout != null && this.Z == 3) {
            frameLayout.setScaleX(0.0f);
            this.f22800r.setScaleY(0.0f);
            this.f22800r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.S0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.removeCallbacks(runnable);
        }
    }

    public c2(Context context, int i10, c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.f22778a = -1;
        this.f22785e = -2;
        this.f22811y = new BitmapDrawable[2];
        this.A = new boolean[2];
        this.B = new AnimatorSet[2];
        this.C = 12;
        this.E = g6.H5;
        this.W = 132;
        this.f22781b0 = true;
        this.f22783c0 = true;
        this.f22784d0 = true;
        this.f22804t0 = new int[2];
        this.f22805u0 = true;
        this.H0 = new r1(this, 0);
        this.I0 = new r1(this, 1);
        this.J0 = new ArrayList();
        this.L0 = true;
        this.M0 = 0.5f;
        this.O0 = true;
        this.N0 = c6Var;
        this.Z = i10;
        int e10 = e(g6.f23133h5);
        this.Q0 = e10;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e10) < 0.721f;
        this.P0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.f22808w0 = rect;
        if (i10 != 3 || this.P0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f22806v0 = mutate;
            this.f22810x0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.D = i10 == 3;
    }
}
