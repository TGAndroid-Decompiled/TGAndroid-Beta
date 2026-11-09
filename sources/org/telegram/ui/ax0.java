package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ax0 implements Runnable {
    public final int f43813a;
    public final Object f43814b;
    public final Object f43815c;

    public ax0(int i7, Object obj, Object obj2) {
        this.f43813a = i7;
        this.f43814b = obj;
        this.f43815c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yi0 yi0Var;
        int i7 = this.f43813a;
        int i10 = 0;
        Object obj = this.f43815c;
        Object obj2 = this.f43814b;
        switch (i7) {
            case 0:
                bx0 bx0Var = (bx0) obj2;
                bx0Var.f44156f.add((dx0) obj);
                bx0Var.a();
                return;
            case 1:
                qy0 qy0Var = (qy0) ((View[]) obj2)[0];
                qy0Var.f49217b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                qy0Var.f49218c = null;
                qy0Var.d = null;
                qy0Var.f49220f.f37556f3.O(false);
                return;
            case 2:
                ((qy0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 3:
                qy0 qy0Var2 = (qy0) ((View[]) obj2)[0];
                qy0Var2.f49217b = null;
                qy0Var2.f49218c = (TLRPC.TL_reportResultChooseOption) obj;
                qy0Var2.d = null;
                qy0Var2.f49220f.f37556f3.O(false);
                return;
            case 4:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.hc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 5:
                org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.w80) obj);
                return;
            case 6:
                ((SecretMediaViewer) obj2).K = false;
                ((yq0) obj).f52159a.O0(false, true);
                return;
            case 7:
                ((SecretMediaViewer) ((j2.n) obj2).f16457c).i((File) obj);
                return;
            case 8:
                s11 s11Var = (s11) obj2;
                s11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, s11Var.L0));
                Runnable runnable = s11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.hc.a0((n31) obj2).k(false).j();
                return;
            case 10:
                n31.b0((n31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new u31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                return;
            case 12:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                return;
            case 13:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    return;
                }
                return;
            case 14:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.l6.f28212w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.l6.f28212w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.l6.f28231x), Double.valueOf(org.telegram.ui.ActionBar.l6.f28250y));
                }
                org.telegram.ui.ActionBar.l6.w1();
                org.telegram.ui.Components.qj0 qj0Var = themeActivity2.f42020b;
                if (qj0Var != null && (yi0Var = (org.telegram.ui.Components.yi0) qj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = yi0Var.f57056a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.l6.f28212w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                w71 w71Var = (w71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (w71Var.f50941n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    w71Var.B0.c(w71Var.L0[0]);
                    return;
                }
                return;
            case 16:
                z71.c0((z71) obj2, (String) obj);
                return;
            case 17:
                z71.a0((z71) obj2, (TLRPC.TL_theme) obj);
                return;
            case 18:
                h81 h81Var = (h81) obj2;
                h81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                h81Var.c(true);
                return;
            case 19:
                h81 h81Var2 = (h81) obj2;
                h81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                h81Var2.c(true);
                return;
            case 20:
                f91 f91Var = (f91) obj2;
                f91Var.getClass();
                Bundle bundle = new Bundle();
                y91 y91Var = f91Var.f45671b;
                bundle.putLong("dialog_id", -y91Var.f52013a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f27008id);
                y91Var.presentFragment(new kx0(bundle, null));
                return;
            case 21:
                u91 u91Var = (u91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = u91Var.f50328e0;
                y91 y91Var2 = u91Var.f50344v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = y91Var2.f52016b;
                    if (i11 < arrayList3.size()) {
                        if (((q91) arrayList3.get(i11)).f48989c != null && ((q91) arrayList3.get(i11)).f48989c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((q91) arrayList3.get(i11)).f48989c);
                            ((q91) arrayList3.get(i11)).f48989c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        u91Var.N();
                        if (!arrayList.isEmpty()) {
                            u91Var.f50336n0 = false;
                            u91Var.f50339q0.b(0);
                        }
                        u91Var.L(str2);
                        return;
                    }
                }
                break;
            case 22:
                ba1 ba1Var = ((aa1) obj2).f43657b;
                ba1Var.f43946a.f45350e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f27008id));
                ba1Var.f43946a.a0();
                return;
            case 23:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 24:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 25:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                bb1.l0((bb1) obj2, (String) obj);
                return;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                dr[] drVarArr = ((bb1) obj2).f43969x.f43768f;
                int length = drVarArr.length;
                while (i10 < length) {
                    drVarArr[i10].C(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            case 28:
                gb1 gb1Var = (gb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gb1Var.f45958f;
                ArrayList arrayList5 = gb1Var.f45957e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(gb1Var.f45954a).S3(arrayList5, false);
                gb1Var.d = false;
                gb1Var.f45956c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            default:
                ic1 ic1Var = (ic1) obj2;
                ic1Var.U.a(new rb1(ic1Var, (VoIPService) obj, 1), true);
                return;
        }
    }
}
