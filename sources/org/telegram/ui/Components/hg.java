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
public final class hg implements ny {
    public final ChatActivityEnterView f24789a;

    public hg(ChatActivityEnterView chatActivityEnterView) {
        this.f24789a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f24789a.f22098z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        wg wgVar;
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        wg wgVar2 = chatActivityEnterView.F0;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        org.telegram.ui.mn mnVar = chatActivityEnterView.V2;
        if (mnVar != null && wnVar != null && mnVar.f35626f) {
            wnVar.Rb();
        } else if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.O2, wnVar.a(), new org.telegram.ui.qq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                if (view != null) {
                    wgVar = view;
                } else {
                    wgVar = wgVar2;
                }
                ogVar.t1(wgVar, wgVar2.f29994a.getText(), true);
            }
        } else {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new ge(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f24789a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.wn wnVar = this.f24789a.P2;
        if (wnVar != null && wnVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.wn wnVar = this.f24789a.P2;
        if (wnVar != null && wnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        gg ggVar = chatActivityEnterView.f21956a3;
        if (ggVar != null && !ggVar.isDismissed()) {
            chatActivityEnterView.f21956a3.e.b(stickerSet, inputStickerSet);
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
                inputStickerSet.f18355id = stickerSet.f18362id;
            }
            gy0 gy0Var = new gy0(chatActivityEnterView.O2, m2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            m2Var2.showDialog(gy0Var);
            if (z10) {
                gy0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null) {
            PhotoViewer.t1().J2(null, wnVar, wnVar.f39468ea);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new fg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f24789a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f21952n5;
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.n1(true, true, false, z10);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.L();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
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
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
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
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        wg wgVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f22024l5) {
            gg ggVar = chatActivityEnterView.f21956a3;
            if (ggVar != null) {
                ggVar.dismiss();
                chatActivityEnterView.f21956a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    if (view == null) {
                        view = wgVar;
                    }
                    ogVar.t1(view, wgVar.f29994a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f22098z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.A();
                }
                chatActivityEnterView.n1(false, true, false, true);
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
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            wnVar.showDialog(alertDialog$Builder.f18661a);
        }
    }

    @Override
    public final void o(s51 s51Var) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        org.telegram.ui.ActionBar.m2 m2Var = chatActivityEnterView.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
        if (m2Var2 != null) {
            chatActivityEnterView.f21956a3 = new gg(this, chatActivityEnterView.getContext(), m2Var2, s51Var, chatActivityEnterView.W3);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.B(true);
            }
            m2Var2.showDialog(chatActivityEnterView.f21956a3);
        }
    }

    @Override
    public final float p() {
        return this.f24789a.f22079w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24789a.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        m2Var.showDialog(new rg.x0(m2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        chatActivityEnterView.Z2.W();
        og ogVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        ogVar.j2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f22061s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.wn wnVar = this.f24789a.P2;
        if (wnVar != null) {
            wnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f24789a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.wn wnVar = this.f24789a.P2;
        if (wnVar != null) {
            wnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f24789a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.o70 o70Var = new org.telegram.ui.o70(j3);
            o70Var.e0(chatActivityEnterView.f21975d2);
            wnVar.presentFragment(o70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f24789a.R1 != 0) {
            return true;
        }
        return false;
    }
}
