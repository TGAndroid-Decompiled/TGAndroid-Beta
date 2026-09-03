package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i implements Utilities.CallbackReturn {
    public final int f25527a;
    public final Object f25528b;
    public final Object f25529c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f25527a = i10;
        this.f25528b = obj;
        this.f25529c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f25527a) {
            case 0:
                final f0 f0Var = (f0) this.f25528b;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f25529c;
                Context context = (Context) this.d;
                d0 d0Var = (d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    p70 F = p70.F(f0Var.container, f6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z4;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f31200g0 = tL_aiComposeTone2;
                                    zVar.f31198e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.f31200g0.title);
                                    zVar.Y.setText(zVar.f31200g0.prompt);
                                    if (zVar.f31200g0.author_id != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zVar.f31194a0.a(z4, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f31197d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.f31203j0.N(false);
                                    zVar.f31202i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.kh(f0Var, tL_aiComposeTone, context, f6Var, 6), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new org.telegram.ui.np(6, f0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z4;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), f6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f31200g0 = tL_aiComposeTone2;
                                    zVar.f31198e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.f31200g0.title);
                                    zVar.Y.setText(zVar.f31200g0.prompt);
                                    if (zVar.f31200g0.author_id != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zVar.f31194a0.a(z4, false);
                                    zVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f31197d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.f31203j0.N(false);
                                    zVar.f31202i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, f6Var);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mg.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    });
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                View view = (View) obj;
                MessageObject messageObject = ((eh.h) this.d).f5604b;
                return eh.c.d(view, (String) this.f25528b, (String) this.f25529c, messageObject.getDocument(), messageObject);
            case 2:
                rl0 rl0Var = (rl0) this.f25528b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f25529c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != rl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    f2.l1 T = rl0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f5777f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                ph.c5 c5Var = (ph.c5) this.f25528b;
                boolean[] zArr = (boolean[]) this.f25529c;
                ph.l4 l4Var = (ph.l4) this.d;
                Integer num = (Integer) obj;
                ph.w4 w4Var = c5Var.O0;
                ph.q4 q4Var = c5Var.D1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    c5Var.L0(null, new ph.d4(c5Var, 0));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ph.ab.a(true, new ph.s1(2, c5Var, l4Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    l4Var.dismiss();
                    ph.da daVar = ((ph.h9) c5Var).f41755x2;
                    daVar.Z0.I.b(true);
                    daVar.w();
                    daVar.t(true);
                    daVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    ph.l6 l6Var = new ph.l6(c5Var.getContext(), false, null, new org.telegram.ui.web.a1(c5Var, 8), new nh.b());
                    l6Var.setOnDismissListener(new ph.a4(c5Var, 2));
                    l6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    c5Var.f41382i2 = true;
                    c5Var.d0(c5Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(c5Var.C1).isPremium()) {
                        try {
                            l4Var.container.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        new qc(l4Var.container, q4Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new ph.a4(c5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < w4Var.getChildCount(); i11++) {
                        if (w4Var.getChildAt(i11) instanceof dg.i1) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new qc(l4Var.container, q4Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    c5Var.K0(null);
                    l4Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
        }
    }
}
