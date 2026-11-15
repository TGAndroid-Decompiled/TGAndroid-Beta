package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.p21;
import org.telegram.ui.oy0;
public final class e9 implements ActionMode.Callback {
    public final int f30189a;
    public Object f30190b;
    public final Object f30191c;

    public e9(ft ftVar, ActionMode.Callback callback) {
        this.f30189a = 1;
        this.f30191c = ftVar;
        this.f30190b = callback;
    }

    public void b(Menu menu) {
        boolean z10;
        hd.E0().f24129y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((u9) this.f30191c).f31754k0 != null && ((String) this.f30190b) != null && !oy0.d0().contains((String) this.f30190b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        gj gjVar;
        CharSequence s5;
        int i7 = this.f30189a;
        Object obj = this.f30191c;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) obj;
                f fVar = u9Var.m0;
                if (u9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (u9Var.x() && u9Var.b()) {
                            if (!u9Var.C()) {
                                CharSequence r10 = u9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            u9Var.u();
                            u9Var.f(true);
                            c8.fa faVar = u9Var.D;
                            if (faVar != null) {
                                faVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!u9Var.J() && (s5 = u9Var.s(u9Var.W, false)) != null) {
                            u9Var.f31767u = 0;
                            u9Var.v = s5.length();
                            u9Var.u();
                            u9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.h3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (u9Var.f31754k0 != null) {
                            String language = hd.E0().f24129y.getLanguage();
                            org.telegram.ui.s sVar = u9Var.f31754k0;
                            CharSequence r11 = u9Var.r();
                            f fVar2 = new f(this, 10);
                            org.telegram.ui.g4 g4Var = sVar.f51060a;
                            p21.V0(g4Var.M, g4Var.N, (String) this.f30190b, language, r11, null, fVar2);
                        }
                        u9Var.u();
                    } else if (itemId == 2131296502) {
                        if (u9Var.x()) {
                            p9 p9Var = u9Var.W;
                            if (p9Var instanceof q1) {
                                gjVar = ((q1) p9Var).getMessageObject();
                            } else {
                                gjVar = null;
                            }
                            if (gjVar != null && u9Var.r() != null) {
                                u9Var.I(u9Var.f31767u, u9Var.v, gjVar);
                                u9Var.f(true);
                            }
                        }
                        u9Var.u();
                    } else if (itemId == 16908320) {
                        u9Var.D();
                        u9Var.u();
                    } else if (itemId == 16908322) {
                        u9Var.H();
                        u9Var.u();
                    } else {
                        u9Var.f(false);
                    }
                }
                return true;
            default:
                if (((ft) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.f30190b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f30189a) {
            case 0:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296502, 1, hd.M0(2131746440, null));
                menu.add(0, 3, 2, hd.M0(2131743956, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((ft) this.f30191c).F();
                return ((ActionMode.Callback) this.f30190b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f30189a) {
            case 0:
                return;
            default:
                ((ft) this.f30191c).E();
                ((ActionMode.Callback) this.f30190b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        u9 u9Var;
        p9 p9Var;
        switch (this.f30189a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296502);
                if (findItem != null) {
                    findItem.setVisible(((u9) this.f30191c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((u9) this.f30191c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (p9Var = (u9Var = (u9) this.f30191c).W) != null) {
                    CharSequence s5 = u9Var.s(p9Var, false);
                    if (!((u9) this.f30191c).b()) {
                        findItem3.setVisible(false);
                    } else if (((u9) this.f30191c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        u9 u9Var2 = (u9) this.f30191c;
                        if (!u9Var2.Z && (u9Var2.f31767u > 0 || u9Var2.v < s5.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((u9) this.f30191c) instanceof oi.e3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    u9 u9Var3 = (u9) this.f30191c;
                    if (u9Var3 instanceof oi.e3) {
                        try {
                            t9 t9Var = u9Var3.C;
                            if (t9Var != null) {
                                context = t9Var.getContext();
                            } else {
                                context = org.telegram.messenger.t0.f26600b;
                            }
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z10 = true;
                                findItem5.setVisible(z10);
                            }
                        }
                    }
                    z10 = false;
                    findItem5.setVisible(z10);
                }
                u9 u9Var4 = (u9) this.f30191c;
                if (u9Var4.f31754k0 != null && u9Var4.r() != null) {
                    org.telegram.messenger.b6.d(((u9) this.f30191c).r().toString(), new d9(this, menu), new d9(this, menu), false);
                } else {
                    this.f30190b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f30190b).onPrepareActionMode(actionMode, menu);
        }
    }

    public e9(u9 u9Var) {
        this.f30189a = 0;
        this.f30191c = u9Var;
        this.f30190b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
