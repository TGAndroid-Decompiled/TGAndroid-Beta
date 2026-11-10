package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ds extends v4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final pj0 C;
    public final ArrayList f33061o = new ArrayList();
    public final ArrayList f33062p = new ArrayList();
    public final ArrayList f33063q = new ArrayList();
    public final ArrayList f33064r = new ArrayList();
    public final ArrayList f33065s = new ArrayList();
    public final ArrayList f33066t = new ArrayList();
    public final ArrayList f33067u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f33068w = new ArrayList();
    public final ArrayList f33069x = new ArrayList();
    public final ArrayList f33070y = new ArrayList();
    public org.telegram.ui.Cells.t2 f33071z;

    public ds(pj0 pj0Var) {
        this.f57079m = false;
        this.C = pj0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bs bsVar = (bs) arrayList.get(size);
            if (C(bsVar, d1Var) && bsVar.f32347a == null && bsVar.f32348b == null) {
                arrayList.remove(bsVar);
            }
        }
    }

    public final boolean C(bs bsVar, v4.d1 d1Var) {
        if (bsVar.f32348b == d1Var) {
            bsVar.f32348b = null;
        } else if (bsVar.f32347a == d1Var) {
            bsVar.f32347a = null;
        } else {
            return false;
        }
        View view = d1Var.f57052a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f33071z = null;
    }

    public final void E(v4.d1 d1Var) {
        d1Var.f57052a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override
    public final boolean c(v4.d1 d1Var, List list) {
        return d1Var.f57052a instanceof org.telegram.ui.Cells.z2;
    }

    @Override
    public final void f(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        view.animate().cancel();
        ArrayList arrayList = this.f33063q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((cs) arrayList.get(size)).f32744a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.f33064r, d1Var);
        if (this.f33061o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.f33062p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(d1Var);
        }
        ArrayList arrayList2 = this.f33067u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, d1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f33066t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((cs) arrayList5.get(size4)).f32744a == d1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(d1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f33065s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(d1Var)) {
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(d1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f33069x.remove(d1Var);
        this.v.remove(d1Var);
        this.f33070y.remove(d1Var);
        this.f33068w.remove(d1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f33063q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            cs csVar = (cs) arrayList.get(size);
            View view = csVar.f32744a.f57052a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(csVar.f32744a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f33061o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.d1 d1Var = (v4.d1) arrayList2.get(size2);
            View view2 = d1Var.f57052a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(d1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f33062p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.d1 d1Var2 = (v4.d1) arrayList3.get(size3);
            View view3 = d1Var2.f57052a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f33064r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            bs bsVar = (bs) arrayList4.get(size4);
            v4.d1 d1Var3 = bsVar.f32347a;
            if (d1Var3 != null) {
                C(bsVar, d1Var3);
            }
            v4.d1 d1Var4 = bsVar.f32348b;
            if (d1Var4 != null) {
                C(bsVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f33066t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                cs csVar2 = (cs) arrayList6.get(size6);
                View view4 = csVar2.f32744a.f57052a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(csVar2.f32744a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f33065s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.d1 d1Var5 = (v4.d1) arrayList8.get(size8);
                View view5 = d1Var5.f57052a;
                if (view5 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(d1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f33067u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                bs bsVar2 = (bs) arrayList10.get(size10);
                v4.d1 d1Var6 = bsVar2.f32347a;
                if (d1Var6 != null) {
                    C(bsVar2, d1Var6);
                }
                v4.d1 d1Var7 = bsVar2.f32348b;
                if (d1Var7 != null) {
                    C(bsVar2, d1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f33069x);
        z(this.f33068w);
        z(this.v);
        z(this.f33070y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f33062p.isEmpty()) {
            ArrayList arrayList = this.f33064r;
            if (arrayList.isEmpty() && this.f33063q.isEmpty() && arrayList.isEmpty() && this.f33068w.isEmpty() && this.f33069x.isEmpty() && this.v.isEmpty() && this.f33070y.isEmpty() && this.f33066t.isEmpty() && this.f33065s.isEmpty() && this.f33067u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        int i7;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f33061o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f33063q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f33064r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f33062p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                v4.d1 d1Var = (v4.d1) obj;
                View view = d1Var.f57052a;
                this.f33069x.add(d1Var);
                if (view instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    org.telegram.ui.Cells.t2 t2Var2 = this.f33071z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == t2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = t2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f33071z.setTopClip(i12);
                            this.f33071z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = t2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f33071z.setTopClip(measuredHeight2);
                            this.f33071z.setBottomClip(this.B);
                        }
                        t2Var.setElevation(-1.0f);
                        t2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(t2Var, l6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new yr(this, d1Var, t2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new yr(this, d1Var, t2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new zr(this, d1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f33066t.add(arrayList6);
                arrayList3.clear();
                i7 = 0;
                new Runnable(this) {
                    public final ds f40393b;

                    {
                        this.f40393b = this;
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
                                    ds dsVar = this.f40393b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        cs csVar = (cs) obj2;
                                        v4.d1 d1Var2 = csVar.f32744a;
                                        int i15 = csVar.f32745b;
                                        int i16 = csVar.f32746c;
                                        int i17 = csVar.d;
                                        int i18 = csVar.f32747e;
                                        View view2 = d1Var2.f57052a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            dsVar.B = i16 - i18;
                                        } else {
                                            dsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = dsVar.f33071z;
                                        if (t2Var3 != null) {
                                            if (dsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = dsVar.A;
                                                dsVar.B = measuredHeight3 - i21;
                                                dsVar.f33071z.setTopClip(i21);
                                                dsVar.f33071z.setBottomClip(dsVar.B);
                                            } else if (dsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - dsVar.B;
                                                dsVar.A = measuredHeight4;
                                                dsVar.f33071z.setTopClip(measuredHeight4);
                                                dsVar.f33071z.setBottomClip(dsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        dsVar.f33068w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new as(dsVar, d1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        dsVar.f33066t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    ds dsVar2 = this.f40393b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        bs bsVar = (bs) obj3;
                                        ArrayList arrayList8 = dsVar2.f33070y;
                                        v4.d1 d1Var3 = bsVar.f32347a;
                                        v4.d1 d1Var4 = bsVar.f32348b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f57052a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f57052a, property, 1.0f));
                                            arrayList8.add(bsVar.f32347a);
                                            arrayList8.add(bsVar.f32348b);
                                            animatorSet.addListener(new jg.j0(dsVar2, bsVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        dsVar2.f33067u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            } else {
                i7 = 0;
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f33067u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ds f40393b;

                    {
                        this.f40393b = this;
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
                                    ds dsVar = this.f40393b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        cs csVar = (cs) obj2;
                                        v4.d1 d1Var2 = csVar.f32744a;
                                        int i15 = csVar.f32745b;
                                        int i16 = csVar.f32746c;
                                        int i17 = csVar.d;
                                        int i18 = csVar.f32747e;
                                        View view2 = d1Var2.f57052a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            dsVar.B = i16 - i18;
                                        } else {
                                            dsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = dsVar.f33071z;
                                        if (t2Var3 != null) {
                                            if (dsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = dsVar.A;
                                                dsVar.B = measuredHeight3 - i21;
                                                dsVar.f33071z.setTopClip(i21);
                                                dsVar.f33071z.setBottomClip(dsVar.B);
                                            } else if (dsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - dsVar.B;
                                                dsVar.A = measuredHeight4;
                                                dsVar.f33071z.setTopClip(measuredHeight4);
                                                dsVar.f33071z.setBottomClip(dsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        dsVar.f33068w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new as(dsVar, d1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        dsVar.f33066t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    ds dsVar2 = this.f40393b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        bs bsVar = (bs) obj3;
                                        ArrayList arrayList8 = dsVar2.f33070y;
                                        v4.d1 d1Var3 = bsVar.f32347a;
                                        v4.d1 d1Var4 = bsVar.f32348b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f57052a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f57052a, property, 1.0f));
                                            arrayList8.add(bsVar.f32347a);
                                            arrayList8.add(bsVar.f32348b);
                                            animatorSet.addListener(new jg.j0(dsVar2, bsVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        dsVar2.f33067u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f33065s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = i7;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    v4.d1 d1Var2 = (v4.d1) obj2;
                    View view2 = d1Var2.f57052a;
                    this.v.add(d1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new zr(this, d1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(v4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.f57052a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f33062p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.d1) arrayList.get(i7)).f57052a.setAlpha(0.0f);
                if (((v4.d1) arrayList.get(i7)).f57052a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((v4.d1) arrayList.get(i7)).f57052a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.d1 d1Var, v4.d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            E(d1Var);
            E(d1Var2);
            View view2 = d1Var2.f57052a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f32347a = d1Var;
            obj.f32348b = d1Var2;
            obj.f32349c = i7;
            obj.d = i10;
            obj.f32350e = i11;
            obj.f32351f = i12;
            this.f33064r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = d1Var.f57052a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = d1Var.f57052a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(d1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(d1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        if (view2 instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view2).setMoving(true);
        } else if (view2 instanceof jg.m) {
            ((jg.m) view2).f16836a = true;
        }
        ?? obj = new Object();
        obj.f32744a = d1Var;
        obj.f32745b = translationX;
        obj.f32746c = translationY;
        obj.d = i11;
        obj.f32747e = i12;
        this.f33063q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.d1 d1Var, e2.r0 r0Var) {
        E(d1Var);
        this.f33061o.add(d1Var);
        org.telegram.ui.Cells.t2 t2Var = null;
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.C;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                t2Var = (org.telegram.ui.Cells.t2) childAt;
            }
            i7++;
        }
        if (d1Var.f57052a == t2Var) {
            this.f33071z = t2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.d1) arrayList.get(size)).f57052a.animate().cancel();
        }
    }
}
