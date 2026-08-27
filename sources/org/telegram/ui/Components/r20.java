package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

public final class r20 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float A;
    public float B;

    public TextView f32052a;

    public TextView f32053b;

    public org.telegram.ui.Components.voip.u2 f32054c;
    public org.telegram.ui.Components.voip.u2 d;

    public n9 f32055e;

    public RectF f32056f;
    public Paint h;

    public LinearGradient f32057n;

    public int f32058r;

    public float f32059s;
    public float v;

    public boolean f32060w;

    public int f32061x;

    public boolean f32062y;

    public static void a(r20 r20Var, Context context) {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r20Var.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    public static void b(r20 r20Var, Context context) {
        org.telegram.ui.s50.t1(r20Var.getContext(), new p20(context, 0), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context), false);
    }

    public final void c(float f10, float f11, int i10) {
        this.f32058r = i10;
        this.f32059s = f10;
        this.v = f11;
        invalidate();
        this.f32060w = true;
    }

    public final void d(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        org.telegram.ui.Components.voip.u2 u2Var = this.d;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.f32054c;
        if (u2Var2 == null || u2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean zIsBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z12 = !zIsBluetoothOn && sharedInstance.isSpeakerphoneOn();
        u2Var2.b(z12, z10);
        if (zIsBluetoothOn) {
            z11 = z10;
            u2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z11);
        } else {
            z11 = z10;
            if (z12) {
                u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            } else if (sharedInstance.isHeadsetPlugged()) {
                u2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z11);
            } else {
                u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            u2Var.c(R.drawable.calls_unmute, -1, i0.b.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z11);
        } else {
            u2Var.c(R.drawable.calls_unmute, -1, i0.b.k(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, LocaleController.getString(sharedInstance.isMicMute() ? R.string.VoipUnmute : R.string.VoipMute), sharedInstance.isMicMute(), z11);
        }
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean zMutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() == null || (zMutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.f32062y) {
                return;
            }
            this.f32062y = zMutedByAdmin;
            invalidate();
        }
    }

    public final void e() {
        TextView textView = this.f32053b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            textView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.call;
            textView.setText(LocaleController.formatPluralString(groupCall.rtmp_stream ? "ViewersWatching" : "Participants", groupCall.participants_count, new Object[0]));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        String strTrim;
        ChatObject.Call call;
        int i10 = this.f32061x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            y8Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23270p8[y8.e(chat != null ? chat.f22380id : 0L)], false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23285q8[y8.e(chat != null ? chat.f22380id : 0L)], false));
            y8Var.k(i10, chat);
            if (chat != null) {
                this.f32055e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", y8Var, null);
            }
            if (!sharedInstance.isConference() || (call = sharedInstance.groupCall) == null) {
                strTrim = TextUtils.isEmpty(sharedInstance.groupCall.call.title) ? chat != null ? chat.title : "" : sharedInstance.groupCall.call.title;
            } else if (call.sortedParticipants.size() == 1) {
                strTrim = LocaleController.getString(R.string.ConferenceChat);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                }
                if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                    sb2.append(" ");
                    sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                }
                strTrim = sb2.toString();
            }
            if (strTrim != null) {
                strTrim = strTrim.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f32052a.setText(strTrim);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f32062y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.B = this.f32062y ? 1.0f : 0.0f;
            this.A = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f32062y) ? 1.0f : 0.0f;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
        d(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        d(true);
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
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.f32061x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float translationX;
        float measuredHeight;
        Paint paint = this.h;
        RectF rectF = this.f32056f;
        boolean z10 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f32062y;
        if (z10) {
            float f14 = this.A;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.10666667f;
                this.A = f15;
                if (f15 >= 1.0f) {
                    this.A = 1.0f;
                }
                this.f32060w = true;
                invalidate();
            } else if (!z10) {
                f10 = this.A;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    this.A = f11;
                    if (f11 < 0.0f) {
                        this.A = 0.0f;
                    }
                    this.f32060w = true;
                    invalidate();
                }
            }
        } else if (!z10) {
            f10 = this.A;
            if (f10 != 0.0f) {
                f11 = f10 - 0.10666667f;
                this.A = f11;
                if (f11 < 0.0f) {
                    this.A = 0.0f;
                }
                this.f32060w = true;
                invalidate();
            }
        }
        boolean z11 = this.f32062y;
        if (z11) {
            float f16 = this.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                this.B = f17;
                if (f17 >= 1.0f) {
                    this.B = 1.0f;
                }
                this.f32060w = true;
                invalidate();
            } else if (!z11) {
                f12 = this.B;
                if (f12 != 0.0f) {
                    f13 = f12 - 0.10666667f;
                    this.B = f13;
                    if (f13 < 0.0f) {
                        this.B = 0.0f;
                    }
                    this.f32060w = true;
                    invalidate();
                }
            }
        } else if (!z11) {
            f12 = this.B;
            if (f12 != 0.0f) {
                f13 = f12 - 0.10666667f;
                this.B = f13;
                if (f13 < 0.0f) {
                    this.B = 0.0f;
                }
                this.f32060w = true;
                invalidate();
            }
        }
        if (this.f32060w) {
            int iD = i0.b.d(1.0f - this.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23046ch, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23082eh, false));
            int iD2 = i0.b.d(1.0f - this.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23064dh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23100fh, false));
            int iD3 = i0.b.d(this.B, iD, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118gh, false));
            int iD4 = i0.b.d(this.B, iD2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23136hh, false));
            this.f32060w = false;
            int i10 = this.f32058r;
            if (i10 == 0) {
                this.f32057n = new LinearGradient(-AndroidUtilities.dp(60.0f), this.v - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{iD3, iD4}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                this.f32057n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(60.0f) + getMeasuredWidth(), this.v - getTranslationY(), new int[]{iD4, iD3}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 2) {
                this.f32057n = new LinearGradient(this.f32059s - getTranslationX(), -AndroidUtilities.dp(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{iD3, iD4}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.f32057n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.f32059s - getTranslationX(), AndroidUtilities.dp(60.0f) + getMeasuredHeight(), new int[]{iD4, iD3}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.f32057n);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        int i11 = this.f32058r;
        if (i11 == 0) {
            measuredHeight = this.v - getTranslationY();
            translationX = 0.0f;
        } else if (i11 == 1) {
            measuredHeight = this.v - getTranslationY();
            translationX = getMeasuredWidth();
        } else if (i11 == 2) {
            translationX = this.f32059s - getTranslationX();
            measuredHeight = 0.0f;
        } else {
            translationX = this.f32059s - getTranslationX();
            measuredHeight = getMeasuredHeight();
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        int i12 = this.f32058r;
        if (i12 == 0) {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.translate(AndroidUtilities.dp(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (i12 == 1) {
            canvas.clipRect(translationX, measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.translate(-AndroidUtilities.dp(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (i12 == 2) {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, AndroidUtilities.dp(3.0f));
        } else {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight, AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, -AndroidUtilities.dp(3.0f));
        }
        rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i11);
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
        e();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }
}
