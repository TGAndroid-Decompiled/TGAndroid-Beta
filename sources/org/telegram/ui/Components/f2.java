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
public final class f2 implements td0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.z1, OnFailureListener, Utilities.Callback2Return {
    public final int f26199a;
    public final int f26200b;
    public final Object f26201c;
    public final Object d;
    public final Object f26202e;
    public final Object f26203f;

    public f2(int i10, vd0 vd0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.f26199a = 0;
        this.f26200b = i10;
        this.f26201c = vd0Var;
        this.d = f4Var;
        this.f26202e = g4Var;
        this.f26203f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zf.a aVar;
        switch (this.f26199a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) this.f26202e;
                org.telegram.ui.mn0.Z(this.f26200b, (String) this.f26203f, secureDocument, kn0Var, (org.telegram.ui.mn0) this.f26201c);
                return;
            default:
                yh.y2 y2Var = (yh.y2) this.f26201c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f26202e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f26203f;
                yh.w2 w2Var = (yh.w2) y2Var.f53508o.get(y2Var.f53510q);
                if (w2Var != null) {
                    zf.a aVar2 = w2Var.f53417c;
                    yh.n5 x10 = yh.n5.x(this.f26200b, y2Var.f53510q);
                    if (x10.f53000e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f54529b > aVar.f54529b) {
                        zf.b bVar = y2Var.f53510q;
                        if (bVar == zf.b.f54530a) {
                            new yh.e7(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f54531b) {
                            new di.h(context, d6Var, w2Var.f53417c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    of.e eVar = y2Var.f53507n;
                    if (eVar != null) {
                        eVar.a(false);
                        y2Var.f53507n = null;
                    }
                    callback2.run(w2Var, a2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.n2 n2Var = (qg.n2) this.f26201c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f26200b;
        org.telegram.ui.nr0 nr0Var = (org.telegram.ui.nr0) this.f26202e;
        ei.q4 q4Var = (ei.q4) this.f26203f;
        n2Var.f46534x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new s21(n2Var, bitmap, i10, nr0Var, 18), 2000L);
        } else {
            q4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.eg0) this.f26201c, (String) this.d, hVar, list, (String) this.f26202e, (String) this.f26203f, this.f26200b));
    }

    @Override
    public void q(vd0 vd0Var, int i10) {
        vd0 vd0Var2 = (vd0) this.f26201c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.f26202e;
        g5.f(null, null, 0L, this.f26200b, 3, vd0Var2, f4Var, g4Var);
        g5.d((TextView) this.f26203f, vd0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        qz0 qz0Var = (qz0) this.f26201c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f26202e;
        ArrayList arrayList2 = (ArrayList) this.f26203f;
        if (this.f26200b != qz0Var.I) {
            return;
        }
        qz0Var.G = 1;
        qz0Var.H = str2;
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
            qz0Var.f30281x = false;
            qz0Var.v = false;
            qz0Var.c();
            ai.f0 f0Var = qz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            qz0Var.U = AndroidUtilities.dp(10.0f);
            qz0Var.f30280w = arrayList;
            qz0Var.V = 0;
            qz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = qz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            nz0 nz0Var = qz0Var.f30276f;
            if (nz0Var != null) {
                nz0Var.l();
                return;
            }
            return;
        }
        qz0Var.f30280w = null;
        qz0Var.f30281x = true;
        qz0Var.f();
    }

    public f2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f26199a = i11;
        this.f26201c = obj;
        this.f26200b = i10;
        this.d = obj2;
        this.f26202e = obj3;
        this.f26203f = obj4;
    }

    public f2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f26199a = i11;
        this.f26201c = notificationCenterDelegate;
        this.d = obj;
        this.f26200b = i10;
        this.f26202e = obj2;
        this.f26203f = obj3;
    }

    public f2(org.telegram.ui.eg0 eg0Var, String str, String str2, String str3, int i10) {
        this.f26199a = 2;
        this.f26201c = eg0Var;
        this.d = str;
        this.f26202e = str2;
        this.f26203f = str3;
        this.f26200b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ts0 ts0Var = (ts0) this.f26201c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        Context context = (Context) this.f26202e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f26203f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.d5 d5Var = ts0Var.f51601e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ts0Var.L) {
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
            int i12 = this.f26200b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ts0Var.f51600c));
            boolean h = d5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            q80 H = q80.H(m2Var, view);
            H.W(new ws0(ts0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(ts0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.d1(ts0Var, i12, publicUsername, tL_starGiftCollection2, context, d6Var, m2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new tg.c1(13, ts0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(ts0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.ai0(ts0Var, i11, tL_starGiftCollection2, 20));
            ts0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
