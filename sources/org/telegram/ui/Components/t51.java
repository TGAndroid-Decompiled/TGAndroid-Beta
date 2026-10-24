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
public class t51 extends org.telegram.ui.ActionBar.h3 {
    public final int f30733b;
    public final GradientDrawable f30734c;
    public final h61 d;
    public int e;

    public t51(Context context, org.telegram.ui.ActionBar.o2 o2Var, h61 h61Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        this.f30733b = AndroidUtilities.dp(12.0f);
        this.f30734c = new GradientDrawable();
        s51 s51Var = new s51(this, context);
        s51Var.addView(h61Var, w7.z5.c(-1.0f, -1));
        this.containerView = s51Var;
        this.d = h61Var;
        h61Var.setParentFragment(o2Var);
        h61Var.setOnScrollListener(new p51(this));
    }

    public static void m(t51 t51Var) {
        h61 h61Var = t51Var.d;
        if (h61Var.c()) {
            t51Var.e = h61Var.getContentTopOffset();
            t51Var.containerView.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21255h5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        h61 h61Var = this.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(h61Var.f26878a);
        notificationCenter.removeObserver(h61Var, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(h61Var, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h61 h61Var = this.d;
        Objects.requireNonNull(h61Var);
        x6 x6Var = new x6(h61Var, 7);
        w51 w51Var = h61Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w51Var.f32662a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(w51Var.f32663b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        g61 g61Var = h61Var.f26884s;
        x51 x51Var = h61Var.f26882n;
        g61Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var, 4, new Class[]{org.telegram.ui.Cells.o3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.Qh));
        hg.e2 e2Var = h61Var.v;
        e2Var.getClass();
        org.telegram.ui.Cells.r3.a(arrayList, x6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(x51Var, 8, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ve));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.Ue));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i10));
        ImageView imageView = e2Var.L;
        int i11 = org.telegram.ui.ActionBar.k6.Le;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(e2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h61Var.f26881f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h61Var.f26885w, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h5));
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
