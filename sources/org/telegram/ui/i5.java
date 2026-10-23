package org.telegram.ui;

import org.telegram.messenger.R;
public final class i5 {
    public static final i5 d;
    public static final i5 e;
    public static final i5 f37858f;
    public static final i5 h;
    public static final i5 f37859n;
    public static final i5 f37860r;
    public static final i5[] f37861s;
    public final String f37862a;
    public final int f37863b;
    public final int f37864c;

    static {
        i5 i5Var = new i5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = i5Var;
        i5 i5Var2 = new i5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        e = i5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        i5 i5Var3 = new i5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f37858f = i5Var3;
        i5 i5Var4 = new i5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = i5Var4;
        i5 i5Var5 = new i5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f37859n = i5Var5;
        i5 i5Var6 = new i5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f37860r = i5Var6;
        f37861s = new i5[]{i5Var, i5Var2, i5Var3, i5Var4, i5Var5, i5Var6};
    }

    public i5(int i10, int i11, int i12, String str, String str2) {
        this.f37862a = str2;
        this.f37863b = i11;
        this.f37864c = i12;
    }

    public static i5 valueOf(String str) {
        return (i5) Enum.valueOf(i5.class, str);
    }

    public static i5[] values() {
        return (i5[]) f37861s.clone();
    }
}
