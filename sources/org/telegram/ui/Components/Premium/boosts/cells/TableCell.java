package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.iv.RichEditor;

public final class TableCell extends FrameLayout {
    public final TextView dateTextView;
    public final FrameLayout fromFrameLayout;
    public final BackupImageView fromImageView;
    public final TextView fromTextView;
    public final TextView giftTextView;
    public final Paint linePaint;
    public final TextView reasonTextView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Path roundPath;
    public final RectF roundRect;
    public final TableRow tableRow4;
    public final FrameLayout toFrameLayout;
    public final BackupImageView toImageView;
    public final TextView toTextView;

    public TableCell(Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint();
        this.linePaint = paint;
        this.roundPath = new Path();
        this.roundRect = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.resourcesProvider = resourcesProvider;
        TextView textViewCreateTextView = createTextView(LocaleController.getString(R.string.BoostingFrom), false);
        TextView textViewCreateTextView2 = createTextView(LocaleController.getString(R.string.BoostingTo), false);
        TextView textViewCreateTextView3 = createTextView(LocaleController.getString(R.string.BoostingGift), false);
        TextView textViewCreateTextView4 = createTextView(LocaleController.getString(R.string.BoostingReason), false);
        TextView textViewCreateTextView5 = createTextView(LocaleController.getString(R.string.BoostingDate), false);
        TextView textViewCreateTextView6 = createTextView(null, true);
        this.fromTextView = textViewCreateTextView6;
        TextView textViewCreateTextView7 = createTextView(null, true);
        this.toTextView = textViewCreateTextView7;
        TextView textViewCreateTextView8 = createTextView(null, false);
        this.giftTextView = textViewCreateTextView8;
        TextView textViewCreateTextView9 = createTextView(null, true);
        this.reasonTextView = textViewCreateTextView9;
        TextView textViewCreateTextView10 = createTextView(null, false);
        this.dateTextView = textViewCreateTextView10;
        BackupImageView backupImageView = new BackupImageView(context);
        this.fromImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.toImageView = backupImageView2;
        backupImageView2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fromFrameLayout = frameLayout;
        boolean z = LocaleController.isRTL;
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 12.0f, 0.0f, z ? 12.0f : 0.0f, 0.0f));
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textViewCreateTextView6, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 0.0f : 29.0f, 0.0f, z2 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(textViewCreateTextView, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(textViewCreateTextView, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.toFrameLayout = frameLayout2;
        boolean z3 = LocaleController.isRTL;
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(24, 24.0f, z3 ? 5 : 3, z3 ? 0.0f : 12.0f, 0.0f, z3 ? 12.0f : 0.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        frameLayout2.addView(textViewCreateTextView7, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 29.0f, 0.0f, z4 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(textViewCreateTextView2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(textViewCreateTextView2, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(textViewCreateTextView8, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(textViewCreateTextView3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(textViewCreateTextView3, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(textViewCreateTextView8, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.tableRow4 = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(textViewCreateTextView9, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(textViewCreateTextView4, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(textViewCreateTextView4, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(textViewCreateTextView9, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(textViewCreateTextView10, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(textViewCreateTextView5, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(textViewCreateTextView5, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(textViewCreateTextView10, new TableRow.LayoutParams(-2, -2));
        }
        TableLayout tableLayout = new TableLayout(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                TableCell tableCell = TableCell.this;
                tableCell.roundRect.set(0.0f, 0.0f, getWidth(), getHeight());
                tableCell.roundPath.rewind();
                tableCell.roundPath.addRoundRect(tableCell.roundRect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                super.dispatchDraw(canvas);
                tableCell.linePaint.setColor(ColorUtils.blendARGB(0.1f, Theme.getColor(Theme.key_divider, resourcesProvider), -1));
                tableCell.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                float height = getHeight() / (tableCell.tableRow4.getVisibility() == 0 ? 5.0f : 4.0f);
                for (int i = 1; i <= 4; i++) {
                    float f = height * i;
                    canvas.drawLine(0.0f, f, getWidth(), f, tableCell.linePaint);
                }
                float right = LocaleController.isRTL ? tableCell.dateTextView.getRight() : tableCell.dateTextView.getLeft();
                canvas.drawLine(right, 0.0f, right, getHeight(), tableCell.linePaint);
                tableCell.linePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                canvas.drawPath(tableCell.roundPath, tableCell.linePaint);
            }
        };
        tableLayout.addView(tableRow);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        tableLayout.addView(tableRow4);
        tableLayout.addView(tableRow5);
        if (LocaleController.isRTL) {
            tableLayout.setColumnShrinkable(0, true);
        } else {
            tableLayout.setColumnShrinkable(1, true);
        }
        addView(tableLayout, LayoutHelper.createFrame(-1, -2.0f));
        tableLayout.setOutlineProvider(new RichEditor.AnonymousClass5(5));
        tableLayout.setClipToOutline(true);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView createTextView(String str, boolean z) {
        TextView textView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z) {
            textView = new LinkSpanDrawable.LinksTextView(getContext(), resourcesProvider);
            textView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        } else {
            textView = new TextView(getContext());
        }
        OKLCH.m(z ? Theme.key_dialogTextBlue : Theme.key_dialogTextBlack, resourcesProvider, textView, 14.0f);
        if (!z) {
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            return textView;
        }
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(str);
        textView.setBackgroundColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
        textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 32.0f : 12.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 32.0f), AndroidUtilities.dp(11.0f));
        return textView;
    }
}
