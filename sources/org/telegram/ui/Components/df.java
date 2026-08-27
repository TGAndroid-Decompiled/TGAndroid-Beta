package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

public final class df implements TextWatcher {

    public boolean f27732a;

    public boolean f27733b;

    public String f27734c;
    public boolean d;

    public boolean f27735e;

    public final ChatActivityEnterView f27736f;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f27736f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        NumberTextView numberTextView;
        boolean z10;
        ke keVar;
        if (this.d) {
            return;
        }
        if (this.f27734c != null) {
            this.d = true;
            editable.replace(0, editable.length(), this.f27734c);
            this.f27734c = null;
            this.d = false;
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f27736f;
        if (chatActivityEnterView.N2 == 0) {
            if (this.f27733b) {
                chatActivityEnterView.S0();
                this.f27733b = false;
            }
            if (this.f27732a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji((CharSequence) editable, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                this.f27732a = false;
            }
        }
        int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.W = iCodePointCount;
        int i10 = chatActivityEnterView.V;
        if (i10 > 0) {
            int i11 = i10 - iCodePointCount;
            if (i11 <= (chatActivityEnterView.f26115g5 ? 5 : 100)) {
                if (i11 < -9999) {
                    i11 = -9999;
                }
                chatActivityEnterView.S();
                NumberTextView numberTextView2 = chatActivityEnterView.U;
                numberTextView2.a(i11, numberTextView2.getVisibility() == 0);
                if (chatActivityEnterView.U.getVisibility() != 0) {
                    chatActivityEnterView.U.setVisibility(0);
                    chatActivityEnterView.U.setAlpha(0.0f);
                    chatActivityEnterView.U.setScaleX(0.5f);
                    chatActivityEnterView.U.setScaleY(0.5f);
                }
                chatActivityEnterView.U.animate().setListener(null).cancel();
                chatActivityEnterView.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i11 < 0) {
                    chatActivityEnterView.U.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23269p7));
                    z10 = false;
                } else {
                    chatActivityEnterView.U.setTextColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23423y6));
                }
            } else {
                numberTextView = chatActivityEnterView.U;
                if (numberTextView != null) {
                    numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 10));
                }
            }
            z10 = true;
        } else {
            numberTextView = chatActivityEnterView.U;
            if (numberTextView != null) {
                numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 10));
            }
            z10 = true;
        }
        if (chatActivityEnterView.f26139l3 != z10 && (keVar = chatActivityEnterView.A1) != null) {
            chatActivityEnterView.f26139l3 = z10;
            keVar.invalidate();
        }
        ze zeVar = chatActivityEnterView.f26122i0;
        if (zeVar != null) {
            zeVar.c();
        }
        chatActivityEnterView.E();
        if (chatActivityEnterView.V1 && !chatActivityEnterView.f26132k0 && !MessagesController.getInstance(chatActivityEnterView.M).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.M).isPremium() && chatActivityEnterView.W > MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitDefault && chatActivityEnterView.W < MessagesController.getInstance(chatActivityEnterView.M).captionLengthLimitPremium) {
            chatActivityEnterView.f26132k0 = true;
            if (this.f27735e) {
                AndroidUtilities.runOnUIThread(new bg(this, 19), 300L);
            } else {
                chatActivityEnterView.p1();
            }
        }
        chatActivityEnterView.o1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.G(true);
        chatActivityEnterView.u1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.d && this.f27736f.A2) {
            this.f27734c = charSequence.toString();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f27736f;
        qf qfVar = chatActivityEnterView.Q0;
        boolean z10 = (qfVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : qfVar.getCurrentPage()) != 0 && (chatActivityEnterView.E2 || chatActivityEnterView.F2);
        if (((i11 == 0 && !TextUtils.isEmpty(charSequence)) || (i11 != 0 && TextUtils.isEmpty(charSequence))) && z10) {
            chatActivityEnterView.c1(false, true);
        }
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            this.f27735e = (chatActivityEnterView.A0.getLineCount() >= 4) != (chatActivityEnterView.P >= 4);
            if (!chatActivityEnterView.O && chatActivityEnterView.A0.getMeasuredWidth() > 0) {
                chatActivityEnterView.C0(chatActivityEnterView.P, chatActivityEnterView.A0.getLineCount());
            }
            int lineCount = chatActivityEnterView.A0.getLineCount();
            chatActivityEnterView.P = lineCount;
            chatActivityEnterView.o1((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.u1((chatActivityEnterView.P <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.f27735e = false;
        }
        if (chatActivityEnterView.N2 == 1) {
            return;
        }
        if (chatActivityEnterView.f26195w2 && !chatActivityEnterView.f26205y0 && !chatActivityEnterView.f26210z0 && !chatActivityEnterView.M2 && !chatActivityEnterView.S1 && chatActivityEnterView.U1 == null && i12 > i11 && charSequence.length() > 0 && charSequence.length() == i10 + i12 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.f27733b = true;
        }
        chatActivityEnterView.S1 = false;
        chatActivityEnterView.K(true);
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
        if (chatActivityEnterView.U2 != null && !chatActivityEnterView.M2) {
            int i13 = i12 + 1;
            if (i11 > i13 || i12 - i11 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.T2 = true;
            }
            chatActivityEnterView.U2.c1(charSequence, i11 > i13 || i12 - i11 > 2, false);
        }
        if (chatActivityEnterView.N2 != 2 && i12 - i11 > 1) {
            this.f27732a = true;
        }
        if (chatActivityEnterView.U1 == null && !chatActivityEnterView.f26086c2 && trimmedString.length() != 0 && chatActivityEnterView.f26201x2 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.M2) {
            chatActivityEnterView.f26201x2 = System.currentTimeMillis();
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                agVar.w1();
            }
        }
        chatActivityEnterView.Q1();
    }
}
