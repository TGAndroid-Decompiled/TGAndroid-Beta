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
public final class eg implements sy {
    public final ChatActivityEnterView f26031a;

    public eg(ChatActivityEnterView chatActivityEnterView) {
        this.f26031a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f26031a.f24201z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ug ugVar;
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        ug ugVar2 = chatActivityEnterView.F0;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        org.telegram.ui.in inVar = chatActivityEnterView.V2;
        if (inVar != null && snVar != null && inVar.f38335f) {
            snVar.Xb();
        } else if (c() && i10 == 0) {
            d5.L(chatActivityEnterView.O2, snVar.a(), new org.telegram.ui.jq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            mg mgVar = chatActivityEnterView.Z2;
            if (mgVar != null) {
                if (view != null) {
                    ugVar = view;
                } else {
                    ugVar = ugVar2;
                }
                mgVar.o1(ugVar, ugVar2.f31117a.getText(), true);
            }
        } else {
            d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new de(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f26031a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.sn snVar = this.f26031a.P2;
        if (snVar != null && snVar.G6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.sn snVar = this.f26031a.P2;
        if (snVar != null && snVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        dg dgVar = chatActivityEnterView.f24055a3;
        if (dgVar != null && !dgVar.isDismissed()) {
            chatActivityEnterView.f24055a3.d.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null && chatActivityEnterView.O2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f20364id = stickerSet.f20371id;
            }
            sy0 sy0Var = new sy0(chatActivityEnterView.O2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            o2Var2.showDialog(sy0Var);
            if (z10) {
                sy0Var.r0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null) {
            PhotoViewer.u1().M2(null, snVar, snVar.f41651qa);
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
                PhotoViewer.u1().i2(arrayList, 0, 12, false, new cg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f26031a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        if (chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f24051r5;
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
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
            chatActivityEnterView.I();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
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
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
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
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        ug ugVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.p5) {
            dg dgVar = chatActivityEnterView.f24055a3;
            if (dgVar != null) {
                dgVar.dismiss();
                chatActivityEnterView.f24055a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    if (view == null) {
                        view = ugVar;
                    }
                    mgVar.o1(view, ugVar.f31117a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f24201z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.j1(0, true);
                    chatActivityEnterView.U0.t(MessageObject.getStickerSetId(document), true);
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
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            snVar.showDialog(alertDialog$Builder.f20679a);
        }
    }

    @Override
    public final void o(h61 h61Var) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.f24055a3 = new dg(this, chatActivityEnterView.getContext(), o2Var2, h61Var, chatActivityEnterView.W3);
            mg mgVar = chatActivityEnterView.Z2;
            if (mgVar != null) {
                mgVar.C(true);
            }
            o2Var2.showDialog(chatActivityEnterView.f24055a3);
        }
    }

    @Override
    public final float p() {
        return this.f26031a.f24182w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f26031a.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new sg.y0(o2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        chatActivityEnterView.Z2.Y();
        mg mgVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        mgVar.Z1(z10);
        chatActivityEnterView.post(chatActivityEnterView.f24164s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.sn snVar = this.f26031a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f26031a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.sn snVar = this.f26031a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Y4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.m(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f26031a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.j0(false);
            }
            org.telegram.ui.e70 e70Var = new org.telegram.ui.e70(j10);
            e70Var.e0(chatActivityEnterView.f24074d2);
            snVar.presentFragment(e70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f26031a.R1 != 0) {
            return true;
        }
        return false;
    }
}
