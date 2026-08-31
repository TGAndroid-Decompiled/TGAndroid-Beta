package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d50 extends org.telegram.ui.Components.o30 {
    public final h50 f36006n;

    public d50(h50 h50Var, Context context, TLRPC.Chat chat, boolean z4) {
        super(context, chat, z4);
        this.f36006n = h50Var;
    }

    @Override
    public final void n(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f21166a.F = org.telegram.ui.ActionBar.k6.f21885pg;
        d60 d60Var = this.f36006n.f37329b;
        d60Var.f36090t0 = false;
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (d60Var.X0.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(d60Var.W0)) {
            if (d60Var.X0.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(i12);
        } else {
            if (d60Var.X0.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.getString(i11);
        }
        alertDialog$Builder.f21166a.f21263v0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.T(getContext(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21849nh, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21867oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f21848ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21866og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, k7.c6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21705fg, false);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.i(w02);
        d2Var.setOnShowListener(new c50(this, d2Var, editTextBoldCursor, 1));
        d2Var.setOnDismissListener(new vz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new e3.d(this, editTextBoldCursor, i10, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21971ug, false);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21166a;
        d2Var2.i(w03);
        d2Var2.show();
        d2Var2.o(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
