package org.telegram.ui.Components;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.telegram.tgnet.tl.TL_iv;
public final class c90 extends w7.j8 {
    public final ArrayList f25065a;
    public TL_iv.RichText f25066b;
    public final ArrayList f25067c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final uc.d e = new uc.d(new jb.b(22), new kb.a(22));
    public final ArrayDeque f25068f;

    public c90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f25065a = arrayList;
        this.f25068f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof a90) {
                list2.add(((a90) obj).f24324a);
            } else if (obj instanceof b90) {
                C((b90) obj, list2, i10);
            }
        }
    }

    public static int B(df.c cVar) {
        ve.r rVar;
        String str;
        df.c cVar2 = (df.c) cVar.f5878c;
        if (cVar2 instanceof ve.q) {
            df.c cVar3 = (df.c) cVar2.f5878c;
            if ((cVar3 instanceof ve.r) && (str = (rVar = (ve.r) cVar3).f50825g) != null) {
                int i10 = 3;
                if (str.length() >= 3) {
                    int i11 = 0;
                    if (str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt = str.charAt(1);
                        if (charAt != ' ') {
                            if (charAt == 'x' || charAt == 'X') {
                                i11 = 1;
                            } else {
                                return -1;
                            }
                        }
                        if (str.length() > 3 && str.charAt(3) == ' ') {
                            i10 = 4;
                        }
                        rVar.f50825g = str.substring(i10);
                        return i11;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static void C(b90 b90Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText n10;
        uc.a aVar = b90Var.f24687a;
        ArrayList arrayList = b90Var.f24689c;
        String str2 = aVar.f50225a;
        if (str2 == null) {
            lowerCase = "";
        } else {
            lowerCase = str2.toLowerCase();
        }
        if (i10 >= 64) {
            A(i10 + 1, arrayList, list);
            return;
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                    return;
                }
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                break;
            case 112:
                str = "p";
                lowerCase.equals(str);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = aVar.f50227c;
                    int i11 = 0;
                    if (map != null && map.containsKey("open")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pageblockdetails.open = z10;
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        boolean z11 = obj instanceof b90;
                        if (z11) {
                            b90 b90Var2 = (b90) obj;
                            if ("summary".equalsIgnoreCase(b90Var2.f24687a.f50225a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(b90Var2.f24689c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    n10 = new TL_iv.textEmpty();
                                } else {
                                    n10 = g90.n(trim);
                                }
                                pageblockdetails.title = n10;
                            }
                        }
                        if (obj instanceof a90) {
                            arrayList2.add(((a90) obj).f24324a);
                        } else if (z11) {
                            C((b90) obj, arrayList2, i10 + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    return;
                }
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                break;
        }
        A(i10 + 1, arrayList, list);
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof a90) {
                TL_iv.PageBlock pageBlock = ((a90) obj).f24324a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(g90.p(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof b90) {
                w(((b90) obj).f24689c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
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
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(ve.b bVar) {
        for (TL_iv.RichText richText : g90.b(g90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(ve.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (df.c cVar2 = (df.c) cVar.f5878c; cVar2 != null; cVar2 = (df.c) cVar2.f5879f) {
            if (cVar2 instanceof ve.o) {
                int B = B(cVar2);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    boolean z10 = true;
                    tL_pageListItemText.checkbox = true;
                    if (B != 1) {
                        z10 = false;
                    }
                    tL_pageListItemText.checked = z10;
                }
                tL_pageListItemText.text = g90.e(g90.a(cVar2, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(ve.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = g90.e(g90.n(hVar.f50816k));
        String str = hVar.f50815j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(ve.i iVar) {
        TL_iv.RichText e = g90.e(g90.a(iVar, null));
        if (this.f25067c.isEmpty()) {
            this.f25066b = e;
        }
        switch (iVar.f50817g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = e;
                x(pageblockheading1);
                return;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = e;
                x(pageblockheading2);
                return;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = e;
                x(pageblockheading3);
                return;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = e;
                x(pageblockheading4);
                return;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = e;
                x(pageblockheading5);
                return;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = e;
                x(pageblockheading6);
                return;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = e;
                x(pageblockheader);
                return;
        }
    }

    @Override
    public final void h(ve.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f50818g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            sb2.append(str);
        }
    }

    @Override
    public final void j(ve.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = g90.e(g90.n(lVar.f50821g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(ve.n nVar) {
        boolean z10;
        if (nVar instanceof qe.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (df.c cVar = (df.c) ((qe.a) nVar).f5878c; cVar != null; cVar = (df.c) cVar.f5879f) {
                boolean z11 = cVar instanceof qe.e;
                if (z11 || (cVar instanceof qe.b)) {
                    for (df.c cVar2 = (df.c) cVar.f5878c; cVar2 != null; cVar2 = (df.c) cVar2.f5879f) {
                        if (cVar2 instanceof qe.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (df.c cVar3 = (df.c) ((qe.f) cVar2).f5878c; cVar3 != null; cVar3 = (df.c) cVar3.f5879f) {
                                if (cVar3 instanceof qe.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    qe.d dVar = (qe.d) cVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f45530g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    qe.c cVar4 = dVar.h;
                                    if (cVar4 == qe.c.f45528b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar4 == qe.c.f45529c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = g90.e(g90.a(dVar, null));
                                    pagetablecell.flags |= 128;
                                    arrayList2.add(pagetablecell);
                                }
                            }
                            arrayList.add(pagetablerow);
                        }
                    }
                }
            }
            x(pageblocktable);
        } else if (nVar instanceof tc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = g90.c(((tc.a) nVar).f48603g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(ve.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.m(ve.p):void");
    }

    @Override
    public final void n(ve.q qVar) {
        for (TL_iv.RichText richText : g90.b(g90.a(qVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(ve.s sVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f25067c.add(new a90(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            uc.d dVar = this.e;
            int length = sb2.length();
            uc.a aVar = dVar.d;
            while (true) {
                uc.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f50224f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            if (unmodifiableList.size() > 0) {
                arrayList.addAll(unmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            dVar.d = new uc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f25067c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            a90 a90Var = (a90) obj;
            hashMap.put(Integer.valueOf(a90Var.f24325b), a90Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb2.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            uc.a aVar3 = (uc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f50226b));
            treeSet.add(Integer.valueOf(aVar3.d));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = treeSet.iterator();
        Integer num2 = null;
        while (it.hasNext()) {
            Integer num3 = (Integer) it.next();
            if (num2 != null && num3.intValue() > num2.intValue()) {
                int intValue = num2.intValue();
                int intValue2 = num3.intValue();
                if (intValue2 - intValue == 1 && hashMap.containsKey(num2)) {
                    arrayList5.add((a90) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = g90.e(g90.n(trim));
                        arrayList5.add(new a90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.f6(12));
        b90 b90Var = new b90(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(b90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            a90 a90Var2 = (a90) obj3;
            while (i12 < arrayList3.size() && ((uc.a) arrayList3.get(i12)).f50226b <= a90Var2.f24325b) {
                int i14 = i12 + 1;
                uc.a aVar4 = (uc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f50226b;
                if (i15 >= a90Var2.f24325b) {
                    while (arrayDeque.peek() != b90Var && ((b90) arrayDeque.peek()).f24688b <= i16) {
                        arrayDeque.pop();
                    }
                    b90 b90Var2 = new b90(aVar4, aVar4.d);
                    ((b90) arrayDeque.peek()).f24689c.add(b90Var2);
                    arrayDeque.push(b90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != b90Var && ((b90) arrayDeque.peek()).f24688b <= a90Var2.f24325b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = a90Var2.f24324a;
            ((b90) arrayDeque.peek()).f24689c.add(a90Var2);
        }
        A(0, b90Var.f24689c, this.f25065a);
    }
}
