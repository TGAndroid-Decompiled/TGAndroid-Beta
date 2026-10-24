package org.telegram.ui.ActionBar;

import ai.ed;
import ai.y7;
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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.l80;
public class c2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
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
    public c2 K;
    public boolean K0;
    public int L;
    public boolean L0;
    public DialogInterface.OnClickListener M;
    public boolean M0;
    public DialogInterface.OnDismissListener N;
    public final p1 N0;
    public Utilities.Callback O;
    public final p1 O0;
    public CharSequence[] P;
    public final ArrayList P0;
    public int[] Q;
    public float Q0;
    public CharSequence R;
    public boolean R0;
    public String S;
    public float S0;
    public CharSequence T;
    public final g6 T0;
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
    public int f20743a;
    public int f20744a0;
    public FrameLayout f20745a1;
    public View f20746b;
    public Drawable f20747b0;
    public ai.c f20748b1;
    public TextView f20749c;
    public int f20750c0;
    public y1 f20751c1;
    public pu d;
    public int f20752d0;
    public int f20753d1;
    public int e;
    public g6 f20754e0;
    public int f20755e1;
    public wh.n f20756f;
    public final int f20757f0;
    public int f20758f1;
    public int f20759g0;
    public int f20760g1;
    public TextView h;
    public boolean f20761h0;
    public int f20762h1;
    public boolean f20763i0;
    public boolean f20764i1;
    public boolean f20765j0;
    public boolean f20766j1;
    public boolean f20767k0;
    public final a2 f20768k1;
    public boolean f20769l0;
    public ak0 m0;
    public pu f20770n;
    public CharSequence f20771n0;
    public z1 f20772o0;
    public CharSequence f20773p0;
    public z1 f20774q0;
    public FrameLayout f20775r;
    public String f20776r0;
    public FrameLayout f20777s;
    public ki.e4 f20778s0;
    public CharSequence f20779t0;
    public z1 f20780u0;
    public u1 v;
    public ViewGroup f20781v0;
    public LinearLayout f20782w;
    public f90 f20783w0;
    public x1 f20784x;
    public TextView f20785x0;
    public final BitmapDrawable[] f20786y;
    public l80 f20787y0;
    public final int[] f20788z0;

    public c2(Context context) {
        this(context, 3, null);
    }

    public static void a(c2 c2Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = c2Var.E;
        AnimatorSet[] animatorSetArr = c2Var.F;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = c2Var.f20786y[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new y2(c2Var, i10, 1));
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
            AndroidUtilities.runOnUIThread(new p1(this, 0), currentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f20781v0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pu puVar;
        if (i10 == NotificationCenter.emojiLoaded && (puVar = this.f20770n) != null) {
            puVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new p1(this, 0));
        } else if (!this.f20766j1) {
            this.f20766j1 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            c2 c2Var = this.K;
            if (c2Var != null) {
                c2Var.dismiss();
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
        return k6.w0(i10, this.T0);
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
        y1 y1Var = new y1(getContext(), this);
        this.f20751c1 = y1Var;
        y1Var.setOrientation(1);
        boolean z11 = this.V0;
        int i27 = this.f20757f0;
        if ((z11 || i27 == 3) && i27 != 2) {
            this.f20751c1.setBackground(null);
            this.f20751c1.setPadding(0, 0, 0, 0);
            if (this.V0) {
                this.f20751c1.setWillNotDraw(false);
            }
            this.f20767k0 = false;
        } else {
            boolean z12 = this.f20769l0;
            Drawable drawable = this.B0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f20751c1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f20767k0 = true;
            } else {
                this.f20751c1.setBackground(null);
                this.f20751c1.setPadding(0, 0, 0, 0);
                this.f20751c1.setBackground(drawable);
                y1 y1Var2 = this.f20751c1;
                ci.n1 n1Var = zf.j0.f52046a;
                y1Var2.setOutlineProvider(new zf.i0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.f20751c1.setClipToOutline(true);
                this.f20767k0 = false;
            }
        }
        ViewGroup viewGroup = this.f20751c1;
        boolean z13 = this.Z0;
        g6 g6Var = this.T0;
        if (z13) {
            if (this.f20745a1 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.f20745a1 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f21808b;

                    {
                        this.f21808b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21808b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f21808b;
                                new ed(c2Var.getContext(), c2Var.T0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f21808b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.f20748b1 == null) {
                ai.c cVar = new ai.c(getContext(), UserConfig.selectedAccount, g6Var);
                this.f20748b1 = cVar;
                w7.b6.a(cVar);
                this.f20748b1.setOnClickListener(new View.OnClickListener(this) {
                    public final c2 f21808b;

                    {
                        this.f21808b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21808b.dismiss();
                                return;
                            case 1:
                                c2 c2Var = this.f21808b;
                                new ed(c2Var.getContext(), c2Var.T0).show();
                                return;
                            default:
                                c2 c2Var2 = this.f21808b;
                                DialogInterface.OnClickListener onClickListener = c2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(c2Var2, ((Integer) view.getTag()).intValue());
                                }
                                c2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.f20751c1);
            AndroidUtilities.removeFromParent(this.f20748b1);
            this.f20745a1.addView(this.f20751c1, w7.z5.e(-2, -2, 17));
            this.f20745a1.addView(this.f20748b1, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.f20745a1;
        }
        if (z10) {
            if (this.Z0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f20743a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f20771n0 == null && this.f20773p0 == null && this.f20776r0 == null && this.f20779t0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.U != 0 || this.X != 0 || this.f20747b0 != null) {
            f7 = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.m0 = imageView;
            Drawable drawable2 = this.f20747b0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f20747b0;
                if (drawable3 instanceof w6) {
                    w6 w6Var = (w6) drawable3;
                    this.m0.addOnAttachStateChangeListener(new t1(w6Var));
                    w6Var.a(this.m0);
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
                            animatedDrawable.f32616s.put((String) entry.getKey(), num);
                            animatedDrawable.G();
                        }
                        this.f20755e1 = this.f20750c0;
                    }
                    this.m0.d();
                }
            }
            this.m0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                this.m0.setBackground(new b2(this.m0, this.f20750c0, AndroidUtilities.dp(52.0f) + this.Y, this.f20752d0, this.f20754e0));
                this.f20744a0 = 92;
            } else if (this.f20752d0 >= 0) {
                r6.D(this.m0, k6.d0(AndroidUtilities.dp(10.0f), 0, this.f20750c0), r6.O(this.f20752d0), this.f20754e0);
            } else {
                this.m0.setBackground(k6.d0(AndroidUtilities.dp(10.0f), 0, this.f20750c0));
            }
            if (this.W) {
                this.m0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.m0.setTranslationY(0.0f);
            }
            this.m0.setPadding(0, 0, 0, 0);
            this.f20751c1.addView(this.m0, w7.z5.t(-1, this.f20744a0, 51, 0, 0, 0, 0));
        } else {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f7 = 16.0f;
                this.f20751c1.addView(this.V, w7.z5.t(-1, this.f20744a0, 51, 0, 0, 0, 0));
            } else {
                f7 = 16.0f;
            }
        }
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f20777s = frameLayout2;
            this.f20751c1.addView(frameLayout2, w7.z5.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            wh.n nVar = new wh.n(getContext(), null, false);
            this.f20756f = nVar;
            NotificationCenter.listenEmojiLoading(nVar);
            wh.n nVar2 = this.f20756f;
            nVar2.f49551s = 3;
            nVar2.setText(this.R);
            wh.n nVar3 = this.f20756f;
            int f16 = f(k6.f21290j5);
            this.f20760g1 = f16;
            nVar3.setTextColor(f16);
            this.f20756f.setTextSize(1, 20.0f);
            this.f20756f.setTypeface(AndroidUtilities.bold());
            wh.n nVar4 = this.f20756f;
            if (this.W) {
                i24 = 1;
            } else if (LocaleController.isRTL) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            nVar4.setGravity(i24 | 48);
            FrameLayout frameLayout3 = this.f20777s;
            wh.n nVar5 = this.f20756f;
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
            frameLayout3.addView(nVar5, w7.z5.d(-2, -2.0f, i31, 0.0f, 19.0f, 0.0f, f15));
        }
        String str = this.S;
        a2 a2Var = this.f20768k1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            r6.W(this.h, k6.J5, a2Var);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21 | 48);
            y1 y1Var3 = this.f20751c1;
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
            y1Var3.addView(textView3, w7.z5.t(-2, -2, i32, 24, 0, 24, i23));
        } else {
            f10 = 20.0f;
        }
        if (i27 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f20786y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            u1 u1Var = new u1(this, getContext(), 0);
            this.v = u1Var;
            u1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, f(k6.A5));
            this.f20751c1.addView(this.v, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f20782w = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 4.0f;
            this.v.addView(this.f20782w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f11 = 4.0f;
        }
        pu puVar = new pu(getContext());
        this.f20770n = puVar;
        NotificationCenter.listenEmojiLoading(puVar);
        pu puVar2 = this.f20770n;
        if (this.W) {
            i10 = k6.f21572y6;
        } else {
            i10 = k6.f21290j5;
        }
        int f17 = f(i10);
        this.f20762h1 = f17;
        puVar2.setTextColor(f17);
        this.f20770n.setTextSize(1, f7);
        this.f20770n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        r6.I(this.f20770n, k6.f21310k5, a2Var);
        if (!this.f20761h0) {
            this.f20770n.setClickable(false);
            this.f20770n.setEnabled(false);
        }
        pu puVar3 = this.f20770n;
        if (this.W) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        puVar3.setGravity(i11 | 48);
        if (i27 == 2) {
            y1 y1Var4 = this.f20751c1;
            pu puVar4 = this.f20770n;
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
            y1Var4.addView(puVar4, w7.z5.t(-2, -2, i33, 24, i18, 24, 20));
            f90 f90Var = new f90(getContext());
            this.f20783w0 = f90Var;
            f90Var.a(this.f20759g0 / 100.0f, false);
            this.f20783w0.setProgressColor(f(k6.F5));
            this.f20783w0.setBackColor(f(k6.G5));
            this.f20751c1.addView(this.f20783w0, w7.z5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f20785x0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f20785x0;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView5.setGravity(i19 | 48);
            r6.W(this.f20785x0, k6.f21421q5, a2Var);
            this.f20785x0.setTextSize(1, 14.0f);
            y1 y1Var5 = this.f20751c1;
            TextView textView6 = this.f20785x0;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            y1Var5.addView(textView6, w7.z5.t(-2, -2, i20 | 48, 23, 4, 23, 24));
            this.f20785x0.setText(String.format("%d%%", Integer.valueOf(this.f20759g0)));
        } else if (i27 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f20775r = new FrameLayout(getContext());
            int i34 = k6.M5;
            this.f20753d1 = i34;
            this.W0 = f(i34);
            if (!this.V0) {
                this.f20775r.setBackgroundDrawable(k6.c0(AndroidUtilities.dp(18.0f), this.W0));
            }
            this.f20751c1.addView(this.f20775r, w7.z5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), g6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(f(k6.N5));
            this.f20775r.addView(radialProgressView, w7.z5.e(86, 86, 17));
        } else {
            pu puVar5 = this.d;
            if (puVar5 != null) {
                this.f20782w.addView(puVar5, w7.z5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f20782w;
            pu puVar6 = this.f20770n;
            if (this.W) {
                i12 = 1;
            } else if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (this.f20746b == null && this.P == null) {
                i13 = 0;
            } else {
                i13 = this.G;
            }
            linearLayout2.addView(puVar6, w7.z5.t(-2, -2, i35, 24, 0, 24, i13));
            TextView textView7 = this.f20749c;
            if (textView7 != null) {
                this.f20782w.addView(textView7, w7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f20770n.setText(this.T);
            this.f20770n.setVisibility(0);
        } else {
            this.f20770n.setVisibility(8);
        }
        if (this.P != null) {
            int i36 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i36 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i36] != null) {
                    w1 w1Var = new w1(getContext(), g6Var);
                    CharSequence charSequence = this.P[i36];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i16 = iArr[i36];
                    } else {
                        i16 = 0;
                    }
                    w1Var.a(i16, charSequence);
                    w1Var.setTag(Integer.valueOf(i36));
                    this.P0.add(w1Var);
                    this.f20782w.addView(w1Var, w7.z5.n(-1, 50));
                    w1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final c2 f21808b;

                        {
                            this.f21808b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f21808b.dismiss();
                                    return;
                                case 1:
                                    c2 c2Var = this.f21808b;
                                    new ed(c2Var.getContext(), c2Var.T0).show();
                                    return;
                                default:
                                    c2 c2Var2 = this.f21808b;
                                    DialogInterface.OnClickListener onClickListener = c2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(c2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    c2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i36++;
            }
        }
        View view2 = this.f20746b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f20746b.getParent()).removeView(this.f20746b);
            }
            this.f20782w.addView(this.f20746b, w7.z5.n(-1, this.e));
        }
        if (objArr != null) {
            if (!this.K0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f20771n0;
                if (charSequence2 != null) {
                    i15 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i15 = 0;
                }
                if (this.f20773p0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f20773p0;
                    i15 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.f20776r0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.f20776r0;
                    i15 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (this.f20779t0 != null) {
                    if (i15 > 0) {
                        i15 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f20779t0;
                    i15 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i15);
                }
                if (i15 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.L0 && this.f20771n0 != null && this.f20773p0 != null && this.f20776r0 != null && this.f20779t0 != null) {
                        this.M0 = true;
                    } else {
                        this.K0 = true;
                    }
                }
            }
            if (this.K0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f20781v0 = linearLayout3;
            } else {
                this.f20781v0 = new u2(this, getContext(), 1);
            }
            if (this.f20749c != null) {
                this.f20781v0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f20781v0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f20781v0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            y1 y1Var6 = this.f20751c1;
            ViewGroup viewGroup2 = this.f20781v0;
            if (this.M0) {
                i14 = 96;
            } else {
                i14 = 52;
            }
            y1Var6.addView(viewGroup2, w7.z5.n(-1, i14));
            if (this.W) {
                this.f20781v0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f20771n0 != null) {
                f12 = 64.0f;
                v1 v1Var = new v1(getContext(), 0);
                v1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                v1Var.setTag(-1);
                v1Var.setTextSize(1, 16.0f);
                r6.W(v1Var, this.I, a2Var);
                v1Var.setGravity(17);
                v1Var.setTypeface(AndroidUtilities.bold());
                v1Var.setText(this.f20771n0);
                f13 = 6.0f;
                v1Var.setBackground(k6.I0(AndroidUtilities.dp(f10), f(this.I)));
                v1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.K0) {
                    f14 = 12.0f;
                    this.f20781v0.addView(v1Var, w7.z5.q(-1, 40, 7));
                } else {
                    f14 = 12.0f;
                    this.f20781v0.addView(v1Var, w7.z5.e(-2, 40, 53));
                }
                v1Var.setOnClickListener(new ai.p(28, this, v1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
                f14 = 12.0f;
            }
            if (this.f20773p0 != null) {
                v1 v1Var2 = new v1(getContext(), 1);
                v1Var2.setMinWidth(AndroidUtilities.dp(f12));
                v1Var2.setTag(-2);
                v1Var2.setTextSize(1, 16.0f);
                r6.W(v1Var2, this.I, a2Var);
                v1Var2.setGravity(17);
                v1Var2.setTypeface(AndroidUtilities.bold());
                v1Var2.setEllipsize(TextUtils.TruncateAt.END);
                v1Var2.setSingleLine(true);
                v1Var2.setText(this.f20773p0.toString());
                v1Var2.setBackground(k6.I0(AndroidUtilities.dp(f10), f(this.I)));
                v1Var2.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f20781v0.addView(v1Var2, 0, w7.z5.q(-1, 40, 7));
                } else {
                    this.f20781v0.addView(v1Var2, w7.z5.e(-2, 40, 53));
                }
                v1Var2.setOnClickListener(new ai.p(29, this, v1Var2));
            }
            if (this.f20779t0 != null) {
                v1 v1Var3 = new v1(getContext(), 2);
                v1Var3.setMinWidth(AndroidUtilities.dp(f12));
                v1Var3.setTag(-3);
                v1Var3.setTextSize(1, 16.0f);
                r6.W(v1Var3, this.I, a2Var);
                v1Var3.setGravity(17);
                v1Var3.setTypeface(AndroidUtilities.bold());
                v1Var3.setEllipsize(TextUtils.TruncateAt.END);
                v1Var3.setSingleLine(true);
                v1Var3.setText(this.f20779t0.toString());
                v1Var3.setBackground(k6.I0(AndroidUtilities.dp(f10), f(this.I)));
                v1Var3.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f20781v0.addView(v1Var3, 1, w7.z5.q(-1, 40, 7));
                } else {
                    this.f20781v0.addView(v1Var3, w7.z5.e(-2, 40, 51));
                }
                v1Var3.setOnClickListener(new s1(0, this, v1Var3));
            }
            if (this.f20776r0 != null) {
                v1 v1Var4 = new v1(getContext(), 3);
                v1Var4.setMinWidth(AndroidUtilities.dp(f12));
                v1Var4.setTag(-4);
                v1Var4.setTextSize(1, 16.0f);
                r6.W(v1Var4, this.I, a2Var);
                v1Var4.setGravity(17);
                v1Var4.setTypeface(AndroidUtilities.bold());
                v1Var4.setEllipsize(TextUtils.TruncateAt.END);
                v1Var4.setSingleLine(true);
                v1Var4.setText(this.f20776r0.toString());
                v1Var4.setBackground(k6.I0(AndroidUtilities.dp(f10), f(this.I)));
                v1Var4.setPadding(AndroidUtilities.dp(f14), 0, AndroidUtilities.dp(f14), 0);
                if (this.K0) {
                    this.f20781v0.addView(v1Var4, 0, w7.z5.q(-1, 40, 7));
                } else {
                    this.f20781v0.addView(v1Var4, w7.z5.e(-2, 40, 53));
                }
                v1Var4.setOnClickListener(new s1(1, this, v1Var4));
            }
            if (this.K0) {
                for (int i37 = 1; i37 < this.f20781v0.getChildCount(); i37++) {
                    ((ViewGroup.MarginLayoutParams) this.f20781v0.getChildAt(i37).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
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
            this.f20751c1.getLayoutParams().width = e();
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
        View view3 = this.f20746b;
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
            AndroidUtilities.makeGlobalBlurBitmap(new w0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final pf.c h(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f20765j0 = false;
        }
        return new pf.c(new p(d, 5), new y7(this, d, z10, 12));
    }

    public final void i() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            r6.W(textView, k6.f21422q7, this.f20768k1);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f20782w.invalidate();
    }

    public final void j(int i10) {
        this.f20753d1 = -1;
        this.W0 = i10;
        Drawable drawable = this.B0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.W0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k() {
        this.f20763i0 = false;
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
                w1 w1Var = (w1) arrayList.get(i10);
                w1Var.f21936a.setTextColor(i11);
                w1Var.f21937b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void n(String str) {
        this.T = str;
        if (this.f20770n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f20770n.setText(this.T);
                this.f20770n.setVisibility(0);
                return;
            }
            this.f20770n.setVisibility(8);
        }
    }

    public final void o(int i10) {
        this.f20759g0 = i10;
        f90 f90Var = this.f20783w0;
        if (f90Var != null) {
            f90Var.a(i10 / 100.0f, true);
            this.f20785x0.setText(String.format("%d%%", Integer.valueOf(this.f20759g0)));
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        l80 l80Var = this.f20787y0;
        if (l80Var != null) {
            l80Var.g(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p(int i10) {
        this.f20764i1 = true;
        wh.n nVar = this.f20756f;
        if (nVar != null) {
            nVar.setTextColor(i10);
        }
        pu puVar = this.f20770n;
        if (puVar != null) {
            puVar.setTextColor(i10);
        }
    }

    public final void q() {
        if (this.f20763i0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.T0);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new q1(this, 0));
            try {
                this.K = alertDialog$Builder.p();
            } catch (Exception unused) {
            }
        }
    }

    public void r(long j10) {
        p1 p1Var = this.O0;
        AndroidUtilities.cancelRunOnUIThread(p1Var);
        AndroidUtilities.runOnUIThread(p1Var, j10);
    }

    public final void s() {
        ak0 ak0Var;
        int w02;
        if (this.f20752d0 >= 0 && this.Z != null && (ak0Var = this.m0) != null && ak0Var.getAnimatedDrawable() != null && (w02 = k6.w0(this.f20752d0, this.f20754e0)) != this.f20755e1) {
            xj0 animatedDrawable = this.m0.getAnimatedDrawable();
            for (Map.Entry entry : this.Z.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.f20755e1) {
                    entry.setValue(Integer.valueOf(w02));
                    animatedDrawable.Q(w02, (String) entry.getKey());
                }
            }
            this.f20755e1 = w02;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        u1 u1Var = this.v;
        if (u1Var != null) {
            u1Var.postDelayed(runnable, j10);
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
        wh.n nVar = this.f20756f;
        if (nVar != null) {
            nVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.f20766j1 = false;
        super.show();
        FrameLayout frameLayout = this.f20775r;
        if (frameLayout != null && this.f20757f0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f20775r.setScaleY(0.0f);
            this.f20775r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.Y0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        u1 u1Var = this.v;
        if (u1Var != null) {
            u1Var.removeCallbacks(runnable);
        }
    }

    public c2(Context context, int i10, g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.f20743a = -1;
        this.e = -2;
        this.f20786y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = k6.H5;
        this.f20744a0 = 132;
        this.f20752d0 = -1;
        this.f20761h0 = true;
        this.f20763i0 = true;
        this.f20765j0 = true;
        this.f20788z0 = new int[2];
        this.A0 = true;
        this.N0 = new p1(this, 0);
        this.O0 = new p1(this, 1);
        this.P0 = new ArrayList();
        this.R0 = true;
        this.S0 = 0.5f;
        this.U0 = true;
        this.f20753d1 = -1;
        this.f20768k1 = new a2(this, 0);
        this.T0 = g6Var;
        this.f20757f0 = i10;
        int i11 = k6.f21255h5;
        this.f20753d1 = i11;
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
