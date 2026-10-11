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
    public final int f30519a;
    public final Object f30520b;

    public rg(Object obj, int i10) {
        this.f30519a = i10;
        this.f30520b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30519a;
        Object obj = this.f30520b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ug) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23989s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.g1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23943k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                ad adVar = (ad) obj;
                new rg.y0(adVar.W(), 42, adVar.f24562c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f30725q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f29386c);
                o5Var.f29386c.clear();
                MessagesStorage.getInstance(o5Var.f29387e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
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
                CharSequence charSequence = r6Var.f30432f;
                if (charSequence != null) {
                    r6Var.c(charSequence, r6Var.h, true);
                    r6Var.f30432f = null;
                    r6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((k8) obj).f27981n.f28244n.setVisibility(8);
                return;
            case 10:
                ((q8) obj).f30192c.h1();
                return;
            case 11:
                ha haVar = (ha) obj;
                haVar.f27014o = true;
                haVar.d.invalidate();
                return;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.f26702a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.f27007g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.f27007g = haVar2.f27006f;
                    haVar2.h = haVar2.f27008i;
                    haVar2.f27006f = bitmapArr;
                    haVar2.f27008i = canvasArr;
                    haVar2.f27010k = false;
                    ci.r6 r6Var2 = haVar2.d;
                    if (r6Var2 != null) {
                        r6Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                la laVar = ((ra) obj).f30482t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 14:
                la laVar2 = (la) obj;
                laVar2.f28329o = laVar2.f28328n.f30216b;
                laVar2.d();
                return;
            case 15:
                sc scVar = ((lb) obj).f28336b;
                wb wbVar = scVar.f30829e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.f30844u) {
                    scVar.i(true);
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
                if (odVar.f29487o1) {
                    odVar.f29487o1 = false;
                    odVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((uf) obj).f31572f;
                int i11 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView2.o1();
                return;
            case 20:
                ((dh) obj).f25772s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((om) obj).f29553b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24049q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((lm) obj).f28502c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30245b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                hn hnVar = (hn) obj;
                yi yiVar = hnVar.f30245b;
                if (hnVar.Q && (chatAttachAlertPhotoLayout = yiVar.f33301j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f24059c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                lo loVar = (lo) obj;
                loVar.f28531k1 = -1;
                loVar.f28529j1 = null;
                return;
            case 27:
                ((ep) obj).o();
                return;
            case 28:
                ((gp) obj).setVisibility(8);
                return;
            default:
                ((fq) obj).f26540b.a();
                return;
        }
    }
}
