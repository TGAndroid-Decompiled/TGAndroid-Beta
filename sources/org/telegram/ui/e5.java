package org.telegram.ui;

import org.telegram.messenger.R;
public final class e5 {
    public static final e5 d;
    public static final e5 f35903e;
    public static final e5 f35904f;
    public static final e5 h;
    public static final e5 f35905n;
    public static final e5 f35906r;
    public static final e5[] f35907s;
    public final String f35908a;
    public final int f35909b;
    public final int f35910c;

    static {
        e5 e5Var = new e5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = e5Var;
        e5 e5Var2 = new e5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        f35903e = e5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        e5 e5Var3 = new e5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f35904f = e5Var3;
        e5 e5Var4 = new e5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = e5Var4;
        e5 e5Var5 = new e5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f35905n = e5Var5;
        e5 e5Var6 = new e5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f35906r = e5Var6;
        f35907s = new e5[]{e5Var, e5Var2, e5Var3, e5Var4, e5Var5, e5Var6};
    }

    public e5(int i10, int i11, int i12, String str, String str2) {
        this.f35908a = str2;
        this.f35909b = i11;
        this.f35910c = i12;
    }

    public static e5 valueOf(String str) {
        return (e5) Enum.valueOf(e5.class, str);
    }

    public static e5[] values() {
        return (e5[]) f35907s.clone();
    }
}
