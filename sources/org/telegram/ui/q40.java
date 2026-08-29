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
public final class q40 extends org.telegram.ui.Components.i30 {
    public final u40 f41532n;

    public q40(u40 u40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, chat, z10);
        this.f41532n = u40Var;
    }

    @Override
    public final void n(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f22714a.E = org.telegram.ui.ActionBar.g6.f23286pg;
        r50 r50Var = this.f41532n.f43179b;
        r50Var.f41943s0 = false;
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (r50Var.W0.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(r50Var.V0)) {
            if (r50Var.W0.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i12);
        } else {
            if (r50Var.W0.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
        }
        alertDialog$Builder.f22714a.f22805u0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.T(getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23252nh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23270oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.g6.f23251ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23108fg, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.i(w02);
        c2Var.setOnShowListener(new p40(this, c2Var, editTextBoldCursor, 1));
        c2Var.setOnDismissListener(new jz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new e3.d(this, editTextBoldCursor, i10, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
        c2Var2.i(w03);
        c2Var2.show();
        c2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
