package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xd implements a5, org.telegram.messenger.oc {
    public final String f42044a;
    public final boolean f42045b;
    public final org.telegram.messenger.gs f42046c;
    public final Object d;
    public final Object f42047e;
    public final Object f42048f;

    public xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10) {
        this.f42046c = chatActivityEnterView;
        this.d = document;
        this.f42044a = str;
        this.f42047e = obj;
        this.f42048f = cjVar;
        this.f42045b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f42046c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) this.f42048f;
        int i11 = ChatActivityEnterView.f32569s7;
        chatActivityEnterView.d(document, this.f42044a, this.f42047e, cjVar, this.f42045b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f42046c;
        boolean[] zArr = (boolean[]) this.f42047e;
        bi.f5 f5Var = (bi.f5) this.f42048f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f42044a) || str.equals("und")) && ((this.f42045b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        f5Var.run();
    }

    public xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.f5 f5Var) {
        this.f42046c = profileActivity;
        this.d = strArr;
        this.f42047e = zArr;
        this.f42044a = str;
        this.f42045b = z10;
        this.f42048f = f5Var;
    }
}
