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
public final class o90 extends k7.g0 {
    public final ArrayList f27524a;
    public TL_iv.RichText f27525b;
    public final ArrayList f27526c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final mc.d e = new mc.d(new h7.u(12), new z9.d(12));
    public final ArrayDeque f27527f;

    public o90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f27524a = arrayList;
        this.f27527f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof m90) {
                list2.add(((m90) obj).f26992a);
            } else if (obj instanceof n90) {
                C((n90) obj, list2, i10);
            }
        }
    }

    public static int B(ne.p pVar) {
        ne.s sVar;
        String str;
        ne.p pVar2 = (ne.p) pVar.f14956c;
        if (pVar2 instanceof ne.r) {
            ne.p pVar3 = (ne.p) pVar2.f14956c;
            if ((pVar3 instanceof ne.s) && (str = (sVar = (ne.s) pVar3).f14959g) != null) {
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
                        sVar.f14959g = str.substring(i10);
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

    public static void C(n90 n90Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z4;
        TL_iv.RichText j10;
        mc.a aVar = n90Var.f27225a;
        ArrayList arrayList = n90Var.f27227c;
        String str2 = aVar.f13911a;
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
                    Map map = aVar.f13913c;
                    int i11 = 0;
                    if (map != null && map.containsKey("open")) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    pageblockdetails.open = z4;
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        boolean z10 = obj instanceof n90;
                        if (z10) {
                            n90 n90Var2 = (n90) obj;
                            if ("summary".equalsIgnoreCase(n90Var2.f27225a.f13911a)) {
                                StringBuilder sb = new StringBuilder();
                                w(n90Var2.f27227c, sb);
                                String trim = sb.toString().trim();
                                if (trim.isEmpty()) {
                                    j10 = new TL_iv.textEmpty();
                                } else {
                                    j10 = s90.j(trim);
                                }
                                pageblockdetails.title = j10;
                            }
                        }
                        if (obj instanceof m90) {
                            arrayList2.add(((m90) obj).f26992a);
                        } else if (z10) {
                            C((n90) obj, arrayList2, i10 + 1);
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

    public static void w(List list, StringBuilder sb) {
        for (Object obj : list) {
            if (obj instanceof m90) {
                TL_iv.PageBlock pageBlock = ((m90) obj).f26992a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(s90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(s90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(s90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof n90) {
                w(((n90) obj).f27227c, sb);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mc.a aVar = (mc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f13910f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(ne.b bVar) {
        for (TL_iv.RichText richText : s90.b(s90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(ne.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ne.p pVar = (ne.p) cVar.f14956c; pVar != null; pVar = (ne.p) pVar.f14957f) {
            if (pVar instanceof ne.o) {
                int B = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    boolean z4 = true;
                    tL_pageListItemText.checkbox = true;
                    if (B != 1) {
                        z4 = false;
                    }
                    tL_pageListItemText.checked = z4;
                }
                tL_pageListItemText.text = s90.d(s90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(ne.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = s90.d(s90.j(hVar.f14946k));
        String str = hVar.f14945j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(ne.i iVar) {
        TL_iv.RichText d = s90.d(s90.a(iVar, null));
        if (this.f27526c.isEmpty()) {
            this.f27525b = d;
        }
        switch (iVar.f14947g) {
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
    public final void h(ne.j jVar) {
        StringBuilder sb = this.d;
        String str = jVar.f14948g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb, str);
        } catch (Throwable th2) {
            FileLog.e(th2);
            sb.append(str);
        }
    }

    @Override
    public final void j(ne.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = s90.d(s90.j(lVar.f14951g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(ne.n nVar) {
        boolean z4;
        if (nVar instanceof ie.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (ne.p pVar = (ne.p) ((ie.a) nVar).f14956c; pVar != null; pVar = (ne.p) pVar.f14957f) {
                boolean z10 = pVar instanceof ie.e;
                if (z10 || (pVar instanceof ie.b)) {
                    for (ne.p pVar2 = (ne.p) pVar.f14956c; pVar2 != null; pVar2 = (ne.p) pVar2.f14957f) {
                        if (pVar2 instanceof ie.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (ne.p pVar3 = (ne.p) ((ie.f) pVar2).f14956c; pVar3 != null; pVar3 = (ne.p) pVar3.f14957f) {
                                if (pVar3 instanceof ie.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    ie.d dVar = (ie.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z10 && !dVar.f7487g) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    pagetablecell.header = z4;
                                    ie.c cVar = dVar.h;
                                    if (cVar == ie.c.f7485b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == ie.c.f7486c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = s90.d(s90.a(dVar, null));
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
        } else if (nVar instanceof lc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = s90.c(((lc.a) nVar).f11852g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(ne.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o90.m(ne.q):void");
    }

    @Override
    public final void n(ne.r rVar) {
        for (TL_iv.RichText richText : s90.b(s90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(ne.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append((char) 1);
        sb.length();
        this.f27526c.add(new m90(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            mc.d dVar = this.e;
            int length = sb.length();
            mc.a aVar = dVar.d;
            while (true) {
                mc.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f13910f;
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
            dVar.d = new mc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f27526c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            m90 m90Var = (m90) obj;
            hashMap.put(Integer.valueOf(m90Var.f26993b), m90Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            mc.a aVar3 = (mc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f13912b));
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
                    arrayList5.add((m90) hashMap.get(num2));
                } else {
                    String trim = sb.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = s90.d(s90.j(trim));
                        arrayList5.add(new m90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new nh.e4(21));
        n90 n90Var = new n90(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(n90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            m90 m90Var2 = (m90) obj3;
            while (i12 < arrayList3.size() && ((mc.a) arrayList3.get(i12)).f13912b <= m90Var2.f26993b) {
                int i14 = i12 + 1;
                mc.a aVar4 = (mc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f13912b;
                if (i15 >= m90Var2.f26993b) {
                    while (arrayDeque.peek() != n90Var && ((n90) arrayDeque.peek()).f27226b <= i16) {
                        arrayDeque.pop();
                    }
                    n90 n90Var2 = new n90(aVar4, aVar4.d);
                    ((n90) arrayDeque.peek()).f27227c.add(n90Var2);
                    arrayDeque.push(n90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != n90Var && ((n90) arrayDeque.peek()).f27226b <= m90Var2.f26993b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = m90Var2.f26992a;
            ((n90) arrayDeque.peek()).f27227c.add(m90Var2);
        }
        A(0, n90Var.f27227c, this.f27524a);
    }
}
