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
public final class kh implements Runnable {
    public final int f35538a;
    public final Object f35539b;
    public final Object f35540c;
    public final Object d;
    public final Object e;

    public kh(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35538a = i10;
        this.f35539b = obj;
        this.f35540c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        ArrayList arrayList;
        int i11;
        long peerId;
        String[] strArr;
        qr qrVar;
        rr rrVar;
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
        int i13 = this.f35538a;
        int i14 = -1;
        int i15 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f35540c;
        Object obj4 = this.f35539b;
        switch (i13) {
            case 0:
                zn znVar = (zn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i16 = messages_messages.messages.get(0).f19180id;
                    MessageObject messageObject = (MessageObject) znVar.f40655l6[0].get(i16);
                    messagesStorage.markMessageAsMention(znVar.Q5, i16);
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    znVar.j(i16, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    znVar.f40619i6 = messages_messages.count;
                    z4 = false;
                } else {
                    z4 = false;
                    znVar.f40619i6 = 0;
                }
                messagesStorage.resetMentionsCount(znVar.Q5, znVar.d(), znVar.f40619i6);
                int i17 = znVar.f40619i6;
                if (i17 == 0) {
                    znVar.f40631j6 = true;
                    znVar.Kb(z4);
                    return;
                }
                znVar.f40589g1.c(2, i17, true);
                znVar.H9();
                return;
            case 1:
                zn.n0((zn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (r6) obj);
                return;
            case 2:
                sp.W((sp) obj4, (org.telegram.ui.ActionBar.d2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 3:
                lq lqVar = (lq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                lqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    lqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                rr rrVar2 = (rr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                vq vqVar = (vq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vqVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new c1(vqVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                rrVar2.showDialog(d2Var);
                return;
            case 5:
                qr qrVar2 = (qr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rr rrVar3 = qrVar2.f37464y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gg.j0(qrVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 27));
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
                            arrayList = arrayList2;
                            i11 = size;
                            peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            arrayList = arrayList2;
                            i11 = size;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            rrVar = rrVar3;
                            qrVar = qrVar2;
                            strArr = strArr3;
                            i19++;
                            arrayList2 = arrayList;
                            size = i11;
                            rrVar3 = rrVar;
                            qrVar2 = qrVar;
                            strArr3 = strArr;
                        }
                        if (peerId > 0) {
                            TLRPC.User user2 = rrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            if (user2.f19306id != rrVar3.getUserConfig().getClientUserId()) {
                                lowerCase = UserObject.getUserName(user2).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user2);
                                rrVar = rrVar3;
                                str = user2.first_name;
                                str2 = user2.last_name;
                            }
                            rrVar = rrVar3;
                            qrVar = qrVar2;
                            strArr = strArr3;
                            i19++;
                            arrayList2 = arrayList;
                            size = i11;
                            rrVar3 = rrVar;
                            qrVar2 = qrVar;
                            strArr3 = strArr;
                        } else {
                            rrVar = rrVar3;
                            TLRPC.Chat chat = rrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        qrVar = qrVar2;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        strArr = strArr3;
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
                                        arrayList5.add(AndroidUtilities.generateSearchName(vh.w2.e("@", publicUsername), null, "@" + str4));
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
                        size = i11;
                        rrVar3 = rrVar;
                        qrVar2 = qrVar;
                        strArr3 = strArr;
                    }
                }
                rr rrVar4 = rrVar3;
                qr qrVar3 = qrVar2;
                String[] strArr4 = strArr3;
                if (arrayList3 != null) {
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        TLRPC.User user3 = rrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                        if (user3.f19306id != rrVar4.getUserConfig().getClientUserId()) {
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
                                        hVar.k(user3, user3.f19306id);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new gg.j0(qrVar3, arrayList4, hVar, arrayList5, arrayList6, 27));
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
                    org.telegram.ui.Components.lq lqVar2 = new org.telegram.ui.Components.lq(R.drawable.arrows_select, 0);
                    lqVar2.spaceScaleX = 0.7f;
                    lqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    lqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(lqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.lq lqVar3 = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
                    lqVar3.spaceScaleX = 0.7f;
                    lqVar3.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    lqVar3.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(lqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 9:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.fv0) obj3, (int[]) obj2, (org.telegram.ui.Components.xo0) obj);
                return;
            case 10:
                org.telegram.ui.Components.pn pnVar = (org.telegram.ui.Components.pn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                long j11 = pnVar.S;
                final org.telegram.ui.Components.o1 o1Var = new org.telegram.ui.Components.o1(15, pnVar, (View) obj2);
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(4);
                int i25 = org.telegram.ui.ActionBar.j6.f19987j5;
                if (f6Var != null) {
                    w02 = f6Var.d0(i25);
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, i25, false);
                }
                int i26 = org.telegram.ui.ActionBar.j6.f19952h5;
                if (f6Var != null) {
                    w03 = f6Var.d0(i26);
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.j6.Ji;
                if (f6Var != null) {
                    f6Var.d0(i27);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.j6.Ni;
                if (f6Var != null) {
                    f6Var.d0(i28);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.j6.E8;
                if (f6Var != null) {
                    f6Var.d0(i29);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.j6.G8;
                if (f6Var != null) {
                    f6Var.d0(i30);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.j6.f19971i6;
                if (f6Var != null) {
                    f6Var.d0(i31);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.j6.Sh;
                if (f6Var != null) {
                    w04 = f6Var.d0(i32);
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.j6.Oh;
                if (f6Var != null) {
                    w05 = f6Var.d0(i33);
                } else {
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, i33, false);
                }
                if (f6Var != null) {
                    f6Var.d0(org.telegram.ui.ActionBar.j6.Qh);
                } else {
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                if (context != null) {
                    int i34 = w04;
                    final int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
                    b3Var.a();
                    final org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(context, f6Var);
                    xc0Var.setTextColor(w02);
                    xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    xc0Var.setItemCount(5);
                    final ?? xc0Var2 = new org.telegram.ui.Components.xc0(context, f6Var);
                    xc0Var2.setWrapSelectorWheel(true);
                    xc0Var2.setAllItemsCount(24);
                    xc0Var2.setItemCount(5);
                    xc0Var2.setTextColor(w02);
                    xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? xc0Var3 = new org.telegram.ui.Components.xc0(context, f6Var);
                    xc0Var3.setWrapSelectorWheel(true);
                    xc0Var3.setAllItemsCount(60);
                    xc0Var3.setItemCount(5);
                    xc0Var3.setTextColor(w02);
                    xc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout = new FrameLayout(context);
                    org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context, xc0Var, xc0Var2, xc0Var3, 2);
                    s3Var.setOrientation(1);
                    frameLayout.addView(s3Var, k7.b6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    s3Var.addView(frameLayout2, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
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
                    s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20114q5, f6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    gg.q qVar = new gg.q(context, 15);
                    qVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    k7.d6.b(qVar, 0.02f, 1.2f);
                    linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                    xc0Var.setMinValue(0);
                    xc0Var.setMaxValue(365);
                    xc0Var.setWrapSelectorWheel(false);
                    xc0Var.setFormatter(new bs(23));
                    dg.l3 l3Var = new dg.l3(i35, xc0Var, (org.telegram.ui.Components.y3) xc0Var2, (org.telegram.ui.Components.z3) xc0Var3, textView3);
                    xc0Var.setOnValueChangedListener(l3Var);
                    xc0Var2.setMinValue(0);
                    xc0Var2.setMaxValue(23);
                    linearLayout.addView((View) xc0Var2, k7.b6.l(0.2f, 0, 270));
                    xc0Var2.setFormatter(new bs(24));
                    xc0Var2.setOnValueChangedListener(l3Var);
                    xc0Var3.setMinValue(0);
                    xc0Var3.setMaxValue(59);
                    xc0Var3.setValue(0);
                    xc0Var3.setFormatter(new bs(25));
                    linearLayout.addView((View) xc0Var3, k7.b6.l(0.3f, 0, 270));
                    xc0Var3.setOnValueChangedListener(l3Var);
                    if (j11 > 0 && j11 != 2147483646) {
                        long j12 = 1000 * j11;
                        i12 = w03;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j12);
                        if (timeInMillis >= 0) {
                            xc0Var3.setValue(calendar.get(12));
                            xc0Var2.setValue(calendar.get(11));
                            xc0Var.setValue(timeInMillis);
                        }
                    } else {
                        i12 = w03;
                    }
                    final boolean[] zArr = {true};
                    org.telegram.ui.Components.z4.g(null, null, 0L, i35, 3, xc0Var, xc0Var2, xc0Var3);
                    org.telegram.ui.Components.z4.e(textView3, xc0Var, xc0Var2, xc0Var3);
                    qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    qVar.setGravity(17);
                    qVar.setTextColor(i34);
                    qVar.setTextSize(1, 14.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, w05));
                    s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 14, 15, 14, 16));
                    qVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr[0] = false;
                            xc0 xc0Var4 = xc0Var;
                            y3 y3Var = xc0Var2;
                            z3 z3Var = xc0Var3;
                            boolean g10 = z4.g(null, null, 0L, i35, 3, xc0Var4, y3Var, z3Var);
                            z4.e(textView3, xc0Var4, y3Var, z3Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, xc0Var4.getValue());
                            calendar2.set(11, y3Var.getValue());
                            calendar2.set(12, z3Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            o1Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = b3Var.f19500a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    s3Var.addView(textView3, k7.b6.t(-1, -2, 83, 14, 0, 14, 16));
                    b3Var.b(frameLayout);
                    org.telegram.ui.ActionBar.g3 g3Var = b3Var.f19500a;
                    g3Var.show();
                    g3Var.setOnDismissListener(new org.telegram.ui.Components.f2(0, mcVar, zArr));
                    g3Var.setBackgroundColor(i12);
                    g3Var.fixNavigationBar(i12);
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
                    ze.d.s(fyVar.f24987c.f25252a.C.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    runnable = b3Var2.f19500a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = dzVar.f24403s;
                org.telegram.ui.Components.fz fzVar = dzVar.f24404w;
                if (fzVar.J == dzVar.f24398b) {
                    fzVar.I = 0;
                    if (tL_messages_getStickers.emoticon.equals(dzVar.f24397a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i15);
                            if (dzVar.v.indexOfKey(document.f19165id) < 0) {
                                arrayList7.add(document);
                            }
                            i15++;
                        }
                        if (size2 != arrayList7.size()) {
                            dzVar.f24400f.put(arrayList7, fzVar.K);
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
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                d10Var.f24101w0 = -1;
                org.telegram.ui.ActionBar.p2 p2Var = d10Var.f28701n;
                c10.r0((TLRPC.TL_error) obj2, p2Var, org.telegram.ui.Components.qc.a0(p2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f19411id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).f19411id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        p2Var.getMessagesController().loadRemoteFilters(true, new dg.j3(d10Var, callback, i14, 3));
                        return;
                    }
                    if (d10Var.X != null) {
                        p2Var.getMessagesController().checkChatlistFolderUpdate(d10Var.V, true);
                    }
                    d10Var.f24102x0 = true;
                    d10Var.dismiss();
                    callback.run(Integer.valueOf(i14));
                    return;
                }
                d10Var.f24088i0.a(false);
                return;
            case 14:
                ((qy) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.em(22, (org.telegram.ui.Components.vk) obj2, (org.telegram.ui.ActionBar.p2) obj), 200L);
                return;
            case 15:
                org.telegram.ui.Components.u30.N((org.telegram.ui.Components.u30) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 16:
                org.telegram.ui.Components.i80.n((org.telegram.ui.Components.i80) obj4, (TLRPC.TL_error) obj2, (TLRPC.Updates) obj3, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 17:
                org.telegram.ui.Components.x80 x80Var = (org.telegram.ui.Components.x80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj3;
                x80Var.f30542y = false;
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
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ea0Var.R);
                for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                    ((TL_stories.StoryItem) arrayList9.get(i36)).pinned = zArr2[i36];
                }
                ea0Var.getMessagesController().getStoriesController().n0(ea0Var.e, arrayList9, false);
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
                qy qyVar = (qy) obj3;
                qyVar.showDialog(new g41((Context) obj2, qyVar.getResourceProvider(), new org.telegram.ui.Components.z80(12, (org.telegram.ui.Components.vn0) obj4, qyVar)));
                ((org.telegram.ui.Components.p70) obj).u();
                return;
            case 21:
                qy qyVar2 = (qy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = qyVar2.getResourceProvider();
                org.telegram.ui.Components.z80 z80Var = new org.telegram.ui.Components.z80(11, (org.telegram.ui.Components.vn0) obj4, tL_sponsoredPeer);
                int i37 = q31.v;
                int currentAccount = qyVar2.getCurrentAccount();
                Activity parentActivity = qyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.li(parentActivity, resourceProvider, bArr, qyVar2, z80Var, currentAccount));
                }
                p70Var.u();
                return;
            case 22:
                org.telegram.ui.Components.lq0.m((org.telegram.ui.Components.lq0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.rp0) obj2, (TLRPC.Dialog) obj);
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(j01Var.d).performLogout(0);
                    return;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder f10 = vh.w2.f(string2, "\n");
                        f10.append(tL_error4.text);
                        string2 = f10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j01Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f19478a;
                    d2Var3.O = string3;
                    d2Var3.Q = string2;
                    kf.k0.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                } else {
                    return;
                }
            case 26:
                org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) obj4;
                ((org.telegram.ui.Components.p70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-w21Var.f30126c, ((TLRPC.TL_forumTopic) obj).f19211id, !tL_forumTopic.pinned, w21Var.h);
                return;
            case 27:
                org.telegram.ui.Components.v31.n((org.telegram.ui.Components.v31) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_textWithEntities) obj);
                return;
            case 28:
                e60 e60Var = (e60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = e60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                e60Var.X0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = e60Var.X0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j10 = 0;
                } else {
                    j10 = chat2.f19159id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = e60Var.f33648h2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = e60Var.X0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f19169id = groupCall3.f19169id;
                call3.createNoVideoParticipant();
                org.telegram.ui.Components.u20 u20Var = e60Var.f33666m2;
                ChatObject.Call call4 = e60Var.X0;
                u20Var.f29084c = call4;
                e60Var.X1.setGroupCall(call4);
                e60Var.f33663l2.f35431c = e60Var.X0;
                e60Var.Z.C0(accountInstance.getCurrentAccount(), e60Var.X0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = e60Var.X0;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            default:
                e60.w((e60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
        }
    }

    public kh(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f35538a = i10;
        this.f35539b = obj;
        this.d = obj2;
        this.f35540c = tLObject;
        this.e = obj3;
    }

    public kh(TLRPC.TL_error tL_error, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.f35538a = 19;
        this.d = tL_error;
        this.f35539b = dVar;
        this.f35540c = g3Var;
        this.e = runnable;
    }

    public kh(org.telegram.ui.Components.x80 x80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f35538a = 17;
        this.f35539b = x80Var;
        this.e = tL_chatInviteExported;
        this.d = tL_error;
        this.f35540c = tLObject;
    }

    public kh(org.telegram.ui.Components.j01 j01Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f35538a = 25;
        this.f35539b = j01Var;
        this.e = d2Var;
        this.f35540c = tLObject;
        this.d = tL_error;
    }
}
