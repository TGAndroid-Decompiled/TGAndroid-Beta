package org.telegram.ui.bots;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;

public final class BotLocation$$ExternalSyntheticLambda14 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public BotLocation$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                BotLocation botLocation = (BotLocation) this.f$0;
                botLocation.getClass();
                boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    botLocation.requested = true;
                    botLocation.granted = false;
                    botLocation.save();
                    Iterator it = botLocation.listeners.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    ((BotWebViewContainer$$ExternalSyntheticLambda12) this.f$2).run(Boolean.TRUE, Boolean.FALSE);
                }
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f$0);
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (baseFragment != null) {
                    AndroidUtilities.requestAdjustResize((Activity) this.f$2, baseFragment.getClassGuid());
                }
                break;
            case 2:
                ((Utilities.Callback) this.f$0).run(Integer.valueOf(((AlertsCreator.AnonymousClass23) this.f$2).getValue() + (((AlertsCreator.AnonymousClass21) this.f$1).getValue() * 60)));
                break;
            case 3:
                AndroidUtilities.hideKeyboard((AuctionBidSheet.AnonymousClass4) this.f$0);
                BaseFragment baseFragment2 = (BaseFragment) this.f$1;
                if (baseFragment2 != null) {
                    AndroidUtilities.requestAdjustResize((Activity) this.f$2, baseFragment2.getClassGuid());
                }
                break;
            case 4:
                ProfileGiftsContainer profileGiftsContainer = (ProfileGiftsContainer) this.f$0;
                profileGiftsContainer.getClass();
                AndroidUtilities.hideKeyboard((ProfileGiftsContainer.AnonymousClass5) this.f$1);
                AndroidUtilities.requestAdjustResize((Activity) this.f$2, profileGiftsContainer.fragment.getClassGuid());
                break;
            case 5:
                if (!((boolean[]) this.f$1)[0]) {
                    boolean[] zArr2 = (boolean[]) this.f$0;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        ((Utilities.Callback) this.f$2).run("USER_DECLINED");
                    }
                }
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                boolean[] zArr3 = (boolean[]) this.f$1;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj((String) this.f$2, "req_id"));
                }
                break;
        }
    }

    public BotLocation$$ExternalSyntheticLambda14(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.$r8$classId = 5;
        this.f$1 = zArr;
        this.f$0 = zArr2;
        this.f$2 = callback;
    }
}
