package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public abstract class ExtendedGridLayoutManager extends GridLayoutManager {
    private int calculatedWidth;
    private final boolean firstRowFullWidth;
    private int firstRowMax;
    private SparseIntArray itemSpans;
    private SparseIntArray itemsToRow;
    private final boolean lastRowFullWidth;
    private int rowsCount;

    public ExtendedGridLayoutManager(Context context, int i) {
        this(context, i, false);
    }

    public ExtendedGridLayoutManager(Context context, int i, boolean z) {
        this(context, i, z, false);
    }

    public ExtendedGridLayoutManager(Context context, int i, boolean z, boolean z2) {
        super(context, i);
        this.itemSpans = new SparseIntArray();
        this.itemsToRow = new SparseIntArray();
        this.lastRowFullWidth = z;
        this.firstRowFullWidth = z2;
    }

    private void checkLayout() {
        if (this.itemSpans.size() == getFlowItemCount() && this.calculatedWidth == getWidth()) {
            return;
        }
        this.calculatedWidth = getWidth();
        prepareLayout(getWidth());
    }

    private void prepareLayout(float f) {
        int min;
        boolean z;
        float f2 = f == 0.0f ? 100.0f : f;
        this.itemSpans.clear();
        this.itemsToRow.clear();
        int i = 0;
        this.rowsCount = 0;
        this.firstRowMax = 0;
        int flowItemCount = getFlowItemCount();
        if (flowItemCount == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(100.0f);
        int spanCount = getSpanCount();
        int i2 = (this.lastRowFullWidth ? 1 : 0) + flowItemCount;
        int i3 = spanCount;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (i4 == 0 && this.firstRowFullWidth) {
                SparseIntArray sparseIntArray = this.itemSpans;
                sparseIntArray.put(i4, sparseIntArray.get(i4) + spanCount);
                this.itemsToRow.put(i, this.rowsCount);
            } else {
                Size sizeForItem = i4 < flowItemCount ? sizeForItem(i4) : null;
                if (sizeForItem == null) {
                    z = i5 != 0;
                    min = spanCount;
                } else {
                    min = Math.min(spanCount, (int) Math.floor(spanCount * (((sizeForItem.width / sizeForItem.height) * dp) / f2)));
                    boolean z2 = i3 < min || (min > 33 && i3 < min + (-15));
                    if (sizeForItem.full) {
                        this.itemSpans.put(i4, i3);
                    } else {
                        z = z2;
                    }
                }
                if (z) {
                    if (i3 != 0 && i5 != 0) {
                        int i6 = i3 / i5;
                        int i7 = i4 - i5;
                        int i8 = i7;
                        while (true) {
                            int i9 = i7 + i5;
                            if (i8 >= i9) {
                                break;
                            }
                            if (i8 == i9 - 1) {
                                SparseIntArray sparseIntArray2 = this.itemSpans;
                                sparseIntArray2.put(i8, sparseIntArray2.get(i8) + i3);
                            } else {
                                SparseIntArray sparseIntArray3 = this.itemSpans;
                                sparseIntArray3.put(i8, sparseIntArray3.get(i8) + i6);
                            }
                            i3 -= i6;
                            i8++;
                        }
                        this.itemsToRow.put(i4 - 1, this.rowsCount);
                    }
                    if (i4 == flowItemCount) {
                        break;
                    }
                    this.rowsCount++;
                    i3 = spanCount;
                    i5 = 0;
                } else if (i3 < min) {
                    min = i3;
                }
                if (this.rowsCount == 0) {
                    this.firstRowMax = Math.max(this.firstRowMax, i4);
                }
                if (i4 == flowItemCount - 1 && !this.lastRowFullWidth) {
                    this.itemsToRow.put(i4, this.rowsCount);
                }
                i5++;
                i3 -= min;
                this.itemSpans.put(i4, min);
                i4++;
                i = 0;
            }
            this.rowsCount++;
            i3 = spanCount;
            i5 = 0;
            i4++;
            i = 0;
        }
        this.rowsCount++;
    }

    private Size sizeForItem(int i) {
        return fixSize(getSizeForItem(i));
    }

    public Size fixSize(Size size) {
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
        if (f3 > 4.0f || f3 < 0.2f) {
            float max = Math.max(f, f2);
            size.width = max;
            size.height = max;
        }
        return size;
    }

    @Override
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 1;
    }

    public int getFlowItemCount() {
        return getItemCount();
    }

    @Override
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return state.getItemCount();
    }

    public int getRowsCount(int i) {
        if (this.rowsCount == 0) {
            prepareLayout(i);
        }
        return this.rowsCount;
    }

    protected abstract Size getSizeForItem(int i);

    public int getSpanSizeForItem(int i) {
        checkLayout();
        return this.itemSpans.get(i);
    }

    public boolean isFirstRow(int i) {
        checkLayout();
        return i <= this.firstRowMax;
    }

    public boolean isLastInRow(int i) {
        checkLayout();
        return this.itemsToRow.get(i, Integer.MAX_VALUE) != Integer.MAX_VALUE;
    }

    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
