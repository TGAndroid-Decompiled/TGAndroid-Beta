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
    public final int f29548a;
    public final Object f29549b;

    public pg(Object obj, int i10) {
        this.f29548a = i10;
        this.f29549b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f29548a;
        Object obj = this.f29549b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).f30482b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f24164s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24115k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new sg.y0(xcVar.W(), 42, xcVar.f32517c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ei.x3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                e5 e5Var = (e5) obj;
                e5Var.requestFocus();
                AndroidUtilities.showKeyboard(e5Var);
                return;
            case 5:
                SparseArray sparseArray = r5.f30085r;
                ((r5) obj).v();
                return;
            case 6:
                n5 n5Var = (n5) obj;
                ArrayList arrayList = new ArrayList(n5Var.f28833c);
                n5Var.f28833c.clear();
                MessagesStorage.getInstance(n5Var.e).getStorageQueue().postRunnable(new k5(n5Var, arrayList, 0));
                n5Var.d = null;
                return;
            case 7:
                ((p5) obj).invalidate();
                return;
            case 8:
                ((o1.k) obj).h();
                return;
            case 9:
                q6 q6Var = (q6) obj;
                CharSequence charSequence = q6Var.f29775f;
                if (charSequence != null) {
                    q6Var.c(charSequence, q6Var.h, true);
                    q6Var.f29775f = null;
                    q6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((j8) obj).f27548n.f27929n.setVisibility(8);
                return;
            case 11:
                ((p8) obj).f29468c.Y0();
                return;
            case 12:
                fa faVar = (fa) obj;
                faVar.f26253o = true;
                faVar.d.invalidate();
                return;
            case 13:
                ea eaVar = (ea) obj;
                if (!eaVar.f25941a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f26246g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f26246g = faVar2.f26245f;
                    faVar2.h = faVar2.f26247i;
                    faVar2.f26245f = bitmapArr;
                    faVar2.f26247i = canvasArr;
                    faVar2.f26249k = false;
                    ei.g6 g6Var = faVar2.d;
                    if (g6Var != null) {
                        g6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ja jaVar = ((pa) obj).f29494t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 15:
                ja jaVar2 = (ja) obj;
                jaVar2.f27645o = jaVar2.f27644n.f29125b;
                jaVar2.d();
                return;
            case 16:
                qc qcVar = ((jb) obj).f27651b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f29843u) {
                    qcVar.i(true);
                    return;
                }
                return;
            case 17:
                id idVar = (id) obj;
                idVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    idVar.invalidateSelf();
                    return;
                }
                return;
            case 18:
                kd kdVar = (kd) obj;
                if (kdVar.f28018o1) {
                    kdVar.f28018o1 = false;
                    kdVar.invalidate();
                    return;
                }
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f30161f;
                int i11 = ChatActivityEnterView.f24050r5;
                chatActivityEnterView2.n1();
                return;
            case 21:
                ((ah) obj).f24717s = null;
                return;
            case 22:
                ((ji) obj).B0.D1.l();
                return;
            case 23:
                nk nkVar = (nk) ((androidx.mediarouter.app.f) obj).f3493b;
                try {
                    File file = nkVar.O;
                    if (file == null) {
                        nkVar.R();
                    } else {
                        nkVar.Q(file);
                    }
                    nkVar.Y();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((im) obj).f27367b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24222q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((fm) obj).f26376c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f28366b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                bn bnVar = (bn) obj;
                ti tiVar = bnVar.f28366b;
                if (bnVar.Q && (chatAttachAlertPhotoLayout = tiVar.f30742j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f24232c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                fo foVar = (fo) obj;
                foVar.l1 = -1;
                foVar.f26406k1 = null;
                return;
            case 28:
                ((yo) obj).o();
                return;
            default:
                ((ap) obj).setVisibility(8);
                return;
        }
    }
}
