package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
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
import org.telegram.ui.Components.CubicBezierInterpolator;
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
    private int allowAddingRow;
    private int allowMarkingRow;
    private int anonymousRow;
    private int answerHeaderRow;
    private int[] answerIds;
    private int answerSectionRow;
    private int answerStartRow;
    private final CharSequence[] answers;
    private final boolean[] answersChecks;
    private PollEditTextCell currentCell;
    private PollCreateActivityDelegate delegate;
    private boolean destroyed;
    private ActionBarMenuItem doneItem;
    private TLRPC.MessageMedia editing;
    private int emojiPadding;
    private EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private boolean firstRequestField;
    private boolean hintShowed;
    private HintView hintView;
    private boolean isAnimatePopupClosing;
    boolean isEmojiSearchOpened;
    private boolean isPremium;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private RecyclerView.LayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int maxAnswerId;
    private final int maxAnswersCount;
    private boolean multipleChoise;
    private int multipleRow;
    private int oldAnswersCount;
    private boolean onlyAdding;
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
    private final boolean todo;
    private boolean waitingForKeyboardOpen;
    boolean wasEmojiSearchOpened;
    private int answersCount = 1;
    private boolean anonymousPoll = true;
    private boolean allowAdding = false;
    private boolean allowMarking = true;
    private int shiftDp = AndroidUtilities.dp(3.0f);
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

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia, HashMap map, boolean z, int i);
    }

    static int access$4908(PollCreateActivity pollCreateActivity) {
        int i = pollCreateActivity.answersCount;
        pollCreateActivity.answersCount = i + 1;
        return i;
    }

    @Override
    public boolean isLightStatusBar() {
        if (getLastStoryViewer() != null && getLastStoryViewer().isShown()) {
            return false;
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
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
            if (viewHolder.getItemViewType() != 5 || !canMove(viewHolder.getAdapterPosition())) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        private boolean canMove(int i) {
            return !PollCreateActivity.this.onlyAdding || i - PollCreateActivity.this.answerStartRow >= PollCreateActivity.this.oldAnswersCount;
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType() || !canMove(viewHolder.getAdapterPosition()) || !canMove(viewHolder2.getAdapterPosition())) {
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

    public PollCreateActivity(ChatActivity chatActivity, boolean z, Boolean bool) {
        this.todo = z;
        int i = z ? getMessagesController().todoItemsMax : getMessagesController().pollAnswersMax;
        this.maxAnswersCount = i;
        this.answers = new CharSequence[i];
        this.answersChecks = new boolean[i];
        this.parentFragment = chatActivity;
        this.isPremium = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this.quizPoll = zBooleanValue;
            this.quizOnly = zBooleanValue ? 1 : 2;
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        return true;
    }

    @Override
    public void onBecomeFullyVisible() {
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
            if (this.listView.getChildAdapterPosition(childAt) == this.requestFieldFocusAtPosition) {
                break;
            } else {
                i++;
            }
        }
        if (childAt instanceof PollEditTextCell) {
            final EditTextBoldCursor textView = ((PollEditTextCell) childAt).getTextView();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PollCreateActivity.lambda$onBecomeFullyVisible$0(textView);
                }
            }, 300L);
            this.requestFieldFocusAtPosition = -1;
        }
        this.firstRequestField = false;
    }

    public static void lambda$onBecomeFullyVisible$0(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public void setEditing(TLRPC.MessageMedia messageMedia, boolean z) {
        setEditing(messageMedia, z, -1);
    }

    public void setEditing(TLRPC.MessageMedia messageMedia, boolean z, int i) {
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
                this.answers[i3] = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.answers;
                charSequenceArr[i3] = Emoji.replaceEmoji(charSequenceArr[i3], textPaint.getFontMetricsInt(), false);
                CharSequence[] charSequenceArr2 = this.answers;
                charSequenceArr2[i3] = MessageObject.replaceAnimatedEmoji(charSequenceArr2[i3], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(this.answers[i3], tL_textWithEntities.entities, false, false, false, false);
                this.answerIds[i3] = tL_messageMediaToDo.todo.list.get(i3).id;
                this.maxAnswerId = Math.max(this.maxAnswerId, this.answerIds[i3]);
                i3++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.allowMarking = todoList.others_can_complete;
            this.allowAdding = todoList.others_can_append;
            if (this.onlyAdding) {
                this.answersCount = i2 + 1;
                updateRows();
                this.firstRequestField = true;
                int i4 = this.answerStartRow;
                if (i < 0) {
                    i = this.answersCount - 1;
                }
                this.requestFieldFocusAtPosition = i4 + i;
            }
        }
    }

    @Override
    public View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(getThemedColor(i), false);
        this.actionBar.setItemsColor(getThemedColor(i), true);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.todo) {
            this.actionBar.setTitle(LocaleController.getString(this.onlyAdding ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.quizOnly == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2());
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.todo) {
            upperCase = LocaleController.getString(this.onlyAdding ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.doneItem = actionBarMenuCreateMenu.addItem(1, upperCase);
        this.listAdapter = new ListAdapter(context);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            protected void onMeasure(int i2, int i3) throws NumberFormatException {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) PollCreateActivity.this).actionBar, i2, 0, i3, 0);
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
                    PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                    if (!pollCreateActivity.emojiViewVisible && !pollCreateActivity.isEmojiSearchOpened) {
                        this.ignoreLayout = true;
                        pollCreateActivity.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                }
                int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : PollCreateActivity.this.getEmojiPadding();
                if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) && PollCreateActivity.this.isEmojiSearchOpened) {
                    emojiPadding = AndroidUtilities.dp(120.0f);
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) PollCreateActivity.this).actionBar) {
                        if (PollCreateActivity.this.emojiView == null || PollCreateActivity.this.emojiView != childAt) {
                            if (PollCreateActivity.this.listView == childAt) {
                                childAt.measure(i2, View.MeasureSpec.makeMeasureSpec(paddingTop - emojiPadding, 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i2, 0, i3, 0);
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
            protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
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
        this.listView = new RecyclerListView(context) {
            @Override
            protected void requestChildOnScreen(View view, View view2) {
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
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        this.listView.setLayoutManager(linearLayoutManager);
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$createView$1(view, i2);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (i3 != 0 && PollCreateActivity.this.hintView != null) {
                    PollCreateActivity.this.hintView.hide();
                }
                if (PollCreateActivity.this.suggestEmojiPanel == null || !PollCreateActivity.this.suggestEmojiPanel.isShown()) {
                    return;
                }
                SuggestEmojiView.AnchorViewDelegate delegate = PollCreateActivity.this.suggestEmojiPanel.getDelegate();
                if (delegate instanceof PollEditTextCell) {
                    RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder((PollEditTextCell) delegate);
                    if (viewHolderFindContainingViewHolder != null) {
                        if (PollCreateActivity.this.suggestEmojiPanel.getDirection() == 0) {
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY((viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight());
                        } else {
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
                        }
                        if (PollCreateActivity.this.layoutManager.isViewPartiallyVisible(viewHolderFindContainingViewHolder.itemView, true, true)) {
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
        hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
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

    class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass2() {
        }

        @Override
        public void onItemClick(int i) throws IOException {
            int iMax;
            if (i == -1) {
                if (PollCreateActivity.this.checkDiscard(true)) {
                    PollCreateActivity.this.finishFragment();
                    return;
                }
                return;
            }
            if (i == 1) {
                if (!PollCreateActivity.this.todo) {
                    if (PollCreateActivity.this.quizPoll && PollCreateActivity.this.doneItem.getAlpha() != 1.0f) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < PollCreateActivity.this.answersChecks.length; i3++) {
                            if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i3])) && PollCreateActivity.this.answersChecks[i3]) {
                                i2++;
                            }
                        }
                        if (i2 <= 0) {
                            PollCreateActivity.this.showQuizHint();
                            return;
                        }
                        return;
                    }
                    CharSequence[] charSequenceArr = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.questionString)};
                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr, true);
                    CharSequence charSequence = charSequenceArr[0];
                    int size = entities.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC.MessageEntity messageEntity = entities.get(i4);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                    final TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = PollCreateActivity.this.multipleChoise;
                    tL_messageMediaPoll.poll.quiz = PollCreateActivity.this.quizPoll;
                    tL_messageMediaPoll.poll.public_voters = !PollCreateActivity.this.anonymousPoll;
                    tL_messageMediaPoll.poll.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence.toString();
                    tL_messageMediaPoll.poll.question.entities = entities;
                    SerializedData serializedData = new SerializedData(PollCreateActivity.this.maxAnswersCount);
                    for (int i5 = 0; i5 < PollCreateActivity.this.answers.length; i5++) {
                        if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i5]))) {
                            CharSequence[] charSequenceArr2 = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i5])};
                            ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr2, true);
                            CharSequence charSequence2 = charSequenceArr2[0];
                            int size2 = entities2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i6);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities;
                            tL_textWithEntities.text = charSequence2.toString();
                            tL_pollAnswer.text.entities = entities2;
                            tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                            if ((PollCreateActivity.this.multipleChoise || PollCreateActivity.this.quizPoll) && PollCreateActivity.this.answersChecks[i5]) {
                                serializedData.writeByte(tL_pollAnswer.option[0]);
                            }
                        }
                    }
                    final HashMap map = new HashMap();
                    map.put("answers", Utilities.bytesToHex(serializedData.toByteArray()));
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence fixedString = ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.solutionString);
                    if (fixedString != null) {
                        tL_messageMediaPoll.results.solution = fixedString.toString();
                        ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                        if (entities3 != null && !entities3.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = entities3;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    if (PollCreateActivity.this.parentFragment.isInScheduleMode()) {
                        AlertsCreator.createScheduleDatePickerDialog(PollCreateActivity.this.parentFragment.getParentActivity(), PollCreateActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                            @Override
                            public final void didSelectDate(boolean z, int i7, int i8) {
                                this.f$0.lambda$onItemClick$1(tL_messageMediaPoll, map, z, i7, i8);
                            }
                        });
                        return;
                    } else {
                        PollCreateActivity.this.delegate.sendPoll(tL_messageMediaPoll, map, true, 0);
                        PollCreateActivity.this.finishFragment();
                        return;
                    }
                }
                CharSequence[] charSequenceArr3 = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.questionString)};
                ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr3, true);
                CharSequence charSequence3 = charSequenceArr3[0];
                int size3 = entities4.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    TLRPC.MessageEntity messageEntity3 = entities4.get(i7);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
                final TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = PollCreateActivity.this.allowAdding;
                tL_messageMediaToDo.todo.others_can_complete = PollCreateActivity.this.allowMarking;
                tL_messageMediaToDo.todo.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence3.toString();
                tL_messageMediaToDo.todo.title.entities = entities4;
                if (PollCreateActivity.this.answerIds != null) {
                    iMax = 0;
                    for (int i8 = 0; i8 < PollCreateActivity.this.answerIds.length; i8++) {
                        iMax = Math.max(iMax, PollCreateActivity.this.answerIds[i8]);
                    }
                } else {
                    iMax = 0;
                }
                for (int i9 = 0; i9 < PollCreateActivity.this.answers.length; i9++) {
                    if (!TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i9]))) {
                        CharSequence[] charSequenceArr4 = {ChatAttachAlertPollLayout.getFixedString(PollCreateActivity.this.answers[i9])};
                        ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(((BaseFragment) PollCreateActivity.this).currentAccount).getEntities(charSequenceArr4, true);
                        CharSequence charSequence4 = charSequenceArr4[0];
                        int size4 = entities5.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            TLRPC.MessageEntity messageEntity4 = entities5.get(i10);
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        todoItem.title.entities = entities5;
                        if (PollCreateActivity.this.answerIds != null && i9 < PollCreateActivity.this.answerIds.length) {
                            todoItem.id = PollCreateActivity.this.answerIds[i9];
                        } else {
                            iMax++;
                            todoItem.id = iMax;
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (PollCreateActivity.this.parentFragment.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(PollCreateActivity.this.parentFragment.getParentActivity(), PollCreateActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i11, int i12) {
                            this.f$0.lambda$onItemClick$0(tL_messageMediaToDo, z, i11, i12);
                        }
                    });
                } else {
                    PollCreateActivity.this.delegate.sendPoll(tL_messageMediaToDo, null, true, 0);
                    PollCreateActivity.this.finishFragment();
                }
            }
        }

        public void lambda$onItemClick$0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, boolean z, int i, int i2) {
            PollCreateActivity.this.delegate.sendPoll(tL_messageMediaToDo, null, z, i);
            PollCreateActivity.this.finishFragment();
        }

        public void lambda$onItemClick$1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, HashMap map, boolean z, int i, int i2) {
            PollCreateActivity.this.delegate.sendPoll(tL_messageMediaPoll, map, z, i);
            PollCreateActivity.this.finishFragment();
        }
    }

    public void lambda$createView$1(View view, int i) {
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
            if (this.onlyAdding) {
                int i2 = -this.shiftDp;
                this.shiftDp = i2;
                AndroidUtilities.shakeViewSpring(textCheckCell, i2);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i == this.anonymousRow) {
                z = !this.anonymousPoll;
                this.anonymousPoll = z;
            } else {
                int i3 = this.allowAddingRow;
                if (i == i3) {
                    z = !this.allowAdding;
                    this.allowAdding = z;
                } else if (i == this.allowMarkingRow) {
                    boolean z3 = !this.allowMarking;
                    this.allowMarking = z3;
                    updateRows();
                    int i4 = this.allowAddingRow;
                    if (i4 >= 0 && i3 < 0) {
                        this.listAdapter.notifyItemInserted(i4);
                    } else if (i3 >= 0 && i4 < 0) {
                        this.listAdapter.notifyItemRemoved(i3);
                    }
                    z = z3;
                } else if (i == this.multipleRow) {
                    boolean z4 = this.multipleChoise;
                    boolean z5 = !z4;
                    this.multipleChoise = z5;
                    if (!z4 && this.quizPoll) {
                        int i5 = this.solutionRow;
                        this.quizPoll = false;
                        updateRows();
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.quizRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            ((TextCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView).setChecked(false);
                        } else {
                            this.listAdapter.notifyItemChanged(this.quizRow);
                        }
                        this.listAdapter.notifyItemRangeRemoved(i5, 2);
                    }
                    z = z5;
                } else {
                    if (this.quizOnly != 0) {
                        return;
                    }
                    z = !this.quizPoll;
                    this.quizPoll = z;
                    int i6 = this.solutionRow;
                    updateRows();
                    if (this.quizPoll) {
                        this.listAdapter.notifyItemRangeInserted(this.solutionRow, 2);
                    } else {
                        this.listAdapter.notifyItemRangeRemoved(i6, 2);
                    }
                    if (this.quizPoll && this.multipleChoise) {
                        this.multipleChoise = false;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.multipleRow);
                        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                            ((TextCheckCell) viewHolderFindViewHolderForAdapterPosition2.itemView).setChecked(false);
                        } else {
                            this.listAdapter.notifyItemChanged(this.multipleRow);
                        }
                    }
                    if (this.quizPoll) {
                        int i7 = 0;
                        boolean z6 = false;
                        while (true) {
                            boolean[] zArr = this.answersChecks;
                            if (i7 >= zArr.length) {
                                break;
                            }
                            if (z6) {
                                zArr[i7] = false;
                            } else if (zArr[i7]) {
                                z6 = true;
                            }
                            i7++;
                        }
                    }
                }
            }
            if (this.hintShowed && !this.quizPoll) {
                this.hintView.hide();
            }
            this.listView.getChildCount();
            for (int i8 = this.answerStartRow; i8 < this.answerStartRow + this.answersCount; i8++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(i8);
                if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                    View view2 = viewHolderFindViewHolderForAdapterPosition3.itemView;
                    if (view2 instanceof PollEditTextCell) {
                        PollEditTextCell pollEditTextCell = (PollEditTextCell) view2;
                        pollEditTextCell.setShowCheckBox(this.quizPoll, true);
                        pollEditTextCell.setChecked(this.answersChecks[i8 - this.answerStartRow], z2);
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
    public void onPause() throws NumberFormatException {
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
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
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
        TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
        if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
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

    @Override
    public boolean onBackPressed(boolean z) throws NumberFormatException {
        if (!this.emojiViewVisible) {
            return checkDiscard(z);
        }
        if (!z) {
            return false;
        }
        hideEmojiPopup(true);
        return false;
    }

    public boolean checkDiscard(boolean z) {
        TLRPC.MessageMedia messageMedia = this.editing;
        boolean z2 = false;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i = 0;
            for (int i2 = 0; i2 < Math.min(this.answersCount, this.answers.length); i2++) {
                if (!TextUtils.isEmpty(this.answers[i2])) {
                    i++;
                }
            }
            boolean z3 = (this.onlyAdding || TextUtils.equals(todoList.title.text, ChatAttachAlertPollLayout.getFixedString(this.questionString))) && i == todoList.list.size();
            if (z3) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (!TextUtils.equals(this.answers[i3].toString(), todoList.list.get(i3).title.text)) {
                        break;
                    }
                }
                z2 = z3;
            } else {
                z2 = z3;
            }
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.questionString));
            if (zIsEmpty) {
                for (int i4 = 0; i4 < this.answersCount && (zIsEmpty = TextUtils.isEmpty(ChatAttachAlertPollLayout.getFixedString(this.answers[i4]))); i4++) {
                }
            }
            z2 = zIsEmpty;
        }
        if (z && !z2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(this.todo ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle));
            builder.setMessage(LocaleController.getString(this.todo ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText));
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    this.f$0.lambda$checkDiscard$2(alertDialog, i5);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
        }
        return z2;
    }

    public void lambda$checkDiscard$2(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    public void setTextLeft(View view, int i) {
        int i2;
        int length;
        int i3;
        int i4;
        int length2;
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            if (i == this.questionRow) {
                CharSequence charSequence = this.questionString;
                i3 = 255;
                if (charSequence != null) {
                    length2 = charSequence.length();
                    i2 = 255;
                    length = i3 - length2;
                } else {
                    i4 = 255;
                    i2 = i4;
                    length2 = 0;
                    length = i3 - length2;
                }
            } else if (i == this.solutionRow) {
                CharSequence charSequence2 = this.solutionString;
                i3 = 200;
                if (charSequence2 != null) {
                    length2 = charSequence2.length();
                    i2 = 200;
                    length = i3 - length2;
                } else {
                    i4 = 200;
                    i2 = i4;
                    length2 = 0;
                    length = i3 - length2;
                }
            } else {
                int i5 = this.answerStartRow;
                if (i < i5 || i >= this.answersCount + i5) {
                    return;
                }
                CharSequence charSequence3 = this.answers[i - i5];
                i2 = 100;
                length = 100 - (charSequence3 != null ? charSequence3.length() : 0);
            }
            float f = i2;
            if (length <= f - (0.7f * f)) {
                pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length)));
                SimpleTextView textView2 = pollEditTextCell.getTextView2();
                int i6 = length < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
                textView2.setTextColor(Theme.getColor(i6));
                textView2.setTag(Integer.valueOf(i6));
                return;
            }
            pollEditTextCell.setText2("");
        }
    }

    public void addNewField() {
        int i;
        resetSuggestEmojiPanel();
        boolean[] zArr = this.answersChecks;
        int i2 = this.answersCount;
        zArr[i2] = false;
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
            this.listAdapter.notifyItemRemoved(this.addAnswerRow);
        }
        this.listAdapter.notifyItemInserted(this.addAnswerRow);
        updateRows();
        this.firstRequestField = false;
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
    public void onSizeChanged(int i, boolean z) throws NumberFormatException {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$animateEmojiViewTranslationY$3(f, f2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PollCreateActivity.this.emojiView.setTranslationY(f2);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        valueAnimatorOfFloat.start();
    }

    public void lambda$animateEmojiViewTranslationY$3(float f, float f2, ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public void onEmojiClicked(PollEditTextCell pollEditTextCell) throws NumberFormatException {
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

    private void openKeyboardInternal() throws NumberFormatException {
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

    private void showEmojiPopup(int i) throws NumberFormatException {
        PollEditTextCell pollEditTextCell;
        if (this.isPremium) {
            if (i == 1) {
                EmojiView emojiView = this.emojiView;
                boolean z = emojiView != null && emojiView.getVisibility() == 0;
                createEmojiView();
                this.emojiView.setVisibility(0);
                this.emojiViewWasVisible = this.emojiViewVisible;
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$showEmojiPopup$4(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PollCreateActivity.this.emojiView.setTranslationY(0.0f);
                    }
                });
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
                return;
            }
            ChatActivityEnterViewAnimatedIconView emojiButton2 = this.currentCell.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null) {
                this.emojiViewWasVisible = this.emojiViewVisible;
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

    public void lambda$showEmojiPopup$4(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onCellFocusChanges(PollEditTextCell pollEditTextCell, boolean z) throws NumberFormatException {
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

    public void hideEmojiPopup(boolean z) throws NumberFormatException {
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
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$hideEmojiPopup$5(valueAnimator);
                        }
                    });
                    this.isAnimatePopupClosing = true;
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) throws NumberFormatException {
                            PollCreateActivity.this.isAnimatePopupClosing = false;
                            PollCreateActivity.this.emojiView.setTranslationY(0.0f);
                            PollCreateActivity.this.hideEmojiView();
                        }
                    });
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    valueAnimatorOfFloat.start();
                    return;
                }
                hideEmojiView();
            }
        }
    }

    public void lambda$hideEmojiPopup$5(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void hideEmojiView() throws NumberFormatException {
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

    private void createEmojiView() throws NumberFormatException {
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

    class AnonymousClass9 implements EmojiView.EmojiViewDelegate {
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
        public void lambda$onGifSelected$1(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override
        public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override
        public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override
        public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
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
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
                editField.setText(editField.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
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
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, editField.getPaint().getFontMetricsInt());
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
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$onClearEmojiRecent$0(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }

        public void lambda$onClearEmojiRecent$0(AlertDialog alertDialog, int i) {
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

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return PollCreateActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Resources.NotFoundException {
            int i2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == PollCreateActivity.this.questionHeaderRow) {
                    if (PollCreateActivity.this.todo) {
                        i2 = PollCreateActivity.this.editing != null ? R.string.TodoEditTitle : R.string.TodoTitle;
                    } else {
                        i2 = R.string.PollQuestion;
                    }
                    headerCell.setText(LocaleController.getString(i2));
                    return;
                }
                if (i == PollCreateActivity.this.answerHeaderRow) {
                    if (PollCreateActivity.this.quizOnly == 1) {
                        headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(PollCreateActivity.this.todo ? R.string.TodoItemsTitle : R.string.AnswerOptions));
                        return;
                    }
                }
                if (i == PollCreateActivity.this.settingsHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                textCheckCell.setEnabled(!PollCreateActivity.this.onlyAdding);
                textCheckCell.getCheckBox().setAlpha(!PollCreateActivity.this.onlyAdding ? 1.0f : 0.6f);
                if (i == PollCreateActivity.this.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), PollCreateActivity.this.allowAdding, true);
                    textCheckCell.setEnabled(true, null);
                    return;
                }
                if (i == PollCreateActivity.this.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), PollCreateActivity.this.allowMarking, false);
                    textCheckCell.setEnabled(true, null);
                    return;
                }
                if (i == PollCreateActivity.this.anonymousRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollAnonymous), PollCreateActivity.this.anonymousPoll, (PollCreateActivity.this.multipleRow == -1 && PollCreateActivity.this.quizRow == -1) ? false : true);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else if (i == PollCreateActivity.this.multipleRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollMultiple), PollCreateActivity.this.multipleChoise, PollCreateActivity.this.quizRow != -1);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else {
                    if (i == PollCreateActivity.this.quizRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollQuiz), PollCreateActivity.this.quizPoll, false);
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
                int color = Theme.getColor(Theme.key_switchTrackChecked);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck), mode));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(PollCreateActivity.this.todo ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setFixedSize(0);
            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i != PollCreateActivity.this.solutionInfoRow) {
                if (i == PollCreateActivity.this.settingsSectionRow) {
                    if (PollCreateActivity.this.quizOnly != 0) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.QuizInfo));
                        return;
                    }
                }
                if (PollCreateActivity.this.maxAnswersCount - PollCreateActivity.this.answersCount <= 0) {
                    textInfoPrivacyCell.setText(LocaleController.getString(PollCreateActivity.this.todo ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                    return;
                } else if (PollCreateActivity.this.todo) {
                    textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", PollCreateActivity.this.maxAnswersCount - PollCreateActivity.this.answersCount));
                    return;
                } else {
                    textInfoPrivacyCell.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", PollCreateActivity.this.maxAnswersCount - PollCreateActivity.this.answersCount, new Object[0])));
                    return;
                }
            }
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                pollEditTextCell.setTextAndHint(PollCreateActivity.this.questionString != null ? PollCreateActivity.this.questionString : "", LocaleController.getString(PollCreateActivity.this.todo ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                pollEditTextCell.setEnabled(!PollCreateActivity.this.onlyAdding);
                pollEditTextCell.textView.setEnabled(!PollCreateActivity.this.onlyAdding);
                pollEditTextCell.textView.setTextColor(Theme.multAlpha(PollCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PollCreateActivity.this.onlyAdding ? 0.6f : 1.0f));
                PollCreateActivity.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell2.setTag(1);
                    pollEditTextCell2.setTextAndHint(PollCreateActivity.this.solutionString != null ? PollCreateActivity.this.solutionString : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell2.setTag(null);
                    PollCreateActivity.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
            pollEditTextCell3.setTag(1);
            int i = adapterPosition - PollCreateActivity.this.answerStartRow;
            boolean z = !PollCreateActivity.this.onlyAdding || i >= PollCreateActivity.this.oldAnswersCount;
            pollEditTextCell3.textView.setEnabled(z);
            pollEditTextCell3.textView.setTextColor(Theme.multAlpha(PollCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), z ? 1.0f : 0.6f));
            pollEditTextCell3.setTextAndHint(PollCreateActivity.this.answers[i], LocaleController.getString(PollCreateActivity.this.todo ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell3.setTag(null);
            ImageView imageView = pollEditTextCell3.deleteImageView;
            if (imageView != null) {
                imageView.setVisibility(z ? 0 : 8);
            }
            ImageView imageView2 = pollEditTextCell3.moveImageView;
            if (imageView2 != null) {
                imageView2.setAlpha(z ? 1.0f : 0.45f);
            }
            if (!PollCreateActivity.this.firstRequestField && PollCreateActivity.this.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                PollCreateActivity.this.firstRequestField = false;
                PollCreateActivity.this.requestFieldFocusAtPosition = -1;
            }
            PollCreateActivity.this.setTextLeft(viewHolder.itemView, adapterPosition);
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) throws NumberFormatException {
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
            if (adapterPosition == PollCreateActivity.this.questionRow || adapterPosition == PollCreateActivity.this.allowAddingRow || adapterPosition == PollCreateActivity.this.allowMarkingRow) {
                return !PollCreateActivity.this.onlyAdding;
            }
            if (PollCreateActivity.this.onlyAdding && adapterPosition >= PollCreateActivity.this.answerStartRow && adapterPosition < PollCreateActivity.this.answerStartRow + PollCreateActivity.this.answersCount) {
                return adapterPosition - PollCreateActivity.this.answerStartRow >= PollCreateActivity.this.oldAnswersCount;
            }
            if (adapterPosition == PollCreateActivity.this.addAnswerRow || adapterPosition == PollCreateActivity.this.anonymousRow || adapterPosition == PollCreateActivity.this.multipleRow) {
                return true;
            }
            return PollCreateActivity.this.quizOnly == 0 && adapterPosition == PollCreateActivity.this.quizRow;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 0) {
                View headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                shadowSectionCell = headerCell;
            } else if (i == 1) {
                shadowSectionCell = new ShadowSectionCell(this.mContext);
            } else if (i == 2) {
                shadowSectionCell = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 3) {
                View textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                shadowSectionCell = textCell;
            } else if (i == 4) {
                final PollEditTextCell pollEditTextCell = new PollEditTextCell(this.mContext, false, PollCreateActivity.this.isPremium ? 1 : 0, null) {
                    @Override
                    protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                    }

                    @Override
                    protected void onEditTextFocusChanged(boolean z) throws NumberFormatException {
                        PollCreateActivity.this.onCellFocusChanges(this, z);
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell2) throws NumberFormatException {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell2);
                    }

                    @Override
                    public boolean onPastedMultipleLines(ArrayList arrayList) {
                        if (arrayList.isEmpty()) {
                            return false;
                        }
                        this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                        int i2 = 0;
                        while (!arrayList.isEmpty() && i2 < PollCreateActivity.this.maxAnswersCount) {
                            for (int length = PollCreateActivity.this.answers.length - 1; length > i2; length--) {
                                PollCreateActivity.this.answers[length] = PollCreateActivity.this.answers[length - 1];
                            }
                            PollCreateActivity.this.answers[i2] = (CharSequence) arrayList.remove(0);
                            PollCreateActivity.access$4908(PollCreateActivity.this);
                            i2++;
                        }
                        PollCreateActivity.this.updateRows();
                        PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                        pollCreateActivity.requestFieldFocusAtPosition = (pollCreateActivity.answerStartRow + i2) - 1;
                        PollCreateActivity.this.listAdapter.notifyDataSetChanged();
                        return true;
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
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(PollCreateActivity.this.questionRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji(editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity.this.questionString = editable;
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                            pollCreateActivity.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, pollCreateActivity.questionRow);
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }
                });
                shadowSectionCell = pollEditTextCell;
            } else if (i == 6) {
                View textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                shadowSectionCell = textCheckCell;
            } else if (i != 7) {
                Context context = this.mContext;
                boolean z = PollCreateActivity.this.isPremium;
                final PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                final PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context, false, z ? 1 : 0, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) throws NumberFormatException {
                        pollCreateActivity.deleteItem(view);
                    }
                }) {
                    @Override
                    protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                        if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                            Menu menu = actionMode.getMenu();
                            if (menu.findItem(16908321) == null) {
                                return;
                            }
                            ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.getCurrentEncryptedChat(), false, true);
                        }
                    }

                    @Override
                    protected void onEditTextFocusChanged(boolean z2) throws NumberFormatException {
                        PollCreateActivity.this.onCellFocusChanges(this, z2);
                    }

                    @Override
                    protected boolean drawDivider() {
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(this);
                        if (viewHolderFindContainingViewHolder != null) {
                            int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                            if (PollCreateActivity.this.answersCount == PollCreateActivity.this.maxAnswersCount && adapterPosition == (PollCreateActivity.this.answerStartRow + PollCreateActivity.this.answersCount) - 1) {
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
                    protected void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z2) {
                        int adapterPosition;
                        if (z2 && PollCreateActivity.this.quizPoll) {
                            Arrays.fill(PollCreateActivity.this.answersChecks, false);
                            PollCreateActivity.this.listView.getChildCount();
                            for (int i2 = PollCreateActivity.this.answerStartRow; i2 < PollCreateActivity.this.answerStartRow + PollCreateActivity.this.answersCount; i2++) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(i2);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    if (view instanceof PollEditTextCell) {
                                        ((PollEditTextCell) view).setChecked(false, true);
                                    }
                                }
                            }
                        }
                        super.onCheckBoxClick(pollEditTextCell3, z2);
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell3);
                        if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                            PollCreateActivity.this.answersChecks[adapterPosition - PollCreateActivity.this.answerStartRow] = z2;
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }

                    @Override
                    protected boolean isChecked(PollEditTextCell pollEditTextCell3) {
                        int adapterPosition;
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell3);
                        if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) == -1) {
                            return false;
                        }
                        return PollCreateActivity.this.answersChecks[adapterPosition - PollCreateActivity.this.answerStartRow];
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell3) throws NumberFormatException {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell3);
                    }

                    @Override
                    public boolean onPastedMultipleLines(ArrayList arrayList) {
                        int childAdapterPosition;
                        if (arrayList.isEmpty() || (childAdapterPosition = PollCreateActivity.this.listView.getChildAdapterPosition(this) - PollCreateActivity.this.answerStartRow) < 0) {
                            return false;
                        }
                        this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                        int i2 = childAdapterPosition + 1;
                        while (!arrayList.isEmpty() && i2 < PollCreateActivity.this.maxAnswersCount) {
                            for (int length = PollCreateActivity.this.answers.length - 1; length > i2; length--) {
                                PollCreateActivity.this.answers[length] = PollCreateActivity.this.answers[length - 1];
                            }
                            PollCreateActivity.this.answers[i2] = (CharSequence) arrayList.remove(0);
                            PollCreateActivity.access$4908(PollCreateActivity.this);
                            i2++;
                        }
                        PollCreateActivity.this.updateRows();
                        PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                        pollCreateActivity2.requestFieldFocusAtPosition = (pollCreateActivity2.answerStartRow + i2) - 1;
                        PollCreateActivity.this.listAdapter.notifyDataSetChanged();
                        return true;
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
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell2);
                        if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition() - PollCreateActivity.this.answerStartRow) < 0 || adapterPosition >= PollCreateActivity.this.answers.length) {
                            return;
                        }
                        if (PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji(editable, pollEditTextCell2.getEditField().getPaint().getFontMetricsInt(), false);
                            float y = (viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight();
                            if (y > 0.0f) {
                                PollCreateActivity.this.suggestEmojiPanel.setDirection(0);
                                PollCreateActivity.this.suggestEmojiPanel.setTranslationY(y);
                            } else {
                                PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                                PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
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
                        return this.f$0.lambda$onCreateViewHolder$0(pollEditTextCell2, textView2, i2, keyEvent);
                    }
                });
                textView.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                        return PollCreateActivity.ListAdapter.lambda$onCreateViewHolder$1(pollEditTextCell2, view, i2, keyEvent);
                    }
                });
                shadowSectionCell = pollEditTextCell2;
            } else {
                final PollEditTextCell pollEditTextCell3 = new PollEditTextCell(this.mContext, false, PollCreateActivity.this.isPremium ? 1 : 0, null) {
                    @Override
                    protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                        if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                            Menu menu = actionMode.getMenu();
                            if (menu.findItem(16908321) == null) {
                                return;
                            }
                            ChatActivity.fillActionModeMenu(menu, PollCreateActivity.this.parentFragment.getCurrentEncryptedChat(), false, true);
                        }
                    }

                    @Override
                    public void lambda$new$1(PollEditTextCell pollEditTextCell4) throws NumberFormatException {
                        PollCreateActivity.this.onEmojiClicked(pollEditTextCell4);
                    }

                    @Override
                    protected void onEditTextFocusChanged(boolean z2) throws NumberFormatException {
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
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(PollCreateActivity.this.questionRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null && PollCreateActivity.this.suggestEmojiPanel != null) {
                            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan);
                            }
                            Emoji.replaceEmoji(editable, pollEditTextCell3.getEditField().getPaint().getFontMetricsInt(), false);
                            PollCreateActivity.this.suggestEmojiPanel.setDirection(1);
                            PollCreateActivity.this.suggestEmojiPanel.setDelegate(pollEditTextCell3);
                            PollCreateActivity.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                            PollCreateActivity.this.suggestEmojiPanel.fireUpdate();
                        }
                        PollCreateActivity.this.solutionString = editable;
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                            pollCreateActivity2.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, pollCreateActivity2.solutionRow);
                        }
                        PollCreateActivity.this.checkDoneButton();
                    }
                });
                shadowSectionCell = pollEditTextCell3;
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        public boolean lambda$onCreateViewHolder$0(PollEditTextCell pollEditTextCell, TextView textView, int i, KeyEvent keyEvent) {
            int adapterPosition;
            if (i != 5) {
                return false;
            }
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = PollCreateActivity.this.listView.findContainingViewHolder(pollEditTextCell);
            if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                int i2 = adapterPosition - PollCreateActivity.this.answerStartRow;
                if (i2 != PollCreateActivity.this.answersCount - 1 || PollCreateActivity.this.answersCount >= PollCreateActivity.this.maxAnswersCount) {
                    if (i2 != PollCreateActivity.this.answersCount - 1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = PollCreateActivity.this.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
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

        public static boolean lambda$onCreateViewHolder$1(PollEditTextCell pollEditTextCell, View view, int i, KeyEvent keyEvent) {
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
            return (i == PollCreateActivity.this.anonymousRow || i == PollCreateActivity.this.multipleRow || i == PollCreateActivity.this.quizRow || i == PollCreateActivity.this.allowAddingRow || i == PollCreateActivity.this.allowMarkingRow) ? 6 : 5;
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
            if (PollCreateActivity.this.answerIds != null) {
                int i5 = PollCreateActivity.this.answerIds[i3];
                PollCreateActivity.this.answerIds[i3] = PollCreateActivity.this.answerIds[i4];
                PollCreateActivity.this.answerIds[i4] = i5;
            }
            boolean z = PollCreateActivity.this.answersChecks[i3];
            PollCreateActivity.this.answersChecks[i3] = PollCreateActivity.this.answersChecks[i4];
            PollCreateActivity.this.answersChecks[i4] = z;
            notifyItemMoved(i, i2);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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

    @Override
    protected boolean hideKeyboardOnShow() {
        return this.requestFieldFocusAtPosition < 0;
    }

    public void deleteItem(android.view.View r10) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PollCreateActivity.deleteItem(android.view.View):void");
    }
}
