package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda101;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class CreateBotAlert {
    public static void show(Context context, final int i, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, BulletinFactory bulletinFactory) {
        BulletinFactory bulletinFactoryOf;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (bulletinFactory == null) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    callback.run(null);
                    return;
                }
                bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
            } else {
                bulletinFactoryOf = bulletinFactory;
            }
            if (TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = UserObject.getUserName(user);
            } else {
                userName = "@" + UserObject.getPublicUsername(user);
            }
            bulletinFactoryOf.createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
            callback.run(null);
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        BackupImageView backupImageView = new BackupImageView(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i2, resourcesProvider, textView, 20.0f);
        zzkg.m(R.string.CreateManagedBotTitle, textView, 17);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 16, 0, 16, 8), context);
        OKLCH.m(i2, resourcesProvider, textViewM, 14.0f);
        textViewM.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider)));
        textViewM.setGravity(17);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 55, 16, 0, 16, 22));
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, resourcesProvider);
        EditTextCell.AnonymousClass2 anonymousClass2 = editTextCell.editText;
        anonymousClass2.setImeOptions(5);
        int iDp = AndroidUtilities.dp(16.0f);
        int i3 = Theme.key_windowBackgroundWhite;
        editTextCell.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i3, resourcesProvider)));
        editTextCell.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(editTextCell, LayoutHelper.createLinear(-1, -2, 55, 12, 0, 12, 0));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, resourcesProvider);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, resourcesProvider);
        LinearLayout linearLayoutM = zzkf.m(context, 0);
        EditTextCell.AnonymousClass2 anonymousClass3 = editTextCell2.editText;
        editTextCell2.removeView(anonymousClass3);
        anonymousClass3.setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        anonymousClass3.setRightText("bot");
        anonymousClass3.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayoutM.addView(anonymousClass3, LayoutHelper.createLinear(0, -1, 119.0f, 1, 0, 0, 0, 0));
        editTextCell2.addView(linearLayoutM, LayoutHelper.createFrame(-1.0f, -1));
        editTextCell2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), Theme.getColor(i3, resourcesProvider)));
        anonymousClass3.setImeOptions(6);
        String strM = tL_requestPeerTypeCreateBot.suggested_username;
        if (strM != null) {
            strM = strM.trim();
        }
        if (strM != null && strM.toLowerCase().endsWith("bot")) {
            strM = SurfaceContainer$$ExternalSyntheticOutline0.m(3, 0, strM);
        }
        editTextCell2.setText(strM);
        linearLayout.addView(editTextCell2, LayoutHelper.createLinear(-1, -2, 55, 12, 0, 12, 0));
        anonymousClass2.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(editTextCell2, 6));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, resourcesProvider);
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setNeutral();
        buttonWithCounterView.setText(LocaleController.getString(R.string.Cancel));
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout2.addView(buttonWithCounterViewM, LayoutHelper.createLinear(0, 48, 119.0f, 1, 5, 0, 0, 0));
        bottomSheetM.useBackgroundTopPadding = false;
        bottomSheetM.smoothKeyboardAnimationEnabled = true;
        bottomSheetM.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        bottomSheetM.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        final LaunchActivity$$ExternalSyntheticLambda101 launchActivity$$ExternalSyntheticLambda101 = new LaunchActivity$$ExternalSyntheticLambda101(editTextCell2, new int[]{-1}, i, strArr, new String[1], buttonWithCounterViewM, textInfoPrivacyCell2, resourcesProvider, iArr2);
        CreateBotAlert$$ExternalSyntheticLambda2 createBotAlert$$ExternalSyntheticLambda2 = new CreateBotAlert$$ExternalSyntheticLambda2(strArr, launchActivity$$ExternalSyntheticLambda101, editTextCell, iArr2, buttonWithCounterViewM, z, i, user, iArr, zArr, callback, bottomSheetM, resourcesProvider, context);
        anonymousClass3.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                launchActivity$$ExternalSyntheticLambda101.run();
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        if (!TextUtils.isEmpty(strM)) {
            launchActivity$$ExternalSyntheticLambda101.run();
        }
        anonymousClass3.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(createBotAlert$$ExternalSyntheticLambda2, 7));
        buttonWithCounterView.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheetM, 5));
        buttonWithCounterViewM.setEnabled(false);
        buttonWithCounterViewM.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(createBotAlert$$ExternalSyntheticLambda2, 13));
        bottomSheetM.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(null);
                    }
                }
                int[] iArr3 = iArr;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
            }
        });
        bottomSheetM.show();
    }
}
