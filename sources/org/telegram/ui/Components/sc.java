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
    public static sc f29095w;
    public int f29096a;
    public int f29097b;
    public gb f29098c;
    public o1.k d;
    public final wb e;
    public final kb f29099f;
    public final org.telegram.ui.ActionBar.m2 f29100g;
    public final FrameLayout h;
    public final Runnable f29101i;
    public int f29102j;
    public boolean f29103k;
    public boolean f29104l;
    public boolean f29105m;
    public boolean f29106n;
    public int f29107o;
    public qb f29108p;
    public vb f29109q;
    public boolean f29110r;
    public boolean f29111s;
    public boolean f29112t;
    public boolean f29113u;
    public Runnable v;

    public sc() {
        this.f29101i = new fb(this, 0);
        this.f29106n = true;
        this.f29110r = true;
        this.f29113u = true;
        this.e = null;
        this.f29099f = null;
        this.f29100g = null;
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
        sc scVar = f29095w;
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
        if (wbVar != null && this.f29104l) {
            this.f29104l = false;
            if (f29095w == this) {
                f29095w = null;
            }
            WeakHashMap weakHashMap = r0.j0.f43732a;
            if (wbVar.isLaidOut() || this.f29112t) {
                wbVar.removeCallbacks(this.f29101i);
                if (z10) {
                    wbVar.transitionRunningExit = true;
                    wbVar.delegate = this.f29108p;
                    wbVar.invalidate();
                    if (j10 >= 0) {
                        ?? obj = new Object();
                        obj.f4279a = j10;
                        this.f29109q = obj;
                    } else if (wbVar != null && this.f29109q == null) {
                        this.f29109q = wbVar.createTransition();
                    }
                    vb vbVar = this.f29109q;
                    Objects.requireNonNull(wbVar);
                    vbVar.d(wbVar, new hb(wbVar, 0), new fb(this, 1), new ib(this, 0));
                    return;
                }
            }
            qb qbVar = this.f29108p;
            if (qbVar != null && !wbVar.top) {
                qbVar.c(0.0f);
                this.f29108p.d(this);
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
        if (z10 && this.f29106n) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29105m != z11 && (wbVar = this.e) != null) {
            this.f29105m = z11;
            Runnable runnable = this.f29101i;
            if (z11) {
                int i10 = this.f29102j;
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
        if (!this.f29104l && (frameLayout = this.h) != 0) {
            this.f29104l = true;
            wb wbVar = this.e;
            wbVar.setTop(z10);
            CharSequence accessibilityText = wbVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = wbVar.getParent();
            kb kbVar = this.f29099f;
            if (parent == kbVar) {
                sc scVar = f29095w;
                if (scVar != null) {
                    scVar.b();
                }
                f29095w = this;
                wbVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        sc scVar2 = sc.this;
                        qb qbVar = scVar2.f29108p;
                        if ((qbVar == null || qbVar.a()) && !z10) {
                            qb qbVar2 = scVar2.f29108p;
                            if (qbVar2 != null) {
                                i18 = qbVar2.f(scVar2.f29096a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = scVar2.f29107o;
                            if (i19 != i18) {
                                o1.k kVar = scVar2.d;
                                if (kVar != null && kVar.f16461f) {
                                    kVar.f16468u.f16474i = i18;
                                } else {
                                    o1.k kVar2 = new o1.k(new o1.j(i19));
                                    o1.l lVar = new o1.l();
                                    lVar.f16474i = i18;
                                    lVar.b(900.0f);
                                    lVar.a(1.0f);
                                    kVar2.f16468u = lVar;
                                    scVar2.d = kVar2;
                                    kVar2.b(new n7(scVar2, 1));
                                    scVar2.d.a(new jb(scVar2, 0));
                                }
                                scVar2.d.h();
                            }
                        }
                    }
                };
                this.f29098c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                wbVar.addOnLayoutChangeListener(new lb(this, z10));
                if (!this.f29112t) {
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
        this.f29101i = new fb(this, 0);
        this.f29110r = true;
        this.f29113u = true;
        this.e = wbVar;
        this.f29106n = true ^ (wbVar instanceof xb);
        this.f29099f = new kb(this, wbVar, frameLayout);
        this.f29100g = m2Var;
        this.h = frameLayout;
        this.f29102j = i10;
    }
}
