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
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_iv;
public final class oa0 extends v7.e5 {
    public final ArrayList f29465a;
    public TL_iv.RichText f29466b;
    public final ArrayList f29467c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final bd.d f29468e = new bd.d(new ob.a(3), new qb.b(3));
    public final ArrayDeque f29469f;

    public oa0(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f29465a = arrayList;
        this.f29469f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof ma0) {
                list2.add(((ma0) obj).f28826a);
            } else if (obj instanceof na0) {
                C((na0) obj, list2, i10);
            }
        }
    }

    public static int B(cf.p pVar) {
        cf.s sVar;
        String str;
        cf.p pVar2 = (cf.p) pVar.f4652c;
        if (pVar2 instanceof cf.r) {
            cf.p pVar3 = (cf.p) pVar2.f4652c;
            if ((pVar3 instanceof cf.s) && (str = (sVar = (cf.s) pVar3).f4656g) != null) {
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
                        sVar.f4656g = str.substring(i10);
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

    public static void C(na0 na0Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j3;
        bd.a aVar = na0Var.f29137a;
        ArrayList arrayList = na0Var.f29139c;
        String str2 = aVar.f3866a;
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
                    Map map = aVar.f3868c;
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
                        boolean z11 = obj instanceof na0;
                        if (z11) {
                            na0 na0Var2 = (na0) obj;
                            if ("summary".equalsIgnoreCase(na0Var2.f29137a.f3866a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(na0Var2.f29139c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j3 = new TL_iv.textEmpty();
                                } else {
                                    j3 = sa0.j(trim);
                                }
                                pageblockdetails.title = j3;
                            }
                        }
                        if (obj instanceof ma0) {
                            arrayList2.add(((ma0) obj).f28826a);
                        } else if (z11) {
                            C((na0) obj, arrayList2, i10 + 1);
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
            if (obj instanceof ma0) {
                TL_iv.PageBlock pageBlock = ((ma0) obj).f28826a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(sa0.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(sa0.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(sa0.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof na0) {
                w(((na0) obj).f29139c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bd.a aVar = (bd.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f3865f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(cf.b bVar) {
        for (TL_iv.RichText richText : sa0.b(sa0.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(cf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (cf.p pVar = (cf.p) cVar.f4652c; pVar != null; pVar = (cf.p) pVar.f4654f) {
            if (pVar instanceof cf.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    boolean z10 = true;
                    tL_pageListItemText.checkbox = true;
                    if (B != 1) {
                        z10 = false;
                    }
                    tL_pageListItemText.checked = z10;
                }
                tL_pageListItemText.text = sa0.d(sa0.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(cf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = sa0.d(sa0.j(hVar.f4642k));
        String str = hVar.f4641j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(cf.i iVar) {
        TL_iv.RichText d = sa0.d(sa0.a(iVar, null));
        if (this.f29467c.isEmpty()) {
            this.f29466b = d;
        }
        switch (iVar.f4643g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = d;
                x(pageblockheading1);
                return;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = d;
                x(pageblockheading2);
                return;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = d;
                x(pageblockheading3);
                return;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = d;
                x(pageblockheading4);
                return;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = d;
                x(pageblockheading5);
                return;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = d;
                x(pageblockheading6);
                return;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = d;
                x(pageblockheader);
                return;
        }
    }

    @Override
    public final void h(cf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f4644g;
        if (str == null) {
            return;
        }
        try {
            this.f29468e.b(sb2, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb2.append(str);
        }
    }

    @Override
    public final void j(cf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = sa0.d(sa0.j(lVar.f4647g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(cf.n nVar) {
        boolean z10;
        if (nVar instanceof xe.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (cf.p pVar = (cf.p) ((xe.a) nVar).f4652c; pVar != null; pVar = (cf.p) pVar.f4654f) {
                boolean z11 = pVar instanceof xe.e;
                if (z11 || (pVar instanceof xe.b)) {
                    for (cf.p pVar2 = (cf.p) pVar.f4652c; pVar2 != null; pVar2 = (cf.p) pVar2.f4654f) {
                        if (pVar2 instanceof xe.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (cf.p pVar3 = (cf.p) ((xe.f) pVar2).f4652c; pVar3 != null; pVar3 = (cf.p) pVar3.f4654f) {
                                if (pVar3 instanceof xe.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    xe.d dVar = (xe.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f51242g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    xe.c cVar = dVar.h;
                                    if (cVar == xe.c.f51240b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == xe.c.f51241c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = sa0.d(sa0.a(dVar, null));
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
        } else if (nVar instanceof ad.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = sa0.c(((ad.a) nVar).f415g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(cf.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa0.m(cf.q):void");
    }

    @Override
    public final void n(cf.r rVar) {
        for (TL_iv.RichText richText : sa0.b(sa0.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(cf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f29467c.add(new ma0(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            bd.d dVar = this.f29468e;
            int length = sb2.length();
            bd.a aVar = dVar.d;
            while (true) {
                bd.a aVar2 = aVar.f3864e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f3865f;
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
            dVar.d = new bd.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f29467c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            ma0 ma0Var = (ma0) obj;
            hashMap.put(Integer.valueOf(ma0Var.f28827b), ma0Var);
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
            bd.a aVar3 = (bd.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f3867b));
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
                    arrayList5.add((ma0) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = sa0.d(sa0.j(trim));
                        arrayList5.add(new ma0(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.ff(10));
        na0 na0Var = new na0(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(na0Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            ma0 ma0Var2 = (ma0) obj3;
            while (i12 < arrayList3.size() && ((bd.a) arrayList3.get(i12)).f3867b <= ma0Var2.f28827b) {
                int i14 = i12 + 1;
                bd.a aVar4 = (bd.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f3867b;
                if (i15 >= ma0Var2.f28827b) {
                    while (arrayDeque.peek() != na0Var && ((na0) arrayDeque.peek()).f29138b <= i16) {
                        arrayDeque.pop();
                    }
                    na0 na0Var2 = new na0(aVar4, aVar4.d);
                    ((na0) arrayDeque.peek()).f29139c.add(na0Var2);
                    arrayDeque.push(na0Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != na0Var && ((na0) arrayDeque.peek()).f29138b <= ma0Var2.f28827b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = ma0Var2.f28826a;
            ((na0) arrayDeque.peek()).f29139c.add(ma0Var2);
        }
        A(0, na0Var.f29139c, this.f29465a);
    }
}
