package org.telegram.ui.Components;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public abstract class d90 {

    public static final Pattern f27680a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");

    public static final Pattern f27681b = Pattern.compile("\\[\\^([^\\]]+)\\]");

    public static final Pattern f27682c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(je.p pVar, TL_iv.PageBlock pageBlock) {
        a90 a90Var = new a90(pageBlock);
        pVar.a(a90Var);
        return g(h(a90.x(a90Var.f26687c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i10;
        if (richText == null) {
            return Collections.singletonList(j(""));
        }
        if (k(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String strL = l(richText);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < strL.length()) {
            if (strL.length() - i11 <= 8192) {
                arrayList.add(j(strL.substring(i11)));
                return arrayList;
            }
            int i12 = i11 + 8192;
            int i13 = i11 + 8191;
            int iLastIndexOf = strL.lastIndexOf(10, i13);
            if (iLastIndexOf <= i11) {
                iLastIndexOf = strL.lastIndexOf(32, i13);
            }
            if (iLastIndexOf <= i11) {
                i10 = 0;
            } else {
                i12 = iLastIndexOf;
                i10 = 1;
            }
            arrayList.add(j(strL.substring(i11, i12)));
            i11 = i12 + i10;
        }
        return arrayList;
    }

    public static TL_iv.textMath c(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String strTrim = str == null ? "" : str.trim();
        textmath.source = strTrim;
        textmath.tried = true;
        rh.q qVarA = rh.q.a(strTrim, AndroidUtilities.dp(20.0f), true);
        if (qVarA != null) {
            textmath.f22605w = qVarA.f47382b;
            textmath.h = qVarA.f47383c;
            textmath.depth = qVarA.d;
            textmath.bitmap = qVarA.f47381a;
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
        String strL = l(richText);
        return j(strL.substring(0, Math.min(strL.length(), 8192)));
    }

    public static void e(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc.a aVar = (jc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f12892f;
            e(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    public static TLRPC.TL_webPage f(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject.messageOwner != null && (document = messageObject.getDocument()) != null) {
            File file = !TextUtils.isEmpty(messageObject.messageOwner.attachPath) ? new File(messageObject.messageOwner.attachPath) : null;
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
            }
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
            }
            if (file != null && file.exists() && file.length() <= 65536) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                String str = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str == null ? "" : str;
                tL_webPage.display_url = str != null ? str : "";
                if (!TextUtils.isEmpty(str)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = file;
                tL_page.url = tL_webPage.url;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        fileInputStream.read(bArr);
                        String str2 = new String(bArr, StandardCharsets.UTF_8);
                        fileInputStream.close();
                        if (str2.length() <= 65536) {
                            String strI = i(str2, tL_page.blocks);
                            if (!TextUtils.isEmpty(strI)) {
                                tL_webPage.flags |= 4;
                                tL_webPage.title = strI;
                            }
                            tL_webPage.flags |= 1024;
                            tL_webPage.cached_page = tL_page;
                            return tL_webPage;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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
        }
        if (!(richText instanceof c90)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = g(richText2);
            }
            return richText;
        }
        c90 c90Var = (c90) richText;
        TL_iv.RichText richTextG = g(c90Var.text);
        int i11 = c90Var.f27383a;
        if ((i11 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = richTextG;
            richTextG = textfixed;
        }
        if ((i11 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = richTextG;
            richTextG = textstrike;
        }
        if ((i11 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = richTextG;
            richTextG = textunderline;
        }
        if ((i11 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = richTextG;
            richTextG = textmarked;
        }
        if ((i11 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richTextG;
            richTextG = textsubscript;
        }
        if ((i11 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richTextG;
            richTextG = textsuperscript;
        }
        if ((i11 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = richTextG;
            richTextG = textitalic;
        }
        if ((i11 & 1) == 0) {
            return richTextG;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = richTextG;
        return textbold;
    }

    public static TL_iv.RichText h(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i10;
        jc.a aVar;
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i11 = 0; i11 < textconcat2.texts.size(); i11++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i11, h(arrayList.get(i11)));
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            jc.d dVar = new jc.d(new za.b(10), new ab.a(11));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i12);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                    int length = sb2.length();
                    try {
                        dVar.b(sb2, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        sb2.append(textplain.text);
                    }
                    int length2 = sb2.length();
                    if (length2 > length) {
                        arrayList2.add(j(sb2.substring(length, length2)));
                        arrayList3.add(new int[]{length, length2});
                    }
                } else {
                    String strL = l(richText2);
                    int length3 = sb2.length();
                    sb2.append(strL);
                    int length4 = sb2.length();
                    arrayList2.add(richText2);
                    arrayList3.add(new int[]{length3, length4});
                }
                i12 = i13;
            }
            ArrayList arrayList5 = new ArrayList();
            int i14 = -1;
            try {
                try {
                    int length5 = sb2.length();
                    ArrayList arrayList6 = dVar.f12900c;
                    if (arrayList6.size() > 0) {
                        if (length5 > -1) {
                            int size2 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj = arrayList6.get(i15);
                                i15++;
                                jc.b bVar = (jc.b) obj;
                                if (bVar.d <= -1) {
                                    bVar.d = length5;
                                }
                            }
                        }
                        arrayList5.addAll(DesugarCollections.unmodifiableList(arrayList6));
                        arrayList6.clear();
                    } else {
                        arrayList5.addAll(Collections.EMPTY_LIST);
                    }
                    while (true) {
                        jc.a aVar2 = aVar.f12891e;
                        if (aVar2 == null) {
                            break;
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                int length6 = sb2.length();
                aVar = dVar.d;
                if (length6 > -1) {
                    aVar.b(length6);
                }
                ArrayList arrayList7 = aVar.f12892f;
                List listUnmodifiableList = arrayList7 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList7);
                if (listUnmodifiableList.size() > 0) {
                    e(arrayList5, listUnmodifiableList);
                } else {
                    e(arrayList5, Collections.EMPTY_LIST);
                }
                dVar.d = new jc.a("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            Collections.sort(arrayList5, Comparator$CC.comparingInt(new gf.d(16)));
            int size3 = arrayList5.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj2 = arrayList5.get(i16);
                i16++;
                jc.c cVar = (jc.c) obj2;
                int i17 = cVar.d;
                if (i17 > i14) {
                    int i18 = cVar.f12894b;
                    int i19 = -1;
                    int i20 = -1;
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        int i22 = ((int[]) arrayList3.get(i21))[0];
                        int i23 = ((int[]) arrayList3.get(i21))[1];
                        if (i22 >= i18 && i23 <= i17) {
                            if (i19 == i14) {
                                i19 = i21;
                            }
                            i20 = i21;
                        }
                    }
                    if (i19 != i14) {
                        if (i19 == i20) {
                            textconcat = (TL_iv.RichText) arrayList2.get(i19);
                        } else {
                            textconcat = new TL_iv.textConcat();
                            for (int i24 = i19; i24 <= i20; i24++) {
                                textconcat.texts.add((TL_iv.RichText) arrayList2.get(i24));
                            }
                        }
                        String str2 = cVar.f12893a;
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase();
                            lowerCase.getClass();
                            i10 = 4;
                            switch (lowerCase) {
                                case "strike":
                                case "s":
                                case "del":
                                    i10 = 32;
                                    break;
                                case "strong":
                                case "b":
                                    i10 = 1;
                                    break;
                                case "i":
                                case "em":
                                    i10 = 2;
                                    break;
                                case "u":
                                case "ins":
                                    i10 = 16;
                                    break;
                                case "tt":
                                case "code":
                                    break;
                                case "sub":
                                    i10 = 128;
                                    break;
                                case "sup":
                                    i10 = 256;
                                    break;
                                case "mark":
                                    i10 = 64;
                                    break;
                                default:
                                    i10 = 0;
                                    break;
                            }
                        } else {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            if (textconcat instanceof c90) {
                                ((c90) textconcat).f27383a |= i10;
                            } else {
                                c90 c90Var = new c90();
                                c90Var.f27383a = i10;
                                c90Var.text = textconcat;
                                textconcat = c90Var;
                            }
                        }
                        while (i20 >= i19) {
                            arrayList2.remove(i20);
                            arrayList3.remove(i20);
                            i20--;
                        }
                        arrayList2.add(i19, textconcat);
                        arrayList3.add(i19, new int[]{i18, i17});
                        i14 = -1;
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return new TL_iv.textEmpty();
            }
            if (arrayList2.size() == 1) {
                TL_iv.RichText richText3 = (TL_iv.RichText) arrayList2.get(0);
                if ((richText3 instanceof TL_iv.textPlain) || (richText3 instanceof TL_iv.textEmpty)) {
                    return richText3;
                }
            }
            TL_iv.textConcat textconcat3 = new TL_iv.textConcat();
            textconcat3.texts.addAll(arrayList2);
            return textconcat3;
        }
        TL_iv.RichText richText4 = richText;
        while (true) {
            TL_iv.RichText richText5 = richText4.text;
            if (richText5 == null) {
                return richText;
            }
            if (richText5 instanceof TL_iv.textConcat) {
                richText4.text = h(richText5);
                return richText;
            }
            richText4 = richText5;
        }
    }

    public static String i(String str, ArrayList arrayList) {
        TL_iv.RichText richText;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArrSplit = str.split("\n", -1);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < strArrSplit.length) {
            Matcher matcher = f27680a.matcher(strArrSplit[i10]);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i10++;
                while (i10 < strArrSplit.length) {
                    String str3 = strArrSplit[i10];
                    if (str3.startsWith("    ") || str3.startsWith("\t")) {
                        sb3.append('\n');
                        sb3.append(str3.startsWith("\t") ? str3.substring(1) : str3.substring(4));
                        i10++;
                    } else {
                        if (!str3.trim().isEmpty()) {
                            break;
                        }
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 < strArrSplit.length && strArrSplit[i12].trim().isEmpty()) {
                            i12++;
                        }
                        if (i12 >= strArrSplit.length || !(strArrSplit[i12].startsWith("    ") || strArrSplit[i12].startsWith("\t"))) {
                            break;
                        }
                        sb3.append('\n');
                        i10 = i11;
                    }
                }
                linkedHashMap.put(strGroup, sb3.toString().trim());
            } else {
                sb2.append(strArrSplit[i10]);
                if (i10 < strArrSplit.length - 1) {
                    sb2.append('\n');
                }
                i10++;
            }
        }
        Matcher matcher2 = f27681b.matcher(sb2.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String strGroup2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + strGroup2 + "\\]](#fn-" + strGroup2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String string = stringBuffer.toString();
        List<be.a> listAsList = Arrays.asList(new ce.b(0), new ce.b(1));
        Pattern pattern = nc.i.f18458j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new nc.a(), new nc.b(), new nc.c(), new nc.d(0), new nc.e(), new nc.f(), new nc.g(), new nc.j(), new nc.d(1)));
        arrayList3.addAll(Arrays.asList(new he.a(0), new he.a(1)));
        AndroidUtilities.dp(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new ic.c());
        arrayList2.add(new b90());
        af.h hVar = new af.h();
        hVar.f274a = new ArrayList();
        hVar.f275b = new ArrayList();
        hVar.f276c = new ArrayList();
        hVar.d = ge.e.f6860p;
        if (listAsList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (be.a aVar : listAsList) {
            if (aVar instanceof ce.b) {
                switch (((ce.b) aVar).f2571a) {
                    case 0:
                        ((ArrayList) hVar.f275b).add(new de.a());
                        break;
                    default:
                        ((ArrayList) hVar.f274a).add(new fe.a(0));
                        break;
                }
            }
        }
        hVar.f277e = new g5.b(26, arrayList2, arrayList3);
        ((ArrayList) hVar.f274a).add(new fe.a(8));
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(hVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        boolean z10 = false;
        String str4 = null;
        for (String str5 : string.split("\n", -1)) {
            int i13 = 0;
            while (true) {
                if (i13 >= str5.length() || i13 >= 3) {
                    str2 = null;
                } else {
                    str2 = null;
                    if (str5.charAt(i13) == ' ') {
                        i13++;
                    }
                }
            }
            String strSubstring = str5.substring(i13);
            if (!z10) {
                String str6 = "```";
                if (strSubstring.startsWith("```")) {
                    str4 = str6;
                    z10 = true;
                } else {
                    str6 = "~~~";
                    if (strSubstring.startsWith("~~~")) {
                        str4 = str6;
                        z10 = true;
                    } else {
                        Matcher matcher3 = f27682c.matcher(str5);
                        if (matcher3.find()) {
                            arrayDeque.add(matcher3.group(1));
                        }
                    }
                }
            } else if (strSubstring.startsWith(str4)) {
                str4 = str2;
                z10 = false;
            }
        }
        z80 z80Var = new z80(arrayList, arrayDeque);
        z80Var.v(tVar.H(string));
        z80Var.y();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String string2 = LocaleController.getString(R.string.InstantViewReferences);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = j(string2);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                z80 z80Var2 = new z80(arrayList4, new ArrayDeque());
                z80Var2.v(tVar.H(str8));
                z80Var2.y();
                TL_iv.RichText textconcat = new TL_iv.textConcat();
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        richText = ((TL_iv.pageBlockParagraph) pageBlock).text;
                    } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                        richText = ((TL_iv.pageBlockHeader) pageBlock).text;
                    } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                        richText = ((TL_iv.pageBlockSubheader) pageBlock).text;
                    } else {
                        richText = pageBlock instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock).text : null;
                    }
                    if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                        if (!textconcat.texts.isEmpty()) {
                            textconcat.texts.add(j("\n\n"));
                        }
                        textconcat.texts.add(richText);
                    }
                }
                if (textconcat.texts.isEmpty()) {
                    textconcat = new TL_iv.textEmpty();
                } else if (textconcat.texts.size() == 1) {
                    textconcat = textconcat.texts.get(0);
                }
                TL_iv.RichText richTextD = d(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = s3.c.e("fn-", str7);
                textanchor.text = richTextD;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String strL = s3.c.l(str7, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = j(strL);
                TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                for (int i15 = 0; i15 < 2; i15++) {
                    textconcat2.texts.add(richTextArr[i15]);
                }
                pageblockparagraph.text = textconcat2;
                pageblockdetails.blocks.add(pageblockparagraph);
            }
            arrayList.add(pageblockdetails);
        }
        TL_iv.RichText richText2 = z80Var.f35198b;
        if (richText2 != null) {
            return l(richText2);
        }
        return null;
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
        int iK = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return k(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            iK += k(richText2);
        }
        return iK;
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return l(richText.text);
        }
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
}
