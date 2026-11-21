package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ts extends v4.h1 {
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final ek0 D;
    public final ArrayList f40030o = new ArrayList();
    public final ArrayList f40031p = new ArrayList();
    public final ArrayList f40032q = new ArrayList();
    public final ArrayList f40033r = new ArrayList();
    public final ArrayList f40034s = new ArrayList();
    public final ArrayList f40035t = new ArrayList();
    public final ArrayList f40036u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f40037w = new ArrayList();
    public final ArrayList f40038x = new ArrayList();
    public final ArrayList f40039y = new ArrayList();
    public org.telegram.ui.Cells.u2 f40040z;

    public ts(ek0 ek0Var) {
        this.f59190m = false;
        this.D = ek0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rs rsVar = (rs) arrayList.get(size);
            if (C(rsVar, f1Var) && rsVar.f39321a == null && rsVar.f39322b == null) {
                arrayList.remove(rsVar);
            }
        }
    }

    public final boolean C(rs rsVar, v4.f1 f1Var) {
        if (rsVar.f39322b == f1Var) {
            rsVar.f39322b = null;
        } else if (rsVar.f39321a == f1Var) {
            rsVar.f39321a = null;
        } else {
            return false;
        }
        View view = f1Var.f59161a;
        View view2 = f1Var.f59161a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(f1Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f40040z = null;
        this.A = false;
    }

    public final void E(v4.f1 f1Var) {
        f1Var.f59161a.animate().setInterpolator(E);
        f(f1Var);
    }

    @Override
    public final boolean c(v4.f1 f1Var, List list) {
        return f1Var.f59161a instanceof org.telegram.ui.Cells.a3;
    }

    @Override
    public final void f(v4.f1 f1Var) {
        View view = f1Var.f59161a;
        view.animate().cancel();
        ArrayList arrayList = this.f40032q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ss) arrayList.get(size)).f39684a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f1Var);
                arrayList.remove(size);
            }
        }
        B(this.f40033r, f1Var);
        if (this.f40030o.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(f1Var);
        }
        if (this.f40031p.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(f1Var);
        }
        ArrayList arrayList2 = this.f40036u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, f1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f40035t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ss) arrayList5.get(size4)).f39684a == f1Var) {
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
        ArrayList arrayList6 = this.f40034s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f1Var)) {
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(f1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f40038x.remove(f1Var);
        this.v.remove(f1Var);
        this.f40039y.remove(f1Var);
        this.f40037w.remove(f1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f40032q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ss ssVar = (ss) arrayList.get(size);
            View view = ssVar.f39684a.f59161a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ssVar.f39684a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f40030o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.f1 f1Var = (v4.f1) arrayList2.get(size2);
            View view2 = f1Var.f59161a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(f1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f40031p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.f1 f1Var2 = (v4.f1) arrayList3.get(size3);
            View view3 = f1Var2.f59161a;
            if (view3 instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(f1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f40033r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            rs rsVar = (rs) arrayList4.get(size4);
            v4.f1 f1Var3 = rsVar.f39321a;
            if (f1Var3 != null) {
                C(rsVar, f1Var3);
            }
            v4.f1 f1Var4 = rsVar.f39322b;
            if (f1Var4 != null) {
                C(rsVar, f1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f40035t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ss ssVar2 = (ss) arrayList6.get(size6);
                View view4 = ssVar2.f39684a.f59161a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ssVar2.f39684a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f40034s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.f1 f1Var5 = (v4.f1) arrayList8.get(size8);
                View view5 = f1Var5.f59161a;
                if (view5 instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f40036u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                rs rsVar2 = (rs) arrayList10.get(size10);
                v4.f1 f1Var6 = rsVar2.f39321a;
                if (f1Var6 != null) {
                    C(rsVar2, f1Var6);
                }
                v4.f1 f1Var7 = rsVar2.f39322b;
                if (f1Var7 != null) {
                    C(rsVar2, f1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f40038x);
        z(this.f40037w);
        z(this.v);
        z(this.f40039y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f40031p.isEmpty()) {
            ArrayList arrayList = this.f40033r;
            if (arrayList.isEmpty() && this.f40032q.isEmpty() && arrayList.isEmpty() && this.f40037w.isEmpty() && this.f40038x.isEmpty() && this.v.isEmpty() && this.f40039y.isEmpty() && this.f40035t.isEmpty() && this.f40034s.isEmpty() && this.f40036u.isEmpty()) {
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
        ArrayList arrayList2 = this.f40030o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f40032q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f40033r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f40031p;
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
            View view = f1Var.f59161a;
            this.f40038x.add(f1Var);
            if ((view instanceof org.telegram.ui.Cells.u2) && !this.A) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                org.telegram.ui.Cells.u2 u2Var2 = this.f40040z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = E;
                if (view == u2Var2) {
                    i7 = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = u2Var2.getMeasuredHeight();
                        int i11 = this.B;
                        this.C = measuredHeight - i11;
                        this.f40040z.setTopClip(i11);
                        this.f40040z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = u2Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.f40040z.setTopClip(measuredHeight2);
                        this.f40040z.setBottomClip(this.C);
                    }
                    u2Var.setElevation(-1.0f);
                    u2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(u2Var, r6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new os(this, f1Var, u2Var, 0));
                    duration.start();
                    j10 = j3;
                } else {
                    i7 = size;
                    j10 = j3;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(u2Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new os(this, f1Var, u2Var, 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                j10 = j3;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new ps(this, f1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i7;
            j3 = j10;
        }
        long j11 = j3;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.f40035t.add(arrayList6);
            arrayList3.clear();
            new Runnable(this) {
                public final ts f37968b;

                {
                    this.f37968b = this;
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
                                ts tsVar = this.f37968b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList7.get(i13);
                                    i13++;
                                    ss ssVar = (ss) obj2;
                                    v4.f1 f1Var2 = ssVar.f39684a;
                                    int i14 = ssVar.f39685b;
                                    int i15 = ssVar.f39686c;
                                    int i16 = ssVar.d;
                                    int i17 = ssVar.f39687e;
                                    View view2 = f1Var2.f59161a;
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
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.f40040z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i20;
                                            tsVar.f40040z.setTopClip(i20);
                                            tsVar.f40040z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.f40040z.setTopClip(measuredHeight4);
                                            tsVar.f40040z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.f40037w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList7.clear();
                                    tsVar.f40035t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i21 = 0;
                            while (true) {
                                ts tsVar2 = this.f37968b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList7.get(i21);
                                    i21++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.f40039y;
                                    v4.f1 f1Var3 = rsVar.f39321a;
                                    v4.f1 f1Var4 = rsVar.f39322b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59161a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59161a, property, 1.0f));
                                        arrayList8.add(rsVar.f39321a);
                                        arrayList8.add(rsVar.f39322b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList7.clear();
                                    tsVar2.f40036u.remove(arrayList7);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.f40036u.add(arrayList7);
            arrayList4.clear();
            new Runnable(this) {
                public final ts f37968b;

                {
                    this.f37968b = this;
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
                                ts tsVar = this.f37968b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList72.get(i13);
                                    i13++;
                                    ss ssVar = (ss) obj2;
                                    v4.f1 f1Var2 = ssVar.f39684a;
                                    int i14 = ssVar.f39685b;
                                    int i15 = ssVar.f39686c;
                                    int i16 = ssVar.d;
                                    int i17 = ssVar.f39687e;
                                    View view2 = f1Var2.f59161a;
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
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.f40040z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i20;
                                            tsVar.f40040z.setTopClip(i20);
                                            tsVar.f40040z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.f40040z.setTopClip(measuredHeight4);
                                            tsVar.f40040z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.f40037w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList72.clear();
                                    tsVar.f40035t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i21 = 0;
                            while (true) {
                                ts tsVar2 = this.f37968b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList72.get(i21);
                                    i21++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.f40039y;
                                    v4.f1 f1Var3 = rsVar.f39321a;
                                    v4.f1 f1Var4 = rsVar.f39322b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59161a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59161a, property, 1.0f));
                                        arrayList8.add(rsVar.f39321a);
                                        arrayList8.add(rsVar.f39322b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList72.clear();
                                    tsVar2.f40036u.remove(arrayList72);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = this.f40034s;
            arrayList9.add(arrayList8);
            arrayList5.clear();
            int size2 = arrayList8.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList8.get(i12);
                i12++;
                v4.f1 f1Var2 = (v4.f1) obj2;
                View view2 = f1Var2.f59161a;
                this.v.add(f1Var2);
                ViewPropertyAnimator animate2 = view2.animate();
                animate2.alpha(1.0f).setDuration(180L).setStartDelay(j11).setListener(new ps(this, f1Var2, view2, animate2)).start();
            }
            arrayList8.clear();
            arrayList9.remove(arrayList8);
        }
        this.A = false;
    }

    @Override
    public final void p(v4.f1 f1Var) {
        E(f1Var);
        View view = f1Var.f59161a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f40031p;
        arrayList.add(f1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.f1) arrayList.get(i7)).f59161a.setAlpha(0.0f);
                if (((v4.f1) arrayList.get(i7)).f59161a instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) ((v4.f1) arrayList.get(i7)).f59161a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.f1 f1Var, v4.f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59161a;
        if (view instanceof org.telegram.ui.Cells.u2) {
            E(f1Var);
            E(f1Var2);
            View view2 = f1Var2.f59161a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f39321a = f1Var;
            obj.f39322b = f1Var2;
            obj.f39323c = i7;
            obj.d = i10;
            obj.f39324e = i11;
            obj.f39325f = i12;
            this.f40033r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59161a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = f1Var.f59161a;
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
        if (view2 instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view2).setMoving(true);
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).f17586a = true;
        }
        ?? obj = new Object();
        obj.f39684a = f1Var;
        obj.f39685b = translationX;
        obj.f39686c = translationY;
        obj.d = i11;
        obj.f39687e = i12;
        this.f40032q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.f1 f1Var, e2.r0 r0Var) {
        E(f1Var);
        this.f40030o.add(f1Var);
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
            if (f1Var.f59161a == u2Var) {
                this.f40040z = u2Var;
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.f1) arrayList.get(size)).f59161a.animate().cancel();
        }
    }
}
