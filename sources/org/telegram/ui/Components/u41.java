package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class u41 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] R = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S;
    public final g41 E;
    public final q90 F;
    public boolean G;
    public final h41 H;
    public final t41 I;
    public final org.telegram.ui.Cells.q9 J;
    public final org.telegram.ui.Cells.ca K;
    public final View L;
    public org.telegram.ui.ActionBar.n2 M;
    public Utilities.CallbackReturn N;
    public boolean O;
    public final e6 P;
    public Boolean Q;
    public Integer f31337b;
    public final CharSequence f31338c;
    public final TLRPC.InputPeer d;
    public final int f31339e;
    public final boolean f31340f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f31341n;
    public final RichMessageLayout.PreviewView f31342r;
    public final String f31343s;
    public String v;
    public String f31344w;
    public final s41 f31345x;
    public final bi.o f31346y;

    public u41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        String charSequence2;
        View view;
        this.O = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f31338c = charSequence;
        this.d = inputPeer;
        this.f31339e = i10;
        this.f31340f = z10;
        this.h = richMessage;
        this.f31343s = str;
        this.v = str2;
        org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(this, context);
        this.containerView = u5Var;
        this.P = new e6(u5Var, 320L, tr.h);
        bi.o oVar = new bi.o(context, 7);
        this.f31346y = oVar;
        oVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        oVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.i6.f20935j5;
        oVar.setTextColor(getThemedColor(i11));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.l1(0.2f, getThemedColor(i11)));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        oVar.setText(Emoji.replaceEmoji(charSequence2, oVar.getPaint().getFontMetricsInt(), true));
        this.E = new FrameLayout(context);
        q90 q90Var = new q90(context, null);
        this.F = q90Var;
        q90Var.setDisablePaddingsOffsetY(true);
        q90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        q90Var.setTextSize(1, SharedConfig.fontSize);
        q90Var.setTextColor(getThemedColor(i11));
        q90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.gc));
        q90Var.setTextIsSelectable(true);
        q90Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21153uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f21170vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = q90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                q90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = q90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                q90Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, w7.z5.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f31341n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f31342r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        h41 h41Var = new h41(this, context);
        this.H = h41Var;
        h41Var.setOverScrollMode(1);
        h41Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        h41Var.setClipToPadding(true);
        s4.c0 c0Var = new s4.c0();
        h41Var.setLayoutManager(c0Var);
        if (this.h != null) {
            view = this.f31341n;
        } else {
            view = this.f31346y;
        }
        ?? h0Var = new s4.h0();
        h0Var.f31058e = 1;
        h0Var.f31057c = context;
        h0Var.d = view;
        this.I = h0Var;
        h41Var.setAdapter(h0Var);
        h41Var.setOnScrollListener(new i41(this));
        j41 j41Var = new j41(this);
        j41Var.n(180L);
        j41Var.o(new LinearInterpolator());
        h41Var.setItemAnimator(j41Var);
        this.containerView.addView(h41Var, w7.z5.e(-1, -2, 80));
        org.telegram.ui.Cells.q9 q9Var = new org.telegram.ui.Cells.q9();
        this.J = q9Var;
        q9Var.T(h41Var);
        q9Var.E0 = c0Var;
        org.telegram.ui.Cells.ca o9 = q9Var.o(context);
        this.K = o9;
        AndroidUtilities.removeFromParent(o9);
        this.containerView.addView(o9, w7.z5.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f31342r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(q9Var);
        }
        s41 s41Var = new s41(this, context);
        this.f31345x = s41Var;
        this.containerView.addView(s41Var, w7.z5.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
        View view2 = new View(context);
        this.L = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, w7.z5.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false)));
        textView.setOnClickListener(new l80(this, 23));
        frameLayout.addView(textView, w7.z5.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 87));
        K();
    }

    public static String A() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap B(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis;
        HashMap hashMap = new HashMap();
        if (charSequence != null && (parseEmojis = Emoji.parseEmojis(charSequence)) != null) {
            String charSequence2 = charSequence.toString();
            for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i10);
                if (emojiSpanRange != null && emojiSpanRange.code != null) {
                    String substring = charSequence2.substring(emojiSpanRange.start, emojiSpanRange.end);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(emojiSpanRange);
                }
            }
        }
        return hashMap;
    }

    public static String C(String str, boolean[] zArr, boolean[] zArr2) {
        boolean z10;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str2 = str.split("_")[0];
        if ("nb".equals(str2)) {
            str2 = "no";
        }
        boolean z11 = true;
        if (zArr != null) {
            String string = LocaleController.getString("TranslateLanguage" + str2.toUpperCase());
            if (string != null && !string.startsWith("LOC_ERR")) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            if (z10) {
                return string;
            }
        }
        if (zArr2 != null) {
            String string2 = LocaleController.getString("TranslateLanguageGenitive" + str2.toUpperCase());
            z11 = (string2 == null || string2.startsWith("LOC_ERR")) ? false : false;
            zArr2[0] = z11;
            if (z11) {
                return string2;
            }
        }
        String J = J(str, false);
        if (J == null) {
            J = J(str2, false);
        }
        if (J != null) {
            return J;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        LocaleController.LocaleInfo builtinLanguageByPlural = LocaleController.getInstance().getBuiltinLanguageByPlural(str);
        if (builtinLanguageByPlural == null) {
            return null;
        }
        if (currentLocaleInfo != null && "en".equals(currentLocaleInfo.pluralLangCode)) {
            return builtinLanguageByPlural.nameEnglish;
        }
        return builtinLanguageByPlural.name;
    }

    public static TLRPC.TL_textWithEntities D(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        Emoji.EmojiSpanRange emojiSpanRange;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 != null && tL_textWithEntities2.text != null) {
            for (int i10 = 0; i10 < tL_textWithEntities2.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i11 = messageEntity.offset;
                        String substring = str.substring(i11, messageEntity.length + i11);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i10, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i10, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i10 < arrayList.size() && (tL_textWithEntities.entities.get(i10) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i10).language;
                }
            }
            if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
                HashMap B = B(tL_textWithEntities.text);
                HashMap B2 = B(tL_textWithEntities2.text);
                for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i13 = messageEntity2.offset;
                        String substring2 = str2.substring(i13, messageEntity2.length + i13);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) B.get(substring2);
                            ArrayList arrayList3 = (ArrayList) B2.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < arrayList2.size()) {
                                        Emoji.EmojiSpanRange emojiSpanRange2 = (Emoji.EmojiSpanRange) arrayList2.get(i14);
                                        int i15 = emojiSpanRange2.start;
                                        int i16 = messageEntity2.offset;
                                        if (i15 == i16 && emojiSpanRange2.end == i16 + messageEntity2.length) {
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        i14 = -1;
                                        break;
                                    }
                                }
                                if (i14 >= 0 && i14 < arrayList3.size() && (emojiSpanRange = (Emoji.EmojiSpanRange) arrayList3.get(i14)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i17);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i18 = emojiSpanRange.start;
                                                int i19 = emojiSpanRange.end;
                                                int i20 = messageEntity3.offset;
                                                if (AndroidUtilities.intersect1d(i18, i19, i20, messageEntity3.length + i20)) {
                                                    break;
                                                }
                                            }
                                            i17++;
                                        } else {
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                            tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                            tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                            int i21 = emojiSpanRange.start;
                                            tL_messageEntityCustomEmoji.offset = i21;
                                            tL_messageEntityCustomEmoji.length = emojiSpanRange.end - i21;
                                            tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return tL_textWithEntities2;
        }
        return null;
    }

    public static void G(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static m41 H(Activity activity, org.telegram.ui.yn ynVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.uf ufVar, Runnable runnable) {
        m41 m41Var = new m41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        m41Var.F(z11);
        m41Var.M = ynVar;
        m41Var.N = ufVar;
        if (ynVar.getParentActivity() != null) {
            ynVar.showDialog(m41Var);
        }
        return m41Var;
    }

    public static void I(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.l20 l20Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        o41 o41Var = new o41(context, str, str2, charSequence, gVar);
        o41Var.F(false);
        o41Var.M = n2Var;
        o41Var.N = l20Var;
        if (n2Var != null) {
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(o41Var);
                return;
            }
            return;
        }
        o41Var.show();
    }

    public static String J(String str, boolean z10) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (S == null) {
                S = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i10 = 0; i10 < availableLocales.length; i10++) {
                        S.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                        String country = availableLocales[i10].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = S;
                            hashMap.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) S.get(lowerCase);
                if (locale3 != null) {
                    if (z10) {
                        locale = locale3;
                    } else {
                        locale = Locale.getDefault();
                    }
                    String displayLanguage = locale3.getDisplayLanguage(locale);
                    if (lowerCase.contains("-")) {
                        if (z10) {
                            locale2 = locale3;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        String displayCountry = locale3.getDisplayCountry(locale2);
                        if (!TextUtils.isEmpty(displayCountry)) {
                            return displayLanguage + " (" + displayCountry + ")";
                        }
                        return displayLanguage;
                    }
                    return displayLanguage;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static void m(u41 u41Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        g41 g41Var = u41Var.E;
        t41 t41Var = u41Var.I;
        u41Var.f31337b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            u41Var.L();
        } else if (tL_textWithEntities2 != null) {
            u41Var.O = false;
            TLRPC.TL_textWithEntities D = D(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(D.text);
            MessageObject.addEntitiesToText(valueOf, D.entities, false, true, false, false);
            u41Var.F.setText(u41Var.E(valueOf));
            t41Var.D(g41Var);
        } else if (u41Var.O) {
            u41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.bi.o(R.string.TranslationFailedAlert2, new yc((FrameLayout) u41Var.containerView, u41Var.resourcesProvider), null);
            q41 q41Var = u41Var.f31345x.f30686e;
            String str = u41Var.f31344w;
            u41Var.v = str;
            q41Var.setText(C(str, null, null));
            t41Var.D(g41Var);
        }
    }

    public static void n(u41 u41Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        g41 g41Var = u41Var.E;
        t41 t41Var = u41Var.I;
        u41Var.f31337b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            u41Var.L();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                u41Var.O = false;
                TLRPC.TL_textWithEntities D = D(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(D.text);
                MessageObject.addEntitiesToText(valueOf, D.entities, false, true, false, false);
                u41Var.F.setText(u41Var.E(valueOf));
                t41Var.D(g41Var);
                return;
            }
        }
        if (u41Var.O) {
            u41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.bi.o(R.string.TranslationFailedAlert2, new yc((FrameLayout) u41Var.containerView, u41Var.resourcesProvider), null);
        q41 q41Var = u41Var.f31345x.f30686e;
        String str = u41Var.f31344w;
        u41Var.v = str;
        q41Var.setText(C(str, null, null));
        t41Var.D(g41Var);
    }

    public static void o(u41 u41Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = u41Var.f31342r;
        u41Var.f31337b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                u41Var.O = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    u41Var.I.D(previewView);
                    return;
                }
                return;
            }
        }
        if (u41Var.O) {
            u41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.bi.o(R.string.TranslationFailedAlert2, new yc((FrameLayout) u41Var.containerView, u41Var.resourcesProvider), null);
        q41 q41Var = u41Var.f31345x.f30686e;
        String str = u41Var.f31344w;
        u41Var.v = str;
        q41Var.setText(C(str, null, null));
    }

    public static void p(u41 u41Var, String str, Boolean bool) {
        int i10;
        int i11;
        g41 g41Var = u41Var.E;
        t41 t41Var = u41Var.I;
        if (str != null) {
            u41Var.O = false;
            u41Var.F.setText(u41Var.E(str));
            t41Var.D(g41Var);
        } else if (u41Var.isDismissed()) {
        } else {
            if (u41Var.O) {
                u41Var.dismiss();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i12 = NotificationCenter.showBulletin;
                if (bool.booleanValue()) {
                    i11 = R.string.TranslationFailedAlert1;
                } else {
                    i11 = R.string.TranslationFailedAlert2;
                }
                globalInstance.lambda$postNotificationNameOnUIThread$1(i12, 1, LocaleController.getString(i11));
                return;
            }
            yc ycVar = new yc((FrameLayout) u41Var.containerView, u41Var.resourcesProvider);
            if (bool.booleanValue()) {
                i10 = R.string.TranslationFailedAlert1;
            } else {
                i10 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.bi.o(i10, ycVar, null);
            q41 q41Var = u41Var.f31345x.f30686e;
            String str2 = u41Var.f31344w;
            u41Var.v = str2;
            q41Var.setText(C(str2, null, null));
            t41Var.D(g41Var);
        }
    }

    public static boolean u(u41 u41Var) {
        h41 h41Var = u41Var.H;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < h41Var.getChildCount(); i10++) {
            View childAt = h41Var.getChildAt(i10);
            if (RecyclerView.R(childAt) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (h41Var.getHeight() - h41Var.getPaddingTop()) - h41Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new f41(str, str3, callback2), new f41(str, str3, callback2));
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < encode.length()) {
                int min = Math.min(i10 + 5000, encode.length());
                int i11 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i11);
                if (lastIndexOf < i10) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i11);
                    if (lastIndexOf2 >= i10) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i10, min));
                i10 = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i13 = 0;
            while (i13 < arrayList.size()) {
                Utilities.Callback2 callback22 = callback2;
                new k41(str2, str3, (String) arrayList.get(i13), new ei.i1(zArr, arrayList2, i13, callback22, 5)).start();
                i13++;
                callback2 = callback22;
            }
            return;
        }
        new k41(str2, str3, encode, callback2).start();
    }

    public static String y(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public final CharSequence E(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N != null || this.M != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new l41(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void F(boolean z10) {
        q90 q90Var = this.F;
        if (q90Var != null) {
            q90Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
            return;
        }
        getWindow().clearFlags(8192);
        AndroidUtilities.logFlagSecure();
    }

    public final void K() {
        String charSequence;
        if (this.f31337b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f31337b.intValue(), true);
            this.f31337b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            L();
            return;
        }
        String str = this.v;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.h;
        int i10 = this.f31339e;
        TLRPC.InputPeer inputPeer = this.d;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f20168id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f31337b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new y1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f31338c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f31340f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f20167id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f31337b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new ai.m0(13, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f20169id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f31337b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.no(17, this, tL_textWithEntities)));
    }

    public final void L() {
        String charSequence;
        CharSequence charSequence2 = this.f31338c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f31343s;
        if (str != null) {
            str = str.split("_")[0];
        }
        String str2 = "no";
        if ("nb".equals(str)) {
            str = "no";
        }
        String str3 = this.v;
        if (str3 != null) {
            str3 = str3.split("_")[0];
        }
        if (!"nb".equals(str3)) {
            str2 = str3;
        }
        x(charSequence, str, str2, new d(this, 21));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f31346y.invalidate();
            this.F.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.translationModelDownloading);
    }

    @Override
    public final void dismissInternal() {
        if (this.f31337b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f31337b.intValue(), true);
            this.f31337b = null;
        }
        super.dismissInternal();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }

    public final float z(boolean z10) {
        e6 e6Var;
        h41 h41Var = this.H;
        float top = h41Var.getTop();
        if (h41Var.getChildCount() >= 1) {
            top += Math.max(0, h41Var.getChildAt(h41Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (e6Var = this.P) != null) {
            if (!h41Var.K1 && !this.G) {
                return e6Var.d(max, false);
            }
            e6Var.d(max, true);
        }
        return max;
    }
}
