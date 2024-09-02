package org.telegram.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
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
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public class ReactionsDoubleTapManageActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LinearLayout contentView;
    int infoRow;
    private RecyclerView.Adapter listAdapter;
    private RecyclerListView listView;
    int premiumReactionRow;
    int previewRow;
    int reactionsStartRow = -1;
    int rowCount;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
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
                    ReactionsDoubleTapManageActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        ((DefaultItemAnimator) recyclerListView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.listView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView2 = this.listView;
        RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 2;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                if (i == 0) {
                    ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, ((BaseFragment) ReactionsDoubleTapManageActivity.this).parentLayout, 2);
                    themePreviewMessagesCell.setImportantForAccessibility(4);
                    themePreviewMessagesCell.fragment = ReactionsDoubleTapManageActivity.this;
                    view = themePreviewMessagesCell;
                } else if (i == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    view = textInfoPrivacyCell;
                } else if (i == 3) {
                    SetDefaultReactionCell setDefaultReactionCell = new SetDefaultReactionCell(context);
                    setDefaultReactionCell.update(false);
                    view = setDefaultReactionCell;
                } else if (i == 4) {
                    View view2 = new View(context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                        }
                    };
                    view2.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    view = view2;
                } else {
                    view = new AvailableReactionCell(context, true, true);
                }
                return new RecyclerListView.Holder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) != 1) {
                    return;
                }
                AvailableReactionCell availableReactionCell = (AvailableReactionCell) viewHolder.itemView;
                TLRPC$TL_availableReaction tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) ReactionsDoubleTapManageActivity.this.getAvailableReactions().get(i - ReactionsDoubleTapManageActivity.this.reactionsStartRow);
                availableReactionCell.bind(tLRPC$TL_availableReaction, tLRPC$TL_availableReaction.reaction.contains(MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).getDoubleTapReaction()), ((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount);
            }

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
        };
        this.listAdapter = selectionAdapter;
        recyclerListView2.setAdapter(selectionAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ReactionsDoubleTapManageActivity.this.lambda$createView$0(view, i);
            }
        });
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, -1));
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors();
        updateRows();
        return this.contentView;
    }

    public void lambda$createView$0(View view, int i) {
        if (view instanceof AvailableReactionCell) {
            AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
            if (availableReactionCell.locked && !getUserConfig().isPremium()) {
                showDialog(new PremiumFeatureBottomSheet(this, 4, true));
                return;
            } else {
                MediaDataController.getInstance(this.currentAccount).setDoubleTapReaction(availableReactionCell.react.reaction);
                this.listView.getAdapter().notifyItemRangeChanged(0, this.listView.getAdapter().getItemCount());
                return;
            }
        }
        if (view instanceof SetDefaultReactionCell) {
            showSelectStatusDialog((SetDefaultReactionCell) view);
        }
    }

    public class SetDefaultReactionCell extends FrameLayout {
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
        private TextView textView;

        public SetDefaultReactionCell(Context context) {
            super(context);
            setBackgroundColor(ReactionsDoubleTapManageActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            this.textView.setTextColor(ReactionsDoubleTapManageActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.textView.setText(LocaleController.getString(R.string.DoubleTapSetting));
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
            this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(24.0f));
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
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(((BaseFragment) ReactionsDoubleTapManageActivity.this).currentAccount).getReactionsMap().get(doubleTapReaction);
            if (tLRPC$TL_availableReaction != null) {
                this.imageDrawable.set(tLRPC$TL_availableReaction.static_icon, z);
            }
        }

        public void updateImageBounds() {
            this.imageDrawable.setBounds((getWidth() - this.imageDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(21.0f), (getHeight() - this.imageDrawable.getIntrinsicHeight()) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.imageDrawable.getIntrinsicHeight()) / 2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            updateImageBounds();
            this.imageDrawable.draw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageDrawable.detach();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageDrawable.attach();
        }
    }

    public void showSelectStatusDialog(final org.telegram.ui.ReactionsDoubleTapManageActivity.SetDefaultReactionCell r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ReactionsDoubleTapManageActivity.showSelectStatusDialog(org.telegram.ui.ReactionsDoubleTapManageActivity$SetDefaultReactionCell):void");
    }

    private void updateRows() {
        this.previewRow = 0;
        this.rowCount = 2;
        this.infoRow = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.reactionsStartRow = -1;
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.premiumReactionRow = i;
            return;
        }
        this.premiumReactionRow = -1;
        this.reactionsStartRow = this.rowCount;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    public List<TLRPC$TL_availableReaction> getAvailableReactions() {
        return getMediaDataController().getReactionsList();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ReactionsDoubleTapManageActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateColors() {
        this.contentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
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
}
