package org.telegram.ui;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l30 implements View.OnClickListener {
    public final z5 f35901a = new z5(this, 5);
    public final c60 f35902b;

    public l30(c60 c60Var) {
        this.f35902b = c60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.k40 k40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        c60 c60Var = this.f35902b;
        j30 j30Var = c60Var.f33193x;
        ArrayList arrayList = c60Var.f33150n0;
        org.telegram.ui.Components.voip.v2 v2Var = c60Var.f33188w;
        org.telegram.ui.Components.gj0 gj0Var = c60Var.H0;
        AccountInstance accountInstance = c60Var.d;
        if (c60Var.X0 != null && c60Var.C1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (c60Var.r1() && !c60Var.X0.isScheduled()) {
                v30 v30Var = c60Var.X1;
                if (v30Var != null && v30Var.f29713b && (AndroidUtilities.isTablet() || c60.C3 == c60Var.q1())) {
                    c60Var.e1(null);
                    if (c60.C3) {
                        AndroidUtilities.runOnUIThread(new c10(this, 5), 200L);
                    }
                    c60Var.f33119f0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        c60Var.e1(videoParticipant);
                        return;
                    }
                    if (c60.C3 == c60Var.q1()) {
                        c60Var.e1(videoParticipant);
                    }
                    if (c60Var.q1()) {
                        c60Var.f33119f0.setRequestedOrientation(6);
                        return;
                    } else {
                        c60Var.f33119f0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = c60Var.C1;
            if (i13 == 5) {
                if (!c60Var.E1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c60Var.E1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = c60Var.X0.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final l30 f35556b;

                        {
                            this.f35556b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    l30 l30Var = this.f35556b;
                                    if (tLObject != null) {
                                        l30Var.f35902b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        l30Var.getClass();
                                        return;
                                    }
                                default:
                                    l30 l30Var2 = this.f35556b;
                                    if (tLObject != null) {
                                        l30Var2.f35902b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        l30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = c60Var.Q1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = c60Var.C1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = c60Var.f33119f0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.ge0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new gg.h(4));
                                    return;
                                }
                                c60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                v2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            c60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            v2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!c60Var.o1() && !c60Var.I0) {
                        c60Var.I0 = true;
                        AndroidUtilities.shakeView(v2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (nextInt >= 32) {
                            i12 = 240;
                            if (nextInt < 64) {
                                i15 = 240;
                                i12 = 120;
                            } else {
                                i15 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt == 98) {
                                        i15 = 540;
                                        i12 = 420;
                                    } else {
                                        i15 = 720;
                                    }
                                }
                            }
                        }
                        gj0Var.N(i15);
                        gj0Var.P(i15 - 1, this.f35901a);
                        j30Var.setAnimation(gj0Var);
                        gj0Var.K(i12);
                        j30Var.d();
                        if (c60Var.C1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) c60Var.X0.participants.f(MessageObject.getPeerId(c60Var.f33194x0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            c60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (k40Var = c60Var.f33139k0) != null) {
                    k40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = c60Var.X0.getInputGroupCall();
                TLRPC.GroupCall groupCall = c60Var.X0.call;
                boolean z4 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z4;
                togglegroupcallstartsubscription.subscribed = z4;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final l30 f35556b;

                    {
                        this.f35556b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                l30 l30Var = this.f35556b;
                                if (tLObject != null) {
                                    l30Var.f35902b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l30Var.getClass();
                                    return;
                                }
                            default:
                                l30 l30Var2 = this.f35556b;
                                if (tLObject != null) {
                                    l30Var2.f35902b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (c60Var.X0.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                c60Var.J1(i11, true);
            }
        }
    }
}
