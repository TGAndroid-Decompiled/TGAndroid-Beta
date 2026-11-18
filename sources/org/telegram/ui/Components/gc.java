package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class gc {
    public static gc f35453w;
    public int f35454a;
    public int f35455b;
    public va f35456c;
    public r1.g d;
    public final lb f35457e;
    public final za f35458f;
    public final org.telegram.ui.ActionBar.h2 f35459g;
    public final FrameLayout h;
    public final Runnable f35460i;
    public int f35461j;
    public boolean f35462k;
    public boolean f35463l;
    public boolean f35464m;
    public boolean f35465n;
    public int f35466o;
    public fb f35467p;
    public kb f35468q;
    public boolean f35469r;
    public boolean f35470s;
    public boolean f35471t;
    public boolean f35472u;
    public Runnable v;

    public gc() {
        this.f35460i = new ua(this, 0);
        this.f35465n = true;
        this.f35469r = true;
        this.f35472u = true;
        this.f35457e = null;
        this.f35458f = null;
        this.f35459g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, fb fbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, fbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        gc gcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = frameLayout.getChildAt(i7);
                if (childAt instanceof lb) {
                    gcVar = ((lb) childAt).bulletin;
                    break;
                }
                i7++;
            } else {
                gcVar = null;
                break;
            }
        }
        if (gcVar != null) {
            gcVar.c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        gc gcVar = f35453w;
        if (gcVar != null) {
            gcVar.b();
        }
    }

    public static gc f(FrameLayout frameLayout, lb lbVar, int i7) {
        if (frameLayout == null) {
            return new gc();
        }
        return new gc(null, frameLayout, lbVar, i7);
    }

    public static gc g(org.telegram.ui.ActionBar.h2 h2Var, eb ebVar, int i7) {
        if (h2Var == null) {
            return new gc();
        }
        if (h2Var instanceof org.telegram.ui.bn) {
            lb.access$000(ebVar, -2, 1);
        } else if (h2Var instanceof org.telegram.ui.cx) {
            lb.access$000(ebVar, -1, 0);
        }
        return new gc(h2Var, h2Var.getBulletinLayoutContainer(), ebVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296351, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        lb lbVar = this.f35457e;
        if (lbVar != null && this.f35463l) {
            this.f35463l = false;
            if (f35453w == this) {
                f35453w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f56244a;
            if (lbVar.isLaidOut() || this.f35471t) {
                lbVar.removeCallbacks(this.f35460i);
                if (z10) {
                    lbVar.transitionRunningExit = true;
                    lbVar.delegate = this.f35467p;
                    lbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f11199a = j3;
                        this.f35468q = obj;
                    } else if (lbVar != null && this.f35468q == null) {
                        this.f35468q = lbVar.createTransition();
                    }
                    kb kbVar = this.f35468q;
                    Objects.requireNonNull(lbVar);
                    kbVar.j(lbVar, new wa(lbVar, 0), new ua(this, 1), new xa(this, 0));
                    return;
                }
            }
            fb fbVar = this.f35467p;
            if (fbVar != null && !lbVar.top) {
                fbVar.c(0.0f);
                this.f35467p.d(this);
            }
            lbVar.onExitTransitionStart();
            lbVar.onExitTransitionEnd();
            lbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.g3(new ua(this, 2));
            }
            lbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        lb lbVar;
        if (z10 && this.f35465n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35464m != z11 && (lbVar = this.f35457e) != null) {
            this.f35464m = z11;
            Runnable runnable = this.f35460i;
            if (z11) {
                int i7 = this.f35461j;
                if (i7 >= 0) {
                    lbVar.postDelayed(runnable, i7);
                    return;
                }
                return;
            }
            lbVar.removeCallbacks(runnable);
        }
    }

    public gc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f35463l && (frameLayout = this.h) != 0) {
            this.f35463l = true;
            lb lbVar = this.f35457e;
            lbVar.setTop(z10);
            CharSequence accessibilityText = lbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = lbVar.getParent();
            za zaVar = this.f35458f;
            if (parent == zaVar) {
                gc gcVar = f35453w;
                if (gcVar != null) {
                    gcVar.b();
                }
                f35453w = this;
                lbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        gc gcVar2 = gc.this;
                        fb fbVar = gcVar2.f35467p;
                        if ((fbVar == null || fbVar.a()) && !z10) {
                            fb fbVar2 = gcVar2.f35467p;
                            if (fbVar2 != null) {
                                i17 = fbVar2.f(gcVar2.f35454a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = gcVar2.f35466o;
                            if (i18 != i17) {
                                r1.g gVar = gcVar2.d;
                                if (gVar != null && gVar.f56317f) {
                                    gVar.f56323m.f56331i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f56331i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f56323m = hVar;
                                    gcVar2.d = gVar2;
                                    gVar2.b(new i7(gcVar2, 1));
                                    gcVar2.d.a(new ya(gcVar2, 0));
                                }
                                gcVar2.d.h();
                            }
                        }
                    }
                };
                this.f35456c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                lbVar.addOnLayoutChangeListener(new ab(this, z10));
                if (!this.f35471t) {
                    lbVar.addOnAttachStateChangeListener(new bi.r2(this, 12));
                }
                frameLayout.addView(zaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        lb lbVar = this.f35457e;
        if (lbVar != null) {
            lbVar.updatePosition();
        }
    }

    public gc(org.telegram.ui.ActionBar.h2 h2Var, FrameLayout frameLayout, lb lbVar, int i7) {
        this.f35460i = new ua(this, 0);
        this.f35469r = true;
        this.f35472u = true;
        this.f35457e = lbVar;
        this.f35465n = true ^ (lbVar instanceof mb);
        this.f35458f = new za(this, lbVar, frameLayout);
        this.f35459g = h2Var;
        this.h = frameLayout;
        this.f35461j = i7;
    }
}
