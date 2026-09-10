package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class gt extends s4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final vl0 C;
    public final ArrayList f23421o = new ArrayList();
    public final ArrayList f23422p = new ArrayList();
    public final ArrayList f23423q = new ArrayList();
    public final ArrayList f23424r = new ArrayList();
    public final ArrayList f23425s = new ArrayList();
    public final ArrayList f23426t = new ArrayList();
    public final ArrayList f23427u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f23428w = new ArrayList();
    public final ArrayList f23429x = new ArrayList();
    public final ArrayList f23430y = new ArrayList();
    public org.telegram.ui.Cells.r2 f23431z;

    public gt(vl0 vl0Var) {
        this.f41645m = false;
        this.C = vl0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            et etVar = (et) arrayList.get(size);
            if (C(etVar, c1Var) && etVar.f22752a == null && etVar.f22753b == null) {
                arrayList.remove(etVar);
            }
        }
    }

    public final boolean C(et etVar, s4.c1 c1Var) {
        if (etVar.f22753b == c1Var) {
            etVar.f22753b = null;
        } else if (etVar.f22752a == c1Var) {
            etVar.f22752a = null;
        } else {
            return false;
        }
        View view = c1Var.f41610a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f23431z = null;
    }

    public final void E(s4.c1 c1Var) {
        c1Var.f41610a.animate().setInterpolator(D);
        f(c1Var);
    }

    @Override
    public final boolean c(s4.c1 c1Var, List list) {
        return c1Var.f41610a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        view.animate().cancel();
        ArrayList arrayList = this.f23423q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ft) arrayList.get(size)).f23078a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        B(this.f23424r, c1Var);
        if (this.f23421o.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(c1Var);
        }
        if (this.f23422p.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(c1Var);
        }
        ArrayList arrayList2 = this.f23427u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f23426t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ft) arrayList5.get(size4)).f23078a == c1Var) {
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
        ArrayList arrayList6 = this.f23425s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f23429x.remove(c1Var);
        this.v.remove(c1Var);
        this.f23430y.remove(c1Var);
        this.f23428w.remove(c1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f23423q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ft ftVar = (ft) arrayList.get(size);
            View view = ftVar.f23078a.f41610a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ftVar.f23078a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f23421o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size2);
            View view2 = c1Var.f41610a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(c1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f23422p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.c1 c1Var2 = (s4.c1) arrayList3.get(size3);
            View view3 = c1Var2.f41610a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(c1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f23424r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            et etVar = (et) arrayList4.get(size4);
            s4.c1 c1Var3 = etVar.f22752a;
            if (c1Var3 != null) {
                C(etVar, c1Var3);
            }
            s4.c1 c1Var4 = etVar.f22753b;
            if (c1Var4 != null) {
                C(etVar, c1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f23426t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ft ftVar2 = (ft) arrayList6.get(size6);
                View view4 = ftVar2.f23078a.f41610a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(ftVar2.f23078a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f23425s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.c1 c1Var5 = (s4.c1) arrayList8.get(size8);
                View view5 = c1Var5.f41610a;
                if (view5 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f23427u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                et etVar2 = (et) arrayList10.get(size10);
                s4.c1 c1Var6 = etVar2.f22752a;
                if (c1Var6 != null) {
                    C(etVar2, c1Var6);
                }
                s4.c1 c1Var7 = etVar2.f22753b;
                if (c1Var7 != null) {
                    C(etVar2, c1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f23429x);
        z(this.f23428w);
        z(this.v);
        z(this.f23430y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f23422p.isEmpty()) {
            ArrayList arrayList = this.f23424r;
            if (arrayList.isEmpty() && this.f23423q.isEmpty() && arrayList.isEmpty() && this.f23428w.isEmpty() && this.f23429x.isEmpty() && this.v.isEmpty() && this.f23430y.isEmpty() && this.f23426t.isEmpty() && this.f23425s.isEmpty() && this.f23427u.isEmpty()) {
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
        ArrayList arrayList2 = this.f23421o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f23423q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f23424r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f23422p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                s4.c1 c1Var = (s4.c1) obj;
                View view = c1Var.f41610a;
                this.f23429x.add(c1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f23431z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f23431z.setTopClip(i12);
                            this.f23431z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f23431z.setTopClip(measuredHeight2);
                            this.f23431z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, r6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new bt(this, c1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new bt(this, c1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new ct(this, c1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f23426t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final gt f21583b;

                    {
                        this.f21583b = this;
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
                                    gt gtVar = this.f21583b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        ft ftVar = (ft) obj2;
                                        s4.c1 c1Var2 = ftVar.f23078a;
                                        int i15 = ftVar.f23079b;
                                        int i16 = ftVar.f23080c;
                                        int i17 = ftVar.d;
                                        int i18 = ftVar.e;
                                        View view2 = c1Var2.f41610a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            gtVar.B = i16 - i18;
                                        } else {
                                            gtVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = gtVar.f23431z;
                                        if (r2Var3 != null) {
                                            if (gtVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = gtVar.A;
                                                gtVar.B = measuredHeight3 - i21;
                                                gtVar.f23431z.setTopClip(i21);
                                                gtVar.f23431z.setBottomClip(gtVar.B);
                                            } else if (gtVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - gtVar.B;
                                                gtVar.A = measuredHeight4;
                                                gtVar.f23431z.setTopClip(measuredHeight4);
                                                gtVar.f23431z.setBottomClip(gtVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        gtVar.f23428w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new dt(gtVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        gtVar.f23426t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    gt gtVar2 = this.f21583b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        et etVar = (et) obj3;
                                        ArrayList arrayList8 = gtVar2.f23430y;
                                        s4.c1 c1Var3 = etVar.f22752a;
                                        s4.c1 c1Var4 = etVar.f22753b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f41610a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f41610a, property, 1.0f));
                                            arrayList8.add(etVar.f22752a);
                                            arrayList8.add(etVar.f22753b);
                                            animatorSet.addListener(new fg.k0(gtVar2, etVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        gtVar2.f23427u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f23427u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final gt f21583b;

                    {
                        this.f21583b = this;
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
                                    gt gtVar = this.f21583b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        ft ftVar = (ft) obj2;
                                        s4.c1 c1Var2 = ftVar.f23078a;
                                        int i15 = ftVar.f23079b;
                                        int i16 = ftVar.f23080c;
                                        int i17 = ftVar.d;
                                        int i18 = ftVar.e;
                                        View view2 = c1Var2.f41610a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            gtVar.B = i16 - i18;
                                        } else {
                                            gtVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = gtVar.f23431z;
                                        if (r2Var3 != null) {
                                            if (gtVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = gtVar.A;
                                                gtVar.B = measuredHeight3 - i21;
                                                gtVar.f23431z.setTopClip(i21);
                                                gtVar.f23431z.setBottomClip(gtVar.B);
                                            } else if (gtVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - gtVar.B;
                                                gtVar.A = measuredHeight4;
                                                gtVar.f23431z.setTopClip(measuredHeight4);
                                                gtVar.f23431z.setBottomClip(gtVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        gtVar.f23428w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new dt(gtVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        gtVar.f23426t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    gt gtVar2 = this.f21583b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        et etVar = (et) obj3;
                                        ArrayList arrayList8 = gtVar2.f23430y;
                                        s4.c1 c1Var3 = etVar.f22752a;
                                        s4.c1 c1Var4 = etVar.f22753b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f41610a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f41610a, property, 1.0f));
                                            arrayList8.add(etVar.f22752a);
                                            arrayList8.add(etVar.f22753b);
                                            animatorSet.addListener(new fg.k0(gtVar2, etVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        gtVar2.f23427u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f23425s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    s4.c1 c1Var2 = (s4.c1) obj2;
                    View view2 = c1Var2.f41610a;
                    this.v.add(c1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new ct(this, c1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.c1 c1Var) {
        E(c1Var);
        View view = c1Var.f41610a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f23422p;
        arrayList.add(c1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.c1) arrayList.get(i10)).f41610a.setAlpha(0.0f);
                if (((s4.c1) arrayList.get(i10)).f41610a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((s4.c1) arrayList.get(i10)).f41610a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.c1 c1Var, s4.c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(c1Var);
            E(c1Var2);
            View view2 = c1Var2.f41610a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f22752a = c1Var;
            obj.f22753b = c1Var2;
            obj.f22754c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f22755f = i13;
            this.f23424r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f41610a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = c1Var.f41610a;
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
        if (view2 instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view2).setMoving(true);
        } else if (view2 instanceof fg.l) {
            ((fg.l) view2).f8100a = true;
        }
        ?? obj = new Object();
        obj.f23078a = c1Var;
        obj.f23079b = translationX;
        obj.f23080c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f23423q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.c1 c1Var, b2.q0 q0Var) {
        E(c1Var);
        this.f23421o.add(c1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.C;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (c1Var.f41610a == r2Var) {
            this.f23431z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.c1) arrayList.get(size)).f41610a.animate().cancel();
        }
    }
}
