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
public final class f30 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float B;
    public float C;
    public TextView f24778a;
    public TextView f24779b;
    public org.telegram.ui.Components.voip.v2 f24780c;
    public org.telegram.ui.Components.voip.v2 d;
    public p9 e;
    public RectF f24781f;
    public Paint h;
    public LinearGradient f24782n;
    public int f24783r;
    public float f24784s;
    public float v;
    public boolean f24785w;
    public int f24786x;
    public boolean f24787y;

    public static void a(f30 f30Var, Context context) {
        boolean z4;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        Context context2 = f30Var.getContext();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z4 = false;
        } else {
            z4 = true;
        }
        sharedInstance.toggleSpeakerphoneOrShowRouteSheet(context2, z4);
    }

    public static void b(f30 f30Var, Context context) {
        boolean z4;
        Context context2 = f30Var.getContext();
        d30 d30Var = new d30(context, 0);
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z4 = false;
        } else {
            z4 = true;
        }
        org.telegram.ui.e60.t1(context2, d30Var, z4, false);
    }

    public final void c(float f10, float f11, int i10) {
        this.f24783r = i10;
        this.f24784s = f10;
        this.v = f11;
        invalidate();
        this.f24785w = true;
    }

    public final void d(boolean z4) {
        VoIPService sharedInstance;
        boolean z10;
        boolean z11;
        float f10;
        int i10;
        org.telegram.ui.Components.voip.v2 v2Var = this.d;
        org.telegram.ui.Components.voip.v2 v2Var2 = this.f24780c;
        if (v2Var2 != null && v2Var != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z10 = true;
            } else {
                z10 = false;
            }
            v2Var2.b(z10, z4);
            if (isBluetoothOn) {
                z11 = z4;
                v2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z11);
            } else {
                z11 = z4;
                if (z10) {
                    v2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    v2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z11);
                } else {
                    v2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                v2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z11);
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
                v2Var.c(i11, -1, k10, 0.1f, true, LocaleController.getString(i10), sharedInstance.isMicMute(), z11);
            }
            invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.f24787y) {
                this.f24787y = mutedByAdmin;
                invalidate();
            }
        }
    }

    public final void e() {
        String str;
        TextView textView = this.f24779b;
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
        int i10 = this.f24786x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.j6.f20098p8;
            long j11 = 0;
            if (chat != null) {
                j10 = chat.f19159id;
            } else {
                j10 = 0;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, iArr[z8.e(j10)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.j6.f20117q8;
            if (chat != null) {
                j11 = chat.f19159id;
            }
            z8Var.i(w02, org.telegram.ui.ActionBar.j6.w0(null, iArr2[z8.e(j11)], false));
            z8Var.k(i10, chat);
            if (chat != null) {
                this.e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", z8Var, null);
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
            this.f24778a.setText(str);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f24787y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f11 = 0.0f;
            if (this.f24787y) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.C = f10;
            this.B = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f24787y) ? 1.0f : 1.0f;
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
        NotificationCenter.getInstance(this.f24786x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f30.onDraw(android.graphics.Canvas):void");
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
