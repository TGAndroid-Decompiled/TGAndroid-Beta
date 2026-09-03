package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gy implements Runnable {
    public final int f27295a;
    public final int f27296b;
    public final Object f27297c;
    public final Object d;

    public gy(int i10, Object obj, Object obj2, int i11) {
        this.f27295a = i11;
        this.f27296b = i10;
        this.f27297c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i10;
        o11 o11Var = (o11) this.f27297c;
        String str = (String) this.d;
        int i11 = this.f27296b;
        n11 n11Var = o11Var.f29640r.f25070n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                o11Var.d = -1;
                AndroidUtilities.runOnUIThread(new dg.u1((Object) o11Var, o11Var.d, new ArrayList(), (Serializable) new ArrayList(), 28));
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
            if (translitString != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i12 = i10 + 1;
            String[] strArr = new String[i12];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = n11Var.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList3 = (ArrayList) n11Var.d.get(i13);
                String i14 = org.telegram.ui.ActionBar.i5.i(((org.telegram.ui.ActionBar.m6) arrayList3.get(0)).f22145f);
                String lowerCase2 = i14.toLowerCase();
                int i15 = 0;
                while (true) {
                    if (i15 < i12) {
                        String str2 = strArr[i15];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(o11.E(i14, str2));
                            break;
                        }
                        i15++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new dg.u1((Object) o11Var, i11, arrayList, (Serializable) arrayList2, 28));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    private final void b() {
        org.telegram.ui.ny nyVar = (org.telegram.ui.ny) this.f27297c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.oy oyVar = nyVar.f39479g;
        org.telegram.ui.py pyVar = nyVar.h;
        pyVar.P1 = true;
        pyVar.getMessagesController().addDialogToFolder(dialog.f20849id, 0, this.f27296b, 0L);
        pyVar.P1 = false;
        ArrayList<TLRPC.Dialog> dialogs = pyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = pyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                pyVar.A4(true, true);
                oyVar.f39831x.D();
                oyVar.q(true);
                pyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    pyVar.A4(true, true);
                    oyVar.q(true);
                    pyVar.o3();
                    return;
                }
                if (!pyVar.O1.isEmpty()) {
                    pyVar.O1.remove(0);
                }
                oyVar.f39831x.D();
                oyVar.q(true);
                return;
            }
            return;
        }
        oyVar.q(false);
    }

    private final void c() {
        org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f27297c;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var == null) {
            return;
        }
        d2Var.setOnCancelListener(new mh.v(d60Var, this.f27296b, 6));
        d2VarArr[0].show();
    }

    private final void e() {
        LaunchActivity launchActivity = (LaunchActivity) this.f27297c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.f34134y1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z4 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f27296b;
            if (z4) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    private final void f() {
        boolean z4;
        org.telegram.ui.ii iiVar = (org.telegram.ui.ii) this.f27297c;
        TLObject tLObject = (TLObject) this.d;
        if (tLObject instanceof TLRPC.User) {
            iiVar.f41241a = (TLRPC.User) tLObject;
            MessagesController.getInstance(this.f27296b).putUser(iiVar.f41241a, false);
        }
        u00 u00Var = iiVar.f41243c;
        g90 g90Var = iiVar.f41242b;
        if (iiVar.f41241a != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        iiVar.setEnabled(z4);
        TLRPC.User user = iiVar.f41241a;
        if (user != null) {
            g90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new hg.y1(iiVar, user.f20992id, 22)));
        }
        g90Var.animate().alpha(1.0f).setDuration(220L).start();
        u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new x20(u00Var)).start();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gy.run():void");
    }

    public gy(Object obj, int i10, Object obj2, int i11) {
        this.f27295a = i11;
        this.f27297c = obj;
        this.f27296b = i10;
        this.d = obj2;
    }

    public gy(Object obj, Object obj2, int i10, int i11) {
        this.f27295a = i11;
        this.f27297c = obj;
        this.d = obj2;
        this.f27296b = i10;
    }
}
