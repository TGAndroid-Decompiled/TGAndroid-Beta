package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public class u51 extends org.telegram.ui.ActionBar.h3 {
    public final int f31088b;
    public final GradientDrawable f31089c;
    public final i61 d;
    public int e;

    public u51(Context context, org.telegram.ui.ActionBar.o2 o2Var, i61 i61Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        this.f31088b = AndroidUtilities.dp(12.0f);
        this.f31089c = new GradientDrawable();
        t51 t51Var = new t51(this, context);
        t51Var.addView(i61Var, w7.z5.c(-1.0f, -1));
        this.containerView = t51Var;
        this.d = i61Var;
        i61Var.setParentFragment(o2Var);
        i61Var.setOnScrollListener(new q51(this));
    }

    public static void m(u51 u51Var) {
        i61 i61Var = u51Var.d;
        if (i61Var.c()) {
            u51Var.e = i61Var.getContentTopOffset();
            u51Var.containerView.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21254h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        i61 i61Var = this.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i61Var.f27219a);
        notificationCenter.removeObserver(i61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(i61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i61 i61Var = this.d;
        Objects.requireNonNull(i61Var);
        z6 z6Var = new z6(i61Var, 7);
        x51 x51Var = i61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var.f33004a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var.f33005b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        h61 h61Var = i61Var.f27225s;
        y51 y51Var = i61Var.f27223n;
        h61Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, z6Var);
        arrayList.add(new org.telegram.ui.ActionBar.t6(y51Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.Qh));
        hg.e2 e2Var = i61Var.v;
        e2Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, z6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.t6(y51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(y51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(y51Var, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i10));
        ImageView imageView = e2Var.L;
        int i11 = org.telegram.ui.ActionBar.k6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(e2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i61Var.f27222f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i61Var.f27226w, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21254h5));
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
