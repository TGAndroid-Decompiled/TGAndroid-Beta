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
public final class n30 implements View.OnClickListener {
    public final b6 f36331a = new b6(this, 5);
    public final e60 f36332b;

    public n30(e60 e60Var) {
        this.f36332b = e60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.l40 l40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        e60 e60Var = this.f36332b;
        l30 l30Var = e60Var.f33712x;
        ArrayList arrayList = e60Var.f33669n0;
        org.telegram.ui.Components.voip.v2 v2Var = e60Var.f33707w;
        org.telegram.ui.Components.gj0 gj0Var = e60Var.H0;
        AccountInstance accountInstance = e60Var.d;
        if (e60Var.X0 != null && e60Var.C1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (e60Var.r1() && !e60Var.X0.isScheduled()) {
                x30 x30Var = e60Var.X1;
                if (x30Var != null && x30Var.f29685b && (AndroidUtilities.isTablet() || e60.C3 == e60Var.q1())) {
                    e60Var.e1(null);
                    if (e60.C3) {
                        AndroidUtilities.runOnUIThread(new d10(this, 5), 200L);
                    }
                    e60Var.f33638f0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        e60Var.e1(videoParticipant);
                        return;
                    }
                    if (e60.C3 == e60Var.q1()) {
                        e60Var.e1(videoParticipant);
                    }
                    if (e60Var.q1()) {
                        e60Var.f33638f0.setRequestedOrientation(6);
                        return;
                    } else {
                        e60Var.f33638f0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = e60Var.C1;
            if (i13 == 5) {
                if (!e60Var.E1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e60Var.E1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = e60Var.X0.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final n30 f35970b;

                        {
                            this.f35970b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    n30 n30Var = this.f35970b;
                                    if (tLObject != null) {
                                        n30Var.f36332b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n30Var.getClass();
                                        return;
                                    }
                                default:
                                    n30 n30Var2 = this.f35970b;
                                    if (tLObject != null) {
                                        n30Var2.f36332b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = e60Var.Q1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = e60Var.C1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = e60Var.f33638f0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.he0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new gg.h(4));
                                    return;
                                }
                                e60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                v2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            e60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            v2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!e60Var.o1() && !e60Var.I0) {
                        e60Var.I0 = true;
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
                        gj0Var.P(i15 - 1, this.f36331a);
                        l30Var.setAnimation(gj0Var);
                        gj0Var.K(i12);
                        l30Var.d();
                        if (e60Var.C1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) e60Var.X0.participants.f(MessageObject.getPeerId(e60Var.f33713x0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            e60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (l40Var = e60Var.f33658k0) != null) {
                    l40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = e60Var.X0.getInputGroupCall();
                TLRPC.GroupCall groupCall = e60Var.X0.call;
                boolean z4 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z4;
                togglegroupcallstartsubscription.subscribed = z4;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final n30 f35970b;

                    {
                        this.f35970b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                n30 n30Var = this.f35970b;
                                if (tLObject != null) {
                                    n30Var.f36332b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n30Var.getClass();
                                    return;
                                }
                            default:
                                n30 n30Var2 = this.f35970b;
                                if (tLObject != null) {
                                    n30Var2.f36332b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (e60Var.X0.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                e60Var.J1(i11, true);
            }
        }
    }
}
