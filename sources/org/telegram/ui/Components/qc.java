package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class qc {
    public static qc f27643w;
    public int f27644a;
    public int f27645b;
    public eb f27646c;
    public o1.k d;
    public final ub e;
    public final ib f27647f;
    public final org.telegram.ui.ActionBar.m2 f27648g;
    public final FrameLayout h;
    public final Runnable f27649i;
    public int f27650j;
    public boolean f27651k;
    public boolean f27652l;
    public boolean f27653m;
    public boolean f27654n;
    public int f27655o;
    public ob f27656p;
    public tb f27657q;
    public boolean f27658r;
    public boolean f27659s;
    public boolean f27660t;
    public boolean f27661u;
    public Runnable v;

    public qc() {
        this.f27649i = new db(this, 0);
        this.f27654n = true;
        this.f27658r = true;
        this.f27661u = true;
        this.e = null;
        this.f27647f = null;
        this.f27648g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ob obVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, obVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        qc qcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof ub) {
                    qcVar = ((ub) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                qcVar = null;
                break;
            }
        }
        if (qcVar != null) {
            qcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        qc qcVar = f27643w;
        if (qcVar != null) {
            qcVar.b();
        }
    }

    public static qc f(FrameLayout frameLayout, ub ubVar, int i10) {
        if (frameLayout == null) {
            return new qc();
        }
        return new qc(null, frameLayout, ubVar, i10);
    }

    public static qc g(org.telegram.ui.ActionBar.m2 m2Var, nb nbVar, int i10) {
        if (m2Var == null) {
            return new qc();
        }
        if (m2Var instanceof org.telegram.ui.wn) {
            ub.access$000(nbVar, -2, 1);
        } else if (m2Var instanceof org.telegram.ui.qy) {
            ub.access$000(nbVar, -1, 0);
        }
        return new qc(m2Var, m2Var.getBulletinLayoutContainer(), nbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        ub ubVar = this.e;
        if (ubVar != null && this.f27652l) {
            this.f27652l = false;
            if (f27643w == this) {
                f27643w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f42129a;
            if (ubVar.isLaidOut() || this.f27660t) {
                ubVar.removeCallbacks(this.f27649i);
                if (z10) {
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.f27656p;
                    ubVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f3790a = j3;
                        this.f27657q = obj;
                    } else if (ubVar != null && this.f27657q == null) {
                        this.f27657q = ubVar.createTransition();
                    }
                    tb tbVar = this.f27657q;
                    Objects.requireNonNull(ubVar);
                    tbVar.g(ubVar, new fb(ubVar, 0), new db(this, 1), new gb(this, 0));
                    return;
                }
            }
            ob obVar = this.f27656p;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.f27656p.d(this);
            }
            ubVar.onExitTransitionStart();
            ubVar.onExitTransitionEnd();
            ubVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new db(this, 2));
            }
            ubVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        ub ubVar;
        if (z10 && this.f27654n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27653m != z11 && (ubVar = this.e) != null) {
            this.f27653m = z11;
            Runnable runnable = this.f27649i;
            if (z11) {
                int i10 = this.f27650j;
                if (i10 >= 0) {
                    ubVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            ubVar.removeCallbacks(runnable);
        }
    }

    public qc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f27652l && (frameLayout = this.h) != 0) {
            this.f27652l = true;
            ub ubVar = this.e;
            ubVar.setTop(z10);
            CharSequence accessibilityText = ubVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = ubVar.getParent();
            ib ibVar = this.f27647f;
            if (parent == ibVar) {
                qc qcVar = f27643w;
                if (qcVar != null) {
                    qcVar.b();
                }
                f27643w = this;
                ubVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        qc qcVar2 = qc.this;
                        ob obVar = qcVar2.f27656p;
                        if ((obVar == null || obVar.a()) && !z10) {
                            ob obVar2 = qcVar2.f27656p;
                            if (obVar2 != null) {
                                i18 = obVar2.f(qcVar2.f27644a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = qcVar2.f27655o;
                            if (i19 != i18) {
                                o1.k kVar = qcVar2.d;
                                if (kVar != null && kVar.f15527f) {
                                    kVar.f15534u.f15540i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f15540i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f15534u = lVar;
                                    qcVar2.d = kVar2;
                                    kVar2.b(new k7(qcVar2, 1));
                                    qcVar2.d.a(new hb(qcVar2, 0));
                                }
                                qcVar2.d.f();
                            }
                        }
                    }
                };
                this.f27646c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                ubVar.addOnLayoutChangeListener(new jb(this, z10));
                if (!this.f27660t) {
                    ubVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
                }
                frameLayout.addView(ibVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.updatePosition();
        }
    }

    public qc(org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.f27649i = new db(this, 0);
        this.f27658r = true;
        this.f27661u = true;
        this.e = ubVar;
        this.f27654n = true ^ (ubVar instanceof vb);
        this.f27647f = new ib(this, ubVar, frameLayout);
        this.f27648g = m2Var;
        this.h = frameLayout;
        this.f27650j = i10;
    }
}
