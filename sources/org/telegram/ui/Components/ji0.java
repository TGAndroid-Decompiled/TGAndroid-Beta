package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ji0 {
    public static final ji0 E;
    public static final ji0 F;
    public static final ji0 G;
    public static final ji0 H;
    public static final ji0 I;
    public static final ji0 J;
    public static final ji0 K;
    public static final ji0[] L;
    public static final ji0 d;
    public static final ji0 f27524e;
    public static final ji0 f27525f;
    public static final ji0 h;
    public static final ji0 f27526n;
    public static final ji0 f27527r;
    public static final ji0 f27528s;
    public static final ji0 v;
    public static final ji0 f27529w;
    public static final ji0 f27530x;
    public static final ji0 f27531y;
    public final int f27532a;
    public final int f27533b;
    public final int f27534c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        ji0 ji0Var = new ji0("MESSAGE", 0, i10, i11, i12);
        d = ji0Var;
        ji0 ji0Var2 = new ji0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        f27524e = ji0Var2;
        ji0 ji0Var3 = new ji0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f27525f = ji0Var3;
        ji0 ji0Var4 = new ji0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = ji0Var4;
        ji0 ji0Var5 = new ji0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f27526n = ji0Var5;
        ji0 ji0Var6 = new ji0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f27527r = ji0Var6;
        ji0 ji0Var7 = new ji0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f27528s = ji0Var7;
        ji0 ji0Var8 = new ji0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = ji0Var8;
        ji0 ji0Var9 = new ji0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f27529w = ji0Var9;
        ji0 ji0Var10 = new ji0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f27530x = ji0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        ji0 ji0Var11 = new ji0("LEAVE", 10, i13, i14, i14);
        f27531y = ji0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        ji0 ji0Var12 = new ji0("VOICE_CHAT", 11, i15, i16, i16);
        E = ji0Var12;
        ji0 ji0Var13 = new ji0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = ji0Var13;
        ji0 ji0Var14 = new ji0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = ji0Var14;
        ji0 ji0Var15 = new ji0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = ji0Var15;
        ji0 ji0Var16 = new ji0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = ji0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        ji0 ji0Var17 = new ji0("EDIT_USERNAME", 16, i17, i18, i19);
        ji0 ji0Var18 = new ji0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = ji0Var18;
        ji0 ji0Var19 = new ji0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = ji0Var19;
        L = new ji0[]{ji0Var, ji0Var2, ji0Var3, ji0Var4, ji0Var5, ji0Var6, ji0Var7, ji0Var8, ji0Var9, ji0Var10, ji0Var11, ji0Var12, ji0Var13, ji0Var14, ji0Var15, ji0Var16, ji0Var17, ji0Var18, ji0Var19};
    }

    public ji0(String str, int i10, int i11, int i12, int i13) {
        this.f27532a = i11;
        this.f27533b = i12;
        this.f27534c = i13;
    }

    public static ji0 valueOf(String str) {
        return (ji0) Enum.valueOf(ji0.class, str);
    }

    public static ji0[] values() {
        return (ji0[]) L.clone();
    }
}
