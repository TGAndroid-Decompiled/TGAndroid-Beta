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
public final class xf implements my {
    public final ChatActivityEnterView f33058a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f33058a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f33058a.f24690v3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z10) {
        mg mgVar;
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        mg mgVar2 = chatActivityEnterView.C0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
        if (nnVar != null && xnVar != null && nnVar.f39488f) {
            xnVar.Rb();
        } else if (c() && i10 == 0) {
            z4.M(chatActivityEnterView.K2, xnVar.a(), new org.telegram.ui.qq(this, view, obj, str, obj2, photoEntry, z10), chatActivityEnterView.S3);
        } else if (chatActivityEnterView.D0 > 0 && !c()) {
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                if (view != null) {
                    mgVar = view;
                } else {
                    mgVar = mgVar2;
                }
                egVar.z1(mgVar, mgVar2.f29024a.getText(), true);
            }
        } else {
            z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new vd(this, obj, photoEntry, z4, i10, i11, z10, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f33058a.M2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.xn xnVar = this.f33058a.L2;
        if (xnVar != null && xnVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.xn xnVar = this.f33058a.L2;
        if (xnVar != null && xnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        wf wfVar = chatActivityEnterView.W2;
        if (wfVar != null && !wfVar.isDismissed()) {
            chatActivityEnterView.W2.f30593e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 != null && chatActivityEnterView.K2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f20863id = stickerSet.f20870id;
            }
            yx0 yx0Var = new yx0(chatActivityEnterView.K2, p2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.S3);
            p2Var2.showDialog(yx0Var);
            if (z4) {
                yx0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            PhotoViewer.t1().K2(null, xnVar, xnVar.f43136ba);
            if (obj instanceof TLRPC.Document) {
                file = FileLoader.getInstance(chatActivityEnterView.N).getPathToAttach((TLRPC.Document) obj);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new vf(this, obj, obj2, photoEntry), chatActivityEnterView.L2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f33058a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        if (chatActivityEnterView.M2 == UserConfig.getInstance(chatActivityEnterView.N).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        MediaDataController.getInstance(chatActivityEnterView.N).toggleStickerSet(chatActivityEnterView.K2, stickerSetCovered, 0, chatActivityEnterView.L2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z4;
        int i11 = ChatActivityEnterView.f24568j5;
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            chatActivityEnterView.n1(true, true, false, z4);
        }
        if (chatActivityEnterView.f24685u3 && chatActivityEnterView.N1 == 2) {
            chatActivityEnterView.K();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        TextView textView = chatActivityEnterView.Q4;
        if (textView == null) {
            textView = chatActivityEnterView.B0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        EditText editText = chatActivityEnterView.Q4;
        if (editText == null) {
            editText = chatActivityEnterView.B0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.O2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e6) {
            FileLog.e(e6);
        } finally {
            chatActivityEnterView.O2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        mg mgVar = chatActivityEnterView.C0;
        if (!chatActivityEnterView.f24619h5) {
            wf wfVar = chatActivityEnterView.W2;
            if (wfVar != null) {
                wfVar.dismiss();
                chatActivityEnterView.W2 = null;
            }
            if (chatActivityEnterView.D0 > 0 && !c()) {
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    if (view == null) {
                        view = mgVar;
                    }
                    egVar.z1(view, mgVar.f29024a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f24690v3) {
                if (chatActivityEnterView.N1 != 0) {
                    chatActivityEnterView.m1(0, true);
                    chatActivityEnterView.R0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.R0.B();
                }
                chatActivityEnterView.n1(false, true, false, true);
            }
            chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z4, i10, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.O.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null && (activity = chatActivityEnterView.K2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.S3);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            xnVar.showDialog(alertDialog$Builder.f21166a);
        }
    }

    @Override
    public final void o(f51 f51Var) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 != null) {
            chatActivityEnterView.W2 = new wf(this, chatActivityEnterView.getContext(), p2Var2, f51Var, chatActivityEnterView.S3);
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.A(true);
            }
            p2Var2.showDialog(chatActivityEnterView.W2);
        }
    }

    @Override
    public final float p() {
        return this.f33058a.f24677t0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f33058a.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        p2Var.showDialog(new fg.n1(p2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        MediaDataController.getInstance(chatActivityEnterView.N).toggleStickerSet(chatActivityEnterView.K2, stickerSetCovered, 2, chatActivityEnterView.L2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z4;
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        chatActivityEnterView.V2.X();
        eg egVar = chatActivityEnterView.V2;
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        egVar.t2(z4);
        chatActivityEnterView.post(chatActivityEnterView.f24653o3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.xn xnVar = this.f33058a.L2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f33058a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
        B(view, obj, str, obj2, z4, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.xn xnVar = this.f33058a.L2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Q4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.B0;
        }
        AndroidUtilities.runOnUIThread(new mh.i(this, editTextBoldCursor, str, document, j10, z4));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f33058a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.n70 n70Var = new org.telegram.ui.n70(j10);
            n70Var.e0(chatActivityEnterView.Z1);
            xnVar.presentFragment(n70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f33058a.N1 != 0) {
            return true;
        }
        return false;
    }
}
