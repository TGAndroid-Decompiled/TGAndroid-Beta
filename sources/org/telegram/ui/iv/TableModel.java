package org.telegram.ui.iv;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.tgnet.tl.TL_iv;

public final class TableModel {
    public int[][] anchorC;
    public int[][] anchorR;
    public final ArrayList anchorsRowMajor = new ArrayList();
    public final TL_iv.pageBlockTable block;
    public int colCount;
    public TL_iv.pageTableCell[][] grid;
    public int rowCount;

    public TableModel(TL_iv.pageBlockTable pageblocktable) {
        this.block = pageblocktable;
        rebuildFromBlock();
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
        if (pagetablecell.rowspan > 1) {
            pagetablecell.flags |= 4;
        } else {
            pagetablecell.flags &= -5;
        }
    }

    public static void applyStyledText(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        pagetablecell.text = RichTextStyle.fromSpannable(charSequence);
        int i = pagetablecell.flags;
        int i2 = i | 128;
        pagetablecell.flags = i2;
        pagetablecell.flags = pagetablecell.colspan > 1 ? i | 130 : i2 & (-3);
        if (pagetablecell.rowspan > 1) {
            pagetablecell.flags |= 4;
        } else {
            pagetablecell.flags &= -5;
        }
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
        if (z2) {
            pagetablecell.flags |= 16;
        } else {
            pagetablecell.flags &= -17;
        }
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
        if (z2) {
            pagetablecell.flags |= 64;
        } else {
            pagetablecell.flags &= -65;
        }
    }

    public final int anchorColOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorC[i][i2];
                }
            }
        }
        return -1;
    }

    public final int anchorRowOf(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int i2 = 0; i2 < this.colCount; i2++) {
                if (this.grid[i][i2] == pagetablecell) {
                    return this.anchorR[i][i2];
                }
            }
        }
        return -1;
    }

    public final void rebuildFromBlock() {
        int i;
        int i2;
        int i3;
        int i4;
        TL_iv.pageBlockTable pageblocktable = this.block;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        this.rowCount = arrayList == null ? 0 : arrayList.size();
        int i5 = 0;
        int iMax = 0;
        while (true) {
            i = this.rowCount;
            if (i5 >= i) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i5);
            int i6 = 0;
            for (int i7 = 0; i7 < pagetablerow.cells.size(); i7++) {
                int i8 = pagetablerow.cells.get(i7).colspan;
                if (i8 == 0) {
                    i8 = 1;
                }
                i6 += i8;
            }
            if (i6 > iMax) {
                iMax = i6;
            }
            i5++;
        }
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i, 1), Math.max(iMax, 1));
        int[] iArr = {Math.max(this.rowCount, 1), Math.max(iMax, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(iMax, 1));
        for (int i9 = 0; i9 < iArr2.length; i9++) {
            for (int i10 = 0; i10 < iArr2[0].length; i10++) {
                iArr2[i9][i10] = -1;
                iArr3[i9][i10] = -1;
            }
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i2 = this.rowCount;
            if (i11 >= i2) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i11);
            int i13 = 0;
            int i14 = 0;
            while (i13 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i13);
                int i15 = pagetablecell.colspan;
                if (i15 == 0) {
                    i15 = 1;
                }
                int i16 = pagetablecell.rowspan;
                int i17 = i14;
                if (i16 == 0) {
                    i16 = 1;
                }
                while (i17 < iMax && pagetablecellArr[i11][i17] != null) {
                    i17++;
                }
                int i18 = i15 + i17;
                if (i18 > iMax) {
                    iMax = Math.max(i18, iMax * 2);
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, pagetablecellArr.length, iMax);
                    int i19 = 0;
                    while (i19 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i19];
                        System.arraycopy(pagetablecellArr3, 0, pagetablecellArr2[i19], 0, pagetablecellArr3.length);
                        i19++;
                        pagetablecellArr = pagetablecellArr;
                        i11 = i11;
                    }
                    i3 = i11;
                    int i20 = 0;
                    int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iArr2.length, iMax);
                    int i21 = 0;
                    while (i21 < iArr2.length) {
                        int[] iArr5 = iArr2[i21];
                        int[][] iArr6 = iArr4;
                        int length = iArr5.length;
                        int i22 = i21;
                        System.arraycopy(iArr5, i20, iArr6[i22], i20, length);
                        while (length < iMax) {
                            iArr6[i22][length] = -1;
                            length++;
                        }
                        i21 = i22 + 1;
                        iArr4 = iArr6;
                        i20 = 0;
                    }
                    int[][] iArr7 = iArr4;
                    int i23 = 0;
                    int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) cls, iArr3.length, iMax);
                    int i24 = 0;
                    while (i24 < iArr3.length) {
                        int[] iArr9 = iArr3[i24];
                        int length2 = iArr9.length;
                        int[][] iArr10 = iArr8;
                        System.arraycopy(iArr9, i23, iArr10[i24], i23, length2);
                        while (length2 < iMax) {
                            iArr10[i24][length2] = -1;
                            length2++;
                        }
                        i24++;
                        iArr8 = iArr10;
                        i23 = 0;
                    }
                    pagetablecellArr = pagetablecellArr2;
                    iArr2 = iArr7;
                    iArr3 = iArr8;
                } else {
                    i3 = i11;
                }
                for (int i25 = i3; i25 < i3 + i16 && i25 < this.rowCount; i25++) {
                    while (i4 < i18) {
                        i4 = i17;
                        pagetablecellArr[i25][i4] = pagetablecell;
                        iArr2[i25][i4] = i3;
                        iArr3[i25][i4] = i17;
                        i4++;
                    }
                    i4 = i17;
                }
                if (i18 > i12) {
                    i12 = i18;
                }
                i13++;
                i14 = i18;
                i11 = i3;
            }
            i11++;
        }
        this.colCount = i12;
        this.grid = (TL_iv.pageTableCell[][]) Array.newInstance((Class<?>) TL_iv.pageTableCell.class, Math.max(i2, 1), Math.max(this.colCount, 1));
        this.anchorR = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(this.colCount, 1));
        this.anchorC = (int[][]) Array.newInstance((Class<?>) cls, Math.max(this.rowCount, 1), Math.max(this.colCount, 1));
        for (int i26 = 0; i26 < this.rowCount; i26++) {
            for (int i27 = 0; i27 < this.colCount; i27++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.grid;
                pagetablecellArr4[i26][i27] = pagetablecellArr[i26][i27];
                this.anchorR[i26][i27] = iArr2[i26][i27];
                this.anchorC[i26][i27] = iArr3[i26][i27];
                if (pagetablecellArr4[i26][i27] == null) {
                    TL_iv.pageTableCell pagetablecell2 = new TL_iv.pageTableCell();
                    applyPlainText(pagetablecell2, "");
                    this.grid[i26][i27] = pagetablecell2;
                    this.anchorR[i26][i27] = i26;
                    this.anchorC[i26][i27] = i27;
                    pageblocktable.rows.get(i26).cells.add(pagetablecell2);
                }
            }
        }
        ArrayList arrayList2 = this.anchorsRowMajor;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i28 = 0; i28 < this.rowCount; i28++) {
            int i29 = 0;
            while (true) {
                int i30 = this.colCount;
                if (i29 < i30) {
                    if (i28 >= 0 && i29 >= 0 && i28 < this.rowCount && i29 < i30 && this.anchorR[i28][i29] == i28 && this.anchorC[i28][i29] == i29 && linkedHashSet.add(this.grid[i28][i29])) {
                        arrayList2.add(this.grid[i28][i29]);
                    }
                    i29++;
                }
            }
        }
    }

    public final void rewriteBlockRows(IdentityHashMap identityHashMap, int i) {
        TL_iv.pageBlockTable pageblocktable = this.block;
        pageblocktable.rows.clear();
        for (int i2 = 0; i2 < i; i2++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i2) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda2(identityHashMap, 0)));
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
            pageblocktable.rows.add(pagetablerow);
        }
    }
}
