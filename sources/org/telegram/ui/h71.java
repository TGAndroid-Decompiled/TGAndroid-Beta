package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h71 extends org.telegram.ui.Components.sj0 {
    public final Context f45847c;
    public final ArrayList d;
    public final boolean f45848e;
    public final l71 f45849f;

    public h71(Context context, l71 l71Var) {
        boolean z10;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        TLRPC.Chat chat;
        int i26;
        org.telegram.messenger.zi ziVar;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        this.f45849f = l71Var;
        int i35 = l71Var.f47145b;
        if (i35 == 0 && Utilities.f21385b.nextInt(100) <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45848e = z10;
        this.f45847c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i36 = currentTimeMillis - 3600;
        if (i35 == 2) {
            if (l71Var.L1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (l71Var.D1 instanceof kc1) {
                    tL_message.message = org.telegram.messenger.bd.M0(2131753747, null);
                } else {
                    tL_message.message = org.telegram.messenger.bd.M0(2131753739, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.f27022id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i32 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                tL_peerUser.user_id = org.telegram.messenger.h10.i(i32).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i33 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                tL_peerUser2.user_id = org.telegram.messenger.h10.i(i33).e();
                i34 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i34, tL_message, true, false);
                ziVar2.T = 1L;
                ziVar2.Q1 = false;
                arrayList.add(ziVar2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (l71Var.L1 < 0) {
                chat = l71Var.getMessagesController().M0(Long.valueOf(-l71Var.L1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = org.telegram.messenger.bd.M0(2131752456, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.bd.M0(2131752454, null);
                i31 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(i31, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.f27001id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.f27001id;
                ziVar = ziVar3;
            } else {
                if (l71Var.L1 != 0) {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753746, null);
                } else if (l71Var.D1 instanceof kc1) {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753748, null);
                } else {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753740, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i26 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                tL_peerUser3.user_id = org.telegram.messenger.h10.i(i26).e();
                ziVar = null;
            }
            int i37 = currentTimeMillis - 3540;
            tL_message2.date = i37;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.f27022id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i27 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar4 = new org.telegram.messenger.zi(i27, tL_message2, ziVar, true, false);
            if (ziVar != null) {
                ziVar4.B0 = org.telegram.messenger.bd.M0(2131752455, null);
            }
            ziVar4.T = 1L;
            ziVar4.Q1 = false;
            arrayList.add(ziVar4);
            if (l71Var.L1 != 0 && l71Var.f47193s0 == null) {
                TLRPC.User a22 = l71Var.getMessagesController().a2(Long.valueOf(l71Var.L1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i28 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                org.telegram.messenger.zi ziVar5 = new org.telegram.messenger.zi(i28, tL_message4, true, false);
                ziVar5.T = 1L;
                ziVar5.U = 5;
                arrayList.add(ziVar5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (a22 != null) {
                    tL_message5.message = org.telegram.messenger.bd.a0(null, null, 2131752243, org.telegram.messenger.l10.j(a22, true));
                } else {
                    tL_message5.message = org.telegram.messenger.bd.M0(2131752457, null);
                }
                tL_message5.date = i37;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.f27022id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                i29 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                tL_peerUser4.user_id = org.telegram.messenger.h10.i(i29).e();
                i30 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                org.telegram.messenger.zi ziVar6 = new org.telegram.messenger.zi(i30, tL_message5, true, false);
                ziVar6.T = 1L;
                ziVar6.Q1 = false;
                ziVar6.U = 1;
                arrayList.add(ziVar6);
                return;
            }
            return;
        }
        boolean z11 = z10;
        if (i35 == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.f27007id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = Integer.MIN_VALUE;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = org.telegram.messenger.bd.M0(2131748261, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i38 = currentTimeMillis + (-3540);
            tL_message6.date = i38;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e();
            tL_message6.f27022id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.zi ziVar7 = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message6, true, false);
            boolean z12 = org.telegram.messenger.r2.f25040a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M0 = org.telegram.messenger.bd.M0(2131748264, null);
            StringBuilder sb2 = new StringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                sb2.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message7.entities.add(tL_messageEntityTextUrl);
            }
            tL_message7.message = sb2.toString();
            tL_message7.date = currentTimeMillis - 2640;
            tL_message7.dialog_id = 1L;
            tL_message7.flags = 259;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e();
            tL_message7.f27022id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.zi ziVar8 = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message7, true, false);
            ziVar8.Q1 = false;
            ziVar8.T = 1L;
            arrayList.add(ziVar8);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.bd.M0(2131748265, null);
            tL_message8.date = i38;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 265;
            tL_message8.from_id = new TLRPC.TL_peerUser();
            tL_message8.f27022id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message8.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e();
            org.telegram.messenger.zi ziVar9 = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message8, true, false);
            ziVar9.B0 = org.telegram.messenger.bd.M0(2131748263, null);
            ziVar8.B0 = "Test User";
            ziVar9.T = 1L;
            ziVar9.Q1 = false;
            ziVar9.C = ziVar7;
            ziVar8.C = ziVar9;
            arrayList.add(ziVar9);
            arrayList.add(ziVar7);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 259;
            tL_message9.out = false;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.f27022id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message9.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message9.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message9.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message9.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            i25 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar10 = new org.telegram.messenger.zi(i25, tL_message9, true, false);
            ziVar10.f26851g0 = 1;
            ziVar10.f26828b0 = 0.3f;
            ziVar10.C0 = true;
            arrayList.add(ziVar10);
        } else if (z11) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.f27150id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.f27150id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            i21 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.hp.s1(i21).Y3(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i39 = currentTimeMillis - 2640;
            tL_message10.date = i39;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = 259;
            tL_message10.f27022id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.f27150id;
            i22 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.zi(i22, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i39;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.f27022id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.f27150id;
            i23 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.zi(i23, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.f27022id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.f27150id;
            i24 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.zi(i24, tL_message12, true, false));
        } else {
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = org.telegram.messenger.bd.M0(2131744165, null);
            int i40 = currentTimeMillis - 3540;
            tL_message13.date = i40;
            tL_message13.dialog_id = 1L;
            tL_message13.flags = 259;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser14;
            i3 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser14.user_id = org.telegram.messenger.h10.i(i3).e();
            tL_message13.f27022id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = true;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.peer_id = tL_peerUser15;
            tL_peerUser15.user_id = 0L;
            i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar11 = new org.telegram.messenger.zi(i10, tL_message13, true, false);
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = org.telegram.messenger.bd.M0(2131744164, null);
            tL_message14.date = currentTimeMillis - 2640;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i11 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser16.user_id = org.telegram.messenger.h10.i(i11).e();
            tL_message14.f27022id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i12 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.zi(i12, tL_message14, true, false));
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.date = currentTimeMillis - 3470;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            tL_message15.from_id = new TLRPC.TL_peerUser();
            tL_message15.f27022id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message15.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message15.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = org.telegram.messenger.bd.M0(2131744160, null);
            tL_documentAttributeAudio2.title = org.telegram.messenger.bd.M0(2131744159, null);
            tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message15.out = false;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser18;
            i13 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser18.user_id = org.telegram.messenger.h10.i(i13).e();
            i14 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            arrayList.add(new org.telegram.messenger.zi(i14, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.message = org.telegram.messenger.bd.M0(2131744163, null);
            tL_message16.date = i40;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 265;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.f27022id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message16.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message16.media = new TLRPC.TL_messageMediaEmpty();
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser19;
            i15 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser19.user_id = org.telegram.messenger.h10.i(i15).e();
            i16 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar12 = new org.telegram.messenger.zi(i16, tL_message16, true, false);
            ziVar12.B0 = org.telegram.messenger.bd.M0(2131744162, null);
            ziVar12.C = ziVar11;
            arrayList.add(ziVar12);
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.date = currentTimeMillis - 3480;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 259;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message17.from_id = tL_peerUser20;
            i17 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser20.user_id = org.telegram.messenger.h10.i(i17).e();
            tL_message17.f27022id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
            tL_message17.media = tL_messageMediaDocument4;
            tL_messageMediaDocument4.flags |= 3;
            tL_messageMediaDocument4.document = new TLRPC.TL_document();
            TLRPC.Document document4 = tL_message17.media.document;
            document4.mime_type = "audio/ogg";
            document4.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio3.flags = 1028;
            tL_documentAttributeAudio3.duration = 3.0d;
            tL_documentAttributeAudio3.voice = true;
            tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message17.media.document.attributes.add(tL_documentAttributeAudio3);
            tL_message17.out = true;
            TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
            tL_message17.peer_id = tL_peerUser21;
            tL_peerUser21.user_id = 0L;
            i18 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar13 = new org.telegram.messenger.zi(i18, tL_message17, true, false);
            ziVar13.f26851g0 = 1;
            ziVar13.f26828b0 = 0.3f;
            ziVar13.C0 = true;
            arrayList.add(ziVar13);
            arrayList.add(ziVar11);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = currentTimeMillis - 3590;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 257;
            tL_message18.from_id = new TLRPC.TL_peerUser();
            tL_message18.f27022id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message18.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message18.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.f27025id = 1L;
            photo.access_hash = 0L;
            photo.date = i36;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.f27026w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message18.media.photo.sizes.add(tL_photoSize);
            tL_message18.message = org.telegram.messenger.bd.M0(2131744161, null);
            tL_message18.out = false;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser22;
            i19 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            tL_peerUser22.user_id = org.telegram.messenger.h10.i(i19).e();
            i20 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.zi ziVar14 = new org.telegram.messenger.zi(i20, tL_message18, true, false);
            ziVar14.C0 = true;
            arrayList.add(ziVar14);
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final boolean F() {
        l71 l71Var = this.f45849f;
        int i3 = l71Var.f47145b;
        if (l71Var.B0 == null || i3 != 1 || l71Var.f47180n != 3 || l71Var.f47201w.f27530g == 0) {
            if (l71Var.A0 != null) {
                if (i3 != 2 && (i3 != 1 || l71Var.f47180n != 2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int b() {
        int size = this.d.size();
        if (F()) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i3) {
        if (F()) {
            if (i3 == 0) {
                if (this.f45849f.f47180n == 3) {
                    return 3;
                }
                return 2;
            }
            i3--;
        }
        if (i3 >= 0) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                return ((org.telegram.messenger.zi) arrayList.get(i3)).U;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = d1Var.f55544f;
        if (i10 != 2 && i10 != 3) {
            if (F()) {
                i3--;
            }
            ArrayList arrayList = this.d;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            View view = d1Var.f55540a;
            boolean z13 = view instanceof org.telegram.ui.Cells.q1;
            l71 l71Var = this.f45849f;
            if (z13) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                boolean z14 = false;
                q1Var.f29900e6 = false;
                int i11 = i3 - 1;
                int d = d(i11);
                int i12 = i3 + 1;
                int d10 = d(i12);
                if (!(ziVar.f26868k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == d1Var.f55544f) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i11);
                    if (ziVar2.Q3() == ziVar.Q3() && Math.abs(ziVar2.f26868k.date - ziVar.f26868k.date) <= 300) {
                        z10 = true;
                        if (d10 != d1Var.f55544f && i12 < arrayList.size()) {
                            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i12);
                            if (!(ziVar3.f26868k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ziVar3.Q3() == ziVar.Q3() && Math.abs(ziVar3.f26868k.date - ziVar.f26868k.date) <= 300) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11 = z12;
                        } else {
                            z11 = false;
                        }
                        if (!this.f45848e || l71Var.L1 < 0) {
                            z14 = true;
                        }
                        q1Var.f29900e6 = z14;
                        q1Var.setFullyDraw(true);
                        q1Var.u3(ziVar, null, z10, z11, false, false);
                    }
                }
                z10 = false;
                if (d10 != d1Var.f55544f) {
                }
                z11 = false;
                if (!this.f45848e) {
                }
                z14 = true;
                q1Var.f29900e6 = z14;
                q1Var.setFullyDraw(true);
                q1Var.u3(ziVar, null, z10, z11, false, false);
            } else if (view instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                t0Var.setMessageObject(ziVar);
                t0Var.setAlpha(1.0f);
                l71Var.a1();
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        l71 l71Var = this.f45849f;
        if (i3 == 0) {
            i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.ui.Cells.q1 q1Var2 = new org.telegram.ui.Cells.q1(this.f45847c, i10, false, null, new dj(this, 2));
            q1Var2.setDelegate(new ra.e(19));
            q1Var = q1Var2;
        } else {
            Context context = this.f45847c;
            if (i3 == 1) {
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, l71Var.f47141a, false);
                t0Var.setDelegate(new v7.s(19));
                q1Var = t0Var;
            } else if (i3 == 2) {
                if (l71Var.A0.getParent() != null) {
                    ((ViewGroup) l71Var.A0.getParent()).removeView(l71Var.A0);
                }
                yg0 yg0Var = new yg0(context, 11);
                yg0Var.addView(l71Var.A0, b8.mf.e(-1, 76, 17));
                q1Var = yg0Var;
            } else if (i3 == 5) {
                q1Var = new org.telegram.ui.Components.sm(l71Var.getParentActivity(), 26);
            } else {
                if (l71Var.B0.getParent() != null) {
                    ((ViewGroup) l71Var.B0.getParent()).removeView(l71Var.B0);
                }
                yg0 yg0Var2 = new yg0(context, 12);
                yg0Var2.addView(l71Var.B0, b8.mf.e(-1, 76, 17));
                q1Var = yg0Var2;
            }
        }
        return k2.p1.p(q1Var, q1Var, -1, -2);
    }
}
