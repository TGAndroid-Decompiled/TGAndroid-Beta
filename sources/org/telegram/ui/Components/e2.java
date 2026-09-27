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
public final class e2 implements cd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.b2, OnFailureListener, Utilities.Callback2Return {
    public final int f23841a;
    public final int f23842b;
    public final Object f23843c;
    public final Object d;
    public final Object e;
    public final Object f23844f;

    public e2(int i10, ed0 ed0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.f23841a = 0;
        this.f23842b = i10;
        this.f23843c = ed0Var;
        this.d = d4Var;
        this.e = e4Var;
        this.f23844f = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        zf.a aVar;
        switch (this.f23841a) {
            case 3:
                SecureDocument secureDocument = (SecureDocument) this.d;
                org.telegram.ui.hn0 hn0Var = (org.telegram.ui.hn0) this.e;
                org.telegram.ui.jn0.Z(this.f23842b, (String) this.f23844f, secureDocument, hn0Var, (org.telegram.ui.jn0) this.f23843c);
                return;
            default:
                yh.c3 c3Var = (yh.c3) this.f23843c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f23844f;
                yh.a3 a3Var = (yh.a3) c3Var.f47316o.get(c3Var.f47318q);
                if (a3Var != null) {
                    zf.a aVar2 = a3Var.f47250c;
                    yh.s5 x10 = yh.s5.x(this.f23842b, c3Var.f47318q);
                    if (x10.e) {
                        aVar = zf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f49269b > aVar.f49269b) {
                        zf.b bVar = c3Var.f47318q;
                        if (bVar == zf.b.f49270a) {
                            new yh.k7(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == zf.b.f49271b) {
                            new di.h(context, e6Var, a3Var.f47250c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    nf.e eVar = c3Var.f47315n;
                    if (eVar != null) {
                        eVar.a(false);
                        c3Var.f47315n = null;
                    }
                    callback2.run(a3Var, c2Var.g(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.n2 n2Var = (qg.n2) this.f23843c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f23842b;
        org.telegram.ui.jr0 jr0Var = (org.telegram.ui.jr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f23844f;
        n2Var.f41871x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new h21(n2Var, bitmap, i10, jr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.cg0) this.f23843c, (String) this.d, hVar, list, (String) this.e, (String) this.f23844f, this.f23842b));
    }

    @Override
    public void q(ed0 ed0Var, int i10) {
        ed0 ed0Var2 = (ed0) this.f23843c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.e;
        e5.g(null, null, 0L, this.f23842b, 3, ed0Var2, d4Var, e4Var);
        e5.e((TextView) this.f23844f, ed0Var2, d4Var, e4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        zy0 zy0Var = (zy0) this.f23843c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f23844f;
        if (this.f23842b != zy0Var.I) {
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
            zy0Var.f31012x = false;
            zy0Var.v = false;
            zy0Var.c();
            ai.f0 f0Var = zy0Var.d;
            if (f0Var != null) {
                f0Var.setVisibility(0);
            }
            zy0Var.U = AndroidUtilities.dp(10.0f);
            zy0Var.f31011w = arrayList;
            zy0Var.V = 0;
            zy0Var.W = Integer.valueOf(str2.length());
            ai.f0 f0Var2 = zy0Var.d;
            if (f0Var2 != null) {
                f0Var2.invalidate();
            }
            wy0 wy0Var = zy0Var.f31007f;
            if (wy0Var != null) {
                wy0Var.l();
                return;
            }
            return;
        }
        zy0Var.f31011w = null;
        zy0Var.f31012x = true;
        zy0Var.f();
    }

    public e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23841a = i11;
        this.f23843c = obj;
        this.f23842b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f23844f = obj4;
    }

    public e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f23841a = i11;
        this.f23843c = notificationCenterDelegate;
        this.d = obj;
        this.f23842b = i10;
        this.e = obj2;
        this.f23844f = obj3;
    }

    public e2(org.telegram.ui.cg0 cg0Var, String str, String str2, String str3, int i10) {
        this.f23841a = 2;
        this.f23843c = cg0Var;
        this.d = str;
        this.e = str2;
        this.f23844f = str3;
        this.f23842b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        bs0 bs0Var = (bs0) this.f23843c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f23844f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.j5 j5Var = bs0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !bs0Var.L) {
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
            int i12 = this.f23842b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(bs0Var.f46471c));
            boolean h = j5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            a80 H = a80.H(o2Var, view);
            H.W(new es0(bs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.v1(bs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(bs0Var, i12, publicUsername, tL_starGiftCollection, context, e6Var, o2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uf.b(9, bs0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.v1(bs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.zl0(bs0Var, i10, tL_starGiftCollection, 14));
            bs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
