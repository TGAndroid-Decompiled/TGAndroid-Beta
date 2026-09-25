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
public final class a30 implements NotificationCenter.NotificationCenterDelegate {
    public static a30 f22571d0 = null;
    public static boolean f22572e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final g30 U;
    public final lj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final y20 f22573a;
    public final ai.f0 f22575b;
    public final ci.r6 f22577c;
    public ValueAnimator f22578c0;
    public final FrameLayout d;
    public final org.telegram.ui.u7 e;
    public final e30 f22579f;
    public final int h;
    public WindowManager f22580n;
    public WindowManager.LayoutParams f22581r;
    public final k9 f22582s;
    public final ij0 v;
    public boolean f22583w;
    public boolean f22584x;
    public boolean f22585y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final w20 S = new w20(this, 0);
    public final w20 T = new w20(this, 1);
    public boolean f22574a0 = false;
    public float f22576b0 = 0.0f;

    public a30(final Context context, int i10) {
        this.h = i10;
        y20 y20Var = new y20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f22573a = y20Var;
        y20Var.setAlpha(0.7f);
        g30 g30Var = new g30(i10, context, false);
        this.U = g30Var;
        y20Var.addView(g30Var, w7.y5.e(-1, -1, 17));
        k9 k9Var = new k9(context, true);
        this.f22582s = k9Var;
        k9Var.setStyle(5);
        k9Var.setCentered(true);
        k9Var.setVisibility(8);
        k9Var.setDelegate(new yp(this, 19));
        g(false);
        y20Var.addView(k9Var, w7.y5.e(108, 36, 49));
        ai.f0 f0Var = new ai.f0(this, context, 15);
        this.f22575b = f0Var;
        ci.r6 r6Var = new ci.r6(this, context);
        this.f22577c = r6Var;
        f0Var.addView(r6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ij0 ij0Var = new ij0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = ij0Var;
        ij0Var.h = true;
        imageView.setAnimation(ij0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.y5.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, 2);
        this.e = u7Var;
        u7Var.setOnClickListener(new f0(this, 21));
        u7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f23823f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f23827w = true;
        linearLayout.setOrientation(1);
        linearLayout.f23828x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w9 w9Var = new w9(context);
        linearLayout.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(w9Var, w7.y5.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f23820a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView, w7.y5.n(-1, -2), context);
        linearLayout.f23821b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(h, w7.y5.n(-1, -2));
        frameLayout2.addView(linearLayout2, w7.y5.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.y5.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        linearLayout.f23822c = w2Var;
        w2Var.setTextSize(12);
        w2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        e30 e30Var = linearLayout;
                        e30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = e30Var.d.h;
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
                        e30.b(linearLayout, context);
                        return;
                }
            }
        });
        w2Var.setCheckable(true);
        w2Var.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        linearLayout.d = w2Var2;
        w2Var2.setTextSize(12);
        w2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        e30 e30Var = linearLayout;
                        e30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = e30Var.d.h;
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
                        e30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        w2Var3.setTextSize(12);
        w2Var3.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        w2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        e30 e30Var = linearLayout;
                        e30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = e30Var.d.h;
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
                        e30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(context);
        s1Var.setChildSize(68);
        s1Var.setUseStartPadding(false);
        s1Var.addView(w2Var, w7.y5.c(63.0f, 68));
        s1Var.addView(w2Var2, w7.y5.c(63.0f, 68));
        s1Var.addView(w2Var3, w7.y5.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(s1Var, w7.y5.t(-1, -2, 0, 6, 0, 6, 0));
        this.f22579f = linearLayout;
        u7Var.addView((View) linearLayout, w7.y5.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.k1.f29421d0.V && f22571d0 == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f22572e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.d60.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f22572e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.d60.E3)) {
            int account = sharedInstance.getAccount();
            if (f22571d0 == null) {
                f22571d0 = new a30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f22571d0.f22580n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f22571d0.e, b10);
                f22571d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f22571d0.f22575b, b11);
                WindowManager.LayoutParams b12 = b(context);
                a30 a30Var = f22571d0;
                a30Var.f22581r = b12;
                windowManager.addView(a30Var.f22573a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f22571d0.d, b13);
                f22571d0.f22575b.setVisibility(8);
                f22571d0.f22573a.setScaleX(0.5f);
                f22571d0.f22573a.setScaleY(0.5f);
                f22571d0.f22573a.setAlpha(0.0f);
                f22571d0.f22573a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f22571d0.h).addObserver(f22571d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f22571d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f22571d0, NotificationCenter.didEndCall);
            }
            k9 k9Var = f22571d0.f22582s;
            if (k9Var.getTag() == null) {
                k9Var.animate().setListener(null).cancel();
                if (k9Var.getVisibility() != 0) {
                    k9Var.setVisibility(0);
                    k9Var.setAlpha(0.0f);
                    k9Var.setScaleX(0.5f);
                    k9Var.setScaleY(0.5f);
                }
                k9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                k9Var.setTag(1);
                return;
            }
            return;
        }
        a30 a30Var2 = f22571d0;
        if (a30Var2 != null) {
            a30Var2.e(false);
            a30 a30Var3 = f22571d0;
            WindowManager windowManager2 = a30Var3.f22580n;
            y20 y20Var = a30Var3.f22573a;
            y20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new u20(y20Var, a30Var3.f22575b, a30Var3.d, windowManager2, a30Var3.e)).start();
            f22571d0.d();
            f22571d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f22583w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            y20 y20Var = this.f22573a;
            if (z10) {
                y20Var.animate().alpha(1.0f).start();
            } else {
                y20Var.animate().alpha(0.7f).start();
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
        if (z10 != this.f22583w) {
            this.f22583w = z10;
            org.telegram.ui.u7 u7Var = this.e;
            u7Var.animate().setListener(null).cancel();
            boolean z11 = this.f22583w;
            e30 e30Var = this.f22579f;
            if (z11) {
                if (u7Var.getVisibility() != 0) {
                    u7Var.setVisibility(0);
                    u7Var.setAlpha(0.0f);
                    e30Var.setScaleX(0.7f);
                    e30Var.setScaleY(0.7f);
                }
                u7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 2));
                u7Var.animate().alpha(1.0f).setDuration(150L).start();
                e30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                e30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                u7Var.animate().alpha(0.0f).setDuration(150L).setListener(new v20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f22584x != z10) {
            this.f22584x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            ci.r6 r6Var = this.f22577c;
            if (z10) {
                ai.f0 f0Var = this.f22575b;
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
            this.Z.addListener(new v20(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        k9 k9Var = this.f22582s;
        j9 j9Var = k9Var.f25711a;
        if (j9Var.f25342f == null) {
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
                            k9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        k9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                k9Var.b(2, null, i11);
                k9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                k9Var.b(i10, null, i11);
                i10++;
            }
            k9Var.a(z10);
            return;
        }
        j9Var.f25343g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        y20 y20Var = this.f22573a;
        float min = Math.min(Math.max(this.f22581r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - y20Var.getMeasuredWidth()));
        k9 k9Var = this.f22582s;
        if (min < 0.0f) {
            k9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - y20Var.getMeasuredWidth()) {
            k9Var.setTranslationX((-Math.abs(min - (i10 - y20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            k9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        ai.f0 f0Var = this.f22575b;
        float measuredWidth = (f0Var.getMeasuredWidth() / 2.0f) + f7;
        y20 y20Var = this.f22573a;
        float measuredWidth2 = measuredWidth - (y20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((f0Var.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (y20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f22581r;
        float f10 = this.O;
        float f11 = this.f22576b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (y20Var.getParent() != null) {
            this.f22580n.updateViewLayout(y20Var, this.f22581r);
        }
    }
}
