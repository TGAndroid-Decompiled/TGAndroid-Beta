package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
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
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.web.WebActionBar;

public final class TopicCreateFragment extends BaseFragment {
    public final BackupImageView[] backupImageView;
    public TextCheckCell2 checkBoxCell;
    public boolean created;
    public CombinedDrawable defaultIconDrawable;
    public long dialogId;
    public EditTextBoldCursor editTextBoldCursor;
    public String firstSymbol;
    public ForumBubbleDrawable forumBubbleDrawable;
    public int iconColor;
    public final AnimationNotificationsLocker notificationsLocker;
    public ChatActivity openInChatActivity;
    public ReplaceableIconDrawable replaceableIconDrawable;
    public AnonymousClass5 selectAnimatedEmojiDialog;
    public long selectedEmojiDocumentId;
    public TLRPC.TL_forumTopic topicForEdit;
    public long topicId;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
            if (i == -1) {
                topicCreateFragment.finishFragment();
                return;
            }
            if (i == 1) {
                String string = topicCreateFragment.editTextBoldCursor.getText() == null ? null : topicCreateFragment.editTextBoldCursor.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    Vibrator vibrator = (Vibrator) topicCreateFragment.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(topicCreateFragment.editTextBoldCursor);
                    return;
                }
                if (topicCreateFragment.created) {
                    return;
                }
                AlertDialog alertDialog = new AlertDialog(topicCreateFragment.getParentActivity(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                topicCreateFragment.created = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = topicCreateFragment.getMessagesController().getInputPeer(topicCreateFragment.dialogId);
                tL_messages_createForumTopic.title = string;
                long j = topicCreateFragment.selectedEmojiDocumentId;
                if (j != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = topicCreateFragment.iconColor;
                tL_messages_createForumTopic.flags |= 1;
                ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment).currentAccount).sendRequest(tL_messages_createForumTopic, new StarGiftSheet$$ExternalSyntheticLambda7(this, string, alertDialog, 7));
                return;
            }
            if (i == 2) {
                String string2 = topicCreateFragment.editTextBoldCursor.getText() != null ? topicCreateFragment.editTextBoldCursor.getText().toString() : null;
                if (TextUtils.isEmpty(string2)) {
                    Vibrator vibrator2 = (Vibrator) topicCreateFragment.getParentActivity().getSystemService("vibrator");
                    if (vibrator2 != null) {
                        vibrator2.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(topicCreateFragment.editTextBoldCursor);
                    return;
                }
                if (!topicCreateFragment.topicForEdit.title.equals(string2) || topicCreateFragment.topicForEdit.icon_emoji_id != topicCreateFragment.selectedEmojiDocumentId) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic.peer = topicCreateFragment.getMessagesController().getInputPeer(topicCreateFragment.dialogId);
                    TLRPC.TL_forumTopic tL_forumTopic = topicCreateFragment.topicForEdit;
                    tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                    if (!tL_forumTopic.title.equals(string2)) {
                        tL_messages_editForumTopic.title = string2;
                        tL_messages_editForumTopic.flags |= 1;
                    }
                    long j2 = topicCreateFragment.topicForEdit.icon_emoji_id;
                    long j3 = topicCreateFragment.selectedEmojiDocumentId;
                    if (j2 != j3) {
                        tL_messages_editForumTopic.icon_emoji_id = j3;
                        tL_messages_editForumTopic.flags |= 2;
                    }
                    ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment).currentAccount).sendRequest(tL_messages_editForumTopic, new PassportActivity$$ExternalSyntheticLambda1(1));
                }
                TextCheckCell2 textCheckCell2 = topicCreateFragment.checkBoxCell;
                if (textCheckCell2 != null) {
                    TLRPC.TL_forumTopic tL_forumTopic2 = topicCreateFragment.topicForEdit;
                    if (tL_forumTopic2.id == 1 && (!textCheckCell2.checkBox.isChecked) != tL_forumTopic2.hidden) {
                        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                        tL_messages_editForumTopic2.peer = topicCreateFragment.getMessagesController().getInputPeer(topicCreateFragment.dialogId);
                        tL_messages_editForumTopic2.topic_id = topicCreateFragment.topicForEdit.id;
                        tL_messages_editForumTopic2.hidden = !topicCreateFragment.checkBoxCell.checkBox.isChecked;
                        tL_messages_editForumTopic2.flags |= 8;
                        ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment).currentAccount).sendRequest(tL_messages_editForumTopic2, new PassportActivity$$ExternalSyntheticLambda1(1));
                    }
                }
                TLRPC.TL_forumTopic tL_forumTopic3 = topicCreateFragment.topicForEdit;
                long j4 = topicCreateFragment.selectedEmojiDocumentId;
                tL_forumTopic3.icon_emoji_id = j4;
                if (j4 != 0) {
                    tL_forumTopic3.flags |= 1;
                } else {
                    tL_forumTopic3.flags &= -2;
                }
                tL_forumTopic3.title = string2;
                TextCheckCell2 textCheckCell3 = topicCreateFragment.checkBoxCell;
                if (textCheckCell3 != null) {
                    tL_forumTopic3.hidden = !textCheckCell3.checkBox.isChecked;
                }
                topicCreateFragment.getMessagesController().getTopicsController().onTopicEdited(topicCreateFragment.dialogId, topicCreateFragment.topicForEdit);
                topicCreateFragment.finishFragment();
            }
        }
    }

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        public boolean keyboardWasShown;

        @Override
        public final void onMeasure(int i, int i2) {
            measureKeyboardHeight();
            if (getKeyboardHeight() != 0 || this.keyboardWasShown) {
                this.keyboardWasShown = true;
                setPadding(0, 0, 0, 0);
            } else {
                int i3 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                this.keyboardHeight = i3;
                setPadding(0, 0, 0, i3);
            }
            super.onMeasure(i, i2);
        }
    }

    public final class AnonymousClass4 extends FrameLayout {
        public ValueAnimator backAnimator;
        public boolean pressed;
        public float pressedProgress;

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f, f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
            if (isPressed()) {
                float f2 = this.pressedProgress;
                if (f2 != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f2 + 0.16f, 1.0f, 0.0f);
                    invalidate();
                }
            }
        }

        @Override
        public final void setPressed(boolean z) {
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
                    valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 20));
                    this.backAnimator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 8));
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }
    }

    public TopicCreateFragment(Bundle bundle) {
        super(bundle);
        this.backupImageView = new BackupImageView[2];
        this.firstSymbol = "";
        this.notificationsLocker = new AnimationNotificationsLocker();
    }

    public static TopicCreateFragment create(long j, long j2) {
        Bundle bundleM = FBool.m(j, "chat_id");
        bundleM.putLong("topic_id", j2);
        return new TopicCreateFragment(bundleM);
    }

    @Override
    public final View createView(Context context) {
        BackupImageView[] backupImageViewArr;
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
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, null);
        this.fragmentView = anonymousClass2;
        anonymousClass2.setBackgroundColor(getThemedColor(i));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        anonymousClass2.addView(linearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.topicForEdit;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            headerCell.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            headerCell.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
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
        this.editTextBoldCursor.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 5));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        final int i2 = 0;
        anonymousClass4.setOnClickListener(new View.OnClickListener(this) {
            public final TopicCreateFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                TopicCreateFragment topicCreateFragment = this.f$0;
                switch (i2) {
                    case 0:
                        if (topicCreateFragment.selectedEmojiDocumentId == 0 && topicCreateFragment.topicForEdit == null) {
                            ForumBubbleDrawable forumBubbleDrawable = topicCreateFragment.forumBubbleDrawable;
                            int i3 = forumBubbleDrawable.colorIndex + 1;
                            forumBubbleDrawable.colorIndex = i3;
                            int[] iArr = ForumBubbleDrawable.serverSupportedColor;
                            if (i3 > 5) {
                                forumBubbleDrawable.colorIndex = 0;
                            }
                            int[] iArr2 = forumBubbleDrawable.currentColors;
                            int i4 = iArr[forumBubbleDrawable.colorIndex];
                            forumBubbleDrawable.color = i4;
                            forumBubbleDrawable.currentColors = (int[]) ForumBubbleDrawable.colorsMap.get(i4);
                            if (Theme.currentTheme.isDark()) {
                                forumBubbleDrawable.currentColors = new int[]{ColorUtils.blendARGB(0.2f, forumBubbleDrawable.currentColors[0], -1), ColorUtils.blendARGB(0.2f, forumBubbleDrawable.currentColors[1], -1)};
                            }
                            forumBubbleDrawable.invalidateSelf();
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(13, forumBubbleDrawable, iArr2));
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.start();
                            topicCreateFragment.iconColor = iArr[forumBubbleDrawable.colorIndex];
                            break;
                        }
                        break;
                    default:
                        TextCheckCell2 textCheckCell2 = topicCreateFragment.checkBoxCell;
                        textCheckCell2.setChecked(true ^ textCheckCell2.checkBox.isChecked);
                        break;
                }
            }
        });
        int i3 = 0;
        while (true) {
            backupImageViewArr = this.backupImageView;
            if (i3 >= 2) {
                break;
            }
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageViewArr[i3] = backupImageView;
            anonymousClass4.addView(backupImageView, LayoutHelper.createFrame(28, 28, 17));
            i3++;
        }
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(headerCell);
        linearLayout2.addView(frameLayout);
        int iDp = AndroidUtilities.dp(16.0f);
        int i4 = Theme.key_windowBackgroundWhite;
        linearLayout2.setBackground(Theme.createRoundRectDrawableShadowed(iDp, getThemedColor(i4)));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.topicForEdit;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            ?? r2 = new SelectAnimatedEmojiDialog(this, getParentActivity()) {
                public boolean firstLayout = true;

                @Override
                public final void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                    boolean z = false;
                    if (!TextUtils.isEmpty(UserConfig.getInstance(((BaseFragment) topicCreateFragment).currentAccount).defaultTopicIcons)) {
                        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = topicCreateFragment.getMediaDataController().getStickerSetByEmojiOrName(UserConfig.getInstance(((BaseFragment) topicCreateFragment).currentAccount).defaultTopicIcons);
                        if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                            z = true;
                        }
                    }
                    topicCreateFragment.selectEmoji(l, z);
                }

                @Override
                public final void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                    super.onLayout(z, i5, i6, i7, i8);
                    if (this.firstLayout) {
                        this.firstLayout = false;
                        onShow(null);
                    }
                }
            };
            this.selectAnimatedEmojiDialog = r2;
            r2.setAnimationsEnabled(this.fragmentBeginToShow);
            setClipChildren(false);
            frameLayout2.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            CombinedDrawable combinedDrawableCreateTopicDrawable = ForumUtilities.createTopicDrawable(this.iconColor, "");
            this.forumBubbleDrawable = (ForumBubbleDrawable) combinedDrawableCreateTopicDrawable.background;
            this.replaceableIconDrawable = new ReplaceableIconDrawable(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(combinedDrawableCreateTopicDrawable, this.replaceableIconDrawable, 0, 0);
            combinedDrawable.fullSize = true;
            setForumIconDrawable(combinedDrawable);
            this.defaultIconDrawable = combinedDrawable;
            ReplaceableIconDrawable replaceableIconDrawable = this.replaceableIconDrawable;
            BackupImageView backupImageView2 = backupImageViewArr[0];
            if (!replaceableIconDrawable.parentViews.contains(backupImageView2)) {
                replaceableIconDrawable.parentViews.add(backupImageView2);
            }
            ReplaceableIconDrawable replaceableIconDrawable2 = this.replaceableIconDrawable;
            BackupImageView backupImageView3 = backupImageViewArr[1];
            if (!replaceableIconDrawable2.parentViews.contains(backupImageView3)) {
                replaceableIconDrawable2.parentViews.add(backupImageView3);
            }
            backupImageViewArr[0].setImageDrawable(this.defaultIconDrawable);
            AndroidUtilities.updateViewVisibilityAnimated(backupImageViewArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(backupImageViewArr[1], false, 1.0f, false);
            this.forumBubbleDrawable.parents.add(backupImageViewArr[0]);
            this.forumBubbleDrawable.parents.add(backupImageViewArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_inMenu), PorterDuff.Mode.MULTIPLY));
            anonymousClass4.addView(imageView, LayoutHelper.createFrame(22, 22, 17));
            frameLayout2.addView(new View(context), LayoutHelper.createFrame(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), getThemedColor(i4)));
            TextCheckCell2 textCheckCell2 = new TextCheckCell2(context);
            this.checkBoxCell = textCheckCell2;
            textCheckCell2.getCheckBox().setDrawIconType(0);
            this.checkBoxCell.setTextAndCheck(LocaleController.getString(R.string.EditTopicHide), !this.topicForEdit.hidden, false, false);
            this.checkBoxCell.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i4), getThemedColor(Theme.key_listSelector), 16, 16));
            final int i5 = 1;
            this.checkBoxCell.setOnClickListener(new View.OnClickListener(this) {
                public final TopicCreateFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    TopicCreateFragment topicCreateFragment = this.f$0;
                    switch (i5) {
                        case 0:
                            if (topicCreateFragment.selectedEmojiDocumentId == 0 && topicCreateFragment.topicForEdit == null) {
                                ForumBubbleDrawable forumBubbleDrawable = topicCreateFragment.forumBubbleDrawable;
                                int i6 = forumBubbleDrawable.colorIndex + 1;
                                forumBubbleDrawable.colorIndex = i6;
                                int[] iArr = ForumBubbleDrawable.serverSupportedColor;
                                if (i6 > 5) {
                                    forumBubbleDrawable.colorIndex = 0;
                                }
                                int[] iArr2 = forumBubbleDrawable.currentColors;
                                int i7 = iArr[forumBubbleDrawable.colorIndex];
                                forumBubbleDrawable.color = i7;
                                forumBubbleDrawable.currentColors = (int[]) ForumBubbleDrawable.colorsMap.get(i7);
                                if (Theme.currentTheme.isDark()) {
                                    forumBubbleDrawable.currentColors = new int[]{ColorUtils.blendARGB(0.2f, forumBubbleDrawable.currentColors[0], -1), ColorUtils.blendARGB(0.2f, forumBubbleDrawable.currentColors[1], -1)};
                                }
                                forumBubbleDrawable.invalidateSelf();
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(13, forumBubbleDrawable, iArr2));
                                valueAnimatorOfFloat.setDuration(200L);
                                valueAnimatorOfFloat.start();
                                topicCreateFragment.iconColor = iArr[forumBubbleDrawable.colorIndex];
                                break;
                            }
                            break;
                        default:
                            TextCheckCell2 textCheckCell3 = topicCreateFragment.checkBoxCell;
                            textCheckCell3.setChecked(true ^ textCheckCell3.checkBox.isChecked);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.checkBoxCell, LayoutHelper.createFrame(-1, 50, 119));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(textInfoPrivacyCell, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createFrame(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.topicForEdit;
        if (tL_forumTopic3 != null) {
            this.editTextBoldCursor.setText(tL_forumTopic3.title);
            selectEmoji(Long.valueOf(this.topicForEdit.icon_emoji_id), true);
        } else {
            selectEmoji(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
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
            this.iconColor = ForumBubbleDrawable.serverSupportedColor[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.created) {
            removeSelfFromStack();
        }
        this.notificationsLocker.unlock();
        AnonymousClass5 anonymousClass5 = this.selectAnimatedEmojiDialog;
        if (anonymousClass5 != null) {
            anonymousClass5.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.notificationsLocker.lock();
        }
    }

    public final void selectEmoji(Long l, boolean z) {
        if (this.selectAnimatedEmojiDialog == null || this.replaceableIconDrawable == null) {
            return;
        }
        long jLongValue = l == null ? 0L : l.longValue();
        setSelected(Long.valueOf(jLongValue));
        if (this.selectedEmojiDocumentId == jLongValue) {
            return;
        }
        if (!z && jLongValue != 0 && !getUserConfig().isPremium()) {
            int i = this.currentAccount;
            l.getClass();
            HashMap map = AnimatedEmojiDrawable.getDocumentFetcher(i).emojiDocumentsCache;
            TLRPC.Document document = map != null ? (TLRPC.Document) map.get(l) : null;
            if (document != null) {
                BulletinFactory.of(this).createEmojiBulletin(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new TopicsFragment$2$$ExternalSyntheticLambda2(this, 1)).show();
                return;
            }
            return;
        }
        this.selectedEmojiDocumentId = jLongValue;
        BackupImageView[] backupImageViewArr = this.backupImageView;
        if (jLongValue != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(10, this.currentAccount, jLongValue);
            animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
            backupImageViewArr[1].setAnimatedEmojiDrawable(animatedEmojiDrawable);
            backupImageViewArr[1].setImageDrawable(null);
        } else {
            LetterDrawable letterDrawable = new LetterDrawable(1, null);
            letterDrawable.setTitle(this.firstSymbol);
            this.replaceableIconDrawable.setIcon((Drawable) letterDrawable, false);
            backupImageViewArr[1].setImageDrawable(this.defaultIconDrawable);
            backupImageViewArr[1].setAnimatedEmojiDrawable(null);
        }
        BackupImageView backupImageView = backupImageViewArr[0];
        BackupImageView backupImageView2 = backupImageViewArr[1];
        backupImageViewArr[0] = backupImageView2;
        backupImageViewArr[1] = backupImageView;
        AndroidUtilities.updateViewVisibilityAnimated(backupImageView2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(backupImageViewArr[1], false, 0.5f, true);
    }
}
