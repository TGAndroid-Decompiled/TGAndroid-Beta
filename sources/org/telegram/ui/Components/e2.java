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
public final class e2 implements wd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.z1, OnFailureListener, Utilities.Callback2Return {
    public final int f25543a;
    public final int f25544b;
    public final Object f25545c;
    public final Object d;
    public final Object f25546e;
    public final Object f25547f;

    public e2(int i10, yd0 yd0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.f25543a = 0;
        this.f25544b = i10;
        this.f25545c = yd0Var;
        this.d = f4Var;
        this.f25546e = g4Var;
        this.f25547f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zf.a aVar;
        switch (this.f25543a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.f25546e;
                org.telegram.ui.pn0.Z(this.f25544b, (String) this.f25547f, secureDocument, nn0Var, (org.telegram.ui.pn0) this.f25545c);
                return;
            default:
                yh.y2 y2Var = (yh.y2) this.f25545c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f25546e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25547f;
                yh.w2 w2Var = (yh.w2) y2Var.f53645o.get(y2Var.f53647q);
                if (w2Var != null) {
                    zf.a aVar2 = w2Var.f53554c;
                    yh.n5 x10 = yh.n5.x(this.f25544b, y2Var.f53647q);
                    if (x10.f53137e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f54666b > aVar.f54666b) {
                        zf.b bVar = y2Var.f53647q;
                        if (bVar == zf.b.f54667a) {
                            new yh.e7(context, c6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f54668b) {
                            new di.h(context, c6Var, w2Var.f53554c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    of.e eVar = y2Var.f53644n;
                    if (eVar != null) {
                        eVar.a(false);
                        y2Var.f53644n = null;
                    }
                    callback2.run(w2Var, a2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.o2 o2Var = (qg.o2) this.f25545c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25544b;
        org.telegram.ui.qr0 qr0Var = (org.telegram.ui.qr0) this.f25546e;
        ei.q4 q4Var = (ei.q4) this.f25547f;
        o2Var.f46435x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new w21(o2Var, bitmap, i10, qr0Var, 18), 2000L);
        } else {
            q4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.fg0) this.f25545c, (String) this.d, hVar, list, (String) this.f25546e, (String) this.f25547f, this.f25544b));
    }

    @Override
    public void q(yd0 yd0Var, int i10) {
        yd0 yd0Var2 = (yd0) this.f25545c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.f25546e;
        g5.f(null, null, 0L, this.f25544b, 3, yd0Var2, f4Var, g4Var);
        g5.d((TextView) this.f25547f, yd0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        uz0 uz0Var = (uz0) this.f25545c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25546e;
        ArrayList arrayList2 = (ArrayList) this.f25547f;
        if (this.f25544b != uz0Var.I) {
            return;
        }
        uz0Var.G = 1;
        uz0Var.H = str2;
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
            uz0Var.f31306x = false;
            uz0Var.v = false;
            uz0Var.c();
            ai.f0 f0Var = uz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            uz0Var.U = AndroidUtilities.dp(10.0f);
            uz0Var.f31305w = arrayList;
            uz0Var.V = 0;
            uz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = uz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            rz0 rz0Var = uz0Var.f31301f;
            if (rz0Var != null) {
                rz0Var.l();
                return;
            }
            return;
        }
        uz0Var.f31305w = null;
        uz0Var.f31306x = true;
        uz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25543a = i11;
        this.f25545c = obj;
        this.f25544b = i10;
        this.d = obj2;
        this.f25546e = obj3;
        this.f25547f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25543a = i11;
        this.f25545c = notificationCenterDelegate;
        this.d = obj;
        this.f25544b = i10;
        this.f25546e = obj2;
        this.f25547f = obj3;
    }

    public e2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f25543a = 2;
        this.f25545c = fg0Var;
        this.d = str;
        this.f25546e = str2;
        this.f25547f = str3;
        this.f25544b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        xs0 xs0Var = (xs0) this.f25545c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        Context context = (Context) this.f25546e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f25547f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.d5 d5Var = xs0Var.f51724e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !xs0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= d5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) d5Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d5Var.d().get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.f25544b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(xs0Var.f51723c));
            boolean h = d5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            s80 H = s80.H(m2Var, view);
            H.W(new at0(xs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.t1(xs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.d1(xs0Var, i12, publicUsername, tL_starGiftCollection2, context, c6Var, m2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new tg.c1(13, xs0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.t1(xs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.ci0(xs0Var, i11, tL_starGiftCollection2, 20));
            xs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
