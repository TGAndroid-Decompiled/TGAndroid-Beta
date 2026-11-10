package org.telegram.ui;

import android.widget.FrameLayout;
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
public final class fq implements Runnable {
    public final int f45820a;
    public final Object f45821b;
    public final Object f45822c;

    public fq(int i7, Object obj, Object obj2) {
        this.f45820a = i7;
        this.f45821b = obj;
        this.f45822c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f45820a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f45822c;
                rq rqVar = ((gq) this.f45821b).f46144a;
                if (org.telegram.ui.Components.gc.a(rqVar)) {
                    org.telegram.ui.Components.gc.C(user.first_name, rqVar).j();
                    return;
                }
                return;
            case 1:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f45822c;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.f0) this.f45821b).f33419p2;
                eVar.f22159b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f22158a).sendRequest(savetone, null);
                return;
            case 2:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f45821b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.f45822c;
                rVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 3:
                uu0 uu0Var = (uu0) this.f45822c;
                if (((boolean[]) this.f45821b)[0]) {
                    uu0Var.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.bc bcVar = (org.telegram.ui.Components.bc) this.f45821b;
                CharSequence charSequence = (CharSequence) this.f45822c;
                bcVar.f32207n = true;
                org.telegram.ui.Components.fb fbVar = bcVar.f32199e;
                if (fbVar instanceof org.telegram.ui.Components.gb) {
                    org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) ((org.telegram.ui.Components.gb) fbVar);
                    hbVar.f34883b.setText(charSequence);
                    org.telegram.messenger.g0.V3(hbVar.d, false, false);
                    org.telegram.messenger.g0.V3(hbVar.f34883b, true, false);
                }
                bcVar.i(true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f45821b;
                Runnable runnable = (Runnable) this.f45822c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((org.telegram.ui.Components.tc) this.f45821b).removeView((fi.m3) this.f45822c);
                return;
            case 7:
                int i7 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) this.f45821b).removeView((fi.m3) this.f45822c);
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f45821b;
                if (chatActivityEnterView.Y4 == ((org.telegram.ui.Components.k60) this.f45822c)) {
                    chatActivityEnterView.Y4 = null;
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f45821b;
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f45822c);
                chatActivityEnterView2.W = null;
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f45821b;
                int i11 = ChatActivityEnterView.s5;
                ((org.telegram.ui.Components.zc) this.f45822c).run();
                org.telegram.messenger.b6.n(chatActivityEnterView3.Q, chatActivityEnterView3.Q2);
                return;
            case 11:
                org.telegram.ui.Components.wf wfVar = (org.telegram.ui.Components.wf) this.f45822c;
                ChatActivityEnterView chatActivityEnterView4 = ((org.telegram.ui.Components.zf) this.f45821b).f40935b0;
                chatActivityEnterView4.f31082i1 = chatActivityEnterView4.f31076h1.getAudioRightMs() - chatActivityEnterView4.f31076h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView4.f31076h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView4.f31076h1.getAudioRightMs();
                if (B.H1) {
                    e0.g gVar = B.F1;
                    if (gVar != null) {
                        vi.h hVar = (vi.h) gVar.f10059e;
                        hVar.getClass();
                        vi.h.q();
                        if (hVar.G == 5) {
                            long j10 = hVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(hVar.f57554c, j10)) {
                                hVar.f57567r = max;
                                hVar.f57568s = max2;
                                l2.i0 i0Var = hVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                hVar.f57556f.getClass();
                                hVar.m();
                                org.telegram.messenger.g0.h3(wfVar);
                                return;
                            }
                            jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(wfVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(wfVar);
                    return;
                } else if (B.f21279j1 == null) {
                    org.telegram.messenger.g0.h3(wfVar);
                    return;
                } else {
                    File z9 = org.telegram.messenger.w7.z(1);
                    B.M1.c(new org.telegram.messenger.l9(B, new org.telegram.messenger.pe(0, z9, System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f21271f1)), audioLeftMs, audioRightMs, wfVar, 3));
                    return;
                }
            case 12:
                ((org.telegram.ui.Components.ci) this.f45821b).f28672b.removeView((fi.m3) this.f45822c);
                return;
            case 13:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f45822c;
                ((org.telegram.ui.Components.ci) this.f45821b).a(true);
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f45822c;
                if (!((org.telegram.ui.Components.ci) this.f45821b).I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) this.f45821b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.vh) this.f45822c).f39007c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                ciVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ciVar.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f25806b;
                if (tL_attachMenuBots != null) {
                    long j11 = b02.f25803a;
                    b02.getMessagesStorage().f26723a.c(new org.telegram.messenger.hk(b02.f25814e, 2, j11, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.ci ciVar2 = (org.telegram.ui.Components.ci) this.f45821b;
                org.telegram.messenger.ui.b0(ciVar2.G3).E0(false, true, null);
                if (ciVar2.f32660v2 == ciVar2.f32656u2.get(((TLRPC.TL_attachMenuBot) this.f45822c).bot_id)) {
                    ciVar2.F1(ciVar2.d2);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) this.f45821b;
                miVar.G = false;
                miVar.H = (ArrayList) this.f45822c;
                miVar.T();
                return;
            case 18:
                org.telegram.messenger.g0.h3(new fq(19, (org.telegram.ui.Components.dj) this.f45821b, ((org.telegram.ui.Components.cj) this.f45822c).run()));
                return;
            case 19:
                ((org.telegram.ui.Components.dj) this.f45821b).setStatus((CharSequence) this.f45822c);
                return;
            case 20:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.f45821b;
                String str = (String) this.f45822c;
                tjVar.getClass();
                ArrayList arrayList = new ArrayList(tjVar.X.f38700w.f36318e);
                if (tjVar.X.f38700w.f36319f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) tjVar.X.f38700w.h);
                }
                Utilities.f21343g.c(new xn(tjVar, str, !tjVar.R.isEmpty(), arrayList, 4));
                return;
            case 21:
                org.telegram.ui.Components.tj tjVar2 = (org.telegram.ui.Components.tj) this.f45821b;
                ArrayList arrayList2 = (ArrayList) this.f45822c;
                org.telegram.ui.Components.uj ujVar = tjVar2.X;
                boolean z10 = ujVar.f38692b0;
                org.telegram.ui.Components.jj jjVar = ujVar.f38698r;
                if (z10) {
                    v4.g0 adapter = jjVar.getAdapter();
                    org.telegram.ui.Components.tj tjVar3 = ujVar.D;
                    if (adapter != tjVar3) {
                        jjVar.setAdapter(tjVar3);
                    }
                }
                tjVar2.f38319s = arrayList2;
                tjVar2.f();
                return;
            case 22:
                org.telegram.ui.Components.ci ciVar3 = ((org.telegram.ui.Components.hk) this.f45821b).f38656b;
                ciVar3.dismiss();
                ciVar3.Z1.presentFragment(cn.ta(((TLRPC.User) this.f45822c).f27109id));
                return;
            case 23:
                org.telegram.messenger.k5.o(null, 2131743201, new org.telegram.ui.Components.gc((org.telegram.ui.Components.hk) this.f45821b, (org.telegram.ui.ActionBar.h6) this.f45822c), 2131623993, 36);
                return;
            case 24:
                org.telegram.ui.Components.vk vkVar = (org.telegram.ui.Components.vk) this.f45821b;
                float[] fArr = (float[]) this.f45822c;
                vkVar.getClass();
                vkVar.h0(fArr[0], fArr[1]);
                return;
            case 25:
                org.telegram.ui.Components.uh uhVar = (org.telegram.ui.Components.uh) this.f45822c;
                boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
                int currentItemTop = uhVar.getCurrentItemTop();
                int listTopPadding = uhVar.getListTopPadding();
                org.telegram.ui.Components.il ilVar = ((ChatAttachAlertPhotoLayout) this.f45821b).E;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ilVar.scrollBy(0, listTopPadding);
                return;
            case 26:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f45822c;
                org.telegram.ui.Components.pl plVar = ((ChatAttachAlertPhotoLayout) this.f45821b).P;
                if (plVar != null) {
                    plVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.uh uhVar2 = (org.telegram.ui.Components.uh) this.f45822c;
                int currentItemTop2 = uhVar2.getCurrentItemTop();
                int listTopPadding2 = uhVar2.getListTopPadding();
                bi.q1 q1Var = ((org.telegram.ui.Components.am) this.f45821b).f31880r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                q1Var.scrollBy(0, listTopPadding2);
                return;
            case 28:
                org.telegram.ui.Components.on.a(((org.telegram.ui.Components.mn) this.f45821b).f36020c);
                ((kg.g) this.f45822c).run();
                return;
            default:
                ((org.telegram.ui.Components.qo) this.f45821b).f37362b.R0((ArrayList) this.f45822c);
                return;
        }
    }
}
