package org.telegram.ui.Components.Premium.boosts;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftToUsersBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

public class PremiumPreviewGiftSentBottomSheet extends PremiumPreviewBottomSheet {
    private final List selectedUsers;

    public PremiumPreviewGiftSentBottomSheet(BaseFragment baseFragment, int i, List list, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, i, null, null, resourcesProvider);
        ArrayList arrayList = new ArrayList();
        this.selectedUsers = arrayList;
        arrayList.addAll(list);
        init();
    }

    private void init() {
        updateRows();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
        actionBtnCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumPreviewGiftSentBottomSheet.this.lambda$init$0(view);
            }
        });
        actionBtnCell.setCloseStyle(true);
        this.containerView.addView(actionBtnCell, LayoutHelper.createFrame(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(64.0f));
        this.overrideTitleIcon = PremiumPreviewGiftToUsersBottomSheet.AvatarHolderView.createAvatarsContainer(getContext(), this.selectedUsers);
        fixNavigationBar();
    }

    public void lambda$init$0(View view) {
        dismiss();
    }

    public static void show(List list) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        PremiumPreviewGiftSentBottomSheet premiumPreviewGiftSentBottomSheet = new PremiumPreviewGiftSentBottomSheet(lastFragment, UserConfig.selectedAccount, list, lastFragment.getResourceProvider());
        premiumPreviewGiftSentBottomSheet.setAnimateConfetti(true);
        premiumPreviewGiftSentBottomSheet.setAnimateConfettiWithStars(true);
        premiumPreviewGiftSentBottomSheet.show();
    }

    @Override
    protected void afterCellCreated(int i, View view) {
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view2, Outline outline) {
                        float dp = AndroidUtilities.dp(12.0f);
                        outline.setRoundRect(0, 0, view2.getWidth(), (int) (view2.getHeight() + dp), dp);
                    }
                });
                view.setClipToOutline(true);
                view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
            }
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    protected void attachIconContainer(LinearLayout linearLayout) {
        linearLayout.addView(this.overrideTitleIcon, LayoutHelper.createLinear(-1, this.selectedUsers.size() == 1 ? 94 : 83, 0.0f, this.selectedUsers.size() == 1 ? 28.0f : 34.0f, 0.0f, this.selectedUsers.size() == 1 ? 9.0f : 14.0f));
    }

    @Override
    protected boolean needDefaultPremiumBtn() {
        return false;
    }

    @Override
    public void setTitle(boolean z) {
        String formatString;
        TextView textView;
        String string;
        ((PremiumPreviewBottomSheet) this).titleView[0].setTextSize(1, 20.0f);
        this.subtitleView.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((PremiumPreviewBottomSheet) this).titleView[0].setText(LocaleController.getPluralString("GiftPremiumGiftsSent", this.selectedUsers.size()));
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = this.selectedUsers.size();
        if (size == 1) {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersOne", R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(0))));
        } else if (size == 2) {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(0)), UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(1))));
        } else if (size != 3) {
            formatString = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", this.selectedUsers.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(0)), UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(1)), UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(2))));
        } else {
            formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(0)), UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(1)), UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(2))));
        }
        this.subtitleView.setText(AndroidUtilities.replaceTags(formatString));
        this.subtitleView.append("\n");
        this.subtitleView.append("\n");
        if (this.selectedUsers.size() == 1) {
            textView = this.subtitleView;
            string = LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC$User) this.selectedUsers.get(0)));
        } else {
            textView = this.subtitleView;
            string = LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus);
        }
        textView.append(AndroidUtilities.replaceTags(string));
    }

    @Override
    protected void updateRows() {
        this.rowCount = 1;
        this.paddingRow = 0;
        this.featuresStartRow = 1;
        int size = this.premiumFeatures.size();
        int i = size + 1;
        this.featuresEndRow = i;
        this.rowCount = size + 2;
        this.termsRow = i;
    }
}
