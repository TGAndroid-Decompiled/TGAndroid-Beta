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
public final class ju implements ny {
    public final lu f25527a;

    public ju(lu luVar) {
        this.f25527a = luVar;
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
        boolean z10;
        lu luVar = this.f25527a;
        if (luVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            luVar.f26180x = z10;
            luVar.y();
            bw0 bw0Var = luVar.f26175f;
            if (bw0Var != null) {
                bw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        gu guVar = this.f25527a.f26172a;
        if (guVar.length() == 0) {
            return false;
        }
        guVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        gu guVar = this.f25527a.f26172a;
        int selectionEnd = guVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, guVar.getPaint().getFontMetricsInt(), false);
            guVar.setText(guVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            guVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        lu luVar = this.f25527a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(luVar.getContext(), 0, luVar.M);
        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = luVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.f18661a);
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f25527a.h;
        if (m2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.m2) new ai.y3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new rg.x0(m2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        z5 z5Var;
        lu luVar = this.f25527a;
        gu guVar = luVar.f26172a;
        int selectionEnd = guVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                z5Var = new z5(document, guVar.getPaint().getFontMetricsInt());
            } else {
                z5Var = new z5(j3, guVar.getPaint().getFontMetricsInt());
            }
            z5Var.cacheType = luVar.d.f26546c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            guVar.setText(guVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            guVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f25527a.f26180x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(s51 s51Var) {
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
    public final void y(long j3) {
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
