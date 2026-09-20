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
public final class u90 extends v7.i0 {
    public final ArrayList f28633a;
    public TL_iv.RichText f28634b;
    public final ArrayList f28635c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final ad.d e = new ad.d(new qb.b(1), new rb.a(1));
    public final ArrayDeque f28636f;

    public u90(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f28633a = arrayList;
        this.f28636f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof s90) {
                list2.add(((s90) obj).f28084a);
            } else if (obj instanceof t90) {
                C((t90) obj, list2, i10);
            }
        }
    }

    public static int B(bf.p pVar) {
        bf.s sVar;
        String str;
        bf.p pVar2 = (bf.p) pVar.f3553c;
        if (pVar2 instanceof bf.r) {
            bf.p pVar3 = (bf.p) pVar2.f3553c;
            if ((pVar3 instanceof bf.s) && (str = (sVar = (bf.s) pVar3).f3556g) != null) {
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
                        sVar.f3556g = str.substring(i10);
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

    public static void C(t90 t90Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j3;
        ad.a aVar = t90Var.f28351a;
        ArrayList arrayList = t90Var.f28353c;
        String str2 = aVar.f389a;
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
                    Map map = aVar.f391c;
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
                        boolean z11 = obj instanceof t90;
                        if (z11) {
                            t90 t90Var2 = (t90) obj;
                            if ("summary".equalsIgnoreCase(t90Var2.f28351a.f389a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(t90Var2.f28353c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j3 = new TL_iv.textEmpty();
                                } else {
                                    j3 = y90.j(trim);
                                }
                                pageblockdetails.title = j3;
                            }
                        }
                        if (obj instanceof s90) {
                            arrayList2.add(((s90) obj).f28084a);
                        } else if (z11) {
                            C((t90) obj, arrayList2, i10 + 1);
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
            if (obj instanceof s90) {
                TL_iv.PageBlock pageBlock = ((s90) obj).f28084a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(y90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(y90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(y90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof t90) {
                w(((t90) obj).f28353c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad.a aVar = (ad.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f388f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(bf.b bVar) {
        for (TL_iv.RichText richText : y90.b(y90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(bf.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (bf.p pVar = (bf.p) cVar.f3553c; pVar != null; pVar = (bf.p) pVar.f3554f) {
            if (pVar instanceof bf.o) {
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
                tL_pageListItemText.text = y90.d(y90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(bf.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = y90.d(y90.j(hVar.f3543k));
        String str = hVar.f3542j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(bf.i iVar) {
        TL_iv.RichText d = y90.d(y90.a(iVar, null));
        if (this.f28635c.isEmpty()) {
            this.f28634b = d;
        }
        switch (iVar.f3544g) {
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
    public final void h(bf.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f3545g;
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
    public final void j(bf.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = y90.d(y90.j(lVar.f3548g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(bf.n nVar) {
        boolean z10;
        if (nVar instanceof we.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (bf.p pVar = (bf.p) ((we.a) nVar).f3553c; pVar != null; pVar = (bf.p) pVar.f3554f) {
                boolean z11 = pVar instanceof we.e;
                if (z11 || (pVar instanceof we.b)) {
                    for (bf.p pVar2 = (bf.p) pVar.f3553c; pVar2 != null; pVar2 = (bf.p) pVar2.f3554f) {
                        if (pVar2 instanceof we.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (bf.p pVar3 = (bf.p) ((we.f) pVar2).f3553c; pVar3 != null; pVar3 = (bf.p) pVar3.f3554f) {
                                if (pVar3 instanceof we.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    we.d dVar = (we.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f45318g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    we.c cVar = dVar.h;
                                    if (cVar == we.c.f45316b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == we.c.f45317c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = y90.d(y90.a(dVar, null));
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
            pageblockparagraph.text = y90.c(((zc.a) nVar).f49160g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(bf.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u90.m(bf.q):void");
    }

    @Override
    public final void n(bf.r rVar) {
        for (TL_iv.RichText richText : y90.b(y90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(bf.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f28635c.add(new s90(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            ad.d dVar = this.e;
            int length = sb2.length();
            ad.a aVar = dVar.d;
            while (true) {
                ad.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f388f;
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
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f28635c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            s90 s90Var = (s90) obj;
            hashMap.put(Integer.valueOf(s90Var.f28085b), s90Var);
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
            ad.a aVar3 = (ad.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f390b));
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
                    arrayList5.add((s90) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = y90.d(y90.j(trim));
                        arrayList5.add(new s90(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.df(10));
        t90 t90Var = new t90(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(t90Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            s90 s90Var2 = (s90) obj3;
            while (i12 < arrayList3.size() && ((ad.a) arrayList3.get(i12)).f390b <= s90Var2.f28085b) {
                int i14 = i12 + 1;
                ad.a aVar4 = (ad.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f390b;
                if (i15 >= s90Var2.f28085b) {
                    while (arrayDeque.peek() != t90Var && ((t90) arrayDeque.peek()).f28352b <= i16) {
                        arrayDeque.pop();
                    }
                    t90 t90Var2 = new t90(aVar4, aVar4.d);
                    ((t90) arrayDeque.peek()).f28353c.add(t90Var2);
                    arrayDeque.push(t90Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != t90Var && ((t90) arrayDeque.peek()).f28352b <= s90Var2.f28085b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = s90Var2.f28084a;
            ((t90) arrayDeque.peek()).f28353c.add(s90Var2);
        }
        A(0, t90Var.f28353c, this.f28633a);
    }
}
