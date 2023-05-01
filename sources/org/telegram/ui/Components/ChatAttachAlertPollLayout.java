package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_poll;
import org.telegram.tgnet.TLRPC$TL_pollAnswer;
import org.telegram.tgnet.TLRPC$TL_pollResults;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
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
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.RecyclerListView;
public class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout {
    private int addAnswerRow;
    private boolean allowNesterScroll;
    private boolean anonymousPoll;
    private int anonymousRow;
    private int answerHeaderRow;
    private int answerSectionRow;
    private int answerStartRow;
    private String[] answers;
    private boolean[] answersChecks;
    private int answersCount;
    private PollCreateActivityDelegate delegate;
    private int emptyRow;
    private boolean hintShowed;
    private HintView hintView;
    private boolean ignoreLayout;
    private SimpleItemAnimator itemAnimator;
    private FillLastLinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean multipleChoise;
    private int multipleRow;
    private int paddingRow;
    private int questionHeaderRow;
    private int questionRow;
    private int questionSectionRow;
    private String questionString;
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
    private int topPadding;

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap<String, String> hashMap, boolean z, int i);
    }

    @Override
    int needsActionBar() {
        return 1;
    }

    static int access$1210(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
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
        this.answers = new String[10];
        this.answersChecks = new boolean[10];
        this.answersCount = 1;
        this.anonymousPoll = true;
        this.requestFieldFocusAtPosition = -1;
        updateRows();
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
        checkDoneButton();
    }

    public void lambda$new$0(View view, int i) {
        boolean z;
        if (i == this.addAnswerRow) {
            addNewField();
        } else if (view instanceof TextCheckCell) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z2 = this.quizPoll;
            if (i == this.anonymousRow) {
                z = !this.anonymousPoll;
                this.anonymousPoll = z;
            } else if (i == this.multipleRow) {
                z = !this.multipleChoise;
                this.multipleChoise = z;
                if (z && z2) {
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
    public void onResume() {
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    void onHideShowProgress(float f) {
        ActionBarMenuItem actionBarMenuItem = this.parentAlert.doneItem;
        actionBarMenuItem.setAlpha((actionBarMenuItem.isEnabled() ? 1.0f : 0.5f) * f);
    }

    @Override
    void onMenuItemClick(int i) {
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
            final TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll = new TLRPC$TL_messageMediaPoll();
            TLRPC$TL_poll tLRPC$TL_poll = new TLRPC$TL_poll();
            tLRPC$TL_messageMediaPoll.poll = tLRPC$TL_poll;
            tLRPC$TL_poll.multiple_choice = this.multipleChoise;
            tLRPC$TL_poll.quiz = this.quizPoll;
            tLRPC$TL_poll.public_voters = !this.anonymousPoll;
            tLRPC$TL_poll.question = getFixedString(this.questionString).toString();
            SerializedData serializedData = new SerializedData(10);
            int i4 = 0;
            while (true) {
                String[] strArr = this.answers;
                if (i4 >= strArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(getFixedString(strArr[i4]))) {
                    TLRPC$TL_pollAnswer tLRPC$TL_pollAnswer = new TLRPC$TL_pollAnswer();
                    tLRPC$TL_pollAnswer.text = getFixedString(this.answers[i4]).toString();
                    tLRPC$TL_pollAnswer.option = r5;
                    byte[] bArr = {(byte) (tLRPC$TL_messageMediaPoll.poll.answers.size() + 48)};
                    tLRPC$TL_messageMediaPoll.poll.answers.add(tLRPC$TL_pollAnswer);
                    if ((this.multipleChoise || this.quizPoll) && this.answersChecks[i4]) {
                        serializedData.writeByte(tLRPC$TL_pollAnswer.option[0]);
                    }
                }
                i4++;
            }
            final HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("answers", Utilities.bytesToHex(serializedData.toByteArray()));
            tLRPC$TL_messageMediaPoll.results = new TLRPC$TL_pollResults();
            CharSequence fixedString = getFixedString(this.solutionString);
            if (fixedString != null) {
                tLRPC$TL_messageMediaPoll.results.solution = fixedString.toString();
                ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                if (entities != null && !entities.isEmpty()) {
                    tLRPC$TL_messageMediaPoll.results.solution_entities = entities;
                }
                if (!TextUtils.isEmpty(tLRPC$TL_messageMediaPoll.results.solution)) {
                    tLRPC$TL_messageMediaPoll.results.flags |= 16;
                }
            }
            ChatActivity chatActivity = (ChatActivity) this.parentAlert.baseFragment;
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i5) {
                        ChatAttachAlertPollLayout.this.lambda$onMenuItemClick$1(tLRPC$TL_messageMediaPoll, hashMap, z, i5);
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
    int getFirstOffset() {
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
    int getButtonsHideOffset() {
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
    void scrollToTop() {
        this.listView.smoothScrollToPosition(1);
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
            String[] strArr = this.answers;
            if (i3 >= strArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(getFixedString(strArr[i3]))) {
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
    void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
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
    public void onHidden() {
        this.parentAlert.doneItem.setVisibility(4);
    }

    @Override
    public boolean onBackPressed() {
        if (checkDiscard()) {
            return super.onBackPressed();
        }
        return true;
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
                String str = this.questionString;
                length = 255 - (str != null ? str.length() : 0);
                i2 = 255;
            } else if (i == this.solutionRow) {
                CharSequence charSequence = this.solutionString;
                length = 200 - (charSequence != null ? charSequence.length() : 0);
                i2 = 200;
            } else {
                int i3 = this.answerStartRow;
                if (i < i3 || i >= this.answersCount + i3) {
                    return;
                }
                int i4 = i - i3;
                String[] strArr = this.answers;
                length = 100 - (strArr[i4] != null ? strArr[i4].length() : 0);
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
            pollEditTextCell.setText2(BuildConfig.APP_CENTER_HASH);
        }
    }

    public void addNewField() {
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
            CharSequence charSequence = BuildConfig.APP_CENTER_HASH;
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                if (ChatAttachAlertPollLayout.this.questionString != null) {
                    charSequence = ChatAttachAlertPollLayout.this.questionString;
                }
                pollEditTextCell.setTextAndHint(charSequence, LocaleController.getString("QuestionHint", R.string.QuestionHint), false);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
            } else if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell2.setTag(1);
                    if (ChatAttachAlertPollLayout.this.solutionString != null) {
                        charSequence = ChatAttachAlertPollLayout.this.solutionString;
                    }
                    pollEditTextCell2.setTextAndHint(charSequence, LocaleController.getString("AddAnExplanation", R.string.AddAnExplanation), false);
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
            if (viewHolder.getItemViewType() == 4) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
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
            final PollEditTextCell pollEditTextCell;
            PollEditTextCell pollEditTextCell2;
            switch (i) {
                case 0:
                    pollEditTextCell2 = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false);
                    break;
                case 1:
                    View shadowSectionCell = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    shadowSectionCell.setBackgroundDrawable(combinedDrawable);
                    pollEditTextCell2 = shadowSectionCell;
                    break;
                case 2:
                    pollEditTextCell2 = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 3:
                    pollEditTextCell2 = new TextCell(this.mContext);
                    break;
                case 4:
                    pollEditTextCell = new PollEditTextCell(this.mContext, null) {
                        @Override
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
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
                            ChatAttachAlertPollLayout.this.questionString = editable.toString();
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.questionRow);
                            if (findViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(findViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.questionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    pollEditTextCell2 = pollEditTextCell;
                    break;
                case 5:
                default:
                    final PollEditTextCell pollEditTextCell3 = new PollEditTextCell(this.mContext, new View.OnClickListener() {
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
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        public void onCheckBoxClick(PollEditTextCell pollEditTextCell4, boolean z) {
                            int adapterPosition;
                            if (z && ChatAttachAlertPollLayout.this.quizPoll) {
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
                            super.onCheckBoxClick(pollEditTextCell4, z);
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell4);
                            if (findContainingViewHolder != null && (adapterPosition = findContainingViewHolder.getAdapterPosition()) != -1) {
                                ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow] = z;
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        protected boolean isChecked(PollEditTextCell pollEditTextCell4) {
                            int adapterPosition;
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell4);
                            if (findContainingViewHolder == null || (adapterPosition = findContainingViewHolder.getAdapterPosition()) == -1) {
                                return false;
                            }
                            return ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow];
                        }
                    };
                    pollEditTextCell3.addTextWatcher(new TextWatcher() {
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
                            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (findContainingViewHolder == null || (adapterPosition2 = (adapterPosition = findContainingViewHolder.getAdapterPosition()) - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition2 >= ChatAttachAlertPollLayout.this.answers.length) {
                                return;
                            }
                            ChatAttachAlertPollLayout.this.answers[adapterPosition2] = editable.toString();
                            ChatAttachAlertPollLayout.this.setTextLeft(pollEditTextCell3, adapterPosition);
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    pollEditTextCell3.setShowNextButton(true);
                    EditTextBoldCursor textView = pollEditTextCell3.getTextView();
                    textView.setImeOptions(textView.getImeOptions() | 5);
                    textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                            boolean lambda$onCreateViewHolder$1;
                            lambda$onCreateViewHolder$1 = ChatAttachAlertPollLayout.ListAdapter.this.lambda$onCreateViewHolder$1(pollEditTextCell3, textView2, i2, keyEvent);
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
                    pollEditTextCell2 = pollEditTextCell3;
                    break;
                case 6:
                    pollEditTextCell2 = new TextCheckCell(this.mContext);
                    break;
                case 7:
                    pollEditTextCell = new PollEditTextCell(this.mContext, true, null) {
                        @Override
                        protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        protected void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).fillActionModeMenu(menu);
                            }
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
                            ChatAttachAlertPollLayout.this.solutionString = editable;
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.solutionRow);
                            if (findViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(findViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.solutionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }
                    });
                    pollEditTextCell2 = pollEditTextCell;
                    break;
                case 8:
                    View emptyView = new EmptyView(this.mContext);
                    emptyView.setBackgroundColor(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray));
                    pollEditTextCell2 = emptyView;
                    break;
                case 9:
                    pollEditTextCell2 = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            setMeasuredDimension(View.MeasureSpec.getSize(i2), ChatAttachAlertPollLayout.this.topPadding);
                        }
                    };
                    break;
            }
            pollEditTextCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(pollEditTextCell2);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            int adapterPosition;
            if (view.getTag() != null) {
                return;
            }
            view.setTag(1);
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view.getParent();
            RecyclerView.ViewHolder findContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
            if (findContainingViewHolder == null || (adapterPosition = findContainingViewHolder.getAdapterPosition()) == -1) {
                return;
            }
            ChatAttachAlertPollLayout.this.listView.setItemAnimator(ChatAttachAlertPollLayout.this.itemAnimator);
            int i = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
            ChatAttachAlertPollLayout.this.listAdapter.notifyItemRemoved(adapterPosition);
            int i2 = i + 1;
            System.arraycopy(ChatAttachAlertPollLayout.this.answers, i2, ChatAttachAlertPollLayout.this.answers, i, (ChatAttachAlertPollLayout.this.answers.length - 1) - i);
            System.arraycopy(ChatAttachAlertPollLayout.this.answersChecks, i2, ChatAttachAlertPollLayout.this.answersChecks, i, (ChatAttachAlertPollLayout.this.answersChecks.length - 1) - i);
            ChatAttachAlertPollLayout.this.answers[ChatAttachAlertPollLayout.this.answers.length - 1] = null;
            ChatAttachAlertPollLayout.this.answersChecks[ChatAttachAlertPollLayout.this.answersChecks.length - 1] = false;
            ChatAttachAlertPollLayout.access$1210(ChatAttachAlertPollLayout.this);
            if (ChatAttachAlertPollLayout.this.answersCount == ChatAttachAlertPollLayout.this.answers.length - 1) {
                ChatAttachAlertPollLayout.this.listAdapter.notifyItemInserted((ChatAttachAlertPollLayout.this.answerStartRow + ChatAttachAlertPollLayout.this.answers.length) - 1);
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(adapterPosition - 1);
            EditTextBoldCursor textView = pollEditTextCell.getTextView();
            if (findViewHolderForAdapterPosition != null) {
                View view2 = findViewHolderForAdapterPosition.itemView;
                if (view2 instanceof PollEditTextCell) {
                    ((PollEditTextCell) view2).getTextView().requestFocus();
                    textView.clearFocus();
                    ChatAttachAlertPollLayout.this.checkDoneButton();
                    ChatAttachAlertPollLayout.this.updateRows();
                    ChatAttachAlertPollLayout.this.listAdapter.notifyItemChanged(ChatAttachAlertPollLayout.this.answerSectionRow);
                    ChatAttachAlertPollLayout.this.listAdapter.notifyItemChanged(ChatAttachAlertPollLayout.this.emptyRow);
                }
            }
            if (textView.isFocused()) {
                AndroidUtilities.hideKeyboard(textView);
            }
            textView.clearFocus();
            ChatAttachAlertPollLayout.this.checkDoneButton();
            ChatAttachAlertPollLayout.this.updateRows();
            ChatAttachAlertPollLayout.this.listAdapter.notifyItemChanged(ChatAttachAlertPollLayout.this.answerSectionRow);
            ChatAttachAlertPollLayout.this.listAdapter.notifyItemChanged(ChatAttachAlertPollLayout.this.emptyRow);
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
            String str = ChatAttachAlertPollLayout.this.answers[i3];
            ChatAttachAlertPollLayout.this.answers[i3] = ChatAttachAlertPollLayout.this.answers[i4];
            ChatAttachAlertPollLayout.this.answers[i4] = str;
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
