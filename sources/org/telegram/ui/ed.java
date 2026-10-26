package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ed implements Runnable {
    public final int f39082a;
    public final Object f39083b;
    public final Object f39084c;

    public ed(int i10, Object obj, Object obj2) {
        this.f39082a = i10;
        this.f39083b = obj;
        this.f39084c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Components.j71 j71Var;
        org.telegram.ui.Components.g21 g21Var;
        int[] iArr;
        fi.v3 v3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f39082a;
        MessageObject messageObject = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f39084c;
        Object obj2 = this.f39083b;
        switch (i10) {
            case 0:
                nd ndVar = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ndVar.f41852g0;
                ndVar.f41849e0 = false;
                if (tLObject != null && ndVar.getParentActivity() != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ndVar.L.removeView((View) arrayList.get(i11));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar.getParentActivity(), new fd(ndVar, 0), false, 0);
                        TLRPC.Chat chat2 = tL_messages_chats.chats.get(i12);
                        if (i12 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat2, z10);
                        arrayList.add(nVar);
                        ndVar.M.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                    }
                    ndVar.j0();
                    return;
                }
                return;
            case 1:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.f40911q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.f40913r0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.r71 r71Var = keVar.X0;
                if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
                    j71Var.O(true);
                    return;
                }
                return;
            case 2:
                ((ke) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 3:
                un unVar = (un) obj2;
                org.telegram.ui.Components.g21[] g21VarArr = (org.telegram.ui.Components.g21[]) obj;
                if (!unVar.Gb && (g21Var = g21VarArr[0]) != null) {
                    g21VarArr[0] = null;
                    if (unVar.f44444v0 == g21Var) {
                        unVar.f44444v0 = null;
                    }
                    AndroidUtilities.removeFromParent(g21Var);
                    return;
                }
                return;
            case 4:
                ((bi.b3) obj2).run((TLRPC.User) obj);
                return;
            case 5:
                un unVar2 = (un) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                s1Var.getLocationInWindow(new int[2]);
                unVar2.L1.setTranslationY(s1Var.getTimeY() + ((iArr[1] - v3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                unVar2.L1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + s1Var.f25264rb) + s1Var.pb) - (s1Var.f25280sb / 2.0f));
                unVar2.L1.u();
                return;
            case 6:
                un unVar3 = (un) obj2;
                unVar3.getClass();
                unVar3.presentFragment(ProfileActivity.t4(((TLRPC.User[]) obj)[0].f22176id));
                return;
            case 7:
                un.K0((un) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 8:
                un unVar4 = (un) obj2;
                int[] iArr2 = (int[]) obj;
                unVar4.getClass();
                if (iArr2[0] != 0) {
                    unVar4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 9:
                un unVar5 = (un) obj2;
                Activity parentActivity = unVar5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (unVar5.f44399r8 != 0) {
                    z11 = false;
                }
                qf.d.o(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 10:
                ((un) obj2).o8((bh) obj);
                return;
            case 11:
                ((un) obj2).ua((TLRPC.Chat) obj);
                return;
            case 12:
                un.w0((un) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 13:
                un unVar6 = (un) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(unVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(unVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.g5.v0(unVar6, tL_error.text);
                    return;
                }
            case 14:
                a0.h hVar = (a0.h) obj2;
                q6 q6Var = (q6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i13 = 0; i13 < messageObject.messageOwner.media.webpage.attributes.size(); i13++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new ed(15, q6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new zt0(q6Var, 29));
                return;
            case 15:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 16:
                un unVar7 = (un) obj2;
                View view = (View) obj;
                if (unVar7.getParentActivity() != null) {
                    unVar7.W0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    unVar7.W0.q(16.0f);
                    unVar7.W0.p(true);
                    unVar7.W0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    unVar7.W0.l(0.0f, 96.0f);
                    unVar7.W0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - unVar7.Ma) - unVar7.f44295j1.getHeight()));
                    unVar7.f44295j1.addView(unVar7.W0, org.telegram.ui.Components.gb1.i(-1, 100, 87));
                    fi.v3 v3Var2 = unVar7.W0;
                    v3Var2.f11798l0 = new le(unVar7, 19);
                    v3Var2.u();
                    org.telegram.ui.Components.u40.f33247w.b();
                    return;
                }
                return;
            case 17:
                ((un) obj2).f44295j1.removeView((org.telegram.ui.Components.fl0) obj);
                return;
            case 18:
                MessageObject messageObject2 = (MessageObject) obj;
                un unVar8 = ((oi) obj2).f42201s;
                MessageObject messageObject3 = (MessageObject) unVar8.A6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) unVar8.A6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                unVar8.Dc(messageObject2, true);
                bh.s0.f();
                return;
            case 19:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                un unVar9 = ((wl) ((ym) obj2).f46085f).f45518a.Q;
                int i14 = un.f44171bd;
                unVar9.Va();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 20:
                fi.v3 v3Var3 = (fi.v3) obj;
                un unVar10 = ((fn) obj2).f39423a;
                unVar10.f44295j1.removeView(v3Var3);
                if (v3Var3 == unVar10.M1) {
                    unVar10.M1 = null;
                    return;
                }
                return;
            case 21:
                Long l4 = (Long) obj;
                un unVar11 = ((zm) obj2).f46329b1.f39423a;
                if (l4.longValue() < 0 && (chat = unVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar11);
                int i15 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                b02.R(i15, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 22:
                mo moVar = (mo) obj2;
                moVar.getClass();
                moVar.presentFragment(w91.c0((TLRPC.Chat) obj, true));
                return;
            case 23:
                ap apVar = (ap) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = apVar.getMessagesController().getInputChannel(apVar.Z);
                apVar.f37855h0 = apVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ea(apVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 24:
                ap apVar2 = (ap) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z12 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                apVar2.f37849c0 = z12;
                if (!z12 && apVar2.getUserConfig().isPremium() && !apVar2.f37850d0 && apVar2.f37870x != null) {
                    apVar2.f37850d0 = true;
                    apVar2.d0();
                    apVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new no(apVar2, 2));
                    return;
                }
                return;
            case 25:
                np.V((np) obj2, (org.telegram.ui.ActionBar.e2[]) obj);
                return;
            case 26:
                np npVar = (np) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    npVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    npVar.v = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                npVar.f41968w = false;
                npVar.f41969x = true;
                npVar.c0();
                return;
            case 27:
                ((jp) obj2).f40713x.d.P = false;
                ((org.telegram.ui.Components.e90) obj).run();
                return;
            case 28:
                ((jp) obj2).f40713x.d.O = false;
                ((org.telegram.ui.Components.f90) obj).run();
                return;
            default:
                np npVar2 = ((jp) obj2).f40713x.d;
                npVar2.O = false;
                npVar2.P = false;
                ((Runnable) obj).run();
                return;
        }
    }
}
