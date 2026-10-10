package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class uf implements TextWatcher {
    public boolean f31486a;
    public boolean f31487b;
    public String f31488c;
    public boolean d;
    public boolean f31489e;
    public final ChatActivityEnterView f31490f;

    public uf(ChatActivityEnterView chatActivityEnterView) {
        this.f31490f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f31490f.F2) {
            this.f31488c = charSequence.toString();
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
            ChatActivityEnterView chatActivityEnterView = this.f31490f;
            gg ggVar = chatActivityEnterView.U0;
            if (ggVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = ggVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.b1(false, true);
            }
            if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
                if (chatActivityEnterView.E0.getLineCount() >= 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (chatActivityEnterView.T >= 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f31489e = z14;
                if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.A0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
                }
                int lineCount = chatActivityEnterView.E0.getLineCount();
                chatActivityEnterView.T = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.n1(z15);
                if (chatActivityEnterView.T > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.t1(z16);
            } else {
                this.f31489e = false;
            }
            if (chatActivityEnterView.S2 == 1) {
                return;
            }
            if (chatActivityEnterView.B2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.R2 && !chatActivityEnterView.X1 && chatActivityEnterView.Z1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f31487b = true;
            }
            chatActivityEnterView.X1 = false;
            chatActivityEnterView.I(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
                int i13 = i12 + 1;
                if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.Y2 = true;
                }
                qg qgVar = chatActivityEnterView.Z2;
                if (i11 <= i13 && i12 - i11 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qgVar.r1(charSequence, z11, false);
            }
            if (chatActivityEnterView.S2 != 2 && i12 - i11 > 1) {
                this.f31486a = true;
            }
            if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.f23903h2 && trimmedString.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
                chatActivityEnterView.C2 = System.currentTimeMillis();
                qg qgVar2 = chatActivityEnterView.Z2;
                if (qgVar2 != null) {
                    qgVar2.L1();
                }
            }
            chatActivityEnterView.Q1();
        }
    }
}
