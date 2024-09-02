package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_poll;
import org.telegram.tgnet.TLRPC$TL_pollAnswer;
import org.telegram.tgnet.TLRPC$TL_pollResults;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.PollCreateActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class PollCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    private int addAnswerRow;
    private int anonymousRow;
    private int answerHeaderRow;
    private int answerSectionRow;
    private int answerStartRow;
    private PollEditTextCell currentCell;
    private PollCreateActivityDelegate delegate;
    private boolean destroyed;
    private ActionBarMenuItem doneItem;
    private int emojiPadding;
    private EmojiView emojiView;
    public boolean emojiViewVisible;
    private boolean hintShowed;
    private HintView hintView;
    private boolean isAnimatePopupClosing;
    boolean isEmojiSearchOpened;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private RecyclerView.LayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean multipleChoise;
    private int multipleRow;
    private ChatActivity parentFragment;
    private int questionHeaderRow;
    private int questionRow;
    private int questionSectionRow;
    private CharSequence questionString;
    private int quizOnly;
    private boolean quizPoll;
    private int quizRow;
    private int rowCount;
    private int settingsHeaderRow;
    private int settingsSectionRow;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private int solutionInfoRow;
    private int solutionRow;
    private CharSequence solutionString;
    private SuggestEmojiView suggestEmojiPanel;
    private boolean waitingForKeyboardOpen;
    boolean wasEmojiSearchOpened;
    private CharSequence[] answers = new CharSequence[10];
    private boolean[] answersChecks = new boolean[10];
    private int answersCount = 1;
    private boolean anonymousPoll = true;
    private int requestFieldFocusAtPosition = -1;
    private Runnable openKeyboardRunnable = new Runnable() {
        @Override
        public void run() {
            if (PollCreateActivity.this.currentCell != null) {
                EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
                if (PollCreateActivity.this.destroyed || editField == null || !PollCreateActivity.this.waitingForKeyboardOpen || PollCreateActivity.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                editField.requestFocus();
                AndroidUtilities.showKeyboard(editField);
                AndroidUtilities.cancelRunOnUIThread(PollCreateActivity.this.openKeyboardRunnable);
                AndroidUtilities.runOnUIThread(PollCreateActivity.this.openKeyboardRunnable, 100L);
            }
        }
    };
    private boolean isPremium = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap<String, String> hashMap, boolean z, int i);
    }

    static int access$3710(PollCreateActivity pollCreateActivity) {
        int i = pollCreateActivity.answersCount;
        pollCreateActivity.answersCount = i - 1;
        return i;
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        @Override
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 5) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            PollCreateActivity.this.listAdapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                PollCreateActivity.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
        }
    }

    public PollCreateActivity(ChatActivity chatActivity, Boolean bool) {
        this.parentFragment = chatActivity;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.quizPoll = booleanValue;
            this.quizOnly = booleanValue ? 1 : 2;
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.quizOnly == 1) {
            this.actionBar.setTitle(LocaleController.getString("NewQuiz", R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString("NewPoll", R.string.NewPoll));
        }
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2());
        this.doneItem = this.actionBar.createMenu().addItem(1, LocaleController.getString("Create", R.string.Create).toUpperCase());
        this.listAdapter = new ListAdapter(context);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) PollCreateActivity.this).actionBar, i, 0, i2, 0);
                int measureKeyboardHeight = measureKeyboardHeight();
                if (measureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
                    PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                    if (!pollCreateActivity.emojiViewVisible && !pollCreateActivity.isEmojiSearchOpened) {
                        this.ignoreLayout = true;
                        pollCreateActivity.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                }
                int emojiPadding = (measureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : PollCreateActivity.this.getEmojiPadding();
                if (measureKeyboardHeight > AndroidUtilities.dp(20.0f) && PollCreateActivity.this.isEmojiSearchOpened) {
                    emojiPadding = AndroidUtilities.dp(120.0f);
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) PollCreateActivity.this).actionBar) {
                        if (PollCreateActivity.this.emojiView == null || PollCreateActivity.this.emojiView != childAt) {
                            if (PollCreateActivity.this.listView == childAt) {
                                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(paddingTop - emojiPadding, 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                        } else if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                            }
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        }
                    }
                }
            }

            @Override
            public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PollCreateActivity.AnonymousClass3.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(this);
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierFrameLayout;
        this.fragmentView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(this, context) {
            @Override
            public void requestChildOnScreen(View view, View view2) {
                if (view instanceof PollEditTextCell) {
                    super.requestChildOnScreen(view, view2);
                }
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                rect.bottom += AndroidUtilities.dp(60.0f);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        this.listView.setLayoutManager(linearLayoutManager);
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                PollCreateActivity.this.lambda$createView$0(view, i);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i2 != 0 && PollCreateActivity.this.hintView != null) {
                    PollCreateActivity.this.hintView.hide();
                }
                if (PollCreateActivity.this.suggestEmojiPanel == null || !PollCreateActivity.this.suggestEmojiPanel.isShown()) {
                    return;
                }
                SuggestEmojiView.AnchorViewDelegate delegate = PollCreateActivity.this.suggestEmojiPanel.getDelegate();
                if (delegate instanceof PollEditTextCell) {
                    RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder((PollEditTextCell) delegate);
                    if (findContainingViewHolder != null) {
                        if (PollCreateActivity.this.suggestEmojiPanel.getDirection() == 0) {
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY((findContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + findContainingViewHolder.itemView.getMeasuredHeight());
                        } else {
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(findContainingViewHolder.itemView.getY());
                        }
                        if (PollCreateActivity.this.layoutManager.isViewPartiallyVisible(findContainingViewHolder.itemView, true, true)) {
                            return;
                        }
                        PollCreateActivity.this.suggestEmojiPanel.forceClose();
                        return;
                    }
                    PollCreateActivity.this.suggestEmojiPanel.forceClose();
                    return;
                }
                PollCreateActivity.this.suggestEmojiPanel.forceClose();
            }
        });
        HintView hintView = new HintView(context, 4);
        this.hintView = hintView;
        hintView.setText(LocaleController.getString("PollTapToSelect", R.string.PollTapToSelect));
        this.hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        frameLayout.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            SuggestEmojiView suggestEmojiView = new SuggestEmojiView(context, this.currentAccount, null, this.resourceProvider);
            this.suggestEmojiPanel = suggestEmojiView;
            suggestEmojiView.forbidCopy();
            this.suggestEmojiPanel.forbidSetAsStatus();
            this.suggestEmojiPanel.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.suggestEmojiPanel, LayoutHelper.createFrame(-2, 160, 51));
        }
        this.keyboardNotifier = new KeyboardNotifier(this.sizeNotifierFrameLayout, null);
        checkDoneButton();
        return this.fragmentView;
    }

    public class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass2() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (PollCreateActivity.this.checkDiscard()) {
                    PollCreateActivity.this.lambda$onBackPressed$306();
                    return;
                }
                return;
            }
            if (i == 1) {
                if (!PollCreateActivity.this.quizPoll || PollCreateActivity.this.doneItem.getAlpha() == 1.0f) {
                    CharSequence[] charSequenceArr = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.questionString)};
                    ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr, true);
                    CharSequence charSequence = charSequenceArr[0];
                    int size = entities.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC$MessageEntity tLRPC$MessageEntity = entities.get(i2);
                        if (tLRPC$MessageEntity.offset + tLRPC$MessageEntity.length > charSequence.length()) {
                            tLRPC$MessageEntity.length = charSequence.length() - tLRPC$MessageEntity.offset;
                        }
                    }
                    final TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = new TLRPC$TL_messageMediaPoll();
                    TLRPC$TL_poll tLRPC$TL_poll = new TLRPC$TL_poll();
                    tLRPC$TL_messageMediaPoll.poll = tLRPC$TL_poll;
                    tLRPC$TL_poll.multiple_choice = PollCreateActivity.this.multipleChoise;
                    tLRPC$TL_messageMediaPoll.poll.quiz = PollCreateActivity.this.quizPoll;
                    tLRPC$TL_messageMediaPoll.poll.public_voters = !PollCreateActivity.this.anonymousPoll;
                    tLRPC$TL_messageMediaPoll.poll.question = new TLRPC$TL_textWithEntities();
                    tLRPC$TL_messageMediaPoll.poll.question.text = charSequence.toString();
                    tLRPC$TL_messageMediaPoll.poll.question.entities = entities;
                    SerializedData serializedData = new SerializedData(10);
                    for (int i3 = 0; i3 < PollCreateActivity.this.answers.length; i3++) {
                        if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i3]))) {
                            CharSequence[] charSequenceArr2 = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i3])};
                            ArrayList<TLRPC$MessageEntity> entities2 = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr2, true);
                            CharSequence charSequence2 = charSequenceArr2[0];
                            int size2 = entities2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC$MessageEntity tLRPC$MessageEntity2 = entities2.get(i4);
                                if (tLRPC$MessageEntity2.offset + tLRPC$MessageEntity2.length > charSequence2.length()) {
                                    tLRPC$MessageEntity2.length = charSequence2.length() - tLRPC$MessageEntity2.offset;
                                }
                            }
                            TLRPC$TL_pollAnswer tLRPC$TL_pollAnswer = new TLRPC$TL_pollAnswer();
                            TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                            tLRPC$TL_pollAnswer.text = tLRPC$TL_textWithEntities;
                            tLRPC$TL_textWithEntities.text = charSequence2.toString();
                            tLRPC$TL_pollAnswer.text.entities = entities2;
                            tLRPC$TL_pollAnswer.option = r4;
                            byte[] bArr = {(byte) (tLRPC$TL_messageMediaPoll.poll.answers.size() + 48)};
                            tLRPC$TL_messageMediaPoll.poll.answers.add(tLRPC$TL_pollAnswer);
                            if ((PollCreateActivity.this.multipleChoise || PollCreateActivity.this.quizPoll) && PollCreateActivity.this.answersChecks[i3]) {
                                serializedData.writeByte(tLRPC$TL_pollAnswer.option[0]);
                            }
                        }
                    }
                    final HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("answers", Utilities.bytesToHex(serializedData.toByteArray()));
                    tLRPC$TL_messageMediaPoll.results = new TLRPC$TL_pollResults();
                    CharSequence fixedString = ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.solutionString);
                    if (fixedString != null) {
                        tLRPC$TL_messageMediaPoll.results.solution = fixedString.toString();
                        ArrayList<TLRPC$MessageEntity> entities3 = PollCreateActivity.this.getMediaDataController().getEntities(new CharSequence[]{fixedString}, true);
                        if (entities3 != null && !entities3.isEmpty()) {
                            tLRPC$TL_messageMediaPoll.results.solution_entities = entities3;
                        }
                        if (!TextUtils.isEmpty(tLRPC$TL_messageMediaPoll.results.solution)) {
                            tLRPC$TL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    if (PollCreateActivity.this.parentFragment.isInScheduleMode()) {
                        AlertsCreator.createScheduleDatePickerDialog(PollCreateActivity.this.getParentActivity(), PollCreateActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                            @Override
                            public final void didSelectDate(boolean z, int i5) {
                                PollCreateActivity.AnonymousClass2.this.lambda$onItemClick$0(tLRPC$TL_messageMediaPoll, hashMap, z, i5);
                            }
                        });
                        return;
                    } else {
                        PollCreateActivity.this.delegate.sendPoll(tLRPC$TL_messageMediaPoll, hashMap, true, 0);
                        PollCreateActivity.this.lambda$onBackPressed$306();
                        return;
                    }
                }
                int i5 = 0;
                for (int i6 = 0; i6 < PollCreateActivity.this.answersChecks.length; i6++) {
                    if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i6])) && PollCreateActivity.this.answersChecks[i6]) {
                        i5++;
                    }
                }
                if (i5 <= 0) {
                    PollCreateActivity.this.showQuizHint();
                }
            }
        }

        public void lambda$onItemClick$0(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i) {
            PollCreateActivity.this.delegate.sendPoll(tLRPC$TL_messageMediaPoll, hashMap, z, i);
            PollCreateActivity.this.lambda$onBackPressed$306();
        }
    }

    public void lambda$createView$0(View view, int i) {
        boolean z;
        if (i == this.addAnswerRow) {
            addNewField();
            return;
        }
        if (view instanceof TextCheckCell) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z2 = this.quizPoll;
            SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
            if (suggestEmojiView != null) {
                suggestEmojiView.forceClose();
            }
            if (i == this.anonymousRow) {
                z = !this.anonymousPoll;
                this.anonymousPoll = z;
            } else if (i == this.multipleRow) {
                z = !this.multipleChoise;
                this.multipleChoise = z;
                if (z && this.quizPoll) {
                    int i2 = this.solutionRow;
                    this.quizPoll = false;
                    updateRows();
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.quizRow);
                    if (findViewHolderForAdapterPosition != null) {
                        ((TextCheckCell) findViewHolderForAdapterPosition.itemView).setChecked(false);
                    } else {
                        this.listAdapter.notifyItemChanged(this.quizRow);
                    }
                    this.listAdapter.notifyItemRangeRemoved(i2, 2);
                }
            } else {
                if (this.quizOnly != 0) {
                    return;
                }
                z = !this.quizPoll;
                this.quizPoll = z;
                int i3 = this.solutionRow;
                updateRows();
                if (this.quizPoll) {
                    this.listAdapter.notifyItemRangeInserted(this.solutionRow, 2);
                } else {
                    this.listAdapter.notifyItemRangeRemoved(i3, 2);
                }
                if (this.quizPoll && this.multipleChoise) {
                    this.multipleChoise = false;
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.multipleRow);
                    if (findViewHolderForAdapterPosition2 != null) {
                        ((TextCheckCell) findViewHolderForAdapterPosition2.itemView).setChecked(false);
                    } else {
                        this.listAdapter.notifyItemChanged(this.multipleRow);
                    }
                }
                if (this.quizPoll) {
                    int i4 = 0;
                    boolean z3 = false;
                    while (true) {
                        boolean[] zArr = this.answersChecks;
                        if (i4 >= zArr.length) {
                            break;
                        }
                        if (z3) {
                            zArr[i4] = false;
                        } else if (zArr[i4]) {
                            z3 = true;
                        }
                        i4++;
                    }
                }
            }
            if (this.hintShowed && !this.quizPoll) {
                this.hintView.hide();
            }
            this.listView.getChildCount();
            for (int i5 = this.answerStartRow; i5 < this.answerStartRow + this.answersCount; i5++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(i5);
                if (findViewHolderForAdapterPosition3 != null) {
                    View view2 = findViewHolderForAdapterPosition3.itemView;
                    if (view2 instanceof PollEditTextCell) {
                        PollEditTextCell pollEditTextCell = (PollEditTextCell) view2;
                        pollEditTextCell.setShowCheckBox(this.quizPoll, true);
                        pollEditTextCell.setChecked(this.answersChecks[i5 - this.answerStartRow], z2);
                        if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f) && i == this.quizRow && !this.hintShowed) {
                            this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                            this.hintShowed = true;
                        }
                    }
                }
            }
            textCheckCell.setChecked(z);
            checkDoneButton();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.isPremium) {
            hideEmojiPopup(false);
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
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onFragmentDestroy() {
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
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.invalidateViews();
            }
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                int currentTextColor = pollEditTextCell.getEditField().getCurrentTextColor();
                this.currentCell.getEditField().setTextColor(-1);
                this.currentCell.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public void showQuizHint() {
        this.listView.getChildCount();
        for (int i = this.answerStartRow; i < this.answerStartRow + this.answersCount; i++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null) {
                View view = findViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                    if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                        this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void checkDoneButton() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PollCreateActivity.checkDoneButton():void");
    }

    public void updateRows() {
        this.rowCount = 0;
        int i = 0 + 1;
        this.rowCount = i;
        this.questionHeaderRow = 0;
        int i2 = i + 1;
        this.rowCount = i2;
        this.questionRow = i;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.questionSectionRow = i2;
        int i4 = i3 + 1;
        this.rowCount = i4;
        this.answerHeaderRow = i3;
        int i5 = this.answersCount;
        if (i5 != 0) {
            this.answerStartRow = i4;
            this.rowCount = i4 + i5;
        } else {
            this.answerStartRow = -1;
        }
        if (i5 != this.answers.length) {
            int i6 = this.rowCount;
            this.rowCount = i6 + 1;
            this.addAnswerRow = i6;
        } else {
            this.addAnswerRow = -1;
        }
        int i7 = this.rowCount;
        int i8 = i7 + 1;
        this.rowCount = i8;
        this.answerSectionRow = i7;
        this.rowCount = i8 + 1;
        this.settingsHeaderRow = i8;
        TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
        if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.anonymousRow = i9;
        } else {
            this.anonymousRow = -1;
        }
        int i10 = this.quizOnly;
        if (i10 != 1) {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.multipleRow = i11;
        } else {
            this.multipleRow = -1;
        }
        if (i10 == 0) {
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.quizRow = i12;
        } else {
            this.quizRow = -1;
        }
        int i13 = this.rowCount;
        int i14 = i13 + 1;
        this.rowCount = i14;
        this.settingsSectionRow = i13;
        if (this.quizPoll) {
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.solutionRow = i14;
            this.rowCount = i15 + 1;
            this.solutionInfoRow = i15;
            return;
        }
        this.solutionRow = -1;
        this.solutionInfoRow = -1;
    }

    @Override
    public boolean onBackPressed() {
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return false;
        }
        return checkDiscard();
    }

    public boolean checkDiscard() {
        boolean isEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.questionString));
        if (isEmpty) {
            for (int i = 0; i < this.answersCount && (isEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.answers[i]))); i++) {
            }
        }
        if (!isEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("CancelPollAlertTitle", R.string.CancelPollAlertTitle));
            builder.setMessage(LocaleController.getString("CancelPollAlertText", R.string.CancelPollAlertText));
            builder.setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    PollCreateActivity.this.lambda$checkDiscard$1(dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(builder.create());
        }
        return isEmpty;
    }

    public void lambda$checkDiscard$1(DialogInterface dialogInterface, int i) {
        lambda$onBackPressed$306();
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    public void setTextLeft(View view, int i) {
        int length;
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            int i2 = 100;
            if (i == this.questionRow) {
                CharSequence charSequence = this.questionString;
                length = 255 - (charSequence != null ? charSequence.length() : 0);
                i2 = 255;
            } else if (i == this.solutionRow) {
                CharSequence charSequence2 = this.solutionString;
                length = 200 - (charSequence2 != null ? charSequence2.length() : 0);
                i2 = 200;
            } else {
                int i3 = this.answerStartRow;
                if (i < i3 || i >= this.answersCount + i3) {
                    return;
                }
                int i4 = i - i3;
                CharSequence[] charSequenceArr = this.answers;
                length = 100 - (charSequenceArr[i4] != null ? charSequenceArr[i4].length() : 0);
            }
            float f = i2;
            if (length <= f - (0.7f * f)) {
                pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length)));
                SimpleTextView textView2 = pollEditTextCell.getTextView2();
                int i5 = length < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
                textView2.setTextColor(Theme.getColor(i5));
                textView2.setTag(Integer.valueOf(i5));
                return;
            }
            pollEditTextCell.setText2("");
        }
    }

    public void addNewField() {
        resetSuggestEmojiPanel();
        boolean[] zArr = this.answersChecks;
        int i = this.answersCount;
        zArr[i] = false;
        int i2 = i + 1;
        this.answersCount = i2;
        if (i2 == this.answers.length) {
            this.listAdapter.notifyItemRemoved(this.addAnswerRow);
        }
        this.listAdapter.notifyItemInserted(this.addAnswerRow);
        updateRows();
        this.requestFieldFocusAtPosition = (this.answerStartRow + this.answersCount) - 1;
        this.listAdapter.notifyItemChanged(this.answerSectionRow);
    }

    private void updateSuggestEmojiPanelDelegate(RecyclerView.ViewHolder viewHolder) {
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.forceClose();
            SuggestEmojiView suggestEmojiView2 = this.suggestEmojiPanel;
            if (suggestEmojiView2 == null || viewHolder == null || !(viewHolder.itemView instanceof PollEditTextCell)) {
                return;
            }
            SuggestEmojiView.AnchorViewDelegate delegate = suggestEmojiView2.getDelegate();
            View view = viewHolder.itemView;
            if (delegate != view) {
                this.suggestEmojiPanel.setDelegate((PollEditTextCell) view);
            }
        }
    }

    private void resetSuggestEmojiPanel() {
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.setDelegate(null);
            this.suggestEmojiPanel.forceClose();
        }
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
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
                int i2 = z ? this.keyboardHeightLand : this.keyboardHeight;
                if (this.isEmojiSearchOpened) {
                    i2 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = AndroidUtilities.displaySize.x;
                if (i3 != i4 || layoutParams.height != i2 || this.wasEmojiSearchOpened != this.isEmojiSearchOpened) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.emojiView.setLayoutParams(layoutParams);
                    this.emojiPadding = layoutParams.height;
                    this.keyboardNotifier.fire();
                    this.sizeNotifierFrameLayout.requestLayout();
                    boolean z3 = this.wasEmojiSearchOpened;
                    if (z3 != this.isEmojiSearchOpened) {
                        animateEmojiViewTranslationY(z3 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f), 0.0f);
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
                showEmojiPopup(0);
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

    private void animateEmojiViewTranslationY(final float f, final float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PollCreateActivity.this.lambda$animateEmojiViewTranslationY$2(f, f2, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PollCreateActivity.this.emojiView.setTranslationY(f2);
            }
        });
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        ofFloat.start();
    }

    public void lambda$animateEmojiViewTranslationY$2(float f, float f2, ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public void onEmojiClicked(PollEditTextCell pollEditTextCell) {
        this.currentCell = pollEditTextCell;
        if (this.emojiViewVisible) {
            collapseSearchEmojiView();
            openKeyboardInternal();
        } else {
            showEmojiPopup(1);
        }
    }

    private void collapseSearchEmojiView() {
        if (this.isEmojiSearchOpened) {
            this.emojiView.closeSearch(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.emojiView.setLayoutParams(layoutParams);
            this.emojiPadding = layoutParams.height;
            this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
            this.isEmojiSearchOpened = false;
            animateEmojiViewTranslationY(-AndroidUtilities.dp(120.0f), 0.0f);
        }
    }

    private void openKeyboardInternal() {
        this.keyboardNotifier.awaitKeyboard();
        EditTextBoldCursor editField = this.currentCell.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        showEmojiPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
    }

    private void showEmojiPopup(int i) {
        PollEditTextCell pollEditTextCell;
        if (this.isPremium) {
            if (i == 1) {
                EmojiView emojiView = this.emojiView;
                boolean z = emojiView != null && emojiView.getVisibility() == 0;
                createEmojiView();
                this.emojiView.setVisibility(0);
                this.emojiViewVisible = true;
                EmojiView emojiView2 = this.emojiView;
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
                int i2 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
                layoutParams.height = i2;
                emojiView2.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (pollEditTextCell = this.currentCell) != null) {
                    AndroidUtilities.hideKeyboard(pollEditTextCell.getEditField());
                }
                this.emojiPadding = i2;
                this.keyboardNotifier.fire();
                this.sizeNotifierFrameLayout.requestLayout();
                ChatActivityEnterViewAnimatedIconView emojiButton = this.currentCell.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
                }
                if (z || this.keyboardVisible) {
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PollCreateActivity.this.lambda$showEmojiPopup$3(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PollCreateActivity.this.emojiView.setTranslationY(0.0f);
                    }
                });
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                ofFloat.start();
                return;
            }
            ChatActivityEnterViewAnimatedIconView emojiButton2 = this.currentCell.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null) {
                this.emojiViewVisible = false;
                this.isEmojiSearchOpened = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    emojiView3.setVisibility(8);
                }
            }
            if (i == 0) {
                this.emojiPadding = 0;
            }
            this.keyboardNotifier.fire();
            this.sizeNotifierFrameLayout.requestLayout();
        }
    }

    public void lambda$showEmojiPopup$3(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onCellFocusChanges(PollEditTextCell pollEditTextCell, boolean z) {
        if (this.isPremium && z) {
            if (this.currentCell == pollEditTextCell && this.emojiViewVisible && this.isEmojiSearchOpened) {
                collapseSearchEmojiView();
                this.emojiViewVisible = false;
            }
            PollEditTextCell pollEditTextCell2 = this.currentCell;
            this.currentCell = pollEditTextCell;
            pollEditTextCell.setEmojiButtonVisibility(true);
            ChatActivityEnterViewAnimatedIconView emojiButton = pollEditTextCell.getEmojiButton();
            ChatActivityEnterViewAnimatedIconView.State state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
            emojiButton.setState(state, false);
            updateSuggestEmojiPanelDelegate(this.listView.findContainingViewHolder(pollEditTextCell));
            if (pollEditTextCell2 == null || pollEditTextCell2 == pollEditTextCell) {
                return;
            }
            if (this.emojiViewVisible) {
                collapseSearchEmojiView();
                hideEmojiPopup(false);
                openKeyboardInternal();
            }
            pollEditTextCell2.setEmojiButtonVisibility(false);
            pollEditTextCell2.getEmojiButton().setState(state, false);
        }
    }

    public void hideEmojiPopup(boolean z) {
        if (this.isPremium) {
            if (this.emojiViewVisible) {
                this.emojiView.scrollEmojiToTop();
                this.emojiView.closeSearch(false);
                if (z) {
                    this.emojiView.hideSearchKeyboard();
                }
                this.isEmojiSearchOpened = false;
                showEmojiPopup(0);
            }
            if (z) {
                EmojiView emojiView = this.emojiView;
                if (emojiView != null && emojiView.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PollCreateActivity.this.lambda$hideEmojiPopup$4(valueAnimator);
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            PollCreateActivity.this.isAnimatePopupClosing = false;
                            PollCreateActivity.this.emojiView.setTranslationY(0.0f);
                            PollCreateActivity.this.hideEmojiView();
                        }
                    });
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    ofFloat.start();
                    return;
                }
                hideEmojiView();
            }
        }
    }

    public void lambda$hideEmojiPopup$4(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void hideEmojiView() {
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

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    private void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.sizeNotifierFrameLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), true, null, null, true, this.resourceProvider, false);
        this.emojiView = emojiView2;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.allowEmojisForNonPremium(false);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass9());
        this.sizeNotifierFrameLayout.addView(this.emojiView);
    }

    public class AnonymousClass9 implements EmojiView.EmojiViewDelegate {
        @Override
        public boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public void onAnimatedEmojiUnlockClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
        }

        @Override
        public void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public void lambda$onGifSelected$1(View view, Object obj, String str, Object obj2, boolean z, int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i);
        }

        @Override
        public void onShowStickerSet(TLRPC$StickerSet tLRPC$StickerSet, TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, tLRPC$StickerSet, tLRPC$InputStickerSet, z);
        }

        @Override
        public void onStickerSelected(View view, TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, tLRPC$Document, str, obj, sendAnimationData, z, i);
        }

        @Override
        public void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, tLRPC$StickerSetCovered);
        }

        @Override
        public void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, tLRPC$StickerSetCovered);
        }

        @Override
        public void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }

        AnonymousClass9() {
        }

        @Override
        public boolean onBackspace() {
            EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
            if (editField == null) {
                return false;
            }
            editField.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onEmojiSelected(String str) {
            EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
            if (editField == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editField.getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                editField.setText(editField.getText().insert(selectionEnd, replaceEmoji));
                int length = selectionEnd + replaceEmoji.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC$Document tLRPC$Document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            EditTextBoldCursor editField = PollCreateActivity.this.currentCell.getEditField();
            if (editField == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (tLRPC$Document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$Document, editField.getPaint().getFontMetricsInt());
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, editField.getPaint().getFontMetricsInt());
                }
                animatedEmojiSpan.cacheType = PollCreateActivity.this.emojiView.emojiCacheType;
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editField.setText(editField.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(PollCreateActivity.this.getContext(), ((BaseFragment) PollCreateActivity.this).resourceProvider);
            builder.setTitle(LocaleController.getString("ClearRecentEmojiTitle", R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString("ClearRecentEmojiText", R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PollCreateActivity.AnonymousClass9.this.lambda$onClearEmojiRecent$0(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.show();
        }

        public void lambda$onClearEmojiRecent$0(DialogInterface dialogInterface, int i) {
            PollCreateActivity.this.emojiView.clearRecentEmoji();
        }

        @Override
        public void onSearchOpenClose(int i) {
            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
            pollCreateActivity.isEmojiSearchOpened = i != 0;
            pollCreateActivity.sizeNotifierFrameLayout.requestLayout();
        }

        @Override
        public boolean isSearchOpened() {
            return PollCreateActivity.this.isEmojiSearchOpened;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return PollCreateActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != PollCreateActivity.this.questionHeaderRow) {
                    if (i == PollCreateActivity.this.answerHeaderRow) {
                        if (PollCreateActivity.this.quizOnly == 1) {
                            headerCell.setText(LocaleController.getString("QuizAnswers", R.string.QuizAnswers));
                            return;
                        } else {
                            headerCell.setText(LocaleController.getString("AnswerOptions", R.string.AnswerOptions));
                            return;
                        }
                    }
                    if (i == PollCreateActivity.this.settingsHeaderRow) {
                        headerCell.setText(LocaleController.getString("Settings", R.string.Settings));
                        return;
                    }
                    return;
                }
                headerCell.setText(LocaleController.getString("PollQuestion", R.string.PollQuestion));
                return;
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == PollCreateActivity.this.anonymousRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PollAnonymous", R.string.PollAnonymous), PollCreateActivity.this.anonymousPoll, (PollCreateActivity.this.multipleRow == -1 && PollCreateActivity.this.quizRow == -1) ? false : true);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else if (i == PollCreateActivity.this.multipleRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PollMultiple", R.string.PollMultiple), PollCreateActivity.this.multipleChoise, PollCreateActivity.this.quizRow != -1);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else {
                    if (i == PollCreateActivity.this.quizRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("PollQuiz", R.string.PollQuiz), PollCreateActivity.this.quizPoll, false);
                        textCheckCell.setEnabled(PollCreateActivity.this.quizOnly == 0, null);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_switchTrackChecked), PorterDuff.Mode.MULTIPLY));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck), PorterDuff.Mode.MULTIPLY));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString("AddAnOption", R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setFixedSize(0);
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i != PollCreateActivity.this.solutionInfoRow) {
                if (i == PollCreateActivity.this.settingsSectionRow) {
                    if (PollCreateActivity.this.quizOnly != 0) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("QuizInfo", R.string.QuizInfo));
                        return;
                    }
                }
                if (10 - PollCreateActivity.this.answersCount <= 0) {
                    textInfoPrivacyCell.setText(LocaleController.getString("AddAnOptionInfoMax", R.string.AddAnOptionInfoMax));
                    return;
                } else {
                    textInfoPrivacyCell.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", 10 - PollCreateActivity.this.answersCount, new Object[0])));
                    return;
                }
            }
            textInfoPrivacyCell.setText(LocaleController.getString("AddAnExplanationInfo", R.string.AddAnExplanationInfo));
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                pollEditTextCell.setTextAndHint(PollCreateActivity.this.questionString != null ? PollCreateActivity.this.questionString : "", LocaleController.getString("QuestionHint", R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                PollCreateActivity.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell2.setTag(1);
                    pollEditTextCell2.setTextAndHint(PollCreateActivity.this.solutionString != null ? PollCreateActivity.this.solutionString : "", LocaleController.getString("AddAnExplanation", R.string.AddAnExplanation), false);
                    pollEditTextCell2.setTag(null);
                    PollCreateActivity.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
            pollEditTextCell3.setTag(1);
            pollEditTextCell3.setTextAndHint(PollCreateActivity.this.answers[adapterPosition - PollCreateActivity.this.answerStartRow], LocaleController.getString("OptionHint", R.string.OptionHint), true);
            pollEditTextCell3.setTag(null);
            if (PollCreateActivity.this.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                PollCreateActivity.this.requestFieldFocusAtPosition = -1;
            }
            PollCreateActivity.this.setTextLeft(viewHolder.itemView, adapterPosition);
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 5) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
                    if (PollCreateActivity.this.isPremium) {
                        if (PollCreateActivity.this.suggestEmojiPanel != null) {
                            PollCreateActivity.this.suggestEmojiPanel.forceClose();
                        }
                        PollCreateActivity.this.hideEmojiPopup(true);
                    }
                    PollCreateActivity.this.currentCell = null;
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == PollCreateActivity.this.addAnswerRow || adapterPosition == PollCreateActivity.this.anonymousRow || adapterPosition == PollCreateActivity.this.multipleRow || (PollCreateActivity.this.quizOnly == 0 && adapterPosition == PollCreateActivity.this.quizRow);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                View headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = headerCell;
            } else if (i == 1) {
                view = new ShadowSectionCell(this.mContext);
            } else if (i == 2) {
                view = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 3) {
                View textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = textCell;
            } else if (i == 4) {
                final PollEditTextCell pollEditTextCell = new PollEditTextCell(this.mContext, false, PollCreateActivity.this.isPremium ? 1 : 0, null) {
                    @Override
                    protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                        if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                            Menu menu = actionMode.getMenu();
                            if (menu.findItem(16908321) == null) {
                                return;
                            }
                            ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.getCurrentEncryptedChat(), false);
                        }
                    }

                    @Override
                    protected void onEditTextFocusChanged(boolean z) {
                        PollCreateActivity.this.onCellFocusChanges(this, z);
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell2) {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell2);
                    }
                };
                pollEditTextCell.createErrorTextView();
                pollEditTextCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                pollEditTextCell.addTextWatcher(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (pollEditTextCell.getTag() != null) {
                            return;
                        }
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(PollCreateActivity.this.questionRow);
                        if (findViewHolderForAdapterPosition != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(findViewHolderForAdapterPosition.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity.this.questionString = editable;
                        if (findViewHolderForAdapterPosition != null) {
                            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                            pollCreateActivity.setTextLeft(findViewHolderForAdapterPosition.itemView, pollCreateActivity.questionRow);
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }
                });
                view = pollEditTextCell;
            } else if (i == 6) {
                View textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = textCheckCell;
            } else if (i != 7) {
                boolean z = PollCreateActivity.this.isPremium;
                final PollEditTextCell pollEditTextCell2 = new PollEditTextCell(this.mContext, false, z ? 1 : 0, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        PollCreateActivity.ListAdapter.this.lambda$onCreateViewHolder$0(view2);
                    }
                }) {
                    @Override
                    protected void onEditTextFocusChanged(boolean z2) {
                        PollCreateActivity.this.onCellFocusChanges(this, z2);
                    }

                    @Override
                    protected boolean drawDivider() {
                        RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(this);
                        if (findContainingViewHolder != null) {
                            int adapterPosition = findContainingViewHolder.getAdapterPosition();
                            if (PollCreateActivity.this.answersCount == 10 && adapterPosition == (PollCreateActivity.this.answerStartRow + PollCreateActivity.this.answersCount) - 1) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override
                    protected boolean shouldShowCheckBox() {
                        return PollCreateActivity.this.quizPoll;
                    }

                    @Override
                    public void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z2) {
                        int adapterPosition;
                        if (z2 && PollCreateActivity.this.quizPoll) {
                            Arrays.fill(PollCreateActivity.this.answersChecks, false);
                            PollCreateActivity.this.listView.getChildCount();
                            for (int i2 = PollCreateActivity.this.answerStartRow; i2 < PollCreateActivity.this.answerStartRow + PollCreateActivity.this.answersCount; i2++) {
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(i2);
                                if (findViewHolderForAdapterPosition != null) {
                                    View view2 = findViewHolderForAdapterPosition.itemView;
                                    if (view2 instanceof PollEditTextCell) {
                                        ((PollEditTextCell) view2).setChecked(false, true);
                                    }
                                }
                            }
                        }
                        super.onCheckBoxClick(pollEditTextCell3, z2);
                        RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell3);
                        if (findContainingViewHolder != null && (adapterPosition = findContainingViewHolder.getAdapterPosition()) != -1) {
                            PollCreateActivity.this.answersChecks[adapterPosition - PollCreateActivity.this.answerStartRow] = z2;
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }

                    @Override
                    protected boolean isChecked(PollEditTextCell pollEditTextCell3) {
                        int adapterPosition;
                        RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell3);
                        if (findContainingViewHolder == null || (adapterPosition = findContainingViewHolder.getAdapterPosition()) == -1) {
                            return false;
                        }
                        return PollCreateActivity.this.answersChecks[adapterPosition - PollCreateActivity.this.answerStartRow];
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell3) {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell3);
                    }
                };
                pollEditTextCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                pollEditTextCell2.addTextWatcher(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        int adapterPosition;
                        RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell2);
                        if (findContainingViewHolder == null || (adapterPosition = findContainingViewHolder.getAdapterPosition() - PollCreateActivity.this.answerStartRow) < 0 || adapterPosition >= PollCreateActivity.this.answers.length) {
                            return;
                        }
                        if (PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell2.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                            float y = (findContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + findContainingViewHolder.itemView.getMeasuredHeight();
                            if (y > 0.0f) {
                                PollCreateActivity.this.suggestEmojiPanel.setDirection(0);
                                PollCreateActivity.this.suggestEmojiPanel.setTranslationY(y);
                            } else {
                                PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                                PollCreateActivity.this.suggestEmojiPanel.setTranslationY(findContainingViewHolder.itemView.getY());
                            }
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(pollEditTextCell2);
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity.this.answers[adapterPosition] = editable;
                        PollCreateActivity.this.setTextLeft(pollEditTextCell2, adapterPosition);
                        PollCreateActivity.this.checkDoneButton();
                    }
                });
                pollEditTextCell2.setShowNextButton(true);
                EditTextBoldCursor textView = pollEditTextCell2.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                        boolean lambda$onCreateViewHolder$1;
                        lambda$onCreateViewHolder$1 = PollCreateActivity.ListAdapter.this.lambda$onCreateViewHolder$1(pollEditTextCell2, textView2, i2, keyEvent);
                        return lambda$onCreateViewHolder$1;
                    }
                });
                textView.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                        boolean lambda$onCreateViewHolder$2;
                        lambda$onCreateViewHolder$2 = PollCreateActivity.ListAdapter.lambda$onCreateViewHolder$2(PollEditTextCell.this, view2, i2, keyEvent);
                        return lambda$onCreateViewHolder$2;
                    }
                });
                view = pollEditTextCell2;
            } else {
                final PollEditTextCell pollEditTextCell3 = new PollEditTextCell(this.mContext, false, PollCreateActivity.this.isPremium ? 1 : 0, null) {
                    @Override
                    protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                        if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                            Menu menu = actionMode.getMenu();
                            if (menu.findItem(16908321) == null) {
                                return;
                            }
                            ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.getCurrentEncryptedChat(), false);
                        }
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell4) {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell4);
                    }

                    @Override
                    protected void onEditTextFocusChanged(boolean z2) {
                        PollCreateActivity.this.onCellFocusChanges(this, z2);
                    }
                };
                pollEditTextCell3.createErrorTextView();
                pollEditTextCell3.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                pollEditTextCell3.addTextWatcher(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (pollEditTextCell3.getTag() != null) {
                            return;
                        }
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(PollCreateActivity.this.questionRow);
                        if (findViewHolderForAdapterPosition != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell3.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(pollEditTextCell3);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(findViewHolderForAdapterPosition.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity.this.solutionString = editable;
                        if (findViewHolderForAdapterPosition != null) {
                            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                            pollCreateActivity.setTextLeft(findViewHolderForAdapterPosition.itemView, pollCreateActivity.solutionRow);
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }
                });
                view = pollEditTextCell3;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        public void lambda$onCreateViewHolder$0(android.view.View r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PollCreateActivity.ListAdapter.lambda$onCreateViewHolder$0(android.view.View):void");
        }

        public boolean lambda$onCreateViewHolder$1(PollEditTextCell pollEditTextCell, TextView textView, int i, KeyEvent keyEvent) {
            int adapterPosition;
            if (i != 5) {
                return false;
            }
            RecyclerView.ViewHolder findContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell);
            if (findContainingViewHolder != null && (adapterPosition = findContainingViewHolder.getAdapterPosition()) != -1) {
                int i2 = adapterPosition - PollCreateActivity.this.answerStartRow;
                if (i2 != PollCreateActivity.this.answersCount - 1 || PollCreateActivity.this.answersCount >= 10) {
                    if (i2 != PollCreateActivity.this.answersCount - 1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
                        if (findViewHolderForAdapterPosition != null) {
                            View view = findViewHolderForAdapterPosition.itemView;
                            if (view instanceof PollEditTextCell) {
                                ((PollEditTextCell) view).getTextView().requestFocus();
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(pollEditTextCell.getTextView());
                    }
                } else {
                    PollCreateActivity.this.addNewField();
                }
            }
            return true;
        }

        public static boolean lambda$onCreateViewHolder$2(PollEditTextCell pollEditTextCell, View view, int i, KeyEvent keyEvent) {
            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
            if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                return false;
            }
            pollEditTextCell.callOnDelete();
            return true;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PollCreateActivity.this.questionHeaderRow || i == PollCreateActivity.this.answerHeaderRow || i == PollCreateActivity.this.settingsHeaderRow) {
                return 0;
            }
            if (i == PollCreateActivity.this.questionSectionRow) {
                return 1;
            }
            if (i == PollCreateActivity.this.answerSectionRow || i == PollCreateActivity.this.settingsSectionRow || i == PollCreateActivity.this.solutionInfoRow) {
                return 2;
            }
            if (i == PollCreateActivity.this.addAnswerRow) {
                return 3;
            }
            if (i == PollCreateActivity.this.questionRow) {
                return 4;
            }
            if (i == PollCreateActivity.this.solutionRow) {
                return 7;
            }
            return (i == PollCreateActivity.this.anonymousRow || i == PollCreateActivity.this.multipleRow || i == PollCreateActivity.this.quizRow) ? 6 : 5;
        }

        public void swapElements(int i, int i2) {
            int i3 = i - PollCreateActivity.this.answerStartRow;
            int i4 = i2 - PollCreateActivity.this.answerStartRow;
            if (i3 < 0 || i4 < 0 || i3 >= PollCreateActivity.this.answersCount || i4 >= PollCreateActivity.this.answersCount) {
                return;
            }
            CharSequence charSequence = PollCreateActivity.this.answers[i3];
            PollCreateActivity.this.answers[i3] = PollCreateActivity.this.answers[i4];
            PollCreateActivity.this.answers[i4] = charSequence;
            boolean z = PollCreateActivity.this.answersChecks[i3];
            PollCreateActivity.this.answersChecks[i3] = PollCreateActivity.this.answersChecks[i4];
            PollCreateActivity.this.answersChecks[i4] = z;
            notifyItemMoved(i, i2);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCell.class, PollEditTextCell.class, TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i3 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{HeaderCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{HeaderCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText3));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteHintText));
        int i5 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"moveImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{PollEditTextCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        int i6 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        int i7 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        return arrayList;
    }
}
