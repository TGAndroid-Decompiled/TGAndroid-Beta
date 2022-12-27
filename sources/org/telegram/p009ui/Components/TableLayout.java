package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ArticleViewer;
import org.telegram.p009ui.Cells.TextSelectionHelper;
import org.telegram.tgnet.TLRPC$TL_pageTableCell;

public class TableLayout extends View {
    public static final Alignment BASELINE;
    public static final Alignment END;
    public static final Alignment FILL;
    private static final Alignment LEADING;
    public static final Alignment START;
    private static final Alignment TRAILING;
    static final Alignment UNDEFINED_ALIGNMENT = new Alignment() {
        @Override
        public int getAlignmentValue(Child child, int i) {
            return Integer.MIN_VALUE;
        }

        @Override
        int getGravityOffset(Child child, int i) {
            return Integer.MIN_VALUE;
        }
    };
    private Path backgroundPath;
    private ArrayList<Child> cellsToFixHeight;
    private ArrayList<Child> childrens;
    private int colCount;
    private TableLayoutDelegate delegate;
    private boolean drawLines;
    private boolean isRtl;
    private boolean isStriped;
    private int itemPaddingLeft;
    private int itemPaddingTop;
    private int mAlignmentMode;
    private int mDefaultGap;
    private final Axis mHorizontalAxis;
    private int mLastLayoutParamsHashCode;
    private int mOrientation;
    private boolean mUseDefaultMargins;
    private final Axis mVerticalAxis;
    private float[] radii;
    private RectF rect;
    private ArrayList<Point> rowSpans;
    private TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;

    public interface TableLayoutDelegate {
        ArticleViewer.DrawingText createTextLayout(TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell, int i);

        Paint getHeaderPaint();

        Paint getLinePaint();

        Paint getStripPaint();

        void onLayoutChild(ArticleViewer.DrawingText drawingText, int i, int i2);
    }

    static boolean canStretch(int i) {
        return (i & 2) != 0;
    }

    public class Child {
        private TLRPC$TL_pageTableCell cell;
        private int fixedHeight;
        private int index;
        private LayoutParams layoutParams;
        private int measuredHeight;
        private int measuredWidth;
        public int rowspan;
        private int selectionIndex = -1;
        public int textHeight;
        public ArticleViewer.DrawingText textLayout;
        public int textLeft;
        public int textWidth;
        public int textX;
        public int textY;
        public int f1147x;
        public int f1148y;

        static int access$1520(Child child, int i) {
            int i2 = child.measuredHeight - i;
            child.measuredHeight = i2;
            return i2;
        }

        public Child(int i) {
            this.index = i;
        }

        public LayoutParams getLayoutParams() {
            return this.layoutParams;
        }

        public int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public void measure(int r2, int r3, boolean r4) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.TableLayout.Child.measure(int, int, boolean):void");
        }

        public void setTextLayout(ArticleViewer.DrawingText drawingText) {
            this.textLayout = drawingText;
            int i = 0;
            if (drawingText != null) {
                this.textWidth = 0;
                this.textLeft = 0;
                int lineCount = drawingText.getLineCount();
                while (i < lineCount) {
                    float lineLeft = drawingText.getLineLeft(i);
                    this.textLeft = i == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.textLeft, (int) Math.ceil(lineLeft));
                    this.textWidth = (int) Math.ceil(Math.max(drawingText.getLineWidth(i), this.textWidth));
                    i++;
                }
                this.textHeight = drawingText.getHeight();
                return;
            }
            this.textLeft = 0;
            this.textWidth = 0;
            this.textHeight = 0;
        }

        public void layout(int i, int i2, int i3, int i4) {
            this.f1147x = i;
            this.f1148y = i2;
        }

        public int getTextX() {
            return this.f1147x + this.textX;
        }

        public int getTextY() {
            return this.f1148y + this.textY;
        }

        public void setFixedHeight(int i) {
            int i2 = this.fixedHeight;
            this.measuredHeight = i2;
            TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = this.cell;
            if (tLRPC$TL_pageTableCell.valign_middle) {
                this.textY = (i2 - this.textHeight) / 2;
            } else if (tLRPC$TL_pageTableCell.valign_bottom) {
                this.textY = (i2 - this.textHeight) - TableLayout.this.itemPaddingTop;
            }
        }

        public void draw(Canvas canvas, View view) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            float f;
            float f2;
            int i9;
            if (this.cell == null) {
                return;
            }
            boolean z = false;
            boolean z2 = true;
            boolean z3 = this.f1147x + this.measuredWidth == TableLayout.this.getMeasuredWidth();
            boolean z4 = this.f1148y + this.measuredHeight == TableLayout.this.getMeasuredHeight();
            int m36dp = AndroidUtilities.m36dp(3.0f);
            if (this.cell.header || (TableLayout.this.isStriped && this.layoutParams.rowSpec.span.min % 2 == 0)) {
                if (this.f1147x != 0 || this.f1148y != 0) {
                    float[] fArr = TableLayout.this.radii;
                    TableLayout.this.radii[1] = 0.0f;
                    fArr[0] = 0.0f;
                } else {
                    float[] fArr2 = TableLayout.this.radii;
                    float f3 = m36dp;
                    TableLayout.this.radii[1] = f3;
                    fArr2[0] = f3;
                    z = true;
                }
                if (!z3 || this.f1148y != 0) {
                    float[] fArr3 = TableLayout.this.radii;
                    TableLayout.this.radii[3] = 0.0f;
                    fArr3[2] = 0.0f;
                } else {
                    float[] fArr4 = TableLayout.this.radii;
                    float f4 = m36dp;
                    TableLayout.this.radii[3] = f4;
                    fArr4[2] = f4;
                    z = true;
                }
                if (!z3 || !z4) {
                    float[] fArr5 = TableLayout.this.radii;
                    TableLayout.this.radii[5] = 0.0f;
                    fArr5[4] = 0.0f;
                } else {
                    float[] fArr6 = TableLayout.this.radii;
                    float f5 = m36dp;
                    TableLayout.this.radii[5] = f5;
                    fArr6[4] = f5;
                    z = true;
                }
                if (this.f1147x != 0 || !z4) {
                    float[] fArr7 = TableLayout.this.radii;
                    TableLayout.this.radii[7] = 0.0f;
                    fArr7[6] = 0.0f;
                    z2 = z;
                } else {
                    float[] fArr8 = TableLayout.this.radii;
                    float f6 = m36dp;
                    TableLayout.this.radii[7] = f6;
                    fArr8[6] = f6;
                }
                if (z2) {
                    TableLayout.this.rect.set(this.f1147x, this.f1148y, i5 + this.measuredWidth, i6 + this.measuredHeight);
                    TableLayout.this.backgroundPath.reset();
                    TableLayout.this.backgroundPath.addRoundRect(TableLayout.this.rect, TableLayout.this.radii, Path.Direction.CW);
                    if (this.cell.header) {
                        canvas.drawPath(TableLayout.this.backgroundPath, TableLayout.this.delegate.getHeaderPaint());
                    } else {
                        canvas.drawPath(TableLayout.this.backgroundPath, TableLayout.this.delegate.getStripPaint());
                    }
                } else if (this.cell.header) {
                    canvas.drawRect(this.f1147x, this.f1148y, i3 + this.measuredWidth, i4 + this.measuredHeight, TableLayout.this.delegate.getHeaderPaint());
                } else {
                    canvas.drawRect(this.f1147x, this.f1148y, i + this.measuredWidth, i2 + this.measuredHeight, TableLayout.this.delegate.getStripPaint());
                }
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(getTextX(), getTextY());
                if (this.selectionIndex >= 0) {
                    TableLayout.this.textSelectionHelper.draw(canvas, (TextSelectionHelper.ArticleSelectableView) TableLayout.this.getParent().getParent(), this.selectionIndex);
                }
                this.textLayout.draw(canvas, view);
                canvas.restore();
            }
            if (TableLayout.this.drawLines) {
                Paint linePaint = TableLayout.this.delegate.getLinePaint();
                Paint linePaint2 = TableLayout.this.delegate.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i10 = this.f1147x;
                if (i10 == 0) {
                    int i11 = this.f1148y;
                    float f7 = i11;
                    float f8 = this.measuredHeight + i11;
                    if (i11 == 0) {
                        f7 += m36dp;
                    }
                    float f9 = f7;
                    if (f8 == TableLayout.this.getMeasuredHeight()) {
                        f8 -= m36dp;
                    }
                    int i12 = this.f1147x;
                    canvas.drawLine(i12 + strokeWidth, f9, i12 + strokeWidth, f8, linePaint);
                } else {
                    canvas.drawLine(i10 - strokeWidth2, this.f1148y, i10 - strokeWidth2, i7 + this.measuredHeight, linePaint2);
                }
                int i13 = this.f1148y;
                if (i13 == 0) {
                    int i14 = this.f1147x;
                    float f10 = i14;
                    float f11 = this.measuredWidth + i14;
                    if (i14 == 0) {
                        f10 += m36dp;
                    }
                    float f12 = f10;
                    if (f11 == TableLayout.this.getMeasuredWidth()) {
                        f11 -= m36dp;
                    }
                    int i15 = this.f1148y;
                    canvas.drawLine(f12, i15 + strokeWidth, f11, i15 + strokeWidth, linePaint);
                } else {
                    canvas.drawLine(this.f1147x, i13 - strokeWidth2, i8 + this.measuredWidth, i13 - strokeWidth2, linePaint2);
                }
                float f13 = (z3 && (i9 = this.f1148y) == 0) ? i9 + m36dp : this.f1148y - strokeWidth;
                if (z3 && z4) {
                    f = (this.f1148y + this.measuredHeight) - m36dp;
                } else {
                    f = (this.f1148y + this.measuredHeight) - strokeWidth;
                }
                float f14 = f;
                int i16 = this.f1147x;
                int i17 = this.measuredWidth;
                canvas.drawLine((i16 + i17) - strokeWidth, f13, (i16 + i17) - strokeWidth, f14, linePaint);
                int i18 = this.f1147x;
                float f15 = (i18 == 0 && z4) ? i18 + m36dp : i18 - strokeWidth;
                if (z3 && z4) {
                    f2 = (i18 + this.measuredWidth) - m36dp;
                } else {
                    f2 = (i18 + this.measuredWidth) - strokeWidth;
                }
                float f16 = f2;
                int i19 = this.f1148y;
                int i20 = this.measuredHeight;
                canvas.drawLine(f15, (i19 + i20) - strokeWidth, f16, (i19 + i20) - strokeWidth, linePaint);
                if (this.f1147x == 0 && this.f1148y == 0) {
                    RectF rectF = TableLayout.this.rect;
                    int i21 = this.f1147x;
                    int i22 = this.f1148y;
                    float f17 = m36dp * 2;
                    rectF.set(i21 + strokeWidth, i22 + strokeWidth, i21 + strokeWidth + f17, i22 + strokeWidth + f17);
                    canvas.drawArc(TableLayout.this.rect, -180.0f, 90.0f, false, linePaint);
                }
                if (z3 && this.f1148y == 0) {
                    RectF rectF2 = TableLayout.this.rect;
                    int i23 = this.f1147x;
                    int i24 = this.measuredWidth;
                    float f18 = m36dp * 2;
                    int i25 = this.f1148y;
                    rectF2.set(((i23 + i24) - strokeWidth) - f18, i25 + strokeWidth, (i23 + i24) - strokeWidth, i25 + strokeWidth + f18);
                    canvas.drawArc(TableLayout.this.rect, 0.0f, -90.0f, false, linePaint);
                }
                if (this.f1147x == 0 && z4) {
                    RectF rectF3 = TableLayout.this.rect;
                    int i26 = this.f1147x;
                    int i27 = this.f1148y;
                    int i28 = this.measuredHeight;
                    float f19 = m36dp * 2;
                    rectF3.set(i26 + strokeWidth, ((i27 + i28) - strokeWidth) - f19, i26 + strokeWidth + f19, (i27 + i28) - strokeWidth);
                    canvas.drawArc(TableLayout.this.rect, 180.0f, -90.0f, false, linePaint);
                }
                if (z3 && z4) {
                    RectF rectF4 = TableLayout.this.rect;
                    int i29 = this.f1147x;
                    int i30 = this.measuredWidth;
                    float f20 = m36dp * 2;
                    int i31 = this.f1148y;
                    int i32 = this.measuredHeight;
                    rectF4.set(((i29 + i30) - strokeWidth) - f20, ((i31 + i32) - strokeWidth) - f20, (i29 + i30) - strokeWidth, (i31 + i32) - strokeWidth);
                    canvas.drawArc(TableLayout.this.rect, 0.0f, 90.0f, false, linePaint);
                }
            }
        }

        public void setSelectionIndex(int i) {
            this.selectionIndex = i;
        }

        public int getRow() {
            return this.rowspan + 10;
        }
    }

    public void addChild(int i, int i2, int i3, int i4) {
        Child child = new Child(this.childrens.size());
        LayoutParams layoutParams = new LayoutParams();
        Interval interval = new Interval(i2, i2 + i4);
        Alignment alignment = FILL;
        layoutParams.rowSpec = new Spec(false, interval, alignment, 0.0f);
        layoutParams.columnSpec = new Spec(false, new Interval(i, i + i3), alignment, 0.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        this.childrens.add(child);
        invalidateStructure();
    }

    public void addChild(TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell, int i, int i2, int i3) {
        int i4 = i3 == 0 ? 1 : i3;
        Child child = new Child(this.childrens.size());
        child.cell = tLRPC$TL_pageTableCell;
        LayoutParams layoutParams = new LayoutParams();
        int i5 = tLRPC$TL_pageTableCell.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        Interval interval = new Interval(i2, i5 + i2);
        Alignment alignment = FILL;
        layoutParams.rowSpec = new Spec(false, interval, alignment, 0.0f);
        layoutParams.columnSpec = new Spec(false, new Interval(i, i4 + i), alignment, 1.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        this.childrens.add(child);
        int i6 = tLRPC$TL_pageTableCell.rowspan;
        if (i6 > 1) {
            this.rowSpans.add(new Point(i2, i6 + i2));
        }
        invalidateStructure();
    }

    public void setDrawLines(boolean z) {
        this.drawLines = z;
    }

    public void setStriped(boolean z) {
        this.isStriped = z;
    }

    public void setRtl(boolean z) {
        this.isRtl = z;
    }

    public void removeAllChildrens() {
        this.childrens.clear();
        this.rowSpans.clear();
        invalidateStructure();
    }

    public int getChildCount() {
        return this.childrens.size();
    }

    public Child getChildAt(int i) {
        if (i < 0 || i >= this.childrens.size()) {
            return null;
        }
        return this.childrens.get(i);
    }

    public TableLayout(Context context, TableLayoutDelegate tableLayoutDelegate, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper) {
        super(context);
        this.mHorizontalAxis = new Axis(true);
        this.mVerticalAxis = new Axis(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.itemPaddingTop = AndroidUtilities.m36dp(7.0f);
        this.itemPaddingLeft = AndroidUtilities.m36dp(8.0f);
        this.cellsToFixHeight = new ArrayList<>();
        this.rowSpans = new ArrayList<>();
        new Path();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.childrens = new ArrayList<>();
        this.textSelectionHelper = articleTextSelectionHelper;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.delegate = tableLayoutDelegate;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public int getRowCount() {
        return this.mVerticalAxis.getCount();
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.getCount();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.mVerticalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.mHorizontalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    static int max2(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    static <T> T[] append(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    private int getDefaultMargin(Child child, boolean z, boolean z2) {
        return this.mDefaultGap / 2;
    }

    private int getDefaultMargin(Child child, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(child, z2, z3);
    }

    private int getDefaultMargin(Child child, LayoutParams layoutParams, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.mUseDefaultMargins) {
            Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
            Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
            Interval interval = spec.span;
            if (!((z && this.isRtl) != z2) ? interval.max == axis.getCount() : interval.min == 0) {
                z3 = true;
            }
            return getDefaultMargin(child, z3, z, z2);
        }
        return 0;
    }

    int getMargin1(Child child, boolean z, boolean z2) {
        int i;
        LayoutParams layoutParams = child.getLayoutParams();
        if (z) {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i == Integer.MIN_VALUE ? getDefaultMargin(child, layoutParams, z, z2) : i;
    }

    private int getMargin(Child child, boolean z, boolean z2) {
        if (this.mAlignmentMode == 1) {
            return getMargin1(child, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        int[] leadingMargins = z2 ? axis.getLeadingMargins() : axis.getTrailingMargins();
        LayoutParams layoutParams = child.getLayoutParams();
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        return leadingMargins[z2 ? interval.min : interval.max];
    }

    private int getTotalMargin(Child child, boolean z) {
        return getMargin(child, z, true) + getMargin(child, z, false);
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new Interval(i, i2 + i));
        layoutParams.setColumnSpecSpan(new Interval(i3, i4 + i3));
    }

    private static int clip(Interval interval, boolean z, int i) {
        int size = interval.size();
        if (i == 0) {
            return size;
        }
        return Math.min(size, i - (z ? Math.min(interval.min, i) : 0));
    }

    private void validateLayoutParams() {
        boolean z = this.mOrientation == 0;
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
            Spec spec = z ? layoutParams.rowSpec : layoutParams.columnSpec;
            Interval interval = spec.span;
            boolean z2 = spec.startDefined;
            int size = interval.size();
            if (z2) {
                i2 = interval.min;
            }
            Spec spec2 = z ? layoutParams.columnSpec : layoutParams.rowSpec;
            Interval interval2 = spec2.span;
            boolean z3 = spec2.startDefined;
            int clip = clip(interval2, z3, i);
            if (z3) {
                i3 = interval2.min;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i5 = i3 + clip;
                        if (fits(iArr, i2, i3, i5)) {
                            break;
                        } else if (z3) {
                            i2++;
                        } else if (i5 <= i) {
                            i3++;
                        } else {
                            i2++;
                            i3 = 0;
                        }
                    }
                }
                procrusteanFill(iArr, i3, i3 + clip, i2 + size);
            }
            if (z) {
                setCellGroup(layoutParams, i2, size, i3, clip);
            } else {
                setCellGroup(layoutParams, i3, clip, i2, size);
            }
            i3 += clip;
        }
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        this.mHorizontalAxis.invalidateStructure();
        this.mVerticalAxis.invalidateStructure();
        invalidateValues();
    }

    private void invalidateValues() {
        Axis axis = this.mHorizontalAxis;
        if (axis == null || this.mVerticalAxis == null) {
            return;
        }
        axis.invalidateValues();
        this.mVerticalAxis.invalidateValues();
    }

    public static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).draw(canvas, this);
        }
    }

    private int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            i = (i * 31) + getChildAt(i2).getLayoutParams().hashCode();
        }
        return i;
    }

    private void consistencyCheck() {
        int i = this.mLastLayoutParamsHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
        } else if (i != computeLayoutParamsHashCode()) {
            invalidateStructure();
            consistencyCheck();
        }
    }

    private void measureChildWithMargins2(Child child, int i, int i2, int i3, int i4, boolean z) {
        child.measure(getTotalMargin(child, true) + i3, getTotalMargin(child, false) + i4, z);
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Child childAt = getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (z) {
                int size = View.MeasureSpec.getSize(i);
                childAt.setTextLayout(this.delegate.createTextLayout(childAt.cell, this.colCount == 2 ? ((int) (size / 2.0f)) - (this.itemPaddingLeft * 4) : (int) (size / 1.5f)));
                if (childAt.textLayout != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = childAt.textWidth + (this.itemPaddingLeft * 2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = childAt.textHeight + (this.itemPaddingTop * 2);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                }
                measureChildWithMargins2(childAt, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).width, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
            } else {
                boolean z2 = this.mOrientation == 0;
                Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                if (spec.getAbsoluteAlignment(z2) == FILL) {
                    Interval interval = spec.span;
                    int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                    int totalMargin = (locations[interval.max] - locations[interval.min]) - getTotalMargin(childAt, z2);
                    if (z2) {
                        measureChildWithMargins2(childAt, i, i2, totalMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    } else {
                        measureChildWithMargins2(childAt, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).width, totalMargin, false);
                    }
                }
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int measure;
        int i3;
        boolean z;
        boolean z2;
        consistencyCheck();
        invalidateValues();
        boolean z3 = false;
        this.colCount = 0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            this.colCount = Math.max(this.colCount, getChildAt(i4).layoutParams.columnSpec.span.max);
        }
        boolean z4 = true;
        measureChildrenWithMargins(i, i2, true);
        if (this.mOrientation == 0) {
            measure = this.mHorizontalAxis.getMeasure(i);
            measureChildrenWithMargins(i, i2, false);
            i3 = this.mVerticalAxis.getMeasure(i2);
        } else {
            int measure2 = this.mVerticalAxis.getMeasure(i2);
            measureChildrenWithMargins(i, i2, false);
            measure = this.mHorizontalAxis.getMeasure(i);
            i3 = measure2;
        }
        int max = Math.max(measure, View.MeasureSpec.getSize(i));
        int max2 = Math.max(i3, getSuggestedMinimumHeight());
        setMeasuredDimension(max, max2);
        this.mHorizontalAxis.layout(max);
        this.mVerticalAxis.layout(max2);
        int[] locations = this.mHorizontalAxis.getLocations();
        int[] locations2 = this.mVerticalAxis.getLocations();
        this.cellsToFixHeight.clear();
        int i5 = locations[locations.length - 1];
        int childCount2 = getChildCount();
        int i6 = 0;
        while (i6 < childCount2) {
            Child childAt = getChildAt(i6);
            LayoutParams layoutParams = childAt.getLayoutParams();
            Spec spec = layoutParams.columnSpec;
            Spec spec2 = layoutParams.rowSpec;
            Interval interval = spec.span;
            Interval interval2 = spec2.span;
            int i7 = locations[interval.min];
            int i8 = locations2[interval2.min];
            int i9 = locations[interval.max] - i7;
            int i10 = locations2[interval2.max] - i8;
            int measurement = getMeasurement(childAt, z4);
            int measurement2 = getMeasurement(childAt, z3);
            Alignment absoluteAlignment = spec.getAbsoluteAlignment(z4);
            Alignment absoluteAlignment2 = spec2.getAbsoluteAlignment(z3);
            Bounds value = this.mHorizontalAxis.getGroupBounds().getValue(i6);
            Bounds value2 = this.mVerticalAxis.getGroupBounds().getValue(i6);
            int gravityOffset = absoluteAlignment.getGravityOffset(childAt, i9 - value.size(z4));
            int gravityOffset2 = absoluteAlignment2.getGravityOffset(childAt, i10 - value2.size(z4));
            int margin = getMargin(childAt, z4, z4);
            int margin2 = getMargin(childAt, false, z4);
            int margin3 = getMargin(childAt, z4, false);
            int i11 = margin + margin3;
            int margin4 = margin2 + getMargin(childAt, false, false);
            int i12 = max2;
            int offset = value.getOffset(this, childAt, absoluteAlignment, measurement + i11, true);
            int offset2 = value2.getOffset(this, childAt, absoluteAlignment2, measurement2 + margin4, false);
            int sizeInCell = absoluteAlignment.getSizeInCell(childAt, measurement, i9 - i11);
            int sizeInCell2 = absoluteAlignment2.getSizeInCell(childAt, measurement2, i10 - margin4);
            int i13 = i7 + gravityOffset + offset;
            int i14 = !this.isRtl ? margin + i13 : ((i5 - sizeInCell) - margin3) - i13;
            int i15 = i8 + gravityOffset2 + offset2 + margin2;
            if (childAt.cell != null) {
                if (sizeInCell != childAt.getMeasuredWidth() || sizeInCell2 != childAt.getMeasuredHeight()) {
                    childAt.measure(sizeInCell, sizeInCell2, false);
                }
                if (childAt.fixedHeight != 0 && childAt.fixedHeight != sizeInCell2 && childAt.layoutParams.rowSpec.span.max - childAt.layoutParams.rowSpec.span.min <= 1) {
                    int size = this.rowSpans.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            z2 = false;
                            break;
                        }
                        Point point = this.rowSpans.get(i16);
                        if (point.f1103x <= childAt.layoutParams.rowSpec.span.min && point.f1104y > childAt.layoutParams.rowSpec.span.min) {
                            z2 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z2) {
                        this.cellsToFixHeight.add(childAt);
                    }
                }
            }
            childAt.layout(i14, i15, sizeInCell + i14, sizeInCell2 + i15);
            i6++;
            max2 = i12;
            z3 = false;
            z4 = true;
        }
        int size2 = this.cellsToFixHeight.size();
        int i17 = 0;
        while (i17 < size2) {
            Child child = this.cellsToFixHeight.get(i17);
            int i18 = child.measuredHeight - child.fixedHeight;
            int size3 = this.childrens.size();
            for (int i19 = child.index + 1; i19 < size3; i19++) {
                Child child2 = this.childrens.get(i19);
                if (child.layoutParams.rowSpec.span.min != child2.layoutParams.rowSpec.span.min) {
                    break;
                } else if (child.fixedHeight < child2.fixedHeight) {
                    z = true;
                    break;
                } else {
                    int i20 = child2.measuredHeight - child2.fixedHeight;
                    if (i20 > 0) {
                        i18 = Math.min(i18, i20);
                    }
                }
            }
            z = false;
            if (!z) {
                int i21 = child.index - 1;
                while (true) {
                    if (i21 < 0) {
                        break;
                    }
                    Child child3 = this.childrens.get(i21);
                    if (child.layoutParams.rowSpec.span.min != child3.layoutParams.rowSpec.span.min) {
                        break;
                    } else if (child.fixedHeight < child3.fixedHeight) {
                        z = true;
                        break;
                    } else {
                        int i22 = child3.measuredHeight - child3.fixedHeight;
                        if (i22 > 0) {
                            i18 = Math.min(i18, i22);
                        }
                        i21--;
                    }
                }
            }
            if (!z) {
                child.setFixedHeight(child.fixedHeight);
                max2 -= i18;
                int size4 = this.childrens.size();
                int i23 = i17;
                for (int i24 = 0; i24 < size4; i24++) {
                    Child child4 = this.childrens.get(i24);
                    if (child != child4) {
                        if (child.layoutParams.rowSpec.span.min == child4.layoutParams.rowSpec.span.min) {
                            if (child4.fixedHeight != child4.measuredHeight) {
                                this.cellsToFixHeight.remove(child4);
                                if (child4.index < child.index) {
                                    i23--;
                                }
                                size2--;
                            }
                            Child.access$1520(child4, i18);
                            child4.measure(child4.measuredWidth, child4.measuredHeight, true);
                        } else if (child.layoutParams.rowSpec.span.min < child4.layoutParams.rowSpec.span.min) {
                            child4.f1148y -= i18;
                        }
                    }
                }
                i17 = i23;
            }
            i17++;
        }
        int childCount3 = getChildCount();
        for (int i25 = 0; i25 < childCount3; i25++) {
            Child childAt2 = getChildAt(i25);
            this.delegate.onLayoutChild(childAt2.textLayout, childAt2.getTextX(), childAt2.getTextY());
        }
        setMeasuredDimension(i5, max2);
    }

    private int getMeasurement(Child child, boolean z) {
        return z ? child.getMeasuredWidth() : child.getMeasuredHeight();
    }

    final int getMeasurementIncludingMargin(Child child, boolean z) {
        return getMeasurement(child, z) + getTotalMargin(child, z);
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
        invalidateValues();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        consistencyCheck();
    }

    public final class Axis {
        public Arc[] arcs;
        public boolean arcsValid;
        PackedMap<Interval, MutableInt> backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount;
        public int[] deltas;
        PackedMap<Interval, MutableInt> forwardLinks;
        public boolean forwardLinksValid;
        PackedMap<Spec, Bounds> groupBounds;
        public boolean groupBoundsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public final boolean horizontal;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] locations;
        public boolean locationsValid;
        private int maxIndex;
        boolean orderPreserved;
        private MutableInt parentMax;
        private MutableInt parentMin;
        public int[] trailingMargins;
        public boolean trailingMarginsValid;

        private Axis(boolean z) {
            this.definedCount = Integer.MIN_VALUE;
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
            this.hasWeightsValid = false;
            this.orderPreserved = true;
            this.parentMin = new MutableInt(0);
            this.parentMax = new MutableInt(-100000);
            this.horizontal = z;
        }

        private int calculateMaxIndex() {
            int childCount = TableLayout.this.getChildCount();
            int i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i2).getLayoutParams();
                Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                i = Math.max(Math.max(Math.max(i, interval.min), interval.max), interval.size());
            }
            if (i == -1) {
                return Integer.MIN_VALUE;
            }
            return i;
        }

        private int getMaxIndex() {
            if (this.maxIndex == Integer.MIN_VALUE) {
                this.maxIndex = Math.max(0, calculateMaxIndex());
            }
            return this.maxIndex;
        }

        public int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public void setCount(int i) {
            if (i != Integer.MIN_VALUE && i < getMaxIndex()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.horizontal ? "column" : "row");
                sb.append("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
                TableLayout.handleInvalidParams(sb.toString());
            }
            this.definedCount = i;
        }

        public void setOrderPreserved(boolean z) {
            this.orderPreserved = z;
            invalidateStructure();
        }

        private PackedMap<Spec, Bounds> createGroupBounds() {
            Assoc m12of = Assoc.m12of(Spec.class, Bounds.class);
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                boolean z = this.horizontal;
                Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                m12of.put(spec, spec.getAbsoluteAlignment(z).getBounds());
            }
            return m12of.pack();
        }

        private void computeGroupBounds() {
            for (Bounds bounds : this.groupBounds.values) {
                bounds.reset();
            }
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z = this.horizontal;
                Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                this.groupBounds.getValue(i).include(TableLayout.this, childAt, spec, this, TableLayout.this.getMeasurementIncludingMargin(childAt, z) + (spec.weight == 0.0f ? 0 : this.deltas[i]));
            }
        }

        public PackedMap<Spec, Bounds> getGroupBounds() {
            if (this.groupBounds == null) {
                this.groupBounds = createGroupBounds();
            }
            if (!this.groupBoundsValid) {
                computeGroupBounds();
                this.groupBoundsValid = true;
            }
            return this.groupBounds;
        }

        private PackedMap<Interval, MutableInt> createLinks(boolean z) {
            Assoc m12of = Assoc.m12of(Interval.class, MutableInt.class);
            Spec[] specArr = getGroupBounds().keys;
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                m12of.put(z ? specArr[i].span : specArr[i].span.inverse(), new MutableInt());
            }
            return m12of.pack();
        }

        private void computeLinks(PackedMap<Interval, MutableInt> packedMap, boolean z) {
            for (MutableInt mutableInt : packedMap.values) {
                mutableInt.reset();
            }
            Bounds[] boundsArr = getGroupBounds().values;
            for (int i = 0; i < boundsArr.length; i++) {
                int size = boundsArr[i].size(z);
                MutableInt value = packedMap.getValue(i);
                int i2 = value.value;
                if (!z) {
                    size = -size;
                }
                value.value = Math.max(i2, size);
            }
        }

        private PackedMap<Interval, MutableInt> getForwardLinks() {
            if (this.forwardLinks == null) {
                this.forwardLinks = createLinks(true);
            }
            if (!this.forwardLinksValid) {
                computeLinks(this.forwardLinks, true);
                this.forwardLinksValid = true;
            }
            return this.forwardLinks;
        }

        private PackedMap<Interval, MutableInt> getBackwardLinks() {
            if (this.backwardLinks == null) {
                this.backwardLinks = createLinks(false);
            }
            if (!this.backwardLinksValid) {
                computeLinks(this.backwardLinks, false);
                this.backwardLinksValid = true;
            }
            return this.backwardLinks;
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() == 0) {
                return;
            }
            if (z) {
                for (Arc arc : list) {
                    if (arc.span.equals(interval)) {
                        return;
                    }
                }
            }
            list.add(new Arc(interval, mutableInt));
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt) {
            include(list, interval, mutableInt, true);
        }

        Arc[][] groupArcsByFirstVertex(Arc[] arcArr) {
            int count = getCount() + 1;
            Arc[][] arcArr2 = new Arc[count];
            int[] iArr = new int[count];
            for (Arc arc : arcArr) {
                int i = arc.span.min;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < count; i2++) {
                arcArr2[i2] = new Arc[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (Arc arc2 : arcArr) {
                int i3 = arc2.span.min;
                Arc[] arcArr3 = arcArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                arcArr3[i4] = arc2;
            }
            return arcArr2;
        }

        private Arc[] topologicalSort(Arc[] arcArr) {
            return new Object(arcArr) {
                Arc[][] arcsByVertex;
                int cursor;
                Arc[] result;
                final Arc[] val$arcs;
                int[] visited;

                {
                    this.val$arcs = arcArr;
                    Arc[] arcArr2 = new Arc[arcArr.length];
                    this.result = arcArr2;
                    this.cursor = arcArr2.length - 1;
                    this.arcsByVertex = Axis.this.groupArcsByFirstVertex(arcArr);
                    this.visited = new int[Axis.this.getCount() + 1];
                }

                void walk(int i) {
                    Arc[] arcArr2;
                    int[] iArr = this.visited;
                    if (iArr[i] != 0) {
                        return;
                    }
                    iArr[i] = 1;
                    for (Arc arc : this.arcsByVertex[i]) {
                        walk(arc.span.max);
                        Arc[] arcArr3 = this.result;
                        int i2 = this.cursor;
                        this.cursor = i2 - 1;
                        arcArr3[i2] = arc;
                    }
                    this.visited[i] = 2;
                }

                Arc[] sort() {
                    int length = this.arcsByVertex.length;
                    for (int i = 0; i < length; i++) {
                        walk(i);
                    }
                    return this.result;
                }
            }.sort();
        }

        private Arc[] topologicalSort(List<Arc> list) {
            return topologicalSort((Arc[]) list.toArray(new Arc[0]));
        }

        private void addComponentSizes(List<Arc> list, PackedMap<Interval, MutableInt> packedMap) {
            int i = 0;
            while (true) {
                Interval[] intervalArr = packedMap.keys;
                if (i >= intervalArr.length) {
                    return;
                }
                include(list, intervalArr[i], packedMap.values[i], false);
                i++;
            }
        }

        private Arc[] createArcs() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            addComponentSizes(arrayList, getForwardLinks());
            addComponentSizes(arrayList2, getBackwardLinks());
            if (this.orderPreserved) {
                int i = 0;
                while (i < getCount()) {
                    int i2 = i + 1;
                    include(arrayList, new Interval(i, i2), new MutableInt(0));
                    i = i2;
                }
            }
            int count = getCount();
            include(arrayList, new Interval(0, count), this.parentMin, false);
            include(arrayList2, new Interval(count, 0), this.parentMax, false);
            return (Arc[]) TableLayout.append(topologicalSort(arrayList), topologicalSort(arrayList2));
        }

        private void computeArcs() {
            getForwardLinks();
            getBackwardLinks();
        }

        public Arc[] getArcs() {
            if (this.arcs == null) {
                this.arcs = createArcs();
            }
            if (!this.arcsValid) {
                computeArcs();
                this.arcsValid = true;
            }
            return this.arcs;
        }

        private boolean relax(int[] iArr, Arc arc) {
            if (arc.valid) {
                Interval interval = arc.span;
                int i = interval.min;
                int i2 = interval.max;
                int i3 = iArr[i] + arc.value.value;
                if (i3 > iArr[i2]) {
                    iArr[i2] = i3;
                    return true;
                }
                return false;
            }
            return false;
        }

        private void init(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private boolean solve(Arc[] arcArr, int[] iArr) {
            return solve(arcArr, iArr, true);
        }

        private boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            int count = getCount() + 1;
            for (int i = 0; i < arcArr.length; i++) {
                init(iArr);
                for (int i2 = 0; i2 < count; i2++) {
                    boolean z2 = false;
                    for (Arc arc : arcArr) {
                        z2 |= relax(iArr, arc);
                    }
                    if (!z2) {
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr = new boolean[arcArr.length];
                for (int i3 = 0; i3 < count; i3++) {
                    int length = arcArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr[i4] = zArr[i4] | relax(iArr, arcArr[i4]);
                    }
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= arcArr.length) {
                        break;
                    }
                    if (zArr[i5]) {
                        Arc arc2 = arcArr[i5];
                        Interval interval = arc2.span;
                        if (interval.min >= interval.max) {
                            arc2.valid = false;
                            break;
                        }
                    }
                    i5++;
                }
            }
            return true;
        }

        private void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z2 = this.horizontal;
                Interval interval = (z2 ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                int i2 = z ? interval.min : interval.max;
                iArr[i2] = Math.max(iArr[i2], TableLayout.this.getMargin1(childAt, z2, z));
            }
        }

        public int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[getCount() + 1];
            }
            if (!this.leadingMarginsValid) {
                computeMargins(true);
                this.leadingMarginsValid = true;
            }
            return this.leadingMargins;
        }

        public int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[getCount() + 1];
            }
            if (!this.trailingMarginsValid) {
                computeMargins(false);
                this.trailingMarginsValid = true;
            }
            return this.trailingMargins;
        }

        private boolean solve(int[] iArr) {
            return solve(getArcs(), iArr);
        }

        private boolean computeHasWeights() {
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                if ((this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight != 0.0f) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasWeights() {
            if (!this.hasWeightsValid) {
                this.hasWeights = computeHasWeights();
                this.hasWeightsValid = true;
            }
            return this.hasWeights;
        }

        public int[] getDeltas() {
            if (this.deltas == null) {
                this.deltas = new int[TableLayout.this.getChildCount()];
            }
            return this.deltas;
        }

        private void shareOutDelta(int i, float f) {
            Arrays.fill(this.deltas, 0);
            int childCount = TableLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i2).getLayoutParams();
                float f2 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
                if (f2 != 0.0f) {
                    int round = Math.round((i * f2) / f);
                    this.deltas[i2] = round;
                    i -= round;
                    f -= f2;
                }
            }
        }

        private void solveAndDistributeSpace(int[] iArr) {
            Arrays.fill(getDeltas(), 0);
            solve(iArr);
            boolean z = true;
            int childCount = (this.parentMin.value * TableLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float calculateTotalWeight = calculateTotalWeight();
            int i = -1;
            int i2 = 0;
            while (i2 < childCount) {
                int i3 = (int) ((i2 + childCount) / 2);
                invalidateValues();
                shareOutDelta(i3, calculateTotalWeight);
                boolean solve = solve(getArcs(), iArr, false);
                if (solve) {
                    i2 = i3 + 1;
                    i = i3;
                } else {
                    childCount = i3;
                }
                z = solve;
            }
            if (i <= 0 || z) {
                return;
            }
            invalidateValues();
            shareOutDelta(i, calculateTotalWeight);
            solve(iArr);
        }

        private float calculateTotalWeight() {
            int childCount = TableLayout.this.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                f += (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
            }
            return f;
        }

        private void computeLocations(int[] iArr) {
            if (!hasWeights()) {
                solve(iArr);
            } else {
                solveAndDistributeSpace(iArr);
            }
            if (this.orderPreserved) {
                return;
            }
            int i = iArr[0];
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = iArr[i2] - i;
            }
        }

        public int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[getCount() + 1];
            }
            if (!this.locationsValid) {
                computeLocations(this.locations);
                this.locationsValid = true;
            }
            return this.locations;
        }

        private int size(int[] iArr) {
            return iArr[getCount()];
        }

        private void setParentConstraints(int i, int i2) {
            this.parentMin.value = i;
            this.parentMax.value = -i2;
            this.locationsValid = false;
        }

        private int getMeasure(int i, int i2) {
            setParentConstraints(i, i2);
            return size(getLocations());
        }

        public int getMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        return 0;
                    }
                    return getMeasure(size, size);
                }
                return getMeasure(0, 100000);
            }
            return getMeasure(0, size);
        }

        public void layout(int i) {
            setParentConstraints(i, i);
            getLocations();
        }

        public void invalidateStructure() {
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = false;
            invalidateValues();
        }

        public void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final Interval DEFAULT_SPAN;
        public Spec columnSpec;
        public Spec rowSpec;

        static {
            Interval interval = new Interval(Integer.MIN_VALUE, -2147483647);
            DEFAULT_SPAN = interval;
            interval.size();
        }

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Spec spec, Spec spec2) {
            super(i, i2);
            Spec spec3 = Spec.UNDEFINED;
            this.rowSpec = spec3;
            this.columnSpec = spec3;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = spec;
            this.columnSpec = spec2;
        }

        public LayoutParams(Spec spec, Spec spec2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, spec, spec2);
        }

        public LayoutParams() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.TableLayout.LayoutParams.<init>():void");
        }

        final void setRowSpecSpan(Interval interval) {
            this.rowSpec = this.rowSpec.copyWriteSpan(interval);
        }

        final void setColumnSpecSpan(Interval interval) {
            this.columnSpec = this.columnSpec.copyWriteSpan(interval);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || LayoutParams.class != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec);
        }

        public int hashCode() {
            return (this.rowSpec.hashCode() * 31) + this.columnSpec.hashCode();
        }
    }

    public static final class Arc {
        public final Interval span;
        public boolean valid = true;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }
    }

    public static final class MutableInt {
        public int value;

        public MutableInt() {
            reset();
        }

        public MutableInt(int i) {
            this.value = i;
        }

        public void reset() {
            this.value = Integer.MIN_VALUE;
        }
    }

    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        private Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> Assoc<K, V> m12of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public void put(K k, V v) {
            add(Pair.create(k, v));
        }

        public PackedMap<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new PackedMap<>(objArr, objArr2);
        }
    }

    public static final class PackedMap<K, V> {
        public final int[] index;
        public final K[] keys;
        public final V[] values;

        private PackedMap(K[] kArr, V[] vArr) {
            int[] createIndex = createIndex(kArr);
            this.index = createIndex;
            this.keys = (K[]) compact(kArr, createIndex);
            this.values = (V[]) compact(vArr, createIndex);
        }

        public V getValue(int i) {
            return this.values[this.index[i]];
        }

        private static <K> int[] createIndex(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        private static <K> K[] compact(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(kArr.getClass().getComponentType(), TableLayout.max2(iArr, -1) + 1));
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }
    }

    public static class Bounds {
        public int after;
        public int before;
        public int flexibility;

        private Bounds() {
            reset();
        }

        protected void reset() {
            this.before = Integer.MIN_VALUE;
            this.after = Integer.MIN_VALUE;
            this.flexibility = 2;
        }

        protected void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        protected int size(boolean z) {
            if (z || !TableLayout.canStretch(this.flexibility)) {
                return this.before + this.after;
            }
            return 100000;
        }

        protected int getOffset(TableLayout tableLayout, Child child, Alignment alignment, int i, boolean z) {
            return this.before - alignment.getAlignmentValue(child, i);
        }

        protected final void include(TableLayout tableLayout, Child child, Spec spec, Axis axis, int i) {
            this.flexibility &= spec.getFlexibility();
            int alignmentValue = spec.getAbsoluteAlignment(axis.horizontal).getAlignmentValue(child, i);
            include(alignmentValue, i - alignmentValue);
        }
    }

    public static final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        int size() {
            return this.max - this.min;
        }

        Interval inverse() {
            return new Interval(this.max, this.min);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Interval.class != obj.getClass()) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.max == interval.max && this.min == interval.min;
        }

        public int hashCode() {
            return (this.min * 31) + this.max;
        }
    }

    public static class Spec {
        static final Spec UNDEFINED = TableLayout.spec(Integer.MIN_VALUE);
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;
        float weight;

        private Spec(boolean z, Interval interval, Alignment alignment, float f) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment;
            this.weight = f;
        }

        private Spec(boolean z, int i, int i2, Alignment alignment, float f) {
            this(z, new Interval(i, i2 + i), alignment, f);
        }

        public Alignment getAbsoluteAlignment(boolean z) {
            Alignment alignment = this.alignment;
            if (alignment != TableLayout.UNDEFINED_ALIGNMENT) {
                return alignment;
            }
            if (this.weight == 0.0f) {
                return z ? TableLayout.START : TableLayout.BASELINE;
            }
            return TableLayout.FILL;
        }

        final Spec copyWriteSpan(Interval interval) {
            return new Spec(this.startDefined, interval, this.alignment, this.weight);
        }

        final int getFlexibility() {
            return (this.alignment == TableLayout.UNDEFINED_ALIGNMENT && this.weight == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Spec.class != obj.getClass()) {
                return false;
            }
            Spec spec = (Spec) obj;
            return this.alignment.equals(spec.alignment) && this.span.equals(spec.span);
        }

        public int hashCode() {
            return (this.span.hashCode() * 31) + this.alignment.hashCode();
        }
    }

    public static Spec spec(int i, int i2, Alignment alignment, float f) {
        return new Spec(i != Integer.MIN_VALUE, i, i2, alignment, f);
    }

    public static Spec spec(int i, int i2, Alignment alignment) {
        return spec(i, i2, alignment, 0.0f);
    }

    public static Spec spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static Spec spec(int i) {
        return spec(i, 1);
    }

    public static abstract class Alignment {
        abstract int getAlignmentValue(Child child, int i);

        abstract int getGravityOffset(Child child, int i);

        int getSizeInCell(Child child, int i, int i2) {
            return i;
        }

        Alignment() {
        }

        Bounds getBounds() {
            return new Bounds();
        }
    }

    static {
        Alignment alignment = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return 0;
            }

            @Override
            int getGravityOffset(Child child, int i) {
                return 0;
            }
        };
        LEADING = alignment;
        Alignment alignment2 = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return i;
            }

            @Override
            int getGravityOffset(Child child, int i) {
                return i;
            }
        };
        TRAILING = alignment2;
        START = alignment;
        END = alignment2;
        createSwitchingAlignment(alignment);
        createSwitchingAlignment(alignment2);
        new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return i >> 1;
            }

            @Override
            int getGravityOffset(Child child, int i) {
                return i >> 1;
            }
        };
        BASELINE = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return Integer.MIN_VALUE;
            }

            @Override
            int getGravityOffset(Child child, int i) {
                return 0;
            }

            @Override
            public Bounds getBounds() {
                return new Bounds(this) {
                    private int size;

                    @Override
                    protected void reset() {
                        super.reset();
                        this.size = Integer.MIN_VALUE;
                    }

                    @Override
                    protected void include(int i, int i2) {
                        super.include(i, i2);
                        this.size = Math.max(this.size, i + i2);
                    }

                    @Override
                    protected int size(boolean z) {
                        return Math.max(super.size(z), this.size);
                    }

                    @Override
                    protected int getOffset(TableLayout tableLayout, Child child, Alignment alignment3, int i, boolean z) {
                        return Math.max(0, super.getOffset(tableLayout, child, alignment3, i, z));
                    }
                };
            }
        };
        FILL = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return Integer.MIN_VALUE;
            }

            @Override
            int getGravityOffset(Child child, int i) {
                return 0;
            }

            @Override
            public int getSizeInCell(Child child, int i, int i2) {
                return i2;
            }
        };
    }

    private static Alignment createSwitchingAlignment(final Alignment alignment) {
        return new Alignment() {
            @Override
            int getGravityOffset(Child child, int i) {
                return Alignment.this.getGravityOffset(child, i);
            }

            @Override
            public int getAlignmentValue(Child child, int i) {
                return Alignment.this.getAlignmentValue(child, i);
            }
        };
    }
}
