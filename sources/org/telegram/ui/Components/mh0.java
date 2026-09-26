package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class mh0 {
    public static final mh0 E;
    public static final mh0 F;
    public static final mh0 G;
    public static final mh0 H;
    public static final mh0 I;
    public static final mh0 J;
    public static final mh0 K;
    public static final mh0[] L;
    public static final mh0 d;
    public static final mh0 e;
    public static final mh0 f26492f;
    public static final mh0 h;
    public static final mh0 f26493n;
    public static final mh0 f26494r;
    public static final mh0 f26495s;
    public static final mh0 v;
    public static final mh0 f26496w;
    public static final mh0 f26497x;
    public static final mh0 f26498y;
    public final int f26499a;
    public final int f26500b;
    public final int f26501c;

    static {
        int i10 = R.string.ProfileActionsMessage;
        int i11 = R.drawable.filled_profile_message_24;
        int i12 = R.drawable.outline_profile_message_24;
        mh0 mh0Var = new mh0("MESSAGE", 0, i10, i11, i12);
        d = mh0Var;
        mh0 mh0Var2 = new mh0("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
        e = mh0Var2;
        mh0 mh0Var3 = new mh0("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
        f26492f = mh0Var3;
        mh0 mh0Var4 = new mh0("DISCUSS", 3, R.string.ProfileActionsDiscuss, i11, i12);
        h = mh0Var4;
        mh0 mh0Var5 = new mh0("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
        f26493n = mh0Var5;
        mh0 mh0Var6 = new mh0("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
        f26494r = mh0Var6;
        mh0 mh0Var7 = new mh0("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
        f26495s = mh0Var7;
        mh0 mh0Var8 = new mh0("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
        v = mh0Var8;
        mh0 mh0Var9 = new mh0("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
        f26496w = mh0Var9;
        mh0 mh0Var10 = new mh0("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
        f26497x = mh0Var10;
        int i13 = R.string.ProfileActionsLeave;
        int i14 = R.drawable.leave;
        mh0 mh0Var11 = new mh0("LEAVE", 10, i13, i14, i14);
        f26498y = mh0Var11;
        int i15 = R.string.ProfileActionsVoiceChat;
        int i16 = R.drawable.live_stream;
        mh0 mh0Var12 = new mh0("VOICE_CHAT", 11, i15, i16, i16);
        E = mh0Var12;
        mh0 mh0Var13 = new mh0("STREAM", 12, R.string.ProfileActionsLiveStream, i16, i16);
        F = mh0Var13;
        mh0 mh0Var14 = new mh0("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
        G = mh0Var14;
        mh0 mh0Var15 = new mh0("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
        H = mh0Var15;
        mh0 mh0Var16 = new mh0("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
        I = mh0Var16;
        int i17 = R.string.ProfileActionsEditUsername;
        int i18 = R.drawable.filled_profile_edit_24;
        int i19 = R.drawable.outline_profile_edit_24;
        mh0 mh0Var17 = new mh0("EDIT_USERNAME", 16, i17, i18, i19);
        mh0 mh0Var18 = new mh0("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i18, i19);
        J = mh0Var18;
        mh0 mh0Var19 = new mh0("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
        K = mh0Var19;
        L = new mh0[]{mh0Var, mh0Var2, mh0Var3, mh0Var4, mh0Var5, mh0Var6, mh0Var7, mh0Var8, mh0Var9, mh0Var10, mh0Var11, mh0Var12, mh0Var13, mh0Var14, mh0Var15, mh0Var16, mh0Var17, mh0Var18, mh0Var19};
    }

    public mh0(String str, int i10, int i11, int i12, int i13) {
        this.f26499a = i11;
        this.f26500b = i12;
        this.f26501c = i13;
    }

    public static mh0 valueOf(String str) {
        return (mh0) Enum.valueOf(mh0.class, str);
    }

    public static mh0[] values() {
        return (mh0[]) L.clone();
    }
}
