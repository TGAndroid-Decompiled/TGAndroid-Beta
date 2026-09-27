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
    public final int f27368a;
    public final Object f27369b;

    public pg(Object obj, int i10) {
        this.f27368a = i10;
        this.f27369b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f27368a;
        Object obj = this.f27369b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22065s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22019k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.f30391c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f27582q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f26354c);
                m5Var.f26354c.clear();
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
                CharSequence charSequence = p6Var.f27290f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f27290f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f25041n.f25359n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f27039c.j1();
                return;
            case 11:
                fa faVar = (fa) obj;
                faVar.f24218o = true;
                faVar.d.invalidate();
                return;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.f23992a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.f24211g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.f24211g = faVar2.f24210f;
                    faVar2.h = faVar2.f24212i;
                    faVar2.f24210f = bitmapArr;
                    faVar2.f24212i = canvasArr;
                    faVar2.f24214k = false;
                    ci.r6 r6Var = faVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ja jaVar = ((pa) obj).f27342t;
                if (jaVar != null) {
                    jaVar.d();
                    return;
                }
                return;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.f25437o = jaVar2.f25436n.f27048b;
                jaVar2.d();
                return;
            case 15:
                qc qcVar = ((jb) obj).f25440b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.f27702u) {
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
                if (ldVar.f26020o1) {
                    ldVar.f26020o1 = false;
                    ldVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((sf) obj).f28233f;
                int i11 = ChatActivityEnterView.f21955n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((bh) obj).f23021s = null;
                return;
            case 21:
                ((ji) obj).B0.A1.l();
                return;
            case 22:
                qk qkVar = (qk) ((androidx.mediarouter.app.g) obj).f2720b;
                try {
                    File file = qkVar.O;
                    if (file == null) {
                        qkVar.O();
                    } else {
                        qkVar.N(file);
                    }
                    qkVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((zl) obj).f30946b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((wl) obj).f30042c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27104b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                sm smVar = (sm) obj;
                wi wiVar = smVar.f27104b;
                if (smVar.Q && (chatAttachAlertPhotoLayout = wiVar.f29974j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f22133c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                wn wnVar = (wn) obj;
                wnVar.f30097k1 = -1;
                wnVar.f30095j1 = null;
                return;
            case 27:
                ((qo) obj).n();
                return;
            case 28:
                ((so) obj).setVisibility(8);
                return;
            default:
                ((rp) obj).f28059b.a();
                return;
        }
    }
}
