package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class oh0 {
    public static final oh0 E;
    public static final oh0 F;
    public static final oh0 G;
    public static final oh0 H;
    public static final oh0 I;
    public static final oh0 J;
    public static final oh0 K;
    public static final oh0[] L;
    public static final oh0 d;
    public static final oh0 e;
    public static final oh0 f27071f;
    public static final oh0 h;
    public static final oh0 f27072n;
    public static final oh0 f27073r;
    public static final oh0 f27074s;
    public static final oh0 v;
    public static final oh0 f27075w;
    public static final oh0 f27076x;
    public static final oh0 f27077y;
    public final int f27078a;
    public final int f27079b;
    public final int f27080c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        oh0 oh0Var = new oh0("MESSAGE", 0, i10, i11, i12);
        d = oh0Var;
        oh0 oh0Var2 = new oh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = oh0Var2;
        oh0 oh0Var3 = new oh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f27071f = oh0Var3;
        oh0 oh0Var4 = new oh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = oh0Var4;
        oh0 oh0Var5 = new oh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f27072n = oh0Var5;
        oh0 oh0Var6 = new oh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f27073r = oh0Var6;
        oh0 oh0Var7 = new oh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f27074s = oh0Var7;
        oh0 oh0Var8 = new oh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = oh0Var8;
        oh0 oh0Var9 = new oh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f27075w = oh0Var9;
        oh0 oh0Var10 = new oh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f27076x = oh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        oh0 oh0Var11 = new oh0("LEAVE", 10, i13, i14, i14);
        f27077y = oh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        oh0 oh0Var12 = new oh0("VOICE_CHAT", 11, i15, i16, i16);
        E = oh0Var12;
        oh0 oh0Var13 = new oh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = oh0Var13;
        oh0 oh0Var14 = new oh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = oh0Var14;
        oh0 oh0Var15 = new oh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = oh0Var15;
        oh0 oh0Var16 = new oh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = oh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        oh0 oh0Var17 = new oh0("EDIT_USERNAME", 16, i17, i18, i19);
        oh0 oh0Var18 = new oh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = oh0Var18;
        oh0 oh0Var19 = new oh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = oh0Var19;
        L = new oh0[]{oh0Var, oh0Var2, oh0Var3, oh0Var4, oh0Var5, oh0Var6, oh0Var7, oh0Var8, oh0Var9, oh0Var10, oh0Var11, oh0Var12, oh0Var13, oh0Var14, oh0Var15, oh0Var16, oh0Var17, oh0Var18, oh0Var19};
    }

    public oh0(String str, int i10, int i11, int i12, int i13) {
        this.f27078a = i11;
        this.f27079b = i12;
        this.f27080c = i13;
    }

    public static oh0 valueOf(String str) {
        return (oh0) Enum.valueOf(oh0.class, str);
    }

    public static oh0[] values() {
        return (oh0[]) L.clone();
    }
}
