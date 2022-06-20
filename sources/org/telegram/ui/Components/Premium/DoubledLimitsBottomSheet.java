package org.telegram.ui.Components.Premium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;

public class DoubledLimitsBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private View divider;
    PremiumGradient.GradientTools gradientTools;
    int lastViewRow;
    final ArrayList<Limit> limits;
    int limitsStartRow;
    PremiumButtonView premiumButtonView;
    int rowCount;
    ImageView titleImage;
    float titleProgress;
    TextView titleView;
    private int totalGradientHeight;
    int headerRow = 0;
    FrameLayout titleLayout = new FrameLayout(getContext());

    @Override
    protected CharSequence getTitle() {
        return null;
    }

    public void setParentFragment(PremiumPreviewFragment premiumPreviewFragment) {
    }

    public DoubledLimitsBottomSheet(final BaseFragment baseFragment, final int i) {
        super(baseFragment, false, false);
        ArrayList<Limit> arrayList = new ArrayList<>();
        this.limits = arrayList;
        PremiumGradient.GradientTools gradientTools = new PremiumGradient.GradientTools("premiumGradient1", "premiumGradient2", "premiumGradient3", "premiumGradient4");
        this.gradientTools = gradientTools;
        gradientTools.x1 = 0.0f;
        gradientTools.y1 = 0.0f;
        gradientTools.x2 = 0.0f;
        gradientTools.y2 = 1.0f;
        this.clipToActionBar = true;
        MessagesController messagesController = MessagesController.getInstance(i);
        arrayList.add(new Limit(LocaleController.getString("GroupsAndChannelsLimitTitle", R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString("GroupsAndChannelsLimitSubtitle", R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium)), messagesController.channelsLimitDefault, messagesController.channelsLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("PinChatsLimitTitle", R.string.PinChatsLimitTitle), LocaleController.formatString("PinChatsLimitSubtitle", R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium)), messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("PublicLinksLimitTitle", R.string.PublicLinksLimitTitle), LocaleController.formatString("PublicLinksLimitSubtitle", R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium)), messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("SavedGifsLimitTitle", R.string.SavedGifsLimitTitle), LocaleController.formatString("SavedGifsLimitSubtitle", R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium)), messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("FavoriteStickersLimitTitle", R.string.FavoriteStickersLimitTitle), LocaleController.formatString("FavoriteStickersLimitSubtitle", R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("BioLimitTitle", R.string.BioLimitTitle), LocaleController.formatString("BioLimitSubtitle", R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("CaptionsLimitTitle", R.string.CaptionsLimitTitle), LocaleController.formatString("CaptionsLimitSubtitle", R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("FoldersLimitTitle", R.string.FoldersLimitTitle), LocaleController.formatString("FoldersLimitSubtitle", R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium)), messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("ChatPerFolderLimitTitle", R.string.ChatPerFolderLimitTitle), LocaleController.formatString("ChatPerFolderLimitSubtitle", R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium)), messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium));
        arrayList.add(new Limit(LocaleController.getString("ConnectedAccountsLimitTitle", R.string.ConnectedAccountsLimitTitle), LocaleController.formatString("ConnectedAccountsLimitSubtitle", R.string.ConnectedAccountsLimitSubtitle, 4), 3, 4));
        this.rowCount = 0;
        int i2 = 0 + 1;
        this.rowCount = i2;
        this.limitsStartRow = i2;
        this.rowCount = i2 + arrayList.size();
        TextView textView = new TextView(getContext());
        this.titleView = textView;
        textView.setText(LocaleController.getString("DoubledLimits", R.string.DoubledLimits));
        this.titleView.setGravity(17);
        this.titleView.setTextSize(1, 20.0f);
        this.titleView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleLayout.addView(this.titleView, LayoutHelper.createFrame(-2, -2, 16));
        ImageView imageView = new ImageView(getContext());
        this.titleImage = imageView;
        imageView.setImageDrawable(PremiumGradient.getInstance().createGradientDrawable(ContextCompat.getDrawable(getContext(), R.drawable.other_2x_large)));
        this.titleLayout.addView(this.titleImage, LayoutHelper.createFrame(40, 28, 16));
        this.containerView.addView(this.titleLayout, LayoutHelper.createFrame(-1, 40.0f));
        View view = new View(this, getContext()) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, Theme.dividerPaint);
            }
        };
        this.divider = view;
        view.setBackgroundColor(Theme.getColor("dialogBackground"));
        this.containerView.addView(this.divider, LayoutHelper.createFrame(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), true);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.buttonTextView.setText(PremiumPreviewFragment.getPremiumButtonText(i));
        this.containerView.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        this.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                DoubledLimitsBottomSheet.this.lambda$new$0(i, baseFragment, view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                DoubledLimitsBottomSheet.this.lambda$new$1(view2);
            }
        });
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        bindPremium(UserConfig.getInstance(getCurrentAccount()).isPremium());
    }

    public void lambda$new$0(int i, BaseFragment baseFragment, View view) {
        if (!UserConfig.getInstance(i).isPremium()) {
            PremiumPreviewFragment.buyPremium(baseFragment, "double_limits");
        }
        dismiss();
    }

    public void lambda$new$1(View view) {
        dismiss();
    }

    private void bindPremium(boolean z) {
        if (z) {
            this.premiumButtonView.setOverlayText(LocaleController.getString("OK", R.string.OK), false, false);
        }
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        super.onPreMeasure(i, i2);
        measureGradient(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override
    protected void onPreDraw(Canvas canvas, int i, float f) {
        float measuredHeight = AndroidUtilities.statusBarHeight + (((this.actionBar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f);
        float measuredWidth = (((this.titleLayout.getMeasuredWidth() - this.titleView.getMeasuredWidth()) - this.titleImage.getMeasuredWidth()) - AndroidUtilities.dp(6.0f)) / 2.0f;
        float dp = (AndroidUtilities.dp(72.0f) - this.titleImage.getMeasuredWidth()) - AndroidUtilities.dp(6.0f);
        float measuredWidth2 = this.titleImage.getMeasuredWidth() + measuredWidth + AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(72.0f);
        float max = Math.max(i + AndroidUtilities.dp(24.0f), measuredHeight);
        if (f > 0.0f) {
            float f2 = this.titleProgress;
            if (f2 != 1.0f) {
                float f3 = f2 + 0.10666667f;
                this.titleProgress = f3;
                if (f3 > 1.0f) {
                    this.titleProgress = 1.0f;
                }
                this.containerView.invalidate();
                FrameLayout frameLayout = this.titleLayout;
                float f4 = this.titleProgress;
                frameLayout.setTranslationY((max * (1.0f - f4)) + (measuredHeight * f4));
                TextView textView = this.titleView;
                float f5 = this.titleProgress;
                textView.setTranslationX((measuredWidth2 * (1.0f - f5)) + (dp2 * f5));
                ImageView imageView = this.titleImage;
                float f6 = this.titleProgress;
                imageView.setTranslationX((measuredWidth * (1.0f - f6)) + (dp * f6));
                this.titleImage.setAlpha(1.0f - this.titleProgress);
                float f7 = ((1.0f - this.titleProgress) * 0.4f) + 0.6f;
                this.titleImage.setScaleX(f7);
                this.titleImage.setScaleY(f7);
            }
        }
        if (f == 0.0f) {
            float f8 = this.titleProgress;
            if (f8 != 0.0f) {
                float f9 = f8 - 0.10666667f;
                this.titleProgress = f9;
                if (f9 < 0.0f) {
                    this.titleProgress = 0.0f;
                }
                this.containerView.invalidate();
            }
        }
        FrameLayout frameLayout2 = this.titleLayout;
        float f42 = this.titleProgress;
        frameLayout2.setTranslationY((max * (1.0f - f42)) + (measuredHeight * f42));
        TextView textView2 = this.titleView;
        float f52 = this.titleProgress;
        textView2.setTranslationX((measuredWidth2 * (1.0f - f52)) + (dp2 * f52));
        ImageView imageView2 = this.titleImage;
        float f62 = this.titleProgress;
        imageView2.setTranslationX((measuredWidth * (1.0f - f62)) + (dp * f62));
        this.titleImage.setAlpha(1.0f - this.titleProgress);
        float f72 = ((1.0f - this.titleProgress) * 0.4f) + 0.6f;
        this.titleImage.setScaleX(f72);
        this.titleImage.setScaleY(f72);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                LimitCell limitCell;
                Context context = viewGroup.getContext();
                if (i == 1) {
                    limitCell = new FixedHeightEmptyCell(context, 64);
                } else if (i != 2) {
                    LimitCell limitCell2 = new LimitCell(DoubledLimitsBottomSheet.this, context);
                    limitCell2.previewView.setParentViewForGradien(((BottomSheet) DoubledLimitsBottomSheet.this).containerView);
                    limitCell2.previewView.setStaticGradinet(DoubledLimitsBottomSheet.this.gradientTools);
                    limitCell = limitCell2;
                } else {
                    limitCell = new FixedHeightEmptyCell(context, 16);
                }
                limitCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(limitCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 0) {
                    LimitCell limitCell = (LimitCell) viewHolder.itemView;
                    DoubledLimitsBottomSheet doubledLimitsBottomSheet = DoubledLimitsBottomSheet.this;
                    limitCell.setData(doubledLimitsBottomSheet.limits.get(i - doubledLimitsBottomSheet.limitsStartRow));
                    LimitPreviewView limitPreviewView = limitCell.previewView;
                    DoubledLimitsBottomSheet doubledLimitsBottomSheet2 = DoubledLimitsBottomSheet.this;
                    limitPreviewView.gradientYOffset = doubledLimitsBottomSheet2.limits.get(i - doubledLimitsBottomSheet2.limitsStartRow).yOffset;
                    limitCell.previewView.gradientTotalHeight = DoubledLimitsBottomSheet.this.totalGradientHeight;
                }
            }

            @Override
            public int getItemCount() {
                return DoubledLimitsBottomSheet.this.rowCount;
            }

            @Override
            public int getItemViewType(int i) {
                DoubledLimitsBottomSheet doubledLimitsBottomSheet = DoubledLimitsBottomSheet.this;
                if (i == doubledLimitsBottomSheet.headerRow) {
                    return 1;
                }
                return i == doubledLimitsBottomSheet.lastViewRow ? 2 : 0;
            }
        };
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            this.premiumButtonView.buttonTextView.setText(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount));
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            bindPremium(UserConfig.getInstance(this.currentAccount).isPremium());
        }
    }

    public class LimitCell extends LinearLayout {
        LimitPreviewView previewView;
        TextView subtitle;
        TextView title;

        public LimitCell(DoubledLimitsBottomSheet doubledLimitsBottomSheet, Context context) {
            super(context);
            setOrientation(1);
            setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setTextSize(1, 15.0f);
            this.title.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.title.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            addView(this.title, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 16, 0, 16, 0));
            TextView textView2 = new TextView(context);
            this.subtitle = textView2;
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            this.subtitle.setTextSize(1, 14.0f);
            addView(this.subtitle, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 16, 1, 16, 0));
            LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, 20);
            this.previewView = limitPreviewView;
            addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 21));
        }

        @SuppressLint({"SetTextI18n"})
        public void setData(Limit limit) {
            this.title.setText(limit.title);
            this.subtitle.setText(limit.subtitle);
            this.previewView.premiumCount.setText(Integer.toString(limit.premiumLimit));
            this.previewView.defaultCount.setText(Integer.toString(limit.defaultLimit));
        }
    }

    private void measureGradient(int i, int i2) {
        LimitCell limitCell = new LimitCell(this, getContext());
        int i3 = 0;
        for (int i4 = 0; i4 < this.limits.size(); i4++) {
            limitCell.setData(this.limits.get(i4));
            limitCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.limits.get(i4).yOffset = i3;
            i3 += limitCell.getMeasuredHeight();
        }
        this.totalGradientHeight = i3;
    }

    public static class Limit {
        final int defaultLimit;
        final int premiumLimit;
        final String subtitle;
        final String title;
        public int yOffset;

        private Limit(String str, String str2, int i, int i2) {
            this.title = str;
            this.subtitle = str2;
            this.defaultLimit = i;
            this.premiumLimit = i2;
        }
    }
}
