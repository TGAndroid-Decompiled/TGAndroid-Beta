package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;

public final class AvailableReactionCell extends FrameLayout {
    public final boolean canLock;
    public final CheckBox2 checkBox;
    public final BackupImageView imageView;
    public boolean locked;
    public TLRPC.TL_availableReaction react;
    public final Switch switchView;
    public final SimpleTextView textView;

    public AvailableReactionCell(Context context, boolean z, boolean z2) {
        super(context);
        this.canLock = z2;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        simpleTextView.setTextSize(16);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setMaxLines(1);
        simpleTextView.setMaxLines(1);
        simpleTextView.setGravity(16 | LayoutHelper.getAbsoluteGravityStart());
        addView(simpleTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        addView(backupImageView, LayoutHelper.createFrameRelatively(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 26, null);
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(false);
            checkBox2.checkBoxBase.setColor(-1, -1, Theme.key_radioBackgroundChecked);
            checkBox2.setDrawBackgroundAsArc(-1);
            addView(checkBox2, LayoutHelper.createFrameRelatively(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.switchView = r14;
            int i = Theme.key_switchTrack;
            int i2 = Theme.key_switchTrackChecked;
            int i3 = Theme.key_switchTrackBlueThumb;
            int i4 = Theme.key_switchTrackBlueThumbChecked;
            r14.trackColorKey = i;
            r14.trackCheckedColorKey = i2;
            r14.thumbColorKey = i3;
            r14.thumbCheckedColorKey = i4;
            addView(r14, LayoutHelper.createFrameRelatively(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        view.setBackground(Theme.getSelectorDrawable(false));
        addView(view, LayoutHelper.createFrame(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void bind(TLRPC.TL_availableReaction tL_availableReaction, boolean z, int i) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.react;
        boolean z2 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.react = tL_availableReaction;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(Emoji.replaceEmoji(tL_availableReaction.title, simpleTextView.getPaint().getFontMetricsInt(), false), false);
        this.imageView.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", null, null, DocumentObject.getSvgThumb(tL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f), "tgs", 0, tL_availableReaction);
        boolean z3 = this.canLock && tL_availableReaction.premium && !UserConfig.getInstance(i).isPremium();
        this.locked = z3;
        if (z3) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_stickers_menu, false), PorterDuff.Mode.MULTIPLY));
            simpleTextView.setRightDrawable(drawable);
        } else {
            simpleTextView.setRightDrawable((Drawable) null);
        }
        Switch r0 = this.switchView;
        if (r0 != null) {
            r0.setChecked(r0.drawIconType, z, z2);
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.checkBoxBase.setChecked(-1, z, z2);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i = 0;
        canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        float strokeWidth = Theme.dividerPaint.getStrokeWidth();
        int iDp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i = iDp;
            iDp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - iDp, getHeight() - strokeWidth, Theme.dividerPaint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        Switch r1 = this.switchView;
        boolean z = false;
        CheckBox2 checkBox2 = this.checkBox;
        if (r1 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r1 != null) {
                z = r1.isChecked;
            } else if (checkBox2 != null) {
                z = checkBox2.checkBoxBase.isChecked;
            }
            accessibilityNodeInfo.setChecked(z);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r1 != null) {
                z = r1.isChecked;
            } else if (checkBox2 != null) {
                z = checkBox2.checkBoxBase.isChecked;
            }
            if (z) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.textView.getText());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (Theme.dividerPaint.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z) {
        Switch r0 = this.switchView;
        if (r0 != null) {
            r0.setChecked(r0.drawIconType, z, false);
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.checkBoxBase.setChecked(-1, z, false);
        }
    }
}
