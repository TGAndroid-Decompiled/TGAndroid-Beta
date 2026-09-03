package org.telegram.ui;

import org.telegram.messenger.R;
public final class f5 {
    public static final f5 d;
    public static final f5 f36656e;
    public static final f5 f36657f;
    public static final f5 h;
    public static final f5 f36658n;
    public static final f5 f36659r;
    public static final f5[] f36660s;
    public final String f36661a;
    public final int f36662b;
    public final int f36663c;

    static {
        f5 f5Var = new f5(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
        d = f5Var;
        f5 f5Var2 = new f5(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
        f36656e = f5Var2;
        int i10 = R.string.OpenGroup2;
        int i11 = R.drawable.msg_discussion;
        f5 f5Var3 = new f5(2, i10, i11, "OPEN_GROUP", "OpenGroup2");
        f36657f = f5Var3;
        f5 f5Var4 = new f5(3, R.string.SendMessage, i11, "SEND_MESSAGE", "SendMessage");
        h = f5Var4;
        f5 f5Var5 = new f5(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
        f36658n = f5Var5;
        f5 f5Var6 = new f5(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
        f36659r = f5Var6;
        f36660s = new f5[]{f5Var, f5Var2, f5Var3, f5Var4, f5Var5, f5Var6};
    }

    public f5(int i10, int i11, int i12, String str, String str2) {
        this.f36661a = str2;
        this.f36662b = i11;
        this.f36663c = i12;
    }

    public static f5 valueOf(String str) {
        return (f5) Enum.valueOf(f5.class, str);
    }

    public static f5[] values() {
        return (f5[]) f36660s.clone();
    }
}
