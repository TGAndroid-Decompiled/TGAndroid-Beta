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
public final class st implements wx {
    public final ut f32551a;

    public st(ut utVar) {
        this.f32551a = utVar;
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
    public final void i(int i9) {
        boolean z10;
        ut utVar = this.f32551a;
        if (utVar.b()) {
            if (i9 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            utVar.f33130x = z10;
            utVar.y();
            xu0 xu0Var = utVar.f33125f;
            if (xu0Var != null) {
                xu0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        pt ptVar = this.f32551a.f33121a;
        if (ptVar.length() == 0) {
            return false;
        }
        ptVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        pt ptVar = this.f32551a.f33121a;
        int selectionEnd = ptVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, ptVar.getPaint().getFontMetricsInt(), false);
            ptVar.setText(ptVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            ptVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void n() {
        ut utVar = this.f32551a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(utVar.getContext(), 0, utVar.I);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new w71(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = utVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.f22702a);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f32551a.h;
        if (o2Var == null) {
            new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(this, 7), 11, false).show();
        } else {
            o2Var.showDialog(new zf.x0(o2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        t5 t5Var;
        ut utVar = this.f32551a;
        pt ptVar = utVar.f33121a;
        int selectionEnd = ptVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                t5Var = new t5(document, ptVar.getPaint().getFontMetricsInt());
            } else {
                t5Var = new t5(j10, ptVar.getPaint().getFontMetricsInt());
            }
            t5Var.cacheType = utVar.d.f34390c;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            ptVar.setText(ptVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ptVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final boolean z() {
        return this.f32551a.f33130x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(h41 h41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i9) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
    }
}
