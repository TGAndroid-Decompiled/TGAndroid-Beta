package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;

public abstract class GroupCallInvitedCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public TLRPC.User currentUser;
    public final Paint dividerPaint;
    public int grayIconColor;
    public final ImageView muteButton;
    public final SimpleTextView nameTextView;
    public boolean needDivider;
    public final SimpleTextView statusTextView;

    public GroupCallInvitedCell(LaunchActivity launchActivity) {
        super(launchActivity);
        this.grayIconColor = Theme.key_voipgroup_mutedIcon;
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        BackupImageView backupImageView = new BackupImageView(launchActivity);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(launchActivity);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z2 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 54.0f : 67.0f, 10.0f, z2 ? 67.0f : 54.0f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(launchActivity);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(15);
        simpleTextView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        simpleTextView2.setTextColor(Theme.getColor(null, this.grayIconColor, false));
        simpleTextView2.setText(LocaleController.getString(R.string.Invited), false);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 32.0f, z3 ? 67.0f : 54.0f, 0.0f));
        ImageView imageView = new ImageView(launchActivity);
        this.muteButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_invited);
        imageView.setImportantForAccessibility(2);
        imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, this.grayIconColor, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, LayoutHelper.createFrame(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.needDivider) {
            canvas2 = canvas;
            canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.dividerPaint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.nameTextView.getText();
    }

    public TLRPC.User getUser() {
        return this.currentUser;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z) {
        this.needDivider = z;
        invalidate();
    }
}
