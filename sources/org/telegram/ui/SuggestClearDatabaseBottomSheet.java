package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.StickerImageView;

public final class SuggestClearDatabaseBottomSheet extends BottomSheet {
    public static SuggestClearDatabaseBottomSheet dialog;

    public SuggestClearDatabaseBottomSheet(DialogsActivity dialogsActivity) {
        super(dialogsActivity.getParentActivity(), null, false, false);
        Activity parentActivity = dialogsActivity.getParentActivity();
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
        StickerImageView stickerImageView = new StickerImageView(parentActivity, this.currentAccount);
        stickerImageView.setStickerNum(7);
        stickerImageView.getImageReceiver().setAutoRepeat(1);
        linearLayoutM.addView(stickerImageView, LayoutHelper.createLinear(144, 144, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        textView.setGravity(8388611);
        int i = Theme.key_dialogTextBlack;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, Theme.getColor(null, i, false), 1, textView);
        textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
        linearLayoutM.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(8388611);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(Theme.getColor(null, i, false));
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(dialogsActivity.getMessagesStorage().getDatabaseSize()))));
        linearLayoutM.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
        textView3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int iDp = AndroidUtilities.dp(6.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
        textView3.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        linearLayoutM.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
        textView3.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(1, this, dialogsActivity));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayoutM);
        setCustomView(scrollView);
    }

    public static void dismissDialog() {
        SuggestClearDatabaseBottomSheet suggestClearDatabaseBottomSheet = dialog;
        if (suggestClearDatabaseBottomSheet != null) {
            super.lambda$showGiftOfferSheet$15();
            dialog = null;
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        dialog = null;
    }

    public final void lambda$new$0(DialogsActivity dialogsActivity) {
        if (dialogsActivity.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).clearQueryTime();
        dialogsActivity.getMessagesStorage().clearLocalDatabase();
    }
}
