package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda11;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
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
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        Context context;
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
        Context context2 = dialogsActivity2.getContext();
        final int i4 = this.f$1;
        final BotVerifySheet$$ExternalSyntheticLambda1 botVerifySheet$$ExternalSyntheticLambda1 = new BotVerifySheet$$ExternalSyntheticLambda1(topicsFragment, dialogsActivity2, j, i4);
        if (context2 == null) {
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
                BotVerifySheet.openRemoveVerify(context2, i4, j2, j, botverifiersettings, botVerifySheet$$ExternalSyntheticLambda1);
                return true;
            }
            i4 = i4;
            context = context2;
            tLObject = user;
            tLObject2 = null;
        } else {
            context = context2;
            TLRPC.Chat chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-j));
            forcedFirstName = chat == null ? "" : chat.title;
            if (chat.bot_verification_icon == botverifiersettings.icon) {
                BotVerifySheet.openRemoveVerify(context, i4, j2, j, botverifiersettings, botVerifySheet$$ExternalSyntheticLambda1);
                return true;
            }
            tLObject = chat;
            tLObject2 = tLObject;
            user = null;
        }
        final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, true, false, null);
        ?? M = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        ?? r29 = tLObject2;
        M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        M.setClipChildren(false);
        M.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        TLRPC.User user2 = user;
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(null, Theme.key_groupcreate_spanBackground, false)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
        BackupImageView backupImageView2 = new BackupImageView(context);
        backupImageView2.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedBackground, false), PorterDuff.Mode.SRC_IN));
        backupImageView2.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(i4, 3, botverifiersettings.icon));
        frameLayout.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        simpleTextView.setTextSize(13);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(forcedFirstName);
        simpleTextView.setWidthWrapContent(true);
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        M.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(context);
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
        TextView textViewM = Theme.ResourcesProvider.CC.m(M, textView, LayoutHelper.createLinear(-1, -2, 24.0f, 21.0f, 24.0f, 8.33f), context);
        textViewM.setTextColor(Theme.getColor(null, i5, false));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(17);
        NotificationCenter.listenEmojiLoading(textViewM);
        textViewM.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, forcedFirstName)), textViewM.getPaint().getFontMetricsInt(), false));
        M.addView(textViewM, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 22.0f));
        final int i6 = MessagesController.getInstance(i4).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
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
        editTextBoldCursor.setOnFocusChangeListener(new BotVerifySheet$$ExternalSyntheticLambda2(0, editTextBoldCursor, outlineTextContainerView));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        M.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
        editTextBoldCursor.addTextChangedListener(new EditTextSuggestionsFix());
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
            TextView textView2 = new TextView(context);
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            textView2.setTextSize(1, 12.0f);
            textView2.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(14.0f, j >= 0 ? R.string.BotVerifyDescriptionInfo : R.string.BotVerifyDescriptionInfoChat, textView2), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i3 = -1;
            M.addView(textView2, LayoutHelper.createFrame(-1, -2.0f));
        } else {
            i3 = -1;
            M.addView(new View(context), LayoutHelper.createFrame(-1, 12.0f));
        }
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        buttonWithCounterView.setText(textView.getText(), false);
        M.addView(buttonWithCounterView, LayoutHelper.createLinear(i3, 48));
        bottomSheetM.customView = M;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                if (buttonWithCounterView2.isLoading()) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z3 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z3 && editTextBoldCursor2.getText().length() > i6) {
                    OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                    outlineTextContainerView2.animateError(1.0f);
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
                ConnectionsManager.getInstance(i7).sendRequest(setcustomverification, new StarGiftSheet$$ExternalSyntheticLambda1(buttonWithCounterView2, bottomSheetM, botVerifySheet$$ExternalSyntheticLambda1, 15));
            }
        });
        bottomSheetM.smoothKeyboardAnimationEnabled = true;
        bottomSheetM.smoothKeyboardByBottom = true;
        bottomSheetM.show();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                AlertsCreator.lambda$createChangeNameAlert$91((EditText) this.f$0, this.f$2, this.f$1, (EditText) this.f$3, alertDialog, i);
                break;
            default:
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i2 = this.f$1;
                MessagesController messagesController = MessagesController.getInstance(i2);
                long j = this.f$2;
                tL_messages_toggleBotInAttachMenu.bot = messagesController.getInputUser(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new Theme$$ExternalSyntheticLambda11(i2, 4), 66);
                ((TLRPC.TL_attachMenuBot) this.f$0).show_in_side_menu = false;
                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i2).uninstallShortcut(j, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                Runnable runnable = (Runnable) this.f$3;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) this.f$3;
        themeSmallPreviewView.lambda$setItem$0(this.f$2, chatThemeItem, this.f$1, (Pair) obj);
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
