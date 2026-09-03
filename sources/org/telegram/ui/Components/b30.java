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
public final class b30 implements NotificationCenter.NotificationCenterDelegate {
    public static b30 f23530a0 = null;
    public static boolean f23531b0 = true;
    public boolean C;
    public int F;
    public int G;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public final h30 R;
    public final jj0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator Z;
    public final z20 f23532a;
    public final dg.u2 f23533b;
    public final eg.i0 f23534c;
    public final FrameLayout d;
    public final org.telegram.ui.y7 e;
    public final f30 f23535f;
    public final int h;
    public WindowManager f23536n;
    public WindowManager.LayoutParams f23537r;
    public final d9 f23538s;
    public final gj0 v;
    public boolean f23539w;
    public boolean f23540x;
    public boolean f23541y;
    public float B = 0.0f;
    public final int[] D = new int[2];
    public final float[] E = new float[2];
    public float H = -1.0f;
    public float I = -1.0f;
    public final x20 P = new x20(this, 0);
    public final x20 Q = new x20(this, 1);
    public boolean X = false;
    public float Y = 0.0f;

    public b30(final Context context, int i10) {
        this.h = i10;
        z20 z20Var = new z20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f23532a = z20Var;
        z20Var.setAlpha(0.7f);
        h30 h30Var = new h30(i10, context, false);
        this.R = h30Var;
        z20Var.addView(h30Var, k7.b6.e(-1, -1, 17));
        d9 d9Var = new d9(context, true);
        this.f23538s = d9Var;
        d9Var.setStyle(5);
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        d9Var.setDelegate(new up(this, 19));
        g(false);
        z20Var.addView(d9Var, k7.b6.e(108, 36, 49));
        dg.u2 u2Var = new dg.u2(this, context, 21);
        this.f23533b = u2Var;
        eg.i0 i0Var = new eg.i0(this, context);
        this.f23534c = i0Var;
        u2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.S = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        gj0 gj0Var = new gj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = gj0Var;
        gj0Var.h = true;
        imageView.setAnimation(gj0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, k7.b6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, context, 2);
        this.e = y7Var;
        y7Var.setOnClickListener(new g0(this, 21));
        y7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f24781f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f24785w = true;
        linearLayout.setOrientation(1);
        linearLayout.f24786x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        p9 p9Var = new p9(context);
        linearLayout.e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(p9Var, k7.b6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new g0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f24778a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = org.telegram.ui.ai.i(linearLayout2, textView, k7.b6.n(-1, -2), context);
        linearLayout.f24779b = i11;
        i11.setTextSize(12.0f);
        i11.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(i11, k7.b6.n(-1, -2));
        frameLayout2.addView(linearLayout2, k7.b6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, k7.b6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(context, 44.0f);
        linearLayout.f24780c = v2Var;
        v2Var.setTextSize(12);
        v2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        f30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        f30 f30Var = linearLayout;
                        f30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = f30Var.d.h;
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
                        f30.b(linearLayout, context);
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
                        f30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        f30 f30Var = linearLayout;
                        f30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = f30Var.d.h;
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
                        f30.b(linearLayout, context);
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
                        f30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        f30 f30Var = linearLayout;
                        f30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = f30Var.d.h;
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
                        f30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(context);
        o1Var.setChildSize(68);
        o1Var.setUseStartPadding(false);
        o1Var.addView(v2Var, k7.b6.c(63.0f, 68));
        o1Var.addView(v2Var2, k7.b6.c(63.0f, 68));
        o1Var.addView(v2Var3, k7.b6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(o1Var, k7.b6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f23535f = linearLayout;
        y7Var.addView((View) linearLayout, k7.b6.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.g1.f29608a0.S && f23530a0 == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f23531b0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.e60.B3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z4 && !f23531b0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.e60.B3)) {
            int account = sharedInstance.getAccount();
            if (f23530a0 == null) {
                f23530a0 = new b30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f23530a0.f23536n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f23530a0.e, b10);
                f23530a0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f23530a0.f23533b, b11);
                WindowManager.LayoutParams b12 = b(context);
                b30 b30Var = f23530a0;
                b30Var.f23537r = b12;
                windowManager.addView(b30Var.f23532a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f23530a0.d, b13);
                f23530a0.f23533b.setVisibility(8);
                f23530a0.f23532a.setScaleX(0.5f);
                f23530a0.f23532a.setScaleY(0.5f);
                f23530a0.f23532a.setAlpha(0.0f);
                f23530a0.f23532a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f23530a0.h).addObserver(f23530a0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f23530a0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f23530a0, NotificationCenter.didEndCall);
            }
            d9 d9Var = f23530a0.f23538s;
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
        b30 b30Var2 = f23530a0;
        if (b30Var2 != null) {
            b30Var2.e(false);
            b30 b30Var3 = f23530a0;
            WindowManager windowManager2 = b30Var3.f23536n;
            z20 z20Var = b30Var3.f23532a;
            z20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new v20(z20Var, b30Var3.f23533b, b30Var3.d, windowManager2, b30Var3.e)).start();
            f23530a0.d();
            f23530a0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z4;
        if (!this.U && !this.f23539w) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.V != z4) {
            this.V = z4;
            z20 z20Var = this.f23532a;
            if (z4) {
                z20Var.animate().alpha(1.0f).start();
            } else {
                z20Var.animate().alpha(0.7f).start();
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
        if (z4 != this.f23539w) {
            this.f23539w = z4;
            org.telegram.ui.y7 y7Var = this.e;
            y7Var.animate().setListener(null).cancel();
            boolean z10 = this.f23539w;
            f30 f30Var = this.f23535f;
            if (z10) {
                if (y7Var.getVisibility() != 0) {
                    y7Var.setVisibility(0);
                    y7Var.setAlpha(0.0f);
                    f30Var.setScaleX(0.7f);
                    f30Var.setScaleY(0.7f);
                }
                y7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.aa(this, 2));
                y7Var.animate().alpha(1.0f).setDuration(150L).start();
                f30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                f30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                y7Var.animate().alpha(0.0f).setDuration(150L).setListener(new w20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z4) {
        if (this.f23540x != z4) {
            this.f23540x = z4;
            AnimatorSet animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.W.cancel();
            }
            eg.i0 i0Var = this.f23534c;
            if (z4) {
                dg.u2 u2Var = this.f23533b;
                if (u2Var.getVisibility() != 0) {
                    u2Var.setVisibility(0);
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
        d9 d9Var = this.f23538s;
        c9 c9Var = d9Var.f24231a;
        if (c9Var.f23878f == null) {
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
        c9Var.f23879g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        z20 z20Var = this.f23532a;
        float min = Math.min(Math.max(this.f23537r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - z20Var.getMeasuredWidth()));
        d9 d9Var = this.f23538s;
        if (min < 0.0f) {
            d9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - z20Var.getMeasuredWidth()) {
            d9Var.setTranslationX((-Math.abs(min - (i10 - z20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            d9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.K - this.N;
        dg.u2 u2Var = this.f23533b;
        float measuredWidth = (u2Var.getMeasuredWidth() / 2.0f) + f10;
        z20 z20Var = this.f23532a;
        float measuredWidth2 = measuredWidth - (z20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((u2Var.getMeasuredHeight() / 2.0f) + (this.J - this.O)) - (z20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f23537r;
        float f11 = this.L;
        float f12 = this.Y;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.M));
        h();
        if (z20Var.getParent() != null) {
            this.f23536n.updateViewLayout(z20Var, this.f23537r);
        }
    }
}
