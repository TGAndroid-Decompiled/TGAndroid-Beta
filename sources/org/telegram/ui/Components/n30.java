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
public final class n30 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float E;
    public float F;
    public TextView f25389a;
    public TextView f25390b;
    public org.telegram.ui.Components.voip.u2 f25391c;
    public org.telegram.ui.Components.voip.u2 d;
    public w9 e;
    public RectF f25392f;
    public Paint h;
    public LinearGradient f25393n;
    public int f25394r;
    public float f25395s;
    public float v;
    public boolean f25396w;
    public int f25397x;
    public boolean f25398y;

    public static void a(n30 n30Var, Context context) {
        boolean z10;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        Context context2 = n30Var.getContext();
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        sharedInstance.toggleSpeakerphoneOrShowRouteSheet(context2, z10);
    }

    public static void b(n30 n30Var, Context context) {
        boolean z10;
        Context context2 = n30Var.getContext();
        l30 l30Var = new l30(context, 0);
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.ui.j60.t1(context2, l30Var, z10, false);
    }

    public final void c(float f7, float f10, int i10) {
        this.f25394r = i10;
        this.f25395s = f7;
        this.v = f10;
        invalidate();
        this.f25396w = true;
    }

    public final void d(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        org.telegram.ui.Components.voip.u2 u2Var = this.d;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.f25391c;
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
                u2Var.c(i11, -1, k10, 0.1f, true, LocaleController.getString(i10), sharedInstance.isMicMute(), z12);
            }
            invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.f25398y) {
                this.f25398y = mutedByAdmin;
                invalidate();
            }
        }
    }

    public final void e() {
        String str;
        TextView textView = this.f25390b;
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
        long j3;
        String str;
        float f7;
        ChatObject.Call call;
        int i10 = this.f25397x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = org.telegram.ui.ActionBar.j6.f18145p8;
            long j10 = 0;
            if (chat != null) {
                j3 = chat.f17195id;
            } else {
                j3 = 0;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, iArr[g9.e(j3)], false);
            int[] iArr2 = org.telegram.ui.ActionBar.j6.f18163q8;
            if (chat != null) {
                j10 = chat.f17195id;
            }
            g9Var.i(w02, org.telegram.ui.ActionBar.j6.w0(null, iArr2[g9.e(j10)], false));
            g9Var.k(i10, chat);
            if (chat != null) {
                this.e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", g9Var, null);
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
            this.f25389a.setText(str);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.f25398y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f10 = 0.0f;
            if (this.f25398y) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.F = f7;
            this.E = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.f25398y) ? 1.0f : 1.0f;
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
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.x0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.f25397x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i11);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        e();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }
}
