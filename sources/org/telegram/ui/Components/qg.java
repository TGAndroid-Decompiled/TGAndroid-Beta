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
public final class qg implements Runnable {
    public final int f28589a;
    public final Object f28590b;

    public qg(Object obj, int i10) {
        this.f28589a = i10;
        this.f28590b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f28589a;
        Object obj = this.f28590b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f22960s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22914k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                zc zcVar = (zc) obj;
                new sg.y0(zcVar.W(), 42, zcVar.f31837c).show();
                return;
            case 2:
                AndroidUtilities.removeFromParent((di.d4) obj);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = s5.f29018q;
                ((s5) obj).v();
                return;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.f27843c);
                o5Var.f27843c.clear();
                MessagesStorage.getInstance(o5Var.e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 0));
                o5Var.d = null;
                return;
            case 6:
                ((q5) obj).invalidate();
                return;
            case 7:
                ((o1.k) obj).h();
                return;
            case 8:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f29046f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f29046f = null;
                    s6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((l8) obj).f26975n.f27248n.setVisibility(8);
                return;
            case 10:
                ((s8) obj).f29062c.l1();
                return;
            case 11:
                ha haVar = (ha) obj;
                haVar.f25595o = true;
                haVar.d.invalidate();
                return;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.f25241a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.f25588g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.f25588g = haVar2.f25587f;
                    haVar2.h = haVar2.f25589i;
                    haVar2.f25587f = bitmapArr;
                    haVar2.f25589i = canvasArr;
                    haVar2.f25591k = false;
                    di.p6 p6Var = haVar2.d;
                    if (p6Var != null) {
                        p6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                la laVar = ((ra) obj).f28797t;
                if (laVar != null) {
                    laVar.d();
                    return;
                }
                return;
            case 14:
                la laVar2 = (la) obj;
                laVar2.f27012o = laVar2.f27011n.f28562b;
                laVar2.d();
                return;
            case 15:
                sc scVar = ((lb) obj).f27017b;
                wb wbVar = scVar.e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.f29113u) {
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
                md mdVar = (md) obj;
                if (mdVar.f27369o1) {
                    mdVar.f27369o1 = false;
                    mdVar.invalidate();
                    return;
                }
                return;
            case 18:
                ((Dialog) obj).dismiss();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f29367f;
                int i11 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView2.o1();
                return;
            case 20:
                ((bh) obj).f23760s = null;
                return;
            case 21:
                ((li) obj).B0.D1.l();
                return;
            case 22:
                pk pkVar = (pk) ((androidx.mediarouter.app.f) obj).f1872b;
                try {
                    File file = pkVar.O;
                    if (file == null) {
                        pkVar.R();
                    } else {
                        pkVar.Q(file);
                    }
                    pkVar.Y();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((lm) obj).f27069b;
                boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                return;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((im) obj).f25994c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.f27671b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 25:
                en enVar = (en) obj;
                vi viVar = enVar.f27671b;
                if (enVar.Q && (chatAttachAlertPhotoLayout = viVar.f30013j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.f23028c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    return;
                }
                return;
            case 26:
                io ioVar = (io) obj;
                ioVar.f26022k1 = -1;
                ioVar.f26020j1 = null;
                return;
            case 27:
                ((bp) obj).n();
                return;
            case 28:
                ((dp) obj).setVisibility(8);
                return;
            default:
                ((cq) obj).f24188b.a();
                return;
        }
    }
}
