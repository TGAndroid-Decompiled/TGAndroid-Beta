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
public final class d2 implements ad0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f23464a;
    public final int f23465b;
    public final Object f23466c;
    public final Object d;
    public final Object e;
    public final Object f23467f;

    public d2(int i10, cd0 cd0Var, c4 c4Var, d4 d4Var, TextView textView) {
        this.f23464a = 0;
        this.f23465b = i10;
        this.f23466c = cd0Var;
        this.d = c4Var;
        this.e = d4Var;
        this.f23467f = textView;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f23464a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.e;
                org.telegram.ui.pn0.Z(this.f23465b, (String) this.f23467f, secureDocument, nn0Var, (org.telegram.ui.pn0) this.f23466c);
                return;
            default:
                yh.d3 d3Var = (yh.d3) this.f23466c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23467f;
                yh.b3 b3Var = (yh.b3) d3Var.f47335o.get(d3Var.f47337q);
                if (b3Var != null) {
                    zf.a aVar2 = b3Var.f47272c;
                    yh.u5 x10 = yh.u5.x(this.f23465b, d3Var.f47337q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f49253b > aVar.f49253b) {
                        zf.b bVar = d3Var.f47337q;
                        if (bVar == zf.b.f49254a) {
                            new yh.l7(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f49255b) {
                            new di.h(context, f6Var, b3Var.f47272c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = d3Var.f47334n;
                    if (eVar != null) {
                        eVar.a(false);
                        d3Var.f47334n = null;
                    }
                    callback2.run(b3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.n2 n2Var = (qg.n2) this.f23466c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23465b;
        org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23467f;
        n2Var.f41847x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new g21(n2Var, bitmap, i10, pr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.hg0) this.f23466c, (String) this.d, hVar, list, (String) this.e, (String) this.f23467f, this.f23465b));
    }

    @Override
    public void q(cd0 cd0Var, int i10) {
        cd0 cd0Var2 = (cd0) this.f23466c;
        c4 c4Var = (c4) this.d;
        d4 d4Var = (d4) this.e;
        d5.g(null, null, 0L, this.f23465b, 3, cd0Var2, c4Var, d4Var);
        d5.e((TextView) this.f23467f, cd0Var2, c4Var, d4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        yy0 yy0Var = (yy0) this.f23466c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23467f;
        if (this.f23465b != yy0Var.I) {
            return;
        }
        yy0Var.G = 1;
        yy0Var.H = str2;
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
            yy0Var.f30650x = false;
            yy0Var.v = false;
            yy0Var.c();
            ai.f0 f0Var = yy0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            yy0Var.U = AndroidUtilities.dp(10.0f);
            yy0Var.f30649w = arrayList;
            yy0Var.V = 0;
            yy0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = yy0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            vy0 vy0Var = yy0Var.f30645f;
            if (vy0Var != null) {
                vy0Var.l();
                return;
            }
            return;
        }
        yy0Var.f30649w = null;
        yy0Var.f30650x = true;
        yy0Var.f();
    }

    public d2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23464a = i11;
        this.f23466c = obj;
        this.f23465b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23467f = obj4;
    }

    public d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23464a = i11;
        this.f23466c = notificationCenterDelegate;
        this.d = obj;
        this.f23465b = i10;
        this.e = obj2;
        this.f23467f = obj3;
    }

    public d2(org.telegram.ui.hg0 hg0Var, String str, String str2, String str3, int i10) {
        this.f23464a = 2;
        this.f23466c = hg0Var;
        this.d = str;
        this.e = str2;
        this.f23467f = str3;
        this.f23465b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        yr0 yr0Var = (yr0) this.f23466c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f23467f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = yr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !yr0Var.L) {
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
            int i12 = this.f23465b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(yr0Var.f46418c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            v70 H = v70.H(n2Var, view);
            H.W(new bs0(yr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(yr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(yr0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.j0(12, yr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(yr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.fm0(yr0Var, i10, tL_starGiftCollection, 14));
            yr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
