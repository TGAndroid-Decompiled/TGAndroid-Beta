package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class xs extends f2.o1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final rl0 C;
    public final ArrayList f30699o = new ArrayList();
    public final ArrayList f30700p = new ArrayList();
    public final ArrayList f30701q = new ArrayList();
    public final ArrayList f30702r = new ArrayList();
    public final ArrayList f30703s = new ArrayList();
    public final ArrayList f30704t = new ArrayList();
    public final ArrayList f30705u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f30706w = new ArrayList();
    public final ArrayList f30707x = new ArrayList();
    public final ArrayList f30708y = new ArrayList();
    public org.telegram.ui.Cells.q2 f30709z;

    public xs(rl0 rl0Var) {
        this.f5807m = false;
        this.C = rl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f2.l1 l1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vs vsVar = (vs) arrayList.get(size);
            if (C(vsVar, l1Var) && vsVar.f30043a == null && vsVar.f30044b == null) {
                arrayList.remove(vsVar);
            }
        }
    }

    public final boolean C(vs vsVar, f2.l1 l1Var) {
        if (vsVar.f30044b == l1Var) {
            vsVar.f30044b = null;
        } else if (vsVar.f30043a == l1Var) {
            vsVar.f30043a = null;
        } else {
            return false;
        }
        View view = l1Var.f5774a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(l1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f30709z = null;
    }

    public final void E(f2.l1 l1Var) {
        l1Var.f5774a.animate().setInterpolator(D);
        f(l1Var);
    }

    @Override
    public final boolean c(f2.l1 l1Var, List list) {
        return l1Var.f5774a instanceof org.telegram.ui.Cells.w2;
    }

    @Override
    public final void f(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        view.animate().cancel();
        ArrayList arrayList = this.f30701q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ws) arrayList.get(size)).f30346a == l1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(l1Var);
                arrayList.remove(size);
            }
        }
        B(this.f30702r, l1Var);
        if (this.f30699o.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(l1Var);
        }
        if (this.f30700p.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(l1Var);
        }
        ArrayList arrayList2 = this.f30705u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, l1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f30704t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ws) arrayList5.get(size4)).f30346a == l1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(l1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f30703s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(l1Var)) {
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(l1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f30707x.remove(l1Var);
        this.v.remove(l1Var);
        this.f30708y.remove(l1Var);
        this.f30706w.remove(l1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f30701q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ws wsVar = (ws) arrayList.get(size);
            View view = wsVar.f30346a.f5774a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(wsVar.f30346a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f30699o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.l1 l1Var = (f2.l1) arrayList2.get(size2);
            View view2 = l1Var.f5774a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(l1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f30700p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.l1 l1Var2 = (f2.l1) arrayList3.get(size3);
            View view3 = l1Var2.f5774a;
            if (view3 instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(l1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f30702r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            vs vsVar = (vs) arrayList4.get(size4);
            f2.l1 l1Var3 = vsVar.f30043a;
            if (l1Var3 != null) {
                C(vsVar, l1Var3);
            }
            f2.l1 l1Var4 = vsVar.f30044b;
            if (l1Var4 != null) {
                C(vsVar, l1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f30704t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ws wsVar2 = (ws) arrayList6.get(size6);
                View view4 = wsVar2.f30346a.f5774a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(wsVar2.f30346a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f30703s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f2.l1 l1Var5 = (f2.l1) arrayList8.get(size8);
                View view5 = l1Var5.f5774a;
                if (view5 instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(l1Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f30705u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                vs vsVar2 = (vs) arrayList10.get(size10);
                f2.l1 l1Var6 = vsVar2.f30043a;
                if (l1Var6 != null) {
                    C(vsVar2, l1Var6);
                }
                f2.l1 l1Var7 = vsVar2.f30044b;
                if (l1Var7 != null) {
                    C(vsVar2, l1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f30707x);
        z(this.f30706w);
        z(this.v);
        z(this.f30708y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f30700p.isEmpty()) {
            ArrayList arrayList = this.f30702r;
            if (arrayList.isEmpty() && this.f30701q.isEmpty() && arrayList.isEmpty() && this.f30706w.isEmpty() && this.f30707x.isEmpty() && this.v.isEmpty() && this.f30708y.isEmpty() && this.f30704t.isEmpty() && this.f30703s.isEmpty() && this.f30705u.isEmpty()) {
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
        ArrayList arrayList2 = this.f30699o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f30701q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f30702r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f30700p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                f2.l1 l1Var = (f2.l1) obj;
                View view = l1Var.f5774a;
                this.f30707x.add(l1Var);
                if (view instanceof org.telegram.ui.Cells.q2) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    org.telegram.ui.Cells.q2 q2Var2 = this.f30709z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == q2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = q2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f30709z.setTopClip(i12);
                            this.f30709z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = q2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f30709z.setTopClip(measuredHeight2);
                            this.f30709z.setBottomClip(this.B);
                        }
                        q2Var.setElevation(-1.0f);
                        q2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(q2Var, n6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ss(this, l1Var, q2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(q2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ss(this, l1Var, q2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ts(this, l1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f30704t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final xs f28578b;

                    {
                        this.f28578b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j10 = 180;
                        ArrayList arrayList7 = arrayList6;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList7.size();
                                int i14 = 0;
                                while (true) {
                                    xs xsVar = this.f28578b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        ws wsVar = (ws) obj2;
                                        f2.l1 l1Var2 = wsVar.f30346a;
                                        int i15 = wsVar.f30347b;
                                        int i16 = wsVar.f30348c;
                                        int i17 = wsVar.d;
                                        int i18 = wsVar.e;
                                        View view2 = l1Var2.f5774a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            xsVar.B = i16 - i18;
                                        } else {
                                            xsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.q2 q2Var3 = xsVar.f30709z;
                                        if (q2Var3 != null) {
                                            if (xsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = q2Var3.getMeasuredHeight();
                                                int i21 = xsVar.A;
                                                xsVar.B = measuredHeight3 - i21;
                                                xsVar.f30709z.setTopClip(i21);
                                                xsVar.f30709z.setBottomClip(xsVar.B);
                                            } else if (xsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = q2Var3.getMeasuredHeight() - xsVar.B;
                                                xsVar.A = measuredHeight4;
                                                xsVar.f30709z.setTopClip(measuredHeight4);
                                                xsVar.f30709z.setBottomClip(xsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        xsVar.f30706w.add(l1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(xsVar, l1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList7.clear();
                                        xsVar.f30704t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    xs xsVar2 = this.f28578b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        vs vsVar = (vs) obj3;
                                        ArrayList arrayList8 = xsVar2.f30708y;
                                        f2.l1 l1Var3 = vsVar.f30043a;
                                        f2.l1 l1Var4 = vsVar.f30044b;
                                        if (l1Var3 != null && l1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = l1Var3.f5774a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(l1Var4.f5774a, property, 1.0f));
                                            arrayList8.add(vsVar.f30043a);
                                            arrayList8.add(vsVar.f30044b);
                                            animatorSet.addListener(new us(xsVar2, vsVar, l1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList7.clear();
                                        xsVar2.f30705u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f30705u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final xs f28578b;

                    {
                        this.f28578b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = r3;
                        long j10 = 180;
                        ArrayList arrayList72 = arrayList7;
                        switch (i13) {
                            case 0:
                                int size2 = arrayList72.size();
                                int i14 = 0;
                                while (true) {
                                    xs xsVar = this.f28578b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        ws wsVar = (ws) obj2;
                                        f2.l1 l1Var2 = wsVar.f30346a;
                                        int i15 = wsVar.f30347b;
                                        int i16 = wsVar.f30348c;
                                        int i17 = wsVar.d;
                                        int i18 = wsVar.e;
                                        View view2 = l1Var2.f5774a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            xsVar.B = i16 - i18;
                                        } else {
                                            xsVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.q2 q2Var3 = xsVar.f30709z;
                                        if (q2Var3 != null) {
                                            if (xsVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = q2Var3.getMeasuredHeight();
                                                int i21 = xsVar.A;
                                                xsVar.B = measuredHeight3 - i21;
                                                xsVar.f30709z.setTopClip(i21);
                                                xsVar.f30709z.setBottomClip(xsVar.B);
                                            } else if (xsVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = q2Var3.getMeasuredHeight() - xsVar.B;
                                                xsVar.A = measuredHeight4;
                                                xsVar.f30709z.setTopClip(measuredHeight4);
                                                xsVar.f30709z.setBottomClip(xsVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        xsVar.f30706w.add(l1Var2);
                                        animate2.setDuration(180L).setListener(new f2.h(xsVar, l1Var2, i19, view2, i20, animate2, 1)).start();
                                    } else {
                                        arrayList72.clear();
                                        xsVar.f30704t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    xs xsVar2 = this.f28578b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        vs vsVar = (vs) obj3;
                                        ArrayList arrayList8 = xsVar2.f30708y;
                                        f2.l1 l1Var3 = vsVar.f30043a;
                                        f2.l1 l1Var4 = vsVar.f30044b;
                                        if (l1Var3 != null && l1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j10);
                                            View view3 = l1Var3.f5774a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(l1Var4.f5774a, property, 1.0f));
                                            arrayList8.add(vsVar.f30043a);
                                            arrayList8.add(vsVar.f30044b);
                                            animatorSet.addListener(new us(xsVar2, vsVar, l1Var3, animatorSet, 0));
                                            animatorSet.start();
                                        }
                                        j10 = 180;
                                    } else {
                                        arrayList72.clear();
                                        xsVar2.f30705u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f30703s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    f2.l1 l1Var2 = (f2.l1) obj2;
                    View view2 = l1Var2.f5774a;
                    this.v.add(l1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ts(this, l1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(f2.l1 l1Var) {
        E(l1Var);
        View view = l1Var.f5774a;
        if (!(view instanceof org.telegram.ui.Cells.q2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f30700p;
        arrayList.add(l1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.l1) arrayList.get(i10)).f5774a.setAlpha(0.0f);
                if (((f2.l1) arrayList.get(i10)).f5774a instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) ((f2.l1) arrayList.get(i10)).f5774a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f2.l1 l1Var, f2.l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            E(l1Var);
            E(l1Var2);
            View view2 = l1Var2.f5774a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f30043a = l1Var;
            obj.f30044b = l1Var2;
            obj.f30045c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f30046f = i13;
            this.f30702r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.f5774a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = l1Var.f5774a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
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
        } else if (view2 instanceof tf.j) {
            ((tf.j) view2).f44816a = true;
        }
        ?? obj = new Object();
        obj.f30346a = l1Var;
        obj.f30347b = translationX;
        obj.f30348c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f30701q.add(obj);
        return true;
    }

    @Override
    public final void s(f2.l1 l1Var, c5.e eVar) {
        E(l1Var);
        this.f30699o.add(l1Var);
        org.telegram.ui.Cells.q2 q2Var = null;
        int i10 = 0;
        while (true) {
            rl0 rl0Var = this.C;
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.q2)) {
                q2Var = (org.telegram.ui.Cells.q2) childAt;
            }
            i10++;
        }
        if (l1Var.f5774a == q2Var) {
            this.f30709z = q2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.l1) arrayList.get(size)).f5774a.animate().cancel();
        }
    }
}
