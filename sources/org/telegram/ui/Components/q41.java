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
public class q41 extends org.telegram.ui.ActionBar.g3 {
    public final int f28066b;
    public final GradientDrawable f28067c;
    public final p41 d;
    public final e51 e;
    public int f28068f;

    public q41(Context context, org.telegram.ui.ActionBar.p2 p2Var, e51 e51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        this.f28066b = AndroidUtilities.dp(12.0f);
        this.f28067c = new GradientDrawable();
        p41 p41Var = new p41(this, context);
        this.d = p41Var;
        p41Var.addView(e51Var, k7.b6.c(-1.0f, -1));
        this.containerView = p41Var;
        this.e = e51Var;
        e51Var.setParentFragment(p2Var);
        e51Var.setOnScrollListener(new n41(this));
    }

    public static void m(q41 q41Var) {
        e51 e51Var = q41Var.e;
        if (e51Var.c()) {
            q41Var.f28068f = e51Var.getContentTopOffset();
            q41Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        e51 e51Var = this.e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(e51Var.f24479a);
        notificationCenter.removeObserver(e51Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(e51Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e51 e51Var = this.e;
        Objects.requireNonNull(e51Var);
        t6 t6Var = new t6(e51Var, 10);
        t41 t41Var = e51Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.l6(t41Var.f24325a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.O5));
        ImageView imageView = t41Var.f24326b;
        int i10 = org.telegram.ui.ActionBar.j6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(t41Var.f24327c, 8, null, null, null, null, i10));
        kg.f fVar = t41Var.e;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fVar, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fVar, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fVar, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Mh));
        d51 d51Var = e51Var.f24485s;
        u41 u41Var = e51Var.f24483n;
        d51Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, u41Var, t6Var);
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var, 0, new Class[]{org.telegram.ui.Cells.o3.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Qh));
        org.telegram.ui.Cells.t3.a(arrayList, u41Var);
        tf.m1 m1Var = e51Var.v;
        u41 u41Var2 = e51Var.f24483n;
        m1Var.getClass();
        org.telegram.ui.Cells.q3.a(arrayList, u41Var2, t6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var2, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var2, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(u41Var2, 8, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, i11));
        ImageView imageView2 = m1Var.I;
        int i12 = org.telegram.ui.ActionBar.j6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(m1Var.J, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e51Var.f24482f, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        FrameLayout frameLayout = e51Var.f24486w;
        int i13 = org.telegram.ui.ActionBar.j6.f19952h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
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
