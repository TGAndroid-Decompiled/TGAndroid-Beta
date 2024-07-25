package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public class ExtendedGridLayoutManager extends GridLayoutManager {
    private int calculatedWidth;
    private final boolean firstRowFullWidth;
    private int firstRowMax;
    private SparseIntArray itemSpans;
    private SparseIntArray itemsToRow;
    private final boolean lastRowFullWidth;
    private int rowsCount;

    @Override
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 1;
    }

    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

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

    private void prepareLayout(float f) {
        Size sizeForItem;
        int i;
        boolean z;
        float f2 = f == 0.0f ? 100.0f : f;
        this.itemSpans.clear();
        this.itemsToRow.clear();
        int i2 = 0;
        this.rowsCount = 0;
        this.firstRowMax = 0;
        int flowItemCount = getFlowItemCount();
        if (flowItemCount == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(100.0f);
        int spanCount = getSpanCount();
        int i3 = (this.lastRowFullWidth ? 1 : 0) + flowItemCount;
        int i4 = spanCount;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            if (i5 == 0 && this.firstRowFullWidth) {
                SparseIntArray sparseIntArray = this.itemSpans;
                sparseIntArray.put(i5, sparseIntArray.get(i5) + spanCount);
                this.itemsToRow.put(i2, this.rowsCount);
                this.rowsCount++;
                i4 = spanCount;
                i6 = 0;
            } else {
                if ((i5 < flowItemCount ? sizeForItem(i5) : null) == null) {
                    z = i6 != 0;
                    i = spanCount;
                } else {
                    int min = Math.min(spanCount, (int) Math.floor(spanCount * (((sizeForItem.width / sizeForItem.height) * dp) / f2)));
                    i = min;
                    z = i4 < min || (min > 33 && i4 < min + (-15));
                }
                if (z) {
                    if (i4 != 0) {
                        int i7 = i4 / i6;
                        int i8 = i5 - i6;
                        int i9 = i8;
                        while (true) {
                            int i10 = i8 + i6;
                            if (i9 >= i10) {
                                break;
                            }
                            if (i9 == i10 - 1) {
                                SparseIntArray sparseIntArray2 = this.itemSpans;
                                sparseIntArray2.put(i9, sparseIntArray2.get(i9) + i4);
                            } else {
                                SparseIntArray sparseIntArray3 = this.itemSpans;
                                sparseIntArray3.put(i9, sparseIntArray3.get(i9) + i7);
                            }
                            i4 -= i7;
                            i9++;
                        }
                        this.itemsToRow.put(i5 - 1, this.rowsCount);
                    }
                    if (i5 == flowItemCount) {
                        break;
                    }
                    this.rowsCount++;
                    i4 = spanCount;
                    i6 = 0;
                } else if (i4 < i) {
                    i = i4;
                }
                if (this.rowsCount == 0) {
                    this.firstRowMax = Math.max(this.firstRowMax, i5);
                }
                if (i5 == flowItemCount - 1 && !this.lastRowFullWidth) {
                    this.itemsToRow.put(i5, this.rowsCount);
                }
                i6++;
                i4 -= i;
                this.itemSpans.put(i5, i);
            }
            i5++;
            i2 = 0;
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

    protected Size getSizeForItem(int i) {
        return new Size(100.0f, 100.0f);
    }

    private void checkLayout() {
        if (this.itemSpans.size() == getFlowItemCount() && this.calculatedWidth == getWidth()) {
            return;
        }
        this.calculatedWidth = getWidth();
        prepareLayout(getWidth());
    }

    public int getSpanSizeForItem(int i) {
        checkLayout();
        return this.itemSpans.get(i);
    }

    public int getRowsCount(int i) {
        if (this.rowsCount == 0) {
            prepareLayout(i);
        }
        return this.rowsCount;
    }

    public boolean isLastInRow(int i) {
        checkLayout();
        return this.itemsToRow.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    public boolean isFirstRow(int i) {
        checkLayout();
        return i <= this.firstRowMax;
    }

    public int getFlowItemCount() {
        return getItemCount();
    }

    @Override
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return state.getItemCount();
    }
}
