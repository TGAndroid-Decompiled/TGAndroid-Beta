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
public final class d2 implements sc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f23185a;
    public final int f23186b;
    public final Object f23187c;
    public final Object d;
    public final Object e;
    public final Object f23188f;

    public d2(int i10, uc0 uc0Var, b4 b4Var, c4 c4Var, TextView textView) {
        this.f23185a = 0;
        this.f23186b = i10;
        this.f23187c = uc0Var;
        this.d = b4Var;
        this.e = c4Var;
        this.f23188f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f23185a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.e;
                org.telegram.ui.on0.Z(this.f23186b, (String) this.f23188f, secureDocument, mn0Var, (org.telegram.ui.on0) this.f23187c);
                return;
            default:
                yh.f3 f3Var = (yh.f3) this.f23187c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23188f;
                yh.d3 d3Var = (yh.d3) f3Var.f47157o.get(f3Var.f47159q);
                if (d3Var != null) {
                    zf.a aVar2 = d3Var.f47075c;
                    yh.v5 x10 = yh.v5.x(this.f23186b, f3Var.f47159q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f48953b > aVar.f48953b) {
                        zf.b bVar = f3Var.f47159q;
                        if (bVar == zf.b.f48954a) {
                            new yh.n7(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f48955b) {
                            new di.h(context, e6Var, d3Var.f47075c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = f3Var.f47156n;
                    if (eVar != null) {
                        eVar.a(false);
                        f3Var.f47156n = null;
                    }
                    callback2.run(d3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.p2 p2Var = (qg.p2) this.f23187c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23186b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23188f;
        p2Var.f41578x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new s11(p2Var, bitmap, i10, or0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.fg0) this.f23187c, (String) this.d, hVar, list, (String) this.e, (String) this.f23188f, this.f23186b));
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        uc0 uc0Var2 = (uc0) this.f23187c;
        b4 b4Var = (b4) this.d;
        c4 c4Var = (c4) this.e;
        c5.g(null, null, 0L, this.f23186b, 3, uc0Var2, b4Var, c4Var);
        c5.e((TextView) this.f23188f, uc0Var2, b4Var, c4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ny0 ny0Var = (ny0) this.f23187c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23188f;
        if (this.f23186b != ny0Var.I) {
            return;
        }
        ny0Var.G = 1;
        ny0Var.H = str2;
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
            ny0Var.f26626x = false;
            ny0Var.v = false;
            ny0Var.c();
            ai.f0 f0Var = ny0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            ny0Var.U = AndroidUtilities.dp(10.0f);
            ny0Var.f26625w = arrayList;
            ny0Var.V = 0;
            ny0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = ny0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            ky0 ky0Var = ny0Var.f26621f;
            if (ky0Var != null) {
                ky0Var.l();
                return;
            }
            return;
        }
        ny0Var.f26625w = null;
        ny0Var.f26626x = true;
        ny0Var.f();
    }

    public d2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23185a = i11;
        this.f23187c = obj;
        this.f23186b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23188f = obj4;
    }

    public d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23185a = i11;
        this.f23187c = notificationCenterDelegate;
        this.d = obj;
        this.f23186b = i10;
        this.e = obj2;
        this.f23188f = obj3;
    }

    public d2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f23185a = 2;
        this.f23187c = fg0Var;
        this.d = str;
        this.e = str2;
        this.f23188f = str3;
        this.f23186b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        nr0 nr0Var = (nr0) this.f23187c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f23188f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.m5 m5Var = nr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !nr0Var.L) {
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
            int i12 = this.f23186b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(nr0Var.f46107c));
            boolean h = m5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            n70 H = n70.H(n2Var, view);
            H.W(new qr0(nr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.t1(nr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(nr0Var, i12, publicUsername, tL_starGiftCollection, context, e6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uh.i(6, nr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.t1(nr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.em0(nr0Var, i10, tL_starGiftCollection, 14));
            nr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
