package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.vm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a20;
import org.telegram.ui.fn0;
import org.telegram.ui.qt;
import org.telegram.ui.vl0;
import org.telegram.ui.vy;
import org.telegram.ui.w10;
import org.telegram.ui.yy;
public final class i1 implements View.OnTouchListener {
    public final int f21447a;
    public final Object f21448b;
    public final Object f21449c;

    public i1(int i10, Object obj, Object obj2) {
        this.f21447a = i10;
        this.f21448b = obj;
        this.f21449c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f21447a) {
            case 0:
                p1 p1Var = (p1) this.f21448b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f21449c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        p1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                b8 b8Var = (b8) this.f21448b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f21449c;
                if (motionEvent.getAction() == 0) {
                    c8 c8Var = b8Var.f25516n;
                    c8Var.E.r(c8Var.f25843n.T(xVar));
                    return false;
                }
                return false;
            case 2:
                return ov.m((ov) this.f21448b, (vm) this.f21449c, motionEvent);
            case 3:
                return ry0.a((ry0) this.f21448b, (org.telegram.ui.Components.k) this.f21449c, motionEvent);
            case 4:
                vy vyVar = (vy) this.f21448b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f21449c;
                vyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    yy yyVar = vyVar.d;
                    yyVar.f43732c.r(yyVar.f43731b.T(g4Var));
                    return false;
                }
                return false;
            case 5:
                a20 a20Var = (a20) this.f21448b;
                w10 w10Var = (w10) this.f21449c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = a20Var.f34996e;
                    filtersSetupActivity.f34119c.r(filtersSetupActivity.f34117a.T(w10Var));
                    return false;
                }
                return false;
            case 6:
                fn0 fn0Var = (fn0) this.f21448b;
                Context context = (Context) this.f21449c;
                int i15 = 0;
                if (fn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (intValue == 8) {
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i15 = 20;
                            i11 = 0;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                        }
                        boolean z4 = false;
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i14 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i12 = -1;
                            i13 = -1;
                            i14 = -1;
                        }
                        if (intValue == 8) {
                            z4 = true;
                        }
                        int i16 = i10;
                        int i17 = i12;
                        AlertDialog$Builder x10 = org.telegram.ui.Components.z4.x(context, i16, i15, i11, i17, i14, i13, string, z4, new e3.d(fn0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new vl0(0, fn0Var, editTextBoldCursor));
                        }
                        fn0Var.showDialog(x10.f21166a);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                return true;
            default:
                qh.i1 i1Var = (qh.i1) this.f21448b;
                return qt.q().s(motionEvent, i1Var.f45401b, (ag.h) this.f21449c, i1Var.f45404f, qh.y1.H(i1Var.f45406r));
        }
    }
}
