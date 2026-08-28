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
    public final int f36320a;
    public final Object f36321b;
    public final Object f36322c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i9) {
        this.f36320a = i9;
        this.f36321b = obj;
        this.f36322c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        String sb2;
        boolean z10;
        boolean z11;
        int dp;
        int dp2;
        int i9;
        int i10;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i11 = this.f36320a;
        int i12 = 0;
        boolean z12 = true;
        Object obj2 = this.d;
        Object obj3 = this.f36322c;
        Object obj4 = this.f36321b;
        switch (i11) {
            case 0:
                l4 l4Var = (l4) obj4;
                p3 p3Var = (p3) obj3;
                Activity activity = (Activity) obj2;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && p3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    l4Var.f40014d0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str);
                    if ((uRLSpanArr.length > 0 && length == 0 && i13 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str = ve.e.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        p3Var.getWebView().loadUrl(str);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str);
                    org.telegram.ui.web.v0 webView = p3Var.getWebView();
                    String str2 = org.telegram.ui.web.j1.a().f43903b;
                    if (str2 == null) {
                        sb2 = null;
                    } else {
                        StringBuilder n10 = e2.c.n(str2);
                        n10.append(URLEncoder.encode(str));
                        sb2 = n10.toString();
                    }
                    webView.loadUrl(sb2);
                    return;
                }
                return;
            case 1:
                l4 l4Var2 = (l4) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(l4Var2.T).addWebBrowserException(str3, true);
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, str3)) {
                    MessagesController.getInstance(l4Var2.T).addWebBrowserException(str4, true);
                }
                if (!bool.booleanValue()) {
                    l4Var2.c0();
                    return;
                } else {
                    LaunchActivity.E1 = new c0(l4Var2, 8);
                    return;
                }
            case 2:
                qn.d1((qn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                return;
            case 3:
                qn qnVar = (qn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                if (groupedMessages != null) {
                    qnVar.getClass();
                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                        if (!qnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i15), false, l10.longValue())) {
                            z12 = false;
                        }
                    }
                    if (z12 && qnVar.N3 == 0) {
                        qnVar.O9(false);
                        return;
                    }
                    return;
                } else if (qnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l10.longValue())) {
                    qnVar.Wc(false);
                    if (qnVar.N3 == 0) {
                        qnVar.O9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                cn cnVar = (cn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                om omVar = (om) obj2;
                if (((Boolean) obj).booleanValue()) {
                    qn qnVar2 = cnVar.f37236a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    df dfVar = new df(7, cnVar, messageObject2);
                    int i16 = k81.Z;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(qnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(qnVar2.getContext(), qnVar2.getResourceProvider());
                        org.telegram.ui.Components.pi0 pi0Var = obVar.f31342a;
                        pi0Var.setScaleX(1.25f);
                        pi0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            pi0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            pi0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            pi0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            pi0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            pi0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            pi0Var.setImageResource(R.drawable.dice6);
                        } else {
                            pi0Var.setScaleX(0.8f);
                            pi0Var.setScaleY(0.8f);
                            pi0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) gh.oa.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.rc.b(LocaleController.getString(R.string.StakeDiceToastChange), new n21(9, qnVar2, dfVar), qnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(obVar.f31343b);
                        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(qnVar2.getContext(), null);
                        obVar.f31343b = l80Var;
                        l80Var.setSingleLine();
                        obVar.f31343b.setTypeface(Typeface.SANS_SERIF);
                        obVar.f31343b.setTextSize(1, 15.0f);
                        obVar.f31343b.setEllipsize(TextUtils.TruncateAt.END);
                        obVar.f31343b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        obVar.addView(obVar.f31343b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        obVar.f31343b.setText(gh.oa.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        obVar.f31343b.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, qnVar2.getResourceProvider()));
                        obVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, qnVar2.getResourceProvider()));
                        obVar.f31343b.setSingleLine(false);
                        obVar.f31343b.setMaxLines(2);
                        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar2.getContext(), qnVar2.getResourceProvider(), true);
                        ecVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ecVar.f27999a = new bg.i2(dfVar, j10, 29);
                        obVar.setButton(ecVar);
                        org.telegram.ui.Components.oc.a0(qnVar2).b(obVar, 2750).j();
                        return;
                    }
                    return;
                }
                omVar.run();
                return;
            case 5:
                cn cnVar2 = (cn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).c(200L);
                qn qnVar3 = cnVar2.f37236a;
                if (qnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(qnVar3.getMessagesController().verifyAgeBotUsername)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(qnVar3.getParentActivity());
                if (z13) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(qnVar3.getParentActivity(), 1, qnVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
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
                    frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new l8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                if (z11) {
                    i9 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i9 = R.string.MessageShowSensitiveContentMediaText;
                }
                c2Var.P = LocaleController.getString(i9);
                alertDialog$Builder.n(frameLayout);
                c2Var.C = 9;
                if (z11) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i10 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i10), null);
                if (!z11) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.sj(cnVar2, t1Var, zArr, z13, contentsettings));
                }
                qnVar3.showDialog(c2Var);
                return;
            case 6:
                dy dyVar = (dy) obj4;
                Long l11 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).q(150L);
                Boolean bool2 = dyVar.C.bot_participant;
                if (bool2 != null && bool2.booleanValue()) {
                    dyVar.getMessagesController().addUserToChat(l11.longValue(), dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D)), 0, null, dyVar, false, runnable, new bf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 7:
                j01 j01Var = (j01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = b61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = b61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = m01.f40276s;
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
                    j01Var.f39332e.add(imageReceiver);
                    imageReceiver.setDelegate(new k01(new Runnable[]{new ys0(25, j01Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    Integer num3 = (Integer) arrayList2.get(i17);
                    num3.getClass();
                    j01Var.d.add((l01) hashMap2.get(num3));
                }
                j01Var.f39334g[0] = true;
                j01Var.a();
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i18 = ((b61) obj4).R;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i18).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String d = ta.b.d(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i19 = 0; i19 < stickerSets.size(); i19++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i19);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f22407id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(d)) {
                                arrayList3.add(new y51(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f22407id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i18).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22407id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(d)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i18).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                                    arrayList3.add(new y51(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f22407id));
                                }
                            }
                        }
                        i12++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.k5.h(((b61) obj4).R).f(arrayList4);
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).f22386id));
                }
                runnable3.run();
                return;
        }
    }
}
