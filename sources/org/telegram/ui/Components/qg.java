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
    public final int f30025a;
    public final Object f30026b;

    public qg(Object obj, int i10) {
        this.f30025a = i10;
        this.f30026b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30025a;
        Object obj = this.f30026b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23962s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23916k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                yc ycVar = (yc) obj;
                new rg.y0(ycVar.W(), 42, ycVar.f33137c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = q5.f29900q;
                ((q5) obj).v();
                return;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.f28535c);
                m5Var.f28535c.clear();
                MessagesStorage.getInstance(m5Var.f28536e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 0));
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
                CharSequence charSequence = p6Var.f29524f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f29524f = null;
                    p6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f27335n.f27643n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f29282c.l1();
                return;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.f26758o = true;
                gaVar.d.invalidate();
                return;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.f26426a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.f26751g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.f26751g = gaVar2.f26750f;
                    gaVar2.h = gaVar2.f26752i;
                    gaVar2.f26750f = bitmapArr;
                    gaVar2.f26752i = canvasArr;
                    gaVar2.f26754k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ka kaVar = ((qa) obj).f29994t;
                if (kaVar != null) {
                    kaVar.d();
                    return;
                }
                return;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.f28062o = kaVar2.f28061n.f29583b;
                kaVar2.d();
                return;
            case 15:
                rc rcVar = ((kb) obj).f28065b;
                vb vbVar = rcVar.f30341e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.f30356u) {
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
                if (mdVar.f28592o1) {
                    mdVar.f28592o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f31038f;
                int i11 = ChatActivityEnterView.f23851n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ch) obj).f25370s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f24575b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24022q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).f32903c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f29648b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.f29648b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.f32831j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f24032c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.f32934k1 = -1;
                xnVar.f32932j1 = null;
                return;
            case 27:
                ((ro) obj).k();
                return;
            case 28:
                ((to) obj).setVisibility(8);
                return;
            default:
                ((sp) obj).f30851b.a();
                return;
        }
    }
}
