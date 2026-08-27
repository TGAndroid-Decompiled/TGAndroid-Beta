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

public final class z80 extends g7.r8 {

    public final ArrayList f35197a;

    public TL_iv.RichText f35198b;

    public final ArrayList f35199c = new ArrayList();
    public final StringBuilder d = new StringBuilder();

    public final jc.d f35200e = new jc.d(new za.b(10), new ab.a(11));

    public final ArrayDeque f35201f;

    public z80(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f35197a = arrayList;
        this.f35201f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof x80) {
                list2.add(((x80) obj).f34552a);
            } else if (obj instanceof y80) {
                C((y80) obj, list2, i10);
            }
        }
    }

    public static int B(je.p pVar) {
        je.s sVar;
        String str;
        je.p pVar2 = (je.p) pVar.f12925c;
        if (!(pVar2 instanceof je.r)) {
            return -1;
        }
        je.p pVar3 = (je.p) pVar2.f12925c;
        if (!(pVar3 instanceof je.s) || (str = (sVar = (je.s) pVar3).f12929g) == null) {
            return -1;
        }
        int i10 = 3;
        if (str.length() < 3) {
            return -1;
        }
        int i11 = 0;
        if (str.charAt(0) != '[' || str.charAt(2) != ']') {
            return -1;
        }
        char cCharAt = str.charAt(1);
        if (cCharAt != ' ') {
            if (cCharAt != 'x' && cCharAt != 'X') {
                return -1;
            }
            i11 = 1;
        }
        if (str.length() > 3 && str.charAt(3) == ' ') {
            i10 = 4;
        }
        sVar.f12929g = str.substring(i10);
        return i11;
    }

    public static void C(y80 y80Var, List list, int i10) {
        String str;
        jc.a aVar = y80Var.f34868a;
        ArrayList arrayList = y80Var.f34870c;
        String str2 = aVar.f12893a;
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (i10 >= 64) {
            A(i10 + 1, arrayList, list);
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                }
                A(i10 + 1, arrayList, list);
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 112:
                str = "p";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = aVar.f12895c;
                    int i11 = 0;
                    pageblockdetails.open = map != null && map.containsKey("open");
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        boolean z10 = obj instanceof y80;
                        if (z10) {
                            y80 y80Var2 = (y80) obj;
                            if ("summary".equalsIgnoreCase(y80Var2.f34868a.f12893a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(y80Var2.f34870c, sb2);
                                String strTrim = sb2.toString().trim();
                                pageblockdetails.title = strTrim.isEmpty() ? new TL_iv.textEmpty() : d90.j(strTrim);
                            }
                        }
                        if (obj instanceof x80) {
                            arrayList2.add(((x80) obj).f34552a);
                        } else if (z10) {
                            C((y80) obj, arrayList2, i10 + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                }
                A(i10 + 1, arrayList, list);
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                A(i10 + 1, arrayList, list);
                break;
            default:
                A(i10 + 1, arrayList, list);
                break;
        }
    }

    public static void w(List list, StringBuilder sb2) {
        for (Object obj : list) {
            if (obj instanceof x80) {
                TL_iv.PageBlock pageBlock = ((x80) obj).f34552a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(d90.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(d90.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(d90.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof y80) {
                w(((y80) obj).f34870c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc.a aVar = (jc.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f12892f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override
    public final void a(je.b bVar) {
        for (TL_iv.RichText richText : d90.b(d90.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(je.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (je.p pVar = (je.p) cVar.f12925c; pVar != null; pVar = (je.p) pVar.f12927f) {
            if (pVar instanceof je.o) {
                int iB = B(pVar);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (iB >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = iB == 1;
                }
                tL_pageListItemText.text = d90.d(d90.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(je.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = d90.d(d90.j(hVar.f12915k));
        String str = hVar.f12914j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(je.i iVar) {
        TL_iv.RichText richTextD = d90.d(d90.a(iVar, null));
        if (this.f35199c.isEmpty()) {
            this.f35198b = richTextD;
        }
        switch (iVar.f12916g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = richTextD;
                x(pageblockheading1);
                break;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = richTextD;
                x(pageblockheading2);
                break;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = richTextD;
                x(pageblockheading3);
                break;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = richTextD;
                x(pageblockheading4);
                break;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = richTextD;
                x(pageblockheading5);
                break;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = richTextD;
                x(pageblockheading6);
                break;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = richTextD;
                x(pageblockheader);
                break;
        }
    }

    @Override
    public final void h(je.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f12917g;
        if (str == null) {
            return;
        }
        try {
            this.f35200e.b(sb2, str);
        } catch (Throwable th) {
            FileLog.e(th);
            sb2.append(str);
        }
    }

    @Override
    public final void j(je.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = d90.d(d90.j(lVar.f12920g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(je.n nVar) {
        if (!(nVar instanceof ee.a)) {
            if (!(nVar instanceof ic.a)) {
                v(nVar);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = d90.c(((ic.a) nVar).f11111g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (je.p pVar = (je.p) ((ee.a) nVar).f12925c; pVar != null; pVar = (je.p) pVar.f12927f) {
            boolean z10 = pVar instanceof ee.e;
            if (z10 || (pVar instanceof ee.b)) {
                for (je.p pVar2 = (je.p) pVar.f12925c; pVar2 != null; pVar2 = (je.p) pVar2.f12927f) {
                    if (pVar2 instanceof ee.f) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (je.p pVar3 = (je.p) ((ee.f) pVar2).f12925c; pVar3 != null; pVar3 = (je.p) pVar3.f12927f) {
                            if (pVar3 instanceof ee.d) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                ee.d dVar = (ee.d) pVar3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z10 || dVar.f5379g;
                                ee.c cVar = dVar.h;
                                if (cVar == ee.c.f5377b) {
                                    pagetablecell.align_center = true;
                                } else if (cVar == ee.c.f5378c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = d90.d(d90.a(dVar, null));
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
    }

    @Override
    public final void m(je.q qVar) {
        String strValueOf;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z10 = ((je.a) ((je.p) qVar.f12924b)) instanceof je.f;
        int i10 = qVar.f12928g;
        for (je.p pVar = (je.p) qVar.f12925c; pVar != null; pVar = (je.p) pVar.f12927f) {
            if (pVar instanceof je.o) {
                if (z10) {
                    ArrayDeque arrayDeque = this.f35201f;
                    if (arrayDeque.isEmpty()) {
                        strValueOf = String.valueOf(i10);
                        i10++;
                    } else {
                        strValueOf = (String) arrayDeque.poll();
                    }
                } else {
                    strValueOf = String.valueOf(i10);
                    i10++;
                }
                int iB = B(pVar);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                if (iB >= 0) {
                    tL_pageListOrderedItemText.checkbox = true;
                    tL_pageListOrderedItemText.checked = iB == 1;
                }
                tL_pageListOrderedItemText.num = strValueOf;
                tL_pageListOrderedItemText.text = d90.d(d90.a(pVar, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            }
        }
        x(pageblockorderedlist);
    }

    @Override
    public final void n(je.r rVar) {
        for (TL_iv.RichText richText : d90.b(d90.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(je.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f35199c.add(new x80(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            jc.d dVar = this.f35200e;
            int length = sb2.length();
            jc.a aVar = dVar.d;
            while (true) {
                jc.a aVar2 = aVar.f12891e;
                if (aVar2 == null) {
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f12892f;
            List listUnmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
            if (listUnmodifiableList.size() > 0) {
                arrayList.addAll(listUnmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            dVar.d = new jc.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            FileLog.e(th);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap map = new HashMap();
        ArrayList arrayList4 = this.f35199c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            x80 x80Var = (x80) obj;
            map.put(Integer.valueOf(x80Var.f34553b), x80Var);
        }
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb2.length()));
        for (Integer num : map.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            jc.a aVar3 = (jc.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f12894b));
            treeSet.add(Integer.valueOf(aVar3.d));
        }
        ArrayList arrayList5 = new ArrayList();
        Integer num2 = null;
        for (Integer num3 : treeSet) {
            if (num2 != null && num3.intValue() > num2.intValue()) {
                int iIntValue = num2.intValue();
                int iIntValue2 = num3.intValue();
                if (iIntValue2 - iIntValue == 1 && map.containsKey(num2)) {
                    arrayList5.add((x80) map.get(num2));
                } else {
                    String strTrim = sb2.substring(iIntValue, iIntValue2).trim();
                    if (!strTrim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = d90.d(d90.j(strTrim));
                        arrayList5.add(new x80(iIntValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new k9.a(24));
        y80 y80Var = new y80(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(y80Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            x80 x80Var2 = (x80) obj3;
            while (i12 < arrayList3.size() && ((jc.a) arrayList3.get(i12)).f12894b <= x80Var2.f34553b) {
                int i14 = i12 + 1;
                jc.a aVar4 = (jc.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f12894b;
                if (i15 >= x80Var2.f34553b) {
                    while (arrayDeque.peek() != y80Var && ((y80) arrayDeque.peek()).f34869b <= i16) {
                        arrayDeque.pop();
                    }
                    y80 y80Var2 = new y80(aVar4, aVar4.d);
                    ((y80) arrayDeque.peek()).f34870c.add(y80Var2);
                    arrayDeque.push(y80Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != y80Var && ((y80) arrayDeque.peek()).f34869b <= x80Var2.f34553b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = x80Var2.f34552a;
            ((y80) arrayDeque.peek()).f34870c.add(x80Var2);
        }
        A(0, y80Var.f34870c, this.f35197a);
    }
}
