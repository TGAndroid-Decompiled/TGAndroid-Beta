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
public final class g20 implements org.telegram.messenger.us {
    public static g20 f26224d0 = null;
    public static boolean f26225e0 = true;
    public boolean D;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final m20 U;
    public final ei0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final e20 f26226a;
    public final jg.l0 f26228b;
    public final kg.f0 f26230c;
    public ValueAnimator f26231c0;
    public final FrameLayout d;
    public final org.telegram.ui.w7 e;
    public final k20 f26232f;
    public final int h;
    public WindowManager f26233n;
    public WindowManager.LayoutParams f26234r;
    public final u8 f26235s;
    public final bi0 f26236w;
    public boolean f26237x;
    public boolean f26238y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final c20 S = new c20(this, 0);
    public final c20 T = new c20(this, 1);
    public boolean f26227a0 = false;
    public float f26229b0 = 0.0f;

    public g20(final Context context, int i10) {
        this.h = i10;
        e20 e20Var = new e20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f26226a = e20Var;
        e20Var.setAlpha(0.7f);
        m20 m20Var = new m20(i10, context, false);
        this.U = m20Var;
        e20Var.addView(m20Var, w7.b6.e(-1, -1, 17));
        u8 u8Var = new u8(context, true);
        this.f26235s = u8Var;
        u8Var.setStyle(5);
        u8Var.setCentered(true);
        u8Var.setVisibility(8);
        u8Var.setDelegate(new ho(this, 20));
        g(false);
        e20Var.addView(u8Var, w7.b6.e(108, 36, 49));
        jg.l0 l0Var = new jg.l0(this, context, 19);
        this.f26228b = l0Var;
        kg.f0 f0Var = new kg.f0(this, context);
        this.f26230c = f0Var;
        l0Var.addView(f0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        bi0 bi0Var = new bi0(2131624041, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f), true, null);
        this.f26236w = bi0Var;
        bi0Var.h = true;
        imageView.setAnimation(bi0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.b6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.e = w7Var;
        w7Var.setOnClickListener(new h0(this, 19));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f27615f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f27620x = true;
        linearLayout.setOrientation(1);
        linearLayout.f27621y = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        g9 g9Var = new g9(context);
        linearLayout.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
        frameLayout2.addView(g9Var, w7.b6.c(44.0f, 44));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        frameLayout2.setOnClickListener(new h0((Object) linearLayout, 20));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f27612a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView f7 = org.telegram.messenger.z20.f(linearLayout2, textView, w7.b6.o(-1, -2), context);
        linearLayout.f27613b = f7;
        f7.setTextSize(12.0f);
        f7.setTextColor(i0.b.o(-1, 153));
        linearLayout2.addView(f7, w7.b6.o(-1, -2));
        frameLayout2.addView(linearLayout2, w7.b6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.b6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.b2 b2Var = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        linearLayout.f27614c = b2Var;
        b2Var.setTextSize(12);
        b2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k20 k20Var = linearLayout;
                        k20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
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
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        b2Var.setCheckable(true);
        b2Var.a(i0.b.o(-1, 38), i0.b.o(-1, 76));
        org.telegram.ui.Components.voip.b2 b2Var2 = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        linearLayout.d = b2Var2;
        b2Var2.setTextSize(12);
        b2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k20 k20Var = linearLayout;
                        k20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
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
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.b2 b2Var3 = new org.telegram.ui.Components.voip.b2(context, 44.0f);
        b2Var3.setTextSize(12);
        b2Var3.c(2131230918, -1, -3257782, 0.3f, false, org.telegram.messenger.cd.L0(2131743390, null), false, false);
        b2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k20 k20Var = linearLayout;
                        k20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k20Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = linearLayout.d.h;
                                org.telegram.messenger.i0.E3(textViewArr[0]);
                                org.telegram.messenger.i0.E3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
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
                        org.telegram.ui.b50.v1(context3, new i20(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.y0 y0Var = new org.telegram.ui.Components.voip.y0(context);
        y0Var.setChildSize(68);
        y0Var.setUseStartPadding(false);
        y0Var.addView(b2Var, w7.b6.c(63.0f, 68));
        y0Var.addView(b2Var2, w7.b6.c(63.0f, 68));
        y0Var.addView(b2Var3, w7.b6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(y0Var, w7.b6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f26232f = linearLayout;
        w7Var.addView((View) linearLayout, w7.b6.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = org.telegram.messenger.i0.L(105.0f);
        layoutParams.width = org.telegram.messenger.i0.L(105.0f);
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
        if (!org.telegram.ui.Components.voip.s0.f31645d0.V && f26224d0 == null) {
            if (org.telegram.messenger.w0.F && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f26225e0) {
                if (org.telegram.messenger.w0.f19033y || !org.telegram.ui.b50.f35990v5) {
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
        Context context2 = org.telegram.messenger.w0.f19025b;
        Typeface typeface = org.telegram.messenger.i0.f15999a;
        if (Settings.canDrawOverlays(context2) && z10 && !f26225e0 && (org.telegram.messenger.w0.f19033y || !org.telegram.ui.b50.f35990v5)) {
            int account = sharedInstance.getAccount();
            if (f26224d0 == null) {
                f26224d0 = new g20(context, account);
                WindowManager windowManager = (WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window");
                f26224d0.f26233n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f26224d0.e, b10);
                f26224d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = org.telegram.messenger.i0.L(100.0f);
                b11.height = org.telegram.messenger.i0.L(150.0f);
                windowManager.addView(f26224d0.f26228b, b11);
                WindowManager.LayoutParams b12 = b(context);
                g20 g20Var = f26224d0;
                g20Var.f26234r = b12;
                windowManager.addView(g20Var.f26226a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = org.telegram.messenger.i0.L(100.0f);
                b13.height = org.telegram.messenger.i0.L(150.0f);
                windowManager.addView(f26224d0.d, b13);
                f26224d0.f26228b.setVisibility(8);
                f26224d0.f26226a.setScaleX(0.5f);
                f26224d0.f26226a.setScaleY(0.5f);
                f26224d0.f26226a.setAlpha(0.0f);
                f26224d0.f26226a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                org.telegram.messenger.zs.f(f26224d0.h).b(f26224d0, org.telegram.messenger.zs.f19713w2);
                org.telegram.messenger.zs.e().b(f26224d0, org.telegram.messenger.zs.O4);
                org.telegram.messenger.zs.e().b(f26224d0, org.telegram.messenger.zs.D2);
            }
            u8 u8Var = f26224d0.f26235s;
            if (u8Var.getTag() == null) {
                u8Var.animate().setListener(null).cancel();
                if (u8Var.getVisibility() != 0) {
                    u8Var.setVisibility(0);
                    u8Var.setAlpha(0.0f);
                    u8Var.setScaleX(0.5f);
                    u8Var.setScaleY(0.5f);
                }
                u8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                u8Var.setTag(1);
                return;
            }
            return;
        }
        g20 g20Var2 = f26224d0;
        if (g20Var2 != null) {
            g20Var2.e(false);
            g20 g20Var3 = f26224d0;
            WindowManager windowManager2 = g20Var3.f26233n;
            e20 e20Var = g20Var3.f26226a;
            e20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new a20(e20Var, g20Var3.f26228b, g20Var3.d, windowManager2, g20Var3.e)).start();
            f26224d0.d();
            f26224d0 = null;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.F2, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f26237x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            e20 e20Var = this.f26226a;
            if (z10) {
                e20Var.animate().alpha(1.0f).start();
            } else {
                e20Var.animate().alpha(0.7f).start();
            }
            this.U.setPressedState(z10);
        }
    }

    public final void d() {
        org.telegram.messenger.zs.f(this.h).n(this, org.telegram.messenger.zs.f19713w2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.F2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.f19713w2 && i10 != org.telegram.messenger.zs.O4) {
            if (i10 == org.telegram.messenger.zs.D2) {
                j(org.telegram.messenger.w0.f19025b);
                return;
            }
            return;
        }
        g(true);
    }

    public final void e(boolean z10) {
        if (z10 != this.f26237x) {
            this.f26237x = z10;
            org.telegram.ui.w7 w7Var = this.e;
            w7Var.animate().setListener(null).cancel();
            boolean z11 = this.f26237x;
            k20 k20Var = this.f26232f;
            if (z11) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    k20Var.setScaleX(0.7f);
                    k20Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.l1(this, 3));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                k20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                k20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new b20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f26238y != z10) {
            this.f26238y = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            kg.f0 f0Var = this.f26230c;
            if (z10) {
                jg.l0 l0Var = this.f26228b;
                if (l0Var.getVisibility() != 0) {
                    l0Var.setVisibility(0);
                    f0Var.setAlpha(0.0f);
                    f0Var.setScaleX(0.5f);
                    f0Var.setScaleY(0.5f);
                    this.f26236w.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(f0Var, View.ALPHA, f0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(f0Var, View.SCALE_X, f0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(f0Var, View.SCALE_Y, f0Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(f0Var, View.ALPHA, f0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(f0Var, View.SCALE_X, f0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(f0Var, View.SCALE_Y, f0Var.getScaleY(), 0.5f));
            this.Z.addListener(new b20(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        org.telegram.messenger.u3 u3Var;
        u8 u8Var = this.f26235s;
        t8 t8Var = u8Var.f30863a;
        if (t8Var.f30482f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                u3Var = sharedInstance.groupCall;
            } else {
                u3Var = null;
            }
            int i10 = 0;
            int i11 = this.h;
            if (u3Var != null) {
                ArrayList arrayList = u3Var.e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i12 = 0;
                while (i10 < 2) {
                    if (i12 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i12);
                        if (org.telegram.messenger.jj.C1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            u8Var.b(i10, i11, groupCallParticipant);
                        }
                        i12++;
                    } else {
                        u8Var.b(i10, i11, null);
                    }
                    i10++;
                    i12++;
                }
                u8Var.b(2, i11, null);
                u8Var.a(z10);
                return;
            }
            while (i10 < 3) {
                u8Var.b(i10, i11, null);
                i10++;
            }
            u8Var.a(z10);
            return;
        }
        t8Var.f30483g = true;
    }

    public final void h() {
        int i10 = org.telegram.messenger.i0.f16026q.x;
        e20 e20Var = this.f26226a;
        float min = Math.min(Math.max(this.f26234r.x, -org.telegram.messenger.i0.L(36.0f)), org.telegram.messenger.i0.L(36.0f) + (i10 - e20Var.getMeasuredWidth()));
        int i11 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        u8 u8Var = this.f26235s;
        if (i11 < 0) {
            u8Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - e20Var.getMeasuredWidth()) {
            u8Var.setTranslationX((-Math.abs(min - (i10 - e20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            u8Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        jg.l0 l0Var = this.f26228b;
        float measuredWidth = (l0Var.getMeasuredWidth() / 2.0f) + f7;
        e20 e20Var = this.f26226a;
        float measuredWidth2 = measuredWidth - (e20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((l0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (e20Var.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.i0.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.f26234r;
        float f10 = this.O;
        float f11 = this.f26229b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (e20Var.getParent() != null) {
            this.f26233n.updateViewLayout(e20Var, this.f26234r);
        }
    }
}
