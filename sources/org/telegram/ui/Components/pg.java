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
    public final int f31556a;
    public final Object f31557b;

    public pg(Object obj, int i10) {
        this.f31556a = i10;
        this.f31557b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f31556a;
        Object obj = this.f31557b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).f32542b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f25955s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f25906k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                wc wcVar = (wc) obj;
                new tg.y0(wcVar.X(), 42, wcVar.f34407c).show();
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
                SparseArray sparseArray = t5.f32836r;
                ((t5) obj).v();
                return;
            case 6:
                p5 p5Var = (p5) obj;
                ArrayList arrayList = new ArrayList(p5Var.f31446c);
                p5Var.f31446c.clear();
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
                CharSequence charSequence = s6Var.f32441f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f32441f = null;
                    s6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((l8) obj).f30100n.f30435n.setVisibility(8);
                return;
            case 11:
                ((r8) obj).f32159c.e1();
                return;
            case 12:
                ja jaVar = (ja) obj;
                jaVar.f29565o = true;
                jaVar.d.invalidate();
                return;
            case 13:
                ia iaVar = (ia) obj;
                if (!iaVar.f29237a) {
                    ja jaVar2 = iaVar.d;
                    Bitmap[] bitmapArr = jaVar2.f29558g;
                    Canvas[] canvasArr = jaVar2.h;
                    jaVar2.f29558g = jaVar2.f29557f;
                    jaVar2.h = jaVar2.f29559i;
                    jaVar2.f29557f = bitmapArr;
                    jaVar2.f29559i = canvasArr;
                    jaVar2.f29561k = false;
                    fi.f6 f6Var = jaVar2.d;
                    if (f6Var != null) {
                        f6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                la laVar = ((ra) obj).f32200t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 15:
                la laVar2 = (la) obj;
                laVar2.f30146o = laVar2.f30145n.f31866b;
                laVar2.d();
                return;
            case 16:
                qc qcVar = ((jb) obj).f29580b;
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
                if (jdVar.f29621o1) {
                    jdVar.f29621o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f32243f;
                int i11 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView2.n1();
                return;
            case 21:
                ((ah) obj).f26502s = null;
                return;
            case 22:
                ((gi) obj).f28576q0.D1.l();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((jm) obj).f29672b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((gm) obj).f28599c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30213b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                cn cnVar = (cn) obj;
                ti tiVar = cnVar.f30213b;
                if (cnVar.Q && (chatAttachAlertPhotoLayout = tiVar.f33030j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f26023c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                go goVar = (go) obj;
                goVar.l1 = -1;
                goVar.f28633k1 = null;
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
