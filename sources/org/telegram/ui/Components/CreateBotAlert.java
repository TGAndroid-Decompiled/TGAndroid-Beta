package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class CreateBotAlert {
    public static void show(final Context context, final int i, final TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, final boolean z, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider, BulletinFactory bulletinFactory, boolean z2) {
        BulletinFactory bulletinFactoryOf;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (bulletinFactory == null) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    if (callback != null) {
                        callback.run(null);
                        return;
                    }
                    return;
                }
                bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
            } else {
                bulletinFactoryOf = bulletinFactory;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            bulletinFactoryOf.createSimpleBulletin(R.raw.error, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        BackupImageView backupImageView = new BackupImageView(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        backupImageView.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.CreateManagedBotTitle));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 16, 0, 16, 8));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider)));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 16, 0, 16, 22));
        final EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, resourcesProvider);
        editTextCell.editText.setImeOptions(5);
        int iDp = AndroidUtilities.dp(16.0f);
        int i3 = Theme.key_windowBackgroundWhite;
        editTextCell.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i3, resourcesProvider)));
        editTextCell.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(editTextCell, LayoutHelper.createLinear(-1, -2, 55, 12, 0, 12, 0));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, resourcesProvider);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        final EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, resourcesProvider);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        editTextCell2.removeView(editTextCell2.editText);
        editTextCell2.editText.setHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        editTextCell2.editText.setRightText("bot");
        editTextCell2.editText.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView3.setGravity(17);
        textView3.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView3, LayoutHelper.createLinear(-2, -1, 21.0f, -1.0f, 0.0f, 0.0f));
        linearLayout2.addView(editTextCell2.editText, LayoutHelper.createLinear(0, -1, 119.0f, 1, 0, 0, 0, 0));
        editTextCell2.addView(linearLayout2, LayoutHelper.createFrame(-1, -1.0f));
        editTextCell2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), Theme.getColor(i3, resourcesProvider)));
        editTextCell2.editText.setImeOptions(6);
        String strSubstring = tL_requestPeerTypeCreateBot.suggested_username;
        if (strSubstring != null) {
            strSubstring = strSubstring.trim();
        }
        if (strSubstring != null && strSubstring.toLowerCase().endsWith("bot")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 3);
        }
        CharSequence charSequence = strSubstring;
        editTextCell2.setText(charSequence);
        linearLayout.addView(editTextCell2, LayoutHelper.createLinear(-1, -2, 55, 12, 0, 12, 0));
        editTextCell.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView4, int i4, KeyEvent keyEvent) {
                return CreateBotAlert.lambda$show$0(editTextCell2, textView4, i4, keyEvent);
            }
        });
        final TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, resourcesProvider);
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2));
        ButtonWithCounterView neutral = new ButtonWithCounterView(context, resourcesProvider).setRound().setNeutral();
        neutral.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(neutral, LayoutHelper.createLinear(0, 48, 119.0f, 1, 0, 0, 5, 0));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        round.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(round, LayoutHelper.createLinear(0, 48, 119.0f, 1, 5, 0, 0, 0));
        final BottomSheet bottomSheetCreate = builder.create();
        bottomSheetCreate.useBackgroundTopPadding = false;
        bottomSheetCreate.smoothKeyboardAnimationEnabled = true;
        bottomSheetCreate.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        bottomSheetCreate.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        final String[] strArr = new String[1];
        final int[] iArr = {-1};
        final String[] strArr2 = new String[1];
        final int[] iArr2 = {-1};
        final int[] iArr3 = {4};
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                CreateBotAlert.lambda$show$2(editTextCell2, iArr2, i, strArr, strArr2, round, textInfoPrivacyCell2, resourcesProvider, iArr3);
            }
        };
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                CreateBotAlert.lambda$show$6(strArr, runnable, editTextCell, iArr3, round, z, i, user, iArr, zArr, callback, bottomSheetCreate, resourcesProvider, context);
            }
        };
        editTextCell2.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence2, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence2, int i4, int i5, int i6) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                runnable.run();
            }
        });
        if (!TextUtils.isEmpty(charSequence)) {
            runnable.run();
        }
        editTextCell2.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView4, int i4, KeyEvent keyEvent) {
                return CreateBotAlert.lambda$show$7(runnable2, textView4, i4, keyEvent);
            }
        });
        neutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                bottomSheetCreate.lambda$new$0();
            }
        });
        round.setEnabled(false);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                runnable2.run();
            }
        });
        bottomSheetCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                CreateBotAlert.lambda$show$10(zArr, callback, iArr, i, dialogInterface);
            }
        });
        bottomSheetCreate.show();
    }

    public static boolean lambda$show$0(EditTextCell editTextCell, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        editTextCell.editText.requestFocus();
        EditTextCaption editTextCaption = editTextCell.editText;
        editTextCaption.setSelection(editTextCaption.length());
        return true;
    }

    public static void lambda$show$2(EditTextCell editTextCell, int[] iArr, int i, final String[] strArr, final String[] strArr2, final ButtonWithCounterView buttonWithCounterView, final TextInfoPrivacyCell textInfoPrivacyCell, final Theme.ResourcesProvider resourcesProvider, final int[] iArr2) {
        final String str = ((Object) editTextCell.getText()) + "bot";
        if (str.length() < 4) {
            if (iArr[0] >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                iArr[0] = -1;
            }
            strArr2[0] = null;
            strArr[0] = null;
            buttonWithCounterView.setLoading(false);
            buttonWithCounterView.setEnabled(false);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
            int i2 = -iArr2[0];
            iArr2[0] = i2;
            AndroidUtilities.shakeViewSpring(textInfoPrivacyCell, i2);
            return;
        }
        if (str.length() > 32) {
            if (iArr[0] >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                iArr[0] = -1;
            }
            strArr2[0] = null;
            strArr[0] = null;
            buttonWithCounterView.setLoading(false);
            buttonWithCounterView.setEnabled(false);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameInvalidLong));
            textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
            int i3 = -iArr2[0];
            iArr2[0] = i3;
            AndroidUtilities.shakeViewSpring(textInfoPrivacyCell, i3);
            return;
        }
        if (TextUtils.equals(strArr2[0], str)) {
            return;
        }
        strArr2[0] = str;
        strArr[0] = null;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameChecking));
        textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
        checkusername.username = str;
        buttonWithCounterView.setLoading(true);
        iArr[0] = ConnectionsManager.getInstance(i).sendRequestTyped(checkusername, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CreateBotAlert.lambda$show$1(buttonWithCounterView, strArr2, strArr, str, textInfoPrivacyCell, resourcesProvider, iArr2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$show$1(ButtonWithCounterView buttonWithCounterView, String[] strArr, String[] strArr2, String str, TextInfoPrivacyCell textInfoPrivacyCell, Theme.ResourcesProvider resourcesProvider, int[] iArr, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        buttonWithCounterView.setLoading(false);
        strArr[0] = null;
        if (bool instanceof TLRPC.TL_boolTrue) {
            strArr2[0] = str;
            buttonWithCounterView.setEnabled(true);
            textInfoPrivacyCell.setText(LocaleController.formatString(R.string.UsernameAvailable, "@" + str));
            textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGreenText, resourcesProvider));
            return;
        }
        strArr2[0] = null;
        buttonWithCounterView.setEnabled(false);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernameInUse));
        textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        int i = -iArr[0];
        iArr[0] = i;
        AndroidUtilities.shakeViewSpring(textInfoPrivacyCell, i);
    }

    public static void lambda$show$6(String[] strArr, Runnable runnable, EditTextCell editTextCell, int[] iArr, final ButtonWithCounterView buttonWithCounterView, boolean z, final int i, final TLRPC.User user, final int[] iArr2, final boolean[] zArr, final Utilities.Callback callback, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, final Context context) {
        if (strArr[0] == null) {
            runnable.run();
            return;
        }
        String strTrim = editTextCell.editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            int i2 = -iArr[0];
            iArr[0] = i2;
            AndroidUtilities.shakeViewSpring(editTextCell, i2);
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = z;
        createbot.username = strArr[0];
        createbot.name = strTrim;
        createbot.manager_id = MessagesController.getInstance(i).getInputUser(user);
        iArr2[0] = ConnectionsManager.getInstance(i).sendRequestTyped(createbot, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CreateBotAlert.lambda$show$5(iArr2, buttonWithCounterView, zArr, i, callback, bottomSheet, resourcesProvider, context, user, (TLRPC.User) obj, (TLRPC.TL_error) obj2);
            }
        }, 1024);
    }

    public static void lambda$show$5(int[] iArr, ButtonWithCounterView buttonWithCounterView, boolean[] zArr, int i, Utilities.Callback callback, final BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, final Context context, TLRPC.User user, TLRPC.User user2, TLRPC.TL_error tL_error) {
        String userName;
        String string;
        iArr[0] = -1;
        buttonWithCounterView.setLoading(false);
        if (user2 != null) {
            zArr[0] = true;
            MessagesController.getInstance(i).putUser(user2, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(user2);
            MessagesStorage.getInstance(i).putUsersAndChats(arrayList, null, false, false);
            if (callback != null) {
                callback.run(user2);
            }
            bottomSheet.lambda$new$0();
            return;
        }
        if (tL_error != null) {
            if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                MessagesController messagesController = MessagesController.getInstance(i);
                boolean zIsPremium = UserConfig.getInstance(i).isPremium();
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider);
                int i2 = R.raw.error;
                String string2 = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                if (zIsPremium) {
                    string = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController.config.botsCreateLimitPremium.get()));
                } else {
                    string = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController.config.botsCreateLimitDefault.get()));
                }
                bulletinFactoryOf.createSimpleBulletin(i2, string2, highlightBotFather(context, AndroidUtilities.replaceSingleLink(string, Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider), new Runnable() {
                    @Override
                    public final void run() {
                        CreateBotAlert.lambda$show$3(bottomSheet);
                    }
                }), new Runnable() {
                    @Override
                    public final void run() {
                        CreateBotAlert.lambda$show$4(bottomSheet, context);
                    }
                }, resourcesProvider)).setDuration(8000).show();
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("FLOOD_WAIT_")) {
                    BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11))))).show();
                } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                    if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                        userName = "@" + UserObject.getPublicUsername(user);
                    } else {
                        userName = UserObject.getUserName(user);
                    }
                    BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
                } else {
                    BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                }
            }
            AndroidUtilities.hideKeyboard(bottomSheet.getCurrentFocus());
        }
    }

    public static void lambda$show$3(BottomSheet bottomSheet) {
        bottomSheet.lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(new PremiumPreviewFragment("create_bot"));
        }
    }

    public static void lambda$show$4(BottomSheet bottomSheet, Context context) {
        bottomSheet.lambda$new$0();
        Browser.openUrl(context, "https://t.me/BotFather?start=deletebot");
    }

    public static boolean lambda$show$7(Runnable runnable, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        runnable.run();
        return true;
    }

    public static void lambda$show$10(boolean[] zArr, Utilities.Callback callback, int[] iArr, int i, DialogInterface dialogInterface) {
        if (!zArr[0]) {
            zArr[0] = true;
            if (callback != null) {
                callback.run(null);
            }
        }
        if (iArr[0] >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
            iArr[0] = -1;
        }
    }

    private static SpannableStringBuilder highlightBotFather(Context context, CharSequence charSequence, final Runnable runnable, final Theme.ResourcesProvider resourcesProvider) {
        SpannableStringBuilder spannableStringBuilder;
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "@BotFather");
        if (iCharSequenceIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider));
                }

                @Override
                public void onClick(View view) {
                    runnable.run();
                }
            }, iCharSequenceIndexOf, iCharSequenceIndexOf + 10, 33);
        }
        return spannableStringBuilder;
    }
}
