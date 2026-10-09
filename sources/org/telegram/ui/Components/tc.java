package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class tc {
    public static tc f31122w;
    public int f31123a;
    public int f31124b;
    public hb f31125c;
    public o1.k d;
    public final xb f31126e;
    public final lb f31127f;
    public final org.telegram.ui.ActionBar.n2 f31128g;
    public final FrameLayout h;
    public final Runnable f31129i;
    public int f31130j;
    public boolean f31131k;
    public boolean f31132l;
    public boolean f31133m;
    public boolean f31134n;
    public int f31135o;
    public rb f31136p;
    public wb f31137q;
    public boolean f31138r;
    public boolean f31139s;
    public boolean f31140t;
    public boolean f31141u;
    public Runnable v;

    public tc() {
        this.f31129i = new gb(this, 0);
        this.f31134n = true;
        this.f31138r = true;
        this.f31141u = true;
        this.f31126e = null;
        this.f31127f = null;
        this.f31128g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, rb rbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, rbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        tc tcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof xb) {
                    tcVar = ((xb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                tcVar = null;
                break;
            }
        }
        if (tcVar != null) {
            tcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        tc tcVar = f31122w;
        if (tcVar != null) {
            tcVar.b();
        }
    }

    public static tc f(FrameLayout frameLayout, xb xbVar, int i10) {
        if (frameLayout == null) {
            return new tc();
        }
        return new tc(null, frameLayout, xbVar, i10);
    }

    public static tc g(org.telegram.ui.ActionBar.n2 n2Var, qb qbVar, int i10) {
        if (n2Var == null) {
            return new tc();
        }
        if (n2Var instanceof org.telegram.ui.zn) {
            xb.access$000(qbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.ty) {
            xb.access$000(qbVar, -1, 0);
        }
        return new tc(n2Var, n2Var.getBulletinLayoutContainer(), qbVar, i10);
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
        xb xbVar = this.f31126e;
        if (xbVar != null && this.f31132l) {
            this.f31132l = false;
            if (f31122w == this) {
                f31122w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f46764a;
            if (xbVar.isLaidOut() || this.f31140t) {
                xbVar.removeCallbacks(this.f31129i);
                if (z10) {
                    xbVar.transitionRunningExit = true;
                    xbVar.delegate = this.f31136p;
                    xbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f4150a = j3;
                        this.f31137q = obj;
                    } else if (xbVar != null && this.f31137q == null) {
                        this.f31137q = xbVar.createTransition();
                    }
                    wb wbVar = this.f31137q;
                    Objects.requireNonNull(xbVar);
                    wbVar.d(xbVar, new ib(xbVar, 0), new gb(this, 1), new jb(this, 0));
                    return;
                }
            }
            rb rbVar = this.f31136p;
            if (rbVar != null && !xbVar.top) {
                rbVar.c(0.0f);
                this.f31136p.d(this);
            }
            xbVar.onExitTransitionStart();
            xbVar.onExitTransitionEnd();
            xbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new gb(this, 2));
            }
            xbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        xb xbVar;
        if (z10 && this.f31134n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31133m != z11 && (xbVar = this.f31126e) != null) {
            this.f31133m = z11;
            Runnable runnable = this.f31129i;
            if (z11) {
                int i10 = this.f31130j;
                if (i10 >= 0) {
                    xbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            xbVar.removeCallbacks(runnable);
        }
    }

    public tc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f31132l && (frameLayout = this.h) != 0) {
            this.f31132l = true;
            xb xbVar = this.f31126e;
            xbVar.setTop(z10);
            CharSequence accessibilityText = xbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = xbVar.getParent();
            lb lbVar = this.f31127f;
            if (parent == lbVar) {
                tc tcVar = f31122w;
                if (tcVar != null) {
                    tcVar.b();
                }
                f31122w = this;
                xbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        tc tcVar2 = tc.this;
                        rb rbVar = tcVar2.f31136p;
                        if ((rbVar == null || rbVar.a()) && !z10) {
                            rb rbVar2 = tcVar2.f31136p;
                            if (rbVar2 != null) {
                                i18 = rbVar2.f(tcVar2.f31123a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = tcVar2.f31135o;
                            if (i19 != i18) {
                                o1.k kVar = tcVar2.d;
                                if (kVar != null && kVar.f16931f) {
                                    kVar.f16938u.f16945i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f16945i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f16938u = lVar;
                                    tcVar2.d = kVar2;
                                    kVar2.b(new m7(tcVar2, 1));
                                    tcVar2.d.a(new kb(tcVar2, 0));
                                }
                                tcVar2.d.h();
                            }
                        }
                    }
                };
                this.f31125c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                xbVar.addOnLayoutChangeListener(new mb(this, z10));
                if (!this.f31140t) {
                    xbVar.addOnAttachStateChangeListener(new ai.v2(this, 6));
                }
                frameLayout.addView(lbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        xb xbVar = this.f31126e;
        if (xbVar != null) {
            xbVar.updatePosition();
        }
    }

    public tc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, xb xbVar, int i10) {
        this.f31129i = new gb(this, 0);
        this.f31138r = true;
        this.f31141u = true;
        this.f31126e = xbVar;
        this.f31134n = true ^ (xbVar instanceof yb);
        this.f31127f = new lb(this, xbVar, frameLayout);
        this.f31128g = n2Var;
        this.h = frameLayout;
        this.f31130j = i10;
    }
}
