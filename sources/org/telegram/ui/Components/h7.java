package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h7 implements Utilities.Callback {
    public final int f23531a;
    public final Object f23532b;
    public final Object f23533c;
    public final Object d;

    public h7(Object obj, Object obj2, Object obj3, int i10) {
        this.f23531a = i10;
        this.f23532b = obj;
        this.f23533c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        String str;
        zh.s4 s4Var;
        int i10 = this.f23531a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.f23533c;
        Object obj4 = this.f23532b;
        switch (i10) {
            case 0:
                j8.K((j8) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 1:
                zn znVar = (zn) obj4;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (eoVar.c()) {
                    d5.L(eoVar.getParentActivity(), eoVar.a(), new androidx.car.app.utils.a(znVar, tL_messageMediaToDo, l4, 24));
                    return;
                }
                znVar.f29750j0.c(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                znVar.f26422b.dismiss(true);
                return;
            case 2:
                qy qyVar = (qy) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i11 < size) {
                    Object obj5 = arrayList3.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(qyVar.f26493a.F.f26805c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList2.add(new jy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 3:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                ly0 ly0Var = (ly0) obj2;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    d2Var.dismiss();
                    return;
                }
                ly0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(ly0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(ly0Var);
                return;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                String str2 = (String) obj3;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj2;
                Boolean bool = (Boolean) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool.booleanValue()) {
                        if (TextUtils.isEmpty(str2)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    c1Var.z(a1Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                wh.m mVar = (wh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new wh.c(mVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, mVar.f44225l0, (List) obj).show();
                return;
            case 6:
                wh.w wVar = (wh.w) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                wVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (wVar.m0 != null) {
                    new wh.c(wVar.getContext(), f6Var, wVar.m0, list).show();
                    wVar.dismiss();
                    return;
                }
                return;
            case 7:
                xh.x3 x3Var = (xh.x3) obj4;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                x3Var.v1(((Long) obj3).longValue(), new h7(x3Var, eVar, (sg.p1[]) obj2, 8));
                return;
            case 8:
                xh.x3 x3Var2 = (xh.x3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj3).b();
                ((sg.p1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.k0(13, x3Var2, tL_error));
                    return;
                } else {
                    x3Var2.dismiss();
                    return;
                }
            case 9:
                zh.l2 l2Var = (zh.l2) obj4;
                l2Var.getClass();
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add((TLRPC.InputStickerSet) obj);
                wv wvVar = new wv(((zh.u7) obj3).f48931f, l2Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList4);
                zh.w2 w2Var = l2Var.f48639z0.Q1;
                if (w2Var != null) {
                    ((zh.l7) w2Var).h(wvVar);
                    return;
                }
                return;
            case 10:
                zh.v2 v2Var = (zh.v2) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                zh.a3 a3Var = v2Var.f48986l;
                if ((storyItem instanceof zh.r4) && (s4Var = ((zh.r4) storyItem).f48830a) != null) {
                    xh.n1 n1Var = new xh.n1(s4Var, storyItem2, callback, 12);
                    if (s4Var.F != 0) {
                        ConnectionsManager.getInstance(s4Var.f48237c).cancelRequest(s4Var.F, true);
                        s4Var.F = 0;
                    }
                    s4Var.C = false;
                    s4Var.D = false;
                    s4Var.H(n1Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(a3Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f17442id.add(Integer.valueOf(storyItem.f17435id));
                ConnectionsManager.getInstance(a3Var.C2).sendRequest(tL_stories_getStoriesByID, new bi.wa(v2Var, storyItem, callback, 26));
                return;
            default:
                zh.b5 b5Var = (zh.b5) obj;
                zh.a3 a3Var2 = ((zh.v2) obj4).f48986l;
                a3Var2.S1.c(b5Var.f48308a, a3Var2.B1, (TL_stories.StoryItem) obj3);
                new wc(a3Var2.f48160c1, (org.telegram.ui.ActionBar.f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, b5Var.f48309b))).j();
                return;
        }
    }

    public h7(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.d2 d2Var2, ly0 ly0Var) {
        this.f23531a = 3;
        this.f23533c = d2Var;
        this.f23532b = d2Var2;
        this.d = ly0Var;
    }
}
