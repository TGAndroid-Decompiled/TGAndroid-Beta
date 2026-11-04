package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class yh implements Runnable {
    public final int f26583a;
    public final Object f26584b;
    public final Object f26585c;

    public yh(int i3, Object obj, Object obj2) {
        this.f26583a = i3;
        this.f26584b = obj;
        this.f26585c = obj2;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        int i3 = this.f26583a;
        SQLiteCursor sQLiteCursor = null;
        Object obj = this.f26585c;
        Object obj2 = this.f26584b;
        switch (i3) {
            case 0:
                u10 u10Var = (u10) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (u10Var != null) {
                    u10Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                if (((AtomicInteger) obj2).decrementAndGet() == 0 && runnable != null) {
                    g0.h3(runnable);
                    return;
                }
                return;
            case 2:
                li liVar = (li) ((l9.u) obj2).f18166c;
                liVar.B0.clear();
                liVar.B0.addAll((ArrayList) obj);
                return;
            case 3:
                ArrayList arrayList2 = ((li) ((androidx.activity.g) obj2).f1250c).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                hs.e().k(297, new Object[0]);
                return;
            case 4:
                zi ziVar = (zi) obj2;
                ziVar.f26877n = (TLRPC.Document) obj;
                hs.f(ziVar.I1).k(116, ziVar);
                return;
            case 5:
                hp hpVar = (hp) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a22 = hpVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f27259id, 0, -1, 0);
                if (a22 != null) {
                    g0.h3(new dg(hpVar, a22, tL_updateMessageID, 8));
                    return;
                }
                return;
            case 6:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((hp) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 7:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((hp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f27018id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 8:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((hp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f27018id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 9:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((hp) obj2).getNotificationCenter().k(296, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 10:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((hp) obj2).getNotificationCenter().k(296, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 11:
                hp hpVar2 = (hp) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                hpVar2.getClass();
                hpVar2.Y3(messages_sponsoredmessages.users, false);
                hpVar2.S3(messages_sponsoredmessages.chats, false);
                return;
            case 12:
                hp hpVar3 = (hp) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                hpVar3.getClass();
                hpVar3.Y3(tL_channels_channelParticipant.users, false);
                hpVar3.S3(tL_channels_channelParticipant.chats, false);
                return;
            case 13:
                hp hpVar4 = (hp) obj2;
                hpVar4.getClass();
                hpVar4.J0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 14:
                ((hp) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 15:
                hp hpVar5 = (hp) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                hpVar5.getNotificationCenter().k(2, 2);
                hpVar5.getNotificationCenter().k(39, new Object[0]);
                return;
            case 16:
                hp hpVar6 = (hp) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                hpVar6.getClass();
                hpVar6.Y3(updates_channeldifference.users, false);
                hpVar6.S3(updates_channeldifference.chats, false);
                return;
            case 17:
                hp hpVar7 = (hp) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                hpVar7.getClass();
                hpVar7.Y3(tL_channels_sendAsPeers.users, false);
                hpVar7.S3(tL_channels_sendAsPeers.chats, false);
                return;
            case 18:
                hp hpVar8 = (hp) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                mj mjVar = hpVar8.I7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        hpVar8.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                g0.r(mjVar);
                g0.i3(mjVar, 240010L);
                return;
            case 19:
                u10 u10Var2 = (u10) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (u10Var2 != null) {
                    u10Var2.a(null);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 20:
                hp hpVar9 = (hp) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                hpVar9.Y3(updates.users, false);
                hpVar9.S3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = updates.chats;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    hpVar9.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f27001id));
                    return;
                } else {
                    hpVar9.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 21:
                u10 u10Var3 = (u10) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (u10Var3 != null) {
                    u10Var3.a(tL_error);
                    return;
                }
                return;
            case 22:
                hp hpVar10 = (hp) obj2;
                ((ai.v2) obj).a(hpVar10.X7);
                hpVar10.W7 = false;
                return;
            case 23:
                ((n10) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 24:
                q0.a aVar = (q0.a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (aVar != null) {
                    aVar.accept(user);
                    return;
                }
                return;
            case 25:
                hp hpVar11 = (hp) obj2;
                zi ziVar2 = (zi) obj;
                hpVar11.getClass();
                long B0 = zi.B0(ziVar2.f26868k);
                int f12 = ziVar2.f1();
                a0.h hVar = hpVar11.K0;
                ArrayList arrayList4 = (ArrayList) hVar.f(B0);
                if (arrayList4 == null) {
                    arrayList4 = k5.j(hVar, B0);
                }
                if (!arrayList4.contains(Integer.valueOf(f12))) {
                    arrayList4.add(Integer.valueOf(f12));
                    return;
                }
                return;
            case 26:
                hp hpVar12 = (hp) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                hpVar12.f23115s1.clear();
                hpVar12.f23161x1.clear();
                hpVar12.Y3(updates_difference.users, false);
                hpVar12.S3(updates_difference.chats, false);
                return;
            case 27:
                ap apVar = (ap) obj2;
                TLObject tLObject = (TLObject) obj;
                apVar.f21572c = false;
                apVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    apVar.f21571b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                hs.f(apVar.f21570a).k(245, new Object[0]);
                return;
            case 28:
                sz.a((rz) obj2);
                ((uq) obj).run();
                return;
            default:
                qr qrVar = (qr) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = qrVar.f24936b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    new ArrayList();
                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                        TLdeserialize.online_count = queryFinalized.intValue(2);
                        TLdeserialize.inviterId = queryFinalized.longValue(3);
                        chatFull = TLdeserialize;
                    } else {
                        chatFull = null;
                    }
                    queryFinalized.dispose();
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.participants = chatParticipants;
                        g0.h3(new lq(qrVar, chatFull, 1));
                        SQLitePreparedStatement executeFast = qrVar.f24936b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                        chatFull.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, chatFull.f27002id);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, chatFull.pinned_msg_id);
                        executeFast.bindInteger(4, chatFull.online_count);
                        executeFast.bindLong(5, chatFull.inviterId);
                        executeFast.bindInteger(6, chatFull.invitesCount);
                        executeFast.bindInteger(7, chatFull.participants_count);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = queryFinalized;
                    qrVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
        }
    }
}
