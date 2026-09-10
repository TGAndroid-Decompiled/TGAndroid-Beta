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
public final class dn implements sy {
    public final zn f22448a;

    public dn(zn znVar) {
        this.f22448a = znVar;
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
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zn znVar = this.f22448a;
        znVar.f29747h1 = z10;
        znVar.f26422b.f29403r1.requestLayout();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.e6 e6Var = this.f22448a.f29745g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.e6 e6Var = this.f22448a.f29745g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
            editField.setText(editField.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        zn znVar = this.f22448a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getContext(), 0, znVar.f26421a);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 24));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        EditTextBoldCursor editField;
        y5 y5Var;
        org.telegram.ui.Cells.e6 e6Var = this.f22448a.f29745g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, editField.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j3, editField.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = 3;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean z() {
        return this.f22448a.f29747h1;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(r51 r51Var) {
    }

    @Override
    public final void q() {
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
