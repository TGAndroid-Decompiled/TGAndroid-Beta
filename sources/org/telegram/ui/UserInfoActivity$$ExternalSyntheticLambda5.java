package org.telegram.ui;

import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UniversalFragment;

public final class UserInfoActivity$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId;
    public final UserInfoActivity f$0;

    public UserInfoActivity$$ExternalSyntheticLambda5(UserInfoActivity userInfoActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity = this.f$0;
                if (userInfoActivity.channel != chat) {
                    userInfoActivity.channel = chat;
                    if (chat != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.EditProfileChannelSet, BulletinFactory.of(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.checkDone$4(true);
                    UniversalFragment.AnonymousClass3 anonymousClass3 = userInfoActivity.listView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.adapter.update(true);
                    }
                    break;
                }
                break;
            default:
                UserInfoActivity userInfoActivity2 = this.f$0;
                userInfoActivity2.birthday = (TL_account.TL_birthday) obj;
                UniversalFragment.AnonymousClass3 anonymousClass4 = userInfoActivity2.listView;
                if (anonymousClass4 != null) {
                    anonymousClass4.adapter.update(true);
                }
                userInfoActivity2.checkDone$4(true);
                break;
        }
    }
}
