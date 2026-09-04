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
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y6;
import org.telegram.ui.z80;
import zh.l7;
public class b2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    public static final int f20223c1 = 0;
    public final Rect A0;
    public final float B0;
    public Bitmap C0;
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
    public b2 K;
    public boolean K0;
    public int L;
    public final q1 L0;
    public DialogInterface.OnClickListener M;
    public final q1 M0;
    public DialogInterface.OnDismissListener N;
    public final ArrayList N0;
    public Utilities.Callback O;
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
    public zh.a Z0;
    public int f20224a;
    public int f20225a0;
    public z1 f20226a1;
    public View f20227b;
    public Drawable f20228b0;
    public boolean f20229b1;
    public TextView f20230c;
    public int f20231c0;
    public iu d;
    public final int f20232d0;
    public int f20233e;
    public int f20234e0;
    public wh.p f20235f;
    public boolean f20236f0;
    public boolean f20237g0;
    public TextView h;
    public boolean f20238h0;
    public boolean f20239i0;
    public boolean f20240j0;
    public aj0 f20241k0;
    public CharSequence f20242l0;
    public a2 m0;
    public iu f20243n;
    public CharSequence f20244n0;
    public a2 f20245o0;
    public String f20246p0;
    public ji.e4 f20247q0;
    public FrameLayout f20248r;
    public CharSequence f20249r0;
    public FrameLayout f20250s;
    public a2 f20251s0;
    public ViewGroup f20252t0;
    public m80 f20253u0;
    public v1 v;
    public TextView f20254v0;
    public LinearLayout f20255w;
    public z80 f20256w0;
    public y1 f20257x;
    public final int[] f20258x0;
    public final BitmapDrawable[] f20259y;
    public boolean f20260y0;
    public final Drawable f20261z0;

    public b2(Context context) {
        this(context, 3, null);
    }

    public static void a(b2 b2Var, int i10, boolean z10) {
        int i11;
        boolean[] zArr = b2Var.E;
        AnimatorSet[] animatorSetArr = b2Var.F;
        if ((z10 && !zArr[i10]) || (!z10 && zArr[i10])) {
            zArr[i10] = z10;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i10] = animatorSet2;
            BitmapDrawable bitmapDrawable = b2Var.f20259y[i10];
            if (bitmapDrawable != null) {
                if (z10) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i11));
            }
            animatorSetArr[i10].setDuration(150L);
            animatorSetArr[i10].addListener(new x2(b2Var, i10, 1));
            try {
                animatorSetArr[i10].start();
            } catch (Exception e7) {
                FileLog.e(e7);
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
            AndroidUtilities.runOnUIThread(new q1(this, 0), currentTimeMillis - j3);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f20252t0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        iu iuVar;
        if (i10 == NotificationCenter.emojiLoaded && (iuVar = this.f20243n) != null) {
            iuVar.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.O;
        if (callback != null) {
            this.O = null;
            callback.run(new q1(this, 0));
        } else if (!this.f20229b1) {
            this.f20229b1 = true;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            DialogInterface.OnDismissListener onDismissListener = this.N;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            b2 b2Var = this.K;
            if (b2Var != null) {
                b2Var.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(this.M0);
            if (this.E0 != null && (bitmap = this.C0) != null) {
                bitmap.recycle();
                this.E0 = null;
                this.F0 = null;
                this.C0 = null;
            }
        }
    }

    public int e(int i10) {
        return j6.v0(i10, this.R0);
    }

    public final ViewGroup f(boolean z10) {
        boolean z11;
        float f7;
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
        z1 z1Var = new z1(getContext(), this);
        this.f20226a1 = z1Var;
        z1Var.setOrientation(1);
        boolean z12 = this.T0;
        int i25 = this.f20232d0;
        if ((z12 || i25 == 3) && i25 != 2) {
            this.f20226a1.setBackground(null);
            this.f20226a1.setPadding(0, 0, 0, 0);
            if (this.T0) {
                this.f20226a1.setWillNotDraw(false);
            }
            this.f20239i0 = false;
        } else {
            boolean z13 = this.f20240j0;
            Drawable drawable = this.f20261z0;
            if (z13) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.f20226a1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f20239i0 = true;
            } else {
                this.f20226a1.setBackground(null);
                this.f20226a1.setPadding(0, 0, 0, 0);
                this.f20226a1.setBackground(drawable);
                z1 z1Var2 = this.f20226a1;
                bi.z1 z1Var3 = yf.j0.f50112a;
                z1Var2.setOutlineProvider(new yf.i0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f)));
                this.f20226a1.setClipToOutline(true);
                this.f20239i0 = false;
            }
        }
        ViewGroup viewGroup = this.f20226a1;
        boolean z14 = this.X0;
        f6 f6Var = this.R0;
        if (z14) {
            if (this.Y0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Y0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final b2 f21325b;

                    {
                        this.f21325b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21325b.dismiss();
                                return;
                            case 1:
                                b2 b2Var = this.f21325b;
                                new l7(b2Var.getContext(), b2Var.R0).show();
                                return;
                            default:
                                b2 b2Var2 = this.f21325b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.Z0 == null) {
                zh.a aVar = new zh.a(getContext(), UserConfig.selectedAccount, f6Var);
                this.Z0 = aVar;
                w7.z5.a(aVar);
                this.Z0.setOnClickListener(new View.OnClickListener(this) {
                    public final b2 f21325b;

                    {
                        this.f21325b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f21325b.dismiss();
                                return;
                            case 1:
                                b2 b2Var = this.f21325b;
                                new l7(b2Var.getContext(), b2Var.R0).show();
                                return;
                            default:
                                b2 b2Var2 = this.f21325b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                return;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.f20226a1);
            AndroidUtilities.removeFromParent(this.Z0);
            this.Y0.addView(this.f20226a1, w7.x5.e(-2, -2, 17));
            this.Y0.addView(this.Z0, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Y0;
        }
        if (z10) {
            if (this.X0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f20224a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.f20242l0 == null && this.f20244n0 == null && this.f20246p0 == null && this.f20249r0 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.U == 0 && this.X == 0 && this.f20228b0 == null) {
            View view = this.V;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.f20226a1.addView(this.V, w7.x5.t(-1, this.f20225a0, 51, 0, 0, 0, 0));
            }
        } else {
            ?? imageView = new ImageView(getContext());
            this.f20241k0 = imageView;
            Drawable drawable2 = this.f20228b0;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                Drawable drawable3 = this.f20228b0;
                if (drawable3 instanceof y6) {
                    y6 y6Var = (y6) drawable3;
                    this.f20241k0.addOnAttachStateChangeListener(new t1(y6Var));
                    y6Var.a(this.f20241k0);
                }
            } else {
                int i26 = this.U;
                if (i26 != 0) {
                    imageView.setImageResource(i26);
                } else {
                    imageView.setAutoRepeat(this.S0);
                    aj0 aj0Var = this.f20241k0;
                    int i27 = this.X;
                    int i28 = this.Y;
                    aj0Var.f(i27, i28, i28, null);
                    if (this.Z != null) {
                        xi0 animatedDrawable = this.f20241k0.getAnimatedDrawable();
                        for (Map.Entry entry : this.Z.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f32574s.put((String) entry.getKey(), num);
                            animatedDrawable.E();
                        }
                    }
                    this.f20241k0.d();
                }
            }
            this.f20241k0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.W) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f20231c0);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f20241k0.setBackground(new u1(this, gradientDrawable));
                this.f20225a0 = 92;
            } else {
                this.f20241k0.setBackground(j6.c0(AndroidUtilities.dp(10.0f), 0, this.f20231c0));
            }
            if (this.W) {
                this.f20241k0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f20241k0.setTranslationY(0.0f);
            }
            this.f20241k0.setPadding(0, 0, 0, 0);
            this.f20226a1.addView(this.f20241k0, w7.x5.t(-1, this.f20225a0, 51, 0, 0, 0, 0));
        }
        int i29 = 5;
        if (this.R != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f20250s = frameLayout2;
            this.f20226a1.addView(frameLayout2, w7.x5.t(-2, -2, this.W ? 1 : 0, 24, 0, 24, 0));
            wh.p pVar = new wh.p(getContext(), null, false);
            this.f20235f = pVar;
            NotificationCenter.listenEmojiLoading(pVar);
            wh.p pVar2 = this.f20235f;
            pVar2.h = 3;
            pVar2.setText(this.R);
            this.f20235f.setTextColor(e(j6.f20770j5));
            this.f20235f.setTextSize(1, 20.0f);
            this.f20235f.setTypeface(AndroidUtilities.bold());
            wh.p pVar3 = this.f20235f;
            if (this.W) {
                i22 = 1;
            } else if (LocaleController.isRTL) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            pVar3.setGravity(i22 | 48);
            FrameLayout frameLayout3 = this.f20250s;
            wh.p pVar4 = this.f20235f;
            boolean z15 = this.W;
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
                if (this.S != null) {
                    i24 = 2;
                } else if (this.P != null) {
                    i24 = 14;
                } else {
                    i24 = 10;
                }
                f13 = i24;
            }
            frameLayout3.addView(pVar4, w7.x5.d(-2, -2.0f, i30, 0.0f, 19.0f, 0.0f, f13));
        }
        if (this.S != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.S);
            this.h.setTextColor(e(j6.J5));
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19 | 48);
            z1 z1Var4 = this.f20226a1;
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            int i31 = i20 | 48;
            if (this.P != null) {
                i21 = 14;
            } else {
                i21 = 10;
            }
            z1Var4.addView(textView3, w7.x5.t(-2, -2, i31, 24, 0, 24, i21));
        }
        if (i25 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.f20259y;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            v1 v1Var = new v1(this, getContext(), 0);
            this.v = v1Var;
            v1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(j6.A5));
            this.f20226a1.addView(this.v, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f20255w = linearLayout;
            linearLayout.setOrientation(1);
            f7 = 20.0f;
            f10 = 4.0f;
            this.v.addView(this.f20255w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f7 = 20.0f;
            f10 = 4.0f;
        }
        iu iuVar = new iu(getContext());
        this.f20243n = iuVar;
        NotificationCenter.listenEmojiLoading(iuVar);
        iu iuVar2 = this.f20243n;
        if (this.W) {
            i10 = j6.f21042y6;
        } else {
            i10 = j6.f20770j5;
        }
        iuVar2.setTextColor(e(i10));
        this.f20243n.setTextSize(1, 16.0f);
        this.f20243n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f20243n.setLinkTextColor(e(j6.f20790k5));
        if (!this.f20236f0) {
            this.f20243n.setClickable(false);
            this.f20243n.setEnabled(false);
        }
        iu iuVar3 = this.f20243n;
        if (this.W) {
            i11 = 1;
        } else if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        iuVar3.setGravity(i11 | 48);
        if (i25 == 2) {
            z1 z1Var5 = this.f20226a1;
            iu iuVar4 = this.f20243n;
            if (LocaleController.isRTL) {
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
            z1Var5.addView(iuVar4, w7.x5.t(-2, -2, i32, 24, i17, 24, 20));
            m80 m80Var = new m80(getContext());
            this.f20253u0 = m80Var;
            m80Var.a(this.f20234e0 / 100.0f, false);
            this.f20253u0.setProgressColor(e(j6.F5));
            this.f20253u0.setBackColor(e(j6.G5));
            this.f20226a1.addView(this.f20253u0, w7.x5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.f20254v0 = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            TextView textView5 = this.f20254v0;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView5.setGravity(i18 | 48);
            this.f20254v0.setTextColor(e(j6.f20897q5));
            this.f20254v0.setTextSize(1, 14.0f);
            z1 z1Var6 = this.f20226a1;
            TextView textView6 = this.f20254v0;
            if (!LocaleController.isRTL) {
                i29 = 3;
            }
            z1Var6.addView(textView6, w7.x5.t(-2, -2, i29 | 48, 23, 4, 23, 24));
            this.f20254v0.setText(String.format("%d%%", Integer.valueOf(this.f20234e0)));
        } else if (i25 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f20248r = new FrameLayout(getContext());
            this.U0 = e(j6.M5);
            if (!this.T0) {
                this.f20248r.setBackgroundDrawable(j6.b0(AndroidUtilities.dp(18.0f), this.U0));
            }
            this.f20226a1.addView(this.f20248r, w7.x5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(j6.N5));
            this.f20248r.addView(radialProgressView, w7.x5.e(86, 86, 17));
        } else {
            iu iuVar5 = this.d;
            if (iuVar5 != null) {
                this.f20255w.addView(iuVar5, w7.x5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f20255w;
            iu iuVar6 = this.f20243n;
            if (this.W) {
                i29 = 1;
            } else if (!LocaleController.isRTL) {
                i29 = 3;
            }
            int i33 = i29 | 48;
            if (this.f20227b == null && this.P == null) {
                i12 = 0;
            } else {
                i12 = this.G;
            }
            linearLayout2.addView(iuVar6, w7.x5.t(-2, -2, i33, 24, 0, 24, i12));
            TextView textView7 = this.f20230c;
            if (textView7 != null) {
                this.f20255w.addView(textView7, w7.x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        if (!TextUtils.isEmpty(this.T)) {
            this.f20243n.setText(this.T);
            this.f20243n.setVisibility(0);
        } else {
            this.f20243n.setVisibility(8);
        }
        if (this.P != null) {
            int i34 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.P;
                if (i34 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i34] != null) {
                    x1 x1Var = new x1(getContext(), f6Var);
                    CharSequence charSequence = this.P[i34];
                    int[] iArr = this.Q;
                    if (iArr != null) {
                        i15 = iArr[i34];
                    } else {
                        i15 = 0;
                    }
                    x1Var.a(i15, charSequence);
                    x1Var.setTag(Integer.valueOf(i34));
                    this.N0.add(x1Var);
                    this.f20255w.addView(x1Var, w7.x5.n(-1, 50));
                    x1Var.setOnClickListener(new View.OnClickListener(this) {
                        public final b2 f21325b;

                        {
                            this.f21325b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    this.f21325b.dismiss();
                                    return;
                                case 1:
                                    b2 b2Var = this.f21325b;
                                    new l7(b2Var.getContext(), b2Var.R0).show();
                                    return;
                                default:
                                    b2 b2Var2 = this.f21325b;
                                    DialogInterface.OnClickListener onClickListener = b2Var2.M;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(b2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    b2Var2.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i34++;
            }
        }
        View view2 = this.f20227b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f20227b.getParent()).removeView(this.f20227b);
            }
            this.f20255w.addView(this.f20227b, w7.x5.n(-1, this.f20233e));
        }
        if (z11) {
            if (!this.I0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f20242l0;
                if (charSequence2 != null) {
                    i14 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0);
                } else {
                    i14 = 0;
                }
                if (this.f20244n0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f20244n0;
                    i14 = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f20246p0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    String str = this.f20246p0;
                    i14 = (int) (textPaint.measureText((CharSequence) str, 0, str.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (this.f20249r0 != null) {
                    if (i14 > 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f20249r0;
                    i14 = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + i14);
                }
                if (i14 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (this.J0 && this.f20242l0 != null && this.f20244n0 != null && this.f20246p0 != null && this.f20249r0 != null) {
                        this.K0 = true;
                    } else {
                        this.I0 = true;
                    }
                }
            }
            if (this.I0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f20252t0 = linearLayout3;
            } else {
                this.f20252t0 = new t2(this, getContext(), 1);
            }
            if (this.f20230c != null) {
                this.f20252t0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                this.f20252t0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f20252t0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            z1 z1Var7 = this.f20226a1;
            ViewGroup viewGroup2 = this.f20252t0;
            if (this.K0) {
                i13 = 96;
            } else {
                i13 = 52;
            }
            z1Var7.addView(viewGroup2, w7.x5.n(-1, i13));
            if (this.W) {
                this.f20252t0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.f20242l0 != null) {
                w1 w1Var = new w1(getContext(), 0);
                w1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                w1Var.setTag(-1);
                w1Var.setTextSize(1, 16.0f);
                w1Var.setTextColor(e(this.I));
                w1Var.setGravity(17);
                w1Var.setTypeface(AndroidUtilities.bold());
                w1Var.setText(this.f20242l0);
                f11 = 64.0f;
                w1Var.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    f12 = 6.0f;
                    this.f20252t0.addView(w1Var, w7.x5.q(-1, 40, 7));
                } else {
                    f12 = 6.0f;
                    this.f20252t0.addView(w1Var, w7.x5.e(-2, 40, 53));
                }
                w1Var.setOnClickListener(new bi.u1(18, this, w1Var));
            } else {
                f11 = 64.0f;
                f12 = 6.0f;
            }
            if (this.f20244n0 != null) {
                w1 w1Var2 = new w1(getContext(), 1);
                w1Var2.setMinWidth(AndroidUtilities.dp(f11));
                w1Var2.setTag(-2);
                w1Var2.setTextSize(1, 16.0f);
                w1Var2.setTextColor(e(this.I));
                w1Var2.setGravity(17);
                w1Var2.setTypeface(AndroidUtilities.bold());
                w1Var2.setEllipsize(TextUtils.TruncateAt.END);
                w1Var2.setSingleLine(true);
                w1Var2.setText(this.f20244n0.toString());
                w1Var2.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20252t0.addView(w1Var2, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20252t0.addView(w1Var2, w7.x5.e(-2, 40, 53));
                }
                w1Var2.setOnClickListener(new bi.u1(19, this, w1Var2));
            }
            if (this.f20249r0 != null) {
                w1 w1Var3 = new w1(getContext(), 2);
                w1Var3.setMinWidth(AndroidUtilities.dp(f11));
                w1Var3.setTag(-3);
                w1Var3.setTextSize(1, 16.0f);
                w1Var3.setTextColor(e(this.I));
                w1Var3.setGravity(17);
                w1Var3.setTypeface(AndroidUtilities.bold());
                w1Var3.setEllipsize(TextUtils.TruncateAt.END);
                w1Var3.setSingleLine(true);
                w1Var3.setText(this.f20249r0.toString());
                w1Var3.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20252t0.addView(w1Var3, 1, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20252t0.addView(w1Var3, w7.x5.e(-2, 40, 51));
                }
                w1Var3.setOnClickListener(new bi.u1(20, this, w1Var3));
            }
            if (this.f20246p0 != null) {
                w1 w1Var4 = new w1(getContext(), 3);
                w1Var4.setMinWidth(AndroidUtilities.dp(f11));
                w1Var4.setTag(-4);
                w1Var4.setTextSize(1, 16.0f);
                w1Var4.setTextColor(e(this.I));
                w1Var4.setGravity(17);
                w1Var4.setTypeface(AndroidUtilities.bold());
                w1Var4.setEllipsize(TextUtils.TruncateAt.END);
                w1Var4.setSingleLine(true);
                w1Var4.setText(this.f20246p0.toString());
                w1Var4.setBackground(j6.G0(AndroidUtilities.dp(f7), e(this.I)));
                w1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.I0) {
                    this.f20252t0.addView(w1Var4, 0, w7.x5.q(-1, 40, 7));
                } else {
                    this.f20252t0.addView(w1Var4, w7.x5.e(-2, 40, 53));
                }
                w1Var4.setOnClickListener(new bi.u1(21, this, w1Var4));
            }
            if (this.I0) {
                for (int i35 = 1; i35 < this.f20252t0.getChildCount(); i35++) {
                    ((ViewGroup.MarginLayoutParams) this.f20252t0.getChildAt(i35).getLayoutParams()).topMargin = AndroidUtilities.dp(f12);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.X0) {
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (i25 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.P0) {
                layoutParams3.dimAmount = this.Q0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i36 = AndroidUtilities.displaySize.x;
            this.L = i36;
            int dp2 = (i36 - AndroidUtilities.dp(48.0f)) - (this.V0 * 2);
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
            Rect rect2 = this.A0;
            layoutParams3.width = min + rect2.left + rect2.right;
        }
        View view3 = this.f20227b;
        if (view3 != null && this.f20260y0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.T0) {
            AndroidUtilities.makeGlobalBlurBitmap(new x0(this, 1), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final of.e g(int i10, boolean z10, boolean z11) {
        View d = d(i10);
        if (z11) {
            this.f20238h0 = false;
        }
        return new of.e(new q(d, 5), new di.y0(this, d, z10, 9));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(j6.f20898q7));
        }
    }

    public final void i(int i10) {
        this.U0 = i10;
        Drawable drawable = this.f20261z0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f20255w.invalidate();
    }

    public final void j() {
        this.f20237g0 = false;
    }

    public final void k(boolean z10) {
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

    public final void l(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.N0;
            if (i10 < arrayList.size()) {
                x1 x1Var = (x1) arrayList.get(i10);
                x1Var.f21478a.setTextColor(i11);
                x1Var.f21479b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.T = str;
        if (this.f20243n != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f20243n.setText(this.T);
                this.f20243n.setVisibility(0);
                return;
            }
            this.f20243n.setVisibility(8);
        }
    }

    public final void n(int i10) {
        this.f20234e0 = i10;
        m80 m80Var = this.f20253u0;
        if (m80Var != null) {
            m80Var.a(i10 / 100.0f, true);
            this.f20254v0.setText(String.format("%d%%", Integer.valueOf(this.f20234e0)));
        }
    }

    public final void o(int i10) {
        wh.p pVar = this.f20235f;
        if (pVar != null) {
            pVar.setTextColor(i10);
        }
        iu iuVar = this.f20243n;
        if (iuVar != null) {
            iuVar.setTextColor(i10);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        z80 z80Var = this.f20256w0;
        if (z80Var != null) {
            z80Var.g(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f20237g0 && this.K == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.R0);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new r1(this, 0));
            try {
                this.K = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j3) {
        q1 q1Var = this.M0;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, j3);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.postDelayed(runnable, j3);
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
        wh.p pVar = this.f20235f;
        if (pVar != null) {
            pVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        this.f20229b1 = false;
        super.show();
        FrameLayout frameLayout = this.f20248r;
        if (frameLayout != null && this.f20232d0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.f20248r.setScaleY(0.0f);
            this.f20248r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.W0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.removeCallbacks(runnable);
        }
    }

    public b2(Context context, int i10, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.f20224a = -1;
        this.f20233e = -2;
        this.f20259y = new BitmapDrawable[2];
        this.E = new boolean[2];
        this.F = new AnimatorSet[2];
        this.G = 12;
        this.I = j6.H5;
        this.f20225a0 = 132;
        this.f20236f0 = true;
        this.f20237g0 = true;
        this.f20238h0 = true;
        this.f20258x0 = new int[2];
        this.f20260y0 = true;
        this.L0 = new q1(this, 0);
        this.M0 = new q1(this, 1);
        this.N0 = new ArrayList();
        this.P0 = true;
        this.Q0 = 0.5f;
        this.S0 = true;
        this.R0 = f6Var;
        this.f20232d0 = i10;
        int e7 = e(j6.f20734h5);
        this.U0 = e7;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(e7) < 0.721f;
        this.T0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.A0 = rect;
        if (i10 != 3 || this.T0) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f20261z0 = mutate;
            this.B0 = i10 == 3 ? 0.55f : z10 ? 0.8f : 0.985f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.U0, PorterDuff.Mode.MULTIPLY));
            mutate.getPadding(rect);
        }
        this.H = i10 == 3;
    }
}
