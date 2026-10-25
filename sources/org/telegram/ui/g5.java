package org.telegram.ui;

import org.telegram.messenger.R;
public final class g5 {
    public static final g5 d;
    public static final g5 e;
    public static final g5 f39542f;
    public static final g5 h;
    public static final g5 f39543n;
    public static final g5 f39544r;
    public static final g5[] f39545s;
    public final String f39546a;
    public final int f39547b;
    public final int f39548c;

    static {
        g5 g5Var = new g5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = g5Var;
        g5 g5Var2 = new g5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = g5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        g5 g5Var3 = new g5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f39542f = g5Var3;
        g5 g5Var4 = new g5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = g5Var4;
        g5 g5Var5 = new g5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f39543n = g5Var5;
        g5 g5Var6 = new g5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f39544r = g5Var6;
        f39545s = new g5[]{g5Var, g5Var2, g5Var3, g5Var4, g5Var5, g5Var6};
    }

    public g5(int i10, int i11, int i12, String str, String str2) {
        this.f39546a = str2;
        this.f39547b = i11;
        this.f39548c = i12;
    }

    public static g5 valueOf(String str) {
        return (g5) Enum.valueOf(g5.class, str);
    }

    public static g5[] values() {
        return (g5[]) f39545s.clone();
    }
}
