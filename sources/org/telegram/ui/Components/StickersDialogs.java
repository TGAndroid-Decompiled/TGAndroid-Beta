package org.telegram.ui.Components;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda454;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.iv.RichEditText$$ExternalSyntheticLambda1;

public abstract class StickersDialogs {

    public final class AnonymousClass1 extends EditTextBoldCursor {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
    }

    public static void openStickerPickerDialog(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        int i = UserConfig.selectedAccount;
        Context context = baseFragment.getContext();
        EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(context, resourcesProvider, true, false);
        emojiBottomSheet.onDocumentSelected = new PassportActivity$$ExternalSyntheticLambda52(i, context, tL_messages_stickerSet, 10);
        if (baseFragment.visibleDialog != null) {
            emojiBottomSheet.show();
        } else {
            baseFragment.showDialog(emojiBottomSheet);
        }
    }

    public static void showDeleteForEveryOneDialog(TLRPC.StickerSet stickerSet, Theme.ResourcesProvider resourcesProvider, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        String string = LocaleController.getString(R.string.StickersDeleteStickerSetTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.StickersDeleteStickerSetDescription);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new RateCallLayout$$ExternalSyntheticLambda1(19, runnable, stickerSet));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        alertDialog.show();
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        }
    }

    public static void showNameEditorDialog(TLRPC.StickerSet stickerSet, Theme.ResourcesProvider resourcesProvider, Context context, Utilities.Callback2 callback2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        boolean z = stickerSet != null;
        String string = LocaleController.getString(z ? R.string.EditStickerPack : R.string.NewStickerPack);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.StickersChooseNameForStickerPack);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        int i = Theme.key_dialogTextBlack;
        anonymousClass1.setTextColor(Theme.getColor(i, resourcesProvider));
        anonymousClass1.setInputType(16385);
        anonymousClass1.setTextSize(1, 16.0f);
        anonymousClass1.setTextColor(Theme.getColor(i, resourcesProvider));
        anonymousClass1.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        anonymousClass1.setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        anonymousClass1.setSingleLine(true);
        anonymousClass1.setFocusable(true);
        anonymousClass1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new RichEditText$$ExternalSyntheticLambda1(1, anonymousClass1)});
        anonymousClass1.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        anonymousClass1.setImeOptions(6);
        anonymousClass1.setBackground(null);
        anonymousClass1.requestFocus();
        anonymousClass1.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(anonymousClass1);
        final NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.setNumber(50, false);
        numberTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, LayoutHelper.createFrame(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        anonymousClass1.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                numberTextView.setNumber(50 - Character.codePointCount(editable, 0, editable.length()), true);
                anonymousClass1.setErrorText(null);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        if (z) {
            anonymousClass1.setText(stickerSet.title);
            anonymousClass1.setSelection(stickerSet.title.length());
        }
        builder.setView(frameLayout);
        alertDialog.customViewOffset = 4;
        builder.setPositiveButton(LocaleController.getString(z ? R.string.Done : R.string.Create), new ChatActivity$$ExternalSyntheticLambda454(anonymousClass1, callback2, context, z, 3));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ProfileGooeyView$$ExternalSyntheticLambda0(anonymousClass1, 28));
        AlertDialog alertDialogShow = builder.show();
        alertDialogShow.dismissDialogByButtons = false;
        anonymousClass1.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(alertDialogShow, 12));
    }
}
