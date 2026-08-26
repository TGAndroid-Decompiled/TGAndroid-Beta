package org.telegram.ui;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda2;

public final class ChatActivity$$ExternalSyntheticLambda254 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final BaseFragment f$0;
    public final Serializable f$2;
    public final boolean f$3;
    public final int f$4;

    public ChatActivity$$ExternalSyntheticLambda254(ChatActivity chatActivity, TLRPC.User user, String str, boolean z, int i) {
        this.f$0 = chatActivity;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = i;
    }

    @Override
    public final void onClick(View view) {
        Serializable serializable = this.f$2;
        int i = 3;
        int i2 = this.f$4;
        boolean z = this.f$3;
        BaseFragment baseFragment = this.f$0;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                chatActivity.getClass();
                Pattern pattern = AlertsCreator.URL_PATTERN;
                if (chatActivity.getParentActivity() != null) {
                    BottomSheet bottomSheet = new BottomSheet(chatActivity.getParentActivity(), null, false, false);
                    bottomSheet.fixNavigationBar();
                    bottomSheet.title = LocaleController.getString(z ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    bottomSheet.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(chatActivity.getParentActivity());
                    linearLayout.addView(textView, LayoutHelper.createLinear(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, (String) serializable, LocaleController.formatDateAudio(i2, false))));
                    TextView textView2 = new TextView(chatActivity.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    int iDp = AndroidUtilities.dp(8.0f);
                    int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
                    int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
                    textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 8));
                    bottomSheet.customView = linearLayout;
                    bottomSheet.show();
                    textView2.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheet, i));
                    break;
                }
                break;
            default:
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i4 = Theme.key_undo_cancelColor;
                DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(string, i4, 0, new DialogsActivity$$ExternalSyntheticLambda14(dialogsActivity, i3));
                SpannableString spannableString = new SpannableString(">");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
                coloredImageSpan.setOverrideColor(Theme.getColor(null, i4, false));
                coloredImageSpan.setScale(0.7f, 0.7f);
                coloredImageSpan.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", spannableStringBuilderReplaceSingleTag, spannableString);
                BulletinFactory.of(dialogsActivity).createSimpleBulletin(LocaleController.getString(z ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), spannableStringBuilderReplaceSingleTag, R.raw.contact_check).show();
                MessagesController.getInstance(i2).getUnconfirmedAuthController().confirm((ArrayList) serializable, new LinkEditActivity$$ExternalSyntheticLambda9(i));
                MessagesController.getInstance(i2).getUnconfirmedAuthController().cleanup();
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda254(DialogsActivity dialogsActivity, boolean z, int i, ArrayList arrayList) {
        this.f$0 = dialogsActivity;
        this.f$3 = z;
        this.f$4 = i;
        this.f$2 = arrayList;
    }
}
