package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class xe implements TextWatcher {
    public boolean f40323a;
    public boolean f40324b;
    public String f40325c;
    public boolean d;
    public boolean f40326e;
    public final ChatActivityEnterView f40327f;

    public xe(ChatActivityEnterView chatActivityEnterView) {
        this.f40327f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xe.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (!this.d && this.f40327f.G2) {
            this.f40325c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int currentPage;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f40327f;
            kf kfVar = chatActivityEnterView.V0;
            if (kfVar == null) {
                currentPage = org.telegram.messenger.hp.d1().getInt("selected_page", 0);
            } else {
                currentPage = kfVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.K2 || chatActivityEnterView.L2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.c1(false, true);
            }
            if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
                if (chatActivityEnterView.F0.getLineCount() >= 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (chatActivityEnterView.U >= 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f40326e = z14;
                if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.B0(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
                }
                int lineCount = chatActivityEnterView.F0.getLineCount();
                chatActivityEnterView.U = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.o1(z15);
                if (chatActivityEnterView.U > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.u1(z16);
            } else {
                this.f40326e = false;
            }
            if (chatActivityEnterView.T2 == 1) {
                return;
            }
            if (chatActivityEnterView.C2 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.S2 && !chatActivityEnterView.Y1 && chatActivityEnterView.f31086a2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i3 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f40324b = true;
            }
            chatActivityEnterView.Y1 = false;
            chatActivityEnterView.E(true);
            CharSequence n12 = org.telegram.messenger.g0.n1(charSequence.toString());
            if (chatActivityEnterView.f31087a3 != null && !chatActivityEnterView.S2) {
                int i12 = i11 + 1;
                if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.Z2 = true;
                }
                uf ufVar = chatActivityEnterView.f31087a3;
                if (i10 <= i12 && i11 - i10 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ufVar.Y0(charSequence, z11, false);
            }
            if (chatActivityEnterView.T2 != 2 && i11 - i10 > 1) {
                this.f40323a = true;
            }
            if (chatActivityEnterView.f31086a2 == null && !chatActivityEnterView.f31137i2 && n12.length() != 0 && chatActivityEnterView.D2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.S2) {
                chatActivityEnterView.D2 = System.currentTimeMillis();
                uf ufVar2 = chatActivityEnterView.f31087a3;
                if (ufVar2 != null) {
                    ufVar2.s1();
                }
            }
            chatActivityEnterView.S1();
        }
    }
}
