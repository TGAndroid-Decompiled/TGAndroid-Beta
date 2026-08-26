package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ChatMessageCell;

public final class LoginActivity$$ExternalSyntheticLambda33 implements OnSuccessListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId = 2;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;

    public LoginActivity$$ExternalSyntheticLambda33(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings) {
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = chatMessageCell;
        this.f$2 = zArr;
        this.f$4 = z;
        this.f$3 = contentsettings;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressRevealSensitiveContent$57((ChatMessageCell) this.f$1, (boolean[]) this.f$2, this.f$4, (TL_account.contentSettings) this.f$3, alertDialog, i);
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).lambda$fillNextCodeParams$24((Bundle) this.f$1, (TLRPC.auth_SentCode) this.f$2, (String) this.f$3, this.f$4, (IntegrityTokenResponse) obj);
                break;
            default:
                LoginActivity loginActivity = (LoginActivity) this.f$0;
                TLRPC.auth_SentCode auth_sentcode = (TLRPC.auth_SentCode) this.f$2;
                Bundle bundle = (Bundle) this.f$1;
                loginActivity.lambda$fillNextCodeParams$28((String) this.f$3, auth_sentcode, bundle, this.f$4, (SafetyNetApi$AttestationResponse) obj);
                break;
        }
    }

    public LoginActivity$$ExternalSyntheticLambda33(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z) {
        this.f$0 = loginActivity;
        this.f$1 = bundle;
        this.f$2 = auth_sentcode;
        this.f$3 = str;
        this.f$4 = z;
    }

    public LoginActivity$$ExternalSyntheticLambda33(LoginActivity loginActivity, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z) {
        this.f$0 = loginActivity;
        this.f$3 = str;
        this.f$2 = auth_sentcode;
        this.f$1 = bundle;
        this.f$4 = z;
    }
}
