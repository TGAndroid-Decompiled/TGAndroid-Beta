package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ih0 {
    public static final ih0 B;
    public static final ih0 C;
    public static final ih0 D;
    public static final ih0 E;
    public static final ih0 F;
    public static final ih0 G;
    public static final ih0 H;
    public static final ih0[] I;
    public static final ih0 d;
    public static final ih0 e;
    public static final ih0 f25709f;
    public static final ih0 h;
    public static final ih0 f25710n;
    public static final ih0 f25711r;
    public static final ih0 f25712s;
    public static final ih0 v;
    public static final ih0 f25713w;
    public static final ih0 f25714x;
    public static final ih0 f25715y;
    public final int f25716a;
    public final int f25717b;
    public final int f25718c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ih0 ih0Var = new ih0("MESSAGE", 0, i10, i11, i12);
        d = ih0Var;
        ih0 ih0Var2 = new ih0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = ih0Var2;
        ih0 ih0Var3 = new ih0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f25709f = ih0Var3;
        ih0 ih0Var4 = new ih0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ih0Var4;
        ih0 ih0Var5 = new ih0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f25710n = ih0Var5;
        ih0 ih0Var6 = new ih0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f25711r = ih0Var6;
        ih0 ih0Var7 = new ih0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f25712s = ih0Var7;
        ih0 ih0Var8 = new ih0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ih0Var8;
        ih0 ih0Var9 = new ih0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f25713w = ih0Var9;
        ih0 ih0Var10 = new ih0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f25714x = ih0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ih0 ih0Var11 = new ih0("LEAVE", 10, i13, i14, i14);
        f25715y = ih0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ih0 ih0Var12 = new ih0("VOICE_CHAT", 11, i15, i16, i16);
        B = ih0Var12;
        ih0 ih0Var13 = new ih0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        C = ih0Var13;
        ih0 ih0Var14 = new ih0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        D = ih0Var14;
        ih0 ih0Var15 = new ih0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        E = ih0Var15;
        ih0 ih0Var16 = new ih0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        F = ih0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ih0 ih0Var17 = new ih0("EDIT_USERNAME", 16, i17, i18, i19);
        ih0 ih0Var18 = new ih0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        G = ih0Var18;
        ih0 ih0Var19 = new ih0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        H = ih0Var19;
        I = new ih0[]{ih0Var, ih0Var2, ih0Var3, ih0Var4, ih0Var5, ih0Var6, ih0Var7, ih0Var8, ih0Var9, ih0Var10, ih0Var11, ih0Var12, ih0Var13, ih0Var14, ih0Var15, ih0Var16, ih0Var17, ih0Var18, ih0Var19};
    }

    public ih0(String str, int i10, int i11, int i12, int i13) {
        this.f25716a = i11;
        this.f25717b = i12;
        this.f25718c = i13;
    }

    public static ih0 valueOf(String str) {
        return (ih0) Enum.valueOf(ih0.class, str);
    }

    public static ih0[] values() {
        return (ih0[]) I.clone();
    }
}
