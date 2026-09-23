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
public final class og implements Runnable {
    public final int f26732a;
    public final Object f26733b;

    public og(Object obj, int i10) {
        this.f26732a = i10;
        this.f26733b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f26732a;
        Object obj = this.f26733b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f21805r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f21760j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.f29981c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f27217q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f26097c);
                m5Var.f26097c.clear();
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
                CharSequence charSequence = p6Var.f26941f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f26941f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f24898n.f25177n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f26680c.j1();
                return;
            case 11:
                fa faVar = (fa) obj;
                faVar.f23919o = true;
                faVar.d.invalidate();
                return;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.f23635a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f23912g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f23912g = faVar2.f23911f;
                    faVar2.h = faVar2.f23913i;
                    faVar2.f23911f = bitmapArr;
                    faVar2.f23913i = canvasArr;
                    faVar2.f23915k = false;
                    ci.r6 r6Var = faVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ja jaVar = ((pa) obj).f26991t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.f25239o = jaVar2.f25238n.f26690b;
                jaVar2.d();
                return;
            case 15:
                qc qcVar = ((jb) obj).f25244b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f27317u) {
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
                ld ldVar = (ld) obj;
                if (ldVar.f25876o1) {
                    ldVar.f25876o1 = false;
                    ldVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f27615f;
                int i11 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView2.r1();
                return;
            case 20:
                ((ah) obj).f22447s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((yl) obj).f30309b;
                boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((vl) obj).f28768c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26744b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                rm rmVar = (rm) obj;
                wi wiVar = rmVar.f26744b;
                if (rmVar.Q && (chatAttachAlertPhotoLayout = wiVar.f29677j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f21879c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                vn vnVar = (vn) obj;
                vnVar.f28796k1 = -1;
                vnVar.f28794j1 = null;
                return;
            case 27:
                ((po) obj).n();
                return;
            case 28:
                ((ro) obj).setVisibility(8);
                return;
            default:
                ((qp) obj).f27420b.a();
                return;
        }
    }
}
