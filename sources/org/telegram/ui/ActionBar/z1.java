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
import org.telegram.messenger.k10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.vm0;
public final class z1 implements Runnable {
    public final int f30281a;
    public final Object f30282b;
    public final Object f30283c;

    public z1(int i7, Object obj, Object obj2) {
        this.f30281a = i7;
        this.f30282b = obj;
        this.f30283c = obj2;
    }

    @Override
    public final void run() {
        int i7 = this.f30281a;
        float f10 = 0.0f;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object obj = this.f30283c;
        Object obj2 = this.f30282b;
        switch (i7) {
            case 0:
                fh.g gVar = (fh.g) obj;
                ri.q qVar = ((g2) obj2).glassEngine;
                ArrayList arrayList2 = qVar.f56706c;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (((ri.p) arrayList2.get(size)).f56698b == gVar && ((ri.p) arrayList2.remove(size)).f56703i) {
                        qVar.f56708f = true;
                    }
                }
                return;
            case 1:
                k kVar = (k) obj2;
                boolean canScrollVertically = ((vm0) obj).canScrollVertically(-1);
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
                    kVar.F1.setInterpolator(nr.h);
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
                    kVar2.F1.setInterpolator(nr.h);
                    kVar2.F1.start();
                    return;
                }
                return;
            case 3:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f28673w1;
                actionBarLayout.e0((g2) obj2, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 4:
                g2 g2Var = (g2) obj2;
                g2 g2Var2 = (g2) obj;
                Drawable drawable2 = ActionBarLayout.f28673w1;
                if (g2Var != null) {
                    g2Var.onTransitionAnimationEnd(false, false);
                }
                g2Var2.onTransitionAnimationEnd(true, false);
                g2Var2.onBecomeFullyVisible();
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
                g6 g6Var = (g6) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    j6 j6Var = (j6) arrayList3.get(i10);
                    File e11 = j6Var.e();
                    if (e11 != null && e11.length() > 0) {
                        arrayList3.remove(i10);
                        i10--;
                        size2--;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(j6Var.f29074o)) {
                            arrayList.add(j6Var.f29074o);
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
                    ConnectionsManager.getInstance(g6Var.f28953a).sendRequest(getmultiwallpapers, new e6(g6Var, arrayList3, 0));
                    return;
                }
                return;
            case 7:
                g6 g6Var2 = (g6) obj2;
                f6 f6Var = (f6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = f6Var.f28929a;
                w7.G(k10.f24932t0);
                File J = w7.J(tL_wallPaper.document, null, true, true);
                ArrayList arrayList4 = f6Var.f28930b;
                int size4 = arrayList4.size();
                ArrayList arrayList5 = null;
                for (int i12 = 0; i12 < size4; i12++) {
                    j6 j6Var2 = (j6) arrayList4.get(i12);
                    if (j6Var2.f29074o.equals(tL_wallPaper.slug)) {
                        bitmap = g6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, j6Var2);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            arrayList5.add(j6Var2);
                        }
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                org.telegram.messenger.g0.g3(new di.p6((Object) g6Var2, (Object) arrayList5, false, 13));
                return;
            default:
                l6 l6Var = (l6) obj2;
                l6Var.d((File) obj, l6Var.f29211i0);
                org.telegram.messenger.g0.g3(new k6(l6Var, 0));
                return;
        }
    }

    public z1(ActionBarLayout actionBarLayout, g2 g2Var) {
        this.f30281a = 3;
        this.f30283c = actionBarLayout;
        this.f30282b = g2Var;
    }
}
