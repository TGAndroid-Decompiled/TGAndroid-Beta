package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class hf implements TextWatcher {
    public boolean f29064a;
    public boolean f29065b;
    public String f29066c;
    public boolean d;
    public boolean f29067e;
    public final ChatActivityEnterView f29068f;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f29068f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (!this.d && this.f29068f.A2) {
            this.f29066c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int currentPage;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f29068f;
            uf ufVar = chatActivityEnterView.Q0;
            if (ufVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = ufVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.E2 || chatActivityEnterView.F2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
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
                this.f29067e = z14;
                if (!chatActivityEnterView.O && chatActivityEnterView.A0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.B0(chatActivityEnterView.P, chatActivityEnterView.A0.getLineCount());
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
                this.f29067e = false;
            }
            if (chatActivityEnterView.N2 == 1) {
                return;
            }
            if (chatActivityEnterView.f26199w2 && !chatActivityEnterView.f26209y0 && !chatActivityEnterView.f26214z0 && !chatActivityEnterView.M2 && !chatActivityEnterView.S1 && chatActivityEnterView.U1 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i9 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f29065b = true;
            }
            chatActivityEnterView.S1 = false;
            chatActivityEnterView.J(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.U2 != null && !chatActivityEnterView.M2) {
                int i12 = i11 + 1;
                if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.T2 = true;
                }
                eg egVar = chatActivityEnterView.U2;
                if (i10 <= i12 && i11 - i10 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                egVar.b1(charSequence, z11, false);
            }
            if (chatActivityEnterView.N2 != 2 && i11 - i10 > 1) {
                this.f29064a = true;
            }
            if (chatActivityEnterView.U1 == null && !chatActivityEnterView.f26090c2 && trimmedString.length() != 0 && chatActivityEnterView.f26205x2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.M2) {
                chatActivityEnterView.f26205x2 = System.currentTimeMillis();
                eg egVar2 = chatActivityEnterView.U2;
                if (egVar2 != null) {
                    egVar2.u1();
                }
            }
            chatActivityEnterView.R1();
        }
    }
}
