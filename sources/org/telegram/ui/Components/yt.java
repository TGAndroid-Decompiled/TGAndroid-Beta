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
public final class yt implements fy {
    public final au f35130a;

    public yt(au auVar) {
        this.f35130a = auVar;
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
        au auVar = this.f35130a;
        if (auVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            auVar.f26891x = z10;
            auVar.y();
            hv0 hv0Var = auVar.f26886f;
            if (hv0Var != null) {
                hv0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        vt vtVar = this.f35130a.f26882a;
        if (vtVar.length() == 0) {
            return false;
        }
        vtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        vt vtVar = this.f35130a.f26882a;
        int selectionEnd = vtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, vtVar.getPaint().getFontMetricsInt(), false);
            vtVar.setText(vtVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            vtVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void n() {
        au auVar = this.f35130a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(auVar.getContext(), 0, auVar.I);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new i81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = auVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.f22714a);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f35130a.h;
        if (o2Var == null) {
            new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(this, 8), 11, false).show();
        } else {
            o2Var.showDialog(new cg.p1(o2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        au auVar = this.f35130a;
        vt vtVar = auVar.f26882a;
        int selectionEnd = vtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, vtVar.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j10, vtVar.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = auVar.d.f28581c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            vtVar.setText(vtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            vtVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f35130a.f26891x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(s41 s41Var) {
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
