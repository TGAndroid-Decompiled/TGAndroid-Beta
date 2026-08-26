package org.telegram.ui.community.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class CommunityLinkView extends FrameLayout implements Theme.Colorable {
    public final ImageView arrowView;
    public final BackupImageView avatarView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView subtitleView;
    public final TextView titleView;

    public CommunityLinkView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(backupImageView, LayoutHelper.createFrame(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.arrowView = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = Theme.dialogs_communityCardsDrawable;
        BackupImageView backupImageView = this.avatarView;
        DrawableUtils.drawCommunityCardDrawable(canvas, drawable, (backupImageView.getWidth() / 2.0f) + backupImageView.getLeft(), (backupImageView.getHeight() / 2.0f) + backupImageView.getTop(), backupImageView.getHeight());
        super.dispatchDraw(canvas);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitleView.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.arrowView.setColorFilter(Theme.getColor(i, resourcesProvider));
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.subtitleView.setTextColor(Theme.getColor(i, resourcesProvider));
    }
}
