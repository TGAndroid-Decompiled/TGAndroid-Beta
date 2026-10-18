package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wh0 {
    public static final wh0 E;
    public static final wh0 F;
    public static final wh0 G;
    public static final wh0 H;
    public static final wh0 I;
    public static final wh0 J;
    public static final wh0 K;
    public static final wh0[] L;
    public static final wh0 d;
    public static final wh0 e;
    public static final wh0 f32125f;
    public static final wh0 h;
    public static final wh0 f32126n;
    public static final wh0 f32127r;
    public static final wh0 f32128s;
    public static final wh0 v;
    public static final wh0 f32129w;
    public static final wh0 f32130x;
    public static final wh0 f32131y;
    public final int f32132a;
    public final int f32133b;
    public final int f32134c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        wh0 wh0Var = new wh0("MESSAGE", 0, i10, i11, i12);
        d = wh0Var;
        wh0 wh0Var2 = new wh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = wh0Var2;
        wh0 wh0Var3 = new wh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f32125f = wh0Var3;
        wh0 wh0Var4 = new wh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = wh0Var4;
        wh0 wh0Var5 = new wh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f32126n = wh0Var5;
        wh0 wh0Var6 = new wh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f32127r = wh0Var6;
        wh0 wh0Var7 = new wh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f32128s = wh0Var7;
        wh0 wh0Var8 = new wh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = wh0Var8;
        wh0 wh0Var9 = new wh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f32129w = wh0Var9;
        wh0 wh0Var10 = new wh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f32130x = wh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        wh0 wh0Var11 = new wh0("LEAVE", 10, i13, i14, i14);
        f32131y = wh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        wh0 wh0Var12 = new wh0("VOICE_CHAT", 11, i15, i16, i16);
        E = wh0Var12;
        wh0 wh0Var13 = new wh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = wh0Var13;
        wh0 wh0Var14 = new wh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = wh0Var14;
        wh0 wh0Var15 = new wh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = wh0Var15;
        wh0 wh0Var16 = new wh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = wh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        wh0 wh0Var17 = new wh0("EDIT_USERNAME", 16, i17, i18, i19);
        wh0 wh0Var18 = new wh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = wh0Var18;
        wh0 wh0Var19 = new wh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = wh0Var19;
        L = new wh0[]{wh0Var, wh0Var2, wh0Var3, wh0Var4, wh0Var5, wh0Var6, wh0Var7, wh0Var8, wh0Var9, wh0Var10, wh0Var11, wh0Var12, wh0Var13, wh0Var14, wh0Var15, wh0Var16, wh0Var17, wh0Var18, wh0Var19};
    }

    public wh0(String str, int i10, int i11, int i12, int i13) {
        this.f32132a = i11;
        this.f32133b = i12;
        this.f32134c = i13;
    }

    public static wh0 valueOf(String str) {
        return (wh0) Enum.valueOf(wh0.class, str);
    }

    public static wh0[] values() {
        return (wh0[]) L.clone();
    }
}
