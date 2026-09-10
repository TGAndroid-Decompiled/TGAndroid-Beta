package org.telegram.ui.Components;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class aa0 {
    public static final Pattern f21446a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern f21447b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern f21448c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(bf.p pVar, TL_iv.PageBlock pageBlock) {
        x90 x90Var = new x90(pageBlock);
        pVar.a(x90Var);
        return g(h(x90.x(x90Var.f28986c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i10;
        if (richText == null) {
            return Collections.singletonList(j(""));
        }
        if (k(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String l4 = l(richText);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < l4.length()) {
            if (l4.length() - i11 <= 8192) {
                arrayList.add(j(l4.substring(i11)));
                return arrayList;
            }
            int i12 = i11 + 8192;
            int i13 = i11 + 8191;
            int lastIndexOf = l4.lastIndexOf(10, i13);
            if (lastIndexOf <= i11) {
                lastIndexOf = l4.lastIndexOf(32, i13);
            }
            if (lastIndexOf <= i11) {
                i10 = 0;
            } else {
                i12 = lastIndexOf;
                i10 = 1;
            }
            arrayList.add(j(l4.substring(i11, i12)));
            i11 = i12 + i10;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        String trim;
        TL_iv.textMath textmath = new TL_iv.textMath();
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        textmath.source = trim;
        textmath.tried = true;
        hi.t a2 = hi.t.a(trim, AndroidUtilities.dp(20.0f), true);
        if (a2 != null) {
            textmath.f17423w = a2.f9851b;
            textmath.h = a2.f9852c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.f9850a;
        }
        return textmath;
    }

    public static TL_iv.RichText d(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (k(richText) <= 8192) {
            return richText;
        }
        String l4 = l(richText);
        return j(l4.substring(0, Math.min(l4.length(), 8192)));
    }

    public static void e(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f384f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            e(arrayList, unmodifiableList);
        }
    }

    public static TLRPC.TL_webPage f(MessageObject messageObject) {
        TLRPC.Document document;
        File file;
        String str;
        String str2;
        if (messageObject.messageOwner != null && (document = messageObject.getDocument()) != null) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                file = new File(messageObject.messageOwner.attachPath);
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
            }
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
            }
            if (file != null && file.exists() && file.length() <= 65536) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                if (tL_documentAttributeFilename != null) {
                    str = tL_documentAttributeFilename.file_name;
                } else {
                    str = null;
                }
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                String str3 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                tL_webPage.url = str2;
                if (str != null) {
                    str3 = str;
                }
                tL_webPage.display_url = str3;
                if (!TextUtils.isEmpty(str)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = file;
                tL_page.url = tL_webPage.url;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    String str4 = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                    if (str4.length() <= 65536) {
                        String i10 = i(str4, tL_page.blocks);
                        if (!TextUtils.isEmpty(i10)) {
                            tL_webPage.flags |= 4;
                            tL_webPage.title = i10;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return null;
    }

    public static TL_iv.RichText g(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i10, g(arrayList.get(i10)));
            }
            return textconcat;
        } else if (richText instanceof z90) {
            z90 z90Var = (z90) richText;
            TL_iv.textStrike g10 = g(z90Var.text);
            int i11 = z90Var.f29621a;
            if ((i11 & 4) != 0) {
                TL_iv.textFixed textfixed = new TL_iv.textFixed();
                textfixed.text = g10;
                g10 = textfixed;
            }
            if ((i11 & 32) != 0) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = g10;
                g10 = textstrike;
            }
            if ((i11 & 16) != 0) {
                TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
                textunderline.text = g10;
                g10 = textunderline;
            }
            if ((i11 & 64) != 0) {
                TL_iv.textMarked textmarked = new TL_iv.textMarked();
                textmarked.text = g10;
                g10 = textmarked;
            }
            if ((i11 & 128) != 0) {
                TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                textsubscript.text = g10;
                g10 = textsubscript;
            }
            if ((i11 & 256) != 0) {
                TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                textsuperscript.text = g10;
                g10 = textsuperscript;
            }
            if ((i11 & 2) != 0) {
                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                textitalic.text = g10;
                g10 = textitalic;
            }
            if ((i11 & 1) != 0) {
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = g10;
                return textbold;
            }
            return g10;
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = g(richText2);
            }
            return richText;
        }
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText h(org.telegram.tgnet.tl.TL_iv.RichText r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.h(org.telegram.tgnet.tl.TL_iv$RichText):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static java.lang.String i(java.lang.String r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.i(java.lang.String, java.util.ArrayList):java.lang.String");
    }

    public static TL_iv.textPlain j(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int k(TL_iv.RichText richText) {
        int i10 = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        } else if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                i10 += k(richText2);
            }
            return i10;
        } else {
            return k(richText.text);
        }
    }

    public static String l(TL_iv.RichText richText) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                return ((TL_iv.textPlain) richText).text;
            }
            if (richText instanceof TL_iv.textConcat) {
                StringBuilder sb2 = new StringBuilder();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i10);
                    i10++;
                    sb2.append(l(richText2));
                }
                return sb2.toString();
            }
            return l(richText.text);
        }
        return "";
    }
}
