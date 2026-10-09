package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class gi0 {
    public static final gi0 E;
    public static final gi0 F;
    public static final gi0 G;
    public static final gi0 H;
    public static final gi0 I;
    public static final gi0 J;
    public static final gi0 K;
    public static final gi0[] L;
    public static final gi0 d;
    public static final gi0 f26724e;
    public static final gi0 f26725f;
    public static final gi0 h;
    public static final gi0 f26726n;
    public static final gi0 f26727r;
    public static final gi0 f26728s;
    public static final gi0 v;
    public static final gi0 f26729w;
    public static final gi0 f26730x;
    public static final gi0 f26731y;
    public final int f26732a;
    public final int f26733b;
    public final int f26734c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        gi0 gi0Var = new gi0("MESSAGE", 0, i10, i11, i12);
        d = gi0Var;
        gi0 gi0Var2 = new gi0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f26724e = gi0Var2;
        gi0 gi0Var3 = new gi0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f26725f = gi0Var3;
        gi0 gi0Var4 = new gi0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = gi0Var4;
        gi0 gi0Var5 = new gi0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f26726n = gi0Var5;
        gi0 gi0Var6 = new gi0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f26727r = gi0Var6;
        gi0 gi0Var7 = new gi0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f26728s = gi0Var7;
        gi0 gi0Var8 = new gi0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = gi0Var8;
        gi0 gi0Var9 = new gi0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f26729w = gi0Var9;
        gi0 gi0Var10 = new gi0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f26730x = gi0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        gi0 gi0Var11 = new gi0("LEAVE", 10, i13, i14, i14);
        f26731y = gi0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        gi0 gi0Var12 = new gi0("VOICE_CHAT", 11, i15, i16, i16);
        E = gi0Var12;
        gi0 gi0Var13 = new gi0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = gi0Var13;
        gi0 gi0Var14 = new gi0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = gi0Var14;
        gi0 gi0Var15 = new gi0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = gi0Var15;
        gi0 gi0Var16 = new gi0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = gi0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        gi0 gi0Var17 = new gi0("EDIT_USERNAME", 16, i17, i18, i19);
        gi0 gi0Var18 = new gi0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = gi0Var18;
        gi0 gi0Var19 = new gi0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = gi0Var19;
        L = new gi0[]{gi0Var, gi0Var2, gi0Var3, gi0Var4, gi0Var5, gi0Var6, gi0Var7, gi0Var8, gi0Var9, gi0Var10, gi0Var11, gi0Var12, gi0Var13, gi0Var14, gi0Var15, gi0Var16, gi0Var17, gi0Var18, gi0Var19};
    }

    public gi0(String str, int i10, int i11, int i12, int i13) {
        this.f26732a = i11;
        this.f26733b = i12;
        this.f26734c = i13;
    }

    public static gi0 valueOf(String str) {
        return (gi0) Enum.valueOf(gi0.class, str);
    }

    public static gi0[] values() {
        return (gi0[]) L.clone();
    }
}
