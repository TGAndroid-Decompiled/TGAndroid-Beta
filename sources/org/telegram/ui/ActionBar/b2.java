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
import hh.fa;
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
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z70;
import org.telegram.ui.i80;

public class b2 extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
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
    public b2 G;
    public boolean G0;
    public int H;
    public final q1 H0;
    public DialogInterface.OnClickListener I;
    public final q1 I0;
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
    public hh.b V0;
    public int W;
    public z1 W0;
    public Drawable X;
    public boolean X0;
    public int Y;
    public final int Z;

    public int f22742a;

    public int f22743a0;

    public View f22744b;

    public boolean f22745b0;

    public TextView f22746c;

    public boolean f22747c0;
    public ut d;

    public boolean f22748d0;

    public int f22749e;

    public boolean f22750e0;

    public eh.s f22751f;

    public boolean f22752f0;

    public ri0 f22753g0;
    public TextView h;

    public CharSequence f22754h0;

    public a2 f22755i0;

    public CharSequence f22756j0;

    public a2 f22757k0;

    public String f22758l0;
    public rh.w3 m0;

    public ut f22759n;

    public CharSequence f22760n0;

    public a2 f22761o0;

    public ViewGroup f22762p0;

    public z70 f22763q0;

    public FrameLayout f22764r;

    public TextView f22765r0;

    public FrameLayout f22766s;

    public i80 f22767s0;

    public final int[] f22768t0;

    public boolean f22769u0;
    public v1 v;

    public final Drawable f22770v0;

    public LinearLayout f22771w;

    public final Rect f22772w0;

    public y1 f22773x;

    public final float f22774x0;

    public final BitmapDrawable[] f22775y;

    public Bitmap f22776y0;

    public Matrix f22777z0;

    public b2(Context context) {
        this(context, 3, null);
    }

    public static void a(b2 b2Var, int i10, boolean z10) {
        boolean[] zArr = b2Var.A;
        AnimatorSet[] animatorSetArr = b2Var.B;
        if ((!z10 || zArr[i10]) && (z10 || !zArr[i10])) {
            return;
        }
        zArr[i10] = z10;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        BitmapDrawable bitmapDrawable = b2Var.f22775y[i10];
        int i11 = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z10 ? 255 : 0));
        }
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new w2(b2Var, i10, i11));
        try {
            animatorSetArr[i10].start();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
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

    public final void c(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.S0;
        if (jCurrentTimeMillis < j10) {
            AndroidUtilities.runOnUIThread(new q1(this, 0), jCurrentTimeMillis - j10);
        } else {
            dismiss();
        }
    }

    public final View d(int i10) {
        ViewGroup viewGroup = this.f22762p0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i10));
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ut utVar;
        if (i10 != NotificationCenter.emojiLoaded || (utVar = this.f22759n) == null) {
            return;
        }
        utVar.invalidate();
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback callback = this.K;
        if (callback != null) {
            this.K = null;
            callback.run(new q1(this, 0));
            return;
        }
        if (this.X0) {
            return;
        }
        this.X0 = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.J;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        if (this.A0 == null || (bitmap = this.f22776y0) == null) {
            return;
        }
        bitmap.recycle();
        this.A0 = null;
        this.B0 = null;
        this.f22776y0 = null;
    }

    public int e(int i10) {
        return g6.v0(i10, this.N0);
    }

    public final ViewGroup f(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        z1 z1Var = new z1(getContext(), this);
        this.W0 = z1Var;
        final int i10 = 1;
        z1Var.setOrientation(1);
        boolean z11 = this.P0;
        int i11 = this.Z;
        int i12 = 3;
        final int i13 = 0;
        if ((z11 || i11 == 3) && i11 != 2) {
            this.W0.setBackground(null);
            this.W0.setPadding(0, 0, 0, 0);
            if (this.P0) {
                this.W0.setWillNotDraw(false);
            }
            this.f22750e0 = false;
        } else {
            boolean z12 = this.f22752f0;
            Drawable drawable = this.f22770v0;
            if (z12) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.W0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                this.f22750e0 = true;
            } else {
                this.W0.setBackground(null);
                this.W0.setPadding(0, 0, 0, 0);
                this.W0.setBackground(drawable);
                z1 z1Var2 = this.W0;
                int iDp = AndroidUtilities.dp(8.0f);
                float fDp = AndroidUtilities.dp(20.0f);
                cg.l1 l1Var = gf.r0.f7054a;
                z1Var2.setOutlineProvider(new gf.q0(iDp, fDp));
                this.W0.setClipToOutline(true);
                this.f22750e0 = false;
            }
        }
        ViewGroup viewGroup = this.W0;
        boolean z13 = this.T0;
        c6 c6Var = this.N0;
        if (z13) {
            if (this.U0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.U0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {

                    public final b2 f23757b;

                    {
                        this.f23757b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f23757b.dismiss();
                                break;
                            case 1:
                                b2 b2Var = this.f23757b;
                                new fa(b2Var.getContext(), b2Var.N0).show();
                                break;
                            default:
                                b2 b2Var2 = this.f23757b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.V0 == null) {
                hh.b bVar = new hh.b(getContext(), UserConfig.selectedAccount, c6Var);
                this.V0 = bVar;
                h7.b6.a(bVar);
                this.V0.setOnClickListener(new View.OnClickListener(this) {

                    public final b2 f23757b;

                    {
                        this.f23757b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.f23757b.dismiss();
                                break;
                            case 1:
                                b2 b2Var = this.f23757b;
                                new fa(b2Var.getContext(), b2Var.N0).show();
                                break;
                            default:
                                b2 b2Var2 = this.f23757b;
                                DialogInterface.OnClickListener onClickListener = b2Var2.I;
                                if (onClickListener != null) {
                                    onClickListener.onClick(b2Var2, ((Integer) view.getTag()).intValue());
                                }
                                b2Var2.dismiss();
                                break;
                        }
                    }
                });
            }
            AndroidUtilities.removeFromParent(this.W0);
            AndroidUtilities.removeFromParent(this.V0);
            this.U0.addView(this.W0, h7.z5.e(-2, -2, 17));
            this.U0.addView(this.V0, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.U0;
        }
        if (z10) {
            if (this.T0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.f22742a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        boolean z14 = (this.f22754h0 == null && this.f22756j0 == null && this.f22758l0 == null && this.f22760n0 == null) ? false : true;
        if (this.Q == 0 && this.T == 0 && this.X == null) {
            View view = this.R;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                this.W0.addView(this.R, h7.z5.t(-1, this.W, 51, 0, 0, 0, 0));
            }
        } else {
            ri0 ri0Var = new ri0(getContext());
            this.f22753g0 = ri0Var;
            Drawable drawable2 = this.X;
            if (drawable2 != null) {
                ri0Var.setImageDrawable(drawable2);
                Drawable drawable3 = this.X;
                if (drawable3 instanceof r6) {
                    r6 r6Var = (r6) drawable3;
                    this.f22753g0.addOnAttachStateChangeListener(new t1(r6Var));
                    r6Var.a(this.f22753g0);
                }
            } else {
                int i14 = this.Q;
                if (i14 != 0) {
                    ri0Var.setImageResource(i14);
                } else {
                    ri0Var.setAutoRepeat(this.O0);
                    ri0 ri0Var2 = this.f22753g0;
                    int i15 = this.T;
                    int i16 = this.U;
                    ri0Var2.f(i15, i16, i16, null);
                    if (this.V != null) {
                        oi0 animatedDrawable = this.f22753g0.getAnimatedDrawable();
                        for (Map.Entry entry : this.V.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.f31329s.put(str, num);
                            animatedDrawable.E();
                        }
                    }
                    this.f22753g0.d();
                }
            }
            this.f22753g0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.S) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.Y);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.f22753g0.setBackground(new u1(this, gradientDrawable));
                this.W = 92;
            } else {
                this.f22753g0.setBackground(g6.c0(AndroidUtilities.dp(10.0f), 0, this.Y));
            }
            if (this.S) {
                this.f22753g0.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.f22753g0.setTranslationY(0.0f);
            }
            this.f22753g0.setPadding(0, 0, 0, 0);
            this.W0.addView(this.f22753g0, h7.z5.t(-1, this.W, 51, 0, 0, 0, 0));
        }
        int i17 = 5;
        if (this.N != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.f22766s = frameLayout2;
            this.W0.addView(frameLayout2, h7.z5.t(-2, -2, this.S ? 1 : 0, 24, 0, 24, 0));
            eh.s sVar = new eh.s(getContext(), null, false);
            this.f22751f = sVar;
            NotificationCenter.listenEmojiLoading(sVar);
            eh.s sVar2 = this.f22751f;
            sVar2.h = 3;
            sVar2.setText(this.N);
            this.f22751f.setTextColor(e(g6.f23161j5));
            this.f22751f.setTextSize(1, 20.0f);
            this.f22751f.setTypeface(AndroidUtilities.bold());
            this.f22751f.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.f22766s;
            eh.s sVar3 = this.f22751f;
            boolean z15 = this.S;
            int i18 = (z15 ? 1 : LocaleController.isRTL ? 5 : 3) | 48;
            if (z15) {
                f14 = 4.0f;
            } else {
                f14 = this.O != null ? 2 : this.L != null ? 14 : 10;
            }
            frameLayout3.addView(sVar3, h7.z5.d(-2, -2.0f, i18, 0.0f, 19.0f, 0.0f, f14));
        }
        if (this.O != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.O);
            this.h.setTextColor(e(g6.J5));
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.W0.addView(this.h, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.L != null ? 14 : 10));
        }
        if (i11 == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.f22775y;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            v1 v1Var = new v1(this, getContext(), i13);
            this.v = v1Var;
            v1Var.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.v, e(g6.A5));
            this.W0.addView(this.v, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f22771w = linearLayout;
            linearLayout.setOrientation(1);
            f10 = 20.0f;
            f11 = 4.0f;
            this.v.addView(this.f22771w, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f10 = 20.0f;
            f11 = 4.0f;
        }
        ut utVar = new ut(getContext());
        this.f22759n = utVar;
        NotificationCenter.listenEmojiLoading(utVar);
        this.f22759n.setTextColor(e(this.S ? g6.f23423y6 : g6.f23161j5));
        this.f22759n.setTextSize(1, 16.0f);
        this.f22759n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.f22759n.setLinkTextColor(e(g6.f23180k5));
        if (!this.f22745b0) {
            this.f22759n.setClickable(false);
            this.f22759n.setEnabled(false);
        }
        this.f22759n.setGravity((this.S ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        if (i11 == 2) {
            this.W0.addView(this.f22759n, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.N == null ? 19 : 0, 24, 20));
            z70 z70Var = new z70(getContext());
            this.f22763q0 = z70Var;
            z70Var.a(this.f22743a0 / 100.0f, false);
            this.f22763q0.setProgressColor(e(g6.F5));
            this.f22763q0.setBackColor(e(g6.G5));
            this.W0.addView(this.f22763q0, h7.z5.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.f22765r0 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            this.f22765r0.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.f22765r0.setTextColor(e(g6.f23283q5));
            this.f22765r0.setTextSize(1, 14.0f);
            this.W0.addView(this.f22765r0, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            this.f22765r0.setText(String.format("%d%%", Integer.valueOf(this.f22743a0)));
        } else if (i11 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.f22764r = new FrameLayout(getContext());
            this.Q0 = e(g6.M5);
            if (!this.P0) {
                this.f22764r.setBackgroundDrawable(g6.b0(AndroidUtilities.dp(18.0f), this.Q0));
            }
            this.W0.addView(this.f22764r, h7.z5.q(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), c6Var);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(e(g6.N5));
            this.f22764r.addView(radialProgressView, h7.z5.e(86, 86, 17));
        } else {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                this.f22771w.addView(utVar2, h7.z5.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.f22771w;
            ut utVar3 = this.f22759n;
            if (this.S) {
                i17 = 1;
            } else if (!LocaleController.isRTL) {
                i17 = 3;
            }
            linearLayout2.addView(utVar3, h7.z5.t(-2, -2, i17 | 48, 24, 0, 24, (this.f22744b == null && this.L == null) ? 0 : this.C));
            TextView textView3 = this.f22746c;
            if (textView3 != null) {
                this.f22771w.addView(textView3, h7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        int i19 = 8;
        if (TextUtils.isEmpty(this.P)) {
            this.f22759n.setVisibility(8);
        } else {
            this.f22759n.setText(this.P);
            this.f22759n.setVisibility(0);
        }
        if (this.L != null) {
            int i20 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i20 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i20] != null) {
                    x1 x1Var = new x1(getContext(), c6Var);
                    CharSequence charSequence = this.L[i20];
                    int[] iArr = this.M;
                    x1Var.a(iArr != null ? iArr[i20] : 0, charSequence);
                    x1Var.setTag(Integer.valueOf(i20));
                    this.J0.add(x1Var);
                    this.f22771w.addView(x1Var, h7.z5.n(-1, 50));
                    final int i21 = 2;
                    x1Var.setOnClickListener(new View.OnClickListener(this) {

                        public final b2 f23757b;

                        {
                            this.f23757b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i21) {
                                case 0:
                                    this.f23757b.dismiss();
                                    break;
                                case 1:
                                    b2 b2Var = this.f23757b;
                                    new fa(b2Var.getContext(), b2Var.N0).show();
                                    break;
                                default:
                                    b2 b2Var2 = this.f23757b;
                                    DialogInterface.OnClickListener onClickListener = b2Var2.I;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(b2Var2, ((Integer) view2.getTag()).intValue());
                                    }
                                    b2Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i20++;
            }
        }
        View view2 = this.f22744b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.f22744b.getParent()).removeView(this.f22744b);
            }
            this.f22771w.addView(this.f22744b, h7.z5.n(-1, this.f22749e));
        }
        if (z14) {
            if (!this.E0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                CharSequence charSequence2 = this.f22754h0;
                int iMeasureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(24.0f) + 0) : 0;
                if (this.f22756j0 != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence3 = this.f22756j0;
                    iMeasureText = (int) (textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.f22758l0 != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(8.0f);
                    }
                    String str2 = this.f22758l0;
                    iMeasureText = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (this.f22760n0 != null) {
                    if (iMeasureText > 0) {
                        iMeasureText += AndroidUtilities.dp(8.0f);
                    }
                    CharSequence charSequence4 = this.f22760n0;
                    iMeasureText = (int) (textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(24.0f) + iMeasureText);
                }
                if (iMeasureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f)) {
                    if (!this.F0 || this.f22754h0 == null || this.f22756j0 == null || this.f22758l0 == null || this.f22760n0 == null) {
                        this.E0 = true;
                    } else {
                        this.G0 = true;
                    }
                }
            }
            if (this.E0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.f22762p0 = linearLayout3;
            } else {
                this.f22762p0 = new s2(this, getContext(), i10);
            }
            if (this.f22746c != null) {
                this.f22762p0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f11));
                this.f22762p0.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.f22762p0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            this.W0.addView(this.f22762p0, h7.z5.n(-1, this.G0 ? 96 : 52));
            if (this.S) {
                this.f22762p0.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            int i22 = 7;
            if (this.f22754h0 != null) {
                w1 w1Var = new w1(getContext(), i13);
                w1Var.setMinWidth(AndroidUtilities.dp(64.0f));
                w1Var.setTag(-1);
                w1Var.setTextSize(1, 16.0f);
                w1Var.setTextColor(e(this.E));
                w1Var.setGravity(17);
                w1Var.setTypeface(AndroidUtilities.bold());
                w1Var.setText(this.f22754h0);
                f12 = 64.0f;
                w1Var.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    f13 = 6.0f;
                    this.f22762p0.addView(w1Var, h7.z5.q(-1, 40, 7));
                } else {
                    f13 = 6.0f;
                    this.f22762p0.addView(w1Var, h7.z5.e(-2, 40, 53));
                }
                w1Var.setOnClickListener(new nh.x1(6, this, w1Var));
            } else {
                f12 = 64.0f;
                f13 = 6.0f;
            }
            if (this.f22756j0 != null) {
                w1 w1Var2 = new w1(getContext(), i10);
                w1Var2.setMinWidth(AndroidUtilities.dp(f12));
                w1Var2.setTag(-2);
                w1Var2.setTextSize(1, 16.0f);
                w1Var2.setTextColor(e(this.E));
                w1Var2.setGravity(17);
                w1Var2.setTypeface(AndroidUtilities.bold());
                w1Var2.setEllipsize(TextUtils.TruncateAt.END);
                w1Var2.setSingleLine(true);
                w1Var2.setText(this.f22756j0.toString());
                w1Var2.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22762p0.addView(w1Var2, 0, h7.z5.q(-1, 40, 7));
                } else {
                    this.f22762p0.addView(w1Var2, h7.z5.e(-2, 40, 53));
                }
                w1Var2.setOnClickListener(new nh.x1(i22, this, w1Var2));
            }
            if (this.f22760n0 != null) {
                w1 w1Var3 = new w1(getContext(), 2);
                w1Var3.setMinWidth(AndroidUtilities.dp(f12));
                w1Var3.setTag(-3);
                w1Var3.setTextSize(1, 16.0f);
                w1Var3.setTextColor(e(this.E));
                w1Var3.setGravity(17);
                w1Var3.setTypeface(AndroidUtilities.bold());
                w1Var3.setEllipsize(TextUtils.TruncateAt.END);
                w1Var3.setSingleLine(true);
                w1Var3.setText(this.f22760n0.toString());
                w1Var3.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22762p0.addView(w1Var3, 1, h7.z5.q(-1, 40, 7));
                } else {
                    this.f22762p0.addView(w1Var3, h7.z5.e(-2, 40, 51));
                }
                w1Var3.setOnClickListener(new nh.x1(i19, this, w1Var3));
            }
            if (this.f22758l0 != null) {
                w1 w1Var4 = new w1(getContext(), i12);
                w1Var4.setMinWidth(AndroidUtilities.dp(f12));
                w1Var4.setTag(-4);
                w1Var4.setTextSize(1, 16.0f);
                w1Var4.setTextColor(e(this.E));
                w1Var4.setGravity(17);
                w1Var4.setTypeface(AndroidUtilities.bold());
                w1Var4.setEllipsize(TextUtils.TruncateAt.END);
                w1Var4.setSingleLine(true);
                w1Var4.setText(this.f22758l0.toString());
                w1Var4.setBackground(g6.G0(AndroidUtilities.dp(f10), e(this.E)));
                w1Var4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.E0) {
                    this.f22762p0.addView(w1Var4, 0, h7.z5.q(-1, 40, 7));
                } else {
                    this.f22762p0.addView(w1Var4, h7.z5.e(-2, 40, 53));
                }
                w1Var4.setOnClickListener(new nh.x1(9, this, w1Var4));
            }
            if (this.E0) {
                for (int i23 = 1; i23 < this.f22762p0.getChildCount(); i23++) {
                    ((ViewGroup.MarginLayoutParams) this.f22762p0.getChildAt(i23).getLayoutParams()).topMargin = AndroidUtilities.dp(f13);
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
        } else if (i11 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.L0) {
                layoutParams3.dimAmount = this.M0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags ^= 2;
            }
            int i24 = AndroidUtilities.displaySize.x;
            this.H = i24;
            int iDp2 = (i24 - AndroidUtilities.dp(48.0f)) - (this.R0 * 2);
            int iMin = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), iDp2);
            Rect rect2 = this.f22772w0;
            layoutParams3.width = iMin + rect2.left + rect2.right;
        }
        View view3 = this.f22744b;
        if (view3 != null && this.f22769u0 && b(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.P0) {
            AndroidUtilities.makeGlobalBlurBitmap(new x0(this, i10), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final we.d g(int i10, boolean z10, boolean z11) {
        View viewD = d(i10);
        if (z11) {
            this.f22748d0 = false;
        }
        return new we.d(new p(viewD, 5), new hh.t5(this, viewD, z10, 7));
    }

    public final void h() {
        TextView textView = (TextView) d(-1);
        if (textView != null) {
            textView.setTextColor(e(g6.f23284q7));
        }
    }

    public final void i(int i10) {
        this.Q0 = i10;
        Drawable drawable = this.f22770v0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.v.invalidate();
        this.f22771w.invalidate();
    }

    public final void j() {
        this.f22747c0 = false;
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
            if (i10 >= arrayList.size()) {
                return;
            }
            x1 x1Var = (x1) arrayList.get(i10);
            x1Var.f23942a.setTextColor(i11);
            x1Var.f23943b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void m(String str) {
        this.P = str;
        if (this.f22759n != null) {
            if (TextUtils.isEmpty(str)) {
                this.f22759n.setVisibility(8);
            } else {
                this.f22759n.setText(this.P);
                this.f22759n.setVisibility(0);
            }
        }
    }

    public final void n(int i10) {
        this.f22743a0 = i10;
        z70 z70Var = this.f22763q0;
        if (z70Var != null) {
            z70Var.a(i10 / 100.0f, true);
            this.f22765r0.setText(String.format("%d%%", Integer.valueOf(this.f22743a0)));
        }
    }

    public final void o(int i10) {
        eh.s sVar = this.f22751f;
        if (sVar != null) {
            sVar.setTextColor(i10);
        }
        ut utVar = this.f22759n;
        if (utVar != null) {
            utVar.setTextColor(i10);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        i80 i80Var = this.f22767s0;
        if (i80Var != null) {
            i80Var.f(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void p() {
        if (this.f22747c0 && this.G == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.N0);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StopLoadingTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new n(this, 3));
            alertDialog$Builder.j(new r1(this, 0));
            try {
                this.G = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j10) {
        q1 q1Var = this.I0;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, j10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.postDelayed(runnable, j10);
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
        eh.s sVar = this.f22751f;
        if (sVar != null) {
            sVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.X0 = false;
            super.show();
            FrameLayout frameLayout = this.f22764r;
            if (frameLayout != null && this.Z == 3) {
                frameLayout.setScaleX(0.0f);
                this.f22764r.setScaleY(0.0f);
                this.f22764r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.S0 = System.currentTimeMillis();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        v1 v1Var = this.v;
        if (v1Var != null) {
            v1Var.removeCallbacks(runnable);
        }
    }

    public b2(Context context, int i10, c6 c6Var) {
        float f10;
        super(context, R.style.TransparentDialog);
        this.f22742a = -1;
        this.f22749e = -2;
        this.f22775y = new BitmapDrawable[2];
        this.A = new boolean[2];
        this.B = new AnimatorSet[2];
        this.C = 12;
        this.E = g6.H5;
        this.W = 132;
        this.f22745b0 = true;
        this.f22747c0 = true;
        this.f22748d0 = true;
        this.f22768t0 = new int[2];
        this.f22769u0 = true;
        this.H0 = new q1(this, 0);
        this.I0 = new q1(this, 1);
        this.J0 = new ArrayList();
        this.L0 = true;
        this.M0 = 0.5f;
        this.O0 = true;
        this.N0 = c6Var;
        this.Z = i10;
        int iE = e(g6.f23124h5);
        this.Q0 = iE;
        boolean z10 = AndroidUtilities.computePerceivedBrightness(iE) < 0.721f;
        this.P0 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256) && z10;
        Rect rect = new Rect();
        this.f22772w0 = rect;
        if (i10 != 3 || this.P0) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
            this.f22770v0 = drawableMutate;
            if (i10 == 3) {
                f10 = 0.55f;
            } else {
                f10 = z10 ? 0.8f : 0.985f;
            }
            this.f22774x0 = f10;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.Q0, PorterDuff.Mode.MULTIPLY));
            drawableMutate.getPadding(rect);
        }
        this.D = i10 == 3;
    }
}
