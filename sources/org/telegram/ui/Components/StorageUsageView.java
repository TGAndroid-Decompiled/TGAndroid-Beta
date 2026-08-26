package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;

public final class StorageUsageView extends FrameLayout {
    public final Paint bgPaint;
    public boolean calculating;
    public float calculatingProgress;
    public boolean calculatingProgressIncrement;
    public final TextView calculatingTextView;
    public final CellFlickerDrawable cellFlickerDrawable;
    public final View divider;
    public final AvatarPreviewer ellipsizeSpanAnimator;
    public final TextView freeSizeTextView;
    public int lastProgressColor;
    public final Paint paintFill;
    public final Paint paintProgress;
    public final Paint paintProgress2;
    public float progress;
    public float progress2;
    public final QrActivity.AnonymousClass2 progressView;
    public final TextView telegramCacheTextView;
    public final TextView telegramDatabaseTextView;
    public final TextSettingsCell textSettingsCell;
    public final TextView totlaSizeTextView;
    public ValueAnimator valueAnimator;
    public ValueAnimator valueAnimator2;

    public StorageUsageView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.paintFill = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.paintProgress = paint3;
        Paint paint4 = new Paint(1);
        this.paintProgress2 = paint4;
        this.bgPaint = new Paint();
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(220, 255, 160);
        this.cellFlickerDrawable = cellFlickerDrawable;
        setWillNotDraw(false);
        cellFlickerDrawable.drawFrame = false;
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
        paint3.setStrokeCap(cap);
        paint4.setStrokeCap(cap);
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 18);
        this.progressView = anonymousClass2;
        addView(anonymousClass2, LayoutHelper.createFrame(-2.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, LayoutHelper.createFrame(-2.0f, -1));
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 19);
        linearLayout.addView(anonymousClass19, LayoutHelper.createLinear(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
        TextView textView = new TextView(context);
        this.calculatingTextView = textView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        textView.setTextColor(Theme.getColor(null, i, false));
        String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
        int iIndexOf = string.indexOf("...");
        if (iIndexOf >= 0) {
            SpannableString spannableString = new SpannableString(string);
            AvatarPreviewer avatarPreviewer = new AvatarPreviewer(textView);
            this.ellipsizeSpanAnimator = avatarPreviewer;
            avatarPreviewer.wrap(spannableString, iIndexOf);
            textView.setText(spannableString);
        } else {
            textView.setText(string);
        }
        TextView textView2 = new TextView(context);
        this.telegramCacheTextView = textView2;
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setTextColor(Theme.getColor(null, i, false));
        TextView textView3 = new TextView(context);
        this.telegramDatabaseTextView = textView3;
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView3.setTextColor(Theme.getColor(null, i, false));
        TextView textView4 = new TextView(context);
        this.freeSizeTextView = textView4;
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView4.setTextColor(Theme.getColor(null, i, false));
        TextView textView5 = new TextView(context);
        this.totlaSizeTextView = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView5.setTextColor(Theme.getColor(null, i, false));
        this.lastProgressColor = Theme.getColor(null, Theme.key_player_progress, false);
        textView2.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), this.lastProgressColor), (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView4.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(this.lastProgressColor, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView5.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(this.lastProgressColor, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView3.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), this.lastProgressColor), (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        anonymousClass19.addView(textView, LayoutHelper.createFrame(-2.0f, -2));
        anonymousClass19.addView(textView3, LayoutHelper.createFrame(-2.0f, -2));
        anonymousClass19.addView(textView2, LayoutHelper.createFrame(-2.0f, -2));
        anonymousClass19.addView(textView5, LayoutHelper.createFrame(-2.0f, -2));
        anonymousClass19.addView(textView4, LayoutHelper.createFrame(-2.0f, -2));
        View view = new View(getContext());
        this.divider = view;
        linearLayout.addView(view, LayoutHelper.createLinear(-1, -2, 0, 21, 0, 0, 0));
        view.getLayoutParams().height = 1;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
        TextSettingsCell textSettingsCell = new TextSettingsCell(getContext(), 0, null);
        this.textSettingsCell = textSettingsCell;
        linearLayout.addView(textSettingsCell, LayoutHelper.createLinear(-1, -2));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.progressView.invalidate();
        int i = this.lastProgressColor;
        int i2 = Theme.key_player_progress;
        if (i != Theme.getColor(null, i2, false)) {
            this.lastProgressColor = Theme.getColor(null, i2, false);
            TextView textView = this.telegramCacheTextView;
            textView.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), this.lastProgressColor), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            TextView textView2 = this.telegramDatabaseTextView;
            textView2.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), this.lastProgressColor), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            TextView textView3 = this.freeSizeTextView;
            textView3.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(this.lastProgressColor, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            TextView textView4 = this.totlaSizeTextView;
            textView4.setCompoundDrawablesWithIntrinsicBounds(Theme.createCircleDrawable(AndroidUtilities.dp(10.0f), ColorUtils.setAlphaComponent(this.lastProgressColor, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.divider.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
        if (avatarPreviewer != null) {
            avatarPreviewer.visible = true;
            AnimatorSet animatorSet = (AnimatorSet) avatarPreviewer.windowManager;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
        if (avatarPreviewer != null) {
            avatarPreviewer.visible = false;
            ((AnimatorSet) avatarPreviewer.windowManager).cancel();
        }
    }
}
