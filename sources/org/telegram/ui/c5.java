package org.telegram.ui;

import org.telegram.messenger.R;
public final class c5 {
    public static final c5 d;
    public static final c5 f37062e;
    public static final c5 f37063f;
    public static final c5 h;
    public static final c5 f37064n;
    public static final c5 f37065r;
    public static final c5[] f37066s;
    public final String f37067a;
    public final int f37068b;
    public final int f37069c;

    static {
        c5 c5Var = new c5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = c5Var;
        c5 c5Var2 = new c5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        f37062e = c5Var2;
        int i9 = R.string.OpenGroup2;
        int i10 = R.drawable.msg_discussion;
        c5 c5Var3 = new c5(2, i9, i10, "OPEN_GROUP", "OpenGroup2");
        f37063f = c5Var3;
        c5 c5Var4 = new c5(3, R.string.SendMessage, i10, "SEND_MESSAGE", "SendMessage");
        h = c5Var4;
        c5 c5Var5 = new c5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f37064n = c5Var5;
        c5 c5Var6 = new c5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f37065r = c5Var6;
        f37066s = new c5[]{c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6};
    }

    public c5(int i9, int i10, int i11, String str, String str2) {
        this.f37067a = str2;
        this.f37068b = i10;
        this.f37069c = i11;
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) f37066s.clone();
    }
}
