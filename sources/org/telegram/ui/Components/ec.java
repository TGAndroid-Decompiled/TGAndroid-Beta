package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public class ec {

    public static ec f28012w;

    public int f28013a;

    public int f28014b;

    public ta f28015c;
    public o1.j d;

    public final jb f28016e;

    public final xa f28017f;

    public final org.telegram.ui.ActionBar.n2 f28018g;
    public final FrameLayout h;

    public final Runnable f28019i;

    public int f28020j;

    public boolean f28021k;

    public boolean f28022l;

    public boolean f28023m;

    public boolean f28024n;

    public int f28025o;

    public db f28026p;

    public ib f28027q;

    public boolean f28028r;

    public boolean f28029s;

    public boolean f28030t;

    public boolean f28031u;
    public Runnable v;

    public ec() {
        this.f28019i = new sa(this, 0);
        this.f28024n = true;
        this.f28028r = true;
        this.f28031u = true;
        this.f28016e = null;
        this.f28017f = null;
        this.f28018g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, db dbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, dbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ec ecVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                ecVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof jb) {
                ecVar = ((jb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (ecVar != null) {
            ecVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ec ecVar = f28012w;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    public static ec f(FrameLayout frameLayout, jb jbVar, int i10) {
        return frameLayout == null ? new eb() : new ec(null, frameLayout, jbVar, i10);
    }

    public static ec g(org.telegram.ui.ActionBar.n2 n2Var, cb cbVar, int i10) {
        if (n2Var == null) {
            return new eb();
        }
        if (n2Var instanceof org.telegram.ui.rn) {
            jb.access$000(cbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.gy) {
            jb.access$000(cbVar, -1, 0);
        }
        return new ec(n2Var, n2Var.getBulletinLayoutContainer(), cbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        jb jbVar = this.f28016e;
        if (jbVar != null && this.f28022l) {
            int i10 = 0;
            this.f28022l = false;
            if (f28012w == this) {
                f28012w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f46605a;
            if (jbVar.isLaidOut() || this.f28030t) {
                jbVar.removeCallbacks(this.f28019i);
                if (z10) {
                    int i11 = 1;
                    jbVar.transitionRunningExit = true;
                    jbVar.delegate = this.f28026p;
                    jbVar.invalidate();
                    if (j10 >= 0) {
                        m3.n nVar = new m3.n();
                        nVar.f17620a = j10;
                        this.f28027q = nVar;
                    } else if (jbVar != null && this.f28027q == null) {
                        this.f28027q = jbVar.createTransition();
                    }
                    ib ibVar = this.f28027q;
                    Objects.requireNonNull(jbVar);
                    ibVar.c(jbVar, new ua(jbVar, i10), new sa(this, i11), new va(this, i10));
                    return;
                }
            }
            db dbVar = this.f28026p;
            if (dbVar != null && !jbVar.top) {
                dbVar.c(0.0f);
                this.f28026p.d(this);
            }
            jbVar.onExitTransitionStart();
            jbVar.onExitTransitionEnd();
            jbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new sa(this, 2));
            }
            jbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        jb jbVar;
        boolean z11 = z10 && this.f28024n;
        if (this.f28023m == z11 || (jbVar = this.f28016e) == null) {
            return;
        }
        this.f28023m = z11;
        Runnable runnable = this.f28019i;
        if (!z11) {
            jbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.f28020j;
        if (i10 >= 0) {
            jbVar.postDelayed(runnable, i10);
        }
    }

    public ec j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.f28022l || (frameLayout = this.h) == 0) {
            return;
        }
        this.f28022l = true;
        jb jbVar = this.f28016e;
        jbVar.setTop(z10);
        CharSequence accessibilityText = jbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = jbVar.getParent();
        xa xaVar = this.f28017f;
        if (parent != xaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        ec ecVar = f28012w;
        if (ecVar != null) {
            ecVar.b();
        }
        f28012w = this;
        jbVar.onAttach(this);
        ?? r10 = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                ec ecVar2 = this.f32724a;
                db dbVar = ecVar2.f28026p;
                if ((dbVar == null || dbVar.a()) && !z10) {
                    db dbVar2 = ecVar2.f28026p;
                    int iF = dbVar2 != null ? dbVar2.f(ecVar2.f28013a) : 0;
                    int i18 = ecVar2.f28025o;
                    if (i18 != iF) {
                        o1.j jVar = ecVar2.d;
                        if (jVar == null || !jVar.f19141f) {
                            o1.j jVar2 = new o1.j(new hb.a(i18));
                            o1.k kVar = new o1.k();
                            kVar.f19154i = iF;
                            kVar.b(900.0f);
                            kVar.a(1.0f);
                            jVar2.f19147u = kVar;
                            ecVar2.d = jVar2;
                            jVar2.b(new e7(ecVar2, 1));
                            ecVar2.d.a(new wa(ecVar2, 0));
                        } else {
                            jVar.f19147u.f19154i = iF;
                        }
                        ecVar2.d.f();
                    }
                }
            }
        };
        this.f28015c = r10;
        frameLayout.addOnLayoutChangeListener(r10);
        jbVar.addOnLayoutChangeListener(new ya(this, z10));
        if (!this.f28030t) {
            jbVar.addOnAttachStateChangeListener(new bf.b(this, 10));
        }
        frameLayout.addView(xaVar);
    }

    public final void l() {
        jb jbVar = this.f28016e;
        if (jbVar != null) {
            jbVar.updatePosition();
        }
    }

    public ec(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, jb jbVar, int i10) {
        this.f28019i = new sa(this, 0);
        this.f28028r = true;
        this.f28031u = true;
        this.f28016e = jbVar;
        this.f28024n = true ^ (jbVar instanceof kb);
        this.f28017f = new xa(this, jbVar, frameLayout);
        this.f28018g = n2Var;
        this.h = frameLayout;
        this.f28020j = i10;
    }
}
