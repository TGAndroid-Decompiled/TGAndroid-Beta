package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.ot;
import org.telegram.ui.sy0;
public final class g9 implements ActionMode.Callback {
    public final int f30709a;
    public Object f30710b;
    public final Object f30711c;

    public g9(ot otVar, ActionMode.Callback callback) {
        this.f30709a = 1;
        this.f30711c = otVar;
        this.f30710b = callback;
    }

    public void b(Menu menu) {
        boolean z10;
        gd.E0().f24269y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((w9) this.f30711c).f32284k0 != null && ((String) this.f30710b) != null && !sy0.d0().contains((String) this.f30710b)) {
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
                w9 w9Var = (w9) obj;
                f fVar = w9Var.m0;
                if (w9Var.x()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (w9Var.x() && w9Var.b()) {
                            if (!w9Var.C()) {
                                CharSequence r10 = w9Var.r();
                                if (r10 != null) {
                                    org.telegram.messenger.g0.g(r10);
                                }
                            }
                            w9Var.u();
                            w9Var.f(true);
                            c8.ha haVar = w9Var.D;
                            if (haVar != null) {
                                haVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!w9Var.J() && (s5 = w9Var.s(w9Var.W, false)) != null) {
                            w9Var.f32297u = 0;
                            w9Var.v = s5.length();
                            w9Var.u();
                            w9Var.w();
                            org.telegram.messenger.g0.r(fVar);
                            org.telegram.messenger.g0.g3(fVar);
                        }
                    } else if (itemId == 3) {
                        if (w9Var.f32284k0 != null) {
                            String language = gd.E0().f24269y.getLanguage();
                            org.telegram.ui.s sVar = w9Var.f32284k0;
                            CharSequence r11 = w9Var.r();
                            f fVar2 = new f(this, 10);
                            org.telegram.ui.g4 g4Var = sVar.f51795a;
                            b31.W0(g4Var.M, g4Var.N, (String) this.f30710b, language, r11, null, fVar2);
                        }
                        w9Var.u();
                    } else if (itemId == 2131296504) {
                        if (w9Var.x()) {
                            r9 r9Var = w9Var.W;
                            if (r9Var instanceof r1) {
                                fjVar = ((r1) r9Var).getMessageObject();
                            } else {
                                fjVar = null;
                            }
                            if (fjVar != null && w9Var.r() != null) {
                                w9Var.I(w9Var.f32297u, w9Var.v, fjVar);
                                w9Var.f(true);
                            }
                        }
                        w9Var.u();
                    } else if (itemId == 16908320) {
                        w9Var.D();
                        w9Var.u();
                    } else if (itemId == 16908322) {
                        w9Var.H();
                        w9Var.u();
                    } else {
                        w9Var.f(false);
                    }
                }
                return true;
            default:
                if (((ot) obj).H(menuItem.getItemId())) {
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
                menu.add(0, 3, 2, gd.N0(2131743713, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
            default:
                ((ot) this.f30711c).F();
                return ((ActionMode.Callback) this.f30710b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f30709a) {
            case 0:
                return;
            default:
                ((ot) this.f30711c).E();
                ((ActionMode.Callback) this.f30710b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z10;
        w9 w9Var;
        r9 r9Var;
        switch (this.f30709a) {
            case 0:
                MenuItem findItem = menu.findItem(2131296504);
                if (findItem != null) {
                    findItem.setVisible(((w9) this.f30711c).e());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((w9) this.f30711c).b());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (r9Var = (w9Var = (w9) this.f30711c).W) != null) {
                    CharSequence s5 = w9Var.s(r9Var, false);
                    if (!((w9) this.f30711c).b()) {
                        findItem3.setVisible(false);
                    } else if (((w9) this.f30711c).j()) {
                        findItem3.setVisible(true);
                    } else {
                        w9 w9Var2 = (w9) this.f30711c;
                        if (!w9Var2.Z && (w9Var2.f32297u > 0 || w9Var2.v < s5.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((w9) this.f30711c) instanceof oi.h3);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    w9 w9Var3 = (w9) this.f30711c;
                    if (w9Var3 instanceof oi.h3) {
                        try {
                            v9 v9Var = w9Var3.C;
                            if (v9Var != null) {
                                context = v9Var.getContext();
                            } else {
                                context = org.telegram.messenger.t0.f26941b;
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
                w9 w9Var4 = (w9) this.f30711c;
                if (w9Var4.f32284k0 != null && w9Var4.r() != null) {
                    org.telegram.messenger.c6.d(((w9) this.f30711c).r().toString(), new f9(this, menu), new f9(this, menu), false);
                } else {
                    this.f30710b = null;
                    b(menu);
                }
                return true;
            default:
                return ((ActionMode.Callback) this.f30710b).onPrepareActionMode(actionMode, menu);
        }
    }

    public g9(w9 w9Var) {
        this.f30709a = 0;
        this.f30711c = w9Var;
        this.f30710b = null;
    }

    private final void a(ActionMode actionMode) {
    }
}
