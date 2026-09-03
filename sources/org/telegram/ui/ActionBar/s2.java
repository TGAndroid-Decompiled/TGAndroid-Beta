package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.i9;
import org.telegram.ui.lo0;
import org.telegram.ui.pa;
import org.telegram.ui.sb;
import org.telegram.ui.sf1;
import org.telegram.ui.uj0;
import org.telegram.ui.xn;
public final class s2 implements View.OnTouchListener {
    public final int f22282a;

    public s2(int i10) {
        this.f22282a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f22282a) {
            case 0:
                int i10 = h3.f21419a;
                return true;
            case 1:
                return true;
            case 2:
                HashSet hashSet = org.telegram.ui.l4.Y0;
                return true;
            case 3:
                int i11 = i9.f37577e;
                return true;
            case 4:
                int i12 = org.telegram.ui.Cells.x2.f24391w;
                return true;
            case 5:
                Paint paint = pa.E;
                return true;
            case 6:
                int i13 = sb.U0;
                return true;
            case 7:
                int i14 = xn.Ec;
                return true;
            case 8:
                return true;
            case 9:
                Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                return true;
            case 10:
                c8 c8Var = c8.Q0;
                return true;
            case 11:
                int i15 = ChatActivityEnterView.f24570j5;
                return true;
            case 12:
                int i16 = mi.L2;
                return true;
            case 13:
                int i17 = jk.f28127d0;
                return true;
            case 14:
                int i18 = cl.B0;
                return true;
            case 15:
                int i19 = mp.f29208f0;
                return true;
            case 16:
                ru ruVar = ru.P;
                return true;
            case 17:
                int i20 = oz.h;
                return true;
            case 18:
                int[] iArr = xd0.U;
                return true;
            case 19:
                int i21 = ni0.O;
                return true;
            case 20:
                int i22 = do0.U0;
                return true;
            case 21:
                int i23 = lq0.X0;
                return true;
            case 22:
                int[] iArr2 = yu0.a2;
                return true;
            case 23:
                int i24 = xx0.f33219r0;
                return true;
            case 24:
                int i25 = UndoView.f25076b0;
                return true;
            case 25:
                int i26 = UndoView.f25076b0;
                return true;
            case 26:
                int i27 = uj0.f41852a0;
                return true;
            case 27:
                List list = lo0.f38705d1;
                return true;
            case 28:
                int i28 = PopupNotificationActivity.Y;
                return true;
            default:
                HashSet hashSet2 = sf1.f41187k1;
                return true;
        }
    }
}
