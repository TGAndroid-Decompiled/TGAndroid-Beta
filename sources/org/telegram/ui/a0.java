package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a0 implements View.OnClickListener {
    public final int f43544a;
    public final Object f43545b;
    public final Object f43546c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i3) {
        this.f43544a = i3;
        this.f43545b = obj;
        this.f43546c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        uw uwVar;
        org.telegram.ui.ActionBar.t2 t2Var;
        int i3 = this.f43544a;
        boolean z12 = false;
        Object obj = this.d;
        Object obj2 = this.f43546c;
        Object obj3 = this.f43545b;
        switch (i3) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                l3 l3Var = (l3) obj;
                i4Var.f46088i0.k(false);
                org.telegram.messenger.g0.v1(i4Var.f46088i0.f50875c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.fc(l3Var.f47086f, null).k(false).k(true);
                return;
            case 1:
                e7 e7Var = (e7) obj3;
                z6 z6Var = (z6) obj;
                Bundle bundle = new Bundle();
                di.b bVar = ((n7) obj2).d;
                long j10 = bVar.f9181b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.f9185g);
                z6Var.presentFragment(new wm(bundle));
                e7Var.f44913f.G.dismiss();
                org.telegram.ui.ActionBar.f1 f1Var = e7Var.f44909a;
                if (f1Var != null) {
                    f1Var.d(true);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.uh0 uh0Var = (org.telegram.ui.Components.uh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (uh0Var == null || uh0Var.f38757x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    return;
                }
                return;
            case 3:
                wm wmVar = (wm) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                if (wmVar.getParentActivity() != null) {
                    if (wmVar.f51279d1.getVisibility() != 0 || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        wmVar.f51237a0.Z(keyboardInlineButton, ziVar, ziVar, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((wm) obj3).Ua((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                return;
            case 5:
                wm.j0((wm) obj3, (boolean[]) obj2, (Context) obj);
                return;
            case 6:
                wm.Z0((wm) obj3, (oj) obj2, (boolean[]) obj);
                return;
            case 7:
                hm hmVar = (hm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.d2 d2Var = hmVar.f45934a;
                d2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.f30119w != null) {
                    d2Var.getNotificationCenter().k(201, Long.valueOf(q1Var.f30119w.f29525e));
                }
                d2Var.getMessagesController().n(chat.f27001id, d2Var.getUserConfig().f(), null, d2Var, new sl(hmVar, chat, 3));
                return;
            case 8:
                ln lnVar = (ln) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                hi.d dVar = (hi.d) obj;
                Integer num = (Integer) view.getTag();
                org.telegram.ui.Cells.g6 g6Var = g6VarArr[0];
                if (num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g6Var.a(z10);
                org.telegram.ui.Cells.g6 g6Var2 = g6VarArr[1];
                if (num.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g6Var2.a(z11);
                if (num.intValue() == 1) {
                    z12 = true;
                }
                lnVar.K0 = z12;
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
                lnVar.u0(true, true);
                return;
            case 9:
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
                PhotoViewer photoViewer = ((rq) obj3).f49263c.f45683a;
                Drawable[] drawableArr = PhotoViewer.V8;
                ArrayList arrayList = ((org.telegram.ui.Components.j51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.Components.l51 l51Var = (org.telegram.ui.Components.l51) obj4;
                            if (l51Var.b()) {
                                document = l51Var.f35608g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.l51 l51Var2 = null;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                org.telegram.ui.Components.l51 l51Var3 = (org.telegram.ui.Components.l51) arrayList.get(i11);
                                if (l51Var3.f35611k < j11 && org.telegram.ui.Components.m51.D0(l51Var3.f35613m)) {
                                    j11 = l51Var3.f35611k;
                                    l51Var2 = l51Var3;
                                }
                            }
                            if (l51Var2 != null) {
                                document = l51Var2.f35608g;
                            } else {
                                document = ((org.telegram.ui.Components.l51) arrayList.get(0)).f35608g;
                            }
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.U);
                    File K = org.telegram.messenger.w7.K(document, null, false, true);
                    if (K == null || !K.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.U);
                        K = org.telegram.messenger.w7.K(document, null, true, true);
                    }
                    if (K != null && K.exists()) {
                        MediaController.d0(K.toString(), photoViewer.E, 1, null, null, new en0(photoViewer, 1));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ziVar2.f26839d3 = document;
                        arrayList2.add(ziVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new ma(photoViewer, 2));
                    }
                    photoViewer.f41504p0.U(null, null);
                    return;
                }
                return;
            case 10:
                lr lrVar = (lr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.t4.N((Context) obj2, org.telegram.messenger.bd.M0(2131746096, null), org.telegram.messenger.bd.a0(null, null, 2131746097, user.first_name), org.telegram.messenger.bd.M0(2131746128, null), new dr(lrVar, user, 1), lrVar.f47421r).p();
                return;
            case 11:
                ee0 ee0Var = (ee0) obj3;
                ((org.telegram.ui.Components.f60) obj2).u();
                int i12 = ((org.telegram.messenger.mo) obj).f24237a;
                if (ee0Var.f45622c.getCurrentPosition() == 0 && (uwVar = ee0Var.K) != null) {
                    uwVar.I4(i12);
                    return;
                }
                if (ee0Var.K == null) {
                    ee0Var.r0(null);
                }
                ee0Var.J = Integer.valueOf(i12);
                ee0Var.s0(0, true);
                ee0Var.f45622c.D(0);
                return;
            case 12:
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj3;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2VarArr[0];
                if (t2Var2 != null) {
                    t2Var2.dismiss();
                    t2VarArr[0] = null;
                    u10Var.a(str2);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.t2[] t2VarArr2 = (org.telegram.ui.ActionBar.t2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((gi.d) obj3).R && (t2Var = t2VarArr2[0]) != null) {
                    t2Var.dismiss();
                    t2VarArr2[0] = null;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ProfileActivity.d0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
                return;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.f1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41915a);
                m10.remove(((org.telegram.messenger.iv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41915a, m10);
                saveToGallerySettingsActivity.e0();
                return;
        }
    }

    public a0(org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.messenger.u10 u10Var, String str) {
        this.f43544a = 12;
        this.f43545b = t2VarArr;
        this.d = u10Var;
        this.f43546c = str;
    }
}
