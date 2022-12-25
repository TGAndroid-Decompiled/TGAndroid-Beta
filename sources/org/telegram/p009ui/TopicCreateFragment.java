package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.TextCheckCell2;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.p009ui.Components.Forum.ForumUtilities;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LetterDrawable;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.ReplaceableIconDrawable;
import org.telegram.p009ui.Components.SizeNotifierFrameLayout;
import org.telegram.p009ui.TopicCreateFragment;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_updateMessageID;
import org.telegram.tgnet.TLRPC$Updates;

public class TopicCreateFragment extends BaseFragment {
    int animationIndex;
    BackupImageView[] backupImageView;
    long chatId;
    TextCheckCell2 checkBoxCell;
    boolean created;
    Drawable defaultIconDrawable;
    EditTextBoldCursor editTextBoldCursor;
    String firstSymbol;
    ForumBubbleDrawable forumBubbleDrawable;
    int iconColor;
    ReplaceableIconDrawable replaceableIconDrawable;
    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    long selectedEmojiDocumentId;
    TLRPC$TL_forumTopic topicForEdit;
    int topicId;

    public static TopicCreateFragment create(long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putInt("topic_id", i);
        return new TopicCreateFragment(bundle);
    }

    private TopicCreateFragment(Bundle bundle) {
        super(bundle);
        this.backupImageView = new BackupImageView[2];
        this.firstSymbol = "";
        this.animationIndex = 0;
    }

    @Override
    public boolean onFragmentCreate() {
        this.chatId = this.arguments.getLong("chat_id");
        int i = this.arguments.getInt("topic_id", 0);
        this.topicId = i;
        if (i != 0) {
            TLRPC$TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.chatId, this.topicId);
            this.topicForEdit = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.iconColor = findTopic.icon_color;
        } else {
            int[] iArr = ForumBubbleDrawable.serverSupportedColor;
            this.iconColor = iArr[Math.abs(Utilities.random.nextInt() % iArr.length)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        if (this.topicForEdit != null) {
            this.actionBar.setTitle(LocaleController.getString("EditTopic", C1072R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString("NewTopic", C1072R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new C41741());
        if (this.topicForEdit == null) {
            this.actionBar.createMenu().addItem(1, LocaleController.getString("Create", C1072R.string.Create).toUpperCase());
        } else {
            this.actionBar.createMenu().addItem(2, C1072R.C1073drawable.ic_ab_done);
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(this, context) {
            boolean keyboardWasShown;

            @Override
            protected void onMeasure(int i, int i2) {
                measureKeyboardHeight();
                if (getKeyboardHeight() == 0 && !this.keyboardWasShown) {
                    int i3 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.m35dp(200.0f));
                    this.keyboardHeight = i3;
                    setPadding(0, 0, 0, i3);
                } else {
                    this.keyboardWasShown = true;
                    setPadding(0, 0, 0, 0);
                }
                super.onMeasure(i, i2);
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        sizeNotifierFrameLayout.addView(linearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.topicForEdit;
        if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.f910id == 1) {
            headerCell.setText(LocaleController.getString("CreateGeneralTopicTitle", C1072R.string.CreateGeneralTopicTitle));
        } else {
            headerCell.setText(LocaleController.getString("CreateTopicTitle", C1072R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editTextBoldCursor = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString("EnterTopicName", C1072R.string.EnterTopicName));
        this.editTextBoldCursor.setHintColor(getThemedColor("chat_messagePanelHint"));
        this.editTextBoldCursor.setTextColor(getThemedColor("chat_messagePanelText"));
        this.editTextBoldCursor.setPadding(AndroidUtilities.m35dp(0.0f), this.editTextBoldCursor.getPaddingTop(), AndroidUtilities.m35dp(0.0f), this.editTextBoldCursor.getPaddingBottom());
        this.editTextBoldCursor.setBackgroundDrawable(null);
        this.editTextBoldCursor.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.editTextBoldCursor;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.editTextBoldCursor, LayoutHelper.createFrame(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                String str = TopicCreateFragment.this.firstSymbol;
                if (trim.length() > 0) {
                    TopicCreateFragment.this.firstSymbol = trim.substring(0, 1).toUpperCase();
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
        C41774 c41774 = new C41774(this, context);
        c41774.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicCreateFragment.this.lambda$createView$0(view);
            }
        });
        for (int i = 0; i < 2; i++) {
            this.backupImageView[i] = new BackupImageView(context);
            c41774.addView(this.backupImageView[i], LayoutHelper.createFrame(28, 28, 17));
        }
        frameLayout.addView(c41774, LayoutHelper.createFrame(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(headerCell);
        linearLayout.addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(context, C1072R.C1073drawable.greydivider_top, Theme.getColor("windowBackgroundGrayShadow")), 0, 0);
        combinedDrawable.setFullsize(true);
        frameLayout2.setBackgroundDrawable(combinedDrawable);
        frameLayout2.setClipChildren(false);
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = this.topicForEdit;
        if (tLRPC$TL_forumTopic2 == null || tLRPC$TL_forumTopic2.f910id != 1) {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), false, null, 3, null) {
                private boolean firstLayout = true;

                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    if (this.firstLayout) {
                        this.firstLayout = false;
                        TopicCreateFragment.this.selectAnimatedEmojiDialog.onShow(null);
                    }
                }

                @Override
                protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
                    boolean z = false;
                    if (!TextUtils.isEmpty(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons)) {
                        TLRPC$TL_messages_stickerSet stickerSetByEmojiOrName = TopicCreateFragment.this.getMediaDataController().getStickerSetByEmojiOrName(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons);
                        if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.f890id) == MediaDataController.getStickerSetId(tLRPC$Document)) {
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
            Drawable createTopicDrawable = ForumUtilities.createTopicDrawable("", this.iconColor);
            this.forumBubbleDrawable = (ForumBubbleDrawable) ((CombinedDrawable) createTopicDrawable).getBackgroundDrawable();
            this.replaceableIconDrawable = new ReplaceableIconDrawable(context);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(createTopicDrawable, this.replaceableIconDrawable, 0, 0);
            combinedDrawable2.setFullsize(true);
            this.selectAnimatedEmojiDialog.setForumIconDrawable(combinedDrawable2);
            this.defaultIconDrawable = combinedDrawable2;
            this.replaceableIconDrawable.addView(this.backupImageView[0]);
            this.replaceableIconDrawable.addView(this.backupImageView[1]);
            this.backupImageView[0].setImageDrawable(this.defaultIconDrawable);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 1.0f, false);
            this.forumBubbleDrawable.addParent(this.backupImageView[0]);
            this.forumBubbleDrawable.addParent(this.backupImageView[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(C1072R.C1073drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_inMenu"), PorterDuff.Mode.MULTIPLY));
            c41774.addView(imageView, LayoutHelper.createFrame(22, 22, 17));
            frameLayout2.addView(new ActionBarPopupWindow.GapView(context, getResourceProvider()), LayoutHelper.createFrame(-1, 8.0f));
            TextCheckCell2 textCheckCell2 = new TextCheckCell2(context);
            this.checkBoxCell = textCheckCell2;
            textCheckCell2.getCheckBox().setDrawIconType(0);
            this.checkBoxCell.setTextAndCheck(LocaleController.getString("EditTopicHide", C1072R.string.EditTopicHide), !this.topicForEdit.hidden, false);
            this.checkBoxCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor("windowBackgroundWhite"), getThemedColor("listSelectorSDK21")));
            this.checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicCreateFragment.this.lambda$createView$1(view);
                }
            });
            frameLayout2.addView(this.checkBoxCell, LayoutHelper.createFrame(-1, 50.0f, 48, 0.0f, 8.0f, 0.0f, 0.0f));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            textInfoPrivacyCell.setText(LocaleController.getString("EditTopicHideInfo", C1072R.string.EditTopicHideInfo));
            textInfoPrivacyCell.setBackground(Theme.getThemedDrawable(getContext(), C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow", getResourceProvider()));
            frameLayout2.addView(textInfoPrivacyCell, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic3 = this.topicForEdit;
        if (tLRPC$TL_forumTopic3 != null) {
            this.editTextBoldCursor.setText(tLRPC$TL_forumTopic3.title);
            selectEmoji(Long.valueOf(this.topicForEdit.icon_emoji_id), true);
        } else {
            selectEmoji(0L, true);
        }
        return this.fragmentView;
    }

    public class C41741 extends C1133ActionBar.ActionBarMenuOnItemClick {
        public static void lambda$onItemClick$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        public static void lambda$onItemClick$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        C41741() {
        }

        @Override
        public void onItemClick(int r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.TopicCreateFragment.C41741.onItemClick(int):void");
        }

        public void lambda$onItemClick$1(final String str, final AlertDialog alertDialog, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicCreateFragment.C41741.this.lambda$onItemClick$0(tLObject, str, alertDialog);
                }
            });
        }

        public void lambda$onItemClick$0(TLObject tLObject, String str, AlertDialog alertDialog) {
            if (tLObject != null) {
                TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
                for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
                    if (tLRPC$Updates.updates.get(i) instanceof TLRPC$TL_updateMessageID) {
                        TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) tLRPC$Updates.updates.get(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", TopicCreateFragment.this.chatId);
                        bundle.putInt("message_id", 1);
                        bundle.putInt("unread_count", 0);
                        bundle.putBoolean("historyPreloaded", false);
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        TLRPC$TL_messageActionTopicCreate tLRPC$TL_messageActionTopicCreate = new TLRPC$TL_messageActionTopicCreate();
                        tLRPC$TL_messageActionTopicCreate.title = str;
                        TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
                        tLRPC$TL_messageService.action = tLRPC$TL_messageActionTopicCreate;
                        tLRPC$TL_messageService.peer_id = TopicCreateFragment.this.getMessagesController().getPeer(-TopicCreateFragment.this.chatId);
                        tLRPC$TL_messageService.dialog_id = -TopicCreateFragment.this.chatId;
                        tLRPC$TL_messageService.f881id = tLRPC$TL_updateMessageID.f990id;
                        tLRPC$TL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                        ArrayList<MessageObject> arrayList = new ArrayList<>();
                        arrayList.add(new MessageObject(((BaseFragment) TopicCreateFragment.this).currentAccount, tLRPC$TL_messageService, false, false));
                        TLRPC$Chat chat = TopicCreateFragment.this.getMessagesController().getChat(Long.valueOf(TopicCreateFragment.this.chatId));
                        TLRPC$TL_forumTopic tLRPC$TL_forumTopic = new TLRPC$TL_forumTopic();
                        tLRPC$TL_forumTopic.f910id = tLRPC$TL_updateMessageID.f990id;
                        TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                        long j = topicCreateFragment.selectedEmojiDocumentId;
                        if (j != 0) {
                            tLRPC$TL_forumTopic.icon_emoji_id = j;
                            tLRPC$TL_forumTopic.flags |= 1;
                        }
                        tLRPC$TL_forumTopic.f911my = true;
                        tLRPC$TL_forumTopic.flags |= 2;
                        tLRPC$TL_forumTopic.topicStartMessage = tLRPC$TL_messageService;
                        tLRPC$TL_forumTopic.title = str;
                        tLRPC$TL_forumTopic.top_message = tLRPC$TL_messageService.f881id;
                        tLRPC$TL_forumTopic.topMessage = tLRPC$TL_messageService;
                        tLRPC$TL_forumTopic.from_id = topicCreateFragment.getMessagesController().getPeer(TopicCreateFragment.this.getUserConfig().clientUserId);
                        tLRPC$TL_forumTopic.notify_settings = new TLRPC$TL_peerNotifySettings();
                        tLRPC$TL_forumTopic.icon_color = TopicCreateFragment.this.iconColor;
                        chatActivity.setThreadMessages(arrayList, chat, tLRPC$TL_messageService.f881id, 1, 1, tLRPC$TL_forumTopic);
                        chatActivity.justCreatedTopic = true;
                        TopicCreateFragment.this.getMessagesController().getTopicsController().onTopicCreated(-TopicCreateFragment.this.chatId, tLRPC$TL_forumTopic, true);
                        TopicCreateFragment.this.presentFragment(chatActivity);
                    }
                }
            }
            alertDialog.dismiss();
        }
    }

    public class C41774 extends FrameLayout {
        ValueAnimator backAnimator;
        boolean pressed;
        float pressedProgress;

        C41774(TopicCreateFragment topicCreateFragment, Context context) {
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
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            TopicCreateFragment.C41774.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C41774.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
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

    public void lambda$createView$0(View view) {
        if (this.selectedEmojiDocumentId == 0 && this.topicForEdit == null) {
            this.iconColor = this.forumBubbleDrawable.moveNexColor();
        }
    }

    public void lambda$createView$1(View view) {
        TextCheckCell2 textCheckCell2 = this.checkBoxCell;
        textCheckCell2.setChecked(!textCheckCell2.isChecked());
    }

    public void selectEmoji(Long l, boolean z) {
        if (this.selectAnimatedEmojiDialog == null || this.replaceableIconDrawable == null) {
            return;
        }
        long longValue = l == null ? 0L : l.longValue();
        this.selectAnimatedEmojiDialog.setSelected(Long.valueOf(longValue));
        if (this.selectedEmojiDocumentId == longValue) {
            return;
        }
        if (!z && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC$Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, l.longValue());
            if (findDocument != null) {
                BulletinFactory.m13of(this).createEmojiBulletin(findDocument, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", C1072R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", C1072R.string.PremiumMore), new Runnable() {
                    @Override
                    public final void run() {
                        TopicCreateFragment.this.lambda$selectEmoji$2();
                    }
                }).show();
                return;
            }
            return;
        }
        this.selectedEmojiDocumentId = longValue;
        if (longValue != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(10, this.currentAccount, longValue);
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
        backupImageViewArr[0] = backupImageViewArr[1];
        backupImageViewArr[1] = backupImageView;
        AndroidUtilities.updateViewVisibilityAnimated(backupImageViewArr[0], true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 0.5f, true);
    }

    public void lambda$selectEmoji$2() {
        new PremiumFeatureBottomSheet(this, 11, false).show();
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.animationIndex = getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.created) {
            removeSelfFromStack();
        }
        getNotificationCenter().onAnimationFinish(this.animationIndex);
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void showKeyboard() {
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
    }
}
