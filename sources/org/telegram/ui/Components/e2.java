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
    public final int f25900a;
    public final int f25901b;
    public final Object f25902c;
    public final Object d;
    public final Object f25903e;
    public final Object f25904f;

    public e2(int i10, gd0 gd0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f25900a = 0;
        this.f25901b = i10;
        this.f25902c = gd0Var;
        this.d = d4Var;
        this.f25903e = e4Var;
        this.f25904f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f25900a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) this.f25903e;
                org.telegram.ui.kn0.Y(this.f25901b, (String) this.f25904f, secureDocument, in0Var, (org.telegram.ui.kn0) this.f25902c);
                return;
            default:
                yh.c3 c3Var = (yh.c3) this.f25902c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f25903e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25904f;
                yh.a3 a3Var = (yh.a3) c3Var.f51168o.get(c3Var.f51170q);
                if (a3Var != null) {
                    zf.a aVar2 = a3Var.f51093c;
                    yh.t5 x10 = yh.t5.x(this.f25901b, c3Var.f51170q);
                    if (x10.f52019e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f53301b > aVar.f53301b) {
                        zf.b bVar = c3Var.f51170q;
                        if (bVar == zf.b.f53302a) {
                            new yh.m7(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f53303b) {
                            new di.j(context, d6Var, a3Var.f51093c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = c3Var.f51167n;
                    if (eVar != null) {
                        eVar.a(false);
                        c3Var.f51167n = null;
                    }
                    callback2.run(a3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.n2 n2Var = (qg.n2) this.f25902c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25901b;
        org.telegram.ui.jr0 jr0Var = (org.telegram.ui.jr0) this.f25903e;
        ei.s4 s4Var = (ei.s4) this.f25904f;
        n2Var.f45242x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new q21(n2Var, bitmap, i10, jr0Var), 2000L);
        } else {
            s4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.dg0) this.f25902c, (String) this.d, hVar, list, (String) this.f25903e, (String) this.f25904f, this.f25901b));
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        gd0 gd0Var2 = (gd0) this.f25902c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.f25903e;
        e5.g(null, null, 0L, this.f25901b, 3, gd0Var2, d4Var, e4Var);
        e5.e((TextView) this.f25904f, gd0Var2, d4Var, e4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        iz0 iz0Var = (iz0) this.f25902c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25903e;
        ArrayList arrayList2 = (ArrayList) this.f25904f;
        if (this.f25901b != iz0Var.I) {
            return;
        }
        iz0Var.G = 1;
        iz0Var.H = str2;
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
            iz0Var.f27543x = false;
            iz0Var.v = false;
            iz0Var.c();
            ai.f0 f0Var = iz0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            iz0Var.U = AndroidUtilities.dp(10.0f);
            iz0Var.f27542w = arrayList;
            iz0Var.V = 0;
            iz0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = iz0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            fz0 fz0Var = iz0Var.f27538f;
            if (fz0Var != null) {
                fz0Var.l();
                return;
            }
            return;
        }
        iz0Var.f27542w = null;
        iz0Var.f27543x = true;
        iz0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25900a = i11;
        this.f25902c = obj;
        this.f25901b = i10;
        this.d = obj2;
        this.f25903e = obj3;
        this.f25904f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25900a = i11;
        this.f25902c = notificationCenterDelegate;
        this.d = obj;
        this.f25901b = i10;
        this.f25903e = obj2;
        this.f25904f = obj3;
    }

    public e2(org.telegram.ui.dg0 dg0Var, String str, String str2, String str3, int i10) {
        this.f25900a = 2;
        this.f25902c = dg0Var;
        this.d = str;
        this.f25903e = str2;
        this.f25904f = str3;
        this.f25901b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        fs0 fs0Var = (fs0) this.f25902c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.f25903e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f25904f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.j5 j5Var = fs0Var.f50228e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !fs0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= j5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) j5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) j5Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f25901b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(fs0Var.f50227c));
            boolean h = j5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            b80 H = b80.H(n2Var, view);
            H.W(new is0(fs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(fs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(fs0Var, i12, publicUsername, tL_starGiftCollection, context, d6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.i0(12, fs0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(fs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.am0(fs0Var, i10, tL_starGiftCollection, 14));
            fs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
