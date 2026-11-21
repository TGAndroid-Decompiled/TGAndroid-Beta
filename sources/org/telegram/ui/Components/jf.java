package org.telegram.ui.Components;

import android.text.TextUtils;
import android.text.TextWatcher;
public final class jf implements TextWatcher {
    public boolean f36489a;
    public boolean f36490b;
    public String f36491c;
    public boolean d;
    public boolean f36492e;
    public final ChatActivityEnterView f36493f;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f36493f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jf.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f36493f;
            if (chatActivityEnterView.f32733v3 && !chatActivityEnterView.p0()) {
                this.f36491c = charSequence.toString();
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
            ChatActivityEnterView chatActivityEnterView = this.f36493f;
            fg fgVar = chatActivityEnterView.V0;
            if (fgVar == null) {
                currentPage = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
            } else {
                currentPage = fgVar.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.f32764z3 || chatActivityEnterView.A3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i10 == 0 && !TextUtils.isEmpty(charSequence)) || (i10 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
                chatActivityEnterView.F1(false, true);
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
                this.f36492e = z14;
                if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.d1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
                }
                int lineCount = chatActivityEnterView.F0.getLineCount();
                chatActivityEnterView.U = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                chatActivityEnterView.T1(z15);
                if (chatActivityEnterView.U > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                chatActivityEnterView.Z1(z16);
            } else {
                this.f36492e = false;
            }
            if (chatActivityEnterView.I3 == 1) {
                return;
            }
            if (chatActivityEnterView.f32705r3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.H3 && !chatActivityEnterView.N2 && chatActivityEnterView.P2 == null && i11 > i10 && charSequence.length() > 0 && charSequence.length() == i7 + i11 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.f36490b = true;
            }
            chatActivityEnterView.N2 = false;
            chatActivityEnterView.P(true);
            CharSequence n1 = org.telegram.messenger.g0.n1(charSequence.toString());
            if (chatActivityEnterView.P3 != null && !chatActivityEnterView.H3) {
                int i12 = i11 + 1;
                if (i10 > i12 || i11 - i10 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.O3 = true;
                }
                ng ngVar = chatActivityEnterView.P3;
                if (i10 <= i12 && i11 - i10 <= 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ngVar.j1(charSequence, z11, false);
            }
            if (chatActivityEnterView.I3 != 2 && i11 - i10 > 1) {
                this.f36489a = true;
            }
            if (chatActivityEnterView.P2 == null && !chatActivityEnterView.X2 && n1.length() != 0 && chatActivityEnterView.f32714s3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.H3) {
                chatActivityEnterView.f32714s3 = System.currentTimeMillis();
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    ngVar2.G1();
                }
            }
            chatActivityEnterView.y2();
        }
    }
}
