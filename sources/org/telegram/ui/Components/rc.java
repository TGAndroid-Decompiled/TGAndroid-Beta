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
    public static rc f30337w;
    public int f30338a;
    public int f30339b;
    public fb f30340c;
    public o1.k d;
    public final vb f30341e;
    public final jb f30342f;
    public final org.telegram.ui.ActionBar.n2 f30343g;
    public final FrameLayout h;
    public final Runnable f30344i;
    public int f30345j;
    public boolean f30346k;
    public boolean f30347l;
    public boolean f30348m;
    public boolean f30349n;
    public int f30350o;
    public pb f30351p;
    public ub f30352q;
    public boolean f30353r;
    public boolean f30354s;
    public boolean f30355t;
    public boolean f30356u;
    public Runnable v;

    public rc() {
        this.f30344i = new eb(this, 0);
        this.f30349n = true;
        this.f30353r = true;
        this.f30356u = true;
        this.f30341e = null;
        this.f30342f = null;
        this.f30343g = null;
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
        rc rcVar = f30337w;
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
        vb vbVar = this.f30341e;
        if (vbVar != null && this.f30347l) {
            this.f30347l = false;
            if (f30337w == this) {
                f30337w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f45603a;
            if (vbVar.isLaidOut() || this.f30355t) {
                vbVar.removeCallbacks(this.f30344i);
                if (z10) {
                    vbVar.transitionRunningExit = true;
                    vbVar.delegate = this.f30351p;
                    vbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f4101a = j3;
                        this.f30352q = obj;
                    } else if (vbVar != null && this.f30352q == null) {
                        this.f30352q = vbVar.createTransition();
                    }
                    ub ubVar = this.f30352q;
                    Objects.requireNonNull(vbVar);
                    ubVar.c(vbVar, new gb(vbVar, 0), new eb(this, 1), new hb(this, 0));
                    return;
                }
            }
            pb pbVar = this.f30351p;
            if (pbVar != null && !vbVar.top) {
                pbVar.c(0.0f);
                this.f30351p.d(this);
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
        if (z10 && this.f30349n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f30348m != z11 && (vbVar = this.f30341e) != null) {
            this.f30348m = z11;
            Runnable runnable = this.f30344i;
            if (z11) {
                int i10 = this.f30345j;
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
        if (!this.f30347l && (frameLayout = this.h) != 0) {
            this.f30347l = true;
            vb vbVar = this.f30341e;
            vbVar.setTop(z10);
            CharSequence accessibilityText = vbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = vbVar.getParent();
            jb jbVar = this.f30342f;
            if (parent == jbVar) {
                rc rcVar = f30337w;
                if (rcVar != null) {
                    rcVar.b();
                }
                f30337w = this;
                vbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        rc rcVar2 = rc.this;
                        pb pbVar = rcVar2.f30351p;
                        if ((pbVar == null || pbVar.a()) && !z10) {
                            pb pbVar2 = rcVar2.f30351p;
                            if (pbVar2 != null) {
                                i18 = pbVar2.f(rcVar2.f30338a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = rcVar2.f30350o;
                            if (i19 != i18) {
                                o1.k kVar = rcVar2.d;
                                if (kVar != null && kVar.f16981f) {
                                    kVar.f16988u.f16995i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f16995i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f16988u = lVar;
                                    rcVar2.d = kVar2;
                                    kVar2.b(new k7(rcVar2, 1));
                                    rcVar2.d.a(new ib(rcVar2, 0));
                                }
                                rcVar2.d.f();
                            }
                        }
                    }
                };
                this.f30340c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                vbVar.addOnLayoutChangeListener(new kb(this, z10));
                if (!this.f30355t) {
                    vbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
                }
                frameLayout.addView(jbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        vb vbVar = this.f30341e;
        if (vbVar != null) {
            vbVar.updatePosition();
        }
    }

    public rc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, vb vbVar, int i10) {
        this.f30344i = new eb(this, 0);
        this.f30353r = true;
        this.f30356u = true;
        this.f30341e = vbVar;
        this.f30349n = true ^ (vbVar instanceof wb);
        this.f30342f = new jb(this, vbVar, frameLayout);
        this.f30343g = n2Var;
        this.h = frameLayout;
        this.f30345j = i10;
    }
}
