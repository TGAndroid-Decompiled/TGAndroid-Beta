package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class sc {
    public static sc f30825w;
    public int f30826a;
    public int f30827b;
    public gb f30828c;
    public o1.k d;
    public final wb f30829e;
    public final kb f30830f;
    public final org.telegram.ui.ActionBar.m2 f30831g;
    public final FrameLayout h;
    public final Runnable f30832i;
    public int f30833j;
    public boolean f30834k;
    public boolean f30835l;
    public boolean f30836m;
    public boolean f30837n;
    public int f30838o;
    public qb f30839p;
    public vb f30840q;
    public boolean f30841r;
    public boolean f30842s;
    public boolean f30843t;
    public boolean f30844u;
    public Runnable v;

    public sc() {
        this.f30832i = new fb(this, 0);
        this.f30837n = true;
        this.f30841r = true;
        this.f30844u = true;
        this.f30829e = null;
        this.f30830f = null;
        this.f30831g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, qb qbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, qbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        sc scVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof wb) {
                    scVar = ((wb) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                scVar = null;
                break;
            }
        }
        if (scVar != null) {
            scVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        sc scVar = f30825w;
        if (scVar != null) {
            scVar.b();
        }
    }

    public static sc f(FrameLayout frameLayout, wb wbVar, int i10) {
        if (frameLayout == null) {
            return new sc();
        }
        return new sc(null, frameLayout, wbVar, i10);
    }

    public static sc g(org.telegram.ui.ActionBar.m2 m2Var, pb pbVar, int i10) {
        if (m2Var == null) {
            return new sc();
        }
        if (m2Var instanceof org.telegram.ui.zn) {
            wb.access$000(pbVar, -2, 1);
        } else if (m2Var instanceof org.telegram.ui.sy) {
            wb.access$000(pbVar, -1, 0);
        }
        return new sc(m2Var, m2Var.getBulletinLayoutContainer(), pbVar, i10);
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
        wb wbVar = this.f30829e;
        if (wbVar != null && this.f30835l) {
            this.f30835l = false;
            if (f30825w == this) {
                f30825w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f46890a;
            if (wbVar.isLaidOut() || this.f30843t) {
                wbVar.removeCallbacks(this.f30832i);
                if (z10) {
                    wbVar.transitionRunningExit = true;
                    wbVar.delegate = this.f30839p;
                    wbVar.invalidate();
                    if (j3 >= 0) {
                        ?? obj = new Object();
                        obj.f4150a = j3;
                        this.f30840q = obj;
                    } else if (wbVar != null && this.f30840q == null) {
                        this.f30840q = wbVar.createTransition();
                    }
                    vb vbVar = this.f30840q;
                    Objects.requireNonNull(wbVar);
                    vbVar.c(wbVar, new hb(wbVar, 0), new fb(this, 1), new ib(this, 0));
                    return;
                }
            }
            qb qbVar = this.f30839p;
            if (qbVar != null && !wbVar.top) {
                qbVar.c(0.0f);
                this.f30839p.d(this);
            }
            wbVar.onExitTransitionStart();
            wbVar.onExitTransitionEnd();
            wbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new fb(this, 2));
            }
            wbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        wb wbVar;
        if (z10 && this.f30837n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f30836m != z11 && (wbVar = this.f30829e) != null) {
            this.f30836m = z11;
            Runnable runnable = this.f30832i;
            if (z11) {
                int i10 = this.f30833j;
                if (i10 >= 0) {
                    wbVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            wbVar.removeCallbacks(runnable);
        }
    }

    public sc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f30835l && (frameLayout = this.h) != 0) {
            this.f30835l = true;
            wb wbVar = this.f30829e;
            wbVar.setTop(z10);
            CharSequence accessibilityText = wbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = wbVar.getParent();
            kb kbVar = this.f30830f;
            if (parent == kbVar) {
                sc scVar = f30825w;
                if (scVar != null) {
                    scVar.b();
                }
                f30825w = this;
                wbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        sc scVar2 = sc.this;
                        qb qbVar = scVar2.f30839p;
                        if ((qbVar == null || qbVar.a()) && !z10) {
                            qb qbVar2 = scVar2.f30839p;
                            if (qbVar2 != null) {
                                i18 = qbVar2.f(scVar2.f30826a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = scVar2.f30838o;
                            if (i19 != i18) {
                                o1.k kVar = scVar2.d;
                                if (kVar != null && kVar.f17017f) {
                                    kVar.f17024u.f17031i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f17031i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f17024u = lVar;
                                    scVar2.d = kVar2;
                                    kVar2.b(new m7(scVar2, 1));
                                    scVar2.d.a(new jb(scVar2, 0));
                                }
                                scVar2.d.h();
                            }
                        }
                    }
                };
                this.f30828c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                wbVar.addOnLayoutChangeListener(new lb(this, z10));
                if (!this.f30843t) {
                    wbVar.addOnAttachStateChangeListener(new ai.v2(this, 6));
                }
                frameLayout.addView(kbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        wb wbVar = this.f30829e;
        if (wbVar != null) {
            wbVar.updatePosition();
        }
    }

    public sc(org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, wb wbVar, int i10) {
        this.f30832i = new fb(this, 0);
        this.f30841r = true;
        this.f30844u = true;
        this.f30829e = wbVar;
        this.f30837n = true ^ (wbVar instanceof xb);
        this.f30830f = new kb(this, wbVar, frameLayout);
        this.f30831g = m2Var;
        this.h = frameLayout;
        this.f30833j = i10;
    }
}
