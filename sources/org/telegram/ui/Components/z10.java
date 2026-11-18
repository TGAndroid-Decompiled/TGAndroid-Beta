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
public final class z10 implements org.telegram.messenger.fs {
    public static z10 f42710f0 = null;
    public static boolean f42711g0 = true;
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
    public final f20 W;
    public final ph0 X;
    public boolean Y;
    public boolean Z;
    public final x10 f42712a;
    public boolean f42713a0;
    public final bi.a3 f42714b;
    public AnimatorSet f42715b0;
    public final hi.m5 f42716c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 f42719e;
    public ValueAnimator f42720e0;
    public final d20 f42721f;
    public final int h;
    public WindowManager f42722n;
    public boolean f42723r;
    public WindowManager.LayoutParams f42724s;
    public final e9 f42725w;
    public final mh0 f42726x;
    public boolean f42727y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final v10 U = new v10(this, 0);
    public final v10 V = new v10(this, 1);
    public boolean f42717c0 = false;
    public float f42718d0 = 0.0f;

    public z10(final Context context, int i7) {
        this.h = i7;
        x10 x10Var = new x10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f42712a = x10Var;
        x10Var.setAlpha(0.7f);
        f20 f20Var = new f20(context, i7);
        this.W = f20Var;
        x10Var.addView(f20Var, c8.ma.e(-1, -1, 17));
        e9 e9Var = new e9(context, true);
        this.f42725w = e9Var;
        e9Var.setStyle(5);
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        e9Var.setDelegate(new mo(this, 20));
        h(false);
        x10Var.addView(e9Var, c8.ma.e(108, 36, 49));
        bi.a3 a3Var = new bi.a3(21, context, this);
        this.f42714b = a3Var;
        hi.m5 m5Var = new hi.m5(this, context);
        this.f42716c = m5Var;
        a3Var.addView(m5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        mh0 mh0Var = new mh0(2131624043, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f42726x = mh0Var;
        mh0Var.h = true;
        imageView.setAnimation(mh0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.ma.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f42719e = w7Var;
        w7Var.setOnClickListener(new n0(this, 22));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f34260f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f34265x = true;
        linearLayout.setOrientation(1);
        linearLayout.f34266y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        q9 q9Var = new q9(context);
        linearLayout.f34259e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(q9Var, c8.ma.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new n0((Object) linearLayout, 23));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f34256a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.n10.f(linearLayout2, textView, c8.ma.o(-1, -2), context);
        linearLayout.f34257b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.ma.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.ma.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ma.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        linearLayout.f34258c = q2Var;
        q2Var.setTextSize(12);
        q2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d20 d20Var = linearLayout;
                        d20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.f40.x1(context3, new b20(context4, 0), Settings.canDrawOverlays(context4), false);
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
                        d20 d20Var = linearLayout;
                        d20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.f40.x1(context3, new b20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.q2 q2Var3 = new org.telegram.ui.Components.voip.q2(context, 44.0f);
        q2Var3.setTextSize(12);
        q2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.gd.M0(2131743127, null), false, false);
        q2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d20 d20Var = linearLayout;
                        d20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.f40.x1(context3, new b20(context4, 0), Settings.canDrawOverlays(context4), false);
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
        this.f42721f = linearLayout;
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
        z10 z10Var = f42710f0;
        if (z10Var != null) {
            z10Var.f(false);
            z10 z10Var2 = f42710f0;
            WindowManager windowManager = z10Var2.f42722n;
            x10 x10Var = z10Var2.f42712a;
            x10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new t10(x10Var, z10Var2.f42714b, z10Var2.d, windowManager, z10Var2.f42719e)).start();
            f42710f0.e();
            f42710f0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.j1.j() && f42710f0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f42711g0) {
                if (org.telegram.messenger.t0.f26922y || !org.telegram.ui.f40.D5) {
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
        z10 z10Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context2 = org.telegram.messenger.t0.f26913b;
        Typeface typeface = org.telegram.messenger.g0.f24090a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.j1.j() || (!canDrawOverlays ? !z10 || f42711g0 || W == null || org.telegram.messenger.t0.f26922y || org.telegram.ui.f40.D5 || org.telegram.messenger.g0.H1(W) || ((e0Var = org.telegram.ui.Components.voip.e0.f40850e) != null && e0Var.f40852b != null) : !z10 || f42711g0 || (!org.telegram.messenger.t0.f26922y && org.telegram.ui.f40.D5))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (z10Var = f42710f0) != null && z10Var.f42723r != canDrawOverlays) {
            c();
        }
        if (z11) {
            int account = sharedInstance.getAccount();
            if (f42710f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f26913b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    z10 z10Var2 = new z10(context, account);
                    f42710f0 = z10Var2;
                    z10Var2.f42723r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f26913b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f42710f0.f42722n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f42710f0.f42719e, b10);
                    f42710f0.f42719e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f42710f0.f42714b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    z10 z10Var3 = f42710f0;
                    z10Var3.f42724s = b12;
                    windowManager.addView(z10Var3.f42712a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f42710f0.d, b13);
                    f42710f0.f42714b.setVisibility(8);
                    f42710f0.f42712a.setScaleX(0.5f);
                    f42710f0.f42712a.setScaleY(0.5f);
                    f42710f0.f42712a.setAlpha(0.0f);
                    f42710f0.f42712a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.ks.f(f42710f0.h).b(f42710f0, org.telegram.messenger.ks.f25213w2);
                    org.telegram.messenger.ks.e().b(f42710f0, org.telegram.messenger.ks.R4);
                    org.telegram.messenger.ks.e().b(f42710f0, org.telegram.messenger.ks.D2);
                    org.telegram.ui.Components.voip.e0.k();
                }
            }
            z10 z10Var4 = f42710f0;
            if (z10Var4 != null) {
                e9 e9Var = z10Var4.f42725w;
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
        z10 z10Var5 = f42710f0;
        if (z10Var5 != null && !z10Var5.f42723r) {
            z10Var5.f42712a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z10;
        if (!this.Z && !this.f42727y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f42713a0 != z10) {
            this.f42713a0 = z10;
            x10 x10Var = this.f42712a;
            if (z10) {
                x10Var.animate().alpha(1.0f).start();
            } else {
                x10Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.f25213w2 && i7 != org.telegram.messenger.ks.R4) {
            if (i7 == org.telegram.messenger.ks.D2) {
                k(org.telegram.messenger.t0.f26913b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.ks.f(this.h).n(this, org.telegram.messenger.ks.f25213w2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.F2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.f42727y) {
            this.f42727y = z10;
            org.telegram.ui.w7 w7Var = this.f42719e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.f42727y;
            d20 d20Var = this.f42721f;
            if (z11) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    d20Var.setScaleX(0.7f);
                    d20Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                d20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                d20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new u10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            AnimatorSet animatorSet = this.f42715b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f42715b0.cancel();
            }
            hi.m5 m5Var = this.f42716c;
            if (z10) {
                bi.a3 a3Var = this.f42714b;
                if (a3Var.getVisibility() != 0) {
                    a3Var.setVisibility(0);
                    m5Var.setAlpha(0.0f);
                    m5Var.setScaleX(0.5f);
                    m5Var.setScaleY(0.5f);
                    this.f42726x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f42715b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(m5Var, View.ALPHA, m5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_X, m5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_Y, m5Var.getScaleY(), 1.0f));
                this.f42715b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f42715b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(m5Var, View.ALPHA, m5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(m5Var, View.SCALE_X, m5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(m5Var, View.SCALE_Y, m5Var.getScaleY(), 0.5f));
            this.f42715b0.addListener(new u10(this, 0));
            this.f42715b0.setDuration(150L);
            this.f42715b0.start();
        }
    }

    public final void h(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        e9 e9Var = this.f42725w;
        d9 d9Var = e9Var.f34650a;
        if (d9Var.f34307f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                t3Var = sharedInstance.groupCall;
            } else {
                t3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (t3Var != null) {
                ArrayList arrayList = t3Var.f26937e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
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
        d9Var.f34308g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f24118q.x;
        x10 x10Var = this.f42712a;
        float min = Math.min(Math.max(this.f42724s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - x10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        e9 e9Var = this.f42725w;
        if (i10 < 0) {
            e9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - x10Var.getMeasuredWidth()) {
            e9Var.setTranslationX((-Math.abs(min - (i7 - x10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            e9Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.a3 a3Var = this.f42714b;
        float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + f10;
        x10 x10Var = this.f42712a;
        float measuredWidth2 = measuredWidth - (x10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((a3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (x10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f42724s;
        float f11 = this.Q;
        float f12 = this.f42718d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (x10Var.getParent() != null) {
            this.f42722n.updateViewLayout(x10Var, this.f42724s);
        }
    }
}
