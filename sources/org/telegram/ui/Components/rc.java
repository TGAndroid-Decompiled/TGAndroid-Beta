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
    public static rc f27939w;
    public int f27940a;
    public int f27941b;
    public fb f27942c;
    public o1.k d;
    public final vb e;
    public final jb f27943f;
    public final org.telegram.ui.ActionBar.m2 f27944g;
    public final FrameLayout h;
    public final Runnable f27945i;
    public int f27946j;
    public boolean f27947k;
    public boolean f27948l;
    public boolean f27949m;
    public boolean f27950n;
    public int f27951o;
    public pb f27952p;
    public ub f27953q;
    public boolean f27954r;
    public boolean f27955s;
    public boolean f27956t;
    public boolean f27957u;
    public Runnable v;

    public rc() {
        this.f27945i = new eb(this, 0);
        this.f27950n = true;
        this.f27954r = true;
        this.f27957u = true;
        this.e = null;
        this.f27943f = null;
        this.f27944g = null;
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
        rc rcVar = f27939w;
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

    public static rc g(org.telegram.ui.ActionBar.m2 m2Var, ob obVar, int i10) {
        if (m2Var == null) {
            return new rc();
        }
        if (m2Var instanceof org.telegram.ui.wn) {
            vb.access$000(obVar, -2, 1);
        } else if (m2Var instanceof org.telegram.ui.qy) {
            vb.access$000(obVar, -1, 0);
        }
        return new rc(m2Var, m2Var.getBulletinLayoutContainer(), obVar, i10);
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
        vb vbVar = this.e;
        if (vbVar != null && this.f27948l) {
            this.f27948l = false;
            if (f27939w == this) {
                f27939w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f42233a;
            if (vbVar.isLaidOut() || this.f27956t) {
                vbVar.removeCallbacks(this.f27945i);
                if (z10) {
                    vbVar.transitionRunningExit = true;
                    vbVar.delegate = this.f27952p;
                    vbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f3797a = j3;
                        this.f27953q = obj;
                    } else if (vbVar != null && this.f27953q == null) {
                        this.f27953q = vbVar.createTransition();
                    }
                    ub ubVar = this.f27953q;
                    Objects.requireNonNull(vbVar);
                    ubVar.g(vbVar, new gb(vbVar, 0), new eb(this, 1), new hb(this, 0));
                    return;
                }
            }
            pb pbVar = this.f27952p;
            if (pbVar != null && !vbVar.top) {
                pbVar.c(0.0f);
                this.f27952p.d(this);
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
        if (z10 && this.f27950n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27949m != z11 && (vbVar = this.e) != null) {
            this.f27949m = z11;
            Runnable runnable = this.f27945i;
            if (z11) {
                int i10 = this.f27946j;
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
        if (!this.f27948l && (frameLayout = this.h) != 0) {
            this.f27948l = true;
            vb vbVar = this.e;
            vbVar.setTop(z10);
            CharSequence accessibilityText = vbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = vbVar.getParent();
            jb jbVar = this.f27943f;
            if (parent == jbVar) {
                rc rcVar = f27939w;
                if (rcVar != null) {
                    rcVar.b();
                }
                f27939w = this;
                vbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        rc rcVar2 = rc.this;
                        pb pbVar = rcVar2.f27952p;
                        if ((pbVar == null || pbVar.a()) && !z10) {
                            pb pbVar2 = rcVar2.f27952p;
                            if (pbVar2 != null) {
                                i18 = pbVar2.f(rcVar2.f27940a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = rcVar2.f27951o;
                            if (i19 != i18) {
                                o1.k kVar = rcVar2.d;
                                if (kVar != null && kVar.f15542f) {
                                    kVar.f15549u.f15555i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f15555i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f15549u = lVar;
                                    rcVar2.d = kVar2;
                                    kVar2.b(new k7(rcVar2, 1));
                                    rcVar2.d.a(new ib(rcVar2, 0));
                                }
                                rcVar2.d.f();
                            }
                        }
                    }
                };
                this.f27942c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                vbVar.addOnLayoutChangeListener(new kb(this, z10));
                if (!this.f27956t) {
                    vbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
                }
                frameLayout.addView(jbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        vb vbVar = this.e;
        if (vbVar != null) {
            vbVar.updatePosition();
        }
    }

    public rc(org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, vb vbVar, int i10) {
        this.f27945i = new eb(this, 0);
        this.f27954r = true;
        this.f27957u = true;
        this.e = vbVar;
        this.f27950n = true ^ (vbVar instanceof wb);
        this.f27943f = new jb(this, vbVar, frameLayout);
        this.f27944g = m2Var;
        this.h = frameLayout;
        this.f27946j = i10;
    }
}
