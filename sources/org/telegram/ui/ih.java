package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ih implements Runnable {
    public final int f37659a;
    public final Object f37660b;
    public final Object f37661c;
    public final Object d;
    public final Object f37662e;

    public ih(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37659a = i10;
        this.f37660b = obj;
        this.f37661c = obj2;
        this.d = obj3;
        this.f37662e = obj4;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        pr prVar;
        String[] strArr;
        long peerId;
        ArrayList arrayList;
        int i11;
        qr qrVar;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        char c3;
        int w02;
        int w03;
        int w04;
        int w05;
        int i12;
        Runnable runnable;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j10;
        int i13 = this.f37659a;
        int i14 = -1;
        int i15 = 0;
        Object obj = this.f37662e;
        Object obj2 = this.d;
        Object obj3 = this.f37661c;
        Object obj4 = this.f37660b;
        switch (i13) {
            case 0:
                xn xnVar = (xn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i16 = messages_messages.messages.get(0).f20866id;
                    MessageObject messageObject = (MessageObject) xnVar.f43236l6[0].get(i16);
                    messagesStorage.markMessageAsMention(xnVar.Q5, i16);
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    xnVar.j(i16, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    xnVar.f43200i6 = messages_messages.count;
                    z4 = false;
                } else {
                    z4 = false;
                    xnVar.f43200i6 = 0;
                }
                messagesStorage.resetMentionsCount(xnVar.Q5, xnVar.b(), xnVar.f43200i6);
                int i17 = xnVar.f43200i6;
                if (i17 == 0) {
                    xnVar.f43212j6 = true;
                    xnVar.Kb(z4);
                    return;
                }
                xnVar.f43170g1.c(2, i17, true);
                xnVar.H9();
                return;
            case 1:
                xn.n0((xn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p6) obj);
                return;
            case 2:
                rp.W((rp) obj4, (org.telegram.ui.ActionBar.d2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 3:
                kq kqVar = (kq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                kqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    kqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                qr qrVar2 = (qr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uq uqVar = (uq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    uqVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qrVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a1(uqVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                qrVar2.showDialog(d2Var);
                return;
            case 5:
                pr prVar2 = (pr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                qr qrVar3 = prVar2.f40116y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hg.j0(prVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 27));
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
                a0.h hVar = new a0.h();
                ArrayList arrayList5 = new ArrayList();
                String[] strArr3 = strArr2;
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i19);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            prVar = prVar2;
                            strArr = strArr3;
                            peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            prVar = prVar2;
                            strArr = strArr3;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            qrVar = qrVar3;
                            i11 = size;
                            arrayList = arrayList2;
                            i19++;
                            prVar2 = prVar;
                            strArr3 = strArr;
                            qrVar3 = qrVar;
                            size = i11;
                            arrayList2 = arrayList;
                        }
                        if (peerId > 0) {
                            TLRPC.User user2 = qrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            if (user2.f20992id != qrVar3.getUserConfig().getClientUserId()) {
                                lowerCase = UserObject.getUserName(user2).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user2);
                                qrVar = qrVar3;
                                str = user2.first_name;
                                str2 = user2.last_name;
                            }
                            qrVar = qrVar3;
                            i11 = size;
                            arrayList = arrayList2;
                            i19++;
                            prVar2 = prVar;
                            strArr3 = strArr;
                            qrVar3 = qrVar;
                            size = i11;
                            arrayList2 = arrayList;
                        } else {
                            qrVar = qrVar3;
                            TLRPC.Chat chat = qrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        i11 = size;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        arrayList = arrayList2;
                        int i20 = 0;
                        char c10 = 0;
                        while (true) {
                            if (i20 < i18) {
                                int i21 = i20;
                                String str4 = strArr[i21];
                                if (!lowerCase.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, translitString2)))) {
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        str3 = lowerCase;
                                        c3 = 2;
                                    } else {
                                        char c11 = c10;
                                        str3 = lowerCase;
                                        c3 = c11;
                                    }
                                } else {
                                    str3 = lowerCase;
                                    c3 = 1;
                                }
                                if (c3 != 0) {
                                    if (c3 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(yh.k("@", publicUsername), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    String str5 = translitString2;
                                    i20 = i21 + 1;
                                    String str6 = str3;
                                    c10 = c3;
                                    lowerCase = str6;
                                    translitString2 = str5;
                                }
                            }
                        }
                        i19++;
                        prVar2 = prVar;
                        strArr3 = strArr;
                        qrVar3 = qrVar;
                        size = i11;
                        arrayList2 = arrayList;
                    }
                }
                qr qrVar4 = qrVar3;
                pr prVar3 = prVar2;
                String[] strArr4 = strArr3;
                if (arrayList3 != null) {
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        TLRPC.User user3 = qrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                        if (user3.f20992id != qrVar4.getUserConfig().getClientUserId()) {
                            String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            int i23 = 0;
                            char c12 = 0;
                            while (true) {
                                if (i23 < i18) {
                                    String str7 = strArr4[i23];
                                    if (!lowerCase3.startsWith(str7) && !org.telegram.messenger.y3.w(" ", str7, lowerCase3) && (translitString3 == null || (!translitString3.startsWith(str7) && !org.telegram.messenger.y3.w(" ", str7, translitString3)))) {
                                        String publicUsername2 = UserObject.getPublicUsername(user3);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                            c12 = 2;
                                        }
                                    } else {
                                        c12 = 1;
                                    }
                                    if (c12 != 0) {
                                        if (c12 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str7));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str7));
                                        }
                                        arrayList4.add(user3);
                                        hVar.k(user3, user3.f20992id);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new hg.j0(prVar3, arrayList4, hVar, arrayList5, arrayList6, 27));
                return;
            case 6:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.f0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.g6) obj).show();
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                mh.m6 m6Var = (mh.m6) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
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
                    m6Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                    if (d2Var2 != null) {
                        d2Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 8:
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.arrows_select, 0);
                    oqVar.spaceScaleX = 0.7f;
                    oqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                    oqVar2.spaceScaleX = 0.7f;
                    oqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 9:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.fv0) obj3, (int[]) obj2, (org.telegram.ui.Components.yo0) obj);
                return;
            case 10:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                long j11 = rnVar.S;
                final org.telegram.ui.Components.o1 o1Var = new org.telegram.ui.Components.o1(15, rnVar, (View) obj2);
                org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(6);
                int i25 = org.telegram.ui.ActionBar.k6.f21768j5;
                if (g6Var != null) {
                    w02 = g6Var.e0(i25);
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(null, i25, false);
                }
                int i26 = org.telegram.ui.ActionBar.k6.f21733h5;
                if (g6Var != null) {
                    w03 = g6Var.e0(i26);
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.k6.Ji;
                if (g6Var != null) {
                    g6Var.e0(i27);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.k6.Ni;
                if (g6Var != null) {
                    g6Var.e0(i28);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.k6.E8;
                if (g6Var != null) {
                    g6Var.e0(i29);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.k6.G8;
                if (g6Var != null) {
                    g6Var.e0(i30);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.k6.f21752i6;
                if (g6Var != null) {
                    g6Var.e0(i31);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.k6.Sh;
                if (g6Var != null) {
                    w04 = g6Var.e0(i32);
                } else {
                    w04 = org.telegram.ui.ActionBar.k6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.k6.Oh;
                if (g6Var != null) {
                    w05 = g6Var.e0(i33);
                } else {
                    w05 = org.telegram.ui.ActionBar.k6.w0(null, i33, false);
                }
                if (g6Var != null) {
                    g6Var.e0(org.telegram.ui.ActionBar.k6.Qh);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                if (context != null) {
                    int i34 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
                    c3Var.a();
                    final org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, g6Var);
                    yc0Var.setTextColor(w02);
                    yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    yc0Var.setItemCount(5);
                    final ?? yc0Var2 = new org.telegram.ui.Components.yc0(context, g6Var);
                    yc0Var2.setWrapSelectorWheel(true);
                    yc0Var2.setAllItemsCount(24);
                    yc0Var2.setItemCount(5);
                    yc0Var2.setTextColor(w02);
                    yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? yc0Var3 = new org.telegram.ui.Components.yc0(context, g6Var);
                    yc0Var3.setWrapSelectorWheel(true);
                    yc0Var3.setAllItemsCount(60);
                    yc0Var3.setItemCount(5);
                    yc0Var3.setTextColor(w02);
                    yc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout = new FrameLayout(context);
                    org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context, yc0Var, yc0Var2, yc0Var3, 2);
                    s3Var.setOrientation(1);
                    frameLayout.addView(s3Var, k7.c6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    s3Var.addView(frameLayout2, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(w02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, g6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    hg.q qVar = new hg.q(context, 15);
                    qVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    k7.e6.b(qVar, 0.02f, 1.2f);
                    linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                    yc0Var.setMinValue(0);
                    yc0Var.setMaxValue(365);
                    yc0Var.setWrapSelectorWheel(false);
                    yc0Var.setFormatter(new as(23));
                    eg.j3 j3Var = new eg.j3(i34, yc0Var, (org.telegram.ui.Components.y3) yc0Var2, (org.telegram.ui.Components.z3) yc0Var3, textView3);
                    yc0Var.setOnValueChangedListener(j3Var);
                    yc0Var2.setMinValue(0);
                    yc0Var2.setMaxValue(23);
                    int i35 = w03;
                    linearLayout.addView((View) yc0Var2, k7.c6.l(0.2f, 0, 270));
                    yc0Var2.setFormatter(new as(24));
                    yc0Var2.setOnValueChangedListener(j3Var);
                    yc0Var3.setMinValue(0);
                    yc0Var3.setMaxValue(59);
                    yc0Var3.setValue(0);
                    yc0Var3.setFormatter(new as(25));
                    linearLayout.addView((View) yc0Var3, k7.c6.l(0.3f, 0, 270));
                    yc0Var3.setOnValueChangedListener(j3Var);
                    if (j11 > 0 && j11 != 2147483646) {
                        long j12 = 1000 * j11;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i12 = i34;
                        int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j12);
                        if (timeInMillis >= 0) {
                            yc0Var3.setValue(calendar.get(12));
                            yc0Var2.setValue(calendar.get(11));
                            yc0Var.setValue(timeInMillis);
                        }
                    } else {
                        i12 = i34;
                    }
                    final boolean[] zArr = {true};
                    org.telegram.ui.Components.z4.g(null, null, 0L, i12, 3, yc0Var, yc0Var2, yc0Var3);
                    org.telegram.ui.Components.z4.e(textView3, yc0Var, yc0Var2, yc0Var3);
                    qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    qVar.setGravity(17);
                    qVar.setTextColor(w04);
                    qVar.setTextSize(1, 14.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, w05));
                    s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 14, 15, 14, 16));
                    final int i36 = i12;
                    qVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr[0] = false;
                            yc0 yc0Var4 = yc0Var;
                            y3 y3Var = yc0Var2;
                            z3 z3Var = yc0Var3;
                            boolean g10 = z4.g(null, null, 0L, i36, 3, yc0Var4, y3Var, z3Var);
                            z4.e(textView3, yc0Var4, y3Var, z3Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, yc0Var4.getValue());
                            calendar2.set(11, y3Var.getValue());
                            calendar2.set(12, z3Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            o1Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = c3Var.f21209a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    s3Var.addView(textView3, k7.c6.t(-1, -2, 83, 14, 0, 14, 16));
                    c3Var.b(frameLayout);
                    org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21209a;
                    h3Var.show();
                    h3Var.setOnDismissListener(new org.telegram.ui.Components.f2(0, jcVar, zArr));
                    h3Var.setBackgroundColor(i35);
                    h3Var.fixNavigationBar(i35);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.hy hyVar = (org.telegram.ui.Components.hy) obj4;
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.ui.ActionBar.c3 c3Var2 = (org.telegram.ui.ActionBar.c3) obj;
                hyVar.getClass();
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr2[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    af.g.s(hyVar.f27648c.f27909a.C.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    runnable = c3Var2.f21209a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = fzVar.f27050s;
                org.telegram.ui.Components.hz hzVar = fzVar.f27051w;
                if (hzVar.J == fzVar.f27044b) {
                    hzVar.I = 0;
                    if (tL_messages_getStickers.emoticon.equals(fzVar.f27043a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i15);
                            if (fzVar.v.indexOfKey(document.f20851id) < 0) {
                                arrayList7.add(document);
                            }
                            i15++;
                        }
                        if (size2 != arrayList7.size()) {
                            fzVar.f27047f.put(arrayList7, hzVar.K);
                            if (size2 == 0) {
                                fzVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                d10Var.f26114w0 = -1;
                org.telegram.ui.ActionBar.p2 p2Var = d10Var.f31017n;
                b10.r0((TLRPC.TL_error) obj2, p2Var, org.telegram.ui.Components.qc.a0(p2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f21099id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).f21099id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        p2Var.getMessagesController().loadRemoteFilters(true, new eg.h3(d10Var, callback, i14, 3));
                        return;
                    }
                    if (d10Var.X != null) {
                        p2Var.getMessagesController().checkChatlistFolderUpdate(d10Var.V, true);
                    }
                    d10Var.f26115x0 = true;
                    d10Var.dismiss();
                    callback.run(Integer.valueOf(i14));
                    return;
                }
                d10Var.f26101i0.a(false);
                return;
            case 14:
                ((py) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.eo(21, (org.telegram.ui.Components.xk) obj2, (org.telegram.ui.ActionBar.p2) obj), 200L);
                return;
            case 15:
                org.telegram.ui.Components.v30.N((org.telegram.ui.Components.v30) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 16:
                org.telegram.ui.Components.j80.n((org.telegram.ui.Components.j80) obj4, (TLRPC.TL_error) obj2, (TLRPC.Updates) obj3, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 17:
                org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj3;
                y80Var.f33434y = false;
                y80Var.H = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject7;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i15 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i15++;
                    }
                    y80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(fa0Var.R);
                for (int i37 = 0; i37 < arrayList9.size(); i37++) {
                    ((TL_stories.StoryItem) arrayList9.get(i37)).pinned = zArr2[i37];
                }
                fa0Var.getMessagesController().getStoriesController().n0(fa0Var.f26852e, arrayList9, false);
                return;
            case 19:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                qh.d dVar = (qh.d) obj4;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj3;
                Runnable runnable3 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.qc.X().d0(tL_error3, false);
                    return;
                }
                dVar.setLoading(false);
                h3Var2.dismiss();
                org.telegram.ui.Components.qc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable3.run();
                return;
            case 20:
                py pyVar = (py) obj3;
                pyVar.showDialog(new g41((Context) obj2, pyVar.getResourceProvider(), new org.telegram.ui.Components.b90(11, (org.telegram.ui.Components.wn0) obj4, pyVar)));
                ((org.telegram.ui.Components.q70) obj).u();
                return;
            case 21:
                py pyVar2 = (py) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.g6 resourceProvider = pyVar2.getResourceProvider();
                org.telegram.ui.Components.b90 b90Var = new org.telegram.ui.Components.b90(10, (org.telegram.ui.Components.wn0) obj4, tL_sponsoredPeer);
                int i38 = q31.v;
                int currentAccount = pyVar2.getCurrentAccount();
                Activity parentActivity = pyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.li(parentActivity, resourceProvider, bArr, pyVar2, b90Var, currentAccount));
                }
                q70Var.u();
                return;
            case 22:
                org.telegram.ui.Components.lq0.m((org.telegram.ui.Components.lq0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.sp0) obj2, (TLRPC.Dialog) obj);
                return;
            case 23:
                org.telegram.ui.Components.xx0.E((org.telegram.ui.Components.xx0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (MediaDataController) obj);
                return;
            case 24:
                org.telegram.ui.Components.xx0.o((cs0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 25:
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(j01Var.d).performLogout(0);
                    return;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder f10 = w.c.f(string2, "\n");
                        f10.append(tL_error4.text);
                        string2 = f10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j01Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f21168a;
                    d2Var3.O = string3;
                    d2Var3.Q = string2;
                    l.d.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                } else {
                    return;
                }
            case 26:
                org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) obj4;
                ((org.telegram.ui.Components.q70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-w21Var.f32622c, ((TLRPC.TL_forumTopic) obj).f20897id, !tL_forumTopic.pinned, w21Var.h);
                return;
            case 27:
                org.telegram.ui.Components.v31.n((org.telegram.ui.Components.v31) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_textWithEntities) obj);
                return;
            case 28:
                d60 d60Var = (d60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = d60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                d60Var.X0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = d60Var.X0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j10 = 0;
                } else {
                    j10 = chat2.f20845id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = d60Var.f36022h2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = d60Var.X0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f20855id = groupCall3.f20855id;
                call3.createNoVideoParticipant();
                org.telegram.ui.Components.u20 u20Var = d60Var.f36040m2;
                ChatObject.Call call4 = d60Var.X0;
                u20Var.f31479c = call4;
                d60Var.X1.setGroupCall(call4);
                d60Var.f36037l2.f37846c = d60Var.X0;
                d60Var.Z.C0(accountInstance.getCurrentAccount(), d60Var.X0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = d60Var.X0;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            default:
                d60.w((d60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
        }
    }

    public ih(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f37659a = i10;
        this.f37660b = obj;
        this.d = obj2;
        this.f37661c = tLObject;
        this.f37662e = obj3;
    }

    public ih(TLRPC.TL_error tL_error, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.f37659a = 19;
        this.d = tL_error;
        this.f37660b = dVar;
        this.f37661c = h3Var;
        this.f37662e = runnable;
    }

    public ih(org.telegram.ui.Components.y80 y80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f37659a = 17;
        this.f37660b = y80Var;
        this.f37662e = tL_chatInviteExported;
        this.d = tL_error;
        this.f37661c = tLObject;
    }

    public ih(org.telegram.ui.Components.j01 j01Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f37659a = 25;
        this.f37660b = j01Var;
        this.f37662e = d2Var;
        this.f37661c = tLObject;
        this.d = tL_error;
    }
}
