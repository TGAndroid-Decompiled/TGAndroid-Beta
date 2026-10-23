package org.telegram.ui;

import org.telegram.messenger.R;
public final class h5 {
    public static final h5 d;
    public static final h5 e;
    public static final h5 f37737f;
    public static final h5 h;
    public static final h5 f37738n;
    public static final h5 f37739r;
    public static final h5[] f37740s;
    public final String f37741a;
    public final int f37742b;
    public final int f37743c;

    static {
        h5 h5Var = new h5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = h5Var;
        h5 h5Var2 = new h5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = h5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        h5 h5Var3 = new h5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f37737f = h5Var3;
        h5 h5Var4 = new h5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = h5Var4;
        h5 h5Var5 = new h5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f37738n = h5Var5;
        h5 h5Var6 = new h5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f37739r = h5Var6;
        f37740s = new h5[]{h5Var, h5Var2, h5Var3, h5Var4, h5Var5, h5Var6};
    }

    public h5(int i10, int i11, int i12, String str, String str2) {
        this.f37741a = str2;
        this.f37742b = i11;
        this.f37743c = i12;
    }

    public static h5 valueOf(String str) {
        return (h5) Enum.valueOf(h5.class, str);
    }

    public static h5[] values() {
        return (h5[]) f37740s.clone();
    }
}
