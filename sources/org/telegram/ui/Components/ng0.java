package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ng0 {
    public static final ng0 A;
    public static final ng0 B;
    public static final ng0 C;
    public static final ng0 D;
    public static final ng0 E;
    public static final ng0 F;
    public static final ng0 G;
    public static final ng0[] H;
    public static final ng0 d;
    public static final ng0 f31102e;
    public static final ng0 f31103f;
    public static final ng0 h;
    public static final ng0 f31104n;
    public static final ng0 f31105r;
    public static final ng0 f31106s;
    public static final ng0 v;
    public static final ng0 f31107w;
    public static final ng0 f31108x;
    public static final ng0 f31109y;
    public final int f31110a;
    public final int f31111b;
    public final int f31112c;

    static {
        int i9 = R.string.ProfileActionsMessage;
        int i10 = R.drawable.filled_profile_message_24;
        int i11 = R.drawable.outline_profile_message_24;
        ng0 ng0Var = new ng0("MESSAGE", 0, i9, i10, i11);
        d = ng0Var;
        ng0 ng0Var2 = new ng0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f31102e = ng0Var2;
        ng0 ng0Var3 = new ng0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f31103f = ng0Var3;
        ng0 ng0Var4 = new ng0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i10, i11);
        h = ng0Var4;
        ng0 ng0Var5 = new ng0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f31104n = ng0Var5;
        ng0 ng0Var6 = new ng0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f31105r = ng0Var6;
        ng0 ng0Var7 = new ng0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f31106s = ng0Var7;
        ng0 ng0Var8 = new ng0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ng0Var8;
        ng0 ng0Var9 = new ng0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f31107w = ng0Var9;
        ng0 ng0Var10 = new ng0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f31108x = ng0Var10;
        int i12 = R.string.ProfileActionsLeave;
        int i13 = R.drawable.leave;
        ng0 ng0Var11 = new ng0("LEAVE", 10, i12, i13, i13);
        f31109y = ng0Var11;
        int i14 = R.string.ProfileActionsVoiceChat;
        int i15 = R.drawable.live_stream;
        ng0 ng0Var12 = new ng0("VOICE_CHAT", 11, i14, i15, i15);
        A = ng0Var12;
        ng0 ng0Var13 = new ng0("STREAM", 12, R.string.ProfileActionsLiveStream, i15, i15);
        B = ng0Var13;
        ng0 ng0Var14 = new ng0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        C = ng0Var14;
        ng0 ng0Var15 = new ng0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        D = ng0Var15;
        ng0 ng0Var16 = new ng0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        E = ng0Var16;
        int i16 = R.string.ProfileActionsEditUsername;
        int i17 = R.drawable.filled_profile_edit_24;
        int i18 = R.drawable.outline_profile_edit_24;
        ng0 ng0Var17 = new ng0("EDIT_USERNAME", 16, i16, i17, i18);
        ng0 ng0Var18 = new ng0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i17, i18);
        F = ng0Var18;
        ng0 ng0Var19 = new ng0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        G = ng0Var19;
        H = new ng0[]{ng0Var, ng0Var2, ng0Var3, ng0Var4, ng0Var5, ng0Var6, ng0Var7, ng0Var8, ng0Var9, ng0Var10, ng0Var11, ng0Var12, ng0Var13, ng0Var14, ng0Var15, ng0Var16, ng0Var17, ng0Var18, ng0Var19};
    }

    public ng0(String str, int i9, int i10, int i11, int i12) {
        this.f31110a = i10;
        this.f31111b = i11;
        this.f31112c = i12;
    }

    public static ng0 valueOf(String str) {
        return (ng0) Enum.valueOf(ng0.class, str);
    }

    public static ng0[] values() {
        return (ng0[]) H.clone();
    }
}
