package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollCreateCheckCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda277;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaGallery;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    private final int MAX_CAPTION_LENGTH;
    private final int[] POLL_DURATION_OPTIONS;
    private int addAnswerRow;
    private boolean allowAdding;
    private boolean allowAddingOptions;
    private int allowAddingRow;
    private boolean allowMarking;
    private int allowMarkingRow;
    private boolean allowNesterScroll;
    private boolean allowRevoting;
    private boolean anonymousPoll;
    private int answerHeaderRow;
    private int answerSectionRow;
    private int answerStartRow;
    private final CharSequence[] answers;
    private final boolean[] answersChecks;
    private int answersCount;
    private final PollAttachedMediaPack attachedMedia;
    private final Paint checkboxPaint;
    private ChatAttachAlert currentAttachAlert;
    private int currentAttachAlertIndex;
    private PollEditTextCell currentCell;
    private PollCreateActivityDelegate delegate;
    private int descriptionRow;
    private CharSequence descriptionString;
    private boolean destroyed;
    private boolean doneItemEnabled;
    private int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private int emptyRow;
    private boolean hideResults;
    private boolean hintShowed;
    private HintView hintView;
    private boolean ignoreLayout;
    private boolean isAnimatePopupClosing;
    public boolean isEmojiSearchOpened;
    private final boolean isPremium;
    private final DefaultItemAnimator itemAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private final KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private final FillLastLinearLayoutManager layoutManager;
    private final ListAdapter listAdapter;
    private final RecyclerListView listView;
    private final int maxAnswersCount;
    private boolean multipleChoise;
    private final Runnable openKeyboardRunnable;
    private int paddingRow;
    private int poll2vAllowAddingRow;
    private int poll2vAllowRevotingRow;
    private int poll2vAnonymousRow;
    private int poll2vLimitDurationHideResultsRow;
    private int poll2vLimitDurationHideResultsRowInfo;
    private int poll2vLimitDurationRow;
    private int poll2vLimitDurationTimeRow;
    private int poll2vMultipleRow;
    private int poll2vQuizRow;
    private int poll2vShuffleRow;
    private int pollLimitDeadline;
    private int pollLimitDuration;
    private int questionHeaderRow;
    private int questionRow;
    private int questionSectionRow;
    private CharSequence questionString;
    private int quizOnly;
    private boolean quizPoll;
    private int requestFieldFocusAtPosition;
    private int rowCount;
    private int settingsHeaderRow;
    private int settingsSectionRow;
    private boolean shuffleOptions;
    private int solutionInfoRow;
    private int solutionRow;
    private int solutionRowHeader;
    private CharSequence solutionString;
    private SuggestEmojiView suggestEmojiPanel;
    private final boolean todo;
    private int topPadding;
    private boolean waitingForKeyboardOpen;
    public boolean wasEmojiSearchOpened;

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j);
    }

    public static int getAllowedLayoutsForIndex(int i) {
        return (i == -2 || i == -3) ? 90 : 8258;
    }

    public static void lambda$new$2() {
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    static int access$2308(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
        int i = chatAttachAlertPollLayout.answersCount;
        chatAttachAlertPollLayout.answersCount = i + 1;
        return i;
    }

    static int access$2310(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
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

    public ChatAttachAlertPollLayout(final ChatAttachAlert chatAttachAlert, final Context context, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.answersCount = 1;
        this.allowRevoting = true;
        this.shuffleOptions = true;
        this.allowAddingOptions = true;
        this.multipleChoise = true;
        this.allowAdding = true;
        this.allowMarking = true;
        this.requestFieldFocusAtPosition = -1;
        this.POLL_DURATION_OPTIONS = new int[]{3600, 10800, 28800, 86400, 259200};
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
        Paint paint = new Paint(1);
        this.checkboxPaint = paint;
        this.attachedMedia = new PollAttachedMediaPack();
        this.todo = z;
        int answersMaxCount = getAnswersMaxCount();
        this.maxAnswersCount = answersMaxCount;
        this.answers = new CharSequence[answersMaxCount];
        this.answersChecks = new boolean[answersMaxCount];
        updateRows();
        boolean zIsPremium = AccountInstance.getInstance(this.parentAlert.currentAccount).getUserConfig().isPremium();
        this.isPremium = zIsPremium;
        paint.setColor(getThemedColor(Theme.key_telegram_color));
        this.parentAlert.sizeNotifierFrameLayout.setDelegate(this);
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
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
        this.iBlur3Capture = recyclerListView;
        this.iBlur3CaptureView = recyclerListView;
        this.occupyNavigationBar = true;
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
        recyclerListView.setItemAnimator(defaultItemAnimator);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setSections(true);
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(65.0f), recyclerListView) {
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
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        fillLastLinearLayoutManager.setSkipFirstItem();
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(recyclerListView);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 51));
        recyclerListView.setPreserveFocusAfterLayout(true);
        recyclerListView.setAdapter(listAdapter);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                this.f$0.lambda$new$4(chatAttachAlert, resourcesProvider, context, view, i);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
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
                    if (((ChatAttachAlertPollLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(1)) == null || holder.itemView.getTop() <= AndroidUtilities.dp(65.0f)) {
                        return;
                    }
                    ChatAttachAlertPollLayout.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(65.0f));
                }
            }
        });
        HintView hintView = new HintView(context, 4);
        this.hintView = hintView;
        hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.MAX_CAPTION_LENGTH = MessagesController.getInstance(this.parentAlert.currentAccount).config.pollCaptionLengthMax.get();
        if (zIsPremium) {
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

    public void lambda$new$4(ChatAttachAlert chatAttachAlert, final Theme.ResourcesProvider resourcesProvider, final Context context, final View view, int i) {
        boolean z = false;
        z = false;
        if (i == this.poll2vLimitDurationTimeRow) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlert.container, resourcesProvider, view);
            int i2 = 0;
            while (true) {
                int[] iArr = this.POLL_DURATION_OPTIONS;
                if (i2 < iArr.length) {
                    final int i3 = iArr[i2];
                    TimerDrawable ttlIcon = TimerDrawable.getTtlIcon(i3);
                    ttlIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
                    itemOptionsMakeOptions.add(ttlIcon, LocaleController.formatPluralString("Hours", i3 / 3600, new Object[0]), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$new$0(i3, view);
                        }
                    });
                    i2++;
                } else {
                    itemOptionsMakeOptions.add(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$new$3(context, view, resourcesProvider);
                        }
                    });
                    itemOptionsMakeOptions.setDrawScrim(false);
                    itemOptionsMakeOptions.setDimAlpha(0);
                    itemOptionsMakeOptions.show();
                    return;
                }
            }
        } else {
            if (i == this.addAnswerRow) {
                addNewField();
                return;
            }
            boolean z2 = view instanceof TextCheckCell;
            if (z2 || (view instanceof PollCreateCheckCell)) {
                boolean z3 = this.quizPoll;
                SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
                if (suggestEmojiView != null) {
                    suggestEmojiView.forceClose();
                }
                if (i == this.poll2vAnonymousRow) {
                    z = this.anonymousPoll;
                    this.anonymousPoll = !z;
                    checkAllowAddingOptionsRow();
                } else {
                    int i4 = this.allowAddingRow;
                    if (i == i4) {
                        z = !this.allowAdding;
                        this.allowAdding = z;
                    } else if (i == this.poll2vAllowAddingRow) {
                        if (!this.quizPoll && !this.anonymousPoll) {
                            this.allowAddingOptions = !this.allowAddingOptions;
                        }
                        z = this.allowAddingOptions;
                    } else if (i == this.poll2vShuffleRow) {
                        z = !this.shuffleOptions;
                        this.shuffleOptions = z;
                    } else if (i == this.poll2vLimitDurationRow) {
                        if (this.pollLimitDuration == 0 && this.pollLimitDeadline == 0) {
                            this.pollLimitDuration = 86400;
                            this.pollLimitDeadline = 0;
                            int i5 = this.poll2vLimitDurationTimeRow;
                            updateRows();
                            if (i5 < 0) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.poll2vLimitDurationRow);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    if (view2 instanceof PollCreateCheckCell) {
                                        ((PollCreateCheckCell) view2).setDivider(true);
                                    }
                                }
                                this.listView.setItemAnimator(this.itemAnimator);
                                this.listAdapter.notifyItemRangeInserted(this.poll2vLimitDurationTimeRow, 3);
                            }
                        } else {
                            this.pollLimitDuration = 0;
                            this.pollLimitDeadline = 0;
                            int i6 = this.poll2vLimitDurationTimeRow;
                            updateRows();
                            this.listView.setItemAnimator(this.itemAnimator);
                            this.listAdapter.notifyItemRangeRemoved(i6, 3);
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.poll2vLimitDurationRow);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                View view3 = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                if (view3 instanceof PollCreateCheckCell) {
                                    ((PollCreateCheckCell) view3).setDivider(false);
                                }
                            }
                        }
                        if (this.pollLimitDuration != 0 || this.pollLimitDeadline != 0) {
                            z = true;
                        }
                    } else if (i == this.poll2vAllowRevotingRow) {
                        z = !this.allowRevoting;
                        this.allowRevoting = z;
                    } else if (i == this.allowMarkingRow) {
                        z = !this.allowMarking;
                        this.allowMarking = z;
                        updateRows();
                        int i7 = this.allowAddingRow;
                        if (i7 >= 0 && i4 < 0) {
                            this.listView.setItemAnimator(this.itemAnimator);
                            this.listAdapter.notifyItemInserted(this.allowAddingRow);
                        } else if (i4 >= 0 && i7 < 0) {
                            this.listView.setItemAnimator(this.itemAnimator);
                            this.listAdapter.notifyItemRemoved(i4);
                        }
                    } else if (i == this.poll2vMultipleRow) {
                        boolean z4 = this.multipleChoise;
                        boolean z5 = !z4;
                        this.multipleChoise = z5;
                        if (z4 && this.quizPoll) {
                            int i8 = 0;
                            boolean z6 = false;
                            while (true) {
                                boolean[] zArr = this.answersChecks;
                                if (i8 >= zArr.length) {
                                    break;
                                }
                                if (z6) {
                                    zArr[i8] = false;
                                } else if (zArr[i8]) {
                                    z6 = true;
                                }
                                i8++;
                            }
                        }
                        int childCount = this.listView.getChildCount();
                        for (int i9 = 0; i9 < childCount; i9++) {
                            RecyclerListView recyclerListView = this.listView;
                            RecyclerView.ViewHolder childViewHolder = recyclerListView.getChildViewHolder(recyclerListView.getChildAt(i9));
                            if (childViewHolder.getItemViewType() == 5) {
                                ((PollEditTextCell) childViewHolder.itemView).setCheckboxMultiselect(this.multipleChoise, true);
                            }
                        }
                        z = z5;
                    } else if (i == this.poll2vLimitDurationHideResultsRow) {
                        z = !this.hideResults;
                        this.hideResults = z;
                    } else if (i == this.poll2vQuizRow) {
                        if (this.quizOnly != 0) {
                            return;
                        }
                        this.listView.setItemAnimator(this.itemAnimator);
                        boolean z7 = !this.quizPoll;
                        this.quizPoll = z7;
                        int i10 = this.solutionRowHeader;
                        updateRows();
                        if (this.quizPoll) {
                            this.listAdapter.notifyItemRangeInserted(this.solutionRowHeader, 3);
                        } else {
                            this.listAdapter.notifyItemRangeRemoved(i10, 3);
                        }
                        this.listAdapter.notifyItemChanged(this.emptyRow);
                        if (this.quizPoll) {
                            this.allowRevoting = false;
                            int i11 = this.poll2vAllowRevotingRow;
                            if (i11 >= 0) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(i11);
                                if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                                    ((PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition3.itemView).setChecked(false);
                                } else {
                                    this.listAdapter.notifyItemChanged(this.poll2vAllowRevotingRow);
                                }
                            }
                        } else {
                            int i12 = this.poll2vAllowRevotingRow;
                            if (i12 >= 0 && this.listView.findViewHolderForAdapterPosition(i12) == null) {
                                this.listAdapter.notifyItemChanged(this.poll2vAllowRevotingRow);
                            }
                        }
                        checkAllowAddingOptionsRow();
                        if (this.quizPoll && !this.multipleChoise) {
                            int i13 = 0;
                            boolean z8 = false;
                            while (true) {
                                boolean[] zArr2 = this.answersChecks;
                                if (i13 >= zArr2.length) {
                                    break;
                                }
                                if (z8) {
                                    zArr2[i13] = false;
                                } else if (zArr2[i13]) {
                                    z8 = true;
                                }
                                i13++;
                            }
                        }
                        z = z7;
                    }
                }
                if (this.hintShowed && !this.quizPoll) {
                    this.hintView.hide();
                }
                this.listView.getChildCount();
                for (int i14 = this.answerStartRow; i14 < this.answerStartRow + this.answersCount; i14++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = this.listView.findViewHolderForAdapterPosition(i14);
                    if (viewHolderFindViewHolderForAdapterPosition4 != null) {
                        View view4 = viewHolderFindViewHolderForAdapterPosition4.itemView;
                        if (view4 instanceof PollEditTextCell) {
                            PollEditTextCell pollEditTextCell = (PollEditTextCell) view4;
                            pollEditTextCell.setShowCheckBox(this.quizPoll, true);
                            pollEditTextCell.setChecked(this.answersChecks[i14 - this.answerStartRow], z3);
                            if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f) && i == this.poll2vQuizRow && !this.hintShowed) {
                                this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                                this.hintShowed = true;
                            }
                        }
                    }
                }
                if (z2) {
                    ((TextCheckCell) view).setChecked(z);
                } else if (view instanceof PollCreateCheckCell) {
                    ((PollCreateCheckCell) view).setChecked(z);
                }
                checkDoneButton();
            }
        }
    }

    public void lambda$new$0(int i, View view) {
        this.pollLimitDeadline = 0;
        this.pollLimitDuration = i;
        if (view instanceof TextCell) {
            checkDurationInfoRow((TextCell) view, true);
        } else {
            this.listAdapter.notifyItemChanged(this.poll2vLimitDurationTimeRow);
        }
    }

    public void lambda$new$3(Context context, final View view, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createPollCloseDatePickerDialog(context, this.pollLimitDeadline, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i, int i2) {
                this.f$0.lambda$new$1(view, z, i, i2);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertPollLayout.lambda$new$2();
            }
        }, new AlertsCreator.ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public void lambda$new$1(View view, boolean z, int i, int i2) {
        if (z) {
            this.pollLimitDeadline = i;
            this.pollLimitDuration = 0;
            if (view instanceof TextCell) {
                checkDurationInfoRow((TextCell) view, true);
            } else {
                this.listAdapter.notifyItemChanged(this.poll2vLimitDurationTimeRow);
            }
        }
    }

    private void checkAllowAddingOptionsRow() {
        boolean z = (this.quizPoll || this.anonymousPoll) ? false : true;
        if (!z) {
            this.allowAddingOptions = false;
        }
        int i = this.poll2vAllowAddingRow;
        if (i < 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            this.listAdapter.notifyItemChanged(this.poll2vAllowAddingRow);
            return;
        }
        PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView;
        if (!z) {
            pollCreateCheckCell.setChecked(false);
        }
        pollCreateCheckCell.getCheckBox().setIconVisible(!z, true);
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
    public void onMenuItemClick(int i) {
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
                            this.f$0.lambda$onMenuItemClick$6(chatActivity, tL_messageMediaToDo, (Long) obj);
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
            tL_poll.open_answers = this.allowAddingOptions;
            tL_poll.revoting_disabled = !this.allowRevoting;
            tL_poll.shuffle_answers = this.shuffleOptions;
            tL_poll.creator = true;
            int i8 = this.pollLimitDuration;
            if (i8 != 0) {
                tL_poll.hide_results_until_close = this.hideResults;
                tL_poll.close_period = i8;
                tL_poll.flags |= 16;
            } else {
                int i9 = this.pollLimitDeadline;
                if (i9 != 0) {
                    tL_poll.hide_results_until_close = this.hideResults;
                    tL_poll.close_date = i9;
                    tL_poll.flags |= 32;
                }
            }
            tL_poll.question = new TLRPC.TL_textWithEntities();
            tL_messageMediaPoll.poll.question.text = charSequence3.toString();
            tL_messageMediaPoll.poll.question.entities = entities3;
            final ArrayList arrayList = new ArrayList(this.maxAnswersCount);
            int i10 = 0;
            while (true) {
                CharSequence[] charSequenceArr5 = this.answers;
                if (i10 >= charSequenceArr5.length) {
                    break;
                }
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr5[i10]))) {
                    CharSequence[] charSequenceArr6 = {getFixedString(this.answers[i10])};
                    ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr6, true);
                    CharSequence charSequence4 = charSequenceArr6[0];
                    if (entities4 != null) {
                        int size4 = entities4.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            TLRPC.MessageEntity messageEntity4 = entities4.get(i11);
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
                    if ((this.multipleChoise || this.quizPoll) && this.answersChecks[i10]) {
                        arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                    }
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                }
                i10++;
            }
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
                    this.f$0.lambda$onMenuItemClick$8(chatActivity2, tL_messageMediaPoll, arrayList, (Long) obj);
                }
            });
        }
    }

    public void lambda$onMenuItemClick$6(ChatActivity chatActivity, final TLRPC.TL_messageMediaToDo tL_messageMediaToDo, final Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i, int i2) {
                    this.f$0.lambda$onMenuItemClick$5(tL_messageMediaToDo, l, z, i, i2);
                }
            });
        } else {
            this.delegate.sendPoll(tL_messageMediaToDo, null, null, null, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onMenuItemClick$5(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaToDo, null, null, null, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public void lambda$onMenuItemClick$8(ChatActivity chatActivity, final TLRPC.TL_messageMediaPoll tL_messageMediaPoll, final ArrayList arrayList, final Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i, int i2) {
                    this.f$0.lambda$onMenuItemClick$7(tL_messageMediaPoll, arrayList, l, z, i, i2);
                }
            });
        } else {
            this.delegate.sendPoll(tL_messageMediaPoll, this.descriptionString, this.attachedMedia, arrayList, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onMenuItemClick$7(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaPoll, this.descriptionString, this.attachedMedia, arrayList, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        if (this.listView.getChildCount() <= 1 || (childAt = this.listView.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int y = ((int) childAt.getY()) - AndroidUtilities.dp(20.0f);
        int i = (y <= 0 || holder == null || holder.getAdapterPosition() != 1) ? 0 : y;
        if (y < 0 || holder == null || holder.getAdapterPosition() != 1) {
            y = i;
        }
        return y + AndroidUtilities.dp(25.0f);
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
        boolean z = (TextUtils.isEmpty(getFixedString(this.descriptionString)) || this.descriptionString.length() <= this.MAX_CAPTION_LENGTH) && (TextUtils.isEmpty(getFixedString(this.solutionString)) || this.solutionString.length() <= 200) && !TextUtils.isEmpty(getFixedString(this.questionString)) && this.questionString.length() <= 255;
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
        this.solutionRowHeader = -1;
        this.solutionRow = -1;
        this.solutionInfoRow = -1;
        this.poll2vMultipleRow = -1;
        this.poll2vAnonymousRow = -1;
        this.poll2vLimitDurationRow = -1;
        this.poll2vLimitDurationTimeRow = -1;
        this.poll2vLimitDurationHideResultsRow = -1;
        this.poll2vLimitDurationHideResultsRowInfo = -1;
        this.poll2vAllowAddingRow = -1;
        this.poll2vShuffleRow = -1;
        this.poll2vAllowRevotingRow = -1;
        this.poll2vQuizRow = -1;
        this.allowAddingRow = -1;
        this.allowMarkingRow = -1;
        this.addAnswerRow = -1;
        this.answerStartRow = -1;
        this.settingsSectionRow = -1;
        this.descriptionRow = -1;
        this.paddingRow = 0;
        this.questionHeaderRow = 1;
        this.rowCount = 3;
        this.questionRow = 2;
        boolean z = this.todo;
        if (!z) {
            this.rowCount = 4;
            this.descriptionRow = 3;
        }
        int i = this.rowCount;
        int i2 = i + 1;
        this.questionSectionRow = i;
        int i3 = i + 2;
        this.rowCount = i3;
        this.answerHeaderRow = i2;
        int i4 = this.answersCount;
        if (i4 != 0) {
            this.answerStartRow = i3;
            this.rowCount = i3 + i4;
        }
        if (i4 != this.answers.length) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.addAnswerRow = i5;
        }
        int i6 = this.rowCount;
        this.answerSectionRow = i6;
        int i7 = i6 + 2;
        this.rowCount = i7;
        this.settingsHeaderRow = i6 + 1;
        if (z) {
            int i8 = i6 + 3;
            this.rowCount = i8;
            this.allowMarkingRow = i7;
            if (this.allowMarking) {
                this.rowCount = i6 + 4;
                this.allowAddingRow = i8;
            }
        } else {
            TLRPC.Chat currentChat = ((ChatActivity) this.parentAlert.baseFragment).getCurrentChat();
            if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
                int i9 = this.rowCount;
                this.rowCount = i9 + 1;
                this.poll2vAnonymousRow = i9;
            } else {
                this.anonymousPoll = true;
            }
            if (this.quizOnly != 1) {
                int i10 = this.rowCount;
                this.rowCount = i10 + 1;
                this.poll2vMultipleRow = i10;
            }
            if (!ChatObject.isChannel(currentChat) || currentChat.megagroup) {
                int i11 = this.rowCount;
                this.rowCount = i11 + 1;
                this.poll2vAllowAddingRow = i11;
            } else {
                this.allowAddingOptions = false;
            }
            int i12 = this.rowCount;
            this.poll2vAllowRevotingRow = i12;
            int i13 = i12 + 2;
            this.rowCount = i13;
            this.poll2vShuffleRow = i12 + 1;
            if (this.quizOnly == 0) {
                this.rowCount = i12 + 3;
                this.poll2vQuizRow = i13;
            }
            int i14 = this.rowCount;
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.poll2vLimitDurationRow = i14;
            if (this.pollLimitDuration != 0 || this.pollLimitDeadline != 0) {
                this.poll2vLimitDurationTimeRow = i15;
                this.poll2vLimitDurationHideResultsRow = i14 + 2;
                this.rowCount = i14 + 4;
                this.poll2vLimitDurationHideResultsRowInfo = i14 + 3;
            }
            int i16 = this.rowCount;
            int i17 = i16 + 1;
            this.rowCount = i17;
            this.settingsSectionRow = i16;
            if (this.quizPoll) {
                this.solutionRowHeader = i17;
                this.solutionRow = i16 + 2;
                this.rowCount = i16 + 4;
                this.solutionInfoRow = i16 + 3;
            }
        }
        int i18 = this.rowCount;
        this.rowCount = i18 + 1;
        this.emptyRow = i18;
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
                    this.f$0.lambda$checkDiscard$9(alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
        return zIsEmpty;
    }

    public void lambda$checkDiscard$9(AlertDialog alertDialog, int i) {
        this.parentAlert.lambda$new$0();
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    public void setTextLeft(android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPollLayout.setTextLeft(android.view.View, int):void");
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
                        this.f$0.lambda$showEmojiPopup$10(valueAnimator);
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

    public void lambda$showEmojiPopup$10(ValueAnimator valueAnimator) {
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
                            this.f$0.lambda$hideEmojiPopup$11(valueAnimator);
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

    public void lambda$hideEmojiPopup$11(ValueAnimator valueAnimator) {
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
        public boolean canAddCaptionToGif(TLRPC.Document document) {
            return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
        }

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
        public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
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
                this.f$0.lambda$animateEmojiViewTranslationY$12(f, f2, valueAnimator);
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

    public void lambda$animateEmojiViewTranslationY$12(float f, float f2, ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public void checkDurationInfoRow(TextCell textCell, boolean z) {
        if (this.pollLimitDeadline != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.pollLimitDeadline), z, false);
        } else if (this.pollLimitDuration != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.pollLimitDuration / 3600, new Object[0]), z, false);
        } else {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), null, z, false);
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context mContext;

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
            boolean z = true;
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != ChatAttachAlertPollLayout.this.questionHeaderRow) {
                    if (i == ChatAttachAlertPollLayout.this.solutionRowHeader) {
                        headerCell.getTextView().setGravity(19);
                        headerCell.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                        return;
                    }
                    headerCell.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    if (i == ChatAttachAlertPollLayout.this.answerHeaderRow) {
                        if (ChatAttachAlertPollLayout.this.quizOnly == 1) {
                            headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                            return;
                        } else {
                            headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                            return;
                        }
                    }
                    if (i == ChatAttachAlertPollLayout.this.settingsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.Settings));
                        return;
                    }
                    return;
                }
                headerCell.getTextView().setGravity(19);
                headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), ChatAttachAlertPollLayout.this.allowAdding, ChatAttachAlertPollLayout.this.allowMarkingRow != -1);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else if (i == ChatAttachAlertPollLayout.this.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), ChatAttachAlertPollLayout.this.allowMarking, false);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else {
                    if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollV2HideResults), ChatAttachAlertPollLayout.this.hideResults, false);
                        textCheckCell.setEnabled(true, null);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                if (i != ChatAttachAlertPollLayout.this.solutionInfoRow) {
                    if (i != ChatAttachAlertPollLayout.this.settingsSectionRow) {
                        if (ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount <= 0) {
                            textInfoPrivacyCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                            return;
                        }
                        if (ChatAttachAlertPollLayout.this.todo) {
                            textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount));
                            return;
                        } else if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRowInfo) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                            return;
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount, new Object[0])));
                            return;
                        }
                    }
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText(null);
                    return;
                }
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (itemViewType == 3) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow) {
                    ChatAttachAlertPollLayout.this.checkDurationInfoRow(textCell, false);
                    return;
                }
                textCell.setColors(-1, Theme.key_telegram_color_text);
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                int themedColor = ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_switchTrackChecked);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_checkboxCheck), mode));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                textCell.imageLeft = 20;
                textCell.offsetFromImage = 58;
                return;
            }
            if (itemViewType == 9) {
                viewHolder.itemView.requestLayout();
                return;
            }
            if (itemViewType != 10) {
                return;
            }
            PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) viewHolder.itemView;
            pollCreateCheckCell.setDivider(false);
            if (i != ChatAttachAlertPollLayout.this.poll2vAnonymousRow) {
                if (i != ChatAttachAlertPollLayout.this.poll2vMultipleRow) {
                    if (i != ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow) {
                        if (i != ChatAttachAlertPollLayout.this.poll2vAllowAddingRow) {
                            if (i != ChatAttachAlertPollLayout.this.poll2vShuffleRow) {
                                if (i != ChatAttachAlertPollLayout.this.poll2vQuizRow) {
                                    if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow) {
                                        pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), IconBackgroundColors.RED, R.drawable.filled_poll_deadline_24, (ChatAttachAlertPollLayout.this.pollLimitDuration == 0 && ChatAttachAlertPollLayout.this.pollLimitDeadline == 0) ? false : true);
                                        pollCreateCheckCell.setDivider((ChatAttachAlertPollLayout.this.pollLimitDuration == 0 && ChatAttachAlertPollLayout.this.pollLimitDeadline == 0) ? false : true);
                                    }
                                } else {
                                    pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), IconBackgroundColors.GREEN, R.drawable.filled_poll_correct_24, ChatAttachAlertPollLayout.this.quizPoll);
                                }
                            } else {
                                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), IconBackgroundColors.ORANGE_DEEP, R.drawable.filled_poll_shuffle_24, ChatAttachAlertPollLayout.this.shuffleOptions);
                            }
                        } else {
                            pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), IconBackgroundColors.CYAN, R.drawable.filled_poll_add_24, ChatAttachAlertPollLayout.this.allowAddingOptions);
                        }
                    } else {
                        pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), IconBackgroundColors.PURPLE, R.drawable.filled_poll_revote_24, ChatAttachAlertPollLayout.this.allowRevoting);
                    }
                } else {
                    pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), IconBackgroundColors.ORANGE, R.drawable.filled_poll_multiple_24, ChatAttachAlertPollLayout.this.multipleChoise);
                }
            } else {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), IconBackgroundColors.BLUE, R.drawable.filled_poll_view_24, !ChatAttachAlertPollLayout.this.anonymousPoll);
            }
            if (i == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow) {
                Switch checkBox = pollCreateCheckCell.getCheckBox();
                if (!ChatAttachAlertPollLayout.this.quizPoll && !ChatAttachAlertPollLayout.this.anonymousPoll) {
                    z = false;
                }
                checkBox.setIconVisible(z, false);
                return;
            }
            pollCreateCheckCell.getCheckBox().setIconVisible(false, false);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                pollEditTextCell.setTextAndHint(ChatAttachAlertPollLayout.this.questionString != null ? ChatAttachAlertPollLayout.this.questionString : "", LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType == 11) {
                PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell2.setTag(1);
                pollEditTextCell2.setTextAndHint(ChatAttachAlertPollLayout.this.descriptionString != null ? ChatAttachAlertPollLayout.this.descriptionString : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
                pollEditTextCell2.setTag(null);
                pollEditTextCell2.attachView.setAttachedMedia(ChatAttachAlertPollLayout.this.attachedMedia.get(-2), false);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell3.setTag(1);
                    pollEditTextCell3.setTextAndHint(ChatAttachAlertPollLayout.this.solutionString != null ? ChatAttachAlertPollLayout.this.solutionString : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell3.setTag(null);
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell3.attachView.setAttachedMedia(ChatAttachAlertPollLayout.this.attachedMedia.get(-3), false);
                    }
                    ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell4 = (PollEditTextCell) viewHolder.itemView;
            pollEditTextCell4.setTag(1);
            pollEditTextCell4.setCheckboxMultiselect(ChatAttachAlertPollLayout.this.multipleChoise, false);
            int i = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
            pollEditTextCell4.setTextAndHint(ChatAttachAlertPollLayout.this.answers[i], LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell4.setTag(null);
            if (ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell4.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition = -1;
            }
            if (!ChatAttachAlertPollLayout.this.todo) {
                pollEditTextCell4.attachView.setAttachedMedia(ChatAttachAlertPollLayout.this.attachedMedia.get(i), false);
            }
            ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, adapterPosition);
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 11 || viewHolder.getItemViewType() == 5) {
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
            return adapterPosition == ChatAttachAlertPollLayout.this.addAnswerRow || (ChatAttachAlertPollLayout.this.quizOnly == 0 && adapterPosition == ChatAttachAlertPollLayout.this.poll2vQuizRow) || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAnonymousRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vMultipleRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vShuffleRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(-2);
        }

        public void lambda$onCreateViewHolder$1(View view) {
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(-3);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
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
                case 11:
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
                                ChatAttachAlertPollLayout.access$2308(ChatAttachAlertPollLayout.this);
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
                    if (i == 11 && !ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell.setTextRight(98);
                        pollEditTextCell.addAttachView().setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onCreateViewHolder$0(view);
                            }
                        });
                    }
                    pollEditTextCell.createErrorTextView();
                    pollEditTextCell.setIconsColor(Theme.key_pollCreateIcons);
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
                            int i2 = i == 11 ? ChatAttachAlertPollLayout.this.descriptionRow : ChatAttachAlertPollLayout.this.questionRow;
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i2);
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
                            if (i == 11) {
                                ChatAttachAlertPollLayout.this.descriptionString = editable;
                            } else {
                                ChatAttachAlertPollLayout.this.questionString = editable;
                            }
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout.this.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, i2);
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
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$2(view);
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
                            if (z3 && ChatAttachAlertPollLayout.this.quizPoll && !ChatAttachAlertPollLayout.this.multipleChoise) {
                                Arrays.fill(ChatAttachAlertPollLayout.this.answersChecks, false);
                                ChatAttachAlertPollLayout.this.listView.getChildCount();
                                for (int i2 = ChatAttachAlertPollLayout.this.answerStartRow; i2 < ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answersCount; i2++) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i2);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        if (view instanceof PollEditTextCell) {
                                            ((PollEditTextCell) view).setChecked(false, true);
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
                                ChatAttachAlertPollLayout.access$2308(ChatAttachAlertPollLayout.this);
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
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell2.setTextRight(140);
                        pollEditTextCell2.addAttachView().setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onCreateViewHolder$3(pollEditTextCell2, view);
                            }
                        });
                    }
                    int i2 = Theme.key_pollCreateIcons;
                    pollEditTextCell2.setIconsColor(i2);
                    pollEditTextCell2.supportMultiselect();
                    pollEditTextCell2.getCheckBox().setColor(-1, i2, Theme.key_checkboxCheck);
                    pollEditTextCell2.addTextWatcher(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
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
                        public final boolean onEditorAction(TextView textView2, int i3, KeyEvent keyEvent) {
                            return this.f$0.lambda$onCreateViewHolder$4(pollEditTextCell2, textView2, i3, keyEvent);
                        }
                    });
                    textView.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                            return ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$5(pollEditTextCell2, view, i3, keyEvent);
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
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell3.setTextRight(98);
                        pollEditTextCell3.addAttachView().setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onCreateViewHolder$1(view);
                            }
                        });
                    }
                    pollEditTextCell3.setIconsColor(Theme.key_pollCreateIcons);
                    pollEditTextCell3.addTextWatcher(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
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
                    headerCell = emptyView;
                    break;
                case 9:
                    View view = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            setMeasuredDimension(View.MeasureSpec.getSize(i3), ChatAttachAlertPollLayout.this.topPadding);
                        }
                    };
                    view.setTag(-33024);
                    headerCell = view;
                    break;
                case 10:
                    PollCreateCheckCell pollCreateCheckCell = new PollCreateCheckCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    pollCreateCheckCell.getCheckBox().setIcon(R.drawable.permission_locked);
                    headerCell = pollCreateCheckCell;
                    break;
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }

        public void lambda$onCreateViewHolder$2(android.view.View r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$2(android.view.View):void");
        }

        public void lambda$onCreateViewHolder$3(PollEditTextCell pollEditTextCell, View view) {
            int adapterPosition;
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
            if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition() - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition >= ChatAttachAlertPollLayout.this.answers.length) {
                return;
            }
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(adapterPosition);
        }

        public boolean lambda$onCreateViewHolder$4(PollEditTextCell pollEditTextCell, TextView textView, int i, KeyEvent keyEvent) {
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

        public static boolean lambda$onCreateViewHolder$5(PollEditTextCell pollEditTextCell, View view, int i, KeyEvent keyEvent) {
            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
            if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                return false;
            }
            pollEditTextCell.callOnDelete();
            return true;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ChatAttachAlertPollLayout.this.poll2vAnonymousRow || i == ChatAttachAlertPollLayout.this.poll2vMultipleRow || i == ChatAttachAlertPollLayout.this.poll2vQuizRow || i == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow || i == ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow || i == ChatAttachAlertPollLayout.this.poll2vShuffleRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow) {
                return 10;
            }
            if (i == ChatAttachAlertPollLayout.this.questionHeaderRow || i == ChatAttachAlertPollLayout.this.answerHeaderRow || i == ChatAttachAlertPollLayout.this.settingsHeaderRow || i == ChatAttachAlertPollLayout.this.solutionRowHeader) {
                return 0;
            }
            if (i == ChatAttachAlertPollLayout.this.questionSectionRow) {
                return 1;
            }
            if (i == ChatAttachAlertPollLayout.this.answerSectionRow || i == ChatAttachAlertPollLayout.this.settingsSectionRow || i == ChatAttachAlertPollLayout.this.solutionInfoRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRowInfo) {
                return 2;
            }
            if (i == ChatAttachAlertPollLayout.this.addAnswerRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow) {
                return 3;
            }
            if (i == ChatAttachAlertPollLayout.this.questionRow) {
                return 4;
            }
            if (i == ChatAttachAlertPollLayout.this.descriptionRow) {
                return 11;
            }
            if (i == ChatAttachAlertPollLayout.this.solutionRow) {
                return 7;
            }
            if (i == ChatAttachAlertPollLayout.this.allowAddingRow || i == ChatAttachAlertPollLayout.this.allowMarkingRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow) {
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
            PollAttachedMedia pollAttachedMedia = ChatAttachAlertPollLayout.this.attachedMedia.get(i3);
            ChatAttachAlertPollLayout.this.attachedMedia.set(i3, ChatAttachAlertPollLayout.this.attachedMedia.get(i4));
            ChatAttachAlertPollLayout.this.attachedMedia.set(i4, pollAttachedMedia);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_telegram_color_text));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        return arrayList;
    }

    private int getAnswersMaxCount() {
        if (this.todo) {
            return getMessagesController().todoItemsMax;
        }
        return getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return chatAttachAlert != null ? chatAttachAlert.currentAccount : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    private void openEditOrReplaceMenu(final int i) {
        ChatAttachAlert chatAttachAlert;
        BaseFragment baseFragment;
        PollAttachedMedia pollAttachedMedia = this.attachedMedia.get(i);
        if (pollAttachedMedia == null || (chatAttachAlert = this.parentAlert) == null || (baseFragment = chatAttachAlert.baseFragment) == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        if (pollAttachedMedia instanceof PollAttachedMediaGallery) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((PollAttachedMediaGallery) pollAttachedMedia).photoEntry);
            PhotoViewer.getInstance().setParentActivity(parentActivity);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 14, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                private boolean openReplace;

                @Override
                public boolean allowCaption() {
                    return false;
                }

                @Override
                public void onPollAttachReplace() {
                    this.openReplace = true;
                }

                @Override
                public void onPollAttachDelete() {
                    ChatAttachAlertPollLayout.this.lambda$openAttachMenuForOptions$19(i, null);
                }

                @Override
                public void onClose() {
                    super.onClose();
                    if (this.openReplace) {
                        ChatAttachAlertPollLayout.this.lambda$showOptionsForDrawable$15(i);
                    }
                }
            }, null);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
            PollAttachedMediaSticker pollAttachedMediaSticker = (PollAttachedMediaSticker) pollAttachedMedia;
            ContentPreviewViewer.getInstance().setParentActivity(parentActivity);
            ContentPreviewViewer.getInstance().setDelegate(new AnonymousClass12(i));
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
            TLRPC.Document document = pollAttachedMediaSticker.sticker;
            contentPreviewViewer.open(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, pollAttachedMediaSticker.parent, this.resourcesProvider, 200);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaFile) {
            PollAttachedMediaFile pollAttachedMediaFile = (PollAttachedMediaFile) pollAttachedMedia;
            final String str = pollAttachedMediaFile.name;
            final String str2 = AndroidUtilities.formatFileSize(pollAttachedMediaFile.size, true, true) + " " + pollAttachedMediaFile.ext;
            showOptionsForDrawable(i, new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ChatAttachAlertPollLayout.lambda$openEditOrReplaceMenu$13(str, str2, (View) obj);
                }
            }, AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaMusic) {
            final PollAttachedMediaMusic pollAttachedMediaMusic = (PollAttachedMediaMusic) pollAttachedMedia;
            TLRPC.Document document2 = pollAttachedMediaMusic.messageObject.getDocument();
            final String musicTitle = MessageObject.getMusicTitle(document2, true);
            final String str3 = MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2));
            showOptionsForDrawable(i, new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ChatAttachAlertPollLayout.lambda$openEditOrReplaceMenu$14(musicTitle, str3, pollAttachedMediaMusic, (View) obj);
                }
            }, AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
            final PollAttachedMediaLocation pollAttachedMediaLocation = (PollAttachedMediaLocation) pollAttachedMedia;
            showOptionsForDrawable(i, new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return pollAttachedMediaLocation.createMessagePreviewDrawable((View) obj);
                }
            }, AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else {
            lambda$showOptionsForDrawable$15(i);
        }
    }

    class AnonymousClass12 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        final int val$index;

        @Override
        public void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public void addToFavoriteSelected(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
        }

        @Override
        public boolean can() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
        }

        @Override
        public boolean canAddCaption(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document);
        }

        @Override
        public boolean canDeleteSticker(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document);
        }

        @Override
        public boolean canEditSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
        }

        @Override
        public boolean canSchedule() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public boolean canSendSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
        }

        @Override
        public Boolean canSetAsStatus(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document);
        }

        @Override
        public void copyEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document);
        }

        @Override
        public void deleteSticker(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document);
        }

        @Override
        public void editSticker(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document);
        }

        @Override
        public long getDialogId() {
            return 0L;
        }

        @Override
        public TLRPC.TL_messageMediaPoll getPoll() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
        }

        @Override
        public TLRPC.PollAnswer getPollAnswer() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
        }

        @Override
        public MessageObject getPollMessageObject() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
        }

        @Override
        public String getQuery(boolean z) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
        }

        @Override
        public void gifAddedOrDeleted() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
        }

        @Override
        public boolean isInScheduleMode() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isPhotoEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
        }

        @Override
        public boolean isReplacedSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
        }

        @Override
        public boolean isSettingIntroSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
        }

        @Override
        public boolean isStickerEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
        }

        @Override
        public boolean needCopy(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document);
        }

        @Override
        public boolean needMenu() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
        }

        @Override
        public boolean needOpen() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
        }

        @Override
        public boolean needRemove() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
        }

        @Override
        public boolean needRemoveFromRecent(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document);
        }

        @Override
        public boolean needSend(int i) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needSend(this, i);
        }

        @Override
        public void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
        }

        @Override
        public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$openSet(this, inputStickerSet, z);
        }

        @Override
        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
        }

        @Override
        public void removeFromRecent(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document);
        }

        @Override
        public void resetTouch() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
        }

        @Override
        public void retractVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
        }

        @Override
        public void sendEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document);
        }

        @Override
        public void sendGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public void sendSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str);
        }

        @Override
        public void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, document, str, obj, z, i, i2);
        }

        @Override
        public void sendVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
        }

        @Override
        public void setAsEmojiStatus(TLRPC.Document document, Integer num) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document, num);
        }

        @Override
        public void setIntroSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
        }

        @Override
        public void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str);
        }

        AnonymousClass12(int i) {
            this.val$index = i;
        }

        @Override
        public ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
            ItemOptions drawScrim = ItemOptions.makeOptions(viewGroup, new View(ChatAttachAlertPollLayout.this.getContext())).setDimAlpha(0).setDrawScrim(false);
            int i = R.drawable.msg_replace;
            String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
            final int i2 = this.val$index;
            ItemOptions itemOptionsAdd = drawScrim.add(i, string, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getCustomItemOptions$0(i2);
                }
            });
            int i3 = R.drawable.msg_delete;
            String string2 = LocaleController.getString(R.string.Delete);
            final int i4 = this.val$index;
            return itemOptionsAdd.add(i3, (CharSequence) string2, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getCustomItemOptions$1(i4);
                }
            });
        }

        public void lambda$getCustomItemOptions$0(int i) {
            ChatAttachAlertPollLayout.this.lambda$showOptionsForDrawable$15(i);
        }

        public void lambda$getCustomItemOptions$1(int i) {
            ChatAttachAlertPollLayout.this.lambda$openAttachMenuForOptions$19(i, null);
        }
    }

    public static Drawable lambda$openEditOrReplaceMenu$13(String str, String str2, View view) {
        return PollAttachedMediaFile.createMessagePreviewDrawable(view, str, str2, null, null);
    }

    public static Drawable lambda$openEditOrReplaceMenu$14(String str, String str2, PollAttachedMediaMusic pollAttachedMediaMusic, View view) {
        return PollAttachedMediaFile.createMessagePreviewDrawable(view, str, str2, pollAttachedMediaMusic.messageObject.getDocument(), pollAttachedMediaMusic.messageObject);
    }

    private void showOptionsForDrawable(final int i, Utilities.CallbackReturn callbackReturn, int i2, int i3) {
        ItemOptions itemOptionsAdd = ItemOptions.makeOptions(this, new View(getContext())).setDimAlpha(0).setDrawScrim(false).add(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showOptionsForDrawable$15(i);
            }
        }).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showOptionsForDrawable$16(i);
            }
        });
        ScrimOptions scrimOptions = new ScrimOptions(getContext(), this.resourcesProvider);
        itemOptionsAdd.setOnDismiss(new ChatActivity$$ExternalSyntheticLambda277(scrimOptions));
        itemOptionsAdd.setMinWidth(AndroidUtilities.dp(185.0f));
        itemOptionsAdd.setupSelectors();
        scrimOptions.setItemOptions(itemOptionsAdd);
        scrimOptions.setScrimDrawable((Drawable) callbackReturn.run(scrimOptions.getWindowView()), i2, i3);
        scrimOptions.setOptionsAtCenter();
        scrimOptions.show();
    }

    public void lambda$showOptionsForDrawable$16(int i) {
        lambda$openAttachMenuForOptions$19(i, null);
    }

    public void openAttachOrReplaceMenuForOptions(int i) {
        if (this.attachedMedia.get(i) != null) {
            openEditOrReplaceMenu(i);
        } else {
            lambda$showOptionsForDrawable$15(i);
        }
    }

    public static ChatAttachAlert openPollAttachMenu(final BaseFragment baseFragment, int i, int i2, final Utilities.Callback callback, final Runnable runnable) {
        if (baseFragment == null) {
            return null;
        }
        boolean z = false;
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(baseFragment.getContext(), baseFragment, z, false, true, baseFragment.getResourceProvider()) {
            @Override
            public void dismissInternal() {
                super.dismissInternal();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public void didSelectBot(TLRPC.User user) {
            }

            @Override
            public boolean needEnterComment() {
                return false;
            }

            @Override
            public void onCameraOpened() {
            }

            @Override
            public void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i3, int i4, long j, boolean z3, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z2, i3, i4, j, z3, j2);
            }

            @Override
            public void didPressedButton(int i3, boolean z2, boolean z3, int i4, int i5, long j, boolean z4, boolean z5, long j2) {
                if (i3 == 7) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    if (selectedPhotosOrder.size() > 0) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            String str = photoEntry.imagePath;
                            if (str != null) {
                                sendingMediaInfo.path = str;
                            } else {
                                sendingMediaInfo.path = photoEntry.path;
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo.isVideo = photoEntry.isVideo;
                            CharSequence charSequence = photoEntry.caption;
                            sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                            sendingMediaInfo.entities = photoEntry.entities;
                            sendingMediaInfo.masks = photoEntry.stickers;
                            sendingMediaInfo.ttl = photoEntry.ttl;
                            sendingMediaInfo.emojiMarkup = photoEntry.emojiMarkup;
                            sendingMediaInfo.originalPhotoEntry = photoEntry;
                        } else if (obj instanceof MediaController.SearchImage) {
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                            String str2 = searchImage.imagePath;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                sendingMediaInfo.searchImage = searchImage;
                            }
                            sendingMediaInfo.thumbPath = searchImage.thumbPath;
                            sendingMediaInfo.coverPath = searchImage.coverPath;
                            sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                            CharSequence charSequence2 = searchImage.caption;
                            sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                            sendingMediaInfo.entities = searchImage.entities;
                            sendingMediaInfo.masks = searchImage.stickers;
                            sendingMediaInfo.ttl = searchImage.ttl;
                            TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                            if (botInlineResult != null && searchImage.type == 1) {
                                sendingMediaInfo.inlineResult = botInlineResult;
                                sendingMediaInfo.params = searchImage.params;
                            }
                            searchImage.date = (int) (System.currentTimeMillis() / 1000);
                        }
                        callback.run(new PollAttachedMediaGallery(sendingMediaInfo));
                    }
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void doOnIdle(Runnable runnable2) {
                NotificationCenter.getInstance(baseFragment.getCurrentAccount()).doOnIdle(runnable2);
            }
        });
        chatAttachAlert.setEmojiViewDelegate(new EmojiView.EmojiViewDelegate() {
            @Override
            public boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
            }

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
            public boolean onBackspace() {
                return EmojiView.EmojiViewDelegate.CC.$default$onBackspace(this);
            }

            @Override
            public void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
            }

            @Override
            public void onEmojiSelected(String str) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSelected(this, str);
            }

            @Override
            public void onEmojiSettingsClick(ArrayList arrayList) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
            }

            @Override
            public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z2, int i3, int i4) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z2, i3, i4);
            }

            @Override
            public void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z2, int i3, int i4) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z2, i3, i4);
            }

            @Override
            public void onSearchOpenClose(int i3) {
                EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i3);
            }

            @Override
            public void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z2) {
                EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z2);
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
            public void onTabOpened(int i3) {
                EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i3);
            }

            @Override
            public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }

            @Override
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z2) {
                callback.run(new PollAttachedMediaSticker(document, null));
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, int i3, int i4) {
                callback.run(new PollAttachedMediaSticker(document, obj));
                chatAttachAlert.dismiss(true);
            }
        });
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i, i2);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
            @Override
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z2, int i4, long j) {
                ChatAttachAlertPollLayout.lambda$openPollAttachMenu$17(callback, messageMedia, i3, z2, i4, j);
            }
        });
        chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public void startMusicSelectActivity() {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
            }

            @Override
            public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z2, int i3, int i4, long j, boolean z3, long j2) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaFile((String) arrayList.get(0)));
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void didSelectPhotos(ArrayList arrayList, boolean z2, int i3, int i4, long j) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaGallery((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    baseFragment.getParentActivity().startActivityForResult(intent, 28);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() {
            @Override
            public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i3, int i4, long j, boolean z3, long j2) {
                ChatAttachAlertPollLayout.lambda$openPollAttachMenu$18(callback, chatAttachAlert, arrayList, charSequence, z2, i3, i4, j, z3, j2);
            }
        });
        chatAttachAlert.init();
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
        return chatAttachAlert;
    }

    public static void lambda$openPollAttachMenu$17(Utilities.Callback callback, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        callback.run(new PollAttachedMediaLocation(messageMedia));
    }

    public static void lambda$openPollAttachMenu$18(Utilities.Callback callback, ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            callback.run(new PollAttachedMediaMusic((MessageObject) arrayList.get(0)));
        }
        chatAttachAlert.dismiss(true);
    }

    public void lambda$showOptionsForDrawable$15(final int i) {
        this.currentAttachAlertIndex = i;
        this.currentAttachAlert = openPollAttachMenu(this.parentAlert.baseFragment, getStartLayoutForMedia(this.attachedMedia.get(i)), getAllowedLayoutsForIndex(i), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openAttachMenuForOptions$19(i, (PollAttachedMedia) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openAttachMenuForOptions$20();
            }
        });
    }

    public void lambda$openAttachMenuForOptions$20() {
        this.currentAttachAlertIndex = -1;
        this.currentAttachAlert = null;
    }

    public void onPollAttachFilePicker(android.content.Intent r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPollLayout.onPollAttachFilePicker(android.content.Intent):void");
    }

    public static int getStartLayoutForMedia(PollAttachedMedia pollAttachedMedia) {
        if (pollAttachedMedia instanceof PollAttachedMediaMusic) {
            return 3;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaFile) {
            return 4;
        }
        return pollAttachedMedia instanceof PollAttachedMediaSticker ? ((PollAttachedMediaSticker) pollAttachedMedia).isEmoji ? 14 : 13 : pollAttachedMedia instanceof PollAttachedMediaLocation ? 6 : 1;
    }

    private int mediaIndexToAdapterPosition(int i) {
        if (i == -2) {
            return this.descriptionRow;
        }
        if (i == -3) {
            return this.solutionRow;
        }
        int i2 = this.answerStartRow;
        if (i2 < 0 || i < 0 || i >= this.answersCount) {
            return -1;
        }
        return i2 + i;
    }

    public void lambda$openAttachMenuForOptions$19(int i, PollAttachedMedia pollAttachedMedia) {
        this.attachedMedia.set(i, pollAttachedMedia);
        int iMediaIndexToAdapterPosition = mediaIndexToAdapterPosition(i);
        if (iMediaIndexToAdapterPosition >= 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iMediaIndexToAdapterPosition);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    ((PollEditTextCell) view).attachView.setAttachedMedia(pollAttachedMedia, true);
                    return;
                }
            }
            this.listAdapter.notifyItemChanged(iMediaIndexToAdapterPosition);
        }
    }
}
