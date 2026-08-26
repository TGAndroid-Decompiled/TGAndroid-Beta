package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda48 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final String f$5;

    public ProfileActivity$$ExternalSyntheticLambda48(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z, String str) {
        this.f$0 = profileActivity;
        this.f$1 = channelParticipant;
        this.f$2 = user;
        this.f$3 = chatParticipant;
        this.f$4 = z;
        this.f$5 = str;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                TLRPC.User user = (TLRPC.User) this.f$2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f$3;
                boolean z = this.f$4;
                profileActivity.lambda$onMemberClick$58((TLRPC.ChannelParticipant) this.f$1, user, chatParticipant, z, this.f$5, (Integer) obj);
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$1;
                String str = this.f$5;
                HashMap map = (HashMap) this.f$2;
                selectAnimatedEmojiDialog.lambda$search$27(this.f$4, linkedHashSet, str, map, (ArrayList) this.f$3, (Runnable) obj);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda48(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, boolean z, LinkedHashSet linkedHashSet, String str, HashMap map, ArrayList arrayList) {
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$4 = z;
        this.f$1 = linkedHashSet;
        this.f$5 = str;
        this.f$2 = map;
        this.f$3 = arrayList;
    }
}
