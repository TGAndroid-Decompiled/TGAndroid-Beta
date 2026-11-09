package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class es extends v4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final qj0 C;
    public final ArrayList f33481o = new ArrayList();
    public final ArrayList f33482p = new ArrayList();
    public final ArrayList f33483q = new ArrayList();
    public final ArrayList f33484r = new ArrayList();
    public final ArrayList f33485s = new ArrayList();
    public final ArrayList f33486t = new ArrayList();
    public final ArrayList f33487u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f33488w = new ArrayList();
    public final ArrayList f33489x = new ArrayList();
    public final ArrayList f33490y = new ArrayList();
    public org.telegram.ui.Cells.t2 f33491z;

    public es(qj0 qj0Var) {
        this.f57083m = false;
        this.C = qj0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cs csVar = (cs) arrayList.get(size);
            if (C(csVar, d1Var) && csVar.f32747a == null && csVar.f32748b == null) {
                arrayList.remove(csVar);
            }
        }
    }

    public final boolean C(cs csVar, v4.d1 d1Var) {
        if (csVar.f32748b == d1Var) {
            csVar.f32748b = null;
        } else if (csVar.f32747a == d1Var) {
            csVar.f32747a = null;
        } else {
            return false;
        }
        View view = d1Var.f57056a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f33491z = null;
    }

    public final void E(v4.d1 d1Var) {
        d1Var.f57056a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override
    public final boolean c(v4.d1 d1Var, List list) {
        return d1Var.f57056a instanceof org.telegram.ui.Cells.z2;
    }

    @Override
    public final void f(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        view.animate().cancel();
        ArrayList arrayList = this.f33483q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ds) arrayList.get(size)).f33147a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.f33484r, d1Var);
        if (this.f33481o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.f33482p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(d1Var);
        }
        ArrayList arrayList2 = this.f33487u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, d1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f33486t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ds) arrayList5.get(size4)).f33147a == d1Var) {
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
        ArrayList arrayList6 = this.f33485s;
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
        this.f33489x.remove(d1Var);
        this.v.remove(d1Var);
        this.f33490y.remove(d1Var);
        this.f33488w.remove(d1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f33483q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ds dsVar = (ds) arrayList.get(size);
            View view = dsVar.f33147a.f57056a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(dsVar.f33147a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f33481o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.d1 d1Var = (v4.d1) arrayList2.get(size2);
            View view2 = d1Var.f57056a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(d1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f33482p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.d1 d1Var2 = (v4.d1) arrayList3.get(size3);
            View view3 = d1Var2.f57056a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f33484r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            cs csVar = (cs) arrayList4.get(size4);
            v4.d1 d1Var3 = csVar.f32747a;
            if (d1Var3 != null) {
                C(csVar, d1Var3);
            }
            v4.d1 d1Var4 = csVar.f32748b;
            if (d1Var4 != null) {
                C(csVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f33486t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ds dsVar2 = (ds) arrayList6.get(size6);
                View view4 = dsVar2.f33147a.f57056a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(dsVar2.f33147a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f33485s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.d1 d1Var5 = (v4.d1) arrayList8.get(size8);
                View view5 = d1Var5.f57056a;
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
        ArrayList arrayList9 = this.f33487u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                cs csVar2 = (cs) arrayList10.get(size10);
                v4.d1 d1Var6 = csVar2.f32747a;
                if (d1Var6 != null) {
                    C(csVar2, d1Var6);
                }
                v4.d1 d1Var7 = csVar2.f32748b;
                if (d1Var7 != null) {
                    C(csVar2, d1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f33489x);
        z(this.f33488w);
        z(this.v);
        z(this.f33490y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f33482p.isEmpty()) {
            ArrayList arrayList = this.f33484r;
            if (arrayList.isEmpty() && this.f33483q.isEmpty() && arrayList.isEmpty() && this.f33488w.isEmpty() && this.f33489x.isEmpty() && this.v.isEmpty() && this.f33490y.isEmpty() && this.f33486t.isEmpty() && this.f33485s.isEmpty() && this.f33487u.isEmpty()) {
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
        ArrayList arrayList2 = this.f33481o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f33483q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f33484r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f33482p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                v4.d1 d1Var = (v4.d1) obj;
                View view = d1Var.f57056a;
                this.f33489x.add(d1Var);
                if (view instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    org.telegram.ui.Cells.t2 t2Var2 = this.f33491z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == t2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = t2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f33491z.setTopClip(i12);
                            this.f33491z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = t2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f33491z.setTopClip(measuredHeight2);
                            this.f33491z.setBottomClip(this.B);
                        }
                        t2Var.setElevation(-1.0f);
                        t2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(t2Var, m6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new zr(this, d1Var, t2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new zr(this, d1Var, t2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new as(this, d1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f33486t.add(arrayList6);
                arrayList3.clear();
                i7 = 0;
                new Runnable(this) {
                    public final es f40798b;

                    {
                        this.f40798b = this;
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
                                    es esVar = this.f40798b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        ds dsVar = (ds) obj2;
                                        v4.d1 d1Var2 = dsVar.f33147a;
                                        int i15 = dsVar.f33148b;
                                        int i16 = dsVar.f33149c;
                                        int i17 = dsVar.d;
                                        int i18 = dsVar.f33150e;
                                        View view2 = d1Var2.f57056a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            esVar.B = i16 - i18;
                                        } else {
                                            esVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = esVar.f33491z;
                                        if (t2Var3 != null) {
                                            if (esVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = esVar.A;
                                                esVar.B = measuredHeight3 - i21;
                                                esVar.f33491z.setTopClip(i21);
                                                esVar.f33491z.setBottomClip(esVar.B);
                                            } else if (esVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - esVar.B;
                                                esVar.A = measuredHeight4;
                                                esVar.f33491z.setTopClip(measuredHeight4);
                                                esVar.f33491z.setBottomClip(esVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        esVar.f33488w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new bs(esVar, d1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        esVar.f33486t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    es esVar2 = this.f40798b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        cs csVar = (cs) obj3;
                                        ArrayList arrayList8 = esVar2.f33490y;
                                        v4.d1 d1Var3 = csVar.f32747a;
                                        v4.d1 d1Var4 = csVar.f32748b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f57056a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f57056a, property, 1.0f));
                                            arrayList8.add(csVar.f32747a);
                                            arrayList8.add(csVar.f32748b);
                                            animatorSet.addListener(new jg.j0(esVar2, csVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        esVar2.f33487u.remove(arrayList7);
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
                this.f33487u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final es f40798b;

                    {
                        this.f40798b = this;
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
                                    es esVar = this.f40798b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        ds dsVar = (ds) obj2;
                                        v4.d1 d1Var2 = dsVar.f33147a;
                                        int i15 = dsVar.f33148b;
                                        int i16 = dsVar.f33149c;
                                        int i17 = dsVar.d;
                                        int i18 = dsVar.f33150e;
                                        View view2 = d1Var2.f57056a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            esVar.B = i16 - i18;
                                        } else {
                                            esVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = esVar.f33491z;
                                        if (t2Var3 != null) {
                                            if (esVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = esVar.A;
                                                esVar.B = measuredHeight3 - i21;
                                                esVar.f33491z.setTopClip(i21);
                                                esVar.f33491z.setBottomClip(esVar.B);
                                            } else if (esVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - esVar.B;
                                                esVar.A = measuredHeight4;
                                                esVar.f33491z.setTopClip(measuredHeight4);
                                                esVar.f33491z.setBottomClip(esVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        esVar.f33488w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new bs(esVar, d1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        esVar.f33486t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    es esVar2 = this.f40798b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        cs csVar = (cs) obj3;
                                        ArrayList arrayList8 = esVar2.f33490y;
                                        v4.d1 d1Var3 = csVar.f32747a;
                                        v4.d1 d1Var4 = csVar.f32748b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f57056a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f57056a, property, 1.0f));
                                            arrayList8.add(csVar.f32747a);
                                            arrayList8.add(csVar.f32748b);
                                            animatorSet.addListener(new jg.j0(esVar2, csVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        esVar2.f33487u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f33485s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = i7;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    v4.d1 d1Var2 = (v4.d1) obj2;
                    View view2 = d1Var2.f57056a;
                    this.v.add(d1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new as(this, d1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(v4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.f57056a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f33482p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.d1) arrayList.get(i7)).f57056a.setAlpha(0.0f);
                if (((v4.d1) arrayList.get(i7)).f57056a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((v4.d1) arrayList.get(i7)).f57056a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.d1 d1Var, v4.d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            E(d1Var);
            E(d1Var2);
            View view2 = d1Var2.f57056a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f32747a = d1Var;
            obj.f32748b = d1Var2;
            obj.f32749c = i7;
            obj.d = i10;
            obj.f32750e = i11;
            obj.f32751f = i12;
            this.f33484r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = d1Var.f57056a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = d1Var.f57056a;
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
        obj.f33147a = d1Var;
        obj.f33148b = translationX;
        obj.f33149c = translationY;
        obj.d = i11;
        obj.f33150e = i12;
        this.f33483q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.d1 d1Var, e2.r0 r0Var) {
        E(d1Var);
        this.f33481o.add(d1Var);
        org.telegram.ui.Cells.t2 t2Var = null;
        int i7 = 0;
        while (true) {
            qj0 qj0Var = this.C;
            if (i7 >= qj0Var.getChildCount()) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                t2Var = (org.telegram.ui.Cells.t2) childAt;
            }
            i7++;
        }
        if (d1Var.f57056a == t2Var) {
            this.f33491z = t2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.d1) arrayList.get(size)).f57056a.animate().cancel();
        }
    }
}
