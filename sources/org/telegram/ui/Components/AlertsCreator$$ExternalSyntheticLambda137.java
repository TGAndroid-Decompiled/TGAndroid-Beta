package org.telegram.ui.Components;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AlertsCreator$$ExternalSyntheticLambda137 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final long f$1;
    public final Object f$2;
    public final Object f$3;
    public final Theme.ResourcesProvider f$4;
    public final Object f$5;
    public final Object f$6;

    public AlertsCreator$$ExternalSyntheticLambda137(int i, long j, Activity activity, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback, HashMap map) {
        this.f$0 = i;
        this.f$1 = j;
        this.f$2 = activity;
        this.f$3 = arrayList;
        this.f$4 = resourcesProvider;
        this.f$5 = callback;
        this.f$6 = map;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$ensurePaidMessagesMultiConfirmation$61(this.f$0, this.f$1, (Activity) this.f$2, (ArrayList) this.f$3, this.f$4, (Utilities.Callback) this.f$5, (HashMap) this.f$6);
                break;
            default:
                AlertsCreator.lambda$showCallsForbidden$259((TLObject) this.f$2, this.f$0, (ButtonWithCounterView) this.f$3, (BottomSheet) this.f$5, this.f$1, (TLRPC.TL_error) this.f$6, this.f$4);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda137(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f$2 = tLObject;
        this.f$0 = i;
        this.f$3 = buttonWithCounterView;
        this.f$5 = bottomSheet;
        this.f$1 = j;
        this.f$6 = tL_error;
        this.f$4 = resourcesProvider;
    }
}
