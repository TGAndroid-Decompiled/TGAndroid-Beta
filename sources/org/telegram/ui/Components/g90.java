package org.telegram.ui.Components;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.File;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class g90 {
    public static final Pattern f26367a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern f26368b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern f26369c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(df.c cVar, TL_iv.PageBlock pageBlock) {
        d90 d90Var = new d90(pageBlock);
        cVar.a(d90Var);
        return k(l(d90.x(d90Var.f25447c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i10;
        if (richText == null) {
            return Collections.singletonList(n(""));
        }
        if (o(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String p5 = p(richText);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < p5.length()) {
            if (p5.length() - i11 <= 8192) {
                arrayList.add(n(p5.substring(i11)));
                return arrayList;
            }
            int i12 = i11 + 8192;
            int i13 = i11 + 8191;
            int lastIndexOf = p5.lastIndexOf(10, i13);
            if (lastIndexOf <= i11) {
                lastIndexOf = p5.lastIndexOf(32, i13);
            }
            if (lastIndexOf <= i11) {
                i10 = 0;
            } else {
                i10 = 1;
                i12 = lastIndexOf;
            }
            arrayList.add(n(p5.substring(i11, i12)));
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
        bi.u a2 = bi.u.a(trim, org.telegram.messenger.i0.L(20.0f), true);
        if (a2 != null) {
            textmath.f20020w = a2.f3370b;
            textmath.h = a2.f3371c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.f3369a;
        }
        return textmath;
    }

    public static java.lang.String d(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.d(java.lang.String):java.lang.String");
    }

    public static TL_iv.RichText e(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (o(richText) <= 8192) {
            return richText;
        }
        String p5 = p(richText);
        return n(p5.substring(0, Math.min(p5.length(), 8192)));
    }

    public static void f(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uc.a aVar = (uc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f50224f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            f(arrayList, unmodifiableList);
        }
    }

    public static org.telegram.tgnet.TLRPC.TL_webPage g(org.telegram.messenger.kj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.g(org.telegram.messenger.kj):org.telegram.tgnet.TLRPC$TL_webPage");
    }

    public static int h(int i10, CharSequence charSequence) {
        char charAt;
        if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i11 = i10 + 3;
        if (i11 < charSequence.length() && charSequence.charAt(i10 + 1) == charAt && charSequence.charAt(i10 + 2) == charAt && charSequence.charAt(i11) == ' ') {
            return 3;
        }
        if (charAt != '+') {
            return 2;
        }
        return 1;
    }

    public static File i(org.telegram.messenger.kj kjVar) {
        File file;
        TLRPC.Message message = kjVar.f16690k;
        int i10 = kjVar.I1;
        if (!TextUtils.isEmpty(message.attachPath)) {
            file = new File(kjVar.f16690k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.b8.G(i10);
            file = org.telegram.messenger.b8.N(kjVar.f16690k, false, true);
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.b8.G(i10);
            file = org.telegram.messenger.b8.N(kjVar.f16690k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean j(org.telegram.messenger.kj kjVar) {
        String Q0 = kjVar.Q0();
        if (!"diff".equalsIgnoreCase(Q0) && !"patch".equalsIgnoreCase(Q0)) {
            String u12 = kjVar.u1();
            if (u12 != null) {
                String lowerCase = u12.toLowerCase();
                if (!lowerCase.startsWith("text/x-diff") && !lowerCase.startsWith("text/x-patch")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_iv.RichText k(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i10, k(arrayList.get(i10)));
            }
            return textconcat;
        } else if (richText instanceof f90) {
            f90 f90Var = (f90) richText;
            TL_iv.textStrike k10 = k(f90Var.text);
            int i11 = f90Var.f26118a;
            if ((i11 & 4) != 0) {
                TL_iv.textFixed textfixed = new TL_iv.textFixed();
                textfixed.text = k10;
                k10 = textfixed;
            }
            if ((i11 & 32) != 0) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = k10;
                k10 = textstrike;
            }
            if ((i11 & 16) != 0) {
                TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
                textunderline.text = k10;
                k10 = textunderline;
            }
            if ((i11 & 64) != 0) {
                TL_iv.textMarked textmarked = new TL_iv.textMarked();
                textmarked.text = k10;
                k10 = textmarked;
            }
            if ((i11 & 128) != 0) {
                TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                textsubscript.text = k10;
                k10 = textsubscript;
            }
            if ((i11 & 256) != 0) {
                TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                textsuperscript.text = k10;
                k10 = textsuperscript;
            }
            if ((i11 & 2) != 0) {
                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                textitalic.text = k10;
                k10 = textitalic;
            }
            if ((i11 & 1) != 0) {
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = k10;
                return textbold;
            }
            return k10;
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = k(richText2);
            }
            return richText;
        }
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText l(org.telegram.tgnet.tl.TL_iv.RichText r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.l(org.telegram.tgnet.tl.TL_iv$RichText):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static String m(String str, ArrayList arrayList) {
        String[] split;
        TL_iv.RichText richText;
        String substring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split2 = str.split("\n", -1);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < split2.length) {
            Matcher matcher = f26367a.matcher(split2[i10]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i10++;
                while (i10 < split2.length) {
                    String str2 = split2[i10];
                    if (!str2.startsWith("    ") && !str2.startsWith("\t")) {
                        if (!str2.trim().isEmpty()) {
                            break;
                        }
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 < split2.length && split2[i12].trim().isEmpty()) {
                            i12++;
                        }
                        if (i12 >= split2.length || (!split2[i12].startsWith("    ") && !split2[i12].startsWith("\t"))) {
                            break;
                        }
                        sb3.append('\n');
                        i10 = i11;
                    } else {
                        sb3.append('\n');
                        if (str2.startsWith("\t")) {
                            substring = str2.substring(1);
                        } else {
                            substring = str2.substring(4);
                        }
                        sb3.append(substring);
                        i10++;
                    }
                }
                linkedHashMap.put(group, sb3.toString().trim());
            } else {
                sb2.append(split2[i10]);
                if (i10 < split2.length - 1) {
                    sb2.append('\n');
                }
                i10++;
            }
        }
        Matcher matcher2 = f26368b.matcher(sb2.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String group2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group2 + "\\]](#fn-" + group2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        List<ne.a> asList = Arrays.asList(new oe.b(0), new oe.b(1));
        Pattern pattern = yc.i.f54398j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new Object(), new Object(), new Object(), new yc.d(0), new Object(), new Object(), new Object(), new Object(), new yc.d(1)));
        arrayList3.addAll(Arrays.asList(new te.a(0), new te.a(1)));
        org.telegram.messenger.i0.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        ?? obj = new Object();
        obj.f2777a = new ArrayList();
        obj.f2778b = new ArrayList();
        obj.f2779c = new ArrayList();
        obj.d = se.d.f48206p;
        if (asList != null) {
            for (ne.a aVar : asList) {
                if (aVar instanceof oe.b) {
                    switch (((oe.b) aVar).f14151a) {
                        case 0:
                            ((ArrayList) obj.f2778b).add(new Object());
                            continue;
                        default:
                            ((ArrayList) obj.f2777a).add(new re.a(0));
                            continue;
                    }
                }
            }
            obj.e = new u9.b(9, arrayList2, arrayList3);
            ((ArrayList) obj.f2777a).add(new re.a(8));
            ji.f fVar = new ji.f((bh.d) obj);
            ArrayDeque arrayDeque = new ArrayDeque();
            String str3 = null;
            boolean z10 = false;
            for (String str4 : stringBuffer2.split("\n", -1)) {
                int i13 = 0;
                while (i13 < str4.length() && i13 < 3 && str4.charAt(i13) == ' ') {
                    i13++;
                }
                String substring2 = str4.substring(i13);
                if (z10) {
                    if (substring2.startsWith(str3)) {
                        str3 = null;
                        z10 = false;
                    }
                } else {
                    String str5 = "```";
                    if (!substring2.startsWith("```")) {
                        str5 = "~~~";
                        if (!substring2.startsWith("~~~")) {
                            Matcher matcher3 = f26369c.matcher(str4);
                            if (matcher3.find()) {
                                arrayDeque.add(matcher3.group(1));
                            }
                        }
                    }
                    z10 = true;
                    str3 = str5;
                }
            }
            c90 c90Var = new c90(arrayList, arrayDeque);
            c90Var.v(fVar.p(stringBuffer2));
            c90Var.y();
            if (!linkedHashMap.isEmpty()) {
                TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                String L0 = org.telegram.messenger.dd.L0(2131749200, null);
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = n(L0);
                pageblockdetails.title = textbold;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    ArrayList arrayList4 = new ArrayList();
                    c90 c90Var2 = new c90(arrayList4, new ArrayDeque());
                    c90Var2.v(fVar.p((String) entry.getValue()));
                    c90Var2.y();
                    TL_iv.RichText textconcat = new TL_iv.textConcat();
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj2 = arrayList4.get(i14);
                        i14++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            richText = ((TL_iv.pageBlockParagraph) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                            richText = ((TL_iv.pageBlockHeader) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                            richText = ((TL_iv.pageBlockSubheader) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                            richText = ((TL_iv.pageBlockTitle) pageBlock).text;
                        } else {
                            richText = null;
                        }
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            if (!textconcat.texts.isEmpty()) {
                                textconcat.texts.add(n("\n\n"));
                            }
                            textconcat.texts.add(richText);
                        }
                    }
                    if (textconcat.texts.isEmpty()) {
                        textconcat = new TL_iv.textEmpty();
                    } else if (textconcat.texts.size() == 1) {
                        textconcat = textconcat.texts.get(0);
                    }
                    TL_iv.RichText e = e(textconcat);
                    TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                    textanchor.name = sc.e.h("fn-", str6);
                    textanchor.text = e;
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    String A = sc.e.A(str6, ". ");
                    TL_iv.textBold textbold2 = new TL_iv.textBold();
                    textbold2.text = n(A);
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
            TL_iv.RichText richText2 = c90Var.f25066b;
            if (richText2 == null) {
                return null;
            }
            return p(richText2);
        }
        throw new NullPointerException("extensions must not be null");
    }

    public static TL_iv.textPlain n(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int o(TL_iv.RichText richText) {
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
                i10 += o(richText2);
            }
            return i10;
        } else {
            return o(richText.text);
        }
    }

    public static String p(TL_iv.RichText richText) {
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
                    sb2.append(p(richText2));
                }
                return sb2.toString();
            }
            return p(richText.text);
        }
        return "";
    }
}
