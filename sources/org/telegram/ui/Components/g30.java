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
public final class g30 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float B;
    public float C;
    public TextView f27075a;
    public TextView f27076b;
    public org.telegram.ui.Components.voip.w2 f27077c;
    public org.telegram.ui.Components.voip.w2 d;
    public p9 f27078e;
    public RectF f27079f;
    public Paint h;
    public LinearGradient f27080n;
    public int f27081r;
    public float f27082s;
    public float v;
    public boolean f27083w;
    public int f27084x;
    public boolean f27085y;

    public static void a(g30 g30Var, Context context) {
        boolean z4;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        Context context2 = g30Var.getContext();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z4 = false;
        } else {
            z4 = true;
        }
        sharedInstance.toggleSpeakerphoneOrShowRouteSheet(context2, z4);
    }

    public static void b(g30 g30Var, Context context) {
        boolean z4;
        Context context2 = g30Var.getContext();
        e30 e30Var = new e30(context, 0);
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z4 = false;
        } else {
            z4 = true;
        }
        org.telegram.ui.d60.t1(context2, e30Var, z4, false);
    }

    public final void c(float f10, float f11, int i10) {
        this.f27081r = i10;
        this.f27082s = f10;
        this.v = f11;
        invalidate();
        this.f27083w = true;
    }

    public final void d(boolean z4) {
        VoIPService sharedInstance;
        boolean z10;
        boolean z11;
        float f10;
        int i10;
        org.telegram.ui.Components.voip.w2 w2Var = this.d;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.f27077c;
        if (w2Var2 != null && w2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z10 = true;
            } else {
                z10 = false;
            }
            w2Var2.b(z10, z4);
            if (isBluetoothOn) {
                z11 = z4;
                w2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z11);
            } else {
                z11 = z4;
                if (z10) {
                    w2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    w2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z11);
                } else {
                    w2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                w2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z11);
            } else {
                int i11 = R.drawable.calls_unmute;
                if (sharedInstance.isMicMute()) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.15f;
                }
                int k10 = i0.a.k(-1, (int) (f10 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i10 = R.string.VoipUnmute;
                } else {
                    i10 = R.string.VoipMute;
                }
                w2Var.c(i11, -1, k10, 0.1f, true, LocaleController.getString(i10), sharedInstance.isMicMute(), z11);
            }
            invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.f27085y) {
                this.f27085y = mutedByAdmin;
                invalidate();
            }
        }
    }

    public final void e() {
        String str;
        TextView textView = this.f27076b;
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
        int i10 = this.f27084x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.k6.f21879p8;
            long j11 = 0;
            if (chat != null) {
                j10 = chat.f20845id;
            } else {
                j10 = 0;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, iArr[z8.e(j10)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.k6.f21898q8;
            if (chat != null) {
                j11 = chat.f20845id;
            }
            z8Var.i(w02, org.telegram.ui.ActionBar.k6.w0(null, iArr2[z8.e(j11)], false));
            z8Var.k(i10, chat);
            if (chat != null) {
                this.f27078e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", z8Var, null);
            }
            if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                if (call.sortedParticipants.size() == 1) {
                    str = LocaleController.getString(R.string.ConferenceChat);
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    str = sb.toString();
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
            this.f27075a.setText(str);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f27085y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f11 = 0.0f;
            if (this.f27085y) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.C = f10;
            this.B = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f27085y) ? 1.0f : 1.0f;
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
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        org.telegram.messenger.voip.v0.c(this, z4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.f27084x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i11);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        e();
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }
}
