package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class rs extends v4.h1 {
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final ck0 D;
    public final ArrayList f39281o = new ArrayList();
    public final ArrayList f39282p = new ArrayList();
    public final ArrayList f39283q = new ArrayList();
    public final ArrayList f39284r = new ArrayList();
    public final ArrayList f39285s = new ArrayList();
    public final ArrayList f39286t = new ArrayList();
    public final ArrayList f39287u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f39288w = new ArrayList();
    public final ArrayList f39289x = new ArrayList();
    public final ArrayList f39290y = new ArrayList();
    public org.telegram.ui.Cells.t2 f39291z;

    public rs(ck0 ck0Var) {
        this.f59151m = false;
        this.D = ck0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ps psVar = (ps) arrayList.get(size);
            if (C(psVar, f1Var) && psVar.f38538a == null && psVar.f38539b == null) {
                arrayList.remove(psVar);
            }
        }
    }

    public final boolean C(ps psVar, v4.f1 f1Var) {
        if (psVar.f38539b == f1Var) {
            psVar.f38539b = null;
        } else if (psVar.f38538a == f1Var) {
            psVar.f38538a = null;
        } else {
            return false;
        }
        View view = f1Var.f59122a;
        View view2 = f1Var.f59122a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(f1Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f39291z = null;
        this.A = false;
    }

    public final void E(v4.f1 f1Var) {
        f1Var.f59122a.animate().setInterpolator(E);
        f(f1Var);
    }

    @Override
    public final boolean c(v4.f1 f1Var, List list) {
        return f1Var.f59122a instanceof org.telegram.ui.Cells.z2;
    }

    @Override
    public final void f(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        view.animate().cancel();
        ArrayList arrayList = this.f39283q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((qs) arrayList.get(size)).f38888a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f1Var);
                arrayList.remove(size);
            }
        }
        B(this.f39284r, f1Var);
        if (this.f39281o.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(f1Var);
        }
        if (this.f39282p.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(f1Var);
        }
        ArrayList arrayList2 = this.f39287u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, f1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f39286t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((qs) arrayList5.get(size4)).f38888a == f1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(f1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f39285s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f1Var)) {
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(f1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f39289x.remove(f1Var);
        this.v.remove(f1Var);
        this.f39290y.remove(f1Var);
        this.f39288w.remove(f1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f39283q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qs qsVar = (qs) arrayList.get(size);
            View view = qsVar.f38888a.f59122a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(qsVar.f38888a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f39281o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.f1 f1Var = (v4.f1) arrayList2.get(size2);
            View view2 = f1Var.f59122a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(f1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f39282p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.f1 f1Var2 = (v4.f1) arrayList3.get(size3);
            View view3 = f1Var2.f59122a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(f1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f39284r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ps psVar = (ps) arrayList4.get(size4);
            v4.f1 f1Var3 = psVar.f38538a;
            if (f1Var3 != null) {
                C(psVar, f1Var3);
            }
            v4.f1 f1Var4 = psVar.f38539b;
            if (f1Var4 != null) {
                C(psVar, f1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f39286t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                qs qsVar2 = (qs) arrayList6.get(size6);
                View view4 = qsVar2.f38888a.f59122a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(qsVar2.f38888a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f39285s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.f1 f1Var5 = (v4.f1) arrayList8.get(size8);
                View view5 = f1Var5.f59122a;
                if (view5 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(f1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f39287u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ps psVar2 = (ps) arrayList10.get(size10);
                v4.f1 f1Var6 = psVar2.f38538a;
                if (f1Var6 != null) {
                    C(psVar2, f1Var6);
                }
                v4.f1 f1Var7 = psVar2.f38539b;
                if (f1Var7 != null) {
                    C(psVar2, f1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f39289x);
        z(this.f39288w);
        z(this.v);
        z(this.f39290y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f39282p.isEmpty()) {
            ArrayList arrayList = this.f39284r;
            if (arrayList.isEmpty() && this.f39283q.isEmpty() && arrayList.isEmpty() && this.f39288w.isEmpty() && this.f39289x.isEmpty() && this.v.isEmpty() && this.f39290y.isEmpty() && this.f39286t.isEmpty() && this.f39285s.isEmpty() && this.f39287u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        long j3;
        ArrayList arrayList;
        int i7;
        long j10;
        ArrayList arrayList2 = this.f39281o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f39283q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f39284r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f39282p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        if (this.A && !isEmpty) {
            j3 = 180;
        } else {
            j3 = 0;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            v4.f1 f1Var = (v4.f1) obj;
            View view = f1Var.f59122a;
            this.f39289x.add(f1Var);
            if ((view instanceof org.telegram.ui.Cells.t2) && !this.A) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                org.telegram.ui.Cells.t2 t2Var2 = this.f39291z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = E;
                if (view == t2Var2) {
                    i7 = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = t2Var2.getMeasuredHeight();
                        int i11 = this.B;
                        this.C = measuredHeight - i11;
                        this.f39291z.setTopClip(i11);
                        this.f39291z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = t2Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.f39291z.setTopClip(measuredHeight2);
                        this.f39291z.setBottomClip(this.C);
                    }
                    t2Var.setElevation(-1.0f);
                    t2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(t2Var, q6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new ms(this, f1Var, t2Var, 0));
                    duration.start();
                    j10 = j3;
                } else {
                    i7 = size;
                    j10 = j3;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new ms(this, f1Var, t2Var, 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                j10 = j3;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new ns(this, f1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i7;
            j3 = j10;
        }
        long j11 = j3;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.f39286t.add(arrayList6);
            arrayList3.clear();
            new Runnable(this) {
                public final rs f37220b;

                {
                    this.f37220b = this;
                }

                @Override
                public final void run() {
                    int i12 = r3;
                    long j12 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i12) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i13 = 0;
                            while (true) {
                                rs rsVar = this.f37220b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList7.get(i13);
                                    i13++;
                                    qs qsVar = (qs) obj2;
                                    v4.f1 f1Var2 = qsVar.f38888a;
                                    int i14 = qsVar.f38889b;
                                    int i15 = qsVar.f38890c;
                                    int i16 = qsVar.d;
                                    int i17 = qsVar.f38891e;
                                    View view2 = f1Var2.f59122a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        rsVar.C = i15 - i17;
                                    } else {
                                        rsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = rsVar.f39291z;
                                    if (t2Var3 != null) {
                                        if (rsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i20 = rsVar.B;
                                            rsVar.C = measuredHeight3 - i20;
                                            rsVar.f39291z.setTopClip(i20);
                                            rsVar.f39291z.setBottomClip(rsVar.C);
                                        } else if (rsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - rsVar.C;
                                            rsVar.B = measuredHeight4;
                                            rsVar.f39291z.setTopClip(measuredHeight4);
                                            rsVar.f39291z.setBottomClip(rsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    rsVar.f39288w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new os(rsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList7.clear();
                                    rsVar.f39286t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i21 = 0;
                            while (true) {
                                rs rsVar2 = this.f37220b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList7.get(i21);
                                    i21++;
                                    ps psVar = (ps) obj3;
                                    ArrayList arrayList8 = rsVar2.f39290y;
                                    v4.f1 f1Var3 = psVar.f38538a;
                                    v4.f1 f1Var4 = psVar.f38539b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59122a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59122a, property, 1.0f));
                                        arrayList8.add(psVar.f38538a);
                                        arrayList8.add(psVar.f38539b);
                                        animatorSet.addListener(new jg.j0(rsVar2, psVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList7.clear();
                                    rsVar2.f39287u.remove(arrayList7);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.f39287u.add(arrayList7);
            arrayList4.clear();
            new Runnable(this) {
                public final rs f37220b;

                {
                    this.f37220b = this;
                }

                @Override
                public final void run() {
                    int i12 = r3;
                    long j12 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i12) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i13 = 0;
                            while (true) {
                                rs rsVar = this.f37220b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList72.get(i13);
                                    i13++;
                                    qs qsVar = (qs) obj2;
                                    v4.f1 f1Var2 = qsVar.f38888a;
                                    int i14 = qsVar.f38889b;
                                    int i15 = qsVar.f38890c;
                                    int i16 = qsVar.d;
                                    int i17 = qsVar.f38891e;
                                    View view2 = f1Var2.f59122a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        rsVar.C = i15 - i17;
                                    } else {
                                        rsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = rsVar.f39291z;
                                    if (t2Var3 != null) {
                                        if (rsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i20 = rsVar.B;
                                            rsVar.C = measuredHeight3 - i20;
                                            rsVar.f39291z.setTopClip(i20);
                                            rsVar.f39291z.setBottomClip(rsVar.C);
                                        } else if (rsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - rsVar.C;
                                            rsVar.B = measuredHeight4;
                                            rsVar.f39291z.setTopClip(measuredHeight4);
                                            rsVar.f39291z.setBottomClip(rsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    rsVar.f39288w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new os(rsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList72.clear();
                                    rsVar.f39286t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i21 = 0;
                            while (true) {
                                rs rsVar2 = this.f37220b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList72.get(i21);
                                    i21++;
                                    ps psVar = (ps) obj3;
                                    ArrayList arrayList8 = rsVar2.f39290y;
                                    v4.f1 f1Var3 = psVar.f38538a;
                                    v4.f1 f1Var4 = psVar.f38539b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59122a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59122a, property, 1.0f));
                                        arrayList8.add(psVar.f38538a);
                                        arrayList8.add(psVar.f38539b);
                                        animatorSet.addListener(new jg.j0(rsVar2, psVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList72.clear();
                                    rsVar2.f39287u.remove(arrayList72);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = this.f39285s;
            arrayList9.add(arrayList8);
            arrayList5.clear();
            int size2 = arrayList8.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList8.get(i12);
                i12++;
                v4.f1 f1Var2 = (v4.f1) obj2;
                View view2 = f1Var2.f59122a;
                this.v.add(f1Var2);
                ViewPropertyAnimator animate2 = view2.animate();
                animate2.alpha(1.0f).setDuration(180L).setStartDelay(j11).setListener(new ns(this, f1Var2, view2, animate2)).start();
            }
            arrayList8.clear();
            arrayList9.remove(arrayList8);
        }
        this.A = false;
    }

    @Override
    public final void p(v4.f1 f1Var) {
        E(f1Var);
        View view = f1Var.f59122a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f39282p;
        arrayList.add(f1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.f1) arrayList.get(i7)).f59122a.setAlpha(0.0f);
                if (((v4.f1) arrayList.get(i7)).f59122a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((v4.f1) arrayList.get(i7)).f59122a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.f1 f1Var, v4.f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            E(f1Var);
            E(f1Var2);
            View view2 = f1Var2.f59122a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f38538a = f1Var;
            obj.f38539b = f1Var2;
            obj.f38540c = i7;
            obj.d = i10;
            obj.f38541e = i11;
            obj.f38542f = i12;
            this.f39284r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59122a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = f1Var.f59122a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(f1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(f1Var);
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
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).f17564a = true;
        }
        ?? obj = new Object();
        obj.f38888a = f1Var;
        obj.f38889b = translationX;
        obj.f38890c = translationY;
        obj.d = i11;
        obj.f38891e = i12;
        this.f39283q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.f1 f1Var, e2.r0 r0Var) {
        E(f1Var);
        this.f39281o.add(f1Var);
        if (!this.A) {
            org.telegram.ui.Cells.t2 t2Var = null;
            int i7 = 0;
            while (true) {
                ck0 ck0Var = this.D;
                if (i7 >= ck0Var.getChildCount()) {
                    break;
                }
                View childAt = ck0Var.getChildAt(i7);
                if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                    t2Var = (org.telegram.ui.Cells.t2) childAt;
                }
                i7++;
            }
            if (f1Var.f59122a == t2Var) {
                this.f39291z = t2Var;
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.f1) arrayList.get(size)).f59122a.animate().cancel();
        }
    }
}
