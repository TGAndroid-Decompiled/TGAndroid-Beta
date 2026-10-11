package org.telegram.ui;

import org.telegram.messenger.R;
public final class c5 {
    public static final c5 d;
    public static final c5 f36549e;
    public static final c5 f36550f;
    public static final c5 h;
    public static final c5 f36551n;
    public static final c5 f36552r;
    public static final c5[] f36553s;
    public final String f36554a;
    public final int f36555b;
    public final int f36556c;

    static {
        c5 c5Var = new c5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = c5Var;
        c5 c5Var2 = new c5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        f36549e = c5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        c5 c5Var3 = new c5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f36550f = c5Var3;
        c5 c5Var4 = new c5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = c5Var4;
        c5 c5Var5 = new c5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f36551n = c5Var5;
        c5 c5Var6 = new c5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f36552r = c5Var6;
        f36553s = new c5[]{c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6};
    }

    public c5(int i10, int i11, int i12, String str, String str2) {
        this.f36554a = str2;
        this.f36555b = i11;
        this.f36556c = i12;
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) f36553s.clone();
    }
}
