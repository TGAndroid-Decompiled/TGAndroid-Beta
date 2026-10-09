package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n31 implements Runnable {
    public final int f40067a;
    public final Object f40068b;
    public final Object f40069c;

    public n31(int i10, Object obj, Object obj2) {
        this.f40067a = i10;
        this.f40068b = obj;
        this.f40069c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.am0 am0Var;
        int i10 = this.f40067a;
        int i11 = 0;
        Object obj = this.f40069c;
        Object obj2 = this.f40068b;
        switch (i10) {
            case 0:
                b41 b41Var = (b41) ((View[]) obj2)[0];
                b41Var.f36132b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                b41Var.f36133c = null;
                b41Var.d = null;
                b41Var.f36135f.W2.N(false);
                return;
            case 1:
                ((b41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 2:
                b41 b41Var2 = (b41) ((View[]) obj2)[0];
                b41Var2.f36132b = null;
                b41Var2.f36133c = (TLRPC.TL_reportResultChooseOption) obj;
                b41Var2.d = null;
                b41Var2.f36135f.W2.N(false);
                return;
            case 3:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.ad) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 4:
                org.telegram.ui.Components.ad.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ci0) obj);
                return;
            case 5:
                ((SecretMediaViewer) obj2).M = false;
                ((ev0) obj).f37356a.setVisible(false, true);
                return;
            case 6:
                ((SecretMediaViewer) ((n6.t) obj2).f16718c).h((File) obj);
                return;
            case 7:
                k71 k71Var = (k71) obj2;
                k71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, k71Var.L0));
                Runnable runnable = k71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.ad.a0((i91) obj2).k(false).j();
                return;
            case 9:
                i91.W((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 10:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.f36186b1;
                Activity parentActivity = i91Var.getParentActivity();
                v8 v8Var = i91Var.f38582b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f20042id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.ad.x(parentActivity, v8Var, m10, j3, b91Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (pc) obj).show();
                return;
            case 12:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 13:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 14:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.i6.f21139w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f21139w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f21158x), Double.valueOf(org.telegram.ui.ActionBar.i6.f21175y));
                }
                org.telegram.ui.ActionBar.i6.r1();
                org.telegram.ui.Components.qm0 qm0Var = themeActivity2.f34531b;
                if (qm0Var != null && (am0Var = (org.telegram.ui.Components.am0) qm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = am0Var.f47658a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f21139w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.f43975n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    return;
                }
                return;
            case 16:
                ce1.X((ce1) obj2, (String) obj);
                return;
            case 17:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 18:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                return;
            case 19:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                return;
            case 20:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.f39568b;
                bundle.putLong("dialog_id", -fg1Var.f37558a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20090id);
                fg1Var.presentFragment(new v11(bundle, null));
                return;
            case 21:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.f36315c0;
                fg1 fg1Var2 = bg1Var.f36331t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.f37561b;
                    if (i12 < arrayList3.size()) {
                        if (((wf1) arrayList3.get(i12)).f43570c != null && ((wf1) arrayList3.get(i12)).f43570c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i12)).f43570c);
                            ((wf1) arrayList3.get(i12)).f43570c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.L();
                        if (!arrayList.isEmpty()) {
                            bg1Var.f36324l0 = false;
                            bg1Var.f36326o0.b(0);
                        }
                        bg1Var.J(str2);
                        return;
                    }
                }
                break;
            case 22:
                ig1 ig1Var = ((hg1) obj2).f38329b;
                ig1Var.f38636a.f39577e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20090id));
                ig1Var.f38636a.V();
                return;
            case 23:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 24:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 25:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 26:
                ih1.g0((ih1) obj2, (String) obj);
                return;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                es[] esVarArr = ((ih1) obj2).f38660w.f36734f;
                int length = esVarArr.length;
                while (i11 < length) {
                    esVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable2.run();
                return;
            case 28:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f40812f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.f40811e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.f40808a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.f40810c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            default:
                wi1 wi1Var = (wi1) obj2;
                wi1Var.U.a(new ei1(wi1Var, (VoIPService) obj, 1), true);
                return;
        }
    }

    public n31(b91 b91Var, a0.i iVar, int i10) {
        this.f40067a = 10;
        this.f40068b = b91Var;
        this.f40069c = iVar;
    }
}
