package org.telegram.ui.Components;

import android.app.Activity;
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
public final class pg implements Runnable {
    public final int f31606a;
    public final Object f31607b;

    public pg(Object obj, int i10) {
        this.f31606a = i10;
        this.f31607b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f31606a;
        Object obj = this.f31607b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).f32583b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f25959s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f25910k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                wc wcVar = (wc) obj;
                new tg.y0(wcVar.X(), 42, wcVar.f34498c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((fi.v3) obj);
                return;
            case 3:
                f5 f5Var = (f5) obj;
                f5Var.requestFocus();
                AndroidUtilities.showKeyboard(f5Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 5:
                SparseArray sparseArray = t5.f32847r;
                ((t5) obj).v();
                return;
            case 6:
                p5 p5Var = (p5) obj;
                ArrayList arrayList = new ArrayList(p5Var.f31464c);
                p5Var.f31464c.clear();
                MessagesStorage.getInstance(p5Var.e).getStorageQueue().postRunnable(new m5(p5Var, arrayList, 0));
                p5Var.d = null;
                return;
            case 7:
                ((r5) obj).invalidate();
                return;
            case 8:
                ((o1.j) obj).h();
                return;
            case 9:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f32491f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f32491f = null;
                    s6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((l8) obj).f30136n.f30444n.setVisibility(8);
                return;
            case 11:
                ((r8) obj).f32170c.e1();
                return;
            case 12:
                ja jaVar = (ja) obj;
                jaVar.f29589o = true;
                jaVar.d.invalidate();
                return;
            case 13:
                ia iaVar = (ia) obj;
                if (!iaVar.f29275a) {
                    ja jaVar2 = iaVar.d;
                    Bitmap[] bitmapArr = jaVar2.f29582g;
                    Canvas[] canvasArr = jaVar2.h;
                    jaVar2.f29582g = jaVar2.f29581f;
                    jaVar2.h = jaVar2.f29583i;
                    jaVar2.f29581f = bitmapArr;
                    jaVar2.f29583i = canvasArr;
                    jaVar2.f29585k = false;
                    fi.f6 f6Var = jaVar2.d;
                    if (f6Var != null) {
                        f6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                la laVar = ((ra) obj).f32205t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 15:
                la laVar2 = (la) obj;
                laVar2.f30212o = laVar2.f30211n.f31823b;
                laVar2.d();
                return;
            case 16:
                qc qcVar = ((jb) obj).f29613b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.v) {
                    qcVar.i(true);
                    return;
                }
                return;
            case 17:
                hd hdVar = (hd) obj;
                hdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    hdVar.invalidateSelf();
                    return;
                }
                return;
            case 18:
                jd jdVar = (jd) obj;
                if (jdVar.f29657o1) {
                    jdVar.f29657o1 = false;
                    jdVar.invalidate();
                    return;
                }
                return;
            case 19:
                int i11 = ChatActivityEnterView.f25845r5;
                AndroidUtilities.unlockOrientation((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f32242f;
                int i12 = ChatActivityEnterView.f25845r5;
                chatActivityEnterView2.m1();
                return;
            case 22:
                ((ah) obj).f26554s = null;
                return;
            case 23:
                ((gi) obj).f28590q0.D1.l();
                return;
            case 24:
                nk nkVar = (nk) ((androidx.mediarouter.app.g) obj).f2942b;
                try {
                    File file = nkVar.O;
                    if (file == null) {
                        nkVar.R();
                    } else {
                        nkVar.Q(file);
                    }
                    nkVar.Y();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((jm) obj).f29694b;
                boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
                chatAttachAlertPhotoLayout2.q0(-1, true);
                return;
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((gm) obj).f28653c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f30254b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 27:
                cn cnVar = (cn) obj;
                ti tiVar = cnVar.f30254b;
                if (cnVar.Q && (chatAttachAlertPhotoLayout = tiVar.f33002j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.f26027c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    return;
                }
                return;
            case 28:
                go goVar = (go) obj;
                goVar.l1 = -1;
                goVar.f28682k1 = null;
                return;
            default:
                ((ap) obj).n();
                return;
        }
    }
}
