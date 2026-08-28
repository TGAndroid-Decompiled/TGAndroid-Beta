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
public final class j20 implements NotificationCenter.NotificationCenterDelegate {
    public static j20 Z = null;
    public static boolean f29597a0 = true;
    public boolean B;
    public int E;
    public int F;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public final p20 Q;
    public final pi0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public AnimatorSet V;
    public ValueAnimator Y;
    public final h20 f29598a;
    public final fh.d2 f29599b;
    public final kh.h6 f29600c;
    public final FrameLayout d;
    public final org.telegram.ui.t7 f29601e;
    public final n20 f29602f;
    public final int h;
    public WindowManager f29603n;
    public WindowManager.LayoutParams f29604r;
    public final c9 f29605s;
    public final mi0 v;
    public boolean f29606w;
    public boolean f29607x;
    public boolean f29608y;
    public float A = 0.0f;
    public final int[] C = new int[2];
    public final float[] D = new float[2];
    public float G = -1.0f;
    public float H = -1.0f;
    public final f20 O = new f20(this, 0);
    public final f20 P = new f20(this, 1);
    public boolean W = false;
    public float X = 0.0f;

    public j20(final Context context, int i9) {
        this.h = i9;
        h20 h20Var = new h20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f29598a = h20Var;
        h20Var.setAlpha(0.7f);
        p20 p20Var = new p20(i9, context, false);
        this.Q = p20Var;
        h20Var.addView(p20Var, g7.e6.e(-1, -1, 17));
        c9 c9Var = new c9(context, true);
        this.f29605s = c9Var;
        c9Var.setStyle(5);
        c9Var.setCentered(true);
        c9Var.setVisibility(8);
        c9Var.setDelegate(new np(this, 19));
        g(false);
        h20Var.addView(c9Var, g7.e6.e(108, 36, 49));
        fh.d2 d2Var = new fh.d2(this, context, 18);
        this.f29599b = d2Var;
        kh.h6 h6Var = new kh.h6(this, context);
        this.f29600c = h6Var;
        d2Var.addView(h6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.R = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = R.raw.group_pip_delete_icon;
        mi0 mi0Var = new mi0(i10, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = mi0Var;
        mi0Var.h = true;
        imageView.setAnimation(mi0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, g7.e6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.t7 t7Var = new org.telegram.ui.t7(this, context, 2);
        this.f29601e = t7Var;
        t7Var.setOnClickListener(new f0(this, 21));
        t7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f30999f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f31003w = true;
        linearLayout.setOrientation(1);
        linearLayout.f31004x = i9;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        o9 o9Var = new o9(context);
        linearLayout.f30998e = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(o9Var, g7.e6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f30995a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = j3.r0.h(linearLayout2, textView, g7.e6.n(-1, -2), context);
        linearLayout.f30996b = h;
        h.setTextSize(12.0f);
        h.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(h, g7.e6.n(-1, -2));
        frameLayout2.addView(linearLayout2, g7.e6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, g7.e6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        linearLayout.f30997c = u2Var;
        u2Var.setTextSize(12);
        u2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        n20.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n20 n20Var = linearLayout;
                        n20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n20Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        n20.b(linearLayout, context);
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
                        n20.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n20 n20Var = linearLayout;
                        n20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n20Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        n20.b(linearLayout, context);
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
                        n20.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n20 n20Var = linearLayout;
                        n20Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n20Var.d.h;
                                AndroidUtilities.shakeView(textViewArr[0]);
                                AndroidUtilities.shakeView(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        n20.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(context);
        o1Var.setChildSize(68);
        o1Var.setUseStartPadding(false);
        o1Var.addView(u2Var, g7.e6.c(63.0f, 68));
        o1Var.addView(u2Var2, g7.e6.c(63.0f, 68));
        o1Var.addView(u2Var3, g7.e6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(o1Var, g7.e6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f29602f = linearLayout;
        t7Var.addView((View) linearLayout, g7.e6.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.g1.Z.R && Z == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f29597a0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.o50.A3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f29597a0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.o50.A3)) {
            int account = sharedInstance.getAccount();
            if (Z == null) {
                Z = new j20(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                Z.f29603n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(Z.f29601e, b10);
                Z.f29601e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(Z.f29599b, b11);
                WindowManager.LayoutParams b12 = b(context);
                j20 j20Var = Z;
                j20Var.f29604r = b12;
                windowManager.addView(j20Var.f29598a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(Z.d, b13);
                Z.f29599b.setVisibility(8);
                Z.f29598a.setScaleX(0.5f);
                Z.f29598a.setScaleY(0.5f);
                Z.f29598a.setAlpha(0.0f);
                Z.f29598a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(Z.h).addObserver(Z, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.didEndCall);
            }
            c9 c9Var = Z.f29605s;
            if (c9Var.getTag() == null) {
                c9Var.animate().setListener(null).cancel();
                if (c9Var.getVisibility() != 0) {
                    c9Var.setVisibility(0);
                    c9Var.setAlpha(0.0f);
                    c9Var.setScaleX(0.5f);
                    c9Var.setScaleY(0.5f);
                }
                c9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                c9Var.setTag(1);
                return;
            }
            return;
        }
        j20 j20Var2 = Z;
        if (j20Var2 != null) {
            j20Var2.e(false);
            j20 j20Var3 = Z;
            WindowManager windowManager2 = j20Var3.f29603n;
            h20 h20Var = j20Var3.f29598a;
            h20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d20(h20Var, j20Var3.f29599b, j20Var3.d, windowManager2, j20Var3.f29601e)).start();
            Z.d();
            Z = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.T && !this.f29606w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.U != z10) {
            this.U = z10;
            h20 h20Var = this.f29598a;
            if (z10) {
                h20Var.animate().alpha(1.0f).start();
            } else {
                h20Var.animate().alpha(0.7f).start();
            }
            this.Q.setPressedState(z10);
        }
    }

    public final void d() {
        NotificationCenter.getInstance(this.h).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.groupCallUpdated && i9 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i9 == NotificationCenter.didEndCall) {
                j(ApplicationLoader.applicationContext);
                return;
            }
            return;
        }
        g(true);
    }

    public final void e(boolean z10) {
        if (z10 != this.f29606w) {
            this.f29606w = z10;
            org.telegram.ui.t7 t7Var = this.f29601e;
            t7Var.animate().setListener(null).cancel();
            boolean z11 = this.f29606w;
            n20 n20Var = this.f29602f;
            if (z11) {
                if (t7Var.getVisibility() != 0) {
                    t7Var.setVisibility(0);
                    t7Var.setAlpha(0.0f);
                    n20Var.setScaleX(0.7f);
                    n20Var.setScaleY(0.7f);
                }
                t7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 2));
                t7Var.animate().alpha(1.0f).setDuration(150L).start();
                n20Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                n20Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                t7Var.animate().alpha(0.0f).setDuration(150L).setListener(new e20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f29607x != z10) {
            this.f29607x = z10;
            AnimatorSet animatorSet = this.V;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.V.cancel();
            }
            kh.h6 h6Var = this.f29600c;
            if (z10) {
                fh.d2 d2Var = this.f29599b;
                if (d2Var.getVisibility() != 0) {
                    d2Var.setVisibility(0);
                    h6Var.setAlpha(0.0f);
                    h6Var.setScaleX(0.5f);
                    h6Var.setScaleY(0.5f);
                    this.v.K(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(h6Var, View.ALPHA, h6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(h6Var, View.SCALE_X, h6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(h6Var, View.SCALE_Y, h6Var.getScaleY(), 1.0f));
                this.V.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.V = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(h6Var, View.ALPHA, h6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(h6Var, View.SCALE_X, h6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(h6Var, View.SCALE_Y, h6Var.getScaleY(), 0.5f));
            this.V.addListener(new e20(this, 0));
            this.V.setDuration(150L);
            this.V.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        c9 c9Var = this.f29605s;
        b9 b9Var = c9Var.f27425a;
        if (b9Var.f27078f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                call = sharedInstance.groupCall;
            } else {
                call = null;
            }
            int i9 = 0;
            int i10 = this.h;
            if (call != null) {
                long selfId = sharedInstance.getSelfId();
                int size = call.sortedParticipants.size();
                int i11 = 0;
                while (i9 < 2) {
                    if (i11 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i11);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            c9Var.b(i9, groupCallParticipant, i10);
                        }
                        i11++;
                    } else {
                        c9Var.b(i9, null, i10);
                    }
                    i9++;
                    i11++;
                }
                c9Var.b(2, null, i10);
                c9Var.a(z10);
                return;
            }
            while (i9 < 3) {
                c9Var.b(i9, null, i10);
                i9++;
            }
            c9Var.a(z10);
            return;
        }
        b9Var.f27079g = true;
    }

    public final void h() {
        int i9 = AndroidUtilities.displaySize.x;
        h20 h20Var = this.f29598a;
        float min = Math.min(Math.max(this.f29604r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i9 - h20Var.getMeasuredWidth()));
        c9 c9Var = this.f29605s;
        if (min < 0.0f) {
            c9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i9 - h20Var.getMeasuredWidth()) {
            c9Var.setTranslationX((-Math.abs(min - (i9 - h20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            c9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f10 = this.J - this.M;
        fh.d2 d2Var = this.f29599b;
        float measuredWidth = (d2Var.getMeasuredWidth() / 2.0f) + f10;
        h20 h20Var = this.f29598a;
        float measuredWidth2 = measuredWidth - (h20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((d2Var.getMeasuredHeight() / 2.0f) + (this.I - this.N)) - (h20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f29604r;
        float f11 = this.K;
        float f12 = this.X;
        float f13 = 1.0f - f12;
        layoutParams.x = (int) ((measuredWidth2 * f12) + (f11 * f13));
        layoutParams.y = (int) ((measuredHeight * f12) + (f13 * this.L));
        h();
        if (h20Var.getParent() != null) {
            this.f29603n.updateViewLayout(h20Var, this.f29604r);
        }
    }
}
