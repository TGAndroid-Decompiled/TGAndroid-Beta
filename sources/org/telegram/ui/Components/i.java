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
    public final int f27671a;
    public final Object f27672b;
    public final Object f27673c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27671a = i10;
        this.f27672b = obj;
        this.f27673c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f27671a) {
            case 0:
                final f0 f0Var = (f0) this.f27672b;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f27673c;
                Context context = (Context) this.d;
                d0 d0Var = (d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.f26082e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    q70 F = q70.F(f0Var.container, g6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z4;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), g6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f33702g0 = tL_aiComposeTone2;
                                    zVar.f33700e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.f33702g0.title);
                                    zVar.Y.setText(zVar.f33702g0.prompt);
                                    if (zVar.f33702g0.author_id != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zVar.f33696a0.a(z4, false);
                                    zVar.f31015e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f33699d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.f33705j0.N(false);
                                    zVar.f33704i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, g6Var);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ng.w(26, f0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ih(f0Var, tL_aiComposeTone, context, g6Var, 6), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new org.telegram.ui.mp(5, f0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z4;
                            switch (r4) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    z zVar = new z(f0Var2.getContext(), g6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    zVar.f33702g0 = tL_aiComposeTone2;
                                    zVar.f33700e0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.X();
                                    zVar.X.setText(zVar.f33702g0.title);
                                    zVar.Y.setText(zVar.f33702g0.prompt);
                                    if (zVar.f33702g0.author_id != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zVar.f33696a0.a(z4, false);
                                    zVar.f31015e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    zVar.f33699d0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    zVar.W();
                                    zVar.f33705j0.N(false);
                                    zVar.f33704i0 = new e(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f0Var3.getContext(), 0, g6Var);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ng.w(26, f0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((fh.h) this.d).f6669b;
                return fh.c.d(view, (String) this.f27672b, (String) this.f27673c, messageObject.getDocument(), messageObject);
            case 2:
                sl0 sl0Var = (sl0) this.f27672b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f27673c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != sl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    f2.m1 T = sl0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f5879f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                qh.a5 a5Var = (qh.a5) this.f27672b;
                boolean[] zArr = (boolean[]) this.f27673c;
                qh.k4 k4Var = (qh.k4) this.d;
                Integer num = (Integer) obj;
                qh.v4 v4Var = a5Var.O0;
                qh.p4 p4Var = a5Var.D1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    a5Var.L0(null, new qh.c4(a5Var, 0));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    qh.xa.a(true, new org.telegram.ui.web.a2(3, a5Var, k4Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    k4Var.dismiss();
                    qh.ba baVar = ((qh.e9) a5Var).f45309x2;
                    baVar.Z0.I.b(true);
                    baVar.w();
                    baVar.t(true);
                    baVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    qh.i6 i6Var = new qh.i6(a5Var.getContext(), false, null, new org.telegram.ui.web.d1(a5Var, 8), new oh.b());
                    i6Var.setOnDismissListener(new qh.z3(a5Var, 2));
                    i6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    a5Var.f44938i2 = true;
                    a5Var.d0(a5Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(a5Var.C1).isPremium()) {
                        try {
                            k4Var.container.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        new qc(k4Var.container, p4Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new qh.z3(a5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < v4Var.getChildCount(); i11++) {
                        if (v4Var.getChildAt(i11) instanceof eg.g1) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new qc(k4Var.container, p4Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    a5Var.K0(null);
                    k4Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
        }
    }
}
