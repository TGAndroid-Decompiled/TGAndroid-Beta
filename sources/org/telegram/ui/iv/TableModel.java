package org.telegram.ui.iv;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;

public class TableModel {
    public int[][] anchorC;
    public int[][] anchorR;
    private final ArrayList anchorsRowMajor = new ArrayList();
    public final TL_iv.pageBlockTable block;
    public int colCount;
    public TL_iv.pageTableCell[][] grid;
    public int rowCount;

    public TableModel(TL_iv.pageBlockTable pageblocktable) {
        this.block = pageblocktable;
        rebuildFromBlock();
    }

    public void rebuildFromBlock() {
        int i;
        int i2;
        int i3;
        ArrayList<TL_iv.pageTableRow> arrayList = this.block.rows;
        this.rowCount = arrayList == null ? 0 : arrayList.size();
        int i4 = 0;
        int iMax = 0;
        while (true) {
            i = this.rowCount;
            if (i4 >= i) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = this.block.rows.get(i4);
            int iSpanCol = 0;
            for (int i5 = 0; i5 < pagetablerow.cells.size(); i5++) {
                iSpanCol += spanCol(pagetablerow.cells.get(i5));
            }
            if (iSpanCol > iMax) {
                iMax = iSpanCol;
            }
            i4++;
        }
        TL_iv.pageTableCell[][] pagetablecellArrGrowCols = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i, 1), Math.max(iMax, 1));
        int[] iArr = {Math.max(this.rowCount, 1), Math.max(iMax, 1)};
        Class cls = Integer.TYPE;
        int[][] iArrGrowIntCols = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArrGrowIntCols2 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(iMax, 1));
        int i6 = 0;
        while (true) {
            i2 = -1;
            if (i6 >= iArrGrowIntCols.length) {
                break;
            }
            for (int i7 = 0; i7 < iArrGrowIntCols[0].length; i7++) {
                iArrGrowIntCols[i6][i7] = -1;
                iArrGrowIntCols2[i6][i7] = -1;
            }
            i6++;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i3 = this.rowCount;
            if (i8 >= i3) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = this.block.rows.get(i8);
            int i10 = 0;
            int i11 = 0;
            while (i10 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i10);
                int iSpanCol2 = spanCol(pagetablecell);
                int iSpanRow = spanRow(pagetablecell);
                while (i11 < iMax && pagetablecellArrGrowCols[i8][i11] != null) {
                    i11++;
                }
                int i12 = i11 + iSpanCol2;
                if (i12 > iMax) {
                    iMax = Math.max(i12, iMax * 2);
                    pagetablecellArrGrowCols = growCols(pagetablecellArrGrowCols, iMax);
                    iArrGrowIntCols = growIntCols(iArrGrowIntCols, iMax, i2);
                    iArrGrowIntCols2 = growIntCols(iArrGrowIntCols2, iMax, i2);
                }
                for (int i13 = i8; i13 < i8 + iSpanRow && i13 < this.rowCount; i13++) {
                    for (int i14 = i11; i14 < i12; i14++) {
                        pagetablecellArrGrowCols[i13][i14] = pagetablecell;
                        iArrGrowIntCols[i13][i14] = i8;
                        iArrGrowIntCols2[i13][i14] = i11;
                    }
                }
                if (i12 > i9) {
                    i9 = i12;
                }
                i10++;
                i11 = i12;
                i2 = -1;
            }
            i8++;
            i2 = -1;
        }
        this.colCount = i9;
        this.grid = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i3, 1), Math.max(this.colCount, 1));
        this.anchorR = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(this.colCount, 1));
        this.anchorC = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(this.colCount, 1));
        for (int i15 = 0; i15 < this.rowCount; i15++) {
            for (int i16 = 0; i16 < this.colCount; i16++) {
                TL_iv.pageTableCell[][] pagetablecellArr = this.grid;
                pagetablecellArr[i15][i16] = pagetablecellArrGrowCols[i15][i16];
                this.anchorR[i15][i16] = iArrGrowIntCols[i15][i16];
                this.anchorC[i15][i16] = iArrGrowIntCols2[i15][i16];
                if (pagetablecellArr[i15][i16] == null) {
                    TL_iv.pageTableCell pagetablecellNewEmptyCell = newEmptyCell();
                    this.grid[i15][i16] = pagetablecellNewEmptyCell;
                    this.anchorR[i15][i16] = i15;
                    this.anchorC[i15][i16] = i16;
                    this.block.rows.get(i15).cells.add(pagetablecellNewEmptyCell);
                }
            }
        }
        rebuildAnchorList();
    }

    public boolean isAnchor(int i, int i2) {
        return i >= 0 && i2 >= 0 && i < this.rowCount && i2 < this.colCount && this.anchorR[i][i2] == i && this.anchorC[i][i2] == i2;
    }

    public List anchors() {
        return this.anchorsRowMajor;
    }

    public int flatIndexOfAnchor(TL_iv.pageTableCell pagetablecell) {
        return this.anchorsRowMajor.indexOf(pagetablecell);
    }

    public int anchorRowOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorR[i][i2];
                }
            }
        }
        return -1;
    }

    public int anchorColOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorC[i][i2];
                }
            }
        }
        return -1;
    }

    public static int spanCol(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.colspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public static int spanRow(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.rowspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public static TL_iv.pageTableCell newEmptyCell() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        applyPlainText(pagetablecell, "");
        return pagetablecell;
    }

    public static void setHeader(TL_iv.pageTableCell pagetablecell, boolean z) {
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z;
        pagetablecell.flags = z ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
    }

    public static int alignOf(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell == null) {
            return 0;
        }
        if (pagetablecell.align_right) {
            return 2;
        }
        return pagetablecell.align_center ? 1 : 0;
    }

    public static int valignOf(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell == null) {
            return 0;
        }
        if (pagetablecell.valign_bottom) {
            return 2;
        }
        return pagetablecell.valign_middle ? 1 : 0;
    }

    public static void setAlign(TL_iv.pageTableCell pagetablecell, int i) {
        if (pagetablecell == null) {
            return;
        }
        boolean z = i == 1;
        pagetablecell.align_center = z;
        boolean z2 = i == 2;
        pagetablecell.align_right = z2;
        pagetablecell.flags = z ? pagetablecell.flags | 8 : pagetablecell.flags & (-9);
        pagetablecell.flags = z2 ? pagetablecell.flags | 16 : pagetablecell.flags & (-17);
    }

    public static void setVAlign(TL_iv.pageTableCell pagetablecell, int i) {
        if (pagetablecell == null) {
            return;
        }
        boolean z = i == 1;
        pagetablecell.valign_middle = z;
        boolean z2 = i == 2;
        pagetablecell.valign_bottom = z2;
        pagetablecell.flags = z ? pagetablecell.flags | 32 : pagetablecell.flags & (-33);
        pagetablecell.flags = z2 ? pagetablecell.flags | 64 : pagetablecell.flags & (-65);
    }

    public void addRow() {
        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
        pagetablerow.cells = new ArrayList<>();
        int iMax = Math.max(this.colCount, 1);
        for (int i = 0; i < iMax; i++) {
            pagetablerow.cells.add(newEmptyCell());
        }
        this.block.rows.add(pagetablerow);
        rebuildFromBlock();
    }

    public void addColumn() {
        if (this.block.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
            pagetablerow.cells = arrayList;
            arrayList.add(newEmptyCell());
            this.block.rows.add(pagetablerow);
        } else {
            ArrayList<TL_iv.pageTableRow> arrayList2 = this.block.rows;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i);
                i++;
                TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                if (pagetablerow3.cells == null) {
                    pagetablerow3.cells = new ArrayList<>();
                }
                pagetablerow3.cells.add(newEmptyCell());
            }
        }
        rebuildFromBlock();
    }

    public boolean insertRowAt(int i) {
        int i2 = this.rowCount;
        if (i2 == 0 || this.colCount == 0) {
            addRow();
            return true;
        }
        if (i < 0) {
            i = 0;
        }
        if (i <= i2) {
            i2 = i;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        boolean[] zArr = new boolean[this.colCount];
        ArrayList arrayList = this.anchorsRowMajor;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
            int iAnchorRowOf = anchorRowOf(pagetablecell);
            int iAnchorColOf = anchorColOf(pagetablecell);
            int iSpanRow = spanRow(pagetablecell);
            int iSpanCol = spanCol(pagetablecell);
            int i4 = iAnchorRowOf >= i2 ? iAnchorRowOf + 1 : iAnchorRowOf;
            if (iAnchorRowOf < i2 && iAnchorRowOf + iSpanRow > i2) {
                iSpanRow++;
                for (int i5 = iAnchorColOf; i5 < iAnchorColOf + iSpanCol && i5 < this.colCount; i5++) {
                    zArr[i5] = true;
                }
            }
            identityHashMap.put(pagetablecell, new int[]{i4, iAnchorColOf, iSpanRow, iSpanCol});
        }
        for (int i6 = 0; i6 < this.colCount; i6++) {
            if (!zArr[i6]) {
                identityHashMap.put(newEmptyCell(), new int[]{i2, i6, 1, 1});
            }
        }
        rewriteBlockRows(identityHashMap, this.rowCount + 1);
        rebuildFromBlock();
        return true;
    }

    public boolean insertColumnAt(int i) {
        int i2;
        if (this.rowCount == 0 || (i2 = this.colCount) == 0) {
            addColumn();
            return true;
        }
        int i3 = 0;
        if (i < 0) {
            i = 0;
        }
        if (i <= i2) {
            i2 = i;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        boolean[] zArr = new boolean[this.rowCount];
        ArrayList arrayList = this.anchorsRowMajor;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
            int iAnchorRowOf = anchorRowOf(pagetablecell);
            int iAnchorColOf = anchorColOf(pagetablecell);
            int iSpanRow = spanRow(pagetablecell);
            int iSpanCol = spanCol(pagetablecell);
            int i5 = iAnchorColOf >= i2 ? iAnchorColOf + 1 : iAnchorColOf;
            if (iAnchorColOf < i2 && iAnchorColOf + iSpanCol > i2) {
                iSpanCol++;
                for (int i6 = iAnchorRowOf; i6 < iAnchorRowOf + iSpanRow && i6 < this.rowCount; i6++) {
                    zArr[i6] = true;
                }
            }
            identityHashMap.put(pagetablecell, new int[]{iAnchorRowOf, i5, iSpanRow, iSpanCol});
        }
        while (true) {
            int i7 = this.rowCount;
            if (i3 < i7) {
                if (!zArr[i3]) {
                    identityHashMap.put(newEmptyCell(), new int[]{i3, i2, 1, 1});
                }
                i3++;
            } else {
                rewriteBlockRows(identityHashMap, i7);
                rebuildFromBlock();
                return true;
            }
        }
    }

    public boolean mergeCells(Set set) {
        int iAnchorRowOf;
        if (set == null || set.size() < 2) {
            return false;
        }
        Iterator it = set.iterator();
        int iMax = -1;
        int iMax2 = -1;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            int iAnchorRowOf2 = anchorRowOf(pagetablecell);
            int iAnchorColOf = anchorColOf(pagetablecell);
            int iSpanRow = spanRow(pagetablecell);
            int iSpanCol = spanCol(pagetablecell);
            iMin = Math.min(iMin, iAnchorRowOf2);
            iMin2 = Math.min(iMin2, iAnchorColOf);
            iMax2 = Math.max(iMax2, (iAnchorRowOf2 + iSpanRow) - 1);
            iMax = Math.max(iMax, (iAnchorColOf + iSpanCol) - 1);
        }
        HashSet<TL_iv.pageTableCell> hashSet = new HashSet();
        for (int i = iMin; i <= iMax2; i++) {
            for (int i2 = iMin2; i2 <= iMax; i2++) {
                if (i < 0 || i2 < 0 || i >= this.rowCount || i2 >= this.colCount) {
                    return false;
                }
                hashSet.add(this.grid[i][i2]);
            }
        }
        if (!hashSet.equals(new HashSet(set))) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TableModel.m5026$r8$lambda$nsghQ5EWw1RgCwnb60vfEJKF0(this.f$0, (TL_iv.pageTableCell) obj, (TL_iv.pageTableCell) obj2);
            }
        });
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String plainText = readPlainText((TL_iv.pageTableCell) obj);
            if (!plainText.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(plainText);
            }
        }
        TL_iv.pageTableCell pagetablecell2 = this.grid[iMin][iMin2];
        int i4 = (iMax - iMin2) + 1;
        int i5 = (iMax2 - iMin) + 1;
        if (i4 <= 1) {
            i4 = 0;
        }
        pagetablecell2.colspan = i4;
        int i6 = i5 > 1 ? i5 : 0;
        pagetablecell2.rowspan = i6;
        pagetablecell2.flags = i4 > 0 ? 2 | pagetablecell2.flags : pagetablecell2.flags & (-3);
        pagetablecell2.flags = i6 > 0 ? pagetablecell2.flags | 4 : pagetablecell2.flags & (-5);
        applyPlainText(pagetablecell2, sb.toString());
        for (TL_iv.pageTableCell pagetablecell3 : hashSet) {
            if (pagetablecell3 != pagetablecell2 && (iAnchorRowOf = anchorRowOf(pagetablecell3)) >= 0 && iAnchorRowOf < this.block.rows.size()) {
                this.block.rows.get(iAnchorRowOf).cells.remove(pagetablecell3);
            }
        }
        rebuildFromBlock();
        return true;
    }

    public static int m5026$r8$lambda$nsghQ5EWw1RgCwnb60vfEJKF0(TableModel tableModel, TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int iAnchorRowOf2 = tableModel.anchorRowOf(pagetablecell2);
        if (iAnchorRowOf != iAnchorRowOf2) {
            return Integer.compare(iAnchorRowOf, iAnchorRowOf2);
        }
        return Integer.compare(tableModel.anchorColOf(pagetablecell), tableModel.anchorColOf(pagetablecell2));
    }

    public boolean unmergeCell(TL_iv.pageTableCell pagetablecell) {
        int i = 1;
        if (pagetablecell == null) {
            return false;
        }
        int iAnchorRowOf = anchorRowOf(pagetablecell);
        int iAnchorColOf = anchorColOf(pagetablecell);
        if (iAnchorRowOf < 0 || iAnchorColOf < 0) {
            return false;
        }
        int iSpanRow = spanRow(pagetablecell);
        int iSpanCol = spanCol(pagetablecell);
        if (iSpanRow <= 1 && iSpanCol <= 1) {
            return false;
        }
        pagetablecell.rowspan = 0;
        pagetablecell.colspan = 0;
        pagetablecell.flags &= -7;
        int i2 = iAnchorRowOf;
        while (i2 < iAnchorRowOf + iSpanRow && i2 < this.rowCount) {
            TL_iv.pageTableRow pagetablerow = this.block.rows.get(i2);
            ArrayList arrayList = new ArrayList();
            ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i3);
                i3 += i;
                TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(anchorColOf(pagetablecell3))});
                i = 1;
            }
            for (int i4 = iAnchorColOf; i4 < iAnchorColOf + iSpanCol; i4++) {
                if (i2 != iAnchorRowOf || i4 != iAnchorColOf) {
                    TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                    pagetablecell4.header = pagetablecell.header;
                    pagetablecell4.align_center = pagetablecell.align_center;
                    pagetablecell4.align_right = pagetablecell.align_right;
                    pagetablecell4.valign_middle = pagetablecell.valign_middle;
                    pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                    applyPlainText(pagetablecell4, "");
                    arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i4)});
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return ((Integer) ((Object[]) obj)[1]).intValue();
                }
            }));
            pagetablerow.cells.clear();
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayList.get(i5);
                i5++;
                pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj)[0]);
            }
            i2++;
            i = 1;
        }
        rebuildFromBlock();
        return true;
    }

    public boolean deleteRows(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        boolean[] zArr = new boolean[this.rowCount];
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < this.rowCount) {
                zArr[iIntValue] = true;
            }
        }
        int[] iArr = new int[this.rowCount];
        int i = 0;
        for (int i2 = 0; i2 < this.rowCount; i2++) {
            iArr[i2] = i;
            if (!zArr[i2]) {
                i++;
            }
        }
        if (i == 0) {
            this.block.rows.clear();
            rebuildFromBlock();
            return true;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = this.anchorsRowMajor;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
            int iAnchorRowOf = anchorRowOf(pagetablecell);
            int iAnchorColOf = anchorColOf(pagetablecell);
            int iSpanRow = spanRow(pagetablecell);
            int iSpanCol = spanCol(pagetablecell);
            int i4 = -1;
            boolean[] zArr2 = zArr;
            int i5 = 0;
            for (int i6 = iAnchorRowOf; i6 < iAnchorRowOf + iSpanRow && i6 < this.rowCount; i6++) {
                if (!zArr2[i6]) {
                    if (i4 < 0) {
                        i4 = i6;
                    }
                    i5++;
                }
            }
            if (i4 >= 0) {
                identityHashMap.put(pagetablecell, new int[]{iArr[i4], iAnchorColOf, i5, iSpanCol});
            }
            zArr = zArr2;
        }
        rewriteBlockRows(identityHashMap, i);
        rebuildFromBlock();
        return true;
    }

    public boolean deleteColumns(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        boolean[] zArr = new boolean[this.colCount];
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < this.colCount) {
                zArr[iIntValue] = true;
            }
        }
        int[] iArr = new int[this.colCount];
        int i = 0;
        for (int i2 = 0; i2 < this.colCount; i2++) {
            iArr[i2] = i;
            if (!zArr[i2]) {
                i++;
            }
        }
        if (i == 0) {
            this.block.rows.clear();
            rebuildFromBlock();
            return true;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = this.anchorsRowMajor;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
            int iAnchorRowOf = anchorRowOf(pagetablecell);
            int iAnchorColOf = anchorColOf(pagetablecell);
            int iSpanRow = spanRow(pagetablecell);
            int iSpanCol = spanCol(pagetablecell);
            int i4 = -1;
            int i5 = 0;
            for (int i6 = iAnchorColOf; i6 < iAnchorColOf + iSpanCol && i6 < this.colCount; i6++) {
                if (!zArr[i6]) {
                    if (i4 < 0) {
                        i4 = i6;
                    }
                    i5++;
                }
            }
            if (i4 >= 0) {
                identityHashMap.put(pagetablecell, new int[]{iAnchorRowOf, iArr[i4], iSpanRow, i5});
            }
        }
        rewriteBlockRows(identityHashMap, this.rowCount);
        rebuildFromBlock();
        return true;
    }

    private void rewriteBlockRows(final IdentityHashMap identityHashMap, int i) {
        this.block.rows.clear();
        for (int i2 = 0; i2 < i; i2++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i2) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return TableModel.$r8$lambda$hUWEgK6NjEiBDVZGfV8M3mrrKHg(identityHashMap, (TL_iv.pageTableCell) obj);
                }
            }));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i4 = iArr[2];
                if (i4 <= 1) {
                    i4 = 0;
                }
                pagetablecell.rowspan = i4;
                int i5 = iArr[3];
                if (i5 <= 1) {
                    i5 = 0;
                }
                pagetablecell.colspan = i5;
                pagetablecell.flags = i4 != 0 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                pagetablecell.flags = i5 != 0 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                pagetablerow.cells.add(pagetablecell);
            }
            this.block.rows.add(pagetablerow);
        }
    }

    public static int $r8$lambda$hUWEgK6NjEiBDVZGfV8M3mrrKHg(IdentityHashMap identityHashMap, TL_iv.pageTableCell pagetablecell) {
        return ((int[]) identityHashMap.get(pagetablecell))[1];
    }

    public static void normalizeForSend(TL_iv.pageBlockTable pageblocktable) {
        if (pageblocktable == null) {
            return;
        }
        if (pageblocktable.title == null) {
            pageblocktable.title = new TL_iv.textEmpty();
        }
        if (pageblocktable.rows == null) {
            return;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            if (pagetablerow.cells != null) {
                for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i2);
                    if (pagetablecell.text == null) {
                        applyPlainText(pagetablecell, "");
                    } else {
                        pagetablecell.flags |= 128;
                    }
                    pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                    pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                }
            }
        }
    }

    public static String readPlainText(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell == null || (richText = pagetablecell.text) == null) {
            return "";
        }
        return RichTextStyle.plainOf(richText);
    }

    public static CharSequence readStyledText(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell == null || (richText = pagetablecell.text) == null) {
            return "";
        }
        return RichTextStyle.toSpannable(richText);
    }

    public static void applyPlainText(TL_iv.pageTableCell pagetablecell, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i = pagetablecell.flags;
        int i2 = i | 128;
        pagetablecell.flags = i2;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i | 130 : i2 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    public static void applyStyledText(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = RichTextStyle.fromSpannable(charSequence);
        int i = pagetablecell.flags;
        int i2 = i | 128;
        pagetablecell.flags = i2;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i | 130 : i2 & (-3);
        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
    }

    private void rebuildAnchorList() {
        this.anchorsRowMajor.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (isAnchor(i, i2) && linkedHashSet.add(this.grid[i][i2])) {
                    this.anchorsRowMajor.add(this.grid[i][i2]);
                }
            }
        }
    }

    private static TL_iv.pageTableCell[][] growCols(TL_iv.pageTableCell[][] pagetablecellArr, int i) {
        TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, i);
        for (int i2 = 0; i2 < pagetablecellArr.length; i2++) {
            TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i2];
            System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i2], 0, pagetablecellArr3.length);
        }
        return pagetablecellArr2;
    }

    private static int[][] growIntCols(int[][] iArr, int i, int i2) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr.length, i);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int[] iArr3 = iArr[i3];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i3], 0, length);
            while (length < i) {
                iArr2[i3][length] = i2;
                length++;
            }
        }
        return iArr2;
    }
}
