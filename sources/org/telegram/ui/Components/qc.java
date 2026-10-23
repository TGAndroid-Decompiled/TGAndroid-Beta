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
    public static qc f29825w;
    public int f29826a;
    public int f29827b;
    public eb f29828c;
    public o1.k d;
    public final ub e;
    public final ib f29829f;
    public final org.telegram.ui.ActionBar.o2 f29830g;
    public final FrameLayout h;
    public final Runnable f29831i;
    public int f29832j;
    public boolean f29833k;
    public boolean f29834l;
    public boolean f29835m;
    public boolean f29836n;
    public int f29837o;
    public ob f29838p;
    public tb f29839q;
    public boolean f29840r;
    public boolean f29841s;
    public boolean f29842t;
    public boolean f29843u;
    public Runnable v;

    public qc() {
        this.f29831i = new db(this, 0);
        this.f29836n = true;
        this.f29840r = true;
        this.f29843u = true;
        this.e = null;
        this.f29829f = null;
        this.f29830g = null;
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
        qc qcVar = f29825w;
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

    public static qc g(org.telegram.ui.ActionBar.o2 o2Var, nb nbVar, int i10) {
        if (o2Var == null) {
            return new qc();
        }
        if (o2Var instanceof org.telegram.ui.sn) {
            ub.access$000(nbVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.ey) {
            ub.access$000(nbVar, -1, 0);
        }
        return new qc(o2Var, o2Var.getBulletinLayoutContainer(), nbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        ub ubVar = this.e;
        if (ubVar != null && this.f29834l) {
            this.f29834l = false;
            if (f29825w == this) {
                f29825w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f45242a;
            if (ubVar.isLaidOut() || this.f29842t) {
                ubVar.removeCallbacks(this.f29831i);
                if (z10) {
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.f29838p;
                    ubVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f4664a = j10;
                        this.f29839q = obj;
                    } else if (ubVar != null && this.f29839q == null) {
                        this.f29839q = ubVar.createTransition();
                    }
                    tb tbVar = this.f29839q;
                    Objects.requireNonNull(ubVar);
                    tbVar.c(ubVar, new fb(ubVar, 0), new db(this, 1), new gb(this, 0));
                    return;
                }
            }
            ob obVar = this.f29838p;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.f29838p.d(this);
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
        if (z10 && this.f29836n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29835m != z11 && (ubVar = this.e) != null) {
            this.f29835m = z11;
            Runnable runnable = this.f29831i;
            if (z11) {
                int i10 = this.f29832j;
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
        if (!this.f29834l && (frameLayout = this.h) != 0) {
            this.f29834l = true;
            ub ubVar = this.e;
            ubVar.setTop(z10);
            CharSequence accessibilityText = ubVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = ubVar.getParent();
            ib ibVar = this.f29829f;
            if (parent == ibVar) {
                qc qcVar = f29825w;
                if (qcVar != null) {
                    qcVar.b();
                }
                f29825w = this;
                ubVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        qc qcVar2 = qc.this;
                        ob obVar = qcVar2.f29838p;
                        if ((obVar == null || obVar.a()) && !z10) {
                            ob obVar2 = qcVar2.f29838p;
                            if (obVar2 != null) {
                                i18 = obVar2.f(qcVar2.f29826a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = qcVar2.f29837o;
                            if (i19 != i18) {
                                o1.k kVar = qcVar2.d;
                                if (kVar != null && kVar.f17615f) {
                                    kVar.f17622u.f17628i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f17628i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f17622u = lVar;
                                    qcVar2.d = kVar2;
                                    kVar2.b(new l7(qcVar2, 1));
                                    qcVar2.d.a(new hb(qcVar2, 0));
                                }
                                qcVar2.d.h();
                            }
                        }
                    }
                };
                this.f29828c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                ubVar.addOnLayoutChangeListener(new jb(this, z10));
                if (!this.f29842t) {
                    ubVar.addOnAttachStateChangeListener(new ai.n6(this, 7));
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

    public qc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.f29831i = new db(this, 0);
        this.f29840r = true;
        this.f29843u = true;
        this.e = ubVar;
        this.f29836n = true ^ (ubVar instanceof vb);
        this.f29829f = new ib(this, ubVar, frameLayout);
        this.f29830g = o2Var;
        this.h = frameLayout;
        this.f29832j = i10;
    }
}
