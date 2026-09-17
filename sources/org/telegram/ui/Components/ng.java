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
public final class ng implements Runnable {
    public final int f26452a;
    public final Object f26453b;

    public ng(Object obj, int i10) {
        this.f26452a = i10;
        this.f26453b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f26452a;
        Object obj = this.f26453b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f21844r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f21800j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                vc vcVar = (vc) obj;
                new rg.x0(vcVar.W(), 42, vcVar.f28683c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = o5.f26623q;
                ((o5) obj).v();
                return;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.f25564c);
                k5Var.f25564c.clear();
                MessagesStorage.getInstance(k5Var.e).getStorageQueue().postRunnable(new h5(k5Var, arrayList, 0));
                k5Var.d = null;
                return;
            case 6:
                ((m5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).f();
                return;
            case 8:
                n6 n6Var = (n6) obj;
                CharSequence charSequence = n6Var.f26344f;
                if (charSequence != null) {
                    n6Var.c(charSequence, n6Var.h, true);
                    n6Var.f26344f = null;
                    n6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((g8) obj).f24111n.f24558n.setVisibility(8);
                return;
            case 10:
                ((m8) obj).f26098c.j1();
                return;
            case 11:
                da daVar = (da) obj;
                daVar.f23296o = true;
                daVar.d.invalidate();
                return;
            case 12:
                ca caVar = (ca) obj;
                if (!caVar.f22988a) {
                    da daVar2 = caVar.d;
                    Bitmap[] bitmapArr = daVar2.f23289g;
                    Canvas[] canvasArr = daVar2.h;
                    daVar2.f23289g = daVar2.f23288f;
                    daVar2.h = daVar2.f23290i;
                    daVar2.f23288f = bitmapArr;
                    daVar2.f23290i = canvasArr;
                    daVar2.f23292k = false;
                    ci.s6 s6Var = daVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ha haVar = ((na) obj).f26422t;
                if (haVar != null) {
                    haVar.d();
                    return;
                }
                return;
            case 14:
                ha haVar2 = (ha) obj;
                haVar2.f24617o = haVar2.f24616n.f26117b;
                haVar2.d();
                return;
            case 15:
                oc ocVar = ((hb) obj).f24621b;
                sb sbVar = ocVar.e;
                sbVar.transitionRunningEnter = false;
                sbVar.onEnterTransitionEnd();
                if (ocVar.f26713u) {
                    ocVar.i(true);
                    return;
                }
                return;
            case 16:
                gd gdVar = (gd) obj;
                gdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    gdVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                jd jdVar = (jd) obj;
                if (jdVar.f25220o1) {
                    jdVar.f25220o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((qf) obj).f27277f;
                int i11 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((zg) obj).f30513s = null;
                return;
            case 21:
                ((li) obj).B0.A1.l();
                return;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).f2726b;
                try {
                    File file = okVar.O;
                    if (file == null) {
                        okVar.O();
                    } else {
                        okVar.N(file);
                    }
                    okVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).f29930b;
                boolean z10 = ChatAttachAlertPhotoLayout.f21908q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).f28404c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26460b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.f26460b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.f28754j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f21918c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                un unVar = (un) obj;
                unVar.f28432k1 = -1;
                unVar.f28430j1 = null;
                return;
            case 27:
                ((oo) obj).n();
                return;
            case 28:
                ((qo) obj).setVisibility(8);
                return;
            default:
                ((pp) obj).f27102b.a();
                return;
        }
    }
}
