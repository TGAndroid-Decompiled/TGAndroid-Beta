package org.telegram.ui.Components.voip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
import org.telegram.ui.me;
public abstract class g {
    public static boolean f40617a;

    public static void a(int i7, List list, boolean z10) {
        boolean z11;
        r3 r3Var;
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z12;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && i7 > 0) {
            ArrayList arrayList = new ArrayList(3);
            int i12 = 0;
            if (z10 && sharedInstance.mutedByAdmin()) {
                r3 r3Var2 = sharedInstance.groupCall;
                if (r3Var2 != null) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var2.d.f(sharedInstance.getSelfId());
                } else {
                    groupCallParticipant = null;
                }
                if (groupCallParticipant != null && groupCallParticipant.raise_hand_rating != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i11 = 2131743394;
                } else {
                    i11 = 2131743290;
                }
                arrayList.add(new f(new wi.k(1, 2131232428, hd.M0(i11, null), !z12), 100, 0));
            } else if (sharedInstance.isMicMute()) {
                arrayList.add(new f(new wi.k(1, 2131232428, hd.M0(2131743230, null), true), 100, 0));
            } else {
                arrayList.add(new f(new wi.k(1, 2131232432, hd.M0(2131743293, null), true), 100, 0));
            }
            int videoState = sharedInstance.getVideoState(false);
            if (videoState == 2) {
                arrayList.add(new f(new wi.k(2, 2131232542, hd.M0(2131743237, null), true), 90, 1));
            } else if (f40617a || videoState == 1) {
                String M0 = hd.M0(2131743238, null);
                if (org.telegram.messenger.t0.f26609b.checkSelfPermission("android.permission.CAMERA") != 0 || (z10 && ((r3Var = sharedInstance.groupCall) == null || !r3Var.c()))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                arrayList.add(new f(new wi.k(2, 2131232541, M0, z11), 60, 1));
            }
            if (z10) {
                i10 = 2131743364;
            } else {
                i10 = 2131743412;
            }
            arrayList.add(new f(new wi.k(3, 2131232130, hd.M0(i10, null), true), 80, 2));
            Collections.sort(arrayList, new me(20));
            while (arrayList.size() > i7) {
                a8.p0.z(1, arrayList);
            }
            Collections.sort(arrayList, new me(21));
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                list.add(((f) obj).f40603a);
            }
        }
    }

    public static void b(int i7, boolean z10) {
        r3 r3Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (org.telegram.messenger.r2.f26206a) {
                StringBuilder m10 = i5.c.m(i7, "call pip: action ", ", camera ");
                m10.append(sharedInstance.getVideoState(false));
                m10.append(", mic muted ");
                m10.append(sharedInstance.isMicMute());
                a8.b(m10.toString());
            }
            if (i7 == 1) {
                if (z10 && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(m10.i(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                }
            } else if (i7 == 2) {
                int videoState = sharedInstance.getVideoState(false);
                if (videoState == 2) {
                    sharedInstance.setVideoState(false, 0);
                } else if (org.telegram.messenger.t0.f26609b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    if (!z10 || ((r3Var = sharedInstance.groupCall) != null && r3Var.c())) {
                        if (videoState == 0) {
                            sharedInstance.createCaptureDevice(false);
                            sharedInstance.requestVideoCall(false);
                        }
                        sharedInstance.setVideoState(false, 2);
                    }
                }
            } else if (i7 == 3) {
                if (z10) {
                    c40.w1(org.telegram.messenger.t0.f26609b, null, false, true);
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
