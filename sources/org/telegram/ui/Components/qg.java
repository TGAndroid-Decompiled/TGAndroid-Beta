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
    public final int f30020a;
    public final Object f30021b;

    public qg(Object obj, int i10) {
        this.f30020a = i10;
        this.f30021b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30020a;
        Object obj = this.f30021b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23958s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23912k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new rg.y0(ycVar.W(), 42, ycVar.f33131c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f29895q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f28530c);
                m5Var.f28530c.clear();
                MessagesStorage.getInstance(m5Var.f28531e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
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
                CharSequence charSequence = p6Var.f29519f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f29519f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f27330n.f27638n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f29277c.l1();
                return;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.f26753o = true;
                gaVar.d.invalidate();
                return;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.f26421a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.f26746g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.f26746g = gaVar2.f26745f;
                    gaVar2.h = gaVar2.f26747i;
                    gaVar2.f26745f = bitmapArr;
                    gaVar2.f26747i = canvasArr;
                    gaVar2.f26749k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ka kaVar = ((qa) obj).f29989t;
                if (kaVar != null) {
                    kaVar.d();
                    return;
                }
                return;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.f28057o = kaVar2.f28056n.f29578b;
                kaVar2.d();
                return;
            case 15:
                rc rcVar = ((kb) obj).f28060b;
                vb vbVar = rcVar.f30335e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.f30350u) {
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
                if (mdVar.f28587o1) {
                    mdVar.f28587o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f31032f;
                int i11 = ChatActivityEnterView.f23847n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ch) obj).f25365s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f24571b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24018q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).f32897c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f29643b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.f29643b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.f32825j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f24028c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.f32928k1 = -1;
                xnVar.f32926j1 = null;
                return;
            case 27:
                ((ro) obj).k();
                return;
            case 28:
                ((to) obj).setVisibility(8);
                return;
            default:
                ((sp) obj).f30845b.a();
                return;
        }
    }
}
