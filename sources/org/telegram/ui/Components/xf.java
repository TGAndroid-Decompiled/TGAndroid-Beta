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
public final class xf implements wx {
    public final ChatActivityEnterView f34670a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.f34670a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f34670a.f26190u3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10, MediaController.PhotoEntry photoEntry, boolean z11) {
        mg mgVar;
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        mg mgVar2 = chatActivityEnterView.B0;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && qnVar != null && gnVar.f38576f) {
            qnVar.Rb();
        } else if (c() && i9 == 0) {
            y4.M(chatActivityEnterView.J2, qnVar.a(), new org.telegram.ui.hq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.R3);
        } else if (chatActivityEnterView.C0 > 0 && !c()) {
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                if (view != null) {
                    mgVar = view;
                } else {
                    mgVar = mgVar2;
                }
                egVar.k1(mgVar, mgVar2.f30810a.getText(), true);
            }
        } else {
            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new vd(this, obj, photoEntry, z10, i9, i10, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f34670a.L2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.qn qnVar = this.f34670a.K2;
        if (qnVar != null && qnVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.qn qnVar = this.f34670a.K2;
        if (qnVar != null && qnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        wf wfVar = chatActivityEnterView.V2;
        if (wfVar != null && !wfVar.isDismissed()) {
            chatActivityEnterView.V2.f32619e.b(stickerSet, inputStickerSet);
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
                inputStickerSet.f22400id = stickerSet.f22407id;
            }
            cx0 cx0Var = new cx0(chatActivityEnterView.J2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.R3);
            o2Var2.showDialog(cx0Var);
            if (z10) {
                cx0Var.o0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            PhotoViewer.t1().K2(null, qnVar, qnVar.f41848aa);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new vf(this, obj, obj2, photoEntry), chatActivityEnterView.K2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f34670a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        if (chatActivityEnterView.L2 == UserConfig.getInstance(chatActivityEnterView.M).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 0, chatActivityEnterView.K2, false, false);
    }

    @Override
    public final void i(int i9) {
        boolean z10;
        int i10 = ChatActivityEnterView.f26074i5;
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        chatActivityEnterView.m1(i9, true);
        if (i9 != 0) {
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.n1(true, true, false, z10);
        }
        if (chatActivityEnterView.f26185t3 && chatActivityEnterView.M1 == 2) {
            chatActivityEnterView.K();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
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
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        mg mgVar = chatActivityEnterView.B0;
        if (!chatActivityEnterView.f26119g5) {
            wf wfVar = chatActivityEnterView.V2;
            if (wfVar != null) {
                wfVar.dismiss();
                chatActivityEnterView.V2 = null;
            }
            if (chatActivityEnterView.C0 > 0 && !c()) {
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    if (view == null) {
                        view = mgVar;
                    }
                    egVar.k1(view, mgVar.f30810a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f26190u3) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, true);
                    chatActivityEnterView.Q0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.Q0.A();
                }
                chatActivityEnterView.n1(false, true, false, true);
            }
            chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i9, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.N.getMessagesController().saveGif(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null && (activity = chatActivityEnterView.J2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.R3);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            qnVar.showDialog(alertDialog$Builder.f22702a);
        }
    }

    @Override
    public final void o(h41 h41Var) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.V2 = new wf(this, chatActivityEnterView.getContext(), o2Var2, h41Var, chatActivityEnterView.R3);
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                egVar.p(true);
            }
            o2Var2.showDialog(chatActivityEnterView.V2);
        }
    }

    @Override
    public final float p() {
        return this.f34670a.f26177s0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34670a.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new zf.x0(o2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 2, chatActivityEnterView.K2, false, false);
    }

    @Override
    public final void s(int i9) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        chatActivityEnterView.U2.G();
        eg egVar = chatActivityEnterView.U2;
        if (i9 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        egVar.T1(z10);
        chatActivityEnterView.post(chatActivityEnterView.f26153n3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.qn qnVar = this.f34670a.K2;
        if (qnVar != null) {
            qnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f34670a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
        B(view, obj, str, obj2, z10, i9, i10, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.qn qnVar = this.f34670a.K2;
        if (qnVar != null) {
            qnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.P4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.A0;
        }
        AndroidUtilities.runOnUIThread(new gh.i(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f34670a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.l0(false);
            }
            org.telegram.ui.z60 z60Var = new org.telegram.ui.z60(j10);
            z60Var.d0(chatActivityEnterView.Y1);
            qnVar.presentFragment(z60Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f34670a.M1 != 0) {
            return true;
        }
        return false;
    }
}
