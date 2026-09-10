package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
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
import org.telegram.messenger.MediaDataController;
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
public final class da implements Runnable {
    public final int f31868a;
    public final Object f31869b;
    public final Object f31870c;
    public final Object d;
    public final Object e;

    public da(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f31868a = i10;
        this.f31869b = obj;
        this.f31870c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        TLRPC.User user;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        ArrayList arrayList;
        long peerId;
        int i12;
        String[] strArr;
        vr vrVar;
        wr wrVar;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        char c10;
        int w02;
        int w03;
        int w04;
        int w05;
        org.telegram.ui.Components.v3 v3Var;
        Runnable runnable;
        int i13 = this.f31868a;
        int i14 = -1;
        int i15 = 0;
        Object obj = this.e;
        Object obj2 = this.f31870c;
        Object obj3 = this.d;
        Object obj4 = this.f31869b;
        switch (i13) {
            case 0:
                ra.U((ra) obj4, (org.telegram.ui.ActionBar.d2) obj2, (TLRPC.TL_error) obj3, (TL_account.updateUsername) obj);
                return;
            case 1:
                eo eoVar = (eo) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                MessageObject messageObject = (MessageObject) obj3;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj;
                if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    eoVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
                }
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) f5Var).c(f5Var.getFragmentStack().size() - 1, new eo(bundle));
                p2Var.finishFragment();
                return;
            case 2:
                eo eoVar2 = (eo) obj4;
                TLObject tLObject = (TLObject) obj3;
                ua uaVar = (ua) obj;
                ((nf.e) obj2).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    eoVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    eoVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = eoVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        uaVar.run(user);
                        return;
                    }
                }
                user = null;
                uaVar.run(user);
                return;
            case 3:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj2)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d3((org.telegram.ui.Components.vr) imageView.getDrawable(), 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                ofFloat.start();
                return;
            case 4:
                eo eoVar3 = (eo) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.aa0.f(messageObject2);
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
                AndroidUtilities.runOnUIThread(new i2.a1(eoVar3, d2Var, zArr, z10, messageObject2, tL_webPage, 7));
                return;
            case 5:
                eo eoVar4 = (eo) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj2);
                if (((TLRPC.TL_error) obj3) == null && !messages_messages.messages.isEmpty()) {
                    int i16 = messages_messages.messages.get(0).f17216id;
                    MessageObject messageObject3 = (MessageObject) eoVar4.f32433o6[0].get(i16);
                    messagesStorage.markMessageAsMention(eoVar4.T5, i16);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    eoVar4.E(i16, 0, 0, 0, false, true);
                    return;
                }
                if (messages_messages != null) {
                    eoVar4.f32396l6 = messages_messages.count;
                    z11 = false;
                } else {
                    z11 = false;
                    eoVar4.f32396l6 = 0;
                }
                messagesStorage.resetMentionsCount(eoVar4.T5, eoVar4.d(), eoVar4.f32396l6);
                int i17 = eoVar4.f32396l6;
                if (i17 == 0) {
                    eoVar4.f32408m6 = true;
                    eoVar4.Kb(z11);
                    return;
                }
                eoVar4.f32368j1.c(2, i17, true);
                eoVar4.H9();
                return;
            case 6:
                eo.n0((eo) obj4, (TLRPC.TL_messageMediaWebPage) obj2, (TLRPC.TL_webPageAttributeStory) obj3, (m6) obj);
                return;
            case 7:
                yp.W((yp) obj4, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.Chat) obj3, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 8:
                rq rqVar = (rq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                rqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    rqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 9:
                wr wrVar2 = (wr) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj3;
                br brVar = (br) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    brVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wrVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
                d2Var2.R = string;
                d2Var2.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a1(brVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                wrVar2.showDialog(d2Var2);
                return;
            case 10:
                vr vrVar2 = (vr) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                wr wrVar3 = vrVar2.f37616y;
                String lowerCase2 = ((String) obj2).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.ya(vrVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 17));
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
                ArrayList arrayList4 = new ArrayList();
                a0.i iVar = new a0.i();
                ArrayList arrayList5 = new ArrayList();
                String[] strArr3 = strArr2;
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLObject tLObject4 = (TLObject) arrayList2.get(i19);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            i11 = i19;
                            arrayList = arrayList2;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            i11 = i19;
                            arrayList = arrayList2;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            wrVar = wrVar3;
                            vrVar = vrVar2;
                            strArr = strArr3;
                            i12 = size;
                            i19 = i11 + 1;
                            arrayList2 = arrayList;
                            wrVar3 = wrVar;
                            vrVar2 = vrVar;
                            strArr3 = strArr;
                            size = i12;
                        }
                        if (peerId > 0) {
                            TLRPC.User user3 = wrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            if (user3.f17342id != wrVar3.getUserConfig().getClientUserId()) {
                                lowerCase = UserObject.getUserName(user3).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user3);
                                wrVar = wrVar3;
                                str = user3.first_name;
                                str2 = user3.last_name;
                            }
                            wrVar = wrVar3;
                            vrVar = vrVar2;
                            strArr = strArr3;
                            i12 = size;
                            i19 = i11 + 1;
                            arrayList2 = arrayList;
                            wrVar3 = wrVar;
                            vrVar2 = vrVar;
                            strArr3 = strArr;
                            size = i12;
                        } else {
                            wrVar = wrVar3;
                            TLRPC.Chat chat = wrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        vrVar = vrVar2;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        strArr = strArr3;
                        int i20 = 0;
                        char c11 = 0;
                        while (i20 < i18) {
                            int i21 = i20;
                            String str4 = strArr[i21];
                            if (!lowerCase.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, translitString2)))) {
                                if (publicUsername != null && publicUsername.startsWith(str4)) {
                                    str3 = translitString2;
                                    c10 = 2;
                                } else {
                                    char c12 = c11;
                                    str3 = translitString2;
                                    c10 = c12;
                                }
                            } else {
                                str3 = translitString2;
                                c10 = 1;
                            }
                            if (c10 != 0) {
                                i12 = size;
                                if (c10 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.r6.i("@", publicUsername), null, "@" + str4));
                                }
                                arrayList6.add(tLObject4);
                                i19 = i11 + 1;
                                arrayList2 = arrayList;
                                wrVar3 = wrVar;
                                vrVar2 = vrVar;
                                strArr3 = strArr;
                                size = i12;
                            } else {
                                int i22 = size;
                                i20 = i21 + 1;
                                String str5 = str3;
                                c11 = c10;
                                translitString2 = str5;
                                size = i22;
                            }
                        }
                        i12 = size;
                        i19 = i11 + 1;
                        arrayList2 = arrayList;
                        wrVar3 = wrVar;
                        vrVar2 = vrVar;
                        strArr3 = strArr;
                        size = i12;
                    }
                }
                wr wrVar4 = wrVar3;
                vr vrVar3 = vrVar2;
                String[] strArr4 = strArr3;
                if (arrayList3 != null) {
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        TLRPC.User user4 = wrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                        if (user4.f17342id != wrVar4.getUserConfig().getClientUserId()) {
                            String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            char c13 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i24 < i18) {
                                    String str6 = strArr4[i24];
                                    if (!lowerCase3.startsWith(str6) && !org.telegram.messenger.a2.w(" ", str6, lowerCase3) && (translitString3 == null || (!translitString3.startsWith(str6) && !org.telegram.messenger.a2.w(" ", str6, translitString3)))) {
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                            c13 = 2;
                                        }
                                    } else {
                                        c13 = 1;
                                    }
                                    if (c13 != 0) {
                                        if (c13 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str6));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str6));
                                        }
                                        arrayList4.add(user4);
                                        iVar.k(user4, user4.f17342id);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new bi.ya(vrVar3, arrayList4, iVar, arrayList5, arrayList6, 17));
                return;
            case 11:
                String str7 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj2).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.g0) obj4, (Context) obj3, str7, str7, (org.telegram.ui.ActionBar.f6) obj).show();
                return;
            case 12:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                bi.ve veVar = (bi.ve) obj2;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj3;
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
                    veVar.run(lowerCase4);
                    org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
                    if (d2Var3 != null) {
                        d2Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 13:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj2;
                String[] strArr5 = (String[]) obj3;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.arrows_select, 0);
                    uqVar.spaceScaleX = 0.7f;
                    uqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    uqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.uq uqVar2 = new org.telegram.ui.Components.uq(R.drawable.mini_switch_lock, 0);
                    uqVar2.spaceScaleX = 0.7f;
                    uqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    uqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(uqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 14:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.pv0) obj2, (int[]) obj3, (org.telegram.ui.Components.ep0) obj);
                return;
            case 15:
                org.telegram.ui.Components.zn znVar = (org.telegram.ui.Components.zn) obj4;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                long j3 = znVar.V;
                final org.telegram.ui.Components.km kmVar = new org.telegram.ui.Components.km(2, znVar, (View) obj3);
                bi.f0 f0Var = new bi.f0(26);
                int i26 = org.telegram.ui.ActionBar.j6.f18034j5;
                if (f6Var != null) {
                    w02 = f6Var.e0(i26);
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.j6.f17998h5;
                if (f6Var != null) {
                    w03 = f6Var.e0(i27);
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.j6.Ji;
                if (f6Var != null) {
                    f6Var.e0(i28);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.j6.Ni;
                if (f6Var != null) {
                    f6Var.e0(i29);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.j6.E8;
                if (f6Var != null) {
                    f6Var.e0(i30);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.j6.G8;
                if (f6Var != null) {
                    f6Var.e0(i31);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.j6.f18017i6;
                if (f6Var != null) {
                    f6Var.e0(i32);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.j6.Sh;
                if (f6Var != null) {
                    w04 = f6Var.e0(i33);
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.j6.Oh;
                if (f6Var != null) {
                    w05 = f6Var.e0(i34);
                } else {
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, i34, false);
                }
                if (f6Var != null) {
                    f6Var.e0(org.telegram.ui.ActionBar.j6.Qh);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.d5.f22289a;
                if (context != null) {
                    final int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
                    c3Var.a();
                    final org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context, f6Var);
                    dd0Var.setTextColor(w02);
                    dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    dd0Var.setItemCount(5);
                    final ?? dd0Var2 = new org.telegram.ui.Components.dd0(context, f6Var);
                    dd0Var2.setWrapSelectorWheel(true);
                    dd0Var2.setAllItemsCount(24);
                    dd0Var2.setItemCount(5);
                    dd0Var2.setTextColor(w02);
                    dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? dd0Var3 = new org.telegram.ui.Components.dd0(context, f6Var);
                    dd0Var3.setWrapSelectorWheel(true);
                    dd0Var3.setAllItemsCount(60);
                    dd0Var3.setItemCount(5);
                    dd0Var3.setTextColor(w02);
                    dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout = new FrameLayout(context);
                    org.telegram.ui.Components.v3 v3Var2 = new org.telegram.ui.Components.v3(context, dd0Var, dd0Var2, dd0Var3, 2);
                    v3Var2.setOrientation(1);
                    frameLayout.addView(v3Var2, w7.a6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    v3Var2.addView(frameLayout2, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(w02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new ai.h(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    v3Var2.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, f6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    di.h hVar = new di.h(context, 15);
                    hVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.c6.b(hVar, 0.02f, 1.2f);
                    linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                    dd0Var.setMinValue(0);
                    dd0Var.setMaxValue(365);
                    dd0Var.setWrapSelectorWheel(false);
                    dd0Var.setFormatter(new org.telegram.ui.Components.b(20));
                    org.telegram.ui.Components.f2 f2Var = new org.telegram.ui.Components.f2(i35, dd0Var, (org.telegram.ui.Components.c4) dd0Var2, (org.telegram.ui.Components.d4) dd0Var3, textView3);
                    dd0Var.setOnValueChangedListener(f2Var);
                    dd0Var2.setMinValue(0);
                    dd0Var2.setMaxValue(23);
                    int i36 = w03;
                    linearLayout.addView((View) dd0Var2, w7.a6.l(0.2f, 0, 270));
                    dd0Var2.setFormatter(new org.telegram.ui.Components.b(21));
                    dd0Var2.setOnValueChangedListener(f2Var);
                    dd0Var3.setMinValue(0);
                    dd0Var3.setMaxValue(59);
                    dd0Var3.setValue(0);
                    dd0Var3.setFormatter(new org.telegram.ui.Components.b(22));
                    linearLayout.addView((View) dd0Var3, w7.a6.l(0.3f, 0, 270));
                    dd0Var3.setOnValueChangedListener(f2Var);
                    if (j3 > 0 && j3 != 2147483646) {
                        long j10 = 1000 * j3;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        v3Var = v3Var2;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            dd0Var3.setValue(calendar.get(12));
                            dd0Var2.setValue(calendar.get(11));
                            dd0Var.setValue(timeInMillis);
                        }
                    } else {
                        v3Var = v3Var2;
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.d5.g(null, null, 0L, i35, 3, dd0Var, dd0Var2, dd0Var3);
                    org.telegram.ui.Components.d5.e(textView3, dd0Var, dd0Var2, dd0Var3);
                    hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    hVar.setGravity(17);
                    hVar.setTextColor(w04);
                    hVar.setTextSize(1, 14.0f);
                    hVar.setTypeface(AndroidUtilities.bold());
                    hVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, w05));
                    v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 14, 15, 14, 16));
                    hVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr2[0] = false;
                            dd0 dd0Var4 = dd0Var;
                            c4 c4Var = dd0Var2;
                            d4 d4Var = dd0Var3;
                            boolean g10 = d5.g(null, null, 0L, i35, 3, dd0Var4, c4Var, d4Var);
                            d5.e(textView3, dd0Var4, c4Var, d4Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, dd0Var4.getValue());
                            calendar2.set(11, c4Var.getValue());
                            calendar2.set(12, d4Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            kmVar.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = c3Var.f17571a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    v3Var.addView(textView3, w7.a6.t(-1, -2, 83, 14, 0, 14, 16));
                    c3Var.b(frameLayout);
                    org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
                    h3Var.show();
                    h3Var.setOnDismissListener(new org.telegram.ui.Components.h2(0, f0Var, zArr2));
                    h3Var.setBackgroundColor(i36);
                    h3Var.fixNavigationBar(i36);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ny nyVar = (org.telegram.ui.Components.ny) obj4;
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.ActionBar.c3 c3Var2 = (org.telegram.ui.ActionBar.c3) obj;
                nyVar.getClass();
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    nf.f.s(nyVar.f25618c.f25939a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    runnable = c3Var2.f17571a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.kz kzVar = (org.telegram.ui.Components.kz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject6 = (TLObject) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = kzVar.f24834s;
                org.telegram.ui.Components.mz mzVar = kzVar.f24835w;
                if (mzVar.M == kzVar.f24829b) {
                    mzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(kzVar.f24828a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i15);
                            if (kzVar.v.indexOfKey(document.f17201id) < 0) {
                                arrayList7.add(document);
                            }
                            i15++;
                        }
                        if (size2 != arrayList7.size()) {
                            kzVar.f24831f.put(arrayList7, mzVar.N);
                            if (size2 == 0) {
                                kzVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                k10Var.f24560z0 = -1;
                org.telegram.ui.ActionBar.p2 p2Var2 = k10Var.f21452n;
                h10.r0((TLRPC.TL_error) obj3, p2Var2, org.telegram.ui.Components.wc.a0(p2Var2));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f17452id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).f17452id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        p2Var2.getMessagesController().loadRemoteFilters(true, new di.v4(k10Var, callback, i14, 3));
                        return;
                    }
                    if (k10Var.f24536a0 != null) {
                        p2Var2.getMessagesController().checkChatlistFolderUpdate(k10Var.Y, true);
                    }
                    k10Var.A0 = true;
                    k10Var.dismiss();
                    callback.run(Integer.valueOf(i14));
                    return;
                }
                k10Var.f24547l0.a(false);
                return;
            case 19:
                ((wy) obj4).w4(((Integer) obj2).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hy(8, (pf) obj3, (org.telegram.ui.ActionBar.p2) obj), 200L);
                return;
            case 20:
                org.telegram.ui.Components.b40.N((org.telegram.ui.Components.b40) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 21:
                org.telegram.ui.Components.q80.n((org.telegram.ui.Components.q80) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 22:
                org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj;
                f90Var.f22956y = false;
                f90Var.K = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject8;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i15 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i15++;
                    }
                    f90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.la0 la0Var = (org.telegram.ui.Components.la0) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                boolean[] zArr3 = (boolean[]) obj;
                ((boolean[]) obj2)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(la0Var.U);
                for (int i37 = 0; i37 < arrayList9.size(); i37++) {
                    ((TL_stories.StoryItem) arrayList9.get(i37)).pinned = zArr3[i37];
                }
                la0Var.getMessagesController().getStoriesController().n0(la0Var.e, arrayList9, false);
                return;
            case 24:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                bi.d dVar = (bi.d) obj4;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.wc.X().d0(tL_error3, false);
                    return;
                }
                dVar.setLoading(false);
                h3Var2.dismiss();
                org.telegram.ui.Components.wc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable3.run();
                return;
            case 25:
                wy wyVar = (wy) obj2;
                wyVar.showDialog(new x41((Context) obj3, wyVar.getResourceProvider(), new org.telegram.ui.Components.hy(28, (org.telegram.ui.Components.ao0) obj4, wyVar)));
                ((org.telegram.ui.Components.w70) obj).u();
                return;
            case 26:
                wy wyVar2 = (wy) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj3;
                org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = wyVar2.getResourceProvider();
                org.telegram.ui.Components.hy hyVar = new org.telegram.ui.Components.hy(27, (org.telegram.ui.Components.ao0) obj4, tL_sponsoredPeer);
                int i38 = h41.v;
                int currentAccount = wyVar2.getCurrentAccount();
                Activity parentActivity = wyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.qi(parentActivity, resourceProvider, bArr, wyVar2, hyVar, currentAccount));
                }
                w70Var.u();
                return;
            case 27:
                org.telegram.ui.Components.sq0.m((org.telegram.ui.Components.sq0) obj4, (AtomicReference) obj2, (org.telegram.ui.Components.yp0) obj3, (TLRPC.Dialog) obj);
                return;
            case 28:
                org.telegram.ui.Components.hy0.E((org.telegram.ui.Components.hy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            default:
                org.telegram.ui.Components.hy0.o((qs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
        }
    }

    public da(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f31868a = i10;
        this.f31869b = obj;
        this.d = obj2;
        this.f31870c = obj3;
        this.e = obj4;
    }

    public da(TLRPC.TL_error tL_error, bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f31868a = 24;
        this.d = tL_error;
        this.f31869b = dVar;
        this.f31870c = h3Var;
        this.e = runnable;
    }
}
