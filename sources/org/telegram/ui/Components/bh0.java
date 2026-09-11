package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class bh0 {
    public static final bh0 E;
    public static final bh0 F;
    public static final bh0 G;
    public static final bh0 H;
    public static final bh0 I;
    public static final bh0 J;
    public static final bh0 K;
    public static final bh0[] L;
    public static final bh0 d;
    public static final bh0 f24700e;
    public static final bh0 f24701f;
    public static final bh0 h;
    public static final bh0 f24702n;
    public static final bh0 f24703r;
    public static final bh0 f24704s;
    public static final bh0 v;
    public static final bh0 f24705w;
    public static final bh0 f24706x;
    public static final bh0 f24707y;
    public final int f24708a;
    public final int f24709b;
    public final int f24710c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        bh0 bh0Var = new bh0("MESSAGE", 0, i10, i11, i12);
        d = bh0Var;
        bh0 bh0Var2 = new bh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f24700e = bh0Var2;
        bh0 bh0Var3 = new bh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f24701f = bh0Var3;
        bh0 bh0Var4 = new bh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = bh0Var4;
        bh0 bh0Var5 = new bh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f24702n = bh0Var5;
        bh0 bh0Var6 = new bh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f24703r = bh0Var6;
        bh0 bh0Var7 = new bh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f24704s = bh0Var7;
        bh0 bh0Var8 = new bh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = bh0Var8;
        bh0 bh0Var9 = new bh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f24705w = bh0Var9;
        bh0 bh0Var10 = new bh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f24706x = bh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        bh0 bh0Var11 = new bh0("LEAVE", 10, i13, i14, i14);
        f24707y = bh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        bh0 bh0Var12 = new bh0("VOICE_CHAT", 11, i15, i16, i16);
        E = bh0Var12;
        bh0 bh0Var13 = new bh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = bh0Var13;
        bh0 bh0Var14 = new bh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = bh0Var14;
        bh0 bh0Var15 = new bh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = bh0Var15;
        bh0 bh0Var16 = new bh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = bh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        bh0 bh0Var17 = new bh0("EDIT_USERNAME", 16, i17, i18, i19);
        bh0 bh0Var18 = new bh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = bh0Var18;
        bh0 bh0Var19 = new bh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = bh0Var19;
        L = new bh0[]{bh0Var, bh0Var2, bh0Var3, bh0Var4, bh0Var5, bh0Var6, bh0Var7, bh0Var8, bh0Var9, bh0Var10, bh0Var11, bh0Var12, bh0Var13, bh0Var14, bh0Var15, bh0Var16, bh0Var17, bh0Var18, bh0Var19};
    }

    public bh0(String str, int i10, int i11, int i12, int i13) {
        this.f24708a = i11;
        this.f24709b = i12;
        this.f24710c = i13;
    }

    public static bh0 valueOf(String str) {
        return (bh0) Enum.valueOf(bh0.class, str);
    }

    public static bh0[] values() {
        return (bh0[]) L.clone();
    }
}
