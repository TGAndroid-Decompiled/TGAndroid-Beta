package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class zs extends s4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final ll0 C;
    public final ArrayList f33243o = new ArrayList();
    public final ArrayList f33244p = new ArrayList();
    public final ArrayList f33245q = new ArrayList();
    public final ArrayList f33246r = new ArrayList();
    public final ArrayList f33247s = new ArrayList();
    public final ArrayList f33248t = new ArrayList();
    public final ArrayList f33249u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f33250w = new ArrayList();
    public final ArrayList f33251x = new ArrayList();
    public final ArrayList f33252y = new ArrayList();
    public org.telegram.ui.Cells.r2 f33253z;

    public zs(ll0 ll0Var) {
        this.f45805m = false;
        this.C = ll0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xs xsVar = (xs) arrayList.get(size);
            if (C(xsVar, c1Var) && xsVar.f32682a == null && xsVar.f32683b == null) {
                arrayList.remove(xsVar);
            }
        }
    }

    public final boolean C(xs xsVar, s4.c1 c1Var) {
        if (xsVar.f32683b == c1Var) {
            xsVar.f32683b = null;
        } else if (xsVar.f32682a == c1Var) {
            xsVar.f32682a = null;
        } else {
            return false;
        }
        View view = c1Var.f45766a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f33253z = null;
    }

    public final void E(s4.c1 c1Var) {
        c1Var.f45766a.animate().setInterpolator(D);
        f(c1Var);
    }

    @Override
    public final boolean c(s4.c1 c1Var, List list) {
        return c1Var.f45766a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(s4.c1 c1Var) {
        View view = c1Var.f45766a;
        view.animate().cancel();
        ArrayList arrayList = this.f33245q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ys) arrayList.get(size)).f33020a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        B(this.f33246r, c1Var);
        if (this.f33243o.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(c1Var);
        }
        if (this.f33244p.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(c1Var);
        }
        ArrayList arrayList2 = this.f33249u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f33248t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ys) arrayList5.get(size4)).f33020a == c1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(c1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f33247s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f33251x.remove(c1Var);
        this.v.remove(c1Var);
        this.f33252y.remove(c1Var);
        this.f33250w.remove(c1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f33245q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ys ysVar = (ys) arrayList.get(size);
            View view = ysVar.f33020a.f45766a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ysVar.f33020a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f33243o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size2);
            View view2 = c1Var.f45766a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(c1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f33244p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.c1 c1Var2 = (s4.c1) arrayList3.get(size3);
            View view3 = c1Var2.f45766a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(c1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f33246r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            xs xsVar = (xs) arrayList4.get(size4);
            s4.c1 c1Var3 = xsVar.f32682a;
            if (c1Var3 != null) {
                C(xsVar, c1Var3);
            }
            s4.c1 c1Var4 = xsVar.f32683b;
            if (c1Var4 != null) {
                C(xsVar, c1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f33248t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ys ysVar2 = (ys) arrayList6.get(size6);
                View view4 = ysVar2.f33020a.f45766a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ysVar2.f33020a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f33247s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.c1 c1Var5 = (s4.c1) arrayList8.get(size8);
                View view5 = c1Var5.f45766a;
                if (view5 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(c1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f33249u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                xs xsVar2 = (xs) arrayList10.get(size10);
                s4.c1 c1Var6 = xsVar2.f32682a;
                if (c1Var6 != null) {
                    C(xsVar2, c1Var6);
                }
                s4.c1 c1Var7 = xsVar2.f32683b;
                if (c1Var7 != null) {
                    C(xsVar2, c1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f33251x);
        z(this.f33250w);
        z(this.v);
        z(this.f33252y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f33244p.isEmpty()) {
            ArrayList arrayList = this.f33246r;
            if (arrayList.isEmpty() && this.f33245q.isEmpty() && arrayList.isEmpty() && this.f33250w.isEmpty() && this.f33251x.isEmpty() && this.v.isEmpty() && this.f33252y.isEmpty() && this.f33248t.isEmpty() && this.f33247s.isEmpty() && this.f33249u.isEmpty()) {
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
        ArrayList arrayList2 = this.f33243o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f33245q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f33246r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f33244p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                s4.c1 c1Var = (s4.c1) obj;
                View view = c1Var.f45766a;
                this.f33251x.add(c1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f33253z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f33253z.setTopClip(i12);
                            this.f33253z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f33253z.setTopClip(measuredHeight2);
                            this.f33253z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, t6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new us(this, c1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new us(this, c1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new vs(this, c1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f33248t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final zs f30720b;

                    {
                        this.f30720b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j3 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i14 = 0;
                                while (true) {
                                    zs zsVar = this.f30720b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        ys ysVar = (ys) obj2;
                                        s4.c1 c1Var2 = ysVar.f33020a;
                                        int i15 = ysVar.f33021b;
                                        int i16 = ysVar.f33022c;
                                        int i17 = ysVar.d;
                                        int i18 = ysVar.f33023e;
                                        View view2 = c1Var2.f45766a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            zsVar.B = i16 - i18;
                                        } else {
                                            zsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = zsVar.f33253z;
                                        if (r2Var3 != null) {
                                            if (zsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = zsVar.A;
                                                zsVar.B = measuredHeight3 - i21;
                                                zsVar.f33253z.setTopClip(i21);
                                                zsVar.f33253z.setBottomClip(zsVar.B);
                                            } else if (zsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - zsVar.B;
                                                zsVar.A = measuredHeight4;
                                                zsVar.f33253z.setTopClip(measuredHeight4);
                                                zsVar.f33253z.setBottomClip(zsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        zsVar.f33250w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ws(zsVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        zsVar.f33248t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    zs zsVar2 = this.f30720b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        xs xsVar = (xs) obj3;
                                        ArrayList arrayList8 = zsVar2.f33252y;
                                        s4.c1 c1Var3 = xsVar.f32682a;
                                        s4.c1 c1Var4 = xsVar.f32683b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f45766a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f45766a, property, 1.0f));
                                            arrayList8.add(xsVar.f32682a);
                                            arrayList8.add(xsVar.f32683b);
                                            animatorSet.addListener(new hg.k0(zsVar2, xsVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        zsVar2.f33249u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f33249u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final zs f30720b;

                    {
                        this.f30720b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j3 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i14 = 0;
                                while (true) {
                                    zs zsVar = this.f30720b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        ys ysVar = (ys) obj2;
                                        s4.c1 c1Var2 = ysVar.f33020a;
                                        int i15 = ysVar.f33021b;
                                        int i16 = ysVar.f33022c;
                                        int i17 = ysVar.d;
                                        int i18 = ysVar.f33023e;
                                        View view2 = c1Var2.f45766a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            zsVar.B = i16 - i18;
                                        } else {
                                            zsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = zsVar.f33253z;
                                        if (r2Var3 != null) {
                                            if (zsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = zsVar.A;
                                                zsVar.B = measuredHeight3 - i21;
                                                zsVar.f33253z.setTopClip(i21);
                                                zsVar.f33253z.setBottomClip(zsVar.B);
                                            } else if (zsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - zsVar.B;
                                                zsVar.A = measuredHeight4;
                                                zsVar.f33253z.setTopClip(measuredHeight4);
                                                zsVar.f33253z.setBottomClip(zsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        zsVar.f33250w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ws(zsVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        zsVar.f33248t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    zs zsVar2 = this.f30720b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        xs xsVar = (xs) obj3;
                                        ArrayList arrayList8 = zsVar2.f33252y;
                                        s4.c1 c1Var3 = xsVar.f32682a;
                                        s4.c1 c1Var4 = xsVar.f32683b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f45766a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f45766a, property, 1.0f));
                                            arrayList8.add(xsVar.f32682a);
                                            arrayList8.add(xsVar.f32683b);
                                            animatorSet.addListener(new hg.k0(zsVar2, xsVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        zsVar2.f33249u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f33247s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    s4.c1 c1Var2 = (s4.c1) obj2;
                    View view2 = c1Var2.f45766a;
                    this.v.add(c1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new vs(this, c1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.c1 c1Var) {
        E(c1Var);
        View view = c1Var.f45766a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f33244p;
        arrayList.add(c1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.c1) arrayList.get(i10)).f45766a.setAlpha(0.0f);
                if (((s4.c1) arrayList.get(i10)).f45766a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((s4.c1) arrayList.get(i10)).f45766a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.c1 c1Var, s4.c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f45766a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(c1Var);
            E(c1Var2);
            View view2 = c1Var2.f45766a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f32682a = c1Var;
            obj.f32683b = c1Var2;
            obj.f32684c = i10;
            obj.d = i11;
            obj.f32685e = i12;
            obj.f32686f = i13;
            this.f33246r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f45766a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = c1Var.f45766a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(c1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(c1Var);
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
        } else if (view2 instanceof hg.l) {
            ((hg.l) view2).f11188a = true;
        }
        ?? obj = new Object();
        obj.f33020a = c1Var;
        obj.f33021b = translationX;
        obj.f33022c = translationY;
        obj.d = i12;
        obj.f33023e = i13;
        this.f33245q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.c1 c1Var, b2.q0 q0Var) {
        E(c1Var);
        this.f33243o.add(c1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            ll0 ll0Var = this.C;
            if (i10 >= ll0Var.getChildCount()) {
                break;
            }
            View childAt = ll0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (c1Var.f45766a == r2Var) {
            this.f33253z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.c1) arrayList.get(size)).f45766a.animate().cancel();
        }
    }
}
