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
public final class ng implements Runnable {
    public final int f28904a;
    public final Object f28905b;

    public ng(Object obj, int i10) {
        this.f28904a = i10;
        this.f28905b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f28904a;
        Object obj = this.f28905b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).f29915b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f24165s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24116k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                vc vcVar = (vc) obj;
                new sg.y0(vcVar.W(), 42, vcVar.f31416c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ei.x3) obj);
                return;
            case 3:
                c5 c5Var = (c5) obj;
                c5Var.requestFocus();
                AndroidUtilities.showKeyboard(c5Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 5:
                SparseArray sparseArray = p5.f29471r;
                ((p5) obj).v();
                return;
            case 6:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f28171c);
                l5Var.f28171c.clear();
                MessagesStorage.getInstance(l5Var.e).getStorageQueue().postRunnable(new i5(l5Var, arrayList, 0));
                l5Var.d = null;
                return;
            case 7:
                ((n5) obj).invalidate();
                return;
            case 8:
                ((o1.k) obj).h();
                return;
            case 9:
                o6 o6Var = (o6) obj;
                CharSequence charSequence = o6Var.f29156f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f29156f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((h8) obj).f26897n.f27340n.setVisibility(8);
                return;
            case 11:
                ((n8) obj).f28827c.Y0();
                return;
            case 12:
                da daVar = (da) obj;
                daVar.f25642o = true;
                daVar.d.invalidate();
                return;
            case 13:
                ca caVar = (ca) obj;
                if (!caVar.f25274a) {
                    da daVar2 = caVar.d;
                    Bitmap[] bitmapArr = daVar2.f25635g;
                    Canvas[] canvasArr = daVar2.h;
                    daVar2.f25635g = daVar2.f25634f;
                    daVar2.h = daVar2.f25636i;
                    daVar2.f25634f = bitmapArr;
                    daVar2.f25636i = canvasArr;
                    daVar2.f25638k = false;
                    ei.g6 g6Var = daVar2.d;
                    if (g6Var != null) {
                        g6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ha haVar = ((na) obj).f28850t;
                if (haVar != null) {
                    haVar.d();
                    return;
                }
                return;
            case 15:
                ha haVar2 = (ha) obj;
                haVar2.f26985o = haVar2.f26984n.f28547b;
                haVar2.d();
                return;
            case 16:
                oc ocVar = ((hb) obj).f26991b;
                sb sbVar = ocVar.e;
                sbVar.transitionRunningEnter = false;
                sbVar.onEnterTransitionEnd();
                if (ocVar.f29214u) {
                    ocVar.i(true);
                    return;
                }
                return;
            case 17:
                gd gdVar = (gd) obj;
                gdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    gdVar.invalidateSelf();
                    return;
                }
                return;
            case 18:
                id idVar = (id) obj;
                if (idVar.f27411o1) {
                    idVar.f27411o1 = false;
                    idVar.invalidate();
                    return;
                }
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((pf) obj).f29555f;
                int i11 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView2.n1();
                return;
            case 21:
                ((yg) obj).f32909s = null;
                return;
            case 22:
                ((hi) obj).B0.D1.l();
                return;
            case 23:
                lk lkVar = (lk) ((androidx.mediarouter.app.f) obj).f3493b;
                try {
                    File file = lkVar.O;
                    if (file == null) {
                        lkVar.R();
                    } else {
                        lkVar.Q(file);
                    }
                    lkVar.Y();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((gm) obj).f26727b;
                boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((dm) obj).f25790c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27704b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                zm zmVar = (zm) obj;
                ri riVar = zmVar.f27704b;
                if (zmVar.Q && (chatAttachAlertPhotoLayout = riVar.f30158j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f24233c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                co coVar = (co) obj;
                coVar.l1 = -1;
                coVar.f25378k1 = null;
                return;
            case 28:
                ((wo) obj).o();
                return;
            default:
                ((yo) obj).setVisibility(8);
                return;
        }
    }
}
