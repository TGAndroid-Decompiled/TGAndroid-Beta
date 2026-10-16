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
    public final int f28280a;
    public final Object f28281b;

    public qg(Object obj, int i10) {
        this.f28280a = i10;
        this.f28281b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f28280a;
        Object obj = this.f28281b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22660s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.Y0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22614k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                zc zcVar = (zc) obj;
                new sg.y0(zcVar.W(), 42, zcVar.f31541c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((di.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f28726q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f27542c);
                o5Var.f27542c.clear();
                MessagesStorage.getInstance(o5Var.e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
                o5Var.d = null;
                return;
            case 6:
                ((q5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).h();
                return;
            case 8:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f28753f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f28753f = null;
                    s6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((l8) obj).f26636n.f26982n.setVisibility(8);
                return;
            case 10:
                ((s8) obj).f28763c.k1();
                return;
            case 11:
                ha haVar = (ha) obj;
                haVar.f25237o = true;
                haVar.d.invalidate();
                return;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.f24933a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.f25230g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.f25230g = haVar2.f25229f;
                    haVar2.h = haVar2.f25231i;
                    haVar2.f25229f = bitmapArr;
                    haVar2.f25231i = canvasArr;
                    haVar2.f25233k = false;
                    di.p6 p6Var = haVar2.d;
                    if (p6Var != null) {
                        p6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                la laVar = ((ra) obj).f28487t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 14:
                la laVar2 = (la) obj;
                laVar2.f26712o = laVar2.f26711n.f28252b;
                laVar2.d();
                return;
            case 15:
                sc scVar = ((lb) obj).f26717b;
                wb wbVar = scVar.e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.f28816u) {
                    scVar.i(true);
                    return;
                }
                return;
            case 16:
                kd kdVar = (kd) obj;
                kdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    kdVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                md mdVar = (md) obj;
                if (mdVar.f27081o1) {
                    mdVar.f27081o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f29054f;
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView2.n1();
                return;
            case 20:
                ((bh) obj).f23453s = null;
                return;
            case 21:
                ((li) obj).B0.D1.l();
                return;
            case 22:
                pk pkVar = (pk) ((androidx.mediarouter.app.f) obj).f1876b;
                try {
                    File file = pkVar.O;
                    if (file == null) {
                        pkVar.R();
                    } else {
                        pkVar.Q(file);
                    }
                    pkVar.Y();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((km) obj).f26415b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((hm) obj).f25360c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27360b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                en enVar = (en) obj;
                vi viVar = enVar.f27360b;
                if (enVar.Q && (chatAttachAlertPhotoLayout = viVar.f29684j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f22728c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                io ioVar = (io) obj;
                ioVar.f25685k1 = -1;
                ioVar.f25683j1 = null;
                return;
            case 27:
                ((bp) obj).o();
                return;
            case 28:
                ((dp) obj).setVisibility(8);
                return;
            default:
                ((cq) obj).f23873b.a();
                return;
        }
    }
}
