package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ps extends f2.t1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final wk0 C;
    public final ArrayList f31735o = new ArrayList();
    public final ArrayList f31736p = new ArrayList();
    public final ArrayList f31737q = new ArrayList();
    public final ArrayList f31738r = new ArrayList();
    public final ArrayList f31739s = new ArrayList();
    public final ArrayList f31740t = new ArrayList();
    public final ArrayList f31741u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f31742w = new ArrayList();
    public final ArrayList f31743x = new ArrayList();
    public final ArrayList f31744y = new ArrayList();
    public org.telegram.ui.Cells.r2 f31745z;

    public ps(wk0 wk0Var) {
        this.f5532m = false;
        this.C = wk0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f2.q1 q1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ns nsVar = (ns) arrayList.get(size);
            if (C(nsVar, q1Var) && nsVar.f31172a == null && nsVar.f31173b == null) {
                arrayList.remove(nsVar);
            }
        }
    }

    public final boolean C(ns nsVar, f2.q1 q1Var) {
        if (nsVar.f31173b == q1Var) {
            nsVar.f31173b = null;
        } else if (nsVar.f31172a == q1Var) {
            nsVar.f31172a = null;
        } else {
            return false;
        }
        View view = q1Var.f5501a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(q1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f31745z = null;
    }

    public final void E(f2.q1 q1Var) {
        q1Var.f5501a.animate().setInterpolator(D);
        f(q1Var);
    }

    @Override
    public final boolean c(f2.q1 q1Var, List list) {
        return q1Var.f5501a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        view.animate().cancel();
        ArrayList arrayList = this.f31737q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((os) arrayList.get(size)).f31432a == q1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(q1Var);
                arrayList.remove(size);
            }
        }
        B(this.f31738r, q1Var);
        if (this.f31735o.remove(q1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(q1Var);
        }
        if (this.f31736p.remove(q1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(q1Var);
        }
        ArrayList arrayList2 = this.f31741u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, q1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f31740t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((os) arrayList5.get(size4)).f31432a == q1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(q1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f31739s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(q1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(q1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f31743x.remove(q1Var);
        this.v.remove(q1Var);
        this.f31744y.remove(q1Var);
        this.f31742w.remove(q1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f31737q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            os osVar = (os) arrayList.get(size);
            View view = osVar.f31432a.f5501a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(osVar.f31432a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f31735o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.q1 q1Var = (f2.q1) arrayList2.get(size2);
            View view2 = q1Var.f5501a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(q1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f31736p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.q1 q1Var2 = (f2.q1) arrayList3.get(size3);
            View view3 = q1Var2.f5501a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(q1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f31738r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ns nsVar = (ns) arrayList4.get(size4);
            f2.q1 q1Var3 = nsVar.f31172a;
            if (q1Var3 != null) {
                C(nsVar, q1Var3);
            }
            f2.q1 q1Var4 = nsVar.f31173b;
            if (q1Var4 != null) {
                C(nsVar, q1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f31740t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                os osVar2 = (os) arrayList6.get(size6);
                View view4 = osVar2.f31432a.f5501a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(osVar2.f31432a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f31739s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f2.q1 q1Var5 = (f2.q1) arrayList8.get(size8);
                View view5 = q1Var5.f5501a;
                if (view5 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(q1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f31741u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ns nsVar2 = (ns) arrayList10.get(size10);
                f2.q1 q1Var6 = nsVar2.f31172a;
                if (q1Var6 != null) {
                    C(nsVar2, q1Var6);
                }
                f2.q1 q1Var7 = nsVar2.f31173b;
                if (q1Var7 != null) {
                    C(nsVar2, q1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f31743x);
        z(this.f31742w);
        z(this.v);
        z(this.f31744y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f31736p.isEmpty()) {
            ArrayList arrayList = this.f31738r;
            if (arrayList.isEmpty() && this.f31737q.isEmpty() && arrayList.isEmpty() && this.f31742w.isEmpty() && this.f31743x.isEmpty() && this.v.isEmpty() && this.f31744y.isEmpty() && this.f31740t.isEmpty() && this.f31739s.isEmpty() && this.f31741u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f31735o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f31737q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f31738r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f31736p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                f2.q1 q1Var = (f2.q1) obj;
                View view = q1Var.f5501a;
                this.f31743x.add(q1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f31745z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i11 = this.A;
                            this.B = measuredHeight - i11;
                            this.f31745z.setTopClip(i11);
                            this.f31745z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f31745z.setTopClip(measuredHeight2);
                            this.f31745z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, m6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ls(this, q1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i9 = size;
                    } else {
                        arrayList = arrayList2;
                        i9 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ls(this, q1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i9 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ms(this, q1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i9;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f31740t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final ps f30236b;

                    {
                        this.f30236b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r3;
                        long j10 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i12) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i13 = 0;
                                while (true) {
                                    ps psVar = this.f30236b;
                                    if (i13 < size2) {
                                        Object obj2 = arrayList7.get(i13);
                                        i13++;
                                        os osVar = (os) obj2;
                                        f2.q1 q1Var2 = osVar.f31432a;
                                        int i14 = osVar.f31433b;
                                        int i15 = osVar.f31434c;
                                        int i16 = osVar.d;
                                        int i17 = osVar.f31435e;
                                        View view2 = q1Var2.f5501a;
                                        int i18 = i16 - i14;
                                        int i19 = i17 - i15;
                                        if (i18 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i19 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i15 > i17) {
                                            psVar.B = i15 - i17;
                                        } else {
                                            psVar.A = i19;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = psVar.f31745z;
                                        if (r2Var3 != null) {
                                            if (psVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i20 = psVar.A;
                                                psVar.B = measuredHeight3 - i20;
                                                psVar.f31745z.setTopClip(i20);
                                                psVar.f31745z.setBottomClip(psVar.B);
                                            } else if (psVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - psVar.B;
                                                psVar.A = measuredHeight4;
                                                psVar.f31745z.setTopClip(measuredHeight4);
                                                psVar.f31745z.setBottomClip(psVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        psVar.f31742w.add(q1Var2);
                                        animate2.setDuration(180L).setListener(new f2.j(psVar, q1Var2, i18, view2, i19, animate2, 1)).start();
                                    } else {
                                        arrayList7.clear();
                                        psVar.f31740t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i21 = 0;
                                while (true) {
                                    ps psVar2 = this.f30236b;
                                    if (i21 < size3) {
                                        Object obj3 = arrayList7.get(i21);
                                        i21++;
                                        ns nsVar = (ns) obj3;
                                        ArrayList arrayList8 = psVar2.f31744y;
                                        f2.q1 q1Var3 = nsVar.f31172a;
                                        f2.q1 q1Var4 = nsVar.f31173b;
                                        if (q1Var3 != null && q1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = q1Var3.f5501a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(q1Var4.f5501a, property, 1.0f));
                                            arrayList8.add(nsVar.f31172a);
                                            arrayList8.add(nsVar.f31173b);
                                            animatorSet.addListener(new of.h0(psVar2, nsVar, q1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        psVar2.f31741u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f31741u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ps f30236b;

                    {
                        this.f30236b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r3;
                        long j10 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i12) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i13 = 0;
                                while (true) {
                                    ps psVar = this.f30236b;
                                    if (i13 < size2) {
                                        Object obj2 = arrayList72.get(i13);
                                        i13++;
                                        os osVar = (os) obj2;
                                        f2.q1 q1Var2 = osVar.f31432a;
                                        int i14 = osVar.f31433b;
                                        int i15 = osVar.f31434c;
                                        int i16 = osVar.d;
                                        int i17 = osVar.f31435e;
                                        View view2 = q1Var2.f5501a;
                                        int i18 = i16 - i14;
                                        int i19 = i17 - i15;
                                        if (i18 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i19 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i15 > i17) {
                                            psVar.B = i15 - i17;
                                        } else {
                                            psVar.A = i19;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = psVar.f31745z;
                                        if (r2Var3 != null) {
                                            if (psVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i20 = psVar.A;
                                                psVar.B = measuredHeight3 - i20;
                                                psVar.f31745z.setTopClip(i20);
                                                psVar.f31745z.setBottomClip(psVar.B);
                                            } else if (psVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - psVar.B;
                                                psVar.A = measuredHeight4;
                                                psVar.f31745z.setTopClip(measuredHeight4);
                                                psVar.f31745z.setBottomClip(psVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        psVar.f31742w.add(q1Var2);
                                        animate2.setDuration(180L).setListener(new f2.j(psVar, q1Var2, i18, view2, i19, animate2, 1)).start();
                                    } else {
                                        arrayList72.clear();
                                        psVar.f31740t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i21 = 0;
                                while (true) {
                                    ps psVar2 = this.f30236b;
                                    if (i21 < size3) {
                                        Object obj3 = arrayList72.get(i21);
                                        i21++;
                                        ns nsVar = (ns) obj3;
                                        ArrayList arrayList8 = psVar2.f31744y;
                                        f2.q1 q1Var3 = nsVar.f31172a;
                                        f2.q1 q1Var4 = nsVar.f31173b;
                                        if (q1Var3 != null && q1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = q1Var3.f5501a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(q1Var4.f5501a, property, 1.0f));
                                            arrayList8.add(nsVar.f31172a);
                                            arrayList8.add(nsVar.f31173b);
                                            animatorSet.addListener(new of.h0(psVar2, nsVar, q1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        psVar2.f31741u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f31739s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList8.get(i12);
                    i12++;
                    f2.q1 q1Var2 = (f2.q1) obj2;
                    View view2 = q1Var2.f5501a;
                    this.v.add(q1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ms(this, q1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(f2.q1 q1Var) {
        E(q1Var);
        View view = q1Var.f5501a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f31736p;
        arrayList.add(q1Var);
        if (arrayList.size() > 2) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((f2.q1) arrayList.get(i9)).f5501a.setAlpha(0.0f);
                if (((f2.q1) arrayList.get(i9)).f5501a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((f2.q1) arrayList.get(i9)).f5501a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.q1 q1Var, f2.q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(q1Var);
            E(q1Var2);
            View view2 = q1Var2.f5501a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f31172a = q1Var;
            obj.f31173b = q1Var2;
            obj.f31174c = i9;
            obj.d = i10;
            obj.f31175e = i11;
            obj.f31176f = i12;
            this.f31738r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.f5501a;
        int translationX = i9 + ((int) view.getTranslationX());
        View view2 = q1Var.f5501a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(q1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(q1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        if (view2 instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view2).setMoving(true);
        } else if (view2 instanceof of.l) {
            ((of.l) view2).f19401a = true;
        }
        ?? obj = new Object();
        obj.f31432a = q1Var;
        obj.f31433b = translationX;
        obj.f31434c = translationY;
        obj.d = i11;
        obj.f31435e = i12;
        this.f31737q.add(obj);
        return true;
    }

    @Override
    public final void s(f2.q1 q1Var, d5.p pVar) {
        E(q1Var);
        this.f31735o.add(q1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.C;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i9++;
        }
        if (q1Var.f5501a == r2Var) {
            this.f31745z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.q1) arrayList.get(size)).f5501a.animate().cancel();
        }
    }
}
