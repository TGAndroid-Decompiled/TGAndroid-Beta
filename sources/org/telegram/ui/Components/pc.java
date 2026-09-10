package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class pc {
    public static pc f26074w;
    public int f26075a;
    public int f26076b;
    public db f26077c;
    public o1.k d;
    public final tb e;
    public final hb f26078f;
    public final org.telegram.ui.ActionBar.p2 f26079g;
    public final FrameLayout h;
    public final Runnable f26080i;
    public int f26081j;
    public boolean f26082k;
    public boolean f26083l;
    public boolean f26084m;
    public boolean f26085n;
    public int f26086o;
    public nb f26087p;
    public sb f26088q;
    public boolean f26089r;
    public boolean f26090s;
    public boolean f26091t;
    public boolean f26092u;
    public Runnable v;

    public pc() {
        this.f26080i = new cb(this, 0);
        this.f26085n = true;
        this.f26089r = true;
        this.f26092u = true;
        this.e = null;
        this.f26078f = null;
        this.f26079g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, nb nbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, nbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        pc pcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof tb) {
                    pcVar = ((tb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                pcVar = null;
                break;
            }
        }
        if (pcVar != null) {
            pcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        pc pcVar = f26074w;
        if (pcVar != null) {
            pcVar.b();
        }
    }

    public static pc f(FrameLayout frameLayout, tb tbVar, int i10) {
        if (frameLayout == null) {
            return new pc();
        }
        return new pc(null, frameLayout, tbVar, i10);
    }

    public static pc g(org.telegram.ui.ActionBar.p2 p2Var, mb mbVar, int i10) {
        if (p2Var == null) {
            return new pc();
        }
        if (p2Var instanceof org.telegram.ui.eo) {
            tb.access$000(mbVar, -2, 1);
        } else if (p2Var instanceof org.telegram.ui.wy) {
            tb.access$000(mbVar, -1, 0);
        }
        return new pc(p2Var, p2Var.getBulletinLayoutContainer(), mbVar, i10);
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
        tb tbVar = this.e;
        if (tbVar != null && this.f26083l) {
            this.f26083l = false;
            if (f26074w == this) {
                f26074w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f41062a;
            if (tbVar.isLaidOut() || this.f26091t) {
                tbVar.removeCallbacks(this.f26080i);
                if (z10) {
                    tbVar.transitionRunningExit = true;
                    tbVar.delegate = this.f26087p;
                    tbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f4212a = j3;
                        this.f26088q = obj;
                    } else if (tbVar != null && this.f26088q == null) {
                        this.f26088q = tbVar.createTransition();
                    }
                    sb sbVar = this.f26088q;
                    Objects.requireNonNull(tbVar);
                    sbVar.k(tbVar, new eb(tbVar, 0), new cb(this, 1), new fb(this, 0));
                    return;
                }
            }
            nb nbVar = this.f26087p;
            if (nbVar != null && !tbVar.top) {
                nbVar.c(0.0f);
                this.f26087p.d(this);
            }
            tbVar.onExitTransitionStart();
            tbVar.onExitTransitionEnd();
            tbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new cb(this, 2));
            }
            tbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        tb tbVar;
        if (z10 && this.f26085n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26084m != z11 && (tbVar = this.e) != null) {
            this.f26084m = z11;
            Runnable runnable = this.f26080i;
            if (z11) {
                int i10 = this.f26081j;
                if (i10 >= 0) {
                    tbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            tbVar.removeCallbacks(runnable);
        }
    }

    public pc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f26083l && (frameLayout = this.h) != 0) {
            this.f26083l = true;
            tb tbVar = this.e;
            tbVar.setTop(z10);
            CharSequence accessibilityText = tbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = tbVar.getParent();
            hb hbVar = this.f26078f;
            if (parent == hbVar) {
                pc pcVar = f26074w;
                if (pcVar != null) {
                    pcVar.b();
                }
                f26074w = this;
                tbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        pc pcVar2 = pc.this;
                        nb nbVar = pcVar2.f26087p;
                        if ((nbVar == null || nbVar.a()) && !z10) {
                            nb nbVar2 = pcVar2.f26087p;
                            if (nbVar2 != null) {
                                i18 = nbVar2.f(pcVar2.f26075a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = pcVar2.f26086o;
                            if (i19 != i18) {
                                o1.k kVar = pcVar2.d;
                                if (kVar != null && kVar.f14127f) {
                                    kVar.f14134u.f14140i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f14140i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f14134u = lVar;
                                    pcVar2.d = kVar2;
                                    kVar2.b(new k7(pcVar2, 1));
                                    pcVar2.d.a(new gb(pcVar2, 0));
                                }
                                pcVar2.d.f();
                            }
                        }
                    }
                };
                this.f26077c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                tbVar.addOnLayoutChangeListener(new ib(this, z10));
                if (!this.f26091t) {
                    tbVar.addOnAttachStateChangeListener(new l.d(this, 4));
                }
                frameLayout.addView(hbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        tb tbVar = this.e;
        if (tbVar != null) {
            tbVar.updatePosition();
        }
    }

    public pc(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, tb tbVar, int i10) {
        this.f26080i = new cb(this, 0);
        this.f26089r = true;
        this.f26092u = true;
        this.e = tbVar;
        this.f26085n = true ^ (tbVar instanceof ub);
        this.f26078f = new hb(this, tbVar, frameLayout);
        this.f26079g = p2Var;
        this.h = frameLayout;
        this.f26081j = i10;
    }
}
