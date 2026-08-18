package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
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
            richTableCellHost.setCompact(this.model.block.compact);
            richTableCellHost.bind(pagetablecell);
            addView(richTableCellHost);
        }
    }

    public void rebindAfterModelChange() {
        rebuildHosts();
        requestLayout();
        invalidate();
    }

    public void refreshCompact() {
        if (this.model == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).setCompact(this.model.block.compact);
            }
        }
        requestLayout();
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int i4;
        int i5;
        int iAnchorColOf;
        int iDp = AndroidUtilities.dp(20.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int iDp3 = AndroidUtilities.dp(4.0f);
        int iDp4 = AndroidUtilities.dp(10.0f);
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), iDp2 + iDp4);
            this.colWidths = new int[0];
            this.rowHeights = new int[0];
            this.colStarts = new int[0];
            this.rowStarts = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - iDp) - iDp3;
        TableModel tableModel2 = this.model;
        int i6 = tableModel2.rowCount;
        int i7 = tableModel2.colCount;
        this.colWidths = new int[i7];
        this.rowHeights = new int[i6];
        int iDp5 = AndroidUtilities.dp(tableModel2.block.compact ? 20.0f : 50.0f);
        int i8 = this.model.block.compact ? 5 : 12;
        if (i7 == 2) {
            iMax = Math.max(0, (size / 2) - AndroidUtilities.dp(i8 * 4));
        } else {
            iMax = Math.max(0, Math.round(size / 1.5f));
        }
        float f = i8 * 2;
        int iMax2 = Math.max(iDp5, iMax + AndroidUtilities.dp(f));
        for (int i9 = 0; i9 < i7; i9++) {
            this.colWidths[i9] = iDp5;
        }
        int i10 = 0;
        while (true) {
            i3 = 1;
            if (i10 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (TableModel.spanCol(richTableCellHost.cell) == 1 && (iAnchorColOf = this.model.anchorColOf(richTableCellHost.cell)) >= 0 && iAnchorColOf < i7) {
                    int iRound = Math.round(Layout.getDesiredWidth(richTableCellHost.editText.getText(), richTableCellHost.editText.getPaint())) + AndroidUtilities.dp(f);
                    int[] iArr = this.colWidths;
                    iArr[iAnchorColOf] = Math.max(iArr[iAnchorColOf], Math.min(iMax2, iRound));
                }
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < getChildCount()) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost2 = (RichTableCellHost) childAt2;
                int iSpanCol = TableModel.spanCol(richTableCellHost2.cell);
                if (iSpanCol <= i3) {
                    i5 = iDp4;
                } else {
                    int iAnchorColOf2 = this.model.anchorColOf(richTableCellHost2.cell);
                    int iMin = Math.min(i7, iSpanCol + iAnchorColOf2);
                    if (iAnchorColOf2 < 0 || iAnchorColOf2 >= iMin) {
                        i5 = iDp4;
                    } else {
                        int i12 = iAnchorColOf2;
                        int i13 = 0;
                        while (i12 < iMin) {
                            i13 += this.colWidths[i12];
                            i12++;
                            iDp4 = iDp4;
                        }
                        i5 = iDp4;
                        int iMin2 = Math.min((iMin - iAnchorColOf2) * iMax2, Math.round(Layout.getDesiredWidth(richTableCellHost2.editText.getText(), richTableCellHost2.editText.getPaint())) + AndroidUtilities.dp(f)) - i13;
                        while (iAnchorColOf2 < iMin && iMin2 > 0) {
                            int i14 = iMin - iAnchorColOf2;
                            int i15 = ((iMin2 + i14) - 1) / i14;
                            int[] iArr2 = this.colWidths;
                            iArr2[iAnchorColOf2] = iArr2[iAnchorColOf2] + i15;
                            iMin2 -= i15;
                            iAnchorColOf2++;
                        }
                    }
                }
            } else {
                i5 = iDp4;
            }
            i11++;
            iDp4 = i5;
            i3 = 1;
        }
        int i16 = iDp4;
        int i17 = 0;
        for (int i18 : this.colWidths) {
            i17 += i18;
        }
        if (i17 < size && i7 > 0) {
            int i19 = size - i17;
            int i20 = 0;
            while (i20 < i7) {
                int iRound2 = i20 == i7 + (-1) ? i19 : Math.round((this.colWidths[i20] * i19) / i17);
                int[] iArr3 = this.colWidths;
                int i21 = iArr3[i20] + iRound2;
                iArr3[i20] = i21;
                i19 -= iRound2;
                i17 -= i21 - iRound2;
                i20++;
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt3 = getChildAt(i22);
            if (childAt3 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost3 = (RichTableCellHost) childAt3;
                int iAnchorRowOf = this.model.anchorRowOf(richTableCellHost3.cell);
                int iAnchorColOf3 = this.model.anchorColOf(richTableCellHost3.cell);
                int iSpanCol2 = TableModel.spanCol(richTableCellHost3.cell);
                int i23 = 0;
                for (int i24 = iAnchorColOf3; i24 < iAnchorColOf3 + iSpanCol2 && i24 < i7; i24++) {
                    i23 += this.colWidths[i24];
                }
                richTableCellHost3.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), iMakeMeasureSpec);
                if (TableModel.spanRow(richTableCellHost3.cell) == 1) {
                    int measuredHeight = richTableCellHost3.getMeasuredHeight();
                    int[] iArr4 = this.rowHeights;
                    if (measuredHeight > iArr4[iAnchorRowOf]) {
                        iArr4[iAnchorRowOf] = richTableCellHost3.getMeasuredHeight();
                    }
                }
            }
        }
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt4 = getChildAt(i25);
            if (childAt4 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost4 = (RichTableCellHost) childAt4;
                int iAnchorRowOf2 = this.model.anchorRowOf(richTableCellHost4.cell);
                int iSpanRow = TableModel.spanRow(richTableCellHost4.cell);
                if (iSpanRow > 1) {
                    int i26 = iAnchorRowOf2;
                    int i27 = 0;
                    while (true) {
                        i4 = iAnchorRowOf2 + iSpanRow;
                        if (i26 >= i4 || i26 >= i6) {
                            break;
                        }
                        i27 += this.rowHeights[i26];
                        i26++;
                    }
                    int measuredHeight2 = richTableCellHost4.getMeasuredHeight();
                    if (measuredHeight2 > i27) {
                        int i28 = measuredHeight2 - i27;
                        int iMax3 = i28 / Math.max(iSpanRow, 1);
                        int iMax4 = i28 % Math.max(iSpanRow, 1);
                        while (iAnchorRowOf2 < i4 && iAnchorRowOf2 < i6) {
                            int[] iArr5 = this.rowHeights;
                            iArr5[iAnchorRowOf2] = iArr5[iAnchorRowOf2] + (iMax4 > 0 ? 1 : 0) + iMax3;
                            if (iMax4 > 0) {
                                iMax4--;
                            }
                            iAnchorRowOf2++;
                        }
                    }
                }
            }
        }
        for (int i29 = 0; i29 < getChildCount(); i29++) {
            View childAt5 = getChildAt(i29);
            if (childAt5 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost5 = (RichTableCellHost) childAt5;
                int iAnchorRowOf3 = this.model.anchorRowOf(richTableCellHost5.cell);
                int iAnchorColOf4 = this.model.anchorColOf(richTableCellHost5.cell);
                int iSpanCol3 = TableModel.spanCol(richTableCellHost5.cell);
                int iSpanRow2 = TableModel.spanRow(richTableCellHost5.cell);
                int i30 = 0;
                for (int i31 = iAnchorColOf4; i31 < iAnchorColOf4 + iSpanCol3 && i31 < i7; i31++) {
                    i30 += this.colWidths[i31];
                }
                int i32 = 0;
                for (int i33 = iAnchorRowOf3; i33 < iAnchorRowOf3 + iSpanRow2 && i33 < i6; i33++) {
                    i32 += this.rowHeights[i33];
                }
                richTableCellHost5.measure(View.MeasureSpec.makeMeasureSpec(i30, 1073741824), View.MeasureSpec.makeMeasureSpec(i32, 1073741824));
            }
        }
        int[] iArr6 = new int[i7 + 1];
        this.colStarts = iArr6;
        iArr6[0] = iDp;
        int i34 = 0;
        while (i34 < i7) {
            int[] iArr7 = this.colStarts;
            int i35 = i34 + 1;
            iArr7[i35] = iArr7[i34] + this.colWidths[i34];
            i34 = i35;
        }
        int[] iArr8 = new int[i6 + 1];
        this.rowStarts = iArr8;
        iArr8[0] = iDp2;
        int i36 = 0;
        while (i36 < i6) {
            int[] iArr9 = this.rowStarts;
            int i37 = i36 + 1;
            iArr9[i37] = iArr9[i36] + this.rowHeights[i36];
            i36 = i37;
        }
        setMeasuredDimension(Math.max(this.colStarts[i7] + iDp3, size + iDp + iDp3), this.rowStarts[i6] + i16);
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

    private boolean rowHasSelection(int i) {
        if (i >= 0 && i < this.model.rowCount) {
            for (int i2 = 0; i2 < this.model.colCount; i2++) {
                if (isSelected(i, i2)) {
                    return true;
                }
            }
        }
        return false;
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

    private boolean colHasSelection(int i) {
        if (i >= 0 && i < this.model.colCount) {
            for (int i2 = 0; i2 < this.model.rowCount; i2++) {
                if (isSelected(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int firstSelectedRow() {
        for (int i = 0; i < this.model.rowCount; i++) {
            if (rowHasSelection(i)) {
                return i;
            }
        }
        return -1;
    }

    private int lastSelectedRow() {
        for (int i = this.model.rowCount - 1; i >= 0; i--) {
            if (rowHasSelection(i)) {
                return i;
            }
        }
        return -1;
    }

    private int firstSelectedCol() {
        for (int i = 0; i < this.model.colCount; i++) {
            if (colHasSelection(i)) {
                return i;
            }
        }
        return -1;
    }

    private int lastSelectedCol() {
        for (int i = this.model.colCount - 1; i >= 0; i--) {
            if (colHasSelection(i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean areRowsFullySelected(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!isRowFullySelected(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean areColsFullySelected(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!isColFullySelected(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean useCombinedRowHandle() {
        if (hasAnySelection()) {
            return !areColsFullySelected(firstSelectedCol(), lastSelectedCol()) || areRowsFullySelected(firstSelectedRow(), lastSelectedRow());
        }
        return false;
    }

    private boolean useCombinedColHandle() {
        if (hasAnySelection()) {
            return !areRowsFullySelected(firstSelectedRow(), lastSelectedRow()) || areColsFullySelected(firstSelectedCol(), lastSelectedCol());
        }
        return false;
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
        if (hasAnySelection()) {
            int iFirstSelectedRow = firstSelectedRow();
            int iLastSelectedRow = lastSelectedRow();
            int iFirstSelectedCol = firstSelectedCol();
            int iLastSelectedCol = lastSelectedCol();
            if (areRowsFullySelected(iFirstSelectedRow, iLastSelectedRow)) {
                int[] iArr = this.rowStarts;
                drawLeftBulgeFill(canvas, iArr[iFirstSelectedRow], iArr[iLastSelectedRow + 1]);
            }
            if (areColsFullySelected(iFirstSelectedCol, iLastSelectedCol)) {
                int[] iArr2 = this.colStarts;
                drawBottomBulgeFill(canvas, iArr2[iFirstSelectedCol], iArr2[iLastSelectedCol + 1]);
                return;
            }
            return;
        }
        if (this.leftBulge) {
            drawLeftBulgeFill(canvas, this.bulgeRowTop, this.bulgeRowBot);
        }
        if (this.bottomBulge) {
            drawBottomBulgeFill(canvas, this.bulgeColLeft, this.bulgeColRight);
        }
    }

    private void drawLeftBulgeFill(Canvas canvas, int i, int i2) {
        float fDpf2 = i - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = i2 + AndroidUtilities.dpf2(1.0f);
        float fDp = this.colStarts[0] - AndroidUtilities.dp(16.0f);
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float fCornerRadiusFor = cornerRadiusFor(this.colStarts[0], i);
        float fCornerRadiusFor2 = cornerRadiusFor(this.colStarts[0], i2);
        this.bulgePath.rewind();
        this.bulgePath.moveTo(this.colStarts[0] + fCornerRadiusFor, fDpf2);
        this.bulgePath.lineTo(fDp + fMin, fDpf2);
        float f = fMin * 2.0f;
        float f2 = fDp + f;
        this.arcRect.set(fDp, fDpf2, f2, fDpf2 + f);
        this.bulgePath.arcTo(this.arcRect, 270.0f, -90.0f);
        this.bulgePath.lineTo(fDp, fDpf3 - fMin);
        this.arcRect.set(fDp, fDpf3 - f, f2, fDpf3);
        this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
        this.bulgePath.lineTo(this.colStarts[0] + fCornerRadiusFor2, fDpf3);
        if (fCornerRadiusFor2 > 0.0f) {
            RectF rectF = this.arcRect;
            float f3 = this.colStarts[0];
            float f4 = fCornerRadiusFor2 * 2.0f;
            rectF.set(f3, fDpf3 - f4, f4 + f3, fDpf3);
            this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
        } else {
            this.bulgePath.lineTo(this.colStarts[0], fDpf3);
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

    private void drawBottomBulgeFill(Canvas canvas, int i, int i2) {
        float fDpf2 = i - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = i2 + AndroidUtilities.dpf2(1.0f);
        float f = this.rowStarts[this.model.rowCount];
        float fDp = AndroidUtilities.dp(16.0f) + f;
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float fCornerRadiusFor = cornerRadiusFor(i, this.rowStarts[this.model.rowCount]);
        float fCornerRadiusFor2 = cornerRadiusFor(i2, this.rowStarts[this.model.rowCount]);
        this.bulgePath.rewind();
        this.bulgePath.moveTo(fDpf2, f - fCornerRadiusFor);
        this.bulgePath.lineTo(fDpf2, fDp - fMin);
        float f2 = fMin * 2.0f;
        float f3 = fDp - f2;
        this.arcRect.set(fDpf2, f3, fDpf2 + f2, fDp);
        this.bulgePath.arcTo(this.arcRect, 180.0f, -90.0f);
        this.bulgePath.lineTo(fDpf3 - fMin, fDp);
        this.arcRect.set(fDpf3 - f2, f3, fDpf3, fDp);
        this.bulgePath.arcTo(this.arcRect, 90.0f, -90.0f);
        this.bulgePath.lineTo(fDpf3, f - fCornerRadiusFor2);
        if (fCornerRadiusFor2 > 0.0f) {
            float f4 = fCornerRadiusFor2 * 2.0f;
            this.arcRect.set(fDpf3 - f4, f - f4, fDpf3, f);
            this.bulgePath.arcTo(this.arcRect, 0.0f, 90.0f);
        } else {
            this.bulgePath.lineTo(fDpf3, f);
        }
        this.bulgePath.lineTo(fDpf2 + fCornerRadiusFor, f);
        if (fCornerRadiusFor > 0.0f) {
            float f5 = fCornerRadiusFor * 2.0f;
            this.arcRect.set(fDpf2, f - f5, f5 + fDpf2, f);
            this.bulgePath.arcTo(this.arcRect, 90.0f, 90.0f);
        } else {
            this.bulgePath.lineTo(fDpf2, f);
        }
        this.bulgePath.close();
        canvas.drawPath(this.bulgePath, this.bulgeFillPaint);
    }

    private void drawHandleDots(Canvas canvas) {
        float f;
        float f2;
        if (this.model == null) {
            return;
        }
        float fDpf2 = AndroidUtilities.dpf2(3.0f) / 2.0f;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = (this.colStarts[0] - AndroidUtilities.dp(6.0f)) - fDpf2;
        float fDp3 = this.rowStarts[this.model.rowCount] + AndroidUtilities.dp(6.0f) + fDpf2;
        if (hasAnySelection()) {
            int iFirstSelectedRow = firstSelectedRow();
            int iLastSelectedRow = lastSelectedRow();
            int iFirstSelectedCol = firstSelectedCol();
            int iLastSelectedCol = lastSelectedCol();
            if (iFirstSelectedRow < 0 || iFirstSelectedCol < 0) {
                return;
            }
            TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
            boolean zUseCombinedRowHandle = useCombinedRowHandle();
            int iAnchorRowOf = pagetablecellActiveCell == null ? iFirstSelectedRow : this.model.anchorRowOf(pagetablecellActiveCell);
            int iMin = pagetablecellActiveCell == null ? iAnchorRowOf + 1 : Math.min(iAnchorRowOf + TableModel.spanRow(pagetablecellActiveCell), this.model.rowCount);
            if (zUseCombinedRowHandle) {
                int[] iArr = this.rowStarts;
                f = iArr[iFirstSelectedRow] + iArr[iLastSelectedRow + 1];
            } else {
                int[] iArr2 = this.rowStarts;
                f = iArr2[iAnchorRowOf] + iArr2[iMin];
            }
            float f3 = f / 2.0f;
            this.dotPaint.setColor((zUseCombinedRowHandle && areRowsFullySelected(iFirstSelectedRow, iLastSelectedRow)) ? this.dotOnSelectionColor : this.dotColor);
            int i = -1;
            for (int i2 = 1; i <= i2; i2 = 1) {
                canvas.drawCircle(fDp2, (i * fDp) + f3, fDpf2, this.dotPaint);
                i++;
            }
            boolean zUseCombinedColHandle = useCombinedColHandle();
            int iAnchorColOf = pagetablecellActiveCell == null ? iFirstSelectedCol : this.model.anchorColOf(pagetablecellActiveCell);
            int iMin2 = pagetablecellActiveCell == null ? iAnchorColOf + 1 : Math.min(TableModel.spanCol(pagetablecellActiveCell) + iAnchorColOf, this.model.colCount);
            if (zUseCombinedColHandle) {
                int[] iArr3 = this.colStarts;
                f2 = iArr3[iFirstSelectedCol] + iArr3[iLastSelectedCol + 1];
            } else {
                int[] iArr4 = this.colStarts;
                f2 = iArr4[iAnchorColOf] + iArr4[iMin2];
            }
            float f4 = f2 / 2.0f;
            this.dotPaint.setColor((zUseCombinedColHandle && areColsFullySelected(iFirstSelectedCol, iLastSelectedCol)) ? this.dotOnSelectionColor : this.dotColor);
            int i3 = -1;
            for (int i4 = 1; i3 <= i4; i4 = 1) {
                canvas.drawCircle((i3 * fDp) + f4, fDp3, fDpf2, this.dotPaint);
                i3++;
            }
            return;
        }
        TL_iv.pageTableCell pagetablecellActiveCell2 = activeCell();
        if (pagetablecellActiveCell2 == null) {
            return;
        }
        int iAnchorRowOf2 = this.model.anchorRowOf(pagetablecellActiveCell2);
        int iAnchorColOf2 = this.model.anchorColOf(pagetablecellActiveCell2);
        if (iAnchorRowOf2 < 0 || iAnchorColOf2 < 0) {
            return;
        }
        int iSpanRow = TableModel.spanRow(pagetablecellActiveCell2);
        int iSpanCol = TableModel.spanCol(pagetablecellActiveCell2);
        int[] iArr5 = this.rowStarts;
        float f5 = (iArr5[iAnchorRowOf2] + iArr5[Math.min(iAnchorRowOf2 + iSpanRow, this.model.rowCount)]) / 2.0f;
        this.dotPaint.setColor(this.leftBulge ? this.dotOnSelectionColor : this.dotColor);
        int i5 = -1;
        for (int i6 = 1; i5 <= i6; i6 = 1) {
            canvas.drawCircle(fDp2, (i5 * fDp) + f5, fDpf2, this.dotPaint);
            i5++;
        }
        int[] iArr6 = this.colStarts;
        float f6 = (iArr6[iAnchorColOf2] + iArr6[Math.min(iAnchorColOf2 + iSpanCol, this.model.colCount)]) / 2.0f;
        this.dotPaint.setColor(this.bottomBulge ? this.dotOnSelectionColor : this.dotColor);
        for (int i7 = -1; i7 <= 1; i7++) {
            canvas.drawCircle((i7 * fDp) + f6, fDp3, fDpf2, this.dotPaint);
        }
    }

    public int rowHandleAtGrid(int i, int i2) {
        int iAnchorRowOf;
        if (this.model != null && i >= (this.colStarts[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && i < this.colStarts[0]) {
            if (useCombinedRowHandle()) {
                int iFirstSelectedRow = firstSelectedRow();
                int iLastSelectedRow = lastSelectedRow();
                if (iFirstSelectedRow < 0) {
                    return -1;
                }
                int[] iArr = this.rowStarts;
                if (i2 < iArr[iFirstSelectedRow] || i2 >= iArr[iLastSelectedRow + 1]) {
                    return -1;
                }
                return iFirstSelectedRow;
            }
            TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
            if (pagetablecellActiveCell == null || (iAnchorRowOf = this.model.anchorRowOf(pagetablecellActiveCell)) < 0) {
                return -1;
            }
            int iSpanRow = TableModel.spanRow(pagetablecellActiveCell);
            int[] iArr2 = this.rowStarts;
            int i3 = iArr2[iAnchorRowOf];
            int i4 = iArr2[Math.min(iSpanRow + iAnchorRowOf, this.model.rowCount)];
            if (i2 >= i3 && i2 < i4) {
                return iAnchorRowOf;
            }
        }
        return -1;
    }

    public int rowHandleEnd(int i) {
        return (useCombinedRowHandle() && i == firstSelectedRow()) ? lastSelectedRow() : i;
    }

    public int colHandleAtGrid(int i, int i2) {
        int i3;
        int iAnchorColOf;
        TableModel tableModel = this.model;
        if (tableModel != null && i2 >= (i3 = this.rowStarts[tableModel.rowCount]) && i2 < i3 + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f)) {
            if (useCombinedColHandle()) {
                int iFirstSelectedCol = firstSelectedCol();
                int iLastSelectedCol = lastSelectedCol();
                if (iFirstSelectedCol < 0) {
                    return -1;
                }
                int[] iArr = this.colStarts;
                if (i < iArr[iFirstSelectedCol] || i >= iArr[iLastSelectedCol + 1]) {
                    return -1;
                }
                return iFirstSelectedCol;
            }
            TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
            if (pagetablecellActiveCell == null || (iAnchorColOf = this.model.anchorColOf(pagetablecellActiveCell)) < 0) {
                return -1;
            }
            int iSpanCol = TableModel.spanCol(pagetablecellActiveCell);
            int[] iArr2 = this.colStarts;
            int i4 = iArr2[iAnchorColOf];
            int i5 = iArr2[Math.min(iSpanCol + iAnchorColOf, this.model.colCount)];
            if (i >= i4 && i < i5) {
                return iAnchorColOf;
            }
        }
        return -1;
    }

    public int colHandleEnd(int i) {
        return (useCombinedColHandle() && i == firstSelectedCol()) ? lastSelectedCol() : i;
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
        int[] iArr = this.colStarts;
        float f = iArr[0];
        int[] iArr2 = this.rowStarts;
        float f2 = iArr2[0];
        TableModel tableModel2 = this.model;
        rectF.set(f, f2, iArr[tableModel2.colCount], iArr2[tableModel2.rowCount]);
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
                    int[] iArr3 = this.colStarts;
                    int i2 = iArr3[iAnchorColOf];
                    int i3 = this.rowStarts[iAnchorRowOf];
                    int i4 = iArr3[Math.min(iAnchorColOf + iSpanCol, this.model.colCount)];
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
        int i;
        int i2;
        float strokeWidth = this.linePaint.getStrokeWidth() / 2.0f;
        float fDpf2 = AndroidUtilities.dpf2(10.0f);
        RectF rectF = this.selRect;
        int[] iArr = this.colStarts;
        float f = iArr[0] + strokeWidth;
        int[] iArr2 = this.rowStarts;
        float f2 = iArr2[0] + strokeWidth;
        TableModel tableModel = this.model;
        rectF.set(f, f2, iArr[tableModel.colCount] - strokeWidth, iArr2[tableModel.rowCount] - strokeWidth);
        canvas.drawRoundRect(this.selRect, fDpf2, fDpf2, this.linePaint);
        for (int i3 = 1; i3 < this.model.colCount; i3++) {
            int i4 = this.colStarts[i3];
            int i5 = 0;
            int i6 = -1;
            while (true) {
                TableModel tableModel2 = this.model;
                i2 = tableModel2.rowCount;
                if (i5 >= i2) {
                    break;
                }
                TL_iv.pageTableCell[] pagetablecellArr = tableModel2.grid[i5];
                if (pagetablecellArr[i3 - 1] != pagetablecellArr[i3]) {
                    if (i6 < 0) {
                        i6 = this.rowStarts[i5];
                    }
                } else if (i6 >= 0) {
                    float f3 = i4;
                    canvas.drawLine(f3, i6, f3, this.rowStarts[i5], this.linePaint);
                    i6 = -1;
                }
                i5++;
            }
            if (i6 >= 0) {
                float f4 = i4;
                canvas.drawLine(f4, i6, f4, this.rowStarts[i2], this.linePaint);
            }
        }
        for (int i7 = 1; i7 < this.model.rowCount; i7++) {
            int i8 = this.rowStarts[i7];
            int i9 = 0;
            int i10 = -1;
            while (true) {
                TableModel tableModel3 = this.model;
                i = tableModel3.colCount;
                if (i9 >= i) {
                    break;
                }
                TL_iv.pageTableCell[][] pagetablecellArr2 = tableModel3.grid;
                if (pagetablecellArr2[i7 - 1][i9] != pagetablecellArr2[i7][i9]) {
                    if (i10 < 0) {
                        i10 = this.colStarts[i9];
                    }
                } else if (i10 >= 0) {
                    float f5 = i8;
                    canvas.drawLine(i10, f5, this.colStarts[i9], f5, this.linePaint);
                    i10 = -1;
                }
                i9++;
            }
            if (i10 >= 0) {
                float f6 = i8;
                canvas.drawLine(i10, f6, this.colStarts[i], f6, this.linePaint);
            }
        }
    }
}
