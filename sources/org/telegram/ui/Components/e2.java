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
public final class e2 implements tc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final int f25515a;
    public final int f25516b;
    public final Object f25517c;
    public final Object d;
    public final Object f25518e;
    public final Object f25519f;

    public e2(int i10, vc0 vc0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f25515a = 0;
        this.f25516b = i10;
        this.f25517c = vc0Var;
        this.d = d4Var;
        this.f25518e = e4Var;
        this.f25519f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zf.a aVar;
        switch (this.f25515a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.f25518e;
                org.telegram.ui.pn0.Z(this.f25516b, (String) this.f25519f, secureDocument, nn0Var, (org.telegram.ui.pn0) this.f25517c);
                return;
            default:
                zh.c3 c3Var = (zh.c3) this.f25517c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f25518e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25519f;
                zh.a3 a3Var = (zh.a3) c3Var.f51747o.get(c3Var.f51749q);
                if (a3Var != null) {
                    zf.a aVar2 = a3Var.f51677c;
                    zh.s5 x10 = zh.s5.x(this.f25516b, c3Var.f51749q);
                    if (x10.f52569e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f51623b > aVar.f51623b) {
                        zf.b bVar = c3Var.f51749q;
                        if (bVar == zf.b.f51624a) {
                            new zh.k7(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f51625b) {
                            new ei.h(context, f6Var, a3Var.f51677c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    of.e eVar = c3Var.f51746n;
                    if (eVar != null) {
                        eVar.a(false);
                        c3Var.f51746n = null;
                    }
                    callback2.run(a3Var, b2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.o2 o2Var = (rg.o2) this.f25517c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f25516b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.f25518e;
        fi.s4 s4Var = (fi.s4) this.f25519f;
        o2Var.f45402x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new r11(o2Var, bitmap, i10, or0Var), 2000L);
        } else {
            s4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.fg0) this.f25517c, (String) this.d, hVar, list, (String) this.f25518e, (String) this.f25519f, this.f25516b));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        my0 my0Var = (my0) this.f25517c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f25518e;
        ArrayList arrayList2 = (ArrayList) this.f25519f;
        if (this.f25516b != my0Var.I) {
            return;
        }
        my0Var.G = 1;
        my0Var.H = str2;
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
            my0Var.f28568x = false;
            my0Var.v = false;
            my0Var.c();
            ah.y yVar = my0Var.d;
            if (yVar != null) {
                yVar.setVisibility(0);
            }
            my0Var.U = AndroidUtilities.dp(10.0f);
            my0Var.f28567w = arrayList;
            my0Var.V = 0;
            my0Var.W = Integer.valueOf(str2.length());
            ah.y yVar2 = my0Var.d;
            if (yVar2 != null) {
                yVar2.invalidate();
            }
            jy0 jy0Var = my0Var.f28563f;
            if (jy0Var != null) {
                jy0Var.l();
                return;
            }
            return;
        }
        my0Var.f28567w = null;
        my0Var.f28568x = true;
        my0Var.f();
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        vc0 vc0Var2 = (vc0) this.f25517c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.f25518e;
        e5.g(null, null, 0L, this.f25516b, 3, vc0Var2, d4Var, e4Var);
        e5.e((TextView) this.f25519f, vc0Var2, d4Var, e4Var);
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f25515a = i11;
        this.f25517c = obj;
        this.f25516b = i10;
        this.d = obj2;
        this.f25518e = obj3;
        this.f25519f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25515a = i11;
        this.f25517c = notificationCenterDelegate;
        this.d = obj;
        this.f25516b = i10;
        this.f25518e = obj2;
        this.f25519f = obj3;
    }

    public e2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.f25515a = 2;
        this.f25517c = fg0Var;
        this.d = str;
        this.f25518e = str2;
        this.f25519f = str3;
        this.f25516b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        nr0 nr0Var = (nr0) this.f25517c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.f25518e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f25519f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        zh.i5 i5Var = nr0Var.f50518e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !nr0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= i5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) i5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) i5Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f25516b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(nr0Var.f50517c));
            boolean h = i5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            n70 H = n70.H(n2Var, view);
            H.W(new qr0(nr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.s1(nr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.e1(nr0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new ug.r(12, nr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.s1(nr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.ai0(nr0Var, i10, tL_starGiftCollection, 15));
            nr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
