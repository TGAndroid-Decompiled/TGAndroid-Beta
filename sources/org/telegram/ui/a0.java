package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a0 implements Utilities.Callback {
    public final int f32421a;
    public final Object f32422b;
    public final Object f32423c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f32421a = i10;
        this.f32422b = obj;
        this.f32423c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        boolean z10;
        int dp;
        int dp2;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i12 = this.f32421a;
        String str = null;
        int i13 = 0;
        boolean z11 = true;
        Object obj2 = this.d;
        Object obj3 = this.f32423c;
        Object obj4 = this.f32422b;
        switch (i12) {
            case 0:
                l4 l4Var = (l4) obj4;
                p3 p3Var = (p3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && p3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    l4Var.f35933e0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length > 0 && length == 0 && i14 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = af.g.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        p3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str2);
                    org.telegram.ui.web.w0 webView = p3Var.getWebView();
                    String str3 = org.telegram.ui.web.l1.a().f39571b;
                    if (str3 != null) {
                        StringBuilder l10 = e2.c.l(str3);
                        l10.append(URLEncoder.encode(str2));
                        str = l10.toString();
                    }
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                l4 l4Var2 = (l4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(l4Var2.U).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(l4Var2.U).addWebBrowserException(str5, true);
                }
                if (!bool.booleanValue()) {
                    l4Var2.c0();
                    return;
                } else {
                    LaunchActivity.F1 = new c0(l4Var2, 8);
                    return;
                }
            case 2:
                xn.d1((xn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                return;
            case 3:
                xn xnVar = (xn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l11 = (Long) obj;
                if (groupedMessages != null) {
                    xnVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!xnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l11.longValue())) {
                            z11 = false;
                        }
                    }
                    if (z11 && xnVar.O3 == 0) {
                        xnVar.O9(false);
                        return;
                    }
                    return;
                } else if (xnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l11.longValue())) {
                    xnVar.Wc(false);
                    if (xnVar.O3 == 0) {
                        xnVar.O9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                jn jnVar = (jn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                vm vmVar = (vm) obj2;
                if (((Boolean) obj).booleanValue()) {
                    xn xnVar2 = jnVar.f35381a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    kh.a1 a1Var = new kh.a1(22, jnVar, messageObject2);
                    int i17 = y81.f40449a0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(xnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar2.getContext(), xnVar2.getResourceProvider());
                        org.telegram.ui.Components.jj0 jj0Var = qbVar.f28099a;
                        jj0Var.setScaleX(1.25f);
                        jj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            jj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            jj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            jj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            jj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            jj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            jj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            jj0Var.setScaleX(0.8f);
                            jj0Var.setScaleY(0.8f);
                            jj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) lh.ja.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.tc.b(LocaleController.getString(R.string.StakeDiceToastChange), new l01(15, xnVar2, a1Var), xnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(qbVar.f28100b);
                        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(xnVar2.getContext(), null);
                        qbVar.f28100b = e90Var;
                        e90Var.setSingleLine();
                        qbVar.f28100b.setTypeface(Typeface.SANS_SERIF);
                        qbVar.f28100b.setTextSize(1, 15.0f);
                        qbVar.f28100b.setEllipsize(TextUtils.TruncateAt.END);
                        qbVar.f28100b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        qbVar.addView(qbVar.f28100b, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        qbVar.f28100b.setText(lh.ja.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        qbVar.f28100b.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, xnVar2.getResourceProvider()));
                        qbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, xnVar2.getResourceProvider()));
                        qbVar.f28100b.setSingleLine(false);
                        qbVar.f28100b.setMaxLines(2);
                        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar2.getContext(), xnVar2.getResourceProvider(), true);
                        gcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        gcVar.f25097a = new gg.y1(a1Var, j10, 24);
                        qbVar.setButton(gcVar);
                        org.telegram.ui.Components.qc.a0(xnVar2).b(qbVar, 2750).j();
                        return;
                    }
                    return;
                }
                vmVar.run();
                return;
            case 5:
                jn jnVar2 = (jn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).c(200L);
                xn xnVar3 = jnVar2.f35381a;
                if (xnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(xnVar3.getMessagesController().verifyAgeBotUsername)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(xnVar3.getParentActivity());
                if (z4) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(xnVar3.getParentActivity(), 1, xnVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    z1Var.setPadding(dp, 0, dp2, 0);
                    frameLayout.addView(z1Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new o8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                if (z10) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                d2Var.Q = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                d2Var.D = 9;
                if (z10) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z10) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.dk(jnVar2, t1Var, zArr, z4, contentsettings));
                }
                xnVar3.showDialog(d2Var);
                return;
            case 6:
                oy oyVar = (oy) obj4;
                Long l12 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) obj3).q(150L);
                Boolean bool2 = oyVar.D.bot_participant;
                if (bool2 != null && bool2.booleanValue()) {
                    oyVar.getMessagesController().addUserToChat(l12.longValue(), oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E)), 0, null, oyVar, false, runnable, new gf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 7:
                v01 v01Var = (v01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = q61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = q61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = y01.f40342s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, k10);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver();
                    v01Var.e.add(imageReceiver);
                    imageReceiver.setDelegate(new w01(new Runnable[]{new l01(1, v01Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    v01Var.d.add((x01) hashMap2.get(num3));
                }
                v01Var.f39038g[0] = true;
                v01Var.a();
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((q61) obj4).S;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e = vh.v2.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f19211id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e)) {
                                arrayList3.add(new n61(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f19211id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i13 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19211id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    if (stickerSet3 != null) {
                                        arrayList = stickerSet3.documents;
                                    } else {
                                        arrayList = null;
                                    }
                                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                } else {
                                    arrayList = stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new n61(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f19211id));
                                }
                            }
                        }
                        i13++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.l5.h(((q61) obj4).S).f(arrayList4);
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).f19190id));
                }
                runnable3.run();
                return;
        }
    }
}
