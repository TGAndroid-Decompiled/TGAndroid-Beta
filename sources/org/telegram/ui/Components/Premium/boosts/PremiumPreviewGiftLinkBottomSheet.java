package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_premiumGiftOption;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.LinkCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TopicsFragment;

public class PremiumPreviewGiftLinkBottomSheet extends PremiumPreviewBottomSheet {
    private static PremiumPreviewGiftLinkBottomSheet instance;
    private ActionBtnCell actionBtn;
    private final boolean isUsed;
    private final String slug;

    @Override
    protected int getAdditionItemViewType(int i) {
        return 6;
    }

    public static void show(String str, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, TLRPC$User tLRPC$User, Browser.Progress progress) {
        GiftInfoBottomSheet.show(LaunchActivity.getLastFragment(), str, progress);
    }

    public static void show(String str, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, TLRPC$User tLRPC$User, boolean z) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || instance != null) {
            return;
        }
        PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = new PremiumPreviewGiftLinkBottomSheet(lastFragment, UserConfig.selectedAccount, tLRPC$User, new GiftPremiumBottomSheet.GiftTier(tLRPC$TL_premiumGiftOption), str, z, lastFragment.getResourceProvider());
        premiumPreviewGiftLinkBottomSheet.show();
        instance = premiumPreviewGiftLinkBottomSheet;
    }

    public PremiumPreviewGiftLinkBottomSheet(BaseFragment baseFragment, int i, TLRPC$User tLRPC$User, GiftPremiumBottomSheet.GiftTier giftTier, String str, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, i, tLRPC$User, giftTier, resourcesProvider);
        this.slug = str;
        this.isUsed = z;
        init();
    }

    @Override
    protected void updateRows() {
        int i = this.rowCount;
        int i2 = i + 1;
        this.rowCount = i2;
        this.paddingRow = i;
        this.additionStartRow = i2;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.additionEndRow = i3;
        this.featuresStartRow = i3;
        int size = i3 + this.premiumFeatures.size();
        this.rowCount = size;
        this.featuresEndRow = size;
        this.rowCount = size + 1;
        this.sectionRow = size;
    }

    @Override
    public void setTitle(boolean z) {
        super.setTitle(z);
        this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.subtitleView.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.subtitleView.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), Theme.key_chat_messageLinkIn, 0, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda1(this)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    public void share() {
        final String str = "https://t.me/giftcode/" + this.slug;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 3);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                boolean lambda$share$0;
                lambda$share$0 = PremiumPreviewGiftLinkBottomSheet.this.lambda$share$0(str, dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                return lambda$share$0;
            }
        });
        getBaseFragment().presentFragment(dialogsActivity);
        dismiss();
    }

    public boolean lambda$share$0(String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j = ((MessagesStorage.TopicKey) arrayList.get(i)).dialogId;
            getBaseFragment().getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j, null, null, null, true, null, null, null, true, 0, null, false));
        }
        dialogsActivity.lambda$onBackPressed$308();
        BoostDialogs.showGiftLinkForwardedBulletin(j);
        return true;
    }

    @Override
    protected View onCreateAdditionCell(int i, Context context) {
        if (i != 6) {
            return null;
        }
        LinkCell linkCell = new LinkCell(context, getBaseFragment(), this.resourcesProvider);
        linkCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return linkCell;
    }

    @Override
    protected void onBindAdditionCell(View view, int i) {
        ((LinkCell) view).setSlug(this.slug);
    }

    public class AnonymousClass1 implements Bulletin.Delegate {
        @Override
        public boolean allowLayoutChanges() {
            return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
        }

        @Override
        public boolean bottomOffsetAnimated() {
            return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
        }

        @Override
        public boolean clipWithGradient(int i) {
            return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
        }

        @Override
        public int getTopOffset(int i) {
            return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
        }

        @Override
        public void onBottomOffsetChange(float f) {
            Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
        }

        @Override
        public void onHide(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onHide(this, bulletin);
        }

        @Override
        public void onShow(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onShow(this, bulletin);
        }

        AnonymousClass1(PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet) {
        }

        @Override
        public int getBottomOffset(int i) {
            return AndroidUtilities.dp(68.0f);
        }
    }

    private void init() {
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            AnonymousClass1(PremiumPreviewGiftLinkBottomSheet this) {
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(68.0f);
            }
        });
        if (!this.isUsed) {
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(68.0f));
            ActionBtnCell actionBtnCell = new ActionBtnCell(getContext(), this.resourcesProvider);
            this.actionBtn = actionBtnCell;
            actionBtnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PremiumPreviewGiftLinkBottomSheet.this.lambda$init$4(view);
                }
            });
            this.actionBtn.setActivateForFreeStyle();
            this.containerView.addView(this.actionBtn, LayoutHelper.createFrame(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public void lambda$init$4(View view) {
        if (this.actionBtn.isLoading()) {
            return;
        }
        this.actionBtn.updateLoading(true);
        BoostRepository.applyGiftCode(this.slug, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PremiumPreviewGiftLinkBottomSheet.this.lambda$init$2((Void) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PremiumPreviewGiftLinkBottomSheet.this.lambda$init$3((TLRPC$TL_error) obj);
            }
        });
    }

    public void lambda$init$2(Void r3) {
        this.actionBtn.updateLoading(false);
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PremiumPreviewGiftLinkBottomSheet.this.lambda$init$1();
            }
        }, 200L);
    }

    public void lambda$init$1() {
        getBaseFragment().showDialog(new PremiumPreviewBottomSheet(getBaseFragment(), UserConfig.selectedAccount, null, null, this.resourcesProvider).setAnimateConfetti(true).setAnimateConfettiWithStars(true).setOutboundGift(true));
    }

    public void lambda$init$3(TLRPC$TL_error tLRPC$TL_error) {
        this.actionBtn.updateLoading(false);
        BoostDialogs.processApplyGiftCodeError(tLRPC$TL_error, (FrameLayout) this.containerView, this.resourcesProvider, new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda1(this));
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        instance = null;
    }
}
