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
public final class gg implements uy {
    public final ChatActivityEnterView f26561a;

    public gg(ChatActivityEnterView chatActivityEnterView) {
        this.f26561a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f26561a.f24051z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        wg wgVar;
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        wg wgVar2 = chatActivityEnterView.F0;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        org.telegram.ui.in inVar = chatActivityEnterView.V2;
        if (inVar != null && snVar != null && inVar.f37922f) {
            snVar.Vb();
        } else if (c() && i10 == 0) {
            f5.L(chatActivityEnterView.O2, snVar.a(), new org.telegram.ui.jq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                if (view != null) {
                    wgVar = view;
                } else {
                    wgVar = wgVar2;
                }
                ogVar.o1(wgVar, wgVar2.f32111a.getText(), true);
            }
        } else {
            f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f26561a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.sn snVar = this.f26561a.P2;
        if (snVar != null && snVar.G6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.sn snVar = this.f26561a.P2;
        if (snVar != null && snVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        fg fgVar = chatActivityEnterView.f23908a3;
        if (fgVar != null && !fgVar.isDismissed()) {
            chatActivityEnterView.f23908a3.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null && chatActivityEnterView.O2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f20292id = stickerSet.f20299id;
            }
            oy0 oy0Var = new oy0(chatActivityEnterView.O2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            n2Var2.showDialog(oy0Var);
            if (z10) {
                oy0Var.q0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null) {
            PhotoViewer.t1().K2(null, snVar, snVar.f41191ea);
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
                PhotoViewer.t1().g2(arrayList, 0, 12, false, new eg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f26561a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f23904n5;
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        chatActivityEnterView.j1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.l1(true, true, false, z10);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.J();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        TextView textView = chatActivityEnterView.U4;
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
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        EditText editText = chatActivityEnterView.U4;
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
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        wg wgVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f23977l5) {
            fg fgVar = chatActivityEnterView.f23908a3;
            if (fgVar != null) {
                fgVar.dismiss();
                chatActivityEnterView.f23908a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    if (view == null) {
                        view = wgVar;
                    }
                    ogVar.o1(view, wgVar.f32111a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f24051z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.j1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.B();
                }
                chatActivityEnterView.l1(false, true, false, true);
            }
            chatActivityEnterView.e(document, str, obj, sendAnimationData, false, z10, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            snVar.showDialog(alertDialog$Builder.f20601a);
        }
    }

    @Override
    public final void o(b61 b61Var) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.f23908a3 = new fg(this, chatActivityEnterView.getContext(), n2Var2, b61Var, chatActivityEnterView.W3);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.C(true);
            }
            n2Var2.showDialog(chatActivityEnterView.f23908a3);
        }
    }

    @Override
    public final float p() {
        return this.f26561a.f24032w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f26561a.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new sg.y0(n2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        chatActivityEnterView.Z2.Y();
        og ogVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ogVar.Z1(z10);
        chatActivityEnterView.post(chatActivityEnterView.f24014s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.sn snVar = this.f26561a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f26561a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.sn snVar = this.f26561a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.m(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f26561a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.k0(false);
            }
            org.telegram.ui.c70 c70Var = new org.telegram.ui.c70(j10);
            c70Var.e0(chatActivityEnterView.f23927d2);
            snVar.presentFragment(c70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f26561a.R1 != 0) {
            return true;
        }
        return false;
    }
}
