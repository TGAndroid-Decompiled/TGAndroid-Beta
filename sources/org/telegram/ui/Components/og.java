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
    public final int f27064a;
    public final Object f27065b;

    public og(Object obj, int i10) {
        this.f27064a = i10;
        this.f27065b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f27064a;
        Object obj = this.f27065b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22077s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.b1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22031k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.f30303c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = p5.f27243q;
                ((p5) obj).v();
                return;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f25998c);
                l5Var.f25998c.clear();
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
                CharSequence charSequence = o6Var.f26996f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f26996f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((h8) obj).f24710n.f25012n.setVisibility(8);
                return;
            case 10:
                ((n8) obj).f26690c.j1();
                return;
            case 11:
                ea eaVar = (ea) obj;
                eaVar.f23902o = true;
                eaVar.d.invalidate();
                return;
            case 12:
                da daVar = (da) obj;
                if (!daVar.f23618a) {
                    ea eaVar2 = daVar.d;
                    Bitmap[] bitmapArr = eaVar2.f23895g;
                    Canvas[] canvasArr = eaVar2.h;
                    eaVar2.f23895g = eaVar2.f23894f;
                    eaVar2.h = eaVar2.f23896i;
                    eaVar2.f23894f = bitmapArr;
                    eaVar2.f23896i = canvasArr;
                    eaVar2.f23898k = false;
                    ci.s6 s6Var = eaVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ia iaVar = ((oa) obj).f27048t;
                if (iaVar != null) {
                    iaVar.d();
                    return;
                }
                return;
            case 14:
                ia iaVar2 = (ia) obj;
                iaVar2.f25070o = iaVar2.f25069n.f26717b;
                iaVar2.d();
                return;
            case 15:
                pc pcVar = ((ib) obj).f25074b;
                tb tbVar = pcVar.e;
                tbVar.transitionRunningEnter = false;
                tbVar.onEnterTransitionEnd();
                if (pcVar.f27322u) {
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
                if (ldVar.f26076o1) {
                    ldVar.f26076o1 = false;
                    ldVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f27943f;
                int i11 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView2.p1();
                return;
            case 20:
                ((ah) obj).f22656s = null;
                return;
            case 21:
                ((li) obj).B0.A1.l();
                return;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).f2725b;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).f30348b;
                boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).f28798c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f26786b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.f26786b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.f29108j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f22145c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                un unVar = (un) obj;
                unVar.f28826k1 = -1;
                unVar.f28824j1 = null;
                return;
            case 27:
                ((oo) obj).n();
                return;
            case 28:
                ((qo) obj).setVisibility(8);
                return;
            default:
                ((pp) obj).f27394b.a();
                return;
        }
    }
}
