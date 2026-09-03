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
public final class fg implements Runnable {
    public final int f26908a;
    public final Object f26909b;

    public fg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).S;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f24656o4) {
                    chatActivityEnterView.F3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                chatActivityEnterView.V2.e1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24611g1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) obj;
                new fg.n1(qcVar.W(), 42, qcVar.f30380c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((qh.e3) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = l5.f28623q;
                ((l5) obj).v();
                return;
            case 5:
                h5 h5Var = (h5) obj;
                ArrayList arrayList = new ArrayList(h5Var.f27364c);
                h5Var.f27364c.clear();
                MessagesStorage.getInstance(h5Var.f27365e).getStorageQueue().postRunnable(new e5(h5Var, arrayList, 0));
                h5Var.d = null;
                return;
            case 6:
                ((j5) obj).invalidate();
                return;
            case 7:
                ((o1.j) obj).f();
                return;
            case 8:
                k6 k6Var = (k6) obj;
                CharSequence charSequence = k6Var.f28284f;
                if (charSequence != null) {
                    k6Var.c(charSequence, k6Var.h, true);
                    k6Var.f28284f = null;
                    k6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((b8) obj).f25536n.f25817n.setVisibility(8);
                return;
            case 10:
                ((h8) obj).f27409c.h1();
                return;
            case 11:
                x9 x9Var = (x9) obj;
                x9Var.f32984o = true;
                x9Var.d.invalidate();
                return;
            case 12:
                w9 w9Var = (w9) obj;
                if (!w9Var.f32689a) {
                    x9 x9Var2 = w9Var.d;
                    Bitmap[] bitmapArr = x9Var2.f32977g;
                    Canvas[] canvasArr = x9Var2.h;
                    x9Var2.f32977g = x9Var2.f32976f;
                    x9Var2.h = x9Var2.f32978i;
                    x9Var2.f32976f = bitmapArr;
                    x9Var2.f32978i = canvasArr;
                    x9Var2.f32980k = false;
                    fg.i0 i0Var = x9Var2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ba baVar = ((ha) obj).f27461t;
                if (baVar != null) {
                    baVar.d();
                    return;
                }
                return;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.f25563o = baVar2.f25562n.f27134b;
                baVar2.d();
                return;
            case 15:
                ic icVar = ((ab) obj).f25207b;
                nb nbVar = icVar.f27774e;
                nbVar.transitionRunningEnter = false;
                nbVar.onEnterTransitionEnd();
                if (icVar.f27789u) {
                    icVar.i(true);
                    return;
                }
                return;
            case 16:
                zc zcVar = (zc) obj;
                zcVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    zcVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                bd bdVar = (bd) obj;
                if (bdVar.l1) {
                    bdVar.l1 = false;
                    bdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f27498f;
                int i11 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView2.q1();
                return;
            case 20:
                ((qg) obj).f30408s = null;
                return;
            case 21:
                ((ci) obj).f25956y0.f29127x1.l();
                return;
            case 22:
                jk jkVar = (jk) ((androidx.mediarouter.app.h) obj).f1201b;
                try {
                    File file = jkVar.L;
                    if (file == null) {
                        jkVar.O();
                    } else {
                        jkVar.N(file);
                    }
                    jkVar.V();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((vl) obj).f31904b;
                boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((rl) obj).f30807c;
                if (chatAttachAlertPhotoLayout3.M != null && !chatAttachAlertPhotoLayout3.f26590b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.M.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                pm pmVar = (pm) obj;
                mi miVar = pmVar.f26590b;
                if (pmVar.N && (chatAttachAlertPhotoLayout = miVar.f29072g0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Z0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                rn rnVar = (rn) obj;
                rnVar.f30829h1 = -1;
                rnVar.f30827g1 = null;
                return;
            case 27:
                ((mo) obj).k();
                return;
            case 28:
                ((oo) obj).setVisibility(8);
                return;
            default:
                ((pp) obj).f30157b.a();
                return;
        }
    }
}
