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
public final class d2 implements bd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f23398a;
    public final int f23399b;
    public final Object f23400c;
    public final Object d;
    public final Object e;
    public final Object f23401f;

    public d2(int i10, dd0 dd0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f23398a = 0;
        this.f23399b = i10;
        this.f23400c = dd0Var;
        this.d = d4Var;
        this.e = e4Var;
        this.f23401f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f23398a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.e;
                org.telegram.ui.pn0.Z(this.f23399b, (String) this.f23401f, secureDocument, nn0Var, (org.telegram.ui.pn0) this.f23400c);
                return;
            default:
                yh.d3 d3Var = (yh.d3) this.f23400c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23401f;
                yh.b3 b3Var = (yh.b3) d3Var.f47292o.get(d3Var.f47294q);
                if (b3Var != null) {
                    zf.a aVar2 = b3Var.f47226c;
                    yh.t5 x10 = yh.t5.x(this.f23399b, d3Var.f47294q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f49207b > aVar.f49207b) {
                        zf.b bVar = d3Var.f47294q;
                        if (bVar == zf.b.f49208a) {
                            new yh.k7(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f49209b) {
                            new di.h(context, e6Var, b3Var.f47226c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = d3Var.f47291n;
                    if (eVar != null) {
                        eVar.a(false);
                        d3Var.f47291n = null;
                    }
                    callback2.run(b3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.m2 m2Var = (qg.m2) this.f23400c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23399b;
        org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23401f;
        m2Var.f41800x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && m2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new h21(m2Var, bitmap, i10, pr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.gg0) this.f23400c, (String) this.d, hVar, list, (String) this.e, (String) this.f23401f, this.f23399b));
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        dd0 dd0Var2 = (dd0) this.f23400c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.e;
        e5.g(null, null, 0L, this.f23399b, 3, dd0Var2, d4Var, e4Var);
        e5.e((TextView) this.f23401f, dd0Var2, d4Var, e4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        zy0 zy0Var = (zy0) this.f23400c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23401f;
        if (this.f23399b != zy0Var.I) {
            return;
        }
        zy0Var.G = 1;
        zy0Var.H = str2;
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
            zy0Var.f30917x = false;
            zy0Var.v = false;
            zy0Var.c();
            ai.f0 f0Var = zy0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            zy0Var.U = AndroidUtilities.dp(10.0f);
            zy0Var.f30916w = arrayList;
            zy0Var.V = 0;
            zy0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = zy0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            wy0 wy0Var = zy0Var.f30912f;
            if (wy0Var != null) {
                wy0Var.l();
                return;
            }
            return;
        }
        zy0Var.f30916w = null;
        zy0Var.f30917x = true;
        zy0Var.f();
    }

    public d2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23398a = i11;
        this.f23400c = obj;
        this.f23399b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23401f = obj4;
    }

    public d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23398a = i11;
        this.f23400c = notificationCenterDelegate;
        this.d = obj;
        this.f23399b = i10;
        this.e = obj2;
        this.f23401f = obj3;
    }

    public d2(org.telegram.ui.gg0 gg0Var, String str, String str2, String str3, int i10) {
        this.f23398a = 2;
        this.f23400c = gg0Var;
        this.d = str;
        this.e = str2;
        this.f23401f = str3;
        this.f23399b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        zr0 zr0Var = (zr0) this.f23400c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f23401f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = zr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !zr0Var.L) {
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
            int i12 = this.f23399b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(zr0Var.f46371c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            w70 H = w70.H(n2Var, view);
            H.W(new cs0(zr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(zr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(zr0Var, i12, publicUsername, tL_starGiftCollection, context, e6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uf.b(10, zr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(zr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.fm0(zr0Var, i10, tL_starGiftCollection, 14));
            zr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
