package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public class r41 extends org.telegram.ui.ActionBar.g3 {
    public final int f27531b;
    public final GradientDrawable f27532c;
    public final q41 d;
    public final f51 e;
    public int f27533f;

    public r41(Context context, org.telegram.ui.ActionBar.o2 o2Var, f51 f51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.f27531b = AndroidUtilities.dp(12.0f);
        this.f27532c = new GradientDrawable();
        q41 q41Var = new q41(this, context);
        this.d = q41Var;
        q41Var.addView(f51Var, w7.x5.c(-1.0f, -1));
        this.containerView = q41Var;
        this.e = f51Var;
        f51Var.setParentFragment(o2Var);
        f51Var.setOnScrollListener(new o41(this));
    }

    public static void m(r41 r41Var) {
        f51 f51Var = r41Var.e;
        if (f51Var.c()) {
            r41Var.f27533f = f51Var.getContentTopOffset();
            r41Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        f51 f51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(f51Var.f23778a);
        notificationCenter.removeObserver(f51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(f51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f51 f51Var = this.e;
        Objects.requireNonNull(f51Var);
        w6 w6Var = new w6(f51Var, 10);
        u41 u41Var = f51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var.f29943a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        ImageView imageView = u41Var.f29944b;
        int i10 = org.telegram.ui.ActionBar.j6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var.f29945c, 8, null, null, null, null, i10));
        ci.h2 h2Var = u41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Mh));
        e51 e51Var = f51Var.f23784s;
        v41 v41Var = f51Var.f23782n;
        e51Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, v41Var, w6Var);
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19263z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.j6.f18984k0, null, null, org.telegram.ui.ActionBar.j6.f18863d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, v41Var);
        gg.g2 g2Var = f51Var.v;
        v41 v41Var2 = f51Var.f23782n;
        g2Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, v41Var2, w6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v41Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, w6Var, i11));
        ImageView imageView2 = g2Var.L;
        int i12 = org.telegram.ui.ActionBar.j6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(g2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(f51Var.f23781f, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        FrameLayout frameLayout = f51Var.f23785w;
        int i13 = org.telegram.ui.ActionBar.j6.f18933h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
