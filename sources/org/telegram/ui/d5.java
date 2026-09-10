package org.telegram.ui;

import org.telegram.messenger.R;
public final class d5 {
    public static final d5 d;
    public static final d5 e;
    public static final d5 f31825f;
    public static final d5 h;
    public static final d5 f31826n;
    public static final d5 f31827r;
    public static final d5[] f31828s;
    public final String f31829a;
    public final int f31830b;
    public final int f31831c;

    static {
        d5 d5Var = new d5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = d5Var;
        d5 d5Var2 = new d5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = d5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        d5 d5Var3 = new d5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f31825f = d5Var3;
        d5 d5Var4 = new d5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = d5Var4;
        d5 d5Var5 = new d5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f31826n = d5Var5;
        d5 d5Var6 = new d5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f31827r = d5Var6;
        f31828s = new d5[]{d5Var, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6};
    }

    public d5(int i10, int i11, int i12, String str, String str2) {
        this.f31829a = str2;
        this.f31830b = i11;
        this.f31831c = i12;
    }

    public static d5 valueOf(String str) {
        return (d5) Enum.valueOf(d5.class, str);
    }

    public static d5[] values() {
        return (d5[]) f31828s.clone();
    }
}
