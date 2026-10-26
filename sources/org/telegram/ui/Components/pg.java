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
    public final int f31558a;
    public final Object f31559b;

    public pg(Object obj, int i10) {
        this.f31558a = i10;
        this.f31559b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f31558a;
        Object obj = this.f31559b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).f32544b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f25957s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f25908k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                wc wcVar = (wc) obj;
                new tg.y0(wcVar.X(), 42, wcVar.f34410c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((fi.v3) obj);
                return;
            case 3:
                f5 f5Var = (f5) obj;
                f5Var.requestFocus();
                AndroidUtilities.showKeyboard(f5Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 5:
                SparseArray sparseArray = t5.f32839r;
                ((t5) obj).v();
                return;
            case 6:
                p5 p5Var = (p5) obj;
                ArrayList arrayList = new ArrayList(p5Var.f31448c);
                p5Var.f31448c.clear();
                MessagesStorage.getInstance(p5Var.e).getStorageQueue().postRunnable(new m5(p5Var, arrayList, 0));
                p5Var.d = null;
                return;
            case 7:
                ((r5) obj).invalidate();
                return;
            case 8:
                ((o1.j) obj).h();
                return;
            case 9:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f32443f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f32443f = null;
                    s6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((l8) obj).f30102n.f30437n.setVisibility(8);
                return;
            case 11:
                ((r8) obj).f32161c.e1();
                return;
            case 12:
                ja jaVar = (ja) obj;
                jaVar.f29567o = true;
                jaVar.d.invalidate();
                return;
            case 13:
                ia iaVar = (ia) obj;
                if (!iaVar.f29239a) {
                    ja jaVar2 = iaVar.d;
                    Bitmap[] bitmapArr = jaVar2.f29560g;
                    Canvas[] canvasArr = jaVar2.h;
                    jaVar2.f29560g = jaVar2.f29559f;
                    jaVar2.h = jaVar2.f29561i;
                    jaVar2.f29559f = bitmapArr;
                    jaVar2.f29561i = canvasArr;
                    jaVar2.f29563k = false;
                    fi.f6 f6Var = jaVar2.d;
                    if (f6Var != null) {
                        f6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                la laVar = ((ra) obj).f32202t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 15:
                la laVar2 = (la) obj;
                laVar2.f30148o = laVar2.f30147n.f31868b;
                laVar2.d();
                return;
            case 16:
                qc qcVar = ((jb) obj).f29582b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.v) {
                    qcVar.i(true);
                    return;
                }
                return;
            case 17:
                hd hdVar = (hd) obj;
                hdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    hdVar.invalidateSelf();
                    return;
                }
                return;
            case 18:
                jd jdVar = (jd) obj;
                if (jdVar.f29623o1) {
                    jdVar.f29623o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f32245f;
                int i11 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView2.n1();
                return;
            case 21:
                ((ah) obj).f26504s = null;
                return;
            case 22:
                ((gi) obj).f28578q0.D1.l();
                return;
            case 23:
                nk nkVar = (nk) ((androidx.mediarouter.app.g) obj).f2942b;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((jm) obj).f29674b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((gm) obj).f28601c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30215b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                cn cnVar = (cn) obj;
                ti tiVar = cnVar.f30215b;
                if (cnVar.Q && (chatAttachAlertPhotoLayout = tiVar.f33033j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f26025c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                go goVar = (go) obj;
                goVar.l1 = -1;
                goVar.f28635k1 = null;
                return;
            case 28:
                ((ap) obj).n();
                return;
            default:
                ((cp) obj).setVisibility(8);
                return;
        }
    }
}
