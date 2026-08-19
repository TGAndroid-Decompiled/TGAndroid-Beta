package org.telegram.ui.iv;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.TopicsFragment;

public abstract class RichInlineButtonEditor {

    interface BlockApply {
        void run(String str, String str2);
    }

    interface UserPicked {
        void run(long j);
    }

    public static ItemOptions show(ItemOptions itemOptions, BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.InlineButtonEdit inlineButtonEdit) {
        return show(itemOptions, baseFragment, context, resourcesProvider, inlineButtonEdit, false);
    }

    public static ItemOptions show(ItemOptions itemOptions, final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.InlineButtonEdit inlineButtonEdit, final boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        if (type != null) {
            editExisting(baseFragment, inlineButtonEdit, type, z);
            return null;
        }
        itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showInlineLinkDialog(inlineButtonEdit, z);
            }
        }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showInlineCopyDialog(inlineButtonEdit, z);
            }
        }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showInlineUserPicker(baseFragment, inlineButtonEdit, z);
            }
        });
        return itemOptions.show();
    }

    public static ItemOptions showBlock(ItemOptions itemOptions, BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit) {
        return showBlock(itemOptions, baseFragment, context, resourcesProvider, blockButtonEdit, false);
    }

    public static ItemOptions showBlock(ItemOptions itemOptions, final BaseFragment baseFragment, final Context context, final Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, final boolean z) {
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        if (type != null) {
            editExistingBlock(baseFragment, context, resourcesProvider, blockButtonEdit, type, z);
            return null;
        }
        itemOptions.add(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
            }
        }).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
            }
        }).add(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.showBlockProfileDialog(baseFragment, context, resourcesProvider, blockButtonEdit, z);
            }
        });
        return itemOptions.show();
    }

    private static void editExisting(BaseFragment baseFragment, RichEditorListView.InlineButtonEdit inlineButtonEdit, TL_keyboard.InlineButtonType inlineButtonType, boolean z) {
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showInlineLinkDialog(inlineButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showInlineCopyDialog(inlineButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            showInlineUserPicker(baseFragment, inlineButtonEdit, z);
        }
    }

    public static void showInlineLinkDialog(final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        boolean z2 = type instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        String str = z2 ? ((TL_keyboard.TL_inlineButtonTypeUrl) type).url : "http://";
        inlineButtonEdit.hideSelectionUi();
        inlineButtonEdit.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), str, true, !z, new EditTextCaption.InputDialogCallback() {
            @Override
            public final void run(String str2) {
                RichInlineButtonEditor.$r8$lambda$Gi4Gfh1y_O3TV1ASyCBSCpCELx0(inlineButtonEdit, str2);
            }
        });
    }

    public static void $r8$lambda$Gi4Gfh1y_O3TV1ASyCBSCpCELx0(RichEditorListView.InlineButtonEdit inlineButtonEdit, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
        tL_inlineButtonTypeUrl.url = str;
        inlineButtonEdit.apply(tL_inlineButtonTypeUrl);
    }

    public static void showInlineCopyDialog(final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        TL_keyboard.InlineButtonType type = inlineButtonEdit.getType();
        boolean z2 = type instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        String label = z2 ? ((TL_keyboard.TL_inlineButtonTypeCopy) type).copy_text : inlineButtonEdit.getLabel();
        inlineButtonEdit.hideSelectionUi();
        inlineButtonEdit.showInputDialog(LocaleController.getString(z2 ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), label, false, !z, new EditTextCaption.InputDialogCallback() {
            @Override
            public final void run(String str) {
                RichInlineButtonEditor.m4991$r8$lambda$k4UyibSmgnkrb0D_htrUlGmT84(inlineButtonEdit, str);
            }
        });
    }

    public static void m4991$r8$lambda$k4UyibSmgnkrb0D_htrUlGmT84(RichEditorListView.InlineButtonEdit inlineButtonEdit, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
        tL_inlineButtonTypeCopy.copy_text = str;
        inlineButtonEdit.apply(tL_inlineButtonTypeCopy);
    }

    public static void showInlineUserPicker(BaseFragment baseFragment, final RichEditorListView.InlineButtonEdit inlineButtonEdit, boolean z) {
        inlineButtonEdit.dismissSelectionUi();
        showUserPicker(baseFragment, z, new UserPicked() {
            @Override
            public final void run(long j) {
                RichInlineButtonEditor.$r8$lambda$JlIy6My55sprHvl_5eMxqrbVgy4(inlineButtonEdit, j);
            }
        });
    }

    public static void $r8$lambda$JlIy6My55sprHvl_5eMxqrbVgy4(RichEditorListView.InlineButtonEdit inlineButtonEdit, long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        inlineButtonEdit.apply(tL_inlineButtonTypeUserProfile);
    }

    private static void editExistingBlock(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, TL_keyboard.InlineButtonType inlineButtonType, boolean z) {
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            showBlockLinkDialog(context, resourcesProvider, blockButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            showBlockCopyDialog(context, resourcesProvider, blockButtonEdit, z);
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            showBlockProfileDialog(baseFragment, context, resourcesProvider, blockButtonEdit, z);
        }
    }

    public static void showBlockLinkDialog(Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        boolean zExists = blockButtonEdit.exists();
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(zExists ? R.string.RichEditorEditLinkButton : R.string.RichEditorCreateLinkButton), LocaleController.getString(R.string.RichEditorButtonURL), type instanceof TL_keyboard.TL_inlineButtonTypeUrl ? ((TL_keyboard.TL_inlineButtonTypeUrl) type).url : "http://", new BlockApply() {
            @Override
            public final void run(String str, String str2) {
                RichInlineButtonEditor.$r8$lambda$wZL_qzcmJBk47z4zB5GbKXEawDM(blockButtonEdit, str, str2);
            }
        });
    }

    public static void $r8$lambda$wZL_qzcmJBk47z4zB5GbKXEawDM(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, String str2) {
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
        tL_inlineButtonTypeUrl.url = str2;
        blockButtonEdit.apply(str, tL_inlineButtonTypeUrl);
    }

    public static void showBlockCopyDialog(Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z) {
        boolean zExists = blockButtonEdit.exists();
        TL_keyboard.InlineButtonType type = blockButtonEdit.getType();
        showBlockTextAndValueDialog(context, resourcesProvider, blockButtonEdit, z, LocaleController.getString(zExists ? R.string.RichEditorEditCopyButton : R.string.RichEditorCreateCopyButton), LocaleController.getString(R.string.RichEditorButtonCopyText), type instanceof TL_keyboard.TL_inlineButtonTypeCopy ? ((TL_keyboard.TL_inlineButtonTypeCopy) type).copy_text : "", new BlockApply() {
            @Override
            public final void run(String str, String str2) {
                RichInlineButtonEditor.m4995$r8$lambda$plAy2ajP4WFvyMss9W5bArwOH0(blockButtonEdit, str, str2);
            }
        });
    }

    public static void m4995$r8$lambda$plAy2ajP4WFvyMss9W5bArwOH0(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, String str2) {
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
        tL_inlineButtonTypeCopy.copy_text = str2;
        blockButtonEdit.apply(str, tL_inlineButtonTypeCopy);
    }

    private static void showBlockTextAndValueDialog(Context context, Theme.ResourcesProvider resourcesProvider, RichEditorListView.BlockButtonEdit blockButtonEdit, boolean z, String str, String str2, String str3, final BlockApply blockApply) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        final EditTextBoldCursor editTextBoldCursorCreateField = createField(context, resourcesProvider, LocaleController.getString(R.string.RichEditorButtonText), blockButtonEdit.getLabel());
        final EditTextBoldCursor editTextBoldCursorCreateField2 = createField(context, resourcesProvider, str2, str3);
        linearLayout.addView(editTextBoldCursorCreateField, LayoutHelper.createLinear(-1, 64));
        linearLayout.addView(editTextBoldCursorCreateField2, LayoutHelper.createLinear(-1, 64));
        AlertDialog.Builder builderCreateInputDialogBuilder = createInputDialogBuilder(context, resourcesProvider, z);
        builderCreateInputDialogBuilder.setTitle(str).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                RichInlineButtonEditor.m4992$r8$lambda$kiEtvQxyO3MGj9F2wc7QVpOmzw(editTextBoldCursorCreateField, editTextBoldCursorCreateField2, blockApply, alertDialog, i);
            }
        });
        addCancelAndDelete(builderCreateInputDialogBuilder, blockButtonEdit);
        if (!TextUtils.isEmpty(editTextBoldCursorCreateField.getText())) {
            editTextBoldCursorCreateField = editTextBoldCursorCreateField2;
        }
        showInputDialog(builderCreateInputDialogBuilder, editTextBoldCursorCreateField, blockButtonEdit.exists() ? -3 : 0, resourcesProvider);
    }

    public static void m4992$r8$lambda$kiEtvQxyO3MGj9F2wc7QVpOmzw(EditTextBoldCursor editTextBoldCursor, EditTextBoldCursor editTextBoldCursor2, BlockApply blockApply, AlertDialog alertDialog, int i) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        String strTrim2 = editTextBoldCursor2.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2)) {
            return;
        }
        blockApply.run(strTrim, strTrim2);
    }

    public static void showBlockProfileDialog(final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, final RichEditorListView.BlockButtonEdit blockButtonEdit, final boolean z) {
        final boolean zExists = blockButtonEdit.exists();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i = 0;
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        final EditTextBoldCursor editTextBoldCursorCreateField = createField(context, resourcesProvider, LocaleController.getString(R.string.RichEditorButtonText), blockButtonEdit.getLabel());
        linearLayout.addView(editTextBoldCursorCreateField, LayoutHelper.createLinear(-1, 64));
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                RichInlineButtonEditor.m4990$r8$lambda$aQAC9urWRNFWGEd1_EG2stusKg(editTextBoldCursorCreateField, baseFragment, z, blockButtonEdit);
            }
        };
        AlertDialog.Builder builderCreateInputDialogBuilder = createInputDialogBuilder(context, resourcesProvider, z);
        builderCreateInputDialogBuilder.setTitle(LocaleController.getString(zExists ? R.string.RichEditorEditProfileButton : R.string.RichEditorCreateProfileButton)).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                RichInlineButtonEditor.$r8$lambda$agvEds9tSky5DHnVmGKbHvOwxzo(zExists, runnable, editTextBoldCursorCreateField, blockButtonEdit, alertDialog, i2);
            }
        });
        if (zExists) {
            i = -4;
            builderCreateInputDialogBuilder.setNeutralButton(LocaleController.getString(R.string.RichEditorChangeUser), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    runnable.run();
                }
            }).setButton(-4, LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    blockButtonEdit.delete();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).twoRowsButtonsWhenNeeded();
        } else {
            builderCreateInputDialogBuilder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        showInputDialog(builderCreateInputDialogBuilder, editTextBoldCursorCreateField, i, resourcesProvider);
    }

    public static void m4990$r8$lambda$aQAC9urWRNFWGEd1_EG2stusKg(EditTextBoldCursor editTextBoldCursor, BaseFragment baseFragment, boolean z, final RichEditorListView.BlockButtonEdit blockButtonEdit) {
        final String strTrim = editTextBoldCursor.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        showUserPicker(baseFragment, z, new UserPicked() {
            @Override
            public final void run(long j) {
                RichInlineButtonEditor.m4997$r8$lambda$umXAv4tsqZtiYmQE9KLOcy84t8(blockButtonEdit, strTrim, j);
            }
        });
    }

    public static void m4997$r8$lambda$umXAv4tsqZtiYmQE9KLOcy84t8(RichEditorListView.BlockButtonEdit blockButtonEdit, String str, long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        blockButtonEdit.apply(str, tL_inlineButtonTypeUserProfile);
    }

    public static void $r8$lambda$agvEds9tSky5DHnVmGKbHvOwxzo(boolean z, Runnable runnable, EditTextBoldCursor editTextBoldCursor, RichEditorListView.BlockButtonEdit blockButtonEdit, AlertDialog alertDialog, int i) {
        if (!z) {
            runnable.run();
            return;
        }
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || blockButtonEdit.getUserId() <= 0) {
            return;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = blockButtonEdit.getUserId();
        blockButtonEdit.apply(strTrim, tL_inlineButtonTypeUserProfile);
    }

    private static AlertDialog.Builder createInputDialogBuilder(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (z) {
            return new AlertDialog.Builder(context, resourcesProvider);
        }
        return new AlertDialogDecor.Builder(context, resourcesProvider);
    }

    private static void addCancelAndDelete(AlertDialog.Builder builder, final RichEditorListView.BlockButtonEdit blockButtonEdit) {
        if (blockButtonEdit.exists()) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    blockButtonEdit.delete();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
    }

    private static EditTextBoldCursor createField(Context context, Theme.ResourcesProvider resourcesProvider, String str, String str2) {
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

    private static AlertDialog showInputDialog(AlertDialog.Builder builder, final EditTextBoldCursor editTextBoldCursor, int i, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                RichInlineButtonEditor.m4989$r8$lambda$WxOSkdjUS_c3XezDSneFYNktOY(editTextBoldCursor, dialogInterface);
            }
        });
        alertDialogCreate.showDelayed(250L);
        if (i != 0 && (alertDialogCreate.getButton(i) instanceof TextView)) {
            ((TextView) alertDialogCreate.getButton(i)).setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        }
        return alertDialogCreate;
    }

    public static void m4989$r8$lambda$WxOSkdjUS_c3XezDSneFYNktOY(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
        editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
    }

    private static void showUserPicker(BaseFragment baseFragment, boolean z, final UserPicked userPicked) {
        if (baseFragment == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
            }

            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z2, boolean z3, int i, int i2, TopicsFragment topicsFragment) {
                return RichInlineButtonEditor.m4998$r8$lambda$xD89Y_QWSGhRCV4ruUcWuJky28(userPicked, dialogsActivity2, arrayList, charSequence, z2, z3, i, i2, topicsFragment);
            }

            @Override
            public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        if (z) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            baseFragment.showAsSheet(dialogsActivity, bottomSheetParams);
            return;
        }
        baseFragment.presentFragment(dialogsActivity);
    }

    public static boolean m4998$r8$lambda$xD89Y_QWSGhRCV4ruUcWuJky28(UserPicked userPicked, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList == null || arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        userPicked.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dialogsActivity.finishFragment();
        return true;
    }
}
