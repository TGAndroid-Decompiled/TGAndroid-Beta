package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ts extends v4.g1 {
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final ek0 D;
    public final ArrayList f40001o = new ArrayList();
    public final ArrayList f40002p = new ArrayList();
    public final ArrayList f40003q = new ArrayList();
    public final ArrayList f40004r = new ArrayList();
    public final ArrayList f40005s = new ArrayList();
    public final ArrayList f40006t = new ArrayList();
    public final ArrayList f40007u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f40008w = new ArrayList();
    public final ArrayList f40009x = new ArrayList();
    public final ArrayList f40010y = new ArrayList();
    public org.telegram.ui.Cells.u2 f40011z;

    public ts(ek0 ek0Var) {
        this.f59139m = false;
        this.D = ek0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rs rsVar = (rs) arrayList.get(size);
            if (C(rsVar, e1Var) && rsVar.f39286a == null && rsVar.f39287b == null) {
                arrayList.remove(rsVar);
            }
        }
    }

    public final boolean C(rs rsVar, v4.e1 e1Var) {
        if (rsVar.f39287b == e1Var) {
            rsVar.f39287b = null;
        } else if (rsVar.f39286a == e1Var) {
            rsVar.f39286a = null;
        } else {
            return false;
        }
        View view = e1Var.f59111a;
        View view2 = e1Var.f59111a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f40011z = null;
        this.A = false;
    }

    public final void E(v4.e1 e1Var) {
        e1Var.f59111a.animate().setInterpolator(E);
        f(e1Var);
    }

    @Override
    public final boolean c(v4.e1 e1Var, List list) {
        return e1Var.f59111a instanceof org.telegram.ui.Cells.a3;
    }

    @Override
    public final void f(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        view.animate().cancel();
        ArrayList arrayList = this.f40003q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ss) arrayList.get(size)).f39632a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        B(this.f40004r, e1Var);
        if (this.f40001o.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(e1Var);
        }
        if (this.f40002p.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(e1Var);
        }
        ArrayList arrayList2 = this.f40007u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, e1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f40006t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ss) arrayList5.get(size4)).f39632a == e1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(e1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f40005s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e1Var)) {
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f40009x.remove(e1Var);
        this.v.remove(e1Var);
        this.f40010y.remove(e1Var);
        this.f40008w.remove(e1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f40003q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ss ssVar = (ss) arrayList.get(size);
            View view = ssVar.f39632a.f59111a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ssVar.f39632a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f40001o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.e1 e1Var = (v4.e1) arrayList2.get(size2);
            View view2 = e1Var.f59111a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(e1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f40002p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.e1 e1Var2 = (v4.e1) arrayList3.get(size3);
            View view3 = e1Var2.f59111a;
            if (view3 instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(e1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f40004r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            rs rsVar = (rs) arrayList4.get(size4);
            v4.e1 e1Var3 = rsVar.f39286a;
            if (e1Var3 != null) {
                C(rsVar, e1Var3);
            }
            v4.e1 e1Var4 = rsVar.f39287b;
            if (e1Var4 != null) {
                C(rsVar, e1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f40006t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ss ssVar2 = (ss) arrayList6.get(size6);
                View view4 = ssVar2.f39632a.f59111a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ssVar2.f39632a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f40005s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.e1 e1Var5 = (v4.e1) arrayList8.get(size8);
                View view5 = e1Var5.f59111a;
                if (view5 instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(e1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f40007u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                rs rsVar2 = (rs) arrayList10.get(size10);
                v4.e1 e1Var6 = rsVar2.f39286a;
                if (e1Var6 != null) {
                    C(rsVar2, e1Var6);
                }
                v4.e1 e1Var7 = rsVar2.f39287b;
                if (e1Var7 != null) {
                    C(rsVar2, e1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f40009x);
        z(this.f40008w);
        z(this.v);
        z(this.f40010y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f40002p.isEmpty()) {
            ArrayList arrayList = this.f40004r;
            if (arrayList.isEmpty() && this.f40003q.isEmpty() && arrayList.isEmpty() && this.f40008w.isEmpty() && this.f40009x.isEmpty() && this.v.isEmpty() && this.f40010y.isEmpty() && this.f40006t.isEmpty() && this.f40005s.isEmpty() && this.f40007u.isEmpty()) {
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
        ArrayList arrayList2 = this.f40001o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f40003q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f40004r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f40002p;
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
            v4.e1 e1Var = (v4.e1) obj;
            View view = e1Var.f59111a;
            this.f40009x.add(e1Var);
            if ((view instanceof org.telegram.ui.Cells.u2) && !this.A) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                org.telegram.ui.Cells.u2 u2Var2 = this.f40011z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = E;
                if (view == u2Var2) {
                    i7 = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = u2Var2.getMeasuredHeight();
                        int i11 = this.B;
                        this.C = measuredHeight - i11;
                        this.f40011z.setTopClip(i11);
                        this.f40011z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = u2Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.f40011z.setTopClip(measuredHeight2);
                        this.f40011z.setBottomClip(this.C);
                    }
                    u2Var.setElevation(-1.0f);
                    u2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(u2Var, r6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new os(this, e1Var, u2Var, 0));
                    duration.start();
                    j10 = j3;
                } else {
                    i7 = size;
                    j10 = j3;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(u2Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new os(this, e1Var, u2Var, 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                j10 = j3;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new ps(this, e1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i7;
            j3 = j10;
        }
        long j11 = j3;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.f40006t.add(arrayList6);
            arrayList3.clear();
            new Runnable(this) {
                public final ts f37929b;

                {
                    this.f37929b = this;
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
                                ts tsVar = this.f37929b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList7.get(i13);
                                    i13++;
                                    ss ssVar = (ss) obj2;
                                    v4.e1 e1Var2 = ssVar.f39632a;
                                    int i14 = ssVar.f39633b;
                                    int i15 = ssVar.f39634c;
                                    int i16 = ssVar.d;
                                    int i17 = ssVar.f39635e;
                                    View view2 = e1Var2.f59111a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        tsVar.C = i15 - i17;
                                    } else {
                                        tsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.f40011z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i20;
                                            tsVar.f40011z.setTopClip(i20);
                                            tsVar.f40011z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.f40011z.setTopClip(measuredHeight4);
                                            tsVar.f40011z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.f40008w.add(e1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, e1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList7.clear();
                                    tsVar.f40006t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i21 = 0;
                            while (true) {
                                ts tsVar2 = this.f37929b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList7.get(i21);
                                    i21++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.f40010y;
                                    v4.e1 e1Var3 = rsVar.f39286a;
                                    v4.e1 e1Var4 = rsVar.f39287b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = e1Var3.f59111a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f59111a, property, 1.0f));
                                        arrayList8.add(rsVar.f39286a);
                                        arrayList8.add(rsVar.f39287b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, e1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList7.clear();
                                    tsVar2.f40007u.remove(arrayList7);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.f40007u.add(arrayList7);
            arrayList4.clear();
            new Runnable(this) {
                public final ts f37929b;

                {
                    this.f37929b = this;
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
                                ts tsVar = this.f37929b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList72.get(i13);
                                    i13++;
                                    ss ssVar = (ss) obj2;
                                    v4.e1 e1Var2 = ssVar.f39632a;
                                    int i14 = ssVar.f39633b;
                                    int i15 = ssVar.f39634c;
                                    int i16 = ssVar.d;
                                    int i17 = ssVar.f39635e;
                                    View view2 = e1Var2.f59111a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        tsVar.C = i15 - i17;
                                    } else {
                                        tsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.f40011z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i20;
                                            tsVar.f40011z.setTopClip(i20);
                                            tsVar.f40011z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.f40011z.setTopClip(measuredHeight4);
                                            tsVar.f40011z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.f40008w.add(e1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, e1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList72.clear();
                                    tsVar.f40006t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i21 = 0;
                            while (true) {
                                ts tsVar2 = this.f37929b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList72.get(i21);
                                    i21++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.f40010y;
                                    v4.e1 e1Var3 = rsVar.f39286a;
                                    v4.e1 e1Var4 = rsVar.f39287b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = e1Var3.f59111a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f59111a, property, 1.0f));
                                        arrayList8.add(rsVar.f39286a);
                                        arrayList8.add(rsVar.f39287b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, e1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList72.clear();
                                    tsVar2.f40007u.remove(arrayList72);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = this.f40005s;
            arrayList9.add(arrayList8);
            arrayList5.clear();
            int size2 = arrayList8.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList8.get(i12);
                i12++;
                v4.e1 e1Var2 = (v4.e1) obj2;
                View view2 = e1Var2.f59111a;
                this.v.add(e1Var2);
                ViewPropertyAnimator animate2 = view2.animate();
                animate2.alpha(1.0f).setDuration(180L).setStartDelay(j11).setListener(new ps(this, e1Var2, view2, animate2)).start();
            }
            arrayList8.clear();
            arrayList9.remove(arrayList8);
        }
        this.A = false;
    }

    @Override
    public final void p(v4.e1 e1Var) {
        E(e1Var);
        View view = e1Var.f59111a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f40002p;
        arrayList.add(e1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.e1) arrayList.get(i7)).f59111a.setAlpha(0.0f);
                if (((v4.e1) arrayList.get(i7)).f59111a instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) ((v4.e1) arrayList.get(i7)).f59111a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.e1 e1Var, v4.e1 e1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.u2) {
            E(e1Var);
            E(e1Var2);
            View view2 = e1Var2.f59111a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f39286a = e1Var;
            obj.f39287b = e1Var2;
            obj.f39288c = i7;
            obj.d = i10;
            obj.f39289e = i11;
            obj.f39290f = i12;
            this.f40004r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.f59111a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = e1Var.f59111a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(e1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(e1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        if (view2 instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view2).setMoving(true);
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).f17555a = true;
        }
        ?? obj = new Object();
        obj.f39632a = e1Var;
        obj.f39633b = translationX;
        obj.f39634c = translationY;
        obj.d = i11;
        obj.f39635e = i12;
        this.f40003q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.e1 e1Var, e2.r0 r0Var) {
        E(e1Var);
        this.f40001o.add(e1Var);
        if (!this.A) {
            org.telegram.ui.Cells.u2 u2Var = null;
            int i7 = 0;
            while (true) {
                ek0 ek0Var = this.D;
                if (i7 >= ek0Var.getChildCount()) {
                    break;
                }
                View childAt = ek0Var.getChildAt(i7);
                if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.u2)) {
                    u2Var = (org.telegram.ui.Cells.u2) childAt;
                }
                i7++;
            }
            if (e1Var.f59111a == u2Var) {
                this.f40011z = u2Var;
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.e1) arrayList.get(size)).f59111a.animate().cancel();
        }
    }
}
