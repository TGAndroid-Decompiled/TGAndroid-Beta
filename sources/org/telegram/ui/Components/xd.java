package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xd implements a5, org.telegram.messenger.nc {
    public final String f42052a;
    public final boolean f42053b;
    public final org.telegram.messenger.fs f42054c;
    public final Object d;
    public final Object f42055e;
    public final Object f42056f;

    public xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10) {
        this.f42054c = chatActivityEnterView;
        this.d = document;
        this.f42052a = str;
        this.f42055e = obj;
        this.f42056f = bjVar;
        this.f42053b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f42054c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.f42056f;
        int i11 = ChatActivityEnterView.f32566s7;
        chatActivityEnterView.d(document, this.f42052a, this.f42055e, bjVar, this.f42053b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f42054c;
        boolean[] zArr = (boolean[]) this.f42055e;
        bi.g5 g5Var = (bi.g5) this.f42056f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f42052a) || str.equals("und")) && ((this.f42053b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        g5Var.run();
    }

    public xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.g5 g5Var) {
        this.f42054c = profileActivity;
        this.d = strArr;
        this.f42055e = zArr;
        this.f42052a = str;
        this.f42053b = z10;
        this.f42056f = g5Var;
    }
}
