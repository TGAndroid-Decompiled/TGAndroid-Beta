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
public final class ku implements oy {
    public final mu f25825a;

    public ku(mu muVar) {
        this.f25825a = muVar;
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
        mu muVar = this.f25825a;
        if (muVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            muVar.f26389x = z10;
            muVar.y();
            dw0 dw0Var = muVar.f26384f;
            if (dw0Var != null) {
                dw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        hu huVar = this.f25825a.f26381a;
        if (huVar.length() == 0) {
            return false;
        }
        huVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        hu huVar = this.f25825a.f26381a;
        int selectionEnd = huVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, huVar.getPaint().getFontMetricsInt(), false);
            huVar.setText(huVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            huVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        mu muVar = this.f25825a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(muVar.getContext(), 0, muVar.M);
        alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new h91(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = muVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.f18678a);
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f25825a.h;
        if (m2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.m2) new ai.y3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new rg.x0(m2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        z5 z5Var;
        mu muVar = this.f25825a;
        hu huVar = muVar.f26381a;
        int selectionEnd = huVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                z5Var = new z5(document, huVar.getPaint().getFontMetricsInt());
            } else {
                z5Var = new z5(j3, huVar.getPaint().getFontMetricsInt());
            }
            z5Var.cacheType = muVar.d.f26816c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            huVar.setText(huVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            huVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f25825a.f26389x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(u51 u51Var) {
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
