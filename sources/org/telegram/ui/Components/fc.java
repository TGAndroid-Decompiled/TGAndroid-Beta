package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
public class fc {
    public static fc f35083w;
    public int f35084a;
    public int f35085b;
    public ua f35086c;
    public r1.g d;
    public final kb f35087e;
    public final ya f35088f;
    public final org.telegram.ui.ActionBar.g2 f35089g;
    public final FrameLayout h;
    public final Runnable f35090i;
    public int f35091j;
    public boolean f35092k;
    public boolean f35093l;
    public boolean f35094m;
    public boolean f35095n;
    public int f35096o;
    public eb f35097p;
    public jb f35098q;
    public boolean f35099r;
    public boolean f35100s;
    public boolean f35101t;
    public boolean f35102u;
    public Runnable v;

    public fc() {
        this.f35090i = new ta(this, 0);
        this.f35095n = true;
        this.f35099r = true;
        this.f35102u = true;
        this.f35087e = null;
        this.f35088f = null;
        this.f35089g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, eb ebVar) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, ebVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        fc fcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = frameLayout.getChildAt(i7);
                if (childAt instanceof kb) {
                    fcVar = ((kb) childAt).bulletin;
                    break;
                }
                i7++;
            } else {
                fcVar = null;
                break;
            }
        }
        if (fcVar != null) {
            fcVar.c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        fc fcVar = f35083w;
        if (fcVar != null) {
            fcVar.b();
        }
    }

    public static fc f(FrameLayout frameLayout, kb kbVar, int i7) {
        if (frameLayout == null) {
            return new fc();
        }
        return new fc(null, frameLayout, kbVar, i7);
    }

    public static fc g(org.telegram.ui.ActionBar.g2 g2Var, db dbVar, int i7) {
        if (g2Var == null) {
            return new fc();
        }
        if (g2Var instanceof org.telegram.ui.bn) {
            kb.access$000(dbVar, -2, 1);
        } else if (g2Var instanceof org.telegram.ui.bx) {
            kb.access$000(dbVar, -1, 0);
        }
        return new fc(g2Var, g2Var.getBulletinLayoutContainer(), dbVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        kb kbVar = this.f35087e;
        if (kbVar != null && this.f35093l) {
            this.f35093l = false;
            if (f35083w == this) {
                f35083w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f56367a;
            if (kbVar.isLaidOut() || this.f35101t) {
                kbVar.removeCallbacks(this.f35090i);
                if (z10) {
                    kbVar.transitionRunningExit = true;
                    kbVar.delegate = this.f35097p;
                    kbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f11195a = j3;
                        this.f35098q = obj;
                    } else if (kbVar != null && this.f35098q == null) {
                        this.f35098q = kbVar.createTransition();
                    }
                    jb jbVar = this.f35098q;
                    Objects.requireNonNull(kbVar);
                    jbVar.b(kbVar, new va(kbVar, 0), new ta(this, 1), new wa(this, 0));
                    return;
                }
            }
            eb ebVar = this.f35097p;
            if (ebVar != null && !kbVar.top) {
                ebVar.c(0.0f);
                this.f35097p.d(this);
            }
            kbVar.onExitTransitionStart();
            kbVar.onExitTransitionEnd();
            kbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.g3(new ta(this, 2));
            }
            kbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        kb kbVar;
        if (z10 && this.f35095n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35094m != z11 && (kbVar = this.f35087e) != null) {
            this.f35094m = z11;
            Runnable runnable = this.f35090i;
            if (z11) {
                int i7 = this.f35091j;
                if (i7 >= 0) {
                    kbVar.postDelayed(runnable, i7);
                    return;
                }
                return;
            }
            kbVar.removeCallbacks(runnable);
        }
    }

    public fc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f35093l && (frameLayout = this.h) != 0) {
            this.f35093l = true;
            kb kbVar = this.f35087e;
            kbVar.setTop(z10);
            CharSequence accessibilityText = kbVar.getAccessibilityText();
            if (accessibilityText != null) {
                org.telegram.messenger.g0.i2(accessibilityText);
            }
            ViewParent parent = kbVar.getParent();
            ya yaVar = this.f35088f;
            if (parent == yaVar) {
                fc fcVar = f35083w;
                if (fcVar != null) {
                    fcVar.b();
                }
                f35083w = this;
                kbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                        int i17;
                        fc fcVar2 = fc.this;
                        eb ebVar = fcVar2.f35097p;
                        if ((ebVar == null || ebVar.a()) && !z10) {
                            eb ebVar2 = fcVar2.f35097p;
                            if (ebVar2 != null) {
                                i17 = ebVar2.f(fcVar2.f35084a);
                            } else {
                                i17 = 0;
                            }
                            int i18 = fcVar2.f35096o;
                            if (i18 != i17) {
                                r1.g gVar = fcVar2.d;
                                if (gVar != null && gVar.f56440f) {
                                    gVar.f56446m.f56454i = i17;
                                } else {
                                    r1.g gVar2 = new r1.g(new r1.f(i18));
                                    r1.h hVar = new r1.h();
                                    hVar.f56454i = i17;
                                    hVar.b(900.0f);
                                    hVar.a(1.0f);
                                    gVar2.f56446m = hVar;
                                    fcVar2.d = gVar2;
                                    gVar2.b(new i7(fcVar2, 1));
                                    fcVar2.d.a(new xa(fcVar2, 0));
                                }
                                fcVar2.d.h();
                            }
                        }
                    }
                };
                this.f35086c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                kbVar.addOnLayoutChangeListener(new za(this, z10));
                if (!this.f35101t) {
                    kbVar.addOnAttachStateChangeListener(new bi.x2(this, 12));
                }
                frameLayout.addView(yaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        kb kbVar = this.f35087e;
        if (kbVar != null) {
            kbVar.updatePosition();
        }
    }

    public fc(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, kb kbVar, int i7) {
        this.f35090i = new ta(this, 0);
        this.f35099r = true;
        this.f35102u = true;
        this.f35087e = kbVar;
        this.f35095n = true ^ (kbVar instanceof lb);
        this.f35088f = new ya(this, kbVar, frameLayout);
        this.f35089g = g2Var;
        this.h = frameLayout;
        this.f35091j = i7;
    }
}
