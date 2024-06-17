package org.telegram.ui.Components.Premium.boosts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_payments_checkedGiftCode;
import org.telegram.tgnet.TLRPC$TL_premiumGiftOption;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

public class GiftInfoBottomSheet extends BottomSheetWithRecyclerListView {
    private GiftInfoAdapter adapter;
    private final TLRPC$TL_payments_checkedGiftCode giftCode;
    private final boolean isUnused;
    private String slug;

    public static void show(final BaseFragment baseFragment, final String str, final Browser.Progress progress) {
        if (baseFragment == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (progress != null) {
            progress.init();
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    atomicBoolean.set(true);
                }
            });
        }
        BoostRepository.checkGiftCode(str, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                GiftInfoBottomSheet.lambda$show$1(atomicBoolean, baseFragment, str, progress, (TLRPC$TL_payments_checkedGiftCode) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                GiftInfoBottomSheet.lambda$show$2(atomicBoolean, progress, (TLRPC$TL_error) obj);
            }
        });
    }

    public static void lambda$show$1(AtomicBoolean atomicBoolean, BaseFragment baseFragment, String str, Browser.Progress progress, TLRPC$TL_payments_checkedGiftCode tLRPC$TL_payments_checkedGiftCode) {
        if (atomicBoolean.get() || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tLRPC$TL_payments_checkedGiftCode.from_id == null) {
            TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption = new TLRPC$TL_premiumGiftOption();
            tLRPC$TL_premiumGiftOption.months = tLRPC$TL_payments_checkedGiftCode.months;
            TLRPC$User currentUser = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentUser() : null;
            if (currentUser == null || currentUser.self) {
                currentUser = new TLRPC$TL_user();
            }
            PremiumPreviewGiftLinkBottomSheet.show(str, tLRPC$TL_premiumGiftOption, currentUser, tLRPC$TL_payments_checkedGiftCode.used_date != 0);
        } else {
            baseFragment.showDialog(new GiftInfoBottomSheet(baseFragment, false, true, tLRPC$TL_payments_checkedGiftCode, str));
        }
        if (progress != null) {
            progress.end();
        }
    }

    public static void lambda$show$2(AtomicBoolean atomicBoolean, Browser.Progress progress, TLRPC$TL_error tLRPC$TL_error) {
        if (atomicBoolean.get() || progress == null) {
            return;
        }
        progress.end();
    }

    public static void show(BaseFragment baseFragment, String str) {
        show(baseFragment, str, null);
    }

    public static boolean handleIntent(Intent intent, Browser.Progress progress) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (scheme.equals("http") || scheme.equals("https")) {
            String lowerCase = data.getHost().toLowerCase();
            if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
                return false;
            }
            String lastPathSegment = data.getLastPathSegment();
            if (!path.startsWith("/giftcode") || lastPathSegment == null) {
                return false;
            }
            show(LaunchActivity.getLastFragment(), lastPathSegment, progress);
            return true;
        }
        if (!scheme.equals("tg")) {
            return false;
        }
        String uri = data.toString();
        String lastPathSegment2 = data.getLastPathSegment();
        if ((!uri.startsWith("tg:giftcode") && !uri.startsWith("tg://giftcode")) || lastPathSegment2 == null) {
            return false;
        }
        show(LaunchActivity.getLastFragment(), lastPathSegment2, progress);
        return true;
    }

    public GiftInfoBottomSheet(BaseFragment baseFragment, boolean z, boolean z2, TLRPC$TL_payments_checkedGiftCode tLRPC$TL_payments_checkedGiftCode, String str) {
        super(baseFragment, z, z2);
        this.isUnused = tLRPC$TL_payments_checkedGiftCode.used_date == 0;
        this.giftCode = tLRPC$TL_payments_checkedGiftCode;
        this.slug = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        updateTitle();
        this.adapter.init(baseFragment, tLRPC$TL_payments_checkedGiftCode, str, this.container);
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        Bulletin.addDelegate(this.container, new Bulletin.Delegate(this) {
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
            public int getBottomOffset(int i) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
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

            @Override
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }
        });
    }

    @Override
    protected CharSequence getTitle() {
        return this.isUnused ? LocaleController.getString("BoostingGiftLink", R.string.BoostingGiftLink) : LocaleController.getString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink);
    }

    public class AnonymousClass2 extends GiftInfoAdapter {
        AnonymousClass2(Theme.ResourcesProvider resourcesProvider) {
            super(resourcesProvider);
        }

        @Override
        protected void dismiss() {
            GiftInfoBottomSheet.this.dismiss();
        }

        @Override
        protected void afterCodeApplied() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GiftInfoBottomSheet.AnonymousClass2.this.lambda$afterCodeApplied$0();
                }
            }, 200L);
        }

        public void lambda$afterCodeApplied$0() {
            GiftInfoBottomSheet.this.getBaseFragment().showDialog(new PremiumPreviewBottomSheet(GiftInfoBottomSheet.this.getBaseFragment(), ((BottomSheet) GiftInfoBottomSheet.this).currentAccount, null, null, ((BottomSheet) GiftInfoBottomSheet.this).resourcesProvider).setAnimateConfetti(true).setOutboundGift(true));
        }

        @Override
        public void onObjectClicked(TLObject tLObject) {
            dismiss();
            if (tLObject instanceof TLRPC$Chat) {
                GiftInfoBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(-((TLRPC$Chat) tLObject).id));
                return;
            }
            if (tLObject instanceof TLRPC$User) {
                GiftInfoBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(((TLRPC$User) tLObject).id));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -DialogObject.getPeerDialogId(GiftInfoBottomSheet.this.giftCode.from_id));
            bundle.putInt("message_id", GiftInfoBottomSheet.this.giftCode.giveaway_msg_id);
            GiftInfoBottomSheet.this.getBaseFragment().presentFragment(new ChatActivity(bundle));
        }

        @Override
        public void onHiddenLinkClicked() {
            String string;
            if ((GiftInfoBottomSheet.this.slug == null || GiftInfoBottomSheet.this.slug.isEmpty()) && GiftInfoBottomSheet.this.giftCode.to_id == -1) {
                string = LocaleController.getString("BoostingOnlyGiveawayCreatorSeeLink", R.string.BoostingOnlyGiveawayCreatorSeeLink);
            } else {
                string = LocaleController.getString("BoostingOnlyRecipientCode", R.string.BoostingOnlyRecipientCode);
            }
            GiftInfoBottomSheet giftInfoBottomSheet = GiftInfoBottomSheet.this;
            BulletinFactory.of(giftInfoBottomSheet.container, ((BottomSheet) giftInfoBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, string).show(true);
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.resourcesProvider);
        this.adapter = anonymousClass2;
        return anonymousClass2;
    }
}
