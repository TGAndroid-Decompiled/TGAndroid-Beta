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
    public static ic f27770w;
    public int f27771a;
    public int f27772b;
    public va f27773c;
    public o1.j d;
    public final nb f27774e;
    public final za f27775f;
    public final org.telegram.ui.ActionBar.p2 f27776g;
    public final FrameLayout h;
    public final Runnable f27777i;
    public int f27778j;
    public boolean f27779k;
    public boolean f27780l;
    public boolean f27781m;
    public boolean f27782n;
    public int f27783o;
    public fb f27784p;
    public mb f27785q;
    public boolean f27786r;
    public boolean f27787s;
    public boolean f27788t;
    public boolean f27789u;
    public Runnable v;

    public ic() {
        this.f27777i = new ua(this, 0);
        this.f27782n = true;
        this.f27786r = true;
        this.f27789u = true;
        this.f27774e = null;
        this.f27775f = null;
        this.f27776g = null;
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
        ic icVar = f27770w;
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
        nb nbVar = this.f27774e;
        if (nbVar != null && this.f27780l) {
            this.f27780l = false;
            if (f27770w == this) {
                f27770w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f46469a;
            if (nbVar.isLaidOut() || this.f27788t) {
                nbVar.removeCallbacks(this.f27777i);
                if (z4) {
                    nbVar.transitionRunningExit = true;
                    nbVar.delegate = this.f27784p;
                    nbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f28078a = j10;
                        this.f27785q = obj;
                    } else if (nbVar != null && this.f27785q == null) {
                        this.f27785q = nbVar.createTransition();
                    }
                    mb mbVar = this.f27785q;
                    Objects.requireNonNull(nbVar);
                    mbVar.c(nbVar, new wa(nbVar, 0), new ua(this, 1), new xa(this, 0));
                    return;
                }
            }
            fb fbVar = this.f27784p;
            if (fbVar != null && !nbVar.top) {
                fbVar.c(0.0f);
                this.f27784p.d(this);
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
        if (z4 && this.f27782n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27781m != z10 && (nbVar = this.f27774e) != null) {
            this.f27781m = z10;
            Runnable runnable = this.f27777i;
            if (z10) {
                int i10 = this.f27778j;
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
        if (!this.f27780l && (frameLayout = this.h) != 0) {
            this.f27780l = true;
            nb nbVar = this.f27774e;
            nbVar.setTop(z4);
            CharSequence accessibilityText = nbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = nbVar.getParent();
            za zaVar = this.f27775f;
            if (parent == zaVar) {
                ic icVar = f27770w;
                if (icVar != null) {
                    icVar.b();
                }
                f27770w = this;
                nbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        ic icVar2 = ic.this;
                        fb fbVar = icVar2.f27784p;
                        if ((fbVar == null || fbVar.a()) && !z4) {
                            fb fbVar2 = icVar2.f27784p;
                            if (fbVar2 != null) {
                                i18 = fbVar2.f(icVar2.f27771a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = icVar2.f27783o;
                            if (i19 != i18) {
                                o1.j jVar = icVar2.d;
                                if (jVar != null && jVar.f16332f) {
                                    jVar.f16338u.f16345i = i18;
                                } else {
                                    o1.j jVar2 = new o1.j(new kb.a(i19));
                                    o1.k kVar = new o1.k();
                                    kVar.f16345i = i18;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f16338u = kVar;
                                    icVar2.d = jVar2;
                                    jVar2.b(new f7(icVar2, 1));
                                    icVar2.d.a(new ya(icVar2, 0));
                                }
                                icVar2.d.f();
                            }
                        }
                    }
                };
                this.f27773c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                nbVar.addOnLayoutChangeListener(new ab(this, z4));
                if (!this.f27788t) {
                    nbVar.addOnAttachStateChangeListener(new ff.b(this, 10));
                }
                frameLayout.addView(zaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        nb nbVar = this.f27774e;
        if (nbVar != null) {
            nbVar.updatePosition();
        }
    }

    public ic(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, nb nbVar, int i10) {
        this.f27777i = new ua(this, 0);
        this.f27786r = true;
        this.f27789u = true;
        this.f27774e = nbVar;
        this.f27782n = true ^ (nbVar instanceof ob);
        this.f27775f = new za(this, nbVar, frameLayout);
        this.f27776g = p2Var;
        this.h = frameLayout;
        this.f27778j = i10;
    }
}
