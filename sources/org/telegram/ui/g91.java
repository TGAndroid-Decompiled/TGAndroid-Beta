package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g91 extends org.telegram.ui.Components.tk0 {
    public final Context f37435c;
    public final ArrayList d;
    public final boolean e;
    public final k91 f37436f;

    public g91(Context context, k91 k91Var) {
        boolean z10;
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
        int i26;
        TLRPC.Chat chat;
        int i27;
        org.telegram.messenger.kj kjVar;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        this.f37436f = k91Var;
        int i36 = k91Var.f38715b;
        if (i36 == 0 && Utilities.f14520b.nextInt(100) <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        this.f37435c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i37 = currentTimeMillis - 3600;
        if (i36 == 2) {
            if (k91Var.K1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (k91Var.C1 instanceof ke1) {
                    tL_message.message = org.telegram.messenger.dd.L0(2131753747, null);
                } else {
                    tL_message.message = org.telegram.messenger.dd.L0(2131753739, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.f19815id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                i33 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                tL_peerUser.user_id = org.telegram.messenger.e20.i(i33).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                i34 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                tL_peerUser2.user_id = org.telegram.messenger.e20.i(i34).e();
                i35 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i35, tL_message, true, false);
                kjVar2.T = 1L;
                kjVar2.Q1 = false;
                arrayList.add(kjVar2);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            if (k91Var.K1 < 0) {
                chat = k91Var.getMessagesController().L0(Long.valueOf(-k91Var.K1));
            } else {
                chat = null;
            }
            if (chat != null) {
                tL_message2.message = org.telegram.messenger.dd.L0(2131752456, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.dd.L0(2131752454, null);
                i32 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                org.telegram.messenger.kj kjVar3 = new org.telegram.messenger.kj(i32, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.f19794id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.f19794id;
                kjVar = kjVar3;
            } else {
                if (k91Var.K1 != 0) {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753746, null);
                } else if (k91Var.C1 instanceof ke1) {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753748, null);
                } else {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753740, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                i27 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                tL_peerUser3.user_id = org.telegram.messenger.e20.i(i27).e();
                kjVar = null;
            }
            int i38 = currentTimeMillis - 3540;
            tL_message2.date = i38;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.f19815id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            i28 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar4 = new org.telegram.messenger.kj(i28, tL_message2, kjVar, true, false);
            if (kjVar != null) {
                kjVar4.B0 = org.telegram.messenger.dd.L0(2131752455, null);
            }
            kjVar4.T = 1L;
            kjVar4.Q1 = false;
            arrayList.add(kjVar4);
            if (k91Var.K1 != 0 && k91Var.f38760r0 == null) {
                TLRPC.User Z1 = k91Var.getMessagesController().Z1(Long.valueOf(k91Var.K1));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                i29 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                org.telegram.messenger.kj kjVar5 = new org.telegram.messenger.kj(i29, tL_message4, true, false);
                kjVar5.T = 1L;
                kjVar5.U = 5;
                arrayList.add(kjVar5);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (Z1 != null) {
                    tL_message5.message = org.telegram.messenger.dd.a0(null, null, 2131752243, org.telegram.messenger.i20.j(Z1, true));
                } else {
                    tL_message5.message = org.telegram.messenger.dd.L0(2131752457, null);
                }
                tL_message5.date = i38;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.f19815id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                i30 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                tL_peerUser4.user_id = org.telegram.messenger.e20.i(i30).e();
                i31 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                org.telegram.messenger.kj kjVar6 = new org.telegram.messenger.kj(i31, tL_message5, true, false);
                kjVar6.T = 1L;
                kjVar6.Q1 = false;
                kjVar6.U = 1;
                arrayList.add(kjVar6);
                return;
            }
            return;
        }
        boolean z11 = z10;
        if (i36 == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.f19800id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = Integer.MIN_VALUE;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = org.telegram.messenger.dd.L0(2131748270, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i39 = currentTimeMillis + (-3540);
            tL_message6.date = i39;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).e();
            tL_message6.f19815id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.kj kjVar7 = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message6, true, false);
            boolean z12 = org.telegram.messenger.v2.f18578a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String L0 = org.telegram.messenger.dd.L0(2131748273, null);
            StringBuilder sb2 = new StringBuilder(L0);
            int indexOf = L0.indexOf(42);
            int lastIndexOf = L0.lastIndexOf(42);
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
            tL_peerUser7.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).e();
            tL_message7.f19815id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.kj kjVar8 = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message7, true, false);
            kjVar8.Q1 = false;
            kjVar8.T = 1L;
            arrayList.add(kjVar8);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.dd.L0(2131748274, null);
            tL_message8.date = i39;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 265;
            tL_message8.from_id = new TLRPC.TL_peerUser();
            tL_message8.f19815id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message8.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).e();
            org.telegram.messenger.kj kjVar9 = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message8, true, false);
            kjVar9.B0 = org.telegram.messenger.dd.L0(2131748272, null);
            kjVar8.B0 = "Test User";
            kjVar9.T = 1L;
            kjVar9.Q1 = false;
            kjVar9.C = kjVar7;
            kjVar8.C = kjVar9;
            arrayList.add(kjVar9);
            arrayList.add(kjVar7);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 259;
            tL_message9.out = false;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.f19815id = 1;
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
            i26 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar10 = new org.telegram.messenger.kj(i26, tL_message9, true, false);
            kjVar10.f16675g0 = 1;
            kjVar10.f16652b0 = 0.3f;
            kjVar10.C0 = true;
            arrayList.add(kjVar10);
        } else if (z11) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.f19943id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.f19943id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            i22 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.wp.r1(i22).V3(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i40 = currentTimeMillis - 2640;
            tL_message10.date = i40;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = 259;
            tL_message10.f19815id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.f19943id;
            i23 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            arrayList.add(new org.telegram.messenger.kj(i23, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i40;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.f19815id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.f19943id;
            i24 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            arrayList.add(new org.telegram.messenger.kj(i24, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.f19815id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.f19943id;
            i25 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            arrayList.add(new org.telegram.messenger.kj(i25, tL_message12, true, false));
        } else {
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = org.telegram.messenger.dd.L0(2131744180, null);
            int i41 = currentTimeMillis - 3540;
            tL_message13.date = i41;
            tL_message13.dialog_id = 1L;
            tL_message13.flags = 259;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser14;
            i10 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser14.user_id = org.telegram.messenger.e20.i(i10).e();
            tL_message13.f19815id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = true;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.peer_id = tL_peerUser15;
            tL_peerUser15.user_id = 0L;
            i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar11 = new org.telegram.messenger.kj(i11, tL_message13, true, false);
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = org.telegram.messenger.dd.L0(2131744179, null);
            tL_message14.date = currentTimeMillis - 2640;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            i12 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser16.user_id = org.telegram.messenger.e20.i(i12).e();
            tL_message14.f19815id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            i13 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            arrayList.add(new org.telegram.messenger.kj(i13, tL_message14, true, false));
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.date = currentTimeMillis - 3470;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            tL_message15.from_id = new TLRPC.TL_peerUser();
            tL_message15.f19815id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message15.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message15.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = org.telegram.messenger.dd.L0(2131744175, null);
            tL_documentAttributeAudio2.title = org.telegram.messenger.dd.L0(2131744174, null);
            tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message15.out = false;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser18;
            i14 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser18.user_id = org.telegram.messenger.e20.i(i14).e();
            i15 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            arrayList.add(new org.telegram.messenger.kj(i15, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.message = org.telegram.messenger.dd.L0(2131744178, null);
            tL_message16.date = i41;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 265;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.f19815id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message16.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message16.media = new TLRPC.TL_messageMediaEmpty();
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser19;
            i16 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser19.user_id = org.telegram.messenger.e20.i(i16).e();
            i17 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar12 = new org.telegram.messenger.kj(i17, tL_message16, true, false);
            kjVar12.B0 = org.telegram.messenger.dd.L0(2131744177, null);
            kjVar12.C = kjVar11;
            arrayList.add(kjVar12);
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.date = currentTimeMillis - 3480;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 259;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message17.from_id = tL_peerUser20;
            i18 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser20.user_id = org.telegram.messenger.e20.i(i18).e();
            tL_message17.f19815id = 1;
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
            i19 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar13 = new org.telegram.messenger.kj(i19, tL_message17, true, false);
            kjVar13.f16675g0 = 1;
            kjVar13.f16652b0 = 0.3f;
            kjVar13.C0 = true;
            arrayList.add(kjVar13);
            arrayList.add(kjVar11);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = currentTimeMillis - 3590;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 257;
            tL_message18.from_id = new TLRPC.TL_peerUser();
            tL_message18.f19815id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message18.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message18.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.f19818id = 1L;
            photo.access_hash = 0L;
            photo.date = i37;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.f19819w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message18.media.photo.sizes.add(tL_photoSize);
            tL_message18.message = org.telegram.messenger.dd.L0(2131744176, null);
            tL_message18.out = false;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser22;
            i20 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            tL_peerUser22.user_id = org.telegram.messenger.e20.i(i20).e();
            i21 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.kj kjVar14 = new org.telegram.messenger.kj(i21, tL_message18, true, false);
            kjVar14.C0 = true;
            arrayList.add(kjVar14);
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final boolean F() {
        k91 k91Var = this.f37436f;
        int i10 = k91Var.f38715b;
        if (k91Var.A0 == null || i10 != 1 || k91Var.f38750n != 3 || k91Var.f38771w.f20735g == 0) {
            if (k91Var.f38780z0 != null) {
                if (i10 != 2 && (i10 != 1 || k91Var.f38750n != 2)) {
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
    public final int d(int i10) {
        if (F()) {
            if (i10 == 0) {
                if (this.f37436f.f38750n == 3) {
                    return 3;
                }
                return 2;
            }
            i10--;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.kj) arrayList.get(i10)).U;
            }
            return 4;
        }
        return 4;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = c1Var.f47912f;
        if (i11 != 2 && i11 != 3) {
            if (F()) {
                i10--;
            }
            ArrayList arrayList = this.d;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
            View view = c1Var.f47909a;
            boolean z13 = view instanceof org.telegram.ui.Cells.q1;
            k91 k91Var = this.f37436f;
            if (z13) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                boolean z14 = false;
                q1Var.f22533d6 = false;
                int i12 = i10 - 1;
                int d = d(i12);
                int i13 = i10 + 1;
                int d10 = d(i13);
                if (!(kjVar.f16690k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == c1Var.f47912f) {
                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i12);
                    if (kjVar2.P3() == kjVar.P3() && Math.abs(kjVar2.f16690k.date - kjVar.f16690k.date) <= 300) {
                        z10 = true;
                        if (d10 != c1Var.f47912f && i13 < arrayList.size()) {
                            org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) arrayList.get(i13);
                            if (!(kjVar3.f16690k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && kjVar3.P3() == kjVar.P3() && Math.abs(kjVar3.f16690k.date - kjVar.f16690k.date) <= 300) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11 = z12;
                        } else {
                            z11 = false;
                        }
                        if (!this.e || k91Var.K1 < 0) {
                            z14 = true;
                        }
                        q1Var.f22533d6 = z14;
                        q1Var.setFullyDraw(true);
                        q1Var.s3(kjVar, null, z10, z11, false, false);
                    }
                }
                z10 = false;
                if (d10 != c1Var.f47912f) {
                }
                z11 = false;
                if (!this.e) {
                }
                z14 = true;
                q1Var.f22533d6 = z14;
                q1Var.setFullyDraw(true);
                q1Var.s3(kjVar, null, z10, z11, false, false);
            } else if (view instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                s0Var.setMessageObject(kjVar);
                s0Var.setAlpha(1.0f);
                k91Var.a1();
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q1 q1Var;
        int i11;
        k91 k91Var = this.f37436f;
        if (i10 == 0) {
            i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.ui.Cells.q1 q1Var2 = new org.telegram.ui.Cells.q1(this.f37435c, i11, false, null, new bk(this, 2));
            q1Var2.setDelegate(new jb.b(16));
            q1Var = q1Var2;
        } else {
            Context context = this.f37435c;
            if (i10 == 1) {
                org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, k91Var.f38712a, false);
                s0Var.setDelegate(new kb.a(16));
                q1Var = s0Var;
            } else if (i10 == 2) {
                if (k91Var.f38780z0.getParent() != null) {
                    ((ViewGroup) k91Var.f38780z0.getParent()).removeView(k91Var.f38780z0);
                }
                bg0 bg0Var = new bg0(context, 12);
                bg0Var.addView(k91Var.f38780z0, w7.b6.e(-1, 76, 17));
                q1Var = bg0Var;
            } else if (i10 == 5) {
                q1Var = new org.telegram.ui.Components.bn(k91Var.getParentActivity(), 22);
            } else {
                if (k91Var.A0.getParent() != null) {
                    ((ViewGroup) k91Var.A0.getParent()).removeView(k91Var.A0);
                }
                bg0 bg0Var2 = new bg0(context, 13);
                bg0Var2.addView(k91Var.A0, w7.b6.e(-1, 76, 17));
                q1Var = bg0Var2;
            }
        }
        return sc.e.o(q1Var, q1Var, -1, -2);
    }
}
