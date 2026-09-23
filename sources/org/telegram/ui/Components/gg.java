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
public final class gg implements ly {
    public final ChatActivityEnterView f24280a;

    public gg(ChatActivityEnterView chatActivityEnterView) {
        this.f24280a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f24280a.y3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        vg vgVar;
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        vg vgVar2 = chatActivityEnterView.F0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        org.telegram.ui.nn nnVar = chatActivityEnterView.U2;
        if (nnVar != null && xnVar != null && nnVar.f35560f) {
            xnVar.Rb();
        } else if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.N2, xnVar.a(), new org.telegram.ui.rq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.V3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                if (view != null) {
                    vgVar = view;
                } else {
                    vgVar = vgVar2;
                }
                ngVar.t1(vgVar, vgVar2.f28736a.getText(), true);
            }
        } else {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f24280a.P2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.xn xnVar = this.f24280a.O2;
        if (xnVar != null && xnVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.xn xnVar = this.f24280a.O2;
        if (xnVar != null && xnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        fg fgVar = chatActivityEnterView.Z2;
        if (fgVar != null && !fgVar.isDismissed()) {
            chatActivityEnterView.Z2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null && chatActivityEnterView.N2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f18103id = stickerSet.f18110id;
            }
            ux0 ux0Var = new ux0(chatActivityEnterView.N2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.V3);
            n2Var2.showDialog(ux0Var);
            if (z10) {
                ux0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null) {
            PhotoViewer.t1().J2(null, xnVar, xnVar.f39370ea);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new eg(this, obj, obj2, photoEntry), chatActivityEnterView.O2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f24280a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        if (chatActivityEnterView.P2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 0, chatActivityEnterView.O2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f21701n5;
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        chatActivityEnterView.n1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.o1(true, true, false, z10);
        }
        if (chatActivityEnterView.f21837x3 && chatActivityEnterView.Q1 == 2) {
            chatActivityEnterView.M();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
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
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
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
            chatActivityEnterView.R2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            chatActivityEnterView.R2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        vg vgVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f21773l5) {
            fg fgVar = chatActivityEnterView.Z2;
            if (fgVar != null) {
                fgVar.dismiss();
                chatActivityEnterView.Z2 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    if (view == null) {
                        view = vgVar;
                    }
                    ngVar.t1(view, vgVar.f28736a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.y3) {
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.n1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.A();
                }
                chatActivityEnterView.o1(false, true, false, true);
            }
            chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z10, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.P2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null && (activity = chatActivityEnterView.N2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.V3);
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            xnVar.showDialog(alertDialog$Builder.f18409a);
        }
    }

    @Override
    public final void o(d51 d51Var) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.Z2 = new fg(this, chatActivityEnterView.getContext(), n2Var2, d51Var, chatActivityEnterView.V3);
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                ngVar.B(true);
            }
            n2Var2.showDialog(chatActivityEnterView.Z2);
        }
    }

    @Override
    public final float p() {
        return this.f24280a.f21828w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24280a.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new rg.x0(n2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 2, chatActivityEnterView.O2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        chatActivityEnterView.Y2.W();
        ng ngVar = chatActivityEnterView.Y2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ngVar.j2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f21804r3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.xn xnVar = this.f24280a.O2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f24280a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.xn xnVar = this.f24280a.O2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f24280a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.n0(false);
            }
            org.telegram.ui.q70 q70Var = new org.telegram.ui.q70(j3);
            q70Var.e0(chatActivityEnterView.f21718c2);
            xnVar.presentFragment(q70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f24280a.Q1 != 0) {
            return true;
        }
        return false;
    }
}
