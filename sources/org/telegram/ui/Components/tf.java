package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class tf implements TextWatcher {
    public boolean f31028a;
    public boolean f31029b;
    public String f31030c;
    public boolean d;
    public boolean f31031e;
    public final ChatActivityEnterView f31032f;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f31032f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f31032f.F2) {
            this.f31030c = charSequence.toString();
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
            ChatActivityEnterView chatActivityEnterView = this.f31032f;
            fg fgVar = chatActivityEnterView.U0;
            if (fgVar == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = fgVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2)) {
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
                this.f31031e = z14;
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
                this.f31031e = false;
            }
            if (chatActivityEnterView.S2 == 1) {
                return;
            }
            if (chatActivityEnterView.B2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.R2 && !chatActivityEnterView.X1 && chatActivityEnterView.Z1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f31029b = true;
            }
            chatActivityEnterView.X1 = false;
            chatActivityEnterView.I(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
                int i13 = i12 + 1;
                if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.Y2 = true;
                }
                pg pgVar = chatActivityEnterView.Z2;
                if (i11 <= i13 && i12 - i11 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                pgVar.l1(charSequence, z11, false);
            }
            if (chatActivityEnterView.S2 != 2 && i12 - i11 > 1) {
                this.f31028a = true;
            }
            if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.f23896h2 && trimmedString.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
                chatActivityEnterView.C2 = System.currentTimeMillis();
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.E1();
                }
            }
            chatActivityEnterView.R1();
        }
    }
}
