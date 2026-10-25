package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class mt extends s4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final mm0 C;
    public final ArrayList f30739o = new ArrayList();
    public final ArrayList f30740p = new ArrayList();
    public final ArrayList f30741q = new ArrayList();
    public final ArrayList f30742r = new ArrayList();
    public final ArrayList f30743s = new ArrayList();
    public final ArrayList f30744t = new ArrayList();
    public final ArrayList f30745u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f30746w = new ArrayList();
    public final ArrayList f30747x = new ArrayList();
    public final ArrayList f30748y = new ArrayList();
    public org.telegram.ui.Cells.p2 f30749z;

    public mt(mm0 mm0Var) {
        this.f47760m = false;
        this.C = mm0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kt ktVar = (kt) arrayList.get(size);
            if (C(ktVar, e1Var) && ktVar.f29975a == null && ktVar.f29976b == null) {
                arrayList.remove(ktVar);
            }
        }
    }

    public final boolean C(kt ktVar, s4.e1 e1Var) {
        if (ktVar.f29976b == e1Var) {
            ktVar.f29976b = null;
        } else if (ktVar.f29975a == e1Var) {
            ktVar.f29975a = null;
        } else {
            return false;
        }
        View view = e1Var.f47735a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f30749z = null;
    }

    public final void E(s4.e1 e1Var) {
        e1Var.f47735a.animate().setInterpolator(D);
        f(e1Var);
    }

    @Override
    public final boolean c(s4.e1 e1Var, List list) {
        return e1Var.f47735a instanceof org.telegram.ui.Cells.v2;
    }

    @Override
    public final void f(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        view.animate().cancel();
        ArrayList arrayList = this.f30741q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((lt) arrayList.get(size)).f30285a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        B(this.f30742r, e1Var);
        if (this.f30739o.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(e1Var);
        }
        if (this.f30740p.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(e1Var);
        }
        ArrayList arrayList2 = this.f30745u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, e1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f30744t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((lt) arrayList5.get(size4)).f30285a == e1Var) {
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
        ArrayList arrayList6 = this.f30743s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e1Var)) {
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f30747x.remove(e1Var);
        this.v.remove(e1Var);
        this.f30748y.remove(e1Var);
        this.f30746w.remove(e1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f30741q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lt ltVar = (lt) arrayList.get(size);
            View view = ltVar.f30285a.f47735a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ltVar.f30285a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f30739o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.e1 e1Var = (s4.e1) arrayList2.get(size2);
            View view2 = e1Var.f47735a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(e1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f30740p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.e1 e1Var2 = (s4.e1) arrayList3.get(size3);
            View view3 = e1Var2.f47735a;
            if (view3 instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(e1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f30742r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            kt ktVar = (kt) arrayList4.get(size4);
            s4.e1 e1Var3 = ktVar.f29975a;
            if (e1Var3 != null) {
                C(ktVar, e1Var3);
            }
            s4.e1 e1Var4 = ktVar.f29976b;
            if (e1Var4 != null) {
                C(ktVar, e1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f30744t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                lt ltVar2 = (lt) arrayList6.get(size6);
                View view4 = ltVar2.f30285a.f47735a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ltVar2.f30285a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f30743s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.e1 e1Var5 = (s4.e1) arrayList8.get(size8);
                View view5 = e1Var5.f47735a;
                if (view5 instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f30745u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                kt ktVar2 = (kt) arrayList10.get(size10);
                s4.e1 e1Var6 = ktVar2.f29975a;
                if (e1Var6 != null) {
                    C(ktVar2, e1Var6);
                }
                s4.e1 e1Var7 = ktVar2.f29976b;
                if (e1Var7 != null) {
                    C(ktVar2, e1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f30747x);
        z(this.f30746w);
        z(this.v);
        z(this.f30748y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f30740p.isEmpty()) {
            ArrayList arrayList = this.f30742r;
            if (arrayList.isEmpty() && this.f30741q.isEmpty() && arrayList.isEmpty() && this.f30746w.isEmpty() && this.f30747x.isEmpty() && this.v.isEmpty() && this.f30748y.isEmpty() && this.f30744t.isEmpty() && this.f30743s.isEmpty() && this.f30745u.isEmpty()) {
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
        ArrayList arrayList2 = this.f30739o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f30741q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f30742r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f30740p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.e1 e1Var = (s4.e1) obj;
                View view = e1Var.f47735a;
                this.f30747x.add(e1Var);
                if (view instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    org.telegram.ui.Cells.p2 p2Var2 = this.f30749z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == p2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = p2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f30749z.setTopClip(i13);
                            this.f30749z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = p2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f30749z.setTopClip(measuredHeight2);
                            this.f30749z.setBottomClip(this.B);
                        }
                        p2Var.setElevation(-1.0f);
                        p2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(p2Var, v6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new gt(this, e1Var, p2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(p2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new gt(this, e1Var, p2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ht(this, e1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f30744t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final mt f28310b;

                    {
                        this.f28310b = this;
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
                                    mt mtVar = this.f28310b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        lt ltVar = (lt) obj2;
                                        s4.e1 e1Var2 = ltVar.f30285a;
                                        int i16 = ltVar.f30286b;
                                        int i17 = ltVar.f30287c;
                                        int i18 = ltVar.d;
                                        int i19 = ltVar.e;
                                        View view2 = e1Var2.f47735a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            mtVar.B = i17 - i19;
                                        } else {
                                            mtVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.p2 p2Var3 = mtVar.f30749z;
                                        if (p2Var3 != null) {
                                            if (mtVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = p2Var3.getMeasuredHeight();
                                                int i22 = mtVar.A;
                                                mtVar.B = measuredHeight3 - i22;
                                                mtVar.f30749z.setTopClip(i22);
                                                mtVar.f30749z.setBottomClip(mtVar.B);
                                            } else if (mtVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = p2Var3.getMeasuredHeight() - mtVar.B;
                                                mtVar.A = measuredHeight4;
                                                mtVar.f30749z.setTopClip(measuredHeight4);
                                                mtVar.f30749z.setBottomClip(mtVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        mtVar.f30746w.add(e1Var2);
                                        animate2.setDuration(180L).setListener(new jt(mtVar, e1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        mtVar.f30744t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    mt mtVar2 = this.f28310b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        kt ktVar = (kt) obj3;
                                        ArrayList arrayList8 = mtVar2.f30748y;
                                        s4.e1 e1Var3 = ktVar.f29975a;
                                        s4.e1 e1Var4 = ktVar.f29976b;
                                        if (e1Var3 != null && e1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = e1Var3.f47735a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f47735a, property, 1.0f));
                                            arrayList8.add(ktVar.f29975a);
                                            arrayList8.add(ktVar.f29976b);
                                            animatorSet.addListener(new ig.k0(mtVar2, ktVar, e1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        mtVar2.f30745u.remove(arrayList7);
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
                this.f30745u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final mt f28310b;

                    {
                        this.f28310b = this;
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
                                    mt mtVar = this.f28310b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        lt ltVar = (lt) obj2;
                                        s4.e1 e1Var2 = ltVar.f30285a;
                                        int i16 = ltVar.f30286b;
                                        int i17 = ltVar.f30287c;
                                        int i18 = ltVar.d;
                                        int i19 = ltVar.e;
                                        View view2 = e1Var2.f47735a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            mtVar.B = i17 - i19;
                                        } else {
                                            mtVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.p2 p2Var3 = mtVar.f30749z;
                                        if (p2Var3 != null) {
                                            if (mtVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = p2Var3.getMeasuredHeight();
                                                int i22 = mtVar.A;
                                                mtVar.B = measuredHeight3 - i22;
                                                mtVar.f30749z.setTopClip(i22);
                                                mtVar.f30749z.setBottomClip(mtVar.B);
                                            } else if (mtVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = p2Var3.getMeasuredHeight() - mtVar.B;
                                                mtVar.A = measuredHeight4;
                                                mtVar.f30749z.setTopClip(measuredHeight4);
                                                mtVar.f30749z.setBottomClip(mtVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        mtVar.f30746w.add(e1Var2);
                                        animate2.setDuration(180L).setListener(new jt(mtVar, e1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        mtVar.f30744t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    mt mtVar2 = this.f28310b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        kt ktVar = (kt) obj3;
                                        ArrayList arrayList8 = mtVar2.f30748y;
                                        s4.e1 e1Var3 = ktVar.f29975a;
                                        s4.e1 e1Var4 = ktVar.f29976b;
                                        if (e1Var3 != null && e1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = e1Var3.f47735a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f47735a, property, 1.0f));
                                            arrayList8.add(ktVar.f29975a);
                                            arrayList8.add(ktVar.f29976b);
                                            animatorSet.addListener(new ig.k0(mtVar2, ktVar, e1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        mtVar2.f30745u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f30743s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.e1 e1Var2 = (s4.e1) obj2;
                    View view2 = e1Var2.f47735a;
                    this.v.add(e1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ht(this, e1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.e1 e1Var) {
        E(e1Var);
        View view = e1Var.f47735a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f30740p;
        arrayList.add(e1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.e1) arrayList.get(i10)).f47735a.setAlpha(0.0f);
                if (((s4.e1) arrayList.get(i10)).f47735a instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) ((s4.e1) arrayList.get(i10)).f47735a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.e1 e1Var, s4.e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            E(e1Var);
            E(e1Var2);
            View view2 = e1Var2.f47735a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f29975a = e1Var;
            obj.f29976b = e1Var2;
            obj.f29977c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f29978f = i13;
            this.f30742r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.f47735a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = e1Var.f47735a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view2).setMoving(true);
        } else if (view2 instanceof ig.m) {
            ((ig.m) view2).f14160a = true;
        }
        ?? obj = new Object();
        obj.f30285a = e1Var;
        obj.f30286b = translationX;
        obj.f30287c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f30741q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.e1 e1Var, b2.v0 v0Var) {
        E(e1Var);
        this.f30739o.add(e1Var);
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.C;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.p2)) {
                p2Var = (org.telegram.ui.Cells.p2) childAt;
            }
            i10++;
        }
        if (e1Var.f47735a == p2Var) {
            this.f30749z = p2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.e1) arrayList.get(size)).f47735a.animate().cancel();
        }
    }
}
