package org.telegram.p009ui.Components.Premium;

import android.content.Context;
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
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.FixedHeightEmptyCell;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumGradient;
import org.telegram.p009ui.Components.RecyclerListView;

public class DoubledLimitsBottomSheet$Adapter extends RecyclerListView.SelectionAdapter {
    ViewGroup containerView;
    boolean drawHeader;
    PremiumGradient.GradientTools gradientTools;
    int headerRow;
    int lastViewRow;
    final ArrayList<DoubledLimitsBottomSheet$Limit> limits;
    int limitsStartRow;
    int rowCount;
    private int totalGradientHeight;

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    public DoubledLimitsBottomSheet$Adapter(int i, boolean z) {
        ArrayList<DoubledLimitsBottomSheet$Limit> arrayList = new ArrayList<>();
        this.limits = arrayList;
        this.drawHeader = z;
        PremiumGradient.GradientTools gradientTools = new PremiumGradient.GradientTools("premiumGradient1", "premiumGradient2", "premiumGradient3", "premiumGradient4");
        this.gradientTools = gradientTools;
        gradientTools.f1097x1 = 0.0f;
        gradientTools.f1099y1 = 0.0f;
        gradientTools.f1098x2 = 0.0f;
        gradientTools.f1100y2 = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i);
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("GroupsAndChannelsLimitTitle", C1010R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString("GroupsAndChannelsLimitSubtitle", C1010R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium)), messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("PinChatsLimitTitle", C1010R.string.PinChatsLimitTitle), LocaleController.formatString("PinChatsLimitSubtitle", C1010R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium)), messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("PublicLinksLimitTitle", C1010R.string.PublicLinksLimitTitle), LocaleController.formatString("PublicLinksLimitSubtitle", C1010R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium)), messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("SavedGifsLimitTitle", C1010R.string.SavedGifsLimitTitle), LocaleController.formatString("SavedGifsLimitSubtitle", C1010R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium)), messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("FavoriteStickersLimitTitle", C1010R.string.FavoriteStickersLimitTitle), LocaleController.formatString("FavoriteStickersLimitSubtitle", C1010R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("BioLimitTitle", C1010R.string.BioLimitTitle), LocaleController.formatString("BioLimitSubtitle", C1010R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("CaptionsLimitTitle", C1010R.string.CaptionsLimitTitle), LocaleController.formatString("CaptionsLimitSubtitle", C1010R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium)), messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("FoldersLimitTitle", C1010R.string.FoldersLimitTitle), LocaleController.formatString("FoldersLimitSubtitle", C1010R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium)), messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("ChatPerFolderLimitTitle", C1010R.string.ChatPerFolderLimitTitle), LocaleController.formatString("ChatPerFolderLimitSubtitle", C1010R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium)), messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, null));
        arrayList.add(new DoubledLimitsBottomSheet$Limit(LocaleController.getString("ConnectedAccountsLimitTitle", C1010R.string.ConnectedAccountsLimitTitle), LocaleController.formatString("ConnectedAccountsLimitSubtitle", C1010R.string.ConnectedAccountsLimitSubtitle, 4), 3, 4, null));
        this.rowCount = 0;
        int i2 = 1 + 0;
        this.rowCount = i2;
        this.headerRow = 0;
        this.limitsStartRow = i2;
        this.rowCount = i2 + arrayList.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        FixedHeightEmptyCell fixedHeightEmptyCell;
        Context context = viewGroup.getContext();
        if (i != 1) {
            if (i != 2) {
                DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = new DoubledLimitsBottomSheet$LimitCell(context);
                doubledLimitsBottomSheet$LimitCell.previewView.setParentViewForGradien(this.containerView);
                doubledLimitsBottomSheet$LimitCell.previewView.setStaticGradinet(this.gradientTools);
                fixedHeightEmptyCell = doubledLimitsBottomSheet$LimitCell;
            } else {
                fixedHeightEmptyCell = new FixedHeightEmptyCell(context, 16);
            }
        } else if (this.drawHeader) {
            FrameLayout frameLayout = new FrameLayout(this, context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(86.0f), 1073741824));
                }
            };
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(PremiumGradient.getInstance().createGradientDrawable(ContextCompat.getDrawable(context, C1010R.C1011drawable.other_2x_large)));
            linearLayout.addView(imageView, LayoutHelper.createFrame(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("DoubledLimits", C1010R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            linearLayout.addView(textView, LayoutHelper.createFrame(-2, -2, 16));
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            fixedHeightEmptyCell = frameLayout;
        } else {
            fixedHeightEmptyCell = new FixedHeightEmptyCell(context, 64);
        }
        fixedHeightEmptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(fixedHeightEmptyCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == 0) {
            DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = (DoubledLimitsBottomSheet$LimitCell) viewHolder.itemView;
            doubledLimitsBottomSheet$LimitCell.setData(this.limits.get(i - this.limitsStartRow));
            doubledLimitsBottomSheet$LimitCell.previewView.gradientYOffset = this.limits.get(i - this.limitsStartRow).yOffset;
            doubledLimitsBottomSheet$LimitCell.previewView.gradientTotalHeight = this.totalGradientHeight;
        }
    }

    @Override
    public int getItemCount() {
        return this.rowCount;
    }

    @Override
    public int getItemViewType(int i) {
        if (i == this.headerRow) {
            return 1;
        }
        return i == this.lastViewRow ? 2 : 0;
    }

    public void measureGradient(Context context, int i, int i2) {
        DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = new DoubledLimitsBottomSheet$LimitCell(context);
        int i3 = 0;
        for (int i4 = 0; i4 < this.limits.size(); i4++) {
            doubledLimitsBottomSheet$LimitCell.setData(this.limits.get(i4));
            doubledLimitsBottomSheet$LimitCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.limits.get(i4).yOffset = i3;
            i3 += doubledLimitsBottomSheet$LimitCell.getMeasuredHeight();
        }
        this.totalGradientHeight = i3;
    }
}
