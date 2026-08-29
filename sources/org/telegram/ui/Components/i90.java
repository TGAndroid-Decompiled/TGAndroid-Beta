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
public final class i90 extends i7.t {
    public final ArrayList f29354a;
    public TL_iv.RichText f29355b;
    public final ArrayList f29356c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final kc.d f29357e = new kc.d(new bb.a(11), new f7.v(11));
    public final ArrayDeque f29358f;

    public i90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f29354a = arrayList;
        this.f29358f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof g90) {
                list2.add(((g90) obj).f28846a);
            } else if (obj instanceof h90) {
                C((h90) obj, list2, i10);
            }
        }
    }

    public static int B(le.p pVar) {
        le.s sVar;
        String str;
        le.p pVar2 = (le.p) pVar.f15206c;
        if (pVar2 instanceof le.r) {
            le.p pVar3 = (le.p) pVar2.f15206c;
            if ((pVar3 instanceof le.s) && (str = (sVar = (le.s) pVar3).f15210g) != null) {
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
                        sVar.f15210g = str.substring(i10);
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

    public static void C(h90 h90Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j10;
        kc.a aVar = h90Var.f29144a;
        ArrayList arrayList = h90Var.f29146c;
        String str2 = aVar.f13614a;
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
                    Map map = aVar.f13616c;
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
                        boolean z11 = obj instanceof h90;
                        if (z11) {
                            h90 h90Var2 = (h90) obj;
                            if ("summary".equalsIgnoreCase(h90Var2.f29144a.f13614a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(h90Var2.f29146c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j10 = new TL_iv.textEmpty();
                                } else {
                                    j10 = m90.j(trim);
                                }
                                pageblockdetails.title = j10;
                            }
                        }
                        if (obj instanceof g90) {
                            arrayList2.add(((g90) obj).f28846a);
                        } else if (z11) {
                            C((h90) obj, arrayList2, i10 + 1);
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
            if (obj instanceof g90) {
                TL_iv.PageBlock pageBlock = ((g90) obj).f28846a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(m90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(m90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(m90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof h90) {
                w(((h90) obj).f29146c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kc.a aVar = (kc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f13613f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(le.b bVar) {
        for (TL_iv.RichText richText : m90.b(m90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(le.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (le.p pVar = (le.p) cVar.f15206c; pVar != null; pVar = (le.p) pVar.f15208f) {
            if (pVar instanceof le.o) {
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
                tL_pageListItemText.text = m90.d(m90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(le.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = m90.d(m90.j(hVar.f15196k));
        String str = hVar.f15195j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(le.i iVar) {
        TL_iv.RichText d = m90.d(m90.a(iVar, null));
        if (this.f29356c.isEmpty()) {
            this.f29355b = d;
        }
        switch (iVar.f15197g) {
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
    public final void h(le.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f15198g;
        if (str == null) {
            return;
        }
        try {
            this.f29357e.b(sb2, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb2.append(str);
        }
    }

    @Override
    public final void j(le.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = m90.d(m90.j(lVar.f15201g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(le.n nVar) {
        boolean z10;
        if (nVar instanceof ge.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (le.p pVar = (le.p) ((ge.a) nVar).f15206c; pVar != null; pVar = (le.p) pVar.f15208f) {
                boolean z11 = pVar instanceof ge.e;
                if (z11 || (pVar instanceof ge.b)) {
                    for (le.p pVar2 = (le.p) pVar.f15206c; pVar2 != null; pVar2 = (le.p) pVar2.f15208f) {
                        if (pVar2 instanceof ge.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (le.p pVar3 = (le.p) ((ge.f) pVar2).f15206c; pVar3 != null; pVar3 = (le.p) pVar3.f15208f) {
                                if (pVar3 instanceof ge.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    ge.d dVar = (ge.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f7273g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    ge.c cVar = dVar.h;
                                    if (cVar == ge.c.f7271b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == ge.c.f7272c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = m90.d(m90.a(dVar, null));
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
        } else if (nVar instanceof jc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = m90.c(((jc.a) nVar).f11437g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(le.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i90.m(le.q):void");
    }

    @Override
    public final void n(le.r rVar) {
        for (TL_iv.RichText richText : m90.b(m90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(le.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f29356c.add(new g90(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            kc.d dVar = this.f29357e;
            int length = sb2.length();
            kc.a aVar = dVar.d;
            while (true) {
                kc.a aVar2 = aVar.f13612e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f13613f;
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
            dVar.d = new kc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f29356c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            g90 g90Var = (g90) obj;
            hashMap.put(Integer.valueOf(g90Var.f28847b), g90Var);
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
            kc.a aVar3 = (kc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f13615b));
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
                    arrayList5.add((g90) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = m90.d(m90.j(trim));
                        arrayList5.add(new g90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new lh.e4(24));
        h90 h90Var = new h90(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(h90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            g90 g90Var2 = (g90) obj3;
            while (i12 < arrayList3.size() && ((kc.a) arrayList3.get(i12)).f13615b <= g90Var2.f28847b) {
                int i14 = i12 + 1;
                kc.a aVar4 = (kc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f13615b;
                if (i15 >= g90Var2.f28847b) {
                    while (arrayDeque.peek() != h90Var && ((h90) arrayDeque.peek()).f29145b <= i16) {
                        arrayDeque.pop();
                    }
                    h90 h90Var2 = new h90(aVar4, aVar4.d);
                    ((h90) arrayDeque.peek()).f29146c.add(h90Var2);
                    arrayDeque.push(h90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != h90Var && ((h90) arrayDeque.peek()).f29145b <= g90Var2.f28847b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = g90Var2.f28846a;
            ((h90) arrayDeque.peek()).f29146c.add(g90Var2);
        }
        A(0, h90Var.f29146c, this.f29354a);
    }
}
