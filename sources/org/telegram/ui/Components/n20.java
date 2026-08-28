package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
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
public final class n20 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float A;
    public float B;
    public TextView f30995a;
    public TextView f30996b;
    public org.telegram.ui.Components.voip.u2 f30997c;
    public org.telegram.ui.Components.voip.u2 d;
    public o9 f30998e;
    public RectF f30999f;
    public Paint h;
    public LinearGradient f31000n;
    public int f31001r;
    public float f31002s;
    public float v;
    public boolean f31003w;
    public int f31004x;
    public boolean f31005y;

    public static void a(n20 n20Var, Context context) {
        boolean z10;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        Context context2 = n20Var.getContext();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        sharedInstance.toggleSpeakerphoneOrShowRouteSheet(context2, z10);
    }

    public static void b(n20 n20Var, Context context) {
        boolean z10;
        Context context2 = n20Var.getContext();
        l20 l20Var = new l20(context, 0);
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.ui.o50.t1(context2, l20Var, z10, false);
    }

    public final void c(float f10, float f11, int i9) {
        this.f31001r = i9;
        this.f31002s = f10;
        this.v = f11;
        invalidate();
        this.f31003w = true;
    }

    public final void d(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f10;
        int i9;
        org.telegram.ui.Components.voip.u2 u2Var = this.d;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.f30997c;
        if (u2Var2 != null && u2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z11 = true;
            } else {
                z11 = false;
            }
            u2Var2.b(z11, z10);
            if (isBluetoothOn) {
                z12 = z10;
                u2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z12);
            } else {
                z12 = z10;
                if (z11) {
                    u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z12);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    u2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z12);
                } else {
                    u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z12);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                u2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z12);
            } else {
                int i10 = R.drawable.calls_unmute;
                if (sharedInstance.isMicMute()) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.15f;
                }
                int k10 = i0.a.k(-1, (int) (f10 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i9 = R.string.VoipUnmute;
                } else {
                    i9 = R.string.VoipMute;
                }
                u2Var.c(i10, -1, k10, 0.1f, true, LocaleController.getString(i9), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i9 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.f31005y) {
                this.f31005y = mutedByAdmin;
                invalidate();
            }
        }
    }

    public final void e() {
        String str;
        TextView textView = this.f30996b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.call;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(LocaleController.formatPluralString(str, groupCall.participants_count, new Object[0]));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j10;
        String str;
        float f10;
        ChatObject.Call call;
        int i9 = this.f31004x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.f6.f23213p8;
            long j11 = 0;
            if (chat != null) {
                j10 = chat.f22380id;
            } else {
                j10 = 0;
            }
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, iArr[z8.e(j10)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.f6.f23231q8;
            if (chat != null) {
                j11 = chat.f22380id;
            }
            z8Var.i(w02, org.telegram.ui.ActionBar.f6.w0(null, iArr2[z8.e(j11)], false));
            z8Var.k(i9, chat);
            if (chat != null) {
                this.f30998e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", z8Var, null);
            }
            if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                if (call.sortedParticipants.size() == 1) {
                    str = LocaleController.getString(R.string.ConferenceChat);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i10).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb2.append(" ");
                        sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    str = sb2.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                str = sharedInstance.groupCall.call.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.f30995a.setText(str);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f31005y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f11 = 0.0f;
            if (this.f31005y) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.B = f10;
            this.A = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f31005y) ? 1.0f : 1.0f;
        }
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupCallUpdated);
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
        NotificationCenter.getInstance(this.f31004x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i10);
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override
    public final void onStateChanged(int i9) {
        e();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }
}
