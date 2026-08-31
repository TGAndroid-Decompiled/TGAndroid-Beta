package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class ic {
    public static ic f27737w;
    public int f27738a;
    public int f27739b;
    public va f27740c;
    public o1.j d;
    public final nb f27741e;
    public final za f27742f;
    public final org.telegram.ui.ActionBar.p2 f27743g;
    public final FrameLayout h;
    public final Runnable f27744i;
    public int f27745j;
    public boolean f27746k;
    public boolean f27747l;
    public boolean f27748m;
    public boolean f27749n;
    public int f27750o;
    public fb f27751p;
    public mb f27752q;
    public boolean f27753r;
    public boolean f27754s;
    public boolean f27755t;
    public boolean f27756u;
    public Runnable v;

    public ic() {
        this.f27744i = new ua(this, 0);
        this.f27749n = true;
        this.f27753r = true;
        this.f27756u = true;
        this.f27741e = null;
        this.f27742f = null;
        this.f27743g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, fb fbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, fbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ic icVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof nb) {
                    icVar = ((nb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                icVar = null;
                break;
            }
        }
        if (icVar != null) {
            icVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ic icVar = f27737w;
        if (icVar != null) {
            icVar.b();
        }
    }

    public static ic f(FrameLayout frameLayout, nb nbVar, int i10) {
        if (frameLayout == null) {
            return new ic();
        }
        return new ic(null, frameLayout, nbVar, i10);
    }

    public static ic g(org.telegram.ui.ActionBar.p2 p2Var, eb ebVar, int i10) {
        if (p2Var == null) {
            return new ic();
        }
        if (p2Var instanceof org.telegram.ui.xn) {
            nb.access$000(ebVar, -2, 1);
        } else if (p2Var instanceof org.telegram.ui.py) {
            nb.access$000(ebVar, -1, 0);
        }
        return new ic(p2Var, p2Var.getBulletinLayoutContainer(), ebVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z4) {
        nb nbVar = this.f27741e;
        if (nbVar != null && this.f27747l) {
            this.f27747l = false;
            if (f27737w == this) {
                f27737w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f46438a;
            if (nbVar.isLaidOut() || this.f27755t) {
                nbVar.removeCallbacks(this.f27744i);
                if (z4) {
                    nbVar.transitionRunningExit = true;
                    nbVar.delegate = this.f27751p;
                    nbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f28091a = j10;
                        this.f27752q = obj;
                    } else if (nbVar != null && this.f27752q == null) {
                        this.f27752q = nbVar.createTransition();
                    }
                    mb mbVar = this.f27752q;
                    Objects.requireNonNull(nbVar);
                    mbVar.c(nbVar, new wa(nbVar, 0), new ua(this, 1), new xa(this, 0));
                    return;
                }
            }
            fb fbVar = this.f27751p;
            if (fbVar != null && !nbVar.top) {
                fbVar.c(0.0f);
                this.f27751p.d(this);
            }
            nbVar.onExitTransitionStart();
            nbVar.onExitTransitionEnd();
            nbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new ua(this, 2));
            }
            nbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z4) {
        boolean z10;
        nb nbVar;
        if (z4 && this.f27749n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27748m != z10 && (nbVar = this.f27741e) != null) {
            this.f27748m = z10;
            Runnable runnable = this.f27744i;
            if (z10) {
                int i10 = this.f27745j;
                if (i10 >= 0) {
                    nbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            nbVar.removeCallbacks(runnable);
        }
    }

    public ic j() {
        k(false);
        return this;
    }

    public final void k(final boolean z4) {
        FrameLayout frameLayout;
        if (!this.f27747l && (frameLayout = this.h) != 0) {
            this.f27747l = true;
            nb nbVar = this.f27741e;
            nbVar.setTop(z4);
            CharSequence accessibilityText = nbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = nbVar.getParent();
            za zaVar = this.f27742f;
            if (parent == zaVar) {
                ic icVar = f27737w;
                if (icVar != null) {
                    icVar.b();
                }
                f27737w = this;
                nbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        ic icVar2 = ic.this;
                        fb fbVar = icVar2.f27751p;
                        if ((fbVar == null || fbVar.a()) && !z4) {
                            fb fbVar2 = icVar2.f27751p;
                            if (fbVar2 != null) {
                                i18 = fbVar2.f(icVar2.f27738a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = icVar2.f27750o;
                            if (i19 != i18) {
                                o1.j jVar = icVar2.d;
                                if (jVar != null && jVar.f16330f) {
                                    jVar.f16336u.f16343i = i18;
                                } else {
                                    o1.j jVar2 = new o1.j(new kb.a(i19));
                                    o1.k kVar = new o1.k();
                                    kVar.f16343i = i18;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f16336u = kVar;
                                    icVar2.d = jVar2;
                                    jVar2.b(new f7(icVar2, 1));
                                    icVar2.d.a(new ya(icVar2, 0));
                                }
                                icVar2.d.f();
                            }
                        }
                    }
                };
                this.f27740c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                nbVar.addOnLayoutChangeListener(new ab(this, z4));
                if (!this.f27755t) {
                    nbVar.addOnAttachStateChangeListener(new ff.b(this, 10));
                }
                frameLayout.addView(zaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        nb nbVar = this.f27741e;
        if (nbVar != null) {
            nbVar.updatePosition();
        }
    }

    public ic(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, nb nbVar, int i10) {
        this.f27744i = new ua(this, 0);
        this.f27753r = true;
        this.f27756u = true;
        this.f27741e = nbVar;
        this.f27749n = true ^ (nbVar instanceof ob);
        this.f27742f = new za(this, nbVar, frameLayout);
        this.f27743g = p2Var;
        this.h = frameLayout;
        this.f27745j = i10;
    }
}
