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
    public static qc f29638w;
    public int f29639a;
    public int f29640b;
    public eb f29641c;
    public o1.k d;
    public final ub e;
    public final ib f29642f;
    public final org.telegram.ui.ActionBar.n2 f29643g;
    public final FrameLayout h;
    public final Runnable f29644i;
    public int f29645j;
    public boolean f29646k;
    public boolean f29647l;
    public boolean f29648m;
    public boolean f29649n;
    public int f29650o;
    public ob f29651p;
    public tb f29652q;
    public boolean f29653r;
    public boolean f29654s;
    public boolean f29655t;
    public boolean f29656u;
    public Runnable v;

    public qc() {
        this.f29644i = new db(this, 0);
        this.f29649n = true;
        this.f29653r = true;
        this.f29656u = true;
        this.e = null;
        this.f29642f = null;
        this.f29643g = null;
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
        qc qcVar = f29638w;
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

    public static qc g(org.telegram.ui.ActionBar.n2 n2Var, nb nbVar, int i10) {
        if (n2Var == null) {
            return new qc();
        }
        if (n2Var instanceof org.telegram.ui.sn) {
            ub.access$000(nbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.ey) {
            ub.access$000(nbVar, -1, 0);
        }
        return new qc(n2Var, n2Var.getBulletinLayoutContainer(), nbVar, i10);
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
        if (ubVar != null && this.f29647l) {
            this.f29647l = false;
            if (f29638w == this) {
                f29638w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f44864a;
            if (ubVar.isLaidOut() || this.f29655t) {
                ubVar.removeCallbacks(this.f29644i);
                if (z10) {
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.f29651p;
                    ubVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f4659a = j10;
                        this.f29652q = obj;
                    } else if (ubVar != null && this.f29652q == null) {
                        this.f29652q = ubVar.createTransition();
                    }
                    tb tbVar = this.f29652q;
                    Objects.requireNonNull(ubVar);
                    tbVar.d(ubVar, new fb(ubVar, 0), new db(this, 1), new gb(this, 0));
                    return;
                }
            }
            ob obVar = this.f29651p;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.f29651p.d(this);
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
        if (z10 && this.f29649n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29648m != z11 && (ubVar = this.e) != null) {
            this.f29648m = z11;
            Runnable runnable = this.f29644i;
            if (z11) {
                int i10 = this.f29645j;
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
        if (!this.f29647l && (frameLayout = this.h) != 0) {
            this.f29647l = true;
            ub ubVar = this.e;
            ubVar.setTop(z10);
            CharSequence accessibilityText = ubVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = ubVar.getParent();
            ib ibVar = this.f29642f;
            if (parent == ibVar) {
                qc qcVar = f29638w;
                if (qcVar != null) {
                    qcVar.b();
                }
                f29638w = this;
                ubVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        qc qcVar2 = qc.this;
                        ob obVar = qcVar2.f29651p;
                        if ((obVar == null || obVar.a()) && !z10) {
                            ob obVar2 = qcVar2.f29651p;
                            if (obVar2 != null) {
                                i18 = obVar2.f(qcVar2.f29639a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = qcVar2.f29650o;
                            if (i19 != i18) {
                                o1.k kVar = qcVar2.d;
                                if (kVar != null && kVar.f17555f) {
                                    kVar.f17562u.f17568i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f17568i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f17562u = lVar;
                                    qcVar2.d = kVar2;
                                    kVar2.b(new l7(qcVar2, 1));
                                    qcVar2.d.a(new hb(qcVar2, 0));
                                }
                                qcVar2.d.h();
                            }
                        }
                    }
                };
                this.f29641c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                ubVar.addOnLayoutChangeListener(new jb(this, z10));
                if (!this.f29655t) {
                    ubVar.addOnAttachStateChangeListener(new ai.m6(this, 7));
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

    public qc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.f29644i = new db(this, 0);
        this.f29653r = true;
        this.f29656u = true;
        this.e = ubVar;
        this.f29649n = true ^ (ubVar instanceof vb);
        this.f29642f = new ib(this, ubVar, frameLayout);
        this.f29643g = n2Var;
        this.h = frameLayout;
        this.f29645j = i10;
    }
}
