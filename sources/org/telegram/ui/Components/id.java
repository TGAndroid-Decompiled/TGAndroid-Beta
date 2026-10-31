package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class id implements q4, org.telegram.messenger.qc {
    public final String f26966a;
    public final boolean f26967b;
    public final org.telegram.messenger.us f26968c;
    public final Object d;
    public final Object e;
    public final Object f26969f;

    public id(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10) {
        this.f26968c = chatActivityEnterView;
        this.d = document;
        this.f26966a = str;
        this.e = obj;
        this.f26969f = fjVar;
        this.f26967b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26968c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f26969f;
        int i12 = ChatActivityEnterView.f23672s5;
        chatActivityEnterView.a(document, this.f26966a, this.e, fjVar, this.f26967b, z10, i10, i11);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f26968c;
        boolean[] zArr = (boolean[]) this.e;
        org.telegram.messenger.fe feVar = (org.telegram.messenger.fe) this.f26969f;
        RectF rectF = ProfileActivity.R6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f26966a) || str.equals("und")) && ((this.f26967b && !org.telegram.ui.e01.c0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.w3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        feVar.run();
    }

    public id(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, org.telegram.messenger.fe feVar) {
        this.f26968c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.f26966a = str;
        this.f26967b = z10;
        this.f26969f = feVar;
    }
}
