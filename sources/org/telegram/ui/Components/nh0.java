package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class nh0 {
    public static final nh0 E;
    public static final nh0 F;
    public static final nh0 G;
    public static final nh0 H;
    public static final nh0 I;
    public static final nh0 J;
    public static final nh0 K;
    public static final nh0[] L;
    public static final nh0 d;
    public static final nh0 e;
    public static final nh0 f26791f;
    public static final nh0 h;
    public static final nh0 f26792n;
    public static final nh0 f26793r;
    public static final nh0 f26794s;
    public static final nh0 v;
    public static final nh0 f26795w;
    public static final nh0 f26796x;
    public static final nh0 f26797y;
    public final int f26798a;
    public final int f26799b;
    public final int f26800c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        nh0 nh0Var = new nh0("MESSAGE", 0, i10, i11, i12);
        d = nh0Var;
        nh0 nh0Var2 = new nh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = nh0Var2;
        nh0 nh0Var3 = new nh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f26791f = nh0Var3;
        nh0 nh0Var4 = new nh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = nh0Var4;
        nh0 nh0Var5 = new nh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f26792n = nh0Var5;
        nh0 nh0Var6 = new nh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f26793r = nh0Var6;
        nh0 nh0Var7 = new nh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f26794s = nh0Var7;
        nh0 nh0Var8 = new nh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = nh0Var8;
        nh0 nh0Var9 = new nh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f26795w = nh0Var9;
        nh0 nh0Var10 = new nh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f26796x = nh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        nh0 nh0Var11 = new nh0("LEAVE", 10, i13, i14, i14);
        f26797y = nh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        nh0 nh0Var12 = new nh0("VOICE_CHAT", 11, i15, i16, i16);
        E = nh0Var12;
        nh0 nh0Var13 = new nh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = nh0Var13;
        nh0 nh0Var14 = new nh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = nh0Var14;
        nh0 nh0Var15 = new nh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = nh0Var15;
        nh0 nh0Var16 = new nh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = nh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        nh0 nh0Var17 = new nh0("EDIT_USERNAME", 16, i17, i18, i19);
        nh0 nh0Var18 = new nh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = nh0Var18;
        nh0 nh0Var19 = new nh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = nh0Var19;
        L = new nh0[]{nh0Var, nh0Var2, nh0Var3, nh0Var4, nh0Var5, nh0Var6, nh0Var7, nh0Var8, nh0Var9, nh0Var10, nh0Var11, nh0Var12, nh0Var13, nh0Var14, nh0Var15, nh0Var16, nh0Var17, nh0Var18, nh0Var19};
    }

    public nh0(String str, int i10, int i11, int i12, int i13) {
        this.f26798a = i11;
        this.f26799b = i12;
        this.f26800c = i13;
    }

    public static nh0 valueOf(String str) {
        return (nh0) Enum.valueOf(nh0.class, str);
    }

    public static nh0[] values() {
        return (nh0[]) L.clone();
    }
}
