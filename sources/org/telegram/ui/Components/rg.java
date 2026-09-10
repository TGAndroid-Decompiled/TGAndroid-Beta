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
public final class rg implements Runnable {
    public final int f26664a;
    public final Object f26665b;

    public rg(Object obj, int i10) {
        this.f26664a = i10;
        this.f26665b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f26664a;
        Object obj = this.f26665b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ug) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f20919r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f20875j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                wc wcVar = (wc) obj;
                new qg.a1(wcVar.W(), 42, wcVar.f28749c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((bi.x4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = p5.f26020q;
                ((p5) obj).v();
                return;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f24878c);
                l5Var.f24878c.clear();
                MessagesStorage.getInstance(l5Var.e).getStorageQueue().postRunnable(new i5(l5Var, arrayList, 0));
                l5Var.d = null;
                return;
            case 6:
                ((n5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).f();
                return;
            case 8:
                o6 o6Var = (o6) obj;
                CharSequence charSequence = o6Var.f25681f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f25681f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((i8) obj).f23923n.f24291n.setVisibility(8);
                return;
            case 10:
                ((o8) obj).f25694c.i1();
                return;
            case 11:
                ea eaVar = (ea) obj;
                eaVar.f22644o = true;
                eaVar.d.invalidate();
                return;
            case 12:
                da daVar = (da) obj;
                if (!daVar.f22341a) {
                    ea eaVar2 = daVar.d;
                    Bitmap[] bitmapArr = eaVar2.f22637g;
                    Canvas[] canvasArr = eaVar2.h;
                    eaVar2.f22637g = eaVar2.f22636f;
                    eaVar2.h = eaVar2.f22638i;
                    eaVar2.f22636f = bitmapArr;
                    eaVar2.f22638i = canvasArr;
                    eaVar2.f22640k = false;
                    bi.s7 s7Var = eaVar2.d;
                    if (s7Var != null) {
                        s7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ia iaVar = ((oa) obj).f25752t;
                if (iaVar != null) {
                    iaVar.d();
                    return;
                }
                return;
            case 14:
                ia iaVar2 = (ia) obj;
                iaVar2.f23974o = iaVar2.f23973n.f25479b;
                iaVar2.d();
                return;
            case 15:
                pc pcVar = ((ib) obj).f23981b;
                tb tbVar = pcVar.e;
                tbVar.transitionRunningEnter = false;
                tbVar.onEnterTransitionEnd();
                if (pcVar.f26092u) {
                    pcVar.i(true);
                    return;
                }
                return;
            case 16:
                hd hdVar = (hd) obj;
                hdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    hdVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                jd jdVar = (jd) obj;
                if (jdVar.f24363o1) {
                    jdVar.f24363o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f27401f;
                int i11 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((dh) obj).f22421s = null;
                return;
            case 21:
                ((oi) obj).B0.A1.l();
                return;
            case 22:
                tk tkVar = (tk) ((androidx.mediarouter.app.g) obj).f1418b;
                try {
                    File file = tkVar.O;
                    if (file == null) {
                        tkVar.O();
                    } else {
                        tkVar.N(file);
                    }
                    tkVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((cm) obj).f22179b;
                boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((zl) obj).f29718c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26422b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                xm xmVar = (xm) obj;
                yi yiVar = xmVar.f26422b;
                if (xmVar.Q && (chatAttachAlertPhotoLayout = yiVar.f29378j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f20993c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                zn znVar = (zn) obj;
                znVar.f29753k1 = -1;
                znVar.f29751j1 = null;
                return;
            case 27:
                ((to) obj).n();
                return;
            case 28:
                ((vo) obj).setVisibility(8);
                return;
            default:
                ((vp) obj).f28570b.a();
                return;
        }
    }
}
