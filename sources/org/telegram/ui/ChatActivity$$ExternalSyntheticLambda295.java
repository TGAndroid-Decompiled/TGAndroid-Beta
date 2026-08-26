package org.telegram.ui;

import android.content.Context;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.LinkSpanDrawable;

public final class ChatActivity$$ExternalSyntheticLambda295 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$$ExternalSyntheticLambda295(CharSequence charSequence, String str, TLObject tLObject, TLRPC.TL_error tL_error, ReportBottomSheet reportBottomSheet, byte[] bArr) {
        this.$r8$classId = 5;
        this.f$0 = reportBottomSheet;
        this.f$4 = tLObject;
        this.f$1 = charSequence;
        this.f$2 = tL_error;
        this.f$5 = bArr;
        this.f$3 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressCard$424((Browser.Progress) this.f$1, (ChatMessageCell) this.f$2, (String) this.f$3, (TLObject) this.f$4, (CharacterStyle) this.f$5);
                break;
            case 1:
                ((PassportActivity) this.f$0).lambda$startPhoneVerification$65((TLRPC.TL_error) this.f$1, (String) this.f$3, (PassportActivity.PassportActivityDelegate) this.f$2, (TLObject) this.f$4, (TL_account.sendVerifyPhoneCode) this.f$5);
                break;
            case 2:
                CallLogActivity.lambda$showCallLinkSheet$28((TLObject) this.f$4, (String[]) this.f$0, (FrameLayout) this.f$1, (LinkSpanDrawable.LinksTextView) this.f$2, (BottomSheet) this.f$3, (Theme.ResourcesProvider) this.f$5);
                break;
            case 3:
                ((ChannelAdminLogActivity) this.f$0).lambda$createMenu$15((TLRPC.ChannelParticipant) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (ArrayList) this.f$4, (Runnable) this.f$5);
                break;
            case 4:
                ReportBottomSheet.lambda$openSponsoredPeer$23((TLObject) this.f$4, (Context) this.f$0, (Theme.ResourcesProvider) this.f$1, (byte[]) this.f$2, (BaseFragment) this.f$3, (Runnable) this.f$5);
                break;
            case 5:
                ((ReportBottomSheet) this.f$0).lambda$submitOption$3((TLObject) this.f$4, (CharSequence) this.f$1, (TLRPC.TL_error) this.f$2, (byte[]) this.f$5, (String) this.f$3);
                break;
            default:
                ((SelectChatUserSheet) this.f$0).lambda$initTransfer$12((TLRPC.TL_error) this.f$1, (TLRPC.InputCheckPasswordSRP) this.f$2, (TLRPC.User) this.f$3, (TwoStepVerificationActivity) this.f$4, (TLRPC.TL_channels_editCreator) this.f$5);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda295(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    public ChatActivity$$ExternalSyntheticLambda295(String str, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.sendVerifyPhoneCode sendverifyphonecode, PassportActivity.PassportActivityDelegate passportActivityDelegate, PassportActivity passportActivity) {
        this.$r8$classId = 1;
        this.f$0 = passportActivity;
        this.f$1 = tL_error;
        this.f$3 = str;
        this.f$2 = passportActivityDelegate;
        this.f$4 = tLObject;
        this.f$5 = sendverifyphonecode;
    }

    public ChatActivity$$ExternalSyntheticLambda295(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$4 = tLObject;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$5 = obj5;
    }
}
