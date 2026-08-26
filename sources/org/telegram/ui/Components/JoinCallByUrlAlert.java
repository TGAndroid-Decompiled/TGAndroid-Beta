package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public abstract class JoinCallByUrlAlert extends BottomSheet {
    public boolean joinAfterDismiss;

    public final class BottomSheetCell extends FrameLayout {
        public final View background;
        public final TextView textView;

        public BottomSheetCell(Activity activity) {
            super(activity);
            View view = new View(activity);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(activity);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public JoinCallByUrlAlert(Activity activity, TLRPC.Chat chat) {
        super(activity, null, true, false);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(90, 90, 49, 0, 29, 0, 0));
        backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
        backupImageView.onNewImageSet();
        TextView textView = new TextView(activity);
        zzkh.m(18.0f, textView);
        zzkr.m(Theme.key_dialogTextBlack, textView, 1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 17, 24, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        zzkr.m(Theme.key_dialogTextGray3, textView2, 1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i = groupCall.call.participants_count;
            if (i == 0) {
                textView2.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                textView2.setText(LocaleController.formatPluralString("Participants", i, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            textView2.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        BottomSheetCell bottomSheetCell = new BottomSheetCell(activity);
        bottomSheetCell.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            bottomSheetCell.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            bottomSheetCell.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        bottomSheetCell.background.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 3));
        linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.joinAfterDismiss) {
            onJoin();
        }
    }

    public abstract void onJoin();
}
