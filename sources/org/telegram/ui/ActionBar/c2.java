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
import gh.fa;
import java.util.ArrayList;
import java.util.Map;
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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vt;
import org.telegram.ui.e80;
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
    public final b6 N0;
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
    public gh.b V0;
    public int W;
    public a2 W0;
    public Drawable X;
    public boolean X0;
    public int Y;
    public final int Z;
    public int f22761a;
    public int f22762a0;
    public View f22763b;
    public boolean f22764b0;
    public TextView f22765c;
    public boolean f22766c0;
    public vt d;
    public boolean f22767d0;
    public int f22768e;
    public boolean f22769e0;
    public dh.u f22770f;
    public boolean f22771f0;
    public pi0 f22772g0;
    public TextView h;
    public CharSequence f22773h0;
    public b2 f22774i0;
    public CharSequence f22775j0;
    public b2 f22776k0;
    public String f22777l0;
    public qh.v3 m0;
    public vt f22778n;
    public CharSequence f22779n0;
    public b2 f22780o0;
    public ViewGroup f22781p0;
    public v70 f22782q0;
    public FrameLayout f22783r;
    public TextView f22784r0;
    public FrameLayout f22785s;
    public e80 f22786s0;
    public final int[] f22787t0;
    public boolean f22788u0;
    public w1 v;
    public final Drawable f22789v0;
    public LinearLayout f22790w;
    public final Rect f22791w0;
    public z1 f22792x;
    public final float f22793x0;
    public final BitmapDrawable[] f22794y;
    public Bitmap f22795y0;
    public Matrix f22796z0;

    public c2(Context context) {
        this(context, 3, null);
    }

    public static void a(c2 c2Var, int i9, boolean z10) {
        int i10;
        boolean[] zArr = c2Var.A;
        AnimatorSet[] animatorSetArr = c2Var.B;
        if ((z10 && !zArr[i9]) || (!z10 && zArr[i9])) {
            zArr[i9] = z10;
            AnimatorSet animatorSet = animatorSetArr[i9];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i9] = animatorSet2;
            BitmapDrawable bitmapDrawable = c2Var.f22794y[i9];
            if (bitmapDrawable != null) {
                if (z10) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i10));
            }
            animatorSetArr[i9].setDuration(150L);
            animatorSetArr[i9].addListener(new x2(c2Var, i9, 1));
            try {
                animatorSetArr[i9].start();
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

    public final View d(int i9) {
        ViewGroup viewGroup = this.f22781p0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i9));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        vt vtVar;
        if (i9 == NotificationCenter.emojiLoaded && (vtVar = this.f22778n) != null) {
            vtVar.invalidate();
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
            if (this.A0 != null && (bitmap = this.f22795y0) != null) {
                bitmap.recycle();
                this.A0 = null;
                this.B0 = null;
                this.f22795y0 = null;
            }
        }
    }

    public int e(int i9) {
        return f6.v0(i9, this.N0);
    }

    public final ViewGroup f(boolean z10) {
        boolean z11;
        float f10;
        float f11;
        int i9;
        int i10;
        int i11;
        int i12;
        int dp;
        int i13;
        float f12;
        float f13;
        float f14;
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
        float f15;
        a2 a2Var = new a2(getContext(), this);
        this.W0 = a2Var;
        a2Var.setOrientation(1);
        boolean z12 = this.P0;
        int i26 = this.Z;
        if ((z12 || i26 == 3) && i26 != 2) {
            this.W0.setBackground(null);
            this.W0.setPadding(0, 0, 0, 0);
            if (this.P0) {
                this.W0.setWillNotDraw(false);
            }
            this.f22769e0 = false;
        } else {
            boolean z13 = this.f22771f0;
            Drawable drawable = this.f22789v0;
            if (z13) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.W0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f22769e0 = true;
            } else {
                this.W0.setBackground(null);
                this.W0.setPadding(0, 0, 0, 0);
                this.W0.setBackground(drawable);
                a2 a2Var2 = this.W0;
                bg.q1 q1Var = ff.r0.f6254a;
                a2Var2.setOutlineProvider(new ff.q0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.W0.setClipToOutline(true);
                this.f22769e0 = false;
            }
        }
        ViewGroup viewGroup = this.W0;
        boolean z14 = this.T0;
        b6 b6Var = this.N0;
        if (z14) {
            if (this.U0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.U0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f23767b;

                    {
                        this.f23767b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23767b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f23767b;
                                new fa(c2Var.getContext(), c2Var.N0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f23767b;
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
                gh.b bVar = new gh.b(getContext(), UserConfig.selectedAccount, b6Var);
                this.V0 = bVar;
                g7.g6.a(bVar);
                this.V0.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f23767b;

                    {
                        this.f23767b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23767b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f23767b;
                                new fa(c2Var.getContext(), c2Var.N0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f23767b;
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
            this.U0.addView(this.W0, g7.e6.e(-2, -2, 17));
            this.U0.addView(this.V0, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.U0;
        }
        if (z10) {
            if (this.T0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f22761a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f22773h0 == null && this.f22775j0 == null && this.f22777l0 == null && this.f22779n0 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.Q == 0 && this.T == 0 && this.X == null) {
            View view = this.R;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.W0.addView(this.R, g7.e6.t(-1, this.W, 51, 0, 0, 0, 0));
            }
        } else {
            ?? imageView = new ImageView(getContext());
            this.f22772g0 = imageView;
            Drawable drawable2 = this.X;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.X;
                if (drawable3 instanceof r6) {
                    r6 r6Var = (r6) drawable3;
                    this.f22772g0.addOnAttachStateChangeListener(new u1(r6Var));
                    r6Var.a(this.f22772g0);
                }
            } else {
                int i27 = this.Q;
                if (i27 != 0) {
                    imageView.setImageResource(i27);
                } else {
                    imageView.setAutoRepeat(this.O0);
                    pi0 pi0Var = this.f22772g0;
                    int i28 = this.T;
                    int i29 = this.U;
                    pi0Var.f(i28, i29, i29, null);
                    if (this.V != null) {
                        mi0 animatedDrawable = this.f22772g0.getAnimatedDrawable();
                        for (Map.Entry entry : this.V.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f30864s.put((String) entry.getKey(), num);
                            animatedDrawable.E();
                        }
                    }
                    this.f22772g0.d();
                }
            }
            this.f22772g0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.S) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Y);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f22772g0.setBackground(new v1(this, gradientDrawable));
                this.W = 92;
            } else {
                this.f22772g0.setBackground(f6.c0(AndroidUtilities.dp(10.0f), 0, this.Y));
            }
            if (this.S) {
                this.f22772g0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f22772g0.setTranslationY(0.0f);
            }
            this.f22772g0.setPadding(0, 0, 0, 0);
            this.W0.addView(this.f22772g0, g7.e6.t(-1, this.W, 51, 0, 0, 0, 0));
        }
        if (this.N != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f22785s = frameLayout2;
            this.W0.addView(frameLayout2, g7.e6.t(-2, -2, this.S ? 1 : 0, 24, 0, 24, 0));
            dh.u uVar = new dh.u(getContext(), null, false);
            this.f22770f = uVar;
            NotificationCenter.listenEmojiLoading(uVar);
            dh.u uVar2 = this.f22770f;
            uVar2.h = 3;
            uVar2.setText(this.N);
            this.f22770f.setTextColor(e(f6.f23108j5));
            this.f22770f.setTextSize(1, 20.0f);
            this.f22770f.setTypeface(AndroidUtilities.bold());
            dh.u uVar3 = this.f22770f;
            if (this.S) {
                i23 = 1;
            } else if (LocaleController.isRTL) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            uVar3.setGravity(i23 | 48);
            FrameLayout frameLayout3 = this.f22785s;
            dh.u uVar4 = this.f22770f;
            boolean z15 = this.S;
            if (z15) {
                i24 = 1;
            } else if (LocaleController.isRTL) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i30 = i24 | 48;
            if (z15) {
                f15 = 4.0f;
            } else {
                if (this.O != null) {
                    i25 = 2;
                } else if (this.L != null) {
                    i25 = 14;
                } else {
                    i25 = 10;
                }
                f15 = i25;
            }
            frameLayout3.addView(uVar4, g7.e6.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f15));
        }
        if (this.O != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.O);
            this.h.setTextColor(e(f6.J5));
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20 | 48);
            a2 a2Var3 = this.W0;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i31 = i21 | 48;
            if (this.L != null) {
                i22 = 14;
            } else {
                i22 = 10;
            }
            a2Var3.addView(textView3, g7.e6.t(-2, -2, i31, 24, 0, 24, i22));
        }
        if (i26 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f22794y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            w1 w1Var = new w1(this, getContext(), 0);
            this.v = w1Var;
            w1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(f6.A5));
            this.W0.addView(this.v, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f22790w = linearLayout;
            linearLayout.setOrientation(1);
            f10 = 20.0f;
            f11 = 4.0f;
            this.v.addView(this.f22790w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f10 = 20.0f;
            f11 = 4.0f;
        }
        vt vtVar = new vt(getContext());
        this.f22778n = vtVar;
        NotificationCenter.listenEmojiLoading(vtVar);
        vt vtVar2 = this.f22778n;
        if (this.S) {
            i9 = f6.f23369y6;
        } else {
            i9 = f6.f23108j5;
        }
        vtVar2.setTextColor(e(i9));
        this.f22778n.setTextSize(1, 16.0f);
        this.f22778n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f22778n.setLinkTextColor(e(f6.f23126k5));
        if (!this.f22764b0) {
            this.f22778n.setClickable(false);
            this.f22778n.setEnabled(false);
        }
        vt vtVar3 = this.f22778n;
        if (this.S) {
            i10 = 1;
        } else if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        vtVar3.setGravity(i10 | 48);
        if (i26 == 2) {
            a2 a2Var4 = this.W0;
            vt vtVar4 = this.f22778n;
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
            a2Var4.addView(vtVar4, g7.e6.t(-2, -2, i32, 24, i17, 24, 20));
            v70 v70Var = new v70(getContext());
            this.f22782q0 = v70Var;
            v70Var.a(this.f22762a0 / 100.0f, false);
            this.f22782q0.setProgressColor(e(f6.F5));
            this.f22782q0.setBackColor(e(f6.G5));
            this.W0.addView(this.f22782q0, g7.e6.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f22784r0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f22784r0;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            this.f22784r0.setTextColor(e(f6.f23228q5));
            this.f22784r0.setTextSize(1, 14.0f);
            a2 a2Var5 = this.W0;
            TextView textView6 = this.f22784r0;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            a2Var5.addView(textView6, g7.e6.t(-2, -2, i19 | 48, 23, 4, 23, 24));
            this.f22784r0.setText(String.format("%d%%", Integer.valueOf(this.f22762a0)));
        } else if (i26 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f22783r = new FrameLayout(getContext());
            this.Q0 = e(f6.M5);
            if (!this.P0) {
                this.f22783r.setBackgroundDrawable(f6.b0(AndroidUtilities.dp(18.0f), this.Q0));
            }
            this.W0.addView(this.f22783r, g7.e6.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), b6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(f6.N5));
            this.f22783r.addView(radialProgressView, g7.e6.e(86, 86, 17));
        } else {
            vt vtVar5 = this.d;
            if (vtVar5 != null) {
                this.f22790w.addView(vtVar5, g7.e6.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f22790w;
            vt vtVar6 = this.f22778n;
            if (this.S) {
                i11 = 1;
            } else if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i33 = i11 | 48;
            if (this.f22763b == null && this.L == null) {
                i12 = 0;
            } else {
                i12 = this.C;
            }
            linearLayout2.addView(vtVar6, g7.e6.t(-2, -2, i33, 24, 0, 24, i12));
            TextView textView7 = this.f22765c;
            if (textView7 != null) {
                this.f22790w.addView(textView7, g7.e6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.P)) {
            this.f22778n.setText(this.P);
            this.f22778n.setVisibility(0);
        } else {
            this.f22778n.setVisibility(8);
        }
        if (this.L != null) {
            int i34 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i34 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i34] != null) {
                    y1 y1Var = new y1(getContext(), b6Var);
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
                    this.f22790w.addView(y1Var, g7.e6.n(-1, 50));
                    y1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final c2 f23767b;

                        {
                            this.f23767b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f23767b.dismiss();
                                    return;
                                case 1:
                                    c2 c2Var = this.f23767b;
                                    new fa(c2Var.getContext(), c2Var.N0).show();
                                    return;
                                default:
                                    c2 c2Var2 = this.f23767b;
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
        View view2 = this.f22763b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f22763b.getParent()).removeView(this.f22763b);
            }
            this.f22790w.addView(this.f22763b, g7.e6.n(-1, this.f22768e));
        }
        if (z11) {
            if (!this.E0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f22773h0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f22775j0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f22775j0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f22777l0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    String str = this.f22777l0;
                    i14 = (int) (textPaint.measureText((CharSequence) str, 0, str.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f22779n0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f22779n0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (i14 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.F0 && this.f22773h0 != null && this.f22775j0 != null && this.f22777l0 != null && this.f22779n0 != null) {
                        this.G0 = true;
                    } else {
                        this.E0 = true;
                    }
                }
            }
            if (this.E0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f22781p0 = linearLayout3;
            } else {
                this.f22781p0 = new t2(this, getContext(), 1);
            }
            if (this.f22765c != null) {
                this.f22781p0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f22781p0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f22781p0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            a2 a2Var6 = this.W0;
            ViewGroup viewGroup2 = this.f22781p0;
            if (this.G0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            a2Var6.addView(viewGroup2, g7.e6.n(-1, i13));
            if (this.S) {
                this.f22781p0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f22773h0 != null) {
                f12 = 64.0f;
                x1 x1Var = new x1(getContext(), 0);
                x1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                x1Var.setTag(-1);
                x1Var.setTextSize(1, 16.0f);
                x1Var.setTextColor(e(this.E));
                x1Var.setGravity(17);
                x1Var.setTypeface(AndroidUtilities.bold());
                x1Var.setText(this.f22773h0);
                f13 = 6.0f;
                x1Var.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    f14 = 12.0f;
                    this.f22781p0.addView(x1Var, g7.e6.q(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.f22781p0.addView(x1Var, g7.e6.e(-2, 40, 53));
                }
                x1Var.setOnClickListener(new mh.k3(5, this, x1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.f22775j0 != null) {
                x1 x1Var2 = new x1(getContext(), 1);
                x1Var2.setMinWidth(AndroidUtilities.dp(f12));
                x1Var2.setTag(-2);
                x1Var2.setTextSize(1, 16.0f);
                x1Var2.setTextColor(e(this.E));
                x1Var2.setGravity(17);
                x1Var2.setTypeface(AndroidUtilities.bold());
                x1Var2.setEllipsize(TextUtils.TruncateAt.END);
                x1Var2.setSingleLine(true);
                x1Var2.setText(this.f22775j0.toString());
                x1Var2.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var2.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.f22781p0.addView(x1Var2, 0, g7.e6.q(-1, 40, 7));
                } else {
                    this.f22781p0.addView(x1Var2, g7.e6.e(-2, 40, 53));
                }
                x1Var2.setOnClickListener(new mh.k3(6, this, x1Var2));
            }
            if (this.f22779n0 != null) {
                x1 x1Var3 = new x1(getContext(), 2);
                x1Var3.setMinWidth(AndroidUtilities.dp(f12));
                x1Var3.setTag(-3);
                x1Var3.setTextSize(1, 16.0f);
                x1Var3.setTextColor(e(this.E));
                x1Var3.setGravity(17);
                x1Var3.setTypeface(AndroidUtilities.bold());
                x1Var3.setEllipsize(TextUtils.TruncateAt.END);
                x1Var3.setSingleLine(true);
                x1Var3.setText(this.f22779n0.toString());
                x1Var3.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var3.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.f22781p0.addView(x1Var3, 1, g7.e6.q(-1, 40, 7));
                } else {
                    this.f22781p0.addView(x1Var3, g7.e6.e(-2, 40, 51));
                }
                x1Var3.setOnClickListener(new mh.k3(7, this, x1Var3));
            }
            if (this.f22777l0 != null) {
                x1 x1Var4 = new x1(getContext(), 3);
                x1Var4.setMinWidth(AndroidUtilities.dp(f12));
                x1Var4.setTag(-4);
                x1Var4.setTextSize(1, 16.0f);
                x1Var4.setTextColor(e(this.E));
                x1Var4.setGravity(17);
                x1Var4.setTypeface(AndroidUtilities.bold());
                x1Var4.setEllipsize(TextUtils.TruncateAt.END);
                x1Var4.setSingleLine(true);
                x1Var4.setText(this.f22777l0.toString());
                x1Var4.setBackground(f6.G0(AndroidUtilities.dp(f10), e(this.E)));
                x1Var4.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.E0) {
                    this.f22781p0.addView(x1Var4, 0, g7.e6.q(-1, 40, 7));
                } else {
                    this.f22781p0.addView(x1Var4, g7.e6.e(-2, 40, 53));
                }
                x1Var4.setOnClickListener(new mh.k3(8, this, x1Var4));
            }
            if (this.E0) {
                for (int i35 = 1; i35 < this.f22781p0.getChildCount(); i35++) {
                    ((ViewGroup.MarginLayoutParams) this.f22781p0.getChildAt(i35).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
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
        } else if (i26 == 3) {
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
            Rect rect2 = this.f22791w0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.f22763b;
        if (view3 != null && this.f22788u0 && b(view3)) {
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

    public final ve.d g(int i9, boolean z10, boolean z11) {
        View d = d(i9);
        if (z11) {
            this.f22767d0 = false;
        }
        return new ve.d(new p(d, 5), new gh.u5(this, d, z10, 7));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(f6.f23230q7));
        }
    }

    public final void i(int i9) {
        this.Q0 = i9;
        Drawable drawable = this.f22789v0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f22790w.invalidate();
    }

    public final void j() {
        this.f22766c0 = false;
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

    public final void l(int i9, int i10, int i11) {
        if (i9 >= 0) {
            ArrayList arrayList = this.J0;
            if (i9 < arrayList.size()) {
                y1 y1Var = (y1) arrayList.get(i9);
                y1Var.f23970a.setTextColor(i10);
                y1Var.f23971b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.P = str;
        if (this.f22778n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f22778n.setText(this.P);
                this.f22778n.setVisibility(0);
                return;
            }
            this.f22778n.setVisibility(8);
        }
    }

    public final void n(int i9) {
        this.f22762a0 = i9;
        v70 v70Var = this.f22782q0;
        if (v70Var != null) {
            v70Var.a(i9 / 100.0f, true);
            this.f22784r0.setText(String.format("%d%%", Integer.valueOf(this.f22762a0)));
        }
    }

    public final void o(int i9) {
        dh.u uVar = this.f22770f;
        if (uVar != null) {
            uVar.setTextColor(i9);
        }
        vt vtVar = this.f22778n;
        if (vtVar != null) {
            vtVar.setTextColor(i9);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        e80 e80Var = this.f22786s0;
        if (e80Var != null) {
            e80Var.f(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f22766c0 && this.G == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.N0);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
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
        dh.u uVar = this.f22770f;
        if (uVar != null) {
            uVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.X0 = false;
        super.show();
        FrameLayout frameLayout = this.f22783r;
        if (frameLayout != null && this.Z == 3) {
            frameLayout.setScaleX(0.0f);
            this.f22783r.setScaleY(0.0f);
            this.f22783r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
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

    public c2(Context context, int i9, b6 b6Var) {
        super(context, R.style.TransparentDialog);
        this.f22761a = -1;
        this.f22768e = -2;
        this.f22794y = new BitmapDrawable[2];
        this.A = new boolean[2];
        this.B = new AnimatorSet[2];
        this.C = 12;
        this.E = f6.H5;
        this.W = 132;
        this.f22764b0 = true;
        this.f22766c0 = true;
        this.f22767d0 = true;
        this.f22787t0 = new int[2];
        this.f22788u0 = true;
        this.H0 = new r1(this, 0);
        this.I0 = new r1(this, 1);
        this.J0 = new ArrayList();
        this.L0 = true;
        this.M0 = 0.5f;
        this.O0 = true;
        this.N0 = b6Var;
        this.Z = i9;
        int e10 = e(f6.f23072h5);
        this.Q0 = e10;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e10) < 0.721f;
        this.P0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.f22791w0 = rect;
        if (i9 != 3 || this.P0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f22789v0 = mutate;
            this.f22793x0 = i9 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.D = i9 == 3;
    }
}
