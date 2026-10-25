package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public class qc {
    public static qc f31880x;
    public int f31881a;
    public int f31882b;
    public eb f31883c;
    public o1.j d;
    public final ub e;
    public final ib f31884f;
    public final org.telegram.ui.ActionBar.r2 f31885g;
    public final FrameLayout h;
    public final Runnable f31886i;
    public int f31887j;
    public boolean f31888k;
    public boolean f31889l;
    public boolean f31890m;
    public boolean f31891n;
    public boolean f31892o;
    public int f31893p;
    public ob f31894q;
    public tb f31895r;
    public boolean f31896s;
    public boolean f31897t;
    public boolean f31898u;
    public boolean v;
    public Runnable f31899w;

    public qc() {
        this.f31886i = new db(this, 0);
        this.f31892o = true;
        this.f31896s = true;
        this.v = true;
        this.e = null;
        this.f31884f = null;
        this.f31885g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ob obVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, obVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        qc qcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = frameLayout.getChildAt(i10);
                if (childAt instanceof ub) {
                    qcVar = ((ub) childAt).bulletin;
                    break;
                }
                i10++;
            } else {
                qcVar = null;
                break;
            }
        }
        if (qcVar != null) {
            qcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        qc qcVar = f31880x;
        if (qcVar != null) {
            qcVar.b();
        }
    }

    public static qc f(FrameLayout frameLayout, ub ubVar, int i10) {
        if (frameLayout == null) {
            return new qc();
        }
        return new qc(null, frameLayout, ubVar, i10);
    }

    public static qc g(org.telegram.ui.ActionBar.r2 r2Var, ub ubVar, int i10) {
        if (r2Var == null) {
            return new qc();
        }
        if (r2Var instanceof org.telegram.ui.un) {
            ub.access$000(ubVar, -2, 1);
        } else if (r2Var instanceof org.telegram.ui.cy) {
            ub.access$000(ubVar, -1, 0);
        }
        return new qc(r2Var, r2Var.getBulletinLayoutContainer(), ubVar, i10);
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
        ub ubVar = this.e;
        if (ubVar != null && this.f31890m) {
            this.f31890m = false;
            if (f31880x == this) {
                f31880x = null;
            }
            WeakHashMap weakHashMap = r0.i0.f47105a;
            if (ubVar.isLaidOut() || this.f31898u) {
                ubVar.removeCallbacks(this.f31886i);
                if (z10) {
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.f31894q;
                    ubVar.invalidate();
                    if (j10 >= 0 && !this.f31889l) {
                        ?? obj = new Object();
                        obj.f6092a = j10;
                        this.f31895r = obj;
                    } else if (ubVar != null && this.f31895r == null) {
                        this.f31895r = ubVar.createTransition();
                    }
                    tb tbVar = this.f31895r;
                    Objects.requireNonNull(ubVar);
                    tbVar.o(ubVar, new fb(ubVar, 0), new db(this, 1), new gb(this, 0));
                    return;
                }
            }
            ob obVar = this.f31894q;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.f31894q.d(this);
            }
            ubVar.onExitTransitionStart();
            ubVar.onExitTransitionEnd();
            ubVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new db(this, 2));
            }
            ubVar.onDetach();
            Runnable runnable = this.f31899w;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        ub ubVar;
        if (z10 && this.f31892o) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f31891n != z11 && (ubVar = this.e) != null) {
            this.f31891n = z11;
            Runnable runnable = this.f31886i;
            if (z11) {
                int i10 = this.f31887j;
                if (i10 >= 0) {
                    ubVar.postDelayed(runnable, i10);
                    return;
                }
                return;
            }
            ubVar.removeCallbacks(runnable);
        }
    }

    public qc j() {
        k(false);
        return this;
    }

    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (!this.f31890m && (frameLayout = this.h) != 0) {
            this.f31890m = true;
            ub ubVar = this.e;
            ubVar.setTop(z10);
            CharSequence accessibilityText = ubVar.getAccessibilityText();
            if (accessibilityText != null) {
                AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
            }
            ViewParent parent = ubVar.getParent();
            ib ibVar = this.f31884f;
            if (parent == ibVar) {
                qc qcVar = f31880x;
                if (qcVar != null) {
                    qcVar.b();
                }
                f31880x = this;
                ubVar.onAttach(this);
                ?? r22 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        int i18;
                        qc qcVar2 = qc.this;
                        ob obVar = qcVar2.f31894q;
                        if ((obVar == null || obVar.a()) && !z10) {
                            ob obVar2 = qcVar2.f31894q;
                            if (obVar2 != null) {
                                i18 = obVar2.f(qcVar2.f31881a);
                            } else {
                                i18 = 0;
                            }
                            int i19 = qcVar2.f31893p;
                            if (i19 != i18) {
                                o1.j jVar = qcVar2.d;
                                if (jVar != null && jVar.f18963f) {
                                    jVar.f18969u.f18975i = i18;
                                } else {
                                    o1.j jVar2 = new o1.j(new ac.a(i19));
                                    o1.k kVar = new o1.k();
                                    kVar.f18975i = i18;
                                    kVar.b(900.0f);
                                    kVar.a(1.0f);
                                    jVar2.f18969u = kVar;
                                    qcVar2.d = jVar2;
                                    jVar2.b(new n7(qcVar2, 1));
                                    qcVar2.d.a(new hb(qcVar2, 0));
                                }
                                qcVar2.d.h();
                            }
                        }
                    }
                };
                this.f31883c = r22;
                frameLayout.addOnLayoutChangeListener(r22);
                ubVar.addOnLayoutChangeListener(new jb(this, z10));
                if (!this.f31898u) {
                    ubVar.addOnAttachStateChangeListener(new bi.i6(this, 7));
                }
                frameLayout.addView(ibVar);
                return;
            }
            throw new IllegalStateException("Layout has incorrect parent");
        }
    }

    public final void l() {
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.updatePosition();
        }
    }

    public qc(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.f31886i = new db(this, 0);
        this.f31896s = true;
        this.v = true;
        this.e = ubVar;
        this.f31892o = true ^ (ubVar instanceof vb);
        this.f31884f = new ib(this, ubVar, frameLayout);
        this.f31885g = r2Var;
        this.h = frameLayout;
        this.f31887j = i10;
    }
}
