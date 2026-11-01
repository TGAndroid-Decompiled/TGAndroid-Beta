package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ps extends s4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final uk0 C;
    public final ArrayList f29519o = new ArrayList();
    public final ArrayList f29520p = new ArrayList();
    public final ArrayList f29521q = new ArrayList();
    public final ArrayList f29522r = new ArrayList();
    public final ArrayList f29523s = new ArrayList();
    public final ArrayList f29524t = new ArrayList();
    public final ArrayList f29525u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f29526w = new ArrayList();
    public final ArrayList f29527x = new ArrayList();
    public final ArrayList f29528y = new ArrayList();
    public org.telegram.ui.Cells.v2 f29529z;

    public ps(uk0 uk0Var) {
        this.f47938m = false;
        this.C = uk0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ns nsVar = (ns) arrayList.get(size);
            if (C(nsVar, c1Var) && nsVar.f28957a == null && nsVar.f28958b == null) {
                arrayList.remove(nsVar);
            }
        }
    }

    public final boolean C(ns nsVar, s4.c1 c1Var) {
        if (nsVar.f28958b == c1Var) {
            nsVar.f28958b = null;
        } else if (nsVar.f28957a == c1Var) {
            nsVar.f28957a = null;
        } else {
            return false;
        }
        View view = c1Var.f47909a;
        View view2 = c1Var.f47909a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f29529z = null;
    }

    public final void E(s4.c1 c1Var) {
        c1Var.f47909a.animate().setInterpolator(D);
        f(c1Var);
    }

    @Override
    public final boolean c(s4.c1 c1Var, List list) {
        return c1Var.f47909a instanceof org.telegram.ui.Cells.b3;
    }

    @Override
    public final void f(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        view.animate().cancel();
        ArrayList arrayList = this.f29521q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((os) arrayList.get(size)).f29223a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        B(this.f29522r, c1Var);
        if (this.f29519o.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(c1Var);
        }
        if (this.f29520p.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(c1Var);
        }
        ArrayList arrayList2 = this.f29525u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f29524t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((os) arrayList5.get(size4)).f29223a == c1Var) {
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
        ArrayList arrayList6 = this.f29523s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                if (view instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f29527x.remove(c1Var);
        this.v.remove(c1Var);
        this.f29528y.remove(c1Var);
        this.f29526w.remove(c1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f29521q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            os osVar = (os) arrayList.get(size);
            View view = osVar.f29223a.f47909a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(osVar.f29223a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f29519o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size2);
            View view2 = c1Var.f47909a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(c1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f29520p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.c1 c1Var2 = (s4.c1) arrayList3.get(size3);
            View view3 = c1Var2.f47909a;
            if (view3 instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(c1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f29522r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ns nsVar = (ns) arrayList4.get(size4);
            s4.c1 c1Var3 = nsVar.f28957a;
            if (c1Var3 != null) {
                C(nsVar, c1Var3);
            }
            s4.c1 c1Var4 = nsVar.f28958b;
            if (c1Var4 != null) {
                C(nsVar, c1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f29524t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                os osVar2 = (os) arrayList6.get(size6);
                View view4 = osVar2.f29223a.f47909a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(osVar2.f29223a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f29523s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.c1 c1Var5 = (s4.c1) arrayList8.get(size8);
                View view5 = c1Var5.f47909a;
                if (view5 instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f29525u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ns nsVar2 = (ns) arrayList10.get(size10);
                s4.c1 c1Var6 = nsVar2.f28957a;
                if (c1Var6 != null) {
                    C(nsVar2, c1Var6);
                }
                s4.c1 c1Var7 = nsVar2.f28958b;
                if (c1Var7 != null) {
                    C(nsVar2, c1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f29527x);
        z(this.f29526w);
        z(this.v);
        z(this.f29528y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f29520p.isEmpty()) {
            ArrayList arrayList = this.f29522r;
            if (arrayList.isEmpty() && this.f29521q.isEmpty() && arrayList.isEmpty() && this.f29526w.isEmpty() && this.f29527x.isEmpty() && this.v.isEmpty() && this.f29528y.isEmpty() && this.f29524t.isEmpty() && this.f29523s.isEmpty() && this.f29525u.isEmpty()) {
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
        ArrayList arrayList2 = this.f29519o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f29521q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f29522r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f29520p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.c1 c1Var = (s4.c1) obj;
                View view = c1Var.f47909a;
                this.f29527x.add(c1Var);
                if (view instanceof org.telegram.ui.Cells.v2) {
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                    org.telegram.ui.Cells.v2 v2Var2 = this.f29529z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == v2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = v2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f29529z.setTopClip(i13);
                            this.f29529z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = v2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f29529z.setTopClip(measuredHeight2);
                            this.f29529z.setBottomClip(this.B);
                        }
                        v2Var.setElevation(-1.0f);
                        v2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(v2Var, i6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ks(this, c1Var, v2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(v2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ks(this, c1Var, v2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ls(this, c1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f29524t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final ps f27561b;

                    {
                        this.f27561b = this;
                    }

                    @Override
                    public final void run() {
                        int i14 = r3;
                        long j10 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i14) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i15 = 0;
                                while (true) {
                                    ps psVar = this.f27561b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        os osVar = (os) obj2;
                                        s4.c1 c1Var2 = osVar.f29223a;
                                        int i16 = osVar.f29224b;
                                        int i17 = osVar.f29225c;
                                        int i18 = osVar.d;
                                        int i19 = osVar.e;
                                        View view2 = c1Var2.f47909a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            psVar.B = i17 - i19;
                                        } else {
                                            psVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.v2 v2Var3 = psVar.f29529z;
                                        if (v2Var3 != null) {
                                            if (psVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = v2Var3.getMeasuredHeight();
                                                int i22 = psVar.A;
                                                psVar.B = measuredHeight3 - i22;
                                                psVar.f29529z.setTopClip(i22);
                                                psVar.f29529z.setBottomClip(psVar.B);
                                            } else if (psVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = v2Var3.getMeasuredHeight() - psVar.B;
                                                psVar.A = measuredHeight4;
                                                psVar.f29529z.setTopClip(measuredHeight4);
                                                psVar.f29529z.setBottomClip(psVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        psVar.f29526w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ms(psVar, c1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        psVar.f29524t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    ps psVar2 = this.f27561b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        ns nsVar = (ns) obj3;
                                        ArrayList arrayList8 = psVar2.f29528y;
                                        s4.c1 c1Var3 = nsVar.f28957a;
                                        s4.c1 c1Var4 = nsVar.f28958b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = c1Var3.f47909a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f47909a, property, 1.0f));
                                            arrayList8.add(nsVar.f28957a);
                                            arrayList8.add(nsVar.f28958b);
                                            animatorSet.addListener(new ci.i(psVar2, nsVar, c1Var3, animatorSet, 1));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        psVar2.f29525u.remove(arrayList7);
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
                this.f29525u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ps f27561b;

                    {
                        this.f27561b = this;
                    }

                    @Override
                    public final void run() {
                        int i14 = r3;
                        long j10 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i14) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i15 = 0;
                                while (true) {
                                    ps psVar = this.f27561b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        os osVar = (os) obj2;
                                        s4.c1 c1Var2 = osVar.f29223a;
                                        int i16 = osVar.f29224b;
                                        int i17 = osVar.f29225c;
                                        int i18 = osVar.d;
                                        int i19 = osVar.e;
                                        View view2 = c1Var2.f47909a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            psVar.B = i17 - i19;
                                        } else {
                                            psVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.v2 v2Var3 = psVar.f29529z;
                                        if (v2Var3 != null) {
                                            if (psVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = v2Var3.getMeasuredHeight();
                                                int i22 = psVar.A;
                                                psVar.B = measuredHeight3 - i22;
                                                psVar.f29529z.setTopClip(i22);
                                                psVar.f29529z.setBottomClip(psVar.B);
                                            } else if (psVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = v2Var3.getMeasuredHeight() - psVar.B;
                                                psVar.A = measuredHeight4;
                                                psVar.f29529z.setTopClip(measuredHeight4);
                                                psVar.f29529z.setBottomClip(psVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        psVar.f29526w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ms(psVar, c1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        psVar.f29524t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    ps psVar2 = this.f27561b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        ns nsVar = (ns) obj3;
                                        ArrayList arrayList8 = psVar2.f29528y;
                                        s4.c1 c1Var3 = nsVar.f28957a;
                                        s4.c1 c1Var4 = nsVar.f28958b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = c1Var3.f47909a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f47909a, property, 1.0f));
                                            arrayList8.add(nsVar.f28957a);
                                            arrayList8.add(nsVar.f28958b);
                                            animatorSet.addListener(new ci.i(psVar2, nsVar, c1Var3, animatorSet, 1));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        psVar2.f29525u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f29523s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.c1 c1Var2 = (s4.c1) obj2;
                    View view2 = c1Var2.f47909a;
                    this.v.add(c1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ls(this, c1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.c1 c1Var) {
        E(c1Var);
        View view = c1Var.f47909a;
        if (!(view instanceof org.telegram.ui.Cells.v2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f29520p;
        arrayList.add(c1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.c1) arrayList.get(i10)).f47909a.setAlpha(0.0f);
                if (((s4.c1) arrayList.get(i10)).f47909a instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) ((s4.c1) arrayList.get(i10)).f47909a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.c1 c1Var, s4.c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            E(c1Var);
            E(c1Var2);
            View view2 = c1Var2.f47909a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f28957a = c1Var;
            obj.f28958b = c1Var2;
            obj.f28959c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f28960f = i13;
            this.f29522r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        View view = c1Var.f47909a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = c1Var.f47909a;
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
        if (view2 instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view2).setMoving(true);
        } else if (view2 instanceof zf.l) {
            ((zf.l) view2).f55576a = true;
        }
        ?? obj = new Object();
        obj.f29223a = c1Var;
        obj.f29224b = translationX;
        obj.f29225c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f29521q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.c1 c1Var, ac.g gVar) {
        E(c1Var);
        this.f29519o.add(c1Var);
        org.telegram.ui.Cells.v2 v2Var = null;
        int i10 = 0;
        while (true) {
            uk0 uk0Var = this.C;
            if (i10 >= uk0Var.getChildCount()) {
                break;
            }
            View childAt = uk0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.v2)) {
                v2Var = (org.telegram.ui.Cells.v2) childAt;
            }
            i10++;
        }
        if (c1Var.f47909a == v2Var) {
            this.f29529z = v2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.c1) arrayList.get(size)).f47909a.animate().cancel();
        }
    }
}
