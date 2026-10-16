package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p6 implements Runnable {
    public final int f38819a;
    public final Object f38820b;
    public final Object f38821c;
    public final Object d;
    public final Object e;

    public p6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38819a = i10;
        this.f38820b = obj;
        this.f38821c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) this.f38820b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.f38821c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        w90Var.f30511y = false;
        w90Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            w90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void b() {
        org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) this.f38820b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.e;
        ((boolean[]) this.f38821c)[0] = true;
        AndroidUtilities.cancelRunOnUIThread(cb0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr[i10];
        }
        cb0Var.getMessagesController().getStoriesController().n0(cb0Var.e, arrayList, false);
    }

    private final void c() {
        yy yyVar = (yy) this.f38821c;
        yyVar.showDialog(new b51((Context) this.d, yyVar.getResourceProvider(), new org.telegram.ui.Components.g90(13, (org.telegram.ui.Components.so0) this.f38820b, yyVar)));
        ((org.telegram.ui.Components.l80) this.e).u();
    }

    private final void d() {
        yy yyVar = (yy) this.f38821c;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.d;
        org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.e;
        byte[] bArr = tL_sponsoredPeer.random_id;
        org.telegram.ui.ActionBar.c6 resourceProvider = yyVar.getResourceProvider();
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(12, (org.telegram.ui.Components.so0) this.f38820b, tL_sponsoredPeer);
        int i10 = i41.v;
        int currentAccount = yyVar.getCurrentAccount();
        Activity parentActivity = yyVar.getParentActivity();
        if (parentActivity != null) {
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            tL_messages_reportSponsoredMessage.random_id = bArr;
            tL_messages_reportSponsoredMessage.option = new byte[0];
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.mi(parentActivity, resourceProvider, bArr, yyVar, g90Var, currentAccount));
        }
        l80Var.u();
    }

    @Override
    public final void run() {
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        String str;
        ArrayList arrayList;
        String[] strArr;
        yr yrVar;
        xr xrVar;
        long peerId;
        int i12;
        int i13;
        String lowerCase;
        String publicUsername;
        String str2;
        String str3;
        String str4;
        boolean z12;
        boolean z13;
        float f7;
        float f10;
        char c10;
        char c11;
        float f11;
        o1.k kVar;
        float f12;
        o1.k kVar2;
        boolean z14;
        int x02;
        int x03;
        int x04;
        int x05;
        Runnable runnable;
        int i14 = this.f38819a;
        String str5 = " ";
        int i15 = -1;
        int i16 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f38821c;
        Object obj4 = this.f38820b;
        switch (i14) {
            case 0:
                t6 t6Var = (t6) obj4;
                long[] jArr = (long[]) obj2;
                s6 s6Var = (s6) obj;
                if (!((boolean[]) obj3)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    t6Var.d.showDialog(s6Var);
                    return;
                }
                return;
            case 1:
                l8.U((l8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 2:
                va.U((va) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 3:
                fo foVar = (fo) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj;
                if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    foVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
                }
                foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new fo(bundle));
                m2Var.finishFragment();
                return;
            case 4:
                fo foVar2 = (fo) obj4;
                TLObject tLObject = (TLObject) obj2;
                xa xaVar = (xa) obj;
                ((pf.c) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    foVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    foVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = foVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        xaVar.run(user);
                        return;
                    }
                }
                user = null;
                xaVar.run(user);
                return;
            case 5:
                ImageView imageView = (ImageView) obj4;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj2)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3((org.telegram.ui.Components.ds) imageView.getDrawable(), 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.es.f24465f);
                ofFloat.start();
                return;
            case 6:
                fo foVar3 = (fo) obj4;
                MessageObject messageObject2 = (MessageObject) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                boolean[] zArr = (boolean[]) obj3;
                try {
                    tL_webPage = org.telegram.ui.Components.ra0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                if (th2 == null && tL_webPage != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.runOnUIThread(new i2.f1(foVar3, a2Var, zArr, z10, messageObject2, tL_webPage, 8));
                return;
            case 7:
                fo foVar4 = (fo) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i17 = messages_messages.messages.get(0).f18937id;
                    MessageObject messageObject3 = (MessageObject) foVar4.f35753o6[0].get(i17);
                    messagesStorage.markMessageAsMention(foVar4.T5, i17);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    foVar4.j(i17, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    foVar4.f35714l6 = messages_messages.count;
                    z11 = false;
                } else {
                    z11 = false;
                    foVar4.f35714l6 = 0;
                }
                messagesStorage.resetMentionsCount(foVar4.T5, foVar4.d(), foVar4.f35714l6);
                int i18 = foVar4.f35714l6;
                if (i18 == 0) {
                    foVar4.f35726m6 = true;
                    foVar4.Ob(z11);
                    return;
                }
                foVar4.f35685j1.c(2, i18, true);
                foVar4.M9();
                return;
            case 8:
                fo.I0((fo) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (q6) obj);
                return;
            case 9:
                aq.W((aq) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 10:
                tq tqVar = (tq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                tqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    tqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 11:
                yr yrVar2 = (yr) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                dr drVar = (dr) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    drVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                a2Var2.R = string;
                a2Var2.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new b1(drVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                yrVar2.showDialog(a2Var2);
                return;
            case 12:
                xr xrVar2 = (xr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yr yrVar3 = xrVar2.f41624y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.c3(xrVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 21));
                    return;
                }
                xr xrVar3 = xrVar2;
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                translitString = (lowerCase2.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i19 = i10 + 1;
                String[] strArr2 = new String[i19];
                strArr2[0] = lowerCase2;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                String[] strArr3 = strArr2;
                a0.h hVar = new a0.h();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLObject tLObject4 = (TLObject) arrayList2.get(i20);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            arrayList = arrayList2;
                            strArr = strArr3;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            arrayList = arrayList2;
                            strArr = strArr3;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            } else {
                                yrVar = yrVar3;
                                xrVar = xrVar3;
                                i13 = size;
                                i12 = i20;
                                i20 = i12 + 1;
                                xrVar3 = xrVar;
                                arrayList2 = arrayList;
                                strArr3 = strArr;
                                yrVar3 = yrVar;
                                size = i13;
                            }
                        }
                        if (peerId > 0) {
                            TLRPC.User user3 = yrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            xrVar = xrVar3;
                            if (user3.f19063id == yrVar3.getUserConfig().getClientUserId()) {
                                yrVar = yrVar3;
                                i13 = size;
                                i12 = i20;
                                i20 = i12 + 1;
                                xrVar3 = xrVar;
                                arrayList2 = arrayList;
                                strArr3 = strArr;
                                yrVar3 = yrVar;
                                size = i13;
                            } else {
                                lowerCase = UserObject.getUserName(user3).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user3);
                                yrVar = yrVar3;
                                str2 = user3.first_name;
                                str3 = user3.last_name;
                            }
                        } else {
                            yrVar = yrVar3;
                            xrVar = xrVar3;
                            TLRPC.Chat chat = yrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str2 = chat.title;
                            str3 = null;
                        }
                        i13 = size;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        i12 = i20;
                        int i21 = 0;
                        boolean z15 = false;
                        while (true) {
                            if (i21 < i19) {
                                int i22 = i21;
                                String str6 = strArr[i22];
                                if (!lowerCase.startsWith(str6) && !org.telegram.messenger.g0.w(" ", str6, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str6) && !org.telegram.messenger.g0.w(" ", str6, translitString2)))) {
                                    if (publicUsername != null && publicUsername.startsWith(str6)) {
                                        str4 = lowerCase;
                                        z12 = true;
                                    } else {
                                        boolean z16 = z15;
                                        str4 = lowerCase;
                                        z12 = z16;
                                    }
                                } else {
                                    str4 = lowerCase;
                                    z12 = true;
                                }
                                if (z12) {
                                    if (z12) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str2, str3, str6));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(t8.b.h("@", publicUsername), null, "@" + str6));
                                    }
                                    arrayList6.add(tLObject4);
                                } else {
                                    String str7 = translitString2;
                                    i21 = i22 + 1;
                                    String str8 = str4;
                                    z15 = z12;
                                    lowerCase = str8;
                                    translitString2 = str7;
                                }
                            }
                        }
                        i20 = i12 + 1;
                        xrVar3 = xrVar;
                        arrayList2 = arrayList;
                        strArr3 = strArr;
                        yrVar3 = yrVar;
                        size = i13;
                    }
                }
                yr yrVar4 = yrVar3;
                String[] strArr4 = strArr3;
                xr xrVar4 = xrVar3;
                if (arrayList3 != null) {
                    int i23 = 0;
                    while (i23 < arrayList3.size()) {
                        TLRPC.User user4 = yrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                        if (user4.f19063id != yrVar4.getUserConfig().getClientUserId()) {
                            String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            int i24 = 0;
                            boolean z17 = false;
                            while (i24 < i19) {
                                String str9 = strArr4[i24];
                                if (lowerCase3.startsWith(str9) || org.telegram.messenger.g0.w(str5, str9, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str9) || org.telegram.messenger.g0.w(str5, str9, translitString3)))) {
                                    i11 = i23;
                                    z17 = true;
                                } else {
                                    i11 = i23;
                                    String publicUsername2 = UserObject.getPublicUsername(user4);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str9)) {
                                        z17 = true;
                                    }
                                }
                                if (z17) {
                                    str = str5;
                                    if (z17) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str9));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str9));
                                    }
                                    arrayList4.add(user4);
                                    hVar.k(user4, user4.f19063id);
                                    str5 = str;
                                    i23 = i11 + 1;
                                } else {
                                    i24++;
                                    i23 = i11;
                                }
                            }
                        }
                        i11 = i23;
                        str = str5;
                        str5 = str;
                        i23 = i11 + 1;
                    }
                }
                AndroidUtilities.runOnUIThread(new bi.c3(xrVar4, arrayList4, hVar, arrayList5, arrayList6, 21));
                return;
            case 13:
                String str10 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.e0) obj4, (Context) obj2, str10, str10, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                bi.y2 y2Var = (bi.y2) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                View view = (View) obj;
                String trim = editTextBoldCursor.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    y2Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr[0];
                    if (a2Var3 != null) {
                        a2Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 15:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i25 = 0;
                while (true) {
                    if (i25 < iArr.length) {
                        if (iArr2[0] == iArr[i25]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i25]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.arrows_select, 0);
                    brVar.spaceScaleX = 0.7f;
                    brVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    brVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.br brVar2 = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
                    brVar2.spaceScaleX = 0.7f;
                    brVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    brVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(brVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 16:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.vp0 vp0Var = (org.telegram.ui.Components.vp0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.f22644q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(ew0Var, w7.z5.e(40, 40, 3));
                    dialog.setContentView(frameLayout);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(134217728);
                    dialog.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    if (org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19880s8, true) == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(dialog, z13);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, true)) >= 0.721f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AndroidUtilities.setLightNavigationBar(dialog, z14);
                    }
                    chatActivityEnterView.f22656s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f22656s0;
                    chatActivityEnterView.f22639p0.getLocationInWindow(iArr4);
                    final float f13 = iArr4[0];
                    float f14 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.f22656s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f15 = iArr3[1] + chatActivityEnterView.f22661t0 + dp + 0.0f;
                    ew0Var.setTranslationX(dp2);
                    ew0Var.setTranslationY(f15);
                    float f16 = chatActivityEnterView.f22639p0.getLayoutParams().width;
                    if (chatActivityEnterView.f22622l5) {
                        f7 = chatActivityEnterView.f22639p0.getScaleX();
                    } else {
                        f7 = 1.0f;
                    }
                    float dp3 = (f16 * f7) / AndroidUtilities.dp(40.0f);
                    ew0Var.setPivotX(0.0f);
                    ew0Var.setPivotY(0.0f);
                    ew0Var.setScaleX(0.75f);
                    ew0Var.setScaleY(0.75f);
                    ew0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.hf(ew0Var, vp0Var));
                    dialog.show();
                    if (!chatActivityEnterView.f22622l5) {
                        f10 = 1.0f;
                        chatActivityEnterView.f22639p0.setScaleX(1.0f);
                        chatActivityEnterView.f22639p0.setScaleY(1.0f);
                    } else {
                        f10 = 1.0f;
                    }
                    chatActivityEnterView.f22639p0.setAlpha(f10);
                    org.telegram.ui.Components.gf gfVar = chatActivityEnterView.f22644q0;
                    boolean z18 = chatActivityEnterView.f22622l5;
                    o1.c cVar = o1.h.f16145o;
                    if (z18) {
                        c10 = 3;
                        c11 = 2;
                        kVar = null;
                        f11 = 0.5f;
                    } else {
                        c10 = 3;
                        o1.k kVar3 = new o1.k(chatActivityEnterView.f22639p0, cVar);
                        c11 = 2;
                        f11 = 0.5f;
                        kVar3.f16161u = org.telegram.ui.Cells.c1.j(0.5f, 750.0f, f10);
                        kVar = kVar3;
                    }
                    boolean z19 = chatActivityEnterView.f22622l5;
                    o1.c cVar2 = o1.h.f16146p;
                    if (z19) {
                        f12 = f14;
                        kVar2 = null;
                    } else {
                        f12 = f14;
                        o1.k kVar4 = new o1.k(chatActivityEnterView.f22639p0, cVar2);
                        kVar4.f16161u = org.telegram.ui.Cells.c1.j(f11, 750.0f, f10);
                        kVar2 = kVar4;
                    }
                    o1.k kVar5 = new o1.k(chatActivityEnterView.f22639p0, o1.h.f16150t);
                    kVar5.f16161u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, f10);
                    final float f17 = f12;
                    kVar5.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar2, boolean z20, float f18, float f19) {
                            int i26 = r6;
                            float f20 = f17;
                            float f21 = f13;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i26) {
                                case 0:
                                    int i27 = ChatActivityEnterView.f22549n5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f21);
                                        ew0Var2.setTranslationY(f20);
                                        xp0 xp0Var = chatActivityEnterView2.f22639p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22622l5) {
                                            chatActivityEnterView2.f22639p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22639p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22639p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22639p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i28 = ChatActivityEnterView.f22549n5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f21);
                                        ew0Var2.setTranslationY(f20);
                                        xp0 xp0Var2 = chatActivityEnterView2.f22639p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22622l5) {
                                            chatActivityEnterView2.f22639p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22639p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22639p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22639p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.k kVar6 = new o1.k(ew0Var, o1.h.f16143m);
                    kVar6.f16152b = w7.r.a(dp2, f13 - AndroidUtilities.dp(6.0f), dp2);
                    kVar6.f16153c = true;
                    kVar6.f16161u = org.telegram.ui.Cells.c1.j(f13, 700.0f, 0.75f);
                    kVar6.h = f13 - AndroidUtilities.dp(6.0f);
                    o1.k kVar7 = new o1.k(ew0Var, o1.h.f16144n);
                    kVar7.f16152b = w7.r.a(f15, f15, AndroidUtilities.dp(6.0f) + f17);
                    kVar7.f16153c = true;
                    kVar7.f16161u = org.telegram.ui.Cells.c1.j(f17, 700.0f, 0.75f);
                    kVar7.f16155g = AndroidUtilities.dp(6.0f) + f17;
                    kVar7.b(new org.telegram.ui.Components.lf(f17, ew0Var));
                    kVar7.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar2, boolean z20, float f18, float f19) {
                            int i26 = r6;
                            float f20 = f17;
                            float f21 = f13;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i26) {
                                case 0:
                                    int i27 = ChatActivityEnterView.f22549n5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f21);
                                        ew0Var2.setTranslationY(f20);
                                        xp0 xp0Var = chatActivityEnterView2.f22639p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22622l5) {
                                            chatActivityEnterView2.f22639p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22639p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22639p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22639p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i28 = ChatActivityEnterView.f22549n5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f21);
                                        ew0Var2.setTranslationY(f20);
                                        xp0 xp0Var2 = chatActivityEnterView2.f22639p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22622l5) {
                                            chatActivityEnterView2.f22639p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22639p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22639p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22639p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.k kVar8 = new o1.k(ew0Var, cVar);
                    kVar8.f16161u = org.telegram.ui.Cells.c1.j(dp3, 1000.0f, 1.0f);
                    o1.k kVar9 = new o1.k(ew0Var, cVar2);
                    kVar9.f16161u = org.telegram.ui.Cells.c1.j(dp3, 1000.0f, 1.0f);
                    o1.k[] kVarArr = new o1.k[7];
                    kVarArr[0] = kVar;
                    kVarArr[1] = kVar2;
                    kVarArr[c11] = kVar5;
                    kVarArr[c10] = kVar6;
                    kVarArr[4] = kVar7;
                    kVarArr[5] = kVar8;
                    kVarArr[6] = kVar9;
                    gfVar.l(kVarArr);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                long j10 = ioVar.V;
                final org.telegram.ui.Components.u2 u2Var = new org.telegram.ui.Components.u2(10, ioVar, (View) obj2);
                org.telegram.ui.Components.ve veVar = new org.telegram.ui.Components.ve(2);
                int i26 = org.telegram.ui.ActionBar.g6.f19707j5;
                if (c6Var != null) {
                    x02 = c6Var.b0(i26);
                } else {
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.g6.f19672h5;
                if (c6Var != null) {
                    x03 = c6Var.b0(i27);
                } else {
                    x03 = org.telegram.ui.ActionBar.g6.x0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.g6.Ji;
                if (c6Var != null) {
                    c6Var.b0(i28);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.g6.Ni;
                if (c6Var != null) {
                    c6Var.b0(i29);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.g6.E8;
                if (c6Var != null) {
                    c6Var.b0(i30);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.g6.G8;
                if (c6Var != null) {
                    c6Var.b0(i31);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.g6.f19690i6;
                if (c6Var != null) {
                    c6Var.b0(i32);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.g6.Sh;
                if (c6Var != null) {
                    x04 = c6Var.b0(i33);
                } else {
                    x04 = org.telegram.ui.ActionBar.g6.x0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.g6.Oh;
                if (c6Var != null) {
                    x05 = c6Var.b0(i34);
                } else {
                    x05 = org.telegram.ui.ActionBar.g6.x0(null, i34, false);
                }
                if (c6Var != null) {
                    c6Var.b0(org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.g5.f24879a;
                if (context != null) {
                    int i35 = x05;
                    final int i36 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
                    z2Var.a();
                    final org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context, c6Var);
                    ud0Var.setTextColor(x02);
                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    ud0Var.setItemCount(5);
                    final ?? ud0Var2 = new org.telegram.ui.Components.ud0(context, c6Var);
                    ud0Var2.setWrapSelectorWheel(true);
                    ud0Var2.setAllItemsCount(24);
                    ud0Var2.setItemCount(5);
                    ud0Var2.setTextColor(x02);
                    ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? ud0Var3 = new org.telegram.ui.Components.ud0(context, c6Var);
                    ud0Var3.setWrapSelectorWheel(true);
                    ud0Var3.setAllItemsCount(60);
                    ud0Var3.setItemCount(5);
                    ud0Var3.setTextColor(x02);
                    ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, ud0Var, ud0Var2, ud0Var3, 2);
                    y3Var.setOrientation(1);
                    frameLayout2.addView(y3Var, w7.z5.d(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context), w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    y3Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(x02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout3.addView(textView2, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                    textView2.setOnTouchListener(new ci.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    y3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19838q5, c6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.f4 f4Var = new bi.f4(context, 16);
                    f4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.b6.b(f4Var, 0.02f, 1.2f);
                    linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                    ud0Var.setMinValue(0);
                    ud0Var.setMaxValue(365);
                    ud0Var.setWrapSelectorWheel(false);
                    ud0Var.setFormatter(new is(22));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i36, ud0Var, (org.telegram.ui.Components.f4) ud0Var2, (org.telegram.ui.Components.g4) ud0Var3, textView3);
                    ud0Var.setOnValueChangedListener(e2Var);
                    ud0Var2.setMinValue(0);
                    ud0Var2.setMaxValue(23);
                    int i37 = x03;
                    linearLayout.addView((View) ud0Var2, w7.z5.l(0.2f, 0, 270));
                    ud0Var2.setFormatter(new is(23));
                    ud0Var2.setOnValueChangedListener(e2Var);
                    ud0Var3.setMinValue(0);
                    ud0Var3.setMaxValue(59);
                    ud0Var3.setValue(0);
                    ud0Var3.setFormatter(new is(24));
                    linearLayout.addView((View) ud0Var3, w7.z5.l(0.3f, 0, 270));
                    ud0Var3.setOnValueChangedListener(e2Var);
                    if (j10 > 0 && j10 != 2147483646) {
                        long j11 = j10 * 1000;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            ud0Var3.setValue(calendar.get(12));
                            ud0Var2.setValue(calendar.get(11));
                            ud0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.g5.f(null, null, 0L, i36, 3, ud0Var, ud0Var2, ud0Var3);
                    org.telegram.ui.Components.g5.d(textView3, ud0Var, ud0Var2, ud0Var3);
                    f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    f4Var.setGravity(17);
                    f4Var.setTextColor(x04);
                    f4Var.setTextSize(1, 14.0f);
                    f4Var.setTypeface(AndroidUtilities.bold());
                    f4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, i35));
                    y3Var.addView(f4Var, w7.z5.t(-1, 48, 83, 14, 15, 14, 16));
                    f4Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr2[0] = false;
                            ud0 ud0Var4 = ud0Var;
                            f4 f4Var2 = ud0Var2;
                            g4 g4Var = ud0Var3;
                            boolean f18 = g5.f(null, null, 0L, i36, 3, ud0Var4, f4Var2, g4Var);
                            g5.d(textView3, ud0Var4, f4Var2, g4Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ud0Var4.getValue());
                            calendar2.set(11, f4Var2.getValue());
                            calendar2.set(12, g4Var.getValue());
                            if (f18) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            u2Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = z2Var.f20538a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    y3Var.addView(textView3, w7.z5.t(-1, -2, 83, 14, 0, 14, 16));
                    z2Var.b(frameLayout2);
                    org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
                    e3Var.show();
                    e3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, veVar, zArr2));
                    e3Var.setBackgroundColor(i37);
                    e3Var.fixNavigationBar(i37);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj4;
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = (org.telegram.ui.ActionBar.a2[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj;
                ryVar.getClass();
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    pf.d.r(ryVar.f28663c.f28929a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    runnable = z2Var2.f20538a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = pzVar.f28139s;
                org.telegram.ui.Components.rz rzVar = pzVar.f28140w;
                if (rzVar.M == pzVar.f28134b) {
                    rzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(pzVar.f28133a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i16 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i16);
                            if (pzVar.v.indexOfKey(document.f18922id) < 0) {
                                arrayList7.add(document);
                            }
                            i16++;
                        }
                        if (size2 != arrayList7.size()) {
                            pzVar.f28136f.put(arrayList7, rzVar.N);
                            if (size2 == 0) {
                                pzVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.o10 o10Var = (org.telegram.ui.Components.o10) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                o10Var.f27495z0 = -1;
                org.telegram.ui.ActionBar.m2 m2Var2 = o10Var.f24070n;
                k10.r0((TLRPC.TL_error) obj3, m2Var2, org.telegram.ui.Components.zc.a0(m2Var2));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i15 = ((TL_update.TL_updateDialogFilter) update).f19169id;
                            }
                        } else {
                            while (true) {
                                if (i16 < arrayList8.size()) {
                                    if (arrayList8.get(i16) instanceof TL_update.TL_updateDialogFilter) {
                                        i15 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i16)).f19169id;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                    if (o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        m2Var2.getMessagesController().loadRemoteFilters(true, new fi.r4(o10Var, callback, i15, 3));
                        return;
                    }
                    if (o10Var.f27471a0 != null) {
                        m2Var2.getMessagesController().checkChatlistFolderUpdate(o10Var.Y, true);
                    }
                    o10Var.A0 = true;
                    o10Var.dismiss();
                    callback.run(Integer.valueOf(i15));
                    return;
                }
                o10Var.f27482l0.a(false);
                return;
            case 21:
                ((yy) obj4).u4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vm(23, (uc) obj2, (org.telegram.ui.ActionBar.m2) obj), 200L);
                return;
            case 22:
                org.telegram.ui.Components.e40.O((org.telegram.ui.Components.e40) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 23:
                org.telegram.ui.Components.f90.o((org.telegram.ui.Components.f90) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                di.d dVar = (di.d) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (tL_error2 != null) {
                    org.telegram.ui.Components.zc.X().f0(tL_error2, false);
                    return;
                }
                dVar.setLoading(false);
                e3Var2.dismiss();
                org.telegram.ui.Components.zc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable3.run();
                return;
            case 27:
                c();
                return;
            case 28:
                d();
                return;
            default:
                org.telegram.ui.Components.ir0.n((org.telegram.ui.Components.ir0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.pq0) obj2, (TLRPC.Dialog) obj);
                return;
        }
    }

    public p6(fo foVar, MessageObject messageObject, org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr) {
        this.f38819a = 6;
        this.f38820b = foVar;
        this.d = messageObject;
        this.e = a2Var;
        this.f38821c = zArr;
    }

    public p6(long[] jArr, boolean[] zArr, ImageView imageView, ImageView imageView2) {
        this.f38819a = 5;
        this.d = jArr;
        this.f38821c = zArr;
        this.f38820b = imageView;
        this.e = imageView2;
    }
}
