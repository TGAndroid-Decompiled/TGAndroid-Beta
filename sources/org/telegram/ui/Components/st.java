package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class st extends s4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final sm0 C;
    public final ArrayList f30850o = new ArrayList();
    public final ArrayList f30851p = new ArrayList();
    public final ArrayList f30852q = new ArrayList();
    public final ArrayList f30853r = new ArrayList();
    public final ArrayList f30854s = new ArrayList();
    public final ArrayList f30855t = new ArrayList();
    public final ArrayList f30856u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f30857w = new ArrayList();
    public final ArrayList f30858x = new ArrayList();
    public final ArrayList f30859y = new ArrayList();
    public org.telegram.ui.Cells.s2 f30860z;

    public st(sm0 sm0Var) {
        this.f47788m = false;
        this.C = sm0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qt qtVar = (qt) arrayList.get(size);
            if (C(qtVar, d1Var) && qtVar.f30240a == null && qtVar.f30241b == null) {
                arrayList.remove(qtVar);
            }
        }
    }

    public final boolean C(qt qtVar, s4.d1 d1Var) {
        if (qtVar.f30241b == d1Var) {
            qtVar.f30241b = null;
        } else if (qtVar.f30240a == d1Var) {
            qtVar.f30240a = null;
        } else {
            return false;
        }
        View view = d1Var.f47748a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f30860z = null;
    }

    public final void E(s4.d1 d1Var) {
        d1Var.f47748a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override
    public final boolean c(s4.d1 d1Var, List list) {
        return d1Var.f47748a instanceof org.telegram.ui.Cells.y2;
    }

    @Override
    public final void f(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        view.animate().cancel();
        ArrayList arrayList = this.f30852q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((rt) arrayList.get(size)).f30539a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.f30853r, d1Var);
        if (this.f30850o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.f30851p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(d1Var);
        }
        ArrayList arrayList2 = this.f30856u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, d1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f30855t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((rt) arrayList5.get(size4)).f30539a == d1Var) {
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
        ArrayList arrayList6 = this.f30854s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(d1Var)) {
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(d1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f30858x.remove(d1Var);
        this.v.remove(d1Var);
        this.f30859y.remove(d1Var);
        this.f30857w.remove(d1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f30852q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            rt rtVar = (rt) arrayList.get(size);
            View view = rtVar.f30539a.f47748a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(rtVar.f30539a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f30850o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.d1 d1Var = (s4.d1) arrayList2.get(size2);
            View view2 = d1Var.f47748a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(d1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f30851p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.d1 d1Var2 = (s4.d1) arrayList3.get(size3);
            View view3 = d1Var2.f47748a;
            if (view3 instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f30853r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            qt qtVar = (qt) arrayList4.get(size4);
            s4.d1 d1Var3 = qtVar.f30240a;
            if (d1Var3 != null) {
                C(qtVar, d1Var3);
            }
            s4.d1 d1Var4 = qtVar.f30241b;
            if (d1Var4 != null) {
                C(qtVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f30855t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                rt rtVar2 = (rt) arrayList6.get(size6);
                View view4 = rtVar2.f30539a.f47748a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(rtVar2.f30539a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f30854s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.d1 d1Var5 = (s4.d1) arrayList8.get(size8);
                View view5 = d1Var5.f47748a;
                if (view5 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f30856u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                qt qtVar2 = (qt) arrayList10.get(size10);
                s4.d1 d1Var6 = qtVar2.f30240a;
                if (d1Var6 != null) {
                    C(qtVar2, d1Var6);
                }
                s4.d1 d1Var7 = qtVar2.f30241b;
                if (d1Var7 != null) {
                    C(qtVar2, d1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f30858x);
        z(this.f30857w);
        z(this.v);
        z(this.f30859y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f30851p.isEmpty()) {
            ArrayList arrayList = this.f30853r;
            if (arrayList.isEmpty() && this.f30852q.isEmpty() && arrayList.isEmpty() && this.f30857w.isEmpty() && this.f30858x.isEmpty() && this.v.isEmpty() && this.f30859y.isEmpty() && this.f30855t.isEmpty() && this.f30854s.isEmpty() && this.f30856u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f30850o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f30852q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f30853r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f30851p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.d1 d1Var = (s4.d1) obj;
                View view = d1Var.f47748a;
                this.f30858x.add(d1Var);
                if (view instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    org.telegram.ui.Cells.s2 s2Var2 = this.f30860z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == s2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = s2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f30860z.setTopClip(i13);
                            this.f30860z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = s2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f30860z.setTopClip(measuredHeight2);
                            this.f30860z.setBottomClip(this.B);
                        }
                        s2Var.setElevation(-1.0f);
                        s2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(s2Var, u6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new nt(this, d1Var, s2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new nt(this, d1Var, s2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ot(this, d1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f30855t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final st f28856b;

                    {
                        this.f28856b = this;
                    }

                    @Override
                    public final void run() {
                        int i14 = r3;
                        long j3 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i14) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i15 = 0;
                                while (true) {
                                    st stVar = this.f28856b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        rt rtVar = (rt) obj2;
                                        s4.d1 d1Var2 = rtVar.f30539a;
                                        int i16 = rtVar.f30540b;
                                        int i17 = rtVar.f30541c;
                                        int i18 = rtVar.d;
                                        int i19 = rtVar.f30542e;
                                        View view2 = d1Var2.f47748a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            stVar.B = i17 - i19;
                                        } else {
                                            stVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = stVar.f30860z;
                                        if (s2Var3 != null) {
                                            if (stVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = stVar.A;
                                                stVar.B = measuredHeight3 - i22;
                                                stVar.f30860z.setTopClip(i22);
                                                stVar.f30860z.setBottomClip(stVar.B);
                                            } else if (stVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - stVar.B;
                                                stVar.A = measuredHeight4;
                                                stVar.f30860z.setTopClip(measuredHeight4);
                                                stVar.f30860z.setBottomClip(stVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        stVar.f30857w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new pt(stVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        stVar.f30855t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    st stVar2 = this.f28856b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        qt qtVar = (qt) obj3;
                                        ArrayList arrayList8 = stVar2.f30859y;
                                        s4.d1 d1Var3 = qtVar.f30240a;
                                        s4.d1 d1Var4 = qtVar.f30241b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f47748a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f47748a, property, 1.0f));
                                            arrayList8.add(qtVar.f30240a);
                                            arrayList8.add(qtVar.f30241b);
                                            animatorSet.addListener(new gg.j0(stVar2, qtVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        stVar2.f30856u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            } else {
                i10 = 0;
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f30856u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final st f28856b;

                    {
                        this.f28856b = this;
                    }

                    @Override
                    public final void run() {
                        int i14 = r3;
                        long j3 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i14) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i15 = 0;
                                while (true) {
                                    st stVar = this.f28856b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        rt rtVar = (rt) obj2;
                                        s4.d1 d1Var2 = rtVar.f30539a;
                                        int i16 = rtVar.f30540b;
                                        int i17 = rtVar.f30541c;
                                        int i18 = rtVar.d;
                                        int i19 = rtVar.f30542e;
                                        View view2 = d1Var2.f47748a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            stVar.B = i17 - i19;
                                        } else {
                                            stVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = stVar.f30860z;
                                        if (s2Var3 != null) {
                                            if (stVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = stVar.A;
                                                stVar.B = measuredHeight3 - i22;
                                                stVar.f30860z.setTopClip(i22);
                                                stVar.f30860z.setBottomClip(stVar.B);
                                            } else if (stVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - stVar.B;
                                                stVar.A = measuredHeight4;
                                                stVar.f30860z.setTopClip(measuredHeight4);
                                                stVar.f30860z.setBottomClip(stVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        stVar.f30857w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new pt(stVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        stVar.f30855t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    st stVar2 = this.f28856b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        qt qtVar = (qt) obj3;
                                        ArrayList arrayList8 = stVar2.f30859y;
                                        s4.d1 d1Var3 = qtVar.f30240a;
                                        s4.d1 d1Var4 = qtVar.f30241b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f47748a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f47748a, property, 1.0f));
                                            arrayList8.add(qtVar.f30240a);
                                            arrayList8.add(qtVar.f30241b);
                                            animatorSet.addListener(new gg.j0(stVar2, qtVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        stVar2.f30856u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f30854s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.d1 d1Var2 = (s4.d1) obj2;
                    View view2 = d1Var2.f47748a;
                    this.v.add(d1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ot(this, d1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.f47748a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f30851p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.d1) arrayList.get(i10)).f47748a.setAlpha(0.0f);
                if (((s4.d1) arrayList.get(i10)).f47748a instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) ((s4.d1) arrayList.get(i10)).f47748a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.d1 d1Var, s4.d1 d1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            E(d1Var);
            E(d1Var2);
            View view2 = d1Var2.f47748a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f30240a = d1Var;
            obj.f30241b = d1Var2;
            obj.f30242c = i10;
            obj.d = i11;
            obj.f30243e = i12;
            obj.f30244f = i13;
            this.f30853r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.f47748a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = d1Var.f47748a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(d1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(d1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view2).setMoving(true);
        } else if (view2 instanceof gg.l) {
            ((gg.l) view2).f10710a = true;
        }
        ?? obj = new Object();
        obj.f30539a = d1Var;
        obj.f30540b = translationX;
        obj.f30541c = translationY;
        obj.d = i12;
        obj.f30542e = i13;
        this.f30852q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.d1 d1Var, b2.q0 q0Var) {
        E(d1Var);
        this.f30850o.add(d1Var);
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        while (true) {
            sm0 sm0Var = this.C;
            if (i10 >= sm0Var.getChildCount()) {
                break;
            }
            View childAt = sm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.s2)) {
                s2Var = (org.telegram.ui.Cells.s2) childAt;
            }
            i10++;
        }
        if (d1Var.f47748a == s2Var) {
            this.f30860z = s2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.d1) arrayList.get(size)).f47748a.animate().cancel();
        }
    }
}
