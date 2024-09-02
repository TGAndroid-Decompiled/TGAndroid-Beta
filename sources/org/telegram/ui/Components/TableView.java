package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class TableView extends android.widget.TableLayout {
    private final Paint backgroundPaint;
    private final Paint borderPaint;
    private final float hw;
    private final Path path;
    private final float[] radii;
    private final Theme.ResourcesProvider resourcesProvider;
    private final float w;

    public TableView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.path = new Path();
        this.radii = new float[8];
        this.backgroundPaint = new Paint(1);
        this.borderPaint = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.w = max;
        this.hw = max / 2.0f;
        this.resourcesProvider = resourcesProvider;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public void addRowUnpadded(CharSequence charSequence, View view) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new TableRowTitle(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new TableRowContent(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public void addRow(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        textView.setTextSize(1, 14.0f);
        textView.setText(charSequence2);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new TableRowTitle(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new TableRowContent(this, textView), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public static class TableRowTitle extends TextView {
        private boolean first;
        private boolean last;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TableView table;

        public TableRowTitle(TableView tableView, CharSequence charSequence) {
            super(tableView.getContext());
            this.table = tableView;
            Theme.ResourcesProvider resourcesProvider = tableView.resourcesProvider;
            this.resourcesProvider = resourcesProvider;
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            setTypeface(AndroidUtilities.bold());
            setTextSize(1, 14.0f);
            setText(charSequence);
        }

        public void setFirstLast(boolean z, boolean z2) {
            if (this.first == z && this.last == z2) {
                return;
            }
            this.first = z;
            this.last = z2;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (!this.first && !this.last) {
                canvas.drawRect(this.table.hw, this.table.hw, getWidth() + this.table.hw, getHeight() + this.table.hw, this.table.backgroundPaint);
                canvas.drawRect(this.table.hw, this.table.hw, getWidth() + this.table.hw, getHeight() + this.table.hw, this.table.borderPaint);
            } else {
                float dp = AndroidUtilities.dp(4.0f);
                float[] fArr = this.table.radii;
                float[] fArr2 = this.table.radii;
                float f = this.first ? dp : 0.0f;
                fArr2[1] = f;
                fArr[0] = f;
                float[] fArr3 = this.table.radii;
                this.table.radii[3] = 0.0f;
                fArr3[2] = 0.0f;
                float[] fArr4 = this.table.radii;
                this.table.radii[5] = 0.0f;
                fArr4[4] = 0.0f;
                float[] fArr5 = this.table.radii;
                float[] fArr6 = this.table.radii;
                if (!this.last) {
                    dp = 0.0f;
                }
                fArr6[7] = dp;
                fArr5[6] = dp;
                this.table.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.table.hw, this.table.hw, getWidth() + this.table.hw, getHeight() + (this.table.hw * AndroidUtilities.dp(this.last ? -1.0f : 1.0f)));
                this.table.path.addRoundRect(rectF, this.table.radii, Path.Direction.CW);
                canvas.drawPath(this.table.path, this.table.backgroundPaint);
                canvas.drawPath(this.table.path, this.table.borderPaint);
            }
            super.onDraw(canvas);
        }
    }

    public static class TableRowContent extends FrameLayout {
        private boolean first;
        private boolean last;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TableView table;

        public TableRowContent(TableView tableView, View view) {
            this(tableView, view, false);
        }

        public TableRowContent(TableView tableView, View view, boolean z) {
            super(tableView.getContext());
            this.table = tableView;
            this.resourcesProvider = tableView.resourcesProvider;
            setWillNotDraw(false);
            if (!z) {
                setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            }
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void setFirstLast(boolean z, boolean z2) {
            if (this.first == z && this.last == z2) {
                return;
            }
            this.first = z;
            this.last = z2;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (!this.first && !this.last) {
                canvas.drawRect(this.table.hw, this.table.hw, getWidth() - this.table.hw, getHeight() + this.table.hw, this.table.borderPaint);
            } else {
                float dp = AndroidUtilities.dp(4.0f);
                float[] fArr = this.table.radii;
                this.table.radii[1] = 0.0f;
                fArr[0] = 0.0f;
                float[] fArr2 = this.table.radii;
                float[] fArr3 = this.table.radii;
                float f = this.first ? dp : 0.0f;
                fArr3[3] = f;
                fArr2[2] = f;
                float[] fArr4 = this.table.radii;
                float[] fArr5 = this.table.radii;
                if (!this.last) {
                    dp = 0.0f;
                }
                fArr5[5] = dp;
                fArr4[4] = dp;
                float[] fArr6 = this.table.radii;
                this.table.radii[7] = 0.0f;
                fArr6[6] = 0.0f;
                this.table.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.table.hw, this.table.hw, getWidth() - this.table.hw, getHeight() + (this.table.hw * AndroidUtilities.dp(this.last ? -1.0f : 1.0f)));
                this.table.path.addRoundRect(rectF, this.table.radii, Path.Direction.CW);
                canvas.drawPath(this.table.path, this.table.borderPaint);
            }
            super.onDraw(canvas);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(this.w);
        this.borderPaint.setColor(Theme.getColor(Theme.key_table_border, this.resourcesProvider));
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_table_background, this.resourcesProvider));
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            if (getChildAt(i5) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i5);
                int childCount2 = tableRow.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt = tableRow.getChildAt(i6);
                    if (childAt instanceof TableRowTitle) {
                        ((TableRowTitle) childAt).setFirstLast(i5 == 0, i5 == childCount + (-1));
                    } else if (childAt instanceof TableRowContent) {
                        ((TableRowContent) childAt).setFirstLast(i5 == 0, i5 == childCount + (-1));
                    }
                }
            }
            i5++;
        }
    }
}
