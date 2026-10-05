package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class rc {
    public static rc f30419w;
    public int f30420a;
    public int f30421b;
    public fb f30422c;
    public o1.k d;
    public final vb f30423e;
    public final jb f30424f;
    public final org.telegram.ui.ActionBar.n2 f30425g;
    public final FrameLayout h;
    public final Runnable f30426i;
    public int f30427j;
    public boolean f30428k;
    public boolean f30429l;
    public boolean f30430m;
    public boolean f30431n;
    public int f30432o;
    public pb f30433p;
    public ub f30434q;
    public boolean f30435r;
    public boolean f30436s;
    public boolean f30437t;
    public boolean f30438u;
    public Runnable v;

    public rc() {
        this.f30426i = new eb(this, 0);
        this.f30431n = true;
        this.f30435r = true;
        this.f30438u = true;
        this.f30423e = null;
        this.f30424f = null;
        this.f30425g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, pb pbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, pbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        rc rcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof vb) {
                    rcVar = ((vb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                rcVar = null;
                break;
            }
        }
        if (rcVar != null) {
            rcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        rc rcVar = f30419w;
        if (rcVar != null) {
            rcVar.b();
        }
    }

    public static rc f(FrameLayout frameLayout, vb vbVar, int i10) {
        if (frameLayout == null) {
            return new rc();
        }
        return new rc(null, frameLayout, vbVar, i10);
    }

    public static rc g(org.telegram.ui.ActionBar.n2 n2Var, ob obVar, int i10) {
        if (n2Var == null) {
            return new rc();
        }
        if (n2Var instanceof org.telegram.ui.yn) {
            vb.access$000(obVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.uy) {
            vb.access$000(obVar, -1, 0);
        }
        return new rc(n2Var, n2Var.getBulletinLayoutContainer(), obVar, i10);
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
        vb vbVar = this.f30423e;
        if (vbVar != null && this.f30429l) {
            this.f30429l = false;
            if (f30419w == this) {
                f30419w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f45610a;
            if (vbVar.isLaidOut() || this.f30437t) {
                vbVar.removeCallbacks(this.f30426i);
                if (z10) {
                    vbVar.transitionRunningExit = true;
                    vbVar.delegate = this.f30433p;
                    vbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f4101a = j3;
                        this.f30434q = obj;
                    } else if (vbVar != null && this.f30434q == null) {
                        this.f30434q = vbVar.createTransition();
                    }
                    ub ubVar = this.f30434q;
                    Objects.requireNonNull(vbVar);
                    ubVar.c(vbVar, new gb(vbVar, 0), new eb(this, 1), new hb(this, 0));
                    return;
                }
            }
            pb pbVar = this.f30433p;
            if (pbVar != null && !vbVar.top) {
                pbVar.c(0.0f);
                this.f30433p.d(this);
            }
            vbVar.onExitTransitionStart();
            vbVar.onExitTransitionEnd();
            vbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new eb(this, 2));
            }
            vbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        vb vbVar;
        if (z10 && this.f30431n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f30430m != z11 && (vbVar = this.f30423e) != null) {
            this.f30430m = z11;
            Runnable runnable = this.f30426i;
            if (z11) {
                int i10 = this.f30427j;
                if (i10 >= 0) {
                    vbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            vbVar.removeCallbacks(runnable);
        }
    }

    public rc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f30429l && (frameLayout = this.h) != 0) {
            this.f30429l = true;
            vb vbVar = this.f30423e;
            vbVar.setTop(z10);
            CharSequence accessibilityText = vbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = vbVar.getParent();
            jb jbVar = this.f30424f;
            if (parent == jbVar) {
                rc rcVar = f30419w;
                if (rcVar != null) {
                    rcVar.b();
                }
                f30419w = this;
                vbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        rc rcVar2 = rc.this;
                        pb pbVar = rcVar2.f30433p;
                        if ((pbVar == null || pbVar.a()) && !z10) {
                            pb pbVar2 = rcVar2.f30433p;
                            if (pbVar2 != null) {
                                i18 = pbVar2.f(rcVar2.f30420a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = rcVar2.f30432o;
                            if (i19 != i18) {
                                o1.k kVar = rcVar2.d;
                                if (kVar != null && kVar.f16986f) {
                                    kVar.f16993u.f17000i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f17000i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f16993u = lVar;
                                    rcVar2.d = kVar2;
                                    kVar2.b(new k7(rcVar2, 1));
                                    rcVar2.d.a(new ib(rcVar2, 0));
                                }
                                rcVar2.d.f();
                            }
                        }
                    }
                };
                this.f30422c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                vbVar.addOnLayoutChangeListener(new kb(this, z10));
                if (!this.f30437t) {
                    vbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
                }
                frameLayout.addView(jbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        vb vbVar = this.f30423e;
        if (vbVar != null) {
            vbVar.updatePosition();
        }
    }

    public rc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, vb vbVar, int i10) {
        this.f30426i = new eb(this, 0);
        this.f30435r = true;
        this.f30438u = true;
        this.f30423e = vbVar;
        this.f30431n = true ^ (vbVar instanceof wb);
        this.f30424f = new jb(this, vbVar, frameLayout);
        this.f30425g = n2Var;
        this.h = frameLayout;
        this.f30427j = i10;
    }
}
