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
    public final int f30438a;
    public final Object f30439b;

    public rg(Object obj, int i10) {
        this.f30438a = i10;
        this.f30439b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30438a;
        Object obj = this.f30439b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ug) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23961s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.g1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23915k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                ad adVar = (ad) obj;
                new rg.y0(adVar.W(), 42, adVar.f24664c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f30640q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f29388c);
                o5Var.f29388c.clear();
                MessagesStorage.getInstance(o5Var.f29389e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
                o5Var.d = null;
                return;
            case 6:
                ((q5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).h();
                return;
            case 8:
                r6 r6Var = (r6) obj;
                CharSequence charSequence = r6Var.f30366f;
                if (charSequence != null) {
                    r6Var.c(charSequence, r6Var.h, true);
                    r6Var.f30366f = null;
                    r6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((k8) obj).f27872n.f28347n.setVisibility(8);
                return;
            case 10:
                ((q8) obj).f30103c.h1();
                return;
            case 11:
                ia iaVar = (ia) obj;
                iaVar.f27310o = true;
                iaVar.d.invalidate();
                return;
            case 12:
                ha haVar = (ha) obj;
                if (!haVar.f26995a) {
                    ia iaVar2 = haVar.d;
                    Bitmap[] bitmapArr = iaVar2.f27303g;
                    Canvas[] canvasArr = iaVar2.h;
                    iaVar2.f27303g = iaVar2.f27302f;
                    iaVar2.h = iaVar2.f27304i;
                    iaVar2.f27302f = bitmapArr;
                    iaVar2.f27304i = canvasArr;
                    iaVar2.f27306k = false;
                    ci.r6 r6Var2 = iaVar2.d;
                    if (r6Var2 != null) {
                        r6Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ma maVar = ((sa) obj).f30757t;
                if (maVar != null) {
                    maVar.d();
                    return;
                }
                return;
            case 14:
                ma maVar2 = (ma) obj;
                maVar2.f28799o = maVar2.f28798n.f30405b;
                maVar2.d();
                return;
            case 15:
                tc tcVar = ((mb) obj).f28804b;
                xb xbVar = tcVar.f31126e;
                xbVar.transitionRunningEnter = false;
                xbVar.onEnterTransitionEnd();
                if (tcVar.f31141u) {
                    tcVar.i(true);
                    return;
                }
                return;
            case 16:
                ld ldVar = (ld) obj;
                ldVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    ldVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                od odVar = (od) obj;
                if (odVar.f29464o1) {
                    odVar.f29464o1 = false;
                    odVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((uf) obj).f31484f;
                int i11 = ChatActivityEnterView.f23850n5;
                chatActivityEnterView2.o1();
                return;
            case 20:
                ((dh) obj).f25705s = null;
                return;
            case 21:
                ((oi) obj).B0.D1.l();
                return;
            case 22:
                sk skVar = (sk) ((androidx.mediarouter.app.g) obj).f3022b;
                try {
                    File file = skVar.O;
                    if (file == null) {
                        skVar.R();
                    } else {
                        skVar.Q(file);
                    }
                    skVar.Y();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((om) obj).f29513b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((lm) obj).f28486c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30173b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                hn hnVar = (hn) obj;
                yi yiVar = hnVar.f30173b;
                if (hnVar.Q && (chatAttachAlertPhotoLayout = yiVar.f33240j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.f24031c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                lo loVar = (lo) obj;
                loVar.f28516k1 = -1;
                loVar.f28514j1 = null;
                return;
            case 27:
                ((ep) obj).o();
                return;
            case 28:
                ((gp) obj).setVisibility(8);
                return;
            default:
                ((fq) obj).f26460b.a();
                return;
        }
    }
}
