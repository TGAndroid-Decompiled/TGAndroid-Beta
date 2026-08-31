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
public class r41 extends org.telegram.ui.ActionBar.h3 {
    public final int f30591b;
    public final GradientDrawable f30592c;
    public final q41 d;
    public final f51 f30593e;
    public int f30594f;

    public r41(Context context, org.telegram.ui.ActionBar.p2 p2Var, f51 f51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        this.f30591b = AndroidUtilities.dp(12.0f);
        this.f30592c = new GradientDrawable();
        q41 q41Var = new q41(this, context);
        this.d = q41Var;
        q41Var.addView(f51Var, k7.c6.c(-1.0f, -1));
        this.containerView = q41Var;
        this.f30593e = f51Var;
        f51Var.setParentFragment(p2Var);
        f51Var.setOnScrollListener(new o41(this));
    }

    public static void m(r41 r41Var) {
        f51 f51Var = r41Var.f30593e;
        if (f51Var.c()) {
            r41Var.f30594f = f51Var.getContentTopOffset();
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
        f51 f51Var = this.f30593e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(f51Var.f26757a);
        notificationCenter.removeObserver(f51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(f51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f51 f51Var = this.f30593e;
        Objects.requireNonNull(f51Var);
        t6 t6Var = new t6(f51Var, 10);
        u41 u41Var = f51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.m6(u41Var.f26963a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.O5));
        ImageView imageView = u41Var.f26964b;
        int i10 = org.telegram.ui.ActionBar.k6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(u41Var.f26965c, 8, null, null, null, null, i10));
        lg.f fVar = u41Var.f26966e;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.Mh));
        e51 e51Var = f51Var.f26764s;
        v41 v41Var = f51Var.f26762n;
        e51Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, v41Var, t6Var);
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var, 4, new Class[]{org.telegram.ui.Cells.p3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var, 0, new Class[]{org.telegram.ui.Cells.p3.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Qh));
        org.telegram.ui.Cells.u3.a(arrayList, v41Var);
        uf.m1 m1Var = f51Var.v;
        v41 v41Var2 = f51Var.f26762n;
        m1Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, v41Var2, t6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v41Var2, 8, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i11));
        ImageView imageView2 = m1Var.I;
        int i12 = org.telegram.ui.ActionBar.k6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(m1Var.J, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(f51Var.f26761f, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        FrameLayout frameLayout = f51Var.f26765w;
        int i13 = org.telegram.ui.ActionBar.k6.f21731h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }
}
