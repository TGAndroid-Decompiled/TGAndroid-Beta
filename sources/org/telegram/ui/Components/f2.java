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
public final class f2 implements bd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.c2, OnFailureListener, Utilities.Callback2Return {
    public final int f22805a;
    public final int f22806b;
    public final Object f22807c;
    public final Object d;
    public final Object e;
    public final Object f22808f;

    public f2(int i10, dd0 dd0Var, c4 c4Var, d4 d4Var, TextView textView) {
        this.f22805a = 0;
        this.f22806b = i10;
        this.f22807c = dd0Var;
        this.d = c4Var;
        this.e = d4Var;
        this.f22808f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yf.a aVar;
        switch (this.f22805a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.e;
                org.telegram.ui.on0.Z(this.f22806b, (String) this.f22808f, secureDocument, mn0Var, (org.telegram.ui.on0) this.f22807c);
                return;
            default:
                xh.c3 c3Var = (xh.c3) this.f22807c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f22808f;
                xh.a3 a3Var = (xh.a3) c3Var.f45310o.get(c3Var.f45312q);
                if (a3Var != null) {
                    yf.a aVar2 = a3Var.f45241c;
                    xh.v5 x10 = xh.v5.x(this.f22806b, c3Var.f45312q);
                    if (x10.e) {
                        aVar = yf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f46927b > aVar.f46927b) {
                        yf.b bVar = c3Var.f45312q;
                        if (bVar == yf.b.f46928a) {
                            new xh.o7(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == yf.b.f46929b) {
                            new ci.i(context, f6Var, a3Var.f45241c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = c3Var.f45309n;
                    if (eVar != null) {
                        eVar.a(false);
                        c3Var.f45309n = null;
                    }
                    callback2.run(a3Var, d2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        pg.n2 n2Var = (pg.n2) this.f22807c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f22806b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.e;
        di.v4 v4Var = (di.v4) this.f22808f;
        n2Var.f40199x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new g21(n2Var, bitmap, i10, or0Var), 2000L);
        } else {
            v4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new fg.f1((org.telegram.ui.fg0) this.f22807c, (String) this.d, hVar, list, (String) this.e, (String) this.f22808f, this.f22806b));
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        dd0 dd0Var2 = (dd0) this.f22807c;
        c4 c4Var = (c4) this.d;
        d4 d4Var = (d4) this.e;
        d5.g(null, null, 0L, this.f22806b, 3, dd0Var2, c4Var, d4Var);
        d5.e((TextView) this.f22808f, dd0Var2, c4Var, d4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        zy0 zy0Var = (zy0) this.f22807c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f22808f;
        if (this.f22806b != zy0Var.I) {
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
            zy0Var.f29840x = false;
            zy0Var.v = false;
            zy0Var.c();
            bi.ld ldVar = zy0Var.d;
            if (ldVar != null) {
                ldVar.setVisibility(0);
            }
            zy0Var.U = AndroidUtilities.dp(10.0f);
            zy0Var.f29839w = arrayList;
            zy0Var.V = 0;
            zy0Var.W = Integer.valueOf(str2.length());
            bi.ld ldVar2 = zy0Var.d;
            if (ldVar2 != null) {
                ldVar2.invalidate();
            }
            wy0 wy0Var = zy0Var.f29835f;
            if (wy0Var != null) {
                wy0Var.l();
                return;
            }
            return;
        }
        zy0Var.f29839w = null;
        zy0Var.f29840x = true;
        zy0Var.f();
    }

    public f2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f22805a = i11;
        this.f22807c = obj;
        this.f22806b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f22808f = obj4;
    }

    public f2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f22805a = i11;
        this.f22807c = notificationCenterDelegate;
        this.d = obj;
        this.f22806b = i10;
        this.e = obj2;
        this.f22808f = obj3;
    }

    public f2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f22805a = 2;
        this.f22807c = fg0Var;
        this.d = str;
        this.e = str2;
        this.f22808f = str3;
        this.f22806b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        wr0 wr0Var = (wr0) this.f22807c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f22808f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        xh.l5 l5Var = wr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !wr0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= l5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) l5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) l5Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f22806b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(wr0Var.f44319c));
            boolean h = l5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            w70 H = w70.H(p2Var, view);
            H.W(new zr0(wr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new wh.s1(wr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new fg.f1(wr0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, p2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.k0(7, wr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new wh.s1(wr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.uu0(wr0Var, i10, tL_starGiftCollection, 11));
            wr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
