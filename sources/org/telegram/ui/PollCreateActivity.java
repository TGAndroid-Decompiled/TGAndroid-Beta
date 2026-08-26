package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public final class PollCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public int addAnswerRow;
    public boolean allowAdding;
    public int allowAddingRow;
    public boolean allowMarking;
    public int allowMarkingRow;
    public boolean anonymousPoll;
    public int anonymousRow;
    public int answerHeaderRow;
    public int[] answerIds;
    public int answerSectionRow;
    public int answerStartRow;
    public final CharSequence[] answers;
    public final boolean[] answersChecks;
    public int answersCount;
    public PollEditTextCell currentCell;
    public PollCreateActivityDelegate delegate;
    public boolean destroyed;
    public ActionBarMenuItem doneItem;
    public TLRPC.MessageMedia editing;
    public int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean firstRequestField;
    public boolean hintShowed;
    public HintView hintView;
    public boolean isEmojiSearchOpened;
    public final boolean isPremium;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public KeyboardNotifier keyboardNotifier;
    public boolean keyboardVisible;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public LinearLayoutManager layoutManager;
    public ListAdapter listAdapter;
    public MessageSeenView.AnonymousClass1 listView;
    public int maxAnswerId;
    public final int maxAnswersCount;
    public boolean multipleChoise;
    public int multipleRow;
    public int oldAnswersCount;
    public boolean onlyAdding;
    public final LaunchActivity.AnonymousClass18 openKeyboardRunnable;
    public final ChatActivity parentFragment;
    public int questionHeaderRow;
    public int questionRow;
    public int questionSectionRow;
    public CharSequence questionString;
    public final int quizOnly;
    public boolean quizPoll;
    public int quizRow;
    public int requestFieldFocusAtPosition;
    public int rowCount;
    public int settingsHeaderRow;
    public int settingsSectionRow;
    public int shiftDp;
    public ChatEditActivity.AnonymousClass3 sizeNotifierFrameLayout;
    public int solutionInfoRow;
    public int solutionRow;
    public Editable solutionString;
    public SuggestEmojiView suggestEmojiPanel;
    public final boolean todo;
    public boolean waitingForKeyboardOpen;
    public boolean wasEmojiSearchOpened;

    public final class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass2() {
        }

        @Override
        public final void onItemClick(int i) {
            int iMax;
            int i2 = 0;
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            if (i == -1) {
                if (pollCreateActivity.checkDiscard$5(true)) {
                    pollCreateActivity.finishFragment();
                    return;
                }
                return;
            }
            if (i == 1) {
                CharSequence[] charSequenceArr = pollCreateActivity.answers;
                ChatActivity chatActivity = pollCreateActivity.parentFragment;
                if (pollCreateActivity.todo) {
                    CharSequence[] charSequenceArr2 = {ChatAttachAlertPollLayout.getFixedString(pollCreateActivity.questionString)};
                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(((BaseFragment) pollCreateActivity).currentAccount).getEntities(charSequenceArr2, true);
                    CharSequence charSequence = charSequenceArr2[0];
                    int size = entities.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.MessageEntity messageEntity = entities.get(i3);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                    TLRPC.TodoList todoList = new TLRPC.TodoList();
                    tL_messageMediaToDo.todo = todoList;
                    todoList.others_can_append = pollCreateActivity.allowAdding;
                    todoList.others_can_complete = pollCreateActivity.allowMarking;
                    todoList.title = new TLRPC.TL_textWithEntities();
                    tL_messageMediaToDo.todo.title.text = charSequence.toString();
                    tL_messageMediaToDo.todo.title.entities = entities;
                    if (pollCreateActivity.answerIds != null) {
                        int i4 = 0;
                        iMax = 0;
                        while (true) {
                            int[] iArr = pollCreateActivity.answerIds;
                            if (i4 >= iArr.length) {
                                break;
                            }
                            iMax = Math.max(iMax, iArr[i4]);
                            i4++;
                        }
                    } else {
                        iMax = 0;
                    }
                    for (int i5 = 0; i5 < charSequenceArr.length; i5++) {
                        if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i5]))) {
                            CharSequence[] charSequenceArr3 = {ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i5])};
                            ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(((BaseFragment) pollCreateActivity).currentAccount).getEntities(charSequenceArr3, true);
                            CharSequence charSequence2 = charSequenceArr3[0];
                            int size2 = entities2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i6);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                            TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            todoItem.title = tL_textWithEntities;
                            tL_textWithEntities.text = charSequence2.toString();
                            todoItem.title.entities = entities2;
                            int[] iArr2 = pollCreateActivity.answerIds;
                            if (iArr2 == null || i5 >= iArr2.length) {
                                iMax++;
                                todoItem.id = iMax;
                            } else {
                                todoItem.id = iArr2[i5];
                            }
                            tL_messageMediaToDo.todo.list.add(todoItem);
                        }
                    }
                    if (chatActivity.isInScheduleMode()) {
                        AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(9, this, tL_messageMediaToDo));
                        return;
                    } else {
                        pollCreateActivity.delegate.sendPoll(tL_messageMediaToDo);
                        pollCreateActivity.finishFragment();
                        return;
                    }
                }
                boolean z = pollCreateActivity.quizPoll;
                boolean[] zArr = pollCreateActivity.answersChecks;
                if (z && pollCreateActivity.doneItem.getAlpha() != 1.0f) {
                    int i7 = 0;
                    while (i2 < zArr.length) {
                        if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i2])) && zArr[i2]) {
                            i7++;
                        }
                        i2++;
                    }
                    if (i7 <= 0) {
                        pollCreateActivity.listView.getChildCount();
                        for (int i8 = pollCreateActivity.answerStartRow; i8 < pollCreateActivity.answerStartRow + pollCreateActivity.answersCount; i8++) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = pollCreateActivity.listView.findViewHolderForAdapterPosition(i8);
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                if (view instanceof PollEditTextCell) {
                                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                                    if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                                        pollCreateActivity.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr4 = {ChatAttachAlertPollLayout.getFixedString(pollCreateActivity.questionString)};
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(((BaseFragment) pollCreateActivity).currentAccount).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                int size3 = entities3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i9);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = pollCreateActivity.multipleChoise;
                tL_poll.quiz = pollCreateActivity.quizPoll;
                tL_poll.public_voters = !pollCreateActivity.anonymousPoll;
                tL_poll.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList = new ArrayList(pollCreateActivity.maxAnswersCount);
                int i10 = 0;
                while (i10 < charSequenceArr.length) {
                    if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i10]))) {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i2] = ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i10]);
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(((BaseFragment) pollCreateActivity).currentAccount).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i2];
                        int size4 = entities4.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i11);
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((pollCreateActivity.multipleChoise || pollCreateActivity.quizPoll) && zArr[i10]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i10++;
                    i2 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence fixedString = ChatAttachAlertPollLayout.getFixedString(pollCreateActivity.solutionString);
                if (fixedString != null) {
                    tL_messageMediaPoll.results.solution = fixedString.toString();
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(((BaseFragment) pollCreateActivity).currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                if (chatActivity.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(this, tL_messageMediaPoll, arrayList));
                } else {
                    pollCreateActivity.delegate.sendPoll(tL_messageMediaPoll);
                    pollCreateActivity.finishFragment();
                }
            }
        }
    }

    public final class AnonymousClass6 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PollCreateActivity this$0;

        public AnonymousClass6(PollCreateActivity pollCreateActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = pollCreateActivity;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                case 1:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                default:
                    PollCreateActivity pollCreateActivity = this.this$0;
                    pollCreateActivity.getClass();
                    pollCreateActivity.emojiView.setTranslationY(0.0f);
                    pollCreateActivity.hideEmojiView();
                    break;
            }
        }
    }

    public final class AnonymousClass9 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass9() {
        }

        @Override
        public final boolean canAddCaptionToGif() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final float getProgressToSearchOpened() {
            return 0.0f;
        }

        @Override
        public final int getThreadId() {
            return 0;
        }

        @Override
        public final void invalidateEnterView() {
        }

        @Override
        public final boolean isExpanded() {
            return false;
        }

        @Override
        public final boolean isInScheduleMode() {
            return false;
        }

        @Override
        public final boolean isSearchOpened() {
            return PollCreateActivity.this.isEmojiSearchOpened;
        }

        @Override
        public final boolean isUserSelf() {
            return false;
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
        }

        @Override
        public final boolean onBackspace() {
            EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
            if (editField == null) {
                return false;
            }
            editField.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(pollCreateActivity.getParentActivity(), 0, ((BaseFragment) pollCreateActivity).resourceProvider);
            String string = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiText);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new PhotoViewer$$ExternalSyntheticLambda115(this, 21));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            EditTextBoldCursor editField = pollCreateActivity.currentCell.getEditField();
            if (editField == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, editField.getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, editField.getPaint().getFontMetricsInt());
                }
                animatedEmojiSpan.cacheType = pollCreateActivity.emojiView.emojiCacheType;
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editField.setText(editField.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onEmojiSelected(String str) {
            EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
            if (editField == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
                editField.setText(editField.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
        }

        @Override
        public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
        }

        @Override
        public final void onSearchOpenClose(int i) {
            boolean z = i != 0;
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            pollCreateActivity.isEmojiSearchOpened = z;
            pollCreateActivity.sizeNotifierFrameLayout.requestLayout();
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickersGroupClick(long j) {
        }

        @Override
        public final void onStickersSettingsClick() {
        }

        @Override
        public final void onTabOpened(int i) {
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PollCreateActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            if (i == pollCreateActivity.questionHeaderRow || i == pollCreateActivity.answerHeaderRow || i == pollCreateActivity.settingsHeaderRow) {
                return 0;
            }
            if (i == pollCreateActivity.questionSectionRow) {
                return 1;
            }
            if (i == pollCreateActivity.answerSectionRow || i == pollCreateActivity.settingsSectionRow || i == pollCreateActivity.solutionInfoRow) {
                return 2;
            }
            if (i == pollCreateActivity.addAnswerRow) {
                return 3;
            }
            if (i == pollCreateActivity.questionRow) {
                return 4;
            }
            if (i == pollCreateActivity.solutionRow) {
                return 7;
            }
            return (i == pollCreateActivity.anonymousRow || i == pollCreateActivity.multipleRow || i == pollCreateActivity.quizRow || i == pollCreateActivity.allowAddingRow || i == pollCreateActivity.allowMarkingRow) ? 6 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i;
            int adapterPosition = viewHolder.getAdapterPosition();
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            if (adapterPosition == pollCreateActivity.questionRow || adapterPosition == pollCreateActivity.allowAddingRow || adapterPosition == pollCreateActivity.allowMarkingRow) {
                return !pollCreateActivity.onlyAdding;
            }
            if (!pollCreateActivity.onlyAdding || adapterPosition < (i = pollCreateActivity.answerStartRow) || adapterPosition >= pollCreateActivity.answersCount + i) {
                if (adapterPosition != pollCreateActivity.addAnswerRow && adapterPosition != pollCreateActivity.anonymousRow && adapterPosition != pollCreateActivity.multipleRow && (pollCreateActivity.quizOnly != 0 || adapterPosition != pollCreateActivity.quizRow)) {
                    return false;
                }
            } else if (adapterPosition - i < pollCreateActivity.oldAnswersCount) {
                return false;
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3 = viewHolder.mItemViewType;
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            int i4 = pollCreateActivity.quizOnly;
            boolean z = pollCreateActivity.todo;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == pollCreateActivity.questionHeaderRow) {
                    if (z) {
                        i2 = pollCreateActivity.editing != null ? R.string.TodoEditTitle : R.string.TodoTitle;
                    } else {
                        i2 = R.string.PollQuestion2;
                    }
                    headerCell.setText(LocaleController.getString(i2));
                    return;
                }
                if (i != pollCreateActivity.answerHeaderRow) {
                    if (i == pollCreateActivity.settingsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.Settings));
                        return;
                    }
                    return;
                } else if (i4 == 1) {
                    headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(z ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                    return;
                }
            }
            if (i3 == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                textCheckCell.setEnabled(!pollCreateActivity.onlyAdding);
                textCheckCell.getCheckBox().setAlpha(!pollCreateActivity.onlyAdding ? 1.0f : 0.6f);
                if (i == pollCreateActivity.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), pollCreateActivity.allowAdding, true);
                    textCheckCell.setEnabled(null, true);
                    return;
                }
                if (i == pollCreateActivity.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), pollCreateActivity.allowMarking, false);
                    textCheckCell.setEnabled(null, true);
                    return;
                }
                if (i == pollCreateActivity.anonymousRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollAnonymous), pollCreateActivity.anonymousPoll, (pollCreateActivity.multipleRow == -1 && pollCreateActivity.quizRow == -1) ? false : true);
                    textCheckCell.setEnabled(null, true);
                    return;
                } else if (i == pollCreateActivity.multipleRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollMultiple), pollCreateActivity.multipleChoise, pollCreateActivity.quizRow != -1);
                    textCheckCell.setEnabled(null, true);
                    return;
                } else {
                    if (i == pollCreateActivity.quizRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollQuiz), pollCreateActivity.quizPoll, false);
                        textCheckCell.setEnabled(null, i4 == 0);
                        return;
                    }
                    return;
                }
            }
            Context context = this.mContext;
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                TextCell textCell = (TextCell) view;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(z ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
            textInfoPrivacyCell.setFixedSize(0);
            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i == pollCreateActivity.solutionInfoRow) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i == pollCreateActivity.settingsSectionRow) {
                textInfoPrivacyCell.setFixedSize(12);
                textInfoPrivacyCell.setText(null);
                return;
            }
            int i5 = pollCreateActivity.maxAnswersCount - pollCreateActivity.answersCount;
            if (i5 <= 0) {
                textInfoPrivacyCell.setText(LocaleController.getString(z ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
            } else if (z) {
                textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i5));
            } else {
                textInfoPrivacyCell.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i5, new Object[0])));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i != 0) {
                Context context = this.mContext;
                if (i == 1) {
                    shadowSectionCell = new ShadowSectionCell(context, (Object) null);
                } else if (i == 2) {
                    shadowSectionCell = new TextInfoPrivacyCell(context, 24, null);
                } else if (i != 3) {
                    PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                    boolean z = pollCreateActivity.isPremium;
                    if (i == 4) {
                        PollEditTextCell pollEditTextCell = new PollEditTextCell(context, z ? 1 : 0) {
                            @Override
                            public final void onEditTextFocusChanged(boolean z2) {
                                PollCreateActivity.access$6200(PollCreateActivity.this, this, z2);
                            }

                            @Override
                            public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell2) {
                                PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                pollCreateActivity2.currentCell = pollEditTextCell2;
                                if (!pollCreateActivity2.emojiViewVisible) {
                                    pollCreateActivity2.showEmojiPopup$2(1);
                                } else {
                                    pollCreateActivity2.collapseSearchEmojiView$1();
                                    pollCreateActivity2.openKeyboardInternal$2();
                                }
                            }

                            @Override
                            public final boolean onPastedMultipleLines(ArrayList arrayList) {
                                PollCreateActivity pollCreateActivity2;
                                if (arrayList.isEmpty()) {
                                    return false;
                                }
                                AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
                                anonymousClass4.getText().replace(anonymousClass4.getSelectionStart(), anonymousClass4.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                                int i2 = 0;
                                while (true) {
                                    boolean zIsEmpty = arrayList.isEmpty();
                                    pollCreateActivity2 = PollCreateActivity.this;
                                    if (zIsEmpty || i2 >= pollCreateActivity2.maxAnswersCount) {
                                        break;
                                    }
                                    for (int length = pollCreateActivity2.answers.length - 1; length > i2; length--) {
                                        CharSequence[] charSequenceArr = pollCreateActivity2.answers;
                                        charSequenceArr[length] = charSequenceArr[length - 1];
                                    }
                                    pollCreateActivity2.answers[i2] = (CharSequence) arrayList.remove(0);
                                    pollCreateActivity2.answersCount++;
                                    i2++;
                                }
                                pollCreateActivity2.updateRows$12$1();
                                pollCreateActivity2.requestFieldFocusAtPosition = (pollCreateActivity2.answerStartRow + i2) - 1;
                                pollCreateActivity2.listAdapter.mObservable.notifyChanged();
                                return true;
                            }

                            @Override
                            public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                            }
                        };
                        pollEditTextCell.createErrorTextView();
                        pollEditTextCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        pollEditTextCell.textView.addTextChangedListener(new LoginActivity.AnonymousClass7(11, this, pollEditTextCell));
                        shadowSectionCell = pollEditTextCell;
                    } else if (i == 6) {
                        TextCheckCell textCheckCell = new TextCheckCell(context);
                        textCheckCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        shadowSectionCell = textCheckCell;
                    } else if (i != 7) {
                        PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context, z ? 1 : 0, new OAuthSheet$$ExternalSyntheticLambda4(pollCreateActivity, 20)) {
                            @Override
                            public final boolean drawDivider() {
                                ListAdapter listAdapter = ListAdapter.this;
                                MessageSeenView.AnonymousClass1 anonymousClass1 = PollCreateActivity.this.listView;
                                View viewFindContainingItemView = anonymousClass1.findContainingItemView(this);
                                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                                if (childViewHolder != null) {
                                    int adapterPosition = childViewHolder.getAdapterPosition();
                                    PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                    int i2 = pollCreateActivity2.answersCount;
                                    if (i2 == pollCreateActivity2.maxAnswersCount && adapterPosition == (pollCreateActivity2.answerStartRow + i2) - 1) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            @Override
                            public final boolean isChecked(PollEditTextCell pollEditTextCell3) {
                                int adapterPosition;
                                PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                MessageSeenView.AnonymousClass1 anonymousClass1 = pollCreateActivity2.listView;
                                View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell3);
                                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                                if (childViewHolder == null || (adapterPosition = childViewHolder.getAdapterPosition()) == -1) {
                                    return false;
                                }
                                return pollCreateActivity2.answersChecks[adapterPosition - pollCreateActivity2.answerStartRow];
                            }

                            @Override
                            public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                                if (anonymousClass4.isFocused() && anonymousClass4.hasSelection()) {
                                    Menu menu = actionMode.getMenu();
                                    if (menu.findItem(16908321) == null) {
                                        return;
                                    }
                                    ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.currentEncryptedChat, false, true, true, true);
                                }
                            }

                            @Override
                            public final void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z2) {
                                int adapterPosition;
                                ListAdapter listAdapter = ListAdapter.this;
                                if (z2) {
                                    PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                    if (pollCreateActivity2.quizPoll) {
                                        Arrays.fill(pollCreateActivity2.answersChecks, false);
                                        PollCreateActivity.this.listView.getChildCount();
                                        int i2 = PollCreateActivity.this.answerStartRow;
                                        while (true) {
                                            PollCreateActivity pollCreateActivity3 = PollCreateActivity.this;
                                            if (i2 >= pollCreateActivity3.answerStartRow + pollCreateActivity3.answersCount) {
                                                break;
                                            }
                                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = pollCreateActivity3.listView.findViewHolderForAdapterPosition(i2);
                                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                                if (view instanceof PollEditTextCell) {
                                                    ((PollEditTextCell) view).checkBox.checkBoxBase.setChecked(-1, false, true);
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                super.onCheckBoxClick(pollEditTextCell3, z2);
                                MessageSeenView.AnonymousClass1 anonymousClass1 = PollCreateActivity.this.listView;
                                View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell3);
                                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                                if (childViewHolder != null && (adapterPosition = childViewHolder.getAdapterPosition()) != -1) {
                                    PollCreateActivity pollCreateActivity4 = PollCreateActivity.this;
                                    pollCreateActivity4.answersChecks[adapterPosition - pollCreateActivity4.answerStartRow] = z2;
                                }
                                PollCreateActivity.this.checkDoneButton$2();
                            }

                            @Override
                            public final void onEditTextFocusChanged(boolean z2) {
                                PollCreateActivity.access$6200(PollCreateActivity.this, this, z2);
                            }

                            @Override
                            public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell3) {
                                PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                pollCreateActivity2.currentCell = pollEditTextCell3;
                                if (!pollCreateActivity2.emojiViewVisible) {
                                    pollCreateActivity2.showEmojiPopup$2(1);
                                } else {
                                    pollCreateActivity2.collapseSearchEmojiView$1();
                                    pollCreateActivity2.openKeyboardInternal$2();
                                }
                            }

                            @Override
                            public final boolean onPastedMultipleLines(ArrayList arrayList) {
                                if (!arrayList.isEmpty()) {
                                    PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                    pollCreateActivity2.listView.getClass();
                                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(this) - pollCreateActivity2.answerStartRow;
                                    if (childAdapterPosition >= 0) {
                                        AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
                                        anonymousClass4.getText().replace(anonymousClass4.getSelectionStart(), anonymousClass4.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                                        int i2 = childAdapterPosition + 1;
                                        while (!arrayList.isEmpty() && i2 < pollCreateActivity2.maxAnswersCount) {
                                            for (int length = pollCreateActivity2.answers.length - 1; length > i2; length--) {
                                                CharSequence[] charSequenceArr = pollCreateActivity2.answers;
                                                charSequenceArr[length] = charSequenceArr[length - 1];
                                            }
                                            pollCreateActivity2.answers[i2] = (CharSequence) arrayList.remove(0);
                                            pollCreateActivity2.answersCount++;
                                            i2++;
                                        }
                                        pollCreateActivity2.updateRows$12$1();
                                        pollCreateActivity2.requestFieldFocusAtPosition = (pollCreateActivity2.answerStartRow + i2) - 1;
                                        pollCreateActivity2.listAdapter.mObservable.notifyChanged();
                                        return true;
                                    }
                                }
                                return false;
                            }

                            @Override
                            public final boolean shouldShowCheckBox() {
                                return PollCreateActivity.this.quizPoll;
                            }
                        };
                        pollEditTextCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        pollEditTextCell2.textView.addTextChangedListener(new LoginActivity.AnonymousClass7(13, this, pollEditTextCell2));
                        pollEditTextCell2.setShowNextButton(true);
                        EditTextBoldCursor textView = pollEditTextCell2.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new ChannelMonetizationLayout$$ExternalSyntheticLambda7(3, this, pollEditTextCell2));
                        textView.setOnKeyListener(new ChatActivity$$ExternalSyntheticLambda379(pollEditTextCell2, 4));
                        shadowSectionCell = pollEditTextCell2;
                    } else {
                        PollEditTextCell pollEditTextCell3 = new PollEditTextCell(context, z ? 1 : 0) {
                            @Override
                            public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                                if (anonymousClass4.isFocused() && anonymousClass4.hasSelection()) {
                                    Menu menu = actionMode.getMenu();
                                    if (menu.findItem(16908321) == null) {
                                        return;
                                    }
                                    ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.currentEncryptedChat, false, true, true, true);
                                }
                            }

                            @Override
                            public final void onEditTextFocusChanged(boolean z2) {
                                PollCreateActivity.access$6200(PollCreateActivity.this, this, z2);
                            }

                            @Override
                            public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell4) {
                                PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                                pollCreateActivity2.currentCell = pollEditTextCell4;
                                if (!pollCreateActivity2.emojiViewVisible) {
                                    pollCreateActivity2.showEmojiPopup$2(1);
                                } else {
                                    pollCreateActivity2.collapseSearchEmojiView$1();
                                    pollCreateActivity2.openKeyboardInternal$2();
                                }
                            }
                        };
                        pollEditTextCell3.createErrorTextView();
                        pollEditTextCell3.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        pollEditTextCell3.textView.addTextChangedListener(new LoginActivity.AnonymousClass7(12, this, pollEditTextCell3));
                        shadowSectionCell = pollEditTextCell3;
                    }
                } else {
                    TextCell textCell = new TextCell(context);
                    textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell;
                }
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false);
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = headerCell;
            }
            return zzkl.m(shadowSectionCell, shadowSectionCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            boolean z = pollCreateActivity.todo;
            View view = viewHolder.itemView;
            if (i == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                pollEditTextCell.setTag(1);
                CharSequence charSequence = pollCreateActivity.questionString;
                pollEditTextCell.setTextAndHint(charSequence != null ? charSequence : "", LocaleController.getString(z ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                pollEditTextCell.setEnabled(!pollCreateActivity.onlyAdding);
                boolean z2 = true ^ pollCreateActivity.onlyAdding;
                AuctionBidSheet.AnonymousClass4 anonymousClass4 = pollEditTextCell.textView;
                anonymousClass4.setEnabled(z2);
                anonymousClass4.setTextColor(Theme.multAlpha(pollCreateActivity.onlyAdding ? 0.6f : 1.0f, pollCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText)));
                PollCreateActivity.access$5500(pollCreateActivity, view, viewHolder.getAdapterPosition());
                return;
            }
            if (i != 5) {
                if (i == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) view;
                    pollEditTextCell2.setTag(1);
                    Editable editable = pollCreateActivity.solutionString;
                    pollEditTextCell2.setTextAndHint(editable != null ? editable : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell2.setTag(null);
                    PollCreateActivity.access$5500(pollCreateActivity, view, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell3 = (PollEditTextCell) view;
            pollEditTextCell3.setTag(1);
            int i2 = adapterPosition - pollCreateActivity.answerStartRow;
            boolean z3 = !pollCreateActivity.onlyAdding || i2 >= pollCreateActivity.oldAnswersCount;
            AuctionBidSheet.AnonymousClass4 anonymousClass5 = pollEditTextCell3.textView;
            anonymousClass5.setEnabled(z3);
            anonymousClass5.setTextColor(Theme.multAlpha(z3 ? 1.0f : 0.6f, pollCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText)));
            pollEditTextCell3.setTextAndHint(pollCreateActivity.answers[i2], LocaleController.getString(z ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell3.setTag(null);
            ImageView imageView = pollEditTextCell3.deleteImageView;
            if (imageView != null) {
                imageView.setVisibility(z3 ? 0 : 8);
            }
            ImageView imageView2 = pollEditTextCell3.moveImageView;
            if (imageView2 != null) {
                imageView2.setAlpha(z3 ? 1.0f : 0.45f);
            }
            if (!pollCreateActivity.firstRequestField && pollCreateActivity.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                pollCreateActivity.firstRequestField = false;
                pollCreateActivity.requestFieldFocusAtPosition = -1;
            }
            PollCreateActivity.access$5500(pollCreateActivity, view, adapterPosition);
        }

        @Override
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i == 4 || i == 5) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
                    PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                    if (pollCreateActivity.isPremium) {
                        SuggestEmojiView suggestEmojiView = pollCreateActivity.suggestEmojiPanel;
                        if (suggestEmojiView != null) {
                            suggestEmojiView.forceClose();
                        }
                        pollCreateActivity.hideEmojiPopup$2(true);
                    }
                    pollCreateActivity.currentCell = null;
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
            }
        }
    }

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia);
    }

    public PollCreateActivity(ChatActivity chatActivity) {
        super(null);
        this.answersCount = 1;
        this.anonymousPoll = true;
        this.allowAdding = false;
        this.allowMarking = true;
        this.shiftDp = AndroidUtilities.dp(3.0f);
        this.requestFieldFocusAtPosition = -1;
        this.openKeyboardRunnable = new LaunchActivity.AnonymousClass18(this, 17);
        this.todo = true;
        int i = getMessagesController().todoItemsMax;
        this.maxAnswersCount = i;
        this.answers = new CharSequence[i];
        this.answersChecks = new boolean[i];
        this.parentFragment = chatActivity;
        this.isPremium = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.quizPoll = false;
        this.quizOnly = 2;
    }

    public static void access$5500(PollCreateActivity pollCreateActivity, View view, int i) {
        int length;
        int i2;
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            int i3 = pollCreateActivity.questionRow;
            boolean z = pollCreateActivity.todo;
            if (i == i3) {
                i2 = z ? pollCreateActivity.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = pollCreateActivity.questionString;
                length = i2 - (charSequence != null ? charSequence.length() : 0);
            } else if (i == pollCreateActivity.solutionRow) {
                Editable editable = pollCreateActivity.solutionString;
                i2 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i4 = pollCreateActivity.answerStartRow;
                if (i < i4 || i >= pollCreateActivity.answersCount + i4) {
                    return;
                }
                int i5 = i - i4;
                int i6 = z ? pollCreateActivity.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = pollCreateActivity.answers[i5];
                length = i6 - (charSequence2 != null ? charSequence2.length() : 0);
                i2 = i6;
            }
            float f = i2;
            if (length > f - (0.7f * f)) {
                pollEditTextCell.setText2("");
                return;
            }
            pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length)));
            SimpleTextView textView2 = pollEditTextCell.getTextView2();
            int i7 = length < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
            textView2.setTextColor(Theme.getColor(null, i7, false));
            textView2.setTag(Integer.valueOf(i7));
        }
    }

    public static void access$6200(PollCreateActivity pollCreateActivity, PollEditTextCell pollEditTextCell, boolean z) {
        if (pollCreateActivity.isPremium && z) {
            if (pollCreateActivity.currentCell == pollEditTextCell && pollCreateActivity.emojiViewVisible && pollCreateActivity.isEmojiSearchOpened) {
                pollCreateActivity.collapseSearchEmojiView$1();
                pollCreateActivity.emojiViewVisible = false;
            }
            PollEditTextCell pollEditTextCell2 = pollCreateActivity.currentCell;
            pollCreateActivity.currentCell = pollEditTextCell;
            pollEditTextCell.setEmojiButtonVisibility(true);
            ChatActivityEnterViewAnimatedIconView emojiButton = pollEditTextCell.getEmojiButton();
            ChatActivityEnterViewAnimatedIconView.State state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
            emojiButton.setState(state, false);
            MessageSeenView.AnonymousClass1 anonymousClass1 = pollCreateActivity.listView;
            View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell);
            RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
            SuggestEmojiView suggestEmojiView = pollCreateActivity.suggestEmojiPanel;
            if (suggestEmojiView != null) {
                suggestEmojiView.forceClose();
                SuggestEmojiView suggestEmojiView2 = pollCreateActivity.suggestEmojiPanel;
                if (suggestEmojiView2 != null && childViewHolder != null) {
                    View view = childViewHolder.itemView;
                    if ((view instanceof PollEditTextCell) && suggestEmojiView2.getDelegate() != view) {
                        pollCreateActivity.suggestEmojiPanel.setDelegate((PollEditTextCell) view);
                    }
                }
            }
            if (pollEditTextCell2 == null || pollEditTextCell2 == pollEditTextCell) {
                return;
            }
            if (pollCreateActivity.emojiViewVisible) {
                pollCreateActivity.collapseSearchEmojiView$1();
                pollCreateActivity.hideEmojiPopup$2(false);
                pollCreateActivity.openKeyboardInternal$2();
            }
            pollEditTextCell2.setEmojiButtonVisibility(false);
            pollEditTextCell2.getEmojiButton().setState(state, false);
        }
    }

    public final void addNewField$1() {
        int i;
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.setDelegate(null);
            this.suggestEmojiPanel.forceClose();
        }
        int i2 = this.answersCount;
        this.answersChecks[i2] = false;
        int i3 = i2 + 1;
        this.answersCount = i3;
        if (this.answerIds != null) {
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr2 = this.answerIds;
                if (i4 < iArr2.length) {
                    i = iArr2[i4];
                } else {
                    i = this.maxAnswerId + 1;
                    this.maxAnswerId = i;
                }
                iArr[i4] = i;
            }
            this.answerIds = iArr;
        }
        if (this.answersCount == this.answers.length) {
            ListAdapter listAdapter = this.listAdapter;
            listAdapter.mObservable.notifyItemRangeRemoved(this.addAnswerRow, 1);
        }
        ListAdapter listAdapter2 = this.listAdapter;
        listAdapter2.mObservable.notifyItemRangeInserted(this.addAnswerRow, 1);
        updateRows$12$1();
        this.firstRequestField = false;
        this.requestFieldFocusAtPosition = (this.answerStartRow + this.answersCount) - 1;
        this.listAdapter.notifyItemChanged(this.answerSectionRow);
    }

    public final void animateEmojiViewTranslationY$1(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda305(this, f, 3));
        valueAnimatorOfFloat.addListener(new AnonymousClass6(this, 0));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        valueAnimatorOfFloat.start();
    }

    public final boolean checkDiscard$5(boolean z) {
        boolean zIsEmpty;
        TLRPC.MessageMedia messageMedia = this.editing;
        boolean z2 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.answers;
        if (z2) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i = 0;
            for (int i2 = 0; i2 < Math.min(this.answersCount, charSequenceArr.length); i2++) {
                if (!TextUtils.isEmpty(charSequenceArr[i2])) {
                    i++;
                }
            }
            zIsEmpty = (this.onlyAdding || TextUtils.equals(todoList.title.text, ChatAttachAlertPollLayout.getFixedString(this.questionString))) && i == todoList.list.size();
            if (zIsEmpty) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (!TextUtils.equals(charSequenceArr[i3].toString(), todoList.list.get(i3).title.text)) {
                        zIsEmpty = false;
                        break;
                    }
                }
            }
        } else {
            zIsEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.questionString));
            if (zIsEmpty) {
                for (int i4 = 0; i4 < this.answersCount && (zIsEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i4]))); i4++) {
                }
            }
        }
        if (z && !zIsEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            boolean z3 = this.todo;
            String string = LocaleController.getString(z3 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(z3 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new PhotoViewer$$ExternalSyntheticLambda115(this, 20));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog);
        }
        return zIsEmpty;
    }

    public final void checkDoneButton$2() {
        int i;
        boolean z;
        boolean z2 = this.quizPoll;
        CharSequence[] charSequenceArr = this.answers;
        if (z2) {
            int i2 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.answersChecks;
                if (i2 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i2])) && zArr[i2]) {
                    i++;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        boolean z3 = this.todo;
        int i3 = z3 ? getMessagesController().todoTitleLengthMax : 255;
        int i4 = z3 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.solutionString)) || this.solutionString.length() <= 200) && !TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.questionString)) && this.questionString.length() <= i3) {
            int i5 = 0;
            for (int i6 = 0; i6 < charSequenceArr.length; i6++) {
                if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(charSequenceArr[i6]))) {
                    if (charSequenceArr[i6].length() > i4) {
                        i5 = 0;
                        break;
                    }
                    i5++;
                }
            }
            if (i5 < (z3 ? 1 : 2) || (this.quizPoll && i < 1)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        this.doneItem.setEnabled((this.quizPoll && i == 0) || z);
        this.doneItem.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void collapseSearchEmojiView$1() {
        if (this.isEmojiSearchOpened) {
            this.emojiView.closeSearch(-1L, false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.emojiView.setLayoutParams(layoutParams);
            this.emojiPadding = layoutParams.height;
            this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
            this.isEmojiSearchOpened = false;
            animateEmojiViewTranslationY$1(-AndroidUtilities.dp(120.0f));
        }
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(getThemedColor(i), false);
        this.actionBar.setItemsColor(getThemedColor(i), true);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.todo;
        if (z) {
            this.actionBar.setTitle(LocaleController.getString(this.onlyAdding ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.quizOnly == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2());
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (z) {
            upperCase = LocaleController.getString(this.onlyAdding ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.doneItem = actionBarMenuCreateMenu.addItem(1, upperCase);
        this.listAdapter = new ListAdapter(context);
        ChatEditActivity.AnonymousClass3 anonymousClass3 = new ChatEditActivity.AnonymousClass3(3, context, this);
        this.sizeNotifierFrameLayout = anonymousClass3;
        anonymousClass3.setDelegate(this);
        ChatEditActivity.AnonymousClass3 anonymousClass4 = this.sizeNotifierFrameLayout;
        this.fragmentView = anonymousClass4;
        anonymousClass4.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.listView = new MessageSeenView.AnonymousClass1(context, 10, null);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        this.listView.setLayoutManager(linearLayoutManager);
        new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, 5)).attachToRecyclerView(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 24));
        this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 3));
        HintView hintView = new HintView(4, context, null, false);
        this.hintView = hintView;
        hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        frameLayout.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            SuggestEmojiView suggestEmojiView = new SuggestEmojiView(context, this.currentAccount, null, this.resourceProvider);
            this.suggestEmojiPanel = suggestEmojiView;
            suggestEmojiView.isCopyForbidden = true;
            suggestEmojiView.isSetAsStatusForbidden = true;
            suggestEmojiView.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.suggestEmojiPanel, LayoutHelper.createFrame(-2, 160, 51));
        }
        this.keyboardNotifier = new KeyboardNotifier(this.sizeNotifierFrameLayout, false, null);
        checkDoneButton$2();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.emojiGridView.invalidateViews();
            }
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                int currentTextColor = pollEditTextCell.getEditField().getCurrentTextColor();
                this.currentCell.getEditField().setTextColor(-1);
                this.currentCell.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextCell.class, PollEditTextCell.class, TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i2 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteHintText));
        int i4 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"moveImageView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{PollEditTextCell.class}, new String[]{"textView2"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        int i5 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        int i6 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i5));
        return arrayList;
    }

    public final void hideEmojiPopup$2(boolean z) {
        int i = 2;
        int i2 = 1;
        if (this.isPremium) {
            if (this.emojiViewVisible) {
                EmojiView emojiView = this.emojiView;
                emojiView.emojiGridView.stopScroll();
                emojiView.emojiTabs.scrollTo(0, 0);
                emojiView.resetTabsY(1);
                EmojiView.AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
                anonymousClass6.scrollToPositionWithOffset(0, 0, anonymousClass6.mShouldReverseLayout);
                this.emojiView.closeSearch(-1L, false);
                if (z) {
                    this.emojiView.hideSearchKeyboard();
                }
                this.isEmojiSearchOpened = false;
                showEmojiPopup$2(0);
            }
            if (z) {
                EmojiView emojiView2 = this.emojiView;
                if (emojiView2 == null || emojiView2.getVisibility() != 0) {
                    hideEmojiView();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new PollCreateActivity$$ExternalSyntheticLambda0(this, i2));
                valueAnimatorOfFloat.addListener(new AnonymousClass6(this, i));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void hideEmojiView() {
        EmojiView emojiView;
        ChatActivityEnterViewAnimatedIconView emojiButton;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null && (emojiButton = pollEditTextCell.getEmojiButton()) != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
            }
            this.emojiView.setVisibility(8);
        }
        int i = this.emojiPadding;
        this.emojiPadding = 0;
        if (i != 0) {
            this.keyboardNotifier.fire();
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return this.requestFieldFocusAtPosition < 0;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().isClosed) {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(null, Theme.key_actionBarActionModeDefault, false);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.emojiViewVisible) {
            return checkDiscard$5(z);
        }
        if (!z) {
            return false;
        }
        hideEmojiPopup$2(true);
        return false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View childAt;
        super.onBecomeFullyVisible();
        if (!this.firstRequestField || this.requestFieldFocusAtPosition < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = this.listView.getChildAt(i);
            this.listView.getClass();
            if (RecyclerView.getChildAdapterPosition(childAt) == this.requestFieldFocusAtPosition) {
                break;
            } else {
                i++;
            }
        }
        if (childAt instanceof PollEditTextCell) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(9, ((PollEditTextCell) childAt).getTextView()), 300L);
            this.requestFieldFocusAtPosition = -1;
        }
        this.firstRequestField = false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows$12$1();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.destroyed = true;
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                this.sizeNotifierFrameLayout.removeView(emojiView);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.isPremium) {
            hideEmojiPopup$2(false);
            SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
            if (suggestEmojiView != null) {
                suggestEmojiView.forceClose();
            }
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                pollEditTextCell.setEmojiButtonVisibility(false);
                this.currentCell.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.currentCell.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (this.isPremium) {
            if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z) {
                    this.keyboardHeightLand = i;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
                } else {
                    this.keyboardHeight = i;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
                }
            }
            if (this.emojiViewVisible) {
                int iDp = z ? this.keyboardHeightLand : this.keyboardHeight;
                if (this.isEmojiSearchOpened) {
                    iDp += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
                int i2 = layoutParams.width;
                int i3 = AndroidUtilities.displaySize.x;
                if (i2 != i3 || layoutParams.height != iDp || this.wasEmojiSearchOpened != this.isEmojiSearchOpened) {
                    layoutParams.width = i3;
                    layoutParams.height = iDp;
                    this.emojiView.setLayoutParams(layoutParams);
                    this.emojiPadding = layoutParams.height;
                    this.keyboardNotifier.fire();
                    this.sizeNotifierFrameLayout.requestLayout();
                    boolean z3 = this.wasEmojiSearchOpened;
                    if (z3 != this.isEmojiSearchOpened) {
                        animateEmojiViewTranslationY$1(z3 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
                }
            }
            if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
                return;
            }
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            boolean z4 = this.keyboardVisible;
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                this.keyboardVisible = pollEditTextCell.getEditField().isFocused() && this.keyboardNotifier.keyboardVisible() && i > 0;
            } else {
                this.keyboardVisible = false;
            }
            if (this.keyboardVisible && this.emojiViewVisible) {
                showEmojiPopup$2(0);
            }
            if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z4 && !this.emojiViewVisible) {
                this.emojiPadding = 0;
                this.keyboardNotifier.fire();
                this.sizeNotifierFrameLayout.requestLayout();
            }
            if (this.keyboardVisible && this.waitingForKeyboardOpen) {
                this.waitingForKeyboardOpen = false;
                AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            }
        }
    }

    public final void openKeyboardInternal$2() {
        this.keyboardNotifier.awaitingKeyboard = true;
        EditTextBoldCursor editField = this.currentCell.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        showEmojiPopup$2(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.openKeyboardRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
        AndroidUtilities.runOnUIThread(anonymousClass18, 100L);
    }

    public final void setDelegate(ChatActivity$$ExternalSyntheticLambda358 chatActivity$$ExternalSyntheticLambda358) {
        this.delegate = chatActivity$$ExternalSyntheticLambda358;
    }

    public final void setEditing(TLRPC.MessageMedia messageMedia, boolean z) {
        setEditing(messageMedia, z, -1);
    }

    public final void showEmojiPopup$2(int i) {
        PollEditTextCell pollEditTextCell;
        int i2 = 0;
        int i3 = 1;
        if (this.isPremium) {
            if (i != 1) {
                ChatActivityEnterViewAnimatedIconView emojiButton = this.currentCell.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
                }
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    this.emojiViewVisible = false;
                    this.isEmojiSearchOpened = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        emojiView.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.emojiPadding = 0;
                }
                this.keyboardNotifier.fire();
                this.sizeNotifierFrameLayout.requestLayout();
                return;
            }
            EmojiView emojiView2 = this.emojiView;
            boolean z = emojiView2 != null && emojiView2.getVisibility() == 0;
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null && emojiView3.currentAccount != UserConfig.selectedAccount) {
                this.sizeNotifierFrameLayout.removeView(emojiView3);
                this.emojiView = null;
            }
            if (this.emojiView == null) {
                EmojiView emojiView4 = new EmojiView(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.emojiView = emojiView4;
                emojiView4.fixBottomTabContainerTranslation = false;
                emojiView4.allowEmojisForNonPremium = false;
                emojiView4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.emojiView.setForseMultiwindowLayout(true);
                }
                this.emojiView.setDelegate(new AnonymousClass9());
                this.sizeNotifierFrameLayout.addView(this.emojiView);
            }
            this.emojiView.setVisibility(0);
            this.emojiViewVisible = true;
            EmojiView emojiView5 = this.emojiView;
            if (this.keyboardHeight <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeight = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.keyboardHeightLand <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i4 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView5.getLayoutParams();
            layoutParams.height = i4;
            emojiView5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (pollEditTextCell = this.currentCell) != null) {
                AndroidUtilities.hideKeyboard(pollEditTextCell.getEditField());
            }
            this.emojiPadding = i4;
            this.keyboardNotifier.fire();
            this.sizeNotifierFrameLayout.requestLayout();
            ChatActivityEnterViewAnimatedIconView emojiButton2 = this.currentCell.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (z || this.keyboardVisible) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new PollCreateActivity$$ExternalSyntheticLambda0(this, i2));
            valueAnimatorOfFloat.addListener(new AnonymousClass6(this, i3));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public final void updateRows$12$1() {
        this.questionHeaderRow = -1;
        this.questionRow = -1;
        this.questionSectionRow = -1;
        this.answerHeaderRow = -1;
        this.solutionRow = -1;
        this.solutionInfoRow = -1;
        this.answerStartRow = -1;
        this.addAnswerRow = -1;
        this.anonymousRow = -1;
        this.multipleRow = -1;
        this.allowAddingRow = -1;
        this.allowMarkingRow = -1;
        this.quizRow = -1;
        this.settingsSectionRow = -1;
        this.settingsHeaderRow = -1;
        this.rowCount = 0;
        boolean z = this.todo;
        if (!z || !this.onlyAdding) {
            this.questionHeaderRow = 0;
            this.questionRow = 1;
            this.questionSectionRow = 2;
            this.rowCount = 4;
            this.answerHeaderRow = 3;
        }
        int i = this.answersCount;
        if (i != 0) {
            int i2 = this.rowCount;
            this.answerStartRow = i2;
            this.rowCount = i2 + i;
        }
        if (i != this.answers.length) {
            int i3 = this.rowCount;
            this.rowCount = i3 + 1;
            this.addAnswerRow = i3;
        }
        int i4 = this.rowCount;
        int i5 = i4 + 1;
        this.rowCount = i5;
        this.answerSectionRow = i4;
        if (z && this.onlyAdding) {
            return;
        }
        int i6 = i4 + 2;
        this.rowCount = i6;
        this.settingsHeaderRow = i5;
        if (z) {
            int i7 = i4 + 3;
            this.rowCount = i7;
            this.allowMarkingRow = i6;
            if (this.allowMarking) {
                this.rowCount = i4 + 4;
                this.allowAddingRow = i7;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.parentFragment.currentChat;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i8 = this.rowCount;
            this.rowCount = i8 + 1;
            this.anonymousRow = i8;
        }
        int i9 = this.quizOnly;
        if (i9 != 1) {
            int i10 = this.rowCount;
            this.rowCount = i10 + 1;
            this.multipleRow = i10;
        }
        if (i9 == 0) {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.quizRow = i11;
        }
        int i12 = this.rowCount;
        int i13 = i12 + 1;
        this.rowCount = i13;
        this.settingsSectionRow = i12;
        if (this.quizPoll) {
            this.solutionRow = i13;
            this.rowCount = i12 + 3;
            this.solutionInfoRow = i12 + 2;
        }
    }

    public final void setEditing(TLRPC.MessageMedia messageMedia, boolean z, int i) {
        int i2;
        this.editing = messageMedia;
        this.onlyAdding = z;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.questionString = spannableStringBuilder;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.questionString = charSequenceReplaceEmoji;
            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.questionString = spannableReplaceAnimatedEmoji;
            MessageObject.addEntitiesToText(spannableReplaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.answersCount = size;
            this.oldAnswersCount = size;
            this.maxAnswerId = 0;
            this.answerIds = new int[size];
            int i3 = 0;
            while (true) {
                i2 = this.answersCount;
                if (i3 >= i2) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i3).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.answers;
                charSequenceArr[i3] = spannableStringBuilder2;
                charSequenceArr[i3] = Emoji.replaceEmoji(charSequenceArr[i3], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i3] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i3], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i3], tL_textWithEntities.entities, false, false, false, false);
                this.answerIds[i3] = tL_messageMediaToDo.todo.list.get(i3).id;
                this.maxAnswerId = Math.max(this.maxAnswerId, this.answerIds[i3]);
                i3++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.allowMarking = todoList.others_can_complete;
            this.allowAdding = todoList.others_can_append;
            if (this.onlyAdding) {
                this.answersCount = i2 + 1;
                updateRows$12$1();
                this.firstRequestField = true;
                int i4 = this.answerStartRow;
                if (i < 0) {
                    i = this.answersCount - 1;
                }
                this.requestFieldFocusAtPosition = i4 + i;
            }
        }
    }
}
