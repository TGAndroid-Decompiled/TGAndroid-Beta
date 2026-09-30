package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ph0 {
    public static final ph0 E;
    public static final ph0 F;
    public static final ph0 G;
    public static final ph0 H;
    public static final ph0 I;
    public static final ph0 J;
    public static final ph0 K;
    public static final ph0[] L;
    public static final ph0 d;
    public static final ph0 e;
    public static final ph0 f27351f;
    public static final ph0 h;
    public static final ph0 f27352n;
    public static final ph0 f27353r;
    public static final ph0 f27354s;
    public static final ph0 v;
    public static final ph0 f27355w;
    public static final ph0 f27356x;
    public static final ph0 f27357y;
    public final int f27358a;
    public final int f27359b;
    public final int f27360c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ph0 ph0Var = new ph0("MESSAGE", 0, i10, i11, i12);
        d = ph0Var;
        ph0 ph0Var2 = new ph0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = ph0Var2;
        ph0 ph0Var3 = new ph0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f27351f = ph0Var3;
        ph0 ph0Var4 = new ph0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ph0Var4;
        ph0 ph0Var5 = new ph0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f27352n = ph0Var5;
        ph0 ph0Var6 = new ph0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f27353r = ph0Var6;
        ph0 ph0Var7 = new ph0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f27354s = ph0Var7;
        ph0 ph0Var8 = new ph0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ph0Var8;
        ph0 ph0Var9 = new ph0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f27355w = ph0Var9;
        ph0 ph0Var10 = new ph0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f27356x = ph0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ph0 ph0Var11 = new ph0("LEAVE", 10, i13, i14, i14);
        f27357y = ph0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ph0 ph0Var12 = new ph0("VOICE_CHAT", 11, i15, i16, i16);
        E = ph0Var12;
        ph0 ph0Var13 = new ph0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ph0Var13;
        ph0 ph0Var14 = new ph0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ph0Var14;
        ph0 ph0Var15 = new ph0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ph0Var15;
        ph0 ph0Var16 = new ph0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ph0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ph0 ph0Var17 = new ph0("EDIT_USERNAME", 16, i17, i18, i19);
        ph0 ph0Var18 = new ph0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ph0Var18;
        ph0 ph0Var19 = new ph0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ph0Var19;
        L = new ph0[]{ph0Var, ph0Var2, ph0Var3, ph0Var4, ph0Var5, ph0Var6, ph0Var7, ph0Var8, ph0Var9, ph0Var10, ph0Var11, ph0Var12, ph0Var13, ph0Var14, ph0Var15, ph0Var16, ph0Var17, ph0Var18, ph0Var19};
    }

    public ph0(String str, int i10, int i11, int i12, int i13) {
        this.f27358a = i11;
        this.f27359b = i12;
        this.f27360c = i13;
    }

    public static ph0 valueOf(String str) {
        return (ph0) Enum.valueOf(ph0.class, str);
    }

    public static ph0[] values() {
        return (ph0[]) L.clone();
    }
}
