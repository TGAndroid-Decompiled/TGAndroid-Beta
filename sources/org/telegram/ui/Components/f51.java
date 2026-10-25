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
public abstract class f51 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] X = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap Y;
    public final o41 E;
    public final z90 F;
    public final Drawable G;
    public final Drawable H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public final p41 M;
    public final e51 N;
    public final org.telegram.ui.Cells.s9 O;
    public final org.telegram.ui.Cells.ea P;
    public final View Q;
    public final TextView R;
    public org.telegram.ui.ActionBar.r2 S;
    public Utilities.CallbackReturn T;
    public boolean U;
    public final h6 V;
    public Boolean W;
    public Integer f28058b;
    public final CharSequence f28059c;
    public final TLRPC.InputPeer d;
    public final int e;
    public final boolean f28060f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f28061n;
    public final RichMessageLayout.PreviewView f28062r;
    public final String f28063s;
    public String v;
    public String f28064w;
    public final d51 f28065x;
    public final ei.n f28066y;

    public f51(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.u6) null, false);
        String charSequence2;
        View view;
        this.K = org.telegram.ui.ActionBar.y6.I.q();
        this.U = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f28059c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f28060f = z10;
        this.h = richMessage;
        this.f28063s = str;
        this.v = str2;
        y41 y41Var = new y41(this, context);
        this.containerView = y41Var;
        this.V = new h6(y41Var, 320L, ds.h);
        ei.n nVar = new ei.n(context, 7);
        this.f28066y = nVar;
        nVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        nVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.V(nVar, i11, null);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.2f, i11);
        org.telegram.ui.ActionBar.f7.o(nVar, 2, L.f22483a, -1, 2, L.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        nVar.setText(Emoji.replaceEmoji(charSequence2, nVar.getPaint().getFontMetricsInt(), true));
        this.E = new FrameLayout(context);
        z90 z90Var = new z90(context, null);
        this.F = z90Var;
        z90Var.setDisablePaddingsOffsetY(true);
        z90Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        z90Var.setTextSize(1, SharedConfig.fontSize);
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, null);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, null);
        z90Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.f7.D(z90Var, org.telegram.ui.ActionBar.y6.f23680uf, null);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23698vf);
        this.J = themedColor;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = z90Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                z90Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.G = textSelectHandleLeft;
                Drawable textSelectHandleRight = z90Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                z90Var.setTextSelectHandleRight(textSelectHandleRight);
                this.H = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, gb1.g(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f28061n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f28062r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        p41 p41Var = new p41(this, context);
        this.M = p41Var;
        p41Var.setOverScrollMode(1);
        p41Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        p41Var.setClipToPadding(true);
        s4.c0 c0Var = new s4.c0();
        p41Var.setLayoutManager(c0Var);
        if (this.h != null) {
            view = this.f28061n;
        } else {
            view = this.f28066y;
        }
        ?? h0Var = new s4.h0();
        h0Var.e = 1;
        h0Var.f27744c = context;
        h0Var.d = view;
        this.N = h0Var;
        p41Var.setAdapter(h0Var);
        p41Var.setOnScrollListener(new q41(this));
        r41 r41Var = new r41(this);
        r41Var.n(180L);
        r41Var.o(new LinearInterpolator());
        p41Var.setItemAnimator(r41Var);
        this.containerView.addView(p41Var, gb1.i(-1, -2, 80));
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
        this.O = s9Var;
        s9Var.S(p41Var);
        s9Var.f25418z0 = c0Var;
        org.telegram.ui.Cells.ea n10 = s9Var.n(context);
        this.P = n10;
        AndroidUtilities.removeFromParent(n10);
        this.containerView.addView(n10, gb1.i(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f28062r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(s9Var);
        }
        d51 d51Var = new d51(this, context);
        this.f28065x = d51Var;
        this.containerView.addView(d51Var, gb1.i(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, frameLayout, null);
        View view2 = new View(context);
        this.Q = view2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, gb1.e(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.CloseTranslation));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
        this.I = x02;
        textView.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, x02));
        textView.setOnClickListener(new w80(this, 21));
        frameLayout.addView(textView, gb1.h(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, gb1.i(-1, -2, 87));
        V();
    }

    public static boolean F(f51 f51Var) {
        View childAt;
        p41 p41Var = f51Var.M;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < p41Var.getChildCount(); i10++) {
            if (RecyclerView.R(p41Var.getChildAt(i10)) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (p41Var.getHeight() - p41Var.getPaddingTop()) - p41Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void I(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new n41(str, str3, callback2), new n41(str, str3, callback2));
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
                new t41(str2, str3, (String) arrayList.get(i13), new bi.v0(zArr, arrayList2, i13, callback22, 7)).start();
                i13++;
                callback2 = callback22;
            }
            return;
        }
        new t41(str2, str3, encode, callback2).start();
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

    public static v41 S(Activity activity, org.telegram.ui.un unVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.of ofVar, Runnable runnable) {
        v41 v41Var = new v41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        v41Var.Q(z11);
        v41Var.S = unVar;
        v41Var.T = ofVar;
        if (unVar.getParentActivity() != null) {
            unVar.showDialog(v41Var);
        }
        return v41Var;
    }

    public static void T(Context context, org.telegram.ui.ActionBar.r2 r2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.x10 x10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        x41 x41Var = new x41(context, str, str2, charSequence, gVar);
        x41Var.Q(false);
        x41Var.S = r2Var;
        x41Var.T = x10Var;
        if (r2Var != null) {
            if (r2Var.getParentActivity() != null) {
                r2Var.showDialog(x41Var);
                return;
            }
            return;
        }
        x41Var.show();
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

    public static void m(f51 f51Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        o41 o41Var = f51Var.E;
        e51 e51Var = f51Var.N;
        f51Var.f28058b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            f51Var.W();
        } else if (tL_textWithEntities2 != null) {
            f51Var.U = false;
            TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
            MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
            f51Var.F.setText(f51Var.P(valueOf));
            e51Var.D(o41Var);
        } else if (f51Var.U) {
            f51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.vh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) f51Var.containerView, f51Var.resourcesProvider), null);
            b51 b51Var = f51Var.f28065x.e;
            String str = f51Var.f28064w;
            f51Var.v = str;
            b51Var.setText(N(str, null, null));
            e51Var.D(o41Var);
        }
    }

    public static void n(f51 f51Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        o41 o41Var = f51Var.E;
        e51 e51Var = f51Var.N;
        f51Var.f28058b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            f51Var.W();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                f51Var.U = false;
                TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
                MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
                f51Var.F.setText(f51Var.P(valueOf));
                e51Var.D(o41Var);
                return;
            }
        }
        if (f51Var.U) {
            f51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.vh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) f51Var.containerView, f51Var.resourcesProvider), null);
        b51 b51Var = f51Var.f28065x.e;
        String str = f51Var.f28064w;
        f51Var.v = str;
        b51Var.setText(N(str, null, null));
        e51Var.D(o41Var);
    }

    public static void o(f51 f51Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = f51Var.f28062r;
        f51Var.f28058b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                f51Var.U = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    f51Var.N.D(previewView);
                    return;
                }
                return;
            }
        }
        if (f51Var.U) {
            f51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.vh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) f51Var.containerView, f51Var.resourcesProvider), null);
        b51 b51Var = f51Var.f28065x.e;
        String str = f51Var.f28064w;
        f51Var.v = str;
        b51Var.setText(N(str, null, null));
    }

    public static void p(f51 f51Var, String str, Boolean bool) {
        int i10;
        int i11;
        o41 o41Var = f51Var.E;
        e51 e51Var = f51Var.N;
        if (str != null) {
            f51Var.U = false;
            f51Var.F.setText(f51Var.P(str));
            e51Var.D(o41Var);
        } else if (f51Var.isDismissed()) {
        } else {
            if (f51Var.U) {
                f51Var.dismiss();
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
            wc wcVar = new wc((FrameLayout) f51Var.containerView, f51Var.resourcesProvider);
            if (bool.booleanValue()) {
                i10 = R.string.TranslationFailedAlert1;
            } else {
                i10 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.vh.n(i10, wcVar, null);
            b51 b51Var = f51Var.f28065x.e;
            String str2 = f51Var.f28064w;
            f51Var.v = str2;
            b51Var.setText(N(str2, null, null));
            e51Var.D(o41Var);
        }
    }

    public final float K(boolean z10) {
        h6 h6Var;
        p41 p41Var = this.M;
        float top = p41Var.getTop();
        if (p41Var.getChildCount() >= 1) {
            top += Math.max(0, p41Var.getChildAt(p41Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (h6Var = this.V) != null) {
            if (!p41Var.I1 && !this.L) {
                return h6Var.d(max, false);
            }
            h6Var.d(max, true);
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
                    spannableStringBuilder.setSpan(new u41(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void Q(boolean z10) {
        z90 z90Var = this.F;
        if (z90Var != null) {
            z90Var.setTextIsSelectable(!z10);
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
        if (this.f28058b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28058b.intValue(), true);
            this.f28058b = null;
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
            tL_messages_translateRichMessage.f22148id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f28058b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new b2(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f28059c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f28060f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f22147id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f28058b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new bi.m5(17, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f22149id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f28058b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.z7(25, this, tL_textWithEntities)));
    }

    public final void W() {
        String charSequence;
        CharSequence charSequence2 = this.f28059c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f28063s;
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
            this.f28066y.invalidate();
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
        if (this.f28058b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28058b.intValue(), true);
            this.f28058b = null;
        }
        super.dismissInternal();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
            TextView textView = this.R;
            if (textView != null) {
                if (x02 == this.I) {
                    if (this.K != org.telegram.ui.ActionBar.y6.I.q()) {
                    }
                }
                this.I = x02;
                this.K = org.telegram.ui.ActionBar.y6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, x02));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23698vf);
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
