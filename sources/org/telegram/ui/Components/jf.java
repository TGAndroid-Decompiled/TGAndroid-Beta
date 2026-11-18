package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class jf implements TextWatcher {
    public boolean f36423a;
    public boolean f36424b;
    public String f36425c;
    public boolean d;
    public boolean f36426e;
    public final ChatActivityEnterView f36427f;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f36427f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ai.n0 n0Var;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f36427f;
            if (chatActivityEnterView.f32687t3) {
                if (!chatActivityEnterView.l1 || (n0Var = chatActivityEnterView.f32614j1) == null || !n0Var.n()) {
                    this.f36425c = charSequence.toString();
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int currentPage;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f36427f;
            cg cgVar = chatActivityEnterView.V0;
            if (cgVar == null) {
                currentPage = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
            } else {
                currentPage = cgVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.f32716x3 || chatActivityEnterView.f32724y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.B1(false, true);
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
                this.f36426e = z14;
                if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.Z0(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
                }
                int lineCount = chatActivityEnterView.F0.getLineCount();
                chatActivityEnterView.U = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.P1(z15);
                if (chatActivityEnterView.U > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.V1(z16);
            } else {
                this.f36426e = false;
            }
            if (chatActivityEnterView.G3 == 1) {
                return;
            }
            if (chatActivityEnterView.f32658p3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.F3 && !chatActivityEnterView.L2 && chatActivityEnterView.N2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f36424b = true;
            }
            chatActivityEnterView.L2 = false;
            chatActivityEnterView.P(true);
            CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
            if (chatActivityEnterView.N3 != null && !chatActivityEnterView.F3) {
                int i12 = i11 + 1;
                if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.M3 = true;
                }
                kg kgVar = chatActivityEnterView.N3;
                if (i10 <= i12 && i11 - i10 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                kgVar.j1(charSequence, z11, false);
            }
            if (chatActivityEnterView.G3 != 2 && i11 - i10 > 1) {
                this.f36423a = true;
            }
            if (chatActivityEnterView.N2 == null && !chatActivityEnterView.V2 && n1.length() != 0 && chatActivityEnterView.f32665q3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.F3) {
                chatActivityEnterView.f32665q3 = System.currentTimeMillis();
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    kgVar2.G1();
                }
            }
            chatActivityEnterView.v2();
        }
    }
}
