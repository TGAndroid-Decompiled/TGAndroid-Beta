package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.mt;
import org.telegram.ui.ry0;
public final class f9 implements ActionMode.Callback {
    public final int f30709a;
    public Object f30710b;
    public final Object f30711c;

    public f9(mt mtVar, ActionMode.Callback callback) {
        this.f30709a = 1;
        this.f30711c = mtVar;
        this.f30710b = callback;
    }

    public void b(Menu menu) {
        boolean z10;
        gd.E0().f24342y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((v9) this.f30711c).f32276k0 != null && ((String) this.f30710b) != null && !ry0.d0().contains((String) this.f30710b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        fj fjVar;
        CharSequence s5;
        int i7 = this.f30709a;
        Object obj = this.f30711c;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) obj;
                f fVar = v9Var.m0;
                if (v9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (v9Var.x() && v9Var.b()) {
                            if (!v9Var.C()) {
                                CharSequence r10 = v9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            v9Var.u();
                            v9Var.f(true);
                            c8.ia iaVar = v9Var.D;
                            if (iaVar != null) {
                                iaVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!v9Var.J() && (s5 = v9Var.s(v9Var.W, false)) != null) {
                            v9Var.f32289u = 0;
                            v9Var.v = s5.length();
                            v9Var.u();
                            v9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.g3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (v9Var.f32276k0 != null) {
                            String language = gd.E0().f24342y.getLanguage();
                            org.telegram.ui.s sVar = v9Var.f32276k0;
                            CharSequence r11 = v9Var.r();
                            f fVar2 = new f(this, 10);
                            org.telegram.ui.g4 g4Var = sVar.f51927a;
                            a31.W0(g4Var.M, g4Var.N, (String) this.f30710b, language, r11, null, fVar2);
                        }
                        v9Var.u();
                    } else if (itemId == 2131296504) {
                        if (v9Var.x()) {
                            q9 q9Var = v9Var.W;
                            if (q9Var instanceof r1) {
                                fjVar = ((r1) q9Var).getMessageObject();
                            } else {
                                fjVar = null;
                            }
                            if (fjVar != null && v9Var.r() != null) {
                                v9Var.I(v9Var.f32289u, v9Var.v, fjVar);
                                v9Var.f(true);
                            }
                        }
                        v9Var.u();
                    } else if (itemId == 16908320) {
                        v9Var.D();
                        v9Var.u();
                    } else if (itemId == 16908322) {
                        v9Var.H();
                        v9Var.u();
                    } else {
                        v9Var.f(false);
                    }
                }
                return true;
            default:
                if (((mt) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.f30710b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f30709a) {
            case 0:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296504, 1, gd.N0(2131746244, null));
                menu.add(0, 3, 2, gd.N0(2131743709, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((mt) this.f30711c).F();
                return ((ActionMode.Callback) this.f30710b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f30709a) {
            case 0:
                return;
            default:
                ((mt) this.f30711c).E();
                ((ActionMode.Callback) this.f30710b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        v9 v9Var;
        q9 q9Var;
        switch (this.f30709a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296504);
                if (findItem != null) {
                    findItem.setVisible(((v9) this.f30711c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((v9) this.f30711c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (q9Var = (v9Var = (v9) this.f30711c).W) != null) {
                    CharSequence s5 = v9Var.s(q9Var, false);
                    if (!((v9) this.f30711c).b()) {
                        findItem3.setVisible(false);
                    } else if (((v9) this.f30711c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        v9 v9Var2 = (v9) this.f30711c;
                        if (!v9Var2.Z && (v9Var2.f32289u > 0 || v9Var2.v < s5.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((v9) this.f30711c) instanceof oi.h3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    v9 v9Var3 = (v9) this.f30711c;
                    if (v9Var3 instanceof oi.h3) {
                        try {
                            u9 u9Var = v9Var3.C;
                            if (u9Var != null) {
                                context = u9Var.getContext();
                            } else {
                                context = org.telegram.messenger.t0.f27013b;
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
                v9 v9Var4 = (v9) this.f30711c;
                if (v9Var4.f32276k0 != null && v9Var4.r() != null) {
                    org.telegram.messenger.c6.d(((v9) this.f30711c).r().toString(), new e9(this, menu), new e9(this, menu), false);
                } else {
                    this.f30710b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f30710b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(v9 v9Var) {
        this.f30709a = 0;
        this.f30711c = v9Var;
        this.f30710b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
