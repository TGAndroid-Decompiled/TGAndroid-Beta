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
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;

public final class ReactionsDoubleTapManageActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout contentView;
    public int infoRow;
    public AnonymousClass2 listAdapter;
    public RecyclerListView listView;
    public int premiumReactionRow;
    public int reactionsStartRow;
    public int rowCount;
    public AnonymousClass4 selectAnimatedEmojiDialog;

    public final class SetDefaultReactionCell extends FrameLayout {
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;

        public SetDefaultReactionCell(Context context) {
            super(context);
            TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 16.0f);
            textViewM.setTextColor(ReactionsDoubleTapManageActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            textViewM.setText(LocaleController.getString(R.string.DoubleTapSetting));
            addView(textViewM, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
            this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 7);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            updateImageBounds();
            this.imageDrawable.draw(canvas);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageDrawable.attach();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageDrawable.detach();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public final void update(boolean z) {
            ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
            String doubleTapReaction = MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).getDoubleTapReaction();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    swapAnimatedEmojiDrawable.set(Long.parseLong(doubleTapReaction.substring(9)), z);
                    return;
                } catch (Exception unused) {
                }
            }
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction != null) {
                swapAnimatedEmojiDrawable.set(tL_availableReaction.static_icon, swapAnimatedEmojiDrawable.cacheType, z);
            }
        }

        public final void updateImageBounds() {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
            swapAnimatedEmojiDrawable.setBounds((getWidth() - swapAnimatedEmojiDrawable.size) - AndroidUtilities.dp(21.0f), (getHeight() - swapAnimatedEmojiDrawable.size) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + swapAnimatedEmojiDrawable.size) / 2);
        }
    }

    public ReactionsDoubleTapManageActivity() {
        super(null);
        this.reactionsStartRow = -1;
    }

    @Override
    public final View createView(final Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).mSupportsChangeAnimations = false;
        zzku.m(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        ?? r5 = new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                return reactionsDoubleTapManageActivity.rowCount + (reactionsDoubleTapManageActivity.premiumReactionRow < 0 ? reactionsDoubleTapManageActivity.getMediaDataController().getReactionsList().size() : 0) + 1;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                if (i == reactionsDoubleTapManageActivity.infoRow) {
                    return 2;
                }
                if (i == reactionsDoubleTapManageActivity.premiumReactionRow) {
                    return 3;
                }
                return i == getItemCount() - 1 ? 4 : 1;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                int i = viewHolder.mItemViewType;
                return i == 3 || i == 2;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) != 1) {
                    return;
                }
                AvailableReactionCell availableReactionCell = (AvailableReactionCell) viewHolder.itemView;
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                TLRPC.TL_availableReaction tL_availableReaction = reactionsDoubleTapManageActivity.getMediaDataController().getReactionsList().get(i - reactionsDoubleTapManageActivity.reactionsStartRow);
                availableReactionCell.bind(tL_availableReaction, tL_availableReaction.reaction.contains(MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).getDoubleTapReaction()), ((BaseFragment) reactionsDoubleTapManageActivity).currentAccount);
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View availableReactionCell;
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                if (i != 0) {
                    Context context2 = context;
                    if (i == 2) {
                        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context2, 24, null);
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
                        availableReactionCell = textInfoPrivacyCell;
                    } else if (i == 3) {
                        SetDefaultReactionCell setDefaultReactionCell = reactionsDoubleTapManageActivity.new SetDefaultReactionCell(context2);
                        setDefaultReactionCell.update(false);
                        availableReactionCell = setDefaultReactionCell;
                    } else if (i != 4) {
                        availableReactionCell = new AvailableReactionCell(context2, true, true);
                    } else {
                        PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context2, 23);
                        anonymousClass2.setTag(-33024);
                        availableReactionCell = anonymousClass2;
                    }
                } else {
                    ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, ((BaseFragment) reactionsDoubleTapManageActivity).parentLayout, 2, 0L, null);
                    themePreviewMessagesCell.setImportantForAccessibility(4);
                    themePreviewMessagesCell.fragment = reactionsDoubleTapManageActivity;
                    availableReactionCell = themePreviewMessagesCell;
                }
                return new RecyclerListView.Holder(availableReactionCell);
            }
        };
        this.listAdapter = r5;
        recyclerListView2.setAdapter(r5);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 3));
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, -1));
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.listAdapter.mObservable.notifyChanged();
        this.rowCount = 2;
        this.infoRow = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.reactionsStartRow = -1;
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.premiumReactionRow = i;
        } else {
            this.premiumReactionRow = -1;
            this.reactionsStartRow = this.rowCount;
        }
        return this.contentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = this.currentAccount;
        if (i2 != i3) {
            return;
        }
        if (i == NotificationCenter.reactionsDidLoad) {
            this.listAdapter.mObservable.notifyChanged();
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.rowCount = 2;
            this.infoRow = 1;
            if (UserConfig.getInstance(i3).isPremium()) {
                this.reactionsStartRow = -1;
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.premiumReactionRow = i4;
            } else {
                this.premiumReactionRow = -1;
                this.reactionsStartRow = this.rowCount;
            }
            this.listAdapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(16, this), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$0$4(View view) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        SetDefaultReactionCell setDefaultReactionCell;
        int iCenterX;
        int i;
        ?? r0;
        String doubleTapReaction;
        List<TLRPC.TL_availableReaction> reactionsList;
        ArrayList arrayList;
        int i2;
        if (view instanceof AvailableReactionCell) {
            AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
            if (availableReactionCell.locked && !getUserConfig().isPremium()) {
                showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 4, true, null));
                return;
            } else {
                MediaDataController.getInstance(this.currentAccount).setDoubleTapReaction(availableReactionCell.react.reaction);
                this.listView.getAdapter().notifyItemRangeChanged(0, this.listView.getAdapter().getItemCount());
                return;
            }
        }
        if (view instanceof SetDefaultReactionCell) {
            final SetDefaultReactionCell setDefaultReactionCell2 = (SetDefaultReactionCell) view;
            if (this.selectAnimatedEmojiDialog != null) {
                return;
            }
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
            if (setDefaultReactionCell2 != null) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = setDefaultReactionCell2.imageDrawable;
                if (swapAnimatedEmojiDrawable2 != null) {
                    swapAnimatedEmojiDrawable2.play();
                    setDefaultReactionCell2.updateImageBounds();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(swapAnimatedEmojiDrawable2.getBounds());
                    int iDp = (-(setDefaultReactionCell2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    iCenterX = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                    swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable2;
                    i = iDp;
                    setDefaultReactionCell = setDefaultReactionCell2;
                } else {
                    swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable2;
                    setDefaultReactionCell = setDefaultReactionCell2;
                }
                r0 = new SelectAnimatedEmojiDialog(this, getParentActivity(), Integer.valueOf(iCenterX)) {
                    @Override
                    public final void onEmojiSelected(View view2, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                        if (l == null) {
                            return;
                        }
                        ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                        MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).setDoubleTapReaction("animated_" + l);
                        SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell2;
                        if (setDefaultReactionCell3 != null) {
                            setDefaultReactionCell3.update(true);
                        }
                        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                        if (selectAnimatedEmojiDialogWindow != null) {
                            reactionsDoubleTapManageActivity.selectAnimatedEmojiDialog = null;
                            selectAnimatedEmojiDialogWindow.dismiss();
                        }
                    }

                    @Override
                    public final void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                        ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                        MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).setDoubleTapReaction(visibleReaction.emojicon);
                        SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell2;
                        if (setDefaultReactionCell3 != null) {
                            setDefaultReactionCell3.update(true);
                        }
                        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                        if (selectAnimatedEmojiDialogWindow != null) {
                            reactionsDoubleTapManageActivity.selectAnimatedEmojiDialog = null;
                            selectAnimatedEmojiDialogWindow.dismiss();
                        }
                    }
                };
                doubleTapReaction = getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        r0.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                reactionsList = getMediaDataController().getReactionsList();
                arrayList = new ArrayList(20);
                for (i2 = 0; i2 < reactionsList.size(); i2++) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                    visibleReaction.emojicon = reactionsList.get(i2).reaction;
                    arrayList.add(visibleReaction);
                }
                r0.setRecentReactions(arrayList);
                r0.setSaveState(3);
                r0.setScrimDrawable(swapAnimatedEmojiDrawable, setDefaultReactionCell);
                ?? r2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r0) {
                    @Override
                    public final void dismiss() {
                        super.dismiss();
                        ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                    }
                };
                this.selectAnimatedEmojiDialog = r2;
                selectAnimatedEmojiDialogWindowArr[0] = r2;
                r2.showAsDropDown(setDefaultReactionCell2, 0, i, 53);
                selectAnimatedEmojiDialogWindowArr[0].dimBehind();
            }
            swapAnimatedEmojiDrawable = null;
            setDefaultReactionCell = null;
            iCenterX = 0;
            i = 0;
            r0 = new SelectAnimatedEmojiDialog(this, getParentActivity(), Integer.valueOf(iCenterX)) {
                @Override
                public final void onEmojiSelected(View view2, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    if (l == null) {
                        return;
                    }
                    ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                    MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).setDoubleTapReaction("animated_" + l);
                    SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell2;
                    if (setDefaultReactionCell3 != null) {
                        setDefaultReactionCell3.update(true);
                    }
                    SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                    if (selectAnimatedEmojiDialogWindow != null) {
                        reactionsDoubleTapManageActivity.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindow.dismiss();
                    }
                }

                @Override
                public final void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction2) {
                    ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = ReactionsDoubleTapManageActivity.this;
                    MediaDataController.getInstance(((BaseFragment) reactionsDoubleTapManageActivity).currentAccount).setDoubleTapReaction(visibleReaction2.emojicon);
                    SetDefaultReactionCell setDefaultReactionCell3 = setDefaultReactionCell2;
                    if (setDefaultReactionCell3 != null) {
                        setDefaultReactionCell3.update(true);
                    }
                    SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                    if (selectAnimatedEmojiDialogWindow != null) {
                        reactionsDoubleTapManageActivity.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindow.dismiss();
                    }
                }
            };
            doubleTapReaction = getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null) {
                r0.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
            }
            reactionsList = getMediaDataController().getReactionsList();
            arrayList = new ArrayList(20);
            while (i2 < reactionsList.size()) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                visibleReaction2.emojicon = reactionsList.get(i2).reaction;
                arrayList.add(visibleReaction2);
            }
            r0.setRecentReactions(arrayList);
            r0.setSaveState(3);
            r0.setScrimDrawable(swapAnimatedEmojiDrawable, setDefaultReactionCell);
            ?? r3 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r0) {
                @Override
                public final void dismiss() {
                    super.dismiss();
                    ReactionsDoubleTapManageActivity.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = r3;
            selectAnimatedEmojiDialogWindowArr[0] = r3;
            r3.showAsDropDown(setDefaultReactionCell2, 0, i, 53);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
