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
public final class w20 implements NotificationCenter.NotificationCenterDelegate {
    public static w20 Z = null;
    public static boolean f34274a0 = true;
    public boolean B;
    public int E;
    public int F;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public final c30 Q;
    public final aj0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public AnimatorSet V;
    public ValueAnimator Y;
    public final t20 f34275a;
    public final bg.x2 f34276b;
    public final cg.i0 f34277c;
    public final FrameLayout d;
    public final org.telegram.ui.s7 f34278e;
    public final a30 f34279f;
    public final int h;
    public WindowManager f34280n;
    public WindowManager.LayoutParams f34281r;
    public final h9 f34282s;
    public final xi0 v;
    public boolean f34283w;
    public boolean f34284x;
    public boolean f34285y;
    public float A = 0.0f;
    public final int[] C = new int[2];
    public final float[] D = new float[2];
    public float G = -1.0f;
    public float H = -1.0f;
    public final r20 O = new r20(this, 0);
    public final r20 P = new r20(this, 1);
    public boolean W = false;
    public float X = 0.0f;

    public w20(final Context context, int i10) {
        this.h = i10;
        t20 t20Var = new t20(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.f34275a = t20Var;
        t20Var.setAlpha(0.7f);
        c30 c30Var = new c30(i10, context, false);
        this.Q = c30Var;
        t20Var.addView(c30Var, i7.f6.e(-1, -1, 17));
        h9 h9Var = new h9(context, true);
        this.f34282s = h9Var;
        h9Var.setStyle(5);
        h9Var.setCentered(true);
        h9Var.setVisibility(8);
        h9Var.setDelegate(new rp(this, 19));
        g(false);
        t20Var.addView(h9Var, i7.f6.e(108, 36, 49));
        bg.x2 x2Var = new bg.x2(this, context, 23);
        this.f34276b = x2Var;
        cg.i0 i0Var = new cg.i0(this, context);
        this.f34277c = i0Var;
        x2Var.addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.R = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = R.raw.group_pip_delete_icon;
        xi0 xi0Var = new xi0(i11, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        imageView.setAnimation(xi0Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, i7.f6.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        org.telegram.ui.s7 s7Var = new org.telegram.ui.s7(this, context, 2);
        this.f34278e = s7Var;
        s7Var.setOnClickListener(new h0(this, 21));
        s7Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f26647f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.f26651w = true;
        linearLayout.setOrientation(1);
        linearLayout.f26652x = i10;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        t9 t9Var = new t9(context);
        linearLayout.f26646e = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        frameLayout2.addView(t9Var, i7.f6.c(44.0f, 44));
        int dp = AndroidUtilities.dp(6.0f);
        int k9 = i0.a.k(-1, 76);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        frameLayout2.setOnClickListener(new h0((Object) linearLayout, 22));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.f26643a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i12 = org.telegram.ui.th.i(linearLayout2, textView, i7.f6.n(-1, -2), context);
        linearLayout.f26644b = i12;
        i12.setTextSize(12.0f);
        i12.setTextColor(i0.a.k(-1, 153));
        linearLayout2.addView(i12, i7.f6.n(-1, -2));
        frameLayout2.addView(linearLayout2, i7.f6.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, i7.f6.t(-1, -2, 0, 10, 10, 10, 10));
        org.telegram.ui.Components.voip.x2 x2Var2 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        linearLayout.f26645c = x2Var2;
        x2Var2.setTextSize(12);
        x2Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        a30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        a30 a30Var = linearLayout;
                        a30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = a30Var.d.h;
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
                        a30.b(linearLayout, context);
                        return;
                }
            }
        });
        x2Var2.setCheckable(true);
        x2Var2.a(i0.a.k(-1, 38), i0.a.k(-1, 76));
        org.telegram.ui.Components.voip.x2 x2Var3 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        linearLayout.d = x2Var3;
        x2Var3.setTextSize(12);
        x2Var3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        a30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        a30 a30Var = linearLayout;
                        a30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = a30Var.d.h;
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
                        a30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.x2 x2Var4 = new org.telegram.ui.Components.voip.x2(context, 44.0f);
        x2Var4.setTextSize(12);
        x2Var4.c(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        x2Var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        a30.a(linearLayout, context);
                        return;
                    case 1:
                        Context context2 = context;
                        a30 a30Var = linearLayout;
                        a30Var.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = a30Var.d.h;
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
                        a30.b(linearLayout, context);
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.p1 p1Var = new org.telegram.ui.Components.voip.p1(context);
        p1Var.setChildSize(68);
        p1Var.setUseStartPadding(false);
        p1Var.addView(x2Var2, i7.f6.c(63.0f, 68));
        p1Var.addView(x2Var3, i7.f6.c(63.0f, 68));
        p1Var.addView(x2Var4, i7.f6.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(p1Var, i7.f6.t(-1, -2, 0, 6, 0, 6, 0));
        this.f34279f = linearLayout;
        s7Var.addView((View) linearLayout, i7.f6.c(-2.0f, -2));
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
        if (!org.telegram.ui.Components.voip.h1.Z.R && Z == null) {
            if ((Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays) && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !f34274a0) {
                if (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.r50.A3) {
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
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z10 && !f34274a0 && (ApplicationLoader.mainInterfaceStopped || !org.telegram.ui.r50.A3)) {
            int account = sharedInstance.getAccount();
            if (Z == null) {
                Z = new w20(context, account);
                WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
                Z.f34280n = windowManager;
                WindowManager.LayoutParams b10 = b(context);
                b10.width = -1;
                b10.height = -1;
                b10.dimAmount = 0.25f;
                b10.flags = 522;
                windowManager.addView(Z.f34278e, b10);
                Z.f34278e.setVisibility(8);
                WindowManager.LayoutParams b11 = b(context);
                b11.gravity = 81;
                b11.width = AndroidUtilities.dp(100.0f);
                b11.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(Z.f34276b, b11);
                WindowManager.LayoutParams b12 = b(context);
                w20 w20Var = Z;
                w20Var.f34281r = b12;
                windowManager.addView(w20Var.f34275a, b12);
                WindowManager.LayoutParams b13 = b(context);
                b13.gravity = 81;
                b13.width = AndroidUtilities.dp(100.0f);
                b13.height = AndroidUtilities.dp(150.0f);
                windowManager.addView(Z.d, b13);
                Z.f34276b.setVisibility(8);
                Z.f34275a.setScaleX(0.5f);
                Z.f34275a.setScaleY(0.5f);
                Z.f34275a.setAlpha(0.0f);
                Z.f34275a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                NotificationCenter.getInstance(Z.h).addObserver(Z, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().addObserver(Z, NotificationCenter.didEndCall);
            }
            h9 h9Var = Z.f34282s;
            if (h9Var.getTag() == null) {
                h9Var.animate().setListener(null).cancel();
                if (h9Var.getVisibility() != 0) {
                    h9Var.setVisibility(0);
                    h9Var.setAlpha(0.0f);
                    h9Var.setScaleX(0.5f);
                    h9Var.setScaleY(0.5f);
                }
                h9Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                h9Var.setTag(1);
                return;
            }
            return;
        }
        w20 w20Var2 = Z;
        if (w20Var2 != null) {
            w20Var2.e(false);
            w20 w20Var3 = Z;
            WindowManager windowManager2 = w20Var3.f34280n;
            t20 t20Var = w20Var3.f34275a;
            t20Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new p20(t20Var, w20Var3.f34276b, w20Var3.d, windowManager2, w20Var3.f34278e)).start();
            Z.d();
            Z = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    public final void a() {
        boolean z10;
        if (!this.T && !this.f34283w) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.U != z10) {
            this.U = z10;
            t20 t20Var = this.f34275a;
            if (z10) {
                t20Var.animate().alpha(1.0f).start();
            } else {
                t20Var.animate().alpha(0.7f).start();
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
        if (z10 != this.f34283w) {
            this.f34283w = z10;
            org.telegram.ui.s7 s7Var = this.f34278e;
            s7Var.animate().setListener(null).cancel();
            boolean z11 = this.f34283w;
            a30 a30Var = this.f34279f;
            if (z11) {
                if (s7Var.getVisibility() != 0) {
                    s7Var.setVisibility(0);
                    s7Var.setAlpha(0.0f);
                    a30Var.setScaleX(0.7f);
                    a30Var.setScaleY(0.7f);
                }
                s7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.z9(this, 2));
                s7Var.animate().alpha(1.0f).setDuration(150L).start();
                a30Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                a30Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                s7Var.animate().alpha(0.0f).setDuration(150L).setListener(new q20(this, 1)).start();
            }
        }
        a();
    }

    public final void f(boolean z10) {
        if (this.f34284x != z10) {
            this.f34284x = z10;
            AnimatorSet animatorSet = this.V;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.V.cancel();
            }
            cg.i0 i0Var = this.f34277c;
            if (z10) {
                bg.x2 x2Var = this.f34276b;
                if (x2Var.getVisibility() != 0) {
                    x2Var.setVisibility(0);
                    i0Var.setAlpha(0.0f);
                    i0Var.setScaleX(0.5f);
                    i0Var.setScaleY(0.5f);
                    this.v.K(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i0Var, View.ALPHA, i0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_X, i0Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_Y, i0Var.getScaleY(), 1.0f));
                this.V.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.V = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, View.ALPHA, i0Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(i0Var, View.SCALE_X, i0Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(i0Var, View.SCALE_Y, i0Var.getScaleY(), 0.5f));
            this.V.addListener(new q20(this, 0));
            this.V.setDuration(150L);
            this.V.start();
        }
    }

    public final void g(boolean z10) {
        ChatObject.Call call;
        h9 h9Var = this.f34282s;
        g9 g9Var = h9Var.f29141a;
        if (g9Var.f28827f == null) {
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
                            h9Var.b(i10, groupCallParticipant, i11);
                        }
                        i12++;
                    } else {
                        h9Var.b(i10, null, i11);
                    }
                    i10++;
                    i12++;
                }
                h9Var.b(2, null, i11);
                h9Var.a(z10);
                return;
            }
            while (i10 < 3) {
                h9Var.b(i10, null, i11);
                i10++;
            }
            h9Var.a(z10);
            return;
        }
        g9Var.f28828g = true;
    }

    public final void h() {
        int i10 = AndroidUtilities.displaySize.x;
        t20 t20Var = this.f34275a;
        float min = Math.min(Math.max(this.f34281r.x, -AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f) + (i10 - t20Var.getMeasuredWidth()));
        h9 h9Var = this.f34282s;
        if (min < 0.0f) {
            h9Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i10 - t20Var.getMeasuredWidth()) {
            h9Var.setTranslationX((-Math.abs(min - (i10 - t20Var.getMeasuredWidth()))) / 3.0f);
        } else {
            h9Var.setTranslationX(0.0f);
        }
    }

    public final void i() {
        float f9 = this.J - this.M;
        bg.x2 x2Var = this.f34276b;
        float measuredWidth = (x2Var.getMeasuredWidth() / 2.0f) + f9;
        t20 t20Var = this.f34275a;
        float measuredWidth2 = measuredWidth - (t20Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((x2Var.getMeasuredHeight() / 2.0f) + (this.I - this.N)) - (t20Var.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.f34281r;
        float f10 = this.K;
        float f11 = this.X;
        float f12 = 1.0f - f11;
        layoutParams.x = (int) ((measuredWidth2 * f11) + (f10 * f12));
        layoutParams.y = (int) ((measuredHeight * f11) + (f12 * this.L));
        h();
        if (t20Var.getParent() != null) {
            this.f34280n.updateViewLayout(t20Var, this.f34281r);
        }
    }
}
