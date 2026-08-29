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
public final class ag implements fy {
    public final ChatActivityEnterView f26766a;

    public ag(ChatActivityEnterView chatActivityEnterView) {
        this.f26766a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f26766a.f26201u3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        pg pgVar;
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        pg pgVar2 = chatActivityEnterView.B0;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        if (jnVar != null && tnVar != null && jnVar.f39594f) {
            tnVar.Rb();
        } else if (c() && i10 == 0) {
            c5.M(chatActivityEnterView.J2, tnVar.a(), new org.telegram.ui.jq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.R3);
        } else if (chatActivityEnterView.C0 > 0 && !c()) {
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                if (view != null) {
                    pgVar = view;
                } else {
                    pgVar = pgVar2;
                }
                hgVar.t1(pgVar, pgVar2.f31670a.getText(), true);
            }
        } else {
            c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new yd(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f26766a.L2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.tn tnVar = this.f26766a.K2;
        if (tnVar != null && tnVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.tn tnVar = this.f26766a.K2;
        if (tnVar != null && tnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        zf zfVar = chatActivityEnterView.V2;
        if (zfVar != null && !zfVar.isDismissed()) {
            chatActivityEnterView.V2.f27925e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null && chatActivityEnterView.J2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f22412id = stickerSet.f22419id;
            }
            nx0 nx0Var = new nx0(chatActivityEnterView.J2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.R3);
            o2Var2.showDialog(nx0Var);
            if (z10) {
                nx0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null) {
            PhotoViewer.t1().K2(null, tnVar, tnVar.f42746aa);
            if (obj instanceof TLRPC.Document) {
                file = FileLoader.getInstance(chatActivityEnterView.M).getPathToAttach((TLRPC.Document) obj);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new yf(this, obj, obj2, photoEntry), chatActivityEnterView.K2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f26766a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        if (chatActivityEnterView.L2 == UserConfig.getInstance(chatActivityEnterView.M).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 0, chatActivityEnterView.K2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f26085i5;
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.n1(true, true, false, z10);
        }
        if (chatActivityEnterView.f26196t3 && chatActivityEnterView.M1 == 2) {
            chatActivityEnterView.K();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        TextView textView = chatActivityEnterView.P4;
        if (textView == null) {
            textView = chatActivityEnterView.A0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        EditText editText = chatActivityEnterView.P4;
        if (editText == null) {
            editText = chatActivityEnterView.A0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.N2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        } finally {
            chatActivityEnterView.N2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        pg pgVar = chatActivityEnterView.B0;
        if (!chatActivityEnterView.f26130g5) {
            zf zfVar = chatActivityEnterView.V2;
            if (zfVar != null) {
                zfVar.dismiss();
                chatActivityEnterView.V2 = null;
            }
            if (chatActivityEnterView.C0 > 0 && !c()) {
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    if (view == null) {
                        view = pgVar;
                    }
                    hgVar.t1(view, pgVar.f31670a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f26201u3) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, true);
                    chatActivityEnterView.Q0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.Q0.B();
                }
                chatActivityEnterView.n1(false, true, false, true);
            }
            chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.N.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null && (activity = chatActivityEnterView.J2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.R3);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new u(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            tnVar.showDialog(alertDialog$Builder.f22714a);
        }
    }

    @Override
    public final void o(s41 s41Var) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.V2 = new zf(this, chatActivityEnterView.getContext(), o2Var2, s41Var, chatActivityEnterView.R3);
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                hgVar.x(true);
            }
            o2Var2.showDialog(chatActivityEnterView.V2);
        }
    }

    @Override
    public final float p() {
        return this.f26766a.f26188s0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f26766a.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new cg.p1(o2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 2, chatActivityEnterView.K2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        chatActivityEnterView.U2.M();
        hg hgVar = chatActivityEnterView.U2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        hgVar.k2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f26164n3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.tn tnVar = this.f26766a.K2;
        if (tnVar != null) {
            tnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f26766a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.tn tnVar = this.f26766a.K2;
        if (tnVar != null) {
            tnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.P4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.A0;
        }
        AndroidUtilities.runOnUIThread(new jh.i(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f26766a;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.c70 c70Var = new org.telegram.ui.c70(j10);
            c70Var.e0(chatActivityEnterView.Y1);
            tnVar.presentFragment(c70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f26766a.M1 != 0) {
            return true;
        }
        return false;
    }
}
