package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class tt extends s4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final wm0 C;
    public final ArrayList f30967o = new ArrayList();
    public final ArrayList f30968p = new ArrayList();
    public final ArrayList f30969q = new ArrayList();
    public final ArrayList f30970r = new ArrayList();
    public final ArrayList f30971s = new ArrayList();
    public final ArrayList f30972t = new ArrayList();
    public final ArrayList f30973u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f30974w = new ArrayList();
    public final ArrayList f30975x = new ArrayList();
    public final ArrayList f30976y = new ArrayList();
    public org.telegram.ui.Cells.s2 f30977z;

    public tt(wm0 wm0Var) {
        this.f47929m = false;
        this.C = wm0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rt rtVar = (rt) arrayList.get(size);
            if (C(rtVar, d1Var) && rtVar.f30238a == null && rtVar.f30239b == null) {
                arrayList.remove(rtVar);
            }
        }
    }

    public final boolean C(rt rtVar, s4.d1 d1Var) {
        if (rtVar.f30239b == d1Var) {
            rtVar.f30239b = null;
        } else if (rtVar.f30238a == d1Var) {
            rtVar.f30238a = null;
        } else {
            return false;
        }
        View view = d1Var.f47889a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f30977z = null;
    }

    public final void E(s4.d1 d1Var) {
        d1Var.f47889a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override
    public final boolean c(s4.d1 d1Var, List list) {
        return d1Var.f47889a instanceof org.telegram.ui.Cells.y2;
    }

    @Override
    public final void f(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        view.animate().cancel();
        ArrayList arrayList = this.f30969q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((st) arrayList.get(size)).f30670a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.f30970r, d1Var);
        if (this.f30967o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.f30968p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(d1Var);
        }
        ArrayList arrayList2 = this.f30973u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, d1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f30972t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((st) arrayList5.get(size4)).f30670a == d1Var) {
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
        ArrayList arrayList6 = this.f30971s;
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
        this.f30975x.remove(d1Var);
        this.v.remove(d1Var);
        this.f30976y.remove(d1Var);
        this.f30974w.remove(d1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f30969q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            st stVar = (st) arrayList.get(size);
            View view = stVar.f30670a.f47889a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(stVar.f30670a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f30967o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.d1 d1Var = (s4.d1) arrayList2.get(size2);
            View view2 = d1Var.f47889a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(d1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f30968p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.d1 d1Var2 = (s4.d1) arrayList3.get(size3);
            View view3 = d1Var2.f47889a;
            if (view3 instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f30970r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            rt rtVar = (rt) arrayList4.get(size4);
            s4.d1 d1Var3 = rtVar.f30238a;
            if (d1Var3 != null) {
                C(rtVar, d1Var3);
            }
            s4.d1 d1Var4 = rtVar.f30239b;
            if (d1Var4 != null) {
                C(rtVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f30972t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                st stVar2 = (st) arrayList6.get(size6);
                View view4 = stVar2.f30670a.f47889a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(stVar2.f30670a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f30971s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.d1 d1Var5 = (s4.d1) arrayList8.get(size8);
                View view5 = d1Var5.f47889a;
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
        ArrayList arrayList9 = this.f30973u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                rt rtVar2 = (rt) arrayList10.get(size10);
                s4.d1 d1Var6 = rtVar2.f30238a;
                if (d1Var6 != null) {
                    C(rtVar2, d1Var6);
                }
                s4.d1 d1Var7 = rtVar2.f30239b;
                if (d1Var7 != null) {
                    C(rtVar2, d1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f30975x);
        z(this.f30974w);
        z(this.v);
        z(this.f30976y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f30968p.isEmpty()) {
            ArrayList arrayList = this.f30970r;
            if (arrayList.isEmpty() && this.f30969q.isEmpty() && arrayList.isEmpty() && this.f30974w.isEmpty() && this.f30975x.isEmpty() && this.v.isEmpty() && this.f30976y.isEmpty() && this.f30972t.isEmpty() && this.f30971s.isEmpty() && this.f30973u.isEmpty()) {
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
        ArrayList arrayList2 = this.f30967o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f30969q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f30970r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f30968p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.d1 d1Var = (s4.d1) obj;
                View view = d1Var.f47889a;
                this.f30975x.add(d1Var);
                if (view instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    org.telegram.ui.Cells.s2 s2Var2 = this.f30977z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == s2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = s2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f30977z.setTopClip(i13);
                            this.f30977z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = s2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f30977z.setTopClip(measuredHeight2);
                            this.f30977z.setBottomClip(this.B);
                        }
                        s2Var.setElevation(-1.0f);
                        s2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(s2Var, u6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ot(this, d1Var, s2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ot(this, d1Var, s2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new pt(this, d1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f30972t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final tt f28961b;

                    {
                        this.f28961b = this;
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
                                    tt ttVar = this.f28961b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        st stVar = (st) obj2;
                                        s4.d1 d1Var2 = stVar.f30670a;
                                        int i16 = stVar.f30671b;
                                        int i17 = stVar.f30672c;
                                        int i18 = stVar.d;
                                        int i19 = stVar.f30673e;
                                        View view2 = d1Var2.f47889a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            ttVar.B = i17 - i19;
                                        } else {
                                            ttVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = ttVar.f30977z;
                                        if (s2Var3 != null) {
                                            if (ttVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = ttVar.A;
                                                ttVar.B = measuredHeight3 - i22;
                                                ttVar.f30977z.setTopClip(i22);
                                                ttVar.f30977z.setBottomClip(ttVar.B);
                                            } else if (ttVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - ttVar.B;
                                                ttVar.A = measuredHeight4;
                                                ttVar.f30977z.setTopClip(measuredHeight4);
                                                ttVar.f30977z.setBottomClip(ttVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ttVar.f30974w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new qt(ttVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        ttVar.f30972t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    tt ttVar2 = this.f28961b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        rt rtVar = (rt) obj3;
                                        ArrayList arrayList8 = ttVar2.f30976y;
                                        s4.d1 d1Var3 = rtVar.f30238a;
                                        s4.d1 d1Var4 = rtVar.f30239b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f47889a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f47889a, property, 1.0f));
                                            arrayList8.add(rtVar.f30238a);
                                            arrayList8.add(rtVar.f30239b);
                                            animatorSet.addListener(new gg.j0(ttVar2, rtVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        ttVar2.f30973u.remove(arrayList7);
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
                this.f30973u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final tt f28961b;

                    {
                        this.f28961b = this;
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
                                    tt ttVar = this.f28961b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        st stVar = (st) obj2;
                                        s4.d1 d1Var2 = stVar.f30670a;
                                        int i16 = stVar.f30671b;
                                        int i17 = stVar.f30672c;
                                        int i18 = stVar.d;
                                        int i19 = stVar.f30673e;
                                        View view2 = d1Var2.f47889a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            ttVar.B = i17 - i19;
                                        } else {
                                            ttVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = ttVar.f30977z;
                                        if (s2Var3 != null) {
                                            if (ttVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = ttVar.A;
                                                ttVar.B = measuredHeight3 - i22;
                                                ttVar.f30977z.setTopClip(i22);
                                                ttVar.f30977z.setBottomClip(ttVar.B);
                                            } else if (ttVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - ttVar.B;
                                                ttVar.A = measuredHeight4;
                                                ttVar.f30977z.setTopClip(measuredHeight4);
                                                ttVar.f30977z.setBottomClip(ttVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ttVar.f30974w.add(d1Var2);
                                        animate2.setDuration(180L).setListener(new qt(ttVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        ttVar.f30972t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    tt ttVar2 = this.f28961b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        rt rtVar = (rt) obj3;
                                        ArrayList arrayList8 = ttVar2.f30976y;
                                        s4.d1 d1Var3 = rtVar.f30238a;
                                        s4.d1 d1Var4 = rtVar.f30239b;
                                        if (d1Var3 != null && d1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = d1Var3.f47889a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(d1Var4.f47889a, property, 1.0f));
                                            arrayList8.add(rtVar.f30238a);
                                            arrayList8.add(rtVar.f30239b);
                                            animatorSet.addListener(new gg.j0(ttVar2, rtVar, d1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        ttVar2.f30973u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f30971s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.d1 d1Var2 = (s4.d1) obj2;
                    View view2 = d1Var2.f47889a;
                    this.v.add(d1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new pt(this, d1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.f47889a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f30968p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.d1) arrayList.get(i10)).f47889a.setAlpha(0.0f);
                if (((s4.d1) arrayList.get(i10)).f47889a instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) ((s4.d1) arrayList.get(i10)).f47889a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.d1 d1Var, s4.d1 d1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.f47889a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            E(d1Var);
            E(d1Var2);
            View view2 = d1Var2.f47889a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f30238a = d1Var;
            obj.f30239b = d1Var2;
            obj.f30240c = i10;
            obj.d = i11;
            obj.f30241e = i12;
            obj.f30242f = i13;
            this.f30970r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.f47889a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = d1Var.f47889a;
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
            ((gg.l) view2).f10709a = true;
        }
        ?? obj = new Object();
        obj.f30670a = d1Var;
        obj.f30671b = translationX;
        obj.f30672c = translationY;
        obj.d = i12;
        obj.f30673e = i13;
        this.f30969q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.d1 d1Var, b2.q0 q0Var) {
        E(d1Var);
        this.f30967o.add(d1Var);
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        while (true) {
            wm0 wm0Var = this.C;
            if (i10 >= wm0Var.getChildCount()) {
                break;
            }
            View childAt = wm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.s2)) {
                s2Var = (org.telegram.ui.Cells.s2) childAt;
            }
            i10++;
        }
        if (d1Var.f47889a == s2Var) {
            this.f30977z = s2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.d1) arrayList.get(size)).f47889a.animate().cancel();
        }
    }
}
