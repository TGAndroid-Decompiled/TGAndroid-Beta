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
public final class k30 implements NotificationCenter.NotificationCenterDelegate {
    public static k30 f29835d0 = null;
    public static boolean f29836e0 = true;
    public boolean F;
    public int I;
    public int J;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public final q30 U;
    public final bk0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public AnimatorSet Z;
    public final h30 f29837a;
    public final bh.r f29839b;
    public final fi.f6 f29841c;
    public ValueAnimator f29842c0;
    public final FrameLayout d;
    public final org.telegram.ui.a8 e;
    public final o30 f29843f;
    public final int h;
    public WindowManager f29844n;
    public WindowManager.LayoutParams f29845r;
    public final m9 f29846s;
    public final yj0 v;
    public boolean f29847w;
    public boolean f29848x;
    public boolean f29849y;
    public float E = 0.0f;
    public final int[] G = new int[2];
    public final float[] H = new float[2];
    public float K = -1.0f;
    public float L = -1.0f;
    public final f30 S = new f30(this, 0);
    public final f30 T = new f30(this, 1);
    public boolean f29838a0 = false;
    public float f29840b0 = 0.0f;

    public k30(final Context context, int i10) {
        this.h = i10;
        h30 h30Var = new h30(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f29837a = h30Var;
        h30Var.setAlpha(0.7f);
        q30 q30Var = new q30(i10, context, false);
        this.U = q30Var;
        h30Var.addView(q30Var, kb1.i(-1, -1, 17));
        m9 m9Var = new m9(context, true);
        this.f29846s = m9Var;
        m9Var.setStyle(5);
        m9Var.setCentered(true);
        m9Var.setVisibility(8);
        m9Var.setDelegate(new cp(this, 22));
        g(false);
        h30Var.addView(m9Var, kb1.i(108, 36, 49));
        bh.r rVar = new bh.r(this, context, 18);
        this.f29839b = rVar;
        fi.f6 f6Var = new fi.f6(this, context);
        this.f29841c = f6Var;
        rVar.addView(f6Var);
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
        frameLayout.addView((View) imageView, kb1.h(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, context, 2);
        this.e = a8Var;
        a8Var.setOnClickListener(new f0(this, 20));
        a8Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f31144f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f31148w = true;
        linearLayout.setOrientation(1);
        linearLayout.f31149x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        y9 y9Var = new y9(context);
        linearLayout.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(y9Var, kb1.g(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        frameLayout2.setOnClickListener(new f0((Object) linearLayout, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f31141a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView e = org.telegram.messenger.wh.e(linearLayout2, textView, kb1.r(-1, -2), context);
        linearLayout.f31142b = e;
        e.setTextSize(12.0f);
        e.setTextColor(i0.a.o(-1, 153));
        linearLayout2.addView(e, kb1.r(-1, -2));
        frameLayout2.addView(linearLayout2, kb1.h(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, kb1.x(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        linearLayout.f31143c = w2Var;
        w2Var.setTextSize(12);
        w2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o30 o30Var = linearLayout;
                        o30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        o30 o30Var2 = linearLayout;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = o30Var2.d.h;
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
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        w2Var.setCheckable(true);
        w2Var.a(i0.a.o(-1, 38), i0.a.o(-1, 76));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(context, 44.0f);
        linearLayout.d = w2Var2;
        w2Var2.setTextSize(12);
        w2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o30 o30Var = linearLayout;
                        o30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        o30 o30Var2 = linearLayout;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = o30Var2.d.h;
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
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
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
                        o30 o30Var = linearLayout;
                        o30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o30Var.getContext(), Settings.canDrawOverlays(context));
                            return;
                        }
                        return;
                    case 1:
                        Context context2 = context;
                        o30 o30Var2 = linearLayout;
                        o30Var2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = o30Var2.d.h;
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
                        Context context3 = linearLayout.getContext();
                        Context context4 = context;
                        org.telegram.ui.x50.t1(context3, new m30(context4, 0), Settings.canDrawOverlays(context4), false);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(context);
        s1Var.setChildSize(68);
        s1Var.setUseStartPadding(false);
        s1Var.addView(w2Var, kb1.g(63.0f, 68));
        s1Var.addView(w2Var2, kb1.g(63.0f, 68));
        s1Var.addView(w2Var3, kb1.g(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(s1Var, kb1.x(-1, -2, 0, 6, 0, 6, 0));
        this.f29843f = linearLayout;
        a8Var.addView((View) linearLayout, kb1.g(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.i1.f33949d0.V && f29835d0 == null) {
            if (ApplicationLoader.canDrawOverlays && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f29836e0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.x50.E3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f29836e0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.x50.E3)) {
            int account = sharedInstance.getAccount();
            if (f29835d0 == null) {
                f29835d0 = new k30(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                f29835d0.f29844n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(f29835d0.e, b10);
                f29835d0.e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f29835d0.f29839b, b11);
                WindowManager.LayoutParams b12 = b(context);
                k30 k30Var = f29835d0;
                k30Var.f29845r = b12;
                windowManager.addView(k30Var.f29837a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(f29835d0.d, b13);
                f29835d0.f29839b.setVisibility(8);
                f29835d0.f29837a.setScaleX(0.5f);
                f29835d0.f29837a.setScaleY(0.5f);
                f29835d0.f29837a.setAlpha(0.0f);
                f29835d0.f29837a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(f29835d0.h).addObserver(f29835d0, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(f29835d0, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(f29835d0, NotificationCenter.didEndCall);
            }
            m9 m9Var = f29835d0.f29846s;
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
        k30 k30Var2 = f29835d0;
        if (k30Var2 != null) {
            k30Var2.e(false);
            k30 k30Var3 = f29835d0;
            WindowManager windowManager2 = k30Var3.f29844n;
            h30 h30Var = k30Var3.f29837a;
            h30Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new d30(h30Var, k30Var3.f29839b, k30Var3.d, windowManager2, k30Var3.e)).start();
            f29835d0.d();
            f29835d0 = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.X && !this.f29847w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            h30 h30Var = this.f29837a;
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
        if (z10 != this.f29847w) {
            this.f29847w = z10;
            org.telegram.ui.a8 a8Var = this.e;
            a8Var.animate().setListener(null).cancel();
            boolean z11 = this.f29847w;
            o30 o30Var = this.f29843f;
            if (z11) {
                if (a8Var.getVisibility() != 0) {
                    a8Var.setVisibility(0);
                    a8Var.setAlpha(0.0f);
                    o30Var.setScaleX(0.7f);
                    o30Var.setScaleY(0.7f);
                }
                a8Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 2));
                a8Var.animate().alpha(1.0f).setDuration(150L).start();
                o30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                o30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                a8Var.animate().alpha(0.0f).setDuration(150L).setListener(new e30(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f29848x != z10) {
            this.f29848x = z10;
            AnimatorSet animatorSet = this.Z;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.Z.cancel();
            }
            fi.f6 f6Var = this.f29841c;
            if (z10) {
                bh.r rVar = this.f29839b;
                if (rVar.getVisibility() != 0) {
                    rVar.setVisibility(0);
                    f6Var.setAlpha(0.0f);
                    f6Var.setScaleX(0.5f);
                    f6Var.setScaleY(0.5f);
                    this.v.M(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.Z = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(f6Var, View.ALPHA, f6Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(f6Var, View.SCALE_X, f6Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(f6Var, View.SCALE_Y, f6Var.getScaleY(), 1.0f));
                this.Z.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.Z = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(f6Var, View.ALPHA, f6Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(f6Var, View.SCALE_X, f6Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(f6Var, View.SCALE_Y, f6Var.getScaleY(), 0.5f));
            this.Z.addListener(new e30(this, 0));
            this.Z.setDuration(150L);
            this.Z.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        m9 m9Var = this.f29846s;
        l9 l9Var = m9Var.f30469a;
        if (l9Var.f30179f == null) {
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
        l9Var.f30180g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        h30 h30Var = this.f29837a;
        float min = Math.min(Math.max(this.f29845r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - h30Var.getMeasuredWidth()));
        int i11 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        m9 m9Var = this.f29846s;
        if (i11 < 0) {
            m9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - h30Var.getMeasuredWidth()) {
            m9Var.setTranslationX((-Math.abs(min - (i10 - h30Var.getMeasuredWidth()))) / 3.0f);
        } else {
            m9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f7 = this.N - this.Q;
        bh.r rVar = this.f29839b;
        float measuredWidth = (rVar.getMeasuredWidth() / 2.0f) + f7;
        h30 h30Var = this.f29837a;
        float measuredWidth2 = measuredWidth - (h30Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((rVar.getMeasuredHeight() / 2.0f) + (this.M - this.R)) - (h30Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f29845r;
        float f10 = this.O;
        float f11 = this.f29840b0;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.P));
        h();
        if (h30Var.getParent() != null) {
            this.f29844n.updateViewLayout(h30Var, this.f29845r);
        }
    }
}
