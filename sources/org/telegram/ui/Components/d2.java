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
public final class d2 implements sc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.b2, OnFailureListener, Utilities.Callback2Return {
    public final int f23181a;
    public final int f23182b;
    public final Object f23183c;
    public final Object d;
    public final Object e;
    public final Object f23184f;

    public d2(int i10, uc0 uc0Var, b4 b4Var, c4 c4Var, TextView textView) {
        this.f23181a = 0;
        this.f23182b = i10;
        this.f23183c = uc0Var;
        this.d = b4Var;
        this.e = c4Var;
        this.f23184f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        zf.a aVar;
        switch (this.f23181a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.e;
                org.telegram.ui.qn0.Z(this.f23182b, (String) this.f23184f, secureDocument, on0Var, (org.telegram.ui.qn0) this.f23183c);
                return;
            default:
                yh.f3 f3Var = (yh.f3) this.f23183c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23184f;
                yh.d3 d3Var = (yh.d3) f3Var.f47180o.get(f3Var.f47182q);
                if (d3Var != null) {
                    zf.a aVar2 = d3Var.f47098c;
                    yh.v5 x10 = yh.v5.x(this.f23182b, f3Var.f47182q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f48976b > aVar.f48976b) {
                        zf.b bVar = f3Var.f47182q;
                        if (bVar == zf.b.f48977a) {
                            new yh.n7(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f48978b) {
                            new di.h(context, f6Var, d3Var.f47098c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = f3Var.f47179n;
                    if (eVar != null) {
                        eVar.a(false);
                        f3Var.f47179n = null;
                    }
                    callback2.run(d3Var, c2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.p2 p2Var = (qg.p2) this.f23183c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23182b;
        org.telegram.ui.qr0 qr0Var = (org.telegram.ui.qr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23184f;
        p2Var.f41600x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new t11(p2Var, bitmap, i10, qr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.hg0) this.f23183c, (String) this.d, hVar, list, (String) this.e, (String) this.f23184f, this.f23182b));
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        uc0 uc0Var2 = (uc0) this.f23183c;
        b4 b4Var = (b4) this.d;
        c4 c4Var = (c4) this.e;
        c5.g(null, null, 0L, this.f23182b, 3, uc0Var2, b4Var, c4Var);
        c5.e((TextView) this.f23184f, uc0Var2, b4Var, c4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        oy0 oy0Var = (oy0) this.f23183c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23184f;
        if (this.f23182b != oy0Var.I) {
            return;
        }
        oy0Var.G = 1;
        oy0Var.H = str2;
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
            oy0Var.f26894x = false;
            oy0Var.v = false;
            oy0Var.c();
            ai.f0 f0Var = oy0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            oy0Var.U = AndroidUtilities.dp(10.0f);
            oy0Var.f26893w = arrayList;
            oy0Var.V = 0;
            oy0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = oy0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            ly0 ly0Var = oy0Var.f26889f;
            if (ly0Var != null) {
                ly0Var.l();
                return;
            }
            return;
        }
        oy0Var.f26893w = null;
        oy0Var.f26894x = true;
        oy0Var.f();
    }

    public d2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23181a = i11;
        this.f23183c = obj;
        this.f23182b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23184f = obj4;
    }

    public d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23181a = i11;
        this.f23183c = notificationCenterDelegate;
        this.d = obj;
        this.f23182b = i10;
        this.e = obj2;
        this.f23184f = obj3;
    }

    public d2(org.telegram.ui.hg0 hg0Var, String str, String str2, String str3, int i10) {
        this.f23181a = 2;
        this.f23183c = hg0Var;
        this.d = str;
        this.e = str2;
        this.f23184f = str3;
        this.f23182b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        or0 or0Var = (or0) this.f23183c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f23184f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.m5 m5Var = or0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !or0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= m5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) m5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) m5Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f23182b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(or0Var.f46130c));
            boolean h = m5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            n70 H = n70.H(o2Var, view);
            H.W(new rr0(or0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.t1(or0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(or0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, o2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uh.i(6, or0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.t1(or0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.gm0(or0Var, i10, tL_starGiftCollection, 14));
            or0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
