package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class hi0 {
    public static final hi0 E;
    public static final hi0 F;
    public static final hi0 G;
    public static final hi0 H;
    public static final hi0 I;
    public static final hi0 J;
    public static final hi0 K;
    public static final hi0[] L;
    public static final hi0 d;
    public static final hi0 f27128e;
    public static final hi0 f27129f;
    public static final hi0 h;
    public static final hi0 f27130n;
    public static final hi0 f27131r;
    public static final hi0 f27132s;
    public static final hi0 v;
    public static final hi0 f27133w;
    public static final hi0 f27134x;
    public static final hi0 f27135y;
    public final int f27136a;
    public final int f27137b;
    public final int f27138c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        hi0 hi0Var = new hi0("MESSAGE", 0, i10, i11, i12);
        d = hi0Var;
        hi0 hi0Var2 = new hi0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f27128e = hi0Var2;
        hi0 hi0Var3 = new hi0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f27129f = hi0Var3;
        hi0 hi0Var4 = new hi0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = hi0Var4;
        hi0 hi0Var5 = new hi0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f27130n = hi0Var5;
        hi0 hi0Var6 = new hi0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f27131r = hi0Var6;
        hi0 hi0Var7 = new hi0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f27132s = hi0Var7;
        hi0 hi0Var8 = new hi0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = hi0Var8;
        hi0 hi0Var9 = new hi0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f27133w = hi0Var9;
        hi0 hi0Var10 = new hi0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f27134x = hi0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        hi0 hi0Var11 = new hi0("LEAVE", 10, i13, i14, i14);
        f27135y = hi0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        hi0 hi0Var12 = new hi0("VOICE_CHAT", 11, i15, i16, i16);
        E = hi0Var12;
        hi0 hi0Var13 = new hi0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = hi0Var13;
        hi0 hi0Var14 = new hi0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = hi0Var14;
        hi0 hi0Var15 = new hi0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = hi0Var15;
        hi0 hi0Var16 = new hi0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = hi0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        hi0 hi0Var17 = new hi0("EDIT_USERNAME", 16, i17, i18, i19);
        hi0 hi0Var18 = new hi0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = hi0Var18;
        hi0 hi0Var19 = new hi0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = hi0Var19;
        L = new hi0[]{hi0Var, hi0Var2, hi0Var3, hi0Var4, hi0Var5, hi0Var6, hi0Var7, hi0Var8, hi0Var9, hi0Var10, hi0Var11, hi0Var12, hi0Var13, hi0Var14, hi0Var15, hi0Var16, hi0Var17, hi0Var18, hi0Var19};
    }

    public hi0(String str, int i10, int i11, int i12, int i13) {
        this.f27136a = i11;
        this.f27137b = i12;
        this.f27138c = i13;
    }

    public static hi0 valueOf(String str) {
        return (hi0) Enum.valueOf(hi0.class, str);
    }

    public static hi0[] values() {
        return (hi0[]) L.clone();
    }
}
