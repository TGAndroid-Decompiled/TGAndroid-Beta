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
    public static ic f25664w;
    public int f25665a;
    public int f25666b;
    public va f25667c;
    public o1.j d;
    public final nb e;
    public final za f25668f;
    public final org.telegram.ui.ActionBar.p2 f25669g;
    public final FrameLayout h;
    public final Runnable f25670i;
    public int f25671j;
    public boolean f25672k;
    public boolean f25673l;
    public boolean f25674m;
    public boolean f25675n;
    public int f25676o;
    public fb f25677p;
    public mb f25678q;
    public boolean f25679r;
    public boolean f25680s;
    public boolean f25681t;
    public boolean f25682u;
    public Runnable v;

    public ic() {
        this.f25670i = new ua(this, 0);
        this.f25675n = true;
        this.f25679r = true;
        this.f25682u = true;
        this.e = null;
        this.f25668f = null;
        this.f25669g = null;
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
        ic icVar = f25664w;
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
        if (p2Var instanceof org.telegram.ui.zn) {
            nb.access$000(ebVar, -2, 1);
        } else if (p2Var instanceof org.telegram.ui.qy) {
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
        nb nbVar = this.e;
        if (nbVar != null && this.f25673l) {
            this.f25673l = false;
            if (f25664w == this) {
                f25664w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f43142a;
            if (nbVar.isLaidOut() || this.f25681t) {
                nbVar.removeCallbacks(this.f25670i);
                if (z4) {
                    nbVar.transitionRunningExit = true;
                    nbVar.delegate = this.f25677p;
                    nbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f25932a = j10;
                        this.f25678q = obj;
                    } else if (nbVar != null && this.f25678q == null) {
                        this.f25678q = nbVar.createTransition();
                    }
                    mb mbVar = this.f25678q;
                    Objects.requireNonNull(nbVar);
                    mbVar.b(nbVar, new wa(nbVar, 0), new ua(this, 1), new xa(this, 0));
                    return;
                }
            }
            fb fbVar = this.f25677p;
            if (fbVar != null && !nbVar.top) {
                fbVar.c(0.0f);
                this.f25677p.d(this);
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
        if (z4 && this.f25675n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25674m != z10 && (nbVar = this.e) != null) {
            this.f25674m = z10;
            Runnable runnable = this.f25670i;
            if (z10) {
                int i10 = this.f25671j;
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
        if (!this.f25673l && (frameLayout = this.h) != 0) {
            this.f25673l = true;
            nb nbVar = this.e;
            nbVar.setTop(z4);
            CharSequence accessibilityText = nbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = nbVar.getParent();
            za zaVar = this.f25668f;
            if (parent == zaVar) {
                ic icVar = f25664w;
                if (icVar != null) {
                    icVar.b();
                }
                f25664w = this;
                nbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        ic icVar2 = ic.this;
                        fb fbVar = icVar2.f25677p;
                        if ((fbVar == null || fbVar.a()) && !z4) {
                            fb fbVar2 = icVar2.f25677p;
                            if (fbVar2 != null) {
                                i18 = fbVar2.f(icVar2.f25665a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = icVar2.f25676o;
                            if (i19 != i18) {
                                o1.j jVar = icVar2.d;
                                if (jVar != null && jVar.f16172f) {
                                    jVar.f16178u.f16184i = i18;
                                } else {
                                    o1.j jVar2 = new o1.j(new kb.a(i19));
                                    o1.k kVar = new o1.k();
                                    kVar.f16184i = i18;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f16178u = kVar;
                                    icVar2.d = jVar2;
                                    jVar2.b(new f7(icVar2, 1));
                                    icVar2.d.a(new ya(icVar2, 0));
                                }
                                icVar2.d.f();
                            }
                        }
                    }
                };
                this.f25667c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                nbVar.addOnLayoutChangeListener(new ab(this, z4));
                if (!this.f25681t) {
                    nbVar.addOnAttachStateChangeListener(new ef.b(this, 10));
                }
                frameLayout.addView(zaVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        nb nbVar = this.e;
        if (nbVar != null) {
            nbVar.updatePosition();
        }
    }

    public ic(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, nb nbVar, int i10) {
        this.f25670i = new ua(this, 0);
        this.f25679r = true;
        this.f25682u = true;
        this.e = nbVar;
        this.f25675n = true ^ (nbVar instanceof ob);
        this.f25668f = new za(this, nbVar, frameLayout);
        this.f25669g = p2Var;
        this.h = frameLayout;
        this.f25671j = i10;
    }
}
