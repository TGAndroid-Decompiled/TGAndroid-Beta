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
public final class my implements Runnable {
    public final int f25313a;
    public final int f25314b;
    public final Object f25315c;
    public final Object d;

    public my(int i10, Object obj, Object obj2, int i11) {
        this.f25313a = i11;
        this.f25314b = i10;
        this.f25315c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i10;
        y11 y11Var = (y11) this.f25315c;
        String str = (String) this.d;
        int i11 = this.f25314b;
        x11 x11Var = y11Var.f29224r.f21307n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                y11Var.d = -1;
                AndroidUtilities.runOnUIThread(new di.q((Object) y11Var, y11Var.d, new ArrayList(), (Serializable) new ArrayList(), 29));
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
            int size = x11Var.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList3 = (ArrayList) x11Var.d.get(i13);
                String i14 = org.telegram.ui.ActionBar.i5.i(((org.telegram.ui.ActionBar.l6) arrayList3.get(0)).f18457f);
                String lowerCase2 = i14.toLowerCase();
                int i15 = 0;
                while (true) {
                    if (i15 < i12) {
                        String str2 = strArr[i15];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(y11.E(i14, str2));
                            break;
                        }
                        i15++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new di.q((Object) y11Var, i11, arrayList, (Serializable) arrayList2, 29));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private final void b() {
        org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f25315c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.vy vyVar = uyVar.f37361g;
        org.telegram.ui.wy wyVar = uyVar.h;
        wyVar.S1 = true;
        wyVar.getMessagesController().addDialogToFolder(dialog.f17199id, 0, this.f25314b, 0L);
        wyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = wyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = wyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                wyVar.A4(true, true);
                vyVar.f37653x.D();
                vyVar.q(true);
                wyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    wyVar.A4(true, true);
                    vyVar.q(true);
                    wyVar.o3();
                    return;
                }
                if (!wyVar.R1.isEmpty()) {
                    wyVar.R1.remove(0);
                }
                vyVar.f37653x.D();
                vyVar.q(true);
                return;
            }
            return;
        }
        vyVar.q(false);
    }

    private final void c() {
        org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.f25315c;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var == null) {
            return;
        }
        d2Var.setOnCancelListener(new org.telegram.ui.ba(j60Var, this.f25314b, 5));
        d2VarArr[0].show();
    }

    private final void e() {
        LaunchActivity launchActivity = (LaunchActivity) this.f25315c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f25314b;
            if (z10) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    private final void f() {
        boolean z10;
        org.telegram.ui.oi oiVar = (org.telegram.ui.oi) this.f25315c;
        TLObject tLObject = (TLObject) this.d;
        if (tLObject instanceof TLRPC.User) {
            oiVar.f31270a = (TLRPC.User) tLObject;
            MessagesController.getInstance(this.f25314b).putUser(oiVar.f31270a, false);
        }
        a10 a10Var = oiVar.f31272c;
        m90 m90Var = oiVar.f31271b;
        if (oiVar.f31270a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        oiVar.setEnabled(z10);
        TLRPC.User user = oiVar.f31270a;
        if (user != null) {
            m90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new bi.va(oiVar, user.f17342id, 21)));
        }
        m90Var.animate().alpha(1.0f).setDuration(220L).start();
        a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new yo(a10Var)).start();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.my.run():void");
    }

    public my(Object obj, int i10, Object obj2, int i11) {
        this.f25313a = i11;
        this.f25315c = obj;
        this.f25314b = i10;
        this.d = obj2;
    }

    public my(Object obj, Object obj2, int i10, int i11) {
        this.f25313a = i11;
        this.f25315c = obj;
        this.d = obj2;
        this.f25314b = i10;
    }
}
