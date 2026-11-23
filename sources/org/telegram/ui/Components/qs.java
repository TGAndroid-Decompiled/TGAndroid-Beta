package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
public abstract class qs extends v4.h1 {
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final ek0 D;
    public final ArrayList f38984o = new ArrayList();
    public final ArrayList f38985p = new ArrayList();
    public final ArrayList f38986q = new ArrayList();
    public final ArrayList f38987r = new ArrayList();
    public final ArrayList f38988s = new ArrayList();
    public final ArrayList f38989t = new ArrayList();
    public final ArrayList f38990u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f38991w = new ArrayList();
    public final ArrayList f38992x = new ArrayList();
    public final ArrayList f38993y = new ArrayList();
    public org.telegram.ui.Cells.u2 f38994z;

    public qs(ek0 ek0Var) {
        this.f59274m = false;
        this.D = ek0Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, v4.f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            os osVar = (os) arrayList.get(size);
            if (C(osVar, f1Var) && osVar.f38260a == null && osVar.f38261b == null) {
                arrayList.remove(osVar);
            }
        }
    }

    public final boolean C(os osVar, v4.f1 f1Var) {
        if (osVar.f38261b == f1Var) {
            osVar.f38261b = null;
        } else if (osVar.f38260a == f1Var) {
            osVar.f38260a = null;
        } else {
            return false;
        }
        View view = f1Var.f59245a;
        View view2 = f1Var.f59245a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(f1Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f38994z = null;
        this.A = false;
    }

    public final void E(v4.f1 f1Var) {
        f1Var.f59245a.animate().setInterpolator(E);
        f(f1Var);
    }

    @Override
    public final boolean c(v4.f1 f1Var, List list) {
        return f1Var.f59245a instanceof org.telegram.ui.Cells.a3;
    }

    @Override
    public final void f(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        view.animate().cancel();
        ArrayList arrayList = this.f38986q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((ps) arrayList.get(size)).f38567a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f1Var);
                arrayList.remove(size);
            }
        }
        B(this.f38987r, f1Var);
        if (this.f38984o.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(f1Var);
        }
        if (this.f38985p.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(f1Var);
        }
        ArrayList arrayList2 = this.f38990u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, f1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f38989t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((ps) arrayList5.get(size4)).f38567a == f1Var) {
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
        ArrayList arrayList6 = this.f38988s;
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
        this.f38992x.remove(f1Var);
        this.v.remove(f1Var);
        this.f38993y.remove(f1Var);
        this.f38991w.remove(f1Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.f38986q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ps psVar = (ps) arrayList.get(size);
            View view = psVar.f38567a.f59245a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(psVar.f38567a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f38984o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.f1 f1Var = (v4.f1) arrayList2.get(size2);
            View view2 = f1Var.f59245a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(f1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f38985p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.f1 f1Var2 = (v4.f1) arrayList3.get(size3);
            View view3 = f1Var2.f59245a;
            if (view3 instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(f1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f38987r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            os osVar = (os) arrayList4.get(size4);
            v4.f1 f1Var3 = osVar.f38260a;
            if (f1Var3 != null) {
                C(osVar, f1Var3);
            }
            v4.f1 f1Var4 = osVar.f38261b;
            if (f1Var4 != null) {
                C(osVar, f1Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f38989t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ps psVar2 = (ps) arrayList6.get(size6);
                View view4 = psVar2.f38567a.f59245a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(psVar2.f38567a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f38988s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                v4.f1 f1Var5 = (v4.f1) arrayList8.get(size8);
                View view5 = f1Var5.f59245a;
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
        ArrayList arrayList9 = this.f38990u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                os osVar2 = (os) arrayList10.get(size10);
                v4.f1 f1Var6 = osVar2.f38260a;
                if (f1Var6 != null) {
                    C(osVar2, f1Var6);
                }
                v4.f1 f1Var7 = osVar2.f38261b;
                if (f1Var7 != null) {
                    C(osVar2, f1Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.f38992x);
        z(this.f38991w);
        z(this.v);
        z(this.f38993y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f38985p.isEmpty()) {
            ArrayList arrayList = this.f38987r;
            if (arrayList.isEmpty() && this.f38986q.isEmpty() && arrayList.isEmpty() && this.f38991w.isEmpty() && this.f38992x.isEmpty() && this.v.isEmpty() && this.f38993y.isEmpty() && this.f38989t.isEmpty() && this.f38988s.isEmpty() && this.f38990u.isEmpty()) {
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
        ArrayList arrayList2 = this.f38984o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f38986q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f38987r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f38985p;
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
            View view = f1Var.f59245a;
            this.f38992x.add(f1Var);
            if ((view instanceof org.telegram.ui.Cells.u2) && !this.A) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                org.telegram.ui.Cells.u2 u2Var2 = this.f38994z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = E;
                if (view == u2Var2) {
                    i7 = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = u2Var2.getMeasuredHeight();
                        int i11 = this.B;
                        this.C = measuredHeight - i11;
                        this.f38994z.setTopClip(i11);
                        this.f38994z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = u2Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.f38994z.setTopClip(measuredHeight2);
                        this.f38994z.setBottomClip(this.C);
                    }
                    u2Var.setElevation(-1.0f);
                    u2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(u2Var, q6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new ls(this, f1Var, u2Var, 0));
                    duration.start();
                    j10 = j3;
                } else {
                    i7 = size;
                    j10 = j3;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(u2Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new ls(this, f1Var, u2Var, 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                j10 = j3;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new ms(this, f1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i7;
            j3 = j10;
        }
        long j11 = j3;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.f38989t.add(arrayList6);
            arrayList3.clear();
            new Runnable(this) {
                public final qs f36872b;

                {
                    this.f36872b = this;
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
                                qs qsVar = this.f36872b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList7.get(i13);
                                    i13++;
                                    ps psVar = (ps) obj2;
                                    v4.f1 f1Var2 = psVar.f38567a;
                                    int i14 = psVar.f38568b;
                                    int i15 = psVar.f38569c;
                                    int i16 = psVar.d;
                                    int i17 = psVar.f38570e;
                                    View view2 = f1Var2.f59245a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        qsVar.C = i15 - i17;
                                    } else {
                                        qsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = qsVar.f38994z;
                                    if (u2Var3 != null) {
                                        if (qsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = qsVar.B;
                                            qsVar.C = measuredHeight3 - i20;
                                            qsVar.f38994z.setTopClip(i20);
                                            qsVar.f38994z.setBottomClip(qsVar.C);
                                        } else if (qsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - qsVar.C;
                                            qsVar.B = measuredHeight4;
                                            qsVar.f38994z.setTopClip(measuredHeight4);
                                            qsVar.f38994z.setBottomClip(qsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    qsVar.f38991w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new ns(qsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList7.clear();
                                    qsVar.f38989t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i21 = 0;
                            while (true) {
                                qs qsVar2 = this.f36872b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList7.get(i21);
                                    i21++;
                                    os osVar = (os) obj3;
                                    ArrayList arrayList8 = qsVar2.f38993y;
                                    v4.f1 f1Var3 = osVar.f38260a;
                                    v4.f1 f1Var4 = osVar.f38261b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59245a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59245a, property, 1.0f));
                                        arrayList8.add(osVar.f38260a);
                                        arrayList8.add(osVar.f38261b);
                                        animatorSet.addListener(new jg.j0(qsVar2, osVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList7.clear();
                                    qsVar2.f38990u.remove(arrayList7);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.f38990u.add(arrayList7);
            arrayList4.clear();
            new Runnable(this) {
                public final qs f36872b;

                {
                    this.f36872b = this;
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
                                qs qsVar = this.f36872b;
                                if (i13 < size2) {
                                    Object obj2 = arrayList72.get(i13);
                                    i13++;
                                    ps psVar = (ps) obj2;
                                    v4.f1 f1Var2 = psVar.f38567a;
                                    int i14 = psVar.f38568b;
                                    int i15 = psVar.f38569c;
                                    int i16 = psVar.d;
                                    int i17 = psVar.f38570e;
                                    View view2 = f1Var2.f59245a;
                                    int i18 = i16 - i14;
                                    int i19 = i17 - i15;
                                    if (i18 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i19 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i15 > i17) {
                                        qsVar.C = i15 - i17;
                                    } else {
                                        qsVar.B = i19;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = qsVar.f38994z;
                                    if (u2Var3 != null) {
                                        if (qsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i20 = qsVar.B;
                                            qsVar.C = measuredHeight3 - i20;
                                            qsVar.f38994z.setTopClip(i20);
                                            qsVar.f38994z.setBottomClip(qsVar.C);
                                        } else if (qsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - qsVar.C;
                                            qsVar.B = measuredHeight4;
                                            qsVar.f38994z.setTopClip(measuredHeight4);
                                            qsVar.f38994z.setBottomClip(qsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    qsVar.f38991w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new ns(qsVar, f1Var2, i18, view2, i19, animate2, 0)).start();
                                } else {
                                    arrayList72.clear();
                                    qsVar.f38989t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i21 = 0;
                            while (true) {
                                qs qsVar2 = this.f36872b;
                                if (i21 < size3) {
                                    Object obj3 = arrayList72.get(i21);
                                    i21++;
                                    os osVar = (os) obj3;
                                    ArrayList arrayList8 = qsVar2.f38993y;
                                    v4.f1 f1Var3 = osVar.f38260a;
                                    v4.f1 f1Var4 = osVar.f38261b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.f59245a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f1Var4.f59245a, property, 1.0f));
                                        arrayList8.add(osVar.f38260a);
                                        arrayList8.add(osVar.f38261b);
                                        animatorSet.addListener(new jg.j0(qsVar2, osVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                } else {
                                    arrayList72.clear();
                                    qsVar2.f38990u.remove(arrayList72);
                                    return;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = this.f38988s;
            arrayList9.add(arrayList8);
            arrayList5.clear();
            int size2 = arrayList8.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList8.get(i12);
                i12++;
                v4.f1 f1Var2 = (v4.f1) obj2;
                View view2 = f1Var2.f59245a;
                this.v.add(f1Var2);
                ViewPropertyAnimator animate2 = view2.animate();
                animate2.alpha(1.0f).setDuration(180L).setStartDelay(j11).setListener(new ms(this, f1Var2, view2, animate2)).start();
            }
            arrayList8.clear();
            arrayList9.remove(arrayList8);
        }
        this.A = false;
    }

    @Override
    public final void p(v4.f1 f1Var) {
        E(f1Var);
        View view = f1Var.f59245a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.f38985p;
        arrayList.add(f1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.f1) arrayList.get(i7)).f59245a.setAlpha(0.0f);
                if (((v4.f1) arrayList.get(i7)).f59245a instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) ((v4.f1) arrayList.get(i7)).f59245a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(v4.f1 f1Var, v4.f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.u2) {
            E(f1Var);
            E(f1Var2);
            View view2 = f1Var2.f59245a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.f38260a = f1Var;
            obj.f38261b = f1Var2;
            obj.f38262c = i7;
            obj.d = i10;
            obj.f38263e = i11;
            obj.f38264f = i12;
            this.f38987r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59245a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = f1Var.f59245a;
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
            ((jg.l) view2).f17657a = true;
        }
        ?? obj = new Object();
        obj.f38567a = f1Var;
        obj.f38568b = translationX;
        obj.f38569c = translationY;
        obj.d = i11;
        obj.f38570e = i12;
        this.f38986q.add(obj);
        return true;
    }

    @Override
    public final void s(v4.f1 f1Var, e2.r0 r0Var) {
        E(f1Var);
        this.f38984o.add(f1Var);
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
            if (f1Var.f59245a == u2Var) {
                this.f38994z = u2Var;
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.f1) arrayList.get(size)).f59245a.animate().cancel();
        }
    }
}
