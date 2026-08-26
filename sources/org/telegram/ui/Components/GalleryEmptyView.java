package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GalleryEmptyView extends LinearLayout {
    public final ButtonWithCounterView cameraAccessButton;
    public final long emojiDocumentId;
    public final ButtonWithCounterView galleryAccessButton;
    public final ButtonWithCounterView useAnEmojiButton;

    public GalleryEmptyView(Context context, int i) {
        super(context);
        TLRPC.TL_emojiList orCreateEmojiList = AvatarConstructorPreviewCell.getOrCreateEmojiList(i);
        setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_gallery, "utyan_gallery", AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f), true, null));
        if (!AndroidUtilities.isTablet()) {
            addView(backupImageView, LayoutHelper.createLinear(110, 110, 49));
        }
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
        zzkr.m(Theme.key_windowBackgroundWhiteBlackText, textViewM, 1);
        textViewM.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        textViewM.setTypeface(AndroidUtilities.bold());
        addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        zzkr.m(Theme.key_emptyListPlaceholder, textView, 1);
        textView.setText(LocaleController.getString(UserConfig.getInstance(i).isPremium() ? R.string.GalleryAccessAllowAccessTextPremium : R.string.GalleryAccessAllowAccessTextNonPremium));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 14));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
        this.galleryAccessButton = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 49));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, null, false);
        this.cameraAccessButton = buttonWithCounterView2;
        buttonWithCounterView2.setRoundRadius(24);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.outline_attach_camera_24), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        buttonWithCounterView2.setText(spannableStringBuilder, false, true);
        addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 44, 49, 0, 8, 0, 0));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(context, null, false);
        this.useAnEmojiButton = buttonWithCounterView3;
        buttonWithCounterView3.setRoundRadius(24);
        buttonWithCounterView3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = orCreateEmojiList.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.emojiDocumentId = 0L;
        } else {
            long jLongValue = orCreateEmojiList.document_id.get(0).longValue();
            this.emojiDocumentId = jLongValue;
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(jLongValue, 1.2f, null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        buttonWithCounterView3.setText(spannableStringBuilder2, false, true);
        addView(buttonWithCounterView3, LayoutHelper.createLinear(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        ButtonWithCounterView buttonWithCounterView = this.galleryAccessButton;
        buttonWithCounterView.setUseWrapContent(true);
        ButtonWithCounterView buttonWithCounterView2 = this.cameraAccessButton;
        buttonWithCounterView2.setUseWrapContent(true);
        ButtonWithCounterView buttonWithCounterView3 = this.useAnEmojiButton;
        buttonWithCounterView3.setUseWrapContent(true);
        buttonWithCounterView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        buttonWithCounterView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        buttonWithCounterView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        buttonWithCounterView.setUseWrapContent(false);
        buttonWithCounterView2.setUseWrapContent(false);
        buttonWithCounterView3.setUseWrapContent(false);
        int iMax = Math.max(Math.max(buttonWithCounterView.getMeasuredWidth(), buttonWithCounterView2.getMeasuredWidth()), buttonWithCounterView3.getMeasuredWidth());
        buttonWithCounterView.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        buttonWithCounterView2.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        buttonWithCounterView3.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        super.onMeasure(i, i2);
    }

    public void setUseAnEmojiVisible(boolean z) {
        this.useAnEmojiButton.setVisibility(z ? 0 : 8);
    }
}
