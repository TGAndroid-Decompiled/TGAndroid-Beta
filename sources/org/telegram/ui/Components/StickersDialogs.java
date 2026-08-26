package org.telegram.ui.Components;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticLambda12;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda20;
import org.telegram.ui.ChannelAdminLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public class StickersDialogs {
    private static int getThemedColor(int i, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(i, resourcesProvider);
    }

    public static void lambda$openStickerPickerDialog$10(AlertDialog alertDialog, int i, TLRPC.Document document, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(alertDialog, i, document, obj, tL_stickers_addStickerToSet, tLObject, tL_error));
    }

    public static Boolean lambda$openStickerPickerDialog$11(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Object obj, TLRPC.Document document, Boolean bool) {
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i));
        String str = TextUtils.isEmpty(strFindAnimatedEmojiEmoticon) ? "😀" : strFindAnimatedEmojiEmoticon;
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new ChatObject$Call$$ExternalSyntheticLambda12(alertDialog, i, document, obj, tL_stickers_addStickerToSet, 4));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        try {
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }

    public static void lambda$openStickerPickerDialog$8(TLObject tLObject, TLRPC.Document document) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
        int i = NotificationCenter.customStickerCreated;
        Boolean bool = Boolean.FALSE;
        notificationCenter.postNotificationNameOnUIThread(i, bool, tLObject, document, null, bool);
    }

    public static void lambda$openStickerPickerDialog$9(AlertDialog alertDialog, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        TLObject tLObject2;
        alertDialog.dismiss();
        if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
            if (tL_error != null) {
                if (FileRefController.isFileRefError(tL_error.text)) {
                    FileRefController.getInstance(i).requestReference(obj, tL_stickers_addStickerToSet);
                    return;
                } else {
                    BulletinFactory.showError(tL_error);
                    return;
                }
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        MediaDataController.getInstance(i).putStickerSet(tL_messages_stickerSet);
        if (MediaDataController.getInstance(i).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
            tLObject2 = tLObject;
        } else {
            tLObject2 = tLObject;
            MediaDataController.getInstance(i).toggleStickerSet(null, tLObject2, 2, null, false, false);
        }
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(19, (TLRPC.TL_messages_stickerSet) tLObject2, document), 250L);
    }

    public static void lambda$showAddStickerDialog$12(ActionBarPopupWindow actionBarPopupWindow, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        actionBarPopupWindow.dismiss();
        if (((Integer) arrayList.get(iIntValue)).intValue() == 1) {
            openStickerPickerDialog(tL_messages_stickerSet, baseFragment, resourcesProvider);
        } else {
            ((ChatActivity) baseFragment).openAttachMenuForCreatingSticker();
            ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(tL_messages_stickerSet);
        }
    }

    public static void lambda$showDeleteForEveryOneDialog$5() {
    }

    public static void lambda$showDeleteForEveryOneDialog$6(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda7(20));
    }

    public static void lambda$showDeleteForEveryOneDialog$7(Runnable runnable, TLRPC.StickerSet stickerSet, AlertDialog alertDialog, int i) {
        runnable.run();
        TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
        tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new EmojiView$23$$ExternalSyntheticLambda0(4));
    }

    public static CharSequence lambda$showNameEditorDialog$0(EditTextBoldCursor editTextBoldCursor, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return (charSequence.length() > 0 && Character.isWhitespace(charSequence.charAt(0)) && (TextUtils.isEmpty(editTextBoldCursor.getText()) || i3 == 0)) ? "" : charSequence;
    }

    public static void lambda$showNameEditorDialog$1(AlertDialog alertDialog, AlertDialog alertDialog2, EditTextBoldCursor editTextBoldCursor, Boolean bool) {
        alertDialog.dismiss();
        if (bool.booleanValue()) {
            alertDialog2.dismiss();
            return;
        }
        editTextBoldCursor.setErrorText(".");
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, -6.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$showNameEditorDialog$2(EditTextBoldCursor editTextBoldCursor, Utilities.Callback2 callback2, Context context, boolean z, AlertDialog alertDialog, int i) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(AndroidUtilities.translitSafe(strTrim.toString()))) {
            editTextBoldCursor.setErrorText(".");
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, -6.0f);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            AndroidUtilities.showKeyboard(editTextBoldCursor);
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (callback2 == null) {
            return;
        }
        AlertDialog alertDialog2 = new AlertDialog(context, 3, z ? null : new DarkThemeResourceProvider());
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
        callback2.run(strTrim, new StickersDialogs$$ExternalSyntheticLambda12(alertDialog2, alertDialog, editTextBoldCursor, 0));
    }

    public static void lambda$showNameEditorDialog$3(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, int i) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        alertDialog.dismiss();
    }

    public static boolean lambda$showNameEditorDialog$4(AlertDialog alertDialog, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        alertDialog.getButton(-1).callOnClick();
        return true;
    }

    private static void openStickerPickerDialog(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        int i = UserConfig.selectedAccount;
        Context context = baseFragment.getContext();
        EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(context, true, false, resourcesProvider);
        emojiBottomSheet.onDocumentSelected = new SearchTagsList$$ExternalSyntheticLambda3(i, context, tL_messages_stickerSet);
        if (baseFragment.visibleDialog != null) {
            emojiBottomSheet.show();
        } else {
            baseFragment.showDialog(emojiBottomSheet);
        }
    }

    public static void showAddStickerDialog(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, View view, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null) {
            return;
        }
        Context context = baseFragment.getContext();
        if (!(baseFragment instanceof ChatActivity)) {
            openStickerPickerDialog(tL_messages_stickerSet, baseFragment, resourcesProvider);
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, R.drawable.popup_fixed_alert3, resourcesProvider, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.menu_sticker_add, arrayList3, 0, arrayList2);
        arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
        arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
        arrayList2.add(1);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        AlertsCreator$$ExternalSyntheticLambda70 alertsCreator$$ExternalSyntheticLambda70 = new AlertsCreator$$ExternalSyntheticLambda70(actionBarPopupWindow, arrayList2, tL_messages_stickerSet, baseFragment, resourcesProvider);
        for (int i = 0; i < arrayList.size(); i++) {
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, ((Integer) arrayList3.get(i)).intValue(), (CharSequence) arrayList.get(i), false, resourcesProvider);
            actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i));
            actionBarMenuSubItemAddItem.setOnClickListener(alertsCreator$$ExternalSyntheticLambda70);
        }
        actionBarPopupWindow.setDismissAnimationDuration(100);
        actionBarPopupWindow.setScaleOut(true);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        actionBarPopupWindow.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindowLayout.getMeasuredHeight() / 2));
        actionBarPopupWindow.dimBehind();
    }

    public static void showDeleteForEveryOneDialog(TLRPC.StickerSet stickerSet, Theme.ResourcesProvider resourcesProvider, Context context, Runnable runnable) {
        if (stickerSet == null) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, 0, resourcesProvider).setTitle(LocaleController.getString(R.string.StickersDeleteStickerSetTitle)).setMessage(LocaleController.getString(R.string.StickersDeleteStickerSetDescription)).setPositiveButton(LocaleController.getString(R.string.Delete), new StickersDialogs$$ExternalSyntheticLambda2(runnable, stickerSet)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold, resourcesProvider));
        }
    }

    public static void showNameEditorDialog(TLRPC.StickerSet stickerSet, Theme.ResourcesProvider resourcesProvider, Context context, Utilities.Callback2<CharSequence, Utilities.Callback<Boolean>> callback2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        int i = 1;
        boolean z = stickerSet != null;
        builder.setTitle(LocaleController.getString(z ? R.string.EditStickerPack : R.string.NewStickerPack));
        builder.setMessage(LocaleController.getString(R.string.StickersChooseNameForStickerPack));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(20.0f), 0);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            }
        };
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(getThemedColor(i2, resourcesProvider));
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(getThemedColor(i2, resourcesProvider));
        editTextBoldCursor.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        editTextBoldCursor.setHeaderHintColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                return StickersDialogs.lambda$showNameEditorDialog$0(editTextBoldCursor, charSequence, i3, i4, spanned, i5, i6);
            }
        }});
        editTextBoldCursor.setLineColors(getThemedColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), getThemedColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        editTextBoldCursor.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 28.0f), 0);
        frameLayout.addView(editTextBoldCursor);
        final NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.setNumber(50, false);
        numberTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, LayoutHelper.createFrame(26, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                numberTextView.setNumber(50 - Character.codePointCount(editable, 0, editable.length()), true);
                editTextBoldCursor.setErrorText(null);
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        if (z) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        builder.setView(frameLayout);
        builder.setCustomViewOffset(4);
        builder.setPositiveButton(LocaleController.getString(z ? R.string.Done : R.string.Create), new AlertsCreator$$ExternalSyntheticLambda239(editTextBoldCursor, callback2, context, z));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new StickersAlert$$ExternalSyntheticLambda25(i, editTextBoldCursor));
        AlertDialog alertDialogShow = builder.show();
        alertDialogShow.dismissDialogByButtons = false;
        editTextBoldCursor.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(alertDialogShow, 9));
    }
}
