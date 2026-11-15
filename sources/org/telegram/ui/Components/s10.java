package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class s10 implements org.telegram.messenger.is {
    public static s10 f39139f0 = null;
    public static boolean f39140g0 = true;
    public boolean E;
    public boolean F;
    public boolean H;
    public int K;
    public int L;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final y10 W;
    public final fh0 X;
    public boolean Y;
    public boolean Z;
    public final q10 f39141a;
    public boolean f39142a0;
    public final bi.g2 f39143b;
    public AnimatorSet f39144b0;
    public final hi.n5 f39145c;
    public final FrameLayout d;
    public final org.telegram.ui.x7 f39148e;
    public ValueAnimator f39149e0;
    public final w10 f39150f;
    public final int h;
    public WindowManager f39151n;
    public boolean f39152r;
    public WindowManager.LayoutParams f39153s;
    public final w8 f39154w;
    public final ch0 f39155x;
    public boolean f39156y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final o10 U = new o10(this, 0);
    public final o10 V = new o10(this, 1);
    public boolean f39146c0 = false;
    public float f39147d0 = 0.0f;

    public s10(final Context context, int i7) {
        this.h = i7;
        q10 q10Var = new q10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f39141a = q10Var;
        q10Var.setAlpha(0.7f);
        y10 y10Var = new y10(context, i7);
        this.W = y10Var;
        q10Var.addView(y10Var, c8.ja.e(-1, -1, 17));
        w8 w8Var = new w8(context, true);
        this.f39154w = w8Var;
        w8Var.setStyle(5);
        w8Var.setCentered(true);
        w8Var.setVisibility(8);
        w8Var.setDelegate(new fo(this, 20));
        h(false);
        q10Var.addView(w8Var, c8.ja.e(108, 36, 49));
        bi.g2 g2Var = new bi.g2(21, context, this);
        this.f39143b = g2Var;
        hi.n5 n5Var = new hi.n5(this, context);
        this.f39145c = n5Var;
        g2Var.addView(n5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ch0 ch0Var = new ch0(2131624043, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f39155x = ch0Var;
        ch0Var.h = true;
        imageView.setAnimation(ch0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.ja.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, 2);
        this.f39148e = x7Var;
        x7Var.setOnClickListener(new e0(this, 21));
        x7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f41222f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f41227x = true;
        linearLayout.setOrientation(1);
        linearLayout.f41228y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        i9 i9Var = new i9(context);
        linearLayout.f41221e = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(i9Var, c8.ja.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new e0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f41218a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.i20.f(linearLayout2, textView, c8.ja.o(-1, -2), context);
        linearLayout.f41219b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.ja.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.ja.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ja.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        linearLayout.f41220c = r2Var;
        r2Var.setTextSize(12);
        r2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        w10 w10Var = linearLayout;
                        w10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        r2Var.setCheckable(true);
        r2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        linearLayout.d = r2Var2;
        r2Var2.setTextSize(12);
        r2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        w10 w10Var = linearLayout;
                        w10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        r2Var3.setTextSize(12);
        r2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.M0(2131743364, null), false, false);
        r2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        w10 w10Var = linearLayout;
                        w10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(w10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.E3(textViewArr[0]);
                                org.telegram.messenger.g0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.c40.w1(context3, new u10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(context);
        n1Var.setChildSize(68);
        n1Var.setUseStartPadding(false);
        n1Var.addView(r2Var, c8.ja.c(63.0f, 68));
        n1Var.addView(r2Var2, c8.ja.c(63.0f, 68));
        n1Var.addView(r2Var3, c8.ja.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(n1Var, c8.ja.t(-1, -2, 0, 6, 0, 6, 0));
        this.f39150f = linearLayout;
        x7Var.addView((View) linearLayout, c8.ja.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(105.0f);
        layoutParams.width = org.telegram.messenger.g0.L(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (Settings.canDrawOverlays(context)) {
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2003;
            }
        } else {
            layoutParams.type = 99;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static void c() {
        s10 s10Var = f39139f0;
        if (s10Var != null) {
            s10Var.f(false);
            s10 s10Var2 = f39139f0;
            WindowManager windowManager = s10Var2.f39151n;
            q10 q10Var = s10Var2.f39141a;
            q10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new m10(q10Var, s10Var2.f39143b, s10Var2.d, windowManager, s10Var2.f39148e)).start();
            f39139f0.e();
            f39139f0 = null;
            org.telegram.ui.Components.voip.f0.k();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.k1.i() && f39139f0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f39140g0) {
                if (org.telegram.messenger.t0.f26618y || !org.telegram.ui.c40.D5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void k(Context context) {
        boolean z10;
        org.telegram.ui.Components.voip.f0 f0Var;
        boolean z11;
        WindowManager windowManager;
        s10 s10Var;
        org.telegram.ui.Components.voip.f0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context2 = org.telegram.messenger.t0.f26609b;
        Typeface typeface = org.telegram.messenger.g0.f23583a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.k1.i() || (!canDrawOverlays ? !z10 || f39140g0 || W == null || org.telegram.messenger.t0.f26618y || org.telegram.ui.c40.D5 || org.telegram.messenger.g0.H1(W) || ((f0Var = org.telegram.ui.Components.voip.f0.f40606e) != null && f0Var.f40608b != null) : !z10 || f39140g0 || (!org.telegram.messenger.t0.f26618y && org.telegram.ui.c40.D5))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (s10Var = f39139f0) != null && s10Var.f39152r != canDrawOverlays) {
            c();
        }
        if (z11) {
            int account = sharedInstance.getAccount();
            if (f39139f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f26609b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    s10 s10Var2 = new s10(context, account);
                    f39139f0 = s10Var2;
                    s10Var2.f39152r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f26609b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f39139f0.f39151n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f39139f0.f39148e, b10);
                    f39139f0.f39148e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f39139f0.f39143b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    s10 s10Var3 = f39139f0;
                    s10Var3.f39153s = b12;
                    windowManager.addView(s10Var3.f39141a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f39139f0.d, b13);
                    f39139f0.f39143b.setVisibility(8);
                    f39139f0.f39141a.setScaleX(0.5f);
                    f39139f0.f39141a.setScaleY(0.5f);
                    f39139f0.f39141a.setAlpha(0.0f);
                    f39139f0.f39141a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.ns.f(f39139f0.h).b(f39139f0, org.telegram.messenger.ns.f25596w2);
                    org.telegram.messenger.ns.e().b(f39139f0, org.telegram.messenger.ns.O4);
                    org.telegram.messenger.ns.e().b(f39139f0, org.telegram.messenger.ns.D2);
                    org.telegram.ui.Components.voip.f0.k();
                }
            }
            s10 s10Var4 = f39139f0;
            if (s10Var4 != null) {
                w8 w8Var = s10Var4.f39154w;
                if (w8Var.getTag() == null) {
                    w8Var.animate().setListener(null).cancel();
                    if (w8Var.getVisibility() != 0) {
                        w8Var.setVisibility(0);
                        w8Var.setAlpha(0.0f);
                        w8Var.setScaleX(0.5f);
                        w8Var.setScaleY(0.5f);
                    }
                    w8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    w8Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        s10 s10Var5 = f39139f0;
        if (s10Var5 != null && !s10Var5.f39152r) {
            s10Var5.f39141a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z10;
        if (!this.Z && !this.f39156y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f39142a0 != z10) {
            this.f39142a0 = z10;
            q10 q10Var = this.f39141a;
            if (z10) {
                q10Var.animate().alpha(1.0f).start();
            } else {
                q10Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.f25596w2 && i7 != org.telegram.messenger.ns.O4) {
            if (i7 == org.telegram.messenger.ns.D2) {
                k(org.telegram.messenger.t0.f26609b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.ns.f(this.h).n(this, org.telegram.messenger.ns.f25596w2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.O4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.F2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.f39156y) {
            this.f39156y = z10;
            org.telegram.ui.x7 x7Var = this.f39148e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.f39156y;
            w10 w10Var = this.f39150f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    w10Var.setScaleX(0.7f);
                    w10Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                w10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                w10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new n10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            AnimatorSet animatorSet = this.f39144b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f39144b0.cancel();
            }
            hi.n5 n5Var = this.f39145c;
            if (z10) {
                bi.g2 g2Var = this.f39143b;
                if (g2Var.getVisibility() != 0) {
                    g2Var.setVisibility(0);
                    n5Var.setAlpha(0.0f);
                    n5Var.setScaleX(0.5f);
                    n5Var.setScaleY(0.5f);
                    this.f39155x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f39144b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(n5Var, View.ALPHA, n5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_X, n5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, n5Var.getScaleY(), 1.0f));
                this.f39144b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f39144b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, View.ALPHA, n5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_X, n5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, n5Var.getScaleY(), 0.5f));
            this.f39144b0.addListener(new n10(this, 0));
            this.f39144b0.setDuration(150L);
            this.f39144b0.start();
        }
    }

    public final void h(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        w8 w8Var = this.f39154w;
        v8 v8Var = w8Var.f41314a;
        if (v8Var.f40327f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                r3Var = sharedInstance.groupCall;
            } else {
                r3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f26218e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            w8Var.b(i7, i10, groupCallParticipant);
                        }
                        i11++;
                    } else {
                        w8Var.b(i7, i10, null);
                    }
                    i7++;
                    i11++;
                }
                w8Var.b(2, i10, null);
                w8Var.a(z10);
                return;
            }
            while (i7 < 3) {
                w8Var.b(i7, i10, null);
                i7++;
            }
            w8Var.a(z10);
            return;
        }
        v8Var.f40328g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f23611q.x;
        q10 q10Var = this.f39141a;
        float min = Math.min(Math.max(this.f39153s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - q10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        w8 w8Var = this.f39154w;
        if (i10 < 0) {
            w8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - q10Var.getMeasuredWidth()) {
            w8Var.setTranslationX((-Math.abs(min - (i7 - q10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            w8Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.g2 g2Var = this.f39143b;
        float measuredWidth = (g2Var.getMeasuredWidth() / 2.0f) + f10;
        q10 q10Var = this.f39141a;
        float measuredWidth2 = measuredWidth - (q10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((g2Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (q10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f39153s;
        float f11 = this.Q;
        float f12 = this.f39147d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (q10Var.getParent() != null) {
            this.f39151n.updateViewLayout(q10Var, this.f39153s);
        }
    }
}
