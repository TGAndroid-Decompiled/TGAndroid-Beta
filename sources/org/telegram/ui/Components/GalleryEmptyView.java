package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class GalleryEmptyView extends LinearLayout {
    private final ButtonWithCounterView cameraAccessButton;
    private final long emojiDocumentId;
    private final ButtonWithCounterView galleryAccessButton;
    private final BackupImageView stickerView;
    private final TextView subtitleTextView;
    private final TextView titleTextView;
    private final ButtonWithCounterView useAnEmojiButton;

    public GalleryEmptyView(Context context, int i, boolean z) {
        super(context);
        TLRPC.TL_emojiList orCreateEmojiList = AvatarConstructorPreviewCell.getOrCreateEmojiList(i, z);
        setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerView = backupImageView;
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_gallery, "utyan_gallery", AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(backupImageView, LayoutHelper.createLinear(110, 110, 49));
        }
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        this.subtitleTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(null, Theme.key_emptyListPlaceholder, false));
        textView2.setGravity(1);
        textView2.setText(LocaleController.getString(UserConfig.getInstance(i).isPremium() ? R.string.GalleryAccessAllowAccessTextPremium : R.string.GalleryAccessAllowAccessTextNonPremium));
        textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 14));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        this.galleryAccessButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setText(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false);
        addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 49));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, null);
        this.cameraAccessButton = buttonWithCounterView2;
        buttonWithCounterView2.setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.outline_attach_camera_24), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        buttonWithCounterView2.setText(spannableStringBuilder, false);
        addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 44, 49, 0, 8, 0, 0));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, false, null);
        this.useAnEmojiButton = buttonWithCounterView3;
        buttonWithCounterView3.setRound();
        buttonWithCounterView3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = orCreateEmojiList.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.emojiDocumentId = 0L;
        } else {
            long jLongValue = orCreateEmojiList.document_id.get(0).longValue();
            this.emojiDocumentId = jLongValue;
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(jLongValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        buttonWithCounterView3.setText(spannableStringBuilder2, false);
        addView(buttonWithCounterView3, LayoutHelper.createLinear(-2, 44, 49, 0, 1, 0, 0));
    }

    public void lambda$doOnEmojiButton$2(Utilities.Callback callback, View view) {
        callback.run(Long.valueOf(this.emojiDocumentId));
    }

    public void doOnCameraAccess(Runnable runnable) {
        this.cameraAccessButton.setOnClickListener(new ArchiveHelp$$ExternalSyntheticLambda0(3, runnable));
    }

    public void doOnEmojiButton(Utilities.Callback<Long> callback) {
        this.useAnEmojiButton.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(29, this, callback));
    }

    public void doOnGalleryAccessClick(Runnable runnable) {
        this.galleryAccessButton.setOnClickListener(new ArchiveHelp$$ExternalSyntheticLambda0(4, runnable));
    }

    @Override
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        this.galleryAccessButton.setUseWrapContent(true);
        this.cameraAccessButton.setUseWrapContent(true);
        this.useAnEmojiButton.setUseWrapContent(true);
        this.galleryAccessButton.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.cameraAccessButton.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.useAnEmojiButton.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.galleryAccessButton.setUseWrapContent(false);
        this.cameraAccessButton.setUseWrapContent(false);
        this.useAnEmojiButton.setUseWrapContent(false);
        int iMax = Math.max(Math.max(this.galleryAccessButton.getMeasuredWidth(), this.cameraAccessButton.getMeasuredWidth()), this.useAnEmojiButton.getMeasuredWidth());
        this.galleryAccessButton.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        this.cameraAccessButton.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        this.useAnEmojiButton.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        super.onMeasure(i, i2);
    }

    public void setColors() {
        this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.subtitleTextView.setTextColor(Theme.getColor(null, Theme.key_emptyListPlaceholder, false));
        this.galleryAccessButton.updateColors();
    }

    public void setUseAnEmojiVisible(boolean z) {
        this.useAnEmojiButton.setVisibility(z ? 0 : 8);
    }
}
