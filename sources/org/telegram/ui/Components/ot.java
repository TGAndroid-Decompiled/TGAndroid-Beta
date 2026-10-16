package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ot extends s4.e1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final mm0 C;
    public final ArrayList f27729o = new ArrayList();
    public final ArrayList f27730p = new ArrayList();
    public final ArrayList f27731q = new ArrayList();
    public final ArrayList f27732r = new ArrayList();
    public final ArrayList f27733s = new ArrayList();
    public final ArrayList f27734t = new ArrayList();
    public final ArrayList f27735u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f27736w = new ArrayList();
    public final ArrayList f27737x = new ArrayList();
    public final ArrayList f27738y = new ArrayList();
    public org.telegram.ui.Cells.s2 f27739z;

    public ot(mm0 mm0Var) {
        this.f44872m = false;
        this.C = mm0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.b1 b1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mt mtVar = (mt) arrayList.get(size);
            if (C(mtVar, b1Var) && mtVar.f27198a == null && mtVar.f27199b == null) {
                arrayList.remove(mtVar);
            }
        }
    }

    public final boolean C(mt mtVar, s4.b1 b1Var) {
        if (mtVar.f27199b == b1Var) {
            mtVar.f27199b = null;
        } else if (mtVar.f27198a == b1Var) {
            mtVar.f27198a = null;
        } else {
            return false;
        }
        View view = b1Var.f44838a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(b1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f27739z = null;
    }

    public final void E(s4.b1 b1Var) {
        b1Var.f44838a.animate().setInterpolator(D);
        f(b1Var);
    }

    @Override
    public final boolean c(s4.b1 b1Var, List list) {
        return b1Var.f44838a instanceof org.telegram.ui.Cells.y2;
    }

    @Override
    public final void f(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        view.animate().cancel();
        ArrayList arrayList = this.f27731q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((nt) arrayList.get(size)).f27410a == b1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b1Var);
                arrayList.remove(size);
            }
        }
        B(this.f27732r, b1Var);
        if (this.f27729o.remove(b1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(b1Var);
        }
        if (this.f27730p.remove(b1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(b1Var);
        }
        ArrayList arrayList2 = this.f27735u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, b1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f27734t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((nt) arrayList5.get(size4)).f27410a == b1Var) {
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
        ArrayList arrayList6 = this.f27733s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b1Var)) {
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(b1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f27737x.remove(b1Var);
        this.v.remove(b1Var);
        this.f27738y.remove(b1Var);
        this.f27736w.remove(b1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f27731q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            nt ntVar = (nt) arrayList.get(size);
            View view = ntVar.f27410a.f44838a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ntVar.f27410a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f27729o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.b1 b1Var = (s4.b1) arrayList2.get(size2);
            View view2 = b1Var.f44838a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(b1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f27730p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.b1 b1Var2 = (s4.b1) arrayList3.get(size3);
            View view3 = b1Var2.f44838a;
            if (view3 instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(b1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f27732r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            mt mtVar = (mt) arrayList4.get(size4);
            s4.b1 b1Var3 = mtVar.f27198a;
            if (b1Var3 != null) {
                C(mtVar, b1Var3);
            }
            s4.b1 b1Var4 = mtVar.f27199b;
            if (b1Var4 != null) {
                C(mtVar, b1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f27734t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                nt ntVar2 = (nt) arrayList6.get(size6);
                View view4 = ntVar2.f27410a.f44838a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ntVar2.f27410a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f27733s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.b1 b1Var5 = (s4.b1) arrayList8.get(size8);
                View view5 = b1Var5.f44838a;
                if (view5 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f27735u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                mt mtVar2 = (mt) arrayList10.get(size10);
                s4.b1 b1Var6 = mtVar2.f27198a;
                if (b1Var6 != null) {
                    C(mtVar2, b1Var6);
                }
                s4.b1 b1Var7 = mtVar2.f27199b;
                if (b1Var7 != null) {
                    C(mtVar2, b1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f27737x);
        z(this.f27736w);
        z(this.v);
        z(this.f27738y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f27730p.isEmpty()) {
            ArrayList arrayList = this.f27732r;
            if (arrayList.isEmpty() && this.f27731q.isEmpty() && arrayList.isEmpty() && this.f27736w.isEmpty() && this.f27737x.isEmpty() && this.v.isEmpty() && this.f27738y.isEmpty() && this.f27734t.isEmpty() && this.f27733s.isEmpty() && this.f27735u.isEmpty()) {
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
        ArrayList arrayList2 = this.f27729o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f27731q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f27732r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f27730p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s4.b1 b1Var = (s4.b1) obj;
                View view = b1Var.f44838a;
                this.f27737x.add(b1Var);
                if (view instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    org.telegram.ui.Cells.s2 s2Var2 = this.f27739z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == s2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = s2Var2.getMeasuredHeight();
                            int i13 = this.A;
                            this.B = measuredHeight - i13;
                            this.f27739z.setTopClip(i13);
                            this.f27739z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = s2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f27739z.setTopClip(measuredHeight2);
                            this.f27739z.setBottomClip(this.B);
                        }
                        s2Var.setElevation(-1.0f);
                        s2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(s2Var, v6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new jt(this, b1Var, s2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i11 = size;
                    } else {
                        arrayList = arrayList2;
                        i11 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new jt(this, b1Var, s2Var, 1));
                        duration2.start();
                    }
                } else {
                    i11 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new kt(this, b1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i11;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f27734t.add(arrayList6);
                arrayList3.clear();
                i10 = 0;
                new Runnable(this) {
                    public final ot f25398b;

                    {
                        this.f25398b = this;
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
                                    ot otVar = this.f25398b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList7.get(i15);
                                        i15++;
                                        nt ntVar = (nt) obj2;
                                        s4.b1 b1Var2 = ntVar.f27410a;
                                        int i16 = ntVar.f27411b;
                                        int i17 = ntVar.f27412c;
                                        int i18 = ntVar.d;
                                        int i19 = ntVar.e;
                                        View view2 = b1Var2.f44838a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            otVar.B = i17 - i19;
                                        } else {
                                            otVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = otVar.f27739z;
                                        if (s2Var3 != null) {
                                            if (otVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = otVar.A;
                                                otVar.B = measuredHeight3 - i22;
                                                otVar.f27739z.setTopClip(i22);
                                                otVar.f27739z.setBottomClip(otVar.B);
                                            } else if (otVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - otVar.B;
                                                otVar.A = measuredHeight4;
                                                otVar.f27739z.setTopClip(measuredHeight4);
                                                otVar.f27739z.setBottomClip(otVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        otVar.f27736w.add(b1Var2);
                                        animate2.setDuration(180L).setListener(new lt(otVar, b1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        otVar.f27734t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i23 = 0;
                                while (true) {
                                    ot otVar2 = this.f25398b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList7.get(i23);
                                        i23++;
                                        mt mtVar = (mt) obj3;
                                        ArrayList arrayList8 = otVar2.f27738y;
                                        s4.b1 b1Var3 = mtVar.f27198a;
                                        s4.b1 b1Var4 = mtVar.f27199b;
                                        if (b1Var3 != null && b1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = b1Var3.f44838a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(b1Var4.f44838a, property, 1.0f));
                                            arrayList8.add(mtVar.f27198a);
                                            arrayList8.add(mtVar.f27199b);
                                            animatorSet.addListener(new hg.j0(otVar2, mtVar, b1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        otVar2.f27735u.remove(arrayList7);
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
                this.f27735u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ot f25398b;

                    {
                        this.f25398b = this;
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
                                    ot otVar = this.f25398b;
                                    if (i15 < size2) {
                                        Object obj2 = arrayList72.get(i15);
                                        i15++;
                                        nt ntVar = (nt) obj2;
                                        s4.b1 b1Var2 = ntVar.f27410a;
                                        int i16 = ntVar.f27411b;
                                        int i17 = ntVar.f27412c;
                                        int i18 = ntVar.d;
                                        int i19 = ntVar.e;
                                        View view2 = b1Var2.f44838a;
                                        int i20 = i18 - i16;
                                        int i21 = i19 - i17;
                                        if (i20 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i21 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i17 > i19) {
                                            otVar.B = i17 - i19;
                                        } else {
                                            otVar.A = i21;
                                        }
                                        org.telegram.ui.Cells.s2 s2Var3 = otVar.f27739z;
                                        if (s2Var3 != null) {
                                            if (otVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = s2Var3.getMeasuredHeight();
                                                int i22 = otVar.A;
                                                otVar.B = measuredHeight3 - i22;
                                                otVar.f27739z.setTopClip(i22);
                                                otVar.f27739z.setBottomClip(otVar.B);
                                            } else if (otVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = s2Var3.getMeasuredHeight() - otVar.B;
                                                otVar.A = measuredHeight4;
                                                otVar.f27739z.setTopClip(measuredHeight4);
                                                otVar.f27739z.setBottomClip(otVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        otVar.f27736w.add(b1Var2);
                                        animate2.setDuration(180L).setListener(new lt(otVar, b1Var2, i20, view2, i21, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        otVar.f27734t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i23 = 0;
                                while (true) {
                                    ot otVar2 = this.f25398b;
                                    if (i23 < size3) {
                                        Object obj3 = arrayList72.get(i23);
                                        i23++;
                                        mt mtVar = (mt) obj3;
                                        ArrayList arrayList8 = otVar2.f27738y;
                                        s4.b1 b1Var3 = mtVar.f27198a;
                                        s4.b1 b1Var4 = mtVar.f27199b;
                                        if (b1Var3 != null && b1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = b1Var3.f44838a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(b1Var4.f44838a, property, 1.0f));
                                            arrayList8.add(mtVar.f27198a);
                                            arrayList8.add(mtVar.f27199b);
                                            animatorSet.addListener(new hg.j0(otVar2, mtVar, b1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        otVar2.f27735u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f27733s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i14 = i10;
                while (i14 < size2) {
                    Object obj2 = arrayList8.get(i14);
                    i14++;
                    s4.b1 b1Var2 = (s4.b1) obj2;
                    View view2 = b1Var2.f44838a;
                    this.v.add(b1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new kt(this, b1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.b1 b1Var) {
        E(b1Var);
        View view = b1Var.f44838a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f27730p;
        arrayList.add(b1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.b1) arrayList.get(i10)).f44838a.setAlpha(0.0f);
                if (((s4.b1) arrayList.get(i10)).f44838a instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) ((s4.b1) arrayList.get(i10)).f44838a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.b1 b1Var, s4.b1 b1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.s2) {
            E(b1Var);
            E(b1Var2);
            View view2 = b1Var2.f44838a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f27198a = b1Var;
            obj.f27199b = b1Var2;
            obj.f27200c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f27201f = i13;
            this.f27732r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = b1Var.f44838a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = b1Var.f44838a;
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
        if (view2 instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view2).setMoving(true);
        } else if (view2 instanceof hg.l) {
            ((hg.l) view2).f10658a = true;
        }
        ?? obj = new Object();
        obj.f27410a = b1Var;
        obj.f27411b = translationX;
        obj.f27412c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f27731q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.b1 b1Var, b2.v0 v0Var) {
        E(b1Var);
        this.f27729o.add(b1Var);
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.C;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.s2)) {
                s2Var = (org.telegram.ui.Cells.s2) childAt;
            }
            i10++;
        }
        if (b1Var.f44838a == s2Var) {
            this.f27739z = s2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.b1) arrayList.get(size)).f44838a.animate().cancel();
        }
    }
}
