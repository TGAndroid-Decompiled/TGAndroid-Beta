package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class rf implements TextWatcher {
    public boolean f27852a;
    public boolean f27853b;
    public String f27854c;
    public boolean d;
    public boolean e;
    public final ChatActivityEnterView f27855f;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f27855f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f27855f.E2) {
            this.f27854c = charSequence.toString();
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
            ChatActivityEnterView chatActivityEnterView = this.f27855f;
            dg dgVar = chatActivityEnterView.U0;
            if (dgVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = dgVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.I2 || chatActivityEnterView.J2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.c1(false, true);
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
                this.e = z14;
                if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.C0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
                }
                int lineCount = chatActivityEnterView.E0.getLineCount();
                chatActivityEnterView.T = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.o1(z15);
                if (chatActivityEnterView.T > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.u1(z16);
            } else {
                this.e = false;
            }
            if (chatActivityEnterView.R2 == 1) {
                return;
            }
            if (chatActivityEnterView.A2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.Q2 && !chatActivityEnterView.W1 && chatActivityEnterView.Y1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f27853b = true;
            }
            chatActivityEnterView.W1 = false;
            chatActivityEnterView.K(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.Y2 != null && !chatActivityEnterView.Q2) {
                int i13 = i12 + 1;
                if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.X2 = true;
                }
                ng ngVar = chatActivityEnterView.Y2;
                if (i11 <= i13 && i12 - i11 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ngVar.m1(charSequence, z11, false);
            }
            if (chatActivityEnterView.R2 != 2 && i12 - i11 > 1) {
                this.f27852a = true;
            }
            if (chatActivityEnterView.Y1 == null && !chatActivityEnterView.f21994g2 && trimmedString.length() != 0 && chatActivityEnterView.B2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.Q2) {
                chatActivityEnterView.B2 = System.currentTimeMillis();
                ng ngVar2 = chatActivityEnterView.Y2;
                if (ngVar2 != null) {
                    ngVar2.F1();
                }
            }
            chatActivityEnterView.R1();
        }
    }
}
