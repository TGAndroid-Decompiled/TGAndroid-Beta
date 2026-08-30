package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ys extends f2.o1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final sl0 C;
    public final ArrayList f31085o = new ArrayList();
    public final ArrayList f31086p = new ArrayList();
    public final ArrayList f31087q = new ArrayList();
    public final ArrayList f31088r = new ArrayList();
    public final ArrayList f31089s = new ArrayList();
    public final ArrayList f31090t = new ArrayList();
    public final ArrayList f31091u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f31092w = new ArrayList();
    public final ArrayList f31093x = new ArrayList();
    public final ArrayList f31094y = new ArrayList();
    public org.telegram.ui.Cells.r2 f31095z;

    public ys(sl0 sl0Var) {
        this.f5818m = false;
        this.C = sl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f2.l1 l1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ws wsVar = (ws) arrayList.get(size);
            if (C(wsVar, l1Var) && wsVar.f30418a == null && wsVar.f30419b == null) {
                arrayList.remove(wsVar);
            }
        }
    }

    public final boolean C(ws wsVar, f2.l1 l1Var) {
        if (wsVar.f30419b == l1Var) {
            wsVar.f30419b = null;
        } else if (wsVar.f30418a == l1Var) {
            wsVar.f30418a = null;
        } else {
            return false;
        }
        View view = l1Var.f5785a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(l1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f31095z = null;
    }

    public final void E(f2.l1 l1Var) {
        l1Var.f5785a.animate().setInterpolator(D);
        f(l1Var);
    }

    @Override
    public final boolean c(f2.l1 l1Var, List list) {
        return l1Var.f5785a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        view.animate().cancel();
        ArrayList arrayList = this.f31087q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((xs) arrayList.get(size)).f30720a == l1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(l1Var);
                arrayList.remove(size);
            }
        }
        B(this.f31088r, l1Var);
        if (this.f31085o.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(l1Var);
        }
        if (this.f31086p.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(l1Var);
        }
        ArrayList arrayList2 = this.f31091u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, l1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f31090t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((xs) arrayList5.get(size4)).f30720a == l1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(l1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f31089s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(l1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(l1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f31093x.remove(l1Var);
        this.v.remove(l1Var);
        this.f31094y.remove(l1Var);
        this.f31092w.remove(l1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f31087q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            xs xsVar = (xs) arrayList.get(size);
            View view = xsVar.f30720a.f5785a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(xsVar.f30720a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f31085o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.l1 l1Var = (f2.l1) arrayList2.get(size2);
            View view2 = l1Var.f5785a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(l1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f31086p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.l1 l1Var2 = (f2.l1) arrayList3.get(size3);
            View view3 = l1Var2.f5785a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(l1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f31088r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ws wsVar = (ws) arrayList4.get(size4);
            f2.l1 l1Var3 = wsVar.f30418a;
            if (l1Var3 != null) {
                C(wsVar, l1Var3);
            }
            f2.l1 l1Var4 = wsVar.f30419b;
            if (l1Var4 != null) {
                C(wsVar, l1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f31090t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                xs xsVar2 = (xs) arrayList6.get(size6);
                View view4 = xsVar2.f30720a.f5785a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(xsVar2.f30720a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f31089s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f2.l1 l1Var5 = (f2.l1) arrayList8.get(size8);
                View view5 = l1Var5.f5785a;
                if (view5 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(l1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f31091u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ws wsVar2 = (ws) arrayList10.get(size10);
                f2.l1 l1Var6 = wsVar2.f30418a;
                if (l1Var6 != null) {
                    C(wsVar2, l1Var6);
                }
                f2.l1 l1Var7 = wsVar2.f30419b;
                if (l1Var7 != null) {
                    C(wsVar2, l1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f31093x);
        z(this.f31092w);
        z(this.v);
        z(this.f31094y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f31086p.isEmpty()) {
            ArrayList arrayList = this.f31088r;
            if (arrayList.isEmpty() && this.f31087q.isEmpty() && arrayList.isEmpty() && this.f31092w.isEmpty() && this.f31093x.isEmpty() && this.v.isEmpty() && this.f31094y.isEmpty() && this.f31090t.isEmpty() && this.f31089s.isEmpty() && this.f31091u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f31085o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f31087q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f31088r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f31086p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                f2.l1 l1Var = (f2.l1) obj;
                View view = l1Var.f5785a;
                this.f31093x.add(l1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f31095z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f31095z.setTopClip(i12);
                            this.f31095z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f31095z.setTopClip(measuredHeight2);
                            this.f31095z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, n6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ts(this, l1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ts(this, l1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new us(this, l1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f31090t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final ys f28809b;

                    {
                        this.f28809b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j10 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i14 = 0;
                                while (true) {
                                    ys ysVar = this.f28809b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        xs xsVar = (xs) obj2;
                                        f2.l1 l1Var2 = xsVar.f30720a;
                                        int i15 = xsVar.f30721b;
                                        int i16 = xsVar.f30722c;
                                        int i17 = xsVar.d;
                                        int i18 = xsVar.e;
                                        View view2 = l1Var2.f5785a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ysVar.B = i16 - i18;
                                        } else {
                                            ysVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = ysVar.f31095z;
                                        if (r2Var3 != null) {
                                            if (ysVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = ysVar.A;
                                                ysVar.B = measuredHeight3 - i21;
                                                ysVar.f31095z.setTopClip(i21);
                                                ysVar.f31095z.setBottomClip(ysVar.B);
                                            } else if (ysVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - ysVar.B;
                                                ysVar.A = measuredHeight4;
                                                ysVar.f31095z.setTopClip(measuredHeight4);
                                                ysVar.f31095z.setBottomClip(ysVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ysVar.f31092w.add(l1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(ysVar, l1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList7.clear();
                                        ysVar.f31090t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    ys ysVar2 = this.f28809b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        ws wsVar = (ws) obj3;
                                        ArrayList arrayList8 = ysVar2.f31094y;
                                        f2.l1 l1Var3 = wsVar.f30418a;
                                        f2.l1 l1Var4 = wsVar.f30419b;
                                        if (l1Var3 != null && l1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = l1Var3.f5785a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(l1Var4.f5785a, property, 1.0f));
                                            arrayList8.add(wsVar.f30418a);
                                            arrayList8.add(wsVar.f30419b);
                                            animatorSet.addListener(new vs(ysVar2, wsVar, l1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        ysVar2.f31091u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f31091u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ys f28809b;

                    {
                        this.f28809b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j10 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i14 = 0;
                                while (true) {
                                    ys ysVar = this.f28809b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        xs xsVar = (xs) obj2;
                                        f2.l1 l1Var2 = xsVar.f30720a;
                                        int i15 = xsVar.f30721b;
                                        int i16 = xsVar.f30722c;
                                        int i17 = xsVar.d;
                                        int i18 = xsVar.e;
                                        View view2 = l1Var2.f5785a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ysVar.B = i16 - i18;
                                        } else {
                                            ysVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = ysVar.f31095z;
                                        if (r2Var3 != null) {
                                            if (ysVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = ysVar.A;
                                                ysVar.B = measuredHeight3 - i21;
                                                ysVar.f31095z.setTopClip(i21);
                                                ysVar.f31095z.setBottomClip(ysVar.B);
                                            } else if (ysVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - ysVar.B;
                                                ysVar.A = measuredHeight4;
                                                ysVar.f31095z.setTopClip(measuredHeight4);
                                                ysVar.f31095z.setBottomClip(ysVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ysVar.f31092w.add(l1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(ysVar, l1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList72.clear();
                                        ysVar.f31090t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    ys ysVar2 = this.f28809b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        ws wsVar = (ws) obj3;
                                        ArrayList arrayList8 = ysVar2.f31094y;
                                        f2.l1 l1Var3 = wsVar.f30418a;
                                        f2.l1 l1Var4 = wsVar.f30419b;
                                        if (l1Var3 != null && l1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = l1Var3.f5785a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(l1Var4.f5785a, property, 1.0f));
                                            arrayList8.add(wsVar.f30418a);
                                            arrayList8.add(wsVar.f30419b);
                                            animatorSet.addListener(new vs(ysVar2, wsVar, l1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        ysVar2.f31091u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f31089s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    f2.l1 l1Var2 = (f2.l1) obj2;
                    View view2 = l1Var2.f5785a;
                    this.v.add(l1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new us(this, l1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(f2.l1 l1Var) {
        E(l1Var);
        View view = l1Var.f5785a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f31086p;
        arrayList.add(l1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.l1) arrayList.get(i10)).f5785a.setAlpha(0.0f);
                if (((f2.l1) arrayList.get(i10)).f5785a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((f2.l1) arrayList.get(i10)).f5785a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.l1 l1Var, f2.l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(l1Var);
            E(l1Var2);
            View view2 = l1Var2.f5785a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f30418a = l1Var;
            obj.f30419b = l1Var2;
            obj.f30420c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f30421f = i13;
            this.f31088r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.f5785a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = l1Var.f5785a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view2).setMoving(true);
        } else if (view2 instanceof tf.j) {
            ((tf.j) view2).f44757a = true;
        }
        ?? obj = new Object();
        obj.f30720a = l1Var;
        obj.f30721b = translationX;
        obj.f30722c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f31087q.add(obj);
        return true;
    }

    @Override
    public final void s(f2.l1 l1Var, c5.e eVar) {
        E(l1Var);
        this.f31085o.add(l1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.C;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (l1Var.f5785a == r2Var) {
            this.f31095z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.l1) arrayList.get(size)).f5785a.animate().cancel();
        }
    }
}
