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
public final class e2 implements sd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f25922a;
    public final int f25923b;
    public final Object f25924c;
    public final Object d;
    public final Object f25925e;
    public final Object f25926f;

    public e2(int i10, ud0 ud0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.f25922a = 0;
        this.f25923b = i10;
        this.f25924c = ud0Var;
        this.d = f4Var;
        this.f25925e = g4Var;
        this.f25926f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f25922a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.ln0 ln0Var = (org.telegram.ui.ln0) this.f25925e;
                org.telegram.ui.nn0.Z(this.f25923b, (String) this.f25926f, secureDocument, ln0Var, (org.telegram.ui.nn0) this.f25924c);
                return;
            default:
                yh.y2 y2Var = (yh.y2) this.f25924c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f25925e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25926f;
                yh.w2 w2Var = (yh.w2) y2Var.f53419o.get(y2Var.f53421q);
                if (w2Var != null) {
                    zf.a aVar2 = w2Var.f53328c;
                    yh.m5 x10 = yh.m5.x(this.f25923b, y2Var.f53421q);
                    if (x10.f52881e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f54440b > aVar.f54440b) {
                        zf.b bVar = y2Var.f53421q;
                        if (bVar == zf.b.f54441a) {
                            new yh.e7(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f54442b) {
                            new di.h(context, e6Var, w2Var.f53328c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    of.e eVar = y2Var.f53418n;
                    if (eVar != null) {
                        eVar.a(false);
                        y2Var.f53418n = null;
                    }
                    callback2.run(w2Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.o2 o2Var = (qg.o2) this.f25924c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25923b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.f25925e;
        ei.q4 q4Var = (ei.q4) this.f25926f;
        o2Var.f46496x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new x21(o2Var, bitmap, i10, or0Var), 2000L);
        } else {
            q4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.fg0) this.f25924c, (String) this.d, hVar, list, (String) this.f25925e, (String) this.f25926f, this.f25923b));
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        ud0 ud0Var2 = (ud0) this.f25924c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.f25925e;
        g5.f(null, null, 0L, this.f25923b, 3, ud0Var2, f4Var, g4Var);
        g5.d((TextView) this.f25926f, ud0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        oz0 oz0Var = (oz0) this.f25924c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25925e;
        ArrayList arrayList2 = (ArrayList) this.f25926f;
        if (this.f25923b != oz0Var.I) {
            return;
        }
        oz0Var.G = 1;
        oz0Var.H = str2;
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
            oz0Var.f29614x = false;
            oz0Var.v = false;
            oz0Var.c();
            ai.f0 f0Var = oz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            oz0Var.U = AndroidUtilities.dp(10.0f);
            oz0Var.f29613w = arrayList;
            oz0Var.V = 0;
            oz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = oz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            lz0 lz0Var = oz0Var.f29609f;
            if (lz0Var != null) {
                lz0Var.l();
                return;
            }
            return;
        }
        oz0Var.f29613w = null;
        oz0Var.f29614x = true;
        oz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25922a = i11;
        this.f25924c = obj;
        this.f25923b = i10;
        this.d = obj2;
        this.f25925e = obj3;
        this.f25926f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25922a = i11;
        this.f25924c = notificationCenterDelegate;
        this.d = obj;
        this.f25923b = i10;
        this.f25925e = obj2;
        this.f25926f = obj3;
    }

    public e2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f25922a = 2;
        this.f25924c = fg0Var;
        this.d = str;
        this.f25925e = str2;
        this.f25926f = str3;
        this.f25923b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        rs0 rs0Var = (rs0) this.f25924c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.f25925e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f25926f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.d5 d5Var = rs0Var.f51512e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !rs0Var.L) {
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
            int i12 = this.f25923b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(rs0Var.f51511c));
            boolean h = d5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            p80 H = p80.H(n2Var, view);
            H.W(new us0(rs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(rs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.d1(rs0Var, i12, publicUsername, tL_starGiftCollection2, context, e6Var, n2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.p0(11, rs0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(rs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.bi0(rs0Var, i11, tL_starGiftCollection2, 20));
            rs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
