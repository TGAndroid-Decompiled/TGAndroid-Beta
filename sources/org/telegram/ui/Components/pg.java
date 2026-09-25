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
    public final int f27337a;
    public final Object f27338b;

    public pg(Object obj, int i10) {
        this.f27337a = i10;
        this.f27338b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f27337a;
        Object obj = this.f27338b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22063s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22017k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.f30316c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f27492q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f26363c);
                m5Var.f26363c.clear();
                MessagesStorage.getInstance(m5Var.e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
                m5Var.d = null;
                return;
            case 6:
                ((o5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).f();
                return;
            case 8:
                p6 p6Var = (p6) obj;
                CharSequence charSequence = p6Var.f27276f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f27276f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f24970n.f25317n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f26961c.j1();
                return;
            case 11:
                fa faVar = (fa) obj;
                faVar.f24115o = true;
                faVar.d.invalidate();
                return;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.f23895a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f24108g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f24108g = faVar2.f24107f;
                    faVar2.h = faVar2.f24109i;
                    faVar2.f24107f = bitmapArr;
                    faVar2.f24109i = canvasArr;
                    faVar2.f24111k = false;
                    ci.r6 r6Var = faVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ja jaVar = ((pa) obj).f27312t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.f25377o = jaVar2.f25376n.f27018b;
                jaVar2.d();
                return;
            case 15:
                qc qcVar = ((jb) obj).f25381b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f27589u) {
                    qcVar.i(true);
                    return;
                }
                return;
            case 16:
                id idVar = (id) obj;
                idVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    idVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                md mdVar = (md) obj;
                if (mdVar.f26471o1) {
                    mdVar.f26471o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((sf) obj).f28240f;
                int i11 = ChatActivityEnterView.f21953n5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((bh) obj).f23005s = null;
                return;
            case 21:
                ((mi) obj).B0.A1.l();
                return;
            case 22:
                pk pkVar = (pk) ((androidx.mediarouter.app.g) obj).f2718b;
                try {
                    File file = pkVar.O;
                    if (file == null) {
                        pkVar.O();
                    } else {
                        pkVar.N(file);
                    }
                    pkVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((yl) obj).f30639b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22121q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((vl) obj).f29179c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27088b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                rm rmVar = (rm) obj;
                wi wiVar = rmVar.f27088b;
                if (rmVar.Q && (chatAttachAlertPhotoLayout = wiVar.f30018j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f22131c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                vn vnVar = (vn) obj;
                vnVar.f29206k1 = -1;
                vnVar.f29204j1 = null;
                return;
            case 27:
                ((po) obj).n();
                return;
            case 28:
                ((ro) obj).setVisibility(8);
                return;
            default:
                ((qp) obj).f27730b.a();
                return;
        }
    }
}
