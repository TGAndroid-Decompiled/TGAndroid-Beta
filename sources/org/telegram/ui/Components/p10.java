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
public final class p10 implements org.telegram.messenger.ls {
    public static p10 f36736e0 = null;
    public static boolean f36737f0 = true;
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
    public final v10 V;
    public final ch0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final n10 f36738a;
    public AnimatorSet f36739a0;
    public final bi.e5 f36740b;
    public final fi.p5 f36742c;
    public final FrameLayout d;
    public ValueAnimator f36744d0;
    public final org.telegram.ui.w7 f36745e;
    public final t10 f36746f;
    public final int h;
    public WindowManager f36747n;
    public boolean f36748r;
    public WindowManager.LayoutParams f36749s;
    public final z8 f36750w;
    public final zg0 f36751x;
    public boolean f36752y;
    public float F = 0.0f;
    public final int[] H = new int[2];
    public final float[] I = new float[2];
    public float L = -1.0f;
    public float M = -1.0f;
    public final k10 T = new k10(this, 0);
    public final k10 U = new k10(this, 1);
    public boolean f36741b0 = false;
    public float f36743c0 = 0.0f;

    public p10(final Context context, int i7) {
        this.h = i7;
        n10 n10Var = new n10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f36738a = n10Var;
        n10Var.setAlpha(0.7f);
        v10 v10Var = new v10(context, i7);
        this.V = v10Var;
        n10Var.addView(v10Var, c8.ha.e(-1, -1, 17));
        z8 z8Var = new z8(context, true);
        this.f36750w = z8Var;
        z8Var.setStyle(5);
        z8Var.setCentered(true);
        z8Var.setVisibility(8);
        z8Var.setDelegate(new gp(this, 18));
        h(false);
        n10Var.addView(z8Var, c8.ha.e(108, 36, 49));
        bi.e5 e5Var = new bi.e5(20, context, this);
        this.f36740b = e5Var;
        fi.p5 p5Var = new fi.p5(this, context);
        this.f36742c = p5Var;
        e5Var.addView(p5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.W = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zg0 zg0Var = new zg0(2131624042, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f36751x = zg0Var;
        zg0Var.h = true;
        imageView.setAnimation(zg0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, c8.ha.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f36745e = w7Var;
        w7Var.setOnClickListener(new h0(this, 20));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f38172f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f38177x = true;
        linearLayout.setOrientation(1);
        linearLayout.f38178y = i7;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        l9 l9Var = new l9(context);
        linearLayout.f38171e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(l9Var, c8.ha.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
        frameLayout2.setOnClickListener(new h0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f38168a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, c8.ha.o(-1, -2), context);
        linearLayout.f38169b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, c8.ha.o(-1, -2));
        frameLayout2.addView(linearLayout2, c8.ha.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ha.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        linearLayout.f38170c = n2Var;
        n2Var.setTextSize(12);
        n2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t10 t10Var = linearLayout;
                        t10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
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
                        t10 t10Var = linearLayout;
                        t10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(context, 44.0f);
        n2Var3.setTextSize(12);
        n2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.hd.M0(2131743365, null), false, false);
        n2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t10 t10Var = linearLayout;
                        t10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(t10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.c40.w1(context3, new r10(context4, 0), Settings.canDrawOverlays(context4), false);
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
        this.f36746f = linearLayout;
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
        p10 p10Var = f36736e0;
        if (p10Var != null) {
            p10Var.f(false);
            p10 p10Var2 = f36736e0;
            WindowManager windowManager = p10Var2.f36747n;
            n10 n10Var = p10Var2.f36738a;
            n10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new i10(n10Var, p10Var2.f36740b, p10Var2.d, windowManager, p10Var2.f36745e)).start();
            f36736e0.e();
            f36736e0 = null;
            org.telegram.ui.Components.voip.e0.k();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.g1.i() && f36736e0 == null) {
            if (org.telegram.messenger.t0.F && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f36737f0) {
                if (org.telegram.messenger.t0.f25572y || !org.telegram.ui.c40.f44540v5) {
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
        p10 p10Var;
        org.telegram.ui.Components.voip.e0.m();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z9 = true;
        } else {
            z9 = false;
        }
        Context context2 = org.telegram.messenger.t0.f25563b;
        Typeface typeface = org.telegram.messenger.g0.f22516a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = org.telegram.messenger.g0.W(context);
        if (org.telegram.ui.Components.voip.g1.i() || (!canDrawOverlays ? !z9 || f36737f0 || W == null || org.telegram.messenger.t0.f25572y || org.telegram.ui.c40.f44540v5 || org.telegram.messenger.g0.H1(W) || ((e0Var = org.telegram.ui.Components.voip.e0.f39130e) != null && e0Var.f39132b != null) : !z9 || f36737f0 || (!org.telegram.messenger.t0.f25572y && org.telegram.ui.c40.f44540v5))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (p10Var = f36736e0) != null && p10Var.f36748r != canDrawOverlays) {
            c();
        }
        if (z10) {
            int account = sharedInstance.getAccount();
            if (f36736e0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(org.telegram.messenger.t0.f25563b);
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    p10 p10Var2 = new p10(context, account);
                    f36736e0 = p10Var2;
                    p10Var2.f36748r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) org.telegram.messenger.t0.f25563b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f36736e0.f36747n = windowManager;
                    WindowManager.LayoutParams b10 = b(context);
                    b10.width = -1;
                    b10.height = -1;
                    b10.dimAmount = 0.25f;
                    b10.flags = 522;
                    windowManager.addView(f36736e0.f36745e, b10);
                    f36736e0.f36745e.setVisibility(8);
                    WindowManager.LayoutParams b11 = b(context);
                    b11.gravity = 81;
                    b11.width = org.telegram.messenger.g0.L(100.0f);
                    b11.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f36736e0.f36740b, b11);
                    WindowManager.LayoutParams b12 = b(context);
                    p10 p10Var3 = f36736e0;
                    p10Var3.f36749s = b12;
                    windowManager.addView(p10Var3.f36738a, b12);
                    WindowManager.LayoutParams b13 = b(context);
                    b13.gravity = 81;
                    b13.width = org.telegram.messenger.g0.L(100.0f);
                    b13.height = org.telegram.messenger.g0.L(150.0f);
                    windowManager.addView(f36736e0.d, b13);
                    f36736e0.f36740b.setVisibility(8);
                    f36736e0.f36738a.setScaleX(0.5f);
                    f36736e0.f36738a.setScaleY(0.5f);
                    f36736e0.f36738a.setAlpha(0.0f);
                    f36736e0.f36738a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    org.telegram.messenger.qs.f(f36736e0.h).b(f36736e0, org.telegram.messenger.qs.f25090w2);
                    org.telegram.messenger.qs.e().b(f36736e0, org.telegram.messenger.qs.O4);
                    org.telegram.messenger.qs.e().b(f36736e0, org.telegram.messenger.qs.D2);
                    org.telegram.ui.Components.voip.e0.k();
                }
            }
            p10 p10Var4 = f36736e0;
            if (p10Var4 != null) {
                z8 z8Var = p10Var4.f36750w;
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
        p10 p10Var5 = f36736e0;
        if (p10Var5 != null && !p10Var5.f36748r) {
            p10Var5.f36738a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z9;
        if (!this.Y && !this.f36752y) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.Z != z9) {
            this.Z = z9;
            n10 n10Var = this.f36738a;
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
        if (i7 != org.telegram.messenger.qs.f25090w2 && i7 != org.telegram.messenger.qs.O4) {
            if (i7 == org.telegram.messenger.qs.D2) {
                k(org.telegram.messenger.t0.f25563b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        org.telegram.messenger.qs.f(this.h).n(this, org.telegram.messenger.qs.f25090w2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.F2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
    }

    public final void f(boolean z9) {
        if (z9 != this.f36752y) {
            this.f36752y = z9;
            org.telegram.ui.w7 w7Var = this.f36745e;
            w7Var.animate().setListener(null).cancel();
            boolean z10 = this.f36752y;
            t10 t10Var = this.f36746f;
            if (z10) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    t10Var.setScaleX(0.7f);
                    t10Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                t10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                t10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new j10(this, 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            AnimatorSet animatorSet = this.f36739a0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f36739a0.cancel();
            }
            fi.p5 p5Var = this.f36742c;
            if (z9) {
                bi.e5 e5Var = this.f36740b;
                if (e5Var.getVisibility() != 0) {
                    e5Var.setVisibility(0);
                    p5Var.setAlpha(0.0f);
                    p5Var.setScaleX(0.5f);
                    p5Var.setScaleY(0.5f);
                    this.f36751x.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f36739a0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(p5Var, View.ALPHA, p5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_X, p5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_Y, p5Var.getScaleY(), 1.0f));
                this.f36739a0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f36739a0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p5Var, View.ALPHA, p5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(p5Var, View.SCALE_X, p5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(p5Var, View.SCALE_Y, p5Var.getScaleY(), 0.5f));
            this.f36739a0.addListener(new j10(this, 0));
            this.f36739a0.setDuration(150L);
            this.f36739a0.start();
        }
    }

    public final void h(boolean z9) {
        org.telegram.messenger.r3 r3Var;
        z8 z8Var = this.f36750w;
        y8 y8Var = z8Var.f40906a;
        if (y8Var.f40580f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                r3Var = sharedInstance.groupCall;
            } else {
                r3Var = null;
            }
            int i7 = 0;
            int i10 = this.h;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f25211e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i7 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.ij.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
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
        y8Var.f40581g = true;
    }

    public final void i() {
        int i7 = org.telegram.messenger.g0.f22544q.x;
        n10 n10Var = this.f36738a;
        float min = Math.min(Math.max(this.f36749s.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i7 - n10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        z8 z8Var = this.f36750w;
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
        bi.e5 e5Var = this.f36740b;
        float measuredWidth = (e5Var.getMeasuredWidth() / 2.0f) + f10;
        n10 n10Var = this.f36738a;
        float measuredWidth2 = measuredWidth - (n10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((e5Var.getMeasuredHeight() / 2.0f) + (this.N - this.S)) - (n10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f36749s;
        float f11 = this.P;
        float f12 = this.f36743c0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.Q));
        i();
        if (n10Var.getParent() != null) {
            this.f36747n.updateViewLayout(n10Var, this.f36749s);
        }
    }
}
