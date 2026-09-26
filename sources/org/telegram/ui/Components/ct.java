package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ct extends s4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final xl0 C;
    public final ArrayList f23389o = new ArrayList();
    public final ArrayList f23390p = new ArrayList();
    public final ArrayList f23391q = new ArrayList();
    public final ArrayList f23392r = new ArrayList();
    public final ArrayList f23393s = new ArrayList();
    public final ArrayList f23394t = new ArrayList();
    public final ArrayList f23395u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f23396w = new ArrayList();
    public final ArrayList f23397x = new ArrayList();
    public final ArrayList f23398y = new ArrayList();
    public org.telegram.ui.Cells.s2 f23399z;

    public ct(xl0 xl0Var) {
        this.f42994m = false;
        this.C = xl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            at atVar = (at) arrayList.get(size);
            if (C(atVar, c1Var) && atVar.f22745a == null && atVar.f22746b == null) {
                arrayList.remove(atVar);
            }
        }
    }

    public final boolean C(at atVar, s4.c1 c1Var) {
        if (atVar.f22746b == c1Var) {
            atVar.f22746b = null;
        } else if (atVar.f22745a == c1Var) {
            atVar.f22745a = null;
        } else {
            return false;
        }
        View view = c1Var.f42959a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f23399z = null;
    }

    public final void E(s4.c1 c1Var) {
        c1Var.f42959a.animate().setInterpolator(D);
        f(c1Var);
    }

    @Override
    public final boolean c(s4.c1 c1Var, List list) {
        return c1Var.f42959a instanceof org.telegram.ui.Cells.y2;
    }

    @Override
    public final void f(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        view.animate().cancel();
        ArrayList arrayList = this.f23391q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((bt) arrayList.get(size)).f23099a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        B(this.f23392r, c1Var);
        if (this.f23389o.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(c1Var);
        }
        if (this.f23390p.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(c1Var);
        }
        ArrayList arrayList2 = this.f23395u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f23394t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((bt) arrayList5.get(size4)).f23099a == c1Var) {
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
        ArrayList arrayList6 = this.f23393s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f23397x.remove(c1Var);
        this.v.remove(c1Var);
        this.f23398y.remove(c1Var);
        this.f23396w.remove(c1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f23391q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bt btVar = (bt) arrayList.get(size);
            View view = btVar.f23099a.f42959a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(btVar.f23099a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f23389o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size2);
            View view2 = c1Var.f42959a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(c1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f23390p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.c1 c1Var2 = (s4.c1) arrayList3.get(size3);
            View view3 = c1Var2.f42959a;
            if (view3 instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(c1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f23392r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            at atVar = (at) arrayList4.get(size4);
            s4.c1 c1Var3 = atVar.f22745a;
            if (c1Var3 != null) {
                C(atVar, c1Var3);
            }
            s4.c1 c1Var4 = atVar.f22746b;
            if (c1Var4 != null) {
                C(atVar, c1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f23394t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                bt btVar2 = (bt) arrayList6.get(size6);
                View view4 = btVar2.f23099a.f42959a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(btVar2.f23099a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f23393s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.c1 c1Var5 = (s4.c1) arrayList8.get(size8);
                View view5 = c1Var5.f42959a;
                if (view5 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f23395u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                at atVar2 = (at) arrayList10.get(size10);
                s4.c1 c1Var6 = atVar2.f22745a;
                if (c1Var6 != null) {
                    C(atVar2, c1Var6);
                }
                s4.c1 c1Var7 = atVar2.f22746b;
                if (c1Var7 != null) {
                    C(atVar2, c1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f23397x);
        z(this.f23396w);
        z(this.v);
        z(this.f23398y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f23390p.isEmpty()) {
            ArrayList arrayList = this.f23392r;
            if (arrayList.isEmpty() && this.f23391q.isEmpty() && arrayList.isEmpty() && this.f23396w.isEmpty() && this.f23397x.isEmpty() && this.v.isEmpty() && this.f23398y.isEmpty() && this.f23394t.isEmpty() && this.f23393s.isEmpty() && this.f23395u.isEmpty()) {
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
        ArrayList arrayList2 = this.f23389o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f23391q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f23392r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f23390p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                s4.c1 c1Var = (s4.c1) obj;
                View view = c1Var.f42959a;
                this.f23397x.add(c1Var);
                if (view instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    org.telegram.ui.Cells.s2 s2Var2 = this.f23399z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == s2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = s2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f23399z.setTopClip(i12);
                            this.f23399z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = s2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f23399z.setTopClip(measuredHeight2);
                            this.f23399z.setBottomClip(this.B);
                        }
                        s2Var.setElevation(-1.0f);
                        s2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(s2Var, s6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new xs(this, c1Var, s2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new xs(this, c1Var, s2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ys(this, c1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f23394t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final ct f30197b;

                    {
                        this.f30197b = this;
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
                                    ct ctVar = this.f30197b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        bt btVar = (bt) obj2;
                                        s4.c1 c1Var2 = btVar.f23099a;
                                        int i15 = btVar.f23100b;
                                        int i16 = btVar.f23101c;
                                        int i17 = btVar.d;
                                        int i18 = btVar.e;
                                        View view2 = c1Var2.f42959a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ctVar.B = i16 - i18;
                                        } else {
                                            ctVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = ctVar.f23399z;
                                        if (s2Var3 != null) {
                                            if (ctVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i21 = ctVar.A;
                                                ctVar.B = measuredHeight3 - i21;
                                                ctVar.f23399z.setTopClip(i21);
                                                ctVar.f23399z.setBottomClip(ctVar.B);
                                            } else if (ctVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - ctVar.B;
                                                ctVar.A = measuredHeight4;
                                                ctVar.f23399z.setTopClip(measuredHeight4);
                                                ctVar.f23399z.setBottomClip(ctVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ctVar.f23396w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new zs(ctVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        ctVar.f23394t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    ct ctVar2 = this.f30197b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        at atVar = (at) obj3;
                                        ArrayList arrayList8 = ctVar2.f23398y;
                                        s4.c1 c1Var3 = atVar.f22745a;
                                        s4.c1 c1Var4 = atVar.f22746b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f42959a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f42959a, property, 1.0f));
                                            arrayList8.add(atVar.f22745a);
                                            arrayList8.add(atVar.f22746b);
                                            animatorSet.addListener(new gg.k0(ctVar2, atVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        ctVar2.f23395u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f23395u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ct f30197b;

                    {
                        this.f30197b = this;
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
                                    ct ctVar = this.f30197b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        bt btVar = (bt) obj2;
                                        s4.c1 c1Var2 = btVar.f23099a;
                                        int i15 = btVar.f23100b;
                                        int i16 = btVar.f23101c;
                                        int i17 = btVar.d;
                                        int i18 = btVar.e;
                                        View view2 = c1Var2.f42959a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ctVar.B = i16 - i18;
                                        } else {
                                            ctVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = ctVar.f23399z;
                                        if (s2Var3 != null) {
                                            if (ctVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i21 = ctVar.A;
                                                ctVar.B = measuredHeight3 - i21;
                                                ctVar.f23399z.setTopClip(i21);
                                                ctVar.f23399z.setBottomClip(ctVar.B);
                                            } else if (ctVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - ctVar.B;
                                                ctVar.A = measuredHeight4;
                                                ctVar.f23399z.setTopClip(measuredHeight4);
                                                ctVar.f23399z.setBottomClip(ctVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ctVar.f23396w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new zs(ctVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        ctVar.f23394t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    ct ctVar2 = this.f30197b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        at atVar = (at) obj3;
                                        ArrayList arrayList8 = ctVar2.f23398y;
                                        s4.c1 c1Var3 = atVar.f22745a;
                                        s4.c1 c1Var4 = atVar.f22746b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f42959a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f42959a, property, 1.0f));
                                            arrayList8.add(atVar.f22745a);
                                            arrayList8.add(atVar.f22746b);
                                            animatorSet.addListener(new gg.k0(ctVar2, atVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        ctVar2.f23395u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f23393s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    s4.c1 c1Var2 = (s4.c1) obj2;
                    View view2 = c1Var2.f42959a;
                    this.v.add(c1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ys(this, c1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.c1 c1Var) {
        E(c1Var);
        View view = c1Var.f42959a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f23390p;
        arrayList.add(c1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.c1) arrayList.get(i10)).f42959a.setAlpha(0.0f);
                if (((s4.c1) arrayList.get(i10)).f42959a instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) ((s4.c1) arrayList.get(i10)).f42959a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.c1 c1Var, s4.c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            E(c1Var);
            E(c1Var2);
            View view2 = c1Var2.f42959a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f22745a = c1Var;
            obj.f22746b = c1Var2;
            obj.f22747c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f22748f = i13;
            this.f23392r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f42959a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = c1Var.f42959a;
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
        if (view2 instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view2).setMoving(true);
        } else if (view2 instanceof gg.l) {
            ((gg.l) view2).f9829a = true;
        }
        ?? obj = new Object();
        obj.f23099a = c1Var;
        obj.f23100b = translationX;
        obj.f23101c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f23391q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.c1 c1Var, b2.q0 q0Var) {
        E(c1Var);
        this.f23389o.add(c1Var);
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        while (true) {
            xl0 xl0Var = this.C;
            if (i10 >= xl0Var.getChildCount()) {
                break;
            }
            View childAt = xl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.s2)) {
                s2Var = (org.telegram.ui.Cells.s2) childAt;
            }
            i10++;
        }
        if (c1Var.f42959a == s2Var) {
            this.f23399z = s2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.c1) arrayList.get(size)).f42959a.animate().cancel();
        }
    }
}
