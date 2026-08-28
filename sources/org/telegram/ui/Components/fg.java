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
    public final int f28414a;
    public final Object f28415b;

    public fg(Object obj, int i9) {
        this.f28414a = i9;
        this.f28415b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i9 = this.f28414a;
        Object obj = this.f28415b;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f26154n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.L0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26109f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                oc ocVar = (oc) obj;
                new zf.x0(ocVar.W(), 42, ocVar.f31357c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((kh.x3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = k5.f29937q;
                ((k5) obj).v();
                return;
            case 5:
                g5 g5Var = (g5) obj;
                ArrayList arrayList = new ArrayList(g5Var.f28653c);
                g5Var.f28653c.clear();
                MessagesStorage.getInstance(g5Var.f28654e).getStorageQueue().postRunnable(new d5(g5Var, arrayList, 0));
                g5Var.d = null;
                return;
            case 6:
                ((i5) obj).invalidate();
                return;
            case 7:
                ((o1.j) obj).f();
                return;
            case 8:
                j6 j6Var = (j6) obj;
                CharSequence charSequence = j6Var.f29649f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f29649f = null;
                    j6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((b8) obj).f27070n.f27394n.setVisibility(8);
                return;
            case 10:
                ((h8) obj).f28990c.h1();
                return;
            case 11:
                x9 x9Var = (x9) obj;
                x9Var.f34614o = true;
                x9Var.d.invalidate();
                return;
            case 12:
                w9 w9Var = (w9) obj;
                if (!w9Var.f34152a) {
                    x9 x9Var2 = w9Var.d;
                    Bitmap[] bitmapArr = x9Var2.f34607g;
                    Canvas[] canvasArr = x9Var2.h;
                    x9Var2.f34607g = x9Var2.f34606f;
                    x9Var2.h = x9Var2.f34608i;
                    x9Var2.f34606f = bitmapArr;
                    x9Var2.f34608i = canvasArr;
                    x9Var2.f34610k = false;
                    kh.h6 h6Var = x9Var2.d;
                    if (h6Var != null) {
                        h6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ba baVar = ((ha) obj).f29021t;
                if (baVar != null) {
                    baVar.d();
                    return;
                }
                return;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.f27132o = baVar2.f27131n.f28712b;
                baVar2.d();
                return;
            case 15:
                gc gcVar = ((ab) obj).f26745b;
                lb lbVar = gcVar.f28733e;
                lbVar.transitionRunningEnter = false;
                lbVar.onEnterTransitionEnd();
                if (gcVar.f28748u) {
                    gcVar.i(true);
                    return;
                }
                return;
            case 16:
                yc ycVar = (yc) obj;
                ycVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    ycVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                ad adVar = (ad) obj;
                if (adVar.f26770k1) {
                    adVar.f26770k1 = false;
                    adVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f29068f;
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((qg) obj).f31938s = null;
                return;
            case 21:
                ((ai) obj).f26820x0.f30168w1.l();
                return;
            case 22:
                fk fkVar = (fk) ((androidx.mediarouter.app.h) obj).f1221b;
                try {
                    File file = fkVar.K;
                    if (file == null) {
                        fkVar.N();
                    } else {
                        fkVar.M(file);
                    }
                    fkVar.U();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ol) obj).f31408b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
                chatAttachAlertPhotoLayout2.o0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ll) obj).f30469c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.f27493b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                hm hmVar = (hm) obj;
                ki kiVar = hmVar.f27493b;
                if (hmVar.M && (chatAttachAlertPhotoLayout = kiVar.f30114f0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                jn jnVar = (jn) obj;
                jnVar.f29777g1 = -1;
                jnVar.f29775f1 = null;
                return;
            case 27:
                ((eo) obj).p();
                return;
            case 28:
                ((go) obj).setVisibility(8);
                return;
            default:
                ((fp) obj).f28538b.a();
                return;
        }
    }
}
