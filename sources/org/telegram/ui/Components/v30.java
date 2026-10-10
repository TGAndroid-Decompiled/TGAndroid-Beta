package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
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
public final class v30 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float E;
    public float F;
    public TextView f31716a;
    public TextView f31717b;
    public org.telegram.ui.Components.voip.v2 f31718c;
    public org.telegram.ui.Components.voip.v2 d;
    public y9 f31719e;
    public RectF f31720f;
    public Paint h;
    public LinearGradient f31721n;
    public int f31722r;
    public float f31723s;
    public float v;
    public boolean f31724w;
    public int f31725x;
    public boolean f31726y;

    public final void a(float f7, float f10, int i10) {
        this.f31722r = i10;
        this.f31723s = f7;
        this.v = f10;
        invalidate();
        this.f31724w = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        org.telegram.ui.Components.voip.v2 v2Var = this.d;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.f31718c;
        if (v2Var2 != null && v2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z11 = true;
            } else {
                z11 = false;
            }
            v2Var2.b(z11, z10);
            if (isBluetoothOn) {
                z12 = z10;
                v2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z12);
            } else {
                z12 = z10;
                if (z11) {
                    v2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z12);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    v2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z12);
                } else {
                    v2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z12);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                v2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z12);
            } else {
                int i11 = R.drawable.calls_unmute;
                if (sharedInstance.isMicMute()) {
                    f7 = 0.3f;
                } else {
                    f7 = 0.15f;
                }
                int k10 = i0.a.k(-1, (int) (f7 * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i10 = R.string.VoipUnmute;
                } else {
                    i10 = R.string.VoipMute;
                }
                v2Var.c(i11, -1, k10, 0.1f, true, LocaleController.getString(i10), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.f31717b;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.f31726y) {
                this.f31726y = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j3;
        String str;
        float f7;
        ChatObject.Call call;
        int i10 = this.f31725x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.i6.f21023p8;
            long j10 = 0;
            if (chat != null) {
                j3 = chat.f20042id;
            } else {
                j3 = 0;
            }
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, iArr[j9.e(j3)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.i6.f21042q8;
            if (chat != null) {
                j10 = chat.f20042id;
            }
            j9Var.i(x02, org.telegram.ui.ActionBar.i6.x0(null, iArr2[j9.e(j10)], false));
            j9Var.k(i10, chat);
            if (chat != null) {
                this.f31719e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", j9Var, null);
            }
            if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                if (call.sortedParticipants.size() == 1) {
                    str = LocaleController.getString(R.string.ConferenceChat);
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
            this.f31716a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f31726y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f10 = 0.0f;
            if (this.f31726y) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.F = f7;
            this.E = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f31726y) ? 1.0f : 1.0f;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
        b(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.w0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.f31725x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i11);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.w0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.w0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.w0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        c();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.w0.h(this, z10);
    }
}
