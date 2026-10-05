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
public final class e2 implements ed0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f25948a;
    public final int f25949b;
    public final Object f25950c;
    public final Object d;
    public final Object f25951e;
    public final Object f25952f;

    public e2(int i10, gd0 gd0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f25948a = 0;
        this.f25949b = i10;
        this.f25950c = gd0Var;
        this.d = d4Var;
        this.f25951e = e4Var;
        this.f25952f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f25948a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) this.f25951e;
                org.telegram.ui.kn0.Y(this.f25949b, (String) this.f25952f, secureDocument, in0Var, (org.telegram.ui.kn0) this.f25950c);
                return;
            default:
                yh.d3 d3Var = (yh.d3) this.f25950c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f25951e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25952f;
                yh.b3 b3Var = (yh.b3) d3Var.f51224o.get(d3Var.f51226q);
                if (b3Var != null) {
                    zf.a aVar2 = b3Var.f51146c;
                    yh.u5 x10 = yh.u5.x(this.f25949b, d3Var.f51226q);
                    if (x10.f52088e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f53322b > aVar.f53322b) {
                        zf.b bVar = d3Var.f51226q;
                        if (bVar == zf.b.f53323a) {
                            new yh.n7(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f53324b) {
                            new di.j(context, d6Var, b3Var.f51146c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = d3Var.f51223n;
                    if (eVar != null) {
                        eVar.a(false);
                        d3Var.f51223n = null;
                    }
                    callback2.run(b3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.n2 n2Var = (qg.n2) this.f25950c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25949b;
        org.telegram.ui.jr0 jr0Var = (org.telegram.ui.jr0) this.f25951e;
        ei.s4 s4Var = (ei.s4) this.f25952f;
        n2Var.f45249x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new r21(n2Var, bitmap, i10, jr0Var), 2000L);
        } else {
            s4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.dg0) this.f25950c, (String) this.d, hVar, list, (String) this.f25951e, (String) this.f25952f, this.f25949b));
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        gd0 gd0Var2 = (gd0) this.f25950c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.f25951e;
        e5.g(null, null, 0L, this.f25949b, 3, gd0Var2, d4Var, e4Var);
        e5.e((TextView) this.f25952f, gd0Var2, d4Var, e4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        jz0 jz0Var = (jz0) this.f25950c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25951e;
        ArrayList arrayList2 = (ArrayList) this.f25952f;
        if (this.f25949b != jz0Var.I) {
            return;
        }
        jz0Var.G = 1;
        jz0Var.H = str2;
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
            jz0Var.f28011x = false;
            jz0Var.v = false;
            jz0Var.c();
            ai.f0 f0Var = jz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            jz0Var.U = AndroidUtilities.dp(10.0f);
            jz0Var.f28010w = arrayList;
            jz0Var.V = 0;
            jz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = jz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            gz0 gz0Var = jz0Var.f28006f;
            if (gz0Var != null) {
                gz0Var.l();
                return;
            }
            return;
        }
        jz0Var.f28010w = null;
        jz0Var.f28011x = true;
        jz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25948a = i11;
        this.f25950c = obj;
        this.f25949b = i10;
        this.d = obj2;
        this.f25951e = obj3;
        this.f25952f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25948a = i11;
        this.f25950c = notificationCenterDelegate;
        this.d = obj;
        this.f25949b = i10;
        this.f25951e = obj2;
        this.f25952f = obj3;
    }

    public e2(org.telegram.ui.dg0 dg0Var, String str, String str2, String str3, int i10) {
        this.f25948a = 2;
        this.f25950c = dg0Var;
        this.d = str;
        this.f25951e = str2;
        this.f25952f = str3;
        this.f25949b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        gs0 gs0Var = (gs0) this.f25950c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.f25951e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f25952f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = gs0Var.f50235e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !gs0Var.L) {
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
            int i12 = this.f25949b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(gs0Var.f50234c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            b80 H = b80.H(n2Var, view);
            H.W(new js0(gs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(gs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(gs0Var, i12, publicUsername, tL_starGiftCollection, context, d6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.i0(12, gs0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(gs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.am0(gs0Var, i10, tL_starGiftCollection, 14));
            gs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
