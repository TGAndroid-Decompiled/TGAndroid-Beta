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
public final class j30 implements NotificationCenter.NotificationCenterDelegate {
    public static j30 f24207d0 = null;
    public static boolean f24208e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final p30 U;
    public final kj0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final h30 f24209a;
    public final bi.ld f24211b;
    public final bi.s7 f24213c;
    public ValueAnimator f24214c0;
    public final FrameLayout d;
    public final org.telegram.ui.t7 e;
    public final n30 f24215f;
    public final int h;
    public WindowManager f24216n;
    public WindowManager.LayoutParams f24217r;
    public final j9 f24218s;
    public final hj0 v;
    public boolean f24219w;
    public boolean f24220x;
    public boolean f24221y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final f30 S = new f30(this, 0);
    public final f30 T = new f30(this, 1);
    public boolean f24210a0 = false;
    public float f24212b0 = 0.0f;

    public j30(final Context context, int i10) {
        this.h = i10;
        h30 h30Var = new h30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f24209a = h30Var;
        h30Var.setAlpha(0.7f);
        p30 p30Var = new p30(i10, context, false);
        this.U = p30Var;
        h30Var.addView(p30Var, w7.a6.e(-1, -1, 17));
        j9 j9Var = new j9(context, true);
        this.f24218s = j9Var;
        j9Var.setStyle(5);
        j9Var.setCentered(true);
        j9Var.setVisibility(8);
        j9Var.setDelegate(new dq(this, 19));
        g(false);
        h30Var.addView(j9Var, w7.a6.e(108, 36, 49));
        bi.ld ldVar = new bi.ld(this, context, 13);
        this.f24211b = ldVar;
        bi.s7 s7Var = new bi.s7(this, context);
        this.f24213c = s7Var;
        ldVar.addView(s7Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        hj0 hj0Var = new hj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = hj0Var;
        hj0Var.h = true;
        imageView.setAnimation(hj0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, w7.a6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.t7 t7Var = new org.telegram.ui.t7(this, context, 2);
        this.e = t7Var;
        t7Var.setOnClickListener(new h0(this, 21));
        t7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f25392f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f25396w = true;
        linearLayout.setOrientation(1);
        linearLayout.f25397x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w9 w9Var = new w9(context);
        linearLayout.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(w9Var, w7.a6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        frameLayout2.setOnClickListener(new h0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f25389a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout2, textView, w7.a6.n(-1, -2), context);
        linearLayout.f25390b = g10;
        g10.setTextSize(12.0f);
        g10.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(g10, w7.a6.n(-1, -2));
        frameLayout2.addView(linearLayout2, w7.a6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.a6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(context, 44.0f);
        linearLayout.f25391c = u2Var;
        u2Var.setTextSize(12);
        u2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        n30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n30 n30Var = linearLayout;
                        n30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n30Var.d.h;
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
                        n30.b(linearLayout, context);
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
                        n30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n30 n30Var = linearLayout;
                        n30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n30Var.d.h;
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
                        n30.b(linearLayout, context);
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
                        n30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        n30 n30Var = linearLayout;
                        n30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = n30Var.d.h;
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
                        n30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.q1 q1Var = new org.telegram.ui.Components.voip.q1(context);
        q1Var.setChildSize(68);
        q1Var.setUseStartPadding(false);
        q1Var.addView(u2Var, w7.a6.c(63.0f, 68));
        q1Var.addView(u2Var2, w7.a6.c(63.0f, 68));
        q1Var.addView(u2Var3, w7.a6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(q1Var, w7.a6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f24215f = linearLayout;
        t7Var.addView((View) linearLayout, w7.a6.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.i1.f28169d0.V && f24207d0 == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f24208e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.j60.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f24208e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.j60.E3)) {
            int account = sharedInstance.getAccount();
            if (f24207d0 == null) {
                f24207d0 = new j30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f24207d0.f24216n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f24207d0.e, b10);
                f24207d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f24207d0.f24211b, b11);
                WindowManager.LayoutParams b12 = b(context);
                j30 j30Var = f24207d0;
                j30Var.f24217r = b12;
                windowManager.addView(j30Var.f24209a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f24207d0.d, b13);
                f24207d0.f24211b.setVisibility(8);
                f24207d0.f24209a.setScaleX(0.5f);
                f24207d0.f24209a.setScaleY(0.5f);
                f24207d0.f24209a.setAlpha(0.0f);
                f24207d0.f24209a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f24207d0.h).addObserver(f24207d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f24207d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f24207d0, NotificationCenter.didEndCall);
            }
            j9 j9Var = f24207d0.f24218s;
            if (j9Var.getTag() == null) {
                j9Var.animate().setListener(null).cancel();
                if (j9Var.getVisibility() != 0) {
                    j9Var.setVisibility(0);
                    j9Var.setAlpha(0.0f);
                    j9Var.setScaleX(0.5f);
                    j9Var.setScaleY(0.5f);
                }
                j9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                j9Var.setTag(1);
                return;
            }
            return;
        }
        j30 j30Var2 = f24207d0;
        if (j30Var2 != null) {
            j30Var2.e(false);
            j30 j30Var3 = f24207d0;
            WindowManager windowManager2 = j30Var3.f24216n;
            h30 h30Var = j30Var3.f24209a;
            h30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d30(h30Var, j30Var3.f24211b, j30Var3.d, windowManager2, j30Var3.e)).start();
            f24207d0.d();
            f24207d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f24219w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            h30 h30Var = this.f24209a;
            if (z10) {
                h30Var.animate().alpha(1.0f).start();
            } else {
                h30Var.animate().alpha(0.7f).start();
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
        if (z10 != this.f24219w) {
            this.f24219w = z10;
            org.telegram.ui.t7 t7Var = this.e;
            t7Var.animate().setListener(null).cancel();
            boolean z11 = this.f24219w;
            n30 n30Var = this.f24215f;
            if (z11) {
                if (t7Var.getVisibility() != 0) {
                    t7Var.setVisibility(0);
                    t7Var.setAlpha(0.0f);
                    n30Var.setScaleX(0.7f);
                    n30Var.setScaleY(0.7f);
                }
                t7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 2));
                t7Var.animate().alpha(1.0f).setDuration(150L).start();
                n30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                n30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                t7Var.animate().alpha(0.0f).setDuration(150L).setListener(new e30(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f24220x != z10) {
            this.f24220x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            bi.s7 s7Var = this.f24213c;
            if (z10) {
                bi.ld ldVar = this.f24211b;
                if (ldVar.getVisibility() != 0) {
                    ldVar.setVisibility(0);
                    s7Var.setAlpha(0.0f);
                    s7Var.setScaleX(0.5f);
                    s7Var.setScaleY(0.5f);
                    this.v.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s7Var, View.ALPHA, s7Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s7Var, View.SCALE_X, s7Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s7Var, View.SCALE_Y, s7Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s7Var, View.ALPHA, s7Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s7Var, View.SCALE_X, s7Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s7Var, View.SCALE_Y, s7Var.getScaleY(), 0.5f));
            this.Z.addListener(new e30(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        j9 j9Var = this.f24218s;
        i9 i9Var = j9Var.f24315a;
        if (i9Var.f23938f == null) {
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
                            j9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        j9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                j9Var.b(2, null, i11);
                j9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                j9Var.b(i10, null, i11);
                i10++;
            }
            j9Var.a(z10);
            return;
        }
        i9Var.f23939g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        h30 h30Var = this.f24209a;
        float min = Math.min(Math.max(this.f24217r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - h30Var.getMeasuredWidth()));
        j9 j9Var = this.f24218s;
        if (min < 0.0f) {
            j9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - h30Var.getMeasuredWidth()) {
            j9Var.setTranslationX((-Math.abs(min - (i10 - h30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            j9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        bi.ld ldVar = this.f24211b;
        float measuredWidth = (ldVar.getMeasuredWidth() / 2.0f) + f7;
        h30 h30Var = this.f24209a;
        float measuredWidth2 = measuredWidth - (h30Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((ldVar.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (h30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f24217r;
        float f10 = this.O;
        float f11 = this.f24212b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (h30Var.getParent() != null) {
            this.f24216n.updateViewLayout(h30Var, this.f24217r);
        }
    }
}
