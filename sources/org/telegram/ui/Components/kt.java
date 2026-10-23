package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class kt extends s4.e1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final mm0 C;
    public final ArrayList f28142o = new ArrayList();
    public final ArrayList f28143p = new ArrayList();
    public final ArrayList f28144q = new ArrayList();
    public final ArrayList f28145r = new ArrayList();
    public final ArrayList f28146s = new ArrayList();
    public final ArrayList f28147t = new ArrayList();
    public final ArrayList f28148u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f28149w = new ArrayList();
    public final ArrayList f28150x = new ArrayList();
    public final ArrayList f28151y = new ArrayList();
    public org.telegram.ui.Cells.q2 f28152z;

    public kt(mm0 mm0Var) {
        this.f46377m = false;
        this.C = mm0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.b1 b1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ht htVar = (ht) arrayList.get(size);
            if (C(htVar, b1Var) && htVar.f27046a == null && htVar.f27047b == null) {
                arrayList.remove(htVar);
            }
        }
    }

    public final boolean C(ht htVar, s4.b1 b1Var) {
        if (htVar.f27047b == b1Var) {
            htVar.f27047b = null;
        } else if (htVar.f27046a == b1Var) {
            htVar.f27046a = null;
        } else {
            return false;
        }
        View view = b1Var.f46343a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(b1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f28152z = null;
    }

    public final void E(s4.b1 b1Var) {
        b1Var.f46343a.animate().setInterpolator(D);
        f(b1Var);
    }

    @Override
    public final boolean c(s4.b1 b1Var, List list) {
        return b1Var.f46343a instanceof org.telegram.ui.Cells.w2;
    }

    @Override
    public final void f(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        view.animate().cancel();
        ArrayList arrayList = this.f28144q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((jt) arrayList.get(size)).f27759a == b1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b1Var);
                arrayList.remove(size);
            }
        }
        B(this.f28145r, b1Var);
        if (this.f28142o.remove(b1Var)) {
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(b1Var);
        }
        if (this.f28143p.remove(b1Var)) {
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(b1Var);
        }
        ArrayList arrayList2 = this.f28148u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, b1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f28147t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((jt) arrayList5.get(size4)).f27759a == b1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(b1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f28146s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b1Var)) {
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(b1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f28150x.remove(b1Var);
        this.v.remove(b1Var);
        this.f28151y.remove(b1Var);
        this.f28149w.remove(b1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f28144q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jt jtVar = (jt) arrayList.get(size);
            View view = jtVar.f27759a.f46343a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jtVar.f27759a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f28142o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.b1 b1Var = (s4.b1) arrayList2.get(size2);
            View view2 = b1Var.f46343a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(b1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f28143p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.b1 b1Var2 = (s4.b1) arrayList3.get(size3);
            View view3 = b1Var2.f46343a;
            if (view3 instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(b1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f28145r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ht htVar = (ht) arrayList4.get(size4);
            s4.b1 b1Var3 = htVar.f27046a;
            if (b1Var3 != null) {
                C(htVar, b1Var3);
            }
            s4.b1 b1Var4 = htVar.f27047b;
            if (b1Var4 != null) {
                C(htVar, b1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f28147t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                jt jtVar2 = (jt) arrayList6.get(size6);
                View view4 = jtVar2.f27759a.f46343a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(jtVar2.f27759a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f28146s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.b1 b1Var5 = (s4.b1) arrayList8.get(size8);
                View view5 = b1Var5.f46343a;
                if (view5 instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(b1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f28148u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ht htVar2 = (ht) arrayList10.get(size10);
                s4.b1 b1Var6 = htVar2.f27046a;
                if (b1Var6 != null) {
                    C(htVar2, b1Var6);
                }
                s4.b1 b1Var7 = htVar2.f27047b;
                if (b1Var7 != null) {
                    C(htVar2, b1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f28150x);
        z(this.f28149w);
        z(this.v);
        z(this.f28151y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f28143p.isEmpty()) {
            ArrayList arrayList = this.f28145r;
            if (arrayList.isEmpty() && this.f28144q.isEmpty() && arrayList.isEmpty() && this.f28149w.isEmpty() && this.f28150x.isEmpty() && this.v.isEmpty() && this.f28151y.isEmpty() && this.f28147t.isEmpty() && this.f28146s.isEmpty() && this.f28148u.isEmpty()) {
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
        ArrayList arrayList2 = this.f28142o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f28144q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f28145r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f28143p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.b1 b1Var = (s4.b1) obj;
                View view = b1Var.f46343a;
                this.f28150x.add(b1Var);
                if (view instanceof org.telegram.ui.Cells.q2) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    org.telegram.ui.Cells.q2 q2Var2 = this.f28152z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == q2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = q2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f28152z.setTopClip(i13);
                            this.f28152z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = q2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f28152z.setTopClip(measuredHeight2);
                            this.f28152z.setBottomClip(this.B);
                        }
                        q2Var.setElevation(-1.0f);
                        q2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(q2Var, t6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new et(this, b1Var, q2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(q2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new et(this, b1Var, q2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ft(this, b1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f28147t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final kt f25728b;

                    {
                        this.f25728b = this;
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
                                    kt ktVar = this.f25728b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        jt jtVar = (jt) obj2;
                                        s4.b1 b1Var2 = jtVar.f27759a;
                                        int i16 = jtVar.f27760b;
                                        int i17 = jtVar.f27761c;
                                        int i18 = jtVar.d;
                                        int i19 = jtVar.e;
                                        View view2 = b1Var2.f46343a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            ktVar.B = i17 - i19;
                                        } else {
                                            ktVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.q2 q2Var3 = ktVar.f28152z;
                                        if (q2Var3 != null) {
                                            if (ktVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = q2Var3.getMeasuredHeight();
                                                int i22 = ktVar.A;
                                                ktVar.B = measuredHeight3 - i22;
                                                ktVar.f28152z.setTopClip(i22);
                                                ktVar.f28152z.setBottomClip(ktVar.B);
                                            } else if (ktVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = q2Var3.getMeasuredHeight() - ktVar.B;
                                                ktVar.A = measuredHeight4;
                                                ktVar.f28152z.setTopClip(measuredHeight4);
                                                ktVar.f28152z.setBottomClip(ktVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ktVar.f28149w.add(b1Var2);
                                        animate2.setDuration(180L).setListener(new gt(ktVar, b1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        ktVar.f28147t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    kt ktVar2 = this.f25728b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        ht htVar = (ht) obj3;
                                        ArrayList arrayList8 = ktVar2.f28151y;
                                        s4.b1 b1Var3 = htVar.f27046a;
                                        s4.b1 b1Var4 = htVar.f27047b;
                                        if (b1Var3 != null && b1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = b1Var3.f46343a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(b1Var4.f46343a, property, 1.0f));
                                            arrayList8.add(htVar.f27046a);
                                            arrayList8.add(htVar.f27047b);
                                            animatorSet.addListener(new hg.j0(ktVar2, htVar, b1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        ktVar2.f28148u.remove(arrayList7);
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
                this.f28148u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final kt f25728b;

                    {
                        this.f25728b = this;
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
                                    kt ktVar = this.f25728b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        jt jtVar = (jt) obj2;
                                        s4.b1 b1Var2 = jtVar.f27759a;
                                        int i16 = jtVar.f27760b;
                                        int i17 = jtVar.f27761c;
                                        int i18 = jtVar.d;
                                        int i19 = jtVar.e;
                                        View view2 = b1Var2.f46343a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            ktVar.B = i17 - i19;
                                        } else {
                                            ktVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.q2 q2Var3 = ktVar.f28152z;
                                        if (q2Var3 != null) {
                                            if (ktVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = q2Var3.getMeasuredHeight();
                                                int i22 = ktVar.A;
                                                ktVar.B = measuredHeight3 - i22;
                                                ktVar.f28152z.setTopClip(i22);
                                                ktVar.f28152z.setBottomClip(ktVar.B);
                                            } else if (ktVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = q2Var3.getMeasuredHeight() - ktVar.B;
                                                ktVar.A = measuredHeight4;
                                                ktVar.f28152z.setTopClip(measuredHeight4);
                                                ktVar.f28152z.setBottomClip(ktVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ktVar.f28149w.add(b1Var2);
                                        animate2.setDuration(180L).setListener(new gt(ktVar, b1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        ktVar.f28147t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    kt ktVar2 = this.f25728b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        ht htVar = (ht) obj3;
                                        ArrayList arrayList8 = ktVar2.f28151y;
                                        s4.b1 b1Var3 = htVar.f27046a;
                                        s4.b1 b1Var4 = htVar.f27047b;
                                        if (b1Var3 != null && b1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = b1Var3.f46343a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(b1Var4.f46343a, property, 1.0f));
                                            arrayList8.add(htVar.f27046a);
                                            arrayList8.add(htVar.f27047b);
                                            animatorSet.addListener(new hg.j0(ktVar2, htVar, b1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        ktVar2.f28148u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f28146s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.b1 b1Var2 = (s4.b1) obj2;
                    View view2 = b1Var2.f46343a;
                    this.v.add(b1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ft(this, b1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.b1 b1Var) {
        E(b1Var);
        View view = b1Var.f46343a;
        if (!(view instanceof org.telegram.ui.Cells.q2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f28143p;
        arrayList.add(b1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.b1) arrayList.get(i10)).f46343a.setAlpha(0.0f);
                if (((s4.b1) arrayList.get(i10)).f46343a instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) ((s4.b1) arrayList.get(i10)).f46343a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.b1 b1Var, s4.b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            E(b1Var);
            E(b1Var2);
            View view2 = b1Var2.f46343a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f27046a = b1Var;
            obj.f27047b = b1Var2;
            obj.f27048c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f27049f = i13;
            this.f28145r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        View view = b1Var.f46343a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = b1Var.f46343a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(b1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(b1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view2).setMoving(true);
        } else if (view2 instanceof hg.l) {
            ((hg.l) view2).f11990a = true;
        }
        ?? obj = new Object();
        obj.f27759a = b1Var;
        obj.f27760b = translationX;
        obj.f27761c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f28144q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.b1 b1Var, b2.u0 u0Var) {
        E(b1Var);
        this.f28142o.add(b1Var);
        org.telegram.ui.Cells.q2 q2Var = null;
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.C;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.q2)) {
                q2Var = (org.telegram.ui.Cells.q2) childAt;
            }
            i10++;
        }
        if (b1Var.f46343a == q2Var) {
            this.f28152z = q2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.b1) arrayList.get(size)).f46343a.animate().cancel();
        }
    }
}
