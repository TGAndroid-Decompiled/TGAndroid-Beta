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
public final class b0 implements Utilities.Callback {
    public final int f36637a;
    public final Object f36638b;
    public final Object f36639c;
    public final Object d;

    public b0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36637a = i10;
        this.f36638b = obj;
        this.f36639c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        int dp;
        int dp2;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i12 = this.f36637a;
        String str = null;
        boolean z12 = true;
        int i13 = 0;
        Object obj2 = this.d;
        Object obj3 = this.f36639c;
        Object obj4 = this.f36638b;
        switch (i12) {
            case 0:
                m4 m4Var = (m4) obj4;
                q3 q3Var = (q3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && q3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    m4Var.f40392d0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length > 0 && length == 0 && i14 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = ye.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        q3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.l.b(activity, str2);
                    org.telegram.ui.web.w0 webView = q3Var.getWebView();
                    String str3 = org.telegram.ui.web.k1.a().f44089b;
                    if (str3 != null) {
                        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
                        n10.append(URLEncoder.encode(str2));
                        str = n10.toString();
                    }
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                m4 m4Var2 = (m4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(m4Var2.T).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(m4Var2.T).addWebBrowserException(str5, true);
                }
                if (!bool.booleanValue()) {
                    m4Var2.c0();
                    return;
                } else {
                    LaunchActivity.E1 = new d0(m4Var2, 8);
                    return;
                }
            case 2:
                tn.d1((tn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                return;
            case 3:
                tn tnVar = (tn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                if (groupedMessages != null) {
                    tnVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!tnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l10.longValue())) {
                            z12 = false;
                        }
                    }
                    if (z12 && tnVar.N3 == 0) {
                        tnVar.O9(false);
                        return;
                    }
                    return;
                } else if (tnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l10.longValue())) {
                    tnVar.Wc(false);
                    if (tnVar.N3 == 0) {
                        tnVar.O9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                fn fnVar = (fn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                qm qmVar = (qm) obj2;
                if (((Boolean) obj).booleanValue()) {
                    tn tnVar2 = fnVar.f38212a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    tm tmVar = new tm(0, fnVar, messageObject2);
                    int i17 = l81.Z;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(tnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(tnVar2.getContext(), tnVar2.getResourceProvider());
                        org.telegram.ui.Components.aj0 aj0Var = ubVar.f33184a;
                        aj0Var.setScaleX(1.25f);
                        aj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            aj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            aj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            aj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            aj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            aj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            aj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            aj0Var.setScaleX(0.8f);
                            aj0Var.setScaleY(0.8f);
                            aj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) jh.ia.M0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.wc.b(LocaleController.getString(R.string.StakeDiceToastChange), new t31(6, tnVar2, tmVar), tnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(ubVar.f33185b);
                        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(tnVar2.getContext(), null);
                        ubVar.f33185b = y80Var;
                        y80Var.setSingleLine();
                        ubVar.f33185b.setTypeface(Typeface.SANS_SERIF);
                        ubVar.f33185b.setTextSize(1, 15.0f);
                        ubVar.f33185b.setEllipsize(TextUtils.TruncateAt.END);
                        ubVar.f33185b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        ubVar.addView(ubVar.f33185b, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ubVar.f33185b.setText(jh.ia.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        ubVar.f33185b.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, tnVar2.getResourceProvider()));
                        ubVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, tnVar2.getResourceProvider()));
                        ubVar.f33185b.setSingleLine(false);
                        ubVar.f33185b.setMaxLines(2);
                        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar2.getContext(), tnVar2.getResourceProvider(), true);
                        kcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        kcVar.f30007a = new eg.z1(tmVar, j10, 27);
                        ubVar.setButton(kcVar);
                        org.telegram.ui.Components.tc.a0(tnVar2).b(ubVar, 2750).j();
                        return;
                    }
                    return;
                }
                qmVar.run();
                return;
            case 5:
                fn fnVar2 = (fn) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).c(200L);
                tn tnVar3 = fnVar2.f38212a;
                if (tnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(tnVar3.getMessagesController().verifyAgeBotUsername)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(tnVar3.getParentActivity());
                if (z10) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(tnVar3.getParentActivity(), 1, tnVar3.getResourceProvider());
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                    y1Var.setPadding(dp, 0, dp2, 0);
                    frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1Var.setOnClickListener(new k8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                if (z11) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                c2Var.P = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                c2Var.C = 9;
                if (z11) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z11) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.zj(fnVar2, s1Var, zArr, z10, contentsettings));
                }
                tnVar3.showDialog(c2Var);
                return;
            case 6:
                fy fyVar = (fy) obj4;
                Long l11 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).q(150L);
                Boolean bool2 = fyVar.C.bot_participant;
                if (bool2 != null && bool2.booleanValue()) {
                    fyVar.getMessagesController().addUserToChat(l11.longValue(), fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D)), 0, null, fyVar, false, runnable, new ze(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 7:
                k01 k01Var = (k01) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k9 = d61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k9 == null) {
                        k9 = d61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k9 == null) {
                        String[] strArr = n01.f40667s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, k9);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver();
                    k01Var.f39721e.add(imageReceiver);
                    imageReceiver.setDelegate(new l01(new Runnable[]{new av0(22, k01Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    k01Var.d.add((m01) hashMap2.get(num3));
                }
                k01Var.f39723g[0] = true;
                k01Var.a();
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((d61) obj4).R;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String e10 = u3.c.e(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f22419id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(e10)) {
                                arrayList3.add(new a61(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f22419id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i13 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22419id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(e10)) {
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
                                    arrayList3.add(new a61(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f22419id));
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
                org.telegram.ui.Components.p5.h(((d61) obj4).R).f(arrayList4);
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).f22398id));
                }
                runnable3.run();
                return;
        }
    }
}
