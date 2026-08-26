package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.LinkCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class PremiumPreviewGiftLinkBottomSheet extends PremiumPreviewBottomSheet {
    public static PremiumPreviewGiftLinkBottomSheet instance;
    public final ActionBtnCell actionBtn;
    public final String slug;

    public final class AnonymousClass1 implements Bulletin.Delegate {
        @Override
        public final boolean allowLayoutChanges() {
            return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
        }

        @Override
        public final boolean bottomOffsetAnimated() {
            return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
        }

        @Override
        public final boolean clipWithGradient(int i) {
            return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
        }

        @Override
        public final int getBottomOffset(int i) {
            return AndroidUtilities.dp(68.0f);
        }

        @Override
        public final int getLeftPadding() {
            return Bulletin.Delegate.CC.$default$getLeftPadding(this);
        }

        @Override
        public final int getRightPadding() {
            return Bulletin.Delegate.CC.$default$getRightPadding(this);
        }

        @Override
        public final int getTopOffset(int i) {
            return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
        }

        @Override
        public final void onBottomOffsetChange(float f) {
            Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
        }

        @Override
        public final void onHide(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onHide(this, bulletin);
        }

        @Override
        public final void onShow(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onShow(this, bulletin);
        }
    }

    public PremiumPreviewGiftLinkBottomSheet(BaseFragment baseFragment, int i, TLRPC.User user, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, String str, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, i, user, giftPremiumBottomSheet$GiftTier, null, resourcesProvider);
        this.slug = str;
        Bulletin.addDelegate((FrameLayout) this.containerView, new AnonymousClass1());
        if (!z) {
            RecyclerListView recyclerListView = this.recyclerListView;
            int i2 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(68.0f));
            ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
            this.actionBtn = actionBtnCell;
            actionBtnCell.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 20));
            ActionBtnCell actionBtnCell2 = this.actionBtn;
            actionBtnCell2.drawDivider = true;
            ButtonWithCounterView buttonWithCounterView = actionBtnCell2.button;
            buttonWithCounterView.setEnabled(true);
            buttonWithCounterView.setText(LocaleController.getString(R.string.GiftPremiumActivateForFree), false);
            actionBtnCell2.backgroundView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, actionBtnCell2.resourcesProvider));
            this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        instance = null;
    }

    @Override
    public final int getAdditionItemViewType() {
        return 6;
    }

    public final void lambda$init$1() {
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(getBaseFragment(), UserConfig.selectedAccount, null, null, null, this.resourcesProvider);
        premiumPreviewBottomSheet.animateConfetti = true;
        premiumPreviewBottomSheet.animateConfettiWithStars = true;
        premiumPreviewBottomSheet.isOutboundGift = true;
        getBaseFragment().showDialog(premiumPreviewBottomSheet);
    }

    public final void lambda$init$3(TLRPC.TL_error tL_error) {
        this.actionBtn.button.setLoading(false);
        BoostDialogs.processApplyGiftCodeError(tL_error, (FrameLayout) this.containerView, this.resourcesProvider, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(this, 0));
    }

    @Override
    public final void onBindAdditionCell(View view) {
        ((LinkCell) view).setSlug(this.slug);
    }

    @Override
    public final View onCreateAdditionCell(int i, Context context) {
        if (i != 6) {
            return null;
        }
        getBaseFragment();
        LinkCell linkCell = new LinkCell(context, this.resourcesProvider);
        linkCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return linkCell;
    }

    @Override
    public final void setTitle(boolean z) {
        super.setTitle(z);
        this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.subtitleView.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), Theme.key_chat_messageLinkIn, 0, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void updateRows() {
        int i = this.rowCount;
        this.paddingRow = i;
        this.additionStartRow = i + 1;
        int i2 = i + 2;
        this.rowCount = i2;
        this.additionEndRow = i2;
        this.featuresStartRow = i2;
        int size = this.premiumFeatures.size() + i2;
        this.featuresEndRow = size;
        this.rowCount = size + 1;
        this.sectionRow = size;
    }
}
