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
public final class fg implements ky {
    public final ChatActivityEnterView f23908a;

    public fg(ChatActivityEnterView chatActivityEnterView) {
        this.f23908a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f23908a.y3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ug ugVar;
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        ug ugVar2 = chatActivityEnterView.F0;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        org.telegram.ui.rn rnVar = chatActivityEnterView.U2;
        if (rnVar != null && boVar != null && rnVar.f37274f) {
            boVar.Rb();
        } else if (c() && i10 == 0) {
            c5.M(chatActivityEnterView.N2, boVar.a(), new org.telegram.ui.vq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.V3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar != null) {
                if (view != null) {
                    ugVar = view;
                } else {
                    ugVar = ugVar2;
                }
                mgVar.t1(ugVar, ugVar2.f28381a.getText(), true);
            }
        } else {
            c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new de(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f23908a.P2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.bo boVar = this.f23908a.O2;
        if (boVar != null && boVar.D6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.bo boVar = this.f23908a.O2;
        if (boVar != null && boVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        eg egVar = chatActivityEnterView.Z2;
        if (egVar != null && !egVar.isDismissed()) {
            chatActivityEnterView.Z2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.O2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null && chatActivityEnterView.N2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f18141id = stickerSet.f18148id;
            }
            wx0 wx0Var = new wx0(chatActivityEnterView.N2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.V3);
            o2Var2.showDialog(wx0Var);
            if (z10) {
                wx0Var.p0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar != null) {
            PhotoViewer.t1().K2(null, boVar, boVar.f32275ea);
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
                PhotoViewer.t1().f2(arrayList, 0, 12, false, new dg(this, obj, obj2, photoEntry), chatActivityEnterView.O2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f23908a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        if (chatActivityEnterView.P2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 0, chatActivityEnterView.O2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f21741m5;
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        chatActivityEnterView.l1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.m1(true, true, false, z10);
        }
        if (chatActivityEnterView.f21876x3 && chatActivityEnterView.Q1 == 2) {
            chatActivityEnterView.L();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        TextView textView = chatActivityEnterView.T4;
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
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        EditText editText = chatActivityEnterView.T4;
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
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        ug ugVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.f21809k5) {
            eg egVar = chatActivityEnterView.Z2;
            if (egVar != null) {
                egVar.dismiss();
                chatActivityEnterView.Z2 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    if (view == null) {
                        view = ugVar;
                    }
                    mgVar.t1(view, ugVar.f28381a.getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.y3) {
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.l1(0, true);
                    chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.U0.A();
                }
                chatActivityEnterView.m1(false, true, false, true);
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
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar != null && (activity = chatActivityEnterView.N2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.V3);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            boVar.showDialog(alertDialog$Builder.f18446a);
        }
    }

    @Override
    public final void o(f51 f51Var) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.O2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.Z2 = new eg(this, chatActivityEnterView.getContext(), o2Var2, f51Var, chatActivityEnterView.V3);
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar != null) {
                mgVar.B(true);
            }
            o2Var2.showDialog(chatActivityEnterView.Z2);
        }
    }

    @Override
    public final float p() {
        return this.f23908a.f21867w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f23908a.O2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new rg.x0(o2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 2, chatActivityEnterView.O2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        chatActivityEnterView.Y2.W();
        mg mgVar = chatActivityEnterView.Y2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        mgVar.j2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f21843r3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.bo boVar = this.f23908a.O2;
        if (boVar != null) {
            boVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f23908a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.bo boVar = this.f23908a.O2;
        if (boVar != null) {
            boVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.T4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f23908a;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.v70 v70Var = new org.telegram.ui.v70(j3);
            v70Var.e0(chatActivityEnterView.f21758c2);
            boVar.presentFragment(v70Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f23908a.Q1 != 0) {
            return true;
        }
        return false;
    }
}
