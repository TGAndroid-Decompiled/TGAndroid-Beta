package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

public abstract class os extends f2.r1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final zk0 C;

    public final ArrayList f31396o = new ArrayList();

    public final ArrayList f31397p = new ArrayList();

    public final ArrayList f31398q = new ArrayList();

    public final ArrayList f31399r = new ArrayList();

    public final ArrayList f31400s = new ArrayList();

    public final ArrayList f31401t = new ArrayList();

    public final ArrayList f31402u = new ArrayList();
    public final ArrayList v = new ArrayList();

    public final ArrayList f31403w = new ArrayList();

    public final ArrayList f31404x = new ArrayList();

    public final ArrayList f31405y = new ArrayList();

    public org.telegram.ui.Cells.p2 f31406z;

    public os(zk0 zk0Var) {
        this.f5819m = false;
        this.C = zk0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, f2.o1 o1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ms msVar = (ms) arrayList.get(size);
            if (C(msVar, o1Var) && msVar.f30740a == null && msVar.f30741b == null) {
                arrayList.remove(msVar);
            }
        }
    }

    public final boolean C(ms msVar, f2.o1 o1Var) {
        if (msVar.f30741b == o1Var) {
            msVar.f30741b = null;
        } else {
            if (msVar.f30740a != o1Var) {
                return false;
            }
            msVar.f30740a = null;
        }
        View view = o1Var.f5789a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(o1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f31406z = null;
    }

    public final void E(f2.o1 o1Var) {
        o1Var.f5789a.animate().setInterpolator(D);
        f(o1Var);
    }

    @Override
    public final boolean c(f2.o1 o1Var, List list) {
        return o1Var.f5789a instanceof org.telegram.ui.Cells.v2;
    }

    @Override
    public final void f(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        view.animate().cancel();
        ArrayList arrayList = this.f31398q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ns) arrayList.get(size)).f31025a == o1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(o1Var);
                arrayList.remove(size);
            }
        }
        B(this.f31399r, o1Var);
        if (this.f31396o.remove(o1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(o1Var);
        }
        if (this.f31397p.remove(o1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(o1Var);
        }
        ArrayList arrayList2 = this.f31402u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, o1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f31401t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((ns) arrayList5.get(size4)).f31025a == o1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(o1Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f31400s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(o1Var)) {
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(o1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f31404x.remove(o1Var);
        this.v.remove(o1Var);
        this.f31405y.remove(o1Var);
        this.f31403w.remove(o1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f31398q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ns nsVar = (ns) arrayList.get(size);
            View view = nsVar.f31025a.f5789a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(nsVar.f31025a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f31396o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.o1 o1Var = (f2.o1) arrayList2.get(size2);
            View view2 = o1Var.f5789a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(o1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f31397p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.o1 o1Var2 = (f2.o1) arrayList3.get(size3);
            View view3 = o1Var2.f5789a;
            if (view3 instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(o1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f31399r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ms msVar = (ms) arrayList4.get(size4);
            f2.o1 o1Var3 = msVar.f30740a;
            if (o1Var3 != null) {
                C(msVar, o1Var3);
            }
            f2.o1 o1Var4 = msVar.f30741b;
            if (o1Var4 != null) {
                C(msVar, o1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.f31401t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    ns nsVar2 = (ns) arrayList6.get(size6);
                    View view4 = nsVar2.f31025a.f5789a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(nsVar2.f31025a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f31400s;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    f2.o1 o1Var5 = (f2.o1) arrayList8.get(size8);
                    View view5 = o1Var5.f5789a;
                    if (view5 instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(o1Var5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f31402u;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ms msVar2 = (ms) arrayList10.get(size10);
                    f2.o1 o1Var6 = msVar2.f30740a;
                    if (o1Var6 != null) {
                        C(msVar2, o1Var6);
                    }
                    f2.o1 o1Var7 = msVar2.f30741b;
                    if (o1Var7 != null) {
                        C(msVar2, o1Var7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            z(this.f31404x);
            z(this.f31403w);
            z(this.v);
            z(this.f31405y);
            e();
        }
    }

    @Override
    public final boolean k() {
        if (!this.f31397p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.f31399r;
        return (arrayList.isEmpty() && this.f31398q.isEmpty() && arrayList.isEmpty() && this.f31403w.isEmpty() && this.f31404x.isEmpty() && this.v.isEmpty() && this.f31405y.isEmpty() && this.f31401t.isEmpty() && this.f31400s.isEmpty() && this.f31402u.isEmpty()) ? false : true;
    }

    @Override
    public final void m() {
        ArrayList arrayList = this.f31396o;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f31398q;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f31399r;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f31397p;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int i10 = 0;
        for (int size = arrayList.size(); i10 < size; size = size) {
            Object obj = arrayList.get(i10);
            i10++;
            f2.o1 o1Var = (f2.o1) obj;
            View view = o1Var.f5789a;
            this.f31404x.add(o1Var);
            if (view instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                org.telegram.ui.Cells.p2 p2Var2 = this.f31406z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == p2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = p2Var2.getMeasuredHeight();
                        int i11 = this.A;
                        this.B = measuredHeight - i11;
                        this.f31406z.setTopClip(i11);
                        this.f31406z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = p2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.f31406z.setTopClip(measuredHeight2);
                        this.f31406z.setBottomClip(this.B);
                    }
                    p2Var.setElevation(-1.0f);
                    p2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(p2Var, m6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new js(this, o1Var, p2Var, 0));
                    duration.start();
                } else {
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(p2Var, (Property<org.telegram.ui.Cells.p2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new js(this, o1Var, p2Var, 1));
                    duration2.start();
                }
            } else {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.setDuration(180L).alpha(0.0f).setListener(new ks(this, o1Var, viewPropertyAnimatorAnimate, view)).start();
            }
            arrayList = arrayList;
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList5 = new ArrayList(arrayList2);
            this.f31401t.add(arrayList5);
            arrayList2.clear();
            final int i12 = 0;
            new Runnable(this) {

                public final os f29479b;

                {
                    this.f29479b = this;
                }

                @Override
                public final void run() {
                    int i13 = i12;
                    long j10 = 180;
                    ArrayList arrayList6 = arrayList5;
                    switch (i13) {
                        case 0:
                            int size2 = arrayList6.size();
                            int i14 = 0;
                            while (true) {
                                os osVar = this.f29479b;
                                if (i14 >= size2) {
                                    arrayList6.clear();
                                    osVar.f31401t.remove(arrayList6);
                                } else {
                                    Object obj2 = arrayList6.get(i14);
                                    i14++;
                                    ns nsVar = (ns) obj2;
                                    f2.o1 o1Var2 = nsVar.f31025a;
                                    int i15 = nsVar.f31026b;
                                    int i16 = nsVar.f31027c;
                                    int i17 = nsVar.d;
                                    int i18 = nsVar.f31028e;
                                    View view2 = o1Var2.f5789a;
                                    int i19 = i17 - i15;
                                    int i20 = i18 - i16;
                                    if (i19 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i20 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i16 > i18) {
                                        osVar.B = i16 - i18;
                                    } else {
                                        osVar.A = i20;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = osVar.f31406z;
                                    if (p2Var3 != null) {
                                        if (osVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i21 = osVar.A;
                                            osVar.B = measuredHeight3 - i21;
                                            osVar.f31406z.setTopClip(i21);
                                            osVar.f31406z.setBottomClip(osVar.B);
                                        } else if (osVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - osVar.B;
                                            osVar.A = measuredHeight4;
                                            osVar.f31406z.setTopClip(measuredHeight4);
                                            osVar.f31406z.setBottomClip(osVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                                    osVar.f31403w.add(o1Var2);
                                    viewPropertyAnimatorAnimate2.setDuration(180L).setListener(new f2.h(osVar, o1Var2, i19, view2, i20, viewPropertyAnimatorAnimate2, 1)).start();
                                }
                                break;
                            }
                            break;
                        default:
                            int size3 = arrayList6.size();
                            int i22 = 0;
                            while (true) {
                                os osVar2 = this.f29479b;
                                if (i22 >= size3) {
                                    arrayList6.clear();
                                    osVar2.f31402u.remove(arrayList6);
                                } else {
                                    Object obj3 = arrayList6.get(i22);
                                    i22++;
                                    ms msVar = (ms) obj3;
                                    ArrayList arrayList7 = osVar2.f31405y;
                                    f2.o1 o1Var3 = msVar.f30740a;
                                    f2.o1 o1Var4 = msVar.f30741b;
                                    if (o1Var3 != null && o1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = o1Var3.f5789a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(o1Var4.f5789a, (Property<View, Float>) property, 1.0f));
                                        arrayList7.add(msVar.f30740a);
                                        arrayList7.add(msVar.f30741b);
                                        animatorSet.addListener(new ls(osVar2, msVar, o1Var3, animatorSet, 0));
                                        animatorSet.start();
                                    }
                                    j10 = 180;
                                }
                                break;
                            }
                            break;
                    }
                }
            }.run();
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.f31402u.add(arrayList6);
            arrayList3.clear();
            final int i13 = 1;
            new Runnable(this) {

                public final os f29479b;

                {
                    this.f29479b = this;
                }

                @Override
                public final void run() {
                    int i14 = i13;
                    long j10 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i14) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i15 = 0;
                            while (true) {
                                os osVar = this.f29479b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    osVar.f31401t.remove(arrayList7);
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    ns nsVar = (ns) obj2;
                                    f2.o1 o1Var2 = nsVar.f31025a;
                                    int i16 = nsVar.f31026b;
                                    int i17 = nsVar.f31027c;
                                    int i18 = nsVar.d;
                                    int i19 = nsVar.f31028e;
                                    View view2 = o1Var2.f5789a;
                                    int i110 = i18 - i16;
                                    int i20 = i19 - i17;
                                    if (i110 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i20 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        osVar.B = i17 - i19;
                                    } else {
                                        osVar.A = i20;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = osVar.f31406z;
                                    if (p2Var3 != null) {
                                        if (osVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i21 = osVar.A;
                                            osVar.B = measuredHeight3 - i21;
                                            osVar.f31406z.setTopClip(i21);
                                            osVar.f31406z.setBottomClip(osVar.B);
                                        } else if (osVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - osVar.B;
                                            osVar.A = measuredHeight4;
                                            osVar.f31406z.setTopClip(measuredHeight4);
                                            osVar.f31406z.setBottomClip(osVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                                    osVar.f31403w.add(o1Var2);
                                    viewPropertyAnimatorAnimate2.setDuration(180L).setListener(new f2.h(osVar, o1Var2, i110, view2, i20, viewPropertyAnimatorAnimate2, 1)).start();
                                }
                                break;
                            }
                            break;
                        default:
                            int size3 = arrayList7.size();
                            int i22 = 0;
                            while (true) {
                                os osVar2 = this.f29479b;
                                if (i22 >= size3) {
                                    arrayList7.clear();
                                    osVar2.f31402u.remove(arrayList7);
                                } else {
                                    Object obj3 = arrayList7.get(i22);
                                    i22++;
                                    ms msVar = (ms) obj3;
                                    ArrayList arrayList8 = osVar2.f31405y;
                                    f2.o1 o1Var3 = msVar.f30740a;
                                    f2.o1 o1Var4 = msVar.f30741b;
                                    if (o1Var3 != null && o1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = o1Var3.f5789a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(o1Var4.f5789a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(msVar.f30740a);
                                        arrayList8.add(msVar.f30741b);
                                        animatorSet.addListener(new ls(osVar2, msVar, o1Var3, animatorSet, 0));
                                        animatorSet.start();
                                    }
                                    j10 = 180;
                                }
                                break;
                            }
                            break;
                    }
                }
            }.run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList(arrayList4);
        ArrayList arrayList8 = this.f31400s;
        arrayList8.add(arrayList7);
        arrayList4.clear();
        int size2 = arrayList7.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList7.get(i14);
            i14++;
            f2.o1 o1Var2 = (f2.o1) obj2;
            View view2 = o1Var2.f5789a;
            this.v.add(o1Var2);
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(180L).setListener(new ks(this, o1Var2, view2, viewPropertyAnimatorAnimate2)).start();
        }
        arrayList7.clear();
        arrayList8.remove(arrayList7);
    }

    @Override
    public final void p(f2.o1 o1Var) {
        E(o1Var);
        View view = o1Var.f5789a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f31397p;
        arrayList.add(o1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.o1) arrayList.get(i10)).f5789a.setAlpha(0.0f);
                if (((f2.o1) arrayList.get(i10)).f5789a instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) ((f2.o1) arrayList.get(i10)).f5789a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.o1 o1Var, f2.o1 o1Var2, d5.p pVar, int i10, int i11, int i12, int i13) {
        View view = o1Var.f5789a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return false;
        }
        E(o1Var);
        E(o1Var2);
        View view2 = o1Var2.f5789a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        ms msVar = new ms();
        msVar.f30740a = o1Var;
        msVar.f30741b = o1Var2;
        msVar.f30742c = i10;
        msVar.d = i11;
        msVar.f30743e = i12;
        msVar.f30744f = i13;
        this.f31399r.add(msVar);
        return true;
    }

    @Override
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        View view = o1Var.f5789a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = o1Var.f5789a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(o1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view2).setMoving(true);
        } else if (view2 instanceof pf.j) {
            ((pf.j) view2).f45833a = true;
        }
        ns nsVar = new ns();
        nsVar.f31025a = o1Var;
        nsVar.f31026b = translationX;
        nsVar.f31027c = translationY;
        nsVar.d = i12;
        nsVar.f31028e = i13;
        this.f31398q.add(nsVar);
        return true;
    }

    @Override
    public final void s(f2.o1 o1Var, d5.p pVar) {
        E(o1Var);
        this.f31396o.add(o1Var);
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.C;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.p2)) {
                p2Var = (org.telegram.ui.Cells.p2) childAt;
            }
            i10++;
        }
        if (o1Var.f5789a == p2Var) {
            this.f31406z = p2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.o1) arrayList.get(size)).f5789a.animate().cancel();
        }
    }
}
