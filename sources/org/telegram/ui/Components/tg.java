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
    public final int f30877a;
    public final Object f30878b;

    public tg(Object obj, int i10) {
        this.f30877a = i10;
        this.f30878b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30877a;
        Object obj = this.f30878b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((wg) obj).f32382g0;
                chatActivityEnterView.B(true);
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.V4) {
                    chatActivityEnterView.l4 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.g1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23681k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                zc zcVar = (zc) obj;
                new rg.y0(zcVar.W(), 42, zcVar.f33329c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((ci.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f30388q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f29077c);
                o5Var.f29077c.clear();
                MessagesStorage.getInstance(o5Var.f29078e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
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
                CharSequence charSequence = r6Var.f30058f;
                if (charSequence != null) {
                    r6Var.c(charSequence, r6Var.h, true);
                    r6Var.f30058f = null;
                    r6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((k8) obj).f27782n.f28069n.setVisibility(8);
                return;
            case 10:
                ((q8) obj).f29741c.h1();
                return;
            case 11:
                ha haVar = (ha) obj;
                haVar.f26722o = true;
                haVar.d.invalidate();
                return;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.f26375a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.f26715g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.f26715g = haVar2.f26714f;
                    haVar2.h = haVar2.f26716i;
                    haVar2.f26714f = bitmapArr;
                    haVar2.f26716i = canvasArr;
                    haVar2.f26718k = false;
                    ci.r6 r6Var2 = haVar2.d;
                    if (r6Var2 != null) {
                        r6Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                la laVar = ((ra) obj).f30133t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 14:
                la laVar2 = (la) obj;
                laVar2.f28129o = laVar2.f28128n.f29788b;
                laVar2.d();
                return;
            case 15:
                sc scVar = ((lb) obj).f28136b;
                wb wbVar = scVar.f30532e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.f30547u) {
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
                if (odVar.f29158o1) {
                    odVar.f29158o1 = false;
                    odVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((wf) obj).f32368f;
                int i11 = ChatActivityEnterView.S5;
                chatActivityEnterView2.s1();
                return;
            case 20:
                ((fh) obj).f26071s = null;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((qm) obj).f29865b;
                boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((nm) obj).f28871c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30570b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                jn jnVar = (jn) obj;
                aj ajVar = jnVar.f30570b;
                if (jnVar.Q && (chatAttachAlertPhotoLayout = ajVar.f24350j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f23809c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                no noVar = (no) obj;
                noVar.f28898k1 = -1;
                noVar.f28896j1 = null;
                return;
            case 27:
                ((gp) obj).k();
                return;
            case 28:
                ((ip) obj).setVisibility(8);
                return;
            default:
                ((hq) obj).f26866b.a();
                return;
        }
    }
}
