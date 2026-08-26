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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;

public final class RichTableCellGrid extends ViewGroup {
    public final RectF arcRect;
    public boolean bottomBulge;
    public int bulgeColLeft;
    public int bulgeColRight;
    public final Paint bulgeFillPaint;
    public final Path bulgePath;
    public int bulgeRowBot;
    public int bulgeRowTop;
    public int[] colStarts;
    public int[] colWidths;
    public int dotColor;
    public int dotOnSelectionColor;
    public final Paint dotPaint;
    public final Paint headerPaint;
    public boolean leftBulge;
    public final Paint linePaint;
    public TableModel model;
    public final Theme.ResourcesProvider resourcesProvider;
    public int[] rowHeights;
    public int[] rowStarts;
    public final RectF selRect;
    public int selectedStrokeBaseAlpha;
    public final Paint selectedStrokePaint;
    public final AnimatedFloat selectionFade;
    public CellSelectionProvider selectionProvider;
    public final Paint stripPaint;

    public interface CellSelectionProvider {
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

    public final TL_iv.pageTableCell activeCell() {
        TL_iv.pageTableCell pagetablecell;
        TableModel tableModel = this.model;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (tableModel != null && tableModel.rowCount != 0 && tableModel.colCount != 0) {
            View viewFindFocus = findFocus();
            ViewParent parent = viewFindFocus == null ? null : viewFindFocus.getParent();
            while (true) {
                if (parent == null || parent == this) {
                    pagetablecell = null;
                    break;
                }
                if (parent instanceof RichTableCellHost) {
                    pagetablecell = ((RichTableCellHost) parent).cell;
                    break;
                }
                parent = parent.getParent();
            }
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.selectionProvider == null) {
                return null;
            }
            ArrayList arrayList = this.model.anchorsRowMajor;
            int size = arrayList.size();
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((TodoItemMenu$$ExternalSyntheticLambda3) this.selectionProvider).f$0).contains(pagetablecell3)) {
                    int iAnchorRowOf = this.model.anchorRowOf(pagetablecell3);
                    int iAnchorColOf = this.model.anchorColOf(pagetablecell3);
                    if (iAnchorRowOf < i || (iAnchorRowOf == i && iAnchorColOf < i2)) {
                        pagetablecell2 = pagetablecell3;
                        i = iAnchorRowOf;
                        i2 = iAnchorColOf;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void applyColors() {
        int i = Theme.key_table_border;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.linePaint.setColor(Theme.getColor(i, resourcesProvider));
        int color = Theme.getColor(Theme.key_switchTrack, resourcesProvider);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        this.headerPaint.setColor(Theme.getColor(Theme.key_table_background, resourcesProvider));
        this.stripPaint.setColor(Color.argb(20, iRed, iGreen, iBlue));
        this.selectedStrokeBaseAlpha = 255;
        int i2 = Theme.key_featuredStickers_addButton;
        this.selectedStrokePaint.setColor(Theme.getColor(i2, resourcesProvider));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.dotPaint;
        paint.setStyle(style);
        this.dotColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7, resourcesProvider);
        this.dotOnSelectionColor = Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider);
        paint.setColor(this.dotColor);
        Paint paint2 = this.bulgeFillPaint;
        paint2.setStyle(style);
        paint2.setColor(Theme.getColor(i2, resourcesProvider));
        invalidate();
    }

    public final boolean areColsFullySelected(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (i >= 0 && i < this.model.colCount) {
                for (int i3 = 0; i3 < this.model.rowCount; i3++) {
                    if (isSelected(i3, i)) {
                    }
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final boolean areRowsFullySelected(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (i >= 0 && i < this.model.rowCount) {
                for (int i3 = 0; i3 < this.model.colCount; i3++) {
                    if (isSelected(i, i3)) {
                    }
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final float cornerRadiusFor(int i, int i2) {
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

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TableModel tableModel;
        int i;
        Canvas canvas2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int iAnchorRowOf;
        int iMin;
        int i6;
        int i7;
        int iMin2;
        float f2;
        TL_iv.pageBlockTable pageblocktable;
        int i8;
        int i9;
        Canvas canvas3 = canvas;
        this.bottomBulge = false;
        this.leftBulge = false;
        TL_iv.pageTableCell pagetablecellActiveCell = activeCell();
        if (pagetablecellActiveCell != null) {
            int iAnchorRowOf2 = this.model.anchorRowOf(pagetablecellActiveCell);
            int iAnchorColOf = this.model.anchorColOf(pagetablecellActiveCell);
            if (iAnchorRowOf2 >= 0 && iAnchorColOf >= 0) {
                int i10 = pagetablecellActiveCell.rowspan;
                if (i10 == 0) {
                    i10 = 1;
                }
                int i11 = pagetablecellActiveCell.colspan;
                if (i11 == 0) {
                    i11 = 1;
                }
                if (iAnchorRowOf2 >= 0 && iAnchorRowOf2 < this.model.rowCount) {
                    int i12 = 0;
                    while (true) {
                        TableModel tableModel2 = this.model;
                        if (i12 >= tableModel2.colCount) {
                            this.leftBulge = true;
                            int[] iArr = this.rowStarts;
                            this.bulgeRowTop = iArr[iAnchorRowOf2];
                            this.bulgeRowBot = iArr[Math.min(iAnchorRowOf2 + i10, tableModel2.rowCount)];
                            break;
                        }
                        if (!isSelected(iAnchorRowOf2, i12)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (iAnchorColOf >= 0 && iAnchorColOf < this.model.colCount) {
                    int i13 = 0;
                    while (true) {
                        TableModel tableModel3 = this.model;
                        if (i13 >= tableModel3.rowCount) {
                            this.bottomBulge = true;
                            int[] iArr2 = this.colStarts;
                            this.bulgeColLeft = iArr2[iAnchorColOf];
                            this.bulgeColRight = iArr2[Math.min(iAnchorColOf + i11, tableModel3.colCount)];
                            break;
                        }
                        if (!isSelected(i13, iAnchorColOf)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        TableModel tableModel4 = this.model;
        RectF rectF = this.selRect;
        if (tableModel4 != null && tableModel4.rowCount != 0 && tableModel4.colCount != 0) {
            TL_iv.pageBlockTable pageblocktable2 = tableModel4.block;
            boolean z = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            int[] iArr3 = this.colStarts;
            float f3 = iArr3[0];
            int[] iArr4 = this.rowStarts;
            float f4 = iArr4[0];
            TableModel tableModel5 = this.model;
            rectF.set(f3, f4, iArr3[tableModel5.colCount], iArr4[tableModel5.rowCount]);
            Path path = this.bulgePath;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof RichTableCellHost) {
                    RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                    int iAnchorRowOf3 = this.model.anchorRowOf(richTableCellHost.cell);
                    int iAnchorColOf2 = this.model.anchorColOf(richTableCellHost.cell);
                    if (iAnchorRowOf3 >= 0 && iAnchorColOf2 >= 0) {
                        TL_iv.pageTableCell pagetablecell = richTableCellHost.cell;
                        int i15 = pagetablecell.colspan;
                        if (i15 == 0) {
                            i15 = 1;
                        }
                        int i16 = pagetablecell.rowspan;
                        if (i16 == 0) {
                            i16 = 1;
                        }
                        int[] iArr5 = this.colStarts;
                        int i17 = iArr5[iAnchorColOf2];
                        int i18 = this.rowStarts[iAnchorRowOf3];
                        int i19 = iArr5[Math.min(iAnchorColOf2 + i15, this.model.colCount)];
                        int i20 = this.rowStarts[Math.min(i16 + iAnchorRowOf3, this.model.rowCount)];
                        if (richTableCellHost.cell.header) {
                            canvas3.drawRect(i17, i18, i19, i20, this.headerPaint);
                        } else if (z && iAnchorRowOf3 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i17, i18, i19, i20, this.stripPaint);
                        }
                        canvas3 = canvas;
                    }
                }
            }
            canvas3.restore();
        }
        super.dispatchDraw(canvas);
        if (hasAnySelection()) {
            int iFirstSelectedRow = firstSelectedRow();
            int iLastSelectedRow = lastSelectedRow();
            int iFirstSelectedCol = firstSelectedCol();
            int iLastSelectedCol = lastSelectedCol();
            if (areRowsFullySelected(iFirstSelectedRow, iLastSelectedRow)) {
                int[] iArr6 = this.rowStarts;
                drawLeftBulgeFill(canvas3, iArr6[iFirstSelectedRow], iArr6[iLastSelectedRow + 1]);
            }
            if (areColsFullySelected(iFirstSelectedCol, iLastSelectedCol)) {
                int[] iArr7 = this.colStarts;
                drawBottomBulgeFill(canvas3, iArr7[iFirstSelectedCol], iArr7[iLastSelectedCol + 1]);
            }
        } else {
            if (this.leftBulge) {
                drawLeftBulgeFill(canvas3, this.bulgeRowTop, this.bulgeRowBot);
            }
            if (this.bottomBulge) {
                drawBottomBulgeFill(canvas3, this.bulgeColLeft, this.bulgeColRight);
            }
        }
        TableModel tableModel6 = this.model;
        if (tableModel6 != null && (pageblocktable = tableModel6.block) != null && pageblocktable.bordered) {
            Paint paint = this.linePaint;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float fDpf2 = AndroidUtilities.dpf2(10.0f);
            int[] iArr8 = this.colStarts;
            float f5 = iArr8[0] + strokeWidth;
            int[] iArr9 = this.rowStarts;
            float f6 = iArr9[0] + strokeWidth;
            TableModel tableModel7 = this.model;
            rectF.set(f5, f6, iArr8[tableModel7.colCount] - strokeWidth, iArr9[tableModel7.rowCount] - strokeWidth);
            canvas3.drawRoundRect(rectF, fDpf2, fDpf2, paint);
            int i21 = 1;
            while (i21 < this.model.colCount) {
                int i22 = this.colStarts[i21];
                int i23 = -1;
                int i24 = 0;
                while (true) {
                    TableModel tableModel8 = this.model;
                    i9 = tableModel8.rowCount;
                    if (i24 >= i9) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = tableModel8.grid[i24];
                    if (pagetablecellArr[i21 - 1] != pagetablecellArr[i21]) {
                        if (i23 < 0) {
                            i23 = this.rowStarts[i24];
                        }
                    } else if (i23 >= 0) {
                        float f7 = i22;
                        canvas3.drawLine(f7, i23, f7, this.rowStarts[i24], paint);
                        i23 = -1;
                    }
                    i24++;
                    canvas3 = canvas;
                }
                if (i23 >= 0) {
                    float f8 = i22;
                    canvas.drawLine(f8, i23, f8, this.rowStarts[i9], paint);
                }
                i21++;
                canvas3 = canvas;
            }
            for (int i25 = 1; i25 < this.model.rowCount; i25++) {
                int i26 = this.rowStarts[i25];
                int i27 = -1;
                int i28 = 0;
                while (true) {
                    TableModel tableModel9 = this.model;
                    i8 = tableModel9.colCount;
                    if (i28 >= i8) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = tableModel9.grid;
                    if (pagetablecellArr2[i25 - 1][i28] != pagetablecellArr2[i25][i28]) {
                        if (i27 < 0) {
                            i27 = this.colStarts[i28];
                        }
                    } else if (i27 >= 0) {
                        float f9 = i26;
                        canvas.drawLine(i27, f9, this.colStarts[i28], f9, paint);
                        i27 = -1;
                    }
                    i28++;
                }
                if (i27 >= 0) {
                    float f10 = i27;
                    float f11 = i26;
                    canvas.drawLine(f10, f11, this.colStarts[i8], f11, paint);
                }
            }
        }
        if (this.model != null) {
            float f12 = this.selectionFade.set(hasAnySelection() ? 1.0f : 0.0f, false);
            if (f12 <= 0.001f) {
                canvas2 = canvas;
            } else {
                Paint paint2 = this.selectedStrokePaint;
                paint2.setAlpha((int) (this.selectedStrokeBaseAlpha * f12));
                paint2.setStrokeWidth(Math.max(0.4f, f12) * AndroidUtilities.dpf2(2.0f));
                int i29 = 0;
                while (true) {
                    int i30 = this.model.rowCount;
                    if (i29 > i30) {
                        break;
                    }
                    int i31 = i29 < i30 ? this.rowStarts[i29] : this.rowStarts[i30];
                    int i32 = -1;
                    int i33 = 0;
                    while (true) {
                        i4 = this.model.colCount;
                        if (i33 >= i4) {
                            break;
                        }
                        if (isSelected(i29 - 1, i33) != isSelected(i29, i33)) {
                            if (i32 < 0) {
                                i32 = this.colStarts[i33];
                            }
                        } else if (i32 >= 0) {
                            int i34 = this.colStarts[i33];
                            if (i34 > i32) {
                                float fCornerRadiusFor = cornerRadiusFor(i32, i31) + i32;
                                float fCornerRadiusFor2 = i34 - cornerRadiusFor(i34, i31);
                                if (fCornerRadiusFor2 > fCornerRadiusFor) {
                                    float f13 = i31;
                                    canvas.drawLine(fCornerRadiusFor, f13, fCornerRadiusFor2, f13, paint2);
                                }
                            }
                            i32 = -1;
                        }
                        i33++;
                    }
                    if (i32 >= 0 && (i5 = this.colStarts[i4]) > i32) {
                        float fCornerRadiusFor3 = cornerRadiusFor(i32, i31) + i32;
                        float fCornerRadiusFor4 = i5 - cornerRadiusFor(i5, i31);
                        if (fCornerRadiusFor4 > fCornerRadiusFor3) {
                            float f14 = i31;
                            canvas.drawLine(fCornerRadiusFor3, f14, fCornerRadiusFor4, f14, paint2);
                        }
                    }
                    i29++;
                }
                int i35 = 0;
                while (true) {
                    tableModel = this.model;
                    i = tableModel.colCount;
                    if (i35 > i) {
                        break;
                    }
                    int i36 = i35 < i ? this.colStarts[i35] : this.colStarts[i];
                    int i37 = -1;
                    int i38 = 0;
                    while (true) {
                        i2 = this.model.rowCount;
                        if (i38 >= i2) {
                            break;
                        }
                        if (isSelected(i38, i35 - 1) != isSelected(i38, i35)) {
                            if (i37 < 0) {
                                i37 = this.rowStarts[i38];
                            }
                        } else if (i37 >= 0) {
                            int i39 = this.rowStarts[i38];
                            if (i39 > i37) {
                                float fCornerRadiusFor5 = i37 + cornerRadiusFor(i36, i37);
                                float fCornerRadiusFor6 = i39 - cornerRadiusFor(i36, i39);
                                if (fCornerRadiusFor6 > fCornerRadiusFor5) {
                                    float f15 = i36;
                                    canvas.drawLine(f15, fCornerRadiusFor5, f15, fCornerRadiusFor6, paint2);
                                }
                            }
                            i37 = -1;
                        }
                        i38++;
                    }
                    if (i37 >= 0 && (i3 = this.rowStarts[i2]) > i37) {
                        float fCornerRadiusFor7 = i37 + cornerRadiusFor(i36, i37);
                        float fCornerRadiusFor8 = i3 - cornerRadiusFor(i36, i3);
                        if (fCornerRadiusFor8 > fCornerRadiusFor7) {
                            float f16 = i36;
                            canvas.drawLine(f16, fCornerRadiusFor7, f16, fCornerRadiusFor8, paint2);
                        }
                    }
                    i35++;
                }
                canvas2 = canvas;
                int i40 = tableModel.rowCount;
                drawSelCornerArc(canvas2, this.colStarts[0], this.rowStarts[0], 180.0f);
                drawSelCornerArc(canvas2, this.colStarts[i], this.rowStarts[0], 270.0f);
                drawSelCornerArc(canvas2, this.colStarts[0], this.rowStarts[i40], 90.0f);
                drawSelCornerArc(canvas2, this.colStarts[i], this.rowStarts[i40], 0.0f);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.model == null) {
            return;
        }
        float fDpf3 = AndroidUtilities.dpf2(3.0f) / 2.0f;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = (this.colStarts[0] - AndroidUtilities.dp(6.0f)) - fDpf3;
        float fDp3 = AndroidUtilities.dp(6.0f) + this.rowStarts[this.model.rowCount] + fDpf3;
        boolean zHasAnySelection = hasAnySelection();
        Paint paint3 = this.dotPaint;
        if (!zHasAnySelection) {
            TL_iv.pageTableCell pagetablecellActiveCell2 = activeCell();
            if (pagetablecellActiveCell2 == null) {
                return;
            }
            int iAnchorRowOf4 = this.model.anchorRowOf(pagetablecellActiveCell2);
            int iAnchorColOf3 = this.model.anchorColOf(pagetablecellActiveCell2);
            if (iAnchorRowOf4 < 0 || iAnchorColOf3 < 0) {
                return;
            }
            int i41 = pagetablecellActiveCell2.rowspan;
            if (i41 == 0) {
                i41 = 1;
            }
            int i42 = pagetablecellActiveCell2.colspan;
            if (i42 == 0) {
                i42 = 1;
            }
            int[] iArr10 = this.rowStarts;
            float f17 = (iArr10[iAnchorRowOf4] + iArr10[Math.min(iAnchorRowOf4 + i41, this.model.rowCount)]) / 2.0f;
            paint3.setColor(this.leftBulge ? this.dotOnSelectionColor : this.dotColor);
            for (int i43 = -1; i43 <= 1; i43++) {
                canvas2.drawCircle(fDp2, (i43 * fDp) + f17, fDpf3, paint3);
            }
            int[] iArr11 = this.colStarts;
            float f18 = (iArr11[iAnchorColOf3] + iArr11[Math.min(iAnchorColOf3 + i42, this.model.colCount)]) / 2.0f;
            paint3.setColor(this.bottomBulge ? this.dotOnSelectionColor : this.dotColor);
            for (int i44 = -1; i44 <= 1; i44++) {
                canvas2.drawCircle((i44 * fDp) + f18, fDp3, fDpf3, paint3);
            }
            return;
        }
        int iFirstSelectedRow2 = firstSelectedRow();
        int iLastSelectedRow2 = lastSelectedRow();
        int iFirstSelectedCol2 = firstSelectedCol();
        int iLastSelectedCol2 = lastSelectedCol();
        if (iFirstSelectedRow2 < 0 || iFirstSelectedCol2 < 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecellActiveCell3 = activeCell();
        boolean zUseCombinedRowHandle = useCombinedRowHandle();
        if (pagetablecellActiveCell3 == null) {
            iAnchorRowOf = iFirstSelectedRow2;
            f = 2.0f;
        } else {
            f = 2.0f;
            iAnchorRowOf = this.model.anchorRowOf(pagetablecellActiveCell3);
        }
        if (pagetablecellActiveCell3 == null) {
            iMin = iAnchorRowOf + 1;
        } else {
            int i45 = pagetablecellActiveCell3.rowspan;
            if (i45 == 0) {
                i45 = 1;
            }
            iMin = Math.min(i45 + iAnchorRowOf, this.model.rowCount);
        }
        if (zUseCombinedRowHandle) {
            int[] iArr12 = this.rowStarts;
            i6 = iArr12[iFirstSelectedRow2];
            i7 = iArr12[iLastSelectedRow2 + 1];
        } else {
            int[] iArr13 = this.rowStarts;
            i6 = iArr13[iAnchorRowOf];
            i7 = iArr13[iMin];
        }
        float f19 = (i6 + i7) / f;
        paint3.setColor((zUseCombinedRowHandle && areRowsFullySelected(iFirstSelectedRow2, iLastSelectedRow2)) ? this.dotOnSelectionColor : this.dotColor);
        for (int i46 = -1; i46 <= 1; i46++) {
            canvas2.drawCircle(fDp2, (i46 * fDp) + f19, fDpf3, paint3);
        }
        boolean zUseCombinedColHandle = useCombinedColHandle();
        int iAnchorColOf4 = pagetablecellActiveCell3 == null ? iFirstSelectedCol2 : this.model.anchorColOf(pagetablecellActiveCell3);
        if (pagetablecellActiveCell3 == null) {
            iMin2 = iAnchorColOf4 + 1;
        } else {
            int i47 = pagetablecellActiveCell3.colspan;
            if (i47 == 0) {
                i47 = 1;
            }
            iMin2 = Math.min(i47 + iAnchorColOf4, this.model.colCount);
        }
        if (zUseCombinedColHandle) {
            int[] iArr14 = this.colStarts;
            f2 = iArr14[iFirstSelectedCol2] + iArr14[iLastSelectedCol2 + 1];
        } else {
            int[] iArr15 = this.colStarts;
            f2 = iArr15[iAnchorColOf4] + iArr15[iMin2];
        }
        float f20 = f2 / f;
        paint3.setColor((zUseCombinedColHandle && areColsFullySelected(iFirstSelectedCol2, iLastSelectedCol2)) ? this.dotOnSelectionColor : this.dotColor);
        for (int i48 = -1; i48 <= 1; i48++) {
            canvas2.drawCircle((i48 * fDp) + f20, fDp3, fDpf3, paint3);
        }
    }

    public final void drawBottomBulgeFill(Canvas canvas, int i, int i2) {
        float fDpf2 = i - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(1.0f) + i2;
        float f = this.rowStarts[this.model.rowCount];
        float fDp = AndroidUtilities.dp(16.0f) + f;
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float fCornerRadiusFor = cornerRadiusFor(i, this.rowStarts[this.model.rowCount]);
        float fCornerRadiusFor2 = cornerRadiusFor(i2, this.rowStarts[this.model.rowCount]);
        Path path = this.bulgePath;
        path.rewind();
        path.moveTo(fDpf2, f - fCornerRadiusFor);
        path.lineTo(fDpf2, fDp - fMin);
        RectF rectF = this.arcRect;
        float f2 = fMin * 2.0f;
        float f3 = fDp - f2;
        rectF.set(fDpf2, f3, fDpf2 + f2, fDp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(fDpf3 - fMin, fDp);
        rectF.set(fDpf3 - f2, f3, fDpf3, fDp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(fDpf3, f - fCornerRadiusFor2);
        if (fCornerRadiusFor2 > 0.0f) {
            float f4 = fCornerRadiusFor2 * 2.0f;
            rectF.set(fDpf3 - f4, f - f4, fDpf3, f);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(fDpf3, f);
        }
        path.lineTo(fDpf2 + fCornerRadiusFor, f);
        if (fCornerRadiusFor > 0.0f) {
            float f5 = fCornerRadiusFor * 2.0f;
            rectF.set(fDpf2, f - f5, f5 + fDpf2, f);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(fDpf2, f);
        }
        path.close();
        canvas.drawPath(path, this.bulgeFillPaint);
    }

    public final void drawLeftBulgeFill(Canvas canvas, int i, int i2) {
        float fDpf2 = i - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(1.0f) + i2;
        float fDp = this.colStarts[0] - AndroidUtilities.dp(16.0f);
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float fCornerRadiusFor = cornerRadiusFor(this.colStarts[0], i);
        float fCornerRadiusFor2 = cornerRadiusFor(this.colStarts[0], i2);
        Path path = this.bulgePath;
        path.rewind();
        path.moveTo(this.colStarts[0] + fCornerRadiusFor, fDpf2);
        path.lineTo(fDp + fMin, fDpf2);
        RectF rectF = this.arcRect;
        float f = fMin * 2.0f;
        float f2 = fDp + f;
        rectF.set(fDp, fDpf2, f2, fDpf2 + f);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(fDp, fDpf3 - fMin);
        rectF.set(fDp, fDpf3 - f, f2, fDpf3);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.colStarts[0] + fCornerRadiusFor2, fDpf3);
        if (fCornerRadiusFor2 > 0.0f) {
            float f3 = this.colStarts[0];
            float f4 = fCornerRadiusFor2 * 2.0f;
            rectF.set(f3, fDpf3 - f4, f4 + f3, fDpf3);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.colStarts[0], fDpf3);
        }
        path.lineTo(this.colStarts[0], fDpf2 + fCornerRadiusFor);
        if (fCornerRadiusFor > 0.0f) {
            float f5 = this.colStarts[0];
            float f6 = fCornerRadiusFor * 2.0f;
            rectF.set(f5, fDpf2, f5 + f6, f6 + fDpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.colStarts[0], fDpf2);
        }
        path.close();
        canvas.drawPath(path, this.bulgeFillPaint);
    }

    public final void drawSelCornerArc(Canvas canvas, int i, int i2, float f) {
        float fCornerRadiusFor = cornerRadiusFor(i, i2);
        if (fCornerRadiusFor <= 0.0f) {
            return;
        }
        float f2 = i == this.colStarts[0] ? i + fCornerRadiusFor : i - fCornerRadiusFor;
        float f3 = i2 == this.rowStarts[0] ? i2 + fCornerRadiusFor : i2 - fCornerRadiusFor;
        RectF rectF = this.arcRect;
        rectF.set(f2 - fCornerRadiusFor, f3 - fCornerRadiusFor, f2 + fCornerRadiusFor, f3 + fCornerRadiusFor);
        canvas.drawArc(rectF, f, 90.0f, false, this.selectedStrokePaint);
    }

    public final int firstSelectedCol() {
        int i = 0;
        while (true) {
            int i2 = this.model.colCount;
            if (i >= i2) {
                return -1;
            }
            if (i >= 0 && i < i2) {
                for (int i3 = 0; i3 < this.model.rowCount; i3++) {
                    if (isSelected(i3, i)) {
                        return i;
                    }
                }
            }
            i++;
        }
    }

    public final int firstSelectedRow() {
        int i = 0;
        while (true) {
            int i2 = this.model.rowCount;
            if (i >= i2) {
                return -1;
            }
            if (i >= 0 && i < i2) {
                for (int i3 = 0; i3 < this.model.colCount; i3++) {
                    if (isSelected(i, i3)) {
                        return i;
                    }
                }
            }
            i++;
        }
    }

    public TableModel getModel() {
        return this.model;
    }

    public final boolean hasAnySelection() {
        TableModel tableModel = this.model;
        if (tableModel != null && this.selectionProvider != null) {
            ArrayList arrayList = tableModel.anchorsRowMajor;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((LinkedHashSet) ((TodoItemMenu$$ExternalSyntheticLambda3) this.selectionProvider).f$0).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final RichTableCellHost hostForAnchor(TL_iv.pageTableCell pagetablecell) {
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

    public final boolean isSelected(int i, int i2) {
        CellSelectionProvider cellSelectionProvider;
        TableModel tableModel = this.model;
        if (tableModel == null || (cellSelectionProvider = this.selectionProvider) == null || i < 0 || i >= tableModel.rowCount || i2 < 0 || i2 >= tableModel.colCount) {
            return false;
        }
        return ((LinkedHashSet) ((TodoItemMenu$$ExternalSyntheticLambda3) cellSelectionProvider).f$0).contains(tableModel.grid[i][i2]);
    }

    public final int lastSelectedCol() {
        for (int i = this.model.colCount - 1; i >= 0; i--) {
            if (i >= 0 && i < this.model.colCount) {
                for (int i2 = 0; i2 < this.model.rowCount; i2++) {
                    if (isSelected(i2, i)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public final int lastSelectedRow() {
        for (int i = this.model.rowCount - 1; i >= 0; i--) {
            if (i >= 0 && i < this.model.rowCount) {
                for (int i2 = 0; i2 < this.model.colCount; i2++) {
                    if (isSelected(i, i2)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public final void onMeasure(int i, int i2) {
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
        int iM = i7 == 2 ? BotFullscreenButtons$$ExternalSyntheticOutline1.m(size / 2, i8 * 4, 0) : Math.max(0, Math.round(size / 1.5f));
        float f = i8 * 2;
        int iM2 = MessageObject$$ExternalSyntheticOutline0.m(iM, f, iDp5);
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
                TL_iv.pageTableCell pagetablecell = richTableCellHost.cell;
                int i11 = pagetablecell.colspan;
                if (i11 == 0) {
                    i11 = 1;
                }
                if (i11 == 1 && (iAnchorColOf = this.model.anchorColOf(pagetablecell)) >= 0 && iAnchorColOf < i7) {
                    RichEditText richEditText = richTableCellHost.editText;
                    int iDp6 = AndroidUtilities.dp(f) + Math.round(Layout.getDesiredWidth(richEditText.getText(), richEditText.getPaint()));
                    int[] iArr = this.colWidths;
                    iArr[iAnchorColOf] = Math.max(iArr[iAnchorColOf], Math.min(iM2, iDp6));
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost2 = (RichTableCellHost) childAt2;
                TL_iv.pageTableCell pagetablecell2 = richTableCellHost2.cell;
                int i13 = pagetablecell2.colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                if (i13 > i3) {
                    int iAnchorColOf2 = this.model.anchorColOf(pagetablecell2);
                    int iMin = Math.min(i7, i13 + iAnchorColOf2);
                    if (iAnchorColOf2 >= 0 && iAnchorColOf2 < iMin) {
                        int i14 = 0;
                        for (int i15 = iAnchorColOf2; i15 < iMin; i15++) {
                            i14 += this.colWidths[i15];
                        }
                        RichEditText richEditText2 = richTableCellHost2.editText;
                        int iMin2 = Math.min((iMin - iAnchorColOf2) * iM2, AndroidUtilities.dp(f) + Math.round(Layout.getDesiredWidth(richEditText2.getText(), richEditText2.getPaint()))) - i14;
                        while (iAnchorColOf2 < iMin && iMin2 > 0) {
                            int i16 = iMin - iAnchorColOf2;
                            int i17 = ((iMin2 + i16) - 1) / i16;
                            int[] iArr2 = this.colWidths;
                            iArr2[iAnchorColOf2] = iArr2[iAnchorColOf2] + i17;
                            iMin2 -= i17;
                            iAnchorColOf2++;
                        }
                    }
                }
            }
            i12++;
            i3 = 1;
        }
        int i18 = 0;
        for (int i19 : this.colWidths) {
            i18 += i19;
        }
        if (i18 < size && i7 > 0) {
            int i20 = size - i18;
            int i21 = 0;
            while (i21 < i7) {
                int iRound = i21 == i7 + (-1) ? i20 : Math.round((this.colWidths[i21] * i20) / i18);
                int[] iArr3 = this.colWidths;
                int i22 = iArr3[i21] + iRound;
                iArr3[i21] = i22;
                i20 -= iRound;
                i18 -= i22 - iRound;
                i21++;
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i23 = 0;
        while (i23 < getChildCount()) {
            View childAt3 = getChildAt(i23);
            if (childAt3 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost3 = (RichTableCellHost) childAt3;
                int iAnchorRowOf = this.model.anchorRowOf(richTableCellHost3.cell);
                int iAnchorColOf3 = this.model.anchorColOf(richTableCellHost3.cell);
                int i24 = richTableCellHost3.cell.colspan;
                if (i24 == 0) {
                    i24 = 1;
                }
                i5 = i23;
                int i25 = 0;
                for (int i26 = iAnchorColOf3; i26 < iAnchorColOf3 + i24 && i26 < i7; i26++) {
                    i25 += this.colWidths[i26];
                }
                richTableCellHost3.measure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), iMakeMeasureSpec);
                int i27 = richTableCellHost3.cell.rowspan;
                if (i27 == 0) {
                    i27 = 1;
                }
                if (i27 == 1) {
                    int measuredHeight = richTableCellHost3.getMeasuredHeight();
                    int[] iArr4 = this.rowHeights;
                    if (measuredHeight > iArr4[iAnchorRowOf]) {
                        iArr4[iAnchorRowOf] = richTableCellHost3.getMeasuredHeight();
                    }
                }
            } else {
                i5 = i23;
            }
            i23 = i5 + 1;
        }
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            View childAt4 = getChildAt(i28);
            if (childAt4 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost4 = (RichTableCellHost) childAt4;
                int iAnchorRowOf2 = this.model.anchorRowOf(richTableCellHost4.cell);
                int i29 = richTableCellHost4.cell.rowspan;
                if (i29 == 0) {
                    i29 = 1;
                }
                if (i29 > 1) {
                    int i30 = iAnchorRowOf2;
                    int i31 = 0;
                    while (true) {
                        i4 = iAnchorRowOf2 + i29;
                        if (i30 >= i4 || i30 >= i6) {
                            break;
                        }
                        i31 += this.rowHeights[i30];
                        i30++;
                    }
                    int measuredHeight2 = richTableCellHost4.getMeasuredHeight();
                    if (measuredHeight2 > i31) {
                        int i32 = measuredHeight2 - i31;
                        int iMax = i32 / Math.max(i29, 1);
                        int iMax2 = i32 % Math.max(i29, 1);
                        while (iAnchorRowOf2 < i4 && iAnchorRowOf2 < i6) {
                            int[] iArr5 = this.rowHeights;
                            iArr5[iAnchorRowOf2] = iMax + (iMax2 > 0 ? 1 : 0) + iArr5[iAnchorRowOf2];
                            if (iMax2 > 0) {
                                iMax2--;
                            }
                            iAnchorRowOf2++;
                        }
                    }
                }
            }
        }
        for (int i33 = 0; i33 < getChildCount(); i33++) {
            View childAt5 = getChildAt(i33);
            if (childAt5 instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost5 = (RichTableCellHost) childAt5;
                int iAnchorRowOf3 = this.model.anchorRowOf(richTableCellHost5.cell);
                int iAnchorColOf4 = this.model.anchorColOf(richTableCellHost5.cell);
                TL_iv.pageTableCell pagetablecell3 = richTableCellHost5.cell;
                int i34 = pagetablecell3.colspan;
                if (i34 == 0) {
                    i34 = 1;
                }
                int i35 = pagetablecell3.rowspan;
                if (i35 == 0) {
                    i35 = 1;
                }
                int i36 = 0;
                for (int i37 = iAnchorColOf4; i37 < iAnchorColOf4 + i34 && i37 < i7; i37++) {
                    i36 += this.colWidths[i37];
                }
                int i38 = 0;
                for (int i39 = iAnchorRowOf3; i39 < iAnchorRowOf3 + i35 && i39 < i6; i39++) {
                    i38 += this.rowHeights[i39];
                }
                richTableCellHost5.measure(View.MeasureSpec.makeMeasureSpec(i36, 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
            }
        }
        int[] iArr6 = new int[i7 + 1];
        this.colStarts = iArr6;
        iArr6[0] = iDp;
        int i40 = 0;
        while (i40 < i7) {
            int[] iArr7 = this.colStarts;
            int i41 = i40 + 1;
            iArr7[i41] = iArr7[i40] + this.colWidths[i40];
            i40 = i41;
        }
        int[] iArr8 = new int[i6 + 1];
        this.rowStarts = iArr8;
        iArr8[0] = iDp2;
        int i42 = 0;
        while (i42 < i6) {
            int[] iArr9 = this.rowStarts;
            int i43 = i42 + 1;
            iArr9[i43] = iArr9[i42] + this.rowHeights[i42];
            i42 = i43;
        }
        setMeasuredDimension(Math.max(this.colStarts[i7] + iDp3, size + iDp + iDp3), this.rowStarts[i6] + iDp4);
    }

    public final void rebuildHosts() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof RichTableCellHost) {
                removeViewAt(childCount);
            }
        }
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        int size = tableModel.anchorsRowMajor.size();
        for (int i = 0; i < size; i++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchorsRowMajor.get(i);
            RichTableCellHost richTableCellHost = new RichTableCellHost(getContext(), this.resourcesProvider);
            richTableCellHost.setCompact(this.model.block.compact);
            richTableCellHost.bind(pagetablecell);
            addView(richTableCellHost);
        }
    }

    public void setModel(TableModel tableModel) {
        this.model = tableModel;
        rebuildHosts();
    }

    public void setSelectionProvider(CellSelectionProvider cellSelectionProvider) {
        this.selectionProvider = cellSelectionProvider;
        invalidate();
    }

    public final boolean useCombinedColHandle() {
        if (hasAnySelection()) {
            return !areRowsFullySelected(firstSelectedRow(), lastSelectedRow()) || areColsFullySelected(firstSelectedCol(), lastSelectedCol());
        }
        return false;
    }

    public final boolean useCombinedRowHandle() {
        if (hasAnySelection()) {
            return !areColsFullySelected(firstSelectedCol(), lastSelectedCol()) || areRowsFullySelected(firstSelectedRow(), lastSelectedRow());
        }
        return false;
    }
}
