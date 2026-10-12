package org.telegram.ui.Components;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
public final class lg implements dz {
    public final ChatActivityEnterView f28188a;

    public lg(ChatActivityEnterView chatActivityEnterView) {
        this.f28188a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f28188a.f23627b4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ah ahVar;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        ah ahVar2 = chatActivityEnterView.F0;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        org.telegram.ui.tn tnVar = chatActivityEnterView.V2;
        if (tnVar != null && eoVar != null && tnVar.f42246f) {
            eoVar.Vb();
        } else if (c() && i10 == 0) {
            g5.L(chatActivityEnterView.O2, eoVar.a(), new org.telegram.ui.wq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.f23774z4);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            sg sgVar = chatActivityEnterView.Z2;
            if (sgVar != null) {
                if (view != null) {
                    ahVar = view;
                } else {
                    ahVar = ahVar2;
                }
                sgVar.z1(ahVar, ahVar2.f24305a.getText(), true);
            }
        } else {
            g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new je(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f28188a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.eo eoVar = this.f28188a.P2;
        if (eoVar != null && eoVar.G6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.eo eoVar = this.f28188a.P2;
        if (eoVar != null && eoVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        kg kgVar = chatActivityEnterView.f23619a3;
        if (kgVar != null && !kgVar.isDismissed()) {
            chatActivityEnterView.f23619a3.f24842e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = chatActivityEnterView.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
        if (m2Var2 != null && chatActivityEnterView.O2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f19822id = stickerSet.f19829id;
            }
            dz0 dz0Var = new dz0(chatActivityEnterView.O2, m2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.f23774z4);
            m2Var2.showDialog(dz0Var);
            if (z10) {
                dz0Var.q0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null) {
            PhotoViewer.t1().K2(null, eoVar, eoVar.f37251ea);
            if (obj instanceof TLRPC.Document) {
                file = FileLoader.getInstance(chatActivityEnterView.Q).getPathToAttach((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(FileLoader.getDirectory(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.caption = null;
                photoEntry.isVideo = true;
                arrayList.add(photoEntry);
                PhotoViewer.t1().g2(arrayList, 0, 12, false, new jg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f28188a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.Q5;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        chatActivityEnterView.o1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.p1(true, true, false, z10);
        }
        if (chatActivityEnterView.f23620a4 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.M();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        TextView textView = chatActivityEnterView.f23763x5;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        EditText editText = chatActivityEnterView.f23763x5;
        if (editText == null) {
            editText = chatActivityEnterView.E0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.S2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        ah ahVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.O5) {
            kg kgVar = chatActivityEnterView.f23619a3;
            if (kgVar != null) {
                kgVar.dismiss();
                chatActivityEnterView.f23619a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    if (view == null) {
                        view = ahVar;
                    }
                    sgVar.z1(view, ahVar.f24305a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f23627b4) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.o1(0, true);
                    chatActivityEnterView.U0.t(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.B();
                }
                chatActivityEnterView.p1(false, true, false, true);
            }
            chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z10, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.f23774z4);
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            eoVar.showDialog(alertDialog$Builder.f20141a);
        }
    }

    @Override
    public final void o(q61 q61Var) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        org.telegram.ui.ActionBar.m2 m2Var = chatActivityEnterView.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
        if (m2Var2 != null) {
            chatActivityEnterView.f23619a3 = new kg(this, chatActivityEnterView.getContext(), m2Var2, q61Var, chatActivityEnterView.f23774z4);
            sg sgVar = chatActivityEnterView.Z2;
            if (sgVar != null) {
                sgVar.C(true);
            }
            m2Var2.showDialog(chatActivityEnterView.f23619a3);
        }
    }

    @Override
    public final float p() {
        return this.f28188a.f23751w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28188a.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        m2Var.showDialog(new rg.y0(m2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        chatActivityEnterView.Z2.X();
        sg sgVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        sgVar.p2(z10);
        chatActivityEnterView.post(chatActivityEnterView.U3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.eo eoVar = this.f28188a.P2;
        if (eoVar != null) {
            eoVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f28188a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.eo eoVar = this.f28188a.P2;
        if (eoVar != null) {
            eoVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        boolean z11;
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.f23763x5;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        if (chatActivityEnterView.f23691m3 && editTextBoldCursor2 == chatActivityEnterView.E0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.w8(this, z11, chatActivityEnterView.j3, editTextBoldCursor2, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f28188a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.n0(false);
            }
            org.telegram.ui.v70 v70Var = new org.telegram.ui.v70(j3);
            v70Var.e0(chatActivityEnterView.f23638d2);
            eoVar.presentFragment(v70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f28188a.R1 != 0) {
            return true;
        }
        return false;
    }
}
