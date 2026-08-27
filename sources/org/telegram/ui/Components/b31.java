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

public abstract class b31 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] N = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap O;
    public final n21 A;
    public final p80 B;
    public boolean C;
    public final o21 D;
    public final a31 E;
    public final org.telegram.ui.Cells.j9 F;
    public final org.telegram.ui.Cells.v9 G;
    public final View H;
    public org.telegram.ui.ActionBar.n2 I;
    public Utilities.CallbackReturn J;
    public boolean K;
    public final y5 L;
    public Boolean M;

    public Integer f26906b;

    public final CharSequence f26907c;
    public final TLRPC.InputPeer d;

    public final int f26908e;

    public final boolean f26909f;
    public final TL_iv.RichMessage h;

    public final RichMessageLayout.PreviewView f26910n;

    public final RichMessageLayout.PreviewView f26911r;

    public final String f26912s;
    public String v;

    public String f26913w;

    public final z21 f26914x;

    public final ag.e1 f26915y;

    public b31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(context, null, false, false);
        this.K = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f26907c = charSequence;
        this.d = inputPeer;
        this.f26908e = i10;
        this.f26909f = z10;
        this.h = richMessage;
        this.f26912s = str;
        this.v = str2;
        ag.w wVar = new ag.w(this, context);
        this.containerView = wVar;
        this.L = new y5(wVar, 320L, er.h);
        ag.e1 e1Var = new ag.e1(context, 8);
        this.f26915y = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        e1Var.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        e1Var.setTextColor(getThemedColor(i11));
        e1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.l1(0.2f, getThemedColor(i11)));
        e1Var.setText(Emoji.replaceEmoji(charSequence == null ? "" : charSequence.toString(), e1Var.getPaint().getFontMetricsInt(), true));
        this.A = new n21(context);
        p80 p80Var = new p80(context, null);
        this.B = p80Var;
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        p80Var.setTextSize(1, SharedConfig.fontSize);
        p80Var.setTextColor(getThemedColor(i11));
        p80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        p80Var.setTextIsSelectable(true);
        p80Var.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23366uf));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23382vf);
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = p80Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                p80Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandleRight = p80Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                p80Var.setTextSelectHandleRight(textSelectHandleRight);
            }
        } catch (Exception unused) {
        }
        this.A.addView(this.B, h7.z5.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f26910n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f26911r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        o21 o21Var = new o21(this, context);
        this.D = o21Var;
        o21Var.setOverScrollMode(1);
        o21Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        o21Var.setClipToPadding(true);
        f2.k0 k0Var = new f2.k0();
        o21Var.setLayoutManager(k0Var);
        View view = this.h != null ? this.f26910n : this.f26915y;
        a31 a31Var = new a31();
        a31Var.f26620e = 1;
        a31Var.f26619c = context;
        a31Var.d = view;
        this.E = a31Var;
        o21Var.setAdapter(a31Var);
        o21Var.setOnScrollListener(new p21(this));
        q21 q21Var = new q21(this);
        q21Var.n(180L);
        q21Var.o(new LinearInterpolator());
        o21Var.setItemAnimator(q21Var);
        this.containerView.addView(o21Var, h7.z5.e(-1, -2, 80));
        org.telegram.ui.Cells.j9 j9Var = new org.telegram.ui.Cells.j9();
        this.F = j9Var;
        j9Var.T(o21Var);
        j9Var.E0 = k0Var;
        org.telegram.ui.Cells.v9 v9VarO = j9Var.o(context);
        this.G = v9VarO;
        AndroidUtilities.removeFromParent(v9VarO);
        this.containerView.addView(v9VarO, h7.z5.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f26911r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(j9Var);
        }
        z21 z21Var = new z21(this, context);
        this.f26914x = z21Var;
        this.containerView.addView(z21Var, h7.z5.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        View view2 = new View(context);
        this.H = view2;
        view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, h7.z5.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        textView.setOnClickListener(new l70(this, 23));
        frameLayout.addView(textView, h7.z5.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, h7.z5.e(-1, -2, 87));
        M();
    }

    public static String C() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap D(CharSequence charSequence) {
        ArrayList<Emoji.EmojiSpanRange> emojis;
        HashMap map = new HashMap();
        if (charSequence != null && (emojis = Emoji.parseEmojis(charSequence)) != null) {
            String string = charSequence.toString();
            for (int i10 = 0; i10 < emojis.size(); i10++) {
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i10);
                if (emojiSpanRange != null && emojiSpanRange.code != null) {
                    String strSubstring = string.substring(emojiSpanRange.start, emojiSpanRange.end);
                    ArrayList arrayList = (ArrayList) map.get(strSubstring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strSubstring, arrayList);
                    }
                    arrayList.add(emojiSpanRange);
                }
            }
        }
        return map;
    }

    public static String E(String str, boolean[] zArr, boolean[] zArr2) {
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str2 = str.split("_")[0];
        if ("nb".equals(str2)) {
            str2 = "no";
        }
        if (zArr != null) {
            String string = LocaleController.getString("TranslateLanguage" + str2.toUpperCase());
            boolean z10 = (string == null || string.startsWith("LOC_ERR")) ? false : true;
            zArr[0] = z10;
            if (z10) {
                return string;
            }
        }
        if (zArr2 != null) {
            String string2 = LocaleController.getString("TranslateLanguageGenitive" + str2.toUpperCase());
            boolean z11 = (string2 == null || string2.startsWith("LOC_ERR")) ? false : true;
            zArr2[0] = z11;
            if (z11) {
                return string2;
            }
        }
        String strL = L(str, false);
        if (strL == null) {
            strL = L(str2, false);
        }
        if (strL != null) {
            return strL;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        LocaleController.LocaleInfo builtinLanguageByPlural = LocaleController.getInstance().getBuiltinLanguageByPlural(str);
        if (builtinLanguageByPlural == null) {
            return null;
        }
        return (currentLocaleInfo == null || !"en".equals(currentLocaleInfo.pluralLangCode)) ? builtinLanguageByPlural.name : builtinLanguageByPlural.nameEnglish;
    }

    public static TLRPC.TL_textWithEntities F(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        Emoji.EmojiSpanRange emojiSpanRange;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 == null || tL_textWithEntities2.text == null) {
            return null;
        }
        for (int i10 = 0; i10 < tL_textWithEntities2.entities.size(); i10++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i10);
            if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                if (messageEntity.url != null) {
                    String str = tL_textWithEntities2.text;
                    int i11 = messageEntity.offset;
                    String strSubstring = str.substring(i11, messageEntity.length + i11);
                    if (TextUtils.equals(strSubstring, messageEntity.url)) {
                        TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                        tL_messageEntityUrl.offset = messageEntity.offset;
                        tL_messageEntityUrl.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i10, tL_messageEntityUrl);
                    } else if (messageEntity.url.startsWith("https://t.me/") && strSubstring.startsWith("@") && TextUtils.equals(strSubstring.substring(1), messageEntity.url.substring(13))) {
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
            HashMap mapD = D(tL_textWithEntities.text);
            HashMap mapD2 = D(tL_textWithEntities2.text);
            for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i13 = messageEntity2.offset;
                    String strSubstring2 = str2.substring(i13, messageEntity2.length + i13);
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        ArrayList arrayList2 = (ArrayList) mapD.get(strSubstring2);
                        ArrayList arrayList3 = (ArrayList) mapD2.get(strSubstring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList2.size()) {
                                    i14 = -1;
                                    break;
                                }
                                Emoji.EmojiSpanRange emojiSpanRange2 = (Emoji.EmojiSpanRange) arrayList2.get(i14);
                                int i15 = emojiSpanRange2.start;
                                int i16 = messageEntity2.offset;
                                if (i15 == i16 && emojiSpanRange2.end == i16 + messageEntity2.length) {
                                    break;
                                }
                                i14++;
                            }
                            if (i14 >= 0 && i14 < arrayList3.size() && (emojiSpanRange = (Emoji.EmojiSpanRange) arrayList3.get(i14)) != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= tL_textWithEntities2.entities.size()) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                        int i18 = emojiSpanRange.start;
                                        tL_messageEntityCustomEmoji.offset = i18;
                                        tL_messageEntityCustomEmoji.length = emojiSpanRange.end - i18;
                                        tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                        break;
                                    }
                                    TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i17);
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        int i19 = emojiSpanRange.start;
                                        int i20 = emojiSpanRange.end;
                                        int i21 = messageEntity3.offset;
                                        if (AndroidUtilities.intersect1d(i19, i20, i21, messageEntity3.length + i21)) {
                                            break;
                                        }
                                    }
                                    i17++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tL_textWithEntities2;
    }

    public static void I(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static t21 J(Activity activity, org.telegram.ui.rn rnVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.lf lfVar, Runnable runnable) {
        t21 t21Var = new t21(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        t21Var.H(z11);
        t21Var.I = rnVar;
        t21Var.J = lfVar;
        if (rnVar.getParentActivity() != null) {
            rnVar.showDialog(t21Var);
        }
        return t21Var;
    }

    public static void K(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.w10 w10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        v21 v21Var = new v21(context, str, str2, charSequence, gVar);
        v21Var.H(false);
        v21Var.I = n2Var;
        v21Var.J = w10Var;
        if (n2Var == null) {
            v21Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(v21Var);
        }
    }

    public static String L(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (O == null) {
            O = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i10 = 0; i10 < availableLocales.length; i10++) {
                    O.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                    String country = availableLocales[i10].getCountry();
                    if (country != null && country.length() > 0) {
                        O.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) O.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z10 ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z10 ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void m(b31 b31Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        n21 n21Var = b31Var.A;
        a31 a31Var = b31Var.E;
        b31Var.f26906b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            b31Var.N();
            return;
        }
        if (tL_textWithEntities2 != null) {
            b31Var.K = false;
            TLRPC.TL_textWithEntities tL_textWithEntitiesF = F(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesF.text);
            MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesF.entities, false, true, false, false);
            b31Var.B.setText(b31Var.G(spannableStringBuilderValueOf));
            a31Var.D(n21Var);
            return;
        }
        if (b31Var.K) {
            b31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y1.r(R.string.TranslationFailedAlert2, new mc((FrameLayout) b31Var.containerView, b31Var.resourcesProvider), null);
        x21 x21Var = b31Var.f26914x.f35142e;
        String str = b31Var.f26913w;
        b31Var.v = str;
        x21Var.setText(E(str, null, null));
        a31Var.D(n21Var);
    }

    public static void n(b31 b31Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        n21 n21Var = b31Var.A;
        a31 a31Var = b31Var.E;
        b31Var.f26906b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            b31Var.N();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                b31Var.K = false;
                TLRPC.TL_textWithEntities tL_textWithEntitiesF = F(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntitiesF.text);
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntitiesF.entities, false, true, false, false);
                b31Var.B.setText(b31Var.G(spannableStringBuilderValueOf));
                a31Var.D(n21Var);
                return;
            }
        }
        if (b31Var.K) {
            b31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y1.r(R.string.TranslationFailedAlert2, new mc((FrameLayout) b31Var.containerView, b31Var.resourcesProvider), null);
        x21 x21Var = b31Var.f26914x.f35142e;
        String str = b31Var.f26913w;
        b31Var.v = str;
        x21Var.setText(E(str, null, null));
        a31Var.D(n21Var);
    }

    public static void p(b31 b31Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = b31Var.f26911r;
        b31Var.f26906b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                b31Var.K = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    b31Var.E.D(previewView);
                    return;
                }
                return;
            }
        }
        if (b31Var.K) {
            b31Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.y1.r(R.string.TranslationFailedAlert2, new mc((FrameLayout) b31Var.containerView, b31Var.resourcesProvider), null);
        x21 x21Var = b31Var.f26914x.f35142e;
        String str = b31Var.f26913w;
        b31Var.v = str;
        x21Var.setText(E(str, null, null));
    }

    public static void q(b31 b31Var, String str, Boolean bool) {
        n21 n21Var = b31Var.A;
        a31 a31Var = b31Var.E;
        if (str != null) {
            b31Var.K = false;
            b31Var.B.setText(b31Var.G(str));
            a31Var.D(n21Var);
        } else {
            if (b31Var.isDismissed()) {
                return;
            }
            if (b31Var.K) {
                b31Var.dismiss();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2));
                return;
            }
            org.telegram.messenger.y1.r(bool.booleanValue() ? R.string.TranslationFailedAlert1 : R.string.TranslationFailedAlert2, new mc((FrameLayout) b31Var.containerView, b31Var.resourcesProvider), null);
            x21 x21Var = b31Var.f26914x.f35142e;
            String str2 = b31Var.f26913w;
            b31Var.v = str2;
            x21Var.setText(E(str2, null, null));
            a31Var.D(n21Var);
        }
    }

    public static boolean v(b31 b31Var) {
        o21 o21Var = b31Var.D;
        float height = 0.0f;
        for (int i10 = 0; i10 < o21Var.getChildCount(); i10++) {
            View childAt = o21Var.getChildAt(i10);
            if (RecyclerView.R(childAt) == 1) {
                height += childAt.getHeight();
            }
        }
        return height >= ((float) ((o21Var.getHeight() - o21Var.getPaddingTop()) - o21Var.getPaddingBottom()));
    }

    public static void y(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new m21(str, str3, callback2), new m21(str, str3, callback2));
            return;
        }
        String strEncode = Uri.encode(str);
        if (strEncode.length() <= 5000) {
            new r21(str2, str3, strEncode, callback2).start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < strEncode.length()) {
            int iMin = Math.min(i10 + 5000, strEncode.length());
            int i11 = iMin - 1;
            int iLastIndexOf = strEncode.lastIndexOf("%0A", i11);
            if (iLastIndexOf < i10) {
                iLastIndexOf = -1;
            }
            if (iLastIndexOf == -1) {
                int iLastIndexOf2 = strEncode.lastIndexOf("%20", i11);
                iLastIndexOf = iLastIndexOf2 >= i10 ? iLastIndexOf2 : -1;
            }
            if (iLastIndexOf != -1) {
                iMin = iLastIndexOf + 3;
            }
            arrayList.add(strEncode.substring(i10, iMin));
            i10 = iMin;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[1];
        int i13 = 0;
        while (i13 < arrayList.size()) {
            Utilities.Callback2 callback3 = callback2;
            new r21(str2, str3, (String) arrayList.get(i13), new hh.j0(zArr, arrayList2, i13, callback3, 6)).start();
            i13++;
            callback2 = callback3;
        }
    }

    public static String z(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public final float B(boolean z10) {
        y5 y5Var;
        o21 o21Var = this.D;
        float top = o21Var.getTop();
        if (o21Var.getChildCount() >= 1) {
            top += Math.max(0, o21Var.getChildAt(o21Var.getChildCount() - 1).getTop());
        }
        float fMax = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (y5Var = this.L) != null) {
            if (!o21Var.G1 && !this.C) {
                return y5Var.d(fMax, false);
            }
            y5Var.d(fMax, true);
        }
        return fMax;
    }

    public final CharSequence G(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.J != null || this.I != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new s21(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.B.getPaint().getFontMetricsInt(), true);
    }

    public final void H(boolean z10) {
        p80 p80Var = this.B;
        if (p80Var != null) {
            p80Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
        } else {
            getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        }
    }

    public final void M() {
        if (this.f26906b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f26906b.intValue(), true);
            this.f26906b = null;
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
        int i10 = this.f26908e;
        TLRPC.InputPeer inputPeer = this.d;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f22501id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f26906b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new w1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.f26907c;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.f26909f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f22500id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f26906b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new org.telegram.messenger.a(), new cg.u0(19, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f22502id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f26906b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.gg(21, this, tL_textWithEntities)));
    }

    public final void N() {
        CharSequence charSequence = this.f26907c;
        String string = charSequence == null ? "" : charSequence.toString();
        String str = this.f26912s;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.v;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        y(string, str, "nb".equals(str2) ? "no" : str2, new d(this, 21));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f26915y.invalidate();
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
        if (this.f26906b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f26906b.intValue(), true);
            this.f26906b = null;
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
}
