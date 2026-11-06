package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class f implements Runnable {
    public final int f33408a;
    public final Object f33409b;
    public final Object f33410c;

    public f(int i7, Object obj, Object obj2) {
        this.f33408a = i7;
        this.f33410c = obj;
        this.f33409b = obj2;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33408a) {
            case 0:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f33409b;
                org.telegram.messenger.e eVar = ((g0) this.f33410c).f33687m2;
                eVar.f22124b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f22123a).sendRequest(savetone, null);
                return;
            case 1:
                s sVar = (s) this.f33410c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.f33409b;
                sVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(tL_aiComposeTone2.author_id));
                    sVar.dismiss();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ru0 ru0Var = (org.telegram.ui.ru0) this.f33409b;
                if (((boolean[]) this.f33410c)[0]) {
                    ru0Var.run();
                    return;
                }
                return;
            case 3:
                cc ccVar = (cc) this.f33410c;
                CharSequence charSequence = (CharSequence) this.f33409b;
                ccVar.f32531n = true;
                gb gbVar = ccVar.f32523e;
                if (gbVar instanceof hb) {
                    ib ibVar = (ib) ((hb) gbVar);
                    ibVar.f35252b.setText(charSequence);
                    org.telegram.messenger.g0.V3(ibVar.d, false, false);
                    org.telegram.messenger.g0.V3(ibVar.f35252b, true, false);
                }
                ccVar.i(true);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f33410c;
                Runnable runnable = (Runnable) this.f33409b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((uc) this.f33410c).removeView((fi.m3) this.f33409b);
                return;
            case 6:
                int i7 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) this.f33410c).removeView((fi.m3) this.f33409b);
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f33410c;
                if (chatActivityEnterView.Y4 == ((k60) this.f33409b)) {
                    chatActivityEnterView.Y4 = null;
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f33410c;
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f33409b);
                chatActivityEnterView2.W = null;
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f33410c;
                int i11 = ChatActivityEnterView.s5;
                ((ad) this.f33409b).run();
                org.telegram.messenger.b6.n(chatActivityEnterView3.Q, chatActivityEnterView3.Q2);
                return;
            case 10:
                xf xfVar = (xf) this.f33409b;
                ChatActivityEnterView chatActivityEnterView4 = ((ag) this.f33410c).f31804b0;
                chatActivityEnterView4.f31061i1 = chatActivityEnterView4.f31055h1.getAudioRightMs() - chatActivityEnterView4.f31055h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView4.f31055h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView4.f31055h1.getAudioRightMs();
                if (B.H1) {
                    e0.g gVar = B.F1;
                    if (gVar != null) {
                        vi.h hVar = (vi.h) gVar.f10054e;
                        hVar.getClass();
                        vi.h.q();
                        if (hVar.G == 5) {
                            long j10 = hVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(hVar.f57451c, j10)) {
                                hVar.f57464r = max;
                                hVar.f57465s = max2;
                                l2.i0 i0Var = hVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                hVar.f57453f.getClass();
                                hVar.m();
                                org.telegram.messenger.g0.h3(xfVar);
                                return;
                            }
                            jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(xfVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(xfVar);
                    return;
                } else if (B.f21271j1 == null) {
                    org.telegram.messenger.g0.h3(xfVar);
                    return;
                } else {
                    File z9 = org.telegram.messenger.w7.z(1);
                    B.M1.c(new org.telegram.messenger.l9(B, new org.telegram.messenger.pe(0, z9, System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f21263f1)), audioLeftMs, audioRightMs, xfVar, 3));
                    return;
                }
            case 11:
                ((di) this.f33410c).f28615b.removeView((fi.m3) this.f33409b);
                return;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f33409b;
                ((di) this.f33410c).a(true);
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f33409b;
                if (!((di) this.f33410c).I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 14:
                di diVar = (di) this.f33410c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((wh) this.f33409b).f39969c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                diVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(diVar.D3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f25791b;
                if (tL_attachMenuBots != null) {
                    long j11 = b02.f25788a;
                    b02.getMessagesStorage().f26688a.c(new org.telegram.messenger.ik(b02.f25799e, 2, j11, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 15:
                di diVar2 = (di) this.f33410c;
                org.telegram.messenger.ui.b0(diVar2.D3).E0(false, true, null);
                if (diVar2.f32955s2 == diVar2.f32951r2.get(((TLRPC.TL_attachMenuBot) this.f33409b).bot_id)) {
                    diVar2.F1(diVar2.f32895a2);
                    return;
                }
                return;
            case 16:
                ni niVar = (ni) this.f33410c;
                niVar.G = false;
                niVar.H = (ArrayList) this.f33409b;
                niVar.T();
                return;
            case 17:
                org.telegram.messenger.g0.h3(new f(18, (ej) this.f33410c, ((dj) this.f33409b).run()));
                return;
            case 18:
                ((ej) this.f33410c).setStatus((CharSequence) this.f33409b);
                return;
            case 19:
                uj ujVar = (uj) this.f33410c;
                String str = (String) this.f33409b;
                ujVar.getClass();
                ArrayList arrayList = new ArrayList(ujVar.X.f38966w.f36612e);
                if (ujVar.X.f38966w.f36613f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) ujVar.X.f38966w.h);
                }
                Utilities.f21335g.c(new org.telegram.ui.vn(ujVar, str, !ujVar.R.isEmpty(), arrayList, 4));
                return;
            case 20:
                uj ujVar2 = (uj) this.f33410c;
                ArrayList arrayList2 = (ArrayList) this.f33409b;
                vj vjVar = ujVar2.X;
                boolean z10 = vjVar.f38958b0;
                kj kjVar = vjVar.f38964r;
                if (z10) {
                    v4.g0 adapter = kjVar.getAdapter();
                    uj ujVar3 = vjVar.D;
                    if (adapter != ujVar3) {
                        kjVar.setAdapter(ujVar3);
                    }
                }
                ujVar2.f38668s = arrayList2;
                ujVar2.f();
                return;
            case 21:
                di diVar3 = ((ik) this.f33410c).f38948b;
                diVar3.dismiss();
                diVar3.W1.presentFragment(org.telegram.ui.an.ra(((TLRPC.User) this.f33409b).f27101id));
                return;
            case 22:
                org.telegram.messenger.k5.o(null, 2131743202, new hc((ik) this.f33410c, (org.telegram.ui.ActionBar.f6) this.f33409b), 2131623993, 36);
                return;
            case 23:
                wk wkVar = (wk) this.f33410c;
                float[] fArr = (float[]) this.f33409b;
                wkVar.getClass();
                wkVar.h0(fArr[0], fArr[1]);
                return;
            case 24:
                vh vhVar = (vh) this.f33409b;
                boolean z11 = ChatAttachAlertPhotoLayout.f31183q1;
                int currentItemTop = vhVar.getCurrentItemTop();
                int listTopPadding = vhVar.getListTopPadding();
                jl jlVar = ((ChatAttachAlertPhotoLayout) this.f33410c).E;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                jlVar.scrollBy(0, listTopPadding);
                return;
            case 25:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33409b;
                ql qlVar = ((ChatAttachAlertPhotoLayout) this.f33410c).P;
                if (qlVar != null) {
                    qlVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 26:
                vh vhVar2 = (vh) this.f33409b;
                int currentItemTop2 = vhVar2.getCurrentItemTop();
                int listTopPadding2 = vhVar2.getListTopPadding();
                bi.q1 q1Var = ((bm) this.f33410c).f32165r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                q1Var.scrollBy(0, listTopPadding2);
                return;
            case 27:
                pn.a(((nn) this.f33410c).f36343c);
                ((kg.g) this.f33409b).run();
                return;
            case 28:
                ((ro) this.f33410c).f37755b.R0((ArrayList) this.f33409b);
                return;
            default:
                ((so) this.f33410c).f38089b.R0((ArrayList) this.f33409b);
                return;
        }
    }
}
