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
public final class ka0 extends a8.bc {
    public final ArrayList f29917a;
    public TL_iv.RichText f29918b;
    public final ArrayList f29919c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final dd.d e = new dd.d(new qb.a(5), new sb.b(5));
    public final ArrayDeque f29920f;

    public ka0(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f29917a = arrayList;
        this.f29920f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof ia0) {
                list2.add(((ia0) obj).f29278a);
            } else if (obj instanceof ja0) {
                C((ja0) obj, list2, i10);
            }
        }
    }

    public static int B(ef.p pVar) {
        ef.s sVar;
        String str;
        ef.p pVar2 = (ef.p) pVar.f9937c;
        if (pVar2 instanceof ef.r) {
            ef.p pVar3 = (ef.p) pVar2.f9937c;
            if ((pVar3 instanceof ef.s) && (str = (sVar = (ef.s) pVar3).f9940g) != null) {
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
                        sVar.f9940g = str.substring(i10);
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

    public static void C(ja0 ja0Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j10;
        dd.a aVar = ja0Var.f29599a;
        ArrayList arrayList = ja0Var.f29601c;
        String str2 = aVar.f8329a;
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
                    Map map = aVar.f8331c;
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
                        boolean z11 = obj instanceof ja0;
                        if (z11) {
                            ja0 ja0Var2 = (ja0) obj;
                            if ("summary".equalsIgnoreCase(ja0Var2.f29599a.f8329a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(ja0Var2.f29601c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j10 = new TL_iv.textEmpty();
                                } else {
                                    j10 = oa0.j(trim);
                                }
                                pageblockdetails.title = j10;
                            }
                        }
                        if (obj instanceof ia0) {
                            arrayList2.add(((ia0) obj).f29278a);
                        } else if (z11) {
                            C((ja0) obj, arrayList2, i10 + 1);
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
            if (obj instanceof ia0) {
                TL_iv.PageBlock pageBlock = ((ia0) obj).f29278a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(oa0.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(oa0.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(oa0.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof ja0) {
                w(((ja0) obj).f29601c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dd.a aVar = (dd.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f8328f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(ef.b bVar) {
        for (TL_iv.RichText richText : oa0.b(oa0.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(ef.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ef.p pVar = (ef.p) cVar.f9937c; pVar != null; pVar = (ef.p) pVar.f9938f) {
            if (pVar instanceof ef.o) {
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
                tL_pageListItemText.text = oa0.d(oa0.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(ef.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = oa0.d(oa0.j(hVar.f9927k));
        String str = hVar.f9926j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(ef.i iVar) {
        TL_iv.RichText d = oa0.d(oa0.a(iVar, null));
        if (this.f29919c.isEmpty()) {
            this.f29918b = d;
        }
        switch (iVar.f9928g) {
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
    public final void h(ef.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f9929g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb2, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb2.append(str);
        }
    }

    @Override
    public final void j(ef.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = oa0.d(oa0.j(lVar.f9932g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(ef.n nVar) {
        boolean z10;
        if (nVar instanceof ze.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (ef.p pVar = (ef.p) ((ze.a) nVar).f9937c; pVar != null; pVar = (ef.p) pVar.f9938f) {
                boolean z11 = pVar instanceof ze.e;
                if (z11 || (pVar instanceof ze.b)) {
                    for (ef.p pVar2 = (ef.p) pVar.f9937c; pVar2 != null; pVar2 = (ef.p) pVar2.f9938f) {
                        if (pVar2 instanceof ze.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (ef.p pVar3 = (ef.p) ((ze.f) pVar2).f9937c; pVar3 != null; pVar3 = (ef.p) pVar3.f9938f) {
                                if (pVar3 instanceof ze.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    ze.d dVar = (ze.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f52914g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    ze.c cVar = dVar.h;
                                    if (cVar == ze.c.f52912b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == ze.c.f52913c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = oa0.d(oa0.a(dVar, null));
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
        } else if (nVar instanceof cd.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = oa0.c(((cd.a) nVar).f6195g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(ef.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ka0.m(ef.q):void");
    }

    @Override
    public final void n(ef.r rVar) {
        for (TL_iv.RichText richText : oa0.b(oa0.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(ef.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f29919c.add(new ia0(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            dd.d dVar = this.e;
            int length = sb2.length();
            dd.a aVar = dVar.d;
            while (true) {
                dd.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f8328f;
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
            dVar.d = new dd.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f29919c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            ia0 ia0Var = (ia0) obj;
            hashMap.put(Integer.valueOf(ia0Var.f29279b), ia0Var);
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
            dd.a aVar3 = (dd.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f8330b));
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
                    arrayList5.add((ia0) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = oa0.d(oa0.j(trim));
                        arrayList5.add(new ia0(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(17));
        ja0 ja0Var = new ja0(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ja0Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            ia0 ia0Var2 = (ia0) obj3;
            while (i12 < arrayList3.size() && ((dd.a) arrayList3.get(i12)).f8330b <= ia0Var2.f29279b) {
                int i14 = i12 + 1;
                dd.a aVar4 = (dd.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f8330b;
                if (i15 >= ia0Var2.f29279b) {
                    while (arrayDeque.peek() != ja0Var && ((ja0) arrayDeque.peek()).f29600b <= i16) {
                        arrayDeque.pop();
                    }
                    ja0 ja0Var2 = new ja0(aVar4, aVar4.d);
                    ((ja0) arrayDeque.peek()).f29601c.add(ja0Var2);
                    arrayDeque.push(ja0Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != ja0Var && ((ja0) arrayDeque.peek()).f29600b <= ia0Var2.f29279b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = ia0Var2.f29278a;
            ((ja0) arrayDeque.peek()).f29601c.add(ia0Var2);
        }
        A(0, ja0Var.f29601c, this.f29917a);
    }
}
