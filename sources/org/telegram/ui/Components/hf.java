package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class hf implements TextWatcher {
    public boolean f27477a;
    public boolean f27478b;
    public String f27479c;
    public boolean d;
    public boolean f27480e;
    public final ChatActivityEnterView f27481f;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f27481f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f27481f.B2) {
            this.f27479c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int currentPage;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f27481f;
            uf ufVar = chatActivityEnterView.R0;
            if (ufVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = ufVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.F2 || chatActivityEnterView.G2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z4) {
                chatActivityEnterView.d1(false, true);
            }
            if (chatActivityEnterView.Q != chatActivityEnterView.B0.getLineCount()) {
                if (chatActivityEnterView.B0.getLineCount() >= 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (chatActivityEnterView.Q >= 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f27480e = z13;
                if (!chatActivityEnterView.P && chatActivityEnterView.B0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.C0(chatActivityEnterView.Q, chatActivityEnterView.B0.getLineCount());
                }
                int lineCount = chatActivityEnterView.B0.getLineCount();
                chatActivityEnterView.Q = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                chatActivityEnterView.p1(z14);
                if (chatActivityEnterView.Q > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.v1(z15);
            } else {
                this.f27480e = false;
            }
            if (chatActivityEnterView.O2 == 1) {
                return;
            }
            if (chatActivityEnterView.f24701x2 && !chatActivityEnterView.f24710z0 && !chatActivityEnterView.A0 && !chatActivityEnterView.N2 && !chatActivityEnterView.T1 && chatActivityEnterView.V1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f27478b = true;
            }
            chatActivityEnterView.T1 = false;
            chatActivityEnterView.J(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.V2 != null && !chatActivityEnterView.N2) {
                int i13 = i12 + 1;
                if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.U2 = true;
                }
                eg egVar = chatActivityEnterView.V2;
                if (i11 <= i13 && i12 - i11 <= 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                egVar.r1(charSequence, z10, false);
            }
            if (chatActivityEnterView.O2 != 2 && i12 - i11 > 1) {
                this.f27477a = true;
            }
            if (chatActivityEnterView.V1 == null && !chatActivityEnterView.f24590d2 && trimmedString.length() != 0 && chatActivityEnterView.f24707y2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.N2) {
                chatActivityEnterView.f24707y2 = System.currentTimeMillis();
                eg egVar2 = chatActivityEnterView.V2;
                if (egVar2 != null) {
                    egVar2.M1();
                }
            }
            chatActivityEnterView.R1();
        }
    }
}
