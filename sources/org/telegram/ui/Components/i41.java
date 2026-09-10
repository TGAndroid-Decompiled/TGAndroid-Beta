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
public abstract class i41 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] R = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S;
    public final u31 E;
    public final m90 F;
    public boolean G;
    public final v31 H;
    public final h41 I;
    public final org.telegram.ui.Cells.s9 J;
    public final org.telegram.ui.Cells.ea K;
    public final View L;
    public org.telegram.ui.ActionBar.p2 M;
    public Utilities.CallbackReturn N;
    public boolean O;
    public final d6 P;
    public Boolean Q;
    public Integer f23894b;
    public final CharSequence f23895c;
    public final TLRPC.InputPeer d;
    public final int e;
    public final boolean f23896f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f23897n;
    public final RichMessageLayout.PreviewView f23898r;
    public final String f23899s;
    public String v;
    public String f23900w;
    public final g41 f23901x;
    public final ai.t f23902y;

    public i41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        String charSequence2;
        View view;
        this.O = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f23895c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f23896f = z10;
        this.h = richMessage;
        this.f23899s = str;
        this.v = str2;
        org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(this, context);
        this.containerView = u5Var;
        this.P = new d6(u5Var, 320L, wr.h);
        ai.t tVar = new ai.t(context, 7);
        this.f23902y = tVar;
        tVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        tVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        tVar.setTextColor(getThemedColor(i11));
        tVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.l1(0.2f, getThemedColor(i11)));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        tVar.setText(Emoji.replaceEmoji(charSequence2, tVar.getPaint().getFontMetricsInt(), true));
        this.E = new FrameLayout(context);
        m90 m90Var = new m90(context, null);
        this.F = m90Var;
        m90Var.setDisablePaddingsOffsetY(true);
        m90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        m90Var.setTextSize(1, SharedConfig.fontSize);
        m90Var.setTextColor(getThemedColor(i11));
        m90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        m90Var.setTextIsSelectable(true);
        m90Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18245uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = m90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                m90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = m90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                m90Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, w7.a6.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f23897n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f23898r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        v31 v31Var = new v31(this, context);
        this.H = v31Var;
        v31Var.setOverScrollMode(1);
        v31Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        v31Var.setClipToPadding(true);
        s4.c0 c0Var = new s4.c0();
        v31Var.setLayoutManager(c0Var);
        if (this.h != null) {
            view = this.f23897n;
        } else {
            view = this.f23902y;
        }
        ?? h0Var = new s4.h0();
        h0Var.e = 1;
        h0Var.f23516c = context;
        h0Var.d = view;
        this.I = h0Var;
        v31Var.setAdapter(h0Var);
        v31Var.setOnScrollListener(new w31(this));
        x31 x31Var = new x31(this);
        x31Var.n(180L);
        x31Var.o(new LinearInterpolator());
        v31Var.setItemAnimator(x31Var);
        this.containerView.addView(v31Var, w7.a6.e(-1, -2, 80));
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
        this.J = s9Var;
        s9Var.T(v31Var);
        s9Var.E0 = c0Var;
        org.telegram.ui.Cells.ea o9 = s9Var.o(context);
        this.K = o9;
        AndroidUtilities.removeFromParent(o9);
        this.containerView.addView(o9, w7.a6.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f23898r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(s9Var);
        }
        g41 g41Var = new g41(this, context);
        this.f23901x = g41Var;
        this.containerView.addView(g41Var, w7.a6.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
        View view2 = new View(context);
        this.L = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, w7.a6.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        textView.setOnClickListener(new g80(this, 23));
        frameLayout.addView(textView, w7.a6.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, w7.a6.e(-1, -2, 87));
        M();
    }

    public static String A() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap C(CharSequence charSequence) {
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

    public static String D(String str, boolean[] zArr, boolean[] zArr2) {
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
        String L = L(str, false);
        if (L == null) {
            L = L(str2, false);
        }
        if (L != null) {
            return L;
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

    public static TLRPC.TL_textWithEntities E(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
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
                HashMap C = C(tL_textWithEntities.text);
                HashMap C2 = C(tL_textWithEntities2.text);
                for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i13 = messageEntity2.offset;
                        String substring2 = str2.substring(i13, messageEntity2.length + i13);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) C.get(substring2);
                            ArrayList arrayList3 = (ArrayList) C2.get(substring2);
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

    public static void I(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static a41 J(Activity activity, org.telegram.ui.eo eoVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.wf wfVar, Runnable runnable) {
        a41 a41Var = new a41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        a41Var.H(z11);
        a41Var.M = eoVar;
        a41Var.N = wfVar;
        if (eoVar.getParentActivity() != null) {
            eoVar.showDialog(a41Var);
        }
        return a41Var;
    }

    public static void K(Context context, org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.n20 n20Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        c41 c41Var = new c41(context, str, str2, charSequence, gVar);
        c41Var.H(false);
        c41Var.M = p2Var;
        c41Var.N = n20Var;
        if (p2Var != null) {
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(c41Var);
                return;
            }
            return;
        }
        c41Var.show();
    }

    public static String L(String str, boolean z10) {
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

    public static void m(i41 i41Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        u31 u31Var = i41Var.E;
        h41 h41Var = i41Var.I;
        i41Var.f23894b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            i41Var.N();
        } else if (tL_textWithEntities2 != null) {
            i41Var.O = false;
            TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
            MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
            i41Var.F.setText(i41Var.F(valueOf));
            h41Var.D(u31Var);
        } else if (i41Var.O) {
            i41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.a2.p(R.string.TranslationFailedAlert2, new wc((FrameLayout) i41Var.containerView, i41Var.resourcesProvider), null);
            e41 e41Var = i41Var.f23901x.e;
            String str = i41Var.f23900w;
            i41Var.v = str;
            e41Var.setText(D(str, null, null));
            h41Var.D(u31Var);
        }
    }

    public static void n(i41 i41Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        u31 u31Var = i41Var.E;
        h41 h41Var = i41Var.I;
        i41Var.f23894b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            i41Var.N();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                i41Var.O = false;
                TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
                MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
                i41Var.F.setText(i41Var.F(valueOf));
                h41Var.D(u31Var);
                return;
            }
        }
        if (i41Var.O) {
            i41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.a2.p(R.string.TranslationFailedAlert2, new wc((FrameLayout) i41Var.containerView, i41Var.resourcesProvider), null);
        e41 e41Var = i41Var.f23901x.e;
        String str = i41Var.f23900w;
        i41Var.v = str;
        e41Var.setText(D(str, null, null));
        h41Var.D(u31Var);
    }

    public static void o(i41 i41Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = i41Var.f23898r;
        i41Var.f23894b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                i41Var.O = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    i41Var.I.D(previewView);
                    return;
                }
                return;
            }
        }
        if (i41Var.O) {
            i41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.a2.p(R.string.TranslationFailedAlert2, new wc((FrameLayout) i41Var.containerView, i41Var.resourcesProvider), null);
        e41 e41Var = i41Var.f23901x.e;
        String str = i41Var.f23900w;
        i41Var.v = str;
        e41Var.setText(D(str, null, null));
    }

    public static void p(i41 i41Var, String str, Boolean bool) {
        int i10;
        int i11;
        u31 u31Var = i41Var.E;
        h41 h41Var = i41Var.I;
        if (str != null) {
            i41Var.O = false;
            i41Var.F.setText(i41Var.F(str));
            h41Var.D(u31Var);
        } else if (i41Var.isDismissed()) {
        } else {
            if (i41Var.O) {
                i41Var.dismiss();
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
            wc wcVar = new wc((FrameLayout) i41Var.containerView, i41Var.resourcesProvider);
            if (bool.booleanValue()) {
                i10 = R.string.TranslationFailedAlert1;
            } else {
                i10 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.a2.p(i10, wcVar, null);
            e41 e41Var = i41Var.f23901x.e;
            String str2 = i41Var.f23900w;
            i41Var.v = str2;
            e41Var.setText(D(str2, null, null));
            h41Var.D(u31Var);
        }
    }

    public static boolean u(i41 i41Var) {
        v31 v31Var = i41Var.H;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < v31Var.getChildCount(); i10++) {
            View childAt = v31Var.getChildAt(i10);
            if (RecyclerView.R(childAt) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (v31Var.getHeight() - v31Var.getPaddingTop()) - v31Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new t31(str, str3, callback2), new t31(str, str3, callback2));
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
                new y31(str2, str3, (String) arrayList.get(i13), new di.k1(zArr, arrayList2, i13, callback22, 5)).start();
                i13++;
                callback2 = callback22;
            }
            return;
        }
        new y31(str2, str3, encode, callback2).start();
    }

    public static String y(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public final CharSequence F(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N != null || this.M != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new z31(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void H(boolean z10) {
        m90 m90Var = this.F;
        if (m90Var != null) {
            m90Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
            return;
        }
        getWindow().clearFlags(8192);
        AndroidUtilities.logFlagSecure();
    }

    public final void M() {
        String charSequence;
        if (this.f23894b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f23894b.intValue(), true);
            this.f23894b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            N();
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
        int i10 = this.e;
        TLRPC.InputPeer inputPeer = this.d;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f17316id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f23894b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new z1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f23895c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f23896f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f17315id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f23894b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new bi.k6(11, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f17317id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f23894b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new th(12, this, tL_textWithEntities)));
    }

    public final void N() {
        String charSequence;
        CharSequence charSequence2 = this.f23895c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f23899s;
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
        x(charSequence, str, str2, new e(this, 21));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f23902y.invalidate();
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
        if (this.f23894b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f23894b.intValue(), true);
            this.f23894b = null;
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
        d6 d6Var;
        v31 v31Var = this.H;
        float top = v31Var.getTop();
        if (v31Var.getChildCount() >= 1) {
            top += Math.max(0, v31Var.getChildAt(v31Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (d6Var = this.P) != null) {
            if (!v31Var.K1 && !this.G) {
                return d6Var.d(max, false);
            }
            d6Var.d(max, true);
        }
        return max;
    }
}
