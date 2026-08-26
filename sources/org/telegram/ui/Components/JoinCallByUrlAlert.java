package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public class JoinCallByUrlAlert extends BottomSheet {
    private boolean joinAfterDismiss;

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private LinearLayout linearLayout;
        private TextView textView;

        public BottomSheetCell(Context context) {
            super(context);
            View view = new View(context);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity(17);
            this.textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public JoinCallByUrlAlert(Context context, TLRPC.Chat chat) {
        super(context, true, false, null);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(90, 90, 49, 0, 29, 0, 0));
        backupImageView.setForUserOrChat(chat, new AvatarDrawable(chat));
        TextView textView = new TextView(context);
        AccountFrozenAlert$$ExternalSyntheticOutline1.m(18.0f, 1, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setGravity(1);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 49, 17, 24, 17, 0), context);
        textViewM.setTextSize(1, 14.0f);
        textViewM.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        textViewM.setGravity(1);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i = groupCall.call.participants_count;
            if (i == 0) {
                textViewM.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                textViewM.setText(LocaleController.formatPluralString("Participants", i, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            textViewM.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context);
        bottomSheetCell.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            bottomSheetCell.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            bottomSheetCell.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        bottomSheetCell.background.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 2));
        linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 30, 0, 0));
    }

    public void lambda$new$0(View view) {
        this.joinAfterDismiss = true;
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        if (this.joinAfterDismiss) {
            onJoin();
        }
    }

    public void onJoin() {
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
