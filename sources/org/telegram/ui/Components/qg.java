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
    public final int f27651a;
    public final Object f27652b;

    public qg(Object obj, int i10) {
        this.f27651a = i10;
        this.f27652b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f27651a;
        Object obj = this.f27652b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22084s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22038k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new rg.x0(ycVar.W(), 42, ycVar.f30693c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f27542q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f26217c);
                m5Var.f26217c.clear();
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
                CharSequence charSequence = p6Var.f27251f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f27251f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f25036n.f25328n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f27023c.j1();
                return;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.f24496o = true;
                gaVar.d.invalidate();
                return;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.f24256a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.f24489g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.f24489g = gaVar2.f24488f;
                    gaVar2.h = gaVar2.f24490i;
                    gaVar2.f24488f = bitmapArr;
                    gaVar2.f24490i = canvasArr;
                    gaVar2.f24492k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ka kaVar = ((qa) obj).f27624t;
                if (kaVar != null) {
                    kaVar.d();
                    return;
                }
                return;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.f25730o = kaVar2.f25729n.f27299b;
                kaVar2.d();
                return;
            case 15:
                rc rcVar = ((kb) obj).f25736b;
                vb vbVar = rcVar.e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.f27957u) {
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
                nd ndVar = (nd) obj;
                if (ndVar.f26679o1) {
                    ndVar.f26679o1 = false;
                    ndVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f28499f;
                int i11 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((ch) obj).f23313s = null;
                return;
            case 21:
                ((ni) obj).B0.A1.l();
                return;
            case 22:
                rk rkVar = (rk) ((androidx.mediarouter.app.g) obj).f2725b;
                try {
                    File file = rkVar.O;
                    if (file == null) {
                        rkVar.O();
                    } else {
                        rkVar.N(file);
                    }
                    rkVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f22659b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22142q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).f30350c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27362b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.f27362b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.f30282j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f22152c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.f30405k1 = -1;
                xnVar.f30403j1 = null;
                return;
            case 27:
                ((ro) obj).n();
                return;
            case 28:
                ((to) obj).setVisibility(8);
                return;
            default:
                ((sp) obj).f28318b.a();
                return;
        }
    }
}
