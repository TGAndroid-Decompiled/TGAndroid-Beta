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
public final class m30 implements NotificationCenter.NotificationCenterDelegate {
    public static m30 f26893d0 = null;
    public static boolean f26894e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final s30 U;
    public final bk0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final k30 f26895a;
    public final ah.x f26897b;
    public final di.p6 f26899c;
    public ValueAnimator f26900c0;
    public final FrameLayout d;
    public final org.telegram.ui.y7 e;
    public final q30 f26901f;
    public final int h;
    public WindowManager f26902n;
    public WindowManager.LayoutParams f26903r;
    public final n9 f26904s;
    public final yj0 v;
    public boolean f26905w;
    public boolean f26906x;
    public boolean f26907y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final i30 S = new i30(this, 0);
    public final i30 T = new i30(this, 1);
    public boolean f26896a0 = false;
    public float f26898b0 = 0.0f;

    public m30(final Context context, int i10) {
        this.h = i10;
        k30 k30Var = new k30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f26895a = k30Var;
        k30Var.setAlpha(0.7f);
        s30 s30Var = new s30(i10, context, false);
        this.U = s30Var;
        k30Var.addView(s30Var, w7.z5.e(-1, -1, 17));
        n9 n9Var = new n9(context, true);
        this.f26904s = n9Var;
        n9Var.setStyle(5);
        n9Var.setCentered(true);
        n9Var.setVisibility(8);
        n9Var.setDelegate(new kq(this, 19));
        g(false);
        k30Var.addView(n9Var, w7.z5.e(108, 36, 49));
        ah.x xVar = new ah.x(this, context, 16);
        this.f26897b = xVar;
        di.p6 p6Var = new di.p6(this, context);
        this.f26899c = p6Var;
        xVar.addView(p6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yj0 yj0Var = new yj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = yj0Var;
        yj0Var.h = true;
        imageView.setAnimation(yj0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 25.0f, 40, 17));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, context, 2);
        this.e = y7Var;
        y7Var.setOnClickListener(new f0(this, 20));
        y7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f28177f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f28181w = true;
        linearLayout.setOrientation(1);
        linearLayout.f28182x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        z9 z9Var = new z9(context);
        linearLayout.e = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(z9Var, w7.z5.d(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f28174a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, textView, w7.z5.n(-1, -2), context);
        linearLayout.f28175b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(i11, w7.z5.n(-1, -2));
        frameLayout2.addView(linearLayout2, w7.z5.a(-2.0f, 55.0f, 0.0f, 0.0f, 0.0f, -1, 16));
        linearLayout.addView(frameLayout2, w7.z5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        linearLayout.f28176c = u2Var;
        u2Var.setTextSize(12);
        u2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q30 q30Var = linearLayout;
                        q30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(q30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        q30 q30Var2 = linearLayout;
                        q30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = q30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
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
                        org.telegram.ui.n60.u1(context3, new o30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        u2Var.setCheckable(true);
        u2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        linearLayout.d = u2Var2;
        u2Var2.setTextSize(12);
        u2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q30 q30Var = linearLayout;
                        q30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(q30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        q30 q30Var2 = linearLayout;
                        q30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = q30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
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
                        org.telegram.ui.n60.u1(context3, new o30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        u2Var3.setTextSize(12);
        u2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        u2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q30 q30Var = linearLayout;
                        q30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(q30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        q30 q30Var2 = linearLayout;
                        q30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = q30Var2.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
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
                        org.telegram.ui.n60.u1(context3, new o30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(context);
        p1Var.setChildSize(68);
        p1Var.setUseStartPadding(false);
        p1Var.addView(u2Var, w7.z5.d(63.0f, 68));
        p1Var.addView(u2Var2, w7.z5.d(63.0f, 68));
        p1Var.addView(u2Var3, w7.z5.d(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(p1Var, w7.z5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f26901f = linearLayout;
        y7Var.addView((View) linearLayout, w7.z5.d(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.h1.f29878d0.V && f26893d0 == null) {
            if (ApplicationLoader.canDrawOverlays && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f26894e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.n60.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f26894e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.n60.E3)) {
            int account = sharedInstance.getAccount();
            if (f26893d0 == null) {
                f26893d0 = new m30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f26893d0.f26902n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f26893d0.e, b10);
                f26893d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f26893d0.f26897b, b11);
                WindowManager.LayoutParams b12 = b(context);
                m30 m30Var = f26893d0;
                m30Var.f26903r = b12;
                windowManager.addView(m30Var.f26895a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f26893d0.d, b13);
                f26893d0.f26897b.setVisibility(8);
                f26893d0.f26895a.setScaleX(0.5f);
                f26893d0.f26895a.setScaleY(0.5f);
                f26893d0.f26895a.setAlpha(0.0f);
                f26893d0.f26895a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f26893d0.h).addObserver(f26893d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f26893d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f26893d0, NotificationCenter.didEndCall);
            }
            n9 n9Var = f26893d0.f26904s;
            if (n9Var.getTag() == null) {
                n9Var.animate().setListener(null).cancel();
                if (n9Var.getVisibility() != 0) {
                    n9Var.setVisibility(0);
                    n9Var.setAlpha(0.0f);
                    n9Var.setScaleX(0.5f);
                    n9Var.setScaleY(0.5f);
                }
                n9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                n9Var.setTag(1);
                return;
            }
            return;
        }
        m30 m30Var2 = f26893d0;
        if (m30Var2 != null) {
            m30Var2.e(false);
            m30 m30Var3 = f26893d0;
            WindowManager windowManager2 = m30Var3.f26902n;
            k30 k30Var = m30Var3.f26895a;
            k30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new g30(k30Var, m30Var3.f26897b, m30Var3.d, windowManager2, m30Var3.e)).start();
            f26893d0.d();
            f26893d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f26905w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            k30 k30Var = this.f26895a;
            if (z10) {
                k30Var.animate().alpha(1.0f).start();
            } else {
                k30Var.animate().alpha(0.7f).start();
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
        if (z10 != this.f26905w) {
            this.f26905w = z10;
            org.telegram.ui.y7 y7Var = this.e;
            y7Var.animate().setListener(null).cancel();
            boolean z11 = this.f26905w;
            q30 q30Var = this.f26901f;
            if (z11) {
                if (y7Var.getVisibility() != 0) {
                    y7Var.setVisibility(0);
                    y7Var.setAlpha(0.0f);
                    q30Var.setScaleX(0.7f);
                    q30Var.setScaleY(0.7f);
                }
                y7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 2));
                y7Var.animate().alpha(1.0f).setDuration(150L).start();
                q30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                q30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                y7Var.animate().alpha(0.0f).setDuration(150L).setListener(new h30(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f26906x != z10) {
            this.f26906x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            di.p6 p6Var = this.f26899c;
            if (z10) {
                ah.x xVar = this.f26897b;
                if (xVar.getVisibility() != 0) {
                    xVar.setVisibility(0);
                    p6Var.setAlpha(0.0f);
                    p6Var.setScaleX(0.5f);
                    p6Var.setScaleY(0.5f);
                    this.v.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(p6Var, View.ALPHA, p6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(p6Var, View.SCALE_X, p6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(p6Var, View.SCALE_Y, p6Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p6Var, View.ALPHA, p6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(p6Var, View.SCALE_X, p6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(p6Var, View.SCALE_Y, p6Var.getScaleY(), 0.5f));
            this.Z.addListener(new h30(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        n9 n9Var = this.f26904s;
        m9 m9Var = n9Var.f27318a;
        if (m9Var.f27011f == null) {
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
                            n9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        n9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                n9Var.b(2, null, i11);
                n9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                n9Var.b(i10, null, i11);
                i10++;
            }
            n9Var.a(z10);
            return;
        }
        m9Var.f27012g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        k30 k30Var = this.f26895a;
        float min = Math.min(Math.max(this.f26903r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - k30Var.getMeasuredWidth()));
        int i11 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        n9 n9Var = this.f26904s;
        if (i11 < 0) {
            n9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - k30Var.getMeasuredWidth()) {
            n9Var.setTranslationX((-Math.abs(min - (i10 - k30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            n9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ah.x xVar = this.f26897b;
        float measuredWidth = (xVar.getMeasuredWidth() / 2.0f) + f7;
        k30 k30Var = this.f26895a;
        float measuredWidth2 = measuredWidth - (k30Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((xVar.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (k30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f26903r;
        float f10 = this.O;
        float f11 = this.f26898b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (k30Var.getParent() != null) {
            this.f26902n.updateViewLayout(k30Var, this.f26903r);
        }
    }
}
