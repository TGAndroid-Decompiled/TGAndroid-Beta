package org.telegram.messenger;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class zv {
    public final ArrayList f19766a;
    public final int f19767b;

    public zv(int i10, ArrayList arrayList) {
        this.f19766a = arrayList;
        this.f19767b = i10;
    }

    public static void a(TL_iv.RichText richText, ArrayList arrayList) {
        if (richText != null && g(richText) > 0) {
            arrayList.add(richText);
        }
    }

    public static void b(TL_iv.RichText richText, StringBuilder sb2, ArrayList arrayList) {
        TLRPC.MessageEntity messageEntity;
        int length;
        TL_iv.RichText richText2;
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str2 = ((TL_iv.textPlain) richText).text;
            if (str2 != null) {
                sb2.append(str2);
            }
        } else if (richText instanceof TL_iv.textMath) {
            String str3 = ((TL_iv.textMath) richText).source;
            if (str3 != null) {
                sb2.append(str3);
            }
        } else {
            int length2 = sb2.length();
            if (richText instanceof TL_iv.textCustomEmoji) {
                TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                if (TextUtils.isEmpty(textcustomemoji.alt)) {
                    str = "😀";
                } else {
                    str = textcustomemoji.alt;
                }
                sb2.append(str);
                if (arrayList != null) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = textcustomemoji.document_id;
                    int length3 = sb2.length();
                    if (length3 > length2) {
                        tL_messageEntityCustomEmoji.offset = length2;
                        tL_messageEntityCustomEmoji.length = length3 - length2;
                        arrayList.add(tL_messageEntityCustomEmoji);
                    }
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText3 = arrayList2.get(i10);
                    i10++;
                    b(richText3, sb2, arrayList);
                }
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                if (bi.s6.j(textdiff.text)) {
                    richText2 = textdiff.old_text;
                } else {
                    richText2 = textdiff.text;
                }
                b(richText2, sb2, arrayList);
            } else {
                b(richText.text, sb2, arrayList);
                if (arrayList != null) {
                    if (richText instanceof TL_iv.textBold) {
                        messageEntity = new TLRPC.TL_messageEntityBold();
                    } else if (richText instanceof TL_iv.textItalic) {
                        messageEntity = new TLRPC.TL_messageEntityItalic();
                    } else if (richText instanceof TL_iv.textUnderline) {
                        messageEntity = new TLRPC.TL_messageEntityUnderline();
                    } else if (richText instanceof TL_iv.textStrike) {
                        messageEntity = new TLRPC.TL_messageEntityStrike();
                    } else if (richText instanceof TL_iv.textFixed) {
                        messageEntity = new TLRPC.TL_messageEntityCode();
                    } else if (richText instanceof TL_iv.textSpoiler) {
                        messageEntity = new TLRPC.TL_messageEntitySpoiler();
                    } else if (richText instanceof TL_iv.textUrl) {
                        TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.url = ((TL_iv.textUrl) richText).url;
                        messageEntity = tL_messageEntityTextUrl;
                    } else {
                        messageEntity = null;
                    }
                    if (messageEntity != null && (length = sb2.length()) > length2) {
                        messageEntity.offset = length2;
                        messageEntity.length = length - length2;
                        arrayList.add(messageEntity);
                    }
                }
            }
        }
    }

    public static boolean c(jj jjVar) {
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        vv vvVar;
        if (jjVar != null && (message = jjVar.f16337k) != null && (richMessage = message.rich_message) != null && (vvVar = jjVar.f16385w2) != null && vvVar.f18988c == richMessage) {
            return true;
        }
        return false;
    }

    public static void d(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockThinking) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        String str = ((TL_iv.pageBlockMath) pageBlock).source;
                        if (!TextUtils.isEmpty(str)) {
                            TL_iv.textMath textmath = new TL_iv.textMath();
                            textmath.source = str;
                            arrayList2.add(textmath);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        a(pageBlock.text, arrayList2);
                        a(((TL_iv.pageBlockBlockquote) pageBlock).caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        d(pageblockblockquoteblocks.blocks, arrayList2);
                        a(pageblockblockquoteblocks.caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        a(pageBlock.text, arrayList2);
                        a(((TL_iv.pageBlockPullquote) pageBlock).caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
                        int size2 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            TL_iv.PageListItem pageListItem = arrayList3.get(i11);
                            i11++;
                            TL_iv.PageListItem pageListItem2 = pageListItem;
                            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                                a(((TL_iv.TL_pageListItemText) pageListItem2).text, arrayList2);
                            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                                d(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                        int size3 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList4.get(i12);
                            i12++;
                            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                                a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, arrayList2);
                            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                d(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                        a(pageblocktable.title, arrayList2);
                        ArrayList<TL_iv.pageTableRow> arrayList5 = pageblocktable.rows;
                        int size4 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            TL_iv.pageTableRow pagetablerow = arrayList5.get(i13);
                            i13++;
                            ArrayList<TL_iv.pageTableCell> arrayList6 = pagetablerow.cells;
                            int size5 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                TL_iv.pageTableCell pagetablecell = arrayList6.get(i14);
                                i14++;
                                a(pagetablecell.text, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        a(pageblockdetails.title, arrayList2);
                        d(pageblockdetails.blocks, arrayList2);
                    } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockMap)) {
                        if (pageBlock instanceof TL_iv.pageBlockCollage) {
                            d(((TL_iv.pageBlockCollage) pageBlock).items, arrayList2);
                            TL_iv.PageCaption pageCaption = pageBlock.caption;
                            if (pageCaption != null) {
                                a(pageCaption.text, arrayList2);
                                a(pageCaption.credit, arrayList2);
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            d(((TL_iv.pageBlockSlideshow) pageBlock).items, arrayList2);
                            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                            if (pageCaption2 != null) {
                                a(pageCaption2.text, arrayList2);
                                a(pageCaption2.credit, arrayList2);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                        if (pageCaption3 != null) {
                            a(pageCaption3.text, arrayList2);
                            a(pageCaption3.credit, arrayList2);
                        }
                    }
                } else {
                    a(pageBlock.text, arrayList2);
                }
            }
        }
    }

    public static ArrayList e(TL_iv.RichMessage richMessage) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            d(richMessage.blocks, arrayList);
        }
        return arrayList;
    }

    public static int[] f(jj jjVar, String str, int i10) {
        ArrayList arrayList;
        int[] iArr = null;
        if (jjVar == null || jjVar.f16385w2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        vv vvVar = jjVar.f16385w2;
        TL_iv.RichMessage richMessage = vvVar.f18988c;
        ArrayList arrayList2 = vvVar.f18996n;
        ArrayList e = e(richMessage);
        if (e.isEmpty()) {
            return null;
        }
        int[] iArr2 = new int[e.size()];
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (int i12 = 0; i12 < e.size(); i12++) {
            if (i12 > 0) {
                sb2.append('\n');
            }
            iArr2[i12] = sb2.length();
            b((TL_iv.RichText) e.get(i12), sb2, null);
        }
        int Y = jj.Y(i10, sb2.toString(), str);
        if (Y < 0) {
            return null;
        }
        int length = str.length() + Y;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            CharSequence l4 = l((org.telegram.ui.Cells.u9) arrayList2.get(i13));
            if (l4 instanceof Spanned) {
                Spanned spanned = (Spanned) l4;
                int intValue = ((Integer) vvVar.f18997o.get(i13)).intValue();
                nu[] nuVarArr = (nu[]) spanned.getSpans(i11, l4.length(), nu.class);
                int length2 = nuVarArr.length;
                int i14 = i11;
                while (i14 < length2) {
                    nu nuVar = nuVarArr[i14];
                    int[] iArr3 = iArr;
                    if (identityHashMap.containsKey(nuVar.f17175a)) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        identityHashMap.put(nuVar.f17175a, new int[]{spanned.getSpanStart(nuVar) + intValue, spanned.getSpanEnd(nuVar) + intValue, nuVar.f17176b});
                    }
                    i14++;
                    iArr = iArr3;
                    arrayList2 = arrayList;
                }
            }
            i13++;
            iArr = iArr;
            arrayList2 = arrayList2;
            i11 = 0;
        }
        int[] iArr4 = iArr;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < e.size(); i17++) {
            int g10 = g((TL_iv.RichText) e.get(i17)) + iArr2[i17];
            if (i15 < 0 && Y < g10 && identityHashMap.containsKey(e.get(i17))) {
                i15 = i17;
            }
            if (iArr2[i17] < length && identityHashMap.containsKey(e.get(i17))) {
                i16 = i17;
            }
        }
        if (i15 >= 0 && i16 >= 0 && i15 <= i16) {
            int[] iArr5 = (int[]) identityHashMap.get(e.get(i15));
            int[] iArr6 = (int[]) identityHashMap.get(e.get(i16));
            int i18 = i(vvVar, (TL_iv.RichText) e.get(i15), iArr5[2], Math.max(0, Y - iArr2[i15]), false);
            int i19 = i(vvVar, (TL_iv.RichText) e.get(i16), iArr6[2], Math.min(g((TL_iv.RichText) e.get(i16)), length - iArr2[i16]), true);
            int i20 = iArr5[0];
            int min = Math.min(i18, iArr5[1] - i20) + i20;
            int i21 = iArr6[0];
            int min2 = Math.min(i19, iArr6[1] - i21) + i21;
            if (min2 <= min) {
                return iArr4;
            }
            return new int[]{min, min2};
        }
        return iArr4;
    }

    public static int g(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        b(richText, sb2, null);
        return sb2.toString().length();
    }

    public static String h(ArrayList arrayList, ArrayList arrayList2) {
        StringBuilder sb2 = new StringBuilder();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    sb2.append('\n');
                }
                b((TL_iv.RichText) arrayList.get(i10), sb2, arrayList2);
            }
        }
        return sb2.toString();
    }

    public static int i(vv vvVar, TL_iv.RichText richText, int i10, int i11, boolean z10) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        SpannableStringBuilder o10 = vvVar.o(richText, i10, identityHashMap);
        int j10 = j(richText, identityHashMap, i11, z10, new int[]{0});
        if (j10 < 0) {
            return o10.length();
        }
        return j10;
    }

    public static int j(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i10, boolean z10, int[] iArr) {
        TL_iv.RichText richText2;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return -1;
        }
        int[] iArr2 = (int[]) identityHashMap.get(richText);
        int i11 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            while (i11 < size) {
                TL_iv.RichText richText3 = arrayList.get(i11);
                i11++;
                int j10 = j(richText3, identityHashMap, i10, z10, iArr);
                if (j10 >= 0) {
                    return j10;
                }
            }
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (bi.s6.j(textdiff.text)) {
                richText2 = textdiff.old_text;
            } else {
                richText2 = textdiff.text;
            }
            return j(richText2, identityHashMap, i10, z10, iArr);
        } else {
            boolean z11 = richText instanceof TL_iv.textPlain;
            if (!z11 && !(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textButton)) {
                return j(richText.text, identityHashMap, i10, z10, iArr);
            }
            int g10 = g(richText);
            int i12 = iArr[0];
            int i13 = i10 - i12;
            iArr[0] = i12 + g10;
            if (iArr2 != null && (!z10 ? i13 < g10 : i13 <= g10)) {
                if (z11) {
                    int i14 = iArr2[1];
                    int i15 = iArr2[0];
                    if (i14 - i15 == g10) {
                        return Math.max(0, i13) + i15;
                    }
                }
                if (z10 && i13 > 0) {
                    return iArr2[1];
                }
                return iArr2[0];
            }
        }
        return -1;
    }

    public static zv k(int i10, int i11, jj jjVar) {
        int intValue;
        int intValue2;
        yv a2;
        boolean z10;
        int i12;
        TL_iv.RichText b10;
        int i13;
        if (c(jjVar)) {
            vv vvVar = jjVar.f16385w2;
            int i14 = vp.r1(jjVar.I1).f18871p4;
            ArrayList e = e(vvVar.f18988c);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            for (int i15 = 0; i15 < e.size(); i15++) {
                identityHashMap.put((TL_iv.RichText) e.get(i15), Integer.valueOf(i15));
            }
            boolean z11 = true;
            e2.j0 n10 = n(vvVar, Math.min(i10, i11), true, identityHashMap);
            e2.j0 n11 = n(vvVar, Math.max(i10, i11), false, identityHashMap);
            if (n10 != null) {
                int i16 = n10.f6152a;
                if (n11 != null && (intValue = ((Integer) identityHashMap.get(((nu) n10.f6154c).f17175a)).intValue()) <= (intValue2 = ((Integer) identityHashMap.get(((nu) n11.f6154c).f17175a)).intValue()) && (intValue != intValue2 || i16 < n11.f6152a)) {
                    yv a10 = yv.a(vvVar, n10);
                    if (intValue == intValue2) {
                        a2 = a10;
                    } else {
                        a2 = yv.a(vvVar, n11);
                    }
                    if (a10 != null && a2 != null) {
                        xv xvVar = new xv(vvVar, e, intValue, n10.f6152a, a10, intValue2, n11.f6152a, a2);
                        if ((intValue2 - intValue) + 1 > 32) {
                            int i17 = intValue + 31;
                            if (i17 != intValue2) {
                                xvVar.h = null;
                            }
                            xvVar.f19297f = i17;
                            xvVar.f19298g = Integer.MAX_VALUE;
                        }
                        int i18 = 0;
                        loop1: while (i18 < 8 && xvVar.f19297f >= intValue) {
                            int i19 = intValue;
                            int i20 = 0;
                            while (i19 <= xvVar.f19297f) {
                                TL_iv.RichText a11 = xvVar.a(i19);
                                StringBuilder sb2 = new StringBuilder();
                                b(a11, sb2, null);
                                String sb3 = sb2.toString();
                                int codePointCount = sb3.codePointCount(0, sb3.length()) + i20;
                                if (codePointCount > i14) {
                                    int i21 = i14 - i20;
                                    int i22 = xvVar.d;
                                    if (i21 <= 0) {
                                        i12 = -1;
                                        z10 = z11;
                                    } else {
                                        int offsetByCodePoints = sb3.offsetByCodePoints(0, i21);
                                        z10 = z11;
                                        yv b11 = xvVar.b(i19);
                                        if (i19 == intValue && i22 > 0 && (b10 = xvVar.e.b(0, i22)) != null) {
                                            offsetByCodePoints += g(b10);
                                        }
                                        i12 = i(xvVar.f19294a, (TL_iv.RichText) xvVar.f19295b.get(i19), b11.d, offsetByCodePoints, false);
                                    }
                                    if (i21 > 0) {
                                        if (i19 != xvVar.f19296c) {
                                            i22 = 0;
                                        }
                                        if (i12 > i22 && (i19 != (i13 = xvVar.f19297f) || i12 < xvVar.f19298g)) {
                                            if (i19 != i13) {
                                                xvVar.h = null;
                                            }
                                            xvVar.f19297f = i19;
                                            xvVar.f19298g = i12;
                                            i18++;
                                            z11 = z10;
                                        }
                                    }
                                    int i23 = i19 - 1;
                                    if (i23 != xvVar.f19297f) {
                                        xvVar.h = null;
                                    }
                                    xvVar.f19297f = i23;
                                    xvVar.f19298g = Integer.MAX_VALUE;
                                    i18++;
                                    z11 = z10;
                                } else {
                                    i19++;
                                    i20 = codePointCount;
                                }
                            }
                        }
                        if (xvVar.f19297f >= intValue) {
                            ArrayList arrayList = new ArrayList();
                            for (int i24 = intValue; i24 <= xvVar.f19297f; i24++) {
                                TL_iv.RichText o10 = o(xvVar.a(i24));
                                if (o10 != null && g(o10) > 0) {
                                    arrayList.add(o10);
                                }
                            }
                            if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                                int i25 = 0;
                                for (int i26 = 0; i26 < intValue; i26++) {
                                    i25 += g((TL_iv.RichText) e.get(i26)) + 1;
                                }
                                TL_iv.RichText b12 = a10.b(0, i16);
                                if (b12 != null) {
                                    i25 += g(b12);
                                }
                                return new zv(i25, arrayList);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static CharSequence l(org.telegram.ui.Cells.u9 u9Var) {
        Layout a2;
        if (u9Var == null) {
            a2 = null;
        } else {
            a2 = u9Var.a();
        }
        if (a2 == null) {
            return null;
        }
        return a2.getText();
    }

    public static boolean m(TL_iv.RichText richText) {
        if (richText == null) {
            return false;
        }
        if (richText instanceof TL_iv.textButton) {
            return true;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                if (m(richText2)) {
                    return true;
                }
            }
            return false;
        }
        return m(richText.text);
    }

    public static e2.j0 n(org.telegram.messenger.vv r16, int r17, final boolean r18, java.util.IdentityHashMap r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zv.n(org.telegram.messenger.vv, int, boolean, java.util.IdentityHashMap):e2.j0");
    }

    public static TL_iv.RichText o(TL_iv.RichText richText) {
        TL_iv.RichText richText2;
        if (richText != null && m(richText)) {
            if (richText instanceof TL_iv.textButton) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = vv.x(richText.text);
                return textplain;
            } else if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i10);
                    i10++;
                    textconcat.texts.add(o(richText3));
                }
                return textconcat;
            } else {
                try {
                    richText2 = (TL_iv.RichText) TLObject.deepCopy(richText, new e9(23));
                } catch (Exception e) {
                    f8.g(e, true);
                    richText2 = null;
                }
                if (richText2 == null) {
                    return null;
                }
                richText2.text = o(richText.text);
                return richText2;
            }
        }
        return richText;
    }
}
