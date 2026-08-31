package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class jh0 {
    public static final jh0 B;
    public static final jh0 C;
    public static final jh0 D;
    public static final jh0 E;
    public static final jh0 F;
    public static final jh0 G;
    public static final jh0 H;
    public static final jh0[] I;
    public static final jh0 d;
    public static final jh0 f28115e;
    public static final jh0 f28116f;
    public static final jh0 h;
    public static final jh0 f28117n;
    public static final jh0 f28118r;
    public static final jh0 f28119s;
    public static final jh0 v;
    public static final jh0 f28120w;
    public static final jh0 f28121x;
    public static final jh0 f28122y;
    public final int f28123a;
    public final int f28124b;
    public final int f28125c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        jh0 jh0Var = new jh0("MESSAGE", 0, i10, i11, i12);
        d = jh0Var;
        jh0 jh0Var2 = new jh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f28115e = jh0Var2;
        jh0 jh0Var3 = new jh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f28116f = jh0Var3;
        jh0 jh0Var4 = new jh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = jh0Var4;
        jh0 jh0Var5 = new jh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f28117n = jh0Var5;
        jh0 jh0Var6 = new jh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f28118r = jh0Var6;
        jh0 jh0Var7 = new jh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f28119s = jh0Var7;
        jh0 jh0Var8 = new jh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = jh0Var8;
        jh0 jh0Var9 = new jh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f28120w = jh0Var9;
        jh0 jh0Var10 = new jh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f28121x = jh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        jh0 jh0Var11 = new jh0("LEAVE", 10, i13, i14, i14);
        f28122y = jh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        jh0 jh0Var12 = new jh0("VOICE_CHAT", 11, i15, i16, i16);
        B = jh0Var12;
        jh0 jh0Var13 = new jh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        C = jh0Var13;
        jh0 jh0Var14 = new jh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        D = jh0Var14;
        jh0 jh0Var15 = new jh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        E = jh0Var15;
        jh0 jh0Var16 = new jh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        F = jh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        jh0 jh0Var17 = new jh0("EDIT_USERNAME", 16, i17, i18, i19);
        jh0 jh0Var18 = new jh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        G = jh0Var18;
        jh0 jh0Var19 = new jh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        H = jh0Var19;
        I = new jh0[]{jh0Var, jh0Var2, jh0Var3, jh0Var4, jh0Var5, jh0Var6, jh0Var7, jh0Var8, jh0Var9, jh0Var10, jh0Var11, jh0Var12, jh0Var13, jh0Var14, jh0Var15, jh0Var16, jh0Var17, jh0Var18, jh0Var19};
    }

    public jh0(String str, int i10, int i11, int i12, int i13) {
        this.f28123a = i11;
        this.f28124b = i12;
        this.f28125c = i13;
    }

    public static jh0 valueOf(String str) {
        return (jh0) Enum.valueOf(jh0.class, str);
    }

    public static jh0[] values() {
        return (jh0[]) I.clone();
    }
}
