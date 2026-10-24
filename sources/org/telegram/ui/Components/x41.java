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
import org.telegram.messenger.FileLog;
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
public abstract class x41 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] X = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap Y;
    public final g41 E;
    public final w90 F;
    public final Drawable G;
    public final Drawable H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public final h41 M;
    public final w41 N;
    public final org.telegram.ui.Cells.o9 O;
    public final org.telegram.ui.Cells.aa P;
    public final View Q;
    public final TextView R;
    public org.telegram.ui.ActionBar.o2 S;
    public Utilities.CallbackReturn T;
    public boolean U;
    public final d6 V;
    public Boolean W;
    public Integer f32512b;
    public final CharSequence f32513c;
    public final TLRPC.InputPeer d;
    public final int e;
    public final boolean f32514f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f32515n;
    public final RichMessageLayout.PreviewView f32516r;
    public final String f32517s;
    public String v;
    public String f32518w;
    public final v41 f32519x;
    public final di.n f32520y;

    public x41(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        String charSequence2;
        View view;
        this.K = org.telegram.ui.ActionBar.k6.I.q();
        this.U = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f32513c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f32514f = z10;
        this.h = richMessage;
        this.f32517s = str;
        this.v = str2;
        q41 q41Var = new q41(this, context);
        this.containerView = q41Var;
        this.V = new d6(q41Var, 320L, zr.h);
        di.n nVar = new di.n(context, 7);
        this.f32520y = nVar;
        nVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        nVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(nVar, i11, null);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.2f, i11);
        org.telegram.ui.ActionBar.r6.o(nVar, 2, M.f21711a, -1, 2, M.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        nVar.setText(Emoji.replaceEmoji(charSequence2, nVar.getPaint().getFontMetricsInt(), true));
        this.E = new FrameLayout(context);
        w90 w90Var = new w90(context, null);
        this.F = w90Var;
        w90Var.setDisablePaddingsOffsetY(true);
        w90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        w90Var.setTextSize(1, SharedConfig.fontSize);
        org.telegram.ui.ActionBar.r6.W(w90Var, i11, null);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, null);
        w90Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.r6.E(w90Var, org.telegram.ui.ActionBar.k6.f21508uf, null);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21526vf);
        this.J = themedColor;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = w90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                w90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.G = textSelectHandleLeft;
                Drawable textSelectHandleRight = w90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                w90Var.setTextSelectHandleRight(textSelectHandleRight);
                this.H = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, w7.z5.c(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f32515n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f32516r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        h41 h41Var = new h41(this, context);
        this.M = h41Var;
        h41Var.setOverScrollMode(1);
        h41Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        h41Var.setClipToPadding(true);
        s4.b0 b0Var = new s4.b0();
        h41Var.setLayoutManager(b0Var);
        if (this.h != null) {
            view = this.f32515n;
        } else {
            view = this.f32520y;
        }
        ?? g0Var = new s4.g0();
        g0Var.e = 1;
        g0Var.f32128c = context;
        g0Var.d = view;
        this.N = g0Var;
        h41Var.setAdapter(g0Var);
        h41Var.setOnScrollListener(new i41(this));
        j41 j41Var = new j41(this);
        j41Var.n(180L);
        j41Var.o(new LinearInterpolator());
        h41Var.setItemAnimator(j41Var);
        this.containerView.addView(h41Var, w7.z5.e(-1, -2, 80));
        org.telegram.ui.Cells.o9 o9Var = new org.telegram.ui.Cells.o9();
        this.O = o9Var;
        o9Var.S(h41Var);
        o9Var.f22872z0 = b0Var;
        org.telegram.ui.Cells.aa n10 = o9Var.n(context);
        this.P = n10;
        AndroidUtilities.removeFromParent(n10);
        this.containerView.addView(n10, w7.z5.e(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f32516r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(o9Var);
        }
        v41 v41Var = new v41(this, context);
        this.f32519x = v41Var;
        this.containerView.addView(v41Var, w7.z5.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout, null);
        View view2 = new View(context);
        this.Q = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, w7.z5.a(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        this.I = x02;
        textView.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, x02));
        textView.setOnClickListener(new t80(this, 22));
        frameLayout.addView(textView, w7.z5.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 87));
        V();
    }

    public static boolean E(x41 x41Var) {
        View childAt;
        h41 h41Var = x41Var.M;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < h41Var.getChildCount(); i10++) {
            if (RecyclerView.R(h41Var.getChildAt(i10)) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (h41Var.getHeight() - h41Var.getPaddingTop()) - h41Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void I(String str, String str2, String str3, Utilities.Callback2 callback2) {
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
                new l41(str2, str3, (String) arrayList.get(i13), new ai.u0(zArr, arrayList2, i13, callback22, 7)).start();
                i13++;
                callback2 = callback22;
            }
            return;
        }
        new l41(str2, str3, encode, callback2).start();
    }

    public static String J(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String L() {
        return MessagesController.getGlobalMainSettings().getString("translate_to_language", LocaleController.getInstance().getCurrentLocale().getLanguage());
    }

    public static HashMap M(CharSequence charSequence) {
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

    public static String N(String str, boolean[] zArr, boolean[] zArr2) {
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
            if (string2 == null || string2.startsWith("LOC_ERR")) {
                z11 = false;
            }
            zArr2[0] = z11;
            if (z11) {
                return string2;
            }
        }
        String U = U(str, false);
        if (U == null) {
            U = U(str2, false);
        }
        if (U != null) {
            return U;
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

    public static TLRPC.TL_textWithEntities O(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
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
                HashMap M = M(tL_textWithEntities.text);
                HashMap M2 = M(tL_textWithEntities2.text);
                for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i13 = messageEntity2.offset;
                        String substring2 = str2.substring(i13, messageEntity2.length + i13);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) M.get(substring2);
                            ArrayList arrayList3 = (ArrayList) M2.get(substring2);
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

    public static void R(String str) {
        MessagesController.getGlobalMainSettings().edit().putString("translate_to_language", str).apply();
    }

    public static n41 S(Activity activity, org.telegram.ui.sn snVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.of ofVar, Runnable runnable) {
        n41 n41Var = new n41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        n41Var.Q(z11);
        n41Var.S = snVar;
        n41Var.T = ofVar;
        if (snVar.getParentActivity() != null) {
            snVar.showDialog(n41Var);
        }
        return n41Var;
    }

    public static void T(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.x10 x10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        p41 p41Var = new p41(context, str, str2, charSequence, gVar);
        p41Var.Q(false);
        p41Var.S = o2Var;
        p41Var.T = x10Var;
        if (o2Var != null) {
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(p41Var);
                return;
            }
            return;
        }
        p41Var.show();
    }

    public static String U(String str, boolean z10) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (Y == null) {
                Y = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i10 = 0; i10 < availableLocales.length; i10++) {
                        Y.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                        String country = availableLocales[i10].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = Y;
                            hashMap.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) Y.get(lowerCase);
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

    public static void m(x41 x41Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        g41 g41Var = x41Var.E;
        w41 w41Var = x41Var.N;
        x41Var.f32512b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            x41Var.W();
        } else if (tL_textWithEntities2 != null) {
            x41Var.U = false;
            TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
            MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
            x41Var.F.setText(x41Var.P(valueOf));
            w41Var.D(g41Var);
        } else if (x41Var.U) {
            x41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.tl.q(R.string.TranslationFailedAlert2, new vc((FrameLayout) x41Var.containerView, x41Var.resourcesProvider), null);
            t41 t41Var = x41Var.f32519x.e;
            String str = x41Var.f32518w;
            x41Var.v = str;
            t41Var.setText(N(str, null, null));
            w41Var.D(g41Var);
        }
    }

    public static void n(x41 x41Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        g41 g41Var = x41Var.E;
        w41 w41Var = x41Var.N;
        x41Var.f32512b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            x41Var.W();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                x41Var.U = false;
                TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
                MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
                x41Var.F.setText(x41Var.P(valueOf));
                w41Var.D(g41Var);
                return;
            }
        }
        if (x41Var.U) {
            x41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.tl.q(R.string.TranslationFailedAlert2, new vc((FrameLayout) x41Var.containerView, x41Var.resourcesProvider), null);
        t41 t41Var = x41Var.f32519x.e;
        String str = x41Var.f32518w;
        x41Var.v = str;
        t41Var.setText(N(str, null, null));
        w41Var.D(g41Var);
    }

    public static void p(x41 x41Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = x41Var.f32516r;
        x41Var.f32512b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                x41Var.U = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    x41Var.N.D(previewView);
                    return;
                }
                return;
            }
        }
        if (x41Var.U) {
            x41Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.tl.q(R.string.TranslationFailedAlert2, new vc((FrameLayout) x41Var.containerView, x41Var.resourcesProvider), null);
        t41 t41Var = x41Var.f32519x.e;
        String str = x41Var.f32518w;
        x41Var.v = str;
        t41Var.setText(N(str, null, null));
    }

    public static void q(x41 x41Var, String str, Boolean bool) {
        int i10;
        int i11;
        g41 g41Var = x41Var.E;
        w41 w41Var = x41Var.N;
        if (str != null) {
            x41Var.U = false;
            x41Var.F.setText(x41Var.P(str));
            w41Var.D(g41Var);
        } else if (x41Var.isDismissed()) {
        } else {
            if (x41Var.U) {
                x41Var.dismiss();
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
            vc vcVar = new vc((FrameLayout) x41Var.containerView, x41Var.resourcesProvider);
            if (bool.booleanValue()) {
                i10 = R.string.TranslationFailedAlert1;
            } else {
                i10 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.tl.q(i10, vcVar, null);
            t41 t41Var = x41Var.f32519x.e;
            String str2 = x41Var.f32518w;
            x41Var.v = str2;
            t41Var.setText(N(str2, null, null));
            w41Var.D(g41Var);
        }
    }

    public final float K(boolean z10) {
        d6 d6Var;
        h41 h41Var = this.M;
        float top = h41Var.getTop();
        if (h41Var.getChildCount() >= 1) {
            top += Math.max(0, h41Var.getChildAt(h41Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (d6Var = this.V) != null) {
            if (!h41Var.I1 && !this.L) {
                return d6Var.d(max, false);
            }
            d6Var.d(max, true);
        }
        return max;
    }

    public final CharSequence P(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.T != null || this.S != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new m41(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void Q(boolean z10) {
        w90 w90Var = this.F;
        if (w90Var != null) {
            w90Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            AndroidUtilities.logFlagSecure();
            return;
        }
        getWindow().clearFlags(8192);
        AndroidUtilities.logFlagSecure();
    }

    public final void V() {
        String charSequence;
        if (this.f32512b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32512b.intValue(), true);
            this.f32512b = null;
        }
        if ("alternative".equalsIgnoreCase(MessagesController.getInstance(this.currentAccount).translationsManualEnabled)) {
            W();
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
            tL_messages_translateRichMessage.f20465id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f32512b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new x1(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f32513c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f32514f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f20464id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f32512b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new ai.r5(17, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f20466id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f32512b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.vc(24, this, tL_textWithEntities)));
    }

    public final void W() {
        String charSequence;
        CharSequence charSequence2 = this.f32513c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f32517s;
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
        I(charSequence, str, str2, new d(this, 21));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f32520y.invalidate();
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
        if (this.f32512b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32512b.intValue(), true);
            this.f32512b = null;
        }
        super.dismissInternal();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
            TextView textView = this.R;
            if (textView != null) {
                if (x02 == this.I) {
                    if (this.K != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.I = x02;
                this.K = org.telegram.ui.ActionBar.k6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, x02));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21526vf);
            if (themedColor != this.J) {
                this.J = themedColor;
                Drawable drawable = this.G;
                if (drawable != null) {
                    drawable.setColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.H;
                if (drawable2 != null) {
                    drawable2.setColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.translationModelDownloading);
    }
}
