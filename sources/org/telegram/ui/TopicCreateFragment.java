package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public class TopicCreateFragment extends BaseFragment {
    BackupImageView[] backupImageView;
    TextCheckCell2 checkBoxCell;
    boolean created;
    Drawable defaultIconDrawable;
    long dialogId;
    EditTextBoldCursor editTextBoldCursor;
    String firstSymbol;
    ForumBubbleDrawable forumBubbleDrawable;
    int iconColor;
    AnimationNotificationsLocker notificationsLocker;
    private ChatActivity openInChatActivity;
    ReplaceableIconDrawable replaceableIconDrawable;
    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    long selectedEmojiDocumentId;
    TLRPC.TL_forumTopic topicForEdit;
    long topicId;

    public TopicCreateFragment setOpenInChatActivity(ChatActivity chatActivity) {
        this.openInChatActivity = chatActivity;
        return this;
    }

    public static TopicCreateFragment create(long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putLong("topic_id", j2);
        return new TopicCreateFragment(bundle);
    }

    private TopicCreateFragment(Bundle bundle) {
        super(bundle);
        this.backupImageView = new BackupImageView[2];
        this.firstSymbol = "";
        this.notificationsLocker = new AnimationNotificationsLocker();
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = -this.arguments.getLong("chat_id");
        long j = this.arguments.getLong("topic_id", 0L);
        this.topicId = j;
        if (j != 0) {
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(-this.dialogId, this.topicId);
            this.topicForEdit = tL_forumTopicFindTopic;
            if (tL_forumTopicFindTopic == null) {
                return false;
            }
            this.iconColor = tL_forumTopicFindTopic.icon_color;
        } else {
            int[] iArr = ForumBubbleDrawable.serverSupportedColor;
            this.iconColor = iArr[Math.abs(Utilities.random.nextInt() % iArr.length)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        if (this.topicForEdit != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        if (this.topicForEdit == null) {
            this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.createMenu().addItem(2, R.drawable.ic_ab_done);
        }
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundGray;
        actionBar.setBackgroundColor(getThemedColor(i));
        this.actionBar.setCastShadows(false);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            boolean keyboardWasShown;

            @Override
            protected void onMeasure(int i2, int i3) {
                measureKeyboardHeight();
                if (getKeyboardHeight() == 0 && !this.keyboardWasShown) {
                    int i4 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    this.keyboardHeight = i4;
                    setPadding(0, 0, 0, i4);
                } else {
                    this.keyboardWasShown = true;
                    setPadding(0, 0, 0, 0);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(i));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        sizeNotifierFrameLayout.addView(linearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.topicForEdit;
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            headerCell.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            headerCell.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editTextBoldCursor = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.editTextBoldCursor.setHintColor(getThemedColor(Theme.key_chat_messagePanelHint));
        this.editTextBoldCursor.setTextColor(getThemedColor(Theme.key_chat_messagePanelText));
        this.editTextBoldCursor.setPadding(AndroidUtilities.dp(0.0f), this.editTextBoldCursor.getPaddingTop(), AndroidUtilities.dp(0.0f), this.editTextBoldCursor.getPaddingBottom());
        this.editTextBoldCursor.setBackground(null);
        this.editTextBoldCursor.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.editTextBoldCursor;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.editTextBoldCursor, LayoutHelper.createFrame(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String strTrim = editable.toString().trim();
                String str = TopicCreateFragment.this.firstSymbol;
                if (strTrim.length() > 0) {
                    TopicCreateFragment.this.firstSymbol = strTrim.substring(0, 1).toUpperCase();
                } else {
                    TopicCreateFragment.this.firstSymbol = "";
                }
                if (str.equals(TopicCreateFragment.this.firstSymbol)) {
                    return;
                }
                LetterDrawable letterDrawable = new LetterDrawable(null, 1);
                letterDrawable.setTitle(TopicCreateFragment.this.firstSymbol);
                ReplaceableIconDrawable replaceableIconDrawable = TopicCreateFragment.this.replaceableIconDrawable;
                if (replaceableIconDrawable != null) {
                    replaceableIconDrawable.setIcon((Drawable) letterDrawable, true);
                }
            }
        });
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        anonymousClass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicCreateFragment.$r8$lambda$a2RNku4DYrZTpVveSVV7P8P92z0(this.f$0, view);
            }
        });
        for (int i2 = 0; i2 < 2; i2++) {
            this.backupImageView[i2] = new BackupImageView(context);
            anonymousClass4.addView(this.backupImageView[i2], LayoutHelper.createFrame(28, 28, 17));
        }
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(headerCell);
        linearLayout2.addView(frameLayout);
        int iDp = AndroidUtilities.dp(16.0f);
        int i3 = Theme.key_windowBackgroundWhite;
        linearLayout2.setBackground(Theme.createRoundRectDrawableShadowed(iDp, getThemedColor(i3)));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.topicForEdit;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), false, null, 3, null) {
                private boolean firstLayout = true;

                @Override
                protected void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                    super.onLayout(z, i4, i5, i6, i7);
                    if (this.firstLayout) {
                        this.firstLayout = false;
                        TopicCreateFragment.this.selectAnimatedEmojiDialog.onShow(null);
                    }
                }

                @Override
                protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    boolean z = false;
                    if (!TextUtils.isEmpty(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons)) {
                        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = TopicCreateFragment.this.getMediaDataController().getStickerSetByEmojiOrName(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons);
                        if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                            z = true;
                        }
                    }
                    TopicCreateFragment.this.selectEmoji(l, z);
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialog;
            selectAnimatedEmojiDialog.setAnimationsEnabled(this.fragmentBeginToShow);
            this.selectAnimatedEmojiDialog.setClipChildren(false);
            frameLayout2.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            Drawable drawableCreateTopicDrawable = ForumUtilities.createTopicDrawable("", this.iconColor, false);
            this.forumBubbleDrawable = (ForumBubbleDrawable) ((CombinedDrawable) drawableCreateTopicDrawable).getBackgroundDrawable();
            this.replaceableIconDrawable = new ReplaceableIconDrawable(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawableCreateTopicDrawable, this.replaceableIconDrawable, 0, 0);
            combinedDrawable.setFullsize(true);
            this.selectAnimatedEmojiDialog.setForumIconDrawable(combinedDrawable);
            this.defaultIconDrawable = combinedDrawable;
            this.replaceableIconDrawable.addView(this.backupImageView[0]);
            this.replaceableIconDrawable.addView(this.backupImageView[1]);
            this.backupImageView[0].setImageDrawable(this.defaultIconDrawable);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 1.0f, false);
            this.forumBubbleDrawable.addParent(this.backupImageView[0]);
            this.forumBubbleDrawable.addParent(this.backupImageView[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_inMenu), PorterDuff.Mode.MULTIPLY));
            anonymousClass4.addView(imageView, LayoutHelper.createFrame(22, 22, 17));
            frameLayout2.addView(new View(context), LayoutHelper.createFrame(-1, 8.0f));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), getThemedColor(i3)));
            TextCheckCell2 textCheckCell2 = new TextCheckCell2(context);
            this.checkBoxCell = textCheckCell2;
            textCheckCell2.getCheckBox().setDrawIconType(0);
            this.checkBoxCell.setTextAndCheck(LocaleController.getString(R.string.EditTopicHide), !this.topicForEdit.hidden, false);
            this.checkBoxCell.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i3), getThemedColor(Theme.key_listSelector), 16, 16));
            this.checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicCreateFragment.$r8$lambda$kvG1dE7eLNKOM9l1fghyaGWQpjo(this.f$0, view);
                }
            });
            frameLayout3.addView(this.checkBoxCell, LayoutHelper.createFrame(-1, 50, 119));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(textInfoPrivacyCell, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.topicForEdit;
        if (tL_forumTopic3 != null) {
            this.editTextBoldCursor.setText(tL_forumTopic3.title);
            selectEmoji(Long.valueOf(this.topicForEdit.icon_emoji_id), true);
        } else {
            selectEmoji(0L, true);
        }
        return this.fragmentView;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public static void $r8$lambda$amldw3qyO9IcHiCsIMINuL4IC4E(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public static void $r8$lambda$otLZCyN9xeFR8YST98V_B6y2Ojk(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            final String string;
            TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic;
            TLRPC.TL_forumTopic tL_forumTopic;
            long j;
            long j2;
            if (i == -1) {
                TopicCreateFragment.this.finishFragment();
                return;
            }
            if (i == 1) {
                string = TopicCreateFragment.this.editTextBoldCursor.getText() != null ? TopicCreateFragment.this.editTextBoldCursor.getText().toString() : null;
                if (TextUtils.isEmpty(string)) {
                    Vibrator vibrator = (Vibrator) TopicCreateFragment.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(TopicCreateFragment.this.editTextBoldCursor);
                    return;
                }
                if (TopicCreateFragment.this.created) {
                    return;
                }
                final AlertDialog alertDialog = new AlertDialog(TopicCreateFragment.this.getParentActivity(), 3);
                alertDialog.showDelayed(500L);
                TopicCreateFragment.this.created = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = TopicCreateFragment.this.getMessagesController().getInputPeer(TopicCreateFragment.this.dialogId);
                tL_messages_createForumTopic.title = string;
                long j3 = TopicCreateFragment.this.selectedEmojiDocumentId;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                tL_messages_createForumTopic.icon_color = topicCreateFragment.iconColor;
                tL_messages_createForumTopic.flags |= 1;
                ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment).currentAccount).sendRequest(tL_messages_createForumTopic, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TopicCreateFragment.AnonymousClass1.m4712$r8$lambda$PwIO4Da7WdhSX33G__7E4krU8w(this.f$0, string, alertDialog, tLObject, tL_error);
                    }
                });
                return;
            }
            if (i == 2) {
                string = TopicCreateFragment.this.editTextBoldCursor.getText() != null ? TopicCreateFragment.this.editTextBoldCursor.getText().toString() : null;
                if (TextUtils.isEmpty(string)) {
                    Vibrator vibrator2 = (Vibrator) TopicCreateFragment.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator2 != null) {
                        vibrator2.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(TopicCreateFragment.this.editTextBoldCursor);
                    return;
                }
                if (TopicCreateFragment.this.topicForEdit.title.equals(string)) {
                    TopicCreateFragment topicCreateFragment2 = TopicCreateFragment.this;
                    if (topicCreateFragment2.topicForEdit.icon_emoji_id != topicCreateFragment2.selectedEmojiDocumentId) {
                        tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                        tL_messages_editForumTopic.peer = TopicCreateFragment.this.getMessagesController().getInputPeer(TopicCreateFragment.this.dialogId);
                        tL_forumTopic = TopicCreateFragment.this.topicForEdit;
                        tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                        if (!tL_forumTopic.title.equals(string)) {
                            tL_messages_editForumTopic.title = string;
                            tL_messages_editForumTopic.flags |= 1;
                        }
                        TopicCreateFragment topicCreateFragment3 = TopicCreateFragment.this;
                        j = topicCreateFragment3.topicForEdit.icon_emoji_id;
                        j2 = topicCreateFragment3.selectedEmojiDocumentId;
                        if (j != j2) {
                            tL_messages_editForumTopic.icon_emoji_id = j2;
                            tL_messages_editForumTopic.flags |= 2;
                        }
                        ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment3).currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                TopicCreateFragment.AnonymousClass1.$r8$lambda$otLZCyN9xeFR8YST98V_B6y2Ojk(tLObject, tL_error);
                            }
                        });
                    }
                } else {
                    tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic.peer = TopicCreateFragment.this.getMessagesController().getInputPeer(TopicCreateFragment.this.dialogId);
                    tL_forumTopic = TopicCreateFragment.this.topicForEdit;
                    tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                    if (!tL_forumTopic.title.equals(string)) {
                        tL_messages_editForumTopic.title = string;
                        tL_messages_editForumTopic.flags |= 1;
                    }
                    TopicCreateFragment topicCreateFragment4 = TopicCreateFragment.this;
                    j = topicCreateFragment4.topicForEdit.icon_emoji_id;
                    j2 = topicCreateFragment4.selectedEmojiDocumentId;
                    if (j != j2) {
                        tL_messages_editForumTopic.icon_emoji_id = j2;
                        tL_messages_editForumTopic.flags |= 2;
                    }
                    ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment4).currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            TopicCreateFragment.AnonymousClass1.$r8$lambda$otLZCyN9xeFR8YST98V_B6y2Ojk(tLObject, tL_error);
                        }
                    });
                }
                TopicCreateFragment topicCreateFragment5 = TopicCreateFragment.this;
                TextCheckCell2 textCheckCell2 = topicCreateFragment5.checkBoxCell;
                if (textCheckCell2 != null && topicCreateFragment5.topicForEdit.id == 1 && (!textCheckCell2.isChecked()) != TopicCreateFragment.this.topicForEdit.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = TopicCreateFragment.this.getMessagesController().getInputPeer(TopicCreateFragment.this.dialogId);
                    TopicCreateFragment topicCreateFragment6 = TopicCreateFragment.this;
                    tL_messages_editForumTopic2.topic_id = topicCreateFragment6.topicForEdit.id;
                    tL_messages_editForumTopic2.hidden = !topicCreateFragment6.checkBoxCell.isChecked();
                    tL_messages_editForumTopic2.flags |= 8;
                    ConnectionsManager.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).sendRequest(tL_messages_editForumTopic2, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            TopicCreateFragment.AnonymousClass1.$r8$lambda$amldw3qyO9IcHiCsIMINuL4IC4E(tLObject, tL_error);
                        }
                    });
                }
                TopicCreateFragment topicCreateFragment7 = TopicCreateFragment.this;
                TLRPC.TL_forumTopic tL_forumTopic2 = topicCreateFragment7.topicForEdit;
                long j4 = topicCreateFragment7.selectedEmojiDocumentId;
                tL_forumTopic2.icon_emoji_id = j4;
                if (j4 != 0) {
                    tL_forumTopic2.flags |= 1;
                } else {
                    tL_forumTopic2.flags &= -2;
                }
                tL_forumTopic2.title = string;
                TextCheckCell2 textCheckCell3 = topicCreateFragment7.checkBoxCell;
                if (textCheckCell3 != null) {
                    tL_forumTopic2.hidden = !textCheckCell3.isChecked();
                }
                TopicsController topicsController = TopicCreateFragment.this.getMessagesController().getTopicsController();
                TopicCreateFragment topicCreateFragment8 = TopicCreateFragment.this;
                topicsController.onTopicEdited(topicCreateFragment8.dialogId, topicCreateFragment8.topicForEdit);
                TopicCreateFragment.this.finishFragment();
            }
        }

        public static void m4712$r8$lambda$PwIO4Da7WdhSX33G__7E4krU8w(final AnonymousClass1 anonymousClass1, final String str, final AlertDialog alertDialog, final TLObject tLObject, TLRPC.TL_error tL_error) {
            anonymousClass1.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicCreateFragment.AnonymousClass1.$r8$lambda$wSDO2KTp9gW8_7FbW7aysWR26V8(this.f$0, tLObject, str, alertDialog);
                }
            });
        }

        public static void $r8$lambda$wSDO2KTp9gW8_7FbW7aysWR26V8(AnonymousClass1 anonymousClass1, TLObject tLObject, String str, AlertDialog alertDialog) {
            anonymousClass1.getClass();
            if (tLObject != null) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                for (int i = 0; i < updates.updates.size(); i++) {
                    if (updates.updates.get(i) instanceof TL_update.TL_updateMessageID) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i);
                        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                        tL_messageActionTopicCreate.title = str;
                        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                        tL_messageService.action = tL_messageActionTopicCreate;
                        tL_messageService.peer_id = TopicCreateFragment.this.getMessagesController().getPeer(TopicCreateFragment.this.dialogId);
                        tL_messageService.dialog_id = TopicCreateFragment.this.dialogId;
                        tL_messageService.id = tL_updateMessageID.id;
                        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new MessageObject(((BaseFragment) TopicCreateFragment.this).currentAccount, tL_messageService, false, false));
                        TLRPC.Chat chat = TopicCreateFragment.this.getMessagesController().getChat(Long.valueOf(-TopicCreateFragment.this.dialogId));
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        tL_forumTopic.id = tL_updateMessageID.id;
                        TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                        long j = topicCreateFragment.selectedEmojiDocumentId;
                        if (j != 0) {
                            tL_forumTopic.icon_emoji_id = j;
                            tL_forumTopic.flags |= 1;
                        }
                        tL_forumTopic.my = true;
                        tL_forumTopic.flags |= 2;
                        tL_forumTopic.topicStartMessage = tL_messageService;
                        tL_forumTopic.title = str;
                        tL_forumTopic.top_message = tL_messageService.id;
                        tL_forumTopic.topMessage = tL_messageService;
                        tL_forumTopic.from_id = topicCreateFragment.getMessagesController().getPeer(TopicCreateFragment.this.getUserConfig().clientUserId);
                        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                        TopicCreateFragment topicCreateFragment2 = TopicCreateFragment.this;
                        tL_forumTopic.icon_color = topicCreateFragment2.iconColor;
                        if (topicCreateFragment2.openInChatActivity != null) {
                            ChatActivity chatActivity = TopicCreateFragment.this.openInChatActivity;
                            chatActivity.resetForReload();
                            chatActivity.saveDraft();
                            chatActivity.setThreadMessages(arrayList, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                            chatActivity.justCreatedTopic = true;
                            chatActivity.firstLoadMessages();
                            chatActivity.updateTitle(true);
                            chatActivity.avatarContainer.updateSubtitle(true);
                            chatActivity.updateTopicTitleIcon();
                            chatActivity.topicsTabs.setCurrentTopic(chatActivity.getTopicId());
                            chatActivity.updateTopPanel(true);
                            chatActivity.updateBottomOverlay(true);
                            chatActivity.hideFieldPanel(true);
                            chatActivity.applyDraftMaybe(true, true);
                            chatActivity.reloadPinnedMessages();
                            TopicCreateFragment.this.getMessagesController().getTopicsController().onTopicCreated(TopicCreateFragment.this.dialogId, tL_forumTopic, true);
                            TopicCreateFragment.this.finishFragment();
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -TopicCreateFragment.this.dialogId);
                            bundle.putInt("message_id", 1);
                            bundle.putInt("unread_count", 0);
                            bundle.putBoolean("historyPreloaded", false);
                            ChatActivity chatActivity2 = new ChatActivity(bundle);
                            chatActivity2.setThreadMessages(arrayList, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                            chatActivity2.justCreatedTopic = true;
                            TopicCreateFragment.this.getMessagesController().getTopicsController().onTopicCreated(TopicCreateFragment.this.dialogId, tL_forumTopic, true);
                            TopicCreateFragment.this.presentFragment(chatActivity2);
                        }
                    }
                }
            }
            alertDialog.dismiss();
        }
    }

    class AnonymousClass4 extends FrameLayout {
        ValueAnimator backAnimator;
        boolean pressed;
        float pressedProgress;

        AnonymousClass4(Context context) {
            super(context);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f, f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
            updatePressedProgress();
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            super.setPressed(z);
            if (this.pressed != z) {
                this.pressed = z;
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            TopicCreateFragment.AnonymousClass4.m4713$r8$lambda$2_nAxGvF0zBLtqa9kS8rv7TxVE(this.f$0, valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            AnonymousClass4.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public static void m4713$r8$lambda$2_nAxGvF0zBLtqa9kS8rv7TxVE(AnonymousClass4 anonymousClass4, ValueAnimator valueAnimator) {
            anonymousClass4.getClass();
            anonymousClass4.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            anonymousClass4.invalidate();
        }

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f + 0.16f, 1.0f, 0.0f);
                    invalidate();
                }
            }
        }
    }

    public static void $r8$lambda$a2RNku4DYrZTpVveSVV7P8P92z0(TopicCreateFragment topicCreateFragment, View view) {
        if (topicCreateFragment.selectedEmojiDocumentId == 0 && topicCreateFragment.topicForEdit == null) {
            topicCreateFragment.iconColor = topicCreateFragment.forumBubbleDrawable.moveNexColor();
        }
    }

    public static void $r8$lambda$kvG1dE7eLNKOM9l1fghyaGWQpjo(TopicCreateFragment topicCreateFragment, View view) {
        TextCheckCell2 textCheckCell2 = topicCreateFragment.checkBoxCell;
        textCheckCell2.setChecked(!textCheckCell2.isChecked());
    }

    public void selectEmoji(Long l, boolean z) {
        if (this.selectAnimatedEmojiDialog == null || this.replaceableIconDrawable == null) {
            return;
        }
        long jLongValue = l == null ? 0L : l.longValue();
        this.selectAnimatedEmojiDialog.setSelected(Long.valueOf(jLongValue));
        if (this.selectedEmojiDocumentId == jLongValue) {
            return;
        }
        if (!z && jLongValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, l.longValue());
            if (documentFindDocument != null) {
                BulletinFactory.of(this).createEmojiBulletin(documentFindDocument, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new Runnable() {
                    @Override
                    public final void run() {
                        TopicCreateFragment.$r8$lambda$ctetwWiUVV4z_Iz0z1lb0rzXQcc(this.f$0);
                    }
                }).show();
                return;
            }
            return;
        }
        this.selectedEmojiDocumentId = jLongValue;
        if (jLongValue != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(10, this.currentAccount, jLongValue);
            animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
            this.backupImageView[1].setAnimatedEmojiDrawable(animatedEmojiDrawable);
            this.backupImageView[1].setImageDrawable(null);
        } else {
            LetterDrawable letterDrawable = new LetterDrawable(null, 1);
            letterDrawable.setTitle(this.firstSymbol);
            this.replaceableIconDrawable.setIcon((Drawable) letterDrawable, false);
            this.backupImageView[1].setImageDrawable(this.defaultIconDrawable);
            this.backupImageView[1].setAnimatedEmojiDrawable(null);
        }
        BackupImageView[] backupImageViewArr = this.backupImageView;
        BackupImageView backupImageView = backupImageViewArr[0];
        BackupImageView backupImageView2 = backupImageViewArr[1];
        backupImageViewArr[0] = backupImageView2;
        backupImageViewArr[1] = backupImageView;
        AndroidUtilities.updateViewVisibilityAnimated(backupImageView2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 0.5f, true);
    }

    public static void $r8$lambda$ctetwWiUVV4z_Iz0z1lb0rzXQcc(TopicCreateFragment topicCreateFragment) {
        topicCreateFragment.getClass();
        new PremiumFeatureBottomSheet(topicCreateFragment, 11, false).show();
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.notificationsLocker.lock();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.created) {
            removeSelfFromStack();
        }
        this.notificationsLocker.unlock();
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        showKeyboard();
    }

    public void showKeyboard() {
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
    }
}
