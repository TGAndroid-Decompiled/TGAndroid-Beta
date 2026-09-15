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
    public final int f26450a;
    public final Object f26451b;

    public ng(Object obj, int i10) {
        this.f26450a = i10;
        this.f26451b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f26450a;
        Object obj = this.f26451b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f21834r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f21790j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                vc vcVar = (vc) obj;
                new rg.x0(vcVar.W(), 42, vcVar.f28690c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = o5.f26679q;
                ((o5) obj).v();
                return;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.f25547c);
                k5Var.f25547c.clear();
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
                CharSequence charSequence = n6Var.f26331f;
                if (charSequence != null) {
                    n6Var.c(charSequence, n6Var.h, true);
                    n6Var.f26331f = null;
                    n6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((g8) obj).f24248n.f24566n.setVisibility(8);
                return;
            case 10:
                ((m8) obj).f26117c.j1();
                return;
            case 11:
                da daVar = (da) obj;
                daVar.f23269o = true;
                daVar.d.invalidate();
                return;
            case 12:
                ca caVar = (ca) obj;
                if (!caVar.f23038a) {
                    da daVar2 = caVar.d;
                    Bitmap[] bitmapArr = daVar2.f23262g;
                    Canvas[] canvasArr = daVar2.h;
                    daVar2.f23262g = daVar2.f23261f;
                    daVar2.h = daVar2.f23263i;
                    daVar2.f23261f = bitmapArr;
                    daVar2.f23263i = canvasArr;
                    daVar2.f23265k = false;
                    ci.s6 s6Var = daVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ha haVar = ((na) obj).f26420t;
                if (haVar != null) {
                    haVar.d();
                    return;
                }
                return;
            case 14:
                ha haVar2 = (ha) obj;
                haVar2.f24653o = haVar2.f24652n.f26132b;
                haVar2.d();
                return;
            case 15:
                oc ocVar = ((hb) obj).f24657b;
                sb sbVar = ocVar.e;
                sbVar.transitionRunningEnter = false;
                sbVar.onEnterTransitionEnd();
                if (ocVar.f26765u) {
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
                if (jdVar.f25298o1) {
                    jdVar.f25298o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((qf) obj).f27321f;
                int i11 = ChatActivityEnterView.f21731m5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((zg) obj).f30590s = null;
                return;
            case 21:
                ((li) obj).B0.A1.l();
                return;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).f2721b;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).f29997b;
                boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).f28426c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26462b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.f26462b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.f28762j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f21908c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                un unVar = (un) obj;
                unVar.f28454k1 = -1;
                unVar.f28452j1 = null;
                return;
            case 27:
                ((oo) obj).n();
                return;
            case 28:
                ((qo) obj).setVisibility(8);
                return;
            default:
                ((pp) obj).f27114b.a();
                return;
        }
    }
}
