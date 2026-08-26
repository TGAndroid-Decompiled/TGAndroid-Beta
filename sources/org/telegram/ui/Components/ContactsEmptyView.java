package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ContactsEmptyView extends LinearLayout {
    public final BackupImageView stickerView;

    public ContactsEmptyView(Context context) {
        super(context);
        setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerView = backupImageView;
        backupImageView.setImageDrawable(new LoadingStickerDrawable(backupImageView, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(backupImageView, LayoutHelper.createLinear(110, 110, 49));
        }
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
        zzkr.m(Theme.key_windowBackgroundWhiteBlackText, textViewM, 1);
        textViewM.setText(LocaleController.getString(R.string.NoContactsYet3));
        textViewM.setTypeface(AndroidUtilities.bold());
        addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        zzkr.m(Theme.key_emptyListPlaceholder, textView, 1);
        textView.setText(LocaleController.getString(R.string.NoContactsYet3Sub));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 19));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null, true);
        buttonWithCounterView.setUseWrapContent(true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_new_contact_24), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.NewContact));
        buttonWithCounterView.setText(spannableStringBuilder, false, true);
        addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.stickerView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f), true, null));
    }
}
