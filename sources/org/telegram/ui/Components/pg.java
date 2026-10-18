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
    public final int f29294a;
    public final Object f29295b;

    public pg(Object obj, int i10) {
        this.f29294a = i10;
        this.f29295b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f29294a;
        Object obj = this.f29295b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f24022s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23976k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new sg.x0(xcVar.W(), 42, xcVar.f32369c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ei.x3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = r5.f29836q;
                ((r5) obj).v();
                return;
            case 5:
                n5 n5Var = (n5) obj;
                ArrayList arrayList = new ArrayList(n5Var.f28665c);
                n5Var.f28665c.clear();
                MessagesStorage.getInstance(n5Var.e).getStorageQueue().postRunnable(new k5(n5Var, arrayList, 0));
                n5Var.d = null;
                return;
            case 6:
                ((p5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).h();
                return;
            case 8:
                q6 q6Var = (q6) obj;
                CharSequence charSequence = q6Var.f29585f;
                if (charSequence != null) {
                    q6Var.c(charSequence, q6Var.h, true);
                    q6Var.f29585f = null;
                    q6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((j8) obj).f27447n.f27786n.setVisibility(8);
                return;
            case 10:
                ((p8) obj).f29235c.Y0();
                return;
            case 11:
                fa faVar = (fa) obj;
                faVar.f26201o = true;
                faVar.d.invalidate();
                return;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.f25900a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f26194g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f26194g = faVar2.f26193f;
                    faVar2.h = faVar2.f26195i;
                    faVar2.f26193f = bitmapArr;
                    faVar2.f26195i = canvasArr;
                    faVar2.f26197k = false;
                    ei.g6 g6Var = faVar2.d;
                    if (g6Var != null) {
                        g6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ja jaVar = ((pa) obj).f29268t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.f27494o = jaVar2.f27493n.f28910b;
                jaVar2.d();
                return;
            case 15:
                qc qcVar = ((jb) obj).f27497b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f29656u) {
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
                kd kdVar = (kd) obj;
                if (kdVar.f27856o1) {
                    kdVar.f27856o1 = false;
                    kdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f29933f;
                int i11 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView2.o1();
                return;
            case 20:
                ((ah) obj).f24597s = null;
                return;
            case 21:
                ((ji) obj).B0.D1.l();
                return;
            case 22:
                nk nkVar = (nk) ((androidx.mediarouter.app.f) obj).f3490b;
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
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((im) obj).f27265b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24080q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((fm) obj).f26275c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f28245b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                bn bnVar = (bn) obj;
                ti tiVar = bnVar.f28245b;
                if (bnVar.Q && (chatAttachAlertPhotoLayout = tiVar.f30593j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f24090c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                fo foVar = (fo) obj;
                foVar.f26306k1 = -1;
                foVar.f26304j1 = null;
                return;
            case 27:
                ((yo) obj).n();
                return;
            case 28:
                ((ap) obj).setVisibility(8);
                return;
            default:
                ((zp) obj).f32996b.a();
                return;
        }
    }
}
