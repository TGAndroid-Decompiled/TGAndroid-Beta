package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class hh0 {
    public static final hh0 B;
    public static final hh0 C;
    public static final hh0 D;
    public static final hh0 E;
    public static final hh0 F;
    public static final hh0 G;
    public static final hh0 H;
    public static final hh0[] I;
    public static final hh0 d;
    public static final hh0 e;
    public static final hh0 f25416f;
    public static final hh0 h;
    public static final hh0 f25417n;
    public static final hh0 f25418r;
    public static final hh0 f25419s;
    public static final hh0 v;
    public static final hh0 f25420w;
    public static final hh0 f25421x;
    public static final hh0 f25422y;
    public final int f25423a;
    public final int f25424b;
    public final int f25425c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        hh0 hh0Var = new hh0("MESSAGE", 0, i10, i11, i12);
        d = hh0Var;
        hh0 hh0Var2 = new hh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = hh0Var2;
        hh0 hh0Var3 = new hh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f25416f = hh0Var3;
        hh0 hh0Var4 = new hh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = hh0Var4;
        hh0 hh0Var5 = new hh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f25417n = hh0Var5;
        hh0 hh0Var6 = new hh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f25418r = hh0Var6;
        hh0 hh0Var7 = new hh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f25419s = hh0Var7;
        hh0 hh0Var8 = new hh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = hh0Var8;
        hh0 hh0Var9 = new hh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f25420w = hh0Var9;
        hh0 hh0Var10 = new hh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f25421x = hh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        hh0 hh0Var11 = new hh0("LEAVE", 10, i13, i14, i14);
        f25422y = hh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        hh0 hh0Var12 = new hh0("VOICE_CHAT", 11, i15, i16, i16);
        B = hh0Var12;
        hh0 hh0Var13 = new hh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        C = hh0Var13;
        hh0 hh0Var14 = new hh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        D = hh0Var14;
        hh0 hh0Var15 = new hh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        E = hh0Var15;
        hh0 hh0Var16 = new hh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        F = hh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        hh0 hh0Var17 = new hh0("EDIT_USERNAME", 16, i17, i18, i19);
        hh0 hh0Var18 = new hh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        G = hh0Var18;
        hh0 hh0Var19 = new hh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        H = hh0Var19;
        I = new hh0[]{hh0Var, hh0Var2, hh0Var3, hh0Var4, hh0Var5, hh0Var6, hh0Var7, hh0Var8, hh0Var9, hh0Var10, hh0Var11, hh0Var12, hh0Var13, hh0Var14, hh0Var15, hh0Var16, hh0Var17, hh0Var18, hh0Var19};
    }

    public hh0(String str, int i10, int i11, int i12, int i13) {
        this.f25423a = i11;
        this.f25424b = i12;
        this.f25425c = i13;
    }

    public static hh0 valueOf(String str) {
        return (hh0) Enum.valueOf(hh0.class, str);
    }

    public static hh0[] values() {
        return (hh0[]) I.clone();
    }
}
