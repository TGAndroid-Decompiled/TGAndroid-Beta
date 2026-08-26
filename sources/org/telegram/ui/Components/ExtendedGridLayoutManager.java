package org.telegram.ui.Components;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public class ExtendedGridLayoutManager extends GridLayoutManager {
    public int calculatedWidth;
    public int firstRowMax;
    public final SparseIntArray itemSpans;
    public final SparseIntArray itemsToRow;
    public final boolean lastRowFullWidth;
    public int lastSpanCount;
    public int rowsCount;

    public ExtendedGridLayoutManager(int i, boolean z) {
        super(i);
        this.itemSpans = new SparseIntArray();
        this.itemsToRow = new SparseIntArray();
        this.lastRowFullWidth = z;
    }

    public static Size fixSize(Size size) {
        if (size == null) {
            return null;
        }
        if (size.width == 0.0f) {
            size.width = 100.0f;
        }
        if (size.height == 0.0f) {
            size.height = 100.0f;
        }
        float f = size.width;
        float f2 = size.height;
        float f3 = f / f2;
        if (f3 <= 4.0f && f3 >= 0.2f) {
            return size;
        }
        float fMax = Math.max(f, f2);
        size.width = fMax;
        size.height = fMax;
        return size;
    }

    public final void checkLayout() {
        int i;
        int iMin;
        boolean z;
        SparseIntArray sparseIntArray = this.itemSpans;
        if (sparseIntArray.size() == getFlowItemCount() && this.calculatedWidth == this.mWidth && this.lastSpanCount == this.mSpanCount) {
            return;
        }
        int i2 = this.mWidth;
        this.calculatedWidth = i2;
        float f = i2;
        if (f == 0.0f) {
            f = 100.0f;
        }
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.itemsToRow;
        sparseIntArray2.clear();
        this.rowsCount = 0;
        this.firstRowMax = 0;
        int flowItemCount = getFlowItemCount();
        this.lastSpanCount = flowItemCount;
        if (flowItemCount == 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(100.0f);
        int i3 = this.mSpanCount;
        boolean z2 = this.lastRowFullWidth;
        int i4 = flowItemCount + (z2 ? 1 : 0);
        int i5 = i3;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Size sizeFixSize = i6 < flowItemCount ? fixSize(getSizeForItem(i6)) : null;
            if (sizeFixSize == null) {
                z = i7 != 0;
                i = iDp;
                iMin = i3;
            } else {
                i = iDp;
                iMin = Math.min(i3, (int) Math.floor((((sizeFixSize.width / sizeFixSize.height) * iDp) / f) * i3));
                boolean z3 = i5 < iMin || (iMin > 33 && i5 < iMin + (-15));
                if (sizeFixSize.full) {
                    sparseIntArray.put(i6, i5);
                    this.rowsCount++;
                    f = f;
                    i5 = i3;
                    i7 = 0;
                } else {
                    z = z3;
                }
                i6++;
                iDp = i;
                f = f;
            }
            if (z) {
                if (i5 != 0 && i7 != 0) {
                    int i8 = i5 / i7;
                    int i9 = i6 - i7;
                    int i10 = i9;
                    while (true) {
                        int i11 = i9 + i7;
                        if (i10 >= i11) {
                            break;
                        }
                        if (i10 == i11 - 1) {
                            sparseIntArray.put(i10, sparseIntArray.get(i10) + i5);
                        } else {
                            sparseIntArray.put(i10, sparseIntArray.get(i10) + i8);
                        }
                        i5 -= i8;
                        i10++;
                    }
                    sparseIntArray2.put(i6 - 1, this.rowsCount);
                }
                if (i6 == flowItemCount) {
                    break;
                }
                this.rowsCount++;
                i5 = i3;
                i7 = 0;
            } else {
                f = f;
                if (i5 < iMin) {
                    iMin = i5;
                }
            }
            if (this.rowsCount == 0) {
                this.firstRowMax = Math.max(this.firstRowMax, i6);
            }
            if (i6 == flowItemCount - 1 && !z2) {
                sparseIntArray2.put(i6, this.rowsCount);
            }
            i7++;
            i5 -= iMin;
            sparseIntArray.put(i6, iMin);
            i6++;
            iDp = i;
            f = f;
        }
        this.rowsCount++;
    }

    @Override
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 1;
    }

    @Override
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return state.getItemCount();
    }

    public Size getSizeForItem(int i) {
        return new Size(100.0f, 100.0f);
    }

    @Override
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
