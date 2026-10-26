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
public final class gg implements ty {
    public final ChatActivityEnterView f28566a;

    public gg(ChatActivityEnterView chatActivityEnterView) {
        this.f28566a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f28566a.f25993z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        wg wgVar;
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        wg wgVar2 = chatActivityEnterView.F0;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && unVar != null && knVar.f40982f) {
            unVar.dc();
        } else if (c() && i10 == 0) {
            g5.L(chatActivityEnterView.O2, unVar.a(), new org.telegram.ui.lq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                if (view != null) {
                    wgVar = view;
                } else {
                    wgVar = wgVar2;
                }
                ogVar.e1(wgVar, wgVar2.f34434a.getText(), true);
            }
        } else {
            g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f28566a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.un unVar = this.f28566a.P2;
        if (unVar != null && unVar.I6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.un unVar = this.f28566a.P2;
        if (unVar != null && unVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        fg fgVar = chatActivityEnterView.f25847a3;
        if (fgVar != null && !fgVar.isDismissed()) {
            chatActivityEnterView.f25847a3.d.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = chatActivityEnterView.P2;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
        if (r2Var2 != null && chatActivityEnterView.O2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f22047id = stickerSet.f22054id;
            }
            cz0 cz0Var = new cz0(chatActivityEnterView.O2, r2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            r2Var2.showDialog(cz0Var);
            if (z10) {
                cz0Var.r0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            PhotoViewer.u1().M2(null, unVar, unVar.f44388qa);
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
                PhotoViewer.u1().i2(arrayList, 0, 12, false, new eg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f28566a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f25843r5;
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        chatActivityEnterView.j1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.k1(true, true, false, z10);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.H();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        TextView textView = chatActivityEnterView.Y4;
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
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        EditText editText = chatActivityEnterView.Y4;
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
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        wg wgVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f25940p5) {
            fg fgVar = chatActivityEnterView.f25847a3;
            if (fgVar != null) {
                fgVar.dismiss();
                chatActivityEnterView.f25847a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    if (view == null) {
                        view = wgVar;
                    }
                    ogVar.e1(view, wgVar.f34434a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f25993z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.j1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.B();
                }
                chatActivityEnterView.k1(false, true, false, true);
            }
            chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            unVar.showDialog(alertDialog$Builder.f22368a);
        }
    }

    @Override
    public final void o(p61 p61Var) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        org.telegram.ui.ActionBar.r2 r2Var = chatActivityEnterView.P2;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
        if (r2Var2 != null) {
            chatActivityEnterView.f25847a3 = new fg(this, chatActivityEnterView.getContext(), r2Var2, p61Var, chatActivityEnterView.W3);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.w(true);
            }
            r2Var2.showDialog(chatActivityEnterView.f25847a3);
        }
    }

    @Override
    public final float p() {
        return this.f28566a.f25974w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f28566a.P2;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        r2Var.showDialog(new tg.y0(r2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        chatActivityEnterView.Z2.H();
        og ogVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ogVar.O1(z10);
        chatActivityEnterView.post(chatActivityEnterView.f25956s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.un unVar = this.f28566a.P2;
        if (unVar != null) {
            unVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f28566a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.un unVar = this.f28566a.P2;
        if (unVar != null) {
            unVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Y4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new bi.n(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f28566a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.j0(false);
            }
            org.telegram.ui.f70 f70Var = new org.telegram.ui.f70(j10);
            f70Var.f0(chatActivityEnterView.f25866d2);
            unVar.presentFragment(f70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f28566a.R1 != 0) {
            return true;
        }
        return false;
    }
}
