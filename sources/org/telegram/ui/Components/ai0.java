package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ai0 {
    public static final ai0 E;
    public static final ai0 F;
    public static final ai0 G;
    public static final ai0 H;
    public static final ai0 I;
    public static final ai0 J;
    public static final ai0 K;
    public static final ai0[] L;
    public static final ai0 d;
    public static final ai0 e;
    public static final ai0 f24724f;
    public static final ai0 h;
    public static final ai0 f24725n;
    public static final ai0 f24726r;
    public static final ai0 f24727s;
    public static final ai0 v;
    public static final ai0 f24728w;
    public static final ai0 f24729x;
    public static final ai0 f24730y;
    public final int f24731a;
    public final int f24732b;
    public final int f24733c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ai0 ai0Var = new ai0("MESSAGE", 0, i10, i11, i12);
        d = ai0Var;
        ai0 ai0Var2 = new ai0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = ai0Var2;
        ai0 ai0Var3 = new ai0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f24724f = ai0Var3;
        ai0 ai0Var4 = new ai0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ai0Var4;
        ai0 ai0Var5 = new ai0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f24725n = ai0Var5;
        ai0 ai0Var6 = new ai0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f24726r = ai0Var6;
        ai0 ai0Var7 = new ai0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f24727s = ai0Var7;
        ai0 ai0Var8 = new ai0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ai0Var8;
        ai0 ai0Var9 = new ai0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f24728w = ai0Var9;
        ai0 ai0Var10 = new ai0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f24729x = ai0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ai0 ai0Var11 = new ai0("LEAVE", 10, i13, i14, i14);
        f24730y = ai0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ai0 ai0Var12 = new ai0("VOICE_CHAT", 11, i15, i16, i16);
        E = ai0Var12;
        ai0 ai0Var13 = new ai0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ai0Var13;
        ai0 ai0Var14 = new ai0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ai0Var14;
        ai0 ai0Var15 = new ai0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ai0Var15;
        ai0 ai0Var16 = new ai0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ai0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ai0 ai0Var17 = new ai0("EDIT_USERNAME", 16, i17, i18, i19);
        ai0 ai0Var18 = new ai0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ai0Var18;
        ai0 ai0Var19 = new ai0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ai0Var19;
        L = new ai0[]{ai0Var, ai0Var2, ai0Var3, ai0Var4, ai0Var5, ai0Var6, ai0Var7, ai0Var8, ai0Var9, ai0Var10, ai0Var11, ai0Var12, ai0Var13, ai0Var14, ai0Var15, ai0Var16, ai0Var17, ai0Var18, ai0Var19};
    }

    public ai0(String str, int i10, int i11, int i12, int i13) {
        this.f24731a = i11;
        this.f24732b = i12;
        this.f24733c = i13;
    }

    public static ai0 valueOf(String str) {
        return (ai0) Enum.valueOf(ai0.class, str);
    }

    public static ai0[] values() {
        return (ai0[]) L.clone();
    }
}
