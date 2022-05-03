package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;

public class AvailableReactionCell extends FrameLayout {
    private CheckBox2 checkBox;
    private BackupImageView imageView;
    private View overlaySelectorView;
    public TLRPC$TL_availableReaction react;
    private Switch switchView;
    private TextView textView;

    public AvailableReactionCell(Context context, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity(LayoutHelper.getAbsoluteGravityStart() | 16);
        addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 91.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.imageView.setLayerNum(1);
        addView(this.imageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 26, null);
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(false);
            this.checkBox.setColor(null, null, "radioBackgroundChecked");
            this.checkBox.setDrawBackgroundAsArc(-1);
            addView(this.checkBox, LayoutHelper.createFrameRelatively(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r11 = new Switch(context);
            this.switchView = r11;
            r11.setColors("switchTrack", "switchTrackChecked", "switchTrackBlueThumb", "switchTrackBlueThumbChecked");
            addView(this.switchView, LayoutHelper.createFrameRelatively(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.overlaySelectorView = view;
        view.setBackground(Theme.getSelectorDrawable(false));
        addView(this.overlaySelectorView, LayoutHelper.createFrame(-1, -1.0f));
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(58.0f) + Theme.dividerPaint.getStrokeWidth()), 1073741824));
    }

    public void bind(TLRPC$TL_availableReaction tLRPC$TL_availableReaction, boolean z) {
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction2;
        boolean z2 = (tLRPC$TL_availableReaction == null || (tLRPC$TL_availableReaction2 = this.react) == null || !tLRPC$TL_availableReaction.reaction.equals(tLRPC$TL_availableReaction2.reaction)) ? false : true;
        this.react = tLRPC$TL_availableReaction;
        this.textView.setText(tLRPC$TL_availableReaction.title);
        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.static_icon), "50_50", "webp", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, "windowBackgroundGray", 1.0f), tLRPC$TL_availableReaction);
        setChecked(z, z2);
    }

    public void setChecked(boolean z) {
        setChecked(z, false);
    }

    public void setChecked(boolean z, boolean z2) {
        Switch r0 = this.switchView;
        if (r0 != null) {
            r0.setChecked(z, z2);
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, z2);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
        float strokeWidth = Theme.dividerPaint.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        int i = 0;
        if (LocaleController.isRTL) {
            i = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + dp, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i, getHeight() - strokeWidth, Theme.dividerPaint);
    }
}
