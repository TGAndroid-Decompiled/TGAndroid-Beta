package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class r30 implements NotificationCenter.NotificationCenterDelegate {
    public static r30 f30352d0 = null;
    public static boolean f30353e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final x30 U;
    public final gk0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final p30 f30354a;
    public final ai.f0 f30356b;
    public final ci.r6 f30358c;
    public ValueAnimator f30359c0;
    public final FrameLayout d;
    public final org.telegram.ui.t7 f30360e;
    public final v30 f30361f;
    public final int h;
    public WindowManager f30362n;
    public WindowManager.LayoutParams f30363r;
    public final m9 f30364s;
    public final dk0 v;
    public boolean f30365w;
    public boolean f30366x;
    public boolean f30367y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final n30 S = new n30(this, 0);
    public final n30 T = new n30(this, 1);
    public boolean f30355a0 = false;
    public float f30357b0 = 0.0f;

    public r30(final Context context, int i10) {
        this.h = i10;
        p30 p30Var = new p30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f30354a = p30Var;
        p30Var.setAlpha(0.7f);
        x30 x30Var = new x30(i10, context, false);
        this.U = x30Var;
        p30Var.addView(x30Var, w7.x5.e(-1, -1, 17));
        m9 m9Var = new m9(context, true);
        this.f30364s = m9Var;
        m9Var.setStyle(5);
        m9Var.setCentered(true);
        m9Var.setVisibility(8);
        m9Var.setDelegate(new nq(this, 19));
        g(false);
        p30Var.addView(m9Var, w7.x5.e(108, 36, 49));
        ai.f0 f0Var = new ai.f0(this, context, 15);
        this.f30356b = f0Var;
        ci.r6 r6Var = new ci.r6(this, context);
        this.f30358c = r6Var;
        f0Var.addView(r6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        dk0 dk0Var = new dk0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = dk0Var;
        dk0Var.h = true;
        imageView.setAnimation(dk0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 25.0f, 40, 17));
        org.telegram.ui.t7 t7Var = new org.telegram.ui.t7(this, context, 2);
        this.f30360e = t7Var;
        t7Var.setOnClickListener(new f0(this, 20));
        t7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f31720f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f31724w = true;
        linearLayout.setOrientation(1);
        linearLayout.f31725x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        y9 y9Var = new y9(context);
        linearLayout.f31719e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(y9Var, w7.x5.d(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f31716a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView, w7.x5.n(-1, -2), context);
        linearLayout.f31717b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(h, w7.x5.n(-1, -2));
        frameLayout2.addView(linearLayout2, w7.x5.a(-2.0f, 55.0f, 0.0f, 0.0f, 0.0f, -1, 16));
        linearLayout.addView(frameLayout2, w7.x5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        linearLayout.f31718c = v2Var;
        v2Var.setTextSize(12);
        v2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v30 v30Var = linearLayout;
                        v30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(v30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        v30 v30Var2 = linearLayout;
                        v30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = v30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
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
                        org.telegram.ui.g60.u1(context3, new t30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        v2Var.setCheckable(true);
        v2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.v2 v2Var2 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        linearLayout.d = v2Var2;
        v2Var2.setTextSize(12);
        v2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v30 v30Var = linearLayout;
                        v30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(v30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        v30 v30Var2 = linearLayout;
                        v30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = v30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
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
                        org.telegram.ui.g60.u1(context3, new t30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.v2 v2Var3 = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        v2Var3.setTextSize(12);
        v2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        v2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v30 v30Var = linearLayout;
                        v30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(v30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        v30 v30Var2 = linearLayout;
                        v30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = v30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
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
                        org.telegram.ui.g60.u1(context3, new t30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(context);
        r1Var.setChildSize(68);
        r1Var.setUseStartPadding(false);
        r1Var.addView(v2Var, w7.x5.d(63.0f, 68));
        r1Var.addView(v2Var2, w7.x5.d(63.0f, 68));
        r1Var.addView(v2Var3, w7.x5.d(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(r1Var, w7.x5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f30361f = linearLayout;
        t7Var.addView((View) linearLayout, w7.x5.d(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = AndroidUtilities.dp(105.0f);
        layoutParams.width = AndroidUtilities.dp(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (AndroidUtilities.checkInlinePermissions(context)) {
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
        if (!org.telegram.ui.Components.voip.j1.f32062d0.V && f30352d0 == null) {
            if (ApplicationLoader.canDrawOverlays && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f30353e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.g60.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f30353e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.g60.E3)) {
            int account = sharedInstance.getAccount();
            if (f30352d0 == null) {
                f30352d0 = new r30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f30352d0.f30362n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f30352d0.f30360e, b10);
                f30352d0.f30360e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f30352d0.f30356b, b11);
                WindowManager.LayoutParams b12 = b(context);
                r30 r30Var = f30352d0;
                r30Var.f30363r = b12;
                windowManager.addView(r30Var.f30354a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f30352d0.d, b13);
                f30352d0.f30356b.setVisibility(8);
                f30352d0.f30354a.setScaleX(0.5f);
                f30352d0.f30354a.setScaleY(0.5f);
                f30352d0.f30354a.setAlpha(0.0f);
                f30352d0.f30354a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f30352d0.h).addObserver(f30352d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f30352d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f30352d0, NotificationCenter.didEndCall);
            }
            m9 m9Var = f30352d0.f30364s;
            if (m9Var.getTag() == null) {
                m9Var.animate().setListener(null).cancel();
                if (m9Var.getVisibility() != 0) {
                    m9Var.setVisibility(0);
                    m9Var.setAlpha(0.0f);
                    m9Var.setScaleX(0.5f);
                    m9Var.setScaleY(0.5f);
                }
                m9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                m9Var.setTag(1);
                return;
            }
            return;
        }
        r30 r30Var2 = f30352d0;
        if (r30Var2 != null) {
            r30Var2.e(false);
            r30 r30Var3 = f30352d0;
            WindowManager windowManager2 = r30Var3.f30362n;
            p30 p30Var = r30Var3.f30354a;
            p30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new l30(p30Var, r30Var3.f30356b, r30Var3.d, windowManager2, r30Var3.f30360e)).start();
            f30352d0.d();
            f30352d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f30365w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            p30 p30Var = this.f30354a;
            if (z10) {
                p30Var.animate().alpha(1.0f).start();
            } else {
                p30Var.animate().alpha(0.7f).start();
            }
            this.U.setPressedState(z10);
        }
    }

    public final void d() {
        NotificationCenter.getInstance(this.h).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.didEndCall) {
                j(ApplicationLoader.applicationContext);
                return;
            }
            return;
        }
        g(true);
    }

    public final void e(boolean z10) {
        if (z10 != this.f30365w) {
            this.f30365w = z10;
            org.telegram.ui.t7 t7Var = this.f30360e;
            t7Var.animate().setListener(null).cancel();
            boolean z11 = this.f30365w;
            v30 v30Var = this.f30361f;
            if (z11) {
                if (t7Var.getVisibility() != 0) {
                    t7Var.setVisibility(0);
                    t7Var.setAlpha(0.0f);
                    v30Var.setScaleX(0.7f);
                    v30Var.setScaleY(0.7f);
                }
                t7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 2));
                t7Var.animate().alpha(1.0f).setDuration(150L).start();
                v30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                v30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                t7Var.animate().alpha(0.0f).setDuration(150L).setListener(new m30(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f30366x != z10) {
            this.f30366x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            ci.r6 r6Var = this.f30358c;
            if (z10) {
                ai.f0 f0Var = this.f30356b;
                if (f0Var.getVisibility() != 0) {
                    f0Var.setVisibility(0);
                    r6Var.setAlpha(0.0f);
                    r6Var.setScaleX(0.5f);
                    r6Var.setScaleY(0.5f);
                    this.v.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(r6Var, View.ALPHA, r6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(r6Var, View.SCALE_X, r6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(r6Var, View.SCALE_Y, r6Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(r6Var, View.ALPHA, r6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(r6Var, View.SCALE_X, r6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(r6Var, View.SCALE_Y, r6Var.getScaleY(), 0.5f));
            this.Z.addListener(new m30(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        m9 m9Var = this.f30364s;
        l9 l9Var = m9Var.f28724a;
        if (l9Var.f28253f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                call = sharedInstance.groupCall;
            } else {
                call = null;
            }
            int i10 = 0;
            int i11 = this.h;
            if (call != null) {
                long selfId = sharedInstance.getSelfId();
                int size = call.sortedParticipants.size();
                int i12 = 0;
                while (i10 < 2) {
                    if (i12 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i12);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            m9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        m9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                m9Var.b(2, null, i11);
                m9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                m9Var.b(i10, null, i11);
                i10++;
            }
            m9Var.a(z10);
            return;
        }
        l9Var.f28254g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        p30 p30Var = this.f30354a;
        float min = Math.min(Math.max(this.f30363r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - p30Var.getMeasuredWidth()));
        int i11 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        m9 m9Var = this.f30364s;
        if (i11 < 0) {
            m9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - p30Var.getMeasuredWidth()) {
            m9Var.setTranslationX((-Math.abs(min - (i10 - p30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            m9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ai.f0 f0Var = this.f30356b;
        float measuredWidth = (f0Var.getMeasuredWidth() / 2.0f) + f7;
        p30 p30Var = this.f30354a;
        float measuredWidth2 = measuredWidth - (p30Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((f0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (p30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f30363r;
        float f10 = this.O;
        float f11 = this.f30357b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (p30Var.getParent() != null) {
            this.f30362n.updateViewLayout(p30Var, this.f30363r);
        }
    }
}
