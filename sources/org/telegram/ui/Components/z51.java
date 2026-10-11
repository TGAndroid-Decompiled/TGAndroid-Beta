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
public class z51 extends org.telegram.ui.ActionBar.e3 {
    public final int f33415b;
    public final GradientDrawable f33416c;
    public final y51 d;
    public final n61 f33417e;
    public int f33418f;

    public z51(Context context, org.telegram.ui.ActionBar.m2 m2Var, n61 n61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        this.f33415b = AndroidUtilities.dp(12.0f);
        this.f33416c = new GradientDrawable();
        y51 y51Var = new y51(this, context);
        this.d = y51Var;
        y51Var.addView(n61Var, w7.x5.d(-1.0f, -1));
        this.containerView = y51Var;
        this.f33417e = n61Var;
        n61Var.setParentFragment(m2Var);
        n61Var.setOnScrollListener(new v51(this));
    }

    public static void o(z51 z51Var) {
        n61 n61Var = z51Var.f33417e;
        if (n61Var.c()) {
            z51Var.f33418f = n61Var.getContentTopOffset();
            z51Var.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        n61 n61Var = this.f33417e;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(n61Var.f28976a);
        notificationCenter.removeObserver(n61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(n61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        n61 n61Var = this.f33417e;
        Objects.requireNonNull(n61Var);
        a7 a7Var = new a7(n61Var, 10);
        c61 c61Var = n61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var.f26108a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.O5));
        ImageView imageView = c61Var.f26109b;
        int i10 = org.telegram.ui.ActionBar.h6.Q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c61Var.f26110c, 8, null, null, null, null, i10));
        ci.g2 g2Var = c61Var.f26111e;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.Mh));
        m61 m61Var = n61Var.f28983s;
        d61 d61Var = n61Var.f28981n;
        m61Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, d61Var, a7Var);
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var, 4, new Class[]{org.telegram.ui.Cells.q3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var, 0, new Class[]{org.telegram.ui.Cells.q3.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Qh));
        org.telegram.ui.Cells.v3.a(arrayList, d61Var);
        gg.f2 f2Var = n61Var.v;
        d61 d61Var2 = n61Var.f28981n;
        f2Var.getClass();
        org.telegram.ui.Cells.s3.a(arrayList, d61Var2, a7Var);
        int i11 = org.telegram.ui.ActionBar.h6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var2, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(d61Var2, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, i11));
        ImageView imageView2 = f2Var.L;
        int i12 = org.telegram.ui.ActionBar.h6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f2Var.M, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(n61Var.f28980f, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        FrameLayout frameLayout = n61Var.f28984w;
        int i13 = org.telegram.ui.ActionBar.h6.f20857h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayout, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
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
