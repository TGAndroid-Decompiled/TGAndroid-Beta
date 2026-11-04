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
public final class g80 extends b8.lc {
    public final ArrayList f34021a;
    public TL_iv.RichText f34022b;
    public final ArrayList f34023c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final xc.d f34024e = new xc.d(new v7.s(27), new kb.a(28));
    public final ArrayDeque f34025f;

    public g80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f34021a = arrayList;
        this.f34025f = arrayDeque;
    }

    public static void A(int i3, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof e80) {
                list2.add(((e80) obj).f33312a);
            } else if (obj instanceof f80) {
                C((f80) obj, list2, i3);
            }
        }
    }

    public static int B(gf.p pVar) {
        gf.s sVar;
        String str;
        gf.p pVar2 = (gf.p) pVar.f12267c;
        if (pVar2 instanceof gf.r) {
            gf.p pVar3 = (gf.p) pVar2.f12267c;
            if ((pVar3 instanceof gf.s) && (str = (sVar = (gf.s) pVar3).f12271g) != null) {
                int i3 = 3;
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
                            i3 = 4;
                        }
                        sVar.f12271g = str.substring(i3);
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

    public static void C(f80 f80Var, List list, int i3) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText n4;
        xc.a aVar = f80Var.f33763a;
        ArrayList arrayList = f80Var.f33765c;
        String str2 = aVar.f58608a;
        if (str2 == null) {
            lowerCase = "";
        } else {
            lowerCase = str2.toLowerCase();
        }
        if (i3 >= 64) {
            A(i3 + 1, arrayList, list);
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
                    Map map = aVar.f58610c;
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
                        boolean z11 = obj instanceof f80;
                        if (z11) {
                            f80 f80Var2 = (f80) obj;
                            if ("summary".equalsIgnoreCase(f80Var2.f33763a.f58608a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(f80Var2.f33765c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    n4 = new TL_iv.textEmpty();
                                } else {
                                    n4 = k80.n(trim);
                                }
                                pageblockdetails.title = n4;
                            }
                        }
                        if (obj instanceof e80) {
                            arrayList2.add(((e80) obj).f33312a);
                        } else if (z11) {
                            C((f80) obj, arrayList2, i3 + 1);
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
        A(i3 + 1, arrayList, list);
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof e80) {
                TL_iv.PageBlock pageBlock = ((e80) obj).f33312a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(k80.p(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof f80) {
                w(((f80) obj).f33765c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xc.a aVar = (xc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f58607f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(gf.b bVar) {
        for (TL_iv.RichText richText : k80.b(k80.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(gf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (gf.p pVar = (gf.p) cVar.f12267c; pVar != null; pVar = (gf.p) pVar.f12269f) {
            if (pVar instanceof gf.o) {
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
                tL_pageListItemText.text = k80.e(k80.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(gf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = k80.e(k80.n(hVar.f12257k));
        String str = hVar.f12256j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(gf.i iVar) {
        TL_iv.RichText e10 = k80.e(k80.a(iVar, null));
        if (this.f34023c.isEmpty()) {
            this.f34022b = e10;
        }
        switch (iVar.f12258g) {
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
    public final void h(gf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f12259g;
        if (str == null) {
            return;
        }
        try {
            this.f34024e.b(sb2, str);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            sb2.append(str);
        }
    }

    @Override
    public final void j(gf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = k80.e(k80.n(lVar.f12262g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(gf.n nVar) {
        boolean z10;
        if (nVar instanceof bf.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (gf.p pVar = (gf.p) ((bf.a) nVar).f12267c; pVar != null; pVar = (gf.p) pVar.f12269f) {
                boolean z11 = pVar instanceof bf.e;
                if (z11 || (pVar instanceof bf.b)) {
                    for (gf.p pVar2 = (gf.p) pVar.f12267c; pVar2 != null; pVar2 = (gf.p) pVar2.f12269f) {
                        if (pVar2 instanceof bf.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (gf.p pVar3 = (gf.p) ((bf.f) pVar2).f12267c; pVar3 != null; pVar3 = (gf.p) pVar3.f12269f) {
                                if (pVar3 instanceof bf.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    bf.d dVar = (bf.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f3294g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    bf.c cVar = dVar.h;
                                    if (cVar == bf.c.f3292b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == bf.c.f3293c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = k80.e(k80.a(dVar, null));
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
        } else if (nVar instanceof wc.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = k80.c(((wc.a) nVar).f57451g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(gf.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g80.m(gf.q):void");
    }

    @Override
    public final void n(gf.r rVar) {
        for (TL_iv.RichText richText : k80.b(k80.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(gf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f34023c.add(new e80(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            xc.d dVar = this.f34024e;
            int length = sb2.length();
            xc.a aVar = dVar.d;
            while (true) {
                xc.a aVar2 = aVar.f58606e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f58607f;
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
            dVar.d = new xc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f34023c;
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            e80 e80Var = (e80) obj;
            hashMap.put(Integer.valueOf(e80Var.f33313b), e80Var);
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
            xc.a aVar3 = (xc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f58609b));
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
                    arrayList5.add((e80) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = k80.e(k80.n(trim));
                        arrayList5.add(new e80(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new d80(0));
        f80 f80Var = new f80(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(f80Var);
        int size3 = arrayList5.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            e80 e80Var2 = (e80) obj3;
            while (i11 < arrayList3.size() && ((xc.a) arrayList3.get(i11)).f58609b <= e80Var2.f33313b) {
                int i13 = i11 + 1;
                xc.a aVar4 = (xc.a) arrayList3.get(i11);
                int i14 = aVar4.d;
                int i15 = aVar4.f58609b;
                if (i14 >= e80Var2.f33313b) {
                    while (arrayDeque.peek() != f80Var && ((f80) arrayDeque.peek()).f33764b <= i15) {
                        arrayDeque.pop();
                    }
                    f80 f80Var2 = new f80(aVar4, aVar4.d);
                    ((f80) arrayDeque.peek()).f33765c.add(f80Var2);
                    arrayDeque.push(f80Var2);
                }
                i11 = i13;
            }
            while (arrayDeque.peek() != f80Var && ((f80) arrayDeque.peek()).f33764b <= e80Var2.f33313b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = e80Var2.f33312a;
            ((f80) arrayDeque.peek()).f33765c.add(e80Var2);
        }
        A(0, f80Var.f33765c, this.f34021a);
    }
}
