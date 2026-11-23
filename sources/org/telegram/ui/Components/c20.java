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
public final class c20 implements org.telegram.messenger.gs {
    public static c20 f33981f0 = null;
    public static boolean f33982g0 = true;
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
    public final i20 W;
    public final rh0 X;
    public boolean Y;
    public boolean Z;
    public final a20 f33983a;
    public boolean f33984a0;
    public final bi.e3 f33985b;
    public AnimatorSet f33986b0;
    public final hi.l5 f33987c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 f33990e;
    public ValueAnimator f33991e0;
    public final g20 f33992f;
    public final int h;
    public WindowManager f33993n;
    public boolean f33994r;
    public WindowManager.LayoutParams f33995s;
    public final e9 f33996w;
    public final oh0 f33997x;
    public boolean f33998y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final y10 U = new y10(this, 0);
    public final y10 V = new y10(this, 1);
    public boolean f33988c0 = false;
    public float f33989d0 = 0.0f;

    public c20(final Context context, int i7) {
        this.h = i7;
        a20 a20Var = new a20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f33983a = a20Var;
        a20Var.setAlpha(0.7f);
        i20 i20Var = new i20(context, i7);
        this.W = i20Var;
        a20Var.addView(i20Var, c8.ma.e(-1, -1, 17));
        e9 e9Var = new e9(context, true);
        this.f33996w = e9Var;
        e9Var.setStyle(5);
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        e9Var.setDelegate(new oo(this, 20));
        h(false);
        a20Var.addView(e9Var, c8.ma.e(108, 36, 49));
        bi.e3 e3Var = new bi.e3(21, context, this);
        this.f33985b = e3Var;
        hi.l5 l5Var = new hi.l5(this, context);
        this.f33987c = l5Var;
        e3Var.addView(l5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        oh0 oh0Var = new oh0(2131624043, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f33997x = oh0Var;
        oh0Var.h = true;
        imageView.setAnimation(oh0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.ma.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f33990e = w7Var;
        w7Var.setOnClickListener(new o0(this, 22));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f35399f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f35404x = true;
        linearLayout.setOrientation(1);
        linearLayout.f35405y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        q9 q9Var = new q9(context);
        linearLayout.f35398e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(q9Var, c8.ma.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new o0((Object) linearLayout, 23));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f35395a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.o10.f(linearLayout2, textView, c8.ma.o(-1, -2), context);
        linearLayout.f35396b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.ma.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.ma.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ma.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        linearLayout.f35397c = q2Var;
        q2Var.setTextSize(12);
        q2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g20 g20Var = linearLayout;
                        g20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        q2Var.setCheckable(true);
        q2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        linearLayout.d = q2Var2;
        q2Var2.setTextSize(12);
        q2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g20 g20Var = linearLayout;
                        g20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.q2 q2Var3 = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        q2Var3.setTextSize(12);
        q2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.N0(2131743119, null), false, false);
        q2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g20 g20Var = linearLayout;
                        g20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.g0.D3(textViewArr[0]);
                                org.telegram.messenger.g0.D3(textViewArr[1]);
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
                        org.telegram.ui.f40.x1(context3, new e20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.m1 m1Var = new org.telegram.ui.Components.voip.m1(context);
        m1Var.setChildSize(68);
        m1Var.setUseStartPadding(false);
        m1Var.addView(q2Var, c8.ma.c(63.0f, 68));
        m1Var.addView(q2Var2, c8.ma.c(63.0f, 68));
        m1Var.addView(q2Var3, c8.ma.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(m1Var, c8.ma.t(-1, -2, 0, 6, 0, 6, 0));
        this.f33992f = linearLayout;
        w7Var.addView((View) linearLayout, c8.ma.c(-2.0f, -2));
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
        c20 c20Var = f33981f0;
        if (c20Var != null) {
            c20Var.f(false);
            c20 c20Var2 = f33981f0;
            WindowManager windowManager = c20Var2.f33993n;
            a20 a20Var = c20Var2.f33983a;
            a20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new w10(a20Var, c20Var2.f33985b, c20Var2.d, windowManager, c20Var2.f33990e)).start();
            f33981f0.e();
            f33981f0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.j1.j() && f33981f0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f33982g0) {
                if (org.telegram.messenger.t0.f26940y || !org.telegram.ui.f40.D5) {
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
        org.telegram.ui.Components.voip.e0 e0Var;
        boolean z11;
        WindowManager windowManager;
        c20 c20Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context2 = org.telegram.messenger.t0.f26931b;
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.j1.j() || (!canDrawOverlays ? !z10 || f33982g0 || W == null || org.telegram.messenger.t0.f26940y || org.telegram.ui.f40.D5 || org.telegram.messenger.g0.H1(W) || ((e0Var = org.telegram.ui.Components.voip.e0.f40986e) != null && e0Var.f40988b != null) : !z10 || f33982g0 || (!org.telegram.messenger.t0.f26940y && org.telegram.ui.f40.D5))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (c20Var = f33981f0) != null && c20Var.f33994r != canDrawOverlays) {
            c();
        }
        if (z11) {
            int account = sharedInstance.getAccount();
            if (f33981f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f26931b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    c20 c20Var2 = new c20(context, account);
                    f33981f0 = c20Var2;
                    c20Var2.f33994r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f26931b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f33981f0.f33993n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f33981f0.f33990e, b10);
                    f33981f0.f33990e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33981f0.f33985b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    c20 c20Var3 = f33981f0;
                    c20Var3.f33995s = b12;
                    windowManager.addView(c20Var3.f33983a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33981f0.d, b13);
                    f33981f0.f33985b.setVisibility(8);
                    f33981f0.f33983a.setScaleX(0.5f);
                    f33981f0.f33983a.setScaleY(0.5f);
                    f33981f0.f33983a.setAlpha(0.0f);
                    f33981f0.f33983a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.ls.f(f33981f0.h).b(f33981f0, org.telegram.messenger.ls.f25407w2);
                    org.telegram.messenger.ls.e().b(f33981f0, org.telegram.messenger.ls.R4);
                    org.telegram.messenger.ls.e().b(f33981f0, org.telegram.messenger.ls.D2);
                    org.telegram.ui.Components.voip.e0.k();
                }
            }
            c20 c20Var4 = f33981f0;
            if (c20Var4 != null) {
                e9 e9Var = c20Var4.f33996w;
                if (e9Var.getTag() == null) {
                    e9Var.animate().setListener(null).cancel();
                    if (e9Var.getVisibility() != 0) {
                        e9Var.setVisibility(0);
                        e9Var.setAlpha(0.0f);
                        e9Var.setScaleX(0.5f);
                        e9Var.setScaleY(0.5f);
                    }
                    e9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    e9Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        c20 c20Var5 = f33981f0;
        if (c20Var5 != null && !c20Var5.f33994r) {
            c20Var5.f33983a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z10;
        if (!this.Z && !this.f33998y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f33984a0 != z10) {
            this.f33984a0 = z10;
            a20 a20Var = this.f33983a;
            if (z10) {
                a20Var.animate().alpha(1.0f).start();
            } else {
                a20Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ls.f25407w2 && i7 != org.telegram.messenger.ls.R4) {
            if (i7 == org.telegram.messenger.ls.D2) {
                k(org.telegram.messenger.t0.f26931b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.ls.f(this.h).n(this, org.telegram.messenger.ls.f25407w2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.R4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.F2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.f33998y) {
            this.f33998y = z10;
            org.telegram.ui.w7 w7Var = this.f33990e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.f33998y;
            g20 g20Var = this.f33992f;
            if (z11) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    g20Var.setScaleX(0.7f);
                    g20Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                g20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                g20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new x10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            AnimatorSet animatorSet = this.f33986b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f33986b0.cancel();
            }
            hi.l5 l5Var = this.f33987c;
            if (z10) {
                bi.e3 e3Var = this.f33985b;
                if (e3Var.getVisibility() != 0) {
                    e3Var.setVisibility(0);
                    l5Var.setAlpha(0.0f);
                    l5Var.setScaleX(0.5f);
                    l5Var.setScaleY(0.5f);
                    this.f33997x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33986b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(l5Var, View.ALPHA, l5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(l5Var, View.SCALE_X, l5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(l5Var, View.SCALE_Y, l5Var.getScaleY(), 1.0f));
                this.f33986b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f33986b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(l5Var, View.ALPHA, l5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(l5Var, View.SCALE_X, l5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(l5Var, View.SCALE_Y, l5Var.getScaleY(), 0.5f));
            this.f33986b0.addListener(new x10(this, 0));
            this.f33986b0.setDuration(150L);
            this.f33986b0.start();
        }
    }

    public final void h(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        e9 e9Var = this.f33996w;
        d9 d9Var = e9Var.f34700a;
        if (d9Var.f34428f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                t3Var = sharedInstance.groupCall;
            } else {
                t3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (t3Var != null) {
                ArrayList arrayList = t3Var.f26952e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            e9Var.b(i7, i10, groupCallParticipant);
                        }
                        i11++;
                    } else {
                        e9Var.b(i7, i10, null);
                    }
                    i7++;
                    i11++;
                }
                e9Var.b(2, i10, null);
                e9Var.a(z10);
                return;
            }
            while (i7 < 3) {
                e9Var.b(i7, i10, null);
                i7++;
            }
            e9Var.a(z10);
            return;
        }
        d9Var.f34429g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f24046q.x;
        a20 a20Var = this.f33983a;
        float min = Math.min(Math.max(this.f33995s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - a20Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        e9 e9Var = this.f33996w;
        if (i10 < 0) {
            e9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - a20Var.getMeasuredWidth()) {
            e9Var.setTranslationX((-Math.abs(min - (i7 - a20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            e9Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.e3 e3Var = this.f33985b;
        float measuredWidth = (e3Var.getMeasuredWidth() / 2.0f) + f10;
        a20 a20Var = this.f33983a;
        float measuredWidth2 = measuredWidth - (a20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((e3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (a20Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f33995s;
        float f11 = this.Q;
        float f12 = this.f33989d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (a20Var.getParent() != null) {
            this.f33993n.updateViewLayout(a20Var, this.f33995s);
        }
    }
}
