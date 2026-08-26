package org.telegram.ui;

import android.animation.Animator;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class ThemeActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ThemeActivity$$ExternalSyntheticLambda9(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ThemeActivity) this.f$0).lambda$createView$8((View) this.f$1);
                break;
            case 1:
                ((ThemePreviewActivity) this.f$0).lambda$showAnimationHint$32((SharedPreferences) this.f$1);
                break;
            case 2:
                ((ThemeSetUrlActivity) this.f$0).lambda$saveTheme$10((TLRPC.TL_theme) this.f$1);
                break;
            case 3:
                ((ThemeSetUrlActivity) this.f$0).lambda$checkUrl$8((String) this.f$1);
                break;
            case 4:
                ((TodoItemMenu) this.f$0).lambda$setCell$4((String) this.f$1);
                break;
            case 5:
                ((TodoItemMenu) this.f$0).lambda$setCell$5((TLRPC.TodoItem) this.f$1);
                break;
            case 6:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$35((byte[]) this.f$1);
                break;
            case 7:
                ((TwoStepVerificationActivity) this.f$0).lambda$clearPassword$27((TL_account.updatePasswordSettings) this.f$1);
                break;
            case 8:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$33((TLRPC.TL_error) this.f$1);
                break;
            case 9:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$processNext$29((String) this.f$1);
                break;
            case 10:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$animateSuccess$22((Runnable) this.f$1);
                break;
            case 11:
                ((UserInfoActivity.AdminedChannelsFetcher) this.f$0).lambda$fetch$0((TLObject) this.f$1);
                break;
            case 12:
                ((VoIPFragment) this.f$0).lambda$updateViewState$23((VoIPService) this.f$1);
                break;
            case 13:
                ((VoIPFragment) this.f$0).lambda$startTransitionFromPiP$18((Animator) this.f$1);
                break;
            default:
                ((WebviewActivity) this.f$0).lambda$reloadStats$0((TLObject) this.f$1);
                break;
        }
    }
}
