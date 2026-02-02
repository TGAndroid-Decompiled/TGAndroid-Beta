package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
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
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.IOException;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    private int addAnswerRow;
    private boolean allowAdding;
    private int allowAddingRow;
    private boolean allowMarking;
    private int allowMarkingRow;
    private boolean allowNesterScroll;
    private boolean anonymousPoll;
    private int anonymousRow;
    private int answerHeaderRow;
    private int answerSectionRow;
    private int answerStartRow;
    private CharSequence[] answers;
    private boolean[] answersChecks;
    private int answersCount;
    private PollEditTextCell currentCell;
    private PollCreateActivityDelegate delegate;
    private boolean destroyed;
    private boolean doneItemEnabled;
    private int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private int emptyRow;
    private boolean hintShowed;
    private HintView hintView;
    private boolean ignoreLayout;
    private boolean isAnimatePopupClosing;
    public boolean isEmojiSearchOpened;
    private boolean isPremium;
    private DefaultItemAnimator itemAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private FillLastLinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private final int maxAnswersCount;
    private boolean multipleChoise;
    private int multipleRow;
    private final Runnable openKeyboardRunnable;
    private int paddingRow;
    private int questionHeaderRow;
    private int questionRow;
    private int questionSectionRow;
    private CharSequence questionString;
    private int quizOnly;
    private boolean quizPoll;
    private int quizRow;
    private int requestFieldFocusAtPosition;
    private int rowCount;
    private int settingsHeaderRow;
    private int settingsSectionRow;
    private int solutionInfoRow;
    private int solutionRow;
    private CharSequence solutionString;
    private SuggestEmojiView suggestEmojiPanel;
    private final boolean todo;
    private int topPadding;
    private boolean waitingForKeyboardOpen;
    public boolean wasEmojiSearchOpened;

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia, HashMap map, boolean z, int i, long j);
    }

    @Override
    public boolean hasDoneItem() {
        return true;
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    static int access$2208(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
        int i = chatAttachAlertPollLayout.answersCount;
        chatAttachAlertPollLayout.answersCount = i + 1;
        return i;
    }

    static int access$2210(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
        int i = chatAttachAlertPollLayout.answersCount;
        chatAttachAlertPollLayout.answersCount = i - 1;
        return i;
    }

    private static class EmptyView extends View {
        public EmptyView(Context context) {
            super(context);
        }
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
            ChatAttachAlertPollLayout.this.listAdapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                ChatAttachAlertPollLayout.this.listView.setItemAnimator(ChatAttachAlertPollLayout.this.itemAnimator);
                ChatAttachAlertPollLayout.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                viewHolder.itemView.setBackgroundColor(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_dialogBackground));
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
            viewHolder.itemView.setBackground(null);
        }
    }

    public ChatAttachAlertPollLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.answersCount = 1;
        this.anonymousPoll = true;
        this.allowAdding = true;
        this.allowMarking = true;
        this.requestFieldFocusAtPosition = -1;
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if (ChatAttachAlertPollLayout.this.currentCell != null) {
                    EditTextBoldCursor editField = ChatAttachAlertPollLayout.this.currentCell.getEditField();
                    if (ChatAttachAlertPollLayout.this.destroyed || editField == null || !ChatAttachAlertPollLayout.this.waitingForKeyboardOpen || ChatAttachAlertPollLayout.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(ChatAttachAlertPollLayout.this.openKeyboardRunnable);
                    AndroidUtilities.runOnUIThread(ChatAttachAlertPollLayout.this.openKeyboardRunnable, 100L);
                }
            }
        };
        this.isEmojiSearchOpened = false;
        this.wasEmojiSearchOpened = false;
        this.todo = z;
        int answersMaxCount = getAnswersMaxCount();
        this.maxAnswersCount = answersMaxCount;
        this.answers = new CharSequence[answersMaxCount];
        this.answersChecks = new boolean[answersMaxCount];
        updateRows();
        this.isPremium = AccountInstance.getInstance(this.parentAlert.currentAccount).getUserConfig().isPremium();
        this.parentAlert.sizeNotifierFrameLayout.setDelegate(this);
        this.listAdapter = new ListAdapter(context);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            protected void requestChildOnScreen(View view, View view2) {
                if (view instanceof PollEditTextCell) {
                    super.requestChildOnScreen(view, view2);
                }
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, android.graphics.Rect rect, boolean z2) {
                rect.bottom += AndroidUtilities.dp(60.0f);
                return super.requestChildRectangleOnScreen(view, rect, z2);
            }
        };
        this.listView = recyclerListView;
        ViewGroup containerView = chatAttachAlert.getContainerView();
        RecyclerListView recyclerListView2 = this.listView;
        Objects.requireNonNull(recyclerListView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView, containerView, new ChatAttachAlertQuickRepliesLayout$$ExternalSyntheticLambda1(recyclerListView2));
        this.occupyNavigationBar = true;
        RecyclerListView recyclerListView3 = this.listView;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getAdapterPosition() == 0) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                    chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, 0);
                }
            }
        };
        this.itemAnimator = defaultItemAnimator;
        recyclerListView3.setItemAnimator(defaultItemAnimator);
        this.itemAnimator.setSupportsChangeAnimations(false);
        this.itemAnimator.setDelayAnimations(false);
        this.itemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.itemAnimator.setDurations(350L);
        this.listView.setClipToPadding(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setSections();
        RecyclerListView recyclerListView4 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(53.0f), this.listView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - (ChatAttachAlertPollLayout.this.topPadding - AndroidUtilities.dp(7.0f));
                    }

                    @Override
                    protected int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }

            @Override
            protected int[] getChildRectangleOnScreenScrollAmount(View view, android.graphics.Rect rect) {
                int height = getHeight() - getPaddingBottom();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int iHeight = rect.height() + top;
                int iMin = Math.min(0, top);
                int iMax = Math.max(0, iHeight - height);
                if (iMin == 0) {
                    iMin = Math.min(top, iMax);
                }
                return new int[]{0, iMin};
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView4.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.setSkipFirstItem();
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(this.listView);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setPreserveFocusAfterLayout(true);
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                this.f$0.lambda$new$0(view, i);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, i2);
                if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel.isShown()) {
                    SuggestEmojiView.AnchorViewDelegate delegate = ChatAttachAlertPollLayout.this.suggestEmojiPanel.getDelegate();
                    if (delegate instanceof PollEditTextCell) {
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder((PollEditTextCell) delegate);
                        if (viewHolderFindContainingViewHolder == null) {
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                        } else {
                            int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel.getDirection() == 0) {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY((viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight());
                            } else {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
                            }
                            if (adapterPosition < ChatAttachAlertPollLayout.this.layoutManager.findFirstVisibleItemPosition() || adapterPosition > ChatAttachAlertPollLayout.this.layoutManager.findLastVisibleItemPosition()) {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                            }
                        }
                    } else {
                        ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                    }
                }
                if (i2 == 0 || ChatAttachAlertPollLayout.this.hintView == null) {
                    return;
                }
                ChatAttachAlertPollLayout.this.hintView.hide();
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerListView.Holder holder;
                if (i == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = ChatAttachAlertPollLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertPollLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(1)) == null || holder.itemView.getTop() <= AndroidUtilities.dp(53.0f)) {
                        return;
                    }
                    ChatAttachAlertPollLayout.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(53.0f));
                }
            }
        });
        HintView hintView = new HintView(context, 4);
        this.hintView = hintView;
        hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            SuggestEmojiView suggestEmojiView = new SuggestEmojiView(context, this.parentAlert.currentAccount, null, resourcesProvider) {
                @Override
                protected int emojiCacheType() {
                    return 3;
                }
            };
            this.suggestEmojiPanel = suggestEmojiView;
            suggestEmojiView.forbidCopy();
            this.suggestEmojiPanel.forbidSetAsStatus();
            this.suggestEmojiPanel.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(this.suggestEmojiPanel, LayoutHelper.createFrame(-2, 160, 51));
        }
        this.keyboardNotifier = new KeyboardNotifier(this.parentAlert.sizeNotifierFrameLayout, null);
        checkDoneButton();
    }

    public void lambda$new$0(View view, int i) {
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
            } else {
                int i2 = this.allowAddingRow;
                if (i == i2) {
                    z = !this.allowAdding;
                    this.allowAdding = z;
                } else if (i == this.allowMarkingRow) {
                    boolean z3 = !this.allowMarking;
                    this.allowMarking = z3;
                    updateRows();
                    int i3 = this.allowAddingRow;
                    if (i3 >= 0 && i2 < 0) {
                        this.listView.setItemAnimator(this.itemAnimator);
                        this.listAdapter.notifyItemInserted(this.allowAddingRow);
                    } else if (i2 >= 0 && i3 < 0) {
                        this.listView.setItemAnimator(this.itemAnimator);
                        this.listAdapter.notifyItemRemoved(i2);
                    }
                    z = z3;
                } else if (i == this.multipleRow) {
                    boolean z4 = this.multipleChoise;
                    boolean z5 = !z4;
                    this.multipleChoise = z5;
                    if (!z4 && this.quizPoll) {
                        int i4 = this.solutionRow;
                        this.quizPoll = false;
                        updateRows();
                        this.listView.setItemAnimator(this.itemAnimator);
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.quizRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            ((TextCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView).setChecked(false);
                        } else {
                            this.listAdapter.notifyItemChanged(this.quizRow);
                        }
                        this.listAdapter.notifyItemRangeRemoved(i4, 2);
                        this.listAdapter.notifyItemChanged(this.emptyRow);
                    }
                    z = z5;
                } else {
                    if (this.quizOnly != 0) {
                        return;
                    }
                    this.listView.setItemAnimator(this.itemAnimator);
                    z = !this.quizPoll;
                    this.quizPoll = z;
                    int i5 = this.solutionRow;
                    updateRows();
                    if (this.quizPoll) {
                        this.listAdapter.notifyItemRangeInserted(this.solutionRow, 2);
                    } else {
                        this.listAdapter.notifyItemRangeRemoved(i5, 2);
                    }
                    this.listAdapter.notifyItemChanged(this.emptyRow);
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
                        int i6 = 0;
                        boolean z6 = false;
                        while (true) {
                            boolean[] zArr = this.answersChecks;
                            if (i6 >= zArr.length) {
                                break;
                            }
                            if (z6) {
                                zArr[i6] = false;
                            } else if (zArr[i6]) {
                                z6 = true;
                            }
                            i6++;
                        }
                    }
                }
            }
            if (this.hintShowed && !this.quizPoll) {
                this.hintView.hide();
            }
            this.listView.getChildCount();
            for (int i7 = this.answerStartRow; i7 < this.answerStartRow + this.answersCount; i7++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(i7);
                if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                    View view2 = viewHolderFindViewHolderForAdapterPosition3.itemView;
                    if (view2 instanceof PollEditTextCell) {
                        PollEditTextCell pollEditTextCell = (PollEditTextCell) view2;
                        pollEditTextCell.setShowCheckBox(this.quizPoll, true);
                        pollEditTextCell.setChecked(this.answersChecks[i7 - this.answerStartRow], z2);
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
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
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
    public void onHideShowProgress(float f) {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public void onMenuItemClick(int i) throws IOException {
        if (i != 40) {
            return;
        }
        if (this.todo) {
            CharSequence[] charSequenceArr = {getFixedString(this.questionString)};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence = charSequenceArr[0];
            if (entities != null) {
                int size = entities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i2);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
            }
            final TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
            TLRPC.TodoList todoList = new TLRPC.TodoList();
            tL_messageMediaToDo.todo = todoList;
            boolean z = this.allowMarking;
            todoList.others_can_append = z && this.allowAdding;
            todoList.others_can_complete = z;
            todoList.title = new TLRPC.TL_textWithEntities();
            tL_messageMediaToDo.todo.title.text = charSequence.toString();
            tL_messageMediaToDo.todo.title.entities = entities;
            int i3 = 0;
            while (true) {
                CharSequence[] charSequenceArr2 = this.answers;
                if (i3 < charSequenceArr2.length) {
                    if (!TextUtils.isEmpty(getFixedString(charSequenceArr2[i3]))) {
                        CharSequence[] charSequenceArr3 = {getFixedString(this.answers[i3])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr3, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (entities2 != null) {
                            int size2 = entities2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i4);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = entities2;
                        todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                    i3++;
                } else {
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    final ChatActivity chatActivity = (ChatActivity) chatAttachAlert.baseFragment;
                    AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$onMenuItemClick$2(chatActivity, tL_messageMediaToDo, (Long) obj);
                        }
                    });
                    return;
                }
            }
        } else {
            if (this.quizPoll && !this.doneItemEnabled) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.answersChecks.length; i6++) {
                    if (!TextUtils.isEmpty(getFixedString(this.answers[i6])) && this.answersChecks[i6]) {
                        i5++;
                    }
                }
                if (i5 <= 0) {
                    showQuizHint();
                    return;
                }
                return;
            }
            CharSequence[] charSequenceArr4 = {getFixedString(this.questionString)};
            ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr4, true);
            CharSequence charSequence3 = charSequenceArr4[0];
            if (entities3 != null) {
                int size3 = entities3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    TLRPC.MessageEntity messageEntity3 = entities3.get(i7);
                    if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                        messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                    }
                }
            }
            final TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
            TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
            tL_messageMediaPoll.poll = tL_poll;
            tL_poll.multiple_choice = this.multipleChoise;
            tL_poll.quiz = this.quizPoll;
            tL_poll.public_voters = !this.anonymousPoll;
            tL_poll.question = new TLRPC.TL_textWithEntities();
            tL_messageMediaPoll.poll.question.text = charSequence3.toString();
            tL_messageMediaPoll.poll.question.entities = entities3;
            SerializedData serializedData = new SerializedData(this.maxAnswersCount);
            int i8 = 0;
            while (true) {
                CharSequence[] charSequenceArr5 = this.answers;
                if (i8 >= charSequenceArr5.length) {
                    break;
                }
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr5[i8]))) {
                    CharSequence[] charSequenceArr6 = {getFixedString(this.answers[i8])};
                    ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr6, true);
                    CharSequence charSequence4 = charSequenceArr6[0];
                    if (entities4 != null) {
                        int size4 = entities4.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i9);
                            if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                            }
                        }
                    }
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_pollAnswer.text = tL_textWithEntities2;
                    tL_textWithEntities2.text = charSequence4.toString();
                    tL_pollAnswer.text.entities = entities4;
                    tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    if ((this.multipleChoise || this.quizPoll) && this.answersChecks[i8]) {
                        serializedData.writeByte(tL_pollAnswer.option[0]);
                    }
                }
                i8++;
            }
            final HashMap map = new HashMap();
            map.put("answers", Utilities.bytesToHex(serializedData.toByteArray()));
            tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
            CharSequence fixedString = getFixedString(this.solutionString);
            if (fixedString != null) {
                tL_messageMediaPoll.results.solution = fixedString.toString();
                ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                if (entities5 != null && !entities5.isEmpty()) {
                    tL_messageMediaPoll.results.solution_entities = entities5;
                }
                if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                    tL_messageMediaPoll.results.flags |= 16;
                }
            }
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            final ChatActivity chatActivity2 = (ChatActivity) chatAttachAlert2.baseFragment;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert2.currentAccount, chatAttachAlert2.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onMenuItemClick$4(chatActivity2, tL_messageMediaPoll, map, (Long) obj);
                }
            });
        }
    }

    public void lambda$onMenuItemClick$2(ChatActivity chatActivity, final TLRPC.TL_messageMediaToDo tL_messageMediaToDo, final Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i, int i2) {
                    this.f$0.lambda$onMenuItemClick$1(tL_messageMediaToDo, l, z, i, i2);
                }
            });
        } else {
            this.delegate.sendPoll(tL_messageMediaToDo, null, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onMenuItemClick$1(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaToDo, null, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public void lambda$onMenuItemClick$4(ChatActivity chatActivity, final TLRPC.TL_messageMediaPoll tL_messageMediaPoll, final HashMap map, final Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i, int i2) {
                    this.f$0.lambda$onMenuItemClick$3(tL_messageMediaPoll, map, l, z, i, i2);
                }
            });
        } else {
            this.delegate.sendPoll(tL_messageMediaPoll, map, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onMenuItemClick$3(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, HashMap map, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaPoll, map, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        if (this.listView.getChildCount() <= 1 || (childAt = this.listView.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int y = ((int) childAt.getY()) - AndroidUtilities.dp(8.0f);
        int i = (y <= 0 || holder == null || holder.getAdapterPosition() != 1) ? 0 : y;
        if (y < 0 || holder == null || holder.getAdapterPosition() != 1) {
            y = i;
        }
        return y + AndroidUtilities.dp(12.0f);
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(17.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override
    public int getListTopPadding() {
        return this.topPadding;
    }

    @Override
    public void onPreMeasure(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPollLayout.onPreMeasure(int, int):void");
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(1);
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

    public static CharSequence getFixedString(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence);
        while (TextUtils.indexOf(trimmedString, "\n\n\n") >= 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(trimmedString, "\n\n\n") == 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return trimmedString;
    }

    private void showQuizHint() {
        for (int i = this.answerStartRow; i < this.answerStartRow + this.answersCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                    if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
                        if (suggestEmojiView != null) {
                            suggestEmojiView.forceClose();
                        }
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
        int i;
        if (this.quizPoll) {
            i = 0;
            for (int i2 = 0; i2 < this.answersChecks.length; i2++) {
                if (!TextUtils.isEmpty(getFixedString(this.answers[i2])) && this.answersChecks[i2]) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        boolean z = (TextUtils.isEmpty(getFixedString(this.solutionString)) || this.solutionString.length() <= 200) && !TextUtils.isEmpty(getFixedString(this.questionString)) && this.questionString.length() <= 255;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            CharSequence[] charSequenceArr = this.answers;
            if (i3 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i3]))) {
                if (this.answers[i3].length() > 100) {
                    i4 = 0;
                    z2 = true;
                    break;
                } else {
                    i4++;
                    z2 = true;
                }
            }
            i3++;
        }
        if (i4 < (this.todo ? 1 : 2) || (this.quizPoll && i < 1)) {
            z = false;
        }
        if (!TextUtils.isEmpty(this.solutionString) || !TextUtils.isEmpty(this.questionString) || z2) {
            this.allowNesterScroll = false;
        } else {
            this.allowNesterScroll = true;
        }
        this.parentAlert.setAllowNestedScroll(this.allowNesterScroll);
        this.doneItemEnabled = z;
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public boolean isDoneItemEnabled() {
        return this.doneItemEnabled;
    }

    public void updateRows() {
        this.solutionRow = -1;
        this.solutionInfoRow = -1;
        this.multipleRow = -1;
        this.anonymousRow = -1;
        this.quizRow = -1;
        this.allowAddingRow = -1;
        this.allowMarkingRow = -1;
        this.addAnswerRow = -1;
        this.answerStartRow = -1;
        this.settingsSectionRow = -1;
        this.paddingRow = 0;
        this.questionHeaderRow = 1;
        this.questionRow = 2;
        this.questionSectionRow = 3;
        this.rowCount = 5;
        this.answerHeaderRow = 4;
        int i = this.answersCount;
        if (i != 0) {
            this.answerStartRow = 5;
            this.rowCount = 5 + i;
        }
        if (i != this.answers.length) {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.addAnswerRow = i2;
        }
        int i3 = this.rowCount;
        this.answerSectionRow = i3;
        int i4 = i3 + 2;
        this.rowCount = i4;
        this.settingsHeaderRow = i3 + 1;
        if (this.todo) {
            int i5 = i3 + 3;
            this.rowCount = i5;
            this.allowMarkingRow = i4;
            if (this.allowMarking) {
                this.rowCount = i3 + 4;
                this.allowAddingRow = i5;
            }
        } else {
            TLRPC.Chat currentChat = ((ChatActivity) this.parentAlert.baseFragment).getCurrentChat();
            if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
                int i6 = this.rowCount;
                this.rowCount = i6 + 1;
                this.anonymousRow = i6;
            }
            int i7 = this.quizOnly;
            if (i7 != 1) {
                int i8 = this.rowCount;
                this.rowCount = i8 + 1;
                this.multipleRow = i8;
            }
            if (i7 == 0) {
                int i9 = this.rowCount;
                this.rowCount = i9 + 1;
                this.quizRow = i9;
            }
            int i10 = this.rowCount;
            int i11 = i10 + 1;
            this.rowCount = i11;
            this.settingsSectionRow = i10;
            if (this.quizPoll) {
                this.solutionRow = i11;
                this.rowCount = i10 + 3;
                this.solutionInfoRow = i10 + 2;
            }
        }
        int i12 = this.rowCount;
        this.rowCount = i12 + 1;
        this.emptyRow = i12;
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        try {
            this.parentAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.todo) {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.quizOnly == 1) {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        this.parentAlert.updateDoneItemEnabled();
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.destroyed = true;
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                this.parentAlert.sizeNotifierFrameLayout.removeView(emojiView);
            }
        }
    }

    @Override
    public void onHidden() {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public boolean onBackPressed() {
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        }
        if (checkDiscard()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override
    public boolean onDismissWithTouchOutside() {
        if (checkDiscard()) {
            return super.onDismissWithTouchOutside();
        }
        return false;
    }

    private boolean checkDiscard() {
        boolean zIsEmpty = TextUtils.isEmpty(getFixedString(this.questionString));
        if (zIsEmpty) {
            for (int i = 0; i < this.answersCount && (zIsEmpty = TextUtils.isEmpty(getFixedString(this.answers[i]))); i++) {
            }
        }
        if (!zIsEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.parentAlert.baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString(this.todo ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle));
            builder.setMessage(LocaleController.getString(this.todo ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText));
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$checkDiscard$5(alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
        return zIsEmpty;
    }

    public void lambda$checkDiscard$5(AlertDialog alertDialog, int i) {
        this.parentAlert.lambda$new$0();
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    public void setTextLeft(View view, int i) {
        int length;
        int i2;
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            if (i == this.questionRow) {
                i2 = this.todo ? getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = this.questionString;
                length = i2 - (charSequence != null ? charSequence.length() : 0);
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
                int i5 = this.todo ? getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence3 = this.answers[i4];
                int i6 = i5;
                length = i5 - (charSequence3 != null ? charSequence3.length() : 0);
                i2 = i6;
            }
            float f = i2;
            if (length <= f - (0.7f * f)) {
                pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length)));
                SimpleTextView textView2 = pollEditTextCell.getTextView2();
                int i7 = length < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
                textView2.setTextColor(getThemedColor(i7));
                textView2.setTag(Integer.valueOf(i7));
                return;
            }
            pollEditTextCell.setText2("");
        }
    }

    public void addNewField() {
        resetSuggestEmojiPanel();
        this.listView.setItemAnimator(this.itemAnimator);
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
        this.listAdapter.notifyItemChanged(this.emptyRow);
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
                int iDp = z ? this.keyboardHeightLand : this.keyboardHeight;
                if (this.isEmojiSearchOpened) {
                    iDp += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
                int i2 = layoutParams.width;
                int i3 = AndroidUtilities.displaySize.x;
                if (i2 != i3 || layoutParams.height != iDp || this.wasEmojiSearchOpened != this.isEmojiSearchOpened) {
                    layoutParams.width = i3;
                    layoutParams.height = iDp + AndroidUtilities.navigationBarHeight;
                    this.emojiView.setLayoutParams(layoutParams);
                    this.emojiPadding = layoutParams.height;
                    this.keyboardNotifier.fire();
                    this.parentAlert.sizeNotifierFrameLayout.requestLayout();
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
                this.parentAlert.sizeNotifierFrameLayout.requestLayout();
            }
            if (this.keyboardVisible && this.waitingForKeyboardOpen) {
                this.waitingForKeyboardOpen = false;
                AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            }
        }
    }

    public boolean isWaitingForKeyboardOpen() {
        return this.waitingForKeyboardOpen;
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
        if (this.currentCell != null) {
            this.keyboardNotifier.awaitKeyboard();
            EditTextBoldCursor editField = this.currentCell.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        showEmojiPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
    }

    private void showEmojiPopup(int i) {
        ChatActivityEnterViewAnimatedIconView emojiButton;
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
                android.graphics.Point point = AndroidUtilities.displaySize;
                int i2 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
                layoutParams.height = AndroidUtilities.navigationBarHeight + i2;
                emojiView2.setLayoutParams(layoutParams);
                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (pollEditTextCell = this.currentCell) != null) {
                    AndroidUtilities.hideKeyboard(pollEditTextCell.getEditField());
                }
                this.emojiPadding = i2;
                this.keyboardNotifier.fire();
                this.parentAlert.sizeNotifierFrameLayout.requestLayout();
                PollEditTextCell pollEditTextCell2 = this.currentCell;
                emojiButton = pollEditTextCell2 != null ? pollEditTextCell2.getEmojiButton() : null;
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
                        this.f$0.lambda$showEmojiPopup$6(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                    }
                });
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
                return;
            }
            PollEditTextCell pollEditTextCell3 = this.currentCell;
            emojiButton = pollEditTextCell3 != null ? pollEditTextCell3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
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
            this.parentAlert.sizeNotifierFrameLayout.requestLayout();
        }
    }

    public void lambda$showEmojiPopup$6(ValueAnimator valueAnimator) {
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
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$hideEmojiPopup$7(valueAnimator);
                        }
                    });
                    this.isAnimatePopupClosing = true;
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlertPollLayout.this.isAnimatePopupClosing = false;
                            ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                            ChatAttachAlertPollLayout.this.hideEmojiView();
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

    public void lambda$hideEmojiPopup$7(ValueAnimator valueAnimator) {
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

    public boolean isAnimatePopupClosing() {
        return this.isAnimatePopupClosing;
    }

    public boolean isPopupShowing() {
        return this.emojiViewVisible;
    }

    public boolean isPopupVisible() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getVisibility() == 0;
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    private void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.parentAlert.sizeNotifierFrameLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), true, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.emojiCacheType = 3;
        emojiView2.shouldLightenBackground = false;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.setShouldDrawBackground(false);
        this.emojiView.allowEmojisForNonPremium(false);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass9());
        this.parentAlert.sizeNotifierFrameLayout.addView(this.emojiView);
        this.emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
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
            EditTextBoldCursor editField;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
                return false;
            }
            editField.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onEmojiSelected(String str) {
            EditTextBoldCursor editField;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
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
            EditTextBoldCursor editField;
            AnimatedEmojiSpan animatedEmojiSpan;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
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
                animatedEmojiSpan.cacheType = 3;
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
            AlertDialog.Builder builder = new AlertDialog.Builder(ChatAttachAlertPollLayout.this.getContext(), ChatAttachAlertPollLayout.this.resourcesProvider);
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
            ChatAttachAlertPollLayout.this.emojiView.clearRecentEmoji();
        }

        @Override
        public void onSearchOpenClose(int i) {
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            chatAttachAlertPollLayout.isEmojiSearchOpened = i != 0;
            chatAttachAlertPollLayout.parentAlert.sizeNotifierFrameLayout.requestLayout();
        }

        @Override
        public boolean isSearchOpened() {
            return ChatAttachAlertPollLayout.this.isEmojiSearchOpened;
        }
    }

    private void animateEmojiViewTranslationY(final float f, final float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$animateEmojiViewTranslationY$8(f, f2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatAttachAlertPollLayout.this.emojiView.setTranslationY(f2);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        valueAnimatorOfFloat.start();
    }

    public void lambda$animateEmojiViewTranslationY$8(float f, float f2, ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ChatAttachAlertPollLayout.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Resources.NotFoundException {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.questionHeaderRow) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitle : R.string.PollQuestion));
                    return;
                }
                headerCell.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i == ChatAttachAlertPollLayout.this.answerHeaderRow) {
                    if (ChatAttachAlertPollLayout.this.quizOnly == 1) {
                        headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoItemsTitle : R.string.AnswerOptions));
                        return;
                    }
                }
                if (i == ChatAttachAlertPollLayout.this.settingsHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), ChatAttachAlertPollLayout.this.allowAdding, ChatAttachAlertPollLayout.this.allowMarkingRow != -1);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), ChatAttachAlertPollLayout.this.allowMarking, false);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.anonymousRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollAnonymous), ChatAttachAlertPollLayout.this.anonymousPoll, (ChatAttachAlertPollLayout.this.multipleRow == -1 && ChatAttachAlertPollLayout.this.quizRow == -1) ? false : true);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.multipleRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollMultiple), ChatAttachAlertPollLayout.this.multipleChoise, ChatAttachAlertPollLayout.this.quizRow != -1);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.quizRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollQuiz), ChatAttachAlertPollLayout.this.quizPoll, false);
                    textCheckCell.setEnabled(ChatAttachAlertPollLayout.this.quizOnly == 0, null);
                }
            } else if (itemViewType != 9) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        return;
                    }
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
                    Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                    int themedColor = ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_switchTrackChecked);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_checkboxCheck), mode));
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                if (i != ChatAttachAlertPollLayout.this.solutionInfoRow) {
                    if (i == ChatAttachAlertPollLayout.this.settingsSectionRow) {
                        if (ChatAttachAlertPollLayout.this.quizOnly != 0) {
                            textInfoPrivacyCell.setText(null);
                            return;
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.QuizInfo));
                            return;
                        }
                    }
                    if (ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount <= 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                        return;
                    } else if (ChatAttachAlertPollLayout.this.todo) {
                        textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount, new Object[0])));
                        return;
                    }
                }
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            viewHolder.itemView.requestLayout();
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                pollEditTextCell.setTextAndHint(ChatAttachAlertPollLayout.this.questionString != null ? ChatAttachAlertPollLayout.this.questionString : "", LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell2.setTag(1);
                    pollEditTextCell2.setTextAndHint(ChatAttachAlertPollLayout.this.solutionString != null ? ChatAttachAlertPollLayout.this.solutionString : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell2.setTag(null);
                    ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
            pollEditTextCell3.setTag(1);
            pollEditTextCell3.setTextAndHint(ChatAttachAlertPollLayout.this.answers[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow], LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell3.setTag(null);
            if (ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition = -1;
            }
            ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, adapterPosition);
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 5) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
                    if (ChatAttachAlertPollLayout.this.isPremium) {
                        if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                        }
                        ChatAttachAlertPollLayout.this.hideEmojiPopup(true);
                    }
                    ChatAttachAlertPollLayout.this.currentCell = null;
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == ChatAttachAlertPollLayout.this.addAnswerRow || adapterPosition == ChatAttachAlertPollLayout.this.anonymousRow || adapterPosition == ChatAttachAlertPollLayout.this.multipleRow || (ChatAttachAlertPollLayout.this.quizOnly == 0 && adapterPosition == ChatAttachAlertPollLayout.this.quizRow);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View headerCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 1:
                    View shadowSectionCell = new ShadowSectionCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                    headerCell = shadowSectionCell;
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 4:
                    Context context = this.mContext;
                    boolean z = ChatAttachAlertPollLayout.this.isPremium;
                    Theme.ResourcesProvider resourcesProvider = ChatAttachAlertPollLayout.this.resourcesProvider;
                    final PollEditTextCell pollEditTextCell = new PollEditTextCell(context, false, z ? 1 : 0, null, resourcesProvider) {
                        @Override
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        protected void onEditTextFocusChanged(boolean z2) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z2);
                        }

                        @Override
                        public void lambda$new$1(PollEditTextCell pollEditTextCell2) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell2);
                        }

                        @Override
                        public boolean onPastedMultipleLines(ArrayList arrayList) {
                            if (arrayList.isEmpty()) {
                                return false;
                            }
                            this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                            int i2 = 0;
                            while (!arrayList.isEmpty() && i2 < ChatAttachAlertPollLayout.this.maxAnswersCount) {
                                for (int length = ChatAttachAlertPollLayout.this.answers.length - 1; length > i2; length--) {
                                    ChatAttachAlertPollLayout.this.answers[length] = ChatAttachAlertPollLayout.this.answers[length - 1];
                                }
                                ChatAttachAlertPollLayout.this.answers[i2] = (CharSequence) arrayList.remove(0);
                                ChatAttachAlertPollLayout.access$2208(ChatAttachAlertPollLayout.this);
                                i2++;
                            }
                            ChatAttachAlertPollLayout.this.updateRows();
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout.requestFieldFocusAtPosition = (chatAttachAlertPollLayout.answerStartRow + i2) - 1;
                            ChatAttachAlertPollLayout.this.listView.setItemAnimator(ChatAttachAlertPollLayout.this.itemAnimator);
                            ChatAttachAlertPollLayout.this.listAdapter.notifyDataSetChanged();
                            return true;
                        }
                    };
                    pollEditTextCell.createErrorTextView();
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
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.questionRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.questionString = editable;
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.questionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    headerCell = pollEditTextCell;
                    break;
                case 5:
                default:
                    Context context2 = this.mContext;
                    boolean z2 = ChatAttachAlertPollLayout.this.isPremium;
                    final PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context2, false, z2 ? 1 : 0, new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            this.f$0.lambda$onCreateViewHolder$0(view2);
                        }
                    }, ChatAttachAlertPollLayout.this.resourcesProvider) {
                        @Override
                        protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), true, true);
                            }
                        }

                        @Override
                        protected boolean drawDivider() {
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(this);
                            if (viewHolderFindContainingViewHolder != null) {
                                int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                                if (ChatAttachAlertPollLayout.this.answersCount == ChatAttachAlertPollLayout.this.maxAnswersCount && adapterPosition == (ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answersCount) - 1) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        @Override
                        protected boolean shouldShowCheckBox() {
                            return ChatAttachAlertPollLayout.this.quizPoll;
                        }

                        @Override
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        protected void onEditTextFocusChanged(boolean z3) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z3);
                        }

                        @Override
                        protected void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z3) {
                            int adapterPosition;
                            if (z3 && ChatAttachAlertPollLayout.this.quizPoll) {
                                Arrays.fill(ChatAttachAlertPollLayout.this.answersChecks, false);
                                ChatAttachAlertPollLayout.this.listView.getChildCount();
                                for (int i2 = ChatAttachAlertPollLayout.this.answerStartRow; i2 < ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answersCount; i2++) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i2);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        if (view2 instanceof PollEditTextCell) {
                                            ((PollEditTextCell) view2).setChecked(false, true);
                                        }
                                    }
                                }
                            }
                            super.onCheckBoxClick(pollEditTextCell3, z3);
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                                ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow] = z3;
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        protected boolean isChecked(PollEditTextCell pollEditTextCell3) {
                            int adapterPosition;
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) == -1) {
                                return false;
                            }
                            return ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow];
                        }

                        @Override
                        public void lambda$new$1(PollEditTextCell pollEditTextCell3) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell3);
                        }

                        @Override
                        public boolean onPastedMultipleLines(ArrayList arrayList) {
                            int childAdapterPosition;
                            if (arrayList.isEmpty() || (childAdapterPosition = ChatAttachAlertPollLayout.this.listView.getChildAdapterPosition(this) - ChatAttachAlertPollLayout.this.answerStartRow) < 0) {
                                return false;
                            }
                            this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                            int i2 = childAdapterPosition + 1;
                            while (!arrayList.isEmpty() && i2 < ChatAttachAlertPollLayout.this.maxAnswersCount) {
                                for (int length = ChatAttachAlertPollLayout.this.answers.length - 1; length > i2; length--) {
                                    ChatAttachAlertPollLayout.this.answers[length] = ChatAttachAlertPollLayout.this.answers[length - 1];
                                }
                                ChatAttachAlertPollLayout.this.answers[i2] = (CharSequence) arrayList.remove(0);
                                ChatAttachAlertPollLayout.access$2208(ChatAttachAlertPollLayout.this);
                                i2++;
                            }
                            ChatAttachAlertPollLayout.this.updateRows();
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout.requestFieldFocusAtPosition = (chatAttachAlertPollLayout.answerStartRow + i2) - 1;
                            ChatAttachAlertPollLayout.this.listView.setItemAnimator(ChatAttachAlertPollLayout.this.itemAnimator);
                            ChatAttachAlertPollLayout.this.listAdapter.notifyDataSetChanged();
                            return true;
                        }
                    };
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
                            int adapterPosition2;
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell2);
                            if (viewHolderFindContainingViewHolder == null || (adapterPosition2 = (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition2 >= ChatAttachAlertPollLayout.this.answers.length) {
                                return;
                            }
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell2.getEditField().getPaint().getFontMetricsInt(), false);
                                float y = (viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight();
                                if (y > 0.0f) {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(0);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(y);
                                } else {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
                                }
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell2);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.answers[adapterPosition2] = editable;
                            ChatAttachAlertPollLayout.this.setTextLeft(pollEditTextCell2, adapterPosition);
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    pollEditTextCell2.setShowNextButton(true);
                    EditTextBoldCursor textView = pollEditTextCell2.getTextView();
                    textView.setImeOptions(textView.getImeOptions() | 5);
                    textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                            return this.f$0.lambda$onCreateViewHolder$1(pollEditTextCell2, textView2, i2, keyEvent);
                        }
                    });
                    textView.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                            return ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$2(pollEditTextCell2, view2, i2, keyEvent);
                        }
                    });
                    headerCell = pollEditTextCell2;
                    break;
                case 6:
                    headerCell = new TextCheckCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 7:
                    final PollEditTextCell pollEditTextCell3 = new PollEditTextCell(this.mContext, false, ChatAttachAlertPollLayout.this.isPremium ? 1 : 0, null) {
                        @Override
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        protected void onEditTextFocusChanged(boolean z3) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z3);
                        }

                        @Override
                        protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), true, true);
                            }
                        }

                        @Override
                        public void lambda$new$1(PollEditTextCell pollEditTextCell4) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell4);
                        }
                    };
                    pollEditTextCell3.createErrorTextView();
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
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.questionRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell3.getEditField().getPaint().getFontMetricsInt(), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell3);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.solutionString = editable;
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.solutionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    headerCell = pollEditTextCell3;
                    break;
                case 8:
                    View emptyView = new EmptyView(this.mContext);
                    emptyView.setTag(-33024);
                    view = emptyView;
                    headerCell = view;
                    break;
                case 9:
                    View view2 = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            setMeasuredDimension(View.MeasureSpec.getSize(i2), ChatAttachAlertPollLayout.this.topPadding);
                        }
                    };
                    view2.setTag(-33024);
                    view = view2;
                    headerCell = view;
                    break;
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }

        public void lambda$onCreateViewHolder$0(android.view.View r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$0(android.view.View):void");
        }

        public boolean lambda$onCreateViewHolder$1(PollEditTextCell pollEditTextCell, TextView textView, int i, KeyEvent keyEvent) {
            int adapterPosition;
            if (i != 5) {
                return false;
            }
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
            if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                int i2 = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
                if (i2 != ChatAttachAlertPollLayout.this.answersCount - 1 || ChatAttachAlertPollLayout.this.answersCount >= ChatAttachAlertPollLayout.this.maxAnswersCount) {
                    if (i2 != ChatAttachAlertPollLayout.this.answersCount - 1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
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
                    ChatAttachAlertPollLayout.this.addNewField();
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
            if (i == ChatAttachAlertPollLayout.this.questionHeaderRow || i == ChatAttachAlertPollLayout.this.answerHeaderRow || i == ChatAttachAlertPollLayout.this.settingsHeaderRow) {
                return 0;
            }
            if (i == ChatAttachAlertPollLayout.this.questionSectionRow) {
                return 1;
            }
            if (i == ChatAttachAlertPollLayout.this.answerSectionRow || i == ChatAttachAlertPollLayout.this.settingsSectionRow || i == ChatAttachAlertPollLayout.this.solutionInfoRow) {
                return 2;
            }
            if (i == ChatAttachAlertPollLayout.this.addAnswerRow) {
                return 3;
            }
            if (i == ChatAttachAlertPollLayout.this.questionRow) {
                return 4;
            }
            if (i == ChatAttachAlertPollLayout.this.solutionRow) {
                return 7;
            }
            if (i == ChatAttachAlertPollLayout.this.anonymousRow || i == ChatAttachAlertPollLayout.this.multipleRow || i == ChatAttachAlertPollLayout.this.quizRow || i == ChatAttachAlertPollLayout.this.allowAddingRow || i == ChatAttachAlertPollLayout.this.allowMarkingRow) {
                return 6;
            }
            if (i == ChatAttachAlertPollLayout.this.emptyRow) {
                return 8;
            }
            return i == ChatAttachAlertPollLayout.this.paddingRow ? 9 : 5;
        }

        public void swapElements(int i, int i2) {
            int i3 = i - ChatAttachAlertPollLayout.this.answerStartRow;
            int i4 = i2 - ChatAttachAlertPollLayout.this.answerStartRow;
            if (i3 < 0 || i4 < 0 || i3 >= ChatAttachAlertPollLayout.this.answersCount || i4 >= ChatAttachAlertPollLayout.this.answersCount) {
                return;
            }
            CharSequence charSequence = ChatAttachAlertPollLayout.this.answers[i3];
            ChatAttachAlertPollLayout.this.answers[i3] = ChatAttachAlertPollLayout.this.answers[i4];
            ChatAttachAlertPollLayout.this.answers[i4] = charSequence;
            boolean z = ChatAttachAlertPollLayout.this.answersChecks[i3];
            ChatAttachAlertPollLayout.this.answersChecks[i3] = ChatAttachAlertPollLayout.this.answersChecks[i4];
            ChatAttachAlertPollLayout.this.answersChecks[i4] = z;
            notifyItemMoved(i, i2);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{EmptyView.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
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

    private int getAnswersMaxCount() {
        if (this.todo) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().pollAnswersMax;
    }

    private MessagesController getMessagesController() {
        int i;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert != null) {
            i = chatAttachAlert.currentAccount;
        } else {
            i = UserConfig.selectedAccount;
        }
        return MessagesController.getInstance(i);
    }
}
