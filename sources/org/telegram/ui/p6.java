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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
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
    public final int f39125a;
    public final Object f39126b;
    public final Object f39127c;
    public final Object d;
    public final Object e;

    public p6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39125a = i10;
        this.f39126b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f39127c = obj4;
    }

    private final void a() {
        org.telegram.ui.Components.e40.O((org.telegram.ui.Components.e40) this.f39126b, (TLRPC.TL_error) this.d, (TLObject) this.e, (TLRPC.TL_channels_getParticipants) this.f39127c);
    }

    private final void b() {
        org.telegram.ui.Components.g90.o((org.telegram.ui.Components.g90) this.f39126b, (TLRPC.TL_error) this.d, (TLRPC.Updates) this.e, (TLRPC.TL_messages_importChatInvite) this.f39127c);
    }

    private final void c() {
        org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) this.f39126b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLObject tLObject = (TLObject) this.f39127c;
        w90Var.f30835y = false;
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

    private final void d() {
        org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) this.f39126b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.e;
        ((boolean[]) this.f39127c)[0] = true;
        AndroidUtilities.cancelRunOnUIThread(cb0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr[i10];
        }
        cb0Var.getMessagesController().getStoriesController().n0(cb0Var.e, arrayList, false);
    }

    private final void f() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f39126b;
        di.d dVar = (di.d) this.d;
        org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
        Runnable runnable = (Runnable) this.f39127c;
        if (tL_error != null) {
            org.telegram.ui.Components.zc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        e3Var.dismiss();
        org.telegram.ui.Components.zc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
        runnable.run();
    }

    private final void g() {
        yy yyVar = (yy) this.d;
        yyVar.showDialog(new b51((Context) this.e, yyVar.getResourceProvider(), new org.telegram.ui.Components.f60(18, (org.telegram.ui.Components.so0) this.f39126b, yyVar)));
        ((org.telegram.ui.Components.m80) this.f39127c).u();
    }

    @Override
    public final void run() {
        TLRPC.User user;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        boolean z11;
        int i10;
        yr yrVar;
        String[] strArr;
        xr xrVar;
        ArrayList arrayList;
        int i11;
        int i12;
        long peerId;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        float f7;
        float f10;
        char c10;
        char c11;
        float f11;
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        boolean z14;
        int x02;
        int x03;
        int x04;
        int x05;
        ViewGroup viewGroup;
        Runnable runnable;
        int i13 = this.f39125a;
        int i14 = -1;
        int i15 = 0;
        Object obj = this.f39127c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f39126b;
        switch (i13) {
            case 0:
                t6 t6Var = (t6) obj4;
                t6Var.getClass();
                ((v6) obj3).a(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    t6Var.d.w0(true);
                    return;
                }
                return;
            case 1:
                t6 t6Var2 = (t6) obj4;
                long[] jArr = (long[]) obj3;
                s6 s6Var = (s6) obj2;
                if (!((boolean[]) obj)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    t6Var2.d.showDialog(s6Var);
                    return;
                }
                return;
            case 2:
                l8.U((l8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 3:
                va.U((va) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 4:
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
            case 5:
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
            case 6:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3((org.telegram.ui.Components.ds) imageView.getDrawable(), 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.es.f24771f);
                ofFloat.start();
                return;
            case 7:
                fo foVar3 = (fo) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.ra0.f(messageObject2);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    tL_webPage = null;
                }
                if (th == null && tL_webPage != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.runOnUIThread(new i2.f1(foVar3, a2Var, zArr, z10, messageObject2, tL_webPage, 8));
                return;
            case 8:
                fo foVar4 = (fo) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i16 = messages_messages.messages.get(0).f19237id;
                    MessageObject messageObject3 = (MessageObject) foVar4.f36052o6[0].get(i16);
                    messagesStorage.markMessageAsMention(foVar4.T5, i16);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    foVar4.j(i16, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    foVar4.f36013l6 = messages_messages.count;
                    z11 = false;
                } else {
                    z11 = false;
                    foVar4.f36013l6 = 0;
                }
                messagesStorage.resetMentionsCount(foVar4.T5, foVar4.d(), foVar4.f36013l6);
                int i17 = foVar4.f36013l6;
                if (i17 == 0) {
                    foVar4.f36025m6 = true;
                    foVar4.Ob(z11);
                    return;
                }
                foVar4.f35984j1.c(2, i17, true);
                foVar4.M9();
                return;
            case 9:
                fo.I0((fo) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (q6) obj);
                return;
            case 10:
                aq.W((aq) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 11:
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
            case 12:
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
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19548a;
                a2Var2.R = string;
                a2Var2.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new b1(drVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                yrVar2.showDialog(a2Var2);
                return;
            case 13:
                xr xrVar2 = (xr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yr yrVar3 = xrVar2.f41922y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.c3(xrVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 21));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                translitString = (lowerCase2.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i18 = i10 + 1;
                String[] strArr2 = new String[i18];
                strArr2[0] = lowerCase2;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                String[] strArr3 = strArr2;
                ArrayList arrayList4 = new ArrayList();
                a0.h hVar = new a0.h();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLObject tLObject4 = (TLObject) arrayList2.get(i19);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            yrVar = yrVar3;
                            strArr = strArr3;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            yrVar = yrVar3;
                            strArr = strArr3;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            } else {
                                xrVar = xrVar2;
                                arrayList = arrayList2;
                                i11 = size;
                                i12 = i19;
                                i19 = i12 + 1;
                                size = i11;
                                yrVar3 = yrVar;
                                strArr3 = strArr;
                                xrVar2 = xrVar;
                                arrayList2 = arrayList;
                            }
                        }
                        if (peerId > 0) {
                            TLRPC.User user3 = yrVar.getMessagesController().getUser(Long.valueOf(peerId));
                            i11 = size;
                            i12 = i19;
                            if (user3.f19363id == yrVar.getUserConfig().getClientUserId()) {
                                xrVar = xrVar2;
                                arrayList = arrayList2;
                                i19 = i12 + 1;
                                size = i11;
                                yrVar3 = yrVar;
                                strArr3 = strArr;
                                xrVar2 = xrVar;
                                arrayList2 = arrayList;
                            } else {
                                lowerCase = UserObject.getUserName(user3).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user3);
                                str = user3.first_name;
                                str2 = user3.last_name;
                            }
                        } else {
                            i11 = size;
                            i12 = i19;
                            TLRPC.Chat chat = yrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        xrVar = xrVar2;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        arrayList = arrayList2;
                        int i20 = 0;
                        boolean z15 = false;
                        while (true) {
                            if (i20 < i18) {
                                int i21 = i20;
                                String str4 = strArr[i21];
                                if (!lowerCase.startsWith(str4) && !org.telegram.messenger.yh.v(" ", str4, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.yh.v(" ", str4, translitString2)))) {
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        str3 = lowerCase;
                                        z12 = true;
                                    } else {
                                        boolean z16 = z15;
                                        str3 = lowerCase;
                                        z12 = z16;
                                    }
                                } else {
                                    str3 = lowerCase;
                                    z12 = true;
                                }
                                if (z12) {
                                    if (z12) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(t8.b.h("@", publicUsername), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject4);
                                } else {
                                    String str5 = translitString2;
                                    i20 = i21 + 1;
                                    String str6 = str3;
                                    z15 = z12;
                                    lowerCase = str6;
                                    translitString2 = str5;
                                }
                            }
                        }
                        i19 = i12 + 1;
                        size = i11;
                        yrVar3 = yrVar;
                        strArr3 = strArr;
                        xrVar2 = xrVar;
                        arrayList2 = arrayList;
                    }
                }
                yr yrVar4 = yrVar3;
                String[] strArr4 = strArr3;
                xr xrVar3 = xrVar2;
                if (arrayList3 != null) {
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        TLRPC.User user4 = yrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                        if (user4.f19363id != yrVar4.getUserConfig().getClientUserId()) {
                            String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            int i23 = 0;
                            boolean z17 = false;
                            while (true) {
                                if (i23 < i18) {
                                    String str7 = strArr4[i23];
                                    if (!lowerCase3.startsWith(str7) && !org.telegram.messenger.yh.v(" ", str7, lowerCase3) && (translitString3 == null || (!translitString3.startsWith(str7) && !org.telegram.messenger.yh.v(" ", str7, translitString3)))) {
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                            z17 = true;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        if (z17) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str7));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str7));
                                        }
                                        arrayList4.add(user4);
                                        hVar.k(user4, user4.f19363id);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new bi.c3(xrVar3, arrayList4, hVar, arrayList5, arrayList6, 21));
                return;
            case 14:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.e0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 15:
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
            case 16:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i24]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
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
            case 17:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.vp0 vp0Var = (org.telegram.ui.Components.vp0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.f22944q0 != null) {
                    Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(ew0Var, w7.a6.e(40, 40, 3));
                    dialog2.setContentView(frameLayout);
                    dialog2.getWindow().setLayout(-1, -1);
                    dialog2.getWindow().clearFlags(1024);
                    dialog2.getWindow().clearFlags(67108864);
                    dialog2.getWindow().clearFlags(134217728);
                    dialog2.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog2.getWindow().addFlags(512);
                    dialog2.getWindow().addFlags(131072);
                    dialog2.getWindow().getAttributes().windowAnimations = 0;
                    dialog2.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog2.getWindow().setStatusBarColor(0);
                    dialog2.getWindow().setNavigationBarColor(0);
                    if (org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20180s8, true) == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AndroidUtilities.setLightStatusBar(dialog2, z13);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, true)) >= 0.721f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AndroidUtilities.setLightNavigationBar(dialog2, z14);
                    }
                    chatActivityEnterView.f22956s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f22956s0;
                    chatActivityEnterView.f22939p0.getLocationInWindow(iArr4);
                    final float f12 = iArr4[0];
                    final float f13 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.f22956s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f14 = iArr3[1] + chatActivityEnterView.f22961t0 + dp + 0.0f;
                    ew0Var.setTranslationX(dp2);
                    ew0Var.setTranslationY(f14);
                    float f15 = chatActivityEnterView.f22939p0.getLayoutParams().width;
                    if (chatActivityEnterView.f22922l5) {
                        f7 = chatActivityEnterView.f22939p0.getScaleX();
                    } else {
                        f7 = 1.0f;
                    }
                    float dp3 = (f15 * f7) / AndroidUtilities.dp(40.0f);
                    ew0Var.setPivotX(0.0f);
                    ew0Var.setPivotY(0.0f);
                    ew0Var.setScaleX(0.75f);
                    ew0Var.setScaleY(0.75f);
                    ew0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.hf(ew0Var, vp0Var));
                    dialog2.show();
                    if (!chatActivityEnterView.f22922l5) {
                        f10 = 1.0f;
                        chatActivityEnterView.f22939p0.setScaleX(1.0f);
                        chatActivityEnterView.f22939p0.setScaleY(1.0f);
                    } else {
                        f10 = 1.0f;
                    }
                    chatActivityEnterView.f22939p0.setAlpha(f10);
                    org.telegram.ui.Components.gf gfVar = chatActivityEnterView.f22944q0;
                    boolean z18 = chatActivityEnterView.f22922l5;
                    o1.c cVar = o1.h.f16452o;
                    if (z18) {
                        c10 = 3;
                        c11 = 2;
                        kVar = null;
                        f11 = 0.5f;
                    } else {
                        c10 = 3;
                        o1.k kVar3 = new o1.k(chatActivityEnterView.f22939p0, cVar);
                        c11 = 2;
                        f11 = 0.5f;
                        kVar3.f16468u = org.telegram.ui.Cells.d0.k(0.5f, 750.0f, f10);
                        kVar = kVar3;
                    }
                    boolean z19 = chatActivityEnterView.f22922l5;
                    o1.c cVar2 = o1.h.f16453p;
                    if (z19) {
                        dialog = dialog2;
                        kVar2 = null;
                    } else {
                        dialog = dialog2;
                        o1.k kVar4 = new o1.k(chatActivityEnterView.f22939p0, cVar2);
                        kVar4.f16468u = org.telegram.ui.Cells.d0.k(f11, 750.0f, f10);
                        kVar2 = kVar4;
                    }
                    o1.k kVar5 = new o1.k(chatActivityEnterView.f22939p0, o1.h.f16457t);
                    kVar5.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 750.0f, f10);
                    final Dialog dialog3 = dialog;
                    kVar5.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar2, boolean z20, float f16, float f17) {
                            int i25 = r6;
                            float f18 = f13;
                            float f19 = f12;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i25) {
                                case 0:
                                    int i26 = ChatActivityEnterView.f22849n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var = chatActivityEnterView2.f22939p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22922l5) {
                                            chatActivityEnterView2.f22939p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22939p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22939p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22939p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i27 = ChatActivityEnterView.f22849n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var2 = chatActivityEnterView2.f22939p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22922l5) {
                                            chatActivityEnterView2.f22939p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22939p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22939p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22939p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.k kVar6 = new o1.k(ew0Var, o1.h.f16450m);
                    kVar6.f16459b = w7.s.a(dp2, f12 - AndroidUtilities.dp(6.0f), dp2);
                    kVar6.f16460c = true;
                    kVar6.f16468u = org.telegram.ui.Cells.d0.k(f12, 700.0f, 0.75f);
                    kVar6.h = f12 - AndroidUtilities.dp(6.0f);
                    o1.k kVar7 = new o1.k(ew0Var, o1.h.f16451n);
                    kVar7.f16459b = w7.s.a(f14, f14, AndroidUtilities.dp(6.0f) + f13);
                    kVar7.f16460c = true;
                    kVar7.f16468u = org.telegram.ui.Cells.d0.k(f13, 700.0f, 0.75f);
                    kVar7.f16462g = AndroidUtilities.dp(6.0f) + f13;
                    kVar7.b(new org.telegram.ui.Components.lf(f13, ew0Var));
                    kVar7.a(new o1.f() {
                        @Override
                        public final void a(o1.h hVar2, boolean z20, float f16, float f17) {
                            int i25 = r6;
                            float f18 = f13;
                            float f19 = f12;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i25) {
                                case 0:
                                    int i26 = ChatActivityEnterView.f22849n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var = chatActivityEnterView2.f22939p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22922l5) {
                                            chatActivityEnterView2.f22939p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22939p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22939p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22939p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i27 = ChatActivityEnterView.f22849n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var2 = chatActivityEnterView2.f22939p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f22922l5) {
                                            chatActivityEnterView2.f22939p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f22939p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f22939p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f22939p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.k kVar8 = new o1.k(ew0Var, cVar);
                    kVar8.f16468u = org.telegram.ui.Cells.d0.k(dp3, 1000.0f, 1.0f);
                    o1.k kVar9 = new o1.k(ew0Var, cVar2);
                    kVar9.f16468u = org.telegram.ui.Cells.d0.k(dp3, 1000.0f, 1.0f);
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
            case 18:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                long j10 = ioVar.V;
                final org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(11, ioVar, (View) obj2);
                org.telegram.ui.Components.ve veVar = new org.telegram.ui.Components.ve(2);
                int i25 = org.telegram.ui.ActionBar.g6.f20007j5;
                if (c6Var != null) {
                    x02 = c6Var.b0(i25);
                } else {
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, i25, false);
                }
                int i26 = org.telegram.ui.ActionBar.g6.f19972h5;
                if (c6Var != null) {
                    x03 = c6Var.b0(i26);
                } else {
                    x03 = org.telegram.ui.ActionBar.g6.x0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.g6.Ji;
                if (c6Var != null) {
                    c6Var.b0(i27);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.g6.Ni;
                if (c6Var != null) {
                    c6Var.b0(i28);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.g6.E8;
                if (c6Var != null) {
                    c6Var.b0(i29);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.g6.G8;
                if (c6Var != null) {
                    c6Var.b0(i30);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.g6.f19990i6;
                if (c6Var != null) {
                    c6Var.b0(i31);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.g6.Sh;
                if (c6Var != null) {
                    x04 = c6Var.b0(i32);
                } else {
                    x04 = org.telegram.ui.ActionBar.g6.x0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.g6.Oh;
                if (c6Var != null) {
                    x05 = c6Var.b0(i33);
                } else {
                    x05 = org.telegram.ui.ActionBar.g6.x0(null, i33, false);
                }
                if (c6Var != null) {
                    c6Var.b0(org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.g5.f25184a;
                if (context != null) {
                    int i34 = x05;
                    final int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
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
                    ?? ud0Var3 = new org.telegram.ui.Components.ud0(context, c6Var);
                    ud0Var3.setWrapSelectorWheel(true);
                    ud0Var3.setAllItemsCount(60);
                    ud0Var3.setItemCount(5);
                    ud0Var3.setTextColor(x02);
                    ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ViewGroup frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, ud0Var, ud0Var2, ud0Var3, 2);
                    y3Var.setOrientation(1);
                    frameLayout2.addView(y3Var, w7.a6.d(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context), w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    y3Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(x02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout3.addView(textView2, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                    textView2.setOnTouchListener(new ci.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    y3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20138q5, c6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.f4 f4Var = new bi.f4(context, 16);
                    f4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.c6.b(f4Var, 0.02f, 1.2f);
                    linearLayout.addView(ud0Var, w7.a6.l(0.5f, 0, 270));
                    ud0Var.setMinValue(0);
                    ud0Var.setMaxValue(365);
                    ud0Var.setWrapSelectorWheel(false);
                    ud0Var.setFormatter(new is(24));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i35, ud0Var, (org.telegram.ui.Components.f4) ud0Var2, (org.telegram.ui.Components.g4) ud0Var3, textView3);
                    org.telegram.ui.Components.g4 g4Var = ud0Var3;
                    ud0Var.setOnValueChangedListener(e2Var);
                    ud0Var2.setMinValue(0);
                    ud0Var2.setMaxValue(23);
                    int i36 = x03;
                    linearLayout.addView((View) ud0Var2, w7.a6.l(0.2f, 0, 270));
                    ud0Var2.setFormatter(new is(25));
                    ud0Var2.setOnValueChangedListener(e2Var);
                    g4Var.setMinValue(0);
                    g4Var.setMaxValue(59);
                    g4Var.setValue(0);
                    g4Var.setFormatter(new is(26));
                    linearLayout.addView(g4Var, w7.a6.l(0.3f, 0, 270));
                    g4Var.setOnValueChangedListener(e2Var);
                    if (j10 > 0 && j10 != 2147483646) {
                        long j11 = 1000 * j10;
                        viewGroup = frameLayout2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            g4Var = g4Var;
                            g4Var.setValue(calendar.get(12));
                            ud0Var2.setValue(calendar.get(11));
                            ud0Var.setValue(timeInMillis);
                        } else {
                            g4Var = g4Var;
                        }
                    } else {
                        viewGroup = frameLayout2;
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.g5.f(null, null, 0L, i35, 3, ud0Var, ud0Var2, g4Var);
                    org.telegram.ui.Components.g5.d(textView3, ud0Var, ud0Var2, g4Var);
                    f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    f4Var.setGravity(17);
                    f4Var.setTextColor(x04);
                    f4Var.setTextSize(1, 14.0f);
                    f4Var.setTypeface(AndroidUtilities.bold());
                    f4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, i34));
                    y3Var.addView(f4Var, w7.a6.t(-1, 48, 83, 14, 15, 14, 16));
                    final org.telegram.ui.Components.g4 g4Var2 = g4Var;
                    f4Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr2[0] = false;
                            ud0 ud0Var4 = ud0Var;
                            f4 f4Var2 = ud0Var2;
                            g4 g4Var3 = g4Var2;
                            boolean f16 = g5.f(null, null, 0L, i35, 3, ud0Var4, f4Var2, g4Var3);
                            g5.d(textView3, ud0Var4, f4Var2, g4Var3);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ud0Var4.getValue());
                            calendar2.set(11, f4Var2.getValue());
                            calendar2.set(12, g4Var3.getValue());
                            if (f16) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            t2Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = z2Var.f20838a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    y3Var.addView(textView3, w7.a6.t(-1, -2, 83, 14, 0, 14, 16));
                    z2Var.b(viewGroup);
                    org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20838a;
                    e3Var.show();
                    e3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, veVar, zArr2));
                    e3Var.setBackgroundColor(i36);
                    e3Var.fixNavigationBar(i36);
                    return;
                }
                return;
            case 19:
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
                    pf.d.s(ryVar.f28963c.f29229a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    runnable = z2Var2.f20838a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = pzVar.f28457s;
                org.telegram.ui.Components.rz rzVar = pzVar.f28458w;
                if (rzVar.M == pzVar.f28452b) {
                    rzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(pzVar.f28451a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i15);
                            if (pzVar.v.indexOfKey(document.f19222id) < 0) {
                                arrayList7.add(document);
                            }
                            i15++;
                        }
                        if (size2 != arrayList7.size()) {
                            pzVar.f28454f.put(arrayList7, rzVar.N);
                            if (size2 == 0) {
                                pzVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.o10 o10Var = (org.telegram.ui.Components.o10) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                o10Var.f27792z0 = -1;
                org.telegram.ui.ActionBar.m2 m2Var2 = o10Var.f24345n;
                l10.r0((TLRPC.TL_error) obj3, m2Var2, org.telegram.ui.Components.zc.a0(m2Var2));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f19469id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).f19469id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        m2Var2.getMessagesController().loadRemoteFilters(true, new fi.r4(o10Var, callback, i14, 3));
                        return;
                    }
                    if (o10Var.f27768a0 != null) {
                        m2Var2.getMessagesController().checkChatlistFolderUpdate(o10Var.Y, true);
                    }
                    o10Var.A0 = true;
                    o10Var.dismiss();
                    callback.run(Integer.valueOf(i14));
                    return;
                }
                o10Var.f27779l0.a(false);
                return;
            case 22:
                ((yy) obj4).t4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sk(28, (vc) obj2, (org.telegram.ui.ActionBar.m2) obj), 200L);
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                yy yyVar = (yy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.c6 resourceProvider = yyVar.getResourceProvider();
                org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(17, (org.telegram.ui.Components.so0) obj4, tL_sponsoredPeer);
                int i37 = i41.v;
                int currentAccount = yyVar.getCurrentAccount();
                Activity parentActivity = yyVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ni(parentActivity, resourceProvider, bArr, yyVar, f60Var, currentAccount));
                }
                m80Var.u();
                return;
        }
    }

    public p6(Object obj, boolean[] zArr, Object obj2, Object obj3, int i10) {
        this.f39125a = i10;
        this.f39126b = obj;
        this.f39127c = zArr;
        this.d = obj2;
        this.e = obj3;
    }
}
