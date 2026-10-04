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
public final class ig implements oy {
    public final ChatActivityEnterView f27406a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.f27406a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f27406a.f23998z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        xg xgVar;
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        xg xgVar2 = chatActivityEnterView.F0;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        org.telegram.ui.on onVar = chatActivityEnterView.V2;
        if (onVar != null && ynVar != null && onVar.f39245f) {
            ynVar.Qb();
        } else if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.O2, ynVar.a(), new org.telegram.ui.sq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                if (view != null) {
                    xgVar = view;
                } else {
                    xgVar = xgVar2;
                }
                pgVar.t1(xgVar, xgVar2.f32787a.getText(), true);
            }
        } else {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new he(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f27406a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.yn ynVar = this.f27406a.P2;
        if (ynVar != null && ynVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.yn ynVar = this.f27406a.P2;
        if (ynVar != null && ynVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        hg hgVar = chatActivityEnterView.f23855a3;
        if (hgVar != null && !hgVar.isDismissed()) {
            chatActivityEnterView.f23855a3.f29242e.b(stickerSet, inputStickerSet);
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
                inputStickerSet.f20062id = stickerSet.f20069id;
            }
            qy0 qy0Var = new qy0(chatActivityEnterView.O2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            n2Var2.showDialog(qy0Var);
            if (z10) {
                qy0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null) {
            PhotoViewer.t1().K2(null, ynVar, ynVar.f43307ca);
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
                PhotoViewer.t1().g2(arrayList, 0, 12, false, new gg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f27406a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f23851n5;
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        chatActivityEnterView.l1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.m1(true, true, false, z10);
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
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
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
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        xg xgVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f23924l5) {
            hg hgVar = chatActivityEnterView.f23855a3;
            if (hgVar != null) {
                hgVar.dismiss();
                chatActivityEnterView.f23855a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    if (view == null) {
                        view = xgVar;
                    }
                    pgVar.t1(view, xgVar.f32787a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f23998z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.A();
                }
                chatActivityEnterView.m1(false, true, false, true);
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
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            ynVar.showDialog(alertDialog$Builder.f20372a);
        }
    }

    @Override
    public final void o(c61 c61Var) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.f23855a3 = new hg(this, chatActivityEnterView.getContext(), n2Var2, c61Var, chatActivityEnterView.W3);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.B(true);
            }
            n2Var2.showDialog(chatActivityEnterView.f23855a3);
        }
    }

    @Override
    public final float p() {
        return this.f27406a.f23979w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27406a.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new rg.y0(n2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        chatActivityEnterView.Z2.V();
        pg pgVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        pgVar.j2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f23961s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.yn ynVar = this.f27406a.P2;
        if (ynVar != null) {
            ynVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f27406a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.yn ynVar = this.f27406a.P2;
        if (ynVar != null) {
            ynVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f27406a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.s70 s70Var = new org.telegram.ui.s70(j3);
            s70Var.e0(chatActivityEnterView.f23874d2);
            ynVar.presentFragment(s70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f27406a.R1 != 0) {
            return true;
        }
        return false;
    }
}
