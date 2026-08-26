package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;

public class ReactionsDoubleTapManageActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LinearLayout contentView;
    int infoRow;
    private RecyclerView.Adapter listAdapter;
    private RecyclerListView listView;
    int premiumReactionRow;
    int previewRow;
    int reactionsStartRow;
    int rowCount;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;

    public class SetDefaultReactionCell extends FrameLayout {
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
        private TextView textView;

        public SetDefaultReactionCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            this.textView.setTextColor(ReactionsDoubleTapManageActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.textView.setText(LocaleController.getString(R.string.DoubleTapSetting));
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
            this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(24.0f));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            updateImageBounds();
            this.imageDrawable.draw(canvas);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageDrawable.attach();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageDrawable.detach();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public void update(boolean z) {
            String doubleTapReaction = MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    this.imageDrawable.set(Long.parseLong(doubleTapReaction.substring(9)), z);
                    return;
                } catch (Exception unused) {
                }
            }
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction != null) {
                this.imageDrawable.set(tL_availableReaction.static_icon, z);
            }
        }

        public void updateImageBounds() {
            this.imageDrawable.setBounds((getWidth() - this.imageDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(21.0f), (getHeight() - this.imageDrawable.getIntrinsicHeight()) / 2, getWidth() - AndroidUtilities.dp(21.0f), (this.imageDrawable.getIntrinsicHeight() + getHeight()) / 2);
        }
    }

    public ReactionsDoubleTapManageActivity() {
        super(null);
        this.reactionsStartRow = -1;
    }

    public List<TLRPC.TL_availableReaction> getAvailableReactions() {
        return getMediaDataController().getReactionsList();
    }

    public void lambda$createView$0(View view, int i) {
        if (!(view instanceof AvailableReactionCell)) {
            if (view instanceof SetDefaultReactionCell) {
                showSelectStatusDialog((SetDefaultReactionCell) view);
                return;
            }
            return;
        }
        AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
        if (availableReactionCell.locked && !getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 4, true, null));
        } else {
            MediaDataController.getInstance(this.currentAccount).setDoubleTapReaction(availableReactionCell.react.reaction);
            this.listView.getAdapter().notifyItemRangeChanged(0, this.listView.getAdapter().getItemCount());
        }
    }

    public void updateColors() {
        this.contentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.listAdapter.notifyDataSetChanged();
    }

    private void updateRows() {
        this.previewRow = 0;
        this.rowCount = 2;
        this.infoRow = 1;
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.premiumReactionRow = -1;
            this.reactionsStartRow = this.rowCount;
        } else {
            this.reactionsStartRow = -1;
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.premiumReactionRow = i;
        }
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ReactionsDoubleTapManageActivity.this.finishFragment();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        RecyclerListView recyclerListView2 = this.listView;
        RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemCount() {
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                return reactionsDoubleTapManageActivity.rowCount + (reactionsDoubleTapManageActivity.premiumReactionRow < 0 ? reactionsDoubleTapManageActivity.getAvailableReactions().size() : 0) + 1;
            }

            @Override
            public int getItemViewType(int i) {
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                if (i == reactionsDoubleTapManageActivity.previewRow) {
                    return 0;
                }
                if (i == reactionsDoubleTapManageActivity.infoRow) {
                    return 2;
                }
                if (i == reactionsDoubleTapManageActivity.premiumReactionRow) {
                    return 3;
                }
                return i == getItemCount() - 1 ? 4 : 1;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 2;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) != 1) {
                    return;
                }
                AvailableReactionCell availableReactionCell = (AvailableReactionCell) viewHolder.itemView;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ReactionsDoubleTapManageActivity.this.getAvailableReactions().get(i - ReactionsDoubleTapManageActivity.this.reactionsStartRow);
                availableReactionCell.bind(tL_availableReaction, tL_availableReaction.reaction.contains(MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).getDoubleTapReaction()), ((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View availableReactionCell;
                if (i == 0) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, ((BaseFragment) ReactionsDoubleTapManageActivity.this).parentLayout, 2, 0L, null);
                    themePreviewMessagesCell.setImportantForAccessibility(4);
                    themePreviewMessagesCell.fragment = ReactionsDoubleTapManageActivity.this;
                    availableReactionCell = themePreviewMessagesCell;
                } else if (i == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
                    availableReactionCell = textInfoPrivacyCell;
                } else if (i == 3) {
                    SetDefaultReactionCell setDefaultReactionCell = ReactionsDoubleTapManageActivity.this.new SetDefaultReactionCell(context);
                    setDefaultReactionCell.update(false);
                    availableReactionCell = setDefaultReactionCell;
                } else if (i != 4) {
                    availableReactionCell = new AvailableReactionCell(context, true, true);
                } else {
                    View view = new View(context) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                        }
                    };
                    view.setTag(-33024);
                    availableReactionCell = view;
                }
                return new RecyclerListView.Holder(availableReactionCell);
            }
        };
        this.listAdapter = selectionAdapter;
        recyclerListView2.setAdapter(selectionAdapter);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 4));
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, -1));
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors();
        updateRows();
        return this.contentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.reactionsDidLoad) {
            this.listAdapter.notifyDataSetChanged();
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateRows();
            this.listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda18(this, 4), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public void showSelectStatusDialog(final SetDefaultReactionCell setDefaultReactionCell) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        SetDefaultReactionCell setDefaultReactionCell2;
        int iCenterX;
        int i;
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
        String doubleTapReaction;
        List<TLRPC.TL_availableReaction> availableReactions;
        ArrayList arrayList;
        int i2;
        if (this.selectAnimatedEmojiDialog != null) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        if (setDefaultReactionCell != null) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = setDefaultReactionCell.imageDrawable;
            if (setDefaultReactionCell.imageDrawable != null) {
                setDefaultReactionCell.imageDrawable.play();
                setDefaultReactionCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(setDefaultReactionCell.imageDrawable.getBounds());
                int iDp = (-(setDefaultReactionCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                iCenterX = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                setDefaultReactionCell2 = setDefaultReactionCell;
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable2;
                i = iDp;
            } else {
                setDefaultReactionCell2 = setDefaultReactionCell;
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable2;
            }
            selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), false, Integer.valueOf(iCenterX), 2, null) {
                @Override
                public void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    if (l == null) {
                        return;
                    }
                    MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).setDoubleTapReaction("animated_" + l);
                    SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell;
                    if (setDefaultReactionCell3 != null) {
                        setDefaultReactionCell3.update(true);
                    }
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }

                @Override
                public void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                    MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).setDoubleTapReaction(visibleReaction.emojicon);
                    SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell;
                    if (setDefaultReactionCell3 != null) {
                        setDefaultReactionCell3.update(true);
                    }
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            doubleTapReaction = getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    selectAnimatedEmojiDialog.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            availableReactions = getAvailableReactions();
            arrayList = new ArrayList(20);
            for (i2 = 0; i2 < availableReactions.size(); i2++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                visibleReaction.emojicon = availableReactions.get(i2).reaction;
                arrayList.add(visibleReaction);
            }
            selectAnimatedEmojiDialog.setRecentReactions(arrayList);
            selectAnimatedEmojiDialog.setSaveState(3);
            selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, setDefaultReactionCell2);
            int i3 = -2;
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i3, i3) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindow.showAsDropDown(setDefaultReactionCell, 0, i, 53);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }
        swapAnimatedEmojiDrawable = null;
        setDefaultReactionCell2 = null;
        iCenterX = 0;
        i = 0;
        selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), false, Integer.valueOf(iCenterX), 2, null) {
            @Override
            public void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                if (l == null) {
                    return;
                }
                MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).setDoubleTapReaction("animated_" + l);
                SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell;
                if (setDefaultReactionCell3 != null) {
                    setDefaultReactionCell3.update(true);
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }

            @Override
            public void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction2) {
                MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).setDoubleTapReaction(visibleReaction2.emojicon);
                SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell;
                if (setDefaultReactionCell3 != null) {
                    setDefaultReactionCell3.update(true);
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }
        };
        doubleTapReaction = getMediaDataController().getDoubleTapReaction();
        if (doubleTapReaction != null) {
            selectAnimatedEmojiDialog.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
        }
        availableReactions = getAvailableReactions();
        arrayList = new ArrayList(20);
        while (i2 < availableReactions.size()) {
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
            visibleReaction2.emojicon = availableReactions.get(i2).reaction;
            arrayList.add(visibleReaction2);
        }
        selectAnimatedEmojiDialog.setRecentReactions(arrayList);
        selectAnimatedEmojiDialog.setSaveState(3);
        selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, setDefaultReactionCell2);
        int i4 = -2;
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i4, i4) {
            @Override
            public void dismiss() {
                super.dismiss();
                ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow2;
        selectAnimatedEmojiDialogWindow2.showAsDropDown(setDefaultReactionCell, 0, i, 53);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }
}
