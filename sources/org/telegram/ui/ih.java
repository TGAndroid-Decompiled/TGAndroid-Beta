package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
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
    public final int f35121a;
    public final Object f35122b;
    public final Object f35123c;
    public final Object d;
    public final Object e;

    public ih(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35121a = i10;
        this.f35122b = obj;
        this.f35123c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        String[] strArr;
        ArrayList arrayList;
        pr prVar;
        or orVar;
        int i11;
        long peerId;
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
        org.telegram.ui.Components.y3 y3Var;
        ViewGroup viewGroup;
        org.telegram.ui.Components.s3 s3Var;
        int i12;
        Runnable runnable;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j10;
        int i13 = this.f35121a;
        int i14 = -1;
        int i15 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f35123c;
        Object obj4 = this.f35122b;
        switch (i13) {
            case 0:
                xn xnVar = (xn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i16 = messages_messages.messages.get(0).f19205id;
                    MessageObject messageObject = (MessageObject) xnVar.f40089l6[0].get(i16);
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
                    xnVar.f40053i6 = messages_messages.count;
                    z4 = false;
                } else {
                    z4 = false;
                    xnVar.f40053i6 = 0;
                }
                messagesStorage.resetMentionsCount(xnVar.Q5, xnVar.b(), xnVar.f40053i6);
                int i17 = xnVar.f40053i6;
                if (i17 == 0) {
                    xnVar.f40065j6 = true;
                    xnVar.Kb(z4);
                    return;
                }
                xnVar.f40023g1.c(2, i17, true);
                xnVar.H9();
                return;
            case 1:
                xn.n0((xn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p6) obj);
                return;
            case 2:
                qp.W((qp) obj4, (org.telegram.ui.ActionBar.d2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 3:
                jq jqVar = (jq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                jqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    jqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                pr prVar2 = (pr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                tq tqVar = (tq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    tqVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(prVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a1(tqVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                prVar2.showDialog(d2Var);
                return;
            case 5:
                or orVar2 = (or) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                pr prVar3 = orVar2.f36967y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gg.j0(orVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 27));
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
                            strArr = strArr3;
                            arrayList = arrayList2;
                            peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            strArr = strArr3;
                            arrayList = arrayList2;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                            } else {
                                prVar = prVar3;
                                orVar = orVar2;
                                i11 = size;
                                i19++;
                                arrayList2 = arrayList;
                                strArr3 = strArr;
                                size = i11;
                                prVar3 = prVar;
                                orVar2 = orVar;
                            }
                        }
                        if (peerId > 0) {
                            TLRPC.User user2 = prVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            i11 = size;
                            if (user2.f19331id == prVar3.getUserConfig().getClientUserId()) {
                                prVar = prVar3;
                                orVar = orVar2;
                                i19++;
                                arrayList2 = arrayList;
                                strArr3 = strArr;
                                size = i11;
                                prVar3 = prVar;
                                orVar2 = orVar;
                            } else {
                                lowerCase = UserObject.getUserName(user2).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user2);
                                str = user2.first_name;
                                str2 = user2.last_name;
                            }
                        } else {
                            i11 = size;
                            TLRPC.Chat chat = prVar3.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        prVar = prVar3;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        orVar = orVar2;
                        int i20 = 0;
                        char c10 = 0;
                        while (true) {
                            if (i20 < i18) {
                                int i21 = i20;
                                String str4 = strArr[i21];
                                if (!lowerCase.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.y3.w(" ", str4, translitString2)))) {
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        str3 = translitString2;
                                        c3 = 2;
                                    } else {
                                        char c11 = c10;
                                        str3 = translitString2;
                                        c3 = c11;
                                    }
                                } else {
                                    str3 = translitString2;
                                    c3 = 1;
                                }
                                if (c3 != 0) {
                                    if (c3 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(vh.v2.e("@", publicUsername), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    String str5 = lowerCase;
                                    i20 = i21 + 1;
                                    String str6 = str3;
                                    c10 = c3;
                                    translitString2 = str6;
                                    lowerCase = str5;
                                }
                            }
                        }
                        i19++;
                        arrayList2 = arrayList;
                        strArr3 = strArr;
                        size = i11;
                        prVar3 = prVar;
                        orVar2 = orVar;
                    }
                }
                pr prVar4 = prVar3;
                or orVar3 = orVar2;
                String[] strArr4 = strArr3;
                if (arrayList3 != null) {
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        TLRPC.User user3 = prVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                        if (user3.f19331id != prVar4.getUserConfig().getClientUserId()) {
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
                                        hVar.k(user3, user3.f19331id);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new gg.j0(orVar3, arrayList4, hVar, arrayList5, arrayList6, 27));
                return;
            case 6:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.f0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.f6) obj).show();
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                lh.m6 m6Var = (lh.m6) obj3;
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.arrows_select, 0);
                    mqVar.spaceScaleX = 0.7f;
                    mqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    mqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.mq mqVar2 = new org.telegram.ui.Components.mq(R.drawable.mini_switch_lock, 0);
                    mqVar2.spaceScaleX = 0.7f;
                    mqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    mqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(mqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 9:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.fv0) obj3, (int[]) obj2, (org.telegram.ui.Components.yo0) obj);
                return;
            case 10:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                long j11 = qnVar.S;
                final org.telegram.ui.Components.o1 o1Var = new org.telegram.ui.Components.o1(15, qnVar, (View) obj2);
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(4);
                int i25 = org.telegram.ui.ActionBar.j6.f20012j5;
                if (f6Var != null) {
                    w02 = f6Var.c0(i25);
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, i25, false);
                }
                int i26 = org.telegram.ui.ActionBar.j6.f19977h5;
                if (f6Var != null) {
                    w03 = f6Var.c0(i26);
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.j6.Ji;
                if (f6Var != null) {
                    f6Var.c0(i27);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.j6.Ni;
                if (f6Var != null) {
                    f6Var.c0(i28);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.j6.E8;
                if (f6Var != null) {
                    f6Var.c0(i29);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.j6.G8;
                if (f6Var != null) {
                    f6Var.c0(i30);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.j6.f19996i6;
                if (f6Var != null) {
                    f6Var.c0(i31);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.j6.Sh;
                if (f6Var != null) {
                    w04 = f6Var.c0(i32);
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.j6.Oh;
                if (f6Var != null) {
                    w05 = f6Var.c0(i33);
                } else {
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, i33, false);
                }
                if (f6Var != null) {
                    f6Var.c0(org.telegram.ui.ActionBar.j6.Qh);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                if (context != null) {
                    int i34 = w04;
                    final int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
                    b3Var.a();
                    final org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(context, f6Var);
                    wc0Var.setTextColor(w02);
                    wc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    wc0Var.setItemCount(5);
                    ?? wc0Var2 = new org.telegram.ui.Components.wc0(context, f6Var);
                    wc0Var2.setWrapSelectorWheel(true);
                    wc0Var2.setAllItemsCount(24);
                    wc0Var2.setItemCount(5);
                    wc0Var2.setTextColor(w02);
                    wc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? wc0Var3 = new org.telegram.ui.Components.wc0(context, f6Var);
                    wc0Var3.setWrapSelectorWheel(true);
                    wc0Var3.setAllItemsCount(60);
                    wc0Var3.setItemCount(5);
                    wc0Var3.setTextColor(w02);
                    wc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ViewGroup frameLayout = new FrameLayout(context);
                    org.telegram.ui.Components.s3 s3Var2 = new org.telegram.ui.Components.s3(context, wc0Var, wc0Var2, wc0Var3, 2);
                    s3Var2.setOrientation(1);
                    frameLayout.addView(s3Var2, k7.b6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    s3Var2.addView(frameLayout2, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(w02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new oh.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    s3Var2.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20139q5, f6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    gg.q qVar = new gg.q(context, 15);
                    qVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    k7.d6.b(qVar, 0.02f, 1.2f);
                    linearLayout.addView(wc0Var, k7.b6.l(0.5f, 0, 270));
                    wc0Var.setMinValue(0);
                    wc0Var.setMaxValue(365);
                    wc0Var.setWrapSelectorWheel(false);
                    wc0Var.setFormatter(new zr(23));
                    dg.l3 l3Var = new dg.l3(i35, wc0Var, (org.telegram.ui.Components.y3) wc0Var2, (org.telegram.ui.Components.z3) wc0Var3, textView3);
                    wc0Var.setOnValueChangedListener(l3Var);
                    wc0Var2.setMinValue(0);
                    wc0Var2.setMaxValue(23);
                    linearLayout.addView((View) wc0Var2, k7.b6.l(0.2f, 0, 270));
                    wc0Var2.setFormatter(new zr(24));
                    wc0Var2.setOnValueChangedListener(l3Var);
                    wc0Var3.setMinValue(0);
                    wc0Var3.setMaxValue(59);
                    wc0Var3.setValue(0);
                    wc0Var3.setFormatter(new zr(25));
                    linearLayout.addView((View) wc0Var3, k7.b6.l(0.3f, 0, 270));
                    wc0Var3.setOnValueChangedListener(l3Var);
                    if (j11 > 0 && j11 != 2147483646) {
                        long j12 = 1000 * j11;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        y3Var = wc0Var2;
                        i12 = i34;
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        viewGroup = frameLayout;
                        s3Var = s3Var2;
                        int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j12);
                        if (timeInMillis >= 0) {
                            wc0Var3.setValue(calendar.get(12));
                            y3Var.setValue(calendar.get(11));
                            wc0Var.setValue(timeInMillis);
                        }
                    } else {
                        y3Var = wc0Var2;
                        viewGroup = frameLayout;
                        s3Var = s3Var2;
                        i12 = i34;
                    }
                    final boolean[] zArr = {true};
                    org.telegram.ui.Components.z4.g(null, null, 0L, i35, 3, wc0Var, y3Var, wc0Var3);
                    org.telegram.ui.Components.z4.e(textView3, wc0Var, y3Var, wc0Var3);
                    qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    qVar.setGravity(17);
                    qVar.setTextColor(i12);
                    qVar.setTextSize(1, 14.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, w05));
                    org.telegram.ui.Components.s3 s3Var3 = s3Var;
                    s3Var3.addView(qVar, k7.b6.t(-1, 48, 83, 14, 15, 14, 16));
                    final org.telegram.ui.Components.y3 y3Var2 = y3Var;
                    qVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr[0] = false;
                            wc0 wc0Var4 = wc0Var;
                            y3 y3Var3 = y3Var2;
                            z3 z3Var = wc0Var3;
                            boolean g10 = z4.g(null, null, 0L, i35, 3, wc0Var4, y3Var3, z3Var);
                            z4.e(textView3, wc0Var4, y3Var3, z3Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, wc0Var4.getValue());
                            calendar2.set(11, y3Var3.getValue());
                            calendar2.set(12, z3Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            o1Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = b3Var.f19525a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    s3Var3.addView(textView3, k7.b6.t(-1, -2, 83, 14, 0, 14, 16));
                    b3Var.b(viewGroup);
                    org.telegram.ui.ActionBar.g3 g3Var = b3Var.f19525a;
                    g3Var.show();
                    g3Var.setOnDismissListener(new org.telegram.ui.Components.f2(0, mcVar, zArr));
                    g3Var.setBackgroundColor(w03);
                    g3Var.fixNavigationBar(w03);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.fy fyVar = (org.telegram.ui.Components.fy) obj4;
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) obj;
                fyVar.getClass();
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr2[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    af.g.s(fyVar.f24981c.f25256a.C.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    runnable = b3Var2.f19525a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = dzVar.f24394s;
                org.telegram.ui.Components.fz fzVar = dzVar.f24395w;
                if (fzVar.J == dzVar.f24389b) {
                    fzVar.I = 0;
                    if (tL_messages_getStickers.emoticon.equals(dzVar.f24388a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i15);
                            if (dzVar.v.indexOfKey(document.f19190id) < 0) {
                                arrayList7.add(document);
                            }
                            i15++;
                        }
                        if (size2 != arrayList7.size()) {
                            dzVar.f24391f.put(arrayList7, fzVar.K);
                            if (size2 == 0) {
                                dzVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.c10 c10Var = (org.telegram.ui.Components.c10) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                c10Var.f23803w0 = -1;
                org.telegram.ui.ActionBar.p2 p2Var = c10Var.f28678n;
                b10.r0((TLRPC.TL_error) obj2, p2Var, org.telegram.ui.Components.qc.a0(p2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f19436id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).f19436id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (c10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        p2Var.getMessagesController().loadRemoteFilters(true, new dg.j3(c10Var, callback, i14, 3));
                        return;
                    }
                    if (c10Var.X != null) {
                        p2Var.getMessagesController().checkChatlistFolderUpdate(c10Var.V, true);
                    }
                    c10Var.f23804x0 = true;
                    c10Var.dismiss();
                    callback.run(Integer.valueOf(i14));
                    return;
                }
                c10Var.f23790i0.a(false);
                return;
            case 14:
                ((oy) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.il(23, (org.telegram.ui.Components.vk) obj2, (org.telegram.ui.ActionBar.p2) obj), 200L);
                return;
            case 15:
                org.telegram.ui.Components.t30.N((org.telegram.ui.Components.t30) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 16:
                org.telegram.ui.Components.h80.n((org.telegram.ui.Components.h80) obj4, (TLRPC.TL_error) obj2, (TLRPC.Updates) obj3, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 17:
                org.telegram.ui.Components.x80 x80Var = (org.telegram.ui.Components.x80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj3;
                x80Var.f30612y = false;
                x80Var.H = tL_chatInviteExported.link;
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
                    x80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(da0Var.R);
                for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                    ((TL_stories.StoryItem) arrayList9.get(i36)).pinned = zArr2[i36];
                }
                da0Var.getMessagesController().getStoriesController().n0(da0Var.e, arrayList9, false);
                return;
            case 19:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ph.d dVar = (ph.d) obj4;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj3;
                Runnable runnable3 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.qc.X().d0(tL_error3, false);
                    return;
                }
                dVar.setLoading(false);
                g3Var2.dismiss();
                org.telegram.ui.Components.qc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable3.run();
                return;
            case 20:
                oy oyVar = (oy) obj3;
                oyVar.showDialog(new z31((Context) obj2, oyVar.getResourceProvider(), new org.telegram.ui.Components.i80(13, (org.telegram.ui.Components.wn0) obj4, oyVar)));
                ((org.telegram.ui.Components.o70) obj).u();
                return;
            case 21:
                oy oyVar2 = (oy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = oyVar2.getResourceProvider();
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(12, (org.telegram.ui.Components.wn0) obj4, tL_sponsoredPeer);
                int i37 = k31.v;
                int currentAccount = oyVar2.getCurrentAccount();
                Activity parentActivity = oyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ki(parentActivity, resourceProvider, bArr, oyVar2, i80Var, currentAccount));
                }
                o70Var.u();
                return;
            case 22:
                org.telegram.ui.Components.lq0.m((org.telegram.ui.Components.lq0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.sp0) obj2, (TLRPC.Dialog) obj);
                return;
            case 23:
                org.telegram.ui.Components.xx0.E((org.telegram.ui.Components.xx0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (MediaDataController) obj);
                return;
            case 24:
                org.telegram.ui.Components.xx0.o((vr0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 25:
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(j01Var.d).performLogout(0);
                    return;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder f10 = vh.v2.f(string2, "\n");
                        f10.append(tL_error4.text);
                        string2 = f10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j01Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f19503a;
                    d2Var3.O = string3;
                    d2Var3.Q = string2;
                    kh.a2.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                } else {
                    return;
                }
            case 26:
                org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) obj4;
                ((org.telegram.ui.Components.o70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-w21Var.f30176c, ((TLRPC.TL_forumTopic) obj).f19236id, !tL_forumTopic.pinned, w21Var.h);
                return;
            case 27:
                org.telegram.ui.Components.v31.n((org.telegram.ui.Components.v31) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_textWithEntities) obj);
                return;
            case 28:
                c60 c60Var = (c60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = c60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                c60Var.X0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = c60Var.X0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j10 = 0;
                } else {
                    j10 = chat2.f19184id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = c60Var.f33129h2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = c60Var.X0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f19194id = groupCall3.f19194id;
                call3.createNoVideoParticipant();
                org.telegram.ui.Components.t20 t20Var = c60Var.f33147m2;
                ChatObject.Call call4 = c60Var.X0;
                t20Var.f28871c = call4;
                c60Var.X1.setGroupCall(call4);
                c60Var.f33144l2.f35029c = c60Var.X0;
                c60Var.Z.C0(accountInstance.getCurrentAccount(), c60Var.X0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = c60Var.X0;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            default:
                c60.w((c60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
        }
    }

    public ih(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f35121a = i10;
        this.f35122b = obj;
        this.d = obj2;
        this.f35123c = tLObject;
        this.e = obj3;
    }

    public ih(TLRPC.TL_error tL_error, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f35121a = 19;
        this.d = tL_error;
        this.f35122b = dVar;
        this.f35123c = g3Var;
        this.e = runnable;
    }

    public ih(org.telegram.ui.Components.x80 x80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f35121a = 17;
        this.f35122b = x80Var;
        this.e = tL_chatInviteExported;
        this.d = tL_error;
        this.f35123c = tLObject;
    }

    public ih(org.telegram.ui.Components.j01 j01Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f35121a = 25;
        this.f35122b = j01Var;
        this.e = d2Var;
        this.f35123c = tLObject;
        this.d = tL_error;
    }
}
