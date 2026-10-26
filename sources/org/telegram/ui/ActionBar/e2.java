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
import bi.u7;
import bi.uc;
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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.k80;
public class e2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int l1 = 0;
    public boolean A0;
    public final Drawable B0;
    public final Rect C0;
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
    public e2 K;
    public boolean K0;
    public int L;
    public boolean L0;
    public DialogInterface.OnClickListener M;
    public boolean M0;
    public DialogInterface.OnDismissListener N;
    public final r1 N0;
    public Utilities.Callback O;
    public final r1 O0;
    public CharSequence[] P;
    public final ArrayList P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public boolean R0;
    public String S;
    public float S0;
    public CharSequence T;
    public final u6 T0;
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
    public int f22555a;
    public int f22556a0;
    public FrameLayout f22557a1;
    public View f22558b;
    public Drawable f22559b0;
    public bi.c f22560b1;
    public TextView f22561c;
    public int f22562c0;
    public a2 f22563c1;
    public su d;
    public int f22564d0;
    public int f22565d1;
    public int e;
    public u6 f22566e0;
    public int f22567e1;
    public xh.n f22568f;
    public final int f22569f0;
    public int f22570f1;
    public int f22571g0;
    public int f22572g1;
    public TextView h;
    public boolean f22573h0;
    public int f22574h1;
    public boolean f22575i0;
    public boolean f22576i1;
    public boolean f22577j0;
    public boolean f22578j1;
    public boolean f22579k0;
    public final c2 f22580k1;
    public boolean f22581l0;
    public ak0 m0;
    public su f22582n;
    public CharSequence f22583n0;
    public b2 f22584o0;
    public CharSequence f22585p0;
    public b2 f22586q0;
    public FrameLayout f22587r;
    public String f22588r0;
    public FrameLayout f22589s;
    public li.e4 f22590s0;
    public CharSequence f22591t0;
    public b2 f22592u0;
    public w1 v;
    public ViewGroup f22593v0;
    public LinearLayout f22594w;
    public i90 f22595w0;
    public z1 f22596x;
    public TextView f22597x0;
    public final BitmapDrawable[] f22598y;
    public k80 f22599y0;
    public final int[] f22600z0;

    public e2(Context context) {
        this(context, 3, null);
    }

    public static void a(e2 e2Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = e2Var.E;
        AnimatorSet[] animatorSetArr = e2Var.F;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = e2Var.f22598y[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new b3(e2Var, i10, 1));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e) {
                FileLog.e(e);
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
            AndroidUtilities.runOnUIThread(new r1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f22593v0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        su suVar;
        if (i10 == NotificationCenter.emojiLoaded && (suVar = this.f22582n) != null) {
            suVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new r1(this, 0));
        } else if (!this.f22578j1) {
            this.f22578j1 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            e2 e2Var = this.K;
            if (e2Var != null) {
                e2Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            if (this.G0 != null && (bitmap = this.E0) != null) {
                bitmap.recycle();
                this.G0 = null;
                this.H0 = null;
                this.E0 = null;
            }
        }
    }

    public final int e() {
        int dp;
        int dp2 = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(48.0f)) - (this.X0 * 2);
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
        Rect rect = this.C0;
        return min + rect.left + rect.right;
    }

    public int f(int i10) {
        return y6.w0(i10, this.T0);
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
        int i14;
        float f12;
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
        a2 a2Var = new a2(getContext(), this);
        this.f22563c1 = a2Var;
        a2Var.setOrientation(1);
        boolean z11 = this.V0;
        int i27 = this.f22569f0;
        if ((z11 || i27 == 3) && i27 != 2) {
            this.f22563c1.setBackground(null);
            this.f22563c1.setPadding(0, 0, 0, 0);
            if (this.V0) {
                this.f22563c1.setWillNotDraw(false);
            }
            this.f22579k0 = false;
        } else {
            boolean z12 = this.f22581l0;
            Drawable drawable = this.B0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f22563c1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f22579k0 = true;
            } else {
                this.f22563c1.setBackground(null);
                this.f22563c1.setPadding(0, 0, 0, 0);
                this.f22563c1.setBackground(drawable);
                a2 a2Var2 = this.f22563c1;
                ag.v0 v0Var = ag.z0.f1400a;
                a2Var2.setOutlineProvider(new ag.x0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.f22563c1.setClipToOutline(true);
                this.f22579k0 = false;
            }
        }
        ViewGroup viewGroup = this.f22563c1;
        boolean z13 = this.Z0;
        u6 u6Var = this.T0;
        if (z13) {
            if (this.f22557a1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.f22557a1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final e2 f23094b;

                    {
                        this.f23094b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23094b.dismiss();
                                return;
                            case 1:
                                e2 e2Var = this.f23094b;
                                new uc(e2Var.getContext(), e2Var.T0).show();
                                return;
                            default:
                                e2 e2Var2 = this.f23094b;
                                DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(e2Var2, ((Integer) view.getTag()).intValue());
                                }
                                e2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.f22560b1 == null) {
                bi.c cVar = new bi.c(getContext(), UserConfig.selectedAccount, u6Var);
                this.f22560b1 = cVar;
                gb1.b(cVar);
                this.f22560b1.setOnClickListener(new View.OnClickListener(this) {
                    public final e2 f23094b;

                    {
                        this.f23094b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23094b.dismiss();
                                return;
                            case 1:
                                e2 e2Var = this.f23094b;
                                new uc(e2Var.getContext(), e2Var.T0).show();
                                return;
                            default:
                                e2 e2Var2 = this.f23094b;
                                DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(e2Var2, ((Integer) view.getTag()).intValue());
                                }
                                e2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.f22563c1);
            AndroidUtilities.removeFromParent(this.f22560b1);
            this.f22557a1.addView(this.f22563c1, gb1.i(-2, -2, 17));
            this.f22557a1.addView(this.f22560b1, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.f22557a1;
        }
        if (z10) {
            if (this.Z0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f22555a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f22583n0 == null && this.f22585p0 == null && this.f22588r0 == null && this.f22591t0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.U != 0 || this.X != 0 || this.f22559b0 != null) {
            f7 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.m0 = imageView;
            Drawable drawable2 = this.f22559b0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f22559b0;
                if (drawable3 instanceof org.telegram.ui.Components.a7) {
                    org.telegram.ui.Components.a7 a7Var = (org.telegram.ui.Components.a7) drawable3;
                    this.m0.addOnAttachStateChangeListener(new v1(a7Var));
                    a7Var.a(this.m0);
                }
            } else {
                int i28 = this.U;
                if (i28 != 0) {
                    imageView.setImageResource(i28);
                } else {
                    imageView.setAutoRepeat(this.U0);
                    ak0 ak0Var = this.m0;
                    int i29 = this.X;
                    int i30 = this.Y;
                    ak0Var.f(i29, i30, i30, null);
                    if (this.Z != null) {
                        xj0 animatedDrawable = this.m0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f34758s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f22567e1 = this.f22562c0;
                    }
                    this.m0.d();
                }
            }
            this.m0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.m0.setBackground(new d2(this.m0, this.f22562c0, AndroidUtilities.dp(52.0f) + this.Y, this.f22564d0, this.f22566e0));
                this.f22556a0 = 92;
            } else if (this.f22564d0 >= 0) {
                f7.C(this.m0, y6.d0(AndroidUtilities.dp(10.0f), 0, this.f22562c0), f7.N(this.f22564d0), this.f22566e0);
            } else {
                this.m0.setBackground(y6.d0(AndroidUtilities.dp(10.0f), 0, this.f22562c0));
            }
            if (this.W) {
                this.m0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.m0.setTranslationY(0.0f);
            }
            this.m0.setPadding(0, 0, 0, 0);
            this.f22563c1.addView(this.m0, gb1.x(-1, this.f22556a0, 51, 0, 0, 0, 0));
        } else {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.f22563c1.addView(this.V, gb1.x(-1, this.f22556a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f22589s = frameLayout2;
            this.f22563c1.addView(frameLayout2, gb1.x(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            xh.n nVar = new xh.n(getContext(), null, false);
            this.f22568f = nVar;
            NotificationCenter.listenEmojiLoading(nVar);
            xh.n nVar2 = this.f22568f;
            nVar2.f51914s = 3;
            nVar2.setText(this.R);
            xh.n nVar3 = this.f22568f;
            int f16 = f(y6.f23464j5);
            this.f22572g1 = f16;
            nVar3.setTextColor(f16);
            this.f22568f.setTextSize(1, 20.0f);
            this.f22568f.setTypeface(AndroidUtilities.bold());
            xh.n nVar4 = this.f22568f;
            if (this.W) {
                i24 = 1;
            } else if (LocaleController.isRTL) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            nVar4.setGravity(i24 | 48);
            FrameLayout frameLayout3 = this.f22589s;
            xh.n nVar5 = this.f22568f;
            boolean z14 = this.W;
            if (z14) {
                i25 = 1;
            } else if (LocaleController.isRTL) {
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
            frameLayout3.addView(nVar5, gb1.h(-2, -2.0f, i31, 0.0f, 19.0f, 0.0f, f15));
        }
        String str = this.S;
        c2 c2Var = this.f22580k1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            f7.V(this.h, y6.J5, c2Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21 | 48);
            a2 a2Var3 = this.f22563c1;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
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
            a2Var3.addView(textView3, gb1.x(-2, -2, i32, 24, 0, 24, i23));
        } else {
            f10 = 20.0f;
        }
        if (i27 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f22598y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            w1 w1Var = new w1(this, getContext(), 0);
            this.v = w1Var;
            w1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, f(y6.A5));
            this.f22563c1.addView(this.v, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f22594w = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 4.0f;
            this.v.addView(this.f22594w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f11 = 4.0f;
        }
        su suVar = new su(getContext());
        this.f22582n = suVar;
        NotificationCenter.listenEmojiLoading(suVar);
        su suVar2 = this.f22582n;
        if (this.W) {
            i10 = y6.f23748y6;
        } else {
            i10 = y6.f23464j5;
        }
        int f17 = f(i10);
        this.f22574h1 = f17;
        suVar2.setTextColor(f17);
        this.f22582n.setTextSize(1, f7);
        this.f22582n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f7.H(this.f22582n, y6.f23483k5, c2Var);
        if (!this.f22573h0) {
            this.f22582n.setClickable(false);
            this.f22582n.setEnabled(false);
        }
        su suVar3 = this.f22582n;
        if (this.W) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        suVar3.setGravity(i11 | 48);
        if (i27 == 2) {
            a2 a2Var4 = this.f22563c1;
            su suVar4 = this.f22582n;
            if (LocaleController.isRTL) {
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
            a2Var4.addView(suVar4, gb1.x(-2, -2, i33, 24, i18, 24, 20));
            i90 i90Var = new i90(getContext());
            this.f22595w0 = i90Var;
            i90Var.a(this.f22571g0 / 100.0f, false);
            this.f22595w0.setProgressColor(f(y6.F5));
            this.f22595w0.setBackColor(f(y6.G5));
            this.f22563c1.addView(this.f22595w0, gb1.x(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f22597x0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f22597x0;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView5.setGravity(i19 | 48);
            f7.V(this.f22597x0, y6.q5, c2Var);
            this.f22597x0.setTextSize(1, 14.0f);
            a2 a2Var5 = this.f22563c1;
            TextView textView6 = this.f22597x0;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            a2Var5.addView(textView6, gb1.x(-2, -2, i20 | 48, 23, 4, 23, 24));
            this.f22597x0.setText(String.format("%d%%", Integer.valueOf(this.f22571g0)));
        } else if (i27 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f22587r = new FrameLayout(getContext());
            int i34 = y6.M5;
            this.f22565d1 = i34;
            this.W0 = f(i34);
            if (!this.V0) {
                this.f22587r.setBackgroundDrawable(y6.c0(AndroidUtilities.dp(18.0f), this.W0));
            }
            this.f22563c1.addView(this.f22587r, gb1.u(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), u6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(f(y6.N5));
            this.f22587r.addView(radialProgressView, gb1.i(86, 86, 17));
        } else {
            su suVar5 = this.d;
            if (suVar5 != null) {
                this.f22594w.addView(suVar5, gb1.o(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f22594w;
            su suVar6 = this.f22582n;
            if (this.W) {
                i12 = 1;
            } else if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (this.f22558b == null && this.P == null) {
                i13 = 0;
            } else {
                i13 = this.G;
            }
            linearLayout2.addView(suVar6, gb1.x(-2, -2, i35, 24, 0, 24, i13));
            TextView textView7 = this.f22561c;
            if (textView7 != null) {
                this.f22594w.addView(textView7, gb1.o(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f22582n.setText(this.T);
            this.f22582n.setVisibility(0);
        } else {
            this.f22582n.setVisibility(8);
        }
        if (this.P != null) {
            int i36 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i36 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i36] != null) {
                    y1 y1Var = new y1(getContext(), u6Var);
                    CharSequence charSequence = this.P[i36];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i16 = iArr[i36];
                    } else {
                        i16 = 0;
                    }
                    y1Var.a(i16, charSequence);
                    y1Var.setTag(Integer.valueOf(i36));
                    this.P0.add(y1Var);
                    this.f22594w.addView(y1Var, gb1.r(-1, 50));
                    y1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final e2 f23094b;

                        {
                            this.f23094b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f23094b.dismiss();
                                    return;
                                case 1:
                                    e2 e2Var = this.f23094b;
                                    new uc(e2Var.getContext(), e2Var.T0).show();
                                    return;
                                default:
                                    e2 e2Var2 = this.f23094b;
                                    DialogInterface.OnClickListener onClickListener = e2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(e2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    e2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i36++;
            }
        }
        View view2 = this.f22558b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f22558b.getParent()).removeView(this.f22558b);
            }
            this.f22594w.addView(this.f22558b, gb1.r(-1, this.e));
        }
        if (objArr != null) {
            if (!this.K0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f22583n0;
                if (charSequence2 != null) {
                    i15 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i15 = 0;
                }
                if (this.f22585p0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f22585p0;
                    i15 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.f22588r0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.f22588r0;
                    i15 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.f22591t0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f22591t0;
                    i15 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (i15 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.L0 && this.f22583n0 != null && this.f22585p0 != null && this.f22588r0 != null && this.f22591t0 != null) {
                        this.M0 = true;
                    } else {
                        this.K0 = true;
                    }
                }
            }
            if (this.K0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f22593v0 = linearLayout3;
            } else {
                this.f22593v0 = new x2(this, getContext(), 1);
            }
            if (this.f22561c != null) {
                this.f22593v0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f22593v0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f22593v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            a2 a2Var6 = this.f22563c1;
            ViewGroup viewGroup2 = this.f22593v0;
            if (this.M0) {
                i14 = 96;
            } else {
                i14 = 52;
            }
            a2Var6.addView(viewGroup2, gb1.r(-1, i14));
            if (this.W) {
                this.f22593v0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f22583n0 != null) {
                f12 = 64.0f;
                x1 x1Var = new x1(getContext(), 0);
                x1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                x1Var.setTag(-1);
                x1Var.setTextSize(1, 16.0f);
                f7.V(x1Var, this.I, c2Var);
                x1Var.setGravity(17);
                x1Var.setTypeface(AndroidUtilities.bold());
                x1Var.setText(this.f22583n0);
                f13 = 6.0f;
                x1Var.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.K0) {
                    f14 = 12.0f;
                    this.f22593v0.addView(x1Var, gb1.u(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.f22593v0.addView(x1Var, gb1.i(-2, 40, 53));
                }
                x1Var.setOnClickListener(new bi.q(28, this, x1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.f22585p0 != null) {
                x1 x1Var2 = new x1(getContext(), 1);
                x1Var2.setMinWidth(AndroidUtilities.dp(f12));
                x1Var2.setTag(-2);
                x1Var2.setTextSize(1, 16.0f);
                f7.V(x1Var2, this.I, c2Var);
                x1Var2.setGravity(17);
                x1Var2.setTypeface(AndroidUtilities.bold());
                x1Var2.setEllipsize(TextUtils.TruncateAt.END);
                x1Var2.setSingleLine(true);
                x1Var2.setText(this.f22585p0.toString());
                x1Var2.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var2.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f22593v0.addView(x1Var2, 0, gb1.u(-1, 40, 7));
                } else {
                    this.f22593v0.addView(x1Var2, gb1.i(-2, 40, 53));
                }
                x1Var2.setOnClickListener(new bi.q(29, this, x1Var2));
            }
            if (this.f22591t0 != null) {
                x1 x1Var3 = new x1(getContext(), 2);
                x1Var3.setMinWidth(AndroidUtilities.dp(f12));
                x1Var3.setTag(-3);
                x1Var3.setTextSize(1, 16.0f);
                f7.V(x1Var3, this.I, c2Var);
                x1Var3.setGravity(17);
                x1Var3.setTypeface(AndroidUtilities.bold());
                x1Var3.setEllipsize(TextUtils.TruncateAt.END);
                x1Var3.setSingleLine(true);
                x1Var3.setText(this.f22591t0.toString());
                x1Var3.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var3.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f22593v0.addView(x1Var3, 1, gb1.u(-1, 40, 7));
                } else {
                    this.f22593v0.addView(x1Var3, gb1.i(-2, 40, 51));
                }
                x1Var3.setOnClickListener(new u1(0, this, x1Var3));
            }
            if (this.f22588r0 != null) {
                x1 x1Var4 = new x1(getContext(), 3);
                x1Var4.setMinWidth(AndroidUtilities.dp(f12));
                x1Var4.setTag(-4);
                x1Var4.setTextSize(1, 16.0f);
                f7.V(x1Var4, this.I, c2Var);
                x1Var4.setGravity(17);
                x1Var4.setTypeface(AndroidUtilities.bold());
                x1Var4.setEllipsize(TextUtils.TruncateAt.END);
                x1Var4.setSingleLine(true);
                x1Var4.setText(this.f22588r0.toString());
                x1Var4.setBackground(y6.I0(AndroidUtilities.dp(f10), f(this.I)));
                x1Var4.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f22593v0.addView(x1Var4, 0, gb1.u(-1, 40, 7));
                } else {
                    this.f22593v0.addView(x1Var4, gb1.i(-2, 40, 53));
                }
                x1Var4.setOnClickListener(new u1(1, this, x1Var4));
            }
            if (this.K0) {
                for (int i37 = 1; i37 < this.f22593v0.getChildCount(); i37++) {
                    ((ViewGroup.MarginLayoutParams) this.f22593v0.getChildAt(i37).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
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
            this.L = AndroidUtilities.displaySize.x;
            this.f22563c1.getLayoutParams().width = e();
            window.setWindowAnimations(R.style.DialogNoAnimation);
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
            this.L = AndroidUtilities.displaySize.x;
            layoutParams3.width = e();
        }
        View view3 = this.f22558b;
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
            AndroidUtilities.makeGlobalBlurBitmap(new y0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final qf.c h(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f22577j0 = false;
        }
        return new qf.c(new q(d, 5), new u7(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            f7.V(textView, y6.f23598q7, this.f22580k1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f22594w.invalidate();
    }

    public final void j(int i10) {
        this.f22565d1 = -1;
        this.W0 = i10;
        Drawable drawable = this.B0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f22575i0 = false;
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
                y1 y1Var = (y1) arrayList.get(i10);
                y1Var.f23285a.setTextColor(i11);
                y1Var.f23286b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.T = str;
        if (this.f22582n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f22582n.setText(this.T);
                this.f22582n.setVisibility(0);
                return;
            }
            this.f22582n.setVisibility(8);
        }
    }

    public final void o(int i10) {
        this.f22571g0 = i10;
        i90 i90Var = this.f22595w0;
        if (i90Var != null) {
            i90Var.a(i10 / 100.0f, true);
            this.f22597x0.setText(String.format("%d%%", Integer.valueOf(this.f22571g0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        k80 k80Var = this.f22599y0;
        if (k80Var != null) {
            k80Var.h(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p(int i10) {
        this.f22576i1 = true;
        xh.n nVar = this.f22568f;
        if (nVar != null) {
            nVar.setTextColor(i10);
        }
        su suVar = this.f22582n;
        if (suVar != null) {
            suVar.setTextColor(i10);
        }
    }

    public final void q() {
        if (this.f22575i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.T0);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new p(this, 2));
            alertDialog$Builder.j(new s1(this, 0));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        r1 r1Var = this.O0;
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var, j10);
    }

    public final void s() {
        ak0 ak0Var;
        int w02;
        if (this.f22564d0 >= 0 && this.Z != null && (ak0Var = this.m0) != null && ak0Var.getAnimatedDrawable() != null && (w02 = y6.w0(this.f22564d0, this.f22566e0)) != this.f22567e1) {
            xj0 animatedDrawable = this.m0.getAnimatedDrawable();
            for (Map.Entry entry : this.Z.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f22567e1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f22567e1 = w02;
        }
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
        this.J = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.R = charSequence;
        xh.n nVar = this.f22568f;
        if (nVar != null) {
            nVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.f22578j1 = false;
        super.show();
        FrameLayout frameLayout = this.f22587r;
        if (frameLayout != null && this.f22569f0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f22587r.setScaleY(0.0f);
            this.f22587r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.Y0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        w1 w1Var = this.v;
        if (w1Var != null) {
            w1Var.removeCallbacks(runnable);
        }
    }

    public e2(Context context, int i10, u6 u6Var) {
        super(context, R.style.TransparentDialog);
        this.f22555a = -1;
        this.e = -2;
        this.f22598y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = y6.H5;
        this.f22556a0 = 132;
        this.f22564d0 = -1;
        this.f22573h0 = true;
        this.f22575i0 = true;
        this.f22577j0 = true;
        this.f22600z0 = new int[2];
        this.A0 = true;
        this.N0 = new r1(this, 0);
        this.O0 = new r1(this, 1);
        this.P0 = new ArrayList();
        this.R0 = true;
        this.S0 = 0.5f;
        this.U0 = true;
        this.f22565d1 = -1;
        this.f22580k1 = new c2(this, 0);
        this.T0 = u6Var;
        this.f22569f0 = i10;
        int i11 = y6.f23427h5;
        this.f22565d1 = i11;
        int f7 = f(i11);
        this.W0 = f7;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(f7) < 0.721f;
        this.V0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.C0 = rect;
        if (i10 != 3 || this.V0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.B0 = mutate;
            this.D0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
