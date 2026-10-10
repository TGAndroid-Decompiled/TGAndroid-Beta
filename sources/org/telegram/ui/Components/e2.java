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
public final class e2 implements td0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f25868a;
    public final int f25869b;
    public final Object f25870c;
    public final Object d;
    public final Object f25871e;
    public final Object f25872f;

    public e2(int i10, vd0 vd0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.f25868a = 0;
        this.f25869b = i10;
        this.f25870c = vd0Var;
        this.d = f4Var;
        this.f25871e = g4Var;
        this.f25872f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f25868a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.ln0 ln0Var = (org.telegram.ui.ln0) this.f25871e;
                org.telegram.ui.nn0.Z(this.f25869b, (String) this.f25872f, secureDocument, ln0Var, (org.telegram.ui.nn0) this.f25870c);
                return;
            default:
                yh.y2 y2Var = (yh.y2) this.f25870c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f25871e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25872f;
                yh.w2 w2Var = (yh.w2) y2Var.f53465o.get(y2Var.f53467q);
                if (w2Var != null) {
                    zf.a aVar2 = w2Var.f53374c;
                    yh.m5 x10 = yh.m5.x(this.f25869b, y2Var.f53467q);
                    if (x10.f52927e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f54486b > aVar.f54486b) {
                        zf.b bVar = y2Var.f53467q;
                        if (bVar == zf.b.f54487a) {
                            new yh.e7(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f54488b) {
                            new di.h(context, e6Var, w2Var.f53374c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    of.e eVar = y2Var.f53464n;
                    if (eVar != null) {
                        eVar.a(false);
                        y2Var.f53464n = null;
                    }
                    callback2.run(w2Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.o2 o2Var = (qg.o2) this.f25870c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25869b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.f25871e;
        ei.q4 q4Var = (ei.q4) this.f25872f;
        o2Var.f46542x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new r21(o2Var, bitmap, i10, or0Var, 18), 2000L);
        } else {
            q4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.fg0) this.f25870c, (String) this.d, hVar, list, (String) this.f25871e, (String) this.f25872f, this.f25869b));
    }

    @Override
    public void r(vd0 vd0Var, int i10) {
        vd0 vd0Var2 = (vd0) this.f25870c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.f25871e;
        g5.f(null, null, 0L, this.f25869b, 3, vd0Var2, f4Var, g4Var);
        g5.d((TextView) this.f25872f, vd0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        pz0 pz0Var = (pz0) this.f25870c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25871e;
        ArrayList arrayList2 = (ArrayList) this.f25872f;
        if (this.f25869b != pz0Var.I) {
            return;
        }
        pz0Var.G = 1;
        pz0Var.H = str2;
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
            pz0Var.f29901x = false;
            pz0Var.v = false;
            pz0Var.c();
            ai.f0 f0Var = pz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            pz0Var.U = AndroidUtilities.dp(10.0f);
            pz0Var.f29900w = arrayList;
            pz0Var.V = 0;
            pz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = pz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            mz0 mz0Var = pz0Var.f29896f;
            if (mz0Var != null) {
                mz0Var.l();
                return;
            }
            return;
        }
        pz0Var.f29900w = null;
        pz0Var.f29901x = true;
        pz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25868a = i11;
        this.f25870c = obj;
        this.f25869b = i10;
        this.d = obj2;
        this.f25871e = obj3;
        this.f25872f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25868a = i11;
        this.f25870c = notificationCenterDelegate;
        this.d = obj;
        this.f25869b = i10;
        this.f25871e = obj2;
        this.f25872f = obj3;
    }

    public e2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f25868a = 2;
        this.f25870c = fg0Var;
        this.d = str;
        this.f25871e = str2;
        this.f25872f = str3;
        this.f25869b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ss0 ss0Var = (ss0) this.f25870c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.f25871e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f25872f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.d5 d5Var = ss0Var.f51558e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ss0Var.L) {
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
            int i12 = this.f25869b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ss0Var.f51557c));
            boolean h = d5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            q80 H = q80.H(n2Var, view);
            H.W(new vs0(ss0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(ss0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.d1(ss0Var, i12, publicUsername, tL_starGiftCollection2, context, e6Var, n2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.p0(11, ss0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(ss0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.bi0(ss0Var, i11, tL_starGiftCollection2, 20));
            ss0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
