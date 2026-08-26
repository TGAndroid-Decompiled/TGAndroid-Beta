package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;

public final class VoIPFragment$$ExternalSyntheticLambda6 implements AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public VoIPFragment$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((ChangeUsernameActivity.AnonymousClass2) this.f$0).lambda$onItemClick$3((TLRPC.TL_username) this.f$2, this.f$1, (ChangeUsernameActivity.UsernameCell) this.f$3, alertDialog, i);
                break;
            default:
                ((PasskeysActivity) this.f$0).lambda$openMenu$2((TL_account.Passkey) this.f$2, (String) this.f$3, this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        ((VoIPFragment) this.f$0).lambda$setSpeakerPhoneAction$38(this.f$1, (VoIpSwitchLayout) this.f$2, (VoIPService) this.f$3, voIpButtonView);
    }

    @Override
    public void run(boolean z) {
        ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$108((ArrayList) this.f$2, this.f$1, (HashSet) this.f$3, z);
    }

    public VoIPFragment$$ExternalSyntheticLambda6(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i) {
        this.$r8$classId = 3;
        this.f$0 = passkeysActivity;
        this.f$2 = passkey;
        this.f$3 = str;
        this.f$1 = i;
    }

    public VoIPFragment$$ExternalSyntheticLambda6(VoIPFragment voIPFragment, int i, VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService) {
        this.$r8$classId = 0;
        this.f$0 = voIPFragment;
        this.f$1 = i;
        this.f$2 = voIpSwitchLayout;
        this.f$3 = voIPService;
    }
}
