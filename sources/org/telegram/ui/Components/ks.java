package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class ks extends v4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final uj0 C;
    public final ArrayList f36583o = new ArrayList();
    public final ArrayList f36584p = new ArrayList();
    public final ArrayList f36585q = new ArrayList();
    public final ArrayList f36586r = new ArrayList();
    public final ArrayList f36587s = new ArrayList();
    public final ArrayList f36588t = new ArrayList();
    public final ArrayList f36589u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f36590w = new ArrayList();
    public final ArrayList f36591x = new ArrayList();
    public final ArrayList f36592y = new ArrayList();
    public org.telegram.ui.Cells.t2 f36593z;

    public ks(uj0 uj0Var) {
        this.f58564m = false;
        this.C = uj0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            is isVar = (is) arrayList.get(size);
            if (C(isVar, e1Var) && isVar.f35697a == null && isVar.f35698b == null) {
                arrayList.remove(isVar);
            }
        }
    }

    public final boolean C(is isVar, v4.e1 e1Var) {
        if (isVar.f35698b == e1Var) {
            isVar.f35698b = null;
        } else if (isVar.f35697a == e1Var) {
            isVar.f35697a = null;
        } else {
            return false;
        }
        View view = e1Var.f58535a;
        View view2 = e1Var.f58535a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f36593z = null;
    }

    public final void E(v4.e1 e1Var) {
        e1Var.f58535a.animate().setInterpolator(D);
        f(e1Var);
    }

    @Override
    public final boolean c(v4.e1 e1Var, List list) {
        return e1Var.f58535a instanceof org.telegram.ui.Cells.z2;
    }

    @Override
    public final void f(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        view.animate().cancel();
        ArrayList arrayList = this.f36585q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((js) arrayList.get(size)).f36157a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        B(this.f36586r, e1Var);
        if (this.f36583o.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(e1Var);
        }
        if (this.f36584p.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(e1Var);
        }
        ArrayList arrayList2 = this.f36589u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, e1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f36588t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((js) arrayList5.get(size4)).f36157a == e1Var) {
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
        ArrayList arrayList6 = this.f36587s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e1Var)) {
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f36591x.remove(e1Var);
        this.v.remove(e1Var);
        this.f36592y.remove(e1Var);
        this.f36590w.remove(e1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f36585q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            js jsVar = (js) arrayList.get(size);
            View view = jsVar.f36157a.f58535a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jsVar.f36157a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f36583o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.e1 e1Var = (v4.e1) arrayList2.get(size2);
            View view2 = e1Var.f58535a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(e1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f36584p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.e1 e1Var2 = (v4.e1) arrayList3.get(size3);
            View view3 = e1Var2.f58535a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(e1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f36586r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            is isVar = (is) arrayList4.get(size4);
            v4.e1 e1Var3 = isVar.f35697a;
            if (e1Var3 != null) {
                C(isVar, e1Var3);
            }
            v4.e1 e1Var4 = isVar.f35698b;
            if (e1Var4 != null) {
                C(isVar, e1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f36588t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                js jsVar2 = (js) arrayList6.get(size6);
                View view4 = jsVar2.f36157a.f58535a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(jsVar2.f36157a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f36587s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.e1 e1Var5 = (v4.e1) arrayList8.get(size8);
                View view5 = e1Var5.f58535a;
                if (view5 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view5).setClipProgress(0.0f);
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
        ArrayList arrayList9 = this.f36589u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                is isVar2 = (is) arrayList10.get(size10);
                v4.e1 e1Var6 = isVar2.f35697a;
                if (e1Var6 != null) {
                    C(isVar2, e1Var6);
                }
                v4.e1 e1Var7 = isVar2.f35698b;
                if (e1Var7 != null) {
                    C(isVar2, e1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f36591x);
        z(this.f36590w);
        z(this.v);
        z(this.f36592y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f36584p.isEmpty()) {
            ArrayList arrayList = this.f36586r;
            if (arrayList.isEmpty() && this.f36585q.isEmpty() && arrayList.isEmpty() && this.f36590w.isEmpty() && this.f36591x.isEmpty() && this.v.isEmpty() && this.f36592y.isEmpty() && this.f36588t.isEmpty() && this.f36587s.isEmpty() && this.f36589u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        int i7;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f36583o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f36585q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f36586r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f36584p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                v4.e1 e1Var = (v4.e1) obj;
                View view = e1Var.f58535a;
                this.f36591x.add(e1Var);
                if (view instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    org.telegram.ui.Cells.t2 t2Var2 = this.f36593z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == t2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = t2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f36593z.setTopClip(i12);
                            this.f36593z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = t2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f36593z.setTopClip(measuredHeight2);
                            this.f36593z.setBottomClip(this.B);
                        }
                        t2Var.setElevation(-1.0f);
                        t2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(t2Var, k6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new fs(this, e1Var, t2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new fs(this, e1Var, t2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new gs(this, e1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f36588t.add(arrayList6);
                arrayList3.clear();
                i7 = 0;
                new Runnable(this) {
                    public final ks f34430b;

                    {
                        this.f34430b = this;
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
                                    ks ksVar = this.f34430b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        js jsVar = (js) obj2;
                                        v4.e1 e1Var2 = jsVar.f36157a;
                                        int i15 = jsVar.f36158b;
                                        int i16 = jsVar.f36159c;
                                        int i17 = jsVar.d;
                                        int i18 = jsVar.f36160e;
                                        View view2 = e1Var2.f58535a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ksVar.B = i16 - i18;
                                        } else {
                                            ksVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = ksVar.f36593z;
                                        if (t2Var3 != null) {
                                            if (ksVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = ksVar.A;
                                                ksVar.B = measuredHeight3 - i21;
                                                ksVar.f36593z.setTopClip(i21);
                                                ksVar.f36593z.setBottomClip(ksVar.B);
                                            } else if (ksVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - ksVar.B;
                                                ksVar.A = measuredHeight4;
                                                ksVar.f36593z.setTopClip(measuredHeight4);
                                                ksVar.f36593z.setBottomClip(ksVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ksVar.f36590w.add(e1Var2);
                                        animate2.setDuration(180L).setListener(new hs(ksVar, e1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        ksVar.f36588t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    ks ksVar2 = this.f34430b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        is isVar = (is) obj3;
                                        ArrayList arrayList8 = ksVar2.f36592y;
                                        v4.e1 e1Var3 = isVar.f35697a;
                                        v4.e1 e1Var4 = isVar.f35698b;
                                        if (e1Var3 != null && e1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = e1Var3.f58535a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f58535a, property, 1.0f));
                                            arrayList8.add(isVar.f35697a);
                                            arrayList8.add(isVar.f35698b);
                                            animatorSet.addListener(new jg.j0(ksVar2, isVar, e1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        ksVar2.f36589u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            } else {
                i7 = 0;
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f36589u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final ks f34430b;

                    {
                        this.f34430b = this;
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
                                    ks ksVar = this.f34430b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        js jsVar = (js) obj2;
                                        v4.e1 e1Var2 = jsVar.f36157a;
                                        int i15 = jsVar.f36158b;
                                        int i16 = jsVar.f36159c;
                                        int i17 = jsVar.d;
                                        int i18 = jsVar.f36160e;
                                        View view2 = e1Var2.f58535a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            ksVar.B = i16 - i18;
                                        } else {
                                            ksVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.t2 t2Var3 = ksVar.f36593z;
                                        if (t2Var3 != null) {
                                            if (ksVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = t2Var3.getMeasuredHeight();
                                                int i21 = ksVar.A;
                                                ksVar.B = measuredHeight3 - i21;
                                                ksVar.f36593z.setTopClip(i21);
                                                ksVar.f36593z.setBottomClip(ksVar.B);
                                            } else if (ksVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = t2Var3.getMeasuredHeight() - ksVar.B;
                                                ksVar.A = measuredHeight4;
                                                ksVar.f36593z.setTopClip(measuredHeight4);
                                                ksVar.f36593z.setBottomClip(ksVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        ksVar.f36590w.add(e1Var2);
                                        animate2.setDuration(180L).setListener(new hs(ksVar, e1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        ksVar.f36588t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    ks ksVar2 = this.f34430b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        is isVar = (is) obj3;
                                        ArrayList arrayList8 = ksVar2.f36592y;
                                        v4.e1 e1Var3 = isVar.f35697a;
                                        v4.e1 e1Var4 = isVar.f35698b;
                                        if (e1Var3 != null && e1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = e1Var3.f58535a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(e1Var4.f58535a, property, 1.0f));
                                            arrayList8.add(isVar.f35697a);
                                            arrayList8.add(isVar.f35698b);
                                            animatorSet.addListener(new jg.j0(ksVar2, isVar, e1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        ksVar2.f36589u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f36587s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = i7;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    v4.e1 e1Var2 = (v4.e1) obj2;
                    View view2 = e1Var2.f58535a;
                    this.v.add(e1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new gs(this, e1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(v4.e1 e1Var) {
        E(e1Var);
        View view = e1Var.f58535a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f36584p;
        arrayList.add(e1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.e1) arrayList.get(i7)).f58535a.setAlpha(0.0f);
                if (((v4.e1) arrayList.get(i7)).f58535a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((v4.e1) arrayList.get(i7)).f58535a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.e1 e1Var, v4.e1 e1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            E(e1Var);
            E(e1Var2);
            View view2 = e1Var2.f58535a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f35697a = e1Var;
            obj.f35698b = e1Var2;
            obj.f35699c = i7;
            obj.d = i10;
            obj.f35700e = i11;
            obj.f35701f = i12;
            this.f36586r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.f58535a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = e1Var.f58535a;
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
        if (view2 instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view2).setMoving(true);
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).f17178a = true;
        }
        ?? obj = new Object();
        obj.f36157a = e1Var;
        obj.f36158b = translationX;
        obj.f36159c = translationY;
        obj.d = i11;
        obj.f36160e = i12;
        this.f36585q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.e1 e1Var, e2.r0 r0Var) {
        E(e1Var);
        this.f36583o.add(e1Var);
        org.telegram.ui.Cells.t2 t2Var = null;
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.C;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                t2Var = (org.telegram.ui.Cells.t2) childAt;
            }
            i7++;
        }
        if (e1Var.f58535a == t2Var) {
            this.f36593z = t2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.e1) arrayList.get(size)).f58535a.animate().cancel();
        }
    }
}
