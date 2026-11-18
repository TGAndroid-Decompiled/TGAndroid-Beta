package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.tm0;
public final class a2 implements Runnable {
    public final int f28753a;
    public final Object f28754b;
    public final Object f28755c;

    public a2(int i7, Object obj, Object obj2) {
        this.f28753a = i7;
        this.f28754b = obj;
        this.f28755c = obj2;
    }

    @Override
    public final void run() {
        int i7 = this.f28753a;
        float f10 = 0.0f;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f28755c;
        Object obj2 = this.f28754b;
        switch (i7) {
            case 0:
                fh.g gVar = (fh.g) obj;
                ri.q qVar = ((h2) obj2).glassEngine;
                ArrayList arrayList2 = qVar.f56696c;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (((ri.p) arrayList2.get(size)).f56688b == gVar && ((ri.p) arrayList2.remove(size)).f56693i) {
                        qVar.f56698f = true;
                    }
                }
                return;
            case 1:
                k kVar = (k) obj2;
                boolean canScrollVertically = ((tm0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar.D1 != z10) {
                    ValueAnimator valueAnimator = kVar.F1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f11 = kVar.E1;
                    kVar.D1 = z10;
                    if (!canScrollVertically) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    kVar.F1 = ofFloat;
                    ofFloat.addUpdateListener(new a(kVar, 4));
                    kVar.F1.addListener(new c(kVar, z10, 1));
                    kVar.F1.setDuration(320L);
                    kVar.F1.setInterpolator(lr.h);
                    kVar.F1.start();
                    return;
                }
                return;
            case 2:
                k kVar2 = (k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar2.D1 != z11) {
                    ValueAnimator valueAnimator2 = kVar2.F1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f12 = kVar2.E1;
                    kVar2.D1 = z11;
                    if (!canScrollVertically2) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f10);
                    kVar2.F1 = ofFloat2;
                    ofFloat2.addUpdateListener(new a(kVar2, 3));
                    kVar2.F1.addListener(new c(kVar2, z11, 0));
                    kVar2.F1.setDuration(320L);
                    kVar2.F1.setInterpolator(lr.h);
                    kVar2.F1.start();
                    return;
                }
                return;
            case 3:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f28676w1;
                actionBarLayout.e0((h2) obj2, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 4:
                h2 h2Var = (h2) obj2;
                h2 h2Var2 = (h2) obj;
                Drawable drawable2 = ActionBarLayout.f28676w1;
                if (h2Var != null) {
                    h2Var.onTransitionAnimationEnd(false, false);
                }
                h2Var2.onTransitionAnimationEnd(true, false);
                h2Var2.onBecomeFullyVisible();
                return;
            case 5:
                Bitmap bitmap2 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) obj2);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 6:
                h6 h6Var = (h6) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    k6 k6Var = (k6) arrayList3.get(i10);
                    File e11 = k6Var.e();
                    if (e11 != null && e11.length() > 0) {
                        arrayList3.remove(i10);
                        i10--;
                        size2--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(k6Var.f29182o)) {
                            arrayList.add(k6Var.f29182o);
                        }
                    }
                    i10++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size3 = arrayList.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i11);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(h6Var.f29003a).sendRequest(getmultiwallpapers, new f6(h6Var, arrayList3, 0));
                    return;
                }
                return;
            case 7:
                h6 h6Var2 = (h6) obj2;
                g6 g6Var = (g6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = g6Var.f28980a;
                w7.G(j10.f24773t0);
                File J = w7.J(tL_wallPaper.document, null, true, true);
                ArrayList arrayList4 = g6Var.f28981b;
                int size4 = arrayList4.size();
                ArrayList arrayList5 = null;
                for (int i12 = 0; i12 < size4; i12++) {
                    k6 k6Var2 = (k6) arrayList4.get(i12);
                    if (k6Var2.f29182o.equals(tL_wallPaper.slug)) {
                        bitmap = h6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, k6Var2);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            arrayList5.add(k6Var2);
                        }
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                org.telegram.messenger.g0.g3(new di.p6((Object) h6Var2, (Object) arrayList5, false, 13));
                return;
            default:
                m6 m6Var = (m6) obj2;
                m6Var.d((File) obj, m6Var.f29262i0);
                org.telegram.messenger.g0.g3(new l6(m6Var, 0));
                return;
        }
    }

    public a2(ActionBarLayout actionBarLayout, h2 h2Var) {
        this.f28753a = 3;
        this.f28755c = actionBarLayout;
        this.f28754b = h2Var;
    }
}
