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
    public static pc f27304w;
    public int f27305a;
    public int f27306b;
    public db f27307c;
    public o1.k d;
    public final tb e;
    public final hb f27308f;
    public final org.telegram.ui.ActionBar.n2 f27309g;
    public final FrameLayout h;
    public final Runnable f27310i;
    public int f27311j;
    public boolean f27312k;
    public boolean f27313l;
    public boolean f27314m;
    public boolean f27315n;
    public int f27316o;
    public nb f27317p;
    public sb f27318q;
    public boolean f27319r;
    public boolean f27320s;
    public boolean f27321t;
    public boolean f27322u;
    public Runnable v;

    public pc() {
        this.f27310i = new cb(this, 0);
        this.f27315n = true;
        this.f27319r = true;
        this.f27322u = true;
        this.e = null;
        this.f27308f = null;
        this.f27309g = null;
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
        pc pcVar = f27304w;
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

    public static pc g(org.telegram.ui.ActionBar.n2 n2Var, mb mbVar, int i10) {
        if (n2Var == null) {
            return new pc();
        }
        if (n2Var instanceof org.telegram.ui.zn) {
            tb.access$000(mbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.uy) {
            tb.access$000(mbVar, -1, 0);
        }
        return new pc(n2Var, n2Var.getBulletinLayoutContainer(), mbVar, i10);
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
        if (tbVar != null && this.f27313l) {
            this.f27313l = false;
            if (f27304w == this) {
                f27304w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f42163a;
            if (tbVar.isLaidOut() || this.f27321t) {
                tbVar.removeCallbacks(this.f27310i);
                if (z10) {
                    tbVar.transitionRunningExit = true;
                    tbVar.delegate = this.f27317p;
                    tbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f3797a = j3;
                        this.f27318q = obj;
                    } else if (tbVar != null && this.f27318q == null) {
                        this.f27318q = tbVar.createTransition();
                    }
                    sb sbVar = this.f27318q;
                    Objects.requireNonNull(tbVar);
                    sbVar.g(tbVar, new eb(tbVar, 0), new cb(this, 1), new fb(this, 0));
                    return;
                }
            }
            nb nbVar = this.f27317p;
            if (nbVar != null && !tbVar.top) {
                nbVar.c(0.0f);
                this.f27317p.d(this);
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
        if (z10 && this.f27315n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27314m != z11 && (tbVar = this.e) != null) {
            this.f27314m = z11;
            Runnable runnable = this.f27310i;
            if (z11) {
                int i10 = this.f27311j;
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
        if (!this.f27313l && (frameLayout = this.h) != 0) {
            this.f27313l = true;
            tb tbVar = this.e;
            tbVar.setTop(z10);
            CharSequence accessibilityText = tbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = tbVar.getParent();
            hb hbVar = this.f27308f;
            if (parent == hbVar) {
                pc pcVar = f27304w;
                if (pcVar != null) {
                    pcVar.b();
                }
                f27304w = this;
                tbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        pc pcVar2 = pc.this;
                        nb nbVar = pcVar2.f27317p;
                        if ((nbVar == null || nbVar.a()) && !z10) {
                            nb nbVar2 = pcVar2.f27317p;
                            if (nbVar2 != null) {
                                i18 = nbVar2.f(pcVar2.f27305a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = pcVar2.f27316o;
                            if (i19 != i18) {
                                o1.k kVar = pcVar2.d;
                                if (kVar != null && kVar.f15530f) {
                                    kVar.f15537u.f15543i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f15543i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f15537u = lVar;
                                    pcVar2.d = kVar2;
                                    kVar2.b(new j7(pcVar2, 1));
                                    pcVar2.d.a(new gb(pcVar2, 0));
                                }
                                pcVar2.d.f();
                            }
                        }
                    }
                };
                this.f27307c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                tbVar.addOnLayoutChangeListener(new ib(this, z10));
                if (!this.f27321t) {
                    tbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
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

    public pc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, tb tbVar, int i10) {
        this.f27310i = new cb(this, 0);
        this.f27319r = true;
        this.f27322u = true;
        this.e = tbVar;
        this.f27315n = true ^ (tbVar instanceof ub);
        this.f27308f = new hb(this, tbVar, frameLayout);
        this.f27309g = n2Var;
        this.h = frameLayout;
        this.f27311j = i10;
    }
}
