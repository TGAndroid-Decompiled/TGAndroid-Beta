package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class lf implements TextWatcher {
    public boolean f30298a;
    public boolean f30299b;
    public String f30300c;
    public boolean d;
    public boolean f30301e;
    public final ChatActivityEnterView f30302f;

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f30302f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f30302f.A2) {
            this.f30300c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int currentPage;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f30302f;
            xf xfVar = chatActivityEnterView.Q0;
            if (xfVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = xfVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.E2 || chatActivityEnterView.F2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.d1(false, true);
            }
            if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
                if (chatActivityEnterView.A0.getLineCount() >= 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (chatActivityEnterView.P >= 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f30301e = z14;
                if (!chatActivityEnterView.O && chatActivityEnterView.A0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.C0(chatActivityEnterView.P, chatActivityEnterView.A0.getLineCount());
                }
                int lineCount = chatActivityEnterView.A0.getLineCount();
                chatActivityEnterView.P = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.p1(z15);
                if (chatActivityEnterView.P > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.v1(z16);
            } else {
                this.f30301e = false;
            }
            if (chatActivityEnterView.N2 == 1) {
                return;
            }
            if (chatActivityEnterView.f26211w2 && !chatActivityEnterView.f26220y0 && !chatActivityEnterView.f26225z0 && !chatActivityEnterView.M2 && !chatActivityEnterView.S1 && chatActivityEnterView.U1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f30299b = true;
            }
            chatActivityEnterView.S1 = false;
            chatActivityEnterView.J(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.U2 != null && !chatActivityEnterView.M2) {
                int i13 = i12 + 1;
                if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.T2 = true;
                }
                hg hgVar = chatActivityEnterView.U2;
                if (i11 <= i13 && i12 - i11 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                hgVar.l1(charSequence, z11, false);
            }
            if (chatActivityEnterView.N2 != 2 && i12 - i11 > 1) {
                this.f30298a = true;
            }
            if (chatActivityEnterView.U1 == null && !chatActivityEnterView.f26102c2 && trimmedString.length() != 0 && chatActivityEnterView.f26217x2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.M2) {
                chatActivityEnterView.f26217x2 = System.currentTimeMillis();
                hg hgVar2 = chatActivityEnterView.U2;
                if (hgVar2 != null) {
                    hgVar2.G1();
                }
            }
            chatActivityEnterView.R1();
        }
    }
}
