package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.oa;
import org.telegram.ui.qm0;
import org.telegram.ui.sb;
import org.telegram.ui.un;
public final class n2 implements View.OnTouchListener {
    public final int f20611a;

    public n2(int i10) {
        this.f20611a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f20611a) {
            case 0:
                int i10 = z2.f21583h1;
                return true;
            case 1:
                return true;
            case 2:
                HashSet hashSet = org.telegram.ui.h4.f37647c1;
                return true;
            case 3:
                int i11 = jg.b1.f9894f;
                return true;
            case 4:
                int i12 = org.telegram.ui.Cells.b3.f21710x;
                return true;
            case 5:
                Paint paint = oa.H;
                return true;
            case 6:
                int i13 = sb.Q0;
                return true;
            case 7:
                int i14 = un.f41979bd;
                return true;
            case 8:
                return true;
            case 9:
                Pattern pattern = org.telegram.ui.Components.s4.f30174a;
                return true;
            case 10:
                w7 w7Var = w7.P2;
                return true;
            case 11:
                int i15 = ChatActivityEnterView.f23673s5;
                return true;
            case 12:
                int i16 = bi.E4;
                return true;
            case 13:
                int i17 = xj.f32579g0;
                return true;
            case 14:
                int i18 = bl.B0;
                return true;
            case 15:
                int i19 = dp.f25537c2;
                return true;
            case 16:
                hu huVar = hu.J1;
                return true;
            case 17:
                int i20 = xy.h;
                return true;
            case 18:
                int[] iArr = zc0.f33101i0;
                return true;
            case 19:
                int i21 = kh0.R;
                return true;
            case 20:
                int i22 = hn0.f26868a1;
                return true;
            case 21:
                int i23 = pp0.Q2;
                return true;
            case 22:
                int[] iArr2 = au0.f24493s2;
                return true;
            case 23:
                int i24 = dx0.f25609n2;
                return true;
            case 24:
                int i25 = u11.f30816e0;
                return true;
            case 25:
                int i26 = UndoView.f24238i0;
                return true;
            case 26:
                int i27 = UndoView.f24238i0;
                return true;
            case 27:
                int i28 = ei0.V1;
                return true;
            case 28:
                List list = qm0.f40810g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f33684b0;
                return true;
        }
    }
}
