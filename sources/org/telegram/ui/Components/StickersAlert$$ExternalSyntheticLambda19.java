package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StickersAlert$$ExternalSyntheticLambda19 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final View f$2;
    public final KeyEvent.Callback f$3;
    public final Object f$4;

    public StickersAlert$$ExternalSyntheticLambda19(Object obj, Object obj2, View view, KeyEvent.Callback callback, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = view;
        this.f$3 = callback;
        this.f$4 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StickersAlert) this.f$0).lambda$showNameEnterAlert$42((EditTextBoldCursor) this.f$1, (TextView) this.f$2, (TextView) this.f$3, (int[]) this.f$4, tLObject, tL_error);
                break;
            default:
                MessagePrivateSeenView.lambda$showSheet$6((Context) this.f$0, (Theme.ResourcesProvider) this.f$1, (ButtonWithCounterView) this.f$2, (BottomSheet) this.f$3, (Runnable) this.f$4, tLObject, tL_error);
                break;
        }
    }
}
