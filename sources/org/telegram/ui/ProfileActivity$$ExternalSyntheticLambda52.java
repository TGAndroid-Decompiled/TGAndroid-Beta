package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ShareAlert;

public final class ProfileActivity$$ExternalSyntheticLambda52 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ProfileActivity$$ExternalSyntheticLambda52(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f$3;
                ProfileActivity$$ExternalSyntheticLambda48 profileActivity$$ExternalSyntheticLambda48 = (ProfileActivity$$ExternalSyntheticLambda48) this.f$4;
                ((ProfileActivity) this.f$0).lambda$onMemberClick$63((TLRPC.ChannelParticipant) this.f$1, (TLRPC.ChatParticipant) this.f$2, user, profileActivity$$ExternalSyntheticLambda48);
                break;
            case 1:
                ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$resendCode$2((TLRPC.TL_error) this.f$1, (Bundle) this.f$2, (TLObject) this.f$3, (TLRPC.TL_auth_resendCode) this.f$4);
                break;
            case 2:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$73((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3, (TL_account.getPassword) this.f$4);
                break;
            case 3:
                ((PrivacyControlActivity) this.f$0).lambda$applyCurrentPrivacySettings$16((TLRPC.TL_error) this.f$1, (boolean[]) this.f$2, (TLRPC.GlobalPrivacySettings) this.f$3, (TL_account.setGlobalPrivacySettings) this.f$4);
                break;
            case 4:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$71((TLObject) this.f$1, (String) this.f$2, (TLRPC.User) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 5:
                ((ProfileActivity) this.f$0).lambda$editRow$141((TLObject) this.f$1, (TLRPC.UserFull) this.f$2, (TL_account.TL_birthday) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 6:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$67((TLObject) this.f$1, (TLRPC.TL_username) this.f$2, (ShareAlert) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 7:
                ((ProfileActivity.SearchAdapter) this.f$0).lambda$search$143((String) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 8:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$onEmojiClick$32((SelectAnimatedEmojiDialog.ImageViewEmoji) this.f$1, (AnimatedEmojiSpan) this.f$2, (TLRPC.Document) this.f$3, (SelectAnimatedEmojiDialog.ImageViewEmoji) this.f$4);
                break;
            default:
                ((SelectChatUserSheet) this.f$0).lambda$initTransfer$10((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TwoStepVerificationActivity) this.f$4, (TLRPC.User) this.f$3);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda52(TLObject tLObject, TLRPC.TL_error tL_error, TLRPC.User user, SelectChatUserSheet selectChatUserSheet, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.$r8$classId = 9;
        this.f$0 = selectChatUserSheet;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$4 = twoStepVerificationActivity;
        this.f$3 = user;
    }
}
