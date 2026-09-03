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
public final class c30 implements NotificationCenter.NotificationCenterDelegate {
    public static c30 f25747a0 = null;
    public static boolean f25748b0 = true;
    public boolean C;
    public int F;
    public int G;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public final i30 R;
    public final kj0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator Z;
    public final a30 f25749a;
    public final eg.s2 f25750b;
    public final fg.i0 f25751c;
    public final FrameLayout d;
    public final org.telegram.ui.w7 f25752e;
    public final g30 f25753f;
    public final int h;
    public WindowManager f25754n;
    public WindowManager.LayoutParams f25755r;
    public final d9 f25756s;
    public final hj0 v;
    public boolean f25757w;
    public boolean f25758x;
    public boolean f25759y;
    public float B = 0.0f;
    public final int[] D = new int[2];
    public final float[] E = new float[2];
    public float H = -1.0f;
    public float I = -1.0f;
    public final y20 P = new y20(this, 0);
    public final y20 Q = new y20(this, 1);
    public boolean X = false;
    public float Y = 0.0f;

    public c30(final Context context, int i10) {
        this.h = i10;
        a30 a30Var = new a30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f25749a = a30Var;
        a30Var.setAlpha(0.7f);
        i30 i30Var = new i30(i10, context, false);
        this.R = i30Var;
        a30Var.addView(i30Var, k7.c6.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.f25756s = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new xp(this, 19));
        g(false);
        a30Var.addView(d9Var, k7.c6.e(108, 36, 49));
        eg.s2 s2Var = new eg.s2(this, context, 21);
        this.f25750b = s2Var;
        fg.i0 i0Var = new fg.i0(this, context);
        this.f25751c = i0Var;
        s2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.S = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        hj0 hj0Var = new hj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = hj0Var;
        hj0Var.h = true;
        imageView.setAnimation(hj0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, k7.c6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, context, 2);
        this.f25752e = w7Var;
        w7Var.setOnClickListener(new g0(this, 21));
        w7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f27079f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f27083w = true;
        linearLayout.setOrientation(1);
        linearLayout.f27084x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        p9 p9Var = new p9(context);
        linearLayout.f27078e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(p9Var, k7.c6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new g0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f27075a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.yh.i(linearLayout2, textView, k7.c6.n(-1, -2), context);
        linearLayout.f27076b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(i11, k7.c6.n(-1, -2));
        frameLayout2.addView(linearLayout2, k7.c6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, k7.c6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        linearLayout.f27077c = w2Var;
        w2Var.setTextSize(12);
        w2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        g30 g30Var = linearLayout;
                        g30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = g30Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g30.b(linearLayout, context);
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
                        g30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        g30 g30Var = linearLayout;
                        g30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = g30Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g30.b(linearLayout, context);
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
                        g30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        g30 g30Var = linearLayout;
                        g30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = g30Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(context);
        p1Var.setChildSize(68);
        p1Var.setUseStartPadding(false);
        p1Var.addView(w2Var, k7.c6.c(63.0f, 68));
        p1Var.addView(w2Var2, k7.c6.c(63.0f, 68));
        p1Var.addView(w2Var3, k7.c6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(p1Var, k7.c6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f25753f = linearLayout;
        w7Var.addView((View) linearLayout, k7.c6.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.h1.f32071a0.S && f25747a0 == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f25748b0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.d60.B3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void j(Context context) {
        boolean z4;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z4 && !f25748b0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.d60.B3)) {
            int account = sharedInstance.getAccount();
            if (f25747a0 == null) {
                f25747a0 = new c30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f25747a0.f25754n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f25747a0.f25752e, b10);
                f25747a0.f25752e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f25747a0.f25750b, b11);
                WindowManager.LayoutParams b12 = b(context);
                c30 c30Var = f25747a0;
                c30Var.f25755r = b12;
                windowManager.addView(c30Var.f25749a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f25747a0.d, b13);
                f25747a0.f25750b.setVisibility(8);
                f25747a0.f25749a.setScaleX(0.5f);
                f25747a0.f25749a.setScaleY(0.5f);
                f25747a0.f25749a.setAlpha(0.0f);
                f25747a0.f25749a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f25747a0.h).addObserver(f25747a0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f25747a0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f25747a0, NotificationCenter.didEndCall);
            }
            d9 d9Var = f25747a0.f25756s;
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
        c30 c30Var2 = f25747a0;
        if (c30Var2 != null) {
            c30Var2.e(false);
            c30 c30Var3 = f25747a0;
            WindowManager windowManager2 = c30Var3.f25754n;
            a30 a30Var = c30Var3.f25749a;
            a30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new v20(a30Var, c30Var3.f25750b, c30Var3.d, windowManager2, c30Var3.f25752e)).start();
            f25747a0.d();
            f25747a0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z4;
        if (!this.U && !this.f25757w) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.V != z4) {
            this.V = z4;
            a30 a30Var = this.f25749a;
            if (z4) {
                a30Var.animate().alpha(1.0f).start();
            } else {
                a30Var.animate().alpha(0.7f).start();
            }
            this.R.setPressedState(z4);
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

    public final void e(boolean z4) {
        if (z4 != this.f25757w) {
            this.f25757w = z4;
            org.telegram.ui.w7 w7Var = this.f25752e;
            w7Var.animate().setListener(null).cancel();
            boolean z10 = this.f25757w;
            g30 g30Var = this.f25753f;
            if (z10) {
                if (w7Var.getVisibility() != 0) {
                    w7Var.setVisibility(0);
                    w7Var.setAlpha(0.0f);
                    g30Var.setScaleX(0.7f);
                    g30Var.setScaleY(0.7f);
                }
                w7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 2));
                w7Var.animate().alpha(1.0f).setDuration(150L).start();
                g30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                g30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                w7Var.animate().alpha(0.0f).setDuration(150L).setListener(new w20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z4) {
        if (this.f25758x != z4) {
            this.f25758x = z4;
            AnimatorSet animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.W.cancel();
            }
            fg.i0 i0Var = this.f25751c;
            if (z4) {
                eg.s2 s2Var = this.f25750b;
                if (s2Var.getVisibility() != 0) {
                    s2Var.setVisibility(0);
                    i0Var.setAlpha(0.0f);
                    i0Var.setScaleX(0.5f);
                    i0Var.setScaleY(0.5f);
                    this.v.K(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i0Var, View.ALPHA, i0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_X, i0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_Y, i0Var.getScaleY(), 1.0f));
                this.W.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.W = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, View.ALPHA, i0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_X, i0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(i0Var, View.SCALE_Y, i0Var.getScaleY(), 0.5f));
            this.W.addListener(new w20(this, 0));
            this.W.setDuration(150L);
            this.W.start();
        }
    }

    public final void g(boolean z4) {
        ChatObject.Call call;
        d9 d9Var = this.f25756s;
        c9 c9Var = d9Var.f26228a;
        if (c9Var.f25844f == null) {
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
                            d9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        d9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                d9Var.b(2, null, i11);
                d9Var.a(z4);
                return;
            }
            while (i10 < 3) {
                d9Var.b(i10, null, i11);
                i10++;
            }
            d9Var.a(z4);
            return;
        }
        c9Var.f25845g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        a30 a30Var = this.f25749a;
        float min = Math.min(Math.max(this.f25755r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - a30Var.getMeasuredWidth()));
        d9 d9Var = this.f25756s;
        if (min < 0.0f) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - a30Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i10 - a30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.K - this.N;
        eg.s2 s2Var = this.f25750b;
        float measuredWidth = (s2Var.getMeasuredWidth() / 2.0f) + f10;
        a30 a30Var = this.f25749a;
        float measuredWidth2 = measuredWidth - (a30Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((s2Var.getMeasuredHeight() / 2.0f) + (this.J - this.O)) - (a30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f25755r;
        float f11 = this.L;
        float f12 = this.Y;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.M));
        h();
        if (a30Var.getParent() != null) {
            this.f25754n.updateViewLayout(a30Var, this.f25755r);
        }
    }
}
