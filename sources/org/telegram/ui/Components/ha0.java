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
public final class ha0 extends v7.x6 {
    public final ArrayList f26846a;
    public TL_iv.RichText f26847b;
    public final ArrayList f26848c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final cd.d e = new cd.d(new oa.d(5), new pb.a(5));
    public final ArrayDeque f26849f;

    public ha0(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.f26846a = arrayList;
        this.f26849f = arrayDeque;
    }

    public static void A(int i10, List list, List list2) {
        for (Object obj : list) {
            if (obj instanceof fa0) {
                list2.add(((fa0) obj).f26211a);
            } else if (obj instanceof ga0) {
                C((ga0) obj, list2, i10);
            }
        }
    }

    public static int B(df.p pVar) {
        df.s sVar;
        String str;
        df.p pVar2 = (df.p) pVar.f7988c;
        if (pVar2 instanceof df.r) {
            df.p pVar3 = (df.p) pVar2.f7988c;
            if ((pVar3 instanceof df.s) && (str = (sVar = (df.s) pVar3).f7991g) != null) {
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
                        sVar.f7991g = str.substring(i10);
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

    public static void C(ga0 ga0Var, List list, int i10) {
        String lowerCase;
        String str;
        boolean z10;
        TL_iv.RichText j10;
        cd.a aVar = ga0Var.f26540a;
        ArrayList arrayList = ga0Var.f26542c;
        String str2 = aVar.f5104a;
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
                    Map map = aVar.f5106c;
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
                        boolean z11 = obj instanceof ga0;
                        if (z11) {
                            ga0 ga0Var2 = (ga0) obj;
                            if ("summary".equalsIgnoreCase(ga0Var2.f26540a.f5104a)) {
                                StringBuilder sb2 = new StringBuilder();
                                w(ga0Var2.f26542c, sb2);
                                String trim = sb2.toString().trim();
                                if (trim.isEmpty()) {
                                    j10 = new TL_iv.textEmpty();
                                } else {
                                    j10 = la0.j(trim);
                                }
                                pageblockdetails.title = j10;
                            }
                        }
                        if (obj instanceof fa0) {
                            arrayList2.add(((fa0) obj).f26211a);
                        } else if (z11) {
                            C((ga0) obj, arrayList2, i10 + 1);
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
            if (obj instanceof fa0) {
                TL_iv.PageBlock pageBlock = ((fa0) obj).f26211a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(la0.l(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(la0.l(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(la0.l(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof ga0) {
                w(((ga0) obj).f26542c, sb2);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cd.a aVar = (cd.a) it.next();
            arrayList.add(aVar);
            ArrayList arrayList2 = aVar.f5103f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(df.b bVar) {
        for (TL_iv.RichText richText : la0.b(la0.a(bVar, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(df.c cVar) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (df.p pVar = (df.p) cVar.f7988c; pVar != null; pVar = (df.p) pVar.f7989f) {
            if (pVar instanceof df.o) {
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
                tL_pageListItemText.text = la0.d(la0.a(pVar, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(df.h hVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = la0.d(la0.j(hVar.f7978k));
        String str = hVar.f7977j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(df.i iVar) {
        TL_iv.RichText d = la0.d(la0.a(iVar, null));
        if (this.f26848c.isEmpty()) {
            this.f26847b = d;
        }
        switch (iVar.f7979g) {
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
    public final void h(df.j jVar) {
        StringBuilder sb2 = this.d;
        String str = jVar.f7980g;
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
    public final void j(df.l lVar) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = la0.d(la0.j(lVar.f7983g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(df.n nVar) {
        boolean z10;
        if (nVar instanceof ye.a) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (df.p pVar = (df.p) ((ye.a) nVar).f7988c; pVar != null; pVar = (df.p) pVar.f7989f) {
                boolean z11 = pVar instanceof ye.e;
                if (z11 || (pVar instanceof ye.b)) {
                    for (df.p pVar2 = (df.p) pVar.f7988c; pVar2 != null; pVar2 = (df.p) pVar2.f7989f) {
                        if (pVar2 instanceof ye.f) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (df.p pVar3 = (df.p) ((ye.f) pVar2).f7988c; pVar3 != null; pVar3 = (df.p) pVar3.f7989f) {
                                if (pVar3 instanceof ye.d) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    ye.d dVar = (ye.d) pVar3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z11 && !dVar.f50175g) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    pagetablecell.header = z10;
                                    ye.c cVar = dVar.h;
                                    if (cVar == ye.c.f50173b) {
                                        pagetablecell.align_center = true;
                                    } else if (cVar == ye.c.f50174c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = la0.d(la0.a(dVar, null));
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
        } else if (nVar instanceof bd.a) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = la0.c(((bd.a) nVar).f4256g);
            x(pageblockparagraph);
        } else {
            v(nVar);
        }
    }

    @Override
    public final void m(df.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha0.m(df.q):void");
    }

    @Override
    public final void n(df.r rVar) {
        for (TL_iv.RichText richText : la0.b(la0.a(rVar, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(df.t tVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb2 = this.d;
        int length = sb2.length();
        sb2.append((char) 1);
        sb2.length();
        this.f26848c.add(new fa0(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb2 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            cd.d dVar = this.e;
            int length = sb2.length();
            cd.a aVar = dVar.d;
            while (true) {
                cd.a aVar2 = aVar.e;
                if (aVar2 == null) {
                    break;
                }
                aVar = aVar2;
            }
            if (length > -1) {
                aVar.b(length);
            }
            ArrayList arrayList2 = aVar.f5103f;
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
            dVar.d = new cd.a("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.f26848c;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            fa0 fa0Var = (fa0) obj;
            hashMap.put(Integer.valueOf(fa0Var.f26212b), fa0Var);
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
            cd.a aVar3 = (cd.a) obj2;
            treeSet.add(Integer.valueOf(aVar3.f5105b));
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
                    arrayList5.add((fa0) hashMap.get(num2));
                } else {
                    String trim = sb2.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = la0.d(la0.j(trim));
                        arrayList5.add(new fa0(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new org.telegram.ui.ActionBar.i4(17));
        ga0 ga0Var = new ga0(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ga0Var);
        int size3 = arrayList5.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList5.get(i13);
            i13++;
            fa0 fa0Var2 = (fa0) obj3;
            while (i12 < arrayList3.size() && ((cd.a) arrayList3.get(i12)).f5105b <= fa0Var2.f26212b) {
                int i14 = i12 + 1;
                cd.a aVar4 = (cd.a) arrayList3.get(i12);
                int i15 = aVar4.d;
                int i16 = aVar4.f5105b;
                if (i15 >= fa0Var2.f26212b) {
                    while (arrayDeque.peek() != ga0Var && ((ga0) arrayDeque.peek()).f26541b <= i16) {
                        arrayDeque.pop();
                    }
                    ga0 ga0Var2 = new ga0(aVar4, aVar4.d);
                    ((ga0) arrayDeque.peek()).f26542c.add(ga0Var2);
                    arrayDeque.push(ga0Var2);
                }
                i12 = i14;
            }
            while (arrayDeque.peek() != ga0Var && ((ga0) arrayDeque.peek()).f26541b <= fa0Var2.f26212b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = fa0Var2.f26211a;
            ((ga0) arrayDeque.peek()).f26542c.add(fa0Var2);
        }
        A(0, ga0Var.f26542c, this.f26846a);
    }
}
