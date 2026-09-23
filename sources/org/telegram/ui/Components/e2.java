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
public final class e2 implements rc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f23531a;
    public final int f23532b;
    public final Object f23533c;
    public final Object d;
    public final Object e;
    public final Object f23534f;

    public e2(int i10, tc0 tc0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f23531a = 0;
        this.f23532b = i10;
        this.f23533c = tc0Var;
        this.d = d4Var;
        this.e = e4Var;
        this.f23534f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f23531a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) this.e;
                org.telegram.ui.in0.Z(this.f23532b, (String) this.f23534f, secureDocument, gn0Var, (org.telegram.ui.in0) this.f23533c);
                return;
            default:
                yh.d3 d3Var = (yh.d3) this.f23533c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23534f;
                yh.b3 b3Var = (yh.b3) d3Var.f46982o.get(d3Var.f46984q);
                if (b3Var != null) {
                    zf.a aVar2 = b3Var.f46920c;
                    yh.t5 x10 = yh.t5.x(this.f23532b, d3Var.f46984q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f48897b > aVar.f48897b) {
                        zf.b bVar = d3Var.f46984q;
                        if (bVar == zf.b.f48898a) {
                            new yh.l7(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f48899b) {
                            new di.h(context, d6Var, b3Var.f46920c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = d3Var.f46981n;
                    if (eVar != null) {
                        eVar.a(false);
                        d3Var.f46981n = null;
                    }
                    callback2.run(b3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.p2 p2Var = (qg.p2) this.f23533c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23532b;
        org.telegram.ui.ir0 ir0Var = (org.telegram.ui.ir0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23534f;
        p2Var.f41530x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new r11(p2Var, bitmap, i10, ir0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ag0) this.f23533c, (String) this.d, hVar, list, (String) this.e, (String) this.f23534f, this.f23532b));
    }

    @Override
    public void q(tc0 tc0Var, int i10) {
        tc0 tc0Var2 = (tc0) this.f23533c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.e;
        e5.g(null, null, 0L, this.f23532b, 3, tc0Var2, d4Var, e4Var);
        e5.e((TextView) this.f23534f, tc0Var2, d4Var, e4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        my0 my0Var = (my0) this.f23533c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23534f;
        if (this.f23532b != my0Var.I) {
            return;
        }
        my0Var.G = 1;
        my0Var.H = str2;
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
            my0Var.f26300x = false;
            my0Var.v = false;
            my0Var.c();
            ai.f0 f0Var = my0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            my0Var.U = AndroidUtilities.dp(10.0f);
            my0Var.f26299w = arrayList;
            my0Var.V = 0;
            my0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = my0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            jy0 jy0Var = my0Var.f26295f;
            if (jy0Var != null) {
                jy0Var.l();
                return;
            }
            return;
        }
        my0Var.f26299w = null;
        my0Var.f26300x = true;
        my0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23531a = i11;
        this.f23533c = obj;
        this.f23532b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23534f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23531a = i11;
        this.f23533c = notificationCenterDelegate;
        this.d = obj;
        this.f23532b = i10;
        this.e = obj2;
        this.f23534f = obj3;
    }

    public e2(org.telegram.ui.ag0 ag0Var, String str, String str2, String str3, int i10) {
        this.f23531a = 2;
        this.f23533c = ag0Var;
        this.d = str;
        this.e = str2;
        this.f23534f = str3;
        this.f23532b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        nr0 nr0Var = (nr0) this.f23533c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f23534f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = nr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !nr0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= k5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) k5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) k5Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f23532b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(nr0Var.f46070c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            o70 H = o70.H(n2Var, view);
            H.W(new qr0(nr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(nr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(nr0Var, i12, publicUsername, tL_starGiftCollection, context, d6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uh.i(6, nr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(nr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.yl0(nr0Var, i10, tL_starGiftCollection, 14));
            nr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
