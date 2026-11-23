package org.telegram.tgnet;

import ai.w0;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.mediarouter.app.f0;
import c8.na;
import hi.t6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import jg.j0;
import ki.e2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g4;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.p0;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Components.voip.s2;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.web.o0;
import org.telegram.ui.web.x0;
public final class m implements Runnable {
    public final int f28594a;
    public final Object f28595b;

    public m(Object obj, int i7) {
        this.f28594a = i7;
        this.f28595b = obj;
    }

    @Override
    public final void run() {
        int L;
        Animation animation = null;
        int i7 = 0;
        switch (this.f28594a) {
            case 0:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f28595b);
                return;
            case 1:
                Drawable drawable = ActionBarLayout.f28673w1;
                g0.g3((w0) this.f28595b);
                return;
            case 2:
                ((p0) this.f28595b).setSelectedForDelete(false);
                return;
            case 3:
                v0 v0Var = (v0) this.f28595b;
                v0Var.f30076a0 = true;
                g0.l2(new t6(v0Var, 19), 8.0f);
                return;
            case 4:
                ((i1) this.f28595b).c();
                return;
            case 5:
                p1 p1Var = (p1) this.f28595b;
                t1 t1Var = p1Var.d;
                int i10 = g0.f24010q.x;
                t1Var.M = i10;
                int L2 = i10 - g0.L(56.0f);
                if (g0.Q1()) {
                    if (g0.P1()) {
                        L = g0.L(446.0f);
                    } else {
                        L = g0.L(496.0f);
                    }
                } else {
                    L = g0.L(356.0f);
                }
                int min = Math.min(L, L2);
                Rect rect = t1Var.B0;
                int i11 = min + rect.left + rect.right;
                if (t1Var.Y0) {
                    ViewGroup.LayoutParams layoutParams = p1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        p1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = t1Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i11;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 6:
                w1 w1Var = (w1) this.f28595b;
                w1Var.n1.setVisibility(0);
                w1Var.f30133p1.setAlpha(0.0f);
                int i12 = w1Var.l1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(w1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    w1Var.f30132o1.startAnimation(animation);
                } else {
                    w1Var.f30132o1.setAlpha(0.0f);
                    w1Var.f30132o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                w1Var.f30133p1.animate().setDuration(300L).alpha(1.0f).setListener(new u1(w1Var, 0)).start();
                return;
            case 7:
                w2 w2Var = (w2) ((e2) this.f28595b).f18633c;
                DialogInterface.OnDismissListener onDismissListener = w2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w2Var);
                }
                try {
                    w2Var.L();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 8:
                try {
                    ((o2) this.f28595b).f29812b.L();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 9:
                j3 j3Var = (j3) this.f28595b;
                if (j3Var.mo25d() != null) {
                    j3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 10:
                ((m3) this.f28595b).f();
                return;
            case 11:
                j4 j4Var = (j4) ((f0) this.f28595b).f2640b;
                j4Var.k();
                j4Var.j();
                return;
            case 12:
                j4 j4Var2 = ((g4) this.f28595b).f28951b;
                j4Var2.f29018c.dismiss();
                j4Var2.f29020f.removeAllViews();
                return;
            case 13:
                ((g4) this.f28595b).f28951b.f29018c.dismiss();
                return;
            case 14:
                Drawable drawable2 = (Drawable) this.f28595b;
                m6.d = null;
                m6.P();
                if (!m6.f29303b) {
                    m6.j(drawable2);
                    m6.h(drawable2);
                }
                ls.e().k(279, new Object[0]);
                return;
            case 15:
                g8 g8Var = (g8) m6.f29365e5.remove((gj) this.f28595b);
                if (g8Var != null) {
                    g8Var.f35419i = null;
                    return;
                }
                return;
            case 16:
                k0 k0Var = (k0) this.f28595b;
                k0Var.Q0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 17:
                s0 s0Var = (s0) this.f28595b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = s0Var.f41297a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    r0 r0Var = (r0) obj;
                    if (r0Var.f41277b && uptimeMillis - r0Var.f41278c > 5000) {
                        arrayList.remove(r0Var);
                        s0Var.removeView(r0Var);
                    }
                }
                m mVar = s0Var.h;
                s0Var.removeCallbacks(mVar);
                if (!arrayList.isEmpty()) {
                    s0Var.postDelayed(mVar, 500L);
                    return;
                }
                return;
            case 18:
                j1 j1Var = ((g1) this.f28595b).h;
                wi.n nVar = j1Var.f41048a;
                if (nVar != null) {
                    nVar.c();
                }
                org.telegram.ui.Components.voip.i1 i1Var = j1Var.f41052f;
                if (i1Var != null) {
                    i1Var.a();
                    return;
                }
                return;
            case 19:
                d2 d2Var = (d2) this.f28595b;
                d2Var.f40919e = false;
                HashMap hashMap = d2Var.f40916a;
                ArrayList arrayList3 = d2Var.f40918c;
                ArrayList arrayList4 = d2Var.f40917b;
                if (!arrayList4.isEmpty() || !arrayList3.isEmpty()) {
                    if (d2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(d2Var, d2Var.d);
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        c2 c2Var = (c2) arrayList4.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList3.size()) {
                                break;
                            } else if (c2Var.f40897a.equals(((c2) arrayList3.get(i14)).f40897a)) {
                                arrayList4.remove(i13);
                                arrayList3.remove(i14);
                                i13--;
                            } else {
                                i14++;
                            }
                        }
                        i13++;
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        d2Var.addView((View) arrayList4.get(i15), na.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        d2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    while (i7 < d2Var.getChildCount()) {
                        c2 c2Var2 = (c2) d2Var.getChildAt(i7);
                        hashMap.put(c2Var2.f40897a, c2Var2);
                        i7++;
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    d2Var.f40919e = true;
                    g0.h3(new m(d2Var, 19), 700L);
                    Runnable runnable = d2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                TextView[] textViewArr = ((k2) this.f28595b).f41107a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 21:
                TextView[] textViewArr2 = ((k2) ((j0) this.f28595b).f17538e).f41107a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 22:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f28595b;
                if (o2Var.getVisibility() == 0) {
                    o2Var.a();
                    return;
                }
                return;
            case 23:
                s2 s2Var = (s2) this.f28595b;
                s2Var.f41316e = Bitmap.createBitmap(s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(s2Var.f41316e).drawText(s2Var.d, s2Var.getMeasuredWidth() / 2, (int) ((s2Var.getMeasuredHeight() / 2) - ((s2Var.f41313a.ascent() + s2Var.f41313a.descent()) / 2.0f)), s2Var.f41313a);
                s2Var.postInvalidate();
                return;
            case 24:
                ((org.telegram.ui.web.k) this.f28595b).f53183x.f35742g3.O(true);
                return;
            case 25:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.s2) this.f28595b).f15323c).f53197f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 26:
                ((ot) this.f28595b).requestFocus();
                return;
            case 27:
                vf.c.t(((o0) this.f28595b).f53229b.f53241e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 28:
                hi.s2 s2Var2 = (hi.s2) this.f28595b;
                Utilities.f22776g.c(new es0((Object) s2Var2, (Object) new ArrayList(((x0) s2Var2.f15323c).f53360f), (Serializable) ((x0) s2Var2.f15323c).f53362r, 14));
                return;
            default:
                HttpGetFileTask.a((HttpGetFileTask) this.f28595b);
                return;
        }
    }
}
