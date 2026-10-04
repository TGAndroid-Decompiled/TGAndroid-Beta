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
public final class qg implements Runnable {
    public final int f30019a;
    public final Object f30020b;

    public qg(Object obj, int i10) {
        this.f30019a = i10;
        this.f30020b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30019a;
        Object obj = this.f30020b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23957s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23911k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new rg.y0(ycVar.W(), 42, ycVar.f33130c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f29894q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f28529c);
                m5Var.f28529c.clear();
                MessagesStorage.getInstance(m5Var.f28530e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
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
                CharSequence charSequence = p6Var.f29518f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f29518f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f27329n.f27637n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f29276c.l1();
                return;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.f26752o = true;
                gaVar.d.invalidate();
                return;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.f26420a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.f26745g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.f26745g = gaVar2.f26744f;
                    gaVar2.h = gaVar2.f26746i;
                    gaVar2.f26744f = bitmapArr;
                    gaVar2.f26746i = canvasArr;
                    gaVar2.f26748k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ka kaVar = ((qa) obj).f29988t;
                if (kaVar != null) {
                    kaVar.d();
                    return;
                }
                return;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.f28056o = kaVar2.f28055n.f29577b;
                kaVar2.d();
                return;
            case 15:
                rc rcVar = ((kb) obj).f28059b;
                vb vbVar = rcVar.f30334e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.f30349u) {
                    rcVar.i(true);
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
                md mdVar = (md) obj;
                if (mdVar.f28586o1) {
                    mdVar.f28586o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f31031f;
                int i11 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ch) obj).f25364s = null;
                return;
            case 21:
                ((ki) obj).B0.A1.l();
                return;
            case 22:
                rk rkVar = (rk) ((androidx.mediarouter.app.g) obj).f2943b;
                try {
                    File file = rkVar.O;
                    if (file == null) {
                        rkVar.M();
                    } else {
                        rkVar.L(file);
                    }
                    rkVar.T();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f24570b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24017q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).f32896c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f29642b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.f29642b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.f32824j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f24027c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.f32927k1 = -1;
                xnVar.f32925j1 = null;
                return;
            case 27:
                ((ro) obj).k();
                return;
            case 28:
                ((to) obj).setVisibility(8);
                return;
            default:
                ((sp) obj).f30844b.a();
                return;
        }
    }
}
