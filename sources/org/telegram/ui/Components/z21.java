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
public abstract class z21 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] N = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap O;
    public final l21 A;
    public final l80 B;
    public boolean C;
    public final m21 D;
    public final y21 E;
    public final org.telegram.ui.Cells.n9 F;
    public final org.telegram.ui.Cells.z9 G;
    public final View H;
    public org.telegram.ui.ActionBar.o2 I;
    public Utilities.CallbackReturn J;
    public boolean K;
    public final y5 L;
    public Boolean M;
    public Integer f35168b;
    public final CharSequence f35169c;
    public final TLRPC.InputPeer d;
    public final int f35170e;
    public final boolean f35171f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f35172n;
    public final RichMessageLayout.PreviewView f35173r;
    public final String f35174s;
    public String v;
    public String f35175w;
    public final x21 f35176x;
    public final bh.e f35177y;

    public z21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i9, boolean z10, TL_iv.RichMessage richMessage) {
        super(context, null, false, false);
        String charSequence2;
        View view;
        this.K = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f35169c = charSequence;
        this.d = inputPeer;
        this.f35170e = i9;
        this.f35171f = z10;
        this.h = richMessage;
        this.f35174s = str;
        this.v = str2;
        bh.g gVar = new bh.g(this, context);
        this.containerView = gVar;
        this.L = new y5(gVar, 320L, gr.h);
        bh.e eVar = new bh.e(context, 7);
        this.f35177y = eVar;
        eVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        eVar.setTextSize(1, SharedConfig.fontSize);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        eVar.setTextColor(getThemedColor(i10));
        eVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.l1(0.2f, getThemedColor(i10)));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        eVar.setText(Emoji.replaceEmoji(charSequence2, eVar.getPaint().getFontMetricsInt(), true));
        this.A = new FrameLayout(context);
        l80 l80Var = new l80(context, null);
        this.B = l80Var;
        l80Var.setDisablePaddingsOffsetY(true);
        l80Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        l80Var.setTextSize(1, SharedConfig.fontSize);
        l80Var.setTextColor(getThemedColor(i10));
        l80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23061gc));
        l80Var.setTextIsSelectable(true);
        l80Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23312uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23325vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = l80Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                l80Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = l80Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                l80Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.A.addView(this.B, g7.e6.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f35172n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f35173r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        m21 m21Var = new m21(this, context);
        this.D = m21Var;
        m21Var.setOverScrollMode(1);
        m21Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        m21Var.setClipToPadding(true);
        f2.m0 m0Var = new f2.m0();
        m21Var.setLayoutManager(m0Var);
        if (this.h != null) {
            view = this.f35172n;
        } else {
            view = this.f35177y;
        }
        ?? r0Var = new f2.r0();
        r0Var.f34843e = 1;
        r0Var.f34842c = context;
        r0Var.d = view;
        this.E = r0Var;
        m21Var.setAdapter(r0Var);
        m21Var.setOnScrollListener(new n21(this));
        o21 o21Var = new o21(this);
        o21Var.n(180L);
        o21Var.o(new LinearInterpolator());
        m21Var.setItemAnimator(o21Var);
        this.containerView.addView(m21Var, g7.e6.e(-1, -2, 80));
        org.telegram.ui.Cells.n9 n9Var = new org.telegram.ui.Cells.n9();
        this.F = n9Var;
        n9Var.T(m21Var);
        n9Var.E0 = m0Var;
        org.telegram.ui.Cells.z9 o6 = n9Var.o(context);
        this.G = o6;
        AndroidUtilities.removeFromParent(o6);
        this.containerView.addView(o6, g7.e6.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f35173r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(n9Var);
        }
        x21 x21Var = new x21(this, context);
        this.f35176x = x21Var;
        this.containerView.addView(x21Var, g7.e6.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
        View view2 = new View(context);
        this.H = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, g7.e6.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        textView.setOnClickListener(new h70(this, 23));
        frameLayout.addView(textView, g7.e6.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, g7.e6.e(-1, -2, 87));
        L();
    }

    public static String A() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap C(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis;
        HashMap hashMap = new HashMap();
        if (charSequence != null && (parseEmojis = Emoji.parseEmojis(charSequence)) != null) {
            String charSequence2 = charSequence.toString();
            for (int i9 = 0; i9 < parseEmojis.size(); i9++) {
                Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i9);
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
        String K = K(str, false);
        if (K == null) {
            K = K(str2, false);
        }
        if (K != null) {
            return K;
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
            for (int i9 = 0; i9 < tL_textWithEntities2.entities.size(); i9++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i9);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i10 = messageEntity.offset;
                        String substring = str.substring(i10, messageEntity.length + i10);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i9, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i9, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i9 < arrayList.size() && (tL_textWithEntities.entities.get(i9) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i9).language;
                }
            }
            if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
                HashMap C = C(tL_textWithEntities.text);
                HashMap C2 = C(tL_textWithEntities2.text);
                for (int i11 = 0; i11 < tL_textWithEntities.entities.size(); i11++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i11);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i12 = messageEntity2.offset;
                        String substring2 = str2.substring(i12, messageEntity2.length + i12);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) C.get(substring2);
                            ArrayList arrayList3 = (ArrayList) C2.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList2.size()) {
                                        Emoji.EmojiSpanRange emojiSpanRange2 = (Emoji.EmojiSpanRange) arrayList2.get(i13);
                                        int i14 = emojiSpanRange2.start;
                                        int i15 = messageEntity2.offset;
                                        if (i14 == i15 && emojiSpanRange2.end == i15 + messageEntity2.length) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                if (i13 >= 0 && i13 < arrayList3.size() && (emojiSpanRange = (Emoji.EmojiSpanRange) arrayList3.get(i13)) != null) {
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i16);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i17 = emojiSpanRange.start;
                                                int i18 = emojiSpanRange.end;
                                                int i19 = messageEntity3.offset;
                                                if (AndroidUtilities.intersect1d(i17, i18, i19, messageEntity3.length + i19)) {
                                                    break;
                                                }
                                            }
                                            i16++;
                                        } else {
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                            tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                            tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                            int i20 = emojiSpanRange.start;
                                            tL_messageEntityCustomEmoji.offset = i20;
                                            tL_messageEntityCustomEmoji.length = emojiSpanRange.end - i20;
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

    public static void H(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static r21 I(Activity activity, org.telegram.ui.qn qnVar, TLRPC.InputPeer inputPeer, int i9, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.lf lfVar, Runnable runnable) {
        r21 r21Var = new r21(activity, str, str2, charSequence, inputPeer, i9, z10, runnable);
        r21Var.G(z11);
        r21Var.I = qnVar;
        r21Var.J = lfVar;
        if (qnVar.getParentActivity() != null) {
            qnVar.showDialog(r21Var);
        }
        return r21Var;
    }

    public static void J(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.t10 t10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        t21 t21Var = new t21(context, str, str2, charSequence, gVar);
        t21Var.G(false);
        t21Var.I = o2Var;
        t21Var.J = t10Var;
        if (o2Var != null) {
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(t21Var);
                return;
            }
            return;
        }
        t21Var.show();
    }

    public static String K(String str, boolean z10) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (O == null) {
                O = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i9 = 0; i9 < availableLocales.length; i9++) {
                        O.put(availableLocales[i9].getLanguage(), availableLocales[i9]);
                        String country = availableLocales[i9].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = O;
                            hashMap.put(availableLocales[i9].getLanguage() + "-" + country.toLowerCase(), availableLocales[i9]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) O.get(lowerCase);
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

    public static void m(z21 z21Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        l21 l21Var = z21Var.A;
        y21 y21Var = z21Var.E;
        z21Var.f35168b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            z21Var.M();
        } else if (tL_textWithEntities2 != null) {
            z21Var.K = false;
            TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
            MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
            z21Var.B.setText(z21Var.F(valueOf));
            y21Var.D(l21Var);
        } else if (z21Var.K) {
            z21Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.ll.p(R.string.TranslationFailedAlert2, new oc((FrameLayout) z21Var.containerView, z21Var.resourcesProvider), null);
            v21 v21Var = z21Var.f35176x.f34499e;
            String str = z21Var.f35175w;
            z21Var.v = str;
            v21Var.setText(D(str, null, null));
            y21Var.D(l21Var);
        }
    }

    public static void n(z21 z21Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        l21 l21Var = z21Var.A;
        y21 y21Var = z21Var.E;
        z21Var.f35168b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            z21Var.M();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                z21Var.K = false;
                TLRPC.TL_textWithEntities E = E(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(E.text);
                MessageObject.addEntitiesToText(valueOf, E.entities, false, true, false, false);
                z21Var.B.setText(z21Var.F(valueOf));
                y21Var.D(l21Var);
                return;
            }
        }
        if (z21Var.K) {
            z21Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.ll.p(R.string.TranslationFailedAlert2, new oc((FrameLayout) z21Var.containerView, z21Var.resourcesProvider), null);
        v21 v21Var = z21Var.f35176x.f34499e;
        String str = z21Var.f35175w;
        z21Var.v = str;
        v21Var.setText(D(str, null, null));
        y21Var.D(l21Var);
    }

    public static void o(z21 z21Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = z21Var.f35173r;
        z21Var.f35168b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                z21Var.K = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    z21Var.E.D(previewView);
                    return;
                }
                return;
            }
        }
        if (z21Var.K) {
            z21Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.ll.p(R.string.TranslationFailedAlert2, new oc((FrameLayout) z21Var.containerView, z21Var.resourcesProvider), null);
        v21 v21Var = z21Var.f35176x.f34499e;
        String str = z21Var.f35175w;
        z21Var.v = str;
        v21Var.setText(D(str, null, null));
    }

    public static void p(z21 z21Var, String str, Boolean bool) {
        int i9;
        int i10;
        l21 l21Var = z21Var.A;
        y21 y21Var = z21Var.E;
        if (str != null) {
            z21Var.K = false;
            z21Var.B.setText(z21Var.F(str));
            y21Var.D(l21Var);
        } else if (z21Var.isDismissed()) {
        } else {
            if (z21Var.K) {
                z21Var.dismiss();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i11 = NotificationCenter.showBulletin;
                if (bool.booleanValue()) {
                    i10 = R.string.TranslationFailedAlert1;
                } else {
                    i10 = R.string.TranslationFailedAlert2;
                }
                globalInstance.lambda$postNotificationNameOnUIThread$1(i11, 1, LocaleController.getString(i10));
                return;
            }
            oc ocVar = new oc((FrameLayout) z21Var.containerView, z21Var.resourcesProvider);
            if (bool.booleanValue()) {
                i9 = R.string.TranslationFailedAlert1;
            } else {
                i9 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.ll.p(i9, ocVar, null);
            v21 v21Var = z21Var.f35176x.f34499e;
            String str2 = z21Var.f35175w;
            z21Var.v = str2;
            v21Var.setText(D(str2, null, null));
            y21Var.D(l21Var);
        }
    }

    public static boolean u(z21 z21Var) {
        m21 m21Var = z21Var.D;
        float f10 = 0.0f;
        for (int i9 = 0; i9 < m21Var.getChildCount(); i9++) {
            View childAt = m21Var.getChildAt(i9);
            if (RecyclerView.R(childAt) == 1) {
                f10 += childAt.getHeight();
            }
        }
        if (f10 < (m21Var.getHeight() - m21Var.getPaddingTop()) - m21Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void x(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new k21(str, str3, callback2), new k21(str, str3, callback2));
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 < encode.length()) {
                int min = Math.min(i9 + 5000, encode.length());
                int i10 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i10);
                if (lastIndexOf < i9) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i10);
                    if (lastIndexOf2 >= i9) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i9, min));
                i9 = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Utilities.Callback2 callback22 = callback2;
                new p21(str2, str3, (String) arrayList.get(i12), new gh.j0(zArr, arrayList2, i12, callback22, 6)).start();
                i12++;
                callback2 = callback22;
            }
            return;
        }
        new p21(str2, str3, encode, callback2).start();
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
        if (this.J != null || this.I != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new q21(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.B.getPaint().getFontMetricsInt(), true);
    }

    public final void G(boolean z10) {
        l80 l80Var = this.B;
        if (l80Var != null) {
            l80Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
            return;
        }
        getWindow().clearFlags(8192);
        AndroidUtilities.logFlagSecure();
    }

    public final void L() {
        String charSequence;
        if (this.f35168b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35168b.intValue(), true);
            this.f35168b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            M();
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
        int i9 = this.f35170e;
        TLRPC.InputPeer inputPeer = this.d;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f22501id.add(Integer.valueOf(i9));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f35168b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new w1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f35169c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f35171f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f22500id = i9;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f35168b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new bg.y0(19, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f22502id.add(Integer.valueOf(i9));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f35168b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.rc(24, this, tL_textWithEntities)));
    }

    public final void M() {
        String charSequence;
        CharSequence charSequence2 = this.f35169c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f35174s;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            this.f35177y.invalidate();
            this.B.invalidate();
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
        if (this.f35168b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35168b.intValue(), true);
            this.f35168b = null;
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
        y5 y5Var;
        m21 m21Var = this.D;
        float top = m21Var.getTop();
        if (m21Var.getChildCount() >= 1) {
            top += Math.max(0, m21Var.getChildAt(m21Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (y5Var = this.L) != null) {
            if (!m21Var.G1 && !this.C) {
                return y5Var.d(max, false);
            }
            y5Var.d(max, true);
        }
        return max;
    }
}
