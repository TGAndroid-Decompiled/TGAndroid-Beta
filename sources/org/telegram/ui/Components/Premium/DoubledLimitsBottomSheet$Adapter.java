package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PhotoViewer;

public final class DoubledLimitsBottomSheet$Adapter extends RecyclerListView.SelectionAdapter {
    public DoubleLimitsPageView containerView;
    public final boolean drawHeader;
    public final PremiumGradient.PremiumGradientTools gradientTools;
    public final ArrayList limits;
    public final int limitsStartRow;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int rowCount;
    public int totalGradientHeight;

    public DoubledLimitsBottomSheet$Adapter(int i, Theme.ResourcesProvider resourcesProvider) {
        ArrayList arrayList = new ArrayList();
        this.limits = arrayList;
        this.drawHeader = true;
        this.resourcesProvider = resourcesProvider;
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, resourcesProvider);
        this.gradientTools = premiumGradientTools;
        premiumGradientTools.y1 = 0.0f;
        premiumGradientTools.x2 = 0.0f;
        premiumGradientTools.y2 = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i);
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.rowCount = 1;
        this.limitsStartRow = 1;
        this.rowCount = arrayList.size() + 1;
    }

    @Override
    public final int getItemCount() {
        return this.rowCount;
    }

    @Override
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == 0 ? 2 : 0;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.mItemViewType == 0) {
            DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = (DoubledLimitsBottomSheet$LimitCell) viewHolder.itemView;
            ArrayList arrayList = this.limits;
            int i2 = i - this.limitsStartRow;
            DoubledLimitsBottomSheet$Limit doubledLimitsBottomSheet$Limit = (DoubledLimitsBottomSheet$Limit) arrayList.get(i2);
            doubledLimitsBottomSheet$LimitCell.title.setText(doubledLimitsBottomSheet$Limit.title);
            doubledLimitsBottomSheet$LimitCell.subtitle.setText(doubledLimitsBottomSheet$Limit.subtitle);
            LimitPreviewView limitPreviewView = doubledLimitsBottomSheet$LimitCell.previewView;
            limitPreviewView.premiumCount.setText(String.format("%d", Integer.valueOf(doubledLimitsBottomSheet$Limit.premiumLimit)));
            limitPreviewView.defaultCount.setText(String.format("%d", Integer.valueOf(doubledLimitsBottomSheet$Limit.defaultLimit)));
            limitPreviewView.gradientYOffset = ((DoubledLimitsBottomSheet$Limit) arrayList.get(i2)).yOffset;
            limitPreviewView.gradientTotalHeight = this.totalGradientHeight;
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View fixedHeightEmptyCell;
        Context context = viewGroup.getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i != 1) {
            if (i != 2) {
                DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = new DoubledLimitsBottomSheet$LimitCell(context, resourcesProvider);
                LimitPreviewView limitPreviewView = doubledLimitsBottomSheet$LimitCell.previewView;
                limitPreviewView.setParentViewForGradien(this.containerView);
                limitPreviewView.setStaticGradinet(this.gradientTools);
                fixedHeightEmptyCell = doubledLimitsBottomSheet$LimitCell;
            } else {
                fixedHeightEmptyCell = new FixedHeightEmptyCell(context, 16);
            }
        } else if (this.drawHeader) {
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 16);
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(PremiumGradient.createGradientDrawable(context.getDrawable(R.drawable.other_2x_large), PremiumGradient.getInstance().mainGradient));
            linearLayoutM.addView(imageView, LayoutHelper.createFrame(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            linearLayoutM.addView(textView, LayoutHelper.createFrame(-2, -2, 16));
            anonymousClass19.addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
            fixedHeightEmptyCell = anonymousClass19;
        } else {
            fixedHeightEmptyCell = new FixedHeightEmptyCell(context, 64);
        }
        return zzkl.m(fixedHeightEmptyCell, fixedHeightEmptyCell);
    }
}
