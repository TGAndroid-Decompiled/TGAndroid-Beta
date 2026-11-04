package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class kt0 implements org.telegram.messenger.u10 {
    public final int f47013a = 0;
    public final boolean f47014b;
    public final String f47015c;
    public final org.telegram.messenger.cs d;
    public final Object f47016e;
    public final Object f47017f;
    public final Object f47018g;

    public kt0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.f47016e = channelParticipant;
        this.f47017f = user;
        this.f47018g = chatParticipant;
        this.f47014b = z10;
        this.f47015c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i3 = this.f47013a;
        Object obj2 = this.f47018g;
        Object obj3 = this.f47017f;
        Object obj4 = this.f47016e;
        org.telegram.messenger.cs csVar = this.d;
        switch (i3) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) csVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                boolean z11 = this.f47014b;
                if (channelParticipant != null) {
                    profileActivity.O4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.O4(num.intValue(), user, chatParticipant, null, null, this.f47015c, z11);
                    return;
                }
            default:
                g11 g11Var = (g11) csVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i10 = g11Var.W;
                boolean z12 = this.f47014b;
                String str = this.f47015c;
                if (z12) {
                    ArrayList s02 = org.telegram.messenger.li.b0(i10).s0(5);
                    for (int i11 = 0; i11 < s02.size(); i11++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i11)).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String V = org.telegram.messenger.zi.V(arrayList2.get(i12), null, null);
                                long j10 = arrayList2.get(i12).f27007id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.li.b0(i10).f24051t0[1];
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if ((arrayList4.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String V2 = org.telegram.messenger.zi.V(arrayList.get(i14), null, null);
                                long j11 = arrayList.get(i14).f27007id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
                String[] strArr = g11.c2;
                ci.r6 r6Var = new ci.r6(g11Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (g11Var.f45435a0 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b02.V(strArr, str, false, r6Var, true, z10, false, false, 30);
                return;
        }
    }

    public kt0(g11 g11Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = g11Var;
        this.f47014b = z10;
        this.f47016e = linkedHashSet;
        this.f47015c = str;
        this.f47017f = hashMap;
        this.f47018g = arrayList;
    }
}
