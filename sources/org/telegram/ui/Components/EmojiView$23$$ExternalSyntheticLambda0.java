package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class EmojiView$23$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;

    public EmojiView$23$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                EmojiView.AnonymousClass23.lambda$sendReorder$2(tLObject, tL_error);
                break;
            case 1:
                AlertsCreator.lambda$createChangeNameAlert$90(tLObject, tL_error);
                break;
            case 2:
                AlertsCreator.lambda$createChangeBioAlert$86(tLObject, tL_error);
                break;
            case 3:
                FilterTabsView.lambda$setIsEditing$2(tLObject, tL_error);
                break;
            case 4:
                StickersDialogs.lambda$showDeleteForEveryOneDialog$6(tLObject, tL_error);
                break;
            case 5:
                TermsOfServiceView.lambda$accept$7(tLObject, tL_error);
                break;
            default:
                ViewPagerFixed.TabsView.lambda$setIsEditing$5(tLObject, tL_error);
                break;
        }
    }
}
