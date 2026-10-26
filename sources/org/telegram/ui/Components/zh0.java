package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class zh0 {
    public static final zh0 E;
    public static final zh0 F;
    public static final zh0 G;
    public static final zh0 H;
    public static final zh0 I;
    public static final zh0 J;
    public static final zh0 K;
    public static final zh0[] L;
    public static final zh0 d;
    public static final zh0 e;
    public static final zh0 f35332f;
    public static final zh0 h;
    public static final zh0 f35333n;
    public static final zh0 f35334r;
    public static final zh0 f35335s;
    public static final zh0 v;
    public static final zh0 f35336w;
    public static final zh0 f35337x;
    public static final zh0 f35338y;
    public final int f35339a;
    public final int f35340b;
    public final int f35341c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        zh0 zh0Var = new zh0("MESSAGE", 0, i10, i11, i12);
        d = zh0Var;
        zh0 zh0Var2 = new zh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = zh0Var2;
        zh0 zh0Var3 = new zh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f35332f = zh0Var3;
        zh0 zh0Var4 = new zh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = zh0Var4;
        zh0 zh0Var5 = new zh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f35333n = zh0Var5;
        zh0 zh0Var6 = new zh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f35334r = zh0Var6;
        zh0 zh0Var7 = new zh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f35335s = zh0Var7;
        zh0 zh0Var8 = new zh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = zh0Var8;
        zh0 zh0Var9 = new zh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f35336w = zh0Var9;
        zh0 zh0Var10 = new zh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f35337x = zh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        zh0 zh0Var11 = new zh0("LEAVE", 10, i13, i14, i14);
        f35338y = zh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        zh0 zh0Var12 = new zh0("VOICE_CHAT", 11, i15, i16, i16);
        E = zh0Var12;
        zh0 zh0Var13 = new zh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = zh0Var13;
        zh0 zh0Var14 = new zh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = zh0Var14;
        zh0 zh0Var15 = new zh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = zh0Var15;
        zh0 zh0Var16 = new zh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = zh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        zh0 zh0Var17 = new zh0("EDIT_USERNAME", 16, i17, i18, i19);
        zh0 zh0Var18 = new zh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = zh0Var18;
        zh0 zh0Var19 = new zh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = zh0Var19;
        L = new zh0[]{zh0Var, zh0Var2, zh0Var3, zh0Var4, zh0Var5, zh0Var6, zh0Var7, zh0Var8, zh0Var9, zh0Var10, zh0Var11, zh0Var12, zh0Var13, zh0Var14, zh0Var15, zh0Var16, zh0Var17, zh0Var18, zh0Var19};
    }

    public zh0(String str, int i10, int i11, int i12, int i13) {
        this.f35339a = i11;
        this.f35340b = i12;
        this.f35341c = i13;
    }

    public static zh0 valueOf(String str) {
        return (zh0) Enum.valueOf(zh0.class, str);
    }

    public static zh0[] values() {
        return (zh0[]) L.clone();
    }
}
