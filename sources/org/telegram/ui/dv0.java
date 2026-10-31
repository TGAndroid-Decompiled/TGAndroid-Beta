package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class dv0 implements org.telegram.messenger.q20 {
    public final int f36847a = 0;
    public final boolean f36848b;
    public final String f36849c;
    public final org.telegram.messenger.us d;
    public final Object e;
    public final Object f36850f;
    public final Object f36851g;

    public dv0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f36850f = user;
        this.f36851g = chatParticipant;
        this.f36848b = z10;
        this.f36849c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i10 = this.f36847a;
        Object obj2 = this.f36851g;
        Object obj3 = this.f36850f;
        Object obj4 = this.e;
        org.telegram.messenger.us usVar = this.d;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) usVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                boolean z11 = this.f36848b;
                if (channelParticipant != null) {
                    profileActivity.N4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.N4(num.intValue(), user, chatParticipant, null, null, this.f36849c, z11);
                    return;
                }
            default:
                i31 i31Var = (i31) usVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i11 = i31Var.V;
                boolean z12 = this.f36848b;
                String str = this.f36849c;
                if (z12) {
                    ArrayList s02 = org.telegram.messenger.ui.b0(i11).s0(5);
                    for (int i12 = 0; i12 < s02.size(); i12++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents) != null) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                String V = org.telegram.messenger.jj.V(arrayList2.get(i13), null, null);
                                long j10 = arrayList2.get(i13).f19799id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(i11).f18345s0[1];
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        if ((arrayList4.get(i14) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).documents) != null) {
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                String V2 = org.telegram.messenger.jj.V(arrayList.get(i15), null, null);
                                long j11 = arrayList.get(i15).f19799id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
                String[] strArr = i31.f38108b2;
                f1.a aVar = new f1.a(i31Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (i31Var.W == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b02.V(strArr, str, false, aVar, true, z10, false, false, 30);
                return;
        }
    }

    public dv0(i31 i31Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = i31Var;
        this.f36848b = z10;
        this.e = linkedHashSet;
        this.f36849c = str;
        this.f36850f = hashMap;
        this.f36851g = arrayList;
    }
}
