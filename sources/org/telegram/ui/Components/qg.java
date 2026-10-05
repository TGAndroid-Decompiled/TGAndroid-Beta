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
    public final int f30047a;
    public final Object f30048b;

    public qg(Object obj, int i10) {
        this.f30047a = i10;
        this.f30048b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30047a;
        Object obj = this.f30048b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23965s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23919k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new rg.y0(ycVar.W(), 42, ycVar.f33254c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f29921q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f28610c);
                m5Var.f28610c.clear();
                MessagesStorage.getInstance(m5Var.f28611e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
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
                CharSequence charSequence = p6Var.f29605f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f29605f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f27421n.f27716n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f29400c.l1();
                return;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.f26807o = true;
                gaVar.d.invalidate();
                return;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.f26433a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.f26800g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.f26800g = gaVar2.f26799f;
                    gaVar2.h = gaVar2.f26801i;
                    gaVar2.f26799f = bitmapArr;
                    gaVar2.f26801i = canvasArr;
                    gaVar2.f26803k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ka kaVar = ((qa) obj).f30016t;
                if (kaVar != null) {
                    kaVar.d();
                    return;
                }
                return;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.f28148o = kaVar2.f28147n.f29676b;
                kaVar2.d();
                return;
            case 15:
                rc rcVar = ((kb) obj).f28151b;
                vb vbVar = rcVar.f30423e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.f30438u) {
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
                if (mdVar.f28671o1) {
                    mdVar.f28671o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f31125f;
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ch) obj).f25418s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f24641b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).f32994c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f29741b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.f29741b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.f32922j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f24035c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.f33025k1 = -1;
                xnVar.f33023j1 = null;
                return;
            case 27:
                ((ro) obj).k();
                return;
            case 28:
                ((to) obj).setVisibility(8);
                return;
            default:
                ((sp) obj).f30918b.a();
                return;
        }
    }
}
