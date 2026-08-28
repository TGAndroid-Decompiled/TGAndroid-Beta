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
public final class v80 extends f7.p8 {
    public final ArrayList f33322a;
    public TL_iv.RichText f33323b;
    public final ArrayList f33324c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final ic.d f33325e = new ic.d(new wa.a(10), new ya.b(10));
    public final ArrayDeque f33326f;

    public v80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f33322a = arrayList;
        this.f33326f = arrayDeque;
    }

    public static void A(int i9, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof t80) {
                list2.add(((t80) obj).f32645a);
            } else if (obj instanceof u80) {
                C((u80) obj, list2, i9);
            }
        }
    }

    public static int B(ie.p pVar) {
        ie.s sVar;
        String str;
        ie.p pVar2 = (ie.p) pVar.f11123c;
        if (pVar2 instanceof ie.r) {
            ie.p pVar3 = (ie.p) pVar2.f11123c;
            if ((pVar3 instanceof ie.s) && (str = (sVar = (ie.s) pVar3).f11127g) != null) {
                int i9 = 3;
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
                            i9 = 4;
                        }
                        sVar.f11127g = str.substring(i9);
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

    public static void C(u80 u80Var, List list, int i9) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j10;
        ic.a aVar = u80Var.f32961a;
        ArrayList arrayList = u80Var.f32963c;
        String str2 = aVar.f11091a;
        if (str2 == null) {
            lowerCase = "";
        } else {
            lowerCase = str2.toLowerCase();
        }
        if (i9 >= 64) {
            A(i9 + 1, arrayList, list);
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
                    Map map = aVar.f11093c;
                    int i10 = 0;
                    if (map != null && map.containsKey("open")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pageblockdetails.open = z10;
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        boolean z11 = obj instanceof u80;
                        if (z11) {
                            u80 u80Var2 = (u80) obj;
                            if ("summary".equalsIgnoreCase(u80Var2.f32961a.f11091a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(u80Var2.f32963c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j10 = new TL_iv.textEmpty();
                                } else {
                                    j10 = z80.j(trim);
                                }
                                pageblockdetails.title = j10;
                            }
                        }
                        if (obj instanceof t80) {
                            arrayList2.add(((t80) obj).f32645a);
                        } else if (z11) {
                            C((u80) obj, arrayList2, i9 + 1);
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
        A(i9 + 1, arrayList, list);
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof t80) {
                TL_iv.PageBlock pageBlock = ((t80) obj).f32645a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(z80.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof u80) {
                w(((u80) obj).f32963c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ic.a aVar = (ic.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f11090f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(ie.b bVar) {
        for (TL_iv.RichText richText : z80.b(z80.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(ie.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ie.p pVar = (ie.p) cVar.f11123c; pVar != null; pVar = (ie.p) pVar.f11125f) {
            if (pVar instanceof ie.o) {
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
                tL_pageListItemText.text = z80.d(z80.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(ie.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = z80.d(z80.j(hVar.f11113k));
        String str = hVar.f11112j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(ie.i iVar) {
        TL_iv.RichText d = z80.d(z80.a(iVar, null));
        if (this.f33324c.isEmpty()) {
            this.f33323b = d;
        }
        switch (iVar.f11114g) {
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
    public final void h(ie.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f11115g;
        if (str == null) {
            return;
        }
        try {
            this.f33325e.b(sb2, str);
        } catch (Throwable th) {
            FileLog.e(th);
            sb2.append(str);
        }
    }

    @Override
    public final void j(ie.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = z80.d(z80.j(lVar.f11118g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(ie.n nVar) {
        boolean z10;
        if (nVar instanceof de.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (ie.p pVar = (ie.p) ((de.a) nVar).f11123c; pVar != null; pVar = (ie.p) pVar.f11125f) {
                boolean z11 = pVar instanceof de.e;
                if (z11 || (pVar instanceof de.b)) {
                    for (ie.p pVar2 = (ie.p) pVar.f11123c; pVar2 != null; pVar2 = (ie.p) pVar2.f11125f) {
                        if (pVar2 instanceof de.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (ie.p pVar3 = (ie.p) ((de.f) pVar2).f11123c; pVar3 != null; pVar3 = (ie.p) pVar3.f11125f) {
                                if (pVar3 instanceof de.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    de.d dVar = (de.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f4480g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    de.c cVar = dVar.h;
                                    if (cVar == de.c.f4478b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == de.c.f4479c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = z80.d(z80.a(dVar, null));
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
        } else if (nVar instanceof hc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = z80.c(((hc.a) nVar).f10402g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(ie.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v80.m(ie.q):void");
    }

    @Override
    public final void n(ie.r rVar) {
        for (TL_iv.RichText richText : z80.b(z80.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(ie.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f33324c.add(new t80(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            ic.d dVar = this.f33325e;
            int length = sb2.length();
            ic.a aVar = dVar.d;
            while (true) {
                ic.a aVar2 = aVar.f11089e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f11090f;
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
            dVar.d = new ic.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            FileLog.e(th);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f33324c;
        int size = arrayList4.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList4.get(i9);
            i9++;
            t80 t80Var = (t80) obj;
            hashMap.put(Integer.valueOf(t80Var.f32646b), t80Var);
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
            ic.a aVar3 = (ic.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f11092b));
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
                    arrayList5.add((t80) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = z80.d(z80.j(trim));
                        arrayList5.add(new t80(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new j9.a(26));
        u80 u80Var = new u80(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(u80Var);
        int size3 = arrayList5.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            t80 t80Var2 = (t80) obj3;
            while (i11 < arrayList3.size() && ((ic.a) arrayList3.get(i11)).f11092b <= t80Var2.f32646b) {
                int i13 = i11 + 1;
                ic.a aVar4 = (ic.a) arrayList3.get(i11);
                int i14 = aVar4.d;
                int i15 = aVar4.f11092b;
                if (i14 >= t80Var2.f32646b) {
                    while (arrayDeque.peek() != u80Var && ((u80) arrayDeque.peek()).f32962b <= i15) {
                        arrayDeque.pop();
                    }
                    u80 u80Var2 = new u80(aVar4, aVar4.d);
                    ((u80) arrayDeque.peek()).f32963c.add(u80Var2);
                    arrayDeque.push(u80Var2);
                }
                i11 = i13;
            }
            while (arrayDeque.peek() != u80Var && ((u80) arrayDeque.peek()).f32962b <= t80Var2.f32646b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = t80Var2.f32645a;
            ((u80) arrayDeque.peek()).f32963c.add(t80Var2);
        }
        A(0, u80Var.f32963c, this.f33322a);
    }
}
