package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class ze implements TextWatcher {
    public boolean f40965a;
    public boolean f40966b;
    public String f40967c;
    public boolean d;
    public boolean f40968e;
    public final ChatActivityEnterView f40969f;

    public ze(ChatActivityEnterView chatActivityEnterView) {
        this.f40969f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ze.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!this.d && this.f40969f.F2) {
            this.f40967c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int currentPage;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f40969f;
            mf mfVar = chatActivityEnterView.U0;
            if (mfVar == null) {
                currentPage = org.telegram.messenger.qp.d1().getInt("selected_page", 0);
            } else {
                currentPage = mfVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.J2 || chatActivityEnterView.K2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z9) {
                chatActivityEnterView.d1(false, true);
            }
            if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
                if (chatActivityEnterView.E0.getLineCount() >= 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (chatActivityEnterView.T >= 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f40968e = z13;
                if (!chatActivityEnterView.S && chatActivityEnterView.E0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.C0(chatActivityEnterView.T, chatActivityEnterView.E0.getLineCount());
                }
                int lineCount = chatActivityEnterView.E0.getLineCount();
                chatActivityEnterView.T = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                chatActivityEnterView.p1(z14);
                if (chatActivityEnterView.T > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.v1(z15);
            } else {
                this.f40968e = false;
            }
            if (chatActivityEnterView.S2 == 1) {
                return;
            }
            if (chatActivityEnterView.B2 && !chatActivityEnterView.C0 && !chatActivityEnterView.D0 && !chatActivityEnterView.R2 && !chatActivityEnterView.X1 && chatActivityEnterView.Z1 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f40966b = true;
            }
            chatActivityEnterView.X1 = false;
            chatActivityEnterView.E(true);
            CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
            if (chatActivityEnterView.Z2 != null && !chatActivityEnterView.R2) {
                int i12 = i11 + 1;
                if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.Y2 = true;
                }
                wf wfVar = chatActivityEnterView.Z2;
                if (i10 <= i12 && i11 - i10 <= 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                wfVar.a1(charSequence, z10, false);
            }
            if (chatActivityEnterView.S2 != 2 && i11 - i10 > 1) {
                this.f40965a = true;
            }
            if (chatActivityEnterView.Z1 == null && !chatActivityEnterView.f31066h2 && n1.length() != 0 && chatActivityEnterView.C2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.R2) {
                chatActivityEnterView.C2 = System.currentTimeMillis();
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    wfVar2.t1();
                }
            }
            chatActivityEnterView.T1();
        }
    }
}
