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
    public static sc f28798w;
    public int f28799a;
    public int f28800b;
    public gb f28801c;
    public o1.k d;
    public final wb e;
    public final kb f28802f;
    public final org.telegram.ui.ActionBar.m2 f28803g;
    public final FrameLayout h;
    public final Runnable f28804i;
    public int f28805j;
    public boolean f28806k;
    public boolean f28807l;
    public boolean f28808m;
    public boolean f28809n;
    public int f28810o;
    public qb f28811p;
    public vb f28812q;
    public boolean f28813r;
    public boolean f28814s;
    public boolean f28815t;
    public boolean f28816u;
    public Runnable v;

    public sc() {
        this.f28804i = new fb(this, 0);
        this.f28809n = true;
        this.f28813r = true;
        this.f28816u = true;
        this.e = null;
        this.f28802f = null;
        this.f28803g = null;
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
        sc scVar = f28798w;
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
        if (m2Var instanceof org.telegram.ui.fo) {
            wb.access$000(pbVar, -2, 1);
        } else if (m2Var instanceof org.telegram.ui.yy) {
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

    public final void c(long j10, boolean z10) {
        wb wbVar = this.e;
        if (wbVar != null && this.f28807l) {
            this.f28807l = false;
            if (f28798w == this) {
                f28798w = null;
            }
            WeakHashMap weakHashMap = r0.i0.f43485a;
            if (wbVar.isLaidOut() || this.f28815t) {
                wbVar.removeCallbacks(this.f28804i);
                if (z10) {
                    wbVar.transitionRunningExit = true;
                    wbVar.delegate = this.f28811p;
                    wbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f4283a = j10;
                        this.f28812q = obj;
                    } else if (wbVar != null && this.f28812q == null) {
                        this.f28812q = wbVar.createTransition();
                    }
                    vb vbVar = this.f28812q;
                    Objects.requireNonNull(wbVar);
                    vbVar.d(wbVar, new hb(wbVar, 0), new fb(this, 1), new ib(this, 0));
                    return;
                }
            }
            qb qbVar = this.f28811p;
            if (qbVar != null && !wbVar.top) {
                qbVar.c(0.0f);
                this.f28811p.d(this);
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
        if (z10 && this.f28809n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f28808m != z11 && (wbVar = this.e) != null) {
            this.f28808m = z11;
            Runnable runnable = this.f28804i;
            if (z11) {
                int i10 = this.f28805j;
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
        if (!this.f28807l && (frameLayout = this.h) != 0) {
            this.f28807l = true;
            wb wbVar = this.e;
            wbVar.setTop(z10);
            CharSequence accessibilityText = wbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = wbVar.getParent();
            kb kbVar = this.f28802f;
            if (parent == kbVar) {
                sc scVar = f28798w;
                if (scVar != null) {
                    scVar.b();
                }
                f28798w = this;
                wbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        sc scVar2 = sc.this;
                        qb qbVar = scVar2.f28811p;
                        if ((qbVar == null || qbVar.a()) && !z10) {
                            qb qbVar2 = scVar2.f28811p;
                            if (qbVar2 != null) {
                                i18 = qbVar2.f(scVar2.f28799a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = scVar2.f28810o;
                            if (i19 != i18) {
                                o1.k kVar = scVar2.d;
                                if (kVar != null && kVar.f16154f) {
                                    kVar.f16161u.f16167i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f16167i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f16161u = lVar;
                                    scVar2.d = kVar2;
                                    kVar2.b(new n7(scVar2, 1));
                                    scVar2.d.a(new jb(scVar2, 0));
                                }
                                scVar2.d.h();
                            }
                        }
                    }
                };
                this.f28801c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                wbVar.addOnLayoutChangeListener(new lb(this, z10));
                if (!this.f28815t) {
                    wbVar.addOnAttachStateChangeListener(new bi.j2(this, 6));
                }
                frameLayout.addView(kbVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        wb wbVar = this.e;
        if (wbVar != null) {
            wbVar.updatePosition();
        }
    }

    public sc(org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, wb wbVar, int i10) {
        this.f28804i = new fb(this, 0);
        this.f28813r = true;
        this.f28816u = true;
        this.e = wbVar;
        this.f28809n = true ^ (wbVar instanceof xb);
        this.f28802f = new kb(this, wbVar, frameLayout);
        this.f28803g = m2Var;
        this.h = frameLayout;
        this.f28805j = i10;
    }
}
