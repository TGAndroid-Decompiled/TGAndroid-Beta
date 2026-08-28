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
public abstract class z80 {
    public static final Pattern f35244a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern f35245b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern f35246c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(ie.p pVar, TL_iv.PageBlock pageBlock) {
        w80 w80Var = new w80(pageBlock);
        pVar.a(w80Var);
        return g(h(w80.x(w80Var.f34151c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i9;
        if (richText == null) {
            return Collections.singletonList(j(""));
        }
        if (k(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String l10 = l(richText);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < l10.length()) {
            if (l10.length() - i10 <= 8192) {
                arrayList.add(j(l10.substring(i10)));
                return arrayList;
            }
            int i11 = i10 + 8192;
            int i12 = i10 + 8191;
            int lastIndexOf = l10.lastIndexOf(10, i12);
            if (lastIndexOf <= i10) {
                lastIndexOf = l10.lastIndexOf(32, i12);
            }
            if (lastIndexOf <= i10) {
                i9 = 0;
            } else {
                i11 = lastIndexOf;
                i9 = 1;
            }
            arrayList.add(j(l10.substring(i10, i11)));
            i10 = i11 + i9;
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
        qh.q a2 = qh.q.a(trim, AndroidUtilities.dp(20.0f), true);
        if (a2 != null) {
            textmath.f22605w = a2.f46619b;
            textmath.h = a2.f46620c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.f46618a;
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
        String l10 = l(richText);
        return j(l10.substring(0, Math.min(l10.length(), 8192)));
    }

    public static void e(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ic.a aVar = (ic.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f11090f;
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
                        String i9 = i(str4, tL_page.blocks);
                        if (!TextUtils.isEmpty(i9)) {
                            tL_webPage.flags |= 4;
                            tL_webPage.title = i9;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            for (int i9 = 0; i9 < textconcat.texts.size(); i9++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i9, g(arrayList.get(i9)));
            }
            return textconcat;
        } else if (richText instanceof y80) {
            y80 y80Var = (y80) richText;
            TL_iv.textStrike g10 = g(y80Var.text);
            int i10 = y80Var.f34896a;
            if ((i10 & 4) != 0) {
                TL_iv.textFixed textfixed = new TL_iv.textFixed();
                textfixed.text = g10;
                g10 = textfixed;
            }
            if ((i10 & 32) != 0) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = g10;
                g10 = textstrike;
            }
            if ((i10 & 16) != 0) {
                TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
                textunderline.text = g10;
                g10 = textunderline;
            }
            if ((i10 & 64) != 0) {
                TL_iv.textMarked textmarked = new TL_iv.textMarked();
                textmarked.text = g10;
                g10 = textmarked;
            }
            if ((i10 & 128) != 0) {
                TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                textsubscript.text = g10;
                g10 = textsubscript;
            }
            if ((i10 & 256) != 0) {
                TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                textsuperscript.text = g10;
                g10 = textsuperscript;
            }
            if ((i10 & 2) != 0) {
                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                textitalic.text = g10;
                g10 = textitalic;
            }
            if ((i10 & 1) != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z80.h(org.telegram.tgnet.tl.TL_iv$RichText):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static java.lang.String i(java.lang.String r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z80.i(java.lang.String, java.util.ArrayList):java.lang.String");
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
        int i9 = 0;
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
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                i9 += k(richText2);
            }
            return i9;
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
                int i9 = 0;
                while (i9 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i9);
                    i9++;
                    sb2.append(l(richText2));
                }
                return sb2.toString();
            }
            return l(richText.text);
        }
        return "";
    }
}
