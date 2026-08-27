package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

public final class t20 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int A;
    public final ri0 B;
    public final oi0 C;
    public long D;
    public final boolean E;
    public final Random F;
    public boolean G;
    public final s20[] H;
    public boolean I;
    public float J;
    public float K;
    public final OvershootInterpolator L;
    public float M;

    public final Paint f32632a;

    public final s9 f32633b;

    public final s9 f32634c;
    public float d;

    public float f32635e;

    public float f32636f;
    public s20 h;

    public s20 f32637n;

    public float f32638r;

    public boolean f32639s;
    public float v;

    public final LinearGradient f32640w;

    public final Matrix f32641x;

    public float f32642y;

    public t20(int i10, Context context, boolean z10) {
        super(context);
        this.f32632a = new Paint(1);
        this.f32633b = new s9(8);
        this.f32634c = new s9(9);
        this.f32638r = 1.0f;
        this.f32641x = new Matrix();
        this.f32642y = 0.0f;
        this.F = new Random();
        this.H = new s20[4];
        this.L = new OvershootInterpolator();
        this.E = z10;
        this.A = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.H[i11] = new s20(i11);
        }
        this.f32633b.f32357b = AndroidUtilities.dp(37.0f);
        this.f32633b.f32356a = AndroidUtilities.dp(32.0f);
        this.f32634c.f32357b = AndroidUtilities.dp(37.0f);
        this.f32634c.f32356a = AndroidUtilities.dp(32.0f);
        this.f32633b.b();
        this.f32634c.b();
        oi0 oi0Var = new oi0(R.raw.voice_outlined, "" + R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.C = oi0Var;
        setWillNotDraw(false);
        ri0 ri0Var = new ri0(context);
        this.B = ri0Var;
        ri0Var.setAnimation(oi0Var);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var);
        this.f32640w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float fMin = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f32635e = fMin;
        this.f32636f = (fMin - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (callState == 1 || callState == 2 || callState == 6 || callState == 5) {
            setState(2);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
            setState(sharedInstance.isMicMute() ? 1 : 0);
            return;
        }
        if (!sharedInstance.isMicMute()) {
            sharedInstance.setMicMute(true, false, false);
        }
        setState(3);
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        if (getParent() != null) {
            ((View) getParent()).dispatchTouchEvent(motionEventObtain);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            return;
        }
        setAmplitude(0.0d);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.A).addObserver(this, NotificationCenter.groupCallUpdated);
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i10 = z10 ? 13 : 24;
        oi0 oi0Var = this.C;
        oi0Var.N(i10);
        oi0Var.L(oi0Var.f31314f - 1, false, true);
        a();
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i10 = z10 ? 13 : 24;
        oi0 oi0Var = this.C;
        if (oi0Var.N(i10)) {
            if (z10) {
                oi0Var.K(0);
            } else {
                oi0Var.K(12);
            }
        }
        this.B.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E) {
            return;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.groupCallUpdated);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i10 = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z10 = this.I;
        if (z10) {
            float f18 = this.J;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.J = f19;
                if (f19 > 1.0f) {
                    this.J = 1.0f;
                }
            } else if (!z10) {
                f10 = this.J;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    this.J = f11;
                    if (f11 < 0.0f) {
                        this.J = 0.0f;
                    }
                }
            }
        } else if (!z10) {
            f10 = this.J;
            if (f10 != 0.0f) {
                f11 = f10 - 0.10666667f;
                this.J = f11;
                if (f11 < 0.0f) {
                    this.J = 0.0f;
                }
            }
        }
        float interpolation = er.f28122f.getInterpolation(this.J) * 0.1f;
        float f20 = interpolation + 1.0f;
        ri0 ri0Var = this.B;
        ri0Var.setScaleY(f20);
        ri0Var.setScaleX(f20);
        boolean z11 = this.E;
        if (z11) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.D > 1000) {
                this.D = jCurrentTimeMillis;
                float fD = a9.p.d(org.telegram.ui.Cells.pa.f(this.F, 100), 0.5f, 100.0f, 0.5f);
                this.f32635e = fD;
                this.f32636f = (fD - this.d) / 595.0f;
            }
        }
        float f21 = this.f32635e;
        float f22 = this.d;
        if (f21 != f22) {
            float f23 = this.f32636f;
            float f24 = (16.0f * f23) + f22;
            this.d = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    this.d = f21;
                }
            } else if (f24 < f21) {
                this.d = f21;
            }
        }
        ?? r12 = 0;
        if (this.f32637n != null) {
            float f25 = this.f32638r + 0.064f;
            this.f32638r = f25;
            if (f25 > 1.0f) {
                this.f32638r = 1.0f;
                this.f32637n = null;
            }
        }
        boolean z12 = this.f32639s;
        if (z12) {
            float f26 = this.v;
            if (f26 != 1.0f) {
                float f27 = f26 + 0.045714285f;
                this.v = f27;
                if (f27 > 1.0f) {
                    this.v = 1.0f;
                }
                if (this.G) {
                    invalidate();
                }
            } else if (!z12) {
                f12 = this.v;
                if (f12 != 0.0f) {
                    f13 = f12 - 0.045714285f;
                    this.v = f13;
                    if (f13 < 0.0f) {
                        this.v = 0.0f;
                    }
                }
            }
        } else if (!z12) {
            f12 = this.v;
            if (f12 != 0.0f) {
                f13 = f12 - 0.045714285f;
                this.v = f13;
                if (f13 < 0.0f) {
                    this.v = 0.0f;
                }
            }
        }
        int i11 = this.h.f32318i;
        int i12 = 3;
        int i13 = 2;
        boolean z13 = (i11 == 3 || i11 == 2) ? false : true;
        if (z13) {
            float f28 = this.f32642y;
            if (f28 != 1.0f) {
                float f29 = f28 + 0.045714285f;
                this.f32642y = f29;
                if (f29 > 1.0f) {
                    this.f32642y = 1.0f;
                }
            } else if (!z13) {
                f14 = this.f32642y;
                if (f14 != 0.0f) {
                    f15 = f14 - 0.045714285f;
                    this.f32642y = f15;
                    if (f15 < 0.0f) {
                        this.f32642y = 0.0f;
                    }
                }
            }
        } else if (!z13) {
            f14 = this.f32642y;
            if (f14 != 0.0f) {
                f15 = f14 - 0.045714285f;
                this.f32642y = f15;
                if (f15 < 0.0f) {
                    this.f32642y = 0.0f;
                }
            }
        }
        float interpolation2 = (this.L.getInterpolation(this.f32642y) * 0.35f) + 0.65f;
        float f30 = this.d;
        float f31 = z11 ? 0.1f : 0.8f;
        float f32 = 1.0f;
        float f33 = 0.0f;
        s9 s9Var = this.f32633b;
        s9Var.e(f30, f31);
        float f34 = this.d;
        float f35 = z11 ? 0.1f : 0.8f;
        s9 s9Var2 = this.f32634c;
        s9Var2.e(f34, f35);
        int i14 = 0;
        while (i14 < i12) {
            if (i14 != 0 || this.f32637n != null) {
                Paint paint = this.f32632a;
                if (i14 == 0) {
                    if (this.v != f32) {
                        f16 = f32 - this.f32638r;
                        this.f32637n.a(this.d);
                        s20 s20Var = this.f32637n;
                        if (s20Var.f32318i == i13) {
                            paint.setShader(r12);
                            paint.setColor(org.telegram.ui.ActionBar.g6.w0(r12, org.telegram.ui.ActionBar.g6.f23028bh, false));
                        } else {
                            paint.setShader(s20Var.f32317g);
                        }
                        s9Var.f32357b = AndroidUtilities.dp(40.0f);
                        s9Var.f32356a = AndroidUtilities.dp(32.0f);
                        s9Var2.f32357b = AndroidUtilities.dp(38.0f);
                        s9Var2.f32356a = AndroidUtilities.dp(33.0f);
                        if (i14 != i13) {
                            f17 = 32.0f;
                            paint.setAlpha((int) ((f32 - this.v) * 76.0f * f16));
                        } else {
                            f17 = 32.0f;
                            paint.setAlpha((int) (76.0f * f16 * this.v));
                        }
                        if (this.f32642y != 0.0f) {
                            float fMin = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin, fMin, measuredWidth, measuredHeight);
                            s9Var.a(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                            float fMin2 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin2, fMin2, measuredWidth, measuredHeight);
                            s9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                        }
                        i13 = 2;
                        if (i14 == 2) {
                            paint.setAlpha((int) (this.v * 255.0f));
                        } else if (i14 == 1) {
                            paint.setAlpha((int) (f16 * 255.0f));
                        } else {
                            paint.setAlpha(255);
                        }
                        canvas.save();
                        canvas.scale(f20, f20, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f17), paint);
                        canvas.restore();
                    }
                } else if (i14 == i10) {
                    s20 s20Var2 = this.h;
                    if (s20Var2 == null) {
                        return;
                    }
                    if (this.v != f32) {
                        f16 = this.f32637n != null ? this.f32638r : 1.0f;
                        s20Var2.a(this.d);
                        s20 s20Var3 = this.h;
                        if (s20Var3.f32318i == i13) {
                            paint.setShader(r12);
                            paint.setColor(org.telegram.ui.ActionBar.g6.w0(r12, org.telegram.ui.ActionBar.g6.f23028bh, false));
                        } else {
                            paint.setShader(s20Var3.f32317g);
                        }
                        s9Var.f32357b = AndroidUtilities.dp(40.0f);
                        s9Var.f32356a = AndroidUtilities.dp(32.0f);
                        s9Var2.f32357b = AndroidUtilities.dp(38.0f);
                        s9Var2.f32356a = AndroidUtilities.dp(33.0f);
                        if (i14 != i13) {
                            f17 = 32.0f;
                            paint.setAlpha((int) ((f32 - this.v) * 76.0f * f16));
                        } else {
                            f17 = 32.0f;
                            paint.setAlpha((int) (76.0f * f16 * this.v));
                        }
                        if (this.f32642y != 0.0f) {
                            float fMin3 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin3, fMin3, measuredWidth, measuredHeight);
                            s9Var.a(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                            float fMin4 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin4, fMin4, measuredWidth, measuredHeight);
                            s9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                        }
                        i13 = 2;
                        if (i14 == 2) {
                            paint.setAlpha((int) (this.v * 255.0f));
                        } else if (i14 == 1) {
                            paint.setAlpha((int) (f16 * 255.0f));
                        } else {
                            paint.setAlpha(255);
                        }
                        canvas.save();
                        canvas.scale(f20, f20, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f17), paint);
                        canvas.restore();
                    }
                } else if (this.v != f33) {
                    paint.setColor(-65536);
                    Matrix matrix = this.f32641x;
                    matrix.reset();
                    matrix.postTranslate((f32 - this.v) * (-AndroidUtilities.dp(250.0f)), 0.0f);
                    matrix.postRotate(this.M, measuredWidth, measuredHeight);
                    LinearGradient linearGradient = this.f32640w;
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                    f16 = 1.0f;
                    s9Var.f32357b = AndroidUtilities.dp(40.0f);
                    s9Var.f32356a = AndroidUtilities.dp(32.0f);
                    s9Var2.f32357b = AndroidUtilities.dp(38.0f);
                    s9Var2.f32356a = AndroidUtilities.dp(33.0f);
                    if (i14 != i13) {
                        f17 = 32.0f;
                        paint.setAlpha((int) ((f32 - this.v) * 76.0f * f16));
                    } else {
                        f17 = 32.0f;
                        paint.setAlpha((int) (76.0f * f16 * this.v));
                    }
                    if (this.f32642y != 0.0f) {
                        float fMin5 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.3f, 1.0f, interpolation), 1.3f) * interpolation2;
                        canvas.save();
                        canvas.scale(fMin5, fMin5, measuredWidth, measuredHeight);
                        s9Var.a(measuredWidth, measuredHeight, canvas, paint);
                        canvas.restore();
                        float fMin6 = Math.min((1.0f - this.K) * com.google.android.recaptcha.internal.a.d(this.d, 0.26f, 1.0f, interpolation), 1.3f) * interpolation2;
                        canvas.save();
                        canvas.scale(fMin6, fMin6, measuredWidth, measuredHeight);
                        s9Var2.a(measuredWidth, measuredHeight, canvas, paint);
                        canvas.restore();
                    }
                    i13 = 2;
                    if (i14 == 2) {
                        paint.setAlpha((int) (this.v * 255.0f));
                    } else if (i14 == 1) {
                        paint.setAlpha((int) (f16 * 255.0f));
                    } else {
                        paint.setAlpha(255);
                    }
                    canvas.save();
                    canvas.scale(f20, f20, measuredWidth, measuredHeight);
                    canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f17), paint);
                    canvas.restore();
                }
            }
            i14++;
            i10 = 1;
            r12 = 0;
            i12 = 3;
            f32 = 1.0f;
            f33 = 0.0f;
        }
        if (this.G || this.f32642y <= 0.0f) {
            return;
        }
        invalidate();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n20 n20Var = n20.Z;
        if (n20Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(n20Var.f30827w ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.K = f10;
    }

    public void setPressedState(boolean z10) {
        this.I = z10;
    }

    public void setRemoveAngle(double d) {
        this.M = (float) d;
    }

    public void setState(int i10) {
        s20 s20Var = this.h;
        if (s20Var == null || s20Var.f32318i != i10) {
            this.f32637n = s20Var;
            s20 s20Var2 = this.H[i10];
            this.h = s20Var2;
            float f10 = 0.0f;
            if (s20Var != null) {
                this.f32638r = 0.0f;
            } else {
                this.f32638r = 1.0f;
                int i11 = s20Var2.f32318i;
                if (i11 != 3 && i11 != 2) {
                    f10 = 1.0f;
                }
                this.f32642y = f10;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i10 == 0) {
                string = org.telegram.messenger.y1.i(R.string.VoipTapToMute, s3.c.f(string, ", "));
            } else if (i10 == 2) {
                string = org.telegram.messenger.y1.i(R.string.Connecting, s3.c.f(string, ", "));
            } else if (i10 == 3) {
                string = org.telegram.messenger.y1.i(R.string.VoipMutedByAdmin, s3.c.f(string, ", "));
            }
            setContentDescription(string);
            invalidate();
        }
    }
}
