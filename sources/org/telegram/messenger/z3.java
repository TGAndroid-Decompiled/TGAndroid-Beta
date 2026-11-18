package org.telegram.messenger;

import android.util.LongSparseArray;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;
public final class z3 implements q10 {
    public final int f28259a;
    public final Object f28260b;
    public final Object f28261c;

    public z3(int i7, Object obj, Object obj2) {
        this.f28259a = i7;
        this.f28260b = obj;
        this.f28261c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f28259a) {
            case 0:
                f4 f4Var = (f4) this.f28260b;
                org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) this.f28261c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.g3(new w3(22, ipVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    tr messagesStorage = f4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new rq(7, messagesStorage, arrayList3));
                    f4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                    f4Var.getMessagesController().f4(tl_chatThemes.users, false);
                    f4Var.getMessagesController().Z3(tl_chatThemes.chats, false);
                    ArrayList<TLRPC.ChatTheme> arrayList4 = tl_chatThemes.themes;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.ChatTheme chatTheme = arrayList4.get(i7);
                        i7++;
                        TLRPC.ChatTheme chatTheme2 = chatTheme;
                        if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                            arrayList2.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size());
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        org.telegram.ui.ActionBar.t3 t3Var = new org.telegram.ui.ActionBar.t3(f4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList2.get(i10));
                        t3Var.p(0, null);
                        t3Var.p(1, null);
                        t3Var.n(0, null);
                        t3Var.n(1, null);
                        arrayList5.add(t3Var);
                    }
                    g0.g3(new fn(f4Var, tl_chatThemes, arrayList5, arrayList2, ipVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.g3(new w3(23, f4Var, ipVar));
                    return;
                } else {
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f28261c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!((CancellationToken) this.f28260b).isCancellationRequested()) {
                    if (auth_authorization != null && tL_error2 == null) {
                        taskCompletionSource.trySetResult(auth_authorization);
                        return;
                    } else {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error2));
                        return;
                    }
                }
                return;
            case 2:
                final u9 u9Var = (u9) this.f28260b;
                final q10 q10Var = (q10) this.f28261c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = u9Var.f27140e;
                if (tL_StarGiftAuctionState != null) {
                    u9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    u9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f28634id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f28634id, Boolean.TRUE);
                    u9Var.j(tL_StarGiftAuctionState.gift.f28634id, new x10() {
                        @Override
                        public final void a(Object obj3) {
                            u9 u9Var2 = u9.this;
                            u9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            u9Var2.d(tL_StarGiftAuctionState2.gift.f28634id).f26561c = (ArrayList) obj3;
                            u9Var2.f(tL_StarGiftAuctionState2.gift.f28634id, tL_StarGiftAuctionState2);
                            q10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    u9Var.f(tL_StarGiftAuctionState.gift.f28634id, tL_StarGiftAuctionState);
                }
                q10Var.a(tL_StarGiftAuctionState, tL_error3);
                return;
            case 3:
                mp mpVar = (mp) this.f28260b;
                li.i0 i0Var = (li.i0) this.f28261c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    mpVar.Z3(peerLinkRequests.chats, false);
                    mpVar.f4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j3 = -n5.o(communityPeerRequest.peer);
                        if (mpVar.P0(j3) == null) {
                            mpVar.b3(0, j3, true);
                        }
                    }
                    i0Var.a(peerLinkRequests, null);
                    return;
                }
                i0Var.a(null, tL_error4);
                return;
            case 4:
                mp mpVar2 = (mp) this.f28260b;
                hi.t6 t6Var = (hi.t6) this.f28261c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    mpVar2.Z3(messages_chats.chats, false);
                    mpVar2.W7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                t6Var.a(arrayList);
                return;
            case 5:
                mp mpVar3 = (mp) this.f28260b;
                org.telegram.ui.Components.rr rrVar = (org.telegram.ui.Components.rr) this.f28261c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    mpVar3.Z3(participantJoinedChats.chats, false);
                    mpVar3.f4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (mpVar3.P0(longValue) == null) {
                            mpVar3.b3(0, longValue, true);
                        }
                    }
                }
                rrVar.a(participantJoinedChats, tL_error6);
                return;
            case 6:
                q10 q10Var2 = (q10) this.f28261c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f28260b).dismiss();
                if (tL_error7 != null) {
                    q10Var2.a(null, tL_error7.text);
                    return;
                } else {
                    q10Var2.a(passkey, null);
                    return;
                }
            default:
                c10 c10Var = (c10) this.f28261c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                g10 g10Var = ((f10) this.f28260b).f23823i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error8 == null) {
                    z10 = true;
                } else {
                    g10Var.getClass();
                    z10 = false;
                }
                c10Var.a(Boolean.valueOf(z10));
                g10Var.getClass();
                return;
        }
    }
}
