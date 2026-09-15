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
public final class z20 implements NotificationCenter.NotificationCenterDelegate {
    public static z20 f30454d0 = null;
    public static boolean f30455e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final f30 U;
    public final aj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final x20 f30456a;
    public final ai.f0 f30458b;
    public final ci.s6 f30460c;
    public ValueAnimator f30461c0;
    public final FrameLayout d;
    public final org.telegram.ui.u7 e;
    public final d30 f30462f;
    public final int h;
    public WindowManager f30463n;
    public WindowManager.LayoutParams f30464r;
    public final i9 f30465s;
    public final xi0 v;
    public boolean f30466w;
    public boolean f30467x;
    public boolean f30468y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final v20 S = new v20(this, 0);
    public final v20 T = new v20(this, 1);
    public boolean f30457a0 = false;
    public float f30459b0 = 0.0f;

    public z20(final Context context, int i10) {
        this.h = i10;
        x20 x20Var = new x20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f30456a = x20Var;
        x20Var.setAlpha(0.7f);
        f30 f30Var = new f30(i10, context, false);
        this.U = f30Var;
        x20Var.addView(f30Var, w7.x5.e(-1, -1, 17));
        i9 i9Var = new i9(context, true);
        this.f30465s = i9Var;
        i9Var.setStyle(5);
        i9Var.setCentered(true);
        i9Var.setVisibility(8);
        i9Var.setDelegate(new xp(this, 19));
        g(false);
        x20Var.addView(i9Var, w7.x5.e(108, 36, 49));
        ai.f0 f0Var = new ai.f0(this, context, 15);
        this.f30458b = f0Var;
        ci.s6 s6Var = new ci.s6(this, context);
        this.f30460c = s6Var;
        f0Var.addView(s6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        xi0 xi0Var = new xi0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        imageView.setAnimation(xi0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.x5.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, 2);
        this.e = u7Var;
        u7Var.setOnClickListener(new f0(this, 21));
        u7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f23202f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f23206w = true;
        linearLayout.setOrientation(1);
        linearLayout.f23207x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        u9 u9Var = new u9(context);
        linearLayout.e = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(u9Var, w7.x5.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f23199a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView, w7.x5.n(-1, -2), context);
        linearLayout.f23200b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(h, w7.x5.n(-1, -2));
        frameLayout2.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.x5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        linearLayout.f23201c = v2Var;
        v2Var.setTextSize(12);
        v2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        d30 d30Var = linearLayout;
                        d30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = d30Var.d.h;
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
                        d30.b(linearLayout, context);
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
                        d30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        d30 d30Var = linearLayout;
                        d30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = d30Var.d.h;
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
                        d30.b(linearLayout, context);
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
                        d30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        d30 d30Var = linearLayout;
                        d30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = d30Var.d.h;
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
                        d30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(context);
        r1Var.setChildSize(68);
        r1Var.setUseStartPadding(false);
        r1Var.addView(v2Var, w7.x5.c(63.0f, 68));
        r1Var.addView(v2Var2, w7.x5.c(63.0f, 68));
        r1Var.addView(v2Var3, w7.x5.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(r1Var, w7.x5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f30462f = linearLayout;
        u7Var.addView((View) linearLayout, w7.x5.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.j1.f29005d0.V && f30454d0 == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f30455e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.i60.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f30455e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.i60.E3)) {
            int account = sharedInstance.getAccount();
            if (f30454d0 == null) {
                f30454d0 = new z20(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f30454d0.f30463n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f30454d0.e, b10);
                f30454d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f30454d0.f30458b, b11);
                WindowManager.LayoutParams b12 = b(context);
                z20 z20Var = f30454d0;
                z20Var.f30464r = b12;
                windowManager.addView(z20Var.f30456a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f30454d0.d, b13);
                f30454d0.f30458b.setVisibility(8);
                f30454d0.f30456a.setScaleX(0.5f);
                f30454d0.f30456a.setScaleY(0.5f);
                f30454d0.f30456a.setAlpha(0.0f);
                f30454d0.f30456a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f30454d0.h).addObserver(f30454d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f30454d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f30454d0, NotificationCenter.didEndCall);
            }
            i9 i9Var = f30454d0.f30465s;
            if (i9Var.getTag() == null) {
                i9Var.animate().setListener(null).cancel();
                if (i9Var.getVisibility() != 0) {
                    i9Var.setVisibility(0);
                    i9Var.setAlpha(0.0f);
                    i9Var.setScaleX(0.5f);
                    i9Var.setScaleY(0.5f);
                }
                i9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                i9Var.setTag(1);
                return;
            }
            return;
        }
        z20 z20Var2 = f30454d0;
        if (z20Var2 != null) {
            z20Var2.e(false);
            z20 z20Var3 = f30454d0;
            WindowManager windowManager2 = z20Var3.f30463n;
            x20 x20Var = z20Var3.f30456a;
            x20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new t20(x20Var, z20Var3.f30458b, z20Var3.d, windowManager2, z20Var3.e)).start();
            f30454d0.d();
            f30454d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f30466w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            x20 x20Var = this.f30456a;
            if (z10) {
                x20Var.animate().alpha(1.0f).start();
            } else {
                x20Var.animate().alpha(0.7f).start();
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
        if (z10 != this.f30466w) {
            this.f30466w = z10;
            org.telegram.ui.u7 u7Var = this.e;
            u7Var.animate().setListener(null).cancel();
            boolean z11 = this.f30466w;
            d30 d30Var = this.f30462f;
            if (z11) {
                if (u7Var.getVisibility() != 0) {
                    u7Var.setVisibility(0);
                    u7Var.setAlpha(0.0f);
                    d30Var.setScaleX(0.7f);
                    d30Var.setScaleY(0.7f);
                }
                u7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 2));
                u7Var.animate().alpha(1.0f).setDuration(150L).start();
                d30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                d30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                u7Var.animate().alpha(0.0f).setDuration(150L).setListener(new u20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f30467x != z10) {
            this.f30467x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            ci.s6 s6Var = this.f30460c;
            if (z10) {
                ai.f0 f0Var = this.f30458b;
                if (f0Var.getVisibility() != 0) {
                    f0Var.setVisibility(0);
                    s6Var.setAlpha(0.0f);
                    s6Var.setScaleX(0.5f);
                    s6Var.setScaleY(0.5f);
                    this.v.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s6Var, View.ALPHA, s6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s6Var, View.SCALE_X, s6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s6Var, View.SCALE_Y, s6Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s6Var, View.ALPHA, s6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s6Var, View.SCALE_X, s6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s6Var, View.SCALE_Y, s6Var.getScaleY(), 0.5f));
            this.Z.addListener(new u20(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        i9 i9Var = this.f30465s;
        h9 h9Var = i9Var.f24966a;
        if (h9Var.f24618f == null) {
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
                            i9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        i9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                i9Var.b(2, null, i11);
                i9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                i9Var.b(i10, null, i11);
                i10++;
            }
            i9Var.a(z10);
            return;
        }
        h9Var.f24619g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        x20 x20Var = this.f30456a;
        float min = Math.min(Math.max(this.f30464r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - x20Var.getMeasuredWidth()));
        i9 i9Var = this.f30465s;
        if (min < 0.0f) {
            i9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - x20Var.getMeasuredWidth()) {
            i9Var.setTranslationX((-Math.abs(min - (i10 - x20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            i9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ai.f0 f0Var = this.f30458b;
        float measuredWidth = (f0Var.getMeasuredWidth() / 2.0f) + f7;
        x20 x20Var = this.f30456a;
        float measuredWidth2 = measuredWidth - (x20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((f0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (x20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f30464r;
        float f10 = this.O;
        float f11 = this.f30459b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (x20Var.getParent() != null) {
            this.f30463n.updateViewLayout(x20Var, this.f30464r);
        }
    }
}
