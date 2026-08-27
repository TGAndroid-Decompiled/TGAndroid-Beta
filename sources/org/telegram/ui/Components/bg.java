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

public final class bg implements Runnable {

    public final int f27090a;

    public final Object f27091b;

    public bg(Object obj, int i10) {
        this.f27090a = i10;
        this.f27091b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f27090a;
        int i11 = 0;
        Object obj = this.f27091b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((eg) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f26150n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.N0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26105f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                break;
            case 1:
                mc mcVar = (mc) obj;
                new ag.g2(mcVar.W(), 42, mcVar.f30645c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((lh.w3) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = k5.f29947q;
                ((k5) obj).v();
                break;
            case 5:
                g5 g5Var = (g5) obj;
                ArrayList arrayList = new ArrayList(g5Var.f28533c);
                g5Var.f28533c.clear();
                MessagesStorage.getInstance(g5Var.f28534e).getStorageQueue().postRunnable(new d5(g5Var, arrayList, i11));
                g5Var.d = null;
                break;
            case 6:
                ((i5) obj).invalidate();
                break;
            case 7:
                ((o1.j) obj).f();
                break;
            case 8:
                j6 j6Var = (j6) obj;
                CharSequence charSequence = j6Var.f29634f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f29634f = null;
                    j6Var.h = false;
                }
                break;
            case 9:
                ((a8) obj).f26657n.f27026n.setVisibility(8);
                break;
            case 10:
                ((g8) obj).f28546c.j1();
                break;
            case 11:
                v9 v9Var = (v9) obj;
                v9Var.f33326o = true;
                v9Var.d.invalidate();
                break;
            case 12:
                u9 u9Var = (u9) obj;
                if (!u9Var.f33019a) {
                    v9 v9Var2 = u9Var.d;
                    Bitmap[] bitmapArr = v9Var2.f33319g;
                    Canvas[] canvasArr = v9Var2.h;
                    v9Var2.f33319g = v9Var2.f33318f;
                    v9Var2.h = v9Var2.f33320i;
                    v9Var2.f33318f = bitmapArr;
                    v9Var2.f33320i = canvasArr;
                    v9Var2.f33322k = false;
                    ag.t0 t0Var = v9Var2.d;
                    if (t0Var != null) {
                        t0Var.invalidate();
                    }
                    break;
                }
                break;
            case 13:
                z9 z9Var = ((fa) obj).f28335t;
                if (z9Var != null) {
                    z9Var.d();
                }
                break;
            case 14:
                z9 z9Var2 = (z9) obj;
                z9Var2.f35214o = z9Var2.f35213n.f27999b;
                z9Var2.d();
                break;
            case 15:
                ec ecVar = ((ya) obj).f34873b;
                jb jbVar = ecVar.f28016e;
                jbVar.transitionRunningEnter = false;
                jbVar.onEnterTransitionEnd();
                if (ecVar.f28031u) {
                    ecVar.i(true);
                }
                break;
            case 16:
                vc vcVar = (vc) obj;
                vcVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    vcVar.invalidateSelf();
                }
                break;
            case 17:
                xc xcVar = (xc) obj;
                if (xcVar.f34596k1) {
                    xcVar.f34596k1 = false;
                    xcVar.invalidate();
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((df) obj).f27736f;
                int i12 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView2.p1();
                break;
            case 20:
                ((mg) obj).f30673s = null;
                break;
            case 21:
                ((wh) obj).f34182x0.f28704w1.l();
                break;
            case 22:
                bk bkVar = (bk) ((androidx.mediarouter.app.f) obj).f1709b;
                try {
                    File file = bkVar.K;
                    if (file == null) {
                        bkVar.O();
                    } else {
                        bkVar.N(file);
                    }
                    bkVar.V();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((kl) obj).f30130b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((hl) obj).f29055c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.f34900b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                em emVar = (em) obj;
                gi giVar = emVar.f34900b;
                if (emVar.M && (chatAttachAlertPhotoLayout = giVar.f28650f0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.Y0;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                in inVar = (in) obj;
                inVar.f29423g1 = -1;
                inVar.f29421f1 = null;
                break;
            case 27:
                ((bo) obj).m();
                break;
            case 28:
                ((eo) obj).setVisibility(8);
                break;
            default:
                ((dp) obj).f27818b.a();
                break;
        }
    }
}
