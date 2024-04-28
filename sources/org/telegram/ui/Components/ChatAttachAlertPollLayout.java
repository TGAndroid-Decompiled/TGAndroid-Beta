package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
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
import androidx.recyclerview.widget.SimpleItemAnimator;
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
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
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
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
public class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    private int addAnswerRow;
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
    private int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    private int emptyRow;
    private boolean hintShowed;
    private HintView hintView;
    private boolean ignoreLayout;
    private boolean isAnimatePopupClosing;
    private boolean isPremium;
    private SimpleItemAnimator itemAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private FillLastLinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
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
    private int topPadding;
    private boolean waitingForKeyboardOpen;

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap<String, String> hashMap, boolean z, int i);
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    static int access$2010(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
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

    public ChatAttachAlertPollLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.answers = new CharSequence[10];
        this.answersChecks = new boolean[10];
        this.answersCount = 1;
        this.anonymousPoll = true;
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
        updateRows();
        this.isPremium = AccountInstance.getInstance(this.parentAlert.currentAccount).getUserConfig().isPremium();
        this.parentAlert.sizeNotifierFrameLayout.setDelegate(this);
        this.listAdapter = new ListAdapter(context);
        RecyclerListView recyclerListView = new RecyclerListView(this, context) {
            @Override
            public void requestChildOnScreen(View view, View view2) {
                if (view instanceof PollEditTextCell) {
                    super.requestChildOnScreen(view, view2);
                }
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, android.graphics.Rect rect, boolean z) {
                rect.bottom += AndroidUtilities.dp(60.0f);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.listView = recyclerListView;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getAdapterPosition() == 0) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                    chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, 0);
                }
            }
        };
        this.itemAnimator = defaultItemAnimator;
        recyclerListView.setItemAnimator(defaultItemAnimator);
        this.listView.setClipToPadding(false);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(53.0f), this.listView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - (ChatAttachAlertPollLayout.this.topPadding - AndroidUtilities.dp(7.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }

            @Override
            protected int[] getChildRectangleOnScreenScrollAmount(View view, android.graphics.Rect rect) {
                int[] iArr = new int[2];
                int height = getHeight() - getPaddingBottom();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height2 = rect.height() + top;
                int i = top - 0;
                int min = Math.min(0, i);
                int max = Math.max(0, height2 - height);
                if (min == 0) {
                    min = Math.min(i, max);
                }
                iArr[0] = 0;
                iArr[1] = min;
                return iArr;
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.setSkipFirstItem();
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(this.listView);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setPreserveFocusAfterLayout(true);
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ChatAttachAlertPollLayout.this.lambda$new$0(view, i);
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
                        RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder((PollEditTextCell) delegate);
                        if (findContainingViewHolder == null) {
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                        } else {
                            int adapterPosition = findContainingViewHolder.getAdapterPosition();
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel.getDirection() == 0) {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY((findContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + findContainingViewHolder.itemView.getMeasuredHeight());
                            } else {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(findContainingViewHolder.itemView.getY());
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
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = ChatAttachAlertPollLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertPollLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(1)) == null || holder.itemView.getTop() <= AndroidUtilities.dp(53.0f)) {
                        return;
                    }
                    ChatAttachAlertPollLayout.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(53.0f));
                }
            }
        });
        HintView hintView = new HintView(context, 4);
        this.hintView = hintView;
        hintView.setText(LocaleController.getString("PollTapToSelect", R.string.PollTapToSelect));
        this.hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            SuggestEmojiView suggestEmojiView = new SuggestEmojiView(this, context, this.parentAlert.currentAccount, null, resourcesProvider) {
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
        } else if (view instanceof TextCheckCell) {
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
                    this.listView.setItemAnimator(this.itemAnimator);
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.quizRow);
                    if (findViewHolderForAdapterPosition != null) {
                        ((TextCheckCell) findViewHolderForAdapterPosition.itemView).setChecked(false);
                    } else {
                        this.listAdapter.notifyItemChanged(this.quizRow);
                    }
                    this.listAdapter.notifyItemRangeRemoved(i2, 2);
                    this.listAdapter.notifyItemChanged(this.emptyRow);
                }
            } else if (this.quizOnly != 0) {
                return;
            } else {
                this.listView.setItemAnimator(this.itemAnimator);
                z = !this.quizPoll;
                this.quizPoll = z;
                int i3 = this.solutionRow;
                updateRows();
                if (this.quizPoll) {
                    this.listAdapter.notifyItemRangeInserted(this.solutionRow, 2);
                } else {
                    this.listAdapter.notifyItemRangeRemoved(i3, 2);
                }
                this.listAdapter.notifyItemChanged(this.emptyRow);
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
        }
    }

    @Override
    public void onHideShowProgress(float f) {
        ActionBarMenuItem actionBarMenuItem = this.parentAlert.doneItem;
        actionBarMenuItem.setAlpha((actionBarMenuItem.isEnabled() ? 1.0f : 0.5f) * f);
    }

    @Override
    public void onMenuItemClick(int i) {
        if (i == 40) {
            if (this.quizPoll && this.parentAlert.doneItem.getAlpha() != 1.0f) {
                int i2 = 0;
                for (int i3 = 0; i3 < this.answersChecks.length; i3++) {
                    if (!TextUtils.isEmpty(getFixedString(this.answers[i3])) && this.answersChecks[i3]) {
                        i2++;
                    }
                }
                if (i2 <= 0) {
                    showQuizHint();
                    return;
                }
                return;
            }
            CharSequence[] charSequenceArr = {getFixedString(this.questionString)};
            ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence = charSequenceArr[0];
            int size = entities.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = entities.get(i4);
                if (tLRPC$MessageEntity.offset + tLRPC$MessageEntity.length > charSequence.length()) {
                    tLRPC$MessageEntity.length = charSequence.length() - tLRPC$MessageEntity.offset;
                }
            }
            final TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = new TLRPC$TL_messageMediaPoll();
            TLRPC$TL_poll tLRPC$TL_poll = new TLRPC$TL_poll();
            tLRPC$TL_messageMediaPoll.poll = tLRPC$TL_poll;
            tLRPC$TL_poll.multiple_choice = this.multipleChoise;
            tLRPC$TL_poll.quiz = this.quizPoll;
            tLRPC$TL_poll.public_voters = !this.anonymousPoll;
            tLRPC$TL_poll.question = new TLRPC$TL_textWithEntities();
            tLRPC$TL_messageMediaPoll.poll.question.text = charSequence.toString();
            tLRPC$TL_messageMediaPoll.poll.question.entities = entities;
            SerializedData serializedData = new SerializedData(10);
            int i5 = 0;
            while (true) {
                CharSequence[] charSequenceArr2 = this.answers;
                if (i5 >= charSequenceArr2.length) {
                    break;
                }
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr2[i5]))) {
                    CharSequence[] charSequenceArr3 = {getFixedString(this.answers[i5])};
                    ArrayList<TLRPC$MessageEntity> entities2 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr3, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    int size2 = entities2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TLRPC$MessageEntity tLRPC$MessageEntity2 = entities2.get(i6);
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
                    if ((this.multipleChoise || this.quizPoll) && this.answersChecks[i5]) {
                        serializedData.writeByte(tLRPC$TL_pollAnswer.option[0]);
                    }
                }
                i5++;
            }
            final HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("answers", Utilities.bytesToHex(serializedData.toByteArray()));
            tLRPC$TL_messageMediaPoll.results = new TLRPC$TL_pollResults();
            CharSequence fixedString = getFixedString(this.solutionString);
            if (fixedString != null) {
                tLRPC$TL_messageMediaPoll.results.solution = fixedString.toString();
                ArrayList<TLRPC$MessageEntity> entities3 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                if (entities3 != null && !entities3.isEmpty()) {
                    tLRPC$TL_messageMediaPoll.results.solution_entities = entities3;
                }
                if (!TextUtils.isEmpty(tLRPC$TL_messageMediaPoll.results.solution)) {
                    tLRPC$TL_messageMediaPoll.results.flags |= 16;
                }
            }
            ChatActivity chatActivity = (ChatActivity) this.parentAlert.baseFragment;
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i7) {
                        ChatAttachAlertPollLayout.this.lambda$onMenuItemClick$1(tLRPC$TL_messageMediaPoll, hashMap, z, i7);
                    }
                });
                return;
            }
            this.delegate.sendPoll(tLRPC$TL_messageMediaPoll, hashMap, true, 0);
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onMenuItemClick$1(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i) {
        this.delegate.sendPoll(tLRPC$TL_messageMediaPoll, hashMap, z, i);
        this.parentAlert.dismiss(true);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        if (this.listView.getChildCount() > 1 && (childAt = this.listView.getChildAt(1)) != null) {
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
            int y = ((int) childAt.getY()) - AndroidUtilities.dp(8.0f);
            int i = (y <= 0 || holder == null || holder.getAdapterPosition() != 1) ? 0 : y;
            if (y < 0 || holder == null || holder.getAdapterPosition() != 1) {
                y = i;
            }
            return y + AndroidUtilities.dp(25.0f);
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
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
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null) {
                View view = findViewHolderForAdapterPosition.itemView;
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
                }
                i4++;
                z2 = true;
            }
            i3++;
        }
        if (i4 < 2 || (this.quizPoll && i < 1)) {
            z = false;
        }
        if (!TextUtils.isEmpty(this.solutionString) || !TextUtils.isEmpty(this.questionString) || z2) {
            this.allowNesterScroll = false;
        } else {
            this.allowNesterScroll = true;
        }
        this.parentAlert.setAllowNestedScroll(this.allowNesterScroll);
        this.parentAlert.doneItem.setEnabled((this.quizPoll && i == 0) || z);
        this.parentAlert.doneItem.setAlpha(z ? 1.0f : 0.5f);
    }

    public void updateRows() {
        this.rowCount = 0;
        int i = 0 + 1;
        this.rowCount = i;
        this.paddingRow = 0;
        int i2 = i + 1;
        this.rowCount = i2;
        this.questionHeaderRow = i;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.questionRow = i2;
        int i4 = i3 + 1;
        this.rowCount = i4;
        this.questionSectionRow = i3;
        int i5 = i4 + 1;
        this.rowCount = i5;
        this.answerHeaderRow = i4;
        int i6 = this.answersCount;
        if (i6 != 0) {
            this.answerStartRow = i5;
            this.rowCount = i5 + i6;
        } else {
            this.answerStartRow = -1;
        }
        if (i6 != this.answers.length) {
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.addAnswerRow = i7;
        } else {
            this.addAnswerRow = -1;
        }
        int i8 = this.rowCount;
        int i9 = i8 + 1;
        this.rowCount = i9;
        this.answerSectionRow = i8;
        this.rowCount = i9 + 1;
        this.settingsHeaderRow = i9;
        TLRPC$Chat currentChat = ((ChatActivity) this.parentAlert.baseFragment).getCurrentChat();
        if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
            int i10 = this.rowCount;
            this.rowCount = i10 + 1;
            this.anonymousRow = i10;
        } else {
            this.anonymousRow = -1;
        }
        int i11 = this.quizOnly;
        if (i11 != 1) {
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.multipleRow = i12;
        } else {
            this.multipleRow = -1;
        }
        if (i11 == 0) {
            int i13 = this.rowCount;
            this.rowCount = i13 + 1;
            this.quizRow = i13;
        } else {
            this.quizRow = -1;
        }
        int i14 = this.rowCount;
        int i15 = i14 + 1;
        this.rowCount = i15;
        this.settingsSectionRow = i14;
        if (this.quizPoll) {
            int i16 = i15 + 1;
            this.rowCount = i16;
            this.solutionRow = i15;
            this.rowCount = i16 + 1;
            this.solutionInfoRow = i16;
        } else {
            this.solutionRow = -1;
            this.solutionInfoRow = -1;
        }
        int i17 = this.rowCount;
        this.rowCount = i17 + 1;
        this.emptyRow = i17;
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        try {
            this.parentAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.quizOnly == 1) {
            this.parentAlert.actionBar.setTitle(LocaleController.getString("NewQuiz", R.string.NewQuiz));
        } else {
            this.parentAlert.actionBar.setTitle(LocaleController.getString("NewPoll", R.string.NewPoll));
        }
        this.parentAlert.doneItem.setVisibility(0);
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
        this.parentAlert.doneItem.setVisibility(4);
    }

    @Override
    public boolean onBackPressed() {
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        } else if (checkDiscard()) {
            return super.onBackPressed();
        } else {
            return true;
        }
    }

    private boolean checkDiscard() {
        boolean isEmpty = TextUtils.isEmpty(getFixedString(this.questionString));
        if (isEmpty) {
            for (int i = 0; i < this.answersCount && (isEmpty = TextUtils.isEmpty(getFixedString(this.answers[i]))); i++) {
            }
        }
        if (!isEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.parentAlert.baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString("CancelPollAlertTitle", R.string.CancelPollAlertTitle));
            builder.setMessage(LocaleController.getString("CancelPollAlertText", R.string.CancelPollAlertText));
            builder.setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ChatAttachAlertPollLayout.this.lambda$checkDiscard$2(dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.show();
        }
        return isEmpty;
    }

    public void lambda$checkDiscard$2(DialogInterface dialogInterface, int i) {
        this.parentAlert.dismiss();
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
                textView2.setTextColor(getThemedColor(i5));
                textView2.setTag(Integer.valueOf(i5));
                return;
            }
            pollEditTextCell.setText2("");
        }
    }

    public void addNewField() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.scrollEmojiToTop();
        }
        hideEmojiPopup(false);
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

    public void updateSuggestEmojiPanelDelegate(RecyclerView.ViewHolder viewHolder) {
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
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = AndroidUtilities.displaySize.x;
                if (i3 != i4 || layoutParams.height != i2) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.emojiView.setLayoutParams(layoutParams);
                    this.emojiPadding = layoutParams.height;
                    this.keyboardNotifier.fire();
                    this.parentAlert.sizeNotifierFrameLayout.requestLayout();
                }
            }
            if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
                return;
            }
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            boolean z3 = this.keyboardVisible;
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                this.keyboardVisible = pollEditTextCell.getEditField().isFocused() && this.keyboardNotifier.keyboardVisible() && i > 0;
            } else {
                this.keyboardVisible = false;
            }
            if (this.keyboardVisible && this.emojiViewVisible) {
                showEmojiPopup(0);
            }
            if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
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
            openKeyboardInternal();
        } else {
            showEmojiPopup(1);
        }
    }

    private void openKeyboardInternal() {
        if (this.currentCell != null) {
            this.keyboardNotifier.awaitKeyboard();
            AndroidUtilities.showKeyboard(this.currentCell.getEditField());
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
                layoutParams.height = i2;
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlertPollLayout.this.lambda$showEmojiPopup$3(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                    }
                });
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                ofFloat.start();
                return;
            }
            PollEditTextCell pollEditTextCell3 = this.currentCell;
            emojiButton = pollEditTextCell3 != null ? pollEditTextCell3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null) {
                this.emojiViewVisible = false;
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

    public void lambda$showEmojiPopup$3(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void hideEmojiPopup(boolean z) {
        if (this.isPremium) {
            if (this.emojiViewVisible) {
                showEmojiPopup(0);
            }
            if (z) {
                EmojiView emojiView = this.emojiView;
                if (emojiView != null && emojiView.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatAttachAlertPollLayout.this.lambda$hideEmojiPopup$4(valueAnimator);
                        }
                    });
                    this.isAnimatePopupClosing = true;
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlertPollLayout.this.isAnimatePopupClosing = false;
                            ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                            ChatAttachAlertPollLayout.this.hideEmojiView();
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
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.emojiCacheType = 3;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.allowEmojisForNonPremium(false);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass9());
        this.parentAlert.sizeNotifierFrameLayout.addView(this.emojiView);
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
        public boolean isSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
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
        public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i);
        }

        @Override
        public void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i);
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
                if (tLRPC$Document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$Document, editField.getPaint().getFontMetricsInt());
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
            builder.setTitle(LocaleController.getString("ClearRecentEmojiTitle", R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString("ClearRecentEmojiText", R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatAttachAlertPollLayout.AnonymousClass9.this.lambda$onClearEmojiRecent$0(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.show();
        }

        public void lambda$onClearEmojiRecent$0(DialogInterface dialogInterface, int i) {
            ChatAttachAlertPollLayout.this.emojiView.clearRecentEmoji();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ChatAttachAlertPollLayout.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.questionHeaderRow) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString("PollQuestion", R.string.PollQuestion));
                    return;
                }
                headerCell.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i == ChatAttachAlertPollLayout.this.answerHeaderRow) {
                    if (ChatAttachAlertPollLayout.this.quizOnly == 1) {
                        headerCell.setText(LocaleController.getString("QuizAnswers", R.string.QuizAnswers));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString("AnswerOptions", R.string.AnswerOptions));
                        return;
                    }
                } else if (i == ChatAttachAlertPollLayout.this.settingsHeaderRow) {
                    headerCell.setText(LocaleController.getString("Settings", R.string.Settings));
                    return;
                } else {
                    return;
                }
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.anonymousRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PollAnonymous", R.string.PollAnonymous), ChatAttachAlertPollLayout.this.anonymousPoll, (ChatAttachAlertPollLayout.this.multipleRow == -1 && ChatAttachAlertPollLayout.this.quizRow == -1) ? true : true);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.multipleRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PollMultiple", R.string.PollMultiple), ChatAttachAlertPollLayout.this.multipleChoise, ChatAttachAlertPollLayout.this.quizRow != -1);
                    textCheckCell.setEnabled(true, null);
                } else if (i == ChatAttachAlertPollLayout.this.quizRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("PollQuiz", R.string.PollQuiz), ChatAttachAlertPollLayout.this.quizPoll, false);
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
                    drawable.setColorFilter(new PorterDuffColorFilter(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_switchTrackChecked), PorterDuff.Mode.MULTIPLY));
                    drawable2.setColorFilter(new PorterDuffColorFilter(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_checkboxCheck), PorterDuff.Mode.MULTIPLY));
                    textCell.setTextAndIcon(LocaleController.getString("AddAnOption", R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                textInfoPrivacyCell.setBackgroundDrawable(combinedDrawable);
                if (i != ChatAttachAlertPollLayout.this.solutionInfoRow) {
                    if (i == ChatAttachAlertPollLayout.this.settingsSectionRow) {
                        if (ChatAttachAlertPollLayout.this.quizOnly != 0) {
                            textInfoPrivacyCell.setText(null);
                            return;
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString("QuizInfo", R.string.QuizInfo));
                            return;
                        }
                    } else if (10 - ChatAttachAlertPollLayout.this.answersCount <= 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString("AddAnOptionInfoMax", R.string.AddAnOptionInfoMax));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", 10 - ChatAttachAlertPollLayout.this.answersCount, new Object[0])));
                        return;
                    }
                }
                textInfoPrivacyCell.setText(LocaleController.getString("AddAnExplanationInfo", R.string.AddAnExplanationInfo));
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
                pollEditTextCell.setTextAndHint(ChatAttachAlertPollLayout.this.questionString != null ? ChatAttachAlertPollLayout.this.questionString : "", LocaleController.getString("QuestionHint", R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
            } else if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell2.setTag(1);
                    pollEditTextCell2.setTextAndHint(ChatAttachAlertPollLayout.this.solutionString != null ? ChatAttachAlertPollLayout.this.solutionString : "", LocaleController.getString("AddAnExplanation", R.string.AddAnExplanation), false);
                    pollEditTextCell2.setTag(null);
                    ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                }
            } else {
                int adapterPosition = viewHolder.getAdapterPosition();
                PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell3.setTag(1);
                pollEditTextCell3.setTextAndHint(ChatAttachAlertPollLayout.this.answers[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow], LocaleController.getString("OptionHint", R.string.OptionHint), true);
                pollEditTextCell3.setTag(null);
                if (ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition == adapterPosition) {
                    EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                    textView.requestFocus();
                    AndroidUtilities.showKeyboard(textView);
                    ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition = -1;
                }
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, adapterPosition);
            }
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
            View headerCell;
            final PollEditTextCell pollEditTextCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false);
                    break;
                case 1:
                    headerCell = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    headerCell.setBackgroundDrawable(combinedDrawable);
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 3:
                    headerCell = new TextCell(this.mContext);
                    break;
                case 4:
                    pollEditTextCell = new PollEditTextCell(this.mContext, false, ChatAttachAlertPollLayout.this.isPremium ? 1 : 0, null) {
                        @Override
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                            if (ChatAttachAlertPollLayout.this.isPremium) {
                                PollEditTextCell pollEditTextCell2 = (PollEditTextCell) editTextBoldCursor.getParent();
                                ChatAttachAlertPollLayout.this.currentCell = pollEditTextCell2;
                                EmojiView emojiView = ChatAttachAlertPollLayout.this.emojiView;
                                if (emojiView != null) {
                                    emojiView.scrollEmojiToTop();
                                }
                                pollEditTextCell2.getEmojiButton().setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
                                ChatAttachAlertPollLayout.this.hideEmojiPopup(false);
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.updateSuggestEmojiPanelDelegate(chatAttachAlertPollLayout.listView.findContainingViewHolder(this));
                            }
                        }

                        @Override
                        protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), true);
                            }
                        }

                        @Override
                        public void onEmojiButtonClicked(PollEditTextCell pollEditTextCell2) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell2);
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
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.questionRow);
                            if (findViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(findViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.questionString = editable;
                            if (findViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(findViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.questionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    headerCell = pollEditTextCell;
                    break;
                case 5:
                default:
                    Context context = this.mContext;
                    boolean z = ChatAttachAlertPollLayout.this.isPremium;
                    final PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context, false, z ? 1 : 0, new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ChatAttachAlertPollLayout.ListAdapter.this.lambda$onCreateViewHolder$0(view);
                        }
                    }) {
                        @Override
                        protected boolean drawDivider() {
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(this);
                            if (findContainingViewHolder != null) {
                                int adapterPosition = findContainingViewHolder.getAdapterPosition();
                                if (ChatAttachAlertPollLayout.this.answersCount == 10 && adapterPosition == (ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answersCount) - 1) {
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
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                            if (ChatAttachAlertPollLayout.this.isPremium) {
                                PollEditTextCell pollEditTextCell3 = (PollEditTextCell) editTextBoldCursor.getParent();
                                ChatAttachAlertPollLayout.this.currentCell = pollEditTextCell3;
                                EmojiView emojiView = ChatAttachAlertPollLayout.this.emojiView;
                                if (emojiView != null) {
                                    emojiView.scrollEmojiToTop();
                                }
                                ChatAttachAlertPollLayout.this.hideEmojiPopup(false);
                                pollEditTextCell3.getEmojiButton().setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.updateSuggestEmojiPanelDelegate(chatAttachAlertPollLayout.listView.findContainingViewHolder(this));
                            }
                        }

                        @Override
                        public void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z2) {
                            int adapterPosition;
                            if (z2 && ChatAttachAlertPollLayout.this.quizPoll) {
                                Arrays.fill(ChatAttachAlertPollLayout.this.answersChecks, false);
                                ChatAttachAlertPollLayout.this.listView.getChildCount();
                                for (int i2 = ChatAttachAlertPollLayout.this.answerStartRow; i2 < ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answersCount; i2++) {
                                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i2);
                                    if (findViewHolderForAdapterPosition != null) {
                                        View view = findViewHolderForAdapterPosition.itemView;
                                        if (view instanceof PollEditTextCell) {
                                            ((PollEditTextCell) view).setChecked(false, true);
                                        }
                                    }
                                }
                            }
                            super.onCheckBoxClick(pollEditTextCell3, z2);
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (findContainingViewHolder != null && (adapterPosition = findContainingViewHolder.getAdapterPosition()) != -1) {
                                ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow] = z2;
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        protected boolean isChecked(PollEditTextCell pollEditTextCell3) {
                            int adapterPosition;
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (findContainingViewHolder == null || (adapterPosition = findContainingViewHolder.getAdapterPosition()) == -1) {
                                return false;
                            }
                            return ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow];
                        }

                        @Override
                        public void onEmojiButtonClicked(PollEditTextCell pollEditTextCell3) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell3);
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
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell2);
                            if (findContainingViewHolder == null || (adapterPosition2 = (adapterPosition = findContainingViewHolder.getAdapterPosition()) - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition2 >= ChatAttachAlertPollLayout.this.answers.length) {
                                return;
                            }
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell2.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                                float y = (findContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + findContainingViewHolder.itemView.getMeasuredHeight();
                                if (y > 0.0f) {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(0);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(y);
                                } else {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(findContainingViewHolder.itemView.getY());
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
                            boolean lambda$onCreateViewHolder$1;
                            lambda$onCreateViewHolder$1 = ChatAttachAlertPollLayout.ListAdapter.this.lambda$onCreateViewHolder$1(pollEditTextCell2, textView2, i2, keyEvent);
                            return lambda$onCreateViewHolder$1;
                        }
                    });
                    textView.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                            boolean lambda$onCreateViewHolder$2;
                            lambda$onCreateViewHolder$2 = ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$2(PollEditTextCell.this, view, i2, keyEvent);
                            return lambda$onCreateViewHolder$2;
                        }
                    });
                    headerCell = pollEditTextCell2;
                    break;
                case 6:
                    headerCell = new TextCheckCell(this.mContext);
                    break;
                case 7:
                    pollEditTextCell = new PollEditTextCell(this.mContext, false, ChatAttachAlertPollLayout.this.isPremium ? 1 : 0, null) {
                        @Override
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                            if (ChatAttachAlertPollLayout.this.isPremium) {
                                PollEditTextCell pollEditTextCell3 = (PollEditTextCell) editTextBoldCursor.getParent();
                                ChatAttachAlertPollLayout.this.currentCell = pollEditTextCell3;
                                EmojiView emojiView = ChatAttachAlertPollLayout.this.emojiView;
                                if (emojiView != null) {
                                    emojiView.scrollEmojiToTop();
                                }
                                pollEditTextCell3.getEmojiButton().setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
                                ChatAttachAlertPollLayout.this.hideEmojiPopup(false);
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.updateSuggestEmojiPanelDelegate(chatAttachAlertPollLayout.listView.findContainingViewHolder(this));
                            }
                        }

                        @Override
                        protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), true);
                            }
                        }

                        @Override
                        public void onEmojiButtonClicked(PollEditTextCell pollEditTextCell3) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell3);
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
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.questionRow);
                            if (findViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji((CharSequence) editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(findViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.solutionString = editable;
                            if (findViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(findViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.solutionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    headerCell = pollEditTextCell;
                    break;
                case 8:
                    headerCell = new EmptyView(this.mContext);
                    headerCell.setBackgroundColor(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray));
                    break;
                case 9:
                    headerCell = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            setMeasuredDimension(View.MeasureSpec.getSize(i2), ChatAttachAlertPollLayout.this.topPadding);
                        }
                    };
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
            if (i == 5) {
                RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
                if (findContainingViewHolder != null && (adapterPosition = findContainingViewHolder.getAdapterPosition()) != -1) {
                    int i2 = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
                    if (i2 != ChatAttachAlertPollLayout.this.answersCount - 1 || ChatAttachAlertPollLayout.this.answersCount >= 10) {
                        if (i2 != ChatAttachAlertPollLayout.this.answersCount - 1) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
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
                        ChatAttachAlertPollLayout.this.addNewField();
                    }
                }
                return true;
            }
            return false;
        }

        public static boolean lambda$onCreateViewHolder$2(PollEditTextCell pollEditTextCell, View view, int i, KeyEvent keyEvent) {
            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
            if (i == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                pollEditTextCell.callOnDelete();
                return true;
            }
            return false;
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
            if (i == ChatAttachAlertPollLayout.this.anonymousRow || i == ChatAttachAlertPollLayout.this.multipleRow || i == ChatAttachAlertPollLayout.this.quizRow) {
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
}
