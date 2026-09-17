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
public final class pg implements Runnable {
    public final int f29369a;
    public final Object f29370b;

    public pg(Object obj, int i10) {
        this.f29369a = i10;
        this.f29370b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f29369a;
        Object obj = this.f29370b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23766r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.V0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23722j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new sg.a1(ycVar.W(), 42, ycVar.f32884c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((di.f4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f29571q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f28384c);
                m5Var.f28384c.clear();
                MessagesStorage.getInstance(m5Var.f28385e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
                m5Var.d = null;
                return;
            case 6:
                ((o5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).f();
                return;
            case 8:
                q6 q6Var = (q6) obj;
                CharSequence charSequence = q6Var.f29600f;
                if (charSequence != null) {
                    q6Var.c(charSequence, q6Var.h, true);
                    q6Var.f29600f = null;
                    q6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((j8) obj).f27377n.f27730n.setVisibility(8);
                return;
            case 10:
                ((q8) obj).f29620c.l1();
                return;
            case 11:
                fa faVar = (fa) obj;
                faVar.f25994o = true;
                faVar.d.invalidate();
                return;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.f25634a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f25987g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f25987g = faVar2.f25986f;
                    faVar2.h = faVar2.f25988i;
                    faVar2.f25986f = bitmapArr;
                    faVar2.f25988i = canvasArr;
                    faVar2.f25990k = false;
                    di.r6 r6Var = faVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ja jaVar = ((pa) obj).f29342t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.f27420o = jaVar2.f27419n.f29014b;
                jaVar2.d();
                return;
            case 15:
                qc qcVar = ((jb) obj).f27425b;
                ub ubVar = qcVar.f29676e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f29691u) {
                    qcVar.i(true);
                    return;
                }
                return;
            case 16:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    jdVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                ld ldVar = (ld) obj;
                if (ldVar.f28153o1) {
                    ldVar.f28153o1 = false;
                    ldVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((sf) obj).f30275f;
                int i11 = ChatActivityEnterView.f23662m5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((bh) obj).f24699s = null;
                return;
            case 21:
                ((li) obj).B0.A1.l();
                return;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).f1749b;
                try {
                    File file = okVar.O;
                    if (file == null) {
                        okVar.O();
                    } else {
                        okVar.N(file);
                    }
                    okVar.V();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).f32605b;
                boolean z10 = ChatAttachAlertPhotoLayout.f23832q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).f30920c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f28754b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.f28754b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.f31292j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f23842c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                tn tnVar = (tn) obj;
                tnVar.f30646k1 = -1;
                tnVar.f30644j1 = null;
                return;
            case 27:
                ((no) obj).n();
                return;
            case 28:
                ((po) obj).setVisibility(8);
                return;
            default:
                ((op) obj).f29156b.a();
                return;
        }
    }
}
