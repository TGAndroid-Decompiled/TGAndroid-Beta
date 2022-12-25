package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Switch;
import org.telegram.tgnet.TLRPC$TL_availableReaction;

public class AvailableReactionCell extends FrameLayout {
    private boolean canLock;
    private CheckBox2 checkBox;
    private BackupImageView imageView;
    public boolean locked;
    private View overlaySelectorView;
    public TLRPC$TL_availableReaction react;
    private Switch switchView;
    private SimpleTextView textView;

    public AvailableReactionCell(Context context, boolean z, boolean z2) {
        super(context);
        this.canLock = z2;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(16);
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setMaxLines(1);
        this.textView.setMaxLines(1);
        this.textView.setGravity(16 | LayoutHelper.getAbsoluteGravityStart());
        addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.m35dp(58.0f) + Theme.dividerPaint.getStrokeWidth()), 1073741824));
    }

    public void bind(TLRPC$TL_availableReaction tLRPC$TL_availableReaction, boolean z, int i) {
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction2;
        boolean z2 = true;
        boolean z3 = (tLRPC$TL_availableReaction == null || (tLRPC$TL_availableReaction2 = this.react) == null || !tLRPC$TL_availableReaction.reaction.equals(tLRPC$TL_availableReaction2.reaction)) ? false : true;
        this.react = tLRPC$TL_availableReaction;
        this.textView.setText(tLRPC$TL_availableReaction.title);
        this.imageView.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, "windowBackgroundGray", 1.0f), tLRPC$TL_availableReaction);
        z2 = (this.canLock && tLRPC$TL_availableReaction.premium && !UserConfig.getInstance(i).isPremium()) ? false : false;
        this.locked = z2;
        if (z2) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), C1072R.C1073drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("stickers_menu"), PorterDuff.Mode.MULTIPLY));
            this.textView.setRightDrawable(drawable);
        } else {
            this.textView.setRightDrawable((Drawable) null);
        }
        setChecked(z, z3);
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

    public boolean isChecked() {
        Switch r0 = this.switchView;
        if (r0 != null) {
            return r0.isChecked();
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            return checkBox2.isChecked();
        }
        return false;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
        float strokeWidth = Theme.dividerPaint.getStrokeWidth();
        int m35dp = AndroidUtilities.m35dp(81.0f);
        int i = 0;
        if (LocaleController.isRTL) {
            i = m35dp;
            m35dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + m35dp, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i, getHeight() - strokeWidth, Theme.dividerPaint);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        if (this.switchView != null) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(isChecked());
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else if (isChecked()) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.setContentDescription(this.textView.getText());
    }
}
