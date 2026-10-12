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
public final class tg implements Runnable {
    public final int f30874a;
    public final Object f30875b;

    public tg(Object obj, int i10) {
        this.f30874a = i10;
        this.f30875b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30874a;
        Object obj = this.f30875b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((wg) obj).f32395f0;
                chatActivityEnterView.B(true);
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.V4) {
                    chatActivityEnterView.l4 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.g1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23680k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                zc zcVar = (zc) obj;
                new rg.y0(zcVar.W(), 42, zcVar.f33323c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f30392q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f29073c);
                o5Var.f29073c.clear();
                MessagesStorage.getInstance(o5Var.f29074e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
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
                CharSequence charSequence = r6Var.f30057f;
                if (charSequence != null) {
                    r6Var.c(charSequence, r6Var.h, true);
                    r6Var.f30057f = null;
                    r6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((k8) obj).f27779n.f28084n.setVisibility(8);
                return;
            case 10:
                ((q8) obj).f29763c.h1();
                return;
            case 11:
                ha haVar = (ha) obj;
                haVar.f26718o = true;
                haVar.d.invalidate();
                return;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.f26377a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.f26711g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.f26711g = haVar2.f26710f;
                    haVar2.h = haVar2.f26712i;
                    haVar2.f26710f = bitmapArr;
                    haVar2.f26712i = canvasArr;
                    haVar2.f26714k = false;
                    ci.r6 r6Var2 = haVar2.d;
                    if (r6Var2 != null) {
                        r6Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                la laVar = ((ra) obj).f30132t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 14:
                la laVar2 = (la) obj;
                laVar2.f28144o = laVar2.f28143n.f29810b;
                laVar2.d();
                return;
            case 15:
                sc scVar = ((lb) obj).f28151b;
                wb wbVar = scVar.f30536e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.f30551u) {
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
                od odVar = (od) obj;
                if (odVar.f29154o1) {
                    odVar.f29154o1 = false;
                    odVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((wf) obj).f32382f;
                int i11 = ChatActivityEnterView.Q5;
                chatActivityEnterView2.s1();
                return;
            case 20:
                ((fh) obj).f26069s = null;
                return;
            case 21:
                ((qi) obj).B0.D1.l();
                return;
            case 22:
                uk ukVar = (uk) ((androidx.mediarouter.app.g) obj).f3020b;
                try {
                    File file = ukVar.O;
                    if (file == null) {
                        ukVar.R();
                    } else {
                        ukVar.Q(file);
                    }
                    ukVar.Y();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((qm) obj).f29863b;
                boolean z10 = ChatAttachAlertPhotoLayout.f23798q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((nm) obj).f28867c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30574b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                jn jnVar = (jn) obj;
                aj ajVar = jnVar.f30574b;
                if (jnVar.Q && (chatAttachAlertPhotoLayout = ajVar.f24354j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f23808c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                no noVar = (no) obj;
                noVar.f28894k1 = -1;
                noVar.f28892j1 = null;
                return;
            case 27:
                ((gp) obj).k();
                return;
            case 28:
                ((ip) obj).setVisibility(8);
                return;
            default:
                ((hq) obj).f26880b.a();
                return;
        }
    }
}
