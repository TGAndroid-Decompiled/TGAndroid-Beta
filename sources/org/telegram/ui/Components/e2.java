package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class e2 implements sd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.z1, OnFailureListener, Utilities.Callback2Return {
    public final int f24563a;
    public final int f24564b;
    public final Object f24565c;
    public final Object d;
    public final Object e;
    public final Object f24566f;

    public e2(int i10, ud0 ud0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.f24563a = 0;
        this.f24564b = i10;
        this.f24565c = ud0Var;
        this.d = f4Var;
        this.e = g4Var;
        this.f24566f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ag.a aVar;
        switch (this.f24563a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.sn0 sn0Var = (org.telegram.ui.sn0) this.e;
                org.telegram.ui.un0.Z(this.f24564b, (String) this.f24566f, secureDocument, sn0Var, (org.telegram.ui.un0) this.f24565c);
                return;
            default:
                zh.x2 x2Var = (zh.x2) this.f24565c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f24566f;
                zh.v2 v2Var = (zh.v2) x2Var.f51302o.get(x2Var.f51304q);
                if (v2Var != null) {
                    ag.a aVar2 = v2Var.f51235c;
                    zh.n5 x10 = zh.n5.x(this.f24564b, x2Var.f51304q);
                    if (x10.e) {
                        aVar = ag.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f628b > aVar.f628b) {
                        ag.b bVar = x2Var.f51304q;
                        if (bVar == ag.b.f629a) {
                            new zh.e7(context, c6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == ag.b.f630b) {
                            new ei.h(context, c6Var, v2Var.f51235c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    pf.c cVar = x2Var.f51301n;
                    if (cVar != null) {
                        cVar.a(false);
                        x2Var.f51301n = null;
                    }
                    callback2.run(v2Var, a2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.p2 p2Var = (rg.p2) this.f24565c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f24564b;
        org.telegram.ui.ur0 ur0Var = (org.telegram.ui.ur0) this.e;
        fi.r4 r4Var = (fi.r4) this.f24566f;
        p2Var.f44477x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new m21(p2Var, bitmap, i10, ur0Var, 19), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.kg0) this.f24565c, (String) this.d, iVar, list, (String) this.e, (String) this.f24566f, this.f24564b));
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        ud0 ud0Var2 = (ud0) this.f24565c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.e;
        g5.f(null, null, 0L, this.f24564b, 3, ud0Var2, f4Var, g4Var);
        g5.d((TextView) this.f24566f, ud0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        kz0 kz0Var = (kz0) this.f24565c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f24566f;
        if (this.f24564b != kz0Var.I) {
            return;
        }
        kz0Var.G = 1;
        kz0Var.H = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            kz0Var.f26839x = false;
            kz0Var.v = false;
            kz0Var.c();
            ah.x xVar = kz0Var.d;
            if (xVar != null) {
                xVar.setVisibility(0);
            }
            kz0Var.U = AndroidUtilities.dp(10.0f);
            kz0Var.f26838w = arrayList;
            kz0Var.V = 0;
            kz0Var.W = Integer.valueOf(str2.length());
            ah.x xVar2 = kz0Var.d;
            if (xVar2 != null) {
                xVar2.invalidate();
            }
            hz0 hz0Var = kz0Var.f26834f;
            if (hz0Var != null) {
                hz0Var.l();
                return;
            }
            return;
        }
        kz0Var.f26838w = null;
        kz0Var.f26839x = true;
        kz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f24563a = i11;
        this.f24565c = obj;
        this.f24564b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f24566f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f24563a = i11;
        this.f24565c = notificationCenterDelegate;
        this.d = obj;
        this.f24564b = i10;
        this.e = obj2;
        this.f24566f = obj3;
    }

    public e2(org.telegram.ui.kg0 kg0Var, String str, String str2, String str3, int i10) {
        this.f24563a = 2;
        this.f24565c = kg0Var;
        this.d = str;
        this.e = str2;
        this.f24566f = str3;
        this.f24564b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ns0 ns0Var = (ns0) this.f24565c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f24566f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        zh.e5 e5Var = ns0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ns0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= e5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) e5Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) e5Var.d().get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.f24564b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ns0Var.f49091c));
            boolean h = e5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            m80 H = m80.H(m2Var, view);
            H.W(new qs0(ns0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.s1(ns0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(ns0Var, i12, publicUsername, tL_starGiftCollection2, context, c6Var, m2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new s9.b(27, ns0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.s1(ns0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.c90(ns0Var, i11, tL_starGiftCollection2, 21));
            ns0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
