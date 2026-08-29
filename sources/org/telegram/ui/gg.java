package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
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
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
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
public final class gg implements Runnable {
    public final int f38579a;
    public final Object f38580b;
    public final Object f38581c;
    public final Object d;
    public final Object f38582e;

    public gg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38579a = i10;
        this.f38581c = obj;
        this.f38580b = obj2;
        this.d = obj3;
        this.f38582e = obj4;
    }

    @Override
    public final void run() {
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        boolean z11;
        int i10;
        ir irVar;
        int i11;
        long peerId;
        String[] strArr;
        ArrayList arrayList;
        jr jrVar;
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
        ViewGroup viewGroup;
        org.telegram.ui.Components.v3 v3Var;
        Runnable runnable;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i12 = this.f38579a;
        int i13 = -1;
        int i14 = 0;
        Object obj = this.f38582e;
        Object obj2 = this.d;
        Object obj3 = this.f38580b;
        Object obj4 = this.f38581c;
        switch (i12) {
            case 0:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g3((org.telegram.ui.Components.ir) imageView.getDrawable(), 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                ofFloat.start();
                return;
            case 1:
                tn tnVar = (tn) obj4;
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                boolean[] zArr = (boolean[]) obj3;
                try {
                    tL_webPage = org.telegram.ui.Components.m90.f(messageObject);
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
                AndroidUtilities.runOnUIThread(new j3.p1(tnVar, c2Var, zArr, z10, messageObject, tL_webPage, 8));
                return;
            case 2:
                tn tnVar2 = (tn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i15 = messages_messages.messages.get(0).f22413id;
                    MessageObject messageObject2 = (MessageObject) tnVar2.f42870k6[0].get(i15);
                    messagesStorage.markMessageAsMention(tnVar2.P5, i15);
                    if (messageObject2 != null) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    tnVar2.j(i15, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    tnVar2.f42832h6 = messages_messages.count;
                    z11 = false;
                } else {
                    z11 = false;
                    tnVar2.f42832h6 = 0;
                }
                messagesStorage.resetMentionsCount(tnVar2.P5, tnVar2.b(), tnVar2.f42832h6);
                int i16 = tnVar2.f42832h6;
                if (i16 == 0) {
                    tnVar2.f42844i6 = true;
                    tnVar2.Kb(z11);
                    return;
                }
                tnVar2.f42803f1.c(2, i16, true);
                tnVar2.H9();
                return;
            case 3:
                tn.n0((tn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (l6) obj);
                return;
            case 4:
                kp.W((kp) obj4, (org.telegram.ui.ActionBar.c2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 5:
                dq dqVar = (dq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                dqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    dqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                jr jrVar2 = (jr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                nq nqVar = (nq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    nqVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jrVar2.getParentActivity());
                String string = LocaleController.getString("AppName", R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
                c2Var2.N = string;
                c2Var2.P = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new c1(nqVar, 23));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                jrVar2.showDialog(c2Var2);
                return;
            case 7:
                ir irVar2 = (ir) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                jr jrVar3 = irVar2.f39329y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new eg.k0(irVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                translitString = (lowerCase2.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i17 = i10 + 1;
                String[] strArr2 = new String[i17];
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
                    int i18 = 0;
                    while (i18 < size) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i18);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            irVar = irVar2;
                            i11 = size;
                            peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            irVar = irVar2;
                            i11 = size;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            jrVar = jrVar3;
                            arrayList = arrayList2;
                            strArr = strArr3;
                            i18++;
                            irVar2 = irVar;
                            size = i11;
                            jrVar3 = jrVar;
                            arrayList2 = arrayList;
                            strArr3 = strArr;
                        }
                        if (peerId > 0) {
                            TLRPC.User user2 = jrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                            if (user2.f22539id != jrVar3.getUserConfig().getClientUserId()) {
                                lowerCase = UserObject.getUserName(user2).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user2);
                                jrVar = jrVar3;
                                str = user2.first_name;
                                str2 = user2.last_name;
                            }
                            jrVar = jrVar3;
                            arrayList = arrayList2;
                            strArr = strArr3;
                            i18++;
                            irVar2 = irVar;
                            size = i11;
                            jrVar3 = jrVar;
                            arrayList2 = arrayList;
                            strArr3 = strArr;
                        } else {
                            jrVar = jrVar3;
                            TLRPC.Chat chat = jrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            str2 = null;
                        }
                        arrayList = arrayList2;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        strArr = strArr3;
                        int i19 = 0;
                        char c6 = 0;
                        while (true) {
                            if (i19 < i17) {
                                int i20 = i19;
                                String str4 = strArr[i20];
                                if (!lowerCase.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, lowerCase) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.x3.w(" ", str4, translitString2)))) {
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        str3 = translitString2;
                                        c3 = 2;
                                    } else {
                                        char c10 = c6;
                                        str3 = translitString2;
                                        c3 = c10;
                                    }
                                } else {
                                    str3 = translitString2;
                                    c3 = 1;
                                }
                                if (c3 != 0) {
                                    if (c3 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(u3.c.e("@", publicUsername), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    String str5 = lowerCase;
                                    i19 = i20 + 1;
                                    String str6 = str3;
                                    c6 = c3;
                                    translitString2 = str6;
                                    lowerCase = str5;
                                }
                            }
                        }
                        i18++;
                        irVar2 = irVar;
                        size = i11;
                        jrVar3 = jrVar;
                        arrayList2 = arrayList;
                        strArr3 = strArr;
                    }
                }
                jr jrVar4 = jrVar3;
                String[] strArr4 = strArr3;
                ir irVar3 = irVar2;
                if (arrayList3 != null) {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        TLRPC.User user3 = jrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i21)).user_id));
                        if (user3.f22539id != jrVar4.getUserConfig().getClientUserId()) {
                            String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            char c11 = 0;
                            int i22 = 0;
                            while (true) {
                                if (i22 < i17) {
                                    String str7 = strArr4[i22];
                                    if (!lowerCase3.startsWith(str7) && !org.telegram.messenger.x3.w(" ", str7, lowerCase3) && (translitString3 == null || (!translitString3.startsWith(str7) && !org.telegram.messenger.x3.w(" ", str7, translitString3)))) {
                                        String publicUsername2 = UserObject.getPublicUsername(user3);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                            c11 = 2;
                                        }
                                    } else {
                                        c11 = 1;
                                    }
                                    if (c11 != 0) {
                                        if (c11 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str7));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str7));
                                        }
                                        arrayList4.add(user3);
                                        hVar.k(user3, user3.f22539id);
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new eg.k0(irVar3, arrayList4, hVar, arrayList5, arrayList6, 29));
                return;
            case 8:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.g0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                jh.m6 m6Var = (jh.m6) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
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
                    org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                    if (c2Var3 != null) {
                        c2Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 10:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i23 = 0;
                while (true) {
                    if (i23 < iArr.length) {
                        if (iArr2[0] == iArr[i23]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i23]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i23++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.arrows_select, 0);
                    iqVar.spaceScaleX = 0.7f;
                    iqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    iqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                    iqVar2.spaceScaleX = 0.7f;
                    iqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    iqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(iqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 11:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.xu0) obj3, (int[]) obj2, (org.telegram.ui.Components.oo0) obj);
                return;
            case 12:
                org.telegram.ui.Components.on onVar = (org.telegram.ui.Components.on) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                long j10 = onVar.R;
                final org.telegram.ui.Components.j1 j1Var = new org.telegram.ui.Components.j1(16, onVar, (View) obj2);
                org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(8);
                int i24 = org.telegram.ui.ActionBar.g6.f23169j5;
                if (c6Var != null) {
                    w02 = c6Var.h0(i24);
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, i24, false);
                }
                int i25 = org.telegram.ui.ActionBar.g6.f23133h5;
                if (c6Var != null) {
                    w03 = c6Var.h0(i25);
                } else {
                    w03 = org.telegram.ui.ActionBar.g6.w0(null, i25, false);
                }
                int i26 = org.telegram.ui.ActionBar.g6.Ji;
                if (c6Var != null) {
                    c6Var.h0(i26);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.g6.Ni;
                if (c6Var != null) {
                    c6Var.h0(i27);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.g6.E8;
                if (c6Var != null) {
                    c6Var.h0(i28);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.g6.G8;
                if (c6Var != null) {
                    c6Var.h0(i29);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.g6.f23152i6;
                if (c6Var != null) {
                    c6Var.h0(i30);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.g6.Sh;
                if (c6Var != null) {
                    w04 = c6Var.h0(i31);
                } else {
                    w04 = org.telegram.ui.ActionBar.g6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.g6.Oh;
                if (c6Var != null) {
                    w05 = c6Var.h0(i32);
                } else {
                    w05 = org.telegram.ui.ActionBar.g6.w0(null, i32, false);
                }
                if (c6Var != null) {
                    c6Var.h0(org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                if (context != null) {
                    final int i33 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
                    a3Var.a();
                    final org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(context, c6Var);
                    qc0Var.setTextColor(w02);
                    qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    qc0Var.setItemCount(5);
                    final ?? qc0Var2 = new org.telegram.ui.Components.qc0(context, c6Var);
                    qc0Var2.setWrapSelectorWheel(true);
                    qc0Var2.setAllItemsCount(24);
                    qc0Var2.setItemCount(5);
                    qc0Var2.setTextColor(w02);
                    qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final ?? qc0Var3 = new org.telegram.ui.Components.qc0(context, c6Var);
                    qc0Var3.setWrapSelectorWheel(true);
                    qc0Var3.setAllItemsCount(60);
                    qc0Var3.setItemCount(5);
                    qc0Var3.setTextColor(w02);
                    qc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ViewGroup frameLayout = new FrameLayout(context);
                    org.telegram.ui.Components.v3 v3Var2 = new org.telegram.ui.Components.v3(context, qc0Var, qc0Var2, qc0Var3, 2);
                    v3Var2.setOrientation(1);
                    frameLayout.addView(v3Var2, i7.f6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    v3Var2.addView(frameLayout2, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(w02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new mh.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    v3Var2.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, c6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    eg.r rVar = new eg.r(context, 15);
                    rVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    i7.h6.b(rVar, 0.02f, 1.2f);
                    linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                    qc0Var.setMinValue(0);
                    qc0Var.setMaxValue(365);
                    qc0Var.setWrapSelectorWheel(false);
                    qc0Var.setFormatter(new org.telegram.ui.Components.n0(18));
                    bg.p3 p3Var = new bg.p3(i33, qc0Var, (org.telegram.ui.Components.b4) qc0Var2, (org.telegram.ui.Components.c4) qc0Var3, textView3);
                    qc0Var.setOnValueChangedListener(p3Var);
                    qc0Var2.setMinValue(0);
                    qc0Var2.setMaxValue(23);
                    int i34 = w03;
                    linearLayout.addView((View) qc0Var2, i7.f6.l(0.2f, 0, 270));
                    qc0Var2.setFormatter(new org.telegram.ui.Components.n0(19));
                    qc0Var2.setOnValueChangedListener(p3Var);
                    qc0Var3.setMinValue(0);
                    qc0Var3.setMaxValue(59);
                    qc0Var3.setValue(0);
                    qc0Var3.setFormatter(new org.telegram.ui.Components.n0(20));
                    linearLayout.addView((View) qc0Var3, i7.f6.l(0.3f, 0, 270));
                    qc0Var3.setOnValueChangedListener(p3Var);
                    if (j10 > 0 && j10 != 2147483646) {
                        long j11 = 1000 * j10;
                        viewGroup = frameLayout;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        v3Var = v3Var2;
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            qc0Var3.setValue(calendar.get(12));
                            qc0Var2.setValue(calendar.get(11));
                            qc0Var.setValue(timeInMillis);
                        }
                    } else {
                        viewGroup = frameLayout;
                        v3Var = v3Var2;
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.c5.g(null, null, 0L, i33, 3, qc0Var, qc0Var2, qc0Var3);
                    org.telegram.ui.Components.c5.e(textView3, qc0Var, qc0Var2, qc0Var3);
                    rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    rVar.setGravity(17);
                    rVar.setTextColor(w04);
                    rVar.setTextSize(1, 14.0f);
                    rVar.setTypeface(AndroidUtilities.bold());
                    rVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, w05));
                    v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 14, 15, 14, 16));
                    rVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr2[0] = false;
                            qc0 qc0Var4 = qc0Var;
                            b4 b4Var = qc0Var2;
                            c4 c4Var = qc0Var3;
                            boolean g10 = c5.g(null, null, 0L, i33, 3, qc0Var4, b4Var, c4Var);
                            c5.e(textView3, qc0Var4, b4Var, c4Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, qc0Var4.getValue());
                            calendar2.set(11, b4Var.getValue());
                            calendar2.set(12, c4Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            j1Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = a3Var.f22729a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    v3Var.addView(textView3, i7.f6.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(viewGroup);
                    org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.h2(0, g5Var, zArr2));
                    f3Var.setBackgroundColor(i34);
                    f3Var.fixNavigationBar(i34);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.zx zxVar = (org.telegram.ui.Components.zx) obj4;
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) obj;
                zxVar.getClass();
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr2[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    ye.d.s(zxVar.f35442c.f26911a.B.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    runnable = a3Var2.f22729a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = yyVar.f35156s;
                org.telegram.ui.Components.az azVar = yyVar.f35157w;
                if (azVar.I == yyVar.f35150b) {
                    azVar.H = 0;
                    if (tL_messages_getStickers.emoticon.equals(yyVar.f35149a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i14 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i14);
                            if (yyVar.v.indexOfKey(document.f22398id) < 0) {
                                arrayList7.add(document);
                            }
                            i14++;
                        }
                        if (size2 != arrayList7.size()) {
                            yyVar.f35153f.put(arrayList7, azVar.J);
                            if (size2 == 0) {
                                yyVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable2.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.y00 y00Var = (org.telegram.ui.Components.y00) obj4;
                TLObject tLObject6 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                y00Var.f34884v0 = -1;
                org.telegram.ui.ActionBar.o2 o2Var = y00Var.f34662n;
                p00.r0((TLRPC.TL_error) obj3, o2Var, org.telegram.ui.Components.tc.a0(o2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i13 = ((TL_update.TL_updateDialogFilter) update).f22646id;
                            }
                        } else {
                            while (true) {
                                if (i14 < arrayList8.size()) {
                                    if (arrayList8.get(i14) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i14)).f22646id;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (y00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        o2Var.getMessagesController().loadRemoteFilters(true, new bg.n3(y00Var, callback, i13, 3));
                        return;
                    }
                    if (y00Var.W != null) {
                        o2Var.getMessagesController().checkChatlistFolderUpdate(y00Var.U, true);
                    }
                    y00Var.f34885w0 = true;
                    y00Var.dismiss();
                    callback.run(Integer.valueOf(i13));
                    return;
                }
                y00Var.f34871h0.a(false);
                return;
            case 16:
                ((fy) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gt(14, (tm) obj2, (org.telegram.ui.ActionBar.o2) obj), 200L);
                return;
            case 17:
                org.telegram.ui.Components.p30.M((org.telegram.ui.Components.p30) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 18:
                org.telegram.ui.Components.c80.n((org.telegram.ui.Components.c80) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 19:
                org.telegram.ui.Components.r80 r80Var = (org.telegram.ui.Components.r80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj;
                r80Var.f32241y = false;
                r80Var.G = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject7;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i14 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i14++;
                    }
                    r80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(y90Var.Q);
                for (int i35 = 0; i35 < arrayList9.size(); i35++) {
                    ((TL_stories.StoryItem) arrayList9.get(i35)).pinned = zArr3[i35];
                }
                y90Var.getMessagesController().getStoriesController().n0(y90Var.f34997e, arrayList9, false);
                return;
            case 21:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                nh.d dVar = (nh.d) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.tc.X().d0(tL_error3, false);
                    return;
                }
                dVar.setLoading(false);
                f3Var2.dismiss();
                org.telegram.ui.Components.tc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable3.run();
                return;
            case 22:
                fy fyVar = (fy) obj3;
                fyVar.showDialog(new o31((Context) obj2, fyVar.getResourceProvider(), new org.telegram.ui.Components.ii0(4, (org.telegram.ui.Components.mn0) obj4, fyVar)));
                ((org.telegram.ui.Components.j70) obj).u();
                return;
            case 23:
                fy fyVar2 = (fy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.j70 j70Var = (org.telegram.ui.Components.j70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.c6 resourceProvider = fyVar2.getResourceProvider();
                org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(3, (org.telegram.ui.Components.mn0) obj4, tL_sponsoredPeer);
                int i36 = y21.v;
                int currentAccount = fyVar2.getCurrentAccount();
                Activity parentActivity = fyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.gi(parentActivity, resourceProvider, bArr, fyVar2, ii0Var, currentAccount));
                }
                j70Var.u();
                return;
            case 24:
                org.telegram.ui.Components.dq0.m((org.telegram.ui.Components.dq0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.jp0) obj2, (TLRPC.Dialog) obj);
                return;
            case 25:
                org.telegram.ui.Components.nx0.E((org.telegram.ui.Components.nx0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 26:
                org.telegram.ui.Components.nx0.o((nr0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 27:
                org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) obj4;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(yz0Var.d).performLogout(0);
                    return;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder f9 = u3.c.f(string2, "\n");
                        f9.append(tL_error4.text);
                        string2 = f9.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yz0Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder2.f22714a;
                    c2Var4.N = string3;
                    c2Var4.P = string2;
                    j7.l1.C(R.string.OK, alertDialog$Builder2, null);
                    return;
                } else {
                    return;
                }
            case 28:
                org.telegram.ui.Components.m21 m21Var = (org.telegram.ui.Components.m21) obj4;
                ((org.telegram.ui.Components.j70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-m21Var.f30553c, ((TLRPC.TL_forumTopic) obj).f22444id, !tL_forumTopic.pinned, m21Var.h);
                return;
            default:
                org.telegram.ui.Components.k31.n((org.telegram.ui.Components.k31) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public gg(tn tnVar, MessageObject messageObject, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr) {
        this.f38579a = 1;
        this.f38581c = tnVar;
        this.d = messageObject;
        this.f38582e = c2Var;
        this.f38580b = zArr;
    }
}
