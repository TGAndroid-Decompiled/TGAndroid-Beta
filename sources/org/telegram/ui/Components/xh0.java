package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class xh0 {
    public static final xh0 E;
    public static final xh0 F;
    public static final xh0 G;
    public static final xh0 H;
    public static final xh0 I;
    public static final xh0 J;
    public static final xh0 K;
    public static final xh0[] L;
    public static final xh0 d;
    public static final xh0 e;
    public static final xh0 f32423f;
    public static final xh0 h;
    public static final xh0 f32424n;
    public static final xh0 f32425r;
    public static final xh0 f32426s;
    public static final xh0 v;
    public static final xh0 f32427w;
    public static final xh0 f32428x;
    public static final xh0 f32429y;
    public final int f32430a;
    public final int f32431b;
    public final int f32432c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        xh0 xh0Var = new xh0("MESSAGE", 0, i10, i11, i12);
        d = xh0Var;
        xh0 xh0Var2 = new xh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = xh0Var2;
        xh0 xh0Var3 = new xh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f32423f = xh0Var3;
        xh0 xh0Var4 = new xh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = xh0Var4;
        xh0 xh0Var5 = new xh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f32424n = xh0Var5;
        xh0 xh0Var6 = new xh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f32425r = xh0Var6;
        xh0 xh0Var7 = new xh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f32426s = xh0Var7;
        xh0 xh0Var8 = new xh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = xh0Var8;
        xh0 xh0Var9 = new xh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f32427w = xh0Var9;
        xh0 xh0Var10 = new xh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f32428x = xh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        xh0 xh0Var11 = new xh0("LEAVE", 10, i13, i14, i14);
        f32429y = xh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        xh0 xh0Var12 = new xh0("VOICE_CHAT", 11, i15, i16, i16);
        E = xh0Var12;
        xh0 xh0Var13 = new xh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = xh0Var13;
        xh0 xh0Var14 = new xh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = xh0Var14;
        xh0 xh0Var15 = new xh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = xh0Var15;
        xh0 xh0Var16 = new xh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = xh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        xh0 xh0Var17 = new xh0("EDIT_USERNAME", 16, i17, i18, i19);
        xh0 xh0Var18 = new xh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = xh0Var18;
        xh0 xh0Var19 = new xh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = xh0Var19;
        L = new xh0[]{xh0Var, xh0Var2, xh0Var3, xh0Var4, xh0Var5, xh0Var6, xh0Var7, xh0Var8, xh0Var9, xh0Var10, xh0Var11, xh0Var12, xh0Var13, xh0Var14, xh0Var15, xh0Var16, xh0Var17, xh0Var18, xh0Var19};
    }

    public xh0(String str, int i10, int i11, int i12, int i13) {
        this.f32430a = i11;
        this.f32431b = i12;
        this.f32432c = i13;
    }

    public static xh0 valueOf(String str) {
        return (xh0) Enum.valueOf(xh0.class, str);
    }

    public static xh0[] values() {
        return (xh0[]) L.clone();
    }
}
