package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class lh0 {
    public static final lh0 E;
    public static final lh0 F;
    public static final lh0 G;
    public static final lh0 H;
    public static final lh0 I;
    public static final lh0 J;
    public static final lh0 K;
    public static final lh0[] L;
    public static final lh0 d;
    public static final lh0 e;
    public static final lh0 f26131f;
    public static final lh0 h;
    public static final lh0 f26132n;
    public static final lh0 f26133r;
    public static final lh0 f26134s;
    public static final lh0 v;
    public static final lh0 f26135w;
    public static final lh0 f26136x;
    public static final lh0 f26137y;
    public final int f26138a;
    public final int f26139b;
    public final int f26140c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        lh0 lh0Var = new lh0("MESSAGE", 0, i10, i11, i12);
        d = lh0Var;
        lh0 lh0Var2 = new lh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = lh0Var2;
        lh0 lh0Var3 = new lh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f26131f = lh0Var3;
        lh0 lh0Var4 = new lh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = lh0Var4;
        lh0 lh0Var5 = new lh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f26132n = lh0Var5;
        lh0 lh0Var6 = new lh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f26133r = lh0Var6;
        lh0 lh0Var7 = new lh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f26134s = lh0Var7;
        lh0 lh0Var8 = new lh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = lh0Var8;
        lh0 lh0Var9 = new lh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f26135w = lh0Var9;
        lh0 lh0Var10 = new lh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f26136x = lh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        lh0 lh0Var11 = new lh0("LEAVE", 10, i13, i14, i14);
        f26137y = lh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        lh0 lh0Var12 = new lh0("VOICE_CHAT", 11, i15, i16, i16);
        E = lh0Var12;
        lh0 lh0Var13 = new lh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = lh0Var13;
        lh0 lh0Var14 = new lh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = lh0Var14;
        lh0 lh0Var15 = new lh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = lh0Var15;
        lh0 lh0Var16 = new lh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = lh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        lh0 lh0Var17 = new lh0("EDIT_USERNAME", 16, i17, i18, i19);
        lh0 lh0Var18 = new lh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = lh0Var18;
        lh0 lh0Var19 = new lh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = lh0Var19;
        L = new lh0[]{lh0Var, lh0Var2, lh0Var3, lh0Var4, lh0Var5, lh0Var6, lh0Var7, lh0Var8, lh0Var9, lh0Var10, lh0Var11, lh0Var12, lh0Var13, lh0Var14, lh0Var15, lh0Var16, lh0Var17, lh0Var18, lh0Var19};
    }

    public lh0(String str, int i10, int i11, int i12, int i13) {
        this.f26138a = i11;
        this.f26139b = i12;
        this.f26140c = i13;
    }

    public static lh0 valueOf(String str) {
        return (lh0) Enum.valueOf(lh0.class, str);
    }

    public static lh0[] values() {
        return (lh0[]) L.clone();
    }
}
