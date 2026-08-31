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
public final class du implements my {
    public final fu f26320a;

    public du(fu fuVar) {
        this.f26320a = fuVar;
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
        boolean z4;
        fu fuVar = this.f26320a;
        if (fuVar.b()) {
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            fuVar.f27010x = z4;
            fuVar.y();
            qv0 qv0Var = fuVar.f27005f;
            if (qv0Var != null) {
                qv0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        au auVar = this.f26320a.f27001a;
        if (auVar.length() == 0) {
            return false;
        }
        auVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        au auVar = this.f26320a.f27001a;
        int selectionEnd = auVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, auVar.getPaint().getFontMetricsInt(), false);
            auVar.setText(auVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            auVar.setSelection(length, length);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void n() {
        fu fuVar = this.f26320a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fuVar.getContext(), 0, fuVar.J);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new v81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.p2 p2Var = fuVar.h;
        if (p2Var != null) {
            p2Var.showDialog(alertDialog$Builder.f21166a);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f26320a.h;
        if (p2Var == null) {
            new fg.n1((org.telegram.ui.ActionBar.p2) new fg.x1(this, 6), 11, false).show();
        } else {
            p2Var.showDialog(new fg.n1(p2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        u5 u5Var;
        fu fuVar = this.f26320a;
        au auVar = fuVar.f27001a;
        int selectionEnd = auVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                u5Var = new u5(document, auVar.getPaint().getFontMetricsInt());
            } else {
                u5Var = new u5(j10, auVar.getPaint().getFontMetricsInt());
            }
            u5Var.cacheType = fuVar.d.f29270c;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            auVar.setText(auVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            auVar.setSelection(length, length);
        } catch (Exception e6) {
            FileLog.e(e6);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f26320a.f27010x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(f51 f51Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
