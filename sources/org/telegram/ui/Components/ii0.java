package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ii0 {
    public static final ii0 E;
    public static final ii0 F;
    public static final ii0 G;
    public static final ii0 H;
    public static final ii0 I;
    public static final ii0 J;
    public static final ii0 K;
    public static final ii0[] L;
    public static final ii0 d;
    public static final ii0 f27350e;
    public static final ii0 f27351f;
    public static final ii0 h;
    public static final ii0 f27352n;
    public static final ii0 f27353r;
    public static final ii0 f27354s;
    public static final ii0 v;
    public static final ii0 f27355w;
    public static final ii0 f27356x;
    public static final ii0 f27357y;
    public final int f27358a;
    public final int f27359b;
    public final int f27360c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ii0 ii0Var = new ii0("MESSAGE", 0, i10, i11, i12);
        d = ii0Var;
        ii0 ii0Var2 = new ii0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f27350e = ii0Var2;
        ii0 ii0Var3 = new ii0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f27351f = ii0Var3;
        ii0 ii0Var4 = new ii0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ii0Var4;
        ii0 ii0Var5 = new ii0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f27352n = ii0Var5;
        ii0 ii0Var6 = new ii0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f27353r = ii0Var6;
        ii0 ii0Var7 = new ii0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f27354s = ii0Var7;
        ii0 ii0Var8 = new ii0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ii0Var8;
        ii0 ii0Var9 = new ii0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f27355w = ii0Var9;
        ii0 ii0Var10 = new ii0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f27356x = ii0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ii0 ii0Var11 = new ii0("LEAVE", 10, i13, i14, i14);
        f27357y = ii0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ii0 ii0Var12 = new ii0("VOICE_CHAT", 11, i15, i16, i16);
        E = ii0Var12;
        ii0 ii0Var13 = new ii0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ii0Var13;
        ii0 ii0Var14 = new ii0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ii0Var14;
        ii0 ii0Var15 = new ii0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ii0Var15;
        ii0 ii0Var16 = new ii0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ii0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ii0 ii0Var17 = new ii0("EDIT_USERNAME", 16, i17, i18, i19);
        ii0 ii0Var18 = new ii0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ii0Var18;
        ii0 ii0Var19 = new ii0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ii0Var19;
        L = new ii0[]{ii0Var, ii0Var2, ii0Var3, ii0Var4, ii0Var5, ii0Var6, ii0Var7, ii0Var8, ii0Var9, ii0Var10, ii0Var11, ii0Var12, ii0Var13, ii0Var14, ii0Var15, ii0Var16, ii0Var17, ii0Var18, ii0Var19};
    }

    public ii0(String str, int i10, int i11, int i12, int i13) {
        this.f27358a = i11;
        this.f27359b = i12;
        this.f27360c = i13;
    }

    public static ii0 valueOf(String str) {
        return (ii0) Enum.valueOf(ii0.class, str);
    }

    public static ii0[] values() {
        return (ii0[]) L.clone();
    }
}
