package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BlurSettingsBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;

public final class FeaturedStickerSetCell extends FrameLayout {
    public final ProgressButton addButton;
    public final ImageView checkImage;
    public final int currentAccount;
    public AnimatorSet currentAnimation;
    public final BackupImageView imageView;
    public boolean isInstalled;
    public boolean needDivider;
    public TLRPC.StickerSetCovered stickersSet;
    public final TextView textView;
    public final TextView valueTextView;
    public boolean wasLayout;

    public FeaturedStickerSetCell(Context context) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.textView = textView;
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 22.0f : 71.0f, 10.0f, z ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, z2 ? 5 : 3, z2 ? 100.0f : 71.0f, 35.0f, z2 ? 71.0f : 100.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        boolean z3 = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        ProgressButton progressButton = new ProgressButton(context);
        this.addButton = progressButton;
        progressButton.setText(LocaleController.getString(R.string.Add));
        progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
        progressButton.setBackgroundRoundRect(Theme.getColor(null, Theme.key_featuredStickers_addButton, false), Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false));
        addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.checkImage = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addedIcon, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageResource(R.drawable.sticker_added);
        addView(imageView, LayoutHelper.createFrame(19, 14.0f));
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.stickersSet;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.wasLayout = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProgressButton progressButton = this.addButton;
        int measuredWidth = (progressButton.getMeasuredWidth() / 2) + progressButton.getLeft();
        ImageView imageView = this.checkImage;
        int measuredWidth2 = measuredWidth - (imageView.getMeasuredWidth() / 2);
        int measuredHeight = ((progressButton.getMeasuredHeight() / 2) + progressButton.getTop()) - (imageView.getMeasuredHeight() / 2);
        imageView.layout(measuredWidth2, measuredHeight, imageView.getMeasuredWidth() + measuredWidth2, imageView.getMeasuredHeight() + measuredHeight);
        this.wasLayout = true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        measureChildWithMargins(this.textView, i, this.addButton.getMeasuredWidth(), i2, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.addButton.setOnClickListener(onClickListener);
    }
}
