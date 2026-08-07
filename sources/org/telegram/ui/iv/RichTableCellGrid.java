package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class RichTableCellGrid extends ViewGroup {
    private final RectF arcRect;
    private boolean bottomBulge;
    private int bulgeColLeft;
    private int bulgeColRight;
    private final Paint bulgeFillPaint;
    private final Path bulgePath;
    private int bulgeRowBot;
    private int bulgeRowTop;
    private int[] colStarts;
    private int[] colWidths;
    private int dotColor;
    private int dotOnSelectionColor;
    private final Paint dotPaint;
    private final Paint headerPaint;
    private boolean leftBulge;
    private final Paint linePaint;
    private TableModel model;
    private Theme.ResourcesProvider resourcesProvider;
    private int[] rowHeights;
    private int[] rowStarts;
    private final RectF selRect;
    private int selectedFillBaseAlpha;
    private int selectedStrokeBaseAlpha;
    private final Paint selectedStrokePaint;
    private AnimatedFloat selectionFade;
    private CellSelectionProvider selectionProvider;
    private final Paint stripPaint;

    public interface CellSelectionProvider {
        boolean isSelected(TL_iv.pageTableCell pagetablecell);
    }

    public void setSelectionProvider(CellSelectionProvider cellSelectionProvider) {
        this.selectionProvider = cellSelectionProvider;
        invalidate();
    }

    public RichTableCellGrid(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.colWidths = new int[0];
        this.rowHeights = new int[0];
        this.colStarts = new int[0];
        this.rowStarts = new int[0];
        Paint paint = new Paint(1);
        this.linePaint = paint;
        this.headerPaint = new Paint(1);
        this.stripPaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.selectedStrokePaint = paint2;
        this.dotPaint = new Paint(1);
        this.bulgeFillPaint = new Paint(1);
        this.selRect = new RectF();
        this.arcRect = new RectF();
        this.bulgePath = new Path();
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.selectionFade = new AnimatedFloat(this, 0L, 220L, CubicBezierInterpolator.EASE_OUT_QUINT);
        applyColors();
    }

    public void applyColors() {
        this.linePaint.setColor(Theme.getColor(Theme.key_table_border, this.resourcesProvider));
        int color = Theme.getColor(Theme.key_switchTrack, this.resourcesProvider);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        this.headerPaint.setColor(Theme.getColor(Theme.key_table_background, this.resourcesProvider));
        this.stripPaint.setColor(Color.argb(20, iRed, iGreen, iBlue));
        this.selectedFillBaseAlpha = 80;
        this.selectedStrokeBaseAlpha = 255;
        Paint paint = this.selectedStrokePaint;
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        Paint paint2 = this.dotPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.dotColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7, this.resourcesProvider);
        this.dotOnSelectionColor = Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider);
        this.dotPaint.setColor(this.dotColor);
        this.bulgeFillPaint.setStyle(style);
        this.bulgeFillPaint.setColor(Theme.getColor(i, this.resourcesProvider));
        invalidate();
    }

    public void setModel(TableModel tableModel) {
        this.model = tableModel;
        rebuildHosts();
    }

    public TableModel getModel() {
        return this.model;
    }

    public RichTableCellHost hostForAnchor(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (richTableCellHost.cell == pagetablecell) {
                    return richTableCellHost;
                }
            }
        }
        return null;
    }

    private void rebuildHosts() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof RichTableCellHost) {
                removeViewAt(childCount);
            }
        }
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        int size = tableModel.anchors().size();
        for (int i = 0; i < size; i++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchors().get(i);
            RichTableCellHost richTableCellHost = new RichTableCellHost(getContext(), this.resourcesProvider);
            richTableCellHost.bind(pagetablecell);
            addView(richTableCellHost);
        }
    }

    public void rebindAfterModelChange() {
        rebuildHosts();
        requestLayout();
        invalidate();
    }

    @Override
    protected void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichTableCellGrid.onMeasure(int, int):void");
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.model == null) {
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int iAnchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int iAnchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                if (iAnchorRowOf >= 0 && iAnchorColOf >= 0) {
                    int i6 = this.colStarts[iAnchorColOf];
                    int i7 = this.rowStarts[iAnchorRowOf];
                    richTableCellHost.layout(i6, i7, richTableCellHost.getMeasuredWidth() + i6, richTableCellHost.getMeasuredHeight() + i7);
                }
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        TL_iv.pageBlockTable pageblocktable;
        computeHandlesState();
        drawCellBackgrounds(canvas);
        super.dispatchDraw(canvas);
        drawBulgeFills(canvas);
        TableModel tableModel = this.model;
        if (tableModel != null && (pageblocktable = tableModel.block) != null && pageblocktable.bordered) {
            drawBorders(canvas);
        }
        drawSelectionOutline(canvas);
        drawHandleDots(canvas);
    }

    private TL_iv.pageTableCell activeCell() {
        TableModel tableModel = this.model;
        TL_iv.pageTableCell pagetablecell = null;
        if (tableModel != null && tableModel.rowCount != 0 && tableModel.colCount != 0) {
            TL_iv.pageTableCell pagetablecellFindFocusedCell = findFocusedCell();
            if (pagetablecellFindFocusedCell != null) {
                return pagetablecellFindFocusedCell;
            }
            if (this.selectionProvider == null) {
                return null;
            }
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            for (TL_iv.pageTableCell pagetablecell2 : this.model.anchors()) {
                if (this.selectionProvider.isSelected(pagetablecell2)) {
                    int iAnchorRowOf = this.model.anchorRowOf(pagetablecell2);
                    int iAnchorColOf = this.model.anchorColOf(pagetablecell2);
                    if (iAnchorRowOf < i || (iAnchorRowOf == i && iAnchorColOf < i2)) {
                        pagetablecell = pagetablecell2;
                        i = iAnchorRowOf;
                        i2 = iAnchorColOf;
                    }
                }
            }
        }
        return pagetablecell;
    }

    private boolean isRowFullySelected(int i) {
        if (i < 0 || i >= this.model.rowCount) {
            return false;
        }
        for (int i2 = 0; i2 < this.model.colCount; i2++) {
            if (!isSelected(i, i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isColFullySelected(int i) {
        if (i < 0 || i >= this.model.colCount) {
            return false;
        }
        for (int i2 = 0; i2 < this.model.rowCount; i2++) {
            if (!isSelected(i2, i)) {
                return false;
            }
        }
        return true;
    }

    private void computeHandlesState() {
        this.bottomBulge = false;
        this.leftBulge = false;
        TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
        if (pagetablecellActiveCell == null) {
            return;
        }
        int iAnchorRowOf = this.model.anchorRowOf(pagetablecellActiveCell);
        int iAnchorColOf = this.model.anchorColOf(pagetablecellActiveCell);
        if (iAnchorRowOf < 0 || iAnchorColOf < 0) {
            return;
        }
        int iSpanRow = TableModel.spanRow(pagetablecellActiveCell);
        int iSpanCol = TableModel.spanCol(pagetablecellActiveCell);
        if (isRowFullySelected(iAnchorRowOf)) {
            this.leftBulge = true;
            int[] iArr = this.rowStarts;
            this.bulgeRowTop = iArr[iAnchorRowOf];
            this.bulgeRowBot = iArr[Math.min(iAnchorRowOf + iSpanRow, this.model.rowCount)];
        }
        if (isColFullySelected(iAnchorColOf)) {
            this.bottomBulge = true;
            int[] iArr2 = this.colStarts;
            this.bulgeColLeft = iArr2[iAnchorColOf];
            this.bulgeColRight = iArr2[Math.min(iAnchorColOf + iSpanCol, this.model.colCount)];
        }
    }

    private void drawBulgeFills(Canvas canvas) {
        if (this.leftBulge) {
            float fDpf2 = this.bulgeRowTop - AndroidUtilities.dpf2(1.0f);
            float fDpf22 = this.bulgeRowBot + AndroidUtilities.dpf2(1.0f);
            float fDp = this.colStarts[0] - AndroidUtilities.dp(16.0f);
            float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf22 - fDpf2) / 2.0f);
            float fCornerRadiusFor = cornerRadiusFor(this.colStarts[0], this.bulgeRowTop);
            float fCornerRadiusFor2 = cornerRadiusFor(this.colStarts[0], this.bulgeRowBot);
            this.bulgePath.rewind();
            this.bulgePath.moveTo(this.colStarts[0] + fCornerRadiusFor, fDpf2);
            this.bulgePath.lineTo(fDp + fMin, fDpf2);
            float f = fMin * 2.0f;
            float f2 = fDp + f;
            this.arcRect.set(fDp, fDpf2, f2, fDpf2 + f);
            this.bulgePath.arcTo(this.arcRect, 270.0f, -90.0f);
            this.bulgePath.lineTo(fDp, fDpf22 - fMin);
            this.arcRect.set(fDp, fDpf22 - f, f2, fDpf22);
            this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
            this.bulgePath.lineTo(this.colStarts[0] + fCornerRadiusFor2, fDpf22);
            if (fCornerRadiusFor2 > 0.0f) {
                RectF rectF = this.arcRect;
                float f3 = this.colStarts[0];
                float f4 = fCornerRadiusFor2 * 2.0f;
                rectF.set(f3, fDpf22 - f4, f4 + f3, fDpf22);
                this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(this.colStarts[0], fDpf22);
            }
            this.bulgePath.lineTo(this.colStarts[0], fDpf2 + fCornerRadiusFor);
            if (fCornerRadiusFor > 0.0f) {
                RectF rectF2 = this.arcRect;
                float f5 = this.colStarts[0];
                float f6 = fCornerRadiusFor * 2.0f;
                rectF2.set(f5, fDpf2, f5 + f6, f6 + fDpf2);
                this.bulgePath.arcTo(this.arcRect, 180.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(this.colStarts[0], fDpf2);
            }
            this.bulgePath.close();
            canvas.drawPath(this.bulgePath, this.bulgeFillPaint);
        }
        if (this.bottomBulge) {
            float fDpf23 = this.bulgeColLeft - AndroidUtilities.dpf2(1.0f);
            float fDpf24 = this.bulgeColRight + AndroidUtilities.dpf2(1.0f);
            float f7 = this.rowStarts[this.model.rowCount];
            float fDp2 = AndroidUtilities.dp(16.0f) + f7;
            float fMin2 = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf24 - fDpf23) / 2.0f);
            float fCornerRadiusFor3 = cornerRadiusFor(this.bulgeColLeft, this.rowStarts[this.model.rowCount]);
            float fCornerRadiusFor4 = cornerRadiusFor(this.bulgeColRight, this.rowStarts[this.model.rowCount]);
            this.bulgePath.rewind();
            this.bulgePath.moveTo(fDpf23, f7 - fCornerRadiusFor3);
            this.bulgePath.lineTo(fDpf23, fDp2 - fMin2);
            float f8 = fMin2 * 2.0f;
            float f9 = fDp2 - f8;
            this.arcRect.set(fDpf23, f9, fDpf23 + f8, fDp2);
            this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
            this.bulgePath.lineTo(fDpf24 - fMin2, fDp2);
            this.arcRect.set(fDpf24 - f8, f9, fDpf24, fDp2);
            this.bulgePath.arcTo(this.arcRect, 90.0f, -90.0f);
            this.bulgePath.lineTo(fDpf24, f7 - fCornerRadiusFor4);
            if (fCornerRadiusFor4 > 0.0f) {
                float f10 = fCornerRadiusFor4 * 2.0f;
                this.arcRect.set(fDpf24 - f10, f7 - f10, fDpf24, f7);
                this.bulgePath.arcTo(this.arcRect, 0.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(fDpf24, f7);
            }
            this.bulgePath.lineTo(fDpf23 + fCornerRadiusFor3, f7);
            if (fCornerRadiusFor3 > 0.0f) {
                float f11 = fCornerRadiusFor3 * 2.0f;
                this.arcRect.set(fDpf23, f7 - f11, f11 + fDpf23, f7);
                this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
            } else {
                this.bulgePath.lineTo(fDpf23, f7);
            }
            this.bulgePath.close();
            canvas.drawPath(this.bulgePath, this.bulgeFillPaint);
        }
    }

    private void drawHandleDots(Canvas canvas) {
        TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
        if (pagetablecellActiveCell == null) {
            return;
        }
        int iAnchorRowOf = this.model.anchorRowOf(pagetablecellActiveCell);
        int iAnchorColOf = this.model.anchorColOf(pagetablecellActiveCell);
        if (iAnchorRowOf < 0 || iAnchorColOf < 0) {
            return;
        }
        int iSpanRow = TableModel.spanRow(pagetablecellActiveCell);
        int iSpanCol = TableModel.spanCol(pagetablecellActiveCell);
        float fDpf2 = AndroidUtilities.dpf2(3.0f) / 2.0f;
        float fDp = AndroidUtilities.dp(8.0f);
        int[] iArr = this.rowStarts;
        float f = (iArr[iAnchorRowOf] + iArr[Math.min(iAnchorRowOf + iSpanRow, this.model.rowCount)]) / 2.0f;
        float fDp2 = (this.colStarts[0] - AndroidUtilities.dp(6.0f)) - fDpf2;
        this.dotPaint.setColor(this.leftBulge ? this.dotOnSelectionColor : this.dotColor);
        for (int i = -1; i <= 1; i++) {
            canvas.drawCircle(fDp2, (i * fDp) + f, fDpf2, this.dotPaint);
        }
        int[] iArr2 = this.colStarts;
        float f2 = (iArr2[iAnchorColOf] + iArr2[Math.min(iAnchorColOf + iSpanCol, this.model.colCount)]) / 2.0f;
        float fDp3 = this.rowStarts[this.model.rowCount] + AndroidUtilities.dp(6.0f) + fDpf2;
        this.dotPaint.setColor(this.bottomBulge ? this.dotOnSelectionColor : this.dotColor);
        for (int i2 = -1; i2 <= 1; i2++) {
            canvas.drawCircle((i2 * fDp) + f2, fDp3, fDpf2, this.dotPaint);
        }
    }

    public int rowHandleAtGrid(int i, int i2) {
        int iAnchorRowOf;
        TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
        if (pagetablecellActiveCell == null || (iAnchorRowOf = this.model.anchorRowOf(pagetablecellActiveCell)) < 0) {
            return -1;
        }
        int iSpanRow = TableModel.spanRow(pagetablecellActiveCell);
        int[] iArr = this.rowStarts;
        int i3 = iArr[iAnchorRowOf];
        int i4 = iArr[Math.min(iSpanRow + iAnchorRowOf, this.model.rowCount)];
        if (i < (this.colStarts[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || i >= this.colStarts[0] || i2 < i3 || i2 >= i4) {
            return -1;
        }
        return iAnchorRowOf;
    }

    public int colHandleAtGrid(int i, int i2) {
        int iAnchorColOf;
        TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
        if (pagetablecellActiveCell == null || (iAnchorColOf = this.model.anchorColOf(pagetablecellActiveCell)) < 0) {
            return -1;
        }
        int iSpanCol = TableModel.spanCol(pagetablecellActiveCell);
        int[] iArr = this.colStarts;
        int i3 = iArr[iAnchorColOf];
        int i4 = iArr[Math.min(iSpanCol + iAnchorColOf, this.model.colCount)];
        int i5 = this.rowStarts[this.model.rowCount];
        if (i2 < i5 || i2 >= i5 + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) || i < i3 || i >= i4) {
            return -1;
        }
        return iAnchorColOf;
    }

    public TL_iv.pageTableCell findFocusedCell() {
        View viewFindFocus = findFocus();
        for (ViewParent parent = viewFindFocus == null ? null : viewFindFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
            if (parent instanceof RichTableCellHost) {
                return ((RichTableCellHost) parent).cell;
            }
        }
        return null;
    }

    private void drawCellBackgrounds(Canvas canvas) {
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = tableModel.block;
        boolean z = pageblocktable != null && pageblocktable.striped;
        canvas.save();
        RectF rectF = this.selRect;
        float f = this.colStarts[0];
        float f2 = this.rowStarts[0];
        TableModel tableModel2 = this.model;
        rectF.set(f, f2, r3[tableModel2.colCount], r5[tableModel2.rowCount]);
        this.bulgePath.rewind();
        this.bulgePath.addRoundRect(this.selRect, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
        canvas.clipPath(this.bulgePath);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                int iAnchorRowOf = this.model.anchorRowOf(richTableCellHost.cell);
                int iAnchorColOf = this.model.anchorColOf(richTableCellHost.cell);
                if (iAnchorRowOf >= 0 && iAnchorColOf >= 0) {
                    int iSpanCol = TableModel.spanCol(richTableCellHost.cell);
                    int iSpanRow = TableModel.spanRow(richTableCellHost.cell);
                    int[] iArr = this.colStarts;
                    int i2 = iArr[iAnchorColOf];
                    int i3 = this.rowStarts[iAnchorRowOf];
                    int i4 = iArr[Math.min(iAnchorColOf + iSpanCol, this.model.colCount)];
                    int i5 = this.rowStarts[Math.min(iSpanRow + iAnchorRowOf, this.model.rowCount)];
                    if (richTableCellHost.cell.header) {
                        canvas.drawRect(i2, i3, i4, i5, this.headerPaint);
                    } else if (z && iAnchorRowOf % 2 == 0) {
                        canvas.drawRect(i2, i3, i4, i5, this.stripPaint);
                    }
                }
            }
        }
        canvas.restore();
    }

    private boolean isSelected(int i, int i2) {
        CellSelectionProvider cellSelectionProvider;
        TableModel tableModel = this.model;
        if (tableModel == null || (cellSelectionProvider = this.selectionProvider) == null || i < 0 || i >= tableModel.rowCount || i2 < 0 || i2 >= tableModel.colCount) {
            return false;
        }
        return cellSelectionProvider.isSelected(tableModel.grid[i][i2]);
    }

    private boolean hasAnySelection() {
        TableModel tableModel = this.model;
        if (tableModel != null && this.selectionProvider != null) {
            Iterator it = tableModel.anchors().iterator();
            while (it.hasNext()) {
                if (this.selectionProvider.isSelected((TL_iv.pageTableCell) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void drawSelectionOutline(Canvas canvas) {
        int i;
        int i2;
        if (this.model == null) {
            return;
        }
        float f = this.selectionFade.set(hasAnySelection() ? 1.0f : 0.0f);
        if (f <= 0.001f) {
            return;
        }
        this.selectedStrokePaint.setAlpha((int) (this.selectedStrokeBaseAlpha * f));
        this.selectedStrokePaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f) * Math.max(0.4f, f));
        int i3 = 0;
        while (true) {
            int i4 = this.model.rowCount;
            if (i3 > i4) {
                break;
            }
            int i5 = i3 < i4 ? this.rowStarts[i3] : this.rowStarts[i4];
            int i6 = 0;
            int i7 = -1;
            while (true) {
                i2 = this.model.colCount;
                if (i6 >= i2) {
                    break;
                }
                if (isSelected(i3 - 1, i6) != isSelected(i3, i6)) {
                    if (i7 < 0) {
                        i7 = this.colStarts[i6];
                    }
                } else if (i7 >= 0) {
                    drawSelHLine(canvas, i7, this.colStarts[i6], i5);
                    i7 = -1;
                }
                i6++;
            }
            if (i7 >= 0) {
                drawSelHLine(canvas, i7, this.colStarts[i2], i5);
            }
            i3++;
        }
        int i8 = 0;
        while (true) {
            TableModel tableModel = this.model;
            int i9 = tableModel.colCount;
            if (i8 <= i9) {
                int i10 = i8 < i9 ? this.colStarts[i8] : this.colStarts[i9];
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    i = this.model.rowCount;
                    if (i11 >= i) {
                        break;
                    }
                    if (isSelected(i11, i8 - 1) != isSelected(i11, i8)) {
                        if (i12 < 0) {
                            i12 = this.rowStarts[i11];
                        }
                    } else if (i12 >= 0) {
                        drawSelVLine(canvas, i10, i12, this.rowStarts[i11]);
                        i12 = -1;
                    }
                    i11++;
                }
                if (i12 >= 0) {
                    drawSelVLine(canvas, i10, i12, this.rowStarts[i]);
                }
                i8++;
            } else {
                int i13 = tableModel.rowCount;
                drawSelCornerArc(canvas, this.colStarts[0], this.rowStarts[0], 180.0f);
                drawSelCornerArc(canvas, this.colStarts[i9], this.rowStarts[0], 270.0f);
                drawSelCornerArc(canvas, this.colStarts[0], this.rowStarts[i13], 90.0f);
                drawSelCornerArc(canvas, this.colStarts[i9], this.rowStarts[i13], 0.0f);
                return;
            }
        }
    }

    private float cornerRadiusFor(int i, int i2) {
        int i3;
        TableModel tableModel = this.model;
        int i4 = tableModel.colCount;
        int i5 = tableModel.rowCount;
        int[] iArr = this.colStarts;
        int i6 = 0;
        if (i != iArr[0]) {
            i3 = i == iArr[i4] ? i4 - 1 : 0;
            return 0.0f;
        }
        int[] iArr2 = this.rowStarts;
        if (i2 != iArr2[0]) {
            if (i2 == iArr2[i5]) {
                i6 = i5 - 1;
                if (i3 >= 0 && i6 >= 0 && isSelected(i6, i3)) {
                    return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.colWidths[i3], this.rowHeights[i6]) / 2.0f);
                }
            }
        } else if (i3 >= 0) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.colWidths[i3], this.rowHeights[i6]) / 2.0f);
        }
        return 0.0f;
    }

    private void drawSelHLine(Canvas canvas, int i, int i2, int i3) {
        if (i2 <= i) {
            return;
        }
        float fCornerRadiusFor = i + cornerRadiusFor(i, i3);
        float fCornerRadiusFor2 = i2 - cornerRadiusFor(i2, i3);
        if (fCornerRadiusFor2 > fCornerRadiusFor) {
            float f = i3;
            canvas.drawLine(fCornerRadiusFor, f, fCornerRadiusFor2, f, this.selectedStrokePaint);
        }
    }

    private void drawSelVLine(Canvas canvas, int i, int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        float fCornerRadiusFor = i2 + cornerRadiusFor(i, i2);
        float fCornerRadiusFor2 = i3 - cornerRadiusFor(i, i3);
        if (fCornerRadiusFor2 > fCornerRadiusFor) {
            float f = i;
            canvas.drawLine(f, fCornerRadiusFor, f, fCornerRadiusFor2, this.selectedStrokePaint);
        }
    }

    private void drawSelCornerArc(Canvas canvas, int i, int i2, float f) {
        float fCornerRadiusFor = cornerRadiusFor(i, i2);
        if (fCornerRadiusFor <= 0.0f) {
            return;
        }
        float f2 = i == this.colStarts[0] ? i + fCornerRadiusFor : i - fCornerRadiusFor;
        float f3 = i2 == this.rowStarts[0] ? i2 + fCornerRadiusFor : i2 - fCornerRadiusFor;
        this.arcRect.set(f2 - fCornerRadiusFor, f3 - fCornerRadiusFor, f2 + fCornerRadiusFor, f3 + fCornerRadiusFor);
        canvas.drawArc(this.arcRect, f, 90.0f, false, this.selectedStrokePaint);
    }

    private void drawBorders(Canvas canvas) {
        float strokeWidth = this.linePaint.getStrokeWidth() / 2.0f;
        float fDpf2 = AndroidUtilities.dpf2(10.0f);
        RectF rectF = this.selRect;
        int[] iArr = this.colStarts;
        int[] iArr2 = this.rowStarts;
        TableModel tableModel = this.model;
        rectF.set(iArr[0] + strokeWidth, iArr2[0] + strokeWidth, iArr[tableModel.colCount] - strokeWidth, iArr2[tableModel.rowCount] - strokeWidth);
        canvas.drawRoundRect(this.selRect, fDpf2, fDpf2, this.linePaint);
        for (int i = 1; i < this.model.colCount; i++) {
            int i2 = this.colStarts[i];
            int i3 = 0;
            int i4 = -1;
            while (true) {
                TableModel tableModel2 = this.model;
                if (i3 >= tableModel2.rowCount) {
                    break;
                }
                TL_iv.pageTableCell[] pagetablecellArr = tableModel2.grid[i3];
                if (pagetablecellArr[i - 1] != pagetablecellArr[i]) {
                    if (i4 < 0) {
                        i4 = this.rowStarts[i3];
                    }
                } else if (i4 >= 0) {
                    float f = i2;
                    canvas.drawLine(f, i4, f, this.rowStarts[i3], this.linePaint);
                    i4 = -1;
                }
                i3++;
            }
            if (i4 >= 0) {
                float f2 = i2;
                canvas.drawLine(f2, i4, f2, this.rowStarts[r8], this.linePaint);
            }
        }
        for (int i5 = 1; i5 < this.model.rowCount; i5++) {
            int i6 = this.rowStarts[i5];
            int i7 = 0;
            int i8 = -1;
            while (true) {
                TableModel tableModel3 = this.model;
                if (i7 >= tableModel3.colCount) {
                    break;
                }
                TL_iv.pageTableCell[][] pagetablecellArr2 = tableModel3.grid;
                if (pagetablecellArr2[i5 - 1][i7] != pagetablecellArr2[i5][i7]) {
                    if (i8 < 0) {
                        i8 = this.colStarts[i7];
                    }
                } else if (i8 >= 0) {
                    float f3 = i6;
                    canvas.drawLine(i8, f3, this.colStarts[i7], f3, this.linePaint);
                    i8 = -1;
                }
                i7++;
            }
            if (i8 >= 0) {
                float f4 = i6;
                canvas.drawLine(i8, f4, this.colStarts[r7], f4, this.linePaint);
            }
        }
    }
}
