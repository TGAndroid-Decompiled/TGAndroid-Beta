package org.telegram.ui.Components.Premium.boosts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
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
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public class GiftInfoBottomSheet extends BottomSheetWithRecyclerListView {
    private GiftInfoAdapter adapter;
    private final TLRPC$TL_payments_checkedGiftCode giftCode;
    private final boolean isUnused;
    private UndoView undoView;

    public static void show(final BaseFragment baseFragment, final String str, final Browser.Progress progress) {
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
        if (atomicBoolean.get()) {
            return;
        }
        GiftInfoBottomSheet giftInfoBottomSheet = new GiftInfoBottomSheet(baseFragment, false, true, tLRPC$TL_payments_checkedGiftCode, str);
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(giftInfoBottomSheet);
        } else {
            giftInfoBottomSheet.show();
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

    public static boolean handleIntent(Intent intent, Browser.Progress progress) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (scheme.equals("http") || scheme.equals("https")) {
            String lowerCase = data.getHost().toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null) {
                String lastPathSegment = data.getLastPathSegment();
                if (!path.startsWith("/giftcode") || lastPathSegment == null) {
                    return false;
                }
                show(LaunchActivity.getLastFragment(), lastPathSegment, progress);
                return true;
            }
            return false;
        } else if (scheme.equals("tg")) {
            String uri = data.toString();
            String lastPathSegment2 = data.getLastPathSegment();
            if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment2 != null) {
                show(LaunchActivity.getLastFragment(), lastPathSegment2, progress);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public GiftInfoBottomSheet(BaseFragment baseFragment, boolean z, boolean z2, TLRPC$TL_payments_checkedGiftCode tLRPC$TL_payments_checkedGiftCode, String str) {
        super(baseFragment, z, z2);
        this.isUnused = tLRPC$TL_payments_checkedGiftCode.used_date == 0;
        this.giftCode = tLRPC$TL_payments_checkedGiftCode;
        setApplyTopPadding(false);
        setApplyBottomPadding(true);
        fixNavigationBar();
        updateTitle();
        this.adapter.init(baseFragment, tLRPC$TL_payments_checkedGiftCode, str);
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.undoView = new UndoView(getContext(), getBaseFragment(), true, this.resourcesProvider);
        ((ViewGroup) getWindow().getDecorView()).addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 51, 10.0f, 42.0f, 10.0f, 8.0f));
    }

    @Override
    protected CharSequence getTitle() {
        return this.isUnused ? LocaleController.getString("BoostingGiftLink", R.string.BoostingGiftLink) : LocaleController.getString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink);
    }

    public class AnonymousClass1 extends GiftInfoAdapter {
        AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
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
                    GiftInfoBottomSheet.AnonymousClass1.this.lambda$afterCodeApplied$0();
                }
            }, 200L);
        }

        public void lambda$afterCodeApplied$0() {
            GiftInfoBottomSheet.this.getBaseFragment().showDialog(new PremiumPreviewBottomSheet(GiftInfoBottomSheet.this.getBaseFragment(), ((BottomSheet) GiftInfoBottomSheet.this).currentAccount, null, null, ((BottomSheet) GiftInfoBottomSheet.this).resourcesProvider).setAnimateConfetti(true).setOutboundGift(true));
        }

        @Override
        protected void onObjectClicked(TLObject tLObject) {
            dismiss();
            if (tLObject instanceof TLRPC$Chat) {
                GiftInfoBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(-((TLRPC$Chat) tLObject).id));
            } else if (tLObject instanceof TLRPC$User) {
                GiftInfoBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(((TLRPC$User) tLObject).id));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -DialogObject.getPeerDialogId(GiftInfoBottomSheet.this.giftCode.from_id));
                bundle.putInt("message_id", GiftInfoBottomSheet.this.giftCode.giveaway_msg_id);
                GiftInfoBottomSheet.this.getBaseFragment().presentFragment(new ChatActivity(bundle));
            }
        }

        @Override
        protected void onHiddenLinkClicked() {
            GiftInfoBottomSheet.this.undoView.showWithAction(0L, 94, null, null);
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.resourcesProvider);
        this.adapter = anonymousClass1;
        return anonymousClass1;
    }
}
