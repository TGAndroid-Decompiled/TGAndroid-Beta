package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class rt implements xx {

    public final tt f32264a;

    public rt(tt ttVar) {
        this.f32264a = ttVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i10) {
        tt ttVar = this.f32264a;
        if (ttVar.b()) {
            ttVar.f32884x = i10 != 0;
            ttVar.y();
            zu0 zu0Var = ttVar.f32879f;
            if (zu0Var != null) {
                zu0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        ot otVar = this.f32264a.f32875a;
        if (otVar.length() == 0) {
            return false;
        }
        otVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ot otVar = this.f32264a.f32875a;
        int selectionEnd = otVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, otVar.getPaint().getFontMetricsInt(), false);
            otVar.setText(otVar.getText().insert(selectionEnd, charSequenceReplaceEmoji));
            int length = selectionEnd + charSequenceReplaceEmoji.length();
            otVar.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void n() {
        tt ttVar = this.f32264a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ttVar.getContext(), 0, ttVar.I);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new y71(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = ttVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f22702a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32264a.h;
        if (n2Var == null) {
            new ag.g2((org.telegram.ui.ActionBar.n2) new ag.r2(this, 8), 11, false).show();
        } else {
            n2Var.showDialog(new ag.g2(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        tt ttVar = this.f32264a;
        ot otVar = ttVar.f32875a;
        int selectionEnd = otVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            t5 t5Var = document != null ? new t5(document, otVar.getPaint().getFontMetricsInt()) : new t5(j10, otVar.getPaint().getFontMetricsInt());
            t5Var.cacheType = ttVar.d.f34983c;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            otVar.setText(otVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            otVar.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final boolean z() {
        return this.f32264a.f32884x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(j41 j41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
