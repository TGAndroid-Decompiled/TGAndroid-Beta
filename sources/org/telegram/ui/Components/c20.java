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
    public static c20 f33945f0 = null;
    public static boolean f33946g0 = true;
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
    public final a20 f33947a;
    public boolean f33948a0;
    public final bi.g3 f33949b;
    public AnimatorSet f33950b0;
    public final hi.m5 f33951c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 f33954e;
    public ValueAnimator f33955e0;
    public final g20 f33956f;
    public final int h;
    public WindowManager f33957n;
    public boolean f33958r;
    public WindowManager.LayoutParams f33959s;
    public final e9 f33960w;
    public final oh0 f33961x;
    public boolean f33962y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final y10 U = new y10(this, 0);
    public final y10 V = new y10(this, 1);
    public boolean f33952c0 = false;
    public float f33953d0 = 0.0f;

    public c20(final Context context, int i7) {
        this.h = i7;
        a20 a20Var = new a20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f33947a = a20Var;
        a20Var.setAlpha(0.7f);
        i20 i20Var = new i20(context, i7);
        this.W = i20Var;
        a20Var.addView(i20Var, c8.na.e(-1, -1, 17));
        e9 e9Var = new e9(context, true);
        this.f33960w = e9Var;
        e9Var.setStyle(5);
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        e9Var.setDelegate(new oo(this, 20));
        h(false);
        a20Var.addView(e9Var, c8.na.e(108, 36, 49));
        bi.g3 g3Var = new bi.g3(21, context, this);
        this.f33949b = g3Var;
        hi.m5 m5Var = new hi.m5(this, context);
        this.f33951c = m5Var;
        g3Var.addView(m5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        oh0 oh0Var = new oh0(2131624043, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f33961x = oh0Var;
        oh0Var.h = true;
        imageView.setAnimation(oh0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.na.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f33954e = w7Var;
        w7Var.setOnClickListener(new o0(this, 22));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f35361f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f35366x = true;
        linearLayout.setOrientation(1);
        linearLayout.f35367y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        q9 q9Var = new q9(context);
        linearLayout.f35360e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(q9Var, c8.na.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new o0((Object) linearLayout, 23));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f35357a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.o10.f(linearLayout2, textView, c8.na.o(-1, -2), context);
        linearLayout.f35358b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.na.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.na.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.na.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        linearLayout.f35359c = q2Var;
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
        q2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.N0(2131743121, null), false, false);
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
        m1Var.addView(q2Var, c8.na.c(63.0f, 68));
        m1Var.addView(q2Var2, c8.na.c(63.0f, 68));
        m1Var.addView(q2Var3, c8.na.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(m1Var, c8.na.t(-1, -2, 0, 6, 0, 6, 0));
        this.f33956f = linearLayout;
        w7Var.addView((View) linearLayout, c8.na.c(-2.0f, -2));
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
        c20 c20Var = f33945f0;
        if (c20Var != null) {
            c20Var.f(false);
            c20 c20Var2 = f33945f0;
            WindowManager windowManager = c20Var2.f33957n;
            a20 a20Var = c20Var2.f33947a;
            a20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new w10(a20Var, c20Var2.f33949b, c20Var2.d, windowManager, c20Var2.f33954e)).start();
            f33945f0.e();
            f33945f0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.j1.j() && f33945f0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f33946g0) {
                if (org.telegram.messenger.t0.f26904y || !org.telegram.ui.f40.D5) {
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
        Context context2 = org.telegram.messenger.t0.f26895b;
        Typeface typeface = org.telegram.messenger.g0.f23982a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.j1.j() || (!canDrawOverlays ? !z10 || f33946g0 || W == null || org.telegram.messenger.t0.f26904y || org.telegram.ui.f40.D5 || org.telegram.messenger.g0.H1(W) || ((e0Var = org.telegram.ui.Components.voip.e0.f40948e) != null && e0Var.f40950b != null) : !z10 || f33946g0 || (!org.telegram.messenger.t0.f26904y && org.telegram.ui.f40.D5))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (c20Var = f33945f0) != null && c20Var.f33958r != canDrawOverlays) {
            c();
        }
        if (z11) {
            int account = sharedInstance.getAccount();
            if (f33945f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f26895b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    c20 c20Var2 = new c20(context, account);
                    f33945f0 = c20Var2;
                    c20Var2.f33958r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f26895b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f33945f0.f33957n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f33945f0.f33954e, b10);
                    f33945f0.f33954e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33945f0.f33949b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    c20 c20Var3 = f33945f0;
                    c20Var3.f33959s = b12;
                    windowManager.addView(c20Var3.f33947a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33945f0.d, b13);
                    f33945f0.f33949b.setVisibility(8);
                    f33945f0.f33947a.setScaleX(0.5f);
                    f33945f0.f33947a.setScaleY(0.5f);
                    f33945f0.f33947a.setAlpha(0.0f);
                    f33945f0.f33947a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.ls.f(f33945f0.h).b(f33945f0, org.telegram.messenger.ls.f25371w2);
                    org.telegram.messenger.ls.e().b(f33945f0, org.telegram.messenger.ls.R4);
                    org.telegram.messenger.ls.e().b(f33945f0, org.telegram.messenger.ls.D2);
                    org.telegram.ui.Components.voip.e0.k();
                }
            }
            c20 c20Var4 = f33945f0;
            if (c20Var4 != null) {
                e9 e9Var = c20Var4.f33960w;
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
        c20 c20Var5 = f33945f0;
        if (c20Var5 != null && !c20Var5.f33958r) {
            c20Var5.f33947a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z10;
        if (!this.Z && !this.f33962y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f33948a0 != z10) {
            this.f33948a0 = z10;
            a20 a20Var = this.f33947a;
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
        if (i7 != org.telegram.messenger.ls.f25371w2 && i7 != org.telegram.messenger.ls.R4) {
            if (i7 == org.telegram.messenger.ls.D2) {
                k(org.telegram.messenger.t0.f26895b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.ls.f(this.h).n(this, org.telegram.messenger.ls.f25371w2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.R4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.F2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.f33962y) {
            this.f33962y = z10;
            org.telegram.ui.w7 w7Var = this.f33954e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.f33962y;
            g20 g20Var = this.f33956f;
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
            AnimatorSet animatorSet = this.f33950b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f33950b0.cancel();
            }
            hi.m5 m5Var = this.f33951c;
            if (z10) {
                bi.g3 g3Var = this.f33949b;
                if (g3Var.getVisibility() != 0) {
                    g3Var.setVisibility(0);
                    m5Var.setAlpha(0.0f);
                    m5Var.setScaleX(0.5f);
                    m5Var.setScaleY(0.5f);
                    this.f33961x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33950b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(m5Var, View.ALPHA, m5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_X, m5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_Y, m5Var.getScaleY(), 1.0f));
                this.f33950b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f33950b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(m5Var, View.ALPHA, m5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_X, m5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(m5Var, View.SCALE_Y, m5Var.getScaleY(), 0.5f));
            this.f33950b0.addListener(new x10(this, 0));
            this.f33950b0.setDuration(150L);
            this.f33950b0.start();
        }
    }

    public final void h(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        e9 e9Var = this.f33960w;
        d9 d9Var = e9Var.f34690a;
        if (d9Var.f34391f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                t3Var = sharedInstance.groupCall;
            } else {
                t3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (t3Var != null) {
                ArrayList arrayList = t3Var.f26916e;
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
        d9Var.f34392g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f24010q.x;
        a20 a20Var = this.f33947a;
        float min = Math.min(Math.max(this.f33959s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - a20Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        e9 e9Var = this.f33960w;
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
        bi.g3 g3Var = this.f33949b;
        float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + f10;
        a20 a20Var = this.f33947a;
        float measuredWidth2 = measuredWidth - (a20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((g3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (a20Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f33959s;
        float f11 = this.Q;
        float f12 = this.f33953d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (a20Var.getParent() != null) {
            this.f33957n.updateViewLayout(a20Var, this.f33959s);
        }
    }
}
