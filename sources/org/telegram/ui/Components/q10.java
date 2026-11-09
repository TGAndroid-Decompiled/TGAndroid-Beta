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
public final class q10 implements org.telegram.messenger.ls {
    public static q10 f37162e0 = null;
    public static boolean f37163f0 = true;
    public boolean D;
    public boolean E;
    public boolean G;
    public int J;
    public int K;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public final w10 V;
    public final dh0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final n10 f37164a;
    public AnimatorSet f37165a0;
    public final bi.e5 f37166b;
    public final fi.p5 f37168c;
    public final FrameLayout d;
    public ValueAnimator f37170d0;
    public final org.telegram.ui.w7 f37171e;
    public final u10 f37172f;
    public final int h;
    public WindowManager f37173n;
    public boolean f37174r;
    public WindowManager.LayoutParams f37175s;
    public final z8 f37176w;
    public final ah0 f37177x;
    public boolean f37178y;
    public float F = 0.0f;
    public final int[] H = new int[2];
    public final float[] I = new float[2];
    public float L = -1.0f;
    public float M = -1.0f;
    public final l10 T = new l10(this, 0);
    public final l10 U = new l10(this, 1);
    public boolean f37167b0 = false;
    public float f37169c0 = 0.0f;

    public q10(final Context context, int i7) {
        this.h = i7;
        n10 n10Var = new n10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f37164a = n10Var;
        n10Var.setAlpha(0.7f);
        w10 w10Var = new w10(context, i7);
        this.V = w10Var;
        n10Var.addView(w10Var, c8.ha.e(-1, -1, 17));
        z8 z8Var = new z8(context, true);
        this.f37176w = z8Var;
        z8Var.setStyle(5);
        z8Var.setCentered(true);
        z8Var.setVisibility(8);
        z8Var.setDelegate(new gp(this, 18));
        h(false);
        n10Var.addView(z8Var, c8.ha.e(108, 36, 49));
        bi.e5 e5Var = new bi.e5(20, context, this);
        this.f37166b = e5Var;
        fi.p5 p5Var = new fi.p5(this, context);
        this.f37168c = p5Var;
        e5Var.addView(p5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.W = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ah0 ah0Var = new ah0(2131624042, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f37177x = ah0Var;
        ah0Var.h = true;
        imageView.setAnimation(ah0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.ha.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f37171e = w7Var;
        w7Var.setOnClickListener(new h0(this, 20));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f38555f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f38560x = true;
        linearLayout.setOrientation(1);
        linearLayout.f38561y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        l9 l9Var = new l9(context);
        linearLayout.f38554e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(l9Var, c8.ha.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new h0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f38551a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, c8.ha.o(-1, -2), context);
        linearLayout.f38552b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.ha.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ha.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        linearLayout.f38553c = n2Var;
        n2Var.setTextSize(12);
        n2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u10 u10Var = linearLayout;
                        u10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(u10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        org.telegram.ui.e40.w1(context3, new s10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        n2Var.setCheckable(true);
        n2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        linearLayout.d = n2Var2;
        n2Var2.setTextSize(12);
        n2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u10 u10Var = linearLayout;
                        u10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(u10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        org.telegram.ui.e40.w1(context3, new s10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        n2Var3.setTextSize(12);
        n2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, false);
        n2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u10 u10Var = linearLayout;
                        u10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(u10Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.F3(textViewArr[0]);
                                org.telegram.messenger.g0.F3(textViewArr[1]);
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
                        org.telegram.ui.e40.w1(context3, new s10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(context);
        j1Var.setChildSize(68);
        j1Var.setUseStartPadding(false);
        j1Var.addView(n2Var, c8.ha.c(63.0f, 68));
        j1Var.addView(n2Var2, c8.ha.c(63.0f, 68));
        j1Var.addView(n2Var3, c8.ha.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(j1Var, c8.ha.t(-1, -2, 0, 6, 0, 6, 0));
        this.f37172f = linearLayout;
        w7Var.addView((View) linearLayout, c8.ha.c(-2.0f, -2));
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
        q10 q10Var = f37162e0;
        if (q10Var != null) {
            q10Var.f(false);
            q10 q10Var2 = f37162e0;
            WindowManager windowManager = q10Var2.f37173n;
            n10 n10Var = q10Var2.f37164a;
            n10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new j10(n10Var, q10Var2.f37166b, q10Var2.d, windowManager, q10Var2.f37171e)).start();
            f37162e0.e();
            f37162e0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.g1.i() && f37162e0 == null) {
            if (org.telegram.messenger.t0.F && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f37163f0) {
                if (org.telegram.messenger.t0.f25575y || !org.telegram.ui.e40.f45183v5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void k(Context context) {
        boolean z9;
        org.telegram.ui.Components.voip.e0 e0Var;
        boolean z10;
        WindowManager windowManager;
        q10 q10Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z9 = true;
        } else {
            z9 = false;
        }
        Context context2 = org.telegram.messenger.t0.f25566b;
        Typeface typeface = org.telegram.messenger.g0.f22535a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.g1.i() || (!canDrawOverlays ? !z9 || f37163f0 || W == null || org.telegram.messenger.t0.f25575y || org.telegram.ui.e40.f45183v5 || org.telegram.messenger.g0.H1(W) || ((e0Var = org.telegram.ui.Components.voip.e0.f39254e) != null && e0Var.f39256b != null) : !z9 || f37163f0 || (!org.telegram.messenger.t0.f25575y && org.telegram.ui.e40.f45183v5))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (q10Var = f37162e0) != null && q10Var.f37174r != canDrawOverlays) {
            c();
        }
        if (z10) {
            int account = sharedInstance.getAccount();
            if (f37162e0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f25566b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    q10 q10Var2 = new q10(context, account);
                    f37162e0 = q10Var2;
                    q10Var2.f37174r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f37162e0.f37173n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f37162e0.f37171e, b10);
                    f37162e0.f37171e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f37162e0.f37166b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    q10 q10Var3 = f37162e0;
                    q10Var3.f37175s = b12;
                    windowManager.addView(q10Var3.f37164a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f37162e0.d, b13);
                    f37162e0.f37166b.setVisibility(8);
                    f37162e0.f37164a.setScaleX(0.5f);
                    f37162e0.f37164a.setScaleY(0.5f);
                    f37162e0.f37164a.setAlpha(0.0f);
                    f37162e0.f37164a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.qs.f(f37162e0.h).b(f37162e0, org.telegram.messenger.qs.f25099w2);
                    org.telegram.messenger.qs.e().b(f37162e0, org.telegram.messenger.qs.O4);
                    org.telegram.messenger.qs.e().b(f37162e0, org.telegram.messenger.qs.D2);
                    org.telegram.ui.Components.voip.e0.k();
                }
            }
            q10 q10Var4 = f37162e0;
            if (q10Var4 != null) {
                z8 z8Var = q10Var4.f37176w;
                if (z8Var.getTag() == null) {
                    z8Var.animate().setListener(null).cancel();
                    if (z8Var.getVisibility() != 0) {
                        z8Var.setVisibility(0);
                        z8Var.setAlpha(0.0f);
                        z8Var.setScaleX(0.5f);
                        z8Var.setScaleY(0.5f);
                    }
                    z8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    z8Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        q10 q10Var5 = f37162e0;
        if (q10Var5 != null && !q10Var5.f37174r) {
            q10Var5.f37164a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z9;
        if (!this.Y && !this.f37178y) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.Z != z9) {
            this.Z = z9;
            n10 n10Var = this.f37164a;
            if (z9) {
                n10Var.animate().alpha(1.0f).start();
            } else {
                n10Var.animate().alpha(0.7f).start();
            }
            this.V.setPressedState(z9);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.f25099w2 && i7 != org.telegram.messenger.qs.O4) {
            if (i7 == org.telegram.messenger.qs.D2) {
                k(org.telegram.messenger.t0.f25566b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.qs.f(this.h).n(this, org.telegram.messenger.qs.f25099w2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.F2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
    }

    public final void f(boolean z9) {
        if (z9 != this.f37178y) {
            this.f37178y = z9;
            org.telegram.ui.w7 w7Var = this.f37171e;
            w7Var.animate().setListener(null).cancel();
            boolean z10 = this.f37178y;
            u10 u10Var = this.f37172f;
            if (z10) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    u10Var.setScaleX(0.7f);
                    u10Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                u10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                u10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new k10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            AnimatorSet animatorSet = this.f37165a0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f37165a0.cancel();
            }
            fi.p5 p5Var = this.f37168c;
            if (z9) {
                bi.e5 e5Var = this.f37166b;
                if (e5Var.getVisibility() != 0) {
                    e5Var.setVisibility(0);
                    p5Var.setAlpha(0.0f);
                    p5Var.setScaleX(0.5f);
                    p5Var.setScaleY(0.5f);
                    this.f37177x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37165a0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(p5Var, View.ALPHA, p5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_X, p5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_Y, p5Var.getScaleY(), 1.0f));
                this.f37165a0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f37165a0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p5Var, View.ALPHA, p5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_X, p5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(p5Var, View.SCALE_Y, p5Var.getScaleY(), 0.5f));
            this.f37165a0.addListener(new k10(this, 0));
            this.f37165a0.setDuration(150L);
            this.f37165a0.start();
        }
    }

    public final void h(boolean z9) {
        org.telegram.messenger.r3 r3Var;
        z8 z8Var = this.f37176w;
        y8 y8Var = z8Var.f40934a;
        if (y8Var.f40648f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                r3Var = sharedInstance.groupCall;
            } else {
                r3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f25224e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.ij.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            z8Var.b(i7, i10, groupCallParticipant);
                        }
                        i11++;
                    } else {
                        z8Var.b(i7, i10, null);
                    }
                    i7++;
                    i11++;
                }
                z8Var.b(2, i10, null);
                z8Var.a(z9);
                return;
            }
            while (i7 < 3) {
                z8Var.b(i7, i10, null);
                i7++;
            }
            z8Var.a(z9);
            return;
        }
        y8Var.f40649g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f22563q.x;
        n10 n10Var = this.f37164a;
        float min = Math.min(Math.max(this.f37175s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - n10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        z8 z8Var = this.f37176w;
        if (i10 < 0) {
            z8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - n10Var.getMeasuredWidth()) {
            z8Var.setTranslationX((-Math.abs(min - (i7 - n10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            z8Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.O - this.R;
        bi.e5 e5Var = this.f37166b;
        float measuredWidth = (e5Var.getMeasuredWidth() / 2.0f) + f10;
        n10 n10Var = this.f37164a;
        float measuredWidth2 = measuredWidth - (n10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((e5Var.getMeasuredHeight() / 2.0f) + (this.N - this.S)) - (n10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f37175s;
        float f11 = this.P;
        float f12 = this.f37169c0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.Q));
        i();
        if (n10Var.getParent() != null) {
            this.f37173n.updateViewLayout(n10Var, this.f37175s);
        }
    }
}
