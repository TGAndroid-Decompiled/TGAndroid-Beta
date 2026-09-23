package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class bt extends s4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final ml0 C;
    public final ArrayList f22835o = new ArrayList();
    public final ArrayList f22836p = new ArrayList();
    public final ArrayList f22837q = new ArrayList();
    public final ArrayList f22838r = new ArrayList();
    public final ArrayList f22839s = new ArrayList();
    public final ArrayList f22840t = new ArrayList();
    public final ArrayList f22841u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f22842w = new ArrayList();
    public final ArrayList f22843x = new ArrayList();
    public final ArrayList f22844y = new ArrayList();
    public org.telegram.ui.Cells.r2 f22845z;

    public bt(ml0 ml0Var) {
        this.f42662m = false;
        this.C = ml0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, s4.c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zs zsVar = (zs) arrayList.get(size);
            if (C(zsVar, c1Var) && zsVar.f30646a == null && zsVar.f30647b == null) {
                arrayList.remove(zsVar);
            }
        }
    }

    public final boolean C(zs zsVar, s4.c1 c1Var) {
        if (zsVar.f30647b == c1Var) {
            zsVar.f30647b = null;
        } else if (zsVar.f30646a == c1Var) {
            zsVar.f30646a = null;
        } else {
            return false;
        }
        View view = c1Var.f42627a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public final void D() {
        this.A = Integer.MAX_VALUE;
        this.B = Integer.MAX_VALUE;
        this.f22845z = null;
    }

    public final void E(s4.c1 c1Var) {
        c1Var.f42627a.animate().setInterpolator(D);
        f(c1Var);
    }

    @Override
    public final boolean c(s4.c1 c1Var, List list) {
        return c1Var.f42627a instanceof org.telegram.ui.Cells.x2;
    }

    @Override
    public final void f(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        view.animate().cancel();
        ArrayList arrayList = this.f22837q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((at) arrayList.get(size)).f22499a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        B(this.f22838r, c1Var);
        if (this.f22835o.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(c1Var);
        }
        if (this.f22836p.remove(c1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(c1Var);
        }
        ArrayList arrayList2 = this.f22841u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f22840t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((at) arrayList5.get(size4)).f22499a == c1Var) {
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
        ArrayList arrayList6 = this.f22839s;
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
        this.f22843x.remove(c1Var);
        this.v.remove(c1Var);
        this.f22844y.remove(c1Var);
        this.f22842w.remove(c1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f22837q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            at atVar = (at) arrayList.get(size);
            View view = atVar.f22499a.f42627a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(atVar.f22499a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f22835o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size2);
            View view2 = c1Var.f42627a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(c1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f22836p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.c1 c1Var2 = (s4.c1) arrayList3.get(size3);
            View view3 = c1Var2.f42627a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(c1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f22838r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            zs zsVar = (zs) arrayList4.get(size4);
            s4.c1 c1Var3 = zsVar.f30646a;
            if (c1Var3 != null) {
                C(zsVar, c1Var3);
            }
            s4.c1 c1Var4 = zsVar.f30647b;
            if (c1Var4 != null) {
                C(zsVar, c1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f22840t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                at atVar2 = (at) arrayList6.get(size6);
                View view4 = atVar2.f22499a.f42627a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(atVar2.f22499a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f22839s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s4.c1 c1Var5 = (s4.c1) arrayList8.get(size8);
                View view5 = c1Var5.f42627a;
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
        ArrayList arrayList9 = this.f22841u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                zs zsVar2 = (zs) arrayList10.get(size10);
                s4.c1 c1Var6 = zsVar2.f30646a;
                if (c1Var6 != null) {
                    C(zsVar2, c1Var6);
                }
                s4.c1 c1Var7 = zsVar2.f30647b;
                if (c1Var7 != null) {
                    C(zsVar2, c1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f22843x);
        z(this.f22842w);
        z(this.v);
        z(this.f22844y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f22836p.isEmpty()) {
            ArrayList arrayList = this.f22838r;
            if (arrayList.isEmpty() && this.f22837q.isEmpty() && arrayList.isEmpty() && this.f22842w.isEmpty() && this.f22843x.isEmpty() && this.v.isEmpty() && this.f22844y.isEmpty() && this.f22840t.isEmpty() && this.f22839s.isEmpty() && this.f22841u.isEmpty()) {
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
        ArrayList arrayList2 = this.f22835o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f22837q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f22838r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f22836p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                s4.c1 c1Var = (s4.c1) obj;
                View view = c1Var.f42627a;
                this.f22843x.add(c1Var);
                if (view instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    org.telegram.ui.Cells.r2 r2Var2 = this.f22845z;
                    DecelerateInterpolator decelerateInterpolator = D;
                    if (view == r2Var2) {
                        if (this.A != Integer.MAX_VALUE) {
                            int measuredHeight = r2Var2.getMeasuredHeight();
                            int i12 = this.A;
                            this.B = measuredHeight - i12;
                            this.f22845z.setTopClip(i12);
                            this.f22845z.setBottomClip(this.B);
                        } else if (this.B != Integer.MAX_VALUE) {
                            int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                            this.A = measuredHeight2;
                            this.f22845z.setTopClip(measuredHeight2);
                            this.f22845z.setBottomClip(this.B);
                        }
                        r2Var.setElevation(-1.0f);
                        r2Var.setOutlineProvider(null);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, s6.h, 1.0f).setDuration(180L);
                        duration.setInterpolator(decelerateInterpolator);
                        duration.addListener(new ws(this, c1Var, r2Var, 0));
                        duration.start();
                        arrayList = arrayList2;
                        i10 = size;
                    } else {
                        arrayList = arrayList2;
                        i10 = size;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, View.ALPHA, 1.0f).setDuration(180L);
                        duration2.setInterpolator(decelerateInterpolator);
                        duration2.addListener(new ws(this, c1Var, r2Var, 1));
                        duration2.start();
                    }
                } else {
                    i10 = size;
                    arrayList = arrayList2;
                    ViewPropertyAnimator animate = view.animate();
                    animate.setDuration(180L).alpha(0.0f).setListener(new xs(this, c1Var, animate, view)).start();
                }
                arrayList2 = arrayList;
                size = i10;
            }
            arrayList2.clear();
            if (!isEmpty2) {
                final ArrayList arrayList6 = new ArrayList(arrayList3);
                this.f22840t.add(arrayList6);
                arrayList3.clear();
                new Runnable(this) {
                    public final bt f29384b;

                    {
                        this.f29384b = this;
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
                                    bt btVar = this.f29384b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList7.get(i14);
                                        i14++;
                                        at atVar = (at) obj2;
                                        s4.c1 c1Var2 = atVar.f22499a;
                                        int i15 = atVar.f22500b;
                                        int i16 = atVar.f22501c;
                                        int i17 = atVar.d;
                                        int i18 = atVar.e;
                                        View view2 = c1Var2.f42627a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            btVar.B = i16 - i18;
                                        } else {
                                            btVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = btVar.f22845z;
                                        if (r2Var3 != null) {
                                            if (btVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = btVar.A;
                                                btVar.B = measuredHeight3 - i21;
                                                btVar.f22845z.setTopClip(i21);
                                                btVar.f22845z.setBottomClip(btVar.B);
                                            } else if (btVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - btVar.B;
                                                btVar.A = measuredHeight4;
                                                btVar.f22845z.setTopClip(measuredHeight4);
                                                btVar.f22845z.setBottomClip(btVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        btVar.f22842w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ys(btVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList7.clear();
                                        btVar.f22840t.remove(arrayList7);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (true) {
                                    bt btVar2 = this.f29384b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList7.get(i22);
                                        i22++;
                                        zs zsVar = (zs) obj3;
                                        ArrayList arrayList8 = btVar2.f22844y;
                                        s4.c1 c1Var3 = zsVar.f30646a;
                                        s4.c1 c1Var4 = zsVar.f30647b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f42627a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f42627a, property, 1.0f));
                                            arrayList8.add(zsVar.f30646a);
                                            arrayList8.add(zsVar.f30647b);
                                            animatorSet.addListener(new gg.k0(btVar2, zsVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList7.clear();
                                        btVar2.f22841u.remove(arrayList7);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty3) {
                final ArrayList arrayList7 = new ArrayList(arrayList4);
                this.f22841u.add(arrayList7);
                arrayList4.clear();
                new Runnable(this) {
                    public final bt f29384b;

                    {
                        this.f29384b = this;
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
                                    bt btVar = this.f29384b;
                                    if (i14 < size2) {
                                        Object obj2 = arrayList72.get(i14);
                                        i14++;
                                        at atVar = (at) obj2;
                                        s4.c1 c1Var2 = atVar.f22499a;
                                        int i15 = atVar.f22500b;
                                        int i16 = atVar.f22501c;
                                        int i17 = atVar.d;
                                        int i18 = atVar.e;
                                        View view2 = c1Var2.f42627a;
                                        int i19 = i17 - i15;
                                        int i20 = i18 - i16;
                                        if (i19 != 0) {
                                            view2.animate().translationX(0.0f);
                                        }
                                        if (i20 != 0) {
                                            view2.animate().translationY(0.0f);
                                        }
                                        if (i16 > i18) {
                                            btVar.B = i16 - i18;
                                        } else {
                                            btVar.A = i20;
                                        }
                                        org.telegram.ui.Cells.r2 r2Var3 = btVar.f22845z;
                                        if (r2Var3 != null) {
                                            if (btVar.A != Integer.MAX_VALUE) {
                                                int measuredHeight3 = r2Var3.getMeasuredHeight();
                                                int i21 = btVar.A;
                                                btVar.B = measuredHeight3 - i21;
                                                btVar.f22845z.setTopClip(i21);
                                                btVar.f22845z.setBottomClip(btVar.B);
                                            } else if (btVar.B != Integer.MAX_VALUE) {
                                                int measuredHeight4 = r2Var3.getMeasuredHeight() - btVar.B;
                                                btVar.A = measuredHeight4;
                                                btVar.f22845z.setTopClip(measuredHeight4);
                                                btVar.f22845z.setBottomClip(btVar.B);
                                            }
                                        }
                                        ViewPropertyAnimator animate2 = view2.animate();
                                        btVar.f22842w.add(c1Var2);
                                        animate2.setDuration(180L).setListener(new ys(btVar, c1Var2, i19, view2, i20, animate2, 0)).start();
                                    } else {
                                        arrayList72.clear();
                                        btVar.f22840t.remove(arrayList72);
                                        return;
                                    }
                                }
                            default:
                                int size3 = arrayList72.size();
                                int i22 = 0;
                                while (true) {
                                    bt btVar2 = this.f29384b;
                                    if (i22 < size3) {
                                        Object obj3 = arrayList72.get(i22);
                                        i22++;
                                        zs zsVar = (zs) obj3;
                                        ArrayList arrayList8 = btVar2.f22844y;
                                        s4.c1 c1Var3 = zsVar.f30646a;
                                        s4.c1 c1Var4 = zsVar.f30647b;
                                        if (c1Var3 != null && c1Var4 != null) {
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.setDuration(j3);
                                            View view3 = c1Var3.f42627a;
                                            Property property = View.ALPHA;
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(c1Var4.f42627a, property, 1.0f));
                                            arrayList8.add(zsVar.f30646a);
                                            arrayList8.add(zsVar.f30647b);
                                            animatorSet.addListener(new gg.k0(btVar2, zsVar, c1Var3, animatorSet));
                                            animatorSet.start();
                                        }
                                        j3 = 180;
                                    } else {
                                        arrayList72.clear();
                                        btVar2.f22841u.remove(arrayList72);
                                        return;
                                    }
                                }
                        }
                    }
                }.run();
            }
            if (!isEmpty4) {
                ArrayList arrayList8 = new ArrayList(arrayList5);
                ArrayList arrayList9 = this.f22839s;
                arrayList9.add(arrayList8);
                arrayList5.clear();
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    s4.c1 c1Var2 = (s4.c1) obj2;
                    View view2 = c1Var2.f42627a;
                    this.v.add(c1Var2);
                    ViewPropertyAnimator animate2 = view2.animate();
                    animate2.alpha(1.0f).setDuration(180L).setListener(new xs(this, c1Var2, view2, animate2)).start();
                }
                arrayList8.clear();
                arrayList9.remove(arrayList8);
            }
        }
    }

    @Override
    public final void p(s4.c1 c1Var) {
        E(c1Var);
        View view = c1Var.f42627a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f22836p;
        arrayList.add(c1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.c1) arrayList.get(i10)).f42627a.setAlpha(0.0f);
                if (((s4.c1) arrayList.get(i10)).f42627a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((s4.c1) arrayList.get(i10)).f42627a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(s4.c1 c1Var, s4.c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            E(c1Var);
            E(c1Var2);
            View view2 = c1Var2.f42627a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f30646a = c1Var;
            obj.f30647b = c1Var2;
            obj.f30648c = i10;
            obj.d = i11;
            obj.e = i12;
            obj.f30649f = i13;
            this.f22838r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f42627a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = c1Var.f42627a;
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
        } else if (view2 instanceof gg.l) {
            ((gg.l) view2).f9830a = true;
        }
        ?? obj = new Object();
        obj.f22499a = c1Var;
        obj.f22500b = translationX;
        obj.f22501c = translationY;
        obj.d = i12;
        obj.e = i13;
        this.f22837q.add(obj);
        return true;
    }

    @Override
    public final void s(s4.c1 c1Var, b2.q0 q0Var) {
        E(c1Var);
        this.f22835o.add(c1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            ml0 ml0Var = this.C;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (c1Var.f42627a == r2Var) {
            this.f22845z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.c1) arrayList.get(size)).f42627a.animate().cancel();
        }
    }
}
