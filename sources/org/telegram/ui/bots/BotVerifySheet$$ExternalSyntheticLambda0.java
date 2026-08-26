package org.telegram.ui.bots;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda9;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;

public final class BotVerifySheet$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, ResultCallback, DialogsActivity.DialogsActivityDelegate {
    public final int $r8$classId = 3;
    public final Object f$0;
    public final int f$1;
    public final long f$2;
    public final Object f$3;

    public BotVerifySheet$$ExternalSyntheticLambda0(int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f$1 = i;
        this.f$2 = j;
        this.f$0 = tL_attachMenuBot;
        this.f$3 = runnable;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        Activity activity;
        String forcedFirstName;
        TLObject tLObject;
        TLObject tLObject2;
        TLRPC.User user;
        int i3;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$0;
        Activity parentActivity = dialogsActivity2.getParentActivity();
        final int i4 = this.f$1;
        final BotVerifySheet$$ExternalSyntheticLambda1 botVerifySheet$$ExternalSyntheticLambda1 = new BotVerifySheet$$ExternalSyntheticLambda1(topicsFragment, dialogsActivity2, j, i4);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i4);
        final long j2 = this.f$2;
        messagesController.getUser(Long.valueOf(j2));
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.f$3;
        if (j >= 0) {
            user = MessagesController.getInstance(i4).getUser(Long.valueOf(j));
            forcedFirstName = UserObject.getForcedFirstName(user);
            if (user.bot_verification_icon == botverifiersettings.icon) {
                BotVerifySheet.openRemoveVerify(parentActivity, i4, j2, j, botverifiersettings, botVerifySheet$$ExternalSyntheticLambda1);
                return true;
            }
            i4 = i4;
            activity = parentActivity;
            tLObject = user;
            tLObject2 = null;
        } else {
            activity = parentActivity;
            TLRPC.Chat chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-j));
            forcedFirstName = chat == null ? "" : chat.title;
            if (chat.bot_verification_icon == botverifiersettings.icon) {
                BotVerifySheet.openRemoveVerify(activity, i4, j2, j, botverifiersettings, botVerifySheet$$ExternalSyntheticLambda1);
                return true;
            }
            tLObject = chat;
            tLObject2 = tLObject;
            user = null;
        }
        final BottomSheet bottomSheet = new BottomSheet(activity, null, true, false);
        bottomSheet.fixNavigationBar();
        ?? M = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        ?? r29 = tLObject2;
        M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        M.setClipChildren(false);
        M.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        TLRPC.User user2 = user;
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(null, Theme.key_groupcreate_spanBackground, false)));
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(tLObject);
        backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.onNewImageSet();
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
        BackupImageView backupImageView2 = new BackupImageView(activity);
        backupImageView2.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedBackground, false), PorterDuff.Mode.SRC_IN));
        backupImageView2.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(i4, botverifiersettings.icon, null, 3));
        frameLayout.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        simpleTextView.setTextSize(13);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(forcedFirstName, false);
        simpleTextView.setWidthWrapContent(true);
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        M.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i5, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (UserObject.isBot(user2)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyBotTitle));
        } else if (user2 != null) {
            textView.setText(LocaleController.getString(R.string.BotVerifyUserTitle));
        } else if (ChatObject.isChannelAndNotMegaGroup(r29)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyChannelTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.BotVerifyGroupTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        M.addView(textView, LayoutHelper.createLinear(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(Theme.getColor(null, i5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, forcedFirstName)), textView2.getPaint().getFontMetricsInt(), false));
        M.addView(textView2, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i6 = MessagesController.getInstance(i4).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(activity, null);
        outlineTextContainerView.setForceForceUseCenter(true);
        outlineTextContainerView.setText(LocaleController.getString(R.string.BotVerifyDescription));
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(null, i5, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(Theme.getColor(null, Theme.key_chat_inTextSelectionHighlight, false));
        editTextBoldCursor.setHandlesColor(Theme.getColor(null, Theme.key_chat_TextSelectionCursor, false));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda5(outlineTextContainerView, editTextBoldCursor, 2));
        outlineTextContainerView.attachedEditText = editTextBoldCursor;
        outlineTextContainerView.invalidate();
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        M.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
        editTextBoldCursor.addTextChangedListener(new EditTextCell.AnonymousClass3());
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            public boolean ignoreEditText;

            @Override
            public final void afterTextChanged(Editable editable) {
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                CharSequence text = editTextBoldCursor2.getText();
                if (!this.ignoreEditText) {
                    int length = text.length();
                    int i7 = i6;
                    if (length > i7) {
                        this.ignoreEditText = true;
                        text = text.subSequence(0, i7);
                        editTextBoldCursor2.setText(text);
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        this.ignoreEditText = false;
                    }
                }
                outlineTextContainerView.animateSelection(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(text));
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence2, int i7, int i8, int i9) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence2, int i7, int i8, int i9) {
            }
        });
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            outlineTextContainerView.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            textView3.setTextSize(1, 12.0f);
            textView3.setPadding(zzlm.m(14.0f, j >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i3 = -1;
            M.addView(textView3, LayoutHelper.createFrame(-2.0f, -1));
        } else {
            i3 = -1;
            M.addView(new View(activity), LayoutHelper.createFrame(12.0f, -1));
        }
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, null, true);
        buttonWithCounterView.setText(textView.getText(), false, true);
        M.addView(buttonWithCounterView, LayoutHelper.createLinear(i3, 48));
        bottomSheet.customView = M;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                if (buttonWithCounterView2.loading) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z3 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z3 && editTextBoldCursor2.getText().length() > i6) {
                    OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                    OutlineTextContainerView.animateSpring(outlineTextContainerView2.errorSpring, 1.0f);
                    AndroidUtilities.shakeViewSpring(outlineTextContainerView2, -6.0f);
                    return;
                }
                buttonWithCounterView2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i7 = i4;
                setcustomverification.bot = MessagesController.getInstance(i7).getInputUser(j2);
                setcustomverification.peer = MessagesController.getInstance(i7).getInputPeer(j);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i7).sendRequest(setcustomverification, new StarGiftSheet$$ExternalSyntheticLambda7(buttonWithCounterView2, bottomSheet, botVerifySheet$$ExternalSyntheticLambda1, 9));
            }
        });
        bottomSheet.smoothKeyboardAnimationEnabled = true;
        bottomSheet.smoothKeyboardByBottom = true;
        bottomSheet.show();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        Object obj = this.f$3;
        Object obj2 = this.f$0;
        long j = this.f$2;
        int i2 = this.f$1;
        switch (this.$r8$classId) {
            case 1:
                EditText editText = (EditText) obj2;
                if (editText.getText() != null) {
                    if (j <= 0) {
                        long j2 = -j;
                        TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(j2));
                        String string = editText.getText().toString();
                        String str = chat.title;
                        if (str != null && str.equals(string)) {
                            alertDialog.dismiss();
                        } else {
                            chat.title = string;
                            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                            MessagesController.getInstance(i2).changeChatTitle(j2, string);
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j));
                        }
                    } else {
                        TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                        String string2 = editText.getText().toString();
                        String string3 = ((EditText) obj).getText().toString();
                        String str2 = user.first_name;
                        String str3 = user.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(string2) && str3.equals(string3)) {
                            alertDialog.dismiss();
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = string2;
                            user.first_name = string2;
                            updateprofile.last_name = string3;
                            user.last_name = string3;
                            TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(UserConfig.getInstance(i2).getClientUserId()));
                            if (user2 != null) {
                                user2.first_name = updateprofile.first_name;
                                user2.last_name = updateprofile.last_name;
                            }
                            UserConfig.getInstance(i2).saveConfig(true);
                            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                            ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new PassportActivity$$ExternalSyntheticLambda1(8));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j));
                        }
                    }
                    alertDialog.dismiss();
                    break;
                }
                break;
            default:
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i2).getInputUser(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new Theme$$ExternalSyntheticLambda9(i2, 6), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i2).uninstallShortcut(j, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        Pair pair = (Pair) obj;
        ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
        themeSmallPreviewView.getClass();
        if (pair == null || ((Long) pair.first).longValue() != this.f$2) {
            return;
        }
        Drawable drawable = ((ChatThemeBottomSheet.ChatThemeItem) this.f$3).previewDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            motionBackgroundDrawable.setPatternBitmap(ThemeSmallPreviewView.prescaleBitmap((Bitmap) pair.second), this.f$1 >= 0 ? 100 : -100);
            motionBackgroundDrawable.setPatternColorFilter(themeSmallPreviewView.patternColor);
        }
        themeSmallPreviewView.invalidate();
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    public BotVerifySheet$$ExternalSyntheticLambda0(EditText editText, long j, int i, EditText editText2) {
        this.f$0 = editText;
        this.f$2 = j;
        this.f$1 = i;
        this.f$3 = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    public BotVerifySheet$$ExternalSyntheticLambda0(ThemeSmallPreviewView themeSmallPreviewView, long j, ChatThemeBottomSheet.ChatThemeItem chatThemeItem, int i) {
        this.f$0 = themeSmallPreviewView;
        this.f$2 = j;
        this.f$3 = chatThemeItem;
        this.f$1 = i;
    }

    public BotVerifySheet$$ExternalSyntheticLambda0(DialogsActivity dialogsActivity, int i, long j, TL_bots.botVerifierSettings botverifiersettings) {
        this.f$0 = dialogsActivity;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = botverifiersettings;
    }
}
