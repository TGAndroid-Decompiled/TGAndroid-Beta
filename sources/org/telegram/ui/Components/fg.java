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
    public final int f24880a;
    public final Object f24881b;

    public fg(Object obj, int i10) {
        this.f24880a = i10;
        this.f24881b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f24880a;
        Object obj = this.f24881b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).S;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22787o4) {
                    chatActivityEnterView.F3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                chatActivityEnterView.V2.f1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22742g1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) obj;
                new eg.o1(qcVar.W(), 42, qcVar.f28142c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ph.f3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = l5.f26574q;
                ((l5) obj).v();
                return;
            case 5:
                h5 h5Var = (h5) obj;
                ArrayList arrayList = new ArrayList(h5Var.f25316c);
                h5Var.f25316c.clear();
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
                CharSequence charSequence = k6Var.f26172f;
                if (charSequence != null) {
                    k6Var.c(charSequence, k6Var.h, true);
                    k6Var.f26172f = null;
                    k6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((b8) obj).f23578n.f23855n.setVisibility(8);
                return;
            case 10:
                ((h8) obj).f25335c.i1();
                return;
            case 11:
                x9 x9Var = (x9) obj;
                x9Var.f30556o = true;
                x9Var.d.invalidate();
                return;
            case 12:
                w9 w9Var = (w9) obj;
                if (!w9Var.f30185a) {
                    x9 x9Var2 = w9Var.d;
                    Bitmap[] bitmapArr = x9Var2.f30549g;
                    Canvas[] canvasArr = x9Var2.h;
                    x9Var2.f30549g = x9Var2.f30548f;
                    x9Var2.h = x9Var2.f30550i;
                    x9Var2.f30548f = bitmapArr;
                    x9Var2.f30550i = canvasArr;
                    x9Var2.f30552k = false;
                    eg.i0 i0Var = x9Var2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ba baVar = ((ha) obj).f25368t;
                if (baVar != null) {
                    baVar.d();
                    return;
                }
                return;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.f23604o = baVar2.f23603n.f25109b;
                baVar2.d();
                return;
            case 15:
                ic icVar = ((ab) obj).f23355b;
                nb nbVar = icVar.e;
                nbVar.transitionRunningEnter = false;
                nbVar.onEnterTransitionEnd();
                if (icVar.f25682u) {
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
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f25396f;
                int i11 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((qg) obj).f28158s = null;
                return;
            case 21:
                ((bi) obj).f23697y0.f26753x1.l();
                return;
            case 22:
                hk hkVar = (hk) ((androidx.mediarouter.app.h) obj).f1118b;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((tl) obj).f28995b;
                boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((pl) obj).f27923c;
                if (chatAttachAlertPhotoLayout3.M != null && !chatAttachAlertPhotoLayout3.f24282b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.M.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                nm nmVar = (nm) obj;
                li liVar = nmVar.f24282b;
                if (nmVar.N && (chatAttachAlertPhotoLayout = liVar.f26698g0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Z0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                pn pnVar = (pn) obj;
                pnVar.f27947h1 = -1;
                pnVar.f27945g1 = null;
                return;
            case 27:
                ((jo) obj).k();
                return;
            case 28:
                ((lo) obj).setVisibility(8);
                return;
            default:
                ((mp) obj).f27107b.a();
                return;
        }
    }
}
