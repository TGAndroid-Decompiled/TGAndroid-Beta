package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ch0 {
    public static final ch0 E;
    public static final ch0 F;
    public static final ch0 G;
    public static final ch0 H;
    public static final ch0 I;
    public static final ch0 J;
    public static final ch0 K;
    public static final ch0[] L;
    public static final ch0 d;
    public static final ch0 e;
    public static final ch0 f23037f;
    public static final ch0 h;
    public static final ch0 f23038n;
    public static final ch0 f23039r;
    public static final ch0 f23040s;
    public static final ch0 v;
    public static final ch0 f23041w;
    public static final ch0 f23042x;
    public static final ch0 f23043y;
    public final int f23044a;
    public final int f23045b;
    public final int f23046c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ch0 ch0Var = new ch0("MESSAGE", 0, i10, i11, i12);
        d = ch0Var;
        ch0 ch0Var2 = new ch0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = ch0Var2;
        ch0 ch0Var3 = new ch0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f23037f = ch0Var3;
        ch0 ch0Var4 = new ch0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ch0Var4;
        ch0 ch0Var5 = new ch0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f23038n = ch0Var5;
        ch0 ch0Var6 = new ch0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f23039r = ch0Var6;
        ch0 ch0Var7 = new ch0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f23040s = ch0Var7;
        ch0 ch0Var8 = new ch0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ch0Var8;
        ch0 ch0Var9 = new ch0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f23041w = ch0Var9;
        ch0 ch0Var10 = new ch0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f23042x = ch0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ch0 ch0Var11 = new ch0("LEAVE", 10, i13, i14, i14);
        f23043y = ch0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ch0 ch0Var12 = new ch0("VOICE_CHAT", 11, i15, i16, i16);
        E = ch0Var12;
        ch0 ch0Var13 = new ch0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ch0Var13;
        ch0 ch0Var14 = new ch0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ch0Var14;
        ch0 ch0Var15 = new ch0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ch0Var15;
        ch0 ch0Var16 = new ch0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ch0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ch0 ch0Var17 = new ch0("EDIT_USERNAME", 16, i17, i18, i19);
        ch0 ch0Var18 = new ch0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ch0Var18;
        ch0 ch0Var19 = new ch0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ch0Var19;
        L = new ch0[]{ch0Var, ch0Var2, ch0Var3, ch0Var4, ch0Var5, ch0Var6, ch0Var7, ch0Var8, ch0Var9, ch0Var10, ch0Var11, ch0Var12, ch0Var13, ch0Var14, ch0Var15, ch0Var16, ch0Var17, ch0Var18, ch0Var19};
    }

    public ch0(String str, int i10, int i11, int i12, int i13) {
        this.f23044a = i11;
        this.f23045b = i12;
        this.f23046c = i13;
    }

    public static ch0 valueOf(String str) {
        return (ch0) Enum.valueOf(ch0.class, str);
    }

    public static ch0[] values() {
        return (ch0[]) L.clone();
    }
}
