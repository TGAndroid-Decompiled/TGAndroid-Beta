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
public final class ig implements Runnable {
    public final int f29386a;
    public final Object f29387b;

    public ig(Object obj, int i10) {
        this.f29386a = i10;
        this.f29387b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f29386a;
        Object obj = this.f29387b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((lg) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f26165n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                tc tcVar = (tc) obj;
                new cg.p1(tcVar.W(), 42, tcVar.f32924c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((nh.t3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = p5.f31579q;
                ((p5) obj).v();
                return;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f30231c);
                l5Var.f30231c.clear();
                MessagesStorage.getInstance(l5Var.f30232e).getStorageQueue().postRunnable(new i5(l5Var, arrayList, 0));
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
                CharSequence charSequence = o6Var.f31267f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f31267f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((f8) obj).f28348n.f28792n.setVisibility(8);
                return;
            case 10:
                ((m8) obj).f30596c.e1();
                return;
            case 11:
                ca caVar = (ca) obj;
                caVar.f27415o = true;
                caVar.d.invalidate();
                return;
            case 12:
                ba baVar = (ba) obj;
                if (!baVar.f27014a) {
                    ca caVar2 = baVar.d;
                    Bitmap[] bitmapArr = caVar2.f27408g;
                    Canvas[] canvasArr = caVar2.h;
                    caVar2.f27408g = caVar2.f27407f;
                    caVar2.h = caVar2.f27409i;
                    caVar2.f27407f = bitmapArr;
                    caVar2.f27409i = canvasArr;
                    caVar2.f27411k = false;
                    cg.i0 i0Var = caVar2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ga gaVar = ((ma) obj).f30626t;
                if (gaVar != null) {
                    gaVar.d();
                    return;
                }
                return;
            case 14:
                ga gaVar2 = (ga) obj;
                gaVar2.f28860o = gaVar2.f28859n.f30266b;
                gaVar2.d();
                return;
            case 15:
                mc mcVar = ((fb) obj).f28367b;
                rb rbVar = mcVar.f30648e;
                rbVar.transitionRunningEnter = false;
                rbVar.onEnterTransitionEnd();
                if (mcVar.f30663u) {
                    mcVar.i(true);
                    return;
                }
                return;
            case 16:
                cd cdVar = (cd) obj;
                cdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    cdVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                ed edVar = (ed) obj;
                if (edVar.f28011k1) {
                    edVar.f28011k1 = false;
                    edVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((lf) obj).f30302f;
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((tg) obj).f32948s = null;
                return;
            case 21:
                ((di) obj).f27773x0.f31059w1.l();
                return;
            case 22:
                jk jkVar = (jk) ((af.c) obj).f370b;
                try {
                    File file = jkVar.K;
                    if (file == null) {
                        jkVar.O();
                    } else {
                        jkVar.M(file);
                    }
                    jkVar.V();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((sl) obj).f32686b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((pl) obj).f31705c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.f28403b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                lm lmVar = (lm) obj;
                ni niVar = lmVar.f28403b;
                if (lmVar.M && (chatAttachAlertPhotoLayout = niVar.f31005f0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                on onVar = (on) obj;
                onVar.f31413g1 = -1;
                onVar.f31411f1 = null;
                return;
            case 27:
                ((io) obj).k();
                return;
            case 28:
                ((ko) obj).setVisibility(8);
                return;
            default:
                ((jp) obj).f29780b.a();
                return;
        }
    }
}
