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
public final class j80 extends c8.b1 {
    public final ArrayList f34923a;
    public TL_iv.RichText f34924b;
    public final ArrayList f34925c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final ad.d f34926e = new ad.d(new nb.a(2), new pb.b(2));
    public final ArrayDeque f34927f;

    public j80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f34923a = arrayList;
        this.f34927f = arrayDeque;
    }

    public static void A(int i7, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof h80) {
                list2.add(((h80) obj).f34238a);
            } else if (obj instanceof i80) {
                C((i80) obj, list2, i7);
            }
        }
    }

    public static int B(kf.p pVar) {
        kf.s sVar;
        String str;
        kf.p pVar2 = (kf.p) pVar.f17279c;
        if (pVar2 instanceof kf.r) {
            kf.p pVar3 = (kf.p) pVar2.f17279c;
            if ((pVar3 instanceof kf.s) && (str = (sVar = (kf.s) pVar3).f17283g) != null) {
                int i7 = 3;
                if (str.length() >= 3) {
                    int i10 = 0;
                    if (str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt = str.charAt(1);
                        if (charAt != ' ') {
                            if (charAt == 'x' || charAt == 'X') {
                                i10 = 1;
                            } else {
                                return -1;
                            }
                        }
                        if (str.length() > 3 && str.charAt(3) == ' ') {
                            i7 = 4;
                        }
                        sVar.f17283g = str.substring(i7);
                        return i10;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static void C(i80 i80Var, List list, int i7) {
        String lowerCase;
        String str;
        boolean z9;
        TL_iv.RichText n10;
        ad.a aVar = i80Var.f34557a;
        ArrayList arrayList = i80Var.f34559c;
        String str2 = aVar.f1035a;
        if (str2 == null) {
            lowerCase = "";
        } else {
            lowerCase = str2.toLowerCase();
        }
        if (i7 >= 64) {
            A(i7 + 1, arrayList, list);
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
                    Map map = aVar.f1037c;
                    int i10 = 0;
                    if (map != null && map.containsKey("open")) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    pageblockdetails.open = z9;
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        boolean z10 = obj instanceof i80;
                        if (z10) {
                            i80 i80Var2 = (i80) obj;
                            if ("summary".equalsIgnoreCase(i80Var2.f34557a.f1035a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(i80Var2.f34559c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    n10 = new TL_iv.textEmpty();
                                } else {
                                    n10 = n80.n(trim);
                                }
                                pageblockdetails.title = n10;
                            }
                        }
                        if (obj instanceof h80) {
                            arrayList2.add(((h80) obj).f34238a);
                        } else if (z10) {
                            C((i80) obj, arrayList2, i7 + 1);
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
        A(i7 + 1, arrayList, list);
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof h80) {
                TL_iv.PageBlock pageBlock = ((h80) obj).f34238a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(n80.p(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(n80.p(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(n80.p(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof i80) {
                w(((i80) obj).f34559c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f1034f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(kf.b bVar) {
        for (TL_iv.RichText richText : n80.b(n80.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(kf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (kf.p pVar = (kf.p) cVar.f17279c; pVar != null; pVar = (kf.p) pVar.f17281f) {
            if (pVar instanceof kf.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    boolean z9 = true;
                    tL_pageListItemText.checkbox = true;
                    if (B != 1) {
                        z9 = false;
                    }
                    tL_pageListItemText.checked = z9;
                }
                tL_pageListItemText.text = n80.e(n80.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(kf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = n80.e(n80.n(hVar.f17269k));
        String str = hVar.f17268j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(kf.i iVar) {
        TL_iv.RichText e10 = n80.e(n80.a(iVar, null));
        if (this.f34925c.isEmpty()) {
            this.f34924b = e10;
        }
        switch (iVar.f17270g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = e10;
                x(pageblockheading1);
                return;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = e10;
                x(pageblockheading2);
                return;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = e10;
                x(pageblockheading3);
                return;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = e10;
                x(pageblockheading4);
                return;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = e10;
                x(pageblockheading5);
                return;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = e10;
                x(pageblockheading6);
                return;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = e10;
                x(pageblockheader);
                return;
        }
    }

    @Override
    public final void h(kf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f17271g;
        if (str == null) {
            return;
        }
        try {
            this.f34926e.b(sb2, str);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            sb2.append(str);
        }
    }

    @Override
    public final void j(kf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = n80.e(n80.n(lVar.f17274g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(kf.n nVar) {
        boolean z9;
        if (nVar instanceof ef.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (kf.p pVar = (kf.p) ((ef.a) nVar).f17279c; pVar != null; pVar = (kf.p) pVar.f17281f) {
                boolean z10 = pVar instanceof ef.e;
                if (z10 || (pVar instanceof ef.b)) {
                    for (kf.p pVar2 = (kf.p) pVar.f17279c; pVar2 != null; pVar2 = (kf.p) pVar2.f17281f) {
                        if (pVar2 instanceof ef.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (kf.p pVar3 = (kf.p) ((ef.f) pVar2).f17279c; pVar3 != null; pVar3 = (kf.p) pVar3.f17281f) {
                                if (pVar3 instanceof ef.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    ef.d dVar = (ef.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z10 && !dVar.f10804g) {
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    pagetablecell.header = z9;
                                    ef.c cVar = dVar.h;
                                    if (cVar == ef.c.f10802b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == ef.c.f10803c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = n80.e(n80.a(dVar, null));
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
        } else if (nVar instanceof zc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = n80.c(((zc.a) nVar).f59908g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(kf.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j80.m(kf.q):void");
    }

    @Override
    public final void n(kf.r rVar) {
        for (TL_iv.RichText richText : n80.b(n80.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(kf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f34925c.add(new h80(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            ad.d dVar = this.f34926e;
            int length = sb2.length();
            ad.a aVar = dVar.d;
            while (true) {
                ad.a aVar2 = aVar.f1033e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f1034f;
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
            dVar.d = new ad.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f34925c;
        int size = arrayList4.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList4.get(i7);
            i7++;
            h80 h80Var = (h80) obj;
            hashMap.put(Integer.valueOf(h80Var.f34239b), h80Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb2.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            ad.a aVar3 = (ad.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f1036b));
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
                    arrayList5.add((h80) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = n80.e(n80.n(trim));
                        arrayList5.add(new h80(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.oe(10));
        i80 i80Var = new i80(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(i80Var);
        int size3 = arrayList5.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            h80 h80Var2 = (h80) obj3;
            while (i11 < arrayList3.size() && ((ad.a) arrayList3.get(i11)).f1036b <= h80Var2.f34239b) {
                int i13 = i11 + 1;
                ad.a aVar4 = (ad.a) arrayList3.get(i11);
                int i14 = aVar4.d;
                int i15 = aVar4.f1036b;
                if (i14 >= h80Var2.f34239b) {
                    while (arrayDeque.peek() != i80Var && ((i80) arrayDeque.peek()).f34558b <= i15) {
                        arrayDeque.pop();
                    }
                    i80 i80Var2 = new i80(aVar4, aVar4.d);
                    ((i80) arrayDeque.peek()).f34559c.add(i80Var2);
                    arrayDeque.push(i80Var2);
                }
                i11 = i13;
            }
            while (arrayDeque.peek() != i80Var && ((i80) arrayDeque.peek()).f34558b <= h80Var2.f34239b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = h80Var2.f34238a;
            ((i80) arrayDeque.peek()).f34559c.add(h80Var2);
        }
        A(0, i80Var.f34559c, this.f34923a);
    }
}
