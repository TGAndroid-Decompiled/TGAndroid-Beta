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
    public static qc f27571w;
    public int f27572a;
    public int f27573b;
    public eb f27574c;
    public o1.k d;
    public final ub e;
    public final ib f27575f;
    public final org.telegram.ui.ActionBar.m2 f27576g;
    public final FrameLayout h;
    public final Runnable f27577i;
    public int f27578j;
    public boolean f27579k;
    public boolean f27580l;
    public boolean f27581m;
    public boolean f27582n;
    public int f27583o;
    public ob f27584p;
    public tb f27585q;
    public boolean f27586r;
    public boolean f27587s;
    public boolean f27588t;
    public boolean f27589u;
    public Runnable v;

    public qc() {
        this.f27577i = new db(this, 0);
        this.f27582n = true;
        this.f27586r = true;
        this.f27589u = true;
        this.e = null;
        this.f27575f = null;
        this.f27576g = null;
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
        qc qcVar = f27571w;
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
        if (ubVar != null && this.f27580l) {
            this.f27580l = false;
            if (f27571w == this) {
                f27571w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f42129a;
            if (ubVar.isLaidOut() || this.f27588t) {
                ubVar.removeCallbacks(this.f27577i);
                if (z10) {
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.f27584p;
                    ubVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f3790a = j3;
                        this.f27585q = obj;
                    } else if (ubVar != null && this.f27585q == null) {
                        this.f27585q = ubVar.createTransition();
                    }
                    tb tbVar = this.f27585q;
                    Objects.requireNonNull(ubVar);
                    tbVar.g(ubVar, new fb(ubVar, 0), new db(this, 1), new gb(this, 0));
                    return;
                }
            }
            ob obVar = this.f27584p;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.f27584p.d(this);
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
        if (z10 && this.f27582n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27581m != z11 && (ubVar = this.e) != null) {
            this.f27581m = z11;
            Runnable runnable = this.f27577i;
            if (z11) {
                int i10 = this.f27578j;
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
        if (!this.f27580l && (frameLayout = this.h) != 0) {
            this.f27580l = true;
            ub ubVar = this.e;
            ubVar.setTop(z10);
            CharSequence accessibilityText = ubVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = ubVar.getParent();
            ib ibVar = this.f27575f;
            if (parent == ibVar) {
                qc qcVar = f27571w;
                if (qcVar != null) {
                    qcVar.b();
                }
                f27571w = this;
                ubVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        qc qcVar2 = qc.this;
                        ob obVar = qcVar2.f27584p;
                        if ((obVar == null || obVar.a()) && !z10) {
                            ob obVar2 = qcVar2.f27584p;
                            if (obVar2 != null) {
                                i18 = obVar2.f(qcVar2.f27572a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = qcVar2.f27583o;
                            if (i19 != i18) {
                                o1.k kVar = qcVar2.d;
                                if (kVar != null && kVar.f15526f) {
                                    kVar.f15533u.f15539i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f15539i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f15533u = lVar;
                                    qcVar2.d = kVar2;
                                    kVar2.b(new k7(qcVar2, 1));
                                    qcVar2.d.a(new hb(qcVar2, 0));
                                }
                                qcVar2.d.f();
                            }
                        }
                    }
                };
                this.f27574c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                ubVar.addOnLayoutChangeListener(new jb(this, z10));
                if (!this.f27588t) {
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
        this.f27577i = new db(this, 0);
        this.f27586r = true;
        this.f27589u = true;
        this.e = ubVar;
        this.f27582n = true ^ (ubVar instanceof vb);
        this.f27575f = new ib(this, ubVar, frameLayout);
        this.f27576g = m2Var;
        this.h = frameLayout;
        this.f27578j = i10;
    }
}
