package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class xg0 {
    public static final xg0 A;
    public static final xg0 B;
    public static final xg0 C;
    public static final xg0 D;
    public static final xg0 E;
    public static final xg0 F;
    public static final xg0 G;
    public static final xg0[] H;
    public static final xg0 d;
    public static final xg0 f34711e;
    public static final xg0 f34712f;
    public static final xg0 h;
    public static final xg0 f34713n;
    public static final xg0 f34714r;
    public static final xg0 f34715s;
    public static final xg0 v;
    public static final xg0 f34716w;
    public static final xg0 f34717x;
    public static final xg0 f34718y;
    public final int f34719a;
    public final int f34720b;
    public final int f34721c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        xg0 xg0Var = new xg0("MESSAGE", 0, i10, i11, i12);
        d = xg0Var;
        xg0 xg0Var2 = new xg0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f34711e = xg0Var2;
        xg0 xg0Var3 = new xg0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f34712f = xg0Var3;
        xg0 xg0Var4 = new xg0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = xg0Var4;
        xg0 xg0Var5 = new xg0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f34713n = xg0Var5;
        xg0 xg0Var6 = new xg0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f34714r = xg0Var6;
        xg0 xg0Var7 = new xg0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f34715s = xg0Var7;
        xg0 xg0Var8 = new xg0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = xg0Var8;
        xg0 xg0Var9 = new xg0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f34716w = xg0Var9;
        xg0 xg0Var10 = new xg0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f34717x = xg0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        xg0 xg0Var11 = new xg0("LEAVE", 10, i13, i14, i14);
        f34718y = xg0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        xg0 xg0Var12 = new xg0("VOICE_CHAT", 11, i15, i16, i16);
        A = xg0Var12;
        xg0 xg0Var13 = new xg0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        B = xg0Var13;
        xg0 xg0Var14 = new xg0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        C = xg0Var14;
        xg0 xg0Var15 = new xg0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        D = xg0Var15;
        xg0 xg0Var16 = new xg0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        E = xg0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        xg0 xg0Var17 = new xg0("EDIT_USERNAME", 16, i17, i18, i19);
        xg0 xg0Var18 = new xg0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        F = xg0Var18;
        xg0 xg0Var19 = new xg0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        G = xg0Var19;
        H = new xg0[]{xg0Var, xg0Var2, xg0Var3, xg0Var4, xg0Var5, xg0Var6, xg0Var7, xg0Var8, xg0Var9, xg0Var10, xg0Var11, xg0Var12, xg0Var13, xg0Var14, xg0Var15, xg0Var16, xg0Var17, xg0Var18, xg0Var19};
    }

    public xg0(String str, int i10, int i11, int i12, int i13) {
        this.f34719a = i11;
        this.f34720b = i12;
        this.f34721c = i13;
    }

    public static xg0 valueOf(String str) {
        return (xg0) Enum.valueOf(xg0.class, str);
    }

    public static xg0[] values() {
        return (xg0[]) H.clone();
    }
}
