package org.telegram.ui.Components;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fg implements Runnable {
    public final int f24872a;
    public final Object f24873b;

    public fg(Object obj, int i10) {
        this.f24872a = i10;
        this.f24873b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f24872a;
        Object obj = this.f24873b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).S;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22814o4) {
                    chatActivityEnterView.F3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                chatActivityEnterView.V2.b1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22769g1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) obj;
                new eg.o1(qcVar.W(), 42, qcVar.f28114c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ph.f3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = l5.f26556q;
                ((l5) obj).v();
                return;
            case 5:
                h5 h5Var = (h5) obj;
                ArrayList arrayList = new ArrayList(h5Var.f25329c);
                h5Var.f25329c.clear();
                MessagesStorage.getInstance(h5Var.e).getStorageQueue().postRunnable(new e5(h5Var, arrayList, 0));
                h5Var.d = null;
                return;
            case 6:
                ((j5) obj).invalidate();
                return;
            case 7:
                ((o1.j) obj).f();
                return;
            case 8:
                k6 k6Var = (k6) obj;
                CharSequence charSequence = k6Var.f26168f;
                if (charSequence != null) {
                    k6Var.c(charSequence, k6Var.h, true);
                    k6Var.f26168f = null;
                    k6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((b8) obj).f23591n.f23900n.setVisibility(8);
                return;
            case 10:
                ((h8) obj).f25348c.i1();
                return;
            case 11:
                x9 x9Var = (x9) obj;
                x9Var.f30626o = true;
                x9Var.d.invalidate();
                return;
            case 12:
                w9 w9Var = (w9) obj;
                if (!w9Var.f30277a) {
                    x9 x9Var2 = w9Var.d;
                    Bitmap[] bitmapArr = x9Var2.f30619g;
                    Canvas[] canvasArr = x9Var2.h;
                    x9Var2.f30619g = x9Var2.f30618f;
                    x9Var2.h = x9Var2.f30620i;
                    x9Var2.f30618f = bitmapArr;
                    x9Var2.f30620i = canvasArr;
                    x9Var2.f30622k = false;
                    eg.i0 i0Var = x9Var2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ba baVar = ((ha) obj).f25383t;
                if (baVar != null) {
                    baVar.d();
                    return;
                }
                return;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.f23618o = baVar2.f23617n.f25091b;
                baVar2.d();
                return;
            case 15:
                ic icVar = ((ab) obj).f23338b;
                nb nbVar = icVar.e;
                nbVar.transitionRunningEnter = false;
                nbVar.onEnterTransitionEnd();
                if (icVar.f25683u) {
                    icVar.i(true);
                    return;
                }
                return;
            case 16:
                zc zcVar = (zc) obj;
                zcVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    zcVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                bd bdVar = (bd) obj;
                if (bdVar.l1) {
                    bdVar.l1 = false;
                    bdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f25408f;
                int i11 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((qg) obj).f28130s = null;
                return;
            case 21:
                ((bi) obj).f23679y0.f26757x1.l();
                return;
            case 22:
                hk hkVar = (hk) ((androidx.mediarouter.app.h) obj).f1107b;
                try {
                    File file = hkVar.L;
                    if (file == null) {
                        hkVar.O();
                    } else {
                        hkVar.N(file);
                    }
                    hkVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ul) obj).f29250b;
                boolean z4 = ChatAttachAlertPhotoLayout.f22894n1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ql) obj).f28151c;
                if (chatAttachAlertPhotoLayout3.M != null && !chatAttachAlertPhotoLayout3.f24278b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.M.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                om omVar = (om) obj;
                li liVar = omVar.f24278b;
                if (omVar.N && (chatAttachAlertPhotoLayout = liVar.f26702g0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Z0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                qn qnVar = (qn) obj;
                qnVar.f28175h1 = -1;
                qnVar.f28173g1 = null;
                return;
            case 27:
                ((ko) obj).r();
                return;
            case 28:
                ((mo) obj).setVisibility(8);
                return;
            default:
                ((np) obj).f27333b.a();
                return;
        }
    }
}
