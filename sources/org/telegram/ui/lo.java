package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lo implements Runnable {
    public final int f47402a;
    public final Object f47403b;
    public final Object f47404c;

    public lo(int i3, Object obj, Object obj2) {
        this.f47402a = i3;
        this.f47403b = obj;
        this.f47404c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f47402a) {
            case 0:
                ((mo) this.f47403b).f47718y.d.P = false;
                ((org.telegram.ui.Components.a70) this.f47404c).run();
                return;
            case 1:
                qo qoVar = ((mo) this.f47403b).f47718y.d;
                qoVar.P = false;
                qoVar.Q = false;
                ((Runnable) this.f47404c).run();
                return;
            case 2:
                mo moVar = (mo) this.f47403b;
                moVar.getClass();
                ((TLRPC.Chat) this.f47404c).join_request = true;
                moVar.h = true;
                moVar.f32108c.setChecked(true);
                return;
            case 3:
                nq nqVar = (nq) this.f47403b;
                nqVar.getClass();
                nqVar.getMessagesController().V2(0, ((TLRPC.Updates) this.f47404c).chats.get(0).f27001id, true);
                return;
            case 4:
                TLRPC.User user = (TLRPC.User) this.f47404c;
                nq nqVar2 = ((bq) this.f47403b).f44124a;
                if (org.telegram.ui.Components.fc.a(nqVar2)) {
                    org.telegram.ui.Components.fc.C(user.first_name, nqVar2).j();
                    return;
                }
                return;
            case 5:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f47404c;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.e0) this.f47403b).f33246n2;
                eVar.f22272b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f22271a).sendRequest(savetone, null);
                return;
            case 6:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f47403b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.f47404c;
                rVar.getClass();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(tL_aiComposeTone2.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 7:
                pu0 pu0Var = (pu0) this.f47404c;
                if (((boolean[]) this.f47403b)[0]) {
                    pu0Var.run();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.f47403b;
                CharSequence charSequence = (CharSequence) this.f47404c;
                acVar.f31796n = true;
                org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                if (fbVar instanceof org.telegram.ui.Components.gb) {
                    org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) ((org.telegram.ui.Components.gb) fbVar);
                    hbVar.f34651b.setText(charSequence);
                    org.telegram.messenger.g0.V3(hbVar.d, false, false);
                    org.telegram.messenger.g0.V3(hbVar.f34651b, true, false);
                }
                acVar.i(true);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.f47403b;
                Runnable runnable = (Runnable) this.f47404c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 10:
                ((org.telegram.ui.Components.sc) this.f47403b).removeView((gi.l3) this.f47404c);
                return;
            case 11:
                int i3 = ChatActivityEnterView.f31082t5;
                ((ChatActivityEnterView) this.f47403b).removeView((gi.l3) this.f47404c);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f47403b;
                if (chatActivityEnterView.Z4 == ((org.telegram.ui.Components.f60) this.f47404c)) {
                    chatActivityEnterView.Z4 = null;
                    return;
                }
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f47403b;
                int i10 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f47404c);
                chatActivityEnterView2.f31084a0 = null;
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f47403b;
                int i11 = ChatActivityEnterView.f31082t5;
                ((org.telegram.ui.Components.yc) this.f47404c).run();
                org.telegram.messenger.b6.n(chatActivityEnterView3.R, chatActivityEnterView3.R2);
                return;
            case 15:
                org.telegram.ui.Components.vf vfVar = (org.telegram.ui.Components.vf) this.f47404c;
                ChatActivityEnterView chatActivityEnterView4 = ((org.telegram.ui.Components.yf) this.f47403b).f40698c0;
                chatActivityEnterView4.f31141j1 = chatActivityEnterView4.f31136i1.getAudioRightMs() - chatActivityEnterView4.f31136i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView4.f31136i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView4.f31136i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        vi.j jVar = (vi.j) gVar.f9236e;
                        jVar.getClass();
                        vi.j.q();
                        if (jVar.G == 5) {
                            long j11 = jVar.j();
                            long max = Math.max(0L, Math.min(j11, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j11, audioRightMs));
                            j10 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f56983c, j11)) {
                                jVar.f56996r = max;
                                jVar.f56997s = max2;
                                k2.i0 i0Var = jVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                jVar.f56985f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.h3(vfVar);
                                return;
                            }
                            k2.p1.r(j10, a1.g.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(vfVar);
                            return;
                        }
                    }
                    j10 = audioRightMs;
                    k2.p1.r(j10, a1.g.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(vfVar);
                    return;
                } else if (B.k1 == null) {
                    org.telegram.messenger.g0.h3(vfVar);
                    return;
                } else {
                    File z10 = org.telegram.messenger.w7.z(1);
                    B.N1.c(new org.telegram.messenger.f9(B, new org.telegram.messenger.je(0, z10, System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f21319g1)), audioLeftMs, audioRightMs, vfVar, 3));
                    return;
                }
            case 16:
                ((org.telegram.ui.Components.bi) this.f47403b).f28586b.removeView((gi.l3) this.f47404c);
                return;
            case 17:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f47404c;
                ((org.telegram.ui.Components.bi) this.f47403b).a(true);
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f47404c;
                if (!((org.telegram.ui.Components.bi) this.f47403b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) this.f47403b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.uh) this.f47404c).f38747c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                biVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(biVar.E3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f24011b;
                if (tL_attachMenuBots != null) {
                    long j12 = b02.f24008a;
                    b02.getMessagesStorage().f24934a.c(new org.telegram.messenger.yj(b02.f24019e, 2, j12, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.bi biVar2 = (org.telegram.ui.Components.bi) this.f47403b;
                org.telegram.messenger.li.b0(biVar2.E3).E0(false, true, null);
                if (biVar2.f32275t2 == biVar2.f32271s2.get(((TLRPC.TL_attachMenuBot) this.f47404c).bot_id)) {
                    biVar2.F1(biVar2.f32215b2);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) this.f47403b;
                niVar.H = false;
                niVar.I = (ArrayList) this.f47404c;
                niVar.T();
                return;
            case 22:
                org.telegram.messenger.g0.h3(new lo(23, (org.telegram.ui.Components.dj) this.f47403b, ((org.telegram.ui.Components.cj) this.f47404c).run()));
                return;
            case 23:
                ((org.telegram.ui.Components.dj) this.f47403b).setStatus((CharSequence) this.f47404c);
                return;
            case 24:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.f47403b;
                String str = (String) this.f47404c;
                tjVar.getClass();
                ArrayList arrayList = new ArrayList(tjVar.Y.f38772w.f36567e);
                if (tjVar.Y.f38772w.f36568f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) tjVar.Y.f38772w.h);
                }
                Utilities.f21389g.c(new rn(tjVar, str, !tjVar.S.isEmpty(), arrayList, 4));
                return;
            case 25:
                org.telegram.ui.Components.tj tjVar2 = (org.telegram.ui.Components.tj) this.f47403b;
                ArrayList arrayList2 = (ArrayList) this.f47404c;
                org.telegram.ui.Components.uj ujVar = tjVar2.Y;
                boolean z11 = ujVar.f38764c0;
                org.telegram.ui.Components.jj jjVar = ujVar.f38770r;
                if (z11) {
                    u4.h0 adapter = jjVar.getAdapter();
                    org.telegram.ui.Components.tj tjVar3 = ujVar.E;
                    if (adapter != tjVar3) {
                        jjVar.setAdapter(tjVar3);
                    }
                }
                tjVar2.f38425s = arrayList2;
                tjVar2.f();
                return;
            case 26:
                org.telegram.ui.Components.bi biVar3 = ((org.telegram.ui.Components.hk) this.f47403b).f38416b;
                biVar3.dismiss();
                biVar3.X1.presentFragment(wm.ra(((TLRPC.User) this.f47404c).f27150id));
                return;
            case 27:
                org.telegram.messenger.k5.o(null, 2131743211, new org.telegram.ui.Components.fc((org.telegram.ui.Components.hk) this.f47403b, (org.telegram.ui.ActionBar.e6) this.f47404c), 2131623993, 36);
                return;
            case 28:
                org.telegram.ui.Components.uk ukVar = (org.telegram.ui.Components.uk) this.f47403b;
                float[] fArr = (float[]) this.f47404c;
                ukVar.getClass();
                ukVar.h0(fArr[0], fArr[1]);
                return;
            default:
                org.telegram.ui.Components.th thVar = (org.telegram.ui.Components.th) this.f47404c;
                boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                int currentItemTop = thVar.getCurrentItemTop();
                int listTopPadding = thVar.getListTopPadding();
                org.telegram.ui.Components.il ilVar = ((ChatAttachAlertPhotoLayout) this.f47403b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ilVar.scrollBy(0, listTopPadding);
                return;
        }
    }
}
