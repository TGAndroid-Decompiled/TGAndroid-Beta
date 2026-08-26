package org.telegram.ui.iv;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda112;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda15;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public abstract class RichInlineButtonEditor {

    public interface UserPicked {
        void run(long j);
    }

    public static EditTextBoldCursor createField(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        editTextBoldCursor.setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        return editTextBoldCursor;
    }

    public static ItemOptions show(ItemOptions itemOptions, BaseFragment baseFragment, final RichEditorListView.InlineButtonEdit inlineButtonEdit, final boolean z) {
        TL_iv.textButton textbutton;
        RichInlineButtonSpan richInlineButtonSpan = inlineButtonEdit.existingSpan;
        TL_keyboard.InlineButtonType inlineButtonType = (richInlineButtonSpan == null || (textbutton = richInlineButtonSpan.button) == null) ? null : textbutton.type;
        if (inlineButtonType == null) {
            final int i = 0;
            final int i2 = 1;
            itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            RichInlineButtonEditor.showInlineLinkDialog(inlineButtonEdit, z);
                            break;
                        default:
                            RichInlineButtonEditor.showInlineCopyDialog(inlineButtonEdit, z);
                            break;
                    }
                }
            }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            RichInlineButtonEditor.showInlineLinkDialog(inlineButtonEdit, z);
                            break;
                        default:
                            RichInlineButtonEditor.showInlineCopyDialog(inlineButtonEdit, z);
                            break;
                    }
                }
            }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new EglRenderer$$ExternalSyntheticLambda8(baseFragment, inlineButtonEdit, z, 16));
            return itemOptions.show();
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showInlineLinkDialog(inlineButtonEdit, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showInlineCopyDialog(inlineButtonEdit, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            RichEditorListView.this.hideTextSelectionUi(true);
            showUserPicker(baseFragment, z, new RichInlineButtonEditor$$ExternalSyntheticLambda3(inlineButtonEdit, 2));
        }
        return null;
    }

    public static ItemOptions showBlock(ItemOptions itemOptions, BaseFragment baseFragment, final Context context, final Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, final boolean z) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int i;
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || (i = blockButtonEdit.index) < 0 || i >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
        if (inlineButtonType == null) {
            final int i2 = 0;
            final int i3 = 1;
            itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            RichInlineButtonEditor.showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
                            break;
                        default:
                            RichInlineButtonEditor.showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
                            break;
                    }
                }
            }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            RichInlineButtonEditor.showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
                            break;
                        default:
                            RichInlineButtonEditor.showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
                            break;
                    }
                }
            }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new MessagesStorage$$ExternalSyntheticLambda112(baseFragment, context, resourcesProvider, blockButtonEdit, z, 13));
            return itemOptions.show();
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
            return null;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            showBlockProfileDialog(baseFragment, context, resourcesProvider, blockButtonEdit, z);
        }
        return null;
    }

    public static void showBlockCopyDialog(Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int i;
        boolean zExists = blockButtonEdit.exists();
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || (i = blockButtonEdit.index) < 0 || i >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(zExists ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : "", new RichInlineButtonEditor$$ExternalSyntheticLambda10(blockButtonEdit, 2));
    }

    public static void showBlockLinkDialog(Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int i;
        boolean zExists = blockButtonEdit.exists();
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || (i = blockButtonEdit.index) < 0 || i >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i);
        TL_keyboard.InlineButtonType inlineButtonType = pageButton != null ? pageButton.type : null;
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(zExists ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://", new RichInlineButtonEditor$$ExternalSyntheticLambda10(blockButtonEdit, 0));
    }

    public static void showBlockProfileDialog(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int i;
        boolean zExists = blockButtonEdit.exists();
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        int i2 = 0;
        linearLayoutM.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || (i = blockButtonEdit.index) < 0 || i >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i);
        EditTextBoldCursor editTextBoldCursorCreateField = createField(context, string, pageButton == null ? "" : RichTextStyle.plainOf(pageButton.text), resourcesProvider);
        linearLayoutM.addView(editTextBoldCursorCreateField, LayoutHelper.createLinear(-1, 64));
        Theme$$ExternalSyntheticLambda14 theme$$ExternalSyntheticLambda14 = new Theme$$ExternalSyntheticLambda14(editTextBoldCursorCreateField, baseFragment, z, blockButtonEdit, 9);
        AlertDialog.Builder builder = z ? new AlertDialog.Builder(context, 0, resourcesProvider) : new DarkAlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(zExists ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton)).setView(linearLayoutM).setPositiveButton(LocaleController.getString(R.string.OK), new RichInlineButtonEditor$$ExternalSyntheticLambda12(zExists, theme$$ExternalSyntheticLambda14, editTextBoldCursorCreateField, blockButtonEdit));
        if (zExists) {
            i2 = -4;
            builder.setNeutralButton(LocaleController.getString(R.string.RichEditorChangeUser), new RichEditor$3$$ExternalSyntheticLambda0(theme$$ExternalSyntheticLambda14, 10)).setButton(-4, LocaleController.getString(R.string.Delete), new RichInlineButtonEditor$$ExternalSyntheticLambda10(blockButtonEdit, 1)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).twoRowsButtonsWhenNeeded();
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        showInputDialog(builder, editTextBoldCursorCreateField, i2, resourcesProvider);
    }

    public static void showBlockTextAndValueDialog(Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z, String str, String str2, String str3, RichInlineButtonEditor$$ExternalSyntheticLambda10 richInlineButtonEditor$$ExternalSyntheticLambda10) {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int i;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        BlockRow blockRow = blockButtonEdit.row;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        TL_keyboard.PageButton pageButton = (pageblockbuttonrow == null || (i = blockButtonEdit.index) < 0 || i >= pageblockbuttonrow.buttons.size()) ? null : pageblockbuttonrow.buttons.get(i);
        EditTextBoldCursor editTextBoldCursorCreateField = createField(context, string, pageButton == null ? "" : RichTextStyle.plainOf(pageButton.text), resourcesProvider);
        EditTextBoldCursor editTextBoldCursorCreateField2 = createField(context, str2, str3, resourcesProvider);
        linearLayoutM.addView(editTextBoldCursorCreateField, LayoutHelper.createLinear(-1, 64));
        linearLayoutM.addView(editTextBoldCursorCreateField2, LayoutHelper.createLinear(-1, 64));
        AlertDialog.Builder builder = z ? new AlertDialog.Builder(context, 0, resourcesProvider) : new DarkAlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(str).setView(linearLayoutM).setPositiveButton(LocaleController.getString(R.string.OK), new RichEditor$$ExternalSyntheticLambda60(editTextBoldCursorCreateField, editTextBoldCursorCreateField2, richInlineButtonEditor$$ExternalSyntheticLambda10, 17));
        if (blockButtonEdit.exists()) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new RichInlineButtonEditor$$ExternalSyntheticLambda10(blockButtonEdit, 3)).setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(editTextBoldCursorCreateField.getText())) {
            editTextBoldCursorCreateField = editTextBoldCursorCreateField2;
        }
        showInputDialog(builder, editTextBoldCursorCreateField, blockButtonEdit.exists() ? -3 : 0, resourcesProvider);
    }

    public static void showInlineCopyDialog(RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_iv.textButton textbutton;
        RichInlineButtonSpan richInlineButtonSpan = inlineButtonEdit.existingSpan;
        TL_keyboard.InlineButtonType inlineButtonType = (richInlineButtonSpan == null || (textbutton = richInlineButtonSpan.button) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String strPlainOf = z2 ? ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text : RichTextStyle.plainOf(inlineButtonEdit.label);
        RichEditorListView.this.hideTextSelectionUi(false);
        inlineButtonEdit.editText.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), strPlainOf, false, !z, new RichInlineButtonEditor$$ExternalSyntheticLambda3(inlineButtonEdit, 1));
    }

    public static void showInlineLinkDialog(RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_iv.textButton textbutton;
        RichInlineButtonSpan richInlineButtonSpan = inlineButtonEdit.existingSpan;
        TL_keyboard.InlineButtonType inlineButtonType = (richInlineButtonSpan == null || (textbutton = richInlineButtonSpan.button) == null) ? null : textbutton.type;
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z2 ? ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url : "http://";
        RichEditorListView.this.hideTextSelectionUi(false);
        inlineButtonEdit.editText.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z, new RichInlineButtonEditor$$ExternalSyntheticLambda3(inlineButtonEdit, 0));
    }

    public static void showInputDialog(AlertDialog.Builder builder, EditTextBoldCursor editTextBoldCursor, int i, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(3, editTextBoldCursor));
        alertDialogCreate.showDelayed(250L);
        if (i == 0 || !(alertDialogCreate.getButton(i) instanceof TextView)) {
            return;
        }
        ((TextView) alertDialogCreate.getButton(i)).setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
    }

    public static void showUserPicker(BaseFragment baseFragment, boolean z, UserPicked userPicked) {
        if (baseFragment == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new RichEditor$3$$ExternalSyntheticLambda0(userPicked, 11));
        if (!z) {
            baseFragment.presentFragment(dialogsActivity);
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        baseFragment.showAsSheet(dialogsActivity, bottomSheetParams);
    }
}
