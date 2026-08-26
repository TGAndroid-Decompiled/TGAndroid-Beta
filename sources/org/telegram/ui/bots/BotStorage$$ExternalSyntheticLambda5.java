package org.telegram.ui.bots;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;
import org.telegram.ui.web.BotWebViewContainer;

public final class BotStorage$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BotStorage$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = (GiftSheet$$ExternalSyntheticLambda23) this.f$1;
                    zArr[0] = true;
                    giftSheet$$ExternalSyntheticLambda23.run(null);
                }
                break;
            case 1:
                ((BaseFragment) this.f$0).lambda$showDialog$0((DialogInterface.OnDismissListener) this.f$1, dialogInterface);
                break;
            case 2:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                baseFragment.onPause();
                baseFragment.onFragmentDestroy();
                BaseFragment.BottomSheetParams bottomSheetParams = (BaseFragment.BottomSheetParams) this.f$1;
                if (bottomSheetParams != null && (runnable = bottomSheetParams.onDismiss) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$1;
                mentionsAdapter.getClass();
                if (!((boolean[]) this.f$0)[0]) {
                    mentionsAdapter.onLocationUnavailable();
                }
                break;
            case 4:
                if (!((AtomicBoolean) this.f$0).get()) {
                    ((RichEditor$$ExternalSyntheticLambda48) this.f$1).run();
                }
                break;
            case 5:
                SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda0 = (SendGiftSheet$$ExternalSyntheticLambda0) this.f$1;
                if (!((boolean[]) this.f$0)[0]) {
                    sendGiftSheet$$ExternalSyntheticLambda0.run(Boolean.FALSE, null);
                }
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) this.f$0;
                if (!zArr2[0]) {
                    ((StarGiftSheet$$ExternalSyntheticLambda140) this.f$1).run(Boolean.FALSE);
                    zArr2[0] = true;
                }
                break;
            case 7:
                ((BotWebViewContainer) this.f$0).lambda$showDialog$60((Runnable) this.f$1, dialogInterface);
                break;
            case 8:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$10((AtomicBoolean) this.f$1, dialogInterface);
                break;
            default:
                boolean[] zArr3 = (boolean[]) this.f$0;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((JsPromptResult) this.f$1).cancel();
                }
                break;
        }
    }

    public BotStorage$$ExternalSyntheticLambda5(int i, Object obj, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = zArr;
    }
}
