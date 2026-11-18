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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class b90 {
    public static final Pattern f33611a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern f33612b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern f33613c = Pattern.compile("^(\\d+)[.)]\\s");

    public static TL_iv.RichText a(kf.p pVar, TL_iv.PageBlock pageBlock) {
        y80 y80Var = new y80(pageBlock);
        pVar.a(y80Var);
        return k(l(y80.x(y80Var.f42410c)));
    }

    public static List b(TL_iv.RichText richText) {
        int i7;
        if (richText == null) {
            return Collections.singletonList(n(""));
        }
        if (o(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String p10 = p(richText);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < p10.length()) {
            if (p10.length() - i10 <= 8192) {
                arrayList.add(n(p10.substring(i10)));
                return arrayList;
            }
            int i11 = i10 + 8192;
            int i12 = i10 + 8191;
            int lastIndexOf = p10.lastIndexOf(10, i12);
            if (lastIndexOf <= i10) {
                lastIndexOf = p10.lastIndexOf(32, i12);
            }
            if (lastIndexOf <= i10) {
                i7 = 0;
            } else {
                i7 = 1;
                i11 = lastIndexOf;
            }
            arrayList.add(n(p10.substring(i10, i11)));
            i10 = i11 + i7;
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
        oi.p a10 = oi.p.a(trim, org.telegram.messenger.g0.L(20.0f), true);
        if (a10 != null) {
            textmath.f28630w = a10.f22227b;
            textmath.h = a10.f22228c;
            textmath.depth = a10.d;
            textmath.bitmap = a10.f22226a;
        }
        return textmath;
    }

    public static java.lang.String d(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.d(java.lang.String):java.lang.String");
    }

    public static TL_iv.RichText e(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (o(richText) <= 8192) {
            return richText;
        }
        String p10 = p(richText);
        return n(p10.substring(0, Math.min(p10.length(), 8192)));
    }

    public static void f(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f1031f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            f(arrayList, unmodifiableList);
        }
    }

    public static org.telegram.tgnet.TLRPC.TL_webPage g(org.telegram.messenger.fj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.g(org.telegram.messenger.fj):org.telegram.tgnet.TLRPC$TL_webPage");
    }

    public static int h(int i7, CharSequence charSequence) {
        char charAt;
        if (i7 >= charSequence.length() || (charAt = charSequence.charAt(i7)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i10 = i7 + 3;
        if (i10 < charSequence.length() && charSequence.charAt(i7 + 1) == charAt && charSequence.charAt(i7 + 2) == charAt && charSequence.charAt(i10) == ' ') {
            return 3;
        }
        if (charAt != '+') {
            return 2;
        }
        return 1;
    }

    public static File i(org.telegram.messenger.fj fjVar) {
        File file;
        TLRPC.Message message = fjVar.f23965k;
        int i7 = fjVar.K1;
        if (!TextUtils.isEmpty(message.attachPath)) {
            file = new File(fjVar.f23965k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.w7.G(i7);
            file = org.telegram.messenger.w7.M(fjVar.f23965k, false, true);
        }
        if (file == null || !file.exists()) {
            org.telegram.messenger.w7.G(i7);
            file = org.telegram.messenger.w7.M(fjVar.f23965k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean j(org.telegram.messenger.fj fjVar) {
        String Q0 = fjVar.Q0();
        if (!"diff".equalsIgnoreCase(Q0) && !"patch".equalsIgnoreCase(Q0)) {
            String t12 = fjVar.t1();
            if (t12 != null) {
                String lowerCase = t12.toLowerCase();
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
            for (int i7 = 0; i7 < textconcat.texts.size(); i7++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i7, k(arrayList.get(i7)));
            }
            return textconcat;
        } else if (richText instanceof a90) {
            a90 a90Var = (a90) richText;
            TL_iv.textStrike k10 = k(a90Var.text);
            int i10 = a90Var.f33300a;
            if ((i10 & 4) != 0) {
                TL_iv.textFixed textfixed = new TL_iv.textFixed();
                textfixed.text = k10;
                k10 = textfixed;
            }
            if ((i10 & 32) != 0) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = k10;
                k10 = textstrike;
            }
            if ((i10 & 16) != 0) {
                TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
                textunderline.text = k10;
                k10 = textunderline;
            }
            if ((i10 & 64) != 0) {
                TL_iv.textMarked textmarked = new TL_iv.textMarked();
                textmarked.text = k10;
                k10 = textmarked;
            }
            if ((i10 & 128) != 0) {
                TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                textsubscript.text = k10;
                k10 = textsubscript;
            }
            if ((i10 & 256) != 0) {
                TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                textsuperscript.text = k10;
                k10 = textsuperscript;
            }
            if ((i10 & 2) != 0) {
                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                textitalic.text = k10;
                k10 = textitalic;
            }
            if ((i10 & 1) != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b90.l(org.telegram.tgnet.tl.TL_iv$RichText):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static String m(String str, ArrayList arrayList) {
        String[] split;
        TL_iv.RichText richText;
        String substring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split2 = str.split("\n", -1);
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < split2.length) {
            Matcher matcher = f33611a.matcher(split2[i7]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb3 = new StringBuilder(matcher.group(2));
                i7++;
                while (i7 < split2.length) {
                    String str2 = split2[i7];
                    if (!str2.startsWith("    ") && !str2.startsWith("\t")) {
                        if (!str2.trim().isEmpty()) {
                            break;
                        }
                        int i10 = i7 + 1;
                        int i11 = i10;
                        while (i11 < split2.length && split2[i11].trim().isEmpty()) {
                            i11++;
                        }
                        if (i11 >= split2.length || (!split2[i11].startsWith("    ") && !split2[i11].startsWith("\t"))) {
                            break;
                        }
                        sb3.append('\n');
                        i7 = i10;
                    } else {
                        sb3.append('\n');
                        if (str2.startsWith("\t")) {
                            substring = str2.substring(1);
                        } else {
                            substring = str2.substring(4);
                        }
                        sb3.append(substring);
                        i7++;
                    }
                }
                linkedHashMap.put(group, sb3.toString().trim());
            } else {
                sb2.append(split2[i7]);
                if (i7 < split2.length - 1) {
                    sb2.append('\n');
                }
                i7++;
            }
        }
        Matcher matcher2 = f33612b.matcher(sb2.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String group2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group2 + "\\]](#fn-" + group2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        List<bf.a> asList = Arrays.asList(new cf.b(0), new cf.b(1));
        Pattern pattern = ed.i.f10898j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new Object(), new Object(), new Object(), new ed.d(0), new Object(), new Object(), new Object(), new Object(), new ed.d(1)));
        arrayList3.addAll(Arrays.asList(new hf.a(0), new hf.a(1)));
        org.telegram.messenger.g0.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        a8.r7 r7Var = new a8.r7();
        if (asList != null) {
            for (bf.a aVar : asList) {
                if (aVar instanceof cf.b) {
                    switch (((cf.b) aVar).f5270a) {
                        case 0:
                            ((ArrayList) r7Var.f618c).add(new Object());
                            continue;
                        default:
                            ((ArrayList) r7Var.f617b).add(new ff.a(0));
                            continue;
                    }
                }
            }
            r7Var.f620f = new wf.b(15, arrayList2, arrayList3);
            ((ArrayList) r7Var.f617b).add(new ff.a(8));
            ?? obj = new Object();
            LinkedHashSet linkedHashSet = gf.g.f13544p;
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll((ArrayList) r7Var.f617b);
            for (Class cls : (LinkedHashSet) r7Var.f619e) {
                arrayList4.add(gf.g.f13545q.get(cls));
            }
            obj.f60621a = arrayList4;
            lf.b bVar = (wf.b) r7Var.f620f;
            if (bVar == null) {
                bVar = new nb.a(13);
            }
            obj.f60623c = bVar;
            obj.d = (ArrayList) r7Var.d;
            ArrayList arrayList5 = (ArrayList) r7Var.f618c;
            obj.f60622b = arrayList5;
            bVar.d(new wf.b(23, arrayList5, Collections.EMPTY_MAP));
            ArrayDeque arrayDeque = new ArrayDeque();
            String str3 = null;
            boolean z10 = false;
            for (String str4 : stringBuffer2.split("\n", -1)) {
                int i12 = 0;
                while (i12 < str4.length() && i12 < 3 && str4.charAt(i12) == ' ') {
                    i12++;
                }
                String substring2 = str4.substring(i12);
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
                            Matcher matcher3 = f33613c.matcher(str4);
                            if (matcher3.find()) {
                                arrayDeque.add(matcher3.group(1));
                            }
                        }
                    }
                    z10 = true;
                    str3 = str5;
                }
            }
            x80 x80Var = new x80(arrayList, arrayDeque);
            x80Var.v(obj.I(stringBuffer2));
            x80Var.y();
            if (!linkedHashMap.isEmpty()) {
                TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                String M0 = org.telegram.messenger.gd.M0(2131748999, null);
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = n(M0);
                pageblockdetails.title = textbold;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    ArrayList arrayList6 = new ArrayList();
                    x80 x80Var2 = new x80(arrayList6, new ArrayDeque());
                    x80Var2.v(obj.I((String) entry.getValue()));
                    x80Var2.y();
                    TL_iv.RichText textconcat = new TL_iv.textConcat();
                    int size = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj2 = arrayList6.get(i13);
                        i13++;
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
                    TL_iv.RichText e10 = e(textconcat);
                    TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                    textanchor.name = p5.c.k("fn-", str6);
                    textanchor.text = e10;
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    String v = p5.c.v(str6, ". ");
                    TL_iv.textBold textbold2 = new TL_iv.textBold();
                    textbold2.text = n(v);
                    TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                    TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                    for (int i14 = 0; i14 < 2; i14++) {
                        textconcat2.texts.add(richTextArr[i14]);
                    }
                    pageblockparagraph.text = textconcat2;
                    pageblockdetails.blocks.add(pageblockparagraph);
                }
                arrayList.add(pageblockdetails);
            }
            TL_iv.RichText richText2 = x80Var.f41949b;
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
        int i7 = 0;
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
                i7 += o(richText2);
            }
            return i7;
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
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i7);
                    i7++;
                    sb2.append(p(richText2));
                }
                return sb2.toString();
            }
            return p(richText.text);
        }
        return "";
    }
}
