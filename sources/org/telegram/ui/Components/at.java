package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class at extends f2.p1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final tl0 C;
    public final ArrayList f25335o = new ArrayList();
    public final ArrayList f25336p = new ArrayList();
    public final ArrayList f25337q = new ArrayList();
    public final ArrayList f25338r = new ArrayList();
    public final ArrayList f25339s = new ArrayList();
    public final ArrayList f25340t = new ArrayList();
    public final ArrayList f25341u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f25342w = new ArrayList();
    public final ArrayList f25343x = new ArrayList();
    public final ArrayList f25344y = new ArrayList();
    public org.telegram.ui.Cells.r2 f25345z;

    public at(tl0 tl0Var) {
        this.f5910m = false;
        this.C = tl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f2.m1 m1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ys ysVar = (ys) arrayList.get(size);
            if (C(ysVar, m1Var) && ysVar.f33567a == null && ysVar.f33568b == null) {
                arrayList.remove(ysVar);
            }
        }
    }

    public final boolean C(ys ysVar, f2.m1 m1Var) {
        if (ysVar.f33568b == m1Var) {
            ysVar.f33568b = null;
        } else if (ysVar.f33567a == m1Var) {
            ysVar.f33567a = null;
        } else {
            return false;
        }
        View view = m1Var.f5875a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(m1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f25345z = null;
    }

    public final void E(f2.m1 m1Var) {
        m1Var.f5875a.animate().setInterpolator(D);
        f(m1Var);
    }

    @Override
    public final boolean c(f2.m1 m1Var, List list) {
        return m1Var.f5875a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        view.animate().cancel();
        ArrayList arrayList = this.f25337q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((zs) arrayList.get(size)).f33952a == m1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(m1Var);
                arrayList.remove(size);
            }
        }
        B(this.f25338r, m1Var);
        if (this.f25335o.remove(m1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(m1Var);
        }
        if (this.f25336p.remove(m1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(m1Var);
        }
        ArrayList arrayList2 = this.f25341u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, m1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f25340t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((zs) arrayList5.get(size4)).f33952a == m1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(m1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f25339s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(m1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(m1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f25343x.remove(m1Var);
        this.v.remove(m1Var);
        this.f25344y.remove(m1Var);
        this.f25342w.remove(m1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f25337q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            zs zsVar = (zs) arrayList.get(size);
            View view = zsVar.f33952a.f5875a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(zsVar.f33952a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f25335o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.m1 m1Var = (f2.m1) arrayList2.get(size2);
            View view2 = m1Var.f5875a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(m1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f25336p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.m1 m1Var2 = (f2.m1) arrayList3.get(size3);
            View view3 = m1Var2.f5875a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(m1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f25338r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ys ysVar = (ys) arrayList4.get(size4);
            f2.m1 m1Var3 = ysVar.f33567a;
            if (m1Var3 != null) {
                C(ysVar, m1Var3);
            }
            f2.m1 m1Var4 = ysVar.f33568b;
            if (m1Var4 != null) {
                C(ysVar, m1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f25340t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                zs zsVar2 = (zs) arrayList6.get(size6);
                View view4 = zsVar2.f33952a.f5875a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(zsVar2.f33952a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f25339s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f2.m1 m1Var5 = (f2.m1) arrayList8.get(size8);
                View view5 = m1Var5.f5875a;
                if (view5 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(m1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f25341u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ys ysVar2 = (ys) arrayList10.get(size10);
                f2.m1 m1Var6 = ysVar2.f33567a;
                if (m1Var6 != null) {
                    C(ysVar2, m1Var6);
                }
                f2.m1 m1Var7 = ysVar2.f33568b;
                if (m1Var7 != null) {
                    C(ysVar2, m1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f25343x);
        z(this.f25342w);
        z(this.v);
        z(this.f25344y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f25336p.isEmpty()) {
            ArrayList arrayList = this.f25338r;
            if (arrayList.isEmpty() && this.f25337q.isEmpty() && arrayList.isEmpty() && this.f25342w.isEmpty() && this.f25343x.isEmpty() && this.v.isEmpty() && this.f25344y.isEmpty() && this.f25340t.isEmpty() && this.f25339s.isEmpty() && this.f25341u.isEmpty()) {
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
        ArrayList arrayList2 = this.f25335o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f25337q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f25338r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f25336p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                f2.m1 m1Var = (f2.m1) obj;
                View view = m1Var.f5875a;
                this.f25343x.add(m1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f25345z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f25345z.setTopClip(i12);
                            this.f25345z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f25345z.setTopClip(measuredHeight2);
                            this.f25345z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, n6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new vs(this, m1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new vs(this, m1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ws(this, m1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f25340t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final at f31722b;

                    {
                        this.f31722b = this;
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
                                    at atVar = this.f31722b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        zs zsVar = (zs) obj2;
                                        f2.m1 m1Var2 = zsVar.f33952a;
                                        int i15 = zsVar.f33953b;
                                        int i16 = zsVar.f33954c;
                                        int i17 = zsVar.d;
                                        int i18 = zsVar.f33955e;
                                        View view2 = m1Var2.f5875a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            atVar.B = i16 - i18;
                                        } else {
                                            atVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = atVar.f25345z;
                                        if (r2Var3 != null) {
                                            if (atVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = atVar.A;
                                                atVar.B = measuredHeight3 - i21;
                                                atVar.f25345z.setTopClip(i21);
                                                atVar.f25345z.setBottomClip(atVar.B);
                                            } else if (atVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - atVar.B;
                                                atVar.A = measuredHeight4;
                                                atVar.f25345z.setTopClip(measuredHeight4);
                                                atVar.f25345z.setBottomClip(atVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        atVar.f25342w.add(m1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(atVar, m1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList7.clear();
                                        atVar.f25340t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    at atVar2 = this.f31722b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        ys ysVar = (ys) obj3;
                                        ArrayList arrayList8 = atVar2.f25344y;
                                        f2.m1 m1Var3 = ysVar.f33567a;
                                        f2.m1 m1Var4 = ysVar.f33568b;
                                        if (m1Var3 != null && m1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = m1Var3.f5875a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(m1Var4.f5875a, property, 1.0f));
                                            arrayList8.add(ysVar.f33567a);
                                            arrayList8.add(ysVar.f33568b);
                                            animatorSet.addListener(new xs(atVar2, ysVar, m1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        atVar2.f25341u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f25341u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final at f31722b;

                    {
                        this.f31722b = this;
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
                                    at atVar = this.f31722b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        zs zsVar = (zs) obj2;
                                        f2.m1 m1Var2 = zsVar.f33952a;
                                        int i15 = zsVar.f33953b;
                                        int i16 = zsVar.f33954c;
                                        int i17 = zsVar.d;
                                        int i18 = zsVar.f33955e;
                                        View view2 = m1Var2.f5875a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            atVar.B = i16 - i18;
                                        } else {
                                            atVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = atVar.f25345z;
                                        if (r2Var3 != null) {
                                            if (atVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = atVar.A;
                                                atVar.B = measuredHeight3 - i21;
                                                atVar.f25345z.setTopClip(i21);
                                                atVar.f25345z.setBottomClip(atVar.B);
                                            } else if (atVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - atVar.B;
                                                atVar.A = measuredHeight4;
                                                atVar.f25345z.setTopClip(measuredHeight4);
                                                atVar.f25345z.setBottomClip(atVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        atVar.f25342w.add(m1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(atVar, m1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList72.clear();
                                        atVar.f25340t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    at atVar2 = this.f31722b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        ys ysVar = (ys) obj3;
                                        ArrayList arrayList8 = atVar2.f25344y;
                                        f2.m1 m1Var3 = ysVar.f33567a;
                                        f2.m1 m1Var4 = ysVar.f33568b;
                                        if (m1Var3 != null && m1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = m1Var3.f5875a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(m1Var4.f5875a, property, 1.0f));
                                            arrayList8.add(ysVar.f33567a);
                                            arrayList8.add(ysVar.f33568b);
                                            animatorSet.addListener(new xs(atVar2, ysVar, m1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        atVar2.f25341u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f25339s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    f2.m1 m1Var2 = (f2.m1) obj2;
                    View view2 = m1Var2.f5875a;
                    this.v.add(m1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ws(this, m1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(f2.m1 m1Var) {
        E(m1Var);
        View view = m1Var.f5875a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f25336p;
        arrayList.add(m1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.m1) arrayList.get(i10)).f5875a.setAlpha(0.0f);
                if (((f2.m1) arrayList.get(i10)).f5875a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((f2.m1) arrayList.get(i10)).f5875a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.m1 m1Var, f2.m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(m1Var);
            E(m1Var2);
            View view2 = m1Var2.f5875a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f33567a = m1Var;
            obj.f33568b = m1Var2;
            obj.f33569c = i10;
            obj.d = i11;
            obj.f33570e = i12;
            obj.f33571f = i13;
            this.f25338r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f2.m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = m1Var.f5875a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = m1Var.f5875a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(m1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(m1Var);
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
        } else if (view2 instanceof uf.j) {
            ((uf.j) view2).f48605a = true;
        }
        ?? obj = new Object();
        obj.f33952a = m1Var;
        obj.f33953b = translationX;
        obj.f33954c = translationY;
        obj.d = i12;
        obj.f33955e = i13;
        this.f25337q.add(obj);
        return true;
    }

    @Override
    public final void s(f2.m1 m1Var, c5.e eVar) {
        E(m1Var);
        this.f25335o.add(m1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            tl0 tl0Var = this.C;
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (m1Var.f5875a == r2Var) {
            this.f25345z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.m1) arrayList.get(size)).f5875a.animate().cancel();
        }
    }
}
