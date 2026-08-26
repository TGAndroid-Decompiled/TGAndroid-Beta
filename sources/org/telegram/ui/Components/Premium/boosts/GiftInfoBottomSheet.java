package org.telegram.ui.Components.Premium.boosts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;

public final class GiftInfoBottomSheet extends BottomSheetWithRecyclerListView {
    public AnonymousClass2 adapter;
    public final TLRPC.TL_payments_checkedGiftCode giftCode;
    public final boolean isUnused;
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
            return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
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
            return AndroidUtilities.statusBarHeight;
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

    public final class AnonymousClass2 extends GiftInfoAdapter {
        public AnonymousClass2(Theme.ResourcesProvider resourcesProvider) {
            super(resourcesProvider);
        }

        @Override
        public final void onHiddenLinkClicked() {
            GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
            String str = giftInfoBottomSheet.slug;
            BulletinFactory.of(giftInfoBottomSheet.container, ((BottomSheet) giftInfoBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, ((str == null || str.isEmpty()) && giftInfoBottomSheet.giftCode.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode)).show(true);
        }

        @Override
        public final void onObjectClicked(TLObject tLObject) {
            GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
            giftInfoBottomSheet.lambda$showGiftOfferSheet$15();
            if (tLObject instanceof TLRPC.Chat) {
                giftInfoBottomSheet.getBaseFragment().presentFragment(ChatActivity.of(-((TLRPC.Chat) tLObject).id));
                return;
            }
            if (tLObject instanceof TLRPC.User) {
                giftInfoBottomSheet.getBaseFragment().presentFragment(ChatActivity.of(((TLRPC.User) tLObject).id));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(giftInfoBottomSheet.giftCode.from_id));
            bundle.putInt("message_id", giftInfoBottomSheet.giftCode.giveaway_msg_id);
            giftInfoBottomSheet.getBaseFragment().presentFragment(new ChatActivity(bundle));
        }
    }

    public GiftInfoBottomSheet(BaseFragment baseFragment, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(baseFragment, false, true);
        this.isUnused = tL_payments_checkedGiftCode.used_date == 0;
        this.giftCode = tL_payments_checkedGiftCode;
        this.slug = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        updateTitle();
        AnonymousClass2 anonymousClass2 = this.adapter;
        BottomSheet.ContainerView containerView = this.container;
        anonymousClass2.getClass();
        anonymousClass2.isUnused = tL_payments_checkedGiftCode.used_date == 0;
        anonymousClass2.baseFragment = baseFragment;
        anonymousClass2.giftCode = tL_payments_checkedGiftCode;
        anonymousClass2.slug = str;
        anonymousClass2.container = containerView;
    }

    public static boolean handleIntent(Intent intent, Browser.Progress progress) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (!scheme.equals("http") && !scheme.equals("https")) {
            if (!scheme.equals("tg")) {
                return false;
            }
            String string = data.toString();
            String lastPathSegment = data.getLastPathSegment();
            if ((!string.startsWith("tg:giftcode") && !string.startsWith("tg://giftcode")) || lastPathSegment == null) {
                return false;
            }
            show(LaunchActivity.getLastFragment(), lastPathSegment, progress);
            return true;
        }
        String lowerCase = data.getHost().toLowerCase();
        if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
            return false;
        }
        String lastPathSegment2 = data.getLastPathSegment();
        if (!path.startsWith("/giftcode") || lastPathSegment2 == null) {
            return false;
        }
        show(LaunchActivity.getLastFragment(), lastPathSegment2, progress);
        return true;
    }

    public static void show(BaseFragment baseFragment, String str, Browser.Progress progress) {
        if (baseFragment == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (progress != null) {
            progress.init();
            progress.onCancel(new BoostDialogs$$ExternalSyntheticLambda4(atomicBoolean, 1));
        }
        GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = new GiftSheet$$ExternalSyntheticLambda23(atomicBoolean, baseFragment, str, progress);
        BoostDialogs$$ExternalSyntheticLambda6 boostDialogs$$ExternalSyntheticLambda6 = new BoostDialogs$$ExternalSyntheticLambda6(atomicBoolean, progress, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new StarGiftSheet$$ExternalSyntheticLambda1(messagesController, giftSheet$$ExternalSyntheticLambda23, boostDialogs$$ExternalSyntheticLambda6, 6));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.resourcesProvider);
        this.adapter = anonymousClass2;
        return anonymousClass2;
    }

    @Override
    public final CharSequence getTitle() {
        return this.isUnused ? LocaleController.getString(R.string.BoostingGiftLink) : LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override
    public final void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        Bulletin.addDelegate(this.container, new AnonymousClass1());
    }
}
