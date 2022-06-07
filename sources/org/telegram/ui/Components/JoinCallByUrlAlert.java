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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public class JoinCallByUrlAlert extends BottomSheet {
    private boolean joinAfterDismiss;

    protected void onJoin() {
        throw null;
    }

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private TextView textView;

        public BottomSheetCell(Context context) {
            super(context);
            View view = new View(context);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity(17);
            this.textView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public JoinCallByUrlAlert(Context context, TLRPC$Chat tLRPC$Chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(90, 90, 49, 0, 29, 0, 0));
        backupImageView.setForUserOrChat(tLRPC$Chat, new AvatarDrawable(tLRPC$Chat));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 17, 24, 17, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor("dialogTextGray3"));
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(tLRPC$Chat.id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(tLRPC$Chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i = groupCall.call.participants_count;
            if (i == 0) {
                textView2.setText(LocaleController.getString("NoOneJoinedYet", R.string.NoOneJoinedYet));
            } else {
                textView2.setText(LocaleController.formatPluralString("Participants", i, new Object[0]));
            }
        } else {
            textView.setText(tLRPC$Chat.title);
            textView2.setText(LocaleController.getString("NoOneJoinedYet", R.string.NoOneJoinedYet));
        }
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context);
        bottomSheetCell.setBackground(null);
        if (ChatObject.isChannelOrGiga(tLRPC$Chat)) {
            bottomSheetCell.setText(LocaleController.getString("VoipChannelJoinVoiceChatUrl", R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            bottomSheetCell.setText(LocaleController.getString("VoipGroupJoinVoiceChatUrl", R.string.VoipGroupJoinVoiceChatUrl));
        }
        bottomSheetCell.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinCallByUrlAlert.this.lambda$new$0(view);
            }
        });
        linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 30, 0, 0));
    }

    public void lambda$new$0(View view) {
        this.joinAfterDismiss = true;
        dismiss();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        if (this.joinAfterDismiss) {
            onJoin();
        }
    }
}
