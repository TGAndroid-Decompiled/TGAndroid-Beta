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
public final class bu implements ky {
    public final du f23749a;

    public bu(du duVar) {
        this.f23749a = duVar;
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
        du duVar = this.f23749a;
        if (duVar.b()) {
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            duVar.f24375x = z4;
            duVar.y();
            qv0 qv0Var = duVar.f24370f;
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
        yt ytVar = this.f23749a.f24367a;
        if (ytVar.length() == 0) {
            return false;
        }
        ytVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        yt ytVar = this.f23749a.f24367a;
        int selectionEnd = ytVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, ytVar.getPaint().getFontMetricsInt(), false);
            ytVar.setText(ytVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            ytVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        du duVar = this.f23749a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(duVar.getContext(), 0, duVar.J);
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new u81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.p2 p2Var = duVar.h;
        if (p2Var != null) {
            p2Var.showDialog(alertDialog$Builder.f19503a);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f23749a.h;
        if (p2Var == null) {
            new eg.o1((org.telegram.ui.ActionBar.p2) new eg.y1(this, 6), 11, false).show();
        } else {
            p2Var.showDialog(new eg.o1(p2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        u5 u5Var;
        du duVar = this.f23749a;
        yt ytVar = duVar.f24367a;
        int selectionEnd = ytVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                u5Var = new u5(document, ytVar.getPaint().getFontMetricsInt());
            } else {
                u5Var = new u5(j10, ytVar.getPaint().getFontMetricsInt());
            }
            u5Var.cacheType = duVar.d.f26416c;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            ytVar.setText(ytVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ytVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f23749a.f24375x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(e51 e51Var) {
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
