package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ci0 {
    public static final ci0 E;
    public static final ci0 F;
    public static final ci0 G;
    public static final ci0 H;
    public static final ci0 I;
    public static final ci0 J;
    public static final ci0 K;
    public static final ci0[] L;
    public static final ci0 d;
    public static final ci0 e;
    public static final ci0 f24077f;
    public static final ci0 h;
    public static final ci0 f24078n;
    public static final ci0 f24079r;
    public static final ci0 f24080s;
    public static final ci0 v;
    public static final ci0 f24081w;
    public static final ci0 f24082x;
    public static final ci0 f24083y;
    public final int f24084a;
    public final int f24085b;
    public final int f24086c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ci0 ci0Var = new ci0("MESSAGE", 0, i10, i11, i12);
        d = ci0Var;
        ci0 ci0Var2 = new ci0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = ci0Var2;
        ci0 ci0Var3 = new ci0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f24077f = ci0Var3;
        ci0 ci0Var4 = new ci0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ci0Var4;
        ci0 ci0Var5 = new ci0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f24078n = ci0Var5;
        ci0 ci0Var6 = new ci0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f24079r = ci0Var6;
        ci0 ci0Var7 = new ci0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f24080s = ci0Var7;
        ci0 ci0Var8 = new ci0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ci0Var8;
        ci0 ci0Var9 = new ci0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f24081w = ci0Var9;
        ci0 ci0Var10 = new ci0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f24082x = ci0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ci0 ci0Var11 = new ci0("LEAVE", 10, i13, i14, i14);
        f24083y = ci0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ci0 ci0Var12 = new ci0("VOICE_CHAT", 11, i15, i16, i16);
        E = ci0Var12;
        ci0 ci0Var13 = new ci0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ci0Var13;
        ci0 ci0Var14 = new ci0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ci0Var14;
        ci0 ci0Var15 = new ci0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ci0Var15;
        ci0 ci0Var16 = new ci0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ci0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ci0 ci0Var17 = new ci0("EDIT_USERNAME", 16, i17, i18, i19);
        ci0 ci0Var18 = new ci0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ci0Var18;
        ci0 ci0Var19 = new ci0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ci0Var19;
        L = new ci0[]{ci0Var, ci0Var2, ci0Var3, ci0Var4, ci0Var5, ci0Var6, ci0Var7, ci0Var8, ci0Var9, ci0Var10, ci0Var11, ci0Var12, ci0Var13, ci0Var14, ci0Var15, ci0Var16, ci0Var17, ci0Var18, ci0Var19};
    }

    public ci0(String str, int i10, int i11, int i12, int i13) {
        this.f24084a = i11;
        this.f24085b = i12;
        this.f24086c = i13;
    }

    public static ci0 valueOf(String str) {
        return (ci0) Enum.valueOf(ci0.class, str);
    }

    public static ci0[] values() {
        return (ci0[]) L.clone();
    }
}
