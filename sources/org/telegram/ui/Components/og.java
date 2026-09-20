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
public final class og implements Runnable {
    public final int f26908a;
    public final Object f26909b;

    public og(Object obj, int i10) {
        this.f26908a = i10;
        this.f26909b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f26908a;
        Object obj = this.f26909b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22055r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.b1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22011j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.f30239c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = p5.f27149q;
                ((p5) obj).v();
                return;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f26037c);
                l5Var.f26037c.clear();
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
                CharSequence charSequence = o6Var.f26819f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f26819f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((h8) obj).f24565n.f24924n.setVisibility(8);
                return;
            case 10:
                ((n8) obj).f26607c.j1();
                return;
            case 11:
                ea eaVar = (ea) obj;
                eaVar.f23807o = true;
                eaVar.d.invalidate();
                return;
            case 12:
                da daVar = (da) obj;
                if (!daVar.f23542a) {
                    ea eaVar2 = daVar.d;
                    Bitmap[] bitmapArr = eaVar2.f23800g;
                    Canvas[] canvasArr = eaVar2.h;
                    eaVar2.f23800g = eaVar2.f23799f;
                    eaVar2.h = eaVar2.f23801i;
                    eaVar2.f23799f = bitmapArr;
                    eaVar2.f23801i = canvasArr;
                    eaVar2.f23803k = false;
                    ci.s6 s6Var = eaVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ia iaVar = ((oa) obj).f26883t;
                if (iaVar != null) {
                    iaVar.d();
                    return;
                }
                return;
            case 14:
                ia iaVar2 = (ia) obj;
                iaVar2.f24981o = iaVar2.f24980n.f26613b;
                iaVar2.d();
                return;
            case 15:
                pc pcVar = ((ib) obj).f24984b;
                tb tbVar = pcVar.e;
                tbVar.transitionRunningEnter = false;
                tbVar.onEnterTransitionEnd();
                if (pcVar.f27263u) {
                    pcVar.i(true);
                    return;
                }
                return;
            case 16:
                id idVar = (id) obj;
                idVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    idVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                ld ldVar = (ld) obj;
                if (ldVar.f26112o1) {
                    ldVar.f26112o1 = false;
                    ldVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f27855f;
                int i11 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ah) obj).f22675s = null;
                return;
            case 21:
                ((li) obj).B0.A1.l();
                return;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).f2726b;
                try {
                    File file = okVar.O;
                    if (file == null) {
                        okVar.O();
                    } else {
                        okVar.N(file);
                    }
                    okVar.V();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).f30297b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22119q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).f28701c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26655b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.f26655b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.f29110j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f22129c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                un unVar = (un) obj;
                unVar.f28755k1 = -1;
                unVar.f28753j1 = null;
                return;
            case 27:
                ((oo) obj).n();
                return;
            case 28:
                ((qo) obj).setVisibility(8);
                return;
            default:
                ((pp) obj).f27416b.a();
                return;
        }
    }
}
