package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xd implements a5, org.telegram.messenger.oc {
    public final String f42045a;
    public final boolean f42046b;
    public final org.telegram.messenger.gs f42047c;
    public final Object d;
    public final Object f42048e;
    public final Object f42049f;

    public xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10) {
        this.f42047c = chatActivityEnterView;
        this.d = document;
        this.f42045a = str;
        this.f42048e = obj;
        this.f42049f = cjVar;
        this.f42046b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f42047c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) this.f42049f;
        int i11 = ChatActivityEnterView.f32569s7;
        chatActivityEnterView.d(document, this.f42045a, this.f42048e, cjVar, this.f42046b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f42047c;
        boolean[] zArr = (boolean[]) this.f42048e;
        bi.f5 f5Var = (bi.f5) this.f42049f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f42045a) || str.equals("und")) && ((this.f42046b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        f5Var.run();
    }

    public xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.f5 f5Var) {
        this.f42047c = profileActivity;
        this.d = strArr;
        this.f42048e = zArr;
        this.f42045a = str;
        this.f42046b = z10;
        this.f42049f = f5Var;
    }
}
