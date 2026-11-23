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
public final class a20 implements org.telegram.messenger.fs {
    public static a20 f33323f0 = null;
    public static boolean f33324g0 = true;
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
    public final g20 W;
    public final qh0 X;
    public boolean Y;
    public boolean Z;
    public final y10 f33325a;
    public boolean f33326a0;
    public final bi.g3 f33327b;
    public AnimatorSet f33328b0;
    public final hi.w5 f33329c;
    public final FrameLayout d;
    public final org.telegram.ui.x7 f33332e;
    public ValueAnimator f33333e0;
    public final e20 f33334f;
    public final int h;
    public WindowManager f33335n;
    public boolean f33336r;
    public WindowManager.LayoutParams f33337s;
    public final d9 f33338w;
    public final nh0 f33339x;
    public boolean f33340y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final w10 U = new w10(this, 0);
    public final w10 V = new w10(this, 1);
    public boolean f33330c0 = false;
    public float f33331d0 = 0.0f;

    public a20(final Context context, int i7) {
        this.h = i7;
        y10 y10Var = new y10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f33325a = y10Var;
        y10Var.setAlpha(0.7f);
        g20 g20Var = new g20(context, i7);
        this.W = g20Var;
        y10Var.addView(g20Var, c8.na.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.f33338w = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new lo(this, 20));
        h(false);
        y10Var.addView(d9Var, c8.na.e(108, 36, 49));
        bi.g3 g3Var = new bi.g3(21, context, this);
        this.f33327b = g3Var;
        hi.w5 w5Var = new hi.w5(this, context);
        this.f33329c = w5Var;
        g3Var.addView(w5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        nh0 nh0Var = new nh0(2131624043, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f33339x = nh0Var;
        nh0Var.h = true;
        imageView.setAnimation(nh0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.na.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, 2);
        this.f33332e = x7Var;
        x7Var.setOnClickListener(new n0(this, 22));
        x7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f34545f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f34550x = true;
        linearLayout.setOrientation(1);
        linearLayout.f34551y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        p9 p9Var = new p9(context);
        linearLayout.f34544e = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(p9Var, c8.na.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new n0((Object) linearLayout, 23));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f34541a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.m10.f(linearLayout2, textView, c8.na.o(-1, -2), context);
        linearLayout.f34542b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.na.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.na.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.na.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        linearLayout.f34543c = r2Var;
        r2Var.setTextSize(12);
        r2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e20 e20Var = linearLayout;
                        e20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
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
                        e20 e20Var = linearLayout;
                        e20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r2 r2Var3 = new org.telegram.ui.Components.voip.r2(context, 44.0f);
        r2Var3.setTextSize(12);
        r2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.gd.N0(2131743114, null), false, false);
        r2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e20 e20Var = linearLayout;
                        e20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e20Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.e40.x1(context3, new c20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(context);
        n1Var.setChildSize(68);
        n1Var.setUseStartPadding(false);
        n1Var.addView(r2Var, c8.na.c(63.0f, 68));
        n1Var.addView(r2Var2, c8.na.c(63.0f, 68));
        n1Var.addView(r2Var3, c8.na.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(n1Var, c8.na.t(-1, -2, 0, 6, 0, 6, 0));
        this.f33334f = linearLayout;
        x7Var.addView((View) linearLayout, c8.na.c(-2.0f, -2));
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
        a20 a20Var = f33323f0;
        if (a20Var != null) {
            a20Var.f(false);
            a20 a20Var2 = f33323f0;
            WindowManager windowManager = a20Var2.f33335n;
            y10 y10Var = a20Var2.f33325a;
            y10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new u10(y10Var, a20Var2.f33327b, a20Var2.d, windowManager, a20Var2.f33332e)).start();
            f33323f0.e();
            f33323f0 = null;
            org.telegram.ui.Components.voip.f0.g();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.k1.e() && f33323f0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f33324g0) {
                if (org.telegram.messenger.t0.f27022y || !org.telegram.ui.e40.D5) {
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
        a20 a20Var;
        org.telegram.ui.Components.voip.f0.h();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context2 = org.telegram.messenger.t0.f27013b;
        Typeface typeface = org.telegram.messenger.g0.f24198a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.k1.e() || (!canDrawOverlays ? !z10 || f33324g0 || W == null || org.telegram.messenger.t0.f27022y || org.telegram.ui.e40.D5 || org.telegram.messenger.g0.H1(W) || ((f0Var = org.telegram.ui.Components.voip.f0.f40882e) != null && f0Var.f40884b != null) : !z10 || f33324g0 || (!org.telegram.messenger.t0.f27022y && org.telegram.ui.e40.D5))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (a20Var = f33323f0) != null && a20Var.f33336r != canDrawOverlays) {
            c();
        }
        if (z11) {
            int account = sharedInstance.getAccount();
            if (f33323f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f27013b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    a20 a20Var2 = new a20(context, account);
                    f33323f0 = a20Var2;
                    a20Var2.f33336r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f33323f0.f33335n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f33323f0.f33332e, b10);
                    f33323f0.f33332e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33323f0.f33327b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    a20 a20Var3 = f33323f0;
                    a20Var3.f33337s = b12;
                    windowManager.addView(a20Var3.f33325a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f33323f0.d, b13);
                    f33323f0.f33327b.setVisibility(8);
                    f33323f0.f33325a.setScaleX(0.5f);
                    f33323f0.f33325a.setScaleY(0.5f);
                    f33323f0.f33325a.setAlpha(0.0f);
                    f33323f0.f33325a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.ks.f(f33323f0.h).b(f33323f0, org.telegram.messenger.ks.f25312w2);
                    org.telegram.messenger.ks.e().b(f33323f0, org.telegram.messenger.ks.R4);
                    org.telegram.messenger.ks.e().b(f33323f0, org.telegram.messenger.ks.D2);
                    org.telegram.ui.Components.voip.f0.g();
                }
            }
            a20 a20Var4 = f33323f0;
            if (a20Var4 != null) {
                d9 d9Var = a20Var4.f33338w;
                if (d9Var.getTag() == null) {
                    d9Var.animate().setListener(null).cancel();
                    if (d9Var.getVisibility() != 0) {
                        d9Var.setVisibility(0);
                        d9Var.setAlpha(0.0f);
                        d9Var.setScaleX(0.5f);
                        d9Var.setScaleY(0.5f);
                    }
                    d9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    d9Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        a20 a20Var5 = f33323f0;
        if (a20Var5 != null && !a20Var5.f33336r) {
            a20Var5.f33325a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z10;
        if (!this.Z && !this.f33340y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f33326a0 != z10) {
            this.f33326a0 = z10;
            y10 y10Var = this.f33325a;
            if (z10) {
                y10Var.animate().alpha(1.0f).start();
            } else {
                y10Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.f25312w2 && i7 != org.telegram.messenger.ks.R4) {
            if (i7 == org.telegram.messenger.ks.D2) {
                k(org.telegram.messenger.t0.f27013b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.ks.f(this.h).n(this, org.telegram.messenger.ks.f25312w2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.F2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D2);
    }

    public final void f(boolean z10) {
        if (z10 != this.f33340y) {
            this.f33340y = z10;
            org.telegram.ui.x7 x7Var = this.f33332e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.f33340y;
            e20 e20Var = this.f33334f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    e20Var.setScaleX(0.7f);
                    e20Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                e20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                e20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new v10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            AnimatorSet animatorSet = this.f33328b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f33328b0.cancel();
            }
            hi.w5 w5Var = this.f33329c;
            if (z10) {
                bi.g3 g3Var = this.f33327b;
                if (g3Var.getVisibility() != 0) {
                    g3Var.setVisibility(0);
                    w5Var.setAlpha(0.0f);
                    w5Var.setScaleX(0.5f);
                    w5Var.setScaleY(0.5f);
                    this.f33339x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33328b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(w5Var, View.ALPHA, w5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(w5Var, View.SCALE_X, w5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(w5Var, View.SCALE_Y, w5Var.getScaleY(), 1.0f));
                this.f33328b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f33328b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(w5Var, View.ALPHA, w5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(w5Var, View.SCALE_X, w5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(w5Var, View.SCALE_Y, w5Var.getScaleY(), 0.5f));
            this.f33328b0.addListener(new v10(this, 0));
            this.f33328b0.setDuration(150L);
            this.f33328b0.start();
        }
    }

    public final void h(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        d9 d9Var = this.f33338w;
        c9 c9Var = d9Var.f34245a;
        if (c9Var.f33953f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                t3Var = sharedInstance.groupCall;
            } else {
                t3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (t3Var != null) {
                ArrayList arrayList = t3Var.f27036e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            d9Var.b(i7, i10, groupCallParticipant);
                        }
                        i11++;
                    } else {
                        d9Var.b(i7, i10, null);
                    }
                    i7++;
                    i11++;
                }
                d9Var.b(2, i10, null);
                d9Var.a(z10);
                return;
            }
            while (i7 < 3) {
                d9Var.b(i7, i10, null);
                i7++;
            }
            d9Var.a(z10);
            return;
        }
        c9Var.f33954g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f24226q.x;
        y10 y10Var = this.f33325a;
        float min = Math.min(Math.max(this.f33337s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - y10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        d9 d9Var = this.f33338w;
        if (i10 < 0) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i7 - y10Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i7 - y10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f10 = this.P - this.S;
        bi.g3 g3Var = this.f33327b;
        float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + f10;
        y10 y10Var = this.f33325a;
        float measuredWidth2 = measuredWidth - (y10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((g3Var.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (y10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f33337s;
        float f11 = this.Q;
        float f12 = this.f33331d0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.R));
        i();
        if (y10Var.getParent() != null) {
            this.f33335n.updateViewLayout(y10Var, this.f33337s);
        }
    }
}
