package org.telegram.ui.Components.voip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
import org.telegram.ui.oe;
public abstract class g {
    public static boolean f39214a;

    public static void a(int i7, List list, boolean z9) {
        boolean z10;
        r3 r3Var;
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z11;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && i7 > 0) {
            ArrayList arrayList = new ArrayList(3);
            int i12 = 0;
            if (z9 && sharedInstance.mutedByAdmin()) {
                r3 r3Var2 = sharedInstance.groupCall;
                if (r3Var2 != null) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var2.d.f(sharedInstance.getSelfId());
                } else {
                    groupCallParticipant = null;
                }
                if (groupCallParticipant != null && groupCallParticipant.raise_hand_rating != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = 2131743397;
                } else {
                    i11 = 2131743293;
                }
                arrayList.add(new f(new ti.l(1, 2131232427, id.M0(i11, null), !z11), 100, 0));
            } else if (sharedInstance.isMicMute()) {
                arrayList.add(new f(new ti.l(1, 2131232427, id.M0(2131743233, null), true), 100, 0));
            } else {
                arrayList.add(new f(new ti.l(1, 2131232431, id.M0(2131743296, null), true), 100, 0));
            }
            int videoState = sharedInstance.getVideoState(false);
            if (videoState == 2) {
                arrayList.add(new f(new ti.l(2, 2131232541, id.M0(2131743240, null), true), 90, 1));
            } else if (f39214a || videoState == 1) {
                String M0 = id.M0(2131743241, null);
                if (org.telegram.messenger.t0.f25566b.checkSelfPermission("android.permission.CAMERA") != 0 || (z9 && ((r3Var = sharedInstance.groupCall) == null || !r3Var.c()))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                arrayList.add(new f(new ti.l(2, 2131232540, M0, z10), 60, 1));
            }
            if (z9) {
                i10 = 2131743367;
            } else {
                i10 = 2131743415;
            }
            arrayList.add(new f(new ti.l(3, 2131232129, id.M0(i10, null), true), 80, 2));
            Collections.sort(arrayList, new oe(21));
            while (arrayList.size() > i7) {
                a8.p0.z(1, arrayList);
            }
            Collections.sort(arrayList, new oe(22));
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                list.add(((f) obj).f39183a);
            }
        }
    }

    public static void b(int i7, boolean z9) {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (org.telegram.messenger.r2.f25212a) {
                StringBuilder n10 = jg.g.n(i7, "call pip: action ", ", camera ");
                n10.append(sharedInstance.getVideoState(false));
                n10.append(", mic muted ");
                n10.append(sharedInstance.isMicMute());
                a8.b(n10.toString());
            }
            if (i7 == 1) {
                if (z9 && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(p10.i(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                }
            } else if (i7 == 2) {
                int videoState = sharedInstance.getVideoState(false);
                if (videoState == 2) {
                    sharedInstance.setVideoState(false, 0);
                } else if (org.telegram.messenger.t0.f25566b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    if (!z9 || ((r3Var = sharedInstance.groupCall) != null && r3Var.c())) {
                        if (videoState == 0) {
                            sharedInstance.createCaptureDevice(false);
                            sharedInstance.requestVideoCall(false);
                        }
                        sharedInstance.setVideoState(false, 2);
                    }
                }
            } else if (i7 == 3) {
                if (z9) {
                    c40.w1(org.telegram.messenger.t0.f25566b, null, false, true);
                } else {
                    sharedInstance.hangUp();
                }
            }
        }
    }

    public static long c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0L;
        }
        return (((sharedInstance.getVideoState(false) * 2) + (sharedInstance.isMicMute() ? 1L : 0L)) * 2) + (sharedInstance.mutedByAdmin() ? 1L : 0L);
    }
}
