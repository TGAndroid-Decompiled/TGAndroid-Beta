package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class us extends f2.q1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final jl0 C;
    public final ArrayList f33304o = new ArrayList();
    public final ArrayList f33305p = new ArrayList();
    public final ArrayList f33306q = new ArrayList();
    public final ArrayList f33307r = new ArrayList();
    public final ArrayList f33308s = new ArrayList();
    public final ArrayList f33309t = new ArrayList();
    public final ArrayList f33310u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f33311w = new ArrayList();
    public final ArrayList f33312x = new ArrayList();
    public final ArrayList f33313y = new ArrayList();
    public org.telegram.ui.Cells.p2 f33314z;

    public us(jl0 jl0Var) {
        this.f6463m = false;
        this.C = jl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f2.n1 n1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ss ssVar = (ss) arrayList.get(size);
            if (C(ssVar, n1Var) && ssVar.f32713a == null && ssVar.f32714b == null) {
                arrayList.remove(ssVar);
            }
        }
    }

    public final boolean C(ss ssVar, f2.n1 n1Var) {
        if (ssVar.f32714b == n1Var) {
            ssVar.f32714b = null;
        } else if (ssVar.f32713a == n1Var) {
            ssVar.f32713a = null;
        } else {
            return false;
        }
        View view = n1Var.f6432a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(n1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f33314z = null;
    }

    public final void E(f2.n1 n1Var) {
        n1Var.f6432a.animate().setInterpolator(D);
        f(n1Var);
    }

    @Override
    public final boolean c(f2.n1 n1Var, List list) {
        return n1Var.f6432a instanceof org.telegram.ui.Cells.v2;
    }

    @Override
    public final void f(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        view.animate().cancel();
        ArrayList arrayList = this.f33306q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ts) arrayList.get(size)).f33031a == n1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(n1Var);
                arrayList.remove(size);
            }
        }
        B(this.f33307r, n1Var);
        if (this.f33304o.remove(n1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(n1Var);
        }
        if (this.f33305p.remove(n1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(n1Var);
        }
        ArrayList arrayList2 = this.f33310u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, n1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f33309t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ts) arrayList5.get(size4)).f33031a == n1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(n1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f33308s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(n1Var)) {
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(n1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f33312x.remove(n1Var);
        this.v.remove(n1Var);
        this.f33313y.remove(n1Var);
        this.f33311w.remove(n1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f33306q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ts tsVar = (ts) arrayList.get(size);
            View view = tsVar.f33031a.f6432a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(tsVar.f33031a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f33304o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.n1 n1Var = (f2.n1) arrayList2.get(size2);
            View view2 = n1Var.f6432a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(n1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f33305p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.n1 n1Var2 = (f2.n1) arrayList3.get(size3);
            View view3 = n1Var2.f6432a;
            if (view3 instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(n1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f33307r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ss ssVar = (ss) arrayList4.get(size4);
            f2.n1 n1Var3 = ssVar.f32713a;
            if (n1Var3 != null) {
                C(ssVar, n1Var3);
            }
            f2.n1 n1Var4 = ssVar.f32714b;
            if (n1Var4 != null) {
                C(ssVar, n1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f33309t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ts tsVar2 = (ts) arrayList6.get(size6);
                View view4 = tsVar2.f33031a.f6432a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(tsVar2.f33031a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f33308s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f2.n1 n1Var5 = (f2.n1) arrayList8.get(size8);
                View view5 = n1Var5.f6432a;
                if (view5 instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(n1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f33310u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ss ssVar2 = (ss) arrayList10.get(size10);
                f2.n1 n1Var6 = ssVar2.f32713a;
                if (n1Var6 != null) {
                    C(ssVar2, n1Var6);
                }
                f2.n1 n1Var7 = ssVar2.f32714b;
                if (n1Var7 != null) {
                    C(ssVar2, n1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f33312x);
        z(this.f33311w);
        z(this.v);
        z(this.f33313y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f33305p.isEmpty()) {
            ArrayList arrayList = this.f33307r;
            if (arrayList.isEmpty() && this.f33306q.isEmpty() && arrayList.isEmpty() && this.f33311w.isEmpty() && this.f33312x.isEmpty() && this.v.isEmpty() && this.f33313y.isEmpty() && this.f33309t.isEmpty() && this.f33308s.isEmpty() && this.f33310u.isEmpty()) {
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
        ArrayList arrayList2 = this.f33304o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f33306q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f33307r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f33305p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                f2.n1 n1Var = (f2.n1) obj;
                View view = n1Var.f6432a;
                this.f33312x.add(n1Var);
                if (view instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    org.telegram.ui.Cells.p2 p2Var2 = this.f33314z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == p2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = p2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f33314z.setTopClip(i12);
                            this.f33314z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = p2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f33314z.setTopClip(measuredHeight2);
                            this.f33314z.setBottomClip(this.B);
                        }
                        p2Var.setElevation(-1.0f);
                        p2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(p2Var, r6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ps(this, n1Var, p2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(p2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ps(this, n1Var, p2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new qs(this, n1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f33309t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final us f31470b;

                    {
                        this.f31470b = this;
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
                                    us usVar = this.f31470b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        ts tsVar = (ts) obj2;
                                        f2.n1 n1Var2 = tsVar.f33031a;
                                        int i15 = tsVar.f33032b;
                                        int i16 = tsVar.f33033c;
                                        int i17 = tsVar.d;
                                        int i18 = tsVar.f33034e;
                                        View view2 = n1Var2.f6432a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            usVar.B = i16 - i18;
                                        } else {
                                            usVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.p2 p2Var3 = usVar.f33314z;
                                        if (p2Var3 != null) {
                                            if (usVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = p2Var3.getMeasuredHeight();
                                                int i21 = usVar.A;
                                                usVar.B = measuredHeight3 - i21;
                                                usVar.f33314z.setTopClip(i21);
                                                usVar.f33314z.setBottomClip(usVar.B);
                                            } else if (usVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = p2Var3.getMeasuredHeight() - usVar.B;
                                                usVar.A = measuredHeight4;
                                                usVar.f33314z.setTopClip(measuredHeight4);
                                                usVar.f33314z.setBottomClip(usVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        usVar.f33311w.add(n1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(usVar, n1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList7.clear();
                                        usVar.f33309t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    us usVar2 = this.f31470b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        ss ssVar = (ss) obj3;
                                        ArrayList arrayList8 = usVar2.f33313y;
                                        f2.n1 n1Var3 = ssVar.f32713a;
                                        f2.n1 n1Var4 = ssVar.f32714b;
                                        if (n1Var3 != null && n1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = n1Var3.f6432a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(n1Var4.f6432a, property, 1.0f));
                                            arrayList8.add(ssVar.f32713a);
                                            arrayList8.add(ssVar.f32714b);
                                            animatorSet.addListener(new rs(usVar2, ssVar, n1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        usVar2.f33310u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f33310u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final us f31470b;

                    {
                        this.f31470b = this;
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
                                    us usVar = this.f31470b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        ts tsVar = (ts) obj2;
                                        f2.n1 n1Var2 = tsVar.f33031a;
                                        int i15 = tsVar.f33032b;
                                        int i16 = tsVar.f33033c;
                                        int i17 = tsVar.d;
                                        int i18 = tsVar.f33034e;
                                        View view2 = n1Var2.f6432a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            usVar.B = i16 - i18;
                                        } else {
                                            usVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.p2 p2Var3 = usVar.f33314z;
                                        if (p2Var3 != null) {
                                            if (usVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = p2Var3.getMeasuredHeight();
                                                int i21 = usVar.A;
                                                usVar.B = measuredHeight3 - i21;
                                                usVar.f33314z.setTopClip(i21);
                                                usVar.f33314z.setBottomClip(usVar.B);
                                            } else if (usVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = p2Var3.getMeasuredHeight() - usVar.B;
                                                usVar.A = measuredHeight4;
                                                usVar.f33314z.setTopClip(measuredHeight4);
                                                usVar.f33314z.setBottomClip(usVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        usVar.f33311w.add(n1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(usVar, n1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList72.clear();
                                        usVar.f33309t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    us usVar2 = this.f31470b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        ss ssVar = (ss) obj3;
                                        ArrayList arrayList8 = usVar2.f33313y;
                                        f2.n1 n1Var3 = ssVar.f32713a;
                                        f2.n1 n1Var4 = ssVar.f32714b;
                                        if (n1Var3 != null && n1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = n1Var3.f6432a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(n1Var4.f6432a, property, 1.0f));
                                            arrayList8.add(ssVar.f32713a);
                                            arrayList8.add(ssVar.f32714b);
                                            animatorSet.addListener(new rs(usVar2, ssVar, n1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        usVar2.f33310u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f33308s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    f2.n1 n1Var2 = (f2.n1) obj2;
                    View view2 = n1Var2.f6432a;
                    this.v.add(n1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new qs(this, n1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(f2.n1 n1Var) {
        E(n1Var);
        View view = n1Var.f6432a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f33305p;
        arrayList.add(n1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.n1) arrayList.get(i10)).f6432a.setAlpha(0.0f);
                if (((f2.n1) arrayList.get(i10)).f6432a instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) ((f2.n1) arrayList.get(i10)).f6432a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.n1 n1Var, f2.n1 n1Var2, a5.e eVar, int i10, int i11, int i12, int i13) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            E(n1Var);
            E(n1Var2);
            View view2 = n1Var2.f6432a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f32713a = n1Var;
            obj.f32714b = n1Var2;
            obj.f32715c = i10;
            obj.d = i11;
            obj.f32716e = i12;
            obj.f32717f = i13;
            this.f33307r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f2.n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        View view = n1Var.f6432a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = n1Var.f6432a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(n1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(n1Var);
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
        } else if (view2 instanceof rf.k) {
            ((rf.k) view2).f47274a = true;
        }
        ?? obj = new Object();
        obj.f33031a = n1Var;
        obj.f33032b = translationX;
        obj.f33033c = translationY;
        obj.d = i12;
        obj.f33034e = i13;
        this.f33306q.add(obj);
        return true;
    }

    @Override
    public final void s(f2.n1 n1Var, a5.e eVar) {
        E(n1Var);
        this.f33304o.add(n1Var);
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.C;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.p2)) {
                p2Var = (org.telegram.ui.Cells.p2) childAt;
            }
            i10++;
        }
        if (n1Var.f6432a == p2Var) {
            this.f33314z = p2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.n1) arrayList.get(size)).f6432a.animate().cancel();
        }
    }
}
