package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xd implements a5, org.telegram.messenger.oc {
    public final String f42001a;
    public final boolean f42002b;
    public final org.telegram.messenger.gs f42003c;
    public final Object d;
    public final Object f42004e;
    public final Object f42005f;

    public xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10) {
        this.f42003c = chatActivityEnterView;
        this.d = document;
        this.f42001a = str;
        this.f42004e = obj;
        this.f42005f = cjVar;
        this.f42002b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f42003c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) this.f42005f;
        int i11 = ChatActivityEnterView.f32535s7;
        chatActivityEnterView.d(document, this.f42001a, this.f42004e, cjVar, this.f42002b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f42003c;
        boolean[] zArr = (boolean[]) this.f42004e;
        bi.i5 i5Var = (bi.i5) this.f42005f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f42001a) || str.equals("und")) && ((this.f42002b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        i5Var.run();
    }

    public xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.i5 i5Var) {
        this.f42003c = profileActivity;
        this.d = strArr;
        this.f42004e = zArr;
        this.f42001a = str;
        this.f42002b = z10;
        this.f42005f = i5Var;
    }
}
