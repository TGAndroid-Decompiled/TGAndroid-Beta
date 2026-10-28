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
public abstract class g51 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final String[] X = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap Y;
    public final p41 E;
    public final aa0 F;
    public final Drawable G;
    public final Drawable H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public final q41 M;
    public final f51 N;
    public final org.telegram.ui.Cells.s9 O;
    public final org.telegram.ui.Cells.ea P;
    public final View Q;
    public final TextView R;
    public org.telegram.ui.ActionBar.r2 S;
    public Utilities.CallbackReturn T;
    public boolean U;
    public final h6 V;
    public Boolean W;
    public Integer f28398b;
    public final CharSequence f28399c;
    public final TLRPC.InputPeer d;
    public final int e;
    public final boolean f28400f;
    public final TL_iv.RichMessage h;
    public final RichMessageLayout.PreviewView f28401n;
    public final RichMessageLayout.PreviewView f28402r;
    public final String f28403s;
    public String v;
    public String f28404w;
    public final e51 f28405x;
    public final ei.n f28406y;

    public g51(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.u6) null, false);
        String charSequence2;
        View view;
        this.K = org.telegram.ui.ActionBar.y6.I.q();
        this.U = true;
        this.backgroundPaddingLeft = 0;
        fixNavigationBar();
        this.f28399c = charSequence;
        this.d = inputPeer;
        this.e = i10;
        this.f28400f = z10;
        this.h = richMessage;
        this.f28403s = str;
        this.v = str2;
        z41 z41Var = new z41(this, context);
        this.containerView = z41Var;
        this.V = new h6(z41Var, 320L, ds.h);
        ei.n nVar = new ei.n(context, 7);
        this.f28406y = nVar;
        nVar.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        nVar.setTextSize(1, SharedConfig.fontSize);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(nVar, i11, null);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.2f, i11);
        org.telegram.ui.ActionBar.f7.o(nVar, 2, L.f22486a, -1, 2, L.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        nVar.setText(Emoji.replaceEmoji(charSequence2, nVar.getPaint().getFontMetricsInt(), true));
        this.E = new FrameLayout(context);
        aa0 aa0Var = new aa0(context, null);
        this.F = aa0Var;
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        aa0Var.setTextSize(1, SharedConfig.fontSize);
        org.telegram.ui.ActionBar.f7.V(aa0Var, i11, null);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, null);
        aa0Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.f7.D(aa0Var, org.telegram.ui.ActionBar.y6.f23683uf, null);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23701vf);
        this.J = themedColor;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
                Drawable textSelectHandleLeft = aa0Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(themedColor, mode);
                aa0Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.G = textSelectHandleLeft;
                Drawable textSelectHandleRight = aa0Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(themedColor, mode);
                aa0Var.setTextSelectHandleRight(textSelectHandleRight);
                this.H = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.E.addView(this.F, kb1.g(-1.0f, -1));
        if (this.h != null) {
            RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f28401n = previewView;
            previewView.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
            previewView.set(this.h);
            previewView.setTranslationLoading(true);
            RichMessageLayout.PreviewView previewView2 = new RichMessageLayout.PreviewView(context, this.currentAccount, null);
            this.f28402r = previewView2;
            previewView2.setPadding(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(6.0f));
        }
        q41 q41Var = new q41(this, context);
        this.M = q41Var;
        q41Var.setOverScrollMode(1);
        q41Var.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(80.0f));
        q41Var.setClipToPadding(true);
        s4.c0 c0Var = new s4.c0();
        q41Var.setLayoutManager(c0Var);
        if (this.h != null) {
            view = this.f28401n;
        } else {
            view = this.f28406y;
        }
        ?? h0Var = new s4.h0();
        h0Var.e = 1;
        h0Var.f28031c = context;
        h0Var.d = view;
        this.N = h0Var;
        q41Var.setAdapter(h0Var);
        q41Var.setOnScrollListener(new r41(this));
        s41 s41Var = new s41(this);
        s41Var.n(180L);
        s41Var.o(new LinearInterpolator());
        q41Var.setItemAnimator(s41Var);
        this.containerView.addView(q41Var, kb1.i(-1, -2, 80));
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
        this.O = s9Var;
        s9Var.S(q41Var);
        s9Var.f25422z0 = c0Var;
        org.telegram.ui.Cells.ea n10 = s9Var.n(context);
        this.P = n10;
        AndroidUtilities.removeFromParent(n10);
        this.containerView.addView(n10, kb1.i(-1, -1, 119));
        RichMessageLayout.PreviewView previewView3 = this.f28402r;
        if (previewView3 != null) {
            previewView3.setTextSelectionHelper(s9Var);
        }
        e51 e51Var = new e51(this, context);
        this.f28405x = e51Var;
        this.containerView.addView(e51Var, kb1.i(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, frameLayout, null);
        View view2 = new View(context);
        this.Q = view2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, kb1.e(-1.0f, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55));
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
        textView.setOnClickListener(new x80(this, 21));
        frameLayout.addView(textView, kb1.h(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.containerView.addView(frameLayout, kb1.i(-1, -2, 87));
        V();
    }

    public static boolean F(g51 g51Var) {
        View childAt;
        q41 q41Var = g51Var.M;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < q41Var.getChildCount(); i10++) {
            if (RecyclerView.R(q41Var.getChildAt(i10)) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (q41Var.getHeight() - q41Var.getPaddingTop()) - q41Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void I(String str, String str2, String str3, Utilities.Callback2 callback2) {
        if (str2 == null) {
            LanguageDetector.detectLanguage(str, new o41(str, str3, callback2), new o41(str, str3, callback2));
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
                new u41(str2, str3, (String) arrayList.get(i13), new bi.v0(zArr, arrayList2, i13, callback22, 7)).start();
                i13++;
                callback2 = callback22;
            }
            return;
        }
        new u41(str2, str3, encode, callback2).start();
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

    public static w41 S(Activity activity, org.telegram.ui.wn wnVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.nf nfVar, Runnable runnable) {
        w41 w41Var = new w41(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        w41Var.Q(z11);
        w41Var.S = wnVar;
        w41Var.T = nfVar;
        if (wnVar.getParentActivity() != null) {
            wnVar.showDialog(w41Var);
        }
        return w41Var;
    }

    public static void T(Context context, org.telegram.ui.ActionBar.r2 r2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.z10 z10Var, org.telegram.ui.Cells.g gVar) {
        if (context == null) {
            return;
        }
        y41 y41Var = new y41(context, str, str2, charSequence, gVar);
        y41Var.Q(false);
        y41Var.S = r2Var;
        y41Var.T = z10Var;
        if (r2Var != null) {
            if (r2Var.getParentActivity() != null) {
                r2Var.showDialog(y41Var);
                return;
            }
            return;
        }
        y41Var.show();
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

    public static void m(g51 g51Var, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, TLRPC.TL_error tL_error) {
        p41 p41Var = g51Var.E;
        f51 f51Var = g51Var.N;
        g51Var.f28398b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            g51Var.W();
        } else if (tL_textWithEntities2 != null) {
            g51Var.U = false;
            TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_textWithEntities2);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
            MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
            g51Var.F.setText(g51Var.P(valueOf));
            f51Var.D(p41Var);
        } else if (g51Var.U) {
            g51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
        } else {
            org.telegram.messenger.wh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) g51Var.containerView, g51Var.resourcesProvider), null);
            c51 c51Var = g51Var.f28405x.e;
            String str = g51Var.f28404w;
            g51Var.v = str;
            c51Var.setText(N(str, null, null));
            f51Var.D(p41Var);
        }
    }

    public static void n(g51 g51Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        p41 p41Var = g51Var.E;
        f51 f51Var = g51Var.N;
        g51Var.f28398b = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            g51Var.W();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                g51Var.U = false;
                TLRPC.TL_textWithEntities O = O(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(O.text);
                MessageObject.addEntitiesToText(valueOf, O.entities, false, true, false, false);
                g51Var.F.setText(g51Var.P(valueOf));
                f51Var.D(p41Var);
                return;
            }
        }
        if (g51Var.U) {
            g51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.wh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) g51Var.containerView, g51Var.resourcesProvider), null);
        c51 c51Var = g51Var.f28405x.e;
        String str = g51Var.f28404w;
        g51Var.v = str;
        c51Var.setText(N(str, null, null));
        f51Var.D(p41Var);
    }

    public static void o(g51 g51Var, TLObject tLObject) {
        RichMessageLayout.PreviewView previewView = g51Var.f28402r;
        g51Var.f28398b = null;
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
            if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                g51Var.U = false;
                TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                if (previewView != null) {
                    previewView.set(richMessage);
                    g51Var.N.D(previewView);
                    return;
                }
                return;
            }
        }
        if (g51Var.U) {
            g51Var.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.TranslationFailedAlert2));
            return;
        }
        org.telegram.messenger.wh.n(R.string.TranslationFailedAlert2, new wc((FrameLayout) g51Var.containerView, g51Var.resourcesProvider), null);
        c51 c51Var = g51Var.f28405x.e;
        String str = g51Var.f28404w;
        g51Var.v = str;
        c51Var.setText(N(str, null, null));
    }

    public static void p(g51 g51Var, String str, Boolean bool) {
        int i10;
        int i11;
        p41 p41Var = g51Var.E;
        f51 f51Var = g51Var.N;
        if (str != null) {
            g51Var.U = false;
            g51Var.F.setText(g51Var.P(str));
            f51Var.D(p41Var);
        } else if (g51Var.isDismissed()) {
        } else {
            if (g51Var.U) {
                g51Var.dismiss();
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
            wc wcVar = new wc((FrameLayout) g51Var.containerView, g51Var.resourcesProvider);
            if (bool.booleanValue()) {
                i10 = R.string.TranslationFailedAlert1;
            } else {
                i10 = R.string.TranslationFailedAlert2;
            }
            org.telegram.messenger.wh.n(i10, wcVar, null);
            c51 c51Var = g51Var.f28405x.e;
            String str2 = g51Var.f28404w;
            g51Var.v = str2;
            c51Var.setText(N(str2, null, null));
            f51Var.D(p41Var);
        }
    }

    public final float K(boolean z10) {
        h6 h6Var;
        q41 q41Var = this.M;
        float top = q41Var.getTop();
        if (q41Var.getChildCount() >= 1) {
            top += Math.max(0, q41Var.getChildAt(q41Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - AndroidUtilities.dp(78.0f));
        if (z10 && (h6Var = this.V) != null) {
            if (!q41Var.I1 && !this.L) {
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
                    spannableStringBuilder.setSpan(new v41(this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, this.F.getPaint().getFontMetricsInt(), true);
    }

    public final void Q(boolean z10) {
        aa0 aa0Var = this.F;
        if (aa0Var != null) {
            aa0Var.setTextIsSelectable(!z10);
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
        if (this.f28398b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28398b.intValue(), true);
            this.f28398b = null;
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
            tL_messages_translateRichMessage.f22151id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = TranslateController.normalizeLanguage(str);
            this.f28398b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateRichMessage, new b2(this, 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f28399c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f28400f && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f22150id = i10;
            tL_messages_summarizeText.to_lang = TranslateController.normalizeLanguage(str);
            this.f28398b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new Object(), new bi.m5(17, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f22152id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = TranslateController.normalizeLanguage(str);
        this.f28398b = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_translateText, new org.telegram.ui.z7(25, this, tL_textWithEntities)));
    }

    public final void W() {
        String charSequence;
        CharSequence charSequence2 = this.f28399c;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f28403s;
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
            this.f28406y.invalidate();
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
        if (this.f28398b != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28398b.intValue(), true);
            this.f28398b = null;
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23701vf);
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
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.translationModelDownloaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.translationModelDownloading);
    }
}
