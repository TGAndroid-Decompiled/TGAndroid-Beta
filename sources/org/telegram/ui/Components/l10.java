package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
public final class l10 implements org.telegram.messenger.cs {
    public static l10 f35545e0 = null;
    public static boolean f35546f0 = true;
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
    public final r10 V;
    public final fh0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final j10 f35547a;
    public AnimatorSet f35548a0;
    public final ai.o2 f35549b;
    public final gi.n5 f35551c;
    public final FrameLayout d;
    public ValueAnimator f35553d0;
    public final org.telegram.ui.x7 f35554e;
    public final p10 f35555f;
    public final int h;
    public WindowManager f35556n;
    public WindowManager.LayoutParams f35557r;
    public final x8 f35558s;
    public final ch0 f35559w;
    public boolean f35560x;
    public boolean f35561y;
    public float F = 0.0f;
    public final int[] H = new int[2];
    public final float[] I = new float[2];
    public float L = -1.0f;
    public float M = -1.0f;
    public final h10 T = new h10(this, 0);
    public final h10 U = new h10(this, 1);
    public boolean f35550b0 = false;
    public float f35552c0 = 0.0f;

    public l10(final Context context, int i3) {
        this.h = i3;
        j10 j10Var = new j10(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f35547a = j10Var;
        j10Var.setAlpha(0.7f);
        r10 r10Var = new r10(i3, context, false);
        this.V = r10Var;
        j10Var.addView(r10Var, b8.mf.e(-1, -1, 17));
        x8 x8Var = new x8(context, true);
        this.f35558s = x8Var;
        x8Var.setStyle(5);
        x8Var.setCentered(true);
        x8Var.setVisibility(8);
        x8Var.setDelegate(new gp(this, 18));
        g(false);
        j10Var.addView(x8Var, b8.mf.e(108, 36, 49));
        ai.o2 o2Var = new ai.o2(22, context, this);
        this.f35549b = o2Var;
        gi.n5 n5Var = new gi.n5(this, context);
        this.f35551c = n5Var;
        o2Var.addView(n5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.W = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ch0 ch0Var = new ch0(2131624042, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f), true, null);
        this.f35559w = ch0Var;
        ch0Var.h = true;
        imageView.setAnimation(ch0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, b8.mf.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, context, 2);
        this.f35554e = x7Var;
        x7Var.setOnClickListener(new f0(this, 20));
        x7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f37022f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f37027x = true;
        linearLayout.setOrientation(1);
        linearLayout.f37028y = i3;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        k9 k9Var = new k9(context);
        linearLayout.f37021e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        frameLayout2.addView(k9Var, b8.mf.c(44.0f, 44));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o10 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f37018a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, b8.mf.o(-1, -2), context);
        linearLayout.f37019b = f10;
        f10.setTextSize(12.0f);
        f10.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(f10, b8.mf.o(-1, -2));
        frameLayout2.addView(linearLayout2, b8.mf.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, b8.mf.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.c2 c2Var = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        linearLayout.f37020c = c2Var;
        c2Var.setTextSize(12);
        c2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        p10 p10Var = linearLayout;
                        p10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        c2Var.setCheckable(true);
        c2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.c2 c2Var2 = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        linearLayout.d = c2Var2;
        c2Var2.setTextSize(12);
        c2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        p10 p10Var = linearLayout;
                        p10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.c2 c2Var3 = new org.telegram.ui.Components.voip.c2(context, 44.0f);
        c2Var3.setTextSize(12);
        c2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, false);
        c2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        p10 p10Var = linearLayout;
                        p10Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(p10Var.getContext(), Settings.canDrawOverlays(context));
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
                        org.telegram.ui.x30.v1(context3, new n10(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.y0 y0Var = new org.telegram.ui.Components.voip.y0(context);
        y0Var.setChildSize(68);
        y0Var.setUseStartPadding(false);
        y0Var.addView(c2Var, b8.mf.c(63.0f, 68));
        y0Var.addView(c2Var2, b8.mf.c(63.0f, 68));
        y0Var.addView(c2Var3, b8.mf.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(y0Var, b8.mf.t(-1, -2, 0, 6, 0, 6, 0));
        this.f35555f = linearLayout;
        x7Var.addView((View) linearLayout, b8.mf.c(-2.0f, -2));
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

    public static boolean c() {
        VoIPService sharedInstance;
        if (!org.telegram.ui.Components.voip.s0.f39589e0.W && f35545e0 == null) {
            if (org.telegram.messenger.t0.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f35546f0) {
                if (org.telegram.messenger.t0.f25466y || !org.telegram.ui.x30.f51712w5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void j(Context context) {
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context2 = org.telegram.messenger.t0.f25457b;
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        if (Settings.canDrawOverlays(context2) && z10 && !f35546f0 && (org.telegram.messenger.t0.f25466y || !org.telegram.ui.x30.f51712w5)) {
            int account = sharedInstance.getAccount();
            if (f35545e0 == null) {
                f35545e0 = new l10(context, account);
                WindowManager windowManager = (WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window");
                f35545e0.f35556n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f35545e0.f35554e, b10);
                f35545e0.f35554e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = org.telegram.messenger.g0.L(100.0f);
                b11.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(f35545e0.f35549b, b11);
                WindowManager.LayoutParams b12 = b(context);
                l10 l10Var = f35545e0;
                l10Var.f35557r = b12;
                windowManager.addView(l10Var.f35547a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = org.telegram.messenger.g0.L(100.0f);
                b13.height = org.telegram.messenger.g0.L(150.0f);
                windowManager.addView(f35545e0.d, b13);
                f35545e0.f35549b.setVisibility(8);
                f35545e0.f35547a.setScaleX(0.5f);
                f35545e0.f35547a.setScaleY(0.5f);
                f35545e0.f35547a.setAlpha(0.0f);
                f35545e0.f35547a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                org.telegram.messenger.hs.f(f35545e0.h).b(f35545e0, org.telegram.messenger.hs.f23328w2);
                org.telegram.messenger.hs.e().b(f35545e0, org.telegram.messenger.hs.O4);
                org.telegram.messenger.hs.e().b(f35545e0, org.telegram.messenger.hs.D2);
            }
            x8 x8Var = f35545e0.f35558s;
            if (x8Var.getTag() == null) {
                x8Var.animate().setListener(null).cancel();
                if (x8Var.getVisibility() != 0) {
                    x8Var.setVisibility(0);
                    x8Var.setAlpha(0.0f);
                    x8Var.setScaleX(0.5f);
                    x8Var.setScaleY(0.5f);
                }
                x8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                x8Var.setTag(1);
                return;
            }
            return;
        }
        l10 l10Var2 = f35545e0;
        if (l10Var2 != null) {
            l10Var2.e(false);
            l10 l10Var3 = f35545e0;
            WindowManager windowManager2 = l10Var3.f35556n;
            j10 j10Var = l10Var3.f35547a;
            j10Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new f10(j10Var, l10Var3.f35549b, l10Var3.d, windowManager2, l10Var3.f35554e)).start();
            f35545e0.d();
            f35545e0 = null;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.Y && !this.f35560x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Z != z10) {
            this.Z = z10;
            j10 j10Var = this.f35547a;
            if (z10) {
                j10Var.animate().alpha(1.0f).start();
            } else {
                j10Var.animate().alpha(0.7f).start();
            }
            this.V.setPressedState(z10);
        }
    }

    public final void d() {
        org.telegram.messenger.hs.f(this.h).n(this, org.telegram.messenger.hs.f23328w2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.F2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D2);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.f23328w2 && i3 != org.telegram.messenger.hs.O4) {
            if (i3 == org.telegram.messenger.hs.D2) {
                j(org.telegram.messenger.t0.f25457b);
                return;
            }
            return;
        }
        g(true);
    }

    public final void e(boolean z10) {
        if (z10 != this.f35560x) {
            this.f35560x = z10;
            org.telegram.ui.x7 x7Var = this.f35554e;
            x7Var.animate().setListener(null).cancel();
            boolean z11 = this.f35560x;
            p10 p10Var = this.f35555f;
            if (z11) {
                if (x7Var.getVisibility() != 0) {
                    x7Var.setVisibility(0);
                    x7Var.setAlpha(0.0f);
                    p10Var.setScaleX(0.7f);
                    p10Var.setScaleY(0.7f);
                }
                x7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 3));
                x7Var.animate().alpha(1.0f).setDuration(150L).start();
                p10Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                p10Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                x7Var.animate().alpha(0.0f).setDuration(150L).setListener(new g10(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f35561y != z10) {
            this.f35561y = z10;
            AnimatorSet animatorSet = this.f35548a0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f35548a0.cancel();
            }
            gi.n5 n5Var = this.f35551c;
            if (z10) {
                ai.o2 o2Var = this.f35549b;
                if (o2Var.getVisibility() != 0) {
                    o2Var.setVisibility(0);
                    n5Var.setAlpha(0.0f);
                    n5Var.setScaleX(0.5f);
                    n5Var.setScaleY(0.5f);
                    this.f35559w.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f35548a0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(n5Var, View.ALPHA, n5Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_X, n5Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, n5Var.getScaleY(), 1.0f));
                this.f35548a0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f35548a0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, View.ALPHA, n5Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(n5Var, View.SCALE_X, n5Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, n5Var.getScaleY(), 0.5f));
            this.f35548a0.addListener(new g10(this, 0));
            this.f35548a0.setDuration(150L);
            this.f35548a0.start();
        }
    }

    public final void g(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        x8 x8Var = this.f35558s;
        w8 w8Var = x8Var.f40266a;
        if (w8Var.f39951f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                r3Var = sharedInstance.groupCall;
            } else {
                r3Var = null;
            }
            int i3 = 0;
            int i10 = this.h;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f25051e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i11 = 0;
                while (i3 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                        if (org.telegram.messenger.zi.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            x8Var.b(i3, i10, groupCallParticipant);
                        }
                        i11++;
                    } else {
                        x8Var.b(i3, i10, null);
                    }
                    i3++;
                    i11++;
                }
                x8Var.b(2, i10, null);
                x8Var.a(z10);
                return;
            }
            while (i3 < 3) {
                x8Var.b(i3, i10, null);
                i3++;
            }
            x8Var.a(z10);
            return;
        }
        w8Var.f39952g = true;
    }

    public final void h() {
        int i3 = org.telegram.messenger.g0.f22608q.x;
        j10 j10Var = this.f35547a;
        float min = Math.min(Math.max(this.f35557r.x, -org.telegram.messenger.g0.L(36.0f)), org.telegram.messenger.g0.L(36.0f) + (i3 - j10Var.getMeasuredWidth()));
        int i10 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        x8 x8Var = this.f35558s;
        if (i10 < 0) {
            x8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i3 - j10Var.getMeasuredWidth()) {
            x8Var.setTranslationX((-Math.abs(min - (i3 - j10Var.getMeasuredWidth()))) / 3.0f);
        } else {
            x8Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.O - this.R;
        ai.o2 o2Var = this.f35549b;
        float measuredWidth = (o2Var.getMeasuredWidth() / 2.0f) + f10;
        j10 j10Var = this.f35547a;
        float measuredWidth2 = measuredWidth - (j10Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((o2Var.getMeasuredHeight() / 2.0f) + (this.N - this.S)) - (j10Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.g0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f35557r;
        float f11 = this.P;
        float f12 = this.f35552c0;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.Q));
        h();
        if (j10Var.getParent() != null) {
            this.f35556n.updateViewLayout(j10Var, this.f35557r);
        }
    }
}
